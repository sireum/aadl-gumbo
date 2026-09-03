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

import org.osate.aadl2.DataClassifier;
import org.osate.aadl2.StringLiteral;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Lit Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.EnumLitExpr#getEnumType <em>Enum Type</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.EnumLitExpr#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getEnumLitExpr()
 * @model
 * @generated
 */
public interface EnumLitExpr extends GExpr
{
  /**
   * Returns the value of the '<em><b>Enum Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enum Type</em>' reference.
   * @see #setEnumType(DataClassifier)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getEnumLitExpr_EnumType()
   * @model
   * @generated
   */
  DataClassifier getEnumType();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.EnumLitExpr#getEnumType <em>Enum Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enum Type</em>' reference.
   * @see #getEnumType()
   * @generated
   */
  void setEnumType(DataClassifier value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' reference.
   * @see #setValue(StringLiteral)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getEnumLitExpr_Value()
   * @model
   * @generated
   */
  StringLiteral getValue();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.EnumLitExpr#getValue <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' reference.
   * @see #getValue()
   * @generated
   */
  void setValue(StringLiteral value);

} // EnumLitExpr
