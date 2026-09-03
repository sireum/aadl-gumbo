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
 * A representation of the model object '<em><b>Slang If Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.SlangIfStmt#getCond <em>Cond</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.SlangIfStmt#getB <em>B</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.SlangIfStmt#getE <em>E</em>}</li>
 * </ul>
 *
 * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getSlangIfStmt()
 * @model
 * @generated
 */
public interface SlangIfStmt extends SlangStmt
{
  /**
   * Returns the value of the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cond</em>' containment reference.
   * @see #setCond(OwnedExpression)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getSlangIfStmt_Cond()
   * @model containment="true"
   * @generated
   */
  OwnedExpression getCond();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.SlangIfStmt#getCond <em>Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cond</em>' containment reference.
   * @see #getCond()
   * @generated
   */
  void setCond(OwnedExpression value);

  /**
   * Returns the value of the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>B</em>' containment reference.
   * @see #setB(SlangBlock)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getSlangIfStmt_B()
   * @model containment="true"
   * @generated
   */
  SlangBlock getB();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.SlangIfStmt#getB <em>B</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>B</em>' containment reference.
   * @see #getB()
   * @generated
   */
  void setB(SlangBlock value);

  /**
   * Returns the value of the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>E</em>' containment reference.
   * @see #setE(SlangElse)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getSlangIfStmt_E()
   * @model containment="true"
   * @generated
   */
  SlangElse getE();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.SlangIfStmt#getE <em>E</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E</em>' containment reference.
   * @see #getE()
   * @generated
   */
  void setE(SlangElse value);

} // SlangIfStmt
