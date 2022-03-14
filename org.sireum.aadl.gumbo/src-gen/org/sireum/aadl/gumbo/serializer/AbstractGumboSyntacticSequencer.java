
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
	protected AbstractElementAlias match_CallSuffix_TypeArgsParserRuleCall_0_0_q;
	protected AbstractElementAlias match_DefDef_DefExtParserRuleCall_1_q;
	protected AbstractElementAlias match_DefDef_DefModsParserRuleCall_0_q;
	protected AbstractElementAlias match_DefDef_TypeParamsParserRuleCall_3_q;
	protected AbstractElementAlias match_DefParam_AsteriskKeyword_4_q;
	protected AbstractElementAlias match_DefParam_EqualsSignGreaterThanSignKeyword_2_q;
	protected AbstractElementAlias match_ImpliesExpr_EqualsSignGreaterThanSignKeyword_1_0_0_1_0_or_ImpliesKeyword_1_0_0_1_1;
	protected AbstractElementAlias match_SlangExpr_AllKeyword_1_0_0_or_ForAllKeyword_1_0_2_or_SomeKeyword_1_0_1_or_ThereExistsKeyword_1_0_3;
	protected AbstractElementAlias match_SlangQuantVar_FullStopFullStopKeyword_3_0_0_or_FullStopFullStopLessThanSignKeyword_3_0_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (GumboGrammarAccess) access;
		match_AtomicExpr_LeftParenthesisKeyword_8_0_a = new TokenAlias(true, true, grammarAccess.getAtomicExprAccess().getLeftParenthesisKeyword_8_0());
		match_AtomicExpr_LeftParenthesisKeyword_8_0_p = new TokenAlias(true, false, grammarAccess.getAtomicExprAccess().getLeftParenthesisKeyword_8_0());
		match_CallSuffix_TypeArgsParserRuleCall_0_0_q = new TokenAlias(false, true, grammarAccess.getCallSuffixAccess().getTypeArgsParserRuleCall_0_0());
		match_DefDef_DefExtParserRuleCall_1_q = new TokenAlias(false, true, grammarAccess.getDefDefAccess().getDefExtParserRuleCall_1());
		match_DefDef_DefModsParserRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getDefDefAccess().getDefModsParserRuleCall_0());
		match_DefDef_TypeParamsParserRuleCall_3_q = new TokenAlias(false, true, grammarAccess.getDefDefAccess().getTypeParamsParserRuleCall_3());
		match_DefParam_AsteriskKeyword_4_q = new TokenAlias(false, true, grammarAccess.getDefParamAccess().getAsteriskKeyword_4());
		match_DefParam_EqualsSignGreaterThanSignKeyword_2_q = new TokenAlias(false, true, grammarAccess.getDefParamAccess().getEqualsSignGreaterThanSignKeyword_2());
		match_ImpliesExpr_EqualsSignGreaterThanSignKeyword_1_0_0_1_0_or_ImpliesKeyword_1_0_0_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getImpliesExprAccess().getEqualsSignGreaterThanSignKeyword_1_0_0_1_0()), new TokenAlias(false, false, grammarAccess.getImpliesExprAccess().getImpliesKeyword_1_0_0_1_1()));
		match_SlangExpr_AllKeyword_1_0_0_or_ForAllKeyword_1_0_2_or_SomeKeyword_1_0_1_or_ThereExistsKeyword_1_0_3 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getSlangExprAccess().getAllKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getSlangExprAccess().getForAllKeyword_1_0_2()), new TokenAlias(false, false, grammarAccess.getSlangExprAccess().getSomeKeyword_1_0_1()), new TokenAlias(false, false, grammarAccess.getSlangExprAccess().getThereExistsKeyword_1_0_3()));
		match_SlangQuantVar_FullStopFullStopKeyword_3_0_0_or_FullStopFullStopLessThanSignKeyword_3_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getSlangQuantVarAccess().getFullStopFullStopKeyword_3_0_0()), new TokenAlias(false, false, grammarAccess.getSlangQuantVarAccess().getFullStopFullStopLessThanSignKeyword_3_0_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getAppliesToKeywordsRule())
			return getAppliesToKeywordsToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDefExtRule())
			return getDefExtToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDefModsRule())
			return getDefModsToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getInBindingKeywordsRule())
			return getInBindingKeywordsToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getInModesKeywordsRule())
			return getInModesKeywordsToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getOPRule())
			return getOPToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSTRINGRule())
			return getSTRINGToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getTypeRule())
			return getTypeToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getTypeArgsRule())
			return getTypeArgsToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getTypeParamsRule())
			return getTypeParamsToken(semanticObject, ruleCall, node);
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
	 * DefExt: '(' ID ':' Type ')' ;
	 */
	protected String getDefExtToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "( : )";
	}
	
	/**
	 * DefMods: 'strict' | 'memoize' | 'mut' | 'spec' ;
	 */
	protected String getDefModsToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "strict";
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
	 * terminal OP: ( OPSYM+ | '\\' IDF ) ;
	 */
	protected String getOPToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "+";
	}
	
	/**
	 * terminal STRING	: 
	 * 			'"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\') | !('\\'|'"') )* '"' |
	 * 			"'" ( '\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\') | !('\\'|"'") )* "'"
	 * 		;
	 */
	protected String getSTRINGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	
	/**
	 * Type
	 * 	: BaseType ( '=>' BaseType )*
	 * 	| 'mut' BaseType ( '=>' BaseType )+
	 * 	;
	 */
	protected String getTypeToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * TypeArgs: '[' Type ( ',' Type )* ']' ;
	 */
	protected String getTypeArgsToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "[ ]";
	}
	
	/**
	 * TypeParams: '[' TypeParam (  ',' TypeParam )* ']' ;
	 */
	protected String getTypeParamsToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "[ ]";
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
			else if (match_CallSuffix_TypeArgsParserRuleCall_0_0_q.equals(syntax))
				emit_CallSuffix_TypeArgsParserRuleCall_0_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DefDef_DefExtParserRuleCall_1_q.equals(syntax))
				emit_DefDef_DefExtParserRuleCall_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DefDef_DefModsParserRuleCall_0_q.equals(syntax))
				emit_DefDef_DefModsParserRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DefDef_TypeParamsParserRuleCall_3_q.equals(syntax))
				emit_DefDef_TypeParamsParserRuleCall_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DefParam_AsteriskKeyword_4_q.equals(syntax))
				emit_DefParam_AsteriskKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DefParam_EqualsSignGreaterThanSignKeyword_2_q.equals(syntax))
				emit_DefParam_EqualsSignGreaterThanSignKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ImpliesExpr_EqualsSignGreaterThanSignKeyword_1_0_0_1_0_or_ImpliesKeyword_1_0_0_1_1.equals(syntax))
				emit_ImpliesExpr_EqualsSignGreaterThanSignKeyword_1_0_0_1_0_or_ImpliesKeyword_1_0_0_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SlangExpr_AllKeyword_1_0_0_or_ForAllKeyword_1_0_2_or_SomeKeyword_1_0_1_or_ThereExistsKeyword_1_0_3.equals(syntax))
				emit_SlangExpr_AllKeyword_1_0_0_or_ForAllKeyword_1_0_2_or_SomeKeyword_1_0_1_or_ThereExistsKeyword_1_0_3(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SlangQuantVar_FullStopFullStopKeyword_3_0_0_or_FullStopFullStopLessThanSignKeyword_3_0_1.equals(syntax))
				emit_SlangQuantVar_FullStopFullStopKeyword_3_0_0_or_FullStopFullStopLessThanSignKeyword_3_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
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
	 *     TypeArgs?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '.' ID (ambiguity) (rule start)
	 */
	protected void emit_CallSuffix_TypeArgsParserRuleCall_0_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     DefExt?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) DefMods? (ambiguity) name=DefID
	 */
	protected void emit_DefDef_DefExtParserRuleCall_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     DefMods?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) DefExt? name=DefID
	 */
	protected void emit_DefDef_DefModsParserRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     TypeParams?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=DefID (ambiguity) ':' Type ':=' body=Expr
	 *     name=DefID (ambiguity) ':' Type contract=DefContract
	 *     name=DefID (ambiguity) args=DefParams
	 */
	protected void emit_DefDef_TypeParamsParserRuleCall_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '*'?
	 *
	 * This ambiguous syntax occurs at:
	 *     typeName=[DataSubcomponentType|QCREF] (ambiguity) (rule end)
	 */
	protected void emit_DefParam_AsteriskKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '=>'?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID ':' (ambiguity) typeName=[DataSubcomponentType|QCREF]
	 */
	protected void emit_DefParam_EqualsSignGreaterThanSignKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	
	/**
	 * Ambiguous syntax:
	 *     '\all' | '\some' | '∀' | '∃'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'return' (ambiguity) var+=SlangQuantVar
	 *     (rule start) (ambiguity) var+=SlangQuantVar
	 */
	protected void emit_SlangExpr_AllKeyword_1_0_0_or_ForAllKeyword_1_0_2_or_SomeKeyword_1_0_1_or_ThereExistsKeyword_1_0_3(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '..' | '..<'
	 *
	 * This ambiguous syntax occurs at:
	 *     val=SlangExpr (ambiguity) upperBound=SlangExpr
	 */
	protected void emit_SlangQuantVar_FullStopFullStopKeyword_3_0_0_or_FullStopFullStopLessThanSignKeyword_3_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
