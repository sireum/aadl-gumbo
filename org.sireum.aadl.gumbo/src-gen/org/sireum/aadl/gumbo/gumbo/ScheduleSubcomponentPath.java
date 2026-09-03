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

import org.osate.aadl2.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedule Subcomponent Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.ScheduleSubcomponentPath#getSubcomponent <em>Subcomponent</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.ScheduleSubcomponentPath#getSubPath <em>Sub Path</em>}</li>
 * </ul>
 *
 * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getScheduleSubcomponentPath()
 * @model
 * @generated
 */
public interface ScheduleSubcomponentPath extends EObject
{
  /**
   * Returns the value of the '<em><b>Subcomponent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subcomponent</em>' reference.
   * @see #setSubcomponent(NamedElement)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getScheduleSubcomponentPath_Subcomponent()
   * @model
   * @generated
   */
  NamedElement getSubcomponent();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.ScheduleSubcomponentPath#getSubcomponent <em>Subcomponent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subcomponent</em>' reference.
   * @see #getSubcomponent()
   * @generated
   */
  void setSubcomponent(NamedElement value);

  /**
   * Returns the value of the '<em><b>Sub Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Path</em>' containment reference.
   * @see #setSubPath(ScheduleSubcomponentPath)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getScheduleSubcomponentPath_SubPath()
   * @model containment="true"
   * @generated
   */
  ScheduleSubcomponentPath getSubPath();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.ScheduleSubcomponentPath#getSubPath <em>Sub Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sub Path</em>' containment reference.
   * @see #getSubPath()
   * @generated
   */
  void setSubPath(ScheduleSubcomponentPath value);

} // ScheduleSubcomponentPath
