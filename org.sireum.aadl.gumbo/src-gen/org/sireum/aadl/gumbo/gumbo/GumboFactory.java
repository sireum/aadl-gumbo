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
   * Returns a new object of class '<em>Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr</em>'.
   * @generated
   */
  Expr createExpr();

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
   * Returns a new object of class '<em>Binary Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Binary Expr</em>'.
   * @generated
   */
  BinaryExpr createBinaryExpr();

  /**
   * Returns a new object of class '<em>Unary Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unary Expr</em>'.
   * @generated
   */
  UnaryExpr createUnaryExpr();

  /**
   * Returns a new object of class '<em>Data Ref Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Ref Expr</em>'.
   * @generated
   */
  DataRefExpr createDataRefExpr();

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
   * Returns a new object of class '<em>Int Lit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Lit</em>'.
   * @generated
   */
  IntLit createIntLit();

  /**
   * Returns a new object of class '<em>Real Lit Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Real Lit Expr</em>'.
   * @generated
   */
  RealLitExpr createRealLitExpr();

  /**
   * Returns a new object of class '<em>Bool Lit Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bool Lit Expr</em>'.
   * @generated
   */
  BoolLitExpr createBoolLitExpr();

  /**
   * Returns a new object of class '<em>Floor Cast</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Floor Cast</em>'.
   * @generated
   */
  FloorCast createFloorCast();

  /**
   * Returns a new object of class '<em>Real Cast</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Real Cast</em>'.
   * @generated
   */
  RealCast createRealCast();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  GumboPackage getGumboPackage();

} //GumboFactory
