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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.aadl2.NamedElement;

import org.sireum.aadl.gumbo.gumbo.DataElement;
import org.sireum.aadl.gumbo.gumbo.GumboPackage;
import org.sireum.aadl.gumbo.gumbo.OwnedExpression;
import org.sireum.aadl.gumbo.gumbo.RecordLitExpr;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Record Lit Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.RecordLitExprImpl#getRecordType <em>Record Type</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.RecordLitExprImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.RecordLitExprImpl#getArgExpr <em>Arg Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecordLitExprImpl extends GExprImpl implements RecordLitExpr
{
  /**
   * The cached value of the '{@link #getRecordType() <em>Record Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecordType()
   * @generated
   * @ordered
   */
  protected DataElement recordType;

  /**
   * The cached value of the '{@link #getArgs() <em>Args</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs()
   * @generated
   * @ordered
   */
  protected EList<NamedElement> args;

  /**
   * The cached value of the '{@link #getArgExpr() <em>Arg Expr</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgExpr()
   * @generated
   * @ordered
   */
  protected EList<OwnedExpression> argExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RecordLitExprImpl()
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
    return GumboPackage.Literals.RECORD_LIT_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DataElement getRecordType()
  {
    return recordType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRecordType(DataElement newRecordType, NotificationChain msgs)
  {
    DataElement oldRecordType = recordType;
    recordType = newRecordType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.RECORD_LIT_EXPR__RECORD_TYPE, oldRecordType, newRecordType);
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
  public void setRecordType(DataElement newRecordType)
  {
    if (newRecordType != recordType)
    {
      NotificationChain msgs = null;
      if (recordType != null)
        msgs = ((InternalEObject)recordType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.RECORD_LIT_EXPR__RECORD_TYPE, null, msgs);
      if (newRecordType != null)
        msgs = ((InternalEObject)newRecordType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.RECORD_LIT_EXPR__RECORD_TYPE, null, msgs);
      msgs = basicSetRecordType(newRecordType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.RECORD_LIT_EXPR__RECORD_TYPE, newRecordType, newRecordType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<NamedElement> getArgs()
  {
    if (args == null)
    {
      args = new EObjectResolvingEList<NamedElement>(NamedElement.class, this, GumboPackage.RECORD_LIT_EXPR__ARGS);
    }
    return args;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<OwnedExpression> getArgExpr()
  {
    if (argExpr == null)
    {
      argExpr = new EObjectContainmentEList<OwnedExpression>(OwnedExpression.class, this, GumboPackage.RECORD_LIT_EXPR__ARG_EXPR);
    }
    return argExpr;
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
      case GumboPackage.RECORD_LIT_EXPR__RECORD_TYPE:
        return basicSetRecordType(null, msgs);
      case GumboPackage.RECORD_LIT_EXPR__ARG_EXPR:
        return ((InternalEList<?>)getArgExpr()).basicRemove(otherEnd, msgs);
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
      case GumboPackage.RECORD_LIT_EXPR__RECORD_TYPE:
        return getRecordType();
      case GumboPackage.RECORD_LIT_EXPR__ARGS:
        return getArgs();
      case GumboPackage.RECORD_LIT_EXPR__ARG_EXPR:
        return getArgExpr();
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
      case GumboPackage.RECORD_LIT_EXPR__RECORD_TYPE:
        setRecordType((DataElement)newValue);
        return;
      case GumboPackage.RECORD_LIT_EXPR__ARGS:
        getArgs().clear();
        getArgs().addAll((Collection<? extends NamedElement>)newValue);
        return;
      case GumboPackage.RECORD_LIT_EXPR__ARG_EXPR:
        getArgExpr().clear();
        getArgExpr().addAll((Collection<? extends OwnedExpression>)newValue);
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
      case GumboPackage.RECORD_LIT_EXPR__RECORD_TYPE:
        setRecordType((DataElement)null);
        return;
      case GumboPackage.RECORD_LIT_EXPR__ARGS:
        getArgs().clear();
        return;
      case GumboPackage.RECORD_LIT_EXPR__ARG_EXPR:
        getArgExpr().clear();
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
      case GumboPackage.RECORD_LIT_EXPR__RECORD_TYPE:
        return recordType != null;
      case GumboPackage.RECORD_LIT_EXPR__ARGS:
        return args != null && !args.isEmpty();
      case GumboPackage.RECORD_LIT_EXPR__ARG_EXPR:
        return argExpr != null && !argExpr.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RecordLitExprImpl
