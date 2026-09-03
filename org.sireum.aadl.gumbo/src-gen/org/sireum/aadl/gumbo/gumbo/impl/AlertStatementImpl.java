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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.osate.aadl2.Port;

import org.sireum.aadl.gumbo.gumbo.AlertStatement;
import org.sireum.aadl.gumbo.gumbo.GuaranteeStatement;
import org.sireum.aadl.gumbo.gumbo.GumboPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alert Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.AlertStatementImpl#getGuarantee <em>Guarantee</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.AlertStatementImpl#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlertStatementImpl extends MinimalEObjectImpl.Container implements AlertStatement
{
  /**
   * The cached value of the '{@link #getGuarantee() <em>Guarantee</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuarantee()
   * @generated
   * @ordered
   */
  protected GuaranteeStatement guarantee;

  /**
   * The cached value of the '{@link #getPort() <em>Port</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPort()
   * @generated
   * @ordered
   */
  protected Port port;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AlertStatementImpl()
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
    return GumboPackage.Literals.ALERT_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GuaranteeStatement getGuarantee()
  {
    if (guarantee != null && guarantee.eIsProxy())
    {
      InternalEObject oldGuarantee = (InternalEObject)guarantee;
      guarantee = (GuaranteeStatement)eResolveProxy(oldGuarantee);
      if (guarantee != oldGuarantee)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GumboPackage.ALERT_STATEMENT__GUARANTEE, oldGuarantee, guarantee));
      }
    }
    return guarantee;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GuaranteeStatement basicGetGuarantee()
  {
    return guarantee;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setGuarantee(GuaranteeStatement newGuarantee)
  {
    GuaranteeStatement oldGuarantee = guarantee;
    guarantee = newGuarantee;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.ALERT_STATEMENT__GUARANTEE, oldGuarantee, guarantee));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Port getPort()
  {
    if (port != null && ((EObject)port).eIsProxy())
    {
      InternalEObject oldPort = (InternalEObject)port;
      port = (Port)eResolveProxy(oldPort);
      if (port != oldPort)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GumboPackage.ALERT_STATEMENT__PORT, oldPort, port));
      }
    }
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Port basicGetPort()
  {
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPort(Port newPort)
  {
    Port oldPort = port;
    port = newPort;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.ALERT_STATEMENT__PORT, oldPort, port));
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
      case GumboPackage.ALERT_STATEMENT__GUARANTEE:
        if (resolve) return getGuarantee();
        return basicGetGuarantee();
      case GumboPackage.ALERT_STATEMENT__PORT:
        if (resolve) return getPort();
        return basicGetPort();
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
      case GumboPackage.ALERT_STATEMENT__GUARANTEE:
        setGuarantee((GuaranteeStatement)newValue);
        return;
      case GumboPackage.ALERT_STATEMENT__PORT:
        setPort((Port)newValue);
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
      case GumboPackage.ALERT_STATEMENT__GUARANTEE:
        setGuarantee((GuaranteeStatement)null);
        return;
      case GumboPackage.ALERT_STATEMENT__PORT:
        setPort((Port)null);
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
      case GumboPackage.ALERT_STATEMENT__GUARANTEE:
        return guarantee != null;
      case GumboPackage.ALERT_STATEMENT__PORT:
        return port != null;
    }
    return super.eIsSet(featureID);
  }

} //AlertStatementImpl
