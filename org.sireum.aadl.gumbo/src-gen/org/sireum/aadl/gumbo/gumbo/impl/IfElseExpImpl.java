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

import org.sireum.aadl.gumbo.gumbo.GExpr;
import org.sireum.aadl.gumbo.gumbo.GumboPackage;
import org.sireum.aadl.gumbo.gumbo.IfElseExp;
import org.sireum.aadl.gumbo.gumbo.OwnedExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Else Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.IfElseExpImpl#getIfCond <em>If Cond</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.IfElseExpImpl#getThenExpr <em>Then Expr</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.IfElseExpImpl#getElseExpr <em>Else Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfElseExpImpl extends GExprImpl implements IfElseExp
{
  /**
   * The cached value of the '{@link #getIfCond() <em>If Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfCond()
   * @generated
   * @ordered
   */
  protected GExpr ifCond;

  /**
   * The cached value of the '{@link #getThenExpr() <em>Then Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThenExpr()
   * @generated
   * @ordered
   */
  protected OwnedExpression thenExpr;

  /**
   * The cached value of the '{@link #getElseExpr() <em>Else Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseExpr()
   * @generated
   * @ordered
   */
  protected OwnedExpression elseExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IfElseExpImpl()
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
    return GumboPackage.Literals.IF_ELSE_EXP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GExpr getIfCond()
  {
    return ifCond;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIfCond(GExpr newIfCond, NotificationChain msgs)
  {
    GExpr oldIfCond = ifCond;
    ifCond = newIfCond;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.IF_ELSE_EXP__IF_COND, oldIfCond, newIfCond);
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
  public void setIfCond(GExpr newIfCond)
  {
    if (newIfCond != ifCond)
    {
      NotificationChain msgs = null;
      if (ifCond != null)
        msgs = ((InternalEObject)ifCond).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.IF_ELSE_EXP__IF_COND, null, msgs);
      if (newIfCond != null)
        msgs = ((InternalEObject)newIfCond).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.IF_ELSE_EXP__IF_COND, null, msgs);
      msgs = basicSetIfCond(newIfCond, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.IF_ELSE_EXP__IF_COND, newIfCond, newIfCond));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OwnedExpression getThenExpr()
  {
    return thenExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetThenExpr(OwnedExpression newThenExpr, NotificationChain msgs)
  {
    OwnedExpression oldThenExpr = thenExpr;
    thenExpr = newThenExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.IF_ELSE_EXP__THEN_EXPR, oldThenExpr, newThenExpr);
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
  public void setThenExpr(OwnedExpression newThenExpr)
  {
    if (newThenExpr != thenExpr)
    {
      NotificationChain msgs = null;
      if (thenExpr != null)
        msgs = ((InternalEObject)thenExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.IF_ELSE_EXP__THEN_EXPR, null, msgs);
      if (newThenExpr != null)
        msgs = ((InternalEObject)newThenExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.IF_ELSE_EXP__THEN_EXPR, null, msgs);
      msgs = basicSetThenExpr(newThenExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.IF_ELSE_EXP__THEN_EXPR, newThenExpr, newThenExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OwnedExpression getElseExpr()
  {
    return elseExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElseExpr(OwnedExpression newElseExpr, NotificationChain msgs)
  {
    OwnedExpression oldElseExpr = elseExpr;
    elseExpr = newElseExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.IF_ELSE_EXP__ELSE_EXPR, oldElseExpr, newElseExpr);
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
  public void setElseExpr(OwnedExpression newElseExpr)
  {
    if (newElseExpr != elseExpr)
    {
      NotificationChain msgs = null;
      if (elseExpr != null)
        msgs = ((InternalEObject)elseExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.IF_ELSE_EXP__ELSE_EXPR, null, msgs);
      if (newElseExpr != null)
        msgs = ((InternalEObject)newElseExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.IF_ELSE_EXP__ELSE_EXPR, null, msgs);
      msgs = basicSetElseExpr(newElseExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.IF_ELSE_EXP__ELSE_EXPR, newElseExpr, newElseExpr));
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
      case GumboPackage.IF_ELSE_EXP__IF_COND:
        return basicSetIfCond(null, msgs);
      case GumboPackage.IF_ELSE_EXP__THEN_EXPR:
        return basicSetThenExpr(null, msgs);
      case GumboPackage.IF_ELSE_EXP__ELSE_EXPR:
        return basicSetElseExpr(null, msgs);
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
      case GumboPackage.IF_ELSE_EXP__IF_COND:
        return getIfCond();
      case GumboPackage.IF_ELSE_EXP__THEN_EXPR:
        return getThenExpr();
      case GumboPackage.IF_ELSE_EXP__ELSE_EXPR:
        return getElseExpr();
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
      case GumboPackage.IF_ELSE_EXP__IF_COND:
        setIfCond((GExpr)newValue);
        return;
      case GumboPackage.IF_ELSE_EXP__THEN_EXPR:
        setThenExpr((OwnedExpression)newValue);
        return;
      case GumboPackage.IF_ELSE_EXP__ELSE_EXPR:
        setElseExpr((OwnedExpression)newValue);
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
      case GumboPackage.IF_ELSE_EXP__IF_COND:
        setIfCond((GExpr)null);
        return;
      case GumboPackage.IF_ELSE_EXP__THEN_EXPR:
        setThenExpr((OwnedExpression)null);
        return;
      case GumboPackage.IF_ELSE_EXP__ELSE_EXPR:
        setElseExpr((OwnedExpression)null);
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
      case GumboPackage.IF_ELSE_EXP__IF_COND:
        return ifCond != null;
      case GumboPackage.IF_ELSE_EXP__THEN_EXPR:
        return thenExpr != null;
      case GumboPackage.IF_ELSE_EXP__ELSE_EXPR:
        return elseExpr != null;
    }
    return super.eIsSet(featureID);
  }

} //IfElseExpImpl
