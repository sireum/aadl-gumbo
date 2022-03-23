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
 * A representation of the model object '<em><b>Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.Expr#getTerm <em>Term</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.Expr#getThenExpr <em>Then Expr</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.Expr#getElseExpr <em>Else Expr</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.Expr#getQVar <em>QVar</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.Expr#getQuantifiedExpr <em>Quantified Expr</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.Expr#getT <em>T</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.Expr#getM <em>M</em>}</li>
 * </ul>
 *
 * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getExpr()
 * @model
 * @generated
 */
public interface Expr extends SlangMInterp
{
  /**
   * Returns the value of the '<em><b>Term</b></em>' containment reference list.
   * The list contents are of type {@link org.sireum.aadl.gumbo.gumbo.Expr}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Term</em>' containment reference list.
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getExpr_Term()
   * @model containment="true"
   * @generated
   */
  EList<Expr> getTerm();

  /**
   * Returns the value of the '<em><b>Then Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then Expr</em>' containment reference.
   * @see #setThenExpr(Expr)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getExpr_ThenExpr()
   * @model containment="true"
   * @generated
   */
  Expr getThenExpr();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.Expr#getThenExpr <em>Then Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then Expr</em>' containment reference.
   * @see #getThenExpr()
   * @generated
   */
  void setThenExpr(Expr value);

  /**
   * Returns the value of the '<em><b>Else Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else Expr</em>' containment reference.
   * @see #setElseExpr(Expr)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getExpr_ElseExpr()
   * @model containment="true"
   * @generated
   */
  Expr getElseExpr();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.Expr#getElseExpr <em>Else Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else Expr</em>' containment reference.
   * @see #getElseExpr()
   * @generated
   */
  void setElseExpr(Expr value);

  /**
   * Returns the value of the '<em><b>QVar</b></em>' containment reference list.
   * The list contents are of type {@link org.sireum.aadl.gumbo.gumbo.SlangQuantVar}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>QVar</em>' containment reference list.
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getExpr_QVar()
   * @model containment="true"
   * @generated
   */
  EList<SlangQuantVar> getQVar();

  /**
   * Returns the value of the '<em><b>Quantified Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quantified Expr</em>' containment reference.
   * @see #setQuantifiedExpr(Expr)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getExpr_QuantifiedExpr()
   * @model containment="true"
   * @generated
   */
  Expr getQuantifiedExpr();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.Expr#getQuantifiedExpr <em>Quantified Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Quantified Expr</em>' containment reference.
   * @see #getQuantifiedExpr()
   * @generated
   */
  void setQuantifiedExpr(Expr value);

  /**
   * Returns the value of the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>T</em>' containment reference.
   * @see #setT(Expr)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getExpr_T()
   * @model containment="true"
   * @generated
   */
  Expr getT();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.Expr#getT <em>T</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T</em>' containment reference.
   * @see #getT()
   * @generated
   */
  void setT(Expr value);

  /**
   * Returns the value of the '<em><b>M</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>M</em>' containment reference.
   * @see #setM(SlangMInterp)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getExpr_M()
   * @model containment="true"
   * @generated
   */
  SlangMInterp getM();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.Expr#getM <em>M</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>M</em>' containment reference.
   * @see #getM()
   * @generated
   */
  void setM(SlangMInterp value);

} // Expr
