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
package org.sireum.aadl.gumbo.gumbo.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.AnnexLibrary;
import org.osate.aadl2.AnnexSubclause;
import org.osate.aadl2.Element;
import org.osate.aadl2.ModalElement;
import org.osate.aadl2.NamedElement;

import org.sireum.aadl.gumbo.gumbo.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.sireum.aadl.gumbo.gumbo.GumboPackage
 * @generated
 */
public class GumboAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GumboPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GumboAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = GumboPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GumboSwitch<Adapter> modelSwitch =
    new GumboSwitch<Adapter>()
    {
      @Override
      public Adapter caseGumboLibrary(GumboLibrary object)
      {
        return createGumboLibraryAdapter();
      }
      @Override
      public Adapter caseGumboSubclause(GumboSubclause object)
      {
        return createGumboSubclauseAdapter();
      }
      @Override
      public Adapter caseSpecSection(SpecSection object)
      {
        return createSpecSectionAdapter();
      }
      @Override
      public Adapter caseState(State object)
      {
        return createStateAdapter();
      }
      @Override
      public Adapter caseStateVarDecl(StateVarDecl object)
      {
        return createStateVarDeclAdapter();
      }
      @Override
      public Adapter caseInvariants(Invariants object)
      {
        return createInvariantsAdapter();
      }
      @Override
      public Adapter caseInvSpec(InvSpec object)
      {
        return createInvSpecAdapter();
      }
      @Override
      public Adapter caseIntegration(Integration object)
      {
        return createIntegrationAdapter();
      }
      @Override
      public Adapter caseInitialize(Initialize object)
      {
        return createInitializeAdapter();
      }
      @Override
      public Adapter caseInitializeSpecStatement(InitializeSpecStatement object)
      {
        return createInitializeSpecStatementAdapter();
      }
      @Override
      public Adapter caseCompute(Compute object)
      {
        return createComputeAdapter();
      }
      @Override
      public Adapter caseHandlerClause(HandlerClause object)
      {
        return createHandlerClauseAdapter();
      }
      @Override
      public Adapter caseCaseStatementClause(CaseStatementClause object)
      {
        return createCaseStatementClauseAdapter();
      }
      @Override
      public Adapter caseSpecStatement(SpecStatement object)
      {
        return createSpecStatementAdapter();
      }
      @Override
      public Adapter caseAssumeStatement(AssumeStatement object)
      {
        return createAssumeStatementAdapter();
      }
      @Override
      public Adapter caseAnonAssumeStatement(AnonAssumeStatement object)
      {
        return createAnonAssumeStatementAdapter();
      }
      @Override
      public Adapter caseGuaranteeStatement(GuaranteeStatement object)
      {
        return createGuaranteeStatementAdapter();
      }
      @Override
      public Adapter caseAnonGuaranteeStatement(AnonGuaranteeStatement object)
      {
        return createAnonGuaranteeStatementAdapter();
      }
      @Override
      public Adapter caseOtherDataRef(OtherDataRef object)
      {
        return createOtherDataRefAdapter();
      }
      @Override
      public Adapter caseDoubleDotRef(DoubleDotRef object)
      {
        return createDoubleDotRefAdapter();
      }
      @Override
      public Adapter caseDataElement(DataElement object)
      {
        return createDataElementAdapter();
      }
      @Override
      public Adapter caseSubcomponentElement(SubcomponentElement object)
      {
        return createSubcomponentElementAdapter();
      }
      @Override
      public Adapter caseFunctions(Functions object)
      {
        return createFunctionsAdapter();
      }
      @Override
      public Adapter caseFuncSpec(FuncSpec object)
      {
        return createFuncSpecAdapter();
      }
      @Override
      public Adapter caseSlangDefDeclDef(SlangDefDeclDef object)
      {
        return createSlangDefDeclDefAdapter();
      }
      @Override
      public Adapter caseSlangDefDecl(SlangDefDecl object)
      {
        return createSlangDefDeclAdapter();
      }
      @Override
      public Adapter caseSlangDefDef(SlangDefDef object)
      {
        return createSlangDefDefAdapter();
      }
      @Override
      public Adapter caseSlangDefExt(SlangDefExt object)
      {
        return createSlangDefExtAdapter();
      }
      @Override
      public Adapter caseSlangDefParams(SlangDefParams object)
      {
        return createSlangDefParamsAdapter();
      }
      @Override
      public Adapter caseSlangDefParam(SlangDefParam object)
      {
        return createSlangDefParamAdapter();
      }
      @Override
      public Adapter caseSlangTypeParams(SlangTypeParams object)
      {
        return createSlangTypeParamsAdapter();
      }
      @Override
      public Adapter caseSlangTypeParam(SlangTypeParam object)
      {
        return createSlangTypeParamAdapter();
      }
      @Override
      public Adapter caseSlangDefContract(SlangDefContract object)
      {
        return createSlangDefContractAdapter();
      }
      @Override
      public Adapter caseSlangDefContractCase(SlangDefContractCase object)
      {
        return createSlangDefContractCaseAdapter();
      }
      @Override
      public Adapter caseSlangSuprs(SlangSuprs object)
      {
        return createSlangSuprsAdapter();
      }
      @Override
      public Adapter caseSlangSupr(SlangSupr object)
      {
        return createSlangSuprAdapter();
      }
      @Override
      public Adapter caseSlangExt(SlangExt object)
      {
        return createSlangExtAdapter();
      }
      @Override
      public Adapter caseSlangInvariant(SlangInvariant object)
      {
        return createSlangInvariantAdapter();
      }
      @Override
      public Adapter caseSlangReads(SlangReads object)
      {
        return createSlangReadsAdapter();
      }
      @Override
      public Adapter caseSlangRequires(SlangRequires object)
      {
        return createSlangRequiresAdapter();
      }
      @Override
      public Adapter caseSlangModifies(SlangModifies object)
      {
        return createSlangModifiesAdapter();
      }
      @Override
      public Adapter caseSlangEnsures(SlangEnsures object)
      {
        return createSlangEnsuresAdapter();
      }
      @Override
      public Adapter caseSlangStmt(SlangStmt object)
      {
        return createSlangStmtAdapter();
      }
      @Override
      public Adapter caseSlangElse(SlangElse object)
      {
        return createSlangElseAdapter();
      }
      @Override
      public Adapter caseSlangLoopContract(SlangLoopContract object)
      {
        return createSlangLoopContractAdapter();
      }
      @Override
      public Adapter caseSlangLHSSuffix(SlangLHSSuffix object)
      {
        return createSlangLHSSuffixAdapter();
      }
      @Override
      public Adapter caseSlangCase(SlangCase object)
      {
        return createSlangCaseAdapter();
      }
      @Override
      public Adapter caseSlangPattern(SlangPattern object)
      {
        return createSlangPatternAdapter();
      }
      @Override
      public Adapter caseSlangTPattern(SlangTPattern object)
      {
        return createSlangTPatternAdapter();
      }
      @Override
      public Adapter caseSlangVarDef(SlangVarDef object)
      {
        return createSlangVarDefAdapter();
      }
      @Override
      public Adapter caseExpr(Expr object)
      {
        return createExprAdapter();
      }
      @Override
      public Adapter caseSlangQuantVar(SlangQuantVar object)
      {
        return createSlangQuantVarAdapter();
      }
      @Override
      public Adapter caseSlangBlock(SlangBlock object)
      {
        return createSlangBlockAdapter();
      }
      @Override
      public Adapter caseSlangParams(SlangParams object)
      {
        return createSlangParamsAdapter();
      }
      @Override
      public Adapter caseSlangParam(SlangParam object)
      {
        return createSlangParamAdapter();
      }
      @Override
      public Adapter caseSlangForRange(SlangForRange object)
      {
        return createSlangForRangeAdapter();
      }
      @Override
      public Adapter caseSlangRet(SlangRet object)
      {
        return createSlangRetAdapter();
      }
      @Override
      public Adapter caseSlangCallSuffix(SlangCallSuffix object)
      {
        return createSlangCallSuffixAdapter();
      }
      @Override
      public Adapter caseSlangCallArgs(SlangCallArgs object)
      {
        return createSlangCallArgsAdapter();
      }
      @Override
      public Adapter caseSlangIDExp(SlangIDExp object)
      {
        return createSlangIDExpAdapter();
      }
      @Override
      public Adapter caseSlangType(SlangType object)
      {
        return createSlangTypeAdapter();
      }
      @Override
      public Adapter caseSlangTypeArgs(SlangTypeArgs object)
      {
        return createSlangTypeArgsAdapter();
      }
      @Override
      public Adapter caseSlangLit(SlangLit object)
      {
        return createSlangLitAdapter();
      }
      @Override
      public Adapter caseSlangInterp(SlangInterp object)
      {
        return createSlangInterpAdapter();
      }
      @Override
      public Adapter caseSlangMInterp(SlangMInterp object)
      {
        return createSlangMInterpAdapter();
      }
      @Override
      public Adapter caseSlangIfStmt(SlangIfStmt object)
      {
        return createSlangIfStmtAdapter();
      }
      @Override
      public Adapter caseSlangWhileStmt(SlangWhileStmt object)
      {
        return createSlangWhileStmtAdapter();
      }
      @Override
      public Adapter caseSlangMatchStmt(SlangMatchStmt object)
      {
        return createSlangMatchStmtAdapter();
      }
      @Override
      public Adapter caseSlangSpecStmt(SlangSpecStmt object)
      {
        return createSlangSpecStmtAdapter();
      }
      @Override
      public Adapter caseSlangAssumeStmt(SlangAssumeStmt object)
      {
        return createSlangAssumeStmtAdapter();
      }
      @Override
      public Adapter caseSlangAssertStmt(SlangAssertStmt object)
      {
        return createSlangAssertStmtAdapter();
      }
      @Override
      public Adapter caseSlangHaltStmt(SlangHaltStmt object)
      {
        return createSlangHaltStmtAdapter();
      }
      @Override
      public Adapter caseSlangDoStmt(SlangDoStmt object)
      {
        return createSlangDoStmtAdapter();
      }
      @Override
      public Adapter caseSlangIdStmt(SlangIdStmt object)
      {
        return createSlangIdStmtAdapter();
      }
      @Override
      public Adapter caseSlangFieldLookup(SlangFieldLookup object)
      {
        return createSlangFieldLookupAdapter();
      }
      @Override
      public Adapter caseSlangMethodCall(SlangMethodCall object)
      {
        return createSlangMethodCallAdapter();
      }
      @Override
      public Adapter caseBasicExp(BasicExp object)
      {
        return createBasicExpAdapter();
      }
      @Override
      public Adapter caseQuantifiedExp(QuantifiedExp object)
      {
        return createQuantifiedExpAdapter();
      }
      @Override
      public Adapter caseUnaryExp(UnaryExp object)
      {
        return createUnaryExpAdapter();
      }
      @Override
      public Adapter caseSlangAccess(SlangAccess object)
      {
        return createSlangAccessAdapter();
      }
      @Override
      public Adapter caseSlangLitTerm(SlangLitTerm object)
      {
        return createSlangLitTermAdapter();
      }
      @Override
      public Adapter caseSlangInterpTerm(SlangInterpTerm object)
      {
        return createSlangInterpTermAdapter();
      }
      @Override
      public Adapter caseInStateExpr(InStateExpr object)
      {
        return createInStateExprAdapter();
      }
      @Override
      public Adapter caseMaySendExpr(MaySendExpr object)
      {
        return createMaySendExprAdapter();
      }
      @Override
      public Adapter caseMustSendExpr(MustSendExpr object)
      {
        return createMustSendExprAdapter();
      }
      @Override
      public Adapter caseNoSendExpr(NoSendExpr object)
      {
        return createNoSendExprAdapter();
      }
      @Override
      public Adapter caseEnumLitExpr(EnumLitExpr object)
      {
        return createEnumLitExprAdapter();
      }
      @Override
      public Adapter caseRecordLitExpr(RecordLitExpr object)
      {
        return createRecordLitExprAdapter();
      }
      @Override
      public Adapter caseDataRefExpr(DataRefExpr object)
      {
        return createDataRefExprAdapter();
      }
      @Override
      public Adapter caseSlangTupleTerm(SlangTupleTerm object)
      {
        return createSlangTupleTermAdapter();
      }
      @Override
      public Adapter caseSlangForTerm(SlangForTerm object)
      {
        return createSlangForTermAdapter();
      }
      @Override
      public Adapter caseSlangBlockTerm(SlangBlockTerm object)
      {
        return createSlangBlockTermAdapter();
      }
      @Override
      public Adapter caseBooleanLit(BooleanLit object)
      {
        return createBooleanLitAdapter();
      }
      @Override
      public Adapter caseIntegerLit(IntegerLit object)
      {
        return createIntegerLitAdapter();
      }
      @Override
      public Adapter caseIntIdfLit(IntIdfLit object)
      {
        return createIntIdfLitAdapter();
      }
      @Override
      public Adapter caseHexLit(HexLit object)
      {
        return createHexLitAdapter();
      }
      @Override
      public Adapter caseBinLit(BinLit object)
      {
        return createBinLitAdapter();
      }
      @Override
      public Adapter caseRealLit(RealLit object)
      {
        return createRealLitAdapter();
      }
      @Override
      public Adapter caseSlangStringLit(SlangStringLit object)
      {
        return createSlangStringLitAdapter();
      }
      @Override
      public Adapter caseRealIdfLit(RealIdfLit object)
      {
        return createRealIdfLitAdapter();
      }
      @Override
      public Adapter caseMStringLit(MStringLit object)
      {
        return createMStringLitAdapter();
      }
      @Override
      public Adapter caseSlangMspInterp(SlangMspInterp object)
      {
        return createSlangMspInterpAdapter();
      }
      @Override
      public Adapter caseSlangLiteralInterp(SlangLiteralInterp object)
      {
        return createSlangLiteralInterpAdapter();
      }
      @Override
      public Adapter caseSlangMspbInterp(SlangMspbInterp object)
      {
        return createSlangMspbInterpAdapter();
      }
      @Override
      public Adapter caseElement(Element object)
      {
        return createElementAdapter();
      }
      @Override
      public Adapter caseNamedElement(NamedElement object)
      {
        return createNamedElementAdapter();
      }
      @Override
      public Adapter caseAnnexLibrary(AnnexLibrary object)
      {
        return createAnnexLibraryAdapter();
      }
      @Override
      public Adapter caseModalElement(ModalElement object)
      {
        return createModalElementAdapter();
      }
      @Override
      public Adapter caseAnnexSubclause(AnnexSubclause object)
      {
        return createAnnexSubclauseAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.GumboLibrary <em>Library</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.GumboLibrary
   * @generated
   */
  public Adapter createGumboLibraryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.GumboSubclause <em>Subclause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.GumboSubclause
   * @generated
   */
  public Adapter createGumboSubclauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SpecSection <em>Spec Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SpecSection
   * @generated
   */
  public Adapter createSpecSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.State
   * @generated
   */
  public Adapter createStateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.StateVarDecl <em>State Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.StateVarDecl
   * @generated
   */
  public Adapter createStateVarDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.Invariants <em>Invariants</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.Invariants
   * @generated
   */
  public Adapter createInvariantsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.InvSpec <em>Inv Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.InvSpec
   * @generated
   */
  public Adapter createInvSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.Integration <em>Integration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.Integration
   * @generated
   */
  public Adapter createIntegrationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.Initialize <em>Initialize</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.Initialize
   * @generated
   */
  public Adapter createInitializeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.InitializeSpecStatement <em>Initialize Spec Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.InitializeSpecStatement
   * @generated
   */
  public Adapter createInitializeSpecStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.Compute <em>Compute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.Compute
   * @generated
   */
  public Adapter createComputeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.HandlerClause <em>Handler Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.HandlerClause
   * @generated
   */
  public Adapter createHandlerClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.CaseStatementClause <em>Case Statement Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.CaseStatementClause
   * @generated
   */
  public Adapter createCaseStatementClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SpecStatement <em>Spec Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SpecStatement
   * @generated
   */
  public Adapter createSpecStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.AssumeStatement <em>Assume Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.AssumeStatement
   * @generated
   */
  public Adapter createAssumeStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.AnonAssumeStatement <em>Anon Assume Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.AnonAssumeStatement
   * @generated
   */
  public Adapter createAnonAssumeStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.GuaranteeStatement <em>Guarantee Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.GuaranteeStatement
   * @generated
   */
  public Adapter createGuaranteeStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.AnonGuaranteeStatement <em>Anon Guarantee Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.AnonGuaranteeStatement
   * @generated
   */
  public Adapter createAnonGuaranteeStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.OtherDataRef <em>Other Data Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.OtherDataRef
   * @generated
   */
  public Adapter createOtherDataRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.DoubleDotRef <em>Double Dot Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.DoubleDotRef
   * @generated
   */
  public Adapter createDoubleDotRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.DataElement <em>Data Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.DataElement
   * @generated
   */
  public Adapter createDataElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SubcomponentElement <em>Subcomponent Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SubcomponentElement
   * @generated
   */
  public Adapter createSubcomponentElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.Functions <em>Functions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.Functions
   * @generated
   */
  public Adapter createFunctionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.FuncSpec <em>Func Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.FuncSpec
   * @generated
   */
  public Adapter createFuncSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangDefDeclDef <em>Slang Def Decl Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefDeclDef
   * @generated
   */
  public Adapter createSlangDefDeclDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangDefDecl <em>Slang Def Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefDecl
   * @generated
   */
  public Adapter createSlangDefDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangDefDef <em>Slang Def Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefDef
   * @generated
   */
  public Adapter createSlangDefDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangDefExt <em>Slang Def Ext</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefExt
   * @generated
   */
  public Adapter createSlangDefExtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangDefParams <em>Slang Def Params</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefParams
   * @generated
   */
  public Adapter createSlangDefParamsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangDefParam <em>Slang Def Param</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefParam
   * @generated
   */
  public Adapter createSlangDefParamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangTypeParams <em>Slang Type Params</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangTypeParams
   * @generated
   */
  public Adapter createSlangTypeParamsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangTypeParam <em>Slang Type Param</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangTypeParam
   * @generated
   */
  public Adapter createSlangTypeParamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangDefContract <em>Slang Def Contract</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefContract
   * @generated
   */
  public Adapter createSlangDefContractAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangDefContractCase <em>Slang Def Contract Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefContractCase
   * @generated
   */
  public Adapter createSlangDefContractCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangSuprs <em>Slang Suprs</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangSuprs
   * @generated
   */
  public Adapter createSlangSuprsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangSupr <em>Slang Supr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangSupr
   * @generated
   */
  public Adapter createSlangSuprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangExt <em>Slang Ext</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangExt
   * @generated
   */
  public Adapter createSlangExtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangInvariant <em>Slang Invariant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangInvariant
   * @generated
   */
  public Adapter createSlangInvariantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangReads <em>Slang Reads</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangReads
   * @generated
   */
  public Adapter createSlangReadsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangRequires <em>Slang Requires</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangRequires
   * @generated
   */
  public Adapter createSlangRequiresAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangModifies <em>Slang Modifies</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangModifies
   * @generated
   */
  public Adapter createSlangModifiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangEnsures <em>Slang Ensures</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangEnsures
   * @generated
   */
  public Adapter createSlangEnsuresAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangStmt <em>Slang Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangStmt
   * @generated
   */
  public Adapter createSlangStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangElse <em>Slang Else</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangElse
   * @generated
   */
  public Adapter createSlangElseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangLoopContract <em>Slang Loop Contract</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangLoopContract
   * @generated
   */
  public Adapter createSlangLoopContractAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangLHSSuffix <em>Slang LHS Suffix</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangLHSSuffix
   * @generated
   */
  public Adapter createSlangLHSSuffixAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangCase <em>Slang Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangCase
   * @generated
   */
  public Adapter createSlangCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangPattern <em>Slang Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangPattern
   * @generated
   */
  public Adapter createSlangPatternAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangTPattern <em>Slang TPattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangTPattern
   * @generated
   */
  public Adapter createSlangTPatternAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangVarDef <em>Slang Var Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangVarDef
   * @generated
   */
  public Adapter createSlangVarDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.Expr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.Expr
   * @generated
   */
  public Adapter createExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangQuantVar <em>Slang Quant Var</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangQuantVar
   * @generated
   */
  public Adapter createSlangQuantVarAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangBlock <em>Slang Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangBlock
   * @generated
   */
  public Adapter createSlangBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangParams <em>Slang Params</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangParams
   * @generated
   */
  public Adapter createSlangParamsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangParam <em>Slang Param</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangParam
   * @generated
   */
  public Adapter createSlangParamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangForRange <em>Slang For Range</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangForRange
   * @generated
   */
  public Adapter createSlangForRangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangRet <em>Slang Ret</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangRet
   * @generated
   */
  public Adapter createSlangRetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangCallSuffix <em>Slang Call Suffix</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangCallSuffix
   * @generated
   */
  public Adapter createSlangCallSuffixAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangCallArgs <em>Slang Call Args</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangCallArgs
   * @generated
   */
  public Adapter createSlangCallArgsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangIDExp <em>Slang ID Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangIDExp
   * @generated
   */
  public Adapter createSlangIDExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangType <em>Slang Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangType
   * @generated
   */
  public Adapter createSlangTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangTypeArgs <em>Slang Type Args</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangTypeArgs
   * @generated
   */
  public Adapter createSlangTypeArgsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangLit <em>Slang Lit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangLit
   * @generated
   */
  public Adapter createSlangLitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangInterp <em>Slang Interp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangInterp
   * @generated
   */
  public Adapter createSlangInterpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangMInterp <em>Slang MInterp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangMInterp
   * @generated
   */
  public Adapter createSlangMInterpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangIfStmt <em>Slang If Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangIfStmt
   * @generated
   */
  public Adapter createSlangIfStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangWhileStmt <em>Slang While Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangWhileStmt
   * @generated
   */
  public Adapter createSlangWhileStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangMatchStmt <em>Slang Match Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangMatchStmt
   * @generated
   */
  public Adapter createSlangMatchStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangSpecStmt <em>Slang Spec Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangSpecStmt
   * @generated
   */
  public Adapter createSlangSpecStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangAssumeStmt <em>Slang Assume Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangAssumeStmt
   * @generated
   */
  public Adapter createSlangAssumeStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangAssertStmt <em>Slang Assert Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangAssertStmt
   * @generated
   */
  public Adapter createSlangAssertStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangHaltStmt <em>Slang Halt Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangHaltStmt
   * @generated
   */
  public Adapter createSlangHaltStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangDoStmt <em>Slang Do Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDoStmt
   * @generated
   */
  public Adapter createSlangDoStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangIdStmt <em>Slang Id Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangIdStmt
   * @generated
   */
  public Adapter createSlangIdStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangFieldLookup <em>Slang Field Lookup</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangFieldLookup
   * @generated
   */
  public Adapter createSlangFieldLookupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangMethodCall <em>Slang Method Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangMethodCall
   * @generated
   */
  public Adapter createSlangMethodCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.BasicExp <em>Basic Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.BasicExp
   * @generated
   */
  public Adapter createBasicExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.QuantifiedExp <em>Quantified Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.QuantifiedExp
   * @generated
   */
  public Adapter createQuantifiedExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.UnaryExp <em>Unary Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.UnaryExp
   * @generated
   */
  public Adapter createUnaryExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangAccess <em>Slang Access</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangAccess
   * @generated
   */
  public Adapter createSlangAccessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangLitTerm <em>Slang Lit Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangLitTerm
   * @generated
   */
  public Adapter createSlangLitTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangInterpTerm <em>Slang Interp Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangInterpTerm
   * @generated
   */
  public Adapter createSlangInterpTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.InStateExpr <em>In State Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.InStateExpr
   * @generated
   */
  public Adapter createInStateExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.MaySendExpr <em>May Send Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.MaySendExpr
   * @generated
   */
  public Adapter createMaySendExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.MustSendExpr <em>Must Send Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.MustSendExpr
   * @generated
   */
  public Adapter createMustSendExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.NoSendExpr <em>No Send Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.NoSendExpr
   * @generated
   */
  public Adapter createNoSendExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.EnumLitExpr <em>Enum Lit Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.EnumLitExpr
   * @generated
   */
  public Adapter createEnumLitExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.RecordLitExpr <em>Record Lit Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.RecordLitExpr
   * @generated
   */
  public Adapter createRecordLitExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.DataRefExpr <em>Data Ref Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.DataRefExpr
   * @generated
   */
  public Adapter createDataRefExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangTupleTerm <em>Slang Tuple Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangTupleTerm
   * @generated
   */
  public Adapter createSlangTupleTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangForTerm <em>Slang For Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangForTerm
   * @generated
   */
  public Adapter createSlangForTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangBlockTerm <em>Slang Block Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangBlockTerm
   * @generated
   */
  public Adapter createSlangBlockTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.BooleanLit <em>Boolean Lit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.BooleanLit
   * @generated
   */
  public Adapter createBooleanLitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.IntegerLit <em>Integer Lit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.IntegerLit
   * @generated
   */
  public Adapter createIntegerLitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.IntIdfLit <em>Int Idf Lit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.IntIdfLit
   * @generated
   */
  public Adapter createIntIdfLitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.HexLit <em>Hex Lit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.HexLit
   * @generated
   */
  public Adapter createHexLitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.BinLit <em>Bin Lit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.BinLit
   * @generated
   */
  public Adapter createBinLitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.RealLit <em>Real Lit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.RealLit
   * @generated
   */
  public Adapter createRealLitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangStringLit <em>Slang String Lit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangStringLit
   * @generated
   */
  public Adapter createSlangStringLitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.RealIdfLit <em>Real Idf Lit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.RealIdfLit
   * @generated
   */
  public Adapter createRealIdfLitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.MStringLit <em>MString Lit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.MStringLit
   * @generated
   */
  public Adapter createMStringLitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangMspInterp <em>Slang Msp Interp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangMspInterp
   * @generated
   */
  public Adapter createSlangMspInterpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangLiteralInterp <em>Slang Literal Interp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangLiteralInterp
   * @generated
   */
  public Adapter createSlangLiteralInterpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sireum.aadl.gumbo.gumbo.SlangMspbInterp <em>Slang Mspb Interp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sireum.aadl.gumbo.gumbo.SlangMspbInterp
   * @generated
   */
  public Adapter createSlangMspbInterpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.aadl2.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.aadl2.Element
   * @generated
   */
  public Adapter createElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.aadl2.NamedElement <em>Named Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.aadl2.NamedElement
   * @generated
   */
  public Adapter createNamedElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.aadl2.AnnexLibrary <em>Annex Library</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.aadl2.AnnexLibrary
   * @generated
   */
  public Adapter createAnnexLibraryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.aadl2.ModalElement <em>Modal Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.aadl2.ModalElement
   * @generated
   */
  public Adapter createModalElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.aadl2.AnnexSubclause <em>Annex Subclause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.aadl2.AnnexSubclause
   * @generated
   */
  public Adapter createAnnexSubclauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //GumboAdapterFactory
