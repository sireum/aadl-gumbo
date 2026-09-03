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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.sireum.aadl.gumbo.gumbo.GumboPackage;
import org.sireum.aadl.gumbo.gumbo.InfoFlowClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Info Flow Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.InfoFlowClauseImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.InfoFlowClauseImpl#getDescriptor <em>Descriptor</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.InfoFlowClauseImpl#getFromPortOrStateVar <em>From Port Or State Var</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.InfoFlowClauseImpl#getToPortOrStateVar <em>To Port Or State Var</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InfoFlowClauseImpl extends MinimalEObjectImpl.Container implements InfoFlowClause
{
  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The default value of the '{@link #getDescriptor() <em>Descriptor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescriptor()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescriptor() <em>Descriptor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescriptor()
   * @generated
   * @ordered
   */
  protected String descriptor = DESCRIPTOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getFromPortOrStateVar() <em>From Port Or State Var</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFromPortOrStateVar()
   * @generated
   * @ordered
   */
  protected EList<EObject> fromPortOrStateVar;

  /**
   * The cached value of the '{@link #getToPortOrStateVar() <em>To Port Or State Var</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToPortOrStateVar()
   * @generated
   * @ordered
   */
  protected EList<EObject> toPortOrStateVar;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InfoFlowClauseImpl()
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
    return GumboPackage.Literals.INFO_FLOW_CLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.INFO_FLOW_CLAUSE__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDescriptor()
  {
    return descriptor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDescriptor(String newDescriptor)
  {
    String oldDescriptor = descriptor;
    descriptor = newDescriptor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.INFO_FLOW_CLAUSE__DESCRIPTOR, oldDescriptor, descriptor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<EObject> getFromPortOrStateVar()
  {
    if (fromPortOrStateVar == null)
    {
      fromPortOrStateVar = new EObjectResolvingEList<EObject>(EObject.class, this, GumboPackage.INFO_FLOW_CLAUSE__FROM_PORT_OR_STATE_VAR);
    }
    return fromPortOrStateVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<EObject> getToPortOrStateVar()
  {
    if (toPortOrStateVar == null)
    {
      toPortOrStateVar = new EObjectResolvingEList<EObject>(EObject.class, this, GumboPackage.INFO_FLOW_CLAUSE__TO_PORT_OR_STATE_VAR);
    }
    return toPortOrStateVar;
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
      case GumboPackage.INFO_FLOW_CLAUSE__ID:
        return getId();
      case GumboPackage.INFO_FLOW_CLAUSE__DESCRIPTOR:
        return getDescriptor();
      case GumboPackage.INFO_FLOW_CLAUSE__FROM_PORT_OR_STATE_VAR:
        return getFromPortOrStateVar();
      case GumboPackage.INFO_FLOW_CLAUSE__TO_PORT_OR_STATE_VAR:
        return getToPortOrStateVar();
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
      case GumboPackage.INFO_FLOW_CLAUSE__ID:
        setId((String)newValue);
        return;
      case GumboPackage.INFO_FLOW_CLAUSE__DESCRIPTOR:
        setDescriptor((String)newValue);
        return;
      case GumboPackage.INFO_FLOW_CLAUSE__FROM_PORT_OR_STATE_VAR:
        getFromPortOrStateVar().clear();
        getFromPortOrStateVar().addAll((Collection<? extends EObject>)newValue);
        return;
      case GumboPackage.INFO_FLOW_CLAUSE__TO_PORT_OR_STATE_VAR:
        getToPortOrStateVar().clear();
        getToPortOrStateVar().addAll((Collection<? extends EObject>)newValue);
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
      case GumboPackage.INFO_FLOW_CLAUSE__ID:
        setId(ID_EDEFAULT);
        return;
      case GumboPackage.INFO_FLOW_CLAUSE__DESCRIPTOR:
        setDescriptor(DESCRIPTOR_EDEFAULT);
        return;
      case GumboPackage.INFO_FLOW_CLAUSE__FROM_PORT_OR_STATE_VAR:
        getFromPortOrStateVar().clear();
        return;
      case GumboPackage.INFO_FLOW_CLAUSE__TO_PORT_OR_STATE_VAR:
        getToPortOrStateVar().clear();
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
      case GumboPackage.INFO_FLOW_CLAUSE__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case GumboPackage.INFO_FLOW_CLAUSE__DESCRIPTOR:
        return DESCRIPTOR_EDEFAULT == null ? descriptor != null : !DESCRIPTOR_EDEFAULT.equals(descriptor);
      case GumboPackage.INFO_FLOW_CLAUSE__FROM_PORT_OR_STATE_VAR:
        return fromPortOrStateVar != null && !fromPortOrStateVar.isEmpty();
      case GumboPackage.INFO_FLOW_CLAUSE__TO_PORT_OR_STATE_VAR:
        return toPortOrStateVar != null && !toPortOrStateVar.isEmpty();
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
    result.append(" (id: ");
    result.append(id);
    result.append(", descriptor: ");
    result.append(descriptor);
    result.append(')');
    return result.toString();
  }

} //InfoFlowClauseImpl
