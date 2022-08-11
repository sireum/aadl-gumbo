package org.sireum.aadl.osate.gumbo2air;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.EcoreUtil2;
import org.osate.aadl2.AadlPackage;
import org.osate.aadl2.AnnexLibrary;
import org.osate.aadl2.Classifier;
import org.osate.aadl2.ComponentImplementation;
import org.osate.aadl2.ComponentType;
import org.osate.aadl2.DataClassifier;
import org.osate.aadl2.DataSubcomponent;
import org.osate.aadl2.DataSubcomponentType;
import org.osate.aadl2.Element;
import org.osate.aadl2.ModelUnit;
import org.osate.aadl2.Port;
import org.osate.aadl2.ProcessSubcomponent;
import org.osate.aadl2.instance.ComponentInstance;
import org.osate.aadl2.modelsupport.util.AadlUtil;
import org.osate.annexsupport.AnnexUtil;
import org.sireum.Option;
import org.sireum.R;
import org.sireum.Z;
import org.sireum.aadl.gumbo.gumbo.AssumeStatement;
import org.sireum.aadl.gumbo.gumbo.BasicExp;
import org.sireum.aadl.gumbo.gumbo.BooleanLit;
import org.sireum.aadl.gumbo.gumbo.CallExpr;
import org.sireum.aadl.gumbo.gumbo.CaseStatementClause;
import org.sireum.aadl.gumbo.gumbo.Compute;
import org.sireum.aadl.gumbo.gumbo.DataRefExpr;
import org.sireum.aadl.gumbo.gumbo.EnumLitExpr;
import org.sireum.aadl.gumbo.gumbo.Expr;
import org.sireum.aadl.gumbo.gumbo.FuncSpec;
import org.sireum.aadl.gumbo.gumbo.GuaranteeStatement;
import org.sireum.aadl.gumbo.gumbo.GumboLibrary;
import org.sireum.aadl.gumbo.gumbo.GumboPackage;
import org.sireum.aadl.gumbo.gumbo.GumboSubclause;
import org.sireum.aadl.gumbo.gumbo.HandlerClause;
import org.sireum.aadl.gumbo.gumbo.IfElseExp;
import org.sireum.aadl.gumbo.gumbo.InStateExpr;
import org.sireum.aadl.gumbo.gumbo.Initialize;
import org.sireum.aadl.gumbo.gumbo.InitializeSpecStatement;
import org.sireum.aadl.gumbo.gumbo.IntegerLit;
import org.sireum.aadl.gumbo.gumbo.Integration;
import org.sireum.aadl.gumbo.gumbo.InvSpec;
import org.sireum.aadl.gumbo.gumbo.MaySendExpr;
import org.sireum.aadl.gumbo.gumbo.MustSendExpr;
import org.sireum.aadl.gumbo.gumbo.NoSendExpr;
import org.sireum.aadl.gumbo.gumbo.OtherDataRef;
import org.sireum.aadl.gumbo.gumbo.RealLit;
import org.sireum.aadl.gumbo.gumbo.ResultLit;
import org.sireum.aadl.gumbo.gumbo.SlangAccess;
import org.sireum.aadl.gumbo.gumbo.SlangCallArgs;
import org.sireum.aadl.gumbo.gumbo.SlangDefDef;
import org.sireum.aadl.gumbo.gumbo.SlangDefParam;
import org.sireum.aadl.gumbo.gumbo.SlangLiteralInterp;
import org.sireum.aadl.gumbo.gumbo.SlangStringLit;
import org.sireum.aadl.gumbo.gumbo.SlangTypeParam;
import org.sireum.aadl.gumbo.gumbo.SpecStatement;
import org.sireum.aadl.gumbo.gumbo.State;
import org.sireum.aadl.gumbo.gumbo.StateVarDecl;
import org.sireum.aadl.gumbo.gumbo.UnaryExp;
import org.sireum.aadl.gumbo.gumbo.util.GumboSwitch;
import org.sireum.aadl.osate.architecture.AnnexVisitor;
import org.sireum.aadl.osate.architecture.Visitor;
import org.sireum.aadl.osate.gumbo2air.GumboUtil.UnaryOp;
import org.sireum.aadl.osate.util.SlangUtil;
import org.sireum.aadl.osate.util.VisitorUtil;
import org.sireum.hamr.ir.Annex;
import org.sireum.hamr.ir.Annex$;
import org.sireum.hamr.ir.AnnexLib;
import org.sireum.hamr.ir.GclAssume$;
import org.sireum.hamr.ir.GclCaseStatement;
import org.sireum.hamr.ir.GclCaseStatement$;
import org.sireum.hamr.ir.GclCompute;
import org.sireum.hamr.ir.GclCompute$;
import org.sireum.hamr.ir.GclComputeSpec;
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
import org.sireum.hamr.ir.GclLib$;
import org.sireum.hamr.ir.GclMethod;
import org.sireum.hamr.ir.GclMethod$;
import org.sireum.hamr.ir.GclSpec;
import org.sireum.hamr.ir.GclStateVar;
import org.sireum.hamr.ir.GclStateVar$;
import org.sireum.hamr.ir.GclSubclause$;
import org.sireum.lang.ast.Body;
import org.sireum.lang.ast.Body$;
import org.sireum.lang.ast.Exp;
import org.sireum.lang.ast.Exp.Binary;
import org.sireum.lang.ast.Exp.Binary$;
import org.sireum.lang.ast.Exp.Ident;
import org.sireum.lang.ast.Exp.Ident$;
import org.sireum.lang.ast.Exp.If;
import org.sireum.lang.ast.Exp.If$;
import org.sireum.lang.ast.Exp.Input;
import org.sireum.lang.ast.Exp.Input$;
import org.sireum.lang.ast.Exp.Invoke;
import org.sireum.lang.ast.Exp.Invoke$;
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
import org.sireum.lang.ast.MethodContract;
import org.sireum.lang.ast.MethodContract.Accesses;
import org.sireum.lang.ast.MethodContract.Accesses$;
import org.sireum.lang.ast.MethodContract.Claims;
import org.sireum.lang.ast.MethodContract.Claims$;
import org.sireum.lang.ast.MethodContract.Simple$;
import org.sireum.lang.ast.MethodSig;
import org.sireum.lang.ast.MethodSig$;
import org.sireum.lang.ast.Param;
import org.sireum.lang.ast.Param$;
import org.sireum.lang.ast.Purity;
import org.sireum.lang.ast.Purity$;
import org.sireum.lang.ast.Stmt;
import org.sireum.lang.ast.Stmt.Method;
import org.sireum.lang.ast.Stmt.Method$;
import org.sireum.lang.ast.Type;
import org.sireum.lang.ast.TypeParam;
import org.sireum.lang.ast.TypeParam$;
import org.sireum.lang.ast.Typed;
import org.sireum.lang.ast.TypedAttr;
import org.sireum.message.Position;
import org.sireum.message.Reporter;

public class GumboVisitor extends GumboSwitch<Boolean> implements AnnexVisitor {
	Reporter reporter;

	Visitor v;
	Classifier entryClassifier = null;

	private boolean TODO_HALT = true;

	private final String ANNEX_TYPE = "gumbo";
	private List<String> path = null;

	public GumboVisitor(Visitor v) {
		this.v = v;
	}

	@Override
	public String getVisitorName() {
		return "GUMBO Visitor";
	}

	@Override
	public List<String> getHandledAnnexes() {
		return VisitorUtil.toIList(ANNEX_TYPE);
	}

	List<ComponentImplementation> getAllComponentImpl(ResourceSet rs) {
		// the following doesn't work from the command line so replicating its behavior
		// by walking over the resource set directly
		// return AadlUtil.getAllComponentImpl();

		List<ComponentImplementation> result = new BasicEList<>();
		for (Resource r : rs.getResources()) {
			EObject o = r.getContents().get(0);
			if (o instanceof AadlPackage) {
				result.addAll(AadlUtil.getAllComponentImpl((AadlPackage) o));
			}
		}
		return result;
	}

	@Override
	public List<AnnexLib> buildAnnexLibraries(Element e, Reporter reporter) {
		this.reporter = reporter;
		List<AnnexLib> ret = new ArrayList<>();

		List<ComponentImplementation> ais = getAllComponentImpl(e.eResource().getResourceSet());

		List<ModelUnit> aps = new ArrayList<>(ais.stream()
				.flatMap(it -> AadlUtil.getContainingPackage(it).getPublicSection().getImportedUnits().stream())
				.collect(Collectors.toSet()));

		// enforce an ordering just in case streams don't have fixed ordering under all jvms
		Collections.sort(aps, (o1, o2) -> o1.qualifiedName() == null ? 1 //
				: o2.qualifiedName() == null ? -1 : //
						o1.qualifiedName().compareTo(o2.qualifiedName()));

		Set<String> seenComponents = new java.util.HashSet<>();
		for (ModelUnit mu : aps) {

			if (mu != null && mu instanceof AadlPackage) {

				AadlPackage parent = (AadlPackage) mu;
				List<AnnexLibrary> gals = AnnexUtil.getAllActualAnnexLibraries(parent,
						GumboPackage.eINSTANCE.getGumboLibrary());

				if (!gals.isEmpty() && !seenComponents.contains(parent.getQualifiedName())) {

					addAllBaseTypes(e.eResource().getResourceSet());

					seenComponents.add(parent.getQualifiedName());
					reportError(gals.size() == 1, mu,
							"Found multiple " + ANNEX_TYPE + " library annex clauses. AADL should disallow this");

					GumboLibrary gl = (GumboLibrary) gals.get(0);

					visit(gl);

					List<GclMethod> methods = pop();

					List<org.sireum.String> segs = new ArrayList<>();
					for (String seg : parent.getQualifiedName().split("::")) {
						segs.add(new org.sireum.String(seg));
					}

					org.sireum.hamr.ir.Name containingPackage = org.sireum.hamr.ir.Name$.MODULE$
							.apply(VisitorUtil.toISZ(segs), SlangUtil.toNone());

					ret.add(GclLib$.MODULE$.apply(containingPackage, VisitorUtil.toISZ(methods)));
				}
			}
		}

		return ret;
	}

	@Override
	public List<Annex> visit(ComponentInstance ci, List<String> currentPath, Reporter reporter) {
		return visit(ci.getComponentClassifier(), currentPath, reporter);
	}

	@Override
	public List<Annex> visit(Classifier c, List<String> path, Reporter reporter) {
		this.reporter = reporter;

		List<Annex> ret = new ArrayList<>();

		List<GumboSubclause> bas = EcoreUtil2.eAllOfType(c, GumboSubclause.class);
		if (c instanceof ComponentImplementation) {
			ComponentImplementation ci = (ComponentImplementation) c;
			bas.addAll(EcoreUtil2.eAllOfType(ci.getType(), GumboSubclause.class));
		}

		reportError(bas.size() <= 1, c, "Only one " + ANNEX_TYPE + " subclause annex is allowed per component");

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
	public Boolean caseGumboLibrary(GumboLibrary object) {
		List<GclMethod> ret = new ArrayList<>();
		if (object.getFunctions() != null) {
			for (FuncSpec fs : object.getFunctions().getSpecs()) {
				visit(fs);
				ret.add(pop());
			}
		}
		push(ret);

		return false;
	}

	@Override
	public Boolean caseSlangAccess(SlangAccess object) {
		visit(object.getT());
		Exp e = pop();

		if (object.getSuffixes() == null || object.getSuffixes().isEmpty()) {
			push(e);
		} else {
			assert object.getSuffixes().size() == 1 : object.getSuffixes().size();

			String n = object.getSuffixes().get(0).getId();
			Id id = Id$.MODULE$.apply(n, GumboUtil.buildAttr(object));

			Select select = Select$.MODULE$.apply(SlangUtil.toSome(e), id, VisitorUtil.toISZ(),
					GumboUtil.buildResolvedAttr(object));

			push(select);
		}
		return false;
	}

	@Override
	public Boolean caseSlangDefDef(SlangDefDef object) {

		reportError(object.getSde() == null, object, "Not handling def extensions yet: " + object.getSde());

		List<TypeParam> typeParams = new ArrayList<>();
		if (object.getTypeParams() != null) {
			for (SlangTypeParam stp : object.getTypeParams().getTypeParam()) {
				reportError(!stp.isIsMut(), object, "Not handling mut attribute for type params yet");
				Id id = Id$.MODULE$.apply(stp.getName(), GumboUtil.buildAttr(stp));
				typeParams.add(TypeParam$.MODULE$.apply(id));
			}
		}

		Id methodId = Id$.MODULE$.apply(object.getName(), GumboUtil.buildAttr(object));

		List<Param> params = new ArrayList<>();
		if (object.getParams() != null) {
			for (SlangDefParam sdp : object.getParams().getParams()) {

				boolean isHidden = false;
				Id paramId = Id$.MODULE$.apply(sdp.getName(), GumboUtil.buildAttr(object));
				Type.Named paramType = GumboUtil.buildTypeNamed(sdp.getTypeName().getTypeName(), object);

				params.add(Param$.MODULE$.apply(isHidden, paramId, paramType));
			}
		}

		Type.Named returnType = GumboUtil.buildTypeNamed(object.getType().getTypeName(), object);

		boolean isPure = true;
		boolean hasParams = !params.isEmpty();

		MethodSig sig = MethodSig$.MODULE$.apply(isPure, methodId, VisitorUtil.toISZ(typeParams), hasParams,
				VisitorUtil.toISZ(params), returnType);

		visit(object.getBody());
		Stmt ret = Stmt.Return$.MODULE$.apply(SlangUtil.toSome(pop()), returnType.attr());
		Body body = Body$.MODULE$.apply(VisitorUtil.toISZ(ret), VisitorUtil.toISZ());

		boolean typeChecked = false;
		boolean hasOverride = false;
		boolean isHelper = false;

		MethodContract mcontract = MethodContract.Simple$.MODULE$.empty();

		if (object.getMethodContract() != null) {

			Accesses readsClause = Accesses$.MODULE$.empty();
			if (object.getMethodContract().getReads() != null) {
				List<Ident> idents = new ArrayList<>();
				Option<Position> pos = VisitorUtil
						.buildPositionOpt(object.getMethodContract().getReads().getExprs().get(0));
				for (Expr e : object.getMethodContract().getReads().getExprs()) {
					visit(e);
					pos = GumboUtil.mergePositions(pos, VisitorUtil.buildPositionOpt(e));
					Exp result = pop();
					if (result instanceof Ident) {
						idents.add((Ident) result);
					} else {
						reportError(e, "Only simple names are allowed for read clauses");
					}
				}
				readsClause = Accesses$.MODULE$.apply(VisitorUtil.toISZ(idents), GumboUtil.buildAttr(pos));
			}

			Claims requiresClause = Claims$.MODULE$.empty();
			if (object.getMethodContract().getRequires() != null) {
				List<Exp> exps = new ArrayList<>();
				Option<Position> pos = VisitorUtil
						.buildPositionOpt(object.getMethodContract().getRequires().getExprs().get(0));
				for (Expr e : object.getMethodContract().getRequires().getExprs()) {
					visit(e);
					pos = GumboUtil.mergePositions(pos, VisitorUtil.buildPositionOpt(e));
					exps.add(pop());
				}
				requiresClause = Claims$.MODULE$.apply(VisitorUtil.toISZ(exps), GumboUtil.buildAttr(pos));
			}

			Accesses modifiesClause = Accesses$.MODULE$.empty();
			if (object.getMethodContract().getModifies() != null) {
				List<Ident> idents = new ArrayList<>();
				Option<Position> pos = VisitorUtil
						.buildPositionOpt(object.getMethodContract().getModifies().getExprs().get(0));
				for (Expr e : object.getMethodContract().getModifies().getExprs()) {
					visit(e);
					pos = GumboUtil.mergePositions(pos, VisitorUtil.buildPositionOpt(e));

					Exp result = pop();
					if (result instanceof Ident) {
						idents.add((Ident) result);
					} else {
						reportError(e, "Only simple names are allowed for modifies clauses");
					}
				}
				modifiesClause = Accesses$.MODULE$.apply(VisitorUtil.toISZ(idents), GumboUtil.buildAttr(pos));
			}

			Claims ensuresClause = Claims$.MODULE$.empty();
			if (object.getMethodContract().getEnsures() != null) {
				List<Exp> exps = new ArrayList<>();
				Option<Position> pos = VisitorUtil
						.buildPositionOpt(object.getMethodContract().getEnsures().getExprs().get(0));
				for (Expr e : object.getMethodContract().getEnsures().getExprs()) {
					visit(e);
					pos = GumboUtil.mergePositions(pos, VisitorUtil.buildPositionOpt(e));
					exps.add(pop());
				}
				ensuresClause = Claims$.MODULE$.apply(VisitorUtil.toISZ(exps), GumboUtil.buildAttr(pos));
			}

			mcontract = Simple$.MODULE$.apply(readsClause, requiresClause, modifiesClause, ensuresClause,
					GumboUtil.buildAttr(object.getMethodContract()));
		}

		Purity.Type purity = null;
		if (object.getMethodContract() != null) {
			purity = Purity$.MODULE$.byName("Pure").get();
		} else {
			purity = Purity$.MODULE$.byName("StrictPure").get();
		}

		Method m = Method$.MODULE$.apply(typeChecked, purity, hasOverride, isHelper, sig, mcontract,
				SlangUtil.toSome(body), GumboUtil.buildResolvedAttr(object));

		push(GclMethod$.MODULE$.apply(m));

		return false;
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

		List<GclMethod> _methods = new ArrayList<>();
		if (object.getSpecs().getFunctions() != null) {
			for (FuncSpec fs : object.getSpecs().getFunctions().getSpecs()) {
				visit(fs);
				_methods.add(pop());
			}
		}

		List<GclInvariant> _invariants = new ArrayList<>();
		if (object.getSpecs().getInvariants() != null) {
			for (InvSpec s : object.getSpecs().getInvariants().getSpecs()) {
				java.lang.String id = s.getId();

				Option<org.sireum.String> descriptor = GumboUtil.getOptionalSlangString(s.getDescriptor());

				visit(s.getExpr());

				_invariants.add(GclInvariant$.MODULE$.apply(id, descriptor, pop(), VisitorUtil.buildPositionOpt(s)));
			}
		}

		Option<GclIntegration> _integration = SlangUtil.toNone();
		if (object.getSpecs().getIntegration() != null) {
			visit(object.getSpecs().getIntegration());
			_integration = SlangUtil.toSome(pop());
		}

		Option<GclInitialize> _initializes = SlangUtil.toNone();
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

			_initializes = SlangUtil
					.toSome(GclInitialize$.MODULE$.apply(VisitorUtil.toISZ(modifies), VisitorUtil.toISZ(guarantees)));
		}

		Option<GclCompute> _compute = SlangUtil.toNone();
		if (object.getSpecs().getCompute() != null) {
			visit(object.getSpecs().getCompute());
			_compute = SlangUtil.toSome(pop());
		}

		push(GclSubclause$.MODULE$.apply(VisitorUtil.toISZ(_state), VisitorUtil.toISZ(_methods),
				VisitorUtil.toISZ(_invariants), _initializes, _integration, _compute));

		return false;
	}

	@Override
	public Boolean caseCompute(Compute object) {

		List<Exp> modifies = new ArrayList<>();
		if (object.getModifies() != null) {
			for (Expr e : object.getModifies().getExprs()) {
				visit(e);
				modifies.add(pop());
			}
		}

		// TODO is preserving ordering important?

		List<GclComputeSpec> specs = new ArrayList<>();
		if (object.getSpecs() != null) {
			for (SpecStatement spec : object.getSpecs()) {
				visit(spec);
				specs.add(pop());
			}
		}

		List<GclHandle> handlers = new ArrayList<>();
		if (object.getHandlers() != null) {
			for (HandlerClause hc : object.getHandlers()) {
				visit(hc);
				handlers.add(pop());
			}
		}

		List<GclCaseStatement> caseStatements = new ArrayList<>();
		if (object.getCases() != null) {
			for (CaseStatementClause css : object.getCases()) {

				java.lang.String id = css.getId();

				Option<org.sireum.String> descriptor = GumboUtil.getOptionalSlangString(css.getDescriptor());

				visit(css.getAssumeStatement().getExpr());
				Exp assumes = pop();

				visit(css.getGuaranteeStatement().getExpr());
				Exp guarantees = pop();

				caseStatements.add(GclCaseStatement$.MODULE$.apply(id, descriptor, assumes, guarantees,
						VisitorUtil.buildPositionOpt(css)));
			}
		}

		push(GclCompute$.MODULE$.apply(VisitorUtil.toISZ(modifies), VisitorUtil.toISZ(specs),
				VisitorUtil.toISZ(caseStatements), VisitorUtil.toISZ(handlers)));

		return false;
	}

	@Override
	public Boolean caseHandlerClause(HandlerClause object) {

		Option<Position> clausePos = VisitorUtil.buildPositionOpt(object);

		Port p = object.getId();

		org.sireum.lang.ast.Id portId = Id$.MODULE$.apply(p.getName(),
				GumboUtil.buildAttr(GumboUtil.shrinkPos(clausePos, p.getName().length())));

		Ident slangExp = Ident$.MODULE$.apply(portId,
				GumboUtil.buildResolvedAttr(GumboUtil.shrinkPos(clausePos, p.getName().length())));

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

		push(GclStateVar$.MODULE$.apply(name, t.getQualifiedName(), VisitorUtil.buildPositionOpt(object)));

		return false;
	}

	@Override
	public Boolean caseAssumeStatement(AssumeStatement object) {
		java.lang.String id = object.getId();

		Option<org.sireum.String> descriptor = GumboUtil.getOptionalSlangString(object.getDescriptor());

		visit(object.getExpr());

		push(GclAssume$.MODULE$.apply(id, descriptor, pop(), VisitorUtil.buildPositionOpt(object)));

		return false;
	}

	@Override
	public Boolean caseGuaranteeStatement(GuaranteeStatement object) {
		java.lang.String id = object.getId();

		Option<org.sireum.String> descriptor = GumboUtil.getOptionalSlangString(object.getDescriptor());

		visit(object.getExpr());

		push(GclGuarantee$.MODULE$.apply(id, descriptor, pop(), VisitorUtil.buildPositionOpt(object)));

		return false;
	}

	@Override
	public Boolean caseCallExpr(CallExpr object) {
		EObject obj = object.getId();

		Option<Exp> receiverOpt = SlangUtil.toNone();
		Ident ident = null;

		if (obj instanceof SlangDefDef) {
			SlangDefDef sdd = (SlangDefDef) obj;

			boolean isInGumboSubclause = EcoreUtil2.getContainerOfType(sdd, GumboSubclause.class) != null;
			boolean isInGumboLibrary = EcoreUtil2.getContainerOfType(sdd, GumboLibrary.class) != null;

			if (isInGumboLibrary) {
				AadlPackage aadlPackage = EcoreUtil2.getContainerOfType(sdd, AadlPackage.class);

				// TODO: gcl libraries are placed in unique Slang objects called
				// <fqn-package-name>.GUMBO__Library. It would be better to add the
				// GUMBO__Library suffix via a rewriter
				String name = aadlPackage.getQualifiedName() + "::" + "GUMBO__Library";
				String[] segments = name.split("::");

				Stack<Object> names = new Stack<>();
				for (int i = 0; i < segments.length; i++) {
					names.add(0, Id$.MODULE$.apply(segments[i], GumboUtil.buildAttr(object)));
				}

				receiverOpt = SlangUtil.toSome(GumboUtil.convertIdStackToSelect(names));

				Id id = Id$.MODULE$.apply(sdd.getName(), GumboUtil.buildAttr(object));
				ident = Ident$.MODULE$.apply(id, GumboUtil.buildResolvedAttr(object));

			} else if (isInGumboSubclause) {
				Classifier classifier = EcoreUtil2.getContainerOfType(sdd, Classifier.class);

				if (classifier == null
						|| GumboUtil.getComponentType(classifier) != GumboUtil.getComponentType(entryClassifier)) {
					reportError(sdd, "Can only refer to enclosing GUMBO subclause methods");
					return false;
				}

				Id id = Id$.MODULE$.apply(sdd.getName(), GumboUtil.buildAttr(object));
				ident = Ident$.MODULE$.apply(id, GumboUtil.buildResolvedAttr(object));
			} else {
				reportError(object,
						"Expecting the calling context to be either from a GUMBO subclause or a GUMBO annex library");

				return false;
			}

		} else if (obj instanceof DataSubcomponentType) {
			DataSubcomponentType dst = (DataSubcomponentType) obj;

			String name = dst.getQualifiedName();
			String[] segments = name.split("::");

			Stack<Object> names = new Stack<>();
			for (int i = 0; i < segments.length - 1; i++) {
				names.add(0, Id$.MODULE$.apply(segments[i], GumboUtil.buildAttr(object)));
			}

			receiverOpt = SlangUtil.toSome(GumboUtil.convertIdStackToSelect(names));

			Id id = Id$.MODULE$.apply(dst.getName(), GumboUtil.buildAttr(object));
			ident = Ident$.MODULE$.apply(id, GumboUtil.buildResolvedAttr(object));

		} else {
			reportError(obj, "Not currently handling calls to " + obj.getClass().getSimpleName());

			return false;
		}

		List<Type> targs = new ArrayList<>();
		List<Exp> args = new ArrayList<>();

		if (object.getCallSuffix() != null) {
			SlangCallArgs callArgs = object.getCallSuffix().getCa();
			for (Expr arg : callArgs.getArg()) {
				visit(arg);
				args.add(pop());
			}
		}

		Invoke invoke = Invoke$.MODULE$.apply(receiverOpt, ident, VisitorUtil.toISZ(targs), VisitorUtil.toISZ(args),
				GumboUtil.buildResolvedAttr(object));

		push(invoke);

		return false;
	}

	@Override
	public Boolean caseInStateExpr(InStateExpr object) {

		Id slangId = Id$.MODULE$.apply(object.getStateVar().getName(), GumboUtil.buildAttr(object));
		Ident slangIdIdent = Ident$.MODULE$.apply(slangId, GumboUtil.buildResolvedAttr(object));

		Input input = Input$.MODULE$.apply(slangIdIdent, GumboUtil.buildAttr(object));

		push(input);

		return false;
	}

	@Override
	public Boolean caseMaySendExpr(MaySendExpr object) {

		Id maySendUifId = Id$.MODULE$.apply("MaySend", GumboUtil.buildAttr(object));
		Ident maySendUifIdent = Ident$.MODULE$.apply(maySendUifId, GumboUtil.buildResolvedAttr(object));

		List<Exp> args = new ArrayList<>();

		Id portId = Id$.MODULE$.apply(object.getEventPort().getName(), GumboUtil.buildAttr(object));
		args.add(Ident$.MODULE$.apply(portId, GumboUtil.buildResolvedAttr(object)));

		if (object.getValue() != null) {
			visit(object.getValue());
			args.add(pop());
		}

		Invoke invoke = Invoke$.MODULE$.apply(SlangUtil.toNone(), maySendUifIdent, VisitorUtil.toISZ(),
				VisitorUtil.toISZ(args), GumboUtil.buildResolvedAttr(object));

		push(invoke);

		return false;
	}

	@Override
	public Boolean caseMustSendExpr(MustSendExpr object) {

		String uifName = object.getValue() == null ? "uif__MustSend" : "uif__MustSendWithExpectedValue";

		Id mustSendUifId = Id$.MODULE$.apply(uifName, GumboUtil.buildAttr(object));
		Ident mustSendUifIdent = Ident$.MODULE$.apply(mustSendUifId, GumboUtil.buildResolvedAttr(object));

		List<Exp> args = new ArrayList<>();

		Id portId = Id$.MODULE$.apply(object.getEventPort().getName(), GumboUtil.buildAttr(object));
		args.add(Ident$.MODULE$.apply(portId, GumboUtil.buildResolvedAttr(object)));

		if (object.getValue() != null) {
			visit(object.getValue());
			args.add(pop());
		}

		Invoke invoke = Invoke$.MODULE$.apply(SlangUtil.toNone(), mustSendUifIdent, VisitorUtil.toISZ(),
				VisitorUtil.toISZ(args), GumboUtil.buildResolvedAttr(object));

		push(invoke);

		return false;
	}

	@Override
	public Boolean caseNoSendExpr(NoSendExpr object) {

		Id noSendUifId = Id$.MODULE$.apply("uif__NoSend", GumboUtil.buildAttr(object));
		Ident noSendUifIdent = Ident$.MODULE$.apply(noSendUifId, GumboUtil.buildResolvedAttr(object));

		List<Exp> args = new ArrayList<>();

		Id portId = Id$.MODULE$.apply(object.getEventPort().getName(), GumboUtil.buildAttr(object));
		args.add(Ident$.MODULE$.apply(portId, GumboUtil.buildResolvedAttr(object)));

		Invoke invoke = Invoke$.MODULE$.apply(SlangUtil.toNone(), noSendUifIdent, VisitorUtil.toISZ(),
				VisitorUtil.toISZ(args), GumboUtil.buildResolvedAttr(object));

		push(invoke);

		return false;
	}

	@Override
	public Boolean caseIfElseExp(IfElseExp object) {

		visit(object.getIfCond());
		Exp condExp = pop();

		visit(object.getThenExpr());
		Exp thenExp = pop();

		visit(object.getElseExpr());
		Exp elseExp = pop();

		If ifexp = If$.MODULE$.apply(condExp, thenExp, elseExp, GumboUtil.buildTypedAttr(object));
		push(ifexp);

		return false;
	}

	@Override
	public Boolean caseBasicExp(BasicExp object) {

		reportError(object.getTerms().size() == object.getOps().size() + 1, object,
				"There are " + object.getOps().size() + " operators but " + object.getTerms().size() + " expressions");

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
				String op = GumboUtil.toSlangBinaryOp(object.getOps().get(i++));
				Option<Position> optPos = (lhs != null && rhs != null)
						? GumboUtil.mergePositions(lhs.posOpt(), rhs.posOpt())
						: SlangUtil.toNone();
				Binary b = Binary$.MODULE$.apply(lhs, op, rhs, GumboUtil.buildResolvedAttr(optPos));
				exps.push(b);
			}
		}

		reportError(exps.size() == 1, object, "Only expecting a single expression");
		push(exps.get(0));

		return false;
	}

	@Override
	public Boolean caseUnaryExp(UnaryExp object) {
		visit(object.getAccessExp());

		UnaryOp slangOp = GumboUtil.toSlangUnaryOp(object.getOp());
		Unary exp = Unary$.MODULE$.apply(Exp.UnaryOp$.MODULE$.byName(slangOp.name()).get(), pop(),
				GumboUtil.buildResolvedAttr(object));

		push(exp);

		return false;
	}

	@Override
	public Boolean caseDataRefExpr(DataRefExpr object) {
		EObject receiver = object.getPortOrSubcomponentOrStateVar();

		Id slangId = null;

		Option<Position> selectPos = VisitorUtil.buildPositionOpt(object);

		if (receiver instanceof DataSubcomponent) {
			DataSubcomponent ds = (DataSubcomponent) receiver;

			ComponentType ct = ds.getComponentType();
			Element owner = ds.getOwner();

			if (owner != entryClassifier) {
				todo(object, "Probably not dealing with a data component");

			} else {
				slangId = Id$.MODULE$.apply(ds.getName(),
						GumboUtil.buildAttr(GumboUtil.shrinkPos(selectPos, ds.getName().length())));
			}
		} else if (receiver instanceof ProcessSubcomponent) {
			ProcessSubcomponent psc = (ProcessSubcomponent) receiver;

			slangId = Id$.MODULE$.apply(psc.getName(),
					GumboUtil.buildAttr(GumboUtil.shrinkPos(selectPos, psc.getName().length())));

		} else if (receiver instanceof Port) {
			Port p = (Port) receiver;

			slangId = Id$.MODULE$.apply(p.getName(),
					GumboUtil.buildAttr(GumboUtil.shrinkPos(selectPos, p.getName().length())));

		} else if (receiver instanceof StateVarDecl) {
			StateVarDecl svd = (StateVarDecl) receiver;

			slangId = Id$.MODULE$.apply(svd.getName(),
					GumboUtil.buildAttr(GumboUtil.shrinkPos(selectPos, svd.getName().length())));
		} else if (receiver instanceof SlangDefDef) {
			SlangDefDef sdd = (SlangDefDef) receiver;

			GumboLibrary lib = EcoreUtil2.getContainerOfType(sdd, GumboLibrary.class);
			if (lib != null) {

				AadlPackage aadlPackage = EcoreUtil2.getContainerOfType(sdd, AadlPackage.class);

				String name = aadlPackage.getQualifiedName() + "::" + sdd.getName();
				String[] segments = name.split("::");

				Stack<Object> names = new Stack<>();
				for (int i = 0; i < segments.length; i++) {
					names.add(0, Id$.MODULE$.apply(segments[i], GumboUtil.buildAttr(object)));
				}

				Exp select = GumboUtil.convertIdStackToSelect(names);

				push(select);

				return false;

			} else {
				slangId = Id$.MODULE$.apply(sdd.getName(),
						GumboUtil.buildAttr(GumboUtil.shrinkPos(selectPos, sdd.getName().length())));
			}

		} else if (receiver instanceof SlangDefParam) {
			SlangDefParam sdp = (SlangDefParam) receiver;

			slangId = Id$.MODULE$.apply(sdp.getName(),
					GumboUtil.buildAttr(GumboUtil.shrinkPos(selectPos, sdp.getName().length())));
		} else {
			// FIXME: can invoke HAMR even if there are syntax errors in gumbo annexes. OSATE is likely
			// showing the error. Use reporter instead?

			String s = "<invalid>";
			slangId = Id$.MODULE$.apply(s, GumboUtil.buildAttr(selectPos));

			Ident slangExp = Ident$.MODULE$.apply(slangId, GumboUtil.buildResolvedAttr(object));

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
			names.push(Id$.MODULE$.apply(attName, GumboUtil.buildAttr(ref)));
			names.push(slangId);

			ref = ref.getPath();

			while (ref != null) {
				attName = ref.getNamedElement().getName();

				names.add(0, Id$.MODULE$.apply(attName, GumboUtil.buildAttr(ref)));

				ref = ref.getPath();
			}

			Exp slangExp = GumboUtil.convertIdStackToSelect(names);

			push(slangExp);

		} else {

			Ident slangExp = Ident$.MODULE$.apply(slangId, GumboUtil.buildResolvedAttr(object));

			push(slangExp);
		}

		return false;
	}

	@Override
	public Boolean caseBooleanLit(BooleanLit object) {

		Boolean b = object.getValue().equalsIgnoreCase("t"); // only other option if F

		push(LitB$.MODULE$.apply(b, GumboUtil.buildAttr(object)));

		return false;
	}

	@Override
	public Boolean caseIntegerLit(IntegerLit object) {

		Option<Z> z = Z.apply(object.getValue());
		reportError(z.nonEmpty(), object, "Not a valid Z: " + object.getValue());

		Exp slangExp = LitZ$.MODULE$.apply(z.get(), GumboUtil.buildAttr(object));

		push(slangExp);

		return false;
	}

	@Override
	public Boolean caseRealLit(RealLit object) {

		Option<R> r = R.apply(object.getValue());
		reportError(r.nonEmpty(), object, "Not a valid R: " + object.getValue());

		Exp slangExp = LitR$.MODULE$.apply(r.get().value(), GumboUtil.buildAttr(object));

		push(slangExp);

		return false;
	}

	@Override
	public Boolean caseSlangStringLit(SlangStringLit object) {

		push(Exp.LitString$.MODULE$.apply(GumboUtil.getSlangString(object.getValue()).string(),
				GumboUtil.buildAttr(object)));

		return false;
	}

	@Override
	public Boolean caseEnumLitExpr(EnumLitExpr object) {

		DataSubcomponentType de = object.getEnumType();
		String name = de.getQualifiedName();
		String[] segments = name.split("::");

		Stack<Object> names = new Stack<>();
		for (int i = 0; i < segments.length; i++) {
			names.add(0, Id$.MODULE$.apply(segments[i], GumboUtil.buildAttr(object)));
		}
		names.add(0, Id$.MODULE$.apply(object.getValue().getValue(), GumboUtil.buildAttr(object)));

		Exp slangSelect = GumboUtil.convertIdStackToSelect(names);

		push(slangSelect);

		return false;
	}

	@Override
	public Boolean caseResultLit(ResultLit object) {

		SlangDefDef def = EcoreUtil2.getContainerOfType(object, SlangDefDef.class);

		DataSubcomponentType dst = def.getType().getTypeName();
		String[] segments = dst.getQualifiedName().split("::");

		List<org.sireum.String> ids = new ArrayList<>();
		for (String s : segments) {
			ids.add(new org.sireum.String(s));
		}

		Typed.Name name = Typed.Name$.MODULE$.apply(VisitorUtil.toISZ(ids), VisitorUtil.toISZ());
		TypedAttr ta = GumboUtil.buildTypedAttr(object, name);

		Exp.Result result = Exp.Result$.MODULE$.apply(SlangUtil.toNone(), ta);

		push(result);

		return false;
	}

	@Override
	public Boolean caseSlangLiteralInterp(SlangLiteralInterp object) {

		String[] parts = object.getSli().split("\"");

		switch (parts[0]) {
		case "c":
			reportError(parts[1].length() == 1, object, "Expecting a single character");

			int c = parts[1].charAt(0);
			push(Exp.LitC$.MODULE$.apply(c, GumboUtil.buildAttr(object)));

			break;
		case "string":
			push(Exp.LitString$.MODULE$.apply(parts[1], GumboUtil.buildAttr(object)));

			break;
		case "f32":
			try {
				float f = Float.parseFloat(parts[1]);
				org.sireum.F32 f32 = new org.sireum.F32(f);
				push(Exp.LitF32$.MODULE$.apply(f32, GumboUtil.buildAttr(object)));
			} catch (NumberFormatException v) {
				reportError(object, "'" + parts[1] + "' is not a valid F32");
			}

			break;
		case "f64":
			try {
				double d = Double.parseDouble(parts[1]);
				org.sireum.F64 f64 = new org.sireum.F64(d);
				push(Exp.LitF64$.MODULE$.apply(f64, GumboUtil.buildAttr(object)));
			} catch (NumberFormatException e) {
				reportError(object, "'" + parts[1] + "' is not a valid F64");
			}

			break;
		case "r":
			scala.math.BigDecimal r = new scala.math.BigDecimal(new java.math.BigDecimal(parts[1]));
			push(Exp.LitR$.MODULE$.apply(r, GumboUtil.buildAttr(object)));

			break;
		case "z":
			Option<Z> z = Z.apply(parts[1]);
			if (z.nonEmpty()) {
				push(Exp.LitZ$.MODULE$.apply(z.get(), GumboUtil.buildAttr(object)));
			} else {
				reportError(object, "'" + parts[1] + "' is not a valid Z");
			}

			break;
		default:

			LitString lit = LitString$.MODULE$.apply(parts[1], GumboUtil.buildAttr(object));

			Exp slangExp = StringInterpolate$.MODULE$.apply(parts[0], VisitorUtil.toISZ(lit), VisitorUtil.toISZ(),
					GumboUtil.buildTypedAttr(object));

			push(slangExp);

			break;
		}

		return false;
	}

	public Boolean visit(EObject o) {
		reportError(isSwitchFor(o.eClass().getEPackage()), o, "Internal error: GumboVisitor is not a switch for " + o);
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
		// only report first error
		if (result != null && !reporter.hasError()) {
			RuntimeException e = new RuntimeException(
					"Internal error: Trying to push to visitor stack but it is full.  Stack has " + result
							+ " and was passed " + o);
			reportError(e.getMessage() + ": " + e.getStackTrace()[1]);
		}
		result = o;
	}

	@SuppressWarnings("unchecked")
	<T> T pop() {
		// only report first error
		if (result == null && !reporter.hasError()) {
			RuntimeException e = new RuntimeException("Internal error: visitor stack was empty while trying to pop");
			reportError(e.getMessage() + ": " + e.getStackTrace()[1]);
		}
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

			reportError(e.getMessage() + ": " + ste);
		}
	}

	void reportError(String msg) {
		reportError(false, null, msg);
	}

	void reportError(boolean cond, String msg) {
		reportError(cond, null, msg);
	}

	void reportError(EObject o, String msg) {
		reportError(false, o, msg);
	}

	void reportError(boolean cond, EObject o, String msg) {
		VisitorUtil.reportError(cond, o, msg, ANNEX_TYPE, reporter);
	}
}