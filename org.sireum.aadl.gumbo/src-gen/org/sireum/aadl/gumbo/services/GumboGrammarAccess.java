
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
		private final Assignment cFunctionsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cFunctionsFunctionsParserRuleCall_1_0 = (RuleCall)cFunctionsAssignment_1.eContents().get(0);
		
		//GumboLibrary returns GumboLibrary:
		//    {GumboLibrary}
		//        (functions = Functions)?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{GumboLibrary}
		//    (functions = Functions)?
		public Group getGroup() { return cGroup; }
		
		//{GumboLibrary}
		public Action getGumboLibraryAction_0() { return cGumboLibraryAction_0; }
		
		//(functions = Functions)?
		public Assignment getFunctionsAssignment_1() { return cFunctionsAssignment_1; }
		
		//Functions
		public RuleCall getFunctionsFunctionsParserRuleCall_1_0() { return cFunctionsFunctionsParserRuleCall_1_0; }
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
		private final RuleCall cTypeNameDataSubcomponentTypeQualifiedNameParserRuleCall_1_0_1 = (RuleCall)cTypeNameDataSubcomponentTypeCrossReference_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//StateVarDecl:
		// // ...plain declaration without cross referencing is given below
		// // id1 = ID ':' typeName = ID
		// // ...single id per type
		// (name = ID ':') typeName=[aadl2::DataSubcomponentType|QualifiedName] ';' // TODO: ( ':=' expr=OwnedExpression)? ';'
		// // ...multiple ids per type -- leave this out for now until I figure out how to get cross-referencing right for an id list
		// // ids+=ID (',' ids+=ID)* ':' typeName=[aadl2::DataSubcomponentType|QCREF] ';'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//// ...plain declaration without cross referencing is given below
		//// id1 = ID ':' typeName = ID
		//// ...single id per type
		//(name = ID ':') typeName=[aadl2::DataSubcomponentType|QualifiedName] ';'
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
		
		//typeName=[aadl2::DataSubcomponentType|QualifiedName]
		public Assignment getTypeNameAssignment_1() { return cTypeNameAssignment_1; }
		
		//[aadl2::DataSubcomponentType|QualifiedName]
		public CrossReference getTypeNameDataSubcomponentTypeCrossReference_1_0() { return cTypeNameDataSubcomponentTypeCrossReference_1_0; }
		
		//QualifiedName
		public RuleCall getTypeNameDataSubcomponentTypeQualifiedNameParserRuleCall_1_0_1() { return cTypeNameDataSubcomponentTypeQualifiedNameParserRuleCall_1_0_1; }
		
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
		private final Assignment cIdAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cIdIDTerminalRuleCall_1_0 = (RuleCall)cIdAssignment_1.eContents().get(0);
		private final Assignment cDescriptorAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cDescriptorSTRING_VALUETerminalRuleCall_2_0 = (RuleCall)cDescriptorAssignment_2.eContents().get(0);
		private final Keyword cColonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cExprAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cExprOwnedExpressionParserRuleCall_4_0 = (RuleCall)cExprAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//InvSpec:
		//    'inv' id=ID descriptor=STRING_VALUE? ':' expr=OwnedExpression ';'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'inv' id=ID descriptor=STRING_VALUE? ':' expr=OwnedExpression ';'
		public Group getGroup() { return cGroup; }
		
		//'inv'
		public Keyword getInvKeyword_0() { return cInvKeyword_0; }
		
		//id=ID
		public Assignment getIdAssignment_1() { return cIdAssignment_1; }
		
		//ID
		public RuleCall getIdIDTerminalRuleCall_1_0() { return cIdIDTerminalRuleCall_1_0; }
		
		//descriptor=STRING_VALUE?
		public Assignment getDescriptorAssignment_2() { return cDescriptorAssignment_2; }
		
		//STRING_VALUE
		public RuleCall getDescriptorSTRING_VALUETerminalRuleCall_2_0() { return cDescriptorSTRING_VALUETerminalRuleCall_2_0; }
		
		//':'
		public Keyword getColonKeyword_3() { return cColonKeyword_3; }
		
		//expr=OwnedExpression
		public Assignment getExprAssignment_4() { return cExprAssignment_4; }
		
		//OwnedExpression
		public RuleCall getExprOwnedExpressionParserRuleCall_4_0() { return cExprOwnedExpressionParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
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
		private final Action cInitializeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cInitializeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cModifiesAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cModifiesSlangModifiesParserRuleCall_2_0_0 = (RuleCall)cModifiesAssignment_2_0.eContents().get(0);
		private final Keyword cSemicolonKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Assignment cSpecsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSpecsInitializeSpecStatementParserRuleCall_3_0 = (RuleCall)cSpecsAssignment_3.eContents().get(0);
		private final Assignment cFlowsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFlowsInfoFlowClauseParserRuleCall_4_0 = (RuleCall)cFlowsAssignment_4.eContents().get(0);
		
		//Initialize:
		//    {Initialize} 'initialize'
		//      (modifies=SlangModifies ';')?
		//      (specs+=InitializeSpecStatement)*
		//      (flows+=InfoFlowClause)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{Initialize} 'initialize'
		//  (modifies=SlangModifies ';')?
		//  (specs+=InitializeSpecStatement)*
		//  (flows+=InfoFlowClause)*
		public Group getGroup() { return cGroup; }
		
		//{Initialize}
		public Action getInitializeAction_0() { return cInitializeAction_0; }
		
		//'initialize'
		public Keyword getInitializeKeyword_1() { return cInitializeKeyword_1; }
		
		//(modifies=SlangModifies ';')?
		public Group getGroup_2() { return cGroup_2; }
		
		//modifies=SlangModifies
		public Assignment getModifiesAssignment_2_0() { return cModifiesAssignment_2_0; }
		
		//SlangModifies
		public RuleCall getModifiesSlangModifiesParserRuleCall_2_0_0() { return cModifiesSlangModifiesParserRuleCall_2_0_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2_1() { return cSemicolonKeyword_2_1; }
		
		//(specs+=InitializeSpecStatement)*
		public Assignment getSpecsAssignment_3() { return cSpecsAssignment_3; }
		
		//InitializeSpecStatement
		public RuleCall getSpecsInitializeSpecStatementParserRuleCall_3_0() { return cSpecsInitializeSpecStatementParserRuleCall_3_0; }
		
		//(flows+=InfoFlowClause)*
		public Assignment getFlowsAssignment_4() { return cFlowsAssignment_4; }
		
		//InfoFlowClause
		public RuleCall getFlowsInfoFlowClauseParserRuleCall_4_0() { return cFlowsInfoFlowClauseParserRuleCall_4_0; }
	}
	public class InitializeSpecStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.InitializeSpecStatement");
		private final Assignment cGuaranteeStatementAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cGuaranteeStatementGuaranteeStatementParserRuleCall_0 = (RuleCall)cGuaranteeStatementAssignment.eContents().get(0);
		
		//InitializeSpecStatement:
		//  guaranteeStatement = GuaranteeStatement
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//guaranteeStatement = GuaranteeStatement
		public Assignment getGuaranteeStatementAssignment() { return cGuaranteeStatementAssignment; }
		
		//GuaranteeStatement
		public RuleCall getGuaranteeStatementGuaranteeStatementParserRuleCall_0() { return cGuaranteeStatementGuaranteeStatementParserRuleCall_0; }
	}
	public class ComputeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.Compute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cComputeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cComputeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cModifiesAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cModifiesSlangModifiesParserRuleCall_2_0_0 = (RuleCall)cModifiesAssignment_2_0.eContents().get(0);
		private final Keyword cSemicolonKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Assignment cAssumesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAssumesAssumeStatementParserRuleCall_3_0 = (RuleCall)cAssumesAssignment_3.eContents().get(0);
		private final Assignment cGuaranteesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cGuaranteesGuaranteeStatementParserRuleCall_4_0 = (RuleCall)cGuaranteesAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCasesKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cCasesAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cCasesCaseStatementClauseParserRuleCall_5_1_0 = (RuleCall)cCasesAssignment_5_1.eContents().get(0);
		private final Assignment cHandlersAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cHandlersHandlerClauseParserRuleCall_6_0 = (RuleCall)cHandlersAssignment_6.eContents().get(0);
		private final Assignment cFlowsAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cFlowsInfoFlowClauseParserRuleCall_7_0 = (RuleCall)cFlowsAssignment_7.eContents().get(0);
		
		//Compute:
		//    {Compute} 'compute'
		//      (modifies=SlangModifies ';')?
		//      (assumes+=AssumeStatement)*
		//      (guarantees+=GuaranteeStatement)*
		//      ('cases' (cases+=CaseStatementClause)+)*
		//      (handlers+=HandlerClause)*
		//      (flows+=InfoFlowClause)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{Compute} 'compute'
		//  (modifies=SlangModifies ';')?
		//  (assumes+=AssumeStatement)*
		//  (guarantees+=GuaranteeStatement)*
		//  ('cases' (cases+=CaseStatementClause)+)*
		//  (handlers+=HandlerClause)*
		//  (flows+=InfoFlowClause)*
		public Group getGroup() { return cGroup; }
		
		//{Compute}
		public Action getComputeAction_0() { return cComputeAction_0; }
		
		//'compute'
		public Keyword getComputeKeyword_1() { return cComputeKeyword_1; }
		
		//(modifies=SlangModifies ';')?
		public Group getGroup_2() { return cGroup_2; }
		
		//modifies=SlangModifies
		public Assignment getModifiesAssignment_2_0() { return cModifiesAssignment_2_0; }
		
		//SlangModifies
		public RuleCall getModifiesSlangModifiesParserRuleCall_2_0_0() { return cModifiesSlangModifiesParserRuleCall_2_0_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2_1() { return cSemicolonKeyword_2_1; }
		
		//(assumes+=AssumeStatement)*
		public Assignment getAssumesAssignment_3() { return cAssumesAssignment_3; }
		
		//AssumeStatement
		public RuleCall getAssumesAssumeStatementParserRuleCall_3_0() { return cAssumesAssumeStatementParserRuleCall_3_0; }
		
		//(guarantees+=GuaranteeStatement)*
		public Assignment getGuaranteesAssignment_4() { return cGuaranteesAssignment_4; }
		
		//GuaranteeStatement
		public RuleCall getGuaranteesGuaranteeStatementParserRuleCall_4_0() { return cGuaranteesGuaranteeStatementParserRuleCall_4_0; }
		
		//('cases' (cases+=CaseStatementClause)+)*
		public Group getGroup_5() { return cGroup_5; }
		
		//'cases'
		public Keyword getCasesKeyword_5_0() { return cCasesKeyword_5_0; }
		
		//(cases+=CaseStatementClause)+
		public Assignment getCasesAssignment_5_1() { return cCasesAssignment_5_1; }
		
		//CaseStatementClause
		public RuleCall getCasesCaseStatementClauseParserRuleCall_5_1_0() { return cCasesCaseStatementClauseParserRuleCall_5_1_0; }
		
		//(handlers+=HandlerClause)*
		public Assignment getHandlersAssignment_6() { return cHandlersAssignment_6; }
		
		//HandlerClause
		public RuleCall getHandlersHandlerClauseParserRuleCall_6_0() { return cHandlersHandlerClauseParserRuleCall_6_0; }
		
		//(flows+=InfoFlowClause)*
		public Assignment getFlowsAssignment_7() { return cFlowsAssignment_7; }
		
		//InfoFlowClause
		public RuleCall getFlowsInfoFlowClauseParserRuleCall_7_0() { return cFlowsInfoFlowClauseParserRuleCall_7_0; }
	}
	public class InfoFlowClauseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.InfoFlowClause");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInfoflowKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cIdAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cIdIDTerminalRuleCall_1_0 = (RuleCall)cIdAssignment_1.eContents().get(0);
		private final Assignment cDescriptorAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cDescriptorSTRING_VALUETerminalRuleCall_2_0 = (RuleCall)cDescriptorAssignment_2.eContents().get(0);
		private final Keyword cColonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cFromKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cLeftParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Assignment cFromPortOrStateVarAssignment_6_0 = (Assignment)cGroup_6.eContents().get(0);
		private final CrossReference cFromPortOrStateVarEObjectCrossReference_6_0_0 = (CrossReference)cFromPortOrStateVarAssignment_6_0.eContents().get(0);
		private final RuleCall cFromPortOrStateVarEObjectIDTerminalRuleCall_6_0_0_1 = (RuleCall)cFromPortOrStateVarEObjectCrossReference_6_0_0.eContents().get(1);
		private final Group cGroup_6_1 = (Group)cGroup_6.eContents().get(1);
		private final Keyword cCommaKeyword_6_1_0 = (Keyword)cGroup_6_1.eContents().get(0);
		private final Assignment cFromPortOrStateVarAssignment_6_1_1 = (Assignment)cGroup_6_1.eContents().get(1);
		private final CrossReference cFromPortOrStateVarEObjectCrossReference_6_1_1_0 = (CrossReference)cFromPortOrStateVarAssignment_6_1_1.eContents().get(0);
		private final RuleCall cFromPortOrStateVarEObjectIDTerminalRuleCall_6_1_1_0_1 = (RuleCall)cFromPortOrStateVarEObjectCrossReference_6_1_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cCommaKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Keyword cToKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cLeftParenthesisKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Group cGroup_11 = (Group)cGroup.eContents().get(11);
		private final Assignment cToPortOrStateVarAssignment_11_0 = (Assignment)cGroup_11.eContents().get(0);
		private final CrossReference cToPortOrStateVarEObjectCrossReference_11_0_0 = (CrossReference)cToPortOrStateVarAssignment_11_0.eContents().get(0);
		private final RuleCall cToPortOrStateVarEObjectIDTerminalRuleCall_11_0_0_1 = (RuleCall)cToPortOrStateVarEObjectCrossReference_11_0_0.eContents().get(1);
		private final Group cGroup_11_1 = (Group)cGroup_11.eContents().get(1);
		private final Keyword cCommaKeyword_11_1_0 = (Keyword)cGroup_11_1.eContents().get(0);
		private final Assignment cToPortOrStateVarAssignment_11_1_1 = (Assignment)cGroup_11_1.eContents().get(1);
		private final CrossReference cToPortOrStateVarEObjectCrossReference_11_1_1_0 = (CrossReference)cToPortOrStateVarAssignment_11_1_1.eContents().get(0);
		private final RuleCall cToPortOrStateVarEObjectIDTerminalRuleCall_11_1_1_0_1 = (RuleCall)cToPortOrStateVarEObjectCrossReference_11_1_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_12 = (Keyword)cGroup.eContents().get(12);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		
		//InfoFlowClause:
		//    'infoflow' id=ID descriptor=STRING_VALUE? ':'
		//          'from' '(' (fromPortOrStateVar+=[ecore::EObject|ID] ( ',' fromPortOrStateVar+=[ecore::EObject|ID])* )? ')'
		//          ','
		//          'to' '(' (toPortOrStateVar+=[ecore::EObject|ID] ( ',' toPortOrStateVar+=[ecore::EObject|ID])* )? ')' ';'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'infoflow' id=ID descriptor=STRING_VALUE? ':'
		//      'from' '(' (fromPortOrStateVar+=[ecore::EObject|ID] ( ',' fromPortOrStateVar+=[ecore::EObject|ID])* )? ')'
		//      ','
		//      'to' '(' (toPortOrStateVar+=[ecore::EObject|ID] ( ',' toPortOrStateVar+=[ecore::EObject|ID])* )? ')' ';'
		public Group getGroup() { return cGroup; }
		
		//'infoflow'
		public Keyword getInfoflowKeyword_0() { return cInfoflowKeyword_0; }
		
		//id=ID
		public Assignment getIdAssignment_1() { return cIdAssignment_1; }
		
		//ID
		public RuleCall getIdIDTerminalRuleCall_1_0() { return cIdIDTerminalRuleCall_1_0; }
		
		//descriptor=STRING_VALUE?
		public Assignment getDescriptorAssignment_2() { return cDescriptorAssignment_2; }
		
		//STRING_VALUE
		public RuleCall getDescriptorSTRING_VALUETerminalRuleCall_2_0() { return cDescriptorSTRING_VALUETerminalRuleCall_2_0; }
		
		//':'
		public Keyword getColonKeyword_3() { return cColonKeyword_3; }
		
		//'from'
		public Keyword getFromKeyword_4() { return cFromKeyword_4; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_5() { return cLeftParenthesisKeyword_5; }
		
		//(fromPortOrStateVar+=[ecore::EObject|ID] ( ',' fromPortOrStateVar+=[ecore::EObject|ID])* )?
		public Group getGroup_6() { return cGroup_6; }
		
		//fromPortOrStateVar+=[ecore::EObject|ID]
		public Assignment getFromPortOrStateVarAssignment_6_0() { return cFromPortOrStateVarAssignment_6_0; }
		
		//[ecore::EObject|ID]
		public CrossReference getFromPortOrStateVarEObjectCrossReference_6_0_0() { return cFromPortOrStateVarEObjectCrossReference_6_0_0; }
		
		//ID
		public RuleCall getFromPortOrStateVarEObjectIDTerminalRuleCall_6_0_0_1() { return cFromPortOrStateVarEObjectIDTerminalRuleCall_6_0_0_1; }
		
		//( ',' fromPortOrStateVar+=[ecore::EObject|ID])*
		public Group getGroup_6_1() { return cGroup_6_1; }
		
		//','
		public Keyword getCommaKeyword_6_1_0() { return cCommaKeyword_6_1_0; }
		
		//fromPortOrStateVar+=[ecore::EObject|ID]
		public Assignment getFromPortOrStateVarAssignment_6_1_1() { return cFromPortOrStateVarAssignment_6_1_1; }
		
		//[ecore::EObject|ID]
		public CrossReference getFromPortOrStateVarEObjectCrossReference_6_1_1_0() { return cFromPortOrStateVarEObjectCrossReference_6_1_1_0; }
		
		//ID
		public RuleCall getFromPortOrStateVarEObjectIDTerminalRuleCall_6_1_1_0_1() { return cFromPortOrStateVarEObjectIDTerminalRuleCall_6_1_1_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_7() { return cRightParenthesisKeyword_7; }
		
		//','
		public Keyword getCommaKeyword_8() { return cCommaKeyword_8; }
		
		//'to'
		public Keyword getToKeyword_9() { return cToKeyword_9; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_10() { return cLeftParenthesisKeyword_10; }
		
		//(toPortOrStateVar+=[ecore::EObject|ID] ( ',' toPortOrStateVar+=[ecore::EObject|ID])* )?
		public Group getGroup_11() { return cGroup_11; }
		
		//toPortOrStateVar+=[ecore::EObject|ID]
		public Assignment getToPortOrStateVarAssignment_11_0() { return cToPortOrStateVarAssignment_11_0; }
		
		//[ecore::EObject|ID]
		public CrossReference getToPortOrStateVarEObjectCrossReference_11_0_0() { return cToPortOrStateVarEObjectCrossReference_11_0_0; }
		
		//ID
		public RuleCall getToPortOrStateVarEObjectIDTerminalRuleCall_11_0_0_1() { return cToPortOrStateVarEObjectIDTerminalRuleCall_11_0_0_1; }
		
		//( ',' toPortOrStateVar+=[ecore::EObject|ID])*
		public Group getGroup_11_1() { return cGroup_11_1; }
		
		//','
		public Keyword getCommaKeyword_11_1_0() { return cCommaKeyword_11_1_0; }
		
		//toPortOrStateVar+=[ecore::EObject|ID]
		public Assignment getToPortOrStateVarAssignment_11_1_1() { return cToPortOrStateVarAssignment_11_1_1; }
		
		//[ecore::EObject|ID]
		public CrossReference getToPortOrStateVarEObjectCrossReference_11_1_1_0() { return cToPortOrStateVarEObjectCrossReference_11_1_1_0; }
		
		//ID
		public RuleCall getToPortOrStateVarEObjectIDTerminalRuleCall_11_1_1_0_1() { return cToPortOrStateVarEObjectIDTerminalRuleCall_11_1_1_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_12() { return cRightParenthesisKeyword_12; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
	}
	public class HandlerClauseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.HandlerClause");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHandleKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cIdAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cIdPortCrossReference_1_0 = (CrossReference)cIdAssignment_1.eContents().get(0);
		private final RuleCall cIdPortIDTerminalRuleCall_1_0_1 = (RuleCall)cIdPortCrossReference_1_0.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cModifiesAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final RuleCall cModifiesSlangModifiesParserRuleCall_3_0_0 = (RuleCall)cModifiesAssignment_3_0.eContents().get(0);
		private final Keyword cSemicolonKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cAssumesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAssumesAssumeStatementParserRuleCall_4_0 = (RuleCall)cAssumesAssignment_4.eContents().get(0);
		private final Assignment cGuaranteesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cGuaranteesGuaranteeStatementParserRuleCall_5_0 = (RuleCall)cGuaranteesAssignment_5.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cCasesKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cCasesAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cCasesCaseStatementClauseParserRuleCall_6_1_0 = (RuleCall)cCasesAssignment_6_1.eContents().get(0);
		
		//HandlerClause:
		//    'handle' id=[aadl2::Port|ID] ':'
		//    (modifies=SlangModifies ';')?
		//    (assumes+=AssumeStatement)*
		//    (guarantees+=GuaranteeStatement)*
		//    ('cases' (cases+=CaseStatementClause)+)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'handle' id=[aadl2::Port|ID] ':'
		//(modifies=SlangModifies ';')?
		//(assumes+=AssumeStatement)*
		//(guarantees+=GuaranteeStatement)*
		//('cases' (cases+=CaseStatementClause)+)*
		public Group getGroup() { return cGroup; }
		
		//'handle'
		public Keyword getHandleKeyword_0() { return cHandleKeyword_0; }
		
		//id=[aadl2::Port|ID]
		public Assignment getIdAssignment_1() { return cIdAssignment_1; }
		
		//[aadl2::Port|ID]
		public CrossReference getIdPortCrossReference_1_0() { return cIdPortCrossReference_1_0; }
		
		//ID
		public RuleCall getIdPortIDTerminalRuleCall_1_0_1() { return cIdPortIDTerminalRuleCall_1_0_1; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//(modifies=SlangModifies ';')?
		public Group getGroup_3() { return cGroup_3; }
		
		//modifies=SlangModifies
		public Assignment getModifiesAssignment_3_0() { return cModifiesAssignment_3_0; }
		
		//SlangModifies
		public RuleCall getModifiesSlangModifiesParserRuleCall_3_0_0() { return cModifiesSlangModifiesParserRuleCall_3_0_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3_1() { return cSemicolonKeyword_3_1; }
		
		//(assumes+=AssumeStatement)*
		public Assignment getAssumesAssignment_4() { return cAssumesAssignment_4; }
		
		//AssumeStatement
		public RuleCall getAssumesAssumeStatementParserRuleCall_4_0() { return cAssumesAssumeStatementParserRuleCall_4_0; }
		
		//(guarantees+=GuaranteeStatement)*
		public Assignment getGuaranteesAssignment_5() { return cGuaranteesAssignment_5; }
		
		//GuaranteeStatement
		public RuleCall getGuaranteesGuaranteeStatementParserRuleCall_5_0() { return cGuaranteesGuaranteeStatementParserRuleCall_5_0; }
		
		//('cases' (cases+=CaseStatementClause)+)*
		public Group getGroup_6() { return cGroup_6; }
		
		//'cases'
		public Keyword getCasesKeyword_6_0() { return cCasesKeyword_6_0; }
		
		//(cases+=CaseStatementClause)+
		public Assignment getCasesAssignment_6_1() { return cCasesAssignment_6_1; }
		
		//CaseStatementClause
		public RuleCall getCasesCaseStatementClauseParserRuleCall_6_1_0() { return cCasesCaseStatementClauseParserRuleCall_6_1_0; }
	}
	public class CaseStatementClauseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.CaseStatementClause");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCaseKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cIdAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cIdIDTerminalRuleCall_1_0 = (RuleCall)cIdAssignment_1.eContents().get(0);
		private final Assignment cDescriptorAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cDescriptorSTRING_VALUETerminalRuleCall_2_0 = (RuleCall)cDescriptorAssignment_2.eContents().get(0);
		private final Keyword cColonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cAssumeStatementAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAssumeStatementAnonAssumeStatementParserRuleCall_4_0 = (RuleCall)cAssumeStatementAssignment_4.eContents().get(0);
		private final Assignment cGuaranteeStatementAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cGuaranteeStatementAnonGuaranteeStatementParserRuleCall_5_0 = (RuleCall)cGuaranteeStatementAssignment_5.eContents().get(0);
		
		//CaseStatementClause:
		//    'case' id=ID descriptor=STRING_VALUE? ':'
		//           (assumeStatement=AnonAssumeStatement)?
		//           guaranteeStatement=AnonGuaranteeStatement
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'case' id=ID descriptor=STRING_VALUE? ':'
		//       (assumeStatement=AnonAssumeStatement)?
		//       guaranteeStatement=AnonGuaranteeStatement
		public Group getGroup() { return cGroup; }
		
		//'case'
		public Keyword getCaseKeyword_0() { return cCaseKeyword_0; }
		
		//id=ID
		public Assignment getIdAssignment_1() { return cIdAssignment_1; }
		
		//ID
		public RuleCall getIdIDTerminalRuleCall_1_0() { return cIdIDTerminalRuleCall_1_0; }
		
		//descriptor=STRING_VALUE?
		public Assignment getDescriptorAssignment_2() { return cDescriptorAssignment_2; }
		
		//STRING_VALUE
		public RuleCall getDescriptorSTRING_VALUETerminalRuleCall_2_0() { return cDescriptorSTRING_VALUETerminalRuleCall_2_0; }
		
		//':'
		public Keyword getColonKeyword_3() { return cColonKeyword_3; }
		
		//(assumeStatement=AnonAssumeStatement)?
		public Assignment getAssumeStatementAssignment_4() { return cAssumeStatementAssignment_4; }
		
		//AnonAssumeStatement
		public RuleCall getAssumeStatementAnonAssumeStatementParserRuleCall_4_0() { return cAssumeStatementAnonAssumeStatementParserRuleCall_4_0; }
		
		//guaranteeStatement=AnonGuaranteeStatement
		public Assignment getGuaranteeStatementAssignment_5() { return cGuaranteeStatementAssignment_5; }
		
		//AnonGuaranteeStatement
		public RuleCall getGuaranteeStatementAnonGuaranteeStatementParserRuleCall_5_0() { return cGuaranteeStatementAnonGuaranteeStatementParserRuleCall_5_0; }
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
		private final Assignment cIdAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cIdIDTerminalRuleCall_1_0 = (RuleCall)cIdAssignment_1.eContents().get(0);
		private final Assignment cDescriptorAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cDescriptorSTRING_VALUETerminalRuleCall_2_0 = (RuleCall)cDescriptorAssignment_2.eContents().get(0);
		private final Keyword cColonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cExprAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cExprOwnedExpressionParserRuleCall_4_0 = (RuleCall)cExprAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//AssumeStatement:
		//    'assume' id=ID descriptor=STRING_VALUE? ':' expr=OwnedExpression ';'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'assume' id=ID descriptor=STRING_VALUE? ':' expr=OwnedExpression ';'
		public Group getGroup() { return cGroup; }
		
		//'assume'
		public Keyword getAssumeKeyword_0() { return cAssumeKeyword_0; }
		
		//id=ID
		public Assignment getIdAssignment_1() { return cIdAssignment_1; }
		
		//ID
		public RuleCall getIdIDTerminalRuleCall_1_0() { return cIdIDTerminalRuleCall_1_0; }
		
		//descriptor=STRING_VALUE?
		public Assignment getDescriptorAssignment_2() { return cDescriptorAssignment_2; }
		
		//STRING_VALUE
		public RuleCall getDescriptorSTRING_VALUETerminalRuleCall_2_0() { return cDescriptorSTRING_VALUETerminalRuleCall_2_0; }
		
		//':'
		public Keyword getColonKeyword_3() { return cColonKeyword_3; }
		
		//expr=OwnedExpression
		public Assignment getExprAssignment_4() { return cExprAssignment_4; }
		
		//OwnedExpression
		public RuleCall getExprOwnedExpressionParserRuleCall_4_0() { return cExprOwnedExpressionParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class AnonAssumeStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.AnonAssumeStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAssumeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cExprAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExprOwnedExpressionParserRuleCall_1_0 = (RuleCall)cExprAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//AnonAssumeStatement:
		//    'assume' expr=OwnedExpression ';'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'assume' expr=OwnedExpression ';'
		public Group getGroup() { return cGroup; }
		
		//'assume'
		public Keyword getAssumeKeyword_0() { return cAssumeKeyword_0; }
		
		//expr=OwnedExpression
		public Assignment getExprAssignment_1() { return cExprAssignment_1; }
		
		//OwnedExpression
		public RuleCall getExprOwnedExpressionParserRuleCall_1_0() { return cExprOwnedExpressionParserRuleCall_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	public class GuaranteeStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.GuaranteeStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGuaranteeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cIdAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cIdIDTerminalRuleCall_1_0 = (RuleCall)cIdAssignment_1.eContents().get(0);
		private final Assignment cDescriptorAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cDescriptorSTRING_VALUETerminalRuleCall_2_0 = (RuleCall)cDescriptorAssignment_2.eContents().get(0);
		private final Keyword cColonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cExprAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cExprOwnedExpressionParserRuleCall_4_0 = (RuleCall)cExprAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//GuaranteeStatement:
		//    'guarantee' id=ID descriptor=STRING_VALUE? ':' expr=OwnedExpression ';'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'guarantee' id=ID descriptor=STRING_VALUE? ':' expr=OwnedExpression ';'
		public Group getGroup() { return cGroup; }
		
		//'guarantee'
		public Keyword getGuaranteeKeyword_0() { return cGuaranteeKeyword_0; }
		
		//id=ID
		public Assignment getIdAssignment_1() { return cIdAssignment_1; }
		
		//ID
		public RuleCall getIdIDTerminalRuleCall_1_0() { return cIdIDTerminalRuleCall_1_0; }
		
		//descriptor=STRING_VALUE?
		public Assignment getDescriptorAssignment_2() { return cDescriptorAssignment_2; }
		
		//STRING_VALUE
		public RuleCall getDescriptorSTRING_VALUETerminalRuleCall_2_0() { return cDescriptorSTRING_VALUETerminalRuleCall_2_0; }
		
		//':'
		public Keyword getColonKeyword_3() { return cColonKeyword_3; }
		
		//expr=OwnedExpression
		public Assignment getExprAssignment_4() { return cExprAssignment_4; }
		
		//OwnedExpression
		public RuleCall getExprOwnedExpressionParserRuleCall_4_0() { return cExprOwnedExpressionParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class AnonGuaranteeStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.AnonGuaranteeStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGuaranteeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cExprAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExprOwnedExpressionParserRuleCall_1_0 = (RuleCall)cExprAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//AnonGuaranteeStatement:
		//    'guarantee' expr=OwnedExpression ';'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'guarantee' expr=OwnedExpression ';'
		public Group getGroup() { return cGroup; }
		
		//'guarantee'
		public Keyword getGuaranteeKeyword_0() { return cGuaranteeKeyword_0; }
		
		//expr=OwnedExpression
		public Assignment getExprAssignment_1() { return cExprAssignment_1; }
		
		//OwnedExpression
		public RuleCall getExprOwnedExpressionParserRuleCall_1_0() { return cExprOwnedExpressionParserRuleCall_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	public class DataElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.DataElement");
		private final Assignment cDataElementAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cDataElementDataSubcomponentTypeCrossReference_0 = (CrossReference)cDataElementAssignment.eContents().get(0);
		private final RuleCall cDataElementDataSubcomponentTypeQualifiedNameParserRuleCall_0_1 = (RuleCall)cDataElementDataSubcomponentTypeCrossReference_0.eContents().get(1);
		
		////PREDICATE: // TODO
		////    ID
		////;
		////DoubleDotRef:
		//    //elm=[aadl2::NamedElement|QualifiedName]
		////;
		//DataElement returns DataElement:
		//    dataElement = [aadl2::DataSubcomponentType|QualifiedName]
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//dataElement = [aadl2::DataSubcomponentType|QualifiedName]
		public Assignment getDataElementAssignment() { return cDataElementAssignment; }
		
		//[aadl2::DataSubcomponentType|QualifiedName]
		public CrossReference getDataElementDataSubcomponentTypeCrossReference_0() { return cDataElementDataSubcomponentTypeCrossReference_0; }
		
		//QualifiedName
		public RuleCall getDataElementDataSubcomponentTypeQualifiedNameParserRuleCall_0_1() { return cDataElementDataSubcomponentTypeQualifiedNameParserRuleCall_0_1; }
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
	public class SlangDefDefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangDefDef");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDefKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSlangDefIDParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cTypeParamsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTypeParamsSlangTypeParamsParserRuleCall_2_0 = (RuleCall)cTypeParamsAssignment_2.eContents().get(0);
		private final Assignment cParamsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cParamsSlangDefParamsParserRuleCall_3_0 = (RuleCall)cParamsAssignment_3.eContents().get(0);
		private final Keyword cColonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cTypeAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cTypeSlangTypeParserRuleCall_5_0 = (RuleCall)cTypeAssignment_5.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cMethodContractAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cMethodContractSlangDefContractParserRuleCall_7_0 = (RuleCall)cMethodContractAssignment_7.eContents().get(0);
		private final Assignment cBodyAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cBodyOwnedExpressionParserRuleCall_8_0 = (RuleCall)cBodyAssignment_8.eContents().get(0);
		
		////SlangDefDeclDef: 'def' SlangDefMods? sde=SlangDefExt? name=SlangDefID typeParams=SlangTypeParams? params=SlangDefParams? ':' type=SlangType c=SlangDefContract? ( ':=' e=OwnedExpression )? ;
		////SlangDefDecl: SlangDefMods? 'def'
		////    //sde=SlangDefExt?
		////    name=SlangDefID typeParams=SlangTypeParams? params=SlangDefParams? ':' type=SlangType c=SlangDefContract?
		////;
		//SlangDefDef:
		//     //defMods=SlangDefMods
		//     'def'
		//     //sde=SlangDefExt?
		//     name=SlangDefID
		//        typeParams=SlangTypeParams? params=SlangDefParams ':' type=SlangType // TODO: make parens optional if no params, requires codegen/sym-resolver modifications
		//        ':=' methodContract=SlangDefContract body=OwnedExpression
		//;
		@Override public ParserRule getRule() { return rule; }
		
		////defMods=SlangDefMods
		//'def'
		////sde=SlangDefExt?
		//name=SlangDefID
		//   typeParams=SlangTypeParams? params=SlangDefParams ':' type=SlangType // TODO: make parens optional if no params, requires codegen/sym-resolver modifications
		//   ':=' methodContract=SlangDefContract body=OwnedExpression
		public Group getGroup() { return cGroup; }
		
		////defMods=SlangDefMods
		//'def'
		public Keyword getDefKeyword_0() { return cDefKeyword_0; }
		
		////sde=SlangDefExt?
		//name=SlangDefID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//SlangDefID
		public RuleCall getNameSlangDefIDParserRuleCall_1_0() { return cNameSlangDefIDParserRuleCall_1_0; }
		
		//typeParams=SlangTypeParams?
		public Assignment getTypeParamsAssignment_2() { return cTypeParamsAssignment_2; }
		
		//SlangTypeParams
		public RuleCall getTypeParamsSlangTypeParamsParserRuleCall_2_0() { return cTypeParamsSlangTypeParamsParserRuleCall_2_0; }
		
		//params=SlangDefParams
		public Assignment getParamsAssignment_3() { return cParamsAssignment_3; }
		
		//SlangDefParams
		public RuleCall getParamsSlangDefParamsParserRuleCall_3_0() { return cParamsSlangDefParamsParserRuleCall_3_0; }
		
		//':'
		public Keyword getColonKeyword_4() { return cColonKeyword_4; }
		
		//type=SlangType
		public Assignment getTypeAssignment_5() { return cTypeAssignment_5; }
		
		//SlangType
		public RuleCall getTypeSlangTypeParserRuleCall_5_0() { return cTypeSlangTypeParserRuleCall_5_0; }
		
		//// TODO: make parens optional if no params, requires codegen/sym-resolver modifications
		//       ':='
		public Keyword getColonEqualsSignKeyword_6() { return cColonEqualsSignKeyword_6; }
		
		//methodContract=SlangDefContract
		public Assignment getMethodContractAssignment_7() { return cMethodContractAssignment_7; }
		
		//SlangDefContract
		public RuleCall getMethodContractSlangDefContractParserRuleCall_7_0() { return cMethodContractSlangDefContractParserRuleCall_7_0; }
		
		//body=OwnedExpression
		public Assignment getBodyAssignment_8() { return cBodyAssignment_8; }
		
		//OwnedExpression
		public RuleCall getBodyOwnedExpressionParserRuleCall_8_0() { return cBodyOwnedExpressionParserRuleCall_8_0; }
	}
	public class SlangDefIDElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangDefID");
		private final RuleCall cIDTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		////SlangDefMods: 'strict' | 'memoize' | 'mut' | 'spec' ;
		////SlangDefMods: '@strictpure' | '@pure';
		////SlangDefExt: '(' name=ID ':' typeName=SlangType ')' ;
		//// NOTE: removing Operator as that's part of the Slang expr language and therefore will not be
		////       present in kerml's expression language. This is probably okay since, for e.g., "def + ()..."
		////       isn't valid Slang anyway
		//SlangDefID: ID;
		@Override public ParserRule getRule() { return rule; }
		
		//ID
		public RuleCall getIDTerminalRuleCall() { return cIDTerminalRuleCall; }
	}
	public class SlangDefParamsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangDefParams");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cParamsAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cParamsSlangDefParamParserRuleCall_1_0_0 = (RuleCall)cParamsAssignment_1_0.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cGroup_1.eContents().get(1);
		private final Keyword cCommaKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cParamsAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cParamsSlangDefParamParserRuleCall_1_1_1_0 = (RuleCall)cParamsAssignment_1_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		// //| Operator ;
		//SlangDefParams: '(' (params+=SlangDefParam ( ',' params+=SlangDefParam )* )? ')' ;
		@Override public ParserRule getRule() { return rule; }
		
		//'(' (params+=SlangDefParam ( ',' params+=SlangDefParam )* )? ')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//(params+=SlangDefParam ( ',' params+=SlangDefParam )* )?
		public Group getGroup_1() { return cGroup_1; }
		
		//params+=SlangDefParam
		public Assignment getParamsAssignment_1_0() { return cParamsAssignment_1_0; }
		
		//SlangDefParam
		public RuleCall getParamsSlangDefParamParserRuleCall_1_0_0() { return cParamsSlangDefParamParserRuleCall_1_0_0; }
		
		//( ',' params+=SlangDefParam )*
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//','
		public Keyword getCommaKeyword_1_1_0() { return cCommaKeyword_1_1_0; }
		
		//params+=SlangDefParam
		public Assignment getParamsAssignment_1_1_1() { return cParamsAssignment_1_1_1; }
		
		//SlangDefParam
		public RuleCall getParamsSlangDefParamParserRuleCall_1_1_1_0() { return cParamsSlangDefParamParserRuleCall_1_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
	}
	public class SlangDefParamElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangDefParam");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cIsMethodDefAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Keyword cIsMethodDefEqualsSignGreaterThanSignKeyword_2_0 = (Keyword)cIsMethodDefAssignment_2.eContents().get(0);
		private final Assignment cTypeNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTypeNameSlangTypeParserRuleCall_3_0 = (RuleCall)cTypeNameAssignment_3.eContents().get(0);
		private final Assignment cIsVarArgAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final Keyword cIsVarArgAsteriskKeyword_4_0 = (Keyword)cIsVarArgAssignment_4.eContents().get(0);
		
		//SlangDefParam: name=ID ':' (isMethodDef ?= '=>'?) typeName=SlangType (isVarArg ?= '*'?) ;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ':' (isMethodDef ?= '=>'?) typeName=SlangType (isVarArg ?= '*'?)
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//(isMethodDef ?= '=>'?)
		public Assignment getIsMethodDefAssignment_2() { return cIsMethodDefAssignment_2; }
		
		//'=>'
		public Keyword getIsMethodDefEqualsSignGreaterThanSignKeyword_2_0() { return cIsMethodDefEqualsSignGreaterThanSignKeyword_2_0; }
		
		//typeName=SlangType
		public Assignment getTypeNameAssignment_3() { return cTypeNameAssignment_3; }
		
		//SlangType
		public RuleCall getTypeNameSlangTypeParserRuleCall_3_0() { return cTypeNameSlangTypeParserRuleCall_3_0; }
		
		//(isVarArg ?= '*'?)
		public Assignment getIsVarArgAssignment_4() { return cIsVarArgAssignment_4; }
		
		//'*'
		public Keyword getIsVarArgAsteriskKeyword_4_0() { return cIsVarArgAsteriskKeyword_4_0; }
	}
	public class SlangTypeParamsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangTypeParams");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTypeParamAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTypeParamSlangTypeParamParserRuleCall_1_0 = (RuleCall)cTypeParamAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cTypeParamAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cTypeParamSlangTypeParamParserRuleCall_2_1_0 = (RuleCall)cTypeParamAssignment_2_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//SlangTypeParams: '[' typeParam+=SlangTypeParam (  ',' typeParam+=SlangTypeParam )* ']' ;
		@Override public ParserRule getRule() { return rule; }
		
		//'[' typeParam+=SlangTypeParam (  ',' typeParam+=SlangTypeParam )* ']'
		public Group getGroup() { return cGroup; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_0() { return cLeftSquareBracketKeyword_0; }
		
		//typeParam+=SlangTypeParam
		public Assignment getTypeParamAssignment_1() { return cTypeParamAssignment_1; }
		
		//SlangTypeParam
		public RuleCall getTypeParamSlangTypeParamParserRuleCall_1_0() { return cTypeParamSlangTypeParamParserRuleCall_1_0; }
		
		//(  ',' typeParam+=SlangTypeParam )*
		public Group getGroup_2() { return cGroup_2; }
		
		//','
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//typeParam+=SlangTypeParam
		public Assignment getTypeParamAssignment_2_1() { return cTypeParamAssignment_2_1; }
		
		//SlangTypeParam
		public RuleCall getTypeParamSlangTypeParamParserRuleCall_2_1_0() { return cTypeParamSlangTypeParamParserRuleCall_2_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_3() { return cRightSquareBracketKeyword_3; }
	}
	public class SlangTypeParamElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangTypeParam");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cIsMutAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cIsMutMutKeyword_0_0 = (Keyword)cIsMutAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//SlangTypeParam: isMut ?= 'mut'? name=ID ;
		@Override public ParserRule getRule() { return rule; }
		
		//isMut ?= 'mut'? name=ID
		public Group getGroup() { return cGroup; }
		
		//isMut ?= 'mut'?
		public Assignment getIsMutAssignment_0() { return cIsMutAssignment_0; }
		
		//'mut'
		public Keyword getIsMutMutKeyword_0_0() { return cIsMutMutKeyword_0_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class SlangDefContractElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangDefContract");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSlangDefContractAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cGroup_1.eContents().get(0);
		private final Assignment cReadsAssignment_1_0_0 = (Assignment)cGroup_1_0.eContents().get(0);
		private final RuleCall cReadsSlangReadsParserRuleCall_1_0_0_0 = (RuleCall)cReadsAssignment_1_0_0.eContents().get(0);
		private final Keyword cSemicolonKeyword_1_0_1 = (Keyword)cGroup_1_0.eContents().get(1);
		private final Group cGroup_1_1 = (Group)cGroup_1.eContents().get(1);
		private final Assignment cRequiresAssignment_1_1_0 = (Assignment)cGroup_1_1.eContents().get(0);
		private final RuleCall cRequiresSlangRequiresParserRuleCall_1_1_0_0 = (RuleCall)cRequiresAssignment_1_1_0.eContents().get(0);
		private final Keyword cSemicolonKeyword_1_1_1 = (Keyword)cGroup_1_1.eContents().get(1);
		private final Group cGroup_1_2 = (Group)cGroup_1.eContents().get(2);
		private final Assignment cModifiesAssignment_1_2_0 = (Assignment)cGroup_1_2.eContents().get(0);
		private final RuleCall cModifiesSlangModifiesParserRuleCall_1_2_0_0 = (RuleCall)cModifiesAssignment_1_2_0.eContents().get(0);
		private final Keyword cSemicolonKeyword_1_2_1 = (Keyword)cGroup_1_2.eContents().get(1);
		private final Group cGroup_1_3 = (Group)cGroup_1.eContents().get(3);
		private final Assignment cEnsuresAssignment_1_3_0 = (Assignment)cGroup_1_3.eContents().get(0);
		private final RuleCall cEnsuresSlangEnsuresParserRuleCall_1_3_0_0 = (RuleCall)cEnsuresAssignment_1_3_0.eContents().get(0);
		private final Keyword cSemicolonKeyword_1_3_1 = (Keyword)cGroup_1_3.eContents().get(1);
		
		//SlangDefContract
		//    : {SlangDefContract}
		//      (
		//        ( reads=SlangReads ';' )?
		//        ( requires=SlangRequires ';' )?
		//        ( modifies=SlangModifies ';' )?
		//        ( ensures=SlangEnsures ';' )?
		//      )
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//{SlangDefContract}
		//     (
		//       ( reads=SlangReads ';' )?
		//       ( requires=SlangRequires ';' )?
		//       ( modifies=SlangModifies ';' )?
		//       ( ensures=SlangEnsures ';' )?
		//     )
		public Group getGroup() { return cGroup; }
		
		//{SlangDefContract}
		public Action getSlangDefContractAction_0() { return cSlangDefContractAction_0; }
		
		//(
		//  ( reads=SlangReads ';' )?
		//  ( requires=SlangRequires ';' )?
		//  ( modifies=SlangModifies ';' )?
		//  ( ensures=SlangEnsures ';' )?
		//)
		public Group getGroup_1() { return cGroup_1; }
		
		//( reads=SlangReads ';' )?
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//reads=SlangReads
		public Assignment getReadsAssignment_1_0_0() { return cReadsAssignment_1_0_0; }
		
		//SlangReads
		public RuleCall getReadsSlangReadsParserRuleCall_1_0_0_0() { return cReadsSlangReadsParserRuleCall_1_0_0_0; }
		
		//';'
		public Keyword getSemicolonKeyword_1_0_1() { return cSemicolonKeyword_1_0_1; }
		
		//( requires=SlangRequires ';' )?
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//requires=SlangRequires
		public Assignment getRequiresAssignment_1_1_0() { return cRequiresAssignment_1_1_0; }
		
		//SlangRequires
		public RuleCall getRequiresSlangRequiresParserRuleCall_1_1_0_0() { return cRequiresSlangRequiresParserRuleCall_1_1_0_0; }
		
		//';'
		public Keyword getSemicolonKeyword_1_1_1() { return cSemicolonKeyword_1_1_1; }
		
		//( modifies=SlangModifies ';' )?
		public Group getGroup_1_2() { return cGroup_1_2; }
		
		//modifies=SlangModifies
		public Assignment getModifiesAssignment_1_2_0() { return cModifiesAssignment_1_2_0; }
		
		//SlangModifies
		public RuleCall getModifiesSlangModifiesParserRuleCall_1_2_0_0() { return cModifiesSlangModifiesParserRuleCall_1_2_0_0; }
		
		//';'
		public Keyword getSemicolonKeyword_1_2_1() { return cSemicolonKeyword_1_2_1; }
		
		//( ensures=SlangEnsures ';' )?
		public Group getGroup_1_3() { return cGroup_1_3; }
		
		//ensures=SlangEnsures
		public Assignment getEnsuresAssignment_1_3_0() { return cEnsuresAssignment_1_3_0; }
		
		//SlangEnsures
		public RuleCall getEnsuresSlangEnsuresParserRuleCall_1_3_0_0() { return cEnsuresSlangEnsuresParserRuleCall_1_3_0_0; }
		
		//';'
		public Keyword getSemicolonKeyword_1_3_1() { return cSemicolonKeyword_1_3_1; }
	}
	public class SlangInvariantElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangInvariant");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInvariantKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cExprsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExprsOwnedExpressionParserRuleCall_1_0 = (RuleCall)cExprsAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cExprsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cExprsOwnedExpressionParserRuleCall_2_1_0 = (RuleCall)cExprsAssignment_2_1.eContents().get(0);
		
		////SlangDefContractCase: {SlangDefContractCase} 'case' STRING_VALUE req=SlangRequires? ens=SlangEnsures? ;
		////SlangSuprs: '<:' superTypes+=SlangSupr ( ',' superTypes+=SlangSupr )* ;
		////SlangSupr: name=SlangName args=SlangTypeArgs? ;
		////SlangName: ID ( '.' ID )* ;
		////SlangExt: {SlangExt} 'extension' ID ( 'for' SlangName )?  '{' decl+=SlangDefDecl* '}' ;
		//SlangInvariant: 'invariant' exprs+=OwnedExpression ( ',' exprs+=OwnedExpression )* ;
		@Override public ParserRule getRule() { return rule; }
		
		//'invariant' exprs+=OwnedExpression ( ',' exprs+=OwnedExpression )*
		public Group getGroup() { return cGroup; }
		
		//'invariant'
		public Keyword getInvariantKeyword_0() { return cInvariantKeyword_0; }
		
		//exprs+=OwnedExpression
		public Assignment getExprsAssignment_1() { return cExprsAssignment_1; }
		
		//OwnedExpression
		public RuleCall getExprsOwnedExpressionParserRuleCall_1_0() { return cExprsOwnedExpressionParserRuleCall_1_0; }
		
		//( ',' exprs+=OwnedExpression )*
		public Group getGroup_2() { return cGroup_2; }
		
		//','
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//exprs+=OwnedExpression
		public Assignment getExprsAssignment_2_1() { return cExprsAssignment_2_1; }
		
		//OwnedExpression
		public RuleCall getExprsOwnedExpressionParserRuleCall_2_1_0() { return cExprsOwnedExpressionParserRuleCall_2_1_0; }
	}
	public class SlangRequiresElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangRequires");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAssumeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cExprsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExprsOwnedExpressionParserRuleCall_1_0 = (RuleCall)cExprsAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cExprsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cExprsOwnedExpressionParserRuleCall_2_1_0 = (RuleCall)cExprsAssignment_2_1.eContents().get(0);
		
		//SlangRequires: 'assume' exprs+=OwnedExpression ( ',' exprs+=OwnedExpression )*  ;
		@Override public ParserRule getRule() { return rule; }
		
		//'assume' exprs+=OwnedExpression ( ',' exprs+=OwnedExpression )*
		public Group getGroup() { return cGroup; }
		
		//'assume'
		public Keyword getAssumeKeyword_0() { return cAssumeKeyword_0; }
		
		//exprs+=OwnedExpression
		public Assignment getExprsAssignment_1() { return cExprsAssignment_1; }
		
		//OwnedExpression
		public RuleCall getExprsOwnedExpressionParserRuleCall_1_0() { return cExprsOwnedExpressionParserRuleCall_1_0; }
		
		//( ',' exprs+=OwnedExpression )*
		public Group getGroup_2() { return cGroup_2; }
		
		//','
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//exprs+=OwnedExpression
		public Assignment getExprsAssignment_2_1() { return cExprsAssignment_2_1; }
		
		//OwnedExpression
		public RuleCall getExprsOwnedExpressionParserRuleCall_2_1_0() { return cExprsOwnedExpressionParserRuleCall_2_1_0; }
	}
	public class SlangReadsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangReads");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cReadsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cExprsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExprsOwnedExpressionParserRuleCall_1_0 = (RuleCall)cExprsAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cExprsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cExprsOwnedExpressionParserRuleCall_2_1_0 = (RuleCall)cExprsAssignment_2_1.eContents().get(0);
		
		//SlangReads: 'reads' exprs+=OwnedExpression ( ',' exprs+=OwnedExpression )* ;
		@Override public ParserRule getRule() { return rule; }
		
		//'reads' exprs+=OwnedExpression ( ',' exprs+=OwnedExpression )*
		public Group getGroup() { return cGroup; }
		
		//'reads'
		public Keyword getReadsKeyword_0() { return cReadsKeyword_0; }
		
		//exprs+=OwnedExpression
		public Assignment getExprsAssignment_1() { return cExprsAssignment_1; }
		
		//OwnedExpression
		public RuleCall getExprsOwnedExpressionParserRuleCall_1_0() { return cExprsOwnedExpressionParserRuleCall_1_0; }
		
		//( ',' exprs+=OwnedExpression )*
		public Group getGroup_2() { return cGroup_2; }
		
		//','
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//exprs+=OwnedExpression
		public Assignment getExprsAssignment_2_1() { return cExprsAssignment_2_1; }
		
		//OwnedExpression
		public RuleCall getExprsOwnedExpressionParserRuleCall_2_1_0() { return cExprsOwnedExpressionParserRuleCall_2_1_0; }
	}
	public class SlangModifiesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangModifies");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cModifiesKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cExprsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExprsOwnedExpressionParserRuleCall_1_0 = (RuleCall)cExprsAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cExprsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cExprsOwnedExpressionParserRuleCall_2_1_0 = (RuleCall)cExprsAssignment_2_1.eContents().get(0);
		
		//SlangModifies: 'modifies' exprs+=OwnedExpression ( ',' exprs+=OwnedExpression )*  ;
		@Override public ParserRule getRule() { return rule; }
		
		//'modifies' exprs+=OwnedExpression ( ',' exprs+=OwnedExpression )*
		public Group getGroup() { return cGroup; }
		
		//'modifies'
		public Keyword getModifiesKeyword_0() { return cModifiesKeyword_0; }
		
		//exprs+=OwnedExpression
		public Assignment getExprsAssignment_1() { return cExprsAssignment_1; }
		
		//OwnedExpression
		public RuleCall getExprsOwnedExpressionParserRuleCall_1_0() { return cExprsOwnedExpressionParserRuleCall_1_0; }
		
		//( ',' exprs+=OwnedExpression )*
		public Group getGroup_2() { return cGroup_2; }
		
		//','
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//exprs+=OwnedExpression
		public Assignment getExprsAssignment_2_1() { return cExprsAssignment_2_1; }
		
		//OwnedExpression
		public RuleCall getExprsOwnedExpressionParserRuleCall_2_1_0() { return cExprsOwnedExpressionParserRuleCall_2_1_0; }
	}
	public class SlangEnsuresElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangEnsures");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGuaranteeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cExprsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExprsOwnedExpressionParserRuleCall_1_0 = (RuleCall)cExprsAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cExprsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cExprsOwnedExpressionParserRuleCall_2_1_0 = (RuleCall)cExprsAssignment_2_1.eContents().get(0);
		
		//SlangEnsures: 'guarantee'  exprs+=OwnedExpression ( ',' exprs+=OwnedExpression )* ;
		@Override public ParserRule getRule() { return rule; }
		
		//'guarantee'  exprs+=OwnedExpression ( ',' exprs+=OwnedExpression )*
		public Group getGroup() { return cGroup; }
		
		//'guarantee'
		public Keyword getGuaranteeKeyword_0() { return cGuaranteeKeyword_0; }
		
		//exprs+=OwnedExpression
		public Assignment getExprsAssignment_1() { return cExprsAssignment_1; }
		
		//OwnedExpression
		public RuleCall getExprsOwnedExpressionParserRuleCall_1_0() { return cExprsOwnedExpressionParserRuleCall_1_0; }
		
		//( ',' exprs+=OwnedExpression )*
		public Group getGroup_2() { return cGroup_2; }
		
		//','
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//exprs+=OwnedExpression
		public Assignment getExprsAssignment_2_1() { return cExprsAssignment_2_1; }
		
		//OwnedExpression
		public RuleCall getExprsOwnedExpressionParserRuleCall_2_1_0() { return cExprsOwnedExpressionParserRuleCall_2_1_0; }
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
		private final RuleCall cTypeNameDataSubcomponentTypeQualifiedNameParserRuleCall_0_1 = (RuleCall)cTypeNameDataSubcomponentTypeCrossReference_0.eContents().get(1);
		
		//SlangBaseType returns SlangType
		//    : typeName=[aadl2::DataSubcomponentType|QualifiedName]//ID SlangTypeArgs?
		//    //| '(' ( SlangType ( ',' SlangType )* )? ')'
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//typeName=[aadl2::DataSubcomponentType|QualifiedName]
		public Assignment getTypeNameAssignment() { return cTypeNameAssignment; }
		
		//[aadl2::DataSubcomponentType|QualifiedName]
		public CrossReference getTypeNameDataSubcomponentTypeCrossReference_0() { return cTypeNameDataSubcomponentTypeCrossReference_0; }
		
		//QualifiedName
		public RuleCall getTypeNameDataSubcomponentTypeQualifiedNameParserRuleCall_0_1() { return cTypeNameDataSubcomponentTypeQualifiedNameParserRuleCall_0_1; }
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
		private final RuleCall cCondOwnedExpressionParserRuleCall_1_2_0 = (RuleCall)cCondAssignment_1_2.eContents().get(0);
		private final Assignment cBAssignment_1_3 = (Assignment)cGroup_1.eContents().get(3);
		private final RuleCall cBSlangBlockParserRuleCall_1_3_0 = (RuleCall)cBAssignment_1_3.eContents().get(0);
		private final Assignment cEAssignment_1_4 = (Assignment)cGroup_1.eContents().get(4);
		private final RuleCall cESlangElseParserRuleCall_1_4_0 = (RuleCall)cEAssignment_1_4.eContents().get(0);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Action cSlangWhileStmtAction_2_0 = (Action)cGroup_2.eContents().get(0);
		private final Keyword cWhileKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Assignment cCondAssignment_2_2 = (Assignment)cGroup_2.eContents().get(2);
		private final RuleCall cCondOwnedExpressionParserRuleCall_2_2_0 = (RuleCall)cCondAssignment_2_2.eContents().get(0);
		private final Assignment cLAssignment_2_3 = (Assignment)cGroup_2.eContents().get(3);
		private final RuleCall cLSlangLoopContractParserRuleCall_2_3_0 = (RuleCall)cLAssignment_2_3.eContents().get(0);
		private final Assignment cBAssignment_2_4 = (Assignment)cGroup_2.eContents().get(4);
		private final RuleCall cBSlangBlockParserRuleCall_2_4_0 = (RuleCall)cBAssignment_2_4.eContents().get(0);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final Action cSlangMatchStmtAction_3_0 = (Action)cGroup_3.eContents().get(0);
		private final Keyword cMatchKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cTestExprAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final RuleCall cTestExprOwnedExpressionParserRuleCall_3_2_0 = (RuleCall)cTestExprAssignment_3_2.eContents().get(0);
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
		private final RuleCall cEOwnedExpressionParserRuleCall_5_2_0 = (RuleCall)cEAssignment_5_2.eContents().get(0);
		private final RuleCall cSTRING_VALUETerminalRuleCall_5_3 = (RuleCall)cGroup_5.eContents().get(3);
		private final Group cGroup_6 = (Group)cAlternatives.eContents().get(6);
		private final Action cSlangAssertStmtAction_6_0 = (Action)cGroup_6.eContents().get(0);
		private final Keyword cAssertKeyword_6_1 = (Keyword)cGroup_6.eContents().get(1);
		private final Assignment cEAssignment_6_2 = (Assignment)cGroup_6.eContents().get(2);
		private final RuleCall cEOwnedExpressionParserRuleCall_6_2_0 = (RuleCall)cEAssignment_6_2.eContents().get(0);
		private final RuleCall cSTRING_VALUETerminalRuleCall_6_3 = (RuleCall)cGroup_6.eContents().get(3);
		private final Group cGroup_7 = (Group)cAlternatives.eContents().get(7);
		private final Action cSlangHaltStmtAction_7_0 = (Action)cGroup_7.eContents().get(0);
		private final Keyword cHaltKeyword_7_1 = (Keyword)cGroup_7.eContents().get(1);
		private final RuleCall cSTRING_VALUETerminalRuleCall_7_2 = (RuleCall)cGroup_7.eContents().get(2);
		private final Group cGroup_8 = (Group)cAlternatives.eContents().get(8);
		private final Action cSlangDoStmtAction_8_0 = (Action)cGroup_8.eContents().get(0);
		private final Keyword cDoKeyword_8_1 = (Keyword)cGroup_8.eContents().get(1);
		private final Assignment cEAssignment_8_2 = (Assignment)cGroup_8.eContents().get(2);
		private final RuleCall cEOwnedExpressionParserRuleCall_8_2_0 = (RuleCall)cEAssignment_8_2.eContents().get(0);
		
		////SlangTypeArgs: '[' types+=SlangType ( ',' types+=SlangType )* ']' ;
		//// The following is replaced by KerML's expression language
		//SlangStmt
		//    : {SlangVarDef} d=SlangVarDef
		//    | {SlangIfStmt} 'if' cond=OwnedExpression b=SlangBlock e=SlangElse?
		//    | {SlangWhileStmt} 'while' cond=OwnedExpression l=SlangLoopContract b=SlangBlock
		////    | ({SlangForStmt} 'for' range+=SlangForRange ( ','  range+=SlangForRange )*) l=SlangLoopContract b=SlangBlock
		//    | {SlangMatchStmt} 'match' testExpr=OwnedExpression '{' c+=SlangCase* '}'
		//    | {SlangSpecStmt} 'spec' b=SlangBlock
		//    | {SlangAssumeStmt} 'assume' e=OwnedExpression STRING_VALUE?
		//    | {SlangAssertStmt} 'assert' e=OwnedExpression STRING_VALUE?
		//    | {SlangHaltStmt} 'halt' STRING_VALUE?
		//    | {SlangDoStmt} 'do' e=OwnedExpression
		//    // FIXME: This causes a "multiple alternatives" warning.
		//    //| {SlangIdStmt} portOrSubcomponentOrStateVar=[ecore::EObject|ID]
		//    //  ( ':'
		//    //  | l+=SlangLHSSuffix* ( ( ':=' | DEFOP ) e=OwnedExpression )?
		//    //  )
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		// {SlangVarDef} d=SlangVarDef
		//    | {SlangIfStmt} 'if' cond=OwnedExpression b=SlangBlock e=SlangElse?
		//    | {SlangWhileStmt} 'while' cond=OwnedExpression l=SlangLoopContract b=SlangBlock
		////    | ({SlangForStmt} 'for' range+=SlangForRange ( ','  range+=SlangForRange )*) l=SlangLoopContract b=SlangBlock
		//    | {SlangMatchStmt} 'match' testExpr=OwnedExpression '{' c+=SlangCase* '}'
		//    | {SlangSpecStmt} 'spec' b=SlangBlock
		//    | {SlangAssumeStmt} 'assume' e=OwnedExpression STRING_VALUE?
		//    | {SlangAssertStmt} 'assert' e=OwnedExpression STRING_VALUE?
		//    | {SlangHaltStmt} 'halt' STRING_VALUE?
		//    | {SlangDoStmt} 'do' e=OwnedExpression
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{SlangVarDef} d=SlangVarDef
		public Group getGroup_0() { return cGroup_0; }
		
		//{SlangVarDef}
		public Action getSlangVarDefAction_0_0() { return cSlangVarDefAction_0_0; }
		
		//d=SlangVarDef
		public Assignment getDAssignment_0_1() { return cDAssignment_0_1; }
		
		//SlangVarDef
		public RuleCall getDSlangVarDefParserRuleCall_0_1_0() { return cDSlangVarDefParserRuleCall_0_1_0; }
		
		//{SlangIfStmt} 'if' cond=OwnedExpression b=SlangBlock e=SlangElse?
		public Group getGroup_1() { return cGroup_1; }
		
		//{SlangIfStmt}
		public Action getSlangIfStmtAction_1_0() { return cSlangIfStmtAction_1_0; }
		
		//'if'
		public Keyword getIfKeyword_1_1() { return cIfKeyword_1_1; }
		
		//cond=OwnedExpression
		public Assignment getCondAssignment_1_2() { return cCondAssignment_1_2; }
		
		//OwnedExpression
		public RuleCall getCondOwnedExpressionParserRuleCall_1_2_0() { return cCondOwnedExpressionParserRuleCall_1_2_0; }
		
		//b=SlangBlock
		public Assignment getBAssignment_1_3() { return cBAssignment_1_3; }
		
		//SlangBlock
		public RuleCall getBSlangBlockParserRuleCall_1_3_0() { return cBSlangBlockParserRuleCall_1_3_0; }
		
		//e=SlangElse?
		public Assignment getEAssignment_1_4() { return cEAssignment_1_4; }
		
		//SlangElse
		public RuleCall getESlangElseParserRuleCall_1_4_0() { return cESlangElseParserRuleCall_1_4_0; }
		
		//{SlangWhileStmt} 'while' cond=OwnedExpression l=SlangLoopContract b=SlangBlock
		public Group getGroup_2() { return cGroup_2; }
		
		//{SlangWhileStmt}
		public Action getSlangWhileStmtAction_2_0() { return cSlangWhileStmtAction_2_0; }
		
		//'while'
		public Keyword getWhileKeyword_2_1() { return cWhileKeyword_2_1; }
		
		//cond=OwnedExpression
		public Assignment getCondAssignment_2_2() { return cCondAssignment_2_2; }
		
		//OwnedExpression
		public RuleCall getCondOwnedExpressionParserRuleCall_2_2_0() { return cCondOwnedExpressionParserRuleCall_2_2_0; }
		
		//l=SlangLoopContract
		public Assignment getLAssignment_2_3() { return cLAssignment_2_3; }
		
		//SlangLoopContract
		public RuleCall getLSlangLoopContractParserRuleCall_2_3_0() { return cLSlangLoopContractParserRuleCall_2_3_0; }
		
		//b=SlangBlock
		public Assignment getBAssignment_2_4() { return cBAssignment_2_4; }
		
		//SlangBlock
		public RuleCall getBSlangBlockParserRuleCall_2_4_0() { return cBSlangBlockParserRuleCall_2_4_0; }
		
		//{SlangMatchStmt} 'match' testExpr=OwnedExpression '{' c+=SlangCase* '}'
		public Group getGroup_3() { return cGroup_3; }
		
		//{SlangMatchStmt}
		public Action getSlangMatchStmtAction_3_0() { return cSlangMatchStmtAction_3_0; }
		
		//'match'
		public Keyword getMatchKeyword_3_1() { return cMatchKeyword_3_1; }
		
		//testExpr=OwnedExpression
		public Assignment getTestExprAssignment_3_2() { return cTestExprAssignment_3_2; }
		
		//OwnedExpression
		public RuleCall getTestExprOwnedExpressionParserRuleCall_3_2_0() { return cTestExprOwnedExpressionParserRuleCall_3_2_0; }
		
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
		
		//{SlangAssumeStmt} 'assume' e=OwnedExpression STRING_VALUE?
		public Group getGroup_5() { return cGroup_5; }
		
		//{SlangAssumeStmt}
		public Action getSlangAssumeStmtAction_5_0() { return cSlangAssumeStmtAction_5_0; }
		
		//'assume'
		public Keyword getAssumeKeyword_5_1() { return cAssumeKeyword_5_1; }
		
		//e=OwnedExpression
		public Assignment getEAssignment_5_2() { return cEAssignment_5_2; }
		
		//OwnedExpression
		public RuleCall getEOwnedExpressionParserRuleCall_5_2_0() { return cEOwnedExpressionParserRuleCall_5_2_0; }
		
		//STRING_VALUE?
		public RuleCall getSTRING_VALUETerminalRuleCall_5_3() { return cSTRING_VALUETerminalRuleCall_5_3; }
		
		//{SlangAssertStmt} 'assert' e=OwnedExpression STRING_VALUE?
		public Group getGroup_6() { return cGroup_6; }
		
		//{SlangAssertStmt}
		public Action getSlangAssertStmtAction_6_0() { return cSlangAssertStmtAction_6_0; }
		
		//'assert'
		public Keyword getAssertKeyword_6_1() { return cAssertKeyword_6_1; }
		
		//e=OwnedExpression
		public Assignment getEAssignment_6_2() { return cEAssignment_6_2; }
		
		//OwnedExpression
		public RuleCall getEOwnedExpressionParserRuleCall_6_2_0() { return cEOwnedExpressionParserRuleCall_6_2_0; }
		
		//STRING_VALUE?
		public RuleCall getSTRING_VALUETerminalRuleCall_6_3() { return cSTRING_VALUETerminalRuleCall_6_3; }
		
		//{SlangHaltStmt} 'halt' STRING_VALUE?
		public Group getGroup_7() { return cGroup_7; }
		
		//{SlangHaltStmt}
		public Action getSlangHaltStmtAction_7_0() { return cSlangHaltStmtAction_7_0; }
		
		//'halt'
		public Keyword getHaltKeyword_7_1() { return cHaltKeyword_7_1; }
		
		//STRING_VALUE?
		public RuleCall getSTRING_VALUETerminalRuleCall_7_2() { return cSTRING_VALUETerminalRuleCall_7_2; }
		
		//{SlangDoStmt} 'do' e=OwnedExpression
		public Group getGroup_8() { return cGroup_8; }
		
		//{SlangDoStmt}
		public Action getSlangDoStmtAction_8_0() { return cSlangDoStmtAction_8_0; }
		
		//'do'
		public Keyword getDoKeyword_8_1() { return cDoKeyword_8_1; }
		
		//e=OwnedExpression
		public Assignment getEAssignment_8_2() { return cEAssignment_8_2; }
		
		//OwnedExpression
		public RuleCall getEOwnedExpressionParserRuleCall_8_2_0() { return cEOwnedExpressionParserRuleCall_8_2_0; }
	}
	public class SlangElseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangElse");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cElseKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Keyword cIfKeyword_1_0_0 = (Keyword)cGroup_1_0.eContents().get(0);
		private final Assignment cCondAssignment_1_0_1 = (Assignment)cGroup_1_0.eContents().get(1);
		private final RuleCall cCondOwnedExpressionParserRuleCall_1_0_1_0 = (RuleCall)cCondAssignment_1_0_1.eContents().get(0);
		private final Assignment cBAssignment_1_0_2 = (Assignment)cGroup_1_0.eContents().get(2);
		private final RuleCall cBSlangBlockParserRuleCall_1_0_2_0 = (RuleCall)cBAssignment_1_0_2.eContents().get(0);
		private final Assignment cEAssignment_1_0_3 = (Assignment)cGroup_1_0.eContents().get(3);
		private final RuleCall cESlangElseParserRuleCall_1_0_3_0 = (RuleCall)cEAssignment_1_0_3.eContents().get(0);
		private final RuleCall cSlangBlockParserRuleCall_1_1 = (RuleCall)cAlternatives_1.eContents().get(1);
		
		//SlangElse
		//    : 'else'
		//        ( 'if' cond=OwnedExpression b=SlangBlock e=SlangElse?
		//        | SlangBlock
		//        )
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//'else'
		//       ( 'if' cond=OwnedExpression b=SlangBlock e=SlangElse?
		//       | SlangBlock
		//       )
		public Group getGroup() { return cGroup; }
		
		//'else'
		public Keyword getElseKeyword_0() { return cElseKeyword_0; }
		
		//( 'if' cond=OwnedExpression b=SlangBlock e=SlangElse?
		//| SlangBlock
		//)
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//'if' cond=OwnedExpression b=SlangBlock e=SlangElse?
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//'if'
		public Keyword getIfKeyword_1_0_0() { return cIfKeyword_1_0_0; }
		
		//cond=OwnedExpression
		public Assignment getCondAssignment_1_0_1() { return cCondAssignment_1_0_1; }
		
		//OwnedExpression
		public RuleCall getCondOwnedExpressionParserRuleCall_1_0_1_0() { return cCondOwnedExpressionParserRuleCall_1_0_1_0; }
		
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
	public class SlangCaseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangCase");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCaseKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPatternAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cPatternSlangPatternParserRuleCall_1_0 = (RuleCall)cPatternAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cIfKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cEAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cEOwnedExpressionParserRuleCall_2_1_0 = (RuleCall)cEAssignment_2_1.eContents().get(0);
		private final Keyword cEqualsSignGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cSAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSSlangStmtParserRuleCall_4_0 = (RuleCall)cSAssignment_4.eContents().get(0);
		
		////SlangLHSSuffix
		////    : {SlangFieldLookup} '.' ID
		////    | {SlangMethodCall} '(' ( exprs+=OwnedExpression ( ',' exprs+=OwnedExpression )* )? ')'
		////    ;
		//SlangCase: 'case' pattern=SlangPattern ( 'if' e=OwnedExpression )? '=>' s+=SlangStmt* ;
		@Override public ParserRule getRule() { return rule; }
		
		//'case' pattern=SlangPattern ( 'if' e=OwnedExpression )? '=>' s+=SlangStmt*
		public Group getGroup() { return cGroup; }
		
		//'case'
		public Keyword getCaseKeyword_0() { return cCaseKeyword_0; }
		
		//pattern=SlangPattern
		public Assignment getPatternAssignment_1() { return cPatternAssignment_1; }
		
		//SlangPattern
		public RuleCall getPatternSlangPatternParserRuleCall_1_0() { return cPatternSlangPatternParserRuleCall_1_0; }
		
		//( 'if' e=OwnedExpression )?
		public Group getGroup_2() { return cGroup_2; }
		
		//'if'
		public Keyword getIfKeyword_2_0() { return cIfKeyword_2_0; }
		
		//e=OwnedExpression
		public Assignment getEAssignment_2_1() { return cEAssignment_2_1; }
		
		//OwnedExpression
		public RuleCall getEOwnedExpressionParserRuleCall_2_1_0() { return cEOwnedExpressionParserRuleCall_2_1_0; }
		
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
		private final RuleCall cInitOwnedExpressionParserRuleCall_4_0 = (RuleCall)cInitAssignment_4.eContents().get(0);
		
		////SlangTypedVarDef returns SlangVarDef:
		////    SlangVarMod SlangPattern ':' typeName=SlangType ':=' init=OwnedExpression
		////;
		//SlangVarDef: SlangVarMod SlangPattern ( ':' typeName=SlangType )? ':=' init=OwnedExpression ;
		@Override public ParserRule getRule() { return rule; }
		
		//SlangVarMod SlangPattern ( ':' typeName=SlangType )? ':=' init=OwnedExpression
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
		
		//init=OwnedExpression
		public Assignment getInitAssignment_4() { return cInitAssignment_4; }
		
		//OwnedExpression
		public RuleCall getInitOwnedExpressionParserRuleCall_4_0() { return cInitOwnedExpressionParserRuleCall_4_0; }
	}
	public class SlangVarModElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangVarMod");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cValKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cVarKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		////SlangVarDeclDef returns SlangVarDef:
		////    SlangVarMod 'spec'? name=ID ':' typeName=SlangType ( ':=' init=OwnedExpression )?
		////;
		//SlangVarMod: 'val' | 'var' ;
		@Override public ParserRule getRule() { return rule; }
		
		//'val' | 'var'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'val'
		public Keyword getValKeyword_0() { return cValKeyword_0; }
		
		//'var'
		public Keyword getVarKeyword_1() { return cVarKeyword_1; }
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
	public class OwnedExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
		private final RuleCall cSlangExpressionParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//// OwnedExpression is the entry rule for SysMLv2's expression language
		//OwnedExpression :
		//    //: {BasicExp} terms+=SlangAccess ( ops+=Operator terms+=SlangAccess )*
		//    //| {IfElseExp} 'if' '(' ifCond=OwnedExpression ')' thenExpr=OwnedExpression 'else' elseExpr=OwnedExpression
		//    //| {QuantifiedExp} ( '\\all' | '\\some' | '∀' | '∃' ) qVar+=SlangQuantVar ( ',' qVar+=SlangQuantVar )* '=>' quantifiedExpr=OwnedExpression
		//    //| {UnaryExp} op=Operator accessExp=SlangAccess
		//    //;
		//    //{IfElseExp} 'if' '(' ifCond=OwnedExpression ')' thenExpr=OwnedExpression 'else' elseExpr=OwnedExpression
		//    //|
		//    //{QuantifiedExp} ( '\\all' | '\\some' | '∀' | '∃' ) qVar+=SlangQuantVar ( ',' qVar+=SlangQuantVar )* '=>' quantifiedExpr=OwnedExpression
		//    //ImpliesExpression
		//    SlangExpression
		//        ;
		@Override public ParserRule getRule() { return rule; }
		
		////: {BasicExp} terms+=SlangAccess ( ops+=Operator terms+=SlangAccess )*
		////| {IfElseExp} 'if' '(' ifCond=OwnedExpression ')' thenExpr=OwnedExpression 'else' elseExpr=OwnedExpression
		////| {QuantifiedExp} ( '\\all' | '\\some' | '∀' | '∃' ) qVar+=SlangQuantVar ( ',' qVar+=SlangQuantVar )* '=>' quantifiedExpr=OwnedExpression
		////| {UnaryExp} op=Operator accessExp=SlangAccess
		////;
		////{IfElseExp} 'if' '(' ifCond=OwnedExpression ')' thenExpr=OwnedExpression 'else' elseExpr=OwnedExpression
		////|
		////{QuantifiedExp} ( '\\all' | '\\some' | '∀' | '∃' ) qVar+=SlangQuantVar ( ',' qVar+=SlangQuantVar )* '=>' quantifiedExpr=OwnedExpression
		////ImpliesExpression
		//SlangExpression
		public RuleCall getSlangExpressionParserRuleCall() { return cSlangExpressionParserRuleCall; }
	}
	public class SlangExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangExpression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cImpliesExpressionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cIfElseExpAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cIfKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Assignment cIfCondAssignment_1_3 = (Assignment)cGroup_1.eContents().get(3);
		private final RuleCall cIfCondImpliesExpressionParserRuleCall_1_3_0 = (RuleCall)cIfCondAssignment_1_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_1_4 = (Keyword)cGroup_1.eContents().get(4);
		private final Assignment cThenExprAssignment_1_5 = (Assignment)cGroup_1.eContents().get(5);
		private final RuleCall cThenExprOwnedExpressionParserRuleCall_1_5_0 = (RuleCall)cThenExprAssignment_1_5.eContents().get(0);
		private final Keyword cElseKeyword_1_6 = (Keyword)cGroup_1.eContents().get(6);
		private final Assignment cElseExprAssignment_1_7 = (Assignment)cGroup_1.eContents().get(7);
		private final RuleCall cElseExprOwnedExpressionParserRuleCall_1_7_0 = (RuleCall)cElseExprAssignment_1_7.eContents().get(0);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Action cQuantifiedExpAction_2_0 = (Action)cGroup_2.eContents().get(0);
		private final Assignment cQuantifierAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final Alternatives cQuantifierAlternatives_2_1_0 = (Alternatives)cQuantifierAssignment_2_1.eContents().get(0);
		private final Keyword cQuantifierAllKeyword_2_1_0_0 = (Keyword)cQuantifierAlternatives_2_1_0.eContents().get(0);
		private final Keyword cQuantifierForAllKeyword_2_1_0_1 = (Keyword)cQuantifierAlternatives_2_1_0.eContents().get(1);
		private final Keyword cQuantifierExistsKeyword_2_1_0_2 = (Keyword)cQuantifierAlternatives_2_1_0.eContents().get(2);
		private final Keyword cQuantifierThereExistsKeyword_2_1_0_3 = (Keyword)cQuantifierAlternatives_2_1_0.eContents().get(3);
		private final Keyword cLeftParenthesisKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		private final Assignment cQuantRangeAssignment_2_3 = (Assignment)cGroup_2.eContents().get(3);
		private final RuleCall cQuantRangeQuantRangeParserRuleCall_2_3_0 = (RuleCall)cQuantRangeAssignment_2_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_2_4 = (Keyword)cGroup_2.eContents().get(4);
		private final Keyword cLeftParenthesisKeyword_2_5 = (Keyword)cGroup_2.eContents().get(5);
		private final Assignment cQuantParamAssignment_2_6 = (Assignment)cGroup_2.eContents().get(6);
		private final RuleCall cQuantParamQuantParamParserRuleCall_2_6_0 = (RuleCall)cQuantParamAssignment_2_6.eContents().get(0);
		private final Keyword cEqualsSignGreaterThanSignKeyword_2_7 = (Keyword)cGroup_2.eContents().get(7);
		private final Assignment cQuantifiedExprAssignment_2_8 = (Assignment)cGroup_2.eContents().get(8);
		private final RuleCall cQuantifiedExprOwnedExpressionParserRuleCall_2_8_0 = (RuleCall)cQuantifiedExprAssignment_2_8.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_2_9 = (Keyword)cGroup_2.eContents().get(9);
		
		//// NOTE: will need to wrap nested IfElseExp or QuantifiedExp in parens (which matches what Slang/Scala requires)
		////   e.g. true ->: (if (true) true else true)
		//SlangExpression returns GExpr
		//  : ImpliesExpression
		//  | {IfElseExp} 'if' '(' ifCond=ImpliesExpression ')' thenExpr=OwnedExpression 'else' elseExpr=OwnedExpression
		//  | {QuantifiedExp} quantifier=( 'All' | '∀' | 'Exists' | '∃' ) '(' quantRange=QuantRange ')'
		//          // TODO: the following is a function expression
		//          '(' quantParam=QuantParam '=>' quantifiedExpr=OwnedExpression ')';
		@Override public ParserRule getRule() { return rule; }
		
		//ImpliesExpression
		// | {IfElseExp} 'if' '(' ifCond=ImpliesExpression ')' thenExpr=OwnedExpression 'else' elseExpr=OwnedExpression
		// | {QuantifiedExp} quantifier=( 'All' | '∀' | 'Exists' | '∃' ) '(' quantRange=QuantRange ')'
		//         // TODO: the following is a function expression
		//         '(' quantParam=QuantParam '=>' quantifiedExpr=OwnedExpression ')'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ImpliesExpression
		public RuleCall getImpliesExpressionParserRuleCall_0() { return cImpliesExpressionParserRuleCall_0; }
		
		//{IfElseExp} 'if' '(' ifCond=ImpliesExpression ')' thenExpr=OwnedExpression 'else' elseExpr=OwnedExpression
		public Group getGroup_1() { return cGroup_1; }
		
		//{IfElseExp}
		public Action getIfElseExpAction_1_0() { return cIfElseExpAction_1_0; }
		
		//'if'
		public Keyword getIfKeyword_1_1() { return cIfKeyword_1_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1_2() { return cLeftParenthesisKeyword_1_2; }
		
		//ifCond=ImpliesExpression
		public Assignment getIfCondAssignment_1_3() { return cIfCondAssignment_1_3; }
		
		//ImpliesExpression
		public RuleCall getIfCondImpliesExpressionParserRuleCall_1_3_0() { return cIfCondImpliesExpressionParserRuleCall_1_3_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_1_4() { return cRightParenthesisKeyword_1_4; }
		
		//thenExpr=OwnedExpression
		public Assignment getThenExprAssignment_1_5() { return cThenExprAssignment_1_5; }
		
		//OwnedExpression
		public RuleCall getThenExprOwnedExpressionParserRuleCall_1_5_0() { return cThenExprOwnedExpressionParserRuleCall_1_5_0; }
		
		//'else'
		public Keyword getElseKeyword_1_6() { return cElseKeyword_1_6; }
		
		//elseExpr=OwnedExpression
		public Assignment getElseExprAssignment_1_7() { return cElseExprAssignment_1_7; }
		
		//OwnedExpression
		public RuleCall getElseExprOwnedExpressionParserRuleCall_1_7_0() { return cElseExprOwnedExpressionParserRuleCall_1_7_0; }
		
		//{QuantifiedExp} quantifier=( 'All' | '∀' | 'Exists' | '∃' ) '(' quantRange=QuantRange ')'
		//         // TODO: the following is a function expression
		//         '(' quantParam=QuantParam '=>' quantifiedExpr=OwnedExpression ')'
		public Group getGroup_2() { return cGroup_2; }
		
		//{QuantifiedExp}
		public Action getQuantifiedExpAction_2_0() { return cQuantifiedExpAction_2_0; }
		
		//quantifier=( 'All' | '∀' | 'Exists' | '∃' )
		public Assignment getQuantifierAssignment_2_1() { return cQuantifierAssignment_2_1; }
		
		//( 'All' | '∀' | 'Exists' | '∃' )
		public Alternatives getQuantifierAlternatives_2_1_0() { return cQuantifierAlternatives_2_1_0; }
		
		//'All'
		public Keyword getQuantifierAllKeyword_2_1_0_0() { return cQuantifierAllKeyword_2_1_0_0; }
		
		//'∀'
		public Keyword getQuantifierForAllKeyword_2_1_0_1() { return cQuantifierForAllKeyword_2_1_0_1; }
		
		//'Exists'
		public Keyword getQuantifierExistsKeyword_2_1_0_2() { return cQuantifierExistsKeyword_2_1_0_2; }
		
		//'∃'
		public Keyword getQuantifierThereExistsKeyword_2_1_0_3() { return cQuantifierThereExistsKeyword_2_1_0_3; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2_2() { return cLeftParenthesisKeyword_2_2; }
		
		//quantRange=QuantRange
		public Assignment getQuantRangeAssignment_2_3() { return cQuantRangeAssignment_2_3; }
		
		//QuantRange
		public RuleCall getQuantRangeQuantRangeParserRuleCall_2_3_0() { return cQuantRangeQuantRangeParserRuleCall_2_3_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2_4() { return cRightParenthesisKeyword_2_4; }
		
		//// TODO: the following is a function expression
		//'('
		public Keyword getLeftParenthesisKeyword_2_5() { return cLeftParenthesisKeyword_2_5; }
		
		//quantParam=QuantParam
		public Assignment getQuantParamAssignment_2_6() { return cQuantParamAssignment_2_6; }
		
		//QuantParam
		public RuleCall getQuantParamQuantParamParserRuleCall_2_6_0() { return cQuantParamQuantParamParserRuleCall_2_6_0; }
		
		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_2_7() { return cEqualsSignGreaterThanSignKeyword_2_7; }
		
		//quantifiedExpr=OwnedExpression
		public Assignment getQuantifiedExprAssignment_2_8() { return cQuantifiedExprAssignment_2_8; }
		
		//OwnedExpression
		public RuleCall getQuantifiedExprOwnedExpressionParserRuleCall_2_8_0() { return cQuantifiedExprOwnedExpressionParserRuleCall_2_8_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2_9() { return cRightParenthesisKeyword_2_9; }
	}
	public class QuantRangeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.QuantRange");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cLoAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cLoOwnedExpressionParserRuleCall_0_0 = (RuleCall)cLoAssignment_0.eContents().get(0);
		private final Assignment cExtentAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cExtentAlternatives_1_0 = (Alternatives)cExtentAssignment_1.eContents().get(0);
		private final Keyword cExtentToKeyword_1_0_0 = (Keyword)cExtentAlternatives_1_0.eContents().get(0);
		private final Keyword cExtentUntilKeyword_1_0_1 = (Keyword)cExtentAlternatives_1_0.eContents().get(1);
		private final Assignment cHighAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cHighOwnedExpressionParserRuleCall_2_0 = (RuleCall)cHighAssignment_2.eContents().get(0);
		
		//// TODO: maybe support 'arrayName.indices'
		//QuantRange: lo=OwnedExpression extent=( 'to' | 'until' ) high=OwnedExpression;
		@Override public ParserRule getRule() { return rule; }
		
		//lo=OwnedExpression extent=( 'to' | 'until' ) high=OwnedExpression
		public Group getGroup() { return cGroup; }
		
		//lo=OwnedExpression
		public Assignment getLoAssignment_0() { return cLoAssignment_0; }
		
		//OwnedExpression
		public RuleCall getLoOwnedExpressionParserRuleCall_0_0() { return cLoOwnedExpressionParserRuleCall_0_0; }
		
		//extent=( 'to' | 'until' )
		public Assignment getExtentAssignment_1() { return cExtentAssignment_1; }
		
		//( 'to' | 'until' )
		public Alternatives getExtentAlternatives_1_0() { return cExtentAlternatives_1_0; }
		
		//'to'
		public Keyword getExtentToKeyword_1_0_0() { return cExtentToKeyword_1_0_0; }
		
		//'until'
		public Keyword getExtentUntilKeyword_1_0_1() { return cExtentUntilKeyword_1_0_1; }
		
		//high=OwnedExpression
		public Assignment getHighAssignment_2() { return cHighAssignment_2; }
		
		//OwnedExpression
		public RuleCall getHighOwnedExpressionParserRuleCall_2_0() { return cHighOwnedExpressionParserRuleCall_2_0; }
	}
	public class QuantParamElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.QuantParam");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cNameAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_1_0 = (RuleCall)cNameAssignment_1_1.eContents().get(0);
		private final Keyword cColonKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Assignment cTypeNameAssignment_1_3 = (Assignment)cGroup_1.eContents().get(3);
		private final RuleCall cTypeNameSlangTypeParserRuleCall_1_3_0 = (RuleCall)cTypeNameAssignment_1_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_1_4 = (Keyword)cGroup_1.eContents().get(4);
		
		//QuantParam
		//    : name=ID
		//    | '(' name=ID ':' typeName=SlangType ')';
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		//   | '(' name=ID ':' typeName=SlangType ')'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//'(' name=ID ':' typeName=SlangType ')'
		public Group getGroup_1() { return cGroup_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1_0() { return cLeftParenthesisKeyword_1_0; }
		
		//name=ID
		public Assignment getNameAssignment_1_1() { return cNameAssignment_1_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_1_0() { return cNameIDTerminalRuleCall_1_1_0; }
		
		//':'
		public Keyword getColonKeyword_1_2() { return cColonKeyword_1_2; }
		
		//typeName=SlangType
		public Assignment getTypeNameAssignment_1_3() { return cTypeNameAssignment_1_3; }
		
		//SlangType
		public RuleCall getTypeNameSlangTypeParserRuleCall_1_3_0() { return cTypeNameSlangTypeParserRuleCall_1_3_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_1_4() { return cRightParenthesisKeyword_1_4; }
	}
	public class ImpliesExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.ImpliesExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cOrExpressionParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cImpliesExprLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cOpAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cOpImpliesOpsParserRuleCall_1_1_0 = (RuleCall)cOpAssignment_1_1.eContents().get(0);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightOrExpressionParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//ImpliesExpression returns GExpr
		//    : OrExpression ( {ImpliesExpr.left=current} op=ImpliesOps right=OrExpression )*;
		@Override public ParserRule getRule() { return rule; }
		
		//OrExpression ( {ImpliesExpr.left=current} op=ImpliesOps right=OrExpression )*
		public Group getGroup() { return cGroup; }
		
		//OrExpression
		public RuleCall getOrExpressionParserRuleCall_0() { return cOrExpressionParserRuleCall_0; }
		
		//( {ImpliesExpr.left=current} op=ImpliesOps right=OrExpression )*
		public Group getGroup_1() { return cGroup_1; }
		
		//{ImpliesExpr.left=current}
		public Action getImpliesExprLeftAction_1_0() { return cImpliesExprLeftAction_1_0; }
		
		//op=ImpliesOps
		public Assignment getOpAssignment_1_1() { return cOpAssignment_1_1; }
		
		//ImpliesOps
		public RuleCall getOpImpliesOpsParserRuleCall_1_1_0() { return cOpImpliesOpsParserRuleCall_1_1_0; }
		
		//right=OrExpression
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//OrExpression
		public RuleCall getRightOrExpressionParserRuleCall_1_2_0() { return cRightOrExpressionParserRuleCall_1_2_0; }
	}
	public class OrExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.OrExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cAndExpressionParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cOrExprLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cOpAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cOpOR_OPSTerminalRuleCall_1_1_0 = (RuleCall)cOpAssignment_1_1.eContents().get(0);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightAndExpressionParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//OrExpression returns GExpr
		//    : AndExpression ({OrExpr.left=current} op=OR_OPS right=AndExpression)*;
		@Override public ParserRule getRule() { return rule; }
		
		//AndExpression ({OrExpr.left=current} op=OR_OPS right=AndExpression)*
		public Group getGroup() { return cGroup; }
		
		//AndExpression
		public RuleCall getAndExpressionParserRuleCall_0() { return cAndExpressionParserRuleCall_0; }
		
		//({OrExpr.left=current} op=OR_OPS right=AndExpression)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{OrExpr.left=current}
		public Action getOrExprLeftAction_1_0() { return cOrExprLeftAction_1_0; }
		
		//op=OR_OPS
		public Assignment getOpAssignment_1_1() { return cOpAssignment_1_1; }
		
		//OR_OPS
		public RuleCall getOpOR_OPSTerminalRuleCall_1_1_0() { return cOpOR_OPSTerminalRuleCall_1_1_0; }
		
		//right=AndExpression
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//AndExpression
		public RuleCall getRightAndExpressionParserRuleCall_1_2_0() { return cRightAndExpressionParserRuleCall_1_2_0; }
	}
	public class AndExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.AndExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cEqualNotExpressionParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cAndExprLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cOpAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cOpAND_OPSTerminalRuleCall_1_1_0 = (RuleCall)cOpAssignment_1_1.eContents().get(0);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightEqualNotExpressionParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//// no hat ^ in Slang
		//AndExpression returns GExpr
		//    : EqualNotExpression ( {AndExpr.left=current} op=AND_OPS right=EqualNotExpression)*;
		@Override public ParserRule getRule() { return rule; }
		
		//EqualNotExpression ( {AndExpr.left=current} op=AND_OPS right=EqualNotExpression)*
		public Group getGroup() { return cGroup; }
		
		//EqualNotExpression
		public RuleCall getEqualNotExpressionParserRuleCall_0() { return cEqualNotExpressionParserRuleCall_0; }
		
		//( {AndExpr.left=current} op=AND_OPS right=EqualNotExpression)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{AndExpr.left=current}
		public Action getAndExprLeftAction_1_0() { return cAndExprLeftAction_1_0; }
		
		//op=AND_OPS
		public Assignment getOpAssignment_1_1() { return cOpAssignment_1_1; }
		
		//AND_OPS
		public RuleCall getOpAND_OPSTerminalRuleCall_1_1_0() { return cOpAND_OPSTerminalRuleCall_1_1_0; }
		
		//right=EqualNotExpression
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//EqualNotExpression
		public RuleCall getRightEqualNotExpressionParserRuleCall_1_2_0() { return cRightEqualNotExpressionParserRuleCall_1_2_0; }
	}
	public class EqualNotExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.EqualNotExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cLtGtExpressionParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cEqualNotExprLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cOpAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cOpEQUAL_NOT_OPSTerminalRuleCall_1_1_0 = (RuleCall)cOpAssignment_1_1.eContents().get(0);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightLtGtExpressionParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//EqualNotExpression returns GExpr
		//    : LtGtExpression ( {EqualNotExpr.left=current} op=EQUAL_NOT_OPS right=LtGtExpression)*;
		@Override public ParserRule getRule() { return rule; }
		
		//LtGtExpression ( {EqualNotExpr.left=current} op=EQUAL_NOT_OPS right=LtGtExpression)*
		public Group getGroup() { return cGroup; }
		
		//LtGtExpression
		public RuleCall getLtGtExpressionParserRuleCall_0() { return cLtGtExpressionParserRuleCall_0; }
		
		//( {EqualNotExpr.left=current} op=EQUAL_NOT_OPS right=LtGtExpression)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{EqualNotExpr.left=current}
		public Action getEqualNotExprLeftAction_1_0() { return cEqualNotExprLeftAction_1_0; }
		
		//op=EQUAL_NOT_OPS
		public Assignment getOpAssignment_1_1() { return cOpAssignment_1_1; }
		
		//EQUAL_NOT_OPS
		public RuleCall getOpEQUAL_NOT_OPSTerminalRuleCall_1_1_0() { return cOpEQUAL_NOT_OPSTerminalRuleCall_1_1_0; }
		
		//right=LtGtExpression
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//LtGtExpression
		public RuleCall getRightLtGtExpressionParserRuleCall_1_2_0() { return cRightLtGtExpressionParserRuleCall_1_2_0; }
	}
	public class LtGtExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.LtGtExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cColonExpressionParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cLtGtExprLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cOpAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cOpLT_GT_OPSTerminalRuleCall_1_1_0 = (RuleCall)cOpAssignment_1_1.eContents().get(0);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightColonExpressionParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//LtGtExpression returns GExpr
		//    : ColonExpression ( {LtGtExpr.left=current} op=LT_GT_OPS right=ColonExpression)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ColonExpression ( {LtGtExpr.left=current} op=LT_GT_OPS right=ColonExpression)*
		public Group getGroup() { return cGroup; }
		
		//ColonExpression
		public RuleCall getColonExpressionParserRuleCall_0() { return cColonExpressionParserRuleCall_0; }
		
		//( {LtGtExpr.left=current} op=LT_GT_OPS right=ColonExpression)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{LtGtExpr.left=current}
		public Action getLtGtExprLeftAction_1_0() { return cLtGtExprLeftAction_1_0; }
		
		//op=LT_GT_OPS
		public Assignment getOpAssignment_1_1() { return cOpAssignment_1_1; }
		
		//LT_GT_OPS
		public RuleCall getOpLT_GT_OPSTerminalRuleCall_1_1_0() { return cOpLT_GT_OPSTerminalRuleCall_1_1_0; }
		
		//right=ColonExpression
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//ColonExpression
		public RuleCall getRightColonExpressionParserRuleCall_1_2_0() { return cRightColonExpressionParserRuleCall_1_2_0; }
	}
	public class ColonExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.ColonExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPlusMinusExpressionParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cColonExprLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cOpAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cOpCOLON_OPTerminalRuleCall_1_1_0 = (RuleCall)cOpAssignment_1_1.eContents().get(0);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightPlusMinusExpressionParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//ColonExpression returns GExpr
		//    : PlusMinusExpression ( {ColonExpr.left=current} op=COLON_OP right=PlusMinusExpression)*;
		@Override public ParserRule getRule() { return rule; }
		
		//PlusMinusExpression ( {ColonExpr.left=current} op=COLON_OP right=PlusMinusExpression)*
		public Group getGroup() { return cGroup; }
		
		//PlusMinusExpression
		public RuleCall getPlusMinusExpressionParserRuleCall_0() { return cPlusMinusExpressionParserRuleCall_0; }
		
		//( {ColonExpr.left=current} op=COLON_OP right=PlusMinusExpression)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{ColonExpr.left=current}
		public Action getColonExprLeftAction_1_0() { return cColonExprLeftAction_1_0; }
		
		//op=COLON_OP
		public Assignment getOpAssignment_1_1() { return cOpAssignment_1_1; }
		
		//COLON_OP
		public RuleCall getOpCOLON_OPTerminalRuleCall_1_1_0() { return cOpCOLON_OPTerminalRuleCall_1_1_0; }
		
		//right=PlusMinusExpression
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//PlusMinusExpression
		public RuleCall getRightPlusMinusExpressionParserRuleCall_1_2_0() { return cRightPlusMinusExpressionParserRuleCall_1_2_0; }
	}
	public class PlusMinusExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.PlusMinusExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cMultiplicativeExpressionParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cPlusMinusExprLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cOpAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cOpPlusMinusOpsParserRuleCall_1_1_0 = (RuleCall)cOpAssignment_1_1.eContents().get(0);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightMultiplicativeExpressionParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//PlusMinusExpression returns GExpr
		//    : MultiplicativeExpression ( {PlusMinusExpr.left=current} op=PlusMinusOps right=MultiplicativeExpression)*;
		@Override public ParserRule getRule() { return rule; }
		
		//MultiplicativeExpression ( {PlusMinusExpr.left=current} op=PlusMinusOps right=MultiplicativeExpression)*
		public Group getGroup() { return cGroup; }
		
		//MultiplicativeExpression
		public RuleCall getMultiplicativeExpressionParserRuleCall_0() { return cMultiplicativeExpressionParserRuleCall_0; }
		
		//( {PlusMinusExpr.left=current} op=PlusMinusOps right=MultiplicativeExpression)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{PlusMinusExpr.left=current}
		public Action getPlusMinusExprLeftAction_1_0() { return cPlusMinusExprLeftAction_1_0; }
		
		//op=PlusMinusOps
		public Assignment getOpAssignment_1_1() { return cOpAssignment_1_1; }
		
		//PlusMinusOps
		public RuleCall getOpPlusMinusOpsParserRuleCall_1_1_0() { return cOpPlusMinusOpsParserRuleCall_1_1_0; }
		
		//right=MultiplicativeExpression
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//MultiplicativeExpression
		public RuleCall getRightMultiplicativeExpressionParserRuleCall_1_2_0() { return cRightMultiplicativeExpressionParserRuleCall_1_2_0; }
	}
	public class MultiplicativeExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.MultiplicativeExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cUnaryExpressionParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cMultiplicativeExprLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cOpAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cOpMultiplicativeOpParserRuleCall_1_1_0 = (RuleCall)cOpAssignment_1_1.eContents().get(0);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightUnaryExpressionParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//MultiplicativeExpression returns GExpr
		//    : UnaryExpression ( {MultiplicativeExpr.left=current} op=MultiplicativeOp right=UnaryExpression)*;
		@Override public ParserRule getRule() { return rule; }
		
		//UnaryExpression ( {MultiplicativeExpr.left=current} op=MultiplicativeOp right=UnaryExpression)*
		public Group getGroup() { return cGroup; }
		
		//UnaryExpression
		public RuleCall getUnaryExpressionParserRuleCall_0() { return cUnaryExpressionParserRuleCall_0; }
		
		//( {MultiplicativeExpr.left=current} op=MultiplicativeOp right=UnaryExpression)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{MultiplicativeExpr.left=current}
		public Action getMultiplicativeExprLeftAction_1_0() { return cMultiplicativeExprLeftAction_1_0; }
		
		//op=MultiplicativeOp
		public Assignment getOpAssignment_1_1() { return cOpAssignment_1_1; }
		
		//MultiplicativeOp
		public RuleCall getOpMultiplicativeOpParserRuleCall_1_1_0() { return cOpMultiplicativeOpParserRuleCall_1_1_0; }
		
		//right=UnaryExpression
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//UnaryExpression
		public RuleCall getRightUnaryExpressionParserRuleCall_1_2_0() { return cRightUnaryExpressionParserRuleCall_1_2_0; }
	}
	public class UnaryExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.UnaryExpression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cUnaryExprAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Assignment cOpAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cOpUnaryOpParserRuleCall_0_1_0 = (RuleCall)cOpAssignment_0_1.eContents().get(0);
		private final Assignment cExpAssignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final RuleCall cExpPrimaryExprParserRuleCall_0_2_0 = (RuleCall)cExpAssignment_0_2.eContents().get(0);
		private final RuleCall cPrimaryExprParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//UnaryExpression returns GExpr
		//    : {UnaryExpr} op=UnaryOp exp=PrimaryExpr
		//    | PrimaryExpr
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//{UnaryExpr} op=UnaryOp exp=PrimaryExpr
		//   | PrimaryExpr
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{UnaryExpr} op=UnaryOp exp=PrimaryExpr
		public Group getGroup_0() { return cGroup_0; }
		
		//{UnaryExpr}
		public Action getUnaryExprAction_0_0() { return cUnaryExprAction_0_0; }
		
		//op=UnaryOp
		public Assignment getOpAssignment_0_1() { return cOpAssignment_0_1; }
		
		//UnaryOp
		public RuleCall getOpUnaryOpParserRuleCall_0_1_0() { return cOpUnaryOpParserRuleCall_0_1_0; }
		
		//exp=PrimaryExpr
		public Assignment getExpAssignment_0_2() { return cExpAssignment_0_2; }
		
		//PrimaryExpr
		public RuleCall getExpPrimaryExprParserRuleCall_0_2_0() { return cExpPrimaryExprParserRuleCall_0_2_0; }
		
		//PrimaryExpr
		public RuleCall getPrimaryExprParserRuleCall_1() { return cPrimaryExprParserRuleCall_1; }
	}
	public class PrimaryExprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.PrimaryExpr");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cBaseExprParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cPostFixExprAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cBaseExpAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cBaseExpAccessibleBaseExprParserRuleCall_1_1_0 = (RuleCall)cBaseExpAssignment_1_1.eContents().get(0);
		private final Assignment cPostsAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cPostsPostfixParserRuleCall_1_2_0 = (RuleCall)cPostsAssignment_1_2.eContents().get(0);
		
		////SlangAccess
		////    : {SlangAccess} t=PrimaryExpr ( suffixes+=SlangAccessSuffix )* ;
		////SlangAccessSuffix: {SlangAccessSuffix} '.' id=ID; // cs=SlangCallSuffix? ;
		//PrimaryExpr  returns GExpr
		//    : BaseExpr
		//    | {PostFixExpr} baseExp=AccessibleBaseExpr ( posts+=Postfix)*;
		@Override public ParserRule getRule() { return rule; }
		
		//BaseExpr
		//   | {PostFixExpr} baseExp=AccessibleBaseExpr ( posts+=Postfix)*
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//BaseExpr
		public RuleCall getBaseExprParserRuleCall_0() { return cBaseExprParserRuleCall_0; }
		
		//{PostFixExpr} baseExp=AccessibleBaseExpr ( posts+=Postfix)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{PostFixExpr}
		public Action getPostFixExprAction_1_0() { return cPostFixExprAction_1_0; }
		
		//baseExp=AccessibleBaseExpr
		public Assignment getBaseExpAssignment_1_1() { return cBaseExpAssignment_1_1; }
		
		//AccessibleBaseExpr
		public RuleCall getBaseExpAccessibleBaseExprParserRuleCall_1_1_0() { return cBaseExpAccessibleBaseExprParserRuleCall_1_1_0; }
		
		//( posts+=Postfix)*
		public Assignment getPostsAssignment_1_2() { return cPostsAssignment_1_2; }
		
		//Postfix
		public RuleCall getPostsPostfixParserRuleCall_1_2_0() { return cPostsPostfixParserRuleCall_1_2_0; }
	}
	public class BaseExprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.BaseExpr");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cSlangLitTermAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Assignment cLitAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cLitSlangLitParserRuleCall_0_1_0 = (RuleCall)cLitAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cSlangInterpTermAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cIAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cISlangInterpParserRuleCall_1_1_0 = (RuleCall)cIAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Group cGroup_2_0 = (Group)cGroup_2.eContents().get(0);
		private final Action cInStateExprAction_2_0_0 = (Action)cGroup_2_0.eContents().get(0);
		private final Keyword cInKeyword_2_0_1 = (Keyword)cGroup_2_0.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_2_0_2 = (Keyword)cGroup_2_0.eContents().get(2);
		private final Assignment cStateVarAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cStateVarStateVarDeclCrossReference_2_1_0 = (CrossReference)cStateVarAssignment_2_1.eContents().get(0);
		private final RuleCall cStateVarStateVarDeclIDTerminalRuleCall_2_1_0_1 = (RuleCall)cStateVarStateVarDeclCrossReference_2_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cGroup_3.eContents().get(0);
		private final Action cMaySendExprAction_3_0_0 = (Action)cGroup_3_0.eContents().get(0);
		private final Keyword cMaySendKeyword_3_0_1 = (Keyword)cGroup_3_0.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_3_0_2 = (Keyword)cGroup_3_0.eContents().get(2);
		private final Assignment cEventPortAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cEventPortPortCrossReference_3_1_0 = (CrossReference)cEventPortAssignment_3_1.eContents().get(0);
		private final RuleCall cEventPortPortIDTerminalRuleCall_3_1_0_1 = (RuleCall)cEventPortPortCrossReference_3_1_0.eContents().get(1);
		private final Group cGroup_3_2 = (Group)cGroup_3.eContents().get(2);
		private final Keyword cCommaKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Assignment cValueAssignment_3_2_1 = (Assignment)cGroup_3_2.eContents().get(1);
		private final RuleCall cValueOwnedExpressionParserRuleCall_3_2_1_0 = (RuleCall)cValueAssignment_3_2_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3_3 = (Keyword)cGroup_3.eContents().get(3);
		private final Group cGroup_4 = (Group)cAlternatives.eContents().get(4);
		private final Group cGroup_4_0 = (Group)cGroup_4.eContents().get(0);
		private final Action cMustSendExprAction_4_0_0 = (Action)cGroup_4_0.eContents().get(0);
		private final Keyword cMustSendKeyword_4_0_1 = (Keyword)cGroup_4_0.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_4_0_2 = (Keyword)cGroup_4_0.eContents().get(2);
		private final Assignment cEventPortAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cEventPortPortCrossReference_4_1_0 = (CrossReference)cEventPortAssignment_4_1.eContents().get(0);
		private final RuleCall cEventPortPortIDTerminalRuleCall_4_1_0_1 = (RuleCall)cEventPortPortCrossReference_4_1_0.eContents().get(1);
		private final Group cGroup_4_2 = (Group)cGroup_4.eContents().get(2);
		private final Keyword cCommaKeyword_4_2_0 = (Keyword)cGroup_4_2.eContents().get(0);
		private final Assignment cValueAssignment_4_2_1 = (Assignment)cGroup_4_2.eContents().get(1);
		private final RuleCall cValueOwnedExpressionParserRuleCall_4_2_1_0 = (RuleCall)cValueAssignment_4_2_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4_3 = (Keyword)cGroup_4.eContents().get(3);
		private final Group cGroup_5 = (Group)cAlternatives.eContents().get(5);
		private final Group cGroup_5_0 = (Group)cGroup_5.eContents().get(0);
		private final Action cNoSendExprAction_5_0_0 = (Action)cGroup_5_0.eContents().get(0);
		private final Keyword cNoSendKeyword_5_0_1 = (Keyword)cGroup_5_0.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_5_0_2 = (Keyword)cGroup_5_0.eContents().get(2);
		private final Assignment cEventPortAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final CrossReference cEventPortPortCrossReference_5_1_0 = (CrossReference)cEventPortAssignment_5_1.eContents().get(0);
		private final RuleCall cEventPortPortIDTerminalRuleCall_5_1_0_1 = (RuleCall)cEventPortPortCrossReference_5_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_5_2 = (Keyword)cGroup_5.eContents().get(2);
		private final Group cGroup_6 = (Group)cAlternatives.eContents().get(6);
		private final Group cGroup_6_0 = (Group)cGroup_6.eContents().get(0);
		private final Action cHasEventExprAction_6_0_0 = (Action)cGroup_6_0.eContents().get(0);
		private final Keyword cHasEventKeyword_6_0_1 = (Keyword)cGroup_6_0.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_6_0_2 = (Keyword)cGroup_6_0.eContents().get(2);
		private final Assignment cEventPortAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final CrossReference cEventPortPortCrossReference_6_1_0 = (CrossReference)cEventPortAssignment_6_1.eContents().get(0);
		private final RuleCall cEventPortPortIDTerminalRuleCall_6_1_0_1 = (RuleCall)cEventPortPortCrossReference_6_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_6_2 = (Keyword)cGroup_6.eContents().get(2);
		private final Group cGroup_7 = (Group)cAlternatives.eContents().get(7);
		private final Group cGroup_7_0 = (Group)cGroup_7.eContents().get(0);
		private final Action cEnumLitExprAction_7_0_0 = (Action)cGroup_7_0.eContents().get(0);
		private final Assignment cEnumTypeAssignment_7_0_1 = (Assignment)cGroup_7_0.eContents().get(1);
		private final CrossReference cEnumTypeDataClassifierCrossReference_7_0_1_0 = (CrossReference)cEnumTypeAssignment_7_0_1.eContents().get(0);
		private final RuleCall cEnumTypeDataClassifierQCLREFParserRuleCall_7_0_1_0_1 = (RuleCall)cEnumTypeDataClassifierCrossReference_7_0_1_0.eContents().get(1);
		private final Keyword cFullStopKeyword_7_0_2 = (Keyword)cGroup_7_0.eContents().get(2);
		private final Assignment cValueAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final CrossReference cValueStringLiteralCrossReference_7_1_0 = (CrossReference)cValueAssignment_7_1.eContents().get(0);
		private final RuleCall cValueStringLiteralIDTerminalRuleCall_7_1_0_1 = (RuleCall)cValueStringLiteralCrossReference_7_1_0.eContents().get(1);
		private final RuleCall cFloatObjectExprParserRuleCall_8 = (RuleCall)cAlternatives.eContents().get(8);
		private final Group cGroup_9 = (Group)cAlternatives.eContents().get(9);
		private final Action cParenExprAction_9_0 = (Action)cGroup_9.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_9_1 = (Keyword)cGroup_9.eContents().get(1);
		private final Assignment cExpAssignment_9_2 = (Assignment)cGroup_9.eContents().get(2);
		private final RuleCall cExpOwnedExpressionParserRuleCall_9_2_0 = (RuleCall)cExpAssignment_9_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_9_3 = (Keyword)cGroup_9.eContents().get(3);
		private final Group cGroup_10 = (Group)cAlternatives.eContents().get(10);
		private final Action cSlangForTermAction_10_0 = (Action)cGroup_10.eContents().get(0);
		private final Keyword cForKeyword_10_1 = (Keyword)cGroup_10.eContents().get(1);
		private final Assignment cRAssignment_10_2 = (Assignment)cGroup_10.eContents().get(2);
		private final RuleCall cRSlangForRangeParserRuleCall_10_2_0 = (RuleCall)cRAssignment_10_2.eContents().get(0);
		private final Group cGroup_10_3 = (Group)cGroup_10.eContents().get(3);
		private final Keyword cCommaKeyword_10_3_0 = (Keyword)cGroup_10_3.eContents().get(0);
		private final Assignment cRAssignment_10_3_1 = (Assignment)cGroup_10_3.eContents().get(1);
		private final RuleCall cRSlangForRangeParserRuleCall_10_3_1_0 = (RuleCall)cRAssignment_10_3_1.eContents().get(0);
		private final Keyword cYieldKeyword_10_4 = (Keyword)cGroup_10.eContents().get(4);
		private final Alternatives cAlternatives_10_5 = (Alternatives)cGroup_10.eContents().get(5);
		private final Assignment cBAssignment_10_5_0 = (Assignment)cAlternatives_10_5.eContents().get(0);
		private final RuleCall cBSlangBlockParserRuleCall_10_5_0_0 = (RuleCall)cBAssignment_10_5_0.eContents().get(0);
		private final Group cGroup_10_5_1 = (Group)cAlternatives_10_5.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_10_5_1_0 = (Keyword)cGroup_10_5_1.eContents().get(0);
		private final Assignment cEAssignment_10_5_1_1 = (Assignment)cGroup_10_5_1.eContents().get(1);
		private final RuleCall cEOwnedExpressionParserRuleCall_10_5_1_1_0 = (RuleCall)cEAssignment_10_5_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_10_5_1_2 = (Keyword)cGroup_10_5_1.eContents().get(2);
		private final Group cGroup_11 = (Group)cAlternatives.eContents().get(11);
		private final Action cSlangBlockTermAction_11_0 = (Action)cGroup_11.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_11_1 = (Keyword)cGroup_11.eContents().get(1);
		private final Alternatives cAlternatives_11_2 = (Alternatives)cGroup_11.eContents().get(2);
		private final Group cGroup_11_2_0 = (Group)cAlternatives_11_2.eContents().get(0);
		private final Group cGroup_11_2_0_0 = (Group)cGroup_11_2_0.eContents().get(0);
		private final Assignment cPAssignment_11_2_0_0_0 = (Assignment)cGroup_11_2_0_0.eContents().get(0);
		private final RuleCall cPSlangParamsParserRuleCall_11_2_0_0_0_0 = (RuleCall)cPAssignment_11_2_0_0_0.eContents().get(0);
		private final Keyword cEqualsSignGreaterThanSignKeyword_11_2_0_0_1 = (Keyword)cGroup_11_2_0_0.eContents().get(1);
		private final Assignment cEAssignment_11_2_0_1 = (Assignment)cGroup_11_2_0.eContents().get(1);
		private final RuleCall cEOwnedExpressionParserRuleCall_11_2_0_1_0 = (RuleCall)cEAssignment_11_2_0_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_11_2_0_2 = (Keyword)cGroup_11_2_0.eContents().get(2);
		private final Group cGroup_11_2_1 = (Group)cAlternatives_11_2.eContents().get(1);
		private final Assignment cStmtAssignment_11_2_1_0 = (Assignment)cGroup_11_2_1.eContents().get(0);
		private final RuleCall cStmtSlangStmtParserRuleCall_11_2_1_0_0 = (RuleCall)cStmtAssignment_11_2_1_0.eContents().get(0);
		private final Assignment cRAssignment_11_2_1_1 = (Assignment)cGroup_11_2_1.eContents().get(1);
		private final RuleCall cRSlangRetParserRuleCall_11_2_1_1_0 = (RuleCall)cRAssignment_11_2_1_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_11_2_1_2 = (Keyword)cGroup_11_2_1.eContents().get(2);
		
		//BaseExpr returns GExpr
		//    : {SlangLitTerm} lit=SlangLit
		//    | {SlangInterpTerm} i=SlangInterp
		//    | ({InStateExpr} 'In' '(') stateVar=[StateVarDecl|ID] ')'
		//    | ({MaySendExpr} 'MaySend' '(') eventPort=[aadl2::Port|ID] (',' value=OwnedExpression)? ')'
		//    | ({MustSendExpr} 'MustSend' '(') eventPort=[aadl2::Port|ID] (',' value=OwnedExpression)? ')'
		//    | ({NoSendExpr} 'NoSend' '(') eventPort=[aadl2::Port|ID] ')'
		//    | ({HasEventExpr} 'HasEvent' '(') eventPort=[aadl2::Port|ID] ')'
		//    | ({EnumLitExpr} enumType=[aadl2::DataClassifier|QCLREF] '.') value=[aadl2::StringLiteral|ID]
		//    | FloatObjectExpr
		//    | {ParenExpr} '(' exp=OwnedExpression ')'
		//    //| {SlangTupleTerm} '(' e+=Expr ( ',' e+=Expr )*  ')'
		//    | {SlangForTerm} 'for' r+=SlangForRange ( ',' r+=SlangForRange )*  'yield' ( b=SlangBlock |  '(' e=OwnedExpression ')' )
		//    | {SlangBlockTerm} '{'
		//       ( (p=SlangParams '=>')? e=OwnedExpression '}'
		//        | stmt+=SlangStmt* r=SlangRet? '}'
		//       )
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//{SlangLitTerm} lit=SlangLit
		//   | {SlangInterpTerm} i=SlangInterp
		//   | ({InStateExpr} 'In' '(') stateVar=[StateVarDecl|ID] ')'
		//   | ({MaySendExpr} 'MaySend' '(') eventPort=[aadl2::Port|ID] (',' value=OwnedExpression)? ')'
		//   | ({MustSendExpr} 'MustSend' '(') eventPort=[aadl2::Port|ID] (',' value=OwnedExpression)? ')'
		//   | ({NoSendExpr} 'NoSend' '(') eventPort=[aadl2::Port|ID] ')'
		//   | ({HasEventExpr} 'HasEvent' '(') eventPort=[aadl2::Port|ID] ')'
		//   | ({EnumLitExpr} enumType=[aadl2::DataClassifier|QCLREF] '.') value=[aadl2::StringLiteral|ID]
		//   | FloatObjectExpr
		//   | {ParenExpr} '(' exp=OwnedExpression ')'
		//   //| {SlangTupleTerm} '(' e+=Expr ( ',' e+=Expr )*  ')'
		//   | {SlangForTerm} 'for' r+=SlangForRange ( ',' r+=SlangForRange )*  'yield' ( b=SlangBlock |  '(' e=OwnedExpression ')' )
		//   | {SlangBlockTerm} '{'
		//      ( (p=SlangParams '=>')? e=OwnedExpression '}'
		//       | stmt+=SlangStmt* r=SlangRet? '}'
		//      )
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{SlangLitTerm} lit=SlangLit
		public Group getGroup_0() { return cGroup_0; }
		
		//{SlangLitTerm}
		public Action getSlangLitTermAction_0_0() { return cSlangLitTermAction_0_0; }
		
		//lit=SlangLit
		public Assignment getLitAssignment_0_1() { return cLitAssignment_0_1; }
		
		//SlangLit
		public RuleCall getLitSlangLitParserRuleCall_0_1_0() { return cLitSlangLitParserRuleCall_0_1_0; }
		
		//{SlangInterpTerm} i=SlangInterp
		public Group getGroup_1() { return cGroup_1; }
		
		//{SlangInterpTerm}
		public Action getSlangInterpTermAction_1_0() { return cSlangInterpTermAction_1_0; }
		
		//i=SlangInterp
		public Assignment getIAssignment_1_1() { return cIAssignment_1_1; }
		
		//SlangInterp
		public RuleCall getISlangInterpParserRuleCall_1_1_0() { return cISlangInterpParserRuleCall_1_1_0; }
		
		//({InStateExpr} 'In' '(') stateVar=[StateVarDecl|ID] ')'
		public Group getGroup_2() { return cGroup_2; }
		
		//({InStateExpr} 'In' '(')
		public Group getGroup_2_0() { return cGroup_2_0; }
		
		//{InStateExpr}
		public Action getInStateExprAction_2_0_0() { return cInStateExprAction_2_0_0; }
		
		//'In'
		public Keyword getInKeyword_2_0_1() { return cInKeyword_2_0_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2_0_2() { return cLeftParenthesisKeyword_2_0_2; }
		
		//stateVar=[StateVarDecl|ID]
		public Assignment getStateVarAssignment_2_1() { return cStateVarAssignment_2_1; }
		
		//[StateVarDecl|ID]
		public CrossReference getStateVarStateVarDeclCrossReference_2_1_0() { return cStateVarStateVarDeclCrossReference_2_1_0; }
		
		//ID
		public RuleCall getStateVarStateVarDeclIDTerminalRuleCall_2_1_0_1() { return cStateVarStateVarDeclIDTerminalRuleCall_2_1_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2_2() { return cRightParenthesisKeyword_2_2; }
		
		//({MaySendExpr} 'MaySend' '(') eventPort=[aadl2::Port|ID] (',' value=OwnedExpression)? ')'
		public Group getGroup_3() { return cGroup_3; }
		
		//({MaySendExpr} 'MaySend' '(')
		public Group getGroup_3_0() { return cGroup_3_0; }
		
		//{MaySendExpr}
		public Action getMaySendExprAction_3_0_0() { return cMaySendExprAction_3_0_0; }
		
		//'MaySend'
		public Keyword getMaySendKeyword_3_0_1() { return cMaySendKeyword_3_0_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_3_0_2() { return cLeftParenthesisKeyword_3_0_2; }
		
		//eventPort=[aadl2::Port|ID]
		public Assignment getEventPortAssignment_3_1() { return cEventPortAssignment_3_1; }
		
		//[aadl2::Port|ID]
		public CrossReference getEventPortPortCrossReference_3_1_0() { return cEventPortPortCrossReference_3_1_0; }
		
		//ID
		public RuleCall getEventPortPortIDTerminalRuleCall_3_1_0_1() { return cEventPortPortIDTerminalRuleCall_3_1_0_1; }
		
		//(',' value=OwnedExpression)?
		public Group getGroup_3_2() { return cGroup_3_2; }
		
		//','
		public Keyword getCommaKeyword_3_2_0() { return cCommaKeyword_3_2_0; }
		
		//value=OwnedExpression
		public Assignment getValueAssignment_3_2_1() { return cValueAssignment_3_2_1; }
		
		//OwnedExpression
		public RuleCall getValueOwnedExpressionParserRuleCall_3_2_1_0() { return cValueOwnedExpressionParserRuleCall_3_2_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3_3() { return cRightParenthesisKeyword_3_3; }
		
		//({MustSendExpr} 'MustSend' '(') eventPort=[aadl2::Port|ID] (',' value=OwnedExpression)? ')'
		public Group getGroup_4() { return cGroup_4; }
		
		//({MustSendExpr} 'MustSend' '(')
		public Group getGroup_4_0() { return cGroup_4_0; }
		
		//{MustSendExpr}
		public Action getMustSendExprAction_4_0_0() { return cMustSendExprAction_4_0_0; }
		
		//'MustSend'
		public Keyword getMustSendKeyword_4_0_1() { return cMustSendKeyword_4_0_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_4_0_2() { return cLeftParenthesisKeyword_4_0_2; }
		
		//eventPort=[aadl2::Port|ID]
		public Assignment getEventPortAssignment_4_1() { return cEventPortAssignment_4_1; }
		
		//[aadl2::Port|ID]
		public CrossReference getEventPortPortCrossReference_4_1_0() { return cEventPortPortCrossReference_4_1_0; }
		
		//ID
		public RuleCall getEventPortPortIDTerminalRuleCall_4_1_0_1() { return cEventPortPortIDTerminalRuleCall_4_1_0_1; }
		
		//(',' value=OwnedExpression)?
		public Group getGroup_4_2() { return cGroup_4_2; }
		
		//','
		public Keyword getCommaKeyword_4_2_0() { return cCommaKeyword_4_2_0; }
		
		//value=OwnedExpression
		public Assignment getValueAssignment_4_2_1() { return cValueAssignment_4_2_1; }
		
		//OwnedExpression
		public RuleCall getValueOwnedExpressionParserRuleCall_4_2_1_0() { return cValueOwnedExpressionParserRuleCall_4_2_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4_3() { return cRightParenthesisKeyword_4_3; }
		
		//({NoSendExpr} 'NoSend' '(') eventPort=[aadl2::Port|ID] ')'
		public Group getGroup_5() { return cGroup_5; }
		
		//({NoSendExpr} 'NoSend' '(')
		public Group getGroup_5_0() { return cGroup_5_0; }
		
		//{NoSendExpr}
		public Action getNoSendExprAction_5_0_0() { return cNoSendExprAction_5_0_0; }
		
		//'NoSend'
		public Keyword getNoSendKeyword_5_0_1() { return cNoSendKeyword_5_0_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_5_0_2() { return cLeftParenthesisKeyword_5_0_2; }
		
		//eventPort=[aadl2::Port|ID]
		public Assignment getEventPortAssignment_5_1() { return cEventPortAssignment_5_1; }
		
		//[aadl2::Port|ID]
		public CrossReference getEventPortPortCrossReference_5_1_0() { return cEventPortPortCrossReference_5_1_0; }
		
		//ID
		public RuleCall getEventPortPortIDTerminalRuleCall_5_1_0_1() { return cEventPortPortIDTerminalRuleCall_5_1_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_5_2() { return cRightParenthesisKeyword_5_2; }
		
		//({HasEventExpr} 'HasEvent' '(') eventPort=[aadl2::Port|ID] ')'
		public Group getGroup_6() { return cGroup_6; }
		
		//({HasEventExpr} 'HasEvent' '(')
		public Group getGroup_6_0() { return cGroup_6_0; }
		
		//{HasEventExpr}
		public Action getHasEventExprAction_6_0_0() { return cHasEventExprAction_6_0_0; }
		
		//'HasEvent'
		public Keyword getHasEventKeyword_6_0_1() { return cHasEventKeyword_6_0_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_6_0_2() { return cLeftParenthesisKeyword_6_0_2; }
		
		//eventPort=[aadl2::Port|ID]
		public Assignment getEventPortAssignment_6_1() { return cEventPortAssignment_6_1; }
		
		//[aadl2::Port|ID]
		public CrossReference getEventPortPortCrossReference_6_1_0() { return cEventPortPortCrossReference_6_1_0; }
		
		//ID
		public RuleCall getEventPortPortIDTerminalRuleCall_6_1_0_1() { return cEventPortPortIDTerminalRuleCall_6_1_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_6_2() { return cRightParenthesisKeyword_6_2; }
		
		//({EnumLitExpr} enumType=[aadl2::DataClassifier|QCLREF] '.') value=[aadl2::StringLiteral|ID]
		public Group getGroup_7() { return cGroup_7; }
		
		//({EnumLitExpr} enumType=[aadl2::DataClassifier|QCLREF] '.')
		public Group getGroup_7_0() { return cGroup_7_0; }
		
		//{EnumLitExpr}
		public Action getEnumLitExprAction_7_0_0() { return cEnumLitExprAction_7_0_0; }
		
		//enumType=[aadl2::DataClassifier|QCLREF]
		public Assignment getEnumTypeAssignment_7_0_1() { return cEnumTypeAssignment_7_0_1; }
		
		//[aadl2::DataClassifier|QCLREF]
		public CrossReference getEnumTypeDataClassifierCrossReference_7_0_1_0() { return cEnumTypeDataClassifierCrossReference_7_0_1_0; }
		
		//QCLREF
		public RuleCall getEnumTypeDataClassifierQCLREFParserRuleCall_7_0_1_0_1() { return cEnumTypeDataClassifierQCLREFParserRuleCall_7_0_1_0_1; }
		
		//'.'
		public Keyword getFullStopKeyword_7_0_2() { return cFullStopKeyword_7_0_2; }
		
		//value=[aadl2::StringLiteral|ID]
		public Assignment getValueAssignment_7_1() { return cValueAssignment_7_1; }
		
		//[aadl2::StringLiteral|ID]
		public CrossReference getValueStringLiteralCrossReference_7_1_0() { return cValueStringLiteralCrossReference_7_1_0; }
		
		//ID
		public RuleCall getValueStringLiteralIDTerminalRuleCall_7_1_0_1() { return cValueStringLiteralIDTerminalRuleCall_7_1_0_1; }
		
		//FloatObjectExpr
		public RuleCall getFloatObjectExprParserRuleCall_8() { return cFloatObjectExprParserRuleCall_8; }
		
		//{ParenExpr} '(' exp=OwnedExpression ')'
		public Group getGroup_9() { return cGroup_9; }
		
		//{ParenExpr}
		public Action getParenExprAction_9_0() { return cParenExprAction_9_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_9_1() { return cLeftParenthesisKeyword_9_1; }
		
		//exp=OwnedExpression
		public Assignment getExpAssignment_9_2() { return cExpAssignment_9_2; }
		
		//OwnedExpression
		public RuleCall getExpOwnedExpressionParserRuleCall_9_2_0() { return cExpOwnedExpressionParserRuleCall_9_2_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_9_3() { return cRightParenthesisKeyword_9_3; }
		
		//{SlangForTerm} 'for' r+=SlangForRange ( ',' r+=SlangForRange )*  'yield' ( b=SlangBlock |  '(' e=OwnedExpression ')' )
		public Group getGroup_10() { return cGroup_10; }
		
		//{SlangForTerm}
		public Action getSlangForTermAction_10_0() { return cSlangForTermAction_10_0; }
		
		//'for'
		public Keyword getForKeyword_10_1() { return cForKeyword_10_1; }
		
		//r+=SlangForRange
		public Assignment getRAssignment_10_2() { return cRAssignment_10_2; }
		
		//SlangForRange
		public RuleCall getRSlangForRangeParserRuleCall_10_2_0() { return cRSlangForRangeParserRuleCall_10_2_0; }
		
		//( ',' r+=SlangForRange )*
		public Group getGroup_10_3() { return cGroup_10_3; }
		
		//','
		public Keyword getCommaKeyword_10_3_0() { return cCommaKeyword_10_3_0; }
		
		//r+=SlangForRange
		public Assignment getRAssignment_10_3_1() { return cRAssignment_10_3_1; }
		
		//SlangForRange
		public RuleCall getRSlangForRangeParserRuleCall_10_3_1_0() { return cRSlangForRangeParserRuleCall_10_3_1_0; }
		
		//'yield'
		public Keyword getYieldKeyword_10_4() { return cYieldKeyword_10_4; }
		
		//( b=SlangBlock |  '(' e=OwnedExpression ')' )
		public Alternatives getAlternatives_10_5() { return cAlternatives_10_5; }
		
		//b=SlangBlock
		public Assignment getBAssignment_10_5_0() { return cBAssignment_10_5_0; }
		
		//SlangBlock
		public RuleCall getBSlangBlockParserRuleCall_10_5_0_0() { return cBSlangBlockParserRuleCall_10_5_0_0; }
		
		//'(' e=OwnedExpression ')'
		public Group getGroup_10_5_1() { return cGroup_10_5_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_10_5_1_0() { return cLeftParenthesisKeyword_10_5_1_0; }
		
		//e=OwnedExpression
		public Assignment getEAssignment_10_5_1_1() { return cEAssignment_10_5_1_1; }
		
		//OwnedExpression
		public RuleCall getEOwnedExpressionParserRuleCall_10_5_1_1_0() { return cEOwnedExpressionParserRuleCall_10_5_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_10_5_1_2() { return cRightParenthesisKeyword_10_5_1_2; }
		
		//{SlangBlockTerm} '{'
		//      ( (p=SlangParams '=>')? e=OwnedExpression '}'
		//       | stmt+=SlangStmt* r=SlangRet? '}'
		//      )
		public Group getGroup_11() { return cGroup_11; }
		
		//{SlangBlockTerm}
		public Action getSlangBlockTermAction_11_0() { return cSlangBlockTermAction_11_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_11_1() { return cLeftCurlyBracketKeyword_11_1; }
		
		//( (p=SlangParams '=>')? e=OwnedExpression '}'
		// | stmt+=SlangStmt* r=SlangRet? '}'
		//)
		public Alternatives getAlternatives_11_2() { return cAlternatives_11_2; }
		
		//(p=SlangParams '=>')? e=OwnedExpression '}'
		public Group getGroup_11_2_0() { return cGroup_11_2_0; }
		
		//(p=SlangParams '=>')?
		public Group getGroup_11_2_0_0() { return cGroup_11_2_0_0; }
		
		//p=SlangParams
		public Assignment getPAssignment_11_2_0_0_0() { return cPAssignment_11_2_0_0_0; }
		
		//SlangParams
		public RuleCall getPSlangParamsParserRuleCall_11_2_0_0_0_0() { return cPSlangParamsParserRuleCall_11_2_0_0_0_0; }
		
		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_11_2_0_0_1() { return cEqualsSignGreaterThanSignKeyword_11_2_0_0_1; }
		
		//e=OwnedExpression
		public Assignment getEAssignment_11_2_0_1() { return cEAssignment_11_2_0_1; }
		
		//OwnedExpression
		public RuleCall getEOwnedExpressionParserRuleCall_11_2_0_1_0() { return cEOwnedExpressionParserRuleCall_11_2_0_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_11_2_0_2() { return cRightCurlyBracketKeyword_11_2_0_2; }
		
		//stmt+=SlangStmt* r=SlangRet? '}'
		public Group getGroup_11_2_1() { return cGroup_11_2_1; }
		
		//stmt+=SlangStmt*
		public Assignment getStmtAssignment_11_2_1_0() { return cStmtAssignment_11_2_1_0; }
		
		//SlangStmt
		public RuleCall getStmtSlangStmtParserRuleCall_11_2_1_0_0() { return cStmtSlangStmtParserRuleCall_11_2_1_0_0; }
		
		//r=SlangRet?
		public Assignment getRAssignment_11_2_1_1() { return cRAssignment_11_2_1_1; }
		
		//SlangRet
		public RuleCall getRSlangRetParserRuleCall_11_2_1_1_0() { return cRSlangRetParserRuleCall_11_2_1_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_11_2_1_2() { return cRightCurlyBracketKeyword_11_2_1_2; }
	}
	public class FloatObjectExprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.FloatObjectExpr");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cF32ObjAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Keyword cF32Keyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Keyword cFullStopKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final Assignment cAttrAssignment_0_3 = (Assignment)cGroup_0.eContents().get(3);
		private final RuleCall cAttrIDTerminalRuleCall_0_3_0 = (RuleCall)cAttrAssignment_0_3.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cF64ObjAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cF64Keyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Keyword cFullStopKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Assignment cAttrAssignment_1_3 = (Assignment)cGroup_1.eContents().get(3);
		private final RuleCall cAttrIDTerminalRuleCall_1_3_0 = (RuleCall)cAttrAssignment_1_3.eContents().get(0);
		
		//FloatObjectExpr returns GExpr
		//    : {F32Obj} 'F32' '.' attr=ID // e.g. F32.NaN
		//    | {F64Obj} 'F64' '.' attr=ID
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//{F32Obj} 'F32' '.' attr=ID // e.g. F32.NaN
		//   | {F64Obj} 'F64' '.' attr=ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{F32Obj} 'F32' '.' attr=ID
		public Group getGroup_0() { return cGroup_0; }
		
		//{F32Obj}
		public Action getF32ObjAction_0_0() { return cF32ObjAction_0_0; }
		
		//'F32'
		public Keyword getF32Keyword_0_1() { return cF32Keyword_0_1; }
		
		//'.'
		public Keyword getFullStopKeyword_0_2() { return cFullStopKeyword_0_2; }
		
		//attr=ID
		public Assignment getAttrAssignment_0_3() { return cAttrAssignment_0_3; }
		
		//ID
		public RuleCall getAttrIDTerminalRuleCall_0_3_0() { return cAttrIDTerminalRuleCall_0_3_0; }
		
		//{F64Obj} 'F64' '.' attr=ID
		public Group getGroup_1() { return cGroup_1; }
		
		//{F64Obj}
		public Action getF64ObjAction_1_0() { return cF64ObjAction_1_0; }
		
		//'F64'
		public Keyword getF64Keyword_1_1() { return cF64Keyword_1_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_2() { return cFullStopKeyword_1_2; }
		
		//attr=ID
		public Assignment getAttrAssignment_1_3() { return cAttrAssignment_1_3; }
		
		//ID
		public RuleCall getAttrIDTerminalRuleCall_1_3_0() { return cAttrIDTerminalRuleCall_1_3_0; }
	}
	public class AccessibleBaseExprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.AccessibleBaseExpr");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cCallExprAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Assignment cIdAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final CrossReference cIdEObjectCrossReference_0_1_0 = (CrossReference)cIdAssignment_0_1.eContents().get(0);
		private final RuleCall cIdEObjectQualifiedAADLNameParserRuleCall_0_1_0_1 = (RuleCall)cIdEObjectCrossReference_0_1_0.eContents().get(1);
		private final Assignment cCallSuffixAssignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final RuleCall cCallSuffixSlangCallSuffixParserRuleCall_0_2_0 = (RuleCall)cCallSuffixAssignment_0_2.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cGroup_1.eContents().get(0);
		private final Action cRecordLitExprAction_1_0_0 = (Action)cGroup_1_0.eContents().get(0);
		private final Assignment cRecordTypeAssignment_1_0_1 = (Assignment)cGroup_1_0.eContents().get(1);
		private final RuleCall cRecordTypeDataElementParserRuleCall_1_0_1_0 = (RuleCall)cRecordTypeAssignment_1_0_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1_0_2 = (Keyword)cGroup_1_0.eContents().get(2);
		private final Assignment cArgsAssignment_1_0_3 = (Assignment)cGroup_1_0.eContents().get(3);
		private final CrossReference cArgsNamedElementCrossReference_1_0_3_0 = (CrossReference)cArgsAssignment_1_0_3.eContents().get(0);
		private final RuleCall cArgsNamedElementIDTerminalRuleCall_1_0_3_0_1 = (RuleCall)cArgsNamedElementCrossReference_1_0_3_0.eContents().get(1);
		private final Keyword cEqualsSignKeyword_1_0_4 = (Keyword)cGroup_1_0.eContents().get(4);
		private final Assignment cArgExprAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cArgExprOwnedExpressionParserRuleCall_1_1_0 = (RuleCall)cArgExprAssignment_1_1.eContents().get(0);
		private final Group cGroup_1_2 = (Group)cGroup_1.eContents().get(2);
		private final Keyword cSemicolonKeyword_1_2_0 = (Keyword)cGroup_1_2.eContents().get(0);
		private final Assignment cArgsAssignment_1_2_1 = (Assignment)cGroup_1_2.eContents().get(1);
		private final CrossReference cArgsNamedElementCrossReference_1_2_1_0 = (CrossReference)cArgsAssignment_1_2_1.eContents().get(0);
		private final RuleCall cArgsNamedElementIDTerminalRuleCall_1_2_1_0_1 = (RuleCall)cArgsNamedElementCrossReference_1_2_1_0.eContents().get(1);
		private final Keyword cEqualsSignKeyword_1_2_2 = (Keyword)cGroup_1_2.eContents().get(2);
		private final Assignment cArgExprAssignment_1_2_3 = (Assignment)cGroup_1_2.eContents().get(3);
		private final RuleCall cArgExprOwnedExpressionParserRuleCall_1_2_3_0 = (RuleCall)cArgExprAssignment_1_2_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_1_3 = (Keyword)cGroup_1.eContents().get(3);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Action cDataRefExprAction_2_0 = (Action)cGroup_2.eContents().get(0);
		private final Assignment cPortOrSubcomponentOrStateVarAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cPortOrSubcomponentOrStateVarEObjectCrossReference_2_1_0 = (CrossReference)cPortOrSubcomponentOrStateVarAssignment_2_1.eContents().get(0);
		private final RuleCall cPortOrSubcomponentOrStateVarEObjectIDTerminalRuleCall_2_1_0_1 = (RuleCall)cPortOrSubcomponentOrStateVarEObjectCrossReference_2_1_0.eContents().get(1);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final Action cResultExprAction_3_0 = (Action)cGroup_3.eContents().get(0);
		private final Keyword cResKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		
		//AccessibleBaseExpr returns GExpr
		//    : {CallExpr} id=[ecore::EObject|QualifiedAADLName] callSuffix=SlangCallSuffix
		//    | ({RecordLitExpr} recordType=DataElement '{' args+=[aadl2::NamedElement|ID] '=')
		//        argExpr+=OwnedExpression (';' args+=[aadl2::NamedElement|ID] '=' argExpr+=OwnedExpression)* '}'
		//    | {DataRefExpr} portOrSubcomponentOrStateVar=[ecore::EObject|ID]
		//    | {ResultExpr} 'res'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{CallExpr} id=[ecore::EObject|QualifiedAADLName] callSuffix=SlangCallSuffix
		//   | ({RecordLitExpr} recordType=DataElement '{' args+=[aadl2::NamedElement|ID] '=')
		//       argExpr+=OwnedExpression (';' args+=[aadl2::NamedElement|ID] '=' argExpr+=OwnedExpression)* '}'
		//   | {DataRefExpr} portOrSubcomponentOrStateVar=[ecore::EObject|ID]
		//   | {ResultExpr} 'res'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{CallExpr} id=[ecore::EObject|QualifiedAADLName] callSuffix=SlangCallSuffix
		public Group getGroup_0() { return cGroup_0; }
		
		//{CallExpr}
		public Action getCallExprAction_0_0() { return cCallExprAction_0_0; }
		
		//id=[ecore::EObject|QualifiedAADLName]
		public Assignment getIdAssignment_0_1() { return cIdAssignment_0_1; }
		
		//[ecore::EObject|QualifiedAADLName]
		public CrossReference getIdEObjectCrossReference_0_1_0() { return cIdEObjectCrossReference_0_1_0; }
		
		//QualifiedAADLName
		public RuleCall getIdEObjectQualifiedAADLNameParserRuleCall_0_1_0_1() { return cIdEObjectQualifiedAADLNameParserRuleCall_0_1_0_1; }
		
		//callSuffix=SlangCallSuffix
		public Assignment getCallSuffixAssignment_0_2() { return cCallSuffixAssignment_0_2; }
		
		//SlangCallSuffix
		public RuleCall getCallSuffixSlangCallSuffixParserRuleCall_0_2_0() { return cCallSuffixSlangCallSuffixParserRuleCall_0_2_0; }
		
		//({RecordLitExpr} recordType=DataElement '{' args+=[aadl2::NamedElement|ID] '=')
		//       argExpr+=OwnedExpression (';' args+=[aadl2::NamedElement|ID] '=' argExpr+=OwnedExpression)* '}'
		public Group getGroup_1() { return cGroup_1; }
		
		//({RecordLitExpr} recordType=DataElement '{' args+=[aadl2::NamedElement|ID] '=')
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//{RecordLitExpr}
		public Action getRecordLitExprAction_1_0_0() { return cRecordLitExprAction_1_0_0; }
		
		//recordType=DataElement
		public Assignment getRecordTypeAssignment_1_0_1() { return cRecordTypeAssignment_1_0_1; }
		
		//DataElement
		public RuleCall getRecordTypeDataElementParserRuleCall_1_0_1_0() { return cRecordTypeDataElementParserRuleCall_1_0_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1_0_2() { return cLeftCurlyBracketKeyword_1_0_2; }
		
		//args+=[aadl2::NamedElement|ID]
		public Assignment getArgsAssignment_1_0_3() { return cArgsAssignment_1_0_3; }
		
		//[aadl2::NamedElement|ID]
		public CrossReference getArgsNamedElementCrossReference_1_0_3_0() { return cArgsNamedElementCrossReference_1_0_3_0; }
		
		//ID
		public RuleCall getArgsNamedElementIDTerminalRuleCall_1_0_3_0_1() { return cArgsNamedElementIDTerminalRuleCall_1_0_3_0_1; }
		
		//'='
		public Keyword getEqualsSignKeyword_1_0_4() { return cEqualsSignKeyword_1_0_4; }
		
		//argExpr+=OwnedExpression
		public Assignment getArgExprAssignment_1_1() { return cArgExprAssignment_1_1; }
		
		//OwnedExpression
		public RuleCall getArgExprOwnedExpressionParserRuleCall_1_1_0() { return cArgExprOwnedExpressionParserRuleCall_1_1_0; }
		
		//(';' args+=[aadl2::NamedElement|ID] '=' argExpr+=OwnedExpression)*
		public Group getGroup_1_2() { return cGroup_1_2; }
		
		//';'
		public Keyword getSemicolonKeyword_1_2_0() { return cSemicolonKeyword_1_2_0; }
		
		//args+=[aadl2::NamedElement|ID]
		public Assignment getArgsAssignment_1_2_1() { return cArgsAssignment_1_2_1; }
		
		//[aadl2::NamedElement|ID]
		public CrossReference getArgsNamedElementCrossReference_1_2_1_0() { return cArgsNamedElementCrossReference_1_2_1_0; }
		
		//ID
		public RuleCall getArgsNamedElementIDTerminalRuleCall_1_2_1_0_1() { return cArgsNamedElementIDTerminalRuleCall_1_2_1_0_1; }
		
		//'='
		public Keyword getEqualsSignKeyword_1_2_2() { return cEqualsSignKeyword_1_2_2; }
		
		//argExpr+=OwnedExpression
		public Assignment getArgExprAssignment_1_2_3() { return cArgExprAssignment_1_2_3; }
		
		//OwnedExpression
		public RuleCall getArgExprOwnedExpressionParserRuleCall_1_2_3_0() { return cArgExprOwnedExpressionParserRuleCall_1_2_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_1_3() { return cRightCurlyBracketKeyword_1_3; }
		
		//{DataRefExpr} portOrSubcomponentOrStateVar=[ecore::EObject|ID]
		public Group getGroup_2() { return cGroup_2; }
		
		//{DataRefExpr}
		public Action getDataRefExprAction_2_0() { return cDataRefExprAction_2_0; }
		
		//portOrSubcomponentOrStateVar=[ecore::EObject|ID]
		public Assignment getPortOrSubcomponentOrStateVarAssignment_2_1() { return cPortOrSubcomponentOrStateVarAssignment_2_1; }
		
		//[ecore::EObject|ID]
		public CrossReference getPortOrSubcomponentOrStateVarEObjectCrossReference_2_1_0() { return cPortOrSubcomponentOrStateVarEObjectCrossReference_2_1_0; }
		
		//ID
		public RuleCall getPortOrSubcomponentOrStateVarEObjectIDTerminalRuleCall_2_1_0_1() { return cPortOrSubcomponentOrStateVarEObjectIDTerminalRuleCall_2_1_0_1; }
		
		//{ResultExpr} 'res'
		public Group getGroup_3() { return cGroup_3; }
		
		//{ResultExpr}
		public Action getResultExprAction_3_0() { return cResultExprAction_3_0; }
		
		//'res'
		public Keyword getResKeyword_3_1() { return cResKeyword_3_1; }
	}
	public class QualifiedAADLNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.QualifiedAADLName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cColonColonKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cFullStopKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		
		//QualifiedAADLName:
		//    ID ('::' ID)+ ('.' ID)?;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ('::' ID)+ ('.' ID)?
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//('::' ID)+
		public Group getGroup_1() { return cGroup_1; }
		
		//'::'
		public Keyword getColonColonKeyword_1_0() { return cColonColonKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
		
		//('.' ID)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'.'
		public Keyword getFullStopKeyword_2_0() { return cFullStopKeyword_2_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_2_1() { return cIDTerminalRuleCall_2_1; }
	}
	public class PostfixElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.Postfix");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMemberAccessParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cArrayAccessParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Postfix:
		//    MemberAccess | ArrayAccess;
		@Override public ParserRule getRule() { return rule; }
		
		//MemberAccess | ArrayAccess
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//MemberAccess
		public RuleCall getMemberAccessParserRuleCall_0() { return cMemberAccessParserRuleCall_0; }
		
		//ArrayAccess
		public RuleCall getArrayAccessParserRuleCall_1() { return cArrayAccessParserRuleCall_1; }
	}
	public class MemberAccessElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.MemberAccess");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFullStopKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cFieldAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cFieldIDTerminalRuleCall_1_0 = (RuleCall)cFieldAssignment_1.eContents().get(0);
		
		//MemberAccess:
		//    '.' field=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'.' field=ID
		public Group getGroup() { return cGroup; }
		
		//'.'
		public Keyword getFullStopKeyword_0() { return cFullStopKeyword_0; }
		
		//field=ID
		public Assignment getFieldAssignment_1() { return cFieldAssignment_1; }
		
		//ID
		public RuleCall getFieldIDTerminalRuleCall_1_0() { return cFieldIDTerminalRuleCall_1_0; }
	}
	public class ArrayAccessElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.ArrayAccess");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cArrayAccessAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cIndexAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cIndexOwnedExpressionParserRuleCall_2_0_0 = (RuleCall)cIndexAssignment_2_0.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cGroup_2.eContents().get(1);
		private final Keyword cCommaKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cIndexAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cIndexOwnedExpressionParserRuleCall_2_1_1_0 = (RuleCall)cIndexAssignment_2_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//ArrayAccess: {ArrayAccess}
		//    '(' ( index+=OwnedExpression (',' index+=OwnedExpression)* )? ')';
		@Override public ParserRule getRule() { return rule; }
		
		//{ArrayAccess}
		//   '(' ( index+=OwnedExpression (',' index+=OwnedExpression)* )? ')'
		public Group getGroup() { return cGroup; }
		
		//{ArrayAccess}
		public Action getArrayAccessAction_0() { return cArrayAccessAction_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//( index+=OwnedExpression (',' index+=OwnedExpression)* )?
		public Group getGroup_2() { return cGroup_2; }
		
		//index+=OwnedExpression
		public Assignment getIndexAssignment_2_0() { return cIndexAssignment_2_0; }
		
		//OwnedExpression
		public RuleCall getIndexOwnedExpressionParserRuleCall_2_0_0() { return cIndexOwnedExpressionParserRuleCall_2_0_0; }
		
		//(',' index+=OwnedExpression)*
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//','
		public Keyword getCommaKeyword_2_1_0() { return cCommaKeyword_2_1_0; }
		
		//index+=OwnedExpression
		public Assignment getIndexAssignment_2_1_1() { return cIndexAssignment_2_1_1; }
		
		//OwnedExpression
		public RuleCall getIndexOwnedExpressionParserRuleCall_2_1_1_0() { return cIndexOwnedExpressionParserRuleCall_2_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
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
		//        (
		//            namedElement=[aadl2::NamedElement|ID]
		//            (arrayRange+=ArrayRange)*
		//        )
		//        ('.' path=OtherDataRef)?
		////     |      'annex' namedElement=[aadl2::NamedElement|ID]
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//(
		//    namedElement=[aadl2::NamedElement|ID]
		//    (arrayRange+=ArrayRange)*
		//)
		//('.' path=OtherDataRef)?
		public Group getGroup() { return cGroup; }
		
		//(
		//    namedElement=[aadl2::NamedElement|ID]
		//    (arrayRange+=ArrayRange)*
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
		
		////TupleExpr
		////    {TupleExpr} '(' elements+=OwnedExpression (',' elements+=OwnedExpression)+ ')';
		////FunctionCall:
		////    func=PrimaryExpr '(' (args+=OwnedExpression (',' args+=OwnedExpression)*)? ')';
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
		private final RuleCall cEOwnedExpressionParserRuleCall_2_0 = (RuleCall)cEAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Alternatives cAlternatives_3_0 = (Alternatives)cGroup_3.eContents().get(0);
		private final Keyword cFullStopFullStopKeyword_3_0_0 = (Keyword)cAlternatives_3_0.eContents().get(0);
		private final Keyword cFullStopFullStopLessThanSignKeyword_3_0_1 = (Keyword)cAlternatives_3_0.eContents().get(1);
		private final Assignment cUpperAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cUpperOwnedExpressionParserRuleCall_3_1_0 = (RuleCall)cUpperAssignment_3_1.eContents().get(0);
		private final Group cGroup_3_2 = (Group)cGroup_3.eContents().get(2);
		private final Keyword cByKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Assignment cStepAssignment_3_2_1 = (Assignment)cGroup_3_2.eContents().get(1);
		private final RuleCall cStepOwnedExpressionParserRuleCall_3_2_1_0 = (RuleCall)cStepAssignment_3_2_1.eContents().get(0);
		
		//SlangForRange: ID ':' e=OwnedExpression ( ( '..' |  '..<' ) upper=OwnedExpression ( 'by' step=OwnedExpression )? )? ;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ':' e=OwnedExpression ( ( '..' |  '..<' ) upper=OwnedExpression ( 'by' step=OwnedExpression )? )?
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//e=OwnedExpression
		public Assignment getEAssignment_2() { return cEAssignment_2; }
		
		//OwnedExpression
		public RuleCall getEOwnedExpressionParserRuleCall_2_0() { return cEOwnedExpressionParserRuleCall_2_0; }
		
		//( ( '..' |  '..<' ) upper=OwnedExpression ( 'by' step=OwnedExpression )? )?
		public Group getGroup_3() { return cGroup_3; }
		
		//( '..' |  '..<' )
		public Alternatives getAlternatives_3_0() { return cAlternatives_3_0; }
		
		//'..'
		public Keyword getFullStopFullStopKeyword_3_0_0() { return cFullStopFullStopKeyword_3_0_0; }
		
		//'..<'
		public Keyword getFullStopFullStopLessThanSignKeyword_3_0_1() { return cFullStopFullStopLessThanSignKeyword_3_0_1; }
		
		//upper=OwnedExpression
		public Assignment getUpperAssignment_3_1() { return cUpperAssignment_3_1; }
		
		//OwnedExpression
		public RuleCall getUpperOwnedExpressionParserRuleCall_3_1_0() { return cUpperOwnedExpressionParserRuleCall_3_1_0; }
		
		//( 'by' step=OwnedExpression )?
		public Group getGroup_3_2() { return cGroup_3_2; }
		
		//'by'
		public Keyword getByKeyword_3_2_0() { return cByKeyword_3_2_0; }
		
		//step=OwnedExpression
		public Assignment getStepAssignment_3_2_1() { return cStepAssignment_3_2_1; }
		
		//OwnedExpression
		public RuleCall getStepOwnedExpressionParserRuleCall_3_2_1_0() { return cStepOwnedExpressionParserRuleCall_3_2_1_0; }
	}
	public class SlangRetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangRet");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSlangRetAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cReturnKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cEAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cEOwnedExpressionParserRuleCall_2_0 = (RuleCall)cEAssignment_2.eContents().get(0);
		
		//SlangRet: {SlangRet} 'return' e=OwnedExpression? ;
		@Override public ParserRule getRule() { return rule; }
		
		//{SlangRet} 'return' e=OwnedExpression?
		public Group getGroup() { return cGroup; }
		
		//{SlangRet}
		public Action getSlangRetAction_0() { return cSlangRetAction_0; }
		
		//'return'
		public Keyword getReturnKeyword_1() { return cReturnKeyword_1; }
		
		//e=OwnedExpression?
		public Assignment getEAssignment_2() { return cEAssignment_2; }
		
		//OwnedExpression
		public RuleCall getEOwnedExpressionParserRuleCall_2_0() { return cEOwnedExpressionParserRuleCall_2_0; }
	}
	public class SlangCallSuffixElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangCallSuffix");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSlangCallSuffixAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cCaAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cCaSlangCallArgsParserRuleCall_1_0 = (RuleCall)cCaAssignment_1.eContents().get(0);
		
		//SlangCallSuffix: {SlangCallSuffix}
		//  ca=SlangCallArgs
		//    //ta=SlangTypeArgs ca=SlangCallArgs // TODO: add back ? for call args when support for no param methods is added
		//    //| ca=SlangCallArgs
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//{SlangCallSuffix}
		// ca=SlangCallArgs
		public Group getGroup() { return cGroup; }
		
		//{SlangCallSuffix}
		public Action getSlangCallSuffixAction_0() { return cSlangCallSuffixAction_0; }
		
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
		private final RuleCall cArgOwnedExpressionParserRuleCall_2_0_0 = (RuleCall)cArgAssignment_2_0.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cGroup_2.eContents().get(1);
		private final Keyword cCommaKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cArgAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cArgOwnedExpressionParserRuleCall_2_1_1_0 = (RuleCall)cArgAssignment_2_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		////SlangCallArgs: {SlangCallArgs} '(' ( arg+=SlangIDExp ( ',' arg+=SlangIDExp )* )? ')' ;
		//SlangCallArgs: {SlangCallArgs} '(' ( arg+=OwnedExpression ( ',' arg+=OwnedExpression )* )? ')' ;
		@Override public ParserRule getRule() { return rule; }
		
		//{SlangCallArgs} '(' ( arg+=OwnedExpression ( ',' arg+=OwnedExpression )* )? ')'
		public Group getGroup() { return cGroup; }
		
		//{SlangCallArgs}
		public Action getSlangCallArgsAction_0() { return cSlangCallArgsAction_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//( arg+=OwnedExpression ( ',' arg+=OwnedExpression )* )?
		public Group getGroup_2() { return cGroup_2; }
		
		//arg+=OwnedExpression
		public Assignment getArgAssignment_2_0() { return cArgAssignment_2_0; }
		
		//OwnedExpression
		public RuleCall getArgOwnedExpressionParserRuleCall_2_0_0() { return cArgOwnedExpressionParserRuleCall_2_0_0; }
		
		//( ',' arg+=OwnedExpression )*
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//','
		public Keyword getCommaKeyword_2_1_0() { return cCommaKeyword_2_1_0; }
		
		//arg+=OwnedExpression
		public Assignment getArgAssignment_2_1_1() { return cArgAssignment_2_1_1; }
		
		//OwnedExpression
		public RuleCall getArgOwnedExpressionParserRuleCall_2_1_1_0() { return cArgOwnedExpressionParserRuleCall_2_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class SlangLitElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangLit");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cBooleanLitAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Assignment cValueAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final Alternatives cValueAlternatives_0_1_0 = (Alternatives)cValueAssignment_0_1.eContents().get(0);
		private final Keyword cValueTKeyword_0_1_0_0 = (Keyword)cValueAlternatives_0_1_0.eContents().get(0);
		private final Keyword cValueFKeyword_0_1_0_1 = (Keyword)cValueAlternatives_0_1_0.eContents().get(1);
		private final Keyword cValueTrueKeyword_0_1_0_2 = (Keyword)cValueAlternatives_0_1_0.eContents().get(2);
		private final Keyword cValueFalseKeyword_0_1_0_3 = (Keyword)cValueAlternatives_0_1_0.eContents().get(3);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cIntegerLitAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cValueAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cValueINTEGER_LITTerminalRuleCall_1_1_0 = (RuleCall)cValueAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Action cHexLitAction_2_0 = (Action)cGroup_2.eContents().get(0);
		private final Assignment cValueAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cValueHEXTerminalRuleCall_2_1_0 = (RuleCall)cValueAssignment_2_1.eContents().get(0);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final Action cBinLitAction_3_0 = (Action)cGroup_3.eContents().get(0);
		private final Assignment cValueAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cValueBINTerminalRuleCall_3_1_0 = (RuleCall)cValueAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cAlternatives.eContents().get(4);
		private final Action cF32LitAction_4_0 = (Action)cGroup_4.eContents().get(0);
		private final Assignment cValueAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cValueF32_LITTerminalRuleCall_4_1_0 = (RuleCall)cValueAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cAlternatives.eContents().get(5);
		private final Action cF64LitAction_5_0 = (Action)cGroup_5.eContents().get(0);
		private final Assignment cValueAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final Alternatives cValueAlternatives_5_1_0 = (Alternatives)cValueAssignment_5_1.eContents().get(0);
		private final RuleCall cValueF64_LITTerminalRuleCall_5_1_0_0 = (RuleCall)cValueAlternatives_5_1_0.eContents().get(0);
		private final RuleCall cValueREAL_LITTerminalRuleCall_5_1_0_1 = (RuleCall)cValueAlternatives_5_1_0.eContents().get(1);
		private final Group cGroup_6 = (Group)cAlternatives.eContents().get(6);
		private final Action cSlangStringLitAction_6_0 = (Action)cGroup_6.eContents().get(0);
		private final Assignment cValueAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cValueSTRING_VALUETerminalRuleCall_6_1_0 = (RuleCall)cValueAssignment_6_1.eContents().get(0);
		
		////SlangIDExp: e+=Expr ( ':=' e+=Expr )? ;
		//SlangLit
		//    : {BooleanLit} value=('T' | 'F' | 'true' | 'false')
		//    //| {ResultLit} 'res'
		//    | {IntegerLit} value=INTEGER_LIT
		//    //| {IntIdfLit} value=INT_IDF
		//    | {HexLit} value=HEX
		//    | {BinLit} value=BIN
		//    | {F32Lit} value=F32_LIT
		//    | {F64Lit} value=(F64_LIT | REAL_LIT)
		//    //| {F32Obj} value='F32'
		//    //| {F64Obj} value='F64'
		//    | {SlangStringLit} value=STRING_VALUE
		//    //| {RealIdfLit} value=REAL_IDF
		//    //| {MStringLit} value=MSTRING
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//{BooleanLit} value=('T' | 'F' | 'true' | 'false')
		//   //| {ResultLit} 'res'
		//   | {IntegerLit} value=INTEGER_LIT
		//   //| {IntIdfLit} value=INT_IDF
		//   | {HexLit} value=HEX
		//   | {BinLit} value=BIN
		//   | {F32Lit} value=F32_LIT
		//   | {F64Lit} value=(F64_LIT | REAL_LIT)
		//   //| {F32Obj} value='F32'
		//   //| {F64Obj} value='F64'
		//   | {SlangStringLit} value=STRING_VALUE
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{BooleanLit} value=('T' | 'F' | 'true' | 'false')
		public Group getGroup_0() { return cGroup_0; }
		
		//{BooleanLit}
		public Action getBooleanLitAction_0_0() { return cBooleanLitAction_0_0; }
		
		//value=('T' | 'F' | 'true' | 'false')
		public Assignment getValueAssignment_0_1() { return cValueAssignment_0_1; }
		
		//('T' | 'F' | 'true' | 'false')
		public Alternatives getValueAlternatives_0_1_0() { return cValueAlternatives_0_1_0; }
		
		//'T'
		public Keyword getValueTKeyword_0_1_0_0() { return cValueTKeyword_0_1_0_0; }
		
		//'F'
		public Keyword getValueFKeyword_0_1_0_1() { return cValueFKeyword_0_1_0_1; }
		
		//'true'
		public Keyword getValueTrueKeyword_0_1_0_2() { return cValueTrueKeyword_0_1_0_2; }
		
		//'false'
		public Keyword getValueFalseKeyword_0_1_0_3() { return cValueFalseKeyword_0_1_0_3; }
		
		//{IntegerLit} value=INTEGER_LIT
		public Group getGroup_1() { return cGroup_1; }
		
		//{IntegerLit}
		public Action getIntegerLitAction_1_0() { return cIntegerLitAction_1_0; }
		
		//value=INTEGER_LIT
		public Assignment getValueAssignment_1_1() { return cValueAssignment_1_1; }
		
		//INTEGER_LIT
		public RuleCall getValueINTEGER_LITTerminalRuleCall_1_1_0() { return cValueINTEGER_LITTerminalRuleCall_1_1_0; }
		
		//{HexLit} value=HEX
		public Group getGroup_2() { return cGroup_2; }
		
		//{HexLit}
		public Action getHexLitAction_2_0() { return cHexLitAction_2_0; }
		
		//value=HEX
		public Assignment getValueAssignment_2_1() { return cValueAssignment_2_1; }
		
		//HEX
		public RuleCall getValueHEXTerminalRuleCall_2_1_0() { return cValueHEXTerminalRuleCall_2_1_0; }
		
		//{BinLit} value=BIN
		public Group getGroup_3() { return cGroup_3; }
		
		//{BinLit}
		public Action getBinLitAction_3_0() { return cBinLitAction_3_0; }
		
		//value=BIN
		public Assignment getValueAssignment_3_1() { return cValueAssignment_3_1; }
		
		//BIN
		public RuleCall getValueBINTerminalRuleCall_3_1_0() { return cValueBINTerminalRuleCall_3_1_0; }
		
		//{F32Lit} value=F32_LIT
		public Group getGroup_4() { return cGroup_4; }
		
		//{F32Lit}
		public Action getF32LitAction_4_0() { return cF32LitAction_4_0; }
		
		//value=F32_LIT
		public Assignment getValueAssignment_4_1() { return cValueAssignment_4_1; }
		
		//F32_LIT
		public RuleCall getValueF32_LITTerminalRuleCall_4_1_0() { return cValueF32_LITTerminalRuleCall_4_1_0; }
		
		//{F64Lit} value=(F64_LIT | REAL_LIT)
		public Group getGroup_5() { return cGroup_5; }
		
		//{F64Lit}
		public Action getF64LitAction_5_0() { return cF64LitAction_5_0; }
		
		//value=(F64_LIT | REAL_LIT)
		public Assignment getValueAssignment_5_1() { return cValueAssignment_5_1; }
		
		//(F64_LIT | REAL_LIT)
		public Alternatives getValueAlternatives_5_1_0() { return cValueAlternatives_5_1_0; }
		
		//F64_LIT
		public RuleCall getValueF64_LITTerminalRuleCall_5_1_0_0() { return cValueF64_LITTerminalRuleCall_5_1_0_0; }
		
		//REAL_LIT
		public RuleCall getValueREAL_LITTerminalRuleCall_5_1_0_1() { return cValueREAL_LITTerminalRuleCall_5_1_0_1; }
		
		//{SlangStringLit} value=STRING_VALUE
		public Group getGroup_6() { return cGroup_6; }
		
		//{SlangStringLit}
		public Action getSlangStringLitAction_6_0() { return cSlangStringLitAction_6_0; }
		
		//value=STRING_VALUE
		public Assignment getValueAssignment_6_1() { return cValueAssignment_6_1; }
		
		//STRING_VALUE
		public RuleCall getValueSTRING_VALUETerminalRuleCall_6_1_0() { return cValueSTRING_VALUETerminalRuleCall_6_1_0; }
	}
	public class SlangInterpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SlangInterp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSlangLiteralInterpAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cSliAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSliSLITerminalRuleCall_1_0 = (RuleCall)cSliAssignment_1.eContents().get(0);
		
		//SlangInterp
		//    //: {SlangMspInterp} msp=MSP
		//    //| {SlangLiteralInterp} sli=SLI
		//    //| {SlangMspbInterp} mspb=MSPB minterp=SlangMInterp
		//    : {SlangLiteralInterp} sli=SLI;
		@Override public ParserRule getRule() { return rule; }
		
		//{SlangLiteralInterp} sli=SLI
		public Group getGroup() { return cGroup; }
		
		//{SlangLiteralInterp}
		public Action getSlangLiteralInterpAction_0() { return cSlangLiteralInterpAction_0; }
		
		//sli=SLI
		public Assignment getSliAssignment_1() { return cSliAssignment_1; }
		
		//SLI
		public RuleCall getSliSLITerminalRuleCall_1_0() { return cSliSLITerminalRuleCall_1_0; }
	}
	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.QualifiedName");
		private final RuleCall cQCREFParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		////SlangMInterp
		//    //: '{' e=OwnedExpression '}' ( MSPM m=SlangMInterp | MSPE )
		//    //;
		//QualifiedName
		//    : QCREF;
		@Override public ParserRule getRule() { return rule; }
		
		//QCREF
		public RuleCall getQCREFParserRuleCall() { return cQCREFParserRuleCall; }
	}
	public class UnaryOpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.UnaryOp");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cPlusMinusParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cNOTTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//UnaryOp: PlusMinus | NOT;
		@Override public ParserRule getRule() { return rule; }
		
		//PlusMinus | NOT
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//PlusMinus
		public RuleCall getPlusMinusParserRuleCall_0() { return cPlusMinusParserRuleCall_0; }
		
		//NOT
		public RuleCall getNOTTerminalRuleCall_1() { return cNOTTerminalRuleCall_1; }
	}
	public class MultiplicativeOpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.MultiplicativeOp");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTARParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMULTIPLICATIVE_OPTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//MultiplicativeOp: STAR | MULTIPLICATIVE_OP;
		@Override public ParserRule getRule() { return rule; }
		
		//STAR | MULTIPLICATIVE_OP
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STAR
		public RuleCall getSTARParserRuleCall_0() { return cSTARParserRuleCall_0; }
		
		//MULTIPLICATIVE_OP
		public RuleCall getMULTIPLICATIVE_OPTerminalRuleCall_1() { return cMULTIPLICATIVE_OPTerminalRuleCall_1; }
	}
	public class PlusMinusOpsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.PlusMinusOps");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSLANG_OPTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cPlusMinusParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//PlusMinusOps:
		//    SLANG_OP | PlusMinus
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//SLANG_OP | PlusMinus
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//SLANG_OP
		public RuleCall getSLANG_OPTerminalRuleCall_0() { return cSLANG_OPTerminalRuleCall_0; }
		
		//PlusMinus
		public RuleCall getPlusMinusParserRuleCall_1() { return cPlusMinusParserRuleCall_1; }
	}
	public class ImpliesOpsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.ImpliesOps");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cIMPLIESTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cSIMPLIESTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//ImpliesOps: IMPLIES | SIMPLIES;
		@Override public ParserRule getRule() { return rule; }
		
		//IMPLIES | SIMPLIES
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//IMPLIES
		public RuleCall getIMPLIESTerminalRuleCall_0() { return cIMPLIESTerminalRuleCall_0; }
		
		//SIMPLIES
		public RuleCall getSIMPLIESTerminalRuleCall_1() { return cSIMPLIESTerminalRuleCall_1; }
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
	private final InfoFlowClauseElements pInfoFlowClause;
	private final HandlerClauseElements pHandlerClause;
	private final CaseStatementClauseElements pCaseStatementClause;
	private final SpecStatementElements pSpecStatement;
	private final AssumeStatementElements pAssumeStatement;
	private final AnonAssumeStatementElements pAnonAssumeStatement;
	private final GuaranteeStatementElements pGuaranteeStatement;
	private final AnonGuaranteeStatementElements pAnonGuaranteeStatement;
	private final DataElementElements pDataElement;
	private final SubcomponentElementElements pSubcomponentElement;
	private final FunctionsElements pFunctions;
	private final FuncSpecElements pFuncSpec;
	private final SlangDefDefElements pSlangDefDef;
	private final SlangDefIDElements pSlangDefID;
	private final SlangDefParamsElements pSlangDefParams;
	private final SlangDefParamElements pSlangDefParam;
	private final SlangTypeParamsElements pSlangTypeParams;
	private final SlangTypeParamElements pSlangTypeParam;
	private final SlangDefContractElements pSlangDefContract;
	private final SlangInvariantElements pSlangInvariant;
	private final SlangRequiresElements pSlangRequires;
	private final SlangReadsElements pSlangReads;
	private final SlangModifiesElements pSlangModifies;
	private final SlangEnsuresElements pSlangEnsures;
	private final SlangTypeElements pSlangType;
	private final SlangBaseTypeElements pSlangBaseType;
	private final SlangStmtElements pSlangStmt;
	private final SlangElseElements pSlangElse;
	private final SlangLoopContractElements pSlangLoopContract;
	private final SlangCaseElements pSlangCase;
	private final SlangPatternElements pSlangPattern;
	private final SlangTPatternElements pSlangTPattern;
	private final SlangVarDefElements pSlangVarDef;
	private final SlangVarModElements pSlangVarMod;
	private final SlangBlockElements pSlangBlock;
	private final OwnedExpressionElements pOwnedExpression;
	private final SlangExpressionElements pSlangExpression;
	private final QuantRangeElements pQuantRange;
	private final QuantParamElements pQuantParam;
	private final ImpliesExpressionElements pImpliesExpression;
	private final OrExpressionElements pOrExpression;
	private final AndExpressionElements pAndExpression;
	private final EqualNotExpressionElements pEqualNotExpression;
	private final LtGtExpressionElements pLtGtExpression;
	private final ColonExpressionElements pColonExpression;
	private final PlusMinusExpressionElements pPlusMinusExpression;
	private final MultiplicativeExpressionElements pMultiplicativeExpression;
	private final UnaryExpressionElements pUnaryExpression;
	private final PrimaryExprElements pPrimaryExpr;
	private final BaseExprElements pBaseExpr;
	private final FloatObjectExprElements pFloatObjectExpr;
	private final AccessibleBaseExprElements pAccessibleBaseExpr;
	private final QualifiedAADLNameElements pQualifiedAADLName;
	private final PostfixElements pPostfix;
	private final MemberAccessElements pMemberAccess;
	private final ArrayAccessElements pArrayAccess;
	private final OtherDataRefElements pOtherDataRef;
	private final SlangParamsElements pSlangParams;
	private final SlangParamElements pSlangParam;
	private final SlangForRangeElements pSlangForRange;
	private final SlangRetElements pSlangRet;
	private final SlangCallSuffixElements pSlangCallSuffix;
	private final SlangCallArgsElements pSlangCallArgs;
	private final SlangLitElements pSlangLit;
	private final SlangInterpElements pSlangInterp;
	private final QualifiedNameElements pQualifiedName;
	private final TerminalRule tSTRING_VALUE;
	private final TerminalRule tSLI;
	private final TerminalRule tQUANTIFIER_OP;
	private final UnaryOpElements pUnaryOp;
	private final TerminalRule tNOT;
	private final MultiplicativeOpElements pMultiplicativeOp;
	private final TerminalRule tMULTIPLICATIVE_OP;
	private final PlusMinusOpsElements pPlusMinusOps;
	private final TerminalRule tSLANG_OP;
	private final TerminalRule tCOLON_OP;
	private final TerminalRule tLT_GT_OPS;
	private final TerminalRule tEQUAL_NOT_OPS;
	private final TerminalRule tAND_OPS;
	private final TerminalRule tOR_OPS;
	private final ImpliesOpsElements pImpliesOps;
	private final TerminalRule tIMPLIES;
	private final TerminalRule tSIMPLIES;
	private final TerminalRule tHEX;
	private final TerminalRule tBIN;
	private final TerminalRule tF32_LIT;
	private final TerminalRule tF64_LIT;
	private final TerminalRule tIDF;
	private final TerminalRule tMSPI;
	private final TerminalRule tLETTER;
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
		this.pInfoFlowClause = new InfoFlowClauseElements();
		this.pHandlerClause = new HandlerClauseElements();
		this.pCaseStatementClause = new CaseStatementClauseElements();
		this.pSpecStatement = new SpecStatementElements();
		this.pAssumeStatement = new AssumeStatementElements();
		this.pAnonAssumeStatement = new AnonAssumeStatementElements();
		this.pGuaranteeStatement = new GuaranteeStatementElements();
		this.pAnonGuaranteeStatement = new AnonGuaranteeStatementElements();
		this.pDataElement = new DataElementElements();
		this.pSubcomponentElement = new SubcomponentElementElements();
		this.pFunctions = new FunctionsElements();
		this.pFuncSpec = new FuncSpecElements();
		this.pSlangDefDef = new SlangDefDefElements();
		this.pSlangDefID = new SlangDefIDElements();
		this.pSlangDefParams = new SlangDefParamsElements();
		this.pSlangDefParam = new SlangDefParamElements();
		this.pSlangTypeParams = new SlangTypeParamsElements();
		this.pSlangTypeParam = new SlangTypeParamElements();
		this.pSlangDefContract = new SlangDefContractElements();
		this.pSlangInvariant = new SlangInvariantElements();
		this.pSlangRequires = new SlangRequiresElements();
		this.pSlangReads = new SlangReadsElements();
		this.pSlangModifies = new SlangModifiesElements();
		this.pSlangEnsures = new SlangEnsuresElements();
		this.pSlangType = new SlangTypeElements();
		this.pSlangBaseType = new SlangBaseTypeElements();
		this.pSlangStmt = new SlangStmtElements();
		this.pSlangElse = new SlangElseElements();
		this.pSlangLoopContract = new SlangLoopContractElements();
		this.pSlangCase = new SlangCaseElements();
		this.pSlangPattern = new SlangPatternElements();
		this.pSlangTPattern = new SlangTPatternElements();
		this.pSlangVarDef = new SlangVarDefElements();
		this.pSlangVarMod = new SlangVarModElements();
		this.pSlangBlock = new SlangBlockElements();
		this.pOwnedExpression = new OwnedExpressionElements();
		this.pSlangExpression = new SlangExpressionElements();
		this.pQuantRange = new QuantRangeElements();
		this.pQuantParam = new QuantParamElements();
		this.pImpliesExpression = new ImpliesExpressionElements();
		this.pOrExpression = new OrExpressionElements();
		this.pAndExpression = new AndExpressionElements();
		this.pEqualNotExpression = new EqualNotExpressionElements();
		this.pLtGtExpression = new LtGtExpressionElements();
		this.pColonExpression = new ColonExpressionElements();
		this.pPlusMinusExpression = new PlusMinusExpressionElements();
		this.pMultiplicativeExpression = new MultiplicativeExpressionElements();
		this.pUnaryExpression = new UnaryExpressionElements();
		this.pPrimaryExpr = new PrimaryExprElements();
		this.pBaseExpr = new BaseExprElements();
		this.pFloatObjectExpr = new FloatObjectExprElements();
		this.pAccessibleBaseExpr = new AccessibleBaseExprElements();
		this.pQualifiedAADLName = new QualifiedAADLNameElements();
		this.pPostfix = new PostfixElements();
		this.pMemberAccess = new MemberAccessElements();
		this.pArrayAccess = new ArrayAccessElements();
		this.pOtherDataRef = new OtherDataRefElements();
		this.pSlangParams = new SlangParamsElements();
		this.pSlangParam = new SlangParamElements();
		this.pSlangForRange = new SlangForRangeElements();
		this.pSlangRet = new SlangRetElements();
		this.pSlangCallSuffix = new SlangCallSuffixElements();
		this.pSlangCallArgs = new SlangCallArgsElements();
		this.pSlangLit = new SlangLitElements();
		this.pSlangInterp = new SlangInterpElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.tSTRING_VALUE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.STRING_VALUE");
		this.tSLI = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SLI");
		this.tQUANTIFIER_OP = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.QUANTIFIER_OP");
		this.pUnaryOp = new UnaryOpElements();
		this.tNOT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.NOT");
		this.pMultiplicativeOp = new MultiplicativeOpElements();
		this.tMULTIPLICATIVE_OP = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.MULTIPLICATIVE_OP");
		this.pPlusMinusOps = new PlusMinusOpsElements();
		this.tSLANG_OP = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SLANG_OP");
		this.tCOLON_OP = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.COLON_OP");
		this.tLT_GT_OPS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.LT_GT_OPS");
		this.tEQUAL_NOT_OPS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.EQUAL_NOT_OPS");
		this.tAND_OPS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.AND_OPS");
		this.tOR_OPS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.OR_OPS");
		this.pImpliesOps = new ImpliesOpsElements();
		this.tIMPLIES = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.IMPLIES");
		this.tSIMPLIES = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SIMPLIES");
		this.tHEX = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.HEX");
		this.tBIN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.BIN");
		this.tF32_LIT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.F32_LIT");
		this.tF64_LIT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.F64_LIT");
		this.tIDF = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.IDF");
		this.tMSPI = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.MSPI");
		this.tLETTER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.LETTER");
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
	//        (functions = Functions)?
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
	// (name = ID ':') typeName=[aadl2::DataSubcomponentType|QualifiedName] ';' // TODO: ( ':=' expr=OwnedExpression)? ';'
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
	//    'inv' id=ID descriptor=STRING_VALUE? ':' expr=OwnedExpression ';'
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
	//    {Initialize} 'initialize'
	//      (modifies=SlangModifies ';')?
	//      (specs+=InitializeSpecStatement)*
	//      (flows+=InfoFlowClause)*
	//;
	public InitializeElements getInitializeAccess() {
		return pInitialize;
	}
	
	public ParserRule getInitializeRule() {
		return getInitializeAccess().getRule();
	}
	
	//InitializeSpecStatement:
	//  guaranteeStatement = GuaranteeStatement
	//;
	public InitializeSpecStatementElements getInitializeSpecStatementAccess() {
		return pInitializeSpecStatement;
	}
	
	public ParserRule getInitializeSpecStatementRule() {
		return getInitializeSpecStatementAccess().getRule();
	}
	
	//Compute:
	//    {Compute} 'compute'
	//      (modifies=SlangModifies ';')?
	//      (assumes+=AssumeStatement)*
	//      (guarantees+=GuaranteeStatement)*
	//      ('cases' (cases+=CaseStatementClause)+)*
	//      (handlers+=HandlerClause)*
	//      (flows+=InfoFlowClause)*
	//;
	public ComputeElements getComputeAccess() {
		return pCompute;
	}
	
	public ParserRule getComputeRule() {
		return getComputeAccess().getRule();
	}
	
	//InfoFlowClause:
	//    'infoflow' id=ID descriptor=STRING_VALUE? ':'
	//          'from' '(' (fromPortOrStateVar+=[ecore::EObject|ID] ( ',' fromPortOrStateVar+=[ecore::EObject|ID])* )? ')'
	//          ','
	//          'to' '(' (toPortOrStateVar+=[ecore::EObject|ID] ( ',' toPortOrStateVar+=[ecore::EObject|ID])* )? ')' ';'
	//;
	public InfoFlowClauseElements getInfoFlowClauseAccess() {
		return pInfoFlowClause;
	}
	
	public ParserRule getInfoFlowClauseRule() {
		return getInfoFlowClauseAccess().getRule();
	}
	
	//HandlerClause:
	//    'handle' id=[aadl2::Port|ID] ':'
	//    (modifies=SlangModifies ';')?
	//    (assumes+=AssumeStatement)*
	//    (guarantees+=GuaranteeStatement)*
	//    ('cases' (cases+=CaseStatementClause)+)*
	//;
	public HandlerClauseElements getHandlerClauseAccess() {
		return pHandlerClause;
	}
	
	public ParserRule getHandlerClauseRule() {
		return getHandlerClauseAccess().getRule();
	}
	
	//CaseStatementClause:
	//    'case' id=ID descriptor=STRING_VALUE? ':'
	//           (assumeStatement=AnonAssumeStatement)?
	//           guaranteeStatement=AnonGuaranteeStatement
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
	//    'assume' id=ID descriptor=STRING_VALUE? ':' expr=OwnedExpression ';'
	//;
	public AssumeStatementElements getAssumeStatementAccess() {
		return pAssumeStatement;
	}
	
	public ParserRule getAssumeStatementRule() {
		return getAssumeStatementAccess().getRule();
	}
	
	//AnonAssumeStatement:
	//    'assume' expr=OwnedExpression ';'
	//;
	public AnonAssumeStatementElements getAnonAssumeStatementAccess() {
		return pAnonAssumeStatement;
	}
	
	public ParserRule getAnonAssumeStatementRule() {
		return getAnonAssumeStatementAccess().getRule();
	}
	
	//GuaranteeStatement:
	//    'guarantee' id=ID descriptor=STRING_VALUE? ':' expr=OwnedExpression ';'
	//;
	public GuaranteeStatementElements getGuaranteeStatementAccess() {
		return pGuaranteeStatement;
	}
	
	public ParserRule getGuaranteeStatementRule() {
		return getGuaranteeStatementAccess().getRule();
	}
	
	//AnonGuaranteeStatement:
	//    'guarantee' expr=OwnedExpression ';'
	//;
	public AnonGuaranteeStatementElements getAnonGuaranteeStatementAccess() {
		return pAnonGuaranteeStatement;
	}
	
	public ParserRule getAnonGuaranteeStatementRule() {
		return getAnonGuaranteeStatementAccess().getRule();
	}
	
	////PREDICATE: // TODO
	////    ID
	////;
	////DoubleDotRef:
	//    //elm=[aadl2::NamedElement|QualifiedName]
	////;
	//DataElement returns DataElement:
	//    dataElement = [aadl2::DataSubcomponentType|QualifiedName]
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
	
	////SlangDefDeclDef: 'def' SlangDefMods? sde=SlangDefExt? name=SlangDefID typeParams=SlangTypeParams? params=SlangDefParams? ':' type=SlangType c=SlangDefContract? ( ':=' e=OwnedExpression )? ;
	////SlangDefDecl: SlangDefMods? 'def'
	////    //sde=SlangDefExt?
	////    name=SlangDefID typeParams=SlangTypeParams? params=SlangDefParams? ':' type=SlangType c=SlangDefContract?
	////;
	//SlangDefDef:
	//     //defMods=SlangDefMods
	//     'def'
	//     //sde=SlangDefExt?
	//     name=SlangDefID
	//        typeParams=SlangTypeParams? params=SlangDefParams ':' type=SlangType // TODO: make parens optional if no params, requires codegen/sym-resolver modifications
	//        ':=' methodContract=SlangDefContract body=OwnedExpression
	//;
	public SlangDefDefElements getSlangDefDefAccess() {
		return pSlangDefDef;
	}
	
	public ParserRule getSlangDefDefRule() {
		return getSlangDefDefAccess().getRule();
	}
	
	////SlangDefMods: 'strict' | 'memoize' | 'mut' | 'spec' ;
	////SlangDefMods: '@strictpure' | '@pure';
	////SlangDefExt: '(' name=ID ':' typeName=SlangType ')' ;
	//// NOTE: removing Operator as that's part of the Slang expr language and therefore will not be
	////       present in kerml's expression language. This is probably okay since, for e.g., "def + ()..."
	////       isn't valid Slang anyway
	//SlangDefID: ID;
	public SlangDefIDElements getSlangDefIDAccess() {
		return pSlangDefID;
	}
	
	public ParserRule getSlangDefIDRule() {
		return getSlangDefIDAccess().getRule();
	}
	
	// //| Operator ;
	//SlangDefParams: '(' (params+=SlangDefParam ( ',' params+=SlangDefParam )* )? ')' ;
	public SlangDefParamsElements getSlangDefParamsAccess() {
		return pSlangDefParams;
	}
	
	public ParserRule getSlangDefParamsRule() {
		return getSlangDefParamsAccess().getRule();
	}
	
	//SlangDefParam: name=ID ':' (isMethodDef ?= '=>'?) typeName=SlangType (isVarArg ?= '*'?) ;
	public SlangDefParamElements getSlangDefParamAccess() {
		return pSlangDefParam;
	}
	
	public ParserRule getSlangDefParamRule() {
		return getSlangDefParamAccess().getRule();
	}
	
	//SlangTypeParams: '[' typeParam+=SlangTypeParam (  ',' typeParam+=SlangTypeParam )* ']' ;
	public SlangTypeParamsElements getSlangTypeParamsAccess() {
		return pSlangTypeParams;
	}
	
	public ParserRule getSlangTypeParamsRule() {
		return getSlangTypeParamsAccess().getRule();
	}
	
	//SlangTypeParam: isMut ?= 'mut'? name=ID ;
	public SlangTypeParamElements getSlangTypeParamAccess() {
		return pSlangTypeParam;
	}
	
	public ParserRule getSlangTypeParamRule() {
		return getSlangTypeParamAccess().getRule();
	}
	
	//SlangDefContract
	//    : {SlangDefContract}
	//      (
	//        ( reads=SlangReads ';' )?
	//        ( requires=SlangRequires ';' )?
	//        ( modifies=SlangModifies ';' )?
	//        ( ensures=SlangEnsures ';' )?
	//      )
	//    ;
	public SlangDefContractElements getSlangDefContractAccess() {
		return pSlangDefContract;
	}
	
	public ParserRule getSlangDefContractRule() {
		return getSlangDefContractAccess().getRule();
	}
	
	////SlangDefContractCase: {SlangDefContractCase} 'case' STRING_VALUE req=SlangRequires? ens=SlangEnsures? ;
	////SlangSuprs: '<:' superTypes+=SlangSupr ( ',' superTypes+=SlangSupr )* ;
	////SlangSupr: name=SlangName args=SlangTypeArgs? ;
	////SlangName: ID ( '.' ID )* ;
	////SlangExt: {SlangExt} 'extension' ID ( 'for' SlangName )?  '{' decl+=SlangDefDecl* '}' ;
	//SlangInvariant: 'invariant' exprs+=OwnedExpression ( ',' exprs+=OwnedExpression )* ;
	public SlangInvariantElements getSlangInvariantAccess() {
		return pSlangInvariant;
	}
	
	public ParserRule getSlangInvariantRule() {
		return getSlangInvariantAccess().getRule();
	}
	
	//SlangRequires: 'assume' exprs+=OwnedExpression ( ',' exprs+=OwnedExpression )*  ;
	public SlangRequiresElements getSlangRequiresAccess() {
		return pSlangRequires;
	}
	
	public ParserRule getSlangRequiresRule() {
		return getSlangRequiresAccess().getRule();
	}
	
	//SlangReads: 'reads' exprs+=OwnedExpression ( ',' exprs+=OwnedExpression )* ;
	public SlangReadsElements getSlangReadsAccess() {
		return pSlangReads;
	}
	
	public ParserRule getSlangReadsRule() {
		return getSlangReadsAccess().getRule();
	}
	
	//SlangModifies: 'modifies' exprs+=OwnedExpression ( ',' exprs+=OwnedExpression )*  ;
	public SlangModifiesElements getSlangModifiesAccess() {
		return pSlangModifies;
	}
	
	public ParserRule getSlangModifiesRule() {
		return getSlangModifiesAccess().getRule();
	}
	
	//SlangEnsures: 'guarantee'  exprs+=OwnedExpression ( ',' exprs+=OwnedExpression )* ;
	public SlangEnsuresElements getSlangEnsuresAccess() {
		return pSlangEnsures;
	}
	
	public ParserRule getSlangEnsuresRule() {
		return getSlangEnsuresAccess().getRule();
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
	//    : typeName=[aadl2::DataSubcomponentType|QualifiedName]//ID SlangTypeArgs?
	//    //| '(' ( SlangType ( ',' SlangType )* )? ')'
	//    ;
	public SlangBaseTypeElements getSlangBaseTypeAccess() {
		return pSlangBaseType;
	}
	
	public ParserRule getSlangBaseTypeRule() {
		return getSlangBaseTypeAccess().getRule();
	}
	
	////SlangTypeArgs: '[' types+=SlangType ( ',' types+=SlangType )* ']' ;
	//// The following is replaced by KerML's expression language
	//SlangStmt
	//    : {SlangVarDef} d=SlangVarDef
	//    | {SlangIfStmt} 'if' cond=OwnedExpression b=SlangBlock e=SlangElse?
	//    | {SlangWhileStmt} 'while' cond=OwnedExpression l=SlangLoopContract b=SlangBlock
	////    | ({SlangForStmt} 'for' range+=SlangForRange ( ','  range+=SlangForRange )*) l=SlangLoopContract b=SlangBlock
	//    | {SlangMatchStmt} 'match' testExpr=OwnedExpression '{' c+=SlangCase* '}'
	//    | {SlangSpecStmt} 'spec' b=SlangBlock
	//    | {SlangAssumeStmt} 'assume' e=OwnedExpression STRING_VALUE?
	//    | {SlangAssertStmt} 'assert' e=OwnedExpression STRING_VALUE?
	//    | {SlangHaltStmt} 'halt' STRING_VALUE?
	//    | {SlangDoStmt} 'do' e=OwnedExpression
	//    // FIXME: This causes a "multiple alternatives" warning.
	//    //| {SlangIdStmt} portOrSubcomponentOrStateVar=[ecore::EObject|ID]
	//    //  ( ':'
	//    //  | l+=SlangLHSSuffix* ( ( ':=' | DEFOP ) e=OwnedExpression )?
	//    //  )
	//    ;
	public SlangStmtElements getSlangStmtAccess() {
		return pSlangStmt;
	}
	
	public ParserRule getSlangStmtRule() {
		return getSlangStmtAccess().getRule();
	}
	
	//SlangElse
	//    : 'else'
	//        ( 'if' cond=OwnedExpression b=SlangBlock e=SlangElse?
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
	
	////SlangLHSSuffix
	////    : {SlangFieldLookup} '.' ID
	////    | {SlangMethodCall} '(' ( exprs+=OwnedExpression ( ',' exprs+=OwnedExpression )* )? ')'
	////    ;
	//SlangCase: 'case' pattern=SlangPattern ( 'if' e=OwnedExpression )? '=>' s+=SlangStmt* ;
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
	
	////SlangTypedVarDef returns SlangVarDef:
	////    SlangVarMod SlangPattern ':' typeName=SlangType ':=' init=OwnedExpression
	////;
	//SlangVarDef: SlangVarMod SlangPattern ( ':' typeName=SlangType )? ':=' init=OwnedExpression ;
	public SlangVarDefElements getSlangVarDefAccess() {
		return pSlangVarDef;
	}
	
	public ParserRule getSlangVarDefRule() {
		return getSlangVarDefAccess().getRule();
	}
	
	////SlangVarDeclDef returns SlangVarDef:
	////    SlangVarMod 'spec'? name=ID ':' typeName=SlangType ( ':=' init=OwnedExpression )?
	////;
	//SlangVarMod: 'val' | 'var' ;
	public SlangVarModElements getSlangVarModAccess() {
		return pSlangVarMod;
	}
	
	public ParserRule getSlangVarModRule() {
		return getSlangVarModAccess().getRule();
	}
	
	//SlangBlock: {SlangBlock} '{' stmts+=SlangStmt* r=SlangRet? '}' ;
	public SlangBlockElements getSlangBlockAccess() {
		return pSlangBlock;
	}
	
	public ParserRule getSlangBlockRule() {
		return getSlangBlockAccess().getRule();
	}
	
	//// OwnedExpression is the entry rule for SysMLv2's expression language
	//OwnedExpression :
	//    //: {BasicExp} terms+=SlangAccess ( ops+=Operator terms+=SlangAccess )*
	//    //| {IfElseExp} 'if' '(' ifCond=OwnedExpression ')' thenExpr=OwnedExpression 'else' elseExpr=OwnedExpression
	//    //| {QuantifiedExp} ( '\\all' | '\\some' | '∀' | '∃' ) qVar+=SlangQuantVar ( ',' qVar+=SlangQuantVar )* '=>' quantifiedExpr=OwnedExpression
	//    //| {UnaryExp} op=Operator accessExp=SlangAccess
	//    //;
	//    //{IfElseExp} 'if' '(' ifCond=OwnedExpression ')' thenExpr=OwnedExpression 'else' elseExpr=OwnedExpression
	//    //|
	//    //{QuantifiedExp} ( '\\all' | '\\some' | '∀' | '∃' ) qVar+=SlangQuantVar ( ',' qVar+=SlangQuantVar )* '=>' quantifiedExpr=OwnedExpression
	//    //ImpliesExpression
	//    SlangExpression
	//        ;
	public OwnedExpressionElements getOwnedExpressionAccess() {
		return pOwnedExpression;
	}
	
	public ParserRule getOwnedExpressionRule() {
		return getOwnedExpressionAccess().getRule();
	}
	
	//// NOTE: will need to wrap nested IfElseExp or QuantifiedExp in parens (which matches what Slang/Scala requires)
	////   e.g. true ->: (if (true) true else true)
	//SlangExpression returns GExpr
	//  : ImpliesExpression
	//  | {IfElseExp} 'if' '(' ifCond=ImpliesExpression ')' thenExpr=OwnedExpression 'else' elseExpr=OwnedExpression
	//  | {QuantifiedExp} quantifier=( 'All' | '∀' | 'Exists' | '∃' ) '(' quantRange=QuantRange ')'
	//          // TODO: the following is a function expression
	//          '(' quantParam=QuantParam '=>' quantifiedExpr=OwnedExpression ')';
	public SlangExpressionElements getSlangExpressionAccess() {
		return pSlangExpression;
	}
	
	public ParserRule getSlangExpressionRule() {
		return getSlangExpressionAccess().getRule();
	}
	
	//// TODO: maybe support 'arrayName.indices'
	//QuantRange: lo=OwnedExpression extent=( 'to' | 'until' ) high=OwnedExpression;
	public QuantRangeElements getQuantRangeAccess() {
		return pQuantRange;
	}
	
	public ParserRule getQuantRangeRule() {
		return getQuantRangeAccess().getRule();
	}
	
	//QuantParam
	//    : name=ID
	//    | '(' name=ID ':' typeName=SlangType ')';
	public QuantParamElements getQuantParamAccess() {
		return pQuantParam;
	}
	
	public ParserRule getQuantParamRule() {
		return getQuantParamAccess().getRule();
	}
	
	//ImpliesExpression returns GExpr
	//    : OrExpression ( {ImpliesExpr.left=current} op=ImpliesOps right=OrExpression )*;
	public ImpliesExpressionElements getImpliesExpressionAccess() {
		return pImpliesExpression;
	}
	
	public ParserRule getImpliesExpressionRule() {
		return getImpliesExpressionAccess().getRule();
	}
	
	//OrExpression returns GExpr
	//    : AndExpression ({OrExpr.left=current} op=OR_OPS right=AndExpression)*;
	public OrExpressionElements getOrExpressionAccess() {
		return pOrExpression;
	}
	
	public ParserRule getOrExpressionRule() {
		return getOrExpressionAccess().getRule();
	}
	
	//// no hat ^ in Slang
	//AndExpression returns GExpr
	//    : EqualNotExpression ( {AndExpr.left=current} op=AND_OPS right=EqualNotExpression)*;
	public AndExpressionElements getAndExpressionAccess() {
		return pAndExpression;
	}
	
	public ParserRule getAndExpressionRule() {
		return getAndExpressionAccess().getRule();
	}
	
	//EqualNotExpression returns GExpr
	//    : LtGtExpression ( {EqualNotExpr.left=current} op=EQUAL_NOT_OPS right=LtGtExpression)*;
	public EqualNotExpressionElements getEqualNotExpressionAccess() {
		return pEqualNotExpression;
	}
	
	public ParserRule getEqualNotExpressionRule() {
		return getEqualNotExpressionAccess().getRule();
	}
	
	//LtGtExpression returns GExpr
	//    : ColonExpression ( {LtGtExpr.left=current} op=LT_GT_OPS right=ColonExpression)*;
	public LtGtExpressionElements getLtGtExpressionAccess() {
		return pLtGtExpression;
	}
	
	public ParserRule getLtGtExpressionRule() {
		return getLtGtExpressionAccess().getRule();
	}
	
	//ColonExpression returns GExpr
	//    : PlusMinusExpression ( {ColonExpr.left=current} op=COLON_OP right=PlusMinusExpression)*;
	public ColonExpressionElements getColonExpressionAccess() {
		return pColonExpression;
	}
	
	public ParserRule getColonExpressionRule() {
		return getColonExpressionAccess().getRule();
	}
	
	//PlusMinusExpression returns GExpr
	//    : MultiplicativeExpression ( {PlusMinusExpr.left=current} op=PlusMinusOps right=MultiplicativeExpression)*;
	public PlusMinusExpressionElements getPlusMinusExpressionAccess() {
		return pPlusMinusExpression;
	}
	
	public ParserRule getPlusMinusExpressionRule() {
		return getPlusMinusExpressionAccess().getRule();
	}
	
	//MultiplicativeExpression returns GExpr
	//    : UnaryExpression ( {MultiplicativeExpr.left=current} op=MultiplicativeOp right=UnaryExpression)*;
	public MultiplicativeExpressionElements getMultiplicativeExpressionAccess() {
		return pMultiplicativeExpression;
	}
	
	public ParserRule getMultiplicativeExpressionRule() {
		return getMultiplicativeExpressionAccess().getRule();
	}
	
	//UnaryExpression returns GExpr
	//    : {UnaryExpr} op=UnaryOp exp=PrimaryExpr
	//    | PrimaryExpr
	//    ;
	public UnaryExpressionElements getUnaryExpressionAccess() {
		return pUnaryExpression;
	}
	
	public ParserRule getUnaryExpressionRule() {
		return getUnaryExpressionAccess().getRule();
	}
	
	////SlangAccess
	////    : {SlangAccess} t=PrimaryExpr ( suffixes+=SlangAccessSuffix )* ;
	////SlangAccessSuffix: {SlangAccessSuffix} '.' id=ID; // cs=SlangCallSuffix? ;
	//PrimaryExpr  returns GExpr
	//    : BaseExpr
	//    | {PostFixExpr} baseExp=AccessibleBaseExpr ( posts+=Postfix)*;
	public PrimaryExprElements getPrimaryExprAccess() {
		return pPrimaryExpr;
	}
	
	public ParserRule getPrimaryExprRule() {
		return getPrimaryExprAccess().getRule();
	}
	
	//BaseExpr returns GExpr
	//    : {SlangLitTerm} lit=SlangLit
	//    | {SlangInterpTerm} i=SlangInterp
	//    | ({InStateExpr} 'In' '(') stateVar=[StateVarDecl|ID] ')'
	//    | ({MaySendExpr} 'MaySend' '(') eventPort=[aadl2::Port|ID] (',' value=OwnedExpression)? ')'
	//    | ({MustSendExpr} 'MustSend' '(') eventPort=[aadl2::Port|ID] (',' value=OwnedExpression)? ')'
	//    | ({NoSendExpr} 'NoSend' '(') eventPort=[aadl2::Port|ID] ')'
	//    | ({HasEventExpr} 'HasEvent' '(') eventPort=[aadl2::Port|ID] ')'
	//    | ({EnumLitExpr} enumType=[aadl2::DataClassifier|QCLREF] '.') value=[aadl2::StringLiteral|ID]
	//    | FloatObjectExpr
	//    | {ParenExpr} '(' exp=OwnedExpression ')'
	//    //| {SlangTupleTerm} '(' e+=Expr ( ',' e+=Expr )*  ')'
	//    | {SlangForTerm} 'for' r+=SlangForRange ( ',' r+=SlangForRange )*  'yield' ( b=SlangBlock |  '(' e=OwnedExpression ')' )
	//    | {SlangBlockTerm} '{'
	//       ( (p=SlangParams '=>')? e=OwnedExpression '}'
	//        | stmt+=SlangStmt* r=SlangRet? '}'
	//       )
	//    ;
	public BaseExprElements getBaseExprAccess() {
		return pBaseExpr;
	}
	
	public ParserRule getBaseExprRule() {
		return getBaseExprAccess().getRule();
	}
	
	//FloatObjectExpr returns GExpr
	//    : {F32Obj} 'F32' '.' attr=ID // e.g. F32.NaN
	//    | {F64Obj} 'F64' '.' attr=ID
	//    ;
	public FloatObjectExprElements getFloatObjectExprAccess() {
		return pFloatObjectExpr;
	}
	
	public ParserRule getFloatObjectExprRule() {
		return getFloatObjectExprAccess().getRule();
	}
	
	//AccessibleBaseExpr returns GExpr
	//    : {CallExpr} id=[ecore::EObject|QualifiedAADLName] callSuffix=SlangCallSuffix
	//    | ({RecordLitExpr} recordType=DataElement '{' args+=[aadl2::NamedElement|ID] '=')
	//        argExpr+=OwnedExpression (';' args+=[aadl2::NamedElement|ID] '=' argExpr+=OwnedExpression)* '}'
	//    | {DataRefExpr} portOrSubcomponentOrStateVar=[ecore::EObject|ID]
	//    | {ResultExpr} 'res'
	//;
	public AccessibleBaseExprElements getAccessibleBaseExprAccess() {
		return pAccessibleBaseExpr;
	}
	
	public ParserRule getAccessibleBaseExprRule() {
		return getAccessibleBaseExprAccess().getRule();
	}
	
	//QualifiedAADLName:
	//    ID ('::' ID)+ ('.' ID)?;
	public QualifiedAADLNameElements getQualifiedAADLNameAccess() {
		return pQualifiedAADLName;
	}
	
	public ParserRule getQualifiedAADLNameRule() {
		return getQualifiedAADLNameAccess().getRule();
	}
	
	//Postfix:
	//    MemberAccess | ArrayAccess;
	public PostfixElements getPostfixAccess() {
		return pPostfix;
	}
	
	public ParserRule getPostfixRule() {
		return getPostfixAccess().getRule();
	}
	
	//MemberAccess:
	//    '.' field=ID;
	public MemberAccessElements getMemberAccessAccess() {
		return pMemberAccess;
	}
	
	public ParserRule getMemberAccessRule() {
		return getMemberAccessAccess().getRule();
	}
	
	//ArrayAccess: {ArrayAccess}
	//    '(' ( index+=OwnedExpression (',' index+=OwnedExpression)* )? ')';
	public ArrayAccessElements getArrayAccessAccess() {
		return pArrayAccess;
	}
	
	public ParserRule getArrayAccessRule() {
		return getArrayAccessAccess().getRule();
	}
	
	//OtherDataRef:
	//        (
	//            namedElement=[aadl2::NamedElement|ID]
	//            (arrayRange+=ArrayRange)*
	//        )
	//        ('.' path=OtherDataRef)?
	////     |      'annex' namedElement=[aadl2::NamedElement|ID]
	//;
	public OtherDataRefElements getOtherDataRefAccess() {
		return pOtherDataRef;
	}
	
	public ParserRule getOtherDataRefRule() {
		return getOtherDataRefAccess().getRule();
	}
	
	////TupleExpr
	////    {TupleExpr} '(' elements+=OwnedExpression (',' elements+=OwnedExpression)+ ')';
	////FunctionCall:
	////    func=PrimaryExpr '(' (args+=OwnedExpression (',' args+=OwnedExpression)*)? ')';
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
	
	//SlangForRange: ID ':' e=OwnedExpression ( ( '..' |  '..<' ) upper=OwnedExpression ( 'by' step=OwnedExpression )? )? ;
	public SlangForRangeElements getSlangForRangeAccess() {
		return pSlangForRange;
	}
	
	public ParserRule getSlangForRangeRule() {
		return getSlangForRangeAccess().getRule();
	}
	
	//SlangRet: {SlangRet} 'return' e=OwnedExpression? ;
	public SlangRetElements getSlangRetAccess() {
		return pSlangRet;
	}
	
	public ParserRule getSlangRetRule() {
		return getSlangRetAccess().getRule();
	}
	
	//SlangCallSuffix: {SlangCallSuffix}
	//  ca=SlangCallArgs
	//    //ta=SlangTypeArgs ca=SlangCallArgs // TODO: add back ? for call args when support for no param methods is added
	//    //| ca=SlangCallArgs
	//    ;
	public SlangCallSuffixElements getSlangCallSuffixAccess() {
		return pSlangCallSuffix;
	}
	
	public ParserRule getSlangCallSuffixRule() {
		return getSlangCallSuffixAccess().getRule();
	}
	
	////SlangCallArgs: {SlangCallArgs} '(' ( arg+=SlangIDExp ( ',' arg+=SlangIDExp )* )? ')' ;
	//SlangCallArgs: {SlangCallArgs} '(' ( arg+=OwnedExpression ( ',' arg+=OwnedExpression )* )? ')' ;
	public SlangCallArgsElements getSlangCallArgsAccess() {
		return pSlangCallArgs;
	}
	
	public ParserRule getSlangCallArgsRule() {
		return getSlangCallArgsAccess().getRule();
	}
	
	////SlangIDExp: e+=Expr ( ':=' e+=Expr )? ;
	//SlangLit
	//    : {BooleanLit} value=('T' | 'F' | 'true' | 'false')
	//    //| {ResultLit} 'res'
	//    | {IntegerLit} value=INTEGER_LIT
	//    //| {IntIdfLit} value=INT_IDF
	//    | {HexLit} value=HEX
	//    | {BinLit} value=BIN
	//    | {F32Lit} value=F32_LIT
	//    | {F64Lit} value=(F64_LIT | REAL_LIT)
	//    //| {F32Obj} value='F32'
	//    //| {F64Obj} value='F64'
	//    | {SlangStringLit} value=STRING_VALUE
	//    //| {RealIdfLit} value=REAL_IDF
	//    //| {MStringLit} value=MSTRING
	//    ;
	public SlangLitElements getSlangLitAccess() {
		return pSlangLit;
	}
	
	public ParserRule getSlangLitRule() {
		return getSlangLitAccess().getRule();
	}
	
	//SlangInterp
	//    //: {SlangMspInterp} msp=MSP
	//    //| {SlangLiteralInterp} sli=SLI
	//    //| {SlangMspbInterp} mspb=MSPB minterp=SlangMInterp
	//    : {SlangLiteralInterp} sli=SLI;
	public SlangInterpElements getSlangInterpAccess() {
		return pSlangInterp;
	}
	
	public ParserRule getSlangInterpRule() {
		return getSlangInterpAccess().getRule();
	}
	
	////SlangMInterp
	//    //: '{' e=OwnedExpression '}' ( MSPM m=SlangMInterp | MSPE )
	//    //;
	//QualifiedName
	//    : QCREF;
	public QualifiedNameElements getQualifiedNameAccess() {
		return pQualifiedName;
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}
	
	//terminal STRING_VALUE: '"' ( ESC_SEQ | !( '\\' | '"' ) )* '"' ;
	public TerminalRule getSTRING_VALUERule() {
		return tSTRING_VALUE;
	}
	
	////terminal MSTRING: '"""' ( !'"'|  '"' !'"' | '""' !'"' )* ( '"""' | '""""' | '"""""' ) ;
	////terminal MSP: IDF '"""' MSPI* ( '"""' | '""""' | '"""""' ) ;
	//terminal SLI: IDF '"' ( ESC_SEQ | !( '\\' | '"' ) )* '"' ;
	public TerminalRule getSLIRule() {
		return tSLI;
	}
	
	////terminal MSPB: IDF '"""' MSPI* '$' ;
	////terminal MSPM: '$' MSPI* '$' ;
	////terminal MSPE: '$' MSPI* ( '"""' | '""""' | '"""""' ) ;
	////terminal DEFOP: ':' OPSYM* '=' ;
	//terminal QUANTIFIER_OP: '\\all' | '\\exists' | '∀' | '∃' ;
	public TerminalRule getQUANTIFIER_OPRule() {
		return tQUANTIFIER_OP;
	}
	
	//UnaryOp: PlusMinus | NOT;
	public UnaryOpElements getUnaryOpAccess() {
		return pUnaryOp;
	}
	
	public ParserRule getUnaryOpRule() {
		return getUnaryOpAccess().getRule();
	}
	
	//terminal NOT: '!';
	public TerminalRule getNOTRule() {
		return tNOT;
	}
	
	//MultiplicativeOp: STAR | MULTIPLICATIVE_OP;
	public MultiplicativeOpElements getMultiplicativeOpAccess() {
		return pMultiplicativeOp;
	}
	
	public ParserRule getMultiplicativeOpRule() {
		return getMultiplicativeOpAccess().getRule();
	}
	
	//terminal MULTIPLICATIVE_OP: '/' | '%';
	public TerminalRule getMULTIPLICATIVE_OPRule() {
		return tMULTIPLICATIVE_OP;
	}
	
	//PlusMinusOps:
	//    SLANG_OP | PlusMinus
	//;
	public PlusMinusOpsElements getPlusMinusOpsAccess() {
		return pPlusMinusOps;
	}
	
	public ParserRule getPlusMinusOpsRule() {
		return getPlusMinusOpsAccess().getRule();
	}
	
	//terminal SLANG_OP
	//    : '+:' | '++' |
	//      // '--' is an aadl comment so use '-~' or '~-' for sequence removal
	//      '-~' | '~-';
	public TerminalRule getSLANG_OPRule() {
		return tSLANG_OP;
	}
	
	//terminal COLON_OP: ':+';
	public TerminalRule getCOLON_OPRule() {
		return tCOLON_OP;
	}
	
	//terminal LT_GT_OPS:
	//    '<<<' | '<<' | '<=' | '<' |
	//    '>>>' | '>>' | '>=' | '>';
	public TerminalRule getLT_GT_OPSRule() {
		return tLT_GT_OPS;
	}
	
	//terminal EQUAL_NOT_OPS: '=!=' | '===' | '==' | '!=' | '!~';
	public TerminalRule getEQUAL_NOT_OPSRule() {
		return tEQUAL_NOT_OPS;
	}
	
	//terminal AND_OPS: '&&' | '&';
	public TerminalRule getAND_OPSRule() {
		return tAND_OPS;
	}
	
	//// terminal HAT_OPS: '^';
	//terminal OR_OPS: '|^' | '||' | '|' ;
	public TerminalRule getOR_OPSRule() {
		return tOR_OPS;
	}
	
	//ImpliesOps: IMPLIES | SIMPLIES;
	public ImpliesOpsElements getImpliesOpsAccess() {
		return pImpliesOps;
	}
	
	public ParserRule getImpliesOpsRule() {
		return getImpliesOpsAccess().getRule();
	}
	
	//terminal IMPLIES: ('__' | '-' | '~') '>' ':';
	public TerminalRule getIMPLIESRule() {
		return tIMPLIES;
	}
	
	//// can't use -->: as -- is a comment in AADL
	//terminal SIMPLIES: ('___' | '~~')  '>' ':';
	public TerminalRule getSIMPLIESRule() {
		return tSIMPLIES;
	}
	
	// // short circuit implies
	////Operator: OP | PlusMinus | STAR | IMPLIES | SIMPLIES;
	////terminal OP: ( OPSYM+ | '\\' IDF ) ;
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
	////terminal INT_IDF: INTEGER_LIT IDF;
	//terminal F32_LIT: REAL_LIT 'f';
	public TerminalRule getF32_LITRule() {
		return tF32_LIT;
	}
	
	//terminal F64_LIT: REAL_LIT 'd';
	public TerminalRule getF64_LITRule() {
		return tF64_LIT;
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
	///*
	//terminal fragment OPSYM
	//    : //'+' | '-' | '*' |
	//     '/' | '%' | '=' | '<' | '>' | '!' | '&' | '^' | '|' | '~'
	//    | ( '\u2200' .. '\u22FF' ) // https://en.wikipedia.org/wiki/Mathematical_Operators
	//    | ( '\u2A00' .. '\u2AFF' ) // https://en.wikipedia.org/wiki/Supplemental_Mathematical_Operators
	//    | ( '\u27C0' .. '\u27EF' ) // https://en.wikipedia.org/wiki/Miscellaneous_Mathematical_Symbols-A
	//    | ( '\u2980' .. '\u29FF' ) // https://en.wikipedia.org/wiki/Miscellaneous_Mathematical_Symbols-B
	//    ;
	//*/
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
