
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
		tokenNameToValue.put("EqualsSignGreaterThanSign", "'=>'");
		tokenNameToValue.put("In_1", "'In'");
		tokenNameToValue.put("By", "'by'");
		tokenNameToValue.put("Do", "'do'");
		tokenNameToValue.put("If", "'if'");
		tokenNameToValue.put("In_1", "'in'");
		tokenNameToValue.put("To", "'to'");
		tokenNameToValue.put("PlusSignEqualsSignGreaterThanSign", "'+=>'");
		tokenNameToValue.put("FullStopFullStopLessThanSign", "'..<'");
		tokenNameToValue.put("All", "'All'");
		tokenNameToValue.put("F32", "'F32'");
		tokenNameToValue.put("F64", "'F64'");
		tokenNameToValue.put("Def", "'def'");
		tokenNameToValue.put("For", "'for'");
		tokenNameToValue.put("Inv", "'inv'");
		tokenNameToValue.put("Mut", "'mut'");
		tokenNameToValue.put("Res", "'res'");
		tokenNameToValue.put("Val", "'val'");
		tokenNameToValue.put("Var", "'var'");
		tokenNameToValue.put("Case", "'case'");
		tokenNameToValue.put("Else", "'else'");
		tokenNameToValue.put("From", "'from'");
		tokenNameToValue.put("Halt", "'halt'");
		tokenNameToValue.put("Spec", "'spec'");
		tokenNameToValue.put("True", "'true'");
		tokenNameToValue.put("Cases", "'cases'");
		tokenNameToValue.put("Delta", "'delta'");
		tokenNameToValue.put("False", "'false'");
		tokenNameToValue.put("Match", "'match'");
		tokenNameToValue.put("Modes", "'modes'");
		tokenNameToValue.put("Reads", "'reads'");
		tokenNameToValue.put("State", "'state'");
		tokenNameToValue.put("Until", "'until'");
		tokenNameToValue.put("While", "'while'");
		tokenNameToValue.put("Yield", "'yield'");
		tokenNameToValue.put("Exists", "'Exists'");
		tokenNameToValue.put("NoSend", "'NoSend'");
		tokenNameToValue.put("Assert", "'assert'");
		tokenNameToValue.put("Assume", "'assume'");
		tokenNameToValue.put("Handle", "'handle'");
		tokenNameToValue.put("Return", "'return'");
		tokenNameToValue.put("MaySend", "'MaySend'");
		tokenNameToValue.put("Applies", "'applies'");
		tokenNameToValue.put("Binding", "'binding'");
		tokenNameToValue.put("Compute", "'compute'");
		tokenNameToValue.put("HasEvent", "'HasEvent'");
		tokenNameToValue.put("MustSend", "'MustSend'");
		tokenNameToValue.put("Constant", "'constant'");
		tokenNameToValue.put("Infoflow", "'infoflow'");
		tokenNameToValue.put("Modifies", "'modifies'");
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

// Entry rule entryRuleInfoFlowClause
entryRuleInfoFlowClause
:
{ before(grammarAccess.getInfoFlowClauseRule()); }
	 ruleInfoFlowClause
{ after(grammarAccess.getInfoFlowClauseRule()); } 
	 EOF 
;

// Rule InfoFlowClause
ruleInfoFlowClause 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInfoFlowClauseAccess().getGroup()); }
		(rule__InfoFlowClause__Group__0)
		{ after(grammarAccess.getInfoFlowClauseAccess().getGroup()); }
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
		{ before(grammarAccess.getSlangDefIDAccess().getIDTerminalRuleCall()); }
		RULE_ID
		{ after(grammarAccess.getSlangDefIDAccess().getIDTerminalRuleCall()); }
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

// Entry rule entryRuleOwnedExpression
entryRuleOwnedExpression
:
{ before(grammarAccess.getOwnedExpressionRule()); }
	 ruleOwnedExpression
{ after(grammarAccess.getOwnedExpressionRule()); } 
	 EOF 
;

// Rule OwnedExpression
ruleOwnedExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOwnedExpressionAccess().getSlangExpressionParserRuleCall()); }
		ruleSlangExpression
		{ after(grammarAccess.getOwnedExpressionAccess().getSlangExpressionParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSlangExpression
entryRuleSlangExpression
:
{ before(grammarAccess.getSlangExpressionRule()); }
	 ruleSlangExpression
{ after(grammarAccess.getSlangExpressionRule()); } 
	 EOF 
;

// Rule SlangExpression
ruleSlangExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlangExpressionAccess().getAlternatives()); }
		(rule__SlangExpression__Alternatives)
		{ after(grammarAccess.getSlangExpressionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQuantRange
entryRuleQuantRange
:
{ before(grammarAccess.getQuantRangeRule()); }
	 ruleQuantRange
{ after(grammarAccess.getQuantRangeRule()); } 
	 EOF 
;

// Rule QuantRange
ruleQuantRange 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQuantRangeAccess().getGroup()); }
		(rule__QuantRange__Group__0)
		{ after(grammarAccess.getQuantRangeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQuantParam
entryRuleQuantParam
:
{ before(grammarAccess.getQuantParamRule()); }
	 ruleQuantParam
{ after(grammarAccess.getQuantParamRule()); } 
	 EOF 
;

// Rule QuantParam
ruleQuantParam 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQuantParamAccess().getAlternatives()); }
		(rule__QuantParam__Alternatives)
		{ after(grammarAccess.getQuantParamAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleImpliesExpression
entryRuleImpliesExpression
:
{ before(grammarAccess.getImpliesExpressionRule()); }
	 ruleImpliesExpression
{ after(grammarAccess.getImpliesExpressionRule()); } 
	 EOF 
;

// Rule ImpliesExpression
ruleImpliesExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getImpliesExpressionAccess().getGroup()); }
		(rule__ImpliesExpression__Group__0)
		{ after(grammarAccess.getImpliesExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOrExpression
entryRuleOrExpression
:
{ before(grammarAccess.getOrExpressionRule()); }
	 ruleOrExpression
{ after(grammarAccess.getOrExpressionRule()); } 
	 EOF 
;

// Rule OrExpression
ruleOrExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOrExpressionAccess().getGroup()); }
		(rule__OrExpression__Group__0)
		{ after(grammarAccess.getOrExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAndExpression
entryRuleAndExpression
:
{ before(grammarAccess.getAndExpressionRule()); }
	 ruleAndExpression
{ after(grammarAccess.getAndExpressionRule()); } 
	 EOF 
;

// Rule AndExpression
ruleAndExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAndExpressionAccess().getGroup()); }
		(rule__AndExpression__Group__0)
		{ after(grammarAccess.getAndExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEqualNotExpression
entryRuleEqualNotExpression
:
{ before(grammarAccess.getEqualNotExpressionRule()); }
	 ruleEqualNotExpression
{ after(grammarAccess.getEqualNotExpressionRule()); } 
	 EOF 
;

// Rule EqualNotExpression
ruleEqualNotExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEqualNotExpressionAccess().getGroup()); }
		(rule__EqualNotExpression__Group__0)
		{ after(grammarAccess.getEqualNotExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleLtGtExpression
entryRuleLtGtExpression
:
{ before(grammarAccess.getLtGtExpressionRule()); }
	 ruleLtGtExpression
{ after(grammarAccess.getLtGtExpressionRule()); } 
	 EOF 
;

// Rule LtGtExpression
ruleLtGtExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLtGtExpressionAccess().getGroup()); }
		(rule__LtGtExpression__Group__0)
		{ after(grammarAccess.getLtGtExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleColonExpression
entryRuleColonExpression
:
{ before(grammarAccess.getColonExpressionRule()); }
	 ruleColonExpression
{ after(grammarAccess.getColonExpressionRule()); } 
	 EOF 
;

// Rule ColonExpression
ruleColonExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getColonExpressionAccess().getGroup()); }
		(rule__ColonExpression__Group__0)
		{ after(grammarAccess.getColonExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePlusMinusExpression
entryRulePlusMinusExpression
:
{ before(grammarAccess.getPlusMinusExpressionRule()); }
	 rulePlusMinusExpression
{ after(grammarAccess.getPlusMinusExpressionRule()); } 
	 EOF 
;

// Rule PlusMinusExpression
rulePlusMinusExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPlusMinusExpressionAccess().getGroup()); }
		(rule__PlusMinusExpression__Group__0)
		{ after(grammarAccess.getPlusMinusExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMultiplicativeExpression
entryRuleMultiplicativeExpression
:
{ before(grammarAccess.getMultiplicativeExpressionRule()); }
	 ruleMultiplicativeExpression
{ after(grammarAccess.getMultiplicativeExpressionRule()); } 
	 EOF 
;

// Rule MultiplicativeExpression
ruleMultiplicativeExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMultiplicativeExpressionAccess().getGroup()); }
		(rule__MultiplicativeExpression__Group__0)
		{ after(grammarAccess.getMultiplicativeExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleUnaryExpression
entryRuleUnaryExpression
:
{ before(grammarAccess.getUnaryExpressionRule()); }
	 ruleUnaryExpression
{ after(grammarAccess.getUnaryExpressionRule()); } 
	 EOF 
;

// Rule UnaryExpression
ruleUnaryExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getUnaryExpressionAccess().getAlternatives()); }
		(rule__UnaryExpression__Alternatives)
		{ after(grammarAccess.getUnaryExpressionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePrimaryExpr
entryRulePrimaryExpr
:
{ before(grammarAccess.getPrimaryExprRule()); }
	 rulePrimaryExpr
{ after(grammarAccess.getPrimaryExprRule()); } 
	 EOF 
;

// Rule PrimaryExpr
rulePrimaryExpr 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPrimaryExprAccess().getAlternatives()); }
		(rule__PrimaryExpr__Alternatives)
		{ after(grammarAccess.getPrimaryExprAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBaseExpr
entryRuleBaseExpr
:
{ before(grammarAccess.getBaseExprRule()); }
	 ruleBaseExpr
{ after(grammarAccess.getBaseExprRule()); } 
	 EOF 
;

// Rule BaseExpr
ruleBaseExpr 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBaseExprAccess().getAlternatives()); }
		(rule__BaseExpr__Alternatives)
		{ after(grammarAccess.getBaseExprAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFloatObjectExpr
entryRuleFloatObjectExpr
:
{ before(grammarAccess.getFloatObjectExprRule()); }
	 ruleFloatObjectExpr
{ after(grammarAccess.getFloatObjectExprRule()); } 
	 EOF 
;

// Rule FloatObjectExpr
ruleFloatObjectExpr 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFloatObjectExprAccess().getAlternatives()); }
		(rule__FloatObjectExpr__Alternatives)
		{ after(grammarAccess.getFloatObjectExprAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAccessibleBaseExpr
entryRuleAccessibleBaseExpr
:
{ before(grammarAccess.getAccessibleBaseExprRule()); }
	 ruleAccessibleBaseExpr
{ after(grammarAccess.getAccessibleBaseExprRule()); } 
	 EOF 
;

// Rule AccessibleBaseExpr
ruleAccessibleBaseExpr 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAccessibleBaseExprAccess().getAlternatives()); }
		(rule__AccessibleBaseExpr__Alternatives)
		{ after(grammarAccess.getAccessibleBaseExprAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQualifiedAADLName
entryRuleQualifiedAADLName
:
{ before(grammarAccess.getQualifiedAADLNameRule()); }
	 ruleQualifiedAADLName
{ after(grammarAccess.getQualifiedAADLNameRule()); } 
	 EOF 
;

// Rule QualifiedAADLName
ruleQualifiedAADLName 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQualifiedAADLNameAccess().getGroup()); }
		(rule__QualifiedAADLName__Group__0)
		{ after(grammarAccess.getQualifiedAADLNameAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePostfix
entryRulePostfix
:
{ before(grammarAccess.getPostfixRule()); }
	 rulePostfix
{ after(grammarAccess.getPostfixRule()); } 
	 EOF 
;

// Rule Postfix
rulePostfix 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPostfixAccess().getAlternatives()); }
		(rule__Postfix__Alternatives)
		{ after(grammarAccess.getPostfixAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMemberAccess
entryRuleMemberAccess
:
{ before(grammarAccess.getMemberAccessRule()); }
	 ruleMemberAccess
{ after(grammarAccess.getMemberAccessRule()); } 
	 EOF 
;

// Rule MemberAccess
ruleMemberAccess 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMemberAccessAccess().getGroup()); }
		(rule__MemberAccess__Group__0)
		{ after(grammarAccess.getMemberAccessAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleArrayAccess
entryRuleArrayAccess
:
{ before(grammarAccess.getArrayAccessRule()); }
	 ruleArrayAccess
{ after(grammarAccess.getArrayAccessRule()); } 
	 EOF 
;

// Rule ArrayAccess
ruleArrayAccess 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getArrayAccessAccess().getGroup()); }
		(rule__ArrayAccess__Group__0)
		{ after(grammarAccess.getArrayAccessAccess().getGroup()); }
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
		{ before(grammarAccess.getSlangCallSuffixAccess().getGroup()); }
		(rule__SlangCallSuffix__Group__0)
		{ after(grammarAccess.getSlangCallSuffixAccess().getGroup()); }
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
		{ before(grammarAccess.getSlangInterpAccess().getGroup()); }
		(rule__SlangInterp__Group__0)
		{ after(grammarAccess.getSlangInterpAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName
:
{ before(grammarAccess.getQualifiedNameRule()); }
	 ruleQualifiedName
{ after(grammarAccess.getQualifiedNameRule()); } 
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQualifiedNameAccess().getQCREFParserRuleCall()); }
		ruleQCREF
		{ after(grammarAccess.getQualifiedNameAccess().getQCREFParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleUnaryOp
entryRuleUnaryOp
:
{ before(grammarAccess.getUnaryOpRule()); }
	 ruleUnaryOp
{ after(grammarAccess.getUnaryOpRule()); } 
	 EOF 
;

// Rule UnaryOp
ruleUnaryOp 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getUnaryOpAccess().getAlternatives()); }
		(rule__UnaryOp__Alternatives)
		{ after(grammarAccess.getUnaryOpAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMultiplicativeOp
entryRuleMultiplicativeOp
:
{ before(grammarAccess.getMultiplicativeOpRule()); }
	 ruleMultiplicativeOp
{ after(grammarAccess.getMultiplicativeOpRule()); } 
	 EOF 
;

// Rule MultiplicativeOp
ruleMultiplicativeOp 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMultiplicativeOpAccess().getAlternatives()); }
		(rule__MultiplicativeOp__Alternatives)
		{ after(grammarAccess.getMultiplicativeOpAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePlusMinusOps
entryRulePlusMinusOps
:
{ before(grammarAccess.getPlusMinusOpsRule()); }
	 rulePlusMinusOps
{ after(grammarAccess.getPlusMinusOpsRule()); } 
	 EOF 
;

// Rule PlusMinusOps
rulePlusMinusOps 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPlusMinusOpsAccess().getAlternatives()); }
		(rule__PlusMinusOps__Alternatives)
		{ after(grammarAccess.getPlusMinusOpsAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleImpliesOps
entryRuleImpliesOps
:
{ before(grammarAccess.getImpliesOpsRule()); }
	 ruleImpliesOps
{ after(grammarAccess.getImpliesOpsRule()); } 
	 EOF 
;

// Rule ImpliesOps
ruleImpliesOps 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getImpliesOpsAccess().getAlternatives()); }
		(rule__ImpliesOps__Alternatives)
		{ after(grammarAccess.getImpliesOpsAccess().getAlternatives()); }
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

// Entry rule entryRuleQCLREF
entryRuleQCLREF
:
{ before(grammarAccess.getQCLREFRule()); }
	 ruleQCLREF
{ after(grammarAccess.getQCLREFRule()); } 
	 EOF 
;

// Rule QCLREF
ruleQCLREF 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQCLREFAccess().getGroup()); }
		(rule__QCLREF__Group__0)
		{ after(grammarAccess.getQCLREFAccess().getGroup()); }
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

rule__SlangExpression__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangExpressionAccess().getImpliesExpressionParserRuleCall_0()); }
		ruleImpliesExpression
		{ after(grammarAccess.getSlangExpressionAccess().getImpliesExpressionParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getSlangExpressionAccess().getGroup_1()); }
		(rule__SlangExpression__Group_1__0)
		{ after(grammarAccess.getSlangExpressionAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getSlangExpressionAccess().getGroup_2()); }
		(rule__SlangExpression__Group_2__0)
		{ after(grammarAccess.getSlangExpressionAccess().getGroup_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpression__QuantifierAlternatives_2_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangExpressionAccess().getQuantifierAllKeyword_2_1_0_0()); }
		All
		{ after(grammarAccess.getSlangExpressionAccess().getQuantifierAllKeyword_2_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getSlangExpressionAccess().getQuantifierForAllKeyword_2_1_0_1()); }
		ForAll
		{ after(grammarAccess.getSlangExpressionAccess().getQuantifierForAllKeyword_2_1_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getSlangExpressionAccess().getQuantifierExistsKeyword_2_1_0_2()); }
		Exists
		{ after(grammarAccess.getSlangExpressionAccess().getQuantifierExistsKeyword_2_1_0_2()); }
	)
	|
	(
		{ before(grammarAccess.getSlangExpressionAccess().getQuantifierThereExistsKeyword_2_1_0_3()); }
		ThereExists
		{ after(grammarAccess.getSlangExpressionAccess().getQuantifierThereExistsKeyword_2_1_0_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__QuantRange__ExtentAlternatives_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getQuantRangeAccess().getExtentToKeyword_1_0_0()); }
		To
		{ after(grammarAccess.getQuantRangeAccess().getExtentToKeyword_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getQuantRangeAccess().getExtentUntilKeyword_1_0_1()); }
		Until
		{ after(grammarAccess.getQuantRangeAccess().getExtentUntilKeyword_1_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__QuantParam__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getQuantParamAccess().getNameAssignment_0()); }
		(rule__QuantParam__NameAssignment_0)
		{ after(grammarAccess.getQuantParamAccess().getNameAssignment_0()); }
	)
	|
	(
		{ before(grammarAccess.getQuantParamAccess().getGroup_1()); }
		(rule__QuantParam__Group_1__0)
		{ after(grammarAccess.getQuantParamAccess().getGroup_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnaryExpression__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnaryExpressionAccess().getGroup_0()); }
		(rule__UnaryExpression__Group_0__0)
		{ after(grammarAccess.getUnaryExpressionAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getUnaryExpressionAccess().getPrimaryExprParserRuleCall_1()); }
		rulePrimaryExpr
		{ after(grammarAccess.getUnaryExpressionAccess().getPrimaryExprParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryExpr__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimaryExprAccess().getBaseExprParserRuleCall_0()); }
		ruleBaseExpr
		{ after(grammarAccess.getPrimaryExprAccess().getBaseExprParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getPrimaryExprAccess().getGroup_1()); }
		(rule__PrimaryExpr__Group_1__0)
		{ after(grammarAccess.getPrimaryExprAccess().getGroup_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBaseExprAccess().getGroup_0()); }
		(rule__BaseExpr__Group_0__0)
		{ after(grammarAccess.getBaseExprAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getBaseExprAccess().getGroup_1()); }
		(rule__BaseExpr__Group_1__0)
		{ after(grammarAccess.getBaseExprAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getBaseExprAccess().getGroup_2()); }
		(rule__BaseExpr__Group_2__0)
		{ after(grammarAccess.getBaseExprAccess().getGroup_2()); }
	)
	|
	(
		{ before(grammarAccess.getBaseExprAccess().getGroup_3()); }
		(rule__BaseExpr__Group_3__0)
		{ after(grammarAccess.getBaseExprAccess().getGroup_3()); }
	)
	|
	(
		{ before(grammarAccess.getBaseExprAccess().getGroup_4()); }
		(rule__BaseExpr__Group_4__0)
		{ after(grammarAccess.getBaseExprAccess().getGroup_4()); }
	)
	|
	(
		{ before(grammarAccess.getBaseExprAccess().getGroup_5()); }
		(rule__BaseExpr__Group_5__0)
		{ after(grammarAccess.getBaseExprAccess().getGroup_5()); }
	)
	|
	(
		{ before(grammarAccess.getBaseExprAccess().getGroup_6()); }
		(rule__BaseExpr__Group_6__0)
		{ after(grammarAccess.getBaseExprAccess().getGroup_6()); }
	)
	|
	(
		{ before(grammarAccess.getBaseExprAccess().getGroup_7()); }
		(rule__BaseExpr__Group_7__0)
		{ after(grammarAccess.getBaseExprAccess().getGroup_7()); }
	)
	|
	(
		{ before(grammarAccess.getBaseExprAccess().getFloatObjectExprParserRuleCall_8()); }
		ruleFloatObjectExpr
		{ after(grammarAccess.getBaseExprAccess().getFloatObjectExprParserRuleCall_8()); }
	)
	|
	(
		{ before(grammarAccess.getBaseExprAccess().getGroup_9()); }
		(rule__BaseExpr__Group_9__0)
		{ after(grammarAccess.getBaseExprAccess().getGroup_9()); }
	)
	|
	(
		{ before(grammarAccess.getBaseExprAccess().getGroup_10()); }
		(rule__BaseExpr__Group_10__0)
		{ after(grammarAccess.getBaseExprAccess().getGroup_10()); }
	)
	|
	(
		{ before(grammarAccess.getBaseExprAccess().getGroup_11()); }
		(rule__BaseExpr__Group_11__0)
		{ after(grammarAccess.getBaseExprAccess().getGroup_11()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Alternatives_10_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBaseExprAccess().getBAssignment_10_5_0()); }
		(rule__BaseExpr__BAssignment_10_5_0)
		{ after(grammarAccess.getBaseExprAccess().getBAssignment_10_5_0()); }
	)
	|
	(
		{ before(grammarAccess.getBaseExprAccess().getGroup_10_5_1()); }
		(rule__BaseExpr__Group_10_5_1__0)
		{ after(grammarAccess.getBaseExprAccess().getGroup_10_5_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Alternatives_11_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBaseExprAccess().getGroup_11_2_0()); }
		(rule__BaseExpr__Group_11_2_0__0)
		{ after(grammarAccess.getBaseExprAccess().getGroup_11_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getBaseExprAccess().getGroup_11_2_1()); }
		(rule__BaseExpr__Group_11_2_1__0)
		{ after(grammarAccess.getBaseExprAccess().getGroup_11_2_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FloatObjectExpr__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFloatObjectExprAccess().getGroup_0()); }
		(rule__FloatObjectExpr__Group_0__0)
		{ after(grammarAccess.getFloatObjectExprAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getFloatObjectExprAccess().getGroup_1()); }
		(rule__FloatObjectExpr__Group_1__0)
		{ after(grammarAccess.getFloatObjectExprAccess().getGroup_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AccessibleBaseExpr__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAccessibleBaseExprAccess().getGroup_0()); }
		(rule__AccessibleBaseExpr__Group_0__0)
		{ after(grammarAccess.getAccessibleBaseExprAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getAccessibleBaseExprAccess().getGroup_1()); }
		(rule__AccessibleBaseExpr__Group_1__0)
		{ after(grammarAccess.getAccessibleBaseExprAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getAccessibleBaseExprAccess().getGroup_2()); }
		(rule__AccessibleBaseExpr__Group_2__0)
		{ after(grammarAccess.getAccessibleBaseExprAccess().getGroup_2()); }
	)
	|
	(
		{ before(grammarAccess.getAccessibleBaseExprAccess().getGroup_3()); }
		(rule__AccessibleBaseExpr__Group_3__0)
		{ after(grammarAccess.getAccessibleBaseExprAccess().getGroup_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Postfix__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPostfixAccess().getMemberAccessParserRuleCall_0()); }
		ruleMemberAccess
		{ after(grammarAccess.getPostfixAccess().getMemberAccessParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getPostfixAccess().getArrayAccessParserRuleCall_1()); }
		ruleArrayAccess
		{ after(grammarAccess.getPostfixAccess().getArrayAccessParserRuleCall_1()); }
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
	|
	(
		{ before(grammarAccess.getSlangLitAccess().getValueTrueKeyword_0_1_0_2()); }
		True
		{ after(grammarAccess.getSlangLitAccess().getValueTrueKeyword_0_1_0_2()); }
	)
	|
	(
		{ before(grammarAccess.getSlangLitAccess().getValueFalseKeyword_0_1_0_3()); }
		False
		{ after(grammarAccess.getSlangLitAccess().getValueFalseKeyword_0_1_0_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangLit__ValueAlternatives_5_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangLitAccess().getValueF64_LITTerminalRuleCall_5_1_0_0()); }
		RULE_F64_LIT
		{ after(grammarAccess.getSlangLitAccess().getValueF64_LITTerminalRuleCall_5_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getSlangLitAccess().getValueREAL_LITTerminalRuleCall_5_1_0_1()); }
		RULE_REAL_LIT
		{ after(grammarAccess.getSlangLitAccess().getValueREAL_LITTerminalRuleCall_5_1_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnaryOp__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnaryOpAccess().getPlusMinusParserRuleCall_0()); }
		rulePlusMinus
		{ after(grammarAccess.getUnaryOpAccess().getPlusMinusParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getUnaryOpAccess().getNOTTerminalRuleCall_1()); }
		RULE_NOT
		{ after(grammarAccess.getUnaryOpAccess().getNOTTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiplicativeOp__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMultiplicativeOpAccess().getSTARParserRuleCall_0()); }
		ruleSTAR
		{ after(grammarAccess.getMultiplicativeOpAccess().getSTARParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getMultiplicativeOpAccess().getMULTIPLICATIVE_OPTerminalRuleCall_1()); }
		RULE_MULTIPLICATIVE_OP
		{ after(grammarAccess.getMultiplicativeOpAccess().getMULTIPLICATIVE_OPTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusMinusOps__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPlusMinusOpsAccess().getSLANG_OPTerminalRuleCall_0()); }
		RULE_SLANG_OP
		{ after(grammarAccess.getPlusMinusOpsAccess().getSLANG_OPTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getPlusMinusOpsAccess().getPlusMinusParserRuleCall_1()); }
		rulePlusMinus
		{ after(grammarAccess.getPlusMinusOpsAccess().getPlusMinusParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImpliesOps__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImpliesOpsAccess().getIMPLIESTerminalRuleCall_0()); }
		RULE_IMPLIES
		{ after(grammarAccess.getImpliesOpsAccess().getIMPLIESTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getImpliesOpsAccess().getSIMPLIESTerminalRuleCall_1()); }
		RULE_SIMPLIES
		{ after(grammarAccess.getImpliesOpsAccess().getSIMPLIESTerminalRuleCall_1()); }
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
	{ before(grammarAccess.getGumboLibraryAccess().getFunctionsAssignment_1()); }
	(rule__GumboLibrary__FunctionsAssignment_1)?
	{ after(grammarAccess.getGumboLibraryAccess().getFunctionsAssignment_1()); }
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
	{ before(grammarAccess.getInitializeAccess().getInitializeAction_0()); }
	()
	{ after(grammarAccess.getInitializeAccess().getInitializeAction_0()); }
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
	{ before(grammarAccess.getInitializeAccess().getInitializeKeyword_1()); }
	Initialize
	{ after(grammarAccess.getInitializeAccess().getInitializeKeyword_1()); }
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
	rule__Initialize__Group__3
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
	{ before(grammarAccess.getInitializeAccess().getGroup_2()); }
	(rule__Initialize__Group_2__0)?
	{ after(grammarAccess.getInitializeAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Initialize__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Initialize__Group__3__Impl
	rule__Initialize__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Initialize__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInitializeAccess().getSpecsAssignment_3()); }
	(rule__Initialize__SpecsAssignment_3)*
	{ after(grammarAccess.getInitializeAccess().getSpecsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Initialize__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Initialize__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Initialize__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInitializeAccess().getFlowsAssignment_4()); }
	(rule__Initialize__FlowsAssignment_4)*
	{ after(grammarAccess.getInitializeAccess().getFlowsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Initialize__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Initialize__Group_2__0__Impl
	rule__Initialize__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Initialize__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInitializeAccess().getModifiesAssignment_2_0()); }
	(rule__Initialize__ModifiesAssignment_2_0)
	{ after(grammarAccess.getInitializeAccess().getModifiesAssignment_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Initialize__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Initialize__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Initialize__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInitializeAccess().getSemicolonKeyword_2_1()); }
	Semicolon
	{ after(grammarAccess.getInitializeAccess().getSemicolonKeyword_2_1()); }
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
	{ before(grammarAccess.getComputeAccess().getComputeAction_0()); }
	()
	{ after(grammarAccess.getComputeAccess().getComputeAction_0()); }
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
	{ before(grammarAccess.getComputeAccess().getComputeKeyword_1()); }
	Compute
	{ after(grammarAccess.getComputeAccess().getComputeKeyword_1()); }
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
	{ before(grammarAccess.getComputeAccess().getGroup_2()); }
	(rule__Compute__Group_2__0)?
	{ after(grammarAccess.getComputeAccess().getGroup_2()); }
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
	rule__Compute__Group__4
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
	{ before(grammarAccess.getComputeAccess().getAssumesAssignment_3()); }
	(rule__Compute__AssumesAssignment_3)*
	{ after(grammarAccess.getComputeAccess().getAssumesAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compute__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Compute__Group__4__Impl
	rule__Compute__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Compute__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComputeAccess().getGuaranteesAssignment_4()); }
	(rule__Compute__GuaranteesAssignment_4)*
	{ after(grammarAccess.getComputeAccess().getGuaranteesAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compute__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Compute__Group__5__Impl
	rule__Compute__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Compute__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComputeAccess().getGroup_5()); }
	(rule__Compute__Group_5__0)*
	{ after(grammarAccess.getComputeAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compute__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Compute__Group__6__Impl
	rule__Compute__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Compute__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComputeAccess().getHandlersAssignment_6()); }
	(rule__Compute__HandlersAssignment_6)*
	{ after(grammarAccess.getComputeAccess().getHandlersAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compute__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Compute__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Compute__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComputeAccess().getFlowsAssignment_7()); }
	(rule__Compute__FlowsAssignment_7)*
	{ after(grammarAccess.getComputeAccess().getFlowsAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Compute__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Compute__Group_2__0__Impl
	rule__Compute__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Compute__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComputeAccess().getModifiesAssignment_2_0()); }
	(rule__Compute__ModifiesAssignment_2_0)
	{ after(grammarAccess.getComputeAccess().getModifiesAssignment_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compute__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Compute__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Compute__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComputeAccess().getSemicolonKeyword_2_1()); }
	Semicolon
	{ after(grammarAccess.getComputeAccess().getSemicolonKeyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Compute__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Compute__Group_5__0__Impl
	rule__Compute__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Compute__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComputeAccess().getCasesKeyword_5_0()); }
	Cases
	{ after(grammarAccess.getComputeAccess().getCasesKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compute__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Compute__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Compute__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getComputeAccess().getCasesAssignment_5_1()); }
		(rule__Compute__CasesAssignment_5_1)
		{ after(grammarAccess.getComputeAccess().getCasesAssignment_5_1()); }
	)
	(
		{ before(grammarAccess.getComputeAccess().getCasesAssignment_5_1()); }
		(rule__Compute__CasesAssignment_5_1)*
		{ after(grammarAccess.getComputeAccess().getCasesAssignment_5_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InfoFlowClause__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InfoFlowClause__Group__0__Impl
	rule__InfoFlowClause__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InfoFlowClause__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInfoFlowClauseAccess().getInfoflowKeyword_0()); }
	Infoflow
	{ after(grammarAccess.getInfoFlowClauseAccess().getInfoflowKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InfoFlowClause__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InfoFlowClause__Group__1__Impl
	rule__InfoFlowClause__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__InfoFlowClause__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInfoFlowClauseAccess().getIdAssignment_1()); }
	(rule__InfoFlowClause__IdAssignment_1)
	{ after(grammarAccess.getInfoFlowClauseAccess().getIdAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InfoFlowClause__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InfoFlowClause__Group__2__Impl
	rule__InfoFlowClause__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__InfoFlowClause__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInfoFlowClauseAccess().getDescriptorAssignment_2()); }
	(rule__InfoFlowClause__DescriptorAssignment_2)?
	{ after(grammarAccess.getInfoFlowClauseAccess().getDescriptorAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InfoFlowClause__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InfoFlowClause__Group__3__Impl
	rule__InfoFlowClause__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__InfoFlowClause__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInfoFlowClauseAccess().getColonKeyword_3()); }
	Colon
	{ after(grammarAccess.getInfoFlowClauseAccess().getColonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InfoFlowClause__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InfoFlowClause__Group__4__Impl
	rule__InfoFlowClause__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__InfoFlowClause__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInfoFlowClauseAccess().getFromKeyword_4()); }
	From
	{ after(grammarAccess.getInfoFlowClauseAccess().getFromKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InfoFlowClause__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InfoFlowClause__Group__5__Impl
	rule__InfoFlowClause__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__InfoFlowClause__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInfoFlowClauseAccess().getLeftParenthesisKeyword_5()); }
	LeftParenthesis
	{ after(grammarAccess.getInfoFlowClauseAccess().getLeftParenthesisKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InfoFlowClause__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InfoFlowClause__Group__6__Impl
	rule__InfoFlowClause__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__InfoFlowClause__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInfoFlowClauseAccess().getGroup_6()); }
	(rule__InfoFlowClause__Group_6__0)?
	{ after(grammarAccess.getInfoFlowClauseAccess().getGroup_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InfoFlowClause__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InfoFlowClause__Group__7__Impl
	rule__InfoFlowClause__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__InfoFlowClause__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInfoFlowClauseAccess().getRightParenthesisKeyword_7()); }
	RightParenthesis
	{ after(grammarAccess.getInfoFlowClauseAccess().getRightParenthesisKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InfoFlowClause__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InfoFlowClause__Group__8__Impl
	rule__InfoFlowClause__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__InfoFlowClause__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInfoFlowClauseAccess().getCommaKeyword_8()); }
	Comma
	{ after(grammarAccess.getInfoFlowClauseAccess().getCommaKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InfoFlowClause__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InfoFlowClause__Group__9__Impl
	rule__InfoFlowClause__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__InfoFlowClause__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInfoFlowClauseAccess().getToKeyword_9()); }
	To
	{ after(grammarAccess.getInfoFlowClauseAccess().getToKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InfoFlowClause__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InfoFlowClause__Group__10__Impl
	rule__InfoFlowClause__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__InfoFlowClause__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInfoFlowClauseAccess().getLeftParenthesisKeyword_10()); }
	LeftParenthesis
	{ after(grammarAccess.getInfoFlowClauseAccess().getLeftParenthesisKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InfoFlowClause__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InfoFlowClause__Group__11__Impl
	rule__InfoFlowClause__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__InfoFlowClause__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInfoFlowClauseAccess().getGroup_11()); }
	(rule__InfoFlowClause__Group_11__0)?
	{ after(grammarAccess.getInfoFlowClauseAccess().getGroup_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InfoFlowClause__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InfoFlowClause__Group__12__Impl
	rule__InfoFlowClause__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__InfoFlowClause__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInfoFlowClauseAccess().getRightParenthesisKeyword_12()); }
	RightParenthesis
	{ after(grammarAccess.getInfoFlowClauseAccess().getRightParenthesisKeyword_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InfoFlowClause__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InfoFlowClause__Group__13__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InfoFlowClause__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInfoFlowClauseAccess().getSemicolonKeyword_13()); }
	Semicolon
	{ after(grammarAccess.getInfoFlowClauseAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InfoFlowClause__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InfoFlowClause__Group_6__0__Impl
	rule__InfoFlowClause__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InfoFlowClause__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInfoFlowClauseAccess().getFromPortOrStateVarAssignment_6_0()); }
	(rule__InfoFlowClause__FromPortOrStateVarAssignment_6_0)
	{ after(grammarAccess.getInfoFlowClauseAccess().getFromPortOrStateVarAssignment_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InfoFlowClause__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InfoFlowClause__Group_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InfoFlowClause__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInfoFlowClauseAccess().getGroup_6_1()); }
	(rule__InfoFlowClause__Group_6_1__0)*
	{ after(grammarAccess.getInfoFlowClauseAccess().getGroup_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InfoFlowClause__Group_6_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InfoFlowClause__Group_6_1__0__Impl
	rule__InfoFlowClause__Group_6_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InfoFlowClause__Group_6_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInfoFlowClauseAccess().getCommaKeyword_6_1_0()); }
	Comma
	{ after(grammarAccess.getInfoFlowClauseAccess().getCommaKeyword_6_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InfoFlowClause__Group_6_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InfoFlowClause__Group_6_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InfoFlowClause__Group_6_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInfoFlowClauseAccess().getFromPortOrStateVarAssignment_6_1_1()); }
	(rule__InfoFlowClause__FromPortOrStateVarAssignment_6_1_1)
	{ after(grammarAccess.getInfoFlowClauseAccess().getFromPortOrStateVarAssignment_6_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InfoFlowClause__Group_11__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InfoFlowClause__Group_11__0__Impl
	rule__InfoFlowClause__Group_11__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InfoFlowClause__Group_11__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInfoFlowClauseAccess().getToPortOrStateVarAssignment_11_0()); }
	(rule__InfoFlowClause__ToPortOrStateVarAssignment_11_0)
	{ after(grammarAccess.getInfoFlowClauseAccess().getToPortOrStateVarAssignment_11_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InfoFlowClause__Group_11__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InfoFlowClause__Group_11__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InfoFlowClause__Group_11__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInfoFlowClauseAccess().getGroup_11_1()); }
	(rule__InfoFlowClause__Group_11_1__0)*
	{ after(grammarAccess.getInfoFlowClauseAccess().getGroup_11_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InfoFlowClause__Group_11_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InfoFlowClause__Group_11_1__0__Impl
	rule__InfoFlowClause__Group_11_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InfoFlowClause__Group_11_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInfoFlowClauseAccess().getCommaKeyword_11_1_0()); }
	Comma
	{ after(grammarAccess.getInfoFlowClauseAccess().getCommaKeyword_11_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InfoFlowClause__Group_11_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InfoFlowClause__Group_11_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InfoFlowClause__Group_11_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInfoFlowClauseAccess().getToPortOrStateVarAssignment_11_1_1()); }
	(rule__InfoFlowClause__ToPortOrStateVarAssignment_11_1_1)
	{ after(grammarAccess.getInfoFlowClauseAccess().getToPortOrStateVarAssignment_11_1_1()); }
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
	rule__HandlerClause__Group__5
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
	{ before(grammarAccess.getHandlerClauseAccess().getAssumesAssignment_4()); }
	(rule__HandlerClause__AssumesAssignment_4)*
	{ after(grammarAccess.getHandlerClauseAccess().getAssumesAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__HandlerClause__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__HandlerClause__Group__5__Impl
	rule__HandlerClause__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__HandlerClause__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHandlerClauseAccess().getGuaranteesAssignment_5()); }
	(rule__HandlerClause__GuaranteesAssignment_5)*
	{ after(grammarAccess.getHandlerClauseAccess().getGuaranteesAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__HandlerClause__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__HandlerClause__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__HandlerClause__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHandlerClauseAccess().getGroup_6()); }
	(rule__HandlerClause__Group_6__0)*
	{ after(grammarAccess.getHandlerClauseAccess().getGroup_6()); }
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


rule__HandlerClause__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__HandlerClause__Group_6__0__Impl
	rule__HandlerClause__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__HandlerClause__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHandlerClauseAccess().getCasesKeyword_6_0()); }
	Cases
	{ after(grammarAccess.getHandlerClauseAccess().getCasesKeyword_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__HandlerClause__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__HandlerClause__Group_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__HandlerClause__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getHandlerClauseAccess().getCasesAssignment_6_1()); }
		(rule__HandlerClause__CasesAssignment_6_1)
		{ after(grammarAccess.getHandlerClauseAccess().getCasesAssignment_6_1()); }
	)
	(
		{ before(grammarAccess.getHandlerClauseAccess().getCasesAssignment_6_1()); }
		(rule__HandlerClause__CasesAssignment_6_1)*
		{ after(grammarAccess.getHandlerClauseAccess().getCasesAssignment_6_1()); }
	)
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
	(rule__CaseStatementClause__AssumeStatementAssignment_4)?
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
	{ before(grammarAccess.getSlangDefDefAccess().getNameAssignment_1()); }
	(rule__SlangDefDef__NameAssignment_1)
	{ after(grammarAccess.getSlangDefDefAccess().getNameAssignment_1()); }
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
	{ before(grammarAccess.getSlangDefDefAccess().getTypeParamsAssignment_2()); }
	(rule__SlangDefDef__TypeParamsAssignment_2)?
	{ after(grammarAccess.getSlangDefDefAccess().getTypeParamsAssignment_2()); }
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
	{ before(grammarAccess.getSlangDefDefAccess().getParamsAssignment_3()); }
	(rule__SlangDefDef__ParamsAssignment_3)
	{ after(grammarAccess.getSlangDefDefAccess().getParamsAssignment_3()); }
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
	{ before(grammarAccess.getSlangDefDefAccess().getColonKeyword_4()); }
	Colon
	{ after(grammarAccess.getSlangDefDefAccess().getColonKeyword_4()); }
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
	{ before(grammarAccess.getSlangDefDefAccess().getTypeAssignment_5()); }
	(rule__SlangDefDef__TypeAssignment_5)
	{ after(grammarAccess.getSlangDefDefAccess().getTypeAssignment_5()); }
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
	{ before(grammarAccess.getSlangDefDefAccess().getColonEqualsSignKeyword_6()); }
	ColonEqualsSign
	{ after(grammarAccess.getSlangDefDefAccess().getColonEqualsSignKeyword_6()); }
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
	{ before(grammarAccess.getSlangDefDefAccess().getMethodContractAssignment_7()); }
	(rule__SlangDefDef__MethodContractAssignment_7)
	{ after(grammarAccess.getSlangDefDefAccess().getMethodContractAssignment_7()); }
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
	{ before(grammarAccess.getSlangDefDefAccess().getBodyAssignment_8()); }
	(rule__SlangDefDef__BodyAssignment_8)
	{ after(grammarAccess.getSlangDefDefAccess().getBodyAssignment_8()); }
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
	{ before(grammarAccess.getSlangDefParamsAccess().getGroup_1()); }
	(rule__SlangDefParams__Group_1__0)?
	{ after(grammarAccess.getSlangDefParamsAccess().getGroup_1()); }
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
	{ before(grammarAccess.getSlangDefParamsAccess().getRightParenthesisKeyword_2()); }
	RightParenthesis
	{ after(grammarAccess.getSlangDefParamsAccess().getRightParenthesisKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangDefParams__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefParams__Group_1__0__Impl
	rule__SlangDefParams__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefParams__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefParamsAccess().getParamsAssignment_1_0()); }
	(rule__SlangDefParams__ParamsAssignment_1_0)
	{ after(grammarAccess.getSlangDefParamsAccess().getParamsAssignment_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefParams__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefParams__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefParams__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefParamsAccess().getGroup_1_1()); }
	(rule__SlangDefParams__Group_1_1__0)*
	{ after(grammarAccess.getSlangDefParamsAccess().getGroup_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangDefParams__Group_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefParams__Group_1_1__0__Impl
	rule__SlangDefParams__Group_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefParams__Group_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefParamsAccess().getCommaKeyword_1_1_0()); }
	Comma
	{ after(grammarAccess.getSlangDefParamsAccess().getCommaKeyword_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefParams__Group_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefParams__Group_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefParams__Group_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefParamsAccess().getParamsAssignment_1_1_1()); }
	(rule__SlangDefParams__ParamsAssignment_1_1_1)
	{ after(grammarAccess.getSlangDefParamsAccess().getParamsAssignment_1_1_1()); }
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
	{ before(grammarAccess.getSlangDefParamAccess().getIsMethodDefAssignment_2()); }
	(rule__SlangDefParam__IsMethodDefAssignment_2)?
	{ after(grammarAccess.getSlangDefParamAccess().getIsMethodDefAssignment_2()); }
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
	{ before(grammarAccess.getSlangDefParamAccess().getIsVarArgAssignment_4()); }
	(rule__SlangDefParam__IsVarArgAssignment_4)?
	{ after(grammarAccess.getSlangDefParamAccess().getIsVarArgAssignment_4()); }
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
	{ before(grammarAccess.getSlangTypeParamsAccess().getTypeParamAssignment_1()); }
	(rule__SlangTypeParams__TypeParamAssignment_1)
	{ after(grammarAccess.getSlangTypeParamsAccess().getTypeParamAssignment_1()); }
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
	{ before(grammarAccess.getSlangTypeParamsAccess().getTypeParamAssignment_2_1()); }
	(rule__SlangTypeParams__TypeParamAssignment_2_1)
	{ after(grammarAccess.getSlangTypeParamsAccess().getTypeParamAssignment_2_1()); }
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
	{ before(grammarAccess.getSlangTypeParamAccess().getIsMutAssignment_0()); }
	(rule__SlangTypeParam__IsMutAssignment_0)?
	{ after(grammarAccess.getSlangTypeParamAccess().getIsMutAssignment_0()); }
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
	{ before(grammarAccess.getSlangTypeParamAccess().getNameAssignment_1()); }
	(rule__SlangTypeParam__NameAssignment_1)
	{ after(grammarAccess.getSlangTypeParamAccess().getNameAssignment_1()); }
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
	{ before(grammarAccess.getSlangDefContractAccess().getGroup_1()); }
	(rule__SlangDefContract__Group_1__0)
	{ after(grammarAccess.getSlangDefContractAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangDefContract__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefContract__Group_1__0__Impl
	rule__SlangDefContract__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContract__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefContractAccess().getGroup_1_0()); }
	(rule__SlangDefContract__Group_1_0__0)?
	{ after(grammarAccess.getSlangDefContractAccess().getGroup_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContract__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefContract__Group_1__1__Impl
	rule__SlangDefContract__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContract__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefContractAccess().getGroup_1_1()); }
	(rule__SlangDefContract__Group_1_1__0)?
	{ after(grammarAccess.getSlangDefContractAccess().getGroup_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContract__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefContract__Group_1__2__Impl
	rule__SlangDefContract__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContract__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefContractAccess().getGroup_1_2()); }
	(rule__SlangDefContract__Group_1_2__0)?
	{ after(grammarAccess.getSlangDefContractAccess().getGroup_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContract__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefContract__Group_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContract__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefContractAccess().getGroup_1_3()); }
	(rule__SlangDefContract__Group_1_3__0)?
	{ after(grammarAccess.getSlangDefContractAccess().getGroup_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangDefContract__Group_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefContract__Group_1_0__0__Impl
	rule__SlangDefContract__Group_1_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContract__Group_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefContractAccess().getReadsAssignment_1_0_0()); }
	(rule__SlangDefContract__ReadsAssignment_1_0_0)
	{ after(grammarAccess.getSlangDefContractAccess().getReadsAssignment_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContract__Group_1_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefContract__Group_1_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContract__Group_1_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefContractAccess().getSemicolonKeyword_1_0_1()); }
	Semicolon
	{ after(grammarAccess.getSlangDefContractAccess().getSemicolonKeyword_1_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangDefContract__Group_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefContract__Group_1_1__0__Impl
	rule__SlangDefContract__Group_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContract__Group_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefContractAccess().getRequiresAssignment_1_1_0()); }
	(rule__SlangDefContract__RequiresAssignment_1_1_0)
	{ after(grammarAccess.getSlangDefContractAccess().getRequiresAssignment_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContract__Group_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefContract__Group_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContract__Group_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefContractAccess().getSemicolonKeyword_1_1_1()); }
	Semicolon
	{ after(grammarAccess.getSlangDefContractAccess().getSemicolonKeyword_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangDefContract__Group_1_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefContract__Group_1_2__0__Impl
	rule__SlangDefContract__Group_1_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContract__Group_1_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefContractAccess().getModifiesAssignment_1_2_0()); }
	(rule__SlangDefContract__ModifiesAssignment_1_2_0)
	{ after(grammarAccess.getSlangDefContractAccess().getModifiesAssignment_1_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContract__Group_1_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefContract__Group_1_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContract__Group_1_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefContractAccess().getSemicolonKeyword_1_2_1()); }
	Semicolon
	{ after(grammarAccess.getSlangDefContractAccess().getSemicolonKeyword_1_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangDefContract__Group_1_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefContract__Group_1_3__0__Impl
	rule__SlangDefContract__Group_1_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContract__Group_1_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefContractAccess().getEnsuresAssignment_1_3_0()); }
	(rule__SlangDefContract__EnsuresAssignment_1_3_0)
	{ after(grammarAccess.getSlangDefContractAccess().getEnsuresAssignment_1_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContract__Group_1_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangDefContract__Group_1_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContract__Group_1_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangDefContractAccess().getSemicolonKeyword_1_3_1()); }
	Semicolon
	{ after(grammarAccess.getSlangDefContractAccess().getSemicolonKeyword_1_3_1()); }
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
	{ before(grammarAccess.getSlangRequiresAccess().getAssumeKeyword_0()); }
	Assume
	{ after(grammarAccess.getSlangRequiresAccess().getAssumeKeyword_0()); }
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
	{ before(grammarAccess.getSlangEnsuresAccess().getGuaranteeKeyword_0()); }
	Guarantee
	{ after(grammarAccess.getSlangEnsuresAccess().getGuaranteeKeyword_0()); }
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
	{ before(grammarAccess.getSlangStmtAccess().getSTRING_VALUETerminalRuleCall_5_3()); }
	(RULE_STRING_VALUE)?
	{ after(grammarAccess.getSlangStmtAccess().getSTRING_VALUETerminalRuleCall_5_3()); }
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
	{ before(grammarAccess.getSlangStmtAccess().getSTRING_VALUETerminalRuleCall_6_3()); }
	(RULE_STRING_VALUE)?
	{ after(grammarAccess.getSlangStmtAccess().getSTRING_VALUETerminalRuleCall_6_3()); }
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
	{ before(grammarAccess.getSlangStmtAccess().getSTRING_VALUETerminalRuleCall_7_2()); }
	(RULE_STRING_VALUE)?
	{ after(grammarAccess.getSlangStmtAccess().getSTRING_VALUETerminalRuleCall_7_2()); }
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


rule__SlangExpression__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangExpression__Group_1__0__Impl
	rule__SlangExpression__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpression__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangExpressionAccess().getIfElseExpAction_1_0()); }
	()
	{ after(grammarAccess.getSlangExpressionAccess().getIfElseExpAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpression__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangExpression__Group_1__1__Impl
	rule__SlangExpression__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpression__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangExpressionAccess().getIfKeyword_1_1()); }
	If
	{ after(grammarAccess.getSlangExpressionAccess().getIfKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpression__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangExpression__Group_1__2__Impl
	rule__SlangExpression__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpression__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangExpressionAccess().getLeftParenthesisKeyword_1_2()); }
	LeftParenthesis
	{ after(grammarAccess.getSlangExpressionAccess().getLeftParenthesisKeyword_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpression__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangExpression__Group_1__3__Impl
	rule__SlangExpression__Group_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpression__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangExpressionAccess().getIfCondAssignment_1_3()); }
	(rule__SlangExpression__IfCondAssignment_1_3)
	{ after(grammarAccess.getSlangExpressionAccess().getIfCondAssignment_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpression__Group_1__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangExpression__Group_1__4__Impl
	rule__SlangExpression__Group_1__5
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpression__Group_1__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangExpressionAccess().getRightParenthesisKeyword_1_4()); }
	RightParenthesis
	{ after(grammarAccess.getSlangExpressionAccess().getRightParenthesisKeyword_1_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpression__Group_1__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangExpression__Group_1__5__Impl
	rule__SlangExpression__Group_1__6
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpression__Group_1__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangExpressionAccess().getThenExprAssignment_1_5()); }
	(rule__SlangExpression__ThenExprAssignment_1_5)
	{ after(grammarAccess.getSlangExpressionAccess().getThenExprAssignment_1_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpression__Group_1__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangExpression__Group_1__6__Impl
	rule__SlangExpression__Group_1__7
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpression__Group_1__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangExpressionAccess().getElseKeyword_1_6()); }
	Else
	{ after(grammarAccess.getSlangExpressionAccess().getElseKeyword_1_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpression__Group_1__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangExpression__Group_1__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpression__Group_1__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangExpressionAccess().getElseExprAssignment_1_7()); }
	(rule__SlangExpression__ElseExprAssignment_1_7)
	{ after(grammarAccess.getSlangExpressionAccess().getElseExprAssignment_1_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangExpression__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangExpression__Group_2__0__Impl
	rule__SlangExpression__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpression__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangExpressionAccess().getQuantifiedExpAction_2_0()); }
	()
	{ after(grammarAccess.getSlangExpressionAccess().getQuantifiedExpAction_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpression__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangExpression__Group_2__1__Impl
	rule__SlangExpression__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpression__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangExpressionAccess().getQuantifierAssignment_2_1()); }
	(rule__SlangExpression__QuantifierAssignment_2_1)
	{ after(grammarAccess.getSlangExpressionAccess().getQuantifierAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpression__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangExpression__Group_2__2__Impl
	rule__SlangExpression__Group_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpression__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangExpressionAccess().getLeftParenthesisKeyword_2_2()); }
	LeftParenthesis
	{ after(grammarAccess.getSlangExpressionAccess().getLeftParenthesisKeyword_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpression__Group_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangExpression__Group_2__3__Impl
	rule__SlangExpression__Group_2__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpression__Group_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangExpressionAccess().getQuantRangeAssignment_2_3()); }
	(rule__SlangExpression__QuantRangeAssignment_2_3)
	{ after(grammarAccess.getSlangExpressionAccess().getQuantRangeAssignment_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpression__Group_2__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangExpression__Group_2__4__Impl
	rule__SlangExpression__Group_2__5
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpression__Group_2__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangExpressionAccess().getRightParenthesisKeyword_2_4()); }
	RightParenthesis
	{ after(grammarAccess.getSlangExpressionAccess().getRightParenthesisKeyword_2_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpression__Group_2__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangExpression__Group_2__5__Impl
	rule__SlangExpression__Group_2__6
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpression__Group_2__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangExpressionAccess().getLeftParenthesisKeyword_2_5()); }
	LeftParenthesis
	{ after(grammarAccess.getSlangExpressionAccess().getLeftParenthesisKeyword_2_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpression__Group_2__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangExpression__Group_2__6__Impl
	rule__SlangExpression__Group_2__7
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpression__Group_2__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangExpressionAccess().getQuantParamAssignment_2_6()); }
	(rule__SlangExpression__QuantParamAssignment_2_6)
	{ after(grammarAccess.getSlangExpressionAccess().getQuantParamAssignment_2_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpression__Group_2__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangExpression__Group_2__7__Impl
	rule__SlangExpression__Group_2__8
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpression__Group_2__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangExpressionAccess().getEqualsSignGreaterThanSignKeyword_2_7()); }
	EqualsSignGreaterThanSign
	{ after(grammarAccess.getSlangExpressionAccess().getEqualsSignGreaterThanSignKeyword_2_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpression__Group_2__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangExpression__Group_2__8__Impl
	rule__SlangExpression__Group_2__9
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpression__Group_2__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangExpressionAccess().getQuantifiedExprAssignment_2_8()); }
	(rule__SlangExpression__QuantifiedExprAssignment_2_8)
	{ after(grammarAccess.getSlangExpressionAccess().getQuantifiedExprAssignment_2_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpression__Group_2__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangExpression__Group_2__9__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpression__Group_2__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangExpressionAccess().getRightParenthesisKeyword_2_9()); }
	RightParenthesis
	{ after(grammarAccess.getSlangExpressionAccess().getRightParenthesisKeyword_2_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QuantRange__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QuantRange__Group__0__Impl
	rule__QuantRange__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QuantRange__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuantRangeAccess().getLoAssignment_0()); }
	(rule__QuantRange__LoAssignment_0)
	{ after(grammarAccess.getQuantRangeAccess().getLoAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QuantRange__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QuantRange__Group__1__Impl
	rule__QuantRange__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__QuantRange__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuantRangeAccess().getExtentAssignment_1()); }
	(rule__QuantRange__ExtentAssignment_1)
	{ after(grammarAccess.getQuantRangeAccess().getExtentAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QuantRange__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QuantRange__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QuantRange__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuantRangeAccess().getHighAssignment_2()); }
	(rule__QuantRange__HighAssignment_2)
	{ after(grammarAccess.getQuantRangeAccess().getHighAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QuantParam__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QuantParam__Group_1__0__Impl
	rule__QuantParam__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QuantParam__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuantParamAccess().getLeftParenthesisKeyword_1_0()); }
	LeftParenthesis
	{ after(grammarAccess.getQuantParamAccess().getLeftParenthesisKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QuantParam__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QuantParam__Group_1__1__Impl
	rule__QuantParam__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__QuantParam__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuantParamAccess().getNameAssignment_1_1()); }
	(rule__QuantParam__NameAssignment_1_1)
	{ after(grammarAccess.getQuantParamAccess().getNameAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QuantParam__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QuantParam__Group_1__2__Impl
	rule__QuantParam__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__QuantParam__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuantParamAccess().getColonKeyword_1_2()); }
	Colon
	{ after(grammarAccess.getQuantParamAccess().getColonKeyword_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QuantParam__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QuantParam__Group_1__3__Impl
	rule__QuantParam__Group_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__QuantParam__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuantParamAccess().getTypeNameAssignment_1_3()); }
	(rule__QuantParam__TypeNameAssignment_1_3)
	{ after(grammarAccess.getQuantParamAccess().getTypeNameAssignment_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QuantParam__Group_1__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QuantParam__Group_1__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QuantParam__Group_1__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuantParamAccess().getRightParenthesisKeyword_1_4()); }
	RightParenthesis
	{ after(grammarAccess.getQuantParamAccess().getRightParenthesisKeyword_1_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ImpliesExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ImpliesExpression__Group__0__Impl
	rule__ImpliesExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ImpliesExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImpliesExpressionAccess().getOrExpressionParserRuleCall_0()); }
	ruleOrExpression
	{ after(grammarAccess.getImpliesExpressionAccess().getOrExpressionParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImpliesExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ImpliesExpression__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ImpliesExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImpliesExpressionAccess().getGroup_1()); }
	(rule__ImpliesExpression__Group_1__0)*
	{ after(grammarAccess.getImpliesExpressionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ImpliesExpression__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ImpliesExpression__Group_1__0__Impl
	rule__ImpliesExpression__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ImpliesExpression__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImpliesExpressionAccess().getImpliesExprLeftAction_1_0()); }
	()
	{ after(grammarAccess.getImpliesExpressionAccess().getImpliesExprLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImpliesExpression__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ImpliesExpression__Group_1__1__Impl
	rule__ImpliesExpression__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ImpliesExpression__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImpliesExpressionAccess().getOpAssignment_1_1()); }
	(rule__ImpliesExpression__OpAssignment_1_1)
	{ after(grammarAccess.getImpliesExpressionAccess().getOpAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImpliesExpression__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ImpliesExpression__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ImpliesExpression__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImpliesExpressionAccess().getRightAssignment_1_2()); }
	(rule__ImpliesExpression__RightAssignment_1_2)
	{ after(grammarAccess.getImpliesExpressionAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OrExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrExpression__Group__0__Impl
	rule__OrExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); }
	ruleAndExpression
	{ after(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrExpression__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrExpressionAccess().getGroup_1()); }
	(rule__OrExpression__Group_1__0)*
	{ after(grammarAccess.getOrExpressionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OrExpression__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrExpression__Group_1__0__Impl
	rule__OrExpression__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpression__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrExpressionAccess().getOrExprLeftAction_1_0()); }
	()
	{ after(grammarAccess.getOrExpressionAccess().getOrExprLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpression__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrExpression__Group_1__1__Impl
	rule__OrExpression__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpression__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrExpressionAccess().getOpAssignment_1_1()); }
	(rule__OrExpression__OpAssignment_1_1)
	{ after(grammarAccess.getOrExpressionAccess().getOpAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpression__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrExpression__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpression__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrExpressionAccess().getRightAssignment_1_2()); }
	(rule__OrExpression__RightAssignment_1_2)
	{ after(grammarAccess.getOrExpressionAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AndExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndExpression__Group__0__Impl
	rule__AndExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndExpressionAccess().getEqualNotExpressionParserRuleCall_0()); }
	ruleEqualNotExpression
	{ after(grammarAccess.getAndExpressionAccess().getEqualNotExpressionParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndExpression__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndExpressionAccess().getGroup_1()); }
	(rule__AndExpression__Group_1__0)*
	{ after(grammarAccess.getAndExpressionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AndExpression__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndExpression__Group_1__0__Impl
	rule__AndExpression__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpression__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndExpressionAccess().getAndExprLeftAction_1_0()); }
	()
	{ after(grammarAccess.getAndExpressionAccess().getAndExprLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpression__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndExpression__Group_1__1__Impl
	rule__AndExpression__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpression__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndExpressionAccess().getOpAssignment_1_1()); }
	(rule__AndExpression__OpAssignment_1_1)
	{ after(grammarAccess.getAndExpressionAccess().getOpAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpression__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndExpression__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpression__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndExpressionAccess().getRightAssignment_1_2()); }
	(rule__AndExpression__RightAssignment_1_2)
	{ after(grammarAccess.getAndExpressionAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EqualNotExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EqualNotExpression__Group__0__Impl
	rule__EqualNotExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EqualNotExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEqualNotExpressionAccess().getLtGtExpressionParserRuleCall_0()); }
	ruleLtGtExpression
	{ after(grammarAccess.getEqualNotExpressionAccess().getLtGtExpressionParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EqualNotExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EqualNotExpression__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EqualNotExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEqualNotExpressionAccess().getGroup_1()); }
	(rule__EqualNotExpression__Group_1__0)*
	{ after(grammarAccess.getEqualNotExpressionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EqualNotExpression__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EqualNotExpression__Group_1__0__Impl
	rule__EqualNotExpression__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EqualNotExpression__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEqualNotExpressionAccess().getEqualNotExprLeftAction_1_0()); }
	()
	{ after(grammarAccess.getEqualNotExpressionAccess().getEqualNotExprLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EqualNotExpression__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EqualNotExpression__Group_1__1__Impl
	rule__EqualNotExpression__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EqualNotExpression__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEqualNotExpressionAccess().getOpAssignment_1_1()); }
	(rule__EqualNotExpression__OpAssignment_1_1)
	{ after(grammarAccess.getEqualNotExpressionAccess().getOpAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EqualNotExpression__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EqualNotExpression__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EqualNotExpression__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEqualNotExpressionAccess().getRightAssignment_1_2()); }
	(rule__EqualNotExpression__RightAssignment_1_2)
	{ after(grammarAccess.getEqualNotExpressionAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__LtGtExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LtGtExpression__Group__0__Impl
	rule__LtGtExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__LtGtExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLtGtExpressionAccess().getColonExpressionParserRuleCall_0()); }
	ruleColonExpression
	{ after(grammarAccess.getLtGtExpressionAccess().getColonExpressionParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LtGtExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LtGtExpression__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__LtGtExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLtGtExpressionAccess().getGroup_1()); }
	(rule__LtGtExpression__Group_1__0)*
	{ after(grammarAccess.getLtGtExpressionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__LtGtExpression__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LtGtExpression__Group_1__0__Impl
	rule__LtGtExpression__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__LtGtExpression__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLtGtExpressionAccess().getLtGtExprLeftAction_1_0()); }
	()
	{ after(grammarAccess.getLtGtExpressionAccess().getLtGtExprLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LtGtExpression__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LtGtExpression__Group_1__1__Impl
	rule__LtGtExpression__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__LtGtExpression__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLtGtExpressionAccess().getOpAssignment_1_1()); }
	(rule__LtGtExpression__OpAssignment_1_1)
	{ after(grammarAccess.getLtGtExpressionAccess().getOpAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LtGtExpression__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LtGtExpression__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__LtGtExpression__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLtGtExpressionAccess().getRightAssignment_1_2()); }
	(rule__LtGtExpression__RightAssignment_1_2)
	{ after(grammarAccess.getLtGtExpressionAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ColonExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ColonExpression__Group__0__Impl
	rule__ColonExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ColonExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getColonExpressionAccess().getPlusMinusExpressionParserRuleCall_0()); }
	rulePlusMinusExpression
	{ after(grammarAccess.getColonExpressionAccess().getPlusMinusExpressionParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ColonExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ColonExpression__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ColonExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getColonExpressionAccess().getGroup_1()); }
	(rule__ColonExpression__Group_1__0)*
	{ after(grammarAccess.getColonExpressionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ColonExpression__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ColonExpression__Group_1__0__Impl
	rule__ColonExpression__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ColonExpression__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getColonExpressionAccess().getColonExprLeftAction_1_0()); }
	()
	{ after(grammarAccess.getColonExpressionAccess().getColonExprLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ColonExpression__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ColonExpression__Group_1__1__Impl
	rule__ColonExpression__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ColonExpression__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getColonExpressionAccess().getOpAssignment_1_1()); }
	(rule__ColonExpression__OpAssignment_1_1)
	{ after(grammarAccess.getColonExpressionAccess().getOpAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ColonExpression__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ColonExpression__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ColonExpression__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getColonExpressionAccess().getRightAssignment_1_2()); }
	(rule__ColonExpression__RightAssignment_1_2)
	{ after(grammarAccess.getColonExpressionAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PlusMinusExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlusMinusExpression__Group__0__Impl
	rule__PlusMinusExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusMinusExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlusMinusExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); }
	ruleMultiplicativeExpression
	{ after(grammarAccess.getPlusMinusExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusMinusExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlusMinusExpression__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusMinusExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlusMinusExpressionAccess().getGroup_1()); }
	(rule__PlusMinusExpression__Group_1__0)*
	{ after(grammarAccess.getPlusMinusExpressionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PlusMinusExpression__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlusMinusExpression__Group_1__0__Impl
	rule__PlusMinusExpression__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusMinusExpression__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlusMinusExpressionAccess().getPlusMinusExprLeftAction_1_0()); }
	()
	{ after(grammarAccess.getPlusMinusExpressionAccess().getPlusMinusExprLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusMinusExpression__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlusMinusExpression__Group_1__1__Impl
	rule__PlusMinusExpression__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusMinusExpression__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlusMinusExpressionAccess().getOpAssignment_1_1()); }
	(rule__PlusMinusExpression__OpAssignment_1_1)
	{ after(grammarAccess.getPlusMinusExpressionAccess().getOpAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusMinusExpression__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlusMinusExpression__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusMinusExpression__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlusMinusExpressionAccess().getRightAssignment_1_2()); }
	(rule__PlusMinusExpression__RightAssignment_1_2)
	{ after(grammarAccess.getPlusMinusExpressionAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MultiplicativeExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultiplicativeExpression__Group__0__Impl
	rule__MultiplicativeExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiplicativeExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiplicativeExpressionAccess().getUnaryExpressionParserRuleCall_0()); }
	ruleUnaryExpression
	{ after(grammarAccess.getMultiplicativeExpressionAccess().getUnaryExpressionParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiplicativeExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultiplicativeExpression__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiplicativeExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1()); }
	(rule__MultiplicativeExpression__Group_1__0)*
	{ after(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MultiplicativeExpression__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultiplicativeExpression__Group_1__0__Impl
	rule__MultiplicativeExpression__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiplicativeExpression__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExprLeftAction_1_0()); }
	()
	{ after(grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExprLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiplicativeExpression__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultiplicativeExpression__Group_1__1__Impl
	rule__MultiplicativeExpression__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiplicativeExpression__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiplicativeExpressionAccess().getOpAssignment_1_1()); }
	(rule__MultiplicativeExpression__OpAssignment_1_1)
	{ after(grammarAccess.getMultiplicativeExpressionAccess().getOpAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiplicativeExpression__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultiplicativeExpression__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiplicativeExpression__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiplicativeExpressionAccess().getRightAssignment_1_2()); }
	(rule__MultiplicativeExpression__RightAssignment_1_2)
	{ after(grammarAccess.getMultiplicativeExpressionAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__UnaryExpression__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnaryExpression__Group_0__0__Impl
	rule__UnaryExpression__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__UnaryExpression__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnaryExpressionAccess().getUnaryExprAction_0_0()); }
	()
	{ after(grammarAccess.getUnaryExpressionAccess().getUnaryExprAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnaryExpression__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnaryExpression__Group_0__1__Impl
	rule__UnaryExpression__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__UnaryExpression__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnaryExpressionAccess().getOpAssignment_0_1()); }
	(rule__UnaryExpression__OpAssignment_0_1)
	{ after(grammarAccess.getUnaryExpressionAccess().getOpAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnaryExpression__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnaryExpression__Group_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__UnaryExpression__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnaryExpressionAccess().getExpAssignment_0_2()); }
	(rule__UnaryExpression__ExpAssignment_0_2)
	{ after(grammarAccess.getUnaryExpressionAccess().getExpAssignment_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PrimaryExpr__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrimaryExpr__Group_1__0__Impl
	rule__PrimaryExpr__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryExpr__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryExprAccess().getPostFixExprAction_1_0()); }
	()
	{ after(grammarAccess.getPrimaryExprAccess().getPostFixExprAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryExpr__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrimaryExpr__Group_1__1__Impl
	rule__PrimaryExpr__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryExpr__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryExprAccess().getBaseExpAssignment_1_1()); }
	(rule__PrimaryExpr__BaseExpAssignment_1_1)
	{ after(grammarAccess.getPrimaryExprAccess().getBaseExpAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryExpr__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrimaryExpr__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryExpr__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryExprAccess().getPostsAssignment_1_2()); }
	(rule__PrimaryExpr__PostsAssignment_1_2)*
	{ after(grammarAccess.getPrimaryExprAccess().getPostsAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BaseExpr__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_0__0__Impl
	rule__BaseExpr__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getSlangLitTermAction_0_0()); }
	()
	{ after(grammarAccess.getBaseExprAccess().getSlangLitTermAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getLitAssignment_0_1()); }
	(rule__BaseExpr__LitAssignment_0_1)
	{ after(grammarAccess.getBaseExprAccess().getLitAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BaseExpr__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_1__0__Impl
	rule__BaseExpr__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getSlangInterpTermAction_1_0()); }
	()
	{ after(grammarAccess.getBaseExprAccess().getSlangInterpTermAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getIAssignment_1_1()); }
	(rule__BaseExpr__IAssignment_1_1)
	{ after(grammarAccess.getBaseExprAccess().getIAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BaseExpr__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_2__0__Impl
	rule__BaseExpr__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getGroup_2_0()); }
	(rule__BaseExpr__Group_2_0__0)
	{ after(grammarAccess.getBaseExprAccess().getGroup_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_2__1__Impl
	rule__BaseExpr__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getStateVarAssignment_2_1()); }
	(rule__BaseExpr__StateVarAssignment_2_1)
	{ after(grammarAccess.getBaseExprAccess().getStateVarAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getRightParenthesisKeyword_2_2()); }
	RightParenthesis
	{ after(grammarAccess.getBaseExprAccess().getRightParenthesisKeyword_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BaseExpr__Group_2_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_2_0__0__Impl
	rule__BaseExpr__Group_2_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_2_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getInStateExprAction_2_0_0()); }
	()
	{ after(grammarAccess.getBaseExprAccess().getInStateExprAction_2_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_2_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_2_0__1__Impl
	rule__BaseExpr__Group_2_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_2_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getInKeyword_2_0_1()); }
	In_1
	{ after(grammarAccess.getBaseExprAccess().getInKeyword_2_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_2_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_2_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_2_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getLeftParenthesisKeyword_2_0_2()); }
	LeftParenthesis
	{ after(grammarAccess.getBaseExprAccess().getLeftParenthesisKeyword_2_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BaseExpr__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_3__0__Impl
	rule__BaseExpr__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getGroup_3_0()); }
	(rule__BaseExpr__Group_3_0__0)
	{ after(grammarAccess.getBaseExprAccess().getGroup_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_3__1__Impl
	rule__BaseExpr__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getEventPortAssignment_3_1()); }
	(rule__BaseExpr__EventPortAssignment_3_1)
	{ after(grammarAccess.getBaseExprAccess().getEventPortAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_3__2__Impl
	rule__BaseExpr__Group_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getGroup_3_2()); }
	(rule__BaseExpr__Group_3_2__0)?
	{ after(grammarAccess.getBaseExprAccess().getGroup_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_3__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_3__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_3__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getRightParenthesisKeyword_3_3()); }
	RightParenthesis
	{ after(grammarAccess.getBaseExprAccess().getRightParenthesisKeyword_3_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BaseExpr__Group_3_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_3_0__0__Impl
	rule__BaseExpr__Group_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_3_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getMaySendExprAction_3_0_0()); }
	()
	{ after(grammarAccess.getBaseExprAccess().getMaySendExprAction_3_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_3_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_3_0__1__Impl
	rule__BaseExpr__Group_3_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_3_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getMaySendKeyword_3_0_1()); }
	MaySend
	{ after(grammarAccess.getBaseExprAccess().getMaySendKeyword_3_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_3_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_3_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_3_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getLeftParenthesisKeyword_3_0_2()); }
	LeftParenthesis
	{ after(grammarAccess.getBaseExprAccess().getLeftParenthesisKeyword_3_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BaseExpr__Group_3_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_3_2__0__Impl
	rule__BaseExpr__Group_3_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_3_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getCommaKeyword_3_2_0()); }
	Comma
	{ after(grammarAccess.getBaseExprAccess().getCommaKeyword_3_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_3_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_3_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_3_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getValueAssignment_3_2_1()); }
	(rule__BaseExpr__ValueAssignment_3_2_1)
	{ after(grammarAccess.getBaseExprAccess().getValueAssignment_3_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BaseExpr__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_4__0__Impl
	rule__BaseExpr__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getGroup_4_0()); }
	(rule__BaseExpr__Group_4_0__0)
	{ after(grammarAccess.getBaseExprAccess().getGroup_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_4__1__Impl
	rule__BaseExpr__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getEventPortAssignment_4_1()); }
	(rule__BaseExpr__EventPortAssignment_4_1)
	{ after(grammarAccess.getBaseExprAccess().getEventPortAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_4__2__Impl
	rule__BaseExpr__Group_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getGroup_4_2()); }
	(rule__BaseExpr__Group_4_2__0)?
	{ after(grammarAccess.getBaseExprAccess().getGroup_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_4__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_4__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_4__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getRightParenthesisKeyword_4_3()); }
	RightParenthesis
	{ after(grammarAccess.getBaseExprAccess().getRightParenthesisKeyword_4_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BaseExpr__Group_4_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_4_0__0__Impl
	rule__BaseExpr__Group_4_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_4_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getMustSendExprAction_4_0_0()); }
	()
	{ after(grammarAccess.getBaseExprAccess().getMustSendExprAction_4_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_4_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_4_0__1__Impl
	rule__BaseExpr__Group_4_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_4_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getMustSendKeyword_4_0_1()); }
	MustSend
	{ after(grammarAccess.getBaseExprAccess().getMustSendKeyword_4_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_4_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_4_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_4_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getLeftParenthesisKeyword_4_0_2()); }
	LeftParenthesis
	{ after(grammarAccess.getBaseExprAccess().getLeftParenthesisKeyword_4_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BaseExpr__Group_4_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_4_2__0__Impl
	rule__BaseExpr__Group_4_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_4_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getCommaKeyword_4_2_0()); }
	Comma
	{ after(grammarAccess.getBaseExprAccess().getCommaKeyword_4_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_4_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_4_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_4_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getValueAssignment_4_2_1()); }
	(rule__BaseExpr__ValueAssignment_4_2_1)
	{ after(grammarAccess.getBaseExprAccess().getValueAssignment_4_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BaseExpr__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_5__0__Impl
	rule__BaseExpr__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getGroup_5_0()); }
	(rule__BaseExpr__Group_5_0__0)
	{ after(grammarAccess.getBaseExprAccess().getGroup_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_5__1__Impl
	rule__BaseExpr__Group_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getEventPortAssignment_5_1()); }
	(rule__BaseExpr__EventPortAssignment_5_1)
	{ after(grammarAccess.getBaseExprAccess().getEventPortAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_5__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_5__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_5__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getRightParenthesisKeyword_5_2()); }
	RightParenthesis
	{ after(grammarAccess.getBaseExprAccess().getRightParenthesisKeyword_5_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BaseExpr__Group_5_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_5_0__0__Impl
	rule__BaseExpr__Group_5_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_5_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getNoSendExprAction_5_0_0()); }
	()
	{ after(grammarAccess.getBaseExprAccess().getNoSendExprAction_5_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_5_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_5_0__1__Impl
	rule__BaseExpr__Group_5_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_5_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getNoSendKeyword_5_0_1()); }
	NoSend
	{ after(grammarAccess.getBaseExprAccess().getNoSendKeyword_5_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_5_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_5_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_5_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getLeftParenthesisKeyword_5_0_2()); }
	LeftParenthesis
	{ after(grammarAccess.getBaseExprAccess().getLeftParenthesisKeyword_5_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BaseExpr__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_6__0__Impl
	rule__BaseExpr__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getGroup_6_0()); }
	(rule__BaseExpr__Group_6_0__0)
	{ after(grammarAccess.getBaseExprAccess().getGroup_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_6__1__Impl
	rule__BaseExpr__Group_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getEventPortAssignment_6_1()); }
	(rule__BaseExpr__EventPortAssignment_6_1)
	{ after(grammarAccess.getBaseExprAccess().getEventPortAssignment_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_6__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_6__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_6__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getRightParenthesisKeyword_6_2()); }
	RightParenthesis
	{ after(grammarAccess.getBaseExprAccess().getRightParenthesisKeyword_6_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BaseExpr__Group_6_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_6_0__0__Impl
	rule__BaseExpr__Group_6_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_6_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getHasEventExprAction_6_0_0()); }
	()
	{ after(grammarAccess.getBaseExprAccess().getHasEventExprAction_6_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_6_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_6_0__1__Impl
	rule__BaseExpr__Group_6_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_6_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getHasEventKeyword_6_0_1()); }
	HasEvent
	{ after(grammarAccess.getBaseExprAccess().getHasEventKeyword_6_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_6_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_6_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_6_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getLeftParenthesisKeyword_6_0_2()); }
	LeftParenthesis
	{ after(grammarAccess.getBaseExprAccess().getLeftParenthesisKeyword_6_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BaseExpr__Group_7__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_7__0__Impl
	rule__BaseExpr__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_7__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getGroup_7_0()); }
	(rule__BaseExpr__Group_7_0__0)
	{ after(grammarAccess.getBaseExprAccess().getGroup_7_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_7__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_7__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_7__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getValueAssignment_7_1()); }
	(rule__BaseExpr__ValueAssignment_7_1)
	{ after(grammarAccess.getBaseExprAccess().getValueAssignment_7_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BaseExpr__Group_7_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_7_0__0__Impl
	rule__BaseExpr__Group_7_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_7_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getEnumLitExprAction_7_0_0()); }
	()
	{ after(grammarAccess.getBaseExprAccess().getEnumLitExprAction_7_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_7_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_7_0__1__Impl
	rule__BaseExpr__Group_7_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_7_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getEnumTypeAssignment_7_0_1()); }
	(rule__BaseExpr__EnumTypeAssignment_7_0_1)
	{ after(grammarAccess.getBaseExprAccess().getEnumTypeAssignment_7_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_7_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_7_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_7_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getFullStopKeyword_7_0_2()); }
	FullStop
	{ after(grammarAccess.getBaseExprAccess().getFullStopKeyword_7_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BaseExpr__Group_9__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_9__0__Impl
	rule__BaseExpr__Group_9__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_9__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getParenExprAction_9_0()); }
	()
	{ after(grammarAccess.getBaseExprAccess().getParenExprAction_9_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_9__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_9__1__Impl
	rule__BaseExpr__Group_9__2
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_9__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getLeftParenthesisKeyword_9_1()); }
	LeftParenthesis
	{ after(grammarAccess.getBaseExprAccess().getLeftParenthesisKeyword_9_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_9__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_9__2__Impl
	rule__BaseExpr__Group_9__3
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_9__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getExpAssignment_9_2()); }
	(rule__BaseExpr__ExpAssignment_9_2)
	{ after(grammarAccess.getBaseExprAccess().getExpAssignment_9_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_9__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_9__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_9__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getRightParenthesisKeyword_9_3()); }
	RightParenthesis
	{ after(grammarAccess.getBaseExprAccess().getRightParenthesisKeyword_9_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BaseExpr__Group_10__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_10__0__Impl
	rule__BaseExpr__Group_10__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_10__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getSlangForTermAction_10_0()); }
	()
	{ after(grammarAccess.getBaseExprAccess().getSlangForTermAction_10_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_10__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_10__1__Impl
	rule__BaseExpr__Group_10__2
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_10__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getForKeyword_10_1()); }
	For
	{ after(grammarAccess.getBaseExprAccess().getForKeyword_10_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_10__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_10__2__Impl
	rule__BaseExpr__Group_10__3
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_10__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getRAssignment_10_2()); }
	(rule__BaseExpr__RAssignment_10_2)
	{ after(grammarAccess.getBaseExprAccess().getRAssignment_10_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_10__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_10__3__Impl
	rule__BaseExpr__Group_10__4
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_10__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getGroup_10_3()); }
	(rule__BaseExpr__Group_10_3__0)*
	{ after(grammarAccess.getBaseExprAccess().getGroup_10_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_10__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_10__4__Impl
	rule__BaseExpr__Group_10__5
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_10__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getYieldKeyword_10_4()); }
	Yield
	{ after(grammarAccess.getBaseExprAccess().getYieldKeyword_10_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_10__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_10__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_10__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getAlternatives_10_5()); }
	(rule__BaseExpr__Alternatives_10_5)
	{ after(grammarAccess.getBaseExprAccess().getAlternatives_10_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BaseExpr__Group_10_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_10_3__0__Impl
	rule__BaseExpr__Group_10_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_10_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getCommaKeyword_10_3_0()); }
	Comma
	{ after(grammarAccess.getBaseExprAccess().getCommaKeyword_10_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_10_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_10_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_10_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getRAssignment_10_3_1()); }
	(rule__BaseExpr__RAssignment_10_3_1)
	{ after(grammarAccess.getBaseExprAccess().getRAssignment_10_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BaseExpr__Group_10_5_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_10_5_1__0__Impl
	rule__BaseExpr__Group_10_5_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_10_5_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getLeftParenthesisKeyword_10_5_1_0()); }
	LeftParenthesis
	{ after(grammarAccess.getBaseExprAccess().getLeftParenthesisKeyword_10_5_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_10_5_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_10_5_1__1__Impl
	rule__BaseExpr__Group_10_5_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_10_5_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getEAssignment_10_5_1_1()); }
	(rule__BaseExpr__EAssignment_10_5_1_1)
	{ after(grammarAccess.getBaseExprAccess().getEAssignment_10_5_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_10_5_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_10_5_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_10_5_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getRightParenthesisKeyword_10_5_1_2()); }
	RightParenthesis
	{ after(grammarAccess.getBaseExprAccess().getRightParenthesisKeyword_10_5_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BaseExpr__Group_11__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_11__0__Impl
	rule__BaseExpr__Group_11__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_11__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getSlangBlockTermAction_11_0()); }
	()
	{ after(grammarAccess.getBaseExprAccess().getSlangBlockTermAction_11_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_11__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_11__1__Impl
	rule__BaseExpr__Group_11__2
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_11__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getLeftCurlyBracketKeyword_11_1()); }
	LeftCurlyBracket
	{ after(grammarAccess.getBaseExprAccess().getLeftCurlyBracketKeyword_11_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_11__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_11__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_11__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getAlternatives_11_2()); }
	(rule__BaseExpr__Alternatives_11_2)
	{ after(grammarAccess.getBaseExprAccess().getAlternatives_11_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BaseExpr__Group_11_2_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_11_2_0__0__Impl
	rule__BaseExpr__Group_11_2_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_11_2_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getGroup_11_2_0_0()); }
	(rule__BaseExpr__Group_11_2_0_0__0)?
	{ after(grammarAccess.getBaseExprAccess().getGroup_11_2_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_11_2_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_11_2_0__1__Impl
	rule__BaseExpr__Group_11_2_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_11_2_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getEAssignment_11_2_0_1()); }
	(rule__BaseExpr__EAssignment_11_2_0_1)
	{ after(grammarAccess.getBaseExprAccess().getEAssignment_11_2_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_11_2_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_11_2_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_11_2_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getRightCurlyBracketKeyword_11_2_0_2()); }
	RightCurlyBracket
	{ after(grammarAccess.getBaseExprAccess().getRightCurlyBracketKeyword_11_2_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BaseExpr__Group_11_2_0_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_11_2_0_0__0__Impl
	rule__BaseExpr__Group_11_2_0_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_11_2_0_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getPAssignment_11_2_0_0_0()); }
	(rule__BaseExpr__PAssignment_11_2_0_0_0)
	{ after(grammarAccess.getBaseExprAccess().getPAssignment_11_2_0_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_11_2_0_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_11_2_0_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_11_2_0_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getEqualsSignGreaterThanSignKeyword_11_2_0_0_1()); }
	EqualsSignGreaterThanSign
	{ after(grammarAccess.getBaseExprAccess().getEqualsSignGreaterThanSignKeyword_11_2_0_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BaseExpr__Group_11_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_11_2_1__0__Impl
	rule__BaseExpr__Group_11_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_11_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getStmtAssignment_11_2_1_0()); }
	(rule__BaseExpr__StmtAssignment_11_2_1_0)*
	{ after(grammarAccess.getBaseExprAccess().getStmtAssignment_11_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_11_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_11_2_1__1__Impl
	rule__BaseExpr__Group_11_2_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_11_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getRAssignment_11_2_1_1()); }
	(rule__BaseExpr__RAssignment_11_2_1_1)?
	{ after(grammarAccess.getBaseExprAccess().getRAssignment_11_2_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_11_2_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseExpr__Group_11_2_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__Group_11_2_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseExprAccess().getRightCurlyBracketKeyword_11_2_1_2()); }
	RightCurlyBracket
	{ after(grammarAccess.getBaseExprAccess().getRightCurlyBracketKeyword_11_2_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FloatObjectExpr__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FloatObjectExpr__Group_0__0__Impl
	rule__FloatObjectExpr__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FloatObjectExpr__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFloatObjectExprAccess().getF32ObjAction_0_0()); }
	()
	{ after(grammarAccess.getFloatObjectExprAccess().getF32ObjAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FloatObjectExpr__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FloatObjectExpr__Group_0__1__Impl
	rule__FloatObjectExpr__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__FloatObjectExpr__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFloatObjectExprAccess().getF32Keyword_0_1()); }
	F32
	{ after(grammarAccess.getFloatObjectExprAccess().getF32Keyword_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FloatObjectExpr__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FloatObjectExpr__Group_0__2__Impl
	rule__FloatObjectExpr__Group_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__FloatObjectExpr__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFloatObjectExprAccess().getFullStopKeyword_0_2()); }
	FullStop
	{ after(grammarAccess.getFloatObjectExprAccess().getFullStopKeyword_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FloatObjectExpr__Group_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FloatObjectExpr__Group_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FloatObjectExpr__Group_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFloatObjectExprAccess().getAttrAssignment_0_3()); }
	(rule__FloatObjectExpr__AttrAssignment_0_3)
	{ after(grammarAccess.getFloatObjectExprAccess().getAttrAssignment_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FloatObjectExpr__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FloatObjectExpr__Group_1__0__Impl
	rule__FloatObjectExpr__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FloatObjectExpr__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFloatObjectExprAccess().getF64ObjAction_1_0()); }
	()
	{ after(grammarAccess.getFloatObjectExprAccess().getF64ObjAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FloatObjectExpr__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FloatObjectExpr__Group_1__1__Impl
	rule__FloatObjectExpr__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__FloatObjectExpr__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFloatObjectExprAccess().getF64Keyword_1_1()); }
	F64
	{ after(grammarAccess.getFloatObjectExprAccess().getF64Keyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FloatObjectExpr__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FloatObjectExpr__Group_1__2__Impl
	rule__FloatObjectExpr__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__FloatObjectExpr__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFloatObjectExprAccess().getFullStopKeyword_1_2()); }
	FullStop
	{ after(grammarAccess.getFloatObjectExprAccess().getFullStopKeyword_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FloatObjectExpr__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FloatObjectExpr__Group_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FloatObjectExpr__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFloatObjectExprAccess().getAttrAssignment_1_3()); }
	(rule__FloatObjectExpr__AttrAssignment_1_3)
	{ after(grammarAccess.getFloatObjectExprAccess().getAttrAssignment_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AccessibleBaseExpr__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AccessibleBaseExpr__Group_0__0__Impl
	rule__AccessibleBaseExpr__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AccessibleBaseExpr__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAccessibleBaseExprAccess().getCallExprAction_0_0()); }
	()
	{ after(grammarAccess.getAccessibleBaseExprAccess().getCallExprAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AccessibleBaseExpr__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AccessibleBaseExpr__Group_0__1__Impl
	rule__AccessibleBaseExpr__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AccessibleBaseExpr__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAccessibleBaseExprAccess().getIdAssignment_0_1()); }
	(rule__AccessibleBaseExpr__IdAssignment_0_1)
	{ after(grammarAccess.getAccessibleBaseExprAccess().getIdAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AccessibleBaseExpr__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AccessibleBaseExpr__Group_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AccessibleBaseExpr__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAccessibleBaseExprAccess().getCallSuffixAssignment_0_2()); }
	(rule__AccessibleBaseExpr__CallSuffixAssignment_0_2)
	{ after(grammarAccess.getAccessibleBaseExprAccess().getCallSuffixAssignment_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AccessibleBaseExpr__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AccessibleBaseExpr__Group_1__0__Impl
	rule__AccessibleBaseExpr__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AccessibleBaseExpr__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAccessibleBaseExprAccess().getGroup_1_0()); }
	(rule__AccessibleBaseExpr__Group_1_0__0)
	{ after(grammarAccess.getAccessibleBaseExprAccess().getGroup_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AccessibleBaseExpr__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AccessibleBaseExpr__Group_1__1__Impl
	rule__AccessibleBaseExpr__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AccessibleBaseExpr__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAccessibleBaseExprAccess().getArgExprAssignment_1_1()); }
	(rule__AccessibleBaseExpr__ArgExprAssignment_1_1)
	{ after(grammarAccess.getAccessibleBaseExprAccess().getArgExprAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AccessibleBaseExpr__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AccessibleBaseExpr__Group_1__2__Impl
	rule__AccessibleBaseExpr__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AccessibleBaseExpr__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAccessibleBaseExprAccess().getGroup_1_2()); }
	(rule__AccessibleBaseExpr__Group_1_2__0)*
	{ after(grammarAccess.getAccessibleBaseExprAccess().getGroup_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AccessibleBaseExpr__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AccessibleBaseExpr__Group_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AccessibleBaseExpr__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAccessibleBaseExprAccess().getRightCurlyBracketKeyword_1_3()); }
	RightCurlyBracket
	{ after(grammarAccess.getAccessibleBaseExprAccess().getRightCurlyBracketKeyword_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AccessibleBaseExpr__Group_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AccessibleBaseExpr__Group_1_0__0__Impl
	rule__AccessibleBaseExpr__Group_1_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AccessibleBaseExpr__Group_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAccessibleBaseExprAccess().getRecordLitExprAction_1_0_0()); }
	()
	{ after(grammarAccess.getAccessibleBaseExprAccess().getRecordLitExprAction_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AccessibleBaseExpr__Group_1_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AccessibleBaseExpr__Group_1_0__1__Impl
	rule__AccessibleBaseExpr__Group_1_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AccessibleBaseExpr__Group_1_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAccessibleBaseExprAccess().getRecordTypeAssignment_1_0_1()); }
	(rule__AccessibleBaseExpr__RecordTypeAssignment_1_0_1)
	{ after(grammarAccess.getAccessibleBaseExprAccess().getRecordTypeAssignment_1_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AccessibleBaseExpr__Group_1_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AccessibleBaseExpr__Group_1_0__2__Impl
	rule__AccessibleBaseExpr__Group_1_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AccessibleBaseExpr__Group_1_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAccessibleBaseExprAccess().getLeftCurlyBracketKeyword_1_0_2()); }
	LeftCurlyBracket
	{ after(grammarAccess.getAccessibleBaseExprAccess().getLeftCurlyBracketKeyword_1_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AccessibleBaseExpr__Group_1_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AccessibleBaseExpr__Group_1_0__3__Impl
	rule__AccessibleBaseExpr__Group_1_0__4
;
finally {
	restoreStackSize(stackSize);
}

rule__AccessibleBaseExpr__Group_1_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAccessibleBaseExprAccess().getArgsAssignment_1_0_3()); }
	(rule__AccessibleBaseExpr__ArgsAssignment_1_0_3)
	{ after(grammarAccess.getAccessibleBaseExprAccess().getArgsAssignment_1_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AccessibleBaseExpr__Group_1_0__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AccessibleBaseExpr__Group_1_0__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AccessibleBaseExpr__Group_1_0__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAccessibleBaseExprAccess().getEqualsSignKeyword_1_0_4()); }
	EqualsSign
	{ after(grammarAccess.getAccessibleBaseExprAccess().getEqualsSignKeyword_1_0_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AccessibleBaseExpr__Group_1_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AccessibleBaseExpr__Group_1_2__0__Impl
	rule__AccessibleBaseExpr__Group_1_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AccessibleBaseExpr__Group_1_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAccessibleBaseExprAccess().getSemicolonKeyword_1_2_0()); }
	Semicolon
	{ after(grammarAccess.getAccessibleBaseExprAccess().getSemicolonKeyword_1_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AccessibleBaseExpr__Group_1_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AccessibleBaseExpr__Group_1_2__1__Impl
	rule__AccessibleBaseExpr__Group_1_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AccessibleBaseExpr__Group_1_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAccessibleBaseExprAccess().getArgsAssignment_1_2_1()); }
	(rule__AccessibleBaseExpr__ArgsAssignment_1_2_1)
	{ after(grammarAccess.getAccessibleBaseExprAccess().getArgsAssignment_1_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AccessibleBaseExpr__Group_1_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AccessibleBaseExpr__Group_1_2__2__Impl
	rule__AccessibleBaseExpr__Group_1_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AccessibleBaseExpr__Group_1_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAccessibleBaseExprAccess().getEqualsSignKeyword_1_2_2()); }
	EqualsSign
	{ after(grammarAccess.getAccessibleBaseExprAccess().getEqualsSignKeyword_1_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AccessibleBaseExpr__Group_1_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AccessibleBaseExpr__Group_1_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AccessibleBaseExpr__Group_1_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAccessibleBaseExprAccess().getArgExprAssignment_1_2_3()); }
	(rule__AccessibleBaseExpr__ArgExprAssignment_1_2_3)
	{ after(grammarAccess.getAccessibleBaseExprAccess().getArgExprAssignment_1_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AccessibleBaseExpr__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AccessibleBaseExpr__Group_2__0__Impl
	rule__AccessibleBaseExpr__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AccessibleBaseExpr__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAccessibleBaseExprAccess().getDataRefExprAction_2_0()); }
	()
	{ after(grammarAccess.getAccessibleBaseExprAccess().getDataRefExprAction_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AccessibleBaseExpr__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AccessibleBaseExpr__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AccessibleBaseExpr__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAccessibleBaseExprAccess().getPortOrSubcomponentOrStateVarAssignment_2_1()); }
	(rule__AccessibleBaseExpr__PortOrSubcomponentOrStateVarAssignment_2_1)
	{ after(grammarAccess.getAccessibleBaseExprAccess().getPortOrSubcomponentOrStateVarAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AccessibleBaseExpr__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AccessibleBaseExpr__Group_3__0__Impl
	rule__AccessibleBaseExpr__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AccessibleBaseExpr__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAccessibleBaseExprAccess().getResultExprAction_3_0()); }
	()
	{ after(grammarAccess.getAccessibleBaseExprAccess().getResultExprAction_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AccessibleBaseExpr__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AccessibleBaseExpr__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AccessibleBaseExpr__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAccessibleBaseExprAccess().getResKeyword_3_1()); }
	Res
	{ after(grammarAccess.getAccessibleBaseExprAccess().getResKeyword_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedAADLName__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedAADLName__Group__0__Impl
	rule__QualifiedAADLName__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedAADLName__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedAADLNameAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
	{ after(grammarAccess.getQualifiedAADLNameAccess().getIDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedAADLName__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedAADLName__Group__1__Impl
	rule__QualifiedAADLName__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedAADLName__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getQualifiedAADLNameAccess().getGroup_1()); }
		(rule__QualifiedAADLName__Group_1__0)
		{ after(grammarAccess.getQualifiedAADLNameAccess().getGroup_1()); }
	)
	(
		{ before(grammarAccess.getQualifiedAADLNameAccess().getGroup_1()); }
		(rule__QualifiedAADLName__Group_1__0)*
		{ after(grammarAccess.getQualifiedAADLNameAccess().getGroup_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedAADLName__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedAADLName__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedAADLName__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedAADLNameAccess().getGroup_2()); }
	(rule__QualifiedAADLName__Group_2__0)?
	{ after(grammarAccess.getQualifiedAADLNameAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedAADLName__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedAADLName__Group_1__0__Impl
	rule__QualifiedAADLName__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedAADLName__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedAADLNameAccess().getColonColonKeyword_1_0()); }
	ColonColon
	{ after(grammarAccess.getQualifiedAADLNameAccess().getColonColonKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedAADLName__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedAADLName__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedAADLName__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedAADLNameAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
	{ after(grammarAccess.getQualifiedAADLNameAccess().getIDTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedAADLName__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedAADLName__Group_2__0__Impl
	rule__QualifiedAADLName__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedAADLName__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedAADLNameAccess().getFullStopKeyword_2_0()); }
	FullStop
	{ after(grammarAccess.getQualifiedAADLNameAccess().getFullStopKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedAADLName__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedAADLName__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedAADLName__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedAADLNameAccess().getIDTerminalRuleCall_2_1()); }
	RULE_ID
	{ after(grammarAccess.getQualifiedAADLNameAccess().getIDTerminalRuleCall_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MemberAccess__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MemberAccess__Group__0__Impl
	rule__MemberAccess__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MemberAccess__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMemberAccessAccess().getFullStopKeyword_0()); }
	FullStop
	{ after(grammarAccess.getMemberAccessAccess().getFullStopKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MemberAccess__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MemberAccess__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MemberAccess__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMemberAccessAccess().getFieldAssignment_1()); }
	(rule__MemberAccess__FieldAssignment_1)
	{ after(grammarAccess.getMemberAccessAccess().getFieldAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ArrayAccess__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayAccess__Group__0__Impl
	rule__ArrayAccess__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayAccess__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayAccessAccess().getArrayAccessAction_0()); }
	()
	{ after(grammarAccess.getArrayAccessAccess().getArrayAccessAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayAccess__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayAccess__Group__1__Impl
	rule__ArrayAccess__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayAccess__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayAccessAccess().getLeftParenthesisKeyword_1()); }
	LeftParenthesis
	{ after(grammarAccess.getArrayAccessAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayAccess__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayAccess__Group__2__Impl
	rule__ArrayAccess__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayAccess__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayAccessAccess().getGroup_2()); }
	(rule__ArrayAccess__Group_2__0)?
	{ after(grammarAccess.getArrayAccessAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayAccess__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayAccess__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayAccess__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayAccessAccess().getRightParenthesisKeyword_3()); }
	RightParenthesis
	{ after(grammarAccess.getArrayAccessAccess().getRightParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ArrayAccess__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayAccess__Group_2__0__Impl
	rule__ArrayAccess__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayAccess__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayAccessAccess().getIndexAssignment_2_0()); }
	(rule__ArrayAccess__IndexAssignment_2_0)
	{ after(grammarAccess.getArrayAccessAccess().getIndexAssignment_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayAccess__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayAccess__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayAccess__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayAccessAccess().getGroup_2_1()); }
	(rule__ArrayAccess__Group_2_1__0)*
	{ after(grammarAccess.getArrayAccessAccess().getGroup_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ArrayAccess__Group_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayAccess__Group_2_1__0__Impl
	rule__ArrayAccess__Group_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayAccess__Group_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayAccessAccess().getCommaKeyword_2_1_0()); }
	Comma
	{ after(grammarAccess.getArrayAccessAccess().getCommaKeyword_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayAccess__Group_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayAccess__Group_2_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayAccess__Group_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayAccessAccess().getIndexAssignment_2_1_1()); }
	(rule__ArrayAccess__IndexAssignment_2_1_1)
	{ after(grammarAccess.getArrayAccessAccess().getIndexAssignment_2_1_1()); }
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


rule__SlangCallSuffix__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangCallSuffix__Group__0__Impl
	rule__SlangCallSuffix__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangCallSuffix__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangCallSuffixAccess().getSlangCallSuffixAction_0()); }
	()
	{ after(grammarAccess.getSlangCallSuffixAccess().getSlangCallSuffixAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangCallSuffix__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangCallSuffix__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangCallSuffix__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangCallSuffixAccess().getCaAssignment_1()); }
	(rule__SlangCallSuffix__CaAssignment_1)
	{ after(grammarAccess.getSlangCallSuffixAccess().getCaAssignment_1()); }
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
	{ before(grammarAccess.getSlangLitAccess().getHexLitAction_2_0()); }
	()
	{ after(grammarAccess.getSlangLitAccess().getHexLitAction_2_0()); }
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
	{ before(grammarAccess.getSlangLitAccess().getBinLitAction_3_0()); }
	()
	{ after(grammarAccess.getSlangLitAccess().getBinLitAction_3_0()); }
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
	{ before(grammarAccess.getSlangLitAccess().getF32LitAction_4_0()); }
	()
	{ after(grammarAccess.getSlangLitAccess().getF32LitAction_4_0()); }
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
	{ before(grammarAccess.getSlangLitAccess().getF64LitAction_5_0()); }
	()
	{ after(grammarAccess.getSlangLitAccess().getF64LitAction_5_0()); }
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


rule__SlangInterp__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangInterp__Group__0__Impl
	rule__SlangInterp__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangInterp__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangInterpAccess().getSlangLiteralInterpAction_0()); }
	()
	{ after(grammarAccess.getSlangInterpAccess().getSlangLiteralInterpAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangInterp__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangInterp__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangInterp__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangInterpAccess().getSliAssignment_1()); }
	(rule__SlangInterp__SliAssignment_1)
	{ after(grammarAccess.getSlangInterpAccess().getSliAssignment_1()); }
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


rule__QCLREF__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QCLREF__Group__0__Impl
	rule__QCLREF__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QCLREF__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQCLREFAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
	{ after(grammarAccess.getQCLREFAccess().getIDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QCLREF__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QCLREF__Group__1__Impl
	rule__QCLREF__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__QCLREF__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQCLREFAccess().getColonColonKeyword_1()); }
	ColonColon
	{ after(grammarAccess.getQCLREFAccess().getColonColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QCLREF__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QCLREF__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QCLREF__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQCLREFAccess().getIDTerminalRuleCall_2()); }
	RULE_ID
	{ after(grammarAccess.getQCLREFAccess().getIDTerminalRuleCall_2()); }
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


rule__GumboLibrary__FunctionsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGumboLibraryAccess().getFunctionsFunctionsParserRuleCall_1_0()); }
		ruleFunctions
		{ after(grammarAccess.getGumboLibraryAccess().getFunctionsFunctionsParserRuleCall_1_0()); }
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
			{ before(grammarAccess.getStateVarDeclAccess().getTypeNameDataSubcomponentTypeQualifiedNameParserRuleCall_1_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getStateVarDeclAccess().getTypeNameDataSubcomponentTypeQualifiedNameParserRuleCall_1_0_1()); }
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
		{ before(grammarAccess.getInvSpecAccess().getDescriptorSTRING_VALUETerminalRuleCall_2_0()); }
		RULE_STRING_VALUE
		{ after(grammarAccess.getInvSpecAccess().getDescriptorSTRING_VALUETerminalRuleCall_2_0()); }
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
		{ before(grammarAccess.getInvSpecAccess().getExprOwnedExpressionParserRuleCall_4_0()); }
		ruleOwnedExpression
		{ after(grammarAccess.getInvSpecAccess().getExprOwnedExpressionParserRuleCall_4_0()); }
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

rule__Initialize__ModifiesAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInitializeAccess().getModifiesSlangModifiesParserRuleCall_2_0_0()); }
		ruleSlangModifies
		{ after(grammarAccess.getInitializeAccess().getModifiesSlangModifiesParserRuleCall_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Initialize__SpecsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInitializeAccess().getSpecsInitializeSpecStatementParserRuleCall_3_0()); }
		ruleInitializeSpecStatement
		{ after(grammarAccess.getInitializeAccess().getSpecsInitializeSpecStatementParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Initialize__FlowsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInitializeAccess().getFlowsInfoFlowClauseParserRuleCall_4_0()); }
		ruleInfoFlowClause
		{ after(grammarAccess.getInitializeAccess().getFlowsInfoFlowClauseParserRuleCall_4_0()); }
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

rule__Compute__ModifiesAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComputeAccess().getModifiesSlangModifiesParserRuleCall_2_0_0()); }
		ruleSlangModifies
		{ after(grammarAccess.getComputeAccess().getModifiesSlangModifiesParserRuleCall_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compute__AssumesAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComputeAccess().getAssumesAssumeStatementParserRuleCall_3_0()); }
		ruleAssumeStatement
		{ after(grammarAccess.getComputeAccess().getAssumesAssumeStatementParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compute__GuaranteesAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComputeAccess().getGuaranteesGuaranteeStatementParserRuleCall_4_0()); }
		ruleGuaranteeStatement
		{ after(grammarAccess.getComputeAccess().getGuaranteesGuaranteeStatementParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compute__CasesAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComputeAccess().getCasesCaseStatementClauseParserRuleCall_5_1_0()); }
		ruleCaseStatementClause
		{ after(grammarAccess.getComputeAccess().getCasesCaseStatementClauseParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compute__HandlersAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComputeAccess().getHandlersHandlerClauseParserRuleCall_6_0()); }
		ruleHandlerClause
		{ after(grammarAccess.getComputeAccess().getHandlersHandlerClauseParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compute__FlowsAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComputeAccess().getFlowsInfoFlowClauseParserRuleCall_7_0()); }
		ruleInfoFlowClause
		{ after(grammarAccess.getComputeAccess().getFlowsInfoFlowClauseParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InfoFlowClause__IdAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInfoFlowClauseAccess().getIdIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getInfoFlowClauseAccess().getIdIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InfoFlowClause__DescriptorAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInfoFlowClauseAccess().getDescriptorSTRING_VALUETerminalRuleCall_2_0()); }
		RULE_STRING_VALUE
		{ after(grammarAccess.getInfoFlowClauseAccess().getDescriptorSTRING_VALUETerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InfoFlowClause__FromPortOrStateVarAssignment_6_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInfoFlowClauseAccess().getFromPortOrStateVarEObjectCrossReference_6_0_0()); }
		(
			{ before(grammarAccess.getInfoFlowClauseAccess().getFromPortOrStateVarEObjectIDTerminalRuleCall_6_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getInfoFlowClauseAccess().getFromPortOrStateVarEObjectIDTerminalRuleCall_6_0_0_1()); }
		)
		{ after(grammarAccess.getInfoFlowClauseAccess().getFromPortOrStateVarEObjectCrossReference_6_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InfoFlowClause__FromPortOrStateVarAssignment_6_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInfoFlowClauseAccess().getFromPortOrStateVarEObjectCrossReference_6_1_1_0()); }
		(
			{ before(grammarAccess.getInfoFlowClauseAccess().getFromPortOrStateVarEObjectIDTerminalRuleCall_6_1_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getInfoFlowClauseAccess().getFromPortOrStateVarEObjectIDTerminalRuleCall_6_1_1_0_1()); }
		)
		{ after(grammarAccess.getInfoFlowClauseAccess().getFromPortOrStateVarEObjectCrossReference_6_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InfoFlowClause__ToPortOrStateVarAssignment_11_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInfoFlowClauseAccess().getToPortOrStateVarEObjectCrossReference_11_0_0()); }
		(
			{ before(grammarAccess.getInfoFlowClauseAccess().getToPortOrStateVarEObjectIDTerminalRuleCall_11_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getInfoFlowClauseAccess().getToPortOrStateVarEObjectIDTerminalRuleCall_11_0_0_1()); }
		)
		{ after(grammarAccess.getInfoFlowClauseAccess().getToPortOrStateVarEObjectCrossReference_11_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InfoFlowClause__ToPortOrStateVarAssignment_11_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInfoFlowClauseAccess().getToPortOrStateVarEObjectCrossReference_11_1_1_0()); }
		(
			{ before(grammarAccess.getInfoFlowClauseAccess().getToPortOrStateVarEObjectIDTerminalRuleCall_11_1_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getInfoFlowClauseAccess().getToPortOrStateVarEObjectIDTerminalRuleCall_11_1_1_0_1()); }
		)
		{ after(grammarAccess.getInfoFlowClauseAccess().getToPortOrStateVarEObjectCrossReference_11_1_1_0()); }
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

rule__HandlerClause__AssumesAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getHandlerClauseAccess().getAssumesAssumeStatementParserRuleCall_4_0()); }
		ruleAssumeStatement
		{ after(grammarAccess.getHandlerClauseAccess().getAssumesAssumeStatementParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__HandlerClause__GuaranteesAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getHandlerClauseAccess().getGuaranteesGuaranteeStatementParserRuleCall_5_0()); }
		ruleGuaranteeStatement
		{ after(grammarAccess.getHandlerClauseAccess().getGuaranteesGuaranteeStatementParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__HandlerClause__CasesAssignment_6_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getHandlerClauseAccess().getCasesCaseStatementClauseParserRuleCall_6_1_0()); }
		ruleCaseStatementClause
		{ after(grammarAccess.getHandlerClauseAccess().getCasesCaseStatementClauseParserRuleCall_6_1_0()); }
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
		{ before(grammarAccess.getCaseStatementClauseAccess().getDescriptorSTRING_VALUETerminalRuleCall_2_0()); }
		RULE_STRING_VALUE
		{ after(grammarAccess.getCaseStatementClauseAccess().getDescriptorSTRING_VALUETerminalRuleCall_2_0()); }
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
		{ before(grammarAccess.getAssumeStatementAccess().getDescriptorSTRING_VALUETerminalRuleCall_2_0()); }
		RULE_STRING_VALUE
		{ after(grammarAccess.getAssumeStatementAccess().getDescriptorSTRING_VALUETerminalRuleCall_2_0()); }
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
		{ before(grammarAccess.getAssumeStatementAccess().getExprOwnedExpressionParserRuleCall_4_0()); }
		ruleOwnedExpression
		{ after(grammarAccess.getAssumeStatementAccess().getExprOwnedExpressionParserRuleCall_4_0()); }
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
		{ before(grammarAccess.getAnonAssumeStatementAccess().getExprOwnedExpressionParserRuleCall_1_0()); }
		ruleOwnedExpression
		{ after(grammarAccess.getAnonAssumeStatementAccess().getExprOwnedExpressionParserRuleCall_1_0()); }
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
		{ before(grammarAccess.getGuaranteeStatementAccess().getDescriptorSTRING_VALUETerminalRuleCall_2_0()); }
		RULE_STRING_VALUE
		{ after(grammarAccess.getGuaranteeStatementAccess().getDescriptorSTRING_VALUETerminalRuleCall_2_0()); }
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
		{ before(grammarAccess.getGuaranteeStatementAccess().getExprOwnedExpressionParserRuleCall_4_0()); }
		ruleOwnedExpression
		{ after(grammarAccess.getGuaranteeStatementAccess().getExprOwnedExpressionParserRuleCall_4_0()); }
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
		{ before(grammarAccess.getAnonGuaranteeStatementAccess().getExprOwnedExpressionParserRuleCall_1_0()); }
		ruleOwnedExpression
		{ after(grammarAccess.getAnonGuaranteeStatementAccess().getExprOwnedExpressionParserRuleCall_1_0()); }
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
			{ before(grammarAccess.getDataElementAccess().getDataElementDataSubcomponentTypeQualifiedNameParserRuleCall_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getDataElementAccess().getDataElementDataSubcomponentTypeQualifiedNameParserRuleCall_0_1()); }
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

rule__SlangDefDef__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangDefDefAccess().getNameSlangDefIDParserRuleCall_1_0()); }
		ruleSlangDefID
		{ after(grammarAccess.getSlangDefDefAccess().getNameSlangDefIDParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDef__TypeParamsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangDefDefAccess().getTypeParamsSlangTypeParamsParserRuleCall_2_0()); }
		ruleSlangTypeParams
		{ after(grammarAccess.getSlangDefDefAccess().getTypeParamsSlangTypeParamsParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDef__ParamsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangDefDefAccess().getParamsSlangDefParamsParserRuleCall_3_0()); }
		ruleSlangDefParams
		{ after(grammarAccess.getSlangDefDefAccess().getParamsSlangDefParamsParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDef__TypeAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangDefDefAccess().getTypeSlangTypeParserRuleCall_5_0()); }
		ruleSlangType
		{ after(grammarAccess.getSlangDefDefAccess().getTypeSlangTypeParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDef__MethodContractAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangDefDefAccess().getMethodContractSlangDefContractParserRuleCall_7_0()); }
		ruleSlangDefContract
		{ after(grammarAccess.getSlangDefDefAccess().getMethodContractSlangDefContractParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefDef__BodyAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangDefDefAccess().getBodyOwnedExpressionParserRuleCall_8_0()); }
		ruleOwnedExpression
		{ after(grammarAccess.getSlangDefDefAccess().getBodyOwnedExpressionParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefParams__ParamsAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangDefParamsAccess().getParamsSlangDefParamParserRuleCall_1_0_0()); }
		ruleSlangDefParam
		{ after(grammarAccess.getSlangDefParamsAccess().getParamsSlangDefParamParserRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefParams__ParamsAssignment_1_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangDefParamsAccess().getParamsSlangDefParamParserRuleCall_1_1_1_0()); }
		ruleSlangDefParam
		{ after(grammarAccess.getSlangDefParamsAccess().getParamsSlangDefParamParserRuleCall_1_1_1_0()); }
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

rule__SlangDefParam__IsMethodDefAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangDefParamAccess().getIsMethodDefEqualsSignGreaterThanSignKeyword_2_0()); }
		(
			{ before(grammarAccess.getSlangDefParamAccess().getIsMethodDefEqualsSignGreaterThanSignKeyword_2_0()); }
			EqualsSignGreaterThanSign
			{ after(grammarAccess.getSlangDefParamAccess().getIsMethodDefEqualsSignGreaterThanSignKeyword_2_0()); }
		)
		{ after(grammarAccess.getSlangDefParamAccess().getIsMethodDefEqualsSignGreaterThanSignKeyword_2_0()); }
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

rule__SlangDefParam__IsVarArgAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangDefParamAccess().getIsVarArgAsteriskKeyword_4_0()); }
		(
			{ before(grammarAccess.getSlangDefParamAccess().getIsVarArgAsteriskKeyword_4_0()); }
			Asterisk
			{ after(grammarAccess.getSlangDefParamAccess().getIsVarArgAsteriskKeyword_4_0()); }
		)
		{ after(grammarAccess.getSlangDefParamAccess().getIsVarArgAsteriskKeyword_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTypeParams__TypeParamAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangTypeParamsAccess().getTypeParamSlangTypeParamParserRuleCall_1_0()); }
		ruleSlangTypeParam
		{ after(grammarAccess.getSlangTypeParamsAccess().getTypeParamSlangTypeParamParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTypeParams__TypeParamAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangTypeParamsAccess().getTypeParamSlangTypeParamParserRuleCall_2_1_0()); }
		ruleSlangTypeParam
		{ after(grammarAccess.getSlangTypeParamsAccess().getTypeParamSlangTypeParamParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTypeParam__IsMutAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangTypeParamAccess().getIsMutMutKeyword_0_0()); }
		(
			{ before(grammarAccess.getSlangTypeParamAccess().getIsMutMutKeyword_0_0()); }
			Mut
			{ after(grammarAccess.getSlangTypeParamAccess().getIsMutMutKeyword_0_0()); }
		)
		{ after(grammarAccess.getSlangTypeParamAccess().getIsMutMutKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTypeParam__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangTypeParamAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getSlangTypeParamAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContract__ReadsAssignment_1_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangDefContractAccess().getReadsSlangReadsParserRuleCall_1_0_0_0()); }
		ruleSlangReads
		{ after(grammarAccess.getSlangDefContractAccess().getReadsSlangReadsParserRuleCall_1_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContract__RequiresAssignment_1_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangDefContractAccess().getRequiresSlangRequiresParserRuleCall_1_1_0_0()); }
		ruleSlangRequires
		{ after(grammarAccess.getSlangDefContractAccess().getRequiresSlangRequiresParserRuleCall_1_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContract__ModifiesAssignment_1_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangDefContractAccess().getModifiesSlangModifiesParserRuleCall_1_2_0_0()); }
		ruleSlangModifies
		{ after(grammarAccess.getSlangDefContractAccess().getModifiesSlangModifiesParserRuleCall_1_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangDefContract__EnsuresAssignment_1_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangDefContractAccess().getEnsuresSlangEnsuresParserRuleCall_1_3_0_0()); }
		ruleSlangEnsures
		{ after(grammarAccess.getSlangDefContractAccess().getEnsuresSlangEnsuresParserRuleCall_1_3_0_0()); }
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
		{ before(grammarAccess.getSlangInvariantAccess().getExprsOwnedExpressionParserRuleCall_1_0()); }
		ruleOwnedExpression
		{ after(grammarAccess.getSlangInvariantAccess().getExprsOwnedExpressionParserRuleCall_1_0()); }
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
		{ before(grammarAccess.getSlangInvariantAccess().getExprsOwnedExpressionParserRuleCall_2_1_0()); }
		ruleOwnedExpression
		{ after(grammarAccess.getSlangInvariantAccess().getExprsOwnedExpressionParserRuleCall_2_1_0()); }
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
		{ before(grammarAccess.getSlangRequiresAccess().getExprsOwnedExpressionParserRuleCall_1_0()); }
		ruleOwnedExpression
		{ after(grammarAccess.getSlangRequiresAccess().getExprsOwnedExpressionParserRuleCall_1_0()); }
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
		{ before(grammarAccess.getSlangRequiresAccess().getExprsOwnedExpressionParserRuleCall_2_1_0()); }
		ruleOwnedExpression
		{ after(grammarAccess.getSlangRequiresAccess().getExprsOwnedExpressionParserRuleCall_2_1_0()); }
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
		{ before(grammarAccess.getSlangReadsAccess().getExprsOwnedExpressionParserRuleCall_1_0()); }
		ruleOwnedExpression
		{ after(grammarAccess.getSlangReadsAccess().getExprsOwnedExpressionParserRuleCall_1_0()); }
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
		{ before(grammarAccess.getSlangReadsAccess().getExprsOwnedExpressionParserRuleCall_2_1_0()); }
		ruleOwnedExpression
		{ after(grammarAccess.getSlangReadsAccess().getExprsOwnedExpressionParserRuleCall_2_1_0()); }
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
		{ before(grammarAccess.getSlangModifiesAccess().getExprsOwnedExpressionParserRuleCall_1_0()); }
		ruleOwnedExpression
		{ after(grammarAccess.getSlangModifiesAccess().getExprsOwnedExpressionParserRuleCall_1_0()); }
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
		{ before(grammarAccess.getSlangModifiesAccess().getExprsOwnedExpressionParserRuleCall_2_1_0()); }
		ruleOwnedExpression
		{ after(grammarAccess.getSlangModifiesAccess().getExprsOwnedExpressionParserRuleCall_2_1_0()); }
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
		{ before(grammarAccess.getSlangEnsuresAccess().getExprsOwnedExpressionParserRuleCall_1_0()); }
		ruleOwnedExpression
		{ after(grammarAccess.getSlangEnsuresAccess().getExprsOwnedExpressionParserRuleCall_1_0()); }
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
		{ before(grammarAccess.getSlangEnsuresAccess().getExprsOwnedExpressionParserRuleCall_2_1_0()); }
		ruleOwnedExpression
		{ after(grammarAccess.getSlangEnsuresAccess().getExprsOwnedExpressionParserRuleCall_2_1_0()); }
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
			{ before(grammarAccess.getSlangBaseTypeAccess().getTypeNameDataSubcomponentTypeQualifiedNameParserRuleCall_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getSlangBaseTypeAccess().getTypeNameDataSubcomponentTypeQualifiedNameParserRuleCall_0_1()); }
		)
		{ after(grammarAccess.getSlangBaseTypeAccess().getTypeNameDataSubcomponentTypeCrossReference_0()); }
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
		{ before(grammarAccess.getSlangStmtAccess().getCondOwnedExpressionParserRuleCall_1_2_0()); }
		ruleOwnedExpression
		{ after(grammarAccess.getSlangStmtAccess().getCondOwnedExpressionParserRuleCall_1_2_0()); }
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
		{ before(grammarAccess.getSlangStmtAccess().getCondOwnedExpressionParserRuleCall_2_2_0()); }
		ruleOwnedExpression
		{ after(grammarAccess.getSlangStmtAccess().getCondOwnedExpressionParserRuleCall_2_2_0()); }
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
		{ before(grammarAccess.getSlangStmtAccess().getTestExprOwnedExpressionParserRuleCall_3_2_0()); }
		ruleOwnedExpression
		{ after(grammarAccess.getSlangStmtAccess().getTestExprOwnedExpressionParserRuleCall_3_2_0()); }
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
		{ before(grammarAccess.getSlangStmtAccess().getEOwnedExpressionParserRuleCall_5_2_0()); }
		ruleOwnedExpression
		{ after(grammarAccess.getSlangStmtAccess().getEOwnedExpressionParserRuleCall_5_2_0()); }
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
		{ before(grammarAccess.getSlangStmtAccess().getEOwnedExpressionParserRuleCall_6_2_0()); }
		ruleOwnedExpression
		{ after(grammarAccess.getSlangStmtAccess().getEOwnedExpressionParserRuleCall_6_2_0()); }
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
		{ before(grammarAccess.getSlangStmtAccess().getEOwnedExpressionParserRuleCall_8_2_0()); }
		ruleOwnedExpression
		{ after(grammarAccess.getSlangStmtAccess().getEOwnedExpressionParserRuleCall_8_2_0()); }
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
		{ before(grammarAccess.getSlangElseAccess().getCondOwnedExpressionParserRuleCall_1_0_1_0()); }
		ruleOwnedExpression
		{ after(grammarAccess.getSlangElseAccess().getCondOwnedExpressionParserRuleCall_1_0_1_0()); }
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
		{ before(grammarAccess.getSlangCaseAccess().getEOwnedExpressionParserRuleCall_2_1_0()); }
		ruleOwnedExpression
		{ after(grammarAccess.getSlangCaseAccess().getEOwnedExpressionParserRuleCall_2_1_0()); }
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
		{ before(grammarAccess.getSlangVarDefAccess().getInitOwnedExpressionParserRuleCall_4_0()); }
		ruleOwnedExpression
		{ after(grammarAccess.getSlangVarDefAccess().getInitOwnedExpressionParserRuleCall_4_0()); }
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

rule__SlangExpression__IfCondAssignment_1_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangExpressionAccess().getIfCondImpliesExpressionParserRuleCall_1_3_0()); }
		ruleImpliesExpression
		{ after(grammarAccess.getSlangExpressionAccess().getIfCondImpliesExpressionParserRuleCall_1_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpression__ThenExprAssignment_1_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangExpressionAccess().getThenExprOwnedExpressionParserRuleCall_1_5_0()); }
		ruleOwnedExpression
		{ after(grammarAccess.getSlangExpressionAccess().getThenExprOwnedExpressionParserRuleCall_1_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpression__ElseExprAssignment_1_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangExpressionAccess().getElseExprOwnedExpressionParserRuleCall_1_7_0()); }
		ruleOwnedExpression
		{ after(grammarAccess.getSlangExpressionAccess().getElseExprOwnedExpressionParserRuleCall_1_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpression__QuantifierAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangExpressionAccess().getQuantifierAlternatives_2_1_0()); }
		(rule__SlangExpression__QuantifierAlternatives_2_1_0)
		{ after(grammarAccess.getSlangExpressionAccess().getQuantifierAlternatives_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpression__QuantRangeAssignment_2_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangExpressionAccess().getQuantRangeQuantRangeParserRuleCall_2_3_0()); }
		ruleQuantRange
		{ after(grammarAccess.getSlangExpressionAccess().getQuantRangeQuantRangeParserRuleCall_2_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpression__QuantParamAssignment_2_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangExpressionAccess().getQuantParamQuantParamParserRuleCall_2_6_0()); }
		ruleQuantParam
		{ after(grammarAccess.getSlangExpressionAccess().getQuantParamQuantParamParserRuleCall_2_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpression__QuantifiedExprAssignment_2_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangExpressionAccess().getQuantifiedExprOwnedExpressionParserRuleCall_2_8_0()); }
		ruleOwnedExpression
		{ after(grammarAccess.getSlangExpressionAccess().getQuantifiedExprOwnedExpressionParserRuleCall_2_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__QuantRange__LoAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getQuantRangeAccess().getLoOwnedExpressionParserRuleCall_0_0()); }
		ruleOwnedExpression
		{ after(grammarAccess.getQuantRangeAccess().getLoOwnedExpressionParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__QuantRange__ExtentAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getQuantRangeAccess().getExtentAlternatives_1_0()); }
		(rule__QuantRange__ExtentAlternatives_1_0)
		{ after(grammarAccess.getQuantRangeAccess().getExtentAlternatives_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__QuantRange__HighAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getQuantRangeAccess().getHighOwnedExpressionParserRuleCall_2_0()); }
		ruleOwnedExpression
		{ after(grammarAccess.getQuantRangeAccess().getHighOwnedExpressionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__QuantParam__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getQuantParamAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getQuantParamAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__QuantParam__NameAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getQuantParamAccess().getNameIDTerminalRuleCall_1_1_0()); }
		RULE_ID
		{ after(grammarAccess.getQuantParamAccess().getNameIDTerminalRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__QuantParam__TypeNameAssignment_1_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getQuantParamAccess().getTypeNameSlangTypeParserRuleCall_1_3_0()); }
		ruleSlangType
		{ after(grammarAccess.getQuantParamAccess().getTypeNameSlangTypeParserRuleCall_1_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImpliesExpression__OpAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImpliesExpressionAccess().getOpImpliesOpsParserRuleCall_1_1_0()); }
		ruleImpliesOps
		{ after(grammarAccess.getImpliesExpressionAccess().getOpImpliesOpsParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImpliesExpression__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImpliesExpressionAccess().getRightOrExpressionParserRuleCall_1_2_0()); }
		ruleOrExpression
		{ after(grammarAccess.getImpliesExpressionAccess().getRightOrExpressionParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpression__OpAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOrExpressionAccess().getOpOR_OPSTerminalRuleCall_1_1_0()); }
		RULE_OR_OPS
		{ after(grammarAccess.getOrExpressionAccess().getOpOR_OPSTerminalRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpression__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); }
		ruleAndExpression
		{ after(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpression__OpAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAndExpressionAccess().getOpAND_OPSTerminalRuleCall_1_1_0()); }
		RULE_AND_OPS
		{ after(grammarAccess.getAndExpressionAccess().getOpAND_OPSTerminalRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpression__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAndExpressionAccess().getRightEqualNotExpressionParserRuleCall_1_2_0()); }
		ruleEqualNotExpression
		{ after(grammarAccess.getAndExpressionAccess().getRightEqualNotExpressionParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EqualNotExpression__OpAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEqualNotExpressionAccess().getOpEQUAL_NOT_OPSTerminalRuleCall_1_1_0()); }
		RULE_EQUAL_NOT_OPS
		{ after(grammarAccess.getEqualNotExpressionAccess().getOpEQUAL_NOT_OPSTerminalRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EqualNotExpression__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEqualNotExpressionAccess().getRightLtGtExpressionParserRuleCall_1_2_0()); }
		ruleLtGtExpression
		{ after(grammarAccess.getEqualNotExpressionAccess().getRightLtGtExpressionParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LtGtExpression__OpAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLtGtExpressionAccess().getOpLT_GT_OPSTerminalRuleCall_1_1_0()); }
		RULE_LT_GT_OPS
		{ after(grammarAccess.getLtGtExpressionAccess().getOpLT_GT_OPSTerminalRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LtGtExpression__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLtGtExpressionAccess().getRightColonExpressionParserRuleCall_1_2_0()); }
		ruleColonExpression
		{ after(grammarAccess.getLtGtExpressionAccess().getRightColonExpressionParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ColonExpression__OpAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getColonExpressionAccess().getOpCOLON_OPTerminalRuleCall_1_1_0()); }
		RULE_COLON_OP
		{ after(grammarAccess.getColonExpressionAccess().getOpCOLON_OPTerminalRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ColonExpression__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getColonExpressionAccess().getRightPlusMinusExpressionParserRuleCall_1_2_0()); }
		rulePlusMinusExpression
		{ after(grammarAccess.getColonExpressionAccess().getRightPlusMinusExpressionParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusMinusExpression__OpAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPlusMinusExpressionAccess().getOpPlusMinusOpsParserRuleCall_1_1_0()); }
		rulePlusMinusOps
		{ after(grammarAccess.getPlusMinusExpressionAccess().getOpPlusMinusOpsParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusMinusExpression__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPlusMinusExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_2_0()); }
		ruleMultiplicativeExpression
		{ after(grammarAccess.getPlusMinusExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiplicativeExpression__OpAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMultiplicativeExpressionAccess().getOpMultiplicativeOpParserRuleCall_1_1_0()); }
		ruleMultiplicativeOp
		{ after(grammarAccess.getMultiplicativeExpressionAccess().getOpMultiplicativeOpParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiplicativeExpression__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMultiplicativeExpressionAccess().getRightUnaryExpressionParserRuleCall_1_2_0()); }
		ruleUnaryExpression
		{ after(grammarAccess.getMultiplicativeExpressionAccess().getRightUnaryExpressionParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnaryExpression__OpAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnaryExpressionAccess().getOpUnaryOpParserRuleCall_0_1_0()); }
		ruleUnaryOp
		{ after(grammarAccess.getUnaryExpressionAccess().getOpUnaryOpParserRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnaryExpression__ExpAssignment_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnaryExpressionAccess().getExpPrimaryExprParserRuleCall_0_2_0()); }
		rulePrimaryExpr
		{ after(grammarAccess.getUnaryExpressionAccess().getExpPrimaryExprParserRuleCall_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryExpr__BaseExpAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimaryExprAccess().getBaseExpAccessibleBaseExprParserRuleCall_1_1_0()); }
		ruleAccessibleBaseExpr
		{ after(grammarAccess.getPrimaryExprAccess().getBaseExpAccessibleBaseExprParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryExpr__PostsAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimaryExprAccess().getPostsPostfixParserRuleCall_1_2_0()); }
		rulePostfix
		{ after(grammarAccess.getPrimaryExprAccess().getPostsPostfixParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__LitAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBaseExprAccess().getLitSlangLitParserRuleCall_0_1_0()); }
		ruleSlangLit
		{ after(grammarAccess.getBaseExprAccess().getLitSlangLitParserRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__IAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBaseExprAccess().getISlangInterpParserRuleCall_1_1_0()); }
		ruleSlangInterp
		{ after(grammarAccess.getBaseExprAccess().getISlangInterpParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__StateVarAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBaseExprAccess().getStateVarStateVarDeclCrossReference_2_1_0()); }
		(
			{ before(grammarAccess.getBaseExprAccess().getStateVarStateVarDeclIDTerminalRuleCall_2_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getBaseExprAccess().getStateVarStateVarDeclIDTerminalRuleCall_2_1_0_1()); }
		)
		{ after(grammarAccess.getBaseExprAccess().getStateVarStateVarDeclCrossReference_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__EventPortAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBaseExprAccess().getEventPortPortCrossReference_3_1_0()); }
		(
			{ before(grammarAccess.getBaseExprAccess().getEventPortPortIDTerminalRuleCall_3_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getBaseExprAccess().getEventPortPortIDTerminalRuleCall_3_1_0_1()); }
		)
		{ after(grammarAccess.getBaseExprAccess().getEventPortPortCrossReference_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__ValueAssignment_3_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBaseExprAccess().getValueOwnedExpressionParserRuleCall_3_2_1_0()); }
		ruleOwnedExpression
		{ after(grammarAccess.getBaseExprAccess().getValueOwnedExpressionParserRuleCall_3_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__EventPortAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBaseExprAccess().getEventPortPortCrossReference_4_1_0()); }
		(
			{ before(grammarAccess.getBaseExprAccess().getEventPortPortIDTerminalRuleCall_4_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getBaseExprAccess().getEventPortPortIDTerminalRuleCall_4_1_0_1()); }
		)
		{ after(grammarAccess.getBaseExprAccess().getEventPortPortCrossReference_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__ValueAssignment_4_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBaseExprAccess().getValueOwnedExpressionParserRuleCall_4_2_1_0()); }
		ruleOwnedExpression
		{ after(grammarAccess.getBaseExprAccess().getValueOwnedExpressionParserRuleCall_4_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__EventPortAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBaseExprAccess().getEventPortPortCrossReference_5_1_0()); }
		(
			{ before(grammarAccess.getBaseExprAccess().getEventPortPortIDTerminalRuleCall_5_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getBaseExprAccess().getEventPortPortIDTerminalRuleCall_5_1_0_1()); }
		)
		{ after(grammarAccess.getBaseExprAccess().getEventPortPortCrossReference_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__EventPortAssignment_6_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBaseExprAccess().getEventPortPortCrossReference_6_1_0()); }
		(
			{ before(grammarAccess.getBaseExprAccess().getEventPortPortIDTerminalRuleCall_6_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getBaseExprAccess().getEventPortPortIDTerminalRuleCall_6_1_0_1()); }
		)
		{ after(grammarAccess.getBaseExprAccess().getEventPortPortCrossReference_6_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__EnumTypeAssignment_7_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBaseExprAccess().getEnumTypeDataClassifierCrossReference_7_0_1_0()); }
		(
			{ before(grammarAccess.getBaseExprAccess().getEnumTypeDataClassifierQCLREFParserRuleCall_7_0_1_0_1()); }
			ruleQCLREF
			{ after(grammarAccess.getBaseExprAccess().getEnumTypeDataClassifierQCLREFParserRuleCall_7_0_1_0_1()); }
		)
		{ after(grammarAccess.getBaseExprAccess().getEnumTypeDataClassifierCrossReference_7_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__ValueAssignment_7_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBaseExprAccess().getValueStringLiteralCrossReference_7_1_0()); }
		(
			{ before(grammarAccess.getBaseExprAccess().getValueStringLiteralIDTerminalRuleCall_7_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getBaseExprAccess().getValueStringLiteralIDTerminalRuleCall_7_1_0_1()); }
		)
		{ after(grammarAccess.getBaseExprAccess().getValueStringLiteralCrossReference_7_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__ExpAssignment_9_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBaseExprAccess().getExpOwnedExpressionParserRuleCall_9_2_0()); }
		ruleOwnedExpression
		{ after(grammarAccess.getBaseExprAccess().getExpOwnedExpressionParserRuleCall_9_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__RAssignment_10_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBaseExprAccess().getRSlangForRangeParserRuleCall_10_2_0()); }
		ruleSlangForRange
		{ after(grammarAccess.getBaseExprAccess().getRSlangForRangeParserRuleCall_10_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__RAssignment_10_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBaseExprAccess().getRSlangForRangeParserRuleCall_10_3_1_0()); }
		ruleSlangForRange
		{ after(grammarAccess.getBaseExprAccess().getRSlangForRangeParserRuleCall_10_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__BAssignment_10_5_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBaseExprAccess().getBSlangBlockParserRuleCall_10_5_0_0()); }
		ruleSlangBlock
		{ after(grammarAccess.getBaseExprAccess().getBSlangBlockParserRuleCall_10_5_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__EAssignment_10_5_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBaseExprAccess().getEOwnedExpressionParserRuleCall_10_5_1_1_0()); }
		ruleOwnedExpression
		{ after(grammarAccess.getBaseExprAccess().getEOwnedExpressionParserRuleCall_10_5_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__PAssignment_11_2_0_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBaseExprAccess().getPSlangParamsParserRuleCall_11_2_0_0_0_0()); }
		ruleSlangParams
		{ after(grammarAccess.getBaseExprAccess().getPSlangParamsParserRuleCall_11_2_0_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__EAssignment_11_2_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBaseExprAccess().getEOwnedExpressionParserRuleCall_11_2_0_1_0()); }
		ruleOwnedExpression
		{ after(grammarAccess.getBaseExprAccess().getEOwnedExpressionParserRuleCall_11_2_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__StmtAssignment_11_2_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBaseExprAccess().getStmtSlangStmtParserRuleCall_11_2_1_0_0()); }
		ruleSlangStmt
		{ after(grammarAccess.getBaseExprAccess().getStmtSlangStmtParserRuleCall_11_2_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseExpr__RAssignment_11_2_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBaseExprAccess().getRSlangRetParserRuleCall_11_2_1_1_0()); }
		ruleSlangRet
		{ after(grammarAccess.getBaseExprAccess().getRSlangRetParserRuleCall_11_2_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FloatObjectExpr__AttrAssignment_0_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFloatObjectExprAccess().getAttrIDTerminalRuleCall_0_3_0()); }
		RULE_ID
		{ after(grammarAccess.getFloatObjectExprAccess().getAttrIDTerminalRuleCall_0_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FloatObjectExpr__AttrAssignment_1_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFloatObjectExprAccess().getAttrIDTerminalRuleCall_1_3_0()); }
		RULE_ID
		{ after(grammarAccess.getFloatObjectExprAccess().getAttrIDTerminalRuleCall_1_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AccessibleBaseExpr__IdAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAccessibleBaseExprAccess().getIdEObjectCrossReference_0_1_0()); }
		(
			{ before(grammarAccess.getAccessibleBaseExprAccess().getIdEObjectQualifiedAADLNameParserRuleCall_0_1_0_1()); }
			ruleQualifiedAADLName
			{ after(grammarAccess.getAccessibleBaseExprAccess().getIdEObjectQualifiedAADLNameParserRuleCall_0_1_0_1()); }
		)
		{ after(grammarAccess.getAccessibleBaseExprAccess().getIdEObjectCrossReference_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AccessibleBaseExpr__CallSuffixAssignment_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAccessibleBaseExprAccess().getCallSuffixSlangCallSuffixParserRuleCall_0_2_0()); }
		ruleSlangCallSuffix
		{ after(grammarAccess.getAccessibleBaseExprAccess().getCallSuffixSlangCallSuffixParserRuleCall_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AccessibleBaseExpr__RecordTypeAssignment_1_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAccessibleBaseExprAccess().getRecordTypeDataElementParserRuleCall_1_0_1_0()); }
		ruleDataElement
		{ after(grammarAccess.getAccessibleBaseExprAccess().getRecordTypeDataElementParserRuleCall_1_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AccessibleBaseExpr__ArgsAssignment_1_0_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAccessibleBaseExprAccess().getArgsNamedElementCrossReference_1_0_3_0()); }
		(
			{ before(grammarAccess.getAccessibleBaseExprAccess().getArgsNamedElementIDTerminalRuleCall_1_0_3_0_1()); }
			RULE_ID
			{ after(grammarAccess.getAccessibleBaseExprAccess().getArgsNamedElementIDTerminalRuleCall_1_0_3_0_1()); }
		)
		{ after(grammarAccess.getAccessibleBaseExprAccess().getArgsNamedElementCrossReference_1_0_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AccessibleBaseExpr__ArgExprAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAccessibleBaseExprAccess().getArgExprOwnedExpressionParserRuleCall_1_1_0()); }
		ruleOwnedExpression
		{ after(grammarAccess.getAccessibleBaseExprAccess().getArgExprOwnedExpressionParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AccessibleBaseExpr__ArgsAssignment_1_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAccessibleBaseExprAccess().getArgsNamedElementCrossReference_1_2_1_0()); }
		(
			{ before(grammarAccess.getAccessibleBaseExprAccess().getArgsNamedElementIDTerminalRuleCall_1_2_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getAccessibleBaseExprAccess().getArgsNamedElementIDTerminalRuleCall_1_2_1_0_1()); }
		)
		{ after(grammarAccess.getAccessibleBaseExprAccess().getArgsNamedElementCrossReference_1_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AccessibleBaseExpr__ArgExprAssignment_1_2_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAccessibleBaseExprAccess().getArgExprOwnedExpressionParserRuleCall_1_2_3_0()); }
		ruleOwnedExpression
		{ after(grammarAccess.getAccessibleBaseExprAccess().getArgExprOwnedExpressionParserRuleCall_1_2_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AccessibleBaseExpr__PortOrSubcomponentOrStateVarAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAccessibleBaseExprAccess().getPortOrSubcomponentOrStateVarEObjectCrossReference_2_1_0()); }
		(
			{ before(grammarAccess.getAccessibleBaseExprAccess().getPortOrSubcomponentOrStateVarEObjectIDTerminalRuleCall_2_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getAccessibleBaseExprAccess().getPortOrSubcomponentOrStateVarEObjectIDTerminalRuleCall_2_1_0_1()); }
		)
		{ after(grammarAccess.getAccessibleBaseExprAccess().getPortOrSubcomponentOrStateVarEObjectCrossReference_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MemberAccess__FieldAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMemberAccessAccess().getFieldIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getMemberAccessAccess().getFieldIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayAccess__IndexAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getArrayAccessAccess().getIndexOwnedExpressionParserRuleCall_2_0_0()); }
		ruleOwnedExpression
		{ after(grammarAccess.getArrayAccessAccess().getIndexOwnedExpressionParserRuleCall_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayAccess__IndexAssignment_2_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getArrayAccessAccess().getIndexOwnedExpressionParserRuleCall_2_1_1_0()); }
		ruleOwnedExpression
		{ after(grammarAccess.getArrayAccessAccess().getIndexOwnedExpressionParserRuleCall_2_1_1_0()); }
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
		{ before(grammarAccess.getSlangForRangeAccess().getEOwnedExpressionParserRuleCall_2_0()); }
		ruleOwnedExpression
		{ after(grammarAccess.getSlangForRangeAccess().getEOwnedExpressionParserRuleCall_2_0()); }
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
		{ before(grammarAccess.getSlangForRangeAccess().getUpperOwnedExpressionParserRuleCall_3_1_0()); }
		ruleOwnedExpression
		{ after(grammarAccess.getSlangForRangeAccess().getUpperOwnedExpressionParserRuleCall_3_1_0()); }
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
		{ before(grammarAccess.getSlangForRangeAccess().getStepOwnedExpressionParserRuleCall_3_2_1_0()); }
		ruleOwnedExpression
		{ after(grammarAccess.getSlangForRangeAccess().getStepOwnedExpressionParserRuleCall_3_2_1_0()); }
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
		{ before(grammarAccess.getSlangRetAccess().getEOwnedExpressionParserRuleCall_2_0()); }
		ruleOwnedExpression
		{ after(grammarAccess.getSlangRetAccess().getEOwnedExpressionParserRuleCall_2_0()); }
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
		{ before(grammarAccess.getSlangCallArgsAccess().getArgOwnedExpressionParserRuleCall_2_0_0()); }
		ruleOwnedExpression
		{ after(grammarAccess.getSlangCallArgsAccess().getArgOwnedExpressionParserRuleCall_2_0_0()); }
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
		{ before(grammarAccess.getSlangCallArgsAccess().getArgOwnedExpressionParserRuleCall_2_1_1_0()); }
		ruleOwnedExpression
		{ after(grammarAccess.getSlangCallArgsAccess().getArgOwnedExpressionParserRuleCall_2_1_1_0()); }
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
		{ before(grammarAccess.getSlangLitAccess().getValueHEXTerminalRuleCall_2_1_0()); }
		RULE_HEX
		{ after(grammarAccess.getSlangLitAccess().getValueHEXTerminalRuleCall_2_1_0()); }
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
		{ before(grammarAccess.getSlangLitAccess().getValueBINTerminalRuleCall_3_1_0()); }
		RULE_BIN
		{ after(grammarAccess.getSlangLitAccess().getValueBINTerminalRuleCall_3_1_0()); }
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
		{ before(grammarAccess.getSlangLitAccess().getValueF32_LITTerminalRuleCall_4_1_0()); }
		RULE_F32_LIT
		{ after(grammarAccess.getSlangLitAccess().getValueF32_LITTerminalRuleCall_4_1_0()); }
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
		{ before(grammarAccess.getSlangLitAccess().getValueAlternatives_5_1_0()); }
		(rule__SlangLit__ValueAlternatives_5_1_0)
		{ after(grammarAccess.getSlangLitAccess().getValueAlternatives_5_1_0()); }
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
		{ before(grammarAccess.getSlangLitAccess().getValueSTRING_VALUETerminalRuleCall_6_1_0()); }
		RULE_STRING_VALUE
		{ after(grammarAccess.getSlangLitAccess().getValueSTRING_VALUETerminalRuleCall_6_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangInterp__SliAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangInterpAccess().getSliSLITerminalRuleCall_1_0()); }
		RULE_SLI
		{ after(grammarAccess.getSlangInterpAccess().getSliSLITerminalRuleCall_1_0()); }
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
