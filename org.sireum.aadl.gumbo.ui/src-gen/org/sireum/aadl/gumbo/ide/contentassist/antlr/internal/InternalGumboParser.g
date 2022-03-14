
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
		tokenNameToValue.put("QuestionMark", "'?'");
		tokenNameToValue.put("LeftSquareBracket", "'['");
		tokenNameToValue.put("RightSquareBracket", "']'");
		tokenNameToValue.put("CircumflexAccent", "'^'");
		tokenNameToValue.put("LeftCurlyBracket", "'{'");
		tokenNameToValue.put("RightCurlyBracket", "'}'");
		tokenNameToValue.put("ForAll", "'\u2200'");
		tokenNameToValue.put("ThereExists", "'\u2203'");
		tokenNameToValue.put("FullStopFullStop", "'..'");
		tokenNameToValue.put("ColonColon", "'::'");
		tokenNameToValue.put("ColonEqualsSign", "':='");
		tokenNameToValue.put("LessThanSignEqualsSign", "'<='");
		tokenNameToValue.put("LessThanSignGreaterThanSign", "'<>'");
		tokenNameToValue.put("EqualsSignGreaterThanSign", "'=>'");
		tokenNameToValue.put("GreaterThanSignEqualsSign", "'>='");
		tokenNameToValue.put("In", "'in'");
		tokenNameToValue.put("Or", "'or'");
		tokenNameToValue.put("To", "'to'");
		tokenNameToValue.put("PlusSignEqualsSignGreaterThanSign", "'+=>'");
		tokenNameToValue.put("FullStopFullStopLessThanSign", "'..<'");
		tokenNameToValue.put("LessThanSignEqualsSignGreaterThanSign", "'<=>'");
		tokenNameToValue.put("And", "'and'");
		tokenNameToValue.put("For", "'for'");
		tokenNameToValue.put("Inv", "'inv'");
		tokenNameToValue.put("Mut", "'mut'");
		tokenNameToValue.put("Not", "'not'");
		tokenNameToValue.put("Var", "'var'");
		tokenNameToValue.put("All", "'\\all'");
		tokenNameToValue.put("Case", "'case'");
		tokenNameToValue.put("Enum", "'enum'");
		tokenNameToValue.put("Real", "'real'");
		tokenNameToValue.put("Spec", "'spec'");
		tokenNameToValue.put("True", "'true'");
		tokenNameToValue.put("Some", "'\\some'");
		tokenNameToValue.put("Delta", "'delta'");
		tokenNameToValue.put("False", "'false'");
		tokenNameToValue.put("Floor", "'floor'");
		tokenNameToValue.put("Gumbo", "'gumbo'");
		tokenNameToValue.put("Modes", "'modes'");
		tokenNameToValue.put("Reads", "'reads'");
		tokenNameToValue.put("State", "'state'");
		tokenNameToValue.put("Assume", "'assume'");
		tokenNameToValue.put("Orelse", "'orelse'");
		tokenNameToValue.put("Return", "'return'");
		tokenNameToValue.put("Strict", "'strict'");
		tokenNameToValue.put("Andthen", "'andthen'");
		tokenNameToValue.put("Applies", "'applies'");
		tokenNameToValue.put("Binding", "'binding'");
		tokenNameToValue.put("Compute", "'compute'");
		tokenNameToValue.put("Ensures", "'ensures'");
		tokenNameToValue.put("Implies", "'implies'");
		tokenNameToValue.put("Library", "'library'");
		tokenNameToValue.put("Memoize", "'memoize'");
		tokenNameToValue.put("Constant", "'constant'");
		tokenNameToValue.put("Modifies", "'modifies'");
		tokenNameToValue.put("Requires", "'requires'");
		tokenNameToValue.put("Functions", "'functions'");
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

// Entry rule entryRuleEquivExpr
entryRuleEquivExpr
:
{ before(grammarAccess.getEquivExprRule()); }
	 ruleEquivExpr
{ after(grammarAccess.getEquivExprRule()); } 
	 EOF 
;

// Rule EquivExpr
ruleEquivExpr 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEquivExprAccess().getGroup()); }
		(rule__EquivExpr__Group__0)
		{ after(grammarAccess.getEquivExprAccess().getGroup()); }
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

// Entry rule entryRuleAddSubExpr
entryRuleAddSubExpr
:
{ before(grammarAccess.getAddSubExprRule()); }
	 ruleAddSubExpr
{ after(grammarAccess.getAddSubExprRule()); } 
	 EOF 
;

// Rule AddSubExpr
ruleAddSubExpr 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAddSubExprAccess().getGroup()); }
		(rule__AddSubExpr__Group__0)
		{ after(grammarAccess.getAddSubExprAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMultDivModExpr
entryRuleMultDivModExpr
:
{ before(grammarAccess.getMultDivModExprRule()); }
	 ruleMultDivModExpr
{ after(grammarAccess.getMultDivModExprRule()); } 
	 EOF 
;

// Rule MultDivModExpr
ruleMultDivModExpr 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMultDivModExprAccess().getGroup()); }
		(rule__MultDivModExpr__Group__0)
		{ after(grammarAccess.getMultDivModExprAccess().getGroup()); }
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

// Entry rule entryRuleSlangExpr
entryRuleSlangExpr
:
{ before(grammarAccess.getSlangExprRule()); }
	 ruleSlangExpr
{ after(grammarAccess.getSlangExprRule()); } 
	 EOF 
;

// Rule SlangExpr
ruleSlangExpr 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSlangExprAccess().getAlternatives()); }
		(rule__SlangExpr__Alternatives)
		{ after(grammarAccess.getSlangExprAccess().getAlternatives()); }
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

// Entry rule entryRuleAccessSuffix
entryRuleAccessSuffix
:
{ before(grammarAccess.getAccessSuffixRule()); }
	 ruleAccessSuffix
{ after(grammarAccess.getAccessSuffixRule()); } 
	 EOF 
;

// Rule AccessSuffix
ruleAccessSuffix 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAccessSuffixAccess().getGroup()); }
		(rule__AccessSuffix__Group__0)
		{ after(grammarAccess.getAccessSuffixAccess().getGroup()); }
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

// Entry rule entryRuleCallSuffix
entryRuleCallSuffix
:
{ before(grammarAccess.getCallSuffixRule()); }
	 ruleCallSuffix
{ after(grammarAccess.getCallSuffixRule()); } 
	 EOF 
;

// Rule CallSuffix
ruleCallSuffix 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCallSuffixAccess().getAlternatives()); }
		(rule__CallSuffix__Alternatives)
		{ after(grammarAccess.getCallSuffixAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCallArgs
entryRuleCallArgs
:
{ before(grammarAccess.getCallArgsRule()); }
	 ruleCallArgs
{ after(grammarAccess.getCallArgsRule()); } 
	 EOF 
;

// Rule CallArgs
ruleCallArgs 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCallArgsAccess().getGroup()); }
		(rule__CallArgs__Group__0)
		{ after(grammarAccess.getCallArgsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIdExp
entryRuleIdExp
:
{ before(grammarAccess.getIdExpRule()); }
	 ruleIdExp
{ after(grammarAccess.getIdExpRule()); } 
	 EOF 
;

// Rule IdExp
ruleIdExp 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIdExpAccess().getGroup()); }
		(rule__IdExp__Group__0)
		{ after(grammarAccess.getIdExpAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleType
entryRuleType
:
{ before(grammarAccess.getTypeRule()); }
	 ruleType
{ after(grammarAccess.getTypeRule()); } 
	 EOF 
;

// Rule Type
ruleType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypeAccess().getAlternatives()); }
		(rule__Type__Alternatives)
		{ after(grammarAccess.getTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBaseType
entryRuleBaseType
:
{ before(grammarAccess.getBaseTypeRule()); }
	 ruleBaseType
{ after(grammarAccess.getBaseTypeRule()); } 
	 EOF 
;

// Rule BaseType
ruleBaseType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBaseTypeAccess().getAlternatives()); }
		(rule__BaseType__Alternatives)
		{ after(grammarAccess.getBaseTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTypeArgs
entryRuleTypeArgs
:
{ before(grammarAccess.getTypeArgsRule()); }
	 ruleTypeArgs
{ after(grammarAccess.getTypeArgsRule()); } 
	 EOF 
;

// Rule TypeArgs
ruleTypeArgs 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypeArgsAccess().getGroup()); }
		(rule__TypeArgs__Group__0)
		{ after(grammarAccess.getTypeArgsAccess().getGroup()); }
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

// Entry rule entryRuleParam
entryRuleParam
:
{ before(grammarAccess.getParamRule()); }
	 ruleParam
{ after(grammarAccess.getParamRule()); } 
	 EOF 
;

// Rule Param
ruleParam 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getParamAccess().getGroup()); }
		(rule__Param__Group__0)
		{ after(grammarAccess.getParamAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDefDef
entryRuleDefDef
:
{ before(grammarAccess.getDefDefRule()); }
	 ruleDefDef
{ after(grammarAccess.getDefDefRule()); } 
	 EOF 
;

// Rule DefDef
ruleDefDef 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDefDefAccess().getGroup()); }
		(rule__DefDef__Group__0)
		{ after(grammarAccess.getDefDefAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDefMods
entryRuleDefMods
:
{ before(grammarAccess.getDefModsRule()); }
	 ruleDefMods
{ after(grammarAccess.getDefModsRule()); } 
	 EOF 
;

// Rule DefMods
ruleDefMods 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDefModsAccess().getAlternatives()); }
		(rule__DefMods__Alternatives)
		{ after(grammarAccess.getDefModsAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDefExt
entryRuleDefExt
:
{ before(grammarAccess.getDefExtRule()); }
	 ruleDefExt
{ after(grammarAccess.getDefExtRule()); } 
	 EOF 
;

// Rule DefExt
ruleDefExt 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDefExtAccess().getGroup()); }
		(rule__DefExt__Group__0)
		{ after(grammarAccess.getDefExtAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDefID
entryRuleDefID
:
{ before(grammarAccess.getDefIDRule()); }
	 ruleDefID
{ after(grammarAccess.getDefIDRule()); } 
	 EOF 
;

// Rule DefID
ruleDefID 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDefIDAccess().getAlternatives()); }
		(rule__DefID__Alternatives)
		{ after(grammarAccess.getDefIDAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDefParams
entryRuleDefParams
:
{ before(grammarAccess.getDefParamsRule()); }
	 ruleDefParams
{ after(grammarAccess.getDefParamsRule()); } 
	 EOF 
;

// Rule DefParams
ruleDefParams 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDefParamsAccess().getGroup()); }
		(rule__DefParams__Group__0)
		{ after(grammarAccess.getDefParamsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDefParam
entryRuleDefParam
:
{ before(grammarAccess.getDefParamRule()); }
	 ruleDefParam
{ after(grammarAccess.getDefParamRule()); } 
	 EOF 
;

// Rule DefParam
ruleDefParam 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDefParamAccess().getGroup()); }
		(rule__DefParam__Group__0)
		{ after(grammarAccess.getDefParamAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDefContract
entryRuleDefContract
:
{ before(grammarAccess.getDefContractRule()); }
	 ruleDefContract
{ after(grammarAccess.getDefContractRule()); } 
	 EOF 
;

// Rule DefContract
ruleDefContract 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDefContractAccess().getGroup()); }
		(rule__DefContract__Group__0)
		{ after(grammarAccess.getDefContractAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDefContractCase
entryRuleDefContractCase
:
{ before(grammarAccess.getDefContractCaseRule()); }
	 ruleDefContractCase
{ after(grammarAccess.getDefContractCaseRule()); } 
	 EOF 
;

// Rule DefContractCase
ruleDefContractCase 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDefContractCaseAccess().getGroup()); }
		(rule__DefContractCase__Group__0)
		{ after(grammarAccess.getDefContractCaseAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTypeParams
entryRuleTypeParams
:
{ before(grammarAccess.getTypeParamsRule()); }
	 ruleTypeParams
{ after(grammarAccess.getTypeParamsRule()); } 
	 EOF 
;

// Rule TypeParams
ruleTypeParams 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypeParamsAccess().getGroup()); }
		(rule__TypeParams__Group__0)
		{ after(grammarAccess.getTypeParamsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTypeParam
entryRuleTypeParam
:
{ before(grammarAccess.getTypeParamRule()); }
	 ruleTypeParam
{ after(grammarAccess.getTypeParamRule()); } 
	 EOF 
;

// Rule TypeParam
ruleTypeParam 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypeParamAccess().getGroup()); }
		(rule__TypeParam__Group__0)
		{ after(grammarAccess.getTypeParamAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleReads
entryRuleReads
:
{ before(grammarAccess.getReadsRule()); }
	 ruleReads
{ after(grammarAccess.getReadsRule()); } 
	 EOF 
;

// Rule Reads
ruleReads 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getReadsAccess().getGroup()); }
		(rule__Reads__Group__0)
		{ after(grammarAccess.getReadsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRequires
entryRuleRequires
:
{ before(grammarAccess.getRequiresRule()); }
	 ruleRequires
{ after(grammarAccess.getRequiresRule()); } 
	 EOF 
;

// Rule Requires
ruleRequires 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRequiresAccess().getGroup()); }
		(rule__Requires__Group__0)
		{ after(grammarAccess.getRequiresAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleModifies
entryRuleModifies
:
{ before(grammarAccess.getModifiesRule()); }
	 ruleModifies
{ after(grammarAccess.getModifiesRule()); } 
	 EOF 
;

// Rule Modifies
ruleModifies 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModifiesAccess().getGroup()); }
		(rule__Modifies__Group__0)
		{ after(grammarAccess.getModifiesAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEnsures
entryRuleEnsures
:
{ before(grammarAccess.getEnsuresRule()); }
	 ruleEnsures
{ after(grammarAccess.getEnsuresRule()); } 
	 EOF 
;

// Rule Ensures
ruleEnsures 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEnsuresAccess().getGroup()); }
		(rule__Ensures__Group__0)
		{ after(grammarAccess.getEnsuresAccess().getGroup()); }
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

rule__AddSubExpr__OpAlternatives_1_0_0_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAddSubExprAccess().getOpPlusSignKeyword_1_0_0_1_0_0()); }
		PlusSign
		{ after(grammarAccess.getAddSubExprAccess().getOpPlusSignKeyword_1_0_0_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getAddSubExprAccess().getOpHyphenMinusKeyword_1_0_0_1_0_1()); }
		HyphenMinus
		{ after(grammarAccess.getAddSubExprAccess().getOpHyphenMinusKeyword_1_0_0_1_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultDivModExpr__OpAlternatives_1_0_0_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMultDivModExprAccess().getOpAsteriskKeyword_1_0_0_1_0_0()); }
		Asterisk
		{ after(grammarAccess.getMultDivModExprAccess().getOpAsteriskKeyword_1_0_0_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getMultDivModExprAccess().getOpSolidusKeyword_1_0_0_1_0_1()); }
		Solidus
		{ after(grammarAccess.getMultDivModExprAccess().getOpSolidusKeyword_1_0_0_1_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getMultDivModExprAccess().getOpPercentSignKeyword_1_0_0_1_0_2()); }
		PercentSign
		{ after(grammarAccess.getMultDivModExprAccess().getOpPercentSignKeyword_1_0_0_1_0_2()); }
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
	|
	(
		{ before(grammarAccess.getAtomicExprAccess().getGroup_3()); }
		(rule__AtomicExpr__Group_3__0)
		{ after(grammarAccess.getAtomicExprAccess().getGroup_3()); }
	)
	|
	(
		{ before(grammarAccess.getAtomicExprAccess().getGroup_4()); }
		(rule__AtomicExpr__Group_4__0)
		{ after(grammarAccess.getAtomicExprAccess().getGroup_4()); }
	)
	|
	(
		{ before(grammarAccess.getAtomicExprAccess().getGroup_5()); }
		(rule__AtomicExpr__Group_5__0)
		{ after(grammarAccess.getAtomicExprAccess().getGroup_5()); }
	)
	|
	(
		{ before(grammarAccess.getAtomicExprAccess().getGroup_6()); }
		(rule__AtomicExpr__Group_6__0)
		{ after(grammarAccess.getAtomicExprAccess().getGroup_6()); }
	)
	|
	(
		{ before(grammarAccess.getAtomicExprAccess().getGroup_7()); }
		(rule__AtomicExpr__Group_7__0)
		{ after(grammarAccess.getAtomicExprAccess().getGroup_7()); }
	)
	|
	(
		{ before(grammarAccess.getAtomicExprAccess().getGroup_8()); }
		(rule__AtomicExpr__Group_8__0)
		{ after(grammarAccess.getAtomicExprAccess().getGroup_8()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpr__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangExprAccess().getGroup_0()); }
		(rule__SlangExpr__Group_0__0)
		{ after(grammarAccess.getSlangExprAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getSlangExprAccess().getGroup_1()); }
		(rule__SlangExpr__Group_1__0)
		{ after(grammarAccess.getSlangExprAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getSlangExprAccess().getGroup_2()); }
		(rule__SlangExpr__Group_2__0)
		{ after(grammarAccess.getSlangExprAccess().getGroup_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpr__Alternatives_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangExprAccess().getGroup_0_1_0()); }
		(rule__SlangExpr__Group_0_1_0__0)*
		{ after(grammarAccess.getSlangExprAccess().getGroup_0_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getSlangExprAccess().getGroup_0_1_1()); }
		(rule__SlangExpr__Group_0_1_1__0)
		{ after(grammarAccess.getSlangExprAccess().getGroup_0_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpr__Alternatives_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangExprAccess().getAllKeyword_1_0_0()); }
		All
		{ after(grammarAccess.getSlangExprAccess().getAllKeyword_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getSlangExprAccess().getSomeKeyword_1_0_1()); }
		Some
		{ after(grammarAccess.getSlangExprAccess().getSomeKeyword_1_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getSlangExprAccess().getForAllKeyword_1_0_2()); }
		ForAll
		{ after(grammarAccess.getSlangExprAccess().getForAllKeyword_1_0_2()); }
	)
	|
	(
		{ before(grammarAccess.getSlangExprAccess().getThereExistsKeyword_1_0_3()); }
		ThereExists
		{ after(grammarAccess.getSlangExprAccess().getThereExistsKeyword_1_0_3()); }
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
		{ before(grammarAccess.getSlangTermAccess().getIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getSlangTermAccess().getIDTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getSlangTermAccess().getGroup_1()); }
		(rule__SlangTerm__Group_1__0)
		{ after(grammarAccess.getSlangTermAccess().getGroup_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CallSuffix__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCallSuffixAccess().getGroup_0()); }
		(rule__CallSuffix__Group_0__0)
		{ after(grammarAccess.getCallSuffixAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getCallSuffixAccess().getArgsAssignment_1()); }
		(rule__CallSuffix__ArgsAssignment_1)
		{ after(grammarAccess.getCallSuffixAccess().getArgsAssignment_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAccess().getGroup_0()); }
		(rule__Type__Group_0__0)
		{ after(grammarAccess.getTypeAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getGroup_1()); }
		(rule__Type__Group_1__0)
		{ after(grammarAccess.getTypeAccess().getGroup_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBaseTypeAccess().getGroup_0()); }
		(rule__BaseType__Group_0__0)
		{ after(grammarAccess.getBaseTypeAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getBaseTypeAccess().getGroup_1()); }
		(rule__BaseType__Group_1__0)
		{ after(grammarAccess.getBaseTypeAccess().getGroup_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefMods__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefModsAccess().getStrictKeyword_0()); }
		Strict
		{ after(grammarAccess.getDefModsAccess().getStrictKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getDefModsAccess().getMemoizeKeyword_1()); }
		Memoize
		{ after(grammarAccess.getDefModsAccess().getMemoizeKeyword_1()); }
	)
	|
	(
		{ before(grammarAccess.getDefModsAccess().getMutKeyword_2()); }
		Mut
		{ after(grammarAccess.getDefModsAccess().getMutKeyword_2()); }
	)
	|
	(
		{ before(grammarAccess.getDefModsAccess().getSpecKeyword_3()); }
		Spec
		{ after(grammarAccess.getDefModsAccess().getSpecKeyword_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefID__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefIDAccess().getIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getDefIDAccess().getIDTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getDefIDAccess().getOPTerminalRuleCall_1()); }
		RULE_OP
		{ after(grammarAccess.getDefIDAccess().getOPTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefContract__Alternatives_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefContractAccess().getGroup_2_0()); }
		(rule__DefContract__Group_2_0__0)
		{ after(grammarAccess.getDefContractAccess().getGroup_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getDefContractAccess().getGroup_2_1()); }
		(rule__DefContract__Group_2_1__0)
		{ after(grammarAccess.getDefContractAccess().getGroup_2_1()); }
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
	{ before(grammarAccess.getSpecSectionAccess().getFunctionsAssignment_1()); }
	(rule__SpecSection__FunctionsAssignment_1)?
	{ after(grammarAccess.getSpecSectionAccess().getFunctionsAssignment_1()); }
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
	{ before(grammarAccess.getSpecSectionAccess().getInvariantsAssignment_2()); }
	(rule__SpecSection__InvariantsAssignment_2)?
	{ after(grammarAccess.getSpecSectionAccess().getInvariantsAssignment_2()); }
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
	{ before(grammarAccess.getSpecSectionAccess().getIntegrationAssignment_3()); }
	(rule__SpecSection__IntegrationAssignment_3)?
	{ after(grammarAccess.getSpecSectionAccess().getIntegrationAssignment_3()); }
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
	{ before(grammarAccess.getSpecSectionAccess().getInitializeAssignment_4()); }
	(rule__SpecSection__InitializeAssignment_4)?
	{ after(grammarAccess.getSpecSectionAccess().getInitializeAssignment_4()); }
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
	{ before(grammarAccess.getSpecSectionAccess().getComputeAssignment_5()); }
	(rule__SpecSection__ComputeAssignment_5)?
	{ after(grammarAccess.getSpecSectionAccess().getComputeAssignment_5()); }
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
	{ before(grammarAccess.getImpliesExprAccess().getEquivExprParserRuleCall_0()); }
	ruleEquivExpr
	{ after(grammarAccess.getImpliesExprAccess().getEquivExprParserRuleCall_0()); }
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


rule__EquivExpr__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EquivExpr__Group__0__Impl
	rule__EquivExpr__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EquivExpr__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEquivExprAccess().getOrExprParserRuleCall_0()); }
	ruleOrExpr
	{ after(grammarAccess.getEquivExprAccess().getOrExprParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EquivExpr__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EquivExpr__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EquivExpr__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEquivExprAccess().getGroup_1()); }
	(rule__EquivExpr__Group_1__0)?
	{ after(grammarAccess.getEquivExprAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EquivExpr__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EquivExpr__Group_1__0__Impl
	rule__EquivExpr__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EquivExpr__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEquivExprAccess().getGroup_1_0()); }
	(rule__EquivExpr__Group_1_0__0)
	{ after(grammarAccess.getEquivExprAccess().getGroup_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EquivExpr__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EquivExpr__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EquivExpr__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEquivExprAccess().getRightAssignment_1_1()); }
	(rule__EquivExpr__RightAssignment_1_1)
	{ after(grammarAccess.getEquivExprAccess().getRightAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EquivExpr__Group_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EquivExpr__Group_1_0__0__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EquivExpr__Group_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEquivExprAccess().getGroup_1_0_0()); }
	(rule__EquivExpr__Group_1_0_0__0)
	{ after(grammarAccess.getEquivExprAccess().getGroup_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EquivExpr__Group_1_0_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EquivExpr__Group_1_0_0__0__Impl
	rule__EquivExpr__Group_1_0_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EquivExpr__Group_1_0_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEquivExprAccess().getBinaryExprLeftAction_1_0_0_0()); }
	()
	{ after(grammarAccess.getEquivExprAccess().getBinaryExprLeftAction_1_0_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EquivExpr__Group_1_0_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EquivExpr__Group_1_0_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EquivExpr__Group_1_0_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEquivExprAccess().getOpAssignment_1_0_0_1()); }
	(rule__EquivExpr__OpAssignment_1_0_0_1)
	{ after(grammarAccess.getEquivExprAccess().getOpAssignment_1_0_0_1()); }
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
	{ before(grammarAccess.getRelationalExprAccess().getAddSubExprParserRuleCall_0()); }
	ruleAddSubExpr
	{ after(grammarAccess.getRelationalExprAccess().getAddSubExprParserRuleCall_0()); }
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


rule__AddSubExpr__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AddSubExpr__Group__0__Impl
	rule__AddSubExpr__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AddSubExpr__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAddSubExprAccess().getMultDivModExprParserRuleCall_0()); }
	ruleMultDivModExpr
	{ after(grammarAccess.getAddSubExprAccess().getMultDivModExprParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AddSubExpr__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AddSubExpr__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AddSubExpr__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAddSubExprAccess().getGroup_1()); }
	(rule__AddSubExpr__Group_1__0)*
	{ after(grammarAccess.getAddSubExprAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AddSubExpr__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AddSubExpr__Group_1__0__Impl
	rule__AddSubExpr__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AddSubExpr__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAddSubExprAccess().getGroup_1_0()); }
	(rule__AddSubExpr__Group_1_0__0)
	{ after(grammarAccess.getAddSubExprAccess().getGroup_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AddSubExpr__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AddSubExpr__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AddSubExpr__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAddSubExprAccess().getRightAssignment_1_1()); }
	(rule__AddSubExpr__RightAssignment_1_1)
	{ after(grammarAccess.getAddSubExprAccess().getRightAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AddSubExpr__Group_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AddSubExpr__Group_1_0__0__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AddSubExpr__Group_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAddSubExprAccess().getGroup_1_0_0()); }
	(rule__AddSubExpr__Group_1_0_0__0)
	{ after(grammarAccess.getAddSubExprAccess().getGroup_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AddSubExpr__Group_1_0_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AddSubExpr__Group_1_0_0__0__Impl
	rule__AddSubExpr__Group_1_0_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AddSubExpr__Group_1_0_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAddSubExprAccess().getBinaryExprLeftAction_1_0_0_0()); }
	()
	{ after(grammarAccess.getAddSubExprAccess().getBinaryExprLeftAction_1_0_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AddSubExpr__Group_1_0_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AddSubExpr__Group_1_0_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AddSubExpr__Group_1_0_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAddSubExprAccess().getOpAssignment_1_0_0_1()); }
	(rule__AddSubExpr__OpAssignment_1_0_0_1)
	{ after(grammarAccess.getAddSubExprAccess().getOpAssignment_1_0_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MultDivModExpr__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultDivModExpr__Group__0__Impl
	rule__MultDivModExpr__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MultDivModExpr__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultDivModExprAccess().getExpExprParserRuleCall_0()); }
	ruleExpExpr
	{ after(grammarAccess.getMultDivModExprAccess().getExpExprParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultDivModExpr__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultDivModExpr__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MultDivModExpr__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultDivModExprAccess().getGroup_1()); }
	(rule__MultDivModExpr__Group_1__0)*
	{ after(grammarAccess.getMultDivModExprAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MultDivModExpr__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultDivModExpr__Group_1__0__Impl
	rule__MultDivModExpr__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MultDivModExpr__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultDivModExprAccess().getGroup_1_0()); }
	(rule__MultDivModExpr__Group_1_0__0)
	{ after(grammarAccess.getMultDivModExprAccess().getGroup_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultDivModExpr__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultDivModExpr__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MultDivModExpr__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultDivModExprAccess().getRightAssignment_1_1()); }
	(rule__MultDivModExpr__RightAssignment_1_1)
	{ after(grammarAccess.getMultDivModExprAccess().getRightAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MultDivModExpr__Group_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultDivModExpr__Group_1_0__0__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MultDivModExpr__Group_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultDivModExprAccess().getGroup_1_0_0()); }
	(rule__MultDivModExpr__Group_1_0_0__0)
	{ after(grammarAccess.getMultDivModExprAccess().getGroup_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MultDivModExpr__Group_1_0_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultDivModExpr__Group_1_0_0__0__Impl
	rule__MultDivModExpr__Group_1_0_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MultDivModExpr__Group_1_0_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultDivModExprAccess().getBinaryExprLeftAction_1_0_0_0()); }
	()
	{ after(grammarAccess.getMultDivModExprAccess().getBinaryExprLeftAction_1_0_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultDivModExpr__Group_1_0_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultDivModExpr__Group_1_0_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MultDivModExpr__Group_1_0_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultDivModExprAccess().getOpAssignment_1_0_0_1()); }
	(rule__MultDivModExpr__OpAssignment_1_0_0_1)
	{ after(grammarAccess.getMultDivModExprAccess().getOpAssignment_1_0_0_1()); }
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
	{ before(grammarAccess.getAtomicExprAccess().getDataRefExprAction_0_0()); }
	()
	{ after(grammarAccess.getAtomicExprAccess().getDataRefExprAction_0_0()); }
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
	{ before(grammarAccess.getAtomicExprAccess().getPortOrSubcomponentOrStateVarAssignment_0_1()); }
	(rule__AtomicExpr__PortOrSubcomponentOrStateVarAssignment_0_1)
	{ after(grammarAccess.getAtomicExprAccess().getPortOrSubcomponentOrStateVarAssignment_0_1()); }
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
	rule__AtomicExpr__Group_0__3
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
	{ before(grammarAccess.getAtomicExprAccess().getGroup_0_2()); }
	(rule__AtomicExpr__Group_0_2__0)?
	{ after(grammarAccess.getAtomicExprAccess().getGroup_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpr__Group_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExprAccess().getCsAssignment_0_3()); }
	(rule__AtomicExpr__CsAssignment_0_3)?
	{ after(grammarAccess.getAtomicExprAccess().getCsAssignment_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AtomicExpr__Group_0_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpr__Group_0_2__0__Impl
	rule__AtomicExpr__Group_0_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_0_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExprAccess().getFullStopKeyword_0_2_0()); }
	FullStop
	{ after(grammarAccess.getAtomicExprAccess().getFullStopKeyword_0_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_0_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpr__Group_0_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_0_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExprAccess().getRefAssignment_0_2_1()); }
	(rule__AtomicExpr__RefAssignment_0_2_1)
	{ after(grammarAccess.getAtomicExprAccess().getRefAssignment_0_2_1()); }
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
	{ before(grammarAccess.getAtomicExprAccess().getGroup_1_0()); }
	(rule__AtomicExpr__Group_1_0__0)
	{ after(grammarAccess.getAtomicExprAccess().getGroup_1_0()); }
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
	{ before(grammarAccess.getAtomicExprAccess().getEnumTypeAssignment_1_1()); }
	(rule__AtomicExpr__EnumTypeAssignment_1_1)
	{ after(grammarAccess.getAtomicExprAccess().getEnumTypeAssignment_1_1()); }
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
	rule__AtomicExpr__Group_1__3
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
	{ before(grammarAccess.getAtomicExprAccess().getCommaKeyword_1_2()); }
	Comma
	{ after(grammarAccess.getAtomicExprAccess().getCommaKeyword_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpr__Group_1__3__Impl
	rule__AtomicExpr__Group_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExprAccess().getValueAssignment_1_3()); }
	(rule__AtomicExpr__ValueAssignment_1_3)
	{ after(grammarAccess.getAtomicExprAccess().getValueAssignment_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_1__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpr__Group_1__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_1__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExprAccess().getRightParenthesisKeyword_1_4()); }
	RightParenthesis
	{ after(grammarAccess.getAtomicExprAccess().getRightParenthesisKeyword_1_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AtomicExpr__Group_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpr__Group_1_0__0__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExprAccess().getGroup_1_0_0()); }
	(rule__AtomicExpr__Group_1_0_0__0)
	{ after(grammarAccess.getAtomicExprAccess().getGroup_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AtomicExpr__Group_1_0_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpr__Group_1_0_0__0__Impl
	rule__AtomicExpr__Group_1_0_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_1_0_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExprAccess().getEnumLitExprAction_1_0_0_0()); }
	()
	{ after(grammarAccess.getAtomicExprAccess().getEnumLitExprAction_1_0_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_1_0_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpr__Group_1_0_0__1__Impl
	rule__AtomicExpr__Group_1_0_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_1_0_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExprAccess().getEnumKeyword_1_0_0_1()); }
	Enum
	{ after(grammarAccess.getAtomicExprAccess().getEnumKeyword_1_0_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_1_0_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpr__Group_1_0_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_1_0_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExprAccess().getLeftParenthesisKeyword_1_0_0_2()); }
	LeftParenthesis
	{ after(grammarAccess.getAtomicExprAccess().getLeftParenthesisKeyword_1_0_0_2()); }
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
	{ before(grammarAccess.getAtomicExprAccess().getGroup_2_0()); }
	(rule__AtomicExpr__Group_2_0__0)
	{ after(grammarAccess.getAtomicExprAccess().getGroup_2_0()); }
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
	rule__AtomicExpr__Group_2__2
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
	{ before(grammarAccess.getAtomicExprAccess().getArgExprAssignment_2_1()); }
	(rule__AtomicExpr__ArgExprAssignment_2_1)
	{ after(grammarAccess.getAtomicExprAccess().getArgExprAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpr__Group_2__2__Impl
	rule__AtomicExpr__Group_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExprAccess().getGroup_2_2()); }
	(rule__AtomicExpr__Group_2_2__0)*
	{ after(grammarAccess.getAtomicExprAccess().getGroup_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpr__Group_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExprAccess().getRightCurlyBracketKeyword_2_3()); }
	RightCurlyBracket
	{ after(grammarAccess.getAtomicExprAccess().getRightCurlyBracketKeyword_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AtomicExpr__Group_2_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpr__Group_2_0__0__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_2_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExprAccess().getGroup_2_0_0()); }
	(rule__AtomicExpr__Group_2_0_0__0)
	{ after(grammarAccess.getAtomicExprAccess().getGroup_2_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AtomicExpr__Group_2_0_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpr__Group_2_0_0__0__Impl
	rule__AtomicExpr__Group_2_0_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_2_0_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExprAccess().getRecordLitExprAction_2_0_0_0()); }
	()
	{ after(grammarAccess.getAtomicExprAccess().getRecordLitExprAction_2_0_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_2_0_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpr__Group_2_0_0__1__Impl
	rule__AtomicExpr__Group_2_0_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_2_0_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExprAccess().getRecordTypeAssignment_2_0_0_1()); }
	(rule__AtomicExpr__RecordTypeAssignment_2_0_0_1)
	{ after(grammarAccess.getAtomicExprAccess().getRecordTypeAssignment_2_0_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_2_0_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpr__Group_2_0_0__2__Impl
	rule__AtomicExpr__Group_2_0_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_2_0_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExprAccess().getLeftCurlyBracketKeyword_2_0_0_2()); }
	LeftCurlyBracket
	{ after(grammarAccess.getAtomicExprAccess().getLeftCurlyBracketKeyword_2_0_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_2_0_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpr__Group_2_0_0__3__Impl
	rule__AtomicExpr__Group_2_0_0__4
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_2_0_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExprAccess().getArgsAssignment_2_0_0_3()); }
	(rule__AtomicExpr__ArgsAssignment_2_0_0_3)
	{ after(grammarAccess.getAtomicExprAccess().getArgsAssignment_2_0_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_2_0_0__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpr__Group_2_0_0__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_2_0_0__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExprAccess().getEqualsSignKeyword_2_0_0_4()); }
	EqualsSign
	{ after(grammarAccess.getAtomicExprAccess().getEqualsSignKeyword_2_0_0_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AtomicExpr__Group_2_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpr__Group_2_2__0__Impl
	rule__AtomicExpr__Group_2_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_2_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExprAccess().getSemicolonKeyword_2_2_0()); }
	Semicolon
	{ after(grammarAccess.getAtomicExprAccess().getSemicolonKeyword_2_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_2_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpr__Group_2_2__1__Impl
	rule__AtomicExpr__Group_2_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_2_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExprAccess().getArgsAssignment_2_2_1()); }
	(rule__AtomicExpr__ArgsAssignment_2_2_1)
	{ after(grammarAccess.getAtomicExprAccess().getArgsAssignment_2_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_2_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpr__Group_2_2__2__Impl
	rule__AtomicExpr__Group_2_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_2_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExprAccess().getEqualsSignKeyword_2_2_2()); }
	EqualsSign
	{ after(grammarAccess.getAtomicExprAccess().getEqualsSignKeyword_2_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_2_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpr__Group_2_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_2_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExprAccess().getArgExprAssignment_2_2_3()); }
	(rule__AtomicExpr__ArgExprAssignment_2_2_3)
	{ after(grammarAccess.getAtomicExprAccess().getArgExprAssignment_2_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AtomicExpr__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpr__Group_3__0__Impl
	rule__AtomicExpr__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExprAccess().getIntLitAction_3_0()); }
	()
	{ after(grammarAccess.getAtomicExprAccess().getIntLitAction_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpr__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExprAccess().getValueAssignment_3_1()); }
	(rule__AtomicExpr__ValueAssignment_3_1)
	{ after(grammarAccess.getAtomicExprAccess().getValueAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AtomicExpr__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpr__Group_4__0__Impl
	rule__AtomicExpr__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExprAccess().getRealLitExprAction_4_0()); }
	()
	{ after(grammarAccess.getAtomicExprAccess().getRealLitExprAction_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpr__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExprAccess().getValAssignment_4_1()); }
	(rule__AtomicExpr__ValAssignment_4_1)
	{ after(grammarAccess.getAtomicExprAccess().getValAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AtomicExpr__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpr__Group_5__0__Impl
	rule__AtomicExpr__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExprAccess().getBoolLitExprAction_5_0()); }
	()
	{ after(grammarAccess.getAtomicExprAccess().getBoolLitExprAction_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpr__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExprAccess().getValAssignment_5_1()); }
	(rule__AtomicExpr__ValAssignment_5_1)
	{ after(grammarAccess.getAtomicExprAccess().getValAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AtomicExpr__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpr__Group_6__0__Impl
	rule__AtomicExpr__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExprAccess().getFloorCastAction_6_0()); }
	()
	{ after(grammarAccess.getAtomicExprAccess().getFloorCastAction_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpr__Group_6__1__Impl
	rule__AtomicExpr__Group_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExprAccess().getFloorKeyword_6_1()); }
	Floor
	{ after(grammarAccess.getAtomicExprAccess().getFloorKeyword_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_6__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpr__Group_6__2__Impl
	rule__AtomicExpr__Group_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_6__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExprAccess().getLeftParenthesisKeyword_6_2()); }
	LeftParenthesis
	{ after(grammarAccess.getAtomicExprAccess().getLeftParenthesisKeyword_6_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_6__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpr__Group_6__3__Impl
	rule__AtomicExpr__Group_6__4
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_6__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExprAccess().getExprAssignment_6_3()); }
	(rule__AtomicExpr__ExprAssignment_6_3)
	{ after(grammarAccess.getAtomicExprAccess().getExprAssignment_6_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_6__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpr__Group_6__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_6__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExprAccess().getRightParenthesisKeyword_6_4()); }
	RightParenthesis
	{ after(grammarAccess.getAtomicExprAccess().getRightParenthesisKeyword_6_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AtomicExpr__Group_7__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpr__Group_7__0__Impl
	rule__AtomicExpr__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_7__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExprAccess().getRealCastAction_7_0()); }
	()
	{ after(grammarAccess.getAtomicExprAccess().getRealCastAction_7_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_7__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpr__Group_7__1__Impl
	rule__AtomicExpr__Group_7__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_7__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExprAccess().getRealKeyword_7_1()); }
	Real
	{ after(grammarAccess.getAtomicExprAccess().getRealKeyword_7_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_7__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpr__Group_7__2__Impl
	rule__AtomicExpr__Group_7__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_7__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExprAccess().getLeftParenthesisKeyword_7_2()); }
	LeftParenthesis
	{ after(grammarAccess.getAtomicExprAccess().getLeftParenthesisKeyword_7_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_7__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpr__Group_7__3__Impl
	rule__AtomicExpr__Group_7__4
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_7__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExprAccess().getExprAssignment_7_3()); }
	(rule__AtomicExpr__ExprAssignment_7_3)
	{ after(grammarAccess.getAtomicExprAccess().getExprAssignment_7_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_7__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpr__Group_7__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_7__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExprAccess().getRightParenthesisKeyword_7_4()); }
	RightParenthesis
	{ after(grammarAccess.getAtomicExprAccess().getRightParenthesisKeyword_7_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AtomicExpr__Group_8__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpr__Group_8__0__Impl
	rule__AtomicExpr__Group_8__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_8__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExprAccess().getLeftParenthesisKeyword_8_0()); }
	LeftParenthesis
	{ after(grammarAccess.getAtomicExprAccess().getLeftParenthesisKeyword_8_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_8__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpr__Group_8__1__Impl
	rule__AtomicExpr__Group_8__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_8__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExprAccess().getExprParserRuleCall_8_1()); }
	ruleExpr
	{ after(grammarAccess.getAtomicExprAccess().getExprParserRuleCall_8_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_8__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpr__Group_8__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__Group_8__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExprAccess().getRightParenthesisKeyword_8_2()); }
	RightParenthesis
	{ after(grammarAccess.getAtomicExprAccess().getRightParenthesisKeyword_8_2()); }
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
	{ before(grammarAccess.getOtherDataRefAccess().getNamedElementAssignment_0()); }
	(rule__OtherDataRef__NamedElementAssignment_0)
	{ after(grammarAccess.getOtherDataRefAccess().getNamedElementAssignment_0()); }
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


rule__SlangExpr__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangExpr__Group_0__0__Impl
	rule__SlangExpr__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpr__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangExprAccess().getTermsAssignment_0_0()); }
	(rule__SlangExpr__TermsAssignment_0_0)
	{ after(grammarAccess.getSlangExprAccess().getTermsAssignment_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpr__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangExpr__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpr__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangExprAccess().getAlternatives_0_1()); }
	(rule__SlangExpr__Alternatives_0_1)
	{ after(grammarAccess.getSlangExprAccess().getAlternatives_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangExpr__Group_0_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangExpr__Group_0_1_0__0__Impl
	rule__SlangExpr__Group_0_1_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpr__Group_0_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangExprAccess().getOPTerminalRuleCall_0_1_0_0()); }
	RULE_OP
	{ after(grammarAccess.getSlangExprAccess().getOPTerminalRuleCall_0_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpr__Group_0_1_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangExpr__Group_0_1_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpr__Group_0_1_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangExprAccess().getTermsAssignment_0_1_0_1()); }
	(rule__SlangExpr__TermsAssignment_0_1_0_1)
	{ after(grammarAccess.getSlangExprAccess().getTermsAssignment_0_1_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangExpr__Group_0_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangExpr__Group_0_1_1__0__Impl
	rule__SlangExpr__Group_0_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpr__Group_0_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangExprAccess().getQuestionMarkKeyword_0_1_1_0()); }
	QuestionMark
	{ after(grammarAccess.getSlangExprAccess().getQuestionMarkKeyword_0_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpr__Group_0_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangExpr__Group_0_1_1__1__Impl
	rule__SlangExpr__Group_0_1_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpr__Group_0_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangExprAccess().getThenAssignment_0_1_1_1()); }
	(rule__SlangExpr__ThenAssignment_0_1_1_1)
	{ after(grammarAccess.getSlangExprAccess().getThenAssignment_0_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpr__Group_0_1_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangExpr__Group_0_1_1__2__Impl
	rule__SlangExpr__Group_0_1_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpr__Group_0_1_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangExprAccess().getColonKeyword_0_1_1_2()); }
	Colon
	{ after(grammarAccess.getSlangExprAccess().getColonKeyword_0_1_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpr__Group_0_1_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangExpr__Group_0_1_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpr__Group_0_1_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangExprAccess().getElsAssignment_0_1_1_3()); }
	(rule__SlangExpr__ElsAssignment_0_1_1_3)
	{ after(grammarAccess.getSlangExprAccess().getElsAssignment_0_1_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangExpr__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangExpr__Group_1__0__Impl
	rule__SlangExpr__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpr__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangExprAccess().getAlternatives_1_0()); }
	(rule__SlangExpr__Alternatives_1_0)
	{ after(grammarAccess.getSlangExprAccess().getAlternatives_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpr__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangExpr__Group_1__1__Impl
	rule__SlangExpr__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpr__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangExprAccess().getVarAssignment_1_1()); }
	(rule__SlangExpr__VarAssignment_1_1)
	{ after(grammarAccess.getSlangExprAccess().getVarAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpr__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangExpr__Group_1__2__Impl
	rule__SlangExpr__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpr__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangExprAccess().getGroup_1_2()); }
	(rule__SlangExpr__Group_1_2__0)*
	{ after(grammarAccess.getSlangExprAccess().getGroup_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpr__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangExpr__Group_1__3__Impl
	rule__SlangExpr__Group_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpr__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangExprAccess().getEqualsSignGreaterThanSignKeyword_1_3()); }
	EqualsSignGreaterThanSign
	{ after(grammarAccess.getSlangExprAccess().getEqualsSignGreaterThanSignKeyword_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpr__Group_1__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangExpr__Group_1__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpr__Group_1__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangExprAccess().getBodyAssignment_1_4()); }
	(rule__SlangExpr__BodyAssignment_1_4)
	{ after(grammarAccess.getSlangExprAccess().getBodyAssignment_1_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangExpr__Group_1_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangExpr__Group_1_2__0__Impl
	rule__SlangExpr__Group_1_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpr__Group_1_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangExprAccess().getCommaKeyword_1_2_0()); }
	Comma
	{ after(grammarAccess.getSlangExprAccess().getCommaKeyword_1_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpr__Group_1_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangExpr__Group_1_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpr__Group_1_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangExprAccess().getVarAssignment_1_2_1()); }
	(rule__SlangExpr__VarAssignment_1_2_1)
	{ after(grammarAccess.getSlangExprAccess().getVarAssignment_1_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangExpr__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangExpr__Group_2__0__Impl
	rule__SlangExpr__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpr__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangExprAccess().getOPTerminalRuleCall_2_0()); }
	RULE_OP
	{ after(grammarAccess.getSlangExprAccess().getOPTerminalRuleCall_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpr__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangExpr__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpr__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangExprAccess().getSlangAccessParserRuleCall_2_1()); }
	ruleSlangAccess
	{ after(grammarAccess.getSlangExprAccess().getSlangAccessParserRuleCall_2_1()); }
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
	{ before(grammarAccess.getSlangQuantVarAccess().getValAssignment_2()); }
	(rule__SlangQuantVar__ValAssignment_2)
	{ after(grammarAccess.getSlangQuantVarAccess().getValAssignment_2()); }
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
	{ before(grammarAccess.getSlangAccessAccess().getTAssignment_0()); }
	(rule__SlangAccess__TAssignment_0)
	{ after(grammarAccess.getSlangAccessAccess().getTAssignment_0()); }
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
	{ before(grammarAccess.getSlangAccessAccess().getSufAssignment_1()); }
	(rule__SlangAccess__SufAssignment_1)*
	{ after(grammarAccess.getSlangAccessAccess().getSufAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AccessSuffix__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AccessSuffix__Group__0__Impl
	rule__AccessSuffix__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AccessSuffix__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAccessSuffixAccess().getFullStopKeyword_0()); }
	FullStop
	{ after(grammarAccess.getAccessSuffixAccess().getFullStopKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AccessSuffix__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AccessSuffix__Group__1__Impl
	rule__AccessSuffix__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AccessSuffix__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAccessSuffixAccess().getIDTerminalRuleCall_1()); }
	RULE_ID
	{ after(grammarAccess.getAccessSuffixAccess().getIDTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AccessSuffix__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AccessSuffix__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AccessSuffix__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAccessSuffixAccess().getCallSuffixParserRuleCall_2()); }
	(ruleCallSuffix)?
	{ after(grammarAccess.getAccessSuffixAccess().getCallSuffixParserRuleCall_2()); }
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
	{ before(grammarAccess.getSlangTermAccess().getLeftParenthesisKeyword_1_0()); }
	LeftParenthesis
	{ after(grammarAccess.getSlangTermAccess().getLeftParenthesisKeyword_1_0()); }
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
	rule__SlangTerm__Group_1__2
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
	{ before(grammarAccess.getSlangTermAccess().getTupleAssignment_1_1()); }
	(rule__SlangTerm__TupleAssignment_1_1)
	{ after(grammarAccess.getSlangTermAccess().getTupleAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_1__2__Impl
	rule__SlangTerm__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getGroup_1_2()); }
	(rule__SlangTerm__Group_1_2__0)*
	{ after(grammarAccess.getSlangTermAccess().getGroup_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getRightParenthesisKeyword_1_3()); }
	RightParenthesis
	{ after(grammarAccess.getSlangTermAccess().getRightParenthesisKeyword_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SlangTerm__Group_1_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_1_2__0__Impl
	rule__SlangTerm__Group_1_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_1_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getCommaKeyword_1_2_0()); }
	Comma
	{ after(grammarAccess.getSlangTermAccess().getCommaKeyword_1_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_1_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SlangTerm__Group_1_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__Group_1_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSlangTermAccess().getTupleAssignment_1_2_1()); }
	(rule__SlangTerm__TupleAssignment_1_2_1)
	{ after(grammarAccess.getSlangTermAccess().getTupleAssignment_1_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CallSuffix__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CallSuffix__Group_0__0__Impl
	rule__CallSuffix__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CallSuffix__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCallSuffixAccess().getTypeArgsParserRuleCall_0_0()); }
	ruleTypeArgs
	{ after(grammarAccess.getCallSuffixAccess().getTypeArgsParserRuleCall_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CallSuffix__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CallSuffix__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CallSuffix__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCallSuffixAccess().getArgsAssignment_0_1()); }
	(rule__CallSuffix__ArgsAssignment_0_1)?
	{ after(grammarAccess.getCallSuffixAccess().getArgsAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CallArgs__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CallArgs__Group__0__Impl
	rule__CallArgs__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CallArgs__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCallArgsAccess().getLeftParenthesisKeyword_0()); }
	LeftParenthesis
	{ after(grammarAccess.getCallArgsAccess().getLeftParenthesisKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CallArgs__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CallArgs__Group__1__Impl
	rule__CallArgs__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CallArgs__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCallArgsAccess().getGroup_1()); }
	(rule__CallArgs__Group_1__0)?
	{ after(grammarAccess.getCallArgsAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CallArgs__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CallArgs__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CallArgs__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCallArgsAccess().getRightParenthesisKeyword_2()); }
	RightParenthesis
	{ after(grammarAccess.getCallArgsAccess().getRightParenthesisKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CallArgs__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CallArgs__Group_1__0__Impl
	rule__CallArgs__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CallArgs__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCallArgsAccess().getFAssignment_1_0()); }
	(rule__CallArgs__FAssignment_1_0)
	{ after(grammarAccess.getCallArgsAccess().getFAssignment_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CallArgs__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CallArgs__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CallArgs__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCallArgsAccess().getGroup_1_1()); }
	(rule__CallArgs__Group_1_1__0)*
	{ after(grammarAccess.getCallArgsAccess().getGroup_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CallArgs__Group_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CallArgs__Group_1_1__0__Impl
	rule__CallArgs__Group_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CallArgs__Group_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCallArgsAccess().getCommaKeyword_1_1_0()); }
	Comma
	{ after(grammarAccess.getCallArgsAccess().getCommaKeyword_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CallArgs__Group_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CallArgs__Group_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CallArgs__Group_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCallArgsAccess().getFAssignment_1_1_1()); }
	(rule__CallArgs__FAssignment_1_1_1)
	{ after(grammarAccess.getCallArgsAccess().getFAssignment_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__IdExp__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IdExp__Group__0__Impl
	rule__IdExp__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IdExp__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIdExpAccess().getLAssignment_0()); }
	(rule__IdExp__LAssignment_0)
	{ after(grammarAccess.getIdExpAccess().getLAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IdExp__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IdExp__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IdExp__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIdExpAccess().getGroup_1()); }
	(rule__IdExp__Group_1__0)?
	{ after(grammarAccess.getIdExpAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__IdExp__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IdExp__Group_1__0__Impl
	rule__IdExp__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IdExp__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIdExpAccess().getColonEqualsSignKeyword_1_0()); }
	ColonEqualsSign
	{ after(grammarAccess.getIdExpAccess().getColonEqualsSignKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IdExp__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IdExp__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IdExp__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIdExpAccess().getRAssignment_1_1()); }
	(rule__IdExp__RAssignment_1_1)
	{ after(grammarAccess.getIdExpAccess().getRAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Type__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_0__0__Impl
	rule__Type__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getBaseTypeParserRuleCall_0_0()); }
	ruleBaseType
	{ after(grammarAccess.getTypeAccess().getBaseTypeParserRuleCall_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getGroup_0_1()); }
	(rule__Type__Group_0_1__0)*
	{ after(grammarAccess.getTypeAccess().getGroup_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Type__Group_0_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_0_1__0__Impl
	rule__Type__Group_0_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_0_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getEqualsSignGreaterThanSignKeyword_0_1_0()); }
	EqualsSignGreaterThanSign
	{ after(grammarAccess.getTypeAccess().getEqualsSignGreaterThanSignKeyword_0_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_0_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_0_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_0_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getBaseTypeParserRuleCall_0_1_1()); }
	ruleBaseType
	{ after(grammarAccess.getTypeAccess().getBaseTypeParserRuleCall_0_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Type__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_1__0__Impl
	rule__Type__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getMutKeyword_1_0()); }
	Mut
	{ after(grammarAccess.getTypeAccess().getMutKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_1__1__Impl
	rule__Type__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getBaseTypeParserRuleCall_1_1()); }
	ruleBaseType
	{ after(grammarAccess.getTypeAccess().getBaseTypeParserRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTypeAccess().getGroup_1_2()); }
		(rule__Type__Group_1_2__0)
		{ after(grammarAccess.getTypeAccess().getGroup_1_2()); }
	)
	(
		{ before(grammarAccess.getTypeAccess().getGroup_1_2()); }
		(rule__Type__Group_1_2__0)*
		{ after(grammarAccess.getTypeAccess().getGroup_1_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Type__Group_1_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_1_2__0__Impl
	rule__Type__Group_1_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_1_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getEqualsSignGreaterThanSignKeyword_1_2_0()); }
	EqualsSignGreaterThanSign
	{ after(grammarAccess.getTypeAccess().getEqualsSignGreaterThanSignKeyword_1_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_1_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_1_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_1_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getBaseTypeParserRuleCall_1_2_1()); }
	ruleBaseType
	{ after(grammarAccess.getTypeAccess().getBaseTypeParserRuleCall_1_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BaseType__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseType__Group_0__0__Impl
	rule__BaseType__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseType__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseTypeAccess().getQCREFParserRuleCall_0_0()); }
	ruleQCREF
	{ after(grammarAccess.getBaseTypeAccess().getQCREFParserRuleCall_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseType__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseType__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseType__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseTypeAccess().getTypeArgsParserRuleCall_0_1()); }
	(ruleTypeArgs)?
	{ after(grammarAccess.getBaseTypeAccess().getTypeArgsParserRuleCall_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BaseType__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseType__Group_1__0__Impl
	rule__BaseType__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseType__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseTypeAccess().getLeftParenthesisKeyword_1_0()); }
	LeftParenthesis
	{ after(grammarAccess.getBaseTypeAccess().getLeftParenthesisKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseType__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseType__Group_1__1__Impl
	rule__BaseType__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseType__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseTypeAccess().getGroup_1_1()); }
	(rule__BaseType__Group_1_1__0)?
	{ after(grammarAccess.getBaseTypeAccess().getGroup_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseType__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseType__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseType__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseTypeAccess().getRightParenthesisKeyword_1_2()); }
	RightParenthesis
	{ after(grammarAccess.getBaseTypeAccess().getRightParenthesisKeyword_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BaseType__Group_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseType__Group_1_1__0__Impl
	rule__BaseType__Group_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseType__Group_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseTypeAccess().getTypeParserRuleCall_1_1_0()); }
	ruleType
	{ after(grammarAccess.getBaseTypeAccess().getTypeParserRuleCall_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseType__Group_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseType__Group_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseType__Group_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseTypeAccess().getGroup_1_1_1()); }
	(rule__BaseType__Group_1_1_1__0)*
	{ after(grammarAccess.getBaseTypeAccess().getGroup_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BaseType__Group_1_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseType__Group_1_1_1__0__Impl
	rule__BaseType__Group_1_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseType__Group_1_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseTypeAccess().getCommaKeyword_1_1_1_0()); }
	Comma
	{ after(grammarAccess.getBaseTypeAccess().getCommaKeyword_1_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseType__Group_1_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BaseType__Group_1_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BaseType__Group_1_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBaseTypeAccess().getTypeParserRuleCall_1_1_1_1()); }
	ruleType
	{ after(grammarAccess.getBaseTypeAccess().getTypeParserRuleCall_1_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TypeArgs__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeArgs__Group__0__Impl
	rule__TypeArgs__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeArgs__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeArgsAccess().getLeftSquareBracketKeyword_0()); }
	LeftSquareBracket
	{ after(grammarAccess.getTypeArgsAccess().getLeftSquareBracketKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeArgs__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeArgs__Group__1__Impl
	rule__TypeArgs__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeArgs__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeArgsAccess().getTypeParserRuleCall_1()); }
	ruleType
	{ after(grammarAccess.getTypeArgsAccess().getTypeParserRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeArgs__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeArgs__Group__2__Impl
	rule__TypeArgs__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeArgs__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeArgsAccess().getGroup_2()); }
	(rule__TypeArgs__Group_2__0)*
	{ after(grammarAccess.getTypeArgsAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeArgs__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeArgs__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeArgs__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeArgsAccess().getRightSquareBracketKeyword_3()); }
	RightSquareBracket
	{ after(grammarAccess.getTypeArgsAccess().getRightSquareBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TypeArgs__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeArgs__Group_2__0__Impl
	rule__TypeArgs__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeArgs__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeArgsAccess().getCommaKeyword_2_0()); }
	Comma
	{ after(grammarAccess.getTypeArgsAccess().getCommaKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeArgs__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeArgs__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeArgs__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeArgsAccess().getTypeParserRuleCall_2_1()); }
	ruleType
	{ after(grammarAccess.getTypeArgsAccess().getTypeParserRuleCall_2_1()); }
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
	{ before(grammarAccess.getFuncSpecAccess().getDefDefParserRuleCall_0()); }
	ruleDefDef
	{ after(grammarAccess.getFuncSpecAccess().getDefDefParserRuleCall_0()); }
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


rule__Param__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Param__Group__0__Impl
	rule__Param__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Param__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParamAccess().getVarKeyword_0()); }
	(Var)?
	{ after(grammarAccess.getParamAccess().getVarKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Param__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Param__Group__1__Impl
	rule__Param__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Param__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParamAccess().getIDTerminalRuleCall_1()); }
	RULE_ID
	{ after(grammarAccess.getParamAccess().getIDTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Param__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Param__Group__2__Impl
	rule__Param__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Param__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParamAccess().getColonKeyword_2()); }
	Colon
	{ after(grammarAccess.getParamAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Param__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Param__Group__3__Impl
	rule__Param__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Param__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParamAccess().getEqualsSignGreaterThanSignKeyword_3()); }
	(EqualsSignGreaterThanSign)?
	{ after(grammarAccess.getParamAccess().getEqualsSignGreaterThanSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Param__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Param__Group__4__Impl
	rule__Param__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Param__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParamAccess().getTypeParserRuleCall_4()); }
	ruleType
	{ after(grammarAccess.getParamAccess().getTypeParserRuleCall_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Param__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Param__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Param__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParamAccess().getAsteriskKeyword_5()); }
	(Asterisk)?
	{ after(grammarAccess.getParamAccess().getAsteriskKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DefDef__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefDef__Group__0__Impl
	rule__DefDef__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDef__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefDefAccess().getDefModsParserRuleCall_0()); }
	(ruleDefMods)?
	{ after(grammarAccess.getDefDefAccess().getDefModsParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDef__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefDef__Group__1__Impl
	rule__DefDef__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDef__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefDefAccess().getDefExtParserRuleCall_1()); }
	(ruleDefExt)?
	{ after(grammarAccess.getDefDefAccess().getDefExtParserRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDef__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefDef__Group__2__Impl
	rule__DefDef__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDef__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefDefAccess().getNameAssignment_2()); }
	(rule__DefDef__NameAssignment_2)
	{ after(grammarAccess.getDefDefAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDef__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefDef__Group__3__Impl
	rule__DefDef__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDef__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefDefAccess().getTypeParamsParserRuleCall_3()); }
	(ruleTypeParams)?
	{ after(grammarAccess.getDefDefAccess().getTypeParamsParserRuleCall_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDef__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefDef__Group__4__Impl
	rule__DefDef__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDef__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefDefAccess().getArgsAssignment_4()); }
	(rule__DefDef__ArgsAssignment_4)?
	{ after(grammarAccess.getDefDefAccess().getArgsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDef__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefDef__Group__5__Impl
	rule__DefDef__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDef__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefDefAccess().getColonKeyword_5()); }
	Colon
	{ after(grammarAccess.getDefDefAccess().getColonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDef__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefDef__Group__6__Impl
	rule__DefDef__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDef__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefDefAccess().getTypeParserRuleCall_6()); }
	ruleType
	{ after(grammarAccess.getDefDefAccess().getTypeParserRuleCall_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDef__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefDef__Group__7__Impl
	rule__DefDef__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDef__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefDefAccess().getContractAssignment_7()); }
	(rule__DefDef__ContractAssignment_7)?
	{ after(grammarAccess.getDefDefAccess().getContractAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDef__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefDef__Group__8__Impl
	rule__DefDef__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDef__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefDefAccess().getColonEqualsSignKeyword_8()); }
	ColonEqualsSign
	{ after(grammarAccess.getDefDefAccess().getColonEqualsSignKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDef__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefDef__Group__9__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDef__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefDefAccess().getBodyAssignment_9()); }
	(rule__DefDef__BodyAssignment_9)
	{ after(grammarAccess.getDefDefAccess().getBodyAssignment_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DefExt__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefExt__Group__0__Impl
	rule__DefExt__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DefExt__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefExtAccess().getLeftParenthesisKeyword_0()); }
	LeftParenthesis
	{ after(grammarAccess.getDefExtAccess().getLeftParenthesisKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefExt__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefExt__Group__1__Impl
	rule__DefExt__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DefExt__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefExtAccess().getIDTerminalRuleCall_1()); }
	RULE_ID
	{ after(grammarAccess.getDefExtAccess().getIDTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefExt__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefExt__Group__2__Impl
	rule__DefExt__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DefExt__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefExtAccess().getColonKeyword_2()); }
	Colon
	{ after(grammarAccess.getDefExtAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefExt__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefExt__Group__3__Impl
	rule__DefExt__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DefExt__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefExtAccess().getTypeParserRuleCall_3()); }
	ruleType
	{ after(grammarAccess.getDefExtAccess().getTypeParserRuleCall_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefExt__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefExt__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DefExt__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefExtAccess().getRightParenthesisKeyword_4()); }
	RightParenthesis
	{ after(grammarAccess.getDefExtAccess().getRightParenthesisKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DefParams__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefParams__Group__0__Impl
	rule__DefParams__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DefParams__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefParamsAccess().getLeftParenthesisKeyword_0()); }
	LeftParenthesis
	{ after(grammarAccess.getDefParamsAccess().getLeftParenthesisKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefParams__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefParams__Group__1__Impl
	rule__DefParams__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DefParams__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefParamsAccess().getParamsAssignment_1()); }
	(rule__DefParams__ParamsAssignment_1)
	{ after(grammarAccess.getDefParamsAccess().getParamsAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefParams__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefParams__Group__2__Impl
	rule__DefParams__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DefParams__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefParamsAccess().getGroup_2()); }
	(rule__DefParams__Group_2__0)?
	{ after(grammarAccess.getDefParamsAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefParams__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefParams__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DefParams__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefParamsAccess().getRightParenthesisKeyword_3()); }
	RightParenthesis
	{ after(grammarAccess.getDefParamsAccess().getRightParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DefParams__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefParams__Group_2__0__Impl
	rule__DefParams__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DefParams__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefParamsAccess().getCommaKeyword_2_0()); }
	Comma
	{ after(grammarAccess.getDefParamsAccess().getCommaKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefParams__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefParams__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DefParams__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefParamsAccess().getParamsAssignment_2_1()); }
	(rule__DefParams__ParamsAssignment_2_1)
	{ after(grammarAccess.getDefParamsAccess().getParamsAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DefParam__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefParam__Group__0__Impl
	rule__DefParam__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DefParam__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefParamAccess().getNameAssignment_0()); }
	(rule__DefParam__NameAssignment_0)
	{ after(grammarAccess.getDefParamAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefParam__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefParam__Group__1__Impl
	rule__DefParam__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DefParam__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefParamAccess().getColonKeyword_1()); }
	Colon
	{ after(grammarAccess.getDefParamAccess().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefParam__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefParam__Group__2__Impl
	rule__DefParam__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DefParam__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefParamAccess().getEqualsSignGreaterThanSignKeyword_2()); }
	(EqualsSignGreaterThanSign)?
	{ after(grammarAccess.getDefParamAccess().getEqualsSignGreaterThanSignKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefParam__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefParam__Group__3__Impl
	rule__DefParam__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DefParam__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefParamAccess().getTypeNameAssignment_3()); }
	(rule__DefParam__TypeNameAssignment_3)
	{ after(grammarAccess.getDefParamAccess().getTypeNameAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefParam__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefParam__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DefParam__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefParamAccess().getAsteriskKeyword_4()); }
	(Asterisk)?
	{ after(grammarAccess.getDefParamAccess().getAsteriskKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DefContract__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefContract__Group__0__Impl
	rule__DefContract__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DefContract__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefContractAccess().getDefContractAction_0()); }
	()
	{ after(grammarAccess.getDefContractAccess().getDefContractAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefContract__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefContract__Group__1__Impl
	rule__DefContract__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DefContract__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefContractAccess().getSpecKeyword_1()); }
	Spec
	{ after(grammarAccess.getDefContractAccess().getSpecKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefContract__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefContract__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DefContract__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefContractAccess().getAlternatives_2()); }
	(rule__DefContract__Alternatives_2)
	{ after(grammarAccess.getDefContractAccess().getAlternatives_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DefContract__Group_2_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefContract__Group_2_0__0__Impl
	rule__DefContract__Group_2_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DefContract__Group_2_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefContractAccess().getReaAssignment_2_0_0()); }
	(rule__DefContract__ReaAssignment_2_0_0)?
	{ after(grammarAccess.getDefContractAccess().getReaAssignment_2_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefContract__Group_2_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefContract__Group_2_0__1__Impl
	rule__DefContract__Group_2_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DefContract__Group_2_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefContractAccess().getReqAssignment_2_0_1()); }
	(rule__DefContract__ReqAssignment_2_0_1)?
	{ after(grammarAccess.getDefContractAccess().getReqAssignment_2_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefContract__Group_2_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefContract__Group_2_0__2__Impl
	rule__DefContract__Group_2_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DefContract__Group_2_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefContractAccess().getModAssignment_2_0_2()); }
	(rule__DefContract__ModAssignment_2_0_2)?
	{ after(grammarAccess.getDefContractAccess().getModAssignment_2_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefContract__Group_2_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefContract__Group_2_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DefContract__Group_2_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefContractAccess().getEnsAssignment_2_0_3()); }
	(rule__DefContract__EnsAssignment_2_0_3)?
	{ after(grammarAccess.getDefContractAccess().getEnsAssignment_2_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DefContract__Group_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefContract__Group_2_1__0__Impl
	rule__DefContract__Group_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DefContract__Group_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getDefContractAccess().getDccAssignment_2_1_0()); }
		(rule__DefContract__DccAssignment_2_1_0)
		{ after(grammarAccess.getDefContractAccess().getDccAssignment_2_1_0()); }
	)
	(
		{ before(grammarAccess.getDefContractAccess().getDccAssignment_2_1_0()); }
		(rule__DefContract__DccAssignment_2_1_0)*
		{ after(grammarAccess.getDefContractAccess().getDccAssignment_2_1_0()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefContract__Group_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefContract__Group_2_1__1__Impl
	rule__DefContract__Group_2_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DefContract__Group_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefContractAccess().getReaAssignment_2_1_1()); }
	(rule__DefContract__ReaAssignment_2_1_1)?
	{ after(grammarAccess.getDefContractAccess().getReaAssignment_2_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefContract__Group_2_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefContract__Group_2_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DefContract__Group_2_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefContractAccess().getModAssignment_2_1_2()); }
	(rule__DefContract__ModAssignment_2_1_2)?
	{ after(grammarAccess.getDefContractAccess().getModAssignment_2_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DefContractCase__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefContractCase__Group__0__Impl
	rule__DefContractCase__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DefContractCase__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefContractCaseAccess().getDefContractCaseAction_0()); }
	()
	{ after(grammarAccess.getDefContractCaseAccess().getDefContractCaseAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefContractCase__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefContractCase__Group__1__Impl
	rule__DefContractCase__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DefContractCase__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefContractCaseAccess().getCaseKeyword_1()); }
	Case
	{ after(grammarAccess.getDefContractCaseAccess().getCaseKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefContractCase__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefContractCase__Group__2__Impl
	rule__DefContractCase__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DefContractCase__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefContractCaseAccess().getSTRINGTerminalRuleCall_2()); }
	RULE_STRING
	{ after(grammarAccess.getDefContractCaseAccess().getSTRINGTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefContractCase__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefContractCase__Group__3__Impl
	rule__DefContractCase__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DefContractCase__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefContractCaseAccess().getRAssignment_3()); }
	(rule__DefContractCase__RAssignment_3)?
	{ after(grammarAccess.getDefContractCaseAccess().getRAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefContractCase__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefContractCase__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DefContractCase__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefContractCaseAccess().getEAssignment_4()); }
	(rule__DefContractCase__EAssignment_4)?
	{ after(grammarAccess.getDefContractCaseAccess().getEAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TypeParams__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeParams__Group__0__Impl
	rule__TypeParams__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeParams__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeParamsAccess().getLeftSquareBracketKeyword_0()); }
	LeftSquareBracket
	{ after(grammarAccess.getTypeParamsAccess().getLeftSquareBracketKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeParams__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeParams__Group__1__Impl
	rule__TypeParams__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeParams__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeParamsAccess().getTypeParamParserRuleCall_1()); }
	ruleTypeParam
	{ after(grammarAccess.getTypeParamsAccess().getTypeParamParserRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeParams__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeParams__Group__2__Impl
	rule__TypeParams__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeParams__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeParamsAccess().getGroup_2()); }
	(rule__TypeParams__Group_2__0)*
	{ after(grammarAccess.getTypeParamsAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeParams__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeParams__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeParams__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeParamsAccess().getRightSquareBracketKeyword_3()); }
	RightSquareBracket
	{ after(grammarAccess.getTypeParamsAccess().getRightSquareBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TypeParams__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeParams__Group_2__0__Impl
	rule__TypeParams__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeParams__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeParamsAccess().getCommaKeyword_2_0()); }
	Comma
	{ after(grammarAccess.getTypeParamsAccess().getCommaKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeParams__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeParams__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeParams__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeParamsAccess().getTypeParamParserRuleCall_2_1()); }
	ruleTypeParam
	{ after(grammarAccess.getTypeParamsAccess().getTypeParamParserRuleCall_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TypeParam__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeParam__Group__0__Impl
	rule__TypeParam__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeParam__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeParamAccess().getMutKeyword_0()); }
	(Mut)?
	{ after(grammarAccess.getTypeParamAccess().getMutKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeParam__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeParam__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeParam__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeParamAccess().getIDTerminalRuleCall_1()); }
	RULE_ID
	{ after(grammarAccess.getTypeParamAccess().getIDTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Reads__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Reads__Group__0__Impl
	rule__Reads__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Reads__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReadsAccess().getReadsKeyword_0()); }
	Reads
	{ after(grammarAccess.getReadsAccess().getReadsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Reads__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Reads__Group__1__Impl
	rule__Reads__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Reads__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReadsAccess().getEAssignment_1()); }
	(rule__Reads__EAssignment_1)
	{ after(grammarAccess.getReadsAccess().getEAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Reads__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Reads__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Reads__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReadsAccess().getGroup_2()); }
	(rule__Reads__Group_2__0)*
	{ after(grammarAccess.getReadsAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Reads__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Reads__Group_2__0__Impl
	rule__Reads__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Reads__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReadsAccess().getCommaKeyword_2_0()); }
	Comma
	{ after(grammarAccess.getReadsAccess().getCommaKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Reads__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Reads__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Reads__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReadsAccess().getEAssignment_2_1()); }
	(rule__Reads__EAssignment_2_1)
	{ after(grammarAccess.getReadsAccess().getEAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Requires__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Requires__Group__0__Impl
	rule__Requires__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Requires__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiresAccess().getRequiresKeyword_0()); }
	Requires
	{ after(grammarAccess.getRequiresAccess().getRequiresKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Requires__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Requires__Group__1__Impl
	rule__Requires__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Requires__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiresAccess().getEAssignment_1()); }
	(rule__Requires__EAssignment_1)
	{ after(grammarAccess.getRequiresAccess().getEAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Requires__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Requires__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Requires__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiresAccess().getGroup_2()); }
	(rule__Requires__Group_2__0)*
	{ after(grammarAccess.getRequiresAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Requires__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Requires__Group_2__0__Impl
	rule__Requires__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Requires__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiresAccess().getCommaKeyword_2_0()); }
	Comma
	{ after(grammarAccess.getRequiresAccess().getCommaKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Requires__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Requires__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Requires__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiresAccess().getEAssignment_2_1()); }
	(rule__Requires__EAssignment_2_1)
	{ after(grammarAccess.getRequiresAccess().getEAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Modifies__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Modifies__Group__0__Impl
	rule__Modifies__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Modifies__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModifiesAccess().getModifiesKeyword_0()); }
	Modifies
	{ after(grammarAccess.getModifiesAccess().getModifiesKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Modifies__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Modifies__Group__1__Impl
	rule__Modifies__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Modifies__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModifiesAccess().getEAssignment_1()); }
	(rule__Modifies__EAssignment_1)
	{ after(grammarAccess.getModifiesAccess().getEAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Modifies__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Modifies__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Modifies__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModifiesAccess().getGroup_2()); }
	(rule__Modifies__Group_2__0)*
	{ after(grammarAccess.getModifiesAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Modifies__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Modifies__Group_2__0__Impl
	rule__Modifies__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Modifies__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModifiesAccess().getCommaKeyword_2_0()); }
	Comma
	{ after(grammarAccess.getModifiesAccess().getCommaKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Modifies__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Modifies__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Modifies__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModifiesAccess().getEAssignment_2_1()); }
	(rule__Modifies__EAssignment_2_1)
	{ after(grammarAccess.getModifiesAccess().getEAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Ensures__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Ensures__Group__0__Impl
	rule__Ensures__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Ensures__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnsuresAccess().getEnsuresKeyword_0()); }
	Ensures
	{ after(grammarAccess.getEnsuresAccess().getEnsuresKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ensures__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Ensures__Group__1__Impl
	rule__Ensures__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Ensures__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnsuresAccess().getEAssignment_1()); }
	(rule__Ensures__EAssignment_1)
	{ after(grammarAccess.getEnsuresAccess().getEAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ensures__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Ensures__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Ensures__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnsuresAccess().getGroup_2()); }
	(rule__Ensures__Group_2__0)*
	{ after(grammarAccess.getEnsuresAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Ensures__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Ensures__Group_2__0__Impl
	rule__Ensures__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Ensures__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnsuresAccess().getCommaKeyword_2_0()); }
	Comma
	{ after(grammarAccess.getEnsuresAccess().getCommaKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ensures__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Ensures__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Ensures__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnsuresAccess().getEAssignment_2_1()); }
	(rule__Ensures__EAssignment_2_1)
	{ after(grammarAccess.getEnsuresAccess().getEAssignment_2_1()); }
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

rule__SpecSection__FunctionsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSpecSectionAccess().getFunctionsFunctionsParserRuleCall_1_0()); }
		ruleFunctions
		{ after(grammarAccess.getSpecSectionAccess().getFunctionsFunctionsParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecSection__InvariantsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSpecSectionAccess().getInvariantsInvariantsParserRuleCall_2_0()); }
		ruleInvariants
		{ after(grammarAccess.getSpecSectionAccess().getInvariantsInvariantsParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecSection__IntegrationAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSpecSectionAccess().getIntegrationIntegrationParserRuleCall_3_0()); }
		ruleIntegration
		{ after(grammarAccess.getSpecSectionAccess().getIntegrationIntegrationParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecSection__InitializeAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSpecSectionAccess().getInitializeInitializeParserRuleCall_4_0()); }
		ruleInitialize
		{ after(grammarAccess.getSpecSectionAccess().getInitializeInitializeParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecSection__ComputeAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSpecSectionAccess().getComputeComputeParserRuleCall_5_0()); }
		ruleCompute
		{ after(grammarAccess.getSpecSectionAccess().getComputeComputeParserRuleCall_5_0()); }
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

rule__EquivExpr__OpAssignment_1_0_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEquivExprAccess().getOpLessThanSignEqualsSignGreaterThanSignKeyword_1_0_0_1_0()); }
		(
			{ before(grammarAccess.getEquivExprAccess().getOpLessThanSignEqualsSignGreaterThanSignKeyword_1_0_0_1_0()); }
			LessThanSignEqualsSignGreaterThanSign
			{ after(grammarAccess.getEquivExprAccess().getOpLessThanSignEqualsSignGreaterThanSignKeyword_1_0_0_1_0()); }
		)
		{ after(grammarAccess.getEquivExprAccess().getOpLessThanSignEqualsSignGreaterThanSignKeyword_1_0_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EquivExpr__RightAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEquivExprAccess().getRightOrExprParserRuleCall_1_1_0()); }
		ruleOrExpr
		{ after(grammarAccess.getEquivExprAccess().getRightOrExprParserRuleCall_1_1_0()); }
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
		{ before(grammarAccess.getRelationalExprAccess().getRightAddSubExprParserRuleCall_1_1_0()); }
		ruleAddSubExpr
		{ after(grammarAccess.getRelationalExprAccess().getRightAddSubExprParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AddSubExpr__OpAssignment_1_0_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAddSubExprAccess().getOpAlternatives_1_0_0_1_0()); }
		(rule__AddSubExpr__OpAlternatives_1_0_0_1_0)
		{ after(grammarAccess.getAddSubExprAccess().getOpAlternatives_1_0_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AddSubExpr__RightAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAddSubExprAccess().getRightMultDivModExprParserRuleCall_1_1_0()); }
		ruleMultDivModExpr
		{ after(grammarAccess.getAddSubExprAccess().getRightMultDivModExprParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultDivModExpr__OpAssignment_1_0_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMultDivModExprAccess().getOpAlternatives_1_0_0_1_0()); }
		(rule__MultDivModExpr__OpAlternatives_1_0_0_1_0)
		{ after(grammarAccess.getMultDivModExprAccess().getOpAlternatives_1_0_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultDivModExpr__RightAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMultDivModExprAccess().getRightExpExprParserRuleCall_1_1_0()); }
		ruleExpExpr
		{ after(grammarAccess.getMultDivModExprAccess().getRightExpExprParserRuleCall_1_1_0()); }
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

rule__AtomicExpr__PortOrSubcomponentOrStateVarAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicExprAccess().getPortOrSubcomponentOrStateVarEObjectCrossReference_0_1_0()); }
		(
			{ before(grammarAccess.getAtomicExprAccess().getPortOrSubcomponentOrStateVarEObjectIDTerminalRuleCall_0_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getAtomicExprAccess().getPortOrSubcomponentOrStateVarEObjectIDTerminalRuleCall_0_1_0_1()); }
		)
		{ after(grammarAccess.getAtomicExprAccess().getPortOrSubcomponentOrStateVarEObjectCrossReference_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__RefAssignment_0_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicExprAccess().getRefOtherDataRefParserRuleCall_0_2_1_0()); }
		ruleOtherDataRef
		{ after(grammarAccess.getAtomicExprAccess().getRefOtherDataRefParserRuleCall_0_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__CsAssignment_0_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicExprAccess().getCsCallSuffixParserRuleCall_0_3_0()); }
		ruleCallSuffix
		{ after(grammarAccess.getAtomicExprAccess().getCsCallSuffixParserRuleCall_0_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__EnumTypeAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicExprAccess().getEnumTypeDataElementParserRuleCall_1_1_0()); }
		ruleDataElement
		{ after(grammarAccess.getAtomicExprAccess().getEnumTypeDataElementParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__ValueAssignment_1_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicExprAccess().getValueStringLiteralCrossReference_1_3_0()); }
		(
			{ before(grammarAccess.getAtomicExprAccess().getValueStringLiteralIDTerminalRuleCall_1_3_0_1()); }
			RULE_ID
			{ after(grammarAccess.getAtomicExprAccess().getValueStringLiteralIDTerminalRuleCall_1_3_0_1()); }
		)
		{ after(grammarAccess.getAtomicExprAccess().getValueStringLiteralCrossReference_1_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__RecordTypeAssignment_2_0_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicExprAccess().getRecordTypeDataElementParserRuleCall_2_0_0_1_0()); }
		ruleDataElement
		{ after(grammarAccess.getAtomicExprAccess().getRecordTypeDataElementParserRuleCall_2_0_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__ArgsAssignment_2_0_0_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicExprAccess().getArgsNamedElementCrossReference_2_0_0_3_0()); }
		(
			{ before(grammarAccess.getAtomicExprAccess().getArgsNamedElementIDTerminalRuleCall_2_0_0_3_0_1()); }
			RULE_ID
			{ after(grammarAccess.getAtomicExprAccess().getArgsNamedElementIDTerminalRuleCall_2_0_0_3_0_1()); }
		)
		{ after(grammarAccess.getAtomicExprAccess().getArgsNamedElementCrossReference_2_0_0_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__ArgExprAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicExprAccess().getArgExprExprParserRuleCall_2_1_0()); }
		ruleExpr
		{ after(grammarAccess.getAtomicExprAccess().getArgExprExprParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__ArgsAssignment_2_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicExprAccess().getArgsNamedElementCrossReference_2_2_1_0()); }
		(
			{ before(grammarAccess.getAtomicExprAccess().getArgsNamedElementIDTerminalRuleCall_2_2_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getAtomicExprAccess().getArgsNamedElementIDTerminalRuleCall_2_2_1_0_1()); }
		)
		{ after(grammarAccess.getAtomicExprAccess().getArgsNamedElementCrossReference_2_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__ArgExprAssignment_2_2_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicExprAccess().getArgExprExprParserRuleCall_2_2_3_0()); }
		ruleExpr
		{ after(grammarAccess.getAtomicExprAccess().getArgExprExprParserRuleCall_2_2_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__ValueAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicExprAccess().getValueINTEGER_LITTerminalRuleCall_3_1_0()); }
		RULE_INTEGER_LIT
		{ after(grammarAccess.getAtomicExprAccess().getValueINTEGER_LITTerminalRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__ValAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicExprAccess().getValREAL_LITTerminalRuleCall_4_1_0()); }
		RULE_REAL_LIT
		{ after(grammarAccess.getAtomicExprAccess().getValREAL_LITTerminalRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__ValAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicExprAccess().getValBooleanLiteralParserRuleCall_5_1_0()); }
		ruleBooleanLiteral
		{ after(grammarAccess.getAtomicExprAccess().getValBooleanLiteralParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__ExprAssignment_6_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicExprAccess().getExprExprParserRuleCall_6_3_0()); }
		ruleExpr
		{ after(grammarAccess.getAtomicExprAccess().getExprExprParserRuleCall_6_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpr__ExprAssignment_7_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicExprAccess().getExprExprParserRuleCall_7_3_0()); }
		ruleExpr
		{ after(grammarAccess.getAtomicExprAccess().getExprExprParserRuleCall_7_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OtherDataRef__NamedElementAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOtherDataRefAccess().getNamedElementNamedElementCrossReference_0_0()); }
		(
			{ before(grammarAccess.getOtherDataRefAccess().getNamedElementNamedElementIDTerminalRuleCall_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getOtherDataRefAccess().getNamedElementNamedElementIDTerminalRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getOtherDataRefAccess().getNamedElementNamedElementCrossReference_0_0()); }
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

rule__SlangExpr__TermsAssignment_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangExprAccess().getTermsSlangAccessParserRuleCall_0_0_0()); }
		ruleSlangAccess
		{ after(grammarAccess.getSlangExprAccess().getTermsSlangAccessParserRuleCall_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpr__TermsAssignment_0_1_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangExprAccess().getTermsSlangAccessParserRuleCall_0_1_0_1_0()); }
		ruleSlangAccess
		{ after(grammarAccess.getSlangExprAccess().getTermsSlangAccessParserRuleCall_0_1_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpr__ThenAssignment_0_1_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangExprAccess().getThenSlangExprParserRuleCall_0_1_1_1_0()); }
		ruleSlangExpr
		{ after(grammarAccess.getSlangExprAccess().getThenSlangExprParserRuleCall_0_1_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpr__ElsAssignment_0_1_1_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangExprAccess().getElsSlangExprParserRuleCall_0_1_1_3_0()); }
		ruleSlangExpr
		{ after(grammarAccess.getSlangExprAccess().getElsSlangExprParserRuleCall_0_1_1_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpr__VarAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangExprAccess().getVarSlangQuantVarParserRuleCall_1_1_0()); }
		ruleSlangQuantVar
		{ after(grammarAccess.getSlangExprAccess().getVarSlangQuantVarParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpr__VarAssignment_1_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangExprAccess().getVarSlangQuantVarParserRuleCall_1_2_1_0()); }
		ruleSlangQuantVar
		{ after(grammarAccess.getSlangExprAccess().getVarSlangQuantVarParserRuleCall_1_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangExpr__BodyAssignment_1_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangExprAccess().getBodySlangExprParserRuleCall_1_4_0()); }
		ruleSlangExpr
		{ after(grammarAccess.getSlangExprAccess().getBodySlangExprParserRuleCall_1_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangQuantVar__ValAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangQuantVarAccess().getValSlangExprParserRuleCall_2_0()); }
		ruleSlangExpr
		{ after(grammarAccess.getSlangQuantVarAccess().getValSlangExprParserRuleCall_2_0()); }
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
		{ before(grammarAccess.getSlangQuantVarAccess().getUpperBoundSlangExprParserRuleCall_3_1_0()); }
		ruleSlangExpr
		{ after(grammarAccess.getSlangQuantVarAccess().getUpperBoundSlangExprParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangAccess__TAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangAccessAccess().getTSlangTermParserRuleCall_0_0()); }
		ruleSlangTerm
		{ after(grammarAccess.getSlangAccessAccess().getTSlangTermParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangAccess__SufAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangAccessAccess().getSufAccessSuffixParserRuleCall_1_0()); }
		ruleAccessSuffix
		{ after(grammarAccess.getSlangAccessAccess().getSufAccessSuffixParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__TupleAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangTermAccess().getTupleSlangExprParserRuleCall_1_1_0()); }
		ruleSlangExpr
		{ after(grammarAccess.getSlangTermAccess().getTupleSlangExprParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SlangTerm__TupleAssignment_1_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSlangTermAccess().getTupleSlangExprParserRuleCall_1_2_1_0()); }
		ruleSlangExpr
		{ after(grammarAccess.getSlangTermAccess().getTupleSlangExprParserRuleCall_1_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CallSuffix__ArgsAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCallSuffixAccess().getArgsCallArgsParserRuleCall_0_1_0()); }
		ruleCallArgs
		{ after(grammarAccess.getCallSuffixAccess().getArgsCallArgsParserRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CallSuffix__ArgsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCallSuffixAccess().getArgsCallArgsParserRuleCall_1_0()); }
		ruleCallArgs
		{ after(grammarAccess.getCallSuffixAccess().getArgsCallArgsParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CallArgs__FAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCallArgsAccess().getFIdExpParserRuleCall_1_0_0()); }
		ruleIdExp
		{ after(grammarAccess.getCallArgsAccess().getFIdExpParserRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CallArgs__FAssignment_1_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCallArgsAccess().getFIdExpParserRuleCall_1_1_1_0()); }
		ruleIdExp
		{ after(grammarAccess.getCallArgsAccess().getFIdExpParserRuleCall_1_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IdExp__LAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIdExpAccess().getLExprParserRuleCall_0_0()); }
		ruleExpr
		{ after(grammarAccess.getIdExpAccess().getLExprParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IdExp__RAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIdExpAccess().getRExprParserRuleCall_1_1_0()); }
		ruleExpr
		{ after(grammarAccess.getIdExpAccess().getRExprParserRuleCall_1_1_0()); }
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

rule__DefDef__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefDefAccess().getNameDefIDParserRuleCall_2_0()); }
		ruleDefID
		{ after(grammarAccess.getDefDefAccess().getNameDefIDParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDef__ArgsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefDefAccess().getArgsDefParamsParserRuleCall_4_0()); }
		ruleDefParams
		{ after(grammarAccess.getDefDefAccess().getArgsDefParamsParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDef__ContractAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefDefAccess().getContractDefContractParserRuleCall_7_0()); }
		ruleDefContract
		{ after(grammarAccess.getDefDefAccess().getContractDefContractParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefDef__BodyAssignment_9
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefDefAccess().getBodyExprParserRuleCall_9_0()); }
		ruleExpr
		{ after(grammarAccess.getDefDefAccess().getBodyExprParserRuleCall_9_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefParams__ParamsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefParamsAccess().getParamsDefParamParserRuleCall_1_0()); }
		ruleDefParam
		{ after(grammarAccess.getDefParamsAccess().getParamsDefParamParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefParams__ParamsAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefParamsAccess().getParamsDefParamParserRuleCall_2_1_0()); }
		ruleDefParam
		{ after(grammarAccess.getDefParamsAccess().getParamsDefParamParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefParam__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefParamAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getDefParamAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefParam__TypeNameAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefParamAccess().getTypeNameDataSubcomponentTypeCrossReference_3_0()); }
		(
			{ before(grammarAccess.getDefParamAccess().getTypeNameDataSubcomponentTypeQCREFParserRuleCall_3_0_1()); }
			ruleQCREF
			{ after(grammarAccess.getDefParamAccess().getTypeNameDataSubcomponentTypeQCREFParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getDefParamAccess().getTypeNameDataSubcomponentTypeCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefContract__ReaAssignment_2_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefContractAccess().getReaReadsParserRuleCall_2_0_0_0()); }
		ruleReads
		{ after(grammarAccess.getDefContractAccess().getReaReadsParserRuleCall_2_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefContract__ReqAssignment_2_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefContractAccess().getReqRequiresParserRuleCall_2_0_1_0()); }
		ruleRequires
		{ after(grammarAccess.getDefContractAccess().getReqRequiresParserRuleCall_2_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefContract__ModAssignment_2_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefContractAccess().getModModifiesParserRuleCall_2_0_2_0()); }
		ruleModifies
		{ after(grammarAccess.getDefContractAccess().getModModifiesParserRuleCall_2_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefContract__EnsAssignment_2_0_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefContractAccess().getEnsEnsuresParserRuleCall_2_0_3_0()); }
		ruleEnsures
		{ after(grammarAccess.getDefContractAccess().getEnsEnsuresParserRuleCall_2_0_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefContract__DccAssignment_2_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefContractAccess().getDccDefContractCaseParserRuleCall_2_1_0_0()); }
		ruleDefContractCase
		{ after(grammarAccess.getDefContractAccess().getDccDefContractCaseParserRuleCall_2_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefContract__ReaAssignment_2_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefContractAccess().getReaReadsParserRuleCall_2_1_1_0()); }
		ruleReads
		{ after(grammarAccess.getDefContractAccess().getReaReadsParserRuleCall_2_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefContract__ModAssignment_2_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefContractAccess().getModModifiesParserRuleCall_2_1_2_0()); }
		ruleModifies
		{ after(grammarAccess.getDefContractAccess().getModModifiesParserRuleCall_2_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefContractCase__RAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefContractCaseAccess().getRRequiresParserRuleCall_3_0()); }
		ruleRequires
		{ after(grammarAccess.getDefContractCaseAccess().getRRequiresParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefContractCase__EAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefContractCaseAccess().getEEnsuresParserRuleCall_4_0()); }
		ruleEnsures
		{ after(grammarAccess.getDefContractCaseAccess().getEEnsuresParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Reads__EAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReadsAccess().getEExprParserRuleCall_1_0()); }
		ruleExpr
		{ after(grammarAccess.getReadsAccess().getEExprParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Reads__EAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReadsAccess().getEExprParserRuleCall_2_1_0()); }
		ruleExpr
		{ after(grammarAccess.getReadsAccess().getEExprParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Requires__EAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRequiresAccess().getEExprParserRuleCall_1_0()); }
		ruleExpr
		{ after(grammarAccess.getRequiresAccess().getEExprParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Requires__EAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRequiresAccess().getEExprParserRuleCall_2_1_0()); }
		ruleExpr
		{ after(grammarAccess.getRequiresAccess().getEExprParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Modifies__EAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModifiesAccess().getEExprParserRuleCall_1_0()); }
		ruleExpr
		{ after(grammarAccess.getModifiesAccess().getEExprParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Modifies__EAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModifiesAccess().getEExprParserRuleCall_2_1_0()); }
		ruleExpr
		{ after(grammarAccess.getModifiesAccess().getEExprParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ensures__EAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnsuresAccess().getEExprParserRuleCall_1_0()); }
		ruleExpr
		{ after(grammarAccess.getEnsuresAccess().getEExprParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ensures__EAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnsuresAccess().getEExprParserRuleCall_2_1_0()); }
		ruleExpr
		{ after(grammarAccess.getEnsuresAccess().getEExprParserRuleCall_2_1_0()); }
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
