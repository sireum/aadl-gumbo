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
 * A representation of the model object '<em><b>Slang Def Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.SlangDefParam#getName <em>Name</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.SlangDefParam#isIsMethodDef <em>Is Method Def</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.SlangDefParam#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.SlangDefParam#isIsVarArg <em>Is Var Arg</em>}</li>
 * </ul>
 *
 * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getSlangDefParam()
 * @model
 * @generated
 */
public interface SlangDefParam extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getSlangDefParam_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.SlangDefParam#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Is Method Def</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Method Def</em>' attribute.
   * @see #setIsMethodDef(boolean)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getSlangDefParam_IsMethodDef()
   * @model
   * @generated
   */
  boolean isIsMethodDef();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.SlangDefParam#isIsMethodDef <em>Is Method Def</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Method Def</em>' attribute.
   * @see #isIsMethodDef()
   * @generated
   */
  void setIsMethodDef(boolean value);

  /**
   * Returns the value of the '<em><b>Type Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Name</em>' containment reference.
   * @see #setTypeName(SlangType)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getSlangDefParam_TypeName()
   * @model containment="true"
   * @generated
   */
  SlangType getTypeName();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.SlangDefParam#getTypeName <em>Type Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Name</em>' containment reference.
   * @see #getTypeName()
   * @generated
   */
  void setTypeName(SlangType value);

  /**
   * Returns the value of the '<em><b>Is Var Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Var Arg</em>' attribute.
   * @see #setIsVarArg(boolean)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getSlangDefParam_IsVarArg()
   * @model
   * @generated
   */
  boolean isIsVarArg();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.SlangDefParam#isIsVarArg <em>Is Var Arg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Var Arg</em>' attribute.
   * @see #isIsVarArg()
   * @generated
   */
  void setIsVarArg(boolean value);

} // SlangDefParam
