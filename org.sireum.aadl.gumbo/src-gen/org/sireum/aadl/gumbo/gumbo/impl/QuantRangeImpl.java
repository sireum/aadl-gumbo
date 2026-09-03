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
import org.sireum.aadl.gumbo.gumbo.QuantRange;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quant Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.QuantRangeImpl#getLo <em>Lo</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.QuantRangeImpl#getExtent <em>Extent</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.QuantRangeImpl#getHigh <em>High</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuantRangeImpl extends MinimalEObjectImpl.Container implements QuantRange
{
  /**
   * The cached value of the '{@link #getLo() <em>Lo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLo()
   * @generated
   * @ordered
   */
  protected OwnedExpression lo;

  /**
   * The default value of the '{@link #getExtent() <em>Extent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtent()
   * @generated
   * @ordered
   */
  protected static final String EXTENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExtent() <em>Extent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtent()
   * @generated
   * @ordered
   */
  protected String extent = EXTENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getHigh() <em>High</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHigh()
   * @generated
   * @ordered
   */
  protected OwnedExpression high;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QuantRangeImpl()
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
    return GumboPackage.Literals.QUANT_RANGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OwnedExpression getLo()
  {
    return lo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLo(OwnedExpression newLo, NotificationChain msgs)
  {
    OwnedExpression oldLo = lo;
    lo = newLo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.QUANT_RANGE__LO, oldLo, newLo);
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
  public void setLo(OwnedExpression newLo)
  {
    if (newLo != lo)
    {
      NotificationChain msgs = null;
      if (lo != null)
        msgs = ((InternalEObject)lo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.QUANT_RANGE__LO, null, msgs);
      if (newLo != null)
        msgs = ((InternalEObject)newLo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.QUANT_RANGE__LO, null, msgs);
      msgs = basicSetLo(newLo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.QUANT_RANGE__LO, newLo, newLo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getExtent()
  {
    return extent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExtent(String newExtent)
  {
    String oldExtent = extent;
    extent = newExtent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.QUANT_RANGE__EXTENT, oldExtent, extent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OwnedExpression getHigh()
  {
    return high;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHigh(OwnedExpression newHigh, NotificationChain msgs)
  {
    OwnedExpression oldHigh = high;
    high = newHigh;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.QUANT_RANGE__HIGH, oldHigh, newHigh);
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
  public void setHigh(OwnedExpression newHigh)
  {
    if (newHigh != high)
    {
      NotificationChain msgs = null;
      if (high != null)
        msgs = ((InternalEObject)high).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.QUANT_RANGE__HIGH, null, msgs);
      if (newHigh != null)
        msgs = ((InternalEObject)newHigh).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.QUANT_RANGE__HIGH, null, msgs);
      msgs = basicSetHigh(newHigh, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.QUANT_RANGE__HIGH, newHigh, newHigh));
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
      case GumboPackage.QUANT_RANGE__LO:
        return basicSetLo(null, msgs);
      case GumboPackage.QUANT_RANGE__HIGH:
        return basicSetHigh(null, msgs);
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
      case GumboPackage.QUANT_RANGE__LO:
        return getLo();
      case GumboPackage.QUANT_RANGE__EXTENT:
        return getExtent();
      case GumboPackage.QUANT_RANGE__HIGH:
        return getHigh();
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
      case GumboPackage.QUANT_RANGE__LO:
        setLo((OwnedExpression)newValue);
        return;
      case GumboPackage.QUANT_RANGE__EXTENT:
        setExtent((String)newValue);
        return;
      case GumboPackage.QUANT_RANGE__HIGH:
        setHigh((OwnedExpression)newValue);
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
      case GumboPackage.QUANT_RANGE__LO:
        setLo((OwnedExpression)null);
        return;
      case GumboPackage.QUANT_RANGE__EXTENT:
        setExtent(EXTENT_EDEFAULT);
        return;
      case GumboPackage.QUANT_RANGE__HIGH:
        setHigh((OwnedExpression)null);
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
      case GumboPackage.QUANT_RANGE__LO:
        return lo != null;
      case GumboPackage.QUANT_RANGE__EXTENT:
        return EXTENT_EDEFAULT == null ? extent != null : !EXTENT_EDEFAULT.equals(extent);
      case GumboPackage.QUANT_RANGE__HIGH:
        return high != null;
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
    result.append(" (extent: ");
    result.append(extent);
    result.append(')');
    return result.toString();
  }

} //QuantRangeImpl
