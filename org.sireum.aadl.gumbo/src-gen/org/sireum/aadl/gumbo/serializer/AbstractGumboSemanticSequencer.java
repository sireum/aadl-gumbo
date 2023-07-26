
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
import org.sireum.aadl.gumbo.gumbo.AnonAssumeStatement;
import org.sireum.aadl.gumbo.gumbo.AnonGuaranteeStatement;
import org.sireum.aadl.gumbo.gumbo.AssumeStatement;
import org.sireum.aadl.gumbo.gumbo.BasicExp;
import org.sireum.aadl.gumbo.gumbo.BinLit;
import org.sireum.aadl.gumbo.gumbo.BooleanLit;
import org.sireum.aadl.gumbo.gumbo.CallExpr;
import org.sireum.aadl.gumbo.gumbo.CaseStatementClause;
import org.sireum.aadl.gumbo.gumbo.Compute;
import org.sireum.aadl.gumbo.gumbo.DataElement;
import org.sireum.aadl.gumbo.gumbo.DataRefExpr;
import org.sireum.aadl.gumbo.gumbo.DoubleDotRef;
import org.sireum.aadl.gumbo.gumbo.EnumLitExpr;
import org.sireum.aadl.gumbo.gumbo.F32Lit;
import org.sireum.aadl.gumbo.gumbo.F32Obj;
import org.sireum.aadl.gumbo.gumbo.F64Lit;
import org.sireum.aadl.gumbo.gumbo.F64Obj;
import org.sireum.aadl.gumbo.gumbo.Functions;
import org.sireum.aadl.gumbo.gumbo.GuaranteeStatement;
import org.sireum.aadl.gumbo.gumbo.GumboLibrary;
import org.sireum.aadl.gumbo.gumbo.GumboPackage;
import org.sireum.aadl.gumbo.gumbo.GumboSubclause;
import org.sireum.aadl.gumbo.gumbo.HandlerClause;
import org.sireum.aadl.gumbo.gumbo.HasEventExpr;
import org.sireum.aadl.gumbo.gumbo.HexLit;
import org.sireum.aadl.gumbo.gumbo.IfElseExp;
import org.sireum.aadl.gumbo.gumbo.InStateExpr;
import org.sireum.aadl.gumbo.gumbo.InfoFlowClause;
import org.sireum.aadl.gumbo.gumbo.Initialize;
import org.sireum.aadl.gumbo.gumbo.InitializeSpecStatement;
import org.sireum.aadl.gumbo.gumbo.IntegerLit;
import org.sireum.aadl.gumbo.gumbo.Integration;
import org.sireum.aadl.gumbo.gumbo.InvSpec;
import org.sireum.aadl.gumbo.gumbo.Invariants;
import org.sireum.aadl.gumbo.gumbo.MStringLit;
import org.sireum.aadl.gumbo.gumbo.MaySendExpr;
import org.sireum.aadl.gumbo.gumbo.MustSendExpr;
import org.sireum.aadl.gumbo.gumbo.NoSendExpr;
import org.sireum.aadl.gumbo.gumbo.OtherDataRef;
import org.sireum.aadl.gumbo.gumbo.ParenExpr;
import org.sireum.aadl.gumbo.gumbo.QuantifiedExp;
import org.sireum.aadl.gumbo.gumbo.RecordLitExpr;
import org.sireum.aadl.gumbo.gumbo.ResultLit;
import org.sireum.aadl.gumbo.gumbo.SlangAccess;
import org.sireum.aadl.gumbo.gumbo.SlangAccessSuffix;
import org.sireum.aadl.gumbo.gumbo.SlangAssertStmt;
import org.sireum.aadl.gumbo.gumbo.SlangAssumeStmt;
import org.sireum.aadl.gumbo.gumbo.SlangBlock;
import org.sireum.aadl.gumbo.gumbo.SlangBlockTerm;
import org.sireum.aadl.gumbo.gumbo.SlangCallArgs;
import org.sireum.aadl.gumbo.gumbo.SlangCallSuffix;
import org.sireum.aadl.gumbo.gumbo.SlangCase;
import org.sireum.aadl.gumbo.gumbo.SlangDefContract;
import org.sireum.aadl.gumbo.gumbo.SlangDefContractCase;
import org.sireum.aadl.gumbo.gumbo.SlangDefDecl;
import org.sireum.aadl.gumbo.gumbo.SlangDefDeclDef;
import org.sireum.aadl.gumbo.gumbo.SlangDefDef;
import org.sireum.aadl.gumbo.gumbo.SlangDefExt;
import org.sireum.aadl.gumbo.gumbo.SlangDefParam;
import org.sireum.aadl.gumbo.gumbo.SlangDefParams;
import org.sireum.aadl.gumbo.gumbo.SlangDoStmt;
import org.sireum.aadl.gumbo.gumbo.SlangElse;
import org.sireum.aadl.gumbo.gumbo.SlangEnsures;
import org.sireum.aadl.gumbo.gumbo.SlangExt;
import org.sireum.aadl.gumbo.gumbo.SlangFieldLookup;
import org.sireum.aadl.gumbo.gumbo.SlangForRange;
import org.sireum.aadl.gumbo.gumbo.SlangForTerm;
import org.sireum.aadl.gumbo.gumbo.SlangHaltStmt;
import org.sireum.aadl.gumbo.gumbo.SlangIdStmt;
import org.sireum.aadl.gumbo.gumbo.SlangIfStmt;
import org.sireum.aadl.gumbo.gumbo.SlangInterpTerm;
import org.sireum.aadl.gumbo.gumbo.SlangInvariant;
import org.sireum.aadl.gumbo.gumbo.SlangLitTerm;
import org.sireum.aadl.gumbo.gumbo.SlangLiteralInterp;
import org.sireum.aadl.gumbo.gumbo.SlangLoopContract;
import org.sireum.aadl.gumbo.gumbo.SlangMInterp;
import org.sireum.aadl.gumbo.gumbo.SlangMatchStmt;
import org.sireum.aadl.gumbo.gumbo.SlangMethodCall;
import org.sireum.aadl.gumbo.gumbo.SlangModifies;
import org.sireum.aadl.gumbo.gumbo.SlangMspInterp;
import org.sireum.aadl.gumbo.gumbo.SlangMspbInterp;
import org.sireum.aadl.gumbo.gumbo.SlangParam;
import org.sireum.aadl.gumbo.gumbo.SlangParams;
import org.sireum.aadl.gumbo.gumbo.SlangPattern;
import org.sireum.aadl.gumbo.gumbo.SlangQuantVar;
import org.sireum.aadl.gumbo.gumbo.SlangReads;
import org.sireum.aadl.gumbo.gumbo.SlangRequires;
import org.sireum.aadl.gumbo.gumbo.SlangRet;
import org.sireum.aadl.gumbo.gumbo.SlangSpecStmt;
import org.sireum.aadl.gumbo.gumbo.SlangStringLit;
import org.sireum.aadl.gumbo.gumbo.SlangSupr;
import org.sireum.aadl.gumbo.gumbo.SlangSuprs;
import org.sireum.aadl.gumbo.gumbo.SlangTPattern;
import org.sireum.aadl.gumbo.gumbo.SlangType;
import org.sireum.aadl.gumbo.gumbo.SlangTypeArgs;
import org.sireum.aadl.gumbo.gumbo.SlangTypeParam;
import org.sireum.aadl.gumbo.gumbo.SlangTypeParams;
import org.sireum.aadl.gumbo.gumbo.SlangVarDef;
import org.sireum.aadl.gumbo.gumbo.SlangWhileStmt;
import org.sireum.aadl.gumbo.gumbo.SpecSection;
import org.sireum.aadl.gumbo.gumbo.State;
import org.sireum.aadl.gumbo.gumbo.StateVarDecl;
import org.sireum.aadl.gumbo.gumbo.SubcomponentElement;
import org.sireum.aadl.gumbo.gumbo.UnaryExp;
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
			case GumboPackage.ANON_ASSUME_STATEMENT:
				sequence_AnonAssumeStatement(context, (AnonAssumeStatement) semanticObject); 
				return; 
			case GumboPackage.ANON_GUARANTEE_STATEMENT:
				sequence_AnonGuaranteeStatement(context, (AnonGuaranteeStatement) semanticObject); 
				return; 
			case GumboPackage.ASSUME_STATEMENT:
				sequence_AssumeStatement(context, (AssumeStatement) semanticObject); 
				return; 
			case GumboPackage.BASIC_EXP:
				sequence_Expr(context, (BasicExp) semanticObject); 
				return; 
			case GumboPackage.BIN_LIT:
				sequence_SlangLit(context, (BinLit) semanticObject); 
				return; 
			case GumboPackage.BOOLEAN_LIT:
				sequence_SlangLit(context, (BooleanLit) semanticObject); 
				return; 
			case GumboPackage.CALL_EXPR:
				sequence_SlangTerm(context, (CallExpr) semanticObject); 
				return; 
			case GumboPackage.CASE_STATEMENT_CLAUSE:
				sequence_CaseStatementClause(context, (CaseStatementClause) semanticObject); 
				return; 
			case GumboPackage.COMPUTE:
				sequence_Compute(context, (Compute) semanticObject); 
				return; 
			case GumboPackage.DATA_ELEMENT:
				sequence_DataElement(context, (DataElement) semanticObject); 
				return; 
			case GumboPackage.DATA_REF_EXPR:
				sequence_SlangTerm(context, (DataRefExpr) semanticObject); 
				return; 
			case GumboPackage.DOUBLE_DOT_REF:
				sequence_DoubleDotRef(context, (DoubleDotRef) semanticObject); 
				return; 
			case GumboPackage.ENUM_LIT_EXPR:
				sequence_SlangTerm(context, (EnumLitExpr) semanticObject); 
				return; 
			case GumboPackage.F32_LIT:
				sequence_SlangLit(context, (F32Lit) semanticObject); 
				return; 
			case GumboPackage.F32_OBJ:
				sequence_SlangLit(context, (F32Obj) semanticObject); 
				return; 
			case GumboPackage.F64_LIT:
				sequence_SlangLit(context, (F64Lit) semanticObject); 
				return; 
			case GumboPackage.F64_OBJ:
				sequence_SlangLit(context, (F64Obj) semanticObject); 
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
			case GumboPackage.HANDLER_CLAUSE:
				sequence_HandlerClause(context, (HandlerClause) semanticObject); 
				return; 
			case GumboPackage.HAS_EVENT_EXPR:
				sequence_SlangTerm(context, (HasEventExpr) semanticObject); 
				return; 
			case GumboPackage.HEX_LIT:
				sequence_SlangLit(context, (HexLit) semanticObject); 
				return; 
			case GumboPackage.IF_ELSE_EXP:
				sequence_Expr(context, (IfElseExp) semanticObject); 
				return; 
			case GumboPackage.IN_STATE_EXPR:
				sequence_SlangTerm(context, (InStateExpr) semanticObject); 
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
			case GumboPackage.MSTRING_LIT:
				sequence_SlangLit(context, (MStringLit) semanticObject); 
				return; 
			case GumboPackage.MAY_SEND_EXPR:
				sequence_SlangTerm(context, (MaySendExpr) semanticObject); 
				return; 
			case GumboPackage.MUST_SEND_EXPR:
				sequence_SlangTerm(context, (MustSendExpr) semanticObject); 
				return; 
			case GumboPackage.NO_SEND_EXPR:
				sequence_SlangTerm(context, (NoSendExpr) semanticObject); 
				return; 
			case GumboPackage.OTHER_DATA_REF:
				sequence_OtherDataRef(context, (OtherDataRef) semanticObject); 
				return; 
			case GumboPackage.PAREN_EXPR:
				sequence_SlangTerm(context, (ParenExpr) semanticObject); 
				return; 
			case GumboPackage.QUANTIFIED_EXP:
				sequence_Expr(context, (QuantifiedExp) semanticObject); 
				return; 
			case GumboPackage.RECORD_LIT_EXPR:
				sequence_SlangTerm(context, (RecordLitExpr) semanticObject); 
				return; 
			case GumboPackage.RESULT_LIT:
				sequence_SlangLit(context, (ResultLit) semanticObject); 
				return; 
			case GumboPackage.SLANG_ACCESS:
				sequence_SlangAccess(context, (SlangAccess) semanticObject); 
				return; 
			case GumboPackage.SLANG_ACCESS_SUFFIX:
				sequence_SlangAccessSuffix(context, (SlangAccessSuffix) semanticObject); 
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
				sequence_SlangTerm(context, (SlangBlockTerm) semanticObject); 
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
			case GumboPackage.SLANG_DEF_CONTRACT_CASE:
				sequence_SlangDefContractCase(context, (SlangDefContractCase) semanticObject); 
				return; 
			case GumboPackage.SLANG_DEF_DECL:
				sequence_SlangDefDecl(context, (SlangDefDecl) semanticObject); 
				return; 
			case GumboPackage.SLANG_DEF_DECL_DEF:
				sequence_SlangDefDeclDef(context, (SlangDefDeclDef) semanticObject); 
				return; 
			case GumboPackage.SLANG_DEF_DEF:
				sequence_SlangDefDef(context, (SlangDefDef) semanticObject); 
				return; 
			case GumboPackage.SLANG_DEF_EXT:
				sequence_SlangDefExt(context, (SlangDefExt) semanticObject); 
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
			case GumboPackage.SLANG_EXT:
				sequence_SlangExt(context, (SlangExt) semanticObject); 
				return; 
			case GumboPackage.SLANG_FIELD_LOOKUP:
				sequence_SlangLHSSuffix(context, (SlangFieldLookup) semanticObject); 
				return; 
			case GumboPackage.SLANG_FOR_RANGE:
				sequence_SlangForRange(context, (SlangForRange) semanticObject); 
				return; 
			case GumboPackage.SLANG_FOR_TERM:
				sequence_SlangTerm(context, (SlangForTerm) semanticObject); 
				return; 
			case GumboPackage.SLANG_HALT_STMT:
				sequence_SlangStmt(context, (SlangHaltStmt) semanticObject); 
				return; 
			case GumboPackage.SLANG_ID_STMT:
				sequence_SlangStmt(context, (SlangIdStmt) semanticObject); 
				return; 
			case GumboPackage.SLANG_IF_STMT:
				sequence_SlangStmt(context, (SlangIfStmt) semanticObject); 
				return; 
			case GumboPackage.SLANG_INTERP_TERM:
				sequence_SlangTerm(context, (SlangInterpTerm) semanticObject); 
				return; 
			case GumboPackage.SLANG_INVARIANT:
				sequence_SlangInvariant(context, (SlangInvariant) semanticObject); 
				return; 
			case GumboPackage.SLANG_LIT_TERM:
				sequence_SlangTerm(context, (SlangLitTerm) semanticObject); 
				return; 
			case GumboPackage.SLANG_LITERAL_INTERP:
				sequence_SlangInterp(context, (SlangLiteralInterp) semanticObject); 
				return; 
			case GumboPackage.SLANG_LOOP_CONTRACT:
				sequence_SlangLoopContract(context, (SlangLoopContract) semanticObject); 
				return; 
			case GumboPackage.SLANG_MINTERP:
				sequence_SlangMInterp(context, (SlangMInterp) semanticObject); 
				return; 
			case GumboPackage.SLANG_MATCH_STMT:
				sequence_SlangStmt(context, (SlangMatchStmt) semanticObject); 
				return; 
			case GumboPackage.SLANG_METHOD_CALL:
				sequence_SlangLHSSuffix(context, (SlangMethodCall) semanticObject); 
				return; 
			case GumboPackage.SLANG_MODIFIES:
				sequence_SlangModifies(context, (SlangModifies) semanticObject); 
				return; 
			case GumboPackage.SLANG_MSP_INTERP:
				sequence_SlangInterp(context, (SlangMspInterp) semanticObject); 
				return; 
			case GumboPackage.SLANG_MSPB_INTERP:
				sequence_SlangInterp(context, (SlangMspbInterp) semanticObject); 
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
				else if (rule == grammarAccess.getSlangTypedVarDefRule()) {
					sequence_SlangPattern_SlangTypedVarDef(context, (SlangPattern) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getSlangVarDefRule()) {
					sequence_SlangPattern_SlangVarDef(context, (SlangPattern) semanticObject); 
					return; 
				}
				else break;
			case GumboPackage.SLANG_QUANT_VAR:
				sequence_SlangQuantVar(context, (SlangQuantVar) semanticObject); 
				return; 
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
			case GumboPackage.SLANG_SUPR:
				sequence_SlangSupr(context, (SlangSupr) semanticObject); 
				return; 
			case GumboPackage.SLANG_SUPRS:
				sequence_SlangSuprs(context, (SlangSuprs) semanticObject); 
				return; 
			case GumboPackage.SLANG_TPATTERN:
				sequence_SlangTPattern(context, (SlangTPattern) semanticObject); 
				return; 
			case GumboPackage.SLANG_TYPE:
				sequence_SlangBaseType(context, (SlangType) semanticObject); 
				return; 
			case GumboPackage.SLANG_TYPE_ARGS:
				sequence_SlangTypeArgs(context, (SlangTypeArgs) semanticObject); 
				return; 
			case GumboPackage.SLANG_TYPE_PARAM:
				sequence_SlangTypeParam(context, (SlangTypeParam) semanticObject); 
				return; 
			case GumboPackage.SLANG_TYPE_PARAMS:
				sequence_SlangTypeParams(context, (SlangTypeParams) semanticObject); 
				return; 
			case GumboPackage.SLANG_VAR_DEF:
				if (rule == grammarAccess.getSlangStmtRule()) {
					sequence_SlangStmt(context, (SlangVarDef) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getSlangVarDeclDefRule()) {
					sequence_SlangVarDeclDef(context, (SlangVarDef) semanticObject); 
					return; 
				}
				else break;
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
			case GumboPackage.UNARY_EXP:
				sequence_Expr(context, (UnaryExp) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     AnonAssumeStatement returns AnonAssumeStatement
	 *
	 * Constraint:
	 *     expr=Expr
	 * </pre>
	 */
	protected void sequence_AnonAssumeStatement(ISerializationContext context, AnonAssumeStatement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.ANON_ASSUME_STATEMENT__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.ANON_ASSUME_STATEMENT__EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAnonAssumeStatementAccess().getExprExprParserRuleCall_1_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     AnonGuaranteeStatement returns AnonGuaranteeStatement
	 *
	 * Constraint:
	 *     expr=Expr
	 * </pre>
	 */
	protected void sequence_AnonGuaranteeStatement(ISerializationContext context, AnonGuaranteeStatement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.ANON_GUARANTEE_STATEMENT__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.ANON_GUARANTEE_STATEMENT__EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAnonGuaranteeStatementAccess().getExprExprParserRuleCall_1_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SpecStatement returns AssumeStatement
	 *     AssumeStatement returns AssumeStatement
	 *
	 * Constraint:
	 *     (id=ID descriptor=SLANG_STRING? expr=Expr)
	 * </pre>
	 */
	protected void sequence_AssumeStatement(ISerializationContext context, AssumeStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     CaseStatementClause returns CaseStatementClause
	 *
	 * Constraint:
	 *     (id=ID descriptor=SLANG_STRING? assumeStatement=AnonAssumeStatement guaranteeStatement=AnonGuaranteeStatement)
	 * </pre>
	 */
	protected void sequence_CaseStatementClause(ISerializationContext context, CaseStatementClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Compute returns Compute
	 *
	 * Constraint:
	 *     (modifies=SlangModifies? specs+=SpecStatement* cases+=CaseStatementClause* handlers+=HandlerClause* flows+=InfoFlowClause*)
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
	 *     dataElement=[DataSubcomponentType|QCREF]
	 * </pre>
	 */
	protected void sequence_DataElement(ISerializationContext context, DataElement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.DATA_ELEMENT__DATA_ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.DATA_ELEMENT__DATA_ELEMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDataElementAccess().getDataElementDataSubcomponentTypeQCREFParserRuleCall_0_1(), semanticObject.eGet(GumboPackage.Literals.DATA_ELEMENT__DATA_ELEMENT, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DoubleDotRef returns DoubleDotRef
	 *
	 * Constraint:
	 *     elm=[NamedElement|QCREF]
	 * </pre>
	 */
	protected void sequence_DoubleDotRef(ISerializationContext context, DoubleDotRef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.DOUBLE_DOT_REF__ELM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.DOUBLE_DOT_REF__ELM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDoubleDotRefAccess().getElmNamedElementQCREFParserRuleCall_0_1(), semanticObject.eGet(GumboPackage.Literals.DOUBLE_DOT_REF__ELM, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expr returns BasicExp
	 *
	 * Constraint:
	 *     (terms+=SlangAccess (ops+=Operator terms+=SlangAccess)*)
	 * </pre>
	 */
	protected void sequence_Expr(ISerializationContext context, BasicExp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expr returns IfElseExp
	 *
	 * Constraint:
	 *     (ifCond=Expr thenExpr=Expr elseExpr=Expr)
	 * </pre>
	 */
	protected void sequence_Expr(ISerializationContext context, IfElseExp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.IF_ELSE_EXP__IF_COND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.IF_ELSE_EXP__IF_COND));
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.IF_ELSE_EXP__THEN_EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.IF_ELSE_EXP__THEN_EXPR));
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.IF_ELSE_EXP__ELSE_EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.IF_ELSE_EXP__ELSE_EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExprAccess().getIfCondExprParserRuleCall_1_3_0(), semanticObject.getIfCond());
		feeder.accept(grammarAccess.getExprAccess().getThenExprExprParserRuleCall_1_5_0(), semanticObject.getThenExpr());
		feeder.accept(grammarAccess.getExprAccess().getElseExprExprParserRuleCall_1_7_0(), semanticObject.getElseExpr());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expr returns QuantifiedExp
	 *
	 * Constraint:
	 *     (qVar+=SlangQuantVar qVar+=SlangQuantVar* quantifiedExpr=Expr)
	 * </pre>
	 */
	protected void sequence_Expr(ISerializationContext context, QuantifiedExp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expr returns UnaryExp
	 *
	 * Constraint:
	 *     (op=Operator accessExp=SlangAccess)
	 * </pre>
	 */
	protected void sequence_Expr(ISerializationContext context, UnaryExp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.UNARY_EXP__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.UNARY_EXP__OP));
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.UNARY_EXP__ACCESS_EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.UNARY_EXP__ACCESS_EXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExprAccess().getOpOperatorParserRuleCall_3_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getExprAccess().getAccessExpSlangAccessParserRuleCall_3_2_0(), semanticObject.getAccessExp());
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
	 *     (id=ID descriptor=SLANG_STRING? expr=Expr)
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
	 *     HandlerClause returns HandlerClause
	 *
	 * Constraint:
	 *     (id=[Port|ID] modifies=SlangModifies? guarantees+=GuaranteeStatement+)
	 * </pre>
	 */
	protected void sequence_HandlerClause(ISerializationContext context, HandlerClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     InfoFlowClause returns InfoFlowClause
	 *
	 * Constraint:
	 *     (
	 *         id=ID 
	 *         descriptor=SLANG_STRING? 
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
	 *     (id=ID descriptor=SLANG_STRING? expr=Expr)
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
	 *     SlangAccessSuffix returns SlangAccessSuffix
	 *
	 * Constraint:
	 *     id=ID
	 * </pre>
	 */
	protected void sequence_SlangAccessSuffix(ISerializationContext context, SlangAccessSuffix semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.SLANG_ACCESS_SUFFIX__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.SLANG_ACCESS_SUFFIX__ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSlangAccessSuffixAccess().getIdIDTerminalRuleCall_2_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangAccess returns SlangAccess
	 *
	 * Constraint:
	 *     (t=SlangTerm suffixes+=SlangAccessSuffix*)
	 * </pre>
	 */
	protected void sequence_SlangAccess(ISerializationContext context, SlangAccess semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangType returns SlangType
	 *     SlangBaseType returns SlangType
	 *
	 * Constraint:
	 *     typeName=[DataSubcomponentType|QCREF]
	 * </pre>
	 */
	protected void sequence_SlangBaseType(ISerializationContext context, SlangType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.SLANG_TYPE__TYPE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.SLANG_TYPE__TYPE_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSlangBaseTypeAccess().getTypeNameDataSubcomponentTypeQCREFParserRuleCall_0_1(), semanticObject.eGet(GumboPackage.Literals.SLANG_TYPE__TYPE_NAME, false));
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
	 *     (arg+=Expr arg+=Expr*)?
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
	 *     (pattern=SlangPattern e=Expr? s+=SlangStmt*)
	 * </pre>
	 */
	protected void sequence_SlangCase(ISerializationContext context, SlangCase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangDefContractCase returns SlangDefContractCase
	 *
	 * Constraint:
	 *     (req=SlangRequires? ens=SlangEnsures?)
	 * </pre>
	 */
	protected void sequence_SlangDefContractCase(ISerializationContext context, SlangDefContractCase semanticObject) {
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
	 *     SlangDefDeclDef returns SlangDefDeclDef
	 *
	 * Constraint:
	 *     (
	 *         sde=SlangDefExt? 
	 *         name=SlangDefID 
	 *         typeParams=SlangTypeParams? 
	 *         params=SlangDefParams? 
	 *         type=SlangType 
	 *         c=SlangDefContract? 
	 *         e=Expr?
	 *     )
	 * </pre>
	 */
	protected void sequence_SlangDefDeclDef(ISerializationContext context, SlangDefDeclDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangDefDecl returns SlangDefDecl
	 *
	 * Constraint:
	 *     (
	 *         sde=SlangDefExt? 
	 *         name=SlangDefID 
	 *         typeParams=SlangTypeParams? 
	 *         params=SlangDefParams? 
	 *         type=SlangType 
	 *         c=SlangDefContract?
	 *     )
	 * </pre>
	 */
	protected void sequence_SlangDefDecl(ISerializationContext context, SlangDefDecl semanticObject) {
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
	 *         sde=SlangDefExt? 
	 *         name=SlangDefID 
	 *         typeParams=SlangTypeParams? 
	 *         params=SlangDefParams 
	 *         type=SlangType 
	 *         methodContract=SlangDefContract 
	 *         body=Expr
	 *     )
	 * </pre>
	 */
	protected void sequence_SlangDefDef(ISerializationContext context, SlangDefDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangDefExt returns SlangDefExt
	 *
	 * Constraint:
	 *     (name=ID typeName=SlangType)
	 * </pre>
	 */
	protected void sequence_SlangDefExt(ISerializationContext context, SlangDefExt semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.SLANG_DEF_EXT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.SLANG_DEF_EXT__NAME));
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.SLANG_DEF_EXT__TYPE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.SLANG_DEF_EXT__TYPE_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSlangDefExtAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSlangDefExtAccess().getTypeNameSlangTypeParserRuleCall_3_0(), semanticObject.getTypeName());
		feeder.finish();
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
	 *     (cond=Expr b=SlangBlock e=SlangElse?)
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
	 *     (exprs+=Expr exprs+=Expr*)
	 * </pre>
	 */
	protected void sequence_SlangEnsures(ISerializationContext context, SlangEnsures semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangExt returns SlangExt
	 *
	 * Constraint:
	 *     decl+=SlangDefDecl*
	 * </pre>
	 */
	protected void sequence_SlangExt(ISerializationContext context, SlangExt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangForRange returns SlangForRange
	 *
	 * Constraint:
	 *     (e=Expr (upper=Expr step=Expr?)?)
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
		feeder.accept(grammarAccess.getSlangInterpAccess().getSliSLITerminalRuleCall_1_1_0(), semanticObject.getSli());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangInterp returns SlangMspInterp
	 *
	 * Constraint:
	 *     msp=MSP
	 * </pre>
	 */
	protected void sequence_SlangInterp(ISerializationContext context, SlangMspInterp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.SLANG_MSP_INTERP__MSP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.SLANG_MSP_INTERP__MSP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSlangInterpAccess().getMspMSPTerminalRuleCall_0_1_0(), semanticObject.getMsp());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangInterp returns SlangMspbInterp
	 *
	 * Constraint:
	 *     (mspb=MSPB minterp=SlangMInterp)
	 * </pre>
	 */
	protected void sequence_SlangInterp(ISerializationContext context, SlangMspbInterp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.SLANG_MSPB_INTERP__MSPB) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.SLANG_MSPB_INTERP__MSPB));
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.SLANG_MSPB_INTERP__MINTERP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.SLANG_MSPB_INTERP__MINTERP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSlangInterpAccess().getMspbMSPBTerminalRuleCall_2_1_0(), semanticObject.getMspb());
		feeder.accept(grammarAccess.getSlangInterpAccess().getMinterpSlangMInterpParserRuleCall_2_2_0(), semanticObject.getMinterp());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangInvariant returns SlangInvariant
	 *
	 * Constraint:
	 *     (exprs+=Expr exprs+=Expr*)
	 * </pre>
	 */
	protected void sequence_SlangInvariant(ISerializationContext context, SlangInvariant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangLHSSuffix returns SlangFieldLookup
	 *
	 * Constraint:
	 *     {SlangFieldLookup}
	 * </pre>
	 */
	protected void sequence_SlangLHSSuffix(ISerializationContext context, SlangFieldLookup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangLHSSuffix returns SlangMethodCall
	 *
	 * Constraint:
	 *     (exprs+=Expr exprs+=Expr*)?
	 * </pre>
	 */
	protected void sequence_SlangLHSSuffix(ISerializationContext context, SlangMethodCall semanticObject) {
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
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.BIN_LIT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.BIN_LIT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSlangLitAccess().getValueBINTerminalRuleCall_4_1_0(), semanticObject.getValue());
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
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.F32_LIT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.F32_LIT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSlangLitAccess().getValueF32_LITTerminalRuleCall_5_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangLit returns F32Obj
	 *
	 * Constraint:
	 *     value='F32'
	 * </pre>
	 */
	protected void sequence_SlangLit(ISerializationContext context, F32Obj semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.F32_OBJ__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.F32_OBJ__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSlangLitAccess().getValueF32Keyword_7_1_0(), semanticObject.getValue());
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
	 *     SlangLit returns F64Obj
	 *
	 * Constraint:
	 *     value='F64'
	 * </pre>
	 */
	protected void sequence_SlangLit(ISerializationContext context, F64Obj semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.F64_OBJ__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.F64_OBJ__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSlangLitAccess().getValueF64Keyword_8_1_0(), semanticObject.getValue());
		feeder.finish();
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
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.HEX_LIT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.HEX_LIT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSlangLitAccess().getValueHEXTerminalRuleCall_3_1_0(), semanticObject.getValue());
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
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.INTEGER_LIT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.INTEGER_LIT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSlangLitAccess().getValueINTEGER_LITTerminalRuleCall_2_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangLit returns MStringLit
	 *
	 * Constraint:
	 *     value=MSTRING
	 * </pre>
	 */
	protected void sequence_SlangLit(ISerializationContext context, MStringLit semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.MSTRING_LIT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.MSTRING_LIT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSlangLitAccess().getValueMSTRINGTerminalRuleCall_10_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangLit returns ResultLit
	 *
	 * Constraint:
	 *     {ResultLit}
	 * </pre>
	 */
	protected void sequence_SlangLit(ISerializationContext context, ResultLit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangLit returns SlangStringLit
	 *
	 * Constraint:
	 *     value=SLANG_STRING
	 * </pre>
	 */
	protected void sequence_SlangLit(ISerializationContext context, SlangStringLit semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.SLANG_STRING_LIT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.SLANG_STRING_LIT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSlangLitAccess().getValueSLANG_STRINGTerminalRuleCall_9_1_0(), semanticObject.getValue());
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
	 *     SlangMInterp returns SlangMInterp
	 *
	 * Constraint:
	 *     (e=Expr m=SlangMInterp?)
	 * </pre>
	 */
	protected void sequence_SlangMInterp(ISerializationContext context, SlangMInterp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangModifies returns SlangModifies
	 *
	 * Constraint:
	 *     (exprs+=Expr exprs+=Expr*)
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
	 *     SlangTypedVarDef returns SlangPattern
	 *
	 * Constraint:
	 *     (((patterns+=SlangTPattern patterns+=SlangTPattern*) | (patterns+=SlangTPattern patterns+=SlangTPattern*))? typeName=SlangType init=Expr)
	 * </pre>
	 */
	protected void sequence_SlangPattern_SlangTypedVarDef(ISerializationContext context, SlangPattern semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangVarDef returns SlangPattern
	 *
	 * Constraint:
	 *     (((patterns+=SlangTPattern patterns+=SlangTPattern*) | (patterns+=SlangTPattern patterns+=SlangTPattern*))? typeName=SlangType? init=Expr)
	 * </pre>
	 */
	protected void sequence_SlangPattern_SlangVarDef(ISerializationContext context, SlangPattern semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangQuantVar returns SlangQuantVar
	 *
	 * Constraint:
	 *     (e=Expr upperBound=Expr?)
	 * </pre>
	 */
	protected void sequence_SlangQuantVar(ISerializationContext context, SlangQuantVar semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangReads returns SlangReads
	 *
	 * Constraint:
	 *     (exprs+=Expr exprs+=Expr*)
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
	 *     (exprs+=Expr exprs+=Expr*)
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
	 *     e=Expr?
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
	 *     e=Expr
	 * </pre>
	 */
	protected void sequence_SlangStmt(ISerializationContext context, SlangAssertStmt semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.SLANG_ASSERT_STMT__E) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.SLANG_ASSERT_STMT__E));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSlangStmtAccess().getEExprParserRuleCall_6_2_0(), semanticObject.getE());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangStmt returns SlangAssumeStmt
	 *
	 * Constraint:
	 *     e=Expr
	 * </pre>
	 */
	protected void sequence_SlangStmt(ISerializationContext context, SlangAssumeStmt semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.SLANG_ASSUME_STMT__E) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.SLANG_ASSUME_STMT__E));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSlangStmtAccess().getEExprParserRuleCall_5_2_0(), semanticObject.getE());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangStmt returns SlangDoStmt
	 *
	 * Constraint:
	 *     e=Expr
	 * </pre>
	 */
	protected void sequence_SlangStmt(ISerializationContext context, SlangDoStmt semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.SLANG_DO_STMT__E) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.SLANG_DO_STMT__E));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSlangStmtAccess().getEExprParserRuleCall_8_2_0(), semanticObject.getE());
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
	 *     SlangStmt returns SlangIdStmt
	 *
	 * Constraint:
	 *     (portOrSubcomponentOrStateVar=[EObject|ID] l+=SlangLHSSuffix* e=Expr?)
	 * </pre>
	 */
	protected void sequence_SlangStmt(ISerializationContext context, SlangIdStmt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangStmt returns SlangIfStmt
	 *
	 * Constraint:
	 *     (cond=Expr b=SlangBlock e=SlangElse?)
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
	 *     (testExpr=Expr c+=SlangCase*)
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
	 *     (cond=Expr l=SlangLoopContract b=SlangBlock)
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
		feeder.accept(grammarAccess.getSlangStmtAccess().getCondExprParserRuleCall_2_2_0(), semanticObject.getCond());
		feeder.accept(grammarAccess.getSlangStmtAccess().getLSlangLoopContractParserRuleCall_2_3_0(), semanticObject.getL());
		feeder.accept(grammarAccess.getSlangStmtAccess().getBSlangBlockParserRuleCall_2_4_0(), semanticObject.getB());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangSupr returns SlangSupr
	 *
	 * Constraint:
	 *     (name=SlangName args=SlangTypeArgs?)
	 * </pre>
	 */
	protected void sequence_SlangSupr(ISerializationContext context, SlangSupr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangSuprs returns SlangSuprs
	 *
	 * Constraint:
	 *     (superTypes+=SlangSupr superTypes+=SlangSupr*)
	 * </pre>
	 */
	protected void sequence_SlangSuprs(ISerializationContext context, SlangSuprs semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     SlangTerm returns CallExpr
	 *
	 * Constraint:
	 *     (id=[EObject|QCREF] callSuffix=SlangCallSuffix)
	 * </pre>
	 */
	protected void sequence_SlangTerm(ISerializationContext context, CallExpr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.CALL_EXPR__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.CALL_EXPR__ID));
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.CALL_EXPR__CALL_SUFFIX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.CALL_EXPR__CALL_SUFFIX));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSlangTermAccess().getIdEObjectQCREFParserRuleCall_7_0_1_0_1(), semanticObject.eGet(GumboPackage.Literals.CALL_EXPR__ID, false));
		feeder.accept(grammarAccess.getSlangTermAccess().getCallSuffixSlangCallSuffixParserRuleCall_7_0_2_0(), semanticObject.getCallSuffix());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangTerm returns DataRefExpr
	 *
	 * Constraint:
	 *     (portOrSubcomponentOrStateVar=[EObject|ID] ref=OtherDataRef?)
	 * </pre>
	 */
	protected void sequence_SlangTerm(ISerializationContext context, DataRefExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangTerm returns EnumLitExpr
	 *
	 * Constraint:
	 *     (enumType=[DataClassifier|QCLREF] value=[StringLiteral|ID])
	 * </pre>
	 */
	protected void sequence_SlangTerm(ISerializationContext context, EnumLitExpr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.ENUM_LIT_EXPR__ENUM_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.ENUM_LIT_EXPR__ENUM_TYPE));
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.ENUM_LIT_EXPR__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.ENUM_LIT_EXPR__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSlangTermAccess().getEnumTypeDataClassifierQCLREFParserRuleCall_8_0_0_1_0_1(), semanticObject.eGet(GumboPackage.Literals.ENUM_LIT_EXPR__ENUM_TYPE, false));
		feeder.accept(grammarAccess.getSlangTermAccess().getValueStringLiteralIDTerminalRuleCall_8_1_0_1(), semanticObject.eGet(GumboPackage.Literals.ENUM_LIT_EXPR__VALUE, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangTerm returns HasEventExpr
	 *
	 * Constraint:
	 *     eventPort=[Port|ID]
	 * </pre>
	 */
	protected void sequence_SlangTerm(ISerializationContext context, HasEventExpr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.HAS_EVENT_EXPR__EVENT_PORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.HAS_EVENT_EXPR__EVENT_PORT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSlangTermAccess().getEventPortPortIDTerminalRuleCall_6_1_0_1(), semanticObject.eGet(GumboPackage.Literals.HAS_EVENT_EXPR__EVENT_PORT, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangTerm returns InStateExpr
	 *
	 * Constraint:
	 *     stateVar=[StateVarDecl|ID]
	 * </pre>
	 */
	protected void sequence_SlangTerm(ISerializationContext context, InStateExpr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.IN_STATE_EXPR__STATE_VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.IN_STATE_EXPR__STATE_VAR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSlangTermAccess().getStateVarStateVarDeclIDTerminalRuleCall_2_1_0_1(), semanticObject.eGet(GumboPackage.Literals.IN_STATE_EXPR__STATE_VAR, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangTerm returns MaySendExpr
	 *
	 * Constraint:
	 *     (eventPort=[Port|ID] value=Expr?)
	 * </pre>
	 */
	protected void sequence_SlangTerm(ISerializationContext context, MaySendExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangTerm returns MustSendExpr
	 *
	 * Constraint:
	 *     (eventPort=[Port|ID] value=Expr?)
	 * </pre>
	 */
	protected void sequence_SlangTerm(ISerializationContext context, MustSendExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangTerm returns NoSendExpr
	 *
	 * Constraint:
	 *     eventPort=[Port|ID]
	 * </pre>
	 */
	protected void sequence_SlangTerm(ISerializationContext context, NoSendExpr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.NO_SEND_EXPR__EVENT_PORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.NO_SEND_EXPR__EVENT_PORT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSlangTermAccess().getEventPortPortIDTerminalRuleCall_5_1_0_1(), semanticObject.eGet(GumboPackage.Literals.NO_SEND_EXPR__EVENT_PORT, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangTerm returns ParenExpr
	 *
	 * Constraint:
	 *     exp=Expr
	 * </pre>
	 */
	protected void sequence_SlangTerm(ISerializationContext context, ParenExpr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.PAREN_EXPR__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.PAREN_EXPR__EXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSlangTermAccess().getExpExprParserRuleCall_11_2_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangTerm returns RecordLitExpr
	 *
	 * Constraint:
	 *     (recordType=DataElement args+=[NamedElement|ID] argExpr+=Expr (args+=[NamedElement|ID] argExpr+=Expr)*)
	 * </pre>
	 */
	protected void sequence_SlangTerm(ISerializationContext context, RecordLitExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangTerm returns SlangBlockTerm
	 *
	 * Constraint:
	 *     ((p=SlangParams? e=Expr) | (stmt+=SlangStmt* r=SlangRet?))
	 * </pre>
	 */
	protected void sequence_SlangTerm(ISerializationContext context, SlangBlockTerm semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangTerm returns SlangForTerm
	 *
	 * Constraint:
	 *     (r+=SlangForRange r+=SlangForRange* (b=SlangBlock | e=Expr))
	 * </pre>
	 */
	protected void sequence_SlangTerm(ISerializationContext context, SlangForTerm semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangTerm returns SlangInterpTerm
	 *
	 * Constraint:
	 *     i=SlangInterp
	 * </pre>
	 */
	protected void sequence_SlangTerm(ISerializationContext context, SlangInterpTerm semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.SLANG_INTERP_TERM__I) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.SLANG_INTERP_TERM__I));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSlangTermAccess().getISlangInterpParserRuleCall_1_1_0(), semanticObject.getI());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangTerm returns SlangLitTerm
	 *
	 * Constraint:
	 *     lit=SlangLit
	 * </pre>
	 */
	protected void sequence_SlangTerm(ISerializationContext context, SlangLitTerm semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.SLANG_LIT_TERM__LIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.SLANG_LIT_TERM__LIT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSlangTermAccess().getLitSlangLitParserRuleCall_0_1_0(), semanticObject.getLit());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SlangTypeArgs returns SlangTypeArgs
	 *
	 * Constraint:
	 *     (types+=SlangType types+=SlangType*)
	 * </pre>
	 */
	protected void sequence_SlangTypeArgs(ISerializationContext context, SlangTypeArgs semanticObject) {
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
	 *     SlangVarDeclDef returns SlangVarDef
	 *
	 * Constraint:
	 *     (name=ID typeName=SlangType init=Expr?)
	 * </pre>
	 */
	protected void sequence_SlangVarDeclDef(ISerializationContext context, SlangVarDef semanticObject) {
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
	 *     (name=ID typeName=[DataSubcomponentType|QCREF])
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
		feeder.accept(grammarAccess.getStateVarDeclAccess().getTypeNameDataSubcomponentTypeQCREFParserRuleCall_1_0_1(), semanticObject.eGet(GumboPackage.Literals.STATE_VAR_DECL__TYPE_NAME, false));
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
	
	
}
