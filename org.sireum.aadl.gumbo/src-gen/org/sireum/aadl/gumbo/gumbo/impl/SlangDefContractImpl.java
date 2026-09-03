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
import org.sireum.aadl.gumbo.gumbo.SlangDefContract;
import org.sireum.aadl.gumbo.gumbo.SlangEnsures;
import org.sireum.aadl.gumbo.gumbo.SlangModifies;
import org.sireum.aadl.gumbo.gumbo.SlangReads;
import org.sireum.aadl.gumbo.gumbo.SlangRequires;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slang Def Contract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.SlangDefContractImpl#getReads <em>Reads</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.SlangDefContractImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.SlangDefContractImpl#getModifies <em>Modifies</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.SlangDefContractImpl#getEnsures <em>Ensures</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SlangDefContractImpl extends MinimalEObjectImpl.Container implements SlangDefContract
{
  /**
   * The cached value of the '{@link #getReads() <em>Reads</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReads()
   * @generated
   * @ordered
   */
  protected SlangReads reads;

  /**
   * The cached value of the '{@link #getRequires() <em>Requires</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequires()
   * @generated
   * @ordered
   */
  protected SlangRequires requires;

  /**
   * The cached value of the '{@link #getModifies() <em>Modifies</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModifies()
   * @generated
   * @ordered
   */
  protected SlangModifies modifies;

  /**
   * The cached value of the '{@link #getEnsures() <em>Ensures</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnsures()
   * @generated
   * @ordered
   */
  protected SlangEnsures ensures;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SlangDefContractImpl()
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
    return GumboPackage.Literals.SLANG_DEF_CONTRACT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangReads getReads()
  {
    return reads;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReads(SlangReads newReads, NotificationChain msgs)
  {
    SlangReads oldReads = reads;
    reads = newReads;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_DEF_CONTRACT__READS, oldReads, newReads);
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
  public void setReads(SlangReads newReads)
  {
    if (newReads != reads)
    {
      NotificationChain msgs = null;
      if (reads != null)
        msgs = ((InternalEObject)reads).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_DEF_CONTRACT__READS, null, msgs);
      if (newReads != null)
        msgs = ((InternalEObject)newReads).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_DEF_CONTRACT__READS, null, msgs);
      msgs = basicSetReads(newReads, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_DEF_CONTRACT__READS, newReads, newReads));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangRequires getRequires()
  {
    return requires;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRequires(SlangRequires newRequires, NotificationChain msgs)
  {
    SlangRequires oldRequires = requires;
    requires = newRequires;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_DEF_CONTRACT__REQUIRES, oldRequires, newRequires);
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
  public void setRequires(SlangRequires newRequires)
  {
    if (newRequires != requires)
    {
      NotificationChain msgs = null;
      if (requires != null)
        msgs = ((InternalEObject)requires).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_DEF_CONTRACT__REQUIRES, null, msgs);
      if (newRequires != null)
        msgs = ((InternalEObject)newRequires).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_DEF_CONTRACT__REQUIRES, null, msgs);
      msgs = basicSetRequires(newRequires, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_DEF_CONTRACT__REQUIRES, newRequires, newRequires));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangModifies getModifies()
  {
    return modifies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModifies(SlangModifies newModifies, NotificationChain msgs)
  {
    SlangModifies oldModifies = modifies;
    modifies = newModifies;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_DEF_CONTRACT__MODIFIES, oldModifies, newModifies);
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
  public void setModifies(SlangModifies newModifies)
  {
    if (newModifies != modifies)
    {
      NotificationChain msgs = null;
      if (modifies != null)
        msgs = ((InternalEObject)modifies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_DEF_CONTRACT__MODIFIES, null, msgs);
      if (newModifies != null)
        msgs = ((InternalEObject)newModifies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_DEF_CONTRACT__MODIFIES, null, msgs);
      msgs = basicSetModifies(newModifies, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_DEF_CONTRACT__MODIFIES, newModifies, newModifies));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangEnsures getEnsures()
  {
    return ensures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEnsures(SlangEnsures newEnsures, NotificationChain msgs)
  {
    SlangEnsures oldEnsures = ensures;
    ensures = newEnsures;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_DEF_CONTRACT__ENSURES, oldEnsures, newEnsures);
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
  public void setEnsures(SlangEnsures newEnsures)
  {
    if (newEnsures != ensures)
    {
      NotificationChain msgs = null;
      if (ensures != null)
        msgs = ((InternalEObject)ensures).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_DEF_CONTRACT__ENSURES, null, msgs);
      if (newEnsures != null)
        msgs = ((InternalEObject)newEnsures).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SLANG_DEF_CONTRACT__ENSURES, null, msgs);
      msgs = basicSetEnsures(newEnsures, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.SLANG_DEF_CONTRACT__ENSURES, newEnsures, newEnsures));
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
      case GumboPackage.SLANG_DEF_CONTRACT__READS:
        return basicSetReads(null, msgs);
      case GumboPackage.SLANG_DEF_CONTRACT__REQUIRES:
        return basicSetRequires(null, msgs);
      case GumboPackage.SLANG_DEF_CONTRACT__MODIFIES:
        return basicSetModifies(null, msgs);
      case GumboPackage.SLANG_DEF_CONTRACT__ENSURES:
        return basicSetEnsures(null, msgs);
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
      case GumboPackage.SLANG_DEF_CONTRACT__READS:
        return getReads();
      case GumboPackage.SLANG_DEF_CONTRACT__REQUIRES:
        return getRequires();
      case GumboPackage.SLANG_DEF_CONTRACT__MODIFIES:
        return getModifies();
      case GumboPackage.SLANG_DEF_CONTRACT__ENSURES:
        return getEnsures();
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
      case GumboPackage.SLANG_DEF_CONTRACT__READS:
        setReads((SlangReads)newValue);
        return;
      case GumboPackage.SLANG_DEF_CONTRACT__REQUIRES:
        setRequires((SlangRequires)newValue);
        return;
      case GumboPackage.SLANG_DEF_CONTRACT__MODIFIES:
        setModifies((SlangModifies)newValue);
        return;
      case GumboPackage.SLANG_DEF_CONTRACT__ENSURES:
        setEnsures((SlangEnsures)newValue);
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
      case GumboPackage.SLANG_DEF_CONTRACT__READS:
        setReads((SlangReads)null);
        return;
      case GumboPackage.SLANG_DEF_CONTRACT__REQUIRES:
        setRequires((SlangRequires)null);
        return;
      case GumboPackage.SLANG_DEF_CONTRACT__MODIFIES:
        setModifies((SlangModifies)null);
        return;
      case GumboPackage.SLANG_DEF_CONTRACT__ENSURES:
        setEnsures((SlangEnsures)null);
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
      case GumboPackage.SLANG_DEF_CONTRACT__READS:
        return reads != null;
      case GumboPackage.SLANG_DEF_CONTRACT__REQUIRES:
        return requires != null;
      case GumboPackage.SLANG_DEF_CONTRACT__MODIFIES:
        return modifies != null;
      case GumboPackage.SLANG_DEF_CONTRACT__ENSURES:
        return ensures != null;
    }
    return super.eIsSet(featureID);
  }

} //SlangDefContractImpl
