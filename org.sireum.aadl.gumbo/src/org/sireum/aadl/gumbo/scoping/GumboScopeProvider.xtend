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
import org.sireum.aadl.gumbo.gumbo.AssumeStatement
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
import org.sireum.aadl.gumbo.gumbo.RecordLitExpr
import org.osate.aadl2.DataImplementation
import org.sireum.aadl.gumbo.gumbo.DataElement
import org.osate.aadl2.DataType
import org.osate.aadl2.ListValue
import org.osate.aadl2.DataClassifier
import org.osate.aadl2.EnumerationLiteral
import org.osate.aadl2.NamedValue
import org.osate.aadl2.StringLiteral
import org.osate.aadl2.NamedElement
import org.sireum.aadl.gumbo.gumbo.OtherDataRef
import org.osate.aadl2.Subcomponent
import org.osate.aadl2.FeatureGroup
import org.osate.aadl2.FeatureGroupType
import org.osate.aadl2.FeatureGroupPrototype
import org.osate.aadl2.ComponentClassifier
import org.osate.aadl2.ComponentPrototype
import org.osate.aadl2.DataPort
import org.osate.aadl2.modelsupport.ResolvePrototypeUtil
import org.osate.aadl2.EventDataPort
import org.sireum.aadl.gumbo.gumbo.DataRefExpr
import org.eclipse.emf.common.util.BasicEList
import org.sireum.aadl.gumbo.gumbo.DefDef
import org.sireum.aadl.gumbo.gumbo.DefParam

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
		} //else {
//			println("Found: " + class.name + '.' + sname + " : " + context.class.simpleName)
//		}
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

//	def scope_FeatureElement_feature(FeatureElement context, EReference reference) {
//		genericContext(context, reference)
//	}

	def scope_AssumeStatement_forPort(AssumeStatement context, EReference reference) {
		genericContext(context, reference)
	}
	
    def scope_StateVarDecl_typeName(StateVarDecl context, EReference reference) {
    	getVariableScope(context, reference)
    }
    
    def scope_DefParam_typeName(DefParam context, EReference reference) {
    	getVariableScope(context, reference)
    }
    
    def getVariableScope(EObject context, EReference reference) {
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

//    def scope_StateVarRef_stateVar(StateVarRef context, EReference reference) {
//	}
	
	def scope_DataRefExpr_portOrSubcomponentOrStateVar(DataRefExpr context, EReference reference) {
		val varScope = context.getContainerOfType(Classifier).allMembers.scopeFor
		val decls = new BasicEList<EObject>()
		val stateVarDecls = context.getContainerOfType(SpecSection).state?.decls
		if (stateVarDecls !== null) {
			decls.addAll(stateVarDecls)
		}
		val functionSpecs = context.getContainerOfType(SpecSection).functions?.specs
		if (functionSpecs !== null) {
			decls.addAll(functionSpecs)
		}
		var annexScope = decls.empty ? varScope : decls.scopeFor(varScope)
		val scope = context.getContainerOfType(DefDef)?.args?.params?.scopeFor(annexScope) ?: annexScope
		scope
	}	
	
	def protected static getClassifierForPreviousOtherDataRefElement(NamedElement previousElement) {
		switch previousElement {
			case null,
			case previousElement.eIsProxy:
				//Don't provide a scope if the previous element could not be resolved
				null
			Subcomponent: {
				switch subcomponentType : previousElement.allSubcomponentType {
					ComponentClassifier:
						subcomponentType
					ComponentPrototype:
						ResolvePrototypeUtil.resolveComponentPrototype(subcomponentType, previousElement)
				}
			}
			FeatureGroup: {
				switch featureType : previousElement.allFeatureType {
					FeatureGroupType:
						featureType
					FeatureGroupPrototype:
						ResolvePrototypeUtil.resolveFeatureGroupPrototype(featureType, previousElement)
				}
			}
		}
	}
	
	def protected static getSubcomponentType(EObject e) {
		switch e {
			DataPort:
				e.dataFeatureClassifier
			EventDataPort:
				e.dataFeatureClassifier
			Subcomponent:
				e.subcomponentType
			StateVarDecl:
				e.typeName
			DefParam:
				e.typeName
			default:
				null
		}
	}
	
	def scope_OtherDataRef_namedElement(OtherDataRef context, EReference reference) {
		val namespace = switch ec : context.eContainer {
			DataRefExpr: {
				ec.portOrSubcomponentOrStateVar?.getSubcomponentType
			}
			OtherDataRef: {
				ec.namedElement.classifierForPreviousOtherDataRefElement
			}
		}
		namespace?.ownedElements?.filterRefined?.scopeFor ?: IScope::NULLSCOPE
	}
	
	def scope_EnumLitExpr_enumType(EnumLitExpr context, EReference reference) {
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

	def scope_EnumLitExpr_value(EnumLitExpr context, EReference reference) {
		val elm = context.enumType.dataElement
		if (elm instanceof DataType) {
			val propAssocs = elm.ownedPropertyAssociations
			val dataRepProperty = propAssocs.
			             filter([pa | pa.property.getQualifiedName == "Data_Model::Data_Representation" &&
			             	          !pa.ownedValues.empty ]).
			             map([pa | pa.ownedValues.head.ownedValue ]).
			             filter(NamedValue).
			             map([pa | pa.namedValue]).
			             filter(EnumerationLiteral).
			             findFirst([ x | true ])
			if (dataRepProperty !== null && dataRepProperty.name == "Enum") {
				val dataEnumProperty = propAssocs.
				         filter([pa | pa.property.getQualifiedName == "Data_Model::Enumerators" &&
			             	          !pa.ownedValues.empty]).
				         map([pa | pa.ownedValues.head.ownedValue ]).
				         filter(ListValue).
				  		 findFirst([x | true])
				if (dataEnumProperty !== null) {
					val scope = dataEnumProperty.ownedListElements.filter(StringLiteral).scopeFor(
			    		[{ 
			    			QualifiedName::create(value)
			    		}],
			    		IScope::NULLSCOPE
			    	)
					return scope
				}
		    }
		}
		return IScope::NULLSCOPE
	}
		
	def scope_DataElement_dataElement(DataElement context, EReference reference) {
    	val pkg = context.getContainerOfType(AadlPackage)
    	val elem = context.getContainerOfType(PackageSection).ownedMembers.filter([x | x instanceof DataClassifier]) +
    	           context.getContainerOfType(PackageSection).
    	           importedUnits.
    	           filter(AadlPackage).
    	           map([x | x.ownedPublicSection.ownedMembers.filter([y | y instanceof DataClassifier])]).
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
