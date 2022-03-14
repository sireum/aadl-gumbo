
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
		private final Assignment cFunctionsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cFunctionsFunctionsParserRuleCall_1_0 = (RuleCall)cFunctionsAssignment_1.eContents().get(0);
		private final Assignment cInvariantsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cInvariantsInvariantsParserRuleCall_2_0 = (RuleCall)cInvariantsAssignment_2.eContents().get(0);
		private final Assignment cIntegrationAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cIntegrationIntegrationParserRuleCall_3_0 = (RuleCall)cIntegrationAssignment_3.eContents().get(0);
		private final Assignment cInitializeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cInitializeInitializeParserRuleCall_4_0 = (RuleCall)cInitializeAssignment_4.eContents().get(0);
		private final Assignment cComputeAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cComputeComputeParserRuleCall_5_0 = (RuleCall)cComputeAssignment_5.eContents().get(0);
		
		//SpecSection:
		////    ComputationalModel
		////|    Flows
		//    (state = State)?
		//    (functions = Functions)?
		//    (invariants = Invariants)?
		//    (integration = Integration)?
		//    (initialize = Initialize)?
		//    (compute = Compute)?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		////    ComputationalModel
		////|    Flows
		//    (state = State)?
		//    (functions = Functions)?
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
		
		//(functions = Functions)?
		public Assignment getFunctionsAssignment_1() { return cFunctionsAssignment_1; }
		
		//Functions
		public RuleCall getFunctionsFunctionsParserRuleCall_1_0() { return cFunctionsFunctionsParserRuleCall_1_0; }
		
		//(invariants = Invariants)?
		public Assignment getInvariantsAssignment_2() { return cInvariantsAssignment_2; }
		
		//Invariants
		public RuleCall getInvariantsInvariantsParserRuleCall_2_0() { return cInvariantsInvariantsParserRuleCall_2_0; }
		
		//(integration = Integration)?
		public Assignment getIntegrationAssignment_3() { return cIntegrationAssignment_3; }
		
		//Integration
		public RuleCall getIntegrationIntegrationParserRuleCall_3_0() { return cIntegrationIntegrationParserRuleCall_3_0; }
		
		//(initialize = Initialize)?
		public Assignment getInitializeAssignment_4() { return cInitializeAssignment_4; }
		
		//Initialize
		public RuleCall getInitializeInitializeParserRuleCall_4_0() { return cInitializeInitializeParserRuleCall_4_0; }
		
		//(compute = Compute)?
		public Assignment getComputeAssignment_5() { return cComputeAssignment_5; }
		
		//Compute
		public RuleCall getComputeComputeParserRuleCall_5_0() { return cComputeComputeParserRuleCall_5_0; }
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
		private final RuleCall cEquivExprParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
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
		//    EquivExpr (=>({BinaryExpr.left=current} ('=>'|'implies')) right=ImpliesExpr)?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//EquivExpr (=>({BinaryExpr.left=current} ('=>'|'implies')) right=ImpliesExpr)?
		public Group getGroup() { return cGroup; }
		
		//EquivExpr
		public RuleCall getEquivExprParserRuleCall_0() { return cEquivExprParserRuleCall_0; }
		
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
	public class EquivExprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.EquivExpr");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cOrExprParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cGroup_1.eContents().get(0);
		private final Group cGroup_1_0_0 = (Group)cGroup_1_0.eContents().get(0);
		private final Action cBinaryExprLeftAction_1_0_0_0 = (Action)cGroup_1_0_0.eContents().get(0);
		private final Assignment cOpAssignment_1_0_0_1 = (Assignment)cGroup_1_0_0.eContents().get(1);
		private final Keyword cOpLessThanSignEqualsSignGreaterThanSignKeyword_1_0_0_1_0 = (Keyword)cOpAssignment_1_0_0_1.eContents().get(0);
		private final Assignment cRightAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cRightOrExprParserRuleCall_1_1_0 = (RuleCall)cRightAssignment_1_1.eContents().get(0);
		
		//EquivExpr returns Expr:
		//    OrExpr (=> ({BinaryExpr.left=current} op='<=>') right=OrExpr)?;
		@Override public ParserRule getRule() { return rule; }
		
		//OrExpr (=> ({BinaryExpr.left=current} op='<=>') right=OrExpr)?
		public Group getGroup() { return cGroup; }
		
		//OrExpr
		public RuleCall getOrExprParserRuleCall_0() { return cOrExprParserRuleCall_0; }
		
		//(=> ({BinaryExpr.left=current} op='<=>') right=OrExpr)?
		public Group getGroup_1() { return cGroup_1; }
		
		//=> ({BinaryExpr.left=current} op='<=>')
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//{BinaryExpr.left=current} op='<=>'
		public Group getGroup_1_0_0() { return cGroup_1_0_0; }
		
		//{BinaryExpr.left=current}
		public Action getBinaryExprLeftAction_1_0_0_0() { return cBinaryExprLeftAction_1_0_0_0; }
		
		//op='<=>'
		public Assignment getOpAssignment_1_0_0_1() { return cOpAssignment_1_0_0_1; }
		
		//'<=>'
		public Keyword getOpLessThanSignEqualsSignGreaterThanSignKeyword_1_0_0_1_0() { return cOpLessThanSignEqualsSignGreaterThanSignKeyword_1_0_0_1_0; }
		
		//right=OrExpr
		public Assignment getRightAssignment_1_1() { return cRightAssignment_1_1; }
		
		//OrExpr
		public RuleCall getRightOrExprParserRuleCall_1_1_0() { return cRightOrExprParserRuleCall_1_1_0; }
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
		private final RuleCall cAddSubExprParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cGroup_1.eContents().get(0);
		private final Group cGroup_1_0_0 = (Group)cGroup_1_0.eContents().get(0);
		private final Action cBinaryExprLeftAction_1_0_0_0 = (Action)cGroup_1_0_0.eContents().get(0);
		private final Assignment cOpAssignment_1_0_0_1 = (Assignment)cGroup_1_0_0.eContents().get(1);
		private final RuleCall cOpRelationalOpParserRuleCall_1_0_0_1_0 = (RuleCall)cOpAssignment_1_0_0_1.eContents().get(0);
		private final Assignment cRightAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cRightAddSubExprParserRuleCall_1_1_0 = (RuleCall)cRightAssignment_1_1.eContents().get(0);
		
		//RelationalExpr returns Expr:
		//    AddSubExpr (=>({BinaryExpr.left=current} op=RelationalOp) right=AddSubExpr)?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//AddSubExpr (=>({BinaryExpr.left=current} op=RelationalOp) right=AddSubExpr)?
		public Group getGroup() { return cGroup; }
		
		//AddSubExpr
		public RuleCall getAddSubExprParserRuleCall_0() { return cAddSubExprParserRuleCall_0; }
		
		//(=>({BinaryExpr.left=current} op=RelationalOp) right=AddSubExpr)?
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
		
		//right=AddSubExpr
		public Assignment getRightAssignment_1_1() { return cRightAssignment_1_1; }
		
		//AddSubExpr
		public RuleCall getRightAddSubExprParserRuleCall_1_1_0() { return cRightAddSubExprParserRuleCall_1_1_0; }
	}
	public class AddSubExprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.AddSubExpr");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cMultDivModExprParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cGroup_1.eContents().get(0);
		private final Group cGroup_1_0_0 = (Group)cGroup_1_0.eContents().get(0);
		private final Action cBinaryExprLeftAction_1_0_0_0 = (Action)cGroup_1_0_0.eContents().get(0);
		private final Assignment cOpAssignment_1_0_0_1 = (Assignment)cGroup_1_0_0.eContents().get(1);
		private final Alternatives cOpAlternatives_1_0_0_1_0 = (Alternatives)cOpAssignment_1_0_0_1.eContents().get(0);
		private final Keyword cOpPlusSignKeyword_1_0_0_1_0_0 = (Keyword)cOpAlternatives_1_0_0_1_0.eContents().get(0);
		private final Keyword cOpHyphenMinusKeyword_1_0_0_1_0_1 = (Keyword)cOpAlternatives_1_0_0_1_0.eContents().get(1);
		private final Assignment cRightAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cRightMultDivModExprParserRuleCall_1_1_0 = (RuleCall)cRightAssignment_1_1.eContents().get(0);
		
		//AddSubExpr returns Expr:
		//    MultDivModExpr (=>({BinaryExpr.left=current} op=('+' | '-')) right=MultDivModExpr)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//MultDivModExpr (=>({BinaryExpr.left=current} op=('+' | '-')) right=MultDivModExpr)*
		public Group getGroup() { return cGroup; }
		
		//MultDivModExpr
		public RuleCall getMultDivModExprParserRuleCall_0() { return cMultDivModExprParserRuleCall_0; }
		
		//(=>({BinaryExpr.left=current} op=('+' | '-')) right=MultDivModExpr)*
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
		
		//right=MultDivModExpr
		public Assignment getRightAssignment_1_1() { return cRightAssignment_1_1; }
		
		//MultDivModExpr
		public RuleCall getRightMultDivModExprParserRuleCall_1_1_0() { return cRightMultDivModExprParserRuleCall_1_1_0; }
	}
	public class MultDivModExprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.MultDivModExpr");
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
		
		//MultDivModExpr returns Expr:
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
		private final Action cDataRefExprAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Assignment cPortOrSubcomponentOrStateVarAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final CrossReference cPortOrSubcomponentOrStateVarEObjectCrossReference_0_1_0 = (CrossReference)cPortOrSubcomponentOrStateVarAssignment_0_1.eContents().get(0);
		private final RuleCall cPortOrSubcomponentOrStateVarEObjectIDTerminalRuleCall_0_1_0_1 = (RuleCall)cPortOrSubcomponentOrStateVarEObjectCrossReference_0_1_0.eContents().get(1);
		private final Group cGroup_0_2 = (Group)cGroup_0.eContents().get(2);
		private final Keyword cFullStopKeyword_0_2_0 = (Keyword)cGroup_0_2.eContents().get(0);
		private final Assignment cRefAssignment_0_2_1 = (Assignment)cGroup_0_2.eContents().get(1);
		private final RuleCall cRefOtherDataRefParserRuleCall_0_2_1_0 = (RuleCall)cRefAssignment_0_2_1.eContents().get(0);
		private final Assignment cCsAssignment_0_3 = (Assignment)cGroup_0.eContents().get(3);
		private final RuleCall cCsCallSuffixParserRuleCall_0_3_0 = (RuleCall)cCsAssignment_0_3.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cGroup_1.eContents().get(0);
		private final Group cGroup_1_0_0 = (Group)cGroup_1_0.eContents().get(0);
		private final Action cEnumLitExprAction_1_0_0_0 = (Action)cGroup_1_0_0.eContents().get(0);
		private final Keyword cEnumKeyword_1_0_0_1 = (Keyword)cGroup_1_0_0.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_1_0_0_2 = (Keyword)cGroup_1_0_0.eContents().get(2);
		private final Assignment cEnumTypeAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cEnumTypeDataElementParserRuleCall_1_1_0 = (RuleCall)cEnumTypeAssignment_1_1.eContents().get(0);
		private final Keyword cCommaKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Assignment cValueAssignment_1_3 = (Assignment)cGroup_1.eContents().get(3);
		private final CrossReference cValueStringLiteralCrossReference_1_3_0 = (CrossReference)cValueAssignment_1_3.eContents().get(0);
		private final RuleCall cValueStringLiteralIDTerminalRuleCall_1_3_0_1 = (RuleCall)cValueStringLiteralCrossReference_1_3_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_1_4 = (Keyword)cGroup_1.eContents().get(4);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Group cGroup_2_0 = (Group)cGroup_2.eContents().get(0);
		private final Group cGroup_2_0_0 = (Group)cGroup_2_0.eContents().get(0);
		private final Action cRecordLitExprAction_2_0_0_0 = (Action)cGroup_2_0_0.eContents().get(0);
		private final Assignment cRecordTypeAssignment_2_0_0_1 = (Assignment)cGroup_2_0_0.eContents().get(1);
		private final RuleCall cRecordTypeDataElementParserRuleCall_2_0_0_1_0 = (RuleCall)cRecordTypeAssignment_2_0_0_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2_0_0_2 = (Keyword)cGroup_2_0_0.eContents().get(2);
		private final Assignment cArgsAssignment_2_0_0_3 = (Assignment)cGroup_2_0_0.eContents().get(3);
		private final CrossReference cArgsNamedElementCrossReference_2_0_0_3_0 = (CrossReference)cArgsAssignment_2_0_0_3.eContents().get(0);
		private final RuleCall cArgsNamedElementIDTerminalRuleCall_2_0_0_3_0_1 = (RuleCall)cArgsNamedElementCrossReference_2_0_0_3_0.eContents().get(1);
		private final Keyword cEqualsSignKeyword_2_0_0_4 = (Keyword)cGroup_2_0_0.eContents().get(4);
		private final Assignment cArgExprAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cArgExprExprParserRuleCall_2_1_0 = (RuleCall)cArgExprAssignment_2_1.eContents().get(0);
		private final Group cGroup_2_2 = (Group)cGroup_2.eContents().get(2);
		private final Keyword cSemicolonKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cArgsAssignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final CrossReference cArgsNamedElementCrossReference_2_2_1_0 = (CrossReference)cArgsAssignment_2_2_1.eContents().get(0);
		private final RuleCall cArgsNamedElementIDTerminalRuleCall_2_2_1_0_1 = (RuleCall)cArgsNamedElementCrossReference_2_2_1_0.eContents().get(1);
		private final Keyword cEqualsSignKeyword_2_2_2 = (Keyword)cGroup_2_2.eContents().get(2);
		private final Assignment cArgExprAssignment_2_2_3 = (Assignment)cGroup_2_2.eContents().get(3);
		private final RuleCall cArgExprExprParserRuleCall_2_2_3_0 = (RuleCall)cArgExprAssignment_2_2_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_2_3 = (Keyword)cGroup_2.eContents().get(3);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final Action cIntLitAction_3_0 = (Action)cGroup_3.eContents().get(0);
		private final Assignment cValueAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cValueINTEGER_LITTerminalRuleCall_3_1_0 = (RuleCall)cValueAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cAlternatives.eContents().get(4);
		private final Action cRealLitExprAction_4_0 = (Action)cGroup_4.eContents().get(0);
		private final Assignment cValAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cValREAL_LITTerminalRuleCall_4_1_0 = (RuleCall)cValAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cAlternatives.eContents().get(5);
		private final Action cBoolLitExprAction_5_0 = (Action)cGroup_5.eContents().get(0);
		private final Assignment cValAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cValBooleanLiteralParserRuleCall_5_1_0 = (RuleCall)cValAssignment_5_1.eContents().get(0);
		private final Group cGroup_6 = (Group)cAlternatives.eContents().get(6);
		private final Action cFloorCastAction_6_0 = (Action)cGroup_6.eContents().get(0);
		private final Keyword cFloorKeyword_6_1 = (Keyword)cGroup_6.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_6_2 = (Keyword)cGroup_6.eContents().get(2);
		private final Assignment cExprAssignment_6_3 = (Assignment)cGroup_6.eContents().get(3);
		private final RuleCall cExprExprParserRuleCall_6_3_0 = (RuleCall)cExprAssignment_6_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_6_4 = (Keyword)cGroup_6.eContents().get(4);
		private final Group cGroup_7 = (Group)cAlternatives.eContents().get(7);
		private final Action cRealCastAction_7_0 = (Action)cGroup_7.eContents().get(0);
		private final Keyword cRealKeyword_7_1 = (Keyword)cGroup_7.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_7_2 = (Keyword)cGroup_7.eContents().get(2);
		private final Assignment cExprAssignment_7_3 = (Assignment)cGroup_7.eContents().get(3);
		private final RuleCall cExprExprParserRuleCall_7_3_0 = (RuleCall)cExprAssignment_7_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_7_4 = (Keyword)cGroup_7.eContents().get(4);
		private final Group cGroup_8 = (Group)cAlternatives.eContents().get(8);
		private final Keyword cLeftParenthesisKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final RuleCall cExprParserRuleCall_8_1 = (RuleCall)cGroup_8.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_8_2 = (Keyword)cGroup_8.eContents().get(2);
		
		//AtomicExpr returns Expr:
		////  Need to figure out how to reference difference types of IDs, including cross references
		////  to port names, state variables, etc.
		////  Alternatively can the grammar be parameterized by the kinds of IDs to be supported?
		////  For example, invariants should only reference state variables.
		////    {IdExpr} id=[aadl2::NamedElement | QCREF]
		////    {StateVarRef} 'var' stateVar=[StateVarDecl|ID] ('.' ref=OtherDataRef)?
		////|   {PortRef} 'port' port=ContainmentPathElement
		//   {DataRefExpr} portOrSubcomponentOrStateVar=[ecore::EObject|ID] ('.' ref=OtherDataRef)? cs=CallSuffix?
		//| => ({EnumLitExpr} 'enum' '(') enumType=DataElement ',' value=[aadl2::StringLiteral|ID] ')'
		//| => ({RecordLitExpr} recordType=DataElement '{' args+=[aadl2::NamedElement|ID] '=') argExpr+=Expr (';' args+=[aadl2::NamedElement|ID] '=' argExpr+=Expr)* '}'
		//|    {IntLit} value=INTEGER_LIT  // use int lit syntax from AADL properties file
		//|   {RealLitExpr} val=REAL_LIT
		//|   {BoolLitExpr} val=BooleanLiteral
		//|   {FloorCast} 'floor' '(' expr=Expr ')'
		//|   {RealCast}  'real' '(' expr=Expr ')'
		////|   ID CallSuffix
		//|   '(' Expr ')'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		////  Need to figure out how to reference difference types of IDs, including cross references
		////  to port names, state variables, etc.
		////  Alternatively can the grammar be parameterized by the kinds of IDs to be supported?
		////  For example, invariants should only reference state variables.
		////    {IdExpr} id=[aadl2::NamedElement | QCREF]
		////    {StateVarRef} 'var' stateVar=[StateVarDecl|ID] ('.' ref=OtherDataRef)?
		////|   {PortRef} 'port' port=ContainmentPathElement
		//   {DataRefExpr} portOrSubcomponentOrStateVar=[ecore::EObject|ID] ('.' ref=OtherDataRef)? cs=CallSuffix?
		//| => ({EnumLitExpr} 'enum' '(') enumType=DataElement ',' value=[aadl2::StringLiteral|ID] ')'
		//| => ({RecordLitExpr} recordType=DataElement '{' args+=[aadl2::NamedElement|ID] '=') argExpr+=Expr (';' args+=[aadl2::NamedElement|ID] '=' argExpr+=Expr)* '}'
		//|    {IntLit} value=INTEGER_LIT  // use int lit syntax from AADL properties file
		//|   {RealLitExpr} val=REAL_LIT
		//|   {BoolLitExpr} val=BooleanLiteral
		//|   {FloorCast} 'floor' '(' expr=Expr ')'
		//|   {RealCast}  'real' '(' expr=Expr ')'
		////|   ID CallSuffix
		//|   '(' Expr ')'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		////  Need to figure out how to reference difference types of IDs, including cross references
		////  to port names, state variables, etc.
		////  Alternatively can the grammar be parameterized by the kinds of IDs to be supported?
		////  For example, invariants should only reference state variables.
		////    {IdExpr} id=[aadl2::NamedElement | QCREF]
		////    {StateVarRef} 'var' stateVar=[StateVarDecl|ID] ('.' ref=OtherDataRef)?
		////|   {PortRef} 'port' port=ContainmentPathElement
		//   {DataRefExpr} portOrSubcomponentOrStateVar=[ecore::EObject|ID] ('.' ref=OtherDataRef)? cs=CallSuffix?
		public Group getGroup_0() { return cGroup_0; }
		
		////  Need to figure out how to reference difference types of IDs, including cross references
		////  to port names, state variables, etc.
		////  Alternatively can the grammar be parameterized by the kinds of IDs to be supported?
		////  For example, invariants should only reference state variables.
		////    {IdExpr} id=[aadl2::NamedElement | QCREF]
		////    {StateVarRef} 'var' stateVar=[StateVarDecl|ID] ('.' ref=OtherDataRef)?
		////|   {PortRef} 'port' port=ContainmentPathElement
		//   {DataRefExpr}
		public Action getDataRefExprAction_0_0() { return cDataRefExprAction_0_0; }
		
		//portOrSubcomponentOrStateVar=[ecore::EObject|ID]
		public Assignment getPortOrSubcomponentOrStateVarAssignment_0_1() { return cPortOrSubcomponentOrStateVarAssignment_0_1; }
		
		//[ecore::EObject|ID]
		public CrossReference getPortOrSubcomponentOrStateVarEObjectCrossReference_0_1_0() { return cPortOrSubcomponentOrStateVarEObjectCrossReference_0_1_0; }
		
		//ID
		public RuleCall getPortOrSubcomponentOrStateVarEObjectIDTerminalRuleCall_0_1_0_1() { return cPortOrSubcomponentOrStateVarEObjectIDTerminalRuleCall_0_1_0_1; }
		
		//('.' ref=OtherDataRef)?
		public Group getGroup_0_2() { return cGroup_0_2; }
		
		//'.'
		public Keyword getFullStopKeyword_0_2_0() { return cFullStopKeyword_0_2_0; }
		
		//ref=OtherDataRef
		public Assignment getRefAssignment_0_2_1() { return cRefAssignment_0_2_1; }
		
		//OtherDataRef
		public RuleCall getRefOtherDataRefParserRuleCall_0_2_1_0() { return cRefOtherDataRefParserRuleCall_0_2_1_0; }
		
		//cs=CallSuffix?
		public Assignment getCsAssignment_0_3() { return cCsAssignment_0_3; }
		
		//CallSuffix
		public RuleCall getCsCallSuffixParserRuleCall_0_3_0() { return cCsCallSuffixParserRuleCall_0_3_0; }
		
		//=> ({EnumLitExpr} 'enum' '(') enumType=DataElement ',' value=[aadl2::StringLiteral|ID] ')'
		public Group getGroup_1() { return cGroup_1; }
		
		//=> ({EnumLitExpr} 'enum' '(')
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//{EnumLitExpr} 'enum' '('
		public Group getGroup_1_0_0() { return cGroup_1_0_0; }
		
		//{EnumLitExpr}
		public Action getEnumLitExprAction_1_0_0_0() { return cEnumLitExprAction_1_0_0_0; }
		
		//'enum'
		public Keyword getEnumKeyword_1_0_0_1() { return cEnumKeyword_1_0_0_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1_0_0_2() { return cLeftParenthesisKeyword_1_0_0_2; }
		
		//enumType=DataElement
		public Assignment getEnumTypeAssignment_1_1() { return cEnumTypeAssignment_1_1; }
		
		//DataElement
		public RuleCall getEnumTypeDataElementParserRuleCall_1_1_0() { return cEnumTypeDataElementParserRuleCall_1_1_0; }
		
		//','
		public Keyword getCommaKeyword_1_2() { return cCommaKeyword_1_2; }
		
		//value=[aadl2::StringLiteral|ID]
		public Assignment getValueAssignment_1_3() { return cValueAssignment_1_3; }
		
		//[aadl2::StringLiteral|ID]
		public CrossReference getValueStringLiteralCrossReference_1_3_0() { return cValueStringLiteralCrossReference_1_3_0; }
		
		//ID
		public RuleCall getValueStringLiteralIDTerminalRuleCall_1_3_0_1() { return cValueStringLiteralIDTerminalRuleCall_1_3_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_1_4() { return cRightParenthesisKeyword_1_4; }
		
		//=> ({RecordLitExpr} recordType=DataElement '{' args+=[aadl2::NamedElement|ID] '=') argExpr+=Expr (';' args+=[aadl2::NamedElement|ID] '=' argExpr+=Expr)* '}'
		public Group getGroup_2() { return cGroup_2; }
		
		//=> ({RecordLitExpr} recordType=DataElement '{' args+=[aadl2::NamedElement|ID] '=')
		public Group getGroup_2_0() { return cGroup_2_0; }
		
		//{RecordLitExpr} recordType=DataElement '{' args+=[aadl2::NamedElement|ID] '='
		public Group getGroup_2_0_0() { return cGroup_2_0_0; }
		
		//{RecordLitExpr}
		public Action getRecordLitExprAction_2_0_0_0() { return cRecordLitExprAction_2_0_0_0; }
		
		//recordType=DataElement
		public Assignment getRecordTypeAssignment_2_0_0_1() { return cRecordTypeAssignment_2_0_0_1; }
		
		//DataElement
		public RuleCall getRecordTypeDataElementParserRuleCall_2_0_0_1_0() { return cRecordTypeDataElementParserRuleCall_2_0_0_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2_0_0_2() { return cLeftCurlyBracketKeyword_2_0_0_2; }
		
		//args+=[aadl2::NamedElement|ID]
		public Assignment getArgsAssignment_2_0_0_3() { return cArgsAssignment_2_0_0_3; }
		
		//[aadl2::NamedElement|ID]
		public CrossReference getArgsNamedElementCrossReference_2_0_0_3_0() { return cArgsNamedElementCrossReference_2_0_0_3_0; }
		
		//ID
		public RuleCall getArgsNamedElementIDTerminalRuleCall_2_0_0_3_0_1() { return cArgsNamedElementIDTerminalRuleCall_2_0_0_3_0_1; }
		
		//'='
		public Keyword getEqualsSignKeyword_2_0_0_4() { return cEqualsSignKeyword_2_0_0_4; }
		
		//argExpr+=Expr
		public Assignment getArgExprAssignment_2_1() { return cArgExprAssignment_2_1; }
		
		//Expr
		public RuleCall getArgExprExprParserRuleCall_2_1_0() { return cArgExprExprParserRuleCall_2_1_0; }
		
		//(';' args+=[aadl2::NamedElement|ID] '=' argExpr+=Expr)*
		public Group getGroup_2_2() { return cGroup_2_2; }
		
		//';'
		public Keyword getSemicolonKeyword_2_2_0() { return cSemicolonKeyword_2_2_0; }
		
		//args+=[aadl2::NamedElement|ID]
		public Assignment getArgsAssignment_2_2_1() { return cArgsAssignment_2_2_1; }
		
		//[aadl2::NamedElement|ID]
		public CrossReference getArgsNamedElementCrossReference_2_2_1_0() { return cArgsNamedElementCrossReference_2_2_1_0; }
		
		//ID
		public RuleCall getArgsNamedElementIDTerminalRuleCall_2_2_1_0_1() { return cArgsNamedElementIDTerminalRuleCall_2_2_1_0_1; }
		
		//'='
		public Keyword getEqualsSignKeyword_2_2_2() { return cEqualsSignKeyword_2_2_2; }
		
		//argExpr+=Expr
		public Assignment getArgExprAssignment_2_2_3() { return cArgExprAssignment_2_2_3; }
		
		//Expr
		public RuleCall getArgExprExprParserRuleCall_2_2_3_0() { return cArgExprExprParserRuleCall_2_2_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_2_3() { return cRightCurlyBracketKeyword_2_3; }
		
		//{IntLit} value=INTEGER_LIT
		public Group getGroup_3() { return cGroup_3; }
		
		//{IntLit}
		public Action getIntLitAction_3_0() { return cIntLitAction_3_0; }
		
		//value=INTEGER_LIT
		public Assignment getValueAssignment_3_1() { return cValueAssignment_3_1; }
		
		//INTEGER_LIT
		public RuleCall getValueINTEGER_LITTerminalRuleCall_3_1_0() { return cValueINTEGER_LITTerminalRuleCall_3_1_0; }
		
		//{RealLitExpr} val=REAL_LIT
		public Group getGroup_4() { return cGroup_4; }
		
		//{RealLitExpr}
		public Action getRealLitExprAction_4_0() { return cRealLitExprAction_4_0; }
		
		//val=REAL_LIT
		public Assignment getValAssignment_4_1() { return cValAssignment_4_1; }
		
		//REAL_LIT
		public RuleCall getValREAL_LITTerminalRuleCall_4_1_0() { return cValREAL_LITTerminalRuleCall_4_1_0; }
		
		//{BoolLitExpr} val=BooleanLiteral
		public Group getGroup_5() { return cGroup_5; }
		
		//{BoolLitExpr}
		public Action getBoolLitExprAction_5_0() { return cBoolLitExprAction_5_0; }
		
		//val=BooleanLiteral
		public Assignment getValAssignment_5_1() { return cValAssignment_5_1; }
		
		//BooleanLiteral
		public RuleCall getValBooleanLiteralParserRuleCall_5_1_0() { return cValBooleanLiteralParserRuleCall_5_1_0; }
		
		//{FloorCast} 'floor' '(' expr=Expr ')'
		public Group getGroup_6() { return cGroup_6; }
		
		//{FloorCast}
		public Action getFloorCastAction_6_0() { return cFloorCastAction_6_0; }
		
		//'floor'
		public Keyword getFloorKeyword_6_1() { return cFloorKeyword_6_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_6_2() { return cLeftParenthesisKeyword_6_2; }
		
		//expr=Expr
		public Assignment getExprAssignment_6_3() { return cExprAssignment_6_3; }
		
		//Expr
		public RuleCall getExprExprParserRuleCall_6_3_0() { return cExprExprParserRuleCall_6_3_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_6_4() { return cRightParenthesisKeyword_6_4; }
		
		//{RealCast}  'real' '(' expr=Expr ')'
		public Group getGroup_7() { return cGroup_7; }
		
		//{RealCast}
		public Action getRealCastAction_7_0() { return cRealCastAction_7_0; }
		
		//'real'
		public Keyword getRealKeyword_7_1() { return cRealKeyword_7_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_7_2() { return cLeftParenthesisKeyword_7_2; }
		
		//expr=Expr
		public Assignment getExprAssignment_7_3() { return cExprAssignment_7_3; }
		
		//Expr
		public RuleCall getExprExprParserRuleCall_7_3_0() { return cExprExprParserRuleCall_7_3_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_7_4() { return cRightParenthesisKeyword_7_4; }
		
		//'(' Expr ')'
		public Group getGroup_8() { return cGroup_8; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_8_0() { return cLeftParenthesisKeyword_8_0; }
		
		//Expr
		public RuleCall getExprParserRuleCall_8_1() { return cExprParserRuleCall_8_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_8_2() { return cRightParenthesisKeyword_8_2; }
	}
	public class OtherDataRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.OtherDataRef");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNamedElementAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cNamedElementNamedElementCrossReference_0_0 = (CrossReference)cNamedElementAssignment_0.eContents().get(0);
		private final RuleCall cNamedElementNamedElementIDTerminalRuleCall_0_0_1 = (RuleCall)cNamedElementNamedElementCrossReference_0_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cPathAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cPathOtherDataRefParserRuleCall_1_1_0 = (RuleCall)cPathAssignment_1_1.eContents().get(0);
		
		//OtherDataRef:
		//    (
		//        (
		//            namedElement=[aadl2::NamedElement|ID]
		////             (arrayRange+=ArrayRange)*
		//        )
		//        ('.' path=OtherDataRef)?
		////     |      'annex' namedElement=[aadl2::NamedElement|ID]
		//    )
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//    (
		//        (
		//            namedElement=[aadl2::NamedElement|ID]
		////             (arrayRange+=ArrayRange)*
		//        )
		//        ('.' path=OtherDataRef)?
		////     |      'annex' namedElement=[aadl2::NamedElement|ID]
		//    )
		public Group getGroup() { return cGroup; }
		
		//        (
		//            namedElement=[aadl2::NamedElement|ID]
		////             (arrayRange+=ArrayRange)*
		//        )
		public Assignment getNamedElementAssignment_0() { return cNamedElementAssignment_0; }
		
		//[aadl2::NamedElement|ID]
		public CrossReference getNamedElementNamedElementCrossReference_0_0() { return cNamedElementNamedElementCrossReference_0_0; }
		
		//ID
		public RuleCall getNamedElementNamedElementIDTerminalRuleCall_0_0_1() { return cNamedElementNamedElementIDTerminalRuleCall_0_0_1; }
		
		//('.' path=OtherDataRef)?
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//path=OtherDataRef
		public Assignment getPathAssignment_1_1() { return cPathAssignment_1_1; }
		
		//OtherDataRef
		public RuleCall getPathOtherDataRefParserRuleCall_1_1_0() { return cPathOtherDataRefParserRuleCall_1_1_0; }
	}
	public class DoubleDotRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.DoubleDotRef");
		private final Assignment cElmAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cElmNamedElementCrossReference_0 = (CrossReference)cElmAssignment.eContents().get(0);
		private final RuleCall cElmNamedElementQCREFParserRuleCall_0_1 = (RuleCall)cElmNamedElementCrossReference_0.eContents().get(1);
		
		//DoubleDotRef:
		//    elm=[aadl2::NamedElement|QCREF]
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//elm=[aadl2::NamedElement|QCREF]
		public Assignment getElmAssignment() { return cElmAssignment; }
		
		//[aadl2::NamedElement|QCREF]
		public CrossReference getElmNamedElementCrossReference_0() { return cElmNamedElementCrossReference_0; }
		
		//QCREF
		public RuleCall getElmNamedElementQCREFParserRuleCall_0_1() { return cElmNamedElementQCREFParserRuleCall_0_1; }
	}
	public class DataElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.DataElement");
		private final Assignment cDataElementAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cDataElementDataSubcomponentTypeCrossReference_0 = (CrossReference)cDataElementAssignment.eContents().get(0);
		private final RuleCall cDataElementDataSubcomponentTypeQCREFParserRuleCall_0_1 = (RuleCall)cDataElementDataSubcomponentTypeCrossReference_0.eContents().get(1);
		
		//DataElement returns DataElement:
		//    dataElement = [aadl2::DataSubcomponentType|QCREF]
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//dataElement = [aadl2::DataSubcomponentType|QCREF]
		public Assignment getDataElementAssignment() { return cDataElementAssignment; }
		
		//[aadl2::DataSubcomponentType|QCREF]
		public CrossReference getDataElementDataSubcomponentTypeCrossReference_0() { return cDataElementDataSubcomponentTypeCrossReference_0; }
		
		//QCREF
		public RuleCall getDataElementDataSubcomponentTypeQCREFParserRuleCall_0_1() { return cDataElementDataSubcomponentTypeQCREFParserRuleCall_0_1; }
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
	public class SlangExprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangExpr");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Assignment cTermsAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final RuleCall cTermsSlangAccessParserRuleCall_0_0_0 = (RuleCall)cTermsAssignment_0_0.eContents().get(0);
		private final Alternatives cAlternatives_0_1 = (Alternatives)cGroup_0.eContents().get(1);
		private final Group cGroup_0_1_0 = (Group)cAlternatives_0_1.eContents().get(0);
		private final RuleCall cOPTerminalRuleCall_0_1_0_0 = (RuleCall)cGroup_0_1_0.eContents().get(0);
		private final Assignment cTermsAssignment_0_1_0_1 = (Assignment)cGroup_0_1_0.eContents().get(1);
		private final RuleCall cTermsSlangAccessParserRuleCall_0_1_0_1_0 = (RuleCall)cTermsAssignment_0_1_0_1.eContents().get(0);
		private final Group cGroup_0_1_1 = (Group)cAlternatives_0_1.eContents().get(1);
		private final Keyword cQuestionMarkKeyword_0_1_1_0 = (Keyword)cGroup_0_1_1.eContents().get(0);
		private final Assignment cThenAssignment_0_1_1_1 = (Assignment)cGroup_0_1_1.eContents().get(1);
		private final RuleCall cThenSlangExprParserRuleCall_0_1_1_1_0 = (RuleCall)cThenAssignment_0_1_1_1.eContents().get(0);
		private final Keyword cColonKeyword_0_1_1_2 = (Keyword)cGroup_0_1_1.eContents().get(2);
		private final Assignment cElsAssignment_0_1_1_3 = (Assignment)cGroup_0_1_1.eContents().get(3);
		private final RuleCall cElsSlangExprParserRuleCall_0_1_1_3_0 = (RuleCall)cElsAssignment_0_1_1_3.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Alternatives cAlternatives_1_0 = (Alternatives)cGroup_1.eContents().get(0);
		private final Keyword cAllKeyword_1_0_0 = (Keyword)cAlternatives_1_0.eContents().get(0);
		private final Keyword cSomeKeyword_1_0_1 = (Keyword)cAlternatives_1_0.eContents().get(1);
		private final Keyword cForAllKeyword_1_0_2 = (Keyword)cAlternatives_1_0.eContents().get(2);
		private final Keyword cThereExistsKeyword_1_0_3 = (Keyword)cAlternatives_1_0.eContents().get(3);
		private final Assignment cVarAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cVarSlangQuantVarParserRuleCall_1_1_0 = (RuleCall)cVarAssignment_1_1.eContents().get(0);
		private final Group cGroup_1_2 = (Group)cGroup_1.eContents().get(2);
		private final Keyword cCommaKeyword_1_2_0 = (Keyword)cGroup_1_2.eContents().get(0);
		private final Assignment cVarAssignment_1_2_1 = (Assignment)cGroup_1_2.eContents().get(1);
		private final RuleCall cVarSlangQuantVarParserRuleCall_1_2_1_0 = (RuleCall)cVarAssignment_1_2_1.eContents().get(0);
		private final Keyword cEqualsSignGreaterThanSignKeyword_1_3 = (Keyword)cGroup_1.eContents().get(3);
		private final Assignment cBodyAssignment_1_4 = (Assignment)cGroup_1.eContents().get(4);
		private final RuleCall cBodySlangExprParserRuleCall_1_4_0 = (RuleCall)cBodyAssignment_1_4.eContents().get(0);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final RuleCall cOPTerminalRuleCall_2_0 = (RuleCall)cGroup_2.eContents().get(0);
		private final RuleCall cSlangAccessParserRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		
		////FeatureElement returns FeatureElement:
		////    feature=[aadl2::NamedElement|ID]
		////;
		//SlangExpr
		//    : terms+=SlangAccess (
		//      ( OP terms+=SlangAccess )*
		//      | '?' then=SlangExpr ':' els=SlangExpr
		//      )
		//    | ( '\\all' | '\\some' | '∀' | '∃' ) var+=SlangQuantVar ( ',' var+=SlangQuantVar )* '=>' body=SlangExpr
		//    | OP SlangAccess
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//terms+=SlangAccess (
		//     ( OP terms+=SlangAccess )*
		//     | '?' then=SlangExpr ':' els=SlangExpr
		//     )
		//   | ( '\\all' | '\\some' | '∀' | '∃' ) var+=SlangQuantVar ( ',' var+=SlangQuantVar )* '=>' body=SlangExpr
		//   | OP SlangAccess
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//terms+=SlangAccess (
		//     ( OP terms+=SlangAccess )*
		//     | '?' then=SlangExpr ':' els=SlangExpr
		//     )
		public Group getGroup_0() { return cGroup_0; }
		
		//terms+=SlangAccess
		public Assignment getTermsAssignment_0_0() { return cTermsAssignment_0_0; }
		
		//SlangAccess
		public RuleCall getTermsSlangAccessParserRuleCall_0_0_0() { return cTermsSlangAccessParserRuleCall_0_0_0; }
		
		//(
		//     ( OP terms+=SlangAccess )*
		//     | '?' then=SlangExpr ':' els=SlangExpr
		//     )
		public Alternatives getAlternatives_0_1() { return cAlternatives_0_1; }
		
		//( OP terms+=SlangAccess )*
		public Group getGroup_0_1_0() { return cGroup_0_1_0; }
		
		//OP
		public RuleCall getOPTerminalRuleCall_0_1_0_0() { return cOPTerminalRuleCall_0_1_0_0; }
		
		//terms+=SlangAccess
		public Assignment getTermsAssignment_0_1_0_1() { return cTermsAssignment_0_1_0_1; }
		
		//SlangAccess
		public RuleCall getTermsSlangAccessParserRuleCall_0_1_0_1_0() { return cTermsSlangAccessParserRuleCall_0_1_0_1_0; }
		
		//'?' then=SlangExpr ':' els=SlangExpr
		public Group getGroup_0_1_1() { return cGroup_0_1_1; }
		
		//'?'
		public Keyword getQuestionMarkKeyword_0_1_1_0() { return cQuestionMarkKeyword_0_1_1_0; }
		
		//then=SlangExpr
		public Assignment getThenAssignment_0_1_1_1() { return cThenAssignment_0_1_1_1; }
		
		//SlangExpr
		public RuleCall getThenSlangExprParserRuleCall_0_1_1_1_0() { return cThenSlangExprParserRuleCall_0_1_1_1_0; }
		
		//':'
		public Keyword getColonKeyword_0_1_1_2() { return cColonKeyword_0_1_1_2; }
		
		//els=SlangExpr
		public Assignment getElsAssignment_0_1_1_3() { return cElsAssignment_0_1_1_3; }
		
		//SlangExpr
		public RuleCall getElsSlangExprParserRuleCall_0_1_1_3_0() { return cElsSlangExprParserRuleCall_0_1_1_3_0; }
		
		//( '\\all' | '\\some' | '∀' | '∃' ) var+=SlangQuantVar ( ',' var+=SlangQuantVar )* '=>' body=SlangExpr
		public Group getGroup_1() { return cGroup_1; }
		
		//( '\\all' | '\\some' | '∀' | '∃' )
		public Alternatives getAlternatives_1_0() { return cAlternatives_1_0; }
		
		//'\\all'
		public Keyword getAllKeyword_1_0_0() { return cAllKeyword_1_0_0; }
		
		//'\\some'
		public Keyword getSomeKeyword_1_0_1() { return cSomeKeyword_1_0_1; }
		
		//'∀'
		public Keyword getForAllKeyword_1_0_2() { return cForAllKeyword_1_0_2; }
		
		//'∃'
		public Keyword getThereExistsKeyword_1_0_3() { return cThereExistsKeyword_1_0_3; }
		
		//var+=SlangQuantVar
		public Assignment getVarAssignment_1_1() { return cVarAssignment_1_1; }
		
		//SlangQuantVar
		public RuleCall getVarSlangQuantVarParserRuleCall_1_1_0() { return cVarSlangQuantVarParserRuleCall_1_1_0; }
		
		//( ',' var+=SlangQuantVar )*
		public Group getGroup_1_2() { return cGroup_1_2; }
		
		//','
		public Keyword getCommaKeyword_1_2_0() { return cCommaKeyword_1_2_0; }
		
		//var+=SlangQuantVar
		public Assignment getVarAssignment_1_2_1() { return cVarAssignment_1_2_1; }
		
		//SlangQuantVar
		public RuleCall getVarSlangQuantVarParserRuleCall_1_2_1_0() { return cVarSlangQuantVarParserRuleCall_1_2_1_0; }
		
		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_1_3() { return cEqualsSignGreaterThanSignKeyword_1_3; }
		
		//body=SlangExpr
		public Assignment getBodyAssignment_1_4() { return cBodyAssignment_1_4; }
		
		//SlangExpr
		public RuleCall getBodySlangExprParserRuleCall_1_4_0() { return cBodySlangExprParserRuleCall_1_4_0; }
		
		//OP SlangAccess
		public Group getGroup_2() { return cGroup_2; }
		
		//OP
		public RuleCall getOPTerminalRuleCall_2_0() { return cOPTerminalRuleCall_2_0; }
		
		//SlangAccess
		public RuleCall getSlangAccessParserRuleCall_2_1() { return cSlangAccessParserRuleCall_2_1; }
	}
	public class SlangQuantVarElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangQuantVar");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValSlangExprParserRuleCall_2_0 = (RuleCall)cValAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Alternatives cAlternatives_3_0 = (Alternatives)cGroup_3.eContents().get(0);
		private final Keyword cFullStopFullStopKeyword_3_0_0 = (Keyword)cAlternatives_3_0.eContents().get(0);
		private final Keyword cFullStopFullStopLessThanSignKeyword_3_0_1 = (Keyword)cAlternatives_3_0.eContents().get(1);
		private final Assignment cUpperBoundAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cUpperBoundSlangExprParserRuleCall_3_1_0 = (RuleCall)cUpperBoundAssignment_3_1.eContents().get(0);
		
		//SlangQuantVar: ID ':' val=SlangExpr ( ( '..' | '..<' ) upperBound=SlangExpr )? ;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ':' val=SlangExpr ( ( '..' | '..<' ) upperBound=SlangExpr )?
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//val=SlangExpr
		public Assignment getValAssignment_2() { return cValAssignment_2; }
		
		//SlangExpr
		public RuleCall getValSlangExprParserRuleCall_2_0() { return cValSlangExprParserRuleCall_2_0; }
		
		//( ( '..' | '..<' ) upperBound=SlangExpr )?
		public Group getGroup_3() { return cGroup_3; }
		
		//( '..' | '..<' )
		public Alternatives getAlternatives_3_0() { return cAlternatives_3_0; }
		
		//'..'
		public Keyword getFullStopFullStopKeyword_3_0_0() { return cFullStopFullStopKeyword_3_0_0; }
		
		//'..<'
		public Keyword getFullStopFullStopLessThanSignKeyword_3_0_1() { return cFullStopFullStopLessThanSignKeyword_3_0_1; }
		
		//upperBound=SlangExpr
		public Assignment getUpperBoundAssignment_3_1() { return cUpperBoundAssignment_3_1; }
		
		//SlangExpr
		public RuleCall getUpperBoundSlangExprParserRuleCall_3_1_0() { return cUpperBoundSlangExprParserRuleCall_3_1_0; }
	}
	public class SlangAccessElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangAccess");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTSlangTermParserRuleCall_0_0 = (RuleCall)cTAssignment_0.eContents().get(0);
		private final Assignment cSufAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSufAccessSuffixParserRuleCall_1_0 = (RuleCall)cSufAssignment_1.eContents().get(0);
		
		//SlangAccess: t=SlangTerm suf=AccessSuffix* ;
		@Override public ParserRule getRule() { return rule; }
		
		//t=SlangTerm suf=AccessSuffix*
		public Group getGroup() { return cGroup; }
		
		//t=SlangTerm
		public Assignment getTAssignment_0() { return cTAssignment_0; }
		
		//SlangTerm
		public RuleCall getTSlangTermParserRuleCall_0_0() { return cTSlangTermParserRuleCall_0_0; }
		
		//suf=AccessSuffix*
		public Assignment getSufAssignment_1() { return cSufAssignment_1; }
		
		//AccessSuffix
		public RuleCall getSufAccessSuffixParserRuleCall_1_0() { return cSufAccessSuffixParserRuleCall_1_0; }
	}
	public class AccessSuffixElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.AccessSuffix");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFullStopKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cCallSuffixParserRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//AccessSuffix: '.' ID CallSuffix? ;
		@Override public ParserRule getRule() { return rule; }
		
		//'.' ID CallSuffix?
		public Group getGroup() { return cGroup; }
		
		//'.'
		public Keyword getFullStopKeyword_0() { return cFullStopKeyword_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
		
		//CallSuffix?
		public RuleCall getCallSuffixParserRuleCall_2() { return cCallSuffixParserRuleCall_2; }
	}
	public class SlangTermElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangTerm");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cTupleAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cTupleSlangExprParserRuleCall_1_1_0 = (RuleCall)cTupleAssignment_1_1.eContents().get(0);
		private final Group cGroup_1_2 = (Group)cGroup_1.eContents().get(2);
		private final Keyword cCommaKeyword_1_2_0 = (Keyword)cGroup_1_2.eContents().get(0);
		private final Assignment cTupleAssignment_1_2_1 = (Assignment)cGroup_1_2.eContents().get(1);
		private final RuleCall cTupleSlangExprParserRuleCall_1_2_1_0 = (RuleCall)cTupleAssignment_1_2_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_1_3 = (Keyword)cGroup_1.eContents().get(3);
		
		//SlangTerm
		//    : ID
		//    | '(' tuple+=SlangExpr ( ',' tuple+=SlangExpr )*  ')'
		////    | 'for' forRange ( ',' forRange )*  'yield' ( SlangBlock |  '(' SlangExpr ')' )
		////    | '{'
		////       ( params '=>' SlangExpr '}'
		////       | stmt* ret? '}'
		////       )
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//ID
		//   | '(' tuple+=SlangExpr ( ',' tuple+=SlangExpr )*  ')'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//'(' tuple+=SlangExpr ( ',' tuple+=SlangExpr )*  ')'
		public Group getGroup_1() { return cGroup_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1_0() { return cLeftParenthesisKeyword_1_0; }
		
		//tuple+=SlangExpr
		public Assignment getTupleAssignment_1_1() { return cTupleAssignment_1_1; }
		
		//SlangExpr
		public RuleCall getTupleSlangExprParserRuleCall_1_1_0() { return cTupleSlangExprParserRuleCall_1_1_0; }
		
		//( ',' tuple+=SlangExpr )*
		public Group getGroup_1_2() { return cGroup_1_2; }
		
		//','
		public Keyword getCommaKeyword_1_2_0() { return cCommaKeyword_1_2_0; }
		
		//tuple+=SlangExpr
		public Assignment getTupleAssignment_1_2_1() { return cTupleAssignment_1_2_1; }
		
		//SlangExpr
		public RuleCall getTupleSlangExprParserRuleCall_1_2_1_0() { return cTupleSlangExprParserRuleCall_1_2_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_1_3() { return cRightParenthesisKeyword_1_3; }
	}
	public class SlangRetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangRet");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cReturnKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cSlangExprParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//SlangRet: 'return' SlangExpr? ;
		@Override public ParserRule getRule() { return rule; }
		
		//'return' SlangExpr?
		public Group getGroup() { return cGroup; }
		
		//'return'
		public Keyword getReturnKeyword_0() { return cReturnKeyword_0; }
		
		//SlangExpr?
		public RuleCall getSlangExprParserRuleCall_1() { return cSlangExprParserRuleCall_1; }
	}
	public class CallSuffixElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.CallSuffix");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final RuleCall cTypeArgsParserRuleCall_0_0 = (RuleCall)cGroup_0.eContents().get(0);
		private final Assignment cArgsAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cArgsCallArgsParserRuleCall_0_1_0 = (RuleCall)cArgsAssignment_0_1.eContents().get(0);
		private final Assignment cArgsAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cArgsCallArgsParserRuleCall_1_0 = (RuleCall)cArgsAssignment_1.eContents().get(0);
		
		//CallSuffix
		//    : TypeArgs args=CallArgs?
		//    | args=CallArgs
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//TypeArgs args=CallArgs?
		//   | args=CallArgs
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//TypeArgs args=CallArgs?
		public Group getGroup_0() { return cGroup_0; }
		
		//TypeArgs
		public RuleCall getTypeArgsParserRuleCall_0_0() { return cTypeArgsParserRuleCall_0_0; }
		
		//args=CallArgs?
		public Assignment getArgsAssignment_0_1() { return cArgsAssignment_0_1; }
		
		//CallArgs
		public RuleCall getArgsCallArgsParserRuleCall_0_1_0() { return cArgsCallArgsParserRuleCall_0_1_0; }
		
		//args=CallArgs
		public Assignment getArgsAssignment_1() { return cArgsAssignment_1; }
		
		//CallArgs
		public RuleCall getArgsCallArgsParserRuleCall_1_0() { return cArgsCallArgsParserRuleCall_1_0; }
	}
	public class CallArgsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.CallArgs");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cFAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cFIdExpParserRuleCall_1_0_0 = (RuleCall)cFAssignment_1_0.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cGroup_1.eContents().get(1);
		private final Keyword cCommaKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cFAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cFIdExpParserRuleCall_1_1_1_0 = (RuleCall)cFAssignment_1_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//CallArgs: '(' ( f+=IdExp ( ',' f+=IdExp )* )? ')' ;
		@Override public ParserRule getRule() { return rule; }
		
		//'(' ( f+=IdExp ( ',' f+=IdExp )* )? ')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//( f+=IdExp ( ',' f+=IdExp )* )?
		public Group getGroup_1() { return cGroup_1; }
		
		//f+=IdExp
		public Assignment getFAssignment_1_0() { return cFAssignment_1_0; }
		
		//IdExp
		public RuleCall getFIdExpParserRuleCall_1_0_0() { return cFIdExpParserRuleCall_1_0_0; }
		
		//( ',' f+=IdExp )*
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//','
		public Keyword getCommaKeyword_1_1_0() { return cCommaKeyword_1_1_0; }
		
		//f+=IdExp
		public Assignment getFAssignment_1_1_1() { return cFAssignment_1_1_1; }
		
		//IdExp
		public RuleCall getFIdExpParserRuleCall_1_1_1_0() { return cFIdExpParserRuleCall_1_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
	}
	public class IdExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.IdExp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cLAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cLExprParserRuleCall_0_0 = (RuleCall)cLAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cColonEqualsSignKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cRAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cRExprParserRuleCall_1_1_0 = (RuleCall)cRAssignment_1_1.eContents().get(0);
		
		//IdExp: l=Expr ( ':=' r=Expr )? ;
		@Override public ParserRule getRule() { return rule; }
		
		//l=Expr ( ':=' r=Expr )?
		public Group getGroup() { return cGroup; }
		
		//l=Expr
		public Assignment getLAssignment_0() { return cLAssignment_0; }
		
		//Expr
		public RuleCall getLExprParserRuleCall_0_0() { return cLExprParserRuleCall_0_0; }
		
		//( ':=' r=Expr )?
		public Group getGroup_1() { return cGroup_1; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_1_0() { return cColonEqualsSignKeyword_1_0; }
		
		//r=Expr
		public Assignment getRAssignment_1_1() { return cRAssignment_1_1; }
		
		//Expr
		public RuleCall getRExprParserRuleCall_1_1_0() { return cRExprParserRuleCall_1_1_0; }
	}
	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.Type");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final RuleCall cBaseTypeParserRuleCall_0_0 = (RuleCall)cGroup_0.eContents().get(0);
		private final Group cGroup_0_1 = (Group)cGroup_0.eContents().get(1);
		private final Keyword cEqualsSignGreaterThanSignKeyword_0_1_0 = (Keyword)cGroup_0_1.eContents().get(0);
		private final RuleCall cBaseTypeParserRuleCall_0_1_1 = (RuleCall)cGroup_0_1.eContents().get(1);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cMutKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cBaseTypeParserRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Group cGroup_1_2 = (Group)cGroup_1.eContents().get(2);
		private final Keyword cEqualsSignGreaterThanSignKeyword_1_2_0 = (Keyword)cGroup_1_2.eContents().get(0);
		private final RuleCall cBaseTypeParserRuleCall_1_2_1 = (RuleCall)cGroup_1_2.eContents().get(1);
		
		//Type
		//    : BaseType ( '=>' BaseType )*
		//    | 'mut' BaseType ( '=>' BaseType )+
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//BaseType ( '=>' BaseType )*
		//   | 'mut' BaseType ( '=>' BaseType )+
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//BaseType ( '=>' BaseType )*
		public Group getGroup_0() { return cGroup_0; }
		
		//BaseType
		public RuleCall getBaseTypeParserRuleCall_0_0() { return cBaseTypeParserRuleCall_0_0; }
		
		//( '=>' BaseType )*
		public Group getGroup_0_1() { return cGroup_0_1; }
		
		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_0_1_0() { return cEqualsSignGreaterThanSignKeyword_0_1_0; }
		
		//BaseType
		public RuleCall getBaseTypeParserRuleCall_0_1_1() { return cBaseTypeParserRuleCall_0_1_1; }
		
		//'mut' BaseType ( '=>' BaseType )+
		public Group getGroup_1() { return cGroup_1; }
		
		//'mut'
		public Keyword getMutKeyword_1_0() { return cMutKeyword_1_0; }
		
		//BaseType
		public RuleCall getBaseTypeParserRuleCall_1_1() { return cBaseTypeParserRuleCall_1_1; }
		
		//( '=>' BaseType )+
		public Group getGroup_1_2() { return cGroup_1_2; }
		
		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_1_2_0() { return cEqualsSignGreaterThanSignKeyword_1_2_0; }
		
		//BaseType
		public RuleCall getBaseTypeParserRuleCall_1_2_1() { return cBaseTypeParserRuleCall_1_2_1; }
	}
	public class BaseTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.BaseType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final RuleCall cQCREFParserRuleCall_0_0 = (RuleCall)cGroup_0.eContents().get(0);
		private final RuleCall cTypeArgsParserRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cGroup_1.eContents().get(1);
		private final RuleCall cTypeParserRuleCall_1_1_0 = (RuleCall)cGroup_1_1.eContents().get(0);
		private final Group cGroup_1_1_1 = (Group)cGroup_1_1.eContents().get(1);
		private final Keyword cCommaKeyword_1_1_1_0 = (Keyword)cGroup_1_1_1.eContents().get(0);
		private final RuleCall cTypeParserRuleCall_1_1_1_1 = (RuleCall)cGroup_1_1_1.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		
		//BaseType
		//    : QCREF TypeArgs?
		//    | '(' ( Type ( ',' Type )* )? ')'
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//QCREF TypeArgs?
		//   | '(' ( Type ( ',' Type )* )? ')'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//QCREF TypeArgs?
		public Group getGroup_0() { return cGroup_0; }
		
		//QCREF
		public RuleCall getQCREFParserRuleCall_0_0() { return cQCREFParserRuleCall_0_0; }
		
		//TypeArgs?
		public RuleCall getTypeArgsParserRuleCall_0_1() { return cTypeArgsParserRuleCall_0_1; }
		
		//'(' ( Type ( ',' Type )* )? ')'
		public Group getGroup_1() { return cGroup_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1_0() { return cLeftParenthesisKeyword_1_0; }
		
		//( Type ( ',' Type )* )?
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//Type
		public RuleCall getTypeParserRuleCall_1_1_0() { return cTypeParserRuleCall_1_1_0; }
		
		//( ',' Type )*
		public Group getGroup_1_1_1() { return cGroup_1_1_1; }
		
		//','
		public Keyword getCommaKeyword_1_1_1_0() { return cCommaKeyword_1_1_1_0; }
		
		//Type
		public RuleCall getTypeParserRuleCall_1_1_1_1() { return cTypeParserRuleCall_1_1_1_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_1_2() { return cRightParenthesisKeyword_1_2; }
	}
	public class TypeArgsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.TypeArgs");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cTypeParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final RuleCall cTypeParserRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		private final Keyword cRightSquareBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//TypeArgs: '[' Type ( ',' Type )* ']' ;
		@Override public ParserRule getRule() { return rule; }
		
		//'[' Type ( ',' Type )* ']'
		public Group getGroup() { return cGroup; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_0() { return cLeftSquareBracketKeyword_0; }
		
		//Type
		public RuleCall getTypeParserRuleCall_1() { return cTypeParserRuleCall_1; }
		
		//( ',' Type )*
		public Group getGroup_2() { return cGroup_2; }
		
		//','
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//Type
		public RuleCall getTypeParserRuleCall_2_1() { return cTypeParserRuleCall_2_1; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_3() { return cRightSquareBracketKeyword_3; }
	}
	public class FunctionsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.Functions");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFunctionsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSpecsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSpecsFuncSpecParserRuleCall_1_0 = (RuleCall)cSpecsAssignment_1.eContents().get(0);
		
		//Functions:
		//    'functions' (specs+=FuncSpec)+
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'functions' (specs+=FuncSpec)+
		public Group getGroup() { return cGroup; }
		
		//'functions'
		public Keyword getFunctionsKeyword_0() { return cFunctionsKeyword_0; }
		
		//(specs+=FuncSpec)+
		public Assignment getSpecsAssignment_1() { return cSpecsAssignment_1; }
		
		//FuncSpec
		public RuleCall getSpecsFuncSpecParserRuleCall_1_0() { return cSpecsFuncSpecParserRuleCall_1_0; }
	}
	public class FuncSpecElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.FuncSpec");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cDefDefParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cSemicolonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//FuncSpec: DefDef ';';
		@Override public ParserRule getRule() { return rule; }
		
		//DefDef ';'
		public Group getGroup() { return cGroup; }
		
		//DefDef
		public RuleCall getDefDefParserRuleCall_0() { return cDefDefParserRuleCall_0; }
		
		//';'
		public Keyword getSemicolonKeyword_1() { return cSemicolonKeyword_1; }
	}
	public class ParamsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.Params");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cParamParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final RuleCall cParamParserRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Params: '(' Param ( ',' Param )? ')' ;
		@Override public ParserRule getRule() { return rule; }
		
		//'(' Param ( ',' Param )? ')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//Param
		public RuleCall getParamParserRuleCall_1() { return cParamParserRuleCall_1; }
		
		//( ',' Param )?
		public Group getGroup_2() { return cGroup_2; }
		
		//','
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//Param
		public RuleCall getParamParserRuleCall_2_1() { return cParamParserRuleCall_2_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class ParamElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.Param");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVarKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cEqualsSignGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final RuleCall cTypeParserRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		private final Keyword cAsteriskKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Param: 'var'? ID ':' ( '=>' )? Type '*'? ;
		@Override public ParserRule getRule() { return rule; }
		
		//'var'? ID ':' ( '=>' )? Type '*'?
		public Group getGroup() { return cGroup; }
		
		//'var'?
		public Keyword getVarKeyword_0() { return cVarKeyword_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//( '=>' )?
		public Keyword getEqualsSignGreaterThanSignKeyword_3() { return cEqualsSignGreaterThanSignKeyword_3; }
		
		//Type
		public RuleCall getTypeParserRuleCall_4() { return cTypeParserRuleCall_4; }
		
		//'*'?
		public Keyword getAsteriskKeyword_5() { return cAsteriskKeyword_5; }
	}
	public class DefDefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.DefDef");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cDefModsParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cDefExtParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameDefIDParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final RuleCall cTypeParamsParserRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Assignment cArgsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cArgsDefParamsParserRuleCall_4_0 = (RuleCall)cArgsAssignment_4.eContents().get(0);
		private final Keyword cColonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final RuleCall cTypeParserRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		private final Assignment cContractAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cContractDefContractParserRuleCall_7_0 = (RuleCall)cContractAssignment_7.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Assignment cBodyAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cBodyExprParserRuleCall_9_0 = (RuleCall)cBodyAssignment_9.eContents().get(0);
		
		//DefDef: DefMods? DefExt? name=DefID TypeParams? args=DefParams? ':' Type contract=DefContract? ':=' body=Expr ;
		@Override public ParserRule getRule() { return rule; }
		
		//DefMods? DefExt? name=DefID TypeParams? args=DefParams? ':' Type contract=DefContract? ':=' body=Expr
		public Group getGroup() { return cGroup; }
		
		//DefMods?
		public RuleCall getDefModsParserRuleCall_0() { return cDefModsParserRuleCall_0; }
		
		//DefExt?
		public RuleCall getDefExtParserRuleCall_1() { return cDefExtParserRuleCall_1; }
		
		//name=DefID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//DefID
		public RuleCall getNameDefIDParserRuleCall_2_0() { return cNameDefIDParserRuleCall_2_0; }
		
		//TypeParams?
		public RuleCall getTypeParamsParserRuleCall_3() { return cTypeParamsParserRuleCall_3; }
		
		//args=DefParams?
		public Assignment getArgsAssignment_4() { return cArgsAssignment_4; }
		
		//DefParams
		public RuleCall getArgsDefParamsParserRuleCall_4_0() { return cArgsDefParamsParserRuleCall_4_0; }
		
		//':'
		public Keyword getColonKeyword_5() { return cColonKeyword_5; }
		
		//Type
		public RuleCall getTypeParserRuleCall_6() { return cTypeParserRuleCall_6; }
		
		//contract=DefContract?
		public Assignment getContractAssignment_7() { return cContractAssignment_7; }
		
		//DefContract
		public RuleCall getContractDefContractParserRuleCall_7_0() { return cContractDefContractParserRuleCall_7_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_8() { return cColonEqualsSignKeyword_8; }
		
		//body=Expr
		public Assignment getBodyAssignment_9() { return cBodyAssignment_9; }
		
		//Expr
		public RuleCall getBodyExprParserRuleCall_9_0() { return cBodyExprParserRuleCall_9_0; }
	}
	public class DefModsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.DefMods");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cStrictKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cMemoizeKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cMutKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cSpecKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		
		//DefMods: 'strict' | 'memoize' | 'mut' | 'spec' ;
		@Override public ParserRule getRule() { return rule; }
		
		//'strict' | 'memoize' | 'mut' | 'spec'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'strict'
		public Keyword getStrictKeyword_0() { return cStrictKeyword_0; }
		
		//'memoize'
		public Keyword getMemoizeKeyword_1() { return cMemoizeKeyword_1; }
		
		//'mut'
		public Keyword getMutKeyword_2() { return cMutKeyword_2; }
		
		//'spec'
		public Keyword getSpecKeyword_3() { return cSpecKeyword_3; }
	}
	public class DefExtElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.DefExt");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final RuleCall cTypeParserRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//DefExt: '(' ID ':' Type ')' ;
		@Override public ParserRule getRule() { return rule; }
		
		//'(' ID ':' Type ')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//Type
		public RuleCall getTypeParserRuleCall_3() { return cTypeParserRuleCall_3; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}
	public class DefIDElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.DefID");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cOPTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//DefID: ID | OP ;
		@Override public ParserRule getRule() { return rule; }
		
		//ID | OP
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//OP
		public RuleCall getOPTerminalRuleCall_1() { return cOPTerminalRuleCall_1; }
	}
	public class DefParamsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.DefParams");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cParamsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cParamsDefParamParserRuleCall_1_0 = (RuleCall)cParamsAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cParamsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cParamsDefParamParserRuleCall_2_1_0 = (RuleCall)cParamsAssignment_2_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//DefParams: '(' params+=DefParam ( ',' params+=DefParam )? ')' ;
		@Override public ParserRule getRule() { return rule; }
		
		//'(' params+=DefParam ( ',' params+=DefParam )? ')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//params+=DefParam
		public Assignment getParamsAssignment_1() { return cParamsAssignment_1; }
		
		//DefParam
		public RuleCall getParamsDefParamParserRuleCall_1_0() { return cParamsDefParamParserRuleCall_1_0; }
		
		//( ',' params+=DefParam )?
		public Group getGroup_2() { return cGroup_2; }
		
		//','
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//params+=DefParam
		public Assignment getParamsAssignment_2_1() { return cParamsAssignment_2_1; }
		
		//DefParam
		public RuleCall getParamsDefParamParserRuleCall_2_1_0() { return cParamsDefParamParserRuleCall_2_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class DefParamElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.DefParam");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cEqualsSignGreaterThanSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTypeNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cTypeNameDataSubcomponentTypeCrossReference_3_0 = (CrossReference)cTypeNameAssignment_3.eContents().get(0);
		private final RuleCall cTypeNameDataSubcomponentTypeQCREFParserRuleCall_3_0_1 = (RuleCall)cTypeNameDataSubcomponentTypeCrossReference_3_0.eContents().get(1);
		private final Keyword cAsteriskKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//DefParam: name=ID ':' ( '=>' )? typeName=[aadl2::DataSubcomponentType|QCREF] '*'? ;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ':' ( '=>' )? typeName=[aadl2::DataSubcomponentType|QCREF] '*'?
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//( '=>' )?
		public Keyword getEqualsSignGreaterThanSignKeyword_2() { return cEqualsSignGreaterThanSignKeyword_2; }
		
		//typeName=[aadl2::DataSubcomponentType|QCREF]
		public Assignment getTypeNameAssignment_3() { return cTypeNameAssignment_3; }
		
		//[aadl2::DataSubcomponentType|QCREF]
		public CrossReference getTypeNameDataSubcomponentTypeCrossReference_3_0() { return cTypeNameDataSubcomponentTypeCrossReference_3_0; }
		
		//QCREF
		public RuleCall getTypeNameDataSubcomponentTypeQCREFParserRuleCall_3_0_1() { return cTypeNameDataSubcomponentTypeQCREFParserRuleCall_3_0_1; }
		
		//'*'?
		public Keyword getAsteriskKeyword_4() { return cAsteriskKeyword_4; }
	}
	public class DefContractElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.DefContract");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cDefContractAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSpecKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Group cGroup_2_0 = (Group)cAlternatives_2.eContents().get(0);
		private final Assignment cReaAssignment_2_0_0 = (Assignment)cGroup_2_0.eContents().get(0);
		private final RuleCall cReaReadsParserRuleCall_2_0_0_0 = (RuleCall)cReaAssignment_2_0_0.eContents().get(0);
		private final Assignment cReqAssignment_2_0_1 = (Assignment)cGroup_2_0.eContents().get(1);
		private final RuleCall cReqRequiresParserRuleCall_2_0_1_0 = (RuleCall)cReqAssignment_2_0_1.eContents().get(0);
		private final Assignment cModAssignment_2_0_2 = (Assignment)cGroup_2_0.eContents().get(2);
		private final RuleCall cModModifiesParserRuleCall_2_0_2_0 = (RuleCall)cModAssignment_2_0_2.eContents().get(0);
		private final Assignment cEnsAssignment_2_0_3 = (Assignment)cGroup_2_0.eContents().get(3);
		private final RuleCall cEnsEnsuresParserRuleCall_2_0_3_0 = (RuleCall)cEnsAssignment_2_0_3.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cAlternatives_2.eContents().get(1);
		private final Assignment cDccAssignment_2_1_0 = (Assignment)cGroup_2_1.eContents().get(0);
		private final RuleCall cDccDefContractCaseParserRuleCall_2_1_0_0 = (RuleCall)cDccAssignment_2_1_0.eContents().get(0);
		private final Assignment cReaAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cReaReadsParserRuleCall_2_1_1_0 = (RuleCall)cReaAssignment_2_1_1.eContents().get(0);
		private final Assignment cModAssignment_2_1_2 = (Assignment)cGroup_2_1.eContents().get(2);
		private final RuleCall cModModifiesParserRuleCall_2_1_2_0 = (RuleCall)cModAssignment_2_1_2.eContents().get(0);
		
		//DefContract
		//    : {DefContract} 'spec'
		//      ( rea=Reads? req=Requires? mod=Modifies? ens=Ensures?
		//      | dcc+=DefContractCase+ rea=Reads? mod=Modifies?
		//      )
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//{DefContract} 'spec'
		//     ( rea=Reads? req=Requires? mod=Modifies? ens=Ensures?
		//     | dcc+=DefContractCase+ rea=Reads? mod=Modifies?
		//     )
		public Group getGroup() { return cGroup; }
		
		//{DefContract}
		public Action getDefContractAction_0() { return cDefContractAction_0; }
		
		//'spec'
		public Keyword getSpecKeyword_1() { return cSpecKeyword_1; }
		
		//( rea=Reads? req=Requires? mod=Modifies? ens=Ensures?
		//| dcc+=DefContractCase+ rea=Reads? mod=Modifies?
		//)
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//rea=Reads? req=Requires? mod=Modifies? ens=Ensures?
		public Group getGroup_2_0() { return cGroup_2_0; }
		
		//rea=Reads?
		public Assignment getReaAssignment_2_0_0() { return cReaAssignment_2_0_0; }
		
		//Reads
		public RuleCall getReaReadsParserRuleCall_2_0_0_0() { return cReaReadsParserRuleCall_2_0_0_0; }
		
		//req=Requires?
		public Assignment getReqAssignment_2_0_1() { return cReqAssignment_2_0_1; }
		
		//Requires
		public RuleCall getReqRequiresParserRuleCall_2_0_1_0() { return cReqRequiresParserRuleCall_2_0_1_0; }
		
		//mod=Modifies?
		public Assignment getModAssignment_2_0_2() { return cModAssignment_2_0_2; }
		
		//Modifies
		public RuleCall getModModifiesParserRuleCall_2_0_2_0() { return cModModifiesParserRuleCall_2_0_2_0; }
		
		//ens=Ensures?
		public Assignment getEnsAssignment_2_0_3() { return cEnsAssignment_2_0_3; }
		
		//Ensures
		public RuleCall getEnsEnsuresParserRuleCall_2_0_3_0() { return cEnsEnsuresParserRuleCall_2_0_3_0; }
		
		//dcc+=DefContractCase+ rea=Reads? mod=Modifies?
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//dcc+=DefContractCase+
		public Assignment getDccAssignment_2_1_0() { return cDccAssignment_2_1_0; }
		
		//DefContractCase
		public RuleCall getDccDefContractCaseParserRuleCall_2_1_0_0() { return cDccDefContractCaseParserRuleCall_2_1_0_0; }
		
		//rea=Reads?
		public Assignment getReaAssignment_2_1_1() { return cReaAssignment_2_1_1; }
		
		//Reads
		public RuleCall getReaReadsParserRuleCall_2_1_1_0() { return cReaReadsParserRuleCall_2_1_1_0; }
		
		//mod=Modifies?
		public Assignment getModAssignment_2_1_2() { return cModAssignment_2_1_2; }
		
		//Modifies
		public RuleCall getModModifiesParserRuleCall_2_1_2_0() { return cModModifiesParserRuleCall_2_1_2_0; }
	}
	public class DefContractCaseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.DefContractCase");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cDefContractCaseAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cCaseKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Assignment cRAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cRRequiresParserRuleCall_3_0 = (RuleCall)cRAssignment_3.eContents().get(0);
		private final Assignment cEAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cEEnsuresParserRuleCall_4_0 = (RuleCall)cEAssignment_4.eContents().get(0);
		
		//DefContractCase: {DefContractCase} 'case' STRING r=Requires? e=Ensures? ;
		@Override public ParserRule getRule() { return rule; }
		
		//{DefContractCase} 'case' STRING r=Requires? e=Ensures?
		public Group getGroup() { return cGroup; }
		
		//{DefContractCase}
		public Action getDefContractCaseAction_0() { return cDefContractCaseAction_0; }
		
		//'case'
		public Keyword getCaseKeyword_1() { return cCaseKeyword_1; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_2() { return cSTRINGTerminalRuleCall_2; }
		
		//r=Requires?
		public Assignment getRAssignment_3() { return cRAssignment_3; }
		
		//Requires
		public RuleCall getRRequiresParserRuleCall_3_0() { return cRRequiresParserRuleCall_3_0; }
		
		//e=Ensures?
		public Assignment getEAssignment_4() { return cEAssignment_4; }
		
		//Ensures
		public RuleCall getEEnsuresParserRuleCall_4_0() { return cEEnsuresParserRuleCall_4_0; }
	}
	public class TypeParamsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.TypeParams");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cTypeParamParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final RuleCall cTypeParamParserRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		private final Keyword cRightSquareBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//TypeParams: '[' TypeParam (  ',' TypeParam )* ']' ;
		@Override public ParserRule getRule() { return rule; }
		
		//'[' TypeParam (  ',' TypeParam )* ']'
		public Group getGroup() { return cGroup; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_0() { return cLeftSquareBracketKeyword_0; }
		
		//TypeParam
		public RuleCall getTypeParamParserRuleCall_1() { return cTypeParamParserRuleCall_1; }
		
		//(  ',' TypeParam )*
		public Group getGroup_2() { return cGroup_2; }
		
		//','
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//TypeParam
		public RuleCall getTypeParamParserRuleCall_2_1() { return cTypeParamParserRuleCall_2_1; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_3() { return cRightSquareBracketKeyword_3; }
	}
	public class TypeParamElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.TypeParam");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMutKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//TypeParam: 'mut'? ID ;
		@Override public ParserRule getRule() { return rule; }
		
		//'mut'? ID
		public Group getGroup() { return cGroup; }
		
		//'mut'?
		public Keyword getMutKeyword_0() { return cMutKeyword_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class ReadsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.Reads");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cReadsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cEAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cEExprParserRuleCall_1_0 = (RuleCall)cEAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cEAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cEExprParserRuleCall_2_1_0 = (RuleCall)cEAssignment_2_1.eContents().get(0);
		
		//Reads: 'reads' e+=Expr ( ',' e+=Expr )* ;
		@Override public ParserRule getRule() { return rule; }
		
		//'reads' e+=Expr ( ',' e+=Expr )*
		public Group getGroup() { return cGroup; }
		
		//'reads'
		public Keyword getReadsKeyword_0() { return cReadsKeyword_0; }
		
		//e+=Expr
		public Assignment getEAssignment_1() { return cEAssignment_1; }
		
		//Expr
		public RuleCall getEExprParserRuleCall_1_0() { return cEExprParserRuleCall_1_0; }
		
		//( ',' e+=Expr )*
		public Group getGroup_2() { return cGroup_2; }
		
		//','
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//e+=Expr
		public Assignment getEAssignment_2_1() { return cEAssignment_2_1; }
		
		//Expr
		public RuleCall getEExprParserRuleCall_2_1_0() { return cEExprParserRuleCall_2_1_0; }
	}
	public class RequiresElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.Requires");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRequiresKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cEAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cEExprParserRuleCall_1_0 = (RuleCall)cEAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cEAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cEExprParserRuleCall_2_1_0 = (RuleCall)cEAssignment_2_1.eContents().get(0);
		
		//Requires: 'requires' e+=Expr ( ',' e+=Expr )* ;
		@Override public ParserRule getRule() { return rule; }
		
		//'requires' e+=Expr ( ',' e+=Expr )*
		public Group getGroup() { return cGroup; }
		
		//'requires'
		public Keyword getRequiresKeyword_0() { return cRequiresKeyword_0; }
		
		//e+=Expr
		public Assignment getEAssignment_1() { return cEAssignment_1; }
		
		//Expr
		public RuleCall getEExprParserRuleCall_1_0() { return cEExprParserRuleCall_1_0; }
		
		//( ',' e+=Expr )*
		public Group getGroup_2() { return cGroup_2; }
		
		//','
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//e+=Expr
		public Assignment getEAssignment_2_1() { return cEAssignment_2_1; }
		
		//Expr
		public RuleCall getEExprParserRuleCall_2_1_0() { return cEExprParserRuleCall_2_1_0; }
	}
	public class ModifiesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.Modifies");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cModifiesKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cEAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cEExprParserRuleCall_1_0 = (RuleCall)cEAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cEAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cEExprParserRuleCall_2_1_0 = (RuleCall)cEAssignment_2_1.eContents().get(0);
		
		//Modifies: 'modifies' e+=Expr ( ',' e+=Expr )* ;
		@Override public ParserRule getRule() { return rule; }
		
		//'modifies' e+=Expr ( ',' e+=Expr )*
		public Group getGroup() { return cGroup; }
		
		//'modifies'
		public Keyword getModifiesKeyword_0() { return cModifiesKeyword_0; }
		
		//e+=Expr
		public Assignment getEAssignment_1() { return cEAssignment_1; }
		
		//Expr
		public RuleCall getEExprParserRuleCall_1_0() { return cEExprParserRuleCall_1_0; }
		
		//( ',' e+=Expr )*
		public Group getGroup_2() { return cGroup_2; }
		
		//','
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//e+=Expr
		public Assignment getEAssignment_2_1() { return cEAssignment_2_1; }
		
		//Expr
		public RuleCall getEExprParserRuleCall_2_1_0() { return cEExprParserRuleCall_2_1_0; }
	}
	public class EnsuresElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.Ensures");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEnsuresKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cEAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cEExprParserRuleCall_1_0 = (RuleCall)cEAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cEAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cEExprParserRuleCall_2_1_0 = (RuleCall)cEAssignment_2_1.eContents().get(0);
		
		//Ensures: 'ensures' e+=Expr ( ',' e+=Expr )* ;
		@Override public ParserRule getRule() { return rule; }
		
		//'ensures' e+=Expr ( ',' e+=Expr )*
		public Group getGroup() { return cGroup; }
		
		//'ensures'
		public Keyword getEnsuresKeyword_0() { return cEnsuresKeyword_0; }
		
		//e+=Expr
		public Assignment getEAssignment_1() { return cEAssignment_1; }
		
		//Expr
		public RuleCall getEExprParserRuleCall_1_0() { return cEExprParserRuleCall_1_0; }
		
		//( ',' e+=Expr )*
		public Group getGroup_2() { return cGroup_2; }
		
		//','
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//e+=Expr
		public Assignment getEAssignment_2_1() { return cEAssignment_2_1; }
		
		//Expr
		public RuleCall getEExprParserRuleCall_2_1_0() { return cEExprParserRuleCall_2_1_0; }
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
	private final EquivExprElements pEquivExpr;
	private final OrExprElements pOrExpr;
	private final AndExprElements pAndExpr;
	private final RelationalOpElements pRelationalOp;
	private final RelationalExprElements pRelationalExpr;
	private final AddSubExprElements pAddSubExpr;
	private final MultDivModExprElements pMultDivModExpr;
	private final ExpExprElements pExpExpr;
	private final PrefixExprElements pPrefixExpr;
	private final AtomicExprElements pAtomicExpr;
	private final OtherDataRefElements pOtherDataRef;
	private final DoubleDotRefElements pDoubleDotRef;
	private final DataElementElements pDataElement;
	private final SubcomponentElementElements pSubcomponentElement;
	private final SlangExprElements pSlangExpr;
	private final SlangQuantVarElements pSlangQuantVar;
	private final SlangAccessElements pSlangAccess;
	private final AccessSuffixElements pAccessSuffix;
	private final SlangTermElements pSlangTerm;
	private final SlangRetElements pSlangRet;
	private final CallSuffixElements pCallSuffix;
	private final CallArgsElements pCallArgs;
	private final IdExpElements pIdExp;
	private final TypeElements pType;
	private final BaseTypeElements pBaseType;
	private final TypeArgsElements pTypeArgs;
	private final FunctionsElements pFunctions;
	private final FuncSpecElements pFuncSpec;
	private final ParamsElements pParams;
	private final ParamElements pParam;
	private final DefDefElements pDefDef;
	private final DefModsElements pDefMods;
	private final DefExtElements pDefExt;
	private final DefIDElements pDefID;
	private final DefParamsElements pDefParams;
	private final DefParamElements pDefParam;
	private final DefContractElements pDefContract;
	private final DefContractCaseElements pDefContractCase;
	private final TypeParamsElements pTypeParams;
	private final TypeParamElements pTypeParam;
	private final ReadsElements pReads;
	private final RequiresElements pRequires;
	private final ModifiesElements pModifies;
	private final EnsuresElements pEnsures;
	private final TerminalRule tOP;
	private final TerminalRule tIDF;
	private final TerminalRule tLETTER;
	private final TerminalRule tOPSYM;
	
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
		this.pEquivExpr = new EquivExprElements();
		this.pOrExpr = new OrExprElements();
		this.pAndExpr = new AndExprElements();
		this.pRelationalOp = new RelationalOpElements();
		this.pRelationalExpr = new RelationalExprElements();
		this.pAddSubExpr = new AddSubExprElements();
		this.pMultDivModExpr = new MultDivModExprElements();
		this.pExpExpr = new ExpExprElements();
		this.pPrefixExpr = new PrefixExprElements();
		this.pAtomicExpr = new AtomicExprElements();
		this.pOtherDataRef = new OtherDataRefElements();
		this.pDoubleDotRef = new DoubleDotRefElements();
		this.pDataElement = new DataElementElements();
		this.pSubcomponentElement = new SubcomponentElementElements();
		this.pSlangExpr = new SlangExprElements();
		this.pSlangQuantVar = new SlangQuantVarElements();
		this.pSlangAccess = new SlangAccessElements();
		this.pAccessSuffix = new AccessSuffixElements();
		this.pSlangTerm = new SlangTermElements();
		this.pSlangRet = new SlangRetElements();
		this.pCallSuffix = new CallSuffixElements();
		this.pCallArgs = new CallArgsElements();
		this.pIdExp = new IdExpElements();
		this.pType = new TypeElements();
		this.pBaseType = new BaseTypeElements();
		this.pTypeArgs = new TypeArgsElements();
		this.pFunctions = new FunctionsElements();
		this.pFuncSpec = new FuncSpecElements();
		this.pParams = new ParamsElements();
		this.pParam = new ParamElements();
		this.pDefDef = new DefDefElements();
		this.pDefMods = new DefModsElements();
		this.pDefExt = new DefExtElements();
		this.pDefID = new DefIDElements();
		this.pDefParams = new DefParamsElements();
		this.pDefParam = new DefParamElements();
		this.pDefContract = new DefContractElements();
		this.pDefContractCase = new DefContractCaseElements();
		this.pTypeParams = new TypeParamsElements();
		this.pTypeParam = new TypeParamElements();
		this.pReads = new ReadsElements();
		this.pRequires = new RequiresElements();
		this.pModifies = new ModifiesElements();
		this.pEnsures = new EnsuresElements();
		this.tOP = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.OP");
		this.tIDF = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.IDF");
		this.tLETTER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.LETTER");
		this.tOPSYM = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.OPSYM");
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
	//    (functions = Functions)?
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
	//    EquivExpr (=>({BinaryExpr.left=current} ('=>'|'implies')) right=ImpliesExpr)?
	//;
	public ImpliesExprElements getImpliesExprAccess() {
		return pImpliesExpr;
	}
	
	public ParserRule getImpliesExprRule() {
		return getImpliesExprAccess().getRule();
	}
	
	//EquivExpr returns Expr:
	//    OrExpr (=> ({BinaryExpr.left=current} op='<=>') right=OrExpr)?;
	public EquivExprElements getEquivExprAccess() {
		return pEquivExpr;
	}
	
	public ParserRule getEquivExprRule() {
		return getEquivExprAccess().getRule();
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
	//    AddSubExpr (=>({BinaryExpr.left=current} op=RelationalOp) right=AddSubExpr)?
	//;
	public RelationalExprElements getRelationalExprAccess() {
		return pRelationalExpr;
	}
	
	public ParserRule getRelationalExprRule() {
		return getRelationalExprAccess().getRule();
	}
	
	//AddSubExpr returns Expr:
	//    MultDivModExpr (=>({BinaryExpr.left=current} op=('+' | '-')) right=MultDivModExpr)*
	//;
	public AddSubExprElements getAddSubExprAccess() {
		return pAddSubExpr;
	}
	
	public ParserRule getAddSubExprRule() {
		return getAddSubExprAccess().getRule();
	}
	
	//MultDivModExpr returns Expr:
	//    ExpExpr (=>({BinaryExpr.left=current} op=('*' | '/' | '%')) right=ExpExpr)*
	//;
	public MultDivModExprElements getMultDivModExprAccess() {
		return pMultDivModExpr;
	}
	
	public ParserRule getMultDivModExprRule() {
		return getMultDivModExprAccess().getRule();
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
	////    {StateVarRef} 'var' stateVar=[StateVarDecl|ID] ('.' ref=OtherDataRef)?
	////|   {PortRef} 'port' port=ContainmentPathElement
	//   {DataRefExpr} portOrSubcomponentOrStateVar=[ecore::EObject|ID] ('.' ref=OtherDataRef)? cs=CallSuffix?
	//| => ({EnumLitExpr} 'enum' '(') enumType=DataElement ',' value=[aadl2::StringLiteral|ID] ')'
	//| => ({RecordLitExpr} recordType=DataElement '{' args+=[aadl2::NamedElement|ID] '=') argExpr+=Expr (';' args+=[aadl2::NamedElement|ID] '=' argExpr+=Expr)* '}'
	//|    {IntLit} value=INTEGER_LIT  // use int lit syntax from AADL properties file
	//|   {RealLitExpr} val=REAL_LIT
	//|   {BoolLitExpr} val=BooleanLiteral
	//|   {FloorCast} 'floor' '(' expr=Expr ')'
	//|   {RealCast}  'real' '(' expr=Expr ')'
	////|   ID CallSuffix
	//|   '(' Expr ')'
	//;
	public AtomicExprElements getAtomicExprAccess() {
		return pAtomicExpr;
	}
	
	public ParserRule getAtomicExprRule() {
		return getAtomicExprAccess().getRule();
	}
	
	//OtherDataRef:
	//    (
	//        (
	//            namedElement=[aadl2::NamedElement|ID]
	////             (arrayRange+=ArrayRange)*
	//        )
	//        ('.' path=OtherDataRef)?
	////     |      'annex' namedElement=[aadl2::NamedElement|ID]
	//    )
	//;
	public OtherDataRefElements getOtherDataRefAccess() {
		return pOtherDataRef;
	}
	
	public ParserRule getOtherDataRefRule() {
		return getOtherDataRefAccess().getRule();
	}
	
	//DoubleDotRef:
	//    elm=[aadl2::NamedElement|QCREF]
	//;
	public DoubleDotRefElements getDoubleDotRefAccess() {
		return pDoubleDotRef;
	}
	
	public ParserRule getDoubleDotRefRule() {
		return getDoubleDotRefAccess().getRule();
	}
	
	//DataElement returns DataElement:
	//    dataElement = [aadl2::DataSubcomponentType|QCREF]
	//;
	public DataElementElements getDataElementAccess() {
		return pDataElement;
	}
	
	public ParserRule getDataElementRule() {
		return getDataElementAccess().getRule();
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
	
	////FeatureElement returns FeatureElement:
	////    feature=[aadl2::NamedElement|ID]
	////;
	//SlangExpr
	//    : terms+=SlangAccess (
	//      ( OP terms+=SlangAccess )*
	//      | '?' then=SlangExpr ':' els=SlangExpr
	//      )
	//    | ( '\\all' | '\\some' | '∀' | '∃' ) var+=SlangQuantVar ( ',' var+=SlangQuantVar )* '=>' body=SlangExpr
	//    | OP SlangAccess
	//    ;
	public SlangExprElements getSlangExprAccess() {
		return pSlangExpr;
	}
	
	public ParserRule getSlangExprRule() {
		return getSlangExprAccess().getRule();
	}
	
	//SlangQuantVar: ID ':' val=SlangExpr ( ( '..' | '..<' ) upperBound=SlangExpr )? ;
	public SlangQuantVarElements getSlangQuantVarAccess() {
		return pSlangQuantVar;
	}
	
	public ParserRule getSlangQuantVarRule() {
		return getSlangQuantVarAccess().getRule();
	}
	
	//SlangAccess: t=SlangTerm suf=AccessSuffix* ;
	public SlangAccessElements getSlangAccessAccess() {
		return pSlangAccess;
	}
	
	public ParserRule getSlangAccessRule() {
		return getSlangAccessAccess().getRule();
	}
	
	//AccessSuffix: '.' ID CallSuffix? ;
	public AccessSuffixElements getAccessSuffixAccess() {
		return pAccessSuffix;
	}
	
	public ParserRule getAccessSuffixRule() {
		return getAccessSuffixAccess().getRule();
	}
	
	//SlangTerm
	//    : ID
	//    | '(' tuple+=SlangExpr ( ',' tuple+=SlangExpr )*  ')'
	////    | 'for' forRange ( ',' forRange )*  'yield' ( SlangBlock |  '(' SlangExpr ')' )
	////    | '{'
	////       ( params '=>' SlangExpr '}'
	////       | stmt* ret? '}'
	////       )
	//    ;
	public SlangTermElements getSlangTermAccess() {
		return pSlangTerm;
	}
	
	public ParserRule getSlangTermRule() {
		return getSlangTermAccess().getRule();
	}
	
	//SlangRet: 'return' SlangExpr? ;
	public SlangRetElements getSlangRetAccess() {
		return pSlangRet;
	}
	
	public ParserRule getSlangRetRule() {
		return getSlangRetAccess().getRule();
	}
	
	//CallSuffix
	//    : TypeArgs args=CallArgs?
	//    | args=CallArgs
	//    ;
	public CallSuffixElements getCallSuffixAccess() {
		return pCallSuffix;
	}
	
	public ParserRule getCallSuffixRule() {
		return getCallSuffixAccess().getRule();
	}
	
	//CallArgs: '(' ( f+=IdExp ( ',' f+=IdExp )* )? ')' ;
	public CallArgsElements getCallArgsAccess() {
		return pCallArgs;
	}
	
	public ParserRule getCallArgsRule() {
		return getCallArgsAccess().getRule();
	}
	
	//IdExp: l=Expr ( ':=' r=Expr )? ;
	public IdExpElements getIdExpAccess() {
		return pIdExp;
	}
	
	public ParserRule getIdExpRule() {
		return getIdExpAccess().getRule();
	}
	
	//Type
	//    : BaseType ( '=>' BaseType )*
	//    | 'mut' BaseType ( '=>' BaseType )+
	//    ;
	public TypeElements getTypeAccess() {
		return pType;
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}
	
	//BaseType
	//    : QCREF TypeArgs?
	//    | '(' ( Type ( ',' Type )* )? ')'
	//    ;
	public BaseTypeElements getBaseTypeAccess() {
		return pBaseType;
	}
	
	public ParserRule getBaseTypeRule() {
		return getBaseTypeAccess().getRule();
	}
	
	//TypeArgs: '[' Type ( ',' Type )* ']' ;
	public TypeArgsElements getTypeArgsAccess() {
		return pTypeArgs;
	}
	
	public ParserRule getTypeArgsRule() {
		return getTypeArgsAccess().getRule();
	}
	
	//Functions:
	//    'functions' (specs+=FuncSpec)+
	//;
	public FunctionsElements getFunctionsAccess() {
		return pFunctions;
	}
	
	public ParserRule getFunctionsRule() {
		return getFunctionsAccess().getRule();
	}
	
	//FuncSpec: DefDef ';';
	public FuncSpecElements getFuncSpecAccess() {
		return pFuncSpec;
	}
	
	public ParserRule getFuncSpecRule() {
		return getFuncSpecAccess().getRule();
	}
	
	//Params: '(' Param ( ',' Param )? ')' ;
	public ParamsElements getParamsAccess() {
		return pParams;
	}
	
	public ParserRule getParamsRule() {
		return getParamsAccess().getRule();
	}
	
	//Param: 'var'? ID ':' ( '=>' )? Type '*'? ;
	public ParamElements getParamAccess() {
		return pParam;
	}
	
	public ParserRule getParamRule() {
		return getParamAccess().getRule();
	}
	
	//DefDef: DefMods? DefExt? name=DefID TypeParams? args=DefParams? ':' Type contract=DefContract? ':=' body=Expr ;
	public DefDefElements getDefDefAccess() {
		return pDefDef;
	}
	
	public ParserRule getDefDefRule() {
		return getDefDefAccess().getRule();
	}
	
	//DefMods: 'strict' | 'memoize' | 'mut' | 'spec' ;
	public DefModsElements getDefModsAccess() {
		return pDefMods;
	}
	
	public ParserRule getDefModsRule() {
		return getDefModsAccess().getRule();
	}
	
	//DefExt: '(' ID ':' Type ')' ;
	public DefExtElements getDefExtAccess() {
		return pDefExt;
	}
	
	public ParserRule getDefExtRule() {
		return getDefExtAccess().getRule();
	}
	
	//DefID: ID | OP ;
	public DefIDElements getDefIDAccess() {
		return pDefID;
	}
	
	public ParserRule getDefIDRule() {
		return getDefIDAccess().getRule();
	}
	
	//DefParams: '(' params+=DefParam ( ',' params+=DefParam )? ')' ;
	public DefParamsElements getDefParamsAccess() {
		return pDefParams;
	}
	
	public ParserRule getDefParamsRule() {
		return getDefParamsAccess().getRule();
	}
	
	//DefParam: name=ID ':' ( '=>' )? typeName=[aadl2::DataSubcomponentType|QCREF] '*'? ;
	public DefParamElements getDefParamAccess() {
		return pDefParam;
	}
	
	public ParserRule getDefParamRule() {
		return getDefParamAccess().getRule();
	}
	
	//DefContract
	//    : {DefContract} 'spec'
	//      ( rea=Reads? req=Requires? mod=Modifies? ens=Ensures?
	//      | dcc+=DefContractCase+ rea=Reads? mod=Modifies?
	//      )
	//    ;
	public DefContractElements getDefContractAccess() {
		return pDefContract;
	}
	
	public ParserRule getDefContractRule() {
		return getDefContractAccess().getRule();
	}
	
	//DefContractCase: {DefContractCase} 'case' STRING r=Requires? e=Ensures? ;
	public DefContractCaseElements getDefContractCaseAccess() {
		return pDefContractCase;
	}
	
	public ParserRule getDefContractCaseRule() {
		return getDefContractCaseAccess().getRule();
	}
	
	//TypeParams: '[' TypeParam (  ',' TypeParam )* ']' ;
	public TypeParamsElements getTypeParamsAccess() {
		return pTypeParams;
	}
	
	public ParserRule getTypeParamsRule() {
		return getTypeParamsAccess().getRule();
	}
	
	//TypeParam: 'mut'? ID ;
	public TypeParamElements getTypeParamAccess() {
		return pTypeParam;
	}
	
	public ParserRule getTypeParamRule() {
		return getTypeParamAccess().getRule();
	}
	
	//Reads: 'reads' e+=Expr ( ',' e+=Expr )* ;
	public ReadsElements getReadsAccess() {
		return pReads;
	}
	
	public ParserRule getReadsRule() {
		return getReadsAccess().getRule();
	}
	
	//Requires: 'requires' e+=Expr ( ',' e+=Expr )* ;
	public RequiresElements getRequiresAccess() {
		return pRequires;
	}
	
	public ParserRule getRequiresRule() {
		return getRequiresAccess().getRule();
	}
	
	//Modifies: 'modifies' e+=Expr ( ',' e+=Expr )* ;
	public ModifiesElements getModifiesAccess() {
		return pModifies;
	}
	
	public ParserRule getModifiesRule() {
		return getModifiesAccess().getRule();
	}
	
	//Ensures: 'ensures' e+=Expr ( ',' e+=Expr )* ;
	public EnsuresElements getEnsuresAccess() {
		return pEnsures;
	}
	
	public ParserRule getEnsuresRule() {
		return getEnsuresAccess().getRule();
	}
	
	//terminal OP: ( OPSYM+ | '\\' IDF ) ;
	public TerminalRule getOPRule() {
		return tOP;
	}
	
	//terminal fragment IDF: ( LETTER | '_' ) ( LETTER | DIGIT )* ;
	public TerminalRule getIDFRule() {
		return tIDF;
	}
	
	//terminal fragment LETTER: ('a'..'z' | 'A'..'Z');
	public TerminalRule getLETTERRule() {
		return tLETTER;
	}
	
	//terminal fragment OPSYM
	//    : '+' | '-' | '*' | '/' | '%' | '=' | '<' | '>' | '!' | '&' | '^' | '|' | '~'
	//    | ( '\u2200' .. '\u22FF' ) // https://en.wikipedia.org/wiki/Mathematical_Operators
	//    | ( '\u2A00' .. '\u2AFF' ) // https://en.wikipedia.org/wiki/Supplemental_Mathematical_Operators
	//    | ( '\u27C0' .. '\u27EF' ) // https://en.wikipedia.org/wiki/Miscellaneous_Mathematical_Symbols-A
	//    | ( '\u2980' .. '\u29FF' ) // https://en.wikipedia.org/wiki/Miscellaneous_Mathematical_Symbols-B
	//    ;
	public TerminalRule getOPSYMRule() {
		return tOPSYM;
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
