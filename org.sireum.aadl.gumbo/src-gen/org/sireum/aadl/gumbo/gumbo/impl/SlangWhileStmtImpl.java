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
import org.sireum.aadl.gumbo.gumbo.SlangBlock;
import org.sireum.aadl.gumbo.gumbo.SlangLoopContract;
import org.sireum.aadl.gumbo.gumbo.SlangWhileStmt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slang While Stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.SlangWhileStmtImpl#getCond <em>Cond</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.SlangWhileStmtImpl#getL <em>L</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.SlangWhileStmtImpl#getB <em>B</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SlangWhileStmtImpl extends SlangStmtImpl implements SlangWhileStmt
{
  /**
   * The cached value of the '{@link #getCond() <em>Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCond()
   * @generated
   * @ordered
   */
  protected OwnedExpression cond;

  /**
   * The cached value of the '{@link #getL() <em>L</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getL()
   * @generated
   * @ordered
   */
  protected SlangLoopContract l;

  /**
   * The cached value of the '{@link #getB() <em>B</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getB()
   * @generated
   * @ordered
   */
  protected SlangBlock b;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SlangWhileStmtImpl()
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
    return GumboPackage.Literals.SLANG_WHILE_STMT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OwnedExpression getCond()
  {
    return cond;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCond(OwnedExpression newCond, NotificationChain msgs)
  {
    OwnedExpression oldCond = cond;
    cond = newCond;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_WHILE_STMT__COND, oldCond, newCond);
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
  public void setCond(OwnedExpression newCond)
  {
    if (newCond != cond)
    {
      NotificationChain msgs = null;
      if (cond != null)
        msgs = ((InternalEObject)cond).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_WHILE_STMT__COND, null, msgs);
      if (newCond != null)
        msgs = ((InternalEObject)newCond).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_WHILE_STMT__COND, null, msgs);
      msgs = basicSetCond(newCond, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_WHILE_STMT__COND, newCond, newCond));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangLoopContract getL()
  {
    return l;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetL(SlangLoopContract newL, NotificationChain msgs)
  {
    SlangLoopContract oldL = l;
    l = newL;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_WHILE_STMT__L, oldL, newL);
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
  public void setL(SlangLoopContract newL)
  {
    if (newL != l)
    {
      NotificationChain msgs = null;
      if (l != null)
        msgs = ((InternalEObject)l).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_WHILE_STMT__L, null, msgs);
      if (newL != null)
        msgs = ((InternalEObject)newL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_WHILE_STMT__L, null, msgs);
      msgs = basicSetL(newL, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_WHILE_STMT__L, newL, newL));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangBlock getB()
  {
    return b;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetB(SlangBlock newB, NotificationChain msgs)
  {
    SlangBlock oldB = b;
    b = newB;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_WHILE_STMT__B, oldB, newB);
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
  public void setB(SlangBlock newB)
  {
    if (newB != b)
    {
      NotificationChain msgs = null;
      if (b != null)
        msgs = ((InternalEObject)b).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_WHILE_STMT__B, null, msgs);
      if (newB != null)
        msgs = ((InternalEObject)newB).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_WHILE_STMT__B, null, msgs);
      msgs = basicSetB(newB, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_WHILE_STMT__B, newB, newB));
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
      case GumboPackage.SLANG_WHILE_STMT__COND:
        return basicSetCond(null, msgs);
      case GumboPackage.SLANG_WHILE_STMT__L:
        return basicSetL(null, msgs);
      case GumboPackage.SLANG_WHILE_STMT__B:
        return basicSetB(null, msgs);
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
      case GumboPackage.SLANG_WHILE_STMT__COND:
        return getCond();
      case GumboPackage.SLANG_WHILE_STMT__L:
        return getL();
      case GumboPackage.SLANG_WHILE_STMT__B:
        return getB();
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
      case GumboPackage.SLANG_WHILE_STMT__COND:
        setCond((OwnedExpression)newValue);
        return;
      case GumboPackage.SLANG_WHILE_STMT__L:
        setL((SlangLoopContract)newValue);
        return;
      case GumboPackage.SLANG_WHILE_STMT__B:
        setB((SlangBlock)newValue);
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
      case GumboPackage.SLANG_WHILE_STMT__COND:
        setCond((OwnedExpression)null);
        return;
      case GumboPackage.SLANG_WHILE_STMT__L:
        setL((SlangLoopContract)null);
        return;
      case GumboPackage.SLANG_WHILE_STMT__B:
        setB((SlangBlock)null);
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
      case GumboPackage.SLANG_WHILE_STMT__COND:
        return cond != null;
      case GumboPackage.SLANG_WHILE_STMT__L:
        return l != null;
      case GumboPackage.SLANG_WHILE_STMT__B:
        return b != null;
    }
    return super.eIsSet(featureID);
  }

} //SlangWhileStmtImpl
