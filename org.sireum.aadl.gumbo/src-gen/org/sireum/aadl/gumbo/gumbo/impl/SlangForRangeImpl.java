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
import org.sireum.aadl.gumbo.gumbo.OwnedExpression;
import org.sireum.aadl.gumbo.gumbo.SlangForRange;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slang For Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.SlangForRangeImpl#getE <em>E</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.SlangForRangeImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.SlangForRangeImpl#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SlangForRangeImpl extends MinimalEObjectImpl.Container implements SlangForRange
{
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
   * The cached value of the '{@link #getUpper() <em>Upper</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpper()
   * @generated
   * @ordered
   */
  protected OwnedExpression upper;

  /**
   * The cached value of the '{@link #getStep() <em>Step</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStep()
   * @generated
   * @ordered
   */
  protected OwnedExpression step;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SlangForRangeImpl()
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
    return GumboPackage.Literals.SLANG_FOR_RANGE;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_FOR_RANGE__E, oldE, newE);
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
        msgs = ((InternalEObject)e).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_FOR_RANGE__E, null, msgs);
      if (newE != null)
        msgs = ((InternalEObject)newE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_FOR_RANGE__E, null, msgs);
      msgs = basicSetE(newE, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_FOR_RANGE__E, newE, newE));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OwnedExpression getUpper()
  {
    return upper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUpper(OwnedExpression newUpper, NotificationChain msgs)
  {
    OwnedExpression oldUpper = upper;
    upper = newUpper;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_FOR_RANGE__UPPER, oldUpper, newUpper);
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
  public void setUpper(OwnedExpression newUpper)
  {
    if (newUpper != upper)
    {
      NotificationChain msgs = null;
      if (upper != null)
        msgs = ((InternalEObject)upper).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_FOR_RANGE__UPPER, null, msgs);
      if (newUpper != null)
        msgs = ((InternalEObject)newUpper).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_FOR_RANGE__UPPER, null, msgs);
      msgs = basicSetUpper(newUpper, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_FOR_RANGE__UPPER, newUpper, newUpper));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OwnedExpression getStep()
  {
    return step;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStep(OwnedExpression newStep, NotificationChain msgs)
  {
    OwnedExpression oldStep = step;
    step = newStep;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_FOR_RANGE__STEP, oldStep, newStep);
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
  public void setStep(OwnedExpression newStep)
  {
    if (newStep != step)
    {
      NotificationChain msgs = null;
      if (step != null)
        msgs = ((InternalEObject)step).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_FOR_RANGE__STEP, null, msgs);
      if (newStep != null)
        msgs = ((InternalEObject)newStep).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_FOR_RANGE__STEP, null, msgs);
      msgs = basicSetStep(newStep, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_FOR_RANGE__STEP, newStep, newStep));
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
      case GumboPackage.SLANG_FOR_RANGE__E:
        return basicSetE(null, msgs);
      case GumboPackage.SLANG_FOR_RANGE__UPPER:
        return basicSetUpper(null, msgs);
      case GumboPackage.SLANG_FOR_RANGE__STEP:
        return basicSetStep(null, msgs);
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
      case GumboPackage.SLANG_FOR_RANGE__E:
        return getE();
      case GumboPackage.SLANG_FOR_RANGE__UPPER:
        return getUpper();
      case GumboPackage.SLANG_FOR_RANGE__STEP:
        return getStep();
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
      case GumboPackage.SLANG_FOR_RANGE__E:
        setE((OwnedExpression)newValue);
        return;
      case GumboPackage.SLANG_FOR_RANGE__UPPER:
        setUpper((OwnedExpression)newValue);
        return;
      case GumboPackage.SLANG_FOR_RANGE__STEP:
        setStep((OwnedExpression)newValue);
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
      case GumboPackage.SLANG_FOR_RANGE__E:
        setE((OwnedExpression)null);
        return;
      case GumboPackage.SLANG_FOR_RANGE__UPPER:
        setUpper((OwnedExpression)null);
        return;
      case GumboPackage.SLANG_FOR_RANGE__STEP:
        setStep((OwnedExpression)null);
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
      case GumboPackage.SLANG_FOR_RANGE__E:
        return e != null;
      case GumboPackage.SLANG_FOR_RANGE__UPPER:
        return upper != null;
      case GumboPackage.SLANG_FOR_RANGE__STEP:
        return step != null;
    }
    return super.eIsSet(featureID);
  }

} //SlangForRangeImpl
