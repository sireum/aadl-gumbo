
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
			(
				{
					newCompositeNode(grammarAccess.getSpecSectionAccess().getStateStateParserRuleCall_0_0());
				}
				lv_state_0_0=ruleState
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSpecSectionRule());
					}
					set(
						$current,
						"state",
						lv_state_0_0,
						"org.sireum.aadl.gumbo.Gumbo.State");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getSpecSectionAccess().getInvariantsInvariantsParserRuleCall_1_0());
				}
				lv_invariants_1_0=ruleInvariants
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSpecSectionRule());
					}
					set(
						$current,
						"invariants",
						lv_invariants_1_0,
						"org.sireum.aadl.gumbo.Gumbo.Invariants");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getSpecSectionAccess().getIntegrationIntegrationParserRuleCall_2_0());
				}
				lv_integration_2_0=ruleIntegration
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSpecSectionRule());
					}
					set(
						$current,
						"integration",
						lv_integration_2_0,
						"org.sireum.aadl.gumbo.Gumbo.Integration");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getSpecSectionAccess().getInitializeInitializeParserRuleCall_3_0());
				}
				lv_initialize_3_0=ruleInitialize
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSpecSectionRule());
					}
					set(
						$current,
						"initialize",
						lv_initialize_3_0,
						"org.sireum.aadl.gumbo.Gumbo.Initialize");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getSpecSectionAccess().getComputeComputeParserRuleCall_4_0());
				}
				lv_compute_4_0=ruleCompute
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSpecSectionRule());
					}
					set(
						$current,
						"compute",
						lv_compute_4_0,
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
				lv_displayName_1_0=RULE_STRING
				{
					newLeafNode(lv_displayName_1_0, grammarAccess.getInvSpecAccess().getDisplayNameSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInvSpecRule());
					}
					setWithLastConsumed(
						$current,
						"displayName",
						lv_displayName_1_0,
						"org.osate.xtext.aadl2.properties.Properties.STRING");
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
	{
		newCompositeNode(grammarAccess.getInitializeSpecStatementAccess().getGuaranteeStatementParserRuleCall());
	}
	this_GuaranteeStatement_0=ruleGuaranteeStatement
	{
		$current = $this_GuaranteeStatement_0.current;
		afterParserOrEnumRuleCall();
	}
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
				lv_displayName_1_0=RULE_STRING
				{
					newLeafNode(lv_displayName_1_0, grammarAccess.getCaseStatementClauseAccess().getDisplayNameSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCaseStatementClauseRule());
					}
					setWithLastConsumed(
						$current,
						"displayName",
						lv_displayName_1_0,
						"org.osate.xtext.aadl2.properties.Properties.STRING");
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
				lv_displayName_1_0=RULE_STRING
				{
					newLeafNode(lv_displayName_1_0, grammarAccess.getAssumeStatementAccess().getDisplayNameSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAssumeStatementRule());
					}
					setWithLastConsumed(
						$current,
						"displayName",
						lv_displayName_1_0,
						"org.osate.xtext.aadl2.properties.Properties.STRING");
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
				lv_displayName_1_0=RULE_STRING
				{
					newLeafNode(lv_displayName_1_0, grammarAccess.getGuaranteeStatementAccess().getDisplayNameSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGuaranteeStatementRule());
					}
					setWithLastConsumed(
						$current,
						"displayName",
						lv_displayName_1_0,
						"org.osate.xtext.aadl2.properties.Properties.STRING");
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
	{
		newCompositeNode(grammarAccess.getExprAccess().getImpliesExprParserRuleCall());
	}
	this_ImpliesExpr_0=ruleImpliesExpr
	{
		$current = $this_ImpliesExpr_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleImpliesExpr
entryRuleImpliesExpr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getImpliesExprRule()); }
	iv_ruleImpliesExpr=ruleImpliesExpr
	{ $current=$iv_ruleImpliesExpr.current; }
	EOF;

// Rule ImpliesExpr
ruleImpliesExpr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getImpliesExprAccess().getEquivExprParserRuleCall_0());
		}
		this_EquivExpr_0=ruleEquivExpr
		{
			$current = $this_EquivExpr_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				((
					(
					)
					(
						EqualsSignGreaterThanSign
						    |
						Implies
					)
				)
				)=>
				(
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getImpliesExprAccess().getBinaryExprLeftAction_1_0_0_0(),
								$current);
						}
					)
					(
						otherlv_2=EqualsSignGreaterThanSign
						{
							newLeafNode(otherlv_2, grammarAccess.getImpliesExprAccess().getEqualsSignGreaterThanSignKeyword_1_0_0_1_0());
						}
						    |
						otherlv_3=Implies
						{
							newLeafNode(otherlv_3, grammarAccess.getImpliesExprAccess().getImpliesKeyword_1_0_0_1_1());
						}
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getImpliesExprAccess().getRightImpliesExprParserRuleCall_1_1_0());
					}
					lv_right_4_0=ruleImpliesExpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getImpliesExprRule());
						}
						set(
							$current,
							"right",
							lv_right_4_0,
							"org.sireum.aadl.gumbo.Gumbo.ImpliesExpr");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleEquivExpr
entryRuleEquivExpr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEquivExprRule()); }
	iv_ruleEquivExpr=ruleEquivExpr
	{ $current=$iv_ruleEquivExpr.current; }
	EOF;

// Rule EquivExpr
ruleEquivExpr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getEquivExprAccess().getOrExprParserRuleCall_0());
		}
		this_OrExpr_0=ruleOrExpr
		{
			$current = $this_OrExpr_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				((
					(
					)
					(
						(
							LessThanSignEqualsSignGreaterThanSign
						)
					)
				)
				)=>
				(
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getEquivExprAccess().getBinaryExprLeftAction_1_0_0_0(),
								$current);
						}
					)
					(
						(
							lv_op_2_0=LessThanSignEqualsSignGreaterThanSign
							{
								newLeafNode(lv_op_2_0, grammarAccess.getEquivExprAccess().getOpLessThanSignEqualsSignGreaterThanSignKeyword_1_0_0_1_0());
							}
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getEquivExprRule());
								}
								setWithLastConsumed($current, "op", lv_op_2_0, "<=>");
							}
						)
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getEquivExprAccess().getRightOrExprParserRuleCall_1_1_0());
					}
					lv_right_3_0=ruleOrExpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEquivExprRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.sireum.aadl.gumbo.Gumbo.OrExpr");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleOrExpr
entryRuleOrExpr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOrExprRule()); }
	iv_ruleOrExpr=ruleOrExpr
	{ $current=$iv_ruleOrExpr.current; }
	EOF;

// Rule OrExpr
ruleOrExpr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getOrExprAccess().getAndExprParserRuleCall_0());
		}
		this_AndExpr_0=ruleAndExpr
		{
			$current = $this_AndExpr_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				((
					(
					)
					(
						(
							(
								Or
							)
						)
						    |
						(
							(
								Orelse
							)
						)
					)
				)
				)=>
				(
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getOrExprAccess().getBinaryExprLeftAction_1_0_0_0(),
								$current);
						}
					)
					(
						(
							(
								lv_op_2_0=Or
								{
									newLeafNode(lv_op_2_0, grammarAccess.getOrExprAccess().getOpOrKeyword_1_0_0_1_0_0());
								}
								{
									if ($current==null) {
										$current = createModelElement(grammarAccess.getOrExprRule());
									}
									setWithLastConsumed($current, "op", lv_op_2_0, "or");
								}
							)
						)
						    |
						(
							(
								lv_op_3_0=Orelse
								{
									newLeafNode(lv_op_3_0, grammarAccess.getOrExprAccess().getOpOrelseKeyword_1_0_0_1_1_0());
								}
								{
									if ($current==null) {
										$current = createModelElement(grammarAccess.getOrExprRule());
									}
									setWithLastConsumed($current, "op", lv_op_3_0, "orelse");
								}
							)
						)
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getOrExprAccess().getRightAndExprParserRuleCall_1_1_0());
					}
					lv_right_4_0=ruleAndExpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getOrExprRule());
						}
						set(
							$current,
							"right",
							lv_right_4_0,
							"org.sireum.aadl.gumbo.Gumbo.AndExpr");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleAndExpr
entryRuleAndExpr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAndExprRule()); }
	iv_ruleAndExpr=ruleAndExpr
	{ $current=$iv_ruleAndExpr.current; }
	EOF;

// Rule AndExpr
ruleAndExpr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAndExprAccess().getRelationalExprParserRuleCall_0());
		}
		this_RelationalExpr_0=ruleRelationalExpr
		{
			$current = $this_RelationalExpr_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				((
					(
					)
					(
						(
							(
								And
							)
						)
						    |
						(
							(
								Andthen
							)
						)
					)
				)
				)=>
				(
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getAndExprAccess().getBinaryExprLeftAction_1_0_0_0(),
								$current);
						}
					)
					(
						(
							(
								lv_op_2_0=And
								{
									newLeafNode(lv_op_2_0, grammarAccess.getAndExprAccess().getOpAndKeyword_1_0_0_1_0_0());
								}
								{
									if ($current==null) {
										$current = createModelElement(grammarAccess.getAndExprRule());
									}
									setWithLastConsumed($current, "op", lv_op_2_0, "and");
								}
							)
						)
						    |
						(
							(
								lv_op_3_0=Andthen
								{
									newLeafNode(lv_op_3_0, grammarAccess.getAndExprAccess().getOpAndthenKeyword_1_0_0_1_1_0());
								}
								{
									if ($current==null) {
										$current = createModelElement(grammarAccess.getAndExprRule());
									}
									setWithLastConsumed($current, "op", lv_op_3_0, "andthen");
								}
							)
						)
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getAndExprAccess().getRightRelationalExprParserRuleCall_1_1_0());
					}
					lv_right_4_0=ruleRelationalExpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAndExprRule());
						}
						set(
							$current,
							"right",
							lv_right_4_0,
							"org.sireum.aadl.gumbo.Gumbo.RelationalExpr");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleRelationalOp
entryRuleRelationalOp returns [String current=null]:
	{ newCompositeNode(grammarAccess.getRelationalOpRule()); }
	iv_ruleRelationalOp=ruleRelationalOp
	{ $current=$iv_ruleRelationalOp.current.getText(); }
	EOF;

// Rule RelationalOp
ruleRelationalOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw=LessThanSign
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getRelationalOpAccess().getLessThanSignKeyword_0());
		}
		    |
		kw=LessThanSignEqualsSign
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getRelationalOpAccess().getLessThanSignEqualsSignKeyword_1());
		}
		    |
		kw=GreaterThanSign
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getRelationalOpAccess().getGreaterThanSignKeyword_2());
		}
		    |
		kw=GreaterThanSignEqualsSign
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getRelationalOpAccess().getGreaterThanSignEqualsSignKeyword_3());
		}
		    |
		kw=EqualsSign
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getRelationalOpAccess().getEqualsSignKeyword_4());
		}
		    |
		kw=LessThanSignGreaterThanSign
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getRelationalOpAccess().getLessThanSignGreaterThanSignKeyword_5());
		}
	)
;

// Entry rule entryRuleRelationalExpr
entryRuleRelationalExpr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRelationalExprRule()); }
	iv_ruleRelationalExpr=ruleRelationalExpr
	{ $current=$iv_ruleRelationalExpr.current; }
	EOF;

// Rule RelationalExpr
ruleRelationalExpr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getRelationalExprAccess().getAddSubExprParserRuleCall_0());
		}
		this_AddSubExpr_0=ruleAddSubExpr
		{
			$current = $this_AddSubExpr_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				((
					(
					)
					(
						(
							ruleRelationalOp
						)
					)
				)
				)=>
				(
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getRelationalExprAccess().getBinaryExprLeftAction_1_0_0_0(),
								$current);
						}
					)
					(
						(
							{
								newCompositeNode(grammarAccess.getRelationalExprAccess().getOpRelationalOpParserRuleCall_1_0_0_1_0());
							}
							lv_op_2_0=ruleRelationalOp
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getRelationalExprRule());
								}
								set(
									$current,
									"op",
									lv_op_2_0,
									"org.sireum.aadl.gumbo.Gumbo.RelationalOp");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getRelationalExprAccess().getRightAddSubExprParserRuleCall_1_1_0());
					}
					lv_right_3_0=ruleAddSubExpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRelationalExprRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.sireum.aadl.gumbo.Gumbo.AddSubExpr");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleAddSubExpr
entryRuleAddSubExpr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAddSubExprRule()); }
	iv_ruleAddSubExpr=ruleAddSubExpr
	{ $current=$iv_ruleAddSubExpr.current; }
	EOF;

// Rule AddSubExpr
ruleAddSubExpr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAddSubExprAccess().getMultDivModExprParserRuleCall_0());
		}
		this_MultDivModExpr_0=ruleMultDivModExpr
		{
			$current = $this_MultDivModExpr_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				((
					(
					)
					(
						(
							(
								PlusSign
								    |
								HyphenMinus
							)
						)
					)
				)
				)=>
				(
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getAddSubExprAccess().getBinaryExprLeftAction_1_0_0_0(),
								$current);
						}
					)
					(
						(
							(
								lv_op_2_1=PlusSign
								{
									newLeafNode(lv_op_2_1, grammarAccess.getAddSubExprAccess().getOpPlusSignKeyword_1_0_0_1_0_0());
								}
								{
									if ($current==null) {
										$current = createModelElement(grammarAccess.getAddSubExprRule());
									}
									setWithLastConsumed($current, "op", lv_op_2_1, null);
								}
								    |
								lv_op_2_2=HyphenMinus
								{
									newLeafNode(lv_op_2_2, grammarAccess.getAddSubExprAccess().getOpHyphenMinusKeyword_1_0_0_1_0_1());
								}
								{
									if ($current==null) {
										$current = createModelElement(grammarAccess.getAddSubExprRule());
									}
									setWithLastConsumed($current, "op", lv_op_2_2, null);
								}
							)
						)
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getAddSubExprAccess().getRightMultDivModExprParserRuleCall_1_1_0());
					}
					lv_right_3_0=ruleMultDivModExpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAddSubExprRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.sireum.aadl.gumbo.Gumbo.MultDivModExpr");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleMultDivModExpr
entryRuleMultDivModExpr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMultDivModExprRule()); }
	iv_ruleMultDivModExpr=ruleMultDivModExpr
	{ $current=$iv_ruleMultDivModExpr.current; }
	EOF;

// Rule MultDivModExpr
ruleMultDivModExpr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getMultDivModExprAccess().getExpExprParserRuleCall_0());
		}
		this_ExpExpr_0=ruleExpExpr
		{
			$current = $this_ExpExpr_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				((
					(
					)
					(
						(
							(
								Asterisk
								    |
								Solidus
								    |
								PercentSign
							)
						)
					)
				)
				)=>
				(
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getMultDivModExprAccess().getBinaryExprLeftAction_1_0_0_0(),
								$current);
						}
					)
					(
						(
							(
								lv_op_2_1=Asterisk
								{
									newLeafNode(lv_op_2_1, grammarAccess.getMultDivModExprAccess().getOpAsteriskKeyword_1_0_0_1_0_0());
								}
								{
									if ($current==null) {
										$current = createModelElement(grammarAccess.getMultDivModExprRule());
									}
									setWithLastConsumed($current, "op", lv_op_2_1, null);
								}
								    |
								lv_op_2_2=Solidus
								{
									newLeafNode(lv_op_2_2, grammarAccess.getMultDivModExprAccess().getOpSolidusKeyword_1_0_0_1_0_1());
								}
								{
									if ($current==null) {
										$current = createModelElement(grammarAccess.getMultDivModExprRule());
									}
									setWithLastConsumed($current, "op", lv_op_2_2, null);
								}
								    |
								lv_op_2_3=PercentSign
								{
									newLeafNode(lv_op_2_3, grammarAccess.getMultDivModExprAccess().getOpPercentSignKeyword_1_0_0_1_0_2());
								}
								{
									if ($current==null) {
										$current = createModelElement(grammarAccess.getMultDivModExprRule());
									}
									setWithLastConsumed($current, "op", lv_op_2_3, null);
								}
							)
						)
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getMultDivModExprAccess().getRightExpExprParserRuleCall_1_1_0());
					}
					lv_right_3_0=ruleExpExpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMultDivModExprRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.sireum.aadl.gumbo.Gumbo.ExpExpr");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleExpExpr
entryRuleExpExpr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpExprRule()); }
	iv_ruleExpExpr=ruleExpExpr
	{ $current=$iv_ruleExpExpr.current; }
	EOF;

// Rule ExpExpr
ruleExpExpr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getExpExprAccess().getPrefixExprParserRuleCall_0());
		}
		this_PrefixExpr_0=rulePrefixExpr
		{
			$current = $this_PrefixExpr_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				((
					(
					)
					(
						(
							CircumflexAccent
						)
					)
				)
				)=>
				(
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getExpExprAccess().getBinaryExprLeftAction_1_0_0_0(),
								$current);
						}
					)
					(
						(
							lv_op_2_0=CircumflexAccent
							{
								newLeafNode(lv_op_2_0, grammarAccess.getExpExprAccess().getOpCircumflexAccentKeyword_1_0_0_1_0());
							}
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getExpExprRule());
								}
								setWithLastConsumed($current, "op", lv_op_2_0, "^");
							}
						)
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getExpExprAccess().getRightPrefixExprParserRuleCall_1_1_0());
					}
					lv_right_3_0=rulePrefixExpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExpExprRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.sireum.aadl.gumbo.Gumbo.PrefixExpr");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRulePrefixExpr
entryRulePrefixExpr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrefixExprRule()); }
	iv_rulePrefixExpr=rulePrefixExpr
	{ $current=$iv_rulePrefixExpr.current; }
	EOF;

// Rule PrefixExpr
rulePrefixExpr returns [EObject current=null]
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
						grammarAccess.getPrefixExprAccess().getUnaryExprAction_0_0(),
						$current);
				}
			)
			(
				(
					(
						lv_op_1_1=HyphenMinus
						{
							newLeafNode(lv_op_1_1, grammarAccess.getPrefixExprAccess().getOpHyphenMinusKeyword_0_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getPrefixExprRule());
							}
							setWithLastConsumed($current, "op", lv_op_1_1, null);
						}
						    |
						lv_op_1_2=Not
						{
							newLeafNode(lv_op_1_2, grammarAccess.getPrefixExprAccess().getOpNotKeyword_0_1_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getPrefixExprRule());
							}
							setWithLastConsumed($current, "op", lv_op_1_2, null);
						}
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getPrefixExprAccess().getExprPrefixExprParserRuleCall_0_2_0());
					}
					lv_expr_2_0=rulePrefixExpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPrefixExprRule());
						}
						set(
							$current,
							"expr",
							lv_expr_2_0,
							"org.sireum.aadl.gumbo.Gumbo.PrefixExpr");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		{
			newCompositeNode(grammarAccess.getPrefixExprAccess().getAtomicExprParserRuleCall_1());
		}
		this_AtomicExpr_3=ruleAtomicExpr
		{
			$current = $this_AtomicExpr_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAtomicExpr
entryRuleAtomicExpr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAtomicExprRule()); }
	iv_ruleAtomicExpr=ruleAtomicExpr
	{ $current=$iv_ruleAtomicExpr.current; }
	EOF;

// Rule AtomicExpr
ruleAtomicExpr returns [EObject current=null]
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
						grammarAccess.getAtomicExprAccess().getStateVarRefAction_0_0(),
						$current);
				}
			)
			otherlv_1=Var
			{
				newLeafNode(otherlv_1, grammarAccess.getAtomicExprAccess().getVarKeyword_0_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAtomicExprRule());
						}
					}
					otherlv_2=RULE_ID
					{
						newLeafNode(otherlv_2, grammarAccess.getAtomicExprAccess().getStateVarStateVarDeclCrossReference_0_2_0());
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getAtomicExprAccess().getPortRefAction_1_0(),
						$current);
				}
			)
			otherlv_4=Port
			{
				newLeafNode(otherlv_4, grammarAccess.getAtomicExprAccess().getPortKeyword_1_1());
			}
			(
				(
					lv_portName_5_0=RULE_ID
					{
						newLeafNode(lv_portName_5_0, grammarAccess.getAtomicExprAccess().getPortNameIDTerminalRuleCall_1_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAtomicExprRule());
						}
						setWithLastConsumed(
							$current,
							"portName",
							lv_portName_5_0,
							"org.osate.xtext.aadl2.properties.Properties.ID");
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
								grammarAccess.getAtomicExprAccess().getEnumLitExprAction_2_0_0_0(),
								$current);
						}
					)
					otherlv_7=Enum
					{
						newLeafNode(otherlv_7, grammarAccess.getAtomicExprAccess().getEnumKeyword_2_0_0_1());
					}
					otherlv_8=LeftParenthesis
					{
						newLeafNode(otherlv_8, grammarAccess.getAtomicExprAccess().getLeftParenthesisKeyword_2_0_0_2());
					}
				)
			)
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAtomicExprRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getAtomicExprAccess().getEnumTypePropertyCrossReference_2_1_0());
					}
					ruleQCREF
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_10=Comma
			{
				newLeafNode(otherlv_10, grammarAccess.getAtomicExprAccess().getCommaKeyword_2_2());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAtomicExprRule());
						}
					}
					otherlv_11=RULE_ID
					{
						newLeafNode(otherlv_11, grammarAccess.getAtomicExprAccess().getValueEnumerationLiteralCrossReference_2_3_0());
					}
				)
			)
			otherlv_12=RightParenthesis
			{
				newLeafNode(otherlv_12, grammarAccess.getAtomicExprAccess().getRightParenthesisKeyword_2_4());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getAtomicExprAccess().getIntLitAction_3_0(),
						$current);
				}
			)
			(
				(
					lv_value_14_0=RULE_INTEGER_LIT
					{
						newLeafNode(lv_value_14_0, grammarAccess.getAtomicExprAccess().getValueINTEGER_LITTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAtomicExprRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_14_0,
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
						grammarAccess.getAtomicExprAccess().getRealLitExprAction_4_0(),
						$current);
				}
			)
			(
				(
					lv_val_16_0=RULE_REAL_LIT
					{
						newLeafNode(lv_val_16_0, grammarAccess.getAtomicExprAccess().getValREAL_LITTerminalRuleCall_4_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAtomicExprRule());
						}
						setWithLastConsumed(
							$current,
							"val",
							lv_val_16_0,
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
						grammarAccess.getAtomicExprAccess().getBoolLitExprAction_5_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getAtomicExprAccess().getValBooleanLiteralParserRuleCall_5_1_0());
					}
					lv_val_18_0=ruleBooleanLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAtomicExprRule());
						}
						set(
							$current,
							"val",
							lv_val_18_0,
							"org.osate.xtext.aadl2.properties.Properties.BooleanLiteral");
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
						grammarAccess.getAtomicExprAccess().getFloorCastAction_6_0(),
						$current);
				}
			)
			otherlv_20=Floor
			{
				newLeafNode(otherlv_20, grammarAccess.getAtomicExprAccess().getFloorKeyword_6_1());
			}
			otherlv_21=LeftParenthesis
			{
				newLeafNode(otherlv_21, grammarAccess.getAtomicExprAccess().getLeftParenthesisKeyword_6_2());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAtomicExprAccess().getExprExprParserRuleCall_6_3_0());
					}
					lv_expr_22_0=ruleExpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAtomicExprRule());
						}
						set(
							$current,
							"expr",
							lv_expr_22_0,
							"org.sireum.aadl.gumbo.Gumbo.Expr");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_23=RightParenthesis
			{
				newLeafNode(otherlv_23, grammarAccess.getAtomicExprAccess().getRightParenthesisKeyword_6_4());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getAtomicExprAccess().getRealCastAction_7_0(),
						$current);
				}
			)
			otherlv_25=Real
			{
				newLeafNode(otherlv_25, grammarAccess.getAtomicExprAccess().getRealKeyword_7_1());
			}
			otherlv_26=LeftParenthesis
			{
				newLeafNode(otherlv_26, grammarAccess.getAtomicExprAccess().getLeftParenthesisKeyword_7_2());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAtomicExprAccess().getExprExprParserRuleCall_7_3_0());
					}
					lv_expr_27_0=ruleExpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAtomicExprRule());
						}
						set(
							$current,
							"expr",
							lv_expr_27_0,
							"org.sireum.aadl.gumbo.Gumbo.Expr");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_28=RightParenthesis
			{
				newLeafNode(otherlv_28, grammarAccess.getAtomicExprAccess().getRightParenthesisKeyword_7_4());
			}
		)
		    |
		(
			otherlv_29=LeftParenthesis
			{
				newLeafNode(otherlv_29, grammarAccess.getAtomicExprAccess().getLeftParenthesisKeyword_8_0());
			}
			{
				newCompositeNode(grammarAccess.getAtomicExprAccess().getExprParserRuleCall_8_1());
			}
			this_Expr_30=ruleExpr
			{
				$current = $this_Expr_30.current;
				afterParserOrEnumRuleCall();
			}
			otherlv_31=RightParenthesis
			{
				newLeafNode(otherlv_31, grammarAccess.getAtomicExprAccess().getRightParenthesisKeyword_8_2());
			}
		)
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
