
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
			builder.put(grammarAccess.getImpliesExprAccess().getAlternatives_1_0_0_1(), "rule__ImpliesExpr__Alternatives_1_0_0_1");
			builder.put(grammarAccess.getOrExprAccess().getAlternatives_1_0_0_1(), "rule__OrExpr__Alternatives_1_0_0_1");
			builder.put(grammarAccess.getAndExprAccess().getAlternatives_1_0_0_1(), "rule__AndExpr__Alternatives_1_0_0_1");
			builder.put(grammarAccess.getRelationalOpAccess().getAlternatives(), "rule__RelationalOp__Alternatives");
			builder.put(grammarAccess.getAddSubExprAccess().getOpAlternatives_1_0_0_1_0(), "rule__AddSubExpr__OpAlternatives_1_0_0_1_0");
			builder.put(grammarAccess.getMultDivModExprAccess().getOpAlternatives_1_0_0_1_0(), "rule__MultDivModExpr__OpAlternatives_1_0_0_1_0");
			builder.put(grammarAccess.getPrefixExprAccess().getAlternatives(), "rule__PrefixExpr__Alternatives");
			builder.put(grammarAccess.getPrefixExprAccess().getOpAlternatives_0_1_0(), "rule__PrefixExpr__OpAlternatives_0_1_0");
			builder.put(grammarAccess.getAtomicExprAccess().getAlternatives(), "rule__AtomicExpr__Alternatives");
			builder.put(grammarAccess.getSlangExprAccess().getAlternatives(), "rule__SlangExpr__Alternatives");
			builder.put(grammarAccess.getSlangExprAccess().getAlternatives_0_1(), "rule__SlangExpr__Alternatives_0_1");
			builder.put(grammarAccess.getSlangExprAccess().getAlternatives_1_0(), "rule__SlangExpr__Alternatives_1_0");
			builder.put(grammarAccess.getSlangQuantVarAccess().getAlternatives_3_0(), "rule__SlangQuantVar__Alternatives_3_0");
			builder.put(grammarAccess.getSlangTermAccess().getAlternatives(), "rule__SlangTerm__Alternatives");
			builder.put(grammarAccess.getCallSuffixAccess().getAlternatives(), "rule__CallSuffix__Alternatives");
			builder.put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
			builder.put(grammarAccess.getBaseTypeAccess().getAlternatives(), "rule__BaseType__Alternatives");
			builder.put(grammarAccess.getDefModsAccess().getAlternatives(), "rule__DefMods__Alternatives");
			builder.put(grammarAccess.getDefIDAccess().getAlternatives(), "rule__DefID__Alternatives");
			builder.put(grammarAccess.getDefContractAccess().getAlternatives_2(), "rule__DefContract__Alternatives_2");
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
			builder.put(grammarAccess.getImpliesExprAccess().getGroup(), "rule__ImpliesExpr__Group__0");
			builder.put(grammarAccess.getImpliesExprAccess().getGroup_1(), "rule__ImpliesExpr__Group_1__0");
			builder.put(grammarAccess.getImpliesExprAccess().getGroup_1_0(), "rule__ImpliesExpr__Group_1_0__0");
			builder.put(grammarAccess.getImpliesExprAccess().getGroup_1_0_0(), "rule__ImpliesExpr__Group_1_0_0__0");
			builder.put(grammarAccess.getEquivExprAccess().getGroup(), "rule__EquivExpr__Group__0");
			builder.put(grammarAccess.getEquivExprAccess().getGroup_1(), "rule__EquivExpr__Group_1__0");
			builder.put(grammarAccess.getEquivExprAccess().getGroup_1_0(), "rule__EquivExpr__Group_1_0__0");
			builder.put(grammarAccess.getEquivExprAccess().getGroup_1_0_0(), "rule__EquivExpr__Group_1_0_0__0");
			builder.put(grammarAccess.getOrExprAccess().getGroup(), "rule__OrExpr__Group__0");
			builder.put(grammarAccess.getOrExprAccess().getGroup_1(), "rule__OrExpr__Group_1__0");
			builder.put(grammarAccess.getOrExprAccess().getGroup_1_0(), "rule__OrExpr__Group_1_0__0");
			builder.put(grammarAccess.getOrExprAccess().getGroup_1_0_0(), "rule__OrExpr__Group_1_0_0__0");
			builder.put(grammarAccess.getAndExprAccess().getGroup(), "rule__AndExpr__Group__0");
			builder.put(grammarAccess.getAndExprAccess().getGroup_1(), "rule__AndExpr__Group_1__0");
			builder.put(grammarAccess.getAndExprAccess().getGroup_1_0(), "rule__AndExpr__Group_1_0__0");
			builder.put(grammarAccess.getAndExprAccess().getGroup_1_0_0(), "rule__AndExpr__Group_1_0_0__0");
			builder.put(grammarAccess.getRelationalExprAccess().getGroup(), "rule__RelationalExpr__Group__0");
			builder.put(grammarAccess.getRelationalExprAccess().getGroup_1(), "rule__RelationalExpr__Group_1__0");
			builder.put(grammarAccess.getRelationalExprAccess().getGroup_1_0(), "rule__RelationalExpr__Group_1_0__0");
			builder.put(grammarAccess.getRelationalExprAccess().getGroup_1_0_0(), "rule__RelationalExpr__Group_1_0_0__0");
			builder.put(grammarAccess.getAddSubExprAccess().getGroup(), "rule__AddSubExpr__Group__0");
			builder.put(grammarAccess.getAddSubExprAccess().getGroup_1(), "rule__AddSubExpr__Group_1__0");
			builder.put(grammarAccess.getAddSubExprAccess().getGroup_1_0(), "rule__AddSubExpr__Group_1_0__0");
			builder.put(grammarAccess.getAddSubExprAccess().getGroup_1_0_0(), "rule__AddSubExpr__Group_1_0_0__0");
			builder.put(grammarAccess.getMultDivModExprAccess().getGroup(), "rule__MultDivModExpr__Group__0");
			builder.put(grammarAccess.getMultDivModExprAccess().getGroup_1(), "rule__MultDivModExpr__Group_1__0");
			builder.put(grammarAccess.getMultDivModExprAccess().getGroup_1_0(), "rule__MultDivModExpr__Group_1_0__0");
			builder.put(grammarAccess.getMultDivModExprAccess().getGroup_1_0_0(), "rule__MultDivModExpr__Group_1_0_0__0");
			builder.put(grammarAccess.getExpExprAccess().getGroup(), "rule__ExpExpr__Group__0");
			builder.put(grammarAccess.getExpExprAccess().getGroup_1(), "rule__ExpExpr__Group_1__0");
			builder.put(grammarAccess.getExpExprAccess().getGroup_1_0(), "rule__ExpExpr__Group_1_0__0");
			builder.put(grammarAccess.getExpExprAccess().getGroup_1_0_0(), "rule__ExpExpr__Group_1_0_0__0");
			builder.put(grammarAccess.getPrefixExprAccess().getGroup_0(), "rule__PrefixExpr__Group_0__0");
			builder.put(grammarAccess.getAtomicExprAccess().getGroup_0(), "rule__AtomicExpr__Group_0__0");
			builder.put(grammarAccess.getAtomicExprAccess().getGroup_0_2(), "rule__AtomicExpr__Group_0_2__0");
			builder.put(grammarAccess.getAtomicExprAccess().getGroup_1(), "rule__AtomicExpr__Group_1__0");
			builder.put(grammarAccess.getAtomicExprAccess().getGroup_1_0(), "rule__AtomicExpr__Group_1_0__0");
			builder.put(grammarAccess.getAtomicExprAccess().getGroup_1_0_0(), "rule__AtomicExpr__Group_1_0_0__0");
			builder.put(grammarAccess.getAtomicExprAccess().getGroup_2(), "rule__AtomicExpr__Group_2__0");
			builder.put(grammarAccess.getAtomicExprAccess().getGroup_2_0(), "rule__AtomicExpr__Group_2_0__0");
			builder.put(grammarAccess.getAtomicExprAccess().getGroup_2_0_0(), "rule__AtomicExpr__Group_2_0_0__0");
			builder.put(grammarAccess.getAtomicExprAccess().getGroup_2_2(), "rule__AtomicExpr__Group_2_2__0");
			builder.put(grammarAccess.getAtomicExprAccess().getGroup_3(), "rule__AtomicExpr__Group_3__0");
			builder.put(grammarAccess.getAtomicExprAccess().getGroup_4(), "rule__AtomicExpr__Group_4__0");
			builder.put(grammarAccess.getAtomicExprAccess().getGroup_5(), "rule__AtomicExpr__Group_5__0");
			builder.put(grammarAccess.getAtomicExprAccess().getGroup_6(), "rule__AtomicExpr__Group_6__0");
			builder.put(grammarAccess.getAtomicExprAccess().getGroup_7(), "rule__AtomicExpr__Group_7__0");
			builder.put(grammarAccess.getAtomicExprAccess().getGroup_8(), "rule__AtomicExpr__Group_8__0");
			builder.put(grammarAccess.getOtherDataRefAccess().getGroup(), "rule__OtherDataRef__Group__0");
			builder.put(grammarAccess.getOtherDataRefAccess().getGroup_1(), "rule__OtherDataRef__Group_1__0");
			builder.put(grammarAccess.getSlangExprAccess().getGroup_0(), "rule__SlangExpr__Group_0__0");
			builder.put(grammarAccess.getSlangExprAccess().getGroup_0_1_0(), "rule__SlangExpr__Group_0_1_0__0");
			builder.put(grammarAccess.getSlangExprAccess().getGroup_0_1_1(), "rule__SlangExpr__Group_0_1_1__0");
			builder.put(grammarAccess.getSlangExprAccess().getGroup_1(), "rule__SlangExpr__Group_1__0");
			builder.put(grammarAccess.getSlangExprAccess().getGroup_1_2(), "rule__SlangExpr__Group_1_2__0");
			builder.put(grammarAccess.getSlangExprAccess().getGroup_2(), "rule__SlangExpr__Group_2__0");
			builder.put(grammarAccess.getSlangQuantVarAccess().getGroup(), "rule__SlangQuantVar__Group__0");
			builder.put(grammarAccess.getSlangQuantVarAccess().getGroup_3(), "rule__SlangQuantVar__Group_3__0");
			builder.put(grammarAccess.getSlangAccessAccess().getGroup(), "rule__SlangAccess__Group__0");
			builder.put(grammarAccess.getAccessSuffixAccess().getGroup(), "rule__AccessSuffix__Group__0");
			builder.put(grammarAccess.getSlangTermAccess().getGroup_1(), "rule__SlangTerm__Group_1__0");
			builder.put(grammarAccess.getSlangTermAccess().getGroup_1_2(), "rule__SlangTerm__Group_1_2__0");
			builder.put(grammarAccess.getSlangRetAccess().getGroup(), "rule__SlangRet__Group__0");
			builder.put(grammarAccess.getCallSuffixAccess().getGroup_0(), "rule__CallSuffix__Group_0__0");
			builder.put(grammarAccess.getCallArgsAccess().getGroup(), "rule__CallArgs__Group__0");
			builder.put(grammarAccess.getCallArgsAccess().getGroup_1(), "rule__CallArgs__Group_1__0");
			builder.put(grammarAccess.getCallArgsAccess().getGroup_1_1(), "rule__CallArgs__Group_1_1__0");
			builder.put(grammarAccess.getIdExpAccess().getGroup(), "rule__IdExp__Group__0");
			builder.put(grammarAccess.getIdExpAccess().getGroup_1(), "rule__IdExp__Group_1__0");
			builder.put(grammarAccess.getTypeAccess().getGroup_0(), "rule__Type__Group_0__0");
			builder.put(grammarAccess.getTypeAccess().getGroup_0_1(), "rule__Type__Group_0_1__0");
			builder.put(grammarAccess.getTypeAccess().getGroup_1(), "rule__Type__Group_1__0");
			builder.put(grammarAccess.getTypeAccess().getGroup_1_2(), "rule__Type__Group_1_2__0");
			builder.put(grammarAccess.getBaseTypeAccess().getGroup_0(), "rule__BaseType__Group_0__0");
			builder.put(grammarAccess.getBaseTypeAccess().getGroup_1(), "rule__BaseType__Group_1__0");
			builder.put(grammarAccess.getBaseTypeAccess().getGroup_1_1(), "rule__BaseType__Group_1_1__0");
			builder.put(grammarAccess.getBaseTypeAccess().getGroup_1_1_1(), "rule__BaseType__Group_1_1_1__0");
			builder.put(grammarAccess.getTypeArgsAccess().getGroup(), "rule__TypeArgs__Group__0");
			builder.put(grammarAccess.getTypeArgsAccess().getGroup_2(), "rule__TypeArgs__Group_2__0");
			builder.put(grammarAccess.getFunctionsAccess().getGroup(), "rule__Functions__Group__0");
			builder.put(grammarAccess.getFuncSpecAccess().getGroup(), "rule__FuncSpec__Group__0");
			builder.put(grammarAccess.getParamsAccess().getGroup(), "rule__Params__Group__0");
			builder.put(grammarAccess.getParamsAccess().getGroup_2(), "rule__Params__Group_2__0");
			builder.put(grammarAccess.getParamAccess().getGroup(), "rule__Param__Group__0");
			builder.put(grammarAccess.getDefDefAccess().getGroup(), "rule__DefDef__Group__0");
			builder.put(grammarAccess.getDefExtAccess().getGroup(), "rule__DefExt__Group__0");
			builder.put(grammarAccess.getDefParamsAccess().getGroup(), "rule__DefParams__Group__0");
			builder.put(grammarAccess.getDefParamsAccess().getGroup_2(), "rule__DefParams__Group_2__0");
			builder.put(grammarAccess.getDefParamAccess().getGroup(), "rule__DefParam__Group__0");
			builder.put(grammarAccess.getDefContractAccess().getGroup(), "rule__DefContract__Group__0");
			builder.put(grammarAccess.getDefContractAccess().getGroup_2_0(), "rule__DefContract__Group_2_0__0");
			builder.put(grammarAccess.getDefContractAccess().getGroup_2_1(), "rule__DefContract__Group_2_1__0");
			builder.put(grammarAccess.getDefContractCaseAccess().getGroup(), "rule__DefContractCase__Group__0");
			builder.put(grammarAccess.getTypeParamsAccess().getGroup(), "rule__TypeParams__Group__0");
			builder.put(grammarAccess.getTypeParamsAccess().getGroup_2(), "rule__TypeParams__Group_2__0");
			builder.put(grammarAccess.getTypeParamAccess().getGroup(), "rule__TypeParam__Group__0");
			builder.put(grammarAccess.getReadsAccess().getGroup(), "rule__Reads__Group__0");
			builder.put(grammarAccess.getReadsAccess().getGroup_2(), "rule__Reads__Group_2__0");
			builder.put(grammarAccess.getRequiresAccess().getGroup(), "rule__Requires__Group__0");
			builder.put(grammarAccess.getRequiresAccess().getGroup_2(), "rule__Requires__Group_2__0");
			builder.put(grammarAccess.getModifiesAccess().getGroup(), "rule__Modifies__Group__0");
			builder.put(grammarAccess.getModifiesAccess().getGroup_2(), "rule__Modifies__Group_2__0");
			builder.put(grammarAccess.getEnsuresAccess().getGroup(), "rule__Ensures__Group__0");
			builder.put(grammarAccess.getEnsuresAccess().getGroup_2(), "rule__Ensures__Group_2__0");
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
			builder.put(grammarAccess.getSpecSectionAccess().getStateAssignment_0(), "rule__SpecSection__StateAssignment_0");
			builder.put(grammarAccess.getSpecSectionAccess().getFunctionsAssignment_1(), "rule__SpecSection__FunctionsAssignment_1");
			builder.put(grammarAccess.getSpecSectionAccess().getInvariantsAssignment_2(), "rule__SpecSection__InvariantsAssignment_2");
			builder.put(grammarAccess.getSpecSectionAccess().getIntegrationAssignment_3(), "rule__SpecSection__IntegrationAssignment_3");
			builder.put(grammarAccess.getSpecSectionAccess().getInitializeAssignment_4(), "rule__SpecSection__InitializeAssignment_4");
			builder.put(grammarAccess.getSpecSectionAccess().getComputeAssignment_5(), "rule__SpecSection__ComputeAssignment_5");
			builder.put(grammarAccess.getStateAccess().getDeclsAssignment_1(), "rule__State__DeclsAssignment_1");
			builder.put(grammarAccess.getStateVarDeclAccess().getNameAssignment_0_0(), "rule__StateVarDecl__NameAssignment_0_0");
			builder.put(grammarAccess.getStateVarDeclAccess().getTypeNameAssignment_1(), "rule__StateVarDecl__TypeNameAssignment_1");
			builder.put(grammarAccess.getInvariantsAccess().getSpecsAssignment_1(), "rule__Invariants__SpecsAssignment_1");
			builder.put(grammarAccess.getInvSpecAccess().getDisplayNameAssignment_1(), "rule__InvSpec__DisplayNameAssignment_1");
			builder.put(grammarAccess.getInvSpecAccess().getExprAssignment_3(), "rule__InvSpec__ExprAssignment_3");
			builder.put(grammarAccess.getIntegrationAccess().getSpecsAssignment_1(), "rule__Integration__SpecsAssignment_1");
			builder.put(grammarAccess.getInitializeAccess().getSpecsAssignment_1(), "rule__Initialize__SpecsAssignment_1");
			builder.put(grammarAccess.getComputeAccess().getCasesAssignment_1(), "rule__Compute__CasesAssignment_1");
			builder.put(grammarAccess.getCaseStatementClauseAccess().getDisplayNameAssignment_1(), "rule__CaseStatementClause__DisplayNameAssignment_1");
			builder.put(grammarAccess.getCaseStatementClauseAccess().getAssumeStatementAssignment_3(), "rule__CaseStatementClause__AssumeStatementAssignment_3");
			builder.put(grammarAccess.getCaseStatementClauseAccess().getGuaranteeStatementAssignment_4(), "rule__CaseStatementClause__GuaranteeStatementAssignment_4");
			builder.put(grammarAccess.getAssumeStatementAccess().getDisplayNameAssignment_1(), "rule__AssumeStatement__DisplayNameAssignment_1");
			builder.put(grammarAccess.getAssumeStatementAccess().getExprAssignment_3(), "rule__AssumeStatement__ExprAssignment_3");
			builder.put(grammarAccess.getAnonAssumeStatementAccess().getExprAssignment_1(), "rule__AnonAssumeStatement__ExprAssignment_1");
			builder.put(grammarAccess.getGuaranteeStatementAccess().getDisplayNameAssignment_1(), "rule__GuaranteeStatement__DisplayNameAssignment_1");
			builder.put(grammarAccess.getGuaranteeStatementAccess().getExprAssignment_3(), "rule__GuaranteeStatement__ExprAssignment_3");
			builder.put(grammarAccess.getAnonGuaranteeStatementAccess().getExprAssignment_1(), "rule__AnonGuaranteeStatement__ExprAssignment_1");
			builder.put(grammarAccess.getImpliesExprAccess().getRightAssignment_1_1(), "rule__ImpliesExpr__RightAssignment_1_1");
			builder.put(grammarAccess.getEquivExprAccess().getOpAssignment_1_0_0_1(), "rule__EquivExpr__OpAssignment_1_0_0_1");
			builder.put(grammarAccess.getEquivExprAccess().getRightAssignment_1_1(), "rule__EquivExpr__RightAssignment_1_1");
			builder.put(grammarAccess.getOrExprAccess().getOpAssignment_1_0_0_1_0(), "rule__OrExpr__OpAssignment_1_0_0_1_0");
			builder.put(grammarAccess.getOrExprAccess().getOpAssignment_1_0_0_1_1(), "rule__OrExpr__OpAssignment_1_0_0_1_1");
			builder.put(grammarAccess.getOrExprAccess().getRightAssignment_1_1(), "rule__OrExpr__RightAssignment_1_1");
			builder.put(grammarAccess.getAndExprAccess().getOpAssignment_1_0_0_1_0(), "rule__AndExpr__OpAssignment_1_0_0_1_0");
			builder.put(grammarAccess.getAndExprAccess().getOpAssignment_1_0_0_1_1(), "rule__AndExpr__OpAssignment_1_0_0_1_1");
			builder.put(grammarAccess.getAndExprAccess().getRightAssignment_1_1(), "rule__AndExpr__RightAssignment_1_1");
			builder.put(grammarAccess.getRelationalExprAccess().getOpAssignment_1_0_0_1(), "rule__RelationalExpr__OpAssignment_1_0_0_1");
			builder.put(grammarAccess.getRelationalExprAccess().getRightAssignment_1_1(), "rule__RelationalExpr__RightAssignment_1_1");
			builder.put(grammarAccess.getAddSubExprAccess().getOpAssignment_1_0_0_1(), "rule__AddSubExpr__OpAssignment_1_0_0_1");
			builder.put(grammarAccess.getAddSubExprAccess().getRightAssignment_1_1(), "rule__AddSubExpr__RightAssignment_1_1");
			builder.put(grammarAccess.getMultDivModExprAccess().getOpAssignment_1_0_0_1(), "rule__MultDivModExpr__OpAssignment_1_0_0_1");
			builder.put(grammarAccess.getMultDivModExprAccess().getRightAssignment_1_1(), "rule__MultDivModExpr__RightAssignment_1_1");
			builder.put(grammarAccess.getExpExprAccess().getOpAssignment_1_0_0_1(), "rule__ExpExpr__OpAssignment_1_0_0_1");
			builder.put(grammarAccess.getExpExprAccess().getRightAssignment_1_1(), "rule__ExpExpr__RightAssignment_1_1");
			builder.put(grammarAccess.getPrefixExprAccess().getOpAssignment_0_1(), "rule__PrefixExpr__OpAssignment_0_1");
			builder.put(grammarAccess.getPrefixExprAccess().getExprAssignment_0_2(), "rule__PrefixExpr__ExprAssignment_0_2");
			builder.put(grammarAccess.getAtomicExprAccess().getPortOrSubcomponentOrStateVarAssignment_0_1(), "rule__AtomicExpr__PortOrSubcomponentOrStateVarAssignment_0_1");
			builder.put(grammarAccess.getAtomicExprAccess().getRefAssignment_0_2_1(), "rule__AtomicExpr__RefAssignment_0_2_1");
			builder.put(grammarAccess.getAtomicExprAccess().getCsAssignment_0_3(), "rule__AtomicExpr__CsAssignment_0_3");
			builder.put(grammarAccess.getAtomicExprAccess().getEnumTypeAssignment_1_1(), "rule__AtomicExpr__EnumTypeAssignment_1_1");
			builder.put(grammarAccess.getAtomicExprAccess().getValueAssignment_1_3(), "rule__AtomicExpr__ValueAssignment_1_3");
			builder.put(grammarAccess.getAtomicExprAccess().getRecordTypeAssignment_2_0_0_1(), "rule__AtomicExpr__RecordTypeAssignment_2_0_0_1");
			builder.put(grammarAccess.getAtomicExprAccess().getArgsAssignment_2_0_0_3(), "rule__AtomicExpr__ArgsAssignment_2_0_0_3");
			builder.put(grammarAccess.getAtomicExprAccess().getArgExprAssignment_2_1(), "rule__AtomicExpr__ArgExprAssignment_2_1");
			builder.put(grammarAccess.getAtomicExprAccess().getArgsAssignment_2_2_1(), "rule__AtomicExpr__ArgsAssignment_2_2_1");
			builder.put(grammarAccess.getAtomicExprAccess().getArgExprAssignment_2_2_3(), "rule__AtomicExpr__ArgExprAssignment_2_2_3");
			builder.put(grammarAccess.getAtomicExprAccess().getValueAssignment_3_1(), "rule__AtomicExpr__ValueAssignment_3_1");
			builder.put(grammarAccess.getAtomicExprAccess().getValAssignment_4_1(), "rule__AtomicExpr__ValAssignment_4_1");
			builder.put(grammarAccess.getAtomicExprAccess().getValAssignment_5_1(), "rule__AtomicExpr__ValAssignment_5_1");
			builder.put(grammarAccess.getAtomicExprAccess().getExprAssignment_6_3(), "rule__AtomicExpr__ExprAssignment_6_3");
			builder.put(grammarAccess.getAtomicExprAccess().getExprAssignment_7_3(), "rule__AtomicExpr__ExprAssignment_7_3");
			builder.put(grammarAccess.getOtherDataRefAccess().getNamedElementAssignment_0(), "rule__OtherDataRef__NamedElementAssignment_0");
			builder.put(grammarAccess.getOtherDataRefAccess().getPathAssignment_1_1(), "rule__OtherDataRef__PathAssignment_1_1");
			builder.put(grammarAccess.getDoubleDotRefAccess().getElmAssignment(), "rule__DoubleDotRef__ElmAssignment");
			builder.put(grammarAccess.getDataElementAccess().getDataElementAssignment(), "rule__DataElement__DataElementAssignment");
			builder.put(grammarAccess.getSubcomponentElementAccess().getSubcomponentAssignment(), "rule__SubcomponentElement__SubcomponentAssignment");
			builder.put(grammarAccess.getSlangExprAccess().getTermsAssignment_0_0(), "rule__SlangExpr__TermsAssignment_0_0");
			builder.put(grammarAccess.getSlangExprAccess().getTermsAssignment_0_1_0_1(), "rule__SlangExpr__TermsAssignment_0_1_0_1");
			builder.put(grammarAccess.getSlangExprAccess().getThenAssignment_0_1_1_1(), "rule__SlangExpr__ThenAssignment_0_1_1_1");
			builder.put(grammarAccess.getSlangExprAccess().getElsAssignment_0_1_1_3(), "rule__SlangExpr__ElsAssignment_0_1_1_3");
			builder.put(grammarAccess.getSlangExprAccess().getVarAssignment_1_1(), "rule__SlangExpr__VarAssignment_1_1");
			builder.put(grammarAccess.getSlangExprAccess().getVarAssignment_1_2_1(), "rule__SlangExpr__VarAssignment_1_2_1");
			builder.put(grammarAccess.getSlangExprAccess().getBodyAssignment_1_4(), "rule__SlangExpr__BodyAssignment_1_4");
			builder.put(grammarAccess.getSlangQuantVarAccess().getValAssignment_2(), "rule__SlangQuantVar__ValAssignment_2");
			builder.put(grammarAccess.getSlangQuantVarAccess().getUpperBoundAssignment_3_1(), "rule__SlangQuantVar__UpperBoundAssignment_3_1");
			builder.put(grammarAccess.getSlangAccessAccess().getTAssignment_0(), "rule__SlangAccess__TAssignment_0");
			builder.put(grammarAccess.getSlangAccessAccess().getSufAssignment_1(), "rule__SlangAccess__SufAssignment_1");
			builder.put(grammarAccess.getSlangTermAccess().getTupleAssignment_1_1(), "rule__SlangTerm__TupleAssignment_1_1");
			builder.put(grammarAccess.getSlangTermAccess().getTupleAssignment_1_2_1(), "rule__SlangTerm__TupleAssignment_1_2_1");
			builder.put(grammarAccess.getCallSuffixAccess().getArgsAssignment_0_1(), "rule__CallSuffix__ArgsAssignment_0_1");
			builder.put(grammarAccess.getCallSuffixAccess().getArgsAssignment_1(), "rule__CallSuffix__ArgsAssignment_1");
			builder.put(grammarAccess.getCallArgsAccess().getFAssignment_1_0(), "rule__CallArgs__FAssignment_1_0");
			builder.put(grammarAccess.getCallArgsAccess().getFAssignment_1_1_1(), "rule__CallArgs__FAssignment_1_1_1");
			builder.put(grammarAccess.getIdExpAccess().getLAssignment_0(), "rule__IdExp__LAssignment_0");
			builder.put(grammarAccess.getIdExpAccess().getRAssignment_1_1(), "rule__IdExp__RAssignment_1_1");
			builder.put(grammarAccess.getFunctionsAccess().getSpecsAssignment_1(), "rule__Functions__SpecsAssignment_1");
			builder.put(grammarAccess.getDefDefAccess().getNameAssignment_2(), "rule__DefDef__NameAssignment_2");
			builder.put(grammarAccess.getDefDefAccess().getArgsAssignment_4(), "rule__DefDef__ArgsAssignment_4");
			builder.put(grammarAccess.getDefDefAccess().getContractAssignment_7(), "rule__DefDef__ContractAssignment_7");
			builder.put(grammarAccess.getDefDefAccess().getBodyAssignment_9(), "rule__DefDef__BodyAssignment_9");
			builder.put(grammarAccess.getDefParamsAccess().getParamsAssignment_1(), "rule__DefParams__ParamsAssignment_1");
			builder.put(grammarAccess.getDefParamsAccess().getParamsAssignment_2_1(), "rule__DefParams__ParamsAssignment_2_1");
			builder.put(grammarAccess.getDefParamAccess().getNameAssignment_0(), "rule__DefParam__NameAssignment_0");
			builder.put(grammarAccess.getDefParamAccess().getTypeNameAssignment_3(), "rule__DefParam__TypeNameAssignment_3");
			builder.put(grammarAccess.getDefContractAccess().getReaAssignment_2_0_0(), "rule__DefContract__ReaAssignment_2_0_0");
			builder.put(grammarAccess.getDefContractAccess().getReqAssignment_2_0_1(), "rule__DefContract__ReqAssignment_2_0_1");
			builder.put(grammarAccess.getDefContractAccess().getModAssignment_2_0_2(), "rule__DefContract__ModAssignment_2_0_2");
			builder.put(grammarAccess.getDefContractAccess().getEnsAssignment_2_0_3(), "rule__DefContract__EnsAssignment_2_0_3");
			builder.put(grammarAccess.getDefContractAccess().getDccAssignment_2_1_0(), "rule__DefContract__DccAssignment_2_1_0");
			builder.put(grammarAccess.getDefContractAccess().getReaAssignment_2_1_1(), "rule__DefContract__ReaAssignment_2_1_1");
			builder.put(grammarAccess.getDefContractAccess().getModAssignment_2_1_2(), "rule__DefContract__ModAssignment_2_1_2");
			builder.put(grammarAccess.getDefContractCaseAccess().getRAssignment_3(), "rule__DefContractCase__RAssignment_3");
			builder.put(grammarAccess.getDefContractCaseAccess().getEAssignment_4(), "rule__DefContractCase__EAssignment_4");
			builder.put(grammarAccess.getReadsAccess().getEAssignment_1(), "rule__Reads__EAssignment_1");
			builder.put(grammarAccess.getReadsAccess().getEAssignment_2_1(), "rule__Reads__EAssignment_2_1");
			builder.put(grammarAccess.getRequiresAccess().getEAssignment_1(), "rule__Requires__EAssignment_1");
			builder.put(grammarAccess.getRequiresAccess().getEAssignment_2_1(), "rule__Requires__EAssignment_2_1");
			builder.put(grammarAccess.getModifiesAccess().getEAssignment_1(), "rule__Modifies__EAssignment_1");
			builder.put(grammarAccess.getModifiesAccess().getEAssignment_2_1(), "rule__Modifies__EAssignment_2_1");
			builder.put(grammarAccess.getEnsuresAccess().getEAssignment_1(), "rule__Ensures__EAssignment_1");
			builder.put(grammarAccess.getEnsuresAccess().getEAssignment_2_1(), "rule__Ensures__EAssignment_2_1");
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
