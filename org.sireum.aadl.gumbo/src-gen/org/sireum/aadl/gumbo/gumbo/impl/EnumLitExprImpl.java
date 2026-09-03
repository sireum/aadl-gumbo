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
package org.sireum.aadl.gumbo.gumbo.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.aadl2.DataClassifier;
import org.osate.aadl2.StringLiteral;

import org.sireum.aadl.gumbo.gumbo.EnumLitExpr;
import org.sireum.aadl.gumbo.gumbo.GumboPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Lit Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.EnumLitExprImpl#getEnumType <em>Enum Type</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.EnumLitExprImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumLitExprImpl extends GExprImpl implements EnumLitExpr
{
  /**
   * The cached value of the '{@link #getEnumType() <em>Enum Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnumType()
   * @generated
   * @ordered
   */
  protected DataClassifier enumType;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected StringLiteral value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnumLitExprImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GumboPackage.Literals.ENUM_LIT_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DataClassifier getEnumType()
  {
    if (enumType != null && ((EObject)enumType).eIsProxy())
    {
      InternalEObject oldEnumType = (InternalEObject)enumType;
      enumType = (DataClassifier)eResolveProxy(oldEnumType);
      if (enumType != oldEnumType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GumboPackage.ENUM_LIT_EXPR__ENUM_TYPE, oldEnumType, enumType));
      }
    }
    return enumType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataClassifier basicGetEnumType()
  {
    return enumType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEnumType(DataClassifier newEnumType)
  {
    DataClassifier oldEnumType = enumType;
    enumType = newEnumType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.ENUM_LIT_EXPR__ENUM_TYPE, oldEnumType, enumType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StringLiteral getValue()
  {
    if (value != null && ((EObject)value).eIsProxy())
    {
      InternalEObject oldValue = (InternalEObject)value;
      value = (StringLiteral)eResolveProxy(oldValue);
      if (value != oldValue)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GumboPackage.ENUM_LIT_EXPR__VALUE, oldValue, value));
      }
    }
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral basicGetValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setValue(StringLiteral newValue)
  {
    StringLiteral oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.ENUM_LIT_EXPR__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GumboPackage.ENUM_LIT_EXPR__ENUM_TYPE:
        if (resolve) return getEnumType();
        return basicGetEnumType();
      case GumboPackage.ENUM_LIT_EXPR__VALUE:
        if (resolve) return getValue();
        return basicGetValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GumboPackage.ENUM_LIT_EXPR__ENUM_TYPE:
        setEnumType((DataClassifier)newValue);
        return;
      case GumboPackage.ENUM_LIT_EXPR__VALUE:
        setValue((StringLiteral)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GumboPackage.ENUM_LIT_EXPR__ENUM_TYPE:
        setEnumType((DataClassifier)null);
        return;
      case GumboPackage.ENUM_LIT_EXPR__VALUE:
        setValue((StringLiteral)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GumboPackage.ENUM_LIT_EXPR__ENUM_TYPE:
        return enumType != null;
      case GumboPackage.ENUM_LIT_EXPR__VALUE:
        return value != null;
    }
    return super.eIsSet(featureID);
  }

} //EnumLitExprImpl
