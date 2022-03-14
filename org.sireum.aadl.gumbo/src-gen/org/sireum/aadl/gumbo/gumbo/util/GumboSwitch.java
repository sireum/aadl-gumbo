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
        if (result == null) result = caseInitializeSpecStatement(guaranteeStatement);
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
      case GumboPackage.EXPR:
      {
        Expr expr = (Expr)theEObject;
        T result = caseExpr(expr);
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
      case GumboPackage.DOUBLE_DOT_REF:
      {
        DoubleDotRef doubleDotRef = (DoubleDotRef)theEObject;
        T result = caseDoubleDotRef(doubleDotRef);
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
      case GumboPackage.SLANG_EXPR:
      {
        SlangExpr slangExpr = (SlangExpr)theEObject;
        T result = caseSlangExpr(slangExpr);
        if (result == null) result = caseSlangRet(slangExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.SLANG_QUANT_VAR:
      {
        SlangQuantVar slangQuantVar = (SlangQuantVar)theEObject;
        T result = caseSlangQuantVar(slangQuantVar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.SLANG_ACCESS:
      {
        SlangAccess slangAccess = (SlangAccess)theEObject;
        T result = caseSlangAccess(slangAccess);
        if (result == null) result = caseSlangExpr(slangAccess);
        if (result == null) result = caseSlangRet(slangAccess);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.ACCESS_SUFFIX:
      {
        AccessSuffix accessSuffix = (AccessSuffix)theEObject;
        T result = caseAccessSuffix(accessSuffix);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.SLANG_TERM:
      {
        SlangTerm slangTerm = (SlangTerm)theEObject;
        T result = caseSlangTerm(slangTerm);
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
      case GumboPackage.CALL_SUFFIX:
      {
        CallSuffix callSuffix = (CallSuffix)theEObject;
        T result = caseCallSuffix(callSuffix);
        if (result == null) result = caseAccessSuffix(callSuffix);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.CALL_ARGS:
      {
        CallArgs callArgs = (CallArgs)theEObject;
        T result = caseCallArgs(callArgs);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.ID_EXP:
      {
        IdExp idExp = (IdExp)theEObject;
        T result = caseIdExp(idExp);
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
      case GumboPackage.DEF_DEF:
      {
        DefDef defDef = (DefDef)theEObject;
        T result = caseDefDef(defDef);
        if (result == null) result = caseFuncSpec(defDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.DEF_PARAMS:
      {
        DefParams defParams = (DefParams)theEObject;
        T result = caseDefParams(defParams);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.DEF_PARAM:
      {
        DefParam defParam = (DefParam)theEObject;
        T result = caseDefParam(defParam);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.DEF_CONTRACT:
      {
        DefContract defContract = (DefContract)theEObject;
        T result = caseDefContract(defContract);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.DEF_CONTRACT_CASE:
      {
        DefContractCase defContractCase = (DefContractCase)theEObject;
        T result = caseDefContractCase(defContractCase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.READS:
      {
        Reads reads = (Reads)theEObject;
        T result = caseReads(reads);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.REQUIRES:
      {
        Requires requires = (Requires)theEObject;
        T result = caseRequires(requires);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.MODIFIES:
      {
        Modifies modifies = (Modifies)theEObject;
        T result = caseModifies(modifies);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.ENSURES:
      {
        Ensures ensures = (Ensures)theEObject;
        T result = caseEnsures(ensures);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.BINARY_EXPR:
      {
        BinaryExpr binaryExpr = (BinaryExpr)theEObject;
        T result = caseBinaryExpr(binaryExpr);
        if (result == null) result = caseExpr(binaryExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.UNARY_EXPR:
      {
        UnaryExpr unaryExpr = (UnaryExpr)theEObject;
        T result = caseUnaryExpr(unaryExpr);
        if (result == null) result = caseExpr(unaryExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.DATA_REF_EXPR:
      {
        DataRefExpr dataRefExpr = (DataRefExpr)theEObject;
        T result = caseDataRefExpr(dataRefExpr);
        if (result == null) result = caseExpr(dataRefExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.ENUM_LIT_EXPR:
      {
        EnumLitExpr enumLitExpr = (EnumLitExpr)theEObject;
        T result = caseEnumLitExpr(enumLitExpr);
        if (result == null) result = caseExpr(enumLitExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.RECORD_LIT_EXPR:
      {
        RecordLitExpr recordLitExpr = (RecordLitExpr)theEObject;
        T result = caseRecordLitExpr(recordLitExpr);
        if (result == null) result = caseExpr(recordLitExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.INT_LIT:
      {
        IntLit intLit = (IntLit)theEObject;
        T result = caseIntLit(intLit);
        if (result == null) result = caseExpr(intLit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.REAL_LIT_EXPR:
      {
        RealLitExpr realLitExpr = (RealLitExpr)theEObject;
        T result = caseRealLitExpr(realLitExpr);
        if (result == null) result = caseExpr(realLitExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.BOOL_LIT_EXPR:
      {
        BoolLitExpr boolLitExpr = (BoolLitExpr)theEObject;
        T result = caseBoolLitExpr(boolLitExpr);
        if (result == null) result = caseExpr(boolLitExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.FLOOR_CAST:
      {
        FloorCast floorCast = (FloorCast)theEObject;
        T result = caseFloorCast(floorCast);
        if (result == null) result = caseExpr(floorCast);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GumboPackage.REAL_CAST:
      {
        RealCast realCast = (RealCast)theEObject;
        T result = caseRealCast(realCast);
        if (result == null) result = caseExpr(realCast);
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
   * Returns the result of interpreting the object as an instance of '<em>Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpr(Expr object)
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
   * Returns the result of interpreting the object as an instance of '<em>Double Dot Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Double Dot Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDoubleDotRef(DoubleDotRef object)
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
   * Returns the result of interpreting the object as an instance of '<em>Slang Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slang Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlangExpr(SlangExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slang Quant Var</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slang Quant Var</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlangQuantVar(SlangQuantVar object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slang Access</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slang Access</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlangAccess(SlangAccess object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Access Suffix</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Access Suffix</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAccessSuffix(AccessSuffix object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slang Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slang Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlangTerm(SlangTerm object)
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
   * Returns the result of interpreting the object as an instance of '<em>Call Suffix</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Call Suffix</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCallSuffix(CallSuffix object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Call Args</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Call Args</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCallArgs(CallArgs object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Id Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Id Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIdExp(IdExp object)
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
   * Returns the result of interpreting the object as an instance of '<em>Def Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Def Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefDef(DefDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Def Params</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Def Params</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefParams(DefParams object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Def Param</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Def Param</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefParam(DefParam object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Def Contract</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Def Contract</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefContract(DefContract object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Def Contract Case</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Def Contract Case</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefContractCase(DefContractCase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reads</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reads</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReads(Reads object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Requires</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Requires</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequires(Requires object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Modifies</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Modifies</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModifies(Modifies object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ensures</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ensures</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnsures(Ensures object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Binary Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binary Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBinaryExpr(BinaryExpr object)
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
   * Returns the result of interpreting the object as an instance of '<em>Int Lit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Lit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntLit(IntLit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Real Lit Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Real Lit Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRealLitExpr(RealLitExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bool Lit Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bool Lit Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoolLitExpr(BoolLitExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Floor Cast</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Floor Cast</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFloorCast(FloorCast object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Real Cast</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Real Cast</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRealCast(RealCast object)
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
