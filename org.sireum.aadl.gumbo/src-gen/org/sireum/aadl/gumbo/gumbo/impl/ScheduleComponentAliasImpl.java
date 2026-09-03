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

import org.sireum.aadl.gumbo.gumbo.GumboPackage;
import org.sireum.aadl.gumbo.gumbo.ScheduleComponentAlias;
import org.sireum.aadl.gumbo.gumbo.ScheduleSubcomponentPath;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schedule Component Alias</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.ScheduleComponentAliasImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.ScheduleComponentAliasImpl#getComponentPath <em>Component Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScheduleComponentAliasImpl extends MinimalEObjectImpl.Container implements ScheduleComponentAlias
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getComponentPath() <em>Component Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponentPath()
   * @generated
   * @ordered
   */
  protected ScheduleSubcomponentPath componentPath;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScheduleComponentAliasImpl()
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
    return GumboPackage.Literals.SCHEDULE_COMPONENT_ALIAS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.SCHEDULE_COMPONENT_ALIAS__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ScheduleSubcomponentPath getComponentPath()
  {
    return componentPath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetComponentPath(ScheduleSubcomponentPath newComponentPath, NotificationChain msgs)
  {
    ScheduleSubcomponentPath oldComponentPath = componentPath;
    componentPath = newComponentPath;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.SCHEDULE_COMPONENT_ALIAS__COMPONENT_PATH, oldComponentPath, newComponentPath);
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
  public void setComponentPath(ScheduleSubcomponentPath newComponentPath)
  {
    if (newComponentPath != componentPath)
    {
      NotificationChain msgs = null;
      if (componentPath != null)
        msgs = ((InternalEObject)componentPath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SCHEDULE_COMPONENT_ALIAS__COMPONENT_PATH, null, msgs);
      if (newComponentPath != null)
        msgs = ((InternalEObject)newComponentPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SCHEDULE_COMPONENT_ALIAS__COMPONENT_PATH, null, msgs);
      msgs = basicSetComponentPath(newComponentPath, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.SCHEDULE_COMPONENT_ALIAS__COMPONENT_PATH, newComponentPath, newComponentPath));
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
      case GumboPackage.SCHEDULE_COMPONENT_ALIAS__COMPONENT_PATH:
        return basicSetComponentPath(null, msgs);
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
      case GumboPackage.SCHEDULE_COMPONENT_ALIAS__NAME:
        return getName();
      case GumboPackage.SCHEDULE_COMPONENT_ALIAS__COMPONENT_PATH:
        return getComponentPath();
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
      case GumboPackage.SCHEDULE_COMPONENT_ALIAS__NAME:
        setName((String)newValue);
        return;
      case GumboPackage.SCHEDULE_COMPONENT_ALIAS__COMPONENT_PATH:
        setComponentPath((ScheduleSubcomponentPath)newValue);
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
      case GumboPackage.SCHEDULE_COMPONENT_ALIAS__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GumboPackage.SCHEDULE_COMPONENT_ALIAS__COMPONENT_PATH:
        setComponentPath((ScheduleSubcomponentPath)null);
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
      case GumboPackage.SCHEDULE_COMPONENT_ALIAS__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GumboPackage.SCHEDULE_COMPONENT_ALIAS__COMPONENT_PATH:
        return componentPath != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ScheduleComponentAliasImpl
