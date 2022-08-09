
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
package org.sireum.aadl.gumbo.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.sireum.aadl.gumbo.services.GumboGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractGumboSyntacticSequencer extends AbstractSyntacticSequencer {

	protected GumboGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Compute_CasesKeyword_4_0_q;
	protected AbstractElementAlias match_Expr_AllKeyword_1_1_0_or_ForAllKeyword_1_1_2_or_SomeKeyword_1_1_1_or_ThereExistsKeyword_1_1_3;
	protected AbstractElementAlias match_SlangDefDeclDef_SlangDefModsParserRuleCall_1_q;
	protected AbstractElementAlias match_SlangDefDecl_SlangDefModsParserRuleCall_1_q;
	protected AbstractElementAlias match_SlangExt___ForKeyword_3_0_SlangNameParserRuleCall_3_1__q;
	protected AbstractElementAlias match_SlangForRange_FullStopFullStopKeyword_3_0_0_or_FullStopFullStopLessThanSignKeyword_3_0_1;
	protected AbstractElementAlias match_SlangParam_AsteriskKeyword_5_q;
	protected AbstractElementAlias match_SlangParam_EqualsSignGreaterThanSignKeyword_3_q;
	protected AbstractElementAlias match_SlangParam_VarKeyword_0_q;
	protected AbstractElementAlias match_SlangQuantVar_FullStopFullStopKeyword_3_0_0_or_FullStopFullStopLessThanSignKeyword_3_0_1;
	protected AbstractElementAlias match_SlangStmt_ColonEqualsSignKeyword_9_2_1_1_0_0_or_DEFOPTerminalRuleCall_9_2_1_1_0_1;
	protected AbstractElementAlias match_SlangStmt_ColonKeyword_9_2_0_q;
	protected AbstractElementAlias match_SlangStmt_SLANG_STRINGTerminalRuleCall_5_3_q;
	protected AbstractElementAlias match_SlangStmt_SLANG_STRINGTerminalRuleCall_6_3_q;
	protected AbstractElementAlias match_SlangStmt_SLANG_STRINGTerminalRuleCall_7_2_q;
	protected AbstractElementAlias match_SlangTPattern_IDTerminalRuleCall_0_1_or__Keyword_2_1;
	protected AbstractElementAlias match_SlangVarDeclDef_SpecKeyword_1_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (GumboGrammarAccess) access;
		match_Compute_CasesKeyword_4_0_q = new TokenAlias(false, true, grammarAccess.getComputeAccess().getCasesKeyword_4_0());
		match_Expr_AllKeyword_1_1_0_or_ForAllKeyword_1_1_2_or_SomeKeyword_1_1_1_or_ThereExistsKeyword_1_1_3 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getExprAccess().getAllKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getExprAccess().getForAllKeyword_1_1_2()), new TokenAlias(false, false, grammarAccess.getExprAccess().getSomeKeyword_1_1_1()), new TokenAlias(false, false, grammarAccess.getExprAccess().getThereExistsKeyword_1_1_3()));
		match_SlangDefDeclDef_SlangDefModsParserRuleCall_1_q = new TokenAlias(false, true, grammarAccess.getSlangDefDeclDefAccess().getSlangDefModsParserRuleCall_1());
		match_SlangDefDecl_SlangDefModsParserRuleCall_1_q = new TokenAlias(false, true, grammarAccess.getSlangDefDeclAccess().getSlangDefModsParserRuleCall_1());
		match_SlangExt___ForKeyword_3_0_SlangNameParserRuleCall_3_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSlangExtAccess().getForKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getSlangExtAccess().getSlangNameParserRuleCall_3_1()));
		match_SlangForRange_FullStopFullStopKeyword_3_0_0_or_FullStopFullStopLessThanSignKeyword_3_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getSlangForRangeAccess().getFullStopFullStopKeyword_3_0_0()), new TokenAlias(false, false, grammarAccess.getSlangForRangeAccess().getFullStopFullStopLessThanSignKeyword_3_0_1()));
		match_SlangParam_AsteriskKeyword_5_q = new TokenAlias(false, true, grammarAccess.getSlangParamAccess().getAsteriskKeyword_5());
		match_SlangParam_EqualsSignGreaterThanSignKeyword_3_q = new TokenAlias(false, true, grammarAccess.getSlangParamAccess().getEqualsSignGreaterThanSignKeyword_3());
		match_SlangParam_VarKeyword_0_q = new TokenAlias(false, true, grammarAccess.getSlangParamAccess().getVarKeyword_0());
		match_SlangQuantVar_FullStopFullStopKeyword_3_0_0_or_FullStopFullStopLessThanSignKeyword_3_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getSlangQuantVarAccess().getFullStopFullStopKeyword_3_0_0()), new TokenAlias(false, false, grammarAccess.getSlangQuantVarAccess().getFullStopFullStopLessThanSignKeyword_3_0_1()));
		match_SlangStmt_ColonEqualsSignKeyword_9_2_1_1_0_0_or_DEFOPTerminalRuleCall_9_2_1_1_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getSlangStmtAccess().getColonEqualsSignKeyword_9_2_1_1_0_0()), new TokenAlias(false, false, grammarAccess.getSlangStmtAccess().getDEFOPTerminalRuleCall_9_2_1_1_0_1()));
		match_SlangStmt_ColonKeyword_9_2_0_q = new TokenAlias(false, true, grammarAccess.getSlangStmtAccess().getColonKeyword_9_2_0());
		match_SlangStmt_SLANG_STRINGTerminalRuleCall_5_3_q = new TokenAlias(false, true, grammarAccess.getSlangStmtAccess().getSLANG_STRINGTerminalRuleCall_5_3());
		match_SlangStmt_SLANG_STRINGTerminalRuleCall_6_3_q = new TokenAlias(false, true, grammarAccess.getSlangStmtAccess().getSLANG_STRINGTerminalRuleCall_6_3());
		match_SlangStmt_SLANG_STRINGTerminalRuleCall_7_2_q = new TokenAlias(false, true, grammarAccess.getSlangStmtAccess().getSLANG_STRINGTerminalRuleCall_7_2());
		match_SlangTPattern_IDTerminalRuleCall_0_1_or__Keyword_2_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getSlangTPatternAccess().getIDTerminalRuleCall_0_1()), new TokenAlias(false, false, grammarAccess.getSlangTPatternAccess().get_Keyword_2_1()));
		match_SlangVarDeclDef_SpecKeyword_1_q = new TokenAlias(false, true, grammarAccess.getSlangVarDeclDefAccess().getSpecKeyword_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getAppliesToKeywordsRule())
			return getAppliesToKeywordsToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDEFOPRule())
			return getDEFOPToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getInBindingKeywordsRule())
			return getInBindingKeywordsToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getInModesKeywordsRule())
			return getInModesKeywordsToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getMSPERule())
			return getMSPEToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getMSPMRule())
			return getMSPMToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSLANG_STRINGRule())
			return getSLANG_STRINGToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSlangDefModsRule())
			return getSlangDefModsToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSlangNameRule())
			return getSlangNameToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSlangVarModRule())
			return getSlangVarModToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * AppliesToKeywords:
	 * 	'applies' 'to'
	 * ;
	 */
	protected String getAppliesToKeywordsToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "applies to";
	}
	
	/**
	 * terminal DEFOP: ':' OPSYM* '=' ;
	 */
	protected String getDEFOPToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ":=";
	}
	
	/**
	 * terminal ID:	('a'..'z'
	 *         |'A'..'Z'
	 *         ) ( ('_')? ('a'..'z'
	 *         |'A'..'Z'
	 *         |'0'..'9'))*;
	 */
	protected String getIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * InBindingKeywords:
	 * 	'in' 'binding'
	 * ;
	 */
	protected String getInBindingKeywordsToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "in binding";
	}
	
	/**
	 * InModesKeywords:
	 * 	'in' 'modes'
	 * ;
	 */
	protected String getInModesKeywordsToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "in modes";
	}
	
	/**
	 * terminal MSPE: '$' MSPI* ( '"""' | '""""' | '"""""' ) ;
	 */
	protected String getMSPEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "$\"\"\"";
	}
	
	/**
	 * terminal MSPM: '$' MSPI* '$' ;
	 */
	protected String getMSPMToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "$$";
	}
	
	/**
	 * terminal SLANG_STRING: '"' ( ESC_SEQ | !( '\\' | '"' ) )* '"' ;
	 */
	protected String getSLANG_STRINGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	
	/**
	 * SlangDefMods: '@strictpure';
	 */
	protected String getSlangDefModsToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "@strictpure";
	}
	
	/**
	 * SlangName: ID ( '.' ID )* ;
	 */
	protected String getSlangNameToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * SlangVarMod: 'val' | 'var' ;
	 */
	protected String getSlangVarModToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "val";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Compute_CasesKeyword_4_0_q.equals(syntax))
				emit_Compute_CasesKeyword_4_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Expr_AllKeyword_1_1_0_or_ForAllKeyword_1_1_2_or_SomeKeyword_1_1_1_or_ThereExistsKeyword_1_1_3.equals(syntax))
				emit_Expr_AllKeyword_1_1_0_or_ForAllKeyword_1_1_2_or_SomeKeyword_1_1_1_or_ThereExistsKeyword_1_1_3(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SlangDefDeclDef_SlangDefModsParserRuleCall_1_q.equals(syntax))
				emit_SlangDefDeclDef_SlangDefModsParserRuleCall_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SlangDefDecl_SlangDefModsParserRuleCall_1_q.equals(syntax))
				emit_SlangDefDecl_SlangDefModsParserRuleCall_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SlangExt___ForKeyword_3_0_SlangNameParserRuleCall_3_1__q.equals(syntax))
				emit_SlangExt___ForKeyword_3_0_SlangNameParserRuleCall_3_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SlangForRange_FullStopFullStopKeyword_3_0_0_or_FullStopFullStopLessThanSignKeyword_3_0_1.equals(syntax))
				emit_SlangForRange_FullStopFullStopKeyword_3_0_0_or_FullStopFullStopLessThanSignKeyword_3_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SlangParam_AsteriskKeyword_5_q.equals(syntax))
				emit_SlangParam_AsteriskKeyword_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SlangParam_EqualsSignGreaterThanSignKeyword_3_q.equals(syntax))
				emit_SlangParam_EqualsSignGreaterThanSignKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SlangParam_VarKeyword_0_q.equals(syntax))
				emit_SlangParam_VarKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SlangQuantVar_FullStopFullStopKeyword_3_0_0_or_FullStopFullStopLessThanSignKeyword_3_0_1.equals(syntax))
				emit_SlangQuantVar_FullStopFullStopKeyword_3_0_0_or_FullStopFullStopLessThanSignKeyword_3_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SlangStmt_ColonEqualsSignKeyword_9_2_1_1_0_0_or_DEFOPTerminalRuleCall_9_2_1_1_0_1.equals(syntax))
				emit_SlangStmt_ColonEqualsSignKeyword_9_2_1_1_0_0_or_DEFOPTerminalRuleCall_9_2_1_1_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SlangStmt_ColonKeyword_9_2_0_q.equals(syntax))
				emit_SlangStmt_ColonKeyword_9_2_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SlangStmt_SLANG_STRINGTerminalRuleCall_5_3_q.equals(syntax))
				emit_SlangStmt_SLANG_STRINGTerminalRuleCall_5_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SlangStmt_SLANG_STRINGTerminalRuleCall_6_3_q.equals(syntax))
				emit_SlangStmt_SLANG_STRINGTerminalRuleCall_6_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SlangStmt_SLANG_STRINGTerminalRuleCall_7_2_q.equals(syntax))
				emit_SlangStmt_SLANG_STRINGTerminalRuleCall_7_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SlangTPattern_IDTerminalRuleCall_0_1_or__Keyword_2_1.equals(syntax))
				emit_SlangTPattern_IDTerminalRuleCall_0_1_or__Keyword_2_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SlangVarDeclDef_SpecKeyword_1_q.equals(syntax))
				emit_SlangVarDeclDef_SpecKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'cases'?
	 *
	 * This ambiguous syntax occurs at:
	 *     cases+=CaseStatementClause (ambiguity) cases+=CaseStatementClause
	 
	 * </pre>
	 */
	protected void emit_Compute_CasesKeyword_4_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '\all' | '\some' | '∀' | '∃'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) qVar+=SlangQuantVar
	 
	 * </pre>
	 */
	protected void emit_Expr_AllKeyword_1_1_0_or_ForAllKeyword_1_1_2_or_SomeKeyword_1_1_1_or_ThereExistsKeyword_1_1_3(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     SlangDefMods?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'def' (ambiguity) name=SlangDefID
	 *     (rule start) 'def' (ambiguity) sde=SlangDefExt
	 
	 * </pre>
	 */
	protected void emit_SlangDefDeclDef_SlangDefModsParserRuleCall_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     SlangDefMods?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'def' (ambiguity) name=SlangDefID
	 *     (rule start) 'def' (ambiguity) sde=SlangDefExt
	 
	 * </pre>
	 */
	protected void emit_SlangDefDecl_SlangDefModsParserRuleCall_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('for' SlangName)?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'extension' ID (ambiguity) '{' '}' (rule start)
	 *     (rule start) 'extension' ID (ambiguity) '{' decl+=SlangDefDecl
	 
	 * </pre>
	 */
	protected void emit_SlangExt___ForKeyword_3_0_SlangNameParserRuleCall_3_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '..' | '..&lt;'
	 *
	 * This ambiguous syntax occurs at:
	 *     e=Expr (ambiguity) upper=Expr
	 
	 * </pre>
	 */
	protected void emit_SlangForRange_FullStopFullStopKeyword_3_0_0_or_FullStopFullStopLessThanSignKeyword_3_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '*'?
	 *
	 * This ambiguous syntax occurs at:
	 *     typeName=SlangType (ambiguity) (rule end)
	 
	 * </pre>
	 */
	protected void emit_SlangParam_AsteriskKeyword_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '=&gt;'?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID ':' (ambiguity) typeName=SlangType
	 
	 * </pre>
	 */
	protected void emit_SlangParam_EqualsSignGreaterThanSignKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'var'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) name=ID
	 
	 * </pre>
	 */
	protected void emit_SlangParam_VarKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '..' | '..&lt;'
	 *
	 * This ambiguous syntax occurs at:
	 *     e=Expr (ambiguity) upperBound=Expr
	 
	 * </pre>
	 */
	protected void emit_SlangQuantVar_FullStopFullStopKeyword_3_0_0_or_FullStopFullStopLessThanSignKeyword_3_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ':=' | DEFOP
	 *
	 * This ambiguous syntax occurs at:
	 *     l+=SlangLHSSuffix (ambiguity) e=Expr
	 *     portOrSubcomponentOrStateVar=[EObject|ID] (ambiguity) e=Expr
	 
	 * </pre>
	 */
	protected void emit_SlangStmt_ColonEqualsSignKeyword_9_2_1_1_0_0_or_DEFOPTerminalRuleCall_9_2_1_1_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ':'?
	 *
	 * This ambiguous syntax occurs at:
	 *     portOrSubcomponentOrStateVar=[EObject|ID] (ambiguity) (rule end)
	 
	 * </pre>
	 */
	protected void emit_SlangStmt_ColonKeyword_9_2_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     SLANG_STRING?
	 *
	 * This ambiguous syntax occurs at:
	 *     e=Expr (ambiguity) (rule end)
	 
	 * </pre>
	 */
	protected void emit_SlangStmt_SLANG_STRINGTerminalRuleCall_5_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     SLANG_STRING?
	 *
	 * This ambiguous syntax occurs at:
	 *     e=Expr (ambiguity) (rule end)
	 
	 * </pre>
	 */
	protected void emit_SlangStmt_SLANG_STRINGTerminalRuleCall_6_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     SLANG_STRING?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'halt' (ambiguity) (rule start)
	 
	 * </pre>
	 */
	protected void emit_SlangStmt_SLANG_STRINGTerminalRuleCall_7_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ID | '_'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 
	 * </pre>
	 */
	protected void emit_SlangTPattern_IDTerminalRuleCall_0_1_or__Keyword_2_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'spec'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) SlangVarMod (ambiguity) name=ID
	 
	 * </pre>
	 */
	protected void emit_SlangVarDeclDef_SpecKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
