/**
 * * Copyright (c) 2021, Kansas State University
 *  *
 * All rights reserved.
 *  *
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
 *  *
 * 1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 *  *
 * 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.sireum.aadl.gumbo.gumbo;

import org.osate.aadl2.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assume Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.AssumeStatement#getForPort <em>For Port</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.AssumeStatement#getAssumeTitle <em>Assume Title</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.AssumeStatement#getPred <em>Pred</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.AssumeStatement#getTracesTo <em>Traces To</em>}</li>
 * </ul>
 *
 * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getAssumeStatement()
 * @model
 * @generated
 */
public interface AssumeStatement extends SpecStatement
{
  /**
   * Returns the value of the '<em><b>For Port</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>For Port</em>' reference.
   * @see #setForPort(NamedElement)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getAssumeStatement_ForPort()
   * @model
   * @generated
   */
  NamedElement getForPort();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.AssumeStatement#getForPort <em>For Port</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>For Port</em>' reference.
   * @see #getForPort()
   * @generated
   */
  void setForPort(NamedElement value);

  /**
   * Returns the value of the '<em><b>Assume Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assume Title</em>' attribute.
   * @see #setAssumeTitle(String)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getAssumeStatement_AssumeTitle()
   * @model
   * @generated
   */
  String getAssumeTitle();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.AssumeStatement#getAssumeTitle <em>Assume Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assume Title</em>' attribute.
   * @see #getAssumeTitle()
   * @generated
   */
  void setAssumeTitle(String value);

  /**
   * Returns the value of the '<em><b>Pred</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pred</em>' attribute.
   * @see #setPred(String)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getAssumeStatement_Pred()
   * @model
   * @generated
   */
  String getPred();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.AssumeStatement#getPred <em>Pred</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pred</em>' attribute.
   * @see #getPred()
   * @generated
   */
  void setPred(String value);

  /**
   * Returns the value of the '<em><b>Traces To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Traces To</em>' attribute.
   * @see #setTracesTo(String)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getAssumeStatement_TracesTo()
   * @model
   * @generated
   */
  String getTracesTo();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.AssumeStatement#getTracesTo <em>Traces To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Traces To</em>' attribute.
   * @see #getTracesTo()
   * @generated
   */
  void setTracesTo(String value);

} // AssumeStatement
