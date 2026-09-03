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

import org.osate.aadl2.Port;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Handler Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.HandlerClause#getId <em>Id</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.HandlerClause#getModifies <em>Modifies</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.HandlerClause#getAssumes <em>Assumes</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.HandlerClause#getGuarantees <em>Guarantees</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.HandlerClause#getCases <em>Cases</em>}</li>
 * </ul>
 *
 * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getHandlerClause()
 * @model
 * @generated
 */
public interface HandlerClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' reference.
   * @see #setId(Port)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getHandlerClause_Id()
   * @model
   * @generated
   */
  Port getId();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.HandlerClause#getId <em>Id</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' reference.
   * @see #getId()
   * @generated
   */
  void setId(Port value);

  /**
   * Returns the value of the '<em><b>Modifies</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifies</em>' containment reference.
   * @see #setModifies(SlangModifies)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getHandlerClause_Modifies()
   * @model containment="true"
   * @generated
   */
  SlangModifies getModifies();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.HandlerClause#getModifies <em>Modifies</em>}' containment reference.
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
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getHandlerClause_Assumes()
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
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getHandlerClause_Guarantees()
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
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getHandlerClause_Cases()
   * @model containment="true"
   * @generated
   */
  EList<CaseStatementClause> getCases();

} // HandlerClause
