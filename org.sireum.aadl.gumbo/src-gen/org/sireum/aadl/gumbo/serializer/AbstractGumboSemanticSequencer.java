
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
import org.sireum.aadl.gumbo.gumbo.BinaryExpr;
import org.sireum.aadl.gumbo.gumbo.BoolLitExpr;
import org.sireum.aadl.gumbo.gumbo.CaseStatementClause;
import org.sireum.aadl.gumbo.gumbo.Compute;
import org.sireum.aadl.gumbo.gumbo.DataElement;
import org.sireum.aadl.gumbo.gumbo.DataRefExpr;
import org.sireum.aadl.gumbo.gumbo.DoubleDotRef;
import org.sireum.aadl.gumbo.gumbo.EnumLitExpr;
import org.sireum.aadl.gumbo.gumbo.FloorCast;
import org.sireum.aadl.gumbo.gumbo.GuaranteeStatement;
import org.sireum.aadl.gumbo.gumbo.GumboLibrary;
import org.sireum.aadl.gumbo.gumbo.GumboPackage;
import org.sireum.aadl.gumbo.gumbo.GumboSubclause;
import org.sireum.aadl.gumbo.gumbo.Initialize;
import org.sireum.aadl.gumbo.gumbo.IntLit;
import org.sireum.aadl.gumbo.gumbo.Integration;
import org.sireum.aadl.gumbo.gumbo.InvSpec;
import org.sireum.aadl.gumbo.gumbo.Invariants;
import org.sireum.aadl.gumbo.gumbo.OtherDataRef;
import org.sireum.aadl.gumbo.gumbo.RealCast;
import org.sireum.aadl.gumbo.gumbo.RealLitExpr;
import org.sireum.aadl.gumbo.gumbo.RecordLitExpr;
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
			case GumboPackage.ANON_ASSUME_STATEMENT:
				sequence_AnonAssumeStatement(context, (AnonAssumeStatement) semanticObject); 
				return; 
			case GumboPackage.ANON_GUARANTEE_STATEMENT:
				sequence_AnonGuaranteeStatement(context, (AnonGuaranteeStatement) semanticObject); 
				return; 
			case GumboPackage.ASSUME_STATEMENT:
				sequence_AssumeStatement(context, (AssumeStatement) semanticObject); 
				return; 
			case GumboPackage.BINARY_EXPR:
				sequence_AddSubExpr_AndExpr_EquivExpr_ExpExpr_ImpliesExpr_MultDivModExpr_OrExpr_RelationalExpr(context, (BinaryExpr) semanticObject); 
				return; 
			case GumboPackage.BOOL_LIT_EXPR:
				sequence_AtomicExpr(context, (BoolLitExpr) semanticObject); 
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
				sequence_AtomicExpr(context, (DataRefExpr) semanticObject); 
				return; 
			case GumboPackage.DOUBLE_DOT_REF:
				sequence_DoubleDotRef(context, (DoubleDotRef) semanticObject); 
				return; 
			case GumboPackage.ENUM_LIT_EXPR:
				sequence_AtomicExpr(context, (EnumLitExpr) semanticObject); 
				return; 
			case GumboPackage.FLOOR_CAST:
				sequence_AtomicExpr(context, (FloorCast) semanticObject); 
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
			case GumboPackage.INITIALIZE:
				sequence_Initialize(context, (Initialize) semanticObject); 
				return; 
			case GumboPackage.INT_LIT:
				sequence_AtomicExpr(context, (IntLit) semanticObject); 
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
			case GumboPackage.OTHER_DATA_REF:
				sequence_OtherDataRef(context, (OtherDataRef) semanticObject); 
				return; 
			case GumboPackage.REAL_CAST:
				sequence_AtomicExpr(context, (RealCast) semanticObject); 
				return; 
			case GumboPackage.REAL_LIT_EXPR:
				sequence_AtomicExpr(context, (RealLitExpr) semanticObject); 
				return; 
			case GumboPackage.RECORD_LIT_EXPR:
				sequence_AtomicExpr(context, (RecordLitExpr) semanticObject); 
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
				sequence_PrefixExpr(context, (UnaryExpr) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Expr returns BinaryExpr
	 *     ImpliesExpr returns BinaryExpr
	 *     ImpliesExpr.BinaryExpr_1_0_0_0 returns BinaryExpr
	 *     EquivExpr returns BinaryExpr
	 *     EquivExpr.BinaryExpr_1_0_0_0 returns BinaryExpr
	 *     OrExpr returns BinaryExpr
	 *     OrExpr.BinaryExpr_1_0_0_0 returns BinaryExpr
	 *     AndExpr returns BinaryExpr
	 *     AndExpr.BinaryExpr_1_0_0_0 returns BinaryExpr
	 *     RelationalExpr returns BinaryExpr
	 *     RelationalExpr.BinaryExpr_1_0_0_0 returns BinaryExpr
	 *     AddSubExpr returns BinaryExpr
	 *     AddSubExpr.BinaryExpr_1_0_0_0 returns BinaryExpr
	 *     MultDivModExpr returns BinaryExpr
	 *     MultDivModExpr.BinaryExpr_1_0_0_0 returns BinaryExpr
	 *     ExpExpr returns BinaryExpr
	 *     ExpExpr.BinaryExpr_1_0_0_0 returns BinaryExpr
	 *     PrefixExpr returns BinaryExpr
	 *     AtomicExpr returns BinaryExpr
	 *
	 * Constraint:
	 *     (
	 *         (left=ImpliesExpr_BinaryExpr_1_0_0_0 right=ImpliesExpr) | 
	 *         (left=EquivExpr_BinaryExpr_1_0_0_0 op='<=>' right=OrExpr) | 
	 *         (left=OrExpr_BinaryExpr_1_0_0_0 (op='or' | op='orelse') right=AndExpr) | 
	 *         (left=AndExpr_BinaryExpr_1_0_0_0 (op='and' | op='andthen') right=RelationalExpr) | 
	 *         (left=RelationalExpr_BinaryExpr_1_0_0_0 op=RelationalOp right=AddSubExpr) | 
	 *         (left=AddSubExpr_BinaryExpr_1_0_0_0 (op='+' | op='-') right=MultDivModExpr) | 
	 *         (left=MultDivModExpr_BinaryExpr_1_0_0_0 (op='*' | op='/' | op='%') right=ExpExpr) | 
	 *         (left=ExpExpr_BinaryExpr_1_0_0_0 op='^' right=PrefixExpr)
	 *     )
	 */
	protected void sequence_AddSubExpr_AndExpr_EquivExpr_ExpExpr_ImpliesExpr_MultDivModExpr_OrExpr_RelationalExpr(ISerializationContext context, BinaryExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AnonAssumeStatement returns AnonAssumeStatement
	 *
	 * Constraint:
	 *     expr=Expr
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
	 * Contexts:
	 *     AnonGuaranteeStatement returns AnonGuaranteeStatement
	 *
	 * Constraint:
	 *     expr=Expr
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
	 * Contexts:
	 *     SpecStatement returns AssumeStatement
	 *     AssumeStatement returns AssumeStatement
	 *
	 * Constraint:
	 *     (displayName=STRING expr=Expr)
	 */
	protected void sequence_AssumeStatement(ISerializationContext context, AssumeStatement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.SPEC_STATEMENT__DISPLAY_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.SPEC_STATEMENT__DISPLAY_NAME));
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.SPEC_STATEMENT__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.SPEC_STATEMENT__EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAssumeStatementAccess().getDisplayNameSTRINGTerminalRuleCall_1_0(), semanticObject.getDisplayName());
		feeder.accept(grammarAccess.getAssumeStatementAccess().getExprExprParserRuleCall_3_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expr returns BoolLitExpr
	 *     ImpliesExpr returns BoolLitExpr
	 *     ImpliesExpr.BinaryExpr_1_0_0_0 returns BoolLitExpr
	 *     EquivExpr returns BoolLitExpr
	 *     EquivExpr.BinaryExpr_1_0_0_0 returns BoolLitExpr
	 *     OrExpr returns BoolLitExpr
	 *     OrExpr.BinaryExpr_1_0_0_0 returns BoolLitExpr
	 *     AndExpr returns BoolLitExpr
	 *     AndExpr.BinaryExpr_1_0_0_0 returns BoolLitExpr
	 *     RelationalExpr returns BoolLitExpr
	 *     RelationalExpr.BinaryExpr_1_0_0_0 returns BoolLitExpr
	 *     AddSubExpr returns BoolLitExpr
	 *     AddSubExpr.BinaryExpr_1_0_0_0 returns BoolLitExpr
	 *     MultDivModExpr returns BoolLitExpr
	 *     MultDivModExpr.BinaryExpr_1_0_0_0 returns BoolLitExpr
	 *     ExpExpr returns BoolLitExpr
	 *     ExpExpr.BinaryExpr_1_0_0_0 returns BoolLitExpr
	 *     PrefixExpr returns BoolLitExpr
	 *     AtomicExpr returns BoolLitExpr
	 *
	 * Constraint:
	 *     val=BooleanLiteral
	 */
	protected void sequence_AtomicExpr(ISerializationContext context, BoolLitExpr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.BOOL_LIT_EXPR__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.BOOL_LIT_EXPR__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomicExprAccess().getValBooleanLiteralParserRuleCall_5_1_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expr returns DataRefExpr
	 *     ImpliesExpr returns DataRefExpr
	 *     ImpliesExpr.BinaryExpr_1_0_0_0 returns DataRefExpr
	 *     EquivExpr returns DataRefExpr
	 *     EquivExpr.BinaryExpr_1_0_0_0 returns DataRefExpr
	 *     OrExpr returns DataRefExpr
	 *     OrExpr.BinaryExpr_1_0_0_0 returns DataRefExpr
	 *     AndExpr returns DataRefExpr
	 *     AndExpr.BinaryExpr_1_0_0_0 returns DataRefExpr
	 *     RelationalExpr returns DataRefExpr
	 *     RelationalExpr.BinaryExpr_1_0_0_0 returns DataRefExpr
	 *     AddSubExpr returns DataRefExpr
	 *     AddSubExpr.BinaryExpr_1_0_0_0 returns DataRefExpr
	 *     MultDivModExpr returns DataRefExpr
	 *     MultDivModExpr.BinaryExpr_1_0_0_0 returns DataRefExpr
	 *     ExpExpr returns DataRefExpr
	 *     ExpExpr.BinaryExpr_1_0_0_0 returns DataRefExpr
	 *     PrefixExpr returns DataRefExpr
	 *     AtomicExpr returns DataRefExpr
	 *
	 * Constraint:
	 *     (portOrSubcomponentOrStateVar=[EObject|ID] ref=OtherDataRef?)
	 */
	protected void sequence_AtomicExpr(ISerializationContext context, DataRefExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expr returns EnumLitExpr
	 *     ImpliesExpr returns EnumLitExpr
	 *     ImpliesExpr.BinaryExpr_1_0_0_0 returns EnumLitExpr
	 *     EquivExpr returns EnumLitExpr
	 *     EquivExpr.BinaryExpr_1_0_0_0 returns EnumLitExpr
	 *     OrExpr returns EnumLitExpr
	 *     OrExpr.BinaryExpr_1_0_0_0 returns EnumLitExpr
	 *     AndExpr returns EnumLitExpr
	 *     AndExpr.BinaryExpr_1_0_0_0 returns EnumLitExpr
	 *     RelationalExpr returns EnumLitExpr
	 *     RelationalExpr.BinaryExpr_1_0_0_0 returns EnumLitExpr
	 *     AddSubExpr returns EnumLitExpr
	 *     AddSubExpr.BinaryExpr_1_0_0_0 returns EnumLitExpr
	 *     MultDivModExpr returns EnumLitExpr
	 *     MultDivModExpr.BinaryExpr_1_0_0_0 returns EnumLitExpr
	 *     ExpExpr returns EnumLitExpr
	 *     ExpExpr.BinaryExpr_1_0_0_0 returns EnumLitExpr
	 *     PrefixExpr returns EnumLitExpr
	 *     AtomicExpr returns EnumLitExpr
	 *
	 * Constraint:
	 *     (enumType=DataElement value=[StringLiteral|ID])
	 */
	protected void sequence_AtomicExpr(ISerializationContext context, EnumLitExpr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.ENUM_LIT_EXPR__ENUM_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.ENUM_LIT_EXPR__ENUM_TYPE));
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.ENUM_LIT_EXPR__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.ENUM_LIT_EXPR__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomicExprAccess().getEnumTypeDataElementParserRuleCall_1_1_0(), semanticObject.getEnumType());
		feeder.accept(grammarAccess.getAtomicExprAccess().getValueStringLiteralIDTerminalRuleCall_1_3_0_1(), semanticObject.eGet(GumboPackage.Literals.ENUM_LIT_EXPR__VALUE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expr returns FloorCast
	 *     ImpliesExpr returns FloorCast
	 *     ImpliesExpr.BinaryExpr_1_0_0_0 returns FloorCast
	 *     EquivExpr returns FloorCast
	 *     EquivExpr.BinaryExpr_1_0_0_0 returns FloorCast
	 *     OrExpr returns FloorCast
	 *     OrExpr.BinaryExpr_1_0_0_0 returns FloorCast
	 *     AndExpr returns FloorCast
	 *     AndExpr.BinaryExpr_1_0_0_0 returns FloorCast
	 *     RelationalExpr returns FloorCast
	 *     RelationalExpr.BinaryExpr_1_0_0_0 returns FloorCast
	 *     AddSubExpr returns FloorCast
	 *     AddSubExpr.BinaryExpr_1_0_0_0 returns FloorCast
	 *     MultDivModExpr returns FloorCast
	 *     MultDivModExpr.BinaryExpr_1_0_0_0 returns FloorCast
	 *     ExpExpr returns FloorCast
	 *     ExpExpr.BinaryExpr_1_0_0_0 returns FloorCast
	 *     PrefixExpr returns FloorCast
	 *     AtomicExpr returns FloorCast
	 *
	 * Constraint:
	 *     expr=Expr
	 */
	protected void sequence_AtomicExpr(ISerializationContext context, FloorCast semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.FLOOR_CAST__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.FLOOR_CAST__EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomicExprAccess().getExprExprParserRuleCall_6_3_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expr returns IntLit
	 *     ImpliesExpr returns IntLit
	 *     ImpliesExpr.BinaryExpr_1_0_0_0 returns IntLit
	 *     EquivExpr returns IntLit
	 *     EquivExpr.BinaryExpr_1_0_0_0 returns IntLit
	 *     OrExpr returns IntLit
	 *     OrExpr.BinaryExpr_1_0_0_0 returns IntLit
	 *     AndExpr returns IntLit
	 *     AndExpr.BinaryExpr_1_0_0_0 returns IntLit
	 *     RelationalExpr returns IntLit
	 *     RelationalExpr.BinaryExpr_1_0_0_0 returns IntLit
	 *     AddSubExpr returns IntLit
	 *     AddSubExpr.BinaryExpr_1_0_0_0 returns IntLit
	 *     MultDivModExpr returns IntLit
	 *     MultDivModExpr.BinaryExpr_1_0_0_0 returns IntLit
	 *     ExpExpr returns IntLit
	 *     ExpExpr.BinaryExpr_1_0_0_0 returns IntLit
	 *     PrefixExpr returns IntLit
	 *     AtomicExpr returns IntLit
	 *
	 * Constraint:
	 *     value=INTEGER_LIT
	 */
	protected void sequence_AtomicExpr(ISerializationContext context, IntLit semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.INT_LIT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.INT_LIT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomicExprAccess().getValueINTEGER_LITTerminalRuleCall_3_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expr returns RealCast
	 *     ImpliesExpr returns RealCast
	 *     ImpliesExpr.BinaryExpr_1_0_0_0 returns RealCast
	 *     EquivExpr returns RealCast
	 *     EquivExpr.BinaryExpr_1_0_0_0 returns RealCast
	 *     OrExpr returns RealCast
	 *     OrExpr.BinaryExpr_1_0_0_0 returns RealCast
	 *     AndExpr returns RealCast
	 *     AndExpr.BinaryExpr_1_0_0_0 returns RealCast
	 *     RelationalExpr returns RealCast
	 *     RelationalExpr.BinaryExpr_1_0_0_0 returns RealCast
	 *     AddSubExpr returns RealCast
	 *     AddSubExpr.BinaryExpr_1_0_0_0 returns RealCast
	 *     MultDivModExpr returns RealCast
	 *     MultDivModExpr.BinaryExpr_1_0_0_0 returns RealCast
	 *     ExpExpr returns RealCast
	 *     ExpExpr.BinaryExpr_1_0_0_0 returns RealCast
	 *     PrefixExpr returns RealCast
	 *     AtomicExpr returns RealCast
	 *
	 * Constraint:
	 *     expr=Expr
	 */
	protected void sequence_AtomicExpr(ISerializationContext context, RealCast semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.REAL_CAST__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.REAL_CAST__EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomicExprAccess().getExprExprParserRuleCall_7_3_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expr returns RealLitExpr
	 *     ImpliesExpr returns RealLitExpr
	 *     ImpliesExpr.BinaryExpr_1_0_0_0 returns RealLitExpr
	 *     EquivExpr returns RealLitExpr
	 *     EquivExpr.BinaryExpr_1_0_0_0 returns RealLitExpr
	 *     OrExpr returns RealLitExpr
	 *     OrExpr.BinaryExpr_1_0_0_0 returns RealLitExpr
	 *     AndExpr returns RealLitExpr
	 *     AndExpr.BinaryExpr_1_0_0_0 returns RealLitExpr
	 *     RelationalExpr returns RealLitExpr
	 *     RelationalExpr.BinaryExpr_1_0_0_0 returns RealLitExpr
	 *     AddSubExpr returns RealLitExpr
	 *     AddSubExpr.BinaryExpr_1_0_0_0 returns RealLitExpr
	 *     MultDivModExpr returns RealLitExpr
	 *     MultDivModExpr.BinaryExpr_1_0_0_0 returns RealLitExpr
	 *     ExpExpr returns RealLitExpr
	 *     ExpExpr.BinaryExpr_1_0_0_0 returns RealLitExpr
	 *     PrefixExpr returns RealLitExpr
	 *     AtomicExpr returns RealLitExpr
	 *
	 * Constraint:
	 *     val=REAL_LIT
	 */
	protected void sequence_AtomicExpr(ISerializationContext context, RealLitExpr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.REAL_LIT_EXPR__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.REAL_LIT_EXPR__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomicExprAccess().getValREAL_LITTerminalRuleCall_4_1_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expr returns RecordLitExpr
	 *     ImpliesExpr returns RecordLitExpr
	 *     ImpliesExpr.BinaryExpr_1_0_0_0 returns RecordLitExpr
	 *     EquivExpr returns RecordLitExpr
	 *     EquivExpr.BinaryExpr_1_0_0_0 returns RecordLitExpr
	 *     OrExpr returns RecordLitExpr
	 *     OrExpr.BinaryExpr_1_0_0_0 returns RecordLitExpr
	 *     AndExpr returns RecordLitExpr
	 *     AndExpr.BinaryExpr_1_0_0_0 returns RecordLitExpr
	 *     RelationalExpr returns RecordLitExpr
	 *     RelationalExpr.BinaryExpr_1_0_0_0 returns RecordLitExpr
	 *     AddSubExpr returns RecordLitExpr
	 *     AddSubExpr.BinaryExpr_1_0_0_0 returns RecordLitExpr
	 *     MultDivModExpr returns RecordLitExpr
	 *     MultDivModExpr.BinaryExpr_1_0_0_0 returns RecordLitExpr
	 *     ExpExpr returns RecordLitExpr
	 *     ExpExpr.BinaryExpr_1_0_0_0 returns RecordLitExpr
	 *     PrefixExpr returns RecordLitExpr
	 *     AtomicExpr returns RecordLitExpr
	 *
	 * Constraint:
	 *     (recordType=DataElement args+=[NamedElement|ID] argExpr+=Expr (args+=[NamedElement|ID] argExpr+=Expr)*)
	 */
	protected void sequence_AtomicExpr(ISerializationContext context, RecordLitExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CaseStatementClause returns CaseStatementClause
	 *
	 * Constraint:
	 *     (displayName=STRING assumeStatement=AnonAssumeStatement guaranteeStatement=AnonGuaranteeStatement)
	 */
	protected void sequence_CaseStatementClause(ISerializationContext context, CaseStatementClause semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.CASE_STATEMENT_CLAUSE__DISPLAY_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.CASE_STATEMENT_CLAUSE__DISPLAY_NAME));
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.CASE_STATEMENT_CLAUSE__ASSUME_STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.CASE_STATEMENT_CLAUSE__ASSUME_STATEMENT));
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.CASE_STATEMENT_CLAUSE__GUARANTEE_STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.CASE_STATEMENT_CLAUSE__GUARANTEE_STATEMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCaseStatementClauseAccess().getDisplayNameSTRINGTerminalRuleCall_1_0(), semanticObject.getDisplayName());
		feeder.accept(grammarAccess.getCaseStatementClauseAccess().getAssumeStatementAnonAssumeStatementParserRuleCall_3_0(), semanticObject.getAssumeStatement());
		feeder.accept(grammarAccess.getCaseStatementClauseAccess().getGuaranteeStatementAnonGuaranteeStatementParserRuleCall_4_0(), semanticObject.getGuaranteeStatement());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Compute returns Compute
	 *
	 * Constraint:
	 *     cases+=CaseStatementClause+
	 */
	protected void sequence_Compute(ISerializationContext context, Compute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DataElement returns DataElement
	 *
	 * Constraint:
	 *     dataElement=[DataSubcomponentType|QCREF]
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
	 * Contexts:
	 *     DoubleDotRef returns DoubleDotRef
	 *
	 * Constraint:
	 *     elm=[NamedElement|QCREF]
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
	 * Contexts:
	 *     InitializeSpecStatement returns GuaranteeStatement
	 *     SpecStatement returns GuaranteeStatement
	 *     GuaranteeStatement returns GuaranteeStatement
	 *
	 * Constraint:
	 *     (displayName=STRING expr=Expr)
	 */
	protected void sequence_GuaranteeStatement(ISerializationContext context, GuaranteeStatement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.SPEC_STATEMENT__DISPLAY_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.SPEC_STATEMENT__DISPLAY_NAME));
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.SPEC_STATEMENT__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.SPEC_STATEMENT__EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGuaranteeStatementAccess().getDisplayNameSTRINGTerminalRuleCall_1_0(), semanticObject.getDisplayName());
		feeder.accept(grammarAccess.getGuaranteeStatementAccess().getExprExprParserRuleCall_3_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AnnexLibrary returns GumboLibrary
	 *     GumboLibrary returns GumboLibrary
	 *
	 * Constraint:
	 *     {GumboLibrary}
	 */
	protected void sequence_GumboLibrary(ISerializationContext context, GumboLibrary semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AnnexSubclause returns GumboSubclause
	 *     GumboSubclause returns GumboSubclause
	 *
	 * Constraint:
	 *     specs=SpecSection
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
	 * Contexts:
	 *     Initialize returns Initialize
	 *
	 * Constraint:
	 *     specs+=InitializeSpecStatement+
	 */
	protected void sequence_Initialize(ISerializationContext context, Initialize semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Integration returns Integration
	 *
	 * Constraint:
	 *     specs+=SpecStatement+
	 */
	protected void sequence_Integration(ISerializationContext context, Integration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     InvSpec returns InvSpec
	 *
	 * Constraint:
	 *     (displayName=STRING expr=Expr)
	 */
	protected void sequence_InvSpec(ISerializationContext context, InvSpec semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.INV_SPEC__DISPLAY_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.INV_SPEC__DISPLAY_NAME));
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.INV_SPEC__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.INV_SPEC__EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInvSpecAccess().getDisplayNameSTRINGTerminalRuleCall_1_0(), semanticObject.getDisplayName());
		feeder.accept(grammarAccess.getInvSpecAccess().getExprExprParserRuleCall_3_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Invariants returns Invariants
	 *
	 * Constraint:
	 *     specs+=InvSpec+
	 */
	protected void sequence_Invariants(ISerializationContext context, Invariants semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     OtherDataRef returns OtherDataRef
	 *
	 * Constraint:
	 *     (namedElement=[NamedElement|ID] path=OtherDataRef?)
	 */
	protected void sequence_OtherDataRef(ISerializationContext context, OtherDataRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expr returns UnaryExpr
	 *     ImpliesExpr returns UnaryExpr
	 *     ImpliesExpr.BinaryExpr_1_0_0_0 returns UnaryExpr
	 *     EquivExpr returns UnaryExpr
	 *     EquivExpr.BinaryExpr_1_0_0_0 returns UnaryExpr
	 *     OrExpr returns UnaryExpr
	 *     OrExpr.BinaryExpr_1_0_0_0 returns UnaryExpr
	 *     AndExpr returns UnaryExpr
	 *     AndExpr.BinaryExpr_1_0_0_0 returns UnaryExpr
	 *     RelationalExpr returns UnaryExpr
	 *     RelationalExpr.BinaryExpr_1_0_0_0 returns UnaryExpr
	 *     AddSubExpr returns UnaryExpr
	 *     AddSubExpr.BinaryExpr_1_0_0_0 returns UnaryExpr
	 *     MultDivModExpr returns UnaryExpr
	 *     MultDivModExpr.BinaryExpr_1_0_0_0 returns UnaryExpr
	 *     ExpExpr returns UnaryExpr
	 *     ExpExpr.BinaryExpr_1_0_0_0 returns UnaryExpr
	 *     PrefixExpr returns UnaryExpr
	 *     AtomicExpr returns UnaryExpr
	 *
	 * Constraint:
	 *     ((op='-' | op='not') expr=PrefixExpr)
	 */
	protected void sequence_PrefixExpr(ISerializationContext context, UnaryExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SpecSection returns SpecSection
	 *
	 * Constraint:
	 *     (
	 *         (state=State ((integration=Integration compute=Compute) | compute=Compute)) | 
	 *         (((state=State invariants=Invariants) | invariants=Invariants) ((integration=Integration compute=Compute) | compute=Compute)) | 
	 *         (
	 *             (
	 *                 (state=State ((invariants=Invariants integration=Integration) | integration=Integration)) | 
	 *                 (invariants=Invariants integration=Integration) | 
	 *                 integration=Integration
	 *             )? 
	 *             initialize=Initialize 
	 *             compute=Compute
	 *         ) | 
	 *         (integration=Integration compute=Compute) | 
	 *         compute=Compute
	 *     )?
	 */
	protected void sequence_SpecSection(ISerializationContext context, SpecSection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StateVarDecl returns StateVarDecl
	 *
	 * Constraint:
	 *     (name=ID typeName=[DataSubcomponentType|QCREF])
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
	 * Contexts:
	 *     State returns State
	 *
	 * Constraint:
	 *     decls+=StateVarDecl+
	 */
	protected void sequence_State(ISerializationContext context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SubcomponentElement returns SubcomponentElement
	 *
	 * Constraint:
	 *     subcomponent=[Subcomponent|ID]
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
