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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spec Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.SpecSection#getState <em>State</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.SpecSection#getInvariants <em>Invariants</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.SpecSection#getIntegration <em>Integration</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.SpecSection#getInitialize <em>Initialize</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.SpecSection#getCompute <em>Compute</em>}</li>
 * </ul>
 *
 * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getSpecSection()
 * @model
 * @generated
 */
public interface SpecSection extends EObject
{
  /**
   * Returns the value of the '<em><b>State</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>State</em>' containment reference.
   * @see #setState(State)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getSpecSection_State()
   * @model containment="true"
   * @generated
   */
  State getState();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.SpecSection#getState <em>State</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State</em>' containment reference.
   * @see #getState()
   * @generated
   */
  void setState(State value);

  /**
   * Returns the value of the '<em><b>Invariants</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Invariants</em>' containment reference.
   * @see #setInvariants(Invariants)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getSpecSection_Invariants()
   * @model containment="true"
   * @generated
   */
  Invariants getInvariants();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.SpecSection#getInvariants <em>Invariants</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Invariants</em>' containment reference.
   * @see #getInvariants()
   * @generated
   */
  void setInvariants(Invariants value);

  /**
   * Returns the value of the '<em><b>Integration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Integration</em>' containment reference.
   * @see #setIntegration(Integration)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getSpecSection_Integration()
   * @model containment="true"
   * @generated
   */
  Integration getIntegration();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.SpecSection#getIntegration <em>Integration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Integration</em>' containment reference.
   * @see #getIntegration()
   * @generated
   */
  void setIntegration(Integration value);

  /**
   * Returns the value of the '<em><b>Initialize</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initialize</em>' containment reference.
   * @see #setInitialize(Initialize)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getSpecSection_Initialize()
   * @model containment="true"
   * @generated
   */
  Initialize getInitialize();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.SpecSection#getInitialize <em>Initialize</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initialize</em>' containment reference.
   * @see #getInitialize()
   * @generated
   */
  void setInitialize(Initialize value);

  /**
   * Returns the value of the '<em><b>Compute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Compute</em>' containment reference.
   * @see #setCompute(Compute)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getSpecSection_Compute()
   * @model containment="true"
   * @generated
   */
  Compute getCompute();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.SpecSection#getCompute <em>Compute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Compute</em>' containment reference.
   * @see #getCompute()
   * @generated
   */
  void setCompute(Compute value);

} // SpecSection
