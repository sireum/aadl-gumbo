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

import org.sireum.aadl.gumbo.gumbo.AnonAssumeStatement;
import org.sireum.aadl.gumbo.gumbo.AnonGuaranteeStatement;
import org.sireum.aadl.gumbo.gumbo.CaseStatementClause;
import org.sireum.aadl.gumbo.gumbo.GumboPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case Statement Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.CaseStatementClauseImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.CaseStatementClauseImpl#getAssumeStatement <em>Assume Statement</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.CaseStatementClauseImpl#getGuaranteeStatement <em>Guarantee Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CaseStatementClauseImpl extends MinimalEObjectImpl.Container implements CaseStatementClause
{
  /**
   * The default value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDisplayName()
   * @generated
   * @ordered
   */
  protected static final String DISPLAY_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDisplayName()
   * @generated
   * @ordered
   */
  protected String displayName = DISPLAY_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getAssumeStatement() <em>Assume Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssumeStatement()
   * @generated
   * @ordered
   */
  protected AnonAssumeStatement assumeStatement;

  /**
   * The cached value of the '{@link #getGuaranteeStatement() <em>Guarantee Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuaranteeStatement()
   * @generated
   * @ordered
   */
  protected AnonGuaranteeStatement guaranteeStatement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CaseStatementClauseImpl()
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
    return GumboPackage.Literals.CASE_STATEMENT_CLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDisplayName()
  {
    return displayName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDisplayName(String newDisplayName)
  {
    String oldDisplayName = displayName;
    displayName = newDisplayName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.CASE_STATEMENT_CLAUSE__DISPLAY_NAME, oldDisplayName, displayName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AnonAssumeStatement getAssumeStatement()
  {
    return assumeStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssumeStatement(AnonAssumeStatement newAssumeStatement, NotificationChain msgs)
  {
    AnonAssumeStatement oldAssumeStatement = assumeStatement;
    assumeStatement = newAssumeStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.CASE_STATEMENT_CLAUSE__ASSUME_STATEMENT, oldAssumeStatement, newAssumeStatement);
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
  public void setAssumeStatement(AnonAssumeStatement newAssumeStatement)
  {
    if (newAssumeStatement != assumeStatement)
    {
      NotificationChain msgs = null;
      if (assumeStatement != null)
        msgs = ((InternalEObject)assumeStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.CASE_STATEMENT_CLAUSE__ASSUME_STATEMENT, null, msgs);
      if (newAssumeStatement != null)
        msgs = ((InternalEObject)newAssumeStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.CASE_STATEMENT_CLAUSE__ASSUME_STATEMENT, null, msgs);
      msgs = basicSetAssumeStatement(newAssumeStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.CASE_STATEMENT_CLAUSE__ASSUME_STATEMENT, newAssumeStatement, newAssumeStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AnonGuaranteeStatement getGuaranteeStatement()
  {
    return guaranteeStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGuaranteeStatement(AnonGuaranteeStatement newGuaranteeStatement, NotificationChain msgs)
  {
    AnonGuaranteeStatement oldGuaranteeStatement = guaranteeStatement;
    guaranteeStatement = newGuaranteeStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.CASE_STATEMENT_CLAUSE__GUARANTEE_STATEMENT, oldGuaranteeStatement, newGuaranteeStatement);
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
  public void setGuaranteeStatement(AnonGuaranteeStatement newGuaranteeStatement)
  {
    if (newGuaranteeStatement != guaranteeStatement)
    {
      NotificationChain msgs = null;
      if (guaranteeStatement != null)
        msgs = ((InternalEObject)guaranteeStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.CASE_STATEMENT_CLAUSE__GUARANTEE_STATEMENT, null, msgs);
      if (newGuaranteeStatement != null)
        msgs = ((InternalEObject)newGuaranteeStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.CASE_STATEMENT_CLAUSE__GUARANTEE_STATEMENT, null, msgs);
      msgs = basicSetGuaranteeStatement(newGuaranteeStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.CASE_STATEMENT_CLAUSE__GUARANTEE_STATEMENT, newGuaranteeStatement, newGuaranteeStatement));
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
      case GumboPackage.CASE_STATEMENT_CLAUSE__ASSUME_STATEMENT:
        return basicSetAssumeStatement(null, msgs);
      case GumboPackage.CASE_STATEMENT_CLAUSE__GUARANTEE_STATEMENT:
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
      case GumboPackage.CASE_STATEMENT_CLAUSE__DISPLAY_NAME:
        return getDisplayName();
      case GumboPackage.CASE_STATEMENT_CLAUSE__ASSUME_STATEMENT:
        return getAssumeStatement();
      case GumboPackage.CASE_STATEMENT_CLAUSE__GUARANTEE_STATEMENT:
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
      case GumboPackage.CASE_STATEMENT_CLAUSE__DISPLAY_NAME:
        setDisplayName((String)newValue);
        return;
      case GumboPackage.CASE_STATEMENT_CLAUSE__ASSUME_STATEMENT:
        setAssumeStatement((AnonAssumeStatement)newValue);
        return;
      case GumboPackage.CASE_STATEMENT_CLAUSE__GUARANTEE_STATEMENT:
        setGuaranteeStatement((AnonGuaranteeStatement)newValue);
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
      case GumboPackage.CASE_STATEMENT_CLAUSE__DISPLAY_NAME:
        setDisplayName(DISPLAY_NAME_EDEFAULT);
        return;
      case GumboPackage.CASE_STATEMENT_CLAUSE__ASSUME_STATEMENT:
        setAssumeStatement((AnonAssumeStatement)null);
        return;
      case GumboPackage.CASE_STATEMENT_CLAUSE__GUARANTEE_STATEMENT:
        setGuaranteeStatement((AnonGuaranteeStatement)null);
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
      case GumboPackage.CASE_STATEMENT_CLAUSE__DISPLAY_NAME:
        return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
      case GumboPackage.CASE_STATEMENT_CLAUSE__ASSUME_STATEMENT:
        return assumeStatement != null;
      case GumboPackage.CASE_STATEMENT_CLAUSE__GUARANTEE_STATEMENT:
        return guaranteeStatement != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (displayName: ");
    result.append(displayName);
    result.append(')');
    return result.toString();
  }

} //CaseStatementClauseImpl
