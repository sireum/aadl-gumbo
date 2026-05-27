
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

import java.util.List;

import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.validation.Check;
import org.osate.aadl2.Classifier;
import org.osate.aadl2.ComponentImplementation;
import org.osate.aadl2.DataClassifier;
import org.osate.aadl2.SystemImplementation;
import org.osate.aadl2.ThreadClassifier;
import org.sireum.aadl.gumbo.gumbo.GumboPackage;
import org.sireum.aadl.gumbo.gumbo.GumboSubclause;
import org.sireum.aadl.gumbo.gumbo.SlangDefContract;
import org.sireum.aadl.gumbo.gumbo.SlangDefDef;
import org.sireum.aadl.gumbo.gumbo.SpecSection;

/**
 * This class contains custom validation rules.
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class GumboValidator extends AbstractGumboValidator {

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
		if (ss.getSchedule() != null) {
			error("Schedule clauses cannot be attached to data components",
					ss, GumboPackage.Literals.SPEC_SECTION__SCHEDULE);
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
		if (ss.getSchedule() != null) {
			error("Schedule clauses cannot be attached to thread components",
					ss, GumboPackage.Literals.SPEC_SECTION__SCHEDULE);
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
}
