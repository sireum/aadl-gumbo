package org.sireum.aadl.gumbo.scoping;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.SimpleScope;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.osate.aadl2.AadlPackage;
import org.osate.aadl2.Classifier;
import org.osate.aadl2.ComponentClassifier;
import org.osate.aadl2.ComponentImplementation;
import org.osate.aadl2.ComponentPrototype;
import org.osate.aadl2.DataClassifier;
import org.osate.aadl2.DataImplementation;
import org.osate.aadl2.DataPort;
import org.osate.aadl2.DataSubcomponentType;
import org.osate.aadl2.DataType;
import org.osate.aadl2.DefaultAnnexLibrary;
import org.osate.aadl2.DirectionType;
import org.osate.aadl2.EnumerationLiteral;
import org.osate.aadl2.EventDataPort;
import org.osate.aadl2.FeatureGroup;
import org.osate.aadl2.FeatureGroupPrototype;
import org.osate.aadl2.FeatureGroupType;
import org.osate.aadl2.FeatureType;
import org.osate.aadl2.ListValue;
import org.osate.aadl2.NamedElement;
import org.osate.aadl2.NamedValue;
import org.osate.aadl2.PackageSection;
import org.osate.aadl2.Port;
import org.osate.aadl2.PortCategory;
import org.osate.aadl2.PropertyAssociation;
import org.osate.aadl2.StringLiteral;
import org.osate.aadl2.Subcomponent;
import org.osate.aadl2.SubcomponentType;
import org.osate.aadl2.Type;
import org.osate.aadl2.modelsupport.ResolvePrototypeUtil;
import org.osate.xtext.aadl2.properties.scoping.PropertiesScopeProvider;
import org.sireum.aadl.gumbo.gumbo.CallExpr;
import org.sireum.aadl.gumbo.gumbo.Compute;
import org.sireum.aadl.gumbo.gumbo.DataElement;
import org.sireum.aadl.gumbo.gumbo.DataRefExpr;
import org.sireum.aadl.gumbo.gumbo.EnumLitExpr;
import org.sireum.aadl.gumbo.gumbo.GumboLibrary;
import org.sireum.aadl.gumbo.gumbo.HandlerClause;
import org.sireum.aadl.gumbo.gumbo.HasEventExpr;
import org.sireum.aadl.gumbo.gumbo.InStateExpr;
import org.sireum.aadl.gumbo.gumbo.InfoFlowClause;
import org.sireum.aadl.gumbo.gumbo.MaySendExpr;
import org.sireum.aadl.gumbo.gumbo.MustSendExpr;
import org.sireum.aadl.gumbo.gumbo.NoSendExpr;
import org.sireum.aadl.gumbo.gumbo.OtherDataRef;
import org.sireum.aadl.gumbo.gumbo.QuantifiedExp;
import org.sireum.aadl.gumbo.gumbo.RecordLitExpr;
import org.sireum.aadl.gumbo.gumbo.SlangDefDef;
import org.sireum.aadl.gumbo.gumbo.SlangDefParam;
import org.sireum.aadl.gumbo.gumbo.SlangType;
import org.sireum.aadl.gumbo.gumbo.SpecSection;
import org.sireum.aadl.gumbo.gumbo.StateVarDecl;

import com.google.common.base.Predicate;

public class GumboScopeProvider extends AbstractGumboScopeProvider {
	@Override
	protected Predicate<Method> getPredicate(EObject context, EReference reference) {
		Predicate<Method> method = super.getPredicate(context, reference);
		String sname = method.toString().substring(1, method.toString().length() - 1);
		if (!Arrays.stream(getClass().getDeclaredMethods()).anyMatch(s -> s.getName().equals(sname))) {
			System.out.println(
					"Missing: " + getClass().getName() + '.' + sname + " : " + context.getClass().getSimpleName());
		}
		return method;
	}

	IScope scope_StateVarDecl_typeName(StateVarDecl context, EReference reference) {
		return getVariableScope(context, reference);
	}

	IScope scope_InfoFlowClause_fromPortOrStateVar(InfoFlowClause context, EReference reference) {
		EList<EObject> localDecls = new BasicEList<>();

		// Get ports that match the specified categories and directions
		IScope portsScope = getPortsScope(context, reference,
				List.of(PortCategory.EVENT, PortCategory.DATA, PortCategory.EVENT_DATA),
				List.of(DirectionType.IN, DirectionType.OUT));

		// Add state variable declarations, if present
		SpecSection specSection = EcoreUtil2.getContainerOfType(context, SpecSection.class);
		if (specSection != null && specSection.getState() != null && specSection.getState().getDecls() != null) {
			localDecls.addAll(specSection.getState().getDecls());
		}

		return PropertiesScopeProvider.scopeFor(localDecls, portsScope);
	}

	IScope scope_InfoFlowClause_toPortOrStateVar(InfoFlowClause context, EReference reference) {
		EList<EObject> localDecls = new BasicEList<>();

		// Get ports that match the specified categories and directions
		IScope portsScope = getPortsScope(context, reference,
				List.of(PortCategory.EVENT, PortCategory.DATA, PortCategory.EVENT_DATA),
				List.of(DirectionType.IN, DirectionType.OUT));

		// Add state variable declarations, if present
		SpecSection specSection = EcoreUtil2.getContainerOfType(context, SpecSection.class);
		if (specSection != null && specSection.getState() != null && specSection.getState().getDecls() != null) {
			localDecls.addAll(specSection.getState().getDecls());
		}

		return PropertiesScopeProvider.scopeFor(localDecls, portsScope);
	}

	IScope scope_InStateExpr_stateVar(InStateExpr context, EReference reference) {
		EList<EObject> decls = new BasicEList<>();

		// travers to the SpecSection via Compute
		SpecSection specSection = EcoreUtil2.getContainerOfType(EcoreUtil2.getContainerOfType(context, Compute.class),
				SpecSection.class);

		if (specSection != null && specSection.getState() != null && specSection.getState().getDecls() != null) {
			decls.addAll(specSection.getState().getDecls());
		}

		return decls.isEmpty() ? IScope.NULLSCOPE : Scopes.scopeFor(decls);
	}

	IScope scope_CallExpr_id(CallExpr context, EReference reference) {
		// Variables and functions the ID might refer to
		IScope vars = getVariableCrossRef(context, reference);

		// get any type decls as id may be referring to a type constructor
		IScope types = getVariableScope(context, reference);

		// Create a new scope combining types and vars (vars take precedence)
		return new SimpleScope(types, vars.getAllElements(), true);
	}

	IScope scope_HasEventExpr_eventPort(HasEventExpr context, EReference reference) {
		return getEventPortScope(context, reference,
				Arrays.asList(DirectionType.IN, DirectionType.IN_OUT, DirectionType.OUT));
	}

	IScope scope_MaySendExpr_eventPort(MaySendExpr context, EReference reference) {
		return getEventPortScope(context, reference, Arrays.asList(DirectionType.OUT, DirectionType.IN_OUT));
	}

	IScope scope_MustSendExpr_eventPort(MustSendExpr context, EReference reference) {
		return getEventPortScope(context, reference, Arrays.asList(DirectionType.OUT, DirectionType.IN_OUT));
	}

	IScope scope_NoSendExpr_eventPort(NoSendExpr context, EReference reference) {
		return getEventPortScope(context, reference, Arrays.asList(DirectionType.OUT, DirectionType.IN_OUT));
	}

	IScope scope_HandlerClause_id(HandlerClause context, EReference reference) {
		return getEventPortScope(context, reference, Arrays.asList(DirectionType.IN, DirectionType.IN_OUT));
	}

	IScope scope_DataRefExpr_portOrSubcomponentOrStateVar(DataRefExpr context, EReference reference) {
		return getVariableCrossRef(context, reference);
	}

	IScope scope_SlangType_typeName(SlangType context, EReference reference) {
		return getVariableScope(context, reference);
	}

	IScope scope_OtherDataRef_namedElement(OtherDataRef context, EReference reference) {
		EObject container = context.eContainer();
		Type namespace = null;

		if (container instanceof DataRefExpr) {
			EObject subcomponent = ((DataRefExpr) container).getPortOrSubcomponentOrStateVar();
			if (subcomponent != null) {
				namespace = getSubcomponentType(subcomponent);
			}
		} else if (container instanceof OtherDataRef) {
			NamedElement named = ((OtherDataRef) container).getNamedElement();
			if (named != null) {
				namespace = getClassifierForPreviousOtherDataRefElement(named);
			}
		}

		if (namespace != null && namespace.getOwnedElements() != null) {
			IScope baseScope = PropertiesScopeProvider
					.scopeFor(PropertiesScopeProvider.filterRefined(namespace.getOwnedElements()));
			return baseScope;
		} else {
			return IScope.NULLSCOPE;
		}
	}

	IScope scope_EnumLitExpr_enumType(EnumLitExpr context, EReference reference) {
		// Get the package section
		PackageSection pkgSection = EcoreUtil2.getContainerOfType(context, PackageSection.class);
		if (pkgSection == null) {
			return IScope.NULLSCOPE;
		}

		// Get locally defined data classifiers
		List<NamedElement> localClassifiers = pkgSection.getOwnedMembers()
				.stream()
				.filter(x -> x instanceof DataClassifier)
				.collect(Collectors.toList());

		// Get imported classifiers
		List<NamedElement> importedClassifiers = pkgSection.getImportedUnits()
				.stream()
				.filter(unit -> unit instanceof AadlPackage)
				.map(unit -> (AadlPackage) unit)
				.filter(pkg -> pkg.getOwnedPublicSection() != null)
				.flatMap(pkg -> pkg.getOwnedPublicSection()
						.getOwnedMembers()
						.stream()
						.filter(y -> y instanceof DataClassifier))
				.collect(Collectors.toList());

		// Merge all classifiers
		List<NamedElement> allClassifiers = new ArrayList<>();
		allClassifiers.addAll(localClassifiers);
		allClassifiers.addAll(importedClassifiers);

		// Build a scope using fully qualified names
		IScope scope = PropertiesScopeProvider.scopeFor(allClassifiers, elem -> {
			String[] splitName = elem.getName().split("\\.");
			AadlPackage aadlPkg = EcoreUtil2.getContainerOfType(elem, AadlPackage.class);
			if (aadlPkg != null) {
				splitName[0] = aadlPkg.getName() + "::" + splitName[0];
			}
			return QualifiedName.create(splitName);
		}, IScope.NULLSCOPE);

		return scope;
	}

	IScope scope_EnumLitExpr_value(EnumLitExpr context, EReference reference) {
		NamedElement elm = context.getEnumType();

		if (elm instanceof DataType) {
			EList<PropertyAssociation> propAssocs = elm.getOwnedPropertyAssociations();

			// Look for Data_Representation == Enum
			Optional<EnumerationLiteral> dataRepPropertyOpt = propAssocs.stream()
					.filter(pa -> "Data_Model::Data_Representation".equals(pa.getProperty().getQualifiedName())
							&& !pa.getOwnedValues().isEmpty())
					.map(pa -> pa.getOwnedValues().get(0).getOwnedValue())
					.filter(NamedValue.class::isInstance)
					.map(NamedValue.class::cast)
					.map(NamedValue::getNamedValue)
					.filter(EnumerationLiteral.class::isInstance)
					.map(EnumerationLiteral.class::cast)
					.findFirst();

			if (dataRepPropertyOpt.isPresent() && "Enum".equals(dataRepPropertyOpt.get().getName())) {
				// Look for Enumerators list
				Optional<ListValue> dataEnumPropertyOpt = propAssocs.stream()
						.filter(pa -> "Data_Model::Enumerators".equals(pa.getProperty().getQualifiedName())
								&& !pa.getOwnedValues().isEmpty())
						.map(pa -> pa.getOwnedValues().get(0).getOwnedValue())
						.filter(ListValue.class::isInstance)
						.map(ListValue.class::cast)
						.findFirst();

				if (dataEnumPropertyOpt.isPresent()) {
					ListValue dataEnumProperty = dataEnumPropertyOpt.get();

					List<StringLiteral> stringLiterals = dataEnumProperty.getOwnedListElements()
							.stream()
							.filter(StringLiteral.class::isInstance)
							.map(StringLiteral.class::cast)
							.collect(Collectors.toList());

					return PropertiesScopeProvider.scopeFor(stringLiterals, lit -> QualifiedName.create(lit.getValue()),
							IScope.NULLSCOPE);
				}
			}
		}
		return IScope.NULLSCOPE;
	}

	IScope scope_DataElement_dataElement(DataElement context, EReference reference) {
		AadlPackage currentPkg = EcoreUtil2.getContainerOfType(context, AadlPackage.class);
		PackageSection section = EcoreUtil2.getContainerOfType(context, PackageSection.class);

		// Collect local DataClassifiers
		List<NamedElement> localDataClassifiers = section.getOwnedMembers()
				.stream()
				.filter(e -> e instanceof DataClassifier)
				.collect(Collectors.toList());

		// Collect imported DataClassifiers
		List<NamedElement> importedDataClassifiers = section.getImportedUnits()
				.stream()
				.filter(unit -> unit instanceof AadlPackage && ((AadlPackage) unit).getOwnedPublicSection() != null)
				.flatMap(unit -> ((AadlPackage) unit).getOwnedPublicSection().getOwnedMembers().stream())
				.filter(e -> e instanceof DataClassifier)
				.collect(Collectors.toList());

		// Merge local and imported
		List<NamedElement> allDataClassifiers = new ArrayList<>();
		allDataClassifiers.addAll(localDataClassifiers);
		allDataClassifiers.addAll(importedDataClassifiers);

		// Scope computation
		return PropertiesScopeProvider.scopeFor(allDataClassifiers, namedElement -> {
			String[] splitName = namedElement.getName().split("\\.");
			AadlPackage owningPkg = EcoreUtil2.getContainerOfType(context, AadlPackage.class);
			if (!owningPkg.equals(currentPkg)) {
				splitName[0] = owningPkg.getName() + "::" + splitName[0];
			}
			return QualifiedName.create(splitName);
		}, IScope.NULLSCOPE);
	}

	IScope scope_RecordLitExpr_args(RecordLitExpr context, EReference reference) {
		NamedElement elm = context.getRecordType().getDataElement();
		if (elm instanceof DataImplementation) {
			DataImplementation dataImpl = (DataImplementation) elm;
			return PropertiesScopeProvider.scopeFor(dataImpl.getOwnedSubcomponents());
		} else {
			return IScope.NULLSCOPE;
		}
	}

	////////////////////////////////////////////////////////////////////////////
	// Helper methods
	////////////////////////////////////////////////////////////////////////////

	IScope genericContext(EObject context, EReference reference) {
		Classifier classifier = EcoreUtil2.getContainerOfType(context, Classifier.class);
		List<EObject> features = Collections.emptyList();
		if (classifier == null) {
			return Scopes.scopeFor(features);
		}
		features.addAll(classifier.getAllFeatures());
		if (classifier instanceof ComponentImplementation) {
			features.addAll(((ComponentImplementation) classifier).getAllInternalFeatures());
		}
		return Scopes.scopeFor(features);
	}

	IScope getVariableScope(EObject context, EReference reference) {
		PackageSection packageSection = EcoreUtil2.getContainerOfType(context, PackageSection.class);
		if (packageSection == null) {
			return IScope.NULLSCOPE;
		}

		// Get locally defined DataSubcomponentTypes
		List<DataSubcomponentType> dataSubcomponentTypes = packageSection.getOwnedMembers()
				.stream()
				.filter(e -> e instanceof DataSubcomponentType)
				.map(e -> (DataSubcomponentType) e)
				.collect(Collectors.toList());

		// scope mapping the simple names for types defined in the same package as context
		IScope simpleNameScope = PropertiesScopeProvider.scopeFor(dataSubcomponentTypes,
				(Function1<DataSubcomponentType, QualifiedName>) dst -> QualifiedName
						.create(dst.getName().split("\\.")),
				IScope.NULLSCOPE);

		// Collect imported DataSubcomponentTypes
		List<DataSubcomponentType> importedDataSubcomponentTypes = packageSection.getImportedUnits()
				.stream()
				.filter(e -> e instanceof AadlPackage)
				.flatMap(e -> {
					AadlPackage aadlPackage = (AadlPackage) e;
					if (aadlPackage.getOwnedPublicSection() != null) {
						return aadlPackage.getOwnedPublicSection()
								.getOwnedMembers()
								.stream()
								.filter(m -> m instanceof DataSubcomponentType)
								.map(m -> (DataSubcomponentType) m);
					} else {
						return new BasicEList<DataSubcomponentType>().stream();
					}
				})
				.collect(Collectors.toList());

		// Merge all DataSubcomponentTypes
		List<DataSubcomponentType> allDataComponents = new ArrayList<>();
		allDataComponents.addAll(importedDataSubcomponentTypes);
		allDataComponents.addAll(dataSubcomponentTypes);

		// scope mapping the fully qualified name for all imported data components and any
		// defined in same package as context
		IScope fullyQualifiedScope = PropertiesScopeProvider.scopeFor(allDataComponents,
				(Function1<DataSubcomponentType, QualifiedName>) dst -> {
					String[] splitName = dst.getName().split("\\.");
					AadlPackage owningPackage = EcoreUtil2.getContainerOfType(dst, AadlPackage.class);
					if (owningPackage != null && splitName.length > 0) {
						splitName[0] = owningPackage.getName() + "::" + splitName[0];
					}
					return QualifiedName.create(splitName);
				}, simpleNameScope);

		return fullyQualifiedScope;
	}

	public IScope getVariableCrossRef(EObject context, EReference reference) {
		Classifier classifier = EcoreUtil2.getContainerOfType(context, Classifier.class);

		if (classifier != null) {
			EList<EObject> localDecls = new BasicEList<>();

			// All members from classifier
			localDecls.addAll(PropertiesScopeProvider.allMembers(classifier));

			// State variable declarations
			SpecSection specSection = EcoreUtil2.getContainerOfType(context, SpecSection.class);
			if (specSection != null && specSection.getState() != null) {
				localDecls.addAll(specSection.getState().getDecls());
			}

			// Function specs from SpecSection
			if (specSection != null && specSection.getFunctions() != null
					&& specSection.getFunctions().getSpecs() != null) {
				List<SlangDefDef> functionSpecs = specSection.getFunctions()
						.getSpecs()
						.stream()
						.map(s -> (SlangDefDef) s)
						.collect(Collectors.toList());
				localDecls.addAll(functionSpecs);
			}

			// Library defs from current package
			localDecls.addAll(getGumboLibraryFunctionDefs(context, false));

			// Parameters of the enclosing function, if any
			SlangDefDef defDef = EcoreUtil2.getContainerOfType(context, SlangDefDef.class);
			if (defDef != null && defDef.getParams() != null) {
				localDecls.addAll(defDef.getParams().getParams());
			}
			
			// Parameters of quantified expressions (including nested quantified expressions)
			List<QuantifiedExp> quantifiedExpressions = StreamSupport.stream(EcoreUtil2.getAllContainers(context).spliterator(), false)
					.filter(QuantifiedExp.class::isInstance)
					.map(QuantifiedExp.class::cast)
					.collect(Collectors.toList());
			for (QuantifiedExp qe : quantifiedExpressions) {
				localDecls.add(qe.getQuantParam());
			}
			
			IScope localScope = Scopes.scopeFor(localDecls);

			// Global library defs with fully qualified names
			List<SlangDefDef> globalDefs = getGumboLibraryFunctionDefs(context, true);

			IScope fullyQualifiedScope = Scopes.scopeFor(globalDefs, sdd -> {
				AadlPackage pack = EcoreUtil2.getContainerOfType(sdd, AadlPackage.class);
				return QualifiedName.create(pack.getName() + "::" + sdd.getName());
			}, localScope);

			return fullyQualifiedScope;

		} else if (EcoreUtil2.getContainerOfType(context, GumboLibrary.class) != null) {

			SlangDefDef defDef = EcoreUtil2.getContainerOfType(context, SlangDefDef.class);
			if (defDef == null) {
				throw new RuntimeException("How are we not in a function?");
			}

			EList<EObject> localDecls = new BasicEList<>();

			// Local spec defs in annex
			localDecls.addAll(getGumboLibraryFunctionDefs(context, false));

			// Parameters
			if (defDef.getParams() != null) {
				localDecls.addAll(defDef.getParams().getParams());
			}
			
			// Parameters of quantified expressions (including nested quantified expressions)
			List<QuantifiedExp> quantifiedExpressions = StreamSupport.stream(EcoreUtil2.getAllContainers(context).spliterator(), false)
					.filter(QuantifiedExp.class::isInstance)
					.map(QuantifiedExp.class::cast)
					.collect(Collectors.toList());
			for (QuantifiedExp qe : quantifiedExpressions) {
				localDecls.add(qe.getQuantParam());
			}

			IScope localScope = Scopes.scopeFor(localDecls);

			// Global scope from local + imported library specs
			List<SlangDefDef> globalDefs = getGumboLibraryFunctionDefs(context, true);

			IScope fullyQualifiedScope = Scopes.scopeFor(globalDefs, sdd -> {
				AadlPackage pack = EcoreUtil2.getContainerOfType(sdd, AadlPackage.class);
				return QualifiedName.create(pack.getName() + "::" + sdd.getName());
			}, localScope);

			return fullyQualifiedScope;

		} else {
			return IScope.NULLSCOPE;
		}
	}

	public EList<SlangDefDef> getGumboLibraryFunctionDefs(EObject context, boolean includeImported) {
		EList<AadlPackage> packages = new BasicEList<>();

		// Add parent package
		AadlPackage currentPackage = EcoreUtil2.getContainerOfType(context, AadlPackage.class);
		if (currentPackage != null) {
			packages.add(currentPackage);
		}

		// Optionally include imported packages
		if (includeImported) {
			PackageSection section = EcoreUtil2.getContainerOfType(context, PackageSection.class);
			if (section != null && section.getImportedUnits() != null) {
				List<AadlPackage> imported = section.getImportedUnits()
						.stream()
						.filter(unit -> unit instanceof AadlPackage)
						.map(unit -> (AadlPackage) unit)
						.filter(pkg -> pkg.getOwnedPublicSection() != null)
						.collect(Collectors.toList());
				packages.addAll(imported);
			}
		}

		EList<SlangDefDef> result = new BasicEList<>();

		List<SlangDefDef> funcSpecs = packages.stream()
				.map(pkg -> pkg.getOwnedPublicSection().getOwnedMembers())
				.flatMap(List::stream)
				.filter(m -> m instanceof DefaultAnnexLibrary)
				.map(m -> (DefaultAnnexLibrary) m)
				.filter(dal -> dal.getParsedAnnexLibrary() instanceof GumboLibrary)
				.map(dal -> (GumboLibrary) dal.getParsedAnnexLibrary())
				.map(lib -> lib.getFunctions() != null ? lib.getFunctions().getSpecs() : List.<SlangDefDef> of())
				.flatMap(List::stream)
				.map(m -> (SlangDefDef) m)
				.collect(Collectors.toList());

		result.addAll(funcSpecs);

		return result;
	}

	IScope getEventPortScope(EObject context, EReference reference, List<DirectionType> directions) {
		return getPortsScope(context, reference, Arrays.asList(PortCategory.EVENT, PortCategory.EVENT_DATA),
				directions);
	}

	IScope getPortsScope(EObject context, EReference reference, //
			List<PortCategory> categories, List<DirectionType> directions) {
		if (context == null) {
			return IScope.NULLSCOPE;
		}

		Classifier classifier = EcoreUtil2.getContainerOfType(context, Classifier.class);
		if (classifier == null) {
			return IScope.NULLSCOPE;
		}

		// Gather all relevant features
		List<EObject> allFeatures = new ArrayList<>(classifier.getAllFeatures());
		if (classifier instanceof ComponentImplementation) {
			allFeatures.addAll(((ComponentImplementation) classifier).getAllInternalFeatures());
		}

		// Filter to ports matching the given categories and directions
		List<Port> scopeMembers = allFeatures.stream()
				.filter(f -> f instanceof Port)
				.map(f -> (Port) f)
				.filter(p -> categories.contains(p.getCategory()))
				.filter(p -> directions.contains(p.getDirection()))
				.collect(Collectors.toList());

		return Scopes.scopeFor(scopeMembers);
	}

	Classifier getClassifierForPreviousOtherDataRefElement(NamedElement previousElement) {
		if (previousElement.eIsProxy()) {
			// Don't provide a scope if the previous element could not be resolved
			return null;
		}

		if (previousElement instanceof Subcomponent) {
			SubcomponentType subcomponentType = PropertiesScopeProvider
					.allSubcomponentType((Subcomponent) previousElement);

			if (subcomponentType instanceof ComponentClassifier) {
				return (ComponentClassifier) subcomponentType;
			} else if (subcomponentType instanceof ComponentPrototype) {
				return ResolvePrototypeUtil.resolveComponentPrototype((ComponentPrototype) subcomponentType,
						previousElement);
			}
		}

		if (previousElement instanceof FeatureGroup) {
			FeatureType featureType = PropertiesScopeProvider.allFeatureType((FeatureGroup) previousElement);

			if (featureType instanceof FeatureGroupType) {
				return (FeatureGroupType) featureType;
			} else if (featureType instanceof FeatureGroupPrototype) {
				return ResolvePrototypeUtil.resolveFeatureGroupPrototype((FeatureGroupPrototype) featureType,
						previousElement);
			}
		}

		return null;
	}

	SubcomponentType getSubcomponentType(EObject e) {
		if (e instanceof DataPort) {
			return ((DataPort) e).getDataFeatureClassifier();
		} else if (e instanceof EventDataPort) {
			return ((EventDataPort) e).getDataFeatureClassifier();
		} else if (e instanceof Subcomponent) {
			return ((Subcomponent) e).getSubcomponentType();
		} else if (e instanceof StateVarDecl) {
			return ((StateVarDecl) e).getTypeName();
		} else if (e instanceof SlangDefParam) {
			SlangType typeName = ((SlangDefParam) e).getTypeName();
			return typeName != null ? typeName.getTypeName() : null;
		} else {
			return null;
		}
	}
}
