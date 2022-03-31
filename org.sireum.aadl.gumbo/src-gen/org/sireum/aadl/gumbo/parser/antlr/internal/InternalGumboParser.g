
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
				$current = forceCreateModelElement(
					grammarAccess.getGumboLibraryAccess().getGumboLibraryAction_0(),
					$current);
			}
		)
		otherlv_1=Library
		{
			newLeafNode(otherlv_1, grammarAccess.getGumboLibraryAccess().getLibraryKeyword_1());
		}
		otherlv_2=For
		{
			newLeafNode(otherlv_2, grammarAccess.getGumboLibraryAccess().getForKeyword_2());
		}
		otherlv_3=Gumbo
		{
			newLeafNode(otherlv_3, grammarAccess.getGumboLibraryAccess().getGumboKeyword_3());
		}
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
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStateVarDeclRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getStateVarDeclAccess().getTypeNameDataSubcomponentTypeCrossReference_1_0());
				}
				ruleQCREF
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
				lv_displayName_1_0=RULE_SLANG_STRING
				{
					newLeafNode(lv_displayName_1_0, grammarAccess.getInvSpecAccess().getDisplayNameSLANG_STRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInvSpecRule());
					}
					setWithLastConsumed(
						$current,
						"displayName",
						lv_displayName_1_0,
						"org.sireum.aadl.gumbo.Gumbo.SLANG_STRING");
				}
			)
		)
		otherlv_2=Colon
		{
			newLeafNode(otherlv_2, grammarAccess.getInvSpecAccess().getColonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getInvSpecAccess().getExprExprParserRuleCall_3_0());
				}
				lv_expr_3_0=ruleExpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInvSpecRule());
					}
					set(
						$current,
						"expr",
						lv_expr_3_0,
						"org.sireum.aadl.gumbo.Gumbo.Expr");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4=Semicolon
		{
			newLeafNode(otherlv_4, grammarAccess.getInvSpecAccess().getSemicolonKeyword_4());
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
		otherlv_0=Initialize
		{
			newLeafNode(otherlv_0, grammarAccess.getInitializeAccess().getInitializeKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getInitializeAccess().getSpecsInitializeSpecStatementParserRuleCall_1_0());
				}
				lv_specs_1_0=ruleInitializeSpecStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInitializeRule());
					}
					add(
						$current,
						"specs",
						lv_specs_1_0,
						"org.sireum.aadl.gumbo.Gumbo.InitializeSpecStatement");
					afterParserOrEnumRuleCall();
				}
			)
		)+
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
		otherlv_0=Compute
		{
			newLeafNode(otherlv_0, grammarAccess.getComputeAccess().getComputeKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getComputeAccess().getCasesCaseStatementClauseParserRuleCall_1_0());
				}
				lv_cases_1_0=ruleCaseStatementClause
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComputeRule());
					}
					add(
						$current,
						"cases",
						lv_cases_1_0,
						"org.sireum.aadl.gumbo.Gumbo.CaseStatementClause");
					afterParserOrEnumRuleCall();
				}
			)
		)+
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
				lv_displayName_1_0=RULE_SLANG_STRING
				{
					newLeafNode(lv_displayName_1_0, grammarAccess.getCaseStatementClauseAccess().getDisplayNameSLANG_STRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCaseStatementClauseRule());
					}
					setWithLastConsumed(
						$current,
						"displayName",
						lv_displayName_1_0,
						"org.sireum.aadl.gumbo.Gumbo.SLANG_STRING");
				}
			)
		)
		otherlv_2=Colon
		{
			newLeafNode(otherlv_2, grammarAccess.getCaseStatementClauseAccess().getColonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCaseStatementClauseAccess().getAssumeStatementAnonAssumeStatementParserRuleCall_3_0());
				}
				lv_assumeStatement_3_0=ruleAnonAssumeStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCaseStatementClauseRule());
					}
					set(
						$current,
						"assumeStatement",
						lv_assumeStatement_3_0,
						"org.sireum.aadl.gumbo.Gumbo.AnonAssumeStatement");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getCaseStatementClauseAccess().getGuaranteeStatementAnonGuaranteeStatementParserRuleCall_4_0());
				}
				lv_guaranteeStatement_4_0=ruleAnonGuaranteeStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCaseStatementClauseRule());
					}
					set(
						$current,
						"guaranteeStatement",
						lv_guaranteeStatement_4_0,
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
			newCompositeNode(grammarAccess.getSpecStatementAccess().getAssumeStatementParserRuleCall_0());
		}
		this_AssumeStatement_0=ruleAssumeStatement
		{
			$current = $this_AssumeStatement_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
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
				lv_displayName_1_0=RULE_SLANG_STRING
				{
					newLeafNode(lv_displayName_1_0, grammarAccess.getAssumeStatementAccess().getDisplayNameSLANG_STRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAssumeStatementRule());
					}
					setWithLastConsumed(
						$current,
						"displayName",
						lv_displayName_1_0,
						"org.sireum.aadl.gumbo.Gumbo.SLANG_STRING");
				}
			)
		)
		otherlv_2=Colon
		{
			newLeafNode(otherlv_2, grammarAccess.getAssumeStatementAccess().getColonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAssumeStatementAccess().getExprExprParserRuleCall_3_0());
				}
				lv_expr_3_0=ruleExpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAssumeStatementRule());
					}
					set(
						$current,
						"expr",
						lv_expr_3_0,
						"org.sireum.aadl.gumbo.Gumbo.Expr");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4=Semicolon
		{
			newLeafNode(otherlv_4, grammarAccess.getAssumeStatementAccess().getSemicolonKeyword_4());
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
					newCompositeNode(grammarAccess.getAnonAssumeStatementAccess().getExprExprParserRuleCall_1_0());
				}
				lv_expr_1_0=ruleExpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAnonAssumeStatementRule());
					}
					set(
						$current,
						"expr",
						lv_expr_1_0,
						"org.sireum.aadl.gumbo.Gumbo.Expr");
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
				lv_displayName_1_0=RULE_SLANG_STRING
				{
					newLeafNode(lv_displayName_1_0, grammarAccess.getGuaranteeStatementAccess().getDisplayNameSLANG_STRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGuaranteeStatementRule());
					}
					setWithLastConsumed(
						$current,
						"displayName",
						lv_displayName_1_0,
						"org.sireum.aadl.gumbo.Gumbo.SLANG_STRING");
				}
			)
		)
		otherlv_2=Colon
		{
			newLeafNode(otherlv_2, grammarAccess.getGuaranteeStatementAccess().getColonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGuaranteeStatementAccess().getExprExprParserRuleCall_3_0());
				}
				lv_expr_3_0=ruleExpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGuaranteeStatementRule());
					}
					set(
						$current,
						"expr",
						lv_expr_3_0,
						"org.sireum.aadl.gumbo.Gumbo.Expr");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4=Semicolon
		{
			newLeafNode(otherlv_4, grammarAccess.getGuaranteeStatementAccess().getSemicolonKeyword_4());
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
					newCompositeNode(grammarAccess.getAnonGuaranteeStatementAccess().getExprExprParserRuleCall_1_0());
				}
				lv_expr_1_0=ruleExpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAnonGuaranteeStatementRule());
					}
					set(
						$current,
						"expr",
						lv_expr_1_0,
						"org.sireum.aadl.gumbo.Gumbo.Expr");
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
				if ($current==null) {
					$current = createModelElement(grammarAccess.getDataElementRule());
				}
			}
			{
				newCompositeNode(grammarAccess.getDataElementAccess().getDataElementDataSubcomponentTypeCrossReference_0());
			}
			ruleQCREF
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

// Entry rule entryRuleSlangDefDecl
entryRuleSlangDefDecl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlangDefDeclRule()); }
	iv_ruleSlangDefDecl=ruleSlangDefDecl
	{ $current=$iv_ruleSlangDefDecl.current; }
	EOF;

// Rule SlangDefDecl
ruleSlangDefDecl returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=Def
		{
			newLeafNode(otherlv_0, grammarAccess.getSlangDefDeclAccess().getDefKeyword_0());
		}
		(
			{
				newCompositeNode(grammarAccess.getSlangDefDeclAccess().getSlangDefModsParserRuleCall_1());
			}
			ruleSlangDefMods
			{
				afterParserOrEnumRuleCall();
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getSlangDefDeclAccess().getSdeSlangDefExtParserRuleCall_2_0());
				}
				lv_sde_2_0=ruleSlangDefExt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangDefDeclRule());
					}
					set(
						$current,
						"sde",
						lv_sde_2_0,
						"org.sireum.aadl.gumbo.Gumbo.SlangDefExt");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getSlangDefDeclAccess().getNameSlangDefIDParserRuleCall_3_0());
				}
				lv_name_3_0=ruleSlangDefID
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangDefDeclRule());
					}
					set(
						$current,
						"name",
						lv_name_3_0,
						"org.sireum.aadl.gumbo.Gumbo.SlangDefID");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getSlangDefDeclAccess().getTypeParamsSlangTypeParamsParserRuleCall_4_0());
				}
				lv_typeParams_4_0=ruleSlangTypeParams
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangDefDeclRule());
					}
					set(
						$current,
						"typeParams",
						lv_typeParams_4_0,
						"org.sireum.aadl.gumbo.Gumbo.SlangTypeParams");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getSlangDefDeclAccess().getParamsSlangDefParamsParserRuleCall_5_0());
				}
				lv_params_5_0=ruleSlangDefParams
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangDefDeclRule());
					}
					set(
						$current,
						"params",
						lv_params_5_0,
						"org.sireum.aadl.gumbo.Gumbo.SlangDefParams");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_6=Colon
		{
			newLeafNode(otherlv_6, grammarAccess.getSlangDefDeclAccess().getColonKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSlangDefDeclAccess().getTypeSlangTypeParserRuleCall_7_0());
				}
				lv_type_7_0=ruleSlangType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangDefDeclRule());
					}
					set(
						$current,
						"type",
						lv_type_7_0,
						"org.sireum.aadl.gumbo.Gumbo.SlangType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getSlangDefDeclAccess().getCSlangDefContractParserRuleCall_8_0());
				}
				lv_c_8_0=ruleSlangDefContract
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangDefDeclRule());
					}
					set(
						$current,
						"c",
						lv_c_8_0,
						"org.sireum.aadl.gumbo.Gumbo.SlangDefContract");
					afterParserOrEnumRuleCall();
				}
			)
		)?
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
			{
				newCompositeNode(grammarAccess.getSlangDefDefAccess().getSlangDefModsParserRuleCall_1());
			}
			ruleSlangDefMods
			{
				afterParserOrEnumRuleCall();
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getSlangDefDefAccess().getSdeSlangDefExtParserRuleCall_2_0());
				}
				lv_sde_2_0=ruleSlangDefExt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangDefDefRule());
					}
					set(
						$current,
						"sde",
						lv_sde_2_0,
						"org.sireum.aadl.gumbo.Gumbo.SlangDefExt");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getSlangDefDefAccess().getNameSlangDefIDParserRuleCall_3_0());
				}
				lv_name_3_0=ruleSlangDefID
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangDefDefRule());
					}
					set(
						$current,
						"name",
						lv_name_3_0,
						"org.sireum.aadl.gumbo.Gumbo.SlangDefID");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getSlangDefDefAccess().getTypeParamsSlangTypeParamsParserRuleCall_4_0());
				}
				lv_typeParams_4_0=ruleSlangTypeParams
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangDefDefRule());
					}
					set(
						$current,
						"typeParams",
						lv_typeParams_4_0,
						"org.sireum.aadl.gumbo.Gumbo.SlangTypeParams");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getSlangDefDefAccess().getParamsSlangDefParamsParserRuleCall_5_0());
				}
				lv_params_5_0=ruleSlangDefParams
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangDefDefRule());
					}
					set(
						$current,
						"params",
						lv_params_5_0,
						"org.sireum.aadl.gumbo.Gumbo.SlangDefParams");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_6=Colon
		{
			newLeafNode(otherlv_6, grammarAccess.getSlangDefDefAccess().getColonKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSlangDefDefAccess().getTypeSlangTypeParserRuleCall_7_0());
				}
				lv_type_7_0=ruleSlangType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangDefDefRule());
					}
					set(
						$current,
						"type",
						lv_type_7_0,
						"org.sireum.aadl.gumbo.Gumbo.SlangType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getSlangDefDefAccess().getCSlangDefContractParserRuleCall_8_0());
				}
				lv_c_8_0=ruleSlangDefContract
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangDefDefRule());
					}
					set(
						$current,
						"c",
						lv_c_8_0,
						"org.sireum.aadl.gumbo.Gumbo.SlangDefContract");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_9=ColonEqualsSign
		{
			newLeafNode(otherlv_9, grammarAccess.getSlangDefDefAccess().getColonEqualsSignKeyword_9());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSlangDefDefAccess().getEExprParserRuleCall_10_0());
				}
				lv_e_10_0=ruleExpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangDefDefRule());
					}
					set(
						$current,
						"e",
						lv_e_10_0,
						"org.sireum.aadl.gumbo.Gumbo.Expr");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleSlangDefMods
entryRuleSlangDefMods returns [String current=null]:
	{ newCompositeNode(grammarAccess.getSlangDefModsRule()); }
	iv_ruleSlangDefMods=ruleSlangDefMods
	{ $current=$iv_ruleSlangDefMods.current.getText(); }
	EOF;

// Rule SlangDefMods
ruleSlangDefMods returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw=Strict
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getSlangDefModsAccess().getStrictKeyword_0());
		}
		    |
		kw=Memoize
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getSlangDefModsAccess().getMemoizeKeyword_1());
		}
		    |
		kw=Mut
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getSlangDefModsAccess().getMutKeyword_2());
		}
		    |
		kw=Spec
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getSlangDefModsAccess().getSpecKeyword_3());
		}
	)
;

// Entry rule entryRuleSlangDefExt
entryRuleSlangDefExt returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlangDefExtRule()); }
	iv_ruleSlangDefExt=ruleSlangDefExt
	{ $current=$iv_ruleSlangDefExt.current; }
	EOF;

// Rule SlangDefExt
ruleSlangDefExt returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=LeftParenthesis
		{
			newLeafNode(otherlv_0, grammarAccess.getSlangDefExtAccess().getLeftParenthesisKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getSlangDefExtAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSlangDefExtRule());
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
			newLeafNode(otherlv_2, grammarAccess.getSlangDefExtAccess().getColonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSlangDefExtAccess().getTypeNameSlangTypeParserRuleCall_3_0());
				}
				lv_typeName_3_0=ruleSlangType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangDefExtRule());
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
		otherlv_4=RightParenthesis
		{
			newLeafNode(otherlv_4, grammarAccess.getSlangDefExtAccess().getRightParenthesisKeyword_4());
		}
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
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getSlangDefIDAccess().getIDTerminalRuleCall_0());
		}
		    |
		{
			newCompositeNode(grammarAccess.getSlangDefIDAccess().getOperatorParserRuleCall_1());
		}
		this_Operator_1=ruleOperator
		{
			$current.merge(this_Operator_1);
		}
		{
			afterParserOrEnumRuleCall();
		}
	)
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
				{
					newCompositeNode(grammarAccess.getSlangDefParamsAccess().getParamsSlangDefParamParserRuleCall_1_0());
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
				newLeafNode(otherlv_2, grammarAccess.getSlangDefParamsAccess().getCommaKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSlangDefParamsAccess().getParamsSlangDefParamParserRuleCall_2_1_0());
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
		)?
		otherlv_4=RightParenthesis
		{
			newLeafNode(otherlv_4, grammarAccess.getSlangDefParamsAccess().getRightParenthesisKeyword_3());
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
			otherlv_2=EqualsSignGreaterThanSign
			{
				newLeafNode(otherlv_2, grammarAccess.getSlangDefParamAccess().getEqualsSignGreaterThanSignKeyword_2());
			}
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
			otherlv_4=Asterisk
			{
				newLeafNode(otherlv_4, grammarAccess.getSlangDefParamAccess().getAsteriskKeyword_4());
			}
		)?
	)
;

// Entry rule entryRuleSlangTypeParams
entryRuleSlangTypeParams returns [String current=null]:
	{ newCompositeNode(grammarAccess.getSlangTypeParamsRule()); }
	iv_ruleSlangTypeParams=ruleSlangTypeParams
	{ $current=$iv_ruleSlangTypeParams.current.getText(); }
	EOF;

// Rule SlangTypeParams
ruleSlangTypeParams returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw=LeftSquareBracket
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getSlangTypeParamsAccess().getLeftSquareBracketKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getSlangTypeParamsAccess().getSlangTypeParamParserRuleCall_1());
		}
		this_SlangTypeParam_1=ruleSlangTypeParam
		{
			$current.merge(this_SlangTypeParam_1);
		}
		{
			afterParserOrEnumRuleCall();
		}
		(
			kw=Comma
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getSlangTypeParamsAccess().getCommaKeyword_2_0());
			}
			{
				newCompositeNode(grammarAccess.getSlangTypeParamsAccess().getSlangTypeParamParserRuleCall_2_1());
			}
			this_SlangTypeParam_3=ruleSlangTypeParam
			{
				$current.merge(this_SlangTypeParam_3);
			}
			{
				afterParserOrEnumRuleCall();
			}
		)*
		kw=RightSquareBracket
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getSlangTypeParamsAccess().getRightSquareBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleSlangTypeParam
entryRuleSlangTypeParam returns [String current=null]:
	{ newCompositeNode(grammarAccess.getSlangTypeParamRule()); }
	iv_ruleSlangTypeParam=ruleSlangTypeParam
	{ $current=$iv_ruleSlangTypeParam.current.getText(); }
	EOF;

// Rule SlangTypeParam
ruleSlangTypeParam returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw=Mut
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getSlangTypeParamAccess().getMutKeyword_0());
			}
		)?
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getSlangTypeParamAccess().getIDTerminalRuleCall_1());
		}
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
				$current = forceCreateModelElement(
					grammarAccess.getSlangDefContractAccess().getSlangDefContractAction_0(),
					$current);
			}
		)
		otherlv_1=Spec
		{
			newLeafNode(otherlv_1, grammarAccess.getSlangDefContractAccess().getSpecKeyword_1());
		}
		(
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getSlangDefContractAccess().getReaSlangReadsParserRuleCall_2_0_0_0());
						}
						lv_rea_2_0=ruleSlangReads
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSlangDefContractRule());
							}
							set(
								$current,
								"rea",
								lv_rea_2_0,
								"org.sireum.aadl.gumbo.Gumbo.SlangReads");
							afterParserOrEnumRuleCall();
						}
					)
				)?
				(
					(
						{
							newCompositeNode(grammarAccess.getSlangDefContractAccess().getReqSlangRequiresParserRuleCall_2_0_1_0());
						}
						lv_req_3_0=ruleSlangRequires
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSlangDefContractRule());
							}
							set(
								$current,
								"req",
								lv_req_3_0,
								"org.sireum.aadl.gumbo.Gumbo.SlangRequires");
							afterParserOrEnumRuleCall();
						}
					)
				)?
				(
					(
						{
							newCompositeNode(grammarAccess.getSlangDefContractAccess().getModSlangModifiesParserRuleCall_2_0_2_0());
						}
						lv_mod_4_0=ruleSlangModifies
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSlangDefContractRule());
							}
							set(
								$current,
								"mod",
								lv_mod_4_0,
								"org.sireum.aadl.gumbo.Gumbo.SlangModifies");
							afterParserOrEnumRuleCall();
						}
					)
				)?
				(
					(
						{
							newCompositeNode(grammarAccess.getSlangDefContractAccess().getEnsSlangEnsuresParserRuleCall_2_0_3_0());
						}
						lv_ens_5_0=ruleSlangEnsures
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSlangDefContractRule());
							}
							set(
								$current,
								"ens",
								lv_ens_5_0,
								"org.sireum.aadl.gumbo.Gumbo.SlangEnsures");
							afterParserOrEnumRuleCall();
						}
					)
				)?
			)
			    |
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getSlangDefContractAccess().getContractsSlangDefContractCaseParserRuleCall_2_1_0_0());
						}
						lv_contracts_6_0=ruleSlangDefContractCase
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSlangDefContractRule());
							}
							add(
								$current,
								"contracts",
								lv_contracts_6_0,
								"org.sireum.aadl.gumbo.Gumbo.SlangDefContractCase");
							afterParserOrEnumRuleCall();
						}
					)
				)+
				(
					(
						{
							newCompositeNode(grammarAccess.getSlangDefContractAccess().getReaSlangReadsParserRuleCall_2_1_1_0());
						}
						lv_rea_7_0=ruleSlangReads
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSlangDefContractRule());
							}
							set(
								$current,
								"rea",
								lv_rea_7_0,
								"org.sireum.aadl.gumbo.Gumbo.SlangReads");
							afterParserOrEnumRuleCall();
						}
					)
				)?
				(
					(
						{
							newCompositeNode(grammarAccess.getSlangDefContractAccess().getModSlangModifiesParserRuleCall_2_1_2_0());
						}
						lv_mod_8_0=ruleSlangModifies
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSlangDefContractRule());
							}
							set(
								$current,
								"mod",
								lv_mod_8_0,
								"org.sireum.aadl.gumbo.Gumbo.SlangModifies");
							afterParserOrEnumRuleCall();
						}
					)
				)?
			)
		)
	)
;

// Entry rule entryRuleSlangDefContractCase
entryRuleSlangDefContractCase returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlangDefContractCaseRule()); }
	iv_ruleSlangDefContractCase=ruleSlangDefContractCase
	{ $current=$iv_ruleSlangDefContractCase.current; }
	EOF;

// Rule SlangDefContractCase
ruleSlangDefContractCase returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getSlangDefContractCaseAccess().getSlangDefContractCaseAction_0(),
					$current);
			}
		)
		otherlv_1=Case
		{
			newLeafNode(otherlv_1, grammarAccess.getSlangDefContractCaseAccess().getCaseKeyword_1());
		}
		this_SLANG_STRING_2=RULE_SLANG_STRING
		{
			newLeafNode(this_SLANG_STRING_2, grammarAccess.getSlangDefContractCaseAccess().getSLANG_STRINGTerminalRuleCall_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSlangDefContractCaseAccess().getReqSlangRequiresParserRuleCall_3_0());
				}
				lv_req_3_0=ruleSlangRequires
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangDefContractCaseRule());
					}
					set(
						$current,
						"req",
						lv_req_3_0,
						"org.sireum.aadl.gumbo.Gumbo.SlangRequires");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getSlangDefContractCaseAccess().getEnsSlangEnsuresParserRuleCall_4_0());
				}
				lv_ens_4_0=ruleSlangEnsures
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangDefContractCaseRule());
					}
					set(
						$current,
						"ens",
						lv_ens_4_0,
						"org.sireum.aadl.gumbo.Gumbo.SlangEnsures");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleSlangSupr
entryRuleSlangSupr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlangSuprRule()); }
	iv_ruleSlangSupr=ruleSlangSupr
	{ $current=$iv_ruleSlangSupr.current; }
	EOF;

// Rule SlangSupr
ruleSlangSupr returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getSlangSuprAccess().getNameSlangNameParserRuleCall_0_0());
				}
				lv_name_0_0=ruleSlangName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangSuprRule());
					}
					set(
						$current,
						"name",
						lv_name_0_0,
						"org.sireum.aadl.gumbo.Gumbo.SlangName");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getSlangSuprAccess().getArgsSlangTypeArgsParserRuleCall_1_0());
				}
				lv_args_1_0=ruleSlangTypeArgs
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangSuprRule());
					}
					set(
						$current,
						"args",
						lv_args_1_0,
						"org.sireum.aadl.gumbo.Gumbo.SlangTypeArgs");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleSlangName
entryRuleSlangName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getSlangNameRule()); }
	iv_ruleSlangName=ruleSlangName
	{ $current=$iv_ruleSlangName.current.getText(); }
	EOF;

// Rule SlangName
ruleSlangName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
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
			newLeafNode(this_ID_0, grammarAccess.getSlangNameAccess().getIDTerminalRuleCall_0());
		}
		(
			kw=FullStop
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getSlangNameAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getSlangNameAccess().getIDTerminalRuleCall_1_1());
			}
		)*
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
					newCompositeNode(grammarAccess.getSlangInvariantAccess().getExprsExprParserRuleCall_1_0());
				}
				lv_exprs_1_0=ruleExpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangInvariantRule());
					}
					add(
						$current,
						"exprs",
						lv_exprs_1_0,
						"org.sireum.aadl.gumbo.Gumbo.Expr");
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
						newCompositeNode(grammarAccess.getSlangInvariantAccess().getExprsExprParserRuleCall_2_1_0());
					}
					lv_exprs_3_0=ruleExpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangInvariantRule());
						}
						add(
							$current,
							"exprs",
							lv_exprs_3_0,
							"org.sireum.aadl.gumbo.Gumbo.Expr");
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
					newCompositeNode(grammarAccess.getSlangReadsAccess().getExprsExprParserRuleCall_1_0());
				}
				lv_exprs_1_0=ruleExpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangReadsRule());
					}
					add(
						$current,
						"exprs",
						lv_exprs_1_0,
						"org.sireum.aadl.gumbo.Gumbo.Expr");
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
						newCompositeNode(grammarAccess.getSlangReadsAccess().getExprsExprParserRuleCall_2_1_0());
					}
					lv_exprs_3_0=ruleExpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangReadsRule());
						}
						add(
							$current,
							"exprs",
							lv_exprs_3_0,
							"org.sireum.aadl.gumbo.Gumbo.Expr");
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
		otherlv_0=Requires
		{
			newLeafNode(otherlv_0, grammarAccess.getSlangRequiresAccess().getRequiresKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSlangRequiresAccess().getExprsExprParserRuleCall_1_0());
				}
				lv_exprs_1_0=ruleExpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangRequiresRule());
					}
					add(
						$current,
						"exprs",
						lv_exprs_1_0,
						"org.sireum.aadl.gumbo.Gumbo.Expr");
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
						newCompositeNode(grammarAccess.getSlangRequiresAccess().getExprsExprParserRuleCall_2_1_0());
					}
					lv_exprs_3_0=ruleExpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangRequiresRule());
						}
						add(
							$current,
							"exprs",
							lv_exprs_3_0,
							"org.sireum.aadl.gumbo.Gumbo.Expr");
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
					newCompositeNode(grammarAccess.getSlangModifiesAccess().getExprsExprParserRuleCall_1_0());
				}
				lv_exprs_1_0=ruleExpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangModifiesRule());
					}
					add(
						$current,
						"exprs",
						lv_exprs_1_0,
						"org.sireum.aadl.gumbo.Gumbo.Expr");
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
						newCompositeNode(grammarAccess.getSlangModifiesAccess().getExprsExprParserRuleCall_2_1_0());
					}
					lv_exprs_3_0=ruleExpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangModifiesRule());
						}
						add(
							$current,
							"exprs",
							lv_exprs_3_0,
							"org.sireum.aadl.gumbo.Gumbo.Expr");
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
		otherlv_0=Ensures
		{
			newLeafNode(otherlv_0, grammarAccess.getSlangEnsuresAccess().getEnsuresKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSlangEnsuresAccess().getExprsExprParserRuleCall_1_0());
				}
				lv_exprs_1_0=ruleExpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangEnsuresRule());
					}
					add(
						$current,
						"exprs",
						lv_exprs_1_0,
						"org.sireum.aadl.gumbo.Gumbo.Expr");
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
						newCompositeNode(grammarAccess.getSlangEnsuresAccess().getExprsExprParserRuleCall_2_1_0());
					}
					lv_exprs_3_0=ruleExpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangEnsuresRule());
						}
						add(
							$current,
							"exprs",
							lv_exprs_3_0,
							"org.sireum.aadl.gumbo.Gumbo.Expr");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
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
						newCompositeNode(grammarAccess.getSlangStmtAccess().getCondExprParserRuleCall_1_2_0());
					}
					lv_cond_4_0=ruleExpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangStmtRule());
						}
						set(
							$current,
							"cond",
							lv_cond_4_0,
							"org.sireum.aadl.gumbo.Gumbo.Expr");
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
						newCompositeNode(grammarAccess.getSlangStmtAccess().getCondExprParserRuleCall_2_2_0());
					}
					lv_cond_9_0=ruleExpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangStmtRule());
						}
						set(
							$current,
							"cond",
							lv_cond_9_0,
							"org.sireum.aadl.gumbo.Gumbo.Expr");
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
						newCompositeNode(grammarAccess.getSlangStmtAccess().getTestExprExprParserRuleCall_3_2_0());
					}
					lv_testExpr_14_0=ruleExpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangStmtRule());
						}
						set(
							$current,
							"testExpr",
							lv_testExpr_14_0,
							"org.sireum.aadl.gumbo.Gumbo.Expr");
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
						newCompositeNode(grammarAccess.getSlangStmtAccess().getEExprParserRuleCall_5_2_0());
					}
					lv_e_23_0=ruleExpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangStmtRule());
						}
						set(
							$current,
							"e",
							lv_e_23_0,
							"org.sireum.aadl.gumbo.Gumbo.Expr");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				this_SLANG_STRING_24=RULE_SLANG_STRING
				{
					newLeafNode(this_SLANG_STRING_24, grammarAccess.getSlangStmtAccess().getSLANG_STRINGTerminalRuleCall_5_3());
				}
			)?
		)
		    |
		(
			(
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
						newCompositeNode(grammarAccess.getSlangStmtAccess().getEExprParserRuleCall_6_2_0());
					}
					lv_e_27_0=ruleExpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangStmtRule());
						}
						set(
							$current,
							"e",
							lv_e_27_0,
							"org.sireum.aadl.gumbo.Gumbo.Expr");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				this_SLANG_STRING_28=RULE_SLANG_STRING
				{
					newLeafNode(this_SLANG_STRING_28, grammarAccess.getSlangStmtAccess().getSLANG_STRINGTerminalRuleCall_6_3());
				}
			)?
		)
		    |
		(
			(
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
				this_SLANG_STRING_31=RULE_SLANG_STRING
				{
					newLeafNode(this_SLANG_STRING_31, grammarAccess.getSlangStmtAccess().getSLANG_STRINGTerminalRuleCall_7_2());
				}
			)?
		)
		    |
		(
			(
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
						newCompositeNode(grammarAccess.getSlangStmtAccess().getEExprParserRuleCall_8_2_0());
					}
					lv_e_34_0=ruleExpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangStmtRule());
						}
						set(
							$current,
							"e",
							lv_e_34_0,
							"org.sireum.aadl.gumbo.Gumbo.Expr");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSlangStmtAccess().getSlangIdStmtAction_9_0(),
						$current);
				}
			)
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSlangStmtRule());
						}
					}
					otherlv_36=RULE_ID
					{
						newLeafNode(otherlv_36, grammarAccess.getSlangStmtAccess().getPortOrSubcomponentOrStateVarEObjectCrossReference_9_1_0());
					}
				)
			)
			(
				otherlv_37=Colon
				{
					newLeafNode(otherlv_37, grammarAccess.getSlangStmtAccess().getColonKeyword_9_2_0());
				}
				    |
				(
					(
						otherlv_38=ColonEqualsSign
						{
							newLeafNode(otherlv_38, grammarAccess.getSlangStmtAccess().getColonEqualsSignKeyword_9_2_1_0_0());
						}
						    |
						this_DEFOP_39=RULE_DEFOP
						{
							newLeafNode(this_DEFOP_39, grammarAccess.getSlangStmtAccess().getDEFOPTerminalRuleCall_9_2_1_0_1());
						}
					)
					(
						(
							{
								newCompositeNode(grammarAccess.getSlangStmtAccess().getEExprParserRuleCall_9_2_1_1_0());
							}
							lv_e_40_0=ruleExpr
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getSlangStmtRule());
								}
								set(
									$current,
									"e",
									lv_e_40_0,
									"org.sireum.aadl.gumbo.Gumbo.Expr");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)?
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
							newCompositeNode(grammarAccess.getSlangElseAccess().getCondExprParserRuleCall_1_0_1_0());
						}
						lv_cond_2_0=ruleExpr
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSlangElseRule());
							}
							set(
								$current,
								"cond",
								lv_cond_2_0,
								"org.sireum.aadl.gumbo.Gumbo.Expr");
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
						newCompositeNode(grammarAccess.getSlangCaseAccess().getEExprParserRuleCall_2_1_0());
					}
					lv_e_3_0=ruleExpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangCaseRule());
						}
						set(
							$current,
							"e",
							lv_e_3_0,
							"org.sireum.aadl.gumbo.Gumbo.Expr");
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
			newCompositeNode(grammarAccess.getSlangVarDefAccess().getSlangVarModParserRuleCall_0());
		}
		ruleSlangVarMod
		{
			afterParserOrEnumRuleCall();
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
					newCompositeNode(grammarAccess.getSlangVarDefAccess().getInitExprParserRuleCall_4_0());
				}
				lv_init_5_0=ruleExpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangVarDefRule());
					}
					set(
						$current,
						"init",
						lv_init_5_0,
						"org.sireum.aadl.gumbo.Gumbo.Expr");
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

// Entry rule entryRuleExpr
entryRuleExpr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExprRule()); }
	iv_ruleExpr=ruleExpr
	{ $current=$iv_ruleExpr.current; }
	EOF;

// Rule Expr
ruleExpr returns [EObject current=null]
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
					$current = forceCreateModelElement(
						grammarAccess.getExprAccess().getBasicExpAction_0_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getExprAccess().getTermsSlangAccessParserRuleCall_0_1_0());
					}
					lv_terms_1_0=ruleSlangAccess
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExprRule());
						}
						add(
							$current,
							"terms",
							lv_terms_1_0,
							"org.sireum.aadl.gumbo.Gumbo.SlangAccess");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					(
						(
							{
								newCompositeNode(grammarAccess.getExprAccess().getOpsOperatorParserRuleCall_0_2_0_0_0());
							}
							lv_ops_2_0=ruleOperator
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getExprRule());
								}
								add(
									$current,
									"ops",
									lv_ops_2_0,
									"org.sireum.aadl.gumbo.Gumbo.Operator");
								afterParserOrEnumRuleCall();
							}
						)
					)
					(
						(
							{
								newCompositeNode(grammarAccess.getExprAccess().getTermsSlangAccessParserRuleCall_0_2_0_1_0());
							}
							lv_terms_3_0=ruleSlangAccess
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getExprRule());
								}
								add(
									$current,
									"terms",
									lv_terms_3_0,
									"org.sireum.aadl.gumbo.Gumbo.SlangAccess");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)*
				    |
				(
					otherlv_4=QuestionMark
					{
						newLeafNode(otherlv_4, grammarAccess.getExprAccess().getQuestionMarkKeyword_0_2_1_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getExprAccess().getThenExprExprParserRuleCall_0_2_1_1_0());
							}
							lv_thenExpr_5_0=ruleExpr
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getExprRule());
								}
								set(
									$current,
									"thenExpr",
									lv_thenExpr_5_0,
									"org.sireum.aadl.gumbo.Gumbo.Expr");
								afterParserOrEnumRuleCall();
							}
						)
					)
					otherlv_6=Colon
					{
						newLeafNode(otherlv_6, grammarAccess.getExprAccess().getColonKeyword_0_2_1_2());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getExprAccess().getElseExprExprParserRuleCall_0_2_1_3_0());
							}
							lv_elseExpr_7_0=ruleExpr
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getExprRule());
								}
								set(
									$current,
									"elseExpr",
									lv_elseExpr_7_0,
									"org.sireum.aadl.gumbo.Gumbo.Expr");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getExprAccess().getQuantifiedExpAction_1_0(),
						$current);
				}
			)
			(
				otherlv_9=All
				{
					newLeafNode(otherlv_9, grammarAccess.getExprAccess().getAllKeyword_1_1_0());
				}
				    |
				otherlv_10=Some
				{
					newLeafNode(otherlv_10, grammarAccess.getExprAccess().getSomeKeyword_1_1_1());
				}
				    |
				otherlv_11=ForAll
				{
					newLeafNode(otherlv_11, grammarAccess.getExprAccess().getForAllKeyword_1_1_2());
				}
				    |
				otherlv_12=ThereExists
				{
					newLeafNode(otherlv_12, grammarAccess.getExprAccess().getThereExistsKeyword_1_1_3());
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getExprAccess().getQVarSlangQuantVarParserRuleCall_1_2_0());
					}
					lv_qVar_13_0=ruleSlangQuantVar
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExprRule());
						}
						add(
							$current,
							"qVar",
							lv_qVar_13_0,
							"org.sireum.aadl.gumbo.Gumbo.SlangQuantVar");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_14=Comma
				{
					newLeafNode(otherlv_14, grammarAccess.getExprAccess().getCommaKeyword_1_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getExprAccess().getQVarSlangQuantVarParserRuleCall_1_3_1_0());
						}
						lv_qVar_15_0=ruleSlangQuantVar
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getExprRule());
							}
							add(
								$current,
								"qVar",
								lv_qVar_15_0,
								"org.sireum.aadl.gumbo.Gumbo.SlangQuantVar");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_16=EqualsSignGreaterThanSign
			{
				newLeafNode(otherlv_16, grammarAccess.getExprAccess().getEqualsSignGreaterThanSignKeyword_1_4());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getExprAccess().getQuantifiedExprExprParserRuleCall_1_5_0());
					}
					lv_quantifiedExpr_17_0=ruleExpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExprRule());
						}
						set(
							$current,
							"quantifiedExpr",
							lv_quantifiedExpr_17_0,
							"org.sireum.aadl.gumbo.Gumbo.Expr");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getExprAccess().getUnaryExpAction_2_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getExprAccess().getOpOperatorParserRuleCall_2_1_0());
					}
					lv_op_19_0=ruleOperator
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExprRule());
						}
						set(
							$current,
							"op",
							lv_op_19_0,
							"org.sireum.aadl.gumbo.Gumbo.Operator");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getExprAccess().getAccessExpSlangAccessParserRuleCall_2_2_0());
					}
					lv_accessExp_20_0=ruleSlangAccess
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExprRule());
						}
						set(
							$current,
							"accessExp",
							lv_accessExp_20_0,
							"org.sireum.aadl.gumbo.Gumbo.SlangAccess");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleSlangQuantVar
entryRuleSlangQuantVar returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlangQuantVarRule()); }
	iv_ruleSlangQuantVar=ruleSlangQuantVar
	{ $current=$iv_ruleSlangQuantVar.current; }
	EOF;

// Rule SlangQuantVar
ruleSlangQuantVar returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			newLeafNode(this_ID_0, grammarAccess.getSlangQuantVarAccess().getIDTerminalRuleCall_0());
		}
		otherlv_1=Colon
		{
			newLeafNode(otherlv_1, grammarAccess.getSlangQuantVarAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSlangQuantVarAccess().getEExprParserRuleCall_2_0());
				}
				lv_e_2_0=ruleExpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangQuantVarRule());
					}
					set(
						$current,
						"e",
						lv_e_2_0,
						"org.sireum.aadl.gumbo.Gumbo.Expr");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				otherlv_3=FullStopFullStop
				{
					newLeafNode(otherlv_3, grammarAccess.getSlangQuantVarAccess().getFullStopFullStopKeyword_3_0_0());
				}
				    |
				otherlv_4=FullStopFullStopLessThanSign
				{
					newLeafNode(otherlv_4, grammarAccess.getSlangQuantVarAccess().getFullStopFullStopLessThanSignKeyword_3_0_1());
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getSlangQuantVarAccess().getUpperBoundExprParserRuleCall_3_1_0());
					}
					lv_upperBound_5_0=ruleExpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangQuantVarRule());
						}
						set(
							$current,
							"upperBound",
							lv_upperBound_5_0,
							"org.sireum.aadl.gumbo.Gumbo.Expr");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
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

// Entry rule entryRuleSlangAccess
entryRuleSlangAccess returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlangAccessRule()); }
	iv_ruleSlangAccess=ruleSlangAccess
	{ $current=$iv_ruleSlangAccess.current; }
	EOF;

// Rule SlangAccess
ruleSlangAccess returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getSlangAccessAccess().getSlangAccessAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getSlangAccessAccess().getTSlangTermParserRuleCall_1_0());
				}
				lv_t_1_0=ruleSlangTerm
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangAccessRule());
					}
					set(
						$current,
						"t",
						lv_t_1_0,
						"org.sireum.aadl.gumbo.Gumbo.SlangTerm");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleSlangTerm
entryRuleSlangTerm returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlangTermRule()); }
	iv_ruleSlangTerm=ruleSlangTerm
	{ $current=$iv_ruleSlangTerm.current; }
	EOF;

// Rule SlangTerm
ruleSlangTerm returns [EObject current=null]
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
					$current = forceCreateModelElement(
						grammarAccess.getSlangTermAccess().getSlangLitTermAction_0_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getSlangTermAccess().getLitSlangLitParserRuleCall_0_1_0());
					}
					lv_lit_1_0=ruleSlangLit
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangTermRule());
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
					$current = forceCreateModelElement(
						grammarAccess.getSlangTermAccess().getSlangInterpTermAction_1_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getSlangTermAccess().getISlangInterpParserRuleCall_1_1_0());
					}
					lv_i_3_0=ruleSlangInterp
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangTermRule());
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
				((
					(
					)
					Enum
					LeftParenthesis
				)
				)=>
				(
					(
						{
							$current = forceCreateModelElement(
								grammarAccess.getSlangTermAccess().getEnumLitExprAction_2_0_0_0(),
								$current);
						}
					)
					otherlv_5=Enum
					{
						newLeafNode(otherlv_5, grammarAccess.getSlangTermAccess().getEnumKeyword_2_0_0_1());
					}
					otherlv_6=LeftParenthesis
					{
						newLeafNode(otherlv_6, grammarAccess.getSlangTermAccess().getLeftParenthesisKeyword_2_0_0_2());
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getSlangTermAccess().getEnumTypeDataElementParserRuleCall_2_1_0());
					}
					lv_enumType_7_0=ruleDataElement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangTermRule());
						}
						set(
							$current,
							"enumType",
							lv_enumType_7_0,
							"org.sireum.aadl.gumbo.Gumbo.DataElement");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_8=Comma
			{
				newLeafNode(otherlv_8, grammarAccess.getSlangTermAccess().getCommaKeyword_2_2());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSlangTermRule());
						}
					}
					otherlv_9=RULE_ID
					{
						newLeafNode(otherlv_9, grammarAccess.getSlangTermAccess().getValueStringLiteralCrossReference_2_3_0());
					}
				)
			)
			otherlv_10=RightParenthesis
			{
				newLeafNode(otherlv_10, grammarAccess.getSlangTermAccess().getRightParenthesisKeyword_2_4());
			}
		)
		    |
		(
			(
				((
					(
					)
					(
						(
							ruleDataElement
						)
					)
					LeftCurlyBracket
					(
						(
							RULE_ID
						)
					)
					EqualsSign
				)
				)=>
				(
					(
						{
							$current = forceCreateModelElement(
								grammarAccess.getSlangTermAccess().getRecordLitExprAction_3_0_0_0(),
								$current);
						}
					)
					(
						(
							{
								newCompositeNode(grammarAccess.getSlangTermAccess().getRecordTypeDataElementParserRuleCall_3_0_0_1_0());
							}
							lv_recordType_12_0=ruleDataElement
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getSlangTermRule());
								}
								set(
									$current,
									"recordType",
									lv_recordType_12_0,
									"org.sireum.aadl.gumbo.Gumbo.DataElement");
								afterParserOrEnumRuleCall();
							}
						)
					)
					otherlv_13=LeftCurlyBracket
					{
						newLeafNode(otherlv_13, grammarAccess.getSlangTermAccess().getLeftCurlyBracketKeyword_3_0_0_2());
					}
					(
						(
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getSlangTermRule());
								}
							}
							otherlv_14=RULE_ID
							{
								newLeafNode(otherlv_14, grammarAccess.getSlangTermAccess().getArgsNamedElementCrossReference_3_0_0_3_0());
							}
						)
					)
					otherlv_15=EqualsSign
					{
						newLeafNode(otherlv_15, grammarAccess.getSlangTermAccess().getEqualsSignKeyword_3_0_0_4());
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getSlangTermAccess().getArgExprExprParserRuleCall_3_1_0());
					}
					lv_argExpr_16_0=ruleExpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangTermRule());
						}
						add(
							$current,
							"argExpr",
							lv_argExpr_16_0,
							"org.sireum.aadl.gumbo.Gumbo.Expr");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_17=Semicolon
				{
					newLeafNode(otherlv_17, grammarAccess.getSlangTermAccess().getSemicolonKeyword_3_2_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getSlangTermRule());
							}
						}
						otherlv_18=RULE_ID
						{
							newLeafNode(otherlv_18, grammarAccess.getSlangTermAccess().getArgsNamedElementCrossReference_3_2_1_0());
						}
					)
				)
				otherlv_19=EqualsSign
				{
					newLeafNode(otherlv_19, grammarAccess.getSlangTermAccess().getEqualsSignKeyword_3_2_2());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getSlangTermAccess().getArgExprExprParserRuleCall_3_2_3_0());
						}
						lv_argExpr_20_0=ruleExpr
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSlangTermRule());
							}
							add(
								$current,
								"argExpr",
								lv_argExpr_20_0,
								"org.sireum.aadl.gumbo.Gumbo.Expr");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_21=RightCurlyBracket
			{
				newLeafNode(otherlv_21, grammarAccess.getSlangTermAccess().getRightCurlyBracketKeyword_3_3());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSlangTermAccess().getDataRefExprAction_4_0(),
						$current);
				}
			)
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSlangTermRule());
						}
					}
					otherlv_23=RULE_ID
					{
						newLeafNode(otherlv_23, grammarAccess.getSlangTermAccess().getPortOrSubcomponentOrStateVarEObjectCrossReference_4_1_0());
					}
				)
			)
			(
				otherlv_24=FullStop
				{
					newLeafNode(otherlv_24, grammarAccess.getSlangTermAccess().getFullStopKeyword_4_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getSlangTermAccess().getRefOtherDataRefParserRuleCall_4_2_1_0());
						}
						lv_ref_25_0=ruleOtherDataRef
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSlangTermRule());
							}
							set(
								$current,
								"ref",
								lv_ref_25_0,
								"org.sireum.aadl.gumbo.Gumbo.OtherDataRef");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)?
			(
				(
					{
						newCompositeNode(grammarAccess.getSlangTermAccess().getCsSlangCallSuffixParserRuleCall_4_3_0());
					}
					lv_cs_26_0=ruleSlangCallSuffix
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangTermRule());
						}
						set(
							$current,
							"cs",
							lv_cs_26_0,
							"org.sireum.aadl.gumbo.Gumbo.SlangCallSuffix");
						afterParserOrEnumRuleCall();
					}
				)
			)?
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSlangTermAccess().getSlangTupleTermAction_5_0(),
						$current);
				}
			)
			otherlv_28=LeftParenthesis
			{
				newLeafNode(otherlv_28, grammarAccess.getSlangTermAccess().getLeftParenthesisKeyword_5_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSlangTermAccess().getEExprParserRuleCall_5_2_0());
					}
					lv_e_29_0=ruleExpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangTermRule());
						}
						add(
							$current,
							"e",
							lv_e_29_0,
							"org.sireum.aadl.gumbo.Gumbo.Expr");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_30=Comma
				{
					newLeafNode(otherlv_30, grammarAccess.getSlangTermAccess().getCommaKeyword_5_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getSlangTermAccess().getEExprParserRuleCall_5_3_1_0());
						}
						lv_e_31_0=ruleExpr
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSlangTermRule());
							}
							add(
								$current,
								"e",
								lv_e_31_0,
								"org.sireum.aadl.gumbo.Gumbo.Expr");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_32=RightParenthesis
			{
				newLeafNode(otherlv_32, grammarAccess.getSlangTermAccess().getRightParenthesisKeyword_5_4());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSlangTermAccess().getSlangForTermAction_6_0(),
						$current);
				}
			)
			otherlv_34=For
			{
				newLeafNode(otherlv_34, grammarAccess.getSlangTermAccess().getForKeyword_6_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSlangTermAccess().getRSlangForRangeParserRuleCall_6_2_0());
					}
					lv_r_35_0=ruleSlangForRange
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangTermRule());
						}
						add(
							$current,
							"r",
							lv_r_35_0,
							"org.sireum.aadl.gumbo.Gumbo.SlangForRange");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_36=Comma
				{
					newLeafNode(otherlv_36, grammarAccess.getSlangTermAccess().getCommaKeyword_6_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getSlangTermAccess().getRSlangForRangeParserRuleCall_6_3_1_0());
						}
						lv_r_37_0=ruleSlangForRange
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSlangTermRule());
							}
							add(
								$current,
								"r",
								lv_r_37_0,
								"org.sireum.aadl.gumbo.Gumbo.SlangForRange");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_38=Yield
			{
				newLeafNode(otherlv_38, grammarAccess.getSlangTermAccess().getYieldKeyword_6_4());
			}
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getSlangTermAccess().getBSlangBlockParserRuleCall_6_5_0_0());
						}
						lv_b_39_0=ruleSlangBlock
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSlangTermRule());
							}
							set(
								$current,
								"b",
								lv_b_39_0,
								"org.sireum.aadl.gumbo.Gumbo.SlangBlock");
							afterParserOrEnumRuleCall();
						}
					)
				)
				    |
				(
					otherlv_40=LeftParenthesis
					{
						newLeafNode(otherlv_40, grammarAccess.getSlangTermAccess().getLeftParenthesisKeyword_6_5_1_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getSlangTermAccess().getEExprParserRuleCall_6_5_1_1_0());
							}
							lv_e_41_0=ruleExpr
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getSlangTermRule());
								}
								set(
									$current,
									"e",
									lv_e_41_0,
									"org.sireum.aadl.gumbo.Gumbo.Expr");
								afterParserOrEnumRuleCall();
							}
						)
					)
					otherlv_42=RightParenthesis
					{
						newLeafNode(otherlv_42, grammarAccess.getSlangTermAccess().getRightParenthesisKeyword_6_5_1_2());
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSlangTermAccess().getSlangBlockTermAction_7_0(),
						$current);
				}
			)
			otherlv_44=LeftCurlyBracket
			{
				newLeafNode(otherlv_44, grammarAccess.getSlangTermAccess().getLeftCurlyBracketKeyword_7_1());
			}
			(
				(
					(
						(
							(
								{
									newCompositeNode(grammarAccess.getSlangTermAccess().getPSlangParamsParserRuleCall_7_2_0_0_0_0());
								}
								lv_p_45_0=ruleSlangParams
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getSlangTermRule());
									}
									set(
										$current,
										"p",
										lv_p_45_0,
										"org.sireum.aadl.gumbo.Gumbo.SlangParams");
									afterParserOrEnumRuleCall();
								}
							)
						)
						otherlv_46=EqualsSignGreaterThanSign
						{
							newLeafNode(otherlv_46, grammarAccess.getSlangTermAccess().getEqualsSignGreaterThanSignKeyword_7_2_0_0_1());
						}
					)?
					(
						(
							{
								newCompositeNode(grammarAccess.getSlangTermAccess().getEExprParserRuleCall_7_2_0_1_0());
							}
							lv_e_47_0=ruleExpr
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getSlangTermRule());
								}
								set(
									$current,
									"e",
									lv_e_47_0,
									"org.sireum.aadl.gumbo.Gumbo.Expr");
								afterParserOrEnumRuleCall();
							}
						)
					)
					otherlv_48=RightCurlyBracket
					{
						newLeafNode(otherlv_48, grammarAccess.getSlangTermAccess().getRightCurlyBracketKeyword_7_2_0_2());
					}
				)
				    |
				(
					(
						(
							{
								newCompositeNode(grammarAccess.getSlangTermAccess().getStmtSlangStmtParserRuleCall_7_2_1_0_0());
							}
							lv_stmt_49_0=ruleSlangStmt
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getSlangTermRule());
								}
								add(
									$current,
									"stmt",
									lv_stmt_49_0,
									"org.sireum.aadl.gumbo.Gumbo.SlangStmt");
								afterParserOrEnumRuleCall();
							}
						)
					)*
					(
						(
							{
								newCompositeNode(grammarAccess.getSlangTermAccess().getRSlangRetParserRuleCall_7_2_1_1_0());
							}
							lv_r_50_0=ruleSlangRet
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getSlangTermRule());
								}
								set(
									$current,
									"r",
									lv_r_50_0,
									"org.sireum.aadl.gumbo.Gumbo.SlangRet");
								afterParserOrEnumRuleCall();
							}
						)
					)?
					otherlv_51=RightCurlyBracket
					{
						newLeafNode(otherlv_51, grammarAccess.getSlangTermAccess().getRightCurlyBracketKeyword_7_2_1_2());
					}
				)
			)
		)
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
					newCompositeNode(grammarAccess.getSlangForRangeAccess().getEExprParserRuleCall_2_0());
				}
				lv_e_2_0=ruleExpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangForRangeRule());
					}
					set(
						$current,
						"e",
						lv_e_2_0,
						"org.sireum.aadl.gumbo.Gumbo.Expr");
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
						newCompositeNode(grammarAccess.getSlangForRangeAccess().getUpperExprParserRuleCall_3_1_0());
					}
					lv_upper_5_0=ruleExpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangForRangeRule());
						}
						set(
							$current,
							"upper",
							lv_upper_5_0,
							"org.sireum.aadl.gumbo.Gumbo.Expr");
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
							newCompositeNode(grammarAccess.getSlangForRangeAccess().getStepExprParserRuleCall_3_2_1_0());
						}
						lv_step_7_0=ruleExpr
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSlangForRangeRule());
							}
							set(
								$current,
								"step",
								lv_step_7_0,
								"org.sireum.aadl.gumbo.Gumbo.Expr");
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
					newCompositeNode(grammarAccess.getSlangRetAccess().getEExprParserRuleCall_2_0());
				}
				lv_e_2_0=ruleExpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangRetRule());
					}
					set(
						$current,
						"e",
						lv_e_2_0,
						"org.sireum.aadl.gumbo.Gumbo.Expr");
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
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSlangCallSuffixAccess().getSlangCallSuffixAction_0_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getSlangCallSuffixAccess().getTaSlangTypeArgsParserRuleCall_0_1_0());
					}
					lv_ta_1_0=ruleSlangTypeArgs
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangCallSuffixRule());
						}
						set(
							$current,
							"ta",
							lv_ta_1_0,
							"org.sireum.aadl.gumbo.Gumbo.SlangTypeArgs");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getSlangCallSuffixAccess().getCaSlangCallArgsParserRuleCall_0_2_0());
					}
					lv_ca_2_0=ruleSlangCallArgs
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangCallSuffixRule());
						}
						set(
							$current,
							"ca",
							lv_ca_2_0,
							"org.sireum.aadl.gumbo.Gumbo.SlangCallArgs");
						afterParserOrEnumRuleCall();
					}
				)
			)?
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getSlangCallSuffixAccess().getCaSlangCallArgsParserRuleCall_1_0());
				}
				lv_ca_3_0=ruleSlangCallArgs
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangCallSuffixRule());
					}
					set(
						$current,
						"ca",
						lv_ca_3_0,
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
						newCompositeNode(grammarAccess.getSlangCallArgsAccess().getArgSlangIDExpParserRuleCall_2_0_0());
					}
					lv_arg_2_0=ruleSlangIDExp
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangCallArgsRule());
						}
						add(
							$current,
							"arg",
							lv_arg_2_0,
							"org.sireum.aadl.gumbo.Gumbo.SlangIDExp");
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
							newCompositeNode(grammarAccess.getSlangCallArgsAccess().getArgSlangIDExpParserRuleCall_2_1_1_0());
						}
						lv_arg_4_0=ruleSlangIDExp
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSlangCallArgsRule());
							}
							add(
								$current,
								"arg",
								lv_arg_4_0,
								"org.sireum.aadl.gumbo.Gumbo.SlangIDExp");
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

// Entry rule entryRuleSlangIDExp
entryRuleSlangIDExp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlangIDExpRule()); }
	iv_ruleSlangIDExp=ruleSlangIDExp
	{ $current=$iv_ruleSlangIDExp.current; }
	EOF;

// Rule SlangIDExp
ruleSlangIDExp returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getSlangIDExpAccess().getEExprParserRuleCall_0_0());
				}
				lv_e_0_0=ruleExpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangIDExpRule());
					}
					add(
						$current,
						"e",
						lv_e_0_0,
						"org.sireum.aadl.gumbo.Gumbo.Expr");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1=ColonEqualsSign
			{
				newLeafNode(otherlv_1, grammarAccess.getSlangIDExpAccess().getColonEqualsSignKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSlangIDExpAccess().getEExprParserRuleCall_1_1_0());
					}
					lv_e_2_0=ruleExpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangIDExpRule());
						}
						add(
							$current,
							"e",
							lv_e_2_0,
							"org.sireum.aadl.gumbo.Gumbo.Expr");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
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
				if ($current==null) {
					$current = createModelElement(grammarAccess.getSlangBaseTypeRule());
				}
			}
			{
				newCompositeNode(grammarAccess.getSlangBaseTypeAccess().getTypeNameDataSubcomponentTypeCrossReference_0());
			}
			ruleQCREF
			{
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleSlangTypeArgs
entryRuleSlangTypeArgs returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlangTypeArgsRule()); }
	iv_ruleSlangTypeArgs=ruleSlangTypeArgs
	{ $current=$iv_ruleSlangTypeArgs.current; }
	EOF;

// Rule SlangTypeArgs
ruleSlangTypeArgs returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=LeftSquareBracket
		{
			newLeafNode(otherlv_0, grammarAccess.getSlangTypeArgsAccess().getLeftSquareBracketKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSlangTypeArgsAccess().getTypesSlangTypeParserRuleCall_1_0());
				}
				lv_types_1_0=ruleSlangType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangTypeArgsRule());
					}
					add(
						$current,
						"types",
						lv_types_1_0,
						"org.sireum.aadl.gumbo.Gumbo.SlangType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2=Comma
			{
				newLeafNode(otherlv_2, grammarAccess.getSlangTypeArgsAccess().getCommaKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSlangTypeArgsAccess().getTypesSlangTypeParserRuleCall_2_1_0());
					}
					lv_types_3_0=ruleSlangType
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlangTypeArgsRule());
						}
						add(
							$current,
							"types",
							lv_types_3_0,
							"org.sireum.aadl.gumbo.Gumbo.SlangType");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_4=RightSquareBracket
		{
			newLeafNode(otherlv_4, grammarAccess.getSlangTypeArgsAccess().getRightSquareBracketKeyword_3());
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
					)
				)
			)
		)
		    |
		(
			(
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
					$current = forceCreateModelElement(
						grammarAccess.getSlangLitAccess().getIntIdfLitAction_2_0(),
						$current);
				}
			)
			(
				(
					lv_value_5_0=RULE_INT_IDF
					{
						newLeafNode(lv_value_5_0, grammarAccess.getSlangLitAccess().getValueINT_IDFTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSlangLitRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_5_0,
							"org.sireum.aadl.gumbo.Gumbo.INT_IDF");
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSlangLitAccess().getHexLitAction_3_0(),
						$current);
				}
			)
			(
				(
					lv_value_7_0=RULE_HEX
					{
						newLeafNode(lv_value_7_0, grammarAccess.getSlangLitAccess().getValueHEXTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSlangLitRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_7_0,
							"org.sireum.aadl.gumbo.Gumbo.HEX");
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSlangLitAccess().getBinLitAction_4_0(),
						$current);
				}
			)
			(
				(
					lv_value_9_0=RULE_BIN
					{
						newLeafNode(lv_value_9_0, grammarAccess.getSlangLitAccess().getValueBINTerminalRuleCall_4_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSlangLitRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_9_0,
							"org.sireum.aadl.gumbo.Gumbo.BIN");
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSlangLitAccess().getRealLitAction_5_0(),
						$current);
				}
			)
			(
				(
					lv_value_11_0=RULE_REAL_LIT
					{
						newLeafNode(lv_value_11_0, grammarAccess.getSlangLitAccess().getValueREAL_LITTerminalRuleCall_5_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSlangLitRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_11_0,
							"org.osate.xtext.aadl2.properties.Properties.REAL_LIT");
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSlangLitAccess().getSlangStringLitAction_6_0(),
						$current);
				}
			)
			(
				(
					lv_value_13_0=RULE_SLANG_STRING
					{
						newLeafNode(lv_value_13_0, grammarAccess.getSlangLitAccess().getValueSLANG_STRINGTerminalRuleCall_6_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSlangLitRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_13_0,
							"org.sireum.aadl.gumbo.Gumbo.SLANG_STRING");
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSlangLitAccess().getRealIdfLitAction_7_0(),
						$current);
				}
			)
			(
				(
					lv_value_15_0=RULE_REAL_IDF
					{
						newLeafNode(lv_value_15_0, grammarAccess.getSlangLitAccess().getValueREAL_IDFTerminalRuleCall_7_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSlangLitRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_15_0,
							"org.sireum.aadl.gumbo.Gumbo.REAL_IDF");
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSlangLitAccess().getMStringLitAction_8_0(),
						$current);
				}
			)
			(
				(
					lv_value_17_0=RULE_MSTRING
					{
						newLeafNode(lv_value_17_0, grammarAccess.getSlangLitAccess().getValueMSTRINGTerminalRuleCall_8_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSlangLitRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_17_0,
							"org.sireum.aadl.gumbo.Gumbo.MSTRING");
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
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSlangInterpAccess().getSlangInterpAction_0_0(),
						$current);
				}
			)
			this_MSP_1=RULE_MSP
			{
				newLeafNode(this_MSP_1, grammarAccess.getSlangInterpAccess().getMSPTerminalRuleCall_0_1());
			}
		)
		    |
		(
			this_MSPB_2=RULE_MSPB
			{
				newLeafNode(this_MSPB_2, grammarAccess.getSlangInterpAccess().getMSPBTerminalRuleCall_1_0());
			}
			{
				newCompositeNode(grammarAccess.getSlangInterpAccess().getSlangMInterpParserRuleCall_1_1());
			}
			this_SlangMInterp_3=ruleSlangMInterp
			{
				$current = $this_SlangMInterp_3.current;
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleSlangMInterp
entryRuleSlangMInterp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlangMInterpRule()); }
	iv_ruleSlangMInterp=ruleSlangMInterp
	{ $current=$iv_ruleSlangMInterp.current; }
	EOF;

// Rule SlangMInterp
ruleSlangMInterp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=LeftCurlyBracket
		{
			newLeafNode(otherlv_0, grammarAccess.getSlangMInterpAccess().getLeftCurlyBracketKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSlangMInterpAccess().getEExprParserRuleCall_1_0());
				}
				lv_e_1_0=ruleExpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSlangMInterpRule());
					}
					set(
						$current,
						"e",
						lv_e_1_0,
						"org.sireum.aadl.gumbo.Gumbo.Expr");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2=RightCurlyBracket
		{
			newLeafNode(otherlv_2, grammarAccess.getSlangMInterpAccess().getRightCurlyBracketKeyword_2());
		}
		(
			(
				this_MSPM_3=RULE_MSPM
				{
					newLeafNode(this_MSPM_3, grammarAccess.getSlangMInterpAccess().getMSPMTerminalRuleCall_3_0_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getSlangMInterpAccess().getMSlangMInterpParserRuleCall_3_0_1_0());
						}
						lv_m_4_0=ruleSlangMInterp
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSlangMInterpRule());
							}
							set(
								$current,
								"m",
								lv_m_4_0,
								"org.sireum.aadl.gumbo.Gumbo.SlangMInterp");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			this_MSPE_5=RULE_MSPE
			{
				newLeafNode(this_MSPE_5, grammarAccess.getSlangMInterpAccess().getMSPETerminalRuleCall_3_1());
			}
		)
	)
;

// Entry rule entryRuleOperator
entryRuleOperator returns [String current=null]:
	{ newCompositeNode(grammarAccess.getOperatorRule()); }
	iv_ruleOperator=ruleOperator
	{ $current=$iv_ruleOperator.current.getText(); }
	EOF;

// Rule Operator
ruleOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_OP_0=RULE_OP
		{
			$current.merge(this_OP_0);
		}
		{
			newLeafNode(this_OP_0, grammarAccess.getOperatorAccess().getOPTerminalRuleCall_0());
		}
		    |
		{
			newCompositeNode(grammarAccess.getOperatorAccess().getPlusMinusParserRuleCall_1());
		}
		this_PlusMinus_1=rulePlusMinus
		{
			$current.merge(this_PlusMinus_1);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getOperatorAccess().getSTARParserRuleCall_2());
		}
		this_STAR_2=ruleSTAR
		{
			$current.merge(this_STAR_2);
		}
		{
			afterParserOrEnumRuleCall();
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
			newCompositeNode(grammarAccess.getPropertyExpressionAccess().getRecordTermParserRuleCall_0());
		}
		this_RecordTerm_0=ruleRecordTerm
		{
			$current = $this_RecordTerm_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
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
			newCompositeNode(grammarAccess.getPropertyExpressionAccess().getComponentClassifierTermParserRuleCall_2());
		}
		this_ComponentClassifierTerm_2=ruleComponentClassifierTerm
		{
			$current = $this_ComponentClassifierTerm_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
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
			newCompositeNode(grammarAccess.getPropertyExpressionAccess().getStringTermParserRuleCall_4());
		}
		this_StringTerm_4=ruleStringTerm
		{
			$current = $this_StringTerm_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
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
			newCompositeNode(grammarAccess.getPropertyExpressionAccess().getRealTermParserRuleCall_6());
		}
		this_RealTerm_6=ruleRealTerm
		{
			$current = $this_RealTerm_6.current;
			afterParserOrEnumRuleCall();
		}
		    |
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
			newCompositeNode(grammarAccess.getPropertyExpressionAccess().getListTermParserRuleCall_8());
		}
		this_ListTerm_8=ruleListTerm
		{
			$current = $this_ListTerm_8.current;
			afterParserOrEnumRuleCall();
		}
		    |
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
			newCompositeNode(grammarAccess.getNumAltAccess().getRealTermParserRuleCall_0());
		}
		this_RealTerm_0=ruleRealTerm
		{
			$current = $this_RealTerm_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
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
			newCompositeNode(grammarAccess.getNumAltAccess().getSignedConstantParserRuleCall_2());
		}
		this_SignedConstant_2=ruleSignedConstant
		{
			$current = $this_SignedConstant_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
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
		kw=In
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
		kw=In
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
