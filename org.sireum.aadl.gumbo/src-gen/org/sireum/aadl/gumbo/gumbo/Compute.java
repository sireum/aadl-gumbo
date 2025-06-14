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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.Compute#getModifies <em>Modifies</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.Compute#getAssumes <em>Assumes</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.Compute#getGuarantees <em>Guarantees</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.Compute#getCases <em>Cases</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.Compute#getHandlers <em>Handlers</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.Compute#getFlows <em>Flows</em>}</li>
 * </ul>
 *
 * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getCompute()
 * @model
 * @generated
 */
public interface Compute extends EObject
{
  /**
   * Returns the value of the '<em><b>Modifies</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifies</em>' containment reference.
   * @see #setModifies(SlangModifies)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getCompute_Modifies()
   * @model containment="true"
   * @generated
   */
  SlangModifies getModifies();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.Compute#getModifies <em>Modifies</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modifies</em>' containment reference.
   * @see #getModifies()
   * @generated
   */
  void setModifies(SlangModifies value);

  /**
   * Returns the value of the '<em><b>Assumes</b></em>' containment reference list.
   * The list contents are of type {@link org.sireum.aadl.gumbo.gumbo.AssumeStatement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assumes</em>' containment reference list.
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getCompute_Assumes()
   * @model containment="true"
   * @generated
   */
  EList<AssumeStatement> getAssumes();

  /**
   * Returns the value of the '<em><b>Guarantees</b></em>' containment reference list.
   * The list contents are of type {@link org.sireum.aadl.gumbo.gumbo.GuaranteeStatement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guarantees</em>' containment reference list.
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getCompute_Guarantees()
   * @model containment="true"
   * @generated
   */
  EList<GuaranteeStatement> getGuarantees();

  /**
   * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
   * The list contents are of type {@link org.sireum.aadl.gumbo.gumbo.CaseStatementClause}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cases</em>' containment reference list.
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getCompute_Cases()
   * @model containment="true"
   * @generated
   */
  EList<CaseStatementClause> getCases();

  /**
   * Returns the value of the '<em><b>Handlers</b></em>' containment reference list.
   * The list contents are of type {@link org.sireum.aadl.gumbo.gumbo.HandlerClause}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Handlers</em>' containment reference list.
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getCompute_Handlers()
   * @model containment="true"
   * @generated
   */
  EList<HandlerClause> getHandlers();

  /**
   * Returns the value of the '<em><b>Flows</b></em>' containment reference list.
   * The list contents are of type {@link org.sireum.aadl.gumbo.gumbo.InfoFlowClause}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Flows</em>' containment reference list.
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getCompute_Flows()
   * @model containment="true"
   * @generated
   */
  EList<InfoFlowClause> getFlows();

} // Compute
