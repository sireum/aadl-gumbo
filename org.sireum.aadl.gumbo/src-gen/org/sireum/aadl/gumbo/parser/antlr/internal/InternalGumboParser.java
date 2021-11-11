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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
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
@SuppressWarnings("all")
public class InternalGumboParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Integration", "Classifier", "Initialize", "Invariants", "Guarantee", "Reference", "Constant", "Andthen", "Applies", "Binding", "Compute", "Implies", "Library", "Assume", "Orelse", "Delta", "False", "Floor", "Gumbo", "Modes", "State", "Case", "Enum", "Port", "Real", "True", "PlusSignEqualsSignGreaterThanSign", "LessThanSignEqualsSignGreaterThanSign", "And", "For", "Inv", "Not", "Var", "FullStopFullStop", "ColonColon", "LessThanSignEqualsSign", "LessThanSignGreaterThanSign", "EqualsSignGreaterThanSign", "GreaterThanSignEqualsSign", "In", "Or", "To", "PercentSign", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "FullStop", "Solidus", "Colon", "Semicolon", "LessThanSign", "EqualsSign", "GreaterThanSign", "LeftSquareBracket", "RightSquareBracket", "CircumflexAccent", "LeftCurlyBracket", "RightCurlyBracket", "RULE_SL_COMMENT", "RULE_DIGIT", "RULE_EXPONENT", "RULE_INT_EXPONENT", "RULE_REAL_LIT", "RULE_BASED_INTEGER", "RULE_INTEGER_LIT", "RULE_EXTENDED_DIGIT", "RULE_STRING", "RULE_ID", "RULE_WS"
    };
    public static final int Enum=26;
    public static final int LessThanSignGreaterThanSign=40;
    public static final int Or=44;
    public static final int EqualsSignGreaterThanSign=41;
    public static final int Var=36;
    public static final int Port=27;
    public static final int True=29;
    public static final int False=20;
    public static final int Initialize=6;
    public static final int Invariants=7;
    public static final int LessThanSign=57;
    public static final int RULE_INT_EXPONENT=68;
    public static final int PercentSign=46;
    public static final int Implies=15;
    public static final int PlusSignEqualsSignGreaterThanSign=30;
    public static final int LeftParenthesis=47;
    public static final int FullStopFullStop=37;
    public static final int Real=28;
    public static final int To=45;
    public static final int Applies=12;
    public static final int RULE_BASED_INTEGER=70;
    public static final int RightSquareBracket=61;
    public static final int Binding=13;
    public static final int GreaterThanSign=59;
    public static final int RULE_ID=74;
    public static final int For=33;
    public static final int RightParenthesis=48;
    public static final int RULE_DIGIT=66;
    public static final int GreaterThanSignEqualsSign=42;
    public static final int ColonColon=38;
    public static final int Not=35;
    public static final int Gumbo=22;
    public static final int Andthen=11;
    public static final int State=24;
    public static final int And=32;
    public static final int PlusSign=50;
    public static final int Assume=17;
    public static final int LeftSquareBracket=60;
    public static final int Library=16;
    public static final int RULE_INTEGER_LIT=71;
    public static final int In=43;
    public static final int Constant=10;
    public static final int RULE_REAL_LIT=69;
    public static final int LessThanSignEqualsSignGreaterThanSign=31;
    public static final int RULE_STRING=73;
    public static final int Classifier=5;
    public static final int Case=25;
    public static final int RULE_SL_COMMENT=65;
    public static final int Inv=34;
    public static final int Comma=51;
    public static final int EqualsSign=58;
    public static final int HyphenMinus=52;
    public static final int Guarantee=8;
    public static final int LessThanSignEqualsSign=39;
    public static final int Solidus=54;
    public static final int Colon=55;
    public static final int RightCurlyBracket=64;
    public static final int EOF=-1;
    public static final int Asterisk=49;
    public static final int Floor=21;
    public static final int Modes=23;
    public static final int FullStop=53;
    public static final int Integration=4;
    public static final int RULE_WS=75;
    public static final int Reference=9;
    public static final int LeftCurlyBracket=63;
    public static final int CircumflexAccent=62;
    public static final int Semicolon=56;
    public static final int RULE_EXPONENT=67;
    public static final int Delta=19;
    public static final int Compute=14;
    public static final int Orelse=18;
    public static final int RULE_EXTENDED_DIGIT=72;

    // delegates
    // delegators


        public InternalGumboParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGumboParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGumboParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGumboParser.g"; }



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




    // $ANTLR start "entryRuleAnnexLibrary"
    // InternalGumboParser.g:67:1: entryRuleAnnexLibrary returns [EObject current=null] : iv_ruleAnnexLibrary= ruleAnnexLibrary EOF ;
    public final EObject entryRuleAnnexLibrary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnexLibrary = null;


        try {
            // InternalGumboParser.g:67:53: (iv_ruleAnnexLibrary= ruleAnnexLibrary EOF )
            // InternalGumboParser.g:68:2: iv_ruleAnnexLibrary= ruleAnnexLibrary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnexLibraryRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAnnexLibrary=ruleAnnexLibrary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnexLibrary; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnexLibrary"


    // $ANTLR start "ruleAnnexLibrary"
    // InternalGumboParser.g:74:1: ruleAnnexLibrary returns [EObject current=null] : this_GumboLibrary_0= ruleGumboLibrary ;
    public final EObject ruleAnnexLibrary() throws RecognitionException {
        EObject current = null;

        EObject this_GumboLibrary_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:80:2: (this_GumboLibrary_0= ruleGumboLibrary )
            // InternalGumboParser.g:81:2: this_GumboLibrary_0= ruleGumboLibrary
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getAnnexLibraryAccess().getGumboLibraryParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_GumboLibrary_0=ruleGumboLibrary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_GumboLibrary_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnexLibrary"


    // $ANTLR start "entryRuleGumboLibrary"
    // InternalGumboParser.g:92:1: entryRuleGumboLibrary returns [EObject current=null] : iv_ruleGumboLibrary= ruleGumboLibrary EOF ;
    public final EObject entryRuleGumboLibrary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGumboLibrary = null;


        try {
            // InternalGumboParser.g:92:53: (iv_ruleGumboLibrary= ruleGumboLibrary EOF )
            // InternalGumboParser.g:93:2: iv_ruleGumboLibrary= ruleGumboLibrary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGumboLibraryRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGumboLibrary=ruleGumboLibrary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGumboLibrary; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGumboLibrary"


    // $ANTLR start "ruleGumboLibrary"
    // InternalGumboParser.g:99:1: ruleGumboLibrary returns [EObject current=null] : ( () otherlv_1= Library otherlv_2= For otherlv_3= Gumbo ) ;
    public final EObject ruleGumboLibrary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalGumboParser.g:105:2: ( ( () otherlv_1= Library otherlv_2= For otherlv_3= Gumbo ) )
            // InternalGumboParser.g:106:2: ( () otherlv_1= Library otherlv_2= For otherlv_3= Gumbo )
            {
            // InternalGumboParser.g:106:2: ( () otherlv_1= Library otherlv_2= For otherlv_3= Gumbo )
            // InternalGumboParser.g:107:3: () otherlv_1= Library otherlv_2= For otherlv_3= Gumbo
            {
            // InternalGumboParser.g:107:3: ()
            // InternalGumboParser.g:108:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getGumboLibraryAccess().getGumboLibraryAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Library,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGumboLibraryAccess().getLibraryKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,For,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGumboLibraryAccess().getForKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,Gumbo,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGumboLibraryAccess().getGumboKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGumboLibrary"


    // $ANTLR start "entryRuleGumboSubclause"
    // InternalGumboParser.g:130:1: entryRuleGumboSubclause returns [EObject current=null] : iv_ruleGumboSubclause= ruleGumboSubclause EOF ;
    public final EObject entryRuleGumboSubclause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGumboSubclause = null;


        try {
            // InternalGumboParser.g:130:55: (iv_ruleGumboSubclause= ruleGumboSubclause EOF )
            // InternalGumboParser.g:131:2: iv_ruleGumboSubclause= ruleGumboSubclause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGumboSubclauseRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGumboSubclause=ruleGumboSubclause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGumboSubclause; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGumboSubclause"


    // $ANTLR start "ruleGumboSubclause"
    // InternalGumboParser.g:137:1: ruleGumboSubclause returns [EObject current=null] : ( () ( (lv_specs_1_0= ruleSpecSection ) ) ) ;
    public final EObject ruleGumboSubclause() throws RecognitionException {
        EObject current = null;

        EObject lv_specs_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:143:2: ( ( () ( (lv_specs_1_0= ruleSpecSection ) ) ) )
            // InternalGumboParser.g:144:2: ( () ( (lv_specs_1_0= ruleSpecSection ) ) )
            {
            // InternalGumboParser.g:144:2: ( () ( (lv_specs_1_0= ruleSpecSection ) ) )
            // InternalGumboParser.g:145:3: () ( (lv_specs_1_0= ruleSpecSection ) )
            {
            // InternalGumboParser.g:145:3: ()
            // InternalGumboParser.g:146:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getGumboSubclauseAccess().getGumboSubclauseAction_0(),
              					current);
              			
            }

            }

            // InternalGumboParser.g:152:3: ( (lv_specs_1_0= ruleSpecSection ) )
            // InternalGumboParser.g:153:4: (lv_specs_1_0= ruleSpecSection )
            {
            // InternalGumboParser.g:153:4: (lv_specs_1_0= ruleSpecSection )
            // InternalGumboParser.g:154:5: lv_specs_1_0= ruleSpecSection
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGumboSubclauseAccess().getSpecsSpecSectionParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_specs_1_0=ruleSpecSection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGumboSubclauseRule());
              					}
              					set(
              						current,
              						"specs",
              						lv_specs_1_0,
              						"org.sireum.aadl.gumbo.Gumbo.SpecSection");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGumboSubclause"


    // $ANTLR start "entryRuleSpecSection"
    // InternalGumboParser.g:175:1: entryRuleSpecSection returns [EObject current=null] : iv_ruleSpecSection= ruleSpecSection EOF ;
    public final EObject entryRuleSpecSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecSection = null;


        try {
            // InternalGumboParser.g:175:52: (iv_ruleSpecSection= ruleSpecSection EOF )
            // InternalGumboParser.g:176:2: iv_ruleSpecSection= ruleSpecSection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSpecSectionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSpecSection=ruleSpecSection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSpecSection; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpecSection"


    // $ANTLR start "ruleSpecSection"
    // InternalGumboParser.g:182:1: ruleSpecSection returns [EObject current=null] : ( ( (lv_state_0_0= ruleState ) )? ( (lv_invariants_1_0= ruleInvariants ) )? ( (lv_integration_2_0= ruleIntegration ) )? ( (lv_initialize_3_0= ruleInitialize ) )? ( (lv_compute_4_0= ruleCompute ) )? ) ;
    public final EObject ruleSpecSection() throws RecognitionException {
        EObject current = null;

        EObject lv_state_0_0 = null;

        EObject lv_invariants_1_0 = null;

        EObject lv_integration_2_0 = null;

        EObject lv_initialize_3_0 = null;

        EObject lv_compute_4_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:188:2: ( ( ( (lv_state_0_0= ruleState ) )? ( (lv_invariants_1_0= ruleInvariants ) )? ( (lv_integration_2_0= ruleIntegration ) )? ( (lv_initialize_3_0= ruleInitialize ) )? ( (lv_compute_4_0= ruleCompute ) )? ) )
            // InternalGumboParser.g:189:2: ( ( (lv_state_0_0= ruleState ) )? ( (lv_invariants_1_0= ruleInvariants ) )? ( (lv_integration_2_0= ruleIntegration ) )? ( (lv_initialize_3_0= ruleInitialize ) )? ( (lv_compute_4_0= ruleCompute ) )? )
            {
            // InternalGumboParser.g:189:2: ( ( (lv_state_0_0= ruleState ) )? ( (lv_invariants_1_0= ruleInvariants ) )? ( (lv_integration_2_0= ruleIntegration ) )? ( (lv_initialize_3_0= ruleInitialize ) )? ( (lv_compute_4_0= ruleCompute ) )? )
            // InternalGumboParser.g:190:3: ( (lv_state_0_0= ruleState ) )? ( (lv_invariants_1_0= ruleInvariants ) )? ( (lv_integration_2_0= ruleIntegration ) )? ( (lv_initialize_3_0= ruleInitialize ) )? ( (lv_compute_4_0= ruleCompute ) )?
            {
            // InternalGumboParser.g:190:3: ( (lv_state_0_0= ruleState ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==State) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalGumboParser.g:191:4: (lv_state_0_0= ruleState )
                    {
                    // InternalGumboParser.g:191:4: (lv_state_0_0= ruleState )
                    // InternalGumboParser.g:192:5: lv_state_0_0= ruleState
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSpecSectionAccess().getStateStateParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_5);
                    lv_state_0_0=ruleState();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSpecSectionRule());
                      					}
                      					set(
                      						current,
                      						"state",
                      						lv_state_0_0,
                      						"org.sireum.aadl.gumbo.Gumbo.State");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalGumboParser.g:209:3: ( (lv_invariants_1_0= ruleInvariants ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==Invariants) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGumboParser.g:210:4: (lv_invariants_1_0= ruleInvariants )
                    {
                    // InternalGumboParser.g:210:4: (lv_invariants_1_0= ruleInvariants )
                    // InternalGumboParser.g:211:5: lv_invariants_1_0= ruleInvariants
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSpecSectionAccess().getInvariantsInvariantsParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_invariants_1_0=ruleInvariants();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSpecSectionRule());
                      					}
                      					set(
                      						current,
                      						"invariants",
                      						lv_invariants_1_0,
                      						"org.sireum.aadl.gumbo.Gumbo.Invariants");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalGumboParser.g:228:3: ( (lv_integration_2_0= ruleIntegration ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Integration) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalGumboParser.g:229:4: (lv_integration_2_0= ruleIntegration )
                    {
                    // InternalGumboParser.g:229:4: (lv_integration_2_0= ruleIntegration )
                    // InternalGumboParser.g:230:5: lv_integration_2_0= ruleIntegration
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSpecSectionAccess().getIntegrationIntegrationParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_integration_2_0=ruleIntegration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSpecSectionRule());
                      					}
                      					set(
                      						current,
                      						"integration",
                      						lv_integration_2_0,
                      						"org.sireum.aadl.gumbo.Gumbo.Integration");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalGumboParser.g:247:3: ( (lv_initialize_3_0= ruleInitialize ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Initialize) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalGumboParser.g:248:4: (lv_initialize_3_0= ruleInitialize )
                    {
                    // InternalGumboParser.g:248:4: (lv_initialize_3_0= ruleInitialize )
                    // InternalGumboParser.g:249:5: lv_initialize_3_0= ruleInitialize
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSpecSectionAccess().getInitializeInitializeParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_8);
                    lv_initialize_3_0=ruleInitialize();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSpecSectionRule());
                      					}
                      					set(
                      						current,
                      						"initialize",
                      						lv_initialize_3_0,
                      						"org.sireum.aadl.gumbo.Gumbo.Initialize");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalGumboParser.g:266:3: ( (lv_compute_4_0= ruleCompute ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Compute) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGumboParser.g:267:4: (lv_compute_4_0= ruleCompute )
                    {
                    // InternalGumboParser.g:267:4: (lv_compute_4_0= ruleCompute )
                    // InternalGumboParser.g:268:5: lv_compute_4_0= ruleCompute
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSpecSectionAccess().getComputeComputeParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_compute_4_0=ruleCompute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSpecSectionRule());
                      					}
                      					set(
                      						current,
                      						"compute",
                      						lv_compute_4_0,
                      						"org.sireum.aadl.gumbo.Gumbo.Compute");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpecSection"


    // $ANTLR start "entryRuleState"
    // InternalGumboParser.g:289:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalGumboParser.g:289:46: (iv_ruleState= ruleState EOF )
            // InternalGumboParser.g:290:2: iv_ruleState= ruleState EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleState; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalGumboParser.g:296:1: ruleState returns [EObject current=null] : (otherlv_0= State ( (lv_decls_1_0= ruleStateVarDecl ) )+ ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_decls_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:302:2: ( (otherlv_0= State ( (lv_decls_1_0= ruleStateVarDecl ) )+ ) )
            // InternalGumboParser.g:303:2: (otherlv_0= State ( (lv_decls_1_0= ruleStateVarDecl ) )+ )
            {
            // InternalGumboParser.g:303:2: (otherlv_0= State ( (lv_decls_1_0= ruleStateVarDecl ) )+ )
            // InternalGumboParser.g:304:3: otherlv_0= State ( (lv_decls_1_0= ruleStateVarDecl ) )+
            {
            otherlv_0=(Token)match(input,State,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
              		
            }
            // InternalGumboParser.g:308:3: ( (lv_decls_1_0= ruleStateVarDecl ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGumboParser.g:309:4: (lv_decls_1_0= ruleStateVarDecl )
            	    {
            	    // InternalGumboParser.g:309:4: (lv_decls_1_0= ruleStateVarDecl )
            	    // InternalGumboParser.g:310:5: lv_decls_1_0= ruleStateVarDecl
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getStateAccess().getDeclsStateVarDeclParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    lv_decls_1_0=ruleStateVarDecl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getStateRule());
            	      					}
            	      					add(
            	      						current,
            	      						"decls",
            	      						lv_decls_1_0,
            	      						"org.sireum.aadl.gumbo.Gumbo.StateVarDecl");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleStateVarDecl"
    // InternalGumboParser.g:331:1: entryRuleStateVarDecl returns [EObject current=null] : iv_ruleStateVarDecl= ruleStateVarDecl EOF ;
    public final EObject entryRuleStateVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateVarDecl = null;


        try {
            // InternalGumboParser.g:331:53: (iv_ruleStateVarDecl= ruleStateVarDecl EOF )
            // InternalGumboParser.g:332:2: iv_ruleStateVarDecl= ruleStateVarDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateVarDeclRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleStateVarDecl=ruleStateVarDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateVarDecl; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateVarDecl"


    // $ANTLR start "ruleStateVarDecl"
    // InternalGumboParser.g:338:1: ruleStateVarDecl returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ) ( ( ruleQCREF ) ) otherlv_3= Semicolon ) ;
    public final EObject ruleStateVarDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalGumboParser.g:344:2: ( ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ) ( ( ruleQCREF ) ) otherlv_3= Semicolon ) )
            // InternalGumboParser.g:345:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ) ( ( ruleQCREF ) ) otherlv_3= Semicolon )
            {
            // InternalGumboParser.g:345:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ) ( ( ruleQCREF ) ) otherlv_3= Semicolon )
            // InternalGumboParser.g:346:3: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ) ( ( ruleQCREF ) ) otherlv_3= Semicolon
            {
            // InternalGumboParser.g:346:3: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon )
            // InternalGumboParser.g:347:4: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon
            {
            // InternalGumboParser.g:347:4: ( (lv_name_0_0= RULE_ID ) )
            // InternalGumboParser.g:348:5: (lv_name_0_0= RULE_ID )
            {
            // InternalGumboParser.g:348:5: (lv_name_0_0= RULE_ID )
            // InternalGumboParser.g:349:6: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						newLeafNode(lv_name_0_0, grammarAccess.getStateVarDeclAccess().getNameIDTerminalRuleCall_0_0_0());
              					
            }
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElement(grammarAccess.getStateVarDeclRule());
              						}
              						setWithLastConsumed(
              							current,
              							"name",
              							lv_name_0_0,
              							"org.osate.xtext.aadl2.properties.Properties.ID");
              					
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getStateVarDeclAccess().getColonKeyword_0_1());
              			
            }

            }

            // InternalGumboParser.g:370:3: ( ( ruleQCREF ) )
            // InternalGumboParser.g:371:4: ( ruleQCREF )
            {
            // InternalGumboParser.g:371:4: ( ruleQCREF )
            // InternalGumboParser.g:372:5: ruleQCREF
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getStateVarDeclRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStateVarDeclAccess().getTypeNameDataSubcomponentTypeCrossReference_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_12);
            ruleQCREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,Semicolon,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getStateVarDeclAccess().getSemicolonKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateVarDecl"


    // $ANTLR start "entryRuleInvariants"
    // InternalGumboParser.g:394:1: entryRuleInvariants returns [EObject current=null] : iv_ruleInvariants= ruleInvariants EOF ;
    public final EObject entryRuleInvariants() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariants = null;


        try {
            // InternalGumboParser.g:394:51: (iv_ruleInvariants= ruleInvariants EOF )
            // InternalGumboParser.g:395:2: iv_ruleInvariants= ruleInvariants EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInvariantsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInvariants=ruleInvariants();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInvariants; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInvariants"


    // $ANTLR start "ruleInvariants"
    // InternalGumboParser.g:401:1: ruleInvariants returns [EObject current=null] : (otherlv_0= Invariants ( (lv_specs_1_0= ruleInvSpec ) )+ ) ;
    public final EObject ruleInvariants() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_specs_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:407:2: ( (otherlv_0= Invariants ( (lv_specs_1_0= ruleInvSpec ) )+ ) )
            // InternalGumboParser.g:408:2: (otherlv_0= Invariants ( (lv_specs_1_0= ruleInvSpec ) )+ )
            {
            // InternalGumboParser.g:408:2: (otherlv_0= Invariants ( (lv_specs_1_0= ruleInvSpec ) )+ )
            // InternalGumboParser.g:409:3: otherlv_0= Invariants ( (lv_specs_1_0= ruleInvSpec ) )+
            {
            otherlv_0=(Token)match(input,Invariants,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInvariantsAccess().getInvariantsKeyword_0());
              		
            }
            // InternalGumboParser.g:413:3: ( (lv_specs_1_0= ruleInvSpec ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==Inv) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGumboParser.g:414:4: (lv_specs_1_0= ruleInvSpec )
            	    {
            	    // InternalGumboParser.g:414:4: (lv_specs_1_0= ruleInvSpec )
            	    // InternalGumboParser.g:415:5: lv_specs_1_0= ruleInvSpec
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getInvariantsAccess().getSpecsInvSpecParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_14);
            	    lv_specs_1_0=ruleInvSpec();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getInvariantsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"specs",
            	      						lv_specs_1_0,
            	      						"org.sireum.aadl.gumbo.Gumbo.InvSpec");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInvariants"


    // $ANTLR start "entryRuleInvSpec"
    // InternalGumboParser.g:436:1: entryRuleInvSpec returns [EObject current=null] : iv_ruleInvSpec= ruleInvSpec EOF ;
    public final EObject entryRuleInvSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvSpec = null;


        try {
            // InternalGumboParser.g:436:48: (iv_ruleInvSpec= ruleInvSpec EOF )
            // InternalGumboParser.g:437:2: iv_ruleInvSpec= ruleInvSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInvSpecRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInvSpec=ruleInvSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInvSpec; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInvSpec"


    // $ANTLR start "ruleInvSpec"
    // InternalGumboParser.g:443:1: ruleInvSpec returns [EObject current=null] : (otherlv_0= Inv ( (lv_displayName_1_0= RULE_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon ) ;
    public final EObject ruleInvSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_displayName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expr_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:449:2: ( (otherlv_0= Inv ( (lv_displayName_1_0= RULE_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon ) )
            // InternalGumboParser.g:450:2: (otherlv_0= Inv ( (lv_displayName_1_0= RULE_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon )
            {
            // InternalGumboParser.g:450:2: (otherlv_0= Inv ( (lv_displayName_1_0= RULE_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon )
            // InternalGumboParser.g:451:3: otherlv_0= Inv ( (lv_displayName_1_0= RULE_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon
            {
            otherlv_0=(Token)match(input,Inv,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInvSpecAccess().getInvKeyword_0());
              		
            }
            // InternalGumboParser.g:455:3: ( (lv_displayName_1_0= RULE_STRING ) )
            // InternalGumboParser.g:456:4: (lv_displayName_1_0= RULE_STRING )
            {
            // InternalGumboParser.g:456:4: (lv_displayName_1_0= RULE_STRING )
            // InternalGumboParser.g:457:5: lv_displayName_1_0= RULE_STRING
            {
            lv_displayName_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_displayName_1_0, grammarAccess.getInvSpecAccess().getDisplayNameSTRINGTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getInvSpecRule());
              					}
              					setWithLastConsumed(
              						current,
              						"displayName",
              						lv_displayName_1_0,
              						"org.osate.xtext.aadl2.properties.Properties.STRING");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,Colon,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getInvSpecAccess().getColonKeyword_2());
              		
            }
            // InternalGumboParser.g:477:3: ( (lv_expr_3_0= ruleExpr ) )
            // InternalGumboParser.g:478:4: (lv_expr_3_0= ruleExpr )
            {
            // InternalGumboParser.g:478:4: (lv_expr_3_0= ruleExpr )
            // InternalGumboParser.g:479:5: lv_expr_3_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInvSpecAccess().getExprExprParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_12);
            lv_expr_3_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getInvSpecRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_3_0,
              						"org.sireum.aadl.gumbo.Gumbo.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,Semicolon,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getInvSpecAccess().getSemicolonKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInvSpec"


    // $ANTLR start "entryRuleIntegration"
    // InternalGumboParser.g:504:1: entryRuleIntegration returns [EObject current=null] : iv_ruleIntegration= ruleIntegration EOF ;
    public final EObject entryRuleIntegration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegration = null;


        try {
            // InternalGumboParser.g:504:52: (iv_ruleIntegration= ruleIntegration EOF )
            // InternalGumboParser.g:505:2: iv_ruleIntegration= ruleIntegration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegrationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIntegration=ruleIntegration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegration"


    // $ANTLR start "ruleIntegration"
    // InternalGumboParser.g:511:1: ruleIntegration returns [EObject current=null] : (otherlv_0= Integration ( (lv_specs_1_0= ruleSpecStatement ) )+ ) ;
    public final EObject ruleIntegration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_specs_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:517:2: ( (otherlv_0= Integration ( (lv_specs_1_0= ruleSpecStatement ) )+ ) )
            // InternalGumboParser.g:518:2: (otherlv_0= Integration ( (lv_specs_1_0= ruleSpecStatement ) )+ )
            {
            // InternalGumboParser.g:518:2: (otherlv_0= Integration ( (lv_specs_1_0= ruleSpecStatement ) )+ )
            // InternalGumboParser.g:519:3: otherlv_0= Integration ( (lv_specs_1_0= ruleSpecStatement ) )+
            {
            otherlv_0=(Token)match(input,Integration,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIntegrationAccess().getIntegrationKeyword_0());
              		
            }
            // InternalGumboParser.g:523:3: ( (lv_specs_1_0= ruleSpecStatement ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Guarantee||LA8_0==Assume) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGumboParser.g:524:4: (lv_specs_1_0= ruleSpecStatement )
            	    {
            	    // InternalGumboParser.g:524:4: (lv_specs_1_0= ruleSpecStatement )
            	    // InternalGumboParser.g:525:5: lv_specs_1_0= ruleSpecStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getIntegrationAccess().getSpecsSpecStatementParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    lv_specs_1_0=ruleSpecStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getIntegrationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"specs",
            	      						lv_specs_1_0,
            	      						"org.sireum.aadl.gumbo.Gumbo.SpecStatement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegration"


    // $ANTLR start "entryRuleInitialize"
    // InternalGumboParser.g:546:1: entryRuleInitialize returns [EObject current=null] : iv_ruleInitialize= ruleInitialize EOF ;
    public final EObject entryRuleInitialize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialize = null;


        try {
            // InternalGumboParser.g:546:51: (iv_ruleInitialize= ruleInitialize EOF )
            // InternalGumboParser.g:547:2: iv_ruleInitialize= ruleInitialize EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInitializeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInitialize=ruleInitialize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInitialize; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitialize"


    // $ANTLR start "ruleInitialize"
    // InternalGumboParser.g:553:1: ruleInitialize returns [EObject current=null] : (otherlv_0= Initialize ( (lv_specs_1_0= ruleInitializeSpecStatement ) )+ ) ;
    public final EObject ruleInitialize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_specs_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:559:2: ( (otherlv_0= Initialize ( (lv_specs_1_0= ruleInitializeSpecStatement ) )+ ) )
            // InternalGumboParser.g:560:2: (otherlv_0= Initialize ( (lv_specs_1_0= ruleInitializeSpecStatement ) )+ )
            {
            // InternalGumboParser.g:560:2: (otherlv_0= Initialize ( (lv_specs_1_0= ruleInitializeSpecStatement ) )+ )
            // InternalGumboParser.g:561:3: otherlv_0= Initialize ( (lv_specs_1_0= ruleInitializeSpecStatement ) )+
            {
            otherlv_0=(Token)match(input,Initialize,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInitializeAccess().getInitializeKeyword_0());
              		
            }
            // InternalGumboParser.g:565:3: ( (lv_specs_1_0= ruleInitializeSpecStatement ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Guarantee) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGumboParser.g:566:4: (lv_specs_1_0= ruleInitializeSpecStatement )
            	    {
            	    // InternalGumboParser.g:566:4: (lv_specs_1_0= ruleInitializeSpecStatement )
            	    // InternalGumboParser.g:567:5: lv_specs_1_0= ruleInitializeSpecStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getInitializeAccess().getSpecsInitializeSpecStatementParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    lv_specs_1_0=ruleInitializeSpecStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getInitializeRule());
            	      					}
            	      					add(
            	      						current,
            	      						"specs",
            	      						lv_specs_1_0,
            	      						"org.sireum.aadl.gumbo.Gumbo.InitializeSpecStatement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitialize"


    // $ANTLR start "entryRuleInitializeSpecStatement"
    // InternalGumboParser.g:588:1: entryRuleInitializeSpecStatement returns [EObject current=null] : iv_ruleInitializeSpecStatement= ruleInitializeSpecStatement EOF ;
    public final EObject entryRuleInitializeSpecStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitializeSpecStatement = null;


        try {
            // InternalGumboParser.g:588:64: (iv_ruleInitializeSpecStatement= ruleInitializeSpecStatement EOF )
            // InternalGumboParser.g:589:2: iv_ruleInitializeSpecStatement= ruleInitializeSpecStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInitializeSpecStatementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInitializeSpecStatement=ruleInitializeSpecStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInitializeSpecStatement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitializeSpecStatement"


    // $ANTLR start "ruleInitializeSpecStatement"
    // InternalGumboParser.g:595:1: ruleInitializeSpecStatement returns [EObject current=null] : this_GuaranteeStatement_0= ruleGuaranteeStatement ;
    public final EObject ruleInitializeSpecStatement() throws RecognitionException {
        EObject current = null;

        EObject this_GuaranteeStatement_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:601:2: (this_GuaranteeStatement_0= ruleGuaranteeStatement )
            // InternalGumboParser.g:602:2: this_GuaranteeStatement_0= ruleGuaranteeStatement
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getInitializeSpecStatementAccess().getGuaranteeStatementParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_GuaranteeStatement_0=ruleGuaranteeStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_GuaranteeStatement_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitializeSpecStatement"


    // $ANTLR start "entryRuleCompute"
    // InternalGumboParser.g:613:1: entryRuleCompute returns [EObject current=null] : iv_ruleCompute= ruleCompute EOF ;
    public final EObject entryRuleCompute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompute = null;


        try {
            // InternalGumboParser.g:613:48: (iv_ruleCompute= ruleCompute EOF )
            // InternalGumboParser.g:614:2: iv_ruleCompute= ruleCompute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComputeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCompute=ruleCompute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompute; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompute"


    // $ANTLR start "ruleCompute"
    // InternalGumboParser.g:620:1: ruleCompute returns [EObject current=null] : (otherlv_0= Compute ( (lv_cases_1_0= ruleCaseStatementClause ) )+ ) ;
    public final EObject ruleCompute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_cases_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:626:2: ( (otherlv_0= Compute ( (lv_cases_1_0= ruleCaseStatementClause ) )+ ) )
            // InternalGumboParser.g:627:2: (otherlv_0= Compute ( (lv_cases_1_0= ruleCaseStatementClause ) )+ )
            {
            // InternalGumboParser.g:627:2: (otherlv_0= Compute ( (lv_cases_1_0= ruleCaseStatementClause ) )+ )
            // InternalGumboParser.g:628:3: otherlv_0= Compute ( (lv_cases_1_0= ruleCaseStatementClause ) )+
            {
            otherlv_0=(Token)match(input,Compute,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getComputeAccess().getComputeKeyword_0());
              		
            }
            // InternalGumboParser.g:632:3: ( (lv_cases_1_0= ruleCaseStatementClause ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Case) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGumboParser.g:633:4: (lv_cases_1_0= ruleCaseStatementClause )
            	    {
            	    // InternalGumboParser.g:633:4: (lv_cases_1_0= ruleCaseStatementClause )
            	    // InternalGumboParser.g:634:5: lv_cases_1_0= ruleCaseStatementClause
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getComputeAccess().getCasesCaseStatementClauseParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_20);
            	    lv_cases_1_0=ruleCaseStatementClause();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getComputeRule());
            	      					}
            	      					add(
            	      						current,
            	      						"cases",
            	      						lv_cases_1_0,
            	      						"org.sireum.aadl.gumbo.Gumbo.CaseStatementClause");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompute"


    // $ANTLR start "entryRuleCaseStatementClause"
    // InternalGumboParser.g:655:1: entryRuleCaseStatementClause returns [EObject current=null] : iv_ruleCaseStatementClause= ruleCaseStatementClause EOF ;
    public final EObject entryRuleCaseStatementClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseStatementClause = null;


        try {
            // InternalGumboParser.g:655:60: (iv_ruleCaseStatementClause= ruleCaseStatementClause EOF )
            // InternalGumboParser.g:656:2: iv_ruleCaseStatementClause= ruleCaseStatementClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCaseStatementClauseRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCaseStatementClause=ruleCaseStatementClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCaseStatementClause; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCaseStatementClause"


    // $ANTLR start "ruleCaseStatementClause"
    // InternalGumboParser.g:662:1: ruleCaseStatementClause returns [EObject current=null] : (otherlv_0= Case ( (lv_displayName_1_0= RULE_STRING ) ) otherlv_2= Colon ( (lv_assumeStatement_3_0= ruleAnonAssumeStatement ) ) ( (lv_guaranteeStatement_4_0= ruleAnonGuaranteeStatement ) ) ) ;
    public final EObject ruleCaseStatementClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_displayName_1_0=null;
        Token otherlv_2=null;
        EObject lv_assumeStatement_3_0 = null;

        EObject lv_guaranteeStatement_4_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:668:2: ( (otherlv_0= Case ( (lv_displayName_1_0= RULE_STRING ) ) otherlv_2= Colon ( (lv_assumeStatement_3_0= ruleAnonAssumeStatement ) ) ( (lv_guaranteeStatement_4_0= ruleAnonGuaranteeStatement ) ) ) )
            // InternalGumboParser.g:669:2: (otherlv_0= Case ( (lv_displayName_1_0= RULE_STRING ) ) otherlv_2= Colon ( (lv_assumeStatement_3_0= ruleAnonAssumeStatement ) ) ( (lv_guaranteeStatement_4_0= ruleAnonGuaranteeStatement ) ) )
            {
            // InternalGumboParser.g:669:2: (otherlv_0= Case ( (lv_displayName_1_0= RULE_STRING ) ) otherlv_2= Colon ( (lv_assumeStatement_3_0= ruleAnonAssumeStatement ) ) ( (lv_guaranteeStatement_4_0= ruleAnonGuaranteeStatement ) ) )
            // InternalGumboParser.g:670:3: otherlv_0= Case ( (lv_displayName_1_0= RULE_STRING ) ) otherlv_2= Colon ( (lv_assumeStatement_3_0= ruleAnonAssumeStatement ) ) ( (lv_guaranteeStatement_4_0= ruleAnonGuaranteeStatement ) )
            {
            otherlv_0=(Token)match(input,Case,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCaseStatementClauseAccess().getCaseKeyword_0());
              		
            }
            // InternalGumboParser.g:674:3: ( (lv_displayName_1_0= RULE_STRING ) )
            // InternalGumboParser.g:675:4: (lv_displayName_1_0= RULE_STRING )
            {
            // InternalGumboParser.g:675:4: (lv_displayName_1_0= RULE_STRING )
            // InternalGumboParser.g:676:5: lv_displayName_1_0= RULE_STRING
            {
            lv_displayName_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_displayName_1_0, grammarAccess.getCaseStatementClauseAccess().getDisplayNameSTRINGTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCaseStatementClauseRule());
              					}
              					setWithLastConsumed(
              						current,
              						"displayName",
              						lv_displayName_1_0,
              						"org.osate.xtext.aadl2.properties.Properties.STRING");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,Colon,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getCaseStatementClauseAccess().getColonKeyword_2());
              		
            }
            // InternalGumboParser.g:696:3: ( (lv_assumeStatement_3_0= ruleAnonAssumeStatement ) )
            // InternalGumboParser.g:697:4: (lv_assumeStatement_3_0= ruleAnonAssumeStatement )
            {
            // InternalGumboParser.g:697:4: (lv_assumeStatement_3_0= ruleAnonAssumeStatement )
            // InternalGumboParser.g:698:5: lv_assumeStatement_3_0= ruleAnonAssumeStatement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCaseStatementClauseAccess().getAssumeStatementAnonAssumeStatementParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_22);
            lv_assumeStatement_3_0=ruleAnonAssumeStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCaseStatementClauseRule());
              					}
              					set(
              						current,
              						"assumeStatement",
              						lv_assumeStatement_3_0,
              						"org.sireum.aadl.gumbo.Gumbo.AnonAssumeStatement");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumboParser.g:715:3: ( (lv_guaranteeStatement_4_0= ruleAnonGuaranteeStatement ) )
            // InternalGumboParser.g:716:4: (lv_guaranteeStatement_4_0= ruleAnonGuaranteeStatement )
            {
            // InternalGumboParser.g:716:4: (lv_guaranteeStatement_4_0= ruleAnonGuaranteeStatement )
            // InternalGumboParser.g:717:5: lv_guaranteeStatement_4_0= ruleAnonGuaranteeStatement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCaseStatementClauseAccess().getGuaranteeStatementAnonGuaranteeStatementParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_guaranteeStatement_4_0=ruleAnonGuaranteeStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCaseStatementClauseRule());
              					}
              					set(
              						current,
              						"guaranteeStatement",
              						lv_guaranteeStatement_4_0,
              						"org.sireum.aadl.gumbo.Gumbo.AnonGuaranteeStatement");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCaseStatementClause"


    // $ANTLR start "entryRuleSpecStatement"
    // InternalGumboParser.g:738:1: entryRuleSpecStatement returns [EObject current=null] : iv_ruleSpecStatement= ruleSpecStatement EOF ;
    public final EObject entryRuleSpecStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecStatement = null;


        try {
            // InternalGumboParser.g:738:54: (iv_ruleSpecStatement= ruleSpecStatement EOF )
            // InternalGumboParser.g:739:2: iv_ruleSpecStatement= ruleSpecStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSpecStatementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSpecStatement=ruleSpecStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSpecStatement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpecStatement"


    // $ANTLR start "ruleSpecStatement"
    // InternalGumboParser.g:745:1: ruleSpecStatement returns [EObject current=null] : (this_AssumeStatement_0= ruleAssumeStatement | this_GuaranteeStatement_1= ruleGuaranteeStatement ) ;
    public final EObject ruleSpecStatement() throws RecognitionException {
        EObject current = null;

        EObject this_AssumeStatement_0 = null;

        EObject this_GuaranteeStatement_1 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:751:2: ( (this_AssumeStatement_0= ruleAssumeStatement | this_GuaranteeStatement_1= ruleGuaranteeStatement ) )
            // InternalGumboParser.g:752:2: (this_AssumeStatement_0= ruleAssumeStatement | this_GuaranteeStatement_1= ruleGuaranteeStatement )
            {
            // InternalGumboParser.g:752:2: (this_AssumeStatement_0= ruleAssumeStatement | this_GuaranteeStatement_1= ruleGuaranteeStatement )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Assume) ) {
                alt11=1;
            }
            else if ( (LA11_0==Guarantee) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalGumboParser.g:753:3: this_AssumeStatement_0= ruleAssumeStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSpecStatementAccess().getAssumeStatementParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AssumeStatement_0=ruleAssumeStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AssumeStatement_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:762:3: this_GuaranteeStatement_1= ruleGuaranteeStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSpecStatementAccess().getGuaranteeStatementParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_GuaranteeStatement_1=ruleGuaranteeStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GuaranteeStatement_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpecStatement"


    // $ANTLR start "entryRuleAssumeStatement"
    // InternalGumboParser.g:774:1: entryRuleAssumeStatement returns [EObject current=null] : iv_ruleAssumeStatement= ruleAssumeStatement EOF ;
    public final EObject entryRuleAssumeStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssumeStatement = null;


        try {
            // InternalGumboParser.g:774:56: (iv_ruleAssumeStatement= ruleAssumeStatement EOF )
            // InternalGumboParser.g:775:2: iv_ruleAssumeStatement= ruleAssumeStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssumeStatementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAssumeStatement=ruleAssumeStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssumeStatement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssumeStatement"


    // $ANTLR start "ruleAssumeStatement"
    // InternalGumboParser.g:781:1: ruleAssumeStatement returns [EObject current=null] : (otherlv_0= Assume ( (lv_displayName_1_0= RULE_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon ) ;
    public final EObject ruleAssumeStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_displayName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expr_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:787:2: ( (otherlv_0= Assume ( (lv_displayName_1_0= RULE_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon ) )
            // InternalGumboParser.g:788:2: (otherlv_0= Assume ( (lv_displayName_1_0= RULE_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon )
            {
            // InternalGumboParser.g:788:2: (otherlv_0= Assume ( (lv_displayName_1_0= RULE_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon )
            // InternalGumboParser.g:789:3: otherlv_0= Assume ( (lv_displayName_1_0= RULE_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon
            {
            otherlv_0=(Token)match(input,Assume,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAssumeStatementAccess().getAssumeKeyword_0());
              		
            }
            // InternalGumboParser.g:793:3: ( (lv_displayName_1_0= RULE_STRING ) )
            // InternalGumboParser.g:794:4: (lv_displayName_1_0= RULE_STRING )
            {
            // InternalGumboParser.g:794:4: (lv_displayName_1_0= RULE_STRING )
            // InternalGumboParser.g:795:5: lv_displayName_1_0= RULE_STRING
            {
            lv_displayName_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_displayName_1_0, grammarAccess.getAssumeStatementAccess().getDisplayNameSTRINGTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAssumeStatementRule());
              					}
              					setWithLastConsumed(
              						current,
              						"displayName",
              						lv_displayName_1_0,
              						"org.osate.xtext.aadl2.properties.Properties.STRING");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,Colon,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAssumeStatementAccess().getColonKeyword_2());
              		
            }
            // InternalGumboParser.g:815:3: ( (lv_expr_3_0= ruleExpr ) )
            // InternalGumboParser.g:816:4: (lv_expr_3_0= ruleExpr )
            {
            // InternalGumboParser.g:816:4: (lv_expr_3_0= ruleExpr )
            // InternalGumboParser.g:817:5: lv_expr_3_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssumeStatementAccess().getExprExprParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_12);
            lv_expr_3_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAssumeStatementRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_3_0,
              						"org.sireum.aadl.gumbo.Gumbo.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,Semicolon,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getAssumeStatementAccess().getSemicolonKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssumeStatement"


    // $ANTLR start "entryRuleAnonAssumeStatement"
    // InternalGumboParser.g:842:1: entryRuleAnonAssumeStatement returns [EObject current=null] : iv_ruleAnonAssumeStatement= ruleAnonAssumeStatement EOF ;
    public final EObject entryRuleAnonAssumeStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnonAssumeStatement = null;


        try {
            // InternalGumboParser.g:842:60: (iv_ruleAnonAssumeStatement= ruleAnonAssumeStatement EOF )
            // InternalGumboParser.g:843:2: iv_ruleAnonAssumeStatement= ruleAnonAssumeStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnonAssumeStatementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAnonAssumeStatement=ruleAnonAssumeStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnonAssumeStatement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnonAssumeStatement"


    // $ANTLR start "ruleAnonAssumeStatement"
    // InternalGumboParser.g:849:1: ruleAnonAssumeStatement returns [EObject current=null] : (otherlv_0= Assume ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon ) ;
    public final EObject ruleAnonAssumeStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:855:2: ( (otherlv_0= Assume ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon ) )
            // InternalGumboParser.g:856:2: (otherlv_0= Assume ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon )
            {
            // InternalGumboParser.g:856:2: (otherlv_0= Assume ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon )
            // InternalGumboParser.g:857:3: otherlv_0= Assume ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon
            {
            otherlv_0=(Token)match(input,Assume,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAnonAssumeStatementAccess().getAssumeKeyword_0());
              		
            }
            // InternalGumboParser.g:861:3: ( (lv_expr_1_0= ruleExpr ) )
            // InternalGumboParser.g:862:4: (lv_expr_1_0= ruleExpr )
            {
            // InternalGumboParser.g:862:4: (lv_expr_1_0= ruleExpr )
            // InternalGumboParser.g:863:5: lv_expr_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAnonAssumeStatementAccess().getExprExprParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_12);
            lv_expr_1_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAnonAssumeStatementRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_1_0,
              						"org.sireum.aadl.gumbo.Gumbo.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,Semicolon,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAnonAssumeStatementAccess().getSemicolonKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnonAssumeStatement"


    // $ANTLR start "entryRuleGuaranteeStatement"
    // InternalGumboParser.g:888:1: entryRuleGuaranteeStatement returns [EObject current=null] : iv_ruleGuaranteeStatement= ruleGuaranteeStatement EOF ;
    public final EObject entryRuleGuaranteeStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuaranteeStatement = null;


        try {
            // InternalGumboParser.g:888:59: (iv_ruleGuaranteeStatement= ruleGuaranteeStatement EOF )
            // InternalGumboParser.g:889:2: iv_ruleGuaranteeStatement= ruleGuaranteeStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGuaranteeStatementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGuaranteeStatement=ruleGuaranteeStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGuaranteeStatement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGuaranteeStatement"


    // $ANTLR start "ruleGuaranteeStatement"
    // InternalGumboParser.g:895:1: ruleGuaranteeStatement returns [EObject current=null] : (otherlv_0= Guarantee ( (lv_displayName_1_0= RULE_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon ) ;
    public final EObject ruleGuaranteeStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_displayName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expr_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:901:2: ( (otherlv_0= Guarantee ( (lv_displayName_1_0= RULE_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon ) )
            // InternalGumboParser.g:902:2: (otherlv_0= Guarantee ( (lv_displayName_1_0= RULE_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon )
            {
            // InternalGumboParser.g:902:2: (otherlv_0= Guarantee ( (lv_displayName_1_0= RULE_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon )
            // InternalGumboParser.g:903:3: otherlv_0= Guarantee ( (lv_displayName_1_0= RULE_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon
            {
            otherlv_0=(Token)match(input,Guarantee,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGuaranteeStatementAccess().getGuaranteeKeyword_0());
              		
            }
            // InternalGumboParser.g:907:3: ( (lv_displayName_1_0= RULE_STRING ) )
            // InternalGumboParser.g:908:4: (lv_displayName_1_0= RULE_STRING )
            {
            // InternalGumboParser.g:908:4: (lv_displayName_1_0= RULE_STRING )
            // InternalGumboParser.g:909:5: lv_displayName_1_0= RULE_STRING
            {
            lv_displayName_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_displayName_1_0, grammarAccess.getGuaranteeStatementAccess().getDisplayNameSTRINGTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGuaranteeStatementRule());
              					}
              					setWithLastConsumed(
              						current,
              						"displayName",
              						lv_displayName_1_0,
              						"org.osate.xtext.aadl2.properties.Properties.STRING");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,Colon,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGuaranteeStatementAccess().getColonKeyword_2());
              		
            }
            // InternalGumboParser.g:929:3: ( (lv_expr_3_0= ruleExpr ) )
            // InternalGumboParser.g:930:4: (lv_expr_3_0= ruleExpr )
            {
            // InternalGumboParser.g:930:4: (lv_expr_3_0= ruleExpr )
            // InternalGumboParser.g:931:5: lv_expr_3_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGuaranteeStatementAccess().getExprExprParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_12);
            lv_expr_3_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGuaranteeStatementRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_3_0,
              						"org.sireum.aadl.gumbo.Gumbo.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,Semicolon,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getGuaranteeStatementAccess().getSemicolonKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGuaranteeStatement"


    // $ANTLR start "entryRuleAnonGuaranteeStatement"
    // InternalGumboParser.g:956:1: entryRuleAnonGuaranteeStatement returns [EObject current=null] : iv_ruleAnonGuaranteeStatement= ruleAnonGuaranteeStatement EOF ;
    public final EObject entryRuleAnonGuaranteeStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnonGuaranteeStatement = null;


        try {
            // InternalGumboParser.g:956:63: (iv_ruleAnonGuaranteeStatement= ruleAnonGuaranteeStatement EOF )
            // InternalGumboParser.g:957:2: iv_ruleAnonGuaranteeStatement= ruleAnonGuaranteeStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnonGuaranteeStatementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAnonGuaranteeStatement=ruleAnonGuaranteeStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnonGuaranteeStatement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnonGuaranteeStatement"


    // $ANTLR start "ruleAnonGuaranteeStatement"
    // InternalGumboParser.g:963:1: ruleAnonGuaranteeStatement returns [EObject current=null] : (otherlv_0= Guarantee ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon ) ;
    public final EObject ruleAnonGuaranteeStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:969:2: ( (otherlv_0= Guarantee ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon ) )
            // InternalGumboParser.g:970:2: (otherlv_0= Guarantee ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon )
            {
            // InternalGumboParser.g:970:2: (otherlv_0= Guarantee ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon )
            // InternalGumboParser.g:971:3: otherlv_0= Guarantee ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon
            {
            otherlv_0=(Token)match(input,Guarantee,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAnonGuaranteeStatementAccess().getGuaranteeKeyword_0());
              		
            }
            // InternalGumboParser.g:975:3: ( (lv_expr_1_0= ruleExpr ) )
            // InternalGumboParser.g:976:4: (lv_expr_1_0= ruleExpr )
            {
            // InternalGumboParser.g:976:4: (lv_expr_1_0= ruleExpr )
            // InternalGumboParser.g:977:5: lv_expr_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAnonGuaranteeStatementAccess().getExprExprParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_12);
            lv_expr_1_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAnonGuaranteeStatementRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_1_0,
              						"org.sireum.aadl.gumbo.Gumbo.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,Semicolon,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAnonGuaranteeStatementAccess().getSemicolonKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnonGuaranteeStatement"


    // $ANTLR start "entryRuleExpr"
    // InternalGumboParser.g:1002:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // InternalGumboParser.g:1002:45: (iv_ruleExpr= ruleExpr EOF )
            // InternalGumboParser.g:1003:2: iv_ruleExpr= ruleExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExpr=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // InternalGumboParser.g:1009:1: ruleExpr returns [EObject current=null] : this_ImpliesExpr_0= ruleImpliesExpr ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject this_ImpliesExpr_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1015:2: (this_ImpliesExpr_0= ruleImpliesExpr )
            // InternalGumboParser.g:1016:2: this_ImpliesExpr_0= ruleImpliesExpr
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getExprAccess().getImpliesExprParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_ImpliesExpr_0=ruleImpliesExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_ImpliesExpr_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleImpliesExpr"
    // InternalGumboParser.g:1027:1: entryRuleImpliesExpr returns [EObject current=null] : iv_ruleImpliesExpr= ruleImpliesExpr EOF ;
    public final EObject entryRuleImpliesExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpliesExpr = null;


        try {
            // InternalGumboParser.g:1027:52: (iv_ruleImpliesExpr= ruleImpliesExpr EOF )
            // InternalGumboParser.g:1028:2: iv_ruleImpliesExpr= ruleImpliesExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImpliesExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleImpliesExpr=ruleImpliesExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImpliesExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImpliesExpr"


    // $ANTLR start "ruleImpliesExpr"
    // InternalGumboParser.g:1034:1: ruleImpliesExpr returns [EObject current=null] : (this_EquivExpr_0= ruleEquivExpr ( ( ( ( () ( EqualsSignGreaterThanSign | Implies ) ) )=> ( () (otherlv_2= EqualsSignGreaterThanSign | otherlv_3= Implies ) ) ) ( (lv_right_4_0= ruleImpliesExpr ) ) )? ) ;
    public final EObject ruleImpliesExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_EquivExpr_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1040:2: ( (this_EquivExpr_0= ruleEquivExpr ( ( ( ( () ( EqualsSignGreaterThanSign | Implies ) ) )=> ( () (otherlv_2= EqualsSignGreaterThanSign | otherlv_3= Implies ) ) ) ( (lv_right_4_0= ruleImpliesExpr ) ) )? ) )
            // InternalGumboParser.g:1041:2: (this_EquivExpr_0= ruleEquivExpr ( ( ( ( () ( EqualsSignGreaterThanSign | Implies ) ) )=> ( () (otherlv_2= EqualsSignGreaterThanSign | otherlv_3= Implies ) ) ) ( (lv_right_4_0= ruleImpliesExpr ) ) )? )
            {
            // InternalGumboParser.g:1041:2: (this_EquivExpr_0= ruleEquivExpr ( ( ( ( () ( EqualsSignGreaterThanSign | Implies ) ) )=> ( () (otherlv_2= EqualsSignGreaterThanSign | otherlv_3= Implies ) ) ) ( (lv_right_4_0= ruleImpliesExpr ) ) )? )
            // InternalGumboParser.g:1042:3: this_EquivExpr_0= ruleEquivExpr ( ( ( ( () ( EqualsSignGreaterThanSign | Implies ) ) )=> ( () (otherlv_2= EqualsSignGreaterThanSign | otherlv_3= Implies ) ) ) ( (lv_right_4_0= ruleImpliesExpr ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getImpliesExprAccess().getEquivExprParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_23);
            this_EquivExpr_0=ruleEquivExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_EquivExpr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGumboParser.g:1050:3: ( ( ( ( () ( EqualsSignGreaterThanSign | Implies ) ) )=> ( () (otherlv_2= EqualsSignGreaterThanSign | otherlv_3= Implies ) ) ) ( (lv_right_4_0= ruleImpliesExpr ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==EqualsSignGreaterThanSign) && (synpred1_InternalGumboParser())) {
                alt13=1;
            }
            else if ( (LA13_0==Implies) && (synpred1_InternalGumboParser())) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGumboParser.g:1051:4: ( ( ( () ( EqualsSignGreaterThanSign | Implies ) ) )=> ( () (otherlv_2= EqualsSignGreaterThanSign | otherlv_3= Implies ) ) ) ( (lv_right_4_0= ruleImpliesExpr ) )
                    {
                    // InternalGumboParser.g:1051:4: ( ( ( () ( EqualsSignGreaterThanSign | Implies ) ) )=> ( () (otherlv_2= EqualsSignGreaterThanSign | otherlv_3= Implies ) ) )
                    // InternalGumboParser.g:1052:5: ( ( () ( EqualsSignGreaterThanSign | Implies ) ) )=> ( () (otherlv_2= EqualsSignGreaterThanSign | otherlv_3= Implies ) )
                    {
                    // InternalGumboParser.g:1062:5: ( () (otherlv_2= EqualsSignGreaterThanSign | otherlv_3= Implies ) )
                    // InternalGumboParser.g:1063:6: () (otherlv_2= EqualsSignGreaterThanSign | otherlv_3= Implies )
                    {
                    // InternalGumboParser.g:1063:6: ()
                    // InternalGumboParser.g:1064:7: 
                    {
                    if ( state.backtracking==0 ) {

                      							current = forceCreateModelElementAndSet(
                      								grammarAccess.getImpliesExprAccess().getBinaryExprLeftAction_1_0_0_0(),
                      								current);
                      						
                    }

                    }

                    // InternalGumboParser.g:1070:6: (otherlv_2= EqualsSignGreaterThanSign | otherlv_3= Implies )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==EqualsSignGreaterThanSign) ) {
                        alt12=1;
                    }
                    else if ( (LA12_0==Implies) ) {
                        alt12=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalGumboParser.g:1071:7: otherlv_2= EqualsSignGreaterThanSign
                            {
                            otherlv_2=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_16); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_2, grammarAccess.getImpliesExprAccess().getEqualsSignGreaterThanSignKeyword_1_0_0_1_0());
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalGumboParser.g:1076:7: otherlv_3= Implies
                            {
                            otherlv_3=(Token)match(input,Implies,FollowSets000.FOLLOW_16); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_3, grammarAccess.getImpliesExprAccess().getImpliesKeyword_1_0_0_1_1());
                              						
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalGumboParser.g:1083:4: ( (lv_right_4_0= ruleImpliesExpr ) )
                    // InternalGumboParser.g:1084:5: (lv_right_4_0= ruleImpliesExpr )
                    {
                    // InternalGumboParser.g:1084:5: (lv_right_4_0= ruleImpliesExpr )
                    // InternalGumboParser.g:1085:6: lv_right_4_0= ruleImpliesExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getImpliesExprAccess().getRightImpliesExprParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_right_4_0=ruleImpliesExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getImpliesExprRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_4_0,
                      							"org.sireum.aadl.gumbo.Gumbo.ImpliesExpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImpliesExpr"


    // $ANTLR start "entryRuleEquivExpr"
    // InternalGumboParser.g:1107:1: entryRuleEquivExpr returns [EObject current=null] : iv_ruleEquivExpr= ruleEquivExpr EOF ;
    public final EObject entryRuleEquivExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquivExpr = null;


        try {
            // InternalGumboParser.g:1107:50: (iv_ruleEquivExpr= ruleEquivExpr EOF )
            // InternalGumboParser.g:1108:2: iv_ruleEquivExpr= ruleEquivExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEquivExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEquivExpr=ruleEquivExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEquivExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEquivExpr"


    // $ANTLR start "ruleEquivExpr"
    // InternalGumboParser.g:1114:1: ruleEquivExpr returns [EObject current=null] : (this_OrExpr_0= ruleOrExpr ( ( ( ( () ( ( LessThanSignEqualsSignGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0= LessThanSignEqualsSignGreaterThanSign ) ) ) ) ( (lv_right_3_0= ruleOrExpr ) ) )? ) ;
    public final EObject ruleEquivExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_OrExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1120:2: ( (this_OrExpr_0= ruleOrExpr ( ( ( ( () ( ( LessThanSignEqualsSignGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0= LessThanSignEqualsSignGreaterThanSign ) ) ) ) ( (lv_right_3_0= ruleOrExpr ) ) )? ) )
            // InternalGumboParser.g:1121:2: (this_OrExpr_0= ruleOrExpr ( ( ( ( () ( ( LessThanSignEqualsSignGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0= LessThanSignEqualsSignGreaterThanSign ) ) ) ) ( (lv_right_3_0= ruleOrExpr ) ) )? )
            {
            // InternalGumboParser.g:1121:2: (this_OrExpr_0= ruleOrExpr ( ( ( ( () ( ( LessThanSignEqualsSignGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0= LessThanSignEqualsSignGreaterThanSign ) ) ) ) ( (lv_right_3_0= ruleOrExpr ) ) )? )
            // InternalGumboParser.g:1122:3: this_OrExpr_0= ruleOrExpr ( ( ( ( () ( ( LessThanSignEqualsSignGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0= LessThanSignEqualsSignGreaterThanSign ) ) ) ) ( (lv_right_3_0= ruleOrExpr ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEquivExprAccess().getOrExprParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_24);
            this_OrExpr_0=ruleOrExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_OrExpr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGumboParser.g:1130:3: ( ( ( ( () ( ( LessThanSignEqualsSignGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0= LessThanSignEqualsSignGreaterThanSign ) ) ) ) ( (lv_right_3_0= ruleOrExpr ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==LessThanSignEqualsSignGreaterThanSign) && (synpred2_InternalGumboParser())) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGumboParser.g:1131:4: ( ( ( () ( ( LessThanSignEqualsSignGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0= LessThanSignEqualsSignGreaterThanSign ) ) ) ) ( (lv_right_3_0= ruleOrExpr ) )
                    {
                    // InternalGumboParser.g:1131:4: ( ( ( () ( ( LessThanSignEqualsSignGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0= LessThanSignEqualsSignGreaterThanSign ) ) ) )
                    // InternalGumboParser.g:1132:5: ( ( () ( ( LessThanSignEqualsSignGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0= LessThanSignEqualsSignGreaterThanSign ) ) )
                    {
                    // InternalGumboParser.g:1142:5: ( () ( (lv_op_2_0= LessThanSignEqualsSignGreaterThanSign ) ) )
                    // InternalGumboParser.g:1143:6: () ( (lv_op_2_0= LessThanSignEqualsSignGreaterThanSign ) )
                    {
                    // InternalGumboParser.g:1143:6: ()
                    // InternalGumboParser.g:1144:7: 
                    {
                    if ( state.backtracking==0 ) {

                      							current = forceCreateModelElementAndSet(
                      								grammarAccess.getEquivExprAccess().getBinaryExprLeftAction_1_0_0_0(),
                      								current);
                      						
                    }

                    }

                    // InternalGumboParser.g:1150:6: ( (lv_op_2_0= LessThanSignEqualsSignGreaterThanSign ) )
                    // InternalGumboParser.g:1151:7: (lv_op_2_0= LessThanSignEqualsSignGreaterThanSign )
                    {
                    // InternalGumboParser.g:1151:7: (lv_op_2_0= LessThanSignEqualsSignGreaterThanSign )
                    // InternalGumboParser.g:1152:8: lv_op_2_0= LessThanSignEqualsSignGreaterThanSign
                    {
                    lv_op_2_0=(Token)match(input,LessThanSignEqualsSignGreaterThanSign,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								newLeafNode(lv_op_2_0, grammarAccess.getEquivExprAccess().getOpLessThanSignEqualsSignGreaterThanSignKeyword_1_0_0_1_0());
                      							
                    }
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElement(grammarAccess.getEquivExprRule());
                      								}
                      								setWithLastConsumed(current, "op", lv_op_2_0, "<=>");
                      							
                    }

                    }


                    }


                    }


                    }

                    // InternalGumboParser.g:1166:4: ( (lv_right_3_0= ruleOrExpr ) )
                    // InternalGumboParser.g:1167:5: (lv_right_3_0= ruleOrExpr )
                    {
                    // InternalGumboParser.g:1167:5: (lv_right_3_0= ruleOrExpr )
                    // InternalGumboParser.g:1168:6: lv_right_3_0= ruleOrExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEquivExprAccess().getRightOrExprParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_right_3_0=ruleOrExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEquivExprRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_3_0,
                      							"org.sireum.aadl.gumbo.Gumbo.OrExpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEquivExpr"


    // $ANTLR start "entryRuleOrExpr"
    // InternalGumboParser.g:1190:1: entryRuleOrExpr returns [EObject current=null] : iv_ruleOrExpr= ruleOrExpr EOF ;
    public final EObject entryRuleOrExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpr = null;


        try {
            // InternalGumboParser.g:1190:47: (iv_ruleOrExpr= ruleOrExpr EOF )
            // InternalGumboParser.g:1191:2: iv_ruleOrExpr= ruleOrExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOrExpr=ruleOrExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrExpr"


    // $ANTLR start "ruleOrExpr"
    // InternalGumboParser.g:1197:1: ruleOrExpr returns [EObject current=null] : (this_AndExpr_0= ruleAndExpr ( ( ( ( () ( ( ( Or ) ) | ( ( Orelse ) ) ) ) )=> ( () ( ( (lv_op_2_0= Or ) ) | ( (lv_op_3_0= Orelse ) ) ) ) ) ( (lv_right_4_0= ruleAndExpr ) ) )* ) ;
    public final EObject ruleOrExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        Token lv_op_3_0=null;
        EObject this_AndExpr_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1203:2: ( (this_AndExpr_0= ruleAndExpr ( ( ( ( () ( ( ( Or ) ) | ( ( Orelse ) ) ) ) )=> ( () ( ( (lv_op_2_0= Or ) ) | ( (lv_op_3_0= Orelse ) ) ) ) ) ( (lv_right_4_0= ruleAndExpr ) ) )* ) )
            // InternalGumboParser.g:1204:2: (this_AndExpr_0= ruleAndExpr ( ( ( ( () ( ( ( Or ) ) | ( ( Orelse ) ) ) ) )=> ( () ( ( (lv_op_2_0= Or ) ) | ( (lv_op_3_0= Orelse ) ) ) ) ) ( (lv_right_4_0= ruleAndExpr ) ) )* )
            {
            // InternalGumboParser.g:1204:2: (this_AndExpr_0= ruleAndExpr ( ( ( ( () ( ( ( Or ) ) | ( ( Orelse ) ) ) ) )=> ( () ( ( (lv_op_2_0= Or ) ) | ( (lv_op_3_0= Orelse ) ) ) ) ) ( (lv_right_4_0= ruleAndExpr ) ) )* )
            // InternalGumboParser.g:1205:3: this_AndExpr_0= ruleAndExpr ( ( ( ( () ( ( ( Or ) ) | ( ( Orelse ) ) ) ) )=> ( () ( ( (lv_op_2_0= Or ) ) | ( (lv_op_3_0= Orelse ) ) ) ) ) ( (lv_right_4_0= ruleAndExpr ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrExprAccess().getAndExprParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_25);
            this_AndExpr_0=ruleAndExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AndExpr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGumboParser.g:1213:3: ( ( ( ( () ( ( ( Or ) ) | ( ( Orelse ) ) ) ) )=> ( () ( ( (lv_op_2_0= Or ) ) | ( (lv_op_3_0= Orelse ) ) ) ) ) ( (lv_right_4_0= ruleAndExpr ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==Or) && (synpred3_InternalGumboParser())) {
                    alt16=1;
                }
                else if ( (LA16_0==Orelse) && (synpred3_InternalGumboParser())) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGumboParser.g:1214:4: ( ( ( () ( ( ( Or ) ) | ( ( Orelse ) ) ) ) )=> ( () ( ( (lv_op_2_0= Or ) ) | ( (lv_op_3_0= Orelse ) ) ) ) ) ( (lv_right_4_0= ruleAndExpr ) )
            	    {
            	    // InternalGumboParser.g:1214:4: ( ( ( () ( ( ( Or ) ) | ( ( Orelse ) ) ) ) )=> ( () ( ( (lv_op_2_0= Or ) ) | ( (lv_op_3_0= Orelse ) ) ) ) )
            	    // InternalGumboParser.g:1215:5: ( ( () ( ( ( Or ) ) | ( ( Orelse ) ) ) ) )=> ( () ( ( (lv_op_2_0= Or ) ) | ( (lv_op_3_0= Orelse ) ) ) )
            	    {
            	    // InternalGumboParser.g:1233:5: ( () ( ( (lv_op_2_0= Or ) ) | ( (lv_op_3_0= Orelse ) ) ) )
            	    // InternalGumboParser.g:1234:6: () ( ( (lv_op_2_0= Or ) ) | ( (lv_op_3_0= Orelse ) ) )
            	    {
            	    // InternalGumboParser.g:1234:6: ()
            	    // InternalGumboParser.g:1235:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getOrExprAccess().getBinaryExprLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalGumboParser.g:1241:6: ( ( (lv_op_2_0= Or ) ) | ( (lv_op_3_0= Orelse ) ) )
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==Or) ) {
            	        alt15=1;
            	    }
            	    else if ( (LA15_0==Orelse) ) {
            	        alt15=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // InternalGumboParser.g:1242:7: ( (lv_op_2_0= Or ) )
            	            {
            	            // InternalGumboParser.g:1242:7: ( (lv_op_2_0= Or ) )
            	            // InternalGumboParser.g:1243:8: (lv_op_2_0= Or )
            	            {
            	            // InternalGumboParser.g:1243:8: (lv_op_2_0= Or )
            	            // InternalGumboParser.g:1244:9: lv_op_2_0= Or
            	            {
            	            lv_op_2_0=(Token)match(input,Or,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									newLeafNode(lv_op_2_0, grammarAccess.getOrExprAccess().getOpOrKeyword_1_0_0_1_0_0());
            	              								
            	            }
            	            if ( state.backtracking==0 ) {

            	              									if (current==null) {
            	              										current = createModelElement(grammarAccess.getOrExprRule());
            	              									}
            	              									setWithLastConsumed(current, "op", lv_op_2_0, "or");
            	              								
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalGumboParser.g:1257:7: ( (lv_op_3_0= Orelse ) )
            	            {
            	            // InternalGumboParser.g:1257:7: ( (lv_op_3_0= Orelse ) )
            	            // InternalGumboParser.g:1258:8: (lv_op_3_0= Orelse )
            	            {
            	            // InternalGumboParser.g:1258:8: (lv_op_3_0= Orelse )
            	            // InternalGumboParser.g:1259:9: lv_op_3_0= Orelse
            	            {
            	            lv_op_3_0=(Token)match(input,Orelse,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									newLeafNode(lv_op_3_0, grammarAccess.getOrExprAccess().getOpOrelseKeyword_1_0_0_1_1_0());
            	              								
            	            }
            	            if ( state.backtracking==0 ) {

            	              									if (current==null) {
            	              										current = createModelElement(grammarAccess.getOrExprRule());
            	              									}
            	              									setWithLastConsumed(current, "op", lv_op_3_0, "orelse");
            	              								
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalGumboParser.g:1274:4: ( (lv_right_4_0= ruleAndExpr ) )
            	    // InternalGumboParser.g:1275:5: (lv_right_4_0= ruleAndExpr )
            	    {
            	    // InternalGumboParser.g:1275:5: (lv_right_4_0= ruleAndExpr )
            	    // InternalGumboParser.g:1276:6: lv_right_4_0= ruleAndExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrExprAccess().getRightAndExprParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_25);
            	    lv_right_4_0=ruleAndExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getOrExprRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_4_0,
            	      							"org.sireum.aadl.gumbo.Gumbo.AndExpr");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrExpr"


    // $ANTLR start "entryRuleAndExpr"
    // InternalGumboParser.g:1298:1: entryRuleAndExpr returns [EObject current=null] : iv_ruleAndExpr= ruleAndExpr EOF ;
    public final EObject entryRuleAndExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpr = null;


        try {
            // InternalGumboParser.g:1298:48: (iv_ruleAndExpr= ruleAndExpr EOF )
            // InternalGumboParser.g:1299:2: iv_ruleAndExpr= ruleAndExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAndExpr=ruleAndExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndExpr"


    // $ANTLR start "ruleAndExpr"
    // InternalGumboParser.g:1305:1: ruleAndExpr returns [EObject current=null] : (this_RelationalExpr_0= ruleRelationalExpr ( ( ( ( () ( ( ( And ) ) | ( ( Andthen ) ) ) ) )=> ( () ( ( (lv_op_2_0= And ) ) | ( (lv_op_3_0= Andthen ) ) ) ) ) ( (lv_right_4_0= ruleRelationalExpr ) ) )* ) ;
    public final EObject ruleAndExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        Token lv_op_3_0=null;
        EObject this_RelationalExpr_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1311:2: ( (this_RelationalExpr_0= ruleRelationalExpr ( ( ( ( () ( ( ( And ) ) | ( ( Andthen ) ) ) ) )=> ( () ( ( (lv_op_2_0= And ) ) | ( (lv_op_3_0= Andthen ) ) ) ) ) ( (lv_right_4_0= ruleRelationalExpr ) ) )* ) )
            // InternalGumboParser.g:1312:2: (this_RelationalExpr_0= ruleRelationalExpr ( ( ( ( () ( ( ( And ) ) | ( ( Andthen ) ) ) ) )=> ( () ( ( (lv_op_2_0= And ) ) | ( (lv_op_3_0= Andthen ) ) ) ) ) ( (lv_right_4_0= ruleRelationalExpr ) ) )* )
            {
            // InternalGumboParser.g:1312:2: (this_RelationalExpr_0= ruleRelationalExpr ( ( ( ( () ( ( ( And ) ) | ( ( Andthen ) ) ) ) )=> ( () ( ( (lv_op_2_0= And ) ) | ( (lv_op_3_0= Andthen ) ) ) ) ) ( (lv_right_4_0= ruleRelationalExpr ) ) )* )
            // InternalGumboParser.g:1313:3: this_RelationalExpr_0= ruleRelationalExpr ( ( ( ( () ( ( ( And ) ) | ( ( Andthen ) ) ) ) )=> ( () ( ( (lv_op_2_0= And ) ) | ( (lv_op_3_0= Andthen ) ) ) ) ) ( (lv_right_4_0= ruleRelationalExpr ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndExprAccess().getRelationalExprParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_26);
            this_RelationalExpr_0=ruleRelationalExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_RelationalExpr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGumboParser.g:1321:3: ( ( ( ( () ( ( ( And ) ) | ( ( Andthen ) ) ) ) )=> ( () ( ( (lv_op_2_0= And ) ) | ( (lv_op_3_0= Andthen ) ) ) ) ) ( (lv_right_4_0= ruleRelationalExpr ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==And) && (synpred4_InternalGumboParser())) {
                    alt18=1;
                }
                else if ( (LA18_0==Andthen) && (synpred4_InternalGumboParser())) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalGumboParser.g:1322:4: ( ( ( () ( ( ( And ) ) | ( ( Andthen ) ) ) ) )=> ( () ( ( (lv_op_2_0= And ) ) | ( (lv_op_3_0= Andthen ) ) ) ) ) ( (lv_right_4_0= ruleRelationalExpr ) )
            	    {
            	    // InternalGumboParser.g:1322:4: ( ( ( () ( ( ( And ) ) | ( ( Andthen ) ) ) ) )=> ( () ( ( (lv_op_2_0= And ) ) | ( (lv_op_3_0= Andthen ) ) ) ) )
            	    // InternalGumboParser.g:1323:5: ( ( () ( ( ( And ) ) | ( ( Andthen ) ) ) ) )=> ( () ( ( (lv_op_2_0= And ) ) | ( (lv_op_3_0= Andthen ) ) ) )
            	    {
            	    // InternalGumboParser.g:1341:5: ( () ( ( (lv_op_2_0= And ) ) | ( (lv_op_3_0= Andthen ) ) ) )
            	    // InternalGumboParser.g:1342:6: () ( ( (lv_op_2_0= And ) ) | ( (lv_op_3_0= Andthen ) ) )
            	    {
            	    // InternalGumboParser.g:1342:6: ()
            	    // InternalGumboParser.g:1343:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getAndExprAccess().getBinaryExprLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalGumboParser.g:1349:6: ( ( (lv_op_2_0= And ) ) | ( (lv_op_3_0= Andthen ) ) )
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==And) ) {
            	        alt17=1;
            	    }
            	    else if ( (LA17_0==Andthen) ) {
            	        alt17=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // InternalGumboParser.g:1350:7: ( (lv_op_2_0= And ) )
            	            {
            	            // InternalGumboParser.g:1350:7: ( (lv_op_2_0= And ) )
            	            // InternalGumboParser.g:1351:8: (lv_op_2_0= And )
            	            {
            	            // InternalGumboParser.g:1351:8: (lv_op_2_0= And )
            	            // InternalGumboParser.g:1352:9: lv_op_2_0= And
            	            {
            	            lv_op_2_0=(Token)match(input,And,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									newLeafNode(lv_op_2_0, grammarAccess.getAndExprAccess().getOpAndKeyword_1_0_0_1_0_0());
            	              								
            	            }
            	            if ( state.backtracking==0 ) {

            	              									if (current==null) {
            	              										current = createModelElement(grammarAccess.getAndExprRule());
            	              									}
            	              									setWithLastConsumed(current, "op", lv_op_2_0, "and");
            	              								
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalGumboParser.g:1365:7: ( (lv_op_3_0= Andthen ) )
            	            {
            	            // InternalGumboParser.g:1365:7: ( (lv_op_3_0= Andthen ) )
            	            // InternalGumboParser.g:1366:8: (lv_op_3_0= Andthen )
            	            {
            	            // InternalGumboParser.g:1366:8: (lv_op_3_0= Andthen )
            	            // InternalGumboParser.g:1367:9: lv_op_3_0= Andthen
            	            {
            	            lv_op_3_0=(Token)match(input,Andthen,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									newLeafNode(lv_op_3_0, grammarAccess.getAndExprAccess().getOpAndthenKeyword_1_0_0_1_1_0());
            	              								
            	            }
            	            if ( state.backtracking==0 ) {

            	              									if (current==null) {
            	              										current = createModelElement(grammarAccess.getAndExprRule());
            	              									}
            	              									setWithLastConsumed(current, "op", lv_op_3_0, "andthen");
            	              								
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalGumboParser.g:1382:4: ( (lv_right_4_0= ruleRelationalExpr ) )
            	    // InternalGumboParser.g:1383:5: (lv_right_4_0= ruleRelationalExpr )
            	    {
            	    // InternalGumboParser.g:1383:5: (lv_right_4_0= ruleRelationalExpr )
            	    // InternalGumboParser.g:1384:6: lv_right_4_0= ruleRelationalExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndExprAccess().getRightRelationalExprParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_26);
            	    lv_right_4_0=ruleRelationalExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAndExprRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_4_0,
            	      							"org.sireum.aadl.gumbo.Gumbo.RelationalExpr");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndExpr"


    // $ANTLR start "entryRuleRelationalOp"
    // InternalGumboParser.g:1406:1: entryRuleRelationalOp returns [String current=null] : iv_ruleRelationalOp= ruleRelationalOp EOF ;
    public final String entryRuleRelationalOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelationalOp = null;


        try {
            // InternalGumboParser.g:1406:52: (iv_ruleRelationalOp= ruleRelationalOp EOF )
            // InternalGumboParser.g:1407:2: iv_ruleRelationalOp= ruleRelationalOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalOpRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRelationalOp=ruleRelationalOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationalOp.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationalOp"


    // $ANTLR start "ruleRelationalOp"
    // InternalGumboParser.g:1413:1: ruleRelationalOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= LessThanSign | kw= LessThanSignEqualsSign | kw= GreaterThanSign | kw= GreaterThanSignEqualsSign | kw= EqualsSign | kw= LessThanSignGreaterThanSign ) ;
    public final AntlrDatatypeRuleToken ruleRelationalOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumboParser.g:1419:2: ( (kw= LessThanSign | kw= LessThanSignEqualsSign | kw= GreaterThanSign | kw= GreaterThanSignEqualsSign | kw= EqualsSign | kw= LessThanSignGreaterThanSign ) )
            // InternalGumboParser.g:1420:2: (kw= LessThanSign | kw= LessThanSignEqualsSign | kw= GreaterThanSign | kw= GreaterThanSignEqualsSign | kw= EqualsSign | kw= LessThanSignGreaterThanSign )
            {
            // InternalGumboParser.g:1420:2: (kw= LessThanSign | kw= LessThanSignEqualsSign | kw= GreaterThanSign | kw= GreaterThanSignEqualsSign | kw= EqualsSign | kw= LessThanSignGreaterThanSign )
            int alt19=6;
            switch ( input.LA(1) ) {
            case LessThanSign:
                {
                alt19=1;
                }
                break;
            case LessThanSignEqualsSign:
                {
                alt19=2;
                }
                break;
            case GreaterThanSign:
                {
                alt19=3;
                }
                break;
            case GreaterThanSignEqualsSign:
                {
                alt19=4;
                }
                break;
            case EqualsSign:
                {
                alt19=5;
                }
                break;
            case LessThanSignGreaterThanSign:
                {
                alt19=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalGumboParser.g:1421:3: kw= LessThanSign
                    {
                    kw=(Token)match(input,LessThanSign,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelationalOpAccess().getLessThanSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:1427:3: kw= LessThanSignEqualsSign
                    {
                    kw=(Token)match(input,LessThanSignEqualsSign,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelationalOpAccess().getLessThanSignEqualsSignKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGumboParser.g:1433:3: kw= GreaterThanSign
                    {
                    kw=(Token)match(input,GreaterThanSign,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelationalOpAccess().getGreaterThanSignKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGumboParser.g:1439:3: kw= GreaterThanSignEqualsSign
                    {
                    kw=(Token)match(input,GreaterThanSignEqualsSign,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelationalOpAccess().getGreaterThanSignEqualsSignKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGumboParser.g:1445:3: kw= EqualsSign
                    {
                    kw=(Token)match(input,EqualsSign,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelationalOpAccess().getEqualsSignKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalGumboParser.g:1451:3: kw= LessThanSignGreaterThanSign
                    {
                    kw=(Token)match(input,LessThanSignGreaterThanSign,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelationalOpAccess().getLessThanSignGreaterThanSignKeyword_5());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationalOp"


    // $ANTLR start "entryRuleRelationalExpr"
    // InternalGumboParser.g:1460:1: entryRuleRelationalExpr returns [EObject current=null] : iv_ruleRelationalExpr= ruleRelationalExpr EOF ;
    public final EObject entryRuleRelationalExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpr = null;


        try {
            // InternalGumboParser.g:1460:55: (iv_ruleRelationalExpr= ruleRelationalExpr EOF )
            // InternalGumboParser.g:1461:2: iv_ruleRelationalExpr= ruleRelationalExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRelationalExpr=ruleRelationalExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationalExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationalExpr"


    // $ANTLR start "ruleRelationalExpr"
    // InternalGumboParser.g:1467:1: ruleRelationalExpr returns [EObject current=null] : (this_AddSubExpr_0= ruleAddSubExpr ( ( ( ( () ( ( ruleRelationalOp ) ) ) )=> ( () ( (lv_op_2_0= ruleRelationalOp ) ) ) ) ( (lv_right_3_0= ruleAddSubExpr ) ) )? ) ;
    public final EObject ruleRelationalExpr() throws RecognitionException {
        EObject current = null;

        EObject this_AddSubExpr_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1473:2: ( (this_AddSubExpr_0= ruleAddSubExpr ( ( ( ( () ( ( ruleRelationalOp ) ) ) )=> ( () ( (lv_op_2_0= ruleRelationalOp ) ) ) ) ( (lv_right_3_0= ruleAddSubExpr ) ) )? ) )
            // InternalGumboParser.g:1474:2: (this_AddSubExpr_0= ruleAddSubExpr ( ( ( ( () ( ( ruleRelationalOp ) ) ) )=> ( () ( (lv_op_2_0= ruleRelationalOp ) ) ) ) ( (lv_right_3_0= ruleAddSubExpr ) ) )? )
            {
            // InternalGumboParser.g:1474:2: (this_AddSubExpr_0= ruleAddSubExpr ( ( ( ( () ( ( ruleRelationalOp ) ) ) )=> ( () ( (lv_op_2_0= ruleRelationalOp ) ) ) ) ( (lv_right_3_0= ruleAddSubExpr ) ) )? )
            // InternalGumboParser.g:1475:3: this_AddSubExpr_0= ruleAddSubExpr ( ( ( ( () ( ( ruleRelationalOp ) ) ) )=> ( () ( (lv_op_2_0= ruleRelationalOp ) ) ) ) ( (lv_right_3_0= ruleAddSubExpr ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRelationalExprAccess().getAddSubExprParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_27);
            this_AddSubExpr_0=ruleAddSubExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AddSubExpr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGumboParser.g:1483:3: ( ( ( ( () ( ( ruleRelationalOp ) ) ) )=> ( () ( (lv_op_2_0= ruleRelationalOp ) ) ) ) ( (lv_right_3_0= ruleAddSubExpr ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==LessThanSign) && (synpred5_InternalGumboParser())) {
                alt20=1;
            }
            else if ( (LA20_0==LessThanSignEqualsSign) && (synpred5_InternalGumboParser())) {
                alt20=1;
            }
            else if ( (LA20_0==GreaterThanSign) && (synpred5_InternalGumboParser())) {
                alt20=1;
            }
            else if ( (LA20_0==GreaterThanSignEqualsSign) && (synpred5_InternalGumboParser())) {
                alt20=1;
            }
            else if ( (LA20_0==EqualsSign) && (synpred5_InternalGumboParser())) {
                alt20=1;
            }
            else if ( (LA20_0==LessThanSignGreaterThanSign) && (synpred5_InternalGumboParser())) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalGumboParser.g:1484:4: ( ( ( () ( ( ruleRelationalOp ) ) ) )=> ( () ( (lv_op_2_0= ruleRelationalOp ) ) ) ) ( (lv_right_3_0= ruleAddSubExpr ) )
                    {
                    // InternalGumboParser.g:1484:4: ( ( ( () ( ( ruleRelationalOp ) ) ) )=> ( () ( (lv_op_2_0= ruleRelationalOp ) ) ) )
                    // InternalGumboParser.g:1485:5: ( ( () ( ( ruleRelationalOp ) ) ) )=> ( () ( (lv_op_2_0= ruleRelationalOp ) ) )
                    {
                    // InternalGumboParser.g:1495:5: ( () ( (lv_op_2_0= ruleRelationalOp ) ) )
                    // InternalGumboParser.g:1496:6: () ( (lv_op_2_0= ruleRelationalOp ) )
                    {
                    // InternalGumboParser.g:1496:6: ()
                    // InternalGumboParser.g:1497:7: 
                    {
                    if ( state.backtracking==0 ) {

                      							current = forceCreateModelElementAndSet(
                      								grammarAccess.getRelationalExprAccess().getBinaryExprLeftAction_1_0_0_0(),
                      								current);
                      						
                    }

                    }

                    // InternalGumboParser.g:1503:6: ( (lv_op_2_0= ruleRelationalOp ) )
                    // InternalGumboParser.g:1504:7: (lv_op_2_0= ruleRelationalOp )
                    {
                    // InternalGumboParser.g:1504:7: (lv_op_2_0= ruleRelationalOp )
                    // InternalGumboParser.g:1505:8: lv_op_2_0= ruleRelationalOp
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getRelationalExprAccess().getOpRelationalOpParserRuleCall_1_0_0_1_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_16);
                    lv_op_2_0=ruleRelationalOp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getRelationalExprRule());
                      								}
                      								set(
                      									current,
                      									"op",
                      									lv_op_2_0,
                      									"org.sireum.aadl.gumbo.Gumbo.RelationalOp");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }


                    }


                    }

                    // InternalGumboParser.g:1524:4: ( (lv_right_3_0= ruleAddSubExpr ) )
                    // InternalGumboParser.g:1525:5: (lv_right_3_0= ruleAddSubExpr )
                    {
                    // InternalGumboParser.g:1525:5: (lv_right_3_0= ruleAddSubExpr )
                    // InternalGumboParser.g:1526:6: lv_right_3_0= ruleAddSubExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRelationalExprAccess().getRightAddSubExprParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_right_3_0=ruleAddSubExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRelationalExprRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_3_0,
                      							"org.sireum.aadl.gumbo.Gumbo.AddSubExpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationalExpr"


    // $ANTLR start "entryRuleAddSubExpr"
    // InternalGumboParser.g:1548:1: entryRuleAddSubExpr returns [EObject current=null] : iv_ruleAddSubExpr= ruleAddSubExpr EOF ;
    public final EObject entryRuleAddSubExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddSubExpr = null;


        try {
            // InternalGumboParser.g:1548:51: (iv_ruleAddSubExpr= ruleAddSubExpr EOF )
            // InternalGumboParser.g:1549:2: iv_ruleAddSubExpr= ruleAddSubExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddSubExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAddSubExpr=ruleAddSubExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddSubExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddSubExpr"


    // $ANTLR start "ruleAddSubExpr"
    // InternalGumboParser.g:1555:1: ruleAddSubExpr returns [EObject current=null] : (this_MultDivModExpr_0= ruleMultDivModExpr ( ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ) ) ( (lv_right_3_0= ruleMultDivModExpr ) ) )* ) ;
    public final EObject ruleAddSubExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_MultDivModExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1561:2: ( (this_MultDivModExpr_0= ruleMultDivModExpr ( ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ) ) ( (lv_right_3_0= ruleMultDivModExpr ) ) )* ) )
            // InternalGumboParser.g:1562:2: (this_MultDivModExpr_0= ruleMultDivModExpr ( ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ) ) ( (lv_right_3_0= ruleMultDivModExpr ) ) )* )
            {
            // InternalGumboParser.g:1562:2: (this_MultDivModExpr_0= ruleMultDivModExpr ( ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ) ) ( (lv_right_3_0= ruleMultDivModExpr ) ) )* )
            // InternalGumboParser.g:1563:3: this_MultDivModExpr_0= ruleMultDivModExpr ( ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ) ) ( (lv_right_3_0= ruleMultDivModExpr ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAddSubExprAccess().getMultDivModExprParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_28);
            this_MultDivModExpr_0=ruleMultDivModExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MultDivModExpr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGumboParser.g:1571:3: ( ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ) ) ( (lv_right_3_0= ruleMultDivModExpr ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==PlusSign) && (synpred6_InternalGumboParser())) {
                    alt22=1;
                }
                else if ( (LA22_0==HyphenMinus) && (synpred6_InternalGumboParser())) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalGumboParser.g:1572:4: ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ) ) ( (lv_right_3_0= ruleMultDivModExpr ) )
            	    {
            	    // InternalGumboParser.g:1572:4: ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ) )
            	    // InternalGumboParser.g:1573:5: ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) )
            	    {
            	    // InternalGumboParser.g:1587:5: ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) )
            	    // InternalGumboParser.g:1588:6: () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) )
            	    {
            	    // InternalGumboParser.g:1588:6: ()
            	    // InternalGumboParser.g:1589:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getAddSubExprAccess().getBinaryExprLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalGumboParser.g:1595:6: ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) )
            	    // InternalGumboParser.g:1596:7: ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) )
            	    {
            	    // InternalGumboParser.g:1596:7: ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) )
            	    // InternalGumboParser.g:1597:8: (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus )
            	    {
            	    // InternalGumboParser.g:1597:8: (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==PlusSign) ) {
            	        alt21=1;
            	    }
            	    else if ( (LA21_0==HyphenMinus) ) {
            	        alt21=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalGumboParser.g:1598:9: lv_op_2_1= PlusSign
            	            {
            	            lv_op_2_1=(Token)match(input,PlusSign,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									newLeafNode(lv_op_2_1, grammarAccess.getAddSubExprAccess().getOpPlusSignKeyword_1_0_0_1_0_0());
            	              								
            	            }
            	            if ( state.backtracking==0 ) {

            	              									if (current==null) {
            	              										current = createModelElement(grammarAccess.getAddSubExprRule());
            	              									}
            	              									setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              								
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalGumboParser.g:1609:9: lv_op_2_2= HyphenMinus
            	            {
            	            lv_op_2_2=(Token)match(input,HyphenMinus,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									newLeafNode(lv_op_2_2, grammarAccess.getAddSubExprAccess().getOpHyphenMinusKeyword_1_0_0_1_0_1());
            	              								
            	            }
            	            if ( state.backtracking==0 ) {

            	              									if (current==null) {
            	              										current = createModelElement(grammarAccess.getAddSubExprRule());
            	              									}
            	              									setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              								
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	    // InternalGumboParser.g:1624:4: ( (lv_right_3_0= ruleMultDivModExpr ) )
            	    // InternalGumboParser.g:1625:5: (lv_right_3_0= ruleMultDivModExpr )
            	    {
            	    // InternalGumboParser.g:1625:5: (lv_right_3_0= ruleMultDivModExpr )
            	    // InternalGumboParser.g:1626:6: lv_right_3_0= ruleMultDivModExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAddSubExprAccess().getRightMultDivModExprParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    lv_right_3_0=ruleMultDivModExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAddSubExprRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.sireum.aadl.gumbo.Gumbo.MultDivModExpr");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddSubExpr"


    // $ANTLR start "entryRuleMultDivModExpr"
    // InternalGumboParser.g:1648:1: entryRuleMultDivModExpr returns [EObject current=null] : iv_ruleMultDivModExpr= ruleMultDivModExpr EOF ;
    public final EObject entryRuleMultDivModExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultDivModExpr = null;


        try {
            // InternalGumboParser.g:1648:55: (iv_ruleMultDivModExpr= ruleMultDivModExpr EOF )
            // InternalGumboParser.g:1649:2: iv_ruleMultDivModExpr= ruleMultDivModExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultDivModExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMultDivModExpr=ruleMultDivModExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultDivModExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultDivModExpr"


    // $ANTLR start "ruleMultDivModExpr"
    // InternalGumboParser.g:1655:1: ruleMultDivModExpr returns [EObject current=null] : (this_ExpExpr_0= ruleExpExpr ( ( ( ( () ( ( ( Asterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleExpExpr ) ) )* ) ;
    public final EObject ruleMultDivModExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        EObject this_ExpExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1661:2: ( (this_ExpExpr_0= ruleExpExpr ( ( ( ( () ( ( ( Asterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleExpExpr ) ) )* ) )
            // InternalGumboParser.g:1662:2: (this_ExpExpr_0= ruleExpExpr ( ( ( ( () ( ( ( Asterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleExpExpr ) ) )* )
            {
            // InternalGumboParser.g:1662:2: (this_ExpExpr_0= ruleExpExpr ( ( ( ( () ( ( ( Asterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleExpExpr ) ) )* )
            // InternalGumboParser.g:1663:3: this_ExpExpr_0= ruleExpExpr ( ( ( ( () ( ( ( Asterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleExpExpr ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMultDivModExprAccess().getExpExprParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_29);
            this_ExpExpr_0=ruleExpExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ExpExpr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGumboParser.g:1671:3: ( ( ( ( () ( ( ( Asterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleExpExpr ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==Asterisk) && (synpred7_InternalGumboParser())) {
                    alt24=1;
                }
                else if ( (LA24_0==Solidus) && (synpred7_InternalGumboParser())) {
                    alt24=1;
                }
                else if ( (LA24_0==PercentSign) && (synpred7_InternalGumboParser())) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalGumboParser.g:1672:4: ( ( ( () ( ( ( Asterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleExpExpr ) )
            	    {
            	    // InternalGumboParser.g:1672:4: ( ( ( () ( ( ( Asterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) ) ) )
            	    // InternalGumboParser.g:1673:5: ( ( () ( ( ( Asterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) ) )
            	    {
            	    // InternalGumboParser.g:1689:5: ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) ) )
            	    // InternalGumboParser.g:1690:6: () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) )
            	    {
            	    // InternalGumboParser.g:1690:6: ()
            	    // InternalGumboParser.g:1691:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getMultDivModExprAccess().getBinaryExprLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalGumboParser.g:1697:6: ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) )
            	    // InternalGumboParser.g:1698:7: ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) )
            	    {
            	    // InternalGumboParser.g:1698:7: ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) )
            	    // InternalGumboParser.g:1699:8: (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign )
            	    {
            	    // InternalGumboParser.g:1699:8: (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign )
            	    int alt23=3;
            	    switch ( input.LA(1) ) {
            	    case Asterisk:
            	        {
            	        alt23=1;
            	        }
            	        break;
            	    case Solidus:
            	        {
            	        alt23=2;
            	        }
            	        break;
            	    case PercentSign:
            	        {
            	        alt23=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt23) {
            	        case 1 :
            	            // InternalGumboParser.g:1700:9: lv_op_2_1= Asterisk
            	            {
            	            lv_op_2_1=(Token)match(input,Asterisk,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									newLeafNode(lv_op_2_1, grammarAccess.getMultDivModExprAccess().getOpAsteriskKeyword_1_0_0_1_0_0());
            	              								
            	            }
            	            if ( state.backtracking==0 ) {

            	              									if (current==null) {
            	              										current = createModelElement(grammarAccess.getMultDivModExprRule());
            	              									}
            	              									setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              								
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalGumboParser.g:1711:9: lv_op_2_2= Solidus
            	            {
            	            lv_op_2_2=(Token)match(input,Solidus,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									newLeafNode(lv_op_2_2, grammarAccess.getMultDivModExprAccess().getOpSolidusKeyword_1_0_0_1_0_1());
            	              								
            	            }
            	            if ( state.backtracking==0 ) {

            	              									if (current==null) {
            	              										current = createModelElement(grammarAccess.getMultDivModExprRule());
            	              									}
            	              									setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              								
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalGumboParser.g:1722:9: lv_op_2_3= PercentSign
            	            {
            	            lv_op_2_3=(Token)match(input,PercentSign,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									newLeafNode(lv_op_2_3, grammarAccess.getMultDivModExprAccess().getOpPercentSignKeyword_1_0_0_1_0_2());
            	              								
            	            }
            	            if ( state.backtracking==0 ) {

            	              									if (current==null) {
            	              										current = createModelElement(grammarAccess.getMultDivModExprRule());
            	              									}
            	              									setWithLastConsumed(current, "op", lv_op_2_3, null);
            	              								
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	    // InternalGumboParser.g:1737:4: ( (lv_right_3_0= ruleExpExpr ) )
            	    // InternalGumboParser.g:1738:5: (lv_right_3_0= ruleExpExpr )
            	    {
            	    // InternalGumboParser.g:1738:5: (lv_right_3_0= ruleExpExpr )
            	    // InternalGumboParser.g:1739:6: lv_right_3_0= ruleExpExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMultDivModExprAccess().getRightExpExprParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_29);
            	    lv_right_3_0=ruleExpExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMultDivModExprRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.sireum.aadl.gumbo.Gumbo.ExpExpr");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultDivModExpr"


    // $ANTLR start "entryRuleExpExpr"
    // InternalGumboParser.g:1761:1: entryRuleExpExpr returns [EObject current=null] : iv_ruleExpExpr= ruleExpExpr EOF ;
    public final EObject entryRuleExpExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpExpr = null;


        try {
            // InternalGumboParser.g:1761:48: (iv_ruleExpExpr= ruleExpExpr EOF )
            // InternalGumboParser.g:1762:2: iv_ruleExpExpr= ruleExpExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExpExpr=ruleExpExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpExpr"


    // $ANTLR start "ruleExpExpr"
    // InternalGumboParser.g:1768:1: ruleExpExpr returns [EObject current=null] : (this_PrefixExpr_0= rulePrefixExpr ( ( ( ( () ( ( CircumflexAccent ) ) ) )=> ( () ( (lv_op_2_0= CircumflexAccent ) ) ) ) ( (lv_right_3_0= rulePrefixExpr ) ) )* ) ;
    public final EObject ruleExpExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_PrefixExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1774:2: ( (this_PrefixExpr_0= rulePrefixExpr ( ( ( ( () ( ( CircumflexAccent ) ) ) )=> ( () ( (lv_op_2_0= CircumflexAccent ) ) ) ) ( (lv_right_3_0= rulePrefixExpr ) ) )* ) )
            // InternalGumboParser.g:1775:2: (this_PrefixExpr_0= rulePrefixExpr ( ( ( ( () ( ( CircumflexAccent ) ) ) )=> ( () ( (lv_op_2_0= CircumflexAccent ) ) ) ) ( (lv_right_3_0= rulePrefixExpr ) ) )* )
            {
            // InternalGumboParser.g:1775:2: (this_PrefixExpr_0= rulePrefixExpr ( ( ( ( () ( ( CircumflexAccent ) ) ) )=> ( () ( (lv_op_2_0= CircumflexAccent ) ) ) ) ( (lv_right_3_0= rulePrefixExpr ) ) )* )
            // InternalGumboParser.g:1776:3: this_PrefixExpr_0= rulePrefixExpr ( ( ( ( () ( ( CircumflexAccent ) ) ) )=> ( () ( (lv_op_2_0= CircumflexAccent ) ) ) ) ( (lv_right_3_0= rulePrefixExpr ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpExprAccess().getPrefixExprParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_30);
            this_PrefixExpr_0=rulePrefixExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PrefixExpr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGumboParser.g:1784:3: ( ( ( ( () ( ( CircumflexAccent ) ) ) )=> ( () ( (lv_op_2_0= CircumflexAccent ) ) ) ) ( (lv_right_3_0= rulePrefixExpr ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==CircumflexAccent) && (synpred8_InternalGumboParser())) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalGumboParser.g:1785:4: ( ( ( () ( ( CircumflexAccent ) ) ) )=> ( () ( (lv_op_2_0= CircumflexAccent ) ) ) ) ( (lv_right_3_0= rulePrefixExpr ) )
            	    {
            	    // InternalGumboParser.g:1785:4: ( ( ( () ( ( CircumflexAccent ) ) ) )=> ( () ( (lv_op_2_0= CircumflexAccent ) ) ) )
            	    // InternalGumboParser.g:1786:5: ( ( () ( ( CircumflexAccent ) ) ) )=> ( () ( (lv_op_2_0= CircumflexAccent ) ) )
            	    {
            	    // InternalGumboParser.g:1796:5: ( () ( (lv_op_2_0= CircumflexAccent ) ) )
            	    // InternalGumboParser.g:1797:6: () ( (lv_op_2_0= CircumflexAccent ) )
            	    {
            	    // InternalGumboParser.g:1797:6: ()
            	    // InternalGumboParser.g:1798:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getExpExprAccess().getBinaryExprLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalGumboParser.g:1804:6: ( (lv_op_2_0= CircumflexAccent ) )
            	    // InternalGumboParser.g:1805:7: (lv_op_2_0= CircumflexAccent )
            	    {
            	    // InternalGumboParser.g:1805:7: (lv_op_2_0= CircumflexAccent )
            	    // InternalGumboParser.g:1806:8: lv_op_2_0= CircumflexAccent
            	    {
            	    lv_op_2_0=(Token)match(input,CircumflexAccent,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								newLeafNode(lv_op_2_0, grammarAccess.getExpExprAccess().getOpCircumflexAccentKeyword_1_0_0_1_0());
            	      							
            	    }
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElement(grammarAccess.getExpExprRule());
            	      								}
            	      								setWithLastConsumed(current, "op", lv_op_2_0, "^");
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalGumboParser.g:1820:4: ( (lv_right_3_0= rulePrefixExpr ) )
            	    // InternalGumboParser.g:1821:5: (lv_right_3_0= rulePrefixExpr )
            	    {
            	    // InternalGumboParser.g:1821:5: (lv_right_3_0= rulePrefixExpr )
            	    // InternalGumboParser.g:1822:6: lv_right_3_0= rulePrefixExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExpExprAccess().getRightPrefixExprParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_30);
            	    lv_right_3_0=rulePrefixExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getExpExprRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.sireum.aadl.gumbo.Gumbo.PrefixExpr");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpExpr"


    // $ANTLR start "entryRulePrefixExpr"
    // InternalGumboParser.g:1844:1: entryRulePrefixExpr returns [EObject current=null] : iv_rulePrefixExpr= rulePrefixExpr EOF ;
    public final EObject entryRulePrefixExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixExpr = null;


        try {
            // InternalGumboParser.g:1844:51: (iv_rulePrefixExpr= rulePrefixExpr EOF )
            // InternalGumboParser.g:1845:2: iv_rulePrefixExpr= rulePrefixExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrefixExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePrefixExpr=rulePrefixExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrefixExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrefixExpr"


    // $ANTLR start "rulePrefixExpr"
    // InternalGumboParser.g:1851:1: rulePrefixExpr returns [EObject current=null] : ( ( () ( ( (lv_op_1_1= HyphenMinus | lv_op_1_2= Not ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) ) ) | this_AtomicExpr_3= ruleAtomicExpr ) ;
    public final EObject rulePrefixExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_1=null;
        Token lv_op_1_2=null;
        EObject lv_expr_2_0 = null;

        EObject this_AtomicExpr_3 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1857:2: ( ( ( () ( ( (lv_op_1_1= HyphenMinus | lv_op_1_2= Not ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) ) ) | this_AtomicExpr_3= ruleAtomicExpr ) )
            // InternalGumboParser.g:1858:2: ( ( () ( ( (lv_op_1_1= HyphenMinus | lv_op_1_2= Not ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) ) ) | this_AtomicExpr_3= ruleAtomicExpr )
            {
            // InternalGumboParser.g:1858:2: ( ( () ( ( (lv_op_1_1= HyphenMinus | lv_op_1_2= Not ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) ) ) | this_AtomicExpr_3= ruleAtomicExpr )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Not||LA27_0==HyphenMinus) ) {
                alt27=1;
            }
            else if ( ((LA27_0>=False && LA27_0<=Floor)||(LA27_0>=Enum && LA27_0<=True)||LA27_0==Var||LA27_0==LeftParenthesis||LA27_0==RULE_REAL_LIT||LA27_0==RULE_INTEGER_LIT) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalGumboParser.g:1859:3: ( () ( ( (lv_op_1_1= HyphenMinus | lv_op_1_2= Not ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) ) )
                    {
                    // InternalGumboParser.g:1859:3: ( () ( ( (lv_op_1_1= HyphenMinus | lv_op_1_2= Not ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) ) )
                    // InternalGumboParser.g:1860:4: () ( ( (lv_op_1_1= HyphenMinus | lv_op_1_2= Not ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) )
                    {
                    // InternalGumboParser.g:1860:4: ()
                    // InternalGumboParser.g:1861:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrefixExprAccess().getUnaryExprAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:1867:4: ( ( (lv_op_1_1= HyphenMinus | lv_op_1_2= Not ) ) )
                    // InternalGumboParser.g:1868:5: ( (lv_op_1_1= HyphenMinus | lv_op_1_2= Not ) )
                    {
                    // InternalGumboParser.g:1868:5: ( (lv_op_1_1= HyphenMinus | lv_op_1_2= Not ) )
                    // InternalGumboParser.g:1869:6: (lv_op_1_1= HyphenMinus | lv_op_1_2= Not )
                    {
                    // InternalGumboParser.g:1869:6: (lv_op_1_1= HyphenMinus | lv_op_1_2= Not )
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==HyphenMinus) ) {
                        alt26=1;
                    }
                    else if ( (LA26_0==Not) ) {
                        alt26=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalGumboParser.g:1870:7: lv_op_1_1= HyphenMinus
                            {
                            lv_op_1_1=(Token)match(input,HyphenMinus,FollowSets000.FOLLOW_16); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_op_1_1, grammarAccess.getPrefixExprAccess().getOpHyphenMinusKeyword_0_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getPrefixExprRule());
                              							}
                              							setWithLastConsumed(current, "op", lv_op_1_1, null);
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalGumboParser.g:1881:7: lv_op_1_2= Not
                            {
                            lv_op_1_2=(Token)match(input,Not,FollowSets000.FOLLOW_16); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_op_1_2, grammarAccess.getPrefixExprAccess().getOpNotKeyword_0_1_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getPrefixExprRule());
                              							}
                              							setWithLastConsumed(current, "op", lv_op_1_2, null);
                              						
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalGumboParser.g:1894:4: ( (lv_expr_2_0= rulePrefixExpr ) )
                    // InternalGumboParser.g:1895:5: (lv_expr_2_0= rulePrefixExpr )
                    {
                    // InternalGumboParser.g:1895:5: (lv_expr_2_0= rulePrefixExpr )
                    // InternalGumboParser.g:1896:6: lv_expr_2_0= rulePrefixExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrefixExprAccess().getExprPrefixExprParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_expr_2_0=rulePrefixExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrefixExprRule());
                      						}
                      						set(
                      							current,
                      							"expr",
                      							lv_expr_2_0,
                      							"org.sireum.aadl.gumbo.Gumbo.PrefixExpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:1915:3: this_AtomicExpr_3= ruleAtomicExpr
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrefixExprAccess().getAtomicExprParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AtomicExpr_3=ruleAtomicExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AtomicExpr_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrefixExpr"


    // $ANTLR start "entryRuleAtomicExpr"
    // InternalGumboParser.g:1927:1: entryRuleAtomicExpr returns [EObject current=null] : iv_ruleAtomicExpr= ruleAtomicExpr EOF ;
    public final EObject entryRuleAtomicExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpr = null;


        try {
            // InternalGumboParser.g:1927:51: (iv_ruleAtomicExpr= ruleAtomicExpr EOF )
            // InternalGumboParser.g:1928:2: iv_ruleAtomicExpr= ruleAtomicExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAtomicExpr=ruleAtomicExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicExpr"


    // $ANTLR start "ruleAtomicExpr"
    // InternalGumboParser.g:1934:1: ruleAtomicExpr returns [EObject current=null] : ( ( () otherlv_1= Var ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= Port ( (lv_port_5_0= ruleFeatureElement ) ) ) | ( ( ( ( () Enum LeftParenthesis ) )=> ( () otherlv_7= Enum otherlv_8= LeftParenthesis ) ) ( ( ruleQCREF ) ) otherlv_10= Comma ( (otherlv_11= RULE_ID ) ) otherlv_12= RightParenthesis ) | ( () ( (lv_value_14_0= RULE_INTEGER_LIT ) ) ) | ( () ( (lv_val_16_0= RULE_REAL_LIT ) ) ) | ( () ( (lv_val_18_0= ruleBooleanLiteral ) ) ) | ( () otherlv_20= Floor otherlv_21= LeftParenthesis ( (lv_expr_22_0= ruleExpr ) ) otherlv_23= RightParenthesis ) | ( () otherlv_25= Real otherlv_26= LeftParenthesis ( (lv_expr_27_0= ruleExpr ) ) otherlv_28= RightParenthesis ) | (otherlv_29= LeftParenthesis this_Expr_30= ruleExpr otherlv_31= RightParenthesis ) ) ;
    public final EObject ruleAtomicExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_value_14_0=null;
        Token lv_val_16_0=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        EObject lv_port_5_0 = null;

        EObject lv_val_18_0 = null;

        EObject lv_expr_22_0 = null;

        EObject lv_expr_27_0 = null;

        EObject this_Expr_30 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1940:2: ( ( ( () otherlv_1= Var ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= Port ( (lv_port_5_0= ruleFeatureElement ) ) ) | ( ( ( ( () Enum LeftParenthesis ) )=> ( () otherlv_7= Enum otherlv_8= LeftParenthesis ) ) ( ( ruleQCREF ) ) otherlv_10= Comma ( (otherlv_11= RULE_ID ) ) otherlv_12= RightParenthesis ) | ( () ( (lv_value_14_0= RULE_INTEGER_LIT ) ) ) | ( () ( (lv_val_16_0= RULE_REAL_LIT ) ) ) | ( () ( (lv_val_18_0= ruleBooleanLiteral ) ) ) | ( () otherlv_20= Floor otherlv_21= LeftParenthesis ( (lv_expr_22_0= ruleExpr ) ) otherlv_23= RightParenthesis ) | ( () otherlv_25= Real otherlv_26= LeftParenthesis ( (lv_expr_27_0= ruleExpr ) ) otherlv_28= RightParenthesis ) | (otherlv_29= LeftParenthesis this_Expr_30= ruleExpr otherlv_31= RightParenthesis ) ) )
            // InternalGumboParser.g:1941:2: ( ( () otherlv_1= Var ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= Port ( (lv_port_5_0= ruleFeatureElement ) ) ) | ( ( ( ( () Enum LeftParenthesis ) )=> ( () otherlv_7= Enum otherlv_8= LeftParenthesis ) ) ( ( ruleQCREF ) ) otherlv_10= Comma ( (otherlv_11= RULE_ID ) ) otherlv_12= RightParenthesis ) | ( () ( (lv_value_14_0= RULE_INTEGER_LIT ) ) ) | ( () ( (lv_val_16_0= RULE_REAL_LIT ) ) ) | ( () ( (lv_val_18_0= ruleBooleanLiteral ) ) ) | ( () otherlv_20= Floor otherlv_21= LeftParenthesis ( (lv_expr_22_0= ruleExpr ) ) otherlv_23= RightParenthesis ) | ( () otherlv_25= Real otherlv_26= LeftParenthesis ( (lv_expr_27_0= ruleExpr ) ) otherlv_28= RightParenthesis ) | (otherlv_29= LeftParenthesis this_Expr_30= ruleExpr otherlv_31= RightParenthesis ) )
            {
            // InternalGumboParser.g:1941:2: ( ( () otherlv_1= Var ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= Port ( (lv_port_5_0= ruleFeatureElement ) ) ) | ( ( ( ( () Enum LeftParenthesis ) )=> ( () otherlv_7= Enum otherlv_8= LeftParenthesis ) ) ( ( ruleQCREF ) ) otherlv_10= Comma ( (otherlv_11= RULE_ID ) ) otherlv_12= RightParenthesis ) | ( () ( (lv_value_14_0= RULE_INTEGER_LIT ) ) ) | ( () ( (lv_val_16_0= RULE_REAL_LIT ) ) ) | ( () ( (lv_val_18_0= ruleBooleanLiteral ) ) ) | ( () otherlv_20= Floor otherlv_21= LeftParenthesis ( (lv_expr_22_0= ruleExpr ) ) otherlv_23= RightParenthesis ) | ( () otherlv_25= Real otherlv_26= LeftParenthesis ( (lv_expr_27_0= ruleExpr ) ) otherlv_28= RightParenthesis ) | (otherlv_29= LeftParenthesis this_Expr_30= ruleExpr otherlv_31= RightParenthesis ) )
            int alt28=9;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // InternalGumboParser.g:1942:3: ( () otherlv_1= Var ( (otherlv_2= RULE_ID ) ) )
                    {
                    // InternalGumboParser.g:1942:3: ( () otherlv_1= Var ( (otherlv_2= RULE_ID ) ) )
                    // InternalGumboParser.g:1943:4: () otherlv_1= Var ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalGumboParser.g:1943:4: ()
                    // InternalGumboParser.g:1944:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicExprAccess().getStateVarRefAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,Var,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getAtomicExprAccess().getVarKeyword_0_1());
                      			
                    }
                    // InternalGumboParser.g:1954:4: ( (otherlv_2= RULE_ID ) )
                    // InternalGumboParser.g:1955:5: (otherlv_2= RULE_ID )
                    {
                    // InternalGumboParser.g:1955:5: (otherlv_2= RULE_ID )
                    // InternalGumboParser.g:1956:6: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicExprRule());
                      						}
                      					
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_2, grammarAccess.getAtomicExprAccess().getStateVarStateVarDeclCrossReference_0_2_0());
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:1969:3: ( () otherlv_4= Port ( (lv_port_5_0= ruleFeatureElement ) ) )
                    {
                    // InternalGumboParser.g:1969:3: ( () otherlv_4= Port ( (lv_port_5_0= ruleFeatureElement ) ) )
                    // InternalGumboParser.g:1970:4: () otherlv_4= Port ( (lv_port_5_0= ruleFeatureElement ) )
                    {
                    // InternalGumboParser.g:1970:4: ()
                    // InternalGumboParser.g:1971:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicExprAccess().getPortRefAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_4=(Token)match(input,Port,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getAtomicExprAccess().getPortKeyword_1_1());
                      			
                    }
                    // InternalGumboParser.g:1981:4: ( (lv_port_5_0= ruleFeatureElement ) )
                    // InternalGumboParser.g:1982:5: (lv_port_5_0= ruleFeatureElement )
                    {
                    // InternalGumboParser.g:1982:5: (lv_port_5_0= ruleFeatureElement )
                    // InternalGumboParser.g:1983:6: lv_port_5_0= ruleFeatureElement
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtomicExprAccess().getPortFeatureElementParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_port_5_0=ruleFeatureElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                      						}
                      						set(
                      							current,
                      							"port",
                      							lv_port_5_0,
                      							"org.sireum.aadl.gumbo.Gumbo.FeatureElement");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGumboParser.g:2002:3: ( ( ( ( () Enum LeftParenthesis ) )=> ( () otherlv_7= Enum otherlv_8= LeftParenthesis ) ) ( ( ruleQCREF ) ) otherlv_10= Comma ( (otherlv_11= RULE_ID ) ) otherlv_12= RightParenthesis )
                    {
                    // InternalGumboParser.g:2002:3: ( ( ( ( () Enum LeftParenthesis ) )=> ( () otherlv_7= Enum otherlv_8= LeftParenthesis ) ) ( ( ruleQCREF ) ) otherlv_10= Comma ( (otherlv_11= RULE_ID ) ) otherlv_12= RightParenthesis )
                    // InternalGumboParser.g:2003:4: ( ( ( () Enum LeftParenthesis ) )=> ( () otherlv_7= Enum otherlv_8= LeftParenthesis ) ) ( ( ruleQCREF ) ) otherlv_10= Comma ( (otherlv_11= RULE_ID ) ) otherlv_12= RightParenthesis
                    {
                    // InternalGumboParser.g:2003:4: ( ( ( () Enum LeftParenthesis ) )=> ( () otherlv_7= Enum otherlv_8= LeftParenthesis ) )
                    // InternalGumboParser.g:2004:5: ( ( () Enum LeftParenthesis ) )=> ( () otherlv_7= Enum otherlv_8= LeftParenthesis )
                    {
                    // InternalGumboParser.g:2011:5: ( () otherlv_7= Enum otherlv_8= LeftParenthesis )
                    // InternalGumboParser.g:2012:6: () otherlv_7= Enum otherlv_8= LeftParenthesis
                    {
                    // InternalGumboParser.g:2012:6: ()
                    // InternalGumboParser.g:2013:7: 
                    {
                    if ( state.backtracking==0 ) {

                      							current = forceCreateModelElement(
                      								grammarAccess.getAtomicExprAccess().getEnumLitExprAction_2_0_0_0(),
                      								current);
                      						
                    }

                    }

                    otherlv_7=(Token)match(input,Enum,FollowSets000.FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_7, grammarAccess.getAtomicExprAccess().getEnumKeyword_2_0_0_1());
                      					
                    }
                    otherlv_8=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_8, grammarAccess.getAtomicExprAccess().getLeftParenthesisKeyword_2_0_0_2());
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:2029:4: ( ( ruleQCREF ) )
                    // InternalGumboParser.g:2030:5: ( ruleQCREF )
                    {
                    // InternalGumboParser.g:2030:5: ( ruleQCREF )
                    // InternalGumboParser.g:2031:6: ruleQCREF
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicExprRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtomicExprAccess().getEnumTypePropertyCrossReference_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_32);
                    ruleQCREF();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,Comma,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getAtomicExprAccess().getCommaKeyword_2_2());
                      			
                    }
                    // InternalGumboParser.g:2049:4: ( (otherlv_11= RULE_ID ) )
                    // InternalGumboParser.g:2050:5: (otherlv_11= RULE_ID )
                    {
                    // InternalGumboParser.g:2050:5: (otherlv_11= RULE_ID )
                    // InternalGumboParser.g:2051:6: otherlv_11= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicExprRule());
                      						}
                      					
                    }
                    otherlv_11=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_11, grammarAccess.getAtomicExprAccess().getValueEnumerationLiteralCrossReference_2_3_0());
                      					
                    }

                    }


                    }

                    otherlv_12=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getAtomicExprAccess().getRightParenthesisKeyword_2_4());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalGumboParser.g:2068:3: ( () ( (lv_value_14_0= RULE_INTEGER_LIT ) ) )
                    {
                    // InternalGumboParser.g:2068:3: ( () ( (lv_value_14_0= RULE_INTEGER_LIT ) ) )
                    // InternalGumboParser.g:2069:4: () ( (lv_value_14_0= RULE_INTEGER_LIT ) )
                    {
                    // InternalGumboParser.g:2069:4: ()
                    // InternalGumboParser.g:2070:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicExprAccess().getIntLitAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:2076:4: ( (lv_value_14_0= RULE_INTEGER_LIT ) )
                    // InternalGumboParser.g:2077:5: (lv_value_14_0= RULE_INTEGER_LIT )
                    {
                    // InternalGumboParser.g:2077:5: (lv_value_14_0= RULE_INTEGER_LIT )
                    // InternalGumboParser.g:2078:6: lv_value_14_0= RULE_INTEGER_LIT
                    {
                    lv_value_14_0=(Token)match(input,RULE_INTEGER_LIT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_14_0, grammarAccess.getAtomicExprAccess().getValueINTEGER_LITTerminalRuleCall_3_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicExprRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_14_0,
                      							"org.osate.xtext.aadl2.properties.Properties.INTEGER_LIT");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalGumboParser.g:2096:3: ( () ( (lv_val_16_0= RULE_REAL_LIT ) ) )
                    {
                    // InternalGumboParser.g:2096:3: ( () ( (lv_val_16_0= RULE_REAL_LIT ) ) )
                    // InternalGumboParser.g:2097:4: () ( (lv_val_16_0= RULE_REAL_LIT ) )
                    {
                    // InternalGumboParser.g:2097:4: ()
                    // InternalGumboParser.g:2098:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicExprAccess().getRealLitExprAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:2104:4: ( (lv_val_16_0= RULE_REAL_LIT ) )
                    // InternalGumboParser.g:2105:5: (lv_val_16_0= RULE_REAL_LIT )
                    {
                    // InternalGumboParser.g:2105:5: (lv_val_16_0= RULE_REAL_LIT )
                    // InternalGumboParser.g:2106:6: lv_val_16_0= RULE_REAL_LIT
                    {
                    lv_val_16_0=(Token)match(input,RULE_REAL_LIT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_val_16_0, grammarAccess.getAtomicExprAccess().getValREAL_LITTerminalRuleCall_4_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicExprRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"val",
                      							lv_val_16_0,
                      							"org.osate.xtext.aadl2.properties.Properties.REAL_LIT");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalGumboParser.g:2124:3: ( () ( (lv_val_18_0= ruleBooleanLiteral ) ) )
                    {
                    // InternalGumboParser.g:2124:3: ( () ( (lv_val_18_0= ruleBooleanLiteral ) ) )
                    // InternalGumboParser.g:2125:4: () ( (lv_val_18_0= ruleBooleanLiteral ) )
                    {
                    // InternalGumboParser.g:2125:4: ()
                    // InternalGumboParser.g:2126:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicExprAccess().getBoolLitExprAction_5_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:2132:4: ( (lv_val_18_0= ruleBooleanLiteral ) )
                    // InternalGumboParser.g:2133:5: (lv_val_18_0= ruleBooleanLiteral )
                    {
                    // InternalGumboParser.g:2133:5: (lv_val_18_0= ruleBooleanLiteral )
                    // InternalGumboParser.g:2134:6: lv_val_18_0= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtomicExprAccess().getValBooleanLiteralParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_val_18_0=ruleBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                      						}
                      						set(
                      							current,
                      							"val",
                      							lv_val_18_0,
                      							"org.osate.xtext.aadl2.properties.Properties.BooleanLiteral");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalGumboParser.g:2153:3: ( () otherlv_20= Floor otherlv_21= LeftParenthesis ( (lv_expr_22_0= ruleExpr ) ) otherlv_23= RightParenthesis )
                    {
                    // InternalGumboParser.g:2153:3: ( () otherlv_20= Floor otherlv_21= LeftParenthesis ( (lv_expr_22_0= ruleExpr ) ) otherlv_23= RightParenthesis )
                    // InternalGumboParser.g:2154:4: () otherlv_20= Floor otherlv_21= LeftParenthesis ( (lv_expr_22_0= ruleExpr ) ) otherlv_23= RightParenthesis
                    {
                    // InternalGumboParser.g:2154:4: ()
                    // InternalGumboParser.g:2155:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicExprAccess().getFloorCastAction_6_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_20=(Token)match(input,Floor,FollowSets000.FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_20, grammarAccess.getAtomicExprAccess().getFloorKeyword_6_1());
                      			
                    }
                    otherlv_21=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_21, grammarAccess.getAtomicExprAccess().getLeftParenthesisKeyword_6_2());
                      			
                    }
                    // InternalGumboParser.g:2169:4: ( (lv_expr_22_0= ruleExpr ) )
                    // InternalGumboParser.g:2170:5: (lv_expr_22_0= ruleExpr )
                    {
                    // InternalGumboParser.g:2170:5: (lv_expr_22_0= ruleExpr )
                    // InternalGumboParser.g:2171:6: lv_expr_22_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtomicExprAccess().getExprExprParserRuleCall_6_3_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_33);
                    lv_expr_22_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                      						}
                      						set(
                      							current,
                      							"expr",
                      							lv_expr_22_0,
                      							"org.sireum.aadl.gumbo.Gumbo.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_23=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getAtomicExprAccess().getRightParenthesisKeyword_6_4());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalGumboParser.g:2194:3: ( () otherlv_25= Real otherlv_26= LeftParenthesis ( (lv_expr_27_0= ruleExpr ) ) otherlv_28= RightParenthesis )
                    {
                    // InternalGumboParser.g:2194:3: ( () otherlv_25= Real otherlv_26= LeftParenthesis ( (lv_expr_27_0= ruleExpr ) ) otherlv_28= RightParenthesis )
                    // InternalGumboParser.g:2195:4: () otherlv_25= Real otherlv_26= LeftParenthesis ( (lv_expr_27_0= ruleExpr ) ) otherlv_28= RightParenthesis
                    {
                    // InternalGumboParser.g:2195:4: ()
                    // InternalGumboParser.g:2196:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicExprAccess().getRealCastAction_7_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_25=(Token)match(input,Real,FollowSets000.FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_25, grammarAccess.getAtomicExprAccess().getRealKeyword_7_1());
                      			
                    }
                    otherlv_26=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_26, grammarAccess.getAtomicExprAccess().getLeftParenthesisKeyword_7_2());
                      			
                    }
                    // InternalGumboParser.g:2210:4: ( (lv_expr_27_0= ruleExpr ) )
                    // InternalGumboParser.g:2211:5: (lv_expr_27_0= ruleExpr )
                    {
                    // InternalGumboParser.g:2211:5: (lv_expr_27_0= ruleExpr )
                    // InternalGumboParser.g:2212:6: lv_expr_27_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtomicExprAccess().getExprExprParserRuleCall_7_3_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_33);
                    lv_expr_27_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                      						}
                      						set(
                      							current,
                      							"expr",
                      							lv_expr_27_0,
                      							"org.sireum.aadl.gumbo.Gumbo.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_28=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_28, grammarAccess.getAtomicExprAccess().getRightParenthesisKeyword_7_4());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalGumboParser.g:2235:3: (otherlv_29= LeftParenthesis this_Expr_30= ruleExpr otherlv_31= RightParenthesis )
                    {
                    // InternalGumboParser.g:2235:3: (otherlv_29= LeftParenthesis this_Expr_30= ruleExpr otherlv_31= RightParenthesis )
                    // InternalGumboParser.g:2236:4: otherlv_29= LeftParenthesis this_Expr_30= ruleExpr otherlv_31= RightParenthesis
                    {
                    otherlv_29=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_29, grammarAccess.getAtomicExprAccess().getLeftParenthesisKeyword_8_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAtomicExprAccess().getExprParserRuleCall_8_1());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_33);
                    this_Expr_30=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expr_30;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_31=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_31, grammarAccess.getAtomicExprAccess().getRightParenthesisKeyword_8_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomicExpr"


    // $ANTLR start "entryRuleFeatureElement"
    // InternalGumboParser.g:2257:1: entryRuleFeatureElement returns [EObject current=null] : iv_ruleFeatureElement= ruleFeatureElement EOF ;
    public final EObject entryRuleFeatureElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureElement = null;


        try {
            // InternalGumboParser.g:2257:55: (iv_ruleFeatureElement= ruleFeatureElement EOF )
            // InternalGumboParser.g:2258:2: iv_ruleFeatureElement= ruleFeatureElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFeatureElement=ruleFeatureElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatureElement"


    // $ANTLR start "ruleFeatureElement"
    // InternalGumboParser.g:2264:1: ruleFeatureElement returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleFeatureElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalGumboParser.g:2270:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalGumboParser.g:2271:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalGumboParser.g:2271:2: ( (otherlv_0= RULE_ID ) )
            // InternalGumboParser.g:2272:3: (otherlv_0= RULE_ID )
            {
            // InternalGumboParser.g:2272:3: (otherlv_0= RULE_ID )
            // InternalGumboParser.g:2273:4: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getFeatureElementRule());
              				}
              			
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_0, grammarAccess.getFeatureElementAccess().getFeatureNamedElementCrossReference_0());
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeatureElement"


    // $ANTLR start "entryRuleContainedPropertyAssociation"
    // InternalGumboParser.g:2287:1: entryRuleContainedPropertyAssociation returns [EObject current=null] : iv_ruleContainedPropertyAssociation= ruleContainedPropertyAssociation EOF ;
    public final EObject entryRuleContainedPropertyAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainedPropertyAssociation = null;


        try {
            // InternalGumboParser.g:2287:69: (iv_ruleContainedPropertyAssociation= ruleContainedPropertyAssociation EOF )
            // InternalGumboParser.g:2288:2: iv_ruleContainedPropertyAssociation= ruleContainedPropertyAssociation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainedPropertyAssociationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleContainedPropertyAssociation=ruleContainedPropertyAssociation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainedPropertyAssociation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContainedPropertyAssociation"


    // $ANTLR start "ruleContainedPropertyAssociation"
    // InternalGumboParser.g:2294:1: ruleContainedPropertyAssociation returns [EObject current=null] : ( ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon ) ;
    public final EObject ruleContainedPropertyAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_append_2_0=null;
        Token lv_constant_3_0=null;
        Token otherlv_5=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_ownedValue_4_0 = null;

        EObject lv_ownedValue_6_0 = null;

        EObject lv_appliesTo_8_0 = null;

        EObject lv_appliesTo_10_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2300:2: ( ( ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon ) )
            // InternalGumboParser.g:2301:2: ( ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon )
            {
            // InternalGumboParser.g:2301:2: ( ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon )
            // InternalGumboParser.g:2302:3: ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon
            {
            // InternalGumboParser.g:2302:3: ( ( ruleQPREF ) )
            // InternalGumboParser.g:2303:4: ( ruleQPREF )
            {
            // InternalGumboParser.g:2303:4: ( ruleQPREF )
            // InternalGumboParser.g:2304:5: ruleQPREF
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getContainedPropertyAssociationRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getPropertyPropertyCrossReference_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_34);
            ruleQPREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumboParser.g:2318:3: (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==EqualsSignGreaterThanSign) ) {
                alt29=1;
            }
            else if ( (LA29_0==PlusSignEqualsSignGreaterThanSign) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalGumboParser.g:2319:4: otherlv_1= EqualsSignGreaterThanSign
                    {
                    otherlv_1=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getContainedPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:2324:4: ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) )
                    {
                    // InternalGumboParser.g:2324:4: ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) )
                    // InternalGumboParser.g:2325:5: (lv_append_2_0= PlusSignEqualsSignGreaterThanSign )
                    {
                    // InternalGumboParser.g:2325:5: (lv_append_2_0= PlusSignEqualsSignGreaterThanSign )
                    // InternalGumboParser.g:2326:6: lv_append_2_0= PlusSignEqualsSignGreaterThanSign
                    {
                    lv_append_2_0=(Token)match(input,PlusSignEqualsSignGreaterThanSign,FollowSets000.FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_append_2_0, grammarAccess.getContainedPropertyAssociationAccess().getAppendPlusSignEqualsSignGreaterThanSignKeyword_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getContainedPropertyAssociationRule());
                      						}
                      						setWithLastConsumed(current, "append", lv_append_2_0 != null, "+=>");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalGumboParser.g:2339:3: ( (lv_constant_3_0= Constant ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==Constant) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalGumboParser.g:2340:4: (lv_constant_3_0= Constant )
                    {
                    // InternalGumboParser.g:2340:4: (lv_constant_3_0= Constant )
                    // InternalGumboParser.g:2341:5: lv_constant_3_0= Constant
                    {
                    lv_constant_3_0=(Token)match(input,Constant,FollowSets000.FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_constant_3_0, grammarAccess.getContainedPropertyAssociationAccess().getConstantConstantKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getContainedPropertyAssociationRule());
                      					}
                      					setWithLastConsumed(current, "constant", lv_constant_3_0 != null, "constant");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalGumboParser.g:2353:3: ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* )
            // InternalGumboParser.g:2354:4: ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )*
            {
            // InternalGumboParser.g:2354:4: ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) )
            // InternalGumboParser.g:2355:5: (lv_ownedValue_4_0= ruleOptionalModalPropertyValue )
            {
            // InternalGumboParser.g:2355:5: (lv_ownedValue_4_0= ruleOptionalModalPropertyValue )
            // InternalGumboParser.g:2356:6: lv_ownedValue_4_0= ruleOptionalModalPropertyValue
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueOptionalModalPropertyValueParserRuleCall_3_0_0());
              					
            }
            pushFollow(FollowSets000.FOLLOW_36);
            lv_ownedValue_4_0=ruleOptionalModalPropertyValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElementForParent(grammarAccess.getContainedPropertyAssociationRule());
              						}
              						add(
              							current,
              							"ownedValue",
              							lv_ownedValue_4_0,
              							"org.osate.xtext.aadl2.properties.Properties.OptionalModalPropertyValue");
              						afterParserOrEnumRuleCall();
              					
            }

            }


            }

            // InternalGumboParser.g:2373:4: (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==Comma) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalGumboParser.g:2374:5: otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) )
            	    {
            	    otherlv_5=(Token)match(input,Comma,FollowSets000.FOLLOW_35); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_5, grammarAccess.getContainedPropertyAssociationAccess().getCommaKeyword_3_1_0());
            	      				
            	    }
            	    // InternalGumboParser.g:2378:5: ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) )
            	    // InternalGumboParser.g:2379:6: (lv_ownedValue_6_0= ruleOptionalModalPropertyValue )
            	    {
            	    // InternalGumboParser.g:2379:6: (lv_ownedValue_6_0= ruleOptionalModalPropertyValue )
            	    // InternalGumboParser.g:2380:7: lv_ownedValue_6_0= ruleOptionalModalPropertyValue
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueOptionalModalPropertyValueParserRuleCall_3_1_1_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_36);
            	    lv_ownedValue_6_0=ruleOptionalModalPropertyValue();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getContainedPropertyAssociationRule());
            	      							}
            	      							add(
            	      								current,
            	      								"ownedValue",
            	      								lv_ownedValue_6_0,
            	      								"org.osate.xtext.aadl2.properties.Properties.OptionalModalPropertyValue");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }

            // InternalGumboParser.g:2399:3: ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==Applies) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalGumboParser.g:2400:4: ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )*
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToKeywordsParserRuleCall_4_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_9);
                    ruleAppliesToKeywords();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalGumboParser.g:2407:4: ( (lv_appliesTo_8_0= ruleContainmentPath ) )
                    // InternalGumboParser.g:2408:5: (lv_appliesTo_8_0= ruleContainmentPath )
                    {
                    // InternalGumboParser.g:2408:5: (lv_appliesTo_8_0= ruleContainmentPath )
                    // InternalGumboParser.g:2409:6: lv_appliesTo_8_0= ruleContainmentPath
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToContainmentPathParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_37);
                    lv_appliesTo_8_0=ruleContainmentPath();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getContainedPropertyAssociationRule());
                      						}
                      						add(
                      							current,
                      							"appliesTo",
                      							lv_appliesTo_8_0,
                      							"org.osate.xtext.aadl2.properties.Properties.ContainmentPath");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:2426:4: (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==Comma) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalGumboParser.g:2427:5: otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) )
                    	    {
                    	    otherlv_9=(Token)match(input,Comma,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_9, grammarAccess.getContainedPropertyAssociationAccess().getCommaKeyword_4_2_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:2431:5: ( (lv_appliesTo_10_0= ruleContainmentPath ) )
                    	    // InternalGumboParser.g:2432:6: (lv_appliesTo_10_0= ruleContainmentPath )
                    	    {
                    	    // InternalGumboParser.g:2432:6: (lv_appliesTo_10_0= ruleContainmentPath )
                    	    // InternalGumboParser.g:2433:7: lv_appliesTo_10_0= ruleContainmentPath
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToContainmentPathParserRuleCall_4_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_37);
                    	    lv_appliesTo_10_0=ruleContainmentPath();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getContainedPropertyAssociationRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"appliesTo",
                    	      								lv_appliesTo_10_0,
                    	      								"org.osate.xtext.aadl2.properties.Properties.ContainmentPath");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalGumboParser.g:2452:3: ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==In) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalGumboParser.g:2453:4: ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getInBindingKeywordsParserRuleCall_5_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_31);
                    ruleInBindingKeywords();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_12=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getContainedPropertyAssociationAccess().getLeftParenthesisKeyword_5_1());
                      			
                    }
                    // InternalGumboParser.g:2464:4: ( ( ruleQCREF ) )
                    // InternalGumboParser.g:2465:5: ( ruleQCREF )
                    {
                    // InternalGumboParser.g:2465:5: ( ruleQCREF )
                    // InternalGumboParser.g:2466:6: ruleQCREF
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getContainedPropertyAssociationRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getInBindingClassifierCrossReference_5_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_33);
                    ruleQCREF();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_14=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getContainedPropertyAssociationAccess().getRightParenthesisKeyword_5_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_15=(Token)match(input,Semicolon,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getContainedPropertyAssociationAccess().getSemicolonKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContainedPropertyAssociation"


    // $ANTLR start "entryRuleContainmentPath"
    // InternalGumboParser.g:2493:1: entryRuleContainmentPath returns [EObject current=null] : iv_ruleContainmentPath= ruleContainmentPath EOF ;
    public final EObject entryRuleContainmentPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainmentPath = null;


        try {
            // InternalGumboParser.g:2493:56: (iv_ruleContainmentPath= ruleContainmentPath EOF )
            // InternalGumboParser.g:2494:2: iv_ruleContainmentPath= ruleContainmentPath EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainmentPathRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleContainmentPath=ruleContainmentPath();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainmentPath; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContainmentPath"


    // $ANTLR start "ruleContainmentPath"
    // InternalGumboParser.g:2500:1: ruleContainmentPath returns [EObject current=null] : ( (lv_path_0_0= ruleContainmentPathElement ) ) ;
    public final EObject ruleContainmentPath() throws RecognitionException {
        EObject current = null;

        EObject lv_path_0_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2506:2: ( ( (lv_path_0_0= ruleContainmentPathElement ) ) )
            // InternalGumboParser.g:2507:2: ( (lv_path_0_0= ruleContainmentPathElement ) )
            {
            // InternalGumboParser.g:2507:2: ( (lv_path_0_0= ruleContainmentPathElement ) )
            // InternalGumboParser.g:2508:3: (lv_path_0_0= ruleContainmentPathElement )
            {
            // InternalGumboParser.g:2508:3: (lv_path_0_0= ruleContainmentPathElement )
            // InternalGumboParser.g:2509:4: lv_path_0_0= ruleContainmentPathElement
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getContainmentPathAccess().getPathContainmentPathElementParserRuleCall_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_path_0_0=ruleContainmentPathElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getContainmentPathRule());
              				}
              				set(
              					current,
              					"path",
              					lv_path_0_0,
              					"org.osate.xtext.aadl2.properties.Properties.ContainmentPathElement");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContainmentPath"


    // $ANTLR start "entryRuleOptionalModalPropertyValue"
    // InternalGumboParser.g:2529:1: entryRuleOptionalModalPropertyValue returns [EObject current=null] : iv_ruleOptionalModalPropertyValue= ruleOptionalModalPropertyValue EOF ;
    public final EObject entryRuleOptionalModalPropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionalModalPropertyValue = null;


        try {
            // InternalGumboParser.g:2529:67: (iv_ruleOptionalModalPropertyValue= ruleOptionalModalPropertyValue EOF )
            // InternalGumboParser.g:2530:2: iv_ruleOptionalModalPropertyValue= ruleOptionalModalPropertyValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOptionalModalPropertyValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOptionalModalPropertyValue=ruleOptionalModalPropertyValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOptionalModalPropertyValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOptionalModalPropertyValue"


    // $ANTLR start "ruleOptionalModalPropertyValue"
    // InternalGumboParser.g:2536:1: ruleOptionalModalPropertyValue returns [EObject current=null] : ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )? ) ;
    public final EObject ruleOptionalModalPropertyValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_ownedValue_0_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2542:2: ( ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )? ) )
            // InternalGumboParser.g:2543:2: ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )? )
            {
            // InternalGumboParser.g:2543:2: ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )? )
            // InternalGumboParser.g:2544:3: ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )?
            {
            // InternalGumboParser.g:2544:3: ( (lv_ownedValue_0_0= rulePropertyExpression ) )
            // InternalGumboParser.g:2545:4: (lv_ownedValue_0_0= rulePropertyExpression )
            {
            // InternalGumboParser.g:2545:4: (lv_ownedValue_0_0= rulePropertyExpression )
            // InternalGumboParser.g:2546:5: lv_ownedValue_0_0= rulePropertyExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOptionalModalPropertyValueAccess().getOwnedValuePropertyExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_38);
            lv_ownedValue_0_0=rulePropertyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOptionalModalPropertyValueRule());
              					}
              					set(
              						current,
              						"ownedValue",
              						lv_ownedValue_0_0,
              						"org.osate.xtext.aadl2.properties.Properties.PropertyExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumboParser.g:2563:3: ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==In) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==Modes) ) {
                    alt36=1;
                }
            }
            switch (alt36) {
                case 1 :
                    // InternalGumboParser.g:2564:4: ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getOptionalModalPropertyValueAccess().getInModesKeywordsParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_31);
                    ruleInModesKeywords();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_2=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getOptionalModalPropertyValueAccess().getLeftParenthesisKeyword_1_1());
                      			
                    }
                    // InternalGumboParser.g:2575:4: ( (otherlv_3= RULE_ID ) )
                    // InternalGumboParser.g:2576:5: (otherlv_3= RULE_ID )
                    {
                    // InternalGumboParser.g:2576:5: (otherlv_3= RULE_ID )
                    // InternalGumboParser.g:2577:6: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getOptionalModalPropertyValueRule());
                      						}
                      					
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getOptionalModalPropertyValueAccess().getInModeModeCrossReference_1_2_0());
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:2588:4: (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==Comma) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalGumboParser.g:2589:5: otherlv_4= Comma ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getOptionalModalPropertyValueAccess().getCommaKeyword_1_3_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:2593:5: ( (otherlv_5= RULE_ID ) )
                    	    // InternalGumboParser.g:2594:6: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalGumboParser.g:2594:6: (otherlv_5= RULE_ID )
                    	    // InternalGumboParser.g:2595:7: otherlv_5= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getOptionalModalPropertyValueRule());
                    	      							}
                    	      						
                    	    }
                    	    otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_39); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_5, grammarAccess.getOptionalModalPropertyValueAccess().getInModeModeCrossReference_1_3_1_0());
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getOptionalModalPropertyValueAccess().getRightParenthesisKeyword_1_4());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOptionalModalPropertyValue"


    // $ANTLR start "entryRulePropertyValue"
    // InternalGumboParser.g:2616:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalGumboParser.g:2616:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalGumboParser.g:2617:2: iv_rulePropertyValue= rulePropertyValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePropertyValue=rulePropertyValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyValue"


    // $ANTLR start "rulePropertyValue"
    // InternalGumboParser.g:2623:1: rulePropertyValue returns [EObject current=null] : ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedValue_0_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2629:2: ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) )
            // InternalGumboParser.g:2630:2: ( (lv_ownedValue_0_0= rulePropertyExpression ) )
            {
            // InternalGumboParser.g:2630:2: ( (lv_ownedValue_0_0= rulePropertyExpression ) )
            // InternalGumboParser.g:2631:3: (lv_ownedValue_0_0= rulePropertyExpression )
            {
            // InternalGumboParser.g:2631:3: (lv_ownedValue_0_0= rulePropertyExpression )
            // InternalGumboParser.g:2632:4: lv_ownedValue_0_0= rulePropertyExpression
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getPropertyValueAccess().getOwnedValuePropertyExpressionParserRuleCall_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_ownedValue_0_0=rulePropertyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getPropertyValueRule());
              				}
              				set(
              					current,
              					"ownedValue",
              					lv_ownedValue_0_0,
              					"org.osate.xtext.aadl2.properties.Properties.PropertyExpression");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyValue"


    // $ANTLR start "entryRulePropertyExpression"
    // InternalGumboParser.g:2652:1: entryRulePropertyExpression returns [EObject current=null] : iv_rulePropertyExpression= rulePropertyExpression EOF ;
    public final EObject entryRulePropertyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyExpression = null;


        try {
            // InternalGumboParser.g:2652:59: (iv_rulePropertyExpression= rulePropertyExpression EOF )
            // InternalGumboParser.g:2653:2: iv_rulePropertyExpression= rulePropertyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePropertyExpression=rulePropertyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyExpression"


    // $ANTLR start "rulePropertyExpression"
    // InternalGumboParser.g:2659:1: rulePropertyExpression returns [EObject current=null] : (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm ) ;
    public final EObject rulePropertyExpression() throws RecognitionException {
        EObject current = null;

        EObject this_RecordTerm_0 = null;

        EObject this_ReferenceTerm_1 = null;

        EObject this_ComponentClassifierTerm_2 = null;

        EObject this_ComputedTerm_3 = null;

        EObject this_StringTerm_4 = null;

        EObject this_NumericRangeTerm_5 = null;

        EObject this_RealTerm_6 = null;

        EObject this_IntegerTerm_7 = null;

        EObject this_ListTerm_8 = null;

        EObject this_BooleanLiteral_9 = null;

        EObject this_LiteralorReferenceTerm_10 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2665:2: ( (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm ) )
            // InternalGumboParser.g:2666:2: (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm )
            {
            // InternalGumboParser.g:2666:2: (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm )
            int alt37=11;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // InternalGumboParser.g:2667:3: this_RecordTerm_0= ruleRecordTerm
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyExpressionAccess().getRecordTermParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_RecordTerm_0=ruleRecordTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RecordTerm_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:2676:3: this_ReferenceTerm_1= ruleReferenceTerm
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyExpressionAccess().getReferenceTermParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ReferenceTerm_1=ruleReferenceTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReferenceTerm_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGumboParser.g:2685:3: this_ComponentClassifierTerm_2= ruleComponentClassifierTerm
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyExpressionAccess().getComponentClassifierTermParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ComponentClassifierTerm_2=ruleComponentClassifierTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ComponentClassifierTerm_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGumboParser.g:2694:3: this_ComputedTerm_3= ruleComputedTerm
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyExpressionAccess().getComputedTermParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ComputedTerm_3=ruleComputedTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ComputedTerm_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGumboParser.g:2703:3: this_StringTerm_4= ruleStringTerm
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyExpressionAccess().getStringTermParserRuleCall_4());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_StringTerm_4=ruleStringTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StringTerm_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalGumboParser.g:2712:3: this_NumericRangeTerm_5= ruleNumericRangeTerm
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyExpressionAccess().getNumericRangeTermParserRuleCall_5());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NumericRangeTerm_5=ruleNumericRangeTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NumericRangeTerm_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalGumboParser.g:2721:3: this_RealTerm_6= ruleRealTerm
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyExpressionAccess().getRealTermParserRuleCall_6());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_RealTerm_6=ruleRealTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RealTerm_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalGumboParser.g:2730:3: this_IntegerTerm_7= ruleIntegerTerm
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyExpressionAccess().getIntegerTermParserRuleCall_7());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_IntegerTerm_7=ruleIntegerTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IntegerTerm_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalGumboParser.g:2739:3: this_ListTerm_8= ruleListTerm
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyExpressionAccess().getListTermParserRuleCall_8());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ListTerm_8=ruleListTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ListTerm_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalGumboParser.g:2748:3: this_BooleanLiteral_9= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyExpressionAccess().getBooleanLiteralParserRuleCall_9());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_BooleanLiteral_9=ruleBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BooleanLiteral_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalGumboParser.g:2757:3: this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyExpressionAccess().getLiteralorReferenceTermParserRuleCall_10());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_LiteralorReferenceTerm_10=ruleLiteralorReferenceTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LiteralorReferenceTerm_10;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyExpression"


    // $ANTLR start "entryRuleLiteralorReferenceTerm"
    // InternalGumboParser.g:2769:1: entryRuleLiteralorReferenceTerm returns [EObject current=null] : iv_ruleLiteralorReferenceTerm= ruleLiteralorReferenceTerm EOF ;
    public final EObject entryRuleLiteralorReferenceTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralorReferenceTerm = null;


        try {
            // InternalGumboParser.g:2769:63: (iv_ruleLiteralorReferenceTerm= ruleLiteralorReferenceTerm EOF )
            // InternalGumboParser.g:2770:2: iv_ruleLiteralorReferenceTerm= ruleLiteralorReferenceTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralorReferenceTermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLiteralorReferenceTerm=ruleLiteralorReferenceTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralorReferenceTerm; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralorReferenceTerm"


    // $ANTLR start "ruleLiteralorReferenceTerm"
    // InternalGumboParser.g:2776:1: ruleLiteralorReferenceTerm returns [EObject current=null] : ( ( ruleQPREF ) ) ;
    public final EObject ruleLiteralorReferenceTerm() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalGumboParser.g:2782:2: ( ( ( ruleQPREF ) ) )
            // InternalGumboParser.g:2783:2: ( ( ruleQPREF ) )
            {
            // InternalGumboParser.g:2783:2: ( ( ruleQPREF ) )
            // InternalGumboParser.g:2784:3: ( ruleQPREF )
            {
            // InternalGumboParser.g:2784:3: ( ruleQPREF )
            // InternalGumboParser.g:2785:4: ruleQPREF
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getLiteralorReferenceTermRule());
              				}
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getLiteralorReferenceTermAccess().getNamedValueAbstractNamedValueCrossReference_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleQPREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralorReferenceTerm"


    // $ANTLR start "entryRuleBooleanLiteral"
    // InternalGumboParser.g:2802:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalGumboParser.g:2802:55: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalGumboParser.g:2803:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // InternalGumboParser.g:2809:1: ruleBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalGumboParser.g:2815:2: ( ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) ) )
            // InternalGumboParser.g:2816:2: ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) )
            {
            // InternalGumboParser.g:2816:2: ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) )
            // InternalGumboParser.g:2817:3: () ( ( (lv_value_1_0= True ) ) | otherlv_2= False )
            {
            // InternalGumboParser.g:2817:3: ()
            // InternalGumboParser.g:2818:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalGumboParser.g:2824:3: ( ( (lv_value_1_0= True ) ) | otherlv_2= False )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==True) ) {
                alt38=1;
            }
            else if ( (LA38_0==False) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalGumboParser.g:2825:4: ( (lv_value_1_0= True ) )
                    {
                    // InternalGumboParser.g:2825:4: ( (lv_value_1_0= True ) )
                    // InternalGumboParser.g:2826:5: (lv_value_1_0= True )
                    {
                    // InternalGumboParser.g:2826:5: (lv_value_1_0= True )
                    // InternalGumboParser.g:2827:6: lv_value_1_0= True
                    {
                    lv_value_1_0=(Token)match(input,True,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_1_0, grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getBooleanLiteralRule());
                      						}
                      						setWithLastConsumed(current, "value", lv_value_1_0 != null, "true");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:2840:4: otherlv_2= False
                    {
                    otherlv_2=(Token)match(input,False,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleConstantValue"
    // InternalGumboParser.g:2849:1: entryRuleConstantValue returns [EObject current=null] : iv_ruleConstantValue= ruleConstantValue EOF ;
    public final EObject entryRuleConstantValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantValue = null;


        try {
            // InternalGumboParser.g:2849:54: (iv_ruleConstantValue= ruleConstantValue EOF )
            // InternalGumboParser.g:2850:2: iv_ruleConstantValue= ruleConstantValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleConstantValue=ruleConstantValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstantValue"


    // $ANTLR start "ruleConstantValue"
    // InternalGumboParser.g:2856:1: ruleConstantValue returns [EObject current=null] : ( ( ruleQPREF ) ) ;
    public final EObject ruleConstantValue() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalGumboParser.g:2862:2: ( ( ( ruleQPREF ) ) )
            // InternalGumboParser.g:2863:2: ( ( ruleQPREF ) )
            {
            // InternalGumboParser.g:2863:2: ( ( ruleQPREF ) )
            // InternalGumboParser.g:2864:3: ( ruleQPREF )
            {
            // InternalGumboParser.g:2864:3: ( ruleQPREF )
            // InternalGumboParser.g:2865:4: ruleQPREF
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getConstantValueRule());
              				}
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getConstantValueAccess().getNamedValuePropertyConstantCrossReference_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleQPREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstantValue"


    // $ANTLR start "entryRuleReferenceTerm"
    // InternalGumboParser.g:2882:1: entryRuleReferenceTerm returns [EObject current=null] : iv_ruleReferenceTerm= ruleReferenceTerm EOF ;
    public final EObject entryRuleReferenceTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceTerm = null;


        try {
            // InternalGumboParser.g:2882:54: (iv_ruleReferenceTerm= ruleReferenceTerm EOF )
            // InternalGumboParser.g:2883:2: iv_ruleReferenceTerm= ruleReferenceTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceTermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleReferenceTerm=ruleReferenceTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceTerm; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReferenceTerm"


    // $ANTLR start "ruleReferenceTerm"
    // InternalGumboParser.g:2889:1: ruleReferenceTerm returns [EObject current=null] : (otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleReferenceTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_path_2_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2895:2: ( (otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis ) )
            // InternalGumboParser.g:2896:2: (otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis )
            {
            // InternalGumboParser.g:2896:2: (otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis )
            // InternalGumboParser.g:2897:3: otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis
            {
            otherlv_0=(Token)match(input,Reference,FollowSets000.FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReferenceTermAccess().getReferenceKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReferenceTermAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGumboParser.g:2905:3: ( (lv_path_2_0= ruleContainmentPathElement ) )
            // InternalGumboParser.g:2906:4: (lv_path_2_0= ruleContainmentPathElement )
            {
            // InternalGumboParser.g:2906:4: (lv_path_2_0= ruleContainmentPathElement )
            // InternalGumboParser.g:2907:5: lv_path_2_0= ruleContainmentPathElement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReferenceTermAccess().getPathContainmentPathElementParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_33);
            lv_path_2_0=ruleContainmentPathElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReferenceTermRule());
              					}
              					set(
              						current,
              						"path",
              						lv_path_2_0,
              						"org.osate.xtext.aadl2.properties.Properties.ContainmentPathElement");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getReferenceTermAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReferenceTerm"


    // $ANTLR start "entryRuleRecordTerm"
    // InternalGumboParser.g:2932:1: entryRuleRecordTerm returns [EObject current=null] : iv_ruleRecordTerm= ruleRecordTerm EOF ;
    public final EObject entryRuleRecordTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordTerm = null;


        try {
            // InternalGumboParser.g:2932:51: (iv_ruleRecordTerm= ruleRecordTerm EOF )
            // InternalGumboParser.g:2933:2: iv_ruleRecordTerm= ruleRecordTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRecordTermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRecordTerm=ruleRecordTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRecordTerm; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRecordTerm"


    // $ANTLR start "ruleRecordTerm"
    // InternalGumboParser.g:2939:1: ruleRecordTerm returns [EObject current=null] : (otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket ) ;
    public final EObject ruleRecordTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ownedFieldValue_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2945:2: ( (otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket ) )
            // InternalGumboParser.g:2946:2: (otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket )
            {
            // InternalGumboParser.g:2946:2: (otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket )
            // InternalGumboParser.g:2947:3: otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket
            {
            otherlv_0=(Token)match(input,LeftSquareBracket,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRecordTermAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalGumboParser.g:2951:3: ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ID) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalGumboParser.g:2952:4: (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation )
            	    {
            	    // InternalGumboParser.g:2952:4: (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation )
            	    // InternalGumboParser.g:2953:5: lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRecordTermAccess().getOwnedFieldValueFieldPropertyAssociationParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_40);
            	    lv_ownedFieldValue_1_0=ruleFieldPropertyAssociation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getRecordTermRule());
            	      					}
            	      					add(
            	      						current,
            	      						"ownedFieldValue",
            	      						lv_ownedFieldValue_1_0,
            	      						"org.osate.xtext.aadl2.properties.Properties.FieldPropertyAssociation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt39 >= 1 ) break loop39;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);

            otherlv_2=(Token)match(input,RightSquareBracket,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRecordTermAccess().getRightSquareBracketKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRecordTerm"


    // $ANTLR start "entryRuleComputedTerm"
    // InternalGumboParser.g:2978:1: entryRuleComputedTerm returns [EObject current=null] : iv_ruleComputedTerm= ruleComputedTerm EOF ;
    public final EObject entryRuleComputedTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComputedTerm = null;


        try {
            // InternalGumboParser.g:2978:53: (iv_ruleComputedTerm= ruleComputedTerm EOF )
            // InternalGumboParser.g:2979:2: iv_ruleComputedTerm= ruleComputedTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComputedTermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleComputedTerm=ruleComputedTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComputedTerm; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComputedTerm"


    // $ANTLR start "ruleComputedTerm"
    // InternalGumboParser.g:2985:1: ruleComputedTerm returns [EObject current=null] : (otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleComputedTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_function_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalGumboParser.g:2991:2: ( (otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis ) )
            // InternalGumboParser.g:2992:2: (otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis )
            {
            // InternalGumboParser.g:2992:2: (otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis )
            // InternalGumboParser.g:2993:3: otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis
            {
            otherlv_0=(Token)match(input,Compute,FollowSets000.FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getComputedTermAccess().getComputeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getComputedTermAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGumboParser.g:3001:3: ( (lv_function_2_0= RULE_ID ) )
            // InternalGumboParser.g:3002:4: (lv_function_2_0= RULE_ID )
            {
            // InternalGumboParser.g:3002:4: (lv_function_2_0= RULE_ID )
            // InternalGumboParser.g:3003:5: lv_function_2_0= RULE_ID
            {
            lv_function_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_function_2_0, grammarAccess.getComputedTermAccess().getFunctionIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getComputedTermRule());
              					}
              					setWithLastConsumed(
              						current,
              						"function",
              						lv_function_2_0,
              						"org.osate.xtext.aadl2.properties.Properties.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getComputedTermAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComputedTerm"


    // $ANTLR start "entryRuleComponentClassifierTerm"
    // InternalGumboParser.g:3027:1: entryRuleComponentClassifierTerm returns [EObject current=null] : iv_ruleComponentClassifierTerm= ruleComponentClassifierTerm EOF ;
    public final EObject entryRuleComponentClassifierTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentClassifierTerm = null;


        try {
            // InternalGumboParser.g:3027:64: (iv_ruleComponentClassifierTerm= ruleComponentClassifierTerm EOF )
            // InternalGumboParser.g:3028:2: iv_ruleComponentClassifierTerm= ruleComponentClassifierTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComponentClassifierTermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleComponentClassifierTerm=ruleComponentClassifierTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComponentClassifierTerm; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentClassifierTerm"


    // $ANTLR start "ruleComponentClassifierTerm"
    // InternalGumboParser.g:3034:1: ruleComponentClassifierTerm returns [EObject current=null] : (otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleComponentClassifierTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalGumboParser.g:3040:2: ( (otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis ) )
            // InternalGumboParser.g:3041:2: (otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis )
            {
            // InternalGumboParser.g:3041:2: (otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis )
            // InternalGumboParser.g:3042:3: otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis
            {
            otherlv_0=(Token)match(input,Classifier,FollowSets000.FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getComponentClassifierTermAccess().getClassifierKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getComponentClassifierTermAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGumboParser.g:3050:3: ( ( ruleQCREF ) )
            // InternalGumboParser.g:3051:4: ( ruleQCREF )
            {
            // InternalGumboParser.g:3051:4: ( ruleQCREF )
            // InternalGumboParser.g:3052:5: ruleQCREF
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getComponentClassifierTermRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComponentClassifierTermAccess().getClassifierComponentClassifierCrossReference_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_33);
            ruleQCREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getComponentClassifierTermAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentClassifierTerm"


    // $ANTLR start "entryRuleListTerm"
    // InternalGumboParser.g:3074:1: entryRuleListTerm returns [EObject current=null] : iv_ruleListTerm= ruleListTerm EOF ;
    public final EObject entryRuleListTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListTerm = null;


        try {
            // InternalGumboParser.g:3074:49: (iv_ruleListTerm= ruleListTerm EOF )
            // InternalGumboParser.g:3075:2: iv_ruleListTerm= ruleListTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListTermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleListTerm=ruleListTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleListTerm; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListTerm"


    // $ANTLR start "ruleListTerm"
    // InternalGumboParser.g:3081:1: ruleListTerm returns [EObject current=null] : ( () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis ) ;
    public final EObject ruleListTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedListElement_2_0 = null;

        EObject lv_ownedListElement_4_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:3087:2: ( ( () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis ) )
            // InternalGumboParser.g:3088:2: ( () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis )
            {
            // InternalGumboParser.g:3088:2: ( () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis )
            // InternalGumboParser.g:3089:3: () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis
            {
            // InternalGumboParser.g:3089:3: ()
            // InternalGumboParser.g:3090:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getListTermAccess().getListValueAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getListTermAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGumboParser.g:3100:3: ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==Classifier||LA41_0==Reference||LA41_0==Compute||LA41_0==False||LA41_0==True||LA41_0==LeftParenthesis||LA41_0==PlusSign||LA41_0==HyphenMinus||LA41_0==LeftSquareBracket||LA41_0==RULE_REAL_LIT||LA41_0==RULE_INTEGER_LIT||(LA41_0>=RULE_STRING && LA41_0<=RULE_ID)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalGumboParser.g:3101:4: ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )*
                    {
                    // InternalGumboParser.g:3101:4: ( (lv_ownedListElement_2_0= rulePropertyExpression ) )
                    // InternalGumboParser.g:3102:5: (lv_ownedListElement_2_0= rulePropertyExpression )
                    {
                    // InternalGumboParser.g:3102:5: (lv_ownedListElement_2_0= rulePropertyExpression )
                    // InternalGumboParser.g:3103:6: lv_ownedListElement_2_0= rulePropertyExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getListTermAccess().getOwnedListElementPropertyExpressionParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_39);
                    lv_ownedListElement_2_0=rulePropertyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getListTermRule());
                      						}
                      						add(
                      							current,
                      							"ownedListElement",
                      							lv_ownedListElement_2_0,
                      							"org.osate.xtext.aadl2.properties.Properties.PropertyExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:3120:4: (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==Comma) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalGumboParser.g:3121:5: otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FollowSets000.FOLLOW_35); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getListTermAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:3125:5: ( (lv_ownedListElement_4_0= rulePropertyExpression ) )
                    	    // InternalGumboParser.g:3126:6: (lv_ownedListElement_4_0= rulePropertyExpression )
                    	    {
                    	    // InternalGumboParser.g:3126:6: (lv_ownedListElement_4_0= rulePropertyExpression )
                    	    // InternalGumboParser.g:3127:7: lv_ownedListElement_4_0= rulePropertyExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getListTermAccess().getOwnedListElementPropertyExpressionParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_39);
                    	    lv_ownedListElement_4_0=rulePropertyExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getListTermRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"ownedListElement",
                    	      								lv_ownedListElement_4_0,
                    	      								"org.osate.xtext.aadl2.properties.Properties.PropertyExpression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getListTermAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListTerm"


    // $ANTLR start "entryRuleFieldPropertyAssociation"
    // InternalGumboParser.g:3154:1: entryRuleFieldPropertyAssociation returns [EObject current=null] : iv_ruleFieldPropertyAssociation= ruleFieldPropertyAssociation EOF ;
    public final EObject entryRuleFieldPropertyAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldPropertyAssociation = null;


        try {
            // InternalGumboParser.g:3154:65: (iv_ruleFieldPropertyAssociation= ruleFieldPropertyAssociation EOF )
            // InternalGumboParser.g:3155:2: iv_ruleFieldPropertyAssociation= ruleFieldPropertyAssociation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldPropertyAssociationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFieldPropertyAssociation=ruleFieldPropertyAssociation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldPropertyAssociation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldPropertyAssociation"


    // $ANTLR start "ruleFieldPropertyAssociation"
    // InternalGumboParser.g:3161:1: ruleFieldPropertyAssociation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon ) ;
    public final EObject ruleFieldPropertyAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedValue_2_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:3167:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon ) )
            // InternalGumboParser.g:3168:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon )
            {
            // InternalGumboParser.g:3168:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon )
            // InternalGumboParser.g:3169:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon
            {
            // InternalGumboParser.g:3169:3: ( (otherlv_0= RULE_ID ) )
            // InternalGumboParser.g:3170:4: (otherlv_0= RULE_ID )
            {
            // InternalGumboParser.g:3170:4: (otherlv_0= RULE_ID )
            // InternalGumboParser.g:3171:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFieldPropertyAssociationRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getFieldPropertyAssociationAccess().getPropertyBasicPropertyCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFieldPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_1());
              		
            }
            // InternalGumboParser.g:3186:3: ( (lv_ownedValue_2_0= rulePropertyExpression ) )
            // InternalGumboParser.g:3187:4: (lv_ownedValue_2_0= rulePropertyExpression )
            {
            // InternalGumboParser.g:3187:4: (lv_ownedValue_2_0= rulePropertyExpression )
            // InternalGumboParser.g:3188:5: lv_ownedValue_2_0= rulePropertyExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFieldPropertyAssociationAccess().getOwnedValuePropertyExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_12);
            lv_ownedValue_2_0=rulePropertyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFieldPropertyAssociationRule());
              					}
              					set(
              						current,
              						"ownedValue",
              						lv_ownedValue_2_0,
              						"org.osate.xtext.aadl2.properties.Properties.PropertyExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,Semicolon,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getFieldPropertyAssociationAccess().getSemicolonKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldPropertyAssociation"


    // $ANTLR start "entryRuleContainmentPathElement"
    // InternalGumboParser.g:3213:1: entryRuleContainmentPathElement returns [EObject current=null] : iv_ruleContainmentPathElement= ruleContainmentPathElement EOF ;
    public final EObject entryRuleContainmentPathElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainmentPathElement = null;


        try {
            // InternalGumboParser.g:3213:63: (iv_ruleContainmentPathElement= ruleContainmentPathElement EOF )
            // InternalGumboParser.g:3214:2: iv_ruleContainmentPathElement= ruleContainmentPathElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainmentPathElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleContainmentPathElement=ruleContainmentPathElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainmentPathElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContainmentPathElement"


    // $ANTLR start "ruleContainmentPathElement"
    // InternalGumboParser.g:3220:1: ruleContainmentPathElement returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )? ) ;
    public final EObject ruleContainmentPathElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_arrayRange_1_0 = null;

        EObject lv_path_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:3226:2: ( ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )? ) )
            // InternalGumboParser.g:3227:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )? )
            {
            // InternalGumboParser.g:3227:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )? )
            // InternalGumboParser.g:3228:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )?
            {
            // InternalGumboParser.g:3228:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* )
            // InternalGumboParser.g:3229:4: ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )*
            {
            // InternalGumboParser.g:3229:4: ( (otherlv_0= RULE_ID ) )
            // InternalGumboParser.g:3230:5: (otherlv_0= RULE_ID )
            {
            // InternalGumboParser.g:3230:5: (otherlv_0= RULE_ID )
            // InternalGumboParser.g:3231:6: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElement(grammarAccess.getContainmentPathElementRule());
              						}
              					
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						newLeafNode(otherlv_0, grammarAccess.getContainmentPathElementAccess().getNamedElementNamedElementCrossReference_0_0_0());
              					
            }

            }


            }

            // InternalGumboParser.g:3242:4: ( (lv_arrayRange_1_0= ruleArrayRange ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==LeftSquareBracket) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalGumboParser.g:3243:5: (lv_arrayRange_1_0= ruleArrayRange )
            	    {
            	    // InternalGumboParser.g:3243:5: (lv_arrayRange_1_0= ruleArrayRange )
            	    // InternalGumboParser.g:3244:6: lv_arrayRange_1_0= ruleArrayRange
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getContainmentPathElementAccess().getArrayRangeArrayRangeParserRuleCall_0_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_43);
            	    lv_arrayRange_1_0=ruleArrayRange();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getContainmentPathElementRule());
            	      						}
            	      						add(
            	      							current,
            	      							"arrayRange",
            	      							lv_arrayRange_1_0,
            	      							"org.osate.xtext.aadl2.properties.Properties.ArrayRange");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }

            // InternalGumboParser.g:3262:3: (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==FullStop) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalGumboParser.g:3263:4: otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) )
                    {
                    otherlv_2=(Token)match(input,FullStop,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getContainmentPathElementAccess().getFullStopKeyword_1_0());
                      			
                    }
                    // InternalGumboParser.g:3267:4: ( (lv_path_3_0= ruleContainmentPathElement ) )
                    // InternalGumboParser.g:3268:5: (lv_path_3_0= ruleContainmentPathElement )
                    {
                    // InternalGumboParser.g:3268:5: (lv_path_3_0= ruleContainmentPathElement )
                    // InternalGumboParser.g:3269:6: lv_path_3_0= ruleContainmentPathElement
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getContainmentPathElementAccess().getPathContainmentPathElementParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_path_3_0=ruleContainmentPathElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getContainmentPathElementRule());
                      						}
                      						set(
                      							current,
                      							"path",
                      							lv_path_3_0,
                      							"org.osate.xtext.aadl2.properties.Properties.ContainmentPathElement");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContainmentPathElement"


    // $ANTLR start "entryRulePlusMinus"
    // InternalGumboParser.g:3291:1: entryRulePlusMinus returns [String current=null] : iv_rulePlusMinus= rulePlusMinus EOF ;
    public final String entryRulePlusMinus() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePlusMinus = null;


        try {
            // InternalGumboParser.g:3291:49: (iv_rulePlusMinus= rulePlusMinus EOF )
            // InternalGumboParser.g:3292:2: iv_rulePlusMinus= rulePlusMinus EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlusMinusRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePlusMinus=rulePlusMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlusMinus.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlusMinus"


    // $ANTLR start "rulePlusMinus"
    // InternalGumboParser.g:3298:1: rulePlusMinus returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= PlusSign | kw= HyphenMinus ) ;
    public final AntlrDatatypeRuleToken rulePlusMinus() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumboParser.g:3304:2: ( (kw= PlusSign | kw= HyphenMinus ) )
            // InternalGumboParser.g:3305:2: (kw= PlusSign | kw= HyphenMinus )
            {
            // InternalGumboParser.g:3305:2: (kw= PlusSign | kw= HyphenMinus )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==PlusSign) ) {
                alt44=1;
            }
            else if ( (LA44_0==HyphenMinus) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalGumboParser.g:3306:3: kw= PlusSign
                    {
                    kw=(Token)match(input,PlusSign,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPlusMinusAccess().getPlusSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:3312:3: kw= HyphenMinus
                    {
                    kw=(Token)match(input,HyphenMinus,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPlusMinusAccess().getHyphenMinusKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlusMinus"


    // $ANTLR start "entryRuleStringTerm"
    // InternalGumboParser.g:3321:1: entryRuleStringTerm returns [EObject current=null] : iv_ruleStringTerm= ruleStringTerm EOF ;
    public final EObject entryRuleStringTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringTerm = null;


        try {
            // InternalGumboParser.g:3321:51: (iv_ruleStringTerm= ruleStringTerm EOF )
            // InternalGumboParser.g:3322:2: iv_ruleStringTerm= ruleStringTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringTermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleStringTerm=ruleStringTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringTerm; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringTerm"


    // $ANTLR start "ruleStringTerm"
    // InternalGumboParser.g:3328:1: ruleStringTerm returns [EObject current=null] : ( (lv_value_0_0= ruleNoQuoteString ) ) ;
    public final EObject ruleStringTerm() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:3334:2: ( ( (lv_value_0_0= ruleNoQuoteString ) ) )
            // InternalGumboParser.g:3335:2: ( (lv_value_0_0= ruleNoQuoteString ) )
            {
            // InternalGumboParser.g:3335:2: ( (lv_value_0_0= ruleNoQuoteString ) )
            // InternalGumboParser.g:3336:3: (lv_value_0_0= ruleNoQuoteString )
            {
            // InternalGumboParser.g:3336:3: (lv_value_0_0= ruleNoQuoteString )
            // InternalGumboParser.g:3337:4: lv_value_0_0= ruleNoQuoteString
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getStringTermAccess().getValueNoQuoteStringParserRuleCall_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_0_0=ruleNoQuoteString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getStringTermRule());
              				}
              				set(
              					current,
              					"value",
              					lv_value_0_0,
              					"org.osate.xtext.aadl2.properties.Properties.NoQuoteString");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringTerm"


    // $ANTLR start "entryRuleNoQuoteString"
    // InternalGumboParser.g:3357:1: entryRuleNoQuoteString returns [String current=null] : iv_ruleNoQuoteString= ruleNoQuoteString EOF ;
    public final String entryRuleNoQuoteString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNoQuoteString = null;


        try {
            // InternalGumboParser.g:3357:53: (iv_ruleNoQuoteString= ruleNoQuoteString EOF )
            // InternalGumboParser.g:3358:2: iv_ruleNoQuoteString= ruleNoQuoteString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNoQuoteStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNoQuoteString=ruleNoQuoteString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNoQuoteString.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNoQuoteString"


    // $ANTLR start "ruleNoQuoteString"
    // InternalGumboParser.g:3364:1: ruleNoQuoteString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleNoQuoteString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalGumboParser.g:3370:2: (this_STRING_0= RULE_STRING )
            // InternalGumboParser.g:3371:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_STRING_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_STRING_0, grammarAccess.getNoQuoteStringAccess().getSTRINGTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNoQuoteString"


    // $ANTLR start "entryRuleArrayRange"
    // InternalGumboParser.g:3381:1: entryRuleArrayRange returns [EObject current=null] : iv_ruleArrayRange= ruleArrayRange EOF ;
    public final EObject entryRuleArrayRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayRange = null;


        try {
            // InternalGumboParser.g:3381:51: (iv_ruleArrayRange= ruleArrayRange EOF )
            // InternalGumboParser.g:3382:2: iv_ruleArrayRange= ruleArrayRange EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayRangeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleArrayRange=ruleArrayRange();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayRange; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayRange"


    // $ANTLR start "ruleArrayRange"
    // InternalGumboParser.g:3388:1: ruleArrayRange returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleArrayRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_lowerBound_2_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_4_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:3394:2: ( ( () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket ) )
            // InternalGumboParser.g:3395:2: ( () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket )
            {
            // InternalGumboParser.g:3395:2: ( () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket )
            // InternalGumboParser.g:3396:3: () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket
            {
            // InternalGumboParser.g:3396:3: ()
            // InternalGumboParser.g:3397:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getArrayRangeAccess().getArrayRangeAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FollowSets000.FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getArrayRangeAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalGumboParser.g:3407:3: ( (lv_lowerBound_2_0= ruleINTVALUE ) )
            // InternalGumboParser.g:3408:4: (lv_lowerBound_2_0= ruleINTVALUE )
            {
            // InternalGumboParser.g:3408:4: (lv_lowerBound_2_0= ruleINTVALUE )
            // InternalGumboParser.g:3409:5: lv_lowerBound_2_0= ruleINTVALUE
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArrayRangeAccess().getLowerBoundINTVALUEParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_45);
            lv_lowerBound_2_0=ruleINTVALUE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getArrayRangeRule());
              					}
              					set(
              						current,
              						"lowerBound",
              						lv_lowerBound_2_0,
              						"org.osate.xtext.aadl2.properties.Properties.INTVALUE");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumboParser.g:3426:3: (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==FullStopFullStop) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalGumboParser.g:3427:4: otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) )
                    {
                    otherlv_3=(Token)match(input,FullStopFullStop,FollowSets000.FOLLOW_44); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getArrayRangeAccess().getFullStopFullStopKeyword_3_0());
                      			
                    }
                    // InternalGumboParser.g:3431:4: ( (lv_upperBound_4_0= ruleINTVALUE ) )
                    // InternalGumboParser.g:3432:5: (lv_upperBound_4_0= ruleINTVALUE )
                    {
                    // InternalGumboParser.g:3432:5: (lv_upperBound_4_0= ruleINTVALUE )
                    // InternalGumboParser.g:3433:6: lv_upperBound_4_0= ruleINTVALUE
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getArrayRangeAccess().getUpperBoundINTVALUEParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_46);
                    lv_upperBound_4_0=ruleINTVALUE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getArrayRangeRule());
                      						}
                      						set(
                      							current,
                      							"upperBound",
                      							lv_upperBound_4_0,
                      							"org.osate.xtext.aadl2.properties.Properties.INTVALUE");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightSquareBracket,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getArrayRangeAccess().getRightSquareBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayRange"


    // $ANTLR start "entryRuleSignedConstant"
    // InternalGumboParser.g:3459:1: entryRuleSignedConstant returns [EObject current=null] : iv_ruleSignedConstant= ruleSignedConstant EOF ;
    public final EObject entryRuleSignedConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignedConstant = null;


        try {
            // InternalGumboParser.g:3459:55: (iv_ruleSignedConstant= ruleSignedConstant EOF )
            // InternalGumboParser.g:3460:2: iv_ruleSignedConstant= ruleSignedConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignedConstantRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSignedConstant=ruleSignedConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignedConstant; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignedConstant"


    // $ANTLR start "ruleSignedConstant"
    // InternalGumboParser.g:3466:1: ruleSignedConstant returns [EObject current=null] : ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) ) ;
    public final EObject ruleSignedConstant() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_ownedPropertyExpression_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:3472:2: ( ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) ) )
            // InternalGumboParser.g:3473:2: ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) )
            {
            // InternalGumboParser.g:3473:2: ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) )
            // InternalGumboParser.g:3474:3: ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) )
            {
            // InternalGumboParser.g:3474:3: ( (lv_op_0_0= rulePlusMinus ) )
            // InternalGumboParser.g:3475:4: (lv_op_0_0= rulePlusMinus )
            {
            // InternalGumboParser.g:3475:4: (lv_op_0_0= rulePlusMinus )
            // InternalGumboParser.g:3476:5: lv_op_0_0= rulePlusMinus
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSignedConstantAccess().getOpPlusMinusParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_47);
            lv_op_0_0=rulePlusMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSignedConstantRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_0_0,
              						"org.osate.xtext.aadl2.properties.Properties.PlusMinus");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumboParser.g:3493:3: ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) )
            // InternalGumboParser.g:3494:4: (lv_ownedPropertyExpression_1_0= ruleConstantValue )
            {
            // InternalGumboParser.g:3494:4: (lv_ownedPropertyExpression_1_0= ruleConstantValue )
            // InternalGumboParser.g:3495:5: lv_ownedPropertyExpression_1_0= ruleConstantValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSignedConstantAccess().getOwnedPropertyExpressionConstantValueParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_ownedPropertyExpression_1_0=ruleConstantValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSignedConstantRule());
              					}
              					add(
              						current,
              						"ownedPropertyExpression",
              						lv_ownedPropertyExpression_1_0,
              						"org.osate.xtext.aadl2.properties.Properties.ConstantValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignedConstant"


    // $ANTLR start "entryRuleIntegerTerm"
    // InternalGumboParser.g:3516:1: entryRuleIntegerTerm returns [EObject current=null] : iv_ruleIntegerTerm= ruleIntegerTerm EOF ;
    public final EObject entryRuleIntegerTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerTerm = null;


        try {
            // InternalGumboParser.g:3516:52: (iv_ruleIntegerTerm= ruleIntegerTerm EOF )
            // InternalGumboParser.g:3517:2: iv_ruleIntegerTerm= ruleIntegerTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerTermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIntegerTerm=ruleIntegerTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerTerm; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerTerm"


    // $ANTLR start "ruleIntegerTerm"
    // InternalGumboParser.g:3523:1: ruleIntegerTerm returns [EObject current=null] : ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? ) ;
    public final EObject ruleIntegerTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:3529:2: ( ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? ) )
            // InternalGumboParser.g:3530:2: ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? )
            {
            // InternalGumboParser.g:3530:2: ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? )
            // InternalGumboParser.g:3531:3: ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )?
            {
            // InternalGumboParser.g:3531:3: ( (lv_value_0_0= ruleSignedInt ) )
            // InternalGumboParser.g:3532:4: (lv_value_0_0= ruleSignedInt )
            {
            // InternalGumboParser.g:3532:4: (lv_value_0_0= ruleSignedInt )
            // InternalGumboParser.g:3533:5: lv_value_0_0= ruleSignedInt
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIntegerTermAccess().getValueSignedIntParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_10);
            lv_value_0_0=ruleSignedInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIntegerTermRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_0_0,
              						"org.osate.xtext.aadl2.properties.Properties.SignedInt");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumboParser.g:3550:3: ( (otherlv_1= RULE_ID ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalGumboParser.g:3551:4: (otherlv_1= RULE_ID )
                    {
                    // InternalGumboParser.g:3551:4: (otherlv_1= RULE_ID )
                    // InternalGumboParser.g:3552:5: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getIntegerTermRule());
                      					}
                      				
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getIntegerTermAccess().getUnitUnitLiteralCrossReference_1_0());
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerTerm"


    // $ANTLR start "entryRuleSignedInt"
    // InternalGumboParser.g:3567:1: entryRuleSignedInt returns [String current=null] : iv_ruleSignedInt= ruleSignedInt EOF ;
    public final String entryRuleSignedInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedInt = null;


        try {
            // InternalGumboParser.g:3567:49: (iv_ruleSignedInt= ruleSignedInt EOF )
            // InternalGumboParser.g:3568:2: iv_ruleSignedInt= ruleSignedInt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignedIntRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSignedInt=ruleSignedInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignedInt.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignedInt"


    // $ANTLR start "ruleSignedInt"
    // InternalGumboParser.g:3574:1: ruleSignedInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT ) ;
    public final AntlrDatatypeRuleToken ruleSignedInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INTEGER_LIT_2=null;


        	enterRule();

        try {
            // InternalGumboParser.g:3580:2: ( ( (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT ) )
            // InternalGumboParser.g:3581:2: ( (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT )
            {
            // InternalGumboParser.g:3581:2: ( (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT )
            // InternalGumboParser.g:3582:3: (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT
            {
            // InternalGumboParser.g:3582:3: (kw= PlusSign | kw= HyphenMinus )?
            int alt47=3;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==PlusSign) ) {
                alt47=1;
            }
            else if ( (LA47_0==HyphenMinus) ) {
                alt47=2;
            }
            switch (alt47) {
                case 1 :
                    // InternalGumboParser.g:3583:4: kw= PlusSign
                    {
                    kw=(Token)match(input,PlusSign,FollowSets000.FOLLOW_44); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSignedIntAccess().getPlusSignKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:3589:4: kw= HyphenMinus
                    {
                    kw=(Token)match(input,HyphenMinus,FollowSets000.FOLLOW_44); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSignedIntAccess().getHyphenMinusKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            this_INTEGER_LIT_2=(Token)match(input,RULE_INTEGER_LIT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INTEGER_LIT_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INTEGER_LIT_2, grammarAccess.getSignedIntAccess().getINTEGER_LITTerminalRuleCall_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignedInt"


    // $ANTLR start "entryRuleRealTerm"
    // InternalGumboParser.g:3606:1: entryRuleRealTerm returns [EObject current=null] : iv_ruleRealTerm= ruleRealTerm EOF ;
    public final EObject entryRuleRealTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealTerm = null;


        try {
            // InternalGumboParser.g:3606:49: (iv_ruleRealTerm= ruleRealTerm EOF )
            // InternalGumboParser.g:3607:2: iv_ruleRealTerm= ruleRealTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealTermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRealTerm=ruleRealTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealTerm; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRealTerm"


    // $ANTLR start "ruleRealTerm"
    // InternalGumboParser.g:3613:1: ruleRealTerm returns [EObject current=null] : ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? ) ;
    public final EObject ruleRealTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:3619:2: ( ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? ) )
            // InternalGumboParser.g:3620:2: ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? )
            {
            // InternalGumboParser.g:3620:2: ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? )
            // InternalGumboParser.g:3621:3: ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )?
            {
            // InternalGumboParser.g:3621:3: ( (lv_value_0_0= ruleSignedReal ) )
            // InternalGumboParser.g:3622:4: (lv_value_0_0= ruleSignedReal )
            {
            // InternalGumboParser.g:3622:4: (lv_value_0_0= ruleSignedReal )
            // InternalGumboParser.g:3623:5: lv_value_0_0= ruleSignedReal
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRealTermAccess().getValueSignedRealParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_10);
            lv_value_0_0=ruleSignedReal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRealTermRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_0_0,
              						"org.osate.xtext.aadl2.properties.Properties.SignedReal");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumboParser.g:3640:3: ( (otherlv_1= RULE_ID ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalGumboParser.g:3641:4: (otherlv_1= RULE_ID )
                    {
                    // InternalGumboParser.g:3641:4: (otherlv_1= RULE_ID )
                    // InternalGumboParser.g:3642:5: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getRealTermRule());
                      					}
                      				
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getRealTermAccess().getUnitUnitLiteralCrossReference_1_0());
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRealTerm"


    // $ANTLR start "entryRuleSignedReal"
    // InternalGumboParser.g:3657:1: entryRuleSignedReal returns [String current=null] : iv_ruleSignedReal= ruleSignedReal EOF ;
    public final String entryRuleSignedReal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedReal = null;


        try {
            // InternalGumboParser.g:3657:50: (iv_ruleSignedReal= ruleSignedReal EOF )
            // InternalGumboParser.g:3658:2: iv_ruleSignedReal= ruleSignedReal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignedRealRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSignedReal=ruleSignedReal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignedReal.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignedReal"


    // $ANTLR start "ruleSignedReal"
    // InternalGumboParser.g:3664:1: ruleSignedReal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT ) ;
    public final AntlrDatatypeRuleToken ruleSignedReal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_REAL_LIT_2=null;


        	enterRule();

        try {
            // InternalGumboParser.g:3670:2: ( ( (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT ) )
            // InternalGumboParser.g:3671:2: ( (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT )
            {
            // InternalGumboParser.g:3671:2: ( (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT )
            // InternalGumboParser.g:3672:3: (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT
            {
            // InternalGumboParser.g:3672:3: (kw= PlusSign | kw= HyphenMinus )?
            int alt49=3;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==PlusSign) ) {
                alt49=1;
            }
            else if ( (LA49_0==HyphenMinus) ) {
                alt49=2;
            }
            switch (alt49) {
                case 1 :
                    // InternalGumboParser.g:3673:4: kw= PlusSign
                    {
                    kw=(Token)match(input,PlusSign,FollowSets000.FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSignedRealAccess().getPlusSignKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:3679:4: kw= HyphenMinus
                    {
                    kw=(Token)match(input,HyphenMinus,FollowSets000.FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSignedRealAccess().getHyphenMinusKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            this_REAL_LIT_2=(Token)match(input,RULE_REAL_LIT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_REAL_LIT_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_REAL_LIT_2, grammarAccess.getSignedRealAccess().getREAL_LITTerminalRuleCall_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignedReal"


    // $ANTLR start "entryRuleNumericRangeTerm"
    // InternalGumboParser.g:3696:1: entryRuleNumericRangeTerm returns [EObject current=null] : iv_ruleNumericRangeTerm= ruleNumericRangeTerm EOF ;
    public final EObject entryRuleNumericRangeTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericRangeTerm = null;


        try {
            // InternalGumboParser.g:3696:57: (iv_ruleNumericRangeTerm= ruleNumericRangeTerm EOF )
            // InternalGumboParser.g:3697:2: iv_ruleNumericRangeTerm= ruleNumericRangeTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericRangeTermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNumericRangeTerm=ruleNumericRangeTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericRangeTerm; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumericRangeTerm"


    // $ANTLR start "ruleNumericRangeTerm"
    // InternalGumboParser.g:3703:1: ruleNumericRangeTerm returns [EObject current=null] : ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )? ) ;
    public final EObject ruleNumericRangeTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_minimum_0_0 = null;

        EObject lv_maximum_2_0 = null;

        EObject lv_delta_4_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:3709:2: ( ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )? ) )
            // InternalGumboParser.g:3710:2: ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )? )
            {
            // InternalGumboParser.g:3710:2: ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )? )
            // InternalGumboParser.g:3711:3: ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )?
            {
            // InternalGumboParser.g:3711:3: ( (lv_minimum_0_0= ruleNumAlt ) )
            // InternalGumboParser.g:3712:4: (lv_minimum_0_0= ruleNumAlt )
            {
            // InternalGumboParser.g:3712:4: (lv_minimum_0_0= ruleNumAlt )
            // InternalGumboParser.g:3713:5: lv_minimum_0_0= ruleNumAlt
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNumericRangeTermAccess().getMinimumNumAltParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_49);
            lv_minimum_0_0=ruleNumAlt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNumericRangeTermRule());
              					}
              					set(
              						current,
              						"minimum",
              						lv_minimum_0_0,
              						"org.osate.xtext.aadl2.properties.Properties.NumAlt");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,FullStopFullStop,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNumericRangeTermAccess().getFullStopFullStopKeyword_1());
              		
            }
            // InternalGumboParser.g:3734:3: ( (lv_maximum_2_0= ruleNumAlt ) )
            // InternalGumboParser.g:3735:4: (lv_maximum_2_0= ruleNumAlt )
            {
            // InternalGumboParser.g:3735:4: (lv_maximum_2_0= ruleNumAlt )
            // InternalGumboParser.g:3736:5: lv_maximum_2_0= ruleNumAlt
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNumericRangeTermAccess().getMaximumNumAltParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_50);
            lv_maximum_2_0=ruleNumAlt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNumericRangeTermRule());
              					}
              					set(
              						current,
              						"maximum",
              						lv_maximum_2_0,
              						"org.osate.xtext.aadl2.properties.Properties.NumAlt");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumboParser.g:3753:3: (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==Delta) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalGumboParser.g:3754:4: otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) )
                    {
                    otherlv_3=(Token)match(input,Delta,FollowSets000.FOLLOW_47); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getNumericRangeTermAccess().getDeltaKeyword_3_0());
                      			
                    }
                    // InternalGumboParser.g:3758:4: ( (lv_delta_4_0= ruleNumAlt ) )
                    // InternalGumboParser.g:3759:5: (lv_delta_4_0= ruleNumAlt )
                    {
                    // InternalGumboParser.g:3759:5: (lv_delta_4_0= ruleNumAlt )
                    // InternalGumboParser.g:3760:6: lv_delta_4_0= ruleNumAlt
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNumericRangeTermAccess().getDeltaNumAltParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_delta_4_0=ruleNumAlt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNumericRangeTermRule());
                      						}
                      						set(
                      							current,
                      							"delta",
                      							lv_delta_4_0,
                      							"org.osate.xtext.aadl2.properties.Properties.NumAlt");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumericRangeTerm"


    // $ANTLR start "entryRuleNumAlt"
    // InternalGumboParser.g:3782:1: entryRuleNumAlt returns [EObject current=null] : iv_ruleNumAlt= ruleNumAlt EOF ;
    public final EObject entryRuleNumAlt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumAlt = null;


        try {
            // InternalGumboParser.g:3782:47: (iv_ruleNumAlt= ruleNumAlt EOF )
            // InternalGumboParser.g:3783:2: iv_ruleNumAlt= ruleNumAlt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumAltRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNumAlt=ruleNumAlt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumAlt; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumAlt"


    // $ANTLR start "ruleNumAlt"
    // InternalGumboParser.g:3789:1: ruleNumAlt returns [EObject current=null] : (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue ) ;
    public final EObject ruleNumAlt() throws RecognitionException {
        EObject current = null;

        EObject this_RealTerm_0 = null;

        EObject this_IntegerTerm_1 = null;

        EObject this_SignedConstant_2 = null;

        EObject this_ConstantValue_3 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:3795:2: ( (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue ) )
            // InternalGumboParser.g:3796:2: (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue )
            {
            // InternalGumboParser.g:3796:2: (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue )
            int alt51=4;
            switch ( input.LA(1) ) {
            case PlusSign:
                {
                switch ( input.LA(2) ) {
                case RULE_REAL_LIT:
                    {
                    alt51=1;
                    }
                    break;
                case RULE_INTEGER_LIT:
                    {
                    alt51=2;
                    }
                    break;
                case RULE_ID:
                    {
                    alt51=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 1, input);

                    throw nvae;
                }

                }
                break;
            case HyphenMinus:
                {
                switch ( input.LA(2) ) {
                case RULE_REAL_LIT:
                    {
                    alt51=1;
                    }
                    break;
                case RULE_INTEGER_LIT:
                    {
                    alt51=2;
                    }
                    break;
                case RULE_ID:
                    {
                    alt51=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 2, input);

                    throw nvae;
                }

                }
                break;
            case RULE_REAL_LIT:
                {
                alt51=1;
                }
                break;
            case RULE_INTEGER_LIT:
                {
                alt51=2;
                }
                break;
            case RULE_ID:
                {
                alt51=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // InternalGumboParser.g:3797:3: this_RealTerm_0= ruleRealTerm
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNumAltAccess().getRealTermParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_RealTerm_0=ruleRealTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RealTerm_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:3806:3: this_IntegerTerm_1= ruleIntegerTerm
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNumAltAccess().getIntegerTermParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_IntegerTerm_1=ruleIntegerTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IntegerTerm_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGumboParser.g:3815:3: this_SignedConstant_2= ruleSignedConstant
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNumAltAccess().getSignedConstantParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_SignedConstant_2=ruleSignedConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SignedConstant_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGumboParser.g:3824:3: this_ConstantValue_3= ruleConstantValue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNumAltAccess().getConstantValueParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ConstantValue_3=ruleConstantValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ConstantValue_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumAlt"


    // $ANTLR start "entryRuleAppliesToKeywords"
    // InternalGumboParser.g:3836:1: entryRuleAppliesToKeywords returns [String current=null] : iv_ruleAppliesToKeywords= ruleAppliesToKeywords EOF ;
    public final String entryRuleAppliesToKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAppliesToKeywords = null;


        try {
            // InternalGumboParser.g:3836:57: (iv_ruleAppliesToKeywords= ruleAppliesToKeywords EOF )
            // InternalGumboParser.g:3837:2: iv_ruleAppliesToKeywords= ruleAppliesToKeywords EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAppliesToKeywordsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAppliesToKeywords=ruleAppliesToKeywords();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAppliesToKeywords.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAppliesToKeywords"


    // $ANTLR start "ruleAppliesToKeywords"
    // InternalGumboParser.g:3843:1: ruleAppliesToKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Applies kw= To ) ;
    public final AntlrDatatypeRuleToken ruleAppliesToKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumboParser.g:3849:2: ( (kw= Applies kw= To ) )
            // InternalGumboParser.g:3850:2: (kw= Applies kw= To )
            {
            // InternalGumboParser.g:3850:2: (kw= Applies kw= To )
            // InternalGumboParser.g:3851:3: kw= Applies kw= To
            {
            kw=(Token)match(input,Applies,FollowSets000.FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getAppliesToKeywordsAccess().getAppliesKeyword_0());
              		
            }
            kw=(Token)match(input,To,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getAppliesToKeywordsAccess().getToKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAppliesToKeywords"


    // $ANTLR start "entryRuleInBindingKeywords"
    // InternalGumboParser.g:3865:1: entryRuleInBindingKeywords returns [String current=null] : iv_ruleInBindingKeywords= ruleInBindingKeywords EOF ;
    public final String entryRuleInBindingKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInBindingKeywords = null;


        try {
            // InternalGumboParser.g:3865:57: (iv_ruleInBindingKeywords= ruleInBindingKeywords EOF )
            // InternalGumboParser.g:3866:2: iv_ruleInBindingKeywords= ruleInBindingKeywords EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInBindingKeywordsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInBindingKeywords=ruleInBindingKeywords();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInBindingKeywords.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInBindingKeywords"


    // $ANTLR start "ruleInBindingKeywords"
    // InternalGumboParser.g:3872:1: ruleInBindingKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= In kw= Binding ) ;
    public final AntlrDatatypeRuleToken ruleInBindingKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumboParser.g:3878:2: ( (kw= In kw= Binding ) )
            // InternalGumboParser.g:3879:2: (kw= In kw= Binding )
            {
            // InternalGumboParser.g:3879:2: (kw= In kw= Binding )
            // InternalGumboParser.g:3880:3: kw= In kw= Binding
            {
            kw=(Token)match(input,In,FollowSets000.FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getInBindingKeywordsAccess().getInKeyword_0());
              		
            }
            kw=(Token)match(input,Binding,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getInBindingKeywordsAccess().getBindingKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInBindingKeywords"


    // $ANTLR start "entryRuleInModesKeywords"
    // InternalGumboParser.g:3894:1: entryRuleInModesKeywords returns [String current=null] : iv_ruleInModesKeywords= ruleInModesKeywords EOF ;
    public final String entryRuleInModesKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInModesKeywords = null;


        try {
            // InternalGumboParser.g:3894:55: (iv_ruleInModesKeywords= ruleInModesKeywords EOF )
            // InternalGumboParser.g:3895:2: iv_ruleInModesKeywords= ruleInModesKeywords EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInModesKeywordsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInModesKeywords=ruleInModesKeywords();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInModesKeywords.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInModesKeywords"


    // $ANTLR start "ruleInModesKeywords"
    // InternalGumboParser.g:3901:1: ruleInModesKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= In kw= Modes ) ;
    public final AntlrDatatypeRuleToken ruleInModesKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumboParser.g:3907:2: ( (kw= In kw= Modes ) )
            // InternalGumboParser.g:3908:2: (kw= In kw= Modes )
            {
            // InternalGumboParser.g:3908:2: (kw= In kw= Modes )
            // InternalGumboParser.g:3909:3: kw= In kw= Modes
            {
            kw=(Token)match(input,In,FollowSets000.FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getInModesKeywordsAccess().getInKeyword_0());
              		
            }
            kw=(Token)match(input,Modes,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getInModesKeywordsAccess().getModesKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInModesKeywords"


    // $ANTLR start "entryRuleINTVALUE"
    // InternalGumboParser.g:3923:1: entryRuleINTVALUE returns [String current=null] : iv_ruleINTVALUE= ruleINTVALUE EOF ;
    public final String entryRuleINTVALUE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTVALUE = null;


        try {
            // InternalGumboParser.g:3923:48: (iv_ruleINTVALUE= ruleINTVALUE EOF )
            // InternalGumboParser.g:3924:2: iv_ruleINTVALUE= ruleINTVALUE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getINTVALUERule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleINTVALUE=ruleINTVALUE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleINTVALUE.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleINTVALUE"


    // $ANTLR start "ruleINTVALUE"
    // InternalGumboParser.g:3930:1: ruleINTVALUE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INTEGER_LIT_0= RULE_INTEGER_LIT ;
    public final AntlrDatatypeRuleToken ruleINTVALUE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INTEGER_LIT_0=null;


        	enterRule();

        try {
            // InternalGumboParser.g:3936:2: (this_INTEGER_LIT_0= RULE_INTEGER_LIT )
            // InternalGumboParser.g:3937:2: this_INTEGER_LIT_0= RULE_INTEGER_LIT
            {
            this_INTEGER_LIT_0=(Token)match(input,RULE_INTEGER_LIT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INTEGER_LIT_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_INTEGER_LIT_0, grammarAccess.getINTVALUEAccess().getINTEGER_LITTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleINTVALUE"


    // $ANTLR start "entryRuleQPREF"
    // InternalGumboParser.g:3947:1: entryRuleQPREF returns [String current=null] : iv_ruleQPREF= ruleQPREF EOF ;
    public final String entryRuleQPREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQPREF = null;


        try {
            // InternalGumboParser.g:3947:45: (iv_ruleQPREF= ruleQPREF EOF )
            // InternalGumboParser.g:3948:2: iv_ruleQPREF= ruleQPREF EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQPREFRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleQPREF=ruleQPREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQPREF.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQPREF"


    // $ANTLR start "ruleQPREF"
    // InternalGumboParser.g:3954:1: ruleQPREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleQPREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalGumboParser.g:3960:2: ( (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )? ) )
            // InternalGumboParser.g:3961:2: (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )? )
            {
            // InternalGumboParser.g:3961:2: (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )? )
            // InternalGumboParser.g:3962:3: this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQPREFAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalGumboParser.g:3969:3: (kw= ColonColon this_ID_2= RULE_ID )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==ColonColon) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalGumboParser.g:3970:4: kw= ColonColon this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,ColonColon,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getQPREFAccess().getColonColonKeyword_1_0());
                      			
                    }
                    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ID_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_2, grammarAccess.getQPREFAccess().getIDTerminalRuleCall_1_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQPREF"


    // $ANTLR start "entryRuleQCREF"
    // InternalGumboParser.g:3987:1: entryRuleQCREF returns [String current=null] : iv_ruleQCREF= ruleQCREF EOF ;
    public final String entryRuleQCREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQCREF = null;


        try {
            // InternalGumboParser.g:3987:45: (iv_ruleQCREF= ruleQCREF EOF )
            // InternalGumboParser.g:3988:2: iv_ruleQCREF= ruleQCREF EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQCREFRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleQCREF=ruleQCREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQCREF.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQCREF"


    // $ANTLR start "ruleQCREF"
    // InternalGumboParser.g:3994:1: ruleQCREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleQCREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;


        	enterRule();

        try {
            // InternalGumboParser.g:4000:2: ( ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? ) )
            // InternalGumboParser.g:4001:2: ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? )
            {
            // InternalGumboParser.g:4001:2: ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? )
            // InternalGumboParser.g:4002:3: (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )?
            {
            // InternalGumboParser.g:4002:3: (this_ID_0= RULE_ID kw= ColonColon )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==RULE_ID) ) {
                    int LA53_1 = input.LA(2);

                    if ( (LA53_1==ColonColon) ) {
                        alt53=1;
                    }


                }


                switch (alt53) {
            	case 1 :
            	    // InternalGumboParser.g:4003:4: this_ID_0= RULE_ID kw= ColonColon
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_55); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_0);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_0, grammarAccess.getQCREFAccess().getIDTerminalRuleCall_0_0());
            	      			
            	    }
            	    kw=(Token)match(input,ColonColon,FollowSets000.FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQCREFAccess().getColonColonKeyword_0_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_2, grammarAccess.getQCREFAccess().getIDTerminalRuleCall_1());
              		
            }
            // InternalGumboParser.g:4023:3: (kw= FullStop this_ID_4= RULE_ID )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==FullStop) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalGumboParser.g:4024:4: kw= FullStop this_ID_4= RULE_ID
                    {
                    kw=(Token)match(input,FullStop,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getQCREFAccess().getFullStopKeyword_2_0());
                      			
                    }
                    this_ID_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ID_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_4, grammarAccess.getQCREFAccess().getIDTerminalRuleCall_2_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQCREF"


    // $ANTLR start "entryRuleSTAR"
    // InternalGumboParser.g:4041:1: entryRuleSTAR returns [String current=null] : iv_ruleSTAR= ruleSTAR EOF ;
    public final String entryRuleSTAR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSTAR = null;


        try {
            // InternalGumboParser.g:4041:44: (iv_ruleSTAR= ruleSTAR EOF )
            // InternalGumboParser.g:4042:2: iv_ruleSTAR= ruleSTAR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSTARRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSTAR=ruleSTAR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSTAR.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSTAR"


    // $ANTLR start "ruleSTAR"
    // InternalGumboParser.g:4048:1: ruleSTAR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= Asterisk ;
    public final AntlrDatatypeRuleToken ruleSTAR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumboParser.g:4054:2: (kw= Asterisk )
            // InternalGumboParser.g:4055:2: kw= Asterisk
            {
            kw=(Token)match(input,Asterisk,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getSTARAccess().getAsteriskKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSTAR"

    // $ANTLR start synpred1_InternalGumboParser
    public final void synpred1_InternalGumboParser_fragment() throws RecognitionException {   
        // InternalGumboParser.g:1052:5: ( ( () ( EqualsSignGreaterThanSign | Implies ) ) )
        // InternalGumboParser.g:1052:6: ( () ( EqualsSignGreaterThanSign | Implies ) )
        {
        // InternalGumboParser.g:1052:6: ( () ( EqualsSignGreaterThanSign | Implies ) )
        // InternalGumboParser.g:1053:6: () ( EqualsSignGreaterThanSign | Implies )
        {
        // InternalGumboParser.g:1053:6: ()
        // InternalGumboParser.g:1054:6: 
        {
        }

        if ( input.LA(1)==Implies||input.LA(1)==EqualsSignGreaterThanSign ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }
    }
    // $ANTLR end synpred1_InternalGumboParser

    // $ANTLR start synpred2_InternalGumboParser
    public final void synpred2_InternalGumboParser_fragment() throws RecognitionException {   
        // InternalGumboParser.g:1132:5: ( ( () ( ( LessThanSignEqualsSignGreaterThanSign ) ) ) )
        // InternalGumboParser.g:1132:6: ( () ( ( LessThanSignEqualsSignGreaterThanSign ) ) )
        {
        // InternalGumboParser.g:1132:6: ( () ( ( LessThanSignEqualsSignGreaterThanSign ) ) )
        // InternalGumboParser.g:1133:6: () ( ( LessThanSignEqualsSignGreaterThanSign ) )
        {
        // InternalGumboParser.g:1133:6: ()
        // InternalGumboParser.g:1134:6: 
        {
        }

        // InternalGumboParser.g:1135:6: ( ( LessThanSignEqualsSignGreaterThanSign ) )
        // InternalGumboParser.g:1136:7: ( LessThanSignEqualsSignGreaterThanSign )
        {
        // InternalGumboParser.g:1136:7: ( LessThanSignEqualsSignGreaterThanSign )
        // InternalGumboParser.g:1137:8: LessThanSignEqualsSignGreaterThanSign
        {
        match(input,LessThanSignEqualsSignGreaterThanSign,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalGumboParser

    // $ANTLR start synpred3_InternalGumboParser
    public final void synpred3_InternalGumboParser_fragment() throws RecognitionException {   
        // InternalGumboParser.g:1215:5: ( ( () ( ( ( Or ) ) | ( ( Orelse ) ) ) ) )
        // InternalGumboParser.g:1215:6: ( () ( ( ( Or ) ) | ( ( Orelse ) ) ) )
        {
        // InternalGumboParser.g:1215:6: ( () ( ( ( Or ) ) | ( ( Orelse ) ) ) )
        // InternalGumboParser.g:1216:6: () ( ( ( Or ) ) | ( ( Orelse ) ) )
        {
        // InternalGumboParser.g:1216:6: ()
        // InternalGumboParser.g:1217:6: 
        {
        }

        // InternalGumboParser.g:1218:6: ( ( ( Or ) ) | ( ( Orelse ) ) )
        int alt55=2;
        int LA55_0 = input.LA(1);

        if ( (LA55_0==Or) ) {
            alt55=1;
        }
        else if ( (LA55_0==Orelse) ) {
            alt55=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 55, 0, input);

            throw nvae;
        }
        switch (alt55) {
            case 1 :
                // InternalGumboParser.g:1219:7: ( ( Or ) )
                {
                // InternalGumboParser.g:1219:7: ( ( Or ) )
                // InternalGumboParser.g:1220:8: ( Or )
                {
                // InternalGumboParser.g:1220:8: ( Or )
                // InternalGumboParser.g:1221:9: Or
                {
                match(input,Or,FollowSets000.FOLLOW_2); if (state.failed) return ;

                }


                }


                }
                break;
            case 2 :
                // InternalGumboParser.g:1225:7: ( ( Orelse ) )
                {
                // InternalGumboParser.g:1225:7: ( ( Orelse ) )
                // InternalGumboParser.g:1226:8: ( Orelse )
                {
                // InternalGumboParser.g:1226:8: ( Orelse )
                // InternalGumboParser.g:1227:9: Orelse
                {
                match(input,Orelse,FollowSets000.FOLLOW_2); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred3_InternalGumboParser

    // $ANTLR start synpred4_InternalGumboParser
    public final void synpred4_InternalGumboParser_fragment() throws RecognitionException {   
        // InternalGumboParser.g:1323:5: ( ( () ( ( ( And ) ) | ( ( Andthen ) ) ) ) )
        // InternalGumboParser.g:1323:6: ( () ( ( ( And ) ) | ( ( Andthen ) ) ) )
        {
        // InternalGumboParser.g:1323:6: ( () ( ( ( And ) ) | ( ( Andthen ) ) ) )
        // InternalGumboParser.g:1324:6: () ( ( ( And ) ) | ( ( Andthen ) ) )
        {
        // InternalGumboParser.g:1324:6: ()
        // InternalGumboParser.g:1325:6: 
        {
        }

        // InternalGumboParser.g:1326:6: ( ( ( And ) ) | ( ( Andthen ) ) )
        int alt56=2;
        int LA56_0 = input.LA(1);

        if ( (LA56_0==And) ) {
            alt56=1;
        }
        else if ( (LA56_0==Andthen) ) {
            alt56=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 56, 0, input);

            throw nvae;
        }
        switch (alt56) {
            case 1 :
                // InternalGumboParser.g:1327:7: ( ( And ) )
                {
                // InternalGumboParser.g:1327:7: ( ( And ) )
                // InternalGumboParser.g:1328:8: ( And )
                {
                // InternalGumboParser.g:1328:8: ( And )
                // InternalGumboParser.g:1329:9: And
                {
                match(input,And,FollowSets000.FOLLOW_2); if (state.failed) return ;

                }


                }


                }
                break;
            case 2 :
                // InternalGumboParser.g:1333:7: ( ( Andthen ) )
                {
                // InternalGumboParser.g:1333:7: ( ( Andthen ) )
                // InternalGumboParser.g:1334:8: ( Andthen )
                {
                // InternalGumboParser.g:1334:8: ( Andthen )
                // InternalGumboParser.g:1335:9: Andthen
                {
                match(input,Andthen,FollowSets000.FOLLOW_2); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred4_InternalGumboParser

    // $ANTLR start synpred5_InternalGumboParser
    public final void synpred5_InternalGumboParser_fragment() throws RecognitionException {   
        // InternalGumboParser.g:1485:5: ( ( () ( ( ruleRelationalOp ) ) ) )
        // InternalGumboParser.g:1485:6: ( () ( ( ruleRelationalOp ) ) )
        {
        // InternalGumboParser.g:1485:6: ( () ( ( ruleRelationalOp ) ) )
        // InternalGumboParser.g:1486:6: () ( ( ruleRelationalOp ) )
        {
        // InternalGumboParser.g:1486:6: ()
        // InternalGumboParser.g:1487:6: 
        {
        }

        // InternalGumboParser.g:1488:6: ( ( ruleRelationalOp ) )
        // InternalGumboParser.g:1489:7: ( ruleRelationalOp )
        {
        // InternalGumboParser.g:1489:7: ( ruleRelationalOp )
        // InternalGumboParser.g:1490:8: ruleRelationalOp
        {
        pushFollow(FollowSets000.FOLLOW_2);
        ruleRelationalOp();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred5_InternalGumboParser

    // $ANTLR start synpred6_InternalGumboParser
    public final void synpred6_InternalGumboParser_fragment() throws RecognitionException {   
        // InternalGumboParser.g:1573:5: ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )
        // InternalGumboParser.g:1573:6: ( () ( ( ( PlusSign | HyphenMinus ) ) ) )
        {
        // InternalGumboParser.g:1573:6: ( () ( ( ( PlusSign | HyphenMinus ) ) ) )
        // InternalGumboParser.g:1574:6: () ( ( ( PlusSign | HyphenMinus ) ) )
        {
        // InternalGumboParser.g:1574:6: ()
        // InternalGumboParser.g:1575:6: 
        {
        }

        // InternalGumboParser.g:1576:6: ( ( ( PlusSign | HyphenMinus ) ) )
        // InternalGumboParser.g:1577:7: ( ( PlusSign | HyphenMinus ) )
        {
        // InternalGumboParser.g:1577:7: ( ( PlusSign | HyphenMinus ) )
        // InternalGumboParser.g:1578:8: ( PlusSign | HyphenMinus )
        {
        if ( input.LA(1)==PlusSign||input.LA(1)==HyphenMinus ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalGumboParser

    // $ANTLR start synpred7_InternalGumboParser
    public final void synpred7_InternalGumboParser_fragment() throws RecognitionException {   
        // InternalGumboParser.g:1673:5: ( ( () ( ( ( Asterisk | Solidus | PercentSign ) ) ) ) )
        // InternalGumboParser.g:1673:6: ( () ( ( ( Asterisk | Solidus | PercentSign ) ) ) )
        {
        // InternalGumboParser.g:1673:6: ( () ( ( ( Asterisk | Solidus | PercentSign ) ) ) )
        // InternalGumboParser.g:1674:6: () ( ( ( Asterisk | Solidus | PercentSign ) ) )
        {
        // InternalGumboParser.g:1674:6: ()
        // InternalGumboParser.g:1675:6: 
        {
        }

        // InternalGumboParser.g:1676:6: ( ( ( Asterisk | Solidus | PercentSign ) ) )
        // InternalGumboParser.g:1677:7: ( ( Asterisk | Solidus | PercentSign ) )
        {
        // InternalGumboParser.g:1677:7: ( ( Asterisk | Solidus | PercentSign ) )
        // InternalGumboParser.g:1678:8: ( Asterisk | Solidus | PercentSign )
        {
        if ( input.LA(1)==PercentSign||input.LA(1)==Asterisk||input.LA(1)==Solidus ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalGumboParser

    // $ANTLR start synpred8_InternalGumboParser
    public final void synpred8_InternalGumboParser_fragment() throws RecognitionException {   
        // InternalGumboParser.g:1786:5: ( ( () ( ( CircumflexAccent ) ) ) )
        // InternalGumboParser.g:1786:6: ( () ( ( CircumflexAccent ) ) )
        {
        // InternalGumboParser.g:1786:6: ( () ( ( CircumflexAccent ) ) )
        // InternalGumboParser.g:1787:6: () ( ( CircumflexAccent ) )
        {
        // InternalGumboParser.g:1787:6: ()
        // InternalGumboParser.g:1788:6: 
        {
        }

        // InternalGumboParser.g:1789:6: ( ( CircumflexAccent ) )
        // InternalGumboParser.g:1790:7: ( CircumflexAccent )
        {
        // InternalGumboParser.g:1790:7: ( CircumflexAccent )
        // InternalGumboParser.g:1791:8: CircumflexAccent
        {
        match(input,CircumflexAccent,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalGumboParser

    // $ANTLR start synpred9_InternalGumboParser
    public final void synpred9_InternalGumboParser_fragment() throws RecognitionException {   
        // InternalGumboParser.g:2004:5: ( ( () Enum LeftParenthesis ) )
        // InternalGumboParser.g:2004:6: ( () Enum LeftParenthesis )
        {
        // InternalGumboParser.g:2004:6: ( () Enum LeftParenthesis )
        // InternalGumboParser.g:2005:6: () Enum LeftParenthesis
        {
        // InternalGumboParser.g:2005:6: ()
        // InternalGumboParser.g:2006:6: 
        {
        }

        match(input,Enum,FollowSets000.FOLLOW_31); if (state.failed) return ;
        match(input,LeftParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalGumboParser

    // Delegated rules

    public final boolean synpred3_InternalGumboParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalGumboParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalGumboParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalGumboParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalGumboParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalGumboParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalGumboParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalGumboParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalGumboParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalGumboParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalGumboParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalGumboParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalGumboParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalGumboParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalGumboParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalGumboParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalGumboParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalGumboParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA28 dfa28 = new DFA28(this);
    protected DFA37 dfa37 = new DFA37(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\24\11\uffff";
    static final String dfa_3s = "\1\107\11\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String dfa_5s = "\1\0\11\uffff}>";
    static final String[] dfa_6s = {
            "\1\6\1\7\4\uffff\1\3\1\2\1\10\1\6\6\uffff\1\1\12\uffff\1\11\25\uffff\1\5\1\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1941:2: ( ( () otherlv_1= Var ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= Port ( (lv_port_5_0= ruleFeatureElement ) ) ) | ( ( ( ( () Enum LeftParenthesis ) )=> ( () otherlv_7= Enum otherlv_8= LeftParenthesis ) ) ( ( ruleQCREF ) ) otherlv_10= Comma ( (otherlv_11= RULE_ID ) ) otherlv_12= RightParenthesis ) | ( () ( (lv_value_14_0= RULE_INTEGER_LIT ) ) ) | ( () ( (lv_val_16_0= RULE_REAL_LIT ) ) ) | ( () ( (lv_val_18_0= ruleBooleanLiteral ) ) ) | ( () otherlv_20= Floor otherlv_21= LeftParenthesis ( (lv_expr_22_0= ruleExpr ) ) otherlv_23= RightParenthesis ) | ( () otherlv_25= Real otherlv_26= LeftParenthesis ( (lv_expr_27_0= ruleExpr ) ) otherlv_28= RightParenthesis ) | (otherlv_29= LeftParenthesis this_Expr_30= ruleExpr otherlv_31= RightParenthesis ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_0 = input.LA(1);

                         
                        int index28_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA28_0==Var) ) {s = 1;}

                        else if ( (LA28_0==Port) ) {s = 2;}

                        else if ( (LA28_0==Enum) && (synpred9_InternalGumboParser())) {s = 3;}

                        else if ( (LA28_0==RULE_INTEGER_LIT) ) {s = 4;}

                        else if ( (LA28_0==RULE_REAL_LIT) ) {s = 5;}

                        else if ( (LA28_0==False||LA28_0==True) ) {s = 6;}

                        else if ( (LA28_0==Floor) ) {s = 7;}

                        else if ( (LA28_0==Real) ) {s = 8;}

                        else if ( (LA28_0==LeftParenthesis) ) {s = 9;}

                         
                        input.seek(index28_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\25\uffff";
    static final String dfa_8s = "\10\uffff\1\17\1\21\1\23\3\uffff\1\17\1\uffff\1\21\3\uffff\1\23";
    static final String dfa_9s = "\1\5\5\uffff\2\105\3\14\3\uffff\1\14\1\uffff\1\14\1\uffff\1\112\1\uffff\1\14";
    static final String dfa_10s = "\1\112\5\uffff\4\112\1\70\3\uffff\1\70\1\uffff\1\70\1\uffff\1\112\1\uffff\1\70";
    static final String dfa_11s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\5\uffff\1\11\1\12\1\6\1\uffff\1\7\1\uffff\1\10\1\uffff\1\13\1\uffff";
    static final String dfa_12s = "\25\uffff}>";
    static final String[] dfa_13s = {
            "\1\3\3\uffff\1\2\4\uffff\1\4\5\uffff\1\14\10\uffff\1\14\21\uffff\1\13\2\uffff\1\6\1\uffff\1\7\7\uffff\1\1\10\uffff\1\10\1\uffff\1\11\1\uffff\1\5\1\12",
            "",
            "",
            "",
            "",
            "",
            "\1\10\1\uffff\1\11\2\uffff\1\15",
            "\1\10\1\uffff\1\11\2\uffff\1\15",
            "\1\17\30\uffff\1\15\5\uffff\1\17\4\uffff\1\17\2\uffff\1\17\4\uffff\1\17\21\uffff\1\16",
            "\1\21\30\uffff\1\15\5\uffff\1\21\4\uffff\1\21\2\uffff\1\21\4\uffff\1\21\21\uffff\1\20",
            "\1\23\30\uffff\1\15\1\22\4\uffff\1\23\4\uffff\1\23\2\uffff\1\23\4\uffff\1\23",
            "",
            "",
            "",
            "\1\17\30\uffff\1\15\5\uffff\1\17\4\uffff\1\17\2\uffff\1\17\4\uffff\1\17",
            "",
            "\1\21\30\uffff\1\15\5\uffff\1\21\4\uffff\1\21\2\uffff\1\21\4\uffff\1\21",
            "",
            "\1\24",
            "",
            "\1\23\30\uffff\1\15\5\uffff\1\23\4\uffff\1\23\2\uffff\1\23\4\uffff\1\23"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "2666:2: (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000040D2L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004052L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004042L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x001080183C300000L,0x00000000000000A0L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000020100L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000020102L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000020000008002L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000100000040002L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000802L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0E00058000000002L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0014000000000002L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0042400000000002L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x4000000000000002L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020040000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x1014800020104620L,0x00000000000006A0L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0108080000001000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0108080000000000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0009000000000000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000400L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x1015800020104620L,0x00000000000006A0L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x1020000000000002L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x2000002000000000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0014000000000000L,0x00000000000004A0L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0020000000000002L});
    }


}