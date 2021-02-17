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
import org.eclipse.xtext.scoping.impl.SimpleScope;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.osate.aadl2.Classifier;
import org.osate.aadl2.ComponentImplementation;
import org.osate.aadl2.Feature;
import org.osate.aadl2.NamedElement;
import org.osate.xtext.aadl2.properties.scoping.PropertiesScopeProvider;
import org.sireum.aadl.gumbo.gumbo.AssumeStatement;
import org.sireum.aadl.gumbo.gumbo.FeatureElement;
import org.sireum.aadl.gumbo.gumbo.HyperperiodComputationalModel;
import org.sireum.aadl.gumbo.gumbo.IdExpr;
import org.sireum.aadl.gumbo.scoping.AbstractGumboScopeProvider;

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
      InputOutput.<String>println(_plus_2);
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
  
  public SimpleScope scope_IdExpr_id(final IdExpr context, final EReference reference) {
    return this.genericContext(context, reference);
  }
  
  public SimpleScope scope_HyperperiodComputationalModel_constraints(final HyperperiodComputationalModel context, final EReference reference) {
    return this.genericContext(context, reference);
  }
}
