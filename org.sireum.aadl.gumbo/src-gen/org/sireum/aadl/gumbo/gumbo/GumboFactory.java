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
   * Returns a new object of class '<em>Other Data Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Other Data Ref</em>'.
   * @generated
   */
  OtherDataRef createOtherDataRef();

  /**
   * Returns a new object of class '<em>Double Dot Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Double Dot Ref</em>'.
   * @generated
   */
  DoubleDotRef createDoubleDotRef();

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
   * Returns a new object of class '<em>Slang Def Decl Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Def Decl Def</em>'.
   * @generated
   */
  SlangDefDeclDef createSlangDefDeclDef();

  /**
   * Returns a new object of class '<em>Slang Def Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Def Decl</em>'.
   * @generated
   */
  SlangDefDecl createSlangDefDecl();

  /**
   * Returns a new object of class '<em>Slang Def Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Def Def</em>'.
   * @generated
   */
  SlangDefDef createSlangDefDef();

  /**
   * Returns a new object of class '<em>Slang Def Ext</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Def Ext</em>'.
   * @generated
   */
  SlangDefExt createSlangDefExt();

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
   * Returns a new object of class '<em>Slang Def Contract</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Def Contract</em>'.
   * @generated
   */
  SlangDefContract createSlangDefContract();

  /**
   * Returns a new object of class '<em>Slang Def Contract Case</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Def Contract Case</em>'.
   * @generated
   */
  SlangDefContractCase createSlangDefContractCase();

  /**
   * Returns a new object of class '<em>Slang Suprs</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Suprs</em>'.
   * @generated
   */
  SlangSuprs createSlangSuprs();

  /**
   * Returns a new object of class '<em>Slang Supr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Supr</em>'.
   * @generated
   */
  SlangSupr createSlangSupr();

  /**
   * Returns a new object of class '<em>Slang Ext</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Ext</em>'.
   * @generated
   */
  SlangExt createSlangExt();

  /**
   * Returns a new object of class '<em>Slang Invariant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Invariant</em>'.
   * @generated
   */
  SlangInvariant createSlangInvariant();

  /**
   * Returns a new object of class '<em>Slang Reads</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Reads</em>'.
   * @generated
   */
  SlangReads createSlangReads();

  /**
   * Returns a new object of class '<em>Slang Requires</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Requires</em>'.
   * @generated
   */
  SlangRequires createSlangRequires();

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
   * Returns a new object of class '<em>Slang LHS Suffix</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang LHS Suffix</em>'.
   * @generated
   */
  SlangLHSSuffix createSlangLHSSuffix();

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
   * Returns a new object of class '<em>Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr</em>'.
   * @generated
   */
  Expr createExpr();

  /**
   * Returns a new object of class '<em>Slang Quant Var</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Quant Var</em>'.
   * @generated
   */
  SlangQuantVar createSlangQuantVar();

  /**
   * Returns a new object of class '<em>Slang Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Block</em>'.
   * @generated
   */
  SlangBlock createSlangBlock();

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
   * Returns a new object of class '<em>Slang ID Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang ID Exp</em>'.
   * @generated
   */
  SlangIDExp createSlangIDExp();

  /**
   * Returns a new object of class '<em>Slang Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Type</em>'.
   * @generated
   */
  SlangType createSlangType();

  /**
   * Returns a new object of class '<em>Slang Type Args</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Type Args</em>'.
   * @generated
   */
  SlangTypeArgs createSlangTypeArgs();

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
   * Returns a new object of class '<em>Slang MInterp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang MInterp</em>'.
   * @generated
   */
  SlangMInterp createSlangMInterp();

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
   * Returns a new object of class '<em>Slang Id Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Id Stmt</em>'.
   * @generated
   */
  SlangIdStmt createSlangIdStmt();

  /**
   * Returns a new object of class '<em>Slang Field Lookup</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Field Lookup</em>'.
   * @generated
   */
  SlangFieldLookup createSlangFieldLookup();

  /**
   * Returns a new object of class '<em>Slang Method Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Method Call</em>'.
   * @generated
   */
  SlangMethodCall createSlangMethodCall();

  /**
   * Returns a new object of class '<em>Basic Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Basic Exp</em>'.
   * @generated
   */
  BasicExp createBasicExp();

  /**
   * Returns a new object of class '<em>Quantified Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Quantified Exp</em>'.
   * @generated
   */
  QuantifiedExp createQuantifiedExp();

  /**
   * Returns a new object of class '<em>Unary Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unary Exp</em>'.
   * @generated
   */
  UnaryExp createUnaryExp();

  /**
   * Returns a new object of class '<em>Slang Access</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Access</em>'.
   * @generated
   */
  SlangAccess createSlangAccess();

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
   * Returns a new object of class '<em>Enum Lit Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Lit Expr</em>'.
   * @generated
   */
  EnumLitExpr createEnumLitExpr();

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
   * Returns a new object of class '<em>Slang Tuple Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang Tuple Term</em>'.
   * @generated
   */
  SlangTupleTerm createSlangTupleTerm();

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
   * Returns a new object of class '<em>Int Idf Lit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Idf Lit</em>'.
   * @generated
   */
  IntIdfLit createIntIdfLit();

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
   * Returns a new object of class '<em>Real Lit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Real Lit</em>'.
   * @generated
   */
  RealLit createRealLit();

  /**
   * Returns a new object of class '<em>Slang String Lit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slang String Lit</em>'.
   * @generated
   */
  SlangStringLit createSlangStringLit();

  /**
   * Returns a new object of class '<em>Real Idf Lit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Real Idf Lit</em>'.
   * @generated
   */
  RealIdfLit createRealIdfLit();

  /**
   * Returns a new object of class '<em>MString Lit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>MString Lit</em>'.
   * @generated
   */
  MStringLit createMStringLit();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  GumboPackage getGumboPackage();

} //GumboFactory
