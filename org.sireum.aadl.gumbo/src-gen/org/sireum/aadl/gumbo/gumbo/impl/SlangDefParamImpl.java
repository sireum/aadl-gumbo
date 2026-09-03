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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.sireum.aadl.gumbo.gumbo.GumboPackage;
import org.sireum.aadl.gumbo.gumbo.SlangDefParam;
import org.sireum.aadl.gumbo.gumbo.SlangType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slang Def Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.SlangDefParamImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.SlangDefParamImpl#isIsMethodDef <em>Is Method Def</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.SlangDefParamImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.SlangDefParamImpl#isIsVarArg <em>Is Var Arg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SlangDefParamImpl extends MinimalEObjectImpl.Container implements SlangDefParam
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #isIsMethodDef() <em>Is Method Def</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsMethodDef()
   * @generated
   * @ordered
   */
  protected static final boolean IS_METHOD_DEF_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsMethodDef() <em>Is Method Def</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsMethodDef()
   * @generated
   * @ordered
   */
  protected boolean isMethodDef = IS_METHOD_DEF_EDEFAULT;

  /**
   * The cached value of the '{@link #getTypeName() <em>Type Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeName()
   * @generated
   * @ordered
   */
  protected SlangType typeName;

  /**
   * The default value of the '{@link #isIsVarArg() <em>Is Var Arg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsVarArg()
   * @generated
   * @ordered
   */
  protected static final boolean IS_VAR_ARG_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsVarArg() <em>Is Var Arg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsVarArg()
   * @generated
   * @ordered
   */
  protected boolean isVarArg = IS_VAR_ARG_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SlangDefParamImpl()
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
    return GumboPackage.Literals.SLANG_DEF_PARAM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_DEF_PARAM__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isIsMethodDef()
  {
    return isMethodDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIsMethodDef(boolean newIsMethodDef)
  {
    boolean oldIsMethodDef = isMethodDef;
    isMethodDef = newIsMethodDef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_DEF_PARAM__IS_METHOD_DEF, oldIsMethodDef, isMethodDef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangType getTypeName()
  {
    return typeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeName(SlangType newTypeName, NotificationChain msgs)
  {
    SlangType oldTypeName = typeName;
    typeName = newTypeName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_DEF_PARAM__TYPE_NAME, oldTypeName, newTypeName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTypeName(SlangType newTypeName)
  {
    if (newTypeName != typeName)
    {
      NotificationChain msgs = null;
      if (typeName != null)
        msgs = ((InternalEObject)typeName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_DEF_PARAM__TYPE_NAME, null, msgs);
      if (newTypeName != null)
        msgs = ((InternalEObject)newTypeName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_DEF_PARAM__TYPE_NAME, null, msgs);
      msgs = basicSetTypeName(newTypeName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_DEF_PARAM__TYPE_NAME, newTypeName, newTypeName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isIsVarArg()
  {
    return isVarArg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIsVarArg(boolean newIsVarArg)
  {
    boolean oldIsVarArg = isVarArg;
    isVarArg = newIsVarArg;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_DEF_PARAM__IS_VAR_ARG, oldIsVarArg, isVarArg));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GumboPackage.SLANG_DEF_PARAM__TYPE_NAME:
        return basicSetTypeName(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case GumboPackage.SLANG_DEF_PARAM__NAME:
        return getName();
      case GumboPackage.SLANG_DEF_PARAM__IS_METHOD_DEF:
        return isIsMethodDef();
      case GumboPackage.SLANG_DEF_PARAM__TYPE_NAME:
        return getTypeName();
      case GumboPackage.SLANG_DEF_PARAM__IS_VAR_ARG:
        return isIsVarArg();
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
      case GumboPackage.SLANG_DEF_PARAM__NAME:
        setName((String)newValue);
        return;
      case GumboPackage.SLANG_DEF_PARAM__IS_METHOD_DEF:
        setIsMethodDef((Boolean)newValue);
        return;
      case GumboPackage.SLANG_DEF_PARAM__TYPE_NAME:
        setTypeName((SlangType)newValue);
        return;
      case GumboPackage.SLANG_DEF_PARAM__IS_VAR_ARG:
        setIsVarArg((Boolean)newValue);
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
      case GumboPackage.SLANG_DEF_PARAM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GumboPackage.SLANG_DEF_PARAM__IS_METHOD_DEF:
        setIsMethodDef(IS_METHOD_DEF_EDEFAULT);
        return;
      case GumboPackage.SLANG_DEF_PARAM__TYPE_NAME:
        setTypeName((SlangType)null);
        return;
      case GumboPackage.SLANG_DEF_PARAM__IS_VAR_ARG:
        setIsVarArg(IS_VAR_ARG_EDEFAULT);
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
      case GumboPackage.SLANG_DEF_PARAM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GumboPackage.SLANG_DEF_PARAM__IS_METHOD_DEF:
        return isMethodDef != IS_METHOD_DEF_EDEFAULT;
      case GumboPackage.SLANG_DEF_PARAM__TYPE_NAME:
        return typeName != null;
      case GumboPackage.SLANG_DEF_PARAM__IS_VAR_ARG:
        return isVarArg != IS_VAR_ARG_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", isMethodDef: ");
    result.append(isMethodDef);
    result.append(", isVarArg: ");
    result.append(isVarArg);
    result.append(')');
    return result.toString();
  }

} //SlangDefParamImpl
