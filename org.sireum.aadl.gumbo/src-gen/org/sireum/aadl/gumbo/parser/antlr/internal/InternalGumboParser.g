
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
parser grammar InternalGumboParser;

options {
	tokenVocab=InternalGumboLexer;
	superClass=AbstractInternalAntlrParser;
	backtrack=true;
}

@header {
package org.sireum.aadl.gumbo.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.sireum.aadl.gumbo.services.GumboGrammarAccess;

}

@members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/

 	private GumboGrammarAccess grammarAccess;

    public InternalGumboParser(TokenStream input, GumboGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "AnnexLibrary";
   	}

   	@Override
   	protected GumboGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleAnnexLibrary
entryRuleAnnexLibrary returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAnnexLibraryRule()); }
	iv_ruleAnnexLibrary=ruleAnnexLibrary
	{ $current=$iv_ruleAnnexLibrary.current; }
	EOF;

// Rule AnnexLibrary
ruleAnnexLibrary returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		/* */
	}
	{
		newCompositeNode(grammarAccess.getAnnexLibraryAccess().getGumboLibraryParserRuleCall());
	}
	this_GumboLibrary_0=ruleGumboLibrary
	{
		$current = $this_GumboLibrary_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleGumboLibrary
entryRuleGumboLibrary returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGumboLibraryRule()); }
	iv_ruleGumboLibrary=ruleGumboLibrary
	{ $current=$iv_ruleGumboLibrary.current; }
	EOF;

// Rule GumboLibrary
ruleGumboLibrary returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getGumboLibraryAccess().getGumboLibraryAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGumboLibraryAccess().getFunctionsFunctionsParserRuleCall_1_0());
				}
				lv_functions_1_0=ruleFunctions
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGumboLibraryRule());
					}
					set(
						$current,
						"functions",
						lv_functions_1_0,
						"org.sireum.aadl.gumbo.Gumbo.Functions");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleGumboSubclause
entryRuleGumboSubclause returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGumboSubclauseRule()); }
	iv_ruleGumboSubclause=ruleGumboSubclause
	{ $current=$iv_ruleGumboSubclause.current; }
	EOF;

// Rule GumboSubclause
ruleGumboSubclause returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getGumboSubclauseAccess().getGumboSubclauseAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGumboSubclauseAccess().getSpecsSpecSectionParserRuleCall_1_0());
				}
				lv_specs_1_0=ruleSpecSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGumboSubclauseRule());
					}
					set(
						$current,
						"specs",
						lv_specs_1_0,
						"org.sireum.aadl.gumbo.Gumbo.SpecSection");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleSpecSection
entryRuleSpecSection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSpecSectionRule()); }
	iv_ruleSpecSection=ruleSpecSection
	{ $current=$iv_ruleSpecSection.current; }
	EOF;

// Rule SpecSection
ruleSpecSection returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getSpecSectionAccess().getSpecSectionAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getSpecSectionAccess().getStateStateParserRuleCall_1_0());
				}
				lv_state_1_0=ruleState
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSpecSectionRule());
					}
					set(
						$current,
						"state",
						lv_state_1_0,
						"org.sireum.aadl.gumbo.Gumbo.State");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getSpecSectionAccess().getFunctionsFunctionsParserRuleCall_2_0());
				}
				lv_functions_2_0=ruleFunctions
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSpecSectionRule());
					}
					set(
						$current,
						"functions",
						lv_functions_2_0,
						"org.sireum.aadl.gumbo.Gumbo.Functions");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getSpecSectionAccess().getInvariantsInvariantsParserRuleCall_3_0());
				}
				lv_invariants_3_0=ruleInvariants
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSpecSectionRule());
					}
					set(
						$current,
						"invariants",
						lv_invariants_3_0,
						"org.sireum.aadl.gumbo.Gumbo.Invariants");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getSpecSectionAccess().getIntegrationIntegrationParserRuleCall_4_0());
				}
				lv_integration_4_0=ruleIntegration
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSpecSectionRule());
					}
					set(
						$current,
						"integration",
						lv_integration_4_0,
						"org.sireum.aadl.gumbo.Gumbo.Integration");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getSpecSectionAccess().getInitializeInitializeParserRuleCall_5_0());
				}
				lv_initialize_5_0=ruleInitialize
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSpecSectionRule());
					}
					set(
						$current,
						"initialize",
						lv_initialize_5_0,
						"org.sireum.aadl.gumbo.Gumbo.Initialize");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getSpecSectionAccess().getComputeComputeParserRuleCall_6_0());
				}
				lv_compute_6_0=ruleCompute
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSpecSectionRule());
					}
					set(
						$current,
						"compute",
						lv_compute_6_0,
						"org.sireum.aadl.gumbo.Gumbo.Compute");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleState
entryRuleState returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStateRule()); }
	iv_ruleState=ruleState
	{ $current=$iv_ruleState.current; }
	EOF;

// Rule State
ruleState returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=State
		{
			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStateAccess().getDeclsStateVarDeclParserRuleCall_1_0());
				}
				lv_decls_1_0=ruleStateVarDecl
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateRule());
					}
					add(
						$current,
						"decls",
						lv_decls_1_0,
						"org.sireum.aadl.gumbo.Gumbo.StateVarDecl");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleStateVarDecl
entryRuleStateVarDecl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStateVarDeclRule()); }
	iv_ruleStateVarDecl=ruleStateVarDecl
	{ $current=$iv_ruleStateVarDecl.current; }
	EOF;

// Rule StateVarDecl
ruleStateVarDecl returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					lv_name_0_0=RULE_ID
					{
						newLeafNode(lv_name_0_0, grammarAccess.getStateVarDeclAccess().getNameIDTerminalRuleCall_0_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStateVarDeclRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_0_0,
							"org.osate.xtext.aadl2.properties.Properties.ID");
					}
				)
			)
			otherlv_1=Colon
			{
				newLeafNode(otherlv_1, grammarAccess.getStateVarDeclAccess().getColonKeyword_0_1());
			}
		)
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStateVarDeclRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getStateVarDeclAccess().getTypeNameDataSubcomponentTypeCrossReference_1_0());
				}
				ruleQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=Semicolon
		{
			newLeafNode(otherlv_3, grammarAccess.getStateVarDeclAccess().getSemicolonKeyword_2());
		}
	)
;

// Entry rule entryRuleInvariants
entryRuleInvariants returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInvariantsRule()); }
	iv_ruleInvariants=ruleInvariants
	{ $current=$iv_ruleInvariants.current; }
	EOF;

// Rule Invariants
ruleInvariants returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=Invariants
		{
			newLeafNode(otherlv_0, grammarAccess.getInvariantsAccess().getInvariantsKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getInvariantsAccess().getSpecsInvSpecParserRuleCall_1_0());
				}
				lv_specs_1_0=ruleInvSpec
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInvariantsRule());
					}
					add(
						$current,
						"specs",
						lv_specs_1_0,
						"org.sireum.aadl.gumbo.Gumbo.InvSpec");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleInvSpec
entryRuleInvSpec returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInvSpecRule()); }
	iv_ruleInvSpec=ruleInvSpec
	{ $current=$iv_ruleInvSpec.current; }
	EOF;

// Rule InvSpec
ruleInvSpec returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=Inv
		{
			newLeafNode(otherlv_0, grammarAccess.getInvSpecAccess().getInvKeyword_0());
		}
		(
			(
				lv_id_1_0=RULE_ID
				{
					newLeafNode(lv_id_1_0, grammarAccess.getInvSpecAccess().getIdIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInvSpecRule());
					}
					setWithLastConsumed(
						$current,
						"id",
						lv_id_1_0,
						"org.osate.xtext.aadl2.properties.Properties.ID");
				}
			)
		)
		(
			(
				lv_descriptor_2_0=RULE_STRING_VALUE
				{
					newLeafNode(lv_descriptor_2_0, grammarAccess.getInvSpecAccess().getDescriptorSTRING_VALUETerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInvSpecRule());
					}
					setWithLastConsumed(
						$current,
						"descriptor",
						lv_descriptor_2_0,
						"org.sireum.aadl.gumbo.Gumbo.STRING_VALUE");
				}
			)
		)?
		otherlv_3=Colon
		{
			newLeafNode(otherlv_3, grammarAccess.getInvSpecAccess().getColonKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getInvSpecAccess().getExprOwnedExpressionParserRuleCall_4_0());
				}
				lv_expr_4_0=ruleOwnedExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInvSpecRule());
					}
					set(
						$current,
						"expr",
						lv_expr_4_0,
						"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=Semicolon
		{
			newLeafNode(otherlv_5, grammarAccess.getInvSpecAccess().getSemicolonKeyword_5());
		}
	)
;

// Entry rule entryRuleIntegration
entryRuleIntegration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIntegrationRule()); }
	iv_ruleIntegration=ruleIntegration
	{ $current=$iv_ruleIntegration.current; }
	EOF;

// Rule Integration
ruleIntegration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=Integration
		{
			newLeafNode(otherlv_0, grammarAccess.getIntegrationAccess().getIntegrationKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIntegrationAccess().getSpecsSpecStatementParserRuleCall_1_0());
				}
				lv_specs_1_0=ruleSpecStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIntegrationRule());
					}
					add(
						$current,
						"specs",
						lv_specs_1_0,
						"org.sireum.aadl.gumbo.Gumbo.SpecStatement");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleInitialize
entryRuleInitialize returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInitializeRule()); }
	iv_ruleInitialize=ruleInitialize
	{ $current=$iv_ruleInitialize.current; }
	EOF;

// Rule Initialize
ruleInitialize returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getInitializeAccess().getInitializeAction_0(),
					$current);
			}
		)
		otherlv_1=Initialize
		{
			newLeafNode(otherlv_1, grammarAccess.getInitializeAccess().getInitializeKeyword_1());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getInitializeAccess().getModifiesSlangModifiesParserRuleCall_2_0_0());
					}
					lv_modifies_2_0=ruleSlangModifies
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getInitializeRule());
						}
						set(
							$current,
							"modifies",
							lv_modifies_2_0,
							"org.sireum.aadl.gumbo.Gumbo.SlangModifies");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_3=Semicolon
			{
				newLeafNode(otherlv_3, grammarAccess.getInitializeAccess().getSemicolonKeyword_2_1());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getInitializeAccess().getSpecsInitializeSpecStatementParserRuleCall_3_0());
				}
				lv_specs_4_0=ruleInitializeSpecStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInitializeRule());
					}
					add(
						$current,
						"specs",
						lv_specs_4_0,
						"org.sireum.aadl.gumbo.Gumbo.InitializeSpecStatement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getInitializeAccess().getFlowsInfoFlowClauseParserRuleCall_4_0());
				}
				lv_flows_5_0=ruleInfoFlowClause
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInitializeRule());
					}
					add(
						$current,
						"flows",
						lv_flows_5_0,
						"org.sireum.aadl.gumbo.Gumbo.InfoFlowClause");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleInitializeSpecStatement
entryRuleInitializeSpecStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInitializeSpecStatementRule()); }
	iv_ruleInitializeSpecStatement=ruleInitializeSpecStatement
	{ $current=$iv_ruleInitializeSpecStatement.current; }
	EOF;

// Rule InitializeSpecStatement
ruleInitializeSpecStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getInitializeSpecStatementAccess().getGuaranteeStatementGuaranteeStatementParserRuleCall_0());
			}
			lv_guaranteeStatement_0_0=ruleGuaranteeStatement
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getInitializeSpecStatementRule());
				}
				set(
					$current,
					"guaranteeStatement",
					lv_guaranteeStatement_0_0,
					"org.sireum.aadl.gumbo.Gumbo.GuaranteeStatement");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleCompute
entryRuleCompute returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComputeRule()); }
	iv_ruleCompute=ruleCompute
	{ $current=$iv_ruleCompute.current; }
	EOF;

// Rule Compute
ruleCompute returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getComputeAccess().getComputeAction_0(),
					$current);
			}
		)
		otherlv_1=Compute
		{
			newLeafNode(otherlv_1, grammarAccess.getComputeAccess().getComputeKeyword_1());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getComputeAccess().getModifiesSlangModifiesParserRuleCall_2_0_0());
					}
					lv_modifies_2_0=ruleSlangModifies
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getComputeRule());
						}
						set(
							$current,
							"modifies",
							lv_modifies_2_0,
							"org.sireum.aadl.gumbo.Gumbo.SlangModifies");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_3=Semicolon
			{
				newLeafNode(otherlv_3, grammarAccess.getComputeAccess().getSemicolonKeyword_2_1());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getComputeAccess().getAssumesAssumeStatementParserRuleCall_3_0());
				}
				lv_assumes_4_0=ruleAssumeStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComputeRule());
					}
					add(
						$current,
						"assumes",
						lv_assumes_4_0,
						"org.sireum.aadl.gumbo.Gumbo.AssumeStatement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getComputeAccess().getGuaranteesGuaranteeStatementParserRuleCall_4_0());
				}
				lv_guarantees_5_0=ruleGuaranteeStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComputeRule());
					}
					add(
						$current,
						"guarantees",
						lv_guarantees_5_0,
						"org.sireum.aadl.gumbo.Gumbo.GuaranteeStatement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			otherlv_6=Cases
			{
				newLeafNode(otherlv_6, grammarAccess.getComputeAccess().getCasesKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getComputeAccess().getCasesCaseStatementClauseParserRuleCall_5_1_0());
					}
					lv_cases_7_0=ruleCaseStatementClause
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getComputeRule());
						}
						add(
							$current,
							"cases",
							lv_cases_7_0,
							"org.sireum.aadl.gumbo.Gumbo.CaseStatementClause");
						afterParserOrEnumRuleCall();
					}
				)
			)+
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getComputeAccess().getHandlersHandlerClauseParserRuleCall_6_0());
				}
				lv_handlers_8_0=ruleHandlerClause
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComputeRule());
					}
					add(
						$current,
						"handlers",
						lv_handlers_8_0,
						"org.sireum.aadl.gumbo.Gumbo.HandlerClause");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getComputeAccess().getFlowsInfoFlowClauseParserRuleCall_7_0());
				}
				lv_flows_9_0=ruleInfoFlowClause
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComputeRule());
					}
					add(
						$current,
						"flows",
						lv_flows_9_0,
						"org.sireum.aadl.gumbo.Gumbo.InfoFlowClause");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleInfoFlowClause
entryRuleInfoFlowClause returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInfoFlowClauseRule()); }
	iv_ruleInfoFlowClause=ruleInfoFlowClause
	{ $current=$iv_ruleInfoFlowClause.current; }
	EOF;

// Rule InfoFlowClause
ruleInfoFlowClause returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=Infoflow
		{
			newLeafNode(otherlv_0, grammarAccess.getInfoFlowClauseAccess().getInfoflowKeyword_0());
		}
		(
			(
				lv_id_1_0=RULE_ID
				{
					newLeafNode(lv_id_1_0, grammarAccess.getInfoFlowClauseAccess().getIdIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInfoFlowClauseRule());
					}
					setWithLastConsumed(
						$current,
						"id",
						lv_id_1_0,
						"org.osate.xtext.aadl2.properties.Properties.ID");
				}
			)
		)
		(
			(
				lv_descriptor_2_0=RULE_STRING_VALUE
				{
					newLeafNode(lv_descriptor_2_0, grammarAccess.getInfoFlowClauseAccess().getDescriptorSTRING_VALUETerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInfoFlowClauseRule());
					}
					setWithLastConsumed(
						$current,
						"descriptor",
						lv_descriptor_2_0,
						"org.sireum.aadl.gumbo.Gumbo.STRING_VALUE");
				}
			)
		)?
		otherlv_3=Colon
		{
			newLeafNode(otherlv_3, grammarAccess.getInfoFlowClauseAccess().getColonKeyword_3());
		}
		otherlv_4=From
		{
			newLeafNode(otherlv_4, grammarAccess.getInfoFlowClauseAccess().getFromKeyword_4());
		}
		otherlv_5=LeftParenthesis
		{
			newLeafNode(otherlv_5, grammarAccess.getInfoFlowClauseAccess().getLeftParenthesisKeyword_5());
		}
		(
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getInfoFlowClauseRule());
						}
					}
					otherlv_6=RULE_ID
					{
						newLeafNode(otherlv_6, grammarAccess.getInfoFlowClauseAccess().getFromPortOrStateVarEObjectCrossReference_6_0_0());
					}
				)
			)
			(
				otherlv_7=Comma
				{
					newLeafNode(otherlv_7, grammarAccess.getInfoFlowClauseAccess().getCommaKeyword_6_1_0());
				}
				(
					(
						{
							/* */
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getInfoFlowClauseRule());
							}
						}
						otherlv_8=RULE_ID
						{
							newLeafNode(otherlv_8, grammarAccess.getInfoFlowClauseAccess().getFromPortOrStateVarEObjectCrossReference_6_1_1_0());
						}
					)
				)
			)*
		)?
		otherlv_9=RightParenthesis
		{
			newLeafNode(otherlv_9, grammarAccess.getInfoFlowClauseAccess().getRightParenthesisKeyword_7());
		}
		otherlv_10=Comma
		{
			newLeafNode(otherlv_10, grammarAccess.getInfoFlowClauseAccess().getCommaKeyword_8());
		}
		otherlv_11=To
		{
			newLeafNode(otherlv_11, grammarAccess.getInfoFlowClauseAccess().getToKeyword_9());
		}
		otherlv_12=LeftParenthesis
		{
			newLeafNode(otherlv_12, grammarAccess.getInfoFlowClauseAccess().getLeftParenthesisKeyword_10());
		}
		(
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getInfoFlowClauseRule());
						}
					}
					otherlv_13=RULE_ID
					{
						newLeafNode(otherlv_13, grammarAccess.getInfoFlowClauseAccess().getToPortOrStateVarEObjectCrossReference_11_0_0());
					}
				)
			)
			(
				otherlv_14=Comma
				{
					newLeafNode(otherlv_14, grammarAccess.getInfoFlowClauseAccess().getCommaKeyword_11_1_0());
				}
				(
					(
						{
							/* */
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getInfoFlowClauseRule());
							}
						}
						otherlv_15=RULE_ID
						{
							newLeafNode(otherlv_15, grammarAccess.getInfoFlowClauseAccess().getToPortOrStateVarEObjectCrossReference_11_1_1_0());
						}
					)
				)
			)*
		)?
		otherlv_16=RightParenthesis
		{
			newLeafNode(otherlv_16, grammarAccess.getInfoFlowClauseAccess().getRightParenthesisKeyword_12());
		}
		otherlv_17=Semicolon
		{
			newLeafNode(otherlv_17, grammarAccess.getInfoFlowClauseAccess().getSemicolonKeyword_13());
		}
	)
;

// Entry rule entryRuleHandlerClause
entryRuleHandlerClause returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHandlerClauseRule()); }
	iv_ruleHandlerClause=ruleHandlerClause
	{ $current=$iv_ruleHandlerClause.current; }
	EOF;

// Rule HandlerClause
ruleHandlerClause returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=Handle
		{
			newLeafNode(otherlv_0, grammarAccess.getHandlerClauseAccess().getHandleKeyword_0());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getHandlerClauseRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getHandlerClauseAccess().getIdPortCrossReference_1_0());
				}
			)
		)
		otherlv_2=Colon
		{
			newLeafNode(otherlv_2, grammarAccess.getHandlerClauseAccess().getColonKeyword_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getHandlerClauseAccess().getModifiesSlangModifiesParserRuleCall_3_0_0());
					}
					lv_modifies_3_0=ruleSlangModifies
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getHandlerClauseRule());
						}
						set(
							$current,
							"modifies",
							lv_modifies_3_0,
							"org.sireum.aadl.gumbo.Gumbo.SlangModifies");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_4=Semicolon
			{
				newLeafNode(otherlv_4, grammarAccess.getHandlerClauseAccess().getSemicolonKeyword_3_1());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getHandlerClauseAccess().getAssumesAssumeStatementParserRuleCall_4_0());
				}
				lv_assumes_5_0=ruleAssumeStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getHandlerClauseRule());
					}
					add(
						$current,
						"assumes",
						lv_assumes_5_0,
						"org.sireum.aadl.gumbo.Gumbo.AssumeStatement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getHandlerClauseAccess().getGuaranteesGuaranteeStatementParserRuleCall_5_0());
				}
				lv_guarantees_6_0=ruleGuaranteeStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getHandlerClauseRule());
					}
					add(
						$current,
						"guarantees",
						lv_guarantees_6_0,
						"org.sireum.aadl.gumbo.Gumbo.GuaranteeStatement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			otherlv_7=Cases
			{
				newLeafNode(otherlv_7, grammarAccess.getHandlerClauseAccess().getCasesKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getHandlerClauseAccess().getCasesCaseStatementClauseParserRuleCall_6_1_0());
					}
					lv_cases_8_0=ruleCaseStatementClause
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getHandlerClauseRule());
						}
						add(
							$current,
							"cases",
							lv_cases_8_0,
							"org.sireum.aadl.gumbo.Gumbo.CaseStatementClause");
						afterParserOrEnumRuleCall();
					}
				)
			)+
		)*
	)
;

// Entry rule entryRuleCaseStatementClause
entryRuleCaseStatementClause returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCaseStatementClauseRule()); }
	iv_ruleCaseStatementClause=ruleCaseStatementClause
	{ $current=$iv_ruleCaseStatementClause.current; }
	EOF;

// Rule CaseStatementClause
ruleCaseStatementClause returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=Case
		{
			newLeafNode(otherlv_0, grammarAccess.getCaseStatementClauseAccess().getCaseKeyword_0());
		}
		(
			(
				lv_id_1_0=RULE_ID
				{
					newLeafNode(lv_id_1_0, grammarAccess.getCaseStatementClauseAccess().getIdIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCaseStatementClauseRule());
					}
					setWithLastConsumed(
						$current,
						"id",
						lv_id_1_0,
						"org.osate.xtext.aadl2.properties.Properties.ID");
				}
			)
		)
		(
			(
				lv_descriptor_2_0=RULE_STRING_VALUE
				{
					newLeafNode(lv_descriptor_2_0, grammarAccess.getCaseStatementClauseAccess().getDescriptorSTRING_VALUETerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCaseStatementClauseRule());
					}
					setWithLastConsumed(
						$current,
						"descriptor",
						lv_descriptor_2_0,
						"org.sireum.aadl.gumbo.Gumbo.STRING_VALUE");
				}
			)
		)?
		otherlv_3=Colon
		{
			newLeafNode(otherlv_3, grammarAccess.getCaseStatementClauseAccess().getColonKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCaseStatementClauseAccess().getAssumeStatementAnonAssumeStatementParserRuleCall_4_0());
				}
				lv_assumeStatement_4_0=ruleAnonAssumeStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCaseStatementClauseRule());
					}
					set(
						$current,
						"assumeStatement",
						lv_assumeStatement_4_0,
						"org.sireum.aadl.gumbo.Gumbo.AnonAssumeStatement");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getCaseStatementClauseAccess().getGuaranteeStatementAnonGuaranteeStatementParserRuleCall_5_0());
				}
				lv_guaranteeStatement_5_0=ruleAnonGuaranteeStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCaseStatementClauseRule());
					}
					set(
						$current,
						"guaranteeStatement",
						lv_guaranteeStatement_5_0,
						"org.sireum.aadl.gumbo.Gumbo.AnonGuaranteeStatement");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleSpecStatement
entryRuleSpecStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSpecStatementRule()); }
	iv_ruleSpecStatement=ruleSpecStatement
	{ $current=$iv_ruleSpecStatement.current; }
	EOF;

// Rule SpecStatement
ruleSpecStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getSpecStatementAccess().getAssumeStatementParserRuleCall_0());
		}
		this_AssumeStatement_0=ruleAssumeStatement
		{
			$current = $this_AssumeStatement_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getSpecStatementAccess().getGuaranteeStatementParserRuleCall_1());
		}
		this_GuaranteeStatement_1=ruleGuaranteeStatement
		{
			$current = $this_GuaranteeStatement_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAssumeStatement
entryRuleAssumeStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAssumeStatementRule()); }
	iv_ruleAssumeStatement=ruleAssumeStatement
	{ $current=$iv_ruleAssumeStatement.current; }
	EOF;

// Rule AssumeStatement
ruleAssumeStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=Assume
		{
			newLeafNode(otherlv_0, grammarAccess.getAssumeStatementAccess().getAssumeKeyword_0());
		}
		(
			(
				lv_id_1_0=RULE_ID
				{
					newLeafNode(lv_id_1_0, grammarAccess.getAssumeStatementAccess().getIdIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAssumeStatementRule());
					}
					setWithLastConsumed(
						$current,
						"id",
						lv_id_1_0,
						"org.osate.xtext.aadl2.properties.Properties.ID");
				}
			)
		)
		(
			(
				lv_descriptor_2_0=RULE_STRING_VALUE
				{
					newLeafNode(lv_descriptor_2_0, grammarAccess.getAssumeStatementAccess().getDescriptorSTRING_VALUETerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAssumeStatementRule());
					}
					setWithLastConsumed(
						$current,
						"descriptor",
						lv_descriptor_2_0,
						"org.sireum.aadl.gumbo.Gumbo.STRING_VALUE");
				}
			)
		)?
		otherlv_3=Colon
		{
			newLeafNode(otherlv_3, grammarAccess.getAssumeStatementAccess().getColonKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAssumeStatementAccess().getExprOwnedExpressionParserRuleCall_4_0());
				}
				lv_expr_4_0=ruleOwnedExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAssumeStatementRule());
					}
					set(
						$current,
						"expr",
						lv_expr_4_0,
						"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=Semicolon
		{
			newLeafNode(otherlv_5, grammarAccess.getAssumeStatementAccess().getSemicolonKeyword_5());
		}
	)
;

// Entry rule entryRuleAnonAssumeStatement
entryRuleAnonAssumeStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAnonAssumeStatementRule()); }
	iv_ruleAnonAssumeStatement=ruleAnonAssumeStatement
	{ $current=$iv_ruleAnonAssumeStatement.current; }
	EOF;

// Rule AnonAssumeStatement
ruleAnonAssumeStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=Assume
		{
			newLeafNode(otherlv_0, grammarAccess.getAnonAssumeStatementAccess().getAssumeKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAnonAssumeStatementAccess().getExprOwnedExpressionParserRuleCall_1_0());
				}
				lv_expr_1_0=ruleOwnedExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAnonAssumeStatementRule());
					}
					set(
						$current,
						"expr",
						lv_expr_1_0,
						"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2=Semicolon
		{
			newLeafNode(otherlv_2, grammarAccess.getAnonAssumeStatementAccess().getSemicolonKeyword_2());
		}
	)
;

// Entry rule entryRuleGuaranteeStatement
entryRuleGuaranteeStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGuaranteeStatementRule()); }
	iv_ruleGuaranteeStatement=ruleGuaranteeStatement
	{ $current=$iv_ruleGuaranteeStatement.current; }
	EOF;

// Rule GuaranteeStatement
ruleGuaranteeStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=Guarantee
		{
			newLeafNode(otherlv_0, grammarAccess.getGuaranteeStatementAccess().getGuaranteeKeyword_0());
		}
		(
			(
				lv_id_1_0=RULE_ID
				{
					newLeafNode(lv_id_1_0, grammarAccess.getGuaranteeStatementAccess().getIdIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGuaranteeStatementRule());
					}
					setWithLastConsumed(
						$current,
						"id",
						lv_id_1_0,
						"org.osate.xtext.aadl2.properties.Properties.ID");
				}
			)
		)
		(
			(
				lv_descriptor_2_0=RULE_STRING_VALUE
				{
					newLeafNode(lv_descriptor_2_0, grammarAccess.getGuaranteeStatementAccess().getDescriptorSTRING_VALUETerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGuaranteeStatementRule());
					}
					setWithLastConsumed(
						$current,
						"descriptor",
						lv_descriptor_2_0,
						"org.sireum.aadl.gumbo.Gumbo.STRING_VALUE");
				}
			)
		)?
		otherlv_3=Colon
		{
			newLeafNode(otherlv_3, grammarAccess.getGuaranteeStatementAccess().getColonKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGuaranteeStatementAccess().getExprOwnedExpressionParserRuleCall_4_0());
				}
				lv_expr_4_0=ruleOwnedExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGuaranteeStatementRule());
					}
					set(
						$current,
						"expr",
						lv_expr_4_0,
						"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=Semicolon
		{
			newLeafNode(otherlv_5, grammarAccess.getGuaranteeStatementAccess().getSemicolonKeyword_5());
		}
	)
;

// Entry rule entryRuleAnonGuaranteeStatement
entryRuleAnonGuaranteeStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAnonGuaranteeStatementRule()); }
	iv_ruleAnonGuaranteeStatement=ruleAnonGuaranteeStatement
	{ $current=$iv_ruleAnonGuaranteeStatement.current; }
	EOF;

// Rule AnonGuaranteeStatement
ruleAnonGuaranteeStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=Guarantee
		{
			newLeafNode(otherlv_0, grammarAccess.getAnonGuaranteeStatementAccess().getGuaranteeKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAnonGuaranteeStatementAccess().getExprOwnedExpressionParserRuleCall_1_0());
				}
				lv_expr_1_0=ruleOwnedExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAnonGuaranteeStatementRule());
					}
					set(
						$current,
						"expr",
						lv_expr_1_0,
						"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2=Semicolon
		{
			newLeafNode(otherlv_2, grammarAccess.getAnonGuaranteeStatementAccess().getSemicolonKeyword_2());
		}
	)
;

// Entry rule entryRuleDataElement
entryRuleDataElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDataElementRule()); }
	iv_ruleDataElement=ruleDataElement
	{ $current=$iv_ruleDataElement.current; }
	EOF;

// Rule DataElement
ruleDataElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getDataElementRule());
				}
			}
			{
				newCompositeNode(grammarAccess.getDataElementAccess().getDataElementDataSubcomponentTypeCrossReference_0());
			}
			ruleQualifiedName
			{
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleFunctions
entryRuleFunctions returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFunctionsRule()); }
	iv_ruleFunctions=ruleFunctions
	{ $current=$iv_ruleFunctions.current; }
	EOF;

// Rule Functions
ruleFunctions returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=Functions
		{
			newLeafNode(otherlv_0, grammarAccess.getFunctionsAccess().getFunctionsKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFunctionsAccess().getSpecsFuncSpecParserRuleCall_1_0());
				}
				lv_specs_1_0=ruleFuncSpec
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFunctionsRule());
					}
					add(
						$current,
						"specs",
						lv_specs_1_0,
						"org.sireum.aadl.gumbo.Gumbo.FuncSpec");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleFuncSpec
entryRuleFuncSpec returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFuncSpecRule()); }
	iv_ruleFuncSpec=ruleFuncSpec
	{ $current=$iv_ruleFuncSpec.current; }
	EOF;

// Rule FuncSpec
ruleFuncSpec returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getFuncSpecAccess().getSlangDefDefParserRuleCall_0());
		}
		this_SlangDefDef_0=ruleSlangDefDef
		{
			$current = $this_SlangDefDef_0.current;
			afterParserOrEnumRuleCall();
		}
		otherlv_1=Semicolon
		{
			newLeafNode(otherlv_1, grammarAccess.getFuncSpecAccess().getSemicolonKeyword_1());
		}
	)
;

// Entry rule entryRuleSlangDefDef
entryRuleSlangDefDef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlangDefDefRule()); }
	iv_ruleSlangDefDef=ruleSlangDefDef
	{ $current=$iv_ruleSlangDefDef.current; }
	EOF;

// Rule SlangDefDef
ruleSlangDefDef returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=Def
		{
			newLeafNode(otherlv_0, grammarAccess.getSlangDefDefAccess().getDefKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSlangDefDefAccess().getNameSlangDefIDParserRuleCall_1_0());
				}
				lv_name_1_0=ruleSlangDefID
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangDefDefRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.sireum.aadl.gumbo.Gumbo.SlangDefID");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getSlangDefDefAccess().getTypeParamsSlangTypeParamsParserRuleCall_2_0());
				}
				lv_typeParams_2_0=ruleSlangTypeParams
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangDefDefRule());
					}
					set(
						$current,
						"typeParams",
						lv_typeParams_2_0,
						"org.sireum.aadl.gumbo.Gumbo.SlangTypeParams");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getSlangDefDefAccess().getParamsSlangDefParamsParserRuleCall_3_0());
				}
				lv_params_3_0=ruleSlangDefParams
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangDefDefRule());
					}
					set(
						$current,
						"params",
						lv_params_3_0,
						"org.sireum.aadl.gumbo.Gumbo.SlangDefParams");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4=Colon
		{
			newLeafNode(otherlv_4, grammarAccess.getSlangDefDefAccess().getColonKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSlangDefDefAccess().getTypeSlangTypeParserRuleCall_5_0());
				}
				lv_type_5_0=ruleSlangType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangDefDefRule());
					}
					set(
						$current,
						"type",
						lv_type_5_0,
						"org.sireum.aadl.gumbo.Gumbo.SlangType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6=ColonEqualsSign
		{
			newLeafNode(otherlv_6, grammarAccess.getSlangDefDefAccess().getColonEqualsSignKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSlangDefDefAccess().getMethodContractSlangDefContractParserRuleCall_7_0());
				}
				lv_methodContract_7_0=ruleSlangDefContract
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangDefDefRule());
					}
					set(
						$current,
						"methodContract",
						lv_methodContract_7_0,
						"org.sireum.aadl.gumbo.Gumbo.SlangDefContract");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getSlangDefDefAccess().getBodyOwnedExpressionParserRuleCall_8_0());
				}
				lv_body_8_0=ruleOwnedExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangDefDefRule());
					}
					set(
						$current,
						"body",
						lv_body_8_0,
						"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleSlangDefID
entryRuleSlangDefID returns [String current=null]:
	{ newCompositeNode(grammarAccess.getSlangDefIDRule()); }
	iv_ruleSlangDefID=ruleSlangDefID
	{ $current=$iv_ruleSlangDefID.current.getText(); }
	EOF;

// Rule SlangDefID
ruleSlangDefID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_ID_0=RULE_ID
	{
		$current.merge(this_ID_0);
	}
	{
		newLeafNode(this_ID_0, grammarAccess.getSlangDefIDAccess().getIDTerminalRuleCall());
	}
;

// Entry rule entryRuleSlangDefParams
entryRuleSlangDefParams returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlangDefParamsRule()); }
	iv_ruleSlangDefParams=ruleSlangDefParams
	{ $current=$iv_ruleSlangDefParams.current; }
	EOF;

// Rule SlangDefParams
ruleSlangDefParams returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=LeftParenthesis
		{
			newLeafNode(otherlv_0, grammarAccess.getSlangDefParamsAccess().getLeftParenthesisKeyword_0());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getSlangDefParamsAccess().getParamsSlangDefParamParserRuleCall_1_0_0());
					}
					lv_params_1_0=ruleSlangDefParam
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangDefParamsRule());
						}
						add(
							$current,
							"params",
							lv_params_1_0,
							"org.sireum.aadl.gumbo.Gumbo.SlangDefParam");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_2=Comma
				{
					newLeafNode(otherlv_2, grammarAccess.getSlangDefParamsAccess().getCommaKeyword_1_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getSlangDefParamsAccess().getParamsSlangDefParamParserRuleCall_1_1_1_0());
						}
						lv_params_3_0=ruleSlangDefParam
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSlangDefParamsRule());
							}
							add(
								$current,
								"params",
								lv_params_3_0,
								"org.sireum.aadl.gumbo.Gumbo.SlangDefParam");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_4=RightParenthesis
		{
			newLeafNode(otherlv_4, grammarAccess.getSlangDefParamsAccess().getRightParenthesisKeyword_2());
		}
	)
;

// Entry rule entryRuleSlangDefParam
entryRuleSlangDefParam returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlangDefParamRule()); }
	iv_ruleSlangDefParam=ruleSlangDefParam
	{ $current=$iv_ruleSlangDefParam.current; }
	EOF;

// Rule SlangDefParam
ruleSlangDefParam returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getSlangDefParamAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSlangDefParamRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.osate.xtext.aadl2.properties.Properties.ID");
				}
			)
		)
		otherlv_1=Colon
		{
			newLeafNode(otherlv_1, grammarAccess.getSlangDefParamAccess().getColonKeyword_1());
		}
		(
			(
				lv_isMethodDef_2_0=EqualsSignGreaterThanSign
				{
					newLeafNode(lv_isMethodDef_2_0, grammarAccess.getSlangDefParamAccess().getIsMethodDefEqualsSignGreaterThanSignKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSlangDefParamRule());
					}
					setWithLastConsumed($current, "isMethodDef", lv_isMethodDef_2_0 != null, "=>");
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getSlangDefParamAccess().getTypeNameSlangTypeParserRuleCall_3_0());
				}
				lv_typeName_3_0=ruleSlangType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangDefParamRule());
					}
					set(
						$current,
						"typeName",
						lv_typeName_3_0,
						"org.sireum.aadl.gumbo.Gumbo.SlangType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_isVarArg_4_0=Asterisk
				{
					newLeafNode(lv_isVarArg_4_0, grammarAccess.getSlangDefParamAccess().getIsVarArgAsteriskKeyword_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSlangDefParamRule());
					}
					setWithLastConsumed($current, "isVarArg", lv_isVarArg_4_0 != null, "*");
				}
			)
		)?
	)
;

// Entry rule entryRuleSlangTypeParams
entryRuleSlangTypeParams returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlangTypeParamsRule()); }
	iv_ruleSlangTypeParams=ruleSlangTypeParams
	{ $current=$iv_ruleSlangTypeParams.current; }
	EOF;

// Rule SlangTypeParams
ruleSlangTypeParams returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=LeftSquareBracket
		{
			newLeafNode(otherlv_0, grammarAccess.getSlangTypeParamsAccess().getLeftSquareBracketKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSlangTypeParamsAccess().getTypeParamSlangTypeParamParserRuleCall_1_0());
				}
				lv_typeParam_1_0=ruleSlangTypeParam
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangTypeParamsRule());
					}
					add(
						$current,
						"typeParam",
						lv_typeParam_1_0,
						"org.sireum.aadl.gumbo.Gumbo.SlangTypeParam");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2=Comma
			{
				newLeafNode(otherlv_2, grammarAccess.getSlangTypeParamsAccess().getCommaKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSlangTypeParamsAccess().getTypeParamSlangTypeParamParserRuleCall_2_1_0());
					}
					lv_typeParam_3_0=ruleSlangTypeParam
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangTypeParamsRule());
						}
						add(
							$current,
							"typeParam",
							lv_typeParam_3_0,
							"org.sireum.aadl.gumbo.Gumbo.SlangTypeParam");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_4=RightSquareBracket
		{
			newLeafNode(otherlv_4, grammarAccess.getSlangTypeParamsAccess().getRightSquareBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleSlangTypeParam
entryRuleSlangTypeParam returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlangTypeParamRule()); }
	iv_ruleSlangTypeParam=ruleSlangTypeParam
	{ $current=$iv_ruleSlangTypeParam.current; }
	EOF;

// Rule SlangTypeParam
ruleSlangTypeParam returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_isMut_0_0=Mut
				{
					newLeafNode(lv_isMut_0_0, grammarAccess.getSlangTypeParamAccess().getIsMutMutKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSlangTypeParamRule());
					}
					setWithLastConsumed($current, "isMut", lv_isMut_0_0 != null, "mut");
				}
			)
		)?
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getSlangTypeParamAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSlangTypeParamRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.osate.xtext.aadl2.properties.Properties.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleSlangDefContract
entryRuleSlangDefContract returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlangDefContractRule()); }
	iv_ruleSlangDefContract=ruleSlangDefContract
	{ $current=$iv_ruleSlangDefContract.current; }
	EOF;

// Rule SlangDefContract
ruleSlangDefContract returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getSlangDefContractAccess().getSlangDefContractAction_0(),
					$current);
			}
		)
		(
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getSlangDefContractAccess().getReadsSlangReadsParserRuleCall_1_0_0_0());
						}
						lv_reads_1_0=ruleSlangReads
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSlangDefContractRule());
							}
							set(
								$current,
								"reads",
								lv_reads_1_0,
								"org.sireum.aadl.gumbo.Gumbo.SlangReads");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_2=Semicolon
				{
					newLeafNode(otherlv_2, grammarAccess.getSlangDefContractAccess().getSemicolonKeyword_1_0_1());
				}
			)?
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getSlangDefContractAccess().getRequiresSlangRequiresParserRuleCall_1_1_0_0());
						}
						lv_requires_3_0=ruleSlangRequires
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSlangDefContractRule());
							}
							set(
								$current,
								"requires",
								lv_requires_3_0,
								"org.sireum.aadl.gumbo.Gumbo.SlangRequires");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_4=Semicolon
				{
					newLeafNode(otherlv_4, grammarAccess.getSlangDefContractAccess().getSemicolonKeyword_1_1_1());
				}
			)?
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getSlangDefContractAccess().getModifiesSlangModifiesParserRuleCall_1_2_0_0());
						}
						lv_modifies_5_0=ruleSlangModifies
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSlangDefContractRule());
							}
							set(
								$current,
								"modifies",
								lv_modifies_5_0,
								"org.sireum.aadl.gumbo.Gumbo.SlangModifies");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_6=Semicolon
				{
					newLeafNode(otherlv_6, grammarAccess.getSlangDefContractAccess().getSemicolonKeyword_1_2_1());
				}
			)?
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getSlangDefContractAccess().getEnsuresSlangEnsuresParserRuleCall_1_3_0_0());
						}
						lv_ensures_7_0=ruleSlangEnsures
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSlangDefContractRule());
							}
							set(
								$current,
								"ensures",
								lv_ensures_7_0,
								"org.sireum.aadl.gumbo.Gumbo.SlangEnsures");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_8=Semicolon
				{
					newLeafNode(otherlv_8, grammarAccess.getSlangDefContractAccess().getSemicolonKeyword_1_3_1());
				}
			)?
		)
	)
;

// Entry rule entryRuleSlangInvariant
entryRuleSlangInvariant returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlangInvariantRule()); }
	iv_ruleSlangInvariant=ruleSlangInvariant
	{ $current=$iv_ruleSlangInvariant.current; }
	EOF;

// Rule SlangInvariant
ruleSlangInvariant returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=Invariant
		{
			newLeafNode(otherlv_0, grammarAccess.getSlangInvariantAccess().getInvariantKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSlangInvariantAccess().getExprsOwnedExpressionParserRuleCall_1_0());
				}
				lv_exprs_1_0=ruleOwnedExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangInvariantRule());
					}
					add(
						$current,
						"exprs",
						lv_exprs_1_0,
						"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2=Comma
			{
				newLeafNode(otherlv_2, grammarAccess.getSlangInvariantAccess().getCommaKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSlangInvariantAccess().getExprsOwnedExpressionParserRuleCall_2_1_0());
					}
					lv_exprs_3_0=ruleOwnedExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangInvariantRule());
						}
						add(
							$current,
							"exprs",
							lv_exprs_3_0,
							"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleSlangRequires
entryRuleSlangRequires returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlangRequiresRule()); }
	iv_ruleSlangRequires=ruleSlangRequires
	{ $current=$iv_ruleSlangRequires.current; }
	EOF;

// Rule SlangRequires
ruleSlangRequires returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=Assume
		{
			newLeafNode(otherlv_0, grammarAccess.getSlangRequiresAccess().getAssumeKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSlangRequiresAccess().getExprsOwnedExpressionParserRuleCall_1_0());
				}
				lv_exprs_1_0=ruleOwnedExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangRequiresRule());
					}
					add(
						$current,
						"exprs",
						lv_exprs_1_0,
						"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2=Comma
			{
				newLeafNode(otherlv_2, grammarAccess.getSlangRequiresAccess().getCommaKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSlangRequiresAccess().getExprsOwnedExpressionParserRuleCall_2_1_0());
					}
					lv_exprs_3_0=ruleOwnedExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangRequiresRule());
						}
						add(
							$current,
							"exprs",
							lv_exprs_3_0,
							"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleSlangReads
entryRuleSlangReads returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlangReadsRule()); }
	iv_ruleSlangReads=ruleSlangReads
	{ $current=$iv_ruleSlangReads.current; }
	EOF;

// Rule SlangReads
ruleSlangReads returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=Reads
		{
			newLeafNode(otherlv_0, grammarAccess.getSlangReadsAccess().getReadsKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSlangReadsAccess().getExprsOwnedExpressionParserRuleCall_1_0());
				}
				lv_exprs_1_0=ruleOwnedExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangReadsRule());
					}
					add(
						$current,
						"exprs",
						lv_exprs_1_0,
						"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2=Comma
			{
				newLeafNode(otherlv_2, grammarAccess.getSlangReadsAccess().getCommaKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSlangReadsAccess().getExprsOwnedExpressionParserRuleCall_2_1_0());
					}
					lv_exprs_3_0=ruleOwnedExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangReadsRule());
						}
						add(
							$current,
							"exprs",
							lv_exprs_3_0,
							"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleSlangModifies
entryRuleSlangModifies returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlangModifiesRule()); }
	iv_ruleSlangModifies=ruleSlangModifies
	{ $current=$iv_ruleSlangModifies.current; }
	EOF;

// Rule SlangModifies
ruleSlangModifies returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=Modifies
		{
			newLeafNode(otherlv_0, grammarAccess.getSlangModifiesAccess().getModifiesKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSlangModifiesAccess().getExprsOwnedExpressionParserRuleCall_1_0());
				}
				lv_exprs_1_0=ruleOwnedExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangModifiesRule());
					}
					add(
						$current,
						"exprs",
						lv_exprs_1_0,
						"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2=Comma
			{
				newLeafNode(otherlv_2, grammarAccess.getSlangModifiesAccess().getCommaKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSlangModifiesAccess().getExprsOwnedExpressionParserRuleCall_2_1_0());
					}
					lv_exprs_3_0=ruleOwnedExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangModifiesRule());
						}
						add(
							$current,
							"exprs",
							lv_exprs_3_0,
							"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleSlangEnsures
entryRuleSlangEnsures returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlangEnsuresRule()); }
	iv_ruleSlangEnsures=ruleSlangEnsures
	{ $current=$iv_ruleSlangEnsures.current; }
	EOF;

// Rule SlangEnsures
ruleSlangEnsures returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=Guarantee
		{
			newLeafNode(otherlv_0, grammarAccess.getSlangEnsuresAccess().getGuaranteeKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSlangEnsuresAccess().getExprsOwnedExpressionParserRuleCall_1_0());
				}
				lv_exprs_1_0=ruleOwnedExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangEnsuresRule());
					}
					add(
						$current,
						"exprs",
						lv_exprs_1_0,
						"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2=Comma
			{
				newLeafNode(otherlv_2, grammarAccess.getSlangEnsuresAccess().getCommaKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSlangEnsuresAccess().getExprsOwnedExpressionParserRuleCall_2_1_0());
					}
					lv_exprs_3_0=ruleOwnedExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangEnsuresRule());
						}
						add(
							$current,
							"exprs",
							lv_exprs_3_0,
							"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleSlangType
entryRuleSlangType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlangTypeRule()); }
	iv_ruleSlangType=ruleSlangType
	{ $current=$iv_ruleSlangType.current; }
	EOF;

// Rule SlangType
ruleSlangType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		/* */
	}
	{
		newCompositeNode(grammarAccess.getSlangTypeAccess().getSlangBaseTypeParserRuleCall());
	}
	this_SlangBaseType_0=ruleSlangBaseType
	{
		$current = $this_SlangBaseType_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleSlangBaseType
entryRuleSlangBaseType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlangBaseTypeRule()); }
	iv_ruleSlangBaseType=ruleSlangBaseType
	{ $current=$iv_ruleSlangBaseType.current; }
	EOF;

// Rule SlangBaseType
ruleSlangBaseType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getSlangBaseTypeRule());
				}
			}
			{
				newCompositeNode(grammarAccess.getSlangBaseTypeAccess().getTypeNameDataSubcomponentTypeCrossReference_0());
			}
			ruleQualifiedName
			{
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleSlangStmt
entryRuleSlangStmt returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlangStmtRule()); }
	iv_ruleSlangStmt=ruleSlangStmt
	{ $current=$iv_ruleSlangStmt.current; }
	EOF;

// Rule SlangStmt
ruleSlangStmt returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getSlangStmtAccess().getSlangVarDefAction_0_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getSlangStmtAccess().getDSlangVarDefParserRuleCall_0_1_0());
					}
					lv_d_1_0=ruleSlangVarDef
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangStmtRule());
						}
						set(
							$current,
							"d",
							lv_d_1_0,
							"org.sireum.aadl.gumbo.Gumbo.SlangVarDef");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getSlangStmtAccess().getSlangIfStmtAction_1_0(),
						$current);
				}
			)
			otherlv_3=If
			{
				newLeafNode(otherlv_3, grammarAccess.getSlangStmtAccess().getIfKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSlangStmtAccess().getCondOwnedExpressionParserRuleCall_1_2_0());
					}
					lv_cond_4_0=ruleOwnedExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangStmtRule());
						}
						set(
							$current,
							"cond",
							lv_cond_4_0,
							"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getSlangStmtAccess().getBSlangBlockParserRuleCall_1_3_0());
					}
					lv_b_5_0=ruleSlangBlock
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangStmtRule());
						}
						set(
							$current,
							"b",
							lv_b_5_0,
							"org.sireum.aadl.gumbo.Gumbo.SlangBlock");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getSlangStmtAccess().getESlangElseParserRuleCall_1_4_0());
					}
					lv_e_6_0=ruleSlangElse
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangStmtRule());
						}
						set(
							$current,
							"e",
							lv_e_6_0,
							"org.sireum.aadl.gumbo.Gumbo.SlangElse");
						afterParserOrEnumRuleCall();
					}
				)
			)?
		)
		    |
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getSlangStmtAccess().getSlangWhileStmtAction_2_0(),
						$current);
				}
			)
			otherlv_8=While
			{
				newLeafNode(otherlv_8, grammarAccess.getSlangStmtAccess().getWhileKeyword_2_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSlangStmtAccess().getCondOwnedExpressionParserRuleCall_2_2_0());
					}
					lv_cond_9_0=ruleOwnedExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangStmtRule());
						}
						set(
							$current,
							"cond",
							lv_cond_9_0,
							"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getSlangStmtAccess().getLSlangLoopContractParserRuleCall_2_3_0());
					}
					lv_l_10_0=ruleSlangLoopContract
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangStmtRule());
						}
						set(
							$current,
							"l",
							lv_l_10_0,
							"org.sireum.aadl.gumbo.Gumbo.SlangLoopContract");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getSlangStmtAccess().getBSlangBlockParserRuleCall_2_4_0());
					}
					lv_b_11_0=ruleSlangBlock
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangStmtRule());
						}
						set(
							$current,
							"b",
							lv_b_11_0,
							"org.sireum.aadl.gumbo.Gumbo.SlangBlock");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getSlangStmtAccess().getSlangMatchStmtAction_3_0(),
						$current);
				}
			)
			otherlv_13=Match
			{
				newLeafNode(otherlv_13, grammarAccess.getSlangStmtAccess().getMatchKeyword_3_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSlangStmtAccess().getTestExprOwnedExpressionParserRuleCall_3_2_0());
					}
					lv_testExpr_14_0=ruleOwnedExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangStmtRule());
						}
						set(
							$current,
							"testExpr",
							lv_testExpr_14_0,
							"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_15=LeftCurlyBracket
			{
				newLeafNode(otherlv_15, grammarAccess.getSlangStmtAccess().getLeftCurlyBracketKeyword_3_3());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSlangStmtAccess().getCSlangCaseParserRuleCall_3_4_0());
					}
					lv_c_16_0=ruleSlangCase
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangStmtRule());
						}
						add(
							$current,
							"c",
							lv_c_16_0,
							"org.sireum.aadl.gumbo.Gumbo.SlangCase");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_17=RightCurlyBracket
			{
				newLeafNode(otherlv_17, grammarAccess.getSlangStmtAccess().getRightCurlyBracketKeyword_3_5());
			}
		)
		    |
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getSlangStmtAccess().getSlangSpecStmtAction_4_0(),
						$current);
				}
			)
			otherlv_19=Spec
			{
				newLeafNode(otherlv_19, grammarAccess.getSlangStmtAccess().getSpecKeyword_4_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSlangStmtAccess().getBSlangBlockParserRuleCall_4_2_0());
					}
					lv_b_20_0=ruleSlangBlock
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangStmtRule());
						}
						set(
							$current,
							"b",
							lv_b_20_0,
							"org.sireum.aadl.gumbo.Gumbo.SlangBlock");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getSlangStmtAccess().getSlangAssumeStmtAction_5_0(),
						$current);
				}
			)
			otherlv_22=Assume
			{
				newLeafNode(otherlv_22, grammarAccess.getSlangStmtAccess().getAssumeKeyword_5_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSlangStmtAccess().getEOwnedExpressionParserRuleCall_5_2_0());
					}
					lv_e_23_0=ruleOwnedExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangStmtRule());
						}
						set(
							$current,
							"e",
							lv_e_23_0,
							"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				this_STRING_VALUE_24=RULE_STRING_VALUE
				{
					newLeafNode(this_STRING_VALUE_24, grammarAccess.getSlangStmtAccess().getSTRING_VALUETerminalRuleCall_5_3());
				}
			)?
		)
		    |
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getSlangStmtAccess().getSlangAssertStmtAction_6_0(),
						$current);
				}
			)
			otherlv_26=Assert
			{
				newLeafNode(otherlv_26, grammarAccess.getSlangStmtAccess().getAssertKeyword_6_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSlangStmtAccess().getEOwnedExpressionParserRuleCall_6_2_0());
					}
					lv_e_27_0=ruleOwnedExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangStmtRule());
						}
						set(
							$current,
							"e",
							lv_e_27_0,
							"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				this_STRING_VALUE_28=RULE_STRING_VALUE
				{
					newLeafNode(this_STRING_VALUE_28, grammarAccess.getSlangStmtAccess().getSTRING_VALUETerminalRuleCall_6_3());
				}
			)?
		)
		    |
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getSlangStmtAccess().getSlangHaltStmtAction_7_0(),
						$current);
				}
			)
			otherlv_30=Halt
			{
				newLeafNode(otherlv_30, grammarAccess.getSlangStmtAccess().getHaltKeyword_7_1());
			}
			(
				this_STRING_VALUE_31=RULE_STRING_VALUE
				{
					newLeafNode(this_STRING_VALUE_31, grammarAccess.getSlangStmtAccess().getSTRING_VALUETerminalRuleCall_7_2());
				}
			)?
		)
		    |
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getSlangStmtAccess().getSlangDoStmtAction_8_0(),
						$current);
				}
			)
			otherlv_33=Do
			{
				newLeafNode(otherlv_33, grammarAccess.getSlangStmtAccess().getDoKeyword_8_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSlangStmtAccess().getEOwnedExpressionParserRuleCall_8_2_0());
					}
					lv_e_34_0=ruleOwnedExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangStmtRule());
						}
						set(
							$current,
							"e",
							lv_e_34_0,
							"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleSlangElse
entryRuleSlangElse returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlangElseRule()); }
	iv_ruleSlangElse=ruleSlangElse
	{ $current=$iv_ruleSlangElse.current; }
	EOF;

// Rule SlangElse
ruleSlangElse returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=Else
		{
			newLeafNode(otherlv_0, grammarAccess.getSlangElseAccess().getElseKeyword_0());
		}
		(
			(
				otherlv_1=If
				{
					newLeafNode(otherlv_1, grammarAccess.getSlangElseAccess().getIfKeyword_1_0_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getSlangElseAccess().getCondOwnedExpressionParserRuleCall_1_0_1_0());
						}
						lv_cond_2_0=ruleOwnedExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSlangElseRule());
							}
							set(
								$current,
								"cond",
								lv_cond_2_0,
								"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					(
						{
							newCompositeNode(grammarAccess.getSlangElseAccess().getBSlangBlockParserRuleCall_1_0_2_0());
						}
						lv_b_3_0=ruleSlangBlock
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSlangElseRule());
							}
							set(
								$current,
								"b",
								lv_b_3_0,
								"org.sireum.aadl.gumbo.Gumbo.SlangBlock");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					(
						{
							newCompositeNode(grammarAccess.getSlangElseAccess().getESlangElseParserRuleCall_1_0_3_0());
						}
						lv_e_4_0=ruleSlangElse
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSlangElseRule());
							}
							set(
								$current,
								"e",
								lv_e_4_0,
								"org.sireum.aadl.gumbo.Gumbo.SlangElse");
							afterParserOrEnumRuleCall();
						}
					)
				)?
			)
			    |
			{
				/* */
			}
			{
				newCompositeNode(grammarAccess.getSlangElseAccess().getSlangBlockParserRuleCall_1_1());
			}
			this_SlangBlock_5=ruleSlangBlock
			{
				$current = $this_SlangBlock_5.current;
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleSlangLoopContract
entryRuleSlangLoopContract returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlangLoopContractRule()); }
	iv_ruleSlangLoopContract=ruleSlangLoopContract
	{ $current=$iv_ruleSlangLoopContract.current; }
	EOF;

// Rule SlangLoopContract
ruleSlangLoopContract returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getSlangLoopContractAccess().getSlangLoopContractAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getSlangLoopContractAccess().getInvSlangInvariantParserRuleCall_1_0());
				}
				lv_inv_1_0=ruleSlangInvariant
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangLoopContractRule());
					}
					set(
						$current,
						"inv",
						lv_inv_1_0,
						"org.sireum.aadl.gumbo.Gumbo.SlangInvariant");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getSlangLoopContractAccess().getModSlangModifiesParserRuleCall_2_0());
				}
				lv_mod_2_0=ruleSlangModifies
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangLoopContractRule());
					}
					set(
						$current,
						"mod",
						lv_mod_2_0,
						"org.sireum.aadl.gumbo.Gumbo.SlangModifies");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleSlangCase
entryRuleSlangCase returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlangCaseRule()); }
	iv_ruleSlangCase=ruleSlangCase
	{ $current=$iv_ruleSlangCase.current; }
	EOF;

// Rule SlangCase
ruleSlangCase returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=Case
		{
			newLeafNode(otherlv_0, grammarAccess.getSlangCaseAccess().getCaseKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSlangCaseAccess().getPatternSlangPatternParserRuleCall_1_0());
				}
				lv_pattern_1_0=ruleSlangPattern
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangCaseRule());
					}
					set(
						$current,
						"pattern",
						lv_pattern_1_0,
						"org.sireum.aadl.gumbo.Gumbo.SlangPattern");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2=If
			{
				newLeafNode(otherlv_2, grammarAccess.getSlangCaseAccess().getIfKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSlangCaseAccess().getEOwnedExpressionParserRuleCall_2_1_0());
					}
					lv_e_3_0=ruleOwnedExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangCaseRule());
						}
						set(
							$current,
							"e",
							lv_e_3_0,
							"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_4=EqualsSignGreaterThanSign
		{
			newLeafNode(otherlv_4, grammarAccess.getSlangCaseAccess().getEqualsSignGreaterThanSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSlangCaseAccess().getSSlangStmtParserRuleCall_4_0());
				}
				lv_s_5_0=ruleSlangStmt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangCaseRule());
					}
					add(
						$current,
						"s",
						lv_s_5_0,
						"org.sireum.aadl.gumbo.Gumbo.SlangStmt");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleSlangPattern
entryRuleSlangPattern returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlangPatternRule()); }
	iv_ruleSlangPattern=ruleSlangPattern
	{ $current=$iv_ruleSlangPattern.current; }
	EOF;

// Rule SlangPattern
ruleSlangPattern returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getSlangPatternAccess().getSlangPatternAction_0_0(),
						$current);
				}
			)
			this_ID_1=RULE_ID
			{
				newLeafNode(this_ID_1, grammarAccess.getSlangPatternAccess().getIDTerminalRuleCall_0_1());
			}
			(
				otherlv_2=LeftParenthesis
				{
					newLeafNode(otherlv_2, grammarAccess.getSlangPatternAccess().getLeftParenthesisKeyword_0_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getSlangPatternAccess().getPatternsSlangTPatternParserRuleCall_0_2_1_0());
						}
						lv_patterns_3_0=ruleSlangTPattern
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSlangPatternRule());
							}
							add(
								$current,
								"patterns",
								lv_patterns_3_0,
								"org.sireum.aadl.gumbo.Gumbo.SlangTPattern");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					otherlv_4=Comma
					{
						newLeafNode(otherlv_4, grammarAccess.getSlangPatternAccess().getCommaKeyword_0_2_2_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getSlangPatternAccess().getPatternsSlangTPatternParserRuleCall_0_2_2_1_0());
							}
							lv_patterns_5_0=ruleSlangTPattern
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getSlangPatternRule());
								}
								add(
									$current,
									"patterns",
									lv_patterns_5_0,
									"org.sireum.aadl.gumbo.Gumbo.SlangTPattern");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)*
				otherlv_6=RightParenthesis
				{
					newLeafNode(otherlv_6, grammarAccess.getSlangPatternAccess().getRightParenthesisKeyword_0_2_3());
				}
			)?
		)
		    |
		(
			otherlv_7=LeftParenthesis
			{
				newLeafNode(otherlv_7, grammarAccess.getSlangPatternAccess().getLeftParenthesisKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSlangPatternAccess().getPatternsSlangTPatternParserRuleCall_1_1_0());
					}
					lv_patterns_8_0=ruleSlangTPattern
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangPatternRule());
						}
						add(
							$current,
							"patterns",
							lv_patterns_8_0,
							"org.sireum.aadl.gumbo.Gumbo.SlangTPattern");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_9=Comma
				{
					newLeafNode(otherlv_9, grammarAccess.getSlangPatternAccess().getCommaKeyword_1_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getSlangPatternAccess().getPatternsSlangTPatternParserRuleCall_1_2_1_0());
						}
						lv_patterns_10_0=ruleSlangTPattern
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSlangPatternRule());
							}
							add(
								$current,
								"patterns",
								lv_patterns_10_0,
								"org.sireum.aadl.gumbo.Gumbo.SlangTPattern");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_11=RightParenthesis
			{
				newLeafNode(otherlv_11, grammarAccess.getSlangPatternAccess().getRightParenthesisKeyword_1_3());
			}
		)
	)
;

// Entry rule entryRuleSlangTPattern
entryRuleSlangTPattern returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlangTPatternRule()); }
	iv_ruleSlangTPattern=ruleSlangTPattern
	{ $current=$iv_ruleSlangTPattern.current; }
	EOF;

// Rule SlangTPattern
ruleSlangTPattern returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getSlangTPatternAccess().getSlangTPatternAction_0_0(),
						$current);
				}
			)
			this_ID_1=RULE_ID
			{
				newLeafNode(this_ID_1, grammarAccess.getSlangTPatternAccess().getIDTerminalRuleCall_0_1());
			}
			(
				(
					otherlv_2=LeftParenthesis
					{
						newLeafNode(otherlv_2, grammarAccess.getSlangTPatternAccess().getLeftParenthesisKeyword_0_2_0_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getSlangTPatternAccess().getPatternsSlangTPatternParserRuleCall_0_2_0_1_0());
							}
							lv_patterns_3_0=ruleSlangTPattern
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getSlangTPatternRule());
								}
								add(
									$current,
									"patterns",
									lv_patterns_3_0,
									"org.sireum.aadl.gumbo.Gumbo.SlangTPattern");
								afterParserOrEnumRuleCall();
							}
						)
					)
					(
						otherlv_4=Comma
						{
							newLeafNode(otherlv_4, grammarAccess.getSlangTPatternAccess().getCommaKeyword_0_2_0_2_0());
						}
						(
							(
								{
									newCompositeNode(grammarAccess.getSlangTPatternAccess().getPatternsSlangTPatternParserRuleCall_0_2_0_2_1_0());
								}
								lv_patterns_5_0=ruleSlangTPattern
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getSlangTPatternRule());
									}
									add(
										$current,
										"patterns",
										lv_patterns_5_0,
										"org.sireum.aadl.gumbo.Gumbo.SlangTPattern");
									afterParserOrEnumRuleCall();
								}
							)
						)
					)*
					otherlv_6=RightParenthesis
					{
						newLeafNode(otherlv_6, grammarAccess.getSlangTPatternAccess().getRightParenthesisKeyword_0_2_0_3());
					}
				)
				    |
				(
					otherlv_7=Colon
					{
						newLeafNode(otherlv_7, grammarAccess.getSlangTPatternAccess().getColonKeyword_0_2_1_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getSlangTPatternAccess().getTypeSlangTypeParserRuleCall_0_2_1_1_0());
							}
							lv_type_8_0=ruleSlangType
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getSlangTPatternRule());
								}
								set(
									$current,
									"type",
									lv_type_8_0,
									"org.sireum.aadl.gumbo.Gumbo.SlangType");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)
			)?
		)
		    |
		(
			otherlv_9=LeftParenthesis
			{
				newLeafNode(otherlv_9, grammarAccess.getSlangTPatternAccess().getLeftParenthesisKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSlangTPatternAccess().getPatternsSlangTPatternParserRuleCall_1_1_0());
					}
					lv_patterns_10_0=ruleSlangTPattern
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangTPatternRule());
						}
						add(
							$current,
							"patterns",
							lv_patterns_10_0,
							"org.sireum.aadl.gumbo.Gumbo.SlangTPattern");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_11=Comma
				{
					newLeafNode(otherlv_11, grammarAccess.getSlangTPatternAccess().getCommaKeyword_1_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getSlangTPatternAccess().getPatternsSlangTPatternParserRuleCall_1_2_1_0());
						}
						lv_patterns_12_0=ruleSlangTPattern
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSlangTPatternRule());
							}
							add(
								$current,
								"patterns",
								lv_patterns_12_0,
								"org.sireum.aadl.gumbo.Gumbo.SlangTPattern");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_13=RightParenthesis
			{
				newLeafNode(otherlv_13, grammarAccess.getSlangTPatternAccess().getRightParenthesisKeyword_1_3());
			}
		)
		    |
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getSlangTPatternAccess().getSlangTPatternAction_2_0(),
						$current);
				}
			)
			otherlv_15=KW__
			{
				newLeafNode(otherlv_15, grammarAccess.getSlangTPatternAccess().get_Keyword_2_1());
			}
			(
				otherlv_16=Colon
				{
					newLeafNode(otherlv_16, grammarAccess.getSlangTPatternAccess().getColonKeyword_2_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getSlangTPatternAccess().getTypeSlangTypeParserRuleCall_2_2_1_0());
						}
						lv_type_17_0=ruleSlangType
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSlangTPatternRule());
							}
							set(
								$current,
								"type",
								lv_type_17_0,
								"org.sireum.aadl.gumbo.Gumbo.SlangType");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)?
		)
	)
;

// Entry rule entryRuleSlangVarDef
entryRuleSlangVarDef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlangVarDefRule()); }
	iv_ruleSlangVarDef=ruleSlangVarDef
	{ $current=$iv_ruleSlangVarDef.current; }
	EOF;

// Rule SlangVarDef
ruleSlangVarDef returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getSlangVarDefAccess().getSlangVarModParserRuleCall_0());
		}
		ruleSlangVarMod
		{
			afterParserOrEnumRuleCall();
		}
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getSlangVarDefAccess().getSlangPatternParserRuleCall_1());
		}
		this_SlangPattern_1=ruleSlangPattern
		{
			$current = $this_SlangPattern_1.current;
			afterParserOrEnumRuleCall();
		}
		(
			otherlv_2=Colon
			{
				newLeafNode(otherlv_2, grammarAccess.getSlangVarDefAccess().getColonKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSlangVarDefAccess().getTypeNameSlangTypeParserRuleCall_2_1_0());
					}
					lv_typeName_3_0=ruleSlangType
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangVarDefRule());
						}
						set(
							$current,
							"typeName",
							lv_typeName_3_0,
							"org.sireum.aadl.gumbo.Gumbo.SlangType");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_4=ColonEqualsSign
		{
			newLeafNode(otherlv_4, grammarAccess.getSlangVarDefAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSlangVarDefAccess().getInitOwnedExpressionParserRuleCall_4_0());
				}
				lv_init_5_0=ruleOwnedExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangVarDefRule());
					}
					set(
						$current,
						"init",
						lv_init_5_0,
						"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleSlangVarMod
entryRuleSlangVarMod returns [String current=null]:
	{ newCompositeNode(grammarAccess.getSlangVarModRule()); }
	iv_ruleSlangVarMod=ruleSlangVarMod
	{ $current=$iv_ruleSlangVarMod.current.getText(); }
	EOF;

// Rule SlangVarMod
ruleSlangVarMod returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw=Val
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getSlangVarModAccess().getValKeyword_0());
		}
		    |
		kw=Var
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getSlangVarModAccess().getVarKeyword_1());
		}
	)
;

// Entry rule entryRuleSlangBlock
entryRuleSlangBlock returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlangBlockRule()); }
	iv_ruleSlangBlock=ruleSlangBlock
	{ $current=$iv_ruleSlangBlock.current; }
	EOF;

// Rule SlangBlock
ruleSlangBlock returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getSlangBlockAccess().getSlangBlockAction_0(),
					$current);
			}
		)
		otherlv_1=LeftCurlyBracket
		{
			newLeafNode(otherlv_1, grammarAccess.getSlangBlockAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSlangBlockAccess().getStmtsSlangStmtParserRuleCall_2_0());
				}
				lv_stmts_2_0=ruleSlangStmt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangBlockRule());
					}
					add(
						$current,
						"stmts",
						lv_stmts_2_0,
						"org.sireum.aadl.gumbo.Gumbo.SlangStmt");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getSlangBlockAccess().getRSlangRetParserRuleCall_3_0());
				}
				lv_r_3_0=ruleSlangRet
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangBlockRule());
					}
					set(
						$current,
						"r",
						lv_r_3_0,
						"org.sireum.aadl.gumbo.Gumbo.SlangRet");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_4=RightCurlyBracket
		{
			newLeafNode(otherlv_4, grammarAccess.getSlangBlockAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleOwnedExpression
entryRuleOwnedExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOwnedExpressionRule()); }
	iv_ruleOwnedExpression=ruleOwnedExpression
	{ $current=$iv_ruleOwnedExpression.current; }
	EOF;

// Rule OwnedExpression
ruleOwnedExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		/* */
	}
	{
		newCompositeNode(grammarAccess.getOwnedExpressionAccess().getSlangExpressionParserRuleCall());
	}
	this_SlangExpression_0=ruleSlangExpression
	{
		$current = $this_SlangExpression_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleSlangExpression
entryRuleSlangExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlangExpressionRule()); }
	iv_ruleSlangExpression=ruleSlangExpression
	{ $current=$iv_ruleSlangExpression.current; }
	EOF;

// Rule SlangExpression
ruleSlangExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getSlangExpressionAccess().getImpliesExpressionParserRuleCall_0());
		}
		this_ImpliesExpression_0=ruleImpliesExpression
		{
			$current = $this_ImpliesExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getSlangExpressionAccess().getIfElseExpAction_1_0(),
						$current);
				}
			)
			otherlv_2=If
			{
				newLeafNode(otherlv_2, grammarAccess.getSlangExpressionAccess().getIfKeyword_1_1());
			}
			otherlv_3=LeftParenthesis
			{
				newLeafNode(otherlv_3, grammarAccess.getSlangExpressionAccess().getLeftParenthesisKeyword_1_2());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSlangExpressionAccess().getIfCondImpliesExpressionParserRuleCall_1_3_0());
					}
					lv_ifCond_4_0=ruleImpliesExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangExpressionRule());
						}
						set(
							$current,
							"ifCond",
							lv_ifCond_4_0,
							"org.sireum.aadl.gumbo.Gumbo.ImpliesExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_5=RightParenthesis
			{
				newLeafNode(otherlv_5, grammarAccess.getSlangExpressionAccess().getRightParenthesisKeyword_1_4());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSlangExpressionAccess().getThenExprOwnedExpressionParserRuleCall_1_5_0());
					}
					lv_thenExpr_6_0=ruleOwnedExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangExpressionRule());
						}
						set(
							$current,
							"thenExpr",
							lv_thenExpr_6_0,
							"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_7=Else
			{
				newLeafNode(otherlv_7, grammarAccess.getSlangExpressionAccess().getElseKeyword_1_6());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSlangExpressionAccess().getElseExprOwnedExpressionParserRuleCall_1_7_0());
					}
					lv_elseExpr_8_0=ruleOwnedExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangExpressionRule());
						}
						set(
							$current,
							"elseExpr",
							lv_elseExpr_8_0,
							"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getSlangExpressionAccess().getQuantifiedExpAction_2_0(),
						$current);
				}
			)
			(
				(
					(
						lv_quantifier_10_1=All
						{
							newLeafNode(lv_quantifier_10_1, grammarAccess.getSlangExpressionAccess().getQuantifierAllKeyword_2_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getSlangExpressionRule());
							}
							setWithLastConsumed($current, "quantifier", lv_quantifier_10_1, null);
						}
						    |
						lv_quantifier_10_2=ForAll
						{
							newLeafNode(lv_quantifier_10_2, grammarAccess.getSlangExpressionAccess().getQuantifierForAllKeyword_2_1_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getSlangExpressionRule());
							}
							setWithLastConsumed($current, "quantifier", lv_quantifier_10_2, null);
						}
						    |
						lv_quantifier_10_3=Exists
						{
							newLeafNode(lv_quantifier_10_3, grammarAccess.getSlangExpressionAccess().getQuantifierExistsKeyword_2_1_0_2());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getSlangExpressionRule());
							}
							setWithLastConsumed($current, "quantifier", lv_quantifier_10_3, null);
						}
						    |
						lv_quantifier_10_4=ThereExists
						{
							newLeafNode(lv_quantifier_10_4, grammarAccess.getSlangExpressionAccess().getQuantifierThereExistsKeyword_2_1_0_3());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getSlangExpressionRule());
							}
							setWithLastConsumed($current, "quantifier", lv_quantifier_10_4, null);
						}
					)
				)
			)
			otherlv_11=LeftParenthesis
			{
				newLeafNode(otherlv_11, grammarAccess.getSlangExpressionAccess().getLeftParenthesisKeyword_2_2());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSlangExpressionAccess().getQuantRangeQuantRangeParserRuleCall_2_3_0());
					}
					lv_quantRange_12_0=ruleQuantRange
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangExpressionRule());
						}
						set(
							$current,
							"quantRange",
							lv_quantRange_12_0,
							"org.sireum.aadl.gumbo.Gumbo.QuantRange");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_13=RightParenthesis
			{
				newLeafNode(otherlv_13, grammarAccess.getSlangExpressionAccess().getRightParenthesisKeyword_2_4());
			}
			otherlv_14=LeftParenthesis
			{
				newLeafNode(otherlv_14, grammarAccess.getSlangExpressionAccess().getLeftParenthesisKeyword_2_5());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSlangExpressionAccess().getQuantParamQuantParamParserRuleCall_2_6_0());
					}
					lv_quantParam_15_0=ruleQuantParam
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangExpressionRule());
						}
						set(
							$current,
							"quantParam",
							lv_quantParam_15_0,
							"org.sireum.aadl.gumbo.Gumbo.QuantParam");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_16=EqualsSignGreaterThanSign
			{
				newLeafNode(otherlv_16, grammarAccess.getSlangExpressionAccess().getEqualsSignGreaterThanSignKeyword_2_7());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSlangExpressionAccess().getQuantifiedExprOwnedExpressionParserRuleCall_2_8_0());
					}
					lv_quantifiedExpr_17_0=ruleOwnedExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangExpressionRule());
						}
						set(
							$current,
							"quantifiedExpr",
							lv_quantifiedExpr_17_0,
							"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_18=RightParenthesis
			{
				newLeafNode(otherlv_18, grammarAccess.getSlangExpressionAccess().getRightParenthesisKeyword_2_9());
			}
		)
	)
;

// Entry rule entryRuleQuantRange
entryRuleQuantRange returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getQuantRangeRule()); }
	iv_ruleQuantRange=ruleQuantRange
	{ $current=$iv_ruleQuantRange.current; }
	EOF;

// Rule QuantRange
ruleQuantRange returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getQuantRangeAccess().getLoOwnedExpressionParserRuleCall_0_0());
				}
				lv_lo_0_0=ruleOwnedExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getQuantRangeRule());
					}
					set(
						$current,
						"lo",
						lv_lo_0_0,
						"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					lv_extent_1_1=To
					{
						newLeafNode(lv_extent_1_1, grammarAccess.getQuantRangeAccess().getExtentToKeyword_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getQuantRangeRule());
						}
						setWithLastConsumed($current, "extent", lv_extent_1_1, null);
					}
					    |
					lv_extent_1_2=Until
					{
						newLeafNode(lv_extent_1_2, grammarAccess.getQuantRangeAccess().getExtentUntilKeyword_1_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getQuantRangeRule());
						}
						setWithLastConsumed($current, "extent", lv_extent_1_2, null);
					}
				)
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getQuantRangeAccess().getHighOwnedExpressionParserRuleCall_2_0());
				}
				lv_high_2_0=ruleOwnedExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getQuantRangeRule());
					}
					set(
						$current,
						"high",
						lv_high_2_0,
						"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleQuantParam
entryRuleQuantParam returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getQuantParamRule()); }
	iv_ruleQuantParam=ruleQuantParam
	{ $current=$iv_ruleQuantParam.current; }
	EOF;

// Rule QuantParam
ruleQuantParam returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getQuantParamAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getQuantParamRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.osate.xtext.aadl2.properties.Properties.ID");
				}
			)
		)
		    |
		(
			otherlv_1=LeftParenthesis
			{
				newLeafNode(otherlv_1, grammarAccess.getQuantParamAccess().getLeftParenthesisKeyword_1_0());
			}
			(
				(
					lv_name_2_0=RULE_ID
					{
						newLeafNode(lv_name_2_0, grammarAccess.getQuantParamAccess().getNameIDTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getQuantParamRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_2_0,
							"org.osate.xtext.aadl2.properties.Properties.ID");
					}
				)
			)
			otherlv_3=Colon
			{
				newLeafNode(otherlv_3, grammarAccess.getQuantParamAccess().getColonKeyword_1_2());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getQuantParamAccess().getTypeNameSlangTypeParserRuleCall_1_3_0());
					}
					lv_typeName_4_0=ruleSlangType
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getQuantParamRule());
						}
						set(
							$current,
							"typeName",
							lv_typeName_4_0,
							"org.sireum.aadl.gumbo.Gumbo.SlangType");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_5=RightParenthesis
			{
				newLeafNode(otherlv_5, grammarAccess.getQuantParamAccess().getRightParenthesisKeyword_1_4());
			}
		)
	)
;

// Entry rule entryRuleImpliesExpression
entryRuleImpliesExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getImpliesExpressionRule()); }
	iv_ruleImpliesExpression=ruleImpliesExpression
	{ $current=$iv_ruleImpliesExpression.current; }
	EOF;

// Rule ImpliesExpression
ruleImpliesExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getImpliesExpressionAccess().getOrExpressionParserRuleCall_0());
		}
		this_OrExpression_0=ruleOrExpression
		{
			$current = $this_OrExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getImpliesExpressionAccess().getImpliesExprLeftAction_1_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getImpliesExpressionAccess().getOpImpliesOpsParserRuleCall_1_1_0());
					}
					lv_op_2_0=ruleImpliesOps
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getImpliesExpressionRule());
						}
						set(
							$current,
							"op",
							lv_op_2_0,
							"org.sireum.aadl.gumbo.Gumbo.ImpliesOps");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getImpliesExpressionAccess().getRightOrExpressionParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleOrExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getImpliesExpressionRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.sireum.aadl.gumbo.Gumbo.OrExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleOrExpression
entryRuleOrExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOrExpressionRule()); }
	iv_ruleOrExpression=ruleOrExpression
	{ $current=$iv_ruleOrExpression.current; }
	EOF;

// Rule OrExpression
ruleOrExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0());
		}
		this_AndExpression_0=ruleAndExpression
		{
			$current = $this_AndExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getOrExpressionAccess().getOrExprLeftAction_1_0(),
						$current);
				}
			)
			(
				(
					lv_op_2_0=RULE_OR_OPS
					{
						newLeafNode(lv_op_2_0, grammarAccess.getOrExpressionAccess().getOpOR_OPSTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getOrExpressionRule());
						}
						setWithLastConsumed(
							$current,
							"op",
							lv_op_2_0,
							"org.sireum.aadl.gumbo.Gumbo.OR_OPS");
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleAndExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getOrExpressionRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.sireum.aadl.gumbo.Gumbo.AndExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleAndExpression
entryRuleAndExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAndExpressionRule()); }
	iv_ruleAndExpression=ruleAndExpression
	{ $current=$iv_ruleAndExpression.current; }
	EOF;

// Rule AndExpression
ruleAndExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getAndExpressionAccess().getEqualNotExpressionParserRuleCall_0());
		}
		this_EqualNotExpression_0=ruleEqualNotExpression
		{
			$current = $this_EqualNotExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getAndExpressionAccess().getAndExprLeftAction_1_0(),
						$current);
				}
			)
			(
				(
					lv_op_2_0=RULE_AND_OPS
					{
						newLeafNode(lv_op_2_0, grammarAccess.getAndExpressionAccess().getOpAND_OPSTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAndExpressionRule());
						}
						setWithLastConsumed(
							$current,
							"op",
							lv_op_2_0,
							"org.sireum.aadl.gumbo.Gumbo.AND_OPS");
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightEqualNotExpressionParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleEqualNotExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAndExpressionRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.sireum.aadl.gumbo.Gumbo.EqualNotExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleEqualNotExpression
entryRuleEqualNotExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEqualNotExpressionRule()); }
	iv_ruleEqualNotExpression=ruleEqualNotExpression
	{ $current=$iv_ruleEqualNotExpression.current; }
	EOF;

// Rule EqualNotExpression
ruleEqualNotExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getEqualNotExpressionAccess().getLtGtExpressionParserRuleCall_0());
		}
		this_LtGtExpression_0=ruleLtGtExpression
		{
			$current = $this_LtGtExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getEqualNotExpressionAccess().getEqualNotExprLeftAction_1_0(),
						$current);
				}
			)
			(
				(
					lv_op_2_0=RULE_EQUAL_NOT_OPS
					{
						newLeafNode(lv_op_2_0, grammarAccess.getEqualNotExpressionAccess().getOpEQUAL_NOT_OPSTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEqualNotExpressionRule());
						}
						setWithLastConsumed(
							$current,
							"op",
							lv_op_2_0,
							"org.sireum.aadl.gumbo.Gumbo.EQUAL_NOT_OPS");
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getEqualNotExpressionAccess().getRightLtGtExpressionParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleLtGtExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEqualNotExpressionRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.sireum.aadl.gumbo.Gumbo.LtGtExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleLtGtExpression
entryRuleLtGtExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLtGtExpressionRule()); }
	iv_ruleLtGtExpression=ruleLtGtExpression
	{ $current=$iv_ruleLtGtExpression.current; }
	EOF;

// Rule LtGtExpression
ruleLtGtExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getLtGtExpressionAccess().getColonExpressionParserRuleCall_0());
		}
		this_ColonExpression_0=ruleColonExpression
		{
			$current = $this_ColonExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getLtGtExpressionAccess().getLtGtExprLeftAction_1_0(),
						$current);
				}
			)
			(
				(
					lv_op_2_0=RULE_LT_GT_OPS
					{
						newLeafNode(lv_op_2_0, grammarAccess.getLtGtExpressionAccess().getOpLT_GT_OPSTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getLtGtExpressionRule());
						}
						setWithLastConsumed(
							$current,
							"op",
							lv_op_2_0,
							"org.sireum.aadl.gumbo.Gumbo.LT_GT_OPS");
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getLtGtExpressionAccess().getRightColonExpressionParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleColonExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getLtGtExpressionRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.sireum.aadl.gumbo.Gumbo.ColonExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleColonExpression
entryRuleColonExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getColonExpressionRule()); }
	iv_ruleColonExpression=ruleColonExpression
	{ $current=$iv_ruleColonExpression.current; }
	EOF;

// Rule ColonExpression
ruleColonExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getColonExpressionAccess().getPlusMinusExpressionParserRuleCall_0());
		}
		this_PlusMinusExpression_0=rulePlusMinusExpression
		{
			$current = $this_PlusMinusExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getColonExpressionAccess().getColonExprLeftAction_1_0(),
						$current);
				}
			)
			(
				(
					lv_op_2_0=RULE_COLON_OP
					{
						newLeafNode(lv_op_2_0, grammarAccess.getColonExpressionAccess().getOpCOLON_OPTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getColonExpressionRule());
						}
						setWithLastConsumed(
							$current,
							"op",
							lv_op_2_0,
							"org.sireum.aadl.gumbo.Gumbo.COLON_OP");
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getColonExpressionAccess().getRightPlusMinusExpressionParserRuleCall_1_2_0());
					}
					lv_right_3_0=rulePlusMinusExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getColonExpressionRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.sireum.aadl.gumbo.Gumbo.PlusMinusExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRulePlusMinusExpression
entryRulePlusMinusExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPlusMinusExpressionRule()); }
	iv_rulePlusMinusExpression=rulePlusMinusExpression
	{ $current=$iv_rulePlusMinusExpression.current; }
	EOF;

// Rule PlusMinusExpression
rulePlusMinusExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPlusMinusExpressionAccess().getMultiplicativeExpressionParserRuleCall_0());
		}
		this_MultiplicativeExpression_0=ruleMultiplicativeExpression
		{
			$current = $this_MultiplicativeExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getPlusMinusExpressionAccess().getPlusMinusExprLeftAction_1_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getPlusMinusExpressionAccess().getOpPlusMinusOpsParserRuleCall_1_1_0());
					}
					lv_op_2_0=rulePlusMinusOps
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPlusMinusExpressionRule());
						}
						set(
							$current,
							"op",
							lv_op_2_0,
							"org.sireum.aadl.gumbo.Gumbo.PlusMinusOps");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getPlusMinusExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleMultiplicativeExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPlusMinusExpressionRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.sireum.aadl.gumbo.Gumbo.MultiplicativeExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleMultiplicativeExpression
entryRuleMultiplicativeExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); }
	iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression
	{ $current=$iv_ruleMultiplicativeExpression.current; }
	EOF;

// Rule MultiplicativeExpression
ruleMultiplicativeExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getUnaryExpressionParserRuleCall_0());
		}
		this_UnaryExpression_0=ruleUnaryExpression
		{
			$current = $this_UnaryExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExprLeftAction_1_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOpMultiplicativeOpParserRuleCall_1_1_0());
					}
					lv_op_2_0=ruleMultiplicativeOp
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
						}
						set(
							$current,
							"op",
							lv_op_2_0,
							"org.sireum.aadl.gumbo.Gumbo.MultiplicativeOp");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightUnaryExpressionParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleUnaryExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.sireum.aadl.gumbo.Gumbo.UnaryExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleUnaryExpression
entryRuleUnaryExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUnaryExpressionRule()); }
	iv_ruleUnaryExpression=ruleUnaryExpression
	{ $current=$iv_ruleUnaryExpression.current; }
	EOF;

// Rule UnaryExpression
ruleUnaryExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getUnaryExpressionAccess().getUnaryExprAction_0_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOpUnaryOpParserRuleCall_0_1_0());
					}
					lv_op_1_0=ruleUnaryOp
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
						}
						set(
							$current,
							"op",
							lv_op_1_0,
							"org.sireum.aadl.gumbo.Gumbo.UnaryOp");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getExpPrimaryExprParserRuleCall_0_2_0());
					}
					lv_exp_2_0=rulePrimaryExpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
						}
						set(
							$current,
							"exp",
							lv_exp_2_0,
							"org.sireum.aadl.gumbo.Gumbo.PrimaryExpr");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getUnaryExpressionAccess().getPrimaryExprParserRuleCall_1());
		}
		this_PrimaryExpr_3=rulePrimaryExpr
		{
			$current = $this_PrimaryExpr_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRulePrimaryExpr
entryRulePrimaryExpr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimaryExprRule()); }
	iv_rulePrimaryExpr=rulePrimaryExpr
	{ $current=$iv_rulePrimaryExpr.current; }
	EOF;

// Rule PrimaryExpr
rulePrimaryExpr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPrimaryExprAccess().getBaseExprParserRuleCall_0());
		}
		this_BaseExpr_0=ruleBaseExpr
		{
			$current = $this_BaseExpr_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getPrimaryExprAccess().getPostFixExprAction_1_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getPrimaryExprAccess().getBaseExpAccessibleBaseExprParserRuleCall_1_1_0());
					}
					lv_baseExp_2_0=ruleAccessibleBaseExpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPrimaryExprRule());
						}
						set(
							$current,
							"baseExp",
							lv_baseExp_2_0,
							"org.sireum.aadl.gumbo.Gumbo.AccessibleBaseExpr");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getPrimaryExprAccess().getPostsPostfixParserRuleCall_1_2_0());
					}
					lv_posts_3_0=rulePostfix
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPrimaryExprRule());
						}
						add(
							$current,
							"posts",
							lv_posts_3_0,
							"org.sireum.aadl.gumbo.Gumbo.Postfix");
						afterParserOrEnumRuleCall();
					}
				)
			)*
		)
	)
;

// Entry rule entryRuleBaseExpr
entryRuleBaseExpr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBaseExprRule()); }
	iv_ruleBaseExpr=ruleBaseExpr
	{ $current=$iv_ruleBaseExpr.current; }
	EOF;

// Rule BaseExpr
ruleBaseExpr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getBaseExprAccess().getSlangLitTermAction_0_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getBaseExprAccess().getLitSlangLitParserRuleCall_0_1_0());
					}
					lv_lit_1_0=ruleSlangLit
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBaseExprRule());
						}
						set(
							$current,
							"lit",
							lv_lit_1_0,
							"org.sireum.aadl.gumbo.Gumbo.SlangLit");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getBaseExprAccess().getSlangInterpTermAction_1_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getBaseExprAccess().getISlangInterpParserRuleCall_1_1_0());
					}
					lv_i_3_0=ruleSlangInterp
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBaseExprRule());
						}
						set(
							$current,
							"i",
							lv_i_3_0,
							"org.sireum.aadl.gumbo.Gumbo.SlangInterp");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			(
				(
					{
						/* */
					}
					{
						$current = forceCreateModelElement(
							grammarAccess.getBaseExprAccess().getInStateExprAction_2_0_0(),
							$current);
					}
				)
				otherlv_5=In_1
				{
					newLeafNode(otherlv_5, grammarAccess.getBaseExprAccess().getInKeyword_2_0_1());
				}
				otherlv_6=LeftParenthesis
				{
					newLeafNode(otherlv_6, grammarAccess.getBaseExprAccess().getLeftParenthesisKeyword_2_0_2());
				}
			)
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getBaseExprRule());
						}
					}
					otherlv_7=RULE_ID
					{
						newLeafNode(otherlv_7, grammarAccess.getBaseExprAccess().getStateVarStateVarDeclCrossReference_2_1_0());
					}
				)
			)
			otherlv_8=RightParenthesis
			{
				newLeafNode(otherlv_8, grammarAccess.getBaseExprAccess().getRightParenthesisKeyword_2_2());
			}
		)
		    |
		(
			(
				(
					{
						/* */
					}
					{
						$current = forceCreateModelElement(
							grammarAccess.getBaseExprAccess().getMaySendExprAction_3_0_0(),
							$current);
					}
				)
				otherlv_10=MaySend
				{
					newLeafNode(otherlv_10, grammarAccess.getBaseExprAccess().getMaySendKeyword_3_0_1());
				}
				otherlv_11=LeftParenthesis
				{
					newLeafNode(otherlv_11, grammarAccess.getBaseExprAccess().getLeftParenthesisKeyword_3_0_2());
				}
			)
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getBaseExprRule());
						}
					}
					otherlv_12=RULE_ID
					{
						newLeafNode(otherlv_12, grammarAccess.getBaseExprAccess().getEventPortPortCrossReference_3_1_0());
					}
				)
			)
			(
				otherlv_13=Comma
				{
					newLeafNode(otherlv_13, grammarAccess.getBaseExprAccess().getCommaKeyword_3_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getBaseExprAccess().getValueOwnedExpressionParserRuleCall_3_2_1_0());
						}
						lv_value_14_0=ruleOwnedExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getBaseExprRule());
							}
							set(
								$current,
								"value",
								lv_value_14_0,
								"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)?
			otherlv_15=RightParenthesis
			{
				newLeafNode(otherlv_15, grammarAccess.getBaseExprAccess().getRightParenthesisKeyword_3_3());
			}
		)
		    |
		(
			(
				(
					{
						/* */
					}
					{
						$current = forceCreateModelElement(
							grammarAccess.getBaseExprAccess().getMustSendExprAction_4_0_0(),
							$current);
					}
				)
				otherlv_17=MustSend
				{
					newLeafNode(otherlv_17, grammarAccess.getBaseExprAccess().getMustSendKeyword_4_0_1());
				}
				otherlv_18=LeftParenthesis
				{
					newLeafNode(otherlv_18, grammarAccess.getBaseExprAccess().getLeftParenthesisKeyword_4_0_2());
				}
			)
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getBaseExprRule());
						}
					}
					otherlv_19=RULE_ID
					{
						newLeafNode(otherlv_19, grammarAccess.getBaseExprAccess().getEventPortPortCrossReference_4_1_0());
					}
				)
			)
			(
				otherlv_20=Comma
				{
					newLeafNode(otherlv_20, grammarAccess.getBaseExprAccess().getCommaKeyword_4_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getBaseExprAccess().getValueOwnedExpressionParserRuleCall_4_2_1_0());
						}
						lv_value_21_0=ruleOwnedExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getBaseExprRule());
							}
							set(
								$current,
								"value",
								lv_value_21_0,
								"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)?
			otherlv_22=RightParenthesis
			{
				newLeafNode(otherlv_22, grammarAccess.getBaseExprAccess().getRightParenthesisKeyword_4_3());
			}
		)
		    |
		(
			(
				(
					{
						/* */
					}
					{
						$current = forceCreateModelElement(
							grammarAccess.getBaseExprAccess().getNoSendExprAction_5_0_0(),
							$current);
					}
				)
				otherlv_24=NoSend
				{
					newLeafNode(otherlv_24, grammarAccess.getBaseExprAccess().getNoSendKeyword_5_0_1());
				}
				otherlv_25=LeftParenthesis
				{
					newLeafNode(otherlv_25, grammarAccess.getBaseExprAccess().getLeftParenthesisKeyword_5_0_2());
				}
			)
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getBaseExprRule());
						}
					}
					otherlv_26=RULE_ID
					{
						newLeafNode(otherlv_26, grammarAccess.getBaseExprAccess().getEventPortPortCrossReference_5_1_0());
					}
				)
			)
			otherlv_27=RightParenthesis
			{
				newLeafNode(otherlv_27, grammarAccess.getBaseExprAccess().getRightParenthesisKeyword_5_2());
			}
		)
		    |
		(
			(
				(
					{
						/* */
					}
					{
						$current = forceCreateModelElement(
							grammarAccess.getBaseExprAccess().getHasEventExprAction_6_0_0(),
							$current);
					}
				)
				otherlv_29=HasEvent
				{
					newLeafNode(otherlv_29, grammarAccess.getBaseExprAccess().getHasEventKeyword_6_0_1());
				}
				otherlv_30=LeftParenthesis
				{
					newLeafNode(otherlv_30, grammarAccess.getBaseExprAccess().getLeftParenthesisKeyword_6_0_2());
				}
			)
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getBaseExprRule());
						}
					}
					otherlv_31=RULE_ID
					{
						newLeafNode(otherlv_31, grammarAccess.getBaseExprAccess().getEventPortPortCrossReference_6_1_0());
					}
				)
			)
			otherlv_32=RightParenthesis
			{
				newLeafNode(otherlv_32, grammarAccess.getBaseExprAccess().getRightParenthesisKeyword_6_2());
			}
		)
		    |
		(
			(
				(
					{
						/* */
					}
					{
						$current = forceCreateModelElement(
							grammarAccess.getBaseExprAccess().getEnumLitExprAction_7_0_0(),
							$current);
					}
				)
				(
					(
						{
							/* */
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getBaseExprRule());
							}
						}
						{
							newCompositeNode(grammarAccess.getBaseExprAccess().getEnumTypeDataClassifierCrossReference_7_0_1_0());
						}
						ruleQCLREF
						{
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_35=FullStop
				{
					newLeafNode(otherlv_35, grammarAccess.getBaseExprAccess().getFullStopKeyword_7_0_2());
				}
			)
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getBaseExprRule());
						}
					}
					otherlv_36=RULE_ID
					{
						newLeafNode(otherlv_36, grammarAccess.getBaseExprAccess().getValueStringLiteralCrossReference_7_1_0());
					}
				)
			)
		)
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getBaseExprAccess().getFloatObjectExprParserRuleCall_8());
		}
		this_FloatObjectExpr_37=ruleFloatObjectExpr
		{
			$current = $this_FloatObjectExpr_37.current;
			afterParserOrEnumRuleCall();
		}
		    |
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getBaseExprAccess().getParenExprAction_9_0(),
						$current);
				}
			)
			otherlv_39=LeftParenthesis
			{
				newLeafNode(otherlv_39, grammarAccess.getBaseExprAccess().getLeftParenthesisKeyword_9_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getBaseExprAccess().getExpOwnedExpressionParserRuleCall_9_2_0());
					}
					lv_exp_40_0=ruleOwnedExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBaseExprRule());
						}
						set(
							$current,
							"exp",
							lv_exp_40_0,
							"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_41=RightParenthesis
			{
				newLeafNode(otherlv_41, grammarAccess.getBaseExprAccess().getRightParenthesisKeyword_9_3());
			}
		)
		    |
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getBaseExprAccess().getSlangForTermAction_10_0(),
						$current);
				}
			)
			otherlv_43=For
			{
				newLeafNode(otherlv_43, grammarAccess.getBaseExprAccess().getForKeyword_10_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getBaseExprAccess().getRSlangForRangeParserRuleCall_10_2_0());
					}
					lv_r_44_0=ruleSlangForRange
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBaseExprRule());
						}
						add(
							$current,
							"r",
							lv_r_44_0,
							"org.sireum.aadl.gumbo.Gumbo.SlangForRange");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_45=Comma
				{
					newLeafNode(otherlv_45, grammarAccess.getBaseExprAccess().getCommaKeyword_10_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getBaseExprAccess().getRSlangForRangeParserRuleCall_10_3_1_0());
						}
						lv_r_46_0=ruleSlangForRange
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getBaseExprRule());
							}
							add(
								$current,
								"r",
								lv_r_46_0,
								"org.sireum.aadl.gumbo.Gumbo.SlangForRange");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_47=Yield
			{
				newLeafNode(otherlv_47, grammarAccess.getBaseExprAccess().getYieldKeyword_10_4());
			}
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getBaseExprAccess().getBSlangBlockParserRuleCall_10_5_0_0());
						}
						lv_b_48_0=ruleSlangBlock
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getBaseExprRule());
							}
							set(
								$current,
								"b",
								lv_b_48_0,
								"org.sireum.aadl.gumbo.Gumbo.SlangBlock");
							afterParserOrEnumRuleCall();
						}
					)
				)
				    |
				(
					otherlv_49=LeftParenthesis
					{
						newLeafNode(otherlv_49, grammarAccess.getBaseExprAccess().getLeftParenthesisKeyword_10_5_1_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getBaseExprAccess().getEOwnedExpressionParserRuleCall_10_5_1_1_0());
							}
							lv_e_50_0=ruleOwnedExpression
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getBaseExprRule());
								}
								set(
									$current,
									"e",
									lv_e_50_0,
									"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
								afterParserOrEnumRuleCall();
							}
						)
					)
					otherlv_51=RightParenthesis
					{
						newLeafNode(otherlv_51, grammarAccess.getBaseExprAccess().getRightParenthesisKeyword_10_5_1_2());
					}
				)
			)
		)
		    |
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getBaseExprAccess().getSlangBlockTermAction_11_0(),
						$current);
				}
			)
			otherlv_53=LeftCurlyBracket
			{
				newLeafNode(otherlv_53, grammarAccess.getBaseExprAccess().getLeftCurlyBracketKeyword_11_1());
			}
			(
				(
					(
						(
							(
								{
									newCompositeNode(grammarAccess.getBaseExprAccess().getPSlangParamsParserRuleCall_11_2_0_0_0_0());
								}
								lv_p_54_0=ruleSlangParams
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getBaseExprRule());
									}
									set(
										$current,
										"p",
										lv_p_54_0,
										"org.sireum.aadl.gumbo.Gumbo.SlangParams");
									afterParserOrEnumRuleCall();
								}
							)
						)
						otherlv_55=EqualsSignGreaterThanSign
						{
							newLeafNode(otherlv_55, grammarAccess.getBaseExprAccess().getEqualsSignGreaterThanSignKeyword_11_2_0_0_1());
						}
					)?
					(
						(
							{
								newCompositeNode(grammarAccess.getBaseExprAccess().getEOwnedExpressionParserRuleCall_11_2_0_1_0());
							}
							lv_e_56_0=ruleOwnedExpression
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getBaseExprRule());
								}
								set(
									$current,
									"e",
									lv_e_56_0,
									"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
								afterParserOrEnumRuleCall();
							}
						)
					)
					otherlv_57=RightCurlyBracket
					{
						newLeafNode(otherlv_57, grammarAccess.getBaseExprAccess().getRightCurlyBracketKeyword_11_2_0_2());
					}
				)
				    |
				(
					(
						(
							{
								newCompositeNode(grammarAccess.getBaseExprAccess().getStmtSlangStmtParserRuleCall_11_2_1_0_0());
							}
							lv_stmt_58_0=ruleSlangStmt
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getBaseExprRule());
								}
								add(
									$current,
									"stmt",
									lv_stmt_58_0,
									"org.sireum.aadl.gumbo.Gumbo.SlangStmt");
								afterParserOrEnumRuleCall();
							}
						)
					)*
					(
						(
							{
								newCompositeNode(grammarAccess.getBaseExprAccess().getRSlangRetParserRuleCall_11_2_1_1_0());
							}
							lv_r_59_0=ruleSlangRet
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getBaseExprRule());
								}
								set(
									$current,
									"r",
									lv_r_59_0,
									"org.sireum.aadl.gumbo.Gumbo.SlangRet");
								afterParserOrEnumRuleCall();
							}
						)
					)?
					otherlv_60=RightCurlyBracket
					{
						newLeafNode(otherlv_60, grammarAccess.getBaseExprAccess().getRightCurlyBracketKeyword_11_2_1_2());
					}
				)
			)
		)
	)
;

// Entry rule entryRuleFloatObjectExpr
entryRuleFloatObjectExpr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFloatObjectExprRule()); }
	iv_ruleFloatObjectExpr=ruleFloatObjectExpr
	{ $current=$iv_ruleFloatObjectExpr.current; }
	EOF;

// Rule FloatObjectExpr
ruleFloatObjectExpr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getFloatObjectExprAccess().getF32ObjAction_0_0(),
						$current);
				}
			)
			otherlv_1=F32
			{
				newLeafNode(otherlv_1, grammarAccess.getFloatObjectExprAccess().getF32Keyword_0_1());
			}
			otherlv_2=FullStop
			{
				newLeafNode(otherlv_2, grammarAccess.getFloatObjectExprAccess().getFullStopKeyword_0_2());
			}
			(
				(
					lv_attr_3_0=RULE_ID
					{
						newLeafNode(lv_attr_3_0, grammarAccess.getFloatObjectExprAccess().getAttrIDTerminalRuleCall_0_3_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getFloatObjectExprRule());
						}
						setWithLastConsumed(
							$current,
							"attr",
							lv_attr_3_0,
							"org.osate.xtext.aadl2.properties.Properties.ID");
					}
				)
			)
		)
		    |
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getFloatObjectExprAccess().getF64ObjAction_1_0(),
						$current);
				}
			)
			otherlv_5=F64
			{
				newLeafNode(otherlv_5, grammarAccess.getFloatObjectExprAccess().getF64Keyword_1_1());
			}
			otherlv_6=FullStop
			{
				newLeafNode(otherlv_6, grammarAccess.getFloatObjectExprAccess().getFullStopKeyword_1_2());
			}
			(
				(
					lv_attr_7_0=RULE_ID
					{
						newLeafNode(lv_attr_7_0, grammarAccess.getFloatObjectExprAccess().getAttrIDTerminalRuleCall_1_3_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getFloatObjectExprRule());
						}
						setWithLastConsumed(
							$current,
							"attr",
							lv_attr_7_0,
							"org.osate.xtext.aadl2.properties.Properties.ID");
					}
				)
			)
		)
	)
;

// Entry rule entryRuleAccessibleBaseExpr
entryRuleAccessibleBaseExpr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAccessibleBaseExprRule()); }
	iv_ruleAccessibleBaseExpr=ruleAccessibleBaseExpr
	{ $current=$iv_ruleAccessibleBaseExpr.current; }
	EOF;

// Rule AccessibleBaseExpr
ruleAccessibleBaseExpr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getAccessibleBaseExprAccess().getCallExprAction_0_0(),
						$current);
				}
			)
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAccessibleBaseExprRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getAccessibleBaseExprAccess().getIdEObjectCrossReference_0_1_0());
					}
					ruleQualifiedAADLName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getAccessibleBaseExprAccess().getCallSuffixSlangCallSuffixParserRuleCall_0_2_0());
					}
					lv_callSuffix_2_0=ruleSlangCallSuffix
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAccessibleBaseExprRule());
						}
						set(
							$current,
							"callSuffix",
							lv_callSuffix_2_0,
							"org.sireum.aadl.gumbo.Gumbo.SlangCallSuffix");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			(
				(
					{
						/* */
					}
					{
						$current = forceCreateModelElement(
							grammarAccess.getAccessibleBaseExprAccess().getRecordLitExprAction_1_0_0(),
							$current);
					}
				)
				(
					(
						{
							newCompositeNode(grammarAccess.getAccessibleBaseExprAccess().getRecordTypeDataElementParserRuleCall_1_0_1_0());
						}
						lv_recordType_4_0=ruleDataElement
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getAccessibleBaseExprRule());
							}
							set(
								$current,
								"recordType",
								lv_recordType_4_0,
								"org.sireum.aadl.gumbo.Gumbo.DataElement");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_5=LeftCurlyBracket
				{
					newLeafNode(otherlv_5, grammarAccess.getAccessibleBaseExprAccess().getLeftCurlyBracketKeyword_1_0_2());
				}
				(
					(
						{
							/* */
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getAccessibleBaseExprRule());
							}
						}
						otherlv_6=RULE_ID
						{
							newLeafNode(otherlv_6, grammarAccess.getAccessibleBaseExprAccess().getArgsNamedElementCrossReference_1_0_3_0());
						}
					)
				)
				otherlv_7=EqualsSign
				{
					newLeafNode(otherlv_7, grammarAccess.getAccessibleBaseExprAccess().getEqualsSignKeyword_1_0_4());
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getAccessibleBaseExprAccess().getArgExprOwnedExpressionParserRuleCall_1_1_0());
					}
					lv_argExpr_8_0=ruleOwnedExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAccessibleBaseExprRule());
						}
						add(
							$current,
							"argExpr",
							lv_argExpr_8_0,
							"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_9=Semicolon
				{
					newLeafNode(otherlv_9, grammarAccess.getAccessibleBaseExprAccess().getSemicolonKeyword_1_2_0());
				}
				(
					(
						{
							/* */
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getAccessibleBaseExprRule());
							}
						}
						otherlv_10=RULE_ID
						{
							newLeafNode(otherlv_10, grammarAccess.getAccessibleBaseExprAccess().getArgsNamedElementCrossReference_1_2_1_0());
						}
					)
				)
				otherlv_11=EqualsSign
				{
					newLeafNode(otherlv_11, grammarAccess.getAccessibleBaseExprAccess().getEqualsSignKeyword_1_2_2());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getAccessibleBaseExprAccess().getArgExprOwnedExpressionParserRuleCall_1_2_3_0());
						}
						lv_argExpr_12_0=ruleOwnedExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getAccessibleBaseExprRule());
							}
							add(
								$current,
								"argExpr",
								lv_argExpr_12_0,
								"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_13=RightCurlyBracket
			{
				newLeafNode(otherlv_13, grammarAccess.getAccessibleBaseExprAccess().getRightCurlyBracketKeyword_1_3());
			}
		)
		    |
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getAccessibleBaseExprAccess().getDataRefExprAction_2_0(),
						$current);
				}
			)
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAccessibleBaseExprRule());
						}
					}
					otherlv_15=RULE_ID
					{
						newLeafNode(otherlv_15, grammarAccess.getAccessibleBaseExprAccess().getPortOrSubcomponentOrStateVarEObjectCrossReference_2_1_0());
					}
				)
			)
		)
		    |
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getAccessibleBaseExprAccess().getResultExprAction_3_0(),
						$current);
				}
			)
			otherlv_17=Res
			{
				newLeafNode(otherlv_17, grammarAccess.getAccessibleBaseExprAccess().getResKeyword_3_1());
			}
		)
	)
;

// Entry rule entryRuleQualifiedAADLName
entryRuleQualifiedAADLName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifiedAADLNameRule()); }
	iv_ruleQualifiedAADLName=ruleQualifiedAADLName
	{ $current=$iv_ruleQualifiedAADLName.current.getText(); }
	EOF;

// Rule QualifiedAADLName
ruleQualifiedAADLName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getQualifiedAADLNameAccess().getIDTerminalRuleCall_0());
		}
		(
			kw=ColonColon
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifiedAADLNameAccess().getColonColonKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getQualifiedAADLNameAccess().getIDTerminalRuleCall_1_1());
			}
		)+
		(
			kw=FullStop
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifiedAADLNameAccess().getFullStopKeyword_2_0());
			}
			this_ID_4=RULE_ID
			{
				$current.merge(this_ID_4);
			}
			{
				newLeafNode(this_ID_4, grammarAccess.getQualifiedAADLNameAccess().getIDTerminalRuleCall_2_1());
			}
		)?
	)
;

// Entry rule entryRulePostfix
entryRulePostfix returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPostfixRule()); }
	iv_rulePostfix=rulePostfix
	{ $current=$iv_rulePostfix.current; }
	EOF;

// Rule Postfix
rulePostfix returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPostfixAccess().getMemberAccessParserRuleCall_0());
		}
		this_MemberAccess_0=ruleMemberAccess
		{
			$current = $this_MemberAccess_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPostfixAccess().getArrayAccessParserRuleCall_1());
		}
		this_ArrayAccess_1=ruleArrayAccess
		{
			$current = $this_ArrayAccess_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleMemberAccess
entryRuleMemberAccess returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMemberAccessRule()); }
	iv_ruleMemberAccess=ruleMemberAccess
	{ $current=$iv_ruleMemberAccess.current; }
	EOF;

// Rule MemberAccess
ruleMemberAccess returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=FullStop
		{
			newLeafNode(otherlv_0, grammarAccess.getMemberAccessAccess().getFullStopKeyword_0());
		}
		(
			(
				lv_field_1_0=RULE_ID
				{
					newLeafNode(lv_field_1_0, grammarAccess.getMemberAccessAccess().getFieldIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMemberAccessRule());
					}
					setWithLastConsumed(
						$current,
						"field",
						lv_field_1_0,
						"org.osate.xtext.aadl2.properties.Properties.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleArrayAccess
entryRuleArrayAccess returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getArrayAccessRule()); }
	iv_ruleArrayAccess=ruleArrayAccess
	{ $current=$iv_ruleArrayAccess.current; }
	EOF;

// Rule ArrayAccess
ruleArrayAccess returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getArrayAccessAccess().getArrayAccessAction_0(),
					$current);
			}
		)
		otherlv_1=LeftParenthesis
		{
			newLeafNode(otherlv_1, grammarAccess.getArrayAccessAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getArrayAccessAccess().getIndexOwnedExpressionParserRuleCall_2_0_0());
					}
					lv_index_2_0=ruleOwnedExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getArrayAccessRule());
						}
						add(
							$current,
							"index",
							lv_index_2_0,
							"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_3=Comma
				{
					newLeafNode(otherlv_3, grammarAccess.getArrayAccessAccess().getCommaKeyword_2_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getArrayAccessAccess().getIndexOwnedExpressionParserRuleCall_2_1_1_0());
						}
						lv_index_4_0=ruleOwnedExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getArrayAccessRule());
							}
							add(
								$current,
								"index",
								lv_index_4_0,
								"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_5=RightParenthesis
		{
			newLeafNode(otherlv_5, grammarAccess.getArrayAccessAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleOtherDataRef
entryRuleOtherDataRef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOtherDataRefRule()); }
	iv_ruleOtherDataRef=ruleOtherDataRef
	{ $current=$iv_ruleOtherDataRef.current; }
	EOF;

// Rule OtherDataRef
ruleOtherDataRef returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getOtherDataRefRule());
						}
					}
					otherlv_0=RULE_ID
					{
						newLeafNode(otherlv_0, grammarAccess.getOtherDataRefAccess().getNamedElementNamedElementCrossReference_0_0_0());
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getOtherDataRefAccess().getArrayRangeArrayRangeParserRuleCall_0_1_0());
					}
					lv_arrayRange_1_0=ruleArrayRange
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getOtherDataRefRule());
						}
						add(
							$current,
							"arrayRange",
							lv_arrayRange_1_0,
							"org.osate.xtext.aadl2.properties.Properties.ArrayRange");
						afterParserOrEnumRuleCall();
					}
				)
			)*
		)
		(
			otherlv_2=FullStop
			{
				newLeafNode(otherlv_2, grammarAccess.getOtherDataRefAccess().getFullStopKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getOtherDataRefAccess().getPathOtherDataRefParserRuleCall_1_1_0());
					}
					lv_path_3_0=ruleOtherDataRef
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getOtherDataRefRule());
						}
						set(
							$current,
							"path",
							lv_path_3_0,
							"org.sireum.aadl.gumbo.Gumbo.OtherDataRef");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleSlangParams
entryRuleSlangParams returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlangParamsRule()); }
	iv_ruleSlangParams=ruleSlangParams
	{ $current=$iv_ruleSlangParams.current; }
	EOF;

// Rule SlangParams
ruleSlangParams returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=LeftParenthesis
		{
			newLeafNode(otherlv_0, grammarAccess.getSlangParamsAccess().getLeftParenthesisKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSlangParamsAccess().getParamsSlangParamParserRuleCall_1_0());
				}
				lv_params_1_0=ruleSlangParam
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangParamsRule());
					}
					add(
						$current,
						"params",
						lv_params_1_0,
						"org.sireum.aadl.gumbo.Gumbo.SlangParam");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2=Comma
			{
				newLeafNode(otherlv_2, grammarAccess.getSlangParamsAccess().getCommaKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSlangParamsAccess().getParamsSlangParamParserRuleCall_2_1_0());
					}
					lv_params_3_0=ruleSlangParam
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangParamsRule());
						}
						add(
							$current,
							"params",
							lv_params_3_0,
							"org.sireum.aadl.gumbo.Gumbo.SlangParam");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_4=RightParenthesis
		{
			newLeafNode(otherlv_4, grammarAccess.getSlangParamsAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleSlangParam
entryRuleSlangParam returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlangParamRule()); }
	iv_ruleSlangParam=ruleSlangParam
	{ $current=$iv_ruleSlangParam.current; }
	EOF;

// Rule SlangParam
ruleSlangParam returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0=Var
			{
				newLeafNode(otherlv_0, grammarAccess.getSlangParamAccess().getVarKeyword_0());
			}
		)?
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getSlangParamAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSlangParamRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.osate.xtext.aadl2.properties.Properties.ID");
				}
			)
		)
		otherlv_2=Colon
		{
			newLeafNode(otherlv_2, grammarAccess.getSlangParamAccess().getColonKeyword_2());
		}
		(
			otherlv_3=EqualsSignGreaterThanSign
			{
				newLeafNode(otherlv_3, grammarAccess.getSlangParamAccess().getEqualsSignGreaterThanSignKeyword_3());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getSlangParamAccess().getTypeNameSlangTypeParserRuleCall_4_0());
				}
				lv_typeName_4_0=ruleSlangType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangParamRule());
					}
					set(
						$current,
						"typeName",
						lv_typeName_4_0,
						"org.sireum.aadl.gumbo.Gumbo.SlangType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5=Asterisk
			{
				newLeafNode(otherlv_5, grammarAccess.getSlangParamAccess().getAsteriskKeyword_5());
			}
		)?
	)
;

// Entry rule entryRuleSlangForRange
entryRuleSlangForRange returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlangForRangeRule()); }
	iv_ruleSlangForRange=ruleSlangForRange
	{ $current=$iv_ruleSlangForRange.current; }
	EOF;

// Rule SlangForRange
ruleSlangForRange returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			newLeafNode(this_ID_0, grammarAccess.getSlangForRangeAccess().getIDTerminalRuleCall_0());
		}
		otherlv_1=Colon
		{
			newLeafNode(otherlv_1, grammarAccess.getSlangForRangeAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSlangForRangeAccess().getEOwnedExpressionParserRuleCall_2_0());
				}
				lv_e_2_0=ruleOwnedExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangForRangeRule());
					}
					set(
						$current,
						"e",
						lv_e_2_0,
						"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				otherlv_3=FullStopFullStop
				{
					newLeafNode(otherlv_3, grammarAccess.getSlangForRangeAccess().getFullStopFullStopKeyword_3_0_0());
				}
				    |
				otherlv_4=FullStopFullStopLessThanSign
				{
					newLeafNode(otherlv_4, grammarAccess.getSlangForRangeAccess().getFullStopFullStopLessThanSignKeyword_3_0_1());
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getSlangForRangeAccess().getUpperOwnedExpressionParserRuleCall_3_1_0());
					}
					lv_upper_5_0=ruleOwnedExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangForRangeRule());
						}
						set(
							$current,
							"upper",
							lv_upper_5_0,
							"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_6=By
				{
					newLeafNode(otherlv_6, grammarAccess.getSlangForRangeAccess().getByKeyword_3_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getSlangForRangeAccess().getStepOwnedExpressionParserRuleCall_3_2_1_0());
						}
						lv_step_7_0=ruleOwnedExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSlangForRangeRule());
							}
							set(
								$current,
								"step",
								lv_step_7_0,
								"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)?
		)?
	)
;

// Entry rule entryRuleSlangRet
entryRuleSlangRet returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlangRetRule()); }
	iv_ruleSlangRet=ruleSlangRet
	{ $current=$iv_ruleSlangRet.current; }
	EOF;

// Rule SlangRet
ruleSlangRet returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getSlangRetAccess().getSlangRetAction_0(),
					$current);
			}
		)
		otherlv_1=Return
		{
			newLeafNode(otherlv_1, grammarAccess.getSlangRetAccess().getReturnKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSlangRetAccess().getEOwnedExpressionParserRuleCall_2_0());
				}
				lv_e_2_0=ruleOwnedExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangRetRule());
					}
					set(
						$current,
						"e",
						lv_e_2_0,
						"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleSlangCallSuffix
entryRuleSlangCallSuffix returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlangCallSuffixRule()); }
	iv_ruleSlangCallSuffix=ruleSlangCallSuffix
	{ $current=$iv_ruleSlangCallSuffix.current; }
	EOF;

// Rule SlangCallSuffix
ruleSlangCallSuffix returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getSlangCallSuffixAccess().getSlangCallSuffixAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getSlangCallSuffixAccess().getCaSlangCallArgsParserRuleCall_1_0());
				}
				lv_ca_1_0=ruleSlangCallArgs
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangCallSuffixRule());
					}
					set(
						$current,
						"ca",
						lv_ca_1_0,
						"org.sireum.aadl.gumbo.Gumbo.SlangCallArgs");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleSlangCallArgs
entryRuleSlangCallArgs returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlangCallArgsRule()); }
	iv_ruleSlangCallArgs=ruleSlangCallArgs
	{ $current=$iv_ruleSlangCallArgs.current; }
	EOF;

// Rule SlangCallArgs
ruleSlangCallArgs returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getSlangCallArgsAccess().getSlangCallArgsAction_0(),
					$current);
			}
		)
		otherlv_1=LeftParenthesis
		{
			newLeafNode(otherlv_1, grammarAccess.getSlangCallArgsAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getSlangCallArgsAccess().getArgOwnedExpressionParserRuleCall_2_0_0());
					}
					lv_arg_2_0=ruleOwnedExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangCallArgsRule());
						}
						add(
							$current,
							"arg",
							lv_arg_2_0,
							"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_3=Comma
				{
					newLeafNode(otherlv_3, grammarAccess.getSlangCallArgsAccess().getCommaKeyword_2_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getSlangCallArgsAccess().getArgOwnedExpressionParserRuleCall_2_1_1_0());
						}
						lv_arg_4_0=ruleOwnedExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSlangCallArgsRule());
							}
							add(
								$current,
								"arg",
								lv_arg_4_0,
								"org.sireum.aadl.gumbo.Gumbo.OwnedExpression");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_5=RightParenthesis
		{
			newLeafNode(otherlv_5, grammarAccess.getSlangCallArgsAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleSlangLit
entryRuleSlangLit returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlangLitRule()); }
	iv_ruleSlangLit=ruleSlangLit
	{ $current=$iv_ruleSlangLit.current; }
	EOF;

// Rule SlangLit
ruleSlangLit returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getSlangLitAccess().getBooleanLitAction_0_0(),
						$current);
				}
			)
			(
				(
					(
						lv_value_1_1=T
						{
							newLeafNode(lv_value_1_1, grammarAccess.getSlangLitAccess().getValueTKeyword_0_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getSlangLitRule());
							}
							setWithLastConsumed($current, "value", lv_value_1_1, null);
						}
						    |
						lv_value_1_2=F
						{
							newLeafNode(lv_value_1_2, grammarAccess.getSlangLitAccess().getValueFKeyword_0_1_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getSlangLitRule());
							}
							setWithLastConsumed($current, "value", lv_value_1_2, null);
						}
						    |
						lv_value_1_3=True
						{
							newLeafNode(lv_value_1_3, grammarAccess.getSlangLitAccess().getValueTrueKeyword_0_1_0_2());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getSlangLitRule());
							}
							setWithLastConsumed($current, "value", lv_value_1_3, null);
						}
						    |
						lv_value_1_4=False
						{
							newLeafNode(lv_value_1_4, grammarAccess.getSlangLitAccess().getValueFalseKeyword_0_1_0_3());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getSlangLitRule());
							}
							setWithLastConsumed($current, "value", lv_value_1_4, null);
						}
					)
				)
			)
		)
		    |
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getSlangLitAccess().getIntegerLitAction_1_0(),
						$current);
				}
			)
			(
				(
					lv_value_3_0=RULE_INTEGER_LIT
					{
						newLeafNode(lv_value_3_0, grammarAccess.getSlangLitAccess().getValueINTEGER_LITTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSlangLitRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_3_0,
							"org.osate.xtext.aadl2.properties.Properties.INTEGER_LIT");
					}
				)
			)
		)
		    |
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getSlangLitAccess().getHexLitAction_2_0(),
						$current);
				}
			)
			(
				(
					lv_value_5_0=RULE_HEX
					{
						newLeafNode(lv_value_5_0, grammarAccess.getSlangLitAccess().getValueHEXTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSlangLitRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_5_0,
							"org.sireum.aadl.gumbo.Gumbo.HEX");
					}
				)
			)
		)
		    |
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getSlangLitAccess().getBinLitAction_3_0(),
						$current);
				}
			)
			(
				(
					lv_value_7_0=RULE_BIN
					{
						newLeafNode(lv_value_7_0, grammarAccess.getSlangLitAccess().getValueBINTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSlangLitRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_7_0,
							"org.sireum.aadl.gumbo.Gumbo.BIN");
					}
				)
			)
		)
		    |
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getSlangLitAccess().getF32LitAction_4_0(),
						$current);
				}
			)
			(
				(
					lv_value_9_0=RULE_F32_LIT
					{
						newLeafNode(lv_value_9_0, grammarAccess.getSlangLitAccess().getValueF32_LITTerminalRuleCall_4_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSlangLitRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_9_0,
							"org.sireum.aadl.gumbo.Gumbo.F32_LIT");
					}
				)
			)
		)
		    |
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getSlangLitAccess().getF64LitAction_5_0(),
						$current);
				}
			)
			(
				(
					(
						lv_value_11_1=RULE_F64_LIT
						{
							newLeafNode(lv_value_11_1, grammarAccess.getSlangLitAccess().getValueF64_LITTerminalRuleCall_5_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getSlangLitRule());
							}
							setWithLastConsumed(
								$current,
								"value",
								lv_value_11_1,
								"org.sireum.aadl.gumbo.Gumbo.F64_LIT");
						}
						    |
						lv_value_11_2=RULE_REAL_LIT
						{
							newLeafNode(lv_value_11_2, grammarAccess.getSlangLitAccess().getValueREAL_LITTerminalRuleCall_5_1_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getSlangLitRule());
							}
							setWithLastConsumed(
								$current,
								"value",
								lv_value_11_2,
								"org.osate.xtext.aadl2.properties.Properties.REAL_LIT");
						}
					)
				)
			)
		)
		    |
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getSlangLitAccess().getSlangStringLitAction_6_0(),
						$current);
				}
			)
			(
				(
					lv_value_13_0=RULE_STRING_VALUE
					{
						newLeafNode(lv_value_13_0, grammarAccess.getSlangLitAccess().getValueSTRING_VALUETerminalRuleCall_6_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSlangLitRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_13_0,
							"org.sireum.aadl.gumbo.Gumbo.STRING_VALUE");
					}
				)
			)
		)
	)
;

// Entry rule entryRuleSlangInterp
entryRuleSlangInterp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlangInterpRule()); }
	iv_ruleSlangInterp=ruleSlangInterp
	{ $current=$iv_ruleSlangInterp.current; }
	EOF;

// Rule SlangInterp
ruleSlangInterp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getSlangInterpAccess().getSlangLiteralInterpAction_0(),
					$current);
			}
		)
		(
			(
				lv_sli_1_0=RULE_SLI
				{
					newLeafNode(lv_sli_1_0, grammarAccess.getSlangInterpAccess().getSliSLITerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSlangInterpRule());
					}
					setWithLastConsumed(
						$current,
						"sli",
						lv_sli_1_0,
						"org.sireum.aadl.gumbo.Gumbo.SLI");
				}
			)
		)
	)
;

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); }
	iv_ruleQualifiedName=ruleQualifiedName
	{ $current=$iv_ruleQualifiedName.current.getText(); }
	EOF;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getQualifiedNameAccess().getQCREFParserRuleCall());
	}
	this_QCREF_0=ruleQCREF
	{
		$current.merge(this_QCREF_0);
	}
	{
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleUnaryOp
entryRuleUnaryOp returns [String current=null]:
	{ newCompositeNode(grammarAccess.getUnaryOpRule()); }
	iv_ruleUnaryOp=ruleUnaryOp
	{ $current=$iv_ruleUnaryOp.current.getText(); }
	EOF;

// Rule UnaryOp
ruleUnaryOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getUnaryOpAccess().getPlusMinusParserRuleCall_0());
		}
		this_PlusMinus_0=rulePlusMinus
		{
			$current.merge(this_PlusMinus_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		this_NOT_1=RULE_NOT
		{
			$current.merge(this_NOT_1);
		}
		{
			newLeafNode(this_NOT_1, grammarAccess.getUnaryOpAccess().getNOTTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleMultiplicativeOp
entryRuleMultiplicativeOp returns [String current=null]:
	{ newCompositeNode(grammarAccess.getMultiplicativeOpRule()); }
	iv_ruleMultiplicativeOp=ruleMultiplicativeOp
	{ $current=$iv_ruleMultiplicativeOp.current.getText(); }
	EOF;

// Rule MultiplicativeOp
ruleMultiplicativeOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getMultiplicativeOpAccess().getSTARParserRuleCall_0());
		}
		this_STAR_0=ruleSTAR
		{
			$current.merge(this_STAR_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		this_MULTIPLICATIVE_OP_1=RULE_MULTIPLICATIVE_OP
		{
			$current.merge(this_MULTIPLICATIVE_OP_1);
		}
		{
			newLeafNode(this_MULTIPLICATIVE_OP_1, grammarAccess.getMultiplicativeOpAccess().getMULTIPLICATIVE_OPTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRulePlusMinusOps
entryRulePlusMinusOps returns [String current=null]:
	{ newCompositeNode(grammarAccess.getPlusMinusOpsRule()); }
	iv_rulePlusMinusOps=rulePlusMinusOps
	{ $current=$iv_rulePlusMinusOps.current.getText(); }
	EOF;

// Rule PlusMinusOps
rulePlusMinusOps returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_SLANG_OP_0=RULE_SLANG_OP
		{
			$current.merge(this_SLANG_OP_0);
		}
		{
			newLeafNode(this_SLANG_OP_0, grammarAccess.getPlusMinusOpsAccess().getSLANG_OPTerminalRuleCall_0());
		}
		    |
		{
			newCompositeNode(grammarAccess.getPlusMinusOpsAccess().getPlusMinusParserRuleCall_1());
		}
		this_PlusMinus_1=rulePlusMinus
		{
			$current.merge(this_PlusMinus_1);
		}
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleImpliesOps
entryRuleImpliesOps returns [String current=null]:
	{ newCompositeNode(grammarAccess.getImpliesOpsRule()); }
	iv_ruleImpliesOps=ruleImpliesOps
	{ $current=$iv_ruleImpliesOps.current.getText(); }
	EOF;

// Rule ImpliesOps
ruleImpliesOps returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_IMPLIES_0=RULE_IMPLIES
		{
			$current.merge(this_IMPLIES_0);
		}
		{
			newLeafNode(this_IMPLIES_0, grammarAccess.getImpliesOpsAccess().getIMPLIESTerminalRuleCall_0());
		}
		    |
		this_SIMPLIES_1=RULE_SIMPLIES
		{
			$current.merge(this_SIMPLIES_1);
		}
		{
			newLeafNode(this_SIMPLIES_1, grammarAccess.getImpliesOpsAccess().getSIMPLIESTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleContainedPropertyAssociation
entryRuleContainedPropertyAssociation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getContainedPropertyAssociationRule()); }
	iv_ruleContainedPropertyAssociation=ruleContainedPropertyAssociation
	{ $current=$iv_ruleContainedPropertyAssociation.current; }
	EOF;

// Rule ContainedPropertyAssociation
ruleContainedPropertyAssociation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getContainedPropertyAssociationRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getPropertyPropertyCrossReference_0_0());
				}
				ruleQPREF
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1=EqualsSignGreaterThanSign
			{
				newLeafNode(otherlv_1, grammarAccess.getContainedPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_1_0());
			}
			    |
			(
				(
					lv_append_2_0=PlusSignEqualsSignGreaterThanSign
					{
						newLeafNode(lv_append_2_0, grammarAccess.getContainedPropertyAssociationAccess().getAppendPlusSignEqualsSignGreaterThanSignKeyword_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getContainedPropertyAssociationRule());
						}
						setWithLastConsumed($current, "append", lv_append_2_0 != null, "+=>");
					}
				)
			)
		)
		(
			(
				lv_constant_3_0=Constant
				{
					newLeafNode(lv_constant_3_0, grammarAccess.getContainedPropertyAssociationAccess().getConstantConstantKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getContainedPropertyAssociationRule());
					}
					setWithLastConsumed($current, "constant", lv_constant_3_0 != null, "constant");
				}
			)
		)?
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueOptionalModalPropertyValueParserRuleCall_3_0_0());
					}
					lv_ownedValue_4_0=ruleOptionalModalPropertyValue
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getContainedPropertyAssociationRule());
						}
						add(
							$current,
							"ownedValue",
							lv_ownedValue_4_0,
							"org.osate.xtext.aadl2.properties.Properties.OptionalModalPropertyValue");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_5=Comma
				{
					newLeafNode(otherlv_5, grammarAccess.getContainedPropertyAssociationAccess().getCommaKeyword_3_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueOptionalModalPropertyValueParserRuleCall_3_1_1_0());
						}
						lv_ownedValue_6_0=ruleOptionalModalPropertyValue
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getContainedPropertyAssociationRule());
							}
							add(
								$current,
								"ownedValue",
								lv_ownedValue_6_0,
								"org.osate.xtext.aadl2.properties.Properties.OptionalModalPropertyValue");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)
		(
			{
				/* */
			}
			{
				newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToKeywordsParserRuleCall_4_0());
			}
			ruleAppliesToKeywords
			{
				afterParserOrEnumRuleCall();
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToContainmentPathParserRuleCall_4_1_0());
					}
					lv_appliesTo_8_0=ruleContainmentPath
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getContainedPropertyAssociationRule());
						}
						add(
							$current,
							"appliesTo",
							lv_appliesTo_8_0,
							"org.osate.xtext.aadl2.properties.Properties.ContainmentPath");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_9=Comma
				{
					newLeafNode(otherlv_9, grammarAccess.getContainedPropertyAssociationAccess().getCommaKeyword_4_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToContainmentPathParserRuleCall_4_2_1_0());
						}
						lv_appliesTo_10_0=ruleContainmentPath
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getContainedPropertyAssociationRule());
							}
							add(
								$current,
								"appliesTo",
								lv_appliesTo_10_0,
								"org.osate.xtext.aadl2.properties.Properties.ContainmentPath");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		(
			{
				/* */
			}
			{
				newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getInBindingKeywordsParserRuleCall_5_0());
			}
			ruleInBindingKeywords
			{
				afterParserOrEnumRuleCall();
			}
			otherlv_12=LeftParenthesis
			{
				newLeafNode(otherlv_12, grammarAccess.getContainedPropertyAssociationAccess().getLeftParenthesisKeyword_5_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getContainedPropertyAssociationRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getInBindingClassifierCrossReference_5_2_0());
					}
					ruleQCREF
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_14=RightParenthesis
			{
				newLeafNode(otherlv_14, grammarAccess.getContainedPropertyAssociationAccess().getRightParenthesisKeyword_5_3());
			}
		)?
		otherlv_15=Semicolon
		{
			newLeafNode(otherlv_15, grammarAccess.getContainedPropertyAssociationAccess().getSemicolonKeyword_6());
		}
	)
;

// Entry rule entryRuleContainmentPath
entryRuleContainmentPath returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getContainmentPathRule()); }
	iv_ruleContainmentPath=ruleContainmentPath
	{ $current=$iv_ruleContainmentPath.current; }
	EOF;

// Rule ContainmentPath
ruleContainmentPath returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getContainmentPathAccess().getPathContainmentPathElementParserRuleCall_0());
			}
			lv_path_0_0=ruleContainmentPathElement
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getContainmentPathRule());
				}
				set(
					$current,
					"path",
					lv_path_0_0,
					"org.osate.xtext.aadl2.properties.Properties.ContainmentPathElement");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleOptionalModalPropertyValue
entryRuleOptionalModalPropertyValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOptionalModalPropertyValueRule()); }
	iv_ruleOptionalModalPropertyValue=ruleOptionalModalPropertyValue
	{ $current=$iv_ruleOptionalModalPropertyValue.current; }
	EOF;

// Rule OptionalModalPropertyValue
ruleOptionalModalPropertyValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getOptionalModalPropertyValueAccess().getOwnedValuePropertyExpressionParserRuleCall_0_0());
				}
				lv_ownedValue_0_0=rulePropertyExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOptionalModalPropertyValueRule());
					}
					set(
						$current,
						"ownedValue",
						lv_ownedValue_0_0,
						"org.osate.xtext.aadl2.properties.Properties.PropertyExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			{
				/* */
			}
			{
				newCompositeNode(grammarAccess.getOptionalModalPropertyValueAccess().getInModesKeywordsParserRuleCall_1_0());
			}
			ruleInModesKeywords
			{
				afterParserOrEnumRuleCall();
			}
			otherlv_2=LeftParenthesis
			{
				newLeafNode(otherlv_2, grammarAccess.getOptionalModalPropertyValueAccess().getLeftParenthesisKeyword_1_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getOptionalModalPropertyValueRule());
						}
					}
					otherlv_3=RULE_ID
					{
						newLeafNode(otherlv_3, grammarAccess.getOptionalModalPropertyValueAccess().getInModeModeCrossReference_1_2_0());
					}
				)
			)
			(
				otherlv_4=Comma
				{
					newLeafNode(otherlv_4, grammarAccess.getOptionalModalPropertyValueAccess().getCommaKeyword_1_3_0());
				}
				(
					(
						{
							/* */
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getOptionalModalPropertyValueRule());
							}
						}
						otherlv_5=RULE_ID
						{
							newLeafNode(otherlv_5, grammarAccess.getOptionalModalPropertyValueAccess().getInModeModeCrossReference_1_3_1_0());
						}
					)
				)
			)*
			otherlv_6=RightParenthesis
			{
				newLeafNode(otherlv_6, grammarAccess.getOptionalModalPropertyValueAccess().getRightParenthesisKeyword_1_4());
			}
		)?
	)
;

// Entry rule entryRulePropertyValue
entryRulePropertyValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPropertyValueRule()); }
	iv_rulePropertyValue=rulePropertyValue
	{ $current=$iv_rulePropertyValue.current; }
	EOF;

// Rule PropertyValue
rulePropertyValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getPropertyValueAccess().getOwnedValuePropertyExpressionParserRuleCall_0());
			}
			lv_ownedValue_0_0=rulePropertyExpression
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getPropertyValueRule());
				}
				set(
					$current,
					"ownedValue",
					lv_ownedValue_0_0,
					"org.osate.xtext.aadl2.properties.Properties.PropertyExpression");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRulePropertyExpression
entryRulePropertyExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPropertyExpressionRule()); }
	iv_rulePropertyExpression=rulePropertyExpression
	{ $current=$iv_rulePropertyExpression.current; }
	EOF;

// Rule PropertyExpression
rulePropertyExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPropertyExpressionAccess().getRecordTermParserRuleCall_0());
		}
		this_RecordTerm_0=ruleRecordTerm
		{
			$current = $this_RecordTerm_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPropertyExpressionAccess().getReferenceTermParserRuleCall_1());
		}
		this_ReferenceTerm_1=ruleReferenceTerm
		{
			$current = $this_ReferenceTerm_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPropertyExpressionAccess().getComponentClassifierTermParserRuleCall_2());
		}
		this_ComponentClassifierTerm_2=ruleComponentClassifierTerm
		{
			$current = $this_ComponentClassifierTerm_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPropertyExpressionAccess().getComputedTermParserRuleCall_3());
		}
		this_ComputedTerm_3=ruleComputedTerm
		{
			$current = $this_ComputedTerm_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPropertyExpressionAccess().getStringTermParserRuleCall_4());
		}
		this_StringTerm_4=ruleStringTerm
		{
			$current = $this_StringTerm_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPropertyExpressionAccess().getNumericRangeTermParserRuleCall_5());
		}
		this_NumericRangeTerm_5=ruleNumericRangeTerm
		{
			$current = $this_NumericRangeTerm_5.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPropertyExpressionAccess().getRealTermParserRuleCall_6());
		}
		this_RealTerm_6=ruleRealTerm
		{
			$current = $this_RealTerm_6.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPropertyExpressionAccess().getIntegerTermParserRuleCall_7());
		}
		this_IntegerTerm_7=ruleIntegerTerm
		{
			$current = $this_IntegerTerm_7.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPropertyExpressionAccess().getListTermParserRuleCall_8());
		}
		this_ListTerm_8=ruleListTerm
		{
			$current = $this_ListTerm_8.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPropertyExpressionAccess().getBooleanLiteralParserRuleCall_9());
		}
		this_BooleanLiteral_9=ruleBooleanLiteral
		{
			$current = $this_BooleanLiteral_9.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPropertyExpressionAccess().getLiteralorReferenceTermParserRuleCall_10());
		}
		this_LiteralorReferenceTerm_10=ruleLiteralorReferenceTerm
		{
			$current = $this_LiteralorReferenceTerm_10.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleLiteralorReferenceTerm
entryRuleLiteralorReferenceTerm returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLiteralorReferenceTermRule()); }
	iv_ruleLiteralorReferenceTerm=ruleLiteralorReferenceTerm
	{ $current=$iv_ruleLiteralorReferenceTerm.current; }
	EOF;

// Rule LiteralorReferenceTerm
ruleLiteralorReferenceTerm returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getLiteralorReferenceTermRule());
				}
			}
			{
				newCompositeNode(grammarAccess.getLiteralorReferenceTermAccess().getNamedValueAbstractNamedValueCrossReference_0());
			}
			ruleQPREF
			{
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleBooleanLiteral
entryRuleBooleanLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBooleanLiteralRule()); }
	iv_ruleBooleanLiteral=ruleBooleanLiteral
	{ $current=$iv_ruleBooleanLiteral.current; }
	EOF;

// Rule BooleanLiteral
ruleBooleanLiteral returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0(),
					$current);
			}
		)
		(
			(
				(
					lv_value_1_0=True
					{
						newLeafNode(lv_value_1_0, grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getBooleanLiteralRule());
						}
						setWithLastConsumed($current, "value", lv_value_1_0 != null, "true");
					}
				)
			)
			    |
			otherlv_2=False
			{
				newLeafNode(otherlv_2, grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1_1());
			}
		)
	)
;

// Entry rule entryRuleConstantValue
entryRuleConstantValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConstantValueRule()); }
	iv_ruleConstantValue=ruleConstantValue
	{ $current=$iv_ruleConstantValue.current; }
	EOF;

// Rule ConstantValue
ruleConstantValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getConstantValueRule());
				}
			}
			{
				newCompositeNode(grammarAccess.getConstantValueAccess().getNamedValuePropertyConstantCrossReference_0());
			}
			ruleQPREF
			{
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleReferenceTerm
entryRuleReferenceTerm returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getReferenceTermRule()); }
	iv_ruleReferenceTerm=ruleReferenceTerm
	{ $current=$iv_ruleReferenceTerm.current; }
	EOF;

// Rule ReferenceTerm
ruleReferenceTerm returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=Reference
		{
			newLeafNode(otherlv_0, grammarAccess.getReferenceTermAccess().getReferenceKeyword_0());
		}
		otherlv_1=LeftParenthesis
		{
			newLeafNode(otherlv_1, grammarAccess.getReferenceTermAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getReferenceTermAccess().getPathContainmentPathElementParserRuleCall_2_0());
				}
				lv_path_2_0=ruleContainmentPathElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getReferenceTermRule());
					}
					set(
						$current,
						"path",
						lv_path_2_0,
						"org.osate.xtext.aadl2.properties.Properties.ContainmentPathElement");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=RightParenthesis
		{
			newLeafNode(otherlv_3, grammarAccess.getReferenceTermAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleRecordTerm
entryRuleRecordTerm returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRecordTermRule()); }
	iv_ruleRecordTerm=ruleRecordTerm
	{ $current=$iv_ruleRecordTerm.current; }
	EOF;

// Rule RecordTerm
ruleRecordTerm returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=LeftSquareBracket
		{
			newLeafNode(otherlv_0, grammarAccess.getRecordTermAccess().getLeftSquareBracketKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRecordTermAccess().getOwnedFieldValueFieldPropertyAssociationParserRuleCall_1_0());
				}
				lv_ownedFieldValue_1_0=ruleFieldPropertyAssociation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRecordTermRule());
					}
					add(
						$current,
						"ownedFieldValue",
						lv_ownedFieldValue_1_0,
						"org.osate.xtext.aadl2.properties.Properties.FieldPropertyAssociation");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_2=RightSquareBracket
		{
			newLeafNode(otherlv_2, grammarAccess.getRecordTermAccess().getRightSquareBracketKeyword_2());
		}
	)
;

// Entry rule entryRuleComputedTerm
entryRuleComputedTerm returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComputedTermRule()); }
	iv_ruleComputedTerm=ruleComputedTerm
	{ $current=$iv_ruleComputedTerm.current; }
	EOF;

// Rule ComputedTerm
ruleComputedTerm returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=Compute
		{
			newLeafNode(otherlv_0, grammarAccess.getComputedTermAccess().getComputeKeyword_0());
		}
		otherlv_1=LeftParenthesis
		{
			newLeafNode(otherlv_1, grammarAccess.getComputedTermAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				lv_function_2_0=RULE_ID
				{
					newLeafNode(lv_function_2_0, grammarAccess.getComputedTermAccess().getFunctionIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComputedTermRule());
					}
					setWithLastConsumed(
						$current,
						"function",
						lv_function_2_0,
						"org.osate.xtext.aadl2.properties.Properties.ID");
				}
			)
		)
		otherlv_3=RightParenthesis
		{
			newLeafNode(otherlv_3, grammarAccess.getComputedTermAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleComponentClassifierTerm
entryRuleComponentClassifierTerm returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComponentClassifierTermRule()); }
	iv_ruleComponentClassifierTerm=ruleComponentClassifierTerm
	{ $current=$iv_ruleComponentClassifierTerm.current; }
	EOF;

// Rule ComponentClassifierTerm
ruleComponentClassifierTerm returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=Classifier
		{
			newLeafNode(otherlv_0, grammarAccess.getComponentClassifierTermAccess().getClassifierKeyword_0());
		}
		otherlv_1=LeftParenthesis
		{
			newLeafNode(otherlv_1, grammarAccess.getComponentClassifierTermAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComponentClassifierTermRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getComponentClassifierTermAccess().getClassifierComponentClassifierCrossReference_2_0());
				}
				ruleQCREF
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=RightParenthesis
		{
			newLeafNode(otherlv_3, grammarAccess.getComponentClassifierTermAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleListTerm
entryRuleListTerm returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getListTermRule()); }
	iv_ruleListTerm=ruleListTerm
	{ $current=$iv_ruleListTerm.current; }
	EOF;

// Rule ListTerm
ruleListTerm returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getListTermAccess().getListValueAction_0(),
					$current);
			}
		)
		otherlv_1=LeftParenthesis
		{
			newLeafNode(otherlv_1, grammarAccess.getListTermAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getListTermAccess().getOwnedListElementPropertyExpressionParserRuleCall_2_0_0());
					}
					lv_ownedListElement_2_0=rulePropertyExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getListTermRule());
						}
						add(
							$current,
							"ownedListElement",
							lv_ownedListElement_2_0,
							"org.osate.xtext.aadl2.properties.Properties.PropertyExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_3=Comma
				{
					newLeafNode(otherlv_3, grammarAccess.getListTermAccess().getCommaKeyword_2_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getListTermAccess().getOwnedListElementPropertyExpressionParserRuleCall_2_1_1_0());
						}
						lv_ownedListElement_4_0=rulePropertyExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getListTermRule());
							}
							add(
								$current,
								"ownedListElement",
								lv_ownedListElement_4_0,
								"org.osate.xtext.aadl2.properties.Properties.PropertyExpression");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_5=RightParenthesis
		{
			newLeafNode(otherlv_5, grammarAccess.getListTermAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleFieldPropertyAssociation
entryRuleFieldPropertyAssociation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFieldPropertyAssociationRule()); }
	iv_ruleFieldPropertyAssociation=ruleFieldPropertyAssociation
	{ $current=$iv_ruleFieldPropertyAssociation.current; }
	EOF;

// Rule FieldPropertyAssociation
ruleFieldPropertyAssociation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFieldPropertyAssociationRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getFieldPropertyAssociationAccess().getPropertyBasicPropertyCrossReference_0_0());
				}
			)
		)
		otherlv_1=EqualsSignGreaterThanSign
		{
			newLeafNode(otherlv_1, grammarAccess.getFieldPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFieldPropertyAssociationAccess().getOwnedValuePropertyExpressionParserRuleCall_2_0());
				}
				lv_ownedValue_2_0=rulePropertyExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFieldPropertyAssociationRule());
					}
					set(
						$current,
						"ownedValue",
						lv_ownedValue_2_0,
						"org.osate.xtext.aadl2.properties.Properties.PropertyExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=Semicolon
		{
			newLeafNode(otherlv_3, grammarAccess.getFieldPropertyAssociationAccess().getSemicolonKeyword_3());
		}
	)
;

// Entry rule entryRuleContainmentPathElement
entryRuleContainmentPathElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getContainmentPathElementRule()); }
	iv_ruleContainmentPathElement=ruleContainmentPathElement
	{ $current=$iv_ruleContainmentPathElement.current; }
	EOF;

// Rule ContainmentPathElement
ruleContainmentPathElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getContainmentPathElementRule());
						}
					}
					otherlv_0=RULE_ID
					{
						newLeafNode(otherlv_0, grammarAccess.getContainmentPathElementAccess().getNamedElementNamedElementCrossReference_0_0_0());
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getContainmentPathElementAccess().getArrayRangeArrayRangeParserRuleCall_0_1_0());
					}
					lv_arrayRange_1_0=ruleArrayRange
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getContainmentPathElementRule());
						}
						add(
							$current,
							"arrayRange",
							lv_arrayRange_1_0,
							"org.osate.xtext.aadl2.properties.Properties.ArrayRange");
						afterParserOrEnumRuleCall();
					}
				)
			)*
		)
		(
			otherlv_2=FullStop
			{
				newLeafNode(otherlv_2, grammarAccess.getContainmentPathElementAccess().getFullStopKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getContainmentPathElementAccess().getPathContainmentPathElementParserRuleCall_1_1_0());
					}
					lv_path_3_0=ruleContainmentPathElement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getContainmentPathElementRule());
						}
						set(
							$current,
							"path",
							lv_path_3_0,
							"org.osate.xtext.aadl2.properties.Properties.ContainmentPathElement");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRulePlusMinus
entryRulePlusMinus returns [String current=null]:
	{ newCompositeNode(grammarAccess.getPlusMinusRule()); }
	iv_rulePlusMinus=rulePlusMinus
	{ $current=$iv_rulePlusMinus.current.getText(); }
	EOF;

// Rule PlusMinus
rulePlusMinus returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw=PlusSign
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getPlusMinusAccess().getPlusSignKeyword_0());
		}
		    |
		kw=HyphenMinus
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getPlusMinusAccess().getHyphenMinusKeyword_1());
		}
	)
;

// Entry rule entryRuleStringTerm
entryRuleStringTerm returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStringTermRule()); }
	iv_ruleStringTerm=ruleStringTerm
	{ $current=$iv_ruleStringTerm.current; }
	EOF;

// Rule StringTerm
ruleStringTerm returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getStringTermAccess().getValueNoQuoteStringParserRuleCall_0());
			}
			lv_value_0_0=ruleNoQuoteString
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getStringTermRule());
				}
				set(
					$current,
					"value",
					lv_value_0_0,
					"org.osate.xtext.aadl2.properties.Properties.NoQuoteString");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleNoQuoteString
entryRuleNoQuoteString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getNoQuoteStringRule()); }
	iv_ruleNoQuoteString=ruleNoQuoteString
	{ $current=$iv_ruleNoQuoteString.current.getText(); }
	EOF;

// Rule NoQuoteString
ruleNoQuoteString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_STRING_0=RULE_STRING
	{
		$current.merge(this_STRING_0);
	}
	{
		newLeafNode(this_STRING_0, grammarAccess.getNoQuoteStringAccess().getSTRINGTerminalRuleCall());
	}
;

// Entry rule entryRuleArrayRange
entryRuleArrayRange returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getArrayRangeRule()); }
	iv_ruleArrayRange=ruleArrayRange
	{ $current=$iv_ruleArrayRange.current; }
	EOF;

// Rule ArrayRange
ruleArrayRange returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getArrayRangeAccess().getArrayRangeAction_0(),
					$current);
			}
		)
		otherlv_1=LeftSquareBracket
		{
			newLeafNode(otherlv_1, grammarAccess.getArrayRangeAccess().getLeftSquareBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getArrayRangeAccess().getLowerBoundINTVALUEParserRuleCall_2_0());
				}
				lv_lowerBound_2_0=ruleINTVALUE
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getArrayRangeRule());
					}
					set(
						$current,
						"lowerBound",
						lv_lowerBound_2_0,
						"org.osate.xtext.aadl2.properties.Properties.INTVALUE");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3=FullStopFullStop
			{
				newLeafNode(otherlv_3, grammarAccess.getArrayRangeAccess().getFullStopFullStopKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getArrayRangeAccess().getUpperBoundINTVALUEParserRuleCall_3_1_0());
					}
					lv_upperBound_4_0=ruleINTVALUE
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getArrayRangeRule());
						}
						set(
							$current,
							"upperBound",
							lv_upperBound_4_0,
							"org.osate.xtext.aadl2.properties.Properties.INTVALUE");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_5=RightSquareBracket
		{
			newLeafNode(otherlv_5, grammarAccess.getArrayRangeAccess().getRightSquareBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleSignedConstant
entryRuleSignedConstant returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSignedConstantRule()); }
	iv_ruleSignedConstant=ruleSignedConstant
	{ $current=$iv_ruleSignedConstant.current; }
	EOF;

// Rule SignedConstant
ruleSignedConstant returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getSignedConstantAccess().getOpPlusMinusParserRuleCall_0_0());
				}
				lv_op_0_0=rulePlusMinus
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSignedConstantRule());
					}
					set(
						$current,
						"op",
						lv_op_0_0,
						"org.osate.xtext.aadl2.properties.Properties.PlusMinus");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getSignedConstantAccess().getOwnedPropertyExpressionConstantValueParserRuleCall_1_0());
				}
				lv_ownedPropertyExpression_1_0=ruleConstantValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSignedConstantRule());
					}
					add(
						$current,
						"ownedPropertyExpression",
						lv_ownedPropertyExpression_1_0,
						"org.osate.xtext.aadl2.properties.Properties.ConstantValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleIntegerTerm
entryRuleIntegerTerm returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIntegerTermRule()); }
	iv_ruleIntegerTerm=ruleIntegerTerm
	{ $current=$iv_ruleIntegerTerm.current; }
	EOF;

// Rule IntegerTerm
ruleIntegerTerm returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getIntegerTermAccess().getValueSignedIntParserRuleCall_0_0());
				}
				lv_value_0_0=ruleSignedInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIntegerTermRule());
					}
					set(
						$current,
						"value",
						lv_value_0_0,
						"org.osate.xtext.aadl2.properties.Properties.SignedInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getIntegerTermRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getIntegerTermAccess().getUnitUnitLiteralCrossReference_1_0());
				}
			)
		)?
	)
;

// Entry rule entryRuleSignedInt
entryRuleSignedInt returns [String current=null]:
	{ newCompositeNode(grammarAccess.getSignedIntRule()); }
	iv_ruleSignedInt=ruleSignedInt
	{ $current=$iv_ruleSignedInt.current.getText(); }
	EOF;

// Rule SignedInt
ruleSignedInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw=PlusSign
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getSignedIntAccess().getPlusSignKeyword_0_0());
			}
			    |
			kw=HyphenMinus
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getSignedIntAccess().getHyphenMinusKeyword_0_1());
			}
		)?
		this_INTEGER_LIT_2=RULE_INTEGER_LIT
		{
			$current.merge(this_INTEGER_LIT_2);
		}
		{
			newLeafNode(this_INTEGER_LIT_2, grammarAccess.getSignedIntAccess().getINTEGER_LITTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleRealTerm
entryRuleRealTerm returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRealTermRule()); }
	iv_ruleRealTerm=ruleRealTerm
	{ $current=$iv_ruleRealTerm.current; }
	EOF;

// Rule RealTerm
ruleRealTerm returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getRealTermAccess().getValueSignedRealParserRuleCall_0_0());
				}
				lv_value_0_0=ruleSignedReal
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRealTermRule());
					}
					set(
						$current,
						"value",
						lv_value_0_0,
						"org.osate.xtext.aadl2.properties.Properties.SignedReal");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRealTermRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getRealTermAccess().getUnitUnitLiteralCrossReference_1_0());
				}
			)
		)?
	)
;

// Entry rule entryRuleSignedReal
entryRuleSignedReal returns [String current=null]:
	{ newCompositeNode(grammarAccess.getSignedRealRule()); }
	iv_ruleSignedReal=ruleSignedReal
	{ $current=$iv_ruleSignedReal.current.getText(); }
	EOF;

// Rule SignedReal
ruleSignedReal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw=PlusSign
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getSignedRealAccess().getPlusSignKeyword_0_0());
			}
			    |
			kw=HyphenMinus
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getSignedRealAccess().getHyphenMinusKeyword_0_1());
			}
		)?
		this_REAL_LIT_2=RULE_REAL_LIT
		{
			$current.merge(this_REAL_LIT_2);
		}
		{
			newLeafNode(this_REAL_LIT_2, grammarAccess.getSignedRealAccess().getREAL_LITTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleNumericRangeTerm
entryRuleNumericRangeTerm returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNumericRangeTermRule()); }
	iv_ruleNumericRangeTerm=ruleNumericRangeTerm
	{ $current=$iv_ruleNumericRangeTerm.current; }
	EOF;

// Rule NumericRangeTerm
ruleNumericRangeTerm returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getNumericRangeTermAccess().getMinimumNumAltParserRuleCall_0_0());
				}
				lv_minimum_0_0=ruleNumAlt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNumericRangeTermRule());
					}
					set(
						$current,
						"minimum",
						lv_minimum_0_0,
						"org.osate.xtext.aadl2.properties.Properties.NumAlt");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1=FullStopFullStop
		{
			newLeafNode(otherlv_1, grammarAccess.getNumericRangeTermAccess().getFullStopFullStopKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getNumericRangeTermAccess().getMaximumNumAltParserRuleCall_2_0());
				}
				lv_maximum_2_0=ruleNumAlt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNumericRangeTermRule());
					}
					set(
						$current,
						"maximum",
						lv_maximum_2_0,
						"org.osate.xtext.aadl2.properties.Properties.NumAlt");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3=Delta
			{
				newLeafNode(otherlv_3, grammarAccess.getNumericRangeTermAccess().getDeltaKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNumericRangeTermAccess().getDeltaNumAltParserRuleCall_3_1_0());
					}
					lv_delta_4_0=ruleNumAlt
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNumericRangeTermRule());
						}
						set(
							$current,
							"delta",
							lv_delta_4_0,
							"org.osate.xtext.aadl2.properties.Properties.NumAlt");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleNumAlt
entryRuleNumAlt returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNumAltRule()); }
	iv_ruleNumAlt=ruleNumAlt
	{ $current=$iv_ruleNumAlt.current; }
	EOF;

// Rule NumAlt
ruleNumAlt returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getNumAltAccess().getRealTermParserRuleCall_0());
		}
		this_RealTerm_0=ruleRealTerm
		{
			$current = $this_RealTerm_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getNumAltAccess().getIntegerTermParserRuleCall_1());
		}
		this_IntegerTerm_1=ruleIntegerTerm
		{
			$current = $this_IntegerTerm_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getNumAltAccess().getSignedConstantParserRuleCall_2());
		}
		this_SignedConstant_2=ruleSignedConstant
		{
			$current = $this_SignedConstant_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getNumAltAccess().getConstantValueParserRuleCall_3());
		}
		this_ConstantValue_3=ruleConstantValue
		{
			$current = $this_ConstantValue_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAppliesToKeywords
entryRuleAppliesToKeywords returns [String current=null]:
	{ newCompositeNode(grammarAccess.getAppliesToKeywordsRule()); }
	iv_ruleAppliesToKeywords=ruleAppliesToKeywords
	{ $current=$iv_ruleAppliesToKeywords.current.getText(); }
	EOF;

// Rule AppliesToKeywords
ruleAppliesToKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw=Applies
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAppliesToKeywordsAccess().getAppliesKeyword_0());
		}
		kw=To
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAppliesToKeywordsAccess().getToKeyword_1());
		}
	)
;

// Entry rule entryRuleInBindingKeywords
entryRuleInBindingKeywords returns [String current=null]:
	{ newCompositeNode(grammarAccess.getInBindingKeywordsRule()); }
	iv_ruleInBindingKeywords=ruleInBindingKeywords
	{ $current=$iv_ruleInBindingKeywords.current.getText(); }
	EOF;

// Rule InBindingKeywords
ruleInBindingKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw=In_1
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getInBindingKeywordsAccess().getInKeyword_0());
		}
		kw=Binding
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getInBindingKeywordsAccess().getBindingKeyword_1());
		}
	)
;

// Entry rule entryRuleInModesKeywords
entryRuleInModesKeywords returns [String current=null]:
	{ newCompositeNode(grammarAccess.getInModesKeywordsRule()); }
	iv_ruleInModesKeywords=ruleInModesKeywords
	{ $current=$iv_ruleInModesKeywords.current.getText(); }
	EOF;

// Rule InModesKeywords
ruleInModesKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw=In_1
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getInModesKeywordsAccess().getInKeyword_0());
		}
		kw=Modes
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getInModesKeywordsAccess().getModesKeyword_1());
		}
	)
;

// Entry rule entryRuleINTVALUE
entryRuleINTVALUE returns [String current=null]:
	{ newCompositeNode(grammarAccess.getINTVALUERule()); }
	iv_ruleINTVALUE=ruleINTVALUE
	{ $current=$iv_ruleINTVALUE.current.getText(); }
	EOF;

// Rule INTVALUE
ruleINTVALUE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_INTEGER_LIT_0=RULE_INTEGER_LIT
	{
		$current.merge(this_INTEGER_LIT_0);
	}
	{
		newLeafNode(this_INTEGER_LIT_0, grammarAccess.getINTVALUEAccess().getINTEGER_LITTerminalRuleCall());
	}
;

// Entry rule entryRuleQCLREF
entryRuleQCLREF returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQCLREFRule()); }
	iv_ruleQCLREF=ruleQCLREF
	{ $current=$iv_ruleQCLREF.current.getText(); }
	EOF;

// Rule QCLREF
ruleQCLREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getQCLREFAccess().getIDTerminalRuleCall_0());
		}
		kw=ColonColon
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getQCLREFAccess().getColonColonKeyword_1());
		}
		this_ID_2=RULE_ID
		{
			$current.merge(this_ID_2);
		}
		{
			newLeafNode(this_ID_2, grammarAccess.getQCLREFAccess().getIDTerminalRuleCall_2());
		}
	)
;

// Entry rule entryRuleQPREF
entryRuleQPREF returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQPREFRule()); }
	iv_ruleQPREF=ruleQPREF
	{ $current=$iv_ruleQPREF.current.getText(); }
	EOF;

// Rule QPREF
ruleQPREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getQPREFAccess().getIDTerminalRuleCall_0());
		}
		(
			kw=ColonColon
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQPREFAccess().getColonColonKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getQPREFAccess().getIDTerminalRuleCall_1_1());
			}
		)?
	)
;

// Entry rule entryRuleQCREF
entryRuleQCREF returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQCREFRule()); }
	iv_ruleQCREF=ruleQCREF
	{ $current=$iv_ruleQCREF.current.getText(); }
	EOF;

// Rule QCREF
ruleQCREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			this_ID_0=RULE_ID
			{
				$current.merge(this_ID_0);
			}
			{
				newLeafNode(this_ID_0, grammarAccess.getQCREFAccess().getIDTerminalRuleCall_0_0());
			}
			kw=ColonColon
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQCREFAccess().getColonColonKeyword_0_1());
			}
		)*
		this_ID_2=RULE_ID
		{
			$current.merge(this_ID_2);
		}
		{
			newLeafNode(this_ID_2, grammarAccess.getQCREFAccess().getIDTerminalRuleCall_1());
		}
		(
			kw=FullStop
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQCREFAccess().getFullStopKeyword_2_0());
			}
			this_ID_4=RULE_ID
			{
				$current.merge(this_ID_4);
			}
			{
				newLeafNode(this_ID_4, grammarAccess.getQCREFAccess().getIDTerminalRuleCall_2_1());
			}
		)?
	)
;

// Entry rule entryRuleSTAR
entryRuleSTAR returns [String current=null]:
	{ newCompositeNode(grammarAccess.getSTARRule()); }
	iv_ruleSTAR=ruleSTAR
	{ $current=$iv_ruleSTAR.current.getText(); }
	EOF;

// Rule STAR
ruleSTAR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw=Asterisk
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getSTARAccess().getAsteriskKeyword());
	}
;
