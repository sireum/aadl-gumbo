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
 * A representation of the model object '<em><b>Info Flow Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.InfoFlowClause#getId <em>Id</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.InfoFlowClause#getDescriptor <em>Descriptor</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.InfoFlowClause#getFromPortOrStateVar <em>From Port Or State Var</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.InfoFlowClause#getToPortOrStateVar <em>To Port Or State Var</em>}</li>
 * </ul>
 *
 * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getInfoFlowClause()
 * @model
 * @generated
 */
public interface InfoFlowClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getInfoFlowClause_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.InfoFlowClause#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Descriptor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Descriptor</em>' attribute.
   * @see #setDescriptor(String)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getInfoFlowClause_Descriptor()
   * @model
   * @generated
   */
  String getDescriptor();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.InfoFlowClause#getDescriptor <em>Descriptor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Descriptor</em>' attribute.
   * @see #getDescriptor()
   * @generated
   */
  void setDescriptor(String value);

  /**
   * Returns the value of the '<em><b>From Port Or State Var</b></em>' reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>From Port Or State Var</em>' reference list.
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getInfoFlowClause_FromPortOrStateVar()
   * @model
   * @generated
   */
  EList<EObject> getFromPortOrStateVar();

  /**
   * Returns the value of the '<em><b>To Port Or State Var</b></em>' reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>To Port Or State Var</em>' reference list.
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getInfoFlowClause_ToPortOrStateVar()
   * @model
   * @generated
   */
  EList<EObject> getToPortOrStateVar();

} // InfoFlowClause
