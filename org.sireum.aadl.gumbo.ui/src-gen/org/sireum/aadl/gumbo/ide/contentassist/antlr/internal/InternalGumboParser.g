
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
		tokenNameToValue.put("PercentSign", "'\%'");
		tokenNameToValue.put("LeftParenthesis", "'('");
		tokenNameToValue.put("RightParenthesis", "')'");
		tokenNameToValue.put("Asterisk", "'*'");
		tokenNameToValue.put("PlusSign", "'+'");
		tokenNameToValue.put("Comma", "','");
		tokenNameToValue.put("HyphenMinus", "'-'");
		tokenNameToValue.put("FullStop", "'.'");
		tokenNameToValue.put("Solidus", "'/'");
		tokenNameToValue.put("Colon", "':'");
		tokenNameToValue.put("Semicolon", "';'");
		tokenNameToValue.put("LessThanSign", "'<'");
		tokenNameToValue.put("EqualsSign", "'='");
		tokenNameToValue.put("GreaterThanSign", "'>'");
		tokenNameToValue.put("LeftSquareBracket", "'['");
		tokenNameToValue.put("RightSquareBracket", "']'");
		tokenNameToValue.put("CircumflexAccent", "'^'");
		tokenNameToValue.put("LeftCurlyBracket", "'{'");
		tokenNameToValue.put("RightCurlyBracket", "'}'");
		tokenNameToValue.put("FullStopFullStop", "'..'");
		tokenNameToValue.put("ColonColon", "'::'");
		tokenNameToValue.put("LessThanSignEqualsSign", "'<='");
		tokenNameToValue.put("LessThanSignGreaterThanSign", "'<>'");
		tokenNameToValue.put("EqualsSignGreaterThanSign", "'=>'");
		tokenNameToValue.put("GreaterThanSignEqualsSign", "'>='");
		tokenNameToValue.put("In", "'in'");
		tokenNameToValue.put("Or", "'or'");
		tokenNameToValue.put("To", "'to'");
		tokenNameToValue.put("PlusSignEqualsSignGreaterThanSign", "'+=>'");
		tokenNameToValue.put("And", "'and'");
		tokenNameToValue.put("For", "'for'");
		tokenNameToValue.put("Inv", "'inv'");
		tokenNameToValue.put("Not", "'not'");
		tokenNameToValue.put("Var", "'var'");
		tokenNameToValue.put("Case", "'case'");
		tokenNameToValue.put("Port", "'port'");
		tokenNameToValue.put("True", "'true'");
		tokenNameToValue.put("Delta", "'delta'");
		tokenNameToValue.put("False", "'false'");
		tokenNameToValue.put("Gumbo", "'gumbo'");
		tokenNameToValue.put("Modes", "'modes'");
		tokenNameToValue.put("State", "'state'");
		tokenNameToValue.put("Assume", "'assume'");
		tokenNameToValue.put("Orelse", "'orelse'");
		tokenNameToValue.put("Andthen", "'andthen'");
		tokenNameToValue.put("Applies", "'applies'");
		tokenNameToValue.put("Binding", "'binding'");
		tokenNameToValue.put("Compute", "'compute'");
		tokenNameToValue.put("Implies", "'implies'");
		tokenNameToValue.put("Library", "'library'");
		tokenNameToValue.put("Constant", "'constant'");
		tokenNameToValue.put("Guarantee", "'guarantee'");
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
		{ before(grammarAccess.getInitializeSpecStatementAccess().getGuaranteeStatementParserRuleCall()); }
		ruleGuaranteeStatement
		{ after(grammarAccess.getInitializeSpecStatementAccess().getGuaranteeStatementParserRuleCall()); }
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
		{ before(grammarAccess.getExprAccess().getImpliesExprParserRuleCall()); }
		ruleImpliesExpr
		{ after(grammarAccess.getExprAccess().getImpliesExprParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleImpliesExpr
entryRuleImpliesExpr
:
{ before(grammarAccess.getImpliesExprRule()); }
	 ruleImpliesExpr
{ after(grammarAccess.getImpliesExprRule()); } 
	 EOF 
;

// Rule ImpliesExpr
ruleImpliesExpr 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getImpliesExprAccess().getGroup()); }
		(rule__ImpliesExpr__Group__0)
		{ after(grammarAccess.getImpliesExprAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOrExpr
entryRuleOrExpr
:
{ before(grammarAccess.getOrExprRule()); }
	 ruleOrExpr
{ after(grammarAccess.getOrExprRule()); } 
	 EOF 
;

// Rule OrExpr
ruleOrExpr 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOrExprAccess().getGroup()); }
		(rule__OrExpr__Group__0)
		{ after(grammarAccess.getOrExprAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAndExpr
entryRuleAndExpr
:
{ before(grammarAccess.getAndExprRule()); }
	 ruleAndExpr
{ after(grammarAccess.getAndExprRule()); } 
	 EOF 
;

// Rule AndExpr
ruleAndExpr 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAndExprAccess().getGroup()); }
		(rule__AndExpr__Group__0)
		{ after(grammarAccess.getAndExprAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRelationalOp
entryRuleRelationalOp
:
{ before(grammarAccess.getRelationalOpRule()); }
	 ruleRelationalOp
{ after(grammarAccess.getRelationalOpRule()); } 
	 EOF 
;

// Rule RelationalOp
ruleRelationalOp 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRelationalOpAccess().getAlternatives()); }
		(rule__RelationalOp__Alternatives)
		{ after(grammarAccess.getRelationalOpAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRelationalExpr
entryRuleRelationalExpr
:
{ before(grammarAccess.getRelationalExprRule()); }
	 ruleRelationalExpr
{ after(grammarAccess.getRelationalExprRule()); } 
	 EOF 
;

// Rule RelationalExpr
ruleRelationalExpr 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRelationalExprAccess().getGroup()); }
		(rule__RelationalExpr__Group__0)
		{ after(grammarAccess.getRelationalExprAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePlusExpr
entryRulePlusExpr
:
{ before(grammarAccess.getPlusExprRule()); }
	 rulePlusExpr
{ after(grammarAccess.getPlusExprRule()); } 
	 EOF 
;

// Rule PlusExpr
rulePlusExpr 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPlusExprAccess().getGroup()); }
		(rule__PlusExpr__Group__0)
		{ after(grammarAccess.getPlusExprAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTimesExpr
entryRuleTimesExpr
:
{ before(grammarAccess.getTimesExprRule()); }
	 ruleTimesExpr
{ after(grammarAccess.getTimesExprRule()); } 
	 EOF 
;

// Rule TimesExpr
ruleTimesExpr 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTimesExprAccess().getGroup()); }
		(rule__TimesExpr__Group__0)
		{ after(grammarAccess.getTimesExprAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExpExpr
entryRuleExpExpr
:
{ before(grammarAccess.getExpExprRule()); }
	 ruleExpExpr
{ after(grammarAccess.getExpExprRule()); } 
	 EOF 
;

// Rule ExpExpr
ruleExpExpr 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExpExprAccess().getGroup()); }
		(rule__ExpExpr__Group__0)
		{ after(grammarAccess.getExpExprAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePrefixExpr
entryRulePrefixExpr
:
{ before(grammarAccess.getPrefixExprRule()); }
	 rulePrefixExpr
{ after(grammarAccess.getPrefixExprRule()); } 
	 EOF 
;

// Rule PrefixExpr
rulePrefixExpr 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPrefixExprAccess().getAlternatives()); }
		(rule__PrefixExpr__Alternatives)
		{ after(grammarAccess.getPrefixExprAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAtomicExpr
entryRuleAtomicExpr
:
{ before(grammarAccess.getAtomicExprRule()); }
	 ruleAtomicExpr
{ after(grammarAccess.getAtomicExprRule()); } 
	 EOF 
;

// Rule AtomicExpr
ruleAtomicExpr 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAtomicExprAccess().getAlternatives()); }
		(rule__AtomicExpr__Alternatives)
		{ after(grammarAccess.getAtomicExprAccess().getAlternatives()); }
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

rule__ImpliesExpr__Alternatives_1_0_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImpliesExprAccess().getEqualsSignGreaterThanSignKeyword_1_0_0_1_0()); }
		EqualsSignGreaterThanSign
		{ after(grammarAccess.getImpliesExprAccess().getEqualsSignGreaterThanSignKeyword_1_0_0_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getImpliesExprAccess().getImpliesKeyword_1_0_0_1_1()); }
		Implies
		{ after(grammarAccess.getImpliesExprAccess().getImpliesKeyword_1_0_0_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpr__Alternatives_1_0_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOrExprAccess().getOpAssignment_1_0_0_1_0()); }
		(rule__OrExpr__OpAssignment_1_0_0_1_0)
		{ after(grammarAccess.getOrExprAccess().getOpAssignment_1_0_0_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getOrExprAccess().getOpAssignment_1_0_0_1_1()); }
		(rule__OrExpr__OpAssignment_1_0_0_1_1)
		{ after(grammarAccess.getOrExprAccess().getOpAssignment_1_0_0_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpr__Alternatives_1_0_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAndExprAccess().getOpAssignment_1_0_0_1_0()); }
		(rule__AndExpr__OpAssignment_1_0_0_1_0)
		{ after(grammarAccess.getAndExprAccess().getOpAssignment_1_0_0_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getAndExprAccess().getOpAssignment_1_0_0_1_1()); }
		(rule__AndExpr__OpAssignment_1_0_0_1_1)
		{ after(grammarAccess.getAndExprAccess().getOpAssignment_1_0_0_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationalOp__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRelationalOpAccess().getLessThanSignKeyword_0()); }
		LessThanSign
		{ after(grammarAccess.getRelationalOpAccess().getLessThanSignKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getRelationalOpAccess().getLessThanSignEqualsSignKeyword_1()); }
		LessThanSignEqualsSign
		{ after(grammarAccess.getRelationalOpAccess().getLessThanSignEqualsSignKeyword_1()); }
	)
	|
	(
		{ before(grammarAccess.getRelationalOpAccess().getGreaterThanSignKeyword_2()); }
		GreaterThanSign
		{ after(grammarAccess.getRelationalOpAccess().getGreaterThanSignKeyword_2()); }
	)
	|
	(
		{ before(grammarAccess.getRelationalOpAccess().getGreaterThanSignEqualsSignKeyword_3()); }
		GreaterThanSignEqualsSign
		{ after(grammarAccess.getRelationalOpAccess().getGreaterThanSignEqualsSignKeyword_3()); }
	)
	|
	(
		{ before(grammarAccess.getRelationalOpAccess().getEqualsSignKeyword_4()); }
		EqualsSign
		{ after(grammarAccess.getRelationalOpAccess().getEqualsSignKeyword_4()); }
	)
	|
	(
		{ before(grammarAccess.getRelationalOpAccess().getLessThanSignGreaterThanSignKeyword_5()); }
		LessThanSignGreaterThanSign
		{ after(grammarAccess.getRelationalOpAccess().getLessThanSignGreaterThanSignKeyword_5()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusExpr__OpAlternatives_1_0_0_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPlusExprAccess().getOpPlusSignKeyword_1_0_0_1_0_0()); }
		PlusSign
		{ after(grammarAccess.getPlusExprAccess().getOpPlusSignKeyword_1_0_0_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getPlusExprAccess().getOpHyphenMinusKeyword_1_0_0_1_0_1()); }
		HyphenMinus
		{ after(grammarAccess.getPlusExprAccess().getOpHyphenMinusKeyword_1_0_0_1_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TimesExpr__OpAlternatives_1_0_0_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimesExprAccess().getOpAsteriskKeyword_1_0_0_1_0_0()); }
		Asterisk
		{ after(grammarAccess.getTimesExprAccess().getOpAsteriskKeyword_1_0_0_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getTimesExprAccess().getOpSolidusKeyword_1_0_0_1_0_1()); }
		Solidus
		{ after(grammarAccess.getTimesExprAccess().getOpSolidusKeyword_1_0_0_1_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getTimesExprAccess().getOpPercentSignKeyword_1_0_0_1_0_2()); }
		PercentSign
		{ after(grammarAccess.getTimesExprAccess().getOpPercentSignKeyword_1_0_0_1_0_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrefixExpr__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrefixExprAccess().getGroup_0()); }
		(rule__PrefixExpr__Group_0__0)
		{ after(grammarAccess.getPrefixExprAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getPrefixExprAccess().getAtomicExprParserRuleCall_1()); }
		ruleAtomicExpr
		{ after(grammarAccess.getPrefixExprAccess().getAtomicExprParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrefixExpr__OpAlternatives_0_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrefixExprAccess().getOpHyphenMinusKeyword_0_1_0_0()); }
		HyphenMinus
		{ after(grammarAccess.getPrefixExprAccess().getOpHyphenMinusKeyword_0_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getPrefixExprAccess().getOpNotKeyword_0_1_0_1()); }
		Not
		{ after(grammarAccess.getPrefixExprAccess().getOpNotKeyword_0_1_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicExprAccess().getGroup_0()); }
		(rule__AtomicExpr__Group_0__0)
		{ after(grammarAccess.getAtomicExprAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getAtomicExprAccess().getGroup_1()); }
		(rule__AtomicExpr__Group_1__0)
		{ after(grammarAccess.getAtomicExprAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getAtomicExprAccess().getGroup_2()); }
		(rule__AtomicExpr__Group_2__0)
		{ after(grammarAccess.getAtomicExprAccess().getGroup_2()); }
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
	{ before(grammarAccess.getSpecSectionAccess().getStateAssignment_0()); }
	(rule__SpecSection__StateAssignment_0)?
	{ after(grammarAccess.getSpecSectionAccess().getStateAssignment_0()); }
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
	{ before(grammarAccess.getSpecSectionAccess().getInvariantsAssignment_1()); }
	(rule__SpecSection__InvariantsAssignment_1)?
	{ after(grammarAccess.getSpecSectionAccess().getInvariantsAssignment_1()); }
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
	{ before(grammarAccess.getSpecSectionAccess().getIntegrationAssignment_2()); }
	(rule__SpecSection__IntegrationAssignment_2)?
	{ after(grammarAccess.getSpecSectionAccess().getIntegrationAssignment_2()); }
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
	{ before(grammarAccess.getSpecSectionAccess().getInitializeAssignment_3()); }
	(rule__SpecSection__InitializeAssignment_3)?
	{ after(grammarAccess.getSpecSectionAccess().getInitializeAssignment_3()); }
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
	{ before(grammarAccess.getSpecSectionAccess().getComputeAssignment_4()); }
	(rule__SpecSection__ComputeAssignment_4)?
	{ after(grammarAccess.getSpecSectionAccess().getComputeAssignment_4()); }
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
	{ before(grammarAccess.getInvSpecAccess().getDisplayNameAssignment_1()); }
	(rule__InvSpec__DisplayNameAssignment_1)
	{ after(grammarAccess.getInvSpecAccess().getDisplayNameAssignment_1()); }
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
	{ before(grammarAccess.getInvSpecAccess().getColonKeyword_2()); }
	Colon
	{ after(grammarAccess.getInvSpecAccess().getColonKeyword_2()); }
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
	{ before(grammarAccess.getInvSpecAccess().getExprAssignment_3()); }
	(rule__InvSpec__ExprAssignment_3)
	{ after(grammarAccess.getInvSpecAccess().getExprAssignment_3()); }
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
	{ before(grammarAccess.getInvSpecAccess().getSemicolonKeyword_4()); }
	Semicolon
	{ after(grammarAccess.getInvSpecAccess().getSemicolonKeyword_4()); }
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
	(
		{ before(grammarAccess.getInitializeAccess().getSpecsAssignment_1()); }
		(rule__Initialize__SpecsAssignment_1)
		{ after(grammarAccess.getInitializeAccess().getSpecsAssignment_1()); }
	)
	(
		{ before(grammarAccess.getInitializeAccess().getSpecsAssignment_1()); }
		(rule__Initialize__SpecsAssignment_1)*
		{ after(grammarAccess.getInitializeAccess().getSpecsAssignment_1()); }
	)
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
	(
		{ before(grammarAccess.getComputeAccess().getCasesAssignment_1()); }
		(rule__Compute__CasesAssignment_1)
		{ after(grammarAccess.getComputeAccess().getCasesAssignment_1()); }
	)
	(
		{ before(grammarAccess.getComputeAccess().getCasesAssignment_1()); }
		(rule__Compute__CasesAssignment_1)*
		{ after(grammarAccess.getComputeAccess().getCasesAssignment_1()); }
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
	{ before(grammarAccess.getCaseStatementClauseAccess().getDisplayNameAssignment_1()); }
	(rule__CaseStatementClause__DisplayNameAssignment_1)
	{ after(grammarAccess.getCaseStatementClauseAccess().getDisplayNameAssignment_1()); }
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
	{ before(grammarAccess.getCaseStatementClauseAccess().getColonKeyword_2()); }
	Colon
	{ after(grammarAccess.getCaseStatementClauseAccess().getColonKeyword_2()); }
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
	{ before(grammarAccess.getCaseStatementClauseAccess().getAssumeStatementAssignment_3()); }
	(rule__CaseStatementClause__AssumeStatementAssignment_3)
	{ after(grammarAccess.getCaseStatementClauseAccess().getAssumeStatementAssignment_3()); }
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
	{ before(grammarAccess.getCaseStatementClauseAccess().getGuaranteeStatementAssignment_4()); }
	(rule__CaseStatementClause__GuaranteeStatementAssignment_4)
	{ after(grammarAccess.getCaseStatementClauseAccess().getGuaranteeStatementAssignment_4()); }
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
	{ before(grammarAccess.getAssumeStatementAccess().getDisplayNameAssignment_1()); }
	(rule__AssumeStatement__DisplayNameAssignment_1)
	{ after(grammarAccess.getAssumeStatementAccess().getDisplayNameAssignment_1()); }
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
	{ before(grammarAccess.getAssumeStatementAccess().getColonKeyword_2()); }
	Colon
	{ after(grammarAccess.getAssumeStatementAccess().getColonKeyword_2()); }
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
	{ before(grammarAccess.getAssumeStatementAccess().getExprAssignment_3()); }
	(rule__AssumeStatement__ExprAssignment_3)
	{ after(grammarAccess.getAssumeStatementAccess().getExprAssignment_3()); }
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
	{ before(grammarAccess.getAssumeStatementAccess().getSemicolonKeyword_4()); }
	Semicolon
	{ after(grammarAccess.getAssumeStatementAccess().getSemicolonKeyword_4()); }
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
	{ before(grammarAccess.getGuaranteeStatementAccess().getDisplayNameAssignment_1()); }
	(rule__GuaranteeStatement__DisplayNameAssignment_1)
	{ after(grammarAccess.getGuaranteeStatementAccess().getDisplayNameAssignment_1()); }
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
	{ before(grammarAccess.getGuaranteeStatementAccess().getColonKeyword_2()); }
	Colon
	{ after(grammarAccess.getGuaranteeStatementAccess().getColonKeyword_2()); }
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
	{ before(grammarAccess.getGuaranteeStatementAccess().getExprAssignment_3()); }
	(rule__GuaranteeStatement__ExprAssignment_3)
	{ after(grammarAccess.getGuaranteeStatementAccess().getExprAssignment_3()); }
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
	{ before(grammarAccess.getGuaranteeStatementAccess().getSemicolonKeyword_4()); }
	Semicolon
	{ after(grammarAccess.getGuaranteeStatementAccess().getSemicolonKeyword_4()); }
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


rule__ImpliesExpr__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ImpliesExpr__Group__0__Impl
	rule__ImpliesExpr__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ImpliesExpr__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImpliesExprAccess().getOrExprParserRuleCall_0()); }
	ruleOrExpr
	{ after(grammarAccess.getImpliesExprAccess().getOrExprParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImpliesExpr__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ImpliesExpr__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ImpliesExpr__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImpliesExprAccess().getGroup_1()); }
	(rule__ImpliesExpr__Group_1__0)?
	{ after(grammarAccess.getImpliesExprAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ImpliesExpr__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ImpliesExpr__Group_1__0__Impl
	rule__ImpliesExpr__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ImpliesExpr__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImpliesExprAccess().getGroup_1_0()); }
	(rule__ImpliesExpr__Group_1_0__0)
	{ after(grammarAccess.getImpliesExprAccess().getGroup_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImpliesExpr__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ImpliesExpr__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ImpliesExpr__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImpliesExprAccess().getRightAssignment_1_1()); }
	(rule__ImpliesExpr__RightAssignment_1_1)
	{ after(grammarAccess.getImpliesExprAccess().getRightAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ImpliesExpr__Group_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ImpliesExpr__Group_1_0__0__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ImpliesExpr__Group_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImpliesExprAccess().getGroup_1_0_0()); }
	(rule__ImpliesExpr__Group_1_0_0__0)
	{ after(grammarAccess.getImpliesExprAccess().getGroup_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ImpliesExpr__Group_1_0_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ImpliesExpr__Group_1_0_0__0__Impl
	rule__ImpliesExpr__Group_1_0_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ImpliesExpr__Group_1_0_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImpliesExprAccess().getBinaryExprLeftAction_1_0_0_0()); }
	()
	{ after(grammarAccess.getImpliesExprAccess().getBinaryExprLeftAction_1_0_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImpliesExpr__Group_1_0_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ImpliesExpr__Group_1_0_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ImpliesExpr__Group_1_0_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImpliesExprAccess().getAlternatives_1_0_0_1()); }
	(rule__ImpliesExpr__Alternatives_1_0_0_1)
	{ after(grammarAccess.getImpliesExprAccess().getAlternatives_1_0_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OrExpr__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrExpr__Group__0__Impl
	rule__OrExpr__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpr__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrExprAccess().getAndExprParserRuleCall_0()); }
	ruleAndExpr
	{ after(grammarAccess.getOrExprAccess().getAndExprParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpr__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrExpr__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpr__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrExprAccess().getGroup_1()); }
	(rule__OrExpr__Group_1__0)*
	{ after(grammarAccess.getOrExprAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OrExpr__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrExpr__Group_1__0__Impl
	rule__OrExpr__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpr__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrExprAccess().getGroup_1_0()); }
	(rule__OrExpr__Group_1_0__0)
	{ after(grammarAccess.getOrExprAccess().getGroup_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpr__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrExpr__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpr__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrExprAccess().getRightAssignment_1_1()); }
	(rule__OrExpr__RightAssignment_1_1)
	{ after(grammarAccess.getOrExprAccess().getRightAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OrExpr__Group_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrExpr__Group_1_0__0__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpr__Group_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrExprAccess().getGroup_1_0_0()); }
	(rule__OrExpr__Group_1_0_0__0)
	{ after(grammarAccess.getOrExprAccess().getGroup_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OrExpr__Group_1_0_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrExpr__Group_1_0_0__0__Impl
	rule__OrExpr__Group_1_0_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpr__Group_1_0_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrExprAccess().getBinaryExprLeftAction_1_0_0_0()); }
	()
	{ after(grammarAccess.getOrExprAccess().getBinaryExprLeftAction_1_0_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpr__Group_1_0_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrExpr__Group_1_0_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpr__Group_1_0_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrExprAccess().getAlternatives_1_0_0_1()); }
	(rule__OrExpr__Alternatives_1_0_0_1)
	{ after(grammarAccess.getOrExprAccess().getAlternatives_1_0_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AndExpr__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndExpr__Group__0__Impl
	rule__AndExpr__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpr__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndExprAccess().getRelationalExprParserRuleCall_0()); }
	ruleRelationalExpr
	{ after(grammarAccess.getAndExprAccess().getRelationalExprParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpr__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndExpr__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpr__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndExprAccess().getGroup_1()); }
	(rule__AndExpr__Group_1__0)*
	{ after(grammarAccess.getAndExprAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AndExpr__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndExpr__Group_1__0__Impl
	rule__AndExpr__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpr__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndExprAccess().getGroup_1_0()); }
	(rule__AndExpr__Group_1_0__0)
	{ after(grammarAccess.getAndExprAccess().getGroup_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpr__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndExpr__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpr__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndExprAccess().getRightAssignment_1_1()); }
	(rule__AndExpr__RightAssignment_1_1)
	{ after(grammarAccess.getAndExprAccess().getRightAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AndExpr__Group_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndExpr__Group_1_0__0__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpr__Group_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndExprAccess().getGroup_1_0_0()); }
	(rule__AndExpr__Group_1_0_0__0)
	{ after(grammarAccess.getAndExprAccess().getGroup_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AndExpr__Group_1_0_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndExpr__Group_1_0_0__0__Impl
	rule__AndExpr__Group_1_0_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpr__Group_1_0_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndExprAccess().getBinaryExprLeftAction_1_0_0_0()); }
	()
	{ after(grammarAccess.getAndExprAccess().getBinaryExprLeftAction_1_0_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpr__Group_1_0_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndExpr__Group_1_0_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpr__Group_1_0_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndExprAccess().getAlternatives_1_0_0_1()); }
	(rule__AndExpr__Alternatives_1_0_0_1)
	{ after(grammarAccess.getAndExprAccess().getAlternatives_1_0_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RelationalExpr__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RelationalExpr__Group__0__Impl
	rule__RelationalExpr__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationalExpr__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationalExprAccess().getPlusExprParserRuleCall_0()); }
	rulePlusExpr
	{ after(grammarAccess.getRelationalExprAccess().getPlusExprParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationalExpr__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RelationalExpr__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationalExpr__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationalExprAccess().getGroup_1()); }
	(rule__RelationalExpr__Group_1__0)?
	{ after(grammarAccess.getRelationalExprAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RelationalExpr__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RelationalExpr__Group_1__0__Impl
	rule__RelationalExpr__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationalExpr__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationalExprAccess().getGroup_1_0()); }
	(rule__RelationalExpr__Group_1_0__0)
	{ after(grammarAccess.getRelationalExprAccess().getGroup_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationalExpr__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RelationalExpr__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationalExpr__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationalExprAccess().getRightAssignment_1_1()); }
	(rule__RelationalExpr__RightAssignment_1_1)
	{ after(grammarAccess.getRelationalExprAccess().getRightAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RelationalExpr__Group_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RelationalExpr__Group_1_0__0__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationalExpr__Group_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationalExprAccess().getGroup_1_0_0()); }
	(rule__RelationalExpr__Group_1_0_0__0)
	{ after(grammarAccess.getRelationalExprAccess().getGroup_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RelationalExpr__Group_1_0_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RelationalExpr__Group_1_0_0__0__Impl
	rule__RelationalExpr__Group_1_0_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationalExpr__Group_1_0_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationalExprAccess().getBinaryExprLeftAction_1_0_0_0()); }
	()
	{ after(grammarAccess.getRelationalExprAccess().getBinaryExprLeftAction_1_0_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationalExpr__Group_1_0_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RelationalExpr__Group_1_0_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationalExpr__Group_1_0_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationalExprAccess().getOpAssignment_1_0_0_1()); }
	(rule__RelationalExpr__OpAssignment_1_0_0_1)
	{ after(grammarAccess.getRelationalExprAccess().getOpAssignment_1_0_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PlusExpr__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlusExpr__Group__0__Impl
	rule__PlusExpr__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusExpr__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlusExprAccess().getTimesExprParserRuleCall_0()); }
	ruleTimesExpr
	{ after(grammarAccess.getPlusExprAccess().getTimesExprParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusExpr__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlusExpr__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusExpr__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlusExprAccess().getGroup_1()); }
	(rule__PlusExpr__Group_1__0)*
	{ after(grammarAccess.getPlusExprAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PlusExpr__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlusExpr__Group_1__0__Impl
	rule__PlusExpr__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusExpr__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlusExprAccess().getGroup_1_0()); }
	(rule__PlusExpr__Group_1_0__0)
	{ after(grammarAccess.getPlusExprAccess().getGroup_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusExpr__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlusExpr__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusExpr__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlusExprAccess().getRightAssignment_1_1()); }
	(rule__PlusExpr__RightAssignment_1_1)
	{ after(grammarAccess.getPlusExprAccess().getRightAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PlusExpr__Group_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlusExpr__Group_1_0__0__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusExpr__Group_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlusExprAccess().getGroup_1_0_0()); }
	(rule__PlusExpr__Group_1_0_0__0)
	{ after(grammarAccess.getPlusExprAccess().getGroup_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PlusExpr__Group_1_0_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlusExpr__Group_1_0_0__0__Impl
	rule__PlusExpr__Group_1_0_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusExpr__Group_1_0_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlusExprAccess().getBinaryExprLeftAction_1_0_0_0()); }
	()
	{ after(grammarAccess.getPlusExprAccess().getBinaryExprLeftAction_1_0_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusExpr__Group_1_0_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlusExpr__Group_1_0_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusExpr__Group_1_0_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlusExprAccess().getOpAssignment_1_0_0_1()); }
	(rule__PlusExpr__OpAssignment_1_0_0_1)
	{ after(grammarAccess.getPlusExprAccess().getOpAssignment_1_0_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TimesExpr__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TimesExpr__Group__0__Impl
	rule__TimesExpr__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TimesExpr__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimesExprAccess().getExpExprParserRuleCall_0()); }
	ruleExpExpr
	{ after(grammarAccess.getTimesExprAccess().getExpExprParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TimesExpr__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TimesExpr__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TimesExpr__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimesExprAccess().getGroup_1()); }
	(rule__TimesExpr__Group_1__0)*
	{ after(grammarAccess.getTimesExprAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TimesExpr__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TimesExpr__Group_1__0__Impl
	rule__TimesExpr__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TimesExpr__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimesExprAccess().getGroup_1_0()); }
	(rule__TimesExpr__Group_1_0__0)
	{ after(grammarAccess.getTimesExprAccess().getGroup_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TimesExpr__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TimesExpr__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TimesExpr__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimesExprAccess().getRightAssignment_1_1()); }
	(rule__TimesExpr__RightAssignment_1_1)
	{ after(grammarAccess.getTimesExprAccess().getRightAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TimesExpr__Group_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TimesExpr__Group_1_0__0__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TimesExpr__Group_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimesExprAccess().getGroup_1_0_0()); }
	(rule__TimesExpr__Group_1_0_0__0)
	{ after(grammarAccess.getTimesExprAccess().getGroup_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TimesExpr__Group_1_0_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TimesExpr__Group_1_0_0__0__Impl
	rule__TimesExpr__Group_1_0_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TimesExpr__Group_1_0_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimesExprAccess().getBinaryExprLeftAction_1_0_0_0()); }
	()
	{ after(grammarAccess.getTimesExprAccess().getBinaryExprLeftAction_1_0_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TimesExpr__Group_1_0_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TimesExpr__Group_1_0_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TimesExpr__Group_1_0_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimesExprAccess().getOpAssignment_1_0_0_1()); }
	(rule__TimesExpr__OpAssignment_1_0_0_1)
	{ after(grammarAccess.getTimesExprAccess().getOpAssignment_1_0_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ExpExpr__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExpExpr__Group__0__Impl
	rule__ExpExpr__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpExpr__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpExprAccess().getPrefixExprParserRuleCall_0()); }
	rulePrefixExpr
	{ after(grammarAccess.getExpExprAccess().getPrefixExprParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpExpr__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExpExpr__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpExpr__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpExprAccess().getGroup_1()); }
	(rule__ExpExpr__Group_1__0)*
	{ after(grammarAccess.getExpExprAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ExpExpr__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExpExpr__Group_1__0__Impl
	rule__ExpExpr__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpExpr__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpExprAccess().getGroup_1_0()); }
	(rule__ExpExpr__Group_1_0__0)
	{ after(grammarAccess.getExpExprAccess().getGroup_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpExpr__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExpExpr__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpExpr__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpExprAccess().getRightAssignment_1_1()); }
	(rule__ExpExpr__RightAssignment_1_1)
	{ after(grammarAccess.getExpExprAccess().getRightAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ExpExpr__Group_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExpExpr__Group_1_0__0__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpExpr__Group_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpExprAccess().getGroup_1_0_0()); }
	(rule__ExpExpr__Group_1_0_0__0)
	{ after(grammarAccess.getExpExprAccess().getGroup_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ExpExpr__Group_1_0_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExpExpr__Group_1_0_0__0__Impl
	rule__ExpExpr__Group_1_0_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpExpr__Group_1_0_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpExprAccess().getBinaryExprLeftAction_1_0_0_0()); }
	()
	{ after(grammarAccess.getExpExprAccess().getBinaryExprLeftAction_1_0_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpExpr__Group_1_0_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExpExpr__Group_1_0_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpExpr__Group_1_0_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpExprAccess().getOpAssignment_1_0_0_1()); }
	(rule__ExpExpr__OpAssignment_1_0_0_1)
	{ after(grammarAccess.getExpExprAccess().getOpAssignment_1_0_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PrefixExpr__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrefixExpr__Group_0__0__Impl
	rule__PrefixExpr__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PrefixExpr__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrefixExprAccess().getUnaryExprAction_0_0()); }
	()
	{ after(grammarAccess.getPrefixExprAccess().getUnaryExprAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrefixExpr__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrefixExpr__Group_0__1__Impl
	rule__PrefixExpr__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PrefixExpr__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrefixExprAccess().getOpAssignment_0_1()); }
	(rule__PrefixExpr__OpAssignment_0_1)
	{ after(grammarAccess.getPrefixExprAccess().getOpAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrefixExpr__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrefixExpr__Group_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PrefixExpr__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrefixExprAccess().getExprAssignment_0_2()); }
	(rule__PrefixExpr__ExprAssignment_0_2)
	{ after(grammarAccess.getPrefixExprAccess().getExprAssignment_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AtomicExpr__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpr__Group_0__0__Impl
	rule__AtomicExpr__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExprAccess().getStateVarRefAction_0_0()); }
	()
	{ after(grammarAccess.getAtomicExprAccess().getStateVarRefAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpr__Group_0__1__Impl
	rule__AtomicExpr__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExprAccess().getVarKeyword_0_1()); }
	Var
	{ after(grammarAccess.getAtomicExprAccess().getVarKeyword_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpr__Group_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExprAccess().getStateVarAssignment_0_2()); }
	(rule__AtomicExpr__StateVarAssignment_0_2)
	{ after(grammarAccess.getAtomicExprAccess().getStateVarAssignment_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AtomicExpr__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpr__Group_1__0__Impl
	rule__AtomicExpr__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExprAccess().getPortRefAction_1_0()); }
	()
	{ after(grammarAccess.getAtomicExprAccess().getPortRefAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpr__Group_1__1__Impl
	rule__AtomicExpr__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExprAccess().getPortKeyword_1_1()); }
	Port
	{ after(grammarAccess.getAtomicExprAccess().getPortKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpr__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExprAccess().getPortNameAssignment_1_2()); }
	(rule__AtomicExpr__PortNameAssignment_1_2)
	{ after(grammarAccess.getAtomicExprAccess().getPortNameAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AtomicExpr__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpr__Group_2__0__Impl
	rule__AtomicExpr__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExprAccess().getIntLitAction_2_0()); }
	()
	{ after(grammarAccess.getAtomicExprAccess().getIntLitAction_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpr__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExprAccess().getValueAssignment_2_1()); }
	(rule__AtomicExpr__ValueAssignment_2_1)
	{ after(grammarAccess.getAtomicExprAccess().getValueAssignment_2_1()); }
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
	In
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
	In
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

rule__SpecSection__StateAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSpecSectionAccess().getStateStateParserRuleCall_0_0()); }
		ruleState
		{ after(grammarAccess.getSpecSectionAccess().getStateStateParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecSection__InvariantsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSpecSectionAccess().getInvariantsInvariantsParserRuleCall_1_0()); }
		ruleInvariants
		{ after(grammarAccess.getSpecSectionAccess().getInvariantsInvariantsParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecSection__IntegrationAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSpecSectionAccess().getIntegrationIntegrationParserRuleCall_2_0()); }
		ruleIntegration
		{ after(grammarAccess.getSpecSectionAccess().getIntegrationIntegrationParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecSection__InitializeAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSpecSectionAccess().getInitializeInitializeParserRuleCall_3_0()); }
		ruleInitialize
		{ after(grammarAccess.getSpecSectionAccess().getInitializeInitializeParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecSection__ComputeAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSpecSectionAccess().getComputeComputeParserRuleCall_4_0()); }
		ruleCompute
		{ after(grammarAccess.getSpecSectionAccess().getComputeComputeParserRuleCall_4_0()); }
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

rule__InvSpec__DisplayNameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInvSpecAccess().getDisplayNameSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getInvSpecAccess().getDisplayNameSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InvSpec__ExprAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInvSpecAccess().getExprExprParserRuleCall_3_0()); }
		ruleExpr
		{ after(grammarAccess.getInvSpecAccess().getExprExprParserRuleCall_3_0()); }
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

rule__Initialize__SpecsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInitializeAccess().getSpecsInitializeSpecStatementParserRuleCall_1_0()); }
		ruleInitializeSpecStatement
		{ after(grammarAccess.getInitializeAccess().getSpecsInitializeSpecStatementParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Compute__CasesAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComputeAccess().getCasesCaseStatementClauseParserRuleCall_1_0()); }
		ruleCaseStatementClause
		{ after(grammarAccess.getComputeAccess().getCasesCaseStatementClauseParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CaseStatementClause__DisplayNameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCaseStatementClauseAccess().getDisplayNameSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getCaseStatementClauseAccess().getDisplayNameSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CaseStatementClause__AssumeStatementAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCaseStatementClauseAccess().getAssumeStatementAnonAssumeStatementParserRuleCall_3_0()); }
		ruleAnonAssumeStatement
		{ after(grammarAccess.getCaseStatementClauseAccess().getAssumeStatementAnonAssumeStatementParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CaseStatementClause__GuaranteeStatementAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCaseStatementClauseAccess().getGuaranteeStatementAnonGuaranteeStatementParserRuleCall_4_0()); }
		ruleAnonGuaranteeStatement
		{ after(grammarAccess.getCaseStatementClauseAccess().getGuaranteeStatementAnonGuaranteeStatementParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AssumeStatement__DisplayNameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAssumeStatementAccess().getDisplayNameSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getAssumeStatementAccess().getDisplayNameSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AssumeStatement__ExprAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAssumeStatementAccess().getExprExprParserRuleCall_3_0()); }
		ruleExpr
		{ after(grammarAccess.getAssumeStatementAccess().getExprExprParserRuleCall_3_0()); }
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

rule__GuaranteeStatement__DisplayNameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGuaranteeStatementAccess().getDisplayNameSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getGuaranteeStatementAccess().getDisplayNameSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GuaranteeStatement__ExprAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGuaranteeStatementAccess().getExprExprParserRuleCall_3_0()); }
		ruleExpr
		{ after(grammarAccess.getGuaranteeStatementAccess().getExprExprParserRuleCall_3_0()); }
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

rule__ImpliesExpr__RightAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImpliesExprAccess().getRightImpliesExprParserRuleCall_1_1_0()); }
		ruleImpliesExpr
		{ after(grammarAccess.getImpliesExprAccess().getRightImpliesExprParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpr__OpAssignment_1_0_0_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOrExprAccess().getOpOrKeyword_1_0_0_1_0_0()); }
		(
			{ before(grammarAccess.getOrExprAccess().getOpOrKeyword_1_0_0_1_0_0()); }
			Or
			{ after(grammarAccess.getOrExprAccess().getOpOrKeyword_1_0_0_1_0_0()); }
		)
		{ after(grammarAccess.getOrExprAccess().getOpOrKeyword_1_0_0_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpr__OpAssignment_1_0_0_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOrExprAccess().getOpOrelseKeyword_1_0_0_1_1_0()); }
		(
			{ before(grammarAccess.getOrExprAccess().getOpOrelseKeyword_1_0_0_1_1_0()); }
			Orelse
			{ after(grammarAccess.getOrExprAccess().getOpOrelseKeyword_1_0_0_1_1_0()); }
		)
		{ after(grammarAccess.getOrExprAccess().getOpOrelseKeyword_1_0_0_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpr__RightAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOrExprAccess().getRightAndExprParserRuleCall_1_1_0()); }
		ruleAndExpr
		{ after(grammarAccess.getOrExprAccess().getRightAndExprParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpr__OpAssignment_1_0_0_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAndExprAccess().getOpAndKeyword_1_0_0_1_0_0()); }
		(
			{ before(grammarAccess.getAndExprAccess().getOpAndKeyword_1_0_0_1_0_0()); }
			And
			{ after(grammarAccess.getAndExprAccess().getOpAndKeyword_1_0_0_1_0_0()); }
		)
		{ after(grammarAccess.getAndExprAccess().getOpAndKeyword_1_0_0_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpr__OpAssignment_1_0_0_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAndExprAccess().getOpAndthenKeyword_1_0_0_1_1_0()); }
		(
			{ before(grammarAccess.getAndExprAccess().getOpAndthenKeyword_1_0_0_1_1_0()); }
			Andthen
			{ after(grammarAccess.getAndExprAccess().getOpAndthenKeyword_1_0_0_1_1_0()); }
		)
		{ after(grammarAccess.getAndExprAccess().getOpAndthenKeyword_1_0_0_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpr__RightAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAndExprAccess().getRightRelationalExprParserRuleCall_1_1_0()); }
		ruleRelationalExpr
		{ after(grammarAccess.getAndExprAccess().getRightRelationalExprParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationalExpr__OpAssignment_1_0_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRelationalExprAccess().getOpRelationalOpParserRuleCall_1_0_0_1_0()); }
		ruleRelationalOp
		{ after(grammarAccess.getRelationalExprAccess().getOpRelationalOpParserRuleCall_1_0_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationalExpr__RightAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRelationalExprAccess().getRightPlusExprParserRuleCall_1_1_0()); }
		rulePlusExpr
		{ after(grammarAccess.getRelationalExprAccess().getRightPlusExprParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusExpr__OpAssignment_1_0_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPlusExprAccess().getOpAlternatives_1_0_0_1_0()); }
		(rule__PlusExpr__OpAlternatives_1_0_0_1_0)
		{ after(grammarAccess.getPlusExprAccess().getOpAlternatives_1_0_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusExpr__RightAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPlusExprAccess().getRightTimesExprParserRuleCall_1_1_0()); }
		ruleTimesExpr
		{ after(grammarAccess.getPlusExprAccess().getRightTimesExprParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TimesExpr__OpAssignment_1_0_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimesExprAccess().getOpAlternatives_1_0_0_1_0()); }
		(rule__TimesExpr__OpAlternatives_1_0_0_1_0)
		{ after(grammarAccess.getTimesExprAccess().getOpAlternatives_1_0_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TimesExpr__RightAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimesExprAccess().getRightExpExprParserRuleCall_1_1_0()); }
		ruleExpExpr
		{ after(grammarAccess.getTimesExprAccess().getRightExpExprParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpExpr__OpAssignment_1_0_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpExprAccess().getOpCircumflexAccentKeyword_1_0_0_1_0()); }
		(
			{ before(grammarAccess.getExpExprAccess().getOpCircumflexAccentKeyword_1_0_0_1_0()); }
			CircumflexAccent
			{ after(grammarAccess.getExpExprAccess().getOpCircumflexAccentKeyword_1_0_0_1_0()); }
		)
		{ after(grammarAccess.getExpExprAccess().getOpCircumflexAccentKeyword_1_0_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpExpr__RightAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpExprAccess().getRightPrefixExprParserRuleCall_1_1_0()); }
		rulePrefixExpr
		{ after(grammarAccess.getExpExprAccess().getRightPrefixExprParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrefixExpr__OpAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrefixExprAccess().getOpAlternatives_0_1_0()); }
		(rule__PrefixExpr__OpAlternatives_0_1_0)
		{ after(grammarAccess.getPrefixExprAccess().getOpAlternatives_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrefixExpr__ExprAssignment_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrefixExprAccess().getExprPrefixExprParserRuleCall_0_2_0()); }
		rulePrefixExpr
		{ after(grammarAccess.getPrefixExprAccess().getExprPrefixExprParserRuleCall_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__StateVarAssignment_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicExprAccess().getStateVarStateVarDeclCrossReference_0_2_0()); }
		(
			{ before(grammarAccess.getAtomicExprAccess().getStateVarStateVarDeclIDTerminalRuleCall_0_2_0_1()); }
			RULE_ID
			{ after(grammarAccess.getAtomicExprAccess().getStateVarStateVarDeclIDTerminalRuleCall_0_2_0_1()); }
		)
		{ after(grammarAccess.getAtomicExprAccess().getStateVarStateVarDeclCrossReference_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__PortNameAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicExprAccess().getPortNameIDTerminalRuleCall_1_2_0()); }
		RULE_ID
		{ after(grammarAccess.getAtomicExprAccess().getPortNameIDTerminalRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__ValueAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicExprAccess().getValueINTEGER_LITTerminalRuleCall_2_1_0()); }
		RULE_INTEGER_LIT
		{ after(grammarAccess.getAtomicExprAccess().getValueINTEGER_LITTerminalRuleCall_2_1_0()); }
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
