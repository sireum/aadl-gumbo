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
package org.sireum.aadl.gumbo.gumbo.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.osate.aadl2.Aadl2Package;

import org.sireum.aadl.gumbo.gumbo.AssumeStatement;
import org.sireum.aadl.gumbo.gumbo.BinaryExpr;
import org.sireum.aadl.gumbo.gumbo.ComputationalModel;
import org.sireum.aadl.gumbo.gumbo.Contract;
import org.sireum.aadl.gumbo.gumbo.Expr;
import org.sireum.aadl.gumbo.gumbo.FeatureElement;
import org.sireum.aadl.gumbo.gumbo.Flow;
import org.sireum.aadl.gumbo.gumbo.Flows;
import org.sireum.aadl.gumbo.gumbo.GuaranteeStatement;
import org.sireum.aadl.gumbo.gumbo.GumboFactory;
import org.sireum.aadl.gumbo.gumbo.GumboLibrary;
import org.sireum.aadl.gumbo.gumbo.GumboPackage;
import org.sireum.aadl.gumbo.gumbo.GumboSubclause;
import org.sireum.aadl.gumbo.gumbo.HyperperiodComputationalModel;
import org.sireum.aadl.gumbo.gumbo.IdExpr;
import org.sireum.aadl.gumbo.gumbo.PeriodicComputationalModel;
import org.sireum.aadl.gumbo.gumbo.SpecSection;
import org.sireum.aadl.gumbo.gumbo.SpecStatement;
import org.sireum.aadl.gumbo.gumbo.SubcomponentElement;
import org.sireum.aadl.gumbo.gumbo.UnaryExpr;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GumboPackageImpl extends EPackageImpl implements GumboPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gumboLibraryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gumboSubclauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass specSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass computationalModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass flowsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass flowEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contractEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass specStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subcomponentElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass periodicComputationalModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hyperperiodComputationalModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assumeStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass guaranteeStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass binaryExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unaryExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass idExprEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private GumboPackageImpl()
  {
    super(eNS_URI, GumboFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link GumboPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static GumboPackage init()
  {
    if (isInited) return (GumboPackage)EPackage.Registry.INSTANCE.getEPackage(GumboPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredGumboPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    GumboPackageImpl theGumboPackage = registeredGumboPackage instanceof GumboPackageImpl ? (GumboPackageImpl)registeredGumboPackage : new GumboPackageImpl();

    isInited = true;

    // Initialize simple dependencies
    EcorePackage.eINSTANCE.eClass();
    Aadl2Package.eINSTANCE.eClass();

    // Create package meta-data objects
    theGumboPackage.createPackageContents();

    // Initialize created meta-data
    theGumboPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theGumboPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(GumboPackage.eNS_URI, theGumboPackage);
    return theGumboPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getGumboLibrary()
  {
    return gumboLibraryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getGumboSubclause()
  {
    return gumboSubclauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getGumboSubclause_Specs()
  {
    return (EReference)gumboSubclauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSpecSection()
  {
    return specSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getComputationalModel()
  {
    return computationalModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFlows()
  {
    return flowsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFlows_Flows()
  {
    return (EReference)flowsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFlow()
  {
    return flowEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getFlow_FlowId()
  {
    return (EAttribute)flowEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFlow_SrcPorts()
  {
    return (EReference)flowEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFlow_DstPorts()
  {
    return (EReference)flowEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getContract()
  {
    return contractEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getContract_Specs()
  {
    return (EReference)contractEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSpecStatement()
  {
    return specStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getExpr()
  {
    return exprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSubcomponentElement()
  {
    return subcomponentElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSubcomponentElement_Subcomponent()
  {
    return (EReference)subcomponentElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFeatureElement()
  {
    return featureElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFeatureElement_Feature()
  {
    return (EReference)featureElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPeriodicComputationalModel()
  {
    return periodicComputationalModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getHyperperiodComputationalModel()
  {
    return hyperperiodComputationalModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getHyperperiodComputationalModel_Constraints()
  {
    return (EReference)hyperperiodComputationalModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAssumeStatement()
  {
    return assumeStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAssumeStatement_ForPort()
  {
    return (EReference)assumeStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAssumeStatement_AssumeTitle()
  {
    return (EAttribute)assumeStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAssumeStatement_Pred()
  {
    return (EAttribute)assumeStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAssumeStatement_TracesTo()
  {
    return (EAttribute)assumeStatementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getGuaranteeStatement()
  {
    return guaranteeStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getGuaranteeStatement_GuaranteeTitle()
  {
    return (EAttribute)guaranteeStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getGuaranteeStatement_Expr()
  {
    return (EReference)guaranteeStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getBinaryExpr()
  {
    return binaryExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getBinaryExpr_Left()
  {
    return (EReference)binaryExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getBinaryExpr_Right()
  {
    return (EReference)binaryExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getBinaryExpr_Op()
  {
    return (EAttribute)binaryExprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getUnaryExpr()
  {
    return unaryExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getUnaryExpr_Op()
  {
    return (EAttribute)unaryExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getUnaryExpr_Expr()
  {
    return (EReference)unaryExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getIdExpr()
  {
    return idExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getIdExpr_Id()
  {
    return (EReference)idExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GumboFactory getGumboFactory()
  {
    return (GumboFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    gumboLibraryEClass = createEClass(GUMBO_LIBRARY);

    gumboSubclauseEClass = createEClass(GUMBO_SUBCLAUSE);
    createEReference(gumboSubclauseEClass, GUMBO_SUBCLAUSE__SPECS);

    specSectionEClass = createEClass(SPEC_SECTION);

    computationalModelEClass = createEClass(COMPUTATIONAL_MODEL);

    flowsEClass = createEClass(FLOWS);
    createEReference(flowsEClass, FLOWS__FLOWS);

    flowEClass = createEClass(FLOW);
    createEAttribute(flowEClass, FLOW__FLOW_ID);
    createEReference(flowEClass, FLOW__SRC_PORTS);
    createEReference(flowEClass, FLOW__DST_PORTS);

    contractEClass = createEClass(CONTRACT);
    createEReference(contractEClass, CONTRACT__SPECS);

    specStatementEClass = createEClass(SPEC_STATEMENT);

    exprEClass = createEClass(EXPR);

    subcomponentElementEClass = createEClass(SUBCOMPONENT_ELEMENT);
    createEReference(subcomponentElementEClass, SUBCOMPONENT_ELEMENT__SUBCOMPONENT);

    featureElementEClass = createEClass(FEATURE_ELEMENT);
    createEReference(featureElementEClass, FEATURE_ELEMENT__FEATURE);

    periodicComputationalModelEClass = createEClass(PERIODIC_COMPUTATIONAL_MODEL);

    hyperperiodComputationalModelEClass = createEClass(HYPERPERIOD_COMPUTATIONAL_MODEL);
    createEReference(hyperperiodComputationalModelEClass, HYPERPERIOD_COMPUTATIONAL_MODEL__CONSTRAINTS);

    assumeStatementEClass = createEClass(ASSUME_STATEMENT);
    createEReference(assumeStatementEClass, ASSUME_STATEMENT__FOR_PORT);
    createEAttribute(assumeStatementEClass, ASSUME_STATEMENT__ASSUME_TITLE);
    createEAttribute(assumeStatementEClass, ASSUME_STATEMENT__PRED);
    createEAttribute(assumeStatementEClass, ASSUME_STATEMENT__TRACES_TO);

    guaranteeStatementEClass = createEClass(GUARANTEE_STATEMENT);
    createEAttribute(guaranteeStatementEClass, GUARANTEE_STATEMENT__GUARANTEE_TITLE);
    createEReference(guaranteeStatementEClass, GUARANTEE_STATEMENT__EXPR);

    binaryExprEClass = createEClass(BINARY_EXPR);
    createEReference(binaryExprEClass, BINARY_EXPR__LEFT);
    createEReference(binaryExprEClass, BINARY_EXPR__RIGHT);
    createEAttribute(binaryExprEClass, BINARY_EXPR__OP);

    unaryExprEClass = createEClass(UNARY_EXPR);
    createEAttribute(unaryExprEClass, UNARY_EXPR__OP);
    createEReference(unaryExprEClass, UNARY_EXPR__EXPR);

    idExprEClass = createEClass(ID_EXPR);
    createEReference(idExprEClass, ID_EXPR__ID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    Aadl2Package theAadl2Package = (Aadl2Package)EPackage.Registry.INSTANCE.getEPackage(Aadl2Package.eNS_URI);
    EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    gumboLibraryEClass.getESuperTypes().add(theAadl2Package.getAnnexLibrary());
    gumboSubclauseEClass.getESuperTypes().add(theAadl2Package.getAnnexSubclause());
    computationalModelEClass.getESuperTypes().add(this.getSpecSection());
    flowsEClass.getESuperTypes().add(this.getSpecSection());
    contractEClass.getESuperTypes().add(this.getSpecSection());
    periodicComputationalModelEClass.getESuperTypes().add(this.getComputationalModel());
    hyperperiodComputationalModelEClass.getESuperTypes().add(this.getComputationalModel());
    assumeStatementEClass.getESuperTypes().add(this.getSpecStatement());
    guaranteeStatementEClass.getESuperTypes().add(this.getSpecStatement());
    binaryExprEClass.getESuperTypes().add(this.getExpr());
    unaryExprEClass.getESuperTypes().add(this.getExpr());
    idExprEClass.getESuperTypes().add(this.getExpr());

    // Initialize classes and features; add operations and parameters
    initEClass(gumboLibraryEClass, GumboLibrary.class, "GumboLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(gumboSubclauseEClass, GumboSubclause.class, "GumboSubclause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGumboSubclause_Specs(), this.getSpecSection(), null, "specs", null, 0, -1, GumboSubclause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(specSectionEClass, SpecSection.class, "SpecSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(computationalModelEClass, ComputationalModel.class, "ComputationalModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(flowsEClass, Flows.class, "Flows", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFlows_Flows(), this.getFlow(), null, "flows", null, 0, -1, Flows.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(flowEClass, Flow.class, "Flow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFlow_FlowId(), theEcorePackage.getEString(), "flowId", null, 0, 1, Flow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFlow_SrcPorts(), this.getFeatureElement(), null, "srcPorts", null, 0, -1, Flow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFlow_DstPorts(), this.getFeatureElement(), null, "dstPorts", null, 0, -1, Flow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contractEClass, Contract.class, "Contract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getContract_Specs(), this.getSpecStatement(), null, "specs", null, 0, -1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(specStatementEClass, SpecStatement.class, "SpecStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(exprEClass, Expr.class, "Expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(subcomponentElementEClass, SubcomponentElement.class, "SubcomponentElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSubcomponentElement_Subcomponent(), theAadl2Package.getSubcomponent(), null, "subcomponent", null, 0, 1, SubcomponentElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(featureElementEClass, FeatureElement.class, "FeatureElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFeatureElement_Feature(), theAadl2Package.getNamedElement(), null, "feature", null, 0, 1, FeatureElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(periodicComputationalModelEClass, PeriodicComputationalModel.class, "PeriodicComputationalModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(hyperperiodComputationalModelEClass, HyperperiodComputationalModel.class, "HyperperiodComputationalModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHyperperiodComputationalModel_Constraints(), theAadl2Package.getNamedElement(), null, "constraints", null, 0, -1, HyperperiodComputationalModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assumeStatementEClass, AssumeStatement.class, "AssumeStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssumeStatement_ForPort(), theAadl2Package.getNamedElement(), null, "forPort", null, 0, 1, AssumeStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAssumeStatement_AssumeTitle(), theEcorePackage.getEString(), "assumeTitle", null, 0, 1, AssumeStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAssumeStatement_Pred(), theEcorePackage.getEString(), "pred", null, 0, 1, AssumeStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAssumeStatement_TracesTo(), theEcorePackage.getEString(), "tracesTo", null, 0, 1, AssumeStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(guaranteeStatementEClass, GuaranteeStatement.class, "GuaranteeStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGuaranteeStatement_GuaranteeTitle(), theEcorePackage.getEString(), "guaranteeTitle", null, 0, 1, GuaranteeStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGuaranteeStatement_Expr(), this.getExpr(), null, "expr", null, 0, 1, GuaranteeStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(binaryExprEClass, BinaryExpr.class, "BinaryExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBinaryExpr_Left(), this.getExpr(), null, "left", null, 0, 1, BinaryExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBinaryExpr_Right(), this.getExpr(), null, "right", null, 0, 1, BinaryExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBinaryExpr_Op(), theEcorePackage.getEString(), "op", null, 0, 1, BinaryExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unaryExprEClass, UnaryExpr.class, "UnaryExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUnaryExpr_Op(), theEcorePackage.getEString(), "op", null, 0, 1, UnaryExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUnaryExpr_Expr(), this.getExpr(), null, "expr", null, 0, 1, UnaryExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(idExprEClass, IdExpr.class, "IdExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIdExpr_Id(), theAadl2Package.getNamedElement(), null, "id", null, 0, 1, IdExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //GumboPackageImpl
