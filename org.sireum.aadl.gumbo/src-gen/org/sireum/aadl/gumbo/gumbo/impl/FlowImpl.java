/**
 * * Copyright (c) 2021, Kansas State University
 *  *
 * All rights reserved.
 *  *
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
 *  *
 * 1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 *  *
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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sireum.aadl.gumbo.gumbo.FeatureElement;
import org.sireum.aadl.gumbo.gumbo.Flow;
import org.sireum.aadl.gumbo.gumbo.GumboPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.FlowImpl#getFlowId <em>Flow Id</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.FlowImpl#getSrcPorts <em>Src Ports</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.FlowImpl#getDstPorts <em>Dst Ports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlowImpl extends MinimalEObjectImpl.Container implements Flow
{
  /**
   * The default value of the '{@link #getFlowId() <em>Flow Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFlowId()
   * @generated
   * @ordered
   */
  protected static final String FLOW_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFlowId() <em>Flow Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFlowId()
   * @generated
   * @ordered
   */
  protected String flowId = FLOW_ID_EDEFAULT;

  /**
   * The cached value of the '{@link #getSrcPorts() <em>Src Ports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSrcPorts()
   * @generated
   * @ordered
   */
  protected EList<FeatureElement> srcPorts;

  /**
   * The cached value of the '{@link #getDstPorts() <em>Dst Ports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDstPorts()
   * @generated
   * @ordered
   */
  protected EList<FeatureElement> dstPorts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FlowImpl()
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
    return GumboPackage.Literals.FLOW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getFlowId()
  {
    return flowId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFlowId(String newFlowId)
  {
    String oldFlowId = flowId;
    flowId = newFlowId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.FLOW__FLOW_ID, oldFlowId, flowId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<FeatureElement> getSrcPorts()
  {
    if (srcPorts == null)
    {
      srcPorts = new EObjectContainmentEList<FeatureElement>(FeatureElement.class, this, GumboPackage.FLOW__SRC_PORTS);
    }
    return srcPorts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<FeatureElement> getDstPorts()
  {
    if (dstPorts == null)
    {
      dstPorts = new EObjectContainmentEList<FeatureElement>(FeatureElement.class, this, GumboPackage.FLOW__DST_PORTS);
    }
    return dstPorts;
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
      case GumboPackage.FLOW__SRC_PORTS:
        return ((InternalEList<?>)getSrcPorts()).basicRemove(otherEnd, msgs);
      case GumboPackage.FLOW__DST_PORTS:
        return ((InternalEList<?>)getDstPorts()).basicRemove(otherEnd, msgs);
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
      case GumboPackage.FLOW__FLOW_ID:
        return getFlowId();
      case GumboPackage.FLOW__SRC_PORTS:
        return getSrcPorts();
      case GumboPackage.FLOW__DST_PORTS:
        return getDstPorts();
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
      case GumboPackage.FLOW__FLOW_ID:
        setFlowId((String)newValue);
        return;
      case GumboPackage.FLOW__SRC_PORTS:
        getSrcPorts().clear();
        getSrcPorts().addAll((Collection<? extends FeatureElement>)newValue);
        return;
      case GumboPackage.FLOW__DST_PORTS:
        getDstPorts().clear();
        getDstPorts().addAll((Collection<? extends FeatureElement>)newValue);
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
      case GumboPackage.FLOW__FLOW_ID:
        setFlowId(FLOW_ID_EDEFAULT);
        return;
      case GumboPackage.FLOW__SRC_PORTS:
        getSrcPorts().clear();
        return;
      case GumboPackage.FLOW__DST_PORTS:
        getDstPorts().clear();
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
      case GumboPackage.FLOW__FLOW_ID:
        return FLOW_ID_EDEFAULT == null ? flowId != null : !FLOW_ID_EDEFAULT.equals(flowId);
      case GumboPackage.FLOW__SRC_PORTS:
        return srcPorts != null && !srcPorts.isEmpty();
      case GumboPackage.FLOW__DST_PORTS:
        return dstPorts != null && !dstPorts.isEmpty();
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
    result.append(" (flowId: ");
    result.append(flowId);
    result.append(')');
    return result.toString();
  }

} //FlowImpl
