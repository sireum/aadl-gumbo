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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.BinaryExpr#getLeft <em>Left</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.BinaryExpr#getRight <em>Right</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.BinaryExpr#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getBinaryExpr()
 * @model
 * @generated
 */
public interface BinaryExpr extends Expr
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Expr)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getBinaryExpr_Left()
   * @model containment="true"
   * @generated
   */
  Expr getLeft();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.BinaryExpr#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Expr value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Expr)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getBinaryExpr_Right()
   * @model containment="true"
   * @generated
   */
  Expr getRight();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.BinaryExpr#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Expr value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getBinaryExpr_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.BinaryExpr#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

} // BinaryExpr
