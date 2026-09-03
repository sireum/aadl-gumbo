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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sireum.aadl.gumbo.gumbo.CompositionProperty;
import org.sireum.aadl.gumbo.gumbo.GumboPackage;
import org.sireum.aadl.gumbo.gumbo.PropertyBinding;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composition Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.CompositionPropertyImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.CompositionPropertyImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.CompositionPropertyImpl#getParents <em>Parents</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.CompositionPropertyImpl#getDescriptor <em>Descriptor</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.CompositionPropertyImpl#getBindings <em>Bindings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositionPropertyImpl extends MinimalEObjectImpl.Container implements CompositionProperty
{
  /**
   * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsAbstract()
   * @generated
   * @ordered
   */
  protected static final boolean IS_ABSTRACT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsAbstract()
   * @generated
   * @ordered
   */
  protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

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
   * The cached value of the '{@link #getParents() <em>Parents</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParents()
   * @generated
   * @ordered
   */
  protected EList<CompositionProperty> parents;

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
   * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBindings()
   * @generated
   * @ordered
   */
  protected EList<PropertyBinding> bindings;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CompositionPropertyImpl()
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
    return GumboPackage.Literals.COMPOSITION_PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isIsAbstract()
  {
    return isAbstract;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIsAbstract(boolean newIsAbstract)
  {
    boolean oldIsAbstract = isAbstract;
    isAbstract = newIsAbstract;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.COMPOSITION_PROPERTY__IS_ABSTRACT, oldIsAbstract, isAbstract));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.COMPOSITION_PROPERTY__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<CompositionProperty> getParents()
  {
    if (parents == null)
    {
      parents = new EObjectResolvingEList<CompositionProperty>(CompositionProperty.class, this, GumboPackage.COMPOSITION_PROPERTY__PARENTS);
    }
    return parents;
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
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.COMPOSITION_PROPERTY__DESCRIPTOR, oldDescriptor, descriptor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<PropertyBinding> getBindings()
  {
    if (bindings == null)
    {
      bindings = new EObjectContainmentEList<PropertyBinding>(PropertyBinding.class, this, GumboPackage.COMPOSITION_PROPERTY__BINDINGS);
    }
    return bindings;
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
      case GumboPackage.COMPOSITION_PROPERTY__BINDINGS:
        return ((InternalEList<?>)getBindings()).basicRemove(otherEnd, msgs);
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
      case GumboPackage.COMPOSITION_PROPERTY__IS_ABSTRACT:
        return isIsAbstract();
      case GumboPackage.COMPOSITION_PROPERTY__ID:
        return getId();
      case GumboPackage.COMPOSITION_PROPERTY__PARENTS:
        return getParents();
      case GumboPackage.COMPOSITION_PROPERTY__DESCRIPTOR:
        return getDescriptor();
      case GumboPackage.COMPOSITION_PROPERTY__BINDINGS:
        return getBindings();
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
      case GumboPackage.COMPOSITION_PROPERTY__IS_ABSTRACT:
        setIsAbstract((Boolean)newValue);
        return;
      case GumboPackage.COMPOSITION_PROPERTY__ID:
        setId((String)newValue);
        return;
      case GumboPackage.COMPOSITION_PROPERTY__PARENTS:
        getParents().clear();
        getParents().addAll((Collection<? extends CompositionProperty>)newValue);
        return;
      case GumboPackage.COMPOSITION_PROPERTY__DESCRIPTOR:
        setDescriptor((String)newValue);
        return;
      case GumboPackage.COMPOSITION_PROPERTY__BINDINGS:
        getBindings().clear();
        getBindings().addAll((Collection<? extends PropertyBinding>)newValue);
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
      case GumboPackage.COMPOSITION_PROPERTY__IS_ABSTRACT:
        setIsAbstract(IS_ABSTRACT_EDEFAULT);
        return;
      case GumboPackage.COMPOSITION_PROPERTY__ID:
        setId(ID_EDEFAULT);
        return;
      case GumboPackage.COMPOSITION_PROPERTY__PARENTS:
        getParents().clear();
        return;
      case GumboPackage.COMPOSITION_PROPERTY__DESCRIPTOR:
        setDescriptor(DESCRIPTOR_EDEFAULT);
        return;
      case GumboPackage.COMPOSITION_PROPERTY__BINDINGS:
        getBindings().clear();
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
      case GumboPackage.COMPOSITION_PROPERTY__IS_ABSTRACT:
        return isAbstract != IS_ABSTRACT_EDEFAULT;
      case GumboPackage.COMPOSITION_PROPERTY__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case GumboPackage.COMPOSITION_PROPERTY__PARENTS:
        return parents != null && !parents.isEmpty();
      case GumboPackage.COMPOSITION_PROPERTY__DESCRIPTOR:
        return DESCRIPTOR_EDEFAULT == null ? descriptor != null : !DESCRIPTOR_EDEFAULT.equals(descriptor);
      case GumboPackage.COMPOSITION_PROPERTY__BINDINGS:
        return bindings != null && !bindings.isEmpty();
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
    result.append(" (isAbstract: ");
    result.append(isAbstract);
    result.append(", id: ");
    result.append(id);
    result.append(", descriptor: ");
    result.append(descriptor);
    result.append(')');
    return result.toString();
  }

} //CompositionPropertyImpl
