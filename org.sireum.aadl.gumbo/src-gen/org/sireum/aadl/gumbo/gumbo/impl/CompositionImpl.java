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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sireum.aadl.gumbo.gumbo.Composition;
import org.sireum.aadl.gumbo.gumbo.CompositionProperty;
import org.sireum.aadl.gumbo.gumbo.GumboPackage;
import org.sireum.aadl.gumbo.gumbo.ScheduleComponentAliases;
import org.sireum.aadl.gumbo.gumbo.SchedulePortAliases;
import org.sireum.aadl.gumbo.gumbo.ScheduleStateVarAliases;
import org.sireum.aadl.gumbo.gumbo.Schema;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.CompositionImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.CompositionImpl#getComponentAliases <em>Component Aliases</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.CompositionImpl#getPortAliases <em>Port Aliases</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.CompositionImpl#getStateVarAliases <em>State Var Aliases</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.CompositionImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.CompositionImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositionImpl extends MinimalEObjectImpl.Container implements Composition
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
   * The cached value of the '{@link #getComponentAliases() <em>Component Aliases</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponentAliases()
   * @generated
   * @ordered
   */
  protected ScheduleComponentAliases componentAliases;

  /**
   * The cached value of the '{@link #getPortAliases() <em>Port Aliases</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPortAliases()
   * @generated
   * @ordered
   */
  protected SchedulePortAliases portAliases;

  /**
   * The cached value of the '{@link #getStateVarAliases() <em>State Var Aliases</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStateVarAliases()
   * @generated
   * @ordered
   */
  protected ScheduleStateVarAliases stateVarAliases;

  /**
   * The cached value of the '{@link #getSchema() <em>Schema</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSchema()
   * @generated
   * @ordered
   */
  protected Schema schema;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<CompositionProperty> properties;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CompositionImpl()
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
    return GumboPackage.Literals.COMPOSITION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.COMPOSITION__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ScheduleComponentAliases getComponentAliases()
  {
    return componentAliases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetComponentAliases(ScheduleComponentAliases newComponentAliases, NotificationChain msgs)
  {
    ScheduleComponentAliases oldComponentAliases = componentAliases;
    componentAliases = newComponentAliases;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.COMPOSITION__COMPONENT_ALIASES, oldComponentAliases, newComponentAliases);
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
  public void setComponentAliases(ScheduleComponentAliases newComponentAliases)
  {
    if (newComponentAliases != componentAliases)
    {
      NotificationChain msgs = null;
      if (componentAliases != null)
        msgs = ((InternalEObject)componentAliases).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.COMPOSITION__COMPONENT_ALIASES, null, msgs);
      if (newComponentAliases != null)
        msgs = ((InternalEObject)newComponentAliases).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.COMPOSITION__COMPONENT_ALIASES, null, msgs);
      msgs = basicSetComponentAliases(newComponentAliases, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.COMPOSITION__COMPONENT_ALIASES, newComponentAliases, newComponentAliases));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SchedulePortAliases getPortAliases()
  {
    return portAliases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPortAliases(SchedulePortAliases newPortAliases, NotificationChain msgs)
  {
    SchedulePortAliases oldPortAliases = portAliases;
    portAliases = newPortAliases;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.COMPOSITION__PORT_ALIASES, oldPortAliases, newPortAliases);
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
  public void setPortAliases(SchedulePortAliases newPortAliases)
  {
    if (newPortAliases != portAliases)
    {
      NotificationChain msgs = null;
      if (portAliases != null)
        msgs = ((InternalEObject)portAliases).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.COMPOSITION__PORT_ALIASES, null, msgs);
      if (newPortAliases != null)
        msgs = ((InternalEObject)newPortAliases).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.COMPOSITION__PORT_ALIASES, null, msgs);
      msgs = basicSetPortAliases(newPortAliases, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.COMPOSITION__PORT_ALIASES, newPortAliases, newPortAliases));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ScheduleStateVarAliases getStateVarAliases()
  {
    return stateVarAliases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStateVarAliases(ScheduleStateVarAliases newStateVarAliases, NotificationChain msgs)
  {
    ScheduleStateVarAliases oldStateVarAliases = stateVarAliases;
    stateVarAliases = newStateVarAliases;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.COMPOSITION__STATE_VAR_ALIASES, oldStateVarAliases, newStateVarAliases);
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
  public void setStateVarAliases(ScheduleStateVarAliases newStateVarAliases)
  {
    if (newStateVarAliases != stateVarAliases)
    {
      NotificationChain msgs = null;
      if (stateVarAliases != null)
        msgs = ((InternalEObject)stateVarAliases).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.COMPOSITION__STATE_VAR_ALIASES, null, msgs);
      if (newStateVarAliases != null)
        msgs = ((InternalEObject)newStateVarAliases).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.COMPOSITION__STATE_VAR_ALIASES, null, msgs);
      msgs = basicSetStateVarAliases(newStateVarAliases, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.COMPOSITION__STATE_VAR_ALIASES, newStateVarAliases, newStateVarAliases));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Schema getSchema()
  {
    return schema;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSchema(Schema newSchema, NotificationChain msgs)
  {
    Schema oldSchema = schema;
    schema = newSchema;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.COMPOSITION__SCHEMA, oldSchema, newSchema);
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
  public void setSchema(Schema newSchema)
  {
    if (newSchema != schema)
    {
      NotificationChain msgs = null;
      if (schema != null)
        msgs = ((InternalEObject)schema).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.COMPOSITION__SCHEMA, null, msgs);
      if (newSchema != null)
        msgs = ((InternalEObject)newSchema).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.COMPOSITION__SCHEMA, null, msgs);
      msgs = basicSetSchema(newSchema, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.COMPOSITION__SCHEMA, newSchema, newSchema));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<CompositionProperty> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<CompositionProperty>(CompositionProperty.class, this, GumboPackage.COMPOSITION__PROPERTIES);
    }
    return properties;
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
      case GumboPackage.COMPOSITION__COMPONENT_ALIASES:
        return basicSetComponentAliases(null, msgs);
      case GumboPackage.COMPOSITION__PORT_ALIASES:
        return basicSetPortAliases(null, msgs);
      case GumboPackage.COMPOSITION__STATE_VAR_ALIASES:
        return basicSetStateVarAliases(null, msgs);
      case GumboPackage.COMPOSITION__SCHEMA:
        return basicSetSchema(null, msgs);
      case GumboPackage.COMPOSITION__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
      case GumboPackage.COMPOSITION__ID:
        return getId();
      case GumboPackage.COMPOSITION__COMPONENT_ALIASES:
        return getComponentAliases();
      case GumboPackage.COMPOSITION__PORT_ALIASES:
        return getPortAliases();
      case GumboPackage.COMPOSITION__STATE_VAR_ALIASES:
        return getStateVarAliases();
      case GumboPackage.COMPOSITION__SCHEMA:
        return getSchema();
      case GumboPackage.COMPOSITION__PROPERTIES:
        return getProperties();
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
      case GumboPackage.COMPOSITION__ID:
        setId((String)newValue);
        return;
      case GumboPackage.COMPOSITION__COMPONENT_ALIASES:
        setComponentAliases((ScheduleComponentAliases)newValue);
        return;
      case GumboPackage.COMPOSITION__PORT_ALIASES:
        setPortAliases((SchedulePortAliases)newValue);
        return;
      case GumboPackage.COMPOSITION__STATE_VAR_ALIASES:
        setStateVarAliases((ScheduleStateVarAliases)newValue);
        return;
      case GumboPackage.COMPOSITION__SCHEMA:
        setSchema((Schema)newValue);
        return;
      case GumboPackage.COMPOSITION__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends CompositionProperty>)newValue);
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
      case GumboPackage.COMPOSITION__ID:
        setId(ID_EDEFAULT);
        return;
      case GumboPackage.COMPOSITION__COMPONENT_ALIASES:
        setComponentAliases((ScheduleComponentAliases)null);
        return;
      case GumboPackage.COMPOSITION__PORT_ALIASES:
        setPortAliases((SchedulePortAliases)null);
        return;
      case GumboPackage.COMPOSITION__STATE_VAR_ALIASES:
        setStateVarAliases((ScheduleStateVarAliases)null);
        return;
      case GumboPackage.COMPOSITION__SCHEMA:
        setSchema((Schema)null);
        return;
      case GumboPackage.COMPOSITION__PROPERTIES:
        getProperties().clear();
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
      case GumboPackage.COMPOSITION__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case GumboPackage.COMPOSITION__COMPONENT_ALIASES:
        return componentAliases != null;
      case GumboPackage.COMPOSITION__PORT_ALIASES:
        return portAliases != null;
      case GumboPackage.COMPOSITION__STATE_VAR_ALIASES:
        return stateVarAliases != null;
      case GumboPackage.COMPOSITION__SCHEMA:
        return schema != null;
      case GumboPackage.COMPOSITION__PROPERTIES:
        return properties != null && !properties.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //CompositionImpl
