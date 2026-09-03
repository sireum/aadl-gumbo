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

import org.sireum.aadl.gumbo.gumbo.GumboPackage;
import org.sireum.aadl.gumbo.gumbo.OwnedExpression;
import org.sireum.aadl.gumbo.gumbo.SlangDefContract;
import org.sireum.aadl.gumbo.gumbo.SlangDefDef;
import org.sireum.aadl.gumbo.gumbo.SlangDefParams;
import org.sireum.aadl.gumbo.gumbo.SlangType;
import org.sireum.aadl.gumbo.gumbo.SlangTypeParams;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slang Def Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.SlangDefDefImpl#getDefMods <em>Def Mods</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.SlangDefDefImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.SlangDefDefImpl#getTypeParams <em>Type Params</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.SlangDefDefImpl#getParams <em>Params</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.SlangDefDefImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.SlangDefDefImpl#getMethodContract <em>Method Contract</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.SlangDefDefImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SlangDefDefImpl extends FuncSpecImpl implements SlangDefDef
{
  /**
   * The default value of the '{@link #getDefMods() <em>Def Mods</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefMods()
   * @generated
   * @ordered
   */
  protected static final String DEF_MODS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDefMods() <em>Def Mods</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefMods()
   * @generated
   * @ordered
   */
  protected String defMods = DEF_MODS_EDEFAULT;

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
   * The cached value of the '{@link #getTypeParams() <em>Type Params</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeParams()
   * @generated
   * @ordered
   */
  protected SlangTypeParams typeParams;

  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected SlangDefParams params;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected SlangType type;

  /**
   * The cached value of the '{@link #getMethodContract() <em>Method Contract</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethodContract()
   * @generated
   * @ordered
   */
  protected SlangDefContract methodContract;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected OwnedExpression body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SlangDefDefImpl()
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
    return GumboPackage.Literals.SLANG_DEF_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDefMods()
  {
    return defMods;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDefMods(String newDefMods)
  {
    String oldDefMods = defMods;
    defMods = newDefMods;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_DEF_DEF__DEF_MODS, oldDefMods, defMods));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_DEF_DEF__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangTypeParams getTypeParams()
  {
    return typeParams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeParams(SlangTypeParams newTypeParams, NotificationChain msgs)
  {
    SlangTypeParams oldTypeParams = typeParams;
    typeParams = newTypeParams;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_DEF_DEF__TYPE_PARAMS, oldTypeParams, newTypeParams);
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
  public void setTypeParams(SlangTypeParams newTypeParams)
  {
    if (newTypeParams != typeParams)
    {
      NotificationChain msgs = null;
      if (typeParams != null)
        msgs = ((InternalEObject)typeParams).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_DEF_DEF__TYPE_PARAMS, null, msgs);
      if (newTypeParams != null)
        msgs = ((InternalEObject)newTypeParams).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_DEF_DEF__TYPE_PARAMS, null, msgs);
      msgs = basicSetTypeParams(newTypeParams, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_DEF_DEF__TYPE_PARAMS, newTypeParams, newTypeParams));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangDefParams getParams()
  {
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParams(SlangDefParams newParams, NotificationChain msgs)
  {
    SlangDefParams oldParams = params;
    params = newParams;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_DEF_DEF__PARAMS, oldParams, newParams);
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
  public void setParams(SlangDefParams newParams)
  {
    if (newParams != params)
    {
      NotificationChain msgs = null;
      if (params != null)
        msgs = ((InternalEObject)params).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_DEF_DEF__PARAMS, null, msgs);
      if (newParams != null)
        msgs = ((InternalEObject)newParams).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_DEF_DEF__PARAMS, null, msgs);
      msgs = basicSetParams(newParams, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_DEF_DEF__PARAMS, newParams, newParams));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(SlangType newType, NotificationChain msgs)
  {
    SlangType oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_DEF_DEF__TYPE, oldType, newType);
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
  public void setType(SlangType newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_DEF_DEF__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_DEF_DEF__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_DEF_DEF__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangDefContract getMethodContract()
  {
    return methodContract;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMethodContract(SlangDefContract newMethodContract, NotificationChain msgs)
  {
    SlangDefContract oldMethodContract = methodContract;
    methodContract = newMethodContract;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_DEF_DEF__METHOD_CONTRACT, oldMethodContract, newMethodContract);
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
  public void setMethodContract(SlangDefContract newMethodContract)
  {
    if (newMethodContract != methodContract)
    {
      NotificationChain msgs = null;
      if (methodContract != null)
        msgs = ((InternalEObject)methodContract).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_DEF_DEF__METHOD_CONTRACT, null, msgs);
      if (newMethodContract != null)
        msgs = ((InternalEObject)newMethodContract).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_DEF_DEF__METHOD_CONTRACT, null, msgs);
      msgs = basicSetMethodContract(newMethodContract, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_DEF_DEF__METHOD_CONTRACT, newMethodContract, newMethodContract));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OwnedExpression getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(OwnedExpression newBody, NotificationChain msgs)
  {
    OwnedExpression oldBody = body;
    body = newBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_DEF_DEF__BODY, oldBody, newBody);
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
  public void setBody(OwnedExpression newBody)
  {
    if (newBody != body)
    {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_DEF_DEF__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_DEF_DEF__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_DEF_DEF__BODY, newBody, newBody));
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
      case GumboPackage.SLANG_DEF_DEF__TYPE_PARAMS:
        return basicSetTypeParams(null, msgs);
      case GumboPackage.SLANG_DEF_DEF__PARAMS:
        return basicSetParams(null, msgs);
      case GumboPackage.SLANG_DEF_DEF__TYPE:
        return basicSetType(null, msgs);
      case GumboPackage.SLANG_DEF_DEF__METHOD_CONTRACT:
        return basicSetMethodContract(null, msgs);
      case GumboPackage.SLANG_DEF_DEF__BODY:
        return basicSetBody(null, msgs);
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
      case GumboPackage.SLANG_DEF_DEF__DEF_MODS:
        return getDefMods();
      case GumboPackage.SLANG_DEF_DEF__NAME:
        return getName();
      case GumboPackage.SLANG_DEF_DEF__TYPE_PARAMS:
        return getTypeParams();
      case GumboPackage.SLANG_DEF_DEF__PARAMS:
        return getParams();
      case GumboPackage.SLANG_DEF_DEF__TYPE:
        return getType();
      case GumboPackage.SLANG_DEF_DEF__METHOD_CONTRACT:
        return getMethodContract();
      case GumboPackage.SLANG_DEF_DEF__BODY:
        return getBody();
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
      case GumboPackage.SLANG_DEF_DEF__DEF_MODS:
        setDefMods((String)newValue);
        return;
      case GumboPackage.SLANG_DEF_DEF__NAME:
        setName((String)newValue);
        return;
      case GumboPackage.SLANG_DEF_DEF__TYPE_PARAMS:
        setTypeParams((SlangTypeParams)newValue);
        return;
      case GumboPackage.SLANG_DEF_DEF__PARAMS:
        setParams((SlangDefParams)newValue);
        return;
      case GumboPackage.SLANG_DEF_DEF__TYPE:
        setType((SlangType)newValue);
        return;
      case GumboPackage.SLANG_DEF_DEF__METHOD_CONTRACT:
        setMethodContract((SlangDefContract)newValue);
        return;
      case GumboPackage.SLANG_DEF_DEF__BODY:
        setBody((OwnedExpression)newValue);
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
      case GumboPackage.SLANG_DEF_DEF__DEF_MODS:
        setDefMods(DEF_MODS_EDEFAULT);
        return;
      case GumboPackage.SLANG_DEF_DEF__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GumboPackage.SLANG_DEF_DEF__TYPE_PARAMS:
        setTypeParams((SlangTypeParams)null);
        return;
      case GumboPackage.SLANG_DEF_DEF__PARAMS:
        setParams((SlangDefParams)null);
        return;
      case GumboPackage.SLANG_DEF_DEF__TYPE:
        setType((SlangType)null);
        return;
      case GumboPackage.SLANG_DEF_DEF__METHOD_CONTRACT:
        setMethodContract((SlangDefContract)null);
        return;
      case GumboPackage.SLANG_DEF_DEF__BODY:
        setBody((OwnedExpression)null);
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
      case GumboPackage.SLANG_DEF_DEF__DEF_MODS:
        return DEF_MODS_EDEFAULT == null ? defMods != null : !DEF_MODS_EDEFAULT.equals(defMods);
      case GumboPackage.SLANG_DEF_DEF__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GumboPackage.SLANG_DEF_DEF__TYPE_PARAMS:
        return typeParams != null;
      case GumboPackage.SLANG_DEF_DEF__PARAMS:
        return params != null;
      case GumboPackage.SLANG_DEF_DEF__TYPE:
        return type != null;
      case GumboPackage.SLANG_DEF_DEF__METHOD_CONTRACT:
        return methodContract != null;
      case GumboPackage.SLANG_DEF_DEF__BODY:
        return body != null;
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
    result.append(" (defMods: ");
    result.append(defMods);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //SlangDefDefImpl
