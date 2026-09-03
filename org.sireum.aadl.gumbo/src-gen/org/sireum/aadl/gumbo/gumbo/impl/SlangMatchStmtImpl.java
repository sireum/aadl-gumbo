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
import org.sireum.aadl.gumbo.gumbo.SlangCase;
import org.sireum.aadl.gumbo.gumbo.SlangMatchStmt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slang Match Stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.SlangMatchStmtImpl#getTestExpr <em>Test Expr</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.SlangMatchStmtImpl#getC <em>C</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SlangMatchStmtImpl extends SlangStmtImpl implements SlangMatchStmt
{
  /**
   * The cached value of the '{@link #getTestExpr() <em>Test Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTestExpr()
   * @generated
   * @ordered
   */
  protected OwnedExpression testExpr;

  /**
   * The cached value of the '{@link #getC() <em>C</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getC()
   * @generated
   * @ordered
   */
  protected EList<SlangCase> c;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SlangMatchStmtImpl()
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
    return GumboPackage.Literals.SLANG_MATCH_STMT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OwnedExpression getTestExpr()
  {
    return testExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTestExpr(OwnedExpression newTestExpr, NotificationChain msgs)
  {
    OwnedExpression oldTestExpr = testExpr;
    testExpr = newTestExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_MATCH_STMT__TEST_EXPR, oldTestExpr, newTestExpr);
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
  public void setTestExpr(OwnedExpression newTestExpr)
  {
    if (newTestExpr != testExpr)
    {
      NotificationChain msgs = null;
      if (testExpr != null)
        msgs = ((InternalEObject)testExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_MATCH_STMT__TEST_EXPR, null, msgs);
      if (newTestExpr != null)
        msgs = ((InternalEObject)newTestExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_MATCH_STMT__TEST_EXPR, null, msgs);
      msgs = basicSetTestExpr(newTestExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_MATCH_STMT__TEST_EXPR, newTestExpr, newTestExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<SlangCase> getC()
  {
    if (c == null)
    {
      c = new EObjectContainmentEList<SlangCase>(SlangCase.class, this, GumboPackage.SLANG_MATCH_STMT__C);
    }
    return c;
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
      case GumboPackage.SLANG_MATCH_STMT__TEST_EXPR:
        return basicSetTestExpr(null, msgs);
      case GumboPackage.SLANG_MATCH_STMT__C:
        return ((InternalEList<?>)getC()).basicRemove(otherEnd, msgs);
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
      case GumboPackage.SLANG_MATCH_STMT__TEST_EXPR:
        return getTestExpr();
      case GumboPackage.SLANG_MATCH_STMT__C:
        return getC();
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
      case GumboPackage.SLANG_MATCH_STMT__TEST_EXPR:
        setTestExpr((OwnedExpression)newValue);
        return;
      case GumboPackage.SLANG_MATCH_STMT__C:
        getC().clear();
        getC().addAll((Collection<? extends SlangCase>)newValue);
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
      case GumboPackage.SLANG_MATCH_STMT__TEST_EXPR:
        setTestExpr((OwnedExpression)null);
        return;
      case GumboPackage.SLANG_MATCH_STMT__C:
        getC().clear();
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
      case GumboPackage.SLANG_MATCH_STMT__TEST_EXPR:
        return testExpr != null;
      case GumboPackage.SLANG_MATCH_STMT__C:
        return c != null && !c.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SlangMatchStmtImpl
