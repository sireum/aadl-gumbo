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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slang Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.SlangPattern#getPatterns <em>Patterns</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.SlangPattern#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.SlangPattern#getInit <em>Init</em>}</li>
 * </ul>
 *
 * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getSlangPattern()
 * @model
 * @generated
 */
public interface SlangPattern extends SlangVarDef
{
  /**
   * Returns the value of the '<em><b>Patterns</b></em>' containment reference list.
   * The list contents are of type {@link org.sireum.aadl.gumbo.gumbo.SlangTPattern}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Patterns</em>' containment reference list.
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getSlangPattern_Patterns()
   * @model containment="true"
   * @generated
   */
  EList<SlangTPattern> getPatterns();

  /**
   * Returns the value of the '<em><b>Type Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Name</em>' containment reference.
   * @see #setTypeName(SlangType)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getSlangPattern_TypeName()
   * @model containment="true"
   * @generated
   */
  SlangType getTypeName();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.SlangPattern#getTypeName <em>Type Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Name</em>' containment reference.
   * @see #getTypeName()
   * @generated
   */
  void setTypeName(SlangType value);

  /**
   * Returns the value of the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init</em>' containment reference.
   * @see #setInit(OwnedExpression)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getSlangPattern_Init()
   * @model containment="true"
   * @generated
   */
  OwnedExpression getInit();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.SlangPattern#getInit <em>Init</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init</em>' containment reference.
   * @see #getInit()
   * @generated
   */
  void setInit(OwnedExpression value);

} // SlangPattern
