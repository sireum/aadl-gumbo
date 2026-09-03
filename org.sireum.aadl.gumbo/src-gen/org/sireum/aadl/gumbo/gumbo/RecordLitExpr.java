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

import org.osate.aadl2.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record Lit Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.RecordLitExpr#getRecordType <em>Record Type</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.RecordLitExpr#getArgs <em>Args</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.RecordLitExpr#getArgExpr <em>Arg Expr</em>}</li>
 * </ul>
 *
 * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getRecordLitExpr()
 * @model
 * @generated
 */
public interface RecordLitExpr extends GExpr
{
  /**
   * Returns the value of the '<em><b>Record Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Record Type</em>' containment reference.
   * @see #setRecordType(DataElement)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getRecordLitExpr_RecordType()
   * @model containment="true"
   * @generated
   */
  DataElement getRecordType();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.RecordLitExpr#getRecordType <em>Record Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Record Type</em>' containment reference.
   * @see #getRecordType()
   * @generated
   */
  void setRecordType(DataElement value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' reference list.
   * The list contents are of type {@link org.osate.aadl2.NamedElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' reference list.
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getRecordLitExpr_Args()
   * @model
   * @generated
   */
  EList<NamedElement> getArgs();

  /**
   * Returns the value of the '<em><b>Arg Expr</b></em>' containment reference list.
   * The list contents are of type {@link org.sireum.aadl.gumbo.gumbo.OwnedExpression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arg Expr</em>' containment reference list.
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getRecordLitExpr_ArgExpr()
   * @model containment="true"
   * @generated
   */
  EList<OwnedExpression> getArgExpr();

} // RecordLitExpr
