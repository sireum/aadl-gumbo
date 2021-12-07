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
      case GumboPackage.CASE_STATEMENT_CLAUSE: return createCaseStatementClause();
      case GumboPackage.SPEC_STATEMENT: return createSpecStatement();
      case GumboPackage.ASSUME_STATEMENT: return createAssumeStatement();
      case GumboPackage.ANON_ASSUME_STATEMENT: return createAnonAssumeStatement();
      case GumboPackage.GUARANTEE_STATEMENT: return createGuaranteeStatement();
      case GumboPackage.ANON_GUARANTEE_STATEMENT: return createAnonGuaranteeStatement();
      case GumboPackage.EXPR: return createExpr();
      case GumboPackage.OTHER_DATA_REF: return createOtherDataRef();
      case GumboPackage.DOUBLE_DOT_REF: return createDoubleDotRef();
      case GumboPackage.DATA_ELEMENT: return createDataElement();
      case GumboPackage.SUBCOMPONENT_ELEMENT: return createSubcomponentElement();
      case GumboPackage.BINARY_EXPR: return createBinaryExpr();
      case GumboPackage.UNARY_EXPR: return createUnaryExpr();
      case GumboPackage.DATA_REF_EXPR: return createDataRefExpr();
      case GumboPackage.ENUM_LIT_EXPR: return createEnumLitExpr();
      case GumboPackage.RECORD_LIT_EXPR: return createRecordLitExpr();
      case GumboPackage.INT_LIT: return createIntLit();
      case GumboPackage.REAL_LIT_EXPR: return createRealLitExpr();
      case GumboPackage.BOOL_LIT_EXPR: return createBoolLitExpr();
      case GumboPackage.FLOOR_CAST: return createFloorCast();
      case GumboPackage.REAL_CAST: return createRealCast();
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
  public BinaryExpr createBinaryExpr()
  {
    BinaryExprImpl binaryExpr = new BinaryExprImpl();
    return binaryExpr;
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
  public IntLit createIntLit()
  {
    IntLitImpl intLit = new IntLitImpl();
    return intLit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RealLitExpr createRealLitExpr()
  {
    RealLitExprImpl realLitExpr = new RealLitExprImpl();
    return realLitExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BoolLitExpr createBoolLitExpr()
  {
    BoolLitExprImpl boolLitExpr = new BoolLitExprImpl();
    return boolLitExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FloorCast createFloorCast()
  {
    FloorCastImpl floorCast = new FloorCastImpl();
    return floorCast;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RealCast createRealCast()
  {
    RealCastImpl realCast = new RealCastImpl();
    return realCast;
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
