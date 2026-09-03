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
import org.sireum.aadl.gumbo.gumbo.QuantParam;
import org.sireum.aadl.gumbo.gumbo.QuantRange;
import org.sireum.aadl.gumbo.gumbo.QuantifiedExp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantified Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.QuantifiedExpImpl#getQuantifier <em>Quantifier</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.QuantifiedExpImpl#getQuantRange <em>Quant Range</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.QuantifiedExpImpl#getQuantParam <em>Quant Param</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.QuantifiedExpImpl#getQuantifiedExpr <em>Quantified Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuantifiedExpImpl extends GExprImpl implements QuantifiedExp
{
  /**
   * The default value of the '{@link #getQuantifier() <em>Quantifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuantifier()
   * @generated
   * @ordered
   */
  protected static final String QUANTIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getQuantifier() <em>Quantifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuantifier()
   * @generated
   * @ordered
   */
  protected String quantifier = QUANTIFIER_EDEFAULT;

  /**
   * The cached value of the '{@link #getQuantRange() <em>Quant Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuantRange()
   * @generated
   * @ordered
   */
  protected QuantRange quantRange;

  /**
   * The cached value of the '{@link #getQuantParam() <em>Quant Param</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuantParam()
   * @generated
   * @ordered
   */
  protected QuantParam quantParam;

  /**
   * The cached value of the '{@link #getQuantifiedExpr() <em>Quantified Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuantifiedExpr()
   * @generated
   * @ordered
   */
  protected OwnedExpression quantifiedExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QuantifiedExpImpl()
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
    return GumboPackage.Literals.QUANTIFIED_EXP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getQuantifier()
  {
    return quantifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setQuantifier(String newQuantifier)
  {
    String oldQuantifier = quantifier;
    quantifier = newQuantifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.QUANTIFIED_EXP__QUANTIFIER, oldQuantifier, quantifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public QuantRange getQuantRange()
  {
    return quantRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQuantRange(QuantRange newQuantRange, NotificationChain msgs)
  {
    QuantRange oldQuantRange = quantRange;
    quantRange = newQuantRange;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.QUANTIFIED_EXP__QUANT_RANGE, oldQuantRange, newQuantRange);
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
  public void setQuantRange(QuantRange newQuantRange)
  {
    if (newQuantRange != quantRange)
    {
      NotificationChain msgs = null;
      if (quantRange != null)
        msgs = ((InternalEObject)quantRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.QUANTIFIED_EXP__QUANT_RANGE, null, msgs);
      if (newQuantRange != null)
        msgs = ((InternalEObject)newQuantRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.QUANTIFIED_EXP__QUANT_RANGE, null, msgs);
      msgs = basicSetQuantRange(newQuantRange, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.QUANTIFIED_EXP__QUANT_RANGE, newQuantRange, newQuantRange));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public QuantParam getQuantParam()
  {
    return quantParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQuantParam(QuantParam newQuantParam, NotificationChain msgs)
  {
    QuantParam oldQuantParam = quantParam;
    quantParam = newQuantParam;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.QUANTIFIED_EXP__QUANT_PARAM, oldQuantParam, newQuantParam);
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
  public void setQuantParam(QuantParam newQuantParam)
  {
    if (newQuantParam != quantParam)
    {
      NotificationChain msgs = null;
      if (quantParam != null)
        msgs = ((InternalEObject)quantParam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.QUANTIFIED_EXP__QUANT_PARAM, null, msgs);
      if (newQuantParam != null)
        msgs = ((InternalEObject)newQuantParam).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.QUANTIFIED_EXP__QUANT_PARAM, null, msgs);
      msgs = basicSetQuantParam(newQuantParam, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.QUANTIFIED_EXP__QUANT_PARAM, newQuantParam, newQuantParam));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OwnedExpression getQuantifiedExpr()
  {
    return quantifiedExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQuantifiedExpr(OwnedExpression newQuantifiedExpr, NotificationChain msgs)
  {
    OwnedExpression oldQuantifiedExpr = quantifiedExpr;
    quantifiedExpr = newQuantifiedExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.QUANTIFIED_EXP__QUANTIFIED_EXPR, oldQuantifiedExpr, newQuantifiedExpr);
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
  public void setQuantifiedExpr(OwnedExpression newQuantifiedExpr)
  {
    if (newQuantifiedExpr != quantifiedExpr)
    {
      NotificationChain msgs = null;
      if (quantifiedExpr != null)
        msgs = ((InternalEObject)quantifiedExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.QUANTIFIED_EXP__QUANTIFIED_EXPR, null, msgs);
      if (newQuantifiedExpr != null)
        msgs = ((InternalEObject)newQuantifiedExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.QUANTIFIED_EXP__QUANTIFIED_EXPR, null, msgs);
      msgs = basicSetQuantifiedExpr(newQuantifiedExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.QUANTIFIED_EXP__QUANTIFIED_EXPR, newQuantifiedExpr, newQuantifiedExpr));
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
      case GumboPackage.QUANTIFIED_EXP__QUANT_RANGE:
        return basicSetQuantRange(null, msgs);
      case GumboPackage.QUANTIFIED_EXP__QUANT_PARAM:
        return basicSetQuantParam(null, msgs);
      case GumboPackage.QUANTIFIED_EXP__QUANTIFIED_EXPR:
        return basicSetQuantifiedExpr(null, msgs);
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
      case GumboPackage.QUANTIFIED_EXP__QUANTIFIER:
        return getQuantifier();
      case GumboPackage.QUANTIFIED_EXP__QUANT_RANGE:
        return getQuantRange();
      case GumboPackage.QUANTIFIED_EXP__QUANT_PARAM:
        return getQuantParam();
      case GumboPackage.QUANTIFIED_EXP__QUANTIFIED_EXPR:
        return getQuantifiedExpr();
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
      case GumboPackage.QUANTIFIED_EXP__QUANTIFIER:
        setQuantifier((String)newValue);
        return;
      case GumboPackage.QUANTIFIED_EXP__QUANT_RANGE:
        setQuantRange((QuantRange)newValue);
        return;
      case GumboPackage.QUANTIFIED_EXP__QUANT_PARAM:
        setQuantParam((QuantParam)newValue);
        return;
      case GumboPackage.QUANTIFIED_EXP__QUANTIFIED_EXPR:
        setQuantifiedExpr((OwnedExpression)newValue);
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
      case GumboPackage.QUANTIFIED_EXP__QUANTIFIER:
        setQuantifier(QUANTIFIER_EDEFAULT);
        return;
      case GumboPackage.QUANTIFIED_EXP__QUANT_RANGE:
        setQuantRange((QuantRange)null);
        return;
      case GumboPackage.QUANTIFIED_EXP__QUANT_PARAM:
        setQuantParam((QuantParam)null);
        return;
      case GumboPackage.QUANTIFIED_EXP__QUANTIFIED_EXPR:
        setQuantifiedExpr((OwnedExpression)null);
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
      case GumboPackage.QUANTIFIED_EXP__QUANTIFIER:
        return QUANTIFIER_EDEFAULT == null ? quantifier != null : !QUANTIFIER_EDEFAULT.equals(quantifier);
      case GumboPackage.QUANTIFIED_EXP__QUANT_RANGE:
        return quantRange != null;
      case GumboPackage.QUANTIFIED_EXP__QUANT_PARAM:
        return quantParam != null;
      case GumboPackage.QUANTIFIED_EXP__QUANTIFIED_EXPR:
        return quantifiedExpr != null;
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
    result.append(" (quantifier: ");
    result.append(quantifier);
    result.append(')');
    return result.toString();
  }

} //QuantifiedExpImpl
