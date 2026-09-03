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
import org.sireum.aadl.gumbo.gumbo.SlangBlock;
import org.sireum.aadl.gumbo.gumbo.SlangForRange;
import org.sireum.aadl.gumbo.gumbo.SlangForTerm;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slang For Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.SlangForTermImpl#getR <em>R</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.SlangForTermImpl#getB <em>B</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.SlangForTermImpl#getE <em>E</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SlangForTermImpl extends GExprImpl implements SlangForTerm
{
  /**
   * The cached value of the '{@link #getR() <em>R</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getR()
   * @generated
   * @ordered
   */
  protected EList<SlangForRange> r;

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
   * The cached value of the '{@link #getE() <em>E</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE()
   * @generated
   * @ordered
   */
  protected OwnedExpression e;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SlangForTermImpl()
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
    return GumboPackage.Literals.SLANG_FOR_TERM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<SlangForRange> getR()
  {
    if (r == null)
    {
      r = new EObjectContainmentEList<SlangForRange>(SlangForRange.class, this, GumboPackage.SLANG_FOR_TERM__R);
    }
    return r;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_FOR_TERM__B, oldB, newB);
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
        msgs = ((InternalEObject)b).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_FOR_TERM__B, null, msgs);
      if (newB != null)
        msgs = ((InternalEObject)newB).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_FOR_TERM__B, null, msgs);
      msgs = basicSetB(newB, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_FOR_TERM__B, newB, newB));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_FOR_TERM__E, oldE, newE);
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
        msgs = ((InternalEObject)e).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_FOR_TERM__E, null, msgs);
      if (newE != null)
        msgs = ((InternalEObject)newE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_FOR_TERM__E, null, msgs);
      msgs = basicSetE(newE, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_FOR_TERM__E, newE, newE));
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
      case GumboPackage.SLANG_FOR_TERM__R:
        return ((InternalEList<?>)getR()).basicRemove(otherEnd, msgs);
      case GumboPackage.SLANG_FOR_TERM__B:
        return basicSetB(null, msgs);
      case GumboPackage.SLANG_FOR_TERM__E:
        return basicSetE(null, msgs);
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
      case GumboPackage.SLANG_FOR_TERM__R:
        return getR();
      case GumboPackage.SLANG_FOR_TERM__B:
        return getB();
      case GumboPackage.SLANG_FOR_TERM__E:
        return getE();
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
      case GumboPackage.SLANG_FOR_TERM__R:
        getR().clear();
        getR().addAll((Collection<? extends SlangForRange>)newValue);
        return;
      case GumboPackage.SLANG_FOR_TERM__B:
        setB((SlangBlock)newValue);
        return;
      case GumboPackage.SLANG_FOR_TERM__E:
        setE((OwnedExpression)newValue);
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
      case GumboPackage.SLANG_FOR_TERM__R:
        getR().clear();
        return;
      case GumboPackage.SLANG_FOR_TERM__B:
        setB((SlangBlock)null);
        return;
      case GumboPackage.SLANG_FOR_TERM__E:
        setE((OwnedExpression)null);
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
      case GumboPackage.SLANG_FOR_TERM__R:
        return r != null && !r.isEmpty();
      case GumboPackage.SLANG_FOR_TERM__B:
        return b != null;
      case GumboPackage.SLANG_FOR_TERM__E:
        return e != null;
    }
    return super.eIsSet(featureID);
  }

} //SlangForTermImpl
