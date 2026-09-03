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

import org.sireum.aadl.gumbo.gumbo.DataRefExpr;
import org.sireum.aadl.gumbo.gumbo.GumboPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Ref Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.DataRefExprImpl#getPortOrSubcomponentOrStateVar <em>Port Or Subcomponent Or State Var</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataRefExprImpl extends GExprImpl implements DataRefExpr
{
  /**
   * The cached value of the '{@link #getPortOrSubcomponentOrStateVar() <em>Port Or Subcomponent Or State Var</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPortOrSubcomponentOrStateVar()
   * @generated
   * @ordered
   */
  protected EObject portOrSubcomponentOrStateVar;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataRefExprImpl()
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
    return GumboPackage.Literals.DATA_REF_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject getPortOrSubcomponentOrStateVar()
  {
    if (portOrSubcomponentOrStateVar != null && portOrSubcomponentOrStateVar.eIsProxy())
    {
      InternalEObject oldPortOrSubcomponentOrStateVar = (InternalEObject)portOrSubcomponentOrStateVar;
      portOrSubcomponentOrStateVar = eResolveProxy(oldPortOrSubcomponentOrStateVar);
      if (portOrSubcomponentOrStateVar != oldPortOrSubcomponentOrStateVar)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GumboPackage.DATA_REF_EXPR__PORT_OR_SUBCOMPONENT_OR_STATE_VAR, oldPortOrSubcomponentOrStateVar, portOrSubcomponentOrStateVar));
      }
    }
    return portOrSubcomponentOrStateVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject basicGetPortOrSubcomponentOrStateVar()
  {
    return portOrSubcomponentOrStateVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPortOrSubcomponentOrStateVar(EObject newPortOrSubcomponentOrStateVar)
  {
    EObject oldPortOrSubcomponentOrStateVar = portOrSubcomponentOrStateVar;
    portOrSubcomponentOrStateVar = newPortOrSubcomponentOrStateVar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.DATA_REF_EXPR__PORT_OR_SUBCOMPONENT_OR_STATE_VAR, oldPortOrSubcomponentOrStateVar, portOrSubcomponentOrStateVar));
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
      case GumboPackage.DATA_REF_EXPR__PORT_OR_SUBCOMPONENT_OR_STATE_VAR:
        if (resolve) return getPortOrSubcomponentOrStateVar();
        return basicGetPortOrSubcomponentOrStateVar();
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
      case GumboPackage.DATA_REF_EXPR__PORT_OR_SUBCOMPONENT_OR_STATE_VAR:
        setPortOrSubcomponentOrStateVar((EObject)newValue);
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
      case GumboPackage.DATA_REF_EXPR__PORT_OR_SUBCOMPONENT_OR_STATE_VAR:
        setPortOrSubcomponentOrStateVar((EObject)null);
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
      case GumboPackage.DATA_REF_EXPR__PORT_OR_SUBCOMPONENT_OR_STATE_VAR:
        return portOrSubcomponentOrStateVar != null;
    }
    return super.eIsSet(featureID);
  }

} //DataRefExprImpl
