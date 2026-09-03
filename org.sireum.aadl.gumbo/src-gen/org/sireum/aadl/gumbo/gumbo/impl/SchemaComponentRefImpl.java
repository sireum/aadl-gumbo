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

import org.sireum.aadl.gumbo.gumbo.GumboPackage;
import org.sireum.aadl.gumbo.gumbo.SchemaComponentRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema Component Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.SchemaComponentRefImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.SchemaComponentRefImpl#getOccurrenceLabel <em>Occurrence Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchemaComponentRefImpl extends SchemaElementImpl implements SchemaComponentRef
{
  /**
   * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponent()
   * @generated
   * @ordered
   */
  protected EObject component;

  /**
   * The default value of the '{@link #getOccurrenceLabel() <em>Occurrence Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOccurrenceLabel()
   * @generated
   * @ordered
   */
  protected static final String OCCURRENCE_LABEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOccurrenceLabel() <em>Occurrence Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOccurrenceLabel()
   * @generated
   * @ordered
   */
  protected String occurrenceLabel = OCCURRENCE_LABEL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SchemaComponentRefImpl()
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
    return GumboPackage.Literals.SCHEMA_COMPONENT_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject getComponent()
  {
    if (component != null && component.eIsProxy())
    {
      InternalEObject oldComponent = (InternalEObject)component;
      component = eResolveProxy(oldComponent);
      if (component != oldComponent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GumboPackage.SCHEMA_COMPONENT_REF__COMPONENT, oldComponent, component));
      }
    }
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject basicGetComponent()
  {
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setComponent(EObject newComponent)
  {
    EObject oldComponent = component;
    component = newComponent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.SCHEMA_COMPONENT_REF__COMPONENT, oldComponent, component));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getOccurrenceLabel()
  {
    return occurrenceLabel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOccurrenceLabel(String newOccurrenceLabel)
  {
    String oldOccurrenceLabel = occurrenceLabel;
    occurrenceLabel = newOccurrenceLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.SCHEMA_COMPONENT_REF__OCCURRENCE_LABEL, oldOccurrenceLabel, occurrenceLabel));
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
      case GumboPackage.SCHEMA_COMPONENT_REF__COMPONENT:
        if (resolve) return getComponent();
        return basicGetComponent();
      case GumboPackage.SCHEMA_COMPONENT_REF__OCCURRENCE_LABEL:
        return getOccurrenceLabel();
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
      case GumboPackage.SCHEMA_COMPONENT_REF__COMPONENT:
        setComponent((EObject)newValue);
        return;
      case GumboPackage.SCHEMA_COMPONENT_REF__OCCURRENCE_LABEL:
        setOccurrenceLabel((String)newValue);
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
      case GumboPackage.SCHEMA_COMPONENT_REF__COMPONENT:
        setComponent((EObject)null);
        return;
      case GumboPackage.SCHEMA_COMPONENT_REF__OCCURRENCE_LABEL:
        setOccurrenceLabel(OCCURRENCE_LABEL_EDEFAULT);
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
      case GumboPackage.SCHEMA_COMPONENT_REF__COMPONENT:
        return component != null;
      case GumboPackage.SCHEMA_COMPONENT_REF__OCCURRENCE_LABEL:
        return OCCURRENCE_LABEL_EDEFAULT == null ? occurrenceLabel != null : !OCCURRENCE_LABEL_EDEFAULT.equals(occurrenceLabel);
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
    result.append(" (occurrenceLabel: ");
    result.append(occurrenceLabel);
    result.append(')');
    return result.toString();
  }

} //SchemaComponentRefImpl
