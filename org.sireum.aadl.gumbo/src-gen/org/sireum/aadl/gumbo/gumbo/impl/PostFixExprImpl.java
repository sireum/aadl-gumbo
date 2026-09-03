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

import org.sireum.aadl.gumbo.gumbo.GExpr;
import org.sireum.aadl.gumbo.gumbo.GumboPackage;
import org.sireum.aadl.gumbo.gumbo.PostFixExpr;
import org.sireum.aadl.gumbo.gumbo.Postfix;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Post Fix Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.PostFixExprImpl#getBaseExp <em>Base Exp</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.PostFixExprImpl#getPosts <em>Posts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PostFixExprImpl extends GExprImpl implements PostFixExpr
{
  /**
   * The cached value of the '{@link #getBaseExp() <em>Base Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaseExp()
   * @generated
   * @ordered
   */
  protected GExpr baseExp;

  /**
   * The cached value of the '{@link #getPosts() <em>Posts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPosts()
   * @generated
   * @ordered
   */
  protected EList<Postfix> posts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PostFixExprImpl()
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
    return GumboPackage.Literals.POST_FIX_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GExpr getBaseExp()
  {
    return baseExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBaseExp(GExpr newBaseExp, NotificationChain msgs)
  {
    GExpr oldBaseExp = baseExp;
    baseExp = newBaseExp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.POST_FIX_EXPR__BASE_EXP, oldBaseExp, newBaseExp);
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
  public void setBaseExp(GExpr newBaseExp)
  {
    if (newBaseExp != baseExp)
    {
      NotificationChain msgs = null;
      if (baseExp != null)
        msgs = ((InternalEObject)baseExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.POST_FIX_EXPR__BASE_EXP, null, msgs);
      if (newBaseExp != null)
        msgs = ((InternalEObject)newBaseExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.POST_FIX_EXPR__BASE_EXP, null, msgs);
      msgs = basicSetBaseExp(newBaseExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.POST_FIX_EXPR__BASE_EXP, newBaseExp, newBaseExp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Postfix> getPosts()
  {
    if (posts == null)
    {
      posts = new EObjectContainmentEList<Postfix>(Postfix.class, this, GumboPackage.POST_FIX_EXPR__POSTS);
    }
    return posts;
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
      case GumboPackage.POST_FIX_EXPR__BASE_EXP:
        return basicSetBaseExp(null, msgs);
      case GumboPackage.POST_FIX_EXPR__POSTS:
        return ((InternalEList<?>)getPosts()).basicRemove(otherEnd, msgs);
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
      case GumboPackage.POST_FIX_EXPR__BASE_EXP:
        return getBaseExp();
      case GumboPackage.POST_FIX_EXPR__POSTS:
        return getPosts();
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
      case GumboPackage.POST_FIX_EXPR__BASE_EXP:
        setBaseExp((GExpr)newValue);
        return;
      case GumboPackage.POST_FIX_EXPR__POSTS:
        getPosts().clear();
        getPosts().addAll((Collection<? extends Postfix>)newValue);
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
      case GumboPackage.POST_FIX_EXPR__BASE_EXP:
        setBaseExp((GExpr)null);
        return;
      case GumboPackage.POST_FIX_EXPR__POSTS:
        getPosts().clear();
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
      case GumboPackage.POST_FIX_EXPR__BASE_EXP:
        return baseExp != null;
      case GumboPackage.POST_FIX_EXPR__POSTS:
        return posts != null && !posts.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PostFixExprImpl
