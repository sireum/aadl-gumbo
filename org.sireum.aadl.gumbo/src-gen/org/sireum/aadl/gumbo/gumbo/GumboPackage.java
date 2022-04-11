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
   * The feature id for the '<em><b>Functions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC_SECTION__FUNCTIONS = 1;

  /**
   * The feature id for the '<em><b>Invariants</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC_SECTION__INVARIANTS = 2;

  /**
   * The feature id for the '<em><b>Integration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC_SECTION__INTEGRATION = 3;

  /**
   * The feature id for the '<em><b>Initialize</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC_SECTION__INITIALIZE = 4;

  /**
   * The feature id for the '<em><b>Compute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC_SECTION__COMPUTE = 5;

  /**
   * The number of structural features of the '<em>Spec Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC_SECTION_FEATURE_COUNT = 6;

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
   * The feature id for the '<em><b>Modifies</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALIZE__MODIFIES = 0;

  /**
   * The feature id for the '<em><b>Specs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALIZE__SPECS = 1;

  /**
   * The number of structural features of the '<em>Initialize</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALIZE_FEATURE_COUNT = 2;

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
   * The feature id for the '<em><b>Guarantee Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALIZE_SPEC_STATEMENT__GUARANTEE_STATEMENT = 0;

  /**
   * The number of structural features of the '<em>Initialize Spec Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALIZE_SPEC_STATEMENT_FEATURE_COUNT = 1;

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
   * The feature id for the '<em><b>Modifies</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPUTE__MODIFIES = 0;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPUTE__CASES = 1;

  /**
   * The number of structural features of the '<em>Compute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPUTE_FEATURE_COUNT = 2;

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
  int GUARANTEE_STATEMENT__DISPLAY_NAME = SPEC_STATEMENT__DISPLAY_NAME;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARANTEE_STATEMENT__EXPR = SPEC_STATEMENT__EXPR;

  /**
   * The number of structural features of the '<em>Guarantee Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARANTEE_STATEMENT_FEATURE_COUNT = SPEC_STATEMENT_FEATURE_COUNT + 0;

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
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.OtherDataRefImpl <em>Other Data Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.OtherDataRefImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getOtherDataRef()
   * @generated
   */
  int OTHER_DATA_REF = 17;

  /**
   * The feature id for the '<em><b>Named Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHER_DATA_REF__NAMED_ELEMENT = 0;

  /**
   * The feature id for the '<em><b>Array Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHER_DATA_REF__ARRAY_RANGE = 1;

  /**
   * The feature id for the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHER_DATA_REF__PATH = 2;

  /**
   * The number of structural features of the '<em>Other Data Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHER_DATA_REF_FEATURE_COUNT = 3;

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
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.DataElementImpl <em>Data Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.DataElementImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getDataElement()
   * @generated
   */
  int DATA_ELEMENT = 19;

  /**
   * The feature id for the '<em><b>Data Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ELEMENT__DATA_ELEMENT = 0;

  /**
   * The number of structural features of the '<em>Data Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SubcomponentElementImpl <em>Subcomponent Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SubcomponentElementImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSubcomponentElement()
   * @generated
   */
  int SUBCOMPONENT_ELEMENT = 20;

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
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.FunctionsImpl <em>Functions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.FunctionsImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getFunctions()
   * @generated
   */
  int FUNCTIONS = 21;

  /**
   * The feature id for the '<em><b>Specs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTIONS__SPECS = 0;

  /**
   * The number of structural features of the '<em>Functions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTIONS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.FuncSpecImpl <em>Func Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.FuncSpecImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getFuncSpec()
   * @generated
   */
  int FUNC_SPEC = 22;

  /**
   * The number of structural features of the '<em>Func Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_SPEC_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangDefDeclDefImpl <em>Slang Def Decl Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangDefDeclDefImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangDefDeclDef()
   * @generated
   */
  int SLANG_DEF_DECL_DEF = 23;

  /**
   * The feature id for the '<em><b>Sde</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_DECL_DEF__SDE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_DECL_DEF__NAME = 1;

  /**
   * The feature id for the '<em><b>Type Params</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_DECL_DEF__TYPE_PARAMS = 2;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_DECL_DEF__PARAMS = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_DECL_DEF__TYPE = 4;

  /**
   * The feature id for the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_DECL_DEF__C = 5;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_DECL_DEF__E = 6;

  /**
   * The number of structural features of the '<em>Slang Def Decl Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_DECL_DEF_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangDefDeclImpl <em>Slang Def Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangDefDeclImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangDefDecl()
   * @generated
   */
  int SLANG_DEF_DECL = 24;

  /**
   * The feature id for the '<em><b>Sde</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_DECL__SDE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_DECL__NAME = 1;

  /**
   * The feature id for the '<em><b>Type Params</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_DECL__TYPE_PARAMS = 2;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_DECL__PARAMS = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_DECL__TYPE = 4;

  /**
   * The feature id for the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_DECL__C = 5;

  /**
   * The number of structural features of the '<em>Slang Def Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_DECL_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangDefDefImpl <em>Slang Def Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangDefDefImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangDefDef()
   * @generated
   */
  int SLANG_DEF_DEF = 25;

  /**
   * The feature id for the '<em><b>Sde</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_DEF__SDE = FUNC_SPEC_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_DEF__NAME = FUNC_SPEC_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Type Params</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_DEF__TYPE_PARAMS = FUNC_SPEC_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_DEF__PARAMS = FUNC_SPEC_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_DEF__TYPE = FUNC_SPEC_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_DEF__C = FUNC_SPEC_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_DEF__E = FUNC_SPEC_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Slang Def Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_DEF_FEATURE_COUNT = FUNC_SPEC_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangDefExtImpl <em>Slang Def Ext</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangDefExtImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangDefExt()
   * @generated
   */
  int SLANG_DEF_EXT = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_EXT__NAME = 0;

  /**
   * The feature id for the '<em><b>Type Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_EXT__TYPE_NAME = 1;

  /**
   * The number of structural features of the '<em>Slang Def Ext</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_EXT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangDefParamsImpl <em>Slang Def Params</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangDefParamsImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangDefParams()
   * @generated
   */
  int SLANG_DEF_PARAMS = 27;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_PARAMS__PARAMS = 0;

  /**
   * The number of structural features of the '<em>Slang Def Params</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_PARAMS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangDefParamImpl <em>Slang Def Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangDefParamImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangDefParam()
   * @generated
   */
  int SLANG_DEF_PARAM = 28;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_PARAM__NAME = 0;

  /**
   * The feature id for the '<em><b>Type Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_PARAM__TYPE_NAME = 1;

  /**
   * The number of structural features of the '<em>Slang Def Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_PARAM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangDefContractImpl <em>Slang Def Contract</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangDefContractImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangDefContract()
   * @generated
   */
  int SLANG_DEF_CONTRACT = 29;

  /**
   * The feature id for the '<em><b>Rea</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_CONTRACT__REA = 0;

  /**
   * The feature id for the '<em><b>Req</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_CONTRACT__REQ = 1;

  /**
   * The feature id for the '<em><b>Mod</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_CONTRACT__MOD = 2;

  /**
   * The feature id for the '<em><b>Ens</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_CONTRACT__ENS = 3;

  /**
   * The feature id for the '<em><b>Contracts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_CONTRACT__CONTRACTS = 4;

  /**
   * The number of structural features of the '<em>Slang Def Contract</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_CONTRACT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangDefContractCaseImpl <em>Slang Def Contract Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangDefContractCaseImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangDefContractCase()
   * @generated
   */
  int SLANG_DEF_CONTRACT_CASE = 30;

  /**
   * The feature id for the '<em><b>Req</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_CONTRACT_CASE__REQ = 0;

  /**
   * The feature id for the '<em><b>Ens</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_CONTRACT_CASE__ENS = 1;

  /**
   * The number of structural features of the '<em>Slang Def Contract Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_CONTRACT_CASE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangSuprsImpl <em>Slang Suprs</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangSuprsImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangSuprs()
   * @generated
   */
  int SLANG_SUPRS = 31;

  /**
   * The feature id for the '<em><b>Super Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_SUPRS__SUPER_TYPES = 0;

  /**
   * The number of structural features of the '<em>Slang Suprs</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_SUPRS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangSuprImpl <em>Slang Supr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangSuprImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangSupr()
   * @generated
   */
  int SLANG_SUPR = 32;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_SUPR__NAME = 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_SUPR__ARGS = 1;

  /**
   * The number of structural features of the '<em>Slang Supr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_SUPR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangExtImpl <em>Slang Ext</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangExtImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangExt()
   * @generated
   */
  int SLANG_EXT = 33;

  /**
   * The feature id for the '<em><b>Decl</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_EXT__DECL = 0;

  /**
   * The number of structural features of the '<em>Slang Ext</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_EXT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangInvariantImpl <em>Slang Invariant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangInvariantImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangInvariant()
   * @generated
   */
  int SLANG_INVARIANT = 34;

  /**
   * The feature id for the '<em><b>Exprs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_INVARIANT__EXPRS = 0;

  /**
   * The number of structural features of the '<em>Slang Invariant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_INVARIANT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangReadsImpl <em>Slang Reads</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangReadsImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangReads()
   * @generated
   */
  int SLANG_READS = 35;

  /**
   * The feature id for the '<em><b>Exprs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_READS__EXPRS = 0;

  /**
   * The number of structural features of the '<em>Slang Reads</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_READS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangRequiresImpl <em>Slang Requires</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangRequiresImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangRequires()
   * @generated
   */
  int SLANG_REQUIRES = 36;

  /**
   * The feature id for the '<em><b>Exprs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_REQUIRES__EXPRS = 0;

  /**
   * The number of structural features of the '<em>Slang Requires</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_REQUIRES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangModifiesImpl <em>Slang Modifies</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangModifiesImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangModifies()
   * @generated
   */
  int SLANG_MODIFIES = 37;

  /**
   * The feature id for the '<em><b>Exprs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_MODIFIES__EXPRS = 0;

  /**
   * The number of structural features of the '<em>Slang Modifies</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_MODIFIES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangEnsuresImpl <em>Slang Ensures</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangEnsuresImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangEnsures()
   * @generated
   */
  int SLANG_ENSURES = 38;

  /**
   * The feature id for the '<em><b>Exprs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_ENSURES__EXPRS = 0;

  /**
   * The number of structural features of the '<em>Slang Ensures</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_ENSURES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangStmtImpl <em>Slang Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangStmtImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangStmt()
   * @generated
   */
  int SLANG_STMT = 39;

  /**
   * The number of structural features of the '<em>Slang Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_STMT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangElseImpl <em>Slang Else</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangElseImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangElse()
   * @generated
   */
  int SLANG_ELSE = 40;

  /**
   * The feature id for the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_ELSE__COND = 0;

  /**
   * The feature id for the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_ELSE__B = 1;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_ELSE__E = 2;

  /**
   * The number of structural features of the '<em>Slang Else</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_ELSE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangLoopContractImpl <em>Slang Loop Contract</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangLoopContractImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangLoopContract()
   * @generated
   */
  int SLANG_LOOP_CONTRACT = 41;

  /**
   * The feature id for the '<em><b>Inv</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_LOOP_CONTRACT__INV = 0;

  /**
   * The feature id for the '<em><b>Mod</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_LOOP_CONTRACT__MOD = 1;

  /**
   * The number of structural features of the '<em>Slang Loop Contract</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_LOOP_CONTRACT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangLHSSuffixImpl <em>Slang LHS Suffix</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangLHSSuffixImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangLHSSuffix()
   * @generated
   */
  int SLANG_LHS_SUFFIX = 42;

  /**
   * The number of structural features of the '<em>Slang LHS Suffix</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_LHS_SUFFIX_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangCaseImpl <em>Slang Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangCaseImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangCase()
   * @generated
   */
  int SLANG_CASE = 43;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_CASE__PATTERN = 0;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_CASE__E = 1;

  /**
   * The feature id for the '<em><b>S</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_CASE__S = 2;

  /**
   * The number of structural features of the '<em>Slang Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_CASE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangVarDefImpl <em>Slang Var Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangVarDefImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangVarDef()
   * @generated
   */
  int SLANG_VAR_DEF = 46;

  /**
   * The feature id for the '<em><b>D</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_VAR_DEF__D = SLANG_STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_VAR_DEF__NAME = SLANG_STMT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Type Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_VAR_DEF__TYPE_NAME = SLANG_STMT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_VAR_DEF__INIT = SLANG_STMT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Slang Var Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_VAR_DEF_FEATURE_COUNT = SLANG_STMT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangPatternImpl <em>Slang Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangPatternImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangPattern()
   * @generated
   */
  int SLANG_PATTERN = 44;

  /**
   * The feature id for the '<em><b>D</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_PATTERN__D = SLANG_VAR_DEF__D;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_PATTERN__NAME = SLANG_VAR_DEF__NAME;

  /**
   * The feature id for the '<em><b>Type Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_PATTERN__TYPE_NAME = SLANG_VAR_DEF__TYPE_NAME;

  /**
   * The feature id for the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_PATTERN__INIT = SLANG_VAR_DEF__INIT;

  /**
   * The feature id for the '<em><b>Patterns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_PATTERN__PATTERNS = SLANG_VAR_DEF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Slang Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_PATTERN_FEATURE_COUNT = SLANG_VAR_DEF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangTPatternImpl <em>Slang TPattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangTPatternImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangTPattern()
   * @generated
   */
  int SLANG_TPATTERN = 45;

  /**
   * The feature id for the '<em><b>Patterns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_TPATTERN__PATTERNS = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_TPATTERN__TYPE = 1;

  /**
   * The number of structural features of the '<em>Slang TPattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_TPATTERN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.ExprImpl <em>Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.ExprImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getExpr()
   * @generated
   */
  int EXPR = 47;

  /**
   * The number of structural features of the '<em>Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangQuantVarImpl <em>Slang Quant Var</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangQuantVarImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangQuantVar()
   * @generated
   */
  int SLANG_QUANT_VAR = 48;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_QUANT_VAR__E = 0;

  /**
   * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_QUANT_VAR__UPPER_BOUND = 1;

  /**
   * The number of structural features of the '<em>Slang Quant Var</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_QUANT_VAR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangBlockImpl <em>Slang Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangBlockImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangBlock()
   * @generated
   */
  int SLANG_BLOCK = 49;

  /**
   * The feature id for the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_BLOCK__COND = SLANG_ELSE__COND;

  /**
   * The feature id for the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_BLOCK__B = SLANG_ELSE__B;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_BLOCK__E = SLANG_ELSE__E;

  /**
   * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_BLOCK__STMTS = SLANG_ELSE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>R</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_BLOCK__R = SLANG_ELSE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Slang Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_BLOCK_FEATURE_COUNT = SLANG_ELSE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangParamsImpl <em>Slang Params</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangParamsImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangParams()
   * @generated
   */
  int SLANG_PARAMS = 50;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_PARAMS__PARAMS = 0;

  /**
   * The number of structural features of the '<em>Slang Params</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_PARAMS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangParamImpl <em>Slang Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangParamImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangParam()
   * @generated
   */
  int SLANG_PARAM = 51;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_PARAM__NAME = 0;

  /**
   * The feature id for the '<em><b>Type Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_PARAM__TYPE_NAME = 1;

  /**
   * The number of structural features of the '<em>Slang Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_PARAM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangForRangeImpl <em>Slang For Range</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangForRangeImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangForRange()
   * @generated
   */
  int SLANG_FOR_RANGE = 52;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_FOR_RANGE__E = 0;

  /**
   * The feature id for the '<em><b>Upper</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_FOR_RANGE__UPPER = 1;

  /**
   * The feature id for the '<em><b>Step</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_FOR_RANGE__STEP = 2;

  /**
   * The number of structural features of the '<em>Slang For Range</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_FOR_RANGE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangRetImpl <em>Slang Ret</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangRetImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangRet()
   * @generated
   */
  int SLANG_RET = 53;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_RET__E = 0;

  /**
   * The number of structural features of the '<em>Slang Ret</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_RET_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangCallSuffixImpl <em>Slang Call Suffix</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangCallSuffixImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangCallSuffix()
   * @generated
   */
  int SLANG_CALL_SUFFIX = 54;

  /**
   * The feature id for the '<em><b>Ta</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_CALL_SUFFIX__TA = 0;

  /**
   * The feature id for the '<em><b>Ca</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_CALL_SUFFIX__CA = 1;

  /**
   * The number of structural features of the '<em>Slang Call Suffix</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_CALL_SUFFIX_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangCallArgsImpl <em>Slang Call Args</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangCallArgsImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangCallArgs()
   * @generated
   */
  int SLANG_CALL_ARGS = 55;

  /**
   * The feature id for the '<em><b>Arg</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_CALL_ARGS__ARG = 0;

  /**
   * The number of structural features of the '<em>Slang Call Args</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_CALL_ARGS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangIDExpImpl <em>Slang ID Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangIDExpImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangIDExp()
   * @generated
   */
  int SLANG_ID_EXP = 56;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_ID_EXP__E = 0;

  /**
   * The number of structural features of the '<em>Slang ID Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_ID_EXP_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangTypeImpl <em>Slang Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangTypeImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangType()
   * @generated
   */
  int SLANG_TYPE = 57;

  /**
   * The feature id for the '<em><b>Type Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_TYPE__TYPE_NAME = 0;

  /**
   * The number of structural features of the '<em>Slang Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangTypeArgsImpl <em>Slang Type Args</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangTypeArgsImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangTypeArgs()
   * @generated
   */
  int SLANG_TYPE_ARGS = 58;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_TYPE_ARGS__TYPES = 0;

  /**
   * The number of structural features of the '<em>Slang Type Args</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_TYPE_ARGS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangLitImpl <em>Slang Lit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangLitImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangLit()
   * @generated
   */
  int SLANG_LIT = 59;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_LIT__VALUE = 0;

  /**
   * The number of structural features of the '<em>Slang Lit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_LIT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangInterpImpl <em>Slang Interp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangInterpImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangInterp()
   * @generated
   */
  int SLANG_INTERP = 60;

  /**
   * The number of structural features of the '<em>Slang Interp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_INTERP_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangMInterpImpl <em>Slang MInterp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangMInterpImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangMInterp()
   * @generated
   */
  int SLANG_MINTERP = 61;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_MINTERP__E = 0;

  /**
   * The feature id for the '<em><b>M</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_MINTERP__M = 1;

  /**
   * The number of structural features of the '<em>Slang MInterp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_MINTERP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangIfStmtImpl <em>Slang If Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangIfStmtImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangIfStmt()
   * @generated
   */
  int SLANG_IF_STMT = 62;

  /**
   * The feature id for the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_IF_STMT__COND = SLANG_STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_IF_STMT__B = SLANG_STMT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_IF_STMT__E = SLANG_STMT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Slang If Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_IF_STMT_FEATURE_COUNT = SLANG_STMT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangWhileStmtImpl <em>Slang While Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangWhileStmtImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangWhileStmt()
   * @generated
   */
  int SLANG_WHILE_STMT = 63;

  /**
   * The feature id for the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_WHILE_STMT__COND = SLANG_STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_WHILE_STMT__L = SLANG_STMT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_WHILE_STMT__B = SLANG_STMT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Slang While Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_WHILE_STMT_FEATURE_COUNT = SLANG_STMT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangMatchStmtImpl <em>Slang Match Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangMatchStmtImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangMatchStmt()
   * @generated
   */
  int SLANG_MATCH_STMT = 64;

  /**
   * The feature id for the '<em><b>Test Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_MATCH_STMT__TEST_EXPR = SLANG_STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>C</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_MATCH_STMT__C = SLANG_STMT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Slang Match Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_MATCH_STMT_FEATURE_COUNT = SLANG_STMT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangSpecStmtImpl <em>Slang Spec Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangSpecStmtImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangSpecStmt()
   * @generated
   */
  int SLANG_SPEC_STMT = 65;

  /**
   * The feature id for the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_SPEC_STMT__B = SLANG_STMT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Slang Spec Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_SPEC_STMT_FEATURE_COUNT = SLANG_STMT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangAssumeStmtImpl <em>Slang Assume Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangAssumeStmtImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangAssumeStmt()
   * @generated
   */
  int SLANG_ASSUME_STMT = 66;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_ASSUME_STMT__E = SLANG_STMT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Slang Assume Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_ASSUME_STMT_FEATURE_COUNT = SLANG_STMT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangAssertStmtImpl <em>Slang Assert Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangAssertStmtImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangAssertStmt()
   * @generated
   */
  int SLANG_ASSERT_STMT = 67;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_ASSERT_STMT__E = SLANG_STMT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Slang Assert Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_ASSERT_STMT_FEATURE_COUNT = SLANG_STMT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangHaltStmtImpl <em>Slang Halt Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangHaltStmtImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangHaltStmt()
   * @generated
   */
  int SLANG_HALT_STMT = 68;

  /**
   * The number of structural features of the '<em>Slang Halt Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_HALT_STMT_FEATURE_COUNT = SLANG_STMT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangDoStmtImpl <em>Slang Do Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangDoStmtImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangDoStmt()
   * @generated
   */
  int SLANG_DO_STMT = 69;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DO_STMT__E = SLANG_STMT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Slang Do Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DO_STMT_FEATURE_COUNT = SLANG_STMT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangIdStmtImpl <em>Slang Id Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangIdStmtImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangIdStmt()
   * @generated
   */
  int SLANG_ID_STMT = 70;

  /**
   * The feature id for the '<em><b>Port Or Subcomponent Or State Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_ID_STMT__PORT_OR_SUBCOMPONENT_OR_STATE_VAR = SLANG_STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_ID_STMT__E = SLANG_STMT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Slang Id Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_ID_STMT_FEATURE_COUNT = SLANG_STMT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangFieldLookupImpl <em>Slang Field Lookup</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangFieldLookupImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangFieldLookup()
   * @generated
   */
  int SLANG_FIELD_LOOKUP = 71;

  /**
   * The number of structural features of the '<em>Slang Field Lookup</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_FIELD_LOOKUP_FEATURE_COUNT = SLANG_LHS_SUFFIX_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangMethodCallImpl <em>Slang Method Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangMethodCallImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangMethodCall()
   * @generated
   */
  int SLANG_METHOD_CALL = 72;

  /**
   * The feature id for the '<em><b>Exprs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_METHOD_CALL__EXPRS = SLANG_LHS_SUFFIX_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Slang Method Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_METHOD_CALL_FEATURE_COUNT = SLANG_LHS_SUFFIX_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.BasicExpImpl <em>Basic Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.BasicExpImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getBasicExp()
   * @generated
   */
  int BASIC_EXP = 73;

  /**
   * The feature id for the '<em><b>Terms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_EXP__TERMS = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ops</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_EXP__OPS = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Then Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_EXP__THEN_EXPR = EXPR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Else Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_EXP__ELSE_EXPR = EXPR_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Basic Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_EXP_FEATURE_COUNT = EXPR_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.QuantifiedExpImpl <em>Quantified Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.QuantifiedExpImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getQuantifiedExp()
   * @generated
   */
  int QUANTIFIED_EXP = 74;

  /**
   * The feature id for the '<em><b>QVar</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_EXP__QVAR = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Quantified Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_EXP__QUANTIFIED_EXPR = EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Quantified Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_EXP_FEATURE_COUNT = EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.UnaryExpImpl <em>Unary Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.UnaryExpImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getUnaryExp()
   * @generated
   */
  int UNARY_EXP = 75;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXP__OP = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Access Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXP__ACCESS_EXP = EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Unary Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXP_FEATURE_COUNT = EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangAccessImpl <em>Slang Access</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangAccessImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangAccess()
   * @generated
   */
  int SLANG_ACCESS = 76;

  /**
   * The feature id for the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_ACCESS__T = EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Slang Access</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_ACCESS_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangLitTermImpl <em>Slang Lit Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangLitTermImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangLitTerm()
   * @generated
   */
  int SLANG_LIT_TERM = 77;

  /**
   * The feature id for the '<em><b>Lit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_LIT_TERM__LIT = EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Slang Lit Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_LIT_TERM_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangInterpTermImpl <em>Slang Interp Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangInterpTermImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangInterpTerm()
   * @generated
   */
  int SLANG_INTERP_TERM = 78;

  /**
   * The feature id for the '<em><b>I</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_INTERP_TERM__I = EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Slang Interp Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_INTERP_TERM_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.EnumLitExprImpl <em>Enum Lit Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.EnumLitExprImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getEnumLitExpr()
   * @generated
   */
  int ENUM_LIT_EXPR = 79;

  /**
   * The feature id for the '<em><b>Enum Type</b></em>' containment reference.
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
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.RecordLitExprImpl <em>Record Lit Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.RecordLitExprImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getRecordLitExpr()
   * @generated
   */
  int RECORD_LIT_EXPR = 80;

  /**
   * The feature id for the '<em><b>Record Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_LIT_EXPR__RECORD_TYPE = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_LIT_EXPR__ARGS = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Arg Expr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_LIT_EXPR__ARG_EXPR = EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Record Lit Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_LIT_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.DataRefExprImpl <em>Data Ref Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.DataRefExprImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getDataRefExpr()
   * @generated
   */
  int DATA_REF_EXPR = 81;

  /**
   * The feature id for the '<em><b>Port Or Subcomponent Or State Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_REF_EXPR__PORT_OR_SUBCOMPONENT_OR_STATE_VAR = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_REF_EXPR__REF = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Cs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_REF_EXPR__CS = EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Data Ref Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_REF_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangTupleTermImpl <em>Slang Tuple Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangTupleTermImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangTupleTerm()
   * @generated
   */
  int SLANG_TUPLE_TERM = 82;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_TUPLE_TERM__E = EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Slang Tuple Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_TUPLE_TERM_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangForTermImpl <em>Slang For Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangForTermImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangForTerm()
   * @generated
   */
  int SLANG_FOR_TERM = 83;

  /**
   * The feature id for the '<em><b>R</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_FOR_TERM__R = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_FOR_TERM__B = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_FOR_TERM__E = EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Slang For Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_FOR_TERM_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangBlockTermImpl <em>Slang Block Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangBlockTermImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangBlockTerm()
   * @generated
   */
  int SLANG_BLOCK_TERM = 84;

  /**
   * The feature id for the '<em><b>P</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_BLOCK_TERM__P = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_BLOCK_TERM__E = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_BLOCK_TERM__STMT = EXPR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>R</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_BLOCK_TERM__R = EXPR_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Slang Block Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_BLOCK_TERM_FEATURE_COUNT = EXPR_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.BooleanLitImpl <em>Boolean Lit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.BooleanLitImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getBooleanLit()
   * @generated
   */
  int BOOLEAN_LIT = 85;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LIT__VALUE = SLANG_LIT__VALUE;

  /**
   * The number of structural features of the '<em>Boolean Lit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LIT_FEATURE_COUNT = SLANG_LIT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.IntegerLitImpl <em>Integer Lit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.IntegerLitImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getIntegerLit()
   * @generated
   */
  int INTEGER_LIT = 86;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LIT__VALUE = SLANG_LIT__VALUE;

  /**
   * The number of structural features of the '<em>Integer Lit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LIT_FEATURE_COUNT = SLANG_LIT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.IntIdfLitImpl <em>Int Idf Lit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.IntIdfLitImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getIntIdfLit()
   * @generated
   */
  int INT_IDF_LIT = 87;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_IDF_LIT__VALUE = SLANG_LIT__VALUE;

  /**
   * The number of structural features of the '<em>Int Idf Lit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_IDF_LIT_FEATURE_COUNT = SLANG_LIT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.HexLitImpl <em>Hex Lit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.HexLitImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getHexLit()
   * @generated
   */
  int HEX_LIT = 88;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEX_LIT__VALUE = SLANG_LIT__VALUE;

  /**
   * The number of structural features of the '<em>Hex Lit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEX_LIT_FEATURE_COUNT = SLANG_LIT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.BinLitImpl <em>Bin Lit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.BinLitImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getBinLit()
   * @generated
   */
  int BIN_LIT = 89;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIN_LIT__VALUE = SLANG_LIT__VALUE;

  /**
   * The number of structural features of the '<em>Bin Lit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIN_LIT_FEATURE_COUNT = SLANG_LIT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.RealLitImpl <em>Real Lit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.RealLitImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getRealLit()
   * @generated
   */
  int REAL_LIT = 90;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_LIT__VALUE = SLANG_LIT__VALUE;

  /**
   * The number of structural features of the '<em>Real Lit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_LIT_FEATURE_COUNT = SLANG_LIT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangStringLitImpl <em>Slang String Lit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangStringLitImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangStringLit()
   * @generated
   */
  int SLANG_STRING_LIT = 91;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_STRING_LIT__VALUE = SLANG_LIT__VALUE;

  /**
   * The number of structural features of the '<em>Slang String Lit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_STRING_LIT_FEATURE_COUNT = SLANG_LIT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.RealIdfLitImpl <em>Real Idf Lit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.RealIdfLitImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getRealIdfLit()
   * @generated
   */
  int REAL_IDF_LIT = 92;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_IDF_LIT__VALUE = SLANG_LIT__VALUE;

  /**
   * The number of structural features of the '<em>Real Idf Lit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_IDF_LIT_FEATURE_COUNT = SLANG_LIT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.MStringLitImpl <em>MString Lit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.MStringLitImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getMStringLit()
   * @generated
   */
  int MSTRING_LIT = 93;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSTRING_LIT__VALUE = SLANG_LIT__VALUE;

  /**
   * The number of structural features of the '<em>MString Lit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSTRING_LIT_FEATURE_COUNT = SLANG_LIT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangMspInterpImpl <em>Slang Msp Interp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangMspInterpImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangMspInterp()
   * @generated
   */
  int SLANG_MSP_INTERP = 94;

  /**
   * The feature id for the '<em><b>Msp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_MSP_INTERP__MSP = SLANG_INTERP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Slang Msp Interp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_MSP_INTERP_FEATURE_COUNT = SLANG_INTERP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangLiteralInterpImpl <em>Slang Literal Interp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangLiteralInterpImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangLiteralInterp()
   * @generated
   */
  int SLANG_LITERAL_INTERP = 95;

  /**
   * The feature id for the '<em><b>Sli</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_LITERAL_INTERP__SLI = SLANG_INTERP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Slang Literal Interp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_LITERAL_INTERP_FEATURE_COUNT = SLANG_INTERP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangMspbInterpImpl <em>Slang Mspb Interp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangMspbInterpImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangMspbInterp()
   * @generated
   */
  int SLANG_MSPB_INTERP = 96;

  /**
   * The feature id for the '<em><b>Mspb</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_MSPB_INTERP__MSPB = SLANG_INTERP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Minterp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_MSPB_INTERP__MINTERP = SLANG_INTERP_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Slang Mspb Interp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_MSPB_INTERP_FEATURE_COUNT = SLANG_INTERP_FEATURE_COUNT + 2;


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
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SpecSection#getFunctions <em>Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Functions</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SpecSection#getFunctions()
   * @see #getSpecSection()
   * @generated
   */
  EReference getSpecSection_Functions();

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
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.Initialize#getModifies <em>Modifies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Modifies</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.Initialize#getModifies()
   * @see #getInitialize()
   * @generated
   */
  EReference getInitialize_Modifies();

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
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.InitializeSpecStatement#getGuaranteeStatement <em>Guarantee Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Guarantee Statement</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.InitializeSpecStatement#getGuaranteeStatement()
   * @see #getInitializeSpecStatement()
   * @generated
   */
  EReference getInitializeSpecStatement_GuaranteeStatement();

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
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.Compute#getModifies <em>Modifies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Modifies</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.Compute#getModifies()
   * @see #getCompute()
   * @generated
   */
  EReference getCompute_Modifies();

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
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.OtherDataRef <em>Other Data Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Other Data Ref</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.OtherDataRef
   * @generated
   */
  EClass getOtherDataRef();

  /**
   * Returns the meta object for the reference '{@link org.sireum.aadl.gumbo.gumbo.OtherDataRef#getNamedElement <em>Named Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Named Element</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.OtherDataRef#getNamedElement()
   * @see #getOtherDataRef()
   * @generated
   */
  EReference getOtherDataRef_NamedElement();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.OtherDataRef#getArrayRange <em>Array Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Array Range</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.OtherDataRef#getArrayRange()
   * @see #getOtherDataRef()
   * @generated
   */
  EReference getOtherDataRef_ArrayRange();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.OtherDataRef#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Path</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.OtherDataRef#getPath()
   * @see #getOtherDataRef()
   * @generated
   */
  EReference getOtherDataRef_Path();

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
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.DataElement <em>Data Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Element</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.DataElement
   * @generated
   */
  EClass getDataElement();

  /**
   * Returns the meta object for the reference '{@link org.sireum.aadl.gumbo.gumbo.DataElement#getDataElement <em>Data Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Data Element</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.DataElement#getDataElement()
   * @see #getDataElement()
   * @generated
   */
  EReference getDataElement_DataElement();

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
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.Functions <em>Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Functions</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.Functions
   * @generated
   */
  EClass getFunctions();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.Functions#getSpecs <em>Specs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Specs</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.Functions#getSpecs()
   * @see #getFunctions()
   * @generated
   */
  EReference getFunctions_Specs();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.FuncSpec <em>Func Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Func Spec</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.FuncSpec
   * @generated
   */
  EClass getFuncSpec();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangDefDeclDef <em>Slang Def Decl Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Def Decl Def</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefDeclDef
   * @generated
   */
  EClass getSlangDefDeclDef();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangDefDeclDef#getSde <em>Sde</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sde</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefDeclDef#getSde()
   * @see #getSlangDefDeclDef()
   * @generated
   */
  EReference getSlangDefDeclDef_Sde();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.SlangDefDeclDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefDeclDef#getName()
   * @see #getSlangDefDeclDef()
   * @generated
   */
  EAttribute getSlangDefDeclDef_Name();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.SlangDefDeclDef#getTypeParams <em>Type Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type Params</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefDeclDef#getTypeParams()
   * @see #getSlangDefDeclDef()
   * @generated
   */
  EAttribute getSlangDefDeclDef_TypeParams();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangDefDeclDef#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Params</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefDeclDef#getParams()
   * @see #getSlangDefDeclDef()
   * @generated
   */
  EReference getSlangDefDeclDef_Params();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangDefDeclDef#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefDeclDef#getType()
   * @see #getSlangDefDeclDef()
   * @generated
   */
  EReference getSlangDefDeclDef_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangDefDeclDef#getC <em>C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>C</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefDeclDef#getC()
   * @see #getSlangDefDeclDef()
   * @generated
   */
  EReference getSlangDefDeclDef_C();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangDefDeclDef#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefDeclDef#getE()
   * @see #getSlangDefDeclDef()
   * @generated
   */
  EReference getSlangDefDeclDef_E();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangDefDecl <em>Slang Def Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Def Decl</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefDecl
   * @generated
   */
  EClass getSlangDefDecl();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangDefDecl#getSde <em>Sde</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sde</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefDecl#getSde()
   * @see #getSlangDefDecl()
   * @generated
   */
  EReference getSlangDefDecl_Sde();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.SlangDefDecl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefDecl#getName()
   * @see #getSlangDefDecl()
   * @generated
   */
  EAttribute getSlangDefDecl_Name();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.SlangDefDecl#getTypeParams <em>Type Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type Params</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefDecl#getTypeParams()
   * @see #getSlangDefDecl()
   * @generated
   */
  EAttribute getSlangDefDecl_TypeParams();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangDefDecl#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Params</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefDecl#getParams()
   * @see #getSlangDefDecl()
   * @generated
   */
  EReference getSlangDefDecl_Params();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangDefDecl#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefDecl#getType()
   * @see #getSlangDefDecl()
   * @generated
   */
  EReference getSlangDefDecl_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangDefDecl#getC <em>C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>C</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefDecl#getC()
   * @see #getSlangDefDecl()
   * @generated
   */
  EReference getSlangDefDecl_C();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangDefDef <em>Slang Def Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Def Def</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefDef
   * @generated
   */
  EClass getSlangDefDef();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangDefDef#getSde <em>Sde</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sde</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefDef#getSde()
   * @see #getSlangDefDef()
   * @generated
   */
  EReference getSlangDefDef_Sde();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.SlangDefDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefDef#getName()
   * @see #getSlangDefDef()
   * @generated
   */
  EAttribute getSlangDefDef_Name();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.SlangDefDef#getTypeParams <em>Type Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type Params</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefDef#getTypeParams()
   * @see #getSlangDefDef()
   * @generated
   */
  EAttribute getSlangDefDef_TypeParams();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangDefDef#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Params</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefDef#getParams()
   * @see #getSlangDefDef()
   * @generated
   */
  EReference getSlangDefDef_Params();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangDefDef#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefDef#getType()
   * @see #getSlangDefDef()
   * @generated
   */
  EReference getSlangDefDef_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangDefDef#getC <em>C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>C</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefDef#getC()
   * @see #getSlangDefDef()
   * @generated
   */
  EReference getSlangDefDef_C();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangDefDef#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefDef#getE()
   * @see #getSlangDefDef()
   * @generated
   */
  EReference getSlangDefDef_E();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangDefExt <em>Slang Def Ext</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Def Ext</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefExt
   * @generated
   */
  EClass getSlangDefExt();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.SlangDefExt#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefExt#getName()
   * @see #getSlangDefExt()
   * @generated
   */
  EAttribute getSlangDefExt_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangDefExt#getTypeName <em>Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Name</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefExt#getTypeName()
   * @see #getSlangDefExt()
   * @generated
   */
  EReference getSlangDefExt_TypeName();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangDefParams <em>Slang Def Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Def Params</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefParams
   * @generated
   */
  EClass getSlangDefParams();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.SlangDefParams#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefParams#getParams()
   * @see #getSlangDefParams()
   * @generated
   */
  EReference getSlangDefParams_Params();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangDefParam <em>Slang Def Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Def Param</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefParam
   * @generated
   */
  EClass getSlangDefParam();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.SlangDefParam#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefParam#getName()
   * @see #getSlangDefParam()
   * @generated
   */
  EAttribute getSlangDefParam_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangDefParam#getTypeName <em>Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Name</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefParam#getTypeName()
   * @see #getSlangDefParam()
   * @generated
   */
  EReference getSlangDefParam_TypeName();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangDefContract <em>Slang Def Contract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Def Contract</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefContract
   * @generated
   */
  EClass getSlangDefContract();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangDefContract#getRea <em>Rea</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rea</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefContract#getRea()
   * @see #getSlangDefContract()
   * @generated
   */
  EReference getSlangDefContract_Rea();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangDefContract#getReq <em>Req</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Req</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefContract#getReq()
   * @see #getSlangDefContract()
   * @generated
   */
  EReference getSlangDefContract_Req();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangDefContract#getMod <em>Mod</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mod</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefContract#getMod()
   * @see #getSlangDefContract()
   * @generated
   */
  EReference getSlangDefContract_Mod();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangDefContract#getEns <em>Ens</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ens</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefContract#getEns()
   * @see #getSlangDefContract()
   * @generated
   */
  EReference getSlangDefContract_Ens();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.SlangDefContract#getContracts <em>Contracts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contracts</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefContract#getContracts()
   * @see #getSlangDefContract()
   * @generated
   */
  EReference getSlangDefContract_Contracts();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangDefContractCase <em>Slang Def Contract Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Def Contract Case</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefContractCase
   * @generated
   */
  EClass getSlangDefContractCase();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangDefContractCase#getReq <em>Req</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Req</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefContractCase#getReq()
   * @see #getSlangDefContractCase()
   * @generated
   */
  EReference getSlangDefContractCase_Req();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangDefContractCase#getEns <em>Ens</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ens</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefContractCase#getEns()
   * @see #getSlangDefContractCase()
   * @generated
   */
  EReference getSlangDefContractCase_Ens();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangSuprs <em>Slang Suprs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Suprs</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangSuprs
   * @generated
   */
  EClass getSlangSuprs();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.SlangSuprs#getSuperTypes <em>Super Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Super Types</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangSuprs#getSuperTypes()
   * @see #getSlangSuprs()
   * @generated
   */
  EReference getSlangSuprs_SuperTypes();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangSupr <em>Slang Supr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Supr</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangSupr
   * @generated
   */
  EClass getSlangSupr();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.SlangSupr#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangSupr#getName()
   * @see #getSlangSupr()
   * @generated
   */
  EAttribute getSlangSupr_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangSupr#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Args</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangSupr#getArgs()
   * @see #getSlangSupr()
   * @generated
   */
  EReference getSlangSupr_Args();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangExt <em>Slang Ext</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Ext</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangExt
   * @generated
   */
  EClass getSlangExt();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.SlangExt#getDecl <em>Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Decl</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangExt#getDecl()
   * @see #getSlangExt()
   * @generated
   */
  EReference getSlangExt_Decl();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangInvariant <em>Slang Invariant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Invariant</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangInvariant
   * @generated
   */
  EClass getSlangInvariant();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.SlangInvariant#getExprs <em>Exprs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exprs</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangInvariant#getExprs()
   * @see #getSlangInvariant()
   * @generated
   */
  EReference getSlangInvariant_Exprs();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangReads <em>Slang Reads</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Reads</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangReads
   * @generated
   */
  EClass getSlangReads();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.SlangReads#getExprs <em>Exprs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exprs</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangReads#getExprs()
   * @see #getSlangReads()
   * @generated
   */
  EReference getSlangReads_Exprs();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangRequires <em>Slang Requires</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Requires</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangRequires
   * @generated
   */
  EClass getSlangRequires();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.SlangRequires#getExprs <em>Exprs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exprs</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangRequires#getExprs()
   * @see #getSlangRequires()
   * @generated
   */
  EReference getSlangRequires_Exprs();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangModifies <em>Slang Modifies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Modifies</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangModifies
   * @generated
   */
  EClass getSlangModifies();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.SlangModifies#getExprs <em>Exprs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exprs</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangModifies#getExprs()
   * @see #getSlangModifies()
   * @generated
   */
  EReference getSlangModifies_Exprs();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangEnsures <em>Slang Ensures</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Ensures</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangEnsures
   * @generated
   */
  EClass getSlangEnsures();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.SlangEnsures#getExprs <em>Exprs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exprs</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangEnsures#getExprs()
   * @see #getSlangEnsures()
   * @generated
   */
  EReference getSlangEnsures_Exprs();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangStmt <em>Slang Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Stmt</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangStmt
   * @generated
   */
  EClass getSlangStmt();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangElse <em>Slang Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Else</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangElse
   * @generated
   */
  EClass getSlangElse();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangElse#getCond <em>Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cond</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangElse#getCond()
   * @see #getSlangElse()
   * @generated
   */
  EReference getSlangElse_Cond();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangElse#getB <em>B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>B</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangElse#getB()
   * @see #getSlangElse()
   * @generated
   */
  EReference getSlangElse_B();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangElse#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangElse#getE()
   * @see #getSlangElse()
   * @generated
   */
  EReference getSlangElse_E();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangLoopContract <em>Slang Loop Contract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Loop Contract</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangLoopContract
   * @generated
   */
  EClass getSlangLoopContract();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangLoopContract#getInv <em>Inv</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inv</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangLoopContract#getInv()
   * @see #getSlangLoopContract()
   * @generated
   */
  EReference getSlangLoopContract_Inv();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangLoopContract#getMod <em>Mod</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mod</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangLoopContract#getMod()
   * @see #getSlangLoopContract()
   * @generated
   */
  EReference getSlangLoopContract_Mod();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangLHSSuffix <em>Slang LHS Suffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang LHS Suffix</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangLHSSuffix
   * @generated
   */
  EClass getSlangLHSSuffix();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangCase <em>Slang Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Case</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangCase
   * @generated
   */
  EClass getSlangCase();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangCase#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pattern</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangCase#getPattern()
   * @see #getSlangCase()
   * @generated
   */
  EReference getSlangCase_Pattern();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangCase#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangCase#getE()
   * @see #getSlangCase()
   * @generated
   */
  EReference getSlangCase_E();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.SlangCase#getS <em>S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>S</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangCase#getS()
   * @see #getSlangCase()
   * @generated
   */
  EReference getSlangCase_S();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangPattern <em>Slang Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Pattern</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangPattern
   * @generated
   */
  EClass getSlangPattern();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.SlangPattern#getPatterns <em>Patterns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Patterns</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangPattern#getPatterns()
   * @see #getSlangPattern()
   * @generated
   */
  EReference getSlangPattern_Patterns();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangTPattern <em>Slang TPattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang TPattern</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangTPattern
   * @generated
   */
  EClass getSlangTPattern();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.SlangTPattern#getPatterns <em>Patterns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Patterns</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangTPattern#getPatterns()
   * @see #getSlangTPattern()
   * @generated
   */
  EReference getSlangTPattern_Patterns();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangTPattern#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangTPattern#getType()
   * @see #getSlangTPattern()
   * @generated
   */
  EReference getSlangTPattern_Type();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangVarDef <em>Slang Var Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Var Def</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangVarDef
   * @generated
   */
  EClass getSlangVarDef();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangVarDef#getD <em>D</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>D</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangVarDef#getD()
   * @see #getSlangVarDef()
   * @generated
   */
  EReference getSlangVarDef_D();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.SlangVarDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangVarDef#getName()
   * @see #getSlangVarDef()
   * @generated
   */
  EAttribute getSlangVarDef_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangVarDef#getTypeName <em>Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Name</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangVarDef#getTypeName()
   * @see #getSlangVarDef()
   * @generated
   */
  EReference getSlangVarDef_TypeName();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangVarDef#getInit <em>Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Init</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangVarDef#getInit()
   * @see #getSlangVarDef()
   * @generated
   */
  EReference getSlangVarDef_Init();

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
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangQuantVar <em>Slang Quant Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Quant Var</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangQuantVar
   * @generated
   */
  EClass getSlangQuantVar();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangQuantVar#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangQuantVar#getE()
   * @see #getSlangQuantVar()
   * @generated
   */
  EReference getSlangQuantVar_E();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangQuantVar#getUpperBound <em>Upper Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Upper Bound</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangQuantVar#getUpperBound()
   * @see #getSlangQuantVar()
   * @generated
   */
  EReference getSlangQuantVar_UpperBound();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangBlock <em>Slang Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Block</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangBlock
   * @generated
   */
  EClass getSlangBlock();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.SlangBlock#getStmts <em>Stmts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stmts</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangBlock#getStmts()
   * @see #getSlangBlock()
   * @generated
   */
  EReference getSlangBlock_Stmts();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangBlock#getR <em>R</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>R</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangBlock#getR()
   * @see #getSlangBlock()
   * @generated
   */
  EReference getSlangBlock_R();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangParams <em>Slang Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Params</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangParams
   * @generated
   */
  EClass getSlangParams();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.SlangParams#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangParams#getParams()
   * @see #getSlangParams()
   * @generated
   */
  EReference getSlangParams_Params();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangParam <em>Slang Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Param</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangParam
   * @generated
   */
  EClass getSlangParam();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.SlangParam#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangParam#getName()
   * @see #getSlangParam()
   * @generated
   */
  EAttribute getSlangParam_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangParam#getTypeName <em>Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Name</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangParam#getTypeName()
   * @see #getSlangParam()
   * @generated
   */
  EReference getSlangParam_TypeName();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangForRange <em>Slang For Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang For Range</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangForRange
   * @generated
   */
  EClass getSlangForRange();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangForRange#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangForRange#getE()
   * @see #getSlangForRange()
   * @generated
   */
  EReference getSlangForRange_E();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangForRange#getUpper <em>Upper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Upper</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangForRange#getUpper()
   * @see #getSlangForRange()
   * @generated
   */
  EReference getSlangForRange_Upper();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangForRange#getStep <em>Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Step</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangForRange#getStep()
   * @see #getSlangForRange()
   * @generated
   */
  EReference getSlangForRange_Step();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangRet <em>Slang Ret</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Ret</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangRet
   * @generated
   */
  EClass getSlangRet();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangRet#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangRet#getE()
   * @see #getSlangRet()
   * @generated
   */
  EReference getSlangRet_E();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangCallSuffix <em>Slang Call Suffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Call Suffix</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangCallSuffix
   * @generated
   */
  EClass getSlangCallSuffix();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangCallSuffix#getTa <em>Ta</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ta</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangCallSuffix#getTa()
   * @see #getSlangCallSuffix()
   * @generated
   */
  EReference getSlangCallSuffix_Ta();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangCallSuffix#getCa <em>Ca</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ca</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangCallSuffix#getCa()
   * @see #getSlangCallSuffix()
   * @generated
   */
  EReference getSlangCallSuffix_Ca();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangCallArgs <em>Slang Call Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Call Args</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangCallArgs
   * @generated
   */
  EClass getSlangCallArgs();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.SlangCallArgs#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arg</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangCallArgs#getArg()
   * @see #getSlangCallArgs()
   * @generated
   */
  EReference getSlangCallArgs_Arg();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangIDExp <em>Slang ID Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang ID Exp</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangIDExp
   * @generated
   */
  EClass getSlangIDExp();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.SlangIDExp#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>E</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangIDExp#getE()
   * @see #getSlangIDExp()
   * @generated
   */
  EReference getSlangIDExp_E();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangType <em>Slang Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Type</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangType
   * @generated
   */
  EClass getSlangType();

  /**
   * Returns the meta object for the reference '{@link org.sireum.aadl.gumbo.gumbo.SlangType#getTypeName <em>Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type Name</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangType#getTypeName()
   * @see #getSlangType()
   * @generated
   */
  EReference getSlangType_TypeName();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangTypeArgs <em>Slang Type Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Type Args</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangTypeArgs
   * @generated
   */
  EClass getSlangTypeArgs();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.SlangTypeArgs#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangTypeArgs#getTypes()
   * @see #getSlangTypeArgs()
   * @generated
   */
  EReference getSlangTypeArgs_Types();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangLit <em>Slang Lit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Lit</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangLit
   * @generated
   */
  EClass getSlangLit();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.SlangLit#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangLit#getValue()
   * @see #getSlangLit()
   * @generated
   */
  EAttribute getSlangLit_Value();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangInterp <em>Slang Interp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Interp</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangInterp
   * @generated
   */
  EClass getSlangInterp();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangMInterp <em>Slang MInterp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang MInterp</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangMInterp
   * @generated
   */
  EClass getSlangMInterp();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangMInterp#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangMInterp#getE()
   * @see #getSlangMInterp()
   * @generated
   */
  EReference getSlangMInterp_E();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangMInterp#getM <em>M</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>M</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangMInterp#getM()
   * @see #getSlangMInterp()
   * @generated
   */
  EReference getSlangMInterp_M();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangIfStmt <em>Slang If Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang If Stmt</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangIfStmt
   * @generated
   */
  EClass getSlangIfStmt();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangIfStmt#getCond <em>Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cond</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangIfStmt#getCond()
   * @see #getSlangIfStmt()
   * @generated
   */
  EReference getSlangIfStmt_Cond();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangIfStmt#getB <em>B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>B</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangIfStmt#getB()
   * @see #getSlangIfStmt()
   * @generated
   */
  EReference getSlangIfStmt_B();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangIfStmt#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangIfStmt#getE()
   * @see #getSlangIfStmt()
   * @generated
   */
  EReference getSlangIfStmt_E();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangWhileStmt <em>Slang While Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang While Stmt</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangWhileStmt
   * @generated
   */
  EClass getSlangWhileStmt();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangWhileStmt#getCond <em>Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cond</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangWhileStmt#getCond()
   * @see #getSlangWhileStmt()
   * @generated
   */
  EReference getSlangWhileStmt_Cond();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangWhileStmt#getL <em>L</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>L</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangWhileStmt#getL()
   * @see #getSlangWhileStmt()
   * @generated
   */
  EReference getSlangWhileStmt_L();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangWhileStmt#getB <em>B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>B</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangWhileStmt#getB()
   * @see #getSlangWhileStmt()
   * @generated
   */
  EReference getSlangWhileStmt_B();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangMatchStmt <em>Slang Match Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Match Stmt</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangMatchStmt
   * @generated
   */
  EClass getSlangMatchStmt();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangMatchStmt#getTestExpr <em>Test Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Test Expr</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangMatchStmt#getTestExpr()
   * @see #getSlangMatchStmt()
   * @generated
   */
  EReference getSlangMatchStmt_TestExpr();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.SlangMatchStmt#getC <em>C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>C</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangMatchStmt#getC()
   * @see #getSlangMatchStmt()
   * @generated
   */
  EReference getSlangMatchStmt_C();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangSpecStmt <em>Slang Spec Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Spec Stmt</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangSpecStmt
   * @generated
   */
  EClass getSlangSpecStmt();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangSpecStmt#getB <em>B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>B</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangSpecStmt#getB()
   * @see #getSlangSpecStmt()
   * @generated
   */
  EReference getSlangSpecStmt_B();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangAssumeStmt <em>Slang Assume Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Assume Stmt</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangAssumeStmt
   * @generated
   */
  EClass getSlangAssumeStmt();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangAssumeStmt#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangAssumeStmt#getE()
   * @see #getSlangAssumeStmt()
   * @generated
   */
  EReference getSlangAssumeStmt_E();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangAssertStmt <em>Slang Assert Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Assert Stmt</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangAssertStmt
   * @generated
   */
  EClass getSlangAssertStmt();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangAssertStmt#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangAssertStmt#getE()
   * @see #getSlangAssertStmt()
   * @generated
   */
  EReference getSlangAssertStmt_E();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangHaltStmt <em>Slang Halt Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Halt Stmt</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangHaltStmt
   * @generated
   */
  EClass getSlangHaltStmt();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangDoStmt <em>Slang Do Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Do Stmt</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDoStmt
   * @generated
   */
  EClass getSlangDoStmt();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangDoStmt#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDoStmt#getE()
   * @see #getSlangDoStmt()
   * @generated
   */
  EReference getSlangDoStmt_E();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangIdStmt <em>Slang Id Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Id Stmt</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangIdStmt
   * @generated
   */
  EClass getSlangIdStmt();

  /**
   * Returns the meta object for the reference '{@link org.sireum.aadl.gumbo.gumbo.SlangIdStmt#getPortOrSubcomponentOrStateVar <em>Port Or Subcomponent Or State Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Port Or Subcomponent Or State Var</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangIdStmt#getPortOrSubcomponentOrStateVar()
   * @see #getSlangIdStmt()
   * @generated
   */
  EReference getSlangIdStmt_PortOrSubcomponentOrStateVar();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangIdStmt#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangIdStmt#getE()
   * @see #getSlangIdStmt()
   * @generated
   */
  EReference getSlangIdStmt_E();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangFieldLookup <em>Slang Field Lookup</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Field Lookup</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangFieldLookup
   * @generated
   */
  EClass getSlangFieldLookup();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangMethodCall <em>Slang Method Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Method Call</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangMethodCall
   * @generated
   */
  EClass getSlangMethodCall();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.SlangMethodCall#getExprs <em>Exprs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exprs</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangMethodCall#getExprs()
   * @see #getSlangMethodCall()
   * @generated
   */
  EReference getSlangMethodCall_Exprs();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.BasicExp <em>Basic Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Basic Exp</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.BasicExp
   * @generated
   */
  EClass getBasicExp();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.BasicExp#getTerms <em>Terms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Terms</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.BasicExp#getTerms()
   * @see #getBasicExp()
   * @generated
   */
  EReference getBasicExp_Terms();

  /**
   * Returns the meta object for the attribute list '{@link org.sireum.aadl.gumbo.gumbo.BasicExp#getOps <em>Ops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Ops</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.BasicExp#getOps()
   * @see #getBasicExp()
   * @generated
   */
  EAttribute getBasicExp_Ops();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.BasicExp#getThenExpr <em>Then Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then Expr</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.BasicExp#getThenExpr()
   * @see #getBasicExp()
   * @generated
   */
  EReference getBasicExp_ThenExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.BasicExp#getElseExpr <em>Else Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else Expr</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.BasicExp#getElseExpr()
   * @see #getBasicExp()
   * @generated
   */
  EReference getBasicExp_ElseExpr();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.QuantifiedExp <em>Quantified Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Quantified Exp</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.QuantifiedExp
   * @generated
   */
  EClass getQuantifiedExp();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.QuantifiedExp#getQVar <em>QVar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>QVar</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.QuantifiedExp#getQVar()
   * @see #getQuantifiedExp()
   * @generated
   */
  EReference getQuantifiedExp_QVar();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.QuantifiedExp#getQuantifiedExpr <em>Quantified Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantified Expr</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.QuantifiedExp#getQuantifiedExpr()
   * @see #getQuantifiedExp()
   * @generated
   */
  EReference getQuantifiedExp_QuantifiedExpr();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.UnaryExp <em>Unary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Exp</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.UnaryExp
   * @generated
   */
  EClass getUnaryExp();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.UnaryExp#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.UnaryExp#getOp()
   * @see #getUnaryExp()
   * @generated
   */
  EAttribute getUnaryExp_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.UnaryExp#getAccessExp <em>Access Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Access Exp</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.UnaryExp#getAccessExp()
   * @see #getUnaryExp()
   * @generated
   */
  EReference getUnaryExp_AccessExp();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangAccess <em>Slang Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Access</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangAccess
   * @generated
   */
  EClass getSlangAccess();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangAccess#getT <em>T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangAccess#getT()
   * @see #getSlangAccess()
   * @generated
   */
  EReference getSlangAccess_T();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangLitTerm <em>Slang Lit Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Lit Term</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangLitTerm
   * @generated
   */
  EClass getSlangLitTerm();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangLitTerm#getLit <em>Lit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lit</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangLitTerm#getLit()
   * @see #getSlangLitTerm()
   * @generated
   */
  EReference getSlangLitTerm_Lit();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangInterpTerm <em>Slang Interp Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Interp Term</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangInterpTerm
   * @generated
   */
  EClass getSlangInterpTerm();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangInterpTerm#getI <em>I</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>I</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangInterpTerm#getI()
   * @see #getSlangInterpTerm()
   * @generated
   */
  EReference getSlangInterpTerm_I();

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
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.EnumLitExpr#getEnumType <em>Enum Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Enum Type</em>'.
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
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.RecordLitExpr <em>Record Lit Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Record Lit Expr</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.RecordLitExpr
   * @generated
   */
  EClass getRecordLitExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.RecordLitExpr#getRecordType <em>Record Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Record Type</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.RecordLitExpr#getRecordType()
   * @see #getRecordLitExpr()
   * @generated
   */
  EReference getRecordLitExpr_RecordType();

  /**
   * Returns the meta object for the reference list '{@link org.sireum.aadl.gumbo.gumbo.RecordLitExpr#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Args</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.RecordLitExpr#getArgs()
   * @see #getRecordLitExpr()
   * @generated
   */
  EReference getRecordLitExpr_Args();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.RecordLitExpr#getArgExpr <em>Arg Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arg Expr</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.RecordLitExpr#getArgExpr()
   * @see #getRecordLitExpr()
   * @generated
   */
  EReference getRecordLitExpr_ArgExpr();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.DataRefExpr <em>Data Ref Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Ref Expr</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.DataRefExpr
   * @generated
   */
  EClass getDataRefExpr();

  /**
   * Returns the meta object for the reference '{@link org.sireum.aadl.gumbo.gumbo.DataRefExpr#getPortOrSubcomponentOrStateVar <em>Port Or Subcomponent Or State Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Port Or Subcomponent Or State Var</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.DataRefExpr#getPortOrSubcomponentOrStateVar()
   * @see #getDataRefExpr()
   * @generated
   */
  EReference getDataRefExpr_PortOrSubcomponentOrStateVar();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.DataRefExpr#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.DataRefExpr#getRef()
   * @see #getDataRefExpr()
   * @generated
   */
  EReference getDataRefExpr_Ref();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.DataRefExpr#getCs <em>Cs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cs</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.DataRefExpr#getCs()
   * @see #getDataRefExpr()
   * @generated
   */
  EReference getDataRefExpr_Cs();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangTupleTerm <em>Slang Tuple Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Tuple Term</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangTupleTerm
   * @generated
   */
  EClass getSlangTupleTerm();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.SlangTupleTerm#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>E</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangTupleTerm#getE()
   * @see #getSlangTupleTerm()
   * @generated
   */
  EReference getSlangTupleTerm_E();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangForTerm <em>Slang For Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang For Term</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangForTerm
   * @generated
   */
  EClass getSlangForTerm();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.SlangForTerm#getR <em>R</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>R</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangForTerm#getR()
   * @see #getSlangForTerm()
   * @generated
   */
  EReference getSlangForTerm_R();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangForTerm#getB <em>B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>B</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangForTerm#getB()
   * @see #getSlangForTerm()
   * @generated
   */
  EReference getSlangForTerm_B();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangForTerm#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangForTerm#getE()
   * @see #getSlangForTerm()
   * @generated
   */
  EReference getSlangForTerm_E();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangBlockTerm <em>Slang Block Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Block Term</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangBlockTerm
   * @generated
   */
  EClass getSlangBlockTerm();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangBlockTerm#getP <em>P</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>P</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangBlockTerm#getP()
   * @see #getSlangBlockTerm()
   * @generated
   */
  EReference getSlangBlockTerm_P();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangBlockTerm#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangBlockTerm#getE()
   * @see #getSlangBlockTerm()
   * @generated
   */
  EReference getSlangBlockTerm_E();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.SlangBlockTerm#getStmt <em>Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stmt</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangBlockTerm#getStmt()
   * @see #getSlangBlockTerm()
   * @generated
   */
  EReference getSlangBlockTerm_Stmt();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangBlockTerm#getR <em>R</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>R</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangBlockTerm#getR()
   * @see #getSlangBlockTerm()
   * @generated
   */
  EReference getSlangBlockTerm_R();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.BooleanLit <em>Boolean Lit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Lit</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.BooleanLit
   * @generated
   */
  EClass getBooleanLit();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.IntegerLit <em>Integer Lit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Lit</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.IntegerLit
   * @generated
   */
  EClass getIntegerLit();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.IntIdfLit <em>Int Idf Lit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Idf Lit</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.IntIdfLit
   * @generated
   */
  EClass getIntIdfLit();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.HexLit <em>Hex Lit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hex Lit</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.HexLit
   * @generated
   */
  EClass getHexLit();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.BinLit <em>Bin Lit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bin Lit</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.BinLit
   * @generated
   */
  EClass getBinLit();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.RealLit <em>Real Lit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Real Lit</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.RealLit
   * @generated
   */
  EClass getRealLit();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangStringLit <em>Slang String Lit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang String Lit</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangStringLit
   * @generated
   */
  EClass getSlangStringLit();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.RealIdfLit <em>Real Idf Lit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Real Idf Lit</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.RealIdfLit
   * @generated
   */
  EClass getRealIdfLit();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.MStringLit <em>MString Lit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MString Lit</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.MStringLit
   * @generated
   */
  EClass getMStringLit();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangMspInterp <em>Slang Msp Interp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Msp Interp</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangMspInterp
   * @generated
   */
  EClass getSlangMspInterp();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.SlangMspInterp#getMsp <em>Msp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Msp</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangMspInterp#getMsp()
   * @see #getSlangMspInterp()
   * @generated
   */
  EAttribute getSlangMspInterp_Msp();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangLiteralInterp <em>Slang Literal Interp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Literal Interp</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangLiteralInterp
   * @generated
   */
  EClass getSlangLiteralInterp();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.SlangLiteralInterp#getSli <em>Sli</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sli</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangLiteralInterp#getSli()
   * @see #getSlangLiteralInterp()
   * @generated
   */
  EAttribute getSlangLiteralInterp_Sli();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangMspbInterp <em>Slang Mspb Interp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Mspb Interp</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangMspbInterp
   * @generated
   */
  EClass getSlangMspbInterp();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.SlangMspbInterp#getMspb <em>Mspb</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mspb</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangMspbInterp#getMspb()
   * @see #getSlangMspbInterp()
   * @generated
   */
  EAttribute getSlangMspbInterp_Mspb();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangMspbInterp#getMinterp <em>Minterp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Minterp</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangMspbInterp#getMinterp()
   * @see #getSlangMspbInterp()
   * @generated
   */
  EReference getSlangMspbInterp_Minterp();

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
     * The meta object literal for the '<em><b>Functions</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPEC_SECTION__FUNCTIONS = eINSTANCE.getSpecSection_Functions();

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
     * The meta object literal for the '<em><b>Modifies</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INITIALIZE__MODIFIES = eINSTANCE.getInitialize_Modifies();

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
     * The meta object literal for the '<em><b>Guarantee Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INITIALIZE_SPEC_STATEMENT__GUARANTEE_STATEMENT = eINSTANCE.getInitializeSpecStatement_GuaranteeStatement();

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
     * The meta object literal for the '<em><b>Modifies</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPUTE__MODIFIES = eINSTANCE.getCompute_Modifies();

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
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.OtherDataRefImpl <em>Other Data Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.OtherDataRefImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getOtherDataRef()
     * @generated
     */
    EClass OTHER_DATA_REF = eINSTANCE.getOtherDataRef();

    /**
     * The meta object literal for the '<em><b>Named Element</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OTHER_DATA_REF__NAMED_ELEMENT = eINSTANCE.getOtherDataRef_NamedElement();

    /**
     * The meta object literal for the '<em><b>Array Range</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OTHER_DATA_REF__ARRAY_RANGE = eINSTANCE.getOtherDataRef_ArrayRange();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OTHER_DATA_REF__PATH = eINSTANCE.getOtherDataRef_Path();

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
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.DataElementImpl <em>Data Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.DataElementImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getDataElement()
     * @generated
     */
    EClass DATA_ELEMENT = eINSTANCE.getDataElement();

    /**
     * The meta object literal for the '<em><b>Data Element</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_ELEMENT__DATA_ELEMENT = eINSTANCE.getDataElement_DataElement();

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
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.FunctionsImpl <em>Functions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.FunctionsImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getFunctions()
     * @generated
     */
    EClass FUNCTIONS = eINSTANCE.getFunctions();

    /**
     * The meta object literal for the '<em><b>Specs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTIONS__SPECS = eINSTANCE.getFunctions_Specs();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.FuncSpecImpl <em>Func Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.FuncSpecImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getFuncSpec()
     * @generated
     */
    EClass FUNC_SPEC = eINSTANCE.getFuncSpec();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangDefDeclDefImpl <em>Slang Def Decl Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangDefDeclDefImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangDefDeclDef()
     * @generated
     */
    EClass SLANG_DEF_DECL_DEF = eINSTANCE.getSlangDefDeclDef();

    /**
     * The meta object literal for the '<em><b>Sde</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_DEF_DECL_DEF__SDE = eINSTANCE.getSlangDefDeclDef_Sde();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLANG_DEF_DECL_DEF__NAME = eINSTANCE.getSlangDefDeclDef_Name();

    /**
     * The meta object literal for the '<em><b>Type Params</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLANG_DEF_DECL_DEF__TYPE_PARAMS = eINSTANCE.getSlangDefDeclDef_TypeParams();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_DEF_DECL_DEF__PARAMS = eINSTANCE.getSlangDefDeclDef_Params();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_DEF_DECL_DEF__TYPE = eINSTANCE.getSlangDefDeclDef_Type();

    /**
     * The meta object literal for the '<em><b>C</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_DEF_DECL_DEF__C = eINSTANCE.getSlangDefDeclDef_C();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_DEF_DECL_DEF__E = eINSTANCE.getSlangDefDeclDef_E();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangDefDeclImpl <em>Slang Def Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangDefDeclImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangDefDecl()
     * @generated
     */
    EClass SLANG_DEF_DECL = eINSTANCE.getSlangDefDecl();

    /**
     * The meta object literal for the '<em><b>Sde</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_DEF_DECL__SDE = eINSTANCE.getSlangDefDecl_Sde();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLANG_DEF_DECL__NAME = eINSTANCE.getSlangDefDecl_Name();

    /**
     * The meta object literal for the '<em><b>Type Params</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLANG_DEF_DECL__TYPE_PARAMS = eINSTANCE.getSlangDefDecl_TypeParams();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_DEF_DECL__PARAMS = eINSTANCE.getSlangDefDecl_Params();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_DEF_DECL__TYPE = eINSTANCE.getSlangDefDecl_Type();

    /**
     * The meta object literal for the '<em><b>C</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_DEF_DECL__C = eINSTANCE.getSlangDefDecl_C();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangDefDefImpl <em>Slang Def Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangDefDefImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangDefDef()
     * @generated
     */
    EClass SLANG_DEF_DEF = eINSTANCE.getSlangDefDef();

    /**
     * The meta object literal for the '<em><b>Sde</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_DEF_DEF__SDE = eINSTANCE.getSlangDefDef_Sde();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLANG_DEF_DEF__NAME = eINSTANCE.getSlangDefDef_Name();

    /**
     * The meta object literal for the '<em><b>Type Params</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLANG_DEF_DEF__TYPE_PARAMS = eINSTANCE.getSlangDefDef_TypeParams();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_DEF_DEF__PARAMS = eINSTANCE.getSlangDefDef_Params();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_DEF_DEF__TYPE = eINSTANCE.getSlangDefDef_Type();

    /**
     * The meta object literal for the '<em><b>C</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_DEF_DEF__C = eINSTANCE.getSlangDefDef_C();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_DEF_DEF__E = eINSTANCE.getSlangDefDef_E();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangDefExtImpl <em>Slang Def Ext</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangDefExtImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangDefExt()
     * @generated
     */
    EClass SLANG_DEF_EXT = eINSTANCE.getSlangDefExt();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLANG_DEF_EXT__NAME = eINSTANCE.getSlangDefExt_Name();

    /**
     * The meta object literal for the '<em><b>Type Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_DEF_EXT__TYPE_NAME = eINSTANCE.getSlangDefExt_TypeName();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangDefParamsImpl <em>Slang Def Params</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangDefParamsImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangDefParams()
     * @generated
     */
    EClass SLANG_DEF_PARAMS = eINSTANCE.getSlangDefParams();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_DEF_PARAMS__PARAMS = eINSTANCE.getSlangDefParams_Params();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangDefParamImpl <em>Slang Def Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangDefParamImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangDefParam()
     * @generated
     */
    EClass SLANG_DEF_PARAM = eINSTANCE.getSlangDefParam();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLANG_DEF_PARAM__NAME = eINSTANCE.getSlangDefParam_Name();

    /**
     * The meta object literal for the '<em><b>Type Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_DEF_PARAM__TYPE_NAME = eINSTANCE.getSlangDefParam_TypeName();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangDefContractImpl <em>Slang Def Contract</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangDefContractImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangDefContract()
     * @generated
     */
    EClass SLANG_DEF_CONTRACT = eINSTANCE.getSlangDefContract();

    /**
     * The meta object literal for the '<em><b>Rea</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_DEF_CONTRACT__REA = eINSTANCE.getSlangDefContract_Rea();

    /**
     * The meta object literal for the '<em><b>Req</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_DEF_CONTRACT__REQ = eINSTANCE.getSlangDefContract_Req();

    /**
     * The meta object literal for the '<em><b>Mod</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_DEF_CONTRACT__MOD = eINSTANCE.getSlangDefContract_Mod();

    /**
     * The meta object literal for the '<em><b>Ens</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_DEF_CONTRACT__ENS = eINSTANCE.getSlangDefContract_Ens();

    /**
     * The meta object literal for the '<em><b>Contracts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_DEF_CONTRACT__CONTRACTS = eINSTANCE.getSlangDefContract_Contracts();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangDefContractCaseImpl <em>Slang Def Contract Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangDefContractCaseImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangDefContractCase()
     * @generated
     */
    EClass SLANG_DEF_CONTRACT_CASE = eINSTANCE.getSlangDefContractCase();

    /**
     * The meta object literal for the '<em><b>Req</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_DEF_CONTRACT_CASE__REQ = eINSTANCE.getSlangDefContractCase_Req();

    /**
     * The meta object literal for the '<em><b>Ens</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_DEF_CONTRACT_CASE__ENS = eINSTANCE.getSlangDefContractCase_Ens();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangSuprsImpl <em>Slang Suprs</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangSuprsImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangSuprs()
     * @generated
     */
    EClass SLANG_SUPRS = eINSTANCE.getSlangSuprs();

    /**
     * The meta object literal for the '<em><b>Super Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_SUPRS__SUPER_TYPES = eINSTANCE.getSlangSuprs_SuperTypes();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangSuprImpl <em>Slang Supr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangSuprImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangSupr()
     * @generated
     */
    EClass SLANG_SUPR = eINSTANCE.getSlangSupr();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLANG_SUPR__NAME = eINSTANCE.getSlangSupr_Name();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_SUPR__ARGS = eINSTANCE.getSlangSupr_Args();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangExtImpl <em>Slang Ext</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangExtImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangExt()
     * @generated
     */
    EClass SLANG_EXT = eINSTANCE.getSlangExt();

    /**
     * The meta object literal for the '<em><b>Decl</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_EXT__DECL = eINSTANCE.getSlangExt_Decl();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangInvariantImpl <em>Slang Invariant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangInvariantImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangInvariant()
     * @generated
     */
    EClass SLANG_INVARIANT = eINSTANCE.getSlangInvariant();

    /**
     * The meta object literal for the '<em><b>Exprs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_INVARIANT__EXPRS = eINSTANCE.getSlangInvariant_Exprs();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangReadsImpl <em>Slang Reads</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangReadsImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangReads()
     * @generated
     */
    EClass SLANG_READS = eINSTANCE.getSlangReads();

    /**
     * The meta object literal for the '<em><b>Exprs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_READS__EXPRS = eINSTANCE.getSlangReads_Exprs();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangRequiresImpl <em>Slang Requires</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangRequiresImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangRequires()
     * @generated
     */
    EClass SLANG_REQUIRES = eINSTANCE.getSlangRequires();

    /**
     * The meta object literal for the '<em><b>Exprs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_REQUIRES__EXPRS = eINSTANCE.getSlangRequires_Exprs();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangModifiesImpl <em>Slang Modifies</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangModifiesImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangModifies()
     * @generated
     */
    EClass SLANG_MODIFIES = eINSTANCE.getSlangModifies();

    /**
     * The meta object literal for the '<em><b>Exprs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_MODIFIES__EXPRS = eINSTANCE.getSlangModifies_Exprs();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangEnsuresImpl <em>Slang Ensures</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangEnsuresImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangEnsures()
     * @generated
     */
    EClass SLANG_ENSURES = eINSTANCE.getSlangEnsures();

    /**
     * The meta object literal for the '<em><b>Exprs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_ENSURES__EXPRS = eINSTANCE.getSlangEnsures_Exprs();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangStmtImpl <em>Slang Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangStmtImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangStmt()
     * @generated
     */
    EClass SLANG_STMT = eINSTANCE.getSlangStmt();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangElseImpl <em>Slang Else</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangElseImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangElse()
     * @generated
     */
    EClass SLANG_ELSE = eINSTANCE.getSlangElse();

    /**
     * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_ELSE__COND = eINSTANCE.getSlangElse_Cond();

    /**
     * The meta object literal for the '<em><b>B</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_ELSE__B = eINSTANCE.getSlangElse_B();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_ELSE__E = eINSTANCE.getSlangElse_E();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangLoopContractImpl <em>Slang Loop Contract</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangLoopContractImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangLoopContract()
     * @generated
     */
    EClass SLANG_LOOP_CONTRACT = eINSTANCE.getSlangLoopContract();

    /**
     * The meta object literal for the '<em><b>Inv</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_LOOP_CONTRACT__INV = eINSTANCE.getSlangLoopContract_Inv();

    /**
     * The meta object literal for the '<em><b>Mod</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_LOOP_CONTRACT__MOD = eINSTANCE.getSlangLoopContract_Mod();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangLHSSuffixImpl <em>Slang LHS Suffix</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangLHSSuffixImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangLHSSuffix()
     * @generated
     */
    EClass SLANG_LHS_SUFFIX = eINSTANCE.getSlangLHSSuffix();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangCaseImpl <em>Slang Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangCaseImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangCase()
     * @generated
     */
    EClass SLANG_CASE = eINSTANCE.getSlangCase();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_CASE__PATTERN = eINSTANCE.getSlangCase_Pattern();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_CASE__E = eINSTANCE.getSlangCase_E();

    /**
     * The meta object literal for the '<em><b>S</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_CASE__S = eINSTANCE.getSlangCase_S();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangPatternImpl <em>Slang Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangPatternImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangPattern()
     * @generated
     */
    EClass SLANG_PATTERN = eINSTANCE.getSlangPattern();

    /**
     * The meta object literal for the '<em><b>Patterns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_PATTERN__PATTERNS = eINSTANCE.getSlangPattern_Patterns();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangTPatternImpl <em>Slang TPattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangTPatternImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangTPattern()
     * @generated
     */
    EClass SLANG_TPATTERN = eINSTANCE.getSlangTPattern();

    /**
     * The meta object literal for the '<em><b>Patterns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_TPATTERN__PATTERNS = eINSTANCE.getSlangTPattern_Patterns();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_TPATTERN__TYPE = eINSTANCE.getSlangTPattern_Type();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangVarDefImpl <em>Slang Var Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangVarDefImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangVarDef()
     * @generated
     */
    EClass SLANG_VAR_DEF = eINSTANCE.getSlangVarDef();

    /**
     * The meta object literal for the '<em><b>D</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_VAR_DEF__D = eINSTANCE.getSlangVarDef_D();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLANG_VAR_DEF__NAME = eINSTANCE.getSlangVarDef_Name();

    /**
     * The meta object literal for the '<em><b>Type Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_VAR_DEF__TYPE_NAME = eINSTANCE.getSlangVarDef_TypeName();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_VAR_DEF__INIT = eINSTANCE.getSlangVarDef_Init();

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
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangQuantVarImpl <em>Slang Quant Var</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangQuantVarImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangQuantVar()
     * @generated
     */
    EClass SLANG_QUANT_VAR = eINSTANCE.getSlangQuantVar();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_QUANT_VAR__E = eINSTANCE.getSlangQuantVar_E();

    /**
     * The meta object literal for the '<em><b>Upper Bound</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_QUANT_VAR__UPPER_BOUND = eINSTANCE.getSlangQuantVar_UpperBound();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangBlockImpl <em>Slang Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangBlockImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangBlock()
     * @generated
     */
    EClass SLANG_BLOCK = eINSTANCE.getSlangBlock();

    /**
     * The meta object literal for the '<em><b>Stmts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_BLOCK__STMTS = eINSTANCE.getSlangBlock_Stmts();

    /**
     * The meta object literal for the '<em><b>R</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_BLOCK__R = eINSTANCE.getSlangBlock_R();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangParamsImpl <em>Slang Params</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangParamsImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangParams()
     * @generated
     */
    EClass SLANG_PARAMS = eINSTANCE.getSlangParams();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_PARAMS__PARAMS = eINSTANCE.getSlangParams_Params();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangParamImpl <em>Slang Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangParamImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangParam()
     * @generated
     */
    EClass SLANG_PARAM = eINSTANCE.getSlangParam();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLANG_PARAM__NAME = eINSTANCE.getSlangParam_Name();

    /**
     * The meta object literal for the '<em><b>Type Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_PARAM__TYPE_NAME = eINSTANCE.getSlangParam_TypeName();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangForRangeImpl <em>Slang For Range</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangForRangeImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangForRange()
     * @generated
     */
    EClass SLANG_FOR_RANGE = eINSTANCE.getSlangForRange();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_FOR_RANGE__E = eINSTANCE.getSlangForRange_E();

    /**
     * The meta object literal for the '<em><b>Upper</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_FOR_RANGE__UPPER = eINSTANCE.getSlangForRange_Upper();

    /**
     * The meta object literal for the '<em><b>Step</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_FOR_RANGE__STEP = eINSTANCE.getSlangForRange_Step();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangRetImpl <em>Slang Ret</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangRetImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangRet()
     * @generated
     */
    EClass SLANG_RET = eINSTANCE.getSlangRet();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_RET__E = eINSTANCE.getSlangRet_E();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangCallSuffixImpl <em>Slang Call Suffix</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangCallSuffixImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangCallSuffix()
     * @generated
     */
    EClass SLANG_CALL_SUFFIX = eINSTANCE.getSlangCallSuffix();

    /**
     * The meta object literal for the '<em><b>Ta</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_CALL_SUFFIX__TA = eINSTANCE.getSlangCallSuffix_Ta();

    /**
     * The meta object literal for the '<em><b>Ca</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_CALL_SUFFIX__CA = eINSTANCE.getSlangCallSuffix_Ca();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangCallArgsImpl <em>Slang Call Args</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangCallArgsImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangCallArgs()
     * @generated
     */
    EClass SLANG_CALL_ARGS = eINSTANCE.getSlangCallArgs();

    /**
     * The meta object literal for the '<em><b>Arg</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_CALL_ARGS__ARG = eINSTANCE.getSlangCallArgs_Arg();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangIDExpImpl <em>Slang ID Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangIDExpImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangIDExp()
     * @generated
     */
    EClass SLANG_ID_EXP = eINSTANCE.getSlangIDExp();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_ID_EXP__E = eINSTANCE.getSlangIDExp_E();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangTypeImpl <em>Slang Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangTypeImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangType()
     * @generated
     */
    EClass SLANG_TYPE = eINSTANCE.getSlangType();

    /**
     * The meta object literal for the '<em><b>Type Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_TYPE__TYPE_NAME = eINSTANCE.getSlangType_TypeName();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangTypeArgsImpl <em>Slang Type Args</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangTypeArgsImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangTypeArgs()
     * @generated
     */
    EClass SLANG_TYPE_ARGS = eINSTANCE.getSlangTypeArgs();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_TYPE_ARGS__TYPES = eINSTANCE.getSlangTypeArgs_Types();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangLitImpl <em>Slang Lit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangLitImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangLit()
     * @generated
     */
    EClass SLANG_LIT = eINSTANCE.getSlangLit();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLANG_LIT__VALUE = eINSTANCE.getSlangLit_Value();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangInterpImpl <em>Slang Interp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangInterpImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangInterp()
     * @generated
     */
    EClass SLANG_INTERP = eINSTANCE.getSlangInterp();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangMInterpImpl <em>Slang MInterp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangMInterpImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangMInterp()
     * @generated
     */
    EClass SLANG_MINTERP = eINSTANCE.getSlangMInterp();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_MINTERP__E = eINSTANCE.getSlangMInterp_E();

    /**
     * The meta object literal for the '<em><b>M</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_MINTERP__M = eINSTANCE.getSlangMInterp_M();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangIfStmtImpl <em>Slang If Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangIfStmtImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangIfStmt()
     * @generated
     */
    EClass SLANG_IF_STMT = eINSTANCE.getSlangIfStmt();

    /**
     * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_IF_STMT__COND = eINSTANCE.getSlangIfStmt_Cond();

    /**
     * The meta object literal for the '<em><b>B</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_IF_STMT__B = eINSTANCE.getSlangIfStmt_B();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_IF_STMT__E = eINSTANCE.getSlangIfStmt_E();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangWhileStmtImpl <em>Slang While Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangWhileStmtImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangWhileStmt()
     * @generated
     */
    EClass SLANG_WHILE_STMT = eINSTANCE.getSlangWhileStmt();

    /**
     * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_WHILE_STMT__COND = eINSTANCE.getSlangWhileStmt_Cond();

    /**
     * The meta object literal for the '<em><b>L</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_WHILE_STMT__L = eINSTANCE.getSlangWhileStmt_L();

    /**
     * The meta object literal for the '<em><b>B</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_WHILE_STMT__B = eINSTANCE.getSlangWhileStmt_B();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangMatchStmtImpl <em>Slang Match Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangMatchStmtImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangMatchStmt()
     * @generated
     */
    EClass SLANG_MATCH_STMT = eINSTANCE.getSlangMatchStmt();

    /**
     * The meta object literal for the '<em><b>Test Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_MATCH_STMT__TEST_EXPR = eINSTANCE.getSlangMatchStmt_TestExpr();

    /**
     * The meta object literal for the '<em><b>C</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_MATCH_STMT__C = eINSTANCE.getSlangMatchStmt_C();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangSpecStmtImpl <em>Slang Spec Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangSpecStmtImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangSpecStmt()
     * @generated
     */
    EClass SLANG_SPEC_STMT = eINSTANCE.getSlangSpecStmt();

    /**
     * The meta object literal for the '<em><b>B</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_SPEC_STMT__B = eINSTANCE.getSlangSpecStmt_B();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangAssumeStmtImpl <em>Slang Assume Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangAssumeStmtImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangAssumeStmt()
     * @generated
     */
    EClass SLANG_ASSUME_STMT = eINSTANCE.getSlangAssumeStmt();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_ASSUME_STMT__E = eINSTANCE.getSlangAssumeStmt_E();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangAssertStmtImpl <em>Slang Assert Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangAssertStmtImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangAssertStmt()
     * @generated
     */
    EClass SLANG_ASSERT_STMT = eINSTANCE.getSlangAssertStmt();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_ASSERT_STMT__E = eINSTANCE.getSlangAssertStmt_E();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangHaltStmtImpl <em>Slang Halt Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangHaltStmtImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangHaltStmt()
     * @generated
     */
    EClass SLANG_HALT_STMT = eINSTANCE.getSlangHaltStmt();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangDoStmtImpl <em>Slang Do Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangDoStmtImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangDoStmt()
     * @generated
     */
    EClass SLANG_DO_STMT = eINSTANCE.getSlangDoStmt();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_DO_STMT__E = eINSTANCE.getSlangDoStmt_E();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangIdStmtImpl <em>Slang Id Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangIdStmtImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangIdStmt()
     * @generated
     */
    EClass SLANG_ID_STMT = eINSTANCE.getSlangIdStmt();

    /**
     * The meta object literal for the '<em><b>Port Or Subcomponent Or State Var</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_ID_STMT__PORT_OR_SUBCOMPONENT_OR_STATE_VAR = eINSTANCE.getSlangIdStmt_PortOrSubcomponentOrStateVar();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_ID_STMT__E = eINSTANCE.getSlangIdStmt_E();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangFieldLookupImpl <em>Slang Field Lookup</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangFieldLookupImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangFieldLookup()
     * @generated
     */
    EClass SLANG_FIELD_LOOKUP = eINSTANCE.getSlangFieldLookup();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangMethodCallImpl <em>Slang Method Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangMethodCallImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangMethodCall()
     * @generated
     */
    EClass SLANG_METHOD_CALL = eINSTANCE.getSlangMethodCall();

    /**
     * The meta object literal for the '<em><b>Exprs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_METHOD_CALL__EXPRS = eINSTANCE.getSlangMethodCall_Exprs();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.BasicExpImpl <em>Basic Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.BasicExpImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getBasicExp()
     * @generated
     */
    EClass BASIC_EXP = eINSTANCE.getBasicExp();

    /**
     * The meta object literal for the '<em><b>Terms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_EXP__TERMS = eINSTANCE.getBasicExp_Terms();

    /**
     * The meta object literal for the '<em><b>Ops</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BASIC_EXP__OPS = eINSTANCE.getBasicExp_Ops();

    /**
     * The meta object literal for the '<em><b>Then Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_EXP__THEN_EXPR = eINSTANCE.getBasicExp_ThenExpr();

    /**
     * The meta object literal for the '<em><b>Else Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_EXP__ELSE_EXPR = eINSTANCE.getBasicExp_ElseExpr();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.QuantifiedExpImpl <em>Quantified Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.QuantifiedExpImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getQuantifiedExp()
     * @generated
     */
    EClass QUANTIFIED_EXP = eINSTANCE.getQuantifiedExp();

    /**
     * The meta object literal for the '<em><b>QVar</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUANTIFIED_EXP__QVAR = eINSTANCE.getQuantifiedExp_QVar();

    /**
     * The meta object literal for the '<em><b>Quantified Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUANTIFIED_EXP__QUANTIFIED_EXPR = eINSTANCE.getQuantifiedExp_QuantifiedExpr();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.UnaryExpImpl <em>Unary Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.UnaryExpImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getUnaryExp()
     * @generated
     */
    EClass UNARY_EXP = eINSTANCE.getUnaryExp();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNARY_EXP__OP = eINSTANCE.getUnaryExp_Op();

    /**
     * The meta object literal for the '<em><b>Access Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_EXP__ACCESS_EXP = eINSTANCE.getUnaryExp_AccessExp();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangAccessImpl <em>Slang Access</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangAccessImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangAccess()
     * @generated
     */
    EClass SLANG_ACCESS = eINSTANCE.getSlangAccess();

    /**
     * The meta object literal for the '<em><b>T</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_ACCESS__T = eINSTANCE.getSlangAccess_T();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangLitTermImpl <em>Slang Lit Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangLitTermImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangLitTerm()
     * @generated
     */
    EClass SLANG_LIT_TERM = eINSTANCE.getSlangLitTerm();

    /**
     * The meta object literal for the '<em><b>Lit</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_LIT_TERM__LIT = eINSTANCE.getSlangLitTerm_Lit();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangInterpTermImpl <em>Slang Interp Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangInterpTermImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangInterpTerm()
     * @generated
     */
    EClass SLANG_INTERP_TERM = eINSTANCE.getSlangInterpTerm();

    /**
     * The meta object literal for the '<em><b>I</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_INTERP_TERM__I = eINSTANCE.getSlangInterpTerm_I();

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
     * The meta object literal for the '<em><b>Enum Type</b></em>' containment reference feature.
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
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.RecordLitExprImpl <em>Record Lit Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.RecordLitExprImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getRecordLitExpr()
     * @generated
     */
    EClass RECORD_LIT_EXPR = eINSTANCE.getRecordLitExpr();

    /**
     * The meta object literal for the '<em><b>Record Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECORD_LIT_EXPR__RECORD_TYPE = eINSTANCE.getRecordLitExpr_RecordType();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECORD_LIT_EXPR__ARGS = eINSTANCE.getRecordLitExpr_Args();

    /**
     * The meta object literal for the '<em><b>Arg Expr</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECORD_LIT_EXPR__ARG_EXPR = eINSTANCE.getRecordLitExpr_ArgExpr();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.DataRefExprImpl <em>Data Ref Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.DataRefExprImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getDataRefExpr()
     * @generated
     */
    EClass DATA_REF_EXPR = eINSTANCE.getDataRefExpr();

    /**
     * The meta object literal for the '<em><b>Port Or Subcomponent Or State Var</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_REF_EXPR__PORT_OR_SUBCOMPONENT_OR_STATE_VAR = eINSTANCE.getDataRefExpr_PortOrSubcomponentOrStateVar();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_REF_EXPR__REF = eINSTANCE.getDataRefExpr_Ref();

    /**
     * The meta object literal for the '<em><b>Cs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_REF_EXPR__CS = eINSTANCE.getDataRefExpr_Cs();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangTupleTermImpl <em>Slang Tuple Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangTupleTermImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangTupleTerm()
     * @generated
     */
    EClass SLANG_TUPLE_TERM = eINSTANCE.getSlangTupleTerm();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_TUPLE_TERM__E = eINSTANCE.getSlangTupleTerm_E();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangForTermImpl <em>Slang For Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangForTermImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangForTerm()
     * @generated
     */
    EClass SLANG_FOR_TERM = eINSTANCE.getSlangForTerm();

    /**
     * The meta object literal for the '<em><b>R</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_FOR_TERM__R = eINSTANCE.getSlangForTerm_R();

    /**
     * The meta object literal for the '<em><b>B</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_FOR_TERM__B = eINSTANCE.getSlangForTerm_B();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_FOR_TERM__E = eINSTANCE.getSlangForTerm_E();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangBlockTermImpl <em>Slang Block Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangBlockTermImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangBlockTerm()
     * @generated
     */
    EClass SLANG_BLOCK_TERM = eINSTANCE.getSlangBlockTerm();

    /**
     * The meta object literal for the '<em><b>P</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_BLOCK_TERM__P = eINSTANCE.getSlangBlockTerm_P();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_BLOCK_TERM__E = eINSTANCE.getSlangBlockTerm_E();

    /**
     * The meta object literal for the '<em><b>Stmt</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_BLOCK_TERM__STMT = eINSTANCE.getSlangBlockTerm_Stmt();

    /**
     * The meta object literal for the '<em><b>R</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_BLOCK_TERM__R = eINSTANCE.getSlangBlockTerm_R();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.BooleanLitImpl <em>Boolean Lit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.BooleanLitImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getBooleanLit()
     * @generated
     */
    EClass BOOLEAN_LIT = eINSTANCE.getBooleanLit();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.IntegerLitImpl <em>Integer Lit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.IntegerLitImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getIntegerLit()
     * @generated
     */
    EClass INTEGER_LIT = eINSTANCE.getIntegerLit();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.IntIdfLitImpl <em>Int Idf Lit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.IntIdfLitImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getIntIdfLit()
     * @generated
     */
    EClass INT_IDF_LIT = eINSTANCE.getIntIdfLit();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.HexLitImpl <em>Hex Lit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.HexLitImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getHexLit()
     * @generated
     */
    EClass HEX_LIT = eINSTANCE.getHexLit();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.BinLitImpl <em>Bin Lit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.BinLitImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getBinLit()
     * @generated
     */
    EClass BIN_LIT = eINSTANCE.getBinLit();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.RealLitImpl <em>Real Lit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.RealLitImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getRealLit()
     * @generated
     */
    EClass REAL_LIT = eINSTANCE.getRealLit();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangStringLitImpl <em>Slang String Lit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangStringLitImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangStringLit()
     * @generated
     */
    EClass SLANG_STRING_LIT = eINSTANCE.getSlangStringLit();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.RealIdfLitImpl <em>Real Idf Lit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.RealIdfLitImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getRealIdfLit()
     * @generated
     */
    EClass REAL_IDF_LIT = eINSTANCE.getRealIdfLit();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.MStringLitImpl <em>MString Lit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.MStringLitImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getMStringLit()
     * @generated
     */
    EClass MSTRING_LIT = eINSTANCE.getMStringLit();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangMspInterpImpl <em>Slang Msp Interp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangMspInterpImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangMspInterp()
     * @generated
     */
    EClass SLANG_MSP_INTERP = eINSTANCE.getSlangMspInterp();

    /**
     * The meta object literal for the '<em><b>Msp</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLANG_MSP_INTERP__MSP = eINSTANCE.getSlangMspInterp_Msp();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangLiteralInterpImpl <em>Slang Literal Interp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangLiteralInterpImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangLiteralInterp()
     * @generated
     */
    EClass SLANG_LITERAL_INTERP = eINSTANCE.getSlangLiteralInterp();

    /**
     * The meta object literal for the '<em><b>Sli</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLANG_LITERAL_INTERP__SLI = eINSTANCE.getSlangLiteralInterp_Sli();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangMspbInterpImpl <em>Slang Mspb Interp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangMspbInterpImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangMspbInterp()
     * @generated
     */
    EClass SLANG_MSPB_INTERP = eINSTANCE.getSlangMspbInterp();

    /**
     * The meta object literal for the '<em><b>Mspb</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLANG_MSPB_INTERP__MSPB = eINSTANCE.getSlangMspbInterp_Mspb();

    /**
     * The meta object literal for the '<em><b>Minterp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_MSPB_INTERP__MINTERP = eINSTANCE.getSlangMspbInterp_Minterp();

  }

} //GumboPackage
