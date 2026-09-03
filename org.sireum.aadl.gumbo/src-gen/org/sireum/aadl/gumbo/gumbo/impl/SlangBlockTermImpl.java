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
import org.sireum.aadl.gumbo.gumbo.SlangBlockTerm;
import org.sireum.aadl.gumbo.gumbo.SlangParams;
import org.sireum.aadl.gumbo.gumbo.SlangRet;
import org.sireum.aadl.gumbo.gumbo.SlangStmt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slang Block Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.SlangBlockTermImpl#getP <em>P</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.SlangBlockTermImpl#getE <em>E</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.SlangBlockTermImpl#getStmt <em>Stmt</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.SlangBlockTermImpl#getR <em>R</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SlangBlockTermImpl extends GExprImpl implements SlangBlockTerm
{
  /**
   * The cached value of the '{@link #getP() <em>P</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getP()
   * @generated
   * @ordered
   */
  protected SlangParams p;

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
   * The cached value of the '{@link #getStmt() <em>Stmt</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStmt()
   * @generated
   * @ordered
   */
  protected EList<SlangStmt> stmt;

  /**
   * The cached value of the '{@link #getR() <em>R</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getR()
   * @generated
   * @ordered
   */
  protected SlangRet r;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SlangBlockTermImpl()
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
    return GumboPackage.Literals.SLANG_BLOCK_TERM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangParams getP()
  {
    return p;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetP(SlangParams newP, NotificationChain msgs)
  {
    SlangParams oldP = p;
    p = newP;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_BLOCK_TERM__P, oldP, newP);
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
  public void setP(SlangParams newP)
  {
    if (newP != p)
    {
      NotificationChain msgs = null;
      if (p != null)
        msgs = ((InternalEObject)p).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_BLOCK_TERM__P, null, msgs);
      if (newP != null)
        msgs = ((InternalEObject)newP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_BLOCK_TERM__P, null, msgs);
      msgs = basicSetP(newP, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_BLOCK_TERM__P, newP, newP));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_BLOCK_TERM__E, oldE, newE);
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
        msgs = ((InternalEObject)e).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_BLOCK_TERM__E, null, msgs);
      if (newE != null)
        msgs = ((InternalEObject)newE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_BLOCK_TERM__E, null, msgs);
      msgs = basicSetE(newE, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_BLOCK_TERM__E, newE, newE));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<SlangStmt> getStmt()
  {
    if (stmt == null)
    {
      stmt = new EObjectContainmentEList<SlangStmt>(SlangStmt.class, this, GumboPackage.SLANG_BLOCK_TERM__STMT);
    }
    return stmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangRet getR()
  {
    return r;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetR(SlangRet newR, NotificationChain msgs)
  {
    SlangRet oldR = r;
    r = newR;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_BLOCK_TERM__R, oldR, newR);
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
  public void setR(SlangRet newR)
  {
    if (newR != r)
    {
      NotificationChain msgs = null;
      if (r != null)
        msgs = ((InternalEObject)r).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_BLOCK_TERM__R, null, msgs);
      if (newR != null)
        msgs = ((InternalEObject)newR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_BLOCK_TERM__R, null, msgs);
      msgs = basicSetR(newR, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_BLOCK_TERM__R, newR, newR));
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
      case GumboPackage.SLANG_BLOCK_TERM__P:
        return basicSetP(null, msgs);
      case GumboPackage.SLANG_BLOCK_TERM__E:
        return basicSetE(null, msgs);
      case GumboPackage.SLANG_BLOCK_TERM__STMT:
        return ((InternalEList<?>)getStmt()).basicRemove(otherEnd, msgs);
      case GumboPackage.SLANG_BLOCK_TERM__R:
        return basicSetR(null, msgs);
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
      case GumboPackage.SLANG_BLOCK_TERM__P:
        return getP();
      case GumboPackage.SLANG_BLOCK_TERM__E:
        return getE();
      case GumboPackage.SLANG_BLOCK_TERM__STMT:
        return getStmt();
      case GumboPackage.SLANG_BLOCK_TERM__R:
        return getR();
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
      case GumboPackage.SLANG_BLOCK_TERM__P:
        setP((SlangParams)newValue);
        return;
      case GumboPackage.SLANG_BLOCK_TERM__E:
        setE((OwnedExpression)newValue);
        return;
      case GumboPackage.SLANG_BLOCK_TERM__STMT:
        getStmt().clear();
        getStmt().addAll((Collection<? extends SlangStmt>)newValue);
        return;
      case GumboPackage.SLANG_BLOCK_TERM__R:
        setR((SlangRet)newValue);
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
      case GumboPackage.SLANG_BLOCK_TERM__P:
        setP((SlangParams)null);
        return;
      case GumboPackage.SLANG_BLOCK_TERM__E:
        setE((OwnedExpression)null);
        return;
      case GumboPackage.SLANG_BLOCK_TERM__STMT:
        getStmt().clear();
        return;
      case GumboPackage.SLANG_BLOCK_TERM__R:
        setR((SlangRet)null);
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
      case GumboPackage.SLANG_BLOCK_TERM__P:
        return p != null;
      case GumboPackage.SLANG_BLOCK_TERM__E:
        return e != null;
      case GumboPackage.SLANG_BLOCK_TERM__STMT:
        return stmt != null && !stmt.isEmpty();
      case GumboPackage.SLANG_BLOCK_TERM__R:
        return r != null;
    }
    return super.eIsSet(featureID);
  }

} //SlangBlockTermImpl
