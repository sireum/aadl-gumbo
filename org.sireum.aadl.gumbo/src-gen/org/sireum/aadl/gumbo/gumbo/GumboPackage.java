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
   * The feature id for the '<em><b>Specs</b></em>' containment reference list.
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
   * The number of structural features of the '<em>Spec Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC_SECTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.ComputationalModelImpl <em>Computational Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.ComputationalModelImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getComputationalModel()
   * @generated
   */
  int COMPUTATIONAL_MODEL = 3;

  /**
   * The number of structural features of the '<em>Computational Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPUTATIONAL_MODEL_FEATURE_COUNT = SPEC_SECTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.FlowsImpl <em>Flows</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.FlowsImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getFlows()
   * @generated
   */
  int FLOWS = 4;

  /**
   * The feature id for the '<em><b>Flows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOWS__FLOWS = SPEC_SECTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Flows</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOWS_FEATURE_COUNT = SPEC_SECTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.FlowImpl <em>Flow</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.FlowImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getFlow()
   * @generated
   */
  int FLOW = 5;

  /**
   * The feature id for the '<em><b>Flow Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW__FLOW_ID = 0;

  /**
   * The feature id for the '<em><b>Src Ports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW__SRC_PORTS = 1;

  /**
   * The feature id for the '<em><b>Dst Ports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW__DST_PORTS = 2;

  /**
   * The number of structural features of the '<em>Flow</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.ContractImpl <em>Contract</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.ContractImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getContract()
   * @generated
   */
  int CONTRACT = 6;

  /**
   * The feature id for the '<em><b>Specs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACT__SPECS = SPEC_SECTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Contract</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACT_FEATURE_COUNT = SPEC_SECTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SpecStatementImpl <em>Spec Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SpecStatementImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSpecStatement()
   * @generated
   */
  int SPEC_STATEMENT = 7;

  /**
   * The number of structural features of the '<em>Spec Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC_STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.ExprImpl <em>Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.ExprImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getExpr()
   * @generated
   */
  int EXPR = 8;

  /**
   * The number of structural features of the '<em>Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.SubcomponentElementImpl <em>Subcomponent Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.SubcomponentElementImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getSubcomponentElement()
   * @generated
   */
  int SUBCOMPONENT_ELEMENT = 9;

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
  int FEATURE_ELEMENT = 10;

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
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.PeriodicComputationalModelImpl <em>Periodic Computational Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.PeriodicComputationalModelImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getPeriodicComputationalModel()
   * @generated
   */
  int PERIODIC_COMPUTATIONAL_MODEL = 11;

  /**
   * The number of structural features of the '<em>Periodic Computational Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERIODIC_COMPUTATIONAL_MODEL_FEATURE_COUNT = COMPUTATIONAL_MODEL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.HyperperiodComputationalModelImpl <em>Hyperperiod Computational Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.HyperperiodComputationalModelImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getHyperperiodComputationalModel()
   * @generated
   */
  int HYPERPERIOD_COMPUTATIONAL_MODEL = 12;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPERPERIOD_COMPUTATIONAL_MODEL__CONSTRAINTS = COMPUTATIONAL_MODEL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Hyperperiod Computational Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPERPERIOD_COMPUTATIONAL_MODEL_FEATURE_COUNT = COMPUTATIONAL_MODEL_FEATURE_COUNT + 1;

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
   * The feature id for the '<em><b>For Port</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSUME_STATEMENT__FOR_PORT = SPEC_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Assume Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSUME_STATEMENT__ASSUME_TITLE = SPEC_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Pred</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSUME_STATEMENT__PRED = SPEC_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Traces To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSUME_STATEMENT__TRACES_TO = SPEC_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Assume Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSUME_STATEMENT_FEATURE_COUNT = SPEC_STATEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.GuaranteeStatementImpl <em>Guarantee Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.GuaranteeStatementImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getGuaranteeStatement()
   * @generated
   */
  int GUARANTEE_STATEMENT = 14;

  /**
   * The feature id for the '<em><b>Guarantee Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARANTEE_STATEMENT__GUARANTEE_TITLE = SPEC_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARANTEE_STATEMENT__EXPR = SPEC_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Guarantee Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARANTEE_STATEMENT_FEATURE_COUNT = SPEC_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.BinaryExprImpl <em>Binary Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.BinaryExprImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getBinaryExpr()
   * @generated
   */
  int BINARY_EXPR = 15;

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
  int UNARY_EXPR = 16;

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
   * The meta object id for the '{@link org.sireum.aadl.gumbo.gumbo.impl.IdExprImpl <em>Id Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.gumbo.gumbo.impl.IdExprImpl
   * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getIdExpr()
   * @generated
   */
  int ID_EXPR = 17;

  /**
   * The feature id for the '<em><b>Id</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_EXPR__ID = EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Id Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;


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
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.GumboSubclause#getSpecs <em>Specs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Specs</em>'.
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
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.ComputationalModel <em>Computational Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Computational Model</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.ComputationalModel
   * @generated
   */
  EClass getComputationalModel();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.Flows <em>Flows</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Flows</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.Flows
   * @generated
   */
  EClass getFlows();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.Flows#getFlows <em>Flows</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Flows</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.Flows#getFlows()
   * @see #getFlows()
   * @generated
   */
  EReference getFlows_Flows();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.Flow <em>Flow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Flow</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.Flow
   * @generated
   */
  EClass getFlow();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.Flow#getFlowId <em>Flow Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Flow Id</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.Flow#getFlowId()
   * @see #getFlow()
   * @generated
   */
  EAttribute getFlow_FlowId();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.Flow#getSrcPorts <em>Src Ports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Src Ports</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.Flow#getSrcPorts()
   * @see #getFlow()
   * @generated
   */
  EReference getFlow_SrcPorts();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.Flow#getDstPorts <em>Dst Ports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dst Ports</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.Flow#getDstPorts()
   * @see #getFlow()
   * @generated
   */
  EReference getFlow_DstPorts();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.Contract <em>Contract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Contract</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.Contract
   * @generated
   */
  EClass getContract();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.gumbo.gumbo.Contract#getSpecs <em>Specs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Specs</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.Contract#getSpecs()
   * @see #getContract()
   * @generated
   */
  EReference getContract_Specs();

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
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.Expr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.Expr
   * @generated
   */
  EClass getExpr();

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
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.PeriodicComputationalModel <em>Periodic Computational Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Periodic Computational Model</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.PeriodicComputationalModel
   * @generated
   */
  EClass getPeriodicComputationalModel();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.HyperperiodComputationalModel <em>Hyperperiod Computational Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hyperperiod Computational Model</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.HyperperiodComputationalModel
   * @generated
   */
  EClass getHyperperiodComputationalModel();

  /**
   * Returns the meta object for the reference list '{@link org.sireum.aadl.gumbo.gumbo.HyperperiodComputationalModel#getConstraints <em>Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Constraints</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.HyperperiodComputationalModel#getConstraints()
   * @see #getHyperperiodComputationalModel()
   * @generated
   */
  EReference getHyperperiodComputationalModel_Constraints();

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
   * Returns the meta object for the reference '{@link org.sireum.aadl.gumbo.gumbo.AssumeStatement#getForPort <em>For Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>For Port</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.AssumeStatement#getForPort()
   * @see #getAssumeStatement()
   * @generated
   */
  EReference getAssumeStatement_ForPort();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.AssumeStatement#getAssumeTitle <em>Assume Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Assume Title</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.AssumeStatement#getAssumeTitle()
   * @see #getAssumeStatement()
   * @generated
   */
  EAttribute getAssumeStatement_AssumeTitle();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.AssumeStatement#getPred <em>Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pred</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.AssumeStatement#getPred()
   * @see #getAssumeStatement()
   * @generated
   */
  EAttribute getAssumeStatement_Pred();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.AssumeStatement#getTracesTo <em>Traces To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Traces To</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.AssumeStatement#getTracesTo()
   * @see #getAssumeStatement()
   * @generated
   */
  EAttribute getAssumeStatement_TracesTo();

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
   * Returns the meta object for the attribute '{@link org.sireum.aadl.gumbo.gumbo.GuaranteeStatement#getGuaranteeTitle <em>Guarantee Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Guarantee Title</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.GuaranteeStatement#getGuaranteeTitle()
   * @see #getGuaranteeStatement()
   * @generated
   */
  EAttribute getGuaranteeStatement_GuaranteeTitle();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.gumbo.gumbo.GuaranteeStatement#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.GuaranteeStatement#getExpr()
   * @see #getGuaranteeStatement()
   * @generated
   */
  EReference getGuaranteeStatement_Expr();

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
   * Returns the meta object for class '{@link org.sireum.aadl.gumbo.gumbo.IdExpr <em>Id Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Id Expr</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.IdExpr
   * @generated
   */
  EClass getIdExpr();

  /**
   * Returns the meta object for the reference '{@link org.sireum.aadl.gumbo.gumbo.IdExpr#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Id</em>'.
   * @see org.sireum.aadl.gumbo.gumbo.IdExpr#getId()
   * @see #getIdExpr()
   * @generated
   */
  EReference getIdExpr_Id();

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
     * The meta object literal for the '<em><b>Specs</b></em>' containment reference list feature.
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
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.ComputationalModelImpl <em>Computational Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.ComputationalModelImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getComputationalModel()
     * @generated
     */
    EClass COMPUTATIONAL_MODEL = eINSTANCE.getComputationalModel();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.FlowsImpl <em>Flows</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.FlowsImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getFlows()
     * @generated
     */
    EClass FLOWS = eINSTANCE.getFlows();

    /**
     * The meta object literal for the '<em><b>Flows</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLOWS__FLOWS = eINSTANCE.getFlows_Flows();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.FlowImpl <em>Flow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.FlowImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getFlow()
     * @generated
     */
    EClass FLOW = eINSTANCE.getFlow();

    /**
     * The meta object literal for the '<em><b>Flow Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOW__FLOW_ID = eINSTANCE.getFlow_FlowId();

    /**
     * The meta object literal for the '<em><b>Src Ports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLOW__SRC_PORTS = eINSTANCE.getFlow_SrcPorts();

    /**
     * The meta object literal for the '<em><b>Dst Ports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLOW__DST_PORTS = eINSTANCE.getFlow_DstPorts();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.ContractImpl <em>Contract</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.ContractImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getContract()
     * @generated
     */
    EClass CONTRACT = eINSTANCE.getContract();

    /**
     * The meta object literal for the '<em><b>Specs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRACT__SPECS = eINSTANCE.getContract_Specs();

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
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.ExprImpl <em>Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.ExprImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getExpr()
     * @generated
     */
    EClass EXPR = eINSTANCE.getExpr();

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
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.PeriodicComputationalModelImpl <em>Periodic Computational Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.PeriodicComputationalModelImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getPeriodicComputationalModel()
     * @generated
     */
    EClass PERIODIC_COMPUTATIONAL_MODEL = eINSTANCE.getPeriodicComputationalModel();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.HyperperiodComputationalModelImpl <em>Hyperperiod Computational Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.HyperperiodComputationalModelImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getHyperperiodComputationalModel()
     * @generated
     */
    EClass HYPERPERIOD_COMPUTATIONAL_MODEL = eINSTANCE.getHyperperiodComputationalModel();

    /**
     * The meta object literal for the '<em><b>Constraints</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HYPERPERIOD_COMPUTATIONAL_MODEL__CONSTRAINTS = eINSTANCE.getHyperperiodComputationalModel_Constraints();

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
     * The meta object literal for the '<em><b>For Port</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSUME_STATEMENT__FOR_PORT = eINSTANCE.getAssumeStatement_ForPort();

    /**
     * The meta object literal for the '<em><b>Assume Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSUME_STATEMENT__ASSUME_TITLE = eINSTANCE.getAssumeStatement_AssumeTitle();

    /**
     * The meta object literal for the '<em><b>Pred</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSUME_STATEMENT__PRED = eINSTANCE.getAssumeStatement_Pred();

    /**
     * The meta object literal for the '<em><b>Traces To</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSUME_STATEMENT__TRACES_TO = eINSTANCE.getAssumeStatement_TracesTo();

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
     * The meta object literal for the '<em><b>Guarantee Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GUARANTEE_STATEMENT__GUARANTEE_TITLE = eINSTANCE.getGuaranteeStatement_GuaranteeTitle();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GUARANTEE_STATEMENT__EXPR = eINSTANCE.getGuaranteeStatement_Expr();

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
     * The meta object literal for the '{@link org.sireum.aadl.gumbo.gumbo.impl.IdExprImpl <em>Id Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.gumbo.gumbo.impl.IdExprImpl
     * @see org.sireum.aadl.gumbo.gumbo.impl.GumboPackageImpl#getIdExpr()
     * @generated
     */
    EClass ID_EXPR = eINSTANCE.getIdExpr();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ID_EXPR__ID = eINSTANCE.getIdExpr_Id();

  }

} //GumboPackage
