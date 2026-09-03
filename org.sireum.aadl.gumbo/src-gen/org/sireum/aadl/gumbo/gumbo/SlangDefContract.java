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
 * A representation of the model object '<em><b>Slang Def Contract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.SlangDefContract#getReads <em>Reads</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.SlangDefContract#getRequires <em>Requires</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.SlangDefContract#getModifies <em>Modifies</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.SlangDefContract#getEnsures <em>Ensures</em>}</li>
 * </ul>
 *
 * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getSlangDefContract()
 * @model
 * @generated
 */
public interface SlangDefContract extends EObject
{
  /**
   * Returns the value of the '<em><b>Reads</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reads</em>' containment reference.
   * @see #setReads(SlangReads)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getSlangDefContract_Reads()
   * @model containment="true"
   * @generated
   */
  SlangReads getReads();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.SlangDefContract#getReads <em>Reads</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reads</em>' containment reference.
   * @see #getReads()
   * @generated
   */
  void setReads(SlangReads value);

  /**
   * Returns the value of the '<em><b>Requires</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Requires</em>' containment reference.
   * @see #setRequires(SlangRequires)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getSlangDefContract_Requires()
   * @model containment="true"
   * @generated
   */
  SlangRequires getRequires();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.SlangDefContract#getRequires <em>Requires</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Requires</em>' containment reference.
   * @see #getRequires()
   * @generated
   */
  void setRequires(SlangRequires value);

  /**
   * Returns the value of the '<em><b>Modifies</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifies</em>' containment reference.
   * @see #setModifies(SlangModifies)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getSlangDefContract_Modifies()
   * @model containment="true"
   * @generated
   */
  SlangModifies getModifies();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.SlangDefContract#getModifies <em>Modifies</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modifies</em>' containment reference.
   * @see #getModifies()
   * @generated
   */
  void setModifies(SlangModifies value);

  /**
   * Returns the value of the '<em><b>Ensures</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ensures</em>' containment reference.
   * @see #setEnsures(SlangEnsures)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getSlangDefContract_Ensures()
   * @model containment="true"
   * @generated
   */
  SlangEnsures getEnsures();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.SlangDefContract#getEnsures <em>Ensures</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ensures</em>' containment reference.
   * @see #getEnsures()
   * @generated
   */
  void setEnsures(SlangEnsures value);

} // SlangDefContract
