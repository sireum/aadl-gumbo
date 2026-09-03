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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sireum.aadl.gumbo.gumbo.GumboPackage;
import org.sireum.aadl.gumbo.gumbo.OwnedExpression;
import org.sireum.aadl.gumbo.gumbo.SlangCase;
import org.sireum.aadl.gumbo.gumbo.SlangPattern;
import org.sireum.aadl.gumbo.gumbo.SlangStmt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slang Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.SlangCaseImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.SlangCaseImpl#getE <em>E</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.SlangCaseImpl#getS <em>S</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SlangCaseImpl extends MinimalEObjectImpl.Container implements SlangCase
{
  /**
   * The cached value of the '{@link #getPattern() <em>Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPattern()
   * @generated
   * @ordered
   */
  protected SlangPattern pattern;

  /**
   * The cached value of the '{@link #getE() <em>E</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE()
   * @generated
   * @ordered
   */
  protected OwnedExpression e;

  /**
   * The cached value of the '{@link #getS() <em>S</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getS()
   * @generated
   * @ordered
   */
  protected EList<SlangStmt> s;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SlangCaseImpl()
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
    return GumboPackage.Literals.SLANG_CASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangPattern getPattern()
  {
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPattern(SlangPattern newPattern, NotificationChain msgs)
  {
    SlangPattern oldPattern = pattern;
    pattern = newPattern;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_CASE__PATTERN, oldPattern, newPattern);
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
  public void setPattern(SlangPattern newPattern)
  {
    if (newPattern != pattern)
    {
      NotificationChain msgs = null;
      if (pattern != null)
        msgs = ((InternalEObject)pattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_CASE__PATTERN, null, msgs);
      if (newPattern != null)
        msgs = ((InternalEObject)newPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_CASE__PATTERN, null, msgs);
      msgs = basicSetPattern(newPattern, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_CASE__PATTERN, newPattern, newPattern));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OwnedExpression getE()
  {
    return e;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetE(OwnedExpression newE, NotificationChain msgs)
  {
    OwnedExpression oldE = e;
    e = newE;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_CASE__E, oldE, newE);
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
  public void setE(OwnedExpression newE)
  {
    if (newE != e)
    {
      NotificationChain msgs = null;
      if (e != null)
        msgs = ((InternalEObject)e).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_CASE__E, null, msgs);
      if (newE != null)
        msgs = ((InternalEObject)newE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_CASE__E, null, msgs);
      msgs = basicSetE(newE, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_CASE__E, newE, newE));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<SlangStmt> getS()
  {
    if (s == null)
    {
      s = new EObjectContainmentEList<SlangStmt>(SlangStmt.class, this, GumboPackage.SLANG_CASE__S);
    }
    return s;
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
      case GumboPackage.SLANG_CASE__PATTERN:
        return basicSetPattern(null, msgs);
      case GumboPackage.SLANG_CASE__E:
        return basicSetE(null, msgs);
      case GumboPackage.SLANG_CASE__S:
        return ((InternalEList<?>)getS()).basicRemove(otherEnd, msgs);
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
      case GumboPackage.SLANG_CASE__PATTERN:
        return getPattern();
      case GumboPackage.SLANG_CASE__E:
        return getE();
      case GumboPackage.SLANG_CASE__S:
        return getS();
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
      case GumboPackage.SLANG_CASE__PATTERN:
        setPattern((SlangPattern)newValue);
        return;
      case GumboPackage.SLANG_CASE__E:
        setE((OwnedExpression)newValue);
        return;
      case GumboPackage.SLANG_CASE__S:
        getS().clear();
        getS().addAll((Collection<? extends SlangStmt>)newValue);
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
      case GumboPackage.SLANG_CASE__PATTERN:
        setPattern((SlangPattern)null);
        return;
      case GumboPackage.SLANG_CASE__E:
        setE((OwnedExpression)null);
        return;
      case GumboPackage.SLANG_CASE__S:
        getS().clear();
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
      case GumboPackage.SLANG_CASE__PATTERN:
        return pattern != null;
      case GumboPackage.SLANG_CASE__E:
        return e != null;
      case GumboPackage.SLANG_CASE__S:
        return s != null && !s.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SlangCaseImpl
