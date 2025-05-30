
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
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.sireum.aadl.gumbo.services.GumboGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractGumboSyntacticSequencer extends AbstractSyntacticSequencer {

	protected GumboGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Compute_CasesKeyword_5_0_q;
	protected AbstractElementAlias match_HandlerClause_CasesKeyword_6_0_q;
	protected AbstractElementAlias match_SlangForRange_FullStopFullStopKeyword_3_0_0_or_FullStopFullStopLessThanSignKeyword_3_0_1;
	protected AbstractElementAlias match_SlangParam_AsteriskKeyword_5_q;
	protected AbstractElementAlias match_SlangParam_EqualsSignGreaterThanSignKeyword_3_q;
	protected AbstractElementAlias match_SlangParam_VarKeyword_0_q;
	protected AbstractElementAlias match_SlangStmt_STRING_VALUETerminalRuleCall_5_3_q;
	protected AbstractElementAlias match_SlangStmt_STRING_VALUETerminalRuleCall_6_3_q;
	protected AbstractElementAlias match_SlangStmt_STRING_VALUETerminalRuleCall_7_2_q;
	protected AbstractElementAlias match_SlangTPattern_IDTerminalRuleCall_0_1_or__Keyword_2_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (GumboGrammarAccess) access;
		match_Compute_CasesKeyword_5_0_q = new TokenAlias(false, true, grammarAccess.getComputeAccess().getCasesKeyword_5_0());
		match_HandlerClause_CasesKeyword_6_0_q = new TokenAlias(false, true, grammarAccess.getHandlerClauseAccess().getCasesKeyword_6_0());
		match_SlangForRange_FullStopFullStopKeyword_3_0_0_or_FullStopFullStopLessThanSignKeyword_3_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getSlangForRangeAccess().getFullStopFullStopKeyword_3_0_0()), new TokenAlias(false, false, grammarAccess.getSlangForRangeAccess().getFullStopFullStopLessThanSignKeyword_3_0_1()));
		match_SlangParam_AsteriskKeyword_5_q = new TokenAlias(false, true, grammarAccess.getSlangParamAccess().getAsteriskKeyword_5());
		match_SlangParam_EqualsSignGreaterThanSignKeyword_3_q = new TokenAlias(false, true, grammarAccess.getSlangParamAccess().getEqualsSignGreaterThanSignKeyword_3());
		match_SlangParam_VarKeyword_0_q = new TokenAlias(false, true, grammarAccess.getSlangParamAccess().getVarKeyword_0());
		match_SlangStmt_STRING_VALUETerminalRuleCall_5_3_q = new TokenAlias(false, true, grammarAccess.getSlangStmtAccess().getSTRING_VALUETerminalRuleCall_5_3());
		match_SlangStmt_STRING_VALUETerminalRuleCall_6_3_q = new TokenAlias(false, true, grammarAccess.getSlangStmtAccess().getSTRING_VALUETerminalRuleCall_6_3());
		match_SlangStmt_STRING_VALUETerminalRuleCall_7_2_q = new TokenAlias(false, true, grammarAccess.getSlangStmtAccess().getSTRING_VALUETerminalRuleCall_7_2());
		match_SlangTPattern_IDTerminalRuleCall_0_1_or__Keyword_2_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getSlangTPatternAccess().getIDTerminalRuleCall_0_1()), new TokenAlias(false, false, grammarAccess.getSlangTPatternAccess().get_Keyword_2_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getAppliesToKeywordsRule())
			return getAppliesToKeywordsToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getInBindingKeywordsRule())
			return getInBindingKeywordsToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getInModesKeywordsRule())
			return getInModesKeywordsToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSTRING_VALUERule())
			return getSTRING_VALUEToken(semanticObject, ruleCall, node);
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
	 * terminal STRING_VALUE: '"' ( ESC_SEQ | !( '\\' | '"' ) )* '"' ;
	 */
	protected String getSTRING_VALUEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
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
			if (match_Compute_CasesKeyword_5_0_q.equals(syntax))
				emit_Compute_CasesKeyword_5_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_HandlerClause_CasesKeyword_6_0_q.equals(syntax))
				emit_HandlerClause_CasesKeyword_6_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SlangForRange_FullStopFullStopKeyword_3_0_0_or_FullStopFullStopLessThanSignKeyword_3_0_1.equals(syntax))
				emit_SlangForRange_FullStopFullStopKeyword_3_0_0_or_FullStopFullStopLessThanSignKeyword_3_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SlangParam_AsteriskKeyword_5_q.equals(syntax))
				emit_SlangParam_AsteriskKeyword_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SlangParam_EqualsSignGreaterThanSignKeyword_3_q.equals(syntax))
				emit_SlangParam_EqualsSignGreaterThanSignKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SlangParam_VarKeyword_0_q.equals(syntax))
				emit_SlangParam_VarKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SlangStmt_STRING_VALUETerminalRuleCall_5_3_q.equals(syntax))
				emit_SlangStmt_STRING_VALUETerminalRuleCall_5_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SlangStmt_STRING_VALUETerminalRuleCall_6_3_q.equals(syntax))
				emit_SlangStmt_STRING_VALUETerminalRuleCall_6_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SlangStmt_STRING_VALUETerminalRuleCall_7_2_q.equals(syntax))
				emit_SlangStmt_STRING_VALUETerminalRuleCall_7_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SlangTPattern_IDTerminalRuleCall_0_1_or__Keyword_2_1.equals(syntax))
				emit_SlangTPattern_IDTerminalRuleCall_0_1_or__Keyword_2_1(semanticObject, getLastNavigableState(), syntaxNodes);
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
	protected void emit_Compute_CasesKeyword_5_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
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
	protected void emit_HandlerClause_CasesKeyword_6_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '..' | '..&lt;'
	 *
	 * This ambiguous syntax occurs at:
	 *     e=OwnedExpression (ambiguity) upper=OwnedExpression
	 
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
	 *     STRING_VALUE?
	 *
	 * This ambiguous syntax occurs at:
	 *     e=OwnedExpression (ambiguity) (rule end)
	 
	 * </pre>
	 */
	protected void emit_SlangStmt_STRING_VALUETerminalRuleCall_5_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     STRING_VALUE?
	 *
	 * This ambiguous syntax occurs at:
	 *     e=OwnedExpression (ambiguity) (rule end)
	 
	 * </pre>
	 */
	protected void emit_SlangStmt_STRING_VALUETerminalRuleCall_6_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     STRING_VALUE?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'halt' (ambiguity) (rule start)
	 
	 * </pre>
	 */
	protected void emit_SlangStmt_STRING_VALUETerminalRuleCall_7_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	
}
