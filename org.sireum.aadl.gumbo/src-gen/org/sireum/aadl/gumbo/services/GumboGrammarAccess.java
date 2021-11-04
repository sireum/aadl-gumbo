
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
package org.sireum.aadl.gumbo.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;
import org.osate.xtext.aadl2.properties.services.PropertiesGrammarAccess;

@Singleton
public class GumboGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class AnnexLibraryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.AnnexLibrary");
		private final RuleCall cGumboLibraryParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//AnnexLibrary returns aadl2::AnnexLibrary:
		//    GumboLibrary
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//GumboLibrary
		public RuleCall getGumboLibraryParserRuleCall() { return cGumboLibraryParserRuleCall; }
	}
	public class AnnexSubclauseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.AnnexSubclause");
		private final RuleCall cGumboSubclauseParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//AnnexSubclause returns aadl2::AnnexSubclause:
		//    GumboSubclause
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//GumboSubclause
		public RuleCall getGumboSubclauseParserRuleCall() { return cGumboSubclauseParserRuleCall; }
	}
	public class GumboLibraryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.GumboLibrary");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cGumboLibraryAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLibraryKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cForKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cGumboKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//GumboLibrary returns GumboLibrary:
		//    {GumboLibrary}
		//    'library' 'for' 'gumbo'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{GumboLibrary}
		//'library' 'for' 'gumbo'
		public Group getGroup() { return cGroup; }
		
		//{GumboLibrary}
		public Action getGumboLibraryAction_0() { return cGumboLibraryAction_0; }
		
		//'library'
		public Keyword getLibraryKeyword_1() { return cLibraryKeyword_1; }
		
		//'for'
		public Keyword getForKeyword_2() { return cForKeyword_2; }
		
		//'gumbo'
		public Keyword getGumboKeyword_3() { return cGumboKeyword_3; }
	}
	public class GumboSubclauseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.GumboSubclause");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cGumboSubclauseAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cSpecsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSpecsSpecSectionParserRuleCall_1_0 = (RuleCall)cSpecsAssignment_1.eContents().get(0);
		
		//GumboSubclause returns GumboSubclause:
		//    {GumboSubclause}
		////    specs+=SpecSection*
		//    specs=SpecSection
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//    {GumboSubclause}
		////    specs+=SpecSection*
		//    specs=SpecSection
		public Group getGroup() { return cGroup; }
		
		//{GumboSubclause}
		public Action getGumboSubclauseAction_0() { return cGumboSubclauseAction_0; }
		
		////    specs+=SpecSection*
		//    specs=SpecSection
		public Assignment getSpecsAssignment_1() { return cSpecsAssignment_1; }
		
		//SpecSection
		public RuleCall getSpecsSpecSectionParserRuleCall_1_0() { return cSpecsSpecSectionParserRuleCall_1_0; }
	}
	public class SpecSectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SpecSection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cStateAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cStateStateParserRuleCall_0_0 = (RuleCall)cStateAssignment_0.eContents().get(0);
		private final Assignment cInvariantsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cInvariantsInvariantsParserRuleCall_1_0 = (RuleCall)cInvariantsAssignment_1.eContents().get(0);
		private final Assignment cIntegrationAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cIntegrationIntegrationParserRuleCall_2_0 = (RuleCall)cIntegrationAssignment_2.eContents().get(0);
		private final Assignment cInitializeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cInitializeInitializeParserRuleCall_3_0 = (RuleCall)cInitializeAssignment_3.eContents().get(0);
		private final Assignment cComputeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cComputeComputeParserRuleCall_4_0 = (RuleCall)cComputeAssignment_4.eContents().get(0);
		
		//SpecSection:
		////    ComputationalModel
		////|    Flows
		//    (state = State)?
		//    (invariants = Invariants)?
		//    (integration = Integration)?
		//    (initialize = Initialize)?
		//    (compute = Compute)?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		////    ComputationalModel
		////|    Flows
		//    (state = State)?
		//    (invariants = Invariants)?
		//    (integration = Integration)?
		//    (initialize = Initialize)?
		//    (compute = Compute)?
		public Group getGroup() { return cGroup; }
		
		////    ComputationalModel
		////|    Flows
		//    (state = State)?
		public Assignment getStateAssignment_0() { return cStateAssignment_0; }
		
		//State
		public RuleCall getStateStateParserRuleCall_0_0() { return cStateStateParserRuleCall_0_0; }
		
		//(invariants = Invariants)?
		public Assignment getInvariantsAssignment_1() { return cInvariantsAssignment_1; }
		
		//Invariants
		public RuleCall getInvariantsInvariantsParserRuleCall_1_0() { return cInvariantsInvariantsParserRuleCall_1_0; }
		
		//(integration = Integration)?
		public Assignment getIntegrationAssignment_2() { return cIntegrationAssignment_2; }
		
		//Integration
		public RuleCall getIntegrationIntegrationParserRuleCall_2_0() { return cIntegrationIntegrationParserRuleCall_2_0; }
		
		//(initialize = Initialize)?
		public Assignment getInitializeAssignment_3() { return cInitializeAssignment_3; }
		
		//Initialize
		public RuleCall getInitializeInitializeParserRuleCall_3_0() { return cInitializeInitializeParserRuleCall_3_0; }
		
		//(compute = Compute)?
		public Assignment getComputeAssignment_4() { return cComputeAssignment_4; }
		
		//Compute
		public RuleCall getComputeComputeParserRuleCall_4_0() { return cComputeComputeParserRuleCall_4_0; }
	}
	public class StateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.State");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cDeclsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDeclsStateVarDeclParserRuleCall_1_0 = (RuleCall)cDeclsAssignment_1.eContents().get(0);
		
		////ComputationalModel:
		////    'computational_model' (
		////        {PeriodicComputationalModel} 'periodic'
		////    |    {HyperperiodComputationalModel} 'hyperperiod' 'with'
		////        (constraints+=[aadl2::NamedElement] ('<' constraints+=[aadl2::NamedElement])* )
		////    )
		////;
		////Flows:
		////    'flows' (flows+=Flow)+
		////;
		////
		////Flow returns Flow:
		////    =>    flowId=ID ':'
		////        srcPorts+=FeatureElement (',' srcPorts+=FeatureElement)* '-fun->'
		////        dstPorts+=FeatureElement (',' dstPorts+=FeatureElement)*
		////;
		////Contract:
		////    'contracts' (specs+=SpecStatement)+
		////;
		//State:
		//    'state' (decls += StateVarDecl)+
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'state' (decls += StateVarDecl)+
		public Group getGroup() { return cGroup; }
		
		//'state'
		public Keyword getStateKeyword_0() { return cStateKeyword_0; }
		
		//(decls += StateVarDecl)+
		public Assignment getDeclsAssignment_1() { return cDeclsAssignment_1; }
		
		//StateVarDecl
		public RuleCall getDeclsStateVarDeclParserRuleCall_1_0() { return cDeclsStateVarDeclParserRuleCall_1_0; }
	}
	public class StateVarDeclElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.StateVarDecl");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0_0 = (RuleCall)cNameAssignment_0_0.eContents().get(0);
		private final Keyword cColonKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cTypeNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cTypeNameDataSubcomponentTypeCrossReference_1_0 = (CrossReference)cTypeNameAssignment_1.eContents().get(0);
		private final RuleCall cTypeNameDataSubcomponentTypeQCREFParserRuleCall_1_0_1 = (RuleCall)cTypeNameDataSubcomponentTypeCrossReference_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//StateVarDecl:
		// // ...plain declaration without cross referencing is given below
		// // id1 = ID ':' typeName = ID
		// // ...single id per type
		// (name = ID ':') typeName=[aadl2::DataSubcomponentType|QCREF] ';'
		// // ...multiple ids per type -- leave this out for now until I figure out how to get cross-referencing right for an id list
		// // ids+=ID (',' ids+=ID)* ':' typeName=[aadl2::DataSubcomponentType|QCREF] ';'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//// ...plain declaration without cross referencing is given below
		//// id1 = ID ':' typeName = ID
		//// ...single id per type
		//(name = ID ':') typeName=[aadl2::DataSubcomponentType|QCREF] ';'
		public Group getGroup() { return cGroup; }
		
		//// ...plain declaration without cross referencing is given below
		//// id1 = ID ':' typeName = ID
		//// ...single id per type
		//(name = ID ':')
		public Group getGroup_0() { return cGroup_0; }
		
		//name = ID
		public Assignment getNameAssignment_0_0() { return cNameAssignment_0_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0_0() { return cNameIDTerminalRuleCall_0_0_0; }
		
		//':'
		public Keyword getColonKeyword_0_1() { return cColonKeyword_0_1; }
		
		//typeName=[aadl2::DataSubcomponentType|QCREF]
		public Assignment getTypeNameAssignment_1() { return cTypeNameAssignment_1; }
		
		//[aadl2::DataSubcomponentType|QCREF]
		public CrossReference getTypeNameDataSubcomponentTypeCrossReference_1_0() { return cTypeNameDataSubcomponentTypeCrossReference_1_0; }
		
		//QCREF
		public RuleCall getTypeNameDataSubcomponentTypeQCREFParserRuleCall_1_0_1() { return cTypeNameDataSubcomponentTypeQCREFParserRuleCall_1_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	public class InvariantsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.Invariants");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInvariantsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSpecsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSpecsInvSpecParserRuleCall_1_0 = (RuleCall)cSpecsAssignment_1.eContents().get(0);
		
		//Invariants:
		//    'invariants' (specs+=InvSpec)+
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'invariants' (specs+=InvSpec)+
		public Group getGroup() { return cGroup; }
		
		//'invariants'
		public Keyword getInvariantsKeyword_0() { return cInvariantsKeyword_0; }
		
		//(specs+=InvSpec)+
		public Assignment getSpecsAssignment_1() { return cSpecsAssignment_1; }
		
		//InvSpec
		public RuleCall getSpecsInvSpecParserRuleCall_1_0() { return cSpecsInvSpecParserRuleCall_1_0; }
	}
	public class InvSpecElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.InvSpec");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInvKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cDisplayNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDisplayNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cDisplayNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cExprAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cExprExprParserRuleCall_3_0 = (RuleCall)cExprAssignment_3.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//InvSpec:
		//    'inv' displayName=STRING ':' expr=Expr ';'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'inv' displayName=STRING ':' expr=Expr ';'
		public Group getGroup() { return cGroup; }
		
		//'inv'
		public Keyword getInvKeyword_0() { return cInvKeyword_0; }
		
		//displayName=STRING
		public Assignment getDisplayNameAssignment_1() { return cDisplayNameAssignment_1; }
		
		//STRING
		public RuleCall getDisplayNameSTRINGTerminalRuleCall_1_0() { return cDisplayNameSTRINGTerminalRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//expr=Expr
		public Assignment getExprAssignment_3() { return cExprAssignment_3; }
		
		//Expr
		public RuleCall getExprExprParserRuleCall_3_0() { return cExprExprParserRuleCall_3_0; }
		
		//';'
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}
	public class IntegrationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.Integration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cIntegrationKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSpecsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSpecsSpecStatementParserRuleCall_1_0 = (RuleCall)cSpecsAssignment_1.eContents().get(0);
		
		//Integration:
		//    'integration' (specs+=SpecStatement)+
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'integration' (specs+=SpecStatement)+
		public Group getGroup() { return cGroup; }
		
		//'integration'
		public Keyword getIntegrationKeyword_0() { return cIntegrationKeyword_0; }
		
		//(specs+=SpecStatement)+
		public Assignment getSpecsAssignment_1() { return cSpecsAssignment_1; }
		
		//SpecStatement
		public RuleCall getSpecsSpecStatementParserRuleCall_1_0() { return cSpecsSpecStatementParserRuleCall_1_0; }
	}
	public class InitializeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.Initialize");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInitializeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSpecsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSpecsInitializeSpecStatementParserRuleCall_1_0 = (RuleCall)cSpecsAssignment_1.eContents().get(0);
		
		//Initialize:
		//    'initialize' (specs+=InitializeSpecStatement)+
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'initialize' (specs+=InitializeSpecStatement)+
		public Group getGroup() { return cGroup; }
		
		//'initialize'
		public Keyword getInitializeKeyword_0() { return cInitializeKeyword_0; }
		
		//(specs+=InitializeSpecStatement)+
		public Assignment getSpecsAssignment_1() { return cSpecsAssignment_1; }
		
		//InitializeSpecStatement
		public RuleCall getSpecsInitializeSpecStatementParserRuleCall_1_0() { return cSpecsInitializeSpecStatementParserRuleCall_1_0; }
	}
	public class InitializeSpecStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.InitializeSpecStatement");
		private final RuleCall cGuaranteeStatementParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//InitializeSpecStatement:
		//  GuaranteeStatement
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//GuaranteeStatement
		public RuleCall getGuaranteeStatementParserRuleCall() { return cGuaranteeStatementParserRuleCall; }
	}
	public class ComputeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.Compute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cComputeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cCasesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cCasesCaseStatementClauseParserRuleCall_1_0 = (RuleCall)cCasesAssignment_1.eContents().get(0);
		
		//Compute:
		//    'compute'
		//      // for now, just set the grammar to have a collection of case statements.
		//      // Eventually allow arbitrary assume/guarantees around an aggregated case statement
		//       (cases+=CaseStatementClause)+
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'compute'
		//  // for now, just set the grammar to have a collection of case statements.
		//  // Eventually allow arbitrary assume/guarantees around an aggregated case statement
		//   (cases+=CaseStatementClause)+
		public Group getGroup() { return cGroup; }
		
		//'compute'
		public Keyword getComputeKeyword_0() { return cComputeKeyword_0; }
		
		//// for now, just set the grammar to have a collection of case statements.
		//// Eventually allow arbitrary assume/guarantees around an aggregated case statement
		// (cases+=CaseStatementClause)+
		public Assignment getCasesAssignment_1() { return cCasesAssignment_1; }
		
		//CaseStatementClause
		public RuleCall getCasesCaseStatementClauseParserRuleCall_1_0() { return cCasesCaseStatementClauseParserRuleCall_1_0; }
	}
	public class CaseStatementClauseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.CaseStatementClause");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCaseKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cDisplayNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDisplayNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cDisplayNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cAssumeStatementAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAssumeStatementAnonAssumeStatementParserRuleCall_3_0 = (RuleCall)cAssumeStatementAssignment_3.eContents().get(0);
		private final Assignment cGuaranteeStatementAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cGuaranteeStatementAnonGuaranteeStatementParserRuleCall_4_0 = (RuleCall)cGuaranteeStatementAssignment_4.eContents().get(0);
		
		//CaseStatementClause:
		//    'case' displayName=STRING ':'
		//           // in case clauses, we must have both an assume clause and a guarantee clause
		//           // but they don't have a display name (they will "inherit" the name from the case name).
		//           assumeStatement = AnonAssumeStatement
		//           guaranteeStatement = AnonGuaranteeStatement
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'case' displayName=STRING ':'
		//       // in case clauses, we must have both an assume clause and a guarantee clause
		//       // but they don't have a display name (they will "inherit" the name from the case name).
		//       assumeStatement = AnonAssumeStatement
		//       guaranteeStatement = AnonGuaranteeStatement
		public Group getGroup() { return cGroup; }
		
		//'case'
		public Keyword getCaseKeyword_0() { return cCaseKeyword_0; }
		
		//displayName=STRING
		public Assignment getDisplayNameAssignment_1() { return cDisplayNameAssignment_1; }
		
		//STRING
		public RuleCall getDisplayNameSTRINGTerminalRuleCall_1_0() { return cDisplayNameSTRINGTerminalRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//// in case clauses, we must have both an assume clause and a guarantee clause
		//// but they don't have a display name (they will "inherit" the name from the case name).
		//assumeStatement = AnonAssumeStatement
		public Assignment getAssumeStatementAssignment_3() { return cAssumeStatementAssignment_3; }
		
		//AnonAssumeStatement
		public RuleCall getAssumeStatementAnonAssumeStatementParserRuleCall_3_0() { return cAssumeStatementAnonAssumeStatementParserRuleCall_3_0; }
		
		//guaranteeStatement = AnonGuaranteeStatement
		public Assignment getGuaranteeStatementAssignment_4() { return cGuaranteeStatementAssignment_4; }
		
		//AnonGuaranteeStatement
		public RuleCall getGuaranteeStatementAnonGuaranteeStatementParserRuleCall_4_0() { return cGuaranteeStatementAnonGuaranteeStatementParserRuleCall_4_0; }
	}
	public class SpecStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SpecStatement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cAssumeStatementParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cGuaranteeStatementParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//SpecStatement:
		//    AssumeStatement
		//  | GuaranteeStatement
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//  AssumeStatement
		//| GuaranteeStatement
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//AssumeStatement
		public RuleCall getAssumeStatementParserRuleCall_0() { return cAssumeStatementParserRuleCall_0; }
		
		//GuaranteeStatement
		public RuleCall getGuaranteeStatementParserRuleCall_1() { return cGuaranteeStatementParserRuleCall_1; }
	}
	public class AssumeStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.AssumeStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAssumeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cDisplayNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDisplayNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cDisplayNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cExprAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cExprExprParserRuleCall_3_0 = (RuleCall)cExprAssignment_3.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//AssumeStatement:
		//    'assume' displayName=STRING ':' expr=Expr ';'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'assume' displayName=STRING ':' expr=Expr ';'
		public Group getGroup() { return cGroup; }
		
		//'assume'
		public Keyword getAssumeKeyword_0() { return cAssumeKeyword_0; }
		
		//displayName=STRING
		public Assignment getDisplayNameAssignment_1() { return cDisplayNameAssignment_1; }
		
		//STRING
		public RuleCall getDisplayNameSTRINGTerminalRuleCall_1_0() { return cDisplayNameSTRINGTerminalRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//expr=Expr
		public Assignment getExprAssignment_3() { return cExprAssignment_3; }
		
		//Expr
		public RuleCall getExprExprParserRuleCall_3_0() { return cExprExprParserRuleCall_3_0; }
		
		//';'
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}
	public class AnonAssumeStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.AnonAssumeStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAssumeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cExprAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExprExprParserRuleCall_1_0 = (RuleCall)cExprAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//AnonAssumeStatement:
		//    'assume' expr=Expr ';'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'assume' expr=Expr ';'
		public Group getGroup() { return cGroup; }
		
		//'assume'
		public Keyword getAssumeKeyword_0() { return cAssumeKeyword_0; }
		
		//expr=Expr
		public Assignment getExprAssignment_1() { return cExprAssignment_1; }
		
		//Expr
		public RuleCall getExprExprParserRuleCall_1_0() { return cExprExprParserRuleCall_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	public class GuaranteeStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.GuaranteeStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGuaranteeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cDisplayNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDisplayNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cDisplayNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cExprAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cExprExprParserRuleCall_3_0 = (RuleCall)cExprAssignment_3.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//GuaranteeStatement:
		//    'guarantee' displayName=STRING ':' expr=Expr ';'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'guarantee' displayName=STRING ':' expr=Expr ';'
		public Group getGroup() { return cGroup; }
		
		//'guarantee'
		public Keyword getGuaranteeKeyword_0() { return cGuaranteeKeyword_0; }
		
		//displayName=STRING
		public Assignment getDisplayNameAssignment_1() { return cDisplayNameAssignment_1; }
		
		//STRING
		public RuleCall getDisplayNameSTRINGTerminalRuleCall_1_0() { return cDisplayNameSTRINGTerminalRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//expr=Expr
		public Assignment getExprAssignment_3() { return cExprAssignment_3; }
		
		//Expr
		public RuleCall getExprExprParserRuleCall_3_0() { return cExprExprParserRuleCall_3_0; }
		
		//';'
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}
	public class AnonGuaranteeStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.AnonGuaranteeStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGuaranteeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cExprAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExprExprParserRuleCall_1_0 = (RuleCall)cExprAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//AnonGuaranteeStatement:
		//    'guarantee' expr=Expr ';'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'guarantee' expr=Expr ';'
		public Group getGroup() { return cGroup; }
		
		//'guarantee'
		public Keyword getGuaranteeKeyword_0() { return cGuaranteeKeyword_0; }
		
		//expr=Expr
		public Assignment getExprAssignment_1() { return cExprAssignment_1; }
		
		//Expr
		public RuleCall getExprExprParserRuleCall_1_0() { return cExprExprParserRuleCall_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	public class PREDICATEElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.PREDICATE");
		private final RuleCall cIDTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		////SpecStatement:
		////    {AssumeStatement} 'assume' ('for' forPort=[aadl2::NamedElement])?
		////        assumeTitle=STRING ':' pred=PREDICATE ('tracesTo' '<' tracesTo=ID '>')?
		////|    {GuaranteeStatement} 'guarantee' guaranteeTitle=STRING ':' expr=Expr
		////;
		//PREDICATE: // TODO
		//    ID
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//// TODO
		//   ID
		public RuleCall getIDTerminalRuleCall() { return cIDTerminalRuleCall; }
	}
	public class ExprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.Expr");
		private final RuleCall cImpliesExprParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Expr:
		//    ImpliesExpr
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//ImpliesExpr
		public RuleCall getImpliesExprParserRuleCall() { return cImpliesExprParserRuleCall; }
	}
	public class ImpliesExprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.ImpliesExpr");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cOrExprParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cGroup_1.eContents().get(0);
		private final Group cGroup_1_0_0 = (Group)cGroup_1_0.eContents().get(0);
		private final Action cBinaryExprLeftAction_1_0_0_0 = (Action)cGroup_1_0_0.eContents().get(0);
		private final Alternatives cAlternatives_1_0_0_1 = (Alternatives)cGroup_1_0_0.eContents().get(1);
		private final Keyword cEqualsSignGreaterThanSignKeyword_1_0_0_1_0 = (Keyword)cAlternatives_1_0_0_1.eContents().get(0);
		private final Keyword cImpliesKeyword_1_0_0_1_1 = (Keyword)cAlternatives_1_0_0_1.eContents().get(1);
		private final Assignment cRightAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cRightImpliesExprParserRuleCall_1_1_0 = (RuleCall)cRightAssignment_1_1.eContents().get(0);
		
		//ImpliesExpr returns Expr:
		//    OrExpr (=>({BinaryExpr.left=current} ('=>'|'implies')) right=ImpliesExpr)?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//OrExpr (=>({BinaryExpr.left=current} ('=>'|'implies')) right=ImpliesExpr)?
		public Group getGroup() { return cGroup; }
		
		//OrExpr
		public RuleCall getOrExprParserRuleCall_0() { return cOrExprParserRuleCall_0; }
		
		//(=>({BinaryExpr.left=current} ('=>'|'implies')) right=ImpliesExpr)?
		public Group getGroup_1() { return cGroup_1; }
		
		//=>({BinaryExpr.left=current} ('=>'|'implies'))
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//{BinaryExpr.left=current} ('=>'|'implies')
		public Group getGroup_1_0_0() { return cGroup_1_0_0; }
		
		//{BinaryExpr.left=current}
		public Action getBinaryExprLeftAction_1_0_0_0() { return cBinaryExprLeftAction_1_0_0_0; }
		
		//('=>'|'implies')
		public Alternatives getAlternatives_1_0_0_1() { return cAlternatives_1_0_0_1; }
		
		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_1_0_0_1_0() { return cEqualsSignGreaterThanSignKeyword_1_0_0_1_0; }
		
		//'implies'
		public Keyword getImpliesKeyword_1_0_0_1_1() { return cImpliesKeyword_1_0_0_1_1; }
		
		//right=ImpliesExpr
		public Assignment getRightAssignment_1_1() { return cRightAssignment_1_1; }
		
		//ImpliesExpr
		public RuleCall getRightImpliesExprParserRuleCall_1_1_0() { return cRightImpliesExprParserRuleCall_1_1_0; }
	}
	public class OrExprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.OrExpr");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cAndExprParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cGroup_1.eContents().get(0);
		private final Group cGroup_1_0_0 = (Group)cGroup_1_0.eContents().get(0);
		private final Action cBinaryExprLeftAction_1_0_0_0 = (Action)cGroup_1_0_0.eContents().get(0);
		private final Alternatives cAlternatives_1_0_0_1 = (Alternatives)cGroup_1_0_0.eContents().get(1);
		private final Assignment cOpAssignment_1_0_0_1_0 = (Assignment)cAlternatives_1_0_0_1.eContents().get(0);
		private final Keyword cOpOrKeyword_1_0_0_1_0_0 = (Keyword)cOpAssignment_1_0_0_1_0.eContents().get(0);
		private final Assignment cOpAssignment_1_0_0_1_1 = (Assignment)cAlternatives_1_0_0_1.eContents().get(1);
		private final Keyword cOpOrelseKeyword_1_0_0_1_1_0 = (Keyword)cOpAssignment_1_0_0_1_1.eContents().get(0);
		private final Assignment cRightAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cRightAndExprParserRuleCall_1_1_0 = (RuleCall)cRightAssignment_1_1.eContents().get(0);
		
		//OrExpr returns Expr:
		//    AndExpr (=>({BinaryExpr.left=current} (op='or'|op='orelse')) right=AndExpr)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//AndExpr (=>({BinaryExpr.left=current} (op='or'|op='orelse')) right=AndExpr)*
		public Group getGroup() { return cGroup; }
		
		//AndExpr
		public RuleCall getAndExprParserRuleCall_0() { return cAndExprParserRuleCall_0; }
		
		//(=>({BinaryExpr.left=current} (op='or'|op='orelse')) right=AndExpr)*
		public Group getGroup_1() { return cGroup_1; }
		
		//=>({BinaryExpr.left=current} (op='or'|op='orelse'))
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//{BinaryExpr.left=current} (op='or'|op='orelse')
		public Group getGroup_1_0_0() { return cGroup_1_0_0; }
		
		//{BinaryExpr.left=current}
		public Action getBinaryExprLeftAction_1_0_0_0() { return cBinaryExprLeftAction_1_0_0_0; }
		
		//(op='or'|op='orelse')
		public Alternatives getAlternatives_1_0_0_1() { return cAlternatives_1_0_0_1; }
		
		//op='or'
		public Assignment getOpAssignment_1_0_0_1_0() { return cOpAssignment_1_0_0_1_0; }
		
		//'or'
		public Keyword getOpOrKeyword_1_0_0_1_0_0() { return cOpOrKeyword_1_0_0_1_0_0; }
		
		//op='orelse'
		public Assignment getOpAssignment_1_0_0_1_1() { return cOpAssignment_1_0_0_1_1; }
		
		//'orelse'
		public Keyword getOpOrelseKeyword_1_0_0_1_1_0() { return cOpOrelseKeyword_1_0_0_1_1_0; }
		
		//right=AndExpr
		public Assignment getRightAssignment_1_1() { return cRightAssignment_1_1; }
		
		//AndExpr
		public RuleCall getRightAndExprParserRuleCall_1_1_0() { return cRightAndExprParserRuleCall_1_1_0; }
	}
	public class AndExprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.AndExpr");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cRelationalExprParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cGroup_1.eContents().get(0);
		private final Group cGroup_1_0_0 = (Group)cGroup_1_0.eContents().get(0);
		private final Action cBinaryExprLeftAction_1_0_0_0 = (Action)cGroup_1_0_0.eContents().get(0);
		private final Alternatives cAlternatives_1_0_0_1 = (Alternatives)cGroup_1_0_0.eContents().get(1);
		private final Assignment cOpAssignment_1_0_0_1_0 = (Assignment)cAlternatives_1_0_0_1.eContents().get(0);
		private final Keyword cOpAndKeyword_1_0_0_1_0_0 = (Keyword)cOpAssignment_1_0_0_1_0.eContents().get(0);
		private final Assignment cOpAssignment_1_0_0_1_1 = (Assignment)cAlternatives_1_0_0_1.eContents().get(1);
		private final Keyword cOpAndthenKeyword_1_0_0_1_1_0 = (Keyword)cOpAssignment_1_0_0_1_1.eContents().get(0);
		private final Assignment cRightAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cRightRelationalExprParserRuleCall_1_1_0 = (RuleCall)cRightAssignment_1_1.eContents().get(0);
		
		//AndExpr returns Expr:
		//    RelationalExpr (=>({BinaryExpr.left=current} (op='and'|op='andthen')) right=RelationalExpr)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//RelationalExpr (=>({BinaryExpr.left=current} (op='and'|op='andthen')) right=RelationalExpr)*
		public Group getGroup() { return cGroup; }
		
		//RelationalExpr
		public RuleCall getRelationalExprParserRuleCall_0() { return cRelationalExprParserRuleCall_0; }
		
		//(=>({BinaryExpr.left=current} (op='and'|op='andthen')) right=RelationalExpr)*
		public Group getGroup_1() { return cGroup_1; }
		
		//=>({BinaryExpr.left=current} (op='and'|op='andthen'))
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//{BinaryExpr.left=current} (op='and'|op='andthen')
		public Group getGroup_1_0_0() { return cGroup_1_0_0; }
		
		//{BinaryExpr.left=current}
		public Action getBinaryExprLeftAction_1_0_0_0() { return cBinaryExprLeftAction_1_0_0_0; }
		
		//(op='and'|op='andthen')
		public Alternatives getAlternatives_1_0_0_1() { return cAlternatives_1_0_0_1; }
		
		//op='and'
		public Assignment getOpAssignment_1_0_0_1_0() { return cOpAssignment_1_0_0_1_0; }
		
		//'and'
		public Keyword getOpAndKeyword_1_0_0_1_0_0() { return cOpAndKeyword_1_0_0_1_0_0; }
		
		//op='andthen'
		public Assignment getOpAssignment_1_0_0_1_1() { return cOpAssignment_1_0_0_1_1; }
		
		//'andthen'
		public Keyword getOpAndthenKeyword_1_0_0_1_1_0() { return cOpAndthenKeyword_1_0_0_1_1_0; }
		
		//right=RelationalExpr
		public Assignment getRightAssignment_1_1() { return cRightAssignment_1_1; }
		
		//RelationalExpr
		public RuleCall getRightRelationalExprParserRuleCall_1_1_0() { return cRightRelationalExprParserRuleCall_1_1_0; }
	}
	public class RelationalOpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.RelationalOp");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cLessThanSignKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cLessThanSignEqualsSignKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cGreaterThanSignKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cGreaterThanSignEqualsSignKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		private final Keyword cEqualsSignKeyword_4 = (Keyword)cAlternatives.eContents().get(4);
		private final Keyword cLessThanSignGreaterThanSignKeyword_5 = (Keyword)cAlternatives.eContents().get(5);
		
		//RelationalOp:
		//    '<' | '<=' | '>' | '>=' | '=' | '<>'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'<' | '<=' | '>' | '>=' | '=' | '<>'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'<'
		public Keyword getLessThanSignKeyword_0() { return cLessThanSignKeyword_0; }
		
		//'<='
		public Keyword getLessThanSignEqualsSignKeyword_1() { return cLessThanSignEqualsSignKeyword_1; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_2() { return cGreaterThanSignKeyword_2; }
		
		//'>='
		public Keyword getGreaterThanSignEqualsSignKeyword_3() { return cGreaterThanSignEqualsSignKeyword_3; }
		
		//'='
		public Keyword getEqualsSignKeyword_4() { return cEqualsSignKeyword_4; }
		
		//'<>'
		public Keyword getLessThanSignGreaterThanSignKeyword_5() { return cLessThanSignGreaterThanSignKeyword_5; }
	}
	public class RelationalExprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.RelationalExpr");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPlusExprParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cGroup_1.eContents().get(0);
		private final Group cGroup_1_0_0 = (Group)cGroup_1_0.eContents().get(0);
		private final Action cBinaryExprLeftAction_1_0_0_0 = (Action)cGroup_1_0_0.eContents().get(0);
		private final Assignment cOpAssignment_1_0_0_1 = (Assignment)cGroup_1_0_0.eContents().get(1);
		private final RuleCall cOpRelationalOpParserRuleCall_1_0_0_1_0 = (RuleCall)cOpAssignment_1_0_0_1.eContents().get(0);
		private final Assignment cRightAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cRightPlusExprParserRuleCall_1_1_0 = (RuleCall)cRightAssignment_1_1.eContents().get(0);
		
		//RelationalExpr returns Expr:
		//    PlusExpr (=>({BinaryExpr.left=current} op=RelationalOp) right=PlusExpr)?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//PlusExpr (=>({BinaryExpr.left=current} op=RelationalOp) right=PlusExpr)?
		public Group getGroup() { return cGroup; }
		
		//PlusExpr
		public RuleCall getPlusExprParserRuleCall_0() { return cPlusExprParserRuleCall_0; }
		
		//(=>({BinaryExpr.left=current} op=RelationalOp) right=PlusExpr)?
		public Group getGroup_1() { return cGroup_1; }
		
		//=>({BinaryExpr.left=current} op=RelationalOp)
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//{BinaryExpr.left=current} op=RelationalOp
		public Group getGroup_1_0_0() { return cGroup_1_0_0; }
		
		//{BinaryExpr.left=current}
		public Action getBinaryExprLeftAction_1_0_0_0() { return cBinaryExprLeftAction_1_0_0_0; }
		
		//op=RelationalOp
		public Assignment getOpAssignment_1_0_0_1() { return cOpAssignment_1_0_0_1; }
		
		//RelationalOp
		public RuleCall getOpRelationalOpParserRuleCall_1_0_0_1_0() { return cOpRelationalOpParserRuleCall_1_0_0_1_0; }
		
		//right=PlusExpr
		public Assignment getRightAssignment_1_1() { return cRightAssignment_1_1; }
		
		//PlusExpr
		public RuleCall getRightPlusExprParserRuleCall_1_1_0() { return cRightPlusExprParserRuleCall_1_1_0; }
	}
	public class PlusExprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.PlusExpr");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cTimesExprParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cGroup_1.eContents().get(0);
		private final Group cGroup_1_0_0 = (Group)cGroup_1_0.eContents().get(0);
		private final Action cBinaryExprLeftAction_1_0_0_0 = (Action)cGroup_1_0_0.eContents().get(0);
		private final Assignment cOpAssignment_1_0_0_1 = (Assignment)cGroup_1_0_0.eContents().get(1);
		private final Alternatives cOpAlternatives_1_0_0_1_0 = (Alternatives)cOpAssignment_1_0_0_1.eContents().get(0);
		private final Keyword cOpPlusSignKeyword_1_0_0_1_0_0 = (Keyword)cOpAlternatives_1_0_0_1_0.eContents().get(0);
		private final Keyword cOpHyphenMinusKeyword_1_0_0_1_0_1 = (Keyword)cOpAlternatives_1_0_0_1_0.eContents().get(1);
		private final Assignment cRightAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cRightTimesExprParserRuleCall_1_1_0 = (RuleCall)cRightAssignment_1_1.eContents().get(0);
		
		//PlusExpr returns Expr:
		//    TimesExpr (=>({BinaryExpr.left=current} op=('+' | '-')) right=TimesExpr)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//TimesExpr (=>({BinaryExpr.left=current} op=('+' | '-')) right=TimesExpr)*
		public Group getGroup() { return cGroup; }
		
		//TimesExpr
		public RuleCall getTimesExprParserRuleCall_0() { return cTimesExprParserRuleCall_0; }
		
		//(=>({BinaryExpr.left=current} op=('+' | '-')) right=TimesExpr)*
		public Group getGroup_1() { return cGroup_1; }
		
		//=>({BinaryExpr.left=current} op=('+' | '-'))
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//{BinaryExpr.left=current} op=('+' | '-')
		public Group getGroup_1_0_0() { return cGroup_1_0_0; }
		
		//{BinaryExpr.left=current}
		public Action getBinaryExprLeftAction_1_0_0_0() { return cBinaryExprLeftAction_1_0_0_0; }
		
		//op=('+' | '-')
		public Assignment getOpAssignment_1_0_0_1() { return cOpAssignment_1_0_0_1; }
		
		//('+' | '-')
		public Alternatives getOpAlternatives_1_0_0_1_0() { return cOpAlternatives_1_0_0_1_0; }
		
		//'+'
		public Keyword getOpPlusSignKeyword_1_0_0_1_0_0() { return cOpPlusSignKeyword_1_0_0_1_0_0; }
		
		//'-'
		public Keyword getOpHyphenMinusKeyword_1_0_0_1_0_1() { return cOpHyphenMinusKeyword_1_0_0_1_0_1; }
		
		//right=TimesExpr
		public Assignment getRightAssignment_1_1() { return cRightAssignment_1_1; }
		
		//TimesExpr
		public RuleCall getRightTimesExprParserRuleCall_1_1_0() { return cRightTimesExprParserRuleCall_1_1_0; }
	}
	public class TimesExprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.TimesExpr");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cExpExprParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cGroup_1.eContents().get(0);
		private final Group cGroup_1_0_0 = (Group)cGroup_1_0.eContents().get(0);
		private final Action cBinaryExprLeftAction_1_0_0_0 = (Action)cGroup_1_0_0.eContents().get(0);
		private final Assignment cOpAssignment_1_0_0_1 = (Assignment)cGroup_1_0_0.eContents().get(1);
		private final Alternatives cOpAlternatives_1_0_0_1_0 = (Alternatives)cOpAssignment_1_0_0_1.eContents().get(0);
		private final Keyword cOpAsteriskKeyword_1_0_0_1_0_0 = (Keyword)cOpAlternatives_1_0_0_1_0.eContents().get(0);
		private final Keyword cOpSolidusKeyword_1_0_0_1_0_1 = (Keyword)cOpAlternatives_1_0_0_1_0.eContents().get(1);
		private final Keyword cOpPercentSignKeyword_1_0_0_1_0_2 = (Keyword)cOpAlternatives_1_0_0_1_0.eContents().get(2);
		private final Assignment cRightAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cRightExpExprParserRuleCall_1_1_0 = (RuleCall)cRightAssignment_1_1.eContents().get(0);
		
		//TimesExpr returns Expr:
		//    ExpExpr (=>({BinaryExpr.left=current} op=('*' | '/' | '%')) right=ExpExpr)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//ExpExpr (=>({BinaryExpr.left=current} op=('*' | '/' | '%')) right=ExpExpr)*
		public Group getGroup() { return cGroup; }
		
		//ExpExpr
		public RuleCall getExpExprParserRuleCall_0() { return cExpExprParserRuleCall_0; }
		
		//(=>({BinaryExpr.left=current} op=('*' | '/' | '%')) right=ExpExpr)*
		public Group getGroup_1() { return cGroup_1; }
		
		//=>({BinaryExpr.left=current} op=('*' | '/' | '%'))
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//{BinaryExpr.left=current} op=('*' | '/' | '%')
		public Group getGroup_1_0_0() { return cGroup_1_0_0; }
		
		//{BinaryExpr.left=current}
		public Action getBinaryExprLeftAction_1_0_0_0() { return cBinaryExprLeftAction_1_0_0_0; }
		
		//op=('*' | '/' | '%')
		public Assignment getOpAssignment_1_0_0_1() { return cOpAssignment_1_0_0_1; }
		
		//('*' | '/' | '%')
		public Alternatives getOpAlternatives_1_0_0_1_0() { return cOpAlternatives_1_0_0_1_0; }
		
		//'*'
		public Keyword getOpAsteriskKeyword_1_0_0_1_0_0() { return cOpAsteriskKeyword_1_0_0_1_0_0; }
		
		//'/'
		public Keyword getOpSolidusKeyword_1_0_0_1_0_1() { return cOpSolidusKeyword_1_0_0_1_0_1; }
		
		//'%'
		public Keyword getOpPercentSignKeyword_1_0_0_1_0_2() { return cOpPercentSignKeyword_1_0_0_1_0_2; }
		
		//right=ExpExpr
		public Assignment getRightAssignment_1_1() { return cRightAssignment_1_1; }
		
		//ExpExpr
		public RuleCall getRightExpExprParserRuleCall_1_1_0() { return cRightExpExprParserRuleCall_1_1_0; }
	}
	public class ExpExprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.ExpExpr");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPrefixExprParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cGroup_1.eContents().get(0);
		private final Group cGroup_1_0_0 = (Group)cGroup_1_0.eContents().get(0);
		private final Action cBinaryExprLeftAction_1_0_0_0 = (Action)cGroup_1_0_0.eContents().get(0);
		private final Assignment cOpAssignment_1_0_0_1 = (Assignment)cGroup_1_0_0.eContents().get(1);
		private final Keyword cOpCircumflexAccentKeyword_1_0_0_1_0 = (Keyword)cOpAssignment_1_0_0_1.eContents().get(0);
		private final Assignment cRightAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cRightPrefixExprParserRuleCall_1_1_0 = (RuleCall)cRightAssignment_1_1.eContents().get(0);
		
		//ExpExpr returns Expr:
		//    PrefixExpr (=>({BinaryExpr.left=current} op=('^')) right=PrefixExpr)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//PrefixExpr (=>({BinaryExpr.left=current} op=('^')) right=PrefixExpr)*
		public Group getGroup() { return cGroup; }
		
		//PrefixExpr
		public RuleCall getPrefixExprParserRuleCall_0() { return cPrefixExprParserRuleCall_0; }
		
		//(=>({BinaryExpr.left=current} op=('^')) right=PrefixExpr)*
		public Group getGroup_1() { return cGroup_1; }
		
		//=>({BinaryExpr.left=current} op=('^'))
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//{BinaryExpr.left=current} op=('^')
		public Group getGroup_1_0_0() { return cGroup_1_0_0; }
		
		//{BinaryExpr.left=current}
		public Action getBinaryExprLeftAction_1_0_0_0() { return cBinaryExprLeftAction_1_0_0_0; }
		
		//op=('^')
		public Assignment getOpAssignment_1_0_0_1() { return cOpAssignment_1_0_0_1; }
		
		//('^')
		public Keyword getOpCircumflexAccentKeyword_1_0_0_1_0() { return cOpCircumflexAccentKeyword_1_0_0_1_0; }
		
		//right=PrefixExpr
		public Assignment getRightAssignment_1_1() { return cRightAssignment_1_1; }
		
		//PrefixExpr
		public RuleCall getRightPrefixExprParserRuleCall_1_1_0() { return cRightPrefixExprParserRuleCall_1_1_0; }
	}
	public class PrefixExprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.PrefixExpr");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cUnaryExprAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Assignment cOpAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final Alternatives cOpAlternatives_0_1_0 = (Alternatives)cOpAssignment_0_1.eContents().get(0);
		private final Keyword cOpHyphenMinusKeyword_0_1_0_0 = (Keyword)cOpAlternatives_0_1_0.eContents().get(0);
		private final Keyword cOpNotKeyword_0_1_0_1 = (Keyword)cOpAlternatives_0_1_0.eContents().get(1);
		private final Assignment cExprAssignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final RuleCall cExprPrefixExprParserRuleCall_0_2_0 = (RuleCall)cExprAssignment_0_2.eContents().get(0);
		private final RuleCall cAtomicExprParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//PrefixExpr returns Expr:
		//    {UnaryExpr} op=('-' | 'not') expr=PrefixExpr
		//|    AtomicExpr
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//    {UnaryExpr} op=('-' | 'not') expr=PrefixExpr
		//|    AtomicExpr
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{UnaryExpr} op=('-' | 'not') expr=PrefixExpr
		public Group getGroup_0() { return cGroup_0; }
		
		//{UnaryExpr}
		public Action getUnaryExprAction_0_0() { return cUnaryExprAction_0_0; }
		
		//op=('-' | 'not')
		public Assignment getOpAssignment_0_1() { return cOpAssignment_0_1; }
		
		//('-' | 'not')
		public Alternatives getOpAlternatives_0_1_0() { return cOpAlternatives_0_1_0; }
		
		//'-'
		public Keyword getOpHyphenMinusKeyword_0_1_0_0() { return cOpHyphenMinusKeyword_0_1_0_0; }
		
		//'not'
		public Keyword getOpNotKeyword_0_1_0_1() { return cOpNotKeyword_0_1_0_1; }
		
		//expr=PrefixExpr
		public Assignment getExprAssignment_0_2() { return cExprAssignment_0_2; }
		
		//PrefixExpr
		public RuleCall getExprPrefixExprParserRuleCall_0_2_0() { return cExprPrefixExprParserRuleCall_0_2_0; }
		
		//AtomicExpr
		public RuleCall getAtomicExprParserRuleCall_1() { return cAtomicExprParserRuleCall_1; }
	}
	public class AtomicExprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.AtomicExpr");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cStateVarRefAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Keyword cVarKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cStateVarAssignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final CrossReference cStateVarStateVarDeclCrossReference_0_2_0 = (CrossReference)cStateVarAssignment_0_2.eContents().get(0);
		private final RuleCall cStateVarStateVarDeclIDTerminalRuleCall_0_2_0_1 = (RuleCall)cStateVarStateVarDeclCrossReference_0_2_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cPortRefAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cPortKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cPortNameAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cPortNameIDTerminalRuleCall_1_2_0 = (RuleCall)cPortNameAssignment_1_2.eContents().get(0);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Action cIntLitAction_2_0 = (Action)cGroup_2.eContents().get(0);
		private final Assignment cValueAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cValueINTEGER_LITTerminalRuleCall_2_1_0 = (RuleCall)cValueAssignment_2_1.eContents().get(0);
		
		//AtomicExpr returns Expr:
		////  Need to figure out how to reference difference types of IDs, including cross references
		////  to port names, state variables, etc.
		////  Alternatively can the grammar be parameterized by the kinds of IDs to be supported?
		////  For example, invariants should only reference state variables.
		////    {IdExpr} id=[aadl2::NamedElement | QCREF]
		//    {StateVarRef} 'var' stateVar=[StateVarDecl|ID]
		//|   {PortRef} 'port' portName=ID
		//|    {IntLit} value=INTEGER_LIT  // use int lit syntax from AADL properties file
		//;
		@Override public ParserRule getRule() { return rule; }
		
		////  Need to figure out how to reference difference types of IDs, including cross references
		////  to port names, state variables, etc.
		////  Alternatively can the grammar be parameterized by the kinds of IDs to be supported?
		////  For example, invariants should only reference state variables.
		////    {IdExpr} id=[aadl2::NamedElement | QCREF]
		//    {StateVarRef} 'var' stateVar=[StateVarDecl|ID]
		//|   {PortRef} 'port' portName=ID
		//|    {IntLit} value=INTEGER_LIT
		public Alternatives getAlternatives() { return cAlternatives; }
		
		////  Need to figure out how to reference difference types of IDs, including cross references
		////  to port names, state variables, etc.
		////  Alternatively can the grammar be parameterized by the kinds of IDs to be supported?
		////  For example, invariants should only reference state variables.
		////    {IdExpr} id=[aadl2::NamedElement | QCREF]
		//    {StateVarRef} 'var' stateVar=[StateVarDecl|ID]
		public Group getGroup_0() { return cGroup_0; }
		
		////  Need to figure out how to reference difference types of IDs, including cross references
		////  to port names, state variables, etc.
		////  Alternatively can the grammar be parameterized by the kinds of IDs to be supported?
		////  For example, invariants should only reference state variables.
		////    {IdExpr} id=[aadl2::NamedElement | QCREF]
		//    {StateVarRef}
		public Action getStateVarRefAction_0_0() { return cStateVarRefAction_0_0; }
		
		//'var'
		public Keyword getVarKeyword_0_1() { return cVarKeyword_0_1; }
		
		//stateVar=[StateVarDecl|ID]
		public Assignment getStateVarAssignment_0_2() { return cStateVarAssignment_0_2; }
		
		//[StateVarDecl|ID]
		public CrossReference getStateVarStateVarDeclCrossReference_0_2_0() { return cStateVarStateVarDeclCrossReference_0_2_0; }
		
		//ID
		public RuleCall getStateVarStateVarDeclIDTerminalRuleCall_0_2_0_1() { return cStateVarStateVarDeclIDTerminalRuleCall_0_2_0_1; }
		
		//{PortRef} 'port' portName=ID
		public Group getGroup_1() { return cGroup_1; }
		
		//{PortRef}
		public Action getPortRefAction_1_0() { return cPortRefAction_1_0; }
		
		//'port'
		public Keyword getPortKeyword_1_1() { return cPortKeyword_1_1; }
		
		//portName=ID
		public Assignment getPortNameAssignment_1_2() { return cPortNameAssignment_1_2; }
		
		//ID
		public RuleCall getPortNameIDTerminalRuleCall_1_2_0() { return cPortNameIDTerminalRuleCall_1_2_0; }
		
		//{IntLit} value=INTEGER_LIT
		public Group getGroup_2() { return cGroup_2; }
		
		//{IntLit}
		public Action getIntLitAction_2_0() { return cIntLitAction_2_0; }
		
		//value=INTEGER_LIT
		public Assignment getValueAssignment_2_1() { return cValueAssignment_2_1; }
		
		//INTEGER_LIT
		public RuleCall getValueINTEGER_LITTerminalRuleCall_2_1_0() { return cValueINTEGER_LITTerminalRuleCall_2_1_0; }
	}
	public class SubcomponentElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SubcomponentElement");
		private final Assignment cSubcomponentAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cSubcomponentSubcomponentCrossReference_0 = (CrossReference)cSubcomponentAssignment.eContents().get(0);
		private final RuleCall cSubcomponentSubcomponentIDTerminalRuleCall_0_1 = (RuleCall)cSubcomponentSubcomponentCrossReference_0.eContents().get(1);
		
		//SubcomponentElement returns SubcomponentElement:
		//    subcomponent = [aadl2::Subcomponent|ID]
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//subcomponent = [aadl2::Subcomponent|ID]
		public Assignment getSubcomponentAssignment() { return cSubcomponentAssignment; }
		
		//[aadl2::Subcomponent|ID]
		public CrossReference getSubcomponentSubcomponentCrossReference_0() { return cSubcomponentSubcomponentCrossReference_0; }
		
		//ID
		public RuleCall getSubcomponentSubcomponentIDTerminalRuleCall_0_1() { return cSubcomponentSubcomponentIDTerminalRuleCall_0_1; }
	}
	public class FeatureElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.FeatureElement");
		private final Assignment cFeatureAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cFeatureNamedElementCrossReference_0 = (CrossReference)cFeatureAssignment.eContents().get(0);
		private final RuleCall cFeatureNamedElementIDTerminalRuleCall_0_1 = (RuleCall)cFeatureNamedElementCrossReference_0.eContents().get(1);
		
		//FeatureElement returns FeatureElement:
		//    feature=[aadl2::NamedElement|ID]
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//feature=[aadl2::NamedElement|ID]
		public Assignment getFeatureAssignment() { return cFeatureAssignment; }
		
		//[aadl2::NamedElement|ID]
		public CrossReference getFeatureNamedElementCrossReference_0() { return cFeatureNamedElementCrossReference_0; }
		
		//ID
		public RuleCall getFeatureNamedElementIDTerminalRuleCall_0_1() { return cFeatureNamedElementIDTerminalRuleCall_0_1; }
	}
	
	
	private final AnnexLibraryElements pAnnexLibrary;
	private final AnnexSubclauseElements pAnnexSubclause;
	private final GumboLibraryElements pGumboLibrary;
	private final GumboSubclauseElements pGumboSubclause;
	private final SpecSectionElements pSpecSection;
	private final StateElements pState;
	private final StateVarDeclElements pStateVarDecl;
	private final InvariantsElements pInvariants;
	private final InvSpecElements pInvSpec;
	private final IntegrationElements pIntegration;
	private final InitializeElements pInitialize;
	private final InitializeSpecStatementElements pInitializeSpecStatement;
	private final ComputeElements pCompute;
	private final CaseStatementClauseElements pCaseStatementClause;
	private final SpecStatementElements pSpecStatement;
	private final AssumeStatementElements pAssumeStatement;
	private final AnonAssumeStatementElements pAnonAssumeStatement;
	private final GuaranteeStatementElements pGuaranteeStatement;
	private final AnonGuaranteeStatementElements pAnonGuaranteeStatement;
	private final PREDICATEElements pPREDICATE;
	private final ExprElements pExpr;
	private final ImpliesExprElements pImpliesExpr;
	private final OrExprElements pOrExpr;
	private final AndExprElements pAndExpr;
	private final RelationalOpElements pRelationalOp;
	private final RelationalExprElements pRelationalExpr;
	private final PlusExprElements pPlusExpr;
	private final TimesExprElements pTimesExpr;
	private final ExpExprElements pExpExpr;
	private final PrefixExprElements pPrefixExpr;
	private final AtomicExprElements pAtomicExpr;
	private final SubcomponentElementElements pSubcomponentElement;
	private final FeatureElementElements pFeatureElement;
	
	private final Grammar grammar;
	
	private final PropertiesGrammarAccess gaProperties;

	@Inject
	public GumboGrammarAccess(GrammarProvider grammarProvider,
			PropertiesGrammarAccess gaProperties) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaProperties = gaProperties;
		this.pAnnexLibrary = new AnnexLibraryElements();
		this.pAnnexSubclause = new AnnexSubclauseElements();
		this.pGumboLibrary = new GumboLibraryElements();
		this.pGumboSubclause = new GumboSubclauseElements();
		this.pSpecSection = new SpecSectionElements();
		this.pState = new StateElements();
		this.pStateVarDecl = new StateVarDeclElements();
		this.pInvariants = new InvariantsElements();
		this.pInvSpec = new InvSpecElements();
		this.pIntegration = new IntegrationElements();
		this.pInitialize = new InitializeElements();
		this.pInitializeSpecStatement = new InitializeSpecStatementElements();
		this.pCompute = new ComputeElements();
		this.pCaseStatementClause = new CaseStatementClauseElements();
		this.pSpecStatement = new SpecStatementElements();
		this.pAssumeStatement = new AssumeStatementElements();
		this.pAnonAssumeStatement = new AnonAssumeStatementElements();
		this.pGuaranteeStatement = new GuaranteeStatementElements();
		this.pAnonGuaranteeStatement = new AnonGuaranteeStatementElements();
		this.pPREDICATE = new PREDICATEElements();
		this.pExpr = new ExprElements();
		this.pImpliesExpr = new ImpliesExprElements();
		this.pOrExpr = new OrExprElements();
		this.pAndExpr = new AndExprElements();
		this.pRelationalOp = new RelationalOpElements();
		this.pRelationalExpr = new RelationalExprElements();
		this.pPlusExpr = new PlusExprElements();
		this.pTimesExpr = new TimesExprElements();
		this.pExpExpr = new ExpExprElements();
		this.pPrefixExpr = new PrefixExprElements();
		this.pAtomicExpr = new AtomicExprElements();
		this.pSubcomponentElement = new SubcomponentElementElements();
		this.pFeatureElement = new FeatureElementElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.sireum.aadl.gumbo.Gumbo".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public PropertiesGrammarAccess getPropertiesGrammarAccess() {
		return gaProperties;
	}

	
	//AnnexLibrary returns aadl2::AnnexLibrary:
	//    GumboLibrary
	//;
	public AnnexLibraryElements getAnnexLibraryAccess() {
		return pAnnexLibrary;
	}
	
	public ParserRule getAnnexLibraryRule() {
		return getAnnexLibraryAccess().getRule();
	}
	
	//AnnexSubclause returns aadl2::AnnexSubclause:
	//    GumboSubclause
	//;
	public AnnexSubclauseElements getAnnexSubclauseAccess() {
		return pAnnexSubclause;
	}
	
	public ParserRule getAnnexSubclauseRule() {
		return getAnnexSubclauseAccess().getRule();
	}
	
	//GumboLibrary returns GumboLibrary:
	//    {GumboLibrary}
	//    'library' 'for' 'gumbo'
	//;
	public GumboLibraryElements getGumboLibraryAccess() {
		return pGumboLibrary;
	}
	
	public ParserRule getGumboLibraryRule() {
		return getGumboLibraryAccess().getRule();
	}
	
	//GumboSubclause returns GumboSubclause:
	//    {GumboSubclause}
	////    specs+=SpecSection*
	//    specs=SpecSection
	//;
	public GumboSubclauseElements getGumboSubclauseAccess() {
		return pGumboSubclause;
	}
	
	public ParserRule getGumboSubclauseRule() {
		return getGumboSubclauseAccess().getRule();
	}
	
	//SpecSection:
	////    ComputationalModel
	////|    Flows
	//    (state = State)?
	//    (invariants = Invariants)?
	//    (integration = Integration)?
	//    (initialize = Initialize)?
	//    (compute = Compute)?
	//;
	public SpecSectionElements getSpecSectionAccess() {
		return pSpecSection;
	}
	
	public ParserRule getSpecSectionRule() {
		return getSpecSectionAccess().getRule();
	}
	
	////ComputationalModel:
	////    'computational_model' (
	////        {PeriodicComputationalModel} 'periodic'
	////    |    {HyperperiodComputationalModel} 'hyperperiod' 'with'
	////        (constraints+=[aadl2::NamedElement] ('<' constraints+=[aadl2::NamedElement])* )
	////    )
	////;
	////Flows:
	////    'flows' (flows+=Flow)+
	////;
	////
	////Flow returns Flow:
	////    =>    flowId=ID ':'
	////        srcPorts+=FeatureElement (',' srcPorts+=FeatureElement)* '-fun->'
	////        dstPorts+=FeatureElement (',' dstPorts+=FeatureElement)*
	////;
	////Contract:
	////    'contracts' (specs+=SpecStatement)+
	////;
	//State:
	//    'state' (decls += StateVarDecl)+
	//;
	public StateElements getStateAccess() {
		return pState;
	}
	
	public ParserRule getStateRule() {
		return getStateAccess().getRule();
	}
	
	//StateVarDecl:
	// // ...plain declaration without cross referencing is given below
	// // id1 = ID ':' typeName = ID
	// // ...single id per type
	// (name = ID ':') typeName=[aadl2::DataSubcomponentType|QCREF] ';'
	// // ...multiple ids per type -- leave this out for now until I figure out how to get cross-referencing right for an id list
	// // ids+=ID (',' ids+=ID)* ':' typeName=[aadl2::DataSubcomponentType|QCREF] ';'
	//;
	public StateVarDeclElements getStateVarDeclAccess() {
		return pStateVarDecl;
	}
	
	public ParserRule getStateVarDeclRule() {
		return getStateVarDeclAccess().getRule();
	}
	
	//Invariants:
	//    'invariants' (specs+=InvSpec)+
	//;
	public InvariantsElements getInvariantsAccess() {
		return pInvariants;
	}
	
	public ParserRule getInvariantsRule() {
		return getInvariantsAccess().getRule();
	}
	
	//InvSpec:
	//    'inv' displayName=STRING ':' expr=Expr ';'
	//;
	public InvSpecElements getInvSpecAccess() {
		return pInvSpec;
	}
	
	public ParserRule getInvSpecRule() {
		return getInvSpecAccess().getRule();
	}
	
	//Integration:
	//    'integration' (specs+=SpecStatement)+
	//;
	public IntegrationElements getIntegrationAccess() {
		return pIntegration;
	}
	
	public ParserRule getIntegrationRule() {
		return getIntegrationAccess().getRule();
	}
	
	//Initialize:
	//    'initialize' (specs+=InitializeSpecStatement)+
	//;
	public InitializeElements getInitializeAccess() {
		return pInitialize;
	}
	
	public ParserRule getInitializeRule() {
		return getInitializeAccess().getRule();
	}
	
	//InitializeSpecStatement:
	//  GuaranteeStatement
	//;
	public InitializeSpecStatementElements getInitializeSpecStatementAccess() {
		return pInitializeSpecStatement;
	}
	
	public ParserRule getInitializeSpecStatementRule() {
		return getInitializeSpecStatementAccess().getRule();
	}
	
	//Compute:
	//    'compute'
	//      // for now, just set the grammar to have a collection of case statements.
	//      // Eventually allow arbitrary assume/guarantees around an aggregated case statement
	//       (cases+=CaseStatementClause)+
	//;
	public ComputeElements getComputeAccess() {
		return pCompute;
	}
	
	public ParserRule getComputeRule() {
		return getComputeAccess().getRule();
	}
	
	//CaseStatementClause:
	//    'case' displayName=STRING ':'
	//           // in case clauses, we must have both an assume clause and a guarantee clause
	//           // but they don't have a display name (they will "inherit" the name from the case name).
	//           assumeStatement = AnonAssumeStatement
	//           guaranteeStatement = AnonGuaranteeStatement
	//;
	public CaseStatementClauseElements getCaseStatementClauseAccess() {
		return pCaseStatementClause;
	}
	
	public ParserRule getCaseStatementClauseRule() {
		return getCaseStatementClauseAccess().getRule();
	}
	
	//SpecStatement:
	//    AssumeStatement
	//  | GuaranteeStatement
	//;
	public SpecStatementElements getSpecStatementAccess() {
		return pSpecStatement;
	}
	
	public ParserRule getSpecStatementRule() {
		return getSpecStatementAccess().getRule();
	}
	
	//AssumeStatement:
	//    'assume' displayName=STRING ':' expr=Expr ';'
	//;
	public AssumeStatementElements getAssumeStatementAccess() {
		return pAssumeStatement;
	}
	
	public ParserRule getAssumeStatementRule() {
		return getAssumeStatementAccess().getRule();
	}
	
	//AnonAssumeStatement:
	//    'assume' expr=Expr ';'
	//;
	public AnonAssumeStatementElements getAnonAssumeStatementAccess() {
		return pAnonAssumeStatement;
	}
	
	public ParserRule getAnonAssumeStatementRule() {
		return getAnonAssumeStatementAccess().getRule();
	}
	
	//GuaranteeStatement:
	//    'guarantee' displayName=STRING ':' expr=Expr ';'
	//;
	public GuaranteeStatementElements getGuaranteeStatementAccess() {
		return pGuaranteeStatement;
	}
	
	public ParserRule getGuaranteeStatementRule() {
		return getGuaranteeStatementAccess().getRule();
	}
	
	//AnonGuaranteeStatement:
	//    'guarantee' expr=Expr ';'
	//;
	public AnonGuaranteeStatementElements getAnonGuaranteeStatementAccess() {
		return pAnonGuaranteeStatement;
	}
	
	public ParserRule getAnonGuaranteeStatementRule() {
		return getAnonGuaranteeStatementAccess().getRule();
	}
	
	////SpecStatement:
	////    {AssumeStatement} 'assume' ('for' forPort=[aadl2::NamedElement])?
	////        assumeTitle=STRING ':' pred=PREDICATE ('tracesTo' '<' tracesTo=ID '>')?
	////|    {GuaranteeStatement} 'guarantee' guaranteeTitle=STRING ':' expr=Expr
	////;
	//PREDICATE: // TODO
	//    ID
	//;
	public PREDICATEElements getPREDICATEAccess() {
		return pPREDICATE;
	}
	
	public ParserRule getPREDICATERule() {
		return getPREDICATEAccess().getRule();
	}
	
	//Expr:
	//    ImpliesExpr
	//;
	public ExprElements getExprAccess() {
		return pExpr;
	}
	
	public ParserRule getExprRule() {
		return getExprAccess().getRule();
	}
	
	//ImpliesExpr returns Expr:
	//    OrExpr (=>({BinaryExpr.left=current} ('=>'|'implies')) right=ImpliesExpr)?
	//;
	public ImpliesExprElements getImpliesExprAccess() {
		return pImpliesExpr;
	}
	
	public ParserRule getImpliesExprRule() {
		return getImpliesExprAccess().getRule();
	}
	
	//OrExpr returns Expr:
	//    AndExpr (=>({BinaryExpr.left=current} (op='or'|op='orelse')) right=AndExpr)*
	//;
	public OrExprElements getOrExprAccess() {
		return pOrExpr;
	}
	
	public ParserRule getOrExprRule() {
		return getOrExprAccess().getRule();
	}
	
	//AndExpr returns Expr:
	//    RelationalExpr (=>({BinaryExpr.left=current} (op='and'|op='andthen')) right=RelationalExpr)*
	//;
	public AndExprElements getAndExprAccess() {
		return pAndExpr;
	}
	
	public ParserRule getAndExprRule() {
		return getAndExprAccess().getRule();
	}
	
	//RelationalOp:
	//    '<' | '<=' | '>' | '>=' | '=' | '<>'
	//;
	public RelationalOpElements getRelationalOpAccess() {
		return pRelationalOp;
	}
	
	public ParserRule getRelationalOpRule() {
		return getRelationalOpAccess().getRule();
	}
	
	//RelationalExpr returns Expr:
	//    PlusExpr (=>({BinaryExpr.left=current} op=RelationalOp) right=PlusExpr)?
	//;
	public RelationalExprElements getRelationalExprAccess() {
		return pRelationalExpr;
	}
	
	public ParserRule getRelationalExprRule() {
		return getRelationalExprAccess().getRule();
	}
	
	//PlusExpr returns Expr:
	//    TimesExpr (=>({BinaryExpr.left=current} op=('+' | '-')) right=TimesExpr)*
	//;
	public PlusExprElements getPlusExprAccess() {
		return pPlusExpr;
	}
	
	public ParserRule getPlusExprRule() {
		return getPlusExprAccess().getRule();
	}
	
	//TimesExpr returns Expr:
	//    ExpExpr (=>({BinaryExpr.left=current} op=('*' | '/' | '%')) right=ExpExpr)*
	//;
	public TimesExprElements getTimesExprAccess() {
		return pTimesExpr;
	}
	
	public ParserRule getTimesExprRule() {
		return getTimesExprAccess().getRule();
	}
	
	//ExpExpr returns Expr:
	//    PrefixExpr (=>({BinaryExpr.left=current} op=('^')) right=PrefixExpr)*
	//;
	public ExpExprElements getExpExprAccess() {
		return pExpExpr;
	}
	
	public ParserRule getExpExprRule() {
		return getExpExprAccess().getRule();
	}
	
	//PrefixExpr returns Expr:
	//    {UnaryExpr} op=('-' | 'not') expr=PrefixExpr
	//|    AtomicExpr
	//;
	public PrefixExprElements getPrefixExprAccess() {
		return pPrefixExpr;
	}
	
	public ParserRule getPrefixExprRule() {
		return getPrefixExprAccess().getRule();
	}
	
	//AtomicExpr returns Expr:
	////  Need to figure out how to reference difference types of IDs, including cross references
	////  to port names, state variables, etc.
	////  Alternatively can the grammar be parameterized by the kinds of IDs to be supported?
	////  For example, invariants should only reference state variables.
	////    {IdExpr} id=[aadl2::NamedElement | QCREF]
	//    {StateVarRef} 'var' stateVar=[StateVarDecl|ID]
	//|   {PortRef} 'port' portName=ID
	//|    {IntLit} value=INTEGER_LIT  // use int lit syntax from AADL properties file
	//;
	public AtomicExprElements getAtomicExprAccess() {
		return pAtomicExpr;
	}
	
	public ParserRule getAtomicExprRule() {
		return getAtomicExprAccess().getRule();
	}
	
	//SubcomponentElement returns SubcomponentElement:
	//    subcomponent = [aadl2::Subcomponent|ID]
	//;
	public SubcomponentElementElements getSubcomponentElementAccess() {
		return pSubcomponentElement;
	}
	
	public ParserRule getSubcomponentElementRule() {
		return getSubcomponentElementAccess().getRule();
	}
	
	//FeatureElement returns FeatureElement:
	//    feature=[aadl2::NamedElement|ID]
	//;
	public FeatureElementElements getFeatureElementAccess() {
		return pFeatureElement;
	}
	
	public ParserRule getFeatureElementRule() {
		return getFeatureElementAccess().getRule();
	}
	
	//PModel returns aadl2::Element:
	//    ContainedPropertyAssociation //| BasicPropertyAssociation | PropertyAssociation
	//    ;
	public PropertiesGrammarAccess.PModelElements getPModelAccess() {
		return gaProperties.getPModelAccess();
	}
	
	public ParserRule getPModelRule() {
		return getPModelAccess().getRule();
	}
	
	//// Properties
	//ContainedPropertyAssociation returns aadl2::PropertyAssociation:
	//    property=[aadl2::Property|QPREF]
	//    ('=>' | append?='+=>') (constant?='constant')?
	//    (
	//     ownedValue+=OptionalModalPropertyValue
	//    ( ',' ownedValue+=OptionalModalPropertyValue )*
	//    )
	//    (AppliesToKeywords appliesTo+=ContainmentPath
	//        (',' appliesTo+=ContainmentPath)*
	//    )?
	//    (InBindingKeywords '(' inBinding+=[aadl2::Classifier|QCREF]')')?
	//    ';';
	public PropertiesGrammarAccess.ContainedPropertyAssociationElements getContainedPropertyAssociationAccess() {
		return gaProperties.getContainedPropertyAssociationAccess();
	}
	
	public ParserRule getContainedPropertyAssociationRule() {
		return getContainedPropertyAssociationAccess().getRule();
	}
	
	//PropertyAssociation returns aadl2::PropertyAssociation:
	//    property=[aadl2::Property|QPREF]
	//    ('=>' | append?='+=>') (constant?='constant')?
	//    (
	//     ownedValue+=OptionalModalPropertyValue
	//    ( ',' ownedValue+=OptionalModalPropertyValue )*
	//    )
	//    (InBindingKeywords '(' inBinding+=[aadl2::Classifier|QCREF]')')?
	//    ';'
	//    ;
	public PropertiesGrammarAccess.PropertyAssociationElements getPropertyAssociationAccess() {
		return gaProperties.getPropertyAssociationAccess();
	}
	
	public ParserRule getPropertyAssociationRule() {
		return getPropertyAssociationAccess().getRule();
	}
	
	//BasicPropertyAssociation returns aadl2::PropertyAssociation:
	//    property=[aadl2::Property|QPREF]
	//    '=>' ownedValue+=PropertyValue ';'
	//    ;
	public PropertiesGrammarAccess.BasicPropertyAssociationElements getBasicPropertyAssociationAccess() {
		return gaProperties.getBasicPropertyAssociationAccess();
	}
	
	public ParserRule getBasicPropertyAssociationRule() {
		return getBasicPropertyAssociationAccess().getRule();
	}
	
	//ContainmentPath returns aadl2::ContainedNamedElement:
	//    path=ContainmentPathElement
	////    ( 'annex' containmentPathElement+=AnnexPath )?
	//;
	public PropertiesGrammarAccess.ContainmentPathElements getContainmentPathAccess() {
		return gaProperties.getContainmentPathAccess();
	}
	
	public ParserRule getContainmentPathRule() {
		return getContainmentPathAccess().getRule();
	}
	
	////AnnexPath returns aadl2::ContainmentPathElement:
	////     namedElement=[aadl2::NamedElement|IDANNEXTEXT];
	//ModalPropertyValue returns aadl2::ModalPropertyValue:
	//    ownedValue=PropertyExpression
	//    InModesKeywords '('
	//    inMode+=[aadl2::Mode|ID] (',' inMode+=[aadl2::Mode|ID])*
	//    ')'
	//    ;
	public PropertiesGrammarAccess.ModalPropertyValueElements getModalPropertyValueAccess() {
		return gaProperties.getModalPropertyValueAccess();
	}
	
	public ParserRule getModalPropertyValueRule() {
		return getModalPropertyValueAccess().getRule();
	}
	
	//OptionalModalPropertyValue returns aadl2::ModalPropertyValue:
	//    ownedValue=PropertyExpression
	//    // phf made this optional: need to check separately that only the last one is optional
	//    ( InModesKeywords '('
	//    inMode+=[aadl2::Mode|ID] (',' inMode+=[aadl2::Mode|ID])*
	//    ')')?
	//    ;
	public PropertiesGrammarAccess.OptionalModalPropertyValueElements getOptionalModalPropertyValueAccess() {
		return gaProperties.getOptionalModalPropertyValueAccess();
	}
	
	public ParserRule getOptionalModalPropertyValueRule() {
		return getOptionalModalPropertyValueAccess().getRule();
	}
	
	//    // &&&&&&&&&& handling of in binding
	//PropertyValue returns aadl2::ModalPropertyValue:
	//    ownedValue=PropertyExpression
	//    ;
	public PropertiesGrammarAccess.PropertyValueElements getPropertyValueAccess() {
		return gaProperties.getPropertyValueAccess();
	}
	
	public ParserRule getPropertyValueRule() {
		return getPropertyValueAccess().getRule();
	}
	
	//PropertyExpression returns aadl2::PropertyExpression:
	////    OldRecordTerm |
	//      RecordTerm | ReferenceTerm | ComponentClassifierTerm
	//     | ComputedTerm | StringTerm |  NumericRangeTerm
	//    | RealTerm | IntegerTerm
	//          | ListTerm
	//          | BooleanLiteral | LiteralorReferenceTerm
	//    ;
	public PropertiesGrammarAccess.PropertyExpressionElements getPropertyExpressionAccess() {
		return gaProperties.getPropertyExpressionAccess();
	}
	
	public ParserRule getPropertyExpressionRule() {
		return getPropertyExpressionAccess().getRule();
	}
	
	//LiteralorReferenceTerm returns aadl2::NamedValue:
	//  namedValue=[aadl2::AbstractNamedValue|QPREF]
	//;
	public PropertiesGrammarAccess.LiteralorReferenceTermElements getLiteralorReferenceTermAccess() {
		return gaProperties.getLiteralorReferenceTermAccess();
	}
	
	public ParserRule getLiteralorReferenceTermRule() {
		return getLiteralorReferenceTermAccess().getRule();
	}
	
	//BooleanLiteral returns aadl2::BooleanLiteral:
	//  {aadl2::BooleanLiteral}(value?='true'|'false')
	//  ;
	public PropertiesGrammarAccess.BooleanLiteralElements getBooleanLiteralAccess() {
		return gaProperties.getBooleanLiteralAccess();
	}
	
	public ParserRule getBooleanLiteralRule() {
		return getBooleanLiteralAccess().getRule();
	}
	
	//ConstantValue returns aadl2::NamedValue:
	//  namedValue=[aadl2::PropertyConstant|QPREF]
	//  ;
	public PropertiesGrammarAccess.ConstantValueElements getConstantValueAccess() {
		return gaProperties.getConstantValueAccess();
	}
	
	public ParserRule getConstantValueRule() {
		return getConstantValueAccess().getRule();
	}
	
	//ReferenceTerm returns aadl2::ReferenceValue:
	//  'reference' '('
	//  path=ContainmentPathElement
	////    ( 'annex' ID '{**'
	////    containmentPathElement+=ContainmentPathElement
	////    ( '.' containmentPathElement+=ContainmentPathElement)*
	////    '**}')?
	//  ')'
	//  ;
	public PropertiesGrammarAccess.ReferenceTermElements getReferenceTermAccess() {
		return gaProperties.getReferenceTermAccess();
	}
	
	public ParserRule getReferenceTermRule() {
		return getReferenceTermAccess().getRule();
	}
	
	//RecordTerm returns aadl2::RecordValue:
	//   '['
	//   (ownedFieldValue+=FieldPropertyAssociation)+
	//  ']'
	//  ;
	public PropertiesGrammarAccess.RecordTermElements getRecordTermAccess() {
		return gaProperties.getRecordTermAccess();
	}
	
	public ParserRule getRecordTermRule() {
		return getRecordTermAccess().getRule();
	}
	
	//OldRecordTerm returns aadl2::RecordValue:
	//   '('
	//   (ownedFieldValue+=FieldPropertyAssociation)+
	//  ')'
	//  ;
	public PropertiesGrammarAccess.OldRecordTermElements getOldRecordTermAccess() {
		return gaProperties.getOldRecordTermAccess();
	}
	
	public ParserRule getOldRecordTermRule() {
		return getOldRecordTermAccess().getRule();
	}
	
	//ComputedTerm returns aadl2::ComputedValue:
	//   'compute' '('
	//   function=ID
	//  ')'
	//  ;
	public PropertiesGrammarAccess.ComputedTermElements getComputedTermAccess() {
		return gaProperties.getComputedTermAccess();
	}
	
	public ParserRule getComputedTermRule() {
		return getComputedTermAccess().getRule();
	}
	
	//ComponentClassifierTerm returns aadl2::ClassifierValue:
	//   'classifier' '('
	//   classifier=[aadl2::ComponentClassifier|QCREF]
	//  ')'
	//  ;
	public PropertiesGrammarAccess.ComponentClassifierTermElements getComponentClassifierTermAccess() {
		return gaProperties.getComponentClassifierTermAccess();
	}
	
	public ParserRule getComponentClassifierTermRule() {
		return getComponentClassifierTermAccess().getRule();
	}
	
	//ListTerm returns aadl2::ListValue:
	//    {aadl2::ListValue}
	//   '('
	//   (ownedListElement+=(PropertyExpression)
	//   (',' ownedListElement+=(PropertyExpression))*)?
	//  ')'
	//  ;
	public PropertiesGrammarAccess.ListTermElements getListTermAccess() {
		return gaProperties.getListTermAccess();
	}
	
	public ParserRule getListTermRule() {
		return getListTermAccess().getRule();
	}
	
	//FieldPropertyAssociation returns aadl2::BasicPropertyAssociation:
	//    property=[aadl2::BasicProperty|ID]
	//    '=>'
	//    ownedValue=PropertyExpression
	//    ';';
	public PropertiesGrammarAccess.FieldPropertyAssociationElements getFieldPropertyAssociationAccess() {
		return gaProperties.getFieldPropertyAssociationAccess();
	}
	
	public ParserRule getFieldPropertyAssociationRule() {
		return getFieldPropertyAssociationAccess().getRule();
	}
	
	//// from AADL2
	//// need to add annex path element
	//ContainmentPathElement returns aadl2::ContainmentPathElement:
	//    (
	//        (
	//            namedElement=[aadl2::NamedElement|ID]
	//             (arrayRange+=ArrayRange)*
	//        )
	//        ('.' path=ContainmentPathElement)?
	////     |      'annex' namedElement=[aadl2::NamedElement|ID]
	//    )
	//;
	public PropertiesGrammarAccess.ContainmentPathElementElements getContainmentPathElementAccess() {
		return gaProperties.getContainmentPathElementAccess();
	}
	
	public ParserRule getContainmentPathElementRule() {
		return getContainmentPathElementAccess().getRule();
	}
	
	//ANNEXREF :
	//    // check what values are ok inside ** **
	//    '{' STAR STAR ID STAR STAR '}';
	public PropertiesGrammarAccess.ANNEXREFElements getANNEXREFAccess() {
		return gaProperties.getANNEXREFAccess();
	}
	
	public ParserRule getANNEXREFRule() {
		return getANNEXREFAccess().getRule();
	}
	
	//PlusMinus returns aadl2::OperationKind: '+' | '-';
	public PropertiesGrammarAccess.PlusMinusElements getPlusMinusAccess() {
		return gaProperties.getPlusMinusAccess();
	}
	
	public ParserRule getPlusMinusRule() {
		return getPlusMinusAccess().getRule();
	}
	
	//StringTerm returns aadl2::StringLiteral:
	//    value=NoQuoteString ;
	public PropertiesGrammarAccess.StringTermElements getStringTermAccess() {
		return gaProperties.getStringTermAccess();
	}
	
	public ParserRule getStringTermRule() {
		return getStringTermAccess().getRule();
	}
	
	//NoQuoteString :
	//    // remove quotes from string in ValueConverter
	//    STRING
	//;
	public PropertiesGrammarAccess.NoQuoteStringElements getNoQuoteStringAccess() {
		return gaProperties.getNoQuoteStringAccess();
	}
	
	public ParserRule getNoQuoteStringRule() {
		return getNoQuoteStringAccess().getRule();
	}
	
	//ArrayRange returns aadl2::ArrayRange: {aadl2::ArrayRange}
	//    '[' lowerBound=INTVALUE ('..' upperBound=INTVALUE)?
	//    ']'
	//;
	public PropertiesGrammarAccess.ArrayRangeElements getArrayRangeAccess() {
		return gaProperties.getArrayRangeAccess();
	}
	
	public ParserRule getArrayRangeRule() {
		return getArrayRangeAccess().getRule();
	}
	
	//SignedConstant returns aadl2::Operation:
	//    op=PlusMinus ownedPropertyExpression+=ConstantValue
	//    ;
	public PropertiesGrammarAccess.SignedConstantElements getSignedConstantAccess() {
		return gaProperties.getSignedConstantAccess();
	}
	
	public ParserRule getSignedConstantRule() {
		return getSignedConstantAccess().getRule();
	}
	
	//IntegerTerm returns aadl2::IntegerLiteral:
	//    value=SignedInt (unit=[aadl2::UnitLiteral|ID])?
	//    ;
	public PropertiesGrammarAccess.IntegerTermElements getIntegerTermAccess() {
		return gaProperties.getIntegerTermAccess();
	}
	
	public ParserRule getIntegerTermRule() {
		return getIntegerTermAccess().getRule();
	}
	
	//SignedInt returns aadl2::Integer:
	//    ('+'|'-')?INTEGER_LIT ;
	public PropertiesGrammarAccess.SignedIntElements getSignedIntAccess() {
		return gaProperties.getSignedIntAccess();
	}
	
	public ParserRule getSignedIntRule() {
		return getSignedIntAccess().getRule();
	}
	
	//RealTerm returns aadl2::RealLiteral:
	//    value=SignedReal (unit=[aadl2::UnitLiteral|ID])?
	//    ;
	public PropertiesGrammarAccess.RealTermElements getRealTermAccess() {
		return gaProperties.getRealTermAccess();
	}
	
	public ParserRule getRealTermRule() {
		return getRealTermAccess().getRule();
	}
	
	//SignedReal returns aadl2::Real:
	//    ('+'|'-')?REAL_LIT ;
	public PropertiesGrammarAccess.SignedRealElements getSignedRealAccess() {
		return gaProperties.getSignedRealAccess();
	}
	
	public ParserRule getSignedRealRule() {
		return getSignedRealAccess().getRule();
	}
	
	//NumericRangeTerm returns aadl2::RangeValue:
	//    minimum=NumAlt //(RealTerm|IntegerTerm| SignedConstant | ConstantValue)
	//        '..' maximum=NumAlt//(RealTerm|IntegerTerm| SignedConstant | ConstantValue)
	//    ( 'delta' delta=NumAlt//(RealTerm|IntegerTerm| SignedConstant | ConstantValue)
	//    )?
	//    ;
	public PropertiesGrammarAccess.NumericRangeTermElements getNumericRangeTermAccess() {
		return gaProperties.getNumericRangeTermAccess();
	}
	
	public ParserRule getNumericRangeTermRule() {
		return getNumericRangeTermAccess().getRule();
	}
	
	//NumAlt  returns aadl2::PropertyExpression:
	//    RealTerm|IntegerTerm| SignedConstant | ConstantValue
	//;
	public PropertiesGrammarAccess.NumAltElements getNumAltAccess() {
		return gaProperties.getNumAltAccess();
	}
	
	public ParserRule getNumAltRule() {
		return getNumAltAccess().getRule();
	}
	
	//AppliesToKeywords:
	//    'applies' 'to'
	//;
	public PropertiesGrammarAccess.AppliesToKeywordsElements getAppliesToKeywordsAccess() {
		return gaProperties.getAppliesToKeywordsAccess();
	}
	
	public ParserRule getAppliesToKeywordsRule() {
		return getAppliesToKeywordsAccess().getRule();
	}
	
	//InBindingKeywords:
	//    'in' 'binding'
	//;
	public PropertiesGrammarAccess.InBindingKeywordsElements getInBindingKeywordsAccess() {
		return gaProperties.getInBindingKeywordsAccess();
	}
	
	public ParserRule getInBindingKeywordsRule() {
		return getInBindingKeywordsAccess().getRule();
	}
	
	//InModesKeywords:
	//    'in' 'modes'
	//;
	public PropertiesGrammarAccess.InModesKeywordsElements getInModesKeywordsAccess() {
		return gaProperties.getInModesKeywordsAccess();
	}
	
	public ParserRule getInModesKeywordsRule() {
		return getInModesKeywordsAccess().getRule();
	}
	
	//terminal SL_COMMENT:
	//    '--' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaProperties.getSL_COMMENTRule();
	}
	
	//INTVALUE returns aadl2::Integer:
	//    INTEGER_LIT //NUMERAL
	//;
	public PropertiesGrammarAccess.INTVALUEElements getINTVALUEAccess() {
		return gaProperties.getINTVALUEAccess();
	}
	
	public ParserRule getINTVALUERule() {
		return getINTVALUEAccess().getRule();
	}
	
	////terminal NUMERAL:
	////    (DIGIT)+('_' (DIGIT)+)*
	////;
	////terminal INT returns ecore::EInt: (DIGIT)+('_' (DIGIT)+)*;
	//terminal fragment
	//EXPONENT  :  ('e'|'E') ('+'|'-')? ( DIGIT )+  ;
	public TerminalRule getEXPONENTRule() {
		return gaProperties.getEXPONENTRule();
	}
	
	//terminal fragment
	//INT_EXPONENT :  ('e'|'E') ('+')? ( DIGIT )+ ;
	public TerminalRule getINT_EXPONENTRule() {
		return gaProperties.getINT_EXPONENTRule();
	}
	
	//terminal REAL_LIT :
	//    (DIGIT)+('_' (DIGIT)+)* ( '.' (DIGIT)+('_' (DIGIT)+)* ( EXPONENT )?)
	//  ;
	public TerminalRule getREAL_LITRule() {
		return gaProperties.getREAL_LITRule();
	}
	
	//terminal INTEGER_LIT :
	//        (DIGIT)+('_' (DIGIT)+)*
	//        (( '#' BASED_INTEGER  '#' ( INT_EXPONENT )? )
	//            | (INT_EXPONENT)?
	//        )
	//  ;
	public TerminalRule getINTEGER_LITRule() {
		return gaProperties.getINTEGER_LITRule();
	}
	
	//terminal fragment
	//DIGIT     :  ( '0'..'9' ) ;
	public TerminalRule getDIGITRule() {
		return gaProperties.getDIGITRule();
	}
	
	//terminal fragment
	//EXTENDED_DIGIT     :  ( '0'..'9' | 'a'..'f' | 'A'..'F') ;
	public TerminalRule getEXTENDED_DIGITRule() {
		return gaProperties.getEXTENDED_DIGITRule();
	}
	
	//terminal fragment
	//BASED_INTEGER      :  ( EXTENDED_DIGIT ) ( ('_')? EXTENDED_DIGIT )* ;
	public TerminalRule getBASED_INTEGERRule() {
		return gaProperties.getBASED_INTEGERRule();
	}
	
	//QCLREF:
	//    ID '::' ID;
	public PropertiesGrammarAccess.QCLREFElements getQCLREFAccess() {
		return gaProperties.getQCLREFAccess();
	}
	
	public ParserRule getQCLREFRule() {
		return getQCLREFAccess().getRule();
	}
	
	//QPREF:
	//    ID ('::' ID)?;
	public PropertiesGrammarAccess.QPREFElements getQPREFAccess() {
		return gaProperties.getQPREFAccess();
	}
	
	public ParserRule getQPREFRule() {
		return getQPREFAccess().getRule();
	}
	
	//QCREF:
	//    (ID '::')* ID ('.' ID)?;
	public PropertiesGrammarAccess.QCREFElements getQCREFAccess() {
		return gaProperties.getQCREFAccess();
	}
	
	public ParserRule getQCREFRule() {
		return getQCREFAccess().getRule();
	}
	
	//STAR : '*';
	public PropertiesGrammarAccess.STARElements getSTARAccess() {
		return gaProperties.getSTARAccess();
	}
	
	public ParserRule getSTARRule() {
		return getSTARAccess().getRule();
	}
	
	//terminal STRING    :
	//            '"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\') | !('\\'|'"') )* '"' |
	//            "'" ( '\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\') | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaProperties.getSTRINGRule();
	}
	
	////terminal ID          : '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	//terminal ID:    ('a'..'z'
	//        |'A'..'Z'
	//        ) ( ('_')? ('a'..'z'
	//        |'A'..'Z'
	//        |'0'..'9'))*;
	public TerminalRule getIDRule() {
		return gaProperties.getIDRule();
	}
	
	//terminal WS			: (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaProperties.getWSRule();
	}
}
