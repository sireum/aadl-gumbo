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

import org.sireum.aadl.gumbo.gumbo.GuaranteeStatement;
import org.sireum.aadl.gumbo.gumbo.GumboPackage;
import org.sireum.aadl.gumbo.gumbo.InitializeSpecStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initialize Spec Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.InitializeSpecStatementImpl#getGuaranteeStatement <em>Guarantee Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InitializeSpecStatementImpl extends MinimalEObjectImpl.Container implements InitializeSpecStatement
{
  /**
   * The cached value of the '{@link #getGuaranteeStatement() <em>Guarantee Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuaranteeStatement()
   * @generated
   * @ordered
   */
  protected GuaranteeStatement guaranteeStatement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InitializeSpecStatementImpl()
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
    return GumboPackage.Literals.INITIALIZE_SPEC_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GuaranteeStatement getGuaranteeStatement()
  {
    return guaranteeStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGuaranteeStatement(GuaranteeStatement newGuaranteeStatement, NotificationChain msgs)
  {
    GuaranteeStatement oldGuaranteeStatement = guaranteeStatement;
    guaranteeStatement = newGuaranteeStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.INITIALIZE_SPEC_STATEMENT__GUARANTEE_STATEMENT, oldGuaranteeStatement, newGuaranteeStatement);
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
  public void setGuaranteeStatement(GuaranteeStatement newGuaranteeStatement)
  {
    if (newGuaranteeStatement != guaranteeStatement)
    {
      NotificationChain msgs = null;
      if (guaranteeStatement != null)
        msgs = ((InternalEObject)guaranteeStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.INITIALIZE_SPEC_STATEMENT__GUARANTEE_STATEMENT, null, msgs);
      if (newGuaranteeStatement != null)
        msgs = ((InternalEObject)newGuaranteeStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.INITIALIZE_SPEC_STATEMENT__GUARANTEE_STATEMENT, null, msgs);
      msgs = basicSetGuaranteeStatement(newGuaranteeStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.INITIALIZE_SPEC_STATEMENT__GUARANTEE_STATEMENT, newGuaranteeStatement, newGuaranteeStatement));
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
      case GumboPackage.INITIALIZE_SPEC_STATEMENT__GUARANTEE_STATEMENT:
        return basicSetGuaranteeStatement(null, msgs);
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
      case GumboPackage.INITIALIZE_SPEC_STATEMENT__GUARANTEE_STATEMENT:
        return getGuaranteeStatement();
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
      case GumboPackage.INITIALIZE_SPEC_STATEMENT__GUARANTEE_STATEMENT:
        setGuaranteeStatement((GuaranteeStatement)newValue);
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
      case GumboPackage.INITIALIZE_SPEC_STATEMENT__GUARANTEE_STATEMENT:
        setGuaranteeStatement((GuaranteeStatement)null);
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
      case GumboPackage.INITIALIZE_SPEC_STATEMENT__GUARANTEE_STATEMENT:
        return guaranteeStatement != null;
    }
    return super.eIsSet(featureID);
  }

} //InitializeSpecStatementImpl
