
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
package org.sireum.aadl.gumbo.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.sireum.aadl.gumbo.ide.contentassist.antlr.internal.InternalGumboParser;
import org.sireum.aadl.gumbo.services.GumboGrammarAccess;

public class GumboParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(GumboGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, GumboGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getSpecStatementAccess().getAlternatives(), "rule__SpecStatement__Alternatives");
			builder.put(grammarAccess.getSlangStmtAccess().getAlternatives(), "rule__SlangStmt__Alternatives");
			builder.put(grammarAccess.getSlangElseAccess().getAlternatives_1(), "rule__SlangElse__Alternatives_1");
			builder.put(grammarAccess.getSlangPatternAccess().getAlternatives(), "rule__SlangPattern__Alternatives");
			builder.put(grammarAccess.getSlangTPatternAccess().getAlternatives(), "rule__SlangTPattern__Alternatives");
			builder.put(grammarAccess.getSlangTPatternAccess().getAlternatives_0_2(), "rule__SlangTPattern__Alternatives_0_2");
			builder.put(grammarAccess.getSlangVarModAccess().getAlternatives(), "rule__SlangVarMod__Alternatives");
			builder.put(grammarAccess.getSlangExpressionAccess().getAlternatives(), "rule__SlangExpression__Alternatives");
			builder.put(grammarAccess.getSlangExpressionAccess().getQuantifierAlternatives_2_1_0(), "rule__SlangExpression__QuantifierAlternatives_2_1_0");
			builder.put(grammarAccess.getQuantRangeAccess().getExtentAlternatives_1_0(), "rule__QuantRange__ExtentAlternatives_1_0");
			builder.put(grammarAccess.getQuantParamAccess().getAlternatives(), "rule__QuantParam__Alternatives");
			builder.put(grammarAccess.getUnaryExpressionAccess().getAlternatives(), "rule__UnaryExpression__Alternatives");
			builder.put(grammarAccess.getPrimaryExprAccess().getAlternatives(), "rule__PrimaryExpr__Alternatives");
			builder.put(grammarAccess.getBaseExprAccess().getAlternatives(), "rule__BaseExpr__Alternatives");
			builder.put(grammarAccess.getBaseExprAccess().getAlternatives_10_5(), "rule__BaseExpr__Alternatives_10_5");
			builder.put(grammarAccess.getBaseExprAccess().getAlternatives_11_2(), "rule__BaseExpr__Alternatives_11_2");
			builder.put(grammarAccess.getFloatObjectExprAccess().getAlternatives(), "rule__FloatObjectExpr__Alternatives");
			builder.put(grammarAccess.getAccessibleBaseExprAccess().getAlternatives(), "rule__AccessibleBaseExpr__Alternatives");
			builder.put(grammarAccess.getPostfixAccess().getAlternatives(), "rule__Postfix__Alternatives");
			builder.put(grammarAccess.getSlangForRangeAccess().getAlternatives_3_0(), "rule__SlangForRange__Alternatives_3_0");
			builder.put(grammarAccess.getSlangLitAccess().getAlternatives(), "rule__SlangLit__Alternatives");
			builder.put(grammarAccess.getSlangLitAccess().getValueAlternatives_0_1_0(), "rule__SlangLit__ValueAlternatives_0_1_0");
			builder.put(grammarAccess.getSlangLitAccess().getValueAlternatives_5_1_0(), "rule__SlangLit__ValueAlternatives_5_1_0");
			builder.put(grammarAccess.getUnaryOpAccess().getAlternatives(), "rule__UnaryOp__Alternatives");
			builder.put(grammarAccess.getMultiplicativeOpAccess().getAlternatives(), "rule__MultiplicativeOp__Alternatives");
			builder.put(grammarAccess.getPlusMinusOpsAccess().getAlternatives(), "rule__PlusMinusOps__Alternatives");
			builder.put(grammarAccess.getImpliesOpsAccess().getAlternatives(), "rule__ImpliesOps__Alternatives");
			builder.put(grammarAccess.getContainedPropertyAssociationAccess().getAlternatives_1(), "rule__ContainedPropertyAssociation__Alternatives_1");
			builder.put(grammarAccess.getPropertyAssociationAccess().getAlternatives_1(), "rule__PropertyAssociation__Alternatives_1");
			builder.put(grammarAccess.getPropertyExpressionAccess().getAlternatives(), "rule__PropertyExpression__Alternatives");
			builder.put(grammarAccess.getBooleanLiteralAccess().getAlternatives_1(), "rule__BooleanLiteral__Alternatives_1");
			builder.put(grammarAccess.getPlusMinusAccess().getAlternatives(), "rule__PlusMinus__Alternatives");
			builder.put(grammarAccess.getSignedIntAccess().getAlternatives_0(), "rule__SignedInt__Alternatives_0");
			builder.put(grammarAccess.getSignedRealAccess().getAlternatives_0(), "rule__SignedReal__Alternatives_0");
			builder.put(grammarAccess.getNumAltAccess().getAlternatives(), "rule__NumAlt__Alternatives");
			builder.put(grammarAccess.getGumboLibraryAccess().getGroup(), "rule__GumboLibrary__Group__0");
			builder.put(grammarAccess.getGumboSubclauseAccess().getGroup(), "rule__GumboSubclause__Group__0");
			builder.put(grammarAccess.getSpecSectionAccess().getGroup(), "rule__SpecSection__Group__0");
			builder.put(grammarAccess.getStateAccess().getGroup(), "rule__State__Group__0");
			builder.put(grammarAccess.getStateVarDeclAccess().getGroup(), "rule__StateVarDecl__Group__0");
			builder.put(grammarAccess.getStateVarDeclAccess().getGroup_0(), "rule__StateVarDecl__Group_0__0");
			builder.put(grammarAccess.getInvariantsAccess().getGroup(), "rule__Invariants__Group__0");
			builder.put(grammarAccess.getInvSpecAccess().getGroup(), "rule__InvSpec__Group__0");
			builder.put(grammarAccess.getIntegrationAccess().getGroup(), "rule__Integration__Group__0");
			builder.put(grammarAccess.getInitializeAccess().getGroup(), "rule__Initialize__Group__0");
			builder.put(grammarAccess.getInitializeAccess().getGroup_2(), "rule__Initialize__Group_2__0");
			builder.put(grammarAccess.getComputeAccess().getGroup(), "rule__Compute__Group__0");
			builder.put(grammarAccess.getComputeAccess().getGroup_2(), "rule__Compute__Group_2__0");
			builder.put(grammarAccess.getComputeAccess().getGroup_5(), "rule__Compute__Group_5__0");
			builder.put(grammarAccess.getInfoFlowClauseAccess().getGroup(), "rule__InfoFlowClause__Group__0");
			builder.put(grammarAccess.getInfoFlowClauseAccess().getGroup_6(), "rule__InfoFlowClause__Group_6__0");
			builder.put(grammarAccess.getInfoFlowClauseAccess().getGroup_6_1(), "rule__InfoFlowClause__Group_6_1__0");
			builder.put(grammarAccess.getInfoFlowClauseAccess().getGroup_11(), "rule__InfoFlowClause__Group_11__0");
			builder.put(grammarAccess.getInfoFlowClauseAccess().getGroup_11_1(), "rule__InfoFlowClause__Group_11_1__0");
			builder.put(grammarAccess.getHandlerClauseAccess().getGroup(), "rule__HandlerClause__Group__0");
			builder.put(grammarAccess.getHandlerClauseAccess().getGroup_3(), "rule__HandlerClause__Group_3__0");
			builder.put(grammarAccess.getHandlerClauseAccess().getGroup_6(), "rule__HandlerClause__Group_6__0");
			builder.put(grammarAccess.getCaseStatementClauseAccess().getGroup(), "rule__CaseStatementClause__Group__0");
			builder.put(grammarAccess.getAssumeStatementAccess().getGroup(), "rule__AssumeStatement__Group__0");
			builder.put(grammarAccess.getAnonAssumeStatementAccess().getGroup(), "rule__AnonAssumeStatement__Group__0");
			builder.put(grammarAccess.getGuaranteeStatementAccess().getGroup(), "rule__GuaranteeStatement__Group__0");
			builder.put(grammarAccess.getAnonGuaranteeStatementAccess().getGroup(), "rule__AnonGuaranteeStatement__Group__0");
			builder.put(grammarAccess.getFunctionsAccess().getGroup(), "rule__Functions__Group__0");
			builder.put(grammarAccess.getFuncSpecAccess().getGroup(), "rule__FuncSpec__Group__0");
			builder.put(grammarAccess.getSlangDefDefAccess().getGroup(), "rule__SlangDefDef__Group__0");
			builder.put(grammarAccess.getSlangDefParamsAccess().getGroup(), "rule__SlangDefParams__Group__0");
			builder.put(grammarAccess.getSlangDefParamsAccess().getGroup_1(), "rule__SlangDefParams__Group_1__0");
			builder.put(grammarAccess.getSlangDefParamsAccess().getGroup_1_1(), "rule__SlangDefParams__Group_1_1__0");
			builder.put(grammarAccess.getSlangDefParamAccess().getGroup(), "rule__SlangDefParam__Group__0");
			builder.put(grammarAccess.getSlangTypeParamsAccess().getGroup(), "rule__SlangTypeParams__Group__0");
			builder.put(grammarAccess.getSlangTypeParamsAccess().getGroup_2(), "rule__SlangTypeParams__Group_2__0");
			builder.put(grammarAccess.getSlangTypeParamAccess().getGroup(), "rule__SlangTypeParam__Group__0");
			builder.put(grammarAccess.getSlangDefContractAccess().getGroup(), "rule__SlangDefContract__Group__0");
			builder.put(grammarAccess.getSlangDefContractAccess().getGroup_1(), "rule__SlangDefContract__Group_1__0");
			builder.put(grammarAccess.getSlangDefContractAccess().getGroup_1_0(), "rule__SlangDefContract__Group_1_0__0");
			builder.put(grammarAccess.getSlangDefContractAccess().getGroup_1_1(), "rule__SlangDefContract__Group_1_1__0");
			builder.put(grammarAccess.getSlangDefContractAccess().getGroup_1_2(), "rule__SlangDefContract__Group_1_2__0");
			builder.put(grammarAccess.getSlangDefContractAccess().getGroup_1_3(), "rule__SlangDefContract__Group_1_3__0");
			builder.put(grammarAccess.getSlangInvariantAccess().getGroup(), "rule__SlangInvariant__Group__0");
			builder.put(grammarAccess.getSlangInvariantAccess().getGroup_2(), "rule__SlangInvariant__Group_2__0");
			builder.put(grammarAccess.getSlangRequiresAccess().getGroup(), "rule__SlangRequires__Group__0");
			builder.put(grammarAccess.getSlangRequiresAccess().getGroup_2(), "rule__SlangRequires__Group_2__0");
			builder.put(grammarAccess.getSlangReadsAccess().getGroup(), "rule__SlangReads__Group__0");
			builder.put(grammarAccess.getSlangReadsAccess().getGroup_2(), "rule__SlangReads__Group_2__0");
			builder.put(grammarAccess.getSlangModifiesAccess().getGroup(), "rule__SlangModifies__Group__0");
			builder.put(grammarAccess.getSlangModifiesAccess().getGroup_2(), "rule__SlangModifies__Group_2__0");
			builder.put(grammarAccess.getSlangEnsuresAccess().getGroup(), "rule__SlangEnsures__Group__0");
			builder.put(grammarAccess.getSlangEnsuresAccess().getGroup_2(), "rule__SlangEnsures__Group_2__0");
			builder.put(grammarAccess.getSlangStmtAccess().getGroup_0(), "rule__SlangStmt__Group_0__0");
			builder.put(grammarAccess.getSlangStmtAccess().getGroup_1(), "rule__SlangStmt__Group_1__0");
			builder.put(grammarAccess.getSlangStmtAccess().getGroup_2(), "rule__SlangStmt__Group_2__0");
			builder.put(grammarAccess.getSlangStmtAccess().getGroup_3(), "rule__SlangStmt__Group_3__0");
			builder.put(grammarAccess.getSlangStmtAccess().getGroup_4(), "rule__SlangStmt__Group_4__0");
			builder.put(grammarAccess.getSlangStmtAccess().getGroup_5(), "rule__SlangStmt__Group_5__0");
			builder.put(grammarAccess.getSlangStmtAccess().getGroup_6(), "rule__SlangStmt__Group_6__0");
			builder.put(grammarAccess.getSlangStmtAccess().getGroup_7(), "rule__SlangStmt__Group_7__0");
			builder.put(grammarAccess.getSlangStmtAccess().getGroup_8(), "rule__SlangStmt__Group_8__0");
			builder.put(grammarAccess.getSlangElseAccess().getGroup(), "rule__SlangElse__Group__0");
			builder.put(grammarAccess.getSlangElseAccess().getGroup_1_0(), "rule__SlangElse__Group_1_0__0");
			builder.put(grammarAccess.getSlangLoopContractAccess().getGroup(), "rule__SlangLoopContract__Group__0");
			builder.put(grammarAccess.getSlangCaseAccess().getGroup(), "rule__SlangCase__Group__0");
			builder.put(grammarAccess.getSlangCaseAccess().getGroup_2(), "rule__SlangCase__Group_2__0");
			builder.put(grammarAccess.getSlangPatternAccess().getGroup_0(), "rule__SlangPattern__Group_0__0");
			builder.put(grammarAccess.getSlangPatternAccess().getGroup_0_2(), "rule__SlangPattern__Group_0_2__0");
			builder.put(grammarAccess.getSlangPatternAccess().getGroup_0_2_2(), "rule__SlangPattern__Group_0_2_2__0");
			builder.put(grammarAccess.getSlangPatternAccess().getGroup_1(), "rule__SlangPattern__Group_1__0");
			builder.put(grammarAccess.getSlangPatternAccess().getGroup_1_2(), "rule__SlangPattern__Group_1_2__0");
			builder.put(grammarAccess.getSlangTPatternAccess().getGroup_0(), "rule__SlangTPattern__Group_0__0");
			builder.put(grammarAccess.getSlangTPatternAccess().getGroup_0_2_0(), "rule__SlangTPattern__Group_0_2_0__0");
			builder.put(grammarAccess.getSlangTPatternAccess().getGroup_0_2_0_2(), "rule__SlangTPattern__Group_0_2_0_2__0");
			builder.put(grammarAccess.getSlangTPatternAccess().getGroup_0_2_1(), "rule__SlangTPattern__Group_0_2_1__0");
			builder.put(grammarAccess.getSlangTPatternAccess().getGroup_1(), "rule__SlangTPattern__Group_1__0");
			builder.put(grammarAccess.getSlangTPatternAccess().getGroup_1_2(), "rule__SlangTPattern__Group_1_2__0");
			builder.put(grammarAccess.getSlangTPatternAccess().getGroup_2(), "rule__SlangTPattern__Group_2__0");
			builder.put(grammarAccess.getSlangTPatternAccess().getGroup_2_2(), "rule__SlangTPattern__Group_2_2__0");
			builder.put(grammarAccess.getSlangVarDefAccess().getGroup(), "rule__SlangVarDef__Group__0");
			builder.put(grammarAccess.getSlangVarDefAccess().getGroup_2(), "rule__SlangVarDef__Group_2__0");
			builder.put(grammarAccess.getSlangBlockAccess().getGroup(), "rule__SlangBlock__Group__0");
			builder.put(grammarAccess.getSlangExpressionAccess().getGroup_1(), "rule__SlangExpression__Group_1__0");
			builder.put(grammarAccess.getSlangExpressionAccess().getGroup_2(), "rule__SlangExpression__Group_2__0");
			builder.put(grammarAccess.getQuantRangeAccess().getGroup(), "rule__QuantRange__Group__0");
			builder.put(grammarAccess.getQuantParamAccess().getGroup_1(), "rule__QuantParam__Group_1__0");
			builder.put(grammarAccess.getImpliesExpressionAccess().getGroup(), "rule__ImpliesExpression__Group__0");
			builder.put(grammarAccess.getImpliesExpressionAccess().getGroup_1(), "rule__ImpliesExpression__Group_1__0");
			builder.put(grammarAccess.getOrExpressionAccess().getGroup(), "rule__OrExpression__Group__0");
			builder.put(grammarAccess.getOrExpressionAccess().getGroup_1(), "rule__OrExpression__Group_1__0");
			builder.put(grammarAccess.getAndExpressionAccess().getGroup(), "rule__AndExpression__Group__0");
			builder.put(grammarAccess.getAndExpressionAccess().getGroup_1(), "rule__AndExpression__Group_1__0");
			builder.put(grammarAccess.getEqualNotExpressionAccess().getGroup(), "rule__EqualNotExpression__Group__0");
			builder.put(grammarAccess.getEqualNotExpressionAccess().getGroup_1(), "rule__EqualNotExpression__Group_1__0");
			builder.put(grammarAccess.getLtGtExpressionAccess().getGroup(), "rule__LtGtExpression__Group__0");
			builder.put(grammarAccess.getLtGtExpressionAccess().getGroup_1(), "rule__LtGtExpression__Group_1__0");
			builder.put(grammarAccess.getColonExpressionAccess().getGroup(), "rule__ColonExpression__Group__0");
			builder.put(grammarAccess.getColonExpressionAccess().getGroup_1(), "rule__ColonExpression__Group_1__0");
			builder.put(grammarAccess.getPlusMinusExpressionAccess().getGroup(), "rule__PlusMinusExpression__Group__0");
			builder.put(grammarAccess.getPlusMinusExpressionAccess().getGroup_1(), "rule__PlusMinusExpression__Group_1__0");
			builder.put(grammarAccess.getMultiplicativeExpressionAccess().getGroup(), "rule__MultiplicativeExpression__Group__0");
			builder.put(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1(), "rule__MultiplicativeExpression__Group_1__0");
			builder.put(grammarAccess.getUnaryExpressionAccess().getGroup_0(), "rule__UnaryExpression__Group_0__0");
			builder.put(grammarAccess.getPrimaryExprAccess().getGroup_1(), "rule__PrimaryExpr__Group_1__0");
			builder.put(grammarAccess.getBaseExprAccess().getGroup_0(), "rule__BaseExpr__Group_0__0");
			builder.put(grammarAccess.getBaseExprAccess().getGroup_1(), "rule__BaseExpr__Group_1__0");
			builder.put(grammarAccess.getBaseExprAccess().getGroup_2(), "rule__BaseExpr__Group_2__0");
			builder.put(grammarAccess.getBaseExprAccess().getGroup_2_0(), "rule__BaseExpr__Group_2_0__0");
			builder.put(grammarAccess.getBaseExprAccess().getGroup_3(), "rule__BaseExpr__Group_3__0");
			builder.put(grammarAccess.getBaseExprAccess().getGroup_3_0(), "rule__BaseExpr__Group_3_0__0");
			builder.put(grammarAccess.getBaseExprAccess().getGroup_3_2(), "rule__BaseExpr__Group_3_2__0");
			builder.put(grammarAccess.getBaseExprAccess().getGroup_4(), "rule__BaseExpr__Group_4__0");
			builder.put(grammarAccess.getBaseExprAccess().getGroup_4_0(), "rule__BaseExpr__Group_4_0__0");
			builder.put(grammarAccess.getBaseExprAccess().getGroup_4_2(), "rule__BaseExpr__Group_4_2__0");
			builder.put(grammarAccess.getBaseExprAccess().getGroup_5(), "rule__BaseExpr__Group_5__0");
			builder.put(grammarAccess.getBaseExprAccess().getGroup_5_0(), "rule__BaseExpr__Group_5_0__0");
			builder.put(grammarAccess.getBaseExprAccess().getGroup_6(), "rule__BaseExpr__Group_6__0");
			builder.put(grammarAccess.getBaseExprAccess().getGroup_6_0(), "rule__BaseExpr__Group_6_0__0");
			builder.put(grammarAccess.getBaseExprAccess().getGroup_7(), "rule__BaseExpr__Group_7__0");
			builder.put(grammarAccess.getBaseExprAccess().getGroup_7_0(), "rule__BaseExpr__Group_7_0__0");
			builder.put(grammarAccess.getBaseExprAccess().getGroup_9(), "rule__BaseExpr__Group_9__0");
			builder.put(grammarAccess.getBaseExprAccess().getGroup_10(), "rule__BaseExpr__Group_10__0");
			builder.put(grammarAccess.getBaseExprAccess().getGroup_10_3(), "rule__BaseExpr__Group_10_3__0");
			builder.put(grammarAccess.getBaseExprAccess().getGroup_10_5_1(), "rule__BaseExpr__Group_10_5_1__0");
			builder.put(grammarAccess.getBaseExprAccess().getGroup_11(), "rule__BaseExpr__Group_11__0");
			builder.put(grammarAccess.getBaseExprAccess().getGroup_11_2_0(), "rule__BaseExpr__Group_11_2_0__0");
			builder.put(grammarAccess.getBaseExprAccess().getGroup_11_2_0_0(), "rule__BaseExpr__Group_11_2_0_0__0");
			builder.put(grammarAccess.getBaseExprAccess().getGroup_11_2_1(), "rule__BaseExpr__Group_11_2_1__0");
			builder.put(grammarAccess.getFloatObjectExprAccess().getGroup_0(), "rule__FloatObjectExpr__Group_0__0");
			builder.put(grammarAccess.getFloatObjectExprAccess().getGroup_1(), "rule__FloatObjectExpr__Group_1__0");
			builder.put(grammarAccess.getAccessibleBaseExprAccess().getGroup_0(), "rule__AccessibleBaseExpr__Group_0__0");
			builder.put(grammarAccess.getAccessibleBaseExprAccess().getGroup_0_0(), "rule__AccessibleBaseExpr__Group_0_0__0");
			builder.put(grammarAccess.getAccessibleBaseExprAccess().getGroup_1(), "rule__AccessibleBaseExpr__Group_1__0");
			builder.put(grammarAccess.getAccessibleBaseExprAccess().getGroup_1_0(), "rule__AccessibleBaseExpr__Group_1_0__0");
			builder.put(grammarAccess.getAccessibleBaseExprAccess().getGroup_1_0_0(), "rule__AccessibleBaseExpr__Group_1_0_0__0");
			builder.put(grammarAccess.getAccessibleBaseExprAccess().getGroup_1_2(), "rule__AccessibleBaseExpr__Group_1_2__0");
			builder.put(grammarAccess.getAccessibleBaseExprAccess().getGroup_2(), "rule__AccessibleBaseExpr__Group_2__0");
			builder.put(grammarAccess.getAccessibleBaseExprAccess().getGroup_3(), "rule__AccessibleBaseExpr__Group_3__0");
			builder.put(grammarAccess.getMemberAccessAccess().getGroup(), "rule__MemberAccess__Group__0");
			builder.put(grammarAccess.getArrayAccessAccess().getGroup(), "rule__ArrayAccess__Group__0");
			builder.put(grammarAccess.getArrayAccessAccess().getGroup_2(), "rule__ArrayAccess__Group_2__0");
			builder.put(grammarAccess.getOtherDataRefAccess().getGroup(), "rule__OtherDataRef__Group__0");
			builder.put(grammarAccess.getOtherDataRefAccess().getGroup_0(), "rule__OtherDataRef__Group_0__0");
			builder.put(grammarAccess.getOtherDataRefAccess().getGroup_1(), "rule__OtherDataRef__Group_1__0");
			builder.put(grammarAccess.getSlangParamsAccess().getGroup(), "rule__SlangParams__Group__0");
			builder.put(grammarAccess.getSlangParamsAccess().getGroup_2(), "rule__SlangParams__Group_2__0");
			builder.put(grammarAccess.getSlangParamAccess().getGroup(), "rule__SlangParam__Group__0");
			builder.put(grammarAccess.getSlangForRangeAccess().getGroup(), "rule__SlangForRange__Group__0");
			builder.put(grammarAccess.getSlangForRangeAccess().getGroup_3(), "rule__SlangForRange__Group_3__0");
			builder.put(grammarAccess.getSlangForRangeAccess().getGroup_3_2(), "rule__SlangForRange__Group_3_2__0");
			builder.put(grammarAccess.getSlangRetAccess().getGroup(), "rule__SlangRet__Group__0");
			builder.put(grammarAccess.getSlangCallSuffixAccess().getGroup(), "rule__SlangCallSuffix__Group__0");
			builder.put(grammarAccess.getSlangCallArgsAccess().getGroup(), "rule__SlangCallArgs__Group__0");
			builder.put(grammarAccess.getSlangCallArgsAccess().getGroup_2(), "rule__SlangCallArgs__Group_2__0");
			builder.put(grammarAccess.getSlangCallArgsAccess().getGroup_2_1(), "rule__SlangCallArgs__Group_2_1__0");
			builder.put(grammarAccess.getSlangLitAccess().getGroup_0(), "rule__SlangLit__Group_0__0");
			builder.put(grammarAccess.getSlangLitAccess().getGroup_1(), "rule__SlangLit__Group_1__0");
			builder.put(grammarAccess.getSlangLitAccess().getGroup_2(), "rule__SlangLit__Group_2__0");
			builder.put(grammarAccess.getSlangLitAccess().getGroup_3(), "rule__SlangLit__Group_3__0");
			builder.put(grammarAccess.getSlangLitAccess().getGroup_4(), "rule__SlangLit__Group_4__0");
			builder.put(grammarAccess.getSlangLitAccess().getGroup_5(), "rule__SlangLit__Group_5__0");
			builder.put(grammarAccess.getSlangLitAccess().getGroup_6(), "rule__SlangLit__Group_6__0");
			builder.put(grammarAccess.getSlangInterpAccess().getGroup(), "rule__SlangInterp__Group__0");
			builder.put(grammarAccess.getContainedPropertyAssociationAccess().getGroup(), "rule__ContainedPropertyAssociation__Group__0");
			builder.put(grammarAccess.getContainedPropertyAssociationAccess().getGroup_3(), "rule__ContainedPropertyAssociation__Group_3__0");
			builder.put(grammarAccess.getContainedPropertyAssociationAccess().getGroup_3_1(), "rule__ContainedPropertyAssociation__Group_3_1__0");
			builder.put(grammarAccess.getContainedPropertyAssociationAccess().getGroup_4(), "rule__ContainedPropertyAssociation__Group_4__0");
			builder.put(grammarAccess.getContainedPropertyAssociationAccess().getGroup_4_2(), "rule__ContainedPropertyAssociation__Group_4_2__0");
			builder.put(grammarAccess.getContainedPropertyAssociationAccess().getGroup_5(), "rule__ContainedPropertyAssociation__Group_5__0");
			builder.put(grammarAccess.getPropertyAssociationAccess().getGroup(), "rule__PropertyAssociation__Group__0");
			builder.put(grammarAccess.getPropertyAssociationAccess().getGroup_3(), "rule__PropertyAssociation__Group_3__0");
			builder.put(grammarAccess.getPropertyAssociationAccess().getGroup_3_1(), "rule__PropertyAssociation__Group_3_1__0");
			builder.put(grammarAccess.getPropertyAssociationAccess().getGroup_4(), "rule__PropertyAssociation__Group_4__0");
			builder.put(grammarAccess.getBasicPropertyAssociationAccess().getGroup(), "rule__BasicPropertyAssociation__Group__0");
			builder.put(grammarAccess.getModalPropertyValueAccess().getGroup(), "rule__ModalPropertyValue__Group__0");
			builder.put(grammarAccess.getModalPropertyValueAccess().getGroup_4(), "rule__ModalPropertyValue__Group_4__0");
			builder.put(grammarAccess.getOptionalModalPropertyValueAccess().getGroup(), "rule__OptionalModalPropertyValue__Group__0");
			builder.put(grammarAccess.getOptionalModalPropertyValueAccess().getGroup_1(), "rule__OptionalModalPropertyValue__Group_1__0");
			builder.put(grammarAccess.getOptionalModalPropertyValueAccess().getGroup_1_3(), "rule__OptionalModalPropertyValue__Group_1_3__0");
			builder.put(grammarAccess.getBooleanLiteralAccess().getGroup(), "rule__BooleanLiteral__Group__0");
			builder.put(grammarAccess.getReferenceTermAccess().getGroup(), "rule__ReferenceTerm__Group__0");
			builder.put(grammarAccess.getRecordTermAccess().getGroup(), "rule__RecordTerm__Group__0");
			builder.put(grammarAccess.getOldRecordTermAccess().getGroup(), "rule__OldRecordTerm__Group__0");
			builder.put(grammarAccess.getComputedTermAccess().getGroup(), "rule__ComputedTerm__Group__0");
			builder.put(grammarAccess.getComponentClassifierTermAccess().getGroup(), "rule__ComponentClassifierTerm__Group__0");
			builder.put(grammarAccess.getListTermAccess().getGroup(), "rule__ListTerm__Group__0");
			builder.put(grammarAccess.getListTermAccess().getGroup_2(), "rule__ListTerm__Group_2__0");
			builder.put(grammarAccess.getListTermAccess().getGroup_2_1(), "rule__ListTerm__Group_2_1__0");
			builder.put(grammarAccess.getFieldPropertyAssociationAccess().getGroup(), "rule__FieldPropertyAssociation__Group__0");
			builder.put(grammarAccess.getContainmentPathElementAccess().getGroup(), "rule__ContainmentPathElement__Group__0");
			builder.put(grammarAccess.getContainmentPathElementAccess().getGroup_0(), "rule__ContainmentPathElement__Group_0__0");
			builder.put(grammarAccess.getContainmentPathElementAccess().getGroup_1(), "rule__ContainmentPathElement__Group_1__0");
			builder.put(grammarAccess.getANNEXREFAccess().getGroup(), "rule__ANNEXREF__Group__0");
			builder.put(grammarAccess.getArrayRangeAccess().getGroup(), "rule__ArrayRange__Group__0");
			builder.put(grammarAccess.getArrayRangeAccess().getGroup_3(), "rule__ArrayRange__Group_3__0");
			builder.put(grammarAccess.getSignedConstantAccess().getGroup(), "rule__SignedConstant__Group__0");
			builder.put(grammarAccess.getIntegerTermAccess().getGroup(), "rule__IntegerTerm__Group__0");
			builder.put(grammarAccess.getSignedIntAccess().getGroup(), "rule__SignedInt__Group__0");
			builder.put(grammarAccess.getRealTermAccess().getGroup(), "rule__RealTerm__Group__0");
			builder.put(grammarAccess.getSignedRealAccess().getGroup(), "rule__SignedReal__Group__0");
			builder.put(grammarAccess.getNumericRangeTermAccess().getGroup(), "rule__NumericRangeTerm__Group__0");
			builder.put(grammarAccess.getNumericRangeTermAccess().getGroup_3(), "rule__NumericRangeTerm__Group_3__0");
			builder.put(grammarAccess.getAppliesToKeywordsAccess().getGroup(), "rule__AppliesToKeywords__Group__0");
			builder.put(grammarAccess.getInBindingKeywordsAccess().getGroup(), "rule__InBindingKeywords__Group__0");
			builder.put(grammarAccess.getInModesKeywordsAccess().getGroup(), "rule__InModesKeywords__Group__0");
			builder.put(grammarAccess.getQCLREFAccess().getGroup(), "rule__QCLREF__Group__0");
			builder.put(grammarAccess.getQPREFAccess().getGroup(), "rule__QPREF__Group__0");
			builder.put(grammarAccess.getQPREFAccess().getGroup_1(), "rule__QPREF__Group_1__0");
			builder.put(grammarAccess.getQCREFAccess().getGroup(), "rule__QCREF__Group__0");
			builder.put(grammarAccess.getQCREFAccess().getGroup_0(), "rule__QCREF__Group_0__0");
			builder.put(grammarAccess.getQCREFAccess().getGroup_2(), "rule__QCREF__Group_2__0");
			builder.put(grammarAccess.getGumboLibraryAccess().getFunctionsAssignment_2(), "rule__GumboLibrary__FunctionsAssignment_2");
			builder.put(grammarAccess.getGumboSubclauseAccess().getSpecsAssignment_1(), "rule__GumboSubclause__SpecsAssignment_1");
			builder.put(grammarAccess.getSpecSectionAccess().getStateAssignment_1(), "rule__SpecSection__StateAssignment_1");
			builder.put(grammarAccess.getSpecSectionAccess().getFunctionsAssignment_2(), "rule__SpecSection__FunctionsAssignment_2");
			builder.put(grammarAccess.getSpecSectionAccess().getInvariantsAssignment_3(), "rule__SpecSection__InvariantsAssignment_3");
			builder.put(grammarAccess.getSpecSectionAccess().getIntegrationAssignment_4(), "rule__SpecSection__IntegrationAssignment_4");
			builder.put(grammarAccess.getSpecSectionAccess().getInitializeAssignment_5(), "rule__SpecSection__InitializeAssignment_5");
			builder.put(grammarAccess.getSpecSectionAccess().getComputeAssignment_6(), "rule__SpecSection__ComputeAssignment_6");
			builder.put(grammarAccess.getStateAccess().getDeclsAssignment_1(), "rule__State__DeclsAssignment_1");
			builder.put(grammarAccess.getStateVarDeclAccess().getNameAssignment_0_0(), "rule__StateVarDecl__NameAssignment_0_0");
			builder.put(grammarAccess.getStateVarDeclAccess().getTypeNameAssignment_1(), "rule__StateVarDecl__TypeNameAssignment_1");
			builder.put(grammarAccess.getInvariantsAccess().getSpecsAssignment_1(), "rule__Invariants__SpecsAssignment_1");
			builder.put(grammarAccess.getInvSpecAccess().getIdAssignment_1(), "rule__InvSpec__IdAssignment_1");
			builder.put(grammarAccess.getInvSpecAccess().getDescriptorAssignment_2(), "rule__InvSpec__DescriptorAssignment_2");
			builder.put(grammarAccess.getInvSpecAccess().getExprAssignment_4(), "rule__InvSpec__ExprAssignment_4");
			builder.put(grammarAccess.getIntegrationAccess().getSpecsAssignment_1(), "rule__Integration__SpecsAssignment_1");
			builder.put(grammarAccess.getInitializeAccess().getModifiesAssignment_2_0(), "rule__Initialize__ModifiesAssignment_2_0");
			builder.put(grammarAccess.getInitializeAccess().getSpecsAssignment_3(), "rule__Initialize__SpecsAssignment_3");
			builder.put(grammarAccess.getInitializeAccess().getFlowsAssignment_4(), "rule__Initialize__FlowsAssignment_4");
			builder.put(grammarAccess.getInitializeSpecStatementAccess().getGuaranteeStatementAssignment(), "rule__InitializeSpecStatement__GuaranteeStatementAssignment");
			builder.put(grammarAccess.getComputeAccess().getModifiesAssignment_2_0(), "rule__Compute__ModifiesAssignment_2_0");
			builder.put(grammarAccess.getComputeAccess().getAssumesAssignment_3(), "rule__Compute__AssumesAssignment_3");
			builder.put(grammarAccess.getComputeAccess().getGuaranteesAssignment_4(), "rule__Compute__GuaranteesAssignment_4");
			builder.put(grammarAccess.getComputeAccess().getCasesAssignment_5_1(), "rule__Compute__CasesAssignment_5_1");
			builder.put(grammarAccess.getComputeAccess().getHandlersAssignment_6(), "rule__Compute__HandlersAssignment_6");
			builder.put(grammarAccess.getComputeAccess().getFlowsAssignment_7(), "rule__Compute__FlowsAssignment_7");
			builder.put(grammarAccess.getInfoFlowClauseAccess().getIdAssignment_1(), "rule__InfoFlowClause__IdAssignment_1");
			builder.put(grammarAccess.getInfoFlowClauseAccess().getDescriptorAssignment_2(), "rule__InfoFlowClause__DescriptorAssignment_2");
			builder.put(grammarAccess.getInfoFlowClauseAccess().getFromPortOrStateVarAssignment_6_0(), "rule__InfoFlowClause__FromPortOrStateVarAssignment_6_0");
			builder.put(grammarAccess.getInfoFlowClauseAccess().getFromPortOrStateVarAssignment_6_1_1(), "rule__InfoFlowClause__FromPortOrStateVarAssignment_6_1_1");
			builder.put(grammarAccess.getInfoFlowClauseAccess().getToPortOrStateVarAssignment_11_0(), "rule__InfoFlowClause__ToPortOrStateVarAssignment_11_0");
			builder.put(grammarAccess.getInfoFlowClauseAccess().getToPortOrStateVarAssignment_11_1_1(), "rule__InfoFlowClause__ToPortOrStateVarAssignment_11_1_1");
			builder.put(grammarAccess.getHandlerClauseAccess().getIdAssignment_1(), "rule__HandlerClause__IdAssignment_1");
			builder.put(grammarAccess.getHandlerClauseAccess().getModifiesAssignment_3_0(), "rule__HandlerClause__ModifiesAssignment_3_0");
			builder.put(grammarAccess.getHandlerClauseAccess().getAssumesAssignment_4(), "rule__HandlerClause__AssumesAssignment_4");
			builder.put(grammarAccess.getHandlerClauseAccess().getGuaranteesAssignment_5(), "rule__HandlerClause__GuaranteesAssignment_5");
			builder.put(grammarAccess.getHandlerClauseAccess().getCasesAssignment_6_1(), "rule__HandlerClause__CasesAssignment_6_1");
			builder.put(grammarAccess.getCaseStatementClauseAccess().getIdAssignment_1(), "rule__CaseStatementClause__IdAssignment_1");
			builder.put(grammarAccess.getCaseStatementClauseAccess().getDescriptorAssignment_2(), "rule__CaseStatementClause__DescriptorAssignment_2");
			builder.put(grammarAccess.getCaseStatementClauseAccess().getAssumeStatementAssignment_4(), "rule__CaseStatementClause__AssumeStatementAssignment_4");
			builder.put(grammarAccess.getCaseStatementClauseAccess().getGuaranteeStatementAssignment_5(), "rule__CaseStatementClause__GuaranteeStatementAssignment_5");
			builder.put(grammarAccess.getAssumeStatementAccess().getIdAssignment_1(), "rule__AssumeStatement__IdAssignment_1");
			builder.put(grammarAccess.getAssumeStatementAccess().getDescriptorAssignment_2(), "rule__AssumeStatement__DescriptorAssignment_2");
			builder.put(grammarAccess.getAssumeStatementAccess().getExprAssignment_4(), "rule__AssumeStatement__ExprAssignment_4");
			builder.put(grammarAccess.getAnonAssumeStatementAccess().getExprAssignment_1(), "rule__AnonAssumeStatement__ExprAssignment_1");
			builder.put(grammarAccess.getGuaranteeStatementAccess().getIdAssignment_1(), "rule__GuaranteeStatement__IdAssignment_1");
			builder.put(grammarAccess.getGuaranteeStatementAccess().getDescriptorAssignment_2(), "rule__GuaranteeStatement__DescriptorAssignment_2");
			builder.put(grammarAccess.getGuaranteeStatementAccess().getExprAssignment_4(), "rule__GuaranteeStatement__ExprAssignment_4");
			builder.put(grammarAccess.getAnonGuaranteeStatementAccess().getExprAssignment_1(), "rule__AnonGuaranteeStatement__ExprAssignment_1");
			builder.put(grammarAccess.getDataElementAccess().getDataElementAssignment(), "rule__DataElement__DataElementAssignment");
			builder.put(grammarAccess.getSubcomponentElementAccess().getSubcomponentAssignment(), "rule__SubcomponentElement__SubcomponentAssignment");
			builder.put(grammarAccess.getFunctionsAccess().getSpecsAssignment_1(), "rule__Functions__SpecsAssignment_1");
			builder.put(grammarAccess.getSlangDefDefAccess().getNameAssignment_1(), "rule__SlangDefDef__NameAssignment_1");
			builder.put(grammarAccess.getSlangDefDefAccess().getTypeParamsAssignment_2(), "rule__SlangDefDef__TypeParamsAssignment_2");
			builder.put(grammarAccess.getSlangDefDefAccess().getParamsAssignment_3(), "rule__SlangDefDef__ParamsAssignment_3");
			builder.put(grammarAccess.getSlangDefDefAccess().getTypeAssignment_5(), "rule__SlangDefDef__TypeAssignment_5");
			builder.put(grammarAccess.getSlangDefDefAccess().getMethodContractAssignment_7(), "rule__SlangDefDef__MethodContractAssignment_7");
			builder.put(grammarAccess.getSlangDefDefAccess().getBodyAssignment_8(), "rule__SlangDefDef__BodyAssignment_8");
			builder.put(grammarAccess.getSlangDefParamsAccess().getParamsAssignment_1_0(), "rule__SlangDefParams__ParamsAssignment_1_0");
			builder.put(grammarAccess.getSlangDefParamsAccess().getParamsAssignment_1_1_1(), "rule__SlangDefParams__ParamsAssignment_1_1_1");
			builder.put(grammarAccess.getSlangDefParamAccess().getNameAssignment_0(), "rule__SlangDefParam__NameAssignment_0");
			builder.put(grammarAccess.getSlangDefParamAccess().getIsMethodDefAssignment_2(), "rule__SlangDefParam__IsMethodDefAssignment_2");
			builder.put(grammarAccess.getSlangDefParamAccess().getTypeNameAssignment_3(), "rule__SlangDefParam__TypeNameAssignment_3");
			builder.put(grammarAccess.getSlangDefParamAccess().getIsVarArgAssignment_4(), "rule__SlangDefParam__IsVarArgAssignment_4");
			builder.put(grammarAccess.getSlangTypeParamsAccess().getTypeParamAssignment_1(), "rule__SlangTypeParams__TypeParamAssignment_1");
			builder.put(grammarAccess.getSlangTypeParamsAccess().getTypeParamAssignment_2_1(), "rule__SlangTypeParams__TypeParamAssignment_2_1");
			builder.put(grammarAccess.getSlangTypeParamAccess().getIsMutAssignment_0(), "rule__SlangTypeParam__IsMutAssignment_0");
			builder.put(grammarAccess.getSlangTypeParamAccess().getNameAssignment_1(), "rule__SlangTypeParam__NameAssignment_1");
			builder.put(grammarAccess.getSlangDefContractAccess().getReadsAssignment_1_0_0(), "rule__SlangDefContract__ReadsAssignment_1_0_0");
			builder.put(grammarAccess.getSlangDefContractAccess().getRequiresAssignment_1_1_0(), "rule__SlangDefContract__RequiresAssignment_1_1_0");
			builder.put(grammarAccess.getSlangDefContractAccess().getModifiesAssignment_1_2_0(), "rule__SlangDefContract__ModifiesAssignment_1_2_0");
			builder.put(grammarAccess.getSlangDefContractAccess().getEnsuresAssignment_1_3_0(), "rule__SlangDefContract__EnsuresAssignment_1_3_0");
			builder.put(grammarAccess.getSlangInvariantAccess().getExprsAssignment_1(), "rule__SlangInvariant__ExprsAssignment_1");
			builder.put(grammarAccess.getSlangInvariantAccess().getExprsAssignment_2_1(), "rule__SlangInvariant__ExprsAssignment_2_1");
			builder.put(grammarAccess.getSlangRequiresAccess().getExprsAssignment_1(), "rule__SlangRequires__ExprsAssignment_1");
			builder.put(grammarAccess.getSlangRequiresAccess().getExprsAssignment_2_1(), "rule__SlangRequires__ExprsAssignment_2_1");
			builder.put(grammarAccess.getSlangReadsAccess().getExprsAssignment_1(), "rule__SlangReads__ExprsAssignment_1");
			builder.put(grammarAccess.getSlangReadsAccess().getExprsAssignment_2_1(), "rule__SlangReads__ExprsAssignment_2_1");
			builder.put(grammarAccess.getSlangModifiesAccess().getExprsAssignment_1(), "rule__SlangModifies__ExprsAssignment_1");
			builder.put(grammarAccess.getSlangModifiesAccess().getExprsAssignment_2_1(), "rule__SlangModifies__ExprsAssignment_2_1");
			builder.put(grammarAccess.getSlangEnsuresAccess().getExprsAssignment_1(), "rule__SlangEnsures__ExprsAssignment_1");
			builder.put(grammarAccess.getSlangEnsuresAccess().getExprsAssignment_2_1(), "rule__SlangEnsures__ExprsAssignment_2_1");
			builder.put(grammarAccess.getSlangBaseTypeAccess().getTypeNameAssignment(), "rule__SlangBaseType__TypeNameAssignment");
			builder.put(grammarAccess.getSlangStmtAccess().getDAssignment_0_1(), "rule__SlangStmt__DAssignment_0_1");
			builder.put(grammarAccess.getSlangStmtAccess().getCondAssignment_1_2(), "rule__SlangStmt__CondAssignment_1_2");
			builder.put(grammarAccess.getSlangStmtAccess().getBAssignment_1_3(), "rule__SlangStmt__BAssignment_1_3");
			builder.put(grammarAccess.getSlangStmtAccess().getEAssignment_1_4(), "rule__SlangStmt__EAssignment_1_4");
			builder.put(grammarAccess.getSlangStmtAccess().getCondAssignment_2_2(), "rule__SlangStmt__CondAssignment_2_2");
			builder.put(grammarAccess.getSlangStmtAccess().getLAssignment_2_3(), "rule__SlangStmt__LAssignment_2_3");
			builder.put(grammarAccess.getSlangStmtAccess().getBAssignment_2_4(), "rule__SlangStmt__BAssignment_2_4");
			builder.put(grammarAccess.getSlangStmtAccess().getTestExprAssignment_3_2(), "rule__SlangStmt__TestExprAssignment_3_2");
			builder.put(grammarAccess.getSlangStmtAccess().getCAssignment_3_4(), "rule__SlangStmt__CAssignment_3_4");
			builder.put(grammarAccess.getSlangStmtAccess().getBAssignment_4_2(), "rule__SlangStmt__BAssignment_4_2");
			builder.put(grammarAccess.getSlangStmtAccess().getEAssignment_5_2(), "rule__SlangStmt__EAssignment_5_2");
			builder.put(grammarAccess.getSlangStmtAccess().getEAssignment_6_2(), "rule__SlangStmt__EAssignment_6_2");
			builder.put(grammarAccess.getSlangStmtAccess().getEAssignment_8_2(), "rule__SlangStmt__EAssignment_8_2");
			builder.put(grammarAccess.getSlangElseAccess().getCondAssignment_1_0_1(), "rule__SlangElse__CondAssignment_1_0_1");
			builder.put(grammarAccess.getSlangElseAccess().getBAssignment_1_0_2(), "rule__SlangElse__BAssignment_1_0_2");
			builder.put(grammarAccess.getSlangElseAccess().getEAssignment_1_0_3(), "rule__SlangElse__EAssignment_1_0_3");
			builder.put(grammarAccess.getSlangLoopContractAccess().getInvAssignment_1(), "rule__SlangLoopContract__InvAssignment_1");
			builder.put(grammarAccess.getSlangLoopContractAccess().getModAssignment_2(), "rule__SlangLoopContract__ModAssignment_2");
			builder.put(grammarAccess.getSlangCaseAccess().getPatternAssignment_1(), "rule__SlangCase__PatternAssignment_1");
			builder.put(grammarAccess.getSlangCaseAccess().getEAssignment_2_1(), "rule__SlangCase__EAssignment_2_1");
			builder.put(grammarAccess.getSlangCaseAccess().getSAssignment_4(), "rule__SlangCase__SAssignment_4");
			builder.put(grammarAccess.getSlangPatternAccess().getPatternsAssignment_0_2_1(), "rule__SlangPattern__PatternsAssignment_0_2_1");
			builder.put(grammarAccess.getSlangPatternAccess().getPatternsAssignment_0_2_2_1(), "rule__SlangPattern__PatternsAssignment_0_2_2_1");
			builder.put(grammarAccess.getSlangPatternAccess().getPatternsAssignment_1_1(), "rule__SlangPattern__PatternsAssignment_1_1");
			builder.put(grammarAccess.getSlangPatternAccess().getPatternsAssignment_1_2_1(), "rule__SlangPattern__PatternsAssignment_1_2_1");
			builder.put(grammarAccess.getSlangTPatternAccess().getPatternsAssignment_0_2_0_1(), "rule__SlangTPattern__PatternsAssignment_0_2_0_1");
			builder.put(grammarAccess.getSlangTPatternAccess().getPatternsAssignment_0_2_0_2_1(), "rule__SlangTPattern__PatternsAssignment_0_2_0_2_1");
			builder.put(grammarAccess.getSlangTPatternAccess().getTypeAssignment_0_2_1_1(), "rule__SlangTPattern__TypeAssignment_0_2_1_1");
			builder.put(grammarAccess.getSlangTPatternAccess().getPatternsAssignment_1_1(), "rule__SlangTPattern__PatternsAssignment_1_1");
			builder.put(grammarAccess.getSlangTPatternAccess().getPatternsAssignment_1_2_1(), "rule__SlangTPattern__PatternsAssignment_1_2_1");
			builder.put(grammarAccess.getSlangTPatternAccess().getTypeAssignment_2_2_1(), "rule__SlangTPattern__TypeAssignment_2_2_1");
			builder.put(grammarAccess.getSlangVarDefAccess().getTypeNameAssignment_2_1(), "rule__SlangVarDef__TypeNameAssignment_2_1");
			builder.put(grammarAccess.getSlangVarDefAccess().getInitAssignment_4(), "rule__SlangVarDef__InitAssignment_4");
			builder.put(grammarAccess.getSlangBlockAccess().getStmtsAssignment_2(), "rule__SlangBlock__StmtsAssignment_2");
			builder.put(grammarAccess.getSlangBlockAccess().getRAssignment_3(), "rule__SlangBlock__RAssignment_3");
			builder.put(grammarAccess.getSlangExpressionAccess().getIfCondAssignment_1_3(), "rule__SlangExpression__IfCondAssignment_1_3");
			builder.put(grammarAccess.getSlangExpressionAccess().getThenExprAssignment_1_5(), "rule__SlangExpression__ThenExprAssignment_1_5");
			builder.put(grammarAccess.getSlangExpressionAccess().getElseExprAssignment_1_7(), "rule__SlangExpression__ElseExprAssignment_1_7");
			builder.put(grammarAccess.getSlangExpressionAccess().getQuantifierAssignment_2_1(), "rule__SlangExpression__QuantifierAssignment_2_1");
			builder.put(grammarAccess.getSlangExpressionAccess().getQuantRangeAssignment_2_3(), "rule__SlangExpression__QuantRangeAssignment_2_3");
			builder.put(grammarAccess.getSlangExpressionAccess().getQuantParamAssignment_2_6(), "rule__SlangExpression__QuantParamAssignment_2_6");
			builder.put(grammarAccess.getSlangExpressionAccess().getQuantifiedExprAssignment_2_8(), "rule__SlangExpression__QuantifiedExprAssignment_2_8");
			builder.put(grammarAccess.getQuantRangeAccess().getLoAssignment_0(), "rule__QuantRange__LoAssignment_0");
			builder.put(grammarAccess.getQuantRangeAccess().getExtentAssignment_1(), "rule__QuantRange__ExtentAssignment_1");
			builder.put(grammarAccess.getQuantRangeAccess().getHighAssignment_2(), "rule__QuantRange__HighAssignment_2");
			builder.put(grammarAccess.getQuantParamAccess().getNameAssignment_0(), "rule__QuantParam__NameAssignment_0");
			builder.put(grammarAccess.getQuantParamAccess().getNameAssignment_1_1(), "rule__QuantParam__NameAssignment_1_1");
			builder.put(grammarAccess.getQuantParamAccess().getTypeNameAssignment_1_3(), "rule__QuantParam__TypeNameAssignment_1_3");
			builder.put(grammarAccess.getImpliesExpressionAccess().getOpAssignment_1_1(), "rule__ImpliesExpression__OpAssignment_1_1");
			builder.put(grammarAccess.getImpliesExpressionAccess().getRightAssignment_1_2(), "rule__ImpliesExpression__RightAssignment_1_2");
			builder.put(grammarAccess.getOrExpressionAccess().getOpAssignment_1_1(), "rule__OrExpression__OpAssignment_1_1");
			builder.put(grammarAccess.getOrExpressionAccess().getRightAssignment_1_2(), "rule__OrExpression__RightAssignment_1_2");
			builder.put(grammarAccess.getAndExpressionAccess().getOpAssignment_1_1(), "rule__AndExpression__OpAssignment_1_1");
			builder.put(grammarAccess.getAndExpressionAccess().getRightAssignment_1_2(), "rule__AndExpression__RightAssignment_1_2");
			builder.put(grammarAccess.getEqualNotExpressionAccess().getOpAssignment_1_1(), "rule__EqualNotExpression__OpAssignment_1_1");
			builder.put(grammarAccess.getEqualNotExpressionAccess().getRightAssignment_1_2(), "rule__EqualNotExpression__RightAssignment_1_2");
			builder.put(grammarAccess.getLtGtExpressionAccess().getOpAssignment_1_1(), "rule__LtGtExpression__OpAssignment_1_1");
			builder.put(grammarAccess.getLtGtExpressionAccess().getRightAssignment_1_2(), "rule__LtGtExpression__RightAssignment_1_2");
			builder.put(grammarAccess.getColonExpressionAccess().getOpAssignment_1_1(), "rule__ColonExpression__OpAssignment_1_1");
			builder.put(grammarAccess.getColonExpressionAccess().getRightAssignment_1_2(), "rule__ColonExpression__RightAssignment_1_2");
			builder.put(grammarAccess.getPlusMinusExpressionAccess().getOpAssignment_1_1(), "rule__PlusMinusExpression__OpAssignment_1_1");
			builder.put(grammarAccess.getPlusMinusExpressionAccess().getRightAssignment_1_2(), "rule__PlusMinusExpression__RightAssignment_1_2");
			builder.put(grammarAccess.getMultiplicativeExpressionAccess().getOpAssignment_1_1(), "rule__MultiplicativeExpression__OpAssignment_1_1");
			builder.put(grammarAccess.getMultiplicativeExpressionAccess().getRightAssignment_1_2(), "rule__MultiplicativeExpression__RightAssignment_1_2");
			builder.put(grammarAccess.getUnaryExpressionAccess().getOpAssignment_0_1(), "rule__UnaryExpression__OpAssignment_0_1");
			builder.put(grammarAccess.getUnaryExpressionAccess().getExpAssignment_0_2(), "rule__UnaryExpression__ExpAssignment_0_2");
			builder.put(grammarAccess.getPrimaryExprAccess().getBaseExpAssignment_1_1(), "rule__PrimaryExpr__BaseExpAssignment_1_1");
			builder.put(grammarAccess.getPrimaryExprAccess().getPostsAssignment_1_2(), "rule__PrimaryExpr__PostsAssignment_1_2");
			builder.put(grammarAccess.getBaseExprAccess().getLitAssignment_0_1(), "rule__BaseExpr__LitAssignment_0_1");
			builder.put(grammarAccess.getBaseExprAccess().getIAssignment_1_1(), "rule__BaseExpr__IAssignment_1_1");
			builder.put(grammarAccess.getBaseExprAccess().getStateVarAssignment_2_1(), "rule__BaseExpr__StateVarAssignment_2_1");
			builder.put(grammarAccess.getBaseExprAccess().getEventPortAssignment_3_1(), "rule__BaseExpr__EventPortAssignment_3_1");
			builder.put(grammarAccess.getBaseExprAccess().getValueAssignment_3_2_1(), "rule__BaseExpr__ValueAssignment_3_2_1");
			builder.put(grammarAccess.getBaseExprAccess().getEventPortAssignment_4_1(), "rule__BaseExpr__EventPortAssignment_4_1");
			builder.put(grammarAccess.getBaseExprAccess().getValueAssignment_4_2_1(), "rule__BaseExpr__ValueAssignment_4_2_1");
			builder.put(grammarAccess.getBaseExprAccess().getEventPortAssignment_5_1(), "rule__BaseExpr__EventPortAssignment_5_1");
			builder.put(grammarAccess.getBaseExprAccess().getEventPortAssignment_6_1(), "rule__BaseExpr__EventPortAssignment_6_1");
			builder.put(grammarAccess.getBaseExprAccess().getEnumTypeAssignment_7_0_1(), "rule__BaseExpr__EnumTypeAssignment_7_0_1");
			builder.put(grammarAccess.getBaseExprAccess().getValueAssignment_7_1(), "rule__BaseExpr__ValueAssignment_7_1");
			builder.put(grammarAccess.getBaseExprAccess().getExpAssignment_9_2(), "rule__BaseExpr__ExpAssignment_9_2");
			builder.put(grammarAccess.getBaseExprAccess().getRAssignment_10_2(), "rule__BaseExpr__RAssignment_10_2");
			builder.put(grammarAccess.getBaseExprAccess().getRAssignment_10_3_1(), "rule__BaseExpr__RAssignment_10_3_1");
			builder.put(grammarAccess.getBaseExprAccess().getBAssignment_10_5_0(), "rule__BaseExpr__BAssignment_10_5_0");
			builder.put(grammarAccess.getBaseExprAccess().getEAssignment_10_5_1_1(), "rule__BaseExpr__EAssignment_10_5_1_1");
			builder.put(grammarAccess.getBaseExprAccess().getPAssignment_11_2_0_0_0(), "rule__BaseExpr__PAssignment_11_2_0_0_0");
			builder.put(grammarAccess.getBaseExprAccess().getEAssignment_11_2_0_1(), "rule__BaseExpr__EAssignment_11_2_0_1");
			builder.put(grammarAccess.getBaseExprAccess().getStmtAssignment_11_2_1_0(), "rule__BaseExpr__StmtAssignment_11_2_1_0");
			builder.put(grammarAccess.getBaseExprAccess().getRAssignment_11_2_1_1(), "rule__BaseExpr__RAssignment_11_2_1_1");
			builder.put(grammarAccess.getFloatObjectExprAccess().getAttrAssignment_0_3(), "rule__FloatObjectExpr__AttrAssignment_0_3");
			builder.put(grammarAccess.getFloatObjectExprAccess().getAttrAssignment_1_3(), "rule__FloatObjectExpr__AttrAssignment_1_3");
			builder.put(grammarAccess.getAccessibleBaseExprAccess().getIdAssignment_0_0_1(), "rule__AccessibleBaseExpr__IdAssignment_0_0_1");
			builder.put(grammarAccess.getAccessibleBaseExprAccess().getCallSuffixAssignment_0_0_2(), "rule__AccessibleBaseExpr__CallSuffixAssignment_0_0_2");
			builder.put(grammarAccess.getAccessibleBaseExprAccess().getRecordTypeAssignment_1_0_0_1(), "rule__AccessibleBaseExpr__RecordTypeAssignment_1_0_0_1");
			builder.put(grammarAccess.getAccessibleBaseExprAccess().getArgsAssignment_1_0_0_3(), "rule__AccessibleBaseExpr__ArgsAssignment_1_0_0_3");
			builder.put(grammarAccess.getAccessibleBaseExprAccess().getArgExprAssignment_1_1(), "rule__AccessibleBaseExpr__ArgExprAssignment_1_1");
			builder.put(grammarAccess.getAccessibleBaseExprAccess().getArgsAssignment_1_2_1(), "rule__AccessibleBaseExpr__ArgsAssignment_1_2_1");
			builder.put(grammarAccess.getAccessibleBaseExprAccess().getArgExprAssignment_1_2_3(), "rule__AccessibleBaseExpr__ArgExprAssignment_1_2_3");
			builder.put(grammarAccess.getAccessibleBaseExprAccess().getPortOrSubcomponentOrStateVarAssignment_2_1(), "rule__AccessibleBaseExpr__PortOrSubcomponentOrStateVarAssignment_2_1");
			builder.put(grammarAccess.getMemberAccessAccess().getFieldAssignment_1(), "rule__MemberAccess__FieldAssignment_1");
			builder.put(grammarAccess.getArrayAccessAccess().getIndexAssignment_1(), "rule__ArrayAccess__IndexAssignment_1");
			builder.put(grammarAccess.getArrayAccessAccess().getIndexAssignment_2_1(), "rule__ArrayAccess__IndexAssignment_2_1");
			builder.put(grammarAccess.getOtherDataRefAccess().getNamedElementAssignment_0_0(), "rule__OtherDataRef__NamedElementAssignment_0_0");
			builder.put(grammarAccess.getOtherDataRefAccess().getArrayRangeAssignment_0_1(), "rule__OtherDataRef__ArrayRangeAssignment_0_1");
			builder.put(grammarAccess.getOtherDataRefAccess().getPathAssignment_1_1(), "rule__OtherDataRef__PathAssignment_1_1");
			builder.put(grammarAccess.getSlangParamsAccess().getParamsAssignment_1(), "rule__SlangParams__ParamsAssignment_1");
			builder.put(grammarAccess.getSlangParamsAccess().getParamsAssignment_2_1(), "rule__SlangParams__ParamsAssignment_2_1");
			builder.put(grammarAccess.getSlangParamAccess().getNameAssignment_1(), "rule__SlangParam__NameAssignment_1");
			builder.put(grammarAccess.getSlangParamAccess().getTypeNameAssignment_4(), "rule__SlangParam__TypeNameAssignment_4");
			builder.put(grammarAccess.getSlangForRangeAccess().getEAssignment_2(), "rule__SlangForRange__EAssignment_2");
			builder.put(grammarAccess.getSlangForRangeAccess().getUpperAssignment_3_1(), "rule__SlangForRange__UpperAssignment_3_1");
			builder.put(grammarAccess.getSlangForRangeAccess().getStepAssignment_3_2_1(), "rule__SlangForRange__StepAssignment_3_2_1");
			builder.put(grammarAccess.getSlangRetAccess().getEAssignment_2(), "rule__SlangRet__EAssignment_2");
			builder.put(grammarAccess.getSlangCallSuffixAccess().getCaAssignment_1(), "rule__SlangCallSuffix__CaAssignment_1");
			builder.put(grammarAccess.getSlangCallArgsAccess().getArgAssignment_2_0(), "rule__SlangCallArgs__ArgAssignment_2_0");
			builder.put(grammarAccess.getSlangCallArgsAccess().getArgAssignment_2_1_1(), "rule__SlangCallArgs__ArgAssignment_2_1_1");
			builder.put(grammarAccess.getSlangLitAccess().getValueAssignment_0_1(), "rule__SlangLit__ValueAssignment_0_1");
			builder.put(grammarAccess.getSlangLitAccess().getValueAssignment_1_1(), "rule__SlangLit__ValueAssignment_1_1");
			builder.put(grammarAccess.getSlangLitAccess().getValueAssignment_2_1(), "rule__SlangLit__ValueAssignment_2_1");
			builder.put(grammarAccess.getSlangLitAccess().getValueAssignment_3_1(), "rule__SlangLit__ValueAssignment_3_1");
			builder.put(grammarAccess.getSlangLitAccess().getValueAssignment_4_1(), "rule__SlangLit__ValueAssignment_4_1");
			builder.put(grammarAccess.getSlangLitAccess().getValueAssignment_5_1(), "rule__SlangLit__ValueAssignment_5_1");
			builder.put(grammarAccess.getSlangLitAccess().getValueAssignment_6_1(), "rule__SlangLit__ValueAssignment_6_1");
			builder.put(grammarAccess.getSlangInterpAccess().getSliAssignment_1(), "rule__SlangInterp__SliAssignment_1");
			builder.put(grammarAccess.getContainedPropertyAssociationAccess().getPropertyAssignment_0(), "rule__ContainedPropertyAssociation__PropertyAssignment_0");
			builder.put(grammarAccess.getContainedPropertyAssociationAccess().getAppendAssignment_1_1(), "rule__ContainedPropertyAssociation__AppendAssignment_1_1");
			builder.put(grammarAccess.getContainedPropertyAssociationAccess().getConstantAssignment_2(), "rule__ContainedPropertyAssociation__ConstantAssignment_2");
			builder.put(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueAssignment_3_0(), "rule__ContainedPropertyAssociation__OwnedValueAssignment_3_0");
			builder.put(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueAssignment_3_1_1(), "rule__ContainedPropertyAssociation__OwnedValueAssignment_3_1_1");
			builder.put(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToAssignment_4_1(), "rule__ContainedPropertyAssociation__AppliesToAssignment_4_1");
			builder.put(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToAssignment_4_2_1(), "rule__ContainedPropertyAssociation__AppliesToAssignment_4_2_1");
			builder.put(grammarAccess.getContainedPropertyAssociationAccess().getInBindingAssignment_5_2(), "rule__ContainedPropertyAssociation__InBindingAssignment_5_2");
			builder.put(grammarAccess.getPropertyAssociationAccess().getPropertyAssignment_0(), "rule__PropertyAssociation__PropertyAssignment_0");
			builder.put(grammarAccess.getPropertyAssociationAccess().getAppendAssignment_1_1(), "rule__PropertyAssociation__AppendAssignment_1_1");
			builder.put(grammarAccess.getPropertyAssociationAccess().getConstantAssignment_2(), "rule__PropertyAssociation__ConstantAssignment_2");
			builder.put(grammarAccess.getPropertyAssociationAccess().getOwnedValueAssignment_3_0(), "rule__PropertyAssociation__OwnedValueAssignment_3_0");
			builder.put(grammarAccess.getPropertyAssociationAccess().getOwnedValueAssignment_3_1_1(), "rule__PropertyAssociation__OwnedValueAssignment_3_1_1");
			builder.put(grammarAccess.getPropertyAssociationAccess().getInBindingAssignment_4_2(), "rule__PropertyAssociation__InBindingAssignment_4_2");
			builder.put(grammarAccess.getBasicPropertyAssociationAccess().getPropertyAssignment_0(), "rule__BasicPropertyAssociation__PropertyAssignment_0");
			builder.put(grammarAccess.getBasicPropertyAssociationAccess().getOwnedValueAssignment_2(), "rule__BasicPropertyAssociation__OwnedValueAssignment_2");
			builder.put(grammarAccess.getContainmentPathAccess().getPathAssignment(), "rule__ContainmentPath__PathAssignment");
			builder.put(grammarAccess.getModalPropertyValueAccess().getOwnedValueAssignment_0(), "rule__ModalPropertyValue__OwnedValueAssignment_0");
			builder.put(grammarAccess.getModalPropertyValueAccess().getInModeAssignment_3(), "rule__ModalPropertyValue__InModeAssignment_3");
			builder.put(grammarAccess.getModalPropertyValueAccess().getInModeAssignment_4_1(), "rule__ModalPropertyValue__InModeAssignment_4_1");
			builder.put(grammarAccess.getOptionalModalPropertyValueAccess().getOwnedValueAssignment_0(), "rule__OptionalModalPropertyValue__OwnedValueAssignment_0");
			builder.put(grammarAccess.getOptionalModalPropertyValueAccess().getInModeAssignment_1_2(), "rule__OptionalModalPropertyValue__InModeAssignment_1_2");
			builder.put(grammarAccess.getOptionalModalPropertyValueAccess().getInModeAssignment_1_3_1(), "rule__OptionalModalPropertyValue__InModeAssignment_1_3_1");
			builder.put(grammarAccess.getPropertyValueAccess().getOwnedValueAssignment(), "rule__PropertyValue__OwnedValueAssignment");
			builder.put(grammarAccess.getLiteralorReferenceTermAccess().getNamedValueAssignment(), "rule__LiteralorReferenceTerm__NamedValueAssignment");
			builder.put(grammarAccess.getBooleanLiteralAccess().getValueAssignment_1_0(), "rule__BooleanLiteral__ValueAssignment_1_0");
			builder.put(grammarAccess.getConstantValueAccess().getNamedValueAssignment(), "rule__ConstantValue__NamedValueAssignment");
			builder.put(grammarAccess.getReferenceTermAccess().getPathAssignment_2(), "rule__ReferenceTerm__PathAssignment_2");
			builder.put(grammarAccess.getRecordTermAccess().getOwnedFieldValueAssignment_1(), "rule__RecordTerm__OwnedFieldValueAssignment_1");
			builder.put(grammarAccess.getOldRecordTermAccess().getOwnedFieldValueAssignment_1(), "rule__OldRecordTerm__OwnedFieldValueAssignment_1");
			builder.put(grammarAccess.getComputedTermAccess().getFunctionAssignment_2(), "rule__ComputedTerm__FunctionAssignment_2");
			builder.put(grammarAccess.getComponentClassifierTermAccess().getClassifierAssignment_2(), "rule__ComponentClassifierTerm__ClassifierAssignment_2");
			builder.put(grammarAccess.getListTermAccess().getOwnedListElementAssignment_2_0(), "rule__ListTerm__OwnedListElementAssignment_2_0");
			builder.put(grammarAccess.getListTermAccess().getOwnedListElementAssignment_2_1_1(), "rule__ListTerm__OwnedListElementAssignment_2_1_1");
			builder.put(grammarAccess.getFieldPropertyAssociationAccess().getPropertyAssignment_0(), "rule__FieldPropertyAssociation__PropertyAssignment_0");
			builder.put(grammarAccess.getFieldPropertyAssociationAccess().getOwnedValueAssignment_2(), "rule__FieldPropertyAssociation__OwnedValueAssignment_2");
			builder.put(grammarAccess.getContainmentPathElementAccess().getNamedElementAssignment_0_0(), "rule__ContainmentPathElement__NamedElementAssignment_0_0");
			builder.put(grammarAccess.getContainmentPathElementAccess().getArrayRangeAssignment_0_1(), "rule__ContainmentPathElement__ArrayRangeAssignment_0_1");
			builder.put(grammarAccess.getContainmentPathElementAccess().getPathAssignment_1_1(), "rule__ContainmentPathElement__PathAssignment_1_1");
			builder.put(grammarAccess.getStringTermAccess().getValueAssignment(), "rule__StringTerm__ValueAssignment");
			builder.put(grammarAccess.getArrayRangeAccess().getLowerBoundAssignment_2(), "rule__ArrayRange__LowerBoundAssignment_2");
			builder.put(grammarAccess.getArrayRangeAccess().getUpperBoundAssignment_3_1(), "rule__ArrayRange__UpperBoundAssignment_3_1");
			builder.put(grammarAccess.getSignedConstantAccess().getOpAssignment_0(), "rule__SignedConstant__OpAssignment_0");
			builder.put(grammarAccess.getSignedConstantAccess().getOwnedPropertyExpressionAssignment_1(), "rule__SignedConstant__OwnedPropertyExpressionAssignment_1");
			builder.put(grammarAccess.getIntegerTermAccess().getValueAssignment_0(), "rule__IntegerTerm__ValueAssignment_0");
			builder.put(grammarAccess.getIntegerTermAccess().getUnitAssignment_1(), "rule__IntegerTerm__UnitAssignment_1");
			builder.put(grammarAccess.getRealTermAccess().getValueAssignment_0(), "rule__RealTerm__ValueAssignment_0");
			builder.put(grammarAccess.getRealTermAccess().getUnitAssignment_1(), "rule__RealTerm__UnitAssignment_1");
			builder.put(grammarAccess.getNumericRangeTermAccess().getMinimumAssignment_0(), "rule__NumericRangeTerm__MinimumAssignment_0");
			builder.put(grammarAccess.getNumericRangeTermAccess().getMaximumAssignment_2(), "rule__NumericRangeTerm__MaximumAssignment_2");
			builder.put(grammarAccess.getNumericRangeTermAccess().getDeltaAssignment_3_1(), "rule__NumericRangeTerm__DeltaAssignment_3_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private GumboGrammarAccess grammarAccess;

	@Override
	protected InternalGumboParser createParser() {
		InternalGumboParser result = new InternalGumboParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_SL_COMMENT" };
	}

	public GumboGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(GumboGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
