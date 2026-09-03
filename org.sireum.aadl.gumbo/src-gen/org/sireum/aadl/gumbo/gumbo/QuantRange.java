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
 * A representation of the model object '<em><b>Quant Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.QuantRange#getLo <em>Lo</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.QuantRange#getExtent <em>Extent</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.QuantRange#getHigh <em>High</em>}</li>
 * </ul>
 *
 * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getQuantRange()
 * @model
 * @generated
 */
public interface QuantRange extends EObject
{
  /**
   * Returns the value of the '<em><b>Lo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lo</em>' containment reference.
   * @see #setLo(OwnedExpression)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getQuantRange_Lo()
   * @model containment="true"
   * @generated
   */
  OwnedExpression getLo();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.QuantRange#getLo <em>Lo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lo</em>' containment reference.
   * @see #getLo()
   * @generated
   */
  void setLo(OwnedExpression value);

  /**
   * Returns the value of the '<em><b>Extent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extent</em>' attribute.
   * @see #setExtent(String)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getQuantRange_Extent()
   * @model
   * @generated
   */
  String getExtent();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.QuantRange#getExtent <em>Extent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extent</em>' attribute.
   * @see #getExtent()
   * @generated
   */
  void setExtent(String value);

  /**
   * Returns the value of the '<em><b>High</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>High</em>' containment reference.
   * @see #setHigh(OwnedExpression)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getQuantRange_High()
   * @model containment="true"
   * @generated
   */
  OwnedExpression getHigh();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.QuantRange#getHigh <em>High</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>High</em>' containment reference.
   * @see #getHigh()
   * @generated
   */
  void setHigh(OwnedExpression value);

} // QuantRange
