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

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.sireum.aadl.gumbo.gumbo.GumboFactory;
import org.sireum.aadl.gumbo.gumbo.GumboPackage;
import org.sireum.aadl.gumbo.gumbo.SlangPattern;

/**
 * This is the item provider adapter for a {@link org.sireum.aadl.gumbo.gumbo.SlangPattern} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SlangPatternItemProvider extends SlangVarDefItemProvider
{
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SlangPatternItemProvider(AdapterFactory adapterFactory)
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

    }
    return itemPropertyDescriptors;
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
      childrenFeatures.add(GumboPackage.Literals.SLANG_PATTERN__PATTERNS);
      childrenFeatures.add(GumboPackage.Literals.SLANG_PATTERN__TYPE_NAME);
      childrenFeatures.add(GumboPackage.Literals.SLANG_PATTERN__INIT);
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
   * This returns SlangPattern.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object)
  {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/SlangPattern"));
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
    return getString("_UI_SlangPattern_type");
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

    switch (notification.getFeatureID(SlangPattern.class))
    {
      case GumboPackage.SLANG_PATTERN__PATTERNS:
      case GumboPackage.SLANG_PATTERN__TYPE_NAME:
      case GumboPackage.SLANG_PATTERN__INIT:
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
        (GumboPackage.Literals.SLANG_PATTERN__PATTERNS,
         GumboFactory.eINSTANCE.createSlangTPattern()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.SLANG_PATTERN__TYPE_NAME,
         GumboFactory.eINSTANCE.createSlangType()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.SLANG_PATTERN__INIT,
         GumboFactory.eINSTANCE.createOwnedExpression()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.SLANG_PATTERN__INIT,
         GumboFactory.eINSTANCE.createGExpr()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.SLANG_PATTERN__INIT,
         GumboFactory.eINSTANCE.createIfElseExp()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.SLANG_PATTERN__INIT,
         GumboFactory.eINSTANCE.createQuantifiedExp()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.SLANG_PATTERN__INIT,
         GumboFactory.eINSTANCE.createImpliesExpr()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.SLANG_PATTERN__INIT,
         GumboFactory.eINSTANCE.createOrExpr()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.SLANG_PATTERN__INIT,
         GumboFactory.eINSTANCE.createAndExpr()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.SLANG_PATTERN__INIT,
         GumboFactory.eINSTANCE.createEqualNotExpr()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.SLANG_PATTERN__INIT,
         GumboFactory.eINSTANCE.createLtGtExpr()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.SLANG_PATTERN__INIT,
         GumboFactory.eINSTANCE.createColonExpr()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.SLANG_PATTERN__INIT,
         GumboFactory.eINSTANCE.createPlusMinusExpr()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.SLANG_PATTERN__INIT,
         GumboFactory.eINSTANCE.createMultiplicativeExpr()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.SLANG_PATTERN__INIT,
         GumboFactory.eINSTANCE.createUnaryExpr()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.SLANG_PATTERN__INIT,
         GumboFactory.eINSTANCE.createPostFixExpr()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.SLANG_PATTERN__INIT,
         GumboFactory.eINSTANCE.createSlangLitTerm()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.SLANG_PATTERN__INIT,
         GumboFactory.eINSTANCE.createSlangInterpTerm()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.SLANG_PATTERN__INIT,
         GumboFactory.eINSTANCE.createInStateExpr()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.SLANG_PATTERN__INIT,
         GumboFactory.eINSTANCE.createMaySendExpr()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.SLANG_PATTERN__INIT,
         GumboFactory.eINSTANCE.createMustSendExpr()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.SLANG_PATTERN__INIT,
         GumboFactory.eINSTANCE.createNoSendExpr()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.SLANG_PATTERN__INIT,
         GumboFactory.eINSTANCE.createHasEventExpr()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.SLANG_PATTERN__INIT,
         GumboFactory.eINSTANCE.createEnumLitExpr()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.SLANG_PATTERN__INIT,
         GumboFactory.eINSTANCE.createParenExpr()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.SLANG_PATTERN__INIT,
         GumboFactory.eINSTANCE.createSlangForTerm()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.SLANG_PATTERN__INIT,
         GumboFactory.eINSTANCE.createSlangBlockTerm()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.SLANG_PATTERN__INIT,
         GumboFactory.eINSTANCE.createF32Obj()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.SLANG_PATTERN__INIT,
         GumboFactory.eINSTANCE.createF64Obj()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.SLANG_PATTERN__INIT,
         GumboFactory.eINSTANCE.createCallExpr()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.SLANG_PATTERN__INIT,
         GumboFactory.eINSTANCE.createRecordLitExpr()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.SLANG_PATTERN__INIT,
         GumboFactory.eINSTANCE.createDataRefExpr()));

    newChildDescriptors.add
      (createChildParameter
        (GumboPackage.Literals.SLANG_PATTERN__INIT,
         GumboFactory.eINSTANCE.createResultExpr()));
  }

}
