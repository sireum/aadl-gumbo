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
 * A representation of the model object '<em><b>Composition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.Composition#getId <em>Id</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.Composition#getComponentAliases <em>Component Aliases</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.Composition#getPortAliases <em>Port Aliases</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.Composition#getStateVarAliases <em>State Var Aliases</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.Composition#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.Composition#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getComposition()
 * @model
 * @generated
 */
public interface Composition extends EObject
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getComposition_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.Composition#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Component Aliases</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component Aliases</em>' containment reference.
   * @see #setComponentAliases(ScheduleComponentAliases)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getComposition_ComponentAliases()
   * @model containment="true"
   * @generated
   */
  ScheduleComponentAliases getComponentAliases();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.Composition#getComponentAliases <em>Component Aliases</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Component Aliases</em>' containment reference.
   * @see #getComponentAliases()
   * @generated
   */
  void setComponentAliases(ScheduleComponentAliases value);

  /**
   * Returns the value of the '<em><b>Port Aliases</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Port Aliases</em>' containment reference.
   * @see #setPortAliases(SchedulePortAliases)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getComposition_PortAliases()
   * @model containment="true"
   * @generated
   */
  SchedulePortAliases getPortAliases();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.Composition#getPortAliases <em>Port Aliases</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Port Aliases</em>' containment reference.
   * @see #getPortAliases()
   * @generated
   */
  void setPortAliases(SchedulePortAliases value);

  /**
   * Returns the value of the '<em><b>State Var Aliases</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>State Var Aliases</em>' containment reference.
   * @see #setStateVarAliases(ScheduleStateVarAliases)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getComposition_StateVarAliases()
   * @model containment="true"
   * @generated
   */
  ScheduleStateVarAliases getStateVarAliases();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.Composition#getStateVarAliases <em>State Var Aliases</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State Var Aliases</em>' containment reference.
   * @see #getStateVarAliases()
   * @generated
   */
  void setStateVarAliases(ScheduleStateVarAliases value);

  /**
   * Returns the value of the '<em><b>Schema</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Schema</em>' containment reference.
   * @see #setSchema(Schema)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getComposition_Schema()
   * @model containment="true"
   * @generated
   */
  Schema getSchema();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.Composition#getSchema <em>Schema</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Schema</em>' containment reference.
   * @see #getSchema()
   * @generated
   */
  void setSchema(Schema value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link org.sireum.aadl.gumbo.gumbo.CompositionProperty}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getComposition_Properties()
   * @model containment="true"
   * @generated
   */
  EList<CompositionProperty> getProperties();

} // Composition
