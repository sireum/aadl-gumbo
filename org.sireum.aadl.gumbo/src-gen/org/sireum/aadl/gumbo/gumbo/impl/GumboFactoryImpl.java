/**
 * Copyright (c) 2021, Kansas State University
 * 
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
 * 
 * 1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 * 
 * 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.sireum.aadl.gumbo.gumbo.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.sireum.aadl.gumbo.gumbo.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GumboFactoryImpl extends EFactoryImpl implements GumboFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GumboFactory init()
  {
    try
    {
      GumboFactory theGumboFactory = (GumboFactory)EPackage.Registry.INSTANCE.getEFactory(GumboPackage.eNS_URI);
      if (theGumboFactory != null)
      {
        return theGumboFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GumboFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GumboFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case GumboPackage.GUMBO_LIBRARY: return createGumboLibrary();
      case GumboPackage.GUMBO_SUBCLAUSE: return createGumboSubclause();
      case GumboPackage.SPEC_SECTION: return createSpecSection();
      case GumboPackage.STATE: return createState();
      case GumboPackage.STATE_VAR_DECL: return createStateVarDecl();
      case GumboPackage.INVARIANTS: return createInvariants();
      case GumboPackage.INV_SPEC: return createInvSpec();
      case GumboPackage.INTEGRATION: return createIntegration();
      case GumboPackage.INITIALIZE: return createInitialize();
      case GumboPackage.INITIALIZE_SPEC_STATEMENT: return createInitializeSpecStatement();
      case GumboPackage.COMPUTE: return createCompute();
      case GumboPackage.INFO_FLOW_CLAUSE: return createInfoFlowClause();
      case GumboPackage.HANDLER_CLAUSE: return createHandlerClause();
      case GumboPackage.CASE_STATEMENT_CLAUSE: return createCaseStatementClause();
      case GumboPackage.SPEC_STATEMENT: return createSpecStatement();
      case GumboPackage.ASSUME_STATEMENT: return createAssumeStatement();
      case GumboPackage.ANON_ASSUME_STATEMENT: return createAnonAssumeStatement();
      case GumboPackage.GUARANTEE_STATEMENT: return createGuaranteeStatement();
      case GumboPackage.ANON_GUARANTEE_STATEMENT: return createAnonGuaranteeStatement();
      case GumboPackage.DATA_ELEMENT: return createDataElement();
      case GumboPackage.SUBCOMPONENT_ELEMENT: return createSubcomponentElement();
      case GumboPackage.FUNCTIONS: return createFunctions();
      case GumboPackage.FUNC_SPEC: return createFuncSpec();
      case GumboPackage.SLANG_DEF_DEF: return createSlangDefDef();
      case GumboPackage.SLANG_DEF_PARAMS: return createSlangDefParams();
      case GumboPackage.SLANG_DEF_PARAM: return createSlangDefParam();
      case GumboPackage.SLANG_TYPE_PARAMS: return createSlangTypeParams();
      case GumboPackage.SLANG_TYPE_PARAM: return createSlangTypeParam();
      case GumboPackage.SLANG_DEF_CONTRACT: return createSlangDefContract();
      case GumboPackage.SLANG_INVARIANT: return createSlangInvariant();
      case GumboPackage.SLANG_REQUIRES: return createSlangRequires();
      case GumboPackage.SLANG_READS: return createSlangReads();
      case GumboPackage.SLANG_MODIFIES: return createSlangModifies();
      case GumboPackage.SLANG_ENSURES: return createSlangEnsures();
      case GumboPackage.SLANG_TYPE: return createSlangType();
      case GumboPackage.SLANG_STMT: return createSlangStmt();
      case GumboPackage.SLANG_ELSE: return createSlangElse();
      case GumboPackage.SLANG_LOOP_CONTRACT: return createSlangLoopContract();
      case GumboPackage.SLANG_CASE: return createSlangCase();
      case GumboPackage.SLANG_PATTERN: return createSlangPattern();
      case GumboPackage.SLANG_TPATTERN: return createSlangTPattern();
      case GumboPackage.SLANG_VAR_DEF: return createSlangVarDef();
      case GumboPackage.SLANG_BLOCK: return createSlangBlock();
      case GumboPackage.OWNED_EXPRESSION: return createOwnedExpression();
      case GumboPackage.GEXPR: return createGExpr();
      case GumboPackage.QUANT_RANGE: return createQuantRange();
      case GumboPackage.QUANT_PARAM: return createQuantParam();
      case GumboPackage.POSTFIX: return createPostfix();
      case GumboPackage.MEMBER_ACCESS: return createMemberAccess();
      case GumboPackage.ARRAY_ACCESS: return createArrayAccess();
      case GumboPackage.OTHER_DATA_REF: return createOtherDataRef();
      case GumboPackage.SLANG_PARAMS: return createSlangParams();
      case GumboPackage.SLANG_PARAM: return createSlangParam();
      case GumboPackage.SLANG_FOR_RANGE: return createSlangForRange();
      case GumboPackage.SLANG_RET: return createSlangRet();
      case GumboPackage.SLANG_CALL_SUFFIX: return createSlangCallSuffix();
      case GumboPackage.SLANG_CALL_ARGS: return createSlangCallArgs();
      case GumboPackage.SLANG_LIT: return createSlangLit();
      case GumboPackage.SLANG_INTERP: return createSlangInterp();
      case GumboPackage.SLANG_IF_STMT: return createSlangIfStmt();
      case GumboPackage.SLANG_WHILE_STMT: return createSlangWhileStmt();
      case GumboPackage.SLANG_MATCH_STMT: return createSlangMatchStmt();
      case GumboPackage.SLANG_SPEC_STMT: return createSlangSpecStmt();
      case GumboPackage.SLANG_ASSUME_STMT: return createSlangAssumeStmt();
      case GumboPackage.SLANG_ASSERT_STMT: return createSlangAssertStmt();
      case GumboPackage.SLANG_HALT_STMT: return createSlangHaltStmt();
      case GumboPackage.SLANG_DO_STMT: return createSlangDoStmt();
      case GumboPackage.IF_ELSE_EXP: return createIfElseExp();
      case GumboPackage.QUANTIFIED_EXP: return createQuantifiedExp();
      case GumboPackage.IMPLIES_EXPR: return createImpliesExpr();
      case GumboPackage.OR_EXPR: return createOrExpr();
      case GumboPackage.AND_EXPR: return createAndExpr();
      case GumboPackage.EQUAL_NOT_EXPR: return createEqualNotExpr();
      case GumboPackage.LT_GT_EXPR: return createLtGtExpr();
      case GumboPackage.COLON_EXPR: return createColonExpr();
      case GumboPackage.PLUS_MINUS_EXPR: return createPlusMinusExpr();
      case GumboPackage.MULTIPLICATIVE_EXPR: return createMultiplicativeExpr();
      case GumboPackage.UNARY_EXPR: return createUnaryExpr();
      case GumboPackage.POST_FIX_EXPR: return createPostFixExpr();
      case GumboPackage.SLANG_LIT_TERM: return createSlangLitTerm();
      case GumboPackage.SLANG_INTERP_TERM: return createSlangInterpTerm();
      case GumboPackage.IN_STATE_EXPR: return createInStateExpr();
      case GumboPackage.MAY_SEND_EXPR: return createMaySendExpr();
      case GumboPackage.MUST_SEND_EXPR: return createMustSendExpr();
      case GumboPackage.NO_SEND_EXPR: return createNoSendExpr();
      case GumboPackage.HAS_EVENT_EXPR: return createHasEventExpr();
      case GumboPackage.ENUM_LIT_EXPR: return createEnumLitExpr();
      case GumboPackage.PAREN_EXPR: return createParenExpr();
      case GumboPackage.SLANG_FOR_TERM: return createSlangForTerm();
      case GumboPackage.SLANG_BLOCK_TERM: return createSlangBlockTerm();
      case GumboPackage.F32_OBJ: return createF32Obj();
      case GumboPackage.F64_OBJ: return createF64Obj();
      case GumboPackage.CALL_EXPR: return createCallExpr();
      case GumboPackage.RECORD_LIT_EXPR: return createRecordLitExpr();
      case GumboPackage.DATA_REF_EXPR: return createDataRefExpr();
      case GumboPackage.RESULT_EXPR: return createResultExpr();
      case GumboPackage.BOOLEAN_LIT: return createBooleanLit();
      case GumboPackage.INTEGER_LIT: return createIntegerLit();
      case GumboPackage.HEX_LIT: return createHexLit();
      case GumboPackage.BIN_LIT: return createBinLit();
      case GumboPackage.F32_LIT: return createF32Lit();
      case GumboPackage.F64_LIT: return createF64Lit();
      case GumboPackage.SLANG_STRING_LIT: return createSlangStringLit();
      case GumboPackage.SLANG_LITERAL_INTERP: return createSlangLiteralInterp();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GumboLibrary createGumboLibrary()
  {
    GumboLibraryImpl gumboLibrary = new GumboLibraryImpl();
    return gumboLibrary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GumboSubclause createGumboSubclause()
  {
    GumboSubclauseImpl gumboSubclause = new GumboSubclauseImpl();
    return gumboSubclause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SpecSection createSpecSection()
  {
    SpecSectionImpl specSection = new SpecSectionImpl();
    return specSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public State createState()
  {
    StateImpl state = new StateImpl();
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StateVarDecl createStateVarDecl()
  {
    StateVarDeclImpl stateVarDecl = new StateVarDeclImpl();
    return stateVarDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Invariants createInvariants()
  {
    InvariantsImpl invariants = new InvariantsImpl();
    return invariants;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InvSpec createInvSpec()
  {
    InvSpecImpl invSpec = new InvSpecImpl();
    return invSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Integration createIntegration()
  {
    IntegrationImpl integration = new IntegrationImpl();
    return integration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Initialize createInitialize()
  {
    InitializeImpl initialize = new InitializeImpl();
    return initialize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InitializeSpecStatement createInitializeSpecStatement()
  {
    InitializeSpecStatementImpl initializeSpecStatement = new InitializeSpecStatementImpl();
    return initializeSpecStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Compute createCompute()
  {
    ComputeImpl compute = new ComputeImpl();
    return compute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InfoFlowClause createInfoFlowClause()
  {
    InfoFlowClauseImpl infoFlowClause = new InfoFlowClauseImpl();
    return infoFlowClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public HandlerClause createHandlerClause()
  {
    HandlerClauseImpl handlerClause = new HandlerClauseImpl();
    return handlerClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CaseStatementClause createCaseStatementClause()
  {
    CaseStatementClauseImpl caseStatementClause = new CaseStatementClauseImpl();
    return caseStatementClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SpecStatement createSpecStatement()
  {
    SpecStatementImpl specStatement = new SpecStatementImpl();
    return specStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AssumeStatement createAssumeStatement()
  {
    AssumeStatementImpl assumeStatement = new AssumeStatementImpl();
    return assumeStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AnonAssumeStatement createAnonAssumeStatement()
  {
    AnonAssumeStatementImpl anonAssumeStatement = new AnonAssumeStatementImpl();
    return anonAssumeStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GuaranteeStatement createGuaranteeStatement()
  {
    GuaranteeStatementImpl guaranteeStatement = new GuaranteeStatementImpl();
    return guaranteeStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AnonGuaranteeStatement createAnonGuaranteeStatement()
  {
    AnonGuaranteeStatementImpl anonGuaranteeStatement = new AnonGuaranteeStatementImpl();
    return anonGuaranteeStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DataElement createDataElement()
  {
    DataElementImpl dataElement = new DataElementImpl();
    return dataElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SubcomponentElement createSubcomponentElement()
  {
    SubcomponentElementImpl subcomponentElement = new SubcomponentElementImpl();
    return subcomponentElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Functions createFunctions()
  {
    FunctionsImpl functions = new FunctionsImpl();
    return functions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FuncSpec createFuncSpec()
  {
    FuncSpecImpl funcSpec = new FuncSpecImpl();
    return funcSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangDefDef createSlangDefDef()
  {
    SlangDefDefImpl slangDefDef = new SlangDefDefImpl();
    return slangDefDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangDefParams createSlangDefParams()
  {
    SlangDefParamsImpl slangDefParams = new SlangDefParamsImpl();
    return slangDefParams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangDefParam createSlangDefParam()
  {
    SlangDefParamImpl slangDefParam = new SlangDefParamImpl();
    return slangDefParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangTypeParams createSlangTypeParams()
  {
    SlangTypeParamsImpl slangTypeParams = new SlangTypeParamsImpl();
    return slangTypeParams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangTypeParam createSlangTypeParam()
  {
    SlangTypeParamImpl slangTypeParam = new SlangTypeParamImpl();
    return slangTypeParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangDefContract createSlangDefContract()
  {
    SlangDefContractImpl slangDefContract = new SlangDefContractImpl();
    return slangDefContract;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangInvariant createSlangInvariant()
  {
    SlangInvariantImpl slangInvariant = new SlangInvariantImpl();
    return slangInvariant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangRequires createSlangRequires()
  {
    SlangRequiresImpl slangRequires = new SlangRequiresImpl();
    return slangRequires;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangReads createSlangReads()
  {
    SlangReadsImpl slangReads = new SlangReadsImpl();
    return slangReads;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangModifies createSlangModifies()
  {
    SlangModifiesImpl slangModifies = new SlangModifiesImpl();
    return slangModifies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangEnsures createSlangEnsures()
  {
    SlangEnsuresImpl slangEnsures = new SlangEnsuresImpl();
    return slangEnsures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangType createSlangType()
  {
    SlangTypeImpl slangType = new SlangTypeImpl();
    return slangType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangStmt createSlangStmt()
  {
    SlangStmtImpl slangStmt = new SlangStmtImpl();
    return slangStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangElse createSlangElse()
  {
    SlangElseImpl slangElse = new SlangElseImpl();
    return slangElse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangLoopContract createSlangLoopContract()
  {
    SlangLoopContractImpl slangLoopContract = new SlangLoopContractImpl();
    return slangLoopContract;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangCase createSlangCase()
  {
    SlangCaseImpl slangCase = new SlangCaseImpl();
    return slangCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangPattern createSlangPattern()
  {
    SlangPatternImpl slangPattern = new SlangPatternImpl();
    return slangPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangTPattern createSlangTPattern()
  {
    SlangTPatternImpl slangTPattern = new SlangTPatternImpl();
    return slangTPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangVarDef createSlangVarDef()
  {
    SlangVarDefImpl slangVarDef = new SlangVarDefImpl();
    return slangVarDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangBlock createSlangBlock()
  {
    SlangBlockImpl slangBlock = new SlangBlockImpl();
    return slangBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OwnedExpression createOwnedExpression()
  {
    OwnedExpressionImpl ownedExpression = new OwnedExpressionImpl();
    return ownedExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GExpr createGExpr()
  {
    GExprImpl gExpr = new GExprImpl();
    return gExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public QuantRange createQuantRange()
  {
    QuantRangeImpl quantRange = new QuantRangeImpl();
    return quantRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public QuantParam createQuantParam()
  {
    QuantParamImpl quantParam = new QuantParamImpl();
    return quantParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Postfix createPostfix()
  {
    PostfixImpl postfix = new PostfixImpl();
    return postfix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MemberAccess createMemberAccess()
  {
    MemberAccessImpl memberAccess = new MemberAccessImpl();
    return memberAccess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArrayAccess createArrayAccess()
  {
    ArrayAccessImpl arrayAccess = new ArrayAccessImpl();
    return arrayAccess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OtherDataRef createOtherDataRef()
  {
    OtherDataRefImpl otherDataRef = new OtherDataRefImpl();
    return otherDataRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangParams createSlangParams()
  {
    SlangParamsImpl slangParams = new SlangParamsImpl();
    return slangParams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangParam createSlangParam()
  {
    SlangParamImpl slangParam = new SlangParamImpl();
    return slangParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangForRange createSlangForRange()
  {
    SlangForRangeImpl slangForRange = new SlangForRangeImpl();
    return slangForRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangRet createSlangRet()
  {
    SlangRetImpl slangRet = new SlangRetImpl();
    return slangRet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangCallSuffix createSlangCallSuffix()
  {
    SlangCallSuffixImpl slangCallSuffix = new SlangCallSuffixImpl();
    return slangCallSuffix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangCallArgs createSlangCallArgs()
  {
    SlangCallArgsImpl slangCallArgs = new SlangCallArgsImpl();
    return slangCallArgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangLit createSlangLit()
  {
    SlangLitImpl slangLit = new SlangLitImpl();
    return slangLit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangInterp createSlangInterp()
  {
    SlangInterpImpl slangInterp = new SlangInterpImpl();
    return slangInterp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangIfStmt createSlangIfStmt()
  {
    SlangIfStmtImpl slangIfStmt = new SlangIfStmtImpl();
    return slangIfStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangWhileStmt createSlangWhileStmt()
  {
    SlangWhileStmtImpl slangWhileStmt = new SlangWhileStmtImpl();
    return slangWhileStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangMatchStmt createSlangMatchStmt()
  {
    SlangMatchStmtImpl slangMatchStmt = new SlangMatchStmtImpl();
    return slangMatchStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangSpecStmt createSlangSpecStmt()
  {
    SlangSpecStmtImpl slangSpecStmt = new SlangSpecStmtImpl();
    return slangSpecStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangAssumeStmt createSlangAssumeStmt()
  {
    SlangAssumeStmtImpl slangAssumeStmt = new SlangAssumeStmtImpl();
    return slangAssumeStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangAssertStmt createSlangAssertStmt()
  {
    SlangAssertStmtImpl slangAssertStmt = new SlangAssertStmtImpl();
    return slangAssertStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangHaltStmt createSlangHaltStmt()
  {
    SlangHaltStmtImpl slangHaltStmt = new SlangHaltStmtImpl();
    return slangHaltStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangDoStmt createSlangDoStmt()
  {
    SlangDoStmtImpl slangDoStmt = new SlangDoStmtImpl();
    return slangDoStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IfElseExp createIfElseExp()
  {
    IfElseExpImpl ifElseExp = new IfElseExpImpl();
    return ifElseExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public QuantifiedExp createQuantifiedExp()
  {
    QuantifiedExpImpl quantifiedExp = new QuantifiedExpImpl();
    return quantifiedExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ImpliesExpr createImpliesExpr()
  {
    ImpliesExprImpl impliesExpr = new ImpliesExprImpl();
    return impliesExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OrExpr createOrExpr()
  {
    OrExprImpl orExpr = new OrExprImpl();
    return orExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AndExpr createAndExpr()
  {
    AndExprImpl andExpr = new AndExprImpl();
    return andExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EqualNotExpr createEqualNotExpr()
  {
    EqualNotExprImpl equalNotExpr = new EqualNotExprImpl();
    return equalNotExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LtGtExpr createLtGtExpr()
  {
    LtGtExprImpl ltGtExpr = new LtGtExprImpl();
    return ltGtExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ColonExpr createColonExpr()
  {
    ColonExprImpl colonExpr = new ColonExprImpl();
    return colonExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PlusMinusExpr createPlusMinusExpr()
  {
    PlusMinusExprImpl plusMinusExpr = new PlusMinusExprImpl();
    return plusMinusExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MultiplicativeExpr createMultiplicativeExpr()
  {
    MultiplicativeExprImpl multiplicativeExpr = new MultiplicativeExprImpl();
    return multiplicativeExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnaryExpr createUnaryExpr()
  {
    UnaryExprImpl unaryExpr = new UnaryExprImpl();
    return unaryExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PostFixExpr createPostFixExpr()
  {
    PostFixExprImpl postFixExpr = new PostFixExprImpl();
    return postFixExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangLitTerm createSlangLitTerm()
  {
    SlangLitTermImpl slangLitTerm = new SlangLitTermImpl();
    return slangLitTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangInterpTerm createSlangInterpTerm()
  {
    SlangInterpTermImpl slangInterpTerm = new SlangInterpTermImpl();
    return slangInterpTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InStateExpr createInStateExpr()
  {
    InStateExprImpl inStateExpr = new InStateExprImpl();
    return inStateExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MaySendExpr createMaySendExpr()
  {
    MaySendExprImpl maySendExpr = new MaySendExprImpl();
    return maySendExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MustSendExpr createMustSendExpr()
  {
    MustSendExprImpl mustSendExpr = new MustSendExprImpl();
    return mustSendExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NoSendExpr createNoSendExpr()
  {
    NoSendExprImpl noSendExpr = new NoSendExprImpl();
    return noSendExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public HasEventExpr createHasEventExpr()
  {
    HasEventExprImpl hasEventExpr = new HasEventExprImpl();
    return hasEventExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EnumLitExpr createEnumLitExpr()
  {
    EnumLitExprImpl enumLitExpr = new EnumLitExprImpl();
    return enumLitExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ParenExpr createParenExpr()
  {
    ParenExprImpl parenExpr = new ParenExprImpl();
    return parenExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangForTerm createSlangForTerm()
  {
    SlangForTermImpl slangForTerm = new SlangForTermImpl();
    return slangForTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangBlockTerm createSlangBlockTerm()
  {
    SlangBlockTermImpl slangBlockTerm = new SlangBlockTermImpl();
    return slangBlockTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public F32Obj createF32Obj()
  {
    F32ObjImpl f32Obj = new F32ObjImpl();
    return f32Obj;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public F64Obj createF64Obj()
  {
    F64ObjImpl f64Obj = new F64ObjImpl();
    return f64Obj;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CallExpr createCallExpr()
  {
    CallExprImpl callExpr = new CallExprImpl();
    return callExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RecordLitExpr createRecordLitExpr()
  {
    RecordLitExprImpl recordLitExpr = new RecordLitExprImpl();
    return recordLitExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DataRefExpr createDataRefExpr()
  {
    DataRefExprImpl dataRefExpr = new DataRefExprImpl();
    return dataRefExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ResultExpr createResultExpr()
  {
    ResultExprImpl resultExpr = new ResultExprImpl();
    return resultExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BooleanLit createBooleanLit()
  {
    BooleanLitImpl booleanLit = new BooleanLitImpl();
    return booleanLit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IntegerLit createIntegerLit()
  {
    IntegerLitImpl integerLit = new IntegerLitImpl();
    return integerLit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public HexLit createHexLit()
  {
    HexLitImpl hexLit = new HexLitImpl();
    return hexLit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BinLit createBinLit()
  {
    BinLitImpl binLit = new BinLitImpl();
    return binLit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public F32Lit createF32Lit()
  {
    F32LitImpl f32Lit = new F32LitImpl();
    return f32Lit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public F64Lit createF64Lit()
  {
    F64LitImpl f64Lit = new F64LitImpl();
    return f64Lit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangStringLit createSlangStringLit()
  {
    SlangStringLitImpl slangStringLit = new SlangStringLitImpl();
    return slangStringLit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangLiteralInterp createSlangLiteralInterp()
  {
    SlangLiteralInterpImpl slangLiteralInterp = new SlangLiteralInterpImpl();
    return slangLiteralInterp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GumboPackage getGumboPackage()
  {
    return (GumboPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GumboPackage getPackage()
  {
    return GumboPackage.eINSTANCE;
  }

} //GumboFactoryImpl
