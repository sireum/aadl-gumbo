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
package org.sireum.aadl.gumbo.gumbo.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.sireum.aadl.gumbo.gumbo.GumboFactory;
import org.sireum.aadl.gumbo.gumbo.GumboPackage;
import org.sireum.aadl.gumbo.gumbo.ImplicationStatement;

/**
 * This is the item provider adapter for a {@link org.sireum.aadl.gumbo.gumbo.ImplicationStatement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ImplicationStatementItemProvider 
  extends ItemProviderAdapter
  implements
    IEditingDomainItemProvider,
    IStructuredItemContentProvider,
    ITreeItemContentProvider,
    IItemLabelProvider,
    IItemPropertySource
{
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImplicationStatementItemProvider(AdapterFactory adapterFactory)
  {
    super(adapterFactory);
  }

  /**
   * This returns the property descriptors for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
  {
    if (itemPropertyDescriptors == null)
    {
      super.getPropertyDescriptors(object);

      addIdPropertyDescriptor(object);
      addDescriptorPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Id feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addIdPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_ImplicationStatement_id_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_ImplicationStatement_id_feature", "_UI_ImplicationStatement_type"),
         GumboPackage.Literals.IMPLICATION_STATEMENT__ID,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Descriptor feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addDescriptorPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_ImplicationStatement_descriptor_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_ImplicationStatement_descriptor_feature", "_UI_ImplicationStatement_type"),
         GumboPackage.Literals.IMPLICATION_STATEMENT__DESCRIPTOR,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
   * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
   * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
  {
    if (childrenFeatures == null)
    {
      super.getChildrenFeatures(object);
      childrenFeatures.add(GumboPackage.Literals.IMPLICATION_STATEMENT__ANTECEDENT);
      childrenFeatures.add(GumboPackage.Literals.IMPLICATION_STATEMENT__CONSEQUENT);
    }
    return childrenFeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EStructuralFeature getChildFeature(Object object, Object child)
  {
    // Check the type of the specified child object and return the proper feature to use for
    // adding (see {@link AddCommand}) it as a child.

    return super.getChildFeature(object, child);
  }

  /**
   * This returns ImplicationStatement.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object)
  {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/ImplicationStatement"));
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getText(Object object)
  {
    String label = ((ImplicationStatement)object).getId();
    return label == null || label.length() == 0 ?
      getString("_UI_ImplicationStatement_type") :
      getString("_UI_ImplicationStatement_type") + " " + label;
  }


  /**
   * This handles model notifications by calling {@link #updateChildren} to update any cached
   * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void notifyChanged(Notification notification)
  {
    updateChildren(notification);

    switch (notification.getFeatureID(ImplicationStatement.class))
    {
      case GumboPackage.IMPLICATION_STATEMENT__ID:
      case GumboPackage.IMPLICATION_STATEMENT__DESCRIPTOR:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        return;
      case GumboPackage.IMPLICATION_STATEMENT__ANTECEDENT:
      case GumboPackage.IMPLICATION_STATEMENT__CONSEQUENT:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
        return;
    }
    super.notifyChanged(notification);
  }

  /**
   * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
   * that can be created under this object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
  {
    super.collectNewChildDescriptors(newChildDescriptors, object);

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.IMPLICATION_STATEMENT__ANTECEDENT,
         GumboFactory.eINSTANCE.createExpr()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.IMPLICATION_STATEMENT__ANTECEDENT,
         GumboFactory.eINSTANCE.createBasicExp()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.IMPLICATION_STATEMENT__ANTECEDENT,
         GumboFactory.eINSTANCE.createQuantifiedExp()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.IMPLICATION_STATEMENT__ANTECEDENT,
         GumboFactory.eINSTANCE.createUnaryExp()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.IMPLICATION_STATEMENT__ANTECEDENT,
         GumboFactory.eINSTANCE.createSlangAccess()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.IMPLICATION_STATEMENT__ANTECEDENT,
         GumboFactory.eINSTANCE.createSlangLitTerm()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.IMPLICATION_STATEMENT__ANTECEDENT,
         GumboFactory.eINSTANCE.createSlangInterpTerm()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.IMPLICATION_STATEMENT__ANTECEDENT,
         GumboFactory.eINSTANCE.createInStateExpr()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.IMPLICATION_STATEMENT__ANTECEDENT,
         GumboFactory.eINSTANCE.createMaySendExpr()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.IMPLICATION_STATEMENT__ANTECEDENT,
         GumboFactory.eINSTANCE.createMustSendExpr()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.IMPLICATION_STATEMENT__ANTECEDENT,
         GumboFactory.eINSTANCE.createEnumLitExpr()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.IMPLICATION_STATEMENT__ANTECEDENT,
         GumboFactory.eINSTANCE.createRecordLitExpr()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.IMPLICATION_STATEMENT__ANTECEDENT,
         GumboFactory.eINSTANCE.createDataRefExpr()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.IMPLICATION_STATEMENT__ANTECEDENT,
         GumboFactory.eINSTANCE.createSlangTupleTerm()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.IMPLICATION_STATEMENT__ANTECEDENT,
         GumboFactory.eINSTANCE.createSlangForTerm()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.IMPLICATION_STATEMENT__ANTECEDENT,
         GumboFactory.eINSTANCE.createSlangBlockTerm()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.IMPLICATION_STATEMENT__CONSEQUENT,
         GumboFactory.eINSTANCE.createExpr()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.IMPLICATION_STATEMENT__CONSEQUENT,
         GumboFactory.eINSTANCE.createBasicExp()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.IMPLICATION_STATEMENT__CONSEQUENT,
         GumboFactory.eINSTANCE.createQuantifiedExp()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.IMPLICATION_STATEMENT__CONSEQUENT,
         GumboFactory.eINSTANCE.createUnaryExp()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.IMPLICATION_STATEMENT__CONSEQUENT,
         GumboFactory.eINSTANCE.createSlangAccess()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.IMPLICATION_STATEMENT__CONSEQUENT,
         GumboFactory.eINSTANCE.createSlangLitTerm()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.IMPLICATION_STATEMENT__CONSEQUENT,
         GumboFactory.eINSTANCE.createSlangInterpTerm()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.IMPLICATION_STATEMENT__CONSEQUENT,
         GumboFactory.eINSTANCE.createInStateExpr()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.IMPLICATION_STATEMENT__CONSEQUENT,
         GumboFactory.eINSTANCE.createMaySendExpr()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.IMPLICATION_STATEMENT__CONSEQUENT,
         GumboFactory.eINSTANCE.createMustSendExpr()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.IMPLICATION_STATEMENT__CONSEQUENT,
         GumboFactory.eINSTANCE.createEnumLitExpr()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.IMPLICATION_STATEMENT__CONSEQUENT,
         GumboFactory.eINSTANCE.createRecordLitExpr()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.IMPLICATION_STATEMENT__CONSEQUENT,
         GumboFactory.eINSTANCE.createDataRefExpr()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.IMPLICATION_STATEMENT__CONSEQUENT,
         GumboFactory.eINSTANCE.createSlangTupleTerm()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.IMPLICATION_STATEMENT__CONSEQUENT,
         GumboFactory.eINSTANCE.createSlangForTerm()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.IMPLICATION_STATEMENT__CONSEQUENT,
         GumboFactory.eINSTANCE.createSlangBlockTerm()));
  }

  /**
   * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection)
  {
    Object childFeature = feature;
    Object childObject = child;

    boolean qualify =
      childFeature == GumboPackage.Literals.IMPLICATION_STATEMENT__ANTECEDENT ||
      childFeature == GumboPackage.Literals.IMPLICATION_STATEMENT__CONSEQUENT;

    if (qualify)
    {
      return getString
        ("_UI_CreateChild_text2",
         new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
    }
    return super.getCreateChildText(owner, feature, child, selection);
  }

  /**
   * Return the resource locator for this item provider's resources.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ResourceLocator getResourceLocator()
  {
    return GumboEditPlugin.INSTANCE;
  }

}