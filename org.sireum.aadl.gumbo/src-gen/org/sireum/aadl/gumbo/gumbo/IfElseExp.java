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
 * A representation of the model object '<em><b>If Else Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.IfElseExp#getIfCond <em>If Cond</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.IfElseExp#getThenExpr <em>Then Expr</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.IfElseExp#getElseExpr <em>Else Expr</em>}</li>
 * </ul>
 *
 * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getIfElseExp()
 * @model
 * @generated
 */
public interface IfElseExp extends GExpr
{
  /**
   * Returns the value of the '<em><b>If Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>If Cond</em>' containment reference.
   * @see #setIfCond(GExpr)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getIfElseExp_IfCond()
   * @model containment="true"
   * @generated
   */
  GExpr getIfCond();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.IfElseExp#getIfCond <em>If Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>If Cond</em>' containment reference.
   * @see #getIfCond()
   * @generated
   */
  void setIfCond(GExpr value);

  /**
   * Returns the value of the '<em><b>Then Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then Expr</em>' containment reference.
   * @see #setThenExpr(OwnedExpression)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getIfElseExp_ThenExpr()
   * @model containment="true"
   * @generated
   */
  OwnedExpression getThenExpr();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.IfElseExp#getThenExpr <em>Then Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then Expr</em>' containment reference.
   * @see #getThenExpr()
   * @generated
   */
  void setThenExpr(OwnedExpression value);

  /**
   * Returns the value of the '<em><b>Else Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else Expr</em>' containment reference.
   * @see #setElseExpr(OwnedExpression)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getIfElseExp_ElseExpr()
   * @model containment="true"
   * @generated
   */
  OwnedExpression getElseExpr();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.IfElseExp#getElseExpr <em>Else Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else Expr</em>' containment reference.
   * @see #getElseExpr()
   * @generated
   */
  void setElseExpr(OwnedExpression value);

} // IfElseExp
