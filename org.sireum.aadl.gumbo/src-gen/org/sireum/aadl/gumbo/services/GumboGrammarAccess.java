
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
		private final Action cSpecSectionAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cStateAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cStateStateParserRuleCall_1_0 = (RuleCall)cStateAssignment_1.eContents().get(0);
		private final Assignment cFunctionsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cFunctionsFunctionsParserRuleCall_2_0 = (RuleCall)cFunctionsAssignment_2.eContents().get(0);
		private final Assignment cInvariantsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cInvariantsInvariantsParserRuleCall_3_0 = (RuleCall)cInvariantsAssignment_3.eContents().get(0);
		private final Assignment cIntegrationAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIntegrationIntegrationParserRuleCall_4_0 = (RuleCall)cIntegrationAssignment_4.eContents().get(0);
		private final Assignment cInitializeAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cInitializeInitializeParserRuleCall_5_0 = (RuleCall)cInitializeAssignment_5.eContents().get(0);
		private final Assignment cComputeAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cComputeComputeParserRuleCall_6_0 = (RuleCall)cComputeAssignment_6.eContents().get(0);
		
		//SpecSection: {SpecSection}
		//    (state = State)?
		//    (functions = Functions)?
		//    (invariants = Invariants)?
		//    (integration = Integration)?
		//    (initialize = Initialize)?
		//    (compute = Compute)?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{SpecSection}
		//   (state = State)?
		//   (functions = Functions)?
		//   (invariants = Invariants)?
		//   (integration = Integration)?
		//   (initialize = Initialize)?
		//   (compute = Compute)?
		public Group getGroup() { return cGroup; }
		
		//{SpecSection}
		public Action getSpecSectionAction_0() { return cSpecSectionAction_0; }
		
		//(state = State)?
		public Assignment getStateAssignment_1() { return cStateAssignment_1; }
		
		//State
		public RuleCall getStateStateParserRuleCall_1_0() { return cStateStateParserRuleCall_1_0; }
		
		//(functions = Functions)?
		public Assignment getFunctionsAssignment_2() { return cFunctionsAssignment_2; }
		
		//Functions
		public RuleCall getFunctionsFunctionsParserRuleCall_2_0() { return cFunctionsFunctionsParserRuleCall_2_0; }
		
		//(invariants = Invariants)?
		public Assignment getInvariantsAssignment_3() { return cInvariantsAssignment_3; }
		
		//Invariants
		public RuleCall getInvariantsInvariantsParserRuleCall_3_0() { return cInvariantsInvariantsParserRuleCall_3_0; }
		
		//(integration = Integration)?
		public Assignment getIntegrationAssignment_4() { return cIntegrationAssignment_4; }
		
		//Integration
		public RuleCall getIntegrationIntegrationParserRuleCall_4_0() { return cIntegrationIntegrationParserRuleCall_4_0; }
		
		//(initialize = Initialize)?
		public Assignment getInitializeAssignment_5() { return cInitializeAssignment_5; }
		
		//Initialize
		public RuleCall getInitializeInitializeParserRuleCall_5_0() { return cInitializeInitializeParserRuleCall_5_0; }
		
		//(compute = Compute)?
		public Assignment getComputeAssignment_6() { return cComputeAssignment_6; }
		
		//Compute
		public RuleCall getComputeComputeParserRuleCall_6_0() { return cComputeComputeParserRuleCall_6_0; }
	}
	public class StateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.State");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cDeclsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDeclsStateVarDeclParserRuleCall_1_0 = (RuleCall)cDeclsAssignment_1.eContents().get(0);
		
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
		private final RuleCall cDisplayNameSLANG_STRINGTerminalRuleCall_1_0 = (RuleCall)cDisplayNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cExprAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cExprExprParserRuleCall_3_0 = (RuleCall)cExprAssignment_3.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//InvSpec:
		//    'inv' displayName=SLANG_STRING ':' expr=Expr ';'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'inv' displayName=SLANG_STRING ':' expr=Expr ';'
		public Group getGroup() { return cGroup; }
		
		//'inv'
		public Keyword getInvKeyword_0() { return cInvKeyword_0; }
		
		//displayName=SLANG_STRING
		public Assignment getDisplayNameAssignment_1() { return cDisplayNameAssignment_1; }
		
		//SLANG_STRING
		public RuleCall getDisplayNameSLANG_STRINGTerminalRuleCall_1_0() { return cDisplayNameSLANG_STRINGTerminalRuleCall_1_0; }
		
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
		private final RuleCall cDisplayNameSLANG_STRINGTerminalRuleCall_1_0 = (RuleCall)cDisplayNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cAssumeStatementAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAssumeStatementAnonAssumeStatementParserRuleCall_3_0 = (RuleCall)cAssumeStatementAssignment_3.eContents().get(0);
		private final Assignment cGuaranteeStatementAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cGuaranteeStatementAnonGuaranteeStatementParserRuleCall_4_0 = (RuleCall)cGuaranteeStatementAssignment_4.eContents().get(0);
		
		//CaseStatementClause:
		//    'case' displayName=SLANG_STRING ':'
		//           // in case clauses, we must have both an assume clause and a guarantee clause
		//           // but they don't have a display name (they will "inherit" the name from the case name).
		//           assumeStatement = AnonAssumeStatement
		//           guaranteeStatement = AnonGuaranteeStatement
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'case' displayName=SLANG_STRING ':'
		//       // in case clauses, we must have both an assume clause and a guarantee clause
		//       // but they don't have a display name (they will "inherit" the name from the case name).
		//       assumeStatement = AnonAssumeStatement
		//       guaranteeStatement = AnonGuaranteeStatement
		public Group getGroup() { return cGroup; }
		
		//'case'
		public Keyword getCaseKeyword_0() { return cCaseKeyword_0; }
		
		//displayName=SLANG_STRING
		public Assignment getDisplayNameAssignment_1() { return cDisplayNameAssignment_1; }
		
		//SLANG_STRING
		public RuleCall getDisplayNameSLANG_STRINGTerminalRuleCall_1_0() { return cDisplayNameSLANG_STRINGTerminalRuleCall_1_0; }
		
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
		private final RuleCall cDisplayNameSLANG_STRINGTerminalRuleCall_1_0 = (RuleCall)cDisplayNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cExprAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cExprExprParserRuleCall_3_0 = (RuleCall)cExprAssignment_3.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//AssumeStatement:
		//    'assume' displayName=SLANG_STRING ':' expr=Expr ';'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'assume' displayName=SLANG_STRING ':' expr=Expr ';'
		public Group getGroup() { return cGroup; }
		
		//'assume'
		public Keyword getAssumeKeyword_0() { return cAssumeKeyword_0; }
		
		//displayName=SLANG_STRING
		public Assignment getDisplayNameAssignment_1() { return cDisplayNameAssignment_1; }
		
		//SLANG_STRING
		public RuleCall getDisplayNameSLANG_STRINGTerminalRuleCall_1_0() { return cDisplayNameSLANG_STRINGTerminalRuleCall_1_0; }
		
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
		private final RuleCall cDisplayNameSLANG_STRINGTerminalRuleCall_1_0 = (RuleCall)cDisplayNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cExprAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cExprExprParserRuleCall_3_0 = (RuleCall)cExprAssignment_3.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//GuaranteeStatement:
		//    'guarantee' displayName=SLANG_STRING ':' expr=Expr ';'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'guarantee' displayName=SLANG_STRING ':' expr=Expr ';'
		public Group getGroup() { return cGroup; }
		
		//'guarantee'
		public Keyword getGuaranteeKeyword_0() { return cGuaranteeKeyword_0; }
		
		//displayName=SLANG_STRING
		public Assignment getDisplayNameAssignment_1() { return cDisplayNameAssignment_1; }
		
		//SLANG_STRING
		public RuleCall getDisplayNameSLANG_STRINGTerminalRuleCall_1_0() { return cDisplayNameSLANG_STRINGTerminalRuleCall_1_0; }
		
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
		
		//PREDICATE: // TODO
		//    ID
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//// TODO
		//   ID
		public RuleCall getIDTerminalRuleCall() { return cIDTerminalRuleCall; }
	}
	public class OtherDataRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.OtherDataRef");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Assignment cNamedElementAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final CrossReference cNamedElementNamedElementCrossReference_0_0_0 = (CrossReference)cNamedElementAssignment_0_0.eContents().get(0);
		private final RuleCall cNamedElementNamedElementIDTerminalRuleCall_0_0_0_1 = (RuleCall)cNamedElementNamedElementCrossReference_0_0_0.eContents().get(1);
		private final Assignment cArrayRangeAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cArrayRangeArrayRangeParserRuleCall_0_1_0 = (RuleCall)cArrayRangeAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cPathAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cPathOtherDataRefParserRuleCall_1_1_0 = (RuleCall)cPathAssignment_1_1.eContents().get(0);
		
		//OtherDataRef:
		//    (
		//        (
		//            namedElement=[aadl2::NamedElement|ID]
		//             (arrayRange+=ArrayRange)*
		//        )
		//        ('.' path=OtherDataRef)?
		////     |      'annex' namedElement=[aadl2::NamedElement|ID]
		//    )
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//    (
		//        (
		//            namedElement=[aadl2::NamedElement|ID]
		//             (arrayRange+=ArrayRange)*
		//        )
		//        ('.' path=OtherDataRef)?
		////     |      'annex' namedElement=[aadl2::NamedElement|ID]
		//    )
		public Group getGroup() { return cGroup; }
		
		//(
		//    namedElement=[aadl2::NamedElement|ID]
		//     (arrayRange+=ArrayRange)*
		//)
		public Group getGroup_0() { return cGroup_0; }
		
		//namedElement=[aadl2::NamedElement|ID]
		public Assignment getNamedElementAssignment_0_0() { return cNamedElementAssignment_0_0; }
		
		//[aadl2::NamedElement|ID]
		public CrossReference getNamedElementNamedElementCrossReference_0_0_0() { return cNamedElementNamedElementCrossReference_0_0_0; }
		
		//ID
		public RuleCall getNamedElementNamedElementIDTerminalRuleCall_0_0_0_1() { return cNamedElementNamedElementIDTerminalRuleCall_0_0_0_1; }
		
		//(arrayRange+=ArrayRange)*
		public Assignment getArrayRangeAssignment_0_1() { return cArrayRangeAssignment_0_1; }
		
		//ArrayRange
		public RuleCall getArrayRangeArrayRangeParserRuleCall_0_1_0() { return cArrayRangeArrayRangeParserRuleCall_0_1_0; }
		
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
		private final RuleCall cSlangDefDefParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cSemicolonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//FuncSpec: SlangDefDef ';';
		@Override public ParserRule getRule() { return rule; }
		
		//SlangDefDef ';'
		public Group getGroup() { return cGroup; }
		
		//SlangDefDef
		public RuleCall getSlangDefDefParserRuleCall_0() { return cSlangDefDefParserRuleCall_0; }
		
		//';'
		public Keyword getSemicolonKeyword_1() { return cSemicolonKeyword_1; }
	}
	public class SlangDefDeclDefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangDefDeclDef");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDefKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cSlangDefModsParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cSdeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSdeSlangDefExtParserRuleCall_2_0 = (RuleCall)cSdeAssignment_2.eContents().get(0);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameSlangDefIDParserRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Assignment cTypeParamsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTypeParamsSlangTypeParamsParserRuleCall_4_0 = (RuleCall)cTypeParamsAssignment_4.eContents().get(0);
		private final Assignment cParamsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cParamsSlangDefParamsParserRuleCall_5_0 = (RuleCall)cParamsAssignment_5.eContents().get(0);
		private final Keyword cColonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cTypeAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cTypeSlangTypeParserRuleCall_7_0 = (RuleCall)cTypeAssignment_7.eContents().get(0);
		private final Assignment cCAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cCSlangDefContractParserRuleCall_8_0 = (RuleCall)cCAssignment_8.eContents().get(0);
		private final Group cGroup_9 = (Group)cGroup.eContents().get(9);
		private final Keyword cColonEqualsSignKeyword_9_0 = (Keyword)cGroup_9.eContents().get(0);
		private final Assignment cEAssignment_9_1 = (Assignment)cGroup_9.eContents().get(1);
		private final RuleCall cEExprParserRuleCall_9_1_0 = (RuleCall)cEAssignment_9_1.eContents().get(0);
		
		//SlangDefDeclDef: 'def' SlangDefMods? sde=SlangDefExt? name=SlangDefID typeParams=SlangTypeParams? params=SlangDefParams? ':' type=SlangType c=SlangDefContract? ( ':=' e=Expr )? ;
		@Override public ParserRule getRule() { return rule; }
		
		//'def' SlangDefMods? sde=SlangDefExt? name=SlangDefID typeParams=SlangTypeParams? params=SlangDefParams? ':' type=SlangType c=SlangDefContract? ( ':=' e=Expr )?
		public Group getGroup() { return cGroup; }
		
		//'def'
		public Keyword getDefKeyword_0() { return cDefKeyword_0; }
		
		//SlangDefMods?
		public RuleCall getSlangDefModsParserRuleCall_1() { return cSlangDefModsParserRuleCall_1; }
		
		//sde=SlangDefExt?
		public Assignment getSdeAssignment_2() { return cSdeAssignment_2; }
		
		//SlangDefExt
		public RuleCall getSdeSlangDefExtParserRuleCall_2_0() { return cSdeSlangDefExtParserRuleCall_2_0; }
		
		//name=SlangDefID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }
		
		//SlangDefID
		public RuleCall getNameSlangDefIDParserRuleCall_3_0() { return cNameSlangDefIDParserRuleCall_3_0; }
		
		//typeParams=SlangTypeParams?
		public Assignment getTypeParamsAssignment_4() { return cTypeParamsAssignment_4; }
		
		//SlangTypeParams
		public RuleCall getTypeParamsSlangTypeParamsParserRuleCall_4_0() { return cTypeParamsSlangTypeParamsParserRuleCall_4_0; }
		
		//params=SlangDefParams?
		public Assignment getParamsAssignment_5() { return cParamsAssignment_5; }
		
		//SlangDefParams
		public RuleCall getParamsSlangDefParamsParserRuleCall_5_0() { return cParamsSlangDefParamsParserRuleCall_5_0; }
		
		//':'
		public Keyword getColonKeyword_6() { return cColonKeyword_6; }
		
		//type=SlangType
		public Assignment getTypeAssignment_7() { return cTypeAssignment_7; }
		
		//SlangType
		public RuleCall getTypeSlangTypeParserRuleCall_7_0() { return cTypeSlangTypeParserRuleCall_7_0; }
		
		//c=SlangDefContract?
		public Assignment getCAssignment_8() { return cCAssignment_8; }
		
		//SlangDefContract
		public RuleCall getCSlangDefContractParserRuleCall_8_0() { return cCSlangDefContractParserRuleCall_8_0; }
		
		//( ':=' e=Expr )?
		public Group getGroup_9() { return cGroup_9; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_9_0() { return cColonEqualsSignKeyword_9_0; }
		
		//e=Expr
		public Assignment getEAssignment_9_1() { return cEAssignment_9_1; }
		
		//Expr
		public RuleCall getEExprParserRuleCall_9_1_0() { return cEExprParserRuleCall_9_1_0; }
	}
	public class SlangDefDeclElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangDefDecl");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDefKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cSlangDefModsParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cSdeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSdeSlangDefExtParserRuleCall_2_0 = (RuleCall)cSdeAssignment_2.eContents().get(0);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameSlangDefIDParserRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Assignment cTypeParamsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTypeParamsSlangTypeParamsParserRuleCall_4_0 = (RuleCall)cTypeParamsAssignment_4.eContents().get(0);
		private final Assignment cParamsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cParamsSlangDefParamsParserRuleCall_5_0 = (RuleCall)cParamsAssignment_5.eContents().get(0);
		private final Keyword cColonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cTypeAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cTypeSlangTypeParserRuleCall_7_0 = (RuleCall)cTypeAssignment_7.eContents().get(0);
		private final Assignment cCAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cCSlangDefContractParserRuleCall_8_0 = (RuleCall)cCAssignment_8.eContents().get(0);
		
		//SlangDefDecl: 'def' SlangDefMods? sde=SlangDefExt? name=SlangDefID typeParams=SlangTypeParams? params=SlangDefParams? ':' type=SlangType c=SlangDefContract? ;
		@Override public ParserRule getRule() { return rule; }
		
		//'def' SlangDefMods? sde=SlangDefExt? name=SlangDefID typeParams=SlangTypeParams? params=SlangDefParams? ':' type=SlangType c=SlangDefContract?
		public Group getGroup() { return cGroup; }
		
		//'def'
		public Keyword getDefKeyword_0() { return cDefKeyword_0; }
		
		//SlangDefMods?
		public RuleCall getSlangDefModsParserRuleCall_1() { return cSlangDefModsParserRuleCall_1; }
		
		//sde=SlangDefExt?
		public Assignment getSdeAssignment_2() { return cSdeAssignment_2; }
		
		//SlangDefExt
		public RuleCall getSdeSlangDefExtParserRuleCall_2_0() { return cSdeSlangDefExtParserRuleCall_2_0; }
		
		//name=SlangDefID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }
		
		//SlangDefID
		public RuleCall getNameSlangDefIDParserRuleCall_3_0() { return cNameSlangDefIDParserRuleCall_3_0; }
		
		//typeParams=SlangTypeParams?
		public Assignment getTypeParamsAssignment_4() { return cTypeParamsAssignment_4; }
		
		//SlangTypeParams
		public RuleCall getTypeParamsSlangTypeParamsParserRuleCall_4_0() { return cTypeParamsSlangTypeParamsParserRuleCall_4_0; }
		
		//params=SlangDefParams?
		public Assignment getParamsAssignment_5() { return cParamsAssignment_5; }
		
		//SlangDefParams
		public RuleCall getParamsSlangDefParamsParserRuleCall_5_0() { return cParamsSlangDefParamsParserRuleCall_5_0; }
		
		//':'
		public Keyword getColonKeyword_6() { return cColonKeyword_6; }
		
		//type=SlangType
		public Assignment getTypeAssignment_7() { return cTypeAssignment_7; }
		
		//SlangType
		public RuleCall getTypeSlangTypeParserRuleCall_7_0() { return cTypeSlangTypeParserRuleCall_7_0; }
		
		//c=SlangDefContract?
		public Assignment getCAssignment_8() { return cCAssignment_8; }
		
		//SlangDefContract
		public RuleCall getCSlangDefContractParserRuleCall_8_0() { return cCSlangDefContractParserRuleCall_8_0; }
	}
	public class SlangDefDefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangDefDef");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDefKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cSlangDefModsParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cSdeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSdeSlangDefExtParserRuleCall_2_0 = (RuleCall)cSdeAssignment_2.eContents().get(0);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameSlangDefIDParserRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Assignment cTypeParamsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTypeParamsSlangTypeParamsParserRuleCall_4_0 = (RuleCall)cTypeParamsAssignment_4.eContents().get(0);
		private final Assignment cParamsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cParamsSlangDefParamsParserRuleCall_5_0 = (RuleCall)cParamsAssignment_5.eContents().get(0);
		private final Keyword cColonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cTypeAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cTypeSlangTypeParserRuleCall_7_0 = (RuleCall)cTypeAssignment_7.eContents().get(0);
		private final Assignment cCAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cCSlangDefContractParserRuleCall_8_0 = (RuleCall)cCAssignment_8.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Assignment cEAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cEExprParserRuleCall_10_0 = (RuleCall)cEAssignment_10.eContents().get(0);
		
		//SlangDefDef: 'def' SlangDefMods? sde=SlangDefExt? name=SlangDefID typeParams=SlangTypeParams? params=SlangDefParams? ':' type=SlangType c=SlangDefContract? ':=' e=Expr ;
		@Override public ParserRule getRule() { return rule; }
		
		//'def' SlangDefMods? sde=SlangDefExt? name=SlangDefID typeParams=SlangTypeParams? params=SlangDefParams? ':' type=SlangType c=SlangDefContract? ':=' e=Expr
		public Group getGroup() { return cGroup; }
		
		//'def'
		public Keyword getDefKeyword_0() { return cDefKeyword_0; }
		
		//SlangDefMods?
		public RuleCall getSlangDefModsParserRuleCall_1() { return cSlangDefModsParserRuleCall_1; }
		
		//sde=SlangDefExt?
		public Assignment getSdeAssignment_2() { return cSdeAssignment_2; }
		
		//SlangDefExt
		public RuleCall getSdeSlangDefExtParserRuleCall_2_0() { return cSdeSlangDefExtParserRuleCall_2_0; }
		
		//name=SlangDefID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }
		
		//SlangDefID
		public RuleCall getNameSlangDefIDParserRuleCall_3_0() { return cNameSlangDefIDParserRuleCall_3_0; }
		
		//typeParams=SlangTypeParams?
		public Assignment getTypeParamsAssignment_4() { return cTypeParamsAssignment_4; }
		
		//SlangTypeParams
		public RuleCall getTypeParamsSlangTypeParamsParserRuleCall_4_0() { return cTypeParamsSlangTypeParamsParserRuleCall_4_0; }
		
		//params=SlangDefParams?
		public Assignment getParamsAssignment_5() { return cParamsAssignment_5; }
		
		//SlangDefParams
		public RuleCall getParamsSlangDefParamsParserRuleCall_5_0() { return cParamsSlangDefParamsParserRuleCall_5_0; }
		
		//':'
		public Keyword getColonKeyword_6() { return cColonKeyword_6; }
		
		//type=SlangType
		public Assignment getTypeAssignment_7() { return cTypeAssignment_7; }
		
		//SlangType
		public RuleCall getTypeSlangTypeParserRuleCall_7_0() { return cTypeSlangTypeParserRuleCall_7_0; }
		
		//c=SlangDefContract?
		public Assignment getCAssignment_8() { return cCAssignment_8; }
		
		//SlangDefContract
		public RuleCall getCSlangDefContractParserRuleCall_8_0() { return cCSlangDefContractParserRuleCall_8_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_9() { return cColonEqualsSignKeyword_9; }
		
		//e=Expr
		public Assignment getEAssignment_10() { return cEAssignment_10; }
		
		//Expr
		public RuleCall getEExprParserRuleCall_10_0() { return cEExprParserRuleCall_10_0; }
	}
	public class SlangDefModsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangDefMods");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cStrictKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cMemoizeKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cMutKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cSpecKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		
		//SlangDefMods: 'strict' | 'memoize' | 'mut' | 'spec' ;
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
	public class SlangDefExtElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangDefExt");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTypeNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTypeNameSlangTypeParserRuleCall_3_0 = (RuleCall)cTypeNameAssignment_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//SlangDefExt: '(' name=ID ':' typeName=SlangType ')' ;
		@Override public ParserRule getRule() { return rule; }
		
		//'(' name=ID ':' typeName=SlangType ')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//typeName=SlangType
		public Assignment getTypeNameAssignment_3() { return cTypeNameAssignment_3; }
		
		//SlangType
		public RuleCall getTypeNameSlangTypeParserRuleCall_3_0() { return cTypeNameSlangTypeParserRuleCall_3_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}
	public class SlangDefIDElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangDefID");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cOperatorParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//SlangDefID: ID | Operator ;
		@Override public ParserRule getRule() { return rule; }
		
		//ID | Operator
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//Operator
		public RuleCall getOperatorParserRuleCall_1() { return cOperatorParserRuleCall_1; }
	}
	public class SlangDefParamsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangDefParams");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cParamsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cParamsSlangDefParamParserRuleCall_1_0 = (RuleCall)cParamsAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cParamsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cParamsSlangDefParamParserRuleCall_2_1_0 = (RuleCall)cParamsAssignment_2_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//SlangDefParams: '(' params+=SlangDefParam ( ',' params+=SlangDefParam )? ')' ;
		@Override public ParserRule getRule() { return rule; }
		
		//'(' params+=SlangDefParam ( ',' params+=SlangDefParam )? ')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//params+=SlangDefParam
		public Assignment getParamsAssignment_1() { return cParamsAssignment_1; }
		
		//SlangDefParam
		public RuleCall getParamsSlangDefParamParserRuleCall_1_0() { return cParamsSlangDefParamParserRuleCall_1_0; }
		
		//( ',' params+=SlangDefParam )?
		public Group getGroup_2() { return cGroup_2; }
		
		//','
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//params+=SlangDefParam
		public Assignment getParamsAssignment_2_1() { return cParamsAssignment_2_1; }
		
		//SlangDefParam
		public RuleCall getParamsSlangDefParamParserRuleCall_2_1_0() { return cParamsSlangDefParamParserRuleCall_2_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class SlangDefParamElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangDefParam");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cEqualsSignGreaterThanSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTypeNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTypeNameSlangTypeParserRuleCall_3_0 = (RuleCall)cTypeNameAssignment_3.eContents().get(0);
		private final Keyword cAsteriskKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//SlangDefParam: name=ID ':' ( '=>' )? typeName=SlangType '*'? ;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ':' ( '=>' )? typeName=SlangType '*'?
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//( '=>' )?
		public Keyword getEqualsSignGreaterThanSignKeyword_2() { return cEqualsSignGreaterThanSignKeyword_2; }
		
		//typeName=SlangType
		public Assignment getTypeNameAssignment_3() { return cTypeNameAssignment_3; }
		
		//SlangType
		public RuleCall getTypeNameSlangTypeParserRuleCall_3_0() { return cTypeNameSlangTypeParserRuleCall_3_0; }
		
		//'*'?
		public Keyword getAsteriskKeyword_4() { return cAsteriskKeyword_4; }
	}
	public class SlangTypeParamsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangTypeParams");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cSlangTypeParamParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final RuleCall cSlangTypeParamParserRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		private final Keyword cRightSquareBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//SlangTypeParams: '[' SlangTypeParam (  ',' SlangTypeParam )* ']' ;
		@Override public ParserRule getRule() { return rule; }
		
		//'[' SlangTypeParam (  ',' SlangTypeParam )* ']'
		public Group getGroup() { return cGroup; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_0() { return cLeftSquareBracketKeyword_0; }
		
		//SlangTypeParam
		public RuleCall getSlangTypeParamParserRuleCall_1() { return cSlangTypeParamParserRuleCall_1; }
		
		//(  ',' SlangTypeParam )*
		public Group getGroup_2() { return cGroup_2; }
		
		//','
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//SlangTypeParam
		public RuleCall getSlangTypeParamParserRuleCall_2_1() { return cSlangTypeParamParserRuleCall_2_1; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_3() { return cRightSquareBracketKeyword_3; }
	}
	public class SlangTypeParamElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangTypeParam");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMutKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//SlangTypeParam: 'mut'? ID ;
		@Override public ParserRule getRule() { return rule; }
		
		//'mut'? ID
		public Group getGroup() { return cGroup; }
		
		//'mut'?
		public Keyword getMutKeyword_0() { return cMutKeyword_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class SlangDefContractElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangDefContract");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSlangDefContractAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSpecKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Group cGroup_2_0 = (Group)cAlternatives_2.eContents().get(0);
		private final Assignment cReaAssignment_2_0_0 = (Assignment)cGroup_2_0.eContents().get(0);
		private final RuleCall cReaSlangReadsParserRuleCall_2_0_0_0 = (RuleCall)cReaAssignment_2_0_0.eContents().get(0);
		private final Assignment cReqAssignment_2_0_1 = (Assignment)cGroup_2_0.eContents().get(1);
		private final RuleCall cReqSlangRequiresParserRuleCall_2_0_1_0 = (RuleCall)cReqAssignment_2_0_1.eContents().get(0);
		private final Assignment cModAssignment_2_0_2 = (Assignment)cGroup_2_0.eContents().get(2);
		private final RuleCall cModSlangModifiesParserRuleCall_2_0_2_0 = (RuleCall)cModAssignment_2_0_2.eContents().get(0);
		private final Assignment cEnsAssignment_2_0_3 = (Assignment)cGroup_2_0.eContents().get(3);
		private final RuleCall cEnsSlangEnsuresParserRuleCall_2_0_3_0 = (RuleCall)cEnsAssignment_2_0_3.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cAlternatives_2.eContents().get(1);
		private final Assignment cContractsAssignment_2_1_0 = (Assignment)cGroup_2_1.eContents().get(0);
		private final RuleCall cContractsSlangDefContractCaseParserRuleCall_2_1_0_0 = (RuleCall)cContractsAssignment_2_1_0.eContents().get(0);
		private final Assignment cReaAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cReaSlangReadsParserRuleCall_2_1_1_0 = (RuleCall)cReaAssignment_2_1_1.eContents().get(0);
		private final Assignment cModAssignment_2_1_2 = (Assignment)cGroup_2_1.eContents().get(2);
		private final RuleCall cModSlangModifiesParserRuleCall_2_1_2_0 = (RuleCall)cModAssignment_2_1_2.eContents().get(0);
		
		//SlangDefContract
		//    : {SlangDefContract} 'spec'
		//      ( rea=SlangReads? req=SlangRequires? mod=SlangModifies? ens=SlangEnsures?
		//      | contracts+=SlangDefContractCase+ rea=SlangReads? mod=SlangModifies?
		//      )
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//{SlangDefContract} 'spec'
		//     ( rea=SlangReads? req=SlangRequires? mod=SlangModifies? ens=SlangEnsures?
		//     | contracts+=SlangDefContractCase+ rea=SlangReads? mod=SlangModifies?
		//     )
		public Group getGroup() { return cGroup; }
		
		//{SlangDefContract}
		public Action getSlangDefContractAction_0() { return cSlangDefContractAction_0; }
		
		//'spec'
		public Keyword getSpecKeyword_1() { return cSpecKeyword_1; }
		
		//( rea=SlangReads? req=SlangRequires? mod=SlangModifies? ens=SlangEnsures?
		//| contracts+=SlangDefContractCase+ rea=SlangReads? mod=SlangModifies?
		//)
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//rea=SlangReads? req=SlangRequires? mod=SlangModifies? ens=SlangEnsures?
		public Group getGroup_2_0() { return cGroup_2_0; }
		
		//rea=SlangReads?
		public Assignment getReaAssignment_2_0_0() { return cReaAssignment_2_0_0; }
		
		//SlangReads
		public RuleCall getReaSlangReadsParserRuleCall_2_0_0_0() { return cReaSlangReadsParserRuleCall_2_0_0_0; }
		
		//req=SlangRequires?
		public Assignment getReqAssignment_2_0_1() { return cReqAssignment_2_0_1; }
		
		//SlangRequires
		public RuleCall getReqSlangRequiresParserRuleCall_2_0_1_0() { return cReqSlangRequiresParserRuleCall_2_0_1_0; }
		
		//mod=SlangModifies?
		public Assignment getModAssignment_2_0_2() { return cModAssignment_2_0_2; }
		
		//SlangModifies
		public RuleCall getModSlangModifiesParserRuleCall_2_0_2_0() { return cModSlangModifiesParserRuleCall_2_0_2_0; }
		
		//ens=SlangEnsures?
		public Assignment getEnsAssignment_2_0_3() { return cEnsAssignment_2_0_3; }
		
		//SlangEnsures
		public RuleCall getEnsSlangEnsuresParserRuleCall_2_0_3_0() { return cEnsSlangEnsuresParserRuleCall_2_0_3_0; }
		
		//contracts+=SlangDefContractCase+ rea=SlangReads? mod=SlangModifies?
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//contracts+=SlangDefContractCase+
		public Assignment getContractsAssignment_2_1_0() { return cContractsAssignment_2_1_0; }
		
		//SlangDefContractCase
		public RuleCall getContractsSlangDefContractCaseParserRuleCall_2_1_0_0() { return cContractsSlangDefContractCaseParserRuleCall_2_1_0_0; }
		
		//rea=SlangReads?
		public Assignment getReaAssignment_2_1_1() { return cReaAssignment_2_1_1; }
		
		//SlangReads
		public RuleCall getReaSlangReadsParserRuleCall_2_1_1_0() { return cReaSlangReadsParserRuleCall_2_1_1_0; }
		
		//mod=SlangModifies?
		public Assignment getModAssignment_2_1_2() { return cModAssignment_2_1_2; }
		
		//SlangModifies
		public RuleCall getModSlangModifiesParserRuleCall_2_1_2_0() { return cModSlangModifiesParserRuleCall_2_1_2_0; }
	}
	public class SlangDefContractCaseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangDefContractCase");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSlangDefContractCaseAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cCaseKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cSLANG_STRINGTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Assignment cReqAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cReqSlangRequiresParserRuleCall_3_0 = (RuleCall)cReqAssignment_3.eContents().get(0);
		private final Assignment cEnsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cEnsSlangEnsuresParserRuleCall_4_0 = (RuleCall)cEnsAssignment_4.eContents().get(0);
		
		//SlangDefContractCase: {SlangDefContractCase} 'case' /*SLANG_*/SLANG_STRING req=SlangRequires? ens=SlangEnsures? ;
		@Override public ParserRule getRule() { return rule; }
		
		//{SlangDefContractCase} 'case' /*SLANG_*/SLANG_STRING req=SlangRequires? ens=SlangEnsures?
		public Group getGroup() { return cGroup; }
		
		//{SlangDefContractCase}
		public Action getSlangDefContractCaseAction_0() { return cSlangDefContractCaseAction_0; }
		
		//'case'
		public Keyword getCaseKeyword_1() { return cCaseKeyword_1; }
		
		///*SLANG_*/SLANG_STRING
		public RuleCall getSLANG_STRINGTerminalRuleCall_2() { return cSLANG_STRINGTerminalRuleCall_2; }
		
		//req=SlangRequires?
		public Assignment getReqAssignment_3() { return cReqAssignment_3; }
		
		//SlangRequires
		public RuleCall getReqSlangRequiresParserRuleCall_3_0() { return cReqSlangRequiresParserRuleCall_3_0; }
		
		//ens=SlangEnsures?
		public Assignment getEnsAssignment_4() { return cEnsAssignment_4; }
		
		//SlangEnsures
		public RuleCall getEnsSlangEnsuresParserRuleCall_4_0() { return cEnsSlangEnsuresParserRuleCall_4_0; }
	}
	public class SlangSuprsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangSuprs");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLessThanSignColonKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSuperTypesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSuperTypesSlangSuprParserRuleCall_1_0 = (RuleCall)cSuperTypesAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cSuperTypesAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cSuperTypesSlangSuprParserRuleCall_2_1_0 = (RuleCall)cSuperTypesAssignment_2_1.eContents().get(0);
		
		//SlangSuprs: '<:' superTypes+=SlangSupr ( ',' superTypes+=SlangSupr )* ;
		@Override public ParserRule getRule() { return rule; }
		
		//'<:' superTypes+=SlangSupr ( ',' superTypes+=SlangSupr )*
		public Group getGroup() { return cGroup; }
		
		//'<:'
		public Keyword getLessThanSignColonKeyword_0() { return cLessThanSignColonKeyword_0; }
		
		//superTypes+=SlangSupr
		public Assignment getSuperTypesAssignment_1() { return cSuperTypesAssignment_1; }
		
		//SlangSupr
		public RuleCall getSuperTypesSlangSuprParserRuleCall_1_0() { return cSuperTypesSlangSuprParserRuleCall_1_0; }
		
		//( ',' superTypes+=SlangSupr )*
		public Group getGroup_2() { return cGroup_2; }
		
		//','
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//superTypes+=SlangSupr
		public Assignment getSuperTypesAssignment_2_1() { return cSuperTypesAssignment_2_1; }
		
		//SlangSupr
		public RuleCall getSuperTypesSlangSuprParserRuleCall_2_1_0() { return cSuperTypesSlangSuprParserRuleCall_2_1_0; }
	}
	public class SlangSuprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangSupr");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameSlangNameParserRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Assignment cArgsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cArgsSlangTypeArgsParserRuleCall_1_0 = (RuleCall)cArgsAssignment_1.eContents().get(0);
		
		//SlangSupr: name=SlangName args=SlangTypeArgs? ;
		@Override public ParserRule getRule() { return rule; }
		
		//name=SlangName args=SlangTypeArgs?
		public Group getGroup() { return cGroup; }
		
		//name=SlangName
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//SlangName
		public RuleCall getNameSlangNameParserRuleCall_0_0() { return cNameSlangNameParserRuleCall_0_0; }
		
		//args=SlangTypeArgs?
		public Assignment getArgsAssignment_1() { return cArgsAssignment_1; }
		
		//SlangTypeArgs
		public RuleCall getArgsSlangTypeArgsParserRuleCall_1_0() { return cArgsSlangTypeArgsParserRuleCall_1_0; }
	}
	public class SlangNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//SlangName: ID ( '.' ID )* ;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ( '.' ID )*
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//( '.' ID )*
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	public class SlangExtElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangExt");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSlangExtAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cExtensionKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cForKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final RuleCall cSlangNameParserRuleCall_3_1 = (RuleCall)cGroup_3.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cDeclAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cDeclSlangDefDeclParserRuleCall_5_0 = (RuleCall)cDeclAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//SlangExt: {SlangExt} 'extension' ID ( 'for' SlangName )?  '{' decl+=SlangDefDecl* '}' ;
		@Override public ParserRule getRule() { return rule; }
		
		//{SlangExt} 'extension' ID ( 'for' SlangName )?  '{' decl+=SlangDefDecl* '}'
		public Group getGroup() { return cGroup; }
		
		//{SlangExt}
		public Action getSlangExtAction_0() { return cSlangExtAction_0; }
		
		//'extension'
		public Keyword getExtensionKeyword_1() { return cExtensionKeyword_1; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_2() { return cIDTerminalRuleCall_2; }
		
		//( 'for' SlangName )?
		public Group getGroup_3() { return cGroup_3; }
		
		//'for'
		public Keyword getForKeyword_3_0() { return cForKeyword_3_0; }
		
		//SlangName
		public RuleCall getSlangNameParserRuleCall_3_1() { return cSlangNameParserRuleCall_3_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }
		
		//decl+=SlangDefDecl*
		public Assignment getDeclAssignment_5() { return cDeclAssignment_5; }
		
		//SlangDefDecl
		public RuleCall getDeclSlangDefDeclParserRuleCall_5_0() { return cDeclSlangDefDeclParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class SlangInvariantElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangInvariant");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInvariantKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cExprsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExprsExprParserRuleCall_1_0 = (RuleCall)cExprsAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cExprsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cExprsExprParserRuleCall_2_1_0 = (RuleCall)cExprsAssignment_2_1.eContents().get(0);
		
		//SlangInvariant: 'invariant' exprs+=Expr ( ',' exprs+=Expr )* ;
		@Override public ParserRule getRule() { return rule; }
		
		//'invariant' exprs+=Expr ( ',' exprs+=Expr )*
		public Group getGroup() { return cGroup; }
		
		//'invariant'
		public Keyword getInvariantKeyword_0() { return cInvariantKeyword_0; }
		
		//exprs+=Expr
		public Assignment getExprsAssignment_1() { return cExprsAssignment_1; }
		
		//Expr
		public RuleCall getExprsExprParserRuleCall_1_0() { return cExprsExprParserRuleCall_1_0; }
		
		//( ',' exprs+=Expr )*
		public Group getGroup_2() { return cGroup_2; }
		
		//','
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//exprs+=Expr
		public Assignment getExprsAssignment_2_1() { return cExprsAssignment_2_1; }
		
		//Expr
		public RuleCall getExprsExprParserRuleCall_2_1_0() { return cExprsExprParserRuleCall_2_1_0; }
	}
	public class SlangReadsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangReads");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cReadsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cExprsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExprsExprParserRuleCall_1_0 = (RuleCall)cExprsAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cExprsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cExprsExprParserRuleCall_2_1_0 = (RuleCall)cExprsAssignment_2_1.eContents().get(0);
		
		//SlangReads: 'reads' exprs+=Expr ( ',' exprs+=Expr )* ;
		@Override public ParserRule getRule() { return rule; }
		
		//'reads' exprs+=Expr ( ',' exprs+=Expr )*
		public Group getGroup() { return cGroup; }
		
		//'reads'
		public Keyword getReadsKeyword_0() { return cReadsKeyword_0; }
		
		//exprs+=Expr
		public Assignment getExprsAssignment_1() { return cExprsAssignment_1; }
		
		//Expr
		public RuleCall getExprsExprParserRuleCall_1_0() { return cExprsExprParserRuleCall_1_0; }
		
		//( ',' exprs+=Expr )*
		public Group getGroup_2() { return cGroup_2; }
		
		//','
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//exprs+=Expr
		public Assignment getExprsAssignment_2_1() { return cExprsAssignment_2_1; }
		
		//Expr
		public RuleCall getExprsExprParserRuleCall_2_1_0() { return cExprsExprParserRuleCall_2_1_0; }
	}
	public class SlangRequiresElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangRequires");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRequiresKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cExprsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExprsExprParserRuleCall_1_0 = (RuleCall)cExprsAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cExprsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cExprsExprParserRuleCall_2_1_0 = (RuleCall)cExprsAssignment_2_1.eContents().get(0);
		
		//SlangRequires: 'requires' exprs+=Expr ( ',' exprs+=Expr )* ;
		@Override public ParserRule getRule() { return rule; }
		
		//'requires' exprs+=Expr ( ',' exprs+=Expr )*
		public Group getGroup() { return cGroup; }
		
		//'requires'
		public Keyword getRequiresKeyword_0() { return cRequiresKeyword_0; }
		
		//exprs+=Expr
		public Assignment getExprsAssignment_1() { return cExprsAssignment_1; }
		
		//Expr
		public RuleCall getExprsExprParserRuleCall_1_0() { return cExprsExprParserRuleCall_1_0; }
		
		//( ',' exprs+=Expr )*
		public Group getGroup_2() { return cGroup_2; }
		
		//','
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//exprs+=Expr
		public Assignment getExprsAssignment_2_1() { return cExprsAssignment_2_1; }
		
		//Expr
		public RuleCall getExprsExprParserRuleCall_2_1_0() { return cExprsExprParserRuleCall_2_1_0; }
	}
	public class SlangModifiesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangModifies");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cModifiesKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cExprsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExprsExprParserRuleCall_1_0 = (RuleCall)cExprsAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cExprsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cExprsExprParserRuleCall_2_1_0 = (RuleCall)cExprsAssignment_2_1.eContents().get(0);
		
		//SlangModifies: 'modifies' exprs+=Expr ( ',' exprs+=Expr )* ;
		@Override public ParserRule getRule() { return rule; }
		
		//'modifies' exprs+=Expr ( ',' exprs+=Expr )*
		public Group getGroup() { return cGroup; }
		
		//'modifies'
		public Keyword getModifiesKeyword_0() { return cModifiesKeyword_0; }
		
		//exprs+=Expr
		public Assignment getExprsAssignment_1() { return cExprsAssignment_1; }
		
		//Expr
		public RuleCall getExprsExprParserRuleCall_1_0() { return cExprsExprParserRuleCall_1_0; }
		
		//( ',' exprs+=Expr )*
		public Group getGroup_2() { return cGroup_2; }
		
		//','
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//exprs+=Expr
		public Assignment getExprsAssignment_2_1() { return cExprsAssignment_2_1; }
		
		//Expr
		public RuleCall getExprsExprParserRuleCall_2_1_0() { return cExprsExprParserRuleCall_2_1_0; }
	}
	public class SlangEnsuresElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangEnsures");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEnsuresKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cExprsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExprsExprParserRuleCall_1_0 = (RuleCall)cExprsAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cExprsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cExprsExprParserRuleCall_2_1_0 = (RuleCall)cExprsAssignment_2_1.eContents().get(0);
		
		//SlangEnsures: 'ensures' exprs+=Expr ( ',' exprs+=Expr )* ;
		@Override public ParserRule getRule() { return rule; }
		
		//'ensures' exprs+=Expr ( ',' exprs+=Expr )*
		public Group getGroup() { return cGroup; }
		
		//'ensures'
		public Keyword getEnsuresKeyword_0() { return cEnsuresKeyword_0; }
		
		//exprs+=Expr
		public Assignment getExprsAssignment_1() { return cExprsAssignment_1; }
		
		//Expr
		public RuleCall getExprsExprParserRuleCall_1_0() { return cExprsExprParserRuleCall_1_0; }
		
		//( ',' exprs+=Expr )*
		public Group getGroup_2() { return cGroup_2; }
		
		//','
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//exprs+=Expr
		public Assignment getExprsAssignment_2_1() { return cExprsAssignment_2_1; }
		
		//Expr
		public RuleCall getExprsExprParserRuleCall_2_1_0() { return cExprsExprParserRuleCall_2_1_0; }
	}
	public class SlangStmtElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangStmt");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cSlangVarDefAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Assignment cDAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cDSlangVarDefParserRuleCall_0_1_0 = (RuleCall)cDAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cSlangIfStmtAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cIfKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cCondAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cCondExprParserRuleCall_1_2_0 = (RuleCall)cCondAssignment_1_2.eContents().get(0);
		private final Assignment cBAssignment_1_3 = (Assignment)cGroup_1.eContents().get(3);
		private final RuleCall cBSlangBlockParserRuleCall_1_3_0 = (RuleCall)cBAssignment_1_3.eContents().get(0);
		private final Assignment cEAssignment_1_4 = (Assignment)cGroup_1.eContents().get(4);
		private final RuleCall cESlangElseParserRuleCall_1_4_0 = (RuleCall)cEAssignment_1_4.eContents().get(0);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Action cSlangWhileStmtAction_2_0 = (Action)cGroup_2.eContents().get(0);
		private final Keyword cWhileKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Assignment cCondAssignment_2_2 = (Assignment)cGroup_2.eContents().get(2);
		private final RuleCall cCondExprParserRuleCall_2_2_0 = (RuleCall)cCondAssignment_2_2.eContents().get(0);
		private final Assignment cLAssignment_2_3 = (Assignment)cGroup_2.eContents().get(3);
		private final RuleCall cLSlangLoopContractParserRuleCall_2_3_0 = (RuleCall)cLAssignment_2_3.eContents().get(0);
		private final Assignment cBAssignment_2_4 = (Assignment)cGroup_2.eContents().get(4);
		private final RuleCall cBSlangBlockParserRuleCall_2_4_0 = (RuleCall)cBAssignment_2_4.eContents().get(0);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final Action cSlangMatchStmtAction_3_0 = (Action)cGroup_3.eContents().get(0);
		private final Keyword cMatchKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cTestExprAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final RuleCall cTestExprExprParserRuleCall_3_2_0 = (RuleCall)cTestExprAssignment_3_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3_3 = (Keyword)cGroup_3.eContents().get(3);
		private final Assignment cCAssignment_3_4 = (Assignment)cGroup_3.eContents().get(4);
		private final RuleCall cCSlangCaseParserRuleCall_3_4_0 = (RuleCall)cCAssignment_3_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3_5 = (Keyword)cGroup_3.eContents().get(5);
		private final Group cGroup_4 = (Group)cAlternatives.eContents().get(4);
		private final Action cSlangSpecStmtAction_4_0 = (Action)cGroup_4.eContents().get(0);
		private final Keyword cSpecKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cBAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final RuleCall cBSlangBlockParserRuleCall_4_2_0 = (RuleCall)cBAssignment_4_2.eContents().get(0);
		private final Group cGroup_5 = (Group)cAlternatives.eContents().get(5);
		private final Action cSlangAssumeStmtAction_5_0 = (Action)cGroup_5.eContents().get(0);
		private final Keyword cAssumeKeyword_5_1 = (Keyword)cGroup_5.eContents().get(1);
		private final Assignment cEAssignment_5_2 = (Assignment)cGroup_5.eContents().get(2);
		private final RuleCall cEExprParserRuleCall_5_2_0 = (RuleCall)cEAssignment_5_2.eContents().get(0);
		private final RuleCall cSLANG_STRINGTerminalRuleCall_5_3 = (RuleCall)cGroup_5.eContents().get(3);
		private final Group cGroup_6 = (Group)cAlternatives.eContents().get(6);
		private final Action cSlangAssertStmtAction_6_0 = (Action)cGroup_6.eContents().get(0);
		private final Keyword cAssertKeyword_6_1 = (Keyword)cGroup_6.eContents().get(1);
		private final Assignment cEAssignment_6_2 = (Assignment)cGroup_6.eContents().get(2);
		private final RuleCall cEExprParserRuleCall_6_2_0 = (RuleCall)cEAssignment_6_2.eContents().get(0);
		private final RuleCall cSLANG_STRINGTerminalRuleCall_6_3 = (RuleCall)cGroup_6.eContents().get(3);
		private final Group cGroup_7 = (Group)cAlternatives.eContents().get(7);
		private final Action cSlangHaltStmtAction_7_0 = (Action)cGroup_7.eContents().get(0);
		private final Keyword cHaltKeyword_7_1 = (Keyword)cGroup_7.eContents().get(1);
		private final RuleCall cSLANG_STRINGTerminalRuleCall_7_2 = (RuleCall)cGroup_7.eContents().get(2);
		private final Group cGroup_8 = (Group)cAlternatives.eContents().get(8);
		private final Action cSlangDoStmtAction_8_0 = (Action)cGroup_8.eContents().get(0);
		private final Keyword cDoKeyword_8_1 = (Keyword)cGroup_8.eContents().get(1);
		private final Assignment cEAssignment_8_2 = (Assignment)cGroup_8.eContents().get(2);
		private final RuleCall cEExprParserRuleCall_8_2_0 = (RuleCall)cEAssignment_8_2.eContents().get(0);
		private final Group cGroup_9 = (Group)cAlternatives.eContents().get(9);
		private final Action cSlangIdStmtAction_9_0 = (Action)cGroup_9.eContents().get(0);
		private final Assignment cPortOrSubcomponentOrStateVarAssignment_9_1 = (Assignment)cGroup_9.eContents().get(1);
		private final CrossReference cPortOrSubcomponentOrStateVarEObjectCrossReference_9_1_0 = (CrossReference)cPortOrSubcomponentOrStateVarAssignment_9_1.eContents().get(0);
		private final RuleCall cPortOrSubcomponentOrStateVarEObjectIDTerminalRuleCall_9_1_0_1 = (RuleCall)cPortOrSubcomponentOrStateVarEObjectCrossReference_9_1_0.eContents().get(1);
		private final Alternatives cAlternatives_9_2 = (Alternatives)cGroup_9.eContents().get(2);
		private final Keyword cColonKeyword_9_2_0 = (Keyword)cAlternatives_9_2.eContents().get(0);
		private final Group cGroup_9_2_1 = (Group)cAlternatives_9_2.eContents().get(1);
		private final Alternatives cAlternatives_9_2_1_0 = (Alternatives)cGroup_9_2_1.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_9_2_1_0_0 = (Keyword)cAlternatives_9_2_1_0.eContents().get(0);
		private final RuleCall cDEFOPTerminalRuleCall_9_2_1_0_1 = (RuleCall)cAlternatives_9_2_1_0.eContents().get(1);
		private final Assignment cEAssignment_9_2_1_1 = (Assignment)cGroup_9_2_1.eContents().get(1);
		private final RuleCall cEExprParserRuleCall_9_2_1_1_0 = (RuleCall)cEAssignment_9_2_1_1.eContents().get(0);
		
		//SlangStmt
		//    : {SlangVarDef} d=SlangVarDef
		//    | {SlangIfStmt} 'if' cond=Expr b=SlangBlock e=SlangElse?
		//    | {SlangWhileStmt} 'while' cond=Expr l=SlangLoopContract b=SlangBlock
		////    | ({SlangForStmt} 'for' range+=SlangForRange ( ','  range+=SlangForRange )*) l=SlangLoopContract b=SlangBlock
		//    | {SlangMatchStmt} 'match' testExpr=Expr '{' c+=SlangCase* '}'
		//    | {SlangSpecStmt} 'spec' b=SlangBlock
		//    | {SlangAssumeStmt} 'assume' e=Expr /*SLANG_*/SLANG_STRING?
		//    | {SlangAssertStmt} 'assert' e=Expr /*SLANG_*/SLANG_STRING?
		//    | {SlangHaltStmt} 'halt' /*SLANG_*/SLANG_STRING?
		//    | {SlangDoStmt} 'do' e=Expr
		//    // FIXME: This causes a "multiple alternatives" warning.
		//    | {SlangIdStmt} portOrSubcomponentOrStateVar=[ecore::EObject|ID]
		//      ( ':'
		//      | /*l+=SlangLHSSuffix**/ ( ( ':=' | DEFOP ) e=Expr )?
		//      )
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		// {SlangVarDef} d=SlangVarDef
		//    | {SlangIfStmt} 'if' cond=Expr b=SlangBlock e=SlangElse?
		//    | {SlangWhileStmt} 'while' cond=Expr l=SlangLoopContract b=SlangBlock
		////    | ({SlangForStmt} 'for' range+=SlangForRange ( ','  range+=SlangForRange )*) l=SlangLoopContract b=SlangBlock
		//    | {SlangMatchStmt} 'match' testExpr=Expr '{' c+=SlangCase* '}'
		//    | {SlangSpecStmt} 'spec' b=SlangBlock
		//    | {SlangAssumeStmt} 'assume' e=Expr /*SLANG_*/SLANG_STRING?
		//    | {SlangAssertStmt} 'assert' e=Expr /*SLANG_*/SLANG_STRING?
		//    | {SlangHaltStmt} 'halt' /*SLANG_*/SLANG_STRING?
		//    | {SlangDoStmt} 'do' e=Expr
		//    // FIXME: This causes a "multiple alternatives" warning.
		//    | {SlangIdStmt} portOrSubcomponentOrStateVar=[ecore::EObject|ID]
		//      ( ':'
		//      | /*l+=SlangLHSSuffix**/ ( ( ':=' | DEFOP ) e=Expr )?
		//      )
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{SlangVarDef} d=SlangVarDef
		public Group getGroup_0() { return cGroup_0; }
		
		//{SlangVarDef}
		public Action getSlangVarDefAction_0_0() { return cSlangVarDefAction_0_0; }
		
		//d=SlangVarDef
		public Assignment getDAssignment_0_1() { return cDAssignment_0_1; }
		
		//SlangVarDef
		public RuleCall getDSlangVarDefParserRuleCall_0_1_0() { return cDSlangVarDefParserRuleCall_0_1_0; }
		
		//{SlangIfStmt} 'if' cond=Expr b=SlangBlock e=SlangElse?
		public Group getGroup_1() { return cGroup_1; }
		
		//{SlangIfStmt}
		public Action getSlangIfStmtAction_1_0() { return cSlangIfStmtAction_1_0; }
		
		//'if'
		public Keyword getIfKeyword_1_1() { return cIfKeyword_1_1; }
		
		//cond=Expr
		public Assignment getCondAssignment_1_2() { return cCondAssignment_1_2; }
		
		//Expr
		public RuleCall getCondExprParserRuleCall_1_2_0() { return cCondExprParserRuleCall_1_2_0; }
		
		//b=SlangBlock
		public Assignment getBAssignment_1_3() { return cBAssignment_1_3; }
		
		//SlangBlock
		public RuleCall getBSlangBlockParserRuleCall_1_3_0() { return cBSlangBlockParserRuleCall_1_3_0; }
		
		//e=SlangElse?
		public Assignment getEAssignment_1_4() { return cEAssignment_1_4; }
		
		//SlangElse
		public RuleCall getESlangElseParserRuleCall_1_4_0() { return cESlangElseParserRuleCall_1_4_0; }
		
		//{SlangWhileStmt} 'while' cond=Expr l=SlangLoopContract b=SlangBlock
		public Group getGroup_2() { return cGroup_2; }
		
		//{SlangWhileStmt}
		public Action getSlangWhileStmtAction_2_0() { return cSlangWhileStmtAction_2_0; }
		
		//'while'
		public Keyword getWhileKeyword_2_1() { return cWhileKeyword_2_1; }
		
		//cond=Expr
		public Assignment getCondAssignment_2_2() { return cCondAssignment_2_2; }
		
		//Expr
		public RuleCall getCondExprParserRuleCall_2_2_0() { return cCondExprParserRuleCall_2_2_0; }
		
		//l=SlangLoopContract
		public Assignment getLAssignment_2_3() { return cLAssignment_2_3; }
		
		//SlangLoopContract
		public RuleCall getLSlangLoopContractParserRuleCall_2_3_0() { return cLSlangLoopContractParserRuleCall_2_3_0; }
		
		//b=SlangBlock
		public Assignment getBAssignment_2_4() { return cBAssignment_2_4; }
		
		//SlangBlock
		public RuleCall getBSlangBlockParserRuleCall_2_4_0() { return cBSlangBlockParserRuleCall_2_4_0; }
		
		//{SlangMatchStmt} 'match' testExpr=Expr '{' c+=SlangCase* '}'
		public Group getGroup_3() { return cGroup_3; }
		
		//{SlangMatchStmt}
		public Action getSlangMatchStmtAction_3_0() { return cSlangMatchStmtAction_3_0; }
		
		//'match'
		public Keyword getMatchKeyword_3_1() { return cMatchKeyword_3_1; }
		
		//testExpr=Expr
		public Assignment getTestExprAssignment_3_2() { return cTestExprAssignment_3_2; }
		
		//Expr
		public RuleCall getTestExprExprParserRuleCall_3_2_0() { return cTestExprExprParserRuleCall_3_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3_3() { return cLeftCurlyBracketKeyword_3_3; }
		
		//c+=SlangCase*
		public Assignment getCAssignment_3_4() { return cCAssignment_3_4; }
		
		//SlangCase
		public RuleCall getCSlangCaseParserRuleCall_3_4_0() { return cCSlangCaseParserRuleCall_3_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3_5() { return cRightCurlyBracketKeyword_3_5; }
		
		//{SlangSpecStmt} 'spec' b=SlangBlock
		public Group getGroup_4() { return cGroup_4; }
		
		//{SlangSpecStmt}
		public Action getSlangSpecStmtAction_4_0() { return cSlangSpecStmtAction_4_0; }
		
		//'spec'
		public Keyword getSpecKeyword_4_1() { return cSpecKeyword_4_1; }
		
		//b=SlangBlock
		public Assignment getBAssignment_4_2() { return cBAssignment_4_2; }
		
		//SlangBlock
		public RuleCall getBSlangBlockParserRuleCall_4_2_0() { return cBSlangBlockParserRuleCall_4_2_0; }
		
		//{SlangAssumeStmt} 'assume' e=Expr /*SLANG_*/SLANG_STRING?
		public Group getGroup_5() { return cGroup_5; }
		
		//{SlangAssumeStmt}
		public Action getSlangAssumeStmtAction_5_0() { return cSlangAssumeStmtAction_5_0; }
		
		//'assume'
		public Keyword getAssumeKeyword_5_1() { return cAssumeKeyword_5_1; }
		
		//e=Expr
		public Assignment getEAssignment_5_2() { return cEAssignment_5_2; }
		
		//Expr
		public RuleCall getEExprParserRuleCall_5_2_0() { return cEExprParserRuleCall_5_2_0; }
		
		///*SLANG_*/SLANG_STRING?
		public RuleCall getSLANG_STRINGTerminalRuleCall_5_3() { return cSLANG_STRINGTerminalRuleCall_5_3; }
		
		//{SlangAssertStmt} 'assert' e=Expr /*SLANG_*/SLANG_STRING?
		public Group getGroup_6() { return cGroup_6; }
		
		//{SlangAssertStmt}
		public Action getSlangAssertStmtAction_6_0() { return cSlangAssertStmtAction_6_0; }
		
		//'assert'
		public Keyword getAssertKeyword_6_1() { return cAssertKeyword_6_1; }
		
		//e=Expr
		public Assignment getEAssignment_6_2() { return cEAssignment_6_2; }
		
		//Expr
		public RuleCall getEExprParserRuleCall_6_2_0() { return cEExprParserRuleCall_6_2_0; }
		
		///*SLANG_*/SLANG_STRING?
		public RuleCall getSLANG_STRINGTerminalRuleCall_6_3() { return cSLANG_STRINGTerminalRuleCall_6_3; }
		
		//{SlangHaltStmt} 'halt' /*SLANG_*/SLANG_STRING?
		public Group getGroup_7() { return cGroup_7; }
		
		//{SlangHaltStmt}
		public Action getSlangHaltStmtAction_7_0() { return cSlangHaltStmtAction_7_0; }
		
		//'halt'
		public Keyword getHaltKeyword_7_1() { return cHaltKeyword_7_1; }
		
		///*SLANG_*/SLANG_STRING?
		public RuleCall getSLANG_STRINGTerminalRuleCall_7_2() { return cSLANG_STRINGTerminalRuleCall_7_2; }
		
		//{SlangDoStmt} 'do' e=Expr
		public Group getGroup_8() { return cGroup_8; }
		
		//{SlangDoStmt}
		public Action getSlangDoStmtAction_8_0() { return cSlangDoStmtAction_8_0; }
		
		//'do'
		public Keyword getDoKeyword_8_1() { return cDoKeyword_8_1; }
		
		//e=Expr
		public Assignment getEAssignment_8_2() { return cEAssignment_8_2; }
		
		//Expr
		public RuleCall getEExprParserRuleCall_8_2_0() { return cEExprParserRuleCall_8_2_0; }
		
		//{SlangIdStmt} portOrSubcomponentOrStateVar=[ecore::EObject|ID]
		//     ( ':'
		//     | /*l+=SlangLHSSuffix**/ ( ( ':=' | DEFOP ) e=Expr )?
		//     )
		public Group getGroup_9() { return cGroup_9; }
		
		//{SlangIdStmt}
		public Action getSlangIdStmtAction_9_0() { return cSlangIdStmtAction_9_0; }
		
		//portOrSubcomponentOrStateVar=[ecore::EObject|ID]
		public Assignment getPortOrSubcomponentOrStateVarAssignment_9_1() { return cPortOrSubcomponentOrStateVarAssignment_9_1; }
		
		//[ecore::EObject|ID]
		public CrossReference getPortOrSubcomponentOrStateVarEObjectCrossReference_9_1_0() { return cPortOrSubcomponentOrStateVarEObjectCrossReference_9_1_0; }
		
		//ID
		public RuleCall getPortOrSubcomponentOrStateVarEObjectIDTerminalRuleCall_9_1_0_1() { return cPortOrSubcomponentOrStateVarEObjectIDTerminalRuleCall_9_1_0_1; }
		
		//( ':'
		//| /*l+=SlangLHSSuffix**/ ( ( ':=' | DEFOP ) e=Expr )?
		//)
		public Alternatives getAlternatives_9_2() { return cAlternatives_9_2; }
		
		//':'
		public Keyword getColonKeyword_9_2_0() { return cColonKeyword_9_2_0; }
		
		///*l+=SlangLHSSuffix**/ ( ( ':=' | DEFOP ) e=Expr )?
		public Group getGroup_9_2_1() { return cGroup_9_2_1; }
		
		//( ':=' | DEFOP )
		public Alternatives getAlternatives_9_2_1_0() { return cAlternatives_9_2_1_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_9_2_1_0_0() { return cColonEqualsSignKeyword_9_2_1_0_0; }
		
		//DEFOP
		public RuleCall getDEFOPTerminalRuleCall_9_2_1_0_1() { return cDEFOPTerminalRuleCall_9_2_1_0_1; }
		
		//e=Expr
		public Assignment getEAssignment_9_2_1_1() { return cEAssignment_9_2_1_1; }
		
		//Expr
		public RuleCall getEExprParserRuleCall_9_2_1_1_0() { return cEExprParserRuleCall_9_2_1_1_0; }
	}
	public class SlangElseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangElse");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cElseKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Keyword cIfKeyword_1_0_0 = (Keyword)cGroup_1_0.eContents().get(0);
		private final Assignment cCondAssignment_1_0_1 = (Assignment)cGroup_1_0.eContents().get(1);
		private final RuleCall cCondExprParserRuleCall_1_0_1_0 = (RuleCall)cCondAssignment_1_0_1.eContents().get(0);
		private final Assignment cBAssignment_1_0_2 = (Assignment)cGroup_1_0.eContents().get(2);
		private final RuleCall cBSlangBlockParserRuleCall_1_0_2_0 = (RuleCall)cBAssignment_1_0_2.eContents().get(0);
		private final Assignment cEAssignment_1_0_3 = (Assignment)cGroup_1_0.eContents().get(3);
		private final RuleCall cESlangElseParserRuleCall_1_0_3_0 = (RuleCall)cEAssignment_1_0_3.eContents().get(0);
		private final RuleCall cSlangBlockParserRuleCall_1_1 = (RuleCall)cAlternatives_1.eContents().get(1);
		
		//SlangElse
		//    : 'else'
		//        ( 'if' cond=Expr b=SlangBlock e=SlangElse?
		//        | SlangBlock
		//        )
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//'else'
		//       ( 'if' cond=Expr b=SlangBlock e=SlangElse?
		//       | SlangBlock
		//       )
		public Group getGroup() { return cGroup; }
		
		//'else'
		public Keyword getElseKeyword_0() { return cElseKeyword_0; }
		
		//( 'if' cond=Expr b=SlangBlock e=SlangElse?
		//| SlangBlock
		//)
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//'if' cond=Expr b=SlangBlock e=SlangElse?
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//'if'
		public Keyword getIfKeyword_1_0_0() { return cIfKeyword_1_0_0; }
		
		//cond=Expr
		public Assignment getCondAssignment_1_0_1() { return cCondAssignment_1_0_1; }
		
		//Expr
		public RuleCall getCondExprParserRuleCall_1_0_1_0() { return cCondExprParserRuleCall_1_0_1_0; }
		
		//b=SlangBlock
		public Assignment getBAssignment_1_0_2() { return cBAssignment_1_0_2; }
		
		//SlangBlock
		public RuleCall getBSlangBlockParserRuleCall_1_0_2_0() { return cBSlangBlockParserRuleCall_1_0_2_0; }
		
		//e=SlangElse?
		public Assignment getEAssignment_1_0_3() { return cEAssignment_1_0_3; }
		
		//SlangElse
		public RuleCall getESlangElseParserRuleCall_1_0_3_0() { return cESlangElseParserRuleCall_1_0_3_0; }
		
		//SlangBlock
		public RuleCall getSlangBlockParserRuleCall_1_1() { return cSlangBlockParserRuleCall_1_1; }
	}
	public class SlangLoopContractElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangLoopContract");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSlangLoopContractAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cInvAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cInvSlangInvariantParserRuleCall_1_0 = (RuleCall)cInvAssignment_1.eContents().get(0);
		private final Assignment cModAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cModSlangModifiesParserRuleCall_2_0 = (RuleCall)cModAssignment_2.eContents().get(0);
		
		//SlangLoopContract: {SlangLoopContract} inv=SlangInvariant? mod=SlangModifies? ;
		@Override public ParserRule getRule() { return rule; }
		
		//{SlangLoopContract} inv=SlangInvariant? mod=SlangModifies?
		public Group getGroup() { return cGroup; }
		
		//{SlangLoopContract}
		public Action getSlangLoopContractAction_0() { return cSlangLoopContractAction_0; }
		
		//inv=SlangInvariant?
		public Assignment getInvAssignment_1() { return cInvAssignment_1; }
		
		//SlangInvariant
		public RuleCall getInvSlangInvariantParserRuleCall_1_0() { return cInvSlangInvariantParserRuleCall_1_0; }
		
		//mod=SlangModifies?
		public Assignment getModAssignment_2() { return cModAssignment_2; }
		
		//SlangModifies
		public RuleCall getModSlangModifiesParserRuleCall_2_0() { return cModSlangModifiesParserRuleCall_2_0; }
	}
	public class SlangLHSSuffixElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangLHSSuffix");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cSlangFieldLookupAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Keyword cFullStopKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0_2 = (RuleCall)cGroup_0.eContents().get(2);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cSlangMethodCallAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Group cGroup_1_2 = (Group)cGroup_1.eContents().get(2);
		private final Assignment cExprsAssignment_1_2_0 = (Assignment)cGroup_1_2.eContents().get(0);
		private final RuleCall cExprsExprParserRuleCall_1_2_0_0 = (RuleCall)cExprsAssignment_1_2_0.eContents().get(0);
		private final Group cGroup_1_2_1 = (Group)cGroup_1_2.eContents().get(1);
		private final Keyword cCommaKeyword_1_2_1_0 = (Keyword)cGroup_1_2_1.eContents().get(0);
		private final Assignment cExprsAssignment_1_2_1_1 = (Assignment)cGroup_1_2_1.eContents().get(1);
		private final RuleCall cExprsExprParserRuleCall_1_2_1_1_0 = (RuleCall)cExprsAssignment_1_2_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_1_3 = (Keyword)cGroup_1.eContents().get(3);
		
		//SlangLHSSuffix
		//    : {SlangFieldLookup} '.' ID
		//    | {SlangMethodCall} '(' ( exprs+=Expr ( ',' exprs+=Expr )* )? ')'
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//{SlangFieldLookup} '.' ID
		//   | {SlangMethodCall} '(' ( exprs+=Expr ( ',' exprs+=Expr )* )? ')'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{SlangFieldLookup} '.' ID
		public Group getGroup_0() { return cGroup_0; }
		
		//{SlangFieldLookup}
		public Action getSlangFieldLookupAction_0_0() { return cSlangFieldLookupAction_0_0; }
		
		//'.'
		public Keyword getFullStopKeyword_0_1() { return cFullStopKeyword_0_1; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0_2() { return cIDTerminalRuleCall_0_2; }
		
		//{SlangMethodCall} '(' ( exprs+=Expr ( ',' exprs+=Expr )* )? ')'
		public Group getGroup_1() { return cGroup_1; }
		
		//{SlangMethodCall}
		public Action getSlangMethodCallAction_1_0() { return cSlangMethodCallAction_1_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1_1() { return cLeftParenthesisKeyword_1_1; }
		
		//( exprs+=Expr ( ',' exprs+=Expr )* )?
		public Group getGroup_1_2() { return cGroup_1_2; }
		
		//exprs+=Expr
		public Assignment getExprsAssignment_1_2_0() { return cExprsAssignment_1_2_0; }
		
		//Expr
		public RuleCall getExprsExprParserRuleCall_1_2_0_0() { return cExprsExprParserRuleCall_1_2_0_0; }
		
		//( ',' exprs+=Expr )*
		public Group getGroup_1_2_1() { return cGroup_1_2_1; }
		
		//','
		public Keyword getCommaKeyword_1_2_1_0() { return cCommaKeyword_1_2_1_0; }
		
		//exprs+=Expr
		public Assignment getExprsAssignment_1_2_1_1() { return cExprsAssignment_1_2_1_1; }
		
		//Expr
		public RuleCall getExprsExprParserRuleCall_1_2_1_1_0() { return cExprsExprParserRuleCall_1_2_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_1_3() { return cRightParenthesisKeyword_1_3; }
	}
	public class SlangCaseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangCase");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCaseKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPatternAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cPatternSlangPatternParserRuleCall_1_0 = (RuleCall)cPatternAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cIfKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cEAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cEExprParserRuleCall_2_1_0 = (RuleCall)cEAssignment_2_1.eContents().get(0);
		private final Keyword cEqualsSignGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cSAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSSlangStmtParserRuleCall_4_0 = (RuleCall)cSAssignment_4.eContents().get(0);
		
		//SlangCase: 'case' pattern=SlangPattern ( 'if' e=Expr )? '=>' s+=SlangStmt* ;
		@Override public ParserRule getRule() { return rule; }
		
		//'case' pattern=SlangPattern ( 'if' e=Expr )? '=>' s+=SlangStmt*
		public Group getGroup() { return cGroup; }
		
		//'case'
		public Keyword getCaseKeyword_0() { return cCaseKeyword_0; }
		
		//pattern=SlangPattern
		public Assignment getPatternAssignment_1() { return cPatternAssignment_1; }
		
		//SlangPattern
		public RuleCall getPatternSlangPatternParserRuleCall_1_0() { return cPatternSlangPatternParserRuleCall_1_0; }
		
		//( 'if' e=Expr )?
		public Group getGroup_2() { return cGroup_2; }
		
		//'if'
		public Keyword getIfKeyword_2_0() { return cIfKeyword_2_0; }
		
		//e=Expr
		public Assignment getEAssignment_2_1() { return cEAssignment_2_1; }
		
		//Expr
		public RuleCall getEExprParserRuleCall_2_1_0() { return cEExprParserRuleCall_2_1_0; }
		
		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_3() { return cEqualsSignGreaterThanSignKeyword_3; }
		
		//s+=SlangStmt*
		public Assignment getSAssignment_4() { return cSAssignment_4; }
		
		//SlangStmt
		public RuleCall getSSlangStmtParserRuleCall_4_0() { return cSSlangStmtParserRuleCall_4_0; }
	}
	public class SlangPatternElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangPattern");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cSlangPatternAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final Group cGroup_0_2 = (Group)cGroup_0.eContents().get(2);
		private final Keyword cLeftParenthesisKeyword_0_2_0 = (Keyword)cGroup_0_2.eContents().get(0);
		private final Assignment cPatternsAssignment_0_2_1 = (Assignment)cGroup_0_2.eContents().get(1);
		private final RuleCall cPatternsSlangTPatternParserRuleCall_0_2_1_0 = (RuleCall)cPatternsAssignment_0_2_1.eContents().get(0);
		private final Group cGroup_0_2_2 = (Group)cGroup_0_2.eContents().get(2);
		private final Keyword cCommaKeyword_0_2_2_0 = (Keyword)cGroup_0_2_2.eContents().get(0);
		private final Assignment cPatternsAssignment_0_2_2_1 = (Assignment)cGroup_0_2_2.eContents().get(1);
		private final RuleCall cPatternsSlangTPatternParserRuleCall_0_2_2_1_0 = (RuleCall)cPatternsAssignment_0_2_2_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_0_2_3 = (Keyword)cGroup_0_2.eContents().get(3);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cPatternsAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cPatternsSlangTPatternParserRuleCall_1_1_0 = (RuleCall)cPatternsAssignment_1_1.eContents().get(0);
		private final Group cGroup_1_2 = (Group)cGroup_1.eContents().get(2);
		private final Keyword cCommaKeyword_1_2_0 = (Keyword)cGroup_1_2.eContents().get(0);
		private final Assignment cPatternsAssignment_1_2_1 = (Assignment)cGroup_1_2.eContents().get(1);
		private final RuleCall cPatternsSlangTPatternParserRuleCall_1_2_1_0 = (RuleCall)cPatternsAssignment_1_2_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_1_3 = (Keyword)cGroup_1.eContents().get(3);
		
		//SlangPattern: {SlangPattern}
		//      ID ( '(' patterns+=SlangTPattern ( ',' patterns+=SlangTPattern )* ')' )?
		//    | '(' patterns+=SlangTPattern ( ',' patterns+=SlangTPattern )* ')'
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//{SlangPattern}
		//     ID ( '(' patterns+=SlangTPattern ( ',' patterns+=SlangTPattern )* ')' )?
		//   | '(' patterns+=SlangTPattern ( ',' patterns+=SlangTPattern )* ')'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{SlangPattern}
		//     ID ( '(' patterns+=SlangTPattern ( ',' patterns+=SlangTPattern )* ')' )?
		public Group getGroup_0() { return cGroup_0; }
		
		//{SlangPattern}
		public Action getSlangPatternAction_0_0() { return cSlangPatternAction_0_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0_1() { return cIDTerminalRuleCall_0_1; }
		
		//( '(' patterns+=SlangTPattern ( ',' patterns+=SlangTPattern )* ')' )?
		public Group getGroup_0_2() { return cGroup_0_2; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0_2_0() { return cLeftParenthesisKeyword_0_2_0; }
		
		//patterns+=SlangTPattern
		public Assignment getPatternsAssignment_0_2_1() { return cPatternsAssignment_0_2_1; }
		
		//SlangTPattern
		public RuleCall getPatternsSlangTPatternParserRuleCall_0_2_1_0() { return cPatternsSlangTPatternParserRuleCall_0_2_1_0; }
		
		//( ',' patterns+=SlangTPattern )*
		public Group getGroup_0_2_2() { return cGroup_0_2_2; }
		
		//','
		public Keyword getCommaKeyword_0_2_2_0() { return cCommaKeyword_0_2_2_0; }
		
		//patterns+=SlangTPattern
		public Assignment getPatternsAssignment_0_2_2_1() { return cPatternsAssignment_0_2_2_1; }
		
		//SlangTPattern
		public RuleCall getPatternsSlangTPatternParserRuleCall_0_2_2_1_0() { return cPatternsSlangTPatternParserRuleCall_0_2_2_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_0_2_3() { return cRightParenthesisKeyword_0_2_3; }
		
		//'(' patterns+=SlangTPattern ( ',' patterns+=SlangTPattern )* ')'
		public Group getGroup_1() { return cGroup_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1_0() { return cLeftParenthesisKeyword_1_0; }
		
		//patterns+=SlangTPattern
		public Assignment getPatternsAssignment_1_1() { return cPatternsAssignment_1_1; }
		
		//SlangTPattern
		public RuleCall getPatternsSlangTPatternParserRuleCall_1_1_0() { return cPatternsSlangTPatternParserRuleCall_1_1_0; }
		
		//( ',' patterns+=SlangTPattern )*
		public Group getGroup_1_2() { return cGroup_1_2; }
		
		//','
		public Keyword getCommaKeyword_1_2_0() { return cCommaKeyword_1_2_0; }
		
		//patterns+=SlangTPattern
		public Assignment getPatternsAssignment_1_2_1() { return cPatternsAssignment_1_2_1; }
		
		//SlangTPattern
		public RuleCall getPatternsSlangTPatternParserRuleCall_1_2_1_0() { return cPatternsSlangTPatternParserRuleCall_1_2_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_1_3() { return cRightParenthesisKeyword_1_3; }
	}
	public class SlangTPatternElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangTPattern");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cSlangTPatternAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final Alternatives cAlternatives_0_2 = (Alternatives)cGroup_0.eContents().get(2);
		private final Group cGroup_0_2_0 = (Group)cAlternatives_0_2.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_0_2_0_0 = (Keyword)cGroup_0_2_0.eContents().get(0);
		private final Assignment cPatternsAssignment_0_2_0_1 = (Assignment)cGroup_0_2_0.eContents().get(1);
		private final RuleCall cPatternsSlangTPatternParserRuleCall_0_2_0_1_0 = (RuleCall)cPatternsAssignment_0_2_0_1.eContents().get(0);
		private final Group cGroup_0_2_0_2 = (Group)cGroup_0_2_0.eContents().get(2);
		private final Keyword cCommaKeyword_0_2_0_2_0 = (Keyword)cGroup_0_2_0_2.eContents().get(0);
		private final Assignment cPatternsAssignment_0_2_0_2_1 = (Assignment)cGroup_0_2_0_2.eContents().get(1);
		private final RuleCall cPatternsSlangTPatternParserRuleCall_0_2_0_2_1_0 = (RuleCall)cPatternsAssignment_0_2_0_2_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_0_2_0_3 = (Keyword)cGroup_0_2_0.eContents().get(3);
		private final Group cGroup_0_2_1 = (Group)cAlternatives_0_2.eContents().get(1);
		private final Keyword cColonKeyword_0_2_1_0 = (Keyword)cGroup_0_2_1.eContents().get(0);
		private final Assignment cTypeAssignment_0_2_1_1 = (Assignment)cGroup_0_2_1.eContents().get(1);
		private final RuleCall cTypeSlangTypeParserRuleCall_0_2_1_1_0 = (RuleCall)cTypeAssignment_0_2_1_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cPatternsAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cPatternsSlangTPatternParserRuleCall_1_1_0 = (RuleCall)cPatternsAssignment_1_1.eContents().get(0);
		private final Group cGroup_1_2 = (Group)cGroup_1.eContents().get(2);
		private final Keyword cCommaKeyword_1_2_0 = (Keyword)cGroup_1_2.eContents().get(0);
		private final Assignment cPatternsAssignment_1_2_1 = (Assignment)cGroup_1_2.eContents().get(1);
		private final RuleCall cPatternsSlangTPatternParserRuleCall_1_2_1_0 = (RuleCall)cPatternsAssignment_1_2_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_1_3 = (Keyword)cGroup_1.eContents().get(3);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Action cSlangTPatternAction_2_0 = (Action)cGroup_2.eContents().get(0);
		private final Keyword c_Keyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Group cGroup_2_2 = (Group)cGroup_2.eContents().get(2);
		private final Keyword cColonKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cTypeAssignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final RuleCall cTypeSlangTypeParserRuleCall_2_2_1_0 = (RuleCall)cTypeAssignment_2_2_1.eContents().get(0);
		
		//SlangTPattern:
		//      {SlangTPattern} ID ( '(' patterns+=SlangTPattern ( ',' patterns+=SlangTPattern )* ')' | ':' type=SlangType )?
		//    | '(' patterns+=SlangTPattern ( ',' patterns+=SlangTPattern )* ')'
		//    | {SlangTPattern} '_' ( ':' type=SlangType )?
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//  {SlangTPattern} ID ( '(' patterns+=SlangTPattern ( ',' patterns+=SlangTPattern )* ')' | ':' type=SlangType )?
		//| '(' patterns+=SlangTPattern ( ',' patterns+=SlangTPattern )* ')'
		//| {SlangTPattern} '_' ( ':' type=SlangType )?
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{SlangTPattern} ID ( '(' patterns+=SlangTPattern ( ',' patterns+=SlangTPattern )* ')' | ':' type=SlangType )?
		public Group getGroup_0() { return cGroup_0; }
		
		//{SlangTPattern}
		public Action getSlangTPatternAction_0_0() { return cSlangTPatternAction_0_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0_1() { return cIDTerminalRuleCall_0_1; }
		
		//( '(' patterns+=SlangTPattern ( ',' patterns+=SlangTPattern )* ')' | ':' type=SlangType )?
		public Alternatives getAlternatives_0_2() { return cAlternatives_0_2; }
		
		//'(' patterns+=SlangTPattern ( ',' patterns+=SlangTPattern )* ')'
		public Group getGroup_0_2_0() { return cGroup_0_2_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0_2_0_0() { return cLeftParenthesisKeyword_0_2_0_0; }
		
		//patterns+=SlangTPattern
		public Assignment getPatternsAssignment_0_2_0_1() { return cPatternsAssignment_0_2_0_1; }
		
		//SlangTPattern
		public RuleCall getPatternsSlangTPatternParserRuleCall_0_2_0_1_0() { return cPatternsSlangTPatternParserRuleCall_0_2_0_1_0; }
		
		//( ',' patterns+=SlangTPattern )*
		public Group getGroup_0_2_0_2() { return cGroup_0_2_0_2; }
		
		//','
		public Keyword getCommaKeyword_0_2_0_2_0() { return cCommaKeyword_0_2_0_2_0; }
		
		//patterns+=SlangTPattern
		public Assignment getPatternsAssignment_0_2_0_2_1() { return cPatternsAssignment_0_2_0_2_1; }
		
		//SlangTPattern
		public RuleCall getPatternsSlangTPatternParserRuleCall_0_2_0_2_1_0() { return cPatternsSlangTPatternParserRuleCall_0_2_0_2_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_0_2_0_3() { return cRightParenthesisKeyword_0_2_0_3; }
		
		//':' type=SlangType
		public Group getGroup_0_2_1() { return cGroup_0_2_1; }
		
		//':'
		public Keyword getColonKeyword_0_2_1_0() { return cColonKeyword_0_2_1_0; }
		
		//type=SlangType
		public Assignment getTypeAssignment_0_2_1_1() { return cTypeAssignment_0_2_1_1; }
		
		//SlangType
		public RuleCall getTypeSlangTypeParserRuleCall_0_2_1_1_0() { return cTypeSlangTypeParserRuleCall_0_2_1_1_0; }
		
		//'(' patterns+=SlangTPattern ( ',' patterns+=SlangTPattern )* ')'
		public Group getGroup_1() { return cGroup_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1_0() { return cLeftParenthesisKeyword_1_0; }
		
		//patterns+=SlangTPattern
		public Assignment getPatternsAssignment_1_1() { return cPatternsAssignment_1_1; }
		
		//SlangTPattern
		public RuleCall getPatternsSlangTPatternParserRuleCall_1_1_0() { return cPatternsSlangTPatternParserRuleCall_1_1_0; }
		
		//( ',' patterns+=SlangTPattern )*
		public Group getGroup_1_2() { return cGroup_1_2; }
		
		//','
		public Keyword getCommaKeyword_1_2_0() { return cCommaKeyword_1_2_0; }
		
		//patterns+=SlangTPattern
		public Assignment getPatternsAssignment_1_2_1() { return cPatternsAssignment_1_2_1; }
		
		//SlangTPattern
		public RuleCall getPatternsSlangTPatternParserRuleCall_1_2_1_0() { return cPatternsSlangTPatternParserRuleCall_1_2_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_1_3() { return cRightParenthesisKeyword_1_3; }
		
		//{SlangTPattern} '_' ( ':' type=SlangType )?
		public Group getGroup_2() { return cGroup_2; }
		
		//{SlangTPattern}
		public Action getSlangTPatternAction_2_0() { return cSlangTPatternAction_2_0; }
		
		//'_'
		public Keyword get_Keyword_2_1() { return c_Keyword_2_1; }
		
		//( ':' type=SlangType )?
		public Group getGroup_2_2() { return cGroup_2_2; }
		
		//':'
		public Keyword getColonKeyword_2_2_0() { return cColonKeyword_2_2_0; }
		
		//type=SlangType
		public Assignment getTypeAssignment_2_2_1() { return cTypeAssignment_2_2_1; }
		
		//SlangType
		public RuleCall getTypeSlangTypeParserRuleCall_2_2_1_0() { return cTypeSlangTypeParserRuleCall_2_2_1_0; }
	}
	public class SlangTypedVarDefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangTypedVarDef");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cSlangVarModParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cSlangPatternParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTypeNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTypeNameSlangTypeParserRuleCall_3_0 = (RuleCall)cTypeNameAssignment_3.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cInitAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cInitExprParserRuleCall_5_0 = (RuleCall)cInitAssignment_5.eContents().get(0);
		
		//SlangTypedVarDef returns SlangVarDef:
		//    SlangVarMod SlangPattern ':' typeName=SlangType ':=' init=Expr
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//SlangVarMod SlangPattern ':' typeName=SlangType ':=' init=Expr
		public Group getGroup() { return cGroup; }
		
		//SlangVarMod
		public RuleCall getSlangVarModParserRuleCall_0() { return cSlangVarModParserRuleCall_0; }
		
		//SlangPattern
		public RuleCall getSlangPatternParserRuleCall_1() { return cSlangPatternParserRuleCall_1; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//typeName=SlangType
		public Assignment getTypeNameAssignment_3() { return cTypeNameAssignment_3; }
		
		//SlangType
		public RuleCall getTypeNameSlangTypeParserRuleCall_3_0() { return cTypeNameSlangTypeParserRuleCall_3_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_4() { return cColonEqualsSignKeyword_4; }
		
		//init=Expr
		public Assignment getInitAssignment_5() { return cInitAssignment_5; }
		
		//Expr
		public RuleCall getInitExprParserRuleCall_5_0() { return cInitExprParserRuleCall_5_0; }
	}
	public class SlangVarDefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangVarDef");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cSlangVarModParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cSlangPatternParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cColonKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cTypeNameAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cTypeNameSlangTypeParserRuleCall_2_1_0 = (RuleCall)cTypeNameAssignment_2_1.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cInitAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cInitExprParserRuleCall_4_0 = (RuleCall)cInitAssignment_4.eContents().get(0);
		
		//SlangVarDef: SlangVarMod SlangPattern ( ':' typeName=SlangType )? ':=' init=Expr ;
		@Override public ParserRule getRule() { return rule; }
		
		//SlangVarMod SlangPattern ( ':' typeName=SlangType )? ':=' init=Expr
		public Group getGroup() { return cGroup; }
		
		//SlangVarMod
		public RuleCall getSlangVarModParserRuleCall_0() { return cSlangVarModParserRuleCall_0; }
		
		//SlangPattern
		public RuleCall getSlangPatternParserRuleCall_1() { return cSlangPatternParserRuleCall_1; }
		
		//( ':' typeName=SlangType )?
		public Group getGroup_2() { return cGroup_2; }
		
		//':'
		public Keyword getColonKeyword_2_0() { return cColonKeyword_2_0; }
		
		//typeName=SlangType
		public Assignment getTypeNameAssignment_2_1() { return cTypeNameAssignment_2_1; }
		
		//SlangType
		public RuleCall getTypeNameSlangTypeParserRuleCall_2_1_0() { return cTypeNameSlangTypeParserRuleCall_2_1_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//init=Expr
		public Assignment getInitAssignment_4() { return cInitAssignment_4; }
		
		//Expr
		public RuleCall getInitExprParserRuleCall_4_0() { return cInitExprParserRuleCall_4_0; }
	}
	public class SlangVarDeclDefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangVarDeclDef");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cSlangVarModParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cSpecKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cColonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTypeNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTypeNameSlangTypeParserRuleCall_4_0 = (RuleCall)cTypeNameAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cColonEqualsSignKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cInitAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cInitExprParserRuleCall_5_1_0 = (RuleCall)cInitAssignment_5_1.eContents().get(0);
		
		//SlangVarDeclDef returns SlangVarDef:
		//    SlangVarMod 'spec'? name=ID ':' typeName=SlangType ( ':=' init=Expr )?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//SlangVarMod 'spec'? name=ID ':' typeName=SlangType ( ':=' init=Expr )?
		public Group getGroup() { return cGroup; }
		
		//SlangVarMod
		public RuleCall getSlangVarModParserRuleCall_0() { return cSlangVarModParserRuleCall_0; }
		
		//'spec'?
		public Keyword getSpecKeyword_1() { return cSpecKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//':'
		public Keyword getColonKeyword_3() { return cColonKeyword_3; }
		
		//typeName=SlangType
		public Assignment getTypeNameAssignment_4() { return cTypeNameAssignment_4; }
		
		//SlangType
		public RuleCall getTypeNameSlangTypeParserRuleCall_4_0() { return cTypeNameSlangTypeParserRuleCall_4_0; }
		
		//( ':=' init=Expr )?
		public Group getGroup_5() { return cGroup_5; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_5_0() { return cColonEqualsSignKeyword_5_0; }
		
		//init=Expr
		public Assignment getInitAssignment_5_1() { return cInitAssignment_5_1; }
		
		//Expr
		public RuleCall getInitExprParserRuleCall_5_1_0() { return cInitExprParserRuleCall_5_1_0; }
	}
	public class SlangVarModElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangVarMod");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cValKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cVarKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//SlangVarMod: 'val' | 'var' ;
		@Override public ParserRule getRule() { return rule; }
		
		//'val' | 'var'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'val'
		public Keyword getValKeyword_0() { return cValKeyword_0; }
		
		//'var'
		public Keyword getVarKeyword_1() { return cVarKeyword_1; }
	}
	public class ExprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.Expr");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Assignment cTermAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final RuleCall cTermSlangAccessParserRuleCall_0_0_0 = (RuleCall)cTermAssignment_0_0.eContents().get(0);
		private final Alternatives cAlternatives_0_1 = (Alternatives)cGroup_0.eContents().get(1);
		private final Group cGroup_0_1_0 = (Group)cAlternatives_0_1.eContents().get(0);
		private final RuleCall cOperatorParserRuleCall_0_1_0_0 = (RuleCall)cGroup_0_1_0.eContents().get(0);
		private final Assignment cTermAssignment_0_1_0_1 = (Assignment)cGroup_0_1_0.eContents().get(1);
		private final RuleCall cTermSlangAccessParserRuleCall_0_1_0_1_0 = (RuleCall)cTermAssignment_0_1_0_1.eContents().get(0);
		private final Group cGroup_0_1_1 = (Group)cAlternatives_0_1.eContents().get(1);
		private final Keyword cQuestionMarkKeyword_0_1_1_0 = (Keyword)cGroup_0_1_1.eContents().get(0);
		private final Assignment cThenExprAssignment_0_1_1_1 = (Assignment)cGroup_0_1_1.eContents().get(1);
		private final RuleCall cThenExprExprParserRuleCall_0_1_1_1_0 = (RuleCall)cThenExprAssignment_0_1_1_1.eContents().get(0);
		private final Keyword cColonKeyword_0_1_1_2 = (Keyword)cGroup_0_1_1.eContents().get(2);
		private final Assignment cElseExprAssignment_0_1_1_3 = (Assignment)cGroup_0_1_1.eContents().get(3);
		private final RuleCall cElseExprExprParserRuleCall_0_1_1_3_0 = (RuleCall)cElseExprAssignment_0_1_1_3.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Alternatives cAlternatives_1_0 = (Alternatives)cGroup_1.eContents().get(0);
		private final Keyword cAllKeyword_1_0_0 = (Keyword)cAlternatives_1_0.eContents().get(0);
		private final Keyword cSomeKeyword_1_0_1 = (Keyword)cAlternatives_1_0.eContents().get(1);
		private final Keyword cForAllKeyword_1_0_2 = (Keyword)cAlternatives_1_0.eContents().get(2);
		private final Keyword cThereExistsKeyword_1_0_3 = (Keyword)cAlternatives_1_0.eContents().get(3);
		private final Assignment cQVarAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cQVarSlangQuantVarParserRuleCall_1_1_0 = (RuleCall)cQVarAssignment_1_1.eContents().get(0);
		private final Group cGroup_1_2 = (Group)cGroup_1.eContents().get(2);
		private final Keyword cCommaKeyword_1_2_0 = (Keyword)cGroup_1_2.eContents().get(0);
		private final Assignment cQVarAssignment_1_2_1 = (Assignment)cGroup_1_2.eContents().get(1);
		private final RuleCall cQVarSlangQuantVarParserRuleCall_1_2_1_0 = (RuleCall)cQVarAssignment_1_2_1.eContents().get(0);
		private final Keyword cEqualsSignGreaterThanSignKeyword_1_3 = (Keyword)cGroup_1.eContents().get(3);
		private final Assignment cQuantifiedExprAssignment_1_4 = (Assignment)cGroup_1.eContents().get(4);
		private final RuleCall cQuantifiedExprExprParserRuleCall_1_4_0 = (RuleCall)cQuantifiedExprAssignment_1_4.eContents().get(0);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final RuleCall cOperatorParserRuleCall_2_0 = (RuleCall)cGroup_2.eContents().get(0);
		private final RuleCall cSlangAccessParserRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		
		//Expr
		//    : term+=SlangAccess (
		//      ( Operator term+=SlangAccess )*
		//      | '?' thenExpr=Expr ':' elseExpr=Expr
		//      )
		//    | ( '\\all' | '\\some' | '∀' | '∃' ) qVar+=SlangQuantVar ( ',' qVar+=SlangQuantVar )* '=>' quantifiedExpr=Expr
		//    | Operator SlangAccess
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//term+=SlangAccess (
		//     ( Operator term+=SlangAccess )*
		//     | '?' thenExpr=Expr ':' elseExpr=Expr
		//     )
		//   | ( '\\all' | '\\some' | '∀' | '∃' ) qVar+=SlangQuantVar ( ',' qVar+=SlangQuantVar )* '=>' quantifiedExpr=Expr
		//   | Operator SlangAccess
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//term+=SlangAccess (
		//     ( Operator term+=SlangAccess )*
		//     | '?' thenExpr=Expr ':' elseExpr=Expr
		//     )
		public Group getGroup_0() { return cGroup_0; }
		
		//term+=SlangAccess
		public Assignment getTermAssignment_0_0() { return cTermAssignment_0_0; }
		
		//SlangAccess
		public RuleCall getTermSlangAccessParserRuleCall_0_0_0() { return cTermSlangAccessParserRuleCall_0_0_0; }
		
		//(
		//     ( Operator term+=SlangAccess )*
		//     | '?' thenExpr=Expr ':' elseExpr=Expr
		//     )
		public Alternatives getAlternatives_0_1() { return cAlternatives_0_1; }
		
		//( Operator term+=SlangAccess )*
		public Group getGroup_0_1_0() { return cGroup_0_1_0; }
		
		//Operator
		public RuleCall getOperatorParserRuleCall_0_1_0_0() { return cOperatorParserRuleCall_0_1_0_0; }
		
		//term+=SlangAccess
		public Assignment getTermAssignment_0_1_0_1() { return cTermAssignment_0_1_0_1; }
		
		//SlangAccess
		public RuleCall getTermSlangAccessParserRuleCall_0_1_0_1_0() { return cTermSlangAccessParserRuleCall_0_1_0_1_0; }
		
		//'?' thenExpr=Expr ':' elseExpr=Expr
		public Group getGroup_0_1_1() { return cGroup_0_1_1; }
		
		//'?'
		public Keyword getQuestionMarkKeyword_0_1_1_0() { return cQuestionMarkKeyword_0_1_1_0; }
		
		//thenExpr=Expr
		public Assignment getThenExprAssignment_0_1_1_1() { return cThenExprAssignment_0_1_1_1; }
		
		//Expr
		public RuleCall getThenExprExprParserRuleCall_0_1_1_1_0() { return cThenExprExprParserRuleCall_0_1_1_1_0; }
		
		//':'
		public Keyword getColonKeyword_0_1_1_2() { return cColonKeyword_0_1_1_2; }
		
		//elseExpr=Expr
		public Assignment getElseExprAssignment_0_1_1_3() { return cElseExprAssignment_0_1_1_3; }
		
		//Expr
		public RuleCall getElseExprExprParserRuleCall_0_1_1_3_0() { return cElseExprExprParserRuleCall_0_1_1_3_0; }
		
		//( '\\all' | '\\some' | '∀' | '∃' ) qVar+=SlangQuantVar ( ',' qVar+=SlangQuantVar )* '=>' quantifiedExpr=Expr
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
		
		//qVar+=SlangQuantVar
		public Assignment getQVarAssignment_1_1() { return cQVarAssignment_1_1; }
		
		//SlangQuantVar
		public RuleCall getQVarSlangQuantVarParserRuleCall_1_1_0() { return cQVarSlangQuantVarParserRuleCall_1_1_0; }
		
		//( ',' qVar+=SlangQuantVar )*
		public Group getGroup_1_2() { return cGroup_1_2; }
		
		//','
		public Keyword getCommaKeyword_1_2_0() { return cCommaKeyword_1_2_0; }
		
		//qVar+=SlangQuantVar
		public Assignment getQVarAssignment_1_2_1() { return cQVarAssignment_1_2_1; }
		
		//SlangQuantVar
		public RuleCall getQVarSlangQuantVarParserRuleCall_1_2_1_0() { return cQVarSlangQuantVarParserRuleCall_1_2_1_0; }
		
		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_1_3() { return cEqualsSignGreaterThanSignKeyword_1_3; }
		
		//quantifiedExpr=Expr
		public Assignment getQuantifiedExprAssignment_1_4() { return cQuantifiedExprAssignment_1_4; }
		
		//Expr
		public RuleCall getQuantifiedExprExprParserRuleCall_1_4_0() { return cQuantifiedExprExprParserRuleCall_1_4_0; }
		
		//Operator SlangAccess
		public Group getGroup_2() { return cGroup_2; }
		
		//Operator
		public RuleCall getOperatorParserRuleCall_2_0() { return cOperatorParserRuleCall_2_0; }
		
		//SlangAccess
		public RuleCall getSlangAccessParserRuleCall_2_1() { return cSlangAccessParserRuleCall_2_1; }
	}
	public class SlangQuantVarElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangQuantVar");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cEAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cEExprParserRuleCall_2_0 = (RuleCall)cEAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Alternatives cAlternatives_3_0 = (Alternatives)cGroup_3.eContents().get(0);
		private final Keyword cFullStopFullStopKeyword_3_0_0 = (Keyword)cAlternatives_3_0.eContents().get(0);
		private final Keyword cFullStopFullStopLessThanSignKeyword_3_0_1 = (Keyword)cAlternatives_3_0.eContents().get(1);
		private final Assignment cUpperBoundAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cUpperBoundExprParserRuleCall_3_1_0 = (RuleCall)cUpperBoundAssignment_3_1.eContents().get(0);
		
		//SlangQuantVar: ID ':' e=Expr ( ( '..' | '..<' ) upperBound=Expr )? ;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ':' e=Expr ( ( '..' | '..<' ) upperBound=Expr )?
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//e=Expr
		public Assignment getEAssignment_2() { return cEAssignment_2; }
		
		//Expr
		public RuleCall getEExprParserRuleCall_2_0() { return cEExprParserRuleCall_2_0; }
		
		//( ( '..' | '..<' ) upperBound=Expr )?
		public Group getGroup_3() { return cGroup_3; }
		
		//( '..' | '..<' )
		public Alternatives getAlternatives_3_0() { return cAlternatives_3_0; }
		
		//'..'
		public Keyword getFullStopFullStopKeyword_3_0_0() { return cFullStopFullStopKeyword_3_0_0; }
		
		//'..<'
		public Keyword getFullStopFullStopLessThanSignKeyword_3_0_1() { return cFullStopFullStopLessThanSignKeyword_3_0_1; }
		
		//upperBound=Expr
		public Assignment getUpperBoundAssignment_3_1() { return cUpperBoundAssignment_3_1; }
		
		//Expr
		public RuleCall getUpperBoundExprParserRuleCall_3_1_0() { return cUpperBoundExprParserRuleCall_3_1_0; }
	}
	public class SlangBlockElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangBlock");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSlangBlockAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cStmtsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cStmtsSlangStmtParserRuleCall_2_0 = (RuleCall)cStmtsAssignment_2.eContents().get(0);
		private final Assignment cRAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cRSlangRetParserRuleCall_3_0 = (RuleCall)cRAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//SlangBlock: {SlangBlock} '{' stmts+=SlangStmt* r=SlangRet? '}' ;
		@Override public ParserRule getRule() { return rule; }
		
		//{SlangBlock} '{' stmts+=SlangStmt* r=SlangRet? '}'
		public Group getGroup() { return cGroup; }
		
		//{SlangBlock}
		public Action getSlangBlockAction_0() { return cSlangBlockAction_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//stmts+=SlangStmt*
		public Assignment getStmtsAssignment_2() { return cStmtsAssignment_2; }
		
		//SlangStmt
		public RuleCall getStmtsSlangStmtParserRuleCall_2_0() { return cStmtsSlangStmtParserRuleCall_2_0; }
		
		//r=SlangRet?
		public Assignment getRAssignment_3() { return cRAssignment_3; }
		
		//SlangRet
		public RuleCall getRSlangRetParserRuleCall_3_0() { return cRSlangRetParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class SlangAccessElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangAccess");
		private final Assignment cTAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cTSlangTermParserRuleCall_0 = (RuleCall)cTAssignment.eContents().get(0);
		
		//SlangAccess returns Expr: t=SlangTerm ;
		@Override public ParserRule getRule() { return rule; }
		
		//t=SlangTerm
		public Assignment getTAssignment() { return cTAssignment; }
		
		//SlangTerm
		public RuleCall getTSlangTermParserRuleCall_0() { return cTSlangTermParserRuleCall_0; }
	}
	public class SlangTermElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangTerm");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cSlangLitTermAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final RuleCall cSlangLitParserRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cSlangInterpTermAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cIAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cISlangInterpParserRuleCall_1_1_0 = (RuleCall)cIAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Group cGroup_2_0 = (Group)cGroup_2.eContents().get(0);
		private final Group cGroup_2_0_0 = (Group)cGroup_2_0.eContents().get(0);
		private final Action cEnumLitExprAction_2_0_0_0 = (Action)cGroup_2_0_0.eContents().get(0);
		private final Keyword cEnumKeyword_2_0_0_1 = (Keyword)cGroup_2_0_0.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_2_0_0_2 = (Keyword)cGroup_2_0_0.eContents().get(2);
		private final Assignment cEnumTypeAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cEnumTypeDataElementParserRuleCall_2_1_0 = (RuleCall)cEnumTypeAssignment_2_1.eContents().get(0);
		private final Keyword cCommaKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		private final Assignment cValueAssignment_2_3 = (Assignment)cGroup_2.eContents().get(3);
		private final CrossReference cValueStringLiteralCrossReference_2_3_0 = (CrossReference)cValueAssignment_2_3.eContents().get(0);
		private final RuleCall cValueStringLiteralIDTerminalRuleCall_2_3_0_1 = (RuleCall)cValueStringLiteralCrossReference_2_3_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_2_4 = (Keyword)cGroup_2.eContents().get(4);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cGroup_3.eContents().get(0);
		private final Group cGroup_3_0_0 = (Group)cGroup_3_0.eContents().get(0);
		private final Action cRecordLitExprAction_3_0_0_0 = (Action)cGroup_3_0_0.eContents().get(0);
		private final Assignment cRecordTypeAssignment_3_0_0_1 = (Assignment)cGroup_3_0_0.eContents().get(1);
		private final RuleCall cRecordTypeDataElementParserRuleCall_3_0_0_1_0 = (RuleCall)cRecordTypeAssignment_3_0_0_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3_0_0_2 = (Keyword)cGroup_3_0_0.eContents().get(2);
		private final Assignment cArgsAssignment_3_0_0_3 = (Assignment)cGroup_3_0_0.eContents().get(3);
		private final CrossReference cArgsNamedElementCrossReference_3_0_0_3_0 = (CrossReference)cArgsAssignment_3_0_0_3.eContents().get(0);
		private final RuleCall cArgsNamedElementIDTerminalRuleCall_3_0_0_3_0_1 = (RuleCall)cArgsNamedElementCrossReference_3_0_0_3_0.eContents().get(1);
		private final Keyword cEqualsSignKeyword_3_0_0_4 = (Keyword)cGroup_3_0_0.eContents().get(4);
		private final Assignment cArgExprAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cArgExprExprParserRuleCall_3_1_0 = (RuleCall)cArgExprAssignment_3_1.eContents().get(0);
		private final Group cGroup_3_2 = (Group)cGroup_3.eContents().get(2);
		private final Keyword cSemicolonKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Assignment cArgsAssignment_3_2_1 = (Assignment)cGroup_3_2.eContents().get(1);
		private final CrossReference cArgsNamedElementCrossReference_3_2_1_0 = (CrossReference)cArgsAssignment_3_2_1.eContents().get(0);
		private final RuleCall cArgsNamedElementIDTerminalRuleCall_3_2_1_0_1 = (RuleCall)cArgsNamedElementCrossReference_3_2_1_0.eContents().get(1);
		private final Keyword cEqualsSignKeyword_3_2_2 = (Keyword)cGroup_3_2.eContents().get(2);
		private final Assignment cArgExprAssignment_3_2_3 = (Assignment)cGroup_3_2.eContents().get(3);
		private final RuleCall cArgExprExprParserRuleCall_3_2_3_0 = (RuleCall)cArgExprAssignment_3_2_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3_3 = (Keyword)cGroup_3.eContents().get(3);
		private final Group cGroup_4 = (Group)cAlternatives.eContents().get(4);
		private final Action cDataRefExprAction_4_0 = (Action)cGroup_4.eContents().get(0);
		private final Assignment cPortOrSubcomponentOrStateVarAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cPortOrSubcomponentOrStateVarEObjectCrossReference_4_1_0 = (CrossReference)cPortOrSubcomponentOrStateVarAssignment_4_1.eContents().get(0);
		private final RuleCall cPortOrSubcomponentOrStateVarEObjectIDTerminalRuleCall_4_1_0_1 = (RuleCall)cPortOrSubcomponentOrStateVarEObjectCrossReference_4_1_0.eContents().get(1);
		private final Group cGroup_4_2 = (Group)cGroup_4.eContents().get(2);
		private final Keyword cFullStopKeyword_4_2_0 = (Keyword)cGroup_4_2.eContents().get(0);
		private final Assignment cRefAssignment_4_2_1 = (Assignment)cGroup_4_2.eContents().get(1);
		private final RuleCall cRefOtherDataRefParserRuleCall_4_2_1_0 = (RuleCall)cRefAssignment_4_2_1.eContents().get(0);
		private final Assignment cCsAssignment_4_3 = (Assignment)cGroup_4.eContents().get(3);
		private final RuleCall cCsSlangCallSuffixParserRuleCall_4_3_0 = (RuleCall)cCsAssignment_4_3.eContents().get(0);
		private final Group cGroup_5 = (Group)cAlternatives.eContents().get(5);
		private final Action cSlangTupleTermAction_5_0 = (Action)cGroup_5.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_5_1 = (Keyword)cGroup_5.eContents().get(1);
		private final Assignment cEAssignment_5_2 = (Assignment)cGroup_5.eContents().get(2);
		private final RuleCall cEExprParserRuleCall_5_2_0 = (RuleCall)cEAssignment_5_2.eContents().get(0);
		private final Group cGroup_5_3 = (Group)cGroup_5.eContents().get(3);
		private final Keyword cCommaKeyword_5_3_0 = (Keyword)cGroup_5_3.eContents().get(0);
		private final Assignment cEAssignment_5_3_1 = (Assignment)cGroup_5_3.eContents().get(1);
		private final RuleCall cEExprParserRuleCall_5_3_1_0 = (RuleCall)cEAssignment_5_3_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_5_4 = (Keyword)cGroup_5.eContents().get(4);
		private final Group cGroup_6 = (Group)cAlternatives.eContents().get(6);
		private final Action cSlangForTermAction_6_0 = (Action)cGroup_6.eContents().get(0);
		private final Keyword cForKeyword_6_1 = (Keyword)cGroup_6.eContents().get(1);
		private final Assignment cRAssignment_6_2 = (Assignment)cGroup_6.eContents().get(2);
		private final RuleCall cRSlangForRangeParserRuleCall_6_2_0 = (RuleCall)cRAssignment_6_2.eContents().get(0);
		private final Group cGroup_6_3 = (Group)cGroup_6.eContents().get(3);
		private final Keyword cCommaKeyword_6_3_0 = (Keyword)cGroup_6_3.eContents().get(0);
		private final Assignment cRAssignment_6_3_1 = (Assignment)cGroup_6_3.eContents().get(1);
		private final RuleCall cRSlangForRangeParserRuleCall_6_3_1_0 = (RuleCall)cRAssignment_6_3_1.eContents().get(0);
		private final Keyword cYieldKeyword_6_4 = (Keyword)cGroup_6.eContents().get(4);
		private final Alternatives cAlternatives_6_5 = (Alternatives)cGroup_6.eContents().get(5);
		private final Assignment cBAssignment_6_5_0 = (Assignment)cAlternatives_6_5.eContents().get(0);
		private final RuleCall cBSlangBlockParserRuleCall_6_5_0_0 = (RuleCall)cBAssignment_6_5_0.eContents().get(0);
		private final Group cGroup_6_5_1 = (Group)cAlternatives_6_5.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_6_5_1_0 = (Keyword)cGroup_6_5_1.eContents().get(0);
		private final Assignment cEAssignment_6_5_1_1 = (Assignment)cGroup_6_5_1.eContents().get(1);
		private final RuleCall cEExprParserRuleCall_6_5_1_1_0 = (RuleCall)cEAssignment_6_5_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_6_5_1_2 = (Keyword)cGroup_6_5_1.eContents().get(2);
		private final Group cGroup_7 = (Group)cAlternatives.eContents().get(7);
		private final Action cSlangBlockTermAction_7_0 = (Action)cGroup_7.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_7_1 = (Keyword)cGroup_7.eContents().get(1);
		private final Alternatives cAlternatives_7_2 = (Alternatives)cGroup_7.eContents().get(2);
		private final Group cGroup_7_2_0 = (Group)cAlternatives_7_2.eContents().get(0);
		private final Group cGroup_7_2_0_0 = (Group)cGroup_7_2_0.eContents().get(0);
		private final Assignment cPAssignment_7_2_0_0_0 = (Assignment)cGroup_7_2_0_0.eContents().get(0);
		private final RuleCall cPSlangParamsParserRuleCall_7_2_0_0_0_0 = (RuleCall)cPAssignment_7_2_0_0_0.eContents().get(0);
		private final Keyword cEqualsSignGreaterThanSignKeyword_7_2_0_0_1 = (Keyword)cGroup_7_2_0_0.eContents().get(1);
		private final Assignment cEAssignment_7_2_0_1 = (Assignment)cGroup_7_2_0.eContents().get(1);
		private final RuleCall cEExprParserRuleCall_7_2_0_1_0 = (RuleCall)cEAssignment_7_2_0_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7_2_0_2 = (Keyword)cGroup_7_2_0.eContents().get(2);
		private final Group cGroup_7_2_1 = (Group)cAlternatives_7_2.eContents().get(1);
		private final Assignment cStmtAssignment_7_2_1_0 = (Assignment)cGroup_7_2_1.eContents().get(0);
		private final RuleCall cStmtSlangStmtParserRuleCall_7_2_1_0_0 = (RuleCall)cStmtAssignment_7_2_1_0.eContents().get(0);
		private final Assignment cRAssignment_7_2_1_1 = (Assignment)cGroup_7_2_1.eContents().get(1);
		private final RuleCall cRSlangRetParserRuleCall_7_2_1_1_0 = (RuleCall)cRAssignment_7_2_1_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7_2_1_2 = (Keyword)cGroup_7_2_1.eContents().get(2);
		
		////suf+=SlangAccessSuffix* ;
		////SlangAccessSuffix: {SlangAccessSuffix} '.' ID cs=SlangCallSuffix? ;
		//SlangTerm returns Expr
		//    : {SlangLitTerm} SlangLit
		//    | {SlangInterpTerm} i=SlangInterp
		//    | => ({EnumLitExpr} 'enum' '(') enumType=DataElement ',' value=[aadl2::StringLiteral|ID] ')'
		//    | => ({RecordLitExpr} recordType=DataElement '{' args+=[aadl2::NamedElement|ID] '=') argExpr+=Expr (';' args+=[aadl2::NamedElement|ID] '=' argExpr+=Expr)* '}'
		//    | {DataRefExpr} portOrSubcomponentOrStateVar=[ecore::EObject|ID] ('.' ref=OtherDataRef)? cs=SlangCallSuffix?
		//    | {SlangTupleTerm} '(' e+=Expr ( ',' e+=Expr )*  ')'
		//    | {SlangForTerm} 'for' r+=SlangForRange ( ',' r+=SlangForRange )*  'yield' ( b=SlangBlock |  '(' e=Expr ')' )
		//    | {SlangBlockTerm} '{'
		//       ( (p=SlangParams '=>')? e=Expr '}'
		//        | stmt+=SlangStmt* r=SlangRet? '}'
		//       )
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//{SlangLitTerm} SlangLit
		//   | {SlangInterpTerm} i=SlangInterp
		//   | => ({EnumLitExpr} 'enum' '(') enumType=DataElement ',' value=[aadl2::StringLiteral|ID] ')'
		//   | => ({RecordLitExpr} recordType=DataElement '{' args+=[aadl2::NamedElement|ID] '=') argExpr+=Expr (';' args+=[aadl2::NamedElement|ID] '=' argExpr+=Expr)* '}'
		//   | {DataRefExpr} portOrSubcomponentOrStateVar=[ecore::EObject|ID] ('.' ref=OtherDataRef)? cs=SlangCallSuffix?
		//   | {SlangTupleTerm} '(' e+=Expr ( ',' e+=Expr )*  ')'
		//   | {SlangForTerm} 'for' r+=SlangForRange ( ',' r+=SlangForRange )*  'yield' ( b=SlangBlock |  '(' e=Expr ')' )
		//   | {SlangBlockTerm} '{'
		//      ( (p=SlangParams '=>')? e=Expr '}'
		//       | stmt+=SlangStmt* r=SlangRet? '}'
		//      )
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{SlangLitTerm} SlangLit
		public Group getGroup_0() { return cGroup_0; }
		
		//{SlangLitTerm}
		public Action getSlangLitTermAction_0_0() { return cSlangLitTermAction_0_0; }
		
		//SlangLit
		public RuleCall getSlangLitParserRuleCall_0_1() { return cSlangLitParserRuleCall_0_1; }
		
		//{SlangInterpTerm} i=SlangInterp
		public Group getGroup_1() { return cGroup_1; }
		
		//{SlangInterpTerm}
		public Action getSlangInterpTermAction_1_0() { return cSlangInterpTermAction_1_0; }
		
		//i=SlangInterp
		public Assignment getIAssignment_1_1() { return cIAssignment_1_1; }
		
		//SlangInterp
		public RuleCall getISlangInterpParserRuleCall_1_1_0() { return cISlangInterpParserRuleCall_1_1_0; }
		
		//=> ({EnumLitExpr} 'enum' '(') enumType=DataElement ',' value=[aadl2::StringLiteral|ID] ')'
		public Group getGroup_2() { return cGroup_2; }
		
		//=> ({EnumLitExpr} 'enum' '(')
		public Group getGroup_2_0() { return cGroup_2_0; }
		
		//{EnumLitExpr} 'enum' '('
		public Group getGroup_2_0_0() { return cGroup_2_0_0; }
		
		//{EnumLitExpr}
		public Action getEnumLitExprAction_2_0_0_0() { return cEnumLitExprAction_2_0_0_0; }
		
		//'enum'
		public Keyword getEnumKeyword_2_0_0_1() { return cEnumKeyword_2_0_0_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2_0_0_2() { return cLeftParenthesisKeyword_2_0_0_2; }
		
		//enumType=DataElement
		public Assignment getEnumTypeAssignment_2_1() { return cEnumTypeAssignment_2_1; }
		
		//DataElement
		public RuleCall getEnumTypeDataElementParserRuleCall_2_1_0() { return cEnumTypeDataElementParserRuleCall_2_1_0; }
		
		//','
		public Keyword getCommaKeyword_2_2() { return cCommaKeyword_2_2; }
		
		//value=[aadl2::StringLiteral|ID]
		public Assignment getValueAssignment_2_3() { return cValueAssignment_2_3; }
		
		//[aadl2::StringLiteral|ID]
		public CrossReference getValueStringLiteralCrossReference_2_3_0() { return cValueStringLiteralCrossReference_2_3_0; }
		
		//ID
		public RuleCall getValueStringLiteralIDTerminalRuleCall_2_3_0_1() { return cValueStringLiteralIDTerminalRuleCall_2_3_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2_4() { return cRightParenthesisKeyword_2_4; }
		
		//=> ({RecordLitExpr} recordType=DataElement '{' args+=[aadl2::NamedElement|ID] '=') argExpr+=Expr (';' args+=[aadl2::NamedElement|ID] '=' argExpr+=Expr)* '}'
		public Group getGroup_3() { return cGroup_3; }
		
		//=> ({RecordLitExpr} recordType=DataElement '{' args+=[aadl2::NamedElement|ID] '=')
		public Group getGroup_3_0() { return cGroup_3_0; }
		
		//{RecordLitExpr} recordType=DataElement '{' args+=[aadl2::NamedElement|ID] '='
		public Group getGroup_3_0_0() { return cGroup_3_0_0; }
		
		//{RecordLitExpr}
		public Action getRecordLitExprAction_3_0_0_0() { return cRecordLitExprAction_3_0_0_0; }
		
		//recordType=DataElement
		public Assignment getRecordTypeAssignment_3_0_0_1() { return cRecordTypeAssignment_3_0_0_1; }
		
		//DataElement
		public RuleCall getRecordTypeDataElementParserRuleCall_3_0_0_1_0() { return cRecordTypeDataElementParserRuleCall_3_0_0_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3_0_0_2() { return cLeftCurlyBracketKeyword_3_0_0_2; }
		
		//args+=[aadl2::NamedElement|ID]
		public Assignment getArgsAssignment_3_0_0_3() { return cArgsAssignment_3_0_0_3; }
		
		//[aadl2::NamedElement|ID]
		public CrossReference getArgsNamedElementCrossReference_3_0_0_3_0() { return cArgsNamedElementCrossReference_3_0_0_3_0; }
		
		//ID
		public RuleCall getArgsNamedElementIDTerminalRuleCall_3_0_0_3_0_1() { return cArgsNamedElementIDTerminalRuleCall_3_0_0_3_0_1; }
		
		//'='
		public Keyword getEqualsSignKeyword_3_0_0_4() { return cEqualsSignKeyword_3_0_0_4; }
		
		//argExpr+=Expr
		public Assignment getArgExprAssignment_3_1() { return cArgExprAssignment_3_1; }
		
		//Expr
		public RuleCall getArgExprExprParserRuleCall_3_1_0() { return cArgExprExprParserRuleCall_3_1_0; }
		
		//(';' args+=[aadl2::NamedElement|ID] '=' argExpr+=Expr)*
		public Group getGroup_3_2() { return cGroup_3_2; }
		
		//';'
		public Keyword getSemicolonKeyword_3_2_0() { return cSemicolonKeyword_3_2_0; }
		
		//args+=[aadl2::NamedElement|ID]
		public Assignment getArgsAssignment_3_2_1() { return cArgsAssignment_3_2_1; }
		
		//[aadl2::NamedElement|ID]
		public CrossReference getArgsNamedElementCrossReference_3_2_1_0() { return cArgsNamedElementCrossReference_3_2_1_0; }
		
		//ID
		public RuleCall getArgsNamedElementIDTerminalRuleCall_3_2_1_0_1() { return cArgsNamedElementIDTerminalRuleCall_3_2_1_0_1; }
		
		//'='
		public Keyword getEqualsSignKeyword_3_2_2() { return cEqualsSignKeyword_3_2_2; }
		
		//argExpr+=Expr
		public Assignment getArgExprAssignment_3_2_3() { return cArgExprAssignment_3_2_3; }
		
		//Expr
		public RuleCall getArgExprExprParserRuleCall_3_2_3_0() { return cArgExprExprParserRuleCall_3_2_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3_3() { return cRightCurlyBracketKeyword_3_3; }
		
		//{DataRefExpr} portOrSubcomponentOrStateVar=[ecore::EObject|ID] ('.' ref=OtherDataRef)? cs=SlangCallSuffix?
		public Group getGroup_4() { return cGroup_4; }
		
		//{DataRefExpr}
		public Action getDataRefExprAction_4_0() { return cDataRefExprAction_4_0; }
		
		//portOrSubcomponentOrStateVar=[ecore::EObject|ID]
		public Assignment getPortOrSubcomponentOrStateVarAssignment_4_1() { return cPortOrSubcomponentOrStateVarAssignment_4_1; }
		
		//[ecore::EObject|ID]
		public CrossReference getPortOrSubcomponentOrStateVarEObjectCrossReference_4_1_0() { return cPortOrSubcomponentOrStateVarEObjectCrossReference_4_1_0; }
		
		//ID
		public RuleCall getPortOrSubcomponentOrStateVarEObjectIDTerminalRuleCall_4_1_0_1() { return cPortOrSubcomponentOrStateVarEObjectIDTerminalRuleCall_4_1_0_1; }
		
		//('.' ref=OtherDataRef)?
		public Group getGroup_4_2() { return cGroup_4_2; }
		
		//'.'
		public Keyword getFullStopKeyword_4_2_0() { return cFullStopKeyword_4_2_0; }
		
		//ref=OtherDataRef
		public Assignment getRefAssignment_4_2_1() { return cRefAssignment_4_2_1; }
		
		//OtherDataRef
		public RuleCall getRefOtherDataRefParserRuleCall_4_2_1_0() { return cRefOtherDataRefParserRuleCall_4_2_1_0; }
		
		//cs=SlangCallSuffix?
		public Assignment getCsAssignment_4_3() { return cCsAssignment_4_3; }
		
		//SlangCallSuffix
		public RuleCall getCsSlangCallSuffixParserRuleCall_4_3_0() { return cCsSlangCallSuffixParserRuleCall_4_3_0; }
		
		//{SlangTupleTerm} '(' e+=Expr ( ',' e+=Expr )*  ')'
		public Group getGroup_5() { return cGroup_5; }
		
		//{SlangTupleTerm}
		public Action getSlangTupleTermAction_5_0() { return cSlangTupleTermAction_5_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_5_1() { return cLeftParenthesisKeyword_5_1; }
		
		//e+=Expr
		public Assignment getEAssignment_5_2() { return cEAssignment_5_2; }
		
		//Expr
		public RuleCall getEExprParserRuleCall_5_2_0() { return cEExprParserRuleCall_5_2_0; }
		
		//( ',' e+=Expr )*
		public Group getGroup_5_3() { return cGroup_5_3; }
		
		//','
		public Keyword getCommaKeyword_5_3_0() { return cCommaKeyword_5_3_0; }
		
		//e+=Expr
		public Assignment getEAssignment_5_3_1() { return cEAssignment_5_3_1; }
		
		//Expr
		public RuleCall getEExprParserRuleCall_5_3_1_0() { return cEExprParserRuleCall_5_3_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_5_4() { return cRightParenthesisKeyword_5_4; }
		
		//{SlangForTerm} 'for' r+=SlangForRange ( ',' r+=SlangForRange )*  'yield' ( b=SlangBlock |  '(' e=Expr ')' )
		public Group getGroup_6() { return cGroup_6; }
		
		//{SlangForTerm}
		public Action getSlangForTermAction_6_0() { return cSlangForTermAction_6_0; }
		
		//'for'
		public Keyword getForKeyword_6_1() { return cForKeyword_6_1; }
		
		//r+=SlangForRange
		public Assignment getRAssignment_6_2() { return cRAssignment_6_2; }
		
		//SlangForRange
		public RuleCall getRSlangForRangeParserRuleCall_6_2_0() { return cRSlangForRangeParserRuleCall_6_2_0; }
		
		//( ',' r+=SlangForRange )*
		public Group getGroup_6_3() { return cGroup_6_3; }
		
		//','
		public Keyword getCommaKeyword_6_3_0() { return cCommaKeyword_6_3_0; }
		
		//r+=SlangForRange
		public Assignment getRAssignment_6_3_1() { return cRAssignment_6_3_1; }
		
		//SlangForRange
		public RuleCall getRSlangForRangeParserRuleCall_6_3_1_0() { return cRSlangForRangeParserRuleCall_6_3_1_0; }
		
		//'yield'
		public Keyword getYieldKeyword_6_4() { return cYieldKeyword_6_4; }
		
		//( b=SlangBlock |  '(' e=Expr ')' )
		public Alternatives getAlternatives_6_5() { return cAlternatives_6_5; }
		
		//b=SlangBlock
		public Assignment getBAssignment_6_5_0() { return cBAssignment_6_5_0; }
		
		//SlangBlock
		public RuleCall getBSlangBlockParserRuleCall_6_5_0_0() { return cBSlangBlockParserRuleCall_6_5_0_0; }
		
		//'(' e=Expr ')'
		public Group getGroup_6_5_1() { return cGroup_6_5_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_6_5_1_0() { return cLeftParenthesisKeyword_6_5_1_0; }
		
		//e=Expr
		public Assignment getEAssignment_6_5_1_1() { return cEAssignment_6_5_1_1; }
		
		//Expr
		public RuleCall getEExprParserRuleCall_6_5_1_1_0() { return cEExprParserRuleCall_6_5_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_6_5_1_2() { return cRightParenthesisKeyword_6_5_1_2; }
		
		//{SlangBlockTerm} '{'
		//      ( (p=SlangParams '=>')? e=Expr '}'
		//       | stmt+=SlangStmt* r=SlangRet? '}'
		//      )
		public Group getGroup_7() { return cGroup_7; }
		
		//{SlangBlockTerm}
		public Action getSlangBlockTermAction_7_0() { return cSlangBlockTermAction_7_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_7_1() { return cLeftCurlyBracketKeyword_7_1; }
		
		//( (p=SlangParams '=>')? e=Expr '}'
		// | stmt+=SlangStmt* r=SlangRet? '}'
		//)
		public Alternatives getAlternatives_7_2() { return cAlternatives_7_2; }
		
		//(p=SlangParams '=>')? e=Expr '}'
		public Group getGroup_7_2_0() { return cGroup_7_2_0; }
		
		//(p=SlangParams '=>')?
		public Group getGroup_7_2_0_0() { return cGroup_7_2_0_0; }
		
		//p=SlangParams
		public Assignment getPAssignment_7_2_0_0_0() { return cPAssignment_7_2_0_0_0; }
		
		//SlangParams
		public RuleCall getPSlangParamsParserRuleCall_7_2_0_0_0_0() { return cPSlangParamsParserRuleCall_7_2_0_0_0_0; }
		
		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_7_2_0_0_1() { return cEqualsSignGreaterThanSignKeyword_7_2_0_0_1; }
		
		//e=Expr
		public Assignment getEAssignment_7_2_0_1() { return cEAssignment_7_2_0_1; }
		
		//Expr
		public RuleCall getEExprParserRuleCall_7_2_0_1_0() { return cEExprParserRuleCall_7_2_0_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7_2_0_2() { return cRightCurlyBracketKeyword_7_2_0_2; }
		
		//stmt+=SlangStmt* r=SlangRet? '}'
		public Group getGroup_7_2_1() { return cGroup_7_2_1; }
		
		//stmt+=SlangStmt*
		public Assignment getStmtAssignment_7_2_1_0() { return cStmtAssignment_7_2_1_0; }
		
		//SlangStmt
		public RuleCall getStmtSlangStmtParserRuleCall_7_2_1_0_0() { return cStmtSlangStmtParserRuleCall_7_2_1_0_0; }
		
		//r=SlangRet?
		public Assignment getRAssignment_7_2_1_1() { return cRAssignment_7_2_1_1; }
		
		//SlangRet
		public RuleCall getRSlangRetParserRuleCall_7_2_1_1_0() { return cRSlangRetParserRuleCall_7_2_1_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7_2_1_2() { return cRightCurlyBracketKeyword_7_2_1_2; }
	}
	public class SlangParamsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangParams");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cParamsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cParamsSlangParamParserRuleCall_1_0 = (RuleCall)cParamsAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cParamsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cParamsSlangParamParserRuleCall_2_1_0 = (RuleCall)cParamsAssignment_2_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//SlangParams: '(' params+=SlangParam ( ',' params+=SlangParam )? ')' ;
		@Override public ParserRule getRule() { return rule; }
		
		//'(' params+=SlangParam ( ',' params+=SlangParam )? ')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//params+=SlangParam
		public Assignment getParamsAssignment_1() { return cParamsAssignment_1; }
		
		//SlangParam
		public RuleCall getParamsSlangParamParserRuleCall_1_0() { return cParamsSlangParamParserRuleCall_1_0; }
		
		//( ',' params+=SlangParam )?
		public Group getGroup_2() { return cGroup_2; }
		
		//','
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//params+=SlangParam
		public Assignment getParamsAssignment_2_1() { return cParamsAssignment_2_1; }
		
		//SlangParam
		public RuleCall getParamsSlangParamParserRuleCall_2_1_0() { return cParamsSlangParamParserRuleCall_2_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class SlangParamElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangParam");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVarKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cEqualsSignGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTypeNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTypeNameSlangTypeParserRuleCall_4_0 = (RuleCall)cTypeNameAssignment_4.eContents().get(0);
		private final Keyword cAsteriskKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//SlangParam: 'var'? name=ID ':' ( '=>' )? typeName=SlangType '*'? ;
		@Override public ParserRule getRule() { return rule; }
		
		//'var'? name=ID ':' ( '=>' )? typeName=SlangType '*'?
		public Group getGroup() { return cGroup; }
		
		//'var'?
		public Keyword getVarKeyword_0() { return cVarKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//( '=>' )?
		public Keyword getEqualsSignGreaterThanSignKeyword_3() { return cEqualsSignGreaterThanSignKeyword_3; }
		
		//typeName=SlangType
		public Assignment getTypeNameAssignment_4() { return cTypeNameAssignment_4; }
		
		//SlangType
		public RuleCall getTypeNameSlangTypeParserRuleCall_4_0() { return cTypeNameSlangTypeParserRuleCall_4_0; }
		
		//'*'?
		public Keyword getAsteriskKeyword_5() { return cAsteriskKeyword_5; }
	}
	public class SlangForRangeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangForRange");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cEAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cEExprParserRuleCall_2_0 = (RuleCall)cEAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Alternatives cAlternatives_3_0 = (Alternatives)cGroup_3.eContents().get(0);
		private final Keyword cFullStopFullStopKeyword_3_0_0 = (Keyword)cAlternatives_3_0.eContents().get(0);
		private final Keyword cFullStopFullStopLessThanSignKeyword_3_0_1 = (Keyword)cAlternatives_3_0.eContents().get(1);
		private final Assignment cUpperAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cUpperExprParserRuleCall_3_1_0 = (RuleCall)cUpperAssignment_3_1.eContents().get(0);
		private final Group cGroup_3_2 = (Group)cGroup_3.eContents().get(2);
		private final Keyword cByKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Assignment cStepAssignment_3_2_1 = (Assignment)cGroup_3_2.eContents().get(1);
		private final RuleCall cStepExprParserRuleCall_3_2_1_0 = (RuleCall)cStepAssignment_3_2_1.eContents().get(0);
		
		//SlangForRange: ID ':' e=Expr ( ( '..' |  '..<' ) upper=Expr ( 'by' step=Expr )? )? ;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ':' e=Expr ( ( '..' |  '..<' ) upper=Expr ( 'by' step=Expr )? )?
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//e=Expr
		public Assignment getEAssignment_2() { return cEAssignment_2; }
		
		//Expr
		public RuleCall getEExprParserRuleCall_2_0() { return cEExprParserRuleCall_2_0; }
		
		//( ( '..' |  '..<' ) upper=Expr ( 'by' step=Expr )? )?
		public Group getGroup_3() { return cGroup_3; }
		
		//( '..' |  '..<' )
		public Alternatives getAlternatives_3_0() { return cAlternatives_3_0; }
		
		//'..'
		public Keyword getFullStopFullStopKeyword_3_0_0() { return cFullStopFullStopKeyword_3_0_0; }
		
		//'..<'
		public Keyword getFullStopFullStopLessThanSignKeyword_3_0_1() { return cFullStopFullStopLessThanSignKeyword_3_0_1; }
		
		//upper=Expr
		public Assignment getUpperAssignment_3_1() { return cUpperAssignment_3_1; }
		
		//Expr
		public RuleCall getUpperExprParserRuleCall_3_1_0() { return cUpperExprParserRuleCall_3_1_0; }
		
		//( 'by' step=Expr )?
		public Group getGroup_3_2() { return cGroup_3_2; }
		
		//'by'
		public Keyword getByKeyword_3_2_0() { return cByKeyword_3_2_0; }
		
		//step=Expr
		public Assignment getStepAssignment_3_2_1() { return cStepAssignment_3_2_1; }
		
		//Expr
		public RuleCall getStepExprParserRuleCall_3_2_1_0() { return cStepExprParserRuleCall_3_2_1_0; }
	}
	public class SlangRetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangRet");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSlangRetAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cReturnKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cEAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cEExprParserRuleCall_2_0 = (RuleCall)cEAssignment_2.eContents().get(0);
		
		//SlangRet: {SlangRet} 'return' e=Expr? ;
		@Override public ParserRule getRule() { return rule; }
		
		//{SlangRet} 'return' e=Expr?
		public Group getGroup() { return cGroup; }
		
		//{SlangRet}
		public Action getSlangRetAction_0() { return cSlangRetAction_0; }
		
		//'return'
		public Keyword getReturnKeyword_1() { return cReturnKeyword_1; }
		
		//e=Expr?
		public Assignment getEAssignment_2() { return cEAssignment_2; }
		
		//Expr
		public RuleCall getEExprParserRuleCall_2_0() { return cEExprParserRuleCall_2_0; }
	}
	public class SlangCallSuffixElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangCallSuffix");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cSlangCallSuffixAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Assignment cTaAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cTaSlangTypeArgsParserRuleCall_0_1_0 = (RuleCall)cTaAssignment_0_1.eContents().get(0);
		private final Assignment cCaAssignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final RuleCall cCaSlangCallArgsParserRuleCall_0_2_0 = (RuleCall)cCaAssignment_0_2.eContents().get(0);
		private final Assignment cCaAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cCaSlangCallArgsParserRuleCall_1_0 = (RuleCall)cCaAssignment_1.eContents().get(0);
		
		//SlangCallSuffix: {SlangCallSuffix}
		//    ta=SlangTypeArgs ca=SlangCallArgs?
		//    | ca=SlangCallArgs
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//{SlangCallSuffix}
		//   ta=SlangTypeArgs ca=SlangCallArgs?
		//   | ca=SlangCallArgs
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{SlangCallSuffix}
		//   ta=SlangTypeArgs ca=SlangCallArgs?
		public Group getGroup_0() { return cGroup_0; }
		
		//{SlangCallSuffix}
		public Action getSlangCallSuffixAction_0_0() { return cSlangCallSuffixAction_0_0; }
		
		//ta=SlangTypeArgs
		public Assignment getTaAssignment_0_1() { return cTaAssignment_0_1; }
		
		//SlangTypeArgs
		public RuleCall getTaSlangTypeArgsParserRuleCall_0_1_0() { return cTaSlangTypeArgsParserRuleCall_0_1_0; }
		
		//ca=SlangCallArgs?
		public Assignment getCaAssignment_0_2() { return cCaAssignment_0_2; }
		
		//SlangCallArgs
		public RuleCall getCaSlangCallArgsParserRuleCall_0_2_0() { return cCaSlangCallArgsParserRuleCall_0_2_0; }
		
		//ca=SlangCallArgs
		public Assignment getCaAssignment_1() { return cCaAssignment_1; }
		
		//SlangCallArgs
		public RuleCall getCaSlangCallArgsParserRuleCall_1_0() { return cCaSlangCallArgsParserRuleCall_1_0; }
	}
	public class SlangCallArgsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangCallArgs");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSlangCallArgsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cArgAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cArgSlangIDExpParserRuleCall_2_0_0 = (RuleCall)cArgAssignment_2_0.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cGroup_2.eContents().get(1);
		private final Keyword cCommaKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cArgAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cArgSlangIDExpParserRuleCall_2_1_1_0 = (RuleCall)cArgAssignment_2_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//SlangCallArgs: {SlangCallArgs} '(' ( arg+=SlangIDExp ( ',' arg+=SlangIDExp )* )? ')' ;
		@Override public ParserRule getRule() { return rule; }
		
		//{SlangCallArgs} '(' ( arg+=SlangIDExp ( ',' arg+=SlangIDExp )* )? ')'
		public Group getGroup() { return cGroup; }
		
		//{SlangCallArgs}
		public Action getSlangCallArgsAction_0() { return cSlangCallArgsAction_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//( arg+=SlangIDExp ( ',' arg+=SlangIDExp )* )?
		public Group getGroup_2() { return cGroup_2; }
		
		//arg+=SlangIDExp
		public Assignment getArgAssignment_2_0() { return cArgAssignment_2_0; }
		
		//SlangIDExp
		public RuleCall getArgSlangIDExpParserRuleCall_2_0_0() { return cArgSlangIDExpParserRuleCall_2_0_0; }
		
		//( ',' arg+=SlangIDExp )*
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//','
		public Keyword getCommaKeyword_2_1_0() { return cCommaKeyword_2_1_0; }
		
		//arg+=SlangIDExp
		public Assignment getArgAssignment_2_1_1() { return cArgAssignment_2_1_1; }
		
		//SlangIDExp
		public RuleCall getArgSlangIDExpParserRuleCall_2_1_1_0() { return cArgSlangIDExpParserRuleCall_2_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class SlangIDExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangIDExp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cEAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cEExprParserRuleCall_0_0 = (RuleCall)cEAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cColonEqualsSignKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cEAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cEExprParserRuleCall_1_1_0 = (RuleCall)cEAssignment_1_1.eContents().get(0);
		
		//SlangIDExp: e+=Expr ( ':=' e+=Expr )? ;
		@Override public ParserRule getRule() { return rule; }
		
		//e+=Expr ( ':=' e+=Expr )?
		public Group getGroup() { return cGroup; }
		
		//e+=Expr
		public Assignment getEAssignment_0() { return cEAssignment_0; }
		
		//Expr
		public RuleCall getEExprParserRuleCall_0_0() { return cEExprParserRuleCall_0_0; }
		
		//( ':=' e+=Expr )?
		public Group getGroup_1() { return cGroup_1; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_1_0() { return cColonEqualsSignKeyword_1_0; }
		
		//e+=Expr
		public Assignment getEAssignment_1_1() { return cEAssignment_1_1; }
		
		//Expr
		public RuleCall getEExprParserRuleCall_1_1_0() { return cEExprParserRuleCall_1_1_0; }
	}
	public class SlangTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangType");
		private final RuleCall cSlangBaseTypeParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//SlangType
		//    : SlangBaseType// ( '=>' SlangBaseType )*
		//    //| 'mut' SlangBaseType ( '=>' SlangBaseType )+
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//SlangBaseType
		public RuleCall getSlangBaseTypeParserRuleCall() { return cSlangBaseTypeParserRuleCall; }
	}
	public class SlangBaseTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangBaseType");
		private final Assignment cTypeNameAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cTypeNameDataSubcomponentTypeCrossReference_0 = (CrossReference)cTypeNameAssignment.eContents().get(0);
		private final RuleCall cTypeNameDataSubcomponentTypeQCREFParserRuleCall_0_1 = (RuleCall)cTypeNameDataSubcomponentTypeCrossReference_0.eContents().get(1);
		
		//SlangBaseType returns SlangType
		//    : typeName=[aadl2::DataSubcomponentType|QCREF]//ID SlangTypeArgs?
		//    //| '(' ( SlangType ( ',' SlangType )* )? ')'
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//typeName=[aadl2::DataSubcomponentType|QCREF]
		public Assignment getTypeNameAssignment() { return cTypeNameAssignment; }
		
		//[aadl2::DataSubcomponentType|QCREF]
		public CrossReference getTypeNameDataSubcomponentTypeCrossReference_0() { return cTypeNameDataSubcomponentTypeCrossReference_0; }
		
		//QCREF
		public RuleCall getTypeNameDataSubcomponentTypeQCREFParserRuleCall_0_1() { return cTypeNameDataSubcomponentTypeQCREFParserRuleCall_0_1; }
	}
	public class SlangTypeArgsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangTypeArgs");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTypesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTypesSlangTypeParserRuleCall_1_0 = (RuleCall)cTypesAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cTypesAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cTypesSlangTypeParserRuleCall_2_1_0 = (RuleCall)cTypesAssignment_2_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//SlangTypeArgs: '[' types+=SlangType ( ',' types+=SlangType )* ']' ;
		@Override public ParserRule getRule() { return rule; }
		
		//'[' types+=SlangType ( ',' types+=SlangType )* ']'
		public Group getGroup() { return cGroup; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_0() { return cLeftSquareBracketKeyword_0; }
		
		//types+=SlangType
		public Assignment getTypesAssignment_1() { return cTypesAssignment_1; }
		
		//SlangType
		public RuleCall getTypesSlangTypeParserRuleCall_1_0() { return cTypesSlangTypeParserRuleCall_1_0; }
		
		//( ',' types+=SlangType )*
		public Group getGroup_2() { return cGroup_2; }
		
		//','
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//types+=SlangType
		public Assignment getTypesAssignment_2_1() { return cTypesAssignment_2_1; }
		
		//SlangType
		public RuleCall getTypesSlangTypeParserRuleCall_2_1_0() { return cTypesSlangTypeParserRuleCall_2_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_3() { return cRightSquareBracketKeyword_3; }
	}
	public class SlangLitElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangLit");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cTrueKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cFalseKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final RuleCall cINTEGER_LITTerminalRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cINT_IDFTerminalRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cHEXTerminalRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cBINTerminalRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cREAL_LITTerminalRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		private final RuleCall cSLANG_STRINGTerminalRuleCall_7 = (RuleCall)cAlternatives.eContents().get(7);
		private final RuleCall cREAL_IDFTerminalRuleCall_8 = (RuleCall)cAlternatives.eContents().get(8);
		private final RuleCall cMSTRINGTerminalRuleCall_9 = (RuleCall)cAlternatives.eContents().get(9);
		
		//SlangLit
		//    : 'true'
		//    | 'false'
		//    | INTEGER_LIT
		//    | INT_IDF
		//    | HEX
		//    | BIN
		//    | REAL_LIT
		//    | SLANG_STRING
		//    | REAL_IDF
		//    | MSTRING
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//'true'
		//   | 'false'
		//   | INTEGER_LIT
		//   | INT_IDF
		//   | HEX
		//   | BIN
		//   | REAL_LIT
		//   | SLANG_STRING
		//   | REAL_IDF
		//   | MSTRING
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'true'
		public Keyword getTrueKeyword_0() { return cTrueKeyword_0; }
		
		//'false'
		public Keyword getFalseKeyword_1() { return cFalseKeyword_1; }
		
		//INTEGER_LIT
		public RuleCall getINTEGER_LITTerminalRuleCall_2() { return cINTEGER_LITTerminalRuleCall_2; }
		
		//INT_IDF
		public RuleCall getINT_IDFTerminalRuleCall_3() { return cINT_IDFTerminalRuleCall_3; }
		
		//HEX
		public RuleCall getHEXTerminalRuleCall_4() { return cHEXTerminalRuleCall_4; }
		
		//BIN
		public RuleCall getBINTerminalRuleCall_5() { return cBINTerminalRuleCall_5; }
		
		//REAL_LIT
		public RuleCall getREAL_LITTerminalRuleCall_6() { return cREAL_LITTerminalRuleCall_6; }
		
		//SLANG_STRING
		public RuleCall getSLANG_STRINGTerminalRuleCall_7() { return cSLANG_STRINGTerminalRuleCall_7; }
		
		//REAL_IDF
		public RuleCall getREAL_IDFTerminalRuleCall_8() { return cREAL_IDFTerminalRuleCall_8; }
		
		//MSTRING
		public RuleCall getMSTRINGTerminalRuleCall_9() { return cMSTRINGTerminalRuleCall_9; }
	}
	public class SlangInterpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangInterp");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cSlangInterpAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final RuleCall cMSPTerminalRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final RuleCall cMSPBTerminalRuleCall_1_0 = (RuleCall)cGroup_1.eContents().get(0);
		private final RuleCall cSlangMInterpParserRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//SlangInterp    : {SlangInterp}
		//      MSP
		//    | MSPB SlangMInterp
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//{SlangInterp}
		//     MSP
		//   | MSPB SlangMInterp
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{SlangInterp}
		//     MSP
		public Group getGroup_0() { return cGroup_0; }
		
		//{SlangInterp}
		public Action getSlangInterpAction_0_0() { return cSlangInterpAction_0_0; }
		
		//MSP
		public RuleCall getMSPTerminalRuleCall_0_1() { return cMSPTerminalRuleCall_0_1; }
		
		//MSPB SlangMInterp
		public Group getGroup_1() { return cGroup_1; }
		
		//MSPB
		public RuleCall getMSPBTerminalRuleCall_1_0() { return cMSPBTerminalRuleCall_1_0; }
		
		//SlangMInterp
		public RuleCall getSlangMInterpParserRuleCall_1_1() { return cSlangMInterpParserRuleCall_1_1; }
	}
	public class SlangMInterpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangMInterp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cExprParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cAlternatives_3.eContents().get(0);
		private final RuleCall cMSPMTerminalRuleCall_3_0_0 = (RuleCall)cGroup_3_0.eContents().get(0);
		private final Assignment cMAssignment_3_0_1 = (Assignment)cGroup_3_0.eContents().get(1);
		private final RuleCall cMSlangMInterpParserRuleCall_3_0_1_0 = (RuleCall)cMAssignment_3_0_1.eContents().get(0);
		private final RuleCall cMSPETerminalRuleCall_3_1 = (RuleCall)cAlternatives_3.eContents().get(1);
		
		//SlangMInterp
		//    : '{' Expr '}' ( MSPM m=SlangMInterp | MSPE )
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//'{' Expr '}' ( MSPM m=SlangMInterp | MSPE )
		public Group getGroup() { return cGroup; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }
		
		//Expr
		public RuleCall getExprParserRuleCall_1() { return cExprParserRuleCall_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_2() { return cRightCurlyBracketKeyword_2; }
		
		//( MSPM m=SlangMInterp | MSPE )
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//MSPM m=SlangMInterp
		public Group getGroup_3_0() { return cGroup_3_0; }
		
		//MSPM
		public RuleCall getMSPMTerminalRuleCall_3_0_0() { return cMSPMTerminalRuleCall_3_0_0; }
		
		//m=SlangMInterp
		public Assignment getMAssignment_3_0_1() { return cMAssignment_3_0_1; }
		
		//SlangMInterp
		public RuleCall getMSlangMInterpParserRuleCall_3_0_1_0() { return cMSlangMInterpParserRuleCall_3_0_1_0; }
		
		//MSPE
		public RuleCall getMSPETerminalRuleCall_3_1() { return cMSPETerminalRuleCall_3_1; }
	}
	public class OperatorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.Operator");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cOPTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cPlusMinusParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cSTARParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		////
		//Operator: OP | PlusMinus | STAR;
		@Override public ParserRule getRule() { return rule; }
		
		//OP | PlusMinus | STAR
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//OP
		public RuleCall getOPTerminalRuleCall_0() { return cOPTerminalRuleCall_0; }
		
		//PlusMinus
		public RuleCall getPlusMinusParserRuleCall_1() { return cPlusMinusParserRuleCall_1; }
		
		//STAR
		public RuleCall getSTARParserRuleCall_2() { return cSTARParserRuleCall_2; }
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
	private final OtherDataRefElements pOtherDataRef;
	private final DoubleDotRefElements pDoubleDotRef;
	private final DataElementElements pDataElement;
	private final SubcomponentElementElements pSubcomponentElement;
	private final FunctionsElements pFunctions;
	private final FuncSpecElements pFuncSpec;
	private final SlangDefDeclDefElements pSlangDefDeclDef;
	private final SlangDefDeclElements pSlangDefDecl;
	private final SlangDefDefElements pSlangDefDef;
	private final SlangDefModsElements pSlangDefMods;
	private final SlangDefExtElements pSlangDefExt;
	private final SlangDefIDElements pSlangDefID;
	private final SlangDefParamsElements pSlangDefParams;
	private final SlangDefParamElements pSlangDefParam;
	private final SlangTypeParamsElements pSlangTypeParams;
	private final SlangTypeParamElements pSlangTypeParam;
	private final SlangDefContractElements pSlangDefContract;
	private final SlangDefContractCaseElements pSlangDefContractCase;
	private final SlangSuprsElements pSlangSuprs;
	private final SlangSuprElements pSlangSupr;
	private final SlangNameElements pSlangName;
	private final SlangExtElements pSlangExt;
	private final SlangInvariantElements pSlangInvariant;
	private final SlangReadsElements pSlangReads;
	private final SlangRequiresElements pSlangRequires;
	private final SlangModifiesElements pSlangModifies;
	private final SlangEnsuresElements pSlangEnsures;
	private final SlangStmtElements pSlangStmt;
	private final SlangElseElements pSlangElse;
	private final SlangLoopContractElements pSlangLoopContract;
	private final SlangLHSSuffixElements pSlangLHSSuffix;
	private final SlangCaseElements pSlangCase;
	private final SlangPatternElements pSlangPattern;
	private final SlangTPatternElements pSlangTPattern;
	private final SlangTypedVarDefElements pSlangTypedVarDef;
	private final SlangVarDefElements pSlangVarDef;
	private final SlangVarDeclDefElements pSlangVarDeclDef;
	private final SlangVarModElements pSlangVarMod;
	private final ExprElements pExpr;
	private final SlangQuantVarElements pSlangQuantVar;
	private final SlangBlockElements pSlangBlock;
	private final SlangAccessElements pSlangAccess;
	private final SlangTermElements pSlangTerm;
	private final SlangParamsElements pSlangParams;
	private final SlangParamElements pSlangParam;
	private final SlangForRangeElements pSlangForRange;
	private final SlangRetElements pSlangRet;
	private final SlangCallSuffixElements pSlangCallSuffix;
	private final SlangCallArgsElements pSlangCallArgs;
	private final SlangIDExpElements pSlangIDExp;
	private final SlangTypeElements pSlangType;
	private final SlangBaseTypeElements pSlangBaseType;
	private final SlangTypeArgsElements pSlangTypeArgs;
	private final SlangLitElements pSlangLit;
	private final SlangInterpElements pSlangInterp;
	private final SlangMInterpElements pSlangMInterp;
	private final TerminalRule tSLANG_STRING;
	private final TerminalRule tMSTRING;
	private final TerminalRule tMSP;
	private final TerminalRule tMSPB;
	private final TerminalRule tMSPM;
	private final TerminalRule tMSPE;
	private final TerminalRule tDEFOP;
	private final OperatorElements pOperator;
	private final TerminalRule tOP;
	private final TerminalRule tHEX;
	private final TerminalRule tBIN;
	private final TerminalRule tINT_IDF;
	private final TerminalRule tREAL_IDF;
	private final TerminalRule tIDF;
	private final TerminalRule tMSPI;
	private final TerminalRule tLETTER;
	private final TerminalRule tOPSYM;
	private final TerminalRule tESC_SEQ;
	private final TerminalRule tUNICODE_ESC;
	
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
		this.pOtherDataRef = new OtherDataRefElements();
		this.pDoubleDotRef = new DoubleDotRefElements();
		this.pDataElement = new DataElementElements();
		this.pSubcomponentElement = new SubcomponentElementElements();
		this.pFunctions = new FunctionsElements();
		this.pFuncSpec = new FuncSpecElements();
		this.pSlangDefDeclDef = new SlangDefDeclDefElements();
		this.pSlangDefDecl = new SlangDefDeclElements();
		this.pSlangDefDef = new SlangDefDefElements();
		this.pSlangDefMods = new SlangDefModsElements();
		this.pSlangDefExt = new SlangDefExtElements();
		this.pSlangDefID = new SlangDefIDElements();
		this.pSlangDefParams = new SlangDefParamsElements();
		this.pSlangDefParam = new SlangDefParamElements();
		this.pSlangTypeParams = new SlangTypeParamsElements();
		this.pSlangTypeParam = new SlangTypeParamElements();
		this.pSlangDefContract = new SlangDefContractElements();
		this.pSlangDefContractCase = new SlangDefContractCaseElements();
		this.pSlangSuprs = new SlangSuprsElements();
		this.pSlangSupr = new SlangSuprElements();
		this.pSlangName = new SlangNameElements();
		this.pSlangExt = new SlangExtElements();
		this.pSlangInvariant = new SlangInvariantElements();
		this.pSlangReads = new SlangReadsElements();
		this.pSlangRequires = new SlangRequiresElements();
		this.pSlangModifies = new SlangModifiesElements();
		this.pSlangEnsures = new SlangEnsuresElements();
		this.pSlangStmt = new SlangStmtElements();
		this.pSlangElse = new SlangElseElements();
		this.pSlangLoopContract = new SlangLoopContractElements();
		this.pSlangLHSSuffix = new SlangLHSSuffixElements();
		this.pSlangCase = new SlangCaseElements();
		this.pSlangPattern = new SlangPatternElements();
		this.pSlangTPattern = new SlangTPatternElements();
		this.pSlangTypedVarDef = new SlangTypedVarDefElements();
		this.pSlangVarDef = new SlangVarDefElements();
		this.pSlangVarDeclDef = new SlangVarDeclDefElements();
		this.pSlangVarMod = new SlangVarModElements();
		this.pExpr = new ExprElements();
		this.pSlangQuantVar = new SlangQuantVarElements();
		this.pSlangBlock = new SlangBlockElements();
		this.pSlangAccess = new SlangAccessElements();
		this.pSlangTerm = new SlangTermElements();
		this.pSlangParams = new SlangParamsElements();
		this.pSlangParam = new SlangParamElements();
		this.pSlangForRange = new SlangForRangeElements();
		this.pSlangRet = new SlangRetElements();
		this.pSlangCallSuffix = new SlangCallSuffixElements();
		this.pSlangCallArgs = new SlangCallArgsElements();
		this.pSlangIDExp = new SlangIDExpElements();
		this.pSlangType = new SlangTypeElements();
		this.pSlangBaseType = new SlangBaseTypeElements();
		this.pSlangTypeArgs = new SlangTypeArgsElements();
		this.pSlangLit = new SlangLitElements();
		this.pSlangInterp = new SlangInterpElements();
		this.pSlangMInterp = new SlangMInterpElements();
		this.tSLANG_STRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SLANG_STRING");
		this.tMSTRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.MSTRING");
		this.tMSP = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.MSP");
		this.tMSPB = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.MSPB");
		this.tMSPM = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.MSPM");
		this.tMSPE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.MSPE");
		this.tDEFOP = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.DEFOP");
		this.pOperator = new OperatorElements();
		this.tOP = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.OP");
		this.tHEX = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.HEX");
		this.tBIN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.BIN");
		this.tINT_IDF = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.INT_IDF");
		this.tREAL_IDF = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.REAL_IDF");
		this.tIDF = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.IDF");
		this.tMSPI = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.MSPI");
		this.tLETTER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.LETTER");
		this.tOPSYM = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.OPSYM");
		this.tESC_SEQ = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.ESC_SEQ");
		this.tUNICODE_ESC = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.UNICODE_ESC");
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
	
	//SpecSection: {SpecSection}
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
	//    'inv' displayName=SLANG_STRING ':' expr=Expr ';'
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
	//    'case' displayName=SLANG_STRING ':'
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
	//    'assume' displayName=SLANG_STRING ':' expr=Expr ';'
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
	//    'guarantee' displayName=SLANG_STRING ':' expr=Expr ';'
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
	
	//PREDICATE: // TODO
	//    ID
	//;
	public PREDICATEElements getPREDICATEAccess() {
		return pPREDICATE;
	}
	
	public ParserRule getPREDICATERule() {
		return getPREDICATEAccess().getRule();
	}
	
	//OtherDataRef:
	//    (
	//        (
	//            namedElement=[aadl2::NamedElement|ID]
	//             (arrayRange+=ArrayRange)*
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
	
	//Functions:
	//    'functions' (specs+=FuncSpec)+
	//;
	public FunctionsElements getFunctionsAccess() {
		return pFunctions;
	}
	
	public ParserRule getFunctionsRule() {
		return getFunctionsAccess().getRule();
	}
	
	//FuncSpec: SlangDefDef ';';
	public FuncSpecElements getFuncSpecAccess() {
		return pFuncSpec;
	}
	
	public ParserRule getFuncSpecRule() {
		return getFuncSpecAccess().getRule();
	}
	
	//SlangDefDeclDef: 'def' SlangDefMods? sde=SlangDefExt? name=SlangDefID typeParams=SlangTypeParams? params=SlangDefParams? ':' type=SlangType c=SlangDefContract? ( ':=' e=Expr )? ;
	public SlangDefDeclDefElements getSlangDefDeclDefAccess() {
		return pSlangDefDeclDef;
	}
	
	public ParserRule getSlangDefDeclDefRule() {
		return getSlangDefDeclDefAccess().getRule();
	}
	
	//SlangDefDecl: 'def' SlangDefMods? sde=SlangDefExt? name=SlangDefID typeParams=SlangTypeParams? params=SlangDefParams? ':' type=SlangType c=SlangDefContract? ;
	public SlangDefDeclElements getSlangDefDeclAccess() {
		return pSlangDefDecl;
	}
	
	public ParserRule getSlangDefDeclRule() {
		return getSlangDefDeclAccess().getRule();
	}
	
	//SlangDefDef: 'def' SlangDefMods? sde=SlangDefExt? name=SlangDefID typeParams=SlangTypeParams? params=SlangDefParams? ':' type=SlangType c=SlangDefContract? ':=' e=Expr ;
	public SlangDefDefElements getSlangDefDefAccess() {
		return pSlangDefDef;
	}
	
	public ParserRule getSlangDefDefRule() {
		return getSlangDefDefAccess().getRule();
	}
	
	//SlangDefMods: 'strict' | 'memoize' | 'mut' | 'spec' ;
	public SlangDefModsElements getSlangDefModsAccess() {
		return pSlangDefMods;
	}
	
	public ParserRule getSlangDefModsRule() {
		return getSlangDefModsAccess().getRule();
	}
	
	//SlangDefExt: '(' name=ID ':' typeName=SlangType ')' ;
	public SlangDefExtElements getSlangDefExtAccess() {
		return pSlangDefExt;
	}
	
	public ParserRule getSlangDefExtRule() {
		return getSlangDefExtAccess().getRule();
	}
	
	//SlangDefID: ID | Operator ;
	public SlangDefIDElements getSlangDefIDAccess() {
		return pSlangDefID;
	}
	
	public ParserRule getSlangDefIDRule() {
		return getSlangDefIDAccess().getRule();
	}
	
	//SlangDefParams: '(' params+=SlangDefParam ( ',' params+=SlangDefParam )? ')' ;
	public SlangDefParamsElements getSlangDefParamsAccess() {
		return pSlangDefParams;
	}
	
	public ParserRule getSlangDefParamsRule() {
		return getSlangDefParamsAccess().getRule();
	}
	
	//SlangDefParam: name=ID ':' ( '=>' )? typeName=SlangType '*'? ;
	public SlangDefParamElements getSlangDefParamAccess() {
		return pSlangDefParam;
	}
	
	public ParserRule getSlangDefParamRule() {
		return getSlangDefParamAccess().getRule();
	}
	
	//SlangTypeParams: '[' SlangTypeParam (  ',' SlangTypeParam )* ']' ;
	public SlangTypeParamsElements getSlangTypeParamsAccess() {
		return pSlangTypeParams;
	}
	
	public ParserRule getSlangTypeParamsRule() {
		return getSlangTypeParamsAccess().getRule();
	}
	
	//SlangTypeParam: 'mut'? ID ;
	public SlangTypeParamElements getSlangTypeParamAccess() {
		return pSlangTypeParam;
	}
	
	public ParserRule getSlangTypeParamRule() {
		return getSlangTypeParamAccess().getRule();
	}
	
	//SlangDefContract
	//    : {SlangDefContract} 'spec'
	//      ( rea=SlangReads? req=SlangRequires? mod=SlangModifies? ens=SlangEnsures?
	//      | contracts+=SlangDefContractCase+ rea=SlangReads? mod=SlangModifies?
	//      )
	//    ;
	public SlangDefContractElements getSlangDefContractAccess() {
		return pSlangDefContract;
	}
	
	public ParserRule getSlangDefContractRule() {
		return getSlangDefContractAccess().getRule();
	}
	
	//SlangDefContractCase: {SlangDefContractCase} 'case' /*SLANG_*/SLANG_STRING req=SlangRequires? ens=SlangEnsures? ;
	public SlangDefContractCaseElements getSlangDefContractCaseAccess() {
		return pSlangDefContractCase;
	}
	
	public ParserRule getSlangDefContractCaseRule() {
		return getSlangDefContractCaseAccess().getRule();
	}
	
	//SlangSuprs: '<:' superTypes+=SlangSupr ( ',' superTypes+=SlangSupr )* ;
	public SlangSuprsElements getSlangSuprsAccess() {
		return pSlangSuprs;
	}
	
	public ParserRule getSlangSuprsRule() {
		return getSlangSuprsAccess().getRule();
	}
	
	//SlangSupr: name=SlangName args=SlangTypeArgs? ;
	public SlangSuprElements getSlangSuprAccess() {
		return pSlangSupr;
	}
	
	public ParserRule getSlangSuprRule() {
		return getSlangSuprAccess().getRule();
	}
	
	//SlangName: ID ( '.' ID )* ;
	public SlangNameElements getSlangNameAccess() {
		return pSlangName;
	}
	
	public ParserRule getSlangNameRule() {
		return getSlangNameAccess().getRule();
	}
	
	//SlangExt: {SlangExt} 'extension' ID ( 'for' SlangName )?  '{' decl+=SlangDefDecl* '}' ;
	public SlangExtElements getSlangExtAccess() {
		return pSlangExt;
	}
	
	public ParserRule getSlangExtRule() {
		return getSlangExtAccess().getRule();
	}
	
	//SlangInvariant: 'invariant' exprs+=Expr ( ',' exprs+=Expr )* ;
	public SlangInvariantElements getSlangInvariantAccess() {
		return pSlangInvariant;
	}
	
	public ParserRule getSlangInvariantRule() {
		return getSlangInvariantAccess().getRule();
	}
	
	//SlangReads: 'reads' exprs+=Expr ( ',' exprs+=Expr )* ;
	public SlangReadsElements getSlangReadsAccess() {
		return pSlangReads;
	}
	
	public ParserRule getSlangReadsRule() {
		return getSlangReadsAccess().getRule();
	}
	
	//SlangRequires: 'requires' exprs+=Expr ( ',' exprs+=Expr )* ;
	public SlangRequiresElements getSlangRequiresAccess() {
		return pSlangRequires;
	}
	
	public ParserRule getSlangRequiresRule() {
		return getSlangRequiresAccess().getRule();
	}
	
	//SlangModifies: 'modifies' exprs+=Expr ( ',' exprs+=Expr )* ;
	public SlangModifiesElements getSlangModifiesAccess() {
		return pSlangModifies;
	}
	
	public ParserRule getSlangModifiesRule() {
		return getSlangModifiesAccess().getRule();
	}
	
	//SlangEnsures: 'ensures' exprs+=Expr ( ',' exprs+=Expr )* ;
	public SlangEnsuresElements getSlangEnsuresAccess() {
		return pSlangEnsures;
	}
	
	public ParserRule getSlangEnsuresRule() {
		return getSlangEnsuresAccess().getRule();
	}
	
	//SlangStmt
	//    : {SlangVarDef} d=SlangVarDef
	//    | {SlangIfStmt} 'if' cond=Expr b=SlangBlock e=SlangElse?
	//    | {SlangWhileStmt} 'while' cond=Expr l=SlangLoopContract b=SlangBlock
	////    | ({SlangForStmt} 'for' range+=SlangForRange ( ','  range+=SlangForRange )*) l=SlangLoopContract b=SlangBlock
	//    | {SlangMatchStmt} 'match' testExpr=Expr '{' c+=SlangCase* '}'
	//    | {SlangSpecStmt} 'spec' b=SlangBlock
	//    | {SlangAssumeStmt} 'assume' e=Expr /*SLANG_*/SLANG_STRING?
	//    | {SlangAssertStmt} 'assert' e=Expr /*SLANG_*/SLANG_STRING?
	//    | {SlangHaltStmt} 'halt' /*SLANG_*/SLANG_STRING?
	//    | {SlangDoStmt} 'do' e=Expr
	//    // FIXME: This causes a "multiple alternatives" warning.
	//    | {SlangIdStmt} portOrSubcomponentOrStateVar=[ecore::EObject|ID]
	//      ( ':'
	//      | /*l+=SlangLHSSuffix**/ ( ( ':=' | DEFOP ) e=Expr )?
	//      )
	//    ;
	public SlangStmtElements getSlangStmtAccess() {
		return pSlangStmt;
	}
	
	public ParserRule getSlangStmtRule() {
		return getSlangStmtAccess().getRule();
	}
	
	//SlangElse
	//    : 'else'
	//        ( 'if' cond=Expr b=SlangBlock e=SlangElse?
	//        | SlangBlock
	//        )
	//    ;
	public SlangElseElements getSlangElseAccess() {
		return pSlangElse;
	}
	
	public ParserRule getSlangElseRule() {
		return getSlangElseAccess().getRule();
	}
	
	//SlangLoopContract: {SlangLoopContract} inv=SlangInvariant? mod=SlangModifies? ;
	public SlangLoopContractElements getSlangLoopContractAccess() {
		return pSlangLoopContract;
	}
	
	public ParserRule getSlangLoopContractRule() {
		return getSlangLoopContractAccess().getRule();
	}
	
	//SlangLHSSuffix
	//    : {SlangFieldLookup} '.' ID
	//    | {SlangMethodCall} '(' ( exprs+=Expr ( ',' exprs+=Expr )* )? ')'
	//    ;
	public SlangLHSSuffixElements getSlangLHSSuffixAccess() {
		return pSlangLHSSuffix;
	}
	
	public ParserRule getSlangLHSSuffixRule() {
		return getSlangLHSSuffixAccess().getRule();
	}
	
	//SlangCase: 'case' pattern=SlangPattern ( 'if' e=Expr )? '=>' s+=SlangStmt* ;
	public SlangCaseElements getSlangCaseAccess() {
		return pSlangCase;
	}
	
	public ParserRule getSlangCaseRule() {
		return getSlangCaseAccess().getRule();
	}
	
	//SlangPattern: {SlangPattern}
	//      ID ( '(' patterns+=SlangTPattern ( ',' patterns+=SlangTPattern )* ')' )?
	//    | '(' patterns+=SlangTPattern ( ',' patterns+=SlangTPattern )* ')'
	//    ;
	public SlangPatternElements getSlangPatternAccess() {
		return pSlangPattern;
	}
	
	public ParserRule getSlangPatternRule() {
		return getSlangPatternAccess().getRule();
	}
	
	//SlangTPattern:
	//      {SlangTPattern} ID ( '(' patterns+=SlangTPattern ( ',' patterns+=SlangTPattern )* ')' | ':' type=SlangType )?
	//    | '(' patterns+=SlangTPattern ( ',' patterns+=SlangTPattern )* ')'
	//    | {SlangTPattern} '_' ( ':' type=SlangType )?
	//    ;
	public SlangTPatternElements getSlangTPatternAccess() {
		return pSlangTPattern;
	}
	
	public ParserRule getSlangTPatternRule() {
		return getSlangTPatternAccess().getRule();
	}
	
	//SlangTypedVarDef returns SlangVarDef:
	//    SlangVarMod SlangPattern ':' typeName=SlangType ':=' init=Expr
	//;
	public SlangTypedVarDefElements getSlangTypedVarDefAccess() {
		return pSlangTypedVarDef;
	}
	
	public ParserRule getSlangTypedVarDefRule() {
		return getSlangTypedVarDefAccess().getRule();
	}
	
	//SlangVarDef: SlangVarMod SlangPattern ( ':' typeName=SlangType )? ':=' init=Expr ;
	public SlangVarDefElements getSlangVarDefAccess() {
		return pSlangVarDef;
	}
	
	public ParserRule getSlangVarDefRule() {
		return getSlangVarDefAccess().getRule();
	}
	
	//SlangVarDeclDef returns SlangVarDef:
	//    SlangVarMod 'spec'? name=ID ':' typeName=SlangType ( ':=' init=Expr )?
	//;
	public SlangVarDeclDefElements getSlangVarDeclDefAccess() {
		return pSlangVarDeclDef;
	}
	
	public ParserRule getSlangVarDeclDefRule() {
		return getSlangVarDeclDefAccess().getRule();
	}
	
	//SlangVarMod: 'val' | 'var' ;
	public SlangVarModElements getSlangVarModAccess() {
		return pSlangVarMod;
	}
	
	public ParserRule getSlangVarModRule() {
		return getSlangVarModAccess().getRule();
	}
	
	//Expr
	//    : term+=SlangAccess (
	//      ( Operator term+=SlangAccess )*
	//      | '?' thenExpr=Expr ':' elseExpr=Expr
	//      )
	//    | ( '\\all' | '\\some' | '∀' | '∃' ) qVar+=SlangQuantVar ( ',' qVar+=SlangQuantVar )* '=>' quantifiedExpr=Expr
	//    | Operator SlangAccess
	//    ;
	public ExprElements getExprAccess() {
		return pExpr;
	}
	
	public ParserRule getExprRule() {
		return getExprAccess().getRule();
	}
	
	//SlangQuantVar: ID ':' e=Expr ( ( '..' | '..<' ) upperBound=Expr )? ;
	public SlangQuantVarElements getSlangQuantVarAccess() {
		return pSlangQuantVar;
	}
	
	public ParserRule getSlangQuantVarRule() {
		return getSlangQuantVarAccess().getRule();
	}
	
	//SlangBlock: {SlangBlock} '{' stmts+=SlangStmt* r=SlangRet? '}' ;
	public SlangBlockElements getSlangBlockAccess() {
		return pSlangBlock;
	}
	
	public ParserRule getSlangBlockRule() {
		return getSlangBlockAccess().getRule();
	}
	
	//SlangAccess returns Expr: t=SlangTerm ;
	public SlangAccessElements getSlangAccessAccess() {
		return pSlangAccess;
	}
	
	public ParserRule getSlangAccessRule() {
		return getSlangAccessAccess().getRule();
	}
	
	////suf+=SlangAccessSuffix* ;
	////SlangAccessSuffix: {SlangAccessSuffix} '.' ID cs=SlangCallSuffix? ;
	//SlangTerm returns Expr
	//    : {SlangLitTerm} SlangLit
	//    | {SlangInterpTerm} i=SlangInterp
	//    | => ({EnumLitExpr} 'enum' '(') enumType=DataElement ',' value=[aadl2::StringLiteral|ID] ')'
	//    | => ({RecordLitExpr} recordType=DataElement '{' args+=[aadl2::NamedElement|ID] '=') argExpr+=Expr (';' args+=[aadl2::NamedElement|ID] '=' argExpr+=Expr)* '}'
	//    | {DataRefExpr} portOrSubcomponentOrStateVar=[ecore::EObject|ID] ('.' ref=OtherDataRef)? cs=SlangCallSuffix?
	//    | {SlangTupleTerm} '(' e+=Expr ( ',' e+=Expr )*  ')'
	//    | {SlangForTerm} 'for' r+=SlangForRange ( ',' r+=SlangForRange )*  'yield' ( b=SlangBlock |  '(' e=Expr ')' )
	//    | {SlangBlockTerm} '{'
	//       ( (p=SlangParams '=>')? e=Expr '}'
	//        | stmt+=SlangStmt* r=SlangRet? '}'
	//       )
	//    ;
	public SlangTermElements getSlangTermAccess() {
		return pSlangTerm;
	}
	
	public ParserRule getSlangTermRule() {
		return getSlangTermAccess().getRule();
	}
	
	//SlangParams: '(' params+=SlangParam ( ',' params+=SlangParam )? ')' ;
	public SlangParamsElements getSlangParamsAccess() {
		return pSlangParams;
	}
	
	public ParserRule getSlangParamsRule() {
		return getSlangParamsAccess().getRule();
	}
	
	//SlangParam: 'var'? name=ID ':' ( '=>' )? typeName=SlangType '*'? ;
	public SlangParamElements getSlangParamAccess() {
		return pSlangParam;
	}
	
	public ParserRule getSlangParamRule() {
		return getSlangParamAccess().getRule();
	}
	
	//SlangForRange: ID ':' e=Expr ( ( '..' |  '..<' ) upper=Expr ( 'by' step=Expr )? )? ;
	public SlangForRangeElements getSlangForRangeAccess() {
		return pSlangForRange;
	}
	
	public ParserRule getSlangForRangeRule() {
		return getSlangForRangeAccess().getRule();
	}
	
	//SlangRet: {SlangRet} 'return' e=Expr? ;
	public SlangRetElements getSlangRetAccess() {
		return pSlangRet;
	}
	
	public ParserRule getSlangRetRule() {
		return getSlangRetAccess().getRule();
	}
	
	//SlangCallSuffix: {SlangCallSuffix}
	//    ta=SlangTypeArgs ca=SlangCallArgs?
	//    | ca=SlangCallArgs
	//    ;
	public SlangCallSuffixElements getSlangCallSuffixAccess() {
		return pSlangCallSuffix;
	}
	
	public ParserRule getSlangCallSuffixRule() {
		return getSlangCallSuffixAccess().getRule();
	}
	
	//SlangCallArgs: {SlangCallArgs} '(' ( arg+=SlangIDExp ( ',' arg+=SlangIDExp )* )? ')' ;
	public SlangCallArgsElements getSlangCallArgsAccess() {
		return pSlangCallArgs;
	}
	
	public ParserRule getSlangCallArgsRule() {
		return getSlangCallArgsAccess().getRule();
	}
	
	//SlangIDExp: e+=Expr ( ':=' e+=Expr )? ;
	public SlangIDExpElements getSlangIDExpAccess() {
		return pSlangIDExp;
	}
	
	public ParserRule getSlangIDExpRule() {
		return getSlangIDExpAccess().getRule();
	}
	
	//SlangType
	//    : SlangBaseType// ( '=>' SlangBaseType )*
	//    //| 'mut' SlangBaseType ( '=>' SlangBaseType )+
	//    ;
	public SlangTypeElements getSlangTypeAccess() {
		return pSlangType;
	}
	
	public ParserRule getSlangTypeRule() {
		return getSlangTypeAccess().getRule();
	}
	
	//SlangBaseType returns SlangType
	//    : typeName=[aadl2::DataSubcomponentType|QCREF]//ID SlangTypeArgs?
	//    //| '(' ( SlangType ( ',' SlangType )* )? ')'
	//    ;
	public SlangBaseTypeElements getSlangBaseTypeAccess() {
		return pSlangBaseType;
	}
	
	public ParserRule getSlangBaseTypeRule() {
		return getSlangBaseTypeAccess().getRule();
	}
	
	//SlangTypeArgs: '[' types+=SlangType ( ',' types+=SlangType )* ']' ;
	public SlangTypeArgsElements getSlangTypeArgsAccess() {
		return pSlangTypeArgs;
	}
	
	public ParserRule getSlangTypeArgsRule() {
		return getSlangTypeArgsAccess().getRule();
	}
	
	//SlangLit
	//    : 'true'
	//    | 'false'
	//    | INTEGER_LIT
	//    | INT_IDF
	//    | HEX
	//    | BIN
	//    | REAL_LIT
	//    | SLANG_STRING
	//    | REAL_IDF
	//    | MSTRING
	//    ;
	public SlangLitElements getSlangLitAccess() {
		return pSlangLit;
	}
	
	public ParserRule getSlangLitRule() {
		return getSlangLitAccess().getRule();
	}
	
	//SlangInterp    : {SlangInterp}
	//      MSP
	//    | MSPB SlangMInterp
	//    ;
	public SlangInterpElements getSlangInterpAccess() {
		return pSlangInterp;
	}
	
	public ParserRule getSlangInterpRule() {
		return getSlangInterpAccess().getRule();
	}
	
	//SlangMInterp
	//    : '{' Expr '}' ( MSPM m=SlangMInterp | MSPE )
	//    ;
	public SlangMInterpElements getSlangMInterpAccess() {
		return pSlangMInterp;
	}
	
	public ParserRule getSlangMInterpRule() {
		return getSlangMInterpAccess().getRule();
	}
	
	//terminal SLANG_STRING: '"' ( ESC_SEQ | !( '\\' | '"' ) )* '"' ;
	public TerminalRule getSLANG_STRINGRule() {
		return tSLANG_STRING;
	}
	
	//terminal MSTRING: '"""' ( !'"'|  '"' !'"' | '""' !'"' )* ( '"""' | '""""' | '"""""' ) ;
	public TerminalRule getMSTRINGRule() {
		return tMSTRING;
	}
	
	//terminal MSP: IDF '"""' MSPI* ( '"""' | '""""' | '"""""' ) ;
	public TerminalRule getMSPRule() {
		return tMSP;
	}
	
	//terminal MSPB: IDF '"""' MSPI* '$' ;
	public TerminalRule getMSPBRule() {
		return tMSPB;
	}
	
	//terminal MSPM: '$' MSPI* '$' ;
	public TerminalRule getMSPMRule() {
		return tMSPM;
	}
	
	//terminal MSPE: '$' MSPI* ( '"""' | '""""' | '"""""' ) ;
	public TerminalRule getMSPERule() {
		return tMSPE;
	}
	
	//terminal DEFOP: ':' OPSYM* '=' ;
	public TerminalRule getDEFOPRule() {
		return tDEFOP;
	}
	
	////
	//Operator: OP | PlusMinus | STAR;
	public OperatorElements getOperatorAccess() {
		return pOperator;
	}
	
	public ParserRule getOperatorRule() {
		return getOperatorAccess().getRule();
	}
	
	//terminal OP: ( OPSYM+ | '\\' IDF ) ;
	public TerminalRule getOPRule() {
		return tOP;
	}
	
	////
	////terminal INT
	////    : '0' IDF?
	////    | '1'..'9' DIGIT* IDF_NOU?
	////    ;
	////
	//terminal HEX: '0x' EXTENDED_DIGIT+ ( '.' IDF )? ;
	public TerminalRule getHEXRule() {
		return tHEX;
	}
	
	//terminal BIN: '0b' ( '0' | '1' | '_' )+ ( '.' IDF )? ;
	public TerminalRule getBINRule() {
		return tBIN;
	}
	
	////terminal REAL
	////    : DIGIT+ '.' DIGIT+ EXPONENT? REALIDF?
	////    | '.' DIGIT+ EXPONENT? REALIDF?
	////    | DIGIT+ EXPONENT REALIDF?
	////    ;
	////terminal CHAR: '\'' ( ESC_SEQ | !('\''|'\\') ) '\'' ;
	//terminal INT_IDF: INTEGER_LIT IDF;
	public TerminalRule getINT_IDFRule() {
		return tINT_IDF;
	}
	
	//terminal REAL_IDF: REAL_LIT IDF;
	public TerminalRule getREAL_IDFRule() {
		return tREAL_IDF;
	}
	
	//terminal fragment IDF: ( LETTER | '_' ) ( LETTER | DIGIT )* ;
	public TerminalRule getIDFRule() {
		return tIDF;
	}
	
	////terminal fragment IDF_NOU: LETTER ( LETTER | DIGIT )* ;
	////
	////terminal fragment REALIDF: LETTER_NOE ( LETTER | DIGIT )* ;
	////
	//terminal fragment MSPI: !( '"' | '$' ) | '$$' | '"' !'"' | '""' !'"' ;
	public TerminalRule getMSPIRule() {
		return tMSPI;
	}
	
	//terminal fragment LETTER: 'a'..'z' | 'A'..'Z';
	public TerminalRule getLETTERRule() {
		return tLETTER;
	}
	
	////terminal fragment LETTER_NOE: 'a'..'d' | 'f'..'z' | 'A'..'D' | 'F'..'Z' ;
	//terminal fragment OPSYM
	//    : //'+' | '-' | '*' |
	//     '/' | '%' | '=' | '<' | '>' | '!' | '&' | '^' | '|' | '~'
	//    | ( '\u2200' .. '\u22FF' ) // https://en.wikipedia.org/wiki/Mathematical_Operators
	//    | ( '\u2A00' .. '\u2AFF' ) // https://en.wikipedia.org/wiki/Supplemental_Mathematical_Operators
	//    | ( '\u27C0' .. '\u27EF' ) // https://en.wikipedia.org/wiki/Miscellaneous_Mathematical_Symbols-A
	//    | ( '\u2980' .. '\u29FF' ) // https://en.wikipedia.org/wiki/Miscellaneous_Mathematical_Symbols-B
	//    ;
	public TerminalRule getOPSYMRule() {
		return tOPSYM;
	}
	
	//terminal fragment ESC_SEQ: '\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\'' | '\\' ) | UNICODE_ESC ;
	public TerminalRule getESC_SEQRule() {
		return tESC_SEQ;
	}
	
	//terminal fragment UNICODE_ESC: '\\' 'u' EXTENDED_DIGIT EXTENDED_DIGIT EXTENDED_DIGIT EXTENDED_DIGIT ;
	public TerminalRule getUNICODE_ESCRule() {
		return tUNICODE_ESC;
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
