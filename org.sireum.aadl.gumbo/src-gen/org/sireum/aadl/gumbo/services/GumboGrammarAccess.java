
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
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;
import org.osate.xtext.aadl2.properties.services.PropertiesGrammarAccess;

@Singleton
public class GumboGrammarAccess extends AbstractGrammarElementFinder {
	
	public class AnnexLibraryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.AnnexLibrary");
		private final RuleCall cGumboLibraryParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//AnnexLibrary aadl2::AnnexLibrary:
		//	GumboLibrary;
		@Override public ParserRule getRule() { return rule; }
		
		//GumboLibrary
		public RuleCall getGumboLibraryParserRuleCall() { return cGumboLibraryParserRuleCall; }
	}
	public class AnnexSubclauseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.AnnexSubclause");
		private final RuleCall cGumboSubclauseParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//AnnexSubclause aadl2::AnnexSubclause:
		//	GumboSubclause;
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
		
		//GumboLibrary:
		//	{GumboLibrary}
		//	'library' 'for' 'gumbo';
		@Override public ParserRule getRule() { return rule; }
		
		//{GumboLibrary} 'library' 'for' 'gumbo'
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
		
		//GumboSubclause:
		//	{GumboSubclause} specs+=SpecSection*;
		@Override public ParserRule getRule() { return rule; }
		
		//{GumboSubclause} specs+=SpecSection*
		public Group getGroup() { return cGroup; }
		
		//{GumboSubclause}
		public Action getGumboSubclauseAction_0() { return cGumboSubclauseAction_0; }
		
		//specs+=SpecSection*
		public Assignment getSpecsAssignment_1() { return cSpecsAssignment_1; }
		
		//SpecSection
		public RuleCall getSpecsSpecSectionParserRuleCall_1_0() { return cSpecsSpecSectionParserRuleCall_1_0; }
	}
	public class SpecSectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.SpecSection");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cComputationalModelParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cFlowsParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//SpecSection:
		//	ComputationalModel
		//	| Flows;
		@Override public ParserRule getRule() { return rule; }
		
		//ComputationalModel | Flows
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ComputationalModel
		public RuleCall getComputationalModelParserRuleCall_0() { return cComputationalModelParserRuleCall_0; }
		
		//Flows
		public RuleCall getFlowsParserRuleCall_1() { return cFlowsParserRuleCall_1; }
	}
	public class ComputationalModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.ComputationalModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cComputational_modelKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Action cPeriodicComputationalModelAction_1_0_0 = (Action)cGroup_1_0.eContents().get(0);
		private final Keyword cPeriodicKeyword_1_0_1 = (Keyword)cGroup_1_0.eContents().get(1);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Action cHyperperiodComputationalModelAction_1_1_0 = (Action)cGroup_1_1.eContents().get(0);
		private final Keyword cHyperperiodKeyword_1_1_1 = (Keyword)cGroup_1_1.eContents().get(1);
		private final Keyword cWithKeyword_1_1_2 = (Keyword)cGroup_1_1.eContents().get(2);
		private final Group cGroup_1_1_3 = (Group)cGroup_1_1.eContents().get(3);
		private final Assignment cConstraintsAssignment_1_1_3_0 = (Assignment)cGroup_1_1_3.eContents().get(0);
		private final CrossReference cConstraintsNamedElementCrossReference_1_1_3_0_0 = (CrossReference)cConstraintsAssignment_1_1_3_0.eContents().get(0);
		private final RuleCall cConstraintsNamedElementIDTerminalRuleCall_1_1_3_0_0_1 = (RuleCall)cConstraintsNamedElementCrossReference_1_1_3_0_0.eContents().get(1);
		private final Group cGroup_1_1_3_1 = (Group)cGroup_1_1_3.eContents().get(1);
		private final Keyword cLessThanSignKeyword_1_1_3_1_0 = (Keyword)cGroup_1_1_3_1.eContents().get(0);
		private final Assignment cConstraintsAssignment_1_1_3_1_1 = (Assignment)cGroup_1_1_3_1.eContents().get(1);
		private final CrossReference cConstraintsNamedElementCrossReference_1_1_3_1_1_0 = (CrossReference)cConstraintsAssignment_1_1_3_1_1.eContents().get(0);
		private final RuleCall cConstraintsNamedElementIDTerminalRuleCall_1_1_3_1_1_0_1 = (RuleCall)cConstraintsNamedElementCrossReference_1_1_3_1_1_0.eContents().get(1);
		
		//ComputationalModel:
		//	'computational_model' ({PeriodicComputationalModel} 'periodic'
		//	| {HyperperiodComputationalModel} 'hyperperiod' 'with' (constraints+=[aadl2::NamedElement] ('<'
		//	constraints+=[aadl2::NamedElement])*));
		@Override public ParserRule getRule() { return rule; }
		
		//'computational_model' ({PeriodicComputationalModel} 'periodic' | {HyperperiodComputationalModel} 'hyperperiod' 'with'
		//(constraints+=[aadl2::NamedElement] ('<' constraints+=[aadl2::NamedElement])*))
		public Group getGroup() { return cGroup; }
		
		//'computational_model'
		public Keyword getComputational_modelKeyword_0() { return cComputational_modelKeyword_0; }
		
		//({PeriodicComputationalModel} 'periodic' | {HyperperiodComputationalModel} 'hyperperiod' 'with'
		//(constraints+=[aadl2::NamedElement] ('<' constraints+=[aadl2::NamedElement])*))
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//{PeriodicComputationalModel} 'periodic'
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//{PeriodicComputationalModel}
		public Action getPeriodicComputationalModelAction_1_0_0() { return cPeriodicComputationalModelAction_1_0_0; }
		
		//'periodic'
		public Keyword getPeriodicKeyword_1_0_1() { return cPeriodicKeyword_1_0_1; }
		
		//{HyperperiodComputationalModel} 'hyperperiod' 'with' (constraints+=[aadl2::NamedElement] ('<'
		//constraints+=[aadl2::NamedElement])*)
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//{HyperperiodComputationalModel}
		public Action getHyperperiodComputationalModelAction_1_1_0() { return cHyperperiodComputationalModelAction_1_1_0; }
		
		//'hyperperiod'
		public Keyword getHyperperiodKeyword_1_1_1() { return cHyperperiodKeyword_1_1_1; }
		
		//'with'
		public Keyword getWithKeyword_1_1_2() { return cWithKeyword_1_1_2; }
		
		//(constraints+=[aadl2::NamedElement] ('<' constraints+=[aadl2::NamedElement])*)
		public Group getGroup_1_1_3() { return cGroup_1_1_3; }
		
		//constraints+=[aadl2::NamedElement]
		public Assignment getConstraintsAssignment_1_1_3_0() { return cConstraintsAssignment_1_1_3_0; }
		
		//[aadl2::NamedElement]
		public CrossReference getConstraintsNamedElementCrossReference_1_1_3_0_0() { return cConstraintsNamedElementCrossReference_1_1_3_0_0; }
		
		//ID
		public RuleCall getConstraintsNamedElementIDTerminalRuleCall_1_1_3_0_0_1() { return cConstraintsNamedElementIDTerminalRuleCall_1_1_3_0_0_1; }
		
		//('<' constraints+=[aadl2::NamedElement])*
		public Group getGroup_1_1_3_1() { return cGroup_1_1_3_1; }
		
		//'<'
		public Keyword getLessThanSignKeyword_1_1_3_1_0() { return cLessThanSignKeyword_1_1_3_1_0; }
		
		//constraints+=[aadl2::NamedElement]
		public Assignment getConstraintsAssignment_1_1_3_1_1() { return cConstraintsAssignment_1_1_3_1_1; }
		
		//[aadl2::NamedElement]
		public CrossReference getConstraintsNamedElementCrossReference_1_1_3_1_1_0() { return cConstraintsNamedElementCrossReference_1_1_3_1_1_0; }
		
		//ID
		public RuleCall getConstraintsNamedElementIDTerminalRuleCall_1_1_3_1_1_0_1() { return cConstraintsNamedElementIDTerminalRuleCall_1_1_3_1_1_0_1; }
	}
	public class FlowsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.Flows");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFlowsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cFlowsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cFlowsFlowParserRuleCall_1_0 = (RuleCall)cFlowsAssignment_1.eContents().get(0);
		
		//Flows:
		//	'flows' flows+=Flow+;
		@Override public ParserRule getRule() { return rule; }
		
		//'flows' flows+=Flow+
		public Group getGroup() { return cGroup; }
		
		//'flows'
		public Keyword getFlowsKeyword_0() { return cFlowsKeyword_0; }
		
		//flows+=Flow+
		public Assignment getFlowsAssignment_1() { return cFlowsAssignment_1; }
		
		//Flow
		public RuleCall getFlowsFlowParserRuleCall_1_0() { return cFlowsFlowParserRuleCall_1_0; }
	}
	public class FlowElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.Flow");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cFlowIdAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cFlowIdIDTerminalRuleCall_0_0 = (RuleCall)cFlowIdAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSrcPortsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSrcPortsFeatureElementParserRuleCall_2_0 = (RuleCall)cSrcPortsAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cCommaKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cSrcPortsAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cSrcPortsFeatureElementParserRuleCall_3_1_0 = (RuleCall)cSrcPortsAssignment_3_1.eContents().get(0);
		private final Keyword cFunKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cDstPortsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cDstPortsFeatureElementParserRuleCall_5_0 = (RuleCall)cDstPortsAssignment_5.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cCommaKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cDstPortsAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cDstPortsFeatureElementParserRuleCall_6_1_0 = (RuleCall)cDstPortsAssignment_6_1.eContents().get(0);
		
		//Flow:
		//	=> flowId=ID ':'
		//	srcPorts+=FeatureElement (',' srcPorts+=FeatureElement)* '-fun->'
		//	dstPorts+=FeatureElement (',' dstPorts+=FeatureElement)*;
		@Override public ParserRule getRule() { return rule; }
		
		//=> flowId=ID ':' srcPorts+=FeatureElement (',' srcPorts+=FeatureElement)* '-fun->' dstPorts+=FeatureElement (','
		//dstPorts+=FeatureElement)*
		public Group getGroup() { return cGroup; }
		
		//=> flowId=ID
		public Assignment getFlowIdAssignment_0() { return cFlowIdAssignment_0; }
		
		//ID
		public RuleCall getFlowIdIDTerminalRuleCall_0_0() { return cFlowIdIDTerminalRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//srcPorts+=FeatureElement
		public Assignment getSrcPortsAssignment_2() { return cSrcPortsAssignment_2; }
		
		//FeatureElement
		public RuleCall getSrcPortsFeatureElementParserRuleCall_2_0() { return cSrcPortsFeatureElementParserRuleCall_2_0; }
		
		//(',' srcPorts+=FeatureElement)*
		public Group getGroup_3() { return cGroup_3; }
		
		//','
		public Keyword getCommaKeyword_3_0() { return cCommaKeyword_3_0; }
		
		//srcPorts+=FeatureElement
		public Assignment getSrcPortsAssignment_3_1() { return cSrcPortsAssignment_3_1; }
		
		//FeatureElement
		public RuleCall getSrcPortsFeatureElementParserRuleCall_3_1_0() { return cSrcPortsFeatureElementParserRuleCall_3_1_0; }
		
		//'-fun->'
		public Keyword getFunKeyword_4() { return cFunKeyword_4; }
		
		//dstPorts+=FeatureElement
		public Assignment getDstPortsAssignment_5() { return cDstPortsAssignment_5; }
		
		//FeatureElement
		public RuleCall getDstPortsFeatureElementParserRuleCall_5_0() { return cDstPortsFeatureElementParserRuleCall_5_0; }
		
		//(',' dstPorts+=FeatureElement)*
		public Group getGroup_6() { return cGroup_6; }
		
		//','
		public Keyword getCommaKeyword_6_0() { return cCommaKeyword_6_0; }
		
		//dstPorts+=FeatureElement
		public Assignment getDstPortsAssignment_6_1() { return cDstPortsAssignment_6_1; }
		
		//FeatureElement
		public RuleCall getDstPortsFeatureElementParserRuleCall_6_1_0() { return cDstPortsFeatureElementParserRuleCall_6_1_0; }
	}
	public class FeatureElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.gumbo.Gumbo.FeatureElement");
		private final Assignment cFeatureAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cFeatureNamedElementCrossReference_0 = (CrossReference)cFeatureAssignment.eContents().get(0);
		private final RuleCall cFeatureNamedElementIDTerminalRuleCall_0_1 = (RuleCall)cFeatureNamedElementCrossReference_0.eContents().get(1);
		
		//FeatureElement:
		//	feature=[aadl2::NamedElement];
		@Override public ParserRule getRule() { return rule; }
		
		//feature=[aadl2::NamedElement]
		public Assignment getFeatureAssignment() { return cFeatureAssignment; }
		
		//[aadl2::NamedElement]
		public CrossReference getFeatureNamedElementCrossReference_0() { return cFeatureNamedElementCrossReference_0; }
		
		//ID
		public RuleCall getFeatureNamedElementIDTerminalRuleCall_0_1() { return cFeatureNamedElementIDTerminalRuleCall_0_1; }
	}
	
	
	private final AnnexLibraryElements pAnnexLibrary;
	private final AnnexSubclauseElements pAnnexSubclause;
	private final GumboLibraryElements pGumboLibrary;
	private final GumboSubclauseElements pGumboSubclause;
	private final SpecSectionElements pSpecSection;
	private final ComputationalModelElements pComputationalModel;
	private final FlowsElements pFlows;
	private final FlowElements pFlow;
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
		this.pComputationalModel = new ComputationalModelElements();
		this.pFlows = new FlowsElements();
		this.pFlow = new FlowElements();
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

	
	//AnnexLibrary aadl2::AnnexLibrary:
	//	GumboLibrary;
	public AnnexLibraryElements getAnnexLibraryAccess() {
		return pAnnexLibrary;
	}
	
	public ParserRule getAnnexLibraryRule() {
		return getAnnexLibraryAccess().getRule();
	}
	
	//AnnexSubclause aadl2::AnnexSubclause:
	//	GumboSubclause;
	public AnnexSubclauseElements getAnnexSubclauseAccess() {
		return pAnnexSubclause;
	}
	
	public ParserRule getAnnexSubclauseRule() {
		return getAnnexSubclauseAccess().getRule();
	}
	
	//GumboLibrary:
	//	{GumboLibrary}
	//	'library' 'for' 'gumbo';
	public GumboLibraryElements getGumboLibraryAccess() {
		return pGumboLibrary;
	}
	
	public ParserRule getGumboLibraryRule() {
		return getGumboLibraryAccess().getRule();
	}
	
	//GumboSubclause:
	//	{GumboSubclause} specs+=SpecSection*;
	public GumboSubclauseElements getGumboSubclauseAccess() {
		return pGumboSubclause;
	}
	
	public ParserRule getGumboSubclauseRule() {
		return getGumboSubclauseAccess().getRule();
	}
	
	//SpecSection:
	//	ComputationalModel
	//	| Flows;
	public SpecSectionElements getSpecSectionAccess() {
		return pSpecSection;
	}
	
	public ParserRule getSpecSectionRule() {
		return getSpecSectionAccess().getRule();
	}
	
	//ComputationalModel:
	//	'computational_model' ({PeriodicComputationalModel} 'periodic'
	//	| {HyperperiodComputationalModel} 'hyperperiod' 'with' (constraints+=[aadl2::NamedElement] ('<'
	//	constraints+=[aadl2::NamedElement])*));
	public ComputationalModelElements getComputationalModelAccess() {
		return pComputationalModel;
	}
	
	public ParserRule getComputationalModelRule() {
		return getComputationalModelAccess().getRule();
	}
	
	//Flows:
	//	'flows' flows+=Flow+;
	public FlowsElements getFlowsAccess() {
		return pFlows;
	}
	
	public ParserRule getFlowsRule() {
		return getFlowsAccess().getRule();
	}
	
	//Flow:
	//	=> flowId=ID ':'
	//	srcPorts+=FeatureElement (',' srcPorts+=FeatureElement)* '-fun->'
	//	dstPorts+=FeatureElement (',' dstPorts+=FeatureElement)*;
	public FlowElements getFlowAccess() {
		return pFlow;
	}
	
	public ParserRule getFlowRule() {
		return getFlowAccess().getRule();
	}
	
	//FeatureElement:
	//	feature=[aadl2::NamedElement];
	public FeatureElementElements getFeatureElementAccess() {
		return pFeatureElement;
	}
	
	public ParserRule getFeatureElementRule() {
		return getFeatureElementAccess().getRule();
	}
	
	//PModel aadl2::Element:
	//	ContainedPropertyAssociation //| BasicPropertyAssociation | PropertyAssociation
	//;
	public PropertiesGrammarAccess.PModelElements getPModelAccess() {
		return gaProperties.getPModelAccess();
	}
	
	public ParserRule getPModelRule() {
		return getPModelAccess().getRule();
	}
	
	//// Properties
	//ContainedPropertyAssociation aadl2::PropertyAssociation:
	//	property=[aadl2::Property|QPREF] ('=>' | append?='+=>') constant?='constant'? (ownedValue+=OptionalModalPropertyValue
	//	(',' ownedValue+=OptionalModalPropertyValue)*) (AppliesToKeywords appliesTo+=ContainmentPath (','
	//	appliesTo+=ContainmentPath)*)? (InBindingKeywords '(' inBinding+=[aadl2::Classifier|QCREF] ')')?
	//	';';
	public PropertiesGrammarAccess.ContainedPropertyAssociationElements getContainedPropertyAssociationAccess() {
		return gaProperties.getContainedPropertyAssociationAccess();
	}
	
	public ParserRule getContainedPropertyAssociationRule() {
		return getContainedPropertyAssociationAccess().getRule();
	}
	
	//PropertyAssociation aadl2::PropertyAssociation:
	//	property=[aadl2::Property|QPREF] ('=>' | append?='+=>') constant?='constant'? (ownedValue+=OptionalModalPropertyValue
	//	(',' ownedValue+=OptionalModalPropertyValue)*) (InBindingKeywords '(' inBinding+=[aadl2::Classifier|QCREF] ')')?
	//	';';
	public PropertiesGrammarAccess.PropertyAssociationElements getPropertyAssociationAccess() {
		return gaProperties.getPropertyAssociationAccess();
	}
	
	public ParserRule getPropertyAssociationRule() {
		return getPropertyAssociationAccess().getRule();
	}
	
	//BasicPropertyAssociation aadl2::PropertyAssociation:
	//	property=[aadl2::Property|QPREF]
	//	'=>' ownedValue+=PropertyValue ';';
	public PropertiesGrammarAccess.BasicPropertyAssociationElements getBasicPropertyAssociationAccess() {
		return gaProperties.getBasicPropertyAssociationAccess();
	}
	
	public ParserRule getBasicPropertyAssociationRule() {
		return getBasicPropertyAssociationAccess().getRule();
	}
	
	//ContainmentPath aadl2::ContainedNamedElement:
	//	path=ContainmentPathElement
	//	//	( 'annex' containmentPathElement+=AnnexPath )?
	//;
	public PropertiesGrammarAccess.ContainmentPathElements getContainmentPathAccess() {
		return gaProperties.getContainmentPathAccess();
	}
	
	public ParserRule getContainmentPathRule() {
		return getContainmentPathAccess().getRule();
	}
	
	////AnnexPath returns aadl2::ContainmentPathElement:
	////	 namedElement=[aadl2::NamedElement|IDANNEXTEXT];
	//ModalPropertyValue aadl2::ModalPropertyValue:
	//	ownedValue=PropertyExpression
	//	InModesKeywords '('
	//	inMode+=[aadl2::Mode] (',' inMode+=[aadl2::Mode])*
	//	')';
	public PropertiesGrammarAccess.ModalPropertyValueElements getModalPropertyValueAccess() {
		return gaProperties.getModalPropertyValueAccess();
	}
	
	public ParserRule getModalPropertyValueRule() {
		return getModalPropertyValueAccess().getRule();
	}
	
	//OptionalModalPropertyValue aadl2::ModalPropertyValue:
	//	ownedValue=PropertyExpression (InModesKeywords '('
	//	inMode+=[aadl2::Mode] (',' inMode+=[aadl2::Mode])*
	//	')')?;
	public PropertiesGrammarAccess.OptionalModalPropertyValueElements getOptionalModalPropertyValueAccess() {
		return gaProperties.getOptionalModalPropertyValueAccess();
	}
	
	public ParserRule getOptionalModalPropertyValueRule() {
		return getOptionalModalPropertyValueAccess().getRule();
	}
	
	//// &&&&&&&&&& handling of in binding
	//PropertyValue aadl2::ModalPropertyValue:
	//	ownedValue=PropertyExpression;
	public PropertiesGrammarAccess.PropertyValueElements getPropertyValueAccess() {
		return gaProperties.getPropertyValueAccess();
	}
	
	public ParserRule getPropertyValueRule() {
		return getPropertyValueAccess().getRule();
	}
	
	//PropertyExpression aadl2::PropertyExpression:
	//	RecordTerm | ReferenceTerm | ComponentClassifierTerm
	//	| ComputedTerm | StringTerm | NumericRangeTerm
	//	| RealTerm | IntegerTerm
	//	| ListTerm
	//	| BooleanLiteral | LiteralorReferenceTerm;
	public PropertiesGrammarAccess.PropertyExpressionElements getPropertyExpressionAccess() {
		return gaProperties.getPropertyExpressionAccess();
	}
	
	public ParserRule getPropertyExpressionRule() {
		return getPropertyExpressionAccess().getRule();
	}
	
	//LiteralorReferenceTerm aadl2::NamedValue:
	//	namedValue=[aadl2::AbstractNamedValue|QPREF];
	public PropertiesGrammarAccess.LiteralorReferenceTermElements getLiteralorReferenceTermAccess() {
		return gaProperties.getLiteralorReferenceTermAccess();
	}
	
	public ParserRule getLiteralorReferenceTermRule() {
		return getLiteralorReferenceTermAccess().getRule();
	}
	
	//BooleanLiteral aadl2::BooleanLiteral:
	//	{aadl2::BooleanLiteral} (value?='true' | 'false');
	public PropertiesGrammarAccess.BooleanLiteralElements getBooleanLiteralAccess() {
		return gaProperties.getBooleanLiteralAccess();
	}
	
	public ParserRule getBooleanLiteralRule() {
		return getBooleanLiteralAccess().getRule();
	}
	
	//ConstantValue aadl2::NamedValue:
	//	namedValue=[aadl2::PropertyConstant|QPREF];
	public PropertiesGrammarAccess.ConstantValueElements getConstantValueAccess() {
		return gaProperties.getConstantValueAccess();
	}
	
	public ParserRule getConstantValueRule() {
		return getConstantValueAccess().getRule();
	}
	
	//ReferenceTerm aadl2::ReferenceValue:
	//	'reference' '('
	//	path=ContainmentPathElement
	//	//	( 'annex' ID '{**' 
	//	//	containmentPathElement+=ContainmentPathElement
	//	//	( '.' containmentPathElement+=ContainmentPathElement)*
	//	//	'**}')?
	//	')';
	public PropertiesGrammarAccess.ReferenceTermElements getReferenceTermAccess() {
		return gaProperties.getReferenceTermAccess();
	}
	
	public ParserRule getReferenceTermRule() {
		return getReferenceTermAccess().getRule();
	}
	
	//RecordTerm aadl2::RecordValue:
	//	'['
	//	ownedFieldValue+=FieldPropertyAssociation+
	//	']';
	public PropertiesGrammarAccess.RecordTermElements getRecordTermAccess() {
		return gaProperties.getRecordTermAccess();
	}
	
	public ParserRule getRecordTermRule() {
		return getRecordTermAccess().getRule();
	}
	
	//OldRecordTerm aadl2::RecordValue:
	//	'('
	//	ownedFieldValue+=FieldPropertyAssociation+
	//	')';
	public PropertiesGrammarAccess.OldRecordTermElements getOldRecordTermAccess() {
		return gaProperties.getOldRecordTermAccess();
	}
	
	public ParserRule getOldRecordTermRule() {
		return getOldRecordTermAccess().getRule();
	}
	
	//ComputedTerm aadl2::ComputedValue:
	//	'compute' '('
	//	function=ID
	//	')';
	public PropertiesGrammarAccess.ComputedTermElements getComputedTermAccess() {
		return gaProperties.getComputedTermAccess();
	}
	
	public ParserRule getComputedTermRule() {
		return getComputedTermAccess().getRule();
	}
	
	//ComponentClassifierTerm aadl2::ClassifierValue:
	//	'classifier' '('
	//	classifier=[aadl2::ComponentClassifier|QCREF]
	//	')';
	public PropertiesGrammarAccess.ComponentClassifierTermElements getComponentClassifierTermAccess() {
		return gaProperties.getComponentClassifierTermAccess();
	}
	
	public ParserRule getComponentClassifierTermRule() {
		return getComponentClassifierTermAccess().getRule();
	}
	
	//ListTerm aadl2::ListValue:
	//	{aadl2::ListValue}
	//	'(' (ownedListElement+=PropertyExpression (',' ownedListElement+=PropertyExpression)*)?
	//	')';
	public PropertiesGrammarAccess.ListTermElements getListTermAccess() {
		return gaProperties.getListTermAccess();
	}
	
	public ParserRule getListTermRule() {
		return getListTermAccess().getRule();
	}
	
	//FieldPropertyAssociation aadl2::BasicPropertyAssociation:
	//	property=[aadl2::BasicProperty]
	//	'=>'
	//	ownedValue=PropertyExpression
	//	';';
	public PropertiesGrammarAccess.FieldPropertyAssociationElements getFieldPropertyAssociationAccess() {
		return gaProperties.getFieldPropertyAssociationAccess();
	}
	
	public ParserRule getFieldPropertyAssociationRule() {
		return getFieldPropertyAssociationAccess().getRule();
	}
	
	//// from AADL2
	//// need to add annex path element
	//ContainmentPathElement aadl2::ContainmentPathElement:
	//	(namedElement=[aadl2::NamedElement] arrayRange+=ArrayRange*) ('.' path=ContainmentPathElement)?
	//	//	 | 	 'annex' namedElement=[aadl2::NamedElement|ID]
	//;
	public PropertiesGrammarAccess.ContainmentPathElementElements getContainmentPathElementAccess() {
		return gaProperties.getContainmentPathElementAccess();
	}
	
	public ParserRule getContainmentPathElementRule() {
		return getContainmentPathElementAccess().getRule();
	}
	
	//ANNEXREF: // check what values are ok inside ** **
	//	'{' STAR STAR ID STAR STAR '}';
	public PropertiesGrammarAccess.ANNEXREFElements getANNEXREFAccess() {
		return gaProperties.getANNEXREFAccess();
	}
	
	public ParserRule getANNEXREFRule() {
		return getANNEXREFAccess().getRule();
	}
	
	//PlusMinus aadl2::OperationKind:
	//	'+' | '-';
	public PropertiesGrammarAccess.PlusMinusElements getPlusMinusAccess() {
		return gaProperties.getPlusMinusAccess();
	}
	
	public ParserRule getPlusMinusRule() {
		return getPlusMinusAccess().getRule();
	}
	
	//StringTerm aadl2::StringLiteral:
	//	value=NoQuoteString;
	public PropertiesGrammarAccess.StringTermElements getStringTermAccess() {
		return gaProperties.getStringTermAccess();
	}
	
	public ParserRule getStringTermRule() {
		return getStringTermAccess().getRule();
	}
	
	//NoQuoteString:
	//	STRING;
	public PropertiesGrammarAccess.NoQuoteStringElements getNoQuoteStringAccess() {
		return gaProperties.getNoQuoteStringAccess();
	}
	
	public ParserRule getNoQuoteStringRule() {
		return getNoQuoteStringAccess().getRule();
	}
	
	//ArrayRange aadl2::ArrayRange:
	//	{aadl2::ArrayRange}
	//	'[' lowerBound=INTVALUE ('..' upperBound=INTVALUE)?
	//	']';
	public PropertiesGrammarAccess.ArrayRangeElements getArrayRangeAccess() {
		return gaProperties.getArrayRangeAccess();
	}
	
	public ParserRule getArrayRangeRule() {
		return getArrayRangeAccess().getRule();
	}
	
	//SignedConstant aadl2::Operation:
	//	op=PlusMinus ownedPropertyExpression+=ConstantValue;
	public PropertiesGrammarAccess.SignedConstantElements getSignedConstantAccess() {
		return gaProperties.getSignedConstantAccess();
	}
	
	public ParserRule getSignedConstantRule() {
		return getSignedConstantAccess().getRule();
	}
	
	//IntegerTerm aadl2::IntegerLiteral:
	//	value=SignedInt unit=[aadl2::UnitLiteral]?;
	public PropertiesGrammarAccess.IntegerTermElements getIntegerTermAccess() {
		return gaProperties.getIntegerTermAccess();
	}
	
	public ParserRule getIntegerTermRule() {
		return getIntegerTermAccess().getRule();
	}
	
	//SignedInt aadl2::Integer:
	//	('+' | '-')? INTEGER_LIT;
	public PropertiesGrammarAccess.SignedIntElements getSignedIntAccess() {
		return gaProperties.getSignedIntAccess();
	}
	
	public ParserRule getSignedIntRule() {
		return getSignedIntAccess().getRule();
	}
	
	//RealTerm aadl2::RealLiteral:
	//	value=SignedReal unit=[aadl2::UnitLiteral]?;
	public PropertiesGrammarAccess.RealTermElements getRealTermAccess() {
		return gaProperties.getRealTermAccess();
	}
	
	public ParserRule getRealTermRule() {
		return getRealTermAccess().getRule();
	}
	
	//SignedReal aadl2::Real:
	//	('+' | '-')? REAL_LIT;
	public PropertiesGrammarAccess.SignedRealElements getSignedRealAccess() {
		return gaProperties.getSignedRealAccess();
	}
	
	public ParserRule getSignedRealRule() {
		return getSignedRealAccess().getRule();
	}
	
	//NumericRangeTerm aadl2::RangeValue:
	//	minimum=NumAlt //(RealTerm|IntegerTerm| SignedConstant | ConstantValue)  
	//	'..' maximum=NumAlt ('delta' delta=NumAlt //(RealTerm|IntegerTerm| SignedConstant | ConstantValue)
	//)?;
	public PropertiesGrammarAccess.NumericRangeTermElements getNumericRangeTermAccess() {
		return gaProperties.getNumericRangeTermAccess();
	}
	
	public ParserRule getNumericRangeTermRule() {
		return getNumericRangeTermAccess().getRule();
	}
	
	//NumAlt aadl2::PropertyExpression:
	//	RealTerm | IntegerTerm | SignedConstant | ConstantValue;
	public PropertiesGrammarAccess.NumAltElements getNumAltAccess() {
		return gaProperties.getNumAltAccess();
	}
	
	public ParserRule getNumAltRule() {
		return getNumAltAccess().getRule();
	}
	
	//AppliesToKeywords:
	//	'applies' 'to';
	public PropertiesGrammarAccess.AppliesToKeywordsElements getAppliesToKeywordsAccess() {
		return gaProperties.getAppliesToKeywordsAccess();
	}
	
	public ParserRule getAppliesToKeywordsRule() {
		return getAppliesToKeywordsAccess().getRule();
	}
	
	//InBindingKeywords:
	//	'in' 'binding';
	public PropertiesGrammarAccess.InBindingKeywordsElements getInBindingKeywordsAccess() {
		return gaProperties.getInBindingKeywordsAccess();
	}
	
	public ParserRule getInBindingKeywordsRule() {
		return getInBindingKeywordsAccess().getRule();
	}
	
	//InModesKeywords:
	//	'in' 'modes';
	public PropertiesGrammarAccess.InModesKeywordsElements getInModesKeywordsAccess() {
		return gaProperties.getInModesKeywordsAccess();
	}
	
	public ParserRule getInModesKeywordsRule() {
		return getInModesKeywordsAccess().getRule();
	}
	
	//terminal SL_COMMENT:
	//	'--' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaProperties.getSL_COMMENTRule();
	}
	
	//INTVALUE aadl2::Integer:
	//	INTEGER_LIT //NUMERAL 	
	//;
	public PropertiesGrammarAccess.INTVALUEElements getINTVALUEAccess() {
		return gaProperties.getINTVALUEAccess();
	}
	
	public ParserRule getINTVALUERule() {
		return getINTVALUEAccess().getRule();
	}
	
	//terminal fragment EXPONENT:
	//	('e' | 'E') ('+' | '-')? DIGIT+;
	public TerminalRule getEXPONENTRule() {
		return gaProperties.getEXPONENTRule();
	}
	
	//terminal fragment INT_EXPONENT:
	//	('e' | 'E') '+'? DIGIT+;
	public TerminalRule getINT_EXPONENTRule() {
		return gaProperties.getINT_EXPONENTRule();
	}
	
	//terminal REAL_LIT:
	//	DIGIT+ ('_' DIGIT+)* ('.' DIGIT+ ('_' DIGIT+)* EXPONENT?);
	public TerminalRule getREAL_LITRule() {
		return gaProperties.getREAL_LITRule();
	}
	
	//terminal INTEGER_LIT:
	//	DIGIT+ ('_' DIGIT+)* ('#' BASED_INTEGER '#' INT_EXPONENT? | INT_EXPONENT?);
	public TerminalRule getINTEGER_LITRule() {
		return gaProperties.getINTEGER_LITRule();
	}
	
	//terminal fragment DIGIT:
	//	'0'..'9';
	public TerminalRule getDIGITRule() {
		return gaProperties.getDIGITRule();
	}
	
	//terminal fragment EXTENDED_DIGIT:
	//	'0'..'9' | 'a'..'f' | 'A'..'F';
	public TerminalRule getEXTENDED_DIGITRule() {
		return gaProperties.getEXTENDED_DIGITRule();
	}
	
	//terminal fragment BASED_INTEGER:
	//	EXTENDED_DIGIT ('_'? EXTENDED_DIGIT)*;
	public TerminalRule getBASED_INTEGERRule() {
		return gaProperties.getBASED_INTEGERRule();
	}
	
	//QCLREF:
	//	ID '::' ID;
	public PropertiesGrammarAccess.QCLREFElements getQCLREFAccess() {
		return gaProperties.getQCLREFAccess();
	}
	
	public ParserRule getQCLREFRule() {
		return getQCLREFAccess().getRule();
	}
	
	//QPREF:
	//	ID ('::' ID)?;
	public PropertiesGrammarAccess.QPREFElements getQPREFAccess() {
		return gaProperties.getQPREFAccess();
	}
	
	public ParserRule getQPREFRule() {
		return getQPREFAccess().getRule();
	}
	
	//QCREF:
	//	(ID '::')* ID ('.' ID)?;
	public PropertiesGrammarAccess.QCREFElements getQCREFAccess() {
		return gaProperties.getQCREFAccess();
	}
	
	public ParserRule getQCREFRule() {
		return getQCREFAccess().getRule();
	}
	
	//STAR:
	//	'*';
	public PropertiesGrammarAccess.STARElements getSTARAccess() {
		return gaProperties.getSTARAccess();
	}
	
	public ParserRule getSTARRule() {
		return getSTARAccess().getRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' ('b' | 't' | 'n' | 'f' | 'r' | 'u' | '"' | "'" | '\\') | !('\\' | '"'))* '"' |
	//	"'" ('\\' ('b' | 't' | 'n' | 'f' | 'r' | 'u' | '"' | "'" | '\\') | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaProperties.getSTRINGRule();
	}
	
	//terminal ID:
	//	('a'..'z'
	//	| 'A'..'Z') ('_'? ('a'..'z'
	//	| 'A'..'Z'
	//	| '0'..'9'))*;
	public TerminalRule getIDRule() {
		return gaProperties.getIDRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaProperties.getWSRule();
	}
}
