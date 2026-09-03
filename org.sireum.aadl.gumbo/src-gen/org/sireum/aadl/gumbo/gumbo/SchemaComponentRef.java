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
 * A representation of the model object '<em><b>Schema Component Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.SchemaComponentRef#getComponent <em>Component</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.SchemaComponentRef#getOccurrenceLabel <em>Occurrence Label</em>}</li>
 * </ul>
 *
 * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getSchemaComponentRef()
 * @model
 * @generated
 */
public interface SchemaComponentRef extends SchemaElement
{
  /**
   * Returns the value of the '<em><b>Component</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component</em>' reference.
   * @see #setComponent(EObject)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getSchemaComponentRef_Component()
   * @model
   * @generated
   */
  EObject getComponent();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.SchemaComponentRef#getComponent <em>Component</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Component</em>' reference.
   * @see #getComponent()
   * @generated
   */
  void setComponent(EObject value);

  /**
   * Returns the value of the '<em><b>Occurrence Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Occurrence Label</em>' attribute.
   * @see #setOccurrenceLabel(String)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getSchemaComponentRef_OccurrenceLabel()
   * @model
   * @generated
   */
  String getOccurrenceLabel();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.SchemaComponentRef#getOccurrenceLabel <em>Occurrence Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Occurrence Label</em>' attribute.
   * @see #getOccurrenceLabel()
   * @generated
   */
  void setOccurrenceLabel(String value);

} // SchemaComponentRef
