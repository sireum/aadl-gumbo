
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
package org.sireum.aadl.gumbo.validation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.validation.Check;
import org.osate.aadl2.Classifier;
import org.osate.aadl2.NamedElement;
import org.osate.aadl2.ComponentImplementation;
import org.osate.aadl2.DataClassifier;
import org.osate.aadl2.SystemImplementation;
import org.osate.aadl2.ThreadClassifier;
import org.sireum.aadl.gumbo.gumbo.GumboPackage;
import org.sireum.aadl.gumbo.gumbo.GumboSubclause;
import org.sireum.aadl.gumbo.gumbo.Composition;
import org.sireum.aadl.gumbo.gumbo.PointAfter;
import org.sireum.aadl.gumbo.gumbo.PointAt;
import org.sireum.aadl.gumbo.gumbo.PointBefore;
import org.sireum.aadl.gumbo.gumbo.PropertyBinding;
import org.sireum.aadl.gumbo.gumbo.SchemaComponentRef;
import org.sireum.aadl.gumbo.gumbo.SchemaElement;
import org.sireum.aadl.gumbo.gumbo.SchemaLabel;
import org.sireum.aadl.gumbo.gumbo.SchemaPoint;
import org.sireum.aadl.gumbo.gumbo.SchemaSequence;
import org.sireum.aadl.gumbo.gumbo.SchemaSplitJoin;
import org.sireum.aadl.gumbo.gumbo.ScheduleComponentAlias;
import org.sireum.aadl.gumbo.gumbo.SchedulePortAlias;
import org.sireum.aadl.gumbo.gumbo.ScheduleStateVarAlias;
import org.sireum.aadl.gumbo.gumbo.SlangDefContract;
import org.sireum.aadl.gumbo.gumbo.SlangDefDef;
import org.sireum.aadl.gumbo.gumbo.SpecSection;

/**
 * This class contains custom validation rules.
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class GumboValidator extends AbstractGumboValidator {

	@Override
	protected boolean isResponsible(Map<Object, Object> context, EObject eObject) {
//		return (eObject.eClass().getEPackage() == AgreePackage.eINSTANCE) || eObject instanceof AadlPackage;
		return eObject.eClass().getEPackage() == GumboPackage.eINSTANCE
				|| super.isResponsible(context, eObject);
	}
	
	@Check
	public void checkSingleSubclause(GumboSubclause gs) {
		Classifier c = EcoreUtil2.getContainerOfType(gs, Classifier.class);
		if (c == null) {
			return;
		}
		List<GumboSubclause> subclauses = EcoreUtil2.eAllOfType(c, GumboSubclause.class);
		if (c instanceof ComponentImplementation) {
			ComponentImplementation ci = (ComponentImplementation) c;
			subclauses.addAll(EcoreUtil2.eAllOfType(ci.getType(), GumboSubclause.class));
		}
		if (subclauses.size() > 1) {
			error("Only one GUMBO subclause annex is allowed per component", gs, null);
		}
	}

	@Check
	public void checkSpecSectionForDataComponent(SpecSection ss) {
		Classifier c = EcoreUtil2.getContainerOfType(ss, Classifier.class);
		if (!(c instanceof DataClassifier)) {
			return;
		}
		if (ss.getState() != null) {
			error("State variables cannot be attached to data components",
					ss, GumboPackage.Literals.SPEC_SECTION__STATE);
		}
		if (ss.getFunctions() != null) {
			error("Functions cannot be attached to data components",
					ss, GumboPackage.Literals.SPEC_SECTION__FUNCTIONS);
		}
		if (ss.getInitialize() != null) {
			error("Initialize clauses cannot be attached to data components",
					ss, GumboPackage.Literals.SPEC_SECTION__INITIALIZE);
		}
		if (ss.getIntegration() != null) {
			error("Integration clauses cannot be attached to data components",
					ss, GumboPackage.Literals.SPEC_SECTION__INTEGRATION);
		}
		if (ss.getCompute() != null) {
			error("Compute clauses cannot be attached to data components",
					ss, GumboPackage.Literals.SPEC_SECTION__COMPUTE);
		}
		if (!ss.getCompositions().isEmpty()) {
			error("Composition blocks cannot be attached to data components",
					ss, GumboPackage.Literals.SPEC_SECTION__COMPOSITIONS);
		}
	}

	@Check
	public void checkSpecSectionForThreadComponent(SpecSection ss) {
		Classifier c = EcoreUtil2.getContainerOfType(ss, Classifier.class);
		if (!(c instanceof ThreadClassifier)) {
			return;
		}
		if (ss.getInvariants() != null) {
			error("Invariants cannot be attached to thread components",
					ss, GumboPackage.Literals.SPEC_SECTION__INVARIANTS);
		}
		if (!ss.getCompositions().isEmpty()) {
			error("Composition blocks cannot be attached to thread components",
					ss, GumboPackage.Literals.SPEC_SECTION__COMPOSITIONS);
		}
	}

	@Check
	public void checkSpecSectionForSystemImplementation(SpecSection ss) {
		Classifier c = EcoreUtil2.getContainerOfType(ss, Classifier.class);
		if (!(c instanceof SystemImplementation)) {
			return;
		}
		if (ss.getState() != null) {
			error("State variables cannot be attached to system implementations",
					ss, GumboPackage.Literals.SPEC_SECTION__STATE);
		}
		if (ss.getInvariants() != null) {
			error("Invariants cannot be attached to system implementations",
					ss, GumboPackage.Literals.SPEC_SECTION__INVARIANTS);
		}
		if (ss.getInitialize() != null) {
			error("Initialize clauses cannot be attached to system implementations",
					ss, GumboPackage.Literals.SPEC_SECTION__INITIALIZE);
		}
		if (ss.getCompute() != null) {
			error("Compute clauses cannot be attached to system implementations",
					ss, GumboPackage.Literals.SPEC_SECTION__COMPUTE);
		}
		if (ss.getIntegration() != null) {
			error("Integration clauses cannot be attached to system implementations",
					ss, GumboPackage.Literals.SPEC_SECTION__INTEGRATION);
		}
	}

	@Check
	public void checkSpecSectionComponentKind(SpecSection ss) {
		Classifier c = EcoreUtil2.getContainerOfType(ss, Classifier.class);
		if (c == null) {
			return;
		}
		if (c instanceof DataClassifier || c instanceof ThreadClassifier || c instanceof SystemImplementation) {
			return;
		}
		error("GUMBO subclauses can only be attached to thread, data, and system implementation components",
				ss, null);
	}

	@Check
	public void checkMethodModifiers(SlangDefDef def) {
		String mod = def.getDefMods();
		boolean isSpec = "@spec".equals(mod);
		boolean isPure = "@pure".equals(mod);
		boolean isStrictpure = "@strictpure".equals(mod);

		boolean hasContract = false;
		SlangDefContract mc = def.getMethodContract();
		if (mc != null) {
			hasContract = mc.getReads() != null || mc.getRequires() != null
					|| mc.getModifies() != null || mc.getEnsures() != null;
		}
		boolean hasBody = def.getBody() != null;

		if (hasContract) {
			if (isSpec || isStrictpure) {
				error("Only @pure methods can have contracts",
						def, GumboPackage.Literals.SLANG_DEF_DEF__DEF_MODS);
			}
			if (!hasBody) {
				error("Methods with contracts must have a body",
						def, GumboPackage.Literals.SLANG_DEF_DEF__NAME);
			}
		} else if (hasBody) {
			if (isPure) {
				error("@pure methods must have a contract",
						def, GumboPackage.Literals.SLANG_DEF_DEF__DEF_MODS);
			}
			if (isSpec) {
				error("@spec methods cannot have a body",
						def, GumboPackage.Literals.SLANG_DEF_DEF__DEF_MODS);
			}
		} else {
			if (isPure) {
				error("@pure methods must have a contract and a body",
						def, GumboPackage.Literals.SLANG_DEF_DEF__DEF_MODS);
			}
			if (isStrictpure) {
				error("@strictpure methods must have a body",
						def, GumboPackage.Literals.SLANG_DEF_DEF__DEF_MODS);
			}
		}
	}

	@Check
	public void checkCompositionIdUniqueness(SpecSection ss) {
		Set<String> seen = new HashSet<>();
		for (Composition c : ss.getCompositions()) {
			if (!seen.add(c.getId())) {
				error("Duplicate composition id: " + c.getId(),
						c, GumboPackage.Literals.COMPOSITION__ID);
			}
		}
	}

	@Check
	public void checkCompositionAliasUniqueness(Composition composition) {
		Set<String> seen = new HashSet<>();

		if (composition.getComponentAliases() != null) {
			for (ScheduleComponentAlias alias : composition.getComponentAliases().getAliases()) {
				if (!seen.add(alias.getName())) {
					error("Duplicate alias name: " + alias.getName(),
							alias, GumboPackage.Literals.SCHEDULE_COMPONENT_ALIAS__NAME);
				}
			}
		}

		if (composition.getPortAliases() != null) {
			for (SchedulePortAlias alias : composition.getPortAliases().getAliases()) {
				if (!seen.add(alias.getName())) {
					error("Duplicate alias name: " + alias.getName(),
							alias, GumboPackage.Literals.SCHEDULE_PORT_ALIAS__NAME);
				}
			}
		}

		if (composition.getStateVarAliases() != null) {
			for (ScheduleStateVarAlias alias : composition.getStateVarAliases().getAliases()) {
				if (!seen.add(alias.getName())) {
					error("Duplicate alias name: " + alias.getName(),
							alias, GumboPackage.Literals.SCHEDULE_STATE_VAR_ALIAS__NAME);
				}
			}
		}
	}
	// Schema labels (place labels and occurrence labels) share one namespace per
	// composition: they must be unique, must not be the reserved point names
	// START/END, and must not overlap any component/port/state-var alias (aliases
	// name expression variables and occurrence ids; a label shadowing one would
	// make 'at'/'before'/'after' references ambiguous to readers).
	@Check
	public void checkCompositionLabelUniqueness(Composition composition) {
		Set<String> labels = new HashSet<>();

		Set<String> aliases = new HashSet<>();
		if (composition.getComponentAliases() != null) {
			for (ScheduleComponentAlias a : composition.getComponentAliases().getAliases()) {
				aliases.add(a.getName());
			}
		}
		if (composition.getPortAliases() != null) {
			for (SchedulePortAlias a : composition.getPortAliases().getAliases()) {
				aliases.add(a.getName());
			}
		}
		if (composition.getStateVarAliases() != null) {
			for (ScheduleStateVarAlias a : composition.getStateVarAliases().getAliases()) {
				aliases.add(a.getName());
			}
		}

		if (composition.getSchema() != null) {
			checkSchemaElementLabels(composition.getSchema().getElements(), labels, aliases);
		}
	}

	private void checkSchemaElementLabels(List<SchemaElement> elements, Set<String> labels, Set<String> aliases) {
		for (SchemaElement e : elements) {
			if (e instanceof SchemaLabel) {
				SchemaLabel l = (SchemaLabel) e;
				validateSchemaLabel(l.getId(), l, GumboPackage.Literals.SCHEMA_LABEL__ID, labels, aliases);
			} else if (e instanceof SchemaComponentRef) {
				SchemaComponentRef cr = (SchemaComponentRef) e;
				if (cr.getOccurrenceLabel() != null) {
					validateSchemaLabel(cr.getOccurrenceLabel(), cr,
							GumboPackage.Literals.SCHEMA_COMPONENT_REF__OCCURRENCE_LABEL, labels, aliases);
				}
			} else if (e instanceof SchemaSplitJoin) {
				for (SchemaSequence branch : ((SchemaSplitJoin) e).getBranches()) {
					checkSchemaElementLabels(branch.getElements(), labels, aliases);
				}
			}
		}
	}

	private void validateSchemaLabel(String id, EObject obj, EStructuralFeature feature,
			Set<String> labels, Set<String> aliases) {
		if ("START".equals(id) || "END".equals(id)) {
			error("Label '" + id + "' is reserved (START and END name the schedule's start/end places)",
					obj, feature);
		} else if (!labels.add(id)) {
			error("Duplicate schema label: " + id, obj, feature);
		}
		if (aliases.contains(id)) {
			error("Schema label '" + id + "' collides with a component/port/state-var alias",
					obj, feature);
		}
	}
	// Point references must resolve against the containing composition's schema:
	// 'at' takes START/END or a place label; 'before'/'after' take an occurrence
	// label or the name of a component that is dispatched exactly once per
	// hyperperiod (mirrors the kekinian ScheduleNextRel.resolvePoint semantics,
	// reported here for in-editor feedback).
	@Check
	public void checkSchemaPointResolution(PropertyBinding binding) {
		Composition composition = EcoreUtil2.getContainerOfType(binding, Composition.class);
		if (composition == null || composition.getSchema() == null || binding.getPoint() == null) {
			return;
		}
		Set<String> placeLabels = new HashSet<>();
		Set<String> occurrenceLabels = new HashSet<>();
		Map<String, Integer> occurrenceCounts = new HashMap<>();
		collectSchemaNames(composition.getSchema().getElements(), placeLabels, occurrenceLabels, occurrenceCounts);

		SchemaPoint point = binding.getPoint();
		if (point instanceof PointAt) {
			String l = ((PointAt) point).getLabel();
			if (!"START".equals(l) && !"END".equals(l) && !placeLabels.contains(l)) {
				error("'" + l + "' does not name a schema label (or START/END)",
						point, GumboPackage.Literals.POINT_AT__LABEL);
			}
		} else if (point instanceof PointBefore) {
			checkOccurrenceRef(((PointBefore) point).getOccurrence(), point,
					GumboPackage.Literals.POINT_BEFORE__OCCURRENCE, occurrenceLabels, occurrenceCounts);
		} else if (point instanceof PointAfter) {
			checkOccurrenceRef(((PointAfter) point).getOccurrence(), point,
					GumboPackage.Literals.POINT_AFTER__OCCURRENCE, occurrenceLabels, occurrenceCounts);
		}
	}

	private void checkOccurrenceRef(String occ, EObject obj, EStructuralFeature feature,
			Set<String> occurrenceLabels, Map<String, Integer> occurrenceCounts) {
		if (occurrenceLabels.contains(occ)) {
			return;
		}
		Integer count = occurrenceCounts.get(occ);
		if (count == null) {
			error("'" + occ + "' does not name a component occurrence of the schema",
					obj, feature);
		} else if (count > 1) {
			error("'" + occ + "' is ambiguous: the component is dispatched " + count
					+ " times per hyperperiod; reference an occurrence label instead",
					obj, feature);
		}
	}

	private void collectSchemaNames(List<SchemaElement> elements, Set<String> placeLabels,
			Set<String> occurrenceLabels, Map<String, Integer> occurrenceCounts) {
		for (SchemaElement e : elements) {
			if (e instanceof SchemaLabel) {
				placeLabels.add(((SchemaLabel) e).getId());
			} else if (e instanceof SchemaComponentRef) {
				SchemaComponentRef cr = (SchemaComponentRef) e;
				if (cr.getOccurrenceLabel() != null) {
					occurrenceLabels.add(cr.getOccurrenceLabel());
				}
				String name = componentRefName(cr);
				if (name != null) {
					occurrenceCounts.merge(name, 1, Integer::sum);
				}
			} else if (e instanceof SchemaSplitJoin) {
				for (SchemaSequence branch : ((SchemaSplitJoin) e).getBranches()) {
					collectSchemaNames(branch.getElements(), placeLabels, occurrenceLabels, occurrenceCounts);
				}
			}
		}
	}

	private String componentRefName(SchemaComponentRef cr) {
		EObject c = cr.getComponent();
		if (c instanceof ScheduleComponentAlias) {
			return ((ScheduleComponentAlias) c).getName();
		} else if (c instanceof NamedElement) {
			return ((NamedElement) c).getName();
		}
		return null;
	}
}
