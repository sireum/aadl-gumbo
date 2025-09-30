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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.osate.aadl2.AnnexLibrary;
import org.osate.aadl2.AnnexSubclause;
import org.osate.aadl2.Element;
import org.osate.aadl2.ModalElement;
import org.osate.aadl2.NamedElement;

import org.sireum.aadl.gumbo.gumbo.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.sireum.aadl.gumbo.gumbo.GumboPackage
 * @generated
 */
public class GumboSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GumboPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GumboSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = GumboPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case GumboPackage.GUMBO_LIBRARY:
      {
        GumboLibrary gumboLibrary = (GumboLibrary)theEObject;
        T result = caseGumboLibrary(gumboLibrary);
        if (result == null) result = caseAnnexLibrary(gumboLibrary);
        if (result == null) result = caseNamedElement(gumboLibrary);
        if (result == null) result = caseElement(gumboLibrary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.GUMBO_SUBCLAUSE:
      {
        GumboSubclause gumboSubclause = (GumboSubclause)theEObject;
        T result = caseGumboSubclause(gumboSubclause);
        if (result == null) result = caseAnnexSubclause(gumboSubclause);
        if (result == null) result = caseModalElement(gumboSubclause);
        if (result == null) result = caseNamedElement(gumboSubclause);
        if (result == null) result = caseElement(gumboSubclause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.SPEC_SECTION:
      {
        SpecSection specSection = (SpecSection)theEObject;
        T result = caseSpecSection(specSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.STATE:
      {
        State state = (State)theEObject;
        T result = caseState(state);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.STATE_VAR_DECL:
      {
        StateVarDecl stateVarDecl = (StateVarDecl)theEObject;
        T result = caseStateVarDecl(stateVarDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.INVARIANTS:
      {
        Invariants invariants = (Invariants)theEObject;
        T result = caseInvariants(invariants);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.INV_SPEC:
      {
        InvSpec invSpec = (InvSpec)theEObject;
        T result = caseInvSpec(invSpec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.INTEGRATION:
      {
        Integration integration = (Integration)theEObject;
        T result = caseIntegration(integration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.INITIALIZE:
      {
        Initialize initialize = (Initialize)theEObject;
        T result = caseInitialize(initialize);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.INITIALIZE_SPEC_STATEMENT:
      {
        InitializeSpecStatement initializeSpecStatement = (InitializeSpecStatement)theEObject;
        T result = caseInitializeSpecStatement(initializeSpecStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.COMPUTE:
      {
        Compute compute = (Compute)theEObject;
        T result = caseCompute(compute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.GUMBO_TABLE:
      {
        GumboTable gumboTable = (GumboTable)theEObject;
        T result = caseGumboTable(gumboTable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.NORMAL_TABLE:
      {
        NormalTable normalTable = (NormalTable)theEObject;
        T result = caseNormalTable(normalTable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.RESULT_ROW:
      {
        ResultRow resultRow = (ResultRow)theEObject;
        T result = caseResultRow(resultRow);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.INFO_FLOW_CLAUSE:
      {
        InfoFlowClause infoFlowClause = (InfoFlowClause)theEObject;
        T result = caseInfoFlowClause(infoFlowClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.HANDLER_CLAUSE:
      {
        HandlerClause handlerClause = (HandlerClause)theEObject;
        T result = caseHandlerClause(handlerClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.CASE_STATEMENT_CLAUSE:
      {
        CaseStatementClause caseStatementClause = (CaseStatementClause)theEObject;
        T result = caseCaseStatementClause(caseStatementClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.SPEC_STATEMENT:
      {
        SpecStatement specStatement = (SpecStatement)theEObject;
        T result = caseSpecStatement(specStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.ASSUME_STATEMENT:
      {
        AssumeStatement assumeStatement = (AssumeStatement)theEObject;
        T result = caseAssumeStatement(assumeStatement);
        if (result == null) result = caseSpecStatement(assumeStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.ANON_ASSUME_STATEMENT:
      {
        AnonAssumeStatement anonAssumeStatement = (AnonAssumeStatement)theEObject;
        T result = caseAnonAssumeStatement(anonAssumeStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.GUARANTEE_STATEMENT:
      {
        GuaranteeStatement guaranteeStatement = (GuaranteeStatement)theEObject;
        T result = caseGuaranteeStatement(guaranteeStatement);
        if (result == null) result = caseSpecStatement(guaranteeStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.ANON_GUARANTEE_STATEMENT:
      {
        AnonGuaranteeStatement anonGuaranteeStatement = (AnonGuaranteeStatement)theEObject;
        T result = caseAnonGuaranteeStatement(anonGuaranteeStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.DATA_ELEMENT:
      {
        DataElement dataElement = (DataElement)theEObject;
        T result = caseDataElement(dataElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.SUBCOMPONENT_ELEMENT:
      {
        SubcomponentElement subcomponentElement = (SubcomponentElement)theEObject;
        T result = caseSubcomponentElement(subcomponentElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.FUNCTIONS:
      {
        Functions functions = (Functions)theEObject;
        T result = caseFunctions(functions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.FUNC_SPEC:
      {
        FuncSpec funcSpec = (FuncSpec)theEObject;
        T result = caseFuncSpec(funcSpec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.SLANG_DEF_DEF:
      {
        SlangDefDef slangDefDef = (SlangDefDef)theEObject;
        T result = caseSlangDefDef(slangDefDef);
        if (result == null) result = caseFuncSpec(slangDefDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.SLANG_DEF_PARAMS:
      {
        SlangDefParams slangDefParams = (SlangDefParams)theEObject;
        T result = caseSlangDefParams(slangDefParams);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.SLANG_DEF_PARAM:
      {
        SlangDefParam slangDefParam = (SlangDefParam)theEObject;
        T result = caseSlangDefParam(slangDefParam);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.SLANG_TYPE_PARAMS:
      {
        SlangTypeParams slangTypeParams = (SlangTypeParams)theEObject;
        T result = caseSlangTypeParams(slangTypeParams);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.SLANG_TYPE_PARAM:
      {
        SlangTypeParam slangTypeParam = (SlangTypeParam)theEObject;
        T result = caseSlangTypeParam(slangTypeParam);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.SLANG_DEF_CONTRACT:
      {
        SlangDefContract slangDefContract = (SlangDefContract)theEObject;
        T result = caseSlangDefContract(slangDefContract);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.SLANG_INVARIANT:
      {
        SlangInvariant slangInvariant = (SlangInvariant)theEObject;
        T result = caseSlangInvariant(slangInvariant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.SLANG_REQUIRES:
      {
        SlangRequires slangRequires = (SlangRequires)theEObject;
        T result = caseSlangRequires(slangRequires);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.SLANG_READS:
      {
        SlangReads slangReads = (SlangReads)theEObject;
        T result = caseSlangReads(slangReads);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.SLANG_MODIFIES:
      {
        SlangModifies slangModifies = (SlangModifies)theEObject;
        T result = caseSlangModifies(slangModifies);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.SLANG_ENSURES:
      {
        SlangEnsures slangEnsures = (SlangEnsures)theEObject;
        T result = caseSlangEnsures(slangEnsures);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.SLANG_TYPE:
      {
        SlangType slangType = (SlangType)theEObject;
        T result = caseSlangType(slangType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.SLANG_STMT:
      {
        SlangStmt slangStmt = (SlangStmt)theEObject;
        T result = caseSlangStmt(slangStmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.SLANG_ELSE:
      {
        SlangElse slangElse = (SlangElse)theEObject;
        T result = caseSlangElse(slangElse);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.SLANG_LOOP_CONTRACT:
      {
        SlangLoopContract slangLoopContract = (SlangLoopContract)theEObject;
        T result = caseSlangLoopContract(slangLoopContract);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.SLANG_CASE:
      {
        SlangCase slangCase = (SlangCase)theEObject;
        T result = caseSlangCase(slangCase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.SLANG_PATTERN:
      {
        SlangPattern slangPattern = (SlangPattern)theEObject;
        T result = caseSlangPattern(slangPattern);
        if (result == null) result = caseSlangVarDef(slangPattern);
        if (result == null) result = caseSlangStmt(slangPattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.SLANG_TPATTERN:
      {
        SlangTPattern slangTPattern = (SlangTPattern)theEObject;
        T result = caseSlangTPattern(slangTPattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.SLANG_VAR_DEF:
      {
        SlangVarDef slangVarDef = (SlangVarDef)theEObject;
        T result = caseSlangVarDef(slangVarDef);
        if (result == null) result = caseSlangStmt(slangVarDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.SLANG_BLOCK:
      {
        SlangBlock slangBlock = (SlangBlock)theEObject;
        T result = caseSlangBlock(slangBlock);
        if (result == null) result = caseSlangElse(slangBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.OWNED_EXPRESSION:
      {
        OwnedExpression ownedExpression = (OwnedExpression)theEObject;
        T result = caseOwnedExpression(ownedExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.GEXPR:
      {
        GExpr gExpr = (GExpr)theEObject;
        T result = caseGExpr(gExpr);
        if (result == null) result = caseOwnedExpression(gExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.QUANT_RANGE:
      {
        QuantRange quantRange = (QuantRange)theEObject;
        T result = caseQuantRange(quantRange);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.QUANT_PARAM:
      {
        QuantParam quantParam = (QuantParam)theEObject;
        T result = caseQuantParam(quantParam);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.POSTFIX:
      {
        Postfix postfix = (Postfix)theEObject;
        T result = casePostfix(postfix);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.MEMBER_ACCESS:
      {
        MemberAccess memberAccess = (MemberAccess)theEObject;
        T result = caseMemberAccess(memberAccess);
        if (result == null) result = casePostfix(memberAccess);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.ARRAY_ACCESS:
      {
        ArrayAccess arrayAccess = (ArrayAccess)theEObject;
        T result = caseArrayAccess(arrayAccess);
        if (result == null) result = casePostfix(arrayAccess);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.OTHER_DATA_REF:
      {
        OtherDataRef otherDataRef = (OtherDataRef)theEObject;
        T result = caseOtherDataRef(otherDataRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.SLANG_PARAMS:
      {
        SlangParams slangParams = (SlangParams)theEObject;
        T result = caseSlangParams(slangParams);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.SLANG_PARAM:
      {
        SlangParam slangParam = (SlangParam)theEObject;
        T result = caseSlangParam(slangParam);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.SLANG_FOR_RANGE:
      {
        SlangForRange slangForRange = (SlangForRange)theEObject;
        T result = caseSlangForRange(slangForRange);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.SLANG_RET:
      {
        SlangRet slangRet = (SlangRet)theEObject;
        T result = caseSlangRet(slangRet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.SLANG_CALL_SUFFIX:
      {
        SlangCallSuffix slangCallSuffix = (SlangCallSuffix)theEObject;
        T result = caseSlangCallSuffix(slangCallSuffix);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.SLANG_CALL_ARGS:
      {
        SlangCallArgs slangCallArgs = (SlangCallArgs)theEObject;
        T result = caseSlangCallArgs(slangCallArgs);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.SLANG_LIT:
      {
        SlangLit slangLit = (SlangLit)theEObject;
        T result = caseSlangLit(slangLit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.SLANG_INTERP:
      {
        SlangInterp slangInterp = (SlangInterp)theEObject;
        T result = caseSlangInterp(slangInterp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.SLANG_IF_STMT:
      {
        SlangIfStmt slangIfStmt = (SlangIfStmt)theEObject;
        T result = caseSlangIfStmt(slangIfStmt);
        if (result == null) result = caseSlangStmt(slangIfStmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.SLANG_WHILE_STMT:
      {
        SlangWhileStmt slangWhileStmt = (SlangWhileStmt)theEObject;
        T result = caseSlangWhileStmt(slangWhileStmt);
        if (result == null) result = caseSlangStmt(slangWhileStmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.SLANG_MATCH_STMT:
      {
        SlangMatchStmt slangMatchStmt = (SlangMatchStmt)theEObject;
        T result = caseSlangMatchStmt(slangMatchStmt);
        if (result == null) result = caseSlangStmt(slangMatchStmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.SLANG_SPEC_STMT:
      {
        SlangSpecStmt slangSpecStmt = (SlangSpecStmt)theEObject;
        T result = caseSlangSpecStmt(slangSpecStmt);
        if (result == null) result = caseSlangStmt(slangSpecStmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.SLANG_ASSUME_STMT:
      {
        SlangAssumeStmt slangAssumeStmt = (SlangAssumeStmt)theEObject;
        T result = caseSlangAssumeStmt(slangAssumeStmt);
        if (result == null) result = caseSlangStmt(slangAssumeStmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.SLANG_ASSERT_STMT:
      {
        SlangAssertStmt slangAssertStmt = (SlangAssertStmt)theEObject;
        T result = caseSlangAssertStmt(slangAssertStmt);
        if (result == null) result = caseSlangStmt(slangAssertStmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.SLANG_HALT_STMT:
      {
        SlangHaltStmt slangHaltStmt = (SlangHaltStmt)theEObject;
        T result = caseSlangHaltStmt(slangHaltStmt);
        if (result == null) result = caseSlangStmt(slangHaltStmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.SLANG_DO_STMT:
      {
        SlangDoStmt slangDoStmt = (SlangDoStmt)theEObject;
        T result = caseSlangDoStmt(slangDoStmt);
        if (result == null) result = caseSlangStmt(slangDoStmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.IF_ELSE_EXP:
      {
        IfElseExp ifElseExp = (IfElseExp)theEObject;
        T result = caseIfElseExp(ifElseExp);
        if (result == null) result = caseGExpr(ifElseExp);
        if (result == null) result = caseOwnedExpression(ifElseExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.QUANTIFIED_EXP:
      {
        QuantifiedExp quantifiedExp = (QuantifiedExp)theEObject;
        T result = caseQuantifiedExp(quantifiedExp);
        if (result == null) result = caseGExpr(quantifiedExp);
        if (result == null) result = caseOwnedExpression(quantifiedExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.IMPLIES_EXPR:
      {
        ImpliesExpr impliesExpr = (ImpliesExpr)theEObject;
        T result = caseImpliesExpr(impliesExpr);
        if (result == null) result = caseGExpr(impliesExpr);
        if (result == null) result = caseOwnedExpression(impliesExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.OR_EXPR:
      {
        OrExpr orExpr = (OrExpr)theEObject;
        T result = caseOrExpr(orExpr);
        if (result == null) result = caseGExpr(orExpr);
        if (result == null) result = caseOwnedExpression(orExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.AND_EXPR:
      {
        AndExpr andExpr = (AndExpr)theEObject;
        T result = caseAndExpr(andExpr);
        if (result == null) result = caseGExpr(andExpr);
        if (result == null) result = caseOwnedExpression(andExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.EQUAL_NOT_EXPR:
      {
        EqualNotExpr equalNotExpr = (EqualNotExpr)theEObject;
        T result = caseEqualNotExpr(equalNotExpr);
        if (result == null) result = caseGExpr(equalNotExpr);
        if (result == null) result = caseOwnedExpression(equalNotExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.LT_GT_EXPR:
      {
        LtGtExpr ltGtExpr = (LtGtExpr)theEObject;
        T result = caseLtGtExpr(ltGtExpr);
        if (result == null) result = caseGExpr(ltGtExpr);
        if (result == null) result = caseOwnedExpression(ltGtExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.COLON_EXPR:
      {
        ColonExpr colonExpr = (ColonExpr)theEObject;
        T result = caseColonExpr(colonExpr);
        if (result == null) result = caseGExpr(colonExpr);
        if (result == null) result = caseOwnedExpression(colonExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.PLUS_MINUS_EXPR:
      {
        PlusMinusExpr plusMinusExpr = (PlusMinusExpr)theEObject;
        T result = casePlusMinusExpr(plusMinusExpr);
        if (result == null) result = caseGExpr(plusMinusExpr);
        if (result == null) result = caseOwnedExpression(plusMinusExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.MULTIPLICATIVE_EXPR:
      {
        MultiplicativeExpr multiplicativeExpr = (MultiplicativeExpr)theEObject;
        T result = caseMultiplicativeExpr(multiplicativeExpr);
        if (result == null) result = caseGExpr(multiplicativeExpr);
        if (result == null) result = caseOwnedExpression(multiplicativeExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.UNARY_EXPR:
      {
        UnaryExpr unaryExpr = (UnaryExpr)theEObject;
        T result = caseUnaryExpr(unaryExpr);
        if (result == null) result = caseGExpr(unaryExpr);
        if (result == null) result = caseOwnedExpression(unaryExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.POST_FIX_EXPR:
      {
        PostFixExpr postFixExpr = (PostFixExpr)theEObject;
        T result = casePostFixExpr(postFixExpr);
        if (result == null) result = caseGExpr(postFixExpr);
        if (result == null) result = caseOwnedExpression(postFixExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.SLANG_LIT_TERM:
      {
        SlangLitTerm slangLitTerm = (SlangLitTerm)theEObject;
        T result = caseSlangLitTerm(slangLitTerm);
        if (result == null) result = caseGExpr(slangLitTerm);
        if (result == null) result = caseOwnedExpression(slangLitTerm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.SLANG_INTERP_TERM:
      {
        SlangInterpTerm slangInterpTerm = (SlangInterpTerm)theEObject;
        T result = caseSlangInterpTerm(slangInterpTerm);
        if (result == null) result = caseGExpr(slangInterpTerm);
        if (result == null) result = caseOwnedExpression(slangInterpTerm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.IN_STATE_EXPR:
      {
        InStateExpr inStateExpr = (InStateExpr)theEObject;
        T result = caseInStateExpr(inStateExpr);
        if (result == null) result = caseGExpr(inStateExpr);
        if (result == null) result = caseOwnedExpression(inStateExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.MAY_SEND_EXPR:
      {
        MaySendExpr maySendExpr = (MaySendExpr)theEObject;
        T result = caseMaySendExpr(maySendExpr);
        if (result == null) result = caseGExpr(maySendExpr);
        if (result == null) result = caseOwnedExpression(maySendExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.MUST_SEND_EXPR:
      {
        MustSendExpr mustSendExpr = (MustSendExpr)theEObject;
        T result = caseMustSendExpr(mustSendExpr);
        if (result == null) result = caseGExpr(mustSendExpr);
        if (result == null) result = caseOwnedExpression(mustSendExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.NO_SEND_EXPR:
      {
        NoSendExpr noSendExpr = (NoSendExpr)theEObject;
        T result = caseNoSendExpr(noSendExpr);
        if (result == null) result = caseGExpr(noSendExpr);
        if (result == null) result = caseOwnedExpression(noSendExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.HAS_EVENT_EXPR:
      {
        HasEventExpr hasEventExpr = (HasEventExpr)theEObject;
        T result = caseHasEventExpr(hasEventExpr);
        if (result == null) result = caseGExpr(hasEventExpr);
        if (result == null) result = caseOwnedExpression(hasEventExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.ENUM_LIT_EXPR:
      {
        EnumLitExpr enumLitExpr = (EnumLitExpr)theEObject;
        T result = caseEnumLitExpr(enumLitExpr);
        if (result == null) result = caseGExpr(enumLitExpr);
        if (result == null) result = caseOwnedExpression(enumLitExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.PAREN_EXPR:
      {
        ParenExpr parenExpr = (ParenExpr)theEObject;
        T result = caseParenExpr(parenExpr);
        if (result == null) result = caseGExpr(parenExpr);
        if (result == null) result = caseOwnedExpression(parenExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.SLANG_FOR_TERM:
      {
        SlangForTerm slangForTerm = (SlangForTerm)theEObject;
        T result = caseSlangForTerm(slangForTerm);
        if (result == null) result = caseGExpr(slangForTerm);
        if (result == null) result = caseOwnedExpression(slangForTerm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.SLANG_BLOCK_TERM:
      {
        SlangBlockTerm slangBlockTerm = (SlangBlockTerm)theEObject;
        T result = caseSlangBlockTerm(slangBlockTerm);
        if (result == null) result = caseGExpr(slangBlockTerm);
        if (result == null) result = caseOwnedExpression(slangBlockTerm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.F32_OBJ:
      {
        F32Obj f32Obj = (F32Obj)theEObject;
        T result = caseF32Obj(f32Obj);
        if (result == null) result = caseGExpr(f32Obj);
        if (result == null) result = caseOwnedExpression(f32Obj);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.F64_OBJ:
      {
        F64Obj f64Obj = (F64Obj)theEObject;
        T result = caseF64Obj(f64Obj);
        if (result == null) result = caseGExpr(f64Obj);
        if (result == null) result = caseOwnedExpression(f64Obj);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.CALL_EXPR:
      {
        CallExpr callExpr = (CallExpr)theEObject;
        T result = caseCallExpr(callExpr);
        if (result == null) result = caseGExpr(callExpr);
        if (result == null) result = caseOwnedExpression(callExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.RECORD_LIT_EXPR:
      {
        RecordLitExpr recordLitExpr = (RecordLitExpr)theEObject;
        T result = caseRecordLitExpr(recordLitExpr);
        if (result == null) result = caseGExpr(recordLitExpr);
        if (result == null) result = caseOwnedExpression(recordLitExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.DATA_REF_EXPR:
      {
        DataRefExpr dataRefExpr = (DataRefExpr)theEObject;
        T result = caseDataRefExpr(dataRefExpr);
        if (result == null) result = caseGExpr(dataRefExpr);
        if (result == null) result = caseOwnedExpression(dataRefExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.RESULT_EXPR:
      {
        ResultExpr resultExpr = (ResultExpr)theEObject;
        T result = caseResultExpr(resultExpr);
        if (result == null) result = caseGExpr(resultExpr);
        if (result == null) result = caseOwnedExpression(resultExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.BOOLEAN_LIT:
      {
        BooleanLit booleanLit = (BooleanLit)theEObject;
        T result = caseBooleanLit(booleanLit);
        if (result == null) result = caseSlangLit(booleanLit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.INTEGER_LIT:
      {
        IntegerLit integerLit = (IntegerLit)theEObject;
        T result = caseIntegerLit(integerLit);
        if (result == null) result = caseSlangLit(integerLit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.HEX_LIT:
      {
        HexLit hexLit = (HexLit)theEObject;
        T result = caseHexLit(hexLit);
        if (result == null) result = caseSlangLit(hexLit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.BIN_LIT:
      {
        BinLit binLit = (BinLit)theEObject;
        T result = caseBinLit(binLit);
        if (result == null) result = caseSlangLit(binLit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.F32_LIT:
      {
        F32Lit f32Lit = (F32Lit)theEObject;
        T result = caseF32Lit(f32Lit);
        if (result == null) result = caseSlangLit(f32Lit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.F64_LIT:
      {
        F64Lit f64Lit = (F64Lit)theEObject;
        T result = caseF64Lit(f64Lit);
        if (result == null) result = caseSlangLit(f64Lit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.SLANG_STRING_LIT:
      {
        SlangStringLit slangStringLit = (SlangStringLit)theEObject;
        T result = caseSlangStringLit(slangStringLit);
        if (result == null) result = caseSlangLit(slangStringLit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.SLANG_LITERAL_INTERP:
      {
        SlangLiteralInterp slangLiteralInterp = (SlangLiteralInterp)theEObject;
        T result = caseSlangLiteralInterp(slangLiteralInterp);
        if (result == null) result = caseSlangInterp(slangLiteralInterp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Library</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Library</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGumboLibrary(GumboLibrary object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subclause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subclause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGumboSubclause(GumboSubclause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Spec Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Spec Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpecSection(SpecSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseState(State object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State Var Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State Var Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStateVarDecl(StateVarDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Invariants</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Invariants</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInvariants(Invariants object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Inv Spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inv Spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInvSpec(InvSpec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegration(Integration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Initialize</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Initialize</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInitialize(Initialize object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Initialize Spec Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Initialize Spec Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInitializeSpecStatement(InitializeSpecStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Compute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Compute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompute(Compute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Table</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Table</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGumboTable(GumboTable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Normal Table</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Normal Table</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNormalTable(NormalTable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Result Row</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Result Row</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResultRow(ResultRow object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Info Flow Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Info Flow Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInfoFlowClause(InfoFlowClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Handler Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Handler Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHandlerClause(HandlerClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Case Statement Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Case Statement Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCaseStatementClause(CaseStatementClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Spec Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Spec Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpecStatement(SpecStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assume Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assume Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssumeStatement(AssumeStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Anon Assume Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Anon Assume Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnonAssumeStatement(AnonAssumeStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Guarantee Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Guarantee Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGuaranteeStatement(GuaranteeStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Anon Guarantee Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Anon Guarantee Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnonGuaranteeStatement(AnonGuaranteeStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataElement(DataElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subcomponent Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subcomponent Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubcomponentElement(SubcomponentElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Functions</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Functions</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctions(Functions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Func Spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Func Spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFuncSpec(FuncSpec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slang Def Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slang Def Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlangDefDef(SlangDefDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slang Def Params</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slang Def Params</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlangDefParams(SlangDefParams object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slang Def Param</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slang Def Param</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlangDefParam(SlangDefParam object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slang Type Params</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slang Type Params</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlangTypeParams(SlangTypeParams object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slang Type Param</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slang Type Param</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlangTypeParam(SlangTypeParam object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slang Def Contract</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slang Def Contract</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlangDefContract(SlangDefContract object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slang Invariant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slang Invariant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlangInvariant(SlangInvariant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slang Requires</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slang Requires</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlangRequires(SlangRequires object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slang Reads</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slang Reads</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlangReads(SlangReads object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slang Modifies</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slang Modifies</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlangModifies(SlangModifies object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slang Ensures</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slang Ensures</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlangEnsures(SlangEnsures object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slang Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slang Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlangType(SlangType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slang Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slang Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlangStmt(SlangStmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slang Else</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slang Else</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlangElse(SlangElse object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slang Loop Contract</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slang Loop Contract</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlangLoopContract(SlangLoopContract object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slang Case</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slang Case</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlangCase(SlangCase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slang Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slang Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlangPattern(SlangPattern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slang TPattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slang TPattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlangTPattern(SlangTPattern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slang Var Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slang Var Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlangVarDef(SlangVarDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slang Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slang Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlangBlock(SlangBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Owned Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Owned Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOwnedExpression(OwnedExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>GExpr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>GExpr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGExpr(GExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Quant Range</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Quant Range</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuantRange(QuantRange object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Quant Param</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Quant Param</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuantParam(QuantParam object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Postfix</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Postfix</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePostfix(Postfix object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Member Access</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Member Access</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMemberAccess(MemberAccess object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Access</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Access</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArrayAccess(ArrayAccess object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Other Data Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Other Data Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOtherDataRef(OtherDataRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slang Params</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slang Params</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlangParams(SlangParams object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slang Param</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slang Param</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlangParam(SlangParam object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slang For Range</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slang For Range</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlangForRange(SlangForRange object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slang Ret</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slang Ret</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlangRet(SlangRet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slang Call Suffix</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slang Call Suffix</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlangCallSuffix(SlangCallSuffix object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slang Call Args</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slang Call Args</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlangCallArgs(SlangCallArgs object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slang Lit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slang Lit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlangLit(SlangLit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slang Interp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slang Interp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlangInterp(SlangInterp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slang If Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slang If Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlangIfStmt(SlangIfStmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slang While Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slang While Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlangWhileStmt(SlangWhileStmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slang Match Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slang Match Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlangMatchStmt(SlangMatchStmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slang Spec Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slang Spec Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlangSpecStmt(SlangSpecStmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slang Assume Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slang Assume Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlangAssumeStmt(SlangAssumeStmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slang Assert Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slang Assert Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlangAssertStmt(SlangAssertStmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slang Halt Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slang Halt Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlangHaltStmt(SlangHaltStmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slang Do Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slang Do Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlangDoStmt(SlangDoStmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If Else Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If Else Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIfElseExp(IfElseExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Quantified Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Quantified Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuantifiedExp(QuantifiedExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Implies Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Implies Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImpliesExpr(ImpliesExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrExpr(OrExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndExpr(AndExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Equal Not Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Equal Not Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEqualNotExpr(EqualNotExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lt Gt Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lt Gt Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLtGtExpr(LtGtExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Colon Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Colon Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColonExpr(ColonExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plus Minus Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plus Minus Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlusMinusExpr(PlusMinusExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multiplicative Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multiplicative Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiplicativeExpr(MultiplicativeExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unary Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unary Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnaryExpr(UnaryExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Post Fix Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Post Fix Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePostFixExpr(PostFixExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slang Lit Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slang Lit Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlangLitTerm(SlangLitTerm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slang Interp Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slang Interp Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlangInterpTerm(SlangInterpTerm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>In State Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>In State Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInStateExpr(InStateExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>May Send Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>May Send Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMaySendExpr(MaySendExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Must Send Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Must Send Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMustSendExpr(MustSendExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>No Send Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>No Send Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNoSendExpr(NoSendExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Has Event Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Has Event Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHasEventExpr(HasEventExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Lit Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Lit Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumLitExpr(EnumLitExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Paren Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Paren Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParenExpr(ParenExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slang For Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slang For Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlangForTerm(SlangForTerm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slang Block Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slang Block Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlangBlockTerm(SlangBlockTerm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>F32 Obj</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>F32 Obj</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseF32Obj(F32Obj object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>F64 Obj</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>F64 Obj</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseF64Obj(F64Obj object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Call Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Call Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCallExpr(CallExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Record Lit Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Record Lit Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRecordLitExpr(RecordLitExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Ref Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Ref Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataRefExpr(DataRefExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Result Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Result Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResultExpr(ResultExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Lit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Lit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanLit(BooleanLit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Lit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Lit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerLit(IntegerLit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hex Lit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hex Lit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHexLit(HexLit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bin Lit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bin Lit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBinLit(BinLit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>F32 Lit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>F32 Lit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseF32Lit(F32Lit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>F64 Lit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>F64 Lit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseF64Lit(F64Lit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slang String Lit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slang String Lit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlangStringLit(SlangStringLit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slang Literal Interp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slang Literal Interp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlangLiteralInterp(SlangLiteralInterp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElement(Element object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedElement(NamedElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annex Library</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annex Library</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnexLibrary(AnnexLibrary object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Modal Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Modal Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModalElement(ModalElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annex Subclause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annex Subclause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnexSubclause(AnnexSubclause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //GumboSwitch
