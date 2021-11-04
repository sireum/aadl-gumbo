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
package org.sireum.aadl.gumbo.scoping;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import java.lang.reflect.Method;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.SimpleScope;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.osate.aadl2.AadlPackage;
import org.osate.aadl2.Classifier;
import org.osate.aadl2.ComponentImplementation;
import org.osate.aadl2.DataSubcomponentType;
import org.osate.aadl2.Feature;
import org.osate.aadl2.NamedElement;
import org.osate.aadl2.PackageSection;
import org.osate.xtext.aadl2.properties.scoping.PropertiesScopeProvider;
import org.sireum.aadl.gumbo.gumbo.AssumeStatement;
import org.sireum.aadl.gumbo.gumbo.FeatureElement;
import org.sireum.aadl.gumbo.gumbo.PortRef;
import org.sireum.aadl.gumbo.gumbo.SpecSection;
import org.sireum.aadl.gumbo.gumbo.StateVarDecl;
import org.sireum.aadl.gumbo.gumbo.StateVarRef;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class GumboScopeProvider extends AbstractGumboScopeProvider {
  @Override
  protected Predicate<Method> getPredicate(final EObject context, final EReference reference) {
    final Predicate<Method> method = super.getPredicate(context, reference);
    String _string = method.toString();
    int _length = method.toString().length();
    int _minus = (_length - 1);
    final String sname = _string.substring(1, _minus);
    final Function1<Method, String> _function = (Method it) -> {
      return it.getName();
    };
    boolean _contains = ListExtensions.<Method, String>map(((List<Method>)Conversions.doWrapArray(this.getClass().getMethods())), _function).contains(sname);
    boolean _not = (!_contains);
    if (_not) {
      String _name = this.getClass().getName();
      String _plus = ("Missing: " + _name);
      String _plus_1 = (_plus + ".");
      String _plus_2 = (_plus_1 + sname);
      String _plus_3 = (_plus_2 + " : ");
      String _simpleName = context.getClass().getSimpleName();
      String _plus_4 = (_plus_3 + _simpleName);
      InputOutput.<String>println(_plus_4);
    }
    return method;
  }
  
  public SimpleScope genericContext(final EObject context, final EReference reference) {
    SimpleScope _xblockexpression = null;
    {
      final Classifier classifier = EcoreUtil2.<Classifier>getContainerOfType(context, Classifier.class);
      EList<Feature> _allFeatures = classifier.getAllFeatures();
      List<? extends NamedElement> _xifexpression = null;
      if ((classifier instanceof ComponentImplementation)) {
        _xifexpression = ((ComponentImplementation)classifier).getAllInternalFeatures();
      } else {
        _xifexpression = CollectionLiterals.<Feature>emptyList();
      }
      final SimpleScope scope = PropertiesScopeProvider.scopeFor(Iterables.<NamedElement>concat(_allFeatures, _xifexpression));
      InputOutput.<SimpleScope>println(scope);
      _xblockexpression = scope;
    }
    return _xblockexpression;
  }
  
  public SimpleScope scope_FeatureElement_feature(final FeatureElement context, final EReference reference) {
    return this.genericContext(context, reference);
  }
  
  public SimpleScope scope_AssumeStatement_forPort(final AssumeStatement context, final EReference reference) {
    return this.genericContext(context, reference);
  }
  
  public SimpleScope scope_StateVarDecl_typeName(final StateVarDecl context, final EReference reference) {
    SimpleScope _xblockexpression = null;
    {
      final AadlPackage pkg = EcoreUtil2.<AadlPackage>getContainerOfType(context, AadlPackage.class);
      Iterable<DataSubcomponentType> _filter = Iterables.<DataSubcomponentType>filter(EcoreUtil2.<PackageSection>getContainerOfType(context, PackageSection.class).getOwnedMembers(), DataSubcomponentType.class);
      final Function1<AadlPackage, Iterable<DataSubcomponentType>> _function = (AadlPackage x) -> {
        return Iterables.<DataSubcomponentType>filter(x.getOwnedPublicSection().getOwnedMembers(), DataSubcomponentType.class);
      };
      Iterable<DataSubcomponentType> _flatten = Iterables.<DataSubcomponentType>concat(IterableExtensions.<AadlPackage, Iterable<DataSubcomponentType>>map(Iterables.<AadlPackage>filter(EcoreUtil2.<PackageSection>getContainerOfType(context, PackageSection.class).getImportedUnits(), AadlPackage.class), _function));
      final Iterable<DataSubcomponentType> elem = Iterables.<DataSubcomponentType>concat(_filter, _flatten);
      final Function1<DataSubcomponentType, QualifiedName> _function_1 = (DataSubcomponentType it) -> {
        String _xifexpression = null;
        AadlPackage _containerOfType = EcoreUtil2.<AadlPackage>getContainerOfType(it, AadlPackage.class);
        boolean _tripleNotEquals = (_containerOfType != pkg);
        if (_tripleNotEquals) {
          String _name = EcoreUtil2.<AadlPackage>getContainerOfType(it, AadlPackage.class).getName();
          _xifexpression = (_name + "::");
        } else {
          _xifexpression = "";
        }
        String _name_1 = it.getName();
        String _plus = (_xifexpression + _name_1);
        return QualifiedName.create(_plus);
      };
      final SimpleScope scope = PropertiesScopeProvider.<DataSubcomponentType>scopeFor(elem, _function_1, 
        IScope.NULLSCOPE);
      _xblockexpression = scope;
    }
    return _xblockexpression;
  }
  
  public SimpleScope scope_StateVarRef_stateVar(final StateVarRef context, final EReference reference) {
    return PropertiesScopeProvider.scopeFor(EcoreUtil2.<SpecSection>getContainerOfType(context, SpecSection.class).getState().getDecls());
  }
  
  public SimpleScope scope_PortRef_portName(final PortRef context, final EReference reference) {
    return this.genericContext(context, reference);
  }
}
