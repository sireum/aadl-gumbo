
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
parser grammar InternalGumboParser;

options {
	tokenVocab=InternalGumboLexer;
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
}

@header {
package org.sireum.aadl.gumbo.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.sireum.aadl.gumbo.services.GumboGrammarAccess;

}
@members {
	private GumboGrammarAccess grammarAccess;
	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
	
	{
		tokenNameToValue.put("LeftParenthesis", "'('");
		tokenNameToValue.put("RightParenthesis", "')'");
		tokenNameToValue.put("Asterisk", "'*'");
		tokenNameToValue.put("PlusSign", "'+'");
		tokenNameToValue.put("Comma", "','");
		tokenNameToValue.put("HyphenMinus", "'-'");
		tokenNameToValue.put("FullStop", "'.'");
		tokenNameToValue.put("Colon", "':'");
		tokenNameToValue.put("Semicolon", "';'");
		tokenNameToValue.put("EqualsSign", "'='");
		tokenNameToValue.put("QuestionMark", "'?'");
		tokenNameToValue.put("F", "'F'");
		tokenNameToValue.put("T", "'T'");
		tokenNameToValue.put("LeftSquareBracket", "'['");
		tokenNameToValue.put("RightSquareBracket", "']'");
		tokenNameToValue.put("KW__", "'_'");
		tokenNameToValue.put("LeftCurlyBracket", "'{'");
		tokenNameToValue.put("RightCurlyBracket", "'}'");
		tokenNameToValue.put("ForAll", "'\u2200'");
		tokenNameToValue.put("ThereExists", "'\u2203'");
		tokenNameToValue.put("FullStopFullStop", "'..'");
		tokenNameToValue.put("ColonColon", "'::'");
		tokenNameToValue.put("ColonEqualsSign", "':='");
		tokenNameToValue.put("LessThanSignColon", "'<:'");
		tokenNameToValue.put("EqualsSignGreaterThanSign", "'=>'");
		tokenNameToValue.put("In_1", "'In'");
		tokenNameToValue.put("By", "'by'");
		tokenNameToValue.put("Do", "'do'");
		tokenNameToValue.put("If", "'if'");
		tokenNameToValue.put("In_1", "'in'");
		tokenNameToValue.put("To", "'to'");
		tokenNameToValue.put("PlusSignEqualsSignGreaterThanSign", "'+=>'");
		tokenNameToValue.put("HyphenMinusGreaterThanSignColon", "'->:'");
		tokenNameToValue.put("FullStopFullStopLessThanSign", "'..<'");
		tokenNameToValue.put("Def", "'def'");
		tokenNameToValue.put("For", "'for'");
		tokenNameToValue.put("Inv", "'inv'");
		tokenNameToValue.put("Mut", "'mut'");
		tokenNameToValue.put("Val", "'val'");
		tokenNameToValue.put("Var", "'var'");
		tokenNameToValue.put("All", "'\\all'");
		tokenNameToValue.put("Case", "'case'");
		tokenNameToValue.put("Else", "'else'");
		tokenNameToValue.put("Enum", "'enum'");
		tokenNameToValue.put("Halt", "'halt'");
		tokenNameToValue.put("Spec", "'spec'");
		tokenNameToValue.put("True", "'true'");
		tokenNameToValue.put("Some", "'\\some'");
		tokenNameToValue.put("Cases", "'cases'");
		tokenNameToValue.put("Delta", "'delta'");
		tokenNameToValue.put("False", "'false'");
		tokenNameToValue.put("Gumbo", "'gumbo'");
		tokenNameToValue.put("Match", "'match'");
		tokenNameToValue.put("Modes", "'modes'");
		tokenNameToValue.put("Reads", "'reads'");
		tokenNameToValue.put("State", "'state'");
		tokenNameToValue.put("While", "'while'");
		tokenNameToValue.put("Yield", "'yield'");
		tokenNameToValue.put("Assert", "'assert'");
		tokenNameToValue.put("Assume", "'assume'");
		tokenNameToValue.put("Handle", "'handle'");
		tokenNameToValue.put("Return", "'return'");
		tokenNameToValue.put("Strict", "'strict'");
		tokenNameToValue.put("MaySend", "'MaySend'");
		tokenNameToValue.put("Applies", "'applies'");
		tokenNameToValue.put("Binding", "'binding'");
		tokenNameToValue.put("Compute", "'compute'");
		tokenNameToValue.put("Ensures", "'ensures'");
		tokenNameToValue.put("Library", "'library'");
		tokenNameToValue.put("Memoize", "'memoize'");
		tokenNameToValue.put("MustSend", "'MustSend'");
		tokenNameToValue.put("Constant", "'constant'");
		tokenNameToValue.put("Modifies", "'modifies'");
		tokenNameToValue.put("Requires", "'requires'");
		tokenNameToValue.put("Extension", "'extension'");
		tokenNameToValue.put("Functions", "'functions'");
		tokenNameToValue.put("Guarantee", "'guarantee'");
		tokenNameToValue.put("Invariant", "'invariant'");
		tokenNameToValue.put("Reference", "'reference'");
		tokenNameToValue.put("Classifier", "'classifier'");
		tokenNameToValue.put("Initialize", "'initialize'");
		tokenNameToValue.put("Invariants", "'invariants'");
		tokenNameToValue.put("Integration", "'integration'");
	}

	public void setGrammarAccess(GumboGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		String result = tokenNameToValue.get(tokenName);
		if (result == null)
			result = tokenName;
		return result;
	}
}

// Entry rule entryRuleAnnexLibrary
entryRuleAnnexLibrary
:
{ before(grammarAccess.getAnnexLibraryRule()); }
	 ruleAnnexLibrary
{ after(grammarAccess.getAnnexLibraryRule()); } 
	 EOF 
;

// Rule AnnexLibrary
ruleAnnexLibrary 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAnnexLibraryAccess().getGumboLibraryParserRuleCall()); }
		ruleGumboLibrary
		{ after(grammarAccess.getAnnexLibraryAccess().getGumboLibraryParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGumboLibrary
entryRuleGumboLibrary
:
{ before(grammarAccess.getGumboLibraryRule()); }
	 ruleGumboLibrary
{ after(grammarAccess.getGumboLibraryRule()); } 
	 EOF 
;

// Rule GumboLibrary
ruleGumboLibrary 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGumboLibraryAccess().getGroup()); }
		(rule__GumboLibrary__Group__0)
		{ after(grammarAccess.getGumboLibraryAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGumboSubclause
entryRuleGumboSubclause
:
{ before(grammarAccess.getGumboSubclauseRule()); }
	 ruleGumboSubclause
{ after(grammarAccess.getGumboSubclauseRule()); } 
	 EOF 
;

// Rule GumboSubclause
ruleGumboSubclause 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGumboSubclauseAccess().getGroup()); }
		(rule__GumboSubclause__Group__0)
		{ after(grammarAccess.getGumboSubclauseAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSpecSection
entryRuleSpecSection
:
{ before(grammarAccess.getSpecSectionRule()); }
	 ruleSpecSection
{ after(grammarAccess.getSpecSectionRule()); } 
	 EOF 
;

// Rule SpecSection
ruleSpecSection 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSpecSectionAccess().getGroup()); }
		(rule__SpecSection__Group__0)
		{ after(grammarAccess.getSpecSectionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleState
entryRuleState
:
{ before(grammarAccess.getStateRule()); }
	 ruleState
{ after(grammarAccess.getStateRule()); } 
	 EOF 
;

// Rule State
ruleState 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStateAccess().getGroup()); }
		(rule__State__Group__0)
		{ after(grammarAccess.getStateAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStateVarDecl
entryRuleStateVarDecl
:
{ before(grammarAccess.getStateVarDeclRule()); }
	 ruleStateVarDecl
{ after(grammarAccess.getStateVarDeclRule()); } 
	 EOF 
;

// Rule StateVarDecl
ruleStateVarDecl 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStateVarDeclAccess().getGroup()); }
		(rule__StateVarDecl__Group__0)
		{ after(grammarAccess.getStateVarDeclAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInvariants
entryRuleInvariants
:
{ before(grammarAccess.getInvariantsRule()); }
	 ruleInvariants
{ after(grammarAccess.getInvariantsRule()); } 
	 EOF 
;

// Rule Invariants
ruleInvariants 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInvariantsAccess().getGroup()); }
		(rule__Invariants__Group__0)
		{ after(grammarAccess.getInvariantsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInvSpec
entryRuleInvSpec
:
{ before(grammarAccess.getInvSpecRule()); }
	 ruleInvSpec
{ after(grammarAccess.getInvSpecRule()); } 
	 EOF 
;

// Rule InvSpec
ruleInvSpec 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInvSpecAccess().getGroup()); }
		(rule__InvSpec__Group__0)
		{ after(grammarAccess.getInvSpecAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIntegration
entryRuleIntegration
:
{ before(grammarAccess.getIntegrationRule()); }
	 ruleIntegration
{ after(grammarAccess.getIntegrationRule()); } 
	 EOF 
;

// Rule Integration
ruleIntegration 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIntegrationAccess().getGroup()); }
		(rule__Integration__Group__0)
		{ after(grammarAccess.getIntegrationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInitialize
entryRuleInitialize
:
{ before(grammarAccess.getInitializeRule()); }
	 ruleInitialize
{ after(grammarAccess.getInitializeRule()); } 
	 EOF 
;

// Rule Initialize
ruleInitialize 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInitializeAccess().getGroup()); }
		(rule__Initialize__Group__0)
		{ after(grammarAccess.getInitializeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInitializeSpecStatement
entryRuleInitializeSpecStatement
:
{ before(grammarAccess.getInitializeSpecStatementRule()); }
	 ruleInitializeSpecStatement
{ after(grammarAccess.getInitializeSpecStatementRule()); } 
	 EOF 
;

// Rule InitializeSpecStatement
ruleInitializeSpecStatement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInitializeSpecStatementAccess().getGuaranteeStatementAssignment()); }
		(rule__InitializeSpecStatement__GuaranteeStatementAssignment)
		{ after(grammarAccess.getInitializeSpecStatementAccess().getGuaranteeStatementAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCompute
entryRuleCompute
:
{ before(grammarAccess.getComputeRule()); }
	 ruleCompute
{ after(grammarAccess.getComputeRule()); } 
	 EOF 
;

// Rule Compute
ruleCompute 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComputeAccess().getGroup()); }
		(rule__Compute__Group__0)
		{ after(grammarAccess.getComputeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleHandlerClause
entryRuleHandlerClause
:
{ before(grammarAccess.getHandlerClauseRule()); }
	 ruleHandlerClause
{ after(grammarAccess.getHandlerClauseRule()); } 
	 EOF 
;

// Rule HandlerClause
ruleHandlerClause 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getHandlerClauseAccess().getGroup()); }
		(rule__HandlerClause__Group__0)
		{ after(grammarAccess.getHandlerClauseAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCaseStatementClause
entryRuleCaseStatementClause
:
{ before(grammarAccess.getCaseStatementClauseRule()); }
	 ruleCaseStatementClause
{ after(grammarAccess.getCaseStatementClauseRule()); } 
	 EOF 
;

// Rule CaseStatementClause
ruleCaseStatementClause 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCaseStatementClauseAccess().getGroup()); }
		(rule__CaseStatementClause__Group__0)
		{ after(grammarAccess.getCaseStatementClauseAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSpecStatement
entryRuleSpecStatement
:
{ before(grammarAccess.getSpecStatementRule()); }
	 ruleSpecStatement
{ after(grammarAccess.getSpecStatementRule()); } 
	 EOF 
;

// Rule SpecStatement
ruleSpecStatement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSpecStatementAccess().getAlternatives()); }
		(rule__SpecStatement__Alternatives)
		{ after(grammarAccess.getSpecStatementAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAssumeStatement
entryRuleAssumeStatement
:
{ before(grammarAccess.getAssumeStatementRule()); }
	 ruleAssumeStatement
{ after(grammarAccess.getAssumeStatementRule()); } 
	 EOF 
;

// Rule AssumeStatement
ruleAssumeStatement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAssumeStatementAccess().getGroup()); }
		(rule__AssumeStatement__Group__0)
		{ after(grammarAccess.getAssumeStatementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAnonAssumeStatement
entryRuleAnonAssumeStatement
:
{ before(grammarAccess.getAnonAssumeStatementRule()); }
	 ruleAnonAssumeStatement
{ after(grammarAccess.getAnonAssumeStatementRule()); } 
	 EOF 
;

// Rule AnonAssumeStatement
ruleAnonAssumeStatement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAnonAssumeStatementAccess().getGroup()); }
		(rule__AnonAssumeStatement__Group__0)
		{ after(grammarAccess.getAnonAssumeStatementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGuaranteeStatement
entryRuleGuaranteeStatement
:
{ before(grammarAccess.getGuaranteeStatementRule()); }
	 ruleGuaranteeStatement
{ after(grammarAccess.getGuaranteeStatementRule()); } 
	 EOF 
;

// Rule GuaranteeStatement
ruleGuaranteeStatement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGuaranteeStatementAccess().getGroup()); }
		(rule__GuaranteeStatement__Group__0)
		{ after(grammarAccess.getGuaranteeStatementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleImplicationStatement
entryRuleImplicationStatement
:
{ before(grammarAccess.getImplicationStatementRule()); }
	 ruleImplicationStatement
{ after(grammarAccess.getImplicationStatementRule()); } 
	 EOF 
;

// Rule ImplicationStatement
ruleImplicationStatement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getImplicationStatementAccess().getGroup()); }
		(rule__ImplicationStatement__Group__0)
		{ after(grammarAccess.getImplicationStatementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAnonGuaranteeStatement
entryRuleAnonGuaranteeStatement
:
{ before(grammarAccess.getAnonGuaranteeStatementRule()); }
	 ruleAnonGuaranteeStatement
{ after(grammarAccess.getAnonGuaranteeStatementRule()); } 
	 EOF 
;

// Rule AnonGuaranteeStatement
ruleAnonGuaranteeStatement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAnonGuaranteeStatementAccess().getGroup()); }
		(rule__AnonGuaranteeStatement__Group__0)
		{ after(grammarAccess.getAnonGuaranteeStatementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOtherDataRef
entryRuleOtherDataRef
:
{ before(grammarAccess.getOtherDataRefRule()); }
	 ruleOtherDataRef
{ after(grammarAccess.getOtherDataRefRule()); } 
	 EOF 
;

// Rule OtherDataRef
ruleOtherDataRef 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOtherDataRefAccess().getGroup()); }
		(rule__OtherDataRef__Group__0)
		{ after(grammarAccess.getOtherDataRefAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDataElement
entryRuleDataElement
:
{ before(grammarAccess.getDataElementRule()); }
	 ruleDataElement
{ after(grammarAccess.getDataElementRule()); } 
	 EOF 
;

// Rule DataElement
ruleDataElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDataElementAccess().getDataElementAssignment()); }
		(rule__DataElement__DataElementAssignment)
		{ after(grammarAccess.getDataElementAccess().getDataElementAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFunctions
entryRuleFunctions
:
{ before(grammarAccess.getFunctionsRule()); }
	 ruleFunctions
{ after(grammarAccess.getFunctionsRule()); } 
	 EOF 
;

// Rule Functions
ruleFunctions 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFunctionsAccess().getGroup()); }
		(rule__Functions__Group__0)
		{ after(grammarAccess.getFunctionsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFuncSpec
entryRuleFuncSpec
:
{ before(grammarAccess.getFuncSpecRule()); }
	 ruleFuncSpec
{ after(grammarAccess.getFuncSpecRule()); } 
	 EOF 
;

// Rule FuncSpec
ruleFuncSpec 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFuncSpecAccess().getGroup()); }
		(rule__FuncSpec__Group__0)
		{ after(grammarAccess.getFuncSpecAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlangDefDecl
entryRuleSlangDefDecl
:
{ before(grammarAccess.getSlangDefDeclRule()); }
	 ruleSlangDefDecl
{ after(grammarAccess.getSlangDefDeclRule()); } 
	 EOF 
;

// Rule SlangDefDecl
ruleSlangDefDecl 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlangDefDeclAccess().getGroup()); }
		(rule__SlangDefDecl__Group__0)
		{ after(grammarAccess.getSlangDefDeclAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlangDefDef
entryRuleSlangDefDef
:
{ before(grammarAccess.getSlangDefDefRule()); }
	 ruleSlangDefDef
{ after(grammarAccess.getSlangDefDefRule()); } 
	 EOF 
;

// Rule SlangDefDef
ruleSlangDefDef 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlangDefDefAccess().getGroup()); }
		(rule__SlangDefDef__Group__0)
		{ after(grammarAccess.getSlangDefDefAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlangDefMods
entryRuleSlangDefMods
:
{ before(grammarAccess.getSlangDefModsRule()); }
	 ruleSlangDefMods
{ after(grammarAccess.getSlangDefModsRule()); } 
	 EOF 
;

// Rule SlangDefMods
ruleSlangDefMods 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlangDefModsAccess().getAlternatives()); }
		(rule__SlangDefMods__Alternatives)
		{ after(grammarAccess.getSlangDefModsAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlangDefExt
entryRuleSlangDefExt
:
{ before(grammarAccess.getSlangDefExtRule()); }
	 ruleSlangDefExt
{ after(grammarAccess.getSlangDefExtRule()); } 
	 EOF 
;

// Rule SlangDefExt
ruleSlangDefExt 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlangDefExtAccess().getGroup()); }
		(rule__SlangDefExt__Group__0)
		{ after(grammarAccess.getSlangDefExtAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlangDefID
entryRuleSlangDefID
:
{ before(grammarAccess.getSlangDefIDRule()); }
	 ruleSlangDefID
{ after(grammarAccess.getSlangDefIDRule()); } 
	 EOF 
;

// Rule SlangDefID
ruleSlangDefID 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlangDefIDAccess().getAlternatives()); }
		(rule__SlangDefID__Alternatives)
		{ after(grammarAccess.getSlangDefIDAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlangDefParams
entryRuleSlangDefParams
:
{ before(grammarAccess.getSlangDefParamsRule()); }
	 ruleSlangDefParams
{ after(grammarAccess.getSlangDefParamsRule()); } 
	 EOF 
;

// Rule SlangDefParams
ruleSlangDefParams 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlangDefParamsAccess().getGroup()); }
		(rule__SlangDefParams__Group__0)
		{ after(grammarAccess.getSlangDefParamsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlangDefParam
entryRuleSlangDefParam
:
{ before(grammarAccess.getSlangDefParamRule()); }
	 ruleSlangDefParam
{ after(grammarAccess.getSlangDefParamRule()); } 
	 EOF 
;

// Rule SlangDefParam
ruleSlangDefParam 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlangDefParamAccess().getGroup()); }
		(rule__SlangDefParam__Group__0)
		{ after(grammarAccess.getSlangDefParamAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlangTypeParams
entryRuleSlangTypeParams
:
{ before(grammarAccess.getSlangTypeParamsRule()); }
	 ruleSlangTypeParams
{ after(grammarAccess.getSlangTypeParamsRule()); } 
	 EOF 
;

// Rule SlangTypeParams
ruleSlangTypeParams 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlangTypeParamsAccess().getGroup()); }
		(rule__SlangTypeParams__Group__0)
		{ after(grammarAccess.getSlangTypeParamsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlangTypeParam
entryRuleSlangTypeParam
:
{ before(grammarAccess.getSlangTypeParamRule()); }
	 ruleSlangTypeParam
{ after(grammarAccess.getSlangTypeParamRule()); } 
	 EOF 
;

// Rule SlangTypeParam
ruleSlangTypeParam 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlangTypeParamAccess().getGroup()); }
		(rule__SlangTypeParam__Group__0)
		{ after(grammarAccess.getSlangTypeParamAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlangDefContract
entryRuleSlangDefContract
:
{ before(grammarAccess.getSlangDefContractRule()); }
	 ruleSlangDefContract
{ after(grammarAccess.getSlangDefContractRule()); } 
	 EOF 
;

// Rule SlangDefContract
ruleSlangDefContract 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlangDefContractAccess().getGroup()); }
		(rule__SlangDefContract__Group__0)
		{ after(grammarAccess.getSlangDefContractAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlangDefContractCase
entryRuleSlangDefContractCase
:
{ before(grammarAccess.getSlangDefContractCaseRule()); }
	 ruleSlangDefContractCase
{ after(grammarAccess.getSlangDefContractCaseRule()); } 
	 EOF 
;

// Rule SlangDefContractCase
ruleSlangDefContractCase 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlangDefContractCaseAccess().getGroup()); }
		(rule__SlangDefContractCase__Group__0)
		{ after(grammarAccess.getSlangDefContractCaseAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlangSupr
entryRuleSlangSupr
:
{ before(grammarAccess.getSlangSuprRule()); }
	 ruleSlangSupr
{ after(grammarAccess.getSlangSuprRule()); } 
	 EOF 
;

// Rule SlangSupr
ruleSlangSupr 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlangSuprAccess().getGroup()); }
		(rule__SlangSupr__Group__0)
		{ after(grammarAccess.getSlangSuprAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlangName
entryRuleSlangName
:
{ before(grammarAccess.getSlangNameRule()); }
	 ruleSlangName
{ after(grammarAccess.getSlangNameRule()); } 
	 EOF 
;

// Rule SlangName
ruleSlangName 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlangNameAccess().getGroup()); }
		(rule__SlangName__Group__0)
		{ after(grammarAccess.getSlangNameAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlangInvariant
entryRuleSlangInvariant
:
{ before(grammarAccess.getSlangInvariantRule()); }
	 ruleSlangInvariant
{ after(grammarAccess.getSlangInvariantRule()); } 
	 EOF 
;

// Rule SlangInvariant
ruleSlangInvariant 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlangInvariantAccess().getGroup()); }
		(rule__SlangInvariant__Group__0)
		{ after(grammarAccess.getSlangInvariantAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlangReads
entryRuleSlangReads
:
{ before(grammarAccess.getSlangReadsRule()); }
	 ruleSlangReads
{ after(grammarAccess.getSlangReadsRule()); } 
	 EOF 
;

// Rule SlangReads
ruleSlangReads 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlangReadsAccess().getGroup()); }
		(rule__SlangReads__Group__0)
		{ after(grammarAccess.getSlangReadsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlangRequires
entryRuleSlangRequires
:
{ before(grammarAccess.getSlangRequiresRule()); }
	 ruleSlangRequires
{ after(grammarAccess.getSlangRequiresRule()); } 
	 EOF 
;

// Rule SlangRequires
ruleSlangRequires 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlangRequiresAccess().getGroup()); }
		(rule__SlangRequires__Group__0)
		{ after(grammarAccess.getSlangRequiresAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlangModifies
entryRuleSlangModifies
:
{ before(grammarAccess.getSlangModifiesRule()); }
	 ruleSlangModifies
{ after(grammarAccess.getSlangModifiesRule()); } 
	 EOF 
;

// Rule SlangModifies
ruleSlangModifies 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlangModifiesAccess().getGroup()); }
		(rule__SlangModifies__Group__0)
		{ after(grammarAccess.getSlangModifiesAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlangEnsures
entryRuleSlangEnsures
:
{ before(grammarAccess.getSlangEnsuresRule()); }
	 ruleSlangEnsures
{ after(grammarAccess.getSlangEnsuresRule()); } 
	 EOF 
;

// Rule SlangEnsures
ruleSlangEnsures 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlangEnsuresAccess().getGroup()); }
		(rule__SlangEnsures__Group__0)
		{ after(grammarAccess.getSlangEnsuresAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlangStmt
entryRuleSlangStmt
:
{ before(grammarAccess.getSlangStmtRule()); }
	 ruleSlangStmt
{ after(grammarAccess.getSlangStmtRule()); } 
	 EOF 
;

// Rule SlangStmt
ruleSlangStmt 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlangStmtAccess().getAlternatives()); }
		(rule__SlangStmt__Alternatives)
		{ after(grammarAccess.getSlangStmtAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlangElse
entryRuleSlangElse
:
{ before(grammarAccess.getSlangElseRule()); }
	 ruleSlangElse
{ after(grammarAccess.getSlangElseRule()); } 
	 EOF 
;

// Rule SlangElse
ruleSlangElse 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlangElseAccess().getGroup()); }
		(rule__SlangElse__Group__0)
		{ after(grammarAccess.getSlangElseAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlangLoopContract
entryRuleSlangLoopContract
:
{ before(grammarAccess.getSlangLoopContractRule()); }
	 ruleSlangLoopContract
{ after(grammarAccess.getSlangLoopContractRule()); } 
	 EOF 
;

// Rule SlangLoopContract
ruleSlangLoopContract 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlangLoopContractAccess().getGroup()); }
		(rule__SlangLoopContract__Group__0)
		{ after(grammarAccess.getSlangLoopContractAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlangLHSSuffix
entryRuleSlangLHSSuffix
:
{ before(grammarAccess.getSlangLHSSuffixRule()); }
	 ruleSlangLHSSuffix
{ after(grammarAccess.getSlangLHSSuffixRule()); } 
	 EOF 
;

// Rule SlangLHSSuffix
ruleSlangLHSSuffix 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlangLHSSuffixAccess().getAlternatives()); }
		(rule__SlangLHSSuffix__Alternatives)
		{ after(grammarAccess.getSlangLHSSuffixAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlangCase
entryRuleSlangCase
:
{ before(grammarAccess.getSlangCaseRule()); }
	 ruleSlangCase
{ after(grammarAccess.getSlangCaseRule()); } 
	 EOF 
;

// Rule SlangCase
ruleSlangCase 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlangCaseAccess().getGroup()); }
		(rule__SlangCase__Group__0)
		{ after(grammarAccess.getSlangCaseAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlangPattern
entryRuleSlangPattern
:
{ before(grammarAccess.getSlangPatternRule()); }
	 ruleSlangPattern
{ after(grammarAccess.getSlangPatternRule()); } 
	 EOF 
;

// Rule SlangPattern
ruleSlangPattern 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlangPatternAccess().getAlternatives()); }
		(rule__SlangPattern__Alternatives)
		{ after(grammarAccess.getSlangPatternAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlangTPattern
entryRuleSlangTPattern
:
{ before(grammarAccess.getSlangTPatternRule()); }
	 ruleSlangTPattern
{ after(grammarAccess.getSlangTPatternRule()); } 
	 EOF 
;

// Rule SlangTPattern
ruleSlangTPattern 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlangTPatternAccess().getAlternatives()); }
		(rule__SlangTPattern__Alternatives)
		{ after(grammarAccess.getSlangTPatternAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlangVarDef
entryRuleSlangVarDef
:
{ before(grammarAccess.getSlangVarDefRule()); }
	 ruleSlangVarDef
{ after(grammarAccess.getSlangVarDefRule()); } 
	 EOF 
;

// Rule SlangVarDef
ruleSlangVarDef 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlangVarDefAccess().getGroup()); }
		(rule__SlangVarDef__Group__0)
		{ after(grammarAccess.getSlangVarDefAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlangVarMod
entryRuleSlangVarMod
:
{ before(grammarAccess.getSlangVarModRule()); }
	 ruleSlangVarMod
{ after(grammarAccess.getSlangVarModRule()); } 
	 EOF 
;

// Rule SlangVarMod
ruleSlangVarMod 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlangVarModAccess().getAlternatives()); }
		(rule__SlangVarMod__Alternatives)
		{ after(grammarAccess.getSlangVarModAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExpr
entryRuleExpr
:
{ before(grammarAccess.getExprRule()); }
	 ruleExpr
{ after(grammarAccess.getExprRule()); } 
	 EOF 
;

// Rule Expr
ruleExpr 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExprAccess().getAlternatives()); }
		(rule__Expr__Alternatives)
		{ after(grammarAccess.getExprAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlangQuantVar
entryRuleSlangQuantVar
:
{ before(grammarAccess.getSlangQuantVarRule()); }
	 ruleSlangQuantVar
{ after(grammarAccess.getSlangQuantVarRule()); } 
	 EOF 
;

// Rule SlangQuantVar
ruleSlangQuantVar 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlangQuantVarAccess().getGroup()); }
		(rule__SlangQuantVar__Group__0)
		{ after(grammarAccess.getSlangQuantVarAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlangBlock
entryRuleSlangBlock
:
{ before(grammarAccess.getSlangBlockRule()); }
	 ruleSlangBlock
{ after(grammarAccess.getSlangBlockRule()); } 
	 EOF 
;

// Rule SlangBlock
ruleSlangBlock 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlangBlockAccess().getGroup()); }
		(rule__SlangBlock__Group__0)
		{ after(grammarAccess.getSlangBlockAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlangAccess
entryRuleSlangAccess
:
{ before(grammarAccess.getSlangAccessRule()); }
	 ruleSlangAccess
{ after(grammarAccess.getSlangAccessRule()); } 
	 EOF 
;

// Rule SlangAccess
ruleSlangAccess 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlangAccessAccess().getGroup()); }
		(rule__SlangAccess__Group__0)
		{ after(grammarAccess.getSlangAccessAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlangTerm
entryRuleSlangTerm
:
{ before(grammarAccess.getSlangTermRule()); }
	 ruleSlangTerm
{ after(grammarAccess.getSlangTermRule()); } 
	 EOF 
;

// Rule SlangTerm
ruleSlangTerm 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlangTermAccess().getAlternatives()); }
		(rule__SlangTerm__Alternatives)
		{ after(grammarAccess.getSlangTermAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlangParams
entryRuleSlangParams
:
{ before(grammarAccess.getSlangParamsRule()); }
	 ruleSlangParams
{ after(grammarAccess.getSlangParamsRule()); } 
	 EOF 
;

// Rule SlangParams
ruleSlangParams 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlangParamsAccess().getGroup()); }
		(rule__SlangParams__Group__0)
		{ after(grammarAccess.getSlangParamsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlangParam
entryRuleSlangParam
:
{ before(grammarAccess.getSlangParamRule()); }
	 ruleSlangParam
{ after(grammarAccess.getSlangParamRule()); } 
	 EOF 
;

// Rule SlangParam
ruleSlangParam 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlangParamAccess().getGroup()); }
		(rule__SlangParam__Group__0)
		{ after(grammarAccess.getSlangParamAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlangForRange
entryRuleSlangForRange
:
{ before(grammarAccess.getSlangForRangeRule()); }
	 ruleSlangForRange
{ after(grammarAccess.getSlangForRangeRule()); } 
	 EOF 
;

// Rule SlangForRange
ruleSlangForRange 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlangForRangeAccess().getGroup()); }
		(rule__SlangForRange__Group__0)
		{ after(grammarAccess.getSlangForRangeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlangRet
entryRuleSlangRet
:
{ before(grammarAccess.getSlangRetRule()); }
	 ruleSlangRet
{ after(grammarAccess.getSlangRetRule()); } 
	 EOF 
;

// Rule SlangRet
ruleSlangRet 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlangRetAccess().getGroup()); }
		(rule__SlangRet__Group__0)
		{ after(grammarAccess.getSlangRetAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlangCallSuffix
entryRuleSlangCallSuffix
:
{ before(grammarAccess.getSlangCallSuffixRule()); }
	 ruleSlangCallSuffix
{ after(grammarAccess.getSlangCallSuffixRule()); } 
	 EOF 
;

// Rule SlangCallSuffix
ruleSlangCallSuffix 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlangCallSuffixAccess().getAlternatives()); }
		(rule__SlangCallSuffix__Alternatives)
		{ after(grammarAccess.getSlangCallSuffixAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlangCallArgs
entryRuleSlangCallArgs
:
{ before(grammarAccess.getSlangCallArgsRule()); }
	 ruleSlangCallArgs
{ after(grammarAccess.getSlangCallArgsRule()); } 
	 EOF 
;

// Rule SlangCallArgs
ruleSlangCallArgs 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlangCallArgsAccess().getGroup()); }
		(rule__SlangCallArgs__Group__0)
		{ after(grammarAccess.getSlangCallArgsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlangIDExp
entryRuleSlangIDExp
:
{ before(grammarAccess.getSlangIDExpRule()); }
	 ruleSlangIDExp
{ after(grammarAccess.getSlangIDExpRule()); } 
	 EOF 
;

// Rule SlangIDExp
ruleSlangIDExp 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlangIDExpAccess().getGroup()); }
		(rule__SlangIDExp__Group__0)
		{ after(grammarAccess.getSlangIDExpAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlangType
entryRuleSlangType
:
{ before(grammarAccess.getSlangTypeRule()); }
	 ruleSlangType
{ after(grammarAccess.getSlangTypeRule()); } 
	 EOF 
;

// Rule SlangType
ruleSlangType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlangTypeAccess().getSlangBaseTypeParserRuleCall()); }
		ruleSlangBaseType
		{ after(grammarAccess.getSlangTypeAccess().getSlangBaseTypeParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlangBaseType
entryRuleSlangBaseType
:
{ before(grammarAccess.getSlangBaseTypeRule()); }
	 ruleSlangBaseType
{ after(grammarAccess.getSlangBaseTypeRule()); } 
	 EOF 
;

// Rule SlangBaseType
ruleSlangBaseType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlangBaseTypeAccess().getTypeNameAssignment()); }
		(rule__SlangBaseType__TypeNameAssignment)
		{ after(grammarAccess.getSlangBaseTypeAccess().getTypeNameAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlangTypeArgs
entryRuleSlangTypeArgs
:
{ before(grammarAccess.getSlangTypeArgsRule()); }
	 ruleSlangTypeArgs
{ after(grammarAccess.getSlangTypeArgsRule()); } 
	 EOF 
;

// Rule SlangTypeArgs
ruleSlangTypeArgs 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlangTypeArgsAccess().getGroup()); }
		(rule__SlangTypeArgs__Group__0)
		{ after(grammarAccess.getSlangTypeArgsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlangLit
entryRuleSlangLit
:
{ before(grammarAccess.getSlangLitRule()); }
	 ruleSlangLit
{ after(grammarAccess.getSlangLitRule()); } 
	 EOF 
;

// Rule SlangLit
ruleSlangLit 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlangLitAccess().getAlternatives()); }
		(rule__SlangLit__Alternatives)
		{ after(grammarAccess.getSlangLitAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlangInterp
entryRuleSlangInterp
:
{ before(grammarAccess.getSlangInterpRule()); }
	 ruleSlangInterp
{ after(grammarAccess.getSlangInterpRule()); } 
	 EOF 
;

// Rule SlangInterp
ruleSlangInterp 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlangInterpAccess().getAlternatives()); }
		(rule__SlangInterp__Alternatives)
		{ after(grammarAccess.getSlangInterpAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlangMInterp
entryRuleSlangMInterp
:
{ before(grammarAccess.getSlangMInterpRule()); }
	 ruleSlangMInterp
{ after(grammarAccess.getSlangMInterpRule()); } 
	 EOF 
;

// Rule SlangMInterp
ruleSlangMInterp 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlangMInterpAccess().getGroup()); }
		(rule__SlangMInterp__Group__0)
		{ after(grammarAccess.getSlangMInterpAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOperator
entryRuleOperator
:
{ before(grammarAccess.getOperatorRule()); }
	 ruleOperator
{ after(grammarAccess.getOperatorRule()); } 
	 EOF 
;

// Rule Operator
ruleOperator 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOperatorAccess().getAlternatives()); }
		(rule__Operator__Alternatives)
		{ after(grammarAccess.getOperatorAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleContainedPropertyAssociation
entryRuleContainedPropertyAssociation
:
{ before(grammarAccess.getContainedPropertyAssociationRule()); }
	 ruleContainedPropertyAssociation
{ after(grammarAccess.getContainedPropertyAssociationRule()); } 
	 EOF 
;

// Rule ContainedPropertyAssociation
ruleContainedPropertyAssociation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getContainedPropertyAssociationAccess().getGroup()); }
		(rule__ContainedPropertyAssociation__Group__0)
		{ after(grammarAccess.getContainedPropertyAssociationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleContainmentPath
entryRuleContainmentPath
:
{ before(grammarAccess.getContainmentPathRule()); }
	 ruleContainmentPath
{ after(grammarAccess.getContainmentPathRule()); } 
	 EOF 
;

// Rule ContainmentPath
ruleContainmentPath 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getContainmentPathAccess().getPathAssignment()); }
		(rule__ContainmentPath__PathAssignment)
		{ after(grammarAccess.getContainmentPathAccess().getPathAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOptionalModalPropertyValue
entryRuleOptionalModalPropertyValue
:
{ before(grammarAccess.getOptionalModalPropertyValueRule()); }
	 ruleOptionalModalPropertyValue
{ after(grammarAccess.getOptionalModalPropertyValueRule()); } 
	 EOF 
;

// Rule OptionalModalPropertyValue
ruleOptionalModalPropertyValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOptionalModalPropertyValueAccess().getGroup()); }
		(rule__OptionalModalPropertyValue__Group__0)
		{ after(grammarAccess.getOptionalModalPropertyValueAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePropertyValue
entryRulePropertyValue
:
{ before(grammarAccess.getPropertyValueRule()); }
	 rulePropertyValue
{ after(grammarAccess.getPropertyValueRule()); } 
	 EOF 
;

// Rule PropertyValue
rulePropertyValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPropertyValueAccess().getOwnedValueAssignment()); }
		(rule__PropertyValue__OwnedValueAssignment)
		{ after(grammarAccess.getPropertyValueAccess().getOwnedValueAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePropertyExpression
entryRulePropertyExpression
:
{ before(grammarAccess.getPropertyExpressionRule()); }
	 rulePropertyExpression
{ after(grammarAccess.getPropertyExpressionRule()); } 
	 EOF 
;

// Rule PropertyExpression
rulePropertyExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPropertyExpressionAccess().getAlternatives()); }
		(rule__PropertyExpression__Alternatives)
		{ after(grammarAccess.getPropertyExpressionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleLiteralorReferenceTerm
entryRuleLiteralorReferenceTerm
:
{ before(grammarAccess.getLiteralorReferenceTermRule()); }
	 ruleLiteralorReferenceTerm
{ after(grammarAccess.getLiteralorReferenceTermRule()); } 
	 EOF 
;

// Rule LiteralorReferenceTerm
ruleLiteralorReferenceTerm 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLiteralorReferenceTermAccess().getNamedValueAssignment()); }
		(rule__LiteralorReferenceTerm__NamedValueAssignment)
		{ after(grammarAccess.getLiteralorReferenceTermAccess().getNamedValueAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBooleanLiteral
entryRuleBooleanLiteral
:
{ before(grammarAccess.getBooleanLiteralRule()); }
	 ruleBooleanLiteral
{ after(grammarAccess.getBooleanLiteralRule()); } 
	 EOF 
;

// Rule BooleanLiteral
ruleBooleanLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBooleanLiteralAccess().getGroup()); }
		(rule__BooleanLiteral__Group__0)
		{ after(grammarAccess.getBooleanLiteralAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleConstantValue
entryRuleConstantValue
:
{ before(grammarAccess.getConstantValueRule()); }
	 ruleConstantValue
{ after(grammarAccess.getConstantValueRule()); } 
	 EOF 
;

// Rule ConstantValue
ruleConstantValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConstantValueAccess().getNamedValueAssignment()); }
		(rule__ConstantValue__NamedValueAssignment)
		{ after(grammarAccess.getConstantValueAccess().getNamedValueAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleReferenceTerm
entryRuleReferenceTerm
:
{ before(grammarAccess.getReferenceTermRule()); }
	 ruleReferenceTerm
{ after(grammarAccess.getReferenceTermRule()); } 
	 EOF 
;

// Rule ReferenceTerm
ruleReferenceTerm 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getReferenceTermAccess().getGroup()); }
		(rule__ReferenceTerm__Group__0)
		{ after(grammarAccess.getReferenceTermAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRecordTerm
entryRuleRecordTerm
:
{ before(grammarAccess.getRecordTermRule()); }
	 ruleRecordTerm
{ after(grammarAccess.getRecordTermRule()); } 
	 EOF 
;

// Rule RecordTerm
ruleRecordTerm 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRecordTermAccess().getGroup()); }
		(rule__RecordTerm__Group__0)
		{ after(grammarAccess.getRecordTermAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleComputedTerm
entryRuleComputedTerm
:
{ before(grammarAccess.getComputedTermRule()); }
	 ruleComputedTerm
{ after(grammarAccess.getComputedTermRule()); } 
	 EOF 
;

// Rule ComputedTerm
ruleComputedTerm 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComputedTermAccess().getGroup()); }
		(rule__ComputedTerm__Group__0)
		{ after(grammarAccess.getComputedTermAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleComponentClassifierTerm
entryRuleComponentClassifierTerm
:
{ before(grammarAccess.getComponentClassifierTermRule()); }
	 ruleComponentClassifierTerm
{ after(grammarAccess.getComponentClassifierTermRule()); } 
	 EOF 
;

// Rule ComponentClassifierTerm
ruleComponentClassifierTerm 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComponentClassifierTermAccess().getGroup()); }
		(rule__ComponentClassifierTerm__Group__0)
		{ after(grammarAccess.getComponentClassifierTermAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleListTerm
entryRuleListTerm
:
{ before(grammarAccess.getListTermRule()); }
	 ruleListTerm
{ after(grammarAccess.getListTermRule()); } 
	 EOF 
;

// Rule ListTerm
ruleListTerm 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getListTermAccess().getGroup()); }
		(rule__ListTerm__Group__0)
		{ after(grammarAccess.getListTermAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFieldPropertyAssociation
entryRuleFieldPropertyAssociation
:
{ before(grammarAccess.getFieldPropertyAssociationRule()); }
	 ruleFieldPropertyAssociation
{ after(grammarAccess.getFieldPropertyAssociationRule()); } 
	 EOF 
;

// Rule FieldPropertyAssociation
ruleFieldPropertyAssociation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFieldPropertyAssociationAccess().getGroup()); }
		(rule__FieldPropertyAssociation__Group__0)
		{ after(grammarAccess.getFieldPropertyAssociationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleContainmentPathElement
entryRuleContainmentPathElement
:
{ before(grammarAccess.getContainmentPathElementRule()); }
	 ruleContainmentPathElement
{ after(grammarAccess.getContainmentPathElementRule()); } 
	 EOF 
;

// Rule ContainmentPathElement
ruleContainmentPathElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getContainmentPathElementAccess().getGroup()); }
		(rule__ContainmentPathElement__Group__0)
		{ after(grammarAccess.getContainmentPathElementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePlusMinus
entryRulePlusMinus
:
{ before(grammarAccess.getPlusMinusRule()); }
	 rulePlusMinus
{ after(grammarAccess.getPlusMinusRule()); } 
	 EOF 
;

// Rule PlusMinus
rulePlusMinus 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPlusMinusAccess().getAlternatives()); }
		(rule__PlusMinus__Alternatives)
		{ after(grammarAccess.getPlusMinusAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStringTerm
entryRuleStringTerm
:
{ before(grammarAccess.getStringTermRule()); }
	 ruleStringTerm
{ after(grammarAccess.getStringTermRule()); } 
	 EOF 
;

// Rule StringTerm
ruleStringTerm 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStringTermAccess().getValueAssignment()); }
		(rule__StringTerm__ValueAssignment)
		{ after(grammarAccess.getStringTermAccess().getValueAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNoQuoteString
entryRuleNoQuoteString
:
{ before(grammarAccess.getNoQuoteStringRule()); }
	 ruleNoQuoteString
{ after(grammarAccess.getNoQuoteStringRule()); } 
	 EOF 
;

// Rule NoQuoteString
ruleNoQuoteString 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNoQuoteStringAccess().getSTRINGTerminalRuleCall()); }
		RULE_STRING
		{ after(grammarAccess.getNoQuoteStringAccess().getSTRINGTerminalRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleArrayRange
entryRuleArrayRange
:
{ before(grammarAccess.getArrayRangeRule()); }
	 ruleArrayRange
{ after(grammarAccess.getArrayRangeRule()); } 
	 EOF 
;

// Rule ArrayRange
ruleArrayRange 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getArrayRangeAccess().getGroup()); }
		(rule__ArrayRange__Group__0)
		{ after(grammarAccess.getArrayRangeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSignedConstant
entryRuleSignedConstant
:
{ before(grammarAccess.getSignedConstantRule()); }
	 ruleSignedConstant
{ after(grammarAccess.getSignedConstantRule()); } 
	 EOF 
;

// Rule SignedConstant
ruleSignedConstant 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSignedConstantAccess().getGroup()); }
		(rule__SignedConstant__Group__0)
		{ after(grammarAccess.getSignedConstantAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIntegerTerm
entryRuleIntegerTerm
:
{ before(grammarAccess.getIntegerTermRule()); }
	 ruleIntegerTerm
{ after(grammarAccess.getIntegerTermRule()); } 
	 EOF 
;

// Rule IntegerTerm
ruleIntegerTerm 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIntegerTermAccess().getGroup()); }
		(rule__IntegerTerm__Group__0)
		{ after(grammarAccess.getIntegerTermAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSignedInt
entryRuleSignedInt
:
{ before(grammarAccess.getSignedIntRule()); }
	 ruleSignedInt
{ after(grammarAccess.getSignedIntRule()); } 
	 EOF 
;

// Rule SignedInt
ruleSignedInt 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSignedIntAccess().getGroup()); }
		(rule__SignedInt__Group__0)
		{ after(grammarAccess.getSignedIntAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRealTerm
entryRuleRealTerm
:
{ before(grammarAccess.getRealTermRule()); }
	 ruleRealTerm
{ after(grammarAccess.getRealTermRule()); } 
	 EOF 
;

// Rule RealTerm
ruleRealTerm 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRealTermAccess().getGroup()); }
		(rule__RealTerm__Group__0)
		{ after(grammarAccess.getRealTermAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSignedReal
entryRuleSignedReal
:
{ before(grammarAccess.getSignedRealRule()); }
	 ruleSignedReal
{ after(grammarAccess.getSignedRealRule()); } 
	 EOF 
;

// Rule SignedReal
ruleSignedReal 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSignedRealAccess().getGroup()); }
		(rule__SignedReal__Group__0)
		{ after(grammarAccess.getSignedRealAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNumericRangeTerm
entryRuleNumericRangeTerm
:
{ before(grammarAccess.getNumericRangeTermRule()); }
	 ruleNumericRangeTerm
{ after(grammarAccess.getNumericRangeTermRule()); } 
	 EOF 
;

// Rule NumericRangeTerm
ruleNumericRangeTerm 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNumericRangeTermAccess().getGroup()); }
		(rule__NumericRangeTerm__Group__0)
		{ after(grammarAccess.getNumericRangeTermAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNumAlt
entryRuleNumAlt
:
{ before(grammarAccess.getNumAltRule()); }
	 ruleNumAlt
{ after(grammarAccess.getNumAltRule()); } 
	 EOF 
;

// Rule NumAlt
ruleNumAlt 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNumAltAccess().getAlternatives()); }
		(rule__NumAlt__Alternatives)
		{ after(grammarAccess.getNumAltAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAppliesToKeywords
entryRuleAppliesToKeywords
:
{ before(grammarAccess.getAppliesToKeywordsRule()); }
	 ruleAppliesToKeywords
{ after(grammarAccess.getAppliesToKeywordsRule()); } 
	 EOF 
;

// Rule AppliesToKeywords
ruleAppliesToKeywords 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAppliesToKeywordsAccess().getGroup()); }
		(rule__AppliesToKeywords__Group__0)
		{ after(grammarAccess.getAppliesToKeywordsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInBindingKeywords
entryRuleInBindingKeywords
:
{ before(grammarAccess.getInBindingKeywordsRule()); }
	 ruleInBindingKeywords
{ after(grammarAccess.getInBindingKeywordsRule()); } 
	 EOF 
;

// Rule InBindingKeywords
ruleInBindingKeywords 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInBindingKeywordsAccess().getGroup()); }
		(rule__InBindingKeywords__Group__0)
		{ after(grammarAccess.getInBindingKeywordsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInModesKeywords
entryRuleInModesKeywords
:
{ before(grammarAccess.getInModesKeywordsRule()); }
	 ruleInModesKeywords
{ after(grammarAccess.getInModesKeywordsRule()); } 
	 EOF 
;

// Rule InModesKeywords
ruleInModesKeywords 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInModesKeywordsAccess().getGroup()); }
		(rule__InModesKeywords__Group__0)
		{ after(grammarAccess.getInModesKeywordsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleINTVALUE
entryRuleINTVALUE
:
{ before(grammarAccess.getINTVALUERule()); }
	 ruleINTVALUE
{ after(grammarAccess.getINTVALUERule()); } 
	 EOF 
;

// Rule INTVALUE
ruleINTVALUE 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getINTVALUEAccess().getINTEGER_LITTerminalRuleCall()); }
		RULE_INTEGER_LIT
		{ after(grammarAccess.getINTVALUEAccess().getINTEGER_LITTerminalRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQPREF
entryRuleQPREF
:
{ before(grammarAccess.getQPREFRule()); }
	 ruleQPREF
{ after(grammarAccess.getQPREFRule()); } 
	 EOF 
;

// Rule QPREF
ruleQPREF 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQPREFAccess().getGroup()); }
		(rule__QPREF__Group__0)
		{ after(grammarAccess.getQPREFAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQCREF
entryRuleQCREF
:
{ before(grammarAccess.getQCREFRule()); }
	 ruleQCREF
{ after(grammarAccess.getQCREFRule()); } 
	 EOF 
;

// Rule QCREF
ruleQCREF 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQCREFAccess().getGroup()); }
		(rule__QCREF__Group__0)
		{ after(grammarAccess.getQCREFAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSTAR
entryRuleSTAR
:
{ before(grammarAccess.getSTARRule()); }
	 ruleSTAR
{ after(grammarAccess.getSTARRule()); } 
	 EOF 
;

// Rule STAR
ruleSTAR 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSTARAccess().getAsteriskKeyword()); }
		Asterisk
		{ after(grammarAccess.getSTARAccess().getAsteriskKeyword()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compute__Alternatives_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComputeAccess().getGroup_2_0()); }
		(rule__Compute__Group_2_0__0)
		{ after(grammarAccess.getComputeAccess().getGroup_2_0()); }
	)
	|
	(
		(
			{ before(grammarAccess.getComputeAccess().getImplicationsAssignment_2_1()); }
			(rule__Compute__ImplicationsAssignment_2_1)
			{ after(grammarAccess.getComputeAccess().getImplicationsAssignment_2_1()); }
		)
		(
			{ before(grammarAccess.getComputeAccess().getImplicationsAssignment_2_1()); }
			(rule__Compute__ImplicationsAssignment_2_1)*
			{ after(grammarAccess.getComputeAccess().getImplicationsAssignment_2_1()); }
		)
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecStatement__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSpecStatementAccess().getAssumeStatementParserRuleCall_0()); }
		ruleAssumeStatement
		{ after(grammarAccess.getSpecStatementAccess().getAssumeStatementParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getSpecStatementAccess().getGuaranteeStatementParserRuleCall_1()); }
		ruleGuaranteeStatement
		{ after(grammarAccess.getSpecStatementAccess().getGuaranteeStatementParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefMods__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangDefModsAccess().getStrictKeyword_0()); }
		Strict
		{ after(grammarAccess.getSlangDefModsAccess().getStrictKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getSlangDefModsAccess().getMemoizeKeyword_1()); }
		Memoize
		{ after(grammarAccess.getSlangDefModsAccess().getMemoizeKeyword_1()); }
	)
	|
	(
		{ before(grammarAccess.getSlangDefModsAccess().getMutKeyword_2()); }
		Mut
		{ after(grammarAccess.getSlangDefModsAccess().getMutKeyword_2()); }
	)
	|
	(
		{ before(grammarAccess.getSlangDefModsAccess().getSpecKeyword_3()); }
		Spec
		{ after(grammarAccess.getSlangDefModsAccess().getSpecKeyword_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefID__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangDefIDAccess().getIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getSlangDefIDAccess().getIDTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getSlangDefIDAccess().getOperatorParserRuleCall_1()); }
		ruleOperator
		{ after(grammarAccess.getSlangDefIDAccess().getOperatorParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContract__Alternatives_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangDefContractAccess().getGroup_2_0()); }
		(rule__SlangDefContract__Group_2_0__0)
		{ after(grammarAccess.getSlangDefContractAccess().getGroup_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getSlangDefContractAccess().getGroup_2_1()); }
		(rule__SlangDefContract__Group_2_1__0)
		{ after(grammarAccess.getSlangDefContractAccess().getGroup_2_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangStmtAccess().getGroup_0()); }
		(rule__SlangStmt__Group_0__0)
		{ after(grammarAccess.getSlangStmtAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getSlangStmtAccess().getGroup_1()); }
		(rule__SlangStmt__Group_1__0)
		{ after(grammarAccess.getSlangStmtAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getSlangStmtAccess().getGroup_2()); }
		(rule__SlangStmt__Group_2__0)
		{ after(grammarAccess.getSlangStmtAccess().getGroup_2()); }
	)
	|
	(
		{ before(grammarAccess.getSlangStmtAccess().getGroup_3()); }
		(rule__SlangStmt__Group_3__0)
		{ after(grammarAccess.getSlangStmtAccess().getGroup_3()); }
	)
	|
	(
		{ before(grammarAccess.getSlangStmtAccess().getGroup_4()); }
		(rule__SlangStmt__Group_4__0)
		{ after(grammarAccess.getSlangStmtAccess().getGroup_4()); }
	)
	|
	(
		{ before(grammarAccess.getSlangStmtAccess().getGroup_5()); }
		(rule__SlangStmt__Group_5__0)
		{ after(grammarAccess.getSlangStmtAccess().getGroup_5()); }
	)
	|
	(
		{ before(grammarAccess.getSlangStmtAccess().getGroup_6()); }
		(rule__SlangStmt__Group_6__0)
		{ after(grammarAccess.getSlangStmtAccess().getGroup_6()); }
	)
	|
	(
		{ before(grammarAccess.getSlangStmtAccess().getGroup_7()); }
		(rule__SlangStmt__Group_7__0)
		{ after(grammarAccess.getSlangStmtAccess().getGroup_7()); }
	)
	|
	(
		{ before(grammarAccess.getSlangStmtAccess().getGroup_8()); }
		(rule__SlangStmt__Group_8__0)
		{ after(grammarAccess.getSlangStmtAccess().getGroup_8()); }
	)
	|
	(
		{ before(grammarAccess.getSlangStmtAccess().getGroup_9()); }
		(rule__SlangStmt__Group_9__0)
		{ after(grammarAccess.getSlangStmtAccess().getGroup_9()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Alternatives_9_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangStmtAccess().getColonKeyword_9_2_0()); }
		Colon
		{ after(grammarAccess.getSlangStmtAccess().getColonKeyword_9_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getSlangStmtAccess().getGroup_9_2_1()); }
		(rule__SlangStmt__Group_9_2_1__0)
		{ after(grammarAccess.getSlangStmtAccess().getGroup_9_2_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Alternatives_9_2_1_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangStmtAccess().getColonEqualsSignKeyword_9_2_1_1_0_0()); }
		ColonEqualsSign
		{ after(grammarAccess.getSlangStmtAccess().getColonEqualsSignKeyword_9_2_1_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getSlangStmtAccess().getDEFOPTerminalRuleCall_9_2_1_1_0_1()); }
		RULE_DEFOP
		{ after(grammarAccess.getSlangStmtAccess().getDEFOPTerminalRuleCall_9_2_1_1_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangElse__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangElseAccess().getGroup_1_0()); }
		(rule__SlangElse__Group_1_0__0)
		{ after(grammarAccess.getSlangElseAccess().getGroup_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getSlangElseAccess().getSlangBlockParserRuleCall_1_1()); }
		ruleSlangBlock
		{ after(grammarAccess.getSlangElseAccess().getSlangBlockParserRuleCall_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLHSSuffix__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangLHSSuffixAccess().getGroup_0()); }
		(rule__SlangLHSSuffix__Group_0__0)
		{ after(grammarAccess.getSlangLHSSuffixAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getSlangLHSSuffixAccess().getGroup_1()); }
		(rule__SlangLHSSuffix__Group_1__0)
		{ after(grammarAccess.getSlangLHSSuffixAccess().getGroup_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangPattern__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangPatternAccess().getGroup_0()); }
		(rule__SlangPattern__Group_0__0)
		{ after(grammarAccess.getSlangPatternAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getSlangPatternAccess().getGroup_1()); }
		(rule__SlangPattern__Group_1__0)
		{ after(grammarAccess.getSlangPatternAccess().getGroup_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTPattern__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangTPatternAccess().getGroup_0()); }
		(rule__SlangTPattern__Group_0__0)
		{ after(grammarAccess.getSlangTPatternAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getSlangTPatternAccess().getGroup_1()); }
		(rule__SlangTPattern__Group_1__0)
		{ after(grammarAccess.getSlangTPatternAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getSlangTPatternAccess().getGroup_2()); }
		(rule__SlangTPattern__Group_2__0)
		{ after(grammarAccess.getSlangTPatternAccess().getGroup_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTPattern__Alternatives_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangTPatternAccess().getGroup_0_2_0()); }
		(rule__SlangTPattern__Group_0_2_0__0)
		{ after(grammarAccess.getSlangTPatternAccess().getGroup_0_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getSlangTPatternAccess().getGroup_0_2_1()); }
		(rule__SlangTPattern__Group_0_2_1__0)
		{ after(grammarAccess.getSlangTPatternAccess().getGroup_0_2_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangVarMod__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangVarModAccess().getValKeyword_0()); }
		Val
		{ after(grammarAccess.getSlangVarModAccess().getValKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getSlangVarModAccess().getVarKeyword_1()); }
		Var
		{ after(grammarAccess.getSlangVarModAccess().getVarKeyword_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expr__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExprAccess().getGroup_0()); }
		(rule__Expr__Group_0__0)
		{ after(grammarAccess.getExprAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getExprAccess().getGroup_1()); }
		(rule__Expr__Group_1__0)
		{ after(grammarAccess.getExprAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getExprAccess().getGroup_2()); }
		(rule__Expr__Group_2__0)
		{ after(grammarAccess.getExprAccess().getGroup_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expr__Alternatives_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExprAccess().getGroup_0_2_0()); }
		(rule__Expr__Group_0_2_0__0)*
		{ after(grammarAccess.getExprAccess().getGroup_0_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getExprAccess().getGroup_0_2_1()); }
		(rule__Expr__Group_0_2_1__0)
		{ after(grammarAccess.getExprAccess().getGroup_0_2_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expr__Alternatives_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExprAccess().getAllKeyword_1_1_0()); }
		All
		{ after(grammarAccess.getExprAccess().getAllKeyword_1_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getExprAccess().getSomeKeyword_1_1_1()); }
		Some
		{ after(grammarAccess.getExprAccess().getSomeKeyword_1_1_1()); }
	)
	|
	(
		{ before(grammarAccess.getExprAccess().getForAllKeyword_1_1_2()); }
		ForAll
		{ after(grammarAccess.getExprAccess().getForAllKeyword_1_1_2()); }
	)
	|
	(
		{ before(grammarAccess.getExprAccess().getThereExistsKeyword_1_1_3()); }
		ThereExists
		{ after(grammarAccess.getExprAccess().getThereExistsKeyword_1_1_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangQuantVar__Alternatives_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangQuantVarAccess().getFullStopFullStopKeyword_3_0_0()); }
		FullStopFullStop
		{ after(grammarAccess.getSlangQuantVarAccess().getFullStopFullStopKeyword_3_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getSlangQuantVarAccess().getFullStopFullStopLessThanSignKeyword_3_0_1()); }
		FullStopFullStopLessThanSign
		{ after(grammarAccess.getSlangQuantVarAccess().getFullStopFullStopLessThanSignKeyword_3_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangTermAccess().getGroup_0()); }
		(rule__SlangTerm__Group_0__0)
		{ after(grammarAccess.getSlangTermAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getSlangTermAccess().getGroup_1()); }
		(rule__SlangTerm__Group_1__0)
		{ after(grammarAccess.getSlangTermAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getSlangTermAccess().getGroup_2()); }
		(rule__SlangTerm__Group_2__0)
		{ after(grammarAccess.getSlangTermAccess().getGroup_2()); }
	)
	|
	(
		{ before(grammarAccess.getSlangTermAccess().getGroup_3()); }
		(rule__SlangTerm__Group_3__0)
		{ after(grammarAccess.getSlangTermAccess().getGroup_3()); }
	)
	|
	(
		{ before(grammarAccess.getSlangTermAccess().getGroup_4()); }
		(rule__SlangTerm__Group_4__0)
		{ after(grammarAccess.getSlangTermAccess().getGroup_4()); }
	)
	|
	(
		{ before(grammarAccess.getSlangTermAccess().getGroup_5()); }
		(rule__SlangTerm__Group_5__0)
		{ after(grammarAccess.getSlangTermAccess().getGroup_5()); }
	)
	|
	(
		{ before(grammarAccess.getSlangTermAccess().getGroup_6()); }
		(rule__SlangTerm__Group_6__0)
		{ after(grammarAccess.getSlangTermAccess().getGroup_6()); }
	)
	|
	(
		{ before(grammarAccess.getSlangTermAccess().getGroup_7()); }
		(rule__SlangTerm__Group_7__0)
		{ after(grammarAccess.getSlangTermAccess().getGroup_7()); }
	)
	|
	(
		{ before(grammarAccess.getSlangTermAccess().getGroup_8()); }
		(rule__SlangTerm__Group_8__0)
		{ after(grammarAccess.getSlangTermAccess().getGroup_8()); }
	)
	|
	(
		{ before(grammarAccess.getSlangTermAccess().getGroup_9()); }
		(rule__SlangTerm__Group_9__0)
		{ after(grammarAccess.getSlangTermAccess().getGroup_9()); }
	)
	|
	(
		{ before(grammarAccess.getSlangTermAccess().getGroup_10()); }
		(rule__SlangTerm__Group_10__0)
		{ after(grammarAccess.getSlangTermAccess().getGroup_10()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Alternatives_9_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangTermAccess().getBAssignment_9_5_0()); }
		(rule__SlangTerm__BAssignment_9_5_0)
		{ after(grammarAccess.getSlangTermAccess().getBAssignment_9_5_0()); }
	)
	|
	(
		{ before(grammarAccess.getSlangTermAccess().getGroup_9_5_1()); }
		(rule__SlangTerm__Group_9_5_1__0)
		{ after(grammarAccess.getSlangTermAccess().getGroup_9_5_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Alternatives_10_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangTermAccess().getGroup_10_2_0()); }
		(rule__SlangTerm__Group_10_2_0__0)
		{ after(grammarAccess.getSlangTermAccess().getGroup_10_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getSlangTermAccess().getGroup_10_2_1()); }
		(rule__SlangTerm__Group_10_2_1__0)
		{ after(grammarAccess.getSlangTermAccess().getGroup_10_2_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangForRange__Alternatives_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangForRangeAccess().getFullStopFullStopKeyword_3_0_0()); }
		FullStopFullStop
		{ after(grammarAccess.getSlangForRangeAccess().getFullStopFullStopKeyword_3_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getSlangForRangeAccess().getFullStopFullStopLessThanSignKeyword_3_0_1()); }
		FullStopFullStopLessThanSign
		{ after(grammarAccess.getSlangForRangeAccess().getFullStopFullStopLessThanSignKeyword_3_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangCallSuffix__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangCallSuffixAccess().getGroup_0()); }
		(rule__SlangCallSuffix__Group_0__0)
		{ after(grammarAccess.getSlangCallSuffixAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getSlangCallSuffixAccess().getCaAssignment_1()); }
		(rule__SlangCallSuffix__CaAssignment_1)
		{ after(grammarAccess.getSlangCallSuffixAccess().getCaAssignment_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLit__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangLitAccess().getGroup_0()); }
		(rule__SlangLit__Group_0__0)
		{ after(grammarAccess.getSlangLitAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getSlangLitAccess().getGroup_1()); }
		(rule__SlangLit__Group_1__0)
		{ after(grammarAccess.getSlangLitAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getSlangLitAccess().getGroup_2()); }
		(rule__SlangLit__Group_2__0)
		{ after(grammarAccess.getSlangLitAccess().getGroup_2()); }
	)
	|
	(
		{ before(grammarAccess.getSlangLitAccess().getGroup_3()); }
		(rule__SlangLit__Group_3__0)
		{ after(grammarAccess.getSlangLitAccess().getGroup_3()); }
	)
	|
	(
		{ before(grammarAccess.getSlangLitAccess().getGroup_4()); }
		(rule__SlangLit__Group_4__0)
		{ after(grammarAccess.getSlangLitAccess().getGroup_4()); }
	)
	|
	(
		{ before(grammarAccess.getSlangLitAccess().getGroup_5()); }
		(rule__SlangLit__Group_5__0)
		{ after(grammarAccess.getSlangLitAccess().getGroup_5()); }
	)
	|
	(
		{ before(grammarAccess.getSlangLitAccess().getGroup_6()); }
		(rule__SlangLit__Group_6__0)
		{ after(grammarAccess.getSlangLitAccess().getGroup_6()); }
	)
	|
	(
		{ before(grammarAccess.getSlangLitAccess().getGroup_7()); }
		(rule__SlangLit__Group_7__0)
		{ after(grammarAccess.getSlangLitAccess().getGroup_7()); }
	)
	|
	(
		{ before(grammarAccess.getSlangLitAccess().getGroup_8()); }
		(rule__SlangLit__Group_8__0)
		{ after(grammarAccess.getSlangLitAccess().getGroup_8()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLit__ValueAlternatives_0_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangLitAccess().getValueTKeyword_0_1_0_0()); }
		T
		{ after(grammarAccess.getSlangLitAccess().getValueTKeyword_0_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getSlangLitAccess().getValueFKeyword_0_1_0_1()); }
		F
		{ after(grammarAccess.getSlangLitAccess().getValueFKeyword_0_1_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangInterp__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangInterpAccess().getGroup_0()); }
		(rule__SlangInterp__Group_0__0)
		{ after(grammarAccess.getSlangInterpAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getSlangInterpAccess().getGroup_1()); }
		(rule__SlangInterp__Group_1__0)
		{ after(grammarAccess.getSlangInterpAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getSlangInterpAccess().getGroup_2()); }
		(rule__SlangInterp__Group_2__0)
		{ after(grammarAccess.getSlangInterpAccess().getGroup_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangMInterp__Alternatives_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangMInterpAccess().getGroup_3_0()); }
		(rule__SlangMInterp__Group_3_0__0)
		{ after(grammarAccess.getSlangMInterpAccess().getGroup_3_0()); }
	)
	|
	(
		{ before(grammarAccess.getSlangMInterpAccess().getMSPETerminalRuleCall_3_1()); }
		RULE_MSPE
		{ after(grammarAccess.getSlangMInterpAccess().getMSPETerminalRuleCall_3_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Operator__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOperatorAccess().getOPTerminalRuleCall_0()); }
		RULE_OP
		{ after(grammarAccess.getOperatorAccess().getOPTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getOperatorAccess().getPlusMinusParserRuleCall_1()); }
		rulePlusMinus
		{ after(grammarAccess.getOperatorAccess().getPlusMinusParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getOperatorAccess().getSTARParserRuleCall_2()); }
		ruleSTAR
		{ after(grammarAccess.getOperatorAccess().getSTARParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getContainedPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_1_0()); }
		EqualsSignGreaterThanSign
		{ after(grammarAccess.getContainedPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getContainedPropertyAssociationAccess().getAppendAssignment_1_1()); }
		(rule__ContainedPropertyAssociation__AppendAssignment_1_1)
		{ after(grammarAccess.getContainedPropertyAssociationAccess().getAppendAssignment_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyExpression__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyExpressionAccess().getRecordTermParserRuleCall_0()); }
		ruleRecordTerm
		{ after(grammarAccess.getPropertyExpressionAccess().getRecordTermParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyExpressionAccess().getReferenceTermParserRuleCall_1()); }
		ruleReferenceTerm
		{ after(grammarAccess.getPropertyExpressionAccess().getReferenceTermParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyExpressionAccess().getComponentClassifierTermParserRuleCall_2()); }
		ruleComponentClassifierTerm
		{ after(grammarAccess.getPropertyExpressionAccess().getComponentClassifierTermParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyExpressionAccess().getComputedTermParserRuleCall_3()); }
		ruleComputedTerm
		{ after(grammarAccess.getPropertyExpressionAccess().getComputedTermParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyExpressionAccess().getStringTermParserRuleCall_4()); }
		ruleStringTerm
		{ after(grammarAccess.getPropertyExpressionAccess().getStringTermParserRuleCall_4()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyExpressionAccess().getNumericRangeTermParserRuleCall_5()); }
		ruleNumericRangeTerm
		{ after(grammarAccess.getPropertyExpressionAccess().getNumericRangeTermParserRuleCall_5()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyExpressionAccess().getRealTermParserRuleCall_6()); }
		ruleRealTerm
		{ after(grammarAccess.getPropertyExpressionAccess().getRealTermParserRuleCall_6()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyExpressionAccess().getIntegerTermParserRuleCall_7()); }
		ruleIntegerTerm
		{ after(grammarAccess.getPropertyExpressionAccess().getIntegerTermParserRuleCall_7()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyExpressionAccess().getListTermParserRuleCall_8()); }
		ruleListTerm
		{ after(grammarAccess.getPropertyExpressionAccess().getListTermParserRuleCall_8()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyExpressionAccess().getBooleanLiteralParserRuleCall_9()); }
		ruleBooleanLiteral
		{ after(grammarAccess.getPropertyExpressionAccess().getBooleanLiteralParserRuleCall_9()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyExpressionAccess().getLiteralorReferenceTermParserRuleCall_10()); }
		ruleLiteralorReferenceTerm
		{ after(grammarAccess.getPropertyExpressionAccess().getLiteralorReferenceTermParserRuleCall_10()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanLiteral__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBooleanLiteralAccess().getValueAssignment_1_0()); }
		(rule__BooleanLiteral__ValueAssignment_1_0)
		{ after(grammarAccess.getBooleanLiteralAccess().getValueAssignment_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1_1()); }
		False
		{ after(grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusMinus__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPlusMinusAccess().getPlusSignKeyword_0()); }
		PlusSign
		{ after(grammarAccess.getPlusMinusAccess().getPlusSignKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getPlusMinusAccess().getHyphenMinusKeyword_1()); }
		HyphenMinus
		{ after(grammarAccess.getPlusMinusAccess().getHyphenMinusKeyword_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SignedInt__Alternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSignedIntAccess().getPlusSignKeyword_0_0()); }
		PlusSign
		{ after(grammarAccess.getSignedIntAccess().getPlusSignKeyword_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getSignedIntAccess().getHyphenMinusKeyword_0_1()); }
		HyphenMinus
		{ after(grammarAccess.getSignedIntAccess().getHyphenMinusKeyword_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SignedReal__Alternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSignedRealAccess().getPlusSignKeyword_0_0()); }
		PlusSign
		{ after(grammarAccess.getSignedRealAccess().getPlusSignKeyword_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getSignedRealAccess().getHyphenMinusKeyword_0_1()); }
		HyphenMinus
		{ after(grammarAccess.getSignedRealAccess().getHyphenMinusKeyword_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NumAlt__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNumAltAccess().getRealTermParserRuleCall_0()); }
		ruleRealTerm
		{ after(grammarAccess.getNumAltAccess().getRealTermParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getNumAltAccess().getIntegerTermParserRuleCall_1()); }
		ruleIntegerTerm
		{ after(grammarAccess.getNumAltAccess().getIntegerTermParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getNumAltAccess().getSignedConstantParserRuleCall_2()); }
		ruleSignedConstant
		{ after(grammarAccess.getNumAltAccess().getSignedConstantParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getNumAltAccess().getConstantValueParserRuleCall_3()); }
		ruleConstantValue
		{ after(grammarAccess.getNumAltAccess().getConstantValueParserRuleCall_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GumboLibrary__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GumboLibrary__Group__0__Impl
	rule__GumboLibrary__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GumboLibrary__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGumboLibraryAccess().getGumboLibraryAction_0()); }
	()
	{ after(grammarAccess.getGumboLibraryAccess().getGumboLibraryAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GumboLibrary__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GumboLibrary__Group__1__Impl
	rule__GumboLibrary__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GumboLibrary__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGumboLibraryAccess().getLibraryKeyword_1()); }
	Library
	{ after(grammarAccess.getGumboLibraryAccess().getLibraryKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GumboLibrary__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GumboLibrary__Group__2__Impl
	rule__GumboLibrary__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GumboLibrary__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGumboLibraryAccess().getForKeyword_2()); }
	For
	{ after(grammarAccess.getGumboLibraryAccess().getForKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GumboLibrary__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GumboLibrary__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GumboLibrary__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGumboLibraryAccess().getGumboKeyword_3()); }
	Gumbo
	{ after(grammarAccess.getGumboLibraryAccess().getGumboKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GumboSubclause__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GumboSubclause__Group__0__Impl
	rule__GumboSubclause__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GumboSubclause__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGumboSubclauseAccess().getGumboSubclauseAction_0()); }
	()
	{ after(grammarAccess.getGumboSubclauseAccess().getGumboSubclauseAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GumboSubclause__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GumboSubclause__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GumboSubclause__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGumboSubclauseAccess().getSpecsAssignment_1()); }
	(rule__GumboSubclause__SpecsAssignment_1)
	{ after(grammarAccess.getGumboSubclauseAccess().getSpecsAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SpecSection__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SpecSection__Group__0__Impl
	rule__SpecSection__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecSection__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpecSectionAccess().getSpecSectionAction_0()); }
	()
	{ after(grammarAccess.getSpecSectionAccess().getSpecSectionAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecSection__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SpecSection__Group__1__Impl
	rule__SpecSection__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecSection__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpecSectionAccess().getStateAssignment_1()); }
	(rule__SpecSection__StateAssignment_1)?
	{ after(grammarAccess.getSpecSectionAccess().getStateAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecSection__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SpecSection__Group__2__Impl
	rule__SpecSection__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecSection__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpecSectionAccess().getFunctionsAssignment_2()); }
	(rule__SpecSection__FunctionsAssignment_2)?
	{ after(grammarAccess.getSpecSectionAccess().getFunctionsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecSection__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SpecSection__Group__3__Impl
	rule__SpecSection__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecSection__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpecSectionAccess().getInvariantsAssignment_3()); }
	(rule__SpecSection__InvariantsAssignment_3)?
	{ after(grammarAccess.getSpecSectionAccess().getInvariantsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecSection__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SpecSection__Group__4__Impl
	rule__SpecSection__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecSection__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpecSectionAccess().getIntegrationAssignment_4()); }
	(rule__SpecSection__IntegrationAssignment_4)?
	{ after(grammarAccess.getSpecSectionAccess().getIntegrationAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecSection__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SpecSection__Group__5__Impl
	rule__SpecSection__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecSection__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpecSectionAccess().getInitializeAssignment_5()); }
	(rule__SpecSection__InitializeAssignment_5)?
	{ after(grammarAccess.getSpecSectionAccess().getInitializeAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecSection__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SpecSection__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecSection__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpecSectionAccess().getComputeAssignment_6()); }
	(rule__SpecSection__ComputeAssignment_6)?
	{ after(grammarAccess.getSpecSectionAccess().getComputeAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__0__Impl
	rule__State__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getStateKeyword_0()); }
	State
	{ after(grammarAccess.getStateAccess().getStateKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getStateAccess().getDeclsAssignment_1()); }
		(rule__State__DeclsAssignment_1)
		{ after(grammarAccess.getStateAccess().getDeclsAssignment_1()); }
	)
	(
		{ before(grammarAccess.getStateAccess().getDeclsAssignment_1()); }
		(rule__State__DeclsAssignment_1)*
		{ after(grammarAccess.getStateAccess().getDeclsAssignment_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StateVarDecl__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateVarDecl__Group__0__Impl
	rule__StateVarDecl__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StateVarDecl__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateVarDeclAccess().getGroup_0()); }
	(rule__StateVarDecl__Group_0__0)
	{ after(grammarAccess.getStateVarDeclAccess().getGroup_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateVarDecl__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateVarDecl__Group__1__Impl
	rule__StateVarDecl__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__StateVarDecl__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateVarDeclAccess().getTypeNameAssignment_1()); }
	(rule__StateVarDecl__TypeNameAssignment_1)
	{ after(grammarAccess.getStateVarDeclAccess().getTypeNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateVarDecl__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateVarDecl__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StateVarDecl__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateVarDeclAccess().getSemicolonKeyword_2()); }
	Semicolon
	{ after(grammarAccess.getStateVarDeclAccess().getSemicolonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StateVarDecl__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateVarDecl__Group_0__0__Impl
	rule__StateVarDecl__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StateVarDecl__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateVarDeclAccess().getNameAssignment_0_0()); }
	(rule__StateVarDecl__NameAssignment_0_0)
	{ after(grammarAccess.getStateVarDeclAccess().getNameAssignment_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateVarDecl__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateVarDecl__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StateVarDecl__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateVarDeclAccess().getColonKeyword_0_1()); }
	Colon
	{ after(grammarAccess.getStateVarDeclAccess().getColonKeyword_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Invariants__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Invariants__Group__0__Impl
	rule__Invariants__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Invariants__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInvariantsAccess().getInvariantsKeyword_0()); }
	Invariants
	{ after(grammarAccess.getInvariantsAccess().getInvariantsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Invariants__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Invariants__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Invariants__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getInvariantsAccess().getSpecsAssignment_1()); }
		(rule__Invariants__SpecsAssignment_1)
		{ after(grammarAccess.getInvariantsAccess().getSpecsAssignment_1()); }
	)
	(
		{ before(grammarAccess.getInvariantsAccess().getSpecsAssignment_1()); }
		(rule__Invariants__SpecsAssignment_1)*
		{ after(grammarAccess.getInvariantsAccess().getSpecsAssignment_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InvSpec__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InvSpec__Group__0__Impl
	rule__InvSpec__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InvSpec__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInvSpecAccess().getInvKeyword_0()); }
	Inv
	{ after(grammarAccess.getInvSpecAccess().getInvKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InvSpec__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InvSpec__Group__1__Impl
	rule__InvSpec__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__InvSpec__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInvSpecAccess().getIdAssignment_1()); }
	(rule__InvSpec__IdAssignment_1)
	{ after(grammarAccess.getInvSpecAccess().getIdAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InvSpec__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InvSpec__Group__2__Impl
	rule__InvSpec__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__InvSpec__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInvSpecAccess().getDescriptorAssignment_2()); }
	(rule__InvSpec__DescriptorAssignment_2)?
	{ after(grammarAccess.getInvSpecAccess().getDescriptorAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InvSpec__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InvSpec__Group__3__Impl
	rule__InvSpec__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__InvSpec__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInvSpecAccess().getColonKeyword_3()); }
	Colon
	{ after(grammarAccess.getInvSpecAccess().getColonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InvSpec__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InvSpec__Group__4__Impl
	rule__InvSpec__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__InvSpec__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInvSpecAccess().getExprAssignment_4()); }
	(rule__InvSpec__ExprAssignment_4)
	{ after(grammarAccess.getInvSpecAccess().getExprAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InvSpec__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InvSpec__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InvSpec__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInvSpecAccess().getSemicolonKeyword_5()); }
	Semicolon
	{ after(grammarAccess.getInvSpecAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Integration__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Integration__Group__0__Impl
	rule__Integration__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Integration__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegrationAccess().getIntegrationKeyword_0()); }
	Integration
	{ after(grammarAccess.getIntegrationAccess().getIntegrationKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Integration__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Integration__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Integration__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getIntegrationAccess().getSpecsAssignment_1()); }
		(rule__Integration__SpecsAssignment_1)
		{ after(grammarAccess.getIntegrationAccess().getSpecsAssignment_1()); }
	)
	(
		{ before(grammarAccess.getIntegrationAccess().getSpecsAssignment_1()); }
		(rule__Integration__SpecsAssignment_1)*
		{ after(grammarAccess.getIntegrationAccess().getSpecsAssignment_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Initialize__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Initialize__Group__0__Impl
	rule__Initialize__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Initialize__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInitializeAccess().getInitializeKeyword_0()); }
	Initialize
	{ after(grammarAccess.getInitializeAccess().getInitializeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Initialize__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Initialize__Group__1__Impl
	rule__Initialize__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Initialize__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInitializeAccess().getGroup_1()); }
	(rule__Initialize__Group_1__0)?
	{ after(grammarAccess.getInitializeAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Initialize__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Initialize__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Initialize__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getInitializeAccess().getSpecsAssignment_2()); }
		(rule__Initialize__SpecsAssignment_2)
		{ after(grammarAccess.getInitializeAccess().getSpecsAssignment_2()); }
	)
	(
		{ before(grammarAccess.getInitializeAccess().getSpecsAssignment_2()); }
		(rule__Initialize__SpecsAssignment_2)*
		{ after(grammarAccess.getInitializeAccess().getSpecsAssignment_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Initialize__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Initialize__Group_1__0__Impl
	rule__Initialize__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Initialize__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInitializeAccess().getModifiesAssignment_1_0()); }
	(rule__Initialize__ModifiesAssignment_1_0)
	{ after(grammarAccess.getInitializeAccess().getModifiesAssignment_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Initialize__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Initialize__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Initialize__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInitializeAccess().getSemicolonKeyword_1_1()); }
	Semicolon
	{ after(grammarAccess.getInitializeAccess().getSemicolonKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Compute__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Compute__Group__0__Impl
	rule__Compute__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Compute__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComputeAccess().getComputeKeyword_0()); }
	Compute
	{ after(grammarAccess.getComputeAccess().getComputeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compute__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Compute__Group__1__Impl
	rule__Compute__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Compute__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComputeAccess().getGroup_1()); }
	(rule__Compute__Group_1__0)?
	{ after(grammarAccess.getComputeAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compute__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Compute__Group__2__Impl
	rule__Compute__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Compute__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComputeAccess().getAlternatives_2()); }
	(rule__Compute__Alternatives_2)
	{ after(grammarAccess.getComputeAccess().getAlternatives_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compute__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Compute__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Compute__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComputeAccess().getHandlersAssignment_3()); }
	(rule__Compute__HandlersAssignment_3)*
	{ after(grammarAccess.getComputeAccess().getHandlersAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Compute__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Compute__Group_1__0__Impl
	rule__Compute__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Compute__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComputeAccess().getModifiesAssignment_1_0()); }
	(rule__Compute__ModifiesAssignment_1_0)
	{ after(grammarAccess.getComputeAccess().getModifiesAssignment_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compute__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Compute__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Compute__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComputeAccess().getSemicolonKeyword_1_1()); }
	Semicolon
	{ after(grammarAccess.getComputeAccess().getSemicolonKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Compute__Group_2_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Compute__Group_2_0__0__Impl
	rule__Compute__Group_2_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Compute__Group_2_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComputeAccess().getCasesKeyword_2_0_0()); }
	Cases
	{ after(grammarAccess.getComputeAccess().getCasesKeyword_2_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compute__Group_2_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Compute__Group_2_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Compute__Group_2_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getComputeAccess().getCasesAssignment_2_0_1()); }
		(rule__Compute__CasesAssignment_2_0_1)
		{ after(grammarAccess.getComputeAccess().getCasesAssignment_2_0_1()); }
	)
	(
		{ before(grammarAccess.getComputeAccess().getCasesAssignment_2_0_1()); }
		(rule__Compute__CasesAssignment_2_0_1)*
		{ after(grammarAccess.getComputeAccess().getCasesAssignment_2_0_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__HandlerClause__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__HandlerClause__Group__0__Impl
	rule__HandlerClause__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__HandlerClause__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHandlerClauseAccess().getHandleKeyword_0()); }
	Handle
	{ after(grammarAccess.getHandlerClauseAccess().getHandleKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__HandlerClause__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__HandlerClause__Group__1__Impl
	rule__HandlerClause__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__HandlerClause__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHandlerClauseAccess().getIdAssignment_1()); }
	(rule__HandlerClause__IdAssignment_1)
	{ after(grammarAccess.getHandlerClauseAccess().getIdAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__HandlerClause__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__HandlerClause__Group__2__Impl
	rule__HandlerClause__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__HandlerClause__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHandlerClauseAccess().getColonKeyword_2()); }
	Colon
	{ after(grammarAccess.getHandlerClauseAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__HandlerClause__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__HandlerClause__Group__3__Impl
	rule__HandlerClause__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__HandlerClause__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHandlerClauseAccess().getGroup_3()); }
	(rule__HandlerClause__Group_3__0)?
	{ after(grammarAccess.getHandlerClauseAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__HandlerClause__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__HandlerClause__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__HandlerClause__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getHandlerClauseAccess().getGuaranteesAssignment_4()); }
		(rule__HandlerClause__GuaranteesAssignment_4)
		{ after(grammarAccess.getHandlerClauseAccess().getGuaranteesAssignment_4()); }
	)
	(
		{ before(grammarAccess.getHandlerClauseAccess().getGuaranteesAssignment_4()); }
		(rule__HandlerClause__GuaranteesAssignment_4)*
		{ after(grammarAccess.getHandlerClauseAccess().getGuaranteesAssignment_4()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__HandlerClause__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__HandlerClause__Group_3__0__Impl
	rule__HandlerClause__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__HandlerClause__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHandlerClauseAccess().getModifiesAssignment_3_0()); }
	(rule__HandlerClause__ModifiesAssignment_3_0)
	{ after(grammarAccess.getHandlerClauseAccess().getModifiesAssignment_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__HandlerClause__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__HandlerClause__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__HandlerClause__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHandlerClauseAccess().getSemicolonKeyword_3_1()); }
	Semicolon
	{ after(grammarAccess.getHandlerClauseAccess().getSemicolonKeyword_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CaseStatementClause__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CaseStatementClause__Group__0__Impl
	rule__CaseStatementClause__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CaseStatementClause__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCaseStatementClauseAccess().getCaseKeyword_0()); }
	Case
	{ after(grammarAccess.getCaseStatementClauseAccess().getCaseKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CaseStatementClause__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CaseStatementClause__Group__1__Impl
	rule__CaseStatementClause__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CaseStatementClause__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCaseStatementClauseAccess().getIdAssignment_1()); }
	(rule__CaseStatementClause__IdAssignment_1)
	{ after(grammarAccess.getCaseStatementClauseAccess().getIdAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CaseStatementClause__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CaseStatementClause__Group__2__Impl
	rule__CaseStatementClause__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__CaseStatementClause__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCaseStatementClauseAccess().getDescriptorAssignment_2()); }
	(rule__CaseStatementClause__DescriptorAssignment_2)?
	{ after(grammarAccess.getCaseStatementClauseAccess().getDescriptorAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CaseStatementClause__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CaseStatementClause__Group__3__Impl
	rule__CaseStatementClause__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__CaseStatementClause__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCaseStatementClauseAccess().getColonKeyword_3()); }
	Colon
	{ after(grammarAccess.getCaseStatementClauseAccess().getColonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CaseStatementClause__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CaseStatementClause__Group__4__Impl
	rule__CaseStatementClause__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__CaseStatementClause__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCaseStatementClauseAccess().getAssumeStatementAssignment_4()); }
	(rule__CaseStatementClause__AssumeStatementAssignment_4)
	{ after(grammarAccess.getCaseStatementClauseAccess().getAssumeStatementAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CaseStatementClause__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CaseStatementClause__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CaseStatementClause__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCaseStatementClauseAccess().getGuaranteeStatementAssignment_5()); }
	(rule__CaseStatementClause__GuaranteeStatementAssignment_5)
	{ after(grammarAccess.getCaseStatementClauseAccess().getGuaranteeStatementAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AssumeStatement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AssumeStatement__Group__0__Impl
	rule__AssumeStatement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AssumeStatement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAssumeStatementAccess().getAssumeKeyword_0()); }
	Assume
	{ after(grammarAccess.getAssumeStatementAccess().getAssumeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AssumeStatement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AssumeStatement__Group__1__Impl
	rule__AssumeStatement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AssumeStatement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAssumeStatementAccess().getIdAssignment_1()); }
	(rule__AssumeStatement__IdAssignment_1)
	{ after(grammarAccess.getAssumeStatementAccess().getIdAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AssumeStatement__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AssumeStatement__Group__2__Impl
	rule__AssumeStatement__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AssumeStatement__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAssumeStatementAccess().getDescriptorAssignment_2()); }
	(rule__AssumeStatement__DescriptorAssignment_2)?
	{ after(grammarAccess.getAssumeStatementAccess().getDescriptorAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AssumeStatement__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AssumeStatement__Group__3__Impl
	rule__AssumeStatement__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__AssumeStatement__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAssumeStatementAccess().getColonKeyword_3()); }
	Colon
	{ after(grammarAccess.getAssumeStatementAccess().getColonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AssumeStatement__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AssumeStatement__Group__4__Impl
	rule__AssumeStatement__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__AssumeStatement__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAssumeStatementAccess().getExprAssignment_4()); }
	(rule__AssumeStatement__ExprAssignment_4)
	{ after(grammarAccess.getAssumeStatementAccess().getExprAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AssumeStatement__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AssumeStatement__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AssumeStatement__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAssumeStatementAccess().getSemicolonKeyword_5()); }
	Semicolon
	{ after(grammarAccess.getAssumeStatementAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AnonAssumeStatement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnonAssumeStatement__Group__0__Impl
	rule__AnonAssumeStatement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AnonAssumeStatement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnonAssumeStatementAccess().getAssumeKeyword_0()); }
	Assume
	{ after(grammarAccess.getAnonAssumeStatementAccess().getAssumeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnonAssumeStatement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnonAssumeStatement__Group__1__Impl
	rule__AnonAssumeStatement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AnonAssumeStatement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnonAssumeStatementAccess().getExprAssignment_1()); }
	(rule__AnonAssumeStatement__ExprAssignment_1)
	{ after(grammarAccess.getAnonAssumeStatementAccess().getExprAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnonAssumeStatement__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnonAssumeStatement__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AnonAssumeStatement__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnonAssumeStatementAccess().getSemicolonKeyword_2()); }
	Semicolon
	{ after(grammarAccess.getAnonAssumeStatementAccess().getSemicolonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GuaranteeStatement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GuaranteeStatement__Group__0__Impl
	rule__GuaranteeStatement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GuaranteeStatement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGuaranteeStatementAccess().getGuaranteeKeyword_0()); }
	Guarantee
	{ after(grammarAccess.getGuaranteeStatementAccess().getGuaranteeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GuaranteeStatement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GuaranteeStatement__Group__1__Impl
	rule__GuaranteeStatement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GuaranteeStatement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGuaranteeStatementAccess().getIdAssignment_1()); }
	(rule__GuaranteeStatement__IdAssignment_1)
	{ after(grammarAccess.getGuaranteeStatementAccess().getIdAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GuaranteeStatement__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GuaranteeStatement__Group__2__Impl
	rule__GuaranteeStatement__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GuaranteeStatement__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGuaranteeStatementAccess().getDescriptorAssignment_2()); }
	(rule__GuaranteeStatement__DescriptorAssignment_2)?
	{ after(grammarAccess.getGuaranteeStatementAccess().getDescriptorAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GuaranteeStatement__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GuaranteeStatement__Group__3__Impl
	rule__GuaranteeStatement__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GuaranteeStatement__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGuaranteeStatementAccess().getColonKeyword_3()); }
	Colon
	{ after(grammarAccess.getGuaranteeStatementAccess().getColonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GuaranteeStatement__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GuaranteeStatement__Group__4__Impl
	rule__GuaranteeStatement__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GuaranteeStatement__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGuaranteeStatementAccess().getExprAssignment_4()); }
	(rule__GuaranteeStatement__ExprAssignment_4)
	{ after(grammarAccess.getGuaranteeStatementAccess().getExprAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GuaranteeStatement__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GuaranteeStatement__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GuaranteeStatement__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGuaranteeStatementAccess().getSemicolonKeyword_5()); }
	Semicolon
	{ after(grammarAccess.getGuaranteeStatementAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ImplicationStatement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ImplicationStatement__Group__0__Impl
	rule__ImplicationStatement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplicationStatement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImplicationStatementAccess().getGuaranteeKeyword_0()); }
	Guarantee
	{ after(grammarAccess.getImplicationStatementAccess().getGuaranteeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplicationStatement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ImplicationStatement__Group__1__Impl
	rule__ImplicationStatement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplicationStatement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImplicationStatementAccess().getIdAssignment_1()); }
	(rule__ImplicationStatement__IdAssignment_1)
	{ after(grammarAccess.getImplicationStatementAccess().getIdAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplicationStatement__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ImplicationStatement__Group__2__Impl
	rule__ImplicationStatement__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplicationStatement__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImplicationStatementAccess().getDescriptorAssignment_2()); }
	(rule__ImplicationStatement__DescriptorAssignment_2)?
	{ after(grammarAccess.getImplicationStatementAccess().getDescriptorAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplicationStatement__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ImplicationStatement__Group__3__Impl
	rule__ImplicationStatement__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplicationStatement__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImplicationStatementAccess().getColonKeyword_3()); }
	Colon
	{ after(grammarAccess.getImplicationStatementAccess().getColonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplicationStatement__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ImplicationStatement__Group__4__Impl
	rule__ImplicationStatement__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplicationStatement__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImplicationStatementAccess().getAntecedentAssignment_4()); }
	(rule__ImplicationStatement__AntecedentAssignment_4)
	{ after(grammarAccess.getImplicationStatementAccess().getAntecedentAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplicationStatement__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ImplicationStatement__Group__5__Impl
	rule__ImplicationStatement__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplicationStatement__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImplicationStatementAccess().getHyphenMinusGreaterThanSignColonKeyword_5()); }
	HyphenMinusGreaterThanSignColon
	{ after(grammarAccess.getImplicationStatementAccess().getHyphenMinusGreaterThanSignColonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplicationStatement__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ImplicationStatement__Group__6__Impl
	rule__ImplicationStatement__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplicationStatement__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImplicationStatementAccess().getConsequentAssignment_6()); }
	(rule__ImplicationStatement__ConsequentAssignment_6)
	{ after(grammarAccess.getImplicationStatementAccess().getConsequentAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplicationStatement__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ImplicationStatement__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplicationStatement__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImplicationStatementAccess().getSemicolonKeyword_7()); }
	Semicolon
	{ after(grammarAccess.getImplicationStatementAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AnonGuaranteeStatement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnonGuaranteeStatement__Group__0__Impl
	rule__AnonGuaranteeStatement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AnonGuaranteeStatement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnonGuaranteeStatementAccess().getGuaranteeKeyword_0()); }
	Guarantee
	{ after(grammarAccess.getAnonGuaranteeStatementAccess().getGuaranteeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnonGuaranteeStatement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnonGuaranteeStatement__Group__1__Impl
	rule__AnonGuaranteeStatement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AnonGuaranteeStatement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnonGuaranteeStatementAccess().getExprAssignment_1()); }
	(rule__AnonGuaranteeStatement__ExprAssignment_1)
	{ after(grammarAccess.getAnonGuaranteeStatementAccess().getExprAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnonGuaranteeStatement__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnonGuaranteeStatement__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AnonGuaranteeStatement__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnonGuaranteeStatementAccess().getSemicolonKeyword_2()); }
	Semicolon
	{ after(grammarAccess.getAnonGuaranteeStatementAccess().getSemicolonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OtherDataRef__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OtherDataRef__Group__0__Impl
	rule__OtherDataRef__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OtherDataRef__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOtherDataRefAccess().getGroup_0()); }
	(rule__OtherDataRef__Group_0__0)
	{ after(grammarAccess.getOtherDataRefAccess().getGroup_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OtherDataRef__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OtherDataRef__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OtherDataRef__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOtherDataRefAccess().getGroup_1()); }
	(rule__OtherDataRef__Group_1__0)?
	{ after(grammarAccess.getOtherDataRefAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OtherDataRef__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OtherDataRef__Group_0__0__Impl
	rule__OtherDataRef__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OtherDataRef__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOtherDataRefAccess().getNamedElementAssignment_0_0()); }
	(rule__OtherDataRef__NamedElementAssignment_0_0)
	{ after(grammarAccess.getOtherDataRefAccess().getNamedElementAssignment_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OtherDataRef__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OtherDataRef__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OtherDataRef__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOtherDataRefAccess().getArrayRangeAssignment_0_1()); }
	(rule__OtherDataRef__ArrayRangeAssignment_0_1)*
	{ after(grammarAccess.getOtherDataRefAccess().getArrayRangeAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OtherDataRef__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OtherDataRef__Group_1__0__Impl
	rule__OtherDataRef__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OtherDataRef__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOtherDataRefAccess().getFullStopKeyword_1_0()); }
	FullStop
	{ after(grammarAccess.getOtherDataRefAccess().getFullStopKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OtherDataRef__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OtherDataRef__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OtherDataRef__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOtherDataRefAccess().getPathAssignment_1_1()); }
	(rule__OtherDataRef__PathAssignment_1_1)
	{ after(grammarAccess.getOtherDataRefAccess().getPathAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Functions__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Functions__Group__0__Impl
	rule__Functions__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Functions__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionsAccess().getFunctionsKeyword_0()); }
	Functions
	{ after(grammarAccess.getFunctionsAccess().getFunctionsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Functions__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Functions__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Functions__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getFunctionsAccess().getSpecsAssignment_1()); }
		(rule__Functions__SpecsAssignment_1)
		{ after(grammarAccess.getFunctionsAccess().getSpecsAssignment_1()); }
	)
	(
		{ before(grammarAccess.getFunctionsAccess().getSpecsAssignment_1()); }
		(rule__Functions__SpecsAssignment_1)*
		{ after(grammarAccess.getFunctionsAccess().getSpecsAssignment_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FuncSpec__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FuncSpec__Group__0__Impl
	rule__FuncSpec__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FuncSpec__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFuncSpecAccess().getSlangDefDefParserRuleCall_0()); }
	ruleSlangDefDef
	{ after(grammarAccess.getFuncSpecAccess().getSlangDefDefParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FuncSpec__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FuncSpec__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FuncSpec__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFuncSpecAccess().getSemicolonKeyword_1()); }
	Semicolon
	{ after(grammarAccess.getFuncSpecAccess().getSemicolonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangDefDecl__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefDecl__Group__0__Impl
	rule__SlangDefDecl__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDecl__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefDeclAccess().getDefKeyword_0()); }
	Def
	{ after(grammarAccess.getSlangDefDeclAccess().getDefKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDecl__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefDecl__Group__1__Impl
	rule__SlangDefDecl__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDecl__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefDeclAccess().getSlangDefModsParserRuleCall_1()); }
	(ruleSlangDefMods)?
	{ after(grammarAccess.getSlangDefDeclAccess().getSlangDefModsParserRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDecl__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefDecl__Group__2__Impl
	rule__SlangDefDecl__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDecl__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefDeclAccess().getSdeAssignment_2()); }
	(rule__SlangDefDecl__SdeAssignment_2)?
	{ after(grammarAccess.getSlangDefDeclAccess().getSdeAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDecl__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefDecl__Group__3__Impl
	rule__SlangDefDecl__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDecl__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefDeclAccess().getNameAssignment_3()); }
	(rule__SlangDefDecl__NameAssignment_3)
	{ after(grammarAccess.getSlangDefDeclAccess().getNameAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDecl__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefDecl__Group__4__Impl
	rule__SlangDefDecl__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDecl__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefDeclAccess().getTypeParamsAssignment_4()); }
	(rule__SlangDefDecl__TypeParamsAssignment_4)?
	{ after(grammarAccess.getSlangDefDeclAccess().getTypeParamsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDecl__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefDecl__Group__5__Impl
	rule__SlangDefDecl__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDecl__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefDeclAccess().getParamsAssignment_5()); }
	(rule__SlangDefDecl__ParamsAssignment_5)?
	{ after(grammarAccess.getSlangDefDeclAccess().getParamsAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDecl__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefDecl__Group__6__Impl
	rule__SlangDefDecl__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDecl__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefDeclAccess().getColonKeyword_6()); }
	Colon
	{ after(grammarAccess.getSlangDefDeclAccess().getColonKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDecl__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefDecl__Group__7__Impl
	rule__SlangDefDecl__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDecl__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefDeclAccess().getTypeAssignment_7()); }
	(rule__SlangDefDecl__TypeAssignment_7)
	{ after(grammarAccess.getSlangDefDeclAccess().getTypeAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDecl__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefDecl__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDecl__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefDeclAccess().getCAssignment_8()); }
	(rule__SlangDefDecl__CAssignment_8)?
	{ after(grammarAccess.getSlangDefDeclAccess().getCAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangDefDef__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefDef__Group__0__Impl
	rule__SlangDefDef__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDef__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefDefAccess().getDefKeyword_0()); }
	Def
	{ after(grammarAccess.getSlangDefDefAccess().getDefKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDef__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefDef__Group__1__Impl
	rule__SlangDefDef__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDef__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefDefAccess().getSlangDefModsParserRuleCall_1()); }
	(ruleSlangDefMods)?
	{ after(grammarAccess.getSlangDefDefAccess().getSlangDefModsParserRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDef__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefDef__Group__2__Impl
	rule__SlangDefDef__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDef__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefDefAccess().getSdeAssignment_2()); }
	(rule__SlangDefDef__SdeAssignment_2)?
	{ after(grammarAccess.getSlangDefDefAccess().getSdeAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDef__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefDef__Group__3__Impl
	rule__SlangDefDef__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDef__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefDefAccess().getNameAssignment_3()); }
	(rule__SlangDefDef__NameAssignment_3)
	{ after(grammarAccess.getSlangDefDefAccess().getNameAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDef__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefDef__Group__4__Impl
	rule__SlangDefDef__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDef__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefDefAccess().getTypeParamsAssignment_4()); }
	(rule__SlangDefDef__TypeParamsAssignment_4)?
	{ after(grammarAccess.getSlangDefDefAccess().getTypeParamsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDef__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefDef__Group__5__Impl
	rule__SlangDefDef__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDef__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefDefAccess().getParamsAssignment_5()); }
	(rule__SlangDefDef__ParamsAssignment_5)?
	{ after(grammarAccess.getSlangDefDefAccess().getParamsAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDef__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefDef__Group__6__Impl
	rule__SlangDefDef__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDef__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefDefAccess().getColonKeyword_6()); }
	Colon
	{ after(grammarAccess.getSlangDefDefAccess().getColonKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDef__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefDef__Group__7__Impl
	rule__SlangDefDef__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDef__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefDefAccess().getTypeAssignment_7()); }
	(rule__SlangDefDef__TypeAssignment_7)
	{ after(grammarAccess.getSlangDefDefAccess().getTypeAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDef__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefDef__Group__8__Impl
	rule__SlangDefDef__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDef__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefDefAccess().getCAssignment_8()); }
	(rule__SlangDefDef__CAssignment_8)?
	{ after(grammarAccess.getSlangDefDefAccess().getCAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDef__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefDef__Group__9__Impl
	rule__SlangDefDef__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDef__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefDefAccess().getColonEqualsSignKeyword_9()); }
	ColonEqualsSign
	{ after(grammarAccess.getSlangDefDefAccess().getColonEqualsSignKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDef__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefDef__Group__10__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDef__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefDefAccess().getEAssignment_10()); }
	(rule__SlangDefDef__EAssignment_10)
	{ after(grammarAccess.getSlangDefDefAccess().getEAssignment_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangDefExt__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefExt__Group__0__Impl
	rule__SlangDefExt__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefExt__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefExtAccess().getLeftParenthesisKeyword_0()); }
	LeftParenthesis
	{ after(grammarAccess.getSlangDefExtAccess().getLeftParenthesisKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefExt__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefExt__Group__1__Impl
	rule__SlangDefExt__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefExt__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefExtAccess().getNameAssignment_1()); }
	(rule__SlangDefExt__NameAssignment_1)
	{ after(grammarAccess.getSlangDefExtAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefExt__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefExt__Group__2__Impl
	rule__SlangDefExt__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefExt__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefExtAccess().getColonKeyword_2()); }
	Colon
	{ after(grammarAccess.getSlangDefExtAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefExt__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefExt__Group__3__Impl
	rule__SlangDefExt__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefExt__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefExtAccess().getTypeNameAssignment_3()); }
	(rule__SlangDefExt__TypeNameAssignment_3)
	{ after(grammarAccess.getSlangDefExtAccess().getTypeNameAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefExt__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefExt__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefExt__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefExtAccess().getRightParenthesisKeyword_4()); }
	RightParenthesis
	{ after(grammarAccess.getSlangDefExtAccess().getRightParenthesisKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangDefParams__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefParams__Group__0__Impl
	rule__SlangDefParams__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefParams__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefParamsAccess().getLeftParenthesisKeyword_0()); }
	LeftParenthesis
	{ after(grammarAccess.getSlangDefParamsAccess().getLeftParenthesisKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefParams__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefParams__Group__1__Impl
	rule__SlangDefParams__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefParams__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefParamsAccess().getParamsAssignment_1()); }
	(rule__SlangDefParams__ParamsAssignment_1)
	{ after(grammarAccess.getSlangDefParamsAccess().getParamsAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefParams__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefParams__Group__2__Impl
	rule__SlangDefParams__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefParams__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefParamsAccess().getGroup_2()); }
	(rule__SlangDefParams__Group_2__0)?
	{ after(grammarAccess.getSlangDefParamsAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefParams__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefParams__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefParams__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefParamsAccess().getRightParenthesisKeyword_3()); }
	RightParenthesis
	{ after(grammarAccess.getSlangDefParamsAccess().getRightParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangDefParams__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefParams__Group_2__0__Impl
	rule__SlangDefParams__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefParams__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefParamsAccess().getCommaKeyword_2_0()); }
	Comma
	{ after(grammarAccess.getSlangDefParamsAccess().getCommaKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefParams__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefParams__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefParams__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefParamsAccess().getParamsAssignment_2_1()); }
	(rule__SlangDefParams__ParamsAssignment_2_1)
	{ after(grammarAccess.getSlangDefParamsAccess().getParamsAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangDefParam__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefParam__Group__0__Impl
	rule__SlangDefParam__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefParam__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefParamAccess().getNameAssignment_0()); }
	(rule__SlangDefParam__NameAssignment_0)
	{ after(grammarAccess.getSlangDefParamAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefParam__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefParam__Group__1__Impl
	rule__SlangDefParam__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefParam__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefParamAccess().getColonKeyword_1()); }
	Colon
	{ after(grammarAccess.getSlangDefParamAccess().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefParam__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefParam__Group__2__Impl
	rule__SlangDefParam__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefParam__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefParamAccess().getEqualsSignGreaterThanSignKeyword_2()); }
	(EqualsSignGreaterThanSign)?
	{ after(grammarAccess.getSlangDefParamAccess().getEqualsSignGreaterThanSignKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefParam__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefParam__Group__3__Impl
	rule__SlangDefParam__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefParam__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefParamAccess().getTypeNameAssignment_3()); }
	(rule__SlangDefParam__TypeNameAssignment_3)
	{ after(grammarAccess.getSlangDefParamAccess().getTypeNameAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefParam__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefParam__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefParam__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefParamAccess().getAsteriskKeyword_4()); }
	(Asterisk)?
	{ after(grammarAccess.getSlangDefParamAccess().getAsteriskKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangTypeParams__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTypeParams__Group__0__Impl
	rule__SlangTypeParams__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTypeParams__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTypeParamsAccess().getLeftSquareBracketKeyword_0()); }
	LeftSquareBracket
	{ after(grammarAccess.getSlangTypeParamsAccess().getLeftSquareBracketKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTypeParams__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTypeParams__Group__1__Impl
	rule__SlangTypeParams__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTypeParams__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTypeParamsAccess().getSlangTypeParamParserRuleCall_1()); }
	ruleSlangTypeParam
	{ after(grammarAccess.getSlangTypeParamsAccess().getSlangTypeParamParserRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTypeParams__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTypeParams__Group__2__Impl
	rule__SlangTypeParams__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTypeParams__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTypeParamsAccess().getGroup_2()); }
	(rule__SlangTypeParams__Group_2__0)*
	{ after(grammarAccess.getSlangTypeParamsAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTypeParams__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTypeParams__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTypeParams__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTypeParamsAccess().getRightSquareBracketKeyword_3()); }
	RightSquareBracket
	{ after(grammarAccess.getSlangTypeParamsAccess().getRightSquareBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangTypeParams__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTypeParams__Group_2__0__Impl
	rule__SlangTypeParams__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTypeParams__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTypeParamsAccess().getCommaKeyword_2_0()); }
	Comma
	{ after(grammarAccess.getSlangTypeParamsAccess().getCommaKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTypeParams__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTypeParams__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTypeParams__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTypeParamsAccess().getSlangTypeParamParserRuleCall_2_1()); }
	ruleSlangTypeParam
	{ after(grammarAccess.getSlangTypeParamsAccess().getSlangTypeParamParserRuleCall_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangTypeParam__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTypeParam__Group__0__Impl
	rule__SlangTypeParam__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTypeParam__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTypeParamAccess().getMutKeyword_0()); }
	(Mut)?
	{ after(grammarAccess.getSlangTypeParamAccess().getMutKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTypeParam__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTypeParam__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTypeParam__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTypeParamAccess().getIDTerminalRuleCall_1()); }
	RULE_ID
	{ after(grammarAccess.getSlangTypeParamAccess().getIDTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangDefContract__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefContract__Group__0__Impl
	rule__SlangDefContract__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContract__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefContractAccess().getSlangDefContractAction_0()); }
	()
	{ after(grammarAccess.getSlangDefContractAccess().getSlangDefContractAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContract__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefContract__Group__1__Impl
	rule__SlangDefContract__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContract__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefContractAccess().getSpecKeyword_1()); }
	Spec
	{ after(grammarAccess.getSlangDefContractAccess().getSpecKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContract__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefContract__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContract__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefContractAccess().getAlternatives_2()); }
	(rule__SlangDefContract__Alternatives_2)
	{ after(grammarAccess.getSlangDefContractAccess().getAlternatives_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangDefContract__Group_2_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefContract__Group_2_0__0__Impl
	rule__SlangDefContract__Group_2_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContract__Group_2_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefContractAccess().getReaAssignment_2_0_0()); }
	(rule__SlangDefContract__ReaAssignment_2_0_0)?
	{ after(grammarAccess.getSlangDefContractAccess().getReaAssignment_2_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContract__Group_2_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefContract__Group_2_0__1__Impl
	rule__SlangDefContract__Group_2_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContract__Group_2_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefContractAccess().getReqAssignment_2_0_1()); }
	(rule__SlangDefContract__ReqAssignment_2_0_1)?
	{ after(grammarAccess.getSlangDefContractAccess().getReqAssignment_2_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContract__Group_2_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefContract__Group_2_0__2__Impl
	rule__SlangDefContract__Group_2_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContract__Group_2_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefContractAccess().getModAssignment_2_0_2()); }
	(rule__SlangDefContract__ModAssignment_2_0_2)?
	{ after(grammarAccess.getSlangDefContractAccess().getModAssignment_2_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContract__Group_2_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefContract__Group_2_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContract__Group_2_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefContractAccess().getEnsAssignment_2_0_3()); }
	(rule__SlangDefContract__EnsAssignment_2_0_3)?
	{ after(grammarAccess.getSlangDefContractAccess().getEnsAssignment_2_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangDefContract__Group_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefContract__Group_2_1__0__Impl
	rule__SlangDefContract__Group_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContract__Group_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getSlangDefContractAccess().getContractsAssignment_2_1_0()); }
		(rule__SlangDefContract__ContractsAssignment_2_1_0)
		{ after(grammarAccess.getSlangDefContractAccess().getContractsAssignment_2_1_0()); }
	)
	(
		{ before(grammarAccess.getSlangDefContractAccess().getContractsAssignment_2_1_0()); }
		(rule__SlangDefContract__ContractsAssignment_2_1_0)*
		{ after(grammarAccess.getSlangDefContractAccess().getContractsAssignment_2_1_0()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContract__Group_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefContract__Group_2_1__1__Impl
	rule__SlangDefContract__Group_2_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContract__Group_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefContractAccess().getReaAssignment_2_1_1()); }
	(rule__SlangDefContract__ReaAssignment_2_1_1)?
	{ after(grammarAccess.getSlangDefContractAccess().getReaAssignment_2_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContract__Group_2_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefContract__Group_2_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContract__Group_2_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefContractAccess().getModAssignment_2_1_2()); }
	(rule__SlangDefContract__ModAssignment_2_1_2)?
	{ after(grammarAccess.getSlangDefContractAccess().getModAssignment_2_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangDefContractCase__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefContractCase__Group__0__Impl
	rule__SlangDefContractCase__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContractCase__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefContractCaseAccess().getSlangDefContractCaseAction_0()); }
	()
	{ after(grammarAccess.getSlangDefContractCaseAccess().getSlangDefContractCaseAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContractCase__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefContractCase__Group__1__Impl
	rule__SlangDefContractCase__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContractCase__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefContractCaseAccess().getCaseKeyword_1()); }
	Case
	{ after(grammarAccess.getSlangDefContractCaseAccess().getCaseKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContractCase__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefContractCase__Group__2__Impl
	rule__SlangDefContractCase__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContractCase__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefContractCaseAccess().getSLANG_STRINGTerminalRuleCall_2()); }
	RULE_SLANG_STRING
	{ after(grammarAccess.getSlangDefContractCaseAccess().getSLANG_STRINGTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContractCase__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefContractCase__Group__3__Impl
	rule__SlangDefContractCase__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContractCase__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefContractCaseAccess().getReqAssignment_3()); }
	(rule__SlangDefContractCase__ReqAssignment_3)?
	{ after(grammarAccess.getSlangDefContractCaseAccess().getReqAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContractCase__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefContractCase__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContractCase__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefContractCaseAccess().getEnsAssignment_4()); }
	(rule__SlangDefContractCase__EnsAssignment_4)?
	{ after(grammarAccess.getSlangDefContractCaseAccess().getEnsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangSupr__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangSupr__Group__0__Impl
	rule__SlangSupr__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangSupr__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangSuprAccess().getNameAssignment_0()); }
	(rule__SlangSupr__NameAssignment_0)
	{ after(grammarAccess.getSlangSuprAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangSupr__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangSupr__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangSupr__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangSuprAccess().getArgsAssignment_1()); }
	(rule__SlangSupr__ArgsAssignment_1)?
	{ after(grammarAccess.getSlangSuprAccess().getArgsAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangName__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangName__Group__0__Impl
	rule__SlangName__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangName__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangNameAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
	{ after(grammarAccess.getSlangNameAccess().getIDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangName__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangName__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangName__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangNameAccess().getGroup_1()); }
	(rule__SlangName__Group_1__0)*
	{ after(grammarAccess.getSlangNameAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangName__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangName__Group_1__0__Impl
	rule__SlangName__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangName__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangNameAccess().getFullStopKeyword_1_0()); }
	FullStop
	{ after(grammarAccess.getSlangNameAccess().getFullStopKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangName__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangName__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangName__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangNameAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
	{ after(grammarAccess.getSlangNameAccess().getIDTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangInvariant__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangInvariant__Group__0__Impl
	rule__SlangInvariant__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangInvariant__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangInvariantAccess().getInvariantKeyword_0()); }
	Invariant
	{ after(grammarAccess.getSlangInvariantAccess().getInvariantKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangInvariant__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangInvariant__Group__1__Impl
	rule__SlangInvariant__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangInvariant__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangInvariantAccess().getExprsAssignment_1()); }
	(rule__SlangInvariant__ExprsAssignment_1)
	{ after(grammarAccess.getSlangInvariantAccess().getExprsAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangInvariant__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangInvariant__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangInvariant__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangInvariantAccess().getGroup_2()); }
	(rule__SlangInvariant__Group_2__0)*
	{ after(grammarAccess.getSlangInvariantAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangInvariant__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangInvariant__Group_2__0__Impl
	rule__SlangInvariant__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangInvariant__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangInvariantAccess().getCommaKeyword_2_0()); }
	Comma
	{ after(grammarAccess.getSlangInvariantAccess().getCommaKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangInvariant__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangInvariant__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangInvariant__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangInvariantAccess().getExprsAssignment_2_1()); }
	(rule__SlangInvariant__ExprsAssignment_2_1)
	{ after(grammarAccess.getSlangInvariantAccess().getExprsAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangReads__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangReads__Group__0__Impl
	rule__SlangReads__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangReads__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangReadsAccess().getReadsKeyword_0()); }
	Reads
	{ after(grammarAccess.getSlangReadsAccess().getReadsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangReads__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangReads__Group__1__Impl
	rule__SlangReads__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangReads__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangReadsAccess().getExprsAssignment_1()); }
	(rule__SlangReads__ExprsAssignment_1)
	{ after(grammarAccess.getSlangReadsAccess().getExprsAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangReads__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangReads__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangReads__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangReadsAccess().getGroup_2()); }
	(rule__SlangReads__Group_2__0)*
	{ after(grammarAccess.getSlangReadsAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangReads__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangReads__Group_2__0__Impl
	rule__SlangReads__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangReads__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangReadsAccess().getCommaKeyword_2_0()); }
	Comma
	{ after(grammarAccess.getSlangReadsAccess().getCommaKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangReads__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangReads__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangReads__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangReadsAccess().getExprsAssignment_2_1()); }
	(rule__SlangReads__ExprsAssignment_2_1)
	{ after(grammarAccess.getSlangReadsAccess().getExprsAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangRequires__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangRequires__Group__0__Impl
	rule__SlangRequires__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangRequires__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangRequiresAccess().getRequiresKeyword_0()); }
	Requires
	{ after(grammarAccess.getSlangRequiresAccess().getRequiresKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangRequires__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangRequires__Group__1__Impl
	rule__SlangRequires__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangRequires__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangRequiresAccess().getExprsAssignment_1()); }
	(rule__SlangRequires__ExprsAssignment_1)
	{ after(grammarAccess.getSlangRequiresAccess().getExprsAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangRequires__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangRequires__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangRequires__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangRequiresAccess().getGroup_2()); }
	(rule__SlangRequires__Group_2__0)*
	{ after(grammarAccess.getSlangRequiresAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangRequires__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangRequires__Group_2__0__Impl
	rule__SlangRequires__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangRequires__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangRequiresAccess().getCommaKeyword_2_0()); }
	Comma
	{ after(grammarAccess.getSlangRequiresAccess().getCommaKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangRequires__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangRequires__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangRequires__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangRequiresAccess().getExprsAssignment_2_1()); }
	(rule__SlangRequires__ExprsAssignment_2_1)
	{ after(grammarAccess.getSlangRequiresAccess().getExprsAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangModifies__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangModifies__Group__0__Impl
	rule__SlangModifies__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangModifies__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangModifiesAccess().getModifiesKeyword_0()); }
	Modifies
	{ after(grammarAccess.getSlangModifiesAccess().getModifiesKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangModifies__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangModifies__Group__1__Impl
	rule__SlangModifies__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangModifies__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangModifiesAccess().getExprsAssignment_1()); }
	(rule__SlangModifies__ExprsAssignment_1)
	{ after(grammarAccess.getSlangModifiesAccess().getExprsAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangModifies__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangModifies__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangModifies__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangModifiesAccess().getGroup_2()); }
	(rule__SlangModifies__Group_2__0)*
	{ after(grammarAccess.getSlangModifiesAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangModifies__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangModifies__Group_2__0__Impl
	rule__SlangModifies__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangModifies__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangModifiesAccess().getCommaKeyword_2_0()); }
	Comma
	{ after(grammarAccess.getSlangModifiesAccess().getCommaKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangModifies__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangModifies__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangModifies__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangModifiesAccess().getExprsAssignment_2_1()); }
	(rule__SlangModifies__ExprsAssignment_2_1)
	{ after(grammarAccess.getSlangModifiesAccess().getExprsAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangEnsures__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangEnsures__Group__0__Impl
	rule__SlangEnsures__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangEnsures__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangEnsuresAccess().getEnsuresKeyword_0()); }
	Ensures
	{ after(grammarAccess.getSlangEnsuresAccess().getEnsuresKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangEnsures__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangEnsures__Group__1__Impl
	rule__SlangEnsures__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangEnsures__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangEnsuresAccess().getExprsAssignment_1()); }
	(rule__SlangEnsures__ExprsAssignment_1)
	{ after(grammarAccess.getSlangEnsuresAccess().getExprsAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangEnsures__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangEnsures__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangEnsures__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangEnsuresAccess().getGroup_2()); }
	(rule__SlangEnsures__Group_2__0)*
	{ after(grammarAccess.getSlangEnsuresAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangEnsures__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangEnsures__Group_2__0__Impl
	rule__SlangEnsures__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangEnsures__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangEnsuresAccess().getCommaKeyword_2_0()); }
	Comma
	{ after(grammarAccess.getSlangEnsuresAccess().getCommaKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangEnsures__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangEnsures__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangEnsures__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangEnsuresAccess().getExprsAssignment_2_1()); }
	(rule__SlangEnsures__ExprsAssignment_2_1)
	{ after(grammarAccess.getSlangEnsuresAccess().getExprsAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangStmt__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangStmt__Group_0__0__Impl
	rule__SlangStmt__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangStmtAccess().getSlangVarDefAction_0_0()); }
	()
	{ after(grammarAccess.getSlangStmtAccess().getSlangVarDefAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangStmt__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangStmtAccess().getDAssignment_0_1()); }
	(rule__SlangStmt__DAssignment_0_1)
	{ after(grammarAccess.getSlangStmtAccess().getDAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangStmt__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangStmt__Group_1__0__Impl
	rule__SlangStmt__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangStmtAccess().getSlangIfStmtAction_1_0()); }
	()
	{ after(grammarAccess.getSlangStmtAccess().getSlangIfStmtAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangStmt__Group_1__1__Impl
	rule__SlangStmt__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangStmtAccess().getIfKeyword_1_1()); }
	If
	{ after(grammarAccess.getSlangStmtAccess().getIfKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangStmt__Group_1__2__Impl
	rule__SlangStmt__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangStmtAccess().getCondAssignment_1_2()); }
	(rule__SlangStmt__CondAssignment_1_2)
	{ after(grammarAccess.getSlangStmtAccess().getCondAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangStmt__Group_1__3__Impl
	rule__SlangStmt__Group_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangStmtAccess().getBAssignment_1_3()); }
	(rule__SlangStmt__BAssignment_1_3)
	{ after(grammarAccess.getSlangStmtAccess().getBAssignment_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_1__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangStmt__Group_1__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_1__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangStmtAccess().getEAssignment_1_4()); }
	(rule__SlangStmt__EAssignment_1_4)?
	{ after(grammarAccess.getSlangStmtAccess().getEAssignment_1_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangStmt__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangStmt__Group_2__0__Impl
	rule__SlangStmt__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangStmtAccess().getSlangWhileStmtAction_2_0()); }
	()
	{ after(grammarAccess.getSlangStmtAccess().getSlangWhileStmtAction_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangStmt__Group_2__1__Impl
	rule__SlangStmt__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangStmtAccess().getWhileKeyword_2_1()); }
	While
	{ after(grammarAccess.getSlangStmtAccess().getWhileKeyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangStmt__Group_2__2__Impl
	rule__SlangStmt__Group_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangStmtAccess().getCondAssignment_2_2()); }
	(rule__SlangStmt__CondAssignment_2_2)
	{ after(grammarAccess.getSlangStmtAccess().getCondAssignment_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangStmt__Group_2__3__Impl
	rule__SlangStmt__Group_2__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangStmtAccess().getLAssignment_2_3()); }
	(rule__SlangStmt__LAssignment_2_3)
	{ after(grammarAccess.getSlangStmtAccess().getLAssignment_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_2__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangStmt__Group_2__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_2__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangStmtAccess().getBAssignment_2_4()); }
	(rule__SlangStmt__BAssignment_2_4)
	{ after(grammarAccess.getSlangStmtAccess().getBAssignment_2_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangStmt__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangStmt__Group_3__0__Impl
	rule__SlangStmt__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangStmtAccess().getSlangMatchStmtAction_3_0()); }
	()
	{ after(grammarAccess.getSlangStmtAccess().getSlangMatchStmtAction_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangStmt__Group_3__1__Impl
	rule__SlangStmt__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangStmtAccess().getMatchKeyword_3_1()); }
	Match
	{ after(grammarAccess.getSlangStmtAccess().getMatchKeyword_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangStmt__Group_3__2__Impl
	rule__SlangStmt__Group_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangStmtAccess().getTestExprAssignment_3_2()); }
	(rule__SlangStmt__TestExprAssignment_3_2)
	{ after(grammarAccess.getSlangStmtAccess().getTestExprAssignment_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_3__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangStmt__Group_3__3__Impl
	rule__SlangStmt__Group_3__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_3__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangStmtAccess().getLeftCurlyBracketKeyword_3_3()); }
	LeftCurlyBracket
	{ after(grammarAccess.getSlangStmtAccess().getLeftCurlyBracketKeyword_3_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_3__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangStmt__Group_3__4__Impl
	rule__SlangStmt__Group_3__5
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_3__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangStmtAccess().getCAssignment_3_4()); }
	(rule__SlangStmt__CAssignment_3_4)*
	{ after(grammarAccess.getSlangStmtAccess().getCAssignment_3_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_3__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangStmt__Group_3__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_3__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangStmtAccess().getRightCurlyBracketKeyword_3_5()); }
	RightCurlyBracket
	{ after(grammarAccess.getSlangStmtAccess().getRightCurlyBracketKeyword_3_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangStmt__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangStmt__Group_4__0__Impl
	rule__SlangStmt__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangStmtAccess().getSlangSpecStmtAction_4_0()); }
	()
	{ after(grammarAccess.getSlangStmtAccess().getSlangSpecStmtAction_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangStmt__Group_4__1__Impl
	rule__SlangStmt__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangStmtAccess().getSpecKeyword_4_1()); }
	Spec
	{ after(grammarAccess.getSlangStmtAccess().getSpecKeyword_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangStmt__Group_4__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangStmtAccess().getBAssignment_4_2()); }
	(rule__SlangStmt__BAssignment_4_2)
	{ after(grammarAccess.getSlangStmtAccess().getBAssignment_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangStmt__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangStmt__Group_5__0__Impl
	rule__SlangStmt__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangStmtAccess().getSlangAssumeStmtAction_5_0()); }
	()
	{ after(grammarAccess.getSlangStmtAccess().getSlangAssumeStmtAction_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangStmt__Group_5__1__Impl
	rule__SlangStmt__Group_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangStmtAccess().getAssumeKeyword_5_1()); }
	Assume
	{ after(grammarAccess.getSlangStmtAccess().getAssumeKeyword_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_5__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangStmt__Group_5__2__Impl
	rule__SlangStmt__Group_5__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_5__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangStmtAccess().getEAssignment_5_2()); }
	(rule__SlangStmt__EAssignment_5_2)
	{ after(grammarAccess.getSlangStmtAccess().getEAssignment_5_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_5__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangStmt__Group_5__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_5__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangStmtAccess().getSLANG_STRINGTerminalRuleCall_5_3()); }
	(RULE_SLANG_STRING)?
	{ after(grammarAccess.getSlangStmtAccess().getSLANG_STRINGTerminalRuleCall_5_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangStmt__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangStmt__Group_6__0__Impl
	rule__SlangStmt__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangStmtAccess().getSlangAssertStmtAction_6_0()); }
	()
	{ after(grammarAccess.getSlangStmtAccess().getSlangAssertStmtAction_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangStmt__Group_6__1__Impl
	rule__SlangStmt__Group_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangStmtAccess().getAssertKeyword_6_1()); }
	Assert
	{ after(grammarAccess.getSlangStmtAccess().getAssertKeyword_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_6__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangStmt__Group_6__2__Impl
	rule__SlangStmt__Group_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_6__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangStmtAccess().getEAssignment_6_2()); }
	(rule__SlangStmt__EAssignment_6_2)
	{ after(grammarAccess.getSlangStmtAccess().getEAssignment_6_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_6__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangStmt__Group_6__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_6__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangStmtAccess().getSLANG_STRINGTerminalRuleCall_6_3()); }
	(RULE_SLANG_STRING)?
	{ after(grammarAccess.getSlangStmtAccess().getSLANG_STRINGTerminalRuleCall_6_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangStmt__Group_7__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangStmt__Group_7__0__Impl
	rule__SlangStmt__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_7__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangStmtAccess().getSlangHaltStmtAction_7_0()); }
	()
	{ after(grammarAccess.getSlangStmtAccess().getSlangHaltStmtAction_7_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_7__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangStmt__Group_7__1__Impl
	rule__SlangStmt__Group_7__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_7__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangStmtAccess().getHaltKeyword_7_1()); }
	Halt
	{ after(grammarAccess.getSlangStmtAccess().getHaltKeyword_7_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_7__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangStmt__Group_7__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_7__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangStmtAccess().getSLANG_STRINGTerminalRuleCall_7_2()); }
	(RULE_SLANG_STRING)?
	{ after(grammarAccess.getSlangStmtAccess().getSLANG_STRINGTerminalRuleCall_7_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangStmt__Group_8__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangStmt__Group_8__0__Impl
	rule__SlangStmt__Group_8__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_8__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangStmtAccess().getSlangDoStmtAction_8_0()); }
	()
	{ after(grammarAccess.getSlangStmtAccess().getSlangDoStmtAction_8_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_8__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangStmt__Group_8__1__Impl
	rule__SlangStmt__Group_8__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_8__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangStmtAccess().getDoKeyword_8_1()); }
	Do
	{ after(grammarAccess.getSlangStmtAccess().getDoKeyword_8_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_8__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangStmt__Group_8__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_8__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangStmtAccess().getEAssignment_8_2()); }
	(rule__SlangStmt__EAssignment_8_2)
	{ after(grammarAccess.getSlangStmtAccess().getEAssignment_8_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangStmt__Group_9__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangStmt__Group_9__0__Impl
	rule__SlangStmt__Group_9__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_9__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangStmtAccess().getSlangIdStmtAction_9_0()); }
	()
	{ after(grammarAccess.getSlangStmtAccess().getSlangIdStmtAction_9_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_9__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangStmt__Group_9__1__Impl
	rule__SlangStmt__Group_9__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_9__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangStmtAccess().getPortOrSubcomponentOrStateVarAssignment_9_1()); }
	(rule__SlangStmt__PortOrSubcomponentOrStateVarAssignment_9_1)
	{ after(grammarAccess.getSlangStmtAccess().getPortOrSubcomponentOrStateVarAssignment_9_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_9__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangStmt__Group_9__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_9__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangStmtAccess().getAlternatives_9_2()); }
	(rule__SlangStmt__Alternatives_9_2)
	{ after(grammarAccess.getSlangStmtAccess().getAlternatives_9_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangStmt__Group_9_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangStmt__Group_9_2_1__0__Impl
	rule__SlangStmt__Group_9_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_9_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangStmtAccess().getLAssignment_9_2_1_0()); }
	(rule__SlangStmt__LAssignment_9_2_1_0)*
	{ after(grammarAccess.getSlangStmtAccess().getLAssignment_9_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_9_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangStmt__Group_9_2_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_9_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangStmtAccess().getGroup_9_2_1_1()); }
	(rule__SlangStmt__Group_9_2_1_1__0)?
	{ after(grammarAccess.getSlangStmtAccess().getGroup_9_2_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangStmt__Group_9_2_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangStmt__Group_9_2_1_1__0__Impl
	rule__SlangStmt__Group_9_2_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_9_2_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangStmtAccess().getAlternatives_9_2_1_1_0()); }
	(rule__SlangStmt__Alternatives_9_2_1_1_0)
	{ after(grammarAccess.getSlangStmtAccess().getAlternatives_9_2_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_9_2_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangStmt__Group_9_2_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__Group_9_2_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangStmtAccess().getEAssignment_9_2_1_1_1()); }
	(rule__SlangStmt__EAssignment_9_2_1_1_1)
	{ after(grammarAccess.getSlangStmtAccess().getEAssignment_9_2_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangElse__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangElse__Group__0__Impl
	rule__SlangElse__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangElse__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangElseAccess().getElseKeyword_0()); }
	Else
	{ after(grammarAccess.getSlangElseAccess().getElseKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangElse__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangElse__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangElse__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangElseAccess().getAlternatives_1()); }
	(rule__SlangElse__Alternatives_1)
	{ after(grammarAccess.getSlangElseAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangElse__Group_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangElse__Group_1_0__0__Impl
	rule__SlangElse__Group_1_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangElse__Group_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangElseAccess().getIfKeyword_1_0_0()); }
	If
	{ after(grammarAccess.getSlangElseAccess().getIfKeyword_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangElse__Group_1_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangElse__Group_1_0__1__Impl
	rule__SlangElse__Group_1_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangElse__Group_1_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangElseAccess().getCondAssignment_1_0_1()); }
	(rule__SlangElse__CondAssignment_1_0_1)
	{ after(grammarAccess.getSlangElseAccess().getCondAssignment_1_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangElse__Group_1_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangElse__Group_1_0__2__Impl
	rule__SlangElse__Group_1_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangElse__Group_1_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangElseAccess().getBAssignment_1_0_2()); }
	(rule__SlangElse__BAssignment_1_0_2)
	{ after(grammarAccess.getSlangElseAccess().getBAssignment_1_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangElse__Group_1_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangElse__Group_1_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangElse__Group_1_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangElseAccess().getEAssignment_1_0_3()); }
	(rule__SlangElse__EAssignment_1_0_3)?
	{ after(grammarAccess.getSlangElseAccess().getEAssignment_1_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangLoopContract__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangLoopContract__Group__0__Impl
	rule__SlangLoopContract__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLoopContract__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangLoopContractAccess().getSlangLoopContractAction_0()); }
	()
	{ after(grammarAccess.getSlangLoopContractAccess().getSlangLoopContractAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLoopContract__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangLoopContract__Group__1__Impl
	rule__SlangLoopContract__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLoopContract__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangLoopContractAccess().getInvAssignment_1()); }
	(rule__SlangLoopContract__InvAssignment_1)?
	{ after(grammarAccess.getSlangLoopContractAccess().getInvAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLoopContract__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangLoopContract__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLoopContract__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangLoopContractAccess().getModAssignment_2()); }
	(rule__SlangLoopContract__ModAssignment_2)?
	{ after(grammarAccess.getSlangLoopContractAccess().getModAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangLHSSuffix__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangLHSSuffix__Group_0__0__Impl
	rule__SlangLHSSuffix__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLHSSuffix__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangLHSSuffixAccess().getSlangFieldLookupAction_0_0()); }
	()
	{ after(grammarAccess.getSlangLHSSuffixAccess().getSlangFieldLookupAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLHSSuffix__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangLHSSuffix__Group_0__1__Impl
	rule__SlangLHSSuffix__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLHSSuffix__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangLHSSuffixAccess().getFullStopKeyword_0_1()); }
	FullStop
	{ after(grammarAccess.getSlangLHSSuffixAccess().getFullStopKeyword_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLHSSuffix__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangLHSSuffix__Group_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLHSSuffix__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangLHSSuffixAccess().getIDTerminalRuleCall_0_2()); }
	RULE_ID
	{ after(grammarAccess.getSlangLHSSuffixAccess().getIDTerminalRuleCall_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangLHSSuffix__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangLHSSuffix__Group_1__0__Impl
	rule__SlangLHSSuffix__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLHSSuffix__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangLHSSuffixAccess().getSlangMethodCallAction_1_0()); }
	()
	{ after(grammarAccess.getSlangLHSSuffixAccess().getSlangMethodCallAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLHSSuffix__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangLHSSuffix__Group_1__1__Impl
	rule__SlangLHSSuffix__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLHSSuffix__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangLHSSuffixAccess().getLeftParenthesisKeyword_1_1()); }
	LeftParenthesis
	{ after(grammarAccess.getSlangLHSSuffixAccess().getLeftParenthesisKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLHSSuffix__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangLHSSuffix__Group_1__2__Impl
	rule__SlangLHSSuffix__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLHSSuffix__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangLHSSuffixAccess().getGroup_1_2()); }
	(rule__SlangLHSSuffix__Group_1_2__0)?
	{ after(grammarAccess.getSlangLHSSuffixAccess().getGroup_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLHSSuffix__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangLHSSuffix__Group_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLHSSuffix__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangLHSSuffixAccess().getRightParenthesisKeyword_1_3()); }
	RightParenthesis
	{ after(grammarAccess.getSlangLHSSuffixAccess().getRightParenthesisKeyword_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangLHSSuffix__Group_1_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangLHSSuffix__Group_1_2__0__Impl
	rule__SlangLHSSuffix__Group_1_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLHSSuffix__Group_1_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangLHSSuffixAccess().getExprsAssignment_1_2_0()); }
	(rule__SlangLHSSuffix__ExprsAssignment_1_2_0)
	{ after(grammarAccess.getSlangLHSSuffixAccess().getExprsAssignment_1_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLHSSuffix__Group_1_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangLHSSuffix__Group_1_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLHSSuffix__Group_1_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangLHSSuffixAccess().getGroup_1_2_1()); }
	(rule__SlangLHSSuffix__Group_1_2_1__0)*
	{ after(grammarAccess.getSlangLHSSuffixAccess().getGroup_1_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangLHSSuffix__Group_1_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangLHSSuffix__Group_1_2_1__0__Impl
	rule__SlangLHSSuffix__Group_1_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLHSSuffix__Group_1_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangLHSSuffixAccess().getCommaKeyword_1_2_1_0()); }
	Comma
	{ after(grammarAccess.getSlangLHSSuffixAccess().getCommaKeyword_1_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLHSSuffix__Group_1_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangLHSSuffix__Group_1_2_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLHSSuffix__Group_1_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangLHSSuffixAccess().getExprsAssignment_1_2_1_1()); }
	(rule__SlangLHSSuffix__ExprsAssignment_1_2_1_1)
	{ after(grammarAccess.getSlangLHSSuffixAccess().getExprsAssignment_1_2_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangCase__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangCase__Group__0__Impl
	rule__SlangCase__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangCase__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangCaseAccess().getCaseKeyword_0()); }
	Case
	{ after(grammarAccess.getSlangCaseAccess().getCaseKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangCase__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangCase__Group__1__Impl
	rule__SlangCase__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangCase__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangCaseAccess().getPatternAssignment_1()); }
	(rule__SlangCase__PatternAssignment_1)
	{ after(grammarAccess.getSlangCaseAccess().getPatternAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangCase__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangCase__Group__2__Impl
	rule__SlangCase__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangCase__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangCaseAccess().getGroup_2()); }
	(rule__SlangCase__Group_2__0)?
	{ after(grammarAccess.getSlangCaseAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangCase__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangCase__Group__3__Impl
	rule__SlangCase__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangCase__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangCaseAccess().getEqualsSignGreaterThanSignKeyword_3()); }
	EqualsSignGreaterThanSign
	{ after(grammarAccess.getSlangCaseAccess().getEqualsSignGreaterThanSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangCase__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangCase__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangCase__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangCaseAccess().getSAssignment_4()); }
	(rule__SlangCase__SAssignment_4)*
	{ after(grammarAccess.getSlangCaseAccess().getSAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangCase__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangCase__Group_2__0__Impl
	rule__SlangCase__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangCase__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangCaseAccess().getIfKeyword_2_0()); }
	If
	{ after(grammarAccess.getSlangCaseAccess().getIfKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangCase__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangCase__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangCase__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangCaseAccess().getEAssignment_2_1()); }
	(rule__SlangCase__EAssignment_2_1)
	{ after(grammarAccess.getSlangCaseAccess().getEAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangPattern__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangPattern__Group_0__0__Impl
	rule__SlangPattern__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangPattern__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangPatternAccess().getSlangPatternAction_0_0()); }
	()
	{ after(grammarAccess.getSlangPatternAccess().getSlangPatternAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangPattern__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangPattern__Group_0__1__Impl
	rule__SlangPattern__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangPattern__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangPatternAccess().getIDTerminalRuleCall_0_1()); }
	RULE_ID
	{ after(grammarAccess.getSlangPatternAccess().getIDTerminalRuleCall_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangPattern__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangPattern__Group_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangPattern__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangPatternAccess().getGroup_0_2()); }
	(rule__SlangPattern__Group_0_2__0)?
	{ after(grammarAccess.getSlangPatternAccess().getGroup_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangPattern__Group_0_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangPattern__Group_0_2__0__Impl
	rule__SlangPattern__Group_0_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangPattern__Group_0_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangPatternAccess().getLeftParenthesisKeyword_0_2_0()); }
	LeftParenthesis
	{ after(grammarAccess.getSlangPatternAccess().getLeftParenthesisKeyword_0_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangPattern__Group_0_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangPattern__Group_0_2__1__Impl
	rule__SlangPattern__Group_0_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangPattern__Group_0_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangPatternAccess().getPatternsAssignment_0_2_1()); }
	(rule__SlangPattern__PatternsAssignment_0_2_1)
	{ after(grammarAccess.getSlangPatternAccess().getPatternsAssignment_0_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangPattern__Group_0_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangPattern__Group_0_2__2__Impl
	rule__SlangPattern__Group_0_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangPattern__Group_0_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangPatternAccess().getGroup_0_2_2()); }
	(rule__SlangPattern__Group_0_2_2__0)*
	{ after(grammarAccess.getSlangPatternAccess().getGroup_0_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangPattern__Group_0_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangPattern__Group_0_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangPattern__Group_0_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangPatternAccess().getRightParenthesisKeyword_0_2_3()); }
	RightParenthesis
	{ after(grammarAccess.getSlangPatternAccess().getRightParenthesisKeyword_0_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangPattern__Group_0_2_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangPattern__Group_0_2_2__0__Impl
	rule__SlangPattern__Group_0_2_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangPattern__Group_0_2_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangPatternAccess().getCommaKeyword_0_2_2_0()); }
	Comma
	{ after(grammarAccess.getSlangPatternAccess().getCommaKeyword_0_2_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangPattern__Group_0_2_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangPattern__Group_0_2_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangPattern__Group_0_2_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangPatternAccess().getPatternsAssignment_0_2_2_1()); }
	(rule__SlangPattern__PatternsAssignment_0_2_2_1)
	{ after(grammarAccess.getSlangPatternAccess().getPatternsAssignment_0_2_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangPattern__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangPattern__Group_1__0__Impl
	rule__SlangPattern__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangPattern__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangPatternAccess().getLeftParenthesisKeyword_1_0()); }
	LeftParenthesis
	{ after(grammarAccess.getSlangPatternAccess().getLeftParenthesisKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangPattern__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangPattern__Group_1__1__Impl
	rule__SlangPattern__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangPattern__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangPatternAccess().getPatternsAssignment_1_1()); }
	(rule__SlangPattern__PatternsAssignment_1_1)
	{ after(grammarAccess.getSlangPatternAccess().getPatternsAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangPattern__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangPattern__Group_1__2__Impl
	rule__SlangPattern__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangPattern__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangPatternAccess().getGroup_1_2()); }
	(rule__SlangPattern__Group_1_2__0)*
	{ after(grammarAccess.getSlangPatternAccess().getGroup_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangPattern__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangPattern__Group_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangPattern__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangPatternAccess().getRightParenthesisKeyword_1_3()); }
	RightParenthesis
	{ after(grammarAccess.getSlangPatternAccess().getRightParenthesisKeyword_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangPattern__Group_1_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangPattern__Group_1_2__0__Impl
	rule__SlangPattern__Group_1_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangPattern__Group_1_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangPatternAccess().getCommaKeyword_1_2_0()); }
	Comma
	{ after(grammarAccess.getSlangPatternAccess().getCommaKeyword_1_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangPattern__Group_1_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangPattern__Group_1_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangPattern__Group_1_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangPatternAccess().getPatternsAssignment_1_2_1()); }
	(rule__SlangPattern__PatternsAssignment_1_2_1)
	{ after(grammarAccess.getSlangPatternAccess().getPatternsAssignment_1_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangTPattern__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTPattern__Group_0__0__Impl
	rule__SlangTPattern__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTPattern__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTPatternAccess().getSlangTPatternAction_0_0()); }
	()
	{ after(grammarAccess.getSlangTPatternAccess().getSlangTPatternAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTPattern__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTPattern__Group_0__1__Impl
	rule__SlangTPattern__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTPattern__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTPatternAccess().getIDTerminalRuleCall_0_1()); }
	RULE_ID
	{ after(grammarAccess.getSlangTPatternAccess().getIDTerminalRuleCall_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTPattern__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTPattern__Group_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTPattern__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTPatternAccess().getAlternatives_0_2()); }
	(rule__SlangTPattern__Alternatives_0_2)?
	{ after(grammarAccess.getSlangTPatternAccess().getAlternatives_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangTPattern__Group_0_2_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTPattern__Group_0_2_0__0__Impl
	rule__SlangTPattern__Group_0_2_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTPattern__Group_0_2_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTPatternAccess().getLeftParenthesisKeyword_0_2_0_0()); }
	LeftParenthesis
	{ after(grammarAccess.getSlangTPatternAccess().getLeftParenthesisKeyword_0_2_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTPattern__Group_0_2_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTPattern__Group_0_2_0__1__Impl
	rule__SlangTPattern__Group_0_2_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTPattern__Group_0_2_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTPatternAccess().getPatternsAssignment_0_2_0_1()); }
	(rule__SlangTPattern__PatternsAssignment_0_2_0_1)
	{ after(grammarAccess.getSlangTPatternAccess().getPatternsAssignment_0_2_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTPattern__Group_0_2_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTPattern__Group_0_2_0__2__Impl
	rule__SlangTPattern__Group_0_2_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTPattern__Group_0_2_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTPatternAccess().getGroup_0_2_0_2()); }
	(rule__SlangTPattern__Group_0_2_0_2__0)*
	{ after(grammarAccess.getSlangTPatternAccess().getGroup_0_2_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTPattern__Group_0_2_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTPattern__Group_0_2_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTPattern__Group_0_2_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTPatternAccess().getRightParenthesisKeyword_0_2_0_3()); }
	RightParenthesis
	{ after(grammarAccess.getSlangTPatternAccess().getRightParenthesisKeyword_0_2_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangTPattern__Group_0_2_0_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTPattern__Group_0_2_0_2__0__Impl
	rule__SlangTPattern__Group_0_2_0_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTPattern__Group_0_2_0_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTPatternAccess().getCommaKeyword_0_2_0_2_0()); }
	Comma
	{ after(grammarAccess.getSlangTPatternAccess().getCommaKeyword_0_2_0_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTPattern__Group_0_2_0_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTPattern__Group_0_2_0_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTPattern__Group_0_2_0_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTPatternAccess().getPatternsAssignment_0_2_0_2_1()); }
	(rule__SlangTPattern__PatternsAssignment_0_2_0_2_1)
	{ after(grammarAccess.getSlangTPatternAccess().getPatternsAssignment_0_2_0_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangTPattern__Group_0_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTPattern__Group_0_2_1__0__Impl
	rule__SlangTPattern__Group_0_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTPattern__Group_0_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTPatternAccess().getColonKeyword_0_2_1_0()); }
	Colon
	{ after(grammarAccess.getSlangTPatternAccess().getColonKeyword_0_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTPattern__Group_0_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTPattern__Group_0_2_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTPattern__Group_0_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTPatternAccess().getTypeAssignment_0_2_1_1()); }
	(rule__SlangTPattern__TypeAssignment_0_2_1_1)
	{ after(grammarAccess.getSlangTPatternAccess().getTypeAssignment_0_2_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangTPattern__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTPattern__Group_1__0__Impl
	rule__SlangTPattern__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTPattern__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTPatternAccess().getLeftParenthesisKeyword_1_0()); }
	LeftParenthesis
	{ after(grammarAccess.getSlangTPatternAccess().getLeftParenthesisKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTPattern__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTPattern__Group_1__1__Impl
	rule__SlangTPattern__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTPattern__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTPatternAccess().getPatternsAssignment_1_1()); }
	(rule__SlangTPattern__PatternsAssignment_1_1)
	{ after(grammarAccess.getSlangTPatternAccess().getPatternsAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTPattern__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTPattern__Group_1__2__Impl
	rule__SlangTPattern__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTPattern__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTPatternAccess().getGroup_1_2()); }
	(rule__SlangTPattern__Group_1_2__0)*
	{ after(grammarAccess.getSlangTPatternAccess().getGroup_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTPattern__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTPattern__Group_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTPattern__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTPatternAccess().getRightParenthesisKeyword_1_3()); }
	RightParenthesis
	{ after(grammarAccess.getSlangTPatternAccess().getRightParenthesisKeyword_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangTPattern__Group_1_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTPattern__Group_1_2__0__Impl
	rule__SlangTPattern__Group_1_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTPattern__Group_1_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTPatternAccess().getCommaKeyword_1_2_0()); }
	Comma
	{ after(grammarAccess.getSlangTPatternAccess().getCommaKeyword_1_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTPattern__Group_1_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTPattern__Group_1_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTPattern__Group_1_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTPatternAccess().getPatternsAssignment_1_2_1()); }
	(rule__SlangTPattern__PatternsAssignment_1_2_1)
	{ after(grammarAccess.getSlangTPatternAccess().getPatternsAssignment_1_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangTPattern__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTPattern__Group_2__0__Impl
	rule__SlangTPattern__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTPattern__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTPatternAccess().getSlangTPatternAction_2_0()); }
	()
	{ after(grammarAccess.getSlangTPatternAccess().getSlangTPatternAction_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTPattern__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTPattern__Group_2__1__Impl
	rule__SlangTPattern__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTPattern__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTPatternAccess().get_Keyword_2_1()); }
	KW__
	{ after(grammarAccess.getSlangTPatternAccess().get_Keyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTPattern__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTPattern__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTPattern__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTPatternAccess().getGroup_2_2()); }
	(rule__SlangTPattern__Group_2_2__0)?
	{ after(grammarAccess.getSlangTPatternAccess().getGroup_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangTPattern__Group_2_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTPattern__Group_2_2__0__Impl
	rule__SlangTPattern__Group_2_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTPattern__Group_2_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTPatternAccess().getColonKeyword_2_2_0()); }
	Colon
	{ after(grammarAccess.getSlangTPatternAccess().getColonKeyword_2_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTPattern__Group_2_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTPattern__Group_2_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTPattern__Group_2_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTPatternAccess().getTypeAssignment_2_2_1()); }
	(rule__SlangTPattern__TypeAssignment_2_2_1)
	{ after(grammarAccess.getSlangTPatternAccess().getTypeAssignment_2_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangVarDef__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangVarDef__Group__0__Impl
	rule__SlangVarDef__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangVarDef__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangVarDefAccess().getSlangVarModParserRuleCall_0()); }
	ruleSlangVarMod
	{ after(grammarAccess.getSlangVarDefAccess().getSlangVarModParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangVarDef__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangVarDef__Group__1__Impl
	rule__SlangVarDef__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangVarDef__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangVarDefAccess().getSlangPatternParserRuleCall_1()); }
	ruleSlangPattern
	{ after(grammarAccess.getSlangVarDefAccess().getSlangPatternParserRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangVarDef__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangVarDef__Group__2__Impl
	rule__SlangVarDef__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangVarDef__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangVarDefAccess().getGroup_2()); }
	(rule__SlangVarDef__Group_2__0)?
	{ after(grammarAccess.getSlangVarDefAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangVarDef__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangVarDef__Group__3__Impl
	rule__SlangVarDef__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangVarDef__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangVarDefAccess().getColonEqualsSignKeyword_3()); }
	ColonEqualsSign
	{ after(grammarAccess.getSlangVarDefAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangVarDef__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangVarDef__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangVarDef__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangVarDefAccess().getInitAssignment_4()); }
	(rule__SlangVarDef__InitAssignment_4)
	{ after(grammarAccess.getSlangVarDefAccess().getInitAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangVarDef__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangVarDef__Group_2__0__Impl
	rule__SlangVarDef__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangVarDef__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangVarDefAccess().getColonKeyword_2_0()); }
	Colon
	{ after(grammarAccess.getSlangVarDefAccess().getColonKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangVarDef__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangVarDef__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangVarDef__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangVarDefAccess().getTypeNameAssignment_2_1()); }
	(rule__SlangVarDef__TypeNameAssignment_2_1)
	{ after(grammarAccess.getSlangVarDefAccess().getTypeNameAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Expr__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expr__Group_0__0__Impl
	rule__Expr__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Expr__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExprAccess().getBasicExpAction_0_0()); }
	()
	{ after(grammarAccess.getExprAccess().getBasicExpAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expr__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expr__Group_0__1__Impl
	rule__Expr__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Expr__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExprAccess().getTermsAssignment_0_1()); }
	(rule__Expr__TermsAssignment_0_1)
	{ after(grammarAccess.getExprAccess().getTermsAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expr__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expr__Group_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Expr__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExprAccess().getAlternatives_0_2()); }
	(rule__Expr__Alternatives_0_2)
	{ after(grammarAccess.getExprAccess().getAlternatives_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Expr__Group_0_2_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expr__Group_0_2_0__0__Impl
	rule__Expr__Group_0_2_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Expr__Group_0_2_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExprAccess().getOpsAssignment_0_2_0_0()); }
	(rule__Expr__OpsAssignment_0_2_0_0)
	{ after(grammarAccess.getExprAccess().getOpsAssignment_0_2_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expr__Group_0_2_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expr__Group_0_2_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Expr__Group_0_2_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExprAccess().getTermsAssignment_0_2_0_1()); }
	(rule__Expr__TermsAssignment_0_2_0_1)
	{ after(grammarAccess.getExprAccess().getTermsAssignment_0_2_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Expr__Group_0_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expr__Group_0_2_1__0__Impl
	rule__Expr__Group_0_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Expr__Group_0_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExprAccess().getQuestionMarkKeyword_0_2_1_0()); }
	QuestionMark
	{ after(grammarAccess.getExprAccess().getQuestionMarkKeyword_0_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expr__Group_0_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expr__Group_0_2_1__1__Impl
	rule__Expr__Group_0_2_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Expr__Group_0_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExprAccess().getThenExprAssignment_0_2_1_1()); }
	(rule__Expr__ThenExprAssignment_0_2_1_1)
	{ after(grammarAccess.getExprAccess().getThenExprAssignment_0_2_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expr__Group_0_2_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expr__Group_0_2_1__2__Impl
	rule__Expr__Group_0_2_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Expr__Group_0_2_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExprAccess().getColonKeyword_0_2_1_2()); }
	Colon
	{ after(grammarAccess.getExprAccess().getColonKeyword_0_2_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expr__Group_0_2_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expr__Group_0_2_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Expr__Group_0_2_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExprAccess().getElseExprAssignment_0_2_1_3()); }
	(rule__Expr__ElseExprAssignment_0_2_1_3)
	{ after(grammarAccess.getExprAccess().getElseExprAssignment_0_2_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Expr__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expr__Group_1__0__Impl
	rule__Expr__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Expr__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExprAccess().getQuantifiedExpAction_1_0()); }
	()
	{ after(grammarAccess.getExprAccess().getQuantifiedExpAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expr__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expr__Group_1__1__Impl
	rule__Expr__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Expr__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExprAccess().getAlternatives_1_1()); }
	(rule__Expr__Alternatives_1_1)
	{ after(grammarAccess.getExprAccess().getAlternatives_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expr__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expr__Group_1__2__Impl
	rule__Expr__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Expr__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExprAccess().getQVarAssignment_1_2()); }
	(rule__Expr__QVarAssignment_1_2)
	{ after(grammarAccess.getExprAccess().getQVarAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expr__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expr__Group_1__3__Impl
	rule__Expr__Group_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Expr__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExprAccess().getGroup_1_3()); }
	(rule__Expr__Group_1_3__0)*
	{ after(grammarAccess.getExprAccess().getGroup_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expr__Group_1__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expr__Group_1__4__Impl
	rule__Expr__Group_1__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Expr__Group_1__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExprAccess().getEqualsSignGreaterThanSignKeyword_1_4()); }
	EqualsSignGreaterThanSign
	{ after(grammarAccess.getExprAccess().getEqualsSignGreaterThanSignKeyword_1_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expr__Group_1__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expr__Group_1__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Expr__Group_1__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExprAccess().getQuantifiedExprAssignment_1_5()); }
	(rule__Expr__QuantifiedExprAssignment_1_5)
	{ after(grammarAccess.getExprAccess().getQuantifiedExprAssignment_1_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Expr__Group_1_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expr__Group_1_3__0__Impl
	rule__Expr__Group_1_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Expr__Group_1_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExprAccess().getCommaKeyword_1_3_0()); }
	Comma
	{ after(grammarAccess.getExprAccess().getCommaKeyword_1_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expr__Group_1_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expr__Group_1_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Expr__Group_1_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExprAccess().getQVarAssignment_1_3_1()); }
	(rule__Expr__QVarAssignment_1_3_1)
	{ after(grammarAccess.getExprAccess().getQVarAssignment_1_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Expr__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expr__Group_2__0__Impl
	rule__Expr__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Expr__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExprAccess().getUnaryExpAction_2_0()); }
	()
	{ after(grammarAccess.getExprAccess().getUnaryExpAction_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expr__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expr__Group_2__1__Impl
	rule__Expr__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Expr__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExprAccess().getOpAssignment_2_1()); }
	(rule__Expr__OpAssignment_2_1)
	{ after(grammarAccess.getExprAccess().getOpAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expr__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expr__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Expr__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExprAccess().getAccessExpAssignment_2_2()); }
	(rule__Expr__AccessExpAssignment_2_2)
	{ after(grammarAccess.getExprAccess().getAccessExpAssignment_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangQuantVar__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangQuantVar__Group__0__Impl
	rule__SlangQuantVar__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangQuantVar__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangQuantVarAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
	{ after(grammarAccess.getSlangQuantVarAccess().getIDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangQuantVar__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangQuantVar__Group__1__Impl
	rule__SlangQuantVar__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangQuantVar__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangQuantVarAccess().getColonKeyword_1()); }
	Colon
	{ after(grammarAccess.getSlangQuantVarAccess().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangQuantVar__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangQuantVar__Group__2__Impl
	rule__SlangQuantVar__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangQuantVar__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangQuantVarAccess().getEAssignment_2()); }
	(rule__SlangQuantVar__EAssignment_2)
	{ after(grammarAccess.getSlangQuantVarAccess().getEAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangQuantVar__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangQuantVar__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangQuantVar__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangQuantVarAccess().getGroup_3()); }
	(rule__SlangQuantVar__Group_3__0)?
	{ after(grammarAccess.getSlangQuantVarAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangQuantVar__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangQuantVar__Group_3__0__Impl
	rule__SlangQuantVar__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangQuantVar__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangQuantVarAccess().getAlternatives_3_0()); }
	(rule__SlangQuantVar__Alternatives_3_0)
	{ after(grammarAccess.getSlangQuantVarAccess().getAlternatives_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangQuantVar__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangQuantVar__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangQuantVar__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangQuantVarAccess().getUpperBoundAssignment_3_1()); }
	(rule__SlangQuantVar__UpperBoundAssignment_3_1)
	{ after(grammarAccess.getSlangQuantVarAccess().getUpperBoundAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangBlock__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangBlock__Group__0__Impl
	rule__SlangBlock__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangBlock__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangBlockAccess().getSlangBlockAction_0()); }
	()
	{ after(grammarAccess.getSlangBlockAccess().getSlangBlockAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangBlock__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangBlock__Group__1__Impl
	rule__SlangBlock__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangBlock__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangBlockAccess().getLeftCurlyBracketKeyword_1()); }
	LeftCurlyBracket
	{ after(grammarAccess.getSlangBlockAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangBlock__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangBlock__Group__2__Impl
	rule__SlangBlock__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangBlock__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangBlockAccess().getStmtsAssignment_2()); }
	(rule__SlangBlock__StmtsAssignment_2)*
	{ after(grammarAccess.getSlangBlockAccess().getStmtsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangBlock__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangBlock__Group__3__Impl
	rule__SlangBlock__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangBlock__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangBlockAccess().getRAssignment_3()); }
	(rule__SlangBlock__RAssignment_3)?
	{ after(grammarAccess.getSlangBlockAccess().getRAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangBlock__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangBlock__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangBlock__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangBlockAccess().getRightCurlyBracketKeyword_4()); }
	RightCurlyBracket
	{ after(grammarAccess.getSlangBlockAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangAccess__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangAccess__Group__0__Impl
	rule__SlangAccess__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangAccess__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangAccessAccess().getSlangAccessAction_0()); }
	()
	{ after(grammarAccess.getSlangAccessAccess().getSlangAccessAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangAccess__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangAccess__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangAccess__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangAccessAccess().getTAssignment_1()); }
	(rule__SlangAccess__TAssignment_1)
	{ after(grammarAccess.getSlangAccessAccess().getTAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangTerm__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_0__0__Impl
	rule__SlangTerm__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getSlangLitTermAction_0_0()); }
	()
	{ after(grammarAccess.getSlangTermAccess().getSlangLitTermAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getLitAssignment_0_1()); }
	(rule__SlangTerm__LitAssignment_0_1)
	{ after(grammarAccess.getSlangTermAccess().getLitAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangTerm__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_1__0__Impl
	rule__SlangTerm__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getSlangInterpTermAction_1_0()); }
	()
	{ after(grammarAccess.getSlangTermAccess().getSlangInterpTermAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getIAssignment_1_1()); }
	(rule__SlangTerm__IAssignment_1_1)
	{ after(grammarAccess.getSlangTermAccess().getIAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangTerm__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_2__0__Impl
	rule__SlangTerm__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getGroup_2_0()); }
	(rule__SlangTerm__Group_2_0__0)
	{ after(grammarAccess.getSlangTermAccess().getGroup_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_2__1__Impl
	rule__SlangTerm__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getStateVarAssignment_2_1()); }
	(rule__SlangTerm__StateVarAssignment_2_1)
	{ after(grammarAccess.getSlangTermAccess().getStateVarAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getRightParenthesisKeyword_2_2()); }
	RightParenthesis
	{ after(grammarAccess.getSlangTermAccess().getRightParenthesisKeyword_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangTerm__Group_2_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_2_0__0__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_2_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getGroup_2_0_0()); }
	(rule__SlangTerm__Group_2_0_0__0)
	{ after(grammarAccess.getSlangTermAccess().getGroup_2_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangTerm__Group_2_0_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_2_0_0__0__Impl
	rule__SlangTerm__Group_2_0_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_2_0_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getInStateExprAction_2_0_0_0()); }
	()
	{ after(grammarAccess.getSlangTermAccess().getInStateExprAction_2_0_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_2_0_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_2_0_0__1__Impl
	rule__SlangTerm__Group_2_0_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_2_0_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getInKeyword_2_0_0_1()); }
	In_1
	{ after(grammarAccess.getSlangTermAccess().getInKeyword_2_0_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_2_0_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_2_0_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_2_0_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getLeftParenthesisKeyword_2_0_0_2()); }
	LeftParenthesis
	{ after(grammarAccess.getSlangTermAccess().getLeftParenthesisKeyword_2_0_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangTerm__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_3__0__Impl
	rule__SlangTerm__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getGroup_3_0()); }
	(rule__SlangTerm__Group_3_0__0)
	{ after(grammarAccess.getSlangTermAccess().getGroup_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_3__1__Impl
	rule__SlangTerm__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getEventPortAssignment_3_1()); }
	(rule__SlangTerm__EventPortAssignment_3_1)
	{ after(grammarAccess.getSlangTermAccess().getEventPortAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_3__2__Impl
	rule__SlangTerm__Group_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getCommaKeyword_3_2()); }
	Comma
	{ after(grammarAccess.getSlangTermAccess().getCommaKeyword_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_3__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_3__3__Impl
	rule__SlangTerm__Group_3__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_3__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getValueAssignment_3_3()); }
	(rule__SlangTerm__ValueAssignment_3_3)
	{ after(grammarAccess.getSlangTermAccess().getValueAssignment_3_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_3__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_3__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_3__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getRightParenthesisKeyword_3_4()); }
	RightParenthesis
	{ after(grammarAccess.getSlangTermAccess().getRightParenthesisKeyword_3_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangTerm__Group_3_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_3_0__0__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_3_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getGroup_3_0_0()); }
	(rule__SlangTerm__Group_3_0_0__0)
	{ after(grammarAccess.getSlangTermAccess().getGroup_3_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangTerm__Group_3_0_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_3_0_0__0__Impl
	rule__SlangTerm__Group_3_0_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_3_0_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getMaySendExprAction_3_0_0_0()); }
	()
	{ after(grammarAccess.getSlangTermAccess().getMaySendExprAction_3_0_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_3_0_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_3_0_0__1__Impl
	rule__SlangTerm__Group_3_0_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_3_0_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getMaySendKeyword_3_0_0_1()); }
	MaySend
	{ after(grammarAccess.getSlangTermAccess().getMaySendKeyword_3_0_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_3_0_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_3_0_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_3_0_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getLeftParenthesisKeyword_3_0_0_2()); }
	LeftParenthesis
	{ after(grammarAccess.getSlangTermAccess().getLeftParenthesisKeyword_3_0_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangTerm__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_4__0__Impl
	rule__SlangTerm__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getGroup_4_0()); }
	(rule__SlangTerm__Group_4_0__0)
	{ after(grammarAccess.getSlangTermAccess().getGroup_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_4__1__Impl
	rule__SlangTerm__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getEventPortAssignment_4_1()); }
	(rule__SlangTerm__EventPortAssignment_4_1)
	{ after(grammarAccess.getSlangTermAccess().getEventPortAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_4__2__Impl
	rule__SlangTerm__Group_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getCommaKeyword_4_2()); }
	Comma
	{ after(grammarAccess.getSlangTermAccess().getCommaKeyword_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_4__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_4__3__Impl
	rule__SlangTerm__Group_4__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_4__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getValueAssignment_4_3()); }
	(rule__SlangTerm__ValueAssignment_4_3)
	{ after(grammarAccess.getSlangTermAccess().getValueAssignment_4_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_4__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_4__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_4__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getRightParenthesisKeyword_4_4()); }
	RightParenthesis
	{ after(grammarAccess.getSlangTermAccess().getRightParenthesisKeyword_4_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangTerm__Group_4_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_4_0__0__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_4_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getGroup_4_0_0()); }
	(rule__SlangTerm__Group_4_0_0__0)
	{ after(grammarAccess.getSlangTermAccess().getGroup_4_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangTerm__Group_4_0_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_4_0_0__0__Impl
	rule__SlangTerm__Group_4_0_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_4_0_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getMustSendExprAction_4_0_0_0()); }
	()
	{ after(grammarAccess.getSlangTermAccess().getMustSendExprAction_4_0_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_4_0_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_4_0_0__1__Impl
	rule__SlangTerm__Group_4_0_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_4_0_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getMustSendKeyword_4_0_0_1()); }
	MustSend
	{ after(grammarAccess.getSlangTermAccess().getMustSendKeyword_4_0_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_4_0_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_4_0_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_4_0_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getLeftParenthesisKeyword_4_0_0_2()); }
	LeftParenthesis
	{ after(grammarAccess.getSlangTermAccess().getLeftParenthesisKeyword_4_0_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangTerm__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_5__0__Impl
	rule__SlangTerm__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getGroup_5_0()); }
	(rule__SlangTerm__Group_5_0__0)
	{ after(grammarAccess.getSlangTermAccess().getGroup_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_5__1__Impl
	rule__SlangTerm__Group_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getEnumTypeAssignment_5_1()); }
	(rule__SlangTerm__EnumTypeAssignment_5_1)
	{ after(grammarAccess.getSlangTermAccess().getEnumTypeAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_5__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_5__2__Impl
	rule__SlangTerm__Group_5__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_5__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getCommaKeyword_5_2()); }
	Comma
	{ after(grammarAccess.getSlangTermAccess().getCommaKeyword_5_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_5__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_5__3__Impl
	rule__SlangTerm__Group_5__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_5__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getValueAssignment_5_3()); }
	(rule__SlangTerm__ValueAssignment_5_3)
	{ after(grammarAccess.getSlangTermAccess().getValueAssignment_5_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_5__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_5__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_5__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getRightParenthesisKeyword_5_4()); }
	RightParenthesis
	{ after(grammarAccess.getSlangTermAccess().getRightParenthesisKeyword_5_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangTerm__Group_5_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_5_0__0__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_5_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getGroup_5_0_0()); }
	(rule__SlangTerm__Group_5_0_0__0)
	{ after(grammarAccess.getSlangTermAccess().getGroup_5_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangTerm__Group_5_0_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_5_0_0__0__Impl
	rule__SlangTerm__Group_5_0_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_5_0_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getEnumLitExprAction_5_0_0_0()); }
	()
	{ after(grammarAccess.getSlangTermAccess().getEnumLitExprAction_5_0_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_5_0_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_5_0_0__1__Impl
	rule__SlangTerm__Group_5_0_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_5_0_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getEnumKeyword_5_0_0_1()); }
	Enum
	{ after(grammarAccess.getSlangTermAccess().getEnumKeyword_5_0_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_5_0_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_5_0_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_5_0_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getLeftParenthesisKeyword_5_0_0_2()); }
	LeftParenthesis
	{ after(grammarAccess.getSlangTermAccess().getLeftParenthesisKeyword_5_0_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangTerm__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_6__0__Impl
	rule__SlangTerm__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getGroup_6_0()); }
	(rule__SlangTerm__Group_6_0__0)
	{ after(grammarAccess.getSlangTermAccess().getGroup_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_6__1__Impl
	rule__SlangTerm__Group_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getArgExprAssignment_6_1()); }
	(rule__SlangTerm__ArgExprAssignment_6_1)
	{ after(grammarAccess.getSlangTermAccess().getArgExprAssignment_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_6__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_6__2__Impl
	rule__SlangTerm__Group_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_6__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getGroup_6_2()); }
	(rule__SlangTerm__Group_6_2__0)*
	{ after(grammarAccess.getSlangTermAccess().getGroup_6_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_6__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_6__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_6__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getRightCurlyBracketKeyword_6_3()); }
	RightCurlyBracket
	{ after(grammarAccess.getSlangTermAccess().getRightCurlyBracketKeyword_6_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangTerm__Group_6_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_6_0__0__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_6_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getGroup_6_0_0()); }
	(rule__SlangTerm__Group_6_0_0__0)
	{ after(grammarAccess.getSlangTermAccess().getGroup_6_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangTerm__Group_6_0_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_6_0_0__0__Impl
	rule__SlangTerm__Group_6_0_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_6_0_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getRecordLitExprAction_6_0_0_0()); }
	()
	{ after(grammarAccess.getSlangTermAccess().getRecordLitExprAction_6_0_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_6_0_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_6_0_0__1__Impl
	rule__SlangTerm__Group_6_0_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_6_0_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getRecordTypeAssignment_6_0_0_1()); }
	(rule__SlangTerm__RecordTypeAssignment_6_0_0_1)
	{ after(grammarAccess.getSlangTermAccess().getRecordTypeAssignment_6_0_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_6_0_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_6_0_0__2__Impl
	rule__SlangTerm__Group_6_0_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_6_0_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getLeftCurlyBracketKeyword_6_0_0_2()); }
	LeftCurlyBracket
	{ after(grammarAccess.getSlangTermAccess().getLeftCurlyBracketKeyword_6_0_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_6_0_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_6_0_0__3__Impl
	rule__SlangTerm__Group_6_0_0__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_6_0_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getArgsAssignment_6_0_0_3()); }
	(rule__SlangTerm__ArgsAssignment_6_0_0_3)
	{ after(grammarAccess.getSlangTermAccess().getArgsAssignment_6_0_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_6_0_0__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_6_0_0__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_6_0_0__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getEqualsSignKeyword_6_0_0_4()); }
	EqualsSign
	{ after(grammarAccess.getSlangTermAccess().getEqualsSignKeyword_6_0_0_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangTerm__Group_6_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_6_2__0__Impl
	rule__SlangTerm__Group_6_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_6_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getSemicolonKeyword_6_2_0()); }
	Semicolon
	{ after(grammarAccess.getSlangTermAccess().getSemicolonKeyword_6_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_6_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_6_2__1__Impl
	rule__SlangTerm__Group_6_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_6_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getArgsAssignment_6_2_1()); }
	(rule__SlangTerm__ArgsAssignment_6_2_1)
	{ after(grammarAccess.getSlangTermAccess().getArgsAssignment_6_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_6_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_6_2__2__Impl
	rule__SlangTerm__Group_6_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_6_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getEqualsSignKeyword_6_2_2()); }
	EqualsSign
	{ after(grammarAccess.getSlangTermAccess().getEqualsSignKeyword_6_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_6_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_6_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_6_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getArgExprAssignment_6_2_3()); }
	(rule__SlangTerm__ArgExprAssignment_6_2_3)
	{ after(grammarAccess.getSlangTermAccess().getArgExprAssignment_6_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangTerm__Group_7__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_7__0__Impl
	rule__SlangTerm__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_7__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getDataRefExprAction_7_0()); }
	()
	{ after(grammarAccess.getSlangTermAccess().getDataRefExprAction_7_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_7__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_7__1__Impl
	rule__SlangTerm__Group_7__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_7__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getPortOrSubcomponentOrStateVarAssignment_7_1()); }
	(rule__SlangTerm__PortOrSubcomponentOrStateVarAssignment_7_1)
	{ after(grammarAccess.getSlangTermAccess().getPortOrSubcomponentOrStateVarAssignment_7_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_7__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_7__2__Impl
	rule__SlangTerm__Group_7__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_7__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getGroup_7_2()); }
	(rule__SlangTerm__Group_7_2__0)?
	{ after(grammarAccess.getSlangTermAccess().getGroup_7_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_7__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_7__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_7__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getCsAssignment_7_3()); }
	(rule__SlangTerm__CsAssignment_7_3)?
	{ after(grammarAccess.getSlangTermAccess().getCsAssignment_7_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangTerm__Group_7_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_7_2__0__Impl
	rule__SlangTerm__Group_7_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_7_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getFullStopKeyword_7_2_0()); }
	FullStop
	{ after(grammarAccess.getSlangTermAccess().getFullStopKeyword_7_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_7_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_7_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_7_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getRefAssignment_7_2_1()); }
	(rule__SlangTerm__RefAssignment_7_2_1)
	{ after(grammarAccess.getSlangTermAccess().getRefAssignment_7_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangTerm__Group_8__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_8__0__Impl
	rule__SlangTerm__Group_8__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_8__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getSlangTupleTermAction_8_0()); }
	()
	{ after(grammarAccess.getSlangTermAccess().getSlangTupleTermAction_8_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_8__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_8__1__Impl
	rule__SlangTerm__Group_8__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_8__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getLeftParenthesisKeyword_8_1()); }
	LeftParenthesis
	{ after(grammarAccess.getSlangTermAccess().getLeftParenthesisKeyword_8_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_8__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_8__2__Impl
	rule__SlangTerm__Group_8__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_8__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getEAssignment_8_2()); }
	(rule__SlangTerm__EAssignment_8_2)
	{ after(grammarAccess.getSlangTermAccess().getEAssignment_8_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_8__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_8__3__Impl
	rule__SlangTerm__Group_8__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_8__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getGroup_8_3()); }
	(rule__SlangTerm__Group_8_3__0)*
	{ after(grammarAccess.getSlangTermAccess().getGroup_8_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_8__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_8__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_8__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getRightParenthesisKeyword_8_4()); }
	RightParenthesis
	{ after(grammarAccess.getSlangTermAccess().getRightParenthesisKeyword_8_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangTerm__Group_8_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_8_3__0__Impl
	rule__SlangTerm__Group_8_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_8_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getCommaKeyword_8_3_0()); }
	Comma
	{ after(grammarAccess.getSlangTermAccess().getCommaKeyword_8_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_8_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_8_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_8_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getEAssignment_8_3_1()); }
	(rule__SlangTerm__EAssignment_8_3_1)
	{ after(grammarAccess.getSlangTermAccess().getEAssignment_8_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangTerm__Group_9__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_9__0__Impl
	rule__SlangTerm__Group_9__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_9__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getSlangForTermAction_9_0()); }
	()
	{ after(grammarAccess.getSlangTermAccess().getSlangForTermAction_9_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_9__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_9__1__Impl
	rule__SlangTerm__Group_9__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_9__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getForKeyword_9_1()); }
	For
	{ after(grammarAccess.getSlangTermAccess().getForKeyword_9_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_9__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_9__2__Impl
	rule__SlangTerm__Group_9__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_9__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getRAssignment_9_2()); }
	(rule__SlangTerm__RAssignment_9_2)
	{ after(grammarAccess.getSlangTermAccess().getRAssignment_9_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_9__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_9__3__Impl
	rule__SlangTerm__Group_9__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_9__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getGroup_9_3()); }
	(rule__SlangTerm__Group_9_3__0)*
	{ after(grammarAccess.getSlangTermAccess().getGroup_9_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_9__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_9__4__Impl
	rule__SlangTerm__Group_9__5
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_9__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getYieldKeyword_9_4()); }
	Yield
	{ after(grammarAccess.getSlangTermAccess().getYieldKeyword_9_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_9__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_9__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_9__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getAlternatives_9_5()); }
	(rule__SlangTerm__Alternatives_9_5)
	{ after(grammarAccess.getSlangTermAccess().getAlternatives_9_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangTerm__Group_9_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_9_3__0__Impl
	rule__SlangTerm__Group_9_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_9_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getCommaKeyword_9_3_0()); }
	Comma
	{ after(grammarAccess.getSlangTermAccess().getCommaKeyword_9_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_9_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_9_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_9_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getRAssignment_9_3_1()); }
	(rule__SlangTerm__RAssignment_9_3_1)
	{ after(grammarAccess.getSlangTermAccess().getRAssignment_9_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangTerm__Group_9_5_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_9_5_1__0__Impl
	rule__SlangTerm__Group_9_5_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_9_5_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getLeftParenthesisKeyword_9_5_1_0()); }
	LeftParenthesis
	{ after(grammarAccess.getSlangTermAccess().getLeftParenthesisKeyword_9_5_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_9_5_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_9_5_1__1__Impl
	rule__SlangTerm__Group_9_5_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_9_5_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getEAssignment_9_5_1_1()); }
	(rule__SlangTerm__EAssignment_9_5_1_1)
	{ after(grammarAccess.getSlangTermAccess().getEAssignment_9_5_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_9_5_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_9_5_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_9_5_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getRightParenthesisKeyword_9_5_1_2()); }
	RightParenthesis
	{ after(grammarAccess.getSlangTermAccess().getRightParenthesisKeyword_9_5_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangTerm__Group_10__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_10__0__Impl
	rule__SlangTerm__Group_10__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_10__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getSlangBlockTermAction_10_0()); }
	()
	{ after(grammarAccess.getSlangTermAccess().getSlangBlockTermAction_10_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_10__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_10__1__Impl
	rule__SlangTerm__Group_10__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_10__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getLeftCurlyBracketKeyword_10_1()); }
	LeftCurlyBracket
	{ after(grammarAccess.getSlangTermAccess().getLeftCurlyBracketKeyword_10_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_10__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_10__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_10__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getAlternatives_10_2()); }
	(rule__SlangTerm__Alternatives_10_2)
	{ after(grammarAccess.getSlangTermAccess().getAlternatives_10_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangTerm__Group_10_2_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_10_2_0__0__Impl
	rule__SlangTerm__Group_10_2_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_10_2_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getGroup_10_2_0_0()); }
	(rule__SlangTerm__Group_10_2_0_0__0)?
	{ after(grammarAccess.getSlangTermAccess().getGroup_10_2_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_10_2_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_10_2_0__1__Impl
	rule__SlangTerm__Group_10_2_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_10_2_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getEAssignment_10_2_0_1()); }
	(rule__SlangTerm__EAssignment_10_2_0_1)
	{ after(grammarAccess.getSlangTermAccess().getEAssignment_10_2_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_10_2_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_10_2_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_10_2_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getRightCurlyBracketKeyword_10_2_0_2()); }
	RightCurlyBracket
	{ after(grammarAccess.getSlangTermAccess().getRightCurlyBracketKeyword_10_2_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangTerm__Group_10_2_0_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_10_2_0_0__0__Impl
	rule__SlangTerm__Group_10_2_0_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_10_2_0_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getPAssignment_10_2_0_0_0()); }
	(rule__SlangTerm__PAssignment_10_2_0_0_0)
	{ after(grammarAccess.getSlangTermAccess().getPAssignment_10_2_0_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_10_2_0_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_10_2_0_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_10_2_0_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getEqualsSignGreaterThanSignKeyword_10_2_0_0_1()); }
	EqualsSignGreaterThanSign
	{ after(grammarAccess.getSlangTermAccess().getEqualsSignGreaterThanSignKeyword_10_2_0_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangTerm__Group_10_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_10_2_1__0__Impl
	rule__SlangTerm__Group_10_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_10_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getStmtAssignment_10_2_1_0()); }
	(rule__SlangTerm__StmtAssignment_10_2_1_0)*
	{ after(grammarAccess.getSlangTermAccess().getStmtAssignment_10_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_10_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_10_2_1__1__Impl
	rule__SlangTerm__Group_10_2_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_10_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getRAssignment_10_2_1_1()); }
	(rule__SlangTerm__RAssignment_10_2_1_1)?
	{ after(grammarAccess.getSlangTermAccess().getRAssignment_10_2_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_10_2_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_10_2_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_10_2_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getRightCurlyBracketKeyword_10_2_1_2()); }
	RightCurlyBracket
	{ after(grammarAccess.getSlangTermAccess().getRightCurlyBracketKeyword_10_2_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangParams__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangParams__Group__0__Impl
	rule__SlangParams__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangParams__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangParamsAccess().getLeftParenthesisKeyword_0()); }
	LeftParenthesis
	{ after(grammarAccess.getSlangParamsAccess().getLeftParenthesisKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangParams__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangParams__Group__1__Impl
	rule__SlangParams__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangParams__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangParamsAccess().getParamsAssignment_1()); }
	(rule__SlangParams__ParamsAssignment_1)
	{ after(grammarAccess.getSlangParamsAccess().getParamsAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangParams__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangParams__Group__2__Impl
	rule__SlangParams__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangParams__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangParamsAccess().getGroup_2()); }
	(rule__SlangParams__Group_2__0)?
	{ after(grammarAccess.getSlangParamsAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangParams__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangParams__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangParams__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangParamsAccess().getRightParenthesisKeyword_3()); }
	RightParenthesis
	{ after(grammarAccess.getSlangParamsAccess().getRightParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangParams__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangParams__Group_2__0__Impl
	rule__SlangParams__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangParams__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangParamsAccess().getCommaKeyword_2_0()); }
	Comma
	{ after(grammarAccess.getSlangParamsAccess().getCommaKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangParams__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangParams__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangParams__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangParamsAccess().getParamsAssignment_2_1()); }
	(rule__SlangParams__ParamsAssignment_2_1)
	{ after(grammarAccess.getSlangParamsAccess().getParamsAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangParam__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangParam__Group__0__Impl
	rule__SlangParam__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangParam__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangParamAccess().getVarKeyword_0()); }
	(Var)?
	{ after(grammarAccess.getSlangParamAccess().getVarKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangParam__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangParam__Group__1__Impl
	rule__SlangParam__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangParam__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangParamAccess().getNameAssignment_1()); }
	(rule__SlangParam__NameAssignment_1)
	{ after(grammarAccess.getSlangParamAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangParam__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangParam__Group__2__Impl
	rule__SlangParam__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangParam__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangParamAccess().getColonKeyword_2()); }
	Colon
	{ after(grammarAccess.getSlangParamAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangParam__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangParam__Group__3__Impl
	rule__SlangParam__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangParam__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangParamAccess().getEqualsSignGreaterThanSignKeyword_3()); }
	(EqualsSignGreaterThanSign)?
	{ after(grammarAccess.getSlangParamAccess().getEqualsSignGreaterThanSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangParam__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangParam__Group__4__Impl
	rule__SlangParam__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangParam__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangParamAccess().getTypeNameAssignment_4()); }
	(rule__SlangParam__TypeNameAssignment_4)
	{ after(grammarAccess.getSlangParamAccess().getTypeNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangParam__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangParam__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangParam__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangParamAccess().getAsteriskKeyword_5()); }
	(Asterisk)?
	{ after(grammarAccess.getSlangParamAccess().getAsteriskKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangForRange__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangForRange__Group__0__Impl
	rule__SlangForRange__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangForRange__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangForRangeAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
	{ after(grammarAccess.getSlangForRangeAccess().getIDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangForRange__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangForRange__Group__1__Impl
	rule__SlangForRange__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangForRange__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangForRangeAccess().getColonKeyword_1()); }
	Colon
	{ after(grammarAccess.getSlangForRangeAccess().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangForRange__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangForRange__Group__2__Impl
	rule__SlangForRange__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangForRange__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangForRangeAccess().getEAssignment_2()); }
	(rule__SlangForRange__EAssignment_2)
	{ after(grammarAccess.getSlangForRangeAccess().getEAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangForRange__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangForRange__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangForRange__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangForRangeAccess().getGroup_3()); }
	(rule__SlangForRange__Group_3__0)?
	{ after(grammarAccess.getSlangForRangeAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangForRange__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangForRange__Group_3__0__Impl
	rule__SlangForRange__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangForRange__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangForRangeAccess().getAlternatives_3_0()); }
	(rule__SlangForRange__Alternatives_3_0)
	{ after(grammarAccess.getSlangForRangeAccess().getAlternatives_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangForRange__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangForRange__Group_3__1__Impl
	rule__SlangForRange__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangForRange__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangForRangeAccess().getUpperAssignment_3_1()); }
	(rule__SlangForRange__UpperAssignment_3_1)
	{ after(grammarAccess.getSlangForRangeAccess().getUpperAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangForRange__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangForRange__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangForRange__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangForRangeAccess().getGroup_3_2()); }
	(rule__SlangForRange__Group_3_2__0)?
	{ after(grammarAccess.getSlangForRangeAccess().getGroup_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangForRange__Group_3_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangForRange__Group_3_2__0__Impl
	rule__SlangForRange__Group_3_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangForRange__Group_3_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangForRangeAccess().getByKeyword_3_2_0()); }
	By
	{ after(grammarAccess.getSlangForRangeAccess().getByKeyword_3_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangForRange__Group_3_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangForRange__Group_3_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangForRange__Group_3_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangForRangeAccess().getStepAssignment_3_2_1()); }
	(rule__SlangForRange__StepAssignment_3_2_1)
	{ after(grammarAccess.getSlangForRangeAccess().getStepAssignment_3_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangRet__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangRet__Group__0__Impl
	rule__SlangRet__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangRet__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangRetAccess().getSlangRetAction_0()); }
	()
	{ after(grammarAccess.getSlangRetAccess().getSlangRetAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangRet__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangRet__Group__1__Impl
	rule__SlangRet__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangRet__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangRetAccess().getReturnKeyword_1()); }
	Return
	{ after(grammarAccess.getSlangRetAccess().getReturnKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangRet__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangRet__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangRet__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangRetAccess().getEAssignment_2()); }
	(rule__SlangRet__EAssignment_2)?
	{ after(grammarAccess.getSlangRetAccess().getEAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangCallSuffix__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangCallSuffix__Group_0__0__Impl
	rule__SlangCallSuffix__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangCallSuffix__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangCallSuffixAccess().getSlangCallSuffixAction_0_0()); }
	()
	{ after(grammarAccess.getSlangCallSuffixAccess().getSlangCallSuffixAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangCallSuffix__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangCallSuffix__Group_0__1__Impl
	rule__SlangCallSuffix__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangCallSuffix__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangCallSuffixAccess().getTaAssignment_0_1()); }
	(rule__SlangCallSuffix__TaAssignment_0_1)
	{ after(grammarAccess.getSlangCallSuffixAccess().getTaAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangCallSuffix__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangCallSuffix__Group_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangCallSuffix__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangCallSuffixAccess().getCaAssignment_0_2()); }
	(rule__SlangCallSuffix__CaAssignment_0_2)?
	{ after(grammarAccess.getSlangCallSuffixAccess().getCaAssignment_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangCallArgs__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangCallArgs__Group__0__Impl
	rule__SlangCallArgs__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangCallArgs__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangCallArgsAccess().getSlangCallArgsAction_0()); }
	()
	{ after(grammarAccess.getSlangCallArgsAccess().getSlangCallArgsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangCallArgs__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangCallArgs__Group__1__Impl
	rule__SlangCallArgs__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangCallArgs__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangCallArgsAccess().getLeftParenthesisKeyword_1()); }
	LeftParenthesis
	{ after(grammarAccess.getSlangCallArgsAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangCallArgs__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangCallArgs__Group__2__Impl
	rule__SlangCallArgs__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangCallArgs__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangCallArgsAccess().getGroup_2()); }
	(rule__SlangCallArgs__Group_2__0)?
	{ after(grammarAccess.getSlangCallArgsAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangCallArgs__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangCallArgs__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangCallArgs__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangCallArgsAccess().getRightParenthesisKeyword_3()); }
	RightParenthesis
	{ after(grammarAccess.getSlangCallArgsAccess().getRightParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangCallArgs__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangCallArgs__Group_2__0__Impl
	rule__SlangCallArgs__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangCallArgs__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangCallArgsAccess().getArgAssignment_2_0()); }
	(rule__SlangCallArgs__ArgAssignment_2_0)
	{ after(grammarAccess.getSlangCallArgsAccess().getArgAssignment_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangCallArgs__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangCallArgs__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangCallArgs__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangCallArgsAccess().getGroup_2_1()); }
	(rule__SlangCallArgs__Group_2_1__0)*
	{ after(grammarAccess.getSlangCallArgsAccess().getGroup_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangCallArgs__Group_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangCallArgs__Group_2_1__0__Impl
	rule__SlangCallArgs__Group_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangCallArgs__Group_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangCallArgsAccess().getCommaKeyword_2_1_0()); }
	Comma
	{ after(grammarAccess.getSlangCallArgsAccess().getCommaKeyword_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangCallArgs__Group_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangCallArgs__Group_2_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangCallArgs__Group_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangCallArgsAccess().getArgAssignment_2_1_1()); }
	(rule__SlangCallArgs__ArgAssignment_2_1_1)
	{ after(grammarAccess.getSlangCallArgsAccess().getArgAssignment_2_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangIDExp__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangIDExp__Group__0__Impl
	rule__SlangIDExp__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangIDExp__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangIDExpAccess().getEAssignment_0()); }
	(rule__SlangIDExp__EAssignment_0)
	{ after(grammarAccess.getSlangIDExpAccess().getEAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangIDExp__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangIDExp__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangIDExp__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangIDExpAccess().getGroup_1()); }
	(rule__SlangIDExp__Group_1__0)?
	{ after(grammarAccess.getSlangIDExpAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangIDExp__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangIDExp__Group_1__0__Impl
	rule__SlangIDExp__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangIDExp__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangIDExpAccess().getColonEqualsSignKeyword_1_0()); }
	ColonEqualsSign
	{ after(grammarAccess.getSlangIDExpAccess().getColonEqualsSignKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangIDExp__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangIDExp__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangIDExp__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangIDExpAccess().getEAssignment_1_1()); }
	(rule__SlangIDExp__EAssignment_1_1)
	{ after(grammarAccess.getSlangIDExpAccess().getEAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangTypeArgs__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTypeArgs__Group__0__Impl
	rule__SlangTypeArgs__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTypeArgs__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTypeArgsAccess().getLeftSquareBracketKeyword_0()); }
	LeftSquareBracket
	{ after(grammarAccess.getSlangTypeArgsAccess().getLeftSquareBracketKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTypeArgs__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTypeArgs__Group__1__Impl
	rule__SlangTypeArgs__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTypeArgs__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTypeArgsAccess().getTypesAssignment_1()); }
	(rule__SlangTypeArgs__TypesAssignment_1)
	{ after(grammarAccess.getSlangTypeArgsAccess().getTypesAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTypeArgs__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTypeArgs__Group__2__Impl
	rule__SlangTypeArgs__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTypeArgs__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTypeArgsAccess().getGroup_2()); }
	(rule__SlangTypeArgs__Group_2__0)*
	{ after(grammarAccess.getSlangTypeArgsAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTypeArgs__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTypeArgs__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTypeArgs__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTypeArgsAccess().getRightSquareBracketKeyword_3()); }
	RightSquareBracket
	{ after(grammarAccess.getSlangTypeArgsAccess().getRightSquareBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangTypeArgs__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTypeArgs__Group_2__0__Impl
	rule__SlangTypeArgs__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTypeArgs__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTypeArgsAccess().getCommaKeyword_2_0()); }
	Comma
	{ after(grammarAccess.getSlangTypeArgsAccess().getCommaKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTypeArgs__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTypeArgs__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTypeArgs__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTypeArgsAccess().getTypesAssignment_2_1()); }
	(rule__SlangTypeArgs__TypesAssignment_2_1)
	{ after(grammarAccess.getSlangTypeArgsAccess().getTypesAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangLit__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangLit__Group_0__0__Impl
	rule__SlangLit__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLit__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangLitAccess().getBooleanLitAction_0_0()); }
	()
	{ after(grammarAccess.getSlangLitAccess().getBooleanLitAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLit__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangLit__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLit__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangLitAccess().getValueAssignment_0_1()); }
	(rule__SlangLit__ValueAssignment_0_1)
	{ after(grammarAccess.getSlangLitAccess().getValueAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangLit__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangLit__Group_1__0__Impl
	rule__SlangLit__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLit__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangLitAccess().getIntegerLitAction_1_0()); }
	()
	{ after(grammarAccess.getSlangLitAccess().getIntegerLitAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLit__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangLit__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLit__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangLitAccess().getValueAssignment_1_1()); }
	(rule__SlangLit__ValueAssignment_1_1)
	{ after(grammarAccess.getSlangLitAccess().getValueAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangLit__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangLit__Group_2__0__Impl
	rule__SlangLit__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLit__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangLitAccess().getIntIdfLitAction_2_0()); }
	()
	{ after(grammarAccess.getSlangLitAccess().getIntIdfLitAction_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLit__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangLit__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLit__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangLitAccess().getValueAssignment_2_1()); }
	(rule__SlangLit__ValueAssignment_2_1)
	{ after(grammarAccess.getSlangLitAccess().getValueAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangLit__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangLit__Group_3__0__Impl
	rule__SlangLit__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLit__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangLitAccess().getHexLitAction_3_0()); }
	()
	{ after(grammarAccess.getSlangLitAccess().getHexLitAction_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLit__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangLit__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLit__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangLitAccess().getValueAssignment_3_1()); }
	(rule__SlangLit__ValueAssignment_3_1)
	{ after(grammarAccess.getSlangLitAccess().getValueAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangLit__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangLit__Group_4__0__Impl
	rule__SlangLit__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLit__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangLitAccess().getBinLitAction_4_0()); }
	()
	{ after(grammarAccess.getSlangLitAccess().getBinLitAction_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLit__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangLit__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLit__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangLitAccess().getValueAssignment_4_1()); }
	(rule__SlangLit__ValueAssignment_4_1)
	{ after(grammarAccess.getSlangLitAccess().getValueAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangLit__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangLit__Group_5__0__Impl
	rule__SlangLit__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLit__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangLitAccess().getRealLitAction_5_0()); }
	()
	{ after(grammarAccess.getSlangLitAccess().getRealLitAction_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLit__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangLit__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLit__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangLitAccess().getValueAssignment_5_1()); }
	(rule__SlangLit__ValueAssignment_5_1)
	{ after(grammarAccess.getSlangLitAccess().getValueAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangLit__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangLit__Group_6__0__Impl
	rule__SlangLit__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLit__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangLitAccess().getSlangStringLitAction_6_0()); }
	()
	{ after(grammarAccess.getSlangLitAccess().getSlangStringLitAction_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLit__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangLit__Group_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLit__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangLitAccess().getValueAssignment_6_1()); }
	(rule__SlangLit__ValueAssignment_6_1)
	{ after(grammarAccess.getSlangLitAccess().getValueAssignment_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangLit__Group_7__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangLit__Group_7__0__Impl
	rule__SlangLit__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLit__Group_7__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangLitAccess().getRealIdfLitAction_7_0()); }
	()
	{ after(grammarAccess.getSlangLitAccess().getRealIdfLitAction_7_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLit__Group_7__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangLit__Group_7__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLit__Group_7__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangLitAccess().getValueAssignment_7_1()); }
	(rule__SlangLit__ValueAssignment_7_1)
	{ after(grammarAccess.getSlangLitAccess().getValueAssignment_7_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangLit__Group_8__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangLit__Group_8__0__Impl
	rule__SlangLit__Group_8__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLit__Group_8__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangLitAccess().getMStringLitAction_8_0()); }
	()
	{ after(grammarAccess.getSlangLitAccess().getMStringLitAction_8_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLit__Group_8__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangLit__Group_8__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLit__Group_8__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangLitAccess().getValueAssignment_8_1()); }
	(rule__SlangLit__ValueAssignment_8_1)
	{ after(grammarAccess.getSlangLitAccess().getValueAssignment_8_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangInterp__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangInterp__Group_0__0__Impl
	rule__SlangInterp__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangInterp__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangInterpAccess().getSlangMspInterpAction_0_0()); }
	()
	{ after(grammarAccess.getSlangInterpAccess().getSlangMspInterpAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangInterp__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangInterp__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangInterp__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangInterpAccess().getMspAssignment_0_1()); }
	(rule__SlangInterp__MspAssignment_0_1)
	{ after(grammarAccess.getSlangInterpAccess().getMspAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangInterp__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangInterp__Group_1__0__Impl
	rule__SlangInterp__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangInterp__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangInterpAccess().getSlangLiteralInterpAction_1_0()); }
	()
	{ after(grammarAccess.getSlangInterpAccess().getSlangLiteralInterpAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangInterp__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangInterp__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangInterp__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangInterpAccess().getSliAssignment_1_1()); }
	(rule__SlangInterp__SliAssignment_1_1)
	{ after(grammarAccess.getSlangInterpAccess().getSliAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangInterp__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangInterp__Group_2__0__Impl
	rule__SlangInterp__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangInterp__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangInterpAccess().getSlangMspbInterpAction_2_0()); }
	()
	{ after(grammarAccess.getSlangInterpAccess().getSlangMspbInterpAction_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangInterp__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangInterp__Group_2__1__Impl
	rule__SlangInterp__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangInterp__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangInterpAccess().getMspbAssignment_2_1()); }
	(rule__SlangInterp__MspbAssignment_2_1)
	{ after(grammarAccess.getSlangInterpAccess().getMspbAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangInterp__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangInterp__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangInterp__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangInterpAccess().getMinterpAssignment_2_2()); }
	(rule__SlangInterp__MinterpAssignment_2_2)
	{ after(grammarAccess.getSlangInterpAccess().getMinterpAssignment_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangMInterp__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangMInterp__Group__0__Impl
	rule__SlangMInterp__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangMInterp__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangMInterpAccess().getLeftCurlyBracketKeyword_0()); }
	LeftCurlyBracket
	{ after(grammarAccess.getSlangMInterpAccess().getLeftCurlyBracketKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangMInterp__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangMInterp__Group__1__Impl
	rule__SlangMInterp__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangMInterp__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangMInterpAccess().getEAssignment_1()); }
	(rule__SlangMInterp__EAssignment_1)
	{ after(grammarAccess.getSlangMInterpAccess().getEAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangMInterp__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangMInterp__Group__2__Impl
	rule__SlangMInterp__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangMInterp__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangMInterpAccess().getRightCurlyBracketKeyword_2()); }
	RightCurlyBracket
	{ after(grammarAccess.getSlangMInterpAccess().getRightCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangMInterp__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangMInterp__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangMInterp__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangMInterpAccess().getAlternatives_3()); }
	(rule__SlangMInterp__Alternatives_3)
	{ after(grammarAccess.getSlangMInterpAccess().getAlternatives_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangMInterp__Group_3_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangMInterp__Group_3_0__0__Impl
	rule__SlangMInterp__Group_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangMInterp__Group_3_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangMInterpAccess().getMSPMTerminalRuleCall_3_0_0()); }
	RULE_MSPM
	{ after(grammarAccess.getSlangMInterpAccess().getMSPMTerminalRuleCall_3_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangMInterp__Group_3_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangMInterp__Group_3_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangMInterp__Group_3_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangMInterpAccess().getMAssignment_3_0_1()); }
	(rule__SlangMInterp__MAssignment_3_0_1)
	{ after(grammarAccess.getSlangMInterpAccess().getMAssignment_3_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ContainedPropertyAssociation__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainedPropertyAssociation__Group__0__Impl
	rule__ContainedPropertyAssociation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainedPropertyAssociationAccess().getPropertyAssignment_0()); }
	(rule__ContainedPropertyAssociation__PropertyAssignment_0)
	{ after(grammarAccess.getContainedPropertyAssociationAccess().getPropertyAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainedPropertyAssociation__Group__1__Impl
	rule__ContainedPropertyAssociation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainedPropertyAssociationAccess().getAlternatives_1()); }
	(rule__ContainedPropertyAssociation__Alternatives_1)
	{ after(grammarAccess.getContainedPropertyAssociationAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainedPropertyAssociation__Group__2__Impl
	rule__ContainedPropertyAssociation__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainedPropertyAssociationAccess().getConstantAssignment_2()); }
	(rule__ContainedPropertyAssociation__ConstantAssignment_2)?
	{ after(grammarAccess.getContainedPropertyAssociationAccess().getConstantAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainedPropertyAssociation__Group__3__Impl
	rule__ContainedPropertyAssociation__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainedPropertyAssociationAccess().getGroup_3()); }
	(rule__ContainedPropertyAssociation__Group_3__0)
	{ after(grammarAccess.getContainedPropertyAssociationAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainedPropertyAssociation__Group__4__Impl
	rule__ContainedPropertyAssociation__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainedPropertyAssociationAccess().getGroup_4()); }
	(rule__ContainedPropertyAssociation__Group_4__0)?
	{ after(grammarAccess.getContainedPropertyAssociationAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainedPropertyAssociation__Group__5__Impl
	rule__ContainedPropertyAssociation__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainedPropertyAssociationAccess().getGroup_5()); }
	(rule__ContainedPropertyAssociation__Group_5__0)?
	{ after(grammarAccess.getContainedPropertyAssociationAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainedPropertyAssociation__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainedPropertyAssociationAccess().getSemicolonKeyword_6()); }
	Semicolon
	{ after(grammarAccess.getContainedPropertyAssociationAccess().getSemicolonKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ContainedPropertyAssociation__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainedPropertyAssociation__Group_3__0__Impl
	rule__ContainedPropertyAssociation__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueAssignment_3_0()); }
	(rule__ContainedPropertyAssociation__OwnedValueAssignment_3_0)
	{ after(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueAssignment_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainedPropertyAssociation__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainedPropertyAssociationAccess().getGroup_3_1()); }
	(rule__ContainedPropertyAssociation__Group_3_1__0)*
	{ after(grammarAccess.getContainedPropertyAssociationAccess().getGroup_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ContainedPropertyAssociation__Group_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainedPropertyAssociation__Group_3_1__0__Impl
	rule__ContainedPropertyAssociation__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group_3_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainedPropertyAssociationAccess().getCommaKeyword_3_1_0()); }
	Comma
	{ after(grammarAccess.getContainedPropertyAssociationAccess().getCommaKeyword_3_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainedPropertyAssociation__Group_3_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group_3_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueAssignment_3_1_1()); }
	(rule__ContainedPropertyAssociation__OwnedValueAssignment_3_1_1)
	{ after(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueAssignment_3_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ContainedPropertyAssociation__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainedPropertyAssociation__Group_4__0__Impl
	rule__ContainedPropertyAssociation__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToKeywordsParserRuleCall_4_0()); }
	ruleAppliesToKeywords
	{ after(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToKeywordsParserRuleCall_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainedPropertyAssociation__Group_4__1__Impl
	rule__ContainedPropertyAssociation__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToAssignment_4_1()); }
	(rule__ContainedPropertyAssociation__AppliesToAssignment_4_1)
	{ after(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainedPropertyAssociation__Group_4__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainedPropertyAssociationAccess().getGroup_4_2()); }
	(rule__ContainedPropertyAssociation__Group_4_2__0)*
	{ after(grammarAccess.getContainedPropertyAssociationAccess().getGroup_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ContainedPropertyAssociation__Group_4_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainedPropertyAssociation__Group_4_2__0__Impl
	rule__ContainedPropertyAssociation__Group_4_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group_4_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainedPropertyAssociationAccess().getCommaKeyword_4_2_0()); }
	Comma
	{ after(grammarAccess.getContainedPropertyAssociationAccess().getCommaKeyword_4_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group_4_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainedPropertyAssociation__Group_4_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group_4_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToAssignment_4_2_1()); }
	(rule__ContainedPropertyAssociation__AppliesToAssignment_4_2_1)
	{ after(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToAssignment_4_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ContainedPropertyAssociation__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainedPropertyAssociation__Group_5__0__Impl
	rule__ContainedPropertyAssociation__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainedPropertyAssociationAccess().getInBindingKeywordsParserRuleCall_5_0()); }
	ruleInBindingKeywords
	{ after(grammarAccess.getContainedPropertyAssociationAccess().getInBindingKeywordsParserRuleCall_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainedPropertyAssociation__Group_5__1__Impl
	rule__ContainedPropertyAssociation__Group_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainedPropertyAssociationAccess().getLeftParenthesisKeyword_5_1()); }
	LeftParenthesis
	{ after(grammarAccess.getContainedPropertyAssociationAccess().getLeftParenthesisKeyword_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group_5__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainedPropertyAssociation__Group_5__2__Impl
	rule__ContainedPropertyAssociation__Group_5__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group_5__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainedPropertyAssociationAccess().getInBindingAssignment_5_2()); }
	(rule__ContainedPropertyAssociation__InBindingAssignment_5_2)
	{ after(grammarAccess.getContainedPropertyAssociationAccess().getInBindingAssignment_5_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group_5__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainedPropertyAssociation__Group_5__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__Group_5__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainedPropertyAssociationAccess().getRightParenthesisKeyword_5_3()); }
	RightParenthesis
	{ after(grammarAccess.getContainedPropertyAssociationAccess().getRightParenthesisKeyword_5_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OptionalModalPropertyValue__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OptionalModalPropertyValue__Group__0__Impl
	rule__OptionalModalPropertyValue__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalModalPropertyValue__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOptionalModalPropertyValueAccess().getOwnedValueAssignment_0()); }
	(rule__OptionalModalPropertyValue__OwnedValueAssignment_0)
	{ after(grammarAccess.getOptionalModalPropertyValueAccess().getOwnedValueAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalModalPropertyValue__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OptionalModalPropertyValue__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalModalPropertyValue__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOptionalModalPropertyValueAccess().getGroup_1()); }
	(rule__OptionalModalPropertyValue__Group_1__0)?
	{ after(grammarAccess.getOptionalModalPropertyValueAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OptionalModalPropertyValue__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OptionalModalPropertyValue__Group_1__0__Impl
	rule__OptionalModalPropertyValue__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalModalPropertyValue__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOptionalModalPropertyValueAccess().getInModesKeywordsParserRuleCall_1_0()); }
	ruleInModesKeywords
	{ after(grammarAccess.getOptionalModalPropertyValueAccess().getInModesKeywordsParserRuleCall_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalModalPropertyValue__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OptionalModalPropertyValue__Group_1__1__Impl
	rule__OptionalModalPropertyValue__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalModalPropertyValue__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOptionalModalPropertyValueAccess().getLeftParenthesisKeyword_1_1()); }
	LeftParenthesis
	{ after(grammarAccess.getOptionalModalPropertyValueAccess().getLeftParenthesisKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalModalPropertyValue__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OptionalModalPropertyValue__Group_1__2__Impl
	rule__OptionalModalPropertyValue__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalModalPropertyValue__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOptionalModalPropertyValueAccess().getInModeAssignment_1_2()); }
	(rule__OptionalModalPropertyValue__InModeAssignment_1_2)
	{ after(grammarAccess.getOptionalModalPropertyValueAccess().getInModeAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalModalPropertyValue__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OptionalModalPropertyValue__Group_1__3__Impl
	rule__OptionalModalPropertyValue__Group_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalModalPropertyValue__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOptionalModalPropertyValueAccess().getGroup_1_3()); }
	(rule__OptionalModalPropertyValue__Group_1_3__0)*
	{ after(grammarAccess.getOptionalModalPropertyValueAccess().getGroup_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalModalPropertyValue__Group_1__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OptionalModalPropertyValue__Group_1__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalModalPropertyValue__Group_1__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOptionalModalPropertyValueAccess().getRightParenthesisKeyword_1_4()); }
	RightParenthesis
	{ after(grammarAccess.getOptionalModalPropertyValueAccess().getRightParenthesisKeyword_1_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OptionalModalPropertyValue__Group_1_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OptionalModalPropertyValue__Group_1_3__0__Impl
	rule__OptionalModalPropertyValue__Group_1_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalModalPropertyValue__Group_1_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOptionalModalPropertyValueAccess().getCommaKeyword_1_3_0()); }
	Comma
	{ after(grammarAccess.getOptionalModalPropertyValueAccess().getCommaKeyword_1_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalModalPropertyValue__Group_1_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OptionalModalPropertyValue__Group_1_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalModalPropertyValue__Group_1_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOptionalModalPropertyValueAccess().getInModeAssignment_1_3_1()); }
	(rule__OptionalModalPropertyValue__InModeAssignment_1_3_1)
	{ after(grammarAccess.getOptionalModalPropertyValueAccess().getInModeAssignment_1_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BooleanLiteral__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BooleanLiteral__Group__0__Impl
	rule__BooleanLiteral__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanLiteral__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0()); }
	()
	{ after(grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanLiteral__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BooleanLiteral__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanLiteral__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBooleanLiteralAccess().getAlternatives_1()); }
	(rule__BooleanLiteral__Alternatives_1)
	{ after(grammarAccess.getBooleanLiteralAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ReferenceTerm__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReferenceTerm__Group__0__Impl
	rule__ReferenceTerm__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ReferenceTerm__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReferenceTermAccess().getReferenceKeyword_0()); }
	Reference
	{ after(grammarAccess.getReferenceTermAccess().getReferenceKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReferenceTerm__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReferenceTerm__Group__1__Impl
	rule__ReferenceTerm__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ReferenceTerm__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReferenceTermAccess().getLeftParenthesisKeyword_1()); }
	LeftParenthesis
	{ after(grammarAccess.getReferenceTermAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReferenceTerm__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReferenceTerm__Group__2__Impl
	rule__ReferenceTerm__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ReferenceTerm__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReferenceTermAccess().getPathAssignment_2()); }
	(rule__ReferenceTerm__PathAssignment_2)
	{ after(grammarAccess.getReferenceTermAccess().getPathAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReferenceTerm__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReferenceTerm__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ReferenceTerm__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReferenceTermAccess().getRightParenthesisKeyword_3()); }
	RightParenthesis
	{ after(grammarAccess.getReferenceTermAccess().getRightParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RecordTerm__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RecordTerm__Group__0__Impl
	rule__RecordTerm__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RecordTerm__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRecordTermAccess().getLeftSquareBracketKeyword_0()); }
	LeftSquareBracket
	{ after(grammarAccess.getRecordTermAccess().getLeftSquareBracketKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RecordTerm__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RecordTerm__Group__1__Impl
	rule__RecordTerm__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RecordTerm__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getRecordTermAccess().getOwnedFieldValueAssignment_1()); }
		(rule__RecordTerm__OwnedFieldValueAssignment_1)
		{ after(grammarAccess.getRecordTermAccess().getOwnedFieldValueAssignment_1()); }
	)
	(
		{ before(grammarAccess.getRecordTermAccess().getOwnedFieldValueAssignment_1()); }
		(rule__RecordTerm__OwnedFieldValueAssignment_1)*
		{ after(grammarAccess.getRecordTermAccess().getOwnedFieldValueAssignment_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RecordTerm__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RecordTerm__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RecordTerm__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRecordTermAccess().getRightSquareBracketKeyword_2()); }
	RightSquareBracket
	{ after(grammarAccess.getRecordTermAccess().getRightSquareBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ComputedTerm__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComputedTerm__Group__0__Impl
	rule__ComputedTerm__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComputedTerm__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComputedTermAccess().getComputeKeyword_0()); }
	Compute
	{ after(grammarAccess.getComputedTermAccess().getComputeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComputedTerm__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComputedTerm__Group__1__Impl
	rule__ComputedTerm__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComputedTerm__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComputedTermAccess().getLeftParenthesisKeyword_1()); }
	LeftParenthesis
	{ after(grammarAccess.getComputedTermAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComputedTerm__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComputedTerm__Group__2__Impl
	rule__ComputedTerm__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ComputedTerm__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComputedTermAccess().getFunctionAssignment_2()); }
	(rule__ComputedTerm__FunctionAssignment_2)
	{ after(grammarAccess.getComputedTermAccess().getFunctionAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComputedTerm__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComputedTerm__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComputedTerm__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComputedTermAccess().getRightParenthesisKeyword_3()); }
	RightParenthesis
	{ after(grammarAccess.getComputedTermAccess().getRightParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentClassifierTerm__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentClassifierTerm__Group__0__Impl
	rule__ComponentClassifierTerm__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentClassifierTerm__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentClassifierTermAccess().getClassifierKeyword_0()); }
	Classifier
	{ after(grammarAccess.getComponentClassifierTermAccess().getClassifierKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentClassifierTerm__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentClassifierTerm__Group__1__Impl
	rule__ComponentClassifierTerm__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentClassifierTerm__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentClassifierTermAccess().getLeftParenthesisKeyword_1()); }
	LeftParenthesis
	{ after(grammarAccess.getComponentClassifierTermAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentClassifierTerm__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentClassifierTerm__Group__2__Impl
	rule__ComponentClassifierTerm__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentClassifierTerm__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentClassifierTermAccess().getClassifierAssignment_2()); }
	(rule__ComponentClassifierTerm__ClassifierAssignment_2)
	{ after(grammarAccess.getComponentClassifierTermAccess().getClassifierAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentClassifierTerm__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentClassifierTerm__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentClassifierTerm__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentClassifierTermAccess().getRightParenthesisKeyword_3()); }
	RightParenthesis
	{ after(grammarAccess.getComponentClassifierTermAccess().getRightParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ListTerm__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ListTerm__Group__0__Impl
	rule__ListTerm__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ListTerm__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getListTermAccess().getListValueAction_0()); }
	()
	{ after(grammarAccess.getListTermAccess().getListValueAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ListTerm__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ListTerm__Group__1__Impl
	rule__ListTerm__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ListTerm__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getListTermAccess().getLeftParenthesisKeyword_1()); }
	LeftParenthesis
	{ after(grammarAccess.getListTermAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ListTerm__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ListTerm__Group__2__Impl
	rule__ListTerm__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ListTerm__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getListTermAccess().getGroup_2()); }
	(rule__ListTerm__Group_2__0)?
	{ after(grammarAccess.getListTermAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ListTerm__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ListTerm__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ListTerm__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getListTermAccess().getRightParenthesisKeyword_3()); }
	RightParenthesis
	{ after(grammarAccess.getListTermAccess().getRightParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ListTerm__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ListTerm__Group_2__0__Impl
	rule__ListTerm__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ListTerm__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getListTermAccess().getOwnedListElementAssignment_2_0()); }
	(rule__ListTerm__OwnedListElementAssignment_2_0)
	{ after(grammarAccess.getListTermAccess().getOwnedListElementAssignment_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ListTerm__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ListTerm__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ListTerm__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getListTermAccess().getGroup_2_1()); }
	(rule__ListTerm__Group_2_1__0)*
	{ after(grammarAccess.getListTermAccess().getGroup_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ListTerm__Group_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ListTerm__Group_2_1__0__Impl
	rule__ListTerm__Group_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ListTerm__Group_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getListTermAccess().getCommaKeyword_2_1_0()); }
	Comma
	{ after(grammarAccess.getListTermAccess().getCommaKeyword_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ListTerm__Group_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ListTerm__Group_2_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ListTerm__Group_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getListTermAccess().getOwnedListElementAssignment_2_1_1()); }
	(rule__ListTerm__OwnedListElementAssignment_2_1_1)
	{ after(grammarAccess.getListTermAccess().getOwnedListElementAssignment_2_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FieldPropertyAssociation__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FieldPropertyAssociation__Group__0__Impl
	rule__FieldPropertyAssociation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldPropertyAssociation__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFieldPropertyAssociationAccess().getPropertyAssignment_0()); }
	(rule__FieldPropertyAssociation__PropertyAssignment_0)
	{ after(grammarAccess.getFieldPropertyAssociationAccess().getPropertyAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldPropertyAssociation__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FieldPropertyAssociation__Group__1__Impl
	rule__FieldPropertyAssociation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldPropertyAssociation__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFieldPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_1()); }
	EqualsSignGreaterThanSign
	{ after(grammarAccess.getFieldPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldPropertyAssociation__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FieldPropertyAssociation__Group__2__Impl
	rule__FieldPropertyAssociation__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldPropertyAssociation__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFieldPropertyAssociationAccess().getOwnedValueAssignment_2()); }
	(rule__FieldPropertyAssociation__OwnedValueAssignment_2)
	{ after(grammarAccess.getFieldPropertyAssociationAccess().getOwnedValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldPropertyAssociation__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FieldPropertyAssociation__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldPropertyAssociation__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFieldPropertyAssociationAccess().getSemicolonKeyword_3()); }
	Semicolon
	{ after(grammarAccess.getFieldPropertyAssociationAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ContainmentPathElement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainmentPathElement__Group__0__Impl
	rule__ContainmentPathElement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainmentPathElement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainmentPathElementAccess().getGroup_0()); }
	(rule__ContainmentPathElement__Group_0__0)
	{ after(grammarAccess.getContainmentPathElementAccess().getGroup_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainmentPathElement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainmentPathElement__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainmentPathElement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainmentPathElementAccess().getGroup_1()); }
	(rule__ContainmentPathElement__Group_1__0)?
	{ after(grammarAccess.getContainmentPathElementAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ContainmentPathElement__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainmentPathElement__Group_0__0__Impl
	rule__ContainmentPathElement__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainmentPathElement__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainmentPathElementAccess().getNamedElementAssignment_0_0()); }
	(rule__ContainmentPathElement__NamedElementAssignment_0_0)
	{ after(grammarAccess.getContainmentPathElementAccess().getNamedElementAssignment_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainmentPathElement__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainmentPathElement__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainmentPathElement__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainmentPathElementAccess().getArrayRangeAssignment_0_1()); }
	(rule__ContainmentPathElement__ArrayRangeAssignment_0_1)*
	{ after(grammarAccess.getContainmentPathElementAccess().getArrayRangeAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ContainmentPathElement__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainmentPathElement__Group_1__0__Impl
	rule__ContainmentPathElement__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainmentPathElement__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainmentPathElementAccess().getFullStopKeyword_1_0()); }
	FullStop
	{ after(grammarAccess.getContainmentPathElementAccess().getFullStopKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainmentPathElement__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ContainmentPathElement__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainmentPathElement__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getContainmentPathElementAccess().getPathAssignment_1_1()); }
	(rule__ContainmentPathElement__PathAssignment_1_1)
	{ after(grammarAccess.getContainmentPathElementAccess().getPathAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ArrayRange__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayRange__Group__0__Impl
	rule__ArrayRange__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayRange__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayRangeAccess().getArrayRangeAction_0()); }
	()
	{ after(grammarAccess.getArrayRangeAccess().getArrayRangeAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayRange__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayRange__Group__1__Impl
	rule__ArrayRange__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayRange__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayRangeAccess().getLeftSquareBracketKeyword_1()); }
	LeftSquareBracket
	{ after(grammarAccess.getArrayRangeAccess().getLeftSquareBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayRange__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayRange__Group__2__Impl
	rule__ArrayRange__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayRange__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayRangeAccess().getLowerBoundAssignment_2()); }
	(rule__ArrayRange__LowerBoundAssignment_2)
	{ after(grammarAccess.getArrayRangeAccess().getLowerBoundAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayRange__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayRange__Group__3__Impl
	rule__ArrayRange__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayRange__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayRangeAccess().getGroup_3()); }
	(rule__ArrayRange__Group_3__0)?
	{ after(grammarAccess.getArrayRangeAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayRange__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayRange__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayRange__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayRangeAccess().getRightSquareBracketKeyword_4()); }
	RightSquareBracket
	{ after(grammarAccess.getArrayRangeAccess().getRightSquareBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ArrayRange__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayRange__Group_3__0__Impl
	rule__ArrayRange__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayRange__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayRangeAccess().getFullStopFullStopKeyword_3_0()); }
	FullStopFullStop
	{ after(grammarAccess.getArrayRangeAccess().getFullStopFullStopKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayRange__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayRange__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayRange__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayRangeAccess().getUpperBoundAssignment_3_1()); }
	(rule__ArrayRange__UpperBoundAssignment_3_1)
	{ after(grammarAccess.getArrayRangeAccess().getUpperBoundAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SignedConstant__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SignedConstant__Group__0__Impl
	rule__SignedConstant__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SignedConstant__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSignedConstantAccess().getOpAssignment_0()); }
	(rule__SignedConstant__OpAssignment_0)
	{ after(grammarAccess.getSignedConstantAccess().getOpAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SignedConstant__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SignedConstant__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SignedConstant__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSignedConstantAccess().getOwnedPropertyExpressionAssignment_1()); }
	(rule__SignedConstant__OwnedPropertyExpressionAssignment_1)
	{ after(grammarAccess.getSignedConstantAccess().getOwnedPropertyExpressionAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__IntegerTerm__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerTerm__Group__0__Impl
	rule__IntegerTerm__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerTerm__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerTermAccess().getValueAssignment_0()); }
	(rule__IntegerTerm__ValueAssignment_0)
	{ after(grammarAccess.getIntegerTermAccess().getValueAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerTerm__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerTerm__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerTerm__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerTermAccess().getUnitAssignment_1()); }
	(rule__IntegerTerm__UnitAssignment_1)?
	{ after(grammarAccess.getIntegerTermAccess().getUnitAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SignedInt__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SignedInt__Group__0__Impl
	rule__SignedInt__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SignedInt__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSignedIntAccess().getAlternatives_0()); }
	(rule__SignedInt__Alternatives_0)?
	{ after(grammarAccess.getSignedIntAccess().getAlternatives_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SignedInt__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SignedInt__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SignedInt__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSignedIntAccess().getINTEGER_LITTerminalRuleCall_1()); }
	RULE_INTEGER_LIT
	{ after(grammarAccess.getSignedIntAccess().getINTEGER_LITTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RealTerm__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RealTerm__Group__0__Impl
	rule__RealTerm__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RealTerm__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRealTermAccess().getValueAssignment_0()); }
	(rule__RealTerm__ValueAssignment_0)
	{ after(grammarAccess.getRealTermAccess().getValueAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RealTerm__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RealTerm__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RealTerm__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRealTermAccess().getUnitAssignment_1()); }
	(rule__RealTerm__UnitAssignment_1)?
	{ after(grammarAccess.getRealTermAccess().getUnitAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SignedReal__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SignedReal__Group__0__Impl
	rule__SignedReal__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SignedReal__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSignedRealAccess().getAlternatives_0()); }
	(rule__SignedReal__Alternatives_0)?
	{ after(grammarAccess.getSignedRealAccess().getAlternatives_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SignedReal__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SignedReal__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SignedReal__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSignedRealAccess().getREAL_LITTerminalRuleCall_1()); }
	RULE_REAL_LIT
	{ after(grammarAccess.getSignedRealAccess().getREAL_LITTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NumericRangeTerm__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NumericRangeTerm__Group__0__Impl
	rule__NumericRangeTerm__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericRangeTerm__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNumericRangeTermAccess().getMinimumAssignment_0()); }
	(rule__NumericRangeTerm__MinimumAssignment_0)
	{ after(grammarAccess.getNumericRangeTermAccess().getMinimumAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericRangeTerm__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NumericRangeTerm__Group__1__Impl
	rule__NumericRangeTerm__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericRangeTerm__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNumericRangeTermAccess().getFullStopFullStopKeyword_1()); }
	FullStopFullStop
	{ after(grammarAccess.getNumericRangeTermAccess().getFullStopFullStopKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericRangeTerm__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NumericRangeTerm__Group__2__Impl
	rule__NumericRangeTerm__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericRangeTerm__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNumericRangeTermAccess().getMaximumAssignment_2()); }
	(rule__NumericRangeTerm__MaximumAssignment_2)
	{ after(grammarAccess.getNumericRangeTermAccess().getMaximumAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericRangeTerm__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NumericRangeTerm__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericRangeTerm__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNumericRangeTermAccess().getGroup_3()); }
	(rule__NumericRangeTerm__Group_3__0)?
	{ after(grammarAccess.getNumericRangeTermAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NumericRangeTerm__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NumericRangeTerm__Group_3__0__Impl
	rule__NumericRangeTerm__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericRangeTerm__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNumericRangeTermAccess().getDeltaKeyword_3_0()); }
	Delta
	{ after(grammarAccess.getNumericRangeTermAccess().getDeltaKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericRangeTerm__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NumericRangeTerm__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericRangeTerm__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNumericRangeTermAccess().getDeltaAssignment_3_1()); }
	(rule__NumericRangeTerm__DeltaAssignment_3_1)
	{ after(grammarAccess.getNumericRangeTermAccess().getDeltaAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AppliesToKeywords__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AppliesToKeywords__Group__0__Impl
	rule__AppliesToKeywords__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AppliesToKeywords__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAppliesToKeywordsAccess().getAppliesKeyword_0()); }
	Applies
	{ after(grammarAccess.getAppliesToKeywordsAccess().getAppliesKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AppliesToKeywords__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AppliesToKeywords__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AppliesToKeywords__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAppliesToKeywordsAccess().getToKeyword_1()); }
	To
	{ after(grammarAccess.getAppliesToKeywordsAccess().getToKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InBindingKeywords__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InBindingKeywords__Group__0__Impl
	rule__InBindingKeywords__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InBindingKeywords__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInBindingKeywordsAccess().getInKeyword_0()); }
	In_1
	{ after(grammarAccess.getInBindingKeywordsAccess().getInKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InBindingKeywords__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InBindingKeywords__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InBindingKeywords__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInBindingKeywordsAccess().getBindingKeyword_1()); }
	Binding
	{ after(grammarAccess.getInBindingKeywordsAccess().getBindingKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InModesKeywords__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InModesKeywords__Group__0__Impl
	rule__InModesKeywords__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InModesKeywords__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInModesKeywordsAccess().getInKeyword_0()); }
	In_1
	{ after(grammarAccess.getInModesKeywordsAccess().getInKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InModesKeywords__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InModesKeywords__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InModesKeywords__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInModesKeywordsAccess().getModesKeyword_1()); }
	Modes
	{ after(grammarAccess.getInModesKeywordsAccess().getModesKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QPREF__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QPREF__Group__0__Impl
	rule__QPREF__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QPREF__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQPREFAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
	{ after(grammarAccess.getQPREFAccess().getIDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QPREF__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QPREF__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QPREF__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQPREFAccess().getGroup_1()); }
	(rule__QPREF__Group_1__0)?
	{ after(grammarAccess.getQPREFAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QPREF__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QPREF__Group_1__0__Impl
	rule__QPREF__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QPREF__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQPREFAccess().getColonColonKeyword_1_0()); }
	ColonColon
	{ after(grammarAccess.getQPREFAccess().getColonColonKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QPREF__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QPREF__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QPREF__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQPREFAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
	{ after(grammarAccess.getQPREFAccess().getIDTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QCREF__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QCREF__Group__0__Impl
	rule__QCREF__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QCREF__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQCREFAccess().getGroup_0()); }
	(rule__QCREF__Group_0__0)*
	{ after(grammarAccess.getQCREFAccess().getGroup_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QCREF__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QCREF__Group__1__Impl
	rule__QCREF__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__QCREF__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQCREFAccess().getIDTerminalRuleCall_1()); }
	RULE_ID
	{ after(grammarAccess.getQCREFAccess().getIDTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QCREF__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QCREF__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QCREF__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQCREFAccess().getGroup_2()); }
	(rule__QCREF__Group_2__0)?
	{ after(grammarAccess.getQCREFAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QCREF__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QCREF__Group_0__0__Impl
	rule__QCREF__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QCREF__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQCREFAccess().getIDTerminalRuleCall_0_0()); }
	RULE_ID
	{ after(grammarAccess.getQCREFAccess().getIDTerminalRuleCall_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QCREF__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QCREF__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QCREF__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQCREFAccess().getColonColonKeyword_0_1()); }
	ColonColon
	{ after(grammarAccess.getQCREFAccess().getColonColonKeyword_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QCREF__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QCREF__Group_2__0__Impl
	rule__QCREF__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QCREF__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQCREFAccess().getFullStopKeyword_2_0()); }
	FullStop
	{ after(grammarAccess.getQCREFAccess().getFullStopKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QCREF__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QCREF__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QCREF__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQCREFAccess().getIDTerminalRuleCall_2_1()); }
	RULE_ID
	{ after(grammarAccess.getQCREFAccess().getIDTerminalRuleCall_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GumboSubclause__SpecsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGumboSubclauseAccess().getSpecsSpecSectionParserRuleCall_1_0()); }
		ruleSpecSection
		{ after(grammarAccess.getGumboSubclauseAccess().getSpecsSpecSectionParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecSection__StateAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSpecSectionAccess().getStateStateParserRuleCall_1_0()); }
		ruleState
		{ after(grammarAccess.getSpecSectionAccess().getStateStateParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecSection__FunctionsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSpecSectionAccess().getFunctionsFunctionsParserRuleCall_2_0()); }
		ruleFunctions
		{ after(grammarAccess.getSpecSectionAccess().getFunctionsFunctionsParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecSection__InvariantsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSpecSectionAccess().getInvariantsInvariantsParserRuleCall_3_0()); }
		ruleInvariants
		{ after(grammarAccess.getSpecSectionAccess().getInvariantsInvariantsParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecSection__IntegrationAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSpecSectionAccess().getIntegrationIntegrationParserRuleCall_4_0()); }
		ruleIntegration
		{ after(grammarAccess.getSpecSectionAccess().getIntegrationIntegrationParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecSection__InitializeAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSpecSectionAccess().getInitializeInitializeParserRuleCall_5_0()); }
		ruleInitialize
		{ after(grammarAccess.getSpecSectionAccess().getInitializeInitializeParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecSection__ComputeAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSpecSectionAccess().getComputeComputeParserRuleCall_6_0()); }
		ruleCompute
		{ after(grammarAccess.getSpecSectionAccess().getComputeComputeParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__DeclsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateAccess().getDeclsStateVarDeclParserRuleCall_1_0()); }
		ruleStateVarDecl
		{ after(grammarAccess.getStateAccess().getDeclsStateVarDeclParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateVarDecl__NameAssignment_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateVarDeclAccess().getNameIDTerminalRuleCall_0_0_0()); }
		RULE_ID
		{ after(grammarAccess.getStateVarDeclAccess().getNameIDTerminalRuleCall_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateVarDecl__TypeNameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateVarDeclAccess().getTypeNameDataSubcomponentTypeCrossReference_1_0()); }
		(
			{ before(grammarAccess.getStateVarDeclAccess().getTypeNameDataSubcomponentTypeQCREFParserRuleCall_1_0_1()); }
			ruleQCREF
			{ after(grammarAccess.getStateVarDeclAccess().getTypeNameDataSubcomponentTypeQCREFParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getStateVarDeclAccess().getTypeNameDataSubcomponentTypeCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Invariants__SpecsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInvariantsAccess().getSpecsInvSpecParserRuleCall_1_0()); }
		ruleInvSpec
		{ after(grammarAccess.getInvariantsAccess().getSpecsInvSpecParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InvSpec__IdAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInvSpecAccess().getIdIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getInvSpecAccess().getIdIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InvSpec__DescriptorAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInvSpecAccess().getDescriptorSLANG_STRINGTerminalRuleCall_2_0()); }
		RULE_SLANG_STRING
		{ after(grammarAccess.getInvSpecAccess().getDescriptorSLANG_STRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InvSpec__ExprAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInvSpecAccess().getExprExprParserRuleCall_4_0()); }
		ruleExpr
		{ after(grammarAccess.getInvSpecAccess().getExprExprParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Integration__SpecsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntegrationAccess().getSpecsSpecStatementParserRuleCall_1_0()); }
		ruleSpecStatement
		{ after(grammarAccess.getIntegrationAccess().getSpecsSpecStatementParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Initialize__ModifiesAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInitializeAccess().getModifiesSlangModifiesParserRuleCall_1_0_0()); }
		ruleSlangModifies
		{ after(grammarAccess.getInitializeAccess().getModifiesSlangModifiesParserRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Initialize__SpecsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInitializeAccess().getSpecsInitializeSpecStatementParserRuleCall_2_0()); }
		ruleInitializeSpecStatement
		{ after(grammarAccess.getInitializeAccess().getSpecsInitializeSpecStatementParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InitializeSpecStatement__GuaranteeStatementAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInitializeSpecStatementAccess().getGuaranteeStatementGuaranteeStatementParserRuleCall_0()); }
		ruleGuaranteeStatement
		{ after(grammarAccess.getInitializeSpecStatementAccess().getGuaranteeStatementGuaranteeStatementParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compute__ModifiesAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComputeAccess().getModifiesSlangModifiesParserRuleCall_1_0_0()); }
		ruleSlangModifies
		{ after(grammarAccess.getComputeAccess().getModifiesSlangModifiesParserRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compute__CasesAssignment_2_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComputeAccess().getCasesCaseStatementClauseParserRuleCall_2_0_1_0()); }
		ruleCaseStatementClause
		{ after(grammarAccess.getComputeAccess().getCasesCaseStatementClauseParserRuleCall_2_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compute__ImplicationsAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComputeAccess().getImplicationsImplicationStatementParserRuleCall_2_1_0()); }
		ruleImplicationStatement
		{ after(grammarAccess.getComputeAccess().getImplicationsImplicationStatementParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compute__HandlersAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComputeAccess().getHandlersHandlerClauseParserRuleCall_3_0()); }
		ruleHandlerClause
		{ after(grammarAccess.getComputeAccess().getHandlersHandlerClauseParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__HandlerClause__IdAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getHandlerClauseAccess().getIdPortCrossReference_1_0()); }
		(
			{ before(grammarAccess.getHandlerClauseAccess().getIdPortIDTerminalRuleCall_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getHandlerClauseAccess().getIdPortIDTerminalRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getHandlerClauseAccess().getIdPortCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__HandlerClause__ModifiesAssignment_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getHandlerClauseAccess().getModifiesSlangModifiesParserRuleCall_3_0_0()); }
		ruleSlangModifies
		{ after(grammarAccess.getHandlerClauseAccess().getModifiesSlangModifiesParserRuleCall_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__HandlerClause__GuaranteesAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getHandlerClauseAccess().getGuaranteesGuaranteeStatementParserRuleCall_4_0()); }
		ruleGuaranteeStatement
		{ after(grammarAccess.getHandlerClauseAccess().getGuaranteesGuaranteeStatementParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CaseStatementClause__IdAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCaseStatementClauseAccess().getIdIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getCaseStatementClauseAccess().getIdIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CaseStatementClause__DescriptorAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCaseStatementClauseAccess().getDescriptorSLANG_STRINGTerminalRuleCall_2_0()); }
		RULE_SLANG_STRING
		{ after(grammarAccess.getCaseStatementClauseAccess().getDescriptorSLANG_STRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CaseStatementClause__AssumeStatementAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCaseStatementClauseAccess().getAssumeStatementAnonAssumeStatementParserRuleCall_4_0()); }
		ruleAnonAssumeStatement
		{ after(grammarAccess.getCaseStatementClauseAccess().getAssumeStatementAnonAssumeStatementParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CaseStatementClause__GuaranteeStatementAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCaseStatementClauseAccess().getGuaranteeStatementAnonGuaranteeStatementParserRuleCall_5_0()); }
		ruleAnonGuaranteeStatement
		{ after(grammarAccess.getCaseStatementClauseAccess().getGuaranteeStatementAnonGuaranteeStatementParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AssumeStatement__IdAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAssumeStatementAccess().getIdIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getAssumeStatementAccess().getIdIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AssumeStatement__DescriptorAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAssumeStatementAccess().getDescriptorSLANG_STRINGTerminalRuleCall_2_0()); }
		RULE_SLANG_STRING
		{ after(grammarAccess.getAssumeStatementAccess().getDescriptorSLANG_STRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AssumeStatement__ExprAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAssumeStatementAccess().getExprExprParserRuleCall_4_0()); }
		ruleExpr
		{ after(grammarAccess.getAssumeStatementAccess().getExprExprParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnonAssumeStatement__ExprAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAnonAssumeStatementAccess().getExprExprParserRuleCall_1_0()); }
		ruleExpr
		{ after(grammarAccess.getAnonAssumeStatementAccess().getExprExprParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GuaranteeStatement__IdAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGuaranteeStatementAccess().getIdIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getGuaranteeStatementAccess().getIdIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GuaranteeStatement__DescriptorAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGuaranteeStatementAccess().getDescriptorSLANG_STRINGTerminalRuleCall_2_0()); }
		RULE_SLANG_STRING
		{ after(grammarAccess.getGuaranteeStatementAccess().getDescriptorSLANG_STRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GuaranteeStatement__ExprAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGuaranteeStatementAccess().getExprExprParserRuleCall_4_0()); }
		ruleExpr
		{ after(grammarAccess.getGuaranteeStatementAccess().getExprExprParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplicationStatement__IdAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImplicationStatementAccess().getIdIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getImplicationStatementAccess().getIdIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplicationStatement__DescriptorAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImplicationStatementAccess().getDescriptorSLANG_STRINGTerminalRuleCall_2_0()); }
		RULE_SLANG_STRING
		{ after(grammarAccess.getImplicationStatementAccess().getDescriptorSLANG_STRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplicationStatement__AntecedentAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImplicationStatementAccess().getAntecedentExprParserRuleCall_4_0()); }
		ruleExpr
		{ after(grammarAccess.getImplicationStatementAccess().getAntecedentExprParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplicationStatement__ConsequentAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImplicationStatementAccess().getConsequentExprParserRuleCall_6_0()); }
		ruleExpr
		{ after(grammarAccess.getImplicationStatementAccess().getConsequentExprParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnonGuaranteeStatement__ExprAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAnonGuaranteeStatementAccess().getExprExprParserRuleCall_1_0()); }
		ruleExpr
		{ after(grammarAccess.getAnonGuaranteeStatementAccess().getExprExprParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OtherDataRef__NamedElementAssignment_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOtherDataRefAccess().getNamedElementNamedElementCrossReference_0_0_0()); }
		(
			{ before(grammarAccess.getOtherDataRefAccess().getNamedElementNamedElementIDTerminalRuleCall_0_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getOtherDataRefAccess().getNamedElementNamedElementIDTerminalRuleCall_0_0_0_1()); }
		)
		{ after(grammarAccess.getOtherDataRefAccess().getNamedElementNamedElementCrossReference_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OtherDataRef__ArrayRangeAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOtherDataRefAccess().getArrayRangeArrayRangeParserRuleCall_0_1_0()); }
		ruleArrayRange
		{ after(grammarAccess.getOtherDataRefAccess().getArrayRangeArrayRangeParserRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OtherDataRef__PathAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOtherDataRefAccess().getPathOtherDataRefParserRuleCall_1_1_0()); }
		ruleOtherDataRef
		{ after(grammarAccess.getOtherDataRefAccess().getPathOtherDataRefParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataElement__DataElementAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDataElementAccess().getDataElementDataSubcomponentTypeCrossReference_0()); }
		(
			{ before(grammarAccess.getDataElementAccess().getDataElementDataSubcomponentTypeQCREFParserRuleCall_0_1()); }
			ruleQCREF
			{ after(grammarAccess.getDataElementAccess().getDataElementDataSubcomponentTypeQCREFParserRuleCall_0_1()); }
		)
		{ after(grammarAccess.getDataElementAccess().getDataElementDataSubcomponentTypeCrossReference_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Functions__SpecsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunctionsAccess().getSpecsFuncSpecParserRuleCall_1_0()); }
		ruleFuncSpec
		{ after(grammarAccess.getFunctionsAccess().getSpecsFuncSpecParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDecl__SdeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangDefDeclAccess().getSdeSlangDefExtParserRuleCall_2_0()); }
		ruleSlangDefExt
		{ after(grammarAccess.getSlangDefDeclAccess().getSdeSlangDefExtParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDecl__NameAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangDefDeclAccess().getNameSlangDefIDParserRuleCall_3_0()); }
		ruleSlangDefID
		{ after(grammarAccess.getSlangDefDeclAccess().getNameSlangDefIDParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDecl__TypeParamsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangDefDeclAccess().getTypeParamsSlangTypeParamsParserRuleCall_4_0()); }
		ruleSlangTypeParams
		{ after(grammarAccess.getSlangDefDeclAccess().getTypeParamsSlangTypeParamsParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDecl__ParamsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangDefDeclAccess().getParamsSlangDefParamsParserRuleCall_5_0()); }
		ruleSlangDefParams
		{ after(grammarAccess.getSlangDefDeclAccess().getParamsSlangDefParamsParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDecl__TypeAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangDefDeclAccess().getTypeSlangTypeParserRuleCall_7_0()); }
		ruleSlangType
		{ after(grammarAccess.getSlangDefDeclAccess().getTypeSlangTypeParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDecl__CAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangDefDeclAccess().getCSlangDefContractParserRuleCall_8_0()); }
		ruleSlangDefContract
		{ after(grammarAccess.getSlangDefDeclAccess().getCSlangDefContractParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDef__SdeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangDefDefAccess().getSdeSlangDefExtParserRuleCall_2_0()); }
		ruleSlangDefExt
		{ after(grammarAccess.getSlangDefDefAccess().getSdeSlangDefExtParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDef__NameAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangDefDefAccess().getNameSlangDefIDParserRuleCall_3_0()); }
		ruleSlangDefID
		{ after(grammarAccess.getSlangDefDefAccess().getNameSlangDefIDParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDef__TypeParamsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangDefDefAccess().getTypeParamsSlangTypeParamsParserRuleCall_4_0()); }
		ruleSlangTypeParams
		{ after(grammarAccess.getSlangDefDefAccess().getTypeParamsSlangTypeParamsParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDef__ParamsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangDefDefAccess().getParamsSlangDefParamsParserRuleCall_5_0()); }
		ruleSlangDefParams
		{ after(grammarAccess.getSlangDefDefAccess().getParamsSlangDefParamsParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDef__TypeAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangDefDefAccess().getTypeSlangTypeParserRuleCall_7_0()); }
		ruleSlangType
		{ after(grammarAccess.getSlangDefDefAccess().getTypeSlangTypeParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDef__CAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangDefDefAccess().getCSlangDefContractParserRuleCall_8_0()); }
		ruleSlangDefContract
		{ after(grammarAccess.getSlangDefDefAccess().getCSlangDefContractParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDef__EAssignment_10
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangDefDefAccess().getEExprParserRuleCall_10_0()); }
		ruleExpr
		{ after(grammarAccess.getSlangDefDefAccess().getEExprParserRuleCall_10_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefExt__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangDefExtAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getSlangDefExtAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefExt__TypeNameAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangDefExtAccess().getTypeNameSlangTypeParserRuleCall_3_0()); }
		ruleSlangType
		{ after(grammarAccess.getSlangDefExtAccess().getTypeNameSlangTypeParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefParams__ParamsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangDefParamsAccess().getParamsSlangDefParamParserRuleCall_1_0()); }
		ruleSlangDefParam
		{ after(grammarAccess.getSlangDefParamsAccess().getParamsSlangDefParamParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefParams__ParamsAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangDefParamsAccess().getParamsSlangDefParamParserRuleCall_2_1_0()); }
		ruleSlangDefParam
		{ after(grammarAccess.getSlangDefParamsAccess().getParamsSlangDefParamParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefParam__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangDefParamAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getSlangDefParamAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefParam__TypeNameAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangDefParamAccess().getTypeNameSlangTypeParserRuleCall_3_0()); }
		ruleSlangType
		{ after(grammarAccess.getSlangDefParamAccess().getTypeNameSlangTypeParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContract__ReaAssignment_2_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangDefContractAccess().getReaSlangReadsParserRuleCall_2_0_0_0()); }
		ruleSlangReads
		{ after(grammarAccess.getSlangDefContractAccess().getReaSlangReadsParserRuleCall_2_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContract__ReqAssignment_2_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangDefContractAccess().getReqSlangRequiresParserRuleCall_2_0_1_0()); }
		ruleSlangRequires
		{ after(grammarAccess.getSlangDefContractAccess().getReqSlangRequiresParserRuleCall_2_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContract__ModAssignment_2_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangDefContractAccess().getModSlangModifiesParserRuleCall_2_0_2_0()); }
		ruleSlangModifies
		{ after(grammarAccess.getSlangDefContractAccess().getModSlangModifiesParserRuleCall_2_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContract__EnsAssignment_2_0_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangDefContractAccess().getEnsSlangEnsuresParserRuleCall_2_0_3_0()); }
		ruleSlangEnsures
		{ after(grammarAccess.getSlangDefContractAccess().getEnsSlangEnsuresParserRuleCall_2_0_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContract__ContractsAssignment_2_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangDefContractAccess().getContractsSlangDefContractCaseParserRuleCall_2_1_0_0()); }
		ruleSlangDefContractCase
		{ after(grammarAccess.getSlangDefContractAccess().getContractsSlangDefContractCaseParserRuleCall_2_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContract__ReaAssignment_2_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangDefContractAccess().getReaSlangReadsParserRuleCall_2_1_1_0()); }
		ruleSlangReads
		{ after(grammarAccess.getSlangDefContractAccess().getReaSlangReadsParserRuleCall_2_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContract__ModAssignment_2_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangDefContractAccess().getModSlangModifiesParserRuleCall_2_1_2_0()); }
		ruleSlangModifies
		{ after(grammarAccess.getSlangDefContractAccess().getModSlangModifiesParserRuleCall_2_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContractCase__ReqAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangDefContractCaseAccess().getReqSlangRequiresParserRuleCall_3_0()); }
		ruleSlangRequires
		{ after(grammarAccess.getSlangDefContractCaseAccess().getReqSlangRequiresParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContractCase__EnsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangDefContractCaseAccess().getEnsSlangEnsuresParserRuleCall_4_0()); }
		ruleSlangEnsures
		{ after(grammarAccess.getSlangDefContractCaseAccess().getEnsSlangEnsuresParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangSupr__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangSuprAccess().getNameSlangNameParserRuleCall_0_0()); }
		ruleSlangName
		{ after(grammarAccess.getSlangSuprAccess().getNameSlangNameParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangSupr__ArgsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangSuprAccess().getArgsSlangTypeArgsParserRuleCall_1_0()); }
		ruleSlangTypeArgs
		{ after(grammarAccess.getSlangSuprAccess().getArgsSlangTypeArgsParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangInvariant__ExprsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangInvariantAccess().getExprsExprParserRuleCall_1_0()); }
		ruleExpr
		{ after(grammarAccess.getSlangInvariantAccess().getExprsExprParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangInvariant__ExprsAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangInvariantAccess().getExprsExprParserRuleCall_2_1_0()); }
		ruleExpr
		{ after(grammarAccess.getSlangInvariantAccess().getExprsExprParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangReads__ExprsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangReadsAccess().getExprsExprParserRuleCall_1_0()); }
		ruleExpr
		{ after(grammarAccess.getSlangReadsAccess().getExprsExprParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangReads__ExprsAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangReadsAccess().getExprsExprParserRuleCall_2_1_0()); }
		ruleExpr
		{ after(grammarAccess.getSlangReadsAccess().getExprsExprParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangRequires__ExprsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangRequiresAccess().getExprsExprParserRuleCall_1_0()); }
		ruleExpr
		{ after(grammarAccess.getSlangRequiresAccess().getExprsExprParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangRequires__ExprsAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangRequiresAccess().getExprsExprParserRuleCall_2_1_0()); }
		ruleExpr
		{ after(grammarAccess.getSlangRequiresAccess().getExprsExprParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangModifies__ExprsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangModifiesAccess().getExprsExprParserRuleCall_1_0()); }
		ruleExpr
		{ after(grammarAccess.getSlangModifiesAccess().getExprsExprParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangModifies__ExprsAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangModifiesAccess().getExprsExprParserRuleCall_2_1_0()); }
		ruleExpr
		{ after(grammarAccess.getSlangModifiesAccess().getExprsExprParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangEnsures__ExprsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangEnsuresAccess().getExprsExprParserRuleCall_1_0()); }
		ruleExpr
		{ after(grammarAccess.getSlangEnsuresAccess().getExprsExprParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangEnsures__ExprsAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangEnsuresAccess().getExprsExprParserRuleCall_2_1_0()); }
		ruleExpr
		{ after(grammarAccess.getSlangEnsuresAccess().getExprsExprParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__DAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangStmtAccess().getDSlangVarDefParserRuleCall_0_1_0()); }
		ruleSlangVarDef
		{ after(grammarAccess.getSlangStmtAccess().getDSlangVarDefParserRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__CondAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangStmtAccess().getCondExprParserRuleCall_1_2_0()); }
		ruleExpr
		{ after(grammarAccess.getSlangStmtAccess().getCondExprParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__BAssignment_1_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangStmtAccess().getBSlangBlockParserRuleCall_1_3_0()); }
		ruleSlangBlock
		{ after(grammarAccess.getSlangStmtAccess().getBSlangBlockParserRuleCall_1_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__EAssignment_1_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangStmtAccess().getESlangElseParserRuleCall_1_4_0()); }
		ruleSlangElse
		{ after(grammarAccess.getSlangStmtAccess().getESlangElseParserRuleCall_1_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__CondAssignment_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangStmtAccess().getCondExprParserRuleCall_2_2_0()); }
		ruleExpr
		{ after(grammarAccess.getSlangStmtAccess().getCondExprParserRuleCall_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__LAssignment_2_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangStmtAccess().getLSlangLoopContractParserRuleCall_2_3_0()); }
		ruleSlangLoopContract
		{ after(grammarAccess.getSlangStmtAccess().getLSlangLoopContractParserRuleCall_2_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__BAssignment_2_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangStmtAccess().getBSlangBlockParserRuleCall_2_4_0()); }
		ruleSlangBlock
		{ after(grammarAccess.getSlangStmtAccess().getBSlangBlockParserRuleCall_2_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__TestExprAssignment_3_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangStmtAccess().getTestExprExprParserRuleCall_3_2_0()); }
		ruleExpr
		{ after(grammarAccess.getSlangStmtAccess().getTestExprExprParserRuleCall_3_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__CAssignment_3_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangStmtAccess().getCSlangCaseParserRuleCall_3_4_0()); }
		ruleSlangCase
		{ after(grammarAccess.getSlangStmtAccess().getCSlangCaseParserRuleCall_3_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__BAssignment_4_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangStmtAccess().getBSlangBlockParserRuleCall_4_2_0()); }
		ruleSlangBlock
		{ after(grammarAccess.getSlangStmtAccess().getBSlangBlockParserRuleCall_4_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__EAssignment_5_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangStmtAccess().getEExprParserRuleCall_5_2_0()); }
		ruleExpr
		{ after(grammarAccess.getSlangStmtAccess().getEExprParserRuleCall_5_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__EAssignment_6_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangStmtAccess().getEExprParserRuleCall_6_2_0()); }
		ruleExpr
		{ after(grammarAccess.getSlangStmtAccess().getEExprParserRuleCall_6_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__EAssignment_8_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangStmtAccess().getEExprParserRuleCall_8_2_0()); }
		ruleExpr
		{ after(grammarAccess.getSlangStmtAccess().getEExprParserRuleCall_8_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__PortOrSubcomponentOrStateVarAssignment_9_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangStmtAccess().getPortOrSubcomponentOrStateVarEObjectCrossReference_9_1_0()); }
		(
			{ before(grammarAccess.getSlangStmtAccess().getPortOrSubcomponentOrStateVarEObjectIDTerminalRuleCall_9_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getSlangStmtAccess().getPortOrSubcomponentOrStateVarEObjectIDTerminalRuleCall_9_1_0_1()); }
		)
		{ after(grammarAccess.getSlangStmtAccess().getPortOrSubcomponentOrStateVarEObjectCrossReference_9_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__LAssignment_9_2_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangStmtAccess().getLSlangLHSSuffixParserRuleCall_9_2_1_0_0()); }
		ruleSlangLHSSuffix
		{ after(grammarAccess.getSlangStmtAccess().getLSlangLHSSuffixParserRuleCall_9_2_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangStmt__EAssignment_9_2_1_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangStmtAccess().getEExprParserRuleCall_9_2_1_1_1_0()); }
		ruleExpr
		{ after(grammarAccess.getSlangStmtAccess().getEExprParserRuleCall_9_2_1_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangElse__CondAssignment_1_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangElseAccess().getCondExprParserRuleCall_1_0_1_0()); }
		ruleExpr
		{ after(grammarAccess.getSlangElseAccess().getCondExprParserRuleCall_1_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangElse__BAssignment_1_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangElseAccess().getBSlangBlockParserRuleCall_1_0_2_0()); }
		ruleSlangBlock
		{ after(grammarAccess.getSlangElseAccess().getBSlangBlockParserRuleCall_1_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangElse__EAssignment_1_0_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangElseAccess().getESlangElseParserRuleCall_1_0_3_0()); }
		ruleSlangElse
		{ after(grammarAccess.getSlangElseAccess().getESlangElseParserRuleCall_1_0_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLoopContract__InvAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangLoopContractAccess().getInvSlangInvariantParserRuleCall_1_0()); }
		ruleSlangInvariant
		{ after(grammarAccess.getSlangLoopContractAccess().getInvSlangInvariantParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLoopContract__ModAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangLoopContractAccess().getModSlangModifiesParserRuleCall_2_0()); }
		ruleSlangModifies
		{ after(grammarAccess.getSlangLoopContractAccess().getModSlangModifiesParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLHSSuffix__ExprsAssignment_1_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangLHSSuffixAccess().getExprsExprParserRuleCall_1_2_0_0()); }
		ruleExpr
		{ after(grammarAccess.getSlangLHSSuffixAccess().getExprsExprParserRuleCall_1_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLHSSuffix__ExprsAssignment_1_2_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangLHSSuffixAccess().getExprsExprParserRuleCall_1_2_1_1_0()); }
		ruleExpr
		{ after(grammarAccess.getSlangLHSSuffixAccess().getExprsExprParserRuleCall_1_2_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangCase__PatternAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangCaseAccess().getPatternSlangPatternParserRuleCall_1_0()); }
		ruleSlangPattern
		{ after(grammarAccess.getSlangCaseAccess().getPatternSlangPatternParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangCase__EAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangCaseAccess().getEExprParserRuleCall_2_1_0()); }
		ruleExpr
		{ after(grammarAccess.getSlangCaseAccess().getEExprParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangCase__SAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangCaseAccess().getSSlangStmtParserRuleCall_4_0()); }
		ruleSlangStmt
		{ after(grammarAccess.getSlangCaseAccess().getSSlangStmtParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangPattern__PatternsAssignment_0_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangPatternAccess().getPatternsSlangTPatternParserRuleCall_0_2_1_0()); }
		ruleSlangTPattern
		{ after(grammarAccess.getSlangPatternAccess().getPatternsSlangTPatternParserRuleCall_0_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangPattern__PatternsAssignment_0_2_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangPatternAccess().getPatternsSlangTPatternParserRuleCall_0_2_2_1_0()); }
		ruleSlangTPattern
		{ after(grammarAccess.getSlangPatternAccess().getPatternsSlangTPatternParserRuleCall_0_2_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangPattern__PatternsAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangPatternAccess().getPatternsSlangTPatternParserRuleCall_1_1_0()); }
		ruleSlangTPattern
		{ after(grammarAccess.getSlangPatternAccess().getPatternsSlangTPatternParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangPattern__PatternsAssignment_1_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangPatternAccess().getPatternsSlangTPatternParserRuleCall_1_2_1_0()); }
		ruleSlangTPattern
		{ after(grammarAccess.getSlangPatternAccess().getPatternsSlangTPatternParserRuleCall_1_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTPattern__PatternsAssignment_0_2_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangTPatternAccess().getPatternsSlangTPatternParserRuleCall_0_2_0_1_0()); }
		ruleSlangTPattern
		{ after(grammarAccess.getSlangTPatternAccess().getPatternsSlangTPatternParserRuleCall_0_2_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTPattern__PatternsAssignment_0_2_0_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangTPatternAccess().getPatternsSlangTPatternParserRuleCall_0_2_0_2_1_0()); }
		ruleSlangTPattern
		{ after(grammarAccess.getSlangTPatternAccess().getPatternsSlangTPatternParserRuleCall_0_2_0_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTPattern__TypeAssignment_0_2_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangTPatternAccess().getTypeSlangTypeParserRuleCall_0_2_1_1_0()); }
		ruleSlangType
		{ after(grammarAccess.getSlangTPatternAccess().getTypeSlangTypeParserRuleCall_0_2_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTPattern__PatternsAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangTPatternAccess().getPatternsSlangTPatternParserRuleCall_1_1_0()); }
		ruleSlangTPattern
		{ after(grammarAccess.getSlangTPatternAccess().getPatternsSlangTPatternParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTPattern__PatternsAssignment_1_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangTPatternAccess().getPatternsSlangTPatternParserRuleCall_1_2_1_0()); }
		ruleSlangTPattern
		{ after(grammarAccess.getSlangTPatternAccess().getPatternsSlangTPatternParserRuleCall_1_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTPattern__TypeAssignment_2_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangTPatternAccess().getTypeSlangTypeParserRuleCall_2_2_1_0()); }
		ruleSlangType
		{ after(grammarAccess.getSlangTPatternAccess().getTypeSlangTypeParserRuleCall_2_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangVarDef__TypeNameAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangVarDefAccess().getTypeNameSlangTypeParserRuleCall_2_1_0()); }
		ruleSlangType
		{ after(grammarAccess.getSlangVarDefAccess().getTypeNameSlangTypeParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangVarDef__InitAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangVarDefAccess().getInitExprParserRuleCall_4_0()); }
		ruleExpr
		{ after(grammarAccess.getSlangVarDefAccess().getInitExprParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expr__TermsAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExprAccess().getTermsSlangAccessParserRuleCall_0_1_0()); }
		ruleSlangAccess
		{ after(grammarAccess.getExprAccess().getTermsSlangAccessParserRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expr__OpsAssignment_0_2_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExprAccess().getOpsOperatorParserRuleCall_0_2_0_0_0()); }
		ruleOperator
		{ after(grammarAccess.getExprAccess().getOpsOperatorParserRuleCall_0_2_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expr__TermsAssignment_0_2_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExprAccess().getTermsSlangAccessParserRuleCall_0_2_0_1_0()); }
		ruleSlangAccess
		{ after(grammarAccess.getExprAccess().getTermsSlangAccessParserRuleCall_0_2_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expr__ThenExprAssignment_0_2_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExprAccess().getThenExprExprParserRuleCall_0_2_1_1_0()); }
		ruleExpr
		{ after(grammarAccess.getExprAccess().getThenExprExprParserRuleCall_0_2_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expr__ElseExprAssignment_0_2_1_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExprAccess().getElseExprExprParserRuleCall_0_2_1_3_0()); }
		ruleExpr
		{ after(grammarAccess.getExprAccess().getElseExprExprParserRuleCall_0_2_1_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expr__QVarAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExprAccess().getQVarSlangQuantVarParserRuleCall_1_2_0()); }
		ruleSlangQuantVar
		{ after(grammarAccess.getExprAccess().getQVarSlangQuantVarParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expr__QVarAssignment_1_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExprAccess().getQVarSlangQuantVarParserRuleCall_1_3_1_0()); }
		ruleSlangQuantVar
		{ after(grammarAccess.getExprAccess().getQVarSlangQuantVarParserRuleCall_1_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expr__QuantifiedExprAssignment_1_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExprAccess().getQuantifiedExprExprParserRuleCall_1_5_0()); }
		ruleExpr
		{ after(grammarAccess.getExprAccess().getQuantifiedExprExprParserRuleCall_1_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expr__OpAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExprAccess().getOpOperatorParserRuleCall_2_1_0()); }
		ruleOperator
		{ after(grammarAccess.getExprAccess().getOpOperatorParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expr__AccessExpAssignment_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExprAccess().getAccessExpSlangAccessParserRuleCall_2_2_0()); }
		ruleSlangAccess
		{ after(grammarAccess.getExprAccess().getAccessExpSlangAccessParserRuleCall_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangQuantVar__EAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangQuantVarAccess().getEExprParserRuleCall_2_0()); }
		ruleExpr
		{ after(grammarAccess.getSlangQuantVarAccess().getEExprParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangQuantVar__UpperBoundAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangQuantVarAccess().getUpperBoundExprParserRuleCall_3_1_0()); }
		ruleExpr
		{ after(grammarAccess.getSlangQuantVarAccess().getUpperBoundExprParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangBlock__StmtsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangBlockAccess().getStmtsSlangStmtParserRuleCall_2_0()); }
		ruleSlangStmt
		{ after(grammarAccess.getSlangBlockAccess().getStmtsSlangStmtParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangBlock__RAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangBlockAccess().getRSlangRetParserRuleCall_3_0()); }
		ruleSlangRet
		{ after(grammarAccess.getSlangBlockAccess().getRSlangRetParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangAccess__TAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangAccessAccess().getTSlangTermParserRuleCall_1_0()); }
		ruleSlangTerm
		{ after(grammarAccess.getSlangAccessAccess().getTSlangTermParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__LitAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangTermAccess().getLitSlangLitParserRuleCall_0_1_0()); }
		ruleSlangLit
		{ after(grammarAccess.getSlangTermAccess().getLitSlangLitParserRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__IAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangTermAccess().getISlangInterpParserRuleCall_1_1_0()); }
		ruleSlangInterp
		{ after(grammarAccess.getSlangTermAccess().getISlangInterpParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__StateVarAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangTermAccess().getStateVarStateVarDeclCrossReference_2_1_0()); }
		(
			{ before(grammarAccess.getSlangTermAccess().getStateVarStateVarDeclIDTerminalRuleCall_2_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getSlangTermAccess().getStateVarStateVarDeclIDTerminalRuleCall_2_1_0_1()); }
		)
		{ after(grammarAccess.getSlangTermAccess().getStateVarStateVarDeclCrossReference_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__EventPortAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangTermAccess().getEventPortPortCrossReference_3_1_0()); }
		(
			{ before(grammarAccess.getSlangTermAccess().getEventPortPortIDTerminalRuleCall_3_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getSlangTermAccess().getEventPortPortIDTerminalRuleCall_3_1_0_1()); }
		)
		{ after(grammarAccess.getSlangTermAccess().getEventPortPortCrossReference_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__ValueAssignment_3_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangTermAccess().getValueExprParserRuleCall_3_3_0()); }
		ruleExpr
		{ after(grammarAccess.getSlangTermAccess().getValueExprParserRuleCall_3_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__EventPortAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangTermAccess().getEventPortPortCrossReference_4_1_0()); }
		(
			{ before(grammarAccess.getSlangTermAccess().getEventPortPortIDTerminalRuleCall_4_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getSlangTermAccess().getEventPortPortIDTerminalRuleCall_4_1_0_1()); }
		)
		{ after(grammarAccess.getSlangTermAccess().getEventPortPortCrossReference_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__ValueAssignment_4_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangTermAccess().getValueExprParserRuleCall_4_3_0()); }
		ruleExpr
		{ after(grammarAccess.getSlangTermAccess().getValueExprParserRuleCall_4_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__EnumTypeAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangTermAccess().getEnumTypeDataElementParserRuleCall_5_1_0()); }
		ruleDataElement
		{ after(grammarAccess.getSlangTermAccess().getEnumTypeDataElementParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__ValueAssignment_5_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangTermAccess().getValueStringLiteralCrossReference_5_3_0()); }
		(
			{ before(grammarAccess.getSlangTermAccess().getValueStringLiteralIDTerminalRuleCall_5_3_0_1()); }
			RULE_ID
			{ after(grammarAccess.getSlangTermAccess().getValueStringLiteralIDTerminalRuleCall_5_3_0_1()); }
		)
		{ after(grammarAccess.getSlangTermAccess().getValueStringLiteralCrossReference_5_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__RecordTypeAssignment_6_0_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangTermAccess().getRecordTypeDataElementParserRuleCall_6_0_0_1_0()); }
		ruleDataElement
		{ after(grammarAccess.getSlangTermAccess().getRecordTypeDataElementParserRuleCall_6_0_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__ArgsAssignment_6_0_0_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangTermAccess().getArgsNamedElementCrossReference_6_0_0_3_0()); }
		(
			{ before(grammarAccess.getSlangTermAccess().getArgsNamedElementIDTerminalRuleCall_6_0_0_3_0_1()); }
			RULE_ID
			{ after(grammarAccess.getSlangTermAccess().getArgsNamedElementIDTerminalRuleCall_6_0_0_3_0_1()); }
		)
		{ after(grammarAccess.getSlangTermAccess().getArgsNamedElementCrossReference_6_0_0_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__ArgExprAssignment_6_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangTermAccess().getArgExprExprParserRuleCall_6_1_0()); }
		ruleExpr
		{ after(grammarAccess.getSlangTermAccess().getArgExprExprParserRuleCall_6_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__ArgsAssignment_6_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangTermAccess().getArgsNamedElementCrossReference_6_2_1_0()); }
		(
			{ before(grammarAccess.getSlangTermAccess().getArgsNamedElementIDTerminalRuleCall_6_2_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getSlangTermAccess().getArgsNamedElementIDTerminalRuleCall_6_2_1_0_1()); }
		)
		{ after(grammarAccess.getSlangTermAccess().getArgsNamedElementCrossReference_6_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__ArgExprAssignment_6_2_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangTermAccess().getArgExprExprParserRuleCall_6_2_3_0()); }
		ruleExpr
		{ after(grammarAccess.getSlangTermAccess().getArgExprExprParserRuleCall_6_2_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__PortOrSubcomponentOrStateVarAssignment_7_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangTermAccess().getPortOrSubcomponentOrStateVarEObjectCrossReference_7_1_0()); }
		(
			{ before(grammarAccess.getSlangTermAccess().getPortOrSubcomponentOrStateVarEObjectIDTerminalRuleCall_7_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getSlangTermAccess().getPortOrSubcomponentOrStateVarEObjectIDTerminalRuleCall_7_1_0_1()); }
		)
		{ after(grammarAccess.getSlangTermAccess().getPortOrSubcomponentOrStateVarEObjectCrossReference_7_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__RefAssignment_7_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangTermAccess().getRefOtherDataRefParserRuleCall_7_2_1_0()); }
		ruleOtherDataRef
		{ after(grammarAccess.getSlangTermAccess().getRefOtherDataRefParserRuleCall_7_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__CsAssignment_7_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangTermAccess().getCsSlangCallSuffixParserRuleCall_7_3_0()); }
		ruleSlangCallSuffix
		{ after(grammarAccess.getSlangTermAccess().getCsSlangCallSuffixParserRuleCall_7_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__EAssignment_8_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangTermAccess().getEExprParserRuleCall_8_2_0()); }
		ruleExpr
		{ after(grammarAccess.getSlangTermAccess().getEExprParserRuleCall_8_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__EAssignment_8_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangTermAccess().getEExprParserRuleCall_8_3_1_0()); }
		ruleExpr
		{ after(grammarAccess.getSlangTermAccess().getEExprParserRuleCall_8_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__RAssignment_9_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangTermAccess().getRSlangForRangeParserRuleCall_9_2_0()); }
		ruleSlangForRange
		{ after(grammarAccess.getSlangTermAccess().getRSlangForRangeParserRuleCall_9_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__RAssignment_9_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangTermAccess().getRSlangForRangeParserRuleCall_9_3_1_0()); }
		ruleSlangForRange
		{ after(grammarAccess.getSlangTermAccess().getRSlangForRangeParserRuleCall_9_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__BAssignment_9_5_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangTermAccess().getBSlangBlockParserRuleCall_9_5_0_0()); }
		ruleSlangBlock
		{ after(grammarAccess.getSlangTermAccess().getBSlangBlockParserRuleCall_9_5_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__EAssignment_9_5_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangTermAccess().getEExprParserRuleCall_9_5_1_1_0()); }
		ruleExpr
		{ after(grammarAccess.getSlangTermAccess().getEExprParserRuleCall_9_5_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__PAssignment_10_2_0_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangTermAccess().getPSlangParamsParserRuleCall_10_2_0_0_0_0()); }
		ruleSlangParams
		{ after(grammarAccess.getSlangTermAccess().getPSlangParamsParserRuleCall_10_2_0_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__EAssignment_10_2_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangTermAccess().getEExprParserRuleCall_10_2_0_1_0()); }
		ruleExpr
		{ after(grammarAccess.getSlangTermAccess().getEExprParserRuleCall_10_2_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__StmtAssignment_10_2_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangTermAccess().getStmtSlangStmtParserRuleCall_10_2_1_0_0()); }
		ruleSlangStmt
		{ after(grammarAccess.getSlangTermAccess().getStmtSlangStmtParserRuleCall_10_2_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__RAssignment_10_2_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangTermAccess().getRSlangRetParserRuleCall_10_2_1_1_0()); }
		ruleSlangRet
		{ after(grammarAccess.getSlangTermAccess().getRSlangRetParserRuleCall_10_2_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangParams__ParamsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangParamsAccess().getParamsSlangParamParserRuleCall_1_0()); }
		ruleSlangParam
		{ after(grammarAccess.getSlangParamsAccess().getParamsSlangParamParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangParams__ParamsAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangParamsAccess().getParamsSlangParamParserRuleCall_2_1_0()); }
		ruleSlangParam
		{ after(grammarAccess.getSlangParamsAccess().getParamsSlangParamParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangParam__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangParamAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getSlangParamAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangParam__TypeNameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangParamAccess().getTypeNameSlangTypeParserRuleCall_4_0()); }
		ruleSlangType
		{ after(grammarAccess.getSlangParamAccess().getTypeNameSlangTypeParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangForRange__EAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangForRangeAccess().getEExprParserRuleCall_2_0()); }
		ruleExpr
		{ after(grammarAccess.getSlangForRangeAccess().getEExprParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangForRange__UpperAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangForRangeAccess().getUpperExprParserRuleCall_3_1_0()); }
		ruleExpr
		{ after(grammarAccess.getSlangForRangeAccess().getUpperExprParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangForRange__StepAssignment_3_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangForRangeAccess().getStepExprParserRuleCall_3_2_1_0()); }
		ruleExpr
		{ after(grammarAccess.getSlangForRangeAccess().getStepExprParserRuleCall_3_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangRet__EAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangRetAccess().getEExprParserRuleCall_2_0()); }
		ruleExpr
		{ after(grammarAccess.getSlangRetAccess().getEExprParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangCallSuffix__TaAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangCallSuffixAccess().getTaSlangTypeArgsParserRuleCall_0_1_0()); }
		ruleSlangTypeArgs
		{ after(grammarAccess.getSlangCallSuffixAccess().getTaSlangTypeArgsParserRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangCallSuffix__CaAssignment_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangCallSuffixAccess().getCaSlangCallArgsParserRuleCall_0_2_0()); }
		ruleSlangCallArgs
		{ after(grammarAccess.getSlangCallSuffixAccess().getCaSlangCallArgsParserRuleCall_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangCallSuffix__CaAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangCallSuffixAccess().getCaSlangCallArgsParserRuleCall_1_0()); }
		ruleSlangCallArgs
		{ after(grammarAccess.getSlangCallSuffixAccess().getCaSlangCallArgsParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangCallArgs__ArgAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangCallArgsAccess().getArgSlangIDExpParserRuleCall_2_0_0()); }
		ruleSlangIDExp
		{ after(grammarAccess.getSlangCallArgsAccess().getArgSlangIDExpParserRuleCall_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangCallArgs__ArgAssignment_2_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangCallArgsAccess().getArgSlangIDExpParserRuleCall_2_1_1_0()); }
		ruleSlangIDExp
		{ after(grammarAccess.getSlangCallArgsAccess().getArgSlangIDExpParserRuleCall_2_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangIDExp__EAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangIDExpAccess().getEExprParserRuleCall_0_0()); }
		ruleExpr
		{ after(grammarAccess.getSlangIDExpAccess().getEExprParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangIDExp__EAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangIDExpAccess().getEExprParserRuleCall_1_1_0()); }
		ruleExpr
		{ after(grammarAccess.getSlangIDExpAccess().getEExprParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangBaseType__TypeNameAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangBaseTypeAccess().getTypeNameDataSubcomponentTypeCrossReference_0()); }
		(
			{ before(grammarAccess.getSlangBaseTypeAccess().getTypeNameDataSubcomponentTypeQCREFParserRuleCall_0_1()); }
			ruleQCREF
			{ after(grammarAccess.getSlangBaseTypeAccess().getTypeNameDataSubcomponentTypeQCREFParserRuleCall_0_1()); }
		)
		{ after(grammarAccess.getSlangBaseTypeAccess().getTypeNameDataSubcomponentTypeCrossReference_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTypeArgs__TypesAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangTypeArgsAccess().getTypesSlangTypeParserRuleCall_1_0()); }
		ruleSlangType
		{ after(grammarAccess.getSlangTypeArgsAccess().getTypesSlangTypeParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTypeArgs__TypesAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangTypeArgsAccess().getTypesSlangTypeParserRuleCall_2_1_0()); }
		ruleSlangType
		{ after(grammarAccess.getSlangTypeArgsAccess().getTypesSlangTypeParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLit__ValueAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangLitAccess().getValueAlternatives_0_1_0()); }
		(rule__SlangLit__ValueAlternatives_0_1_0)
		{ after(grammarAccess.getSlangLitAccess().getValueAlternatives_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLit__ValueAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangLitAccess().getValueINTEGER_LITTerminalRuleCall_1_1_0()); }
		RULE_INTEGER_LIT
		{ after(grammarAccess.getSlangLitAccess().getValueINTEGER_LITTerminalRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLit__ValueAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangLitAccess().getValueINT_IDFTerminalRuleCall_2_1_0()); }
		RULE_INT_IDF
		{ after(grammarAccess.getSlangLitAccess().getValueINT_IDFTerminalRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLit__ValueAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangLitAccess().getValueHEXTerminalRuleCall_3_1_0()); }
		RULE_HEX
		{ after(grammarAccess.getSlangLitAccess().getValueHEXTerminalRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLit__ValueAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangLitAccess().getValueBINTerminalRuleCall_4_1_0()); }
		RULE_BIN
		{ after(grammarAccess.getSlangLitAccess().getValueBINTerminalRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLit__ValueAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangLitAccess().getValueREAL_LITTerminalRuleCall_5_1_0()); }
		RULE_REAL_LIT
		{ after(grammarAccess.getSlangLitAccess().getValueREAL_LITTerminalRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLit__ValueAssignment_6_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangLitAccess().getValueSLANG_STRINGTerminalRuleCall_6_1_0()); }
		RULE_SLANG_STRING
		{ after(grammarAccess.getSlangLitAccess().getValueSLANG_STRINGTerminalRuleCall_6_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLit__ValueAssignment_7_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangLitAccess().getValueREAL_IDFTerminalRuleCall_7_1_0()); }
		RULE_REAL_IDF
		{ after(grammarAccess.getSlangLitAccess().getValueREAL_IDFTerminalRuleCall_7_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLit__ValueAssignment_8_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangLitAccess().getValueMSTRINGTerminalRuleCall_8_1_0()); }
		RULE_MSTRING
		{ after(grammarAccess.getSlangLitAccess().getValueMSTRINGTerminalRuleCall_8_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangInterp__MspAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangInterpAccess().getMspMSPTerminalRuleCall_0_1_0()); }
		RULE_MSP
		{ after(grammarAccess.getSlangInterpAccess().getMspMSPTerminalRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangInterp__SliAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangInterpAccess().getSliSLITerminalRuleCall_1_1_0()); }
		RULE_SLI
		{ after(grammarAccess.getSlangInterpAccess().getSliSLITerminalRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangInterp__MspbAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangInterpAccess().getMspbMSPBTerminalRuleCall_2_1_0()); }
		RULE_MSPB
		{ after(grammarAccess.getSlangInterpAccess().getMspbMSPBTerminalRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangInterp__MinterpAssignment_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangInterpAccess().getMinterpSlangMInterpParserRuleCall_2_2_0()); }
		ruleSlangMInterp
		{ after(grammarAccess.getSlangInterpAccess().getMinterpSlangMInterpParserRuleCall_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangMInterp__EAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangMInterpAccess().getEExprParserRuleCall_1_0()); }
		ruleExpr
		{ after(grammarAccess.getSlangMInterpAccess().getEExprParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangMInterp__MAssignment_3_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangMInterpAccess().getMSlangMInterpParserRuleCall_3_0_1_0()); }
		ruleSlangMInterp
		{ after(grammarAccess.getSlangMInterpAccess().getMSlangMInterpParserRuleCall_3_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__PropertyAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getContainedPropertyAssociationAccess().getPropertyPropertyCrossReference_0_0()); }
		(
			{ before(grammarAccess.getContainedPropertyAssociationAccess().getPropertyPropertyQPREFParserRuleCall_0_0_1()); }
			ruleQPREF
			{ after(grammarAccess.getContainedPropertyAssociationAccess().getPropertyPropertyQPREFParserRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getContainedPropertyAssociationAccess().getPropertyPropertyCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__AppendAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getContainedPropertyAssociationAccess().getAppendPlusSignEqualsSignGreaterThanSignKeyword_1_1_0()); }
		(
			{ before(grammarAccess.getContainedPropertyAssociationAccess().getAppendPlusSignEqualsSignGreaterThanSignKeyword_1_1_0()); }
			PlusSignEqualsSignGreaterThanSign
			{ after(grammarAccess.getContainedPropertyAssociationAccess().getAppendPlusSignEqualsSignGreaterThanSignKeyword_1_1_0()); }
		)
		{ after(grammarAccess.getContainedPropertyAssociationAccess().getAppendPlusSignEqualsSignGreaterThanSignKeyword_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__ConstantAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getContainedPropertyAssociationAccess().getConstantConstantKeyword_2_0()); }
		(
			{ before(grammarAccess.getContainedPropertyAssociationAccess().getConstantConstantKeyword_2_0()); }
			Constant
			{ after(grammarAccess.getContainedPropertyAssociationAccess().getConstantConstantKeyword_2_0()); }
		)
		{ after(grammarAccess.getContainedPropertyAssociationAccess().getConstantConstantKeyword_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__OwnedValueAssignment_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueOptionalModalPropertyValueParserRuleCall_3_0_0()); }
		ruleOptionalModalPropertyValue
		{ after(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueOptionalModalPropertyValueParserRuleCall_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__OwnedValueAssignment_3_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueOptionalModalPropertyValueParserRuleCall_3_1_1_0()); }
		ruleOptionalModalPropertyValue
		{ after(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueOptionalModalPropertyValueParserRuleCall_3_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__AppliesToAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToContainmentPathParserRuleCall_4_1_0()); }
		ruleContainmentPath
		{ after(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToContainmentPathParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__AppliesToAssignment_4_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToContainmentPathParserRuleCall_4_2_1_0()); }
		ruleContainmentPath
		{ after(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToContainmentPathParserRuleCall_4_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainedPropertyAssociation__InBindingAssignment_5_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getContainedPropertyAssociationAccess().getInBindingClassifierCrossReference_5_2_0()); }
		(
			{ before(grammarAccess.getContainedPropertyAssociationAccess().getInBindingClassifierQCREFParserRuleCall_5_2_0_1()); }
			ruleQCREF
			{ after(grammarAccess.getContainedPropertyAssociationAccess().getInBindingClassifierQCREFParserRuleCall_5_2_0_1()); }
		)
		{ after(grammarAccess.getContainedPropertyAssociationAccess().getInBindingClassifierCrossReference_5_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainmentPath__PathAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getContainmentPathAccess().getPathContainmentPathElementParserRuleCall_0()); }
		ruleContainmentPathElement
		{ after(grammarAccess.getContainmentPathAccess().getPathContainmentPathElementParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalModalPropertyValue__OwnedValueAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOptionalModalPropertyValueAccess().getOwnedValuePropertyExpressionParserRuleCall_0_0()); }
		rulePropertyExpression
		{ after(grammarAccess.getOptionalModalPropertyValueAccess().getOwnedValuePropertyExpressionParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalModalPropertyValue__InModeAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOptionalModalPropertyValueAccess().getInModeModeCrossReference_1_2_0()); }
		(
			{ before(grammarAccess.getOptionalModalPropertyValueAccess().getInModeModeIDTerminalRuleCall_1_2_0_1()); }
			RULE_ID
			{ after(grammarAccess.getOptionalModalPropertyValueAccess().getInModeModeIDTerminalRuleCall_1_2_0_1()); }
		)
		{ after(grammarAccess.getOptionalModalPropertyValueAccess().getInModeModeCrossReference_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalModalPropertyValue__InModeAssignment_1_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOptionalModalPropertyValueAccess().getInModeModeCrossReference_1_3_1_0()); }
		(
			{ before(grammarAccess.getOptionalModalPropertyValueAccess().getInModeModeIDTerminalRuleCall_1_3_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getOptionalModalPropertyValueAccess().getInModeModeIDTerminalRuleCall_1_3_1_0_1()); }
		)
		{ after(grammarAccess.getOptionalModalPropertyValueAccess().getInModeModeCrossReference_1_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyValue__OwnedValueAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyValueAccess().getOwnedValuePropertyExpressionParserRuleCall_0()); }
		rulePropertyExpression
		{ after(grammarAccess.getPropertyValueAccess().getOwnedValuePropertyExpressionParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LiteralorReferenceTerm__NamedValueAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLiteralorReferenceTermAccess().getNamedValueAbstractNamedValueCrossReference_0()); }
		(
			{ before(grammarAccess.getLiteralorReferenceTermAccess().getNamedValueAbstractNamedValueQPREFParserRuleCall_0_1()); }
			ruleQPREF
			{ after(grammarAccess.getLiteralorReferenceTermAccess().getNamedValueAbstractNamedValueQPREFParserRuleCall_0_1()); }
		)
		{ after(grammarAccess.getLiteralorReferenceTermAccess().getNamedValueAbstractNamedValueCrossReference_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanLiteral__ValueAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_1_0_0()); }
		(
			{ before(grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_1_0_0()); }
			True
			{ after(grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_1_0_0()); }
		)
		{ after(grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConstantValue__NamedValueAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConstantValueAccess().getNamedValuePropertyConstantCrossReference_0()); }
		(
			{ before(grammarAccess.getConstantValueAccess().getNamedValuePropertyConstantQPREFParserRuleCall_0_1()); }
			ruleQPREF
			{ after(grammarAccess.getConstantValueAccess().getNamedValuePropertyConstantQPREFParserRuleCall_0_1()); }
		)
		{ after(grammarAccess.getConstantValueAccess().getNamedValuePropertyConstantCrossReference_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReferenceTerm__PathAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReferenceTermAccess().getPathContainmentPathElementParserRuleCall_2_0()); }
		ruleContainmentPathElement
		{ after(grammarAccess.getReferenceTermAccess().getPathContainmentPathElementParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RecordTerm__OwnedFieldValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRecordTermAccess().getOwnedFieldValueFieldPropertyAssociationParserRuleCall_1_0()); }
		ruleFieldPropertyAssociation
		{ after(grammarAccess.getRecordTermAccess().getOwnedFieldValueFieldPropertyAssociationParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComputedTerm__FunctionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComputedTermAccess().getFunctionIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getComputedTermAccess().getFunctionIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentClassifierTerm__ClassifierAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentClassifierTermAccess().getClassifierComponentClassifierCrossReference_2_0()); }
		(
			{ before(grammarAccess.getComponentClassifierTermAccess().getClassifierComponentClassifierQCREFParserRuleCall_2_0_1()); }
			ruleQCREF
			{ after(grammarAccess.getComponentClassifierTermAccess().getClassifierComponentClassifierQCREFParserRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getComponentClassifierTermAccess().getClassifierComponentClassifierCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ListTerm__OwnedListElementAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getListTermAccess().getOwnedListElementPropertyExpressionParserRuleCall_2_0_0()); }
		rulePropertyExpression
		{ after(grammarAccess.getListTermAccess().getOwnedListElementPropertyExpressionParserRuleCall_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ListTerm__OwnedListElementAssignment_2_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getListTermAccess().getOwnedListElementPropertyExpressionParserRuleCall_2_1_1_0()); }
		rulePropertyExpression
		{ after(grammarAccess.getListTermAccess().getOwnedListElementPropertyExpressionParserRuleCall_2_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldPropertyAssociation__PropertyAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFieldPropertyAssociationAccess().getPropertyBasicPropertyCrossReference_0_0()); }
		(
			{ before(grammarAccess.getFieldPropertyAssociationAccess().getPropertyBasicPropertyIDTerminalRuleCall_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getFieldPropertyAssociationAccess().getPropertyBasicPropertyIDTerminalRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getFieldPropertyAssociationAccess().getPropertyBasicPropertyCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldPropertyAssociation__OwnedValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFieldPropertyAssociationAccess().getOwnedValuePropertyExpressionParserRuleCall_2_0()); }
		rulePropertyExpression
		{ after(grammarAccess.getFieldPropertyAssociationAccess().getOwnedValuePropertyExpressionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainmentPathElement__NamedElementAssignment_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getContainmentPathElementAccess().getNamedElementNamedElementCrossReference_0_0_0()); }
		(
			{ before(grammarAccess.getContainmentPathElementAccess().getNamedElementNamedElementIDTerminalRuleCall_0_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getContainmentPathElementAccess().getNamedElementNamedElementIDTerminalRuleCall_0_0_0_1()); }
		)
		{ after(grammarAccess.getContainmentPathElementAccess().getNamedElementNamedElementCrossReference_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainmentPathElement__ArrayRangeAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getContainmentPathElementAccess().getArrayRangeArrayRangeParserRuleCall_0_1_0()); }
		ruleArrayRange
		{ after(grammarAccess.getContainmentPathElementAccess().getArrayRangeArrayRangeParserRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainmentPathElement__PathAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getContainmentPathElementAccess().getPathContainmentPathElementParserRuleCall_1_1_0()); }
		ruleContainmentPathElement
		{ after(grammarAccess.getContainmentPathElementAccess().getPathContainmentPathElementParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringTerm__ValueAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStringTermAccess().getValueNoQuoteStringParserRuleCall_0()); }
		ruleNoQuoteString
		{ after(grammarAccess.getStringTermAccess().getValueNoQuoteStringParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayRange__LowerBoundAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getArrayRangeAccess().getLowerBoundINTVALUEParserRuleCall_2_0()); }
		ruleINTVALUE
		{ after(grammarAccess.getArrayRangeAccess().getLowerBoundINTVALUEParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayRange__UpperBoundAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getArrayRangeAccess().getUpperBoundINTVALUEParserRuleCall_3_1_0()); }
		ruleINTVALUE
		{ after(grammarAccess.getArrayRangeAccess().getUpperBoundINTVALUEParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SignedConstant__OpAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSignedConstantAccess().getOpPlusMinusParserRuleCall_0_0()); }
		rulePlusMinus
		{ after(grammarAccess.getSignedConstantAccess().getOpPlusMinusParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SignedConstant__OwnedPropertyExpressionAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSignedConstantAccess().getOwnedPropertyExpressionConstantValueParserRuleCall_1_0()); }
		ruleConstantValue
		{ after(grammarAccess.getSignedConstantAccess().getOwnedPropertyExpressionConstantValueParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerTerm__ValueAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntegerTermAccess().getValueSignedIntParserRuleCall_0_0()); }
		ruleSignedInt
		{ after(grammarAccess.getIntegerTermAccess().getValueSignedIntParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerTerm__UnitAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntegerTermAccess().getUnitUnitLiteralCrossReference_1_0()); }
		(
			{ before(grammarAccess.getIntegerTermAccess().getUnitUnitLiteralIDTerminalRuleCall_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getIntegerTermAccess().getUnitUnitLiteralIDTerminalRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getIntegerTermAccess().getUnitUnitLiteralCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RealTerm__ValueAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRealTermAccess().getValueSignedRealParserRuleCall_0_0()); }
		ruleSignedReal
		{ after(grammarAccess.getRealTermAccess().getValueSignedRealParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RealTerm__UnitAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRealTermAccess().getUnitUnitLiteralCrossReference_1_0()); }
		(
			{ before(grammarAccess.getRealTermAccess().getUnitUnitLiteralIDTerminalRuleCall_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getRealTermAccess().getUnitUnitLiteralIDTerminalRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getRealTermAccess().getUnitUnitLiteralCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericRangeTerm__MinimumAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNumericRangeTermAccess().getMinimumNumAltParserRuleCall_0_0()); }
		ruleNumAlt
		{ after(grammarAccess.getNumericRangeTermAccess().getMinimumNumAltParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericRangeTerm__MaximumAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNumericRangeTermAccess().getMaximumNumAltParserRuleCall_2_0()); }
		ruleNumAlt
		{ after(grammarAccess.getNumericRangeTermAccess().getMaximumNumAltParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericRangeTerm__DeltaAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNumericRangeTermAccess().getDeltaNumAltParserRuleCall_3_1_0()); }
		ruleNumAlt
		{ after(grammarAccess.getNumericRangeTermAccess().getDeltaNumAltParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}
