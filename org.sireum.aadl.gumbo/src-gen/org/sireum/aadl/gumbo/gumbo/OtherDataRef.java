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

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.ArrayRange;
import org.osate.aadl2.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Other Data Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.OtherDataRef#getNamedElement <em>Named Element</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.OtherDataRef#getArrayRange <em>Array Range</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.OtherDataRef#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getOtherDataRef()
 * @model
 * @generated
 */
public interface OtherDataRef extends EObject
{
  /**
   * Returns the value of the '<em><b>Named Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Named Element</em>' reference.
   * @see #setNamedElement(NamedElement)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getOtherDataRef_NamedElement()
   * @model
   * @generated
   */
  NamedElement getNamedElement();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.OtherDataRef#getNamedElement <em>Named Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Named Element</em>' reference.
   * @see #getNamedElement()
   * @generated
   */
  void setNamedElement(NamedElement value);

  /**
   * Returns the value of the '<em><b>Array Range</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.aadl2.ArrayRange}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array Range</em>' containment reference list.
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getOtherDataRef_ArrayRange()
   * @model containment="true"
   * @generated
   */
  EList<ArrayRange> getArrayRange();

  /**
   * Returns the value of the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' containment reference.
   * @see #setPath(OtherDataRef)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getOtherDataRef_Path()
   * @model containment="true"
   * @generated
   */
  OtherDataRef getPath();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.OtherDataRef#getPath <em>Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' containment reference.
   * @see #getPath()
   * @generated
   */
  void setPath(OtherDataRef value);

} // OtherDataRef
