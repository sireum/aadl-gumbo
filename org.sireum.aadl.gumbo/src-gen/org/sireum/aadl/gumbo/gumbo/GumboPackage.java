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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.osate.aadl2.Aadl2Package;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.sireum.aadl.gumbo.gumbo.GumboFactory
 * @model kind="package"
 * @generated
 */
public interface GumboPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "gumbo";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.sireum.org/aadl/gumbo/Gumbo";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "gumbo";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GumboPackage eINSTANCE = org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl.init();

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.GumboLibraryImpl <em>Library</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboLibraryImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getGumboLibrary()
   * @generated
   */
  int GUMBO_LIBRARY = 0;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUMBO_LIBRARY__OWNED_ELEMENT = Aadl2Package.ANNEX_LIBRARY__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUMBO_LIBRARY__OWNED_COMMENT = Aadl2Package.ANNEX_LIBRARY__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUMBO_LIBRARY__NAME = Aadl2Package.ANNEX_LIBRARY__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUMBO_LIBRARY__QUALIFIED_NAME = Aadl2Package.ANNEX_LIBRARY__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUMBO_LIBRARY__OWNED_PROPERTY_ASSOCIATION = Aadl2Package.ANNEX_LIBRARY__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The number of structural features of the '<em>Library</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUMBO_LIBRARY_FEATURE_COUNT = Aadl2Package.ANNEX_LIBRARY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.GumboSubclauseImpl <em>Subclause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboSubclauseImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getGumboSubclause()
   * @generated
   */
  int GUMBO_SUBCLAUSE = 1;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUMBO_SUBCLAUSE__OWNED_ELEMENT = Aadl2Package.ANNEX_SUBCLAUSE__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUMBO_SUBCLAUSE__OWNED_COMMENT = Aadl2Package.ANNEX_SUBCLAUSE__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUMBO_SUBCLAUSE__NAME = Aadl2Package.ANNEX_SUBCLAUSE__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUMBO_SUBCLAUSE__QUALIFIED_NAME = Aadl2Package.ANNEX_SUBCLAUSE__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUMBO_SUBCLAUSE__OWNED_PROPERTY_ASSOCIATION = Aadl2Package.ANNEX_SUBCLAUSE__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The feature id for the '<em><b>In Mode</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUMBO_SUBCLAUSE__IN_MODE = Aadl2Package.ANNEX_SUBCLAUSE__IN_MODE;

  /**
   * The feature id for the '<em><b>Specs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUMBO_SUBCLAUSE__SPECS = Aadl2Package.ANNEX_SUBCLAUSE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Subclause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUMBO_SUBCLAUSE_FEATURE_COUNT = Aadl2Package.ANNEX_SUBCLAUSE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SpecSectionImpl <em>Spec Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SpecSectionImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSpecSection()
   * @generated
   */
  int SPEC_SECTION = 2;

  /**
   * The feature id for the '<em><b>State</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC_SECTION__STATE = 0;

  /**
   * The feature id for the '<em><b>Invariants</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC_SECTION__INVARIANTS = 1;

  /**
   * The feature id for the '<em><b>Integration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC_SECTION__INTEGRATION = 2;

  /**
   * The feature id for the '<em><b>Initialize</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC_SECTION__INITIALIZE = 3;

  /**
   * The feature id for the '<em><b>Compute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC_SECTION__COMPUTE = 4;

  /**
   * The number of structural features of the '<em>Spec Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC_SECTION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.StateImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getState()
   * @generated
   */
  int STATE = 3;

  /**
   * The feature id for the '<em><b>Decls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__DECLS = 0;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.StateVarDeclImpl <em>State Var Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.StateVarDeclImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getStateVarDecl()
   * @generated
   */
  int STATE_VAR_DECL = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_VAR_DECL__NAME = 0;

  /**
   * The feature id for the '<em><b>Type Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_VAR_DECL__TYPE_NAME = 1;

  /**
   * The number of structural features of the '<em>State Var Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_VAR_DECL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.InvariantsImpl <em>Invariants</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.InvariantsImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getInvariants()
   * @generated
   */
  int INVARIANTS = 5;

  /**
   * The feature id for the '<em><b>Specs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVARIANTS__SPECS = 0;

  /**
   * The number of structural features of the '<em>Invariants</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVARIANTS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.InvSpecImpl <em>Inv Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.InvSpecImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getInvSpec()
   * @generated
   */
  int INV_SPEC = 6;

  /**
   * The feature id for the '<em><b>Display Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INV_SPEC__DISPLAY_NAME = 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INV_SPEC__EXPR = 1;

  /**
   * The number of structural features of the '<em>Inv Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INV_SPEC_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.IntegrationImpl <em>Integration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.IntegrationImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getIntegration()
   * @generated
   */
  int INTEGRATION = 7;

  /**
   * The feature id for the '<em><b>Specs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGRATION__SPECS = 0;

  /**
   * The number of structural features of the '<em>Integration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGRATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.InitializeImpl <em>Initialize</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.InitializeImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getInitialize()
   * @generated
   */
  int INITIALIZE = 8;

  /**
   * The feature id for the '<em><b>Specs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALIZE__SPECS = 0;

  /**
   * The number of structural features of the '<em>Initialize</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALIZE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.InitializeSpecStatementImpl <em>Initialize Spec Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.InitializeSpecStatementImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getInitializeSpecStatement()
   * @generated
   */
  int INITIALIZE_SPEC_STATEMENT = 9;

  /**
   * The number of structural features of the '<em>Initialize Spec Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALIZE_SPEC_STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.ComputeImpl <em>Compute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.ComputeImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getCompute()
   * @generated
   */
  int COMPUTE = 10;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPUTE__CASES = 0;

  /**
   * The number of structural features of the '<em>Compute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.CaseStatementClauseImpl <em>Case Statement Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.CaseStatementClauseImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getCaseStatementClause()
   * @generated
   */
  int CASE_STATEMENT_CLAUSE = 11;

  /**
   * The feature id for the '<em><b>Display Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_STATEMENT_CLAUSE__DISPLAY_NAME = 0;

  /**
   * The feature id for the '<em><b>Assume Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_STATEMENT_CLAUSE__ASSUME_STATEMENT = 1;

  /**
   * The feature id for the '<em><b>Guarantee Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_STATEMENT_CLAUSE__GUARANTEE_STATEMENT = 2;

  /**
   * The number of structural features of the '<em>Case Statement Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_STATEMENT_CLAUSE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SpecStatementImpl <em>Spec Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SpecStatementImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSpecStatement()
   * @generated
   */
  int SPEC_STATEMENT = 12;

  /**
   * The feature id for the '<em><b>Display Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC_STATEMENT__DISPLAY_NAME = 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC_STATEMENT__EXPR = 1;

  /**
   * The number of structural features of the '<em>Spec Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC_STATEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.AssumeStatementImpl <em>Assume Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.AssumeStatementImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getAssumeStatement()
   * @generated
   */
  int ASSUME_STATEMENT = 13;

  /**
   * The feature id for the '<em><b>Display Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSUME_STATEMENT__DISPLAY_NAME = SPEC_STATEMENT__DISPLAY_NAME;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSUME_STATEMENT__EXPR = SPEC_STATEMENT__EXPR;

  /**
   * The number of structural features of the '<em>Assume Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSUME_STATEMENT_FEATURE_COUNT = SPEC_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.AnonAssumeStatementImpl <em>Anon Assume Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.AnonAssumeStatementImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getAnonAssumeStatement()
   * @generated
   */
  int ANON_ASSUME_STATEMENT = 14;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANON_ASSUME_STATEMENT__EXPR = 0;

  /**
   * The number of structural features of the '<em>Anon Assume Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANON_ASSUME_STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.GuaranteeStatementImpl <em>Guarantee Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.GuaranteeStatementImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getGuaranteeStatement()
   * @generated
   */
  int GUARANTEE_STATEMENT = 15;

  /**
   * The feature id for the '<em><b>Display Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARANTEE_STATEMENT__DISPLAY_NAME = INITIALIZE_SPEC_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARANTEE_STATEMENT__EXPR = INITIALIZE_SPEC_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Guarantee Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARANTEE_STATEMENT_FEATURE_COUNT = INITIALIZE_SPEC_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.AnonGuaranteeStatementImpl <em>Anon Guarantee Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.AnonGuaranteeStatementImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getAnonGuaranteeStatement()
   * @generated
   */
  int ANON_GUARANTEE_STATEMENT = 16;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANON_GUARANTEE_STATEMENT__EXPR = 0;

  /**
   * The number of structural features of the '<em>Anon Guarantee Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANON_GUARANTEE_STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.ExprImpl <em>Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.ExprImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getExpr()
   * @generated
   */
  int EXPR = 17;

  /**
   * The number of structural features of the '<em>Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.DoubleDotRefImpl <em>Double Dot Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.DoubleDotRefImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getDoubleDotRef()
   * @generated
   */
  int DOUBLE_DOT_REF = 18;

  /**
   * The feature id for the '<em><b>Elm</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_DOT_REF__ELM = 0;

  /**
   * The number of structural features of the '<em>Double Dot Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_DOT_REF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SubcomponentElementImpl <em>Subcomponent Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SubcomponentElementImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSubcomponentElement()
   * @generated
   */
  int SUBCOMPONENT_ELEMENT = 19;

  /**
   * The feature id for the '<em><b>Subcomponent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBCOMPONENT_ELEMENT__SUBCOMPONENT = 0;

  /**
   * The number of structural features of the '<em>Subcomponent Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBCOMPONENT_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.FeatureElementImpl <em>Feature Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.FeatureElementImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getFeatureElement()
   * @generated
   */
  int FEATURE_ELEMENT = 20;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_ELEMENT__FEATURE = 0;

  /**
   * The number of structural features of the '<em>Feature Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.BinaryExprImpl <em>Binary Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.BinaryExprImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getBinaryExpr()
   * @generated
   */
  int BINARY_EXPR = 21;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPR__LEFT = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPR__RIGHT = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPR__OP = EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Binary Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.UnaryExprImpl <em>Unary Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.UnaryExprImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getUnaryExpr()
   * @generated
   */
  int UNARY_EXPR = 22;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPR__OP = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPR__EXPR = EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Unary Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.StateVarRefImpl <em>State Var Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.StateVarRefImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getStateVarRef()
   * @generated
   */
  int STATE_VAR_REF = 23;

  /**
   * The feature id for the '<em><b>State Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_VAR_REF__STATE_VAR = EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>State Var Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_VAR_REF_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.PortRefImpl <em>Port Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.PortRefImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getPortRef()
   * @generated
   */
  int PORT_REF = 24;

  /**
   * The feature id for the '<em><b>Port Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT_REF__PORT_NAME = EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Port Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT_REF_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.EnumLitExprImpl <em>Enum Lit Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.EnumLitExprImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getEnumLitExpr()
   * @generated
   */
  int ENUM_LIT_EXPR = 25;

  /**
   * The feature id for the '<em><b>Enum Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_LIT_EXPR__ENUM_TYPE = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_LIT_EXPR__VALUE = EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Enum Lit Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_LIT_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.IntLitImpl <em>Int Lit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.IntLitImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getIntLit()
   * @generated
   */
  int INT_LIT = 26;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LIT__VALUE = EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Int Lit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LIT_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.RealLitExprImpl <em>Real Lit Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.RealLitExprImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getRealLitExpr()
   * @generated
   */
  int REAL_LIT_EXPR = 27;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_LIT_EXPR__VAL = EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Real Lit Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_LIT_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.BoolLitExprImpl <em>Bool Lit Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.BoolLitExprImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getBoolLitExpr()
   * @generated
   */
  int BOOL_LIT_EXPR = 28;

  /**
   * The feature id for the '<em><b>Val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_LIT_EXPR__VAL = EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Bool Lit Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_LIT_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.FloorCastImpl <em>Floor Cast</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.FloorCastImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getFloorCast()
   * @generated
   */
  int FLOOR_CAST = 29;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOOR_CAST__EXPR = EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Floor Cast</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOOR_CAST_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.RealCastImpl <em>Real Cast</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.RealCastImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getRealCast()
   * @generated
   */
  int REAL_CAST = 30;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_CAST__EXPR = EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Real Cast</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_CAST_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.GumboLibrary <em>Library</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Library</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.GumboLibrary
   * @generated
   */
  EClass getGumboLibrary();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.GumboSubclause <em>Subclause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subclause</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.GumboSubclause
   * @generated
   */
  EClass getGumboSubclause();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.GumboSubclause#getSpecs <em>Specs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Specs</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.GumboSubclause#getSpecs()
   * @see #getGumboSubclause()
   * @generated
   */
  EReference getGumboSubclause_Specs();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SpecSection <em>Spec Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Spec Section</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SpecSection
   * @generated
   */
  EClass getSpecSection();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SpecSection#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>State</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SpecSection#getState()
   * @see #getSpecSection()
   * @generated
   */
  EReference getSpecSection_State();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SpecSection#getInvariants <em>Invariants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Invariants</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SpecSection#getInvariants()
   * @see #getSpecSection()
   * @generated
   */
  EReference getSpecSection_Invariants();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SpecSection#getIntegration <em>Integration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Integration</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SpecSection#getIntegration()
   * @see #getSpecSection()
   * @generated
   */
  EReference getSpecSection_Integration();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SpecSection#getInitialize <em>Initialize</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initialize</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SpecSection#getInitialize()
   * @see #getSpecSection()
   * @generated
   */
  EReference getSpecSection_Initialize();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SpecSection#getCompute <em>Compute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Compute</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SpecSection#getCompute()
   * @see #getSpecSection()
   * @generated
   */
  EReference getSpecSection_Compute();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.State#getDecls <em>Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Decls</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.State#getDecls()
   * @see #getState()
   * @generated
   */
  EReference getState_Decls();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.StateVarDecl <em>State Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Var Decl</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.StateVarDecl
   * @generated
   */
  EClass getStateVarDecl();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.StateVarDecl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.StateVarDecl#getName()
   * @see #getStateVarDecl()
   * @generated
   */
  EAttribute getStateVarDecl_Name();

  /**
   * Returns the meta object for the reference '{@link org.sireum.aadl.gumbo.gumbo.StateVarDecl#getTypeName <em>Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type Name</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.StateVarDecl#getTypeName()
   * @see #getStateVarDecl()
   * @generated
   */
  EReference getStateVarDecl_TypeName();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.Invariants <em>Invariants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Invariants</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.Invariants
   * @generated
   */
  EClass getInvariants();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.Invariants#getSpecs <em>Specs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Specs</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.Invariants#getSpecs()
   * @see #getInvariants()
   * @generated
   */
  EReference getInvariants_Specs();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.InvSpec <em>Inv Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inv Spec</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.InvSpec
   * @generated
   */
  EClass getInvSpec();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.InvSpec#getDisplayName <em>Display Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Display Name</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.InvSpec#getDisplayName()
   * @see #getInvSpec()
   * @generated
   */
  EAttribute getInvSpec_DisplayName();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.InvSpec#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.InvSpec#getExpr()
   * @see #getInvSpec()
   * @generated
   */
  EReference getInvSpec_Expr();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.Integration <em>Integration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integration</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.Integration
   * @generated
   */
  EClass getIntegration();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.Integration#getSpecs <em>Specs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Specs</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.Integration#getSpecs()
   * @see #getIntegration()
   * @generated
   */
  EReference getIntegration_Specs();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.Initialize <em>Initialize</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Initialize</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.Initialize
   * @generated
   */
  EClass getInitialize();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.Initialize#getSpecs <em>Specs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Specs</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.Initialize#getSpecs()
   * @see #getInitialize()
   * @generated
   */
  EReference getInitialize_Specs();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.InitializeSpecStatement <em>Initialize Spec Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Initialize Spec Statement</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.InitializeSpecStatement
   * @generated
   */
  EClass getInitializeSpecStatement();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.Compute <em>Compute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compute</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.Compute
   * @generated
   */
  EClass getCompute();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.Compute#getCases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cases</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.Compute#getCases()
   * @see #getCompute()
   * @generated
   */
  EReference getCompute_Cases();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.CaseStatementClause <em>Case Statement Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case Statement Clause</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.CaseStatementClause
   * @generated
   */
  EClass getCaseStatementClause();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.CaseStatementClause#getDisplayName <em>Display Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Display Name</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.CaseStatementClause#getDisplayName()
   * @see #getCaseStatementClause()
   * @generated
   */
  EAttribute getCaseStatementClause_DisplayName();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.CaseStatementClause#getAssumeStatement <em>Assume Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assume Statement</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.CaseStatementClause#getAssumeStatement()
   * @see #getCaseStatementClause()
   * @generated
   */
  EReference getCaseStatementClause_AssumeStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.CaseStatementClause#getGuaranteeStatement <em>Guarantee Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Guarantee Statement</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.CaseStatementClause#getGuaranteeStatement()
   * @see #getCaseStatementClause()
   * @generated
   */
  EReference getCaseStatementClause_GuaranteeStatement();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SpecStatement <em>Spec Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Spec Statement</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SpecStatement
   * @generated
   */
  EClass getSpecStatement();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.SpecStatement#getDisplayName <em>Display Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Display Name</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SpecStatement#getDisplayName()
   * @see #getSpecStatement()
   * @generated
   */
  EAttribute getSpecStatement_DisplayName();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SpecStatement#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SpecStatement#getExpr()
   * @see #getSpecStatement()
   * @generated
   */
  EReference getSpecStatement_Expr();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.AssumeStatement <em>Assume Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assume Statement</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.AssumeStatement
   * @generated
   */
  EClass getAssumeStatement();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.AnonAssumeStatement <em>Anon Assume Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Anon Assume Statement</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.AnonAssumeStatement
   * @generated
   */
  EClass getAnonAssumeStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.AnonAssumeStatement#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.AnonAssumeStatement#getExpr()
   * @see #getAnonAssumeStatement()
   * @generated
   */
  EReference getAnonAssumeStatement_Expr();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.GuaranteeStatement <em>Guarantee Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Guarantee Statement</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.GuaranteeStatement
   * @generated
   */
  EClass getGuaranteeStatement();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.AnonGuaranteeStatement <em>Anon Guarantee Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Anon Guarantee Statement</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.AnonGuaranteeStatement
   * @generated
   */
  EClass getAnonGuaranteeStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.AnonGuaranteeStatement#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.AnonGuaranteeStatement#getExpr()
   * @see #getAnonGuaranteeStatement()
   * @generated
   */
  EReference getAnonGuaranteeStatement_Expr();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.Expr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.Expr
   * @generated
   */
  EClass getExpr();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.DoubleDotRef <em>Double Dot Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Double Dot Ref</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.DoubleDotRef
   * @generated
   */
  EClass getDoubleDotRef();

  /**
   * Returns the meta object for the reference '{@link org.sireum.aadl.gumbo.gumbo.DoubleDotRef#getElm <em>Elm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Elm</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.DoubleDotRef#getElm()
   * @see #getDoubleDotRef()
   * @generated
   */
  EReference getDoubleDotRef_Elm();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SubcomponentElement <em>Subcomponent Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subcomponent Element</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SubcomponentElement
   * @generated
   */
  EClass getSubcomponentElement();

  /**
   * Returns the meta object for the reference '{@link org.sireum.aadl.gumbo.gumbo.SubcomponentElement#getSubcomponent <em>Subcomponent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Subcomponent</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SubcomponentElement#getSubcomponent()
   * @see #getSubcomponentElement()
   * @generated
   */
  EReference getSubcomponentElement_Subcomponent();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.FeatureElement <em>Feature Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Element</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.FeatureElement
   * @generated
   */
  EClass getFeatureElement();

  /**
   * Returns the meta object for the reference '{@link org.sireum.aadl.gumbo.gumbo.FeatureElement#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Feature</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.FeatureElement#getFeature()
   * @see #getFeatureElement()
   * @generated
   */
  EReference getFeatureElement_Feature();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.BinaryExpr <em>Binary Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binary Expr</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.BinaryExpr
   * @generated
   */
  EClass getBinaryExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.BinaryExpr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.BinaryExpr#getLeft()
   * @see #getBinaryExpr()
   * @generated
   */
  EReference getBinaryExpr_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.BinaryExpr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.BinaryExpr#getRight()
   * @see #getBinaryExpr()
   * @generated
   */
  EReference getBinaryExpr_Right();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.BinaryExpr#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.BinaryExpr#getOp()
   * @see #getBinaryExpr()
   * @generated
   */
  EAttribute getBinaryExpr_Op();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.UnaryExpr <em>Unary Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Expr</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.UnaryExpr
   * @generated
   */
  EClass getUnaryExpr();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.UnaryExpr#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.UnaryExpr#getOp()
   * @see #getUnaryExpr()
   * @generated
   */
  EAttribute getUnaryExpr_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.UnaryExpr#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.UnaryExpr#getExpr()
   * @see #getUnaryExpr()
   * @generated
   */
  EReference getUnaryExpr_Expr();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.StateVarRef <em>State Var Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Var Ref</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.StateVarRef
   * @generated
   */
  EClass getStateVarRef();

  /**
   * Returns the meta object for the reference '{@link org.sireum.aadl.gumbo.gumbo.StateVarRef#getStateVar <em>State Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>State Var</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.StateVarRef#getStateVar()
   * @see #getStateVarRef()
   * @generated
   */
  EReference getStateVarRef_StateVar();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.PortRef <em>Port Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Port Ref</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.PortRef
   * @generated
   */
  EClass getPortRef();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.PortRef#getPortName <em>Port Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Port Name</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.PortRef#getPortName()
   * @see #getPortRef()
   * @generated
   */
  EAttribute getPortRef_PortName();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.EnumLitExpr <em>Enum Lit Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Lit Expr</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.EnumLitExpr
   * @generated
   */
  EClass getEnumLitExpr();

  /**
   * Returns the meta object for the reference '{@link org.sireum.aadl.gumbo.gumbo.EnumLitExpr#getEnumType <em>Enum Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Enum Type</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.EnumLitExpr#getEnumType()
   * @see #getEnumLitExpr()
   * @generated
   */
  EReference getEnumLitExpr_EnumType();

  /**
   * Returns the meta object for the reference '{@link org.sireum.aadl.gumbo.gumbo.EnumLitExpr#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.EnumLitExpr#getValue()
   * @see #getEnumLitExpr()
   * @generated
   */
  EReference getEnumLitExpr_Value();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.IntLit <em>Int Lit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Lit</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.IntLit
   * @generated
   */
  EClass getIntLit();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.IntLit#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.IntLit#getValue()
   * @see #getIntLit()
   * @generated
   */
  EAttribute getIntLit_Value();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.RealLitExpr <em>Real Lit Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Real Lit Expr</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.RealLitExpr
   * @generated
   */
  EClass getRealLitExpr();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.RealLitExpr#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.RealLitExpr#getVal()
   * @see #getRealLitExpr()
   * @generated
   */
  EAttribute getRealLitExpr_Val();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.BoolLitExpr <em>Bool Lit Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bool Lit Expr</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.BoolLitExpr
   * @generated
   */
  EClass getBoolLitExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.BoolLitExpr#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Val</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.BoolLitExpr#getVal()
   * @see #getBoolLitExpr()
   * @generated
   */
  EReference getBoolLitExpr_Val();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.FloorCast <em>Floor Cast</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Floor Cast</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.FloorCast
   * @generated
   */
  EClass getFloorCast();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.FloorCast#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.FloorCast#getExpr()
   * @see #getFloorCast()
   * @generated
   */
  EReference getFloorCast_Expr();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.RealCast <em>Real Cast</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Real Cast</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.RealCast
   * @generated
   */
  EClass getRealCast();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.RealCast#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.RealCast#getExpr()
   * @see #getRealCast()
   * @generated
   */
  EReference getRealCast_Expr();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  GumboFactory getGumboFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.GumboLibraryImpl <em>Library</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboLibraryImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getGumboLibrary()
     * @generated
     */
    EClass GUMBO_LIBRARY = eINSTANCE.getGumboLibrary();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.GumboSubclauseImpl <em>Subclause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboSubclauseImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getGumboSubclause()
     * @generated
     */
    EClass GUMBO_SUBCLAUSE = eINSTANCE.getGumboSubclause();

    /**
     * The meta object literal for the '<em><b>Specs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GUMBO_SUBCLAUSE__SPECS = eINSTANCE.getGumboSubclause_Specs();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SpecSectionImpl <em>Spec Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SpecSectionImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSpecSection()
     * @generated
     */
    EClass SPEC_SECTION = eINSTANCE.getSpecSection();

    /**
     * The meta object literal for the '<em><b>State</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPEC_SECTION__STATE = eINSTANCE.getSpecSection_State();

    /**
     * The meta object literal for the '<em><b>Invariants</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPEC_SECTION__INVARIANTS = eINSTANCE.getSpecSection_Invariants();

    /**
     * The meta object literal for the '<em><b>Integration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPEC_SECTION__INTEGRATION = eINSTANCE.getSpecSection_Integration();

    /**
     * The meta object literal for the '<em><b>Initialize</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPEC_SECTION__INITIALIZE = eINSTANCE.getSpecSection_Initialize();

    /**
     * The meta object literal for the '<em><b>Compute</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPEC_SECTION__COMPUTE = eINSTANCE.getSpecSection_Compute();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.StateImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>Decls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__DECLS = eINSTANCE.getState_Decls();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.StateVarDeclImpl <em>State Var Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.StateVarDeclImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getStateVarDecl()
     * @generated
     */
    EClass STATE_VAR_DECL = eINSTANCE.getStateVarDecl();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_VAR_DECL__NAME = eINSTANCE.getStateVarDecl_Name();

    /**
     * The meta object literal for the '<em><b>Type Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_VAR_DECL__TYPE_NAME = eINSTANCE.getStateVarDecl_TypeName();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.InvariantsImpl <em>Invariants</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.InvariantsImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getInvariants()
     * @generated
     */
    EClass INVARIANTS = eINSTANCE.getInvariants();

    /**
     * The meta object literal for the '<em><b>Specs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INVARIANTS__SPECS = eINSTANCE.getInvariants_Specs();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.InvSpecImpl <em>Inv Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.InvSpecImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getInvSpec()
     * @generated
     */
    EClass INV_SPEC = eINSTANCE.getInvSpec();

    /**
     * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INV_SPEC__DISPLAY_NAME = eINSTANCE.getInvSpec_DisplayName();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INV_SPEC__EXPR = eINSTANCE.getInvSpec_Expr();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.IntegrationImpl <em>Integration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.IntegrationImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getIntegration()
     * @generated
     */
    EClass INTEGRATION = eINSTANCE.getIntegration();

    /**
     * The meta object literal for the '<em><b>Specs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTEGRATION__SPECS = eINSTANCE.getIntegration_Specs();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.InitializeImpl <em>Initialize</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.InitializeImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getInitialize()
     * @generated
     */
    EClass INITIALIZE = eINSTANCE.getInitialize();

    /**
     * The meta object literal for the '<em><b>Specs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INITIALIZE__SPECS = eINSTANCE.getInitialize_Specs();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.InitializeSpecStatementImpl <em>Initialize Spec Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.InitializeSpecStatementImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getInitializeSpecStatement()
     * @generated
     */
    EClass INITIALIZE_SPEC_STATEMENT = eINSTANCE.getInitializeSpecStatement();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.ComputeImpl <em>Compute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.ComputeImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getCompute()
     * @generated
     */
    EClass COMPUTE = eINSTANCE.getCompute();

    /**
     * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPUTE__CASES = eINSTANCE.getCompute_Cases();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.CaseStatementClauseImpl <em>Case Statement Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.CaseStatementClauseImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getCaseStatementClause()
     * @generated
     */
    EClass CASE_STATEMENT_CLAUSE = eINSTANCE.getCaseStatementClause();

    /**
     * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CASE_STATEMENT_CLAUSE__DISPLAY_NAME = eINSTANCE.getCaseStatementClause_DisplayName();

    /**
     * The meta object literal for the '<em><b>Assume Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_STATEMENT_CLAUSE__ASSUME_STATEMENT = eINSTANCE.getCaseStatementClause_AssumeStatement();

    /**
     * The meta object literal for the '<em><b>Guarantee Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_STATEMENT_CLAUSE__GUARANTEE_STATEMENT = eINSTANCE.getCaseStatementClause_GuaranteeStatement();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SpecStatementImpl <em>Spec Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SpecStatementImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSpecStatement()
     * @generated
     */
    EClass SPEC_STATEMENT = eINSTANCE.getSpecStatement();

    /**
     * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPEC_STATEMENT__DISPLAY_NAME = eINSTANCE.getSpecStatement_DisplayName();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPEC_STATEMENT__EXPR = eINSTANCE.getSpecStatement_Expr();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.AssumeStatementImpl <em>Assume Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.AssumeStatementImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getAssumeStatement()
     * @generated
     */
    EClass ASSUME_STATEMENT = eINSTANCE.getAssumeStatement();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.AnonAssumeStatementImpl <em>Anon Assume Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.AnonAssumeStatementImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getAnonAssumeStatement()
     * @generated
     */
    EClass ANON_ASSUME_STATEMENT = eINSTANCE.getAnonAssumeStatement();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANON_ASSUME_STATEMENT__EXPR = eINSTANCE.getAnonAssumeStatement_Expr();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.GuaranteeStatementImpl <em>Guarantee Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.GuaranteeStatementImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getGuaranteeStatement()
     * @generated
     */
    EClass GUARANTEE_STATEMENT = eINSTANCE.getGuaranteeStatement();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.AnonGuaranteeStatementImpl <em>Anon Guarantee Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.AnonGuaranteeStatementImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getAnonGuaranteeStatement()
     * @generated
     */
    EClass ANON_GUARANTEE_STATEMENT = eINSTANCE.getAnonGuaranteeStatement();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANON_GUARANTEE_STATEMENT__EXPR = eINSTANCE.getAnonGuaranteeStatement_Expr();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.ExprImpl <em>Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.ExprImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getExpr()
     * @generated
     */
    EClass EXPR = eINSTANCE.getExpr();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.DoubleDotRefImpl <em>Double Dot Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.DoubleDotRefImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getDoubleDotRef()
     * @generated
     */
    EClass DOUBLE_DOT_REF = eINSTANCE.getDoubleDotRef();

    /**
     * The meta object literal for the '<em><b>Elm</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOUBLE_DOT_REF__ELM = eINSTANCE.getDoubleDotRef_Elm();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SubcomponentElementImpl <em>Subcomponent Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SubcomponentElementImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSubcomponentElement()
     * @generated
     */
    EClass SUBCOMPONENT_ELEMENT = eINSTANCE.getSubcomponentElement();

    /**
     * The meta object literal for the '<em><b>Subcomponent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBCOMPONENT_ELEMENT__SUBCOMPONENT = eINSTANCE.getSubcomponentElement_Subcomponent();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.FeatureElementImpl <em>Feature Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.FeatureElementImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getFeatureElement()
     * @generated
     */
    EClass FEATURE_ELEMENT = eINSTANCE.getFeatureElement();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_ELEMENT__FEATURE = eINSTANCE.getFeatureElement_Feature();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.BinaryExprImpl <em>Binary Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.BinaryExprImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getBinaryExpr()
     * @generated
     */
    EClass BINARY_EXPR = eINSTANCE.getBinaryExpr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_EXPR__LEFT = eINSTANCE.getBinaryExpr_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_EXPR__RIGHT = eINSTANCE.getBinaryExpr_Right();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINARY_EXPR__OP = eINSTANCE.getBinaryExpr_Op();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.UnaryExprImpl <em>Unary Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.UnaryExprImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getUnaryExpr()
     * @generated
     */
    EClass UNARY_EXPR = eINSTANCE.getUnaryExpr();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNARY_EXPR__OP = eINSTANCE.getUnaryExpr_Op();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_EXPR__EXPR = eINSTANCE.getUnaryExpr_Expr();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.StateVarRefImpl <em>State Var Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.StateVarRefImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getStateVarRef()
     * @generated
     */
    EClass STATE_VAR_REF = eINSTANCE.getStateVarRef();

    /**
     * The meta object literal for the '<em><b>State Var</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_VAR_REF__STATE_VAR = eINSTANCE.getStateVarRef_StateVar();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.PortRefImpl <em>Port Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.PortRefImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getPortRef()
     * @generated
     */
    EClass PORT_REF = eINSTANCE.getPortRef();

    /**
     * The meta object literal for the '<em><b>Port Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PORT_REF__PORT_NAME = eINSTANCE.getPortRef_PortName();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.EnumLitExprImpl <em>Enum Lit Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.EnumLitExprImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getEnumLitExpr()
     * @generated
     */
    EClass ENUM_LIT_EXPR = eINSTANCE.getEnumLitExpr();

    /**
     * The meta object literal for the '<em><b>Enum Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_LIT_EXPR__ENUM_TYPE = eINSTANCE.getEnumLitExpr_EnumType();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_LIT_EXPR__VALUE = eINSTANCE.getEnumLitExpr_Value();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.IntLitImpl <em>Int Lit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.IntLitImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getIntLit()
     * @generated
     */
    EClass INT_LIT = eINSTANCE.getIntLit();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INT_LIT__VALUE = eINSTANCE.getIntLit_Value();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.RealLitExprImpl <em>Real Lit Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.RealLitExprImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getRealLitExpr()
     * @generated
     */
    EClass REAL_LIT_EXPR = eINSTANCE.getRealLitExpr();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REAL_LIT_EXPR__VAL = eINSTANCE.getRealLitExpr_Val();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.BoolLitExprImpl <em>Bool Lit Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.BoolLitExprImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getBoolLitExpr()
     * @generated
     */
    EClass BOOL_LIT_EXPR = eINSTANCE.getBoolLitExpr();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOL_LIT_EXPR__VAL = eINSTANCE.getBoolLitExpr_Val();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.FloorCastImpl <em>Floor Cast</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.FloorCastImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getFloorCast()
     * @generated
     */
    EClass FLOOR_CAST = eINSTANCE.getFloorCast();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLOOR_CAST__EXPR = eINSTANCE.getFloorCast_Expr();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.RealCastImpl <em>Real Cast</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.RealCastImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getRealCast()
     * @generated
     */
    EClass REAL_CAST = eINSTANCE.getRealCast();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REAL_CAST__EXPR = eINSTANCE.getRealCast_Expr();

  }

} //GumboPackage
