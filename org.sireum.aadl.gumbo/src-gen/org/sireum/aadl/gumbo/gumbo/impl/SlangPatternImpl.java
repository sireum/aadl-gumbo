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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sireum.aadl.gumbo.gumbo.GumboPackage;
import org.sireum.aadl.gumbo.gumbo.OwnedExpression;
import org.sireum.aadl.gumbo.gumbo.SlangPattern;
import org.sireum.aadl.gumbo.gumbo.SlangTPattern;
import org.sireum.aadl.gumbo.gumbo.SlangType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slang Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.SlangPatternImpl#getPatterns <em>Patterns</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.SlangPatternImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.SlangPatternImpl#getInit <em>Init</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SlangPatternImpl extends SlangVarDefImpl implements SlangPattern
{
  /**
   * The cached value of the '{@link #getPatterns() <em>Patterns</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPatterns()
   * @generated
   * @ordered
   */
  protected EList<SlangTPattern> patterns;

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
   * The cached value of the '{@link #getInit() <em>Init</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInit()
   * @generated
   * @ordered
   */
  protected OwnedExpression init;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SlangPatternImpl()
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
    return GumboPackage.Literals.SLANG_PATTERN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<SlangTPattern> getPatterns()
  {
    if (patterns == null)
    {
      patterns = new EObjectContainmentEList<SlangTPattern>(SlangTPattern.class, this, GumboPackage.SLANG_PATTERN__PATTERNS);
    }
    return patterns;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_PATTERN__TYPE_NAME, oldTypeName, newTypeName);
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
        msgs = ((InternalEObject)typeName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_PATTERN__TYPE_NAME, null, msgs);
      if (newTypeName != null)
        msgs = ((InternalEObject)newTypeName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_PATTERN__TYPE_NAME, null, msgs);
      msgs = basicSetTypeName(newTypeName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_PATTERN__TYPE_NAME, newTypeName, newTypeName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OwnedExpression getInit()
  {
    return init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInit(OwnedExpression newInit, NotificationChain msgs)
  {
    OwnedExpression oldInit = init;
    init = newInit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_PATTERN__INIT, oldInit, newInit);
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
  public void setInit(OwnedExpression newInit)
  {
    if (newInit != init)
    {
      NotificationChain msgs = null;
      if (init != null)
        msgs = ((InternalEObject)init).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_PATTERN__INIT, null, msgs);
      if (newInit != null)
        msgs = ((InternalEObject)newInit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_PATTERN__INIT, null, msgs);
      msgs = basicSetInit(newInit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_PATTERN__INIT, newInit, newInit));
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
      case GumboPackage.SLANG_PATTERN__PATTERNS:
        return ((InternalEList<?>)getPatterns()).basicRemove(otherEnd, msgs);
      case GumboPackage.SLANG_PATTERN__TYPE_NAME:
        return basicSetTypeName(null, msgs);
      case GumboPackage.SLANG_PATTERN__INIT:
        return basicSetInit(null, msgs);
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
      case GumboPackage.SLANG_PATTERN__PATTERNS:
        return getPatterns();
      case GumboPackage.SLANG_PATTERN__TYPE_NAME:
        return getTypeName();
      case GumboPackage.SLANG_PATTERN__INIT:
        return getInit();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GumboPackage.SLANG_PATTERN__PATTERNS:
        getPatterns().clear();
        getPatterns().addAll((Collection<? extends SlangTPattern>)newValue);
        return;
      case GumboPackage.SLANG_PATTERN__TYPE_NAME:
        setTypeName((SlangType)newValue);
        return;
      case GumboPackage.SLANG_PATTERN__INIT:
        setInit((OwnedExpression)newValue);
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
      case GumboPackage.SLANG_PATTERN__PATTERNS:
        getPatterns().clear();
        return;
      case GumboPackage.SLANG_PATTERN__TYPE_NAME:
        setTypeName((SlangType)null);
        return;
      case GumboPackage.SLANG_PATTERN__INIT:
        setInit((OwnedExpression)null);
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
      case GumboPackage.SLANG_PATTERN__PATTERNS:
        return patterns != null && !patterns.isEmpty();
      case GumboPackage.SLANG_PATTERN__TYPE_NAME:
        return typeName != null;
      case GumboPackage.SLANG_PATTERN__INIT:
        return init != null;
    }
    return super.eIsSet(featureID);
  }

} //SlangPatternImpl
