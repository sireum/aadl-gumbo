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
 * A representation of the model object '<em><b>Quantified Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.QuantifiedExp#getQuantifier <em>Quantifier</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.QuantifiedExp#getQuantRange <em>Quant Range</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.QuantifiedExp#getQuantParam <em>Quant Param</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.QuantifiedExp#getQuantifiedExpr <em>Quantified Expr</em>}</li>
 * </ul>
 *
 * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getQuantifiedExp()
 * @model
 * @generated
 */
public interface QuantifiedExp extends GExpr
{
  /**
   * Returns the value of the '<em><b>Quantifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quantifier</em>' attribute.
   * @see #setQuantifier(String)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getQuantifiedExp_Quantifier()
   * @model
   * @generated
   */
  String getQuantifier();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.QuantifiedExp#getQuantifier <em>Quantifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Quantifier</em>' attribute.
   * @see #getQuantifier()
   * @generated
   */
  void setQuantifier(String value);

  /**
   * Returns the value of the '<em><b>Quant Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quant Range</em>' containment reference.
   * @see #setQuantRange(QuantRange)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getQuantifiedExp_QuantRange()
   * @model containment="true"
   * @generated
   */
  QuantRange getQuantRange();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.QuantifiedExp#getQuantRange <em>Quant Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Quant Range</em>' containment reference.
   * @see #getQuantRange()
   * @generated
   */
  void setQuantRange(QuantRange value);

  /**
   * Returns the value of the '<em><b>Quant Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quant Param</em>' containment reference.
   * @see #setQuantParam(QuantParam)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getQuantifiedExp_QuantParam()
   * @model containment="true"
   * @generated
   */
  QuantParam getQuantParam();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.QuantifiedExp#getQuantParam <em>Quant Param</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Quant Param</em>' containment reference.
   * @see #getQuantParam()
   * @generated
   */
  void setQuantParam(QuantParam value);

  /**
   * Returns the value of the '<em><b>Quantified Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quantified Expr</em>' containment reference.
   * @see #setQuantifiedExpr(OwnedExpression)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getQuantifiedExp_QuantifiedExpr()
   * @model containment="true"
   * @generated
   */
  OwnedExpression getQuantifiedExpr();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.QuantifiedExp#getQuantifiedExpr <em>Quantified Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Quantified Expr</em>' containment reference.
   * @see #getQuantifiedExpr()
   * @generated
   */
  void setQuantifiedExpr(OwnedExpression value);

} // QuantifiedExp
