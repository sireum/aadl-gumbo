package org.sireum.aadl.osate.gumbo2air;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.osate.aadl2.AadlPackage;
import org.osate.aadl2.AnnexLibrary;
import org.osate.aadl2.Classifier;
import org.osate.aadl2.ComponentImplementation;
import org.osate.aadl2.ComponentType;
import org.osate.aadl2.DataClassifier;
import org.osate.aadl2.DataSubcomponent;
import org.osate.aadl2.DataSubcomponentType;
import org.osate.aadl2.Element;
import org.osate.aadl2.EventPort;
import org.osate.aadl2.ModelUnit;
import org.osate.aadl2.Port;
import org.osate.aadl2.ProcessSubcomponent;
import org.osate.aadl2.ThreadClassifier;
import org.osate.aadl2.instance.ComponentInstance;
import org.osate.aadl2.modelsupport.util.AadlUtil;
import org.osate.annexsupport.AnnexUtil;
import org.sireum.IS;
import org.sireum.Option;
import org.sireum.Z;
import org.sireum.aadl.gumbo.gumbo.AndExpr;
import org.sireum.aadl.gumbo.gumbo.ArrayAccess;
import org.sireum.aadl.gumbo.gumbo.AssumeStatement;
import org.sireum.aadl.gumbo.gumbo.BooleanLit;
import org.sireum.aadl.gumbo.gumbo.CallExpr;
import org.sireum.aadl.gumbo.gumbo.CaseStatementClause;
import org.sireum.aadl.gumbo.gumbo.ColonExpr;
import org.sireum.aadl.gumbo.gumbo.Compute;
import org.sireum.aadl.gumbo.gumbo.DataRefExpr;
import org.sireum.aadl.gumbo.gumbo.EnumLitExpr;
import org.sireum.aadl.gumbo.gumbo.EqualNotExpr;
import org.sireum.aadl.gumbo.gumbo.F32Lit;
import org.sireum.aadl.gumbo.gumbo.F32Obj;
import org.sireum.aadl.gumbo.gumbo.F64Lit;
import org.sireum.aadl.gumbo.gumbo.F64Obj;
import org.sireum.aadl.gumbo.gumbo.FuncSpec;
import org.sireum.aadl.gumbo.gumbo.GExpr;
import org.sireum.aadl.gumbo.gumbo.GuaranteeStatement;
import org.sireum.aadl.gumbo.gumbo.GumboLibrary;
import org.sireum.aadl.gumbo.gumbo.GumboPackage;
import org.sireum.aadl.gumbo.gumbo.GumboSubclause;
import org.sireum.aadl.gumbo.gumbo.HandlerClause;
import org.sireum.aadl.gumbo.gumbo.HasEventExpr;
import org.sireum.aadl.gumbo.gumbo.HexLit;
import org.sireum.aadl.gumbo.gumbo.IfElseExp;
import org.sireum.aadl.gumbo.gumbo.ImpliesExpr;
import org.sireum.aadl.gumbo.gumbo.InStateExpr;
import org.sireum.aadl.gumbo.gumbo.InfoFlowClause;
import org.sireum.aadl.gumbo.gumbo.Initialize;
import org.sireum.aadl.gumbo.gumbo.InitializeSpecStatement;
import org.sireum.aadl.gumbo.gumbo.IntegerLit;
import org.sireum.aadl.gumbo.gumbo.Integration;
import org.sireum.aadl.gumbo.gumbo.InvSpec;
import org.sireum.aadl.gumbo.gumbo.LtGtExpr;
import org.sireum.aadl.gumbo.gumbo.MaySendExpr;
import org.sireum.aadl.gumbo.gumbo.MemberAccess;
import org.sireum.aadl.gumbo.gumbo.MultiplicativeExpr;
import org.sireum.aadl.gumbo.gumbo.MustSendExpr;
import org.sireum.aadl.gumbo.gumbo.NoSendExpr;
import org.sireum.aadl.gumbo.gumbo.OrExpr;
import org.sireum.aadl.gumbo.gumbo.OwnedExpression;
import org.sireum.aadl.gumbo.gumbo.ParenExpr;
import org.sireum.aadl.gumbo.gumbo.PlusMinusExpr;
import org.sireum.aadl.gumbo.gumbo.PostFixExpr;
import org.sireum.aadl.gumbo.gumbo.Postfix;
import org.sireum.aadl.gumbo.gumbo.QuantParam;
import org.sireum.aadl.gumbo.gumbo.QuantifiedExp;
import org.sireum.aadl.gumbo.gumbo.ResultExpr;
import org.sireum.aadl.gumbo.gumbo.SlangCallArgs;
import org.sireum.aadl.gumbo.gumbo.SlangDefDef;
import org.sireum.aadl.gumbo.gumbo.SlangDefParam;
import org.sireum.aadl.gumbo.gumbo.SlangLiteralInterp;
import org.sireum.aadl.gumbo.gumbo.SlangStringLit;
import org.sireum.aadl.gumbo.gumbo.SlangTypeParam;
import org.sireum.aadl.gumbo.gumbo.SpecStatement;
import org.sireum.aadl.gumbo.gumbo.State;
import org.sireum.aadl.gumbo.gumbo.StateVarDecl;
import org.sireum.aadl.gumbo.gumbo.UnaryExpr;
import org.sireum.aadl.gumbo.gumbo.util.GumboSwitch;
import org.sireum.aadl.osate.architecture.AnnexVisitor;
import org.sireum.aadl.osate.architecture.Visitor;
import org.sireum.aadl.osate.gumbo2air.GumboUtil.UnaryOp;
import org.sireum.aadl.osate.util.SlangUtil;
import org.sireum.aadl.osate.util.VisitorUtil;
import org.sireum.hamr.codegen.common.resolvers.GclResolver;
import org.sireum.hamr.codegen.common.util.GclUtil.SlangAstBridge$;
import org.sireum.hamr.ir.Annex;
import org.sireum.hamr.ir.Annex$;
import org.sireum.hamr.ir.AnnexLib;
import org.sireum.hamr.ir.GclAssume;
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
import org.sireum.hamr.ir.GclLib$;
import org.sireum.hamr.ir.GclMethod;
import org.sireum.hamr.ir.GclMethod$;
import org.sireum.hamr.ir.GclSpec;
import org.sireum.hamr.ir.GclStateVar;
import org.sireum.hamr.ir.GclStateVar$;
import org.sireum.hamr.ir.GclSubclause;
import org.sireum.hamr.ir.GclSubclause$;
import org.sireum.lang.ast.AssignExp;
import org.sireum.lang.ast.Body;
import org.sireum.lang.ast.Body$;
import org.sireum.lang.ast.Exp;
import org.sireum.lang.ast.Exp.Binary$;
import org.sireum.lang.ast.Exp.Ident;
import org.sireum.lang.ast.Exp.Ident$;
import org.sireum.lang.ast.Exp.If$;
import org.sireum.lang.ast.Exp.Input$;
import org.sireum.lang.ast.Exp.Invoke;
import org.sireum.lang.ast.Exp.Invoke$;
import org.sireum.lang.ast.Exp.LitB$;
import org.sireum.lang.ast.Exp.LitString;
import org.sireum.lang.ast.Exp.LitString$;
import org.sireum.lang.ast.Exp.LitZ$;
import org.sireum.lang.ast.Exp.Ref;
import org.sireum.lang.ast.Exp.Select;
import org.sireum.lang.ast.Exp.Select$;
import org.sireum.lang.ast.Exp.StringInterpolate$;
import org.sireum.lang.ast.Exp.Unary$;
import org.sireum.lang.ast.Id;
import org.sireum.lang.ast.Id$;
import org.sireum.lang.ast.MethodContract;
import org.sireum.lang.ast.MethodContract.Accesses;
import org.sireum.lang.ast.MethodContract.Accesses$;
import org.sireum.lang.ast.MethodContract.Claims;
import org.sireum.lang.ast.MethodContract.Claims$;
import org.sireum.lang.ast.MethodContract.InfoFlows;
import org.sireum.lang.ast.MethodContract.InfoFlows$;
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

					List<GclMethod> methods = visitPop(gl);

					List<org.sireum.String> segs = new ArrayList<>();
					for (String seg : parent.getQualifiedName().split("::")) {
						segs.add(new org.sireum.String(seg));
					}

					org.sireum.hamr.ir.Name containingPackage = org.sireum.hamr.ir.Name$.MODULE$
							.apply(VisitorUtil.toISZ(segs), SlangUtil.toNone());

					ret.add(GclLib$.MODULE$.apply(containingPackage, VisitorUtil.toISZ(methods), GumboUtil.toAttr(gl)));
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

		Classifier cWithGumbo = c;
		List<GumboSubclause> bas = EcoreUtil2.eAllOfType(c, GumboSubclause.class);
		if (c instanceof ComponentImplementation) {
			ComponentImplementation ci = (ComponentImplementation) c;
			List<GumboSubclause> cands = EcoreUtil2.eAllOfType(ci.getType(), GumboSubclause.class);
			if (!cands.isEmpty()) {
				cWithGumbo = ci;
			}
			bas.addAll(cands);
		}

		reportError(bas.size() <= 1, c, "Only one " + ANNEX_TYPE + " subclause annex is allowed per component");

		if (bas.size() == 1) {
			this.path = path;

			entryClassifier = c;

			addAllBaseTypes(c.eResource().getResourceSet());

			GclSubclause gs = visitPop(bas.get(0));

			if (cWithGumbo instanceof DataClassifier) {
				if (gs.state().nonEmpty()) {
					this.reportError(cWithGumbo, "State variables cannot be attached to data components");
				}
				if (gs.methods().nonEmpty()) {
					this.reportError(cWithGumbo, "Methods cannot be attached to data components");
				}
				if (gs.initializes().nonEmpty()) {
					this.reportError(cWithGumbo, "Initialize clauses cannot be attached to data components");
				}
				if (gs.integration().nonEmpty()) {
					this.reportError(cWithGumbo, "Integration clauses cannot be attached to data components");
				}
				if (gs.compute().nonEmpty()) {
					this.reportError(cWithGumbo, "Compute clauses cannot be attached to data components");
				}
			} else if (cWithGumbo instanceof ThreadClassifier) {
				if (gs.invariants().nonEmpty()) {
					this.reportError(cWithGumbo, "Invariants cannot be attached to thread components");
				}
			} else {
				this.reportError(cWithGumbo, "GUMBO subclauses can only be attached to thread and data components");
			}
			ret.add(Annex$.MODULE$.apply(ANNEX_TYPE, gs));

			entryClassifier = null;
		}

		return ret;
	}

	private void processDatatype(Classifier c) {
		if (!c.getName().equals("Natural")) {
			v.processDataType((DataClassifier) c);
		}
	}

	private void addAllBaseTypes(ResourceSet rs) {
		URI u = URI.createURI("platform:/plugin/org.osate.contribution.sei/resources/packages/Base_Types.aadl");
		Resource r = rs.getResource(u, true);
		AadlPackage baseTypes = (AadlPackage) r.getContents().get(0);
		for (org.osate.aadl2.Classifier c : baseTypes.getOwnedPublicSection().getOwnedClassifiers()) {
			processDatatype(c);
		}
	}

	@Override
	public Boolean caseGumboLibrary(GumboLibrary object) {
		List<GclMethod> ret = new ArrayList<>();
		if (object.getFunctions() != null) {
			for (FuncSpec fs : object.getFunctions().getSpecs()) {
				ret.add(visitPop(fs));
			}
		}
		push(ret);

		return false;
	}

	@Override
	public Boolean caseSlangDefDef(SlangDefDef object) {

		// reportError(object.getSde() == null, object, "Not handling def extensions yet: " + object.getSde());

		List<TypeParam> typeParams = new ArrayList<>();
		if (object.getTypeParams() != null) {
			for (SlangTypeParam stp : object.getTypeParams().getTypeParam()) {
				Id id = Id$.MODULE$.apply(stp.getName(), GumboUtil.buildAttr(stp));
				typeParams.add(TypeParam$.MODULE$.apply(id, //
						Typed.VarKind$.MODULE$.byName(stp.isIsMut() ? //
								GumboUtil.Typed_VarKind.Mutable.name() : //
								GumboUtil.Typed_VarKind.Immutable.name()).get()));
			}
		}

		Id methodId = Id$.MODULE$.apply(object.getName(), GumboUtil.buildAttr(object));

		List<Param> params = new ArrayList<>();
		if (object.getParams() != null) {
			for (SlangDefParam sdp : object.getParams().getParams()) {

				boolean isHidden = false;
				Id paramId = Id$.MODULE$.apply(sdp.getName(), GumboUtil.buildAttr(object));
				Type.Named paramType = GumboUtil.buildTypeNamed(sdp.getTypeName().getTypeName(), object);

				processDatatype(sdp.getTypeName().getTypeName().getContainingClassifier());
				
				params.add(Param$.MODULE$.apply(isHidden, paramId, paramType));
			}
		}

		processDatatype(object.getType().getTypeName().getContainingClassifier());
		
		Type.Named returnType = GumboUtil.buildTypeNamed(object.getType().getTypeName(), object);

		boolean hasParams = !params.isEmpty();

		Stmt ret = Stmt.Return$.MODULE$.apply(SlangUtil.toSome(visitPop(object.getBody())), returnType.attr());
		Body body = Body$.MODULE$.apply(VisitorUtil.toISZ(ret), VisitorUtil.toISZ());

		boolean typeChecked = false;
		IS<Z, org.sireum.String> modifiers = VisitorUtil.toISZ();

		MethodContract mcontract = MethodContract.Simple$.MODULE$.empty();

		boolean hasContract = false;

		Accesses readsClause = Accesses$.MODULE$.empty();
		if (object.getMethodContract().getReads() != null) {
			hasContract = true;
			List<Ref> idents = new ArrayList<>();
			Option<Position> pos = VisitorUtil
					.buildPositionOpt(object.getMethodContract().getReads().getExprs().get(0));
			for (OwnedExpression e : object.getMethodContract().getReads().getExprs()) {
				pos = GumboUtil.mergePositions(pos, VisitorUtil.buildPositionOpt(e));
				Exp result = visitPop(e);
				if (result instanceof Ref) {
					idents.add((Ref) result);
				} else {
					reportError(e, "Only select expressions or simple names are allowed for read clauses");
				}
			}
			readsClause = Accesses$.MODULE$.apply(VisitorUtil.toISZ(idents), GumboUtil.buildAttr(pos));
		}

		Claims requiresClause = Claims$.MODULE$.empty();
		if (object.getMethodContract().getRequires() != null) {
			hasContract = true;
			List<Exp> exps = new ArrayList<>();
			Option<Position> pos = VisitorUtil
					.buildPositionOpt(object.getMethodContract().getRequires().getExprs().get(0));
			for (OwnedExpression e : object.getMethodContract().getRequires().getExprs()) {
				pos = GumboUtil.mergePositions(pos, VisitorUtil.buildPositionOpt(e));
				exps.add(visitPop(e));
			}
			requiresClause = Claims$.MODULE$.apply(VisitorUtil.toISZ(exps), GumboUtil.buildAttr(pos));
		}

		Accesses modifiesClause = Accesses$.MODULE$.empty();
		if (object.getMethodContract().getModifies() != null) {
			hasContract = true;
			List<Ref> idents = new ArrayList<>();
			Option<Position> pos = VisitorUtil
					.buildPositionOpt(object.getMethodContract().getModifies().getExprs().get(0));
			for (OwnedExpression e : object.getMethodContract().getModifies().getExprs()) {
				pos = GumboUtil.mergePositions(pos, VisitorUtil.buildPositionOpt(e));
				Exp result = visitPop(e);
				if (result instanceof Ident) {
					idents.add((Ident) result);
				} else {
					reportError(e, "Only select expressions or simple names are allowed for modifies clauses");
				}
			}
			modifiesClause = Accesses$.MODULE$.apply(VisitorUtil.toISZ(idents), GumboUtil.buildAttr(pos));
		}

		Claims ensuresClause = Claims$.MODULE$.empty();
		if (object.getMethodContract().getEnsures() != null) {
			hasContract = true;
			List<Exp> exps = new ArrayList<>();
			Option<Position> pos = VisitorUtil
					.buildPositionOpt(object.getMethodContract().getEnsures().getExprs().get(0));
			for (OwnedExpression e : object.getMethodContract().getEnsures().getExprs()) {
				pos = GumboUtil.mergePositions(pos, VisitorUtil.buildPositionOpt(e));
				exps.add(visitPop(e));
			}
			ensuresClause = Claims$.MODULE$.apply(VisitorUtil.toISZ(exps), GumboUtil.buildAttr(pos));
		}

		InfoFlows infoFlows = InfoFlows$.MODULE$.empty();

		if (hasContract) {
			mcontract = Simple$.MODULE$.apply(readsClause, requiresClause, modifiesClause, ensuresClause, infoFlows,
					GumboUtil.buildAttr(object.getMethodContract()));
		}

		Purity.Type purity = null;
		if (hasContract) {
			purity = Purity$.MODULE$.byName("Pure").get();
		} else {
			purity = Purity$.MODULE$.byName("StrictPure").get();
		}

		MethodSig sig = MethodSig$.MODULE$.apply(purity, VisitorUtil.toISZ(), methodId, VisitorUtil.toISZ(typeParams),
				hasParams, VisitorUtil.toISZ(params), returnType);

		Method m = Method$.MODULE$.apply(typeChecked, purity, modifiers, sig, mcontract, SlangUtil.toSome(body),
				GumboUtil.buildResolvedAttr(object));

		push(GclMethod$.MODULE$.apply(m));

		return false;
	}

	@Override
	public Boolean caseGumboSubclause(GumboSubclause object) {
		List<GclStateVar> _state = new ArrayList<>();
		if (object.getSpecs().getState() != null) {
			State s = object.getSpecs().getState();
			for (StateVarDecl svd : s.getDecls()) {
				_state.add(visitPop(svd));
			}
		}

		List<GclMethod> _methods = new ArrayList<>();
		if (object.getSpecs().getFunctions() != null) {
			for (FuncSpec fs : object.getSpecs().getFunctions().getSpecs()) {
				_methods.add(visitPop(fs));
			}
		}

		List<GclInvariant> _invariants = new ArrayList<>();
		if (object.getSpecs().getInvariants() != null) {
			for (InvSpec s : object.getSpecs().getInvariants().getSpecs()) {
				java.lang.String id = s.getId();

				Option<org.sireum.String> descriptor = GumboUtil.getOptionalSlangString(s.getDescriptor());

				_invariants
						.add(GclInvariant$.MODULE$.apply(id, descriptor, visitPop(s.getExpr()), GumboUtil.toAttr(s)));
			}
		}

		Option<GclIntegration> _integration = SlangUtil.toNone();
		if (object.getSpecs().getIntegration() != null) {
			_integration = SlangUtil.toSome(visitPop(object.getSpecs().getIntegration()));
		}

		Option<GclInitialize> _initializes = SlangUtil.toNone();
		if (object.getSpecs().getInitialize() != null) {

			Initialize i = object.getSpecs().getInitialize();
			List<Exp> modifies = new ArrayList<>();
			if (i.getModifies() != null) {
				for (OwnedExpression e : i.getModifies().getExprs()) {
					modifies.add(visitPop(e));
				}
			}

			List<GclGuarantee> guarantees = new ArrayList<>();
			for (InitializeSpecStatement iss : i.getSpecs()) {
				guarantees.add(visitPop(iss.getGuaranteeStatement()));
			}

			List<org.sireum.hamr.ir.InfoFlowClause> flows = new ArrayList<>();
			for (InfoFlowClause ifc : i.getFlows()) {
				flows.add(visitPop(ifc));
			}

			_initializes = SlangUtil
					.toSome(GclInitialize$.MODULE$.apply(VisitorUtil.toISZ(modifies), VisitorUtil.toISZ(guarantees),
							VisitorUtil.toISZ(flows), GumboUtil.toAttr(object.getSpecs().getInitialize())));
		}

		Option<GclCompute> _compute = SlangUtil.toNone();
		if (object.getSpecs().getCompute() != null) {
			_compute = SlangUtil.toSome(visitPop(object.getSpecs().getCompute()));
		}

		push(GclSubclause$.MODULE$.apply(VisitorUtil.toISZ(_state), VisitorUtil.toISZ(_methods),
				VisitorUtil.toISZ(_invariants), _initializes, _integration, _compute, GumboUtil.toAttr(object)));

		return false;
	}

	@Override
	public Boolean caseCompute(Compute object) {

		List<Exp> modifies = new ArrayList<>();
		if (object.getModifies() != null) {
			for (OwnedExpression e : object.getModifies().getExprs()) {
				modifies.add(visitPop(e));
			}
		}

		List<GclAssume> genAssumes = new ArrayList<>();
		if (object.getAssumes() != null) {
			for (AssumeStatement assm : object.getAssumes()) {
				genAssumes.add(visitPop(assm));
			}
		}

		List<GclGuarantee> genGuarantees = new ArrayList<>();
		if (object.getGuarantees() != null) {
			for (GuaranteeStatement guar : object.getGuarantees()) {
				genGuarantees.add(visitPop(guar));
			}
		}

		List<GclHandle> handlers = new ArrayList<>();
		if (object.getHandlers() != null) {
			for (HandlerClause hc : object.getHandlers()) {
				handlers.add(visitPop(hc));
			}
		}

		List<GclCaseStatement> caseStatements = new ArrayList<>();
		if (object.getCases() != null) {
			for (CaseStatementClause css : object.getCases()) {

				java.lang.String id = css.getId();

				Option<org.sireum.String> descriptor = GumboUtil.getOptionalSlangString(css.getDescriptor());

				Option<Exp> assumes = SlangUtil.toNone();
				if (css.getAssumeStatement() != null) {
					assumes = SlangUtil.toSome(visitPop(css.getAssumeStatement().getExpr()));
				}

				Exp guarantees = visitPop(css.getGuaranteeStatement().getExpr());

				caseStatements.add(
						GclCaseStatement$.MODULE$.apply(id, descriptor, assumes, guarantees, GumboUtil.toAttr(css)));
			}
		}

		List<org.sireum.hamr.ir.InfoFlowClause> flows = new ArrayList<>();
		if (object.getFlows() != null) {
			for (InfoFlowClause ifc : object.getFlows()) {
				flows.add(visitPop(ifc));
			}
		}

		push(GclCompute$.MODULE$.apply(VisitorUtil.toISZ(modifies), //
				VisitorUtil.toISZ(genAssumes), //
				VisitorUtil.toISZ(genGuarantees), //
				VisitorUtil.toISZ(caseStatements), //
				VisitorUtil.toISZ(handlers), //
				VisitorUtil.toISZ(flows), //
				GumboUtil.toAttr(object)));

		return false;
	}

	@Override
	public Boolean caseHandlerClause(HandlerClause object) {

		Option<Position> clausePos = VisitorUtil.buildPositionOpt(object);

		Port p = object.getId();

		org.sireum.lang.ast.Id portId = Id$.MODULE$.apply(p.getName(),
				GumboUtil.buildAttr(GumboUtil.shrinkPos(clausePos, p.getName().length())));

		Ident portExp = Ident$.MODULE$.apply(portId,
				GumboUtil.buildResolvedAttr(GumboUtil.shrinkPos(clausePos, p.getName().length())));

		List<Exp> modifies = new ArrayList<>();
		if (object.getModifies() != null) {
			for (OwnedExpression e : object.getModifies().getExprs()) {
				modifies.add(visitPop(e));
			}
		}

		List<GclAssume> genAssumes = new ArrayList<>();
		for (AssumeStatement a : object.getAssumes()) {
			genAssumes.add(visitPop(a));
		}

		List<GclGuarantee> genGuarantees = new ArrayList<>();
		for (GuaranteeStatement gs : object.getGuarantees()) {
			genGuarantees.add(visitPop(gs));
		}

		List<GclCaseStatement> caseStatements = new ArrayList<>();
		if (object.getCases() != null) {
			for (CaseStatementClause css : object.getCases()) {

				java.lang.String id = css.getId();

				Option<org.sireum.String> descriptor = GumboUtil.getOptionalSlangString(css.getDescriptor());

				Option<Exp> handlerAssumes = SlangUtil.toNone();
				if (css.getAssumeStatement() != null) {
					handlerAssumes = SlangUtil.toSome(visitPop(css.getAssumeStatement().getExpr()));
				}

				Exp handlerGuarantees = visitPop(css.getGuaranteeStatement().getExpr());

				caseStatements.add(GclCaseStatement$.MODULE$.apply(id, //
						descriptor, //
						handlerAssumes, //
						handlerGuarantees, //
						GumboUtil.toAttr(css)));
			}
		}

		push(GclHandle$.MODULE$.apply(portExp, //
				VisitorUtil.toISZ(modifies), //
				VisitorUtil.toISZ(genAssumes), //
				VisitorUtil.toISZ(genGuarantees), //
				VisitorUtil.toISZ(caseStatements), //
				GumboUtil.toAttr(object)));

		return false;
	}

	@Override
	public Boolean caseIntegration(Integration object) {
		List<GclSpec> specs = new ArrayList<>();
		for (SpecStatement spec : object.getSpecs()) {
			specs.add(visitPop(spec));
		}

		push(GclIntegration$.MODULE$.apply(VisitorUtil.toISZ(specs), GumboUtil.toAttr(object)));

		return false;
	}

	@Override
	public Boolean caseStateVarDecl(StateVarDecl object) {
		String name = object.getName();
		DataSubcomponentType t = object.getTypeName();

		processDatatype(t.getContainingClassifier());

		push(GclStateVar$.MODULE$.apply(name, t.getQualifiedName(), GumboUtil.toAttr(object)));

		return false;
	}

	@Override
	public Boolean caseAssumeStatement(AssumeStatement object) {
		java.lang.String id = object.getId();

		Option<org.sireum.String> descriptor = GumboUtil.getOptionalSlangString(object.getDescriptor());

		push(GclAssume$.MODULE$.apply(id, descriptor, visitPop(object.getExpr()), GumboUtil.toAttr(object)));

		return false;
	}

	@Override
	public Boolean caseGuaranteeStatement(GuaranteeStatement object) {
		java.lang.String id = object.getId();

		Option<org.sireum.String> descriptor = GumboUtil.getOptionalSlangString(object.getDescriptor());

		push(GclGuarantee$.MODULE$.apply(id, descriptor, visitPop(object.getExpr()), GumboUtil.toAttr(object)));

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

		} else if (obj instanceof Port) {
			if (obj instanceof EventPort) {
				reportError(obj, "Access expressions cannot be applied to event ports");
				Id id = Id$.MODULE$.apply("invalid", GumboUtil.buildAttr(object));
				ident = Ident$.MODULE$.apply(id, GumboUtil.buildResolvedAttr(object));
			} else {
				Port p = (Port) obj;
				Id id = Id$.MODULE$.apply(p.getName(), GumboUtil.buildAttr(object));
				ident = Ident$.MODULE$.apply(id, GumboUtil.buildResolvedAttr(object));
			}
		} else if (obj instanceof StateVarDecl) {
			StateVarDecl s = (StateVarDecl) obj;
			Id id = Id$.MODULE$.apply(s.getName(), GumboUtil.buildAttr(object));
			ident = Ident$.MODULE$.apply(id, GumboUtil.buildResolvedAttr(object));
		} else if (obj instanceof SlangDefParam) {
			SlangDefParam s = (SlangDefParam) obj;
			Id id = Id$.MODULE$.apply(s.getName(), GumboUtil.buildAttr(object));
			ident = Ident$.MODULE$.apply(id, GumboUtil.buildResolvedAttr(object));
		} else {
			reportError(obj, "Not currently handling calls to " + obj.getClass().getSimpleName());

			return false;
		}

		List<Type> targs = new ArrayList<>();
		List<Exp> args = new ArrayList<>();

		if (object.getCallSuffix() != null) {
			SlangCallArgs callArgs = object.getCallSuffix().getCa();
			for (OwnedExpression arg : callArgs.getArg()) {
				args.add(visitPop(arg));
			}
		}

		push(Invoke$.MODULE$.apply(receiverOpt, ident, VisitorUtil.toISZ(targs), VisitorUtil.toISZ(args),
				GumboUtil.buildResolvedAttr(object)));

		return false;
	}

	@Override
	public Boolean caseInStateExpr(InStateExpr object) {

		Id slangId = Id$.MODULE$.apply(object.getStateVar().getName(), GumboUtil.buildAttr(object));
		Exp slangIdIdent = Ident$.MODULE$.apply(slangId, GumboUtil.buildResolvedAttr(object));

		push(Input$.MODULE$.apply(slangIdIdent, GumboUtil.buildAttr(object)));

		return false;
	}

	@Override
	public Boolean caseMaySendExpr(MaySendExpr object) {

		Id maySendUifId = Id$.MODULE$.apply(GclResolver.uif__MaySend(), GumboUtil.buildAttr(object));
		Ident maySendUifIdent = Ident$.MODULE$.apply(maySendUifId, GumboUtil.buildResolvedAttr(object));

		List<Exp> args = new ArrayList<>();

		Id portId = Id$.MODULE$.apply(object.getEventPort().getName(), GumboUtil.buildAttr(object));
		args.add(Ident$.MODULE$.apply(portId, GumboUtil.buildResolvedAttr(object)));

		if (object.getValue() != null) {
			args.add(visitPop(object.getValue()));
		}

		push(Invoke$.MODULE$.apply(SlangUtil.toNone(), maySendUifIdent, VisitorUtil.toISZ(),
				VisitorUtil.toISZ(args), GumboUtil.buildResolvedAttr(object)));

		return false;
	}

	@Override
	public Boolean caseHasEventExpr(HasEventExpr object) {

		Id hasEventUifId = Id$.MODULE$.apply(GclResolver.uif__HasEvent(), GumboUtil.buildAttr(object));
		Ident hasEventUifIdent = Ident$.MODULE$.apply(hasEventUifId, GumboUtil.buildResolvedAttr(object));

		List<Exp> args = new ArrayList<>();

		Id portId = Id$.MODULE$.apply(object.getEventPort().getName(), GumboUtil.buildAttr(object));
		args.add(Ident$.MODULE$.apply(portId, GumboUtil.buildResolvedAttr(object)));

		push(Invoke$.MODULE$.apply(SlangUtil.toNone(), hasEventUifIdent, VisitorUtil.toISZ(),
				VisitorUtil.toISZ(args), GumboUtil.buildResolvedAttr(object)));

		return false;
	}

	@Override
	public Boolean caseMustSendExpr(MustSendExpr object) {

		String uifName = object.getValue() == null ? GclResolver.uif__MustSend()
				: GclResolver.uif__MustSendWithExpectedValue();

		Id mustSendUifId = Id$.MODULE$.apply(uifName, GumboUtil.buildAttr(object));
		Ident mustSendUifIdent = Ident$.MODULE$.apply(mustSendUifId, GumboUtil.buildResolvedAttr(object));

		List<Exp> args = new ArrayList<>();

		Id portId = Id$.MODULE$.apply(object.getEventPort().getName(), GumboUtil.buildAttr(object));
		args.add(Ident$.MODULE$.apply(portId, GumboUtil.buildResolvedAttr(object)));

		if (object.getValue() != null) {
			args.add(visitPop(object.getValue()));
		}

		push(Invoke$.MODULE$.apply(SlangUtil.toNone(), mustSendUifIdent, VisitorUtil.toISZ(),
				VisitorUtil.toISZ(args), GumboUtil.buildResolvedAttr(object)));

		return false;
	}

	@Override
	public Boolean caseNoSendExpr(NoSendExpr object) {

		Id noSendUifId = Id$.MODULE$.apply(GclResolver.uif__NoSend(), GumboUtil.buildAttr(object));
		Ident noSendUifIdent = Ident$.MODULE$.apply(noSendUifId, GumboUtil.buildResolvedAttr(object));

		List<Exp> args = new ArrayList<>();

		Id portId = Id$.MODULE$.apply(object.getEventPort().getName(), GumboUtil.buildAttr(object));
		args.add(Ident$.MODULE$.apply(portId, GumboUtil.buildResolvedAttr(object)));

		push(Invoke$.MODULE$.apply(SlangUtil.toNone(), noSendUifIdent, VisitorUtil.toISZ(),
				VisitorUtil.toISZ(args), GumboUtil.buildResolvedAttr(object)));

		return false;
	}

	@Override
	public Boolean caseIfElseExp(IfElseExp object) {

		Exp condExp = visitPop(object.getIfCond());

		Exp thenExp = visitPop(object.getThenExpr());

		Exp elseExp = visitPop(object.getElseExpr());

		push(If$.MODULE$.apply(condExp, thenExp, elseExp, GumboUtil.buildTypedAttr(object)));

		return false;
	}

	@Override
	public Boolean caseQuantifiedExp(QuantifiedExp object) {
		boolean isForAll = object.getQuantifier().equalsIgnoreCase("all") || object.getQuantifier().equalsIgnoreCase("∀");
		assert (isForAll || (object.getQuantifier().equalsIgnoreCase("exists") || object.getQuantifier().equalsIgnoreCase("∃")));
		
		boolean isInclusive = object.getQuantRange().getExtent().equalsIgnoreCase("to");
		assert (isInclusive || object.getQuantRange().getExtent().equalsIgnoreCase("until"));
		
		Exp lo = visitPop(object.getQuantRange().getLo());
		Exp high = visitPop(object.getQuantRange().getHigh());
		
		Option<Id> idOpt = SlangUtil.toSome(Id$.MODULE$.apply(object.getQuantParam().getName(), GumboUtil.buildAttr(object)));
		
		AssignExp quantExp = Stmt.Expr$.MODULE$.apply(visitPop(object.getQuantifiedExpr()), GumboUtil.buildTypedAttr(object));

		IS<Z, org.sireum.String> context = VisitorUtil.toISZ(path.stream().map(s -> SlangUtil.sireumString(s)).collect(Collectors.toList()));
		
		Exp.Fun funExp = Exp.Fun$.MODULE$.apply( //
				context, //
				VisitorUtil.toISZ(SlangAstBridge$.MODULE$.AST_Exp_Fun_Param(idOpt, SlangUtil.toNone(), SlangUtil.toNone())), //
				quantExp, GumboUtil.buildTypedAttr(object));	

		push(Exp.QuantRange$.MODULE$.apply(isForAll, lo, high, isInclusive, funExp, GumboUtil.buildResolvedAttr(object)));
		
		return false;
	}

	Boolean constructBinary(GExpr lhs, String op, GExpr rhs, INode opNode) {
		Exp l = visitPop(lhs);
		Exp r = visitPop(rhs);
		Option<Position> mergedPos = GumboUtil.mergePositions(l.posOpt(), r.posOpt());
		
		Position opPos = VisitorUtil.buildPositionFromINode(opNode, VisitorUtil.getResourcePath(lhs));
		assert opPos != null;
		
		push(Binary$.MODULE$.apply(l, GumboUtil.toSlangBinaryOp(op), r, 
				GumboUtil.buildResolvedAttr(mergedPos), SlangUtil.toSome(opPos)));
		return false;
	}
	
	@Override
	public Boolean caseImpliesExpr(ImpliesExpr object) {
		// __>: ->: ~>: ___>: ~~>:		
		return constructBinary(object.getLeft(), object.getOp(), object.getRight(), 
				NodeModelUtils.findNodesForFeature(object, GumboPackage.Literals.IMPLIES_EXPR__OP).get(0));
	}

	@Override
	public Boolean caseOrExpr(OrExpr object) {
		// |^ || |
		return constructBinary(object.getLeft(), object.getOp(), object.getRight(), 
				NodeModelUtils.findNodesForFeature(object, GumboPackage.Literals.OR_EXPR__OP).get(0));
	}
	

	@Override
	public Boolean caseAndExpr(AndExpr object) {
		// && &
		return constructBinary(object.getLeft(), object.getOp(), object.getRight(), 
				NodeModelUtils.findNodesForFeature(object, GumboPackage.Literals.AND_EXPR__OP).get(0));
	}

	@Override
	public Boolean caseEqualNotExpr(EqualNotExpr object) {
		// =!= === == != !~
		return constructBinary(object.getLeft(), object.getOp(), object.getRight(), 
				NodeModelUtils.findNodesForFeature(object, GumboPackage.Literals.EQUAL_NOT_EXPR__OP).get(0));
	}

	@Override
	public Boolean caseLtGtExpr(LtGtExpr object) {
		// <<< << <= <
		// >>> >> >= >
		return constructBinary(object.getLeft(), object.getOp(), object.getRight(), 
				NodeModelUtils.findNodesForFeature(object, GumboPackage.Literals.LT_GT_EXPR__OP).get(0));
	}

	@Override
	public Boolean caseColonExpr(ColonExpr object) {
		// :+
		return constructBinary(object.getLeft(), object.getOp(), object.getRight(), 
				NodeModelUtils.findNodesForFeature(object, GumboPackage.Literals.COLON_EXPR__OP).get(0));
	}

	@Override
	public Boolean casePlusMinusExpr(PlusMinusExpr object) {
		// +: ++
		// -~ ~-
		// + -
		return constructBinary(object.getLeft(), object.getOp(), object.getRight(), 
				NodeModelUtils.findNodesForFeature(object, GumboPackage.Literals.PLUS_MINUS_EXPR__OP).get(0));
	}

	@Override
	public Boolean caseMultiplicativeExpr(MultiplicativeExpr object) {
		// * / %
		return constructBinary(object.getLeft(), object.getOp(), object.getRight(), 
				NodeModelUtils.findNodesForFeature(object, GumboPackage.Literals.MULTIPLICATIVE_EXPR__OP).get(0));
	}

	@Override
	public Boolean caseUnaryExpr(UnaryExpr object) {
		// + - !
		UnaryOp slangOp = GumboUtil.toSlangUnaryOp(object.getOp());
		
		INode opNode = NodeModelUtils.findNodesForFeature(object, GumboPackage.Literals.UNARY_EXPR__OP).get(0);
		Position opPos = VisitorUtil.buildPositionFromINode(opNode, VisitorUtil.getResourcePath(object));
		assert opPos != null;
		
		push(Unary$.MODULE$.apply(Exp.UnaryOp$.MODULE$.byName(slangOp.name()).get(), visitPop(object.getExp()),
				GumboUtil.buildResolvedAttr(object), SlangUtil.toSome(opPos)));
		return false;
	}

	@Override
	public Boolean casePostFixExpr(PostFixExpr object) {
		Exp receiver = visitPop(object.getBaseExp());

		if (object.getPosts() == null || object.getPosts().isEmpty()) {
			push(receiver);
		} else {
			for (Postfix postfix : object.getPosts()) {
				if (postfix instanceof MemberAccess) {
					MemberAccess m = (MemberAccess) postfix;
					String member = m.getField().toString();
					Id id = Id$.MODULE$.apply(member, GumboUtil.buildAttr(m));
					Option<Position> posOpt = GumboUtil.mergePositions(receiver.posOpt(), id.attr().posOpt());
					receiver = Select$.MODULE$.apply(SlangUtil.toSome(receiver), // receiverOpt
							id, // id
							VisitorUtil.toISZ(), // targs
							GumboUtil.buildResolvedAttr(posOpt));
				} else {
					ArrayAccess a = (ArrayAccess) postfix;
					Option<Position> aaPosOpt = VisitorUtil.buildPositionOpt(a);
					Option<Position> mergedPos = GumboUtil.mergePositions(receiver.posOpt(), aaPosOpt);
					List<Exp> indexes = new ArrayList<>();
					for (OwnedExpression index : a.getIndex()) {
						indexes.add(visitPop(index));
					}

					if (receiver instanceof Select) {
						Select r = (Select) receiver;
						receiver = Invoke$.MODULE$.apply(//
								r.receiverOpt(), // receiverOpt
								Ident$.MODULE$.apply(r.id(), GumboUtil.buildResolvedAttr(r.id().attr().posOpt())), // ident
								VisitorUtil.toISZ(), // targs
								VisitorUtil.toISZ(indexes), // args
								GumboUtil.buildResolvedAttr(mergedPos));
					} else {
						// e.g. array(0)(1)
						// array(0) will be an Invoke with the ident = 'array'.  That will be wrapped in
						// and Invoke with the ident 'apply' whose resolved info indicates 'apply' is ResolvedInfo.BuiltIn.Kind.Apply
						Invoke r = (Invoke) receiver;
						receiver = Invoke$.MODULE$.apply(//
								SlangUtil.toSome(r), // receiverOpt
								Ident$.MODULE$.apply(Id$.MODULE$.apply("apply", GumboUtil.buildAttr(aaPosOpt)),
										GumboUtil.buildResolvedAttr_BuiltIn_Apply(aaPosOpt)), // ident
								VisitorUtil.toISZ(), // targs
								VisitorUtil.toISZ(indexes), // args
								GumboUtil.buildResolvedAttr(mergedPos));
						assert(true);
					}

				}
			}
			push(receiver);
		}
		return false;
	}

	@Override
	public Boolean caseParenExpr(ParenExpr object) {
		visit(object.getExp());

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

				push(GumboUtil.convertIdStackToSelect(names));

				return false;

			} else {
				slangId = Id$.MODULE$.apply(sdd.getName(),
						GumboUtil.buildAttr(GumboUtil.shrinkPos(selectPos, sdd.getName().length())));
			}

		} else if (receiver instanceof SlangDefParam) {
			SlangDefParam sdp = (SlangDefParam) receiver;

			slangId = Id$.MODULE$.apply(sdp.getName(),
					GumboUtil.buildAttr(GumboUtil.shrinkPos(selectPos, sdp.getName().length())));
		} else if (receiver instanceof QuantParam) {
			QuantParam qp = (QuantParam) receiver;
			
			slangId = Id$.MODULE$.apply(qp.getName(),
					GumboUtil.buildAttr(GumboUtil.shrinkPos(selectPos, qp.getName().length())));
		} else {
			// FIXME: can invoke HAMR even if there are syntax errors in gumbo annexes. OSATE is likely
			// showing the error. Use reporter instead?

			String s = "<invalid>";
			slangId = Id$.MODULE$.apply(s, GumboUtil.buildAttr(selectPos));

			push(Ident$.MODULE$.apply(slangId, GumboUtil.buildResolvedAttr(object)));

			return false;
		}

		/*
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
	
				push(GumboUtil.convertIdStackToSelect(names));
		} else {
			push(Ident$.MODULE$.apply(slangId, GumboUtil.buildResolvedAttr(object)));
		}
*/
		push(Ident$.MODULE$.apply(slangId, GumboUtil.buildResolvedAttr(object)));
		
		return false;
	}
	
	@Override
	public Boolean caseF32Obj(F32Obj object) {
		Ident f32ident = Ident$.MODULE$.apply(Id$.MODULE$.apply("F32", GumboUtil.buildAttr(object)), GumboUtil.buildResolvedAttr(object));
		Id attr = Id$.MODULE$.apply(object.getAttr(), GumboUtil.buildAttr(object));
		push(Select$.MODULE$.apply(SlangUtil.toSome(f32ident), attr, VisitorUtil.toISZ(), GumboUtil.buildResolvedAttr(object)));
		return false;
	}

	@Override
	public Boolean caseF64Obj(F64Obj object) {
		Ident f64ident = Ident$.MODULE$.apply(Id$.MODULE$.apply("64", GumboUtil.buildAttr(object)), GumboUtil.buildResolvedAttr(object));
		Id attr = Id$.MODULE$.apply(object.getAttr(), GumboUtil.buildAttr(object));
		push(Select$.MODULE$.apply(SlangUtil.toSome(f64ident), attr, VisitorUtil.toISZ(), GumboUtil.buildResolvedAttr(object)));
		return false;
	}

	@Override
	public Boolean caseBooleanLit(BooleanLit object) {

		Boolean b = object.getValue().equalsIgnoreCase("t") || object.getValue().equalsIgnoreCase("true"); // only other cases are 'F' and 'false'

		push(LitB$.MODULE$.apply(b, GumboUtil.buildAttr(object)));

		return false;
	}

	@Override
	public Boolean caseF32Lit(F32Lit object) {
		try {
			float f = Float.parseFloat(object.getValue());
			org.sireum.F32 f32 = new org.sireum.F32(f);
			push(Exp.LitF32$.MODULE$.apply(f32, GumboUtil.buildAttr(object)));
		} catch (NumberFormatException v) {
			reportError(object, "'" + object.getValue() + "' is not a valid F32");
		}

		return false;
	}

	@Override
	public Boolean caseF64Lit(F64Lit object) {

		try {
			double d = Double.parseDouble(object.getValue());
			org.sireum.F64 f64 = new org.sireum.F64(d);
			push(Exp.LitF64$.MODULE$.apply(f64, GumboUtil.buildAttr(object)));
		} catch (NumberFormatException e) {
			reportError(object, "'" + object.getValue() + "' is not a valid F64");
		}

		return false;
	}

	@Override
	public Boolean caseHexLit(HexLit object) {
		String hex = object.getValue();
		assert hex.startsWith("0x") || hex.startsWith("0X");
		hex = hex.strip().substring(2);
		
        int decimalValue = 0;
        int base = 16;

        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            int digitValue;

            if (c >= '0' && c <= '9') {
                digitValue = c - '0';
            } else if (c >= 'A' && c <= 'F') {
                digitValue = c - 'A' + 10;
            } else if (c >= 'a' && c <= 'f') {
                digitValue = c - 'a' + 10;
            } else {
                reportError(object, "'" + c + "' is not a valid hex character");
                digitValue = 0;
            }

            decimalValue = decimalValue * base + digitValue;
        }
		return false;
	}
	
	@Override
	public Boolean caseIntegerLit(IntegerLit object) {

		Option<Z> z = Z.apply(object.getValue());
		reportError(z.nonEmpty(), object, "Not a valid Z: " + object.getValue());

		push(LitZ$.MODULE$.apply(z.get(), GumboUtil.buildAttr(object)));

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

		push(GumboUtil.convertIdStackToSelect(names));

		return false;
	}

	@Override
	public Boolean caseResultExpr(ResultExpr object) {

		SlangDefDef def = EcoreUtil2.getContainerOfType(object, SlangDefDef.class);

		DataSubcomponentType dst = def.getType().getTypeName();
		String[] segments = dst.getQualifiedName().split("::");

		List<org.sireum.String> ids = new ArrayList<>();
		for (String s : segments) {
			ids.add(new org.sireum.String(s));
		}

		Typed.Name name = Typed.Name$.MODULE$.apply(VisitorUtil.toISZ(ids), VisitorUtil.toISZ());
		TypedAttr ta = GumboUtil.buildTypedAttr(object, name);

		push(Exp.Result$.MODULE$.apply(SlangUtil.toNone(), ta));

		return false;
	}

	@Override
	public Boolean caseSlangLiteralInterp(SlangLiteralInterp object) {

		String[] parts = object.getSli().split("\"");

		switch (parts[0]) {
		case "z":
			Option<Z> z = Z.apply(parts[1]);
			if (z.nonEmpty()) {
				push(Exp.LitZ$.MODULE$.apply(z.get(), GumboUtil.buildAttr(object)));
			} else {
				reportError(object, "'" + parts[1] + "' is not a valid Z");
			}

			break;
		case "r":
			scala.math.BigDecimal r = new scala.math.BigDecimal(new java.math.BigDecimal(parts[1]));
			push(Exp.LitR$.MODULE$.apply(r, GumboUtil.buildAttr(object)));

			break;
		case "c":
			reportError(parts[1].length() == 1, object, "Expecting a single character");

			int c = parts[1].charAt(0);
			push(Exp.LitC$.MODULE$.apply(c, GumboUtil.buildAttr(object)));

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
		case "string":
			push(Exp.LitString$.MODULE$.apply(parts[1], GumboUtil.buildAttr(object)));

			break;
		default:
			// must be an int lit (eg. u32, s64, etc)

			Option<Z> intLit = Z.apply(parts[1]);
			if (intLit.nonEmpty()) {
				LitString lit = LitString$.MODULE$.apply(parts[1], GumboUtil.buildAttr(object));

				push(StringInterpolate$.MODULE$.apply(parts[0], VisitorUtil.toISZ(lit), VisitorUtil.toISZ(),
						GumboUtil.buildTypedAttr(object)));

			} else {
				reportError(object, "'" + parts[1] + "' is not a valid " + parts[0].substring(0, 1).toUpperCase()
						+ parts[0].substring(1));
			}

			break;
		}

		return false;
	}

	@Override
	public Boolean caseInfoFlowClause(InfoFlowClause object) {
		Function<EObject, Exp> process = (e) -> {
			String name = null;
			if (e instanceof StateVarDecl) {
				name = ((StateVarDecl) e).getName();
			} else if (e instanceof Port) {
				name = ((Port) e).getName();
			} else {
				reportError(e, "Only ports and state variables are allowed in flow from/to clauses");
			}
			Id portId = Id$.MODULE$.apply(name, GumboUtil.buildAttr(e));
			return Ident$.MODULE$.apply(portId, GumboUtil.buildResolvedAttr(e));
		};

		List<Exp> froms = new ArrayList<>();
		for (EObject o : object.getFromPortOrStateVar()) {
			froms.add(process.apply(o));
		}

		List<Exp> tos = new ArrayList<>();
		for (EObject o : object.getToPortOrStateVar()) {
			tos.add(process.apply(o));
		}

		Option<org.sireum.String> descriptor = GumboUtil.getOptionalSlangString(object.getDescriptor());

		push(org.sireum.hamr.ir.InfoFlowClause$.MODULE$.apply(object.getId(), descriptor, VisitorUtil.toISZ(froms),
				VisitorUtil.toISZ(tos), GumboUtil.toAttr(object)));

		return false;
	}

	/*
	 * Util methods below
	 */

	public Boolean visit(EObject o) {
		reportError(isSwitchFor(o.eClass().getEPackage()), o, "Internal error: GumboVisitor is not a switch for " + o);
		return doSwitch(o);
	}

	public <T> T visitPop(EObject o) {
		reportError(isSwitchFor(o.eClass().getEPackage()), o, "Internal error: GumboVisitor is not a switch for " + o);
		doSwitch(o);
		return pop(o);
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

	<T> T pop() {
		return pop(null);
	}

	@SuppressWarnings("unchecked")
	<T> T pop(Object lastVisited) {
		// only report first error
		if (result == null && !reporter.hasError()) {
			RuntimeException e = new RuntimeException("Internal error: visitor stack was empty while trying to pop");
			String trace = e.getMessage() + ": " + e.getStackTrace()[1];

			if (lastVisited != null && lastVisited instanceof EObject) {
				String msg = "Encountered unexpected or unhandled GUMBO node: " + lastVisited + "\n\n" + trace;
				reportError((EObject) lastVisited, msg);
			} else {
				reportError(trace);
			}
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