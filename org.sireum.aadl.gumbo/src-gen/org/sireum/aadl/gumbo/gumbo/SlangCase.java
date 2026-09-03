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
 * A representation of the model object '<em><b>Slang Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.SlangCase#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.SlangCase#getE <em>E</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.SlangCase#getS <em>S</em>}</li>
 * </ul>
 *
 * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getSlangCase()
 * @model
 * @generated
 */
public interface SlangCase extends EObject
{
  /**
   * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern</em>' containment reference.
   * @see #setPattern(SlangPattern)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getSlangCase_Pattern()
   * @model containment="true"
   * @generated
   */
  SlangPattern getPattern();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.SlangCase#getPattern <em>Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern</em>' containment reference.
   * @see #getPattern()
   * @generated
   */
  void setPattern(SlangPattern value);

  /**
   * Returns the value of the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>E</em>' containment reference.
   * @see #setE(OwnedExpression)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getSlangCase_E()
   * @model containment="true"
   * @generated
   */
  OwnedExpression getE();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.SlangCase#getE <em>E</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E</em>' containment reference.
   * @see #getE()
   * @generated
   */
  void setE(OwnedExpression value);

  /**
   * Returns the value of the '<em><b>S</b></em>' containment reference list.
   * The list contents are of type {@link org.sireum.aadl.gumbo.gumbo.SlangStmt}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>S</em>' containment reference list.
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getSlangCase_S()
   * @model containment="true"
   * @generated
   */
  EList<SlangStmt> getS();

} // SlangCase
