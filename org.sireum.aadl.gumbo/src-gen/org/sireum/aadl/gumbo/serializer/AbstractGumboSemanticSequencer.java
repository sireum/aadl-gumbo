
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
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.osate.aadl2.Aadl2Package;
import org.osate.aadl2.ArrayRange;
import org.osate.aadl2.BasicPropertyAssociation;
import org.osate.aadl2.BooleanLiteral;
import org.osate.aadl2.ClassifierValue;
import org.osate.aadl2.ComputedValue;
import org.osate.aadl2.ContainedNamedElement;
import org.osate.aadl2.ContainmentPathElement;
import org.osate.aadl2.IntegerLiteral;
import org.osate.aadl2.ListValue;
import org.osate.aadl2.ModalPropertyValue;
import org.osate.aadl2.NamedValue;
import org.osate.aadl2.Operation;
import org.osate.aadl2.PropertyAssociation;
import org.osate.aadl2.RangeValue;
import org.osate.aadl2.RealLiteral;
import org.osate.aadl2.RecordValue;
import org.osate.aadl2.ReferenceValue;
import org.osate.aadl2.StringLiteral;
import org.osate.xtext.aadl2.properties.serializer.PropertiesSemanticSequencer;
import org.sireum.aadl.gumbo.gumbo.AndExpr;
import org.sireum.aadl.gumbo.gumbo.AnonAssumeStatement;
import org.sireum.aadl.gumbo.gumbo.AnonGuaranteeStatement;
import org.sireum.aadl.gumbo.gumbo.ArrayAccess;
import org.sireum.aadl.gumbo.gumbo.AssumeStatement;
import org.sireum.aadl.gumbo.gumbo.BinLit;
import org.sireum.aadl.gumbo.gumbo.BooleanLit;
import org.sireum.aadl.gumbo.gumbo.CallExpr;
import org.sireum.aadl.gumbo.gumbo.CaseStatementClause;
import org.sireum.aadl.gumbo.gumbo.ColonExpr;
import org.sireum.aadl.gumbo.gumbo.Compute;
import org.sireum.aadl.gumbo.gumbo.DataElement;
import org.sireum.aadl.gumbo.gumbo.DataRefExpr;
import org.sireum.aadl.gumbo.gumbo.EnumLitExpr;
import org.sireum.aadl.gumbo.gumbo.EqualNotExpr;
import org.sireum.aadl.gumbo.gumbo.F32Lit;
import org.sireum.aadl.gumbo.gumbo.F32Obj;
import org.sireum.aadl.gumbo.gumbo.F64Lit;
import org.sireum.aadl.gumbo.gumbo.F64Obj;
import org.sireum.aadl.gumbo.gumbo.Functions;
import org.sireum.aadl.gumbo.gumbo.GuaranteeStatement;
import org.sireum.aadl.gumbo.gumbo.GumboLibrary;
import org.sireum.aadl.gumbo.gumbo.GumboPackage;
import org.sireum.aadl.gumbo.gumbo.GumboSubclause;
import org.sireum.aadl.gumbo.gumbo.GumboTable;
import org.sireum.aadl.gumbo.gumbo.HandlerClause;
import org.sireum.aadl.gumbo.gumbo.HasEventExpr;
import org.sireum.aadl.gumbo.gumbo.HexLit;
import org.sireum.aadl.gumbo.gumbo.IfElseExp;
import org.sireum.aadl.gumbo.gumbo.ImpliesExpr;
import org.sireum.aadl.gumbo.gumbo.InStateExpr;
import org.sireum.aadl.gumbo.gumbo.InfoFlowClause;
import org.sireum.aadl.gumbo.gumbo.Initialize;
import org.sireum.aadl.gumbo.gumbo.InitializeSpecStatement;
import org.sireum.aadl.gumbo.gumbo.IntegerLit;
import org.sireum.aadl.gumbo.gumbo.Integration;
import org.sireum.aadl.gumbo.gumbo.InvSpec;
import org.sireum.aadl.gumbo.gumbo.Invariants;
import org.sireum.aadl.gumbo.gumbo.LtGtExpr;
import org.sireum.aadl.gumbo.gumbo.MaySendExpr;
import org.sireum.aadl.gumbo.gumbo.MemberAccess;
import org.sireum.aadl.gumbo.gumbo.MultiplicativeExpr;
import org.sireum.aadl.gumbo.gumbo.MustSendExpr;
import org.sireum.aadl.gumbo.gumbo.NoSendExpr;
import org.sireum.aadl.gumbo.gumbo.NormalTable;
import org.sireum.aadl.gumbo.gumbo.OrExpr;
import org.sireum.aadl.gumbo.gumbo.OtherDataRef;
import org.sireum.aadl.gumbo.gumbo.ParenExpr;
import org.sireum.aadl.gumbo.gumbo.PlusMinusExpr;
import org.sireum.aadl.gumbo.gumbo.PostFixExpr;
import org.sireum.aadl.gumbo.gumbo.QuantParam;
import org.sireum.aadl.gumbo.gumbo.QuantRange;
import org.sireum.aadl.gumbo.gumbo.QuantifiedExp;
import org.sireum.aadl.gumbo.gumbo.RecordLitExpr;
import org.sireum.aadl.gumbo.gumbo.ResultExpr;
import org.sireum.aadl.gumbo.gumbo.ResultRow;
import org.sireum.aadl.gumbo.gumbo.SlangAssertStmt;
import org.sireum.aadl.gumbo.gumbo.SlangAssumeStmt;
import org.sireum.aadl.gumbo.gumbo.SlangBlock;
import org.sireum.aadl.gumbo.gumbo.SlangBlockTerm;
import org.sireum.aadl.gumbo.gumbo.SlangCallArgs;
import org.sireum.aadl.gumbo.gumbo.SlangCallSuffix;
import org.sireum.aadl.gumbo.gumbo.SlangCase;
import org.sireum.aadl.gumbo.gumbo.SlangDefContract;
import org.sireum.aadl.gumbo.gumbo.SlangDefDef;
import org.sireum.aadl.gumbo.gumbo.SlangDefParam;
import org.sireum.aadl.gumbo.gumbo.SlangDefParams;
import org.sireum.aadl.gumbo.gumbo.SlangDoStmt;
import org.sireum.aadl.gumbo.gumbo.SlangElse;
import org.sireum.aadl.gumbo.gumbo.SlangEnsures;
import org.sireum.aadl.gumbo.gumbo.SlangForRange;
import org.sireum.aadl.gumbo.gumbo.SlangForTerm;
import org.sireum.aadl.gumbo.gumbo.SlangHaltStmt;
import org.sireum.aadl.gumbo.gumbo.SlangIfStmt;
import org.sireum.aadl.gumbo.gumbo.SlangInterpTerm;
import org.sireum.aadl.gumbo.gumbo.SlangInvariant;
import org.sireum.aadl.gumbo.gumbo.SlangLitTerm;
import org.sireum.aadl.gumbo.gumbo.SlangLiteralInterp;
import org.sireum.aadl.gumbo.gumbo.SlangLoopContract;
import org.sireum.aadl.gumbo.gumbo.SlangMatchStmt;
import org.sireum.aadl.gumbo.gumbo.SlangModifies;
import org.sireum.aadl.gumbo.gumbo.SlangParam;
import org.sireum.aadl.gumbo.gumbo.SlangParams;
import org.sireum.aadl.gumbo.gumbo.SlangPattern;
import org.sireum.aadl.gumbo.gumbo.SlangReads;
import org.sireum.aadl.gumbo.gumbo.SlangRequires;
import org.sireum.aadl.gumbo.gumbo.SlangRet;
import org.sireum.aadl.gumbo.gumbo.SlangSpecStmt;
import org.sireum.aadl.gumbo.gumbo.SlangStringLit;
import org.sireum.aadl.gumbo.gumbo.SlangTPattern;
import org.sireum.aadl.gumbo.gumbo.SlangType;
import org.sireum.aadl.gumbo.gumbo.SlangTypeParam;
import org.sireum.aadl.gumbo.gumbo.SlangTypeParams;
import org.sireum.aadl.gumbo.gumbo.SlangVarDef;
import org.sireum.aadl.gumbo.gumbo.SlangWhileStmt;
import org.sireum.aadl.gumbo.gumbo.SpecSection;
import org.sireum.aadl.gumbo.gumbo.State;
import org.sireum.aadl.gumbo.gumbo.StateVarDecl;
import org.sireum.aadl.gumbo.gumbo.SubcomponentElement;
import org.sireum.aadl.gumbo.gumbo.UnaryExpr;
import org.sireum.aadl.gumbo.services.GumboGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractGumboSemanticSequencer extends PropertiesSemanticSequencer {

	@Inject
	private GumboGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == Aadl2Package.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case Aadl2Package.ARRAY_RANGE:
				sequence_ArrayRange(context, (ArrayRange) semanticObject); 
				return; 
			case Aadl2Package.BASIC_PROPERTY_ASSOCIATION:
				sequence_FieldPropertyAssociation(context, (BasicPropertyAssociation) semanticObject); 
				return; 
			case Aadl2Package.BOOLEAN_LITERAL:
				sequence_BooleanLiteral(context, (BooleanLiteral) semanticObject); 
				return; 
			case Aadl2Package.CLASSIFIER_VALUE:
				sequence_ComponentClassifierTerm(context, (ClassifierValue) semanticObject); 
				return; 
			case Aadl2Package.COMPUTED_VALUE:
				sequence_ComputedTerm(context, (ComputedValue) semanticObject); 
				return; 
			case Aadl2Package.CONTAINED_NAMED_ELEMENT:
				sequence_ContainmentPath(context, (ContainedNamedElement) semanticObject); 
				return; 
			case Aadl2Package.CONTAINMENT_PATH_ELEMENT:
				sequence_ContainmentPathElement(context, (ContainmentPathElement) semanticObject); 
				return; 
			case Aadl2Package.INTEGER_LITERAL:
				sequence_IntegerTerm(context, (IntegerLiteral) semanticObject); 
				return; 
			case Aadl2Package.LIST_VALUE:
				sequence_ListTerm(context, (ListValue) semanticObject); 
				return; 
			case Aadl2Package.MODAL_PROPERTY_VALUE:
				if (rule == grammarAccess.getModalPropertyValueRule()) {
					sequence_ModalPropertyValue(context, (ModalPropertyValue) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getOptionalModalPropertyValueRule()) {
					sequence_OptionalModalPropertyValue(context, (ModalPropertyValue) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPropertyValueRule()) {
					sequence_PropertyValue(context, (ModalPropertyValue) semanticObject); 
					return; 
				}
				else break;
			case Aadl2Package.NAMED_VALUE:
				if (rule == grammarAccess.getConstantValueRule()
						|| rule == grammarAccess.getNumAltRule()) {
					sequence_ConstantValue(context, (NamedValue) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPropertyExpressionRule()
						|| rule == grammarAccess.getLiteralorReferenceTermRule()) {
					sequence_LiteralorReferenceTerm(context, (NamedValue) semanticObject); 
					return; 
				}
				else break;
			case Aadl2Package.OPERATION:
				sequence_SignedConstant(context, (Operation) semanticObject); 
				return; 
			case Aadl2Package.PROPERTY_ASSOCIATION:
				if (rule == grammarAccess.getBasicPropertyAssociationRule()) {
					sequence_BasicPropertyAssociation(context, (PropertyAssociation) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPModelRule()
						|| rule == grammarAccess.getContainedPropertyAssociationRule()) {
					sequence_ContainedPropertyAssociation(context, (PropertyAssociation) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPropertyAssociationRule()) {
					sequence_PropertyAssociation(context, (PropertyAssociation) semanticObject); 
					return; 
				}
				else break;
			case Aadl2Package.RANGE_VALUE:
				sequence_NumericRangeTerm(context, (RangeValue) semanticObject); 
				return; 
			case Aadl2Package.REAL_LITERAL:
				sequence_RealTerm(context, (RealLiteral) semanticObject); 
				return; 
			case Aadl2Package.RECORD_VALUE:
				if (rule == grammarAccess.getOldRecordTermRule()) {
					sequence_OldRecordTerm(context, (RecordValue) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPropertyExpressionRule()
						|| rule == grammarAccess.getRecordTermRule()) {
					sequence_RecordTerm(context, (RecordValue) semanticObject); 
					return; 
				}
				else break;
			case Aadl2Package.REFERENCE_VALUE:
				sequence_ReferenceTerm(context, (ReferenceValue) semanticObject); 
				return; 
			case Aadl2Package.STRING_LITERAL:
				sequence_StringTerm(context, (StringLiteral) semanticObject); 
				return; 
			}
		else if (epackage == GumboPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case GumboPackage.AND_EXPR:
				sequence_AndExpression(context, (AndExpr) semanticObject); 
				return; 
			case GumboPackage.ANON_ASSUME_STATEMENT:
				sequence_AnonAssumeStatement(context, (AnonAssumeStatement) semanticObject); 
				return; 
			case GumboPackage.ANON_GUARANTEE_STATEMENT:
				sequence_AnonGuaranteeStatement(context, (AnonGuaranteeStatement) semanticObject); 
				return; 
			case GumboPackage.ARRAY_ACCESS:
				sequence_ArrayAccess(context, (ArrayAccess) semanticObject); 
				return; 
			case GumboPackage.ASSUME_STATEMENT:
				sequence_AssumeStatement(context, (AssumeStatement) semanticObject); 
				return; 
			case GumboPackage.BIN_LIT:
				sequence_SlangLit(context, (BinLit) semanticObject); 
				return; 
			case GumboPackage.BOOLEAN_LIT:
				sequence_SlangLit(context, (BooleanLit) semanticObject); 
				return; 
			case GumboPackage.CALL_EXPR:
				sequence_AccessibleBaseExpr(context, (CallExpr) semanticObject); 
				return; 
			case GumboPackage.CASE_STATEMENT_CLAUSE:
				sequence_CaseStatementClause(context, (CaseStatementClause) semanticObject); 
				return; 
			case GumboPackage.COLON_EXPR:
				sequence_ColonExpression(context, (ColonExpr) semanticObject); 
				return; 
			case GumboPackage.COMPUTE:
				sequence_Compute(context, (Compute) semanticObject); 
				return; 
			case GumboPackage.DATA_ELEMENT:
				sequence_DataElement(context, (DataElement) semanticObject); 
				return; 
			case GumboPackage.DATA_REF_EXPR:
				sequence_AccessibleBaseExpr(context, (DataRefExpr) semanticObject); 
				return; 
			case GumboPackage.ENUM_LIT_EXPR:
				sequence_BaseExpr(context, (EnumLitExpr) semanticObject); 
				return; 
			case GumboPackage.EQUAL_NOT_EXPR:
				sequence_EqualNotExpression(context, (EqualNotExpr) semanticObject); 
				return; 
			case GumboPackage.F32_LIT:
				sequence_SlangLit(context, (F32Lit) semanticObject); 
				return; 
			case GumboPackage.F32_OBJ:
				sequence_FloatObjectExpr(context, (F32Obj) semanticObject); 
				return; 
			case GumboPackage.F64_LIT:
				sequence_SlangLit(context, (F64Lit) semanticObject); 
				return; 
			case GumboPackage.F64_OBJ:
				sequence_FloatObjectExpr(context, (F64Obj) semanticObject); 
				return; 
			case GumboPackage.FUNCTIONS:
				sequence_Functions(context, (Functions) semanticObject); 
				return; 
			case GumboPackage.GUARANTEE_STATEMENT:
				sequence_GuaranteeStatement(context, (GuaranteeStatement) semanticObject); 
				return; 
			case GumboPackage.GUMBO_LIBRARY:
				sequence_GumboLibrary(context, (GumboLibrary) semanticObject); 
				return; 
			case GumboPackage.GUMBO_SUBCLAUSE:
				sequence_GumboSubclause(context, (GumboSubclause) semanticObject); 
				return; 
			case GumboPackage.GUMBO_TABLE:
				sequence_GumboTable(context, (GumboTable) semanticObject); 
				return; 
			case GumboPackage.HANDLER_CLAUSE:
				sequence_HandlerClause(context, (HandlerClause) semanticObject); 
				return; 
			case GumboPackage.HAS_EVENT_EXPR:
				sequence_BaseExpr(context, (HasEventExpr) semanticObject); 
				return; 
			case GumboPackage.HEX_LIT:
				sequence_SlangLit(context, (HexLit) semanticObject); 
				return; 
			case GumboPackage.IF_ELSE_EXP:
				sequence_SlangExpression(context, (IfElseExp) semanticObject); 
				return; 
			case GumboPackage.IMPLIES_EXPR:
				sequence_ImpliesExpression(context, (ImpliesExpr) semanticObject); 
				return; 
			case GumboPackage.IN_STATE_EXPR:
				sequence_BaseExpr(context, (InStateExpr) semanticObject); 
				return; 
			case GumboPackage.INFO_FLOW_CLAUSE:
				sequence_InfoFlowClause(context, (InfoFlowClause) semanticObject); 
				return; 
			case GumboPackage.INITIALIZE:
				sequence_Initialize(context, (Initialize) semanticObject); 
				return; 
			case GumboPackage.INITIALIZE_SPEC_STATEMENT:
				sequence_InitializeSpecStatement(context, (InitializeSpecStatement) semanticObject); 
				return; 
			case GumboPackage.INTEGER_LIT:
				sequence_SlangLit(context, (IntegerLit) semanticObject); 
				return; 
			case GumboPackage.INTEGRATION:
				sequence_Integration(context, (Integration) semanticObject); 
				return; 
			case GumboPackage.INV_SPEC:
				sequence_InvSpec(context, (InvSpec) semanticObject); 
				return; 
			case GumboPackage.INVARIANTS:
				sequence_Invariants(context, (Invariants) semanticObject); 
				return; 
			case GumboPackage.LT_GT_EXPR:
				sequence_LtGtExpression(context, (LtGtExpr) semanticObject); 
				return; 
			case GumboPackage.MAY_SEND_EXPR:
				sequence_BaseExpr(context, (MaySendExpr) semanticObject); 
				return; 
			case GumboPackage.MEMBER_ACCESS:
				sequence_MemberAccess(context, (MemberAccess) semanticObject); 
				return; 
			case GumboPackage.MULTIPLICATIVE_EXPR:
				sequence_MultiplicativeExpression(context, (MultiplicativeExpr) semanticObject); 
				return; 
			case GumboPackage.MUST_SEND_EXPR:
				sequence_BaseExpr(context, (MustSendExpr) semanticObject); 
				return; 
			case GumboPackage.NO_SEND_EXPR:
				sequence_BaseExpr(context, (NoSendExpr) semanticObject); 
				return; 
			case GumboPackage.NORMAL_TABLE:
				sequence_NormalTable(context, (NormalTable) semanticObject); 
				return; 
			case GumboPackage.OR_EXPR:
				sequence_OrExpression(context, (OrExpr) semanticObject); 
				return; 
			case GumboPackage.OTHER_DATA_REF:
				sequence_OtherDataRef(context, (OtherDataRef) semanticObject); 
				return; 
			case GumboPackage.PAREN_EXPR:
				sequence_BaseExpr(context, (ParenExpr) semanticObject); 
				return; 
			case GumboPackage.PLUS_MINUS_EXPR:
				sequence_PlusMinusExpression(context, (PlusMinusExpr) semanticObject); 
				return; 
			case GumboPackage.POST_FIX_EXPR:
				sequence_PrimaryExpr(context, (PostFixExpr) semanticObject); 
				return; 
			case GumboPackage.QUANT_PARAM:
				sequence_QuantParam(context, (QuantParam) semanticObject); 
				return; 
			case GumboPackage.QUANT_RANGE:
				sequence_QuantRange(context, (QuantRange) semanticObject); 
				return; 
			case GumboPackage.QUANTIFIED_EXP:
				sequence_SlangExpression(context, (QuantifiedExp) semanticObject); 
				return; 
			case GumboPackage.RECORD_LIT_EXPR:
				sequence_AccessibleBaseExpr(context, (RecordLitExpr) semanticObject); 
				return; 
			case GumboPackage.RESULT_EXPR:
				sequence_AccessibleBaseExpr(context, (ResultExpr) semanticObject); 
				return; 
			case GumboPackage.RESULT_ROW:
				sequence_ResultRow(context, (ResultRow) semanticObject); 
				return; 
			case GumboPackage.SLANG_ASSERT_STMT:
				sequence_SlangStmt(context, (SlangAssertStmt) semanticObject); 
				return; 
			case GumboPackage.SLANG_ASSUME_STMT:
				sequence_SlangStmt(context, (SlangAssumeStmt) semanticObject); 
				return; 
			case GumboPackage.SLANG_BLOCK:
				sequence_SlangBlock(context, (SlangBlock) semanticObject); 
				return; 
			case GumboPackage.SLANG_BLOCK_TERM:
				sequence_BaseExpr(context, (SlangBlockTerm) semanticObject); 
				return; 
			case GumboPackage.SLANG_CALL_ARGS:
				sequence_SlangCallArgs(context, (SlangCallArgs) semanticObject); 
				return; 
			case GumboPackage.SLANG_CALL_SUFFIX:
				sequence_SlangCallSuffix(context, (SlangCallSuffix) semanticObject); 
				return; 
			case GumboPackage.SLANG_CASE:
				sequence_SlangCase(context, (SlangCase) semanticObject); 
				return; 
			case GumboPackage.SLANG_DEF_CONTRACT:
				sequence_SlangDefContract(context, (SlangDefContract) semanticObject); 
				return; 
			case GumboPackage.SLANG_DEF_DEF:
				sequence_SlangDefDef(context, (SlangDefDef) semanticObject); 
				return; 
			case GumboPackage.SLANG_DEF_PARAM:
				sequence_SlangDefParam(context, (SlangDefParam) semanticObject); 
				return; 
			case GumboPackage.SLANG_DEF_PARAMS:
				sequence_SlangDefParams(context, (SlangDefParams) semanticObject); 
				return; 
			case GumboPackage.SLANG_DO_STMT:
				sequence_SlangStmt(context, (SlangDoStmt) semanticObject); 
				return; 
			case GumboPackage.SLANG_ELSE:
				sequence_SlangElse(context, (SlangElse) semanticObject); 
				return; 
			case GumboPackage.SLANG_ENSURES:
				sequence_SlangEnsures(context, (SlangEnsures) semanticObject); 
				return; 
			case GumboPackage.SLANG_FOR_RANGE:
				sequence_SlangForRange(context, (SlangForRange) semanticObject); 
				return; 
			case GumboPackage.SLANG_FOR_TERM:
				sequence_BaseExpr(context, (SlangForTerm) semanticObject); 
				return; 
			case GumboPackage.SLANG_HALT_STMT:
				sequence_SlangStmt(context, (SlangHaltStmt) semanticObject); 
				return; 
			case GumboPackage.SLANG_IF_STMT:
				sequence_SlangStmt(context, (SlangIfStmt) semanticObject); 
				return; 
			case GumboPackage.SLANG_INTERP_TERM:
				sequence_BaseExpr(context, (SlangInterpTerm) semanticObject); 
				return; 
			case GumboPackage.SLANG_INVARIANT:
				sequence_SlangInvariant(context, (SlangInvariant) semanticObject); 
				return; 
			case GumboPackage.SLANG_LIT_TERM:
				sequence_BaseExpr(context, (SlangLitTerm) semanticObject); 
				return; 
			case GumboPackage.SLANG_LITERAL_INTERP:
				sequence_SlangInterp(context, (SlangLiteralInterp) semanticObject); 
				return; 
			case GumboPackage.SLANG_LOOP_CONTRACT:
				sequence_SlangLoopContract(context, (SlangLoopContract) semanticObject); 
				return; 
			case GumboPackage.SLANG_MATCH_STMT:
				sequence_SlangStmt(context, (SlangMatchStmt) semanticObject); 
				return; 
			case GumboPackage.SLANG_MODIFIES:
				sequence_SlangModifies(context, (SlangModifies) semanticObject); 
				return; 
			case GumboPackage.SLANG_PARAM:
				sequence_SlangParam(context, (SlangParam) semanticObject); 
				return; 
			case GumboPackage.SLANG_PARAMS:
				sequence_SlangParams(context, (SlangParams) semanticObject); 
				return; 
			case GumboPackage.SLANG_PATTERN:
				if (rule == grammarAccess.getSlangPatternRule()) {
					sequence_SlangPattern(context, (SlangPattern) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getSlangVarDefRule()) {
					sequence_SlangPattern_SlangVarDef(context, (SlangPattern) semanticObject); 
					return; 
				}
				else break;
			case GumboPackage.SLANG_READS:
				sequence_SlangReads(context, (SlangReads) semanticObject); 
				return; 
			case GumboPackage.SLANG_REQUIRES:
				sequence_SlangRequires(context, (SlangRequires) semanticObject); 
				return; 
			case GumboPackage.SLANG_RET:
				sequence_SlangRet(context, (SlangRet) semanticObject); 
				return; 
			case GumboPackage.SLANG_SPEC_STMT:
				sequence_SlangStmt(context, (SlangSpecStmt) semanticObject); 
				return; 
			case GumboPackage.SLANG_STRING_LIT:
				sequence_SlangLit(context, (SlangStringLit) semanticObject); 
				return; 
			case GumboPackage.SLANG_TPATTERN:
				sequence_SlangTPattern(context, (SlangTPattern) semanticObject); 
				return; 
			case GumboPackage.SLANG_TYPE:
				sequence_SlangBaseType(context, (SlangType) semanticObject); 
				return; 
			case GumboPackage.SLANG_TYPE_PARAM:
				sequence_SlangTypeParam(context, (SlangTypeParam) semanticObject); 
				return; 
			case GumboPackage.SLANG_TYPE_PARAMS:
				sequence_SlangTypeParams(context, (SlangTypeParams) semanticObject); 
				return; 
			case GumboPackage.SLANG_VAR_DEF:
				sequence_SlangStmt(context, (SlangVarDef) semanticObject); 
				return; 
			case GumboPackage.SLANG_WHILE_STMT:
				sequence_SlangStmt(context, (SlangWhileStmt) semanticObject); 
				return; 
			case GumboPackage.SPEC_SECTION:
				sequence_SpecSection(context, (SpecSection) semanticObject); 
				return; 
			case GumboPackage.STATE:
				sequence_State(context, (State) semanticObject); 
				return; 
			case GumboPackage.STATE_VAR_DECL:
				sequence_StateVarDecl(context, (StateVarDecl) semanticObject); 
				return; 
			case GumboPackage.SUBCOMPONENT_ELEMENT:
				sequence_SubcomponentElement(context, (SubcomponentElement) semanticObject); 
				return; 
			case GumboPackage.UNARY_EXPR:
				sequence_UnaryExpression(context, (UnaryExpr) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     AccessibleBaseExpr returns CallExpr
	 *
	 * Constraint:
	 *     (id=[EObject|QualifiedName] callSuffix=SlangCallSuffix)
	 * </pre>
	 */
	protected void sequence_AccessibleBaseExpr(ISerializationContext context, CallExpr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.CALL_EXPR__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.CALL_EXPR__ID));
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.CALL_EXPR__CALL_SUFFIX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.CALL_EXPR__CALL_SUFFIX));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAccessibleBaseExprAccess().getIdEObjectQualifiedNameParserRuleCall_0_0_1_0_1(), semanticObject.eGet(GumboPackage.Literals.CALL_EXPR__ID, false));
		feeder.accept(grammarAccess.getAccessibleBaseExprAccess().getCallSuffixSlangCallSuffixParserRuleCall_0_0_2_0(), semanticObject.getCallSuffix());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     AccessibleBaseExpr returns DataRefExpr
	 *
	 * Constraint:
	 *     portOrSubcomponentOrStateVar=[EObject|ID]
	 * </pre>
	 */
	protected void sequence_AccessibleBaseExpr(ISerializationContext context, DataRefExpr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.DATA_REF_EXPR__PORT_OR_SUBCOMPONENT_OR_STATE_VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.DATA_REF_EXPR__PORT_OR_SUBCOMPONENT_OR_STATE_VAR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAccessibleBaseExprAccess().getPortOrSubcomponentOrStateVarEObjectIDTerminalRuleCall_2_1_0_1(), semanticObject.eGet(GumboPackage.Literals.DATA_REF_EXPR__PORT_OR_SUBCOMPONENT_OR_STATE_VAR, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     AccessibleBaseExpr returns RecordLitExpr
	 *
	 * Constraint:
	 *     (recordType=DataElement args+=[NamedElement|ID] argExpr+=OwnedExpression (args+=[NamedElement|ID] argExpr+=OwnedExpression)*)
	 * </pre>
	 */
	protected void sequence_AccessibleBaseExpr(ISerializationContext context, RecordLitExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     AccessibleBaseExpr returns ResultExpr
	 *
	 * Constraint:
	 *     {ResultExpr}
	 * </pre>
	 */
	protected void sequence_AccessibleBaseExpr(ISerializationContext context, ResultExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     OwnedExpression returns AndExpr
	 *     SlangExpression returns AndExpr
	 *     ImpliesExpression returns AndExpr
	 *     ImpliesExpression.ImpliesExpr_1_0 returns AndExpr
	 *     OrExpression returns AndExpr
	 *     OrExpression.OrExpr_1_0 returns AndExpr
	 *     AndExpression returns AndExpr
	 *     AndExpression.AndExpr_1_0 returns AndExpr
	 *
	 * Constraint:
	 *     (left=AndExpression_AndExpr_1_0 op=AND_OPS right=EqualNotExpression)
	 * </pre>
	 */
	protected void sequence_AndExpression(ISerializationContext context, AndExpr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.AND_EXPR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.AND_EXPR__LEFT));
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.AND_EXPR__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.AND_EXPR__OP));
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.AND_EXPR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.AND_EXPR__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAndExpressionAccess().getAndExprLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAndExpressionAccess().getOpAND_OPSTerminalRuleCall_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getAndExpressionAccess().getRightEqualNotExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     AnonAssumeStatement returns AnonAssumeStatement
	 *
	 * Constraint:
	 *     expr=OwnedExpression
	 * </pre>
	 */
	protected void sequence_AnonAssumeStatement(ISerializationContext context, AnonAssumeStatement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.ANON_ASSUME_STATEMENT__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.ANON_ASSUME_STATEMENT__EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAnonAssumeStatementAccess().getExprOwnedExpressionParserRuleCall_1_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     AnonGuaranteeStatement returns AnonGuaranteeStatement
	 *
	 * Constraint:
	 *     expr=OwnedExpression
	 * </pre>
	 */
	protected void sequence_AnonGuaranteeStatement(ISerializationContext context, AnonGuaranteeStatement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.ANON_GUARANTEE_STATEMENT__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.ANON_GUARANTEE_STATEMENT__EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAnonGuaranteeStatementAccess().getExprOwnedExpressionParserRuleCall_1_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Postfix returns ArrayAccess
	 *     ArrayAccess returns ArrayAccess
	 *
	 * Constraint:
	 *     (index+=OwnedExpression index+=OwnedExpression*)
	 * </pre>
	 */
	protected void sequence_ArrayAccess(ISerializationContext context, ArrayAccess semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SpecStatement returns AssumeStatement
	 *     AssumeStatement returns AssumeStatement
	 *
	 * Constraint:
	 *     (id=ID descriptor=STRING_VALUE? expr=OwnedExpression)
	 * </pre>
	 */
	protected void sequence_AssumeStatement(ISerializationContext context, AssumeStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     OwnedExpression returns EnumLitExpr
	 *     SlangExpression returns EnumLitExpr
	 *     ImpliesExpression returns EnumLitExpr
	 *     ImpliesExpression.ImpliesExpr_1_0 returns EnumLitExpr
	 *     OrExpression returns EnumLitExpr
	 *     OrExpression.OrExpr_1_0 returns EnumLitExpr
	 *     AndExpression returns EnumLitExpr
	 *     AndExpression.AndExpr_1_0 returns EnumLitExpr
	 *     EqualNotExpression returns EnumLitExpr
	 *     EqualNotExpression.EqualNotExpr_1_0 returns EnumLitExpr
	 *     LtGtExpression returns EnumLitExpr
	 *     LtGtExpression.LtGtExpr_1_0 returns EnumLitExpr
	 *     ColonExpression returns EnumLitExpr
	 *     ColonExpression.ColonExpr_1_0 returns EnumLitExpr
	 *     PlusMinusExpression returns EnumLitExpr
	 *     PlusMinusExpression.PlusMinusExpr_1_0 returns EnumLitExpr
	 *     MultiplicativeExpression returns EnumLitExpr
	 *     MultiplicativeExpression.MultiplicativeExpr_1_0 returns EnumLitExpr
	 *     UnaryExpression returns EnumLitExpr
	 *     PrimaryExpr returns EnumLitExpr
	 *     BaseExpr returns EnumLitExpr
	 *
	 * Constraint:
	 *     (enumType=[DataClassifier|QCLREF] value=[StringLiteral|ID])
	 * </pre>
	 */
	protected void sequence_BaseExpr(ISerializationContext context, EnumLitExpr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.ENUM_LIT_EXPR__ENUM_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.ENUM_LIT_EXPR__ENUM_TYPE));
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.ENUM_LIT_EXPR__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.ENUM_LIT_EXPR__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBaseExprAccess().getEnumTypeDataClassifierQCLREFParserRuleCall_7_0_1_0_1(), semanticObject.eGet(GumboPackage.Literals.ENUM_LIT_EXPR__ENUM_TYPE, false));
		feeder.accept(grammarAccess.getBaseExprAccess().getValueStringLiteralIDTerminalRuleCall_7_1_0_1(), semanticObject.eGet(GumboPackage.Literals.ENUM_LIT_EXPR__VALUE, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     OwnedExpression returns HasEventExpr
	 *     SlangExpression returns HasEventExpr
	 *     ImpliesExpression returns HasEventExpr
	 *     ImpliesExpression.ImpliesExpr_1_0 returns HasEventExpr
	 *     OrExpression returns HasEventExpr
	 *     OrExpression.OrExpr_1_0 returns HasEventExpr
	 *     AndExpression returns HasEventExpr
	 *     AndExpression.AndExpr_1_0 returns HasEventExpr
	 *     EqualNotExpression returns HasEventExpr
	 *     EqualNotExpression.EqualNotExpr_1_0 returns HasEventExpr
	 *     LtGtExpression returns HasEventExpr
	 *     LtGtExpression.LtGtExpr_1_0 returns HasEventExpr
	 *     ColonExpression returns HasEventExpr
	 *     ColonExpression.ColonExpr_1_0 returns HasEventExpr
	 *     PlusMinusExpression returns HasEventExpr
	 *     PlusMinusExpression.PlusMinusExpr_1_0 returns HasEventExpr
	 *     MultiplicativeExpression returns HasEventExpr
	 *     MultiplicativeExpression.MultiplicativeExpr_1_0 returns HasEventExpr
	 *     UnaryExpression returns HasEventExpr
	 *     PrimaryExpr returns HasEventExpr
	 *     BaseExpr returns HasEventExpr
	 *
	 * Constraint:
	 *     eventPort=[Port|ID]
	 * </pre>
	 */
	protected void sequence_BaseExpr(ISerializationContext context, HasEventExpr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.HAS_EVENT_EXPR__EVENT_PORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.HAS_EVENT_EXPR__EVENT_PORT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBaseExprAccess().getEventPortPortIDTerminalRuleCall_6_1_0_1(), semanticObject.eGet(GumboPackage.Literals.HAS_EVENT_EXPR__EVENT_PORT, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     OwnedExpression returns InStateExpr
	 *     SlangExpression returns InStateExpr
	 *     ImpliesExpression returns InStateExpr
	 *     ImpliesExpression.ImpliesExpr_1_0 returns InStateExpr
	 *     OrExpression returns InStateExpr
	 *     OrExpression.OrExpr_1_0 returns InStateExpr
	 *     AndExpression returns InStateExpr
	 *     AndExpression.AndExpr_1_0 returns InStateExpr
	 *     EqualNotExpression returns InStateExpr
	 *     EqualNotExpression.EqualNotExpr_1_0 returns InStateExpr
	 *     LtGtExpression returns InStateExpr
	 *     LtGtExpression.LtGtExpr_1_0 returns InStateExpr
	 *     ColonExpression returns InStateExpr
	 *     ColonExpression.ColonExpr_1_0 returns InStateExpr
	 *     PlusMinusExpression returns InStateExpr
	 *     PlusMinusExpression.PlusMinusExpr_1_0 returns InStateExpr
	 *     MultiplicativeExpression returns InStateExpr
	 *     MultiplicativeExpression.MultiplicativeExpr_1_0 returns InStateExpr
	 *     UnaryExpression returns InStateExpr
	 *     PrimaryExpr returns InStateExpr
	 *     BaseExpr returns InStateExpr
	 *
	 * Constraint:
	 *     stateVar=[StateVarDecl|ID]
	 * </pre>
	 */
	protected void sequence_BaseExpr(ISerializationContext context, InStateExpr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.IN_STATE_EXPR__STATE_VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.IN_STATE_EXPR__STATE_VAR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBaseExprAccess().getStateVarStateVarDeclIDTerminalRuleCall_2_1_0_1(), semanticObject.eGet(GumboPackage.Literals.IN_STATE_EXPR__STATE_VAR, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     OwnedExpression returns MaySendExpr
	 *     SlangExpression returns MaySendExpr
	 *     ImpliesExpression returns MaySendExpr
	 *     ImpliesExpression.ImpliesExpr_1_0 returns MaySendExpr
	 *     OrExpression returns MaySendExpr
	 *     OrExpression.OrExpr_1_0 returns MaySendExpr
	 *     AndExpression returns MaySendExpr
	 *     AndExpression.AndExpr_1_0 returns MaySendExpr
	 *     EqualNotExpression returns MaySendExpr
	 *     EqualNotExpression.EqualNotExpr_1_0 returns MaySendExpr
	 *     LtGtExpression returns MaySendExpr
	 *     LtGtExpression.LtGtExpr_1_0 returns MaySendExpr
	 *     ColonExpression returns MaySendExpr
	 *     ColonExpression.ColonExpr_1_0 returns MaySendExpr
	 *     PlusMinusExpression returns MaySendExpr
	 *     PlusMinusExpression.PlusMinusExpr_1_0 returns MaySendExpr
	 *     MultiplicativeExpression returns MaySendExpr
	 *     MultiplicativeExpression.MultiplicativeExpr_1_0 returns MaySendExpr
	 *     UnaryExpression returns MaySendExpr
	 *     PrimaryExpr returns MaySendExpr
	 *     BaseExpr returns MaySendExpr
	 *
	 * Constraint:
	 *     (eventPort=[Port|ID] value=OwnedExpression?)
	 * </pre>
	 */
	protected void sequence_BaseExpr(ISerializationContext context, MaySendExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     OwnedExpression returns MustSendExpr
	 *     SlangExpression returns MustSendExpr
	 *     ImpliesExpression returns MustSendExpr
	 *     ImpliesExpression.ImpliesExpr_1_0 returns MustSendExpr
	 *     OrExpression returns MustSendExpr
	 *     OrExpression.OrExpr_1_0 returns MustSendExpr
	 *     AndExpression returns MustSendExpr
	 *     AndExpression.AndExpr_1_0 returns MustSendExpr
	 *     EqualNotExpression returns MustSendExpr
	 *     EqualNotExpression.EqualNotExpr_1_0 returns MustSendExpr
	 *     LtGtExpression returns MustSendExpr
	 *     LtGtExpression.LtGtExpr_1_0 returns MustSendExpr
	 *     ColonExpression returns MustSendExpr
	 *     ColonExpression.ColonExpr_1_0 returns MustSendExpr
	 *     PlusMinusExpression returns MustSendExpr
	 *     PlusMinusExpression.PlusMinusExpr_1_0 returns MustSendExpr
	 *     MultiplicativeExpression returns MustSendExpr
	 *     MultiplicativeExpression.MultiplicativeExpr_1_0 returns MustSendExpr
	 *     UnaryExpression returns MustSendExpr
	 *     PrimaryExpr returns MustSendExpr
	 *     BaseExpr returns MustSendExpr
	 *
	 * Constraint:
	 *     (eventPort=[Port|ID] value=OwnedExpression?)
	 * </pre>
	 */
	protected void sequence_BaseExpr(ISerializationContext context, MustSendExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     OwnedExpression returns NoSendExpr
	 *     SlangExpression returns NoSendExpr
	 *     ImpliesExpression returns NoSendExpr
	 *     ImpliesExpression.ImpliesExpr_1_0 returns NoSendExpr
	 *     OrExpression returns NoSendExpr
	 *     OrExpression.OrExpr_1_0 returns NoSendExpr
	 *     AndExpression returns NoSendExpr
	 *     AndExpression.AndExpr_1_0 returns NoSendExpr
	 *     EqualNotExpression returns NoSendExpr
	 *     EqualNotExpression.EqualNotExpr_1_0 returns NoSendExpr
	 *     LtGtExpression returns NoSendExpr
	 *     LtGtExpression.LtGtExpr_1_0 returns NoSendExpr
	 *     ColonExpression returns NoSendExpr
	 *     ColonExpression.ColonExpr_1_0 returns NoSendExpr
	 *     PlusMinusExpression returns NoSendExpr
	 *     PlusMinusExpression.PlusMinusExpr_1_0 returns NoSendExpr
	 *     MultiplicativeExpression returns NoSendExpr
	 *     MultiplicativeExpression.MultiplicativeExpr_1_0 returns NoSendExpr
	 *     UnaryExpression returns NoSendExpr
	 *     PrimaryExpr returns NoSendExpr
	 *     BaseExpr returns NoSendExpr
	 *
	 * Constraint:
	 *     eventPort=[Port|ID]
	 * </pre>
	 */
	protected void sequence_BaseExpr(ISerializationContext context, NoSendExpr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.NO_SEND_EXPR__EVENT_PORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.NO_SEND_EXPR__EVENT_PORT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBaseExprAccess().getEventPortPortIDTerminalRuleCall_5_1_0_1(), semanticObject.eGet(GumboPackage.Literals.NO_SEND_EXPR__EVENT_PORT, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     OwnedExpression returns ParenExpr
	 *     SlangExpression returns ParenExpr
	 *     ImpliesExpression returns ParenExpr
	 *     ImpliesExpression.ImpliesExpr_1_0 returns ParenExpr
	 *     OrExpression returns ParenExpr
	 *     OrExpression.OrExpr_1_0 returns ParenExpr
	 *     AndExpression returns ParenExpr
	 *     AndExpression.AndExpr_1_0 returns ParenExpr
	 *     EqualNotExpression returns ParenExpr
	 *     EqualNotExpression.EqualNotExpr_1_0 returns ParenExpr
	 *     LtGtExpression returns ParenExpr
	 *     LtGtExpression.LtGtExpr_1_0 returns ParenExpr
	 *     ColonExpression returns ParenExpr
	 *     ColonExpression.ColonExpr_1_0 returns ParenExpr
	 *     PlusMinusExpression returns ParenExpr
	 *     PlusMinusExpression.PlusMinusExpr_1_0 returns ParenExpr
	 *     MultiplicativeExpression returns ParenExpr
	 *     MultiplicativeExpression.MultiplicativeExpr_1_0 returns ParenExpr
	 *     UnaryExpression returns ParenExpr
	 *     PrimaryExpr returns ParenExpr
	 *     BaseExpr returns ParenExpr
	 *
	 * Constraint:
	 *     exp=OwnedExpression
	 * </pre>
	 */
	protected void sequence_BaseExpr(ISerializationContext context, ParenExpr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.PAREN_EXPR__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.PAREN_EXPR__EXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBaseExprAccess().getExpOwnedExpressionParserRuleCall_9_2_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     OwnedExpression returns SlangBlockTerm
	 *     SlangExpression returns SlangBlockTerm
	 *     ImpliesExpression returns SlangBlockTerm
	 *     ImpliesExpression.ImpliesExpr_1_0 returns SlangBlockTerm
	 *     OrExpression returns SlangBlockTerm
	 *     OrExpression.OrExpr_1_0 returns SlangBlockTerm
	 *     AndExpression returns SlangBlockTerm
	 *     AndExpression.AndExpr_1_0 returns SlangBlockTerm
	 *     EqualNotExpression returns SlangBlockTerm
	 *     EqualNotExpression.EqualNotExpr_1_0 returns SlangBlockTerm
	 *     LtGtExpression returns SlangBlockTerm
	 *     LtGtExpression.LtGtExpr_1_0 returns SlangBlockTerm
	 *     ColonExpression returns SlangBlockTerm
	 *     ColonExpression.ColonExpr_1_0 returns SlangBlockTerm
	 *     PlusMinusExpression returns SlangBlockTerm
	 *     PlusMinusExpression.PlusMinusExpr_1_0 returns SlangBlockTerm
	 *     MultiplicativeExpression returns SlangBlockTerm
	 *     MultiplicativeExpression.MultiplicativeExpr_1_0 returns SlangBlockTerm
	 *     UnaryExpression returns SlangBlockTerm
	 *     PrimaryExpr returns SlangBlockTerm
	 *     BaseExpr returns SlangBlockTerm
	 *
	 * Constraint:
	 *     ((p=SlangParams? e=OwnedExpression) | (stmt+=SlangStmt* r=SlangRet?))
	 * </pre>
	 */
	protected void sequence_BaseExpr(ISerializationContext context, SlangBlockTerm semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     OwnedExpression returns SlangForTerm
	 *     SlangExpression returns SlangForTerm
	 *     ImpliesExpression returns SlangForTerm
	 *     ImpliesExpression.ImpliesExpr_1_0 returns SlangForTerm
	 *     OrExpression returns SlangForTerm
	 *     OrExpression.OrExpr_1_0 returns SlangForTerm
	 *     AndExpression returns SlangForTerm
	 *     AndExpression.AndExpr_1_0 returns SlangForTerm
	 *     EqualNotExpression returns SlangForTerm
	 *     EqualNotExpression.EqualNotExpr_1_0 returns SlangForTerm
	 *     LtGtExpression returns SlangForTerm
	 *     LtGtExpression.LtGtExpr_1_0 returns SlangForTerm
	 *     ColonExpression returns SlangForTerm
	 *     ColonExpression.ColonExpr_1_0 returns SlangForTerm
	 *     PlusMinusExpression returns SlangForTerm
	 *     PlusMinusExpression.PlusMinusExpr_1_0 returns SlangForTerm
	 *     MultiplicativeExpression returns SlangForTerm
	 *     MultiplicativeExpression.MultiplicativeExpr_1_0 returns SlangForTerm
	 *     UnaryExpression returns SlangForTerm
	 *     PrimaryExpr returns SlangForTerm
	 *     BaseExpr returns SlangForTerm
	 *
	 * Constraint:
	 *     (r+=SlangForRange r+=SlangForRange* (b=SlangBlock | e=OwnedExpression))
	 * </pre>
	 */
	protected void sequence_BaseExpr(ISerializationContext context, SlangForTerm semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     OwnedExpression returns SlangInterpTerm
	 *     SlangExpression returns SlangInterpTerm
	 *     ImpliesExpression returns SlangInterpTerm
	 *     ImpliesExpression.ImpliesExpr_1_0 returns SlangInterpTerm
	 *     OrExpression returns SlangInterpTerm
	 *     OrExpression.OrExpr_1_0 returns SlangInterpTerm
	 *     AndExpression returns SlangInterpTerm
	 *     AndExpression.AndExpr_1_0 returns SlangInterpTerm
	 *     EqualNotExpression returns SlangInterpTerm
	 *     EqualNotExpression.EqualNotExpr_1_0 returns SlangInterpTerm
	 *     LtGtExpression returns SlangInterpTerm
	 *     LtGtExpression.LtGtExpr_1_0 returns SlangInterpTerm
	 *     ColonExpression returns SlangInterpTerm
	 *     ColonExpression.ColonExpr_1_0 returns SlangInterpTerm
	 *     PlusMinusExpression returns SlangInterpTerm
	 *     PlusMinusExpression.PlusMinusExpr_1_0 returns SlangInterpTerm
	 *     MultiplicativeExpression returns SlangInterpTerm
	 *     MultiplicativeExpression.MultiplicativeExpr_1_0 returns SlangInterpTerm
	 *     UnaryExpression returns SlangInterpTerm
	 *     PrimaryExpr returns SlangInterpTerm
	 *     BaseExpr returns SlangInterpTerm
	 *
	 * Constraint:
	 *     i=SlangInterp
	 * </pre>
	 */
	protected void sequence_BaseExpr(ISerializationContext context, SlangInterpTerm semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.SLANG_INTERP_TERM__I) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.SLANG_INTERP_TERM__I));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBaseExprAccess().getISlangInterpParserRuleCall_1_1_0(), semanticObject.getI());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     OwnedExpression returns SlangLitTerm
	 *     SlangExpression returns SlangLitTerm
	 *     ImpliesExpression returns SlangLitTerm
	 *     ImpliesExpression.ImpliesExpr_1_0 returns SlangLitTerm
	 *     OrExpression returns SlangLitTerm
	 *     OrExpression.OrExpr_1_0 returns SlangLitTerm
	 *     AndExpression returns SlangLitTerm
	 *     AndExpression.AndExpr_1_0 returns SlangLitTerm
	 *     EqualNotExpression returns SlangLitTerm
	 *     EqualNotExpression.EqualNotExpr_1_0 returns SlangLitTerm
	 *     LtGtExpression returns SlangLitTerm
	 *     LtGtExpression.LtGtExpr_1_0 returns SlangLitTerm
	 *     ColonExpression returns SlangLitTerm
	 *     ColonExpression.ColonExpr_1_0 returns SlangLitTerm
	 *     PlusMinusExpression returns SlangLitTerm
	 *     PlusMinusExpression.PlusMinusExpr_1_0 returns SlangLitTerm
	 *     MultiplicativeExpression returns SlangLitTerm
	 *     MultiplicativeExpression.MultiplicativeExpr_1_0 returns SlangLitTerm
	 *     UnaryExpression returns SlangLitTerm
	 *     PrimaryExpr returns SlangLitTerm
	 *     BaseExpr returns SlangLitTerm
	 *
	 * Constraint:
	 *     lit=SlangLit
	 * </pre>
	 */
	protected void sequence_BaseExpr(ISerializationContext context, SlangLitTerm semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.SLANG_LIT_TERM__LIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.SLANG_LIT_TERM__LIT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBaseExprAccess().getLitSlangLitParserRuleCall_0_1_0(), semanticObject.getLit());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     CaseStatementClause returns CaseStatementClause
	 *
	 * Constraint:
	 *     (id=ID descriptor=STRING_VALUE? assumeStatement=AnonAssumeStatement? guaranteeStatement=AnonGuaranteeStatement)
	 * </pre>
	 */
	protected void sequence_CaseStatementClause(ISerializationContext context, CaseStatementClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     OwnedExpression returns ColonExpr
	 *     SlangExpression returns ColonExpr
	 *     ImpliesExpression returns ColonExpr
	 *     ImpliesExpression.ImpliesExpr_1_0 returns ColonExpr
	 *     OrExpression returns ColonExpr
	 *     OrExpression.OrExpr_1_0 returns ColonExpr
	 *     AndExpression returns ColonExpr
	 *     AndExpression.AndExpr_1_0 returns ColonExpr
	 *     EqualNotExpression returns ColonExpr
	 *     EqualNotExpression.EqualNotExpr_1_0 returns ColonExpr
	 *     LtGtExpression returns ColonExpr
	 *     LtGtExpression.LtGtExpr_1_0 returns ColonExpr
	 *     ColonExpression returns ColonExpr
	 *     ColonExpression.ColonExpr_1_0 returns ColonExpr
	 *
	 * Constraint:
	 *     (left=ColonExpression_ColonExpr_1_0 op=COLON_OP right=PlusMinusExpression)
	 * </pre>
	 */
	protected void sequence_ColonExpression(ISerializationContext context, ColonExpr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.COLON_EXPR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.COLON_EXPR__LEFT));
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.COLON_EXPR__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.COLON_EXPR__OP));
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.COLON_EXPR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.COLON_EXPR__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getColonExpressionAccess().getColonExprLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getColonExpressionAccess().getOpCOLON_OPTerminalRuleCall_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getColonExpressionAccess().getRightPlusMinusExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Compute returns Compute
	 *
	 * Constraint:
	 *     (
	 *         modifies=SlangModifies? 
	 *         assumes+=AssumeStatement* 
	 *         guarantees+=GuaranteeStatement* 
	 *         cases+=CaseStatementClause* 
	 *         handlers+=HandlerClause* 
	 *         flows+=InfoFlowClause* 
	 *         gumboTables+=GumboTable*
	 *     )
	 * </pre>
	 */
	protected void sequence_Compute(ISerializationContext context, Compute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DataElement returns DataElement
	 *
	 * Constraint:
	 *     dataElement=[DataSubcomponentType|QualifiedName]
	 * </pre>
	 */
	protected void sequence_DataElement(ISerializationContext context, DataElement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.DATA_ELEMENT__DATA_ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.DATA_ELEMENT__DATA_ELEMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDataElementAccess().getDataElementDataSubcomponentTypeQualifiedNameParserRuleCall_0_1(), semanticObject.eGet(GumboPackage.Literals.DATA_ELEMENT__DATA_ELEMENT, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     OwnedExpression returns EqualNotExpr
	 *     SlangExpression returns EqualNotExpr
	 *     ImpliesExpression returns EqualNotExpr
	 *     ImpliesExpression.ImpliesExpr_1_0 returns EqualNotExpr
	 *     OrExpression returns EqualNotExpr
	 *     OrExpression.OrExpr_1_0 returns EqualNotExpr
	 *     AndExpression returns EqualNotExpr
	 *     AndExpression.AndExpr_1_0 returns EqualNotExpr
	 *     EqualNotExpression returns EqualNotExpr
	 *     EqualNotExpression.EqualNotExpr_1_0 returns EqualNotExpr
	 *
	 * Constraint:
	 *     (left=EqualNotExpression_EqualNotExpr_1_0 op=EQUAL_NOT_OPS right=LtGtExpression)
	 * </pre>
	 */
	protected void sequence_EqualNotExpression(ISerializationContext context, EqualNotExpr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.EQUAL_NOT_EXPR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.EQUAL_NOT_EXPR__LEFT));
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.EQUAL_NOT_EXPR__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.EQUAL_NOT_EXPR__OP));
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.EQUAL_NOT_EXPR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.EQUAL_NOT_EXPR__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEqualNotExpressionAccess().getEqualNotExprLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getEqualNotExpressionAccess().getOpEQUAL_NOT_OPSTerminalRuleCall_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getEqualNotExpressionAccess().getRightLtGtExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     OwnedExpression returns F32Obj
	 *     SlangExpression returns F32Obj
	 *     ImpliesExpression returns F32Obj
	 *     ImpliesExpression.ImpliesExpr_1_0 returns F32Obj
	 *     OrExpression returns F32Obj
	 *     OrExpression.OrExpr_1_0 returns F32Obj
	 *     AndExpression returns F32Obj
	 *     AndExpression.AndExpr_1_0 returns F32Obj
	 *     EqualNotExpression returns F32Obj
	 *     EqualNotExpression.EqualNotExpr_1_0 returns F32Obj
	 *     LtGtExpression returns F32Obj
	 *     LtGtExpression.LtGtExpr_1_0 returns F32Obj
	 *     ColonExpression returns F32Obj
	 *     ColonExpression.ColonExpr_1_0 returns F32Obj
	 *     PlusMinusExpression returns F32Obj
	 *     PlusMinusExpression.PlusMinusExpr_1_0 returns F32Obj
	 *     MultiplicativeExpression returns F32Obj
	 *     MultiplicativeExpression.MultiplicativeExpr_1_0 returns F32Obj
	 *     UnaryExpression returns F32Obj
	 *     PrimaryExpr returns F32Obj
	 *     BaseExpr returns F32Obj
	 *     FloatObjectExpr returns F32Obj
	 *
	 * Constraint:
	 *     attr=ID
	 * </pre>
	 */
	protected void sequence_FloatObjectExpr(ISerializationContext context, F32Obj semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.F32_OBJ__ATTR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.F32_OBJ__ATTR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFloatObjectExprAccess().getAttrIDTerminalRuleCall_0_3_0(), semanticObject.getAttr());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     OwnedExpression returns F64Obj
	 *     SlangExpression returns F64Obj
	 *     ImpliesExpression returns F64Obj
	 *     ImpliesExpression.ImpliesExpr_1_0 returns F64Obj
	 *     OrExpression returns F64Obj
	 *     OrExpression.OrExpr_1_0 returns F64Obj
	 *     AndExpression returns F64Obj
	 *     AndExpression.AndExpr_1_0 returns F64Obj
	 *     EqualNotExpression returns F64Obj
	 *     EqualNotExpression.EqualNotExpr_1_0 returns F64Obj
	 *     LtGtExpression returns F64Obj
	 *     LtGtExpression.LtGtExpr_1_0 returns F64Obj
	 *     ColonExpression returns F64Obj
	 *     ColonExpression.ColonExpr_1_0 returns F64Obj
	 *     PlusMinusExpression returns F64Obj
	 *     PlusMinusExpression.PlusMinusExpr_1_0 returns F64Obj
	 *     MultiplicativeExpression returns F64Obj
	 *     MultiplicativeExpression.MultiplicativeExpr_1_0 returns F64Obj
	 *     UnaryExpression returns F64Obj
	 *     PrimaryExpr returns F64Obj
	 *     BaseExpr returns F64Obj
	 *     FloatObjectExpr returns F64Obj
	 *
	 * Constraint:
	 *     attr=ID
	 * </pre>
	 */
	protected void sequence_FloatObjectExpr(ISerializationContext context, F64Obj semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.F64_OBJ__ATTR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.F64_OBJ__ATTR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFloatObjectExprAccess().getAttrIDTerminalRuleCall_1_3_0(), semanticObject.getAttr());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Functions returns Functions
	 *
	 * Constraint:
	 *     specs+=FuncSpec+
	 * </pre>
	 */
	protected void sequence_Functions(ISerializationContext context, Functions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SpecStatement returns GuaranteeStatement
	 *     GuaranteeStatement returns GuaranteeStatement
	 *
	 * Constraint:
	 *     (id=ID descriptor=STRING_VALUE? expr=OwnedExpression)
	 * </pre>
	 */
	protected void sequence_GuaranteeStatement(ISerializationContext context, GuaranteeStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     AnnexLibrary returns GumboLibrary
	 *     GumboLibrary returns GumboLibrary
	 *
	 * Constraint:
	 *     functions=Functions?
	 * </pre>
	 */
	protected void sequence_GumboLibrary(ISerializationContext context, GumboLibrary semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     AnnexSubclause returns GumboSubclause
	 *     GumboSubclause returns GumboSubclause
	 *
	 * Constraint:
	 *     specs=SpecSection
	 * </pre>
	 */
	protected void sequence_GumboSubclause(ISerializationContext context, GumboSubclause semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.GUMBO_SUBCLAUSE__SPECS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.GUMBO_SUBCLAUSE__SPECS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGumboSubclauseAccess().getSpecsSpecSectionParserRuleCall_1_0(), semanticObject.getSpecs());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     GumboTable returns GumboTable
	 *
	 * Constraint:
	 *     table=NormalTable
	 * </pre>
	 */
	protected void sequence_GumboTable(ISerializationContext context, GumboTable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.GUMBO_TABLE__TABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.GUMBO_TABLE__TABLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGumboTableAccess().getTableNormalTableParserRuleCall_1_0(), semanticObject.getTable());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     HandlerClause returns HandlerClause
	 *
	 * Constraint:
	 *     (id=[Port|ID] modifies=SlangModifies? assumes+=AssumeStatement* guarantees+=GuaranteeStatement* cases+=CaseStatementClause*)
	 * </pre>
	 */
	protected void sequence_HandlerClause(ISerializationContext context, HandlerClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     OwnedExpression returns ImpliesExpr
	 *     SlangExpression returns ImpliesExpr
	 *     ImpliesExpression returns ImpliesExpr
	 *     ImpliesExpression.ImpliesExpr_1_0 returns ImpliesExpr
	 *
	 * Constraint:
	 *     (left=ImpliesExpression_ImpliesExpr_1_0 op=ImpliesOps right=OrExpression)
	 * </pre>
	 */
	protected void sequence_ImpliesExpression(ISerializationContext context, ImpliesExpr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.IMPLIES_EXPR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.IMPLIES_EXPR__LEFT));
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.IMPLIES_EXPR__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.IMPLIES_EXPR__OP));
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.IMPLIES_EXPR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.IMPLIES_EXPR__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImpliesExpressionAccess().getImpliesExprLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getImpliesExpressionAccess().getOpImpliesOpsParserRuleCall_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getImpliesExpressionAccess().getRightOrExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     InfoFlowClause returns InfoFlowClause
	 *
	 * Constraint:
	 *     (
	 *         id=ID 
	 *         descriptor=STRING_VALUE? 
	 *         (fromPortOrStateVar+=[EObject|ID] fromPortOrStateVar+=[EObject|ID]*)? 
	 *         (toPortOrStateVar+=[EObject|ID] toPortOrStateVar+=[EObject|ID]*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_InfoFlowClause(ISerializationContext context, InfoFlowClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     InitializeSpecStatement returns InitializeSpecStatement
	 *
	 * Constraint:
	 *     guaranteeStatement=GuaranteeStatement
	 * </pre>
	 */
	protected void sequence_InitializeSpecStatement(ISerializationContext context, InitializeSpecStatement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.INITIALIZE_SPEC_STATEMENT__GUARANTEE_STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.INITIALIZE_SPEC_STATEMENT__GUARANTEE_STATEMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInitializeSpecStatementAccess().getGuaranteeStatementGuaranteeStatementParserRuleCall_0(), semanticObject.getGuaranteeStatement());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Initialize returns Initialize
	 *
	 * Constraint:
	 *     (modifies=SlangModifies? specs+=InitializeSpecStatement* flows+=InfoFlowClause*)
	 * </pre>
	 */
	protected void sequence_Initialize(ISerializationContext context, Initialize semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Integration returns Integration
	 *
	 * Constraint:
	 *     specs+=SpecStatement+
	 * </pre>
	 */
	protected void sequence_Integration(ISerializationContext context, Integration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     InvSpec returns InvSpec
	 *
	 * Constraint:
	 *     (id=ID descriptor=STRING_VALUE? expr=OwnedExpression)
	 * </pre>
	 */
	protected void sequence_InvSpec(ISerializationContext context, InvSpec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Invariants returns Invariants
	 *
	 * Constraint:
	 *     specs+=InvSpec+
	 * </pre>
	 */
	protected void sequence_Invariants(ISerializationContext context, Invariants semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     OwnedExpression returns LtGtExpr
	 *     SlangExpression returns LtGtExpr
	 *     ImpliesExpression returns LtGtExpr
	 *     ImpliesExpression.ImpliesExpr_1_0 returns LtGtExpr
	 *     OrExpression returns LtGtExpr
	 *     OrExpression.OrExpr_1_0 returns LtGtExpr
	 *     AndExpression returns LtGtExpr
	 *     AndExpression.AndExpr_1_0 returns LtGtExpr
	 *     EqualNotExpression returns LtGtExpr
	 *     EqualNotExpression.EqualNotExpr_1_0 returns LtGtExpr
	 *     LtGtExpression returns LtGtExpr
	 *     LtGtExpression.LtGtExpr_1_0 returns LtGtExpr
	 *
	 * Constraint:
	 *     (left=LtGtExpression_LtGtExpr_1_0 op=LT_GT_OPS right=ColonExpression)
	 * </pre>
	 */
	protected void sequence_LtGtExpression(ISerializationContext context, LtGtExpr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.LT_GT_EXPR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.LT_GT_EXPR__LEFT));
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.LT_GT_EXPR__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.LT_GT_EXPR__OP));
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.LT_GT_EXPR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.LT_GT_EXPR__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLtGtExpressionAccess().getLtGtExprLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getLtGtExpressionAccess().getOpLT_GT_OPSTerminalRuleCall_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getLtGtExpressionAccess().getRightColonExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Postfix returns MemberAccess
	 *     MemberAccess returns MemberAccess
	 *
	 * Constraint:
	 *     field=ID
	 * </pre>
	 */
	protected void sequence_MemberAccess(ISerializationContext context, MemberAccess semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.MEMBER_ACCESS__FIELD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.MEMBER_ACCESS__FIELD));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMemberAccessAccess().getFieldIDTerminalRuleCall_1_0(), semanticObject.getField());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     OwnedExpression returns MultiplicativeExpr
	 *     SlangExpression returns MultiplicativeExpr
	 *     ImpliesExpression returns MultiplicativeExpr
	 *     ImpliesExpression.ImpliesExpr_1_0 returns MultiplicativeExpr
	 *     OrExpression returns MultiplicativeExpr
	 *     OrExpression.OrExpr_1_0 returns MultiplicativeExpr
	 *     AndExpression returns MultiplicativeExpr
	 *     AndExpression.AndExpr_1_0 returns MultiplicativeExpr
	 *     EqualNotExpression returns MultiplicativeExpr
	 *     EqualNotExpression.EqualNotExpr_1_0 returns MultiplicativeExpr
	 *     LtGtExpression returns MultiplicativeExpr
	 *     LtGtExpression.LtGtExpr_1_0 returns MultiplicativeExpr
	 *     ColonExpression returns MultiplicativeExpr
	 *     ColonExpression.ColonExpr_1_0 returns MultiplicativeExpr
	 *     PlusMinusExpression returns MultiplicativeExpr
	 *     PlusMinusExpression.PlusMinusExpr_1_0 returns MultiplicativeExpr
	 *     MultiplicativeExpression returns MultiplicativeExpr
	 *     MultiplicativeExpression.MultiplicativeExpr_1_0 returns MultiplicativeExpr
	 *
	 * Constraint:
	 *     (left=MultiplicativeExpression_MultiplicativeExpr_1_0 op=MultiplicativeOp right=UnaryExpression)
	 * </pre>
	 */
	protected void sequence_MultiplicativeExpression(ISerializationContext context, MultiplicativeExpr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.MULTIPLICATIVE_EXPR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.MULTIPLICATIVE_EXPR__LEFT));
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.MULTIPLICATIVE_EXPR__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.MULTIPLICATIVE_EXPR__OP));
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.MULTIPLICATIVE_EXPR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.MULTIPLICATIVE_EXPR__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExprLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMultiplicativeExpressionAccess().getOpMultiplicativeOpParserRuleCall_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getMultiplicativeExpressionAccess().getRightUnaryExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NormalTable returns NormalTable
	 *
	 * Constraint:
	 *     (
	 *         id=ID 
	 *         descriptor=STRING_VALUE? 
	 *         horizontalPredicates+=OwnedExpression* 
	 *         horizontalPredicates+=OwnedExpression 
	 *         (verticalPredicates+=OwnedExpression resultRows+=ResultRow)+
	 *     )
	 * </pre>
	 */
	protected void sequence_NormalTable(ISerializationContext context, NormalTable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     OwnedExpression returns OrExpr
	 *     SlangExpression returns OrExpr
	 *     ImpliesExpression returns OrExpr
	 *     ImpliesExpression.ImpliesExpr_1_0 returns OrExpr
	 *     OrExpression returns OrExpr
	 *     OrExpression.OrExpr_1_0 returns OrExpr
	 *
	 * Constraint:
	 *     (left=OrExpression_OrExpr_1_0 op=OR_OPS right=AndExpression)
	 * </pre>
	 */
	protected void sequence_OrExpression(ISerializationContext context, OrExpr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.OR_EXPR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.OR_EXPR__LEFT));
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.OR_EXPR__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.OR_EXPR__OP));
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.OR_EXPR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.OR_EXPR__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOrExpressionAccess().getOrExprLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getOrExpressionAccess().getOpOR_OPSTerminalRuleCall_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     OtherDataRef returns OtherDataRef
	 *
	 * Constraint:
	 *     (namedElement=[NamedElement|ID] arrayRange+=ArrayRange* path=OtherDataRef?)
	 * </pre>
	 */
	protected void sequence_OtherDataRef(ISerializationContext context, OtherDataRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     OwnedExpression returns PlusMinusExpr
	 *     SlangExpression returns PlusMinusExpr
	 *     ImpliesExpression returns PlusMinusExpr
	 *     ImpliesExpression.ImpliesExpr_1_0 returns PlusMinusExpr
	 *     OrExpression returns PlusMinusExpr
	 *     OrExpression.OrExpr_1_0 returns PlusMinusExpr
	 *     AndExpression returns PlusMinusExpr
	 *     AndExpression.AndExpr_1_0 returns PlusMinusExpr
	 *     EqualNotExpression returns PlusMinusExpr
	 *     EqualNotExpression.EqualNotExpr_1_0 returns PlusMinusExpr
	 *     LtGtExpression returns PlusMinusExpr
	 *     LtGtExpression.LtGtExpr_1_0 returns PlusMinusExpr
	 *     ColonExpression returns PlusMinusExpr
	 *     ColonExpression.ColonExpr_1_0 returns PlusMinusExpr
	 *     PlusMinusExpression returns PlusMinusExpr
	 *     PlusMinusExpression.PlusMinusExpr_1_0 returns PlusMinusExpr
	 *
	 * Constraint:
	 *     (left=PlusMinusExpression_PlusMinusExpr_1_0 op=PlusMinusOps right=MultiplicativeExpression)
	 * </pre>
	 */
	protected void sequence_PlusMinusExpression(ISerializationContext context, PlusMinusExpr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.PLUS_MINUS_EXPR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.PLUS_MINUS_EXPR__LEFT));
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.PLUS_MINUS_EXPR__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.PLUS_MINUS_EXPR__OP));
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.PLUS_MINUS_EXPR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.PLUS_MINUS_EXPR__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPlusMinusExpressionAccess().getPlusMinusExprLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getPlusMinusExpressionAccess().getOpPlusMinusOpsParserRuleCall_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getPlusMinusExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     OwnedExpression returns PostFixExpr
	 *     SlangExpression returns PostFixExpr
	 *     ImpliesExpression returns PostFixExpr
	 *     ImpliesExpression.ImpliesExpr_1_0 returns PostFixExpr
	 *     OrExpression returns PostFixExpr
	 *     OrExpression.OrExpr_1_0 returns PostFixExpr
	 *     AndExpression returns PostFixExpr
	 *     AndExpression.AndExpr_1_0 returns PostFixExpr
	 *     EqualNotExpression returns PostFixExpr
	 *     EqualNotExpression.EqualNotExpr_1_0 returns PostFixExpr
	 *     LtGtExpression returns PostFixExpr
	 *     LtGtExpression.LtGtExpr_1_0 returns PostFixExpr
	 *     ColonExpression returns PostFixExpr
	 *     ColonExpression.ColonExpr_1_0 returns PostFixExpr
	 *     PlusMinusExpression returns PostFixExpr
	 *     PlusMinusExpression.PlusMinusExpr_1_0 returns PostFixExpr
	 *     MultiplicativeExpression returns PostFixExpr
	 *     MultiplicativeExpression.MultiplicativeExpr_1_0 returns PostFixExpr
	 *     UnaryExpression returns PostFixExpr
	 *     PrimaryExpr returns PostFixExpr
	 *
	 * Constraint:
	 *     (baseExp=AccessibleBaseExpr posts+=Postfix*)
	 * </pre>
	 */
	protected void sequence_PrimaryExpr(ISerializationContext context, PostFixExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     QuantParam returns QuantParam
	 *
	 * Constraint:
	 *     (name=ID | (name=ID typeName=SlangType))
	 * </pre>
	 */
	protected void sequence_QuantParam(ISerializationContext context, QuantParam semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     QuantRange returns QuantRange
	 *
	 * Constraint:
	 *     (lo=OwnedExpression (extent='to' | extent='until') high=OwnedExpression)
	 * </pre>
	 */
	protected void sequence_QuantRange(ISerializationContext context, QuantRange semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ResultRow returns ResultRow
	 *
	 * Constraint:
	 *     (results+=OwnedExpression* results+=OwnedExpression)
	 * </pre>
	 */
	protected void sequence_ResultRow(ISerializationContext context, ResultRow semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangType returns SlangType
	 *     SlangBaseType returns SlangType
	 *
	 * Constraint:
	 *     typeName=[DataSubcomponentType|QualifiedName]
	 * </pre>
	 */
	protected void sequence_SlangBaseType(ISerializationContext context, SlangType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.SLANG_TYPE__TYPE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.SLANG_TYPE__TYPE_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSlangBaseTypeAccess().getTypeNameDataSubcomponentTypeQualifiedNameParserRuleCall_0_1(), semanticObject.eGet(GumboPackage.Literals.SLANG_TYPE__TYPE_NAME, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangElse returns SlangBlock
	 *     SlangBlock returns SlangBlock
	 *
	 * Constraint:
	 *     (stmts+=SlangStmt* r=SlangRet?)
	 * </pre>
	 */
	protected void sequence_SlangBlock(ISerializationContext context, SlangBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangCallArgs returns SlangCallArgs
	 *
	 * Constraint:
	 *     (arg+=OwnedExpression arg+=OwnedExpression*)?
	 * </pre>
	 */
	protected void sequence_SlangCallArgs(ISerializationContext context, SlangCallArgs semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangCallSuffix returns SlangCallSuffix
	 *
	 * Constraint:
	 *     ca=SlangCallArgs
	 * </pre>
	 */
	protected void sequence_SlangCallSuffix(ISerializationContext context, SlangCallSuffix semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.SLANG_CALL_SUFFIX__CA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.SLANG_CALL_SUFFIX__CA));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSlangCallSuffixAccess().getCaSlangCallArgsParserRuleCall_1_0(), semanticObject.getCa());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangCase returns SlangCase
	 *
	 * Constraint:
	 *     (pattern=SlangPattern e=OwnedExpression? s+=SlangStmt*)
	 * </pre>
	 */
	protected void sequence_SlangCase(ISerializationContext context, SlangCase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangDefContract returns SlangDefContract
	 *
	 * Constraint:
	 *     (reads=SlangReads? requires=SlangRequires? modifies=SlangModifies? ensures=SlangEnsures?)
	 * </pre>
	 */
	protected void sequence_SlangDefContract(ISerializationContext context, SlangDefContract semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     FuncSpec returns SlangDefDef
	 *     SlangDefDef returns SlangDefDef
	 *
	 * Constraint:
	 *     (
	 *         name=SlangDefID 
	 *         typeParams=SlangTypeParams? 
	 *         params=SlangDefParams 
	 *         type=SlangType 
	 *         methodContract=SlangDefContract 
	 *         body=OwnedExpression
	 *     )
	 * </pre>
	 */
	protected void sequence_SlangDefDef(ISerializationContext context, SlangDefDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangDefParam returns SlangDefParam
	 *
	 * Constraint:
	 *     (name=ID isMethodDef?='=&gt;'? typeName=SlangType isVarArg?='*'?)
	 * </pre>
	 */
	protected void sequence_SlangDefParam(ISerializationContext context, SlangDefParam semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangDefParams returns SlangDefParams
	 *
	 * Constraint:
	 *     (params+=SlangDefParam params+=SlangDefParam*)
	 * </pre>
	 */
	protected void sequence_SlangDefParams(ISerializationContext context, SlangDefParams semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangElse returns SlangElse
	 *
	 * Constraint:
	 *     (cond=OwnedExpression b=SlangBlock e=SlangElse?)
	 * </pre>
	 */
	protected void sequence_SlangElse(ISerializationContext context, SlangElse semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangEnsures returns SlangEnsures
	 *
	 * Constraint:
	 *     (exprs+=OwnedExpression exprs+=OwnedExpression*)
	 * </pre>
	 */
	protected void sequence_SlangEnsures(ISerializationContext context, SlangEnsures semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     OwnedExpression returns IfElseExp
	 *     SlangExpression returns IfElseExp
	 *
	 * Constraint:
	 *     (ifCond=ImpliesExpression thenExpr=OwnedExpression elseExpr=OwnedExpression)
	 * </pre>
	 */
	protected void sequence_SlangExpression(ISerializationContext context, IfElseExp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.IF_ELSE_EXP__IF_COND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.IF_ELSE_EXP__IF_COND));
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.IF_ELSE_EXP__THEN_EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.IF_ELSE_EXP__THEN_EXPR));
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.IF_ELSE_EXP__ELSE_EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.IF_ELSE_EXP__ELSE_EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSlangExpressionAccess().getIfCondImpliesExpressionParserRuleCall_1_3_0(), semanticObject.getIfCond());
		feeder.accept(grammarAccess.getSlangExpressionAccess().getThenExprOwnedExpressionParserRuleCall_1_5_0(), semanticObject.getThenExpr());
		feeder.accept(grammarAccess.getSlangExpressionAccess().getElseExprOwnedExpressionParserRuleCall_1_7_0(), semanticObject.getElseExpr());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     OwnedExpression returns QuantifiedExp
	 *     SlangExpression returns QuantifiedExp
	 *
	 * Constraint:
	 *     (
	 *         (quantifier='All' | quantifier='∀' | quantifier='Exists' | quantifier='∃') 
	 *         quantRange=QuantRange 
	 *         quantParam=QuantParam 
	 *         quantifiedExpr=OwnedExpression
	 *     )
	 * </pre>
	 */
	protected void sequence_SlangExpression(ISerializationContext context, QuantifiedExp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangForRange returns SlangForRange
	 *
	 * Constraint:
	 *     (e=OwnedExpression (upper=OwnedExpression step=OwnedExpression?)?)
	 * </pre>
	 */
	protected void sequence_SlangForRange(ISerializationContext context, SlangForRange semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangInterp returns SlangLiteralInterp
	 *
	 * Constraint:
	 *     sli=SLI
	 * </pre>
	 */
	protected void sequence_SlangInterp(ISerializationContext context, SlangLiteralInterp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.SLANG_LITERAL_INTERP__SLI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.SLANG_LITERAL_INTERP__SLI));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSlangInterpAccess().getSliSLITerminalRuleCall_1_0(), semanticObject.getSli());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangInvariant returns SlangInvariant
	 *
	 * Constraint:
	 *     (exprs+=OwnedExpression exprs+=OwnedExpression*)
	 * </pre>
	 */
	protected void sequence_SlangInvariant(ISerializationContext context, SlangInvariant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangLit returns BinLit
	 *
	 * Constraint:
	 *     value=BIN
	 * </pre>
	 */
	protected void sequence_SlangLit(ISerializationContext context, BinLit semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.SLANG_LIT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.SLANG_LIT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSlangLitAccess().getValueBINTerminalRuleCall_3_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangLit returns BooleanLit
	 *
	 * Constraint:
	 *     (value='T' | value='F' | value='true' | value='false')
	 * </pre>
	 */
	protected void sequence_SlangLit(ISerializationContext context, BooleanLit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangLit returns F32Lit
	 *
	 * Constraint:
	 *     value=F32_LIT
	 * </pre>
	 */
	protected void sequence_SlangLit(ISerializationContext context, F32Lit semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.SLANG_LIT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.SLANG_LIT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSlangLitAccess().getValueF32_LITTerminalRuleCall_4_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangLit returns F64Lit
	 *
	 * Constraint:
	 *     (value=F64_LIT | value=REAL_LIT)
	 * </pre>
	 */
	protected void sequence_SlangLit(ISerializationContext context, F64Lit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangLit returns HexLit
	 *
	 * Constraint:
	 *     value=HEX
	 * </pre>
	 */
	protected void sequence_SlangLit(ISerializationContext context, HexLit semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.SLANG_LIT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.SLANG_LIT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSlangLitAccess().getValueHEXTerminalRuleCall_2_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangLit returns IntegerLit
	 *
	 * Constraint:
	 *     value=INTEGER_LIT
	 * </pre>
	 */
	protected void sequence_SlangLit(ISerializationContext context, IntegerLit semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.SLANG_LIT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.SLANG_LIT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSlangLitAccess().getValueINTEGER_LITTerminalRuleCall_1_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangLit returns SlangStringLit
	 *
	 * Constraint:
	 *     value=STRING_VALUE
	 * </pre>
	 */
	protected void sequence_SlangLit(ISerializationContext context, SlangStringLit semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.SLANG_LIT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.SLANG_LIT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSlangLitAccess().getValueSTRING_VALUETerminalRuleCall_6_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangLoopContract returns SlangLoopContract
	 *
	 * Constraint:
	 *     (inv=SlangInvariant? mod=SlangModifies?)
	 * </pre>
	 */
	protected void sequence_SlangLoopContract(ISerializationContext context, SlangLoopContract semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangModifies returns SlangModifies
	 *
	 * Constraint:
	 *     (exprs+=OwnedExpression exprs+=OwnedExpression*)
	 * </pre>
	 */
	protected void sequence_SlangModifies(ISerializationContext context, SlangModifies semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangParam returns SlangParam
	 *
	 * Constraint:
	 *     (name=ID typeName=SlangType)
	 * </pre>
	 */
	protected void sequence_SlangParam(ISerializationContext context, SlangParam semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.SLANG_PARAM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.SLANG_PARAM__NAME));
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.SLANG_PARAM__TYPE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.SLANG_PARAM__TYPE_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSlangParamAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSlangParamAccess().getTypeNameSlangTypeParserRuleCall_4_0(), semanticObject.getTypeName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangParams returns SlangParams
	 *
	 * Constraint:
	 *     (params+=SlangParam params+=SlangParam?)
	 * </pre>
	 */
	protected void sequence_SlangParams(ISerializationContext context, SlangParams semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangPattern returns SlangPattern
	 *
	 * Constraint:
	 *     ((patterns+=SlangTPattern patterns+=SlangTPattern*) | (patterns+=SlangTPattern patterns+=SlangTPattern*))?
	 * </pre>
	 */
	protected void sequence_SlangPattern(ISerializationContext context, SlangPattern semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangVarDef returns SlangPattern
	 *
	 * Constraint:
	 *     (
	 *         ((patterns+=SlangTPattern patterns+=SlangTPattern*) | (patterns+=SlangTPattern patterns+=SlangTPattern*))? 
	 *         typeName=SlangType? 
	 *         init=OwnedExpression
	 *     )
	 * </pre>
	 */
	protected void sequence_SlangPattern_SlangVarDef(ISerializationContext context, SlangPattern semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangReads returns SlangReads
	 *
	 * Constraint:
	 *     (exprs+=OwnedExpression exprs+=OwnedExpression*)
	 * </pre>
	 */
	protected void sequence_SlangReads(ISerializationContext context, SlangReads semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangRequires returns SlangRequires
	 *
	 * Constraint:
	 *     (exprs+=OwnedExpression exprs+=OwnedExpression*)
	 * </pre>
	 */
	protected void sequence_SlangRequires(ISerializationContext context, SlangRequires semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangRet returns SlangRet
	 *
	 * Constraint:
	 *     e=OwnedExpression?
	 * </pre>
	 */
	protected void sequence_SlangRet(ISerializationContext context, SlangRet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangStmt returns SlangAssertStmt
	 *
	 * Constraint:
	 *     e=OwnedExpression
	 * </pre>
	 */
	protected void sequence_SlangStmt(ISerializationContext context, SlangAssertStmt semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.SLANG_ASSERT_STMT__E) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.SLANG_ASSERT_STMT__E));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSlangStmtAccess().getEOwnedExpressionParserRuleCall_6_2_0(), semanticObject.getE());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangStmt returns SlangAssumeStmt
	 *
	 * Constraint:
	 *     e=OwnedExpression
	 * </pre>
	 */
	protected void sequence_SlangStmt(ISerializationContext context, SlangAssumeStmt semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.SLANG_ASSUME_STMT__E) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.SLANG_ASSUME_STMT__E));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSlangStmtAccess().getEOwnedExpressionParserRuleCall_5_2_0(), semanticObject.getE());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangStmt returns SlangDoStmt
	 *
	 * Constraint:
	 *     e=OwnedExpression
	 * </pre>
	 */
	protected void sequence_SlangStmt(ISerializationContext context, SlangDoStmt semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.SLANG_DO_STMT__E) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.SLANG_DO_STMT__E));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSlangStmtAccess().getEOwnedExpressionParserRuleCall_8_2_0(), semanticObject.getE());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangStmt returns SlangHaltStmt
	 *
	 * Constraint:
	 *     {SlangHaltStmt}
	 * </pre>
	 */
	protected void sequence_SlangStmt(ISerializationContext context, SlangHaltStmt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangStmt returns SlangIfStmt
	 *
	 * Constraint:
	 *     (cond=OwnedExpression b=SlangBlock e=SlangElse?)
	 * </pre>
	 */
	protected void sequence_SlangStmt(ISerializationContext context, SlangIfStmt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangStmt returns SlangMatchStmt
	 *
	 * Constraint:
	 *     (testExpr=OwnedExpression c+=SlangCase*)
	 * </pre>
	 */
	protected void sequence_SlangStmt(ISerializationContext context, SlangMatchStmt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangStmt returns SlangSpecStmt
	 *
	 * Constraint:
	 *     b=SlangBlock
	 * </pre>
	 */
	protected void sequence_SlangStmt(ISerializationContext context, SlangSpecStmt semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.SLANG_SPEC_STMT__B) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.SLANG_SPEC_STMT__B));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSlangStmtAccess().getBSlangBlockParserRuleCall_4_2_0(), semanticObject.getB());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangStmt returns SlangVarDef
	 *
	 * Constraint:
	 *     d=SlangVarDef
	 * </pre>
	 */
	protected void sequence_SlangStmt(ISerializationContext context, SlangVarDef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.SLANG_VAR_DEF__D) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.SLANG_VAR_DEF__D));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSlangStmtAccess().getDSlangVarDefParserRuleCall_0_1_0(), semanticObject.getD());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangStmt returns SlangWhileStmt
	 *
	 * Constraint:
	 *     (cond=OwnedExpression l=SlangLoopContract b=SlangBlock)
	 * </pre>
	 */
	protected void sequence_SlangStmt(ISerializationContext context, SlangWhileStmt semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.SLANG_WHILE_STMT__COND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.SLANG_WHILE_STMT__COND));
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.SLANG_WHILE_STMT__L) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.SLANG_WHILE_STMT__L));
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.SLANG_WHILE_STMT__B) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.SLANG_WHILE_STMT__B));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSlangStmtAccess().getCondOwnedExpressionParserRuleCall_2_2_0(), semanticObject.getCond());
		feeder.accept(grammarAccess.getSlangStmtAccess().getLSlangLoopContractParserRuleCall_2_3_0(), semanticObject.getL());
		feeder.accept(grammarAccess.getSlangStmtAccess().getBSlangBlockParserRuleCall_2_4_0(), semanticObject.getB());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangTPattern returns SlangTPattern
	 *
	 * Constraint:
	 *     ((patterns+=SlangTPattern patterns+=SlangTPattern*) | type=SlangType | (patterns+=SlangTPattern patterns+=SlangTPattern*) | type=SlangType)?
	 * </pre>
	 */
	protected void sequence_SlangTPattern(ISerializationContext context, SlangTPattern semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangTypeParam returns SlangTypeParam
	 *
	 * Constraint:
	 *     (isMut?='mut'? name=ID)
	 * </pre>
	 */
	protected void sequence_SlangTypeParam(ISerializationContext context, SlangTypeParam semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangTypeParams returns SlangTypeParams
	 *
	 * Constraint:
	 *     (typeParam+=SlangTypeParam typeParam+=SlangTypeParam*)
	 * </pre>
	 */
	protected void sequence_SlangTypeParams(ISerializationContext context, SlangTypeParams semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SpecSection returns SpecSection
	 *
	 * Constraint:
	 *     (
	 *         state=State? 
	 *         functions=Functions? 
	 *         invariants=Invariants? 
	 *         integration=Integration? 
	 *         initialize=Initialize? 
	 *         compute=Compute?
	 *     )
	 * </pre>
	 */
	protected void sequence_SpecSection(ISerializationContext context, SpecSection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     StateVarDecl returns StateVarDecl
	 *
	 * Constraint:
	 *     (name=ID typeName=[DataSubcomponentType|QualifiedName])
	 * </pre>
	 */
	protected void sequence_StateVarDecl(ISerializationContext context, StateVarDecl semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.STATE_VAR_DECL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.STATE_VAR_DECL__NAME));
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.STATE_VAR_DECL__TYPE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.STATE_VAR_DECL__TYPE_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStateVarDeclAccess().getNameIDTerminalRuleCall_0_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getStateVarDeclAccess().getTypeNameDataSubcomponentTypeQualifiedNameParserRuleCall_1_0_1(), semanticObject.eGet(GumboPackage.Literals.STATE_VAR_DECL__TYPE_NAME, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     State returns State
	 *
	 * Constraint:
	 *     decls+=StateVarDecl+
	 * </pre>
	 */
	protected void sequence_State(ISerializationContext context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SubcomponentElement returns SubcomponentElement
	 *
	 * Constraint:
	 *     subcomponent=[Subcomponent|ID]
	 * </pre>
	 */
	protected void sequence_SubcomponentElement(ISerializationContext context, SubcomponentElement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.SUBCOMPONENT_ELEMENT__SUBCOMPONENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.SUBCOMPONENT_ELEMENT__SUBCOMPONENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSubcomponentElementAccess().getSubcomponentSubcomponentIDTerminalRuleCall_0_1(), semanticObject.eGet(GumboPackage.Literals.SUBCOMPONENT_ELEMENT__SUBCOMPONENT, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     OwnedExpression returns UnaryExpr
	 *     SlangExpression returns UnaryExpr
	 *     ImpliesExpression returns UnaryExpr
	 *     ImpliesExpression.ImpliesExpr_1_0 returns UnaryExpr
	 *     OrExpression returns UnaryExpr
	 *     OrExpression.OrExpr_1_0 returns UnaryExpr
	 *     AndExpression returns UnaryExpr
	 *     AndExpression.AndExpr_1_0 returns UnaryExpr
	 *     EqualNotExpression returns UnaryExpr
	 *     EqualNotExpression.EqualNotExpr_1_0 returns UnaryExpr
	 *     LtGtExpression returns UnaryExpr
	 *     LtGtExpression.LtGtExpr_1_0 returns UnaryExpr
	 *     ColonExpression returns UnaryExpr
	 *     ColonExpression.ColonExpr_1_0 returns UnaryExpr
	 *     PlusMinusExpression returns UnaryExpr
	 *     PlusMinusExpression.PlusMinusExpr_1_0 returns UnaryExpr
	 *     MultiplicativeExpression returns UnaryExpr
	 *     MultiplicativeExpression.MultiplicativeExpr_1_0 returns UnaryExpr
	 *     UnaryExpression returns UnaryExpr
	 *
	 * Constraint:
	 *     (op=UnaryOp exp=PrimaryExpr)
	 * </pre>
	 */
	protected void sequence_UnaryExpression(ISerializationContext context, UnaryExpr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.UNARY_EXPR__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.UNARY_EXPR__OP));
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.UNARY_EXPR__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.UNARY_EXPR__EXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUnaryExpressionAccess().getOpUnaryOpParserRuleCall_0_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getUnaryExpressionAccess().getExpPrimaryExprParserRuleCall_0_2_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
}
