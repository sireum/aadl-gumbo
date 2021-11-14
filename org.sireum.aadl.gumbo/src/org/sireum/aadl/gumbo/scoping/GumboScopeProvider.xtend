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
import org.sireum.aadl.gumbo.gumbo.StateVarRef
import org.sireum.aadl.gumbo.gumbo.PortRef
import org.osate.aadl2.Classifier
import org.osate.aadl2.ComponentImplementation

import static extension org.eclipse.xtext.EcoreUtil2.getContainerOfType
import org.sireum.aadl.gumbo.gumbo.SpecSection
import org.osate.aadl2.AadlPackage
import org.sireum.aadl.gumbo.gumbo.StateVarDecl
import org.osate.aadl2.DataSubcomponentType
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.scoping.IScope
import org.osate.aadl2.PackageSection
import org.sireum.aadl.gumbo.gumbo.EnumLitExpr
import org.osate.aadl2.EnumerationType
import org.sireum.aadl.gumbo.gumbo.RecordLitExpr
import org.osate.aadl2.DataImplementation
import org.sireum.aadl.gumbo.gumbo.DataElement
import org.osate.aadl2.DataType
import org.osate.aadl2.modelsupport.util.AadlUtil

// import org.sireum.aadl.gumbo.gumbo.HyperperiodComputationalModel

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class GumboScopeProvider extends AbstractGumboScopeProvider {
	override protected Predicate<Method> getPredicate(EObject context, EReference reference) {
		val method = super.getPredicate(context, reference)
		val sname = method.toString.substring(1, method.toString.length - 1)
		if (!class.methods.map[name].contains(sname)) {
			println("Missing: " + class.name + '.' + sname + " : " + context.class.simpleName)
		}
		return method
	}

	def SimpleScope genericContext(EObject context, EReference reference) {
		val classifier = context.getContainerOfType(Classifier)

		val scope = (classifier.getAllFeatures + if (classifier instanceof ComponentImplementation) {
			classifier.allInternalFeatures
		} else {
			emptyList
		}).scopeFor
		
		//println(scope)
		
		scope
	}

	def scope_FeatureElement_feature(FeatureElement context, EReference reference) {
		genericContext(context, reference)
	}

	def scope_AssumeStatement_forPort(AssumeStatement context, EReference reference) {
		genericContext(context, reference)
	}
	
    def scope_StateVarDecl_typeName(StateVarDecl context, EReference reference) {
    	val pkg = context.getContainerOfType(AadlPackage)
    	val elem = context.getContainerOfType(PackageSection).ownedMembers.filter(DataSubcomponentType) +
    	           context.getContainerOfType(PackageSection).
    	           importedUnits.
    	           filter(AadlPackage).
    	           map([x | x.ownedPublicSection.ownedMembers.filter(DataSubcomponentType)]).
    	           flatten
    	val scope = elem.scopeFor(
    		[{ 
    			val String[] splitName = name.split("\\.")
    			if(getContainerOfType(AadlPackage) !== pkg) {
    				splitName.set(0, getContainerOfType(AadlPackage).name + "::" + splitName.get(0))
    			}
    			QualifiedName::create(splitName)
    		}],
    		IScope::NULLSCOPE
    	)
    	scope
    	//context.delegateGetScope(reference)
   	}

    def scope_StateVarRef_stateVar(StateVarRef context, EReference reference) {
    	context.getContainerOfType(SpecSection).state.decls.scopeFor
	}
	
	def scope_PortRef_portName(PortRef context, EReference reference) {
		genericContext(context, reference)
	}
	
	def scope_EnumLitExpr_enumType(EnumLitExpr context, EReference reference) {
		genericContext(context, reference)
	}

	def scope_EnumLitExpr_value(EnumLitExpr context, EReference reference) {
		val prop = context.enumType.propertyType
		val scope = (prop as EnumerationType)?.ownedLiterals.scopeFor
		scope
	}
		
	def scope_DataElement_dataElement(DataElement context, EReference reference) {
    	val pkg = context.getContainerOfType(AadlPackage)
    	val elem = context.getContainerOfType(PackageSection).ownedMembers.filter([x | x instanceof DataImplementation]) +
    	           context.getContainerOfType(PackageSection).
    	           importedUnits.
    	           filter(AadlPackage).
    	           map([x | x.ownedPublicSection.ownedMembers.filter([y | y instanceof DataImplementation])]).
    	           flatten
    	val scope = elem.scopeFor(
    		[{ 
    			val String[] splitName = name.split("\\.")
    			if(getContainerOfType(AadlPackage) !== pkg) {
    				splitName.set(0, getContainerOfType(AadlPackage).name + "::" + splitName.get(0))
    			}
    			QualifiedName::create(splitName)
    		}],
    		IScope::NULLSCOPE
    	)
    	scope		
	}
	
	def scope_RecordLitExpr_args(RecordLitExpr context, EReference reference) {
		val elm = context.recordType.dataElement
		if (elm instanceof DataImplementation) {
			val scope = elm.ownedSubcomponents.scopeFor
			return scope
		} else {
			return IScope::NULLSCOPE
		}
	}

//	def scope_HyperperiodComputationalModel_constraints(HyperperiodComputationalModel context, EReference reference) {
//		genericContext(context, reference)
//	}
}
