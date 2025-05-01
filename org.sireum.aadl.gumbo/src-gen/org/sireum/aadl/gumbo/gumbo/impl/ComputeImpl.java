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

import org.sireum.aadl.gumbo.gumbo.CaseStatementClause;
import org.sireum.aadl.gumbo.gumbo.Compute;
import org.sireum.aadl.gumbo.gumbo.GumboPackage;
import org.sireum.aadl.gumbo.gumbo.GumboTable;
import org.sireum.aadl.gumbo.gumbo.HandlerClause;
import org.sireum.aadl.gumbo.gumbo.InfoFlowClause;
import org.sireum.aadl.gumbo.gumbo.SlangModifies;
import org.sireum.aadl.gumbo.gumbo.SpecStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.ComputeImpl#getModifies <em>Modifies</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.ComputeImpl#getSpecs <em>Specs</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.ComputeImpl#getCases <em>Cases</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.ComputeImpl#getHandlers <em>Handlers</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.ComputeImpl#getFlows <em>Flows</em>}</li>
 *   <li>{@link org.sireum.aadl.gumbo.gumbo.impl.ComputeImpl#getTables <em>Tables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComputeImpl extends MinimalEObjectImpl.Container implements Compute
{
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
   * The cached value of the '{@link #getSpecs() <em>Specs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecs()
   * @generated
   * @ordered
   */
  protected EList<SpecStatement> specs;

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
   * The cached value of the '{@link #getHandlers() <em>Handlers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHandlers()
   * @generated
   * @ordered
   */
  protected EList<HandlerClause> handlers;

  /**
   * The cached value of the '{@link #getFlows() <em>Flows</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFlows()
   * @generated
   * @ordered
   */
  protected EList<InfoFlowClause> flows;

  /**
   * The cached value of the '{@link #getTables() <em>Tables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTables()
   * @generated
   * @ordered
   */
  protected EList<GumboTable> tables;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComputeImpl()
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
    return GumboPackage.Literals.COMPUTE;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GumboPackage.COMPUTE__MODIFIES, oldModifies, newModifies);
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
        msgs = ((InternalEObject)modifies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GumboPackage.COMPUTE__MODIFIES, null, msgs);
      if (newModifies != null)
        msgs = ((InternalEObject)newModifies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GumboPackage.COMPUTE__MODIFIES, null, msgs);
      msgs = basicSetModifies(newModifies, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GumboPackage.COMPUTE__MODIFIES, newModifies, newModifies));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<SpecStatement> getSpecs()
  {
    if (specs == null)
    {
      specs = new EObjectContainmentEList<SpecStatement>(SpecStatement.class, this, GumboPackage.COMPUTE__SPECS);
    }
    return specs;
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
      cases = new EObjectContainmentEList<CaseStatementClause>(CaseStatementClause.class, this, GumboPackage.COMPUTE__CASES);
    }
    return cases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<HandlerClause> getHandlers()
  {
    if (handlers == null)
    {
      handlers = new EObjectContainmentEList<HandlerClause>(HandlerClause.class, this, GumboPackage.COMPUTE__HANDLERS);
    }
    return handlers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<InfoFlowClause> getFlows()
  {
    if (flows == null)
    {
      flows = new EObjectContainmentEList<InfoFlowClause>(InfoFlowClause.class, this, GumboPackage.COMPUTE__FLOWS);
    }
    return flows;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<GumboTable> getTables()
  {
    if (tables == null)
    {
      tables = new EObjectContainmentEList<GumboTable>(GumboTable.class, this, GumboPackage.COMPUTE__TABLES);
    }
    return tables;
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
      case GumboPackage.COMPUTE__MODIFIES:
        return basicSetModifies(null, msgs);
      case GumboPackage.COMPUTE__SPECS:
        return ((InternalEList<?>)getSpecs()).basicRemove(otherEnd, msgs);
      case GumboPackage.COMPUTE__CASES:
        return ((InternalEList<?>)getCases()).basicRemove(otherEnd, msgs);
      case GumboPackage.COMPUTE__HANDLERS:
        return ((InternalEList<?>)getHandlers()).basicRemove(otherEnd, msgs);
      case GumboPackage.COMPUTE__FLOWS:
        return ((InternalEList<?>)getFlows()).basicRemove(otherEnd, msgs);
      case GumboPackage.COMPUTE__TABLES:
        return ((InternalEList<?>)getTables()).basicRemove(otherEnd, msgs);
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
      case GumboPackage.COMPUTE__MODIFIES:
        return getModifies();
      case GumboPackage.COMPUTE__SPECS:
        return getSpecs();
      case GumboPackage.COMPUTE__CASES:
        return getCases();
      case GumboPackage.COMPUTE__HANDLERS:
        return getHandlers();
      case GumboPackage.COMPUTE__FLOWS:
        return getFlows();
      case GumboPackage.COMPUTE__TABLES:
        return getTables();
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
      case GumboPackage.COMPUTE__MODIFIES:
        setModifies((SlangModifies)newValue);
        return;
      case GumboPackage.COMPUTE__SPECS:
        getSpecs().clear();
        getSpecs().addAll((Collection<? extends SpecStatement>)newValue);
        return;
      case GumboPackage.COMPUTE__CASES:
        getCases().clear();
        getCases().addAll((Collection<? extends CaseStatementClause>)newValue);
        return;
      case GumboPackage.COMPUTE__HANDLERS:
        getHandlers().clear();
        getHandlers().addAll((Collection<? extends HandlerClause>)newValue);
        return;
      case GumboPackage.COMPUTE__FLOWS:
        getFlows().clear();
        getFlows().addAll((Collection<? extends InfoFlowClause>)newValue);
        return;
      case GumboPackage.COMPUTE__TABLES:
        getTables().clear();
        getTables().addAll((Collection<? extends GumboTable>)newValue);
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
      case GumboPackage.COMPUTE__MODIFIES:
        setModifies((SlangModifies)null);
        return;
      case GumboPackage.COMPUTE__SPECS:
        getSpecs().clear();
        return;
      case GumboPackage.COMPUTE__CASES:
        getCases().clear();
        return;
      case GumboPackage.COMPUTE__HANDLERS:
        getHandlers().clear();
        return;
      case GumboPackage.COMPUTE__FLOWS:
        getFlows().clear();
        return;
      case GumboPackage.COMPUTE__TABLES:
        getTables().clear();
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
      case GumboPackage.COMPUTE__MODIFIES:
        return modifies != null;
      case GumboPackage.COMPUTE__SPECS:
        return specs != null && !specs.isEmpty();
      case GumboPackage.COMPUTE__CASES:
        return cases != null && !cases.isEmpty();
      case GumboPackage.COMPUTE__HANDLERS:
        return handlers != null && !handlers.isEmpty();
      case GumboPackage.COMPUTE__FLOWS:
        return flows != null && !flows.isEmpty();
      case GumboPackage.COMPUTE__TABLES:
        return tables != null && !tables.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ComputeImpl
