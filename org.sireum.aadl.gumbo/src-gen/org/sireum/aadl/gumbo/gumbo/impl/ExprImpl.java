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

import org.sireum.aadl.gumbo.gumbo.Expr;
import org.sireum.aadl.gumbo.gumbo.GumboPackage;
import org.sireum.aadl.gumbo.gumbo.SlangMInterp;
import org.sireum.aadl.gumbo.gumbo.SlangQuantVar;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.ExprImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.ExprImpl#getThenExpr <em>Then Expr</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.ExprImpl#getElseExpr <em>Else Expr</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.ExprImpl#getQVar <em>QVar</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.ExprImpl#getQuantifiedExpr <em>Quantified Expr</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.ExprImpl#getT <em>T</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.ExprImpl#getM <em>M</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExprImpl extends SlangMInterpImpl implements Expr
{
  /**
   * The cached value of the '{@link #getTerm() <em>Term</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTerm()
   * @generated
   * @ordered
   */
  protected EList<Expr> term;

  /**
   * The cached value of the '{@link #getThenExpr() <em>Then Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThenExpr()
   * @generated
   * @ordered
   */
  protected Expr thenExpr;

  /**
   * The cached value of the '{@link #getElseExpr() <em>Else Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseExpr()
   * @generated
   * @ordered
   */
  protected Expr elseExpr;

  /**
   * The cached value of the '{@link #getQVar() <em>QVar</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQVar()
   * @generated
   * @ordered
   */
  protected EList<SlangQuantVar> qVar;

  /**
   * The cached value of the '{@link #getQuantifiedExpr() <em>Quantified Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuantifiedExpr()
   * @generated
   * @ordered
   */
  protected Expr quantifiedExpr;

  /**
   * The cached value of the '{@link #getT() <em>T</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT()
   * @generated
   * @ordered
   */
  protected Expr t;

  /**
   * The cached value of the '{@link #getM() <em>M</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getM()
   * @generated
   * @ordered
   */
  protected SlangMInterp m;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprImpl()
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
    return GumboPackage.Literals.EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Expr> getTerm()
  {
    if (term == null)
    {
      term = new EObjectContainmentEList<Expr>(Expr.class, this, GumboPackage.EXPR__TERM);
    }
    return term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expr getThenExpr()
  {
    return thenExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetThenExpr(Expr newThenExpr, NotificationChain msgs)
  {
    Expr oldThenExpr = thenExpr;
    thenExpr = newThenExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.EXPR__THEN_EXPR, oldThenExpr, newThenExpr);
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
  public void setThenExpr(Expr newThenExpr)
  {
    if (newThenExpr != thenExpr)
    {
      NotificationChain msgs = null;
      if (thenExpr != null)
        msgs = ((InternalEObject)thenExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.EXPR__THEN_EXPR, null, msgs);
      if (newThenExpr != null)
        msgs = ((InternalEObject)newThenExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.EXPR__THEN_EXPR, null, msgs);
      msgs = basicSetThenExpr(newThenExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.EXPR__THEN_EXPR, newThenExpr, newThenExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expr getElseExpr()
  {
    return elseExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElseExpr(Expr newElseExpr, NotificationChain msgs)
  {
    Expr oldElseExpr = elseExpr;
    elseExpr = newElseExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.EXPR__ELSE_EXPR, oldElseExpr, newElseExpr);
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
  public void setElseExpr(Expr newElseExpr)
  {
    if (newElseExpr != elseExpr)
    {
      NotificationChain msgs = null;
      if (elseExpr != null)
        msgs = ((InternalEObject)elseExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.EXPR__ELSE_EXPR, null, msgs);
      if (newElseExpr != null)
        msgs = ((InternalEObject)newElseExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.EXPR__ELSE_EXPR, null, msgs);
      msgs = basicSetElseExpr(newElseExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.EXPR__ELSE_EXPR, newElseExpr, newElseExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<SlangQuantVar> getQVar()
  {
    if (qVar == null)
    {
      qVar = new EObjectContainmentEList<SlangQuantVar>(SlangQuantVar.class, this, GumboPackage.EXPR__QVAR);
    }
    return qVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expr getQuantifiedExpr()
  {
    return quantifiedExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQuantifiedExpr(Expr newQuantifiedExpr, NotificationChain msgs)
  {
    Expr oldQuantifiedExpr = quantifiedExpr;
    quantifiedExpr = newQuantifiedExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.EXPR__QUANTIFIED_EXPR, oldQuantifiedExpr, newQuantifiedExpr);
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
  public void setQuantifiedExpr(Expr newQuantifiedExpr)
  {
    if (newQuantifiedExpr != quantifiedExpr)
    {
      NotificationChain msgs = null;
      if (quantifiedExpr != null)
        msgs = ((InternalEObject)quantifiedExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.EXPR__QUANTIFIED_EXPR, null, msgs);
      if (newQuantifiedExpr != null)
        msgs = ((InternalEObject)newQuantifiedExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.EXPR__QUANTIFIED_EXPR, null, msgs);
      msgs = basicSetQuantifiedExpr(newQuantifiedExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.EXPR__QUANTIFIED_EXPR, newQuantifiedExpr, newQuantifiedExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expr getT()
  {
    return t;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT(Expr newT, NotificationChain msgs)
  {
    Expr oldT = t;
    t = newT;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.EXPR__T, oldT, newT);
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
  public void setT(Expr newT)
  {
    if (newT != t)
    {
      NotificationChain msgs = null;
      if (t != null)
        msgs = ((InternalEObject)t).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.EXPR__T, null, msgs);
      if (newT != null)
        msgs = ((InternalEObject)newT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.EXPR__T, null, msgs);
      msgs = basicSetT(newT, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.EXPR__T, newT, newT));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangMInterp getM()
  {
    return m;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetM(SlangMInterp newM, NotificationChain msgs)
  {
    SlangMInterp oldM = m;
    m = newM;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.EXPR__M, oldM, newM);
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
  public void setM(SlangMInterp newM)
  {
    if (newM != m)
    {
      NotificationChain msgs = null;
      if (m != null)
        msgs = ((InternalEObject)m).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.EXPR__M, null, msgs);
      if (newM != null)
        msgs = ((InternalEObject)newM).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.EXPR__M, null, msgs);
      msgs = basicSetM(newM, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.EXPR__M, newM, newM));
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
      case GumboPackage.EXPR__TERM:
        return ((InternalEList<?>)getTerm()).basicRemove(otherEnd, msgs);
      case GumboPackage.EXPR__THEN_EXPR:
        return basicSetThenExpr(null, msgs);
      case GumboPackage.EXPR__ELSE_EXPR:
        return basicSetElseExpr(null, msgs);
      case GumboPackage.EXPR__QVAR:
        return ((InternalEList<?>)getQVar()).basicRemove(otherEnd, msgs);
      case GumboPackage.EXPR__QUANTIFIED_EXPR:
        return basicSetQuantifiedExpr(null, msgs);
      case GumboPackage.EXPR__T:
        return basicSetT(null, msgs);
      case GumboPackage.EXPR__M:
        return basicSetM(null, msgs);
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
      case GumboPackage.EXPR__TERM:
        return getTerm();
      case GumboPackage.EXPR__THEN_EXPR:
        return getThenExpr();
      case GumboPackage.EXPR__ELSE_EXPR:
        return getElseExpr();
      case GumboPackage.EXPR__QVAR:
        return getQVar();
      case GumboPackage.EXPR__QUANTIFIED_EXPR:
        return getQuantifiedExpr();
      case GumboPackage.EXPR__T:
        return getT();
      case GumboPackage.EXPR__M:
        return getM();
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
      case GumboPackage.EXPR__TERM:
        getTerm().clear();
        getTerm().addAll((Collection<? extends Expr>)newValue);
        return;
      case GumboPackage.EXPR__THEN_EXPR:
        setThenExpr((Expr)newValue);
        return;
      case GumboPackage.EXPR__ELSE_EXPR:
        setElseExpr((Expr)newValue);
        return;
      case GumboPackage.EXPR__QVAR:
        getQVar().clear();
        getQVar().addAll((Collection<? extends SlangQuantVar>)newValue);
        return;
      case GumboPackage.EXPR__QUANTIFIED_EXPR:
        setQuantifiedExpr((Expr)newValue);
        return;
      case GumboPackage.EXPR__T:
        setT((Expr)newValue);
        return;
      case GumboPackage.EXPR__M:
        setM((SlangMInterp)newValue);
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
      case GumboPackage.EXPR__TERM:
        getTerm().clear();
        return;
      case GumboPackage.EXPR__THEN_EXPR:
        setThenExpr((Expr)null);
        return;
      case GumboPackage.EXPR__ELSE_EXPR:
        setElseExpr((Expr)null);
        return;
      case GumboPackage.EXPR__QVAR:
        getQVar().clear();
        return;
      case GumboPackage.EXPR__QUANTIFIED_EXPR:
        setQuantifiedExpr((Expr)null);
        return;
      case GumboPackage.EXPR__T:
        setT((Expr)null);
        return;
      case GumboPackage.EXPR__M:
        setM((SlangMInterp)null);
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
      case GumboPackage.EXPR__TERM:
        return term != null && !term.isEmpty();
      case GumboPackage.EXPR__THEN_EXPR:
        return thenExpr != null;
      case GumboPackage.EXPR__ELSE_EXPR:
        return elseExpr != null;
      case GumboPackage.EXPR__QVAR:
        return qVar != null && !qVar.isEmpty();
      case GumboPackage.EXPR__QUANTIFIED_EXPR:
        return quantifiedExpr != null;
      case GumboPackage.EXPR__T:
        return t != null;
      case GumboPackage.EXPR__M:
        return m != null;
    }
    return super.eIsSet(featureID);
  }

} //ExprImpl
