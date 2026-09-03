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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.osate.aadl2.NamedElement;

import org.sireum.aadl.gumbo.gumbo.GumboPackage;
import org.sireum.aadl.gumbo.gumbo.ScheduleSubcomponentPath;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schedule Subcomponent Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.ScheduleSubcomponentPathImpl#getSubcomponent <em>Subcomponent</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.ScheduleSubcomponentPathImpl#getSubPath <em>Sub Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScheduleSubcomponentPathImpl extends MinimalEObjectImpl.Container implements ScheduleSubcomponentPath
{
  /**
   * The cached value of the '{@link #getSubcomponent() <em>Subcomponent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubcomponent()
   * @generated
   * @ordered
   */
  protected NamedElement subcomponent;

  /**
   * The cached value of the '{@link #getSubPath() <em>Sub Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubPath()
   * @generated
   * @ordered
   */
  protected ScheduleSubcomponentPath subPath;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScheduleSubcomponentPathImpl()
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
    return GumboPackage.Literals.SCHEDULE_SUBCOMPONENT_PATH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NamedElement getSubcomponent()
  {
    if (subcomponent != null && ((EObject)subcomponent).eIsProxy())
    {
      InternalEObject oldSubcomponent = (InternalEObject)subcomponent;
      subcomponent = (NamedElement)eResolveProxy(oldSubcomponent);
      if (subcomponent != oldSubcomponent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GumboPackage.SCHEDULE_SUBCOMPONENT_PATH__SUBCOMPONENT, oldSubcomponent, subcomponent));
      }
    }
    return subcomponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedElement basicGetSubcomponent()
  {
    return subcomponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSubcomponent(NamedElement newSubcomponent)
  {
    NamedElement oldSubcomponent = subcomponent;
    subcomponent = newSubcomponent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.SCHEDULE_SUBCOMPONENT_PATH__SUBCOMPONENT, oldSubcomponent, subcomponent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ScheduleSubcomponentPath getSubPath()
  {
    return subPath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSubPath(ScheduleSubcomponentPath newSubPath, NotificationChain msgs)
  {
    ScheduleSubcomponentPath oldSubPath = subPath;
    subPath = newSubPath;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.SCHEDULE_SUBCOMPONENT_PATH__SUB_PATH, oldSubPath, newSubPath);
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
  public void setSubPath(ScheduleSubcomponentPath newSubPath)
  {
    if (newSubPath != subPath)
    {
      NotificationChain msgs = null;
      if (subPath != null)
        msgs = ((InternalEObject)subPath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SCHEDULE_SUBCOMPONENT_PATH__SUB_PATH, null, msgs);
      if (newSubPath != null)
        msgs = ((InternalEObject)newSubPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.SCHEDULE_SUBCOMPONENT_PATH__SUB_PATH, null, msgs);
      msgs = basicSetSubPath(newSubPath, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.SCHEDULE_SUBCOMPONENT_PATH__SUB_PATH, newSubPath, newSubPath));
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
      case GumboPackage.SCHEDULE_SUBCOMPONENT_PATH__SUB_PATH:
        return basicSetSubPath(null, msgs);
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
      case GumboPackage.SCHEDULE_SUBCOMPONENT_PATH__SUBCOMPONENT:
        if (resolve) return getSubcomponent();
        return basicGetSubcomponent();
      case GumboPackage.SCHEDULE_SUBCOMPONENT_PATH__SUB_PATH:
        return getSubPath();
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
      case GumboPackage.SCHEDULE_SUBCOMPONENT_PATH__SUBCOMPONENT:
        setSubcomponent((NamedElement)newValue);
        return;
      case GumboPackage.SCHEDULE_SUBCOMPONENT_PATH__SUB_PATH:
        setSubPath((ScheduleSubcomponentPath)newValue);
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
      case GumboPackage.SCHEDULE_SUBCOMPONENT_PATH__SUBCOMPONENT:
        setSubcomponent((NamedElement)null);
        return;
      case GumboPackage.SCHEDULE_SUBCOMPONENT_PATH__SUB_PATH:
        setSubPath((ScheduleSubcomponentPath)null);
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
      case GumboPackage.SCHEDULE_SUBCOMPONENT_PATH__SUBCOMPONENT:
        return subcomponent != null;
      case GumboPackage.SCHEDULE_SUBCOMPONENT_PATH__SUB_PATH:
        return subPath != null;
    }
    return super.eIsSet(featureID);
  }

} //ScheduleSubcomponentPathImpl
