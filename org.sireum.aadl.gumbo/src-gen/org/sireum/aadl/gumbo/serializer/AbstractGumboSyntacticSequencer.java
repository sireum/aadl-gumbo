
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
	protected AbstractElementAlias match_AtomicExpr_LeftParenthesisKeyword_8_0_a;
	protected AbstractElementAlias match_AtomicExpr_LeftParenthesisKeyword_8_0_p;
	protected AbstractElementAlias match_ImpliesExpr_EqualsSignGreaterThanSignKeyword_1_0_0_1_0_or_ImpliesKeyword_1_0_0_1_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (GumboGrammarAccess) access;
		match_AtomicExpr_LeftParenthesisKeyword_8_0_a = new TokenAlias(true, true, grammarAccess.getAtomicExprAccess().getLeftParenthesisKeyword_8_0());
		match_AtomicExpr_LeftParenthesisKeyword_8_0_p = new TokenAlias(true, false, grammarAccess.getAtomicExprAccess().getLeftParenthesisKeyword_8_0());
		match_ImpliesExpr_EqualsSignGreaterThanSignKeyword_1_0_0_1_0_or_ImpliesKeyword_1_0_0_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getImpliesExprAccess().getEqualsSignGreaterThanSignKeyword_1_0_0_1_0()), new TokenAlias(false, false, grammarAccess.getImpliesExprAccess().getImpliesKeyword_1_0_0_1_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getAppliesToKeywordsRule())
			return getAppliesToKeywordsToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getInBindingKeywordsRule())
			return getInBindingKeywordsToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getInModesKeywordsRule())
			return getInModesKeywordsToken(semanticObject, ruleCall, node);
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
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_AtomicExpr_LeftParenthesisKeyword_8_0_a.equals(syntax))
				emit_AtomicExpr_LeftParenthesisKeyword_8_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_AtomicExpr_LeftParenthesisKeyword_8_0_p.equals(syntax))
				emit_AtomicExpr_LeftParenthesisKeyword_8_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ImpliesExpr_EqualsSignGreaterThanSignKeyword_1_0_0_1_0_or_ImpliesKeyword_1_0_0_1_1.equals(syntax))
				emit_ImpliesExpr_EqualsSignGreaterThanSignKeyword_1_0_0_1_0_or_ImpliesKeyword_1_0_0_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'enum' '(' enumType=DataElement
	 *     (rule start) (ambiguity) 'floor' '(' expr=Expr
	 *     (rule start) (ambiguity) 'real' '(' expr=Expr
	 *     (rule start) (ambiguity) op='-'
	 *     (rule start) (ambiguity) op='not'
	 *     (rule start) (ambiguity) portOrSubcomponentOrStateVar=[EObject|ID]
	 *     (rule start) (ambiguity) recordType=DataElement
	 *     (rule start) (ambiguity) val=BooleanLiteral
	 *     (rule start) (ambiguity) val=REAL_LIT
	 *     (rule start) (ambiguity) value=INTEGER_LIT
	 *     (rule start) (ambiguity) {BinaryExpr.left=}
	 */
	protected void emit_AtomicExpr_LeftParenthesisKeyword_8_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) op='-'
	 *     (rule start) (ambiguity) op='not'
	 *     (rule start) (ambiguity) {BinaryExpr.left=}
	 */
	protected void emit_AtomicExpr_LeftParenthesisKeyword_8_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '=>' | 'implies'
	 *
	 * This ambiguous syntax occurs at:
	 *     {BinaryExpr.left=} (ambiguity) right=ImpliesExpr
	 */
	protected void emit_ImpliesExpr_EqualsSignGreaterThanSignKeyword_1_0_0_1_0_or_ImpliesKeyword_1_0_0_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
