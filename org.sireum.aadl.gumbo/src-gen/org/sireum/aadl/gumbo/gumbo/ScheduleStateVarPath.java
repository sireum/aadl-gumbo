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
 * A representation of the model object '<em><b>Schedule State Var Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.ScheduleStateVarPath#getRef <em>Ref</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.ScheduleStateVarPath#getSubPath <em>Sub Path</em>}</li>
 * </ul>
 *
 * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getScheduleStateVarPath()
 * @model
 * @generated
 */
public interface ScheduleStateVarPath extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(EObject)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getScheduleStateVarPath_Ref()
   * @model
   * @generated
   */
  EObject getRef();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.ScheduleStateVarPath#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(EObject value);

  /**
   * Returns the value of the '<em><b>Sub Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Path</em>' containment reference.
   * @see #setSubPath(ScheduleStateVarPath)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getScheduleStateVarPath_SubPath()
   * @model containment="true"
   * @generated
   */
  ScheduleStateVarPath getSubPath();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.ScheduleStateVarPath#getSubPath <em>Sub Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sub Path</em>' containment reference.
   * @see #getSubPath()
   * @generated
   */
  void setSubPath(ScheduleStateVarPath value);

} // ScheduleStateVarPath
