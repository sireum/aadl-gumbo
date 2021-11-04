
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
import org.sireum.aadl.gumbo.gumbo.CaseStatementClause;
import org.sireum.aadl.gumbo.gumbo.Compute;
import org.sireum.aadl.gumbo.gumbo.FeatureElement;
import org.sireum.aadl.gumbo.gumbo.GuaranteeStatement;
import org.sireum.aadl.gumbo.gumbo.GumboLibrary;
import org.sireum.aadl.gumbo.gumbo.GumboPackage;
import org.sireum.aadl.gumbo.gumbo.GumboSubclause;
import org.sireum.aadl.gumbo.gumbo.Initialize;
import org.sireum.aadl.gumbo.gumbo.IntLit;
import org.sireum.aadl.gumbo.gumbo.Integration;
import org.sireum.aadl.gumbo.gumbo.InvSpec;
import org.sireum.aadl.gumbo.gumbo.Invariants;
import org.sireum.aadl.gumbo.gumbo.PortRef;
import org.sireum.aadl.gumbo.gumbo.SpecSection;
import org.sireum.aadl.gumbo.gumbo.State;
import org.sireum.aadl.gumbo.gumbo.StateVarDecl;
import org.sireum.aadl.gumbo.gumbo.StateVarRef;
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
				if (rule == grammarAccess.getExprRule()
						|| rule == grammarAccess.getImpliesExprRule()) {
					sequence_AndExpr_ExpExpr_ImpliesExpr_OrExpr_PlusExpr_RelationalExpr_TimesExpr(context, (BinaryExpr) semanticObject); 
					return; 
				}
				else if (action == grammarAccess.getImpliesExprAccess().getBinaryExprLeftAction_1_0_0_0()
						|| rule == grammarAccess.getOrExprRule()
						|| action == grammarAccess.getOrExprAccess().getBinaryExprLeftAction_1_0_0_0()) {
					sequence_AndExpr_ExpExpr_OrExpr_PlusExpr_RelationalExpr_TimesExpr(context, (BinaryExpr) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getAndExprRule()
						|| action == grammarAccess.getAndExprAccess().getBinaryExprLeftAction_1_0_0_0()) {
					sequence_AndExpr_ExpExpr_PlusExpr_RelationalExpr_TimesExpr(context, (BinaryExpr) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getExpExprRule()
						|| action == grammarAccess.getExpExprAccess().getBinaryExprLeftAction_1_0_0_0()) {
					sequence_ExpExpr(context, (BinaryExpr) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getRelationalExprRule()) {
					sequence_ExpExpr_PlusExpr_RelationalExpr_TimesExpr(context, (BinaryExpr) semanticObject); 
					return; 
				}
				else if (action == grammarAccess.getRelationalExprAccess().getBinaryExprLeftAction_1_0_0_0()
						|| rule == grammarAccess.getPlusExprRule()
						|| action == grammarAccess.getPlusExprAccess().getBinaryExprLeftAction_1_0_0_0()) {
					sequence_ExpExpr_PlusExpr_TimesExpr(context, (BinaryExpr) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTimesExprRule()
						|| action == grammarAccess.getTimesExprAccess().getBinaryExprLeftAction_1_0_0_0()) {
					sequence_ExpExpr_TimesExpr(context, (BinaryExpr) semanticObject); 
					return; 
				}
				else break;
			case GumboPackage.CASE_STATEMENT_CLAUSE:
				sequence_CaseStatementClause(context, (CaseStatementClause) semanticObject); 
				return; 
			case GumboPackage.COMPUTE:
				sequence_Compute(context, (Compute) semanticObject); 
				return; 
			case GumboPackage.FEATURE_ELEMENT:
				sequence_FeatureElement(context, (FeatureElement) semanticObject); 
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
			case GumboPackage.PORT_REF:
				sequence_AtomicExpr(context, (PortRef) semanticObject); 
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
			case GumboPackage.STATE_VAR_REF:
				sequence_AtomicExpr(context, (StateVarRef) semanticObject); 
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
	 *
	 * Constraint:
	 *     (
	 *         (left=ImpliesExpr_BinaryExpr_1_0_0_0 right=ImpliesExpr) | 
	 *         (left=OrExpr_BinaryExpr_1_0_0_0 (op='or' | op='orelse') right=AndExpr) | 
	 *         (left=AndExpr_BinaryExpr_1_0_0_0 (op='and' | op='andthen') right=RelationalExpr) | 
	 *         (left=RelationalExpr_BinaryExpr_1_0_0_0 op=RelationalOp right=PlusExpr) | 
	 *         (left=PlusExpr_BinaryExpr_1_0_0_0 (op='+' | op='-') right=TimesExpr) | 
	 *         (left=TimesExpr_BinaryExpr_1_0_0_0 (op='*' | op='/' | op='%') right=ExpExpr) | 
	 *         (left=ExpExpr_BinaryExpr_1_0_0_0 op='^' right=PrefixExpr)
	 *     )
	 */
	protected void sequence_AndExpr_ExpExpr_ImpliesExpr_OrExpr_PlusExpr_RelationalExpr_TimesExpr(ISerializationContext context, BinaryExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ImpliesExpr.BinaryExpr_1_0_0_0 returns BinaryExpr
	 *     OrExpr returns BinaryExpr
	 *     OrExpr.BinaryExpr_1_0_0_0 returns BinaryExpr
	 *
	 * Constraint:
	 *     (
	 *         (left=OrExpr_BinaryExpr_1_0_0_0 (op='or' | op='orelse') right=AndExpr) | 
	 *         (left=AndExpr_BinaryExpr_1_0_0_0 (op='and' | op='andthen') right=RelationalExpr) | 
	 *         (left=RelationalExpr_BinaryExpr_1_0_0_0 op=RelationalOp right=PlusExpr) | 
	 *         (left=PlusExpr_BinaryExpr_1_0_0_0 (op='+' | op='-') right=TimesExpr) | 
	 *         (left=TimesExpr_BinaryExpr_1_0_0_0 (op='*' | op='/' | op='%') right=ExpExpr) | 
	 *         (left=ExpExpr_BinaryExpr_1_0_0_0 op='^' right=PrefixExpr)
	 *     )
	 */
	protected void sequence_AndExpr_ExpExpr_OrExpr_PlusExpr_RelationalExpr_TimesExpr(ISerializationContext context, BinaryExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AndExpr returns BinaryExpr
	 *     AndExpr.BinaryExpr_1_0_0_0 returns BinaryExpr
	 *
	 * Constraint:
	 *     (
	 *         (left=AndExpr_BinaryExpr_1_0_0_0 (op='and' | op='andthen') right=RelationalExpr) | 
	 *         (left=RelationalExpr_BinaryExpr_1_0_0_0 op=RelationalOp right=PlusExpr) | 
	 *         (left=PlusExpr_BinaryExpr_1_0_0_0 (op='+' | op='-') right=TimesExpr) | 
	 *         (left=TimesExpr_BinaryExpr_1_0_0_0 (op='*' | op='/' | op='%') right=ExpExpr) | 
	 *         (left=ExpExpr_BinaryExpr_1_0_0_0 op='^' right=PrefixExpr)
	 *     )
	 */
	protected void sequence_AndExpr_ExpExpr_PlusExpr_RelationalExpr_TimesExpr(ISerializationContext context, BinaryExpr semanticObject) {
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
	 *     Expr returns IntLit
	 *     ImpliesExpr returns IntLit
	 *     ImpliesExpr.BinaryExpr_1_0_0_0 returns IntLit
	 *     OrExpr returns IntLit
	 *     OrExpr.BinaryExpr_1_0_0_0 returns IntLit
	 *     AndExpr returns IntLit
	 *     AndExpr.BinaryExpr_1_0_0_0 returns IntLit
	 *     RelationalExpr returns IntLit
	 *     RelationalExpr.BinaryExpr_1_0_0_0 returns IntLit
	 *     PlusExpr returns IntLit
	 *     PlusExpr.BinaryExpr_1_0_0_0 returns IntLit
	 *     TimesExpr returns IntLit
	 *     TimesExpr.BinaryExpr_1_0_0_0 returns IntLit
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
		feeder.accept(grammarAccess.getAtomicExprAccess().getValueINTEGER_LITTerminalRuleCall_2_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expr returns PortRef
	 *     ImpliesExpr returns PortRef
	 *     ImpliesExpr.BinaryExpr_1_0_0_0 returns PortRef
	 *     OrExpr returns PortRef
	 *     OrExpr.BinaryExpr_1_0_0_0 returns PortRef
	 *     AndExpr returns PortRef
	 *     AndExpr.BinaryExpr_1_0_0_0 returns PortRef
	 *     RelationalExpr returns PortRef
	 *     RelationalExpr.BinaryExpr_1_0_0_0 returns PortRef
	 *     PlusExpr returns PortRef
	 *     PlusExpr.BinaryExpr_1_0_0_0 returns PortRef
	 *     TimesExpr returns PortRef
	 *     TimesExpr.BinaryExpr_1_0_0_0 returns PortRef
	 *     ExpExpr returns PortRef
	 *     ExpExpr.BinaryExpr_1_0_0_0 returns PortRef
	 *     PrefixExpr returns PortRef
	 *     AtomicExpr returns PortRef
	 *
	 * Constraint:
	 *     portName=ID
	 */
	protected void sequence_AtomicExpr(ISerializationContext context, PortRef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.PORT_REF__PORT_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.PORT_REF__PORT_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomicExprAccess().getPortNameIDTerminalRuleCall_1_2_0(), semanticObject.getPortName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expr returns StateVarRef
	 *     ImpliesExpr returns StateVarRef
	 *     ImpliesExpr.BinaryExpr_1_0_0_0 returns StateVarRef
	 *     OrExpr returns StateVarRef
	 *     OrExpr.BinaryExpr_1_0_0_0 returns StateVarRef
	 *     AndExpr returns StateVarRef
	 *     AndExpr.BinaryExpr_1_0_0_0 returns StateVarRef
	 *     RelationalExpr returns StateVarRef
	 *     RelationalExpr.BinaryExpr_1_0_0_0 returns StateVarRef
	 *     PlusExpr returns StateVarRef
	 *     PlusExpr.BinaryExpr_1_0_0_0 returns StateVarRef
	 *     TimesExpr returns StateVarRef
	 *     TimesExpr.BinaryExpr_1_0_0_0 returns StateVarRef
	 *     ExpExpr returns StateVarRef
	 *     ExpExpr.BinaryExpr_1_0_0_0 returns StateVarRef
	 *     PrefixExpr returns StateVarRef
	 *     AtomicExpr returns StateVarRef
	 *
	 * Constraint:
	 *     stateVar=[StateVarDecl|ID]
	 */
	protected void sequence_AtomicExpr(ISerializationContext context, StateVarRef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.STATE_VAR_REF__STATE_VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.STATE_VAR_REF__STATE_VAR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomicExprAccess().getStateVarStateVarDeclIDTerminalRuleCall_0_2_0_1(), semanticObject.eGet(GumboPackage.Literals.STATE_VAR_REF__STATE_VAR, false));
		feeder.finish();
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
	 *     ExpExpr returns BinaryExpr
	 *     ExpExpr.BinaryExpr_1_0_0_0 returns BinaryExpr
	 *
	 * Constraint:
	 *     (left=ExpExpr_BinaryExpr_1_0_0_0 op='^' right=PrefixExpr)
	 */
	protected void sequence_ExpExpr(ISerializationContext context, BinaryExpr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.BINARY_EXPR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.BINARY_EXPR__LEFT));
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.BINARY_EXPR__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.BINARY_EXPR__OP));
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.BINARY_EXPR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.BINARY_EXPR__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpExprAccess().getBinaryExprLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpExprAccess().getOpCircumflexAccentKeyword_1_0_0_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getExpExprAccess().getRightPrefixExprParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RelationalExpr returns BinaryExpr
	 *
	 * Constraint:
	 *     (
	 *         (left=RelationalExpr_BinaryExpr_1_0_0_0 op=RelationalOp right=PlusExpr) | 
	 *         (left=PlusExpr_BinaryExpr_1_0_0_0 (op='+' | op='-') right=TimesExpr) | 
	 *         (left=TimesExpr_BinaryExpr_1_0_0_0 (op='*' | op='/' | op='%') right=ExpExpr) | 
	 *         (left=ExpExpr_BinaryExpr_1_0_0_0 op='^' right=PrefixExpr)
	 *     )
	 */
	protected void sequence_ExpExpr_PlusExpr_RelationalExpr_TimesExpr(ISerializationContext context, BinaryExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RelationalExpr.BinaryExpr_1_0_0_0 returns BinaryExpr
	 *     PlusExpr returns BinaryExpr
	 *     PlusExpr.BinaryExpr_1_0_0_0 returns BinaryExpr
	 *
	 * Constraint:
	 *     (
	 *         (left=PlusExpr_BinaryExpr_1_0_0_0 (op='+' | op='-') right=TimesExpr) | 
	 *         (left=TimesExpr_BinaryExpr_1_0_0_0 (op='*' | op='/' | op='%') right=ExpExpr) | 
	 *         (left=ExpExpr_BinaryExpr_1_0_0_0 op='^' right=PrefixExpr)
	 *     )
	 */
	protected void sequence_ExpExpr_PlusExpr_TimesExpr(ISerializationContext context, BinaryExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TimesExpr returns BinaryExpr
	 *     TimesExpr.BinaryExpr_1_0_0_0 returns BinaryExpr
	 *
	 * Constraint:
	 *     ((left=TimesExpr_BinaryExpr_1_0_0_0 (op='*' | op='/' | op='%') right=ExpExpr) | (left=ExpExpr_BinaryExpr_1_0_0_0 op='^' right=PrefixExpr))
	 */
	protected void sequence_ExpExpr_TimesExpr(ISerializationContext context, BinaryExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FeatureElement returns FeatureElement
	 *
	 * Constraint:
	 *     feature=[NamedElement|ID]
	 */
	protected void sequence_FeatureElement(ISerializationContext context, FeatureElement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.FEATURE_ELEMENT__FEATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.FEATURE_ELEMENT__FEATURE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFeatureElementAccess().getFeatureNamedElementIDTerminalRuleCall_0_1(), semanticObject.eGet(GumboPackage.Literals.FEATURE_ELEMENT__FEATURE, false));
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
	 *     Expr returns UnaryExpr
	 *     ImpliesExpr returns UnaryExpr
	 *     ImpliesExpr.BinaryExpr_1_0_0_0 returns UnaryExpr
	 *     OrExpr returns UnaryExpr
	 *     OrExpr.BinaryExpr_1_0_0_0 returns UnaryExpr
	 *     AndExpr returns UnaryExpr
	 *     AndExpr.BinaryExpr_1_0_0_0 returns UnaryExpr
	 *     RelationalExpr returns UnaryExpr
	 *     RelationalExpr.BinaryExpr_1_0_0_0 returns UnaryExpr
	 *     PlusExpr returns UnaryExpr
	 *     PlusExpr.BinaryExpr_1_0_0_0 returns UnaryExpr
	 *     TimesExpr returns UnaryExpr
	 *     TimesExpr.BinaryExpr_1_0_0_0 returns UnaryExpr
	 *     ExpExpr returns UnaryExpr
	 *     ExpExpr.BinaryExpr_1_0_0_0 returns UnaryExpr
	 *     PrefixExpr returns UnaryExpr
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
