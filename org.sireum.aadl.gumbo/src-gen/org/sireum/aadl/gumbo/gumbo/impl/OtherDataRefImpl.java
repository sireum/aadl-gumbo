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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.aadl2.ArrayRange;
import org.osate.aadl2.NamedElement;

import org.sireum.aadl.gumbo.gumbo.GumboPackage;
import org.sireum.aadl.gumbo.gumbo.OtherDataRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Other Data Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.OtherDataRefImpl#getNamedElement <em>Named Element</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.OtherDataRefImpl#getArrayRange <em>Array Range</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.OtherDataRefImpl#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OtherDataRefImpl extends MinimalEObjectImpl.Container implements OtherDataRef
{
  /**
   * The cached value of the '{@link #getNamedElement() <em>Named Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamedElement()
   * @generated
   * @ordered
   */
  protected NamedElement namedElement;

  /**
   * The cached value of the '{@link #getArrayRange() <em>Array Range</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrayRange()
   * @generated
   * @ordered
   */
  protected EList<ArrayRange> arrayRange;

  /**
   * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected OtherDataRef path;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OtherDataRefImpl()
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
    return GumboPackage.Literals.OTHER_DATA_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NamedElement getNamedElement()
  {
    if (namedElement != null && ((EObject)namedElement).eIsProxy())
    {
      InternalEObject oldNamedElement = (InternalEObject)namedElement;
      namedElement = (NamedElement)eResolveProxy(oldNamedElement);
      if (namedElement != oldNamedElement)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GumboPackage.OTHER_DATA_REF__NAMED_ELEMENT, oldNamedElement, namedElement));
      }
    }
    return namedElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedElement basicGetNamedElement()
  {
    return namedElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNamedElement(NamedElement newNamedElement)
  {
    NamedElement oldNamedElement = namedElement;
    namedElement = newNamedElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.OTHER_DATA_REF__NAMED_ELEMENT, oldNamedElement, namedElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ArrayRange> getArrayRange()
  {
    if (arrayRange == null)
    {
      arrayRange = new EObjectContainmentEList<ArrayRange>(ArrayRange.class, this, GumboPackage.OTHER_DATA_REF__ARRAY_RANGE);
    }
    return arrayRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OtherDataRef getPath()
  {
    return path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPath(OtherDataRef newPath, NotificationChain msgs)
  {
    OtherDataRef oldPath = path;
    path = newPath;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.OTHER_DATA_REF__PATH, oldPath, newPath);
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
  public void setPath(OtherDataRef newPath)
  {
    if (newPath != path)
    {
      NotificationChain msgs = null;
      if (path != null)
        msgs = ((InternalEObject)path).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.OTHER_DATA_REF__PATH, null, msgs);
      if (newPath != null)
        msgs = ((InternalEObject)newPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.OTHER_DATA_REF__PATH, null, msgs);
      msgs = basicSetPath(newPath, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.OTHER_DATA_REF__PATH, newPath, newPath));
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
      case GumboPackage.OTHER_DATA_REF__ARRAY_RANGE:
        return ((InternalEList<?>)getArrayRange()).basicRemove(otherEnd, msgs);
      case GumboPackage.OTHER_DATA_REF__PATH:
        return basicSetPath(null, msgs);
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
      case GumboPackage.OTHER_DATA_REF__NAMED_ELEMENT:
        if (resolve) return getNamedElement();
        return basicGetNamedElement();
      case GumboPackage.OTHER_DATA_REF__ARRAY_RANGE:
        return getArrayRange();
      case GumboPackage.OTHER_DATA_REF__PATH:
        return getPath();
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
      case GumboPackage.OTHER_DATA_REF__NAMED_ELEMENT:
        setNamedElement((NamedElement)newValue);
        return;
      case GumboPackage.OTHER_DATA_REF__ARRAY_RANGE:
        getArrayRange().clear();
        getArrayRange().addAll((Collection<? extends ArrayRange>)newValue);
        return;
      case GumboPackage.OTHER_DATA_REF__PATH:
        setPath((OtherDataRef)newValue);
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
      case GumboPackage.OTHER_DATA_REF__NAMED_ELEMENT:
        setNamedElement((NamedElement)null);
        return;
      case GumboPackage.OTHER_DATA_REF__ARRAY_RANGE:
        getArrayRange().clear();
        return;
      case GumboPackage.OTHER_DATA_REF__PATH:
        setPath((OtherDataRef)null);
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
      case GumboPackage.OTHER_DATA_REF__NAMED_ELEMENT:
        return namedElement != null;
      case GumboPackage.OTHER_DATA_REF__ARRAY_RANGE:
        return arrayRange != null && !arrayRange.isEmpty();
      case GumboPackage.OTHER_DATA_REF__PATH:
        return path != null;
    }
    return super.eIsSet(featureID);
  }

} //OtherDataRefImpl
