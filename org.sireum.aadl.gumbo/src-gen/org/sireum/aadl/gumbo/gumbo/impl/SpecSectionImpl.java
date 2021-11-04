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

import org.sireum.aadl.gumbo.gumbo.Compute;
import org.sireum.aadl.gumbo.gumbo.GumboPackage;
import org.sireum.aadl.gumbo.gumbo.Initialize;
import org.sireum.aadl.gumbo.gumbo.Integration;
import org.sireum.aadl.gumbo.gumbo.Invariants;
import org.sireum.aadl.gumbo.gumbo.SpecSection;
import org.sireum.aadl.gumbo.gumbo.State;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spec Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.SpecSectionImpl#getState <em>State</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.SpecSectionImpl#getInvariants <em>Invariants</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.SpecSectionImpl#getIntegration <em>Integration</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.SpecSectionImpl#getInitialize <em>Initialize</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.SpecSectionImpl#getCompute <em>Compute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecSectionImpl extends MinimalEObjectImpl.Container implements SpecSection
{
  /**
   * The cached value of the '{@link #getState() <em>State</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getState()
   * @generated
   * @ordered
   */
  protected State state;

  /**
   * The cached value of the '{@link #getInvariants() <em>Invariants</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInvariants()
   * @generated
   * @ordered
   */
  protected Invariants invariants;

  /**
   * The cached value of the '{@link #getIntegration() <em>Integration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntegration()
   * @generated
   * @ordered
   */
  protected Integration integration;

  /**
   * The cached value of the '{@link #getInitialize() <em>Initialize</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialize()
   * @generated
   * @ordered
   */
  protected Initialize initialize;

  /**
   * The cached value of the '{@link #getCompute() <em>Compute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompute()
   * @generated
   * @ordered
   */
  protected Compute compute;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SpecSectionImpl()
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
    return GumboPackage.Literals.SPEC_SECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public State getState()
  {
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetState(State newState, NotificationChain msgs)
  {
    State oldState = state;
    state = newState;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.SPEC_SECTION__STATE, oldState, newState);
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
  public void setState(State newState)
  {
    if (newState != state)
    {
      NotificationChain msgs = null;
      if (state != null)
        msgs = ((InternalEObject)state).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SPEC_SECTION__STATE, null, msgs);
      if (newState != null)
        msgs = ((InternalEObject)newState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SPEC_SECTION__STATE, null, msgs);
      msgs = basicSetState(newState, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.SPEC_SECTION__STATE, newState, newState));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Invariants getInvariants()
  {
    return invariants;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInvariants(Invariants newInvariants, NotificationChain msgs)
  {
    Invariants oldInvariants = invariants;
    invariants = newInvariants;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.SPEC_SECTION__INVARIANTS, oldInvariants, newInvariants);
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
  public void setInvariants(Invariants newInvariants)
  {
    if (newInvariants != invariants)
    {
      NotificationChain msgs = null;
      if (invariants != null)
        msgs = ((InternalEObject)invariants).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SPEC_SECTION__INVARIANTS, null, msgs);
      if (newInvariants != null)
        msgs = ((InternalEObject)newInvariants).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SPEC_SECTION__INVARIANTS, null, msgs);
      msgs = basicSetInvariants(newInvariants, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.SPEC_SECTION__INVARIANTS, newInvariants, newInvariants));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Integration getIntegration()
  {
    return integration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIntegration(Integration newIntegration, NotificationChain msgs)
  {
    Integration oldIntegration = integration;
    integration = newIntegration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.SPEC_SECTION__INTEGRATION, oldIntegration, newIntegration);
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
  public void setIntegration(Integration newIntegration)
  {
    if (newIntegration != integration)
    {
      NotificationChain msgs = null;
      if (integration != null)
        msgs = ((InternalEObject)integration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SPEC_SECTION__INTEGRATION, null, msgs);
      if (newIntegration != null)
        msgs = ((InternalEObject)newIntegration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SPEC_SECTION__INTEGRATION, null, msgs);
      msgs = basicSetIntegration(newIntegration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.SPEC_SECTION__INTEGRATION, newIntegration, newIntegration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Initialize getInitialize()
  {
    return initialize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInitialize(Initialize newInitialize, NotificationChain msgs)
  {
    Initialize oldInitialize = initialize;
    initialize = newInitialize;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.SPEC_SECTION__INITIALIZE, oldInitialize, newInitialize);
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
  public void setInitialize(Initialize newInitialize)
  {
    if (newInitialize != initialize)
    {
      NotificationChain msgs = null;
      if (initialize != null)
        msgs = ((InternalEObject)initialize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SPEC_SECTION__INITIALIZE, null, msgs);
      if (newInitialize != null)
        msgs = ((InternalEObject)newInitialize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SPEC_SECTION__INITIALIZE, null, msgs);
      msgs = basicSetInitialize(newInitialize, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.SPEC_SECTION__INITIALIZE, newInitialize, newInitialize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Compute getCompute()
  {
    return compute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCompute(Compute newCompute, NotificationChain msgs)
  {
    Compute oldCompute = compute;
    compute = newCompute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.SPEC_SECTION__COMPUTE, oldCompute, newCompute);
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
  public void setCompute(Compute newCompute)
  {
    if (newCompute != compute)
    {
      NotificationChain msgs = null;
      if (compute != null)
        msgs = ((InternalEObject)compute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SPEC_SECTION__COMPUTE, null, msgs);
      if (newCompute != null)
        msgs = ((InternalEObject)newCompute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SPEC_SECTION__COMPUTE, null, msgs);
      msgs = basicSetCompute(newCompute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.SPEC_SECTION__COMPUTE, newCompute, newCompute));
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
      case GumboPackage.SPEC_SECTION__STATE:
        return basicSetState(null, msgs);
      case GumboPackage.SPEC_SECTION__INVARIANTS:
        return basicSetInvariants(null, msgs);
      case GumboPackage.SPEC_SECTION__INTEGRATION:
        return basicSetIntegration(null, msgs);
      case GumboPackage.SPEC_SECTION__INITIALIZE:
        return basicSetInitialize(null, msgs);
      case GumboPackage.SPEC_SECTION__COMPUTE:
        return basicSetCompute(null, msgs);
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
      case GumboPackage.SPEC_SECTION__STATE:
        return getState();
      case GumboPackage.SPEC_SECTION__INVARIANTS:
        return getInvariants();
      case GumboPackage.SPEC_SECTION__INTEGRATION:
        return getIntegration();
      case GumboPackage.SPEC_SECTION__INITIALIZE:
        return getInitialize();
      case GumboPackage.SPEC_SECTION__COMPUTE:
        return getCompute();
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
      case GumboPackage.SPEC_SECTION__STATE:
        setState((State)newValue);
        return;
      case GumboPackage.SPEC_SECTION__INVARIANTS:
        setInvariants((Invariants)newValue);
        return;
      case GumboPackage.SPEC_SECTION__INTEGRATION:
        setIntegration((Integration)newValue);
        return;
      case GumboPackage.SPEC_SECTION__INITIALIZE:
        setInitialize((Initialize)newValue);
        return;
      case GumboPackage.SPEC_SECTION__COMPUTE:
        setCompute((Compute)newValue);
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
      case GumboPackage.SPEC_SECTION__STATE:
        setState((State)null);
        return;
      case GumboPackage.SPEC_SECTION__INVARIANTS:
        setInvariants((Invariants)null);
        return;
      case GumboPackage.SPEC_SECTION__INTEGRATION:
        setIntegration((Integration)null);
        return;
      case GumboPackage.SPEC_SECTION__INITIALIZE:
        setInitialize((Initialize)null);
        return;
      case GumboPackage.SPEC_SECTION__COMPUTE:
        setCompute((Compute)null);
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
      case GumboPackage.SPEC_SECTION__STATE:
        return state != null;
      case GumboPackage.SPEC_SECTION__INVARIANTS:
        return invariants != null;
      case GumboPackage.SPEC_SECTION__INTEGRATION:
        return integration != null;
      case GumboPackage.SPEC_SECTION__INITIALIZE:
        return initialize != null;
      case GumboPackage.SPEC_SECTION__COMPUTE:
        return compute != null;
    }
    return super.eIsSet(featureID);
  }

} //SpecSectionImpl
