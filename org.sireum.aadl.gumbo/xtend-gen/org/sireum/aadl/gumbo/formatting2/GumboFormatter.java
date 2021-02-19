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
package org.sireum.aadl.gumbo.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.IHiddenRegionFormatter;
import org.eclipse.xtext.formatting2.regionaccess.IEObjectRegion;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.osate.aadl2.ArrayRange;
import org.osate.aadl2.BasicPropertyAssociation;
import org.osate.aadl2.ClassifierValue;
import org.osate.aadl2.ComputedValue;
import org.osate.aadl2.ContainmentPathElement;
import org.osate.aadl2.IntegerLiteral;
import org.osate.aadl2.ListValue;
import org.osate.aadl2.ModalPropertyValue;
import org.osate.aadl2.Operation;
import org.osate.aadl2.RangeValue;
import org.osate.aadl2.RealLiteral;
import org.osate.aadl2.RecordValue;
import org.osate.aadl2.ReferenceValue;
import org.osate.xtext.aadl2.properties.formatting2.PropertiesFormatter;
import org.sireum.aadl.gumbo.gumbo.GumboSubclause;
import org.sireum.aadl.gumbo.services.GumboGrammarAccess;

@SuppressWarnings("all")
public class GumboFormatter extends PropertiesFormatter {
  @Inject
  @Extension
  private GumboGrammarAccess _gumboGrammarAccess;
  
  protected void _format(final GumboSubclause gumboSubclause, @Extension final IFormattableDocument document) {
    IEObjectRegion _regionForEObject = this.textRegionExtensions.regionForEObject(gumboSubclause);
    boolean _tripleEquals = (_regionForEObject == null);
    if (_tripleEquals) {
      return;
    }
    ISemanticRegion _previousSemanticRegion = this.textRegionExtensions.regionForEObject(gumboSubclause).getPreviousSemanticRegion();
    boolean _tripleEquals_1 = (_previousSemanticRegion == null);
    if (_tripleEquals_1) {
      final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
        it.noSpace();
      };
      document.<GumboSubclause>prepend(gumboSubclause, _function);
    }
  }
  
  public void format(final Object gumboSubclause, final IFormattableDocument document) {
    if (gumboSubclause instanceof IntegerLiteral) {
      _format((IntegerLiteral)gumboSubclause, document);
      return;
    } else if (gumboSubclause instanceof RealLiteral) {
      _format((RealLiteral)gumboSubclause, document);
      return;
    } else if (gumboSubclause instanceof GumboSubclause) {
      _format((GumboSubclause)gumboSubclause, document);
      return;
    } else if (gumboSubclause instanceof ClassifierValue) {
      _format((ClassifierValue)gumboSubclause, document);
      return;
    } else if (gumboSubclause instanceof ComputedValue) {
      _format((ComputedValue)gumboSubclause, document);
      return;
    } else if (gumboSubclause instanceof ModalPropertyValue) {
      _format((ModalPropertyValue)gumboSubclause, document);
      return;
    } else if (gumboSubclause instanceof RangeValue) {
      _format((RangeValue)gumboSubclause, document);
      return;
    } else if (gumboSubclause instanceof RecordValue) {
      _format((RecordValue)gumboSubclause, document);
      return;
    } else if (gumboSubclause instanceof ReferenceValue) {
      _format((ReferenceValue)gumboSubclause, document);
      return;
    } else if (gumboSubclause instanceof ListValue) {
      _format((ListValue)gumboSubclause, document);
      return;
    } else if (gumboSubclause instanceof Operation) {
      _format((Operation)gumboSubclause, document);
      return;
    } else if (gumboSubclause instanceof XtextResource) {
      _format((XtextResource)gumboSubclause, document);
      return;
    } else if (gumboSubclause instanceof ArrayRange) {
      _format((ArrayRange)gumboSubclause, document);
      return;
    } else if (gumboSubclause instanceof BasicPropertyAssociation) {
      _format((BasicPropertyAssociation)gumboSubclause, document);
      return;
    } else if (gumboSubclause instanceof ContainmentPathElement) {
      _format((ContainmentPathElement)gumboSubclause, document);
      return;
    } else if (gumboSubclause instanceof EObject) {
      _format((EObject)gumboSubclause, document);
      return;
    } else if (gumboSubclause == null) {
      _format((Void)null, document);
      return;
    } else if (gumboSubclause != null) {
      _format(gumboSubclause, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(gumboSubclause, document).toString());
    }
  }
}
