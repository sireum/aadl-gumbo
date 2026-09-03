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
 * A representation of the model object '<em><b>Slang Loop Contract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.SlangLoopContract#getInv <em>Inv</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.SlangLoopContract#getMod <em>Mod</em>}</li>
 * </ul>
 *
 * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getSlangLoopContract()
 * @model
 * @generated
 */
public interface SlangLoopContract extends EObject
{
  /**
   * Returns the value of the '<em><b>Inv</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inv</em>' containment reference.
   * @see #setInv(SlangInvariant)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getSlangLoopContract_Inv()
   * @model containment="true"
   * @generated
   */
  SlangInvariant getInv();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.SlangLoopContract#getInv <em>Inv</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inv</em>' containment reference.
   * @see #getInv()
   * @generated
   */
  void setInv(SlangInvariant value);

  /**
   * Returns the value of the '<em><b>Mod</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mod</em>' containment reference.
   * @see #setMod(SlangModifies)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getSlangLoopContract_Mod()
   * @model containment="true"
   * @generated
   */
  SlangModifies getMod();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.SlangLoopContract#getMod <em>Mod</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mod</em>' containment reference.
   * @see #getMod()
   * @generated
   */
  void setMod(SlangModifies value);

} // SlangLoopContract
