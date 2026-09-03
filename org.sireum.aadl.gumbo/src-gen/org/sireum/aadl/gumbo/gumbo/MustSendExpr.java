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

import org.osate.aadl2.Port;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Must Send Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.MustSendExpr#getEventPort <em>Event Port</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.MustSendExpr#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getMustSendExpr()
 * @model
 * @generated
 */
public interface MustSendExpr extends GExpr
{
  /**
   * Returns the value of the '<em><b>Event Port</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event Port</em>' reference.
   * @see #setEventPort(Port)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getMustSendExpr_EventPort()
   * @model
   * @generated
   */
  Port getEventPort();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.MustSendExpr#getEventPort <em>Event Port</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event Port</em>' reference.
   * @see #getEventPort()
   * @generated
   */
  void setEventPort(Port value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(OwnedExpression)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getMustSendExpr_Value()
   * @model containment="true"
   * @generated
   */
  OwnedExpression getValue();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.MustSendExpr#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(OwnedExpression value);

} // MustSendExpr
