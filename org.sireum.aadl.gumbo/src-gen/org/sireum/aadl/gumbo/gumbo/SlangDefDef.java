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
 * A representation of the model object '<em><b>Slang Def Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.SlangDefDef#getDefMods <em>Def Mods</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.SlangDefDef#getName <em>Name</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.SlangDefDef#getTypeParams <em>Type Params</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.SlangDefDef#getParams <em>Params</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.SlangDefDef#getType <em>Type</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.SlangDefDef#getMethodContract <em>Method Contract</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.SlangDefDef#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getSlangDefDef()
 * @model
 * @generated
 */
public interface SlangDefDef extends FuncSpec
{
  /**
   * Returns the value of the '<em><b>Def Mods</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Def Mods</em>' attribute.
   * @see #setDefMods(String)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getSlangDefDef_DefMods()
   * @model
   * @generated
   */
  String getDefMods();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.SlangDefDef#getDefMods <em>Def Mods</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Def Mods</em>' attribute.
   * @see #getDefMods()
   * @generated
   */
  void setDefMods(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getSlangDefDef_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.SlangDefDef#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Params</em>' containment reference.
   * @see #setTypeParams(SlangTypeParams)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getSlangDefDef_TypeParams()
   * @model containment="true"
   * @generated
   */
  SlangTypeParams getTypeParams();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.SlangDefDef#getTypeParams <em>Type Params</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Params</em>' containment reference.
   * @see #getTypeParams()
   * @generated
   */
  void setTypeParams(SlangTypeParams value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference.
   * @see #setParams(SlangDefParams)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getSlangDefDef_Params()
   * @model containment="true"
   * @generated
   */
  SlangDefParams getParams();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.SlangDefDef#getParams <em>Params</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Params</em>' containment reference.
   * @see #getParams()
   * @generated
   */
  void setParams(SlangDefParams value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(SlangType)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getSlangDefDef_Type()
   * @model containment="true"
   * @generated
   */
  SlangType getType();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.SlangDefDef#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(SlangType value);

  /**
   * Returns the value of the '<em><b>Method Contract</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method Contract</em>' containment reference.
   * @see #setMethodContract(SlangDefContract)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getSlangDefDef_MethodContract()
   * @model containment="true"
   * @generated
   */
  SlangDefContract getMethodContract();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.SlangDefDef#getMethodContract <em>Method Contract</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method Contract</em>' containment reference.
   * @see #getMethodContract()
   * @generated
   */
  void setMethodContract(SlangDefContract value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(OwnedExpression)
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#getSlangDefDef_Body()
   * @model containment="true"
   * @generated
   */
  OwnedExpression getBody();

  /**
   * Sets the value of the '{@link org.sireum.aadl.gumbo.gumbo.SlangDefDef#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(OwnedExpression value);

} // SlangDefDef
