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
      case GumboPackage.HANDLER_CLAUSE: return createHandlerClause();
      case GumboPackage.CASE_STATEMENT_CLAUSE: return createCaseStatementClause();
      case GumboPackage.SPEC_STATEMENT: return createSpecStatement();
      case GumboPackage.ASSUME_STATEMENT: return createAssumeStatement();
      case GumboPackage.ANON_ASSUME_STATEMENT: return createAnonAssumeStatement();
      case GumboPackage.GUARANTEE_STATEMENT: return createGuaranteeStatement();
      case GumboPackage.IMPLICATION_STATEMENT: return createImplicationStatement();
      case GumboPackage.ANON_GUARANTEE_STATEMENT: return createAnonGuaranteeStatement();
      case GumboPackage.OTHER_DATA_REF: return createOtherDataRef();
      case GumboPackage.DOUBLE_DOT_REF: return createDoubleDotRef();
      case GumboPackage.DATA_ELEMENT: return createDataElement();
      case GumboPackage.SUBCOMPONENT_ELEMENT: return createSubcomponentElement();
      case GumboPackage.FUNCTIONS: return createFunctions();
      case GumboPackage.FUNC_SPEC: return createFuncSpec();
      case GumboPackage.SLANG_DEF_DECL_DEF: return createSlangDefDeclDef();
      case GumboPackage.SLANG_DEF_DECL: return createSlangDefDecl();
      case GumboPackage.SLANG_DEF_DEF: return createSlangDefDef();
      case GumboPackage.SLANG_DEF_EXT: return createSlangDefExt();
      case GumboPackage.SLANG_DEF_PARAMS: return createSlangDefParams();
      case GumboPackage.SLANG_DEF_PARAM: return createSlangDefParam();
      case GumboPackage.SLANG_DEF_CONTRACT: return createSlangDefContract();
      case GumboPackage.SLANG_DEF_CONTRACT_CASE: return createSlangDefContractCase();
      case GumboPackage.SLANG_SUPRS: return createSlangSuprs();
      case GumboPackage.SLANG_SUPR: return createSlangSupr();
      case GumboPackage.SLANG_EXT: return createSlangExt();
      case GumboPackage.SLANG_INVARIANT: return createSlangInvariant();
      case GumboPackage.SLANG_READS: return createSlangReads();
      case GumboPackage.SLANG_REQUIRES: return createSlangRequires();
      case GumboPackage.SLANG_MODIFIES: return createSlangModifies();
      case GumboPackage.SLANG_ENSURES: return createSlangEnsures();
      case GumboPackage.SLANG_STMT: return createSlangStmt();
      case GumboPackage.SLANG_ELSE: return createSlangElse();
      case GumboPackage.SLANG_LOOP_CONTRACT: return createSlangLoopContract();
      case GumboPackage.SLANG_LHS_SUFFIX: return createSlangLHSSuffix();
      case GumboPackage.SLANG_CASE: return createSlangCase();
      case GumboPackage.SLANG_PATTERN: return createSlangPattern();
      case GumboPackage.SLANG_TPATTERN: return createSlangTPattern();
      case GumboPackage.SLANG_VAR_DEF: return createSlangVarDef();
      case GumboPackage.EXPR: return createExpr();
      case GumboPackage.SLANG_QUANT_VAR: return createSlangQuantVar();
      case GumboPackage.SLANG_BLOCK: return createSlangBlock();
      case GumboPackage.SLANG_PARAMS: return createSlangParams();
      case GumboPackage.SLANG_PARAM: return createSlangParam();
      case GumboPackage.SLANG_FOR_RANGE: return createSlangForRange();
      case GumboPackage.SLANG_RET: return createSlangRet();
      case GumboPackage.SLANG_CALL_SUFFIX: return createSlangCallSuffix();
      case GumboPackage.SLANG_CALL_ARGS: return createSlangCallArgs();
      case GumboPackage.SLANG_ID_EXP: return createSlangIDExp();
      case GumboPackage.SLANG_TYPE: return createSlangType();
      case GumboPackage.SLANG_TYPE_ARGS: return createSlangTypeArgs();
      case GumboPackage.SLANG_LIT: return createSlangLit();
      case GumboPackage.SLANG_INTERP: return createSlangInterp();
      case GumboPackage.SLANG_MINTERP: return createSlangMInterp();
      case GumboPackage.SLANG_IF_STMT: return createSlangIfStmt();
      case GumboPackage.SLANG_WHILE_STMT: return createSlangWhileStmt();
      case GumboPackage.SLANG_MATCH_STMT: return createSlangMatchStmt();
      case GumboPackage.SLANG_SPEC_STMT: return createSlangSpecStmt();
      case GumboPackage.SLANG_ASSUME_STMT: return createSlangAssumeStmt();
      case GumboPackage.SLANG_ASSERT_STMT: return createSlangAssertStmt();
      case GumboPackage.SLANG_HALT_STMT: return createSlangHaltStmt();
      case GumboPackage.SLANG_DO_STMT: return createSlangDoStmt();
      case GumboPackage.SLANG_ID_STMT: return createSlangIdStmt();
      case GumboPackage.SLANG_FIELD_LOOKUP: return createSlangFieldLookup();
      case GumboPackage.SLANG_METHOD_CALL: return createSlangMethodCall();
      case GumboPackage.BASIC_EXP: return createBasicExp();
      case GumboPackage.QUANTIFIED_EXP: return createQuantifiedExp();
      case GumboPackage.UNARY_EXP: return createUnaryExp();
      case GumboPackage.SLANG_ACCESS: return createSlangAccess();
      case GumboPackage.SLANG_LIT_TERM: return createSlangLitTerm();
      case GumboPackage.SLANG_INTERP_TERM: return createSlangInterpTerm();
      case GumboPackage.IN_STATE_EXPR: return createInStateExpr();
      case GumboPackage.MAY_SEND_EXPR: return createMaySendExpr();
      case GumboPackage.MUST_SEND_EXPR: return createMustSendExpr();
      case GumboPackage.ENUM_LIT_EXPR: return createEnumLitExpr();
      case GumboPackage.RECORD_LIT_EXPR: return createRecordLitExpr();
      case GumboPackage.DATA_REF_EXPR: return createDataRefExpr();
      case GumboPackage.SLANG_TUPLE_TERM: return createSlangTupleTerm();
      case GumboPackage.SLANG_FOR_TERM: return createSlangForTerm();
      case GumboPackage.SLANG_BLOCK_TERM: return createSlangBlockTerm();
      case GumboPackage.BOOLEAN_LIT: return createBooleanLit();
      case GumboPackage.INTEGER_LIT: return createIntegerLit();
      case GumboPackage.INT_IDF_LIT: return createIntIdfLit();
      case GumboPackage.HEX_LIT: return createHexLit();
      case GumboPackage.BIN_LIT: return createBinLit();
      case GumboPackage.REAL_LIT: return createRealLit();
      case GumboPackage.SLANG_STRING_LIT: return createSlangStringLit();
      case GumboPackage.REAL_IDF_LIT: return createRealIdfLit();
      case GumboPackage.MSTRING_LIT: return createMStringLit();
      case GumboPackage.SLANG_MSP_INTERP: return createSlangMspInterp();
      case GumboPackage.SLANG_LITERAL_INTERP: return createSlangLiteralInterp();
      case GumboPackage.SLANG_MSPB_INTERP: return createSlangMspbInterp();
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
  public ImplicationStatement createImplicationStatement()
  {
    ImplicationStatementImpl implicationStatement = new ImplicationStatementImpl();
    return implicationStatement;
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
  public DoubleDotRef createDoubleDotRef()
  {
    DoubleDotRefImpl doubleDotRef = new DoubleDotRefImpl();
    return doubleDotRef;
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
  public SlangDefDeclDef createSlangDefDeclDef()
  {
    SlangDefDeclDefImpl slangDefDeclDef = new SlangDefDeclDefImpl();
    return slangDefDeclDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangDefDecl createSlangDefDecl()
  {
    SlangDefDeclImpl slangDefDecl = new SlangDefDeclImpl();
    return slangDefDecl;
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
  public SlangDefExt createSlangDefExt()
  {
    SlangDefExtImpl slangDefExt = new SlangDefExtImpl();
    return slangDefExt;
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
  public SlangDefContractCase createSlangDefContractCase()
  {
    SlangDefContractCaseImpl slangDefContractCase = new SlangDefContractCaseImpl();
    return slangDefContractCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangSuprs createSlangSuprs()
  {
    SlangSuprsImpl slangSuprs = new SlangSuprsImpl();
    return slangSuprs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangSupr createSlangSupr()
  {
    SlangSuprImpl slangSupr = new SlangSuprImpl();
    return slangSupr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangExt createSlangExt()
  {
    SlangExtImpl slangExt = new SlangExtImpl();
    return slangExt;
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
  public SlangLHSSuffix createSlangLHSSuffix()
  {
    SlangLHSSuffixImpl slangLHSSuffix = new SlangLHSSuffixImpl();
    return slangLHSSuffix;
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
  public Expr createExpr()
  {
    ExprImpl expr = new ExprImpl();
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangQuantVar createSlangQuantVar()
  {
    SlangQuantVarImpl slangQuantVar = new SlangQuantVarImpl();
    return slangQuantVar;
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
  public SlangIDExp createSlangIDExp()
  {
    SlangIDExpImpl slangIDExp = new SlangIDExpImpl();
    return slangIDExp;
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
  public SlangTypeArgs createSlangTypeArgs()
  {
    SlangTypeArgsImpl slangTypeArgs = new SlangTypeArgsImpl();
    return slangTypeArgs;
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
  public SlangMInterp createSlangMInterp()
  {
    SlangMInterpImpl slangMInterp = new SlangMInterpImpl();
    return slangMInterp;
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
  public SlangIdStmt createSlangIdStmt()
  {
    SlangIdStmtImpl slangIdStmt = new SlangIdStmtImpl();
    return slangIdStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangFieldLookup createSlangFieldLookup()
  {
    SlangFieldLookupImpl slangFieldLookup = new SlangFieldLookupImpl();
    return slangFieldLookup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangMethodCall createSlangMethodCall()
  {
    SlangMethodCallImpl slangMethodCall = new SlangMethodCallImpl();
    return slangMethodCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BasicExp createBasicExp()
  {
    BasicExpImpl basicExp = new BasicExpImpl();
    return basicExp;
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
  public UnaryExp createUnaryExp()
  {
    UnaryExpImpl unaryExp = new UnaryExpImpl();
    return unaryExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangAccess createSlangAccess()
  {
    SlangAccessImpl slangAccess = new SlangAccessImpl();
    return slangAccess;
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
  public SlangTupleTerm createSlangTupleTerm()
  {
    SlangTupleTermImpl slangTupleTerm = new SlangTupleTermImpl();
    return slangTupleTerm;
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
  public IntIdfLit createIntIdfLit()
  {
    IntIdfLitImpl intIdfLit = new IntIdfLitImpl();
    return intIdfLit;
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
  public RealLit createRealLit()
  {
    RealLitImpl realLit = new RealLitImpl();
    return realLit;
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
  public RealIdfLit createRealIdfLit()
  {
    RealIdfLitImpl realIdfLit = new RealIdfLitImpl();
    return realIdfLit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MStringLit createMStringLit()
  {
    MStringLitImpl mStringLit = new MStringLitImpl();
    return mStringLit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangMspInterp createSlangMspInterp()
  {
    SlangMspInterpImpl slangMspInterp = new SlangMspInterpImpl();
    return slangMspInterp;
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
  public SlangMspbInterp createSlangMspbInterp()
  {
    SlangMspbInterpImpl slangMspbInterp = new SlangMspbInterpImpl();
    return slangMspbInterp;
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
