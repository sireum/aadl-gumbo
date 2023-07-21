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
import org.sireum.aadl.gumbo.gumbo.SlangDefDef
import org.sireum.aadl.gumbo.gumbo.SlangDefParam
import org.sireum.aadl.gumbo.gumbo.SlangType
import org.sireum.aadl.gumbo.gumbo.SlangIdStmt
import org.sireum.aadl.gumbo.gumbo.GuaranteeStatement
import org.sireum.aadl.gumbo.gumbo.AnonGuaranteeStatement
import org.sireum.aadl.gumbo.gumbo.InStateExpr
import org.sireum.aadl.gumbo.gumbo.MaySendExpr
import org.sireum.aadl.gumbo.gumbo.MustSendExpr
import org.osate.aadl2.Port
import org.osate.aadl2.DirectionType
import org.osate.aadl2.PortCategory
import org.sireum.aadl.gumbo.gumbo.HandlerClause
import java.util.List
import org.sireum.aadl.gumbo.gumbo.NoSendExpr
import org.sireum.aadl.gumbo.gumbo.GumboLibrary
import org.sireum.aadl.gumbo.gumbo.FuncSpec
import org.eclipse.emf.common.util.EList
import org.osate.aadl2.AnnexLibrary
import org.osate.aadl2.DefaultAnnexLibrary
import org.sireum.aadl.gumbo.gumbo.CallExpr
import org.sireum.aadl.gumbo.gumbo.Compute
import org.sireum.aadl.gumbo.gumbo.InfoFlowClause
import org.osate.aadl2.EventPort
import org.sireum.aadl.gumbo.gumbo.HasEventExpr

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
		/*
		 * else {
		 *   println("Found: " + class.name + '.' + sname + " : " + context.class.simpleName)
		 * }
		 */
		return method
	}

	def SimpleScope genericContext(EObject context, EReference reference) {
		val classifier = context.getContainerOfType(Classifier)

		val scope = (classifier.getAllFeatures + if (classifier instanceof ComponentImplementation) {
			classifier.allInternalFeatures
		} else {
			emptyList
		}).scopeFor

		// println(scope)
		scope
	}

	def scope_AssumeStatement_forPort(AssumeStatement context, EReference reference) {
		genericContext(context, reference)
	}

	def scope_StateVarDecl_typeName(StateVarDecl context, EReference reference) {
		getVariableScope(context, reference)
	}

	def scope_DefParam_typeName(SlangDefParam context, EReference reference) {
		getVariableScope(context, reference)
	}

	def scope_InfoFlowClause_fromPortOrStateVar(InfoFlowClause context, EReference reference) {
		val localDecls = new BasicEList<EObject>()

		val ports = getPortRef(context, reference, #[PortCategory.EVENT, PortCategory.DATA, PortCategory.EVENT_DATA],
			#[DirectionType.IN, DirectionType.OUT])

		val stateVarDecls = context.getContainerOfType(SpecSection).state?.decls
		if (stateVarDecls !== null) {
			localDecls.addAll(stateVarDecls)
		}

		return localDecls.scopeFor(ports)
	}

	def scope_InfoFlowClause_toPortOrStateVar(InfoFlowClause context, EReference reference) {
		val localDecls = new BasicEList<EObject>()

		val ports = getPortRef(context, reference, #[PortCategory.EVENT, PortCategory.DATA, PortCategory.EVENT_DATA],
			#[DirectionType.IN, DirectionType.OUT])

		val stateVarDecls = context.getContainerOfType(SpecSection).state?.decls
		if (stateVarDecls !== null) {
			localDecls.addAll(stateVarDecls)
		}

		return localDecls.scopeFor(ports)
	}

	/* 
	 * def scope_InfoFlowClause_toOutPort(InfoFlowClause context, EReference reference) {
	 *     val ports = getPortRef(context, reference,
	 *     	       #[PortCategory.EVENT, PortCategory.DATA, PortCategory.EVENT_DATA],
	 *     	       #[DirectionType.OUT])

	 *     return ports
	 * }
	 */
	def getVariableScope(EObject context, EReference reference) {

		val Iterable<DataSubcomponentType> dataSubcomponentTypes = //
		context.getContainerOfType(PackageSection).ownedMembers.filter(DataSubcomponentType)

		// scope mapping the simple names for types defined in the same package as context
		val simpleNameScope = dataSubcomponentTypes.scopeFor(
			[DataSubcomponentType dst|QualifiedName::create(dst.name.split("\\."))],
			IScope::NULLSCOPE
		)

		val Iterable<DataSubcomponentType> importedDataSubcomponentTypes = //
		context.getContainerOfType(PackageSection).importedUnits.filter(AadlPackage).map([ x | //
			x.ownedPublicSection !== null //
			? x.ownedPublicSection.ownedMembers.filter(DataSubcomponentType) //
			: new BasicEList<DataSubcomponentType>() //
		]).flatten

		val allDataComponents = new BasicEList<DataSubcomponentType>()
		allDataComponents.addAll(importedDataSubcomponentTypes)
		allDataComponents.addAll(dataSubcomponentTypes)

		// scope mapping the fully qualified name for all imported data components and any 
		// defined in same package as context 
		val SimpleScope fullyQualifiedScope = allDataComponents.scopeFor(
			[ DataSubcomponentType dst |
				{
					val String[] splitName = dst.name.split("\\.")

					splitName.set(0, getContainerOfType(dst, AadlPackage).name + "::" + splitName.get(0))

					QualifiedName::create(splitName)
				}
			],
			simpleNameScope
		)

		return fullyQualifiedScope
	// context.delegateGetScope(reference)
	}

	def EList<SlangDefDef> getGumboLibraryFunctionDefs(EObject context, boolean includeImported) {
		// assumes GUMBO libraries are accessible to anyone who imports the parent package
		val packages = new BasicEList<AadlPackage>();
		packages.add(context.getContainerOfType(AadlPackage))

		if (includeImported) {
			packages.addAll(context.getContainerOfType(PackageSection).importedUnits.filter(AadlPackage).filter [ p |
				p.ownedPublicSection !== null
			])
		}

		val ret = new BasicEList<SlangDefDef>()

		val gumboLibs = packages.map[p|p.ownedPublicSection.ownedMembers].flatten //
		.filter[x|x instanceof DefaultAnnexLibrary].map[m|m as DefaultAnnexLibrary] //
		.filter[dal|dal.parsedAnnexLibrary instanceof GumboLibrary].map[gl|gl.parsedAnnexLibrary as GumboLibrary] //
		val funcSpecs = gumboLibs.map[gl|gl.functions?.specs].flatten.map[m|m as SlangDefDef]
		ret.addAll(funcSpecs)

		return ret
	}

	def IScope getVariableCrossRef(EObject context, EReference reference) {
		if (context.getContainerOfType(Classifier) !== null) {

			val localDecls = new BasicEList<EObject>()

			// add all features and subcomponents to scope      
			localDecls.addAll(context.getContainerOfType(Classifier).allMembers)

			// add all state vars
			val stateVarDecls = context.getContainerOfType(SpecSection).state?.decls
			if (stateVarDecls !== null) {
				localDecls.addAll(stateVarDecls)
			}

			// add subclause's spec defs
			val List<SlangDefDef> functionSpecs = context.getContainerOfType(SpecSection).functions?.specs?.map [ m |
				m as SlangDefDef
			]
			if (functionSpecs !== null) {
				localDecls.addAll(functionSpecs)
			}

			// add any library spec defs from context's package
			localDecls.addAll(getGumboLibraryFunctionDefs(context, false))

			// add params if context is a spec def
			val specDefParams = context.getContainerOfType(SlangDefDef)?.params?.params
			if (specDefParams !== null) {
				localDecls.addAll(specDefParams)
			}

			// scope containing simple name mappings for local decls
			val SimpleScope localScope = localDecls.scopeFor

			val globalDecls = new BasicEList<SlangDefDef>()
			// add all spec functions from local and imported libraries 
			var List<SlangDefDef> gclLibraryFunctionSpecs = getGumboLibraryFunctionDefs(context, true)
			globalDecls.addAll(gclLibraryFunctionSpecs)

			val fullyQualifiedScope = globalDecls.scopeFor(
				[ SlangDefDef sdd |
					{
						val pack = getContainerOfType(sdd, AadlPackage)

						val String[] name = #[pack.name + "::" + sdd.name]

						QualifiedName::create(name)
					}
				],
				localScope
			)

			fullyQualifiedScope

		} else if (context.getContainerOfType(GumboLibrary) !== null) {

			val functionScope = context.getContainerOfType(SlangDefDef)
			if (functionScope !== null) {
				val localDecls = new BasicEList<EObject>()

				// add any spec funcs defined in the same annex lib
				// TODO: recursion?
				var List<SlangDefDef> localGclLibraryFunctionSpecs = getGumboLibraryFunctionDefs(context, false)
				localDecls.addAll(localGclLibraryFunctionSpecs)

				// and spec def's params
				val params = functionScope?.params?.params
				if (params !== null) {
					localDecls.addAll(params)
				}

				// simple name mapping for decls in this library annex
				val localScope = localDecls.scopeFor

				val globalDecls = new BasicEList<SlangDefDef>()
				// add all spec functions from local and imported libraries 
				var List<SlangDefDef> importedGclLibraryFunctionSpecs = getGumboLibraryFunctionDefs(context, true)
				globalDecls.addAll(importedGclLibraryFunctionSpecs)

				// fully qualified name of spec defs in the same package or imported ones
				val fullyQualifiedScope = globalDecls.scopeFor(
					[ SlangDefDef sdd |
						{
							val pack = getContainerOfType(sdd, AadlPackage)

							QualifiedName::create(#[pack.name + "::" + sdd.name])
						}
					],
					localScope
				)

				fullyQualifiedScope

			} else {
				throw new RuntimeException("How are we not in a function?")
			}
		} else {
			// what is this?
			return IScope::NULLSCOPE
		}
	}

	def scope_InStateExpr_stateVar(InStateExpr context, EReference reference) {
		val decls = new BasicEList<EObject>()
		val stateVars = context.getContainerOfType(Compute)?.getContainerOfType(SpecSection)?.state?.decls
		if (stateVars !== null) {
			decls.addAll(stateVars)
		}
		val scope = decls.empty ? IScope::NULLSCOPE : decls.scopeFor
		scope
	}

	def getEventPortRef(EObject context, EReference reference, List<DirectionType> directions) {
		getPortRef(context, reference, #[PortCategory.EVENT, PortCategory.EVENT_DATA], directions)
	}

	def getPortRef(EObject context, EReference reference, List<PortCategory> categories,
		List<DirectionType> directions) {

		if (context === null) {
			return IScope::NULLSCOPE
		}

		val classifier = context.getContainerOfType(Classifier)

		var scopeMembers = (classifier.getAllFeatures + if (classifier instanceof ComponentImplementation) {
			classifier.allInternalFeatures
		} else {
			emptyList
		}).filter(Port).filter([x|categories.contains(x.category)]).filter([ x |
			directions.contains(x.direction)
		])

		val SimpleScope scope = scopeMembers.scopeFor

		// println(scope)
		scope
	}

	def scope_CallExpr_id(CallExpr context, EReference reference) {

		// get any variable/functions that id might be referring to
		// TODO: probably should limit to just function names 
		val IScope vars = getVariableCrossRef(context, reference)

		// get any type decls as id may be referring to a type constructor
		val IScope types = getVariableScope(context, reference)

		return new SimpleScope(types, vars.allElements, true)
	}

	def scope_HasEventExpr_eventPort(HasEventExpr context, EReference reference) {
		return getEventPortRef(context, reference, #[DirectionType.IN, DirectionType.IN_OUT])
	}

	def scope_MaySendExpr_eventPort(MaySendExpr context, EReference reference) {
		return getEventPortRef(context, reference, #[DirectionType.OUT, DirectionType.IN_OUT])
	}

	def scope_MustSendExpr_eventPort(MustSendExpr context, EReference reference) {
		return getEventPortRef(context, reference, #[DirectionType.OUT, DirectionType.IN_OUT])
	}

	def scope_NoSendExpr_eventPort(NoSendExpr context, EReference reference) {
		return getEventPortRef(context, reference, #[DirectionType.OUT, DirectionType.IN_OUT])
	}

	def scope_HandlerClause_id(HandlerClause context, EReference reference) {
		return getEventPortRef(context, reference, #[DirectionType.IN, DirectionType.IN_OUT])
	}

	def scope_DataRefExpr_portOrSubcomponentOrStateVar(DataRefExpr context, EReference reference) {
		return getVariableCrossRef(context, reference)
	}

	def scope_SlangIdStmt_portOrSubcomponentOrStateVar(SlangIdStmt context, EReference reference) {
		return getVariableCrossRef(context, reference)
	}

	def protected static getClassifierForPreviousOtherDataRefElement(NamedElement previousElement) {
		switch previousElement {
			case null,
			case previousElement.eIsProxy:
				// Don't provide a scope if the previous element could not be resolved
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
			SlangDefParam:
				e.typeName.typeName
			default:
				null
		}
	}

	def scope_SlangType_typeName(SlangType context, EReference reference) {
		getVariableScope(context, reference)
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
		// val pkg = context.getContainerOfType(AadlPackage)
		val elem = context.getContainerOfType(PackageSection).ownedMembers.filter([x|x instanceof DataClassifier]) +
			context.getContainerOfType(PackageSection).importedUnits.filter(AadlPackage).map([ x |
				x.ownedPublicSection !== null ? x.ownedPublicSection.ownedMembers.
					filter([y|y instanceof DataClassifier]) : new BasicEList<NamedElement>()
			]).flatten
		val scope = elem.scopeFor(
			[
				{
					val String[] splitName = name.split("\\.")
					// if(getContainerOfType(AadlPackage) !== pkg) {
					splitName.set(0, getContainerOfType(AadlPackage).name + "::" + splitName.get(0))
					// }
					QualifiedName::create(splitName)
				}
			],
			IScope::NULLSCOPE
		)
		scope
	}

	def scope_EnumLitExpr_value(EnumLitExpr context, EReference reference) {
		val elm = context.enumType
		if (elm instanceof DataType) {
			val propAssocs = elm.ownedPropertyAssociations
			val dataRepProperty = propAssocs.filter([ pa |
				pa.property.getQualifiedName == "Data_Model::Data_Representation" && !pa.ownedValues.empty
			]).map([pa|pa.ownedValues.head.ownedValue]).filter(NamedValue).map([pa|pa.namedValue]).filter(
				EnumerationLiteral).findFirst([x|true])
			if (dataRepProperty !== null && dataRepProperty.name == "Enum") {
				val dataEnumProperty = propAssocs.filter([ pa |
					pa.property.getQualifiedName == "Data_Model::Enumerators" && !pa.ownedValues.empty
				]).map([pa|pa.ownedValues.head.ownedValue]).filter(ListValue).findFirst([x|true])
				if (dataEnumProperty !== null) {
					val scope = dataEnumProperty.ownedListElements.filter(StringLiteral).scopeFor(
						[
							{
								QualifiedName::create(value)
							}
						],
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
		val elem = context.getContainerOfType(PackageSection).ownedMembers.filter([x|x instanceof DataClassifier]) +
			context.getContainerOfType(PackageSection).importedUnits.filter(AadlPackage).map([ x |
				x.ownedPublicSection.ownedMembers.filter([y|y instanceof DataClassifier])
			]).flatten
		val scope = elem.scopeFor(
			[
				{
					val String[] splitName = name.split("\\.")
					if (getContainerOfType(AadlPackage) !== pkg) {
						splitName.set(0, getContainerOfType(AadlPackage).name + "::" + splitName.get(0))
					}
					QualifiedName::create(splitName)
				}
			],
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
}
