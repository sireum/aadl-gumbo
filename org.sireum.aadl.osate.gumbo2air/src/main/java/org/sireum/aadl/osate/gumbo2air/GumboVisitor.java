package org.sireum.aadl.osate.gumbo2air;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.EcoreUtil2;
import org.osate.aadl2.AadlPackage;
import org.osate.aadl2.Classifier;
import org.osate.aadl2.ComponentImplementation;
import org.osate.aadl2.ComponentType;
import org.osate.aadl2.DataClassifier;
import org.osate.aadl2.DataSubcomponent;
import org.osate.aadl2.DataSubcomponentType;
import org.osate.aadl2.Element;
import org.osate.aadl2.Port;
import org.osate.aadl2.ProcessSubcomponent;
import org.osate.aadl2.instance.ComponentInstance;
import org.sireum.Option;
import org.sireum.R;
import org.sireum.Z;
import org.sireum.aadl.gumbo.gumbo.AssumeStatement;
import org.sireum.aadl.gumbo.gumbo.BasicExp;
import org.sireum.aadl.gumbo.gumbo.BooleanLit;
import org.sireum.aadl.gumbo.gumbo.CaseStatementClause;
import org.sireum.aadl.gumbo.gumbo.Compute;
import org.sireum.aadl.gumbo.gumbo.DataElement;
import org.sireum.aadl.gumbo.gumbo.DataRefExpr;
import org.sireum.aadl.gumbo.gumbo.EnumLitExpr;
import org.sireum.aadl.gumbo.gumbo.Expr;
import org.sireum.aadl.gumbo.gumbo.GuaranteeStatement;
import org.sireum.aadl.gumbo.gumbo.GumboSubclause;
import org.sireum.aadl.gumbo.gumbo.HandlerClause;
import org.sireum.aadl.gumbo.gumbo.Initialize;
import org.sireum.aadl.gumbo.gumbo.InitializeSpecStatement;
import org.sireum.aadl.gumbo.gumbo.IntegerLit;
import org.sireum.aadl.gumbo.gumbo.Integration;
import org.sireum.aadl.gumbo.gumbo.InvSpec;
import org.sireum.aadl.gumbo.gumbo.OtherDataRef;
import org.sireum.aadl.gumbo.gumbo.RealLit;
import org.sireum.aadl.gumbo.gumbo.SlangLiteralInterp;
import org.sireum.aadl.gumbo.gumbo.SlangStringLit;
import org.sireum.aadl.gumbo.gumbo.SpecStatement;
import org.sireum.aadl.gumbo.gumbo.State;
import org.sireum.aadl.gumbo.gumbo.StateVarDecl;
import org.sireum.aadl.gumbo.gumbo.UnaryExp;
import org.sireum.aadl.gumbo.gumbo.util.GumboSwitch;
import org.sireum.aadl.osate.architecture.AnnexVisitor;
import org.sireum.aadl.osate.architecture.Visitor;
import org.sireum.aadl.osate.architecture.VisitorUtil;
import org.sireum.aadl.osate.gumbo2air.GumboUtils.UnaryOp;
import org.sireum.aadl.osate.util.SlangUtils;
import org.sireum.hamr.ir.Annex;
import org.sireum.hamr.ir.Annex$;
import org.sireum.hamr.ir.AnnexLib;
import org.sireum.hamr.ir.GclAssume$;
import org.sireum.hamr.ir.GclCaseStatement;
import org.sireum.hamr.ir.GclCaseStatement$;
import org.sireum.hamr.ir.GclCompute;
import org.sireum.hamr.ir.GclCompute$;
import org.sireum.hamr.ir.GclGuarantee;
import org.sireum.hamr.ir.GclGuarantee$;
import org.sireum.hamr.ir.GclHandle;
import org.sireum.hamr.ir.GclHandle$;
import org.sireum.hamr.ir.GclInitialize;
import org.sireum.hamr.ir.GclInitialize$;
import org.sireum.hamr.ir.GclIntegration;
import org.sireum.hamr.ir.GclIntegration$;
import org.sireum.hamr.ir.GclInvariant;
import org.sireum.hamr.ir.GclInvariant$;
import org.sireum.hamr.ir.GclSpec;
import org.sireum.hamr.ir.GclStateVar;
import org.sireum.hamr.ir.GclStateVar$;
import org.sireum.hamr.ir.GclSubclause$;
import org.sireum.lang.ast.Exp;
import org.sireum.lang.ast.Exp.Binary;
import org.sireum.lang.ast.Exp.Binary$;
import org.sireum.lang.ast.Exp.Ident;
import org.sireum.lang.ast.Exp.Ident$;
import org.sireum.lang.ast.Exp.If;
import org.sireum.lang.ast.Exp.If$;
import org.sireum.lang.ast.Exp.LitB$;
import org.sireum.lang.ast.Exp.LitR$;
import org.sireum.lang.ast.Exp.LitString;
import org.sireum.lang.ast.Exp.LitString$;
import org.sireum.lang.ast.Exp.LitZ$;
import org.sireum.lang.ast.Exp.Select;
import org.sireum.lang.ast.Exp.Select$;
import org.sireum.lang.ast.Exp.StringInterpolate$;
import org.sireum.lang.ast.Exp.Unary;
import org.sireum.lang.ast.Exp.Unary$;
import org.sireum.lang.ast.Id;
import org.sireum.lang.ast.Id$;
import org.sireum.message.Position;

public class GumboVisitor extends GumboSwitch<Boolean> implements AnnexVisitor {

	Visitor v;
	Classifier entryClassifier = null;

	private boolean TODO_HALT = true;

	private final String ANNEX_TYPE = "gumbo";
	private List<String> path = null;

	public GumboVisitor(Visitor v) {
		this.v = v;
	}

	@Override
	public List<Annex> visit(ComponentInstance ci, List<String> currentPath) {
		return visit(ci.getComponentClassifier(), currentPath);
	}

	@Override
	public List<Annex> visit(Classifier c, List<String> path) {
		List<Annex> ret = new ArrayList<>();

		List<GumboSubclause> bas = EcoreUtil2.eAllOfType(c, GumboSubclause.class);
		if (c instanceof ComponentImplementation) {
			ComponentImplementation ci = (ComponentImplementation) c;
			bas.addAll(EcoreUtil2.eAllOfType(ci.getType(), GumboSubclause.class));
		}

		// TODO: change to reporter
		assert bas.size() <= 1
				: "Expecting at most one Gumbo clause for " + c.getFullName() + " but found " + bas.size();

		if (bas.size() == 1) {
			this.path = path;

			entryClassifier = c;

			addAllBaseTypes(c.eResource().getResourceSet());

			visit(bas.get(0));

			ret.add(Annex$.MODULE$.apply(ANNEX_TYPE, pop()));

			entryClassifier = null;
		}

		return ret;
	}

	private void addAllBaseTypes(ResourceSet rs) {
		URI u = URI.createURI("platform:/plugin/org.osate.contribution.sei/resources/packages/Base_Types.aadl");
		Resource r = rs.getResource(u, true);
		AadlPackage baseTypes = (AadlPackage) r.getContents().get(0);
		for (org.osate.aadl2.Classifier c : baseTypes.getOwnedPublicSection().getOwnedClassifiers()) {
			if (!c.getName().equals("Natural")) {
				v.processDataType((DataClassifier) c);
			}
		}
	}

	@Override
	public Boolean caseGumboSubclause(GumboSubclause object) {
		List<GclStateVar> _state = new ArrayList<>();
		if (object.getSpecs().getState() != null) {
			State s = object.getSpecs().getState();
			for (StateVarDecl svd : s.getDecls()) {
				visit(svd);
				_state.add(pop());
			}
		}

		List<GclInvariant> _invariants = new ArrayList<>();
		if (object.getSpecs().getInvariants() != null) {
			for (InvSpec s : object.getSpecs().getInvariants().getSpecs()) {
				java.lang.String id = s.getId();

				Option<org.sireum.String> descriptor = GumboUtils.getOptionalSlangString(s.getDescriptor());

				visit(s.getExpr());

				_invariants.add(GclInvariant$.MODULE$.apply(id, descriptor, pop()));
			}
		}

		Option<GclIntegration> _integration = SlangUtils.toNone();
		if (object.getSpecs().getIntegration() != null) {
			visit(object.getSpecs().getIntegration());
			_integration = SlangUtils.toSome(pop());
		}

		Option<GclInitialize> _initializes = SlangUtils.toNone();
		if (object.getSpecs().getInitialize() != null) {

			Initialize i = object.getSpecs().getInitialize();
			List<Exp> modifies = new ArrayList<>();
			if (i.getModifies() != null) {
				for (Expr e : i.getModifies().getExprs()) {
					visit(e);
					modifies.add(pop());
				}
			}

			List<GclGuarantee> guarantees = new ArrayList<>();
			for (InitializeSpecStatement iss : i.getSpecs()) {
				visit(iss.getGuaranteeStatement());
				guarantees.add(pop());
			}

			_initializes = SlangUtils
					.toSome(GclInitialize$.MODULE$.apply(VisitorUtil.toISZ(modifies), VisitorUtil.toISZ(guarantees)));
		}

		Option<GclCompute> _compute = SlangUtils.toNone();
		if (object.getSpecs().getCompute() != null) {
			visit(object.getSpecs().getCompute());
			_compute = SlangUtils.toSome(pop());
		}

		push(GclSubclause$.MODULE$.apply(VisitorUtil.toISZ(_state), VisitorUtil.toISZ(_invariants), _initializes,
				_integration, _compute));

		return false;
	}

	@Override
	public Boolean caseCompute(Compute object) {

		List<Exp> modifies = new ArrayList<>();
		for (Expr e : object.getModifies().getExprs()) {
			visit(e);
			modifies.add(pop());
		}

		List<GclHandle> handlers = new ArrayList<>();
		for (HandlerClause hc : object.getHandlers()) {
			visit(hc);
			handlers.add(pop());
		}

		List<GclCaseStatement> caseStatements = new ArrayList<>();
		for (CaseStatementClause css : object.getCases()) {

			java.lang.String id = css.getId();

			Option<org.sireum.String> descriptor = GumboUtils.getOptionalSlangString(css.getDescriptor());

			visit(css.getAssumeStatement().getExpr());
			Exp assumes = pop();

			visit(css.getGuaranteeStatement().getExpr());
			Exp guarantees = pop();

			caseStatements.add(GclCaseStatement$.MODULE$.apply(id, descriptor, assumes, guarantees));
		}

		push(GclCompute$.MODULE$.apply(VisitorUtil.toISZ(modifies), VisitorUtil.toISZ(caseStatements),
				VisitorUtil.toISZ(handlers)));

		return false;
	}

	@Override
	public Boolean caseHandlerClause(HandlerClause object) {

		Option<Position> clausePos = GumboUtils.buildPosInfo(object);

		Port p = object.getId();

		org.sireum.lang.ast.Id portId = Id$.MODULE$.apply(p.getName(),
				GumboUtils.buildAttr(GumboUtils.shrinkPos(clausePos, p.getName().length())));

		Ident slangExp = Ident$.MODULE$.apply(portId,
				GumboUtils.buildResolvedAttr(GumboUtils.shrinkPos(clausePos, p.getName().length())));

		List<Exp> modifies = new ArrayList<>();
		if (object.getModifies() != null) {
			for (Expr e : object.getModifies().getExprs()) {
				visit(e);
				modifies.add(pop());
			}
		}

		List<GclGuarantee> guarantees = new ArrayList<>();
		for (GuaranteeStatement gs : object.getGuarantees()) {
			visit(gs);
			guarantees.add(pop());
		}

		push(GclHandle$.MODULE$.apply(slangExp, VisitorUtil.toISZ(modifies), VisitorUtil.toISZ(guarantees)));

		return false;
	}

	@Override
	public Boolean caseIntegration(Integration object) {
		List<GclSpec> specs = new ArrayList<>();
		for (SpecStatement spec : object.getSpecs()) {
			visit(spec);
			specs.add(pop());
		}

		push(GclIntegration$.MODULE$.apply(VisitorUtil.toISZ(specs)));

		return false;
	}

	@Override
	public Boolean caseStateVarDecl(StateVarDecl object) {
		String name = object.getName();
		DataSubcomponentType t = object.getTypeName();

		push(GclStateVar$.MODULE$.apply(name, t.getQualifiedName()));

		return false;
	}

	@Override
	public Boolean caseAssumeStatement(AssumeStatement object) {
		java.lang.String id = object.getId();

		Option<org.sireum.String> descriptor = GumboUtils.getOptionalSlangString(object.getDescriptor());

		visit(object.getExpr());

		push(GclAssume$.MODULE$.apply(id, descriptor, pop()));

		return false;
	}

	@Override
	public Boolean caseGuaranteeStatement(GuaranteeStatement object) {
		java.lang.String id = object.getId();

		Option<org.sireum.String> descriptor = GumboUtils.getOptionalSlangString(object.getDescriptor());

		visit(object.getExpr());

		push(GclGuarantee$.MODULE$.apply(id, descriptor, pop()));

		return false;
	}

	@Override
	public Boolean caseBasicExp(BasicExp object) {

		if (object.getThenExpr() != null) {
			assert object.getTerms().size() == 1;
			assert object.getOps().isEmpty();

			visit(object.getTerms().get(0));
			Exp condExp = pop();

			visit(object.getThenExpr());
			Exp thenExp = pop();

			visit(object.getElseExpr());
			Exp elseExp = pop();

			If ifexp = If$.MODULE$.apply(condExp, thenExp, elseExp, GumboUtils.buildTypedAttr(object));
			push(ifexp);

		} else {
			assert object.getTerms().size() == object.getOps().size() + 1 : "There are " + object.getOps().size()
					+ " operators but " + object.getTerms().size() + " expressions";

			Stack<Exp> exps = new Stack<>();
			for (Expr e : object.getTerms()) {
				visit(e);
				exps.add(0, pop());
			}

			if (exps.size() > 1) {
				// TODO: rewrite tree based on operator precedence, for now use paren exp
				int i = 0;
				while (exps.size() > 1) {
					Exp lhs = exps.pop();
					Exp rhs = exps.pop();
					String op = GumboUtils.toSlangBinaryOp(object.getOps().get(i++));
					Option<Position> optPos = GumboUtils.mergePositions(lhs.posOpt(), rhs.posOpt());
					Binary b = Binary$.MODULE$.apply(lhs, op, rhs, GumboUtils.buildResolvedAttr(optPos));
					exps.push(b);
				}
			}

			assert exps.size() == 1;
			push(exps.get(0));
		}

		return false;
	}

	@Override
	public Boolean caseUnaryExp(UnaryExp object) {
		visit(object.getAccessExp());

		UnaryOp slangOp = GumboUtils.toSlangUnaryOp(object.getOp());
		Unary exp = Unary$.MODULE$.apply(Exp.UnaryOp$.MODULE$.byName(slangOp.name()).get(), pop(),
				GumboUtils.buildResolvedAttr(object));

		push(exp);

		return false;
	}

	@Override
	public Boolean caseDataRefExpr(DataRefExpr object) {
		EObject receiver = object.getPortOrSubcomponentOrStateVar();

		Id slangId = null;

		Option<Position> selectPos = GumboUtils.buildPosInfo(object);

		if (receiver instanceof DataSubcomponent) {
			DataSubcomponent ds = (DataSubcomponent) receiver;

			ComponentType ct = ds.getComponentType();
			Element owner = ds.getOwner();

			if (owner != entryClassifier) {
				todo(object, "Probably not dealing with a data component");

			} else {
				slangId = Id$.MODULE$.apply(ds.getName(),
						GumboUtils.buildAttr(GumboUtils.shrinkPos(selectPos, ds.getName().length())));
			}
		} else if (receiver instanceof ProcessSubcomponent) {
			ProcessSubcomponent psc = (ProcessSubcomponent) receiver;

			slangId = Id$.MODULE$.apply(psc.getName(),
					GumboUtils.buildAttr(GumboUtils.shrinkPos(selectPos, psc.getName().length())));

		} else if (receiver instanceof Port) {
			Port p = (Port) receiver;

			slangId = Id$.MODULE$.apply(p.getName(),
					GumboUtils.buildAttr(GumboUtils.shrinkPos(selectPos, p.getName().length())));

		} else if (receiver instanceof StateVarDecl) {
			StateVarDecl svd = (StateVarDecl) receiver;

			slangId = Id$.MODULE$.apply(svd.getName(),
					GumboUtils.buildAttr(GumboUtils.shrinkPos(selectPos, svd.getName().length())));
		} else {
			// FIXME: can invoke HAMR even if there are syntax errors in gumbo annexes. OSATE is likely
			// showing the error. Use reporter instead?

			String s = "<invalid>";
			slangId = Id$.MODULE$.apply(s, GumboUtils.buildAttr(selectPos));

			Ident slangExp = Ident$.MODULE$.apply(slangId, GumboUtils.buildResolvedAttr(object));

			push(slangExp);

			return false;
		}

		if (object.getRef() != null) {
			OtherDataRef ref = object.getRef();
			String attName = ref.getNamedElement().getName();

			if (attName == null) {
				// FIXME: can still invoke HAMR when selector is invalid. OSATE is likely
				// showing the error. For now use a string that can't appear in an id.
				// Maybe use reporter instead.
				attName = "<invalid>";
			}

			Stack<Object> names = new Stack<>();
			names.push(Id$.MODULE$.apply(attName, GumboUtils.buildAttr(ref)));
			names.push(slangId);

			ref = ref.getPath();

			while (ref != null) {
				attName = ref.getNamedElement().getName();

				names.add(0, Id$.MODULE$.apply(attName, GumboUtils.buildAttr(ref)));

				ref = ref.getPath();
			}

			while (names.size() > 1) {
				Object a = names.pop();
				Id b = (Id) names.pop();

				if (a instanceof Id) {
					Id aAsId = (Id) a;
					Option<Position> optPos = GumboUtils.mergePositions(aAsId.getAttr().getPosOpt(),
							b.attr().getPosOpt());
					Ident ident = Ident$.MODULE$.apply(aAsId,
							GumboUtils.buildResolvedAttr(aAsId.getAttr().getPosOpt()));
					names.push(Select$.MODULE$.apply(SlangUtils.toSome(ident), b, VisitorUtil.toISZ(),
							GumboUtils.buildResolvedAttr(optPos)));
				} else {
					Select aAsSelect = (Select) a;
					Option<Position> optPos = GumboUtils.mergePositions(aAsSelect.getAttr().getPosOpt(),
							b.attr().getPosOpt());
					names.push(Select$.MODULE$.apply(SlangUtils.toSome((Select) a), b, VisitorUtil.toISZ(),
							GumboUtils.buildResolvedAttr(optPos)));
				}
			}

			Select slangExp = (Select) names.pop();

			push(slangExp);

		} else {

			Ident slangExp = Ident$.MODULE$.apply(slangId, GumboUtils.buildResolvedAttr(object));

			push(slangExp);
		}

		return false;
	}

	@Override
	public Boolean caseBooleanLit(BooleanLit object) {

		Boolean b = object.getValue().equalsIgnoreCase("t"); // only other option if F

		push(LitB$.MODULE$.apply(b, GumboUtils.buildAttr(object)));

		return false;
	}

	@Override
	public Boolean caseIntegerLit(IntegerLit object) {

		Option<Z> z = Z.apply(object.getValue());
		assert z.nonEmpty() : "Not a valid Z: " + object.getValue(); // TODO pass in reporter instead

		Exp slangExp = LitZ$.MODULE$.apply(z.get(), GumboUtils.buildAttr(object));

		push(slangExp);

		return false;
	}

	@Override
	public Boolean caseRealLit(RealLit object) {

		Option<R> r = R.apply(object.getValue());
		assert r.nonEmpty() : "Not a valid R: " + object.getValue(); // TODO pass in reporter instead

		Exp slangExp = LitR$.MODULE$.apply(r.get().value(), GumboUtils.buildAttr(object));

		push(slangExp);

		return false;
	}

	@Override
	public Boolean caseSlangStringLit(SlangStringLit object) {

		push(Exp.LitString$.MODULE$.apply(GumboUtils.getSlangString(object.getValue()).string(),
				GumboUtils.buildAttr(object)));

		return false;
	}

	@Override
	public Boolean caseEnumLitExpr(EnumLitExpr object) {

		DataElement de = object.getEnumType();
		String name = de.getDataElement().getName();

		Option<Position> selectPos = GumboUtils.buildPosInfo(object);

		Option<Position> enumPos = GumboUtils.shrinkPos(selectPos, name.length());
		Id slangEnumId = Id$.MODULE$.apply(name, GumboUtils.buildAttr(enumPos));
		Ident slangIdent = Ident$.MODULE$.apply(slangEnumId, GumboUtils.buildResolvedAttr(enumPos));

		Id slangEnumValue = Id$.MODULE$.apply(object.getValue().getValue(), GumboUtils.buildAttr(object.getValue()));

		Select slangSelect = Select$.MODULE$.apply(SlangUtils.toSome(slangIdent), slangEnumValue, VisitorUtil.toISZ(),
				GumboUtils.buildResolvedAttr(selectPos));

		push(slangSelect);

		return false;
	}

	@Override
	public Boolean caseSlangLiteralInterp(SlangLiteralInterp object) {

		String[] parts = object.getSli().split("\"");

		switch (parts[0]) {
		case "c":
			assert parts[1].length() == 1;

			int c = parts[1].charAt(0);
			push(Exp.LitC$.MODULE$.apply(c, GumboUtils.buildAttr(object)));

			break;
		case "string":
			push(Exp.LitString$.MODULE$.apply(parts[1], GumboUtils.buildAttr(object)));

			break;
		case "f32":
			float f32 = Float.parseFloat(parts[1]);
			push(Exp.LitF32$.MODULE$.apply(f32, GumboUtils.buildAttr(object)));

			break;
		case "f64":
			double f64 = Double.parseDouble(parts[1]);
			push(Exp.LitF64$.MODULE$.apply(f64, GumboUtils.buildAttr(object)));

			break;
		case "r":
			scala.math.BigDecimal r = new scala.math.BigDecimal(new java.math.BigDecimal(parts[1]));
			push(Exp.LitR$.MODULE$.apply(r, GumboUtils.buildAttr(object)));

			break;
		case "z":
			Z z = Z.apply(parts[1]).get();
			push(Exp.LitZ$.MODULE$.apply(z, GumboUtils.buildAttr(object)));

			break;
		default:

			LitString lit = LitString$.MODULE$.apply(parts[1], GumboUtils.buildAttr(object));

			Exp slangExp = StringInterpolate$.MODULE$.apply(parts[0], VisitorUtil.toISZ(lit), VisitorUtil.toISZ(),
					GumboUtils.buildTypedAttr(object));

			push(slangExp);

			break;
		}

		return false;
	}

	public Boolean visit(EObject o) {
		assert isSwitchFor(o.eClass().getEPackage()) : "Not a switch for " + o;
		return doSwitch(o);
	}

	@Override
	public Boolean defaultCase(EObject o) {
		for (EObject child : o.eContents()) {
			visit(child);
		}
		return null;
	}

	Object result = null;

	void push(Object o) {
		assert result == null : "Stack not empty: " + result;
		result = o;
	}

	@SuppressWarnings("unchecked")
	<T> T pop() {
		assert result != null : "Stack is empty";
		T ret = (T) result;
		result = null;
		return ret;
	}

	private void todo(Object o, String msg) {
		RuntimeException e = new RuntimeException(msg + ": " + o);

		if (TODO_HALT) {
			throw e;
		} else {
			StackTraceElement ste = e.getStackTrace()[1];

			System.err.println(e.getMessage() + ": " + ste);
		}
	}

	@Override
	public List<AnnexLib> buildAnnexLibraries(Element arg0) {
		return VisitorUtil.iList();
	}
}
