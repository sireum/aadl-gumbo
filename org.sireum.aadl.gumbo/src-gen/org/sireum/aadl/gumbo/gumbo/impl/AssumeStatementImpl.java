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

import org.osate.aadl2.NamedElement;

import org.sireum.aadl.gumbo.gumbo.AssumeStatement;
import org.sireum.aadl.gumbo.gumbo.GumboPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assume Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.AssumeStatementImpl#getForPort <em>For Port</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.AssumeStatementImpl#getAssumeTitle <em>Assume Title</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.AssumeStatementImpl#getPred <em>Pred</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.AssumeStatementImpl#getTracesTo <em>Traces To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssumeStatementImpl extends SpecStatementImpl implements AssumeStatement
{
  /**
   * The cached value of the '{@link #getForPort() <em>For Port</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForPort()
   * @generated
   * @ordered
   */
  protected NamedElement forPort;

  /**
   * The default value of the '{@link #getAssumeTitle() <em>Assume Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssumeTitle()
   * @generated
   * @ordered
   */
  protected static final String ASSUME_TITLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAssumeTitle() <em>Assume Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssumeTitle()
   * @generated
   * @ordered
   */
  protected String assumeTitle = ASSUME_TITLE_EDEFAULT;

  /**
   * The default value of the '{@link #getPred() <em>Pred</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPred()
   * @generated
   * @ordered
   */
  protected static final String PRED_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPred() <em>Pred</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPred()
   * @generated
   * @ordered
   */
  protected String pred = PRED_EDEFAULT;

  /**
   * The default value of the '{@link #getTracesTo() <em>Traces To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTracesTo()
   * @generated
   * @ordered
   */
  protected static final String TRACES_TO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTracesTo() <em>Traces To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTracesTo()
   * @generated
   * @ordered
   */
  protected String tracesTo = TRACES_TO_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssumeStatementImpl()
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
    return GumboPackage.Literals.ASSUME_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NamedElement getForPort()
  {
    if (forPort != null && ((EObject)forPort).eIsProxy())
    {
      InternalEObject oldForPort = (InternalEObject)forPort;
      forPort = (NamedElement)eResolveProxy(oldForPort);
      if (forPort != oldForPort)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GumboPackage.ASSUME_STATEMENT__FOR_PORT, oldForPort, forPort));
      }
    }
    return forPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedElement basicGetForPort()
  {
    return forPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setForPort(NamedElement newForPort)
  {
    NamedElement oldForPort = forPort;
    forPort = newForPort;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.ASSUME_STATEMENT__FOR_PORT, oldForPort, forPort));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getAssumeTitle()
  {
    return assumeTitle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAssumeTitle(String newAssumeTitle)
  {
    String oldAssumeTitle = assumeTitle;
    assumeTitle = newAssumeTitle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.ASSUME_STATEMENT__ASSUME_TITLE, oldAssumeTitle, assumeTitle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPred()
  {
    return pred;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPred(String newPred)
  {
    String oldPred = pred;
    pred = newPred;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.ASSUME_STATEMENT__PRED, oldPred, pred));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTracesTo()
  {
    return tracesTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTracesTo(String newTracesTo)
  {
    String oldTracesTo = tracesTo;
    tracesTo = newTracesTo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.ASSUME_STATEMENT__TRACES_TO, oldTracesTo, tracesTo));
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
      case GumboPackage.ASSUME_STATEMENT__FOR_PORT:
        if (resolve) return getForPort();
        return basicGetForPort();
      case GumboPackage.ASSUME_STATEMENT__ASSUME_TITLE:
        return getAssumeTitle();
      case GumboPackage.ASSUME_STATEMENT__PRED:
        return getPred();
      case GumboPackage.ASSUME_STATEMENT__TRACES_TO:
        return getTracesTo();
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
      case GumboPackage.ASSUME_STATEMENT__FOR_PORT:
        setForPort((NamedElement)newValue);
        return;
      case GumboPackage.ASSUME_STATEMENT__ASSUME_TITLE:
        setAssumeTitle((String)newValue);
        return;
      case GumboPackage.ASSUME_STATEMENT__PRED:
        setPred((String)newValue);
        return;
      case GumboPackage.ASSUME_STATEMENT__TRACES_TO:
        setTracesTo((String)newValue);
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
      case GumboPackage.ASSUME_STATEMENT__FOR_PORT:
        setForPort((NamedElement)null);
        return;
      case GumboPackage.ASSUME_STATEMENT__ASSUME_TITLE:
        setAssumeTitle(ASSUME_TITLE_EDEFAULT);
        return;
      case GumboPackage.ASSUME_STATEMENT__PRED:
        setPred(PRED_EDEFAULT);
        return;
      case GumboPackage.ASSUME_STATEMENT__TRACES_TO:
        setTracesTo(TRACES_TO_EDEFAULT);
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
      case GumboPackage.ASSUME_STATEMENT__FOR_PORT:
        return forPort != null;
      case GumboPackage.ASSUME_STATEMENT__ASSUME_TITLE:
        return ASSUME_TITLE_EDEFAULT == null ? assumeTitle != null : !ASSUME_TITLE_EDEFAULT.equals(assumeTitle);
      case GumboPackage.ASSUME_STATEMENT__PRED:
        return PRED_EDEFAULT == null ? pred != null : !PRED_EDEFAULT.equals(pred);
      case GumboPackage.ASSUME_STATEMENT__TRACES_TO:
        return TRACES_TO_EDEFAULT == null ? tracesTo != null : !TRACES_TO_EDEFAULT.equals(tracesTo);
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
    result.append(" (assumeTitle: ");
    result.append(assumeTitle);
    result.append(", pred: ");
    result.append(pred);
    result.append(", tracesTo: ");
    result.append(tracesTo);
    result.append(')');
    return result.toString();
  }

} //AssumeStatementImpl
