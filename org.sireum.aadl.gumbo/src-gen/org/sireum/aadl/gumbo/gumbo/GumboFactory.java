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
package org.sireum.aadl.gumbo.gumbo;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.sireum.aadl.gumbo.gumbo.GumboPackage
 * @generated
 */
public interface GumboFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GumboFactory eINSTANCE = org.sireum.aadl.gumbo.gumbo.impl.GumboFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Library</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Library</em>'.
   * @generated
   */
  GumboLibrary createGumboLibrary();

  /**
   * Returns a new object of class '<em>Subclause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Subclause</em>'.
   * @generated
   */
  GumboSubclause createGumboSubclause();

  /**
   * Returns a new object of class '<em>Spec Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Spec Section</em>'.
   * @generated
   */
  SpecSection createSpecSection();

  /**
   * Returns a new object of class '<em>State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State</em>'.
   * @generated
   */
  State createState();

  /**
   * Returns a new object of class '<em>State Var Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State Var Decl</em>'.
   * @generated
   */
  StateVarDecl createStateVarDecl();

  /**
   * Returns a new object of class '<em>Invariants</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Invariants</em>'.
   * @generated
   */
  Invariants createInvariants();

  /**
   * Returns a new object of class '<em>Inv Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inv Spec</em>'.
   * @generated
   */
  InvSpec createInvSpec();

  /**
   * Returns a new object of class '<em>Integration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integration</em>'.
   * @generated
   */
  Integration createIntegration();

  /**
   * Returns a new object of class '<em>Initialize</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Initialize</em>'.
   * @generated
   */
  Initialize createInitialize();

  /**
   * Returns a new object of class '<em>Initialize Spec Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Initialize Spec Statement</em>'.
   * @generated
   */
  InitializeSpecStatement createInitializeSpecStatement();

  /**
   * Returns a new object of class '<em>Compute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Compute</em>'.
   * @generated
   */
  Compute createCompute();

  /**
   * Returns a new object of class '<em>Info Flow Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Info Flow Clause</em>'.
   * @generated
   */
  InfoFlowClause createInfoFlowClause();

  /**
   * Returns a new object of class '<em>Handler Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Handler Clause</em>'.
   * @generated
   */
  HandlerClause createHandlerClause();

  /**
   * Returns a new object of class '<em>Case Statement Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Case Statement Clause</em>'.
   * @generated
   */
  CaseStatementClause createCaseStatementClause();

  /**
   * Returns a new object of class '<em>Spec Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Spec Statement</em>'.
   * @generated
   */
  SpecStatement createSpecStatement();

  /**
   * Returns a new object of class '<em>Assume Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assume Statement</em>'.
   * @generated
   */
  AssumeStatement createAssumeStatement();

  /**
   * Returns a new object of class '<em>Anon Assume Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Anon Assume Statement</em>'.
   * @generated
   */
  AnonAssumeStatement createAnonAssumeStatement();

  /**
   * Returns a new object of class '<em>Guarantee Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Guarantee Statement</em>'.
   * @generated
   */
  GuaranteeStatement createGuaranteeStatement();

  /**
   * Returns a new object of class '<em>Anon Guarantee Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Anon Guarantee Statement</em>'.
   * @generated
   */
  AnonGuaranteeStatement createAnonGuaranteeStatement();

  /**
   * Returns a new object of class '<em>Data Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Element</em>'.
   * @generated
   */
  DataElement createDataElement();

  /**
   * Returns a new object of class '<em>Subcomponent Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Subcomponent Element</em>'.
   * @generated
   */
  SubcomponentElement createSubcomponentElement();

  /**
   * Returns a new object of class '<em>Functions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Functions</em>'.
   * @generated
   */
  Functions createFunctions();

  /**
   * Returns a new object of class '<em>Func Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Func Spec</em>'.
   * @generated
   */
  FuncSpec createFuncSpec();

  /**
   * Returns a new object of class '<em>Slang Def Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Def Def</em>'.
   * @generated
   */
  SlangDefDef createSlangDefDef();

  /**
   * Returns a new object of class '<em>Slang Def Params</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Def Params</em>'.
   * @generated
   */
  SlangDefParams createSlangDefParams();

  /**
   * Returns a new object of class '<em>Slang Def Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Def Param</em>'.
   * @generated
   */
  SlangDefParam createSlangDefParam();

  /**
   * Returns a new object of class '<em>Slang Type Params</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Type Params</em>'.
   * @generated
   */
  SlangTypeParams createSlangTypeParams();

  /**
   * Returns a new object of class '<em>Slang Type Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Type Param</em>'.
   * @generated
   */
  SlangTypeParam createSlangTypeParam();

  /**
   * Returns a new object of class '<em>Slang Def Contract</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Def Contract</em>'.
   * @generated
   */
  SlangDefContract createSlangDefContract();

  /**
   * Returns a new object of class '<em>Slang Invariant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Invariant</em>'.
   * @generated
   */
  SlangInvariant createSlangInvariant();

  /**
   * Returns a new object of class '<em>Slang Requires</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Requires</em>'.
   * @generated
   */
  SlangRequires createSlangRequires();

  /**
   * Returns a new object of class '<em>Slang Reads</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Reads</em>'.
   * @generated
   */
  SlangReads createSlangReads();

  /**
   * Returns a new object of class '<em>Slang Modifies</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Modifies</em>'.
   * @generated
   */
  SlangModifies createSlangModifies();

  /**
   * Returns a new object of class '<em>Slang Ensures</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Ensures</em>'.
   * @generated
   */
  SlangEnsures createSlangEnsures();

  /**
   * Returns a new object of class '<em>Slang Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Type</em>'.
   * @generated
   */
  SlangType createSlangType();

  /**
   * Returns a new object of class '<em>Slang Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Stmt</em>'.
   * @generated
   */
  SlangStmt createSlangStmt();

  /**
   * Returns a new object of class '<em>Slang Else</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Else</em>'.
   * @generated
   */
  SlangElse createSlangElse();

  /**
   * Returns a new object of class '<em>Slang Loop Contract</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Loop Contract</em>'.
   * @generated
   */
  SlangLoopContract createSlangLoopContract();

  /**
   * Returns a new object of class '<em>Slang Case</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Case</em>'.
   * @generated
   */
  SlangCase createSlangCase();

  /**
   * Returns a new object of class '<em>Slang Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Pattern</em>'.
   * @generated
   */
  SlangPattern createSlangPattern();

  /**
   * Returns a new object of class '<em>Slang TPattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang TPattern</em>'.
   * @generated
   */
  SlangTPattern createSlangTPattern();

  /**
   * Returns a new object of class '<em>Slang Var Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Var Def</em>'.
   * @generated
   */
  SlangVarDef createSlangVarDef();

  /**
   * Returns a new object of class '<em>Slang Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Block</em>'.
   * @generated
   */
  SlangBlock createSlangBlock();

  /**
   * Returns a new object of class '<em>Owned Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Owned Expression</em>'.
   * @generated
   */
  OwnedExpression createOwnedExpression();

  /**
   * Returns a new object of class '<em>GExpr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>GExpr</em>'.
   * @generated
   */
  GExpr createGExpr();

  /**
   * Returns a new object of class '<em>Quant Range</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Quant Range</em>'.
   * @generated
   */
  QuantRange createQuantRange();

  /**
   * Returns a new object of class '<em>Quant Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Quant Param</em>'.
   * @generated
   */
  QuantParam createQuantParam();

  /**
   * Returns a new object of class '<em>Postfix</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Postfix</em>'.
   * @generated
   */
  Postfix createPostfix();

  /**
   * Returns a new object of class '<em>Member Access</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Member Access</em>'.
   * @generated
   */
  MemberAccess createMemberAccess();

  /**
   * Returns a new object of class '<em>Array Access</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Access</em>'.
   * @generated
   */
  ArrayAccess createArrayAccess();

  /**
   * Returns a new object of class '<em>Other Data Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Other Data Ref</em>'.
   * @generated
   */
  OtherDataRef createOtherDataRef();

  /**
   * Returns a new object of class '<em>Slang Params</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Params</em>'.
   * @generated
   */
  SlangParams createSlangParams();

  /**
   * Returns a new object of class '<em>Slang Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Param</em>'.
   * @generated
   */
  SlangParam createSlangParam();

  /**
   * Returns a new object of class '<em>Slang For Range</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang For Range</em>'.
   * @generated
   */
  SlangForRange createSlangForRange();

  /**
   * Returns a new object of class '<em>Slang Ret</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Ret</em>'.
   * @generated
   */
  SlangRet createSlangRet();

  /**
   * Returns a new object of class '<em>Slang Call Suffix</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Call Suffix</em>'.
   * @generated
   */
  SlangCallSuffix createSlangCallSuffix();

  /**
   * Returns a new object of class '<em>Slang Call Args</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Call Args</em>'.
   * @generated
   */
  SlangCallArgs createSlangCallArgs();

  /**
   * Returns a new object of class '<em>Slang Lit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Lit</em>'.
   * @generated
   */
  SlangLit createSlangLit();

  /**
   * Returns a new object of class '<em>Slang Interp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Interp</em>'.
   * @generated
   */
  SlangInterp createSlangInterp();

  /**
   * Returns a new object of class '<em>Slang If Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang If Stmt</em>'.
   * @generated
   */
  SlangIfStmt createSlangIfStmt();

  /**
   * Returns a new object of class '<em>Slang While Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang While Stmt</em>'.
   * @generated
   */
  SlangWhileStmt createSlangWhileStmt();

  /**
   * Returns a new object of class '<em>Slang Match Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Match Stmt</em>'.
   * @generated
   */
  SlangMatchStmt createSlangMatchStmt();

  /**
   * Returns a new object of class '<em>Slang Spec Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Spec Stmt</em>'.
   * @generated
   */
  SlangSpecStmt createSlangSpecStmt();

  /**
   * Returns a new object of class '<em>Slang Assume Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Assume Stmt</em>'.
   * @generated
   */
  SlangAssumeStmt createSlangAssumeStmt();

  /**
   * Returns a new object of class '<em>Slang Assert Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Assert Stmt</em>'.
   * @generated
   */
  SlangAssertStmt createSlangAssertStmt();

  /**
   * Returns a new object of class '<em>Slang Halt Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Halt Stmt</em>'.
   * @generated
   */
  SlangHaltStmt createSlangHaltStmt();

  /**
   * Returns a new object of class '<em>Slang Do Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Do Stmt</em>'.
   * @generated
   */
  SlangDoStmt createSlangDoStmt();

  /**
   * Returns a new object of class '<em>If Else Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If Else Exp</em>'.
   * @generated
   */
  IfElseExp createIfElseExp();

  /**
   * Returns a new object of class '<em>Quantified Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Quantified Exp</em>'.
   * @generated
   */
  QuantifiedExp createQuantifiedExp();

  /**
   * Returns a new object of class '<em>Implies Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Implies Expr</em>'.
   * @generated
   */
  ImpliesExpr createImpliesExpr();

  /**
   * Returns a new object of class '<em>Or Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Or Expr</em>'.
   * @generated
   */
  OrExpr createOrExpr();

  /**
   * Returns a new object of class '<em>And Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And Expr</em>'.
   * @generated
   */
  AndExpr createAndExpr();

  /**
   * Returns a new object of class '<em>Equal Not Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Equal Not Expr</em>'.
   * @generated
   */
  EqualNotExpr createEqualNotExpr();

  /**
   * Returns a new object of class '<em>Lt Gt Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lt Gt Expr</em>'.
   * @generated
   */
  LtGtExpr createLtGtExpr();

  /**
   * Returns a new object of class '<em>Colon Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Colon Expr</em>'.
   * @generated
   */
  ColonExpr createColonExpr();

  /**
   * Returns a new object of class '<em>Plus Minus Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plus Minus Expr</em>'.
   * @generated
   */
  PlusMinusExpr createPlusMinusExpr();

  /**
   * Returns a new object of class '<em>Multiplicative Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multiplicative Expr</em>'.
   * @generated
   */
  MultiplicativeExpr createMultiplicativeExpr();

  /**
   * Returns a new object of class '<em>Unary Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unary Expr</em>'.
   * @generated
   */
  UnaryExpr createUnaryExpr();

  /**
   * Returns a new object of class '<em>Post Fix Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Post Fix Expr</em>'.
   * @generated
   */
  PostFixExpr createPostFixExpr();

  /**
   * Returns a new object of class '<em>Slang Lit Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Lit Term</em>'.
   * @generated
   */
  SlangLitTerm createSlangLitTerm();

  /**
   * Returns a new object of class '<em>Slang Interp Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Interp Term</em>'.
   * @generated
   */
  SlangInterpTerm createSlangInterpTerm();

  /**
   * Returns a new object of class '<em>In State Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>In State Expr</em>'.
   * @generated
   */
  InStateExpr createInStateExpr();

  /**
   * Returns a new object of class '<em>May Send Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>May Send Expr</em>'.
   * @generated
   */
  MaySendExpr createMaySendExpr();

  /**
   * Returns a new object of class '<em>Must Send Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Must Send Expr</em>'.
   * @generated
   */
  MustSendExpr createMustSendExpr();

  /**
   * Returns a new object of class '<em>No Send Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>No Send Expr</em>'.
   * @generated
   */
  NoSendExpr createNoSendExpr();

  /**
   * Returns a new object of class '<em>Has Event Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Has Event Expr</em>'.
   * @generated
   */
  HasEventExpr createHasEventExpr();

  /**
   * Returns a new object of class '<em>Enum Lit Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Lit Expr</em>'.
   * @generated
   */
  EnumLitExpr createEnumLitExpr();

  /**
   * Returns a new object of class '<em>Paren Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Paren Expr</em>'.
   * @generated
   */
  ParenExpr createParenExpr();

  /**
   * Returns a new object of class '<em>Slang For Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang For Term</em>'.
   * @generated
   */
  SlangForTerm createSlangForTerm();

  /**
   * Returns a new object of class '<em>Slang Block Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Block Term</em>'.
   * @generated
   */
  SlangBlockTerm createSlangBlockTerm();

  /**
   * Returns a new object of class '<em>F32 Obj</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>F32 Obj</em>'.
   * @generated
   */
  F32Obj createF32Obj();

  /**
   * Returns a new object of class '<em>F64 Obj</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>F64 Obj</em>'.
   * @generated
   */
  F64Obj createF64Obj();

  /**
   * Returns a new object of class '<em>Call Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Call Expr</em>'.
   * @generated
   */
  CallExpr createCallExpr();

  /**
   * Returns a new object of class '<em>Record Lit Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Record Lit Expr</em>'.
   * @generated
   */
  RecordLitExpr createRecordLitExpr();

  /**
   * Returns a new object of class '<em>Data Ref Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Ref Expr</em>'.
   * @generated
   */
  DataRefExpr createDataRefExpr();

  /**
   * Returns a new object of class '<em>Result Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Result Expr</em>'.
   * @generated
   */
  ResultExpr createResultExpr();

  /**
   * Returns a new object of class '<em>Boolean Lit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Lit</em>'.
   * @generated
   */
  BooleanLit createBooleanLit();

  /**
   * Returns a new object of class '<em>Integer Lit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer Lit</em>'.
   * @generated
   */
  IntegerLit createIntegerLit();

  /**
   * Returns a new object of class '<em>Hex Lit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hex Lit</em>'.
   * @generated
   */
  HexLit createHexLit();

  /**
   * Returns a new object of class '<em>Bin Lit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bin Lit</em>'.
   * @generated
   */
  BinLit createBinLit();

  /**
   * Returns a new object of class '<em>F32 Lit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>F32 Lit</em>'.
   * @generated
   */
  F32Lit createF32Lit();

  /**
   * Returns a new object of class '<em>F64 Lit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>F64 Lit</em>'.
   * @generated
   */
  F64Lit createF64Lit();

  /**
   * Returns a new object of class '<em>Slang String Lit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang String Lit</em>'.
   * @generated
   */
  SlangStringLit createSlangStringLit();

  /**
   * Returns a new object of class '<em>Slang Literal Interp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Literal Interp</em>'.
   * @generated
   */
  SlangLiteralInterp createSlangLiteralInterp();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  GumboPackage getGumboPackage();

} //GumboFactory
