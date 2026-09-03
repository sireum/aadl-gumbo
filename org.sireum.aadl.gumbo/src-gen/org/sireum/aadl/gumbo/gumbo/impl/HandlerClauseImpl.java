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

import org.osate.aadl2.Port;

import org.sireum.aadl.gumbo.gumbo.AssumeStatement;
import org.sireum.aadl.gumbo.gumbo.CaseStatementClause;
import org.sireum.aadl.gumbo.gumbo.GuaranteeStatement;
import org.sireum.aadl.gumbo.gumbo.GumboPackage;
import org.sireum.aadl.gumbo.gumbo.HandlerClause;
import org.sireum.aadl.gumbo.gumbo.SlangModifies;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Handler Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.HandlerClauseImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.HandlerClauseImpl#getModifies <em>Modifies</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.HandlerClauseImpl#getAssumes <em>Assumes</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.HandlerClauseImpl#getGuarantees <em>Guarantees</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.HandlerClauseImpl#getCases <em>Cases</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HandlerClauseImpl extends MinimalEObjectImpl.Container implements HandlerClause
{
  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected Port id;

  /**
   * The cached value of the '{@link #getModifies() <em>Modifies</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModifies()
   * @generated
   * @ordered
   */
  protected SlangModifies modifies;

  /**
   * The cached value of the '{@link #getAssumes() <em>Assumes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssumes()
   * @generated
   * @ordered
   */
  protected EList<AssumeStatement> assumes;

  /**
   * The cached value of the '{@link #getGuarantees() <em>Guarantees</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuarantees()
   * @generated
   * @ordered
   */
  protected EList<GuaranteeStatement> guarantees;

  /**
   * The cached value of the '{@link #getCases() <em>Cases</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCases()
   * @generated
   * @ordered
   */
  protected EList<CaseStatementClause> cases;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HandlerClauseImpl()
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
    return GumboPackage.Literals.HANDLER_CLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Port getId()
  {
    if (id != null && ((EObject)id).eIsProxy())
    {
      InternalEObject oldId = (InternalEObject)id;
      id = (Port)eResolveProxy(oldId);
      if (id != oldId)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GumboPackage.HANDLER_CLAUSE__ID, oldId, id));
      }
    }
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Port basicGetId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setId(Port newId)
  {
    Port oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.HANDLER_CLAUSE__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SlangModifies getModifies()
  {
    return modifies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModifies(SlangModifies newModifies, NotificationChain msgs)
  {
    SlangModifies oldModifies = modifies;
    modifies = newModifies;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.HANDLER_CLAUSE__MODIFIES, oldModifies, newModifies);
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
  public void setModifies(SlangModifies newModifies)
  {
    if (newModifies != modifies)
    {
      NotificationChain msgs = null;
      if (modifies != null)
        msgs = ((InternalEObject)modifies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.HANDLER_CLAUSE__MODIFIES, null, msgs);
      if (newModifies != null)
        msgs = ((InternalEObject)newModifies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.HANDLER_CLAUSE__MODIFIES, null, msgs);
      msgs = basicSetModifies(newModifies, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.HANDLER_CLAUSE__MODIFIES, newModifies, newModifies));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<AssumeStatement> getAssumes()
  {
    if (assumes == null)
    {
      assumes = new EObjectContainmentEList<AssumeStatement>(AssumeStatement.class, this, GumboPackage.HANDLER_CLAUSE__ASSUMES);
    }
    return assumes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<GuaranteeStatement> getGuarantees()
  {
    if (guarantees == null)
    {
      guarantees = new EObjectContainmentEList<GuaranteeStatement>(GuaranteeStatement.class, this, GumboPackage.HANDLER_CLAUSE__GUARANTEES);
    }
    return guarantees;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<CaseStatementClause> getCases()
  {
    if (cases == null)
    {
      cases = new EObjectContainmentEList<CaseStatementClause>(CaseStatementClause.class, this, GumboPackage.HANDLER_CLAUSE__CASES);
    }
    return cases;
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
      case GumboPackage.HANDLER_CLAUSE__MODIFIES:
        return basicSetModifies(null, msgs);
      case GumboPackage.HANDLER_CLAUSE__ASSUMES:
        return ((InternalEList<?>)getAssumes()).basicRemove(otherEnd, msgs);
      case GumboPackage.HANDLER_CLAUSE__GUARANTEES:
        return ((InternalEList<?>)getGuarantees()).basicRemove(otherEnd, msgs);
      case GumboPackage.HANDLER_CLAUSE__CASES:
        return ((InternalEList<?>)getCases()).basicRemove(otherEnd, msgs);
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
      case GumboPackage.HANDLER_CLAUSE__ID:
        if (resolve) return getId();
        return basicGetId();
      case GumboPackage.HANDLER_CLAUSE__MODIFIES:
        return getModifies();
      case GumboPackage.HANDLER_CLAUSE__ASSUMES:
        return getAssumes();
      case GumboPackage.HANDLER_CLAUSE__GUARANTEES:
        return getGuarantees();
      case GumboPackage.HANDLER_CLAUSE__CASES:
        return getCases();
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
      case GumboPackage.HANDLER_CLAUSE__ID:
        setId((Port)newValue);
        return;
      case GumboPackage.HANDLER_CLAUSE__MODIFIES:
        setModifies((SlangModifies)newValue);
        return;
      case GumboPackage.HANDLER_CLAUSE__ASSUMES:
        getAssumes().clear();
        getAssumes().addAll((Collection<? extends AssumeStatement>)newValue);
        return;
      case GumboPackage.HANDLER_CLAUSE__GUARANTEES:
        getGuarantees().clear();
        getGuarantees().addAll((Collection<? extends GuaranteeStatement>)newValue);
        return;
      case GumboPackage.HANDLER_CLAUSE__CASES:
        getCases().clear();
        getCases().addAll((Collection<? extends CaseStatementClause>)newValue);
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
      case GumboPackage.HANDLER_CLAUSE__ID:
        setId((Port)null);
        return;
      case GumboPackage.HANDLER_CLAUSE__MODIFIES:
        setModifies((SlangModifies)null);
        return;
      case GumboPackage.HANDLER_CLAUSE__ASSUMES:
        getAssumes().clear();
        return;
      case GumboPackage.HANDLER_CLAUSE__GUARANTEES:
        getGuarantees().clear();
        return;
      case GumboPackage.HANDLER_CLAUSE__CASES:
        getCases().clear();
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
      case GumboPackage.HANDLER_CLAUSE__ID:
        return id != null;
      case GumboPackage.HANDLER_CLAUSE__MODIFIES:
        return modifies != null;
      case GumboPackage.HANDLER_CLAUSE__ASSUMES:
        return assumes != null && !assumes.isEmpty();
      case GumboPackage.HANDLER_CLAUSE__GUARANTEES:
        return guarantees != null && !guarantees.isEmpty();
      case GumboPackage.HANDLER_CLAUSE__CASES:
        return cases != null && !cases.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //HandlerClauseImpl
