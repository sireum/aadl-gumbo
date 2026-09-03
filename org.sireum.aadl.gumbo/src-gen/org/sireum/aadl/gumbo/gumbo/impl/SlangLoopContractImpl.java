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
import org.sireum.aadl.gumbo.gumbo.SlangInvariant;
import org.sireum.aadl.gumbo.gumbo.SlangLoopContract;
import org.sireum.aadl.gumbo.gumbo.SlangModifies;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slang Loop Contract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.SlangLoopContractImpl#getInv <em>Inv</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.SlangLoopContractImpl#getMod <em>Mod</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SlangLoopContractImpl extends MinimalEObjectImpl.Container implements SlangLoopContract
{
  /**
   * The cached value of the '{@link #getInv() <em>Inv</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInv()
   * @generated
   * @ordered
   */
  protected SlangInvariant inv;

  /**
   * The cached value of the '{@link #getMod() <em>Mod</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMod()
   * @generated
   * @ordered
   */
  protected SlangModifies mod;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SlangLoopContractImpl()
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
    return GumboPackage.Literals.SLANG_LOOP_CONTRACT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangInvariant getInv()
  {
    return inv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInv(SlangInvariant newInv, NotificationChain msgs)
  {
    SlangInvariant oldInv = inv;
    inv = newInv;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_LOOP_CONTRACT__INV, oldInv, newInv);
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
  public void setInv(SlangInvariant newInv)
  {
    if (newInv != inv)
    {
      NotificationChain msgs = null;
      if (inv != null)
        msgs = ((InternalEObject)inv).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_LOOP_CONTRACT__INV, null, msgs);
      if (newInv != null)
        msgs = ((InternalEObject)newInv).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_LOOP_CONTRACT__INV, null, msgs);
      msgs = basicSetInv(newInv, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_LOOP_CONTRACT__INV, newInv, newInv));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangModifies getMod()
  {
    return mod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMod(SlangModifies newMod, NotificationChain msgs)
  {
    SlangModifies oldMod = mod;
    mod = newMod;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_LOOP_CONTRACT__MOD, oldMod, newMod);
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
  public void setMod(SlangModifies newMod)
  {
    if (newMod != mod)
    {
      NotificationChain msgs = null;
      if (mod != null)
        msgs = ((InternalEObject)mod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_LOOP_CONTRACT__MOD, null, msgs);
      if (newMod != null)
        msgs = ((InternalEObject)newMod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_LOOP_CONTRACT__MOD, null, msgs);
      msgs = basicSetMod(newMod, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_LOOP_CONTRACT__MOD, newMod, newMod));
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
      case GumboPackage.SLANG_LOOP_CONTRACT__INV:
        return basicSetInv(null, msgs);
      case GumboPackage.SLANG_LOOP_CONTRACT__MOD:
        return basicSetMod(null, msgs);
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
      case GumboPackage.SLANG_LOOP_CONTRACT__INV:
        return getInv();
      case GumboPackage.SLANG_LOOP_CONTRACT__MOD:
        return getMod();
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
      case GumboPackage.SLANG_LOOP_CONTRACT__INV:
        setInv((SlangInvariant)newValue);
        return;
      case GumboPackage.SLANG_LOOP_CONTRACT__MOD:
        setMod((SlangModifies)newValue);
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
      case GumboPackage.SLANG_LOOP_CONTRACT__INV:
        setInv((SlangInvariant)null);
        return;
      case GumboPackage.SLANG_LOOP_CONTRACT__MOD:
        setMod((SlangModifies)null);
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
      case GumboPackage.SLANG_LOOP_CONTRACT__INV:
        return inv != null;
      case GumboPackage.SLANG_LOOP_CONTRACT__MOD:
        return mod != null;
    }
    return super.eIsSet(featureID);
  }

} //SlangLoopContractImpl
