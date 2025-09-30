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
   * The feature id for the '<em><b>Functions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUMBO_LIBRARY__FUNCTIONS = Aadl2Package.ANNEX_LIBRARY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Library</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUMBO_LIBRARY_FEATURE_COUNT = Aadl2Package.ANNEX_LIBRARY_FEATURE_COUNT + 1;

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
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INV_SPEC__ID = 0;

  /**
   * The feature id for the '<em><b>Descriptor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INV_SPEC__DESCRIPTOR = 1;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INV_SPEC__EXPR = 2;

  /**
   * The number of structural features of the '<em>Inv Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INV_SPEC_FEATURE_COUNT = 3;

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
   * The feature id for the '<em><b>Flows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALIZE__FLOWS = 2;

  /**
   * The number of structural features of the '<em>Initialize</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALIZE_FEATURE_COUNT = 3;

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
   * The feature id for the '<em><b>Assumes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPUTE__ASSUMES = 1;

  /**
   * The feature id for the '<em><b>Guarantees</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPUTE__GUARANTEES = 2;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPUTE__CASES = 3;

  /**
   * The feature id for the '<em><b>Handlers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPUTE__HANDLERS = 4;

  /**
   * The feature id for the '<em><b>Flows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPUTE__FLOWS = 5;

  /**
   * The feature id for the '<em><b>Gumbo Tables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPUTE__GUMBO_TABLES = 6;

  /**
   * The number of structural features of the '<em>Compute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPUTE_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.GumboTableImpl <em>Table</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboTableImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getGumboTable()
   * @generated
   */
  int GUMBO_TABLE = 11;

  /**
   * The feature id for the '<em><b>Table</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUMBO_TABLE__TABLE = 0;

  /**
   * The number of structural features of the '<em>Table</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUMBO_TABLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.NormalTableImpl <em>Normal Table</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.NormalTableImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getNormalTable()
   * @generated
   */
  int NORMAL_TABLE = 12;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_TABLE__ID = 0;

  /**
   * The feature id for the '<em><b>Descriptor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_TABLE__DESCRIPTOR = 1;

  /**
   * The feature id for the '<em><b>Horizontal Predicates</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_TABLE__HORIZONTAL_PREDICATES = 2;

  /**
   * The feature id for the '<em><b>Vertical Predicates</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_TABLE__VERTICAL_PREDICATES = 3;

  /**
   * The feature id for the '<em><b>Result Rows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_TABLE__RESULT_ROWS = 4;

  /**
   * The number of structural features of the '<em>Normal Table</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_TABLE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.ResultRowImpl <em>Result Row</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.ResultRowImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getResultRow()
   * @generated
   */
  int RESULT_ROW = 13;

  /**
   * The feature id for the '<em><b>Results</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESULT_ROW__RESULTS = 0;

  /**
   * The number of structural features of the '<em>Result Row</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESULT_ROW_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.InfoFlowClauseImpl <em>Info Flow Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.InfoFlowClauseImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getInfoFlowClause()
   * @generated
   */
  int INFO_FLOW_CLAUSE = 14;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFO_FLOW_CLAUSE__ID = 0;

  /**
   * The feature id for the '<em><b>Descriptor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFO_FLOW_CLAUSE__DESCRIPTOR = 1;

  /**
   * The feature id for the '<em><b>From Port Or State Var</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFO_FLOW_CLAUSE__FROM_PORT_OR_STATE_VAR = 2;

  /**
   * The feature id for the '<em><b>To Port Or State Var</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFO_FLOW_CLAUSE__TO_PORT_OR_STATE_VAR = 3;

  /**
   * The number of structural features of the '<em>Info Flow Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFO_FLOW_CLAUSE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.HandlerClauseImpl <em>Handler Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.HandlerClauseImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getHandlerClause()
   * @generated
   */
  int HANDLER_CLAUSE = 15;

  /**
   * The feature id for the '<em><b>Id</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HANDLER_CLAUSE__ID = 0;

  /**
   * The feature id for the '<em><b>Modifies</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HANDLER_CLAUSE__MODIFIES = 1;

  /**
   * The feature id for the '<em><b>Assumes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HANDLER_CLAUSE__ASSUMES = 2;

  /**
   * The feature id for the '<em><b>Guarantees</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HANDLER_CLAUSE__GUARANTEES = 3;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HANDLER_CLAUSE__CASES = 4;

  /**
   * The number of structural features of the '<em>Handler Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HANDLER_CLAUSE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.CaseStatementClauseImpl <em>Case Statement Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.CaseStatementClauseImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getCaseStatementClause()
   * @generated
   */
  int CASE_STATEMENT_CLAUSE = 16;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_STATEMENT_CLAUSE__ID = 0;

  /**
   * The feature id for the '<em><b>Descriptor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_STATEMENT_CLAUSE__DESCRIPTOR = 1;

  /**
   * The feature id for the '<em><b>Assume Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_STATEMENT_CLAUSE__ASSUME_STATEMENT = 2;

  /**
   * The feature id for the '<em><b>Guarantee Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_STATEMENT_CLAUSE__GUARANTEE_STATEMENT = 3;

  /**
   * The number of structural features of the '<em>Case Statement Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_STATEMENT_CLAUSE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SpecStatementImpl <em>Spec Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SpecStatementImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSpecStatement()
   * @generated
   */
  int SPEC_STATEMENT = 17;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC_STATEMENT__ID = 0;

  /**
   * The feature id for the '<em><b>Descriptor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC_STATEMENT__DESCRIPTOR = 1;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC_STATEMENT__EXPR = 2;

  /**
   * The number of structural features of the '<em>Spec Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC_STATEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.AssumeStatementImpl <em>Assume Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.AssumeStatementImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getAssumeStatement()
   * @generated
   */
  int ASSUME_STATEMENT = 18;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSUME_STATEMENT__ID = SPEC_STATEMENT__ID;

  /**
   * The feature id for the '<em><b>Descriptor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSUME_STATEMENT__DESCRIPTOR = SPEC_STATEMENT__DESCRIPTOR;

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
  int ANON_ASSUME_STATEMENT = 19;

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
  int GUARANTEE_STATEMENT = 20;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARANTEE_STATEMENT__ID = SPEC_STATEMENT__ID;

  /**
   * The feature id for the '<em><b>Descriptor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARANTEE_STATEMENT__DESCRIPTOR = SPEC_STATEMENT__DESCRIPTOR;

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
  int ANON_GUARANTEE_STATEMENT = 21;

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
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.DataElementImpl <em>Data Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.DataElementImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getDataElement()
   * @generated
   */
  int DATA_ELEMENT = 22;

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
  int SUBCOMPONENT_ELEMENT = 23;

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
  int FUNCTIONS = 24;

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
  int FUNC_SPEC = 25;

  /**
   * The number of structural features of the '<em>Func Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_SPEC_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangDefDefImpl <em>Slang Def Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangDefDefImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangDefDef()
   * @generated
   */
  int SLANG_DEF_DEF = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_DEF__NAME = FUNC_SPEC_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_DEF__TYPE_PARAMS = FUNC_SPEC_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_DEF__PARAMS = FUNC_SPEC_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_DEF__TYPE = FUNC_SPEC_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Method Contract</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_DEF__METHOD_CONTRACT = FUNC_SPEC_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_DEF__BODY = FUNC_SPEC_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Slang Def Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_DEF_FEATURE_COUNT = FUNC_SPEC_FEATURE_COUNT + 6;

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
   * The feature id for the '<em><b>Is Method Def</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_PARAM__IS_METHOD_DEF = 1;

  /**
   * The feature id for the '<em><b>Type Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_PARAM__TYPE_NAME = 2;

  /**
   * The feature id for the '<em><b>Is Var Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_PARAM__IS_VAR_ARG = 3;

  /**
   * The number of structural features of the '<em>Slang Def Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_PARAM_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangTypeParamsImpl <em>Slang Type Params</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangTypeParamsImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangTypeParams()
   * @generated
   */
  int SLANG_TYPE_PARAMS = 29;

  /**
   * The feature id for the '<em><b>Type Param</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_TYPE_PARAMS__TYPE_PARAM = 0;

  /**
   * The number of structural features of the '<em>Slang Type Params</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_TYPE_PARAMS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangTypeParamImpl <em>Slang Type Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangTypeParamImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangTypeParam()
   * @generated
   */
  int SLANG_TYPE_PARAM = 30;

  /**
   * The feature id for the '<em><b>Is Mut</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_TYPE_PARAM__IS_MUT = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_TYPE_PARAM__NAME = 1;

  /**
   * The number of structural features of the '<em>Slang Type Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_TYPE_PARAM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangDefContractImpl <em>Slang Def Contract</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangDefContractImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangDefContract()
   * @generated
   */
  int SLANG_DEF_CONTRACT = 31;

  /**
   * The feature id for the '<em><b>Reads</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_CONTRACT__READS = 0;

  /**
   * The feature id for the '<em><b>Requires</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_CONTRACT__REQUIRES = 1;

  /**
   * The feature id for the '<em><b>Modifies</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_CONTRACT__MODIFIES = 2;

  /**
   * The feature id for the '<em><b>Ensures</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_CONTRACT__ENSURES = 3;

  /**
   * The number of structural features of the '<em>Slang Def Contract</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_DEF_CONTRACT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangInvariantImpl <em>Slang Invariant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangInvariantImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangInvariant()
   * @generated
   */
  int SLANG_INVARIANT = 32;

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
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangRequiresImpl <em>Slang Requires</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangRequiresImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangRequires()
   * @generated
   */
  int SLANG_REQUIRES = 33;

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
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangReadsImpl <em>Slang Reads</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangReadsImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangReads()
   * @generated
   */
  int SLANG_READS = 34;

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
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangModifiesImpl <em>Slang Modifies</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangModifiesImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangModifies()
   * @generated
   */
  int SLANG_MODIFIES = 35;

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
  int SLANG_ENSURES = 36;

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
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangTypeImpl <em>Slang Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangTypeImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangType()
   * @generated
   */
  int SLANG_TYPE = 37;

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
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangStmtImpl <em>Slang Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangStmtImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangStmt()
   * @generated
   */
  int SLANG_STMT = 38;

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
  int SLANG_ELSE = 39;

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
  int SLANG_LOOP_CONTRACT = 40;

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
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangCaseImpl <em>Slang Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangCaseImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangCase()
   * @generated
   */
  int SLANG_CASE = 41;

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
  int SLANG_VAR_DEF = 44;

  /**
   * The feature id for the '<em><b>D</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_VAR_DEF__D = SLANG_STMT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Slang Var Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_VAR_DEF_FEATURE_COUNT = SLANG_STMT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangPatternImpl <em>Slang Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangPatternImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangPattern()
   * @generated
   */
  int SLANG_PATTERN = 42;

  /**
   * The feature id for the '<em><b>D</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_PATTERN__D = SLANG_VAR_DEF__D;

  /**
   * The feature id for the '<em><b>Patterns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_PATTERN__PATTERNS = SLANG_VAR_DEF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_PATTERN__TYPE_NAME = SLANG_VAR_DEF_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_PATTERN__INIT = SLANG_VAR_DEF_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Slang Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_PATTERN_FEATURE_COUNT = SLANG_VAR_DEF_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangTPatternImpl <em>Slang TPattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangTPatternImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangTPattern()
   * @generated
   */
  int SLANG_TPATTERN = 43;

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
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangBlockImpl <em>Slang Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangBlockImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangBlock()
   * @generated
   */
  int SLANG_BLOCK = 45;

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
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.OwnedExpressionImpl <em>Owned Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.OwnedExpressionImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getOwnedExpression()
   * @generated
   */
  int OWNED_EXPRESSION = 46;

  /**
   * The number of structural features of the '<em>Owned Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OWNED_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.GExprImpl <em>GExpr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.GExprImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getGExpr()
   * @generated
   */
  int GEXPR = 47;

  /**
   * The number of structural features of the '<em>GExpr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEXPR_FEATURE_COUNT = OWNED_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.QuantRangeImpl <em>Quant Range</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.QuantRangeImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getQuantRange()
   * @generated
   */
  int QUANT_RANGE = 48;

  /**
   * The feature id for the '<em><b>Lo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANT_RANGE__LO = 0;

  /**
   * The feature id for the '<em><b>Extent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANT_RANGE__EXTENT = 1;

  /**
   * The feature id for the '<em><b>High</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANT_RANGE__HIGH = 2;

  /**
   * The number of structural features of the '<em>Quant Range</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANT_RANGE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.QuantParamImpl <em>Quant Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.QuantParamImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getQuantParam()
   * @generated
   */
  int QUANT_PARAM = 49;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANT_PARAM__NAME = 0;

  /**
   * The feature id for the '<em><b>Type Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANT_PARAM__TYPE_NAME = 1;

  /**
   * The number of structural features of the '<em>Quant Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANT_PARAM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.PostfixImpl <em>Postfix</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.PostfixImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getPostfix()
   * @generated
   */
  int POSTFIX = 50;

  /**
   * The number of structural features of the '<em>Postfix</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSTFIX_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.MemberAccessImpl <em>Member Access</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.MemberAccessImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getMemberAccess()
   * @generated
   */
  int MEMBER_ACCESS = 51;

  /**
   * The feature id for the '<em><b>Field</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_ACCESS__FIELD = POSTFIX_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Member Access</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_ACCESS_FEATURE_COUNT = POSTFIX_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.ArrayAccessImpl <em>Array Access</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.ArrayAccessImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getArrayAccess()
   * @generated
   */
  int ARRAY_ACCESS = 52;

  /**
   * The feature id for the '<em><b>Index</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_ACCESS__INDEX = POSTFIX_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Array Access</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_ACCESS_FEATURE_COUNT = POSTFIX_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.OtherDataRefImpl <em>Other Data Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.OtherDataRefImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getOtherDataRef()
   * @generated
   */
  int OTHER_DATA_REF = 53;

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
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangParamsImpl <em>Slang Params</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangParamsImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangParams()
   * @generated
   */
  int SLANG_PARAMS = 54;

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
  int SLANG_PARAM = 55;

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
  int SLANG_FOR_RANGE = 56;

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
  int SLANG_RET = 57;

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
  int SLANG_CALL_SUFFIX = 58;

  /**
   * The feature id for the '<em><b>Ca</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_CALL_SUFFIX__CA = 0;

  /**
   * The number of structural features of the '<em>Slang Call Suffix</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_CALL_SUFFIX_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangCallArgsImpl <em>Slang Call Args</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangCallArgsImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangCallArgs()
   * @generated
   */
  int SLANG_CALL_ARGS = 59;

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
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangLitImpl <em>Slang Lit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangLitImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangLit()
   * @generated
   */
  int SLANG_LIT = 60;

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
  int SLANG_INTERP = 61;

  /**
   * The number of structural features of the '<em>Slang Interp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_INTERP_FEATURE_COUNT = 0;

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
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.IfElseExpImpl <em>If Else Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.IfElseExpImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getIfElseExp()
   * @generated
   */
  int IF_ELSE_EXP = 70;

  /**
   * The feature id for the '<em><b>If Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_ELSE_EXP__IF_COND = GEXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Then Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_ELSE_EXP__THEN_EXPR = GEXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_ELSE_EXP__ELSE_EXPR = GEXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>If Else Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_ELSE_EXP_FEATURE_COUNT = GEXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.QuantifiedExpImpl <em>Quantified Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.QuantifiedExpImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getQuantifiedExp()
   * @generated
   */
  int QUANTIFIED_EXP = 71;

  /**
   * The feature id for the '<em><b>Quantifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_EXP__QUANTIFIER = GEXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Quant Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_EXP__QUANT_RANGE = GEXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Quant Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_EXP__QUANT_PARAM = GEXPR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Quantified Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_EXP__QUANTIFIED_EXPR = GEXPR_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Quantified Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_EXP_FEATURE_COUNT = GEXPR_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.ImpliesExprImpl <em>Implies Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.ImpliesExprImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getImpliesExpr()
   * @generated
   */
  int IMPLIES_EXPR = 72;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLIES_EXPR__LEFT = GEXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLIES_EXPR__OP = GEXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLIES_EXPR__RIGHT = GEXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Implies Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLIES_EXPR_FEATURE_COUNT = GEXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.OrExprImpl <em>Or Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.OrExprImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getOrExpr()
   * @generated
   */
  int OR_EXPR = 73;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPR__LEFT = GEXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPR__OP = GEXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPR__RIGHT = GEXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Or Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPR_FEATURE_COUNT = GEXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.AndExprImpl <em>And Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.AndExprImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getAndExpr()
   * @generated
   */
  int AND_EXPR = 74;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR__LEFT = GEXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR__OP = GEXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR__RIGHT = GEXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>And Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR_FEATURE_COUNT = GEXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.EqualNotExprImpl <em>Equal Not Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.EqualNotExprImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getEqualNotExpr()
   * @generated
   */
  int EQUAL_NOT_EXPR = 75;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUAL_NOT_EXPR__LEFT = GEXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUAL_NOT_EXPR__OP = GEXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUAL_NOT_EXPR__RIGHT = GEXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Equal Not Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUAL_NOT_EXPR_FEATURE_COUNT = GEXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.LtGtExprImpl <em>Lt Gt Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.LtGtExprImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getLtGtExpr()
   * @generated
   */
  int LT_GT_EXPR = 76;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LT_GT_EXPR__LEFT = GEXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LT_GT_EXPR__OP = GEXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LT_GT_EXPR__RIGHT = GEXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Lt Gt Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LT_GT_EXPR_FEATURE_COUNT = GEXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.ColonExprImpl <em>Colon Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.ColonExprImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getColonExpr()
   * @generated
   */
  int COLON_EXPR = 77;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLON_EXPR__LEFT = GEXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLON_EXPR__OP = GEXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLON_EXPR__RIGHT = GEXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Colon Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLON_EXPR_FEATURE_COUNT = GEXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.PlusMinusExprImpl <em>Plus Minus Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.PlusMinusExprImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getPlusMinusExpr()
   * @generated
   */
  int PLUS_MINUS_EXPR = 78;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_MINUS_EXPR__LEFT = GEXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_MINUS_EXPR__OP = GEXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_MINUS_EXPR__RIGHT = GEXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Plus Minus Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_MINUS_EXPR_FEATURE_COUNT = GEXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.MultiplicativeExprImpl <em>Multiplicative Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.MultiplicativeExprImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getMultiplicativeExpr()
   * @generated
   */
  int MULTIPLICATIVE_EXPR = 79;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPR__LEFT = GEXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPR__OP = GEXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPR__RIGHT = GEXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Multiplicative Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPR_FEATURE_COUNT = GEXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.UnaryExprImpl <em>Unary Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.UnaryExprImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getUnaryExpr()
   * @generated
   */
  int UNARY_EXPR = 80;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPR__OP = GEXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPR__EXP = GEXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Unary Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPR_FEATURE_COUNT = GEXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.PostFixExprImpl <em>Post Fix Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.PostFixExprImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getPostFixExpr()
   * @generated
   */
  int POST_FIX_EXPR = 81;

  /**
   * The feature id for the '<em><b>Base Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_FIX_EXPR__BASE_EXP = GEXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Posts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_FIX_EXPR__POSTS = GEXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Post Fix Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_FIX_EXPR_FEATURE_COUNT = GEXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangLitTermImpl <em>Slang Lit Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangLitTermImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangLitTerm()
   * @generated
   */
  int SLANG_LIT_TERM = 82;

  /**
   * The feature id for the '<em><b>Lit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_LIT_TERM__LIT = GEXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Slang Lit Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_LIT_TERM_FEATURE_COUNT = GEXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangInterpTermImpl <em>Slang Interp Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangInterpTermImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangInterpTerm()
   * @generated
   */
  int SLANG_INTERP_TERM = 83;

  /**
   * The feature id for the '<em><b>I</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_INTERP_TERM__I = GEXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Slang Interp Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_INTERP_TERM_FEATURE_COUNT = GEXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.InStateExprImpl <em>In State Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.InStateExprImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getInStateExpr()
   * @generated
   */
  int IN_STATE_EXPR = 84;

  /**
   * The feature id for the '<em><b>State Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_STATE_EXPR__STATE_VAR = GEXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>In State Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_STATE_EXPR_FEATURE_COUNT = GEXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.MaySendExprImpl <em>May Send Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.MaySendExprImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getMaySendExpr()
   * @generated
   */
  int MAY_SEND_EXPR = 85;

  /**
   * The feature id for the '<em><b>Event Port</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAY_SEND_EXPR__EVENT_PORT = GEXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAY_SEND_EXPR__VALUE = GEXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>May Send Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAY_SEND_EXPR_FEATURE_COUNT = GEXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.MustSendExprImpl <em>Must Send Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.MustSendExprImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getMustSendExpr()
   * @generated
   */
  int MUST_SEND_EXPR = 86;

  /**
   * The feature id for the '<em><b>Event Port</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUST_SEND_EXPR__EVENT_PORT = GEXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUST_SEND_EXPR__VALUE = GEXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Must Send Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUST_SEND_EXPR_FEATURE_COUNT = GEXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.NoSendExprImpl <em>No Send Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.NoSendExprImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getNoSendExpr()
   * @generated
   */
  int NO_SEND_EXPR = 87;

  /**
   * The feature id for the '<em><b>Event Port</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_SEND_EXPR__EVENT_PORT = GEXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>No Send Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_SEND_EXPR_FEATURE_COUNT = GEXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.HasEventExprImpl <em>Has Event Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.HasEventExprImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getHasEventExpr()
   * @generated
   */
  int HAS_EVENT_EXPR = 88;

  /**
   * The feature id for the '<em><b>Event Port</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_EVENT_EXPR__EVENT_PORT = GEXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Has Event Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_EVENT_EXPR_FEATURE_COUNT = GEXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.EnumLitExprImpl <em>Enum Lit Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.EnumLitExprImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getEnumLitExpr()
   * @generated
   */
  int ENUM_LIT_EXPR = 89;

  /**
   * The feature id for the '<em><b>Enum Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_LIT_EXPR__ENUM_TYPE = GEXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_LIT_EXPR__VALUE = GEXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Enum Lit Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_LIT_EXPR_FEATURE_COUNT = GEXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.ParenExprImpl <em>Paren Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.ParenExprImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getParenExpr()
   * @generated
   */
  int PAREN_EXPR = 90;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAREN_EXPR__EXP = GEXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Paren Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAREN_EXPR_FEATURE_COUNT = GEXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangForTermImpl <em>Slang For Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangForTermImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangForTerm()
   * @generated
   */
  int SLANG_FOR_TERM = 91;

  /**
   * The feature id for the '<em><b>R</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_FOR_TERM__R = GEXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_FOR_TERM__B = GEXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_FOR_TERM__E = GEXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Slang For Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_FOR_TERM_FEATURE_COUNT = GEXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangBlockTermImpl <em>Slang Block Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangBlockTermImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangBlockTerm()
   * @generated
   */
  int SLANG_BLOCK_TERM = 92;

  /**
   * The feature id for the '<em><b>P</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_BLOCK_TERM__P = GEXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_BLOCK_TERM__E = GEXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_BLOCK_TERM__STMT = GEXPR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>R</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_BLOCK_TERM__R = GEXPR_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Slang Block Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLANG_BLOCK_TERM_FEATURE_COUNT = GEXPR_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.F32ObjImpl <em>F32 Obj</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.F32ObjImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getF32Obj()
   * @generated
   */
  int F32_OBJ = 93;

  /**
   * The feature id for the '<em><b>Attr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int F32_OBJ__ATTR = GEXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>F32 Obj</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int F32_OBJ_FEATURE_COUNT = GEXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.F64ObjImpl <em>F64 Obj</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.F64ObjImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getF64Obj()
   * @generated
   */
  int F64_OBJ = 94;

  /**
   * The feature id for the '<em><b>Attr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int F64_OBJ__ATTR = GEXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>F64 Obj</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int F64_OBJ_FEATURE_COUNT = GEXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.CallExprImpl <em>Call Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.CallExprImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getCallExpr()
   * @generated
   */
  int CALL_EXPR = 95;

  /**
   * The feature id for the '<em><b>Id</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_EXPR__ID = GEXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Call Suffix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_EXPR__CALL_SUFFIX = GEXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Call Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_EXPR_FEATURE_COUNT = GEXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.RecordLitExprImpl <em>Record Lit Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.RecordLitExprImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getRecordLitExpr()
   * @generated
   */
  int RECORD_LIT_EXPR = 96;

  /**
   * The feature id for the '<em><b>Record Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_LIT_EXPR__RECORD_TYPE = GEXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_LIT_EXPR__ARGS = GEXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Arg Expr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_LIT_EXPR__ARG_EXPR = GEXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Record Lit Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_LIT_EXPR_FEATURE_COUNT = GEXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.DataRefExprImpl <em>Data Ref Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.DataRefExprImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getDataRefExpr()
   * @generated
   */
  int DATA_REF_EXPR = 97;

  /**
   * The feature id for the '<em><b>Port Or Subcomponent Or State Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_REF_EXPR__PORT_OR_SUBCOMPONENT_OR_STATE_VAR = GEXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Ref Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_REF_EXPR_FEATURE_COUNT = GEXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.ResultExprImpl <em>Result Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.ResultExprImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getResultExpr()
   * @generated
   */
  int RESULT_EXPR = 98;

  /**
   * The number of structural features of the '<em>Result Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESULT_EXPR_FEATURE_COUNT = GEXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.BooleanLitImpl <em>Boolean Lit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.BooleanLitImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getBooleanLit()
   * @generated
   */
  int BOOLEAN_LIT = 99;

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
  int INTEGER_LIT = 100;

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
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.HexLitImpl <em>Hex Lit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.HexLitImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getHexLit()
   * @generated
   */
  int HEX_LIT = 101;

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
  int BIN_LIT = 102;

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
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.F32LitImpl <em>F32 Lit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.F32LitImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getF32Lit()
   * @generated
   */
  int F32_LIT = 103;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int F32_LIT__VALUE = SLANG_LIT__VALUE;

  /**
   * The number of structural features of the '<em>F32 Lit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int F32_LIT_FEATURE_COUNT = SLANG_LIT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.F64LitImpl <em>F64 Lit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.F64LitImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getF64Lit()
   * @generated
   */
  int F64_LIT = 104;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int F64_LIT__VALUE = SLANG_LIT__VALUE;

  /**
   * The number of structural features of the '<em>F64 Lit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int F64_LIT_FEATURE_COUNT = SLANG_LIT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangStringLitImpl <em>Slang String Lit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangStringLitImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangStringLit()
   * @generated
   */
  int SLANG_STRING_LIT = 105;

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
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangLiteralInterpImpl <em>Slang Literal Interp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SlangLiteralInterpImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangLiteralInterp()
   * @generated
   */
  int SLANG_LITERAL_INTERP = 106;

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
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.GumboLibrary <em>Library</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Library</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.GumboLibrary
   * @generated
   */
  EClass getGumboLibrary();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.GumboLibrary#getFunctions <em>Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Functions</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.GumboLibrary#getFunctions()
   * @see #getGumboLibrary()
   * @generated
   */
  EReference getGumboLibrary_Functions();

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
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.InvSpec#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.InvSpec#getId()
   * @see #getInvSpec()
   * @generated
   */
  EAttribute getInvSpec_Id();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.InvSpec#getDescriptor <em>Descriptor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Descriptor</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.InvSpec#getDescriptor()
   * @see #getInvSpec()
   * @generated
   */
  EAttribute getInvSpec_Descriptor();

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
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.Initialize#getFlows <em>Flows</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Flows</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.Initialize#getFlows()
   * @see #getInitialize()
   * @generated
   */
  EReference getInitialize_Flows();

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
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.Compute#getAssumes <em>Assumes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assumes</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.Compute#getAssumes()
   * @see #getCompute()
   * @generated
   */
  EReference getCompute_Assumes();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.Compute#getGuarantees <em>Guarantees</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Guarantees</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.Compute#getGuarantees()
   * @see #getCompute()
   * @generated
   */
  EReference getCompute_Guarantees();

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
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.Compute#getHandlers <em>Handlers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Handlers</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.Compute#getHandlers()
   * @see #getCompute()
   * @generated
   */
  EReference getCompute_Handlers();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.Compute#getFlows <em>Flows</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Flows</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.Compute#getFlows()
   * @see #getCompute()
   * @generated
   */
  EReference getCompute_Flows();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.Compute#getGumboTables <em>Gumbo Tables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Gumbo Tables</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.Compute#getGumboTables()
   * @see #getCompute()
   * @generated
   */
  EReference getCompute_GumboTables();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.GumboTable <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.GumboTable
   * @generated
   */
  EClass getGumboTable();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.GumboTable#getTable <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Table</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.GumboTable#getTable()
   * @see #getGumboTable()
   * @generated
   */
  EReference getGumboTable_Table();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.NormalTable <em>Normal Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Normal Table</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.NormalTable
   * @generated
   */
  EClass getNormalTable();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.NormalTable#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.NormalTable#getId()
   * @see #getNormalTable()
   * @generated
   */
  EAttribute getNormalTable_Id();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.NormalTable#getDescriptor <em>Descriptor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Descriptor</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.NormalTable#getDescriptor()
   * @see #getNormalTable()
   * @generated
   */
  EAttribute getNormalTable_Descriptor();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.NormalTable#getHorizontalPredicates <em>Horizontal Predicates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Horizontal Predicates</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.NormalTable#getHorizontalPredicates()
   * @see #getNormalTable()
   * @generated
   */
  EReference getNormalTable_HorizontalPredicates();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.NormalTable#getVerticalPredicates <em>Vertical Predicates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vertical Predicates</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.NormalTable#getVerticalPredicates()
   * @see #getNormalTable()
   * @generated
   */
  EReference getNormalTable_VerticalPredicates();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.NormalTable#getResultRows <em>Result Rows</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Result Rows</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.NormalTable#getResultRows()
   * @see #getNormalTable()
   * @generated
   */
  EReference getNormalTable_ResultRows();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.ResultRow <em>Result Row</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Result Row</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.ResultRow
   * @generated
   */
  EClass getResultRow();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.ResultRow#getResults <em>Results</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Results</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.ResultRow#getResults()
   * @see #getResultRow()
   * @generated
   */
  EReference getResultRow_Results();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.InfoFlowClause <em>Info Flow Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Info Flow Clause</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.InfoFlowClause
   * @generated
   */
  EClass getInfoFlowClause();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.InfoFlowClause#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.InfoFlowClause#getId()
   * @see #getInfoFlowClause()
   * @generated
   */
  EAttribute getInfoFlowClause_Id();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.InfoFlowClause#getDescriptor <em>Descriptor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Descriptor</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.InfoFlowClause#getDescriptor()
   * @see #getInfoFlowClause()
   * @generated
   */
  EAttribute getInfoFlowClause_Descriptor();

  /**
   * Returns the meta object for the reference list '{@link org.sireum.aadl.gumbo.gumbo.InfoFlowClause#getFromPortOrStateVar <em>From Port Or State Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>From Port Or State Var</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.InfoFlowClause#getFromPortOrStateVar()
   * @see #getInfoFlowClause()
   * @generated
   */
  EReference getInfoFlowClause_FromPortOrStateVar();

  /**
   * Returns the meta object for the reference list '{@link org.sireum.aadl.gumbo.gumbo.InfoFlowClause#getToPortOrStateVar <em>To Port Or State Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>To Port Or State Var</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.InfoFlowClause#getToPortOrStateVar()
   * @see #getInfoFlowClause()
   * @generated
   */
  EReference getInfoFlowClause_ToPortOrStateVar();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.HandlerClause <em>Handler Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Handler Clause</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.HandlerClause
   * @generated
   */
  EClass getHandlerClause();

  /**
   * Returns the meta object for the reference '{@link org.sireum.aadl.gumbo.gumbo.HandlerClause#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Id</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.HandlerClause#getId()
   * @see #getHandlerClause()
   * @generated
   */
  EReference getHandlerClause_Id();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.HandlerClause#getModifies <em>Modifies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Modifies</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.HandlerClause#getModifies()
   * @see #getHandlerClause()
   * @generated
   */
  EReference getHandlerClause_Modifies();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.HandlerClause#getAssumes <em>Assumes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assumes</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.HandlerClause#getAssumes()
   * @see #getHandlerClause()
   * @generated
   */
  EReference getHandlerClause_Assumes();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.HandlerClause#getGuarantees <em>Guarantees</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Guarantees</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.HandlerClause#getGuarantees()
   * @see #getHandlerClause()
   * @generated
   */
  EReference getHandlerClause_Guarantees();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.HandlerClause#getCases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cases</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.HandlerClause#getCases()
   * @see #getHandlerClause()
   * @generated
   */
  EReference getHandlerClause_Cases();

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
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.CaseStatementClause#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.CaseStatementClause#getId()
   * @see #getCaseStatementClause()
   * @generated
   */
  EAttribute getCaseStatementClause_Id();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.CaseStatementClause#getDescriptor <em>Descriptor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Descriptor</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.CaseStatementClause#getDescriptor()
   * @see #getCaseStatementClause()
   * @generated
   */
  EAttribute getCaseStatementClause_Descriptor();

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
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.SpecStatement#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SpecStatement#getId()
   * @see #getSpecStatement()
   * @generated
   */
  EAttribute getSpecStatement_Id();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.SpecStatement#getDescriptor <em>Descriptor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Descriptor</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SpecStatement#getDescriptor()
   * @see #getSpecStatement()
   * @generated
   */
  EAttribute getSpecStatement_Descriptor();

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
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangDefDef <em>Slang Def Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Def Def</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefDef
   * @generated
   */
  EClass getSlangDefDef();

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
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangDefDef#getTypeParams <em>Type Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Params</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefDef#getTypeParams()
   * @see #getSlangDefDef()
   * @generated
   */
  EReference getSlangDefDef_TypeParams();

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
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangDefDef#getMethodContract <em>Method Contract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Method Contract</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefDef#getMethodContract()
   * @see #getSlangDefDef()
   * @generated
   */
  EReference getSlangDefDef_MethodContract();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangDefDef#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefDef#getBody()
   * @see #getSlangDefDef()
   * @generated
   */
  EReference getSlangDefDef_Body();

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
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.SlangDefParam#isIsMethodDef <em>Is Method Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Method Def</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefParam#isIsMethodDef()
   * @see #getSlangDefParam()
   * @generated
   */
  EAttribute getSlangDefParam_IsMethodDef();

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
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.SlangDefParam#isIsVarArg <em>Is Var Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Var Arg</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefParam#isIsVarArg()
   * @see #getSlangDefParam()
   * @generated
   */
  EAttribute getSlangDefParam_IsVarArg();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangTypeParams <em>Slang Type Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Type Params</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangTypeParams
   * @generated
   */
  EClass getSlangTypeParams();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.SlangTypeParams#getTypeParam <em>Type Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type Param</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangTypeParams#getTypeParam()
   * @see #getSlangTypeParams()
   * @generated
   */
  EReference getSlangTypeParams_TypeParam();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.SlangTypeParam <em>Slang Type Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slang Type Param</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangTypeParam
   * @generated
   */
  EClass getSlangTypeParam();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.SlangTypeParam#isIsMut <em>Is Mut</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Mut</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangTypeParam#isIsMut()
   * @see #getSlangTypeParam()
   * @generated
   */
  EAttribute getSlangTypeParam_IsMut();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.SlangTypeParam#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangTypeParam#getName()
   * @see #getSlangTypeParam()
   * @generated
   */
  EAttribute getSlangTypeParam_Name();

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
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangDefContract#getReads <em>Reads</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Reads</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefContract#getReads()
   * @see #getSlangDefContract()
   * @generated
   */
  EReference getSlangDefContract_Reads();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangDefContract#getRequires <em>Requires</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Requires</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefContract#getRequires()
   * @see #getSlangDefContract()
   * @generated
   */
  EReference getSlangDefContract_Requires();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangDefContract#getModifies <em>Modifies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Modifies</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefContract#getModifies()
   * @see #getSlangDefContract()
   * @generated
   */
  EReference getSlangDefContract_Modifies();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangDefContract#getEnsures <em>Ensures</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ensures</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangDefContract#getEnsures()
   * @see #getSlangDefContract()
   * @generated
   */
  EReference getSlangDefContract_Ensures();

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
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangPattern#getTypeName <em>Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Name</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangPattern#getTypeName()
   * @see #getSlangPattern()
   * @generated
   */
  EReference getSlangPattern_TypeName();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.SlangPattern#getInit <em>Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Init</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.SlangPattern#getInit()
   * @see #getSlangPattern()
   * @generated
   */
  EReference getSlangPattern_Init();

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
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.OwnedExpression <em>Owned Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Owned Expression</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.OwnedExpression
   * @generated
   */
  EClass getOwnedExpression();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.GExpr <em>GExpr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>GExpr</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.GExpr
   * @generated
   */
  EClass getGExpr();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.QuantRange <em>Quant Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Quant Range</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.QuantRange
   * @generated
   */
  EClass getQuantRange();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.QuantRange#getLo <em>Lo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lo</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.QuantRange#getLo()
   * @see #getQuantRange()
   * @generated
   */
  EReference getQuantRange_Lo();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.QuantRange#getExtent <em>Extent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Extent</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.QuantRange#getExtent()
   * @see #getQuantRange()
   * @generated
   */
  EAttribute getQuantRange_Extent();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.QuantRange#getHigh <em>High</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>High</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.QuantRange#getHigh()
   * @see #getQuantRange()
   * @generated
   */
  EReference getQuantRange_High();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.QuantParam <em>Quant Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Quant Param</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.QuantParam
   * @generated
   */
  EClass getQuantParam();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.QuantParam#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.QuantParam#getName()
   * @see #getQuantParam()
   * @generated
   */
  EAttribute getQuantParam_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.QuantParam#getTypeName <em>Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Name</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.QuantParam#getTypeName()
   * @see #getQuantParam()
   * @generated
   */
  EReference getQuantParam_TypeName();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.Postfix <em>Postfix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Postfix</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.Postfix
   * @generated
   */
  EClass getPostfix();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.MemberAccess <em>Member Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Member Access</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.MemberAccess
   * @generated
   */
  EClass getMemberAccess();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.MemberAccess#getField <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.MemberAccess#getField()
   * @see #getMemberAccess()
   * @generated
   */
  EAttribute getMemberAccess_Field();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.ArrayAccess <em>Array Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Access</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.ArrayAccess
   * @generated
   */
  EClass getArrayAccess();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.ArrayAccess#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Index</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.ArrayAccess#getIndex()
   * @see #getArrayAccess()
   * @generated
   */
  EReference getArrayAccess_Index();

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
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.IfElseExp <em>If Else Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Else Exp</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.IfElseExp
   * @generated
   */
  EClass getIfElseExp();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.IfElseExp#getIfCond <em>If Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If Cond</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.IfElseExp#getIfCond()
   * @see #getIfElseExp()
   * @generated
   */
  EReference getIfElseExp_IfCond();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.IfElseExp#getThenExpr <em>Then Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then Expr</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.IfElseExp#getThenExpr()
   * @see #getIfElseExp()
   * @generated
   */
  EReference getIfElseExp_ThenExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.IfElseExp#getElseExpr <em>Else Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else Expr</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.IfElseExp#getElseExpr()
   * @see #getIfElseExp()
   * @generated
   */
  EReference getIfElseExp_ElseExpr();

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
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.QuantifiedExp#getQuantifier <em>Quantifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Quantifier</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.QuantifiedExp#getQuantifier()
   * @see #getQuantifiedExp()
   * @generated
   */
  EAttribute getQuantifiedExp_Quantifier();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.QuantifiedExp#getQuantRange <em>Quant Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quant Range</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.QuantifiedExp#getQuantRange()
   * @see #getQuantifiedExp()
   * @generated
   */
  EReference getQuantifiedExp_QuantRange();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.QuantifiedExp#getQuantParam <em>Quant Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quant Param</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.QuantifiedExp#getQuantParam()
   * @see #getQuantifiedExp()
   * @generated
   */
  EReference getQuantifiedExp_QuantParam();

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
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.ImpliesExpr <em>Implies Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Implies Expr</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.ImpliesExpr
   * @generated
   */
  EClass getImpliesExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.ImpliesExpr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.ImpliesExpr#getLeft()
   * @see #getImpliesExpr()
   * @generated
   */
  EReference getImpliesExpr_Left();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.ImpliesExpr#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.ImpliesExpr#getOp()
   * @see #getImpliesExpr()
   * @generated
   */
  EAttribute getImpliesExpr_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.ImpliesExpr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.ImpliesExpr#getRight()
   * @see #getImpliesExpr()
   * @generated
   */
  EReference getImpliesExpr_Right();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.OrExpr <em>Or Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Expr</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.OrExpr
   * @generated
   */
  EClass getOrExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.OrExpr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.OrExpr#getLeft()
   * @see #getOrExpr()
   * @generated
   */
  EReference getOrExpr_Left();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.OrExpr#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.OrExpr#getOp()
   * @see #getOrExpr()
   * @generated
   */
  EAttribute getOrExpr_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.OrExpr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.OrExpr#getRight()
   * @see #getOrExpr()
   * @generated
   */
  EReference getOrExpr_Right();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.AndExpr <em>And Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Expr</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.AndExpr
   * @generated
   */
  EClass getAndExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.AndExpr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.AndExpr#getLeft()
   * @see #getAndExpr()
   * @generated
   */
  EReference getAndExpr_Left();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.AndExpr#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.AndExpr#getOp()
   * @see #getAndExpr()
   * @generated
   */
  EAttribute getAndExpr_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.AndExpr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.AndExpr#getRight()
   * @see #getAndExpr()
   * @generated
   */
  EReference getAndExpr_Right();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.EqualNotExpr <em>Equal Not Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equal Not Expr</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.EqualNotExpr
   * @generated
   */
  EClass getEqualNotExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.EqualNotExpr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.EqualNotExpr#getLeft()
   * @see #getEqualNotExpr()
   * @generated
   */
  EReference getEqualNotExpr_Left();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.EqualNotExpr#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.EqualNotExpr#getOp()
   * @see #getEqualNotExpr()
   * @generated
   */
  EAttribute getEqualNotExpr_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.EqualNotExpr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.EqualNotExpr#getRight()
   * @see #getEqualNotExpr()
   * @generated
   */
  EReference getEqualNotExpr_Right();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.LtGtExpr <em>Lt Gt Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lt Gt Expr</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.LtGtExpr
   * @generated
   */
  EClass getLtGtExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.LtGtExpr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.LtGtExpr#getLeft()
   * @see #getLtGtExpr()
   * @generated
   */
  EReference getLtGtExpr_Left();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.LtGtExpr#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.LtGtExpr#getOp()
   * @see #getLtGtExpr()
   * @generated
   */
  EAttribute getLtGtExpr_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.LtGtExpr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.LtGtExpr#getRight()
   * @see #getLtGtExpr()
   * @generated
   */
  EReference getLtGtExpr_Right();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.ColonExpr <em>Colon Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Colon Expr</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.ColonExpr
   * @generated
   */
  EClass getColonExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.ColonExpr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.ColonExpr#getLeft()
   * @see #getColonExpr()
   * @generated
   */
  EReference getColonExpr_Left();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.ColonExpr#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.ColonExpr#getOp()
   * @see #getColonExpr()
   * @generated
   */
  EAttribute getColonExpr_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.ColonExpr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.ColonExpr#getRight()
   * @see #getColonExpr()
   * @generated
   */
  EReference getColonExpr_Right();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.PlusMinusExpr <em>Plus Minus Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plus Minus Expr</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.PlusMinusExpr
   * @generated
   */
  EClass getPlusMinusExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.PlusMinusExpr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.PlusMinusExpr#getLeft()
   * @see #getPlusMinusExpr()
   * @generated
   */
  EReference getPlusMinusExpr_Left();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.PlusMinusExpr#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.PlusMinusExpr#getOp()
   * @see #getPlusMinusExpr()
   * @generated
   */
  EAttribute getPlusMinusExpr_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.PlusMinusExpr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.PlusMinusExpr#getRight()
   * @see #getPlusMinusExpr()
   * @generated
   */
  EReference getPlusMinusExpr_Right();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.MultiplicativeExpr <em>Multiplicative Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplicative Expr</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.MultiplicativeExpr
   * @generated
   */
  EClass getMultiplicativeExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.MultiplicativeExpr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.MultiplicativeExpr#getLeft()
   * @see #getMultiplicativeExpr()
   * @generated
   */
  EReference getMultiplicativeExpr_Left();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.MultiplicativeExpr#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.MultiplicativeExpr#getOp()
   * @see #getMultiplicativeExpr()
   * @generated
   */
  EAttribute getMultiplicativeExpr_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.MultiplicativeExpr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.MultiplicativeExpr#getRight()
   * @see #getMultiplicativeExpr()
   * @generated
   */
  EReference getMultiplicativeExpr_Right();

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
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.UnaryExpr#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.UnaryExpr#getExp()
   * @see #getUnaryExpr()
   * @generated
   */
  EReference getUnaryExpr_Exp();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.PostFixExpr <em>Post Fix Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Post Fix Expr</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.PostFixExpr
   * @generated
   */
  EClass getPostFixExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.PostFixExpr#getBaseExp <em>Base Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Base Exp</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.PostFixExpr#getBaseExp()
   * @see #getPostFixExpr()
   * @generated
   */
  EReference getPostFixExpr_BaseExp();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.PostFixExpr#getPosts <em>Posts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Posts</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.PostFixExpr#getPosts()
   * @see #getPostFixExpr()
   * @generated
   */
  EReference getPostFixExpr_Posts();

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
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.InStateExpr <em>In State Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>In State Expr</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.InStateExpr
   * @generated
   */
  EClass getInStateExpr();

  /**
   * Returns the meta object for the reference '{@link org.sireum.aadl.gumbo.gumbo.InStateExpr#getStateVar <em>State Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>State Var</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.InStateExpr#getStateVar()
   * @see #getInStateExpr()
   * @generated
   */
  EReference getInStateExpr_StateVar();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.MaySendExpr <em>May Send Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>May Send Expr</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.MaySendExpr
   * @generated
   */
  EClass getMaySendExpr();

  /**
   * Returns the meta object for the reference '{@link org.sireum.aadl.gumbo.gumbo.MaySendExpr#getEventPort <em>Event Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Event Port</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.MaySendExpr#getEventPort()
   * @see #getMaySendExpr()
   * @generated
   */
  EReference getMaySendExpr_EventPort();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.MaySendExpr#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.MaySendExpr#getValue()
   * @see #getMaySendExpr()
   * @generated
   */
  EReference getMaySendExpr_Value();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.MustSendExpr <em>Must Send Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Must Send Expr</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.MustSendExpr
   * @generated
   */
  EClass getMustSendExpr();

  /**
   * Returns the meta object for the reference '{@link org.sireum.aadl.gumbo.gumbo.MustSendExpr#getEventPort <em>Event Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Event Port</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.MustSendExpr#getEventPort()
   * @see #getMustSendExpr()
   * @generated
   */
  EReference getMustSendExpr_EventPort();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.MustSendExpr#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.MustSendExpr#getValue()
   * @see #getMustSendExpr()
   * @generated
   */
  EReference getMustSendExpr_Value();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.NoSendExpr <em>No Send Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Send Expr</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.NoSendExpr
   * @generated
   */
  EClass getNoSendExpr();

  /**
   * Returns the meta object for the reference '{@link org.sireum.aadl.gumbo.gumbo.NoSendExpr#getEventPort <em>Event Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Event Port</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.NoSendExpr#getEventPort()
   * @see #getNoSendExpr()
   * @generated
   */
  EReference getNoSendExpr_EventPort();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.HasEventExpr <em>Has Event Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Has Event Expr</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.HasEventExpr
   * @generated
   */
  EClass getHasEventExpr();

  /**
   * Returns the meta object for the reference '{@link org.sireum.aadl.gumbo.gumbo.HasEventExpr#getEventPort <em>Event Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Event Port</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.HasEventExpr#getEventPort()
   * @see #getHasEventExpr()
   * @generated
   */
  EReference getHasEventExpr_EventPort();

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
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.ParenExpr <em>Paren Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Paren Expr</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.ParenExpr
   * @generated
   */
  EClass getParenExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.ParenExpr#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.ParenExpr#getExp()
   * @see #getParenExpr()
   * @generated
   */
  EReference getParenExpr_Exp();

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
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.F32Obj <em>F32 Obj</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>F32 Obj</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.F32Obj
   * @generated
   */
  EClass getF32Obj();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.F32Obj#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attr</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.F32Obj#getAttr()
   * @see #getF32Obj()
   * @generated
   */
  EAttribute getF32Obj_Attr();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.F64Obj <em>F64 Obj</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>F64 Obj</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.F64Obj
   * @generated
   */
  EClass getF64Obj();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.F64Obj#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attr</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.F64Obj#getAttr()
   * @see #getF64Obj()
   * @generated
   */
  EAttribute getF64Obj_Attr();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.CallExpr <em>Call Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Call Expr</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.CallExpr
   * @generated
   */
  EClass getCallExpr();

  /**
   * Returns the meta object for the reference '{@link org.sireum.aadl.gumbo.gumbo.CallExpr#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Id</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.CallExpr#getId()
   * @see #getCallExpr()
   * @generated
   */
  EReference getCallExpr_Id();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.CallExpr#getCallSuffix <em>Call Suffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Call Suffix</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.CallExpr#getCallSuffix()
   * @see #getCallExpr()
   * @generated
   */
  EReference getCallExpr_CallSuffix();

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
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.ResultExpr <em>Result Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Result Expr</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.ResultExpr
   * @generated
   */
  EClass getResultExpr();

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
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.F32Lit <em>F32 Lit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>F32 Lit</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.F32Lit
   * @generated
   */
  EClass getF32Lit();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.F64Lit <em>F64 Lit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>F64 Lit</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.F64Lit
   * @generated
   */
  EClass getF64Lit();

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
     * The meta object literal for the '<em><b>Functions</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GUMBO_LIBRARY__FUNCTIONS = eINSTANCE.getGumboLibrary_Functions();

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
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INV_SPEC__ID = eINSTANCE.getInvSpec_Id();

    /**
     * The meta object literal for the '<em><b>Descriptor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INV_SPEC__DESCRIPTOR = eINSTANCE.getInvSpec_Descriptor();

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
     * The meta object literal for the '<em><b>Flows</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INITIALIZE__FLOWS = eINSTANCE.getInitialize_Flows();

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
     * The meta object literal for the '<em><b>Assumes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPUTE__ASSUMES = eINSTANCE.getCompute_Assumes();

    /**
     * The meta object literal for the '<em><b>Guarantees</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPUTE__GUARANTEES = eINSTANCE.getCompute_Guarantees();

    /**
     * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPUTE__CASES = eINSTANCE.getCompute_Cases();

    /**
     * The meta object literal for the '<em><b>Handlers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPUTE__HANDLERS = eINSTANCE.getCompute_Handlers();

    /**
     * The meta object literal for the '<em><b>Flows</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPUTE__FLOWS = eINSTANCE.getCompute_Flows();

    /**
     * The meta object literal for the '<em><b>Gumbo Tables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPUTE__GUMBO_TABLES = eINSTANCE.getCompute_GumboTables();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.GumboTableImpl <em>Table</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboTableImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getGumboTable()
     * @generated
     */
    EClass GUMBO_TABLE = eINSTANCE.getGumboTable();

    /**
     * The meta object literal for the '<em><b>Table</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GUMBO_TABLE__TABLE = eINSTANCE.getGumboTable_Table();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.NormalTableImpl <em>Normal Table</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.NormalTableImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getNormalTable()
     * @generated
     */
    EClass NORMAL_TABLE = eINSTANCE.getNormalTable();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NORMAL_TABLE__ID = eINSTANCE.getNormalTable_Id();

    /**
     * The meta object literal for the '<em><b>Descriptor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NORMAL_TABLE__DESCRIPTOR = eINSTANCE.getNormalTable_Descriptor();

    /**
     * The meta object literal for the '<em><b>Horizontal Predicates</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NORMAL_TABLE__HORIZONTAL_PREDICATES = eINSTANCE.getNormalTable_HorizontalPredicates();

    /**
     * The meta object literal for the '<em><b>Vertical Predicates</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NORMAL_TABLE__VERTICAL_PREDICATES = eINSTANCE.getNormalTable_VerticalPredicates();

    /**
     * The meta object literal for the '<em><b>Result Rows</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NORMAL_TABLE__RESULT_ROWS = eINSTANCE.getNormalTable_ResultRows();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.ResultRowImpl <em>Result Row</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.ResultRowImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getResultRow()
     * @generated
     */
    EClass RESULT_ROW = eINSTANCE.getResultRow();

    /**
     * The meta object literal for the '<em><b>Results</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESULT_ROW__RESULTS = eINSTANCE.getResultRow_Results();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.InfoFlowClauseImpl <em>Info Flow Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.InfoFlowClauseImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getInfoFlowClause()
     * @generated
     */
    EClass INFO_FLOW_CLAUSE = eINSTANCE.getInfoFlowClause();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INFO_FLOW_CLAUSE__ID = eINSTANCE.getInfoFlowClause_Id();

    /**
     * The meta object literal for the '<em><b>Descriptor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INFO_FLOW_CLAUSE__DESCRIPTOR = eINSTANCE.getInfoFlowClause_Descriptor();

    /**
     * The meta object literal for the '<em><b>From Port Or State Var</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INFO_FLOW_CLAUSE__FROM_PORT_OR_STATE_VAR = eINSTANCE.getInfoFlowClause_FromPortOrStateVar();

    /**
     * The meta object literal for the '<em><b>To Port Or State Var</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INFO_FLOW_CLAUSE__TO_PORT_OR_STATE_VAR = eINSTANCE.getInfoFlowClause_ToPortOrStateVar();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.HandlerClauseImpl <em>Handler Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.HandlerClauseImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getHandlerClause()
     * @generated
     */
    EClass HANDLER_CLAUSE = eINSTANCE.getHandlerClause();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HANDLER_CLAUSE__ID = eINSTANCE.getHandlerClause_Id();

    /**
     * The meta object literal for the '<em><b>Modifies</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HANDLER_CLAUSE__MODIFIES = eINSTANCE.getHandlerClause_Modifies();

    /**
     * The meta object literal for the '<em><b>Assumes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HANDLER_CLAUSE__ASSUMES = eINSTANCE.getHandlerClause_Assumes();

    /**
     * The meta object literal for the '<em><b>Guarantees</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HANDLER_CLAUSE__GUARANTEES = eINSTANCE.getHandlerClause_Guarantees();

    /**
     * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HANDLER_CLAUSE__CASES = eINSTANCE.getHandlerClause_Cases();

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
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CASE_STATEMENT_CLAUSE__ID = eINSTANCE.getCaseStatementClause_Id();

    /**
     * The meta object literal for the '<em><b>Descriptor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CASE_STATEMENT_CLAUSE__DESCRIPTOR = eINSTANCE.getCaseStatementClause_Descriptor();

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
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPEC_STATEMENT__ID = eINSTANCE.getSpecStatement_Id();

    /**
     * The meta object literal for the '<em><b>Descriptor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPEC_STATEMENT__DESCRIPTOR = eINSTANCE.getSpecStatement_Descriptor();

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
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangDefDefImpl <em>Slang Def Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangDefDefImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangDefDef()
     * @generated
     */
    EClass SLANG_DEF_DEF = eINSTANCE.getSlangDefDef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLANG_DEF_DEF__NAME = eINSTANCE.getSlangDefDef_Name();

    /**
     * The meta object literal for the '<em><b>Type Params</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_DEF_DEF__TYPE_PARAMS = eINSTANCE.getSlangDefDef_TypeParams();

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
     * The meta object literal for the '<em><b>Method Contract</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_DEF_DEF__METHOD_CONTRACT = eINSTANCE.getSlangDefDef_MethodContract();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_DEF_DEF__BODY = eINSTANCE.getSlangDefDef_Body();

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
     * The meta object literal for the '<em><b>Is Method Def</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLANG_DEF_PARAM__IS_METHOD_DEF = eINSTANCE.getSlangDefParam_IsMethodDef();

    /**
     * The meta object literal for the '<em><b>Type Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_DEF_PARAM__TYPE_NAME = eINSTANCE.getSlangDefParam_TypeName();

    /**
     * The meta object literal for the '<em><b>Is Var Arg</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLANG_DEF_PARAM__IS_VAR_ARG = eINSTANCE.getSlangDefParam_IsVarArg();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangTypeParamsImpl <em>Slang Type Params</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangTypeParamsImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangTypeParams()
     * @generated
     */
    EClass SLANG_TYPE_PARAMS = eINSTANCE.getSlangTypeParams();

    /**
     * The meta object literal for the '<em><b>Type Param</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_TYPE_PARAMS__TYPE_PARAM = eINSTANCE.getSlangTypeParams_TypeParam();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SlangTypeParamImpl <em>Slang Type Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.SlangTypeParamImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSlangTypeParam()
     * @generated
     */
    EClass SLANG_TYPE_PARAM = eINSTANCE.getSlangTypeParam();

    /**
     * The meta object literal for the '<em><b>Is Mut</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLANG_TYPE_PARAM__IS_MUT = eINSTANCE.getSlangTypeParam_IsMut();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLANG_TYPE_PARAM__NAME = eINSTANCE.getSlangTypeParam_Name();

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
     * The meta object literal for the '<em><b>Reads</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_DEF_CONTRACT__READS = eINSTANCE.getSlangDefContract_Reads();

    /**
     * The meta object literal for the '<em><b>Requires</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_DEF_CONTRACT__REQUIRES = eINSTANCE.getSlangDefContract_Requires();

    /**
     * The meta object literal for the '<em><b>Modifies</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_DEF_CONTRACT__MODIFIES = eINSTANCE.getSlangDefContract_Modifies();

    /**
     * The meta object literal for the '<em><b>Ensures</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_DEF_CONTRACT__ENSURES = eINSTANCE.getSlangDefContract_Ensures();

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
     * The meta object literal for the '<em><b>Type Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_PATTERN__TYPE_NAME = eINSTANCE.getSlangPattern_TypeName();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLANG_PATTERN__INIT = eINSTANCE.getSlangPattern_Init();

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
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.OwnedExpressionImpl <em>Owned Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.OwnedExpressionImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getOwnedExpression()
     * @generated
     */
    EClass OWNED_EXPRESSION = eINSTANCE.getOwnedExpression();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.GExprImpl <em>GExpr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.GExprImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getGExpr()
     * @generated
     */
    EClass GEXPR = eINSTANCE.getGExpr();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.QuantRangeImpl <em>Quant Range</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.QuantRangeImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getQuantRange()
     * @generated
     */
    EClass QUANT_RANGE = eINSTANCE.getQuantRange();

    /**
     * The meta object literal for the '<em><b>Lo</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUANT_RANGE__LO = eINSTANCE.getQuantRange_Lo();

    /**
     * The meta object literal for the '<em><b>Extent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUANT_RANGE__EXTENT = eINSTANCE.getQuantRange_Extent();

    /**
     * The meta object literal for the '<em><b>High</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUANT_RANGE__HIGH = eINSTANCE.getQuantRange_High();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.QuantParamImpl <em>Quant Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.QuantParamImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getQuantParam()
     * @generated
     */
    EClass QUANT_PARAM = eINSTANCE.getQuantParam();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUANT_PARAM__NAME = eINSTANCE.getQuantParam_Name();

    /**
     * The meta object literal for the '<em><b>Type Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUANT_PARAM__TYPE_NAME = eINSTANCE.getQuantParam_TypeName();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.PostfixImpl <em>Postfix</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.PostfixImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getPostfix()
     * @generated
     */
    EClass POSTFIX = eINSTANCE.getPostfix();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.MemberAccessImpl <em>Member Access</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.MemberAccessImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getMemberAccess()
     * @generated
     */
    EClass MEMBER_ACCESS = eINSTANCE.getMemberAccess();

    /**
     * The meta object literal for the '<em><b>Field</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEMBER_ACCESS__FIELD = eINSTANCE.getMemberAccess_Field();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.ArrayAccessImpl <em>Array Access</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.ArrayAccessImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getArrayAccess()
     * @generated
     */
    EClass ARRAY_ACCESS = eINSTANCE.getArrayAccess();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_ACCESS__INDEX = eINSTANCE.getArrayAccess_Index();

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
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.IfElseExpImpl <em>If Else Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.IfElseExpImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getIfElseExp()
     * @generated
     */
    EClass IF_ELSE_EXP = eINSTANCE.getIfElseExp();

    /**
     * The meta object literal for the '<em><b>If Cond</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_ELSE_EXP__IF_COND = eINSTANCE.getIfElseExp_IfCond();

    /**
     * The meta object literal for the '<em><b>Then Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_ELSE_EXP__THEN_EXPR = eINSTANCE.getIfElseExp_ThenExpr();

    /**
     * The meta object literal for the '<em><b>Else Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_ELSE_EXP__ELSE_EXPR = eINSTANCE.getIfElseExp_ElseExpr();

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
     * The meta object literal for the '<em><b>Quantifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUANTIFIED_EXP__QUANTIFIER = eINSTANCE.getQuantifiedExp_Quantifier();

    /**
     * The meta object literal for the '<em><b>Quant Range</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUANTIFIED_EXP__QUANT_RANGE = eINSTANCE.getQuantifiedExp_QuantRange();

    /**
     * The meta object literal for the '<em><b>Quant Param</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUANTIFIED_EXP__QUANT_PARAM = eINSTANCE.getQuantifiedExp_QuantParam();

    /**
     * The meta object literal for the '<em><b>Quantified Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUANTIFIED_EXP__QUANTIFIED_EXPR = eINSTANCE.getQuantifiedExp_QuantifiedExpr();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.ImpliesExprImpl <em>Implies Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.ImpliesExprImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getImpliesExpr()
     * @generated
     */
    EClass IMPLIES_EXPR = eINSTANCE.getImpliesExpr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPLIES_EXPR__LEFT = eINSTANCE.getImpliesExpr_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPLIES_EXPR__OP = eINSTANCE.getImpliesExpr_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPLIES_EXPR__RIGHT = eINSTANCE.getImpliesExpr_Right();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.OrExprImpl <em>Or Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.OrExprImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getOrExpr()
     * @generated
     */
    EClass OR_EXPR = eINSTANCE.getOrExpr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_EXPR__LEFT = eINSTANCE.getOrExpr_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OR_EXPR__OP = eINSTANCE.getOrExpr_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_EXPR__RIGHT = eINSTANCE.getOrExpr_Right();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.AndExprImpl <em>And Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.AndExprImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getAndExpr()
     * @generated
     */
    EClass AND_EXPR = eINSTANCE.getAndExpr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_EXPR__LEFT = eINSTANCE.getAndExpr_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AND_EXPR__OP = eINSTANCE.getAndExpr_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_EXPR__RIGHT = eINSTANCE.getAndExpr_Right();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.EqualNotExprImpl <em>Equal Not Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.EqualNotExprImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getEqualNotExpr()
     * @generated
     */
    EClass EQUAL_NOT_EXPR = eINSTANCE.getEqualNotExpr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUAL_NOT_EXPR__LEFT = eINSTANCE.getEqualNotExpr_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EQUAL_NOT_EXPR__OP = eINSTANCE.getEqualNotExpr_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUAL_NOT_EXPR__RIGHT = eINSTANCE.getEqualNotExpr_Right();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.LtGtExprImpl <em>Lt Gt Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.LtGtExprImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getLtGtExpr()
     * @generated
     */
    EClass LT_GT_EXPR = eINSTANCE.getLtGtExpr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LT_GT_EXPR__LEFT = eINSTANCE.getLtGtExpr_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LT_GT_EXPR__OP = eINSTANCE.getLtGtExpr_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LT_GT_EXPR__RIGHT = eINSTANCE.getLtGtExpr_Right();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.ColonExprImpl <em>Colon Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.ColonExprImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getColonExpr()
     * @generated
     */
    EClass COLON_EXPR = eINSTANCE.getColonExpr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLON_EXPR__LEFT = eINSTANCE.getColonExpr_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLON_EXPR__OP = eINSTANCE.getColonExpr_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLON_EXPR__RIGHT = eINSTANCE.getColonExpr_Right();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.PlusMinusExprImpl <em>Plus Minus Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.PlusMinusExprImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getPlusMinusExpr()
     * @generated
     */
    EClass PLUS_MINUS_EXPR = eINSTANCE.getPlusMinusExpr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS_MINUS_EXPR__LEFT = eINSTANCE.getPlusMinusExpr_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLUS_MINUS_EXPR__OP = eINSTANCE.getPlusMinusExpr_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS_MINUS_EXPR__RIGHT = eINSTANCE.getPlusMinusExpr_Right();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.MultiplicativeExprImpl <em>Multiplicative Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.MultiplicativeExprImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getMultiplicativeExpr()
     * @generated
     */
    EClass MULTIPLICATIVE_EXPR = eINSTANCE.getMultiplicativeExpr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICATIVE_EXPR__LEFT = eINSTANCE.getMultiplicativeExpr_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTIPLICATIVE_EXPR__OP = eINSTANCE.getMultiplicativeExpr_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICATIVE_EXPR__RIGHT = eINSTANCE.getMultiplicativeExpr_Right();

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
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_EXPR__EXP = eINSTANCE.getUnaryExpr_Exp();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.PostFixExprImpl <em>Post Fix Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.PostFixExprImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getPostFixExpr()
     * @generated
     */
    EClass POST_FIX_EXPR = eINSTANCE.getPostFixExpr();

    /**
     * The meta object literal for the '<em><b>Base Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POST_FIX_EXPR__BASE_EXP = eINSTANCE.getPostFixExpr_BaseExp();

    /**
     * The meta object literal for the '<em><b>Posts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POST_FIX_EXPR__POSTS = eINSTANCE.getPostFixExpr_Posts();

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
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.InStateExprImpl <em>In State Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.InStateExprImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getInStateExpr()
     * @generated
     */
    EClass IN_STATE_EXPR = eINSTANCE.getInStateExpr();

    /**
     * The meta object literal for the '<em><b>State Var</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IN_STATE_EXPR__STATE_VAR = eINSTANCE.getInStateExpr_StateVar();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.MaySendExprImpl <em>May Send Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.MaySendExprImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getMaySendExpr()
     * @generated
     */
    EClass MAY_SEND_EXPR = eINSTANCE.getMaySendExpr();

    /**
     * The meta object literal for the '<em><b>Event Port</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAY_SEND_EXPR__EVENT_PORT = eINSTANCE.getMaySendExpr_EventPort();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAY_SEND_EXPR__VALUE = eINSTANCE.getMaySendExpr_Value();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.MustSendExprImpl <em>Must Send Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.MustSendExprImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getMustSendExpr()
     * @generated
     */
    EClass MUST_SEND_EXPR = eINSTANCE.getMustSendExpr();

    /**
     * The meta object literal for the '<em><b>Event Port</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MUST_SEND_EXPR__EVENT_PORT = eINSTANCE.getMustSendExpr_EventPort();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MUST_SEND_EXPR__VALUE = eINSTANCE.getMustSendExpr_Value();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.NoSendExprImpl <em>No Send Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.NoSendExprImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getNoSendExpr()
     * @generated
     */
    EClass NO_SEND_EXPR = eINSTANCE.getNoSendExpr();

    /**
     * The meta object literal for the '<em><b>Event Port</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NO_SEND_EXPR__EVENT_PORT = eINSTANCE.getNoSendExpr_EventPort();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.HasEventExprImpl <em>Has Event Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.HasEventExprImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getHasEventExpr()
     * @generated
     */
    EClass HAS_EVENT_EXPR = eINSTANCE.getHasEventExpr();

    /**
     * The meta object literal for the '<em><b>Event Port</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HAS_EVENT_EXPR__EVENT_PORT = eINSTANCE.getHasEventExpr_EventPort();

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
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.ParenExprImpl <em>Paren Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.ParenExprImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getParenExpr()
     * @generated
     */
    EClass PAREN_EXPR = eINSTANCE.getParenExpr();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAREN_EXPR__EXP = eINSTANCE.getParenExpr_Exp();

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
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.F32ObjImpl <em>F32 Obj</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.F32ObjImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getF32Obj()
     * @generated
     */
    EClass F32_OBJ = eINSTANCE.getF32Obj();

    /**
     * The meta object literal for the '<em><b>Attr</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute F32_OBJ__ATTR = eINSTANCE.getF32Obj_Attr();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.F64ObjImpl <em>F64 Obj</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.F64ObjImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getF64Obj()
     * @generated
     */
    EClass F64_OBJ = eINSTANCE.getF64Obj();

    /**
     * The meta object literal for the '<em><b>Attr</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute F64_OBJ__ATTR = eINSTANCE.getF64Obj_Attr();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.CallExprImpl <em>Call Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.CallExprImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getCallExpr()
     * @generated
     */
    EClass CALL_EXPR = eINSTANCE.getCallExpr();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALL_EXPR__ID = eINSTANCE.getCallExpr_Id();

    /**
     * The meta object literal for the '<em><b>Call Suffix</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALL_EXPR__CALL_SUFFIX = eINSTANCE.getCallExpr_CallSuffix();

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
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.ResultExprImpl <em>Result Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.ResultExprImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getResultExpr()
     * @generated
     */
    EClass RESULT_EXPR = eINSTANCE.getResultExpr();

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
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.F32LitImpl <em>F32 Lit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.F32LitImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getF32Lit()
     * @generated
     */
    EClass F32_LIT = eINSTANCE.getF32Lit();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.F64LitImpl <em>F64 Lit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.F64LitImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getF64Lit()
     * @generated
     */
    EClass F64_LIT = eINSTANCE.getF64Lit();

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

  }

} //GumboPackage
