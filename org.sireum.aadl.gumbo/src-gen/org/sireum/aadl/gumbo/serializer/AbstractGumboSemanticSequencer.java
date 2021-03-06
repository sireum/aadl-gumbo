
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
import org.sireum.aadl.gumbo.gumbo.AssumeStatement;
import org.sireum.aadl.gumbo.gumbo.BinaryExpr;
import org.sireum.aadl.gumbo.gumbo.Contract;
import org.sireum.aadl.gumbo.gumbo.FeatureElement;
import org.sireum.aadl.gumbo.gumbo.Flow;
import org.sireum.aadl.gumbo.gumbo.Flows;
import org.sireum.aadl.gumbo.gumbo.GuaranteeStatement;
import org.sireum.aadl.gumbo.gumbo.GumboLibrary;
import org.sireum.aadl.gumbo.gumbo.GumboPackage;
import org.sireum.aadl.gumbo.gumbo.GumboSubclause;
import org.sireum.aadl.gumbo.gumbo.HyperperiodComputationalModel;
import org.sireum.aadl.gumbo.gumbo.IdExpr;
import org.sireum.aadl.gumbo.gumbo.PeriodicComputationalModel;
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
			case GumboPackage.ASSUME_STATEMENT:
				sequence_SpecStatement(context, (AssumeStatement) semanticObject); 
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
			case GumboPackage.CONTRACT:
				sequence_Contract(context, (Contract) semanticObject); 
				return; 
			case GumboPackage.FEATURE_ELEMENT:
				sequence_FeatureElement(context, (FeatureElement) semanticObject); 
				return; 
			case GumboPackage.FLOW:
				sequence_Flow(context, (Flow) semanticObject); 
				return; 
			case GumboPackage.FLOWS:
				sequence_Flows(context, (Flows) semanticObject); 
				return; 
			case GumboPackage.GUARANTEE_STATEMENT:
				sequence_SpecStatement(context, (GuaranteeStatement) semanticObject); 
				return; 
			case GumboPackage.GUMBO_LIBRARY:
				sequence_GumboLibrary(context, (GumboLibrary) semanticObject); 
				return; 
			case GumboPackage.GUMBO_SUBCLAUSE:
				sequence_GumboSubclause(context, (GumboSubclause) semanticObject); 
				return; 
			case GumboPackage.HYPERPERIOD_COMPUTATIONAL_MODEL:
				sequence_ComputationalModel(context, (HyperperiodComputationalModel) semanticObject); 
				return; 
			case GumboPackage.ID_EXPR:
				sequence_AtomicExpr(context, (IdExpr) semanticObject); 
				return; 
			case GumboPackage.PERIODIC_COMPUTATIONAL_MODEL:
				sequence_ComputationalModel(context, (PeriodicComputationalModel) semanticObject); 
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
	 *     Expr returns IdExpr
	 *     ImpliesExpr returns IdExpr
	 *     ImpliesExpr.BinaryExpr_1_0_0_0 returns IdExpr
	 *     OrExpr returns IdExpr
	 *     OrExpr.BinaryExpr_1_0_0_0 returns IdExpr
	 *     AndExpr returns IdExpr
	 *     AndExpr.BinaryExpr_1_0_0_0 returns IdExpr
	 *     RelationalExpr returns IdExpr
	 *     RelationalExpr.BinaryExpr_1_0_0_0 returns IdExpr
	 *     PlusExpr returns IdExpr
	 *     PlusExpr.BinaryExpr_1_0_0_0 returns IdExpr
	 *     TimesExpr returns IdExpr
	 *     TimesExpr.BinaryExpr_1_0_0_0 returns IdExpr
	 *     ExpExpr returns IdExpr
	 *     ExpExpr.BinaryExpr_1_0_0_0 returns IdExpr
	 *     PrefixExpr returns IdExpr
	 *     AtomicExpr returns IdExpr
	 *
	 * Constraint:
	 *     id=[NamedElement|QCREF]
	 */
	protected void sequence_AtomicExpr(ISerializationContext context, IdExpr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.ID_EXPR__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.ID_EXPR__ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomicExprAccess().getIdNamedElementQCREFParserRuleCall_1_0_1(), semanticObject.eGet(GumboPackage.Literals.ID_EXPR__ID, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SpecSection returns HyperperiodComputationalModel
	 *     ComputationalModel returns HyperperiodComputationalModel
	 *
	 * Constraint:
	 *     (constraints+=[NamedElement|ID] constraints+=[NamedElement|ID]*)
	 */
	protected void sequence_ComputationalModel(ISerializationContext context, HyperperiodComputationalModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SpecSection returns PeriodicComputationalModel
	 *     ComputationalModel returns PeriodicComputationalModel
	 *
	 * Constraint:
	 *     {PeriodicComputationalModel}
	 */
	protected void sequence_ComputationalModel(ISerializationContext context, PeriodicComputationalModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SpecSection returns Contract
	 *     Contract returns Contract
	 *
	 * Constraint:
	 *     specs+=SpecStatement+
	 */
	protected void sequence_Contract(ISerializationContext context, Contract semanticObject) {
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
	 *     Flow returns Flow
	 *
	 * Constraint:
	 *     (flowId=ID srcPorts+=FeatureElement srcPorts+=FeatureElement* dstPorts+=FeatureElement dstPorts+=FeatureElement*)
	 */
	protected void sequence_Flow(ISerializationContext context, Flow semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SpecSection returns Flows
	 *     Flows returns Flows
	 *
	 * Constraint:
	 *     flows+=Flow+
	 */
	protected void sequence_Flows(ISerializationContext context, Flows semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     specs+=SpecSection*
	 */
	protected void sequence_GumboSubclause(ISerializationContext context, GumboSubclause semanticObject) {
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
	 *     SpecStatement returns AssumeStatement
	 *
	 * Constraint:
	 *     (forPort=[NamedElement|ID]? assumeTitle=STRING pred=PREDICATE tracesTo=ID?)
	 */
	protected void sequence_SpecStatement(ISerializationContext context, AssumeStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SpecStatement returns GuaranteeStatement
	 *
	 * Constraint:
	 *     (guaranteeTitle=STRING expr=Expr)
	 */
	protected void sequence_SpecStatement(ISerializationContext context, GuaranteeStatement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.GUARANTEE_STATEMENT__GUARANTEE_TITLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.GUARANTEE_STATEMENT__GUARANTEE_TITLE));
			if (transientValues.isValueTransient(semanticObject, GumboPackage.Literals.GUARANTEE_STATEMENT__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GumboPackage.Literals.GUARANTEE_STATEMENT__EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSpecStatementAccess().getGuaranteeTitleSTRINGTerminalRuleCall_1_2_0(), semanticObject.getGuaranteeTitle());
		feeder.accept(grammarAccess.getSpecStatementAccess().getExprExprParserRuleCall_1_4_0(), semanticObject.getExpr());
		feeder.finish();
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
