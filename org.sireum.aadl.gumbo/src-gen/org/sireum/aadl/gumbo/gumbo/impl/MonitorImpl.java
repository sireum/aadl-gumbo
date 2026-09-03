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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sireum.aadl.gumbo.gumbo.AlertStatement;
import org.sireum.aadl.gumbo.gumbo.GuaranteeStatement;
import org.sireum.aadl.gumbo.gumbo.GumboPackage;
import org.sireum.aadl.gumbo.gumbo.Monitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monitor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.MonitorImpl#getGuarantees <em>Guarantees</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.MonitorImpl#getAlerts <em>Alerts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MonitorImpl extends MinimalEObjectImpl.Container implements Monitor
{
  /**
   * The cached value of the '{@link #getGuarantees() <em>Guarantees</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuarantees()
   * @generated
   * @ordered
   */
  protected EList<GuaranteeStatement> guarantees;

  /**
   * The cached value of the '{@link #getAlerts() <em>Alerts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlerts()
   * @generated
   * @ordered
   */
  protected EList<AlertStatement> alerts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MonitorImpl()
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
    return GumboPackage.Literals.MONITOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<GuaranteeStatement> getGuarantees()
  {
    if (guarantees == null)
    {
      guarantees = new EObjectContainmentEList<GuaranteeStatement>(GuaranteeStatement.class, this, GumboPackage.MONITOR__GUARANTEES);
    }
    return guarantees;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<AlertStatement> getAlerts()
  {
    if (alerts == null)
    {
      alerts = new EObjectContainmentEList<AlertStatement>(AlertStatement.class, this, GumboPackage.MONITOR__ALERTS);
    }
    return alerts;
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
      case GumboPackage.MONITOR__GUARANTEES:
        return ((InternalEList<?>)getGuarantees()).basicRemove(otherEnd, msgs);
      case GumboPackage.MONITOR__ALERTS:
        return ((InternalEList<?>)getAlerts()).basicRemove(otherEnd, msgs);
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
      case GumboPackage.MONITOR__GUARANTEES:
        return getGuarantees();
      case GumboPackage.MONITOR__ALERTS:
        return getAlerts();
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
      case GumboPackage.MONITOR__GUARANTEES:
        getGuarantees().clear();
        getGuarantees().addAll((Collection<? extends GuaranteeStatement>)newValue);
        return;
      case GumboPackage.MONITOR__ALERTS:
        getAlerts().clear();
        getAlerts().addAll((Collection<? extends AlertStatement>)newValue);
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
      case GumboPackage.MONITOR__GUARANTEES:
        getGuarantees().clear();
        return;
      case GumboPackage.MONITOR__ALERTS:
        getAlerts().clear();
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
      case GumboPackage.MONITOR__GUARANTEES:
        return guarantees != null && !guarantees.isEmpty();
      case GumboPackage.MONITOR__ALERTS:
        return alerts != null && !alerts.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MonitorImpl
