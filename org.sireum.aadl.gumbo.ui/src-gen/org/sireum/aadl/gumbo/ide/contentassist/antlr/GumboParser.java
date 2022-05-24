
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
			builder.put(grammarAccess.getSlangDefModsAccess().getAlternatives(), "rule__SlangDefMods__Alternatives");
			builder.put(grammarAccess.getSlangDefIDAccess().getAlternatives(), "rule__SlangDefID__Alternatives");
			builder.put(grammarAccess.getSlangDefContractAccess().getAlternatives_2(), "rule__SlangDefContract__Alternatives_2");
			builder.put(grammarAccess.getSlangStmtAccess().getAlternatives(), "rule__SlangStmt__Alternatives");
			builder.put(grammarAccess.getSlangStmtAccess().getAlternatives_9_2(), "rule__SlangStmt__Alternatives_9_2");
			builder.put(grammarAccess.getSlangStmtAccess().getAlternatives_9_2_1_0(), "rule__SlangStmt__Alternatives_9_2_1_0");
			builder.put(grammarAccess.getSlangElseAccess().getAlternatives_1(), "rule__SlangElse__Alternatives_1");
			builder.put(grammarAccess.getSlangLHSSuffixAccess().getAlternatives(), "rule__SlangLHSSuffix__Alternatives");
			builder.put(grammarAccess.getSlangPatternAccess().getAlternatives(), "rule__SlangPattern__Alternatives");
			builder.put(grammarAccess.getSlangTPatternAccess().getAlternatives(), "rule__SlangTPattern__Alternatives");
			builder.put(grammarAccess.getSlangTPatternAccess().getAlternatives_0_2(), "rule__SlangTPattern__Alternatives_0_2");
			builder.put(grammarAccess.getSlangVarModAccess().getAlternatives(), "rule__SlangVarMod__Alternatives");
			builder.put(grammarAccess.getExprAccess().getAlternatives(), "rule__Expr__Alternatives");
			builder.put(grammarAccess.getExprAccess().getAlternatives_0_2(), "rule__Expr__Alternatives_0_2");
			builder.put(grammarAccess.getExprAccess().getAlternatives_1_1(), "rule__Expr__Alternatives_1_1");
			builder.put(grammarAccess.getSlangQuantVarAccess().getAlternatives_3_0(), "rule__SlangQuantVar__Alternatives_3_0");
			builder.put(grammarAccess.getSlangTermAccess().getAlternatives(), "rule__SlangTerm__Alternatives");
			builder.put(grammarAccess.getSlangTermAccess().getAlternatives_7_5(), "rule__SlangTerm__Alternatives_7_5");
			builder.put(grammarAccess.getSlangTermAccess().getAlternatives_8_2(), "rule__SlangTerm__Alternatives_8_2");
			builder.put(grammarAccess.getSlangForRangeAccess().getAlternatives_3_0(), "rule__SlangForRange__Alternatives_3_0");
			builder.put(grammarAccess.getSlangCallSuffixAccess().getAlternatives(), "rule__SlangCallSuffix__Alternatives");
			builder.put(grammarAccess.getSlangLitAccess().getAlternatives(), "rule__SlangLit__Alternatives");
			builder.put(grammarAccess.getSlangLitAccess().getValueAlternatives_0_1_0(), "rule__SlangLit__ValueAlternatives_0_1_0");
			builder.put(grammarAccess.getSlangInterpAccess().getAlternatives(), "rule__SlangInterp__Alternatives");
			builder.put(grammarAccess.getSlangMInterpAccess().getAlternatives_3(), "rule__SlangMInterp__Alternatives_3");
			builder.put(grammarAccess.getOperatorAccess().getAlternatives(), "rule__Operator__Alternatives");
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
			builder.put(grammarAccess.getComputeAccess().getGroup(), "rule__Compute__Group__0");
			builder.put(grammarAccess.getCaseStatementClauseAccess().getGroup(), "rule__CaseStatementClause__Group__0");
			builder.put(grammarAccess.getAssumeStatementAccess().getGroup(), "rule__AssumeStatement__Group__0");
			builder.put(grammarAccess.getAnonAssumeStatementAccess().getGroup(), "rule__AnonAssumeStatement__Group__0");
			builder.put(grammarAccess.getGuaranteeStatementAccess().getGroup(), "rule__GuaranteeStatement__Group__0");
			builder.put(grammarAccess.getAnonGuaranteeStatementAccess().getGroup(), "rule__AnonGuaranteeStatement__Group__0");
			builder.put(grammarAccess.getOtherDataRefAccess().getGroup(), "rule__OtherDataRef__Group__0");
			builder.put(grammarAccess.getOtherDataRefAccess().getGroup_0(), "rule__OtherDataRef__Group_0__0");
			builder.put(grammarAccess.getOtherDataRefAccess().getGroup_1(), "rule__OtherDataRef__Group_1__0");
			builder.put(grammarAccess.getFunctionsAccess().getGroup(), "rule__Functions__Group__0");
			builder.put(grammarAccess.getFuncSpecAccess().getGroup(), "rule__FuncSpec__Group__0");
			builder.put(grammarAccess.getSlangDefDeclDefAccess().getGroup(), "rule__SlangDefDeclDef__Group__0");
			builder.put(grammarAccess.getSlangDefDeclDefAccess().getGroup_9(), "rule__SlangDefDeclDef__Group_9__0");
			builder.put(grammarAccess.getSlangDefDeclAccess().getGroup(), "rule__SlangDefDecl__Group__0");
			builder.put(grammarAccess.getSlangDefDefAccess().getGroup(), "rule__SlangDefDef__Group__0");
			builder.put(grammarAccess.getSlangDefExtAccess().getGroup(), "rule__SlangDefExt__Group__0");
			builder.put(grammarAccess.getSlangDefParamsAccess().getGroup(), "rule__SlangDefParams__Group__0");
			builder.put(grammarAccess.getSlangDefParamsAccess().getGroup_2(), "rule__SlangDefParams__Group_2__0");
			builder.put(grammarAccess.getSlangDefParamAccess().getGroup(), "rule__SlangDefParam__Group__0");
			builder.put(grammarAccess.getSlangTypeParamsAccess().getGroup(), "rule__SlangTypeParams__Group__0");
			builder.put(grammarAccess.getSlangTypeParamsAccess().getGroup_2(), "rule__SlangTypeParams__Group_2__0");
			builder.put(grammarAccess.getSlangTypeParamAccess().getGroup(), "rule__SlangTypeParam__Group__0");
			builder.put(grammarAccess.getSlangDefContractAccess().getGroup(), "rule__SlangDefContract__Group__0");
			builder.put(grammarAccess.getSlangDefContractAccess().getGroup_2_0(), "rule__SlangDefContract__Group_2_0__0");
			builder.put(grammarAccess.getSlangDefContractAccess().getGroup_2_1(), "rule__SlangDefContract__Group_2_1__0");
			builder.put(grammarAccess.getSlangDefContractCaseAccess().getGroup(), "rule__SlangDefContractCase__Group__0");
			builder.put(grammarAccess.getSlangSuprsAccess().getGroup(), "rule__SlangSuprs__Group__0");
			builder.put(grammarAccess.getSlangSuprsAccess().getGroup_2(), "rule__SlangSuprs__Group_2__0");
			builder.put(grammarAccess.getSlangSuprAccess().getGroup(), "rule__SlangSupr__Group__0");
			builder.put(grammarAccess.getSlangNameAccess().getGroup(), "rule__SlangName__Group__0");
			builder.put(grammarAccess.getSlangNameAccess().getGroup_1(), "rule__SlangName__Group_1__0");
			builder.put(grammarAccess.getSlangExtAccess().getGroup(), "rule__SlangExt__Group__0");
			builder.put(grammarAccess.getSlangExtAccess().getGroup_3(), "rule__SlangExt__Group_3__0");
			builder.put(grammarAccess.getSlangInvariantAccess().getGroup(), "rule__SlangInvariant__Group__0");
			builder.put(grammarAccess.getSlangInvariantAccess().getGroup_2(), "rule__SlangInvariant__Group_2__0");
			builder.put(grammarAccess.getSlangReadsAccess().getGroup(), "rule__SlangReads__Group__0");
			builder.put(grammarAccess.getSlangReadsAccess().getGroup_2(), "rule__SlangReads__Group_2__0");
			builder.put(grammarAccess.getSlangRequiresAccess().getGroup(), "rule__SlangRequires__Group__0");
			builder.put(grammarAccess.getSlangRequiresAccess().getGroup_2(), "rule__SlangRequires__Group_2__0");
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
			builder.put(grammarAccess.getSlangStmtAccess().getGroup_9(), "rule__SlangStmt__Group_9__0");
			builder.put(grammarAccess.getSlangStmtAccess().getGroup_9_2_1(), "rule__SlangStmt__Group_9_2_1__0");
			builder.put(grammarAccess.getSlangElseAccess().getGroup(), "rule__SlangElse__Group__0");
			builder.put(grammarAccess.getSlangElseAccess().getGroup_1_0(), "rule__SlangElse__Group_1_0__0");
			builder.put(grammarAccess.getSlangLoopContractAccess().getGroup(), "rule__SlangLoopContract__Group__0");
			builder.put(grammarAccess.getSlangLHSSuffixAccess().getGroup_0(), "rule__SlangLHSSuffix__Group_0__0");
			builder.put(grammarAccess.getSlangLHSSuffixAccess().getGroup_1(), "rule__SlangLHSSuffix__Group_1__0");
			builder.put(grammarAccess.getSlangLHSSuffixAccess().getGroup_1_2(), "rule__SlangLHSSuffix__Group_1_2__0");
			builder.put(grammarAccess.getSlangLHSSuffixAccess().getGroup_1_2_1(), "rule__SlangLHSSuffix__Group_1_2_1__0");
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
			builder.put(grammarAccess.getSlangTypedVarDefAccess().getGroup(), "rule__SlangTypedVarDef__Group__0");
			builder.put(grammarAccess.getSlangVarDefAccess().getGroup(), "rule__SlangVarDef__Group__0");
			builder.put(grammarAccess.getSlangVarDefAccess().getGroup_2(), "rule__SlangVarDef__Group_2__0");
			builder.put(grammarAccess.getSlangVarDeclDefAccess().getGroup(), "rule__SlangVarDeclDef__Group__0");
			builder.put(grammarAccess.getSlangVarDeclDefAccess().getGroup_5(), "rule__SlangVarDeclDef__Group_5__0");
			builder.put(grammarAccess.getExprAccess().getGroup_0(), "rule__Expr__Group_0__0");
			builder.put(grammarAccess.getExprAccess().getGroup_0_2_0(), "rule__Expr__Group_0_2_0__0");
			builder.put(grammarAccess.getExprAccess().getGroup_0_2_1(), "rule__Expr__Group_0_2_1__0");
			builder.put(grammarAccess.getExprAccess().getGroup_1(), "rule__Expr__Group_1__0");
			builder.put(grammarAccess.getExprAccess().getGroup_1_3(), "rule__Expr__Group_1_3__0");
			builder.put(grammarAccess.getExprAccess().getGroup_2(), "rule__Expr__Group_2__0");
			builder.put(grammarAccess.getSlangQuantVarAccess().getGroup(), "rule__SlangQuantVar__Group__0");
			builder.put(grammarAccess.getSlangQuantVarAccess().getGroup_3(), "rule__SlangQuantVar__Group_3__0");
			builder.put(grammarAccess.getSlangBlockAccess().getGroup(), "rule__SlangBlock__Group__0");
			builder.put(grammarAccess.getSlangAccessAccess().getGroup(), "rule__SlangAccess__Group__0");
			builder.put(grammarAccess.getSlangTermAccess().getGroup_0(), "rule__SlangTerm__Group_0__0");
			builder.put(grammarAccess.getSlangTermAccess().getGroup_1(), "rule__SlangTerm__Group_1__0");
			builder.put(grammarAccess.getSlangTermAccess().getGroup_2(), "rule__SlangTerm__Group_2__0");
			builder.put(grammarAccess.getSlangTermAccess().getGroup_2_0(), "rule__SlangTerm__Group_2_0__0");
			builder.put(grammarAccess.getSlangTermAccess().getGroup_2_0_0(), "rule__SlangTerm__Group_2_0_0__0");
			builder.put(grammarAccess.getSlangTermAccess().getGroup_3(), "rule__SlangTerm__Group_3__0");
			builder.put(grammarAccess.getSlangTermAccess().getGroup_3_0(), "rule__SlangTerm__Group_3_0__0");
			builder.put(grammarAccess.getSlangTermAccess().getGroup_3_0_0(), "rule__SlangTerm__Group_3_0_0__0");
			builder.put(grammarAccess.getSlangTermAccess().getGroup_4(), "rule__SlangTerm__Group_4__0");
			builder.put(grammarAccess.getSlangTermAccess().getGroup_4_0(), "rule__SlangTerm__Group_4_0__0");
			builder.put(grammarAccess.getSlangTermAccess().getGroup_4_0_0(), "rule__SlangTerm__Group_4_0_0__0");
			builder.put(grammarAccess.getSlangTermAccess().getGroup_4_2(), "rule__SlangTerm__Group_4_2__0");
			builder.put(grammarAccess.getSlangTermAccess().getGroup_5(), "rule__SlangTerm__Group_5__0");
			builder.put(grammarAccess.getSlangTermAccess().getGroup_5_2(), "rule__SlangTerm__Group_5_2__0");
			builder.put(grammarAccess.getSlangTermAccess().getGroup_6(), "rule__SlangTerm__Group_6__0");
			builder.put(grammarAccess.getSlangTermAccess().getGroup_6_3(), "rule__SlangTerm__Group_6_3__0");
			builder.put(grammarAccess.getSlangTermAccess().getGroup_7(), "rule__SlangTerm__Group_7__0");
			builder.put(grammarAccess.getSlangTermAccess().getGroup_7_3(), "rule__SlangTerm__Group_7_3__0");
			builder.put(grammarAccess.getSlangTermAccess().getGroup_7_5_1(), "rule__SlangTerm__Group_7_5_1__0");
			builder.put(grammarAccess.getSlangTermAccess().getGroup_8(), "rule__SlangTerm__Group_8__0");
			builder.put(grammarAccess.getSlangTermAccess().getGroup_8_2_0(), "rule__SlangTerm__Group_8_2_0__0");
			builder.put(grammarAccess.getSlangTermAccess().getGroup_8_2_0_0(), "rule__SlangTerm__Group_8_2_0_0__0");
			builder.put(grammarAccess.getSlangTermAccess().getGroup_8_2_1(), "rule__SlangTerm__Group_8_2_1__0");
			builder.put(grammarAccess.getSlangParamsAccess().getGroup(), "rule__SlangParams__Group__0");
			builder.put(grammarAccess.getSlangParamsAccess().getGroup_2(), "rule__SlangParams__Group_2__0");
			builder.put(grammarAccess.getSlangParamAccess().getGroup(), "rule__SlangParam__Group__0");
			builder.put(grammarAccess.getSlangForRangeAccess().getGroup(), "rule__SlangForRange__Group__0");
			builder.put(grammarAccess.getSlangForRangeAccess().getGroup_3(), "rule__SlangForRange__Group_3__0");
			builder.put(grammarAccess.getSlangForRangeAccess().getGroup_3_2(), "rule__SlangForRange__Group_3_2__0");
			builder.put(grammarAccess.getSlangRetAccess().getGroup(), "rule__SlangRet__Group__0");
			builder.put(grammarAccess.getSlangCallSuffixAccess().getGroup_0(), "rule__SlangCallSuffix__Group_0__0");
			builder.put(grammarAccess.getSlangCallArgsAccess().getGroup(), "rule__SlangCallArgs__Group__0");
			builder.put(grammarAccess.getSlangCallArgsAccess().getGroup_2(), "rule__SlangCallArgs__Group_2__0");
			builder.put(grammarAccess.getSlangCallArgsAccess().getGroup_2_1(), "rule__SlangCallArgs__Group_2_1__0");
			builder.put(grammarAccess.getSlangIDExpAccess().getGroup(), "rule__SlangIDExp__Group__0");
			builder.put(grammarAccess.getSlangIDExpAccess().getGroup_1(), "rule__SlangIDExp__Group_1__0");
			builder.put(grammarAccess.getSlangTypeArgsAccess().getGroup(), "rule__SlangTypeArgs__Group__0");
			builder.put(grammarAccess.getSlangTypeArgsAccess().getGroup_2(), "rule__SlangTypeArgs__Group_2__0");
			builder.put(grammarAccess.getSlangLitAccess().getGroup_0(), "rule__SlangLit__Group_0__0");
			builder.put(grammarAccess.getSlangLitAccess().getGroup_1(), "rule__SlangLit__Group_1__0");
			builder.put(grammarAccess.getSlangLitAccess().getGroup_2(), "rule__SlangLit__Group_2__0");
			builder.put(grammarAccess.getSlangLitAccess().getGroup_3(), "rule__SlangLit__Group_3__0");
			builder.put(grammarAccess.getSlangLitAccess().getGroup_4(), "rule__SlangLit__Group_4__0");
			builder.put(grammarAccess.getSlangLitAccess().getGroup_5(), "rule__SlangLit__Group_5__0");
			builder.put(grammarAccess.getSlangLitAccess().getGroup_6(), "rule__SlangLit__Group_6__0");
			builder.put(grammarAccess.getSlangLitAccess().getGroup_7(), "rule__SlangLit__Group_7__0");
			builder.put(grammarAccess.getSlangLitAccess().getGroup_8(), "rule__SlangLit__Group_8__0");
			builder.put(grammarAccess.getSlangInterpAccess().getGroup_0(), "rule__SlangInterp__Group_0__0");
			builder.put(grammarAccess.getSlangInterpAccess().getGroup_1(), "rule__SlangInterp__Group_1__0");
			builder.put(grammarAccess.getSlangInterpAccess().getGroup_2(), "rule__SlangInterp__Group_2__0");
			builder.put(grammarAccess.getSlangMInterpAccess().getGroup(), "rule__SlangMInterp__Group__0");
			builder.put(grammarAccess.getSlangMInterpAccess().getGroup_3_0(), "rule__SlangMInterp__Group_3_0__0");
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
			builder.put(grammarAccess.getInvSpecAccess().getDisplayNameAssignment_1(), "rule__InvSpec__DisplayNameAssignment_1");
			builder.put(grammarAccess.getInvSpecAccess().getExprAssignment_3(), "rule__InvSpec__ExprAssignment_3");
			builder.put(grammarAccess.getIntegrationAccess().getSpecsAssignment_1(), "rule__Integration__SpecsAssignment_1");
			builder.put(grammarAccess.getInitializeAccess().getModifiesAssignment_1(), "rule__Initialize__ModifiesAssignment_1");
			builder.put(grammarAccess.getInitializeAccess().getSpecsAssignment_2(), "rule__Initialize__SpecsAssignment_2");
			builder.put(grammarAccess.getInitializeSpecStatementAccess().getGuaranteeStatementAssignment(), "rule__InitializeSpecStatement__GuaranteeStatementAssignment");
			builder.put(grammarAccess.getComputeAccess().getModifiesAssignment_1(), "rule__Compute__ModifiesAssignment_1");
			builder.put(grammarAccess.getComputeAccess().getCasesAssignment_2(), "rule__Compute__CasesAssignment_2");
			builder.put(grammarAccess.getCaseStatementClauseAccess().getDisplayNameAssignment_1(), "rule__CaseStatementClause__DisplayNameAssignment_1");
			builder.put(grammarAccess.getCaseStatementClauseAccess().getAssumeStatementAssignment_3(), "rule__CaseStatementClause__AssumeStatementAssignment_3");
			builder.put(grammarAccess.getCaseStatementClauseAccess().getGuaranteeStatementAssignment_4(), "rule__CaseStatementClause__GuaranteeStatementAssignment_4");
			builder.put(grammarAccess.getAssumeStatementAccess().getDisplayNameAssignment_1(), "rule__AssumeStatement__DisplayNameAssignment_1");
			builder.put(grammarAccess.getAssumeStatementAccess().getExprAssignment_3(), "rule__AssumeStatement__ExprAssignment_3");
			builder.put(grammarAccess.getAnonAssumeStatementAccess().getExprAssignment_1(), "rule__AnonAssumeStatement__ExprAssignment_1");
			builder.put(grammarAccess.getGuaranteeStatementAccess().getDisplayNameAssignment_1(), "rule__GuaranteeStatement__DisplayNameAssignment_1");
			builder.put(grammarAccess.getGuaranteeStatementAccess().getExprAssignment_3(), "rule__GuaranteeStatement__ExprAssignment_3");
			builder.put(grammarAccess.getAnonGuaranteeStatementAccess().getExprAssignment_1(), "rule__AnonGuaranteeStatement__ExprAssignment_1");
			builder.put(grammarAccess.getOtherDataRefAccess().getNamedElementAssignment_0_0(), "rule__OtherDataRef__NamedElementAssignment_0_0");
			builder.put(grammarAccess.getOtherDataRefAccess().getArrayRangeAssignment_0_1(), "rule__OtherDataRef__ArrayRangeAssignment_0_1");
			builder.put(grammarAccess.getOtherDataRefAccess().getPathAssignment_1_1(), "rule__OtherDataRef__PathAssignment_1_1");
			builder.put(grammarAccess.getDoubleDotRefAccess().getElmAssignment(), "rule__DoubleDotRef__ElmAssignment");
			builder.put(grammarAccess.getDataElementAccess().getDataElementAssignment(), "rule__DataElement__DataElementAssignment");
			builder.put(grammarAccess.getSubcomponentElementAccess().getSubcomponentAssignment(), "rule__SubcomponentElement__SubcomponentAssignment");
			builder.put(grammarAccess.getFunctionsAccess().getSpecsAssignment_1(), "rule__Functions__SpecsAssignment_1");
			builder.put(grammarAccess.getSlangDefDeclDefAccess().getSdeAssignment_2(), "rule__SlangDefDeclDef__SdeAssignment_2");
			builder.put(grammarAccess.getSlangDefDeclDefAccess().getNameAssignment_3(), "rule__SlangDefDeclDef__NameAssignment_3");
			builder.put(grammarAccess.getSlangDefDeclDefAccess().getTypeParamsAssignment_4(), "rule__SlangDefDeclDef__TypeParamsAssignment_4");
			builder.put(grammarAccess.getSlangDefDeclDefAccess().getParamsAssignment_5(), "rule__SlangDefDeclDef__ParamsAssignment_5");
			builder.put(grammarAccess.getSlangDefDeclDefAccess().getTypeAssignment_7(), "rule__SlangDefDeclDef__TypeAssignment_7");
			builder.put(grammarAccess.getSlangDefDeclDefAccess().getCAssignment_8(), "rule__SlangDefDeclDef__CAssignment_8");
			builder.put(grammarAccess.getSlangDefDeclDefAccess().getEAssignment_9_1(), "rule__SlangDefDeclDef__EAssignment_9_1");
			builder.put(grammarAccess.getSlangDefDeclAccess().getSdeAssignment_2(), "rule__SlangDefDecl__SdeAssignment_2");
			builder.put(grammarAccess.getSlangDefDeclAccess().getNameAssignment_3(), "rule__SlangDefDecl__NameAssignment_3");
			builder.put(grammarAccess.getSlangDefDeclAccess().getTypeParamsAssignment_4(), "rule__SlangDefDecl__TypeParamsAssignment_4");
			builder.put(grammarAccess.getSlangDefDeclAccess().getParamsAssignment_5(), "rule__SlangDefDecl__ParamsAssignment_5");
			builder.put(grammarAccess.getSlangDefDeclAccess().getTypeAssignment_7(), "rule__SlangDefDecl__TypeAssignment_7");
			builder.put(grammarAccess.getSlangDefDeclAccess().getCAssignment_8(), "rule__SlangDefDecl__CAssignment_8");
			builder.put(grammarAccess.getSlangDefDefAccess().getSdeAssignment_2(), "rule__SlangDefDef__SdeAssignment_2");
			builder.put(grammarAccess.getSlangDefDefAccess().getNameAssignment_3(), "rule__SlangDefDef__NameAssignment_3");
			builder.put(grammarAccess.getSlangDefDefAccess().getTypeParamsAssignment_4(), "rule__SlangDefDef__TypeParamsAssignment_4");
			builder.put(grammarAccess.getSlangDefDefAccess().getParamsAssignment_5(), "rule__SlangDefDef__ParamsAssignment_5");
			builder.put(grammarAccess.getSlangDefDefAccess().getTypeAssignment_7(), "rule__SlangDefDef__TypeAssignment_7");
			builder.put(grammarAccess.getSlangDefDefAccess().getCAssignment_8(), "rule__SlangDefDef__CAssignment_8");
			builder.put(grammarAccess.getSlangDefDefAccess().getEAssignment_10(), "rule__SlangDefDef__EAssignment_10");
			builder.put(grammarAccess.getSlangDefExtAccess().getNameAssignment_1(), "rule__SlangDefExt__NameAssignment_1");
			builder.put(grammarAccess.getSlangDefExtAccess().getTypeNameAssignment_3(), "rule__SlangDefExt__TypeNameAssignment_3");
			builder.put(grammarAccess.getSlangDefParamsAccess().getParamsAssignment_1(), "rule__SlangDefParams__ParamsAssignment_1");
			builder.put(grammarAccess.getSlangDefParamsAccess().getParamsAssignment_2_1(), "rule__SlangDefParams__ParamsAssignment_2_1");
			builder.put(grammarAccess.getSlangDefParamAccess().getNameAssignment_0(), "rule__SlangDefParam__NameAssignment_0");
			builder.put(grammarAccess.getSlangDefParamAccess().getTypeNameAssignment_3(), "rule__SlangDefParam__TypeNameAssignment_3");
			builder.put(grammarAccess.getSlangDefContractAccess().getReaAssignment_2_0_0(), "rule__SlangDefContract__ReaAssignment_2_0_0");
			builder.put(grammarAccess.getSlangDefContractAccess().getReqAssignment_2_0_1(), "rule__SlangDefContract__ReqAssignment_2_0_1");
			builder.put(grammarAccess.getSlangDefContractAccess().getModAssignment_2_0_2(), "rule__SlangDefContract__ModAssignment_2_0_2");
			builder.put(grammarAccess.getSlangDefContractAccess().getEnsAssignment_2_0_3(), "rule__SlangDefContract__EnsAssignment_2_0_3");
			builder.put(grammarAccess.getSlangDefContractAccess().getContractsAssignment_2_1_0(), "rule__SlangDefContract__ContractsAssignment_2_1_0");
			builder.put(grammarAccess.getSlangDefContractAccess().getReaAssignment_2_1_1(), "rule__SlangDefContract__ReaAssignment_2_1_1");
			builder.put(grammarAccess.getSlangDefContractAccess().getModAssignment_2_1_2(), "rule__SlangDefContract__ModAssignment_2_1_2");
			builder.put(grammarAccess.getSlangDefContractCaseAccess().getReqAssignment_3(), "rule__SlangDefContractCase__ReqAssignment_3");
			builder.put(grammarAccess.getSlangDefContractCaseAccess().getEnsAssignment_4(), "rule__SlangDefContractCase__EnsAssignment_4");
			builder.put(grammarAccess.getSlangSuprsAccess().getSuperTypesAssignment_1(), "rule__SlangSuprs__SuperTypesAssignment_1");
			builder.put(grammarAccess.getSlangSuprsAccess().getSuperTypesAssignment_2_1(), "rule__SlangSuprs__SuperTypesAssignment_2_1");
			builder.put(grammarAccess.getSlangSuprAccess().getNameAssignment_0(), "rule__SlangSupr__NameAssignment_0");
			builder.put(grammarAccess.getSlangSuprAccess().getArgsAssignment_1(), "rule__SlangSupr__ArgsAssignment_1");
			builder.put(grammarAccess.getSlangExtAccess().getDeclAssignment_5(), "rule__SlangExt__DeclAssignment_5");
			builder.put(grammarAccess.getSlangInvariantAccess().getExprsAssignment_1(), "rule__SlangInvariant__ExprsAssignment_1");
			builder.put(grammarAccess.getSlangInvariantAccess().getExprsAssignment_2_1(), "rule__SlangInvariant__ExprsAssignment_2_1");
			builder.put(grammarAccess.getSlangReadsAccess().getExprsAssignment_1(), "rule__SlangReads__ExprsAssignment_1");
			builder.put(grammarAccess.getSlangReadsAccess().getExprsAssignment_2_1(), "rule__SlangReads__ExprsAssignment_2_1");
			builder.put(grammarAccess.getSlangRequiresAccess().getExprsAssignment_1(), "rule__SlangRequires__ExprsAssignment_1");
			builder.put(grammarAccess.getSlangRequiresAccess().getExprsAssignment_2_1(), "rule__SlangRequires__ExprsAssignment_2_1");
			builder.put(grammarAccess.getSlangModifiesAccess().getExprsAssignment_1(), "rule__SlangModifies__ExprsAssignment_1");
			builder.put(grammarAccess.getSlangModifiesAccess().getExprsAssignment_2_1(), "rule__SlangModifies__ExprsAssignment_2_1");
			builder.put(grammarAccess.getSlangEnsuresAccess().getExprsAssignment_1(), "rule__SlangEnsures__ExprsAssignment_1");
			builder.put(grammarAccess.getSlangEnsuresAccess().getExprsAssignment_2_1(), "rule__SlangEnsures__ExprsAssignment_2_1");
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
			builder.put(grammarAccess.getSlangStmtAccess().getPortOrSubcomponentOrStateVarAssignment_9_1(), "rule__SlangStmt__PortOrSubcomponentOrStateVarAssignment_9_1");
			builder.put(grammarAccess.getSlangStmtAccess().getEAssignment_9_2_1_1(), "rule__SlangStmt__EAssignment_9_2_1_1");
			builder.put(grammarAccess.getSlangElseAccess().getCondAssignment_1_0_1(), "rule__SlangElse__CondAssignment_1_0_1");
			builder.put(grammarAccess.getSlangElseAccess().getBAssignment_1_0_2(), "rule__SlangElse__BAssignment_1_0_2");
			builder.put(grammarAccess.getSlangElseAccess().getEAssignment_1_0_3(), "rule__SlangElse__EAssignment_1_0_3");
			builder.put(grammarAccess.getSlangLoopContractAccess().getInvAssignment_1(), "rule__SlangLoopContract__InvAssignment_1");
			builder.put(grammarAccess.getSlangLoopContractAccess().getModAssignment_2(), "rule__SlangLoopContract__ModAssignment_2");
			builder.put(grammarAccess.getSlangLHSSuffixAccess().getExprsAssignment_1_2_0(), "rule__SlangLHSSuffix__ExprsAssignment_1_2_0");
			builder.put(grammarAccess.getSlangLHSSuffixAccess().getExprsAssignment_1_2_1_1(), "rule__SlangLHSSuffix__ExprsAssignment_1_2_1_1");
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
			builder.put(grammarAccess.getSlangTypedVarDefAccess().getTypeNameAssignment_3(), "rule__SlangTypedVarDef__TypeNameAssignment_3");
			builder.put(grammarAccess.getSlangTypedVarDefAccess().getInitAssignment_5(), "rule__SlangTypedVarDef__InitAssignment_5");
			builder.put(grammarAccess.getSlangVarDefAccess().getTypeNameAssignment_2_1(), "rule__SlangVarDef__TypeNameAssignment_2_1");
			builder.put(grammarAccess.getSlangVarDefAccess().getInitAssignment_4(), "rule__SlangVarDef__InitAssignment_4");
			builder.put(grammarAccess.getSlangVarDeclDefAccess().getNameAssignment_2(), "rule__SlangVarDeclDef__NameAssignment_2");
			builder.put(grammarAccess.getSlangVarDeclDefAccess().getTypeNameAssignment_4(), "rule__SlangVarDeclDef__TypeNameAssignment_4");
			builder.put(grammarAccess.getSlangVarDeclDefAccess().getInitAssignment_5_1(), "rule__SlangVarDeclDef__InitAssignment_5_1");
			builder.put(grammarAccess.getExprAccess().getTermsAssignment_0_1(), "rule__Expr__TermsAssignment_0_1");
			builder.put(grammarAccess.getExprAccess().getOpsAssignment_0_2_0_0(), "rule__Expr__OpsAssignment_0_2_0_0");
			builder.put(grammarAccess.getExprAccess().getTermsAssignment_0_2_0_1(), "rule__Expr__TermsAssignment_0_2_0_1");
			builder.put(grammarAccess.getExprAccess().getThenExprAssignment_0_2_1_1(), "rule__Expr__ThenExprAssignment_0_2_1_1");
			builder.put(grammarAccess.getExprAccess().getElseExprAssignment_0_2_1_3(), "rule__Expr__ElseExprAssignment_0_2_1_3");
			builder.put(grammarAccess.getExprAccess().getQVarAssignment_1_2(), "rule__Expr__QVarAssignment_1_2");
			builder.put(grammarAccess.getExprAccess().getQVarAssignment_1_3_1(), "rule__Expr__QVarAssignment_1_3_1");
			builder.put(grammarAccess.getExprAccess().getQuantifiedExprAssignment_1_5(), "rule__Expr__QuantifiedExprAssignment_1_5");
			builder.put(grammarAccess.getExprAccess().getOpAssignment_2_1(), "rule__Expr__OpAssignment_2_1");
			builder.put(grammarAccess.getExprAccess().getAccessExpAssignment_2_2(), "rule__Expr__AccessExpAssignment_2_2");
			builder.put(grammarAccess.getSlangQuantVarAccess().getEAssignment_2(), "rule__SlangQuantVar__EAssignment_2");
			builder.put(grammarAccess.getSlangQuantVarAccess().getUpperBoundAssignment_3_1(), "rule__SlangQuantVar__UpperBoundAssignment_3_1");
			builder.put(grammarAccess.getSlangBlockAccess().getStmtsAssignment_2(), "rule__SlangBlock__StmtsAssignment_2");
			builder.put(grammarAccess.getSlangBlockAccess().getRAssignment_3(), "rule__SlangBlock__RAssignment_3");
			builder.put(grammarAccess.getSlangAccessAccess().getTAssignment_1(), "rule__SlangAccess__TAssignment_1");
			builder.put(grammarAccess.getSlangTermAccess().getLitAssignment_0_1(), "rule__SlangTerm__LitAssignment_0_1");
			builder.put(grammarAccess.getSlangTermAccess().getIAssignment_1_1(), "rule__SlangTerm__IAssignment_1_1");
			builder.put(grammarAccess.getSlangTermAccess().getStateVarAssignment_2_1(), "rule__SlangTerm__StateVarAssignment_2_1");
			builder.put(grammarAccess.getSlangTermAccess().getEnumTypeAssignment_3_1(), "rule__SlangTerm__EnumTypeAssignment_3_1");
			builder.put(grammarAccess.getSlangTermAccess().getValueAssignment_3_3(), "rule__SlangTerm__ValueAssignment_3_3");
			builder.put(grammarAccess.getSlangTermAccess().getRecordTypeAssignment_4_0_0_1(), "rule__SlangTerm__RecordTypeAssignment_4_0_0_1");
			builder.put(grammarAccess.getSlangTermAccess().getArgsAssignment_4_0_0_3(), "rule__SlangTerm__ArgsAssignment_4_0_0_3");
			builder.put(grammarAccess.getSlangTermAccess().getArgExprAssignment_4_1(), "rule__SlangTerm__ArgExprAssignment_4_1");
			builder.put(grammarAccess.getSlangTermAccess().getArgsAssignment_4_2_1(), "rule__SlangTerm__ArgsAssignment_4_2_1");
			builder.put(grammarAccess.getSlangTermAccess().getArgExprAssignment_4_2_3(), "rule__SlangTerm__ArgExprAssignment_4_2_3");
			builder.put(grammarAccess.getSlangTermAccess().getPortOrSubcomponentOrStateVarAssignment_5_1(), "rule__SlangTerm__PortOrSubcomponentOrStateVarAssignment_5_1");
			builder.put(grammarAccess.getSlangTermAccess().getRefAssignment_5_2_1(), "rule__SlangTerm__RefAssignment_5_2_1");
			builder.put(grammarAccess.getSlangTermAccess().getCsAssignment_5_3(), "rule__SlangTerm__CsAssignment_5_3");
			builder.put(grammarAccess.getSlangTermAccess().getEAssignment_6_2(), "rule__SlangTerm__EAssignment_6_2");
			builder.put(grammarAccess.getSlangTermAccess().getEAssignment_6_3_1(), "rule__SlangTerm__EAssignment_6_3_1");
			builder.put(grammarAccess.getSlangTermAccess().getRAssignment_7_2(), "rule__SlangTerm__RAssignment_7_2");
			builder.put(grammarAccess.getSlangTermAccess().getRAssignment_7_3_1(), "rule__SlangTerm__RAssignment_7_3_1");
			builder.put(grammarAccess.getSlangTermAccess().getBAssignment_7_5_0(), "rule__SlangTerm__BAssignment_7_5_0");
			builder.put(grammarAccess.getSlangTermAccess().getEAssignment_7_5_1_1(), "rule__SlangTerm__EAssignment_7_5_1_1");
			builder.put(grammarAccess.getSlangTermAccess().getPAssignment_8_2_0_0_0(), "rule__SlangTerm__PAssignment_8_2_0_0_0");
			builder.put(grammarAccess.getSlangTermAccess().getEAssignment_8_2_0_1(), "rule__SlangTerm__EAssignment_8_2_0_1");
			builder.put(grammarAccess.getSlangTermAccess().getStmtAssignment_8_2_1_0(), "rule__SlangTerm__StmtAssignment_8_2_1_0");
			builder.put(grammarAccess.getSlangTermAccess().getRAssignment_8_2_1_1(), "rule__SlangTerm__RAssignment_8_2_1_1");
			builder.put(grammarAccess.getSlangParamsAccess().getParamsAssignment_1(), "rule__SlangParams__ParamsAssignment_1");
			builder.put(grammarAccess.getSlangParamsAccess().getParamsAssignment_2_1(), "rule__SlangParams__ParamsAssignment_2_1");
			builder.put(grammarAccess.getSlangParamAccess().getNameAssignment_1(), "rule__SlangParam__NameAssignment_1");
			builder.put(grammarAccess.getSlangParamAccess().getTypeNameAssignment_4(), "rule__SlangParam__TypeNameAssignment_4");
			builder.put(grammarAccess.getSlangForRangeAccess().getEAssignment_2(), "rule__SlangForRange__EAssignment_2");
			builder.put(grammarAccess.getSlangForRangeAccess().getUpperAssignment_3_1(), "rule__SlangForRange__UpperAssignment_3_1");
			builder.put(grammarAccess.getSlangForRangeAccess().getStepAssignment_3_2_1(), "rule__SlangForRange__StepAssignment_3_2_1");
			builder.put(grammarAccess.getSlangRetAccess().getEAssignment_2(), "rule__SlangRet__EAssignment_2");
			builder.put(grammarAccess.getSlangCallSuffixAccess().getTaAssignment_0_1(), "rule__SlangCallSuffix__TaAssignment_0_1");
			builder.put(grammarAccess.getSlangCallSuffixAccess().getCaAssignment_0_2(), "rule__SlangCallSuffix__CaAssignment_0_2");
			builder.put(grammarAccess.getSlangCallSuffixAccess().getCaAssignment_1(), "rule__SlangCallSuffix__CaAssignment_1");
			builder.put(grammarAccess.getSlangCallArgsAccess().getArgAssignment_2_0(), "rule__SlangCallArgs__ArgAssignment_2_0");
			builder.put(grammarAccess.getSlangCallArgsAccess().getArgAssignment_2_1_1(), "rule__SlangCallArgs__ArgAssignment_2_1_1");
			builder.put(grammarAccess.getSlangIDExpAccess().getEAssignment_0(), "rule__SlangIDExp__EAssignment_0");
			builder.put(grammarAccess.getSlangIDExpAccess().getEAssignment_1_1(), "rule__SlangIDExp__EAssignment_1_1");
			builder.put(grammarAccess.getSlangBaseTypeAccess().getTypeNameAssignment(), "rule__SlangBaseType__TypeNameAssignment");
			builder.put(grammarAccess.getSlangTypeArgsAccess().getTypesAssignment_1(), "rule__SlangTypeArgs__TypesAssignment_1");
			builder.put(grammarAccess.getSlangTypeArgsAccess().getTypesAssignment_2_1(), "rule__SlangTypeArgs__TypesAssignment_2_1");
			builder.put(grammarAccess.getSlangLitAccess().getValueAssignment_0_1(), "rule__SlangLit__ValueAssignment_0_1");
			builder.put(grammarAccess.getSlangLitAccess().getValueAssignment_1_1(), "rule__SlangLit__ValueAssignment_1_1");
			builder.put(grammarAccess.getSlangLitAccess().getValueAssignment_2_1(), "rule__SlangLit__ValueAssignment_2_1");
			builder.put(grammarAccess.getSlangLitAccess().getValueAssignment_3_1(), "rule__SlangLit__ValueAssignment_3_1");
			builder.put(grammarAccess.getSlangLitAccess().getValueAssignment_4_1(), "rule__SlangLit__ValueAssignment_4_1");
			builder.put(grammarAccess.getSlangLitAccess().getValueAssignment_5_1(), "rule__SlangLit__ValueAssignment_5_1");
			builder.put(grammarAccess.getSlangLitAccess().getValueAssignment_6_1(), "rule__SlangLit__ValueAssignment_6_1");
			builder.put(grammarAccess.getSlangLitAccess().getValueAssignment_7_1(), "rule__SlangLit__ValueAssignment_7_1");
			builder.put(grammarAccess.getSlangLitAccess().getValueAssignment_8_1(), "rule__SlangLit__ValueAssignment_8_1");
			builder.put(grammarAccess.getSlangInterpAccess().getMspAssignment_0_1(), "rule__SlangInterp__MspAssignment_0_1");
			builder.put(grammarAccess.getSlangInterpAccess().getSliAssignment_1_1(), "rule__SlangInterp__SliAssignment_1_1");
			builder.put(grammarAccess.getSlangInterpAccess().getMspbAssignment_2_1(), "rule__SlangInterp__MspbAssignment_2_1");
			builder.put(grammarAccess.getSlangInterpAccess().getMinterpAssignment_2_2(), "rule__SlangInterp__MinterpAssignment_2_2");
			builder.put(grammarAccess.getSlangMInterpAccess().getEAssignment_1(), "rule__SlangMInterp__EAssignment_1");
			builder.put(grammarAccess.getSlangMInterpAccess().getMAssignment_3_0_1(), "rule__SlangMInterp__MAssignment_3_0_1");
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
