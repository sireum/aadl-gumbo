
/** Copyright (c) 2021, Kansas State University
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
package org.sireum.aadl.gumbo.scoping

import com.google.common.base.Predicate
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import java.lang.reflect.Method
import org.eclipse.xtext.scoping.impl.SimpleScope
import org.sireum.aadl.gumbo.gumbo.FeatureElement
import org.sireum.aadl.gumbo.gumbo.AssumeStatement
import org.sireum.aadl.gumbo.gumbo.IdExpr
import org.osate.aadl2.Classifier
import org.osate.aadl2.ComponentImplementation

import static extension org.eclipse.xtext.EcoreUtil2.getContainerOfType
import org.sireum.aadl.gumbo.gumbo.HyperperiodComputationalModel

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class GumboScopeProvider extends AbstractGumboScopeProvider {
	override protected Predicate<Method> getPredicate(EObject context, EReference reference) {
		val method = super.getPredicate(context, reference)
		println(method)  
		return method
	}
	
	def SimpleScope genericContext(EObject context, EReference reference) {
		val classifier = context.getContainerOfType(Classifier)
						
		(classifier.getAllFeatures +
					if (classifier instanceof ComponentImplementation) {
						classifier.allInternalFeatures
					} else {
						emptyList
					}).scopeFor		
	}
	
	def SimpleScope scope_FeatureElement_feature(FeatureElement context, EReference reference) {
		genericContext(context, reference)
	}
	
	//'scope_AssumeStatement_forPort'
	def SimpleScope scope_AssumeStatement_forPort(AssumeStatement context, EReference reference) {
		genericContext(context, reference)
	}
	
	//'scope_IdExpr_id'
	def scope_IdExpr_id(IdExpr context, EReference reference) {
		genericContext(context, reference)
	}
	
	//scope_HyperperiodComputationalModel_constraints
	def scope_HyperperiodComputationalModel_constraints(HyperperiodComputationalModel context, EReference reference) {
		genericContext(context, reference)
	}
}
