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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Integration", "Classifier", "Initialize", "Invariants", "Functions", "Guarantee", "Reference", "Constant", "Modifies", "Requires", "Andthen", "Applies", "Binding", "Compute", "Ensures", "Implies", "Library", "Memoize", "Assume", "Orelse", "Return", "Strict", "Some", "Delta", "False", "Floor", "Gumbo", "Modes", "Reads", "State", "All", "Case", "Enum", "Real", "Spec", "True", "PlusSignEqualsSignGreaterThanSign", "FullStopFullStopLessThanSign", "LessThanSignEqualsSignGreaterThanSign", "And", "For", "Inv", "Mut", "Not", "Var", "FullStopFullStop", "ColonColon", "ColonEqualsSign", "LessThanSignEqualsSign", "LessThanSignGreaterThanSign", "EqualsSignGreaterThanSign", "GreaterThanSignEqualsSign", "In", "Or", "To", "PercentSign", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "FullStop", "Solidus", "Colon", "Semicolon", "LessThanSign", "EqualsSign", "GreaterThanSign", "QuestionMark", "LeftSquareBracket", "RightSquareBracket", "CircumflexAccent", "LeftCurlyBracket", "RightCurlyBracket", "ForAll", "ThereExists", "RULE_OPSYM", "RULE_IDF", "RULE_OP", "RULE_LETTER", "RULE_DIGIT", "RULE_SL_COMMENT", "RULE_EXPONENT", "RULE_INT_EXPONENT", "RULE_REAL_LIT", "RULE_BASED_INTEGER", "RULE_INTEGER_LIT", "RULE_EXTENDED_DIGIT", "RULE_STRING", "RULE_ID", "RULE_WS"
    };
    public static final int Enum=36;
    public static final int LessThanSignGreaterThanSign=53;
    public static final int Or=57;
    public static final int EqualsSignGreaterThanSign=54;
    public static final int Var=48;
    public static final int False=28;
    public static final int Initialize=6;
    public static final int Invariants=7;
    public static final int LessThanSign=70;
    public static final int PlusSignEqualsSignGreaterThanSign=40;
    public static final int LeftParenthesis=60;
    public static final int RULE_OP=83;
    public static final int GreaterThanSign=72;
    public static final int RULE_ID=94;
    public static final int RULE_DIGIT=85;
    public static final int GreaterThanSignEqualsSign=55;
    public static final int ColonColon=50;
    public static final int Some=26;
    public static final int PlusSign=63;
    public static final int LeftSquareBracket=74;
    public static final int In=56;
    public static final int ThereExists=80;
    public static final int RULE_REAL_LIT=89;
    public static final int LessThanSignEqualsSignGreaterThanSign=42;
    public static final int Classifier=5;
    public static final int Case=35;
    public static final int Comma=64;
    public static final int HyphenMinus=65;
    public static final int Guarantee=9;
    public static final int LessThanSignEqualsSign=52;
    public static final int Solidus=67;
    public static final int RightCurlyBracket=78;
    public static final int Modes=31;
    public static final int FullStop=66;
    public static final int Reference=10;
    public static final int Functions=8;
    public static final int Semicolon=69;
    public static final int RULE_LETTER=84;
    public static final int RULE_EXPONENT=87;
    public static final int Delta=27;
    public static final int QuestionMark=73;
    public static final int Memoize=21;
    public static final int RULE_EXTENDED_DIGIT=92;
    public static final int All=34;
    public static final int True=39;
    public static final int RULE_INT_EXPONENT=88;
    public static final int PercentSign=59;
    public static final int Implies=19;
    public static final int FullStopFullStop=49;
    public static final int Real=37;
    public static final int Ensures=18;
    public static final int To=58;
    public static final int Applies=15;
    public static final int RULE_BASED_INTEGER=90;
    public static final int RightSquareBracket=75;
    public static final int Binding=16;
    public static final int Requires=13;
    public static final int For=44;
    public static final int RightParenthesis=61;
    public static final int ColonEqualsSign=51;
    public static final int Mut=46;
    public static final int Not=47;
    public static final int Gumbo=30;
    public static final int Andthen=14;
    public static final int State=33;
    public static final int And=43;
    public static final int Assume=22;
    public static final int Library=20;
    public static final int RULE_INTEGER_LIT=91;
    public static final int Constant=11;
    public static final int RULE_STRING=93;
    public static final int Reads=32;
    public static final int RULE_SL_COMMENT=86;
    public static final int Inv=45;
    public static final int EqualsSign=71;
    public static final int Modifies=12;
    public static final int Strict=25;
    public static final int Colon=68;
    public static final int EOF=-1;
    public static final int Asterisk=62;
    public static final int Floor=29;
    public static final int Integration=4;
    public static final int RULE_OPSYM=81;
    public static final int Return=24;
    public static final int RULE_WS=95;
    public static final int LeftCurlyBracket=77;
    public static final int CircumflexAccent=76;
    public static final int FullStopFullStopLessThanSign=41;
    public static final int RULE_IDF=82;
    public static final int Compute=17;
    public static final int Orelse=23;
    public static final int Spec=38;
    public static final int ForAll=79;

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
    // InternalGumboParser.g:182:1: ruleSpecSection returns [EObject current=null] : ( ( (lv_state_0_0= ruleState ) )? ( (lv_functions_1_0= ruleFunctions ) )? ( (lv_invariants_2_0= ruleInvariants ) )? ( (lv_integration_3_0= ruleIntegration ) )? ( (lv_initialize_4_0= ruleInitialize ) )? ( (lv_compute_5_0= ruleCompute ) )? ) ;
    public final EObject ruleSpecSection() throws RecognitionException {
        EObject current = null;

        EObject lv_state_0_0 = null;

        EObject lv_functions_1_0 = null;

        EObject lv_invariants_2_0 = null;

        EObject lv_integration_3_0 = null;

        EObject lv_initialize_4_0 = null;

        EObject lv_compute_5_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:188:2: ( ( ( (lv_state_0_0= ruleState ) )? ( (lv_functions_1_0= ruleFunctions ) )? ( (lv_invariants_2_0= ruleInvariants ) )? ( (lv_integration_3_0= ruleIntegration ) )? ( (lv_initialize_4_0= ruleInitialize ) )? ( (lv_compute_5_0= ruleCompute ) )? ) )
            // InternalGumboParser.g:189:2: ( ( (lv_state_0_0= ruleState ) )? ( (lv_functions_1_0= ruleFunctions ) )? ( (lv_invariants_2_0= ruleInvariants ) )? ( (lv_integration_3_0= ruleIntegration ) )? ( (lv_initialize_4_0= ruleInitialize ) )? ( (lv_compute_5_0= ruleCompute ) )? )
            {
            // InternalGumboParser.g:189:2: ( ( (lv_state_0_0= ruleState ) )? ( (lv_functions_1_0= ruleFunctions ) )? ( (lv_invariants_2_0= ruleInvariants ) )? ( (lv_integration_3_0= ruleIntegration ) )? ( (lv_initialize_4_0= ruleInitialize ) )? ( (lv_compute_5_0= ruleCompute ) )? )
            // InternalGumboParser.g:190:3: ( (lv_state_0_0= ruleState ) )? ( (lv_functions_1_0= ruleFunctions ) )? ( (lv_invariants_2_0= ruleInvariants ) )? ( (lv_integration_3_0= ruleIntegration ) )? ( (lv_initialize_4_0= ruleInitialize ) )? ( (lv_compute_5_0= ruleCompute ) )?
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

            // InternalGumboParser.g:209:3: ( (lv_functions_1_0= ruleFunctions ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==Functions) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGumboParser.g:210:4: (lv_functions_1_0= ruleFunctions )
                    {
                    // InternalGumboParser.g:210:4: (lv_functions_1_0= ruleFunctions )
                    // InternalGumboParser.g:211:5: lv_functions_1_0= ruleFunctions
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSpecSectionAccess().getFunctionsFunctionsParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_functions_1_0=ruleFunctions();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSpecSectionRule());
                      					}
                      					set(
                      						current,
                      						"functions",
                      						lv_functions_1_0,
                      						"org.sireum.aadl.gumbo.Gumbo.Functions");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalGumboParser.g:228:3: ( (lv_invariants_2_0= ruleInvariants ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Invariants) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalGumboParser.g:229:4: (lv_invariants_2_0= ruleInvariants )
                    {
                    // InternalGumboParser.g:229:4: (lv_invariants_2_0= ruleInvariants )
                    // InternalGumboParser.g:230:5: lv_invariants_2_0= ruleInvariants
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSpecSectionAccess().getInvariantsInvariantsParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_invariants_2_0=ruleInvariants();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSpecSectionRule());
                      					}
                      					set(
                      						current,
                      						"invariants",
                      						lv_invariants_2_0,
                      						"org.sireum.aadl.gumbo.Gumbo.Invariants");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalGumboParser.g:247:3: ( (lv_integration_3_0= ruleIntegration ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Integration) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalGumboParser.g:248:4: (lv_integration_3_0= ruleIntegration )
                    {
                    // InternalGumboParser.g:248:4: (lv_integration_3_0= ruleIntegration )
                    // InternalGumboParser.g:249:5: lv_integration_3_0= ruleIntegration
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSpecSectionAccess().getIntegrationIntegrationParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_8);
                    lv_integration_3_0=ruleIntegration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSpecSectionRule());
                      					}
                      					set(
                      						current,
                      						"integration",
                      						lv_integration_3_0,
                      						"org.sireum.aadl.gumbo.Gumbo.Integration");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalGumboParser.g:266:3: ( (lv_initialize_4_0= ruleInitialize ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Initialize) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGumboParser.g:267:4: (lv_initialize_4_0= ruleInitialize )
                    {
                    // InternalGumboParser.g:267:4: (lv_initialize_4_0= ruleInitialize )
                    // InternalGumboParser.g:268:5: lv_initialize_4_0= ruleInitialize
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSpecSectionAccess().getInitializeInitializeParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_9);
                    lv_initialize_4_0=ruleInitialize();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSpecSectionRule());
                      					}
                      					set(
                      						current,
                      						"initialize",
                      						lv_initialize_4_0,
                      						"org.sireum.aadl.gumbo.Gumbo.Initialize");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalGumboParser.g:285:3: ( (lv_compute_5_0= ruleCompute ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Compute) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGumboParser.g:286:4: (lv_compute_5_0= ruleCompute )
                    {
                    // InternalGumboParser.g:286:4: (lv_compute_5_0= ruleCompute )
                    // InternalGumboParser.g:287:5: lv_compute_5_0= ruleCompute
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSpecSectionAccess().getComputeComputeParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_compute_5_0=ruleCompute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSpecSectionRule());
                      					}
                      					set(
                      						current,
                      						"compute",
                      						lv_compute_5_0,
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
    // InternalGumboParser.g:308:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalGumboParser.g:308:46: (iv_ruleState= ruleState EOF )
            // InternalGumboParser.g:309:2: iv_ruleState= ruleState EOF
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
    // InternalGumboParser.g:315:1: ruleState returns [EObject current=null] : (otherlv_0= State ( (lv_decls_1_0= ruleStateVarDecl ) )+ ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_decls_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:321:2: ( (otherlv_0= State ( (lv_decls_1_0= ruleStateVarDecl ) )+ ) )
            // InternalGumboParser.g:322:2: (otherlv_0= State ( (lv_decls_1_0= ruleStateVarDecl ) )+ )
            {
            // InternalGumboParser.g:322:2: (otherlv_0= State ( (lv_decls_1_0= ruleStateVarDecl ) )+ )
            // InternalGumboParser.g:323:3: otherlv_0= State ( (lv_decls_1_0= ruleStateVarDecl ) )+
            {
            otherlv_0=(Token)match(input,State,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
              		
            }
            // InternalGumboParser.g:327:3: ( (lv_decls_1_0= ruleStateVarDecl ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGumboParser.g:328:4: (lv_decls_1_0= ruleStateVarDecl )
            	    {
            	    // InternalGumboParser.g:328:4: (lv_decls_1_0= ruleStateVarDecl )
            	    // InternalGumboParser.g:329:5: lv_decls_1_0= ruleStateVarDecl
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getStateAccess().getDeclsStateVarDeclParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_11);
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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleStateVarDecl"
    // InternalGumboParser.g:350:1: entryRuleStateVarDecl returns [EObject current=null] : iv_ruleStateVarDecl= ruleStateVarDecl EOF ;
    public final EObject entryRuleStateVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateVarDecl = null;


        try {
            // InternalGumboParser.g:350:53: (iv_ruleStateVarDecl= ruleStateVarDecl EOF )
            // InternalGumboParser.g:351:2: iv_ruleStateVarDecl= ruleStateVarDecl EOF
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
    // InternalGumboParser.g:357:1: ruleStateVarDecl returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ) ( ( ruleQCREF ) ) otherlv_3= Semicolon ) ;
    public final EObject ruleStateVarDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalGumboParser.g:363:2: ( ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ) ( ( ruleQCREF ) ) otherlv_3= Semicolon ) )
            // InternalGumboParser.g:364:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ) ( ( ruleQCREF ) ) otherlv_3= Semicolon )
            {
            // InternalGumboParser.g:364:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ) ( ( ruleQCREF ) ) otherlv_3= Semicolon )
            // InternalGumboParser.g:365:3: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ) ( ( ruleQCREF ) ) otherlv_3= Semicolon
            {
            // InternalGumboParser.g:365:3: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon )
            // InternalGumboParser.g:366:4: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon
            {
            // InternalGumboParser.g:366:4: ( (lv_name_0_0= RULE_ID ) )
            // InternalGumboParser.g:367:5: (lv_name_0_0= RULE_ID )
            {
            // InternalGumboParser.g:367:5: (lv_name_0_0= RULE_ID )
            // InternalGumboParser.g:368:6: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_12); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,Colon,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getStateVarDeclAccess().getColonKeyword_0_1());
              			
            }

            }

            // InternalGumboParser.g:389:3: ( ( ruleQCREF ) )
            // InternalGumboParser.g:390:4: ( ruleQCREF )
            {
            // InternalGumboParser.g:390:4: ( ruleQCREF )
            // InternalGumboParser.g:391:5: ruleQCREF
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getStateVarDeclRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStateVarDeclAccess().getTypeNameDataSubcomponentTypeCrossReference_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_13);
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
    // InternalGumboParser.g:413:1: entryRuleInvariants returns [EObject current=null] : iv_ruleInvariants= ruleInvariants EOF ;
    public final EObject entryRuleInvariants() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariants = null;


        try {
            // InternalGumboParser.g:413:51: (iv_ruleInvariants= ruleInvariants EOF )
            // InternalGumboParser.g:414:2: iv_ruleInvariants= ruleInvariants EOF
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
    // InternalGumboParser.g:420:1: ruleInvariants returns [EObject current=null] : (otherlv_0= Invariants ( (lv_specs_1_0= ruleInvSpec ) )+ ) ;
    public final EObject ruleInvariants() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_specs_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:426:2: ( (otherlv_0= Invariants ( (lv_specs_1_0= ruleInvSpec ) )+ ) )
            // InternalGumboParser.g:427:2: (otherlv_0= Invariants ( (lv_specs_1_0= ruleInvSpec ) )+ )
            {
            // InternalGumboParser.g:427:2: (otherlv_0= Invariants ( (lv_specs_1_0= ruleInvSpec ) )+ )
            // InternalGumboParser.g:428:3: otherlv_0= Invariants ( (lv_specs_1_0= ruleInvSpec ) )+
            {
            otherlv_0=(Token)match(input,Invariants,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInvariantsAccess().getInvariantsKeyword_0());
              		
            }
            // InternalGumboParser.g:432:3: ( (lv_specs_1_0= ruleInvSpec ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Inv) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGumboParser.g:433:4: (lv_specs_1_0= ruleInvSpec )
            	    {
            	    // InternalGumboParser.g:433:4: (lv_specs_1_0= ruleInvSpec )
            	    // InternalGumboParser.g:434:5: lv_specs_1_0= ruleInvSpec
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getInvariantsAccess().getSpecsInvSpecParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_15);
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
    // $ANTLR end "ruleInvariants"


    // $ANTLR start "entryRuleInvSpec"
    // InternalGumboParser.g:455:1: entryRuleInvSpec returns [EObject current=null] : iv_ruleInvSpec= ruleInvSpec EOF ;
    public final EObject entryRuleInvSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvSpec = null;


        try {
            // InternalGumboParser.g:455:48: (iv_ruleInvSpec= ruleInvSpec EOF )
            // InternalGumboParser.g:456:2: iv_ruleInvSpec= ruleInvSpec EOF
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
    // InternalGumboParser.g:462:1: ruleInvSpec returns [EObject current=null] : (otherlv_0= Inv ( (lv_displayName_1_0= RULE_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon ) ;
    public final EObject ruleInvSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_displayName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expr_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:468:2: ( (otherlv_0= Inv ( (lv_displayName_1_0= RULE_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon ) )
            // InternalGumboParser.g:469:2: (otherlv_0= Inv ( (lv_displayName_1_0= RULE_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon )
            {
            // InternalGumboParser.g:469:2: (otherlv_0= Inv ( (lv_displayName_1_0= RULE_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon )
            // InternalGumboParser.g:470:3: otherlv_0= Inv ( (lv_displayName_1_0= RULE_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon
            {
            otherlv_0=(Token)match(input,Inv,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInvSpecAccess().getInvKeyword_0());
              		
            }
            // InternalGumboParser.g:474:3: ( (lv_displayName_1_0= RULE_STRING ) )
            // InternalGumboParser.g:475:4: (lv_displayName_1_0= RULE_STRING )
            {
            // InternalGumboParser.g:475:4: (lv_displayName_1_0= RULE_STRING )
            // InternalGumboParser.g:476:5: lv_displayName_1_0= RULE_STRING
            {
            lv_displayName_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,Colon,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getInvSpecAccess().getColonKeyword_2());
              		
            }
            // InternalGumboParser.g:496:3: ( (lv_expr_3_0= ruleExpr ) )
            // InternalGumboParser.g:497:4: (lv_expr_3_0= ruleExpr )
            {
            // InternalGumboParser.g:497:4: (lv_expr_3_0= ruleExpr )
            // InternalGumboParser.g:498:5: lv_expr_3_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInvSpecAccess().getExprExprParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_13);
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
    // InternalGumboParser.g:523:1: entryRuleIntegration returns [EObject current=null] : iv_ruleIntegration= ruleIntegration EOF ;
    public final EObject entryRuleIntegration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegration = null;


        try {
            // InternalGumboParser.g:523:52: (iv_ruleIntegration= ruleIntegration EOF )
            // InternalGumboParser.g:524:2: iv_ruleIntegration= ruleIntegration EOF
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
    // InternalGumboParser.g:530:1: ruleIntegration returns [EObject current=null] : (otherlv_0= Integration ( (lv_specs_1_0= ruleSpecStatement ) )+ ) ;
    public final EObject ruleIntegration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_specs_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:536:2: ( (otherlv_0= Integration ( (lv_specs_1_0= ruleSpecStatement ) )+ ) )
            // InternalGumboParser.g:537:2: (otherlv_0= Integration ( (lv_specs_1_0= ruleSpecStatement ) )+ )
            {
            // InternalGumboParser.g:537:2: (otherlv_0= Integration ( (lv_specs_1_0= ruleSpecStatement ) )+ )
            // InternalGumboParser.g:538:3: otherlv_0= Integration ( (lv_specs_1_0= ruleSpecStatement ) )+
            {
            otherlv_0=(Token)match(input,Integration,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIntegrationAccess().getIntegrationKeyword_0());
              		
            }
            // InternalGumboParser.g:542:3: ( (lv_specs_1_0= ruleSpecStatement ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Guarantee||LA9_0==Assume) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGumboParser.g:543:4: (lv_specs_1_0= ruleSpecStatement )
            	    {
            	    // InternalGumboParser.g:543:4: (lv_specs_1_0= ruleSpecStatement )
            	    // InternalGumboParser.g:544:5: lv_specs_1_0= ruleSpecStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getIntegrationAccess().getSpecsSpecStatementParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_19);
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
    // $ANTLR end "ruleIntegration"


    // $ANTLR start "entryRuleInitialize"
    // InternalGumboParser.g:565:1: entryRuleInitialize returns [EObject current=null] : iv_ruleInitialize= ruleInitialize EOF ;
    public final EObject entryRuleInitialize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialize = null;


        try {
            // InternalGumboParser.g:565:51: (iv_ruleInitialize= ruleInitialize EOF )
            // InternalGumboParser.g:566:2: iv_ruleInitialize= ruleInitialize EOF
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
    // InternalGumboParser.g:572:1: ruleInitialize returns [EObject current=null] : (otherlv_0= Initialize ( (lv_specs_1_0= ruleInitializeSpecStatement ) )+ ) ;
    public final EObject ruleInitialize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_specs_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:578:2: ( (otherlv_0= Initialize ( (lv_specs_1_0= ruleInitializeSpecStatement ) )+ ) )
            // InternalGumboParser.g:579:2: (otherlv_0= Initialize ( (lv_specs_1_0= ruleInitializeSpecStatement ) )+ )
            {
            // InternalGumboParser.g:579:2: (otherlv_0= Initialize ( (lv_specs_1_0= ruleInitializeSpecStatement ) )+ )
            // InternalGumboParser.g:580:3: otherlv_0= Initialize ( (lv_specs_1_0= ruleInitializeSpecStatement ) )+
            {
            otherlv_0=(Token)match(input,Initialize,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInitializeAccess().getInitializeKeyword_0());
              		
            }
            // InternalGumboParser.g:584:3: ( (lv_specs_1_0= ruleInitializeSpecStatement ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Guarantee) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGumboParser.g:585:4: (lv_specs_1_0= ruleInitializeSpecStatement )
            	    {
            	    // InternalGumboParser.g:585:4: (lv_specs_1_0= ruleInitializeSpecStatement )
            	    // InternalGumboParser.g:586:5: lv_specs_1_0= ruleInitializeSpecStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getInitializeAccess().getSpecsInitializeSpecStatementParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_19);
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
    // $ANTLR end "ruleInitialize"


    // $ANTLR start "entryRuleInitializeSpecStatement"
    // InternalGumboParser.g:607:1: entryRuleInitializeSpecStatement returns [EObject current=null] : iv_ruleInitializeSpecStatement= ruleInitializeSpecStatement EOF ;
    public final EObject entryRuleInitializeSpecStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitializeSpecStatement = null;


        try {
            // InternalGumboParser.g:607:64: (iv_ruleInitializeSpecStatement= ruleInitializeSpecStatement EOF )
            // InternalGumboParser.g:608:2: iv_ruleInitializeSpecStatement= ruleInitializeSpecStatement EOF
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
    // InternalGumboParser.g:614:1: ruleInitializeSpecStatement returns [EObject current=null] : this_GuaranteeStatement_0= ruleGuaranteeStatement ;
    public final EObject ruleInitializeSpecStatement() throws RecognitionException {
        EObject current = null;

        EObject this_GuaranteeStatement_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:620:2: (this_GuaranteeStatement_0= ruleGuaranteeStatement )
            // InternalGumboParser.g:621:2: this_GuaranteeStatement_0= ruleGuaranteeStatement
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
    // InternalGumboParser.g:632:1: entryRuleCompute returns [EObject current=null] : iv_ruleCompute= ruleCompute EOF ;
    public final EObject entryRuleCompute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompute = null;


        try {
            // InternalGumboParser.g:632:48: (iv_ruleCompute= ruleCompute EOF )
            // InternalGumboParser.g:633:2: iv_ruleCompute= ruleCompute EOF
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
    // InternalGumboParser.g:639:1: ruleCompute returns [EObject current=null] : (otherlv_0= Compute ( (lv_cases_1_0= ruleCaseStatementClause ) )+ ) ;
    public final EObject ruleCompute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_cases_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:645:2: ( (otherlv_0= Compute ( (lv_cases_1_0= ruleCaseStatementClause ) )+ ) )
            // InternalGumboParser.g:646:2: (otherlv_0= Compute ( (lv_cases_1_0= ruleCaseStatementClause ) )+ )
            {
            // InternalGumboParser.g:646:2: (otherlv_0= Compute ( (lv_cases_1_0= ruleCaseStatementClause ) )+ )
            // InternalGumboParser.g:647:3: otherlv_0= Compute ( (lv_cases_1_0= ruleCaseStatementClause ) )+
            {
            otherlv_0=(Token)match(input,Compute,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getComputeAccess().getComputeKeyword_0());
              		
            }
            // InternalGumboParser.g:651:3: ( (lv_cases_1_0= ruleCaseStatementClause ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==Case) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGumboParser.g:652:4: (lv_cases_1_0= ruleCaseStatementClause )
            	    {
            	    // InternalGumboParser.g:652:4: (lv_cases_1_0= ruleCaseStatementClause )
            	    // InternalGumboParser.g:653:5: lv_cases_1_0= ruleCaseStatementClause
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getComputeAccess().getCasesCaseStatementClauseParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_21);
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
            	    if ( cnt11 >= 1 ) break loop11;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
    // InternalGumboParser.g:674:1: entryRuleCaseStatementClause returns [EObject current=null] : iv_ruleCaseStatementClause= ruleCaseStatementClause EOF ;
    public final EObject entryRuleCaseStatementClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseStatementClause = null;


        try {
            // InternalGumboParser.g:674:60: (iv_ruleCaseStatementClause= ruleCaseStatementClause EOF )
            // InternalGumboParser.g:675:2: iv_ruleCaseStatementClause= ruleCaseStatementClause EOF
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
    // InternalGumboParser.g:681:1: ruleCaseStatementClause returns [EObject current=null] : (otherlv_0= Case ( (lv_displayName_1_0= RULE_STRING ) ) otherlv_2= Colon ( (lv_assumeStatement_3_0= ruleAnonAssumeStatement ) ) ( (lv_guaranteeStatement_4_0= ruleAnonGuaranteeStatement ) ) ) ;
    public final EObject ruleCaseStatementClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_displayName_1_0=null;
        Token otherlv_2=null;
        EObject lv_assumeStatement_3_0 = null;

        EObject lv_guaranteeStatement_4_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:687:2: ( (otherlv_0= Case ( (lv_displayName_1_0= RULE_STRING ) ) otherlv_2= Colon ( (lv_assumeStatement_3_0= ruleAnonAssumeStatement ) ) ( (lv_guaranteeStatement_4_0= ruleAnonGuaranteeStatement ) ) ) )
            // InternalGumboParser.g:688:2: (otherlv_0= Case ( (lv_displayName_1_0= RULE_STRING ) ) otherlv_2= Colon ( (lv_assumeStatement_3_0= ruleAnonAssumeStatement ) ) ( (lv_guaranteeStatement_4_0= ruleAnonGuaranteeStatement ) ) )
            {
            // InternalGumboParser.g:688:2: (otherlv_0= Case ( (lv_displayName_1_0= RULE_STRING ) ) otherlv_2= Colon ( (lv_assumeStatement_3_0= ruleAnonAssumeStatement ) ) ( (lv_guaranteeStatement_4_0= ruleAnonGuaranteeStatement ) ) )
            // InternalGumboParser.g:689:3: otherlv_0= Case ( (lv_displayName_1_0= RULE_STRING ) ) otherlv_2= Colon ( (lv_assumeStatement_3_0= ruleAnonAssumeStatement ) ) ( (lv_guaranteeStatement_4_0= ruleAnonGuaranteeStatement ) )
            {
            otherlv_0=(Token)match(input,Case,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCaseStatementClauseAccess().getCaseKeyword_0());
              		
            }
            // InternalGumboParser.g:693:3: ( (lv_displayName_1_0= RULE_STRING ) )
            // InternalGumboParser.g:694:4: (lv_displayName_1_0= RULE_STRING )
            {
            // InternalGumboParser.g:694:4: (lv_displayName_1_0= RULE_STRING )
            // InternalGumboParser.g:695:5: lv_displayName_1_0= RULE_STRING
            {
            lv_displayName_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,Colon,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getCaseStatementClauseAccess().getColonKeyword_2());
              		
            }
            // InternalGumboParser.g:715:3: ( (lv_assumeStatement_3_0= ruleAnonAssumeStatement ) )
            // InternalGumboParser.g:716:4: (lv_assumeStatement_3_0= ruleAnonAssumeStatement )
            {
            // InternalGumboParser.g:716:4: (lv_assumeStatement_3_0= ruleAnonAssumeStatement )
            // InternalGumboParser.g:717:5: lv_assumeStatement_3_0= ruleAnonAssumeStatement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCaseStatementClauseAccess().getAssumeStatementAnonAssumeStatementParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_23);
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

            // InternalGumboParser.g:734:3: ( (lv_guaranteeStatement_4_0= ruleAnonGuaranteeStatement ) )
            // InternalGumboParser.g:735:4: (lv_guaranteeStatement_4_0= ruleAnonGuaranteeStatement )
            {
            // InternalGumboParser.g:735:4: (lv_guaranteeStatement_4_0= ruleAnonGuaranteeStatement )
            // InternalGumboParser.g:736:5: lv_guaranteeStatement_4_0= ruleAnonGuaranteeStatement
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
    // InternalGumboParser.g:757:1: entryRuleSpecStatement returns [EObject current=null] : iv_ruleSpecStatement= ruleSpecStatement EOF ;
    public final EObject entryRuleSpecStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecStatement = null;


        try {
            // InternalGumboParser.g:757:54: (iv_ruleSpecStatement= ruleSpecStatement EOF )
            // InternalGumboParser.g:758:2: iv_ruleSpecStatement= ruleSpecStatement EOF
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
    // InternalGumboParser.g:764:1: ruleSpecStatement returns [EObject current=null] : (this_AssumeStatement_0= ruleAssumeStatement | this_GuaranteeStatement_1= ruleGuaranteeStatement ) ;
    public final EObject ruleSpecStatement() throws RecognitionException {
        EObject current = null;

        EObject this_AssumeStatement_0 = null;

        EObject this_GuaranteeStatement_1 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:770:2: ( (this_AssumeStatement_0= ruleAssumeStatement | this_GuaranteeStatement_1= ruleGuaranteeStatement ) )
            // InternalGumboParser.g:771:2: (this_AssumeStatement_0= ruleAssumeStatement | this_GuaranteeStatement_1= ruleGuaranteeStatement )
            {
            // InternalGumboParser.g:771:2: (this_AssumeStatement_0= ruleAssumeStatement | this_GuaranteeStatement_1= ruleGuaranteeStatement )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Assume) ) {
                alt12=1;
            }
            else if ( (LA12_0==Guarantee) ) {
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
                    // InternalGumboParser.g:772:3: this_AssumeStatement_0= ruleAssumeStatement
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
                    // InternalGumboParser.g:781:3: this_GuaranteeStatement_1= ruleGuaranteeStatement
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
    // InternalGumboParser.g:793:1: entryRuleAssumeStatement returns [EObject current=null] : iv_ruleAssumeStatement= ruleAssumeStatement EOF ;
    public final EObject entryRuleAssumeStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssumeStatement = null;


        try {
            // InternalGumboParser.g:793:56: (iv_ruleAssumeStatement= ruleAssumeStatement EOF )
            // InternalGumboParser.g:794:2: iv_ruleAssumeStatement= ruleAssumeStatement EOF
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
    // InternalGumboParser.g:800:1: ruleAssumeStatement returns [EObject current=null] : (otherlv_0= Assume ( (lv_displayName_1_0= RULE_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon ) ;
    public final EObject ruleAssumeStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_displayName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expr_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:806:2: ( (otherlv_0= Assume ( (lv_displayName_1_0= RULE_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon ) )
            // InternalGumboParser.g:807:2: (otherlv_0= Assume ( (lv_displayName_1_0= RULE_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon )
            {
            // InternalGumboParser.g:807:2: (otherlv_0= Assume ( (lv_displayName_1_0= RULE_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon )
            // InternalGumboParser.g:808:3: otherlv_0= Assume ( (lv_displayName_1_0= RULE_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon
            {
            otherlv_0=(Token)match(input,Assume,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAssumeStatementAccess().getAssumeKeyword_0());
              		
            }
            // InternalGumboParser.g:812:3: ( (lv_displayName_1_0= RULE_STRING ) )
            // InternalGumboParser.g:813:4: (lv_displayName_1_0= RULE_STRING )
            {
            // InternalGumboParser.g:813:4: (lv_displayName_1_0= RULE_STRING )
            // InternalGumboParser.g:814:5: lv_displayName_1_0= RULE_STRING
            {
            lv_displayName_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,Colon,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAssumeStatementAccess().getColonKeyword_2());
              		
            }
            // InternalGumboParser.g:834:3: ( (lv_expr_3_0= ruleExpr ) )
            // InternalGumboParser.g:835:4: (lv_expr_3_0= ruleExpr )
            {
            // InternalGumboParser.g:835:4: (lv_expr_3_0= ruleExpr )
            // InternalGumboParser.g:836:5: lv_expr_3_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssumeStatementAccess().getExprExprParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_13);
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
    // InternalGumboParser.g:861:1: entryRuleAnonAssumeStatement returns [EObject current=null] : iv_ruleAnonAssumeStatement= ruleAnonAssumeStatement EOF ;
    public final EObject entryRuleAnonAssumeStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnonAssumeStatement = null;


        try {
            // InternalGumboParser.g:861:60: (iv_ruleAnonAssumeStatement= ruleAnonAssumeStatement EOF )
            // InternalGumboParser.g:862:2: iv_ruleAnonAssumeStatement= ruleAnonAssumeStatement EOF
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
    // InternalGumboParser.g:868:1: ruleAnonAssumeStatement returns [EObject current=null] : (otherlv_0= Assume ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon ) ;
    public final EObject ruleAnonAssumeStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:874:2: ( (otherlv_0= Assume ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon ) )
            // InternalGumboParser.g:875:2: (otherlv_0= Assume ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon )
            {
            // InternalGumboParser.g:875:2: (otherlv_0= Assume ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon )
            // InternalGumboParser.g:876:3: otherlv_0= Assume ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon
            {
            otherlv_0=(Token)match(input,Assume,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAnonAssumeStatementAccess().getAssumeKeyword_0());
              		
            }
            // InternalGumboParser.g:880:3: ( (lv_expr_1_0= ruleExpr ) )
            // InternalGumboParser.g:881:4: (lv_expr_1_0= ruleExpr )
            {
            // InternalGumboParser.g:881:4: (lv_expr_1_0= ruleExpr )
            // InternalGumboParser.g:882:5: lv_expr_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAnonAssumeStatementAccess().getExprExprParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_13);
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
    // InternalGumboParser.g:907:1: entryRuleGuaranteeStatement returns [EObject current=null] : iv_ruleGuaranteeStatement= ruleGuaranteeStatement EOF ;
    public final EObject entryRuleGuaranteeStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuaranteeStatement = null;


        try {
            // InternalGumboParser.g:907:59: (iv_ruleGuaranteeStatement= ruleGuaranteeStatement EOF )
            // InternalGumboParser.g:908:2: iv_ruleGuaranteeStatement= ruleGuaranteeStatement EOF
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
    // InternalGumboParser.g:914:1: ruleGuaranteeStatement returns [EObject current=null] : (otherlv_0= Guarantee ( (lv_displayName_1_0= RULE_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon ) ;
    public final EObject ruleGuaranteeStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_displayName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expr_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:920:2: ( (otherlv_0= Guarantee ( (lv_displayName_1_0= RULE_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon ) )
            // InternalGumboParser.g:921:2: (otherlv_0= Guarantee ( (lv_displayName_1_0= RULE_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon )
            {
            // InternalGumboParser.g:921:2: (otherlv_0= Guarantee ( (lv_displayName_1_0= RULE_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon )
            // InternalGumboParser.g:922:3: otherlv_0= Guarantee ( (lv_displayName_1_0= RULE_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon
            {
            otherlv_0=(Token)match(input,Guarantee,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGuaranteeStatementAccess().getGuaranteeKeyword_0());
              		
            }
            // InternalGumboParser.g:926:3: ( (lv_displayName_1_0= RULE_STRING ) )
            // InternalGumboParser.g:927:4: (lv_displayName_1_0= RULE_STRING )
            {
            // InternalGumboParser.g:927:4: (lv_displayName_1_0= RULE_STRING )
            // InternalGumboParser.g:928:5: lv_displayName_1_0= RULE_STRING
            {
            lv_displayName_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,Colon,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGuaranteeStatementAccess().getColonKeyword_2());
              		
            }
            // InternalGumboParser.g:948:3: ( (lv_expr_3_0= ruleExpr ) )
            // InternalGumboParser.g:949:4: (lv_expr_3_0= ruleExpr )
            {
            // InternalGumboParser.g:949:4: (lv_expr_3_0= ruleExpr )
            // InternalGumboParser.g:950:5: lv_expr_3_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGuaranteeStatementAccess().getExprExprParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_13);
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
    // InternalGumboParser.g:975:1: entryRuleAnonGuaranteeStatement returns [EObject current=null] : iv_ruleAnonGuaranteeStatement= ruleAnonGuaranteeStatement EOF ;
    public final EObject entryRuleAnonGuaranteeStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnonGuaranteeStatement = null;


        try {
            // InternalGumboParser.g:975:63: (iv_ruleAnonGuaranteeStatement= ruleAnonGuaranteeStatement EOF )
            // InternalGumboParser.g:976:2: iv_ruleAnonGuaranteeStatement= ruleAnonGuaranteeStatement EOF
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
    // InternalGumboParser.g:982:1: ruleAnonGuaranteeStatement returns [EObject current=null] : (otherlv_0= Guarantee ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon ) ;
    public final EObject ruleAnonGuaranteeStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:988:2: ( (otherlv_0= Guarantee ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon ) )
            // InternalGumboParser.g:989:2: (otherlv_0= Guarantee ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon )
            {
            // InternalGumboParser.g:989:2: (otherlv_0= Guarantee ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon )
            // InternalGumboParser.g:990:3: otherlv_0= Guarantee ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon
            {
            otherlv_0=(Token)match(input,Guarantee,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAnonGuaranteeStatementAccess().getGuaranteeKeyword_0());
              		
            }
            // InternalGumboParser.g:994:3: ( (lv_expr_1_0= ruleExpr ) )
            // InternalGumboParser.g:995:4: (lv_expr_1_0= ruleExpr )
            {
            // InternalGumboParser.g:995:4: (lv_expr_1_0= ruleExpr )
            // InternalGumboParser.g:996:5: lv_expr_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAnonGuaranteeStatementAccess().getExprExprParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_13);
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
    // InternalGumboParser.g:1021:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // InternalGumboParser.g:1021:45: (iv_ruleExpr= ruleExpr EOF )
            // InternalGumboParser.g:1022:2: iv_ruleExpr= ruleExpr EOF
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
    // InternalGumboParser.g:1028:1: ruleExpr returns [EObject current=null] : this_ImpliesExpr_0= ruleImpliesExpr ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject this_ImpliesExpr_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1034:2: (this_ImpliesExpr_0= ruleImpliesExpr )
            // InternalGumboParser.g:1035:2: this_ImpliesExpr_0= ruleImpliesExpr
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
    // InternalGumboParser.g:1046:1: entryRuleImpliesExpr returns [EObject current=null] : iv_ruleImpliesExpr= ruleImpliesExpr EOF ;
    public final EObject entryRuleImpliesExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpliesExpr = null;


        try {
            // InternalGumboParser.g:1046:52: (iv_ruleImpliesExpr= ruleImpliesExpr EOF )
            // InternalGumboParser.g:1047:2: iv_ruleImpliesExpr= ruleImpliesExpr EOF
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
    // InternalGumboParser.g:1053:1: ruleImpliesExpr returns [EObject current=null] : (this_EquivExpr_0= ruleEquivExpr ( ( ( ( () ( EqualsSignGreaterThanSign | Implies ) ) )=> ( () (otherlv_2= EqualsSignGreaterThanSign | otherlv_3= Implies ) ) ) ( (lv_right_4_0= ruleImpliesExpr ) ) )? ) ;
    public final EObject ruleImpliesExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_EquivExpr_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1059:2: ( (this_EquivExpr_0= ruleEquivExpr ( ( ( ( () ( EqualsSignGreaterThanSign | Implies ) ) )=> ( () (otherlv_2= EqualsSignGreaterThanSign | otherlv_3= Implies ) ) ) ( (lv_right_4_0= ruleImpliesExpr ) ) )? ) )
            // InternalGumboParser.g:1060:2: (this_EquivExpr_0= ruleEquivExpr ( ( ( ( () ( EqualsSignGreaterThanSign | Implies ) ) )=> ( () (otherlv_2= EqualsSignGreaterThanSign | otherlv_3= Implies ) ) ) ( (lv_right_4_0= ruleImpliesExpr ) ) )? )
            {
            // InternalGumboParser.g:1060:2: (this_EquivExpr_0= ruleEquivExpr ( ( ( ( () ( EqualsSignGreaterThanSign | Implies ) ) )=> ( () (otherlv_2= EqualsSignGreaterThanSign | otherlv_3= Implies ) ) ) ( (lv_right_4_0= ruleImpliesExpr ) ) )? )
            // InternalGumboParser.g:1061:3: this_EquivExpr_0= ruleEquivExpr ( ( ( ( () ( EqualsSignGreaterThanSign | Implies ) ) )=> ( () (otherlv_2= EqualsSignGreaterThanSign | otherlv_3= Implies ) ) ) ( (lv_right_4_0= ruleImpliesExpr ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getImpliesExprAccess().getEquivExprParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_24);
            this_EquivExpr_0=ruleEquivExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_EquivExpr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGumboParser.g:1069:3: ( ( ( ( () ( EqualsSignGreaterThanSign | Implies ) ) )=> ( () (otherlv_2= EqualsSignGreaterThanSign | otherlv_3= Implies ) ) ) ( (lv_right_4_0= ruleImpliesExpr ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==EqualsSignGreaterThanSign) && (synpred1_InternalGumboParser())) {
                alt14=1;
            }
            else if ( (LA14_0==Implies) && (synpred1_InternalGumboParser())) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGumboParser.g:1070:4: ( ( ( () ( EqualsSignGreaterThanSign | Implies ) ) )=> ( () (otherlv_2= EqualsSignGreaterThanSign | otherlv_3= Implies ) ) ) ( (lv_right_4_0= ruleImpliesExpr ) )
                    {
                    // InternalGumboParser.g:1070:4: ( ( ( () ( EqualsSignGreaterThanSign | Implies ) ) )=> ( () (otherlv_2= EqualsSignGreaterThanSign | otherlv_3= Implies ) ) )
                    // InternalGumboParser.g:1071:5: ( ( () ( EqualsSignGreaterThanSign | Implies ) ) )=> ( () (otherlv_2= EqualsSignGreaterThanSign | otherlv_3= Implies ) )
                    {
                    // InternalGumboParser.g:1081:5: ( () (otherlv_2= EqualsSignGreaterThanSign | otherlv_3= Implies ) )
                    // InternalGumboParser.g:1082:6: () (otherlv_2= EqualsSignGreaterThanSign | otherlv_3= Implies )
                    {
                    // InternalGumboParser.g:1082:6: ()
                    // InternalGumboParser.g:1083:7: 
                    {
                    if ( state.backtracking==0 ) {

                      							current = forceCreateModelElementAndSet(
                      								grammarAccess.getImpliesExprAccess().getBinaryExprLeftAction_1_0_0_0(),
                      								current);
                      						
                    }

                    }

                    // InternalGumboParser.g:1089:6: (otherlv_2= EqualsSignGreaterThanSign | otherlv_3= Implies )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==EqualsSignGreaterThanSign) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==Implies) ) {
                        alt13=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalGumboParser.g:1090:7: otherlv_2= EqualsSignGreaterThanSign
                            {
                            otherlv_2=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_17); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_2, grammarAccess.getImpliesExprAccess().getEqualsSignGreaterThanSignKeyword_1_0_0_1_0());
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalGumboParser.g:1095:7: otherlv_3= Implies
                            {
                            otherlv_3=(Token)match(input,Implies,FollowSets000.FOLLOW_17); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_3, grammarAccess.getImpliesExprAccess().getImpliesKeyword_1_0_0_1_1());
                              						
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalGumboParser.g:1102:4: ( (lv_right_4_0= ruleImpliesExpr ) )
                    // InternalGumboParser.g:1103:5: (lv_right_4_0= ruleImpliesExpr )
                    {
                    // InternalGumboParser.g:1103:5: (lv_right_4_0= ruleImpliesExpr )
                    // InternalGumboParser.g:1104:6: lv_right_4_0= ruleImpliesExpr
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
    // InternalGumboParser.g:1126:1: entryRuleEquivExpr returns [EObject current=null] : iv_ruleEquivExpr= ruleEquivExpr EOF ;
    public final EObject entryRuleEquivExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquivExpr = null;


        try {
            // InternalGumboParser.g:1126:50: (iv_ruleEquivExpr= ruleEquivExpr EOF )
            // InternalGumboParser.g:1127:2: iv_ruleEquivExpr= ruleEquivExpr EOF
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
    // InternalGumboParser.g:1133:1: ruleEquivExpr returns [EObject current=null] : (this_OrExpr_0= ruleOrExpr ( ( ( ( () ( ( LessThanSignEqualsSignGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0= LessThanSignEqualsSignGreaterThanSign ) ) ) ) ( (lv_right_3_0= ruleOrExpr ) ) )? ) ;
    public final EObject ruleEquivExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_OrExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1139:2: ( (this_OrExpr_0= ruleOrExpr ( ( ( ( () ( ( LessThanSignEqualsSignGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0= LessThanSignEqualsSignGreaterThanSign ) ) ) ) ( (lv_right_3_0= ruleOrExpr ) ) )? ) )
            // InternalGumboParser.g:1140:2: (this_OrExpr_0= ruleOrExpr ( ( ( ( () ( ( LessThanSignEqualsSignGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0= LessThanSignEqualsSignGreaterThanSign ) ) ) ) ( (lv_right_3_0= ruleOrExpr ) ) )? )
            {
            // InternalGumboParser.g:1140:2: (this_OrExpr_0= ruleOrExpr ( ( ( ( () ( ( LessThanSignEqualsSignGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0= LessThanSignEqualsSignGreaterThanSign ) ) ) ) ( (lv_right_3_0= ruleOrExpr ) ) )? )
            // InternalGumboParser.g:1141:3: this_OrExpr_0= ruleOrExpr ( ( ( ( () ( ( LessThanSignEqualsSignGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0= LessThanSignEqualsSignGreaterThanSign ) ) ) ) ( (lv_right_3_0= ruleOrExpr ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEquivExprAccess().getOrExprParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_25);
            this_OrExpr_0=ruleOrExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_OrExpr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGumboParser.g:1149:3: ( ( ( ( () ( ( LessThanSignEqualsSignGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0= LessThanSignEqualsSignGreaterThanSign ) ) ) ) ( (lv_right_3_0= ruleOrExpr ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==LessThanSignEqualsSignGreaterThanSign) && (synpred2_InternalGumboParser())) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGumboParser.g:1150:4: ( ( ( () ( ( LessThanSignEqualsSignGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0= LessThanSignEqualsSignGreaterThanSign ) ) ) ) ( (lv_right_3_0= ruleOrExpr ) )
                    {
                    // InternalGumboParser.g:1150:4: ( ( ( () ( ( LessThanSignEqualsSignGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0= LessThanSignEqualsSignGreaterThanSign ) ) ) )
                    // InternalGumboParser.g:1151:5: ( ( () ( ( LessThanSignEqualsSignGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0= LessThanSignEqualsSignGreaterThanSign ) ) )
                    {
                    // InternalGumboParser.g:1161:5: ( () ( (lv_op_2_0= LessThanSignEqualsSignGreaterThanSign ) ) )
                    // InternalGumboParser.g:1162:6: () ( (lv_op_2_0= LessThanSignEqualsSignGreaterThanSign ) )
                    {
                    // InternalGumboParser.g:1162:6: ()
                    // InternalGumboParser.g:1163:7: 
                    {
                    if ( state.backtracking==0 ) {

                      							current = forceCreateModelElementAndSet(
                      								grammarAccess.getEquivExprAccess().getBinaryExprLeftAction_1_0_0_0(),
                      								current);
                      						
                    }

                    }

                    // InternalGumboParser.g:1169:6: ( (lv_op_2_0= LessThanSignEqualsSignGreaterThanSign ) )
                    // InternalGumboParser.g:1170:7: (lv_op_2_0= LessThanSignEqualsSignGreaterThanSign )
                    {
                    // InternalGumboParser.g:1170:7: (lv_op_2_0= LessThanSignEqualsSignGreaterThanSign )
                    // InternalGumboParser.g:1171:8: lv_op_2_0= LessThanSignEqualsSignGreaterThanSign
                    {
                    lv_op_2_0=(Token)match(input,LessThanSignEqualsSignGreaterThanSign,FollowSets000.FOLLOW_17); if (state.failed) return current;
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

                    // InternalGumboParser.g:1185:4: ( (lv_right_3_0= ruleOrExpr ) )
                    // InternalGumboParser.g:1186:5: (lv_right_3_0= ruleOrExpr )
                    {
                    // InternalGumboParser.g:1186:5: (lv_right_3_0= ruleOrExpr )
                    // InternalGumboParser.g:1187:6: lv_right_3_0= ruleOrExpr
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
    // InternalGumboParser.g:1209:1: entryRuleOrExpr returns [EObject current=null] : iv_ruleOrExpr= ruleOrExpr EOF ;
    public final EObject entryRuleOrExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpr = null;


        try {
            // InternalGumboParser.g:1209:47: (iv_ruleOrExpr= ruleOrExpr EOF )
            // InternalGumboParser.g:1210:2: iv_ruleOrExpr= ruleOrExpr EOF
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
    // InternalGumboParser.g:1216:1: ruleOrExpr returns [EObject current=null] : (this_AndExpr_0= ruleAndExpr ( ( ( ( () ( ( ( Or ) ) | ( ( Orelse ) ) ) ) )=> ( () ( ( (lv_op_2_0= Or ) ) | ( (lv_op_3_0= Orelse ) ) ) ) ) ( (lv_right_4_0= ruleAndExpr ) ) )* ) ;
    public final EObject ruleOrExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        Token lv_op_3_0=null;
        EObject this_AndExpr_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1222:2: ( (this_AndExpr_0= ruleAndExpr ( ( ( ( () ( ( ( Or ) ) | ( ( Orelse ) ) ) ) )=> ( () ( ( (lv_op_2_0= Or ) ) | ( (lv_op_3_0= Orelse ) ) ) ) ) ( (lv_right_4_0= ruleAndExpr ) ) )* ) )
            // InternalGumboParser.g:1223:2: (this_AndExpr_0= ruleAndExpr ( ( ( ( () ( ( ( Or ) ) | ( ( Orelse ) ) ) ) )=> ( () ( ( (lv_op_2_0= Or ) ) | ( (lv_op_3_0= Orelse ) ) ) ) ) ( (lv_right_4_0= ruleAndExpr ) ) )* )
            {
            // InternalGumboParser.g:1223:2: (this_AndExpr_0= ruleAndExpr ( ( ( ( () ( ( ( Or ) ) | ( ( Orelse ) ) ) ) )=> ( () ( ( (lv_op_2_0= Or ) ) | ( (lv_op_3_0= Orelse ) ) ) ) ) ( (lv_right_4_0= ruleAndExpr ) ) )* )
            // InternalGumboParser.g:1224:3: this_AndExpr_0= ruleAndExpr ( ( ( ( () ( ( ( Or ) ) | ( ( Orelse ) ) ) ) )=> ( () ( ( (lv_op_2_0= Or ) ) | ( (lv_op_3_0= Orelse ) ) ) ) ) ( (lv_right_4_0= ruleAndExpr ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrExprAccess().getAndExprParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_26);
            this_AndExpr_0=ruleAndExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AndExpr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGumboParser.g:1232:3: ( ( ( ( () ( ( ( Or ) ) | ( ( Orelse ) ) ) ) )=> ( () ( ( (lv_op_2_0= Or ) ) | ( (lv_op_3_0= Orelse ) ) ) ) ) ( (lv_right_4_0= ruleAndExpr ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==Or) && (synpred3_InternalGumboParser())) {
                    alt17=1;
                }
                else if ( (LA17_0==Orelse) && (synpred3_InternalGumboParser())) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGumboParser.g:1233:4: ( ( ( () ( ( ( Or ) ) | ( ( Orelse ) ) ) ) )=> ( () ( ( (lv_op_2_0= Or ) ) | ( (lv_op_3_0= Orelse ) ) ) ) ) ( (lv_right_4_0= ruleAndExpr ) )
            	    {
            	    // InternalGumboParser.g:1233:4: ( ( ( () ( ( ( Or ) ) | ( ( Orelse ) ) ) ) )=> ( () ( ( (lv_op_2_0= Or ) ) | ( (lv_op_3_0= Orelse ) ) ) ) )
            	    // InternalGumboParser.g:1234:5: ( ( () ( ( ( Or ) ) | ( ( Orelse ) ) ) ) )=> ( () ( ( (lv_op_2_0= Or ) ) | ( (lv_op_3_0= Orelse ) ) ) )
            	    {
            	    // InternalGumboParser.g:1252:5: ( () ( ( (lv_op_2_0= Or ) ) | ( (lv_op_3_0= Orelse ) ) ) )
            	    // InternalGumboParser.g:1253:6: () ( ( (lv_op_2_0= Or ) ) | ( (lv_op_3_0= Orelse ) ) )
            	    {
            	    // InternalGumboParser.g:1253:6: ()
            	    // InternalGumboParser.g:1254:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getOrExprAccess().getBinaryExprLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalGumboParser.g:1260:6: ( ( (lv_op_2_0= Or ) ) | ( (lv_op_3_0= Orelse ) ) )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==Or) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==Orelse) ) {
            	        alt16=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // InternalGumboParser.g:1261:7: ( (lv_op_2_0= Or ) )
            	            {
            	            // InternalGumboParser.g:1261:7: ( (lv_op_2_0= Or ) )
            	            // InternalGumboParser.g:1262:8: (lv_op_2_0= Or )
            	            {
            	            // InternalGumboParser.g:1262:8: (lv_op_2_0= Or )
            	            // InternalGumboParser.g:1263:9: lv_op_2_0= Or
            	            {
            	            lv_op_2_0=(Token)match(input,Or,FollowSets000.FOLLOW_17); if (state.failed) return current;
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
            	            // InternalGumboParser.g:1276:7: ( (lv_op_3_0= Orelse ) )
            	            {
            	            // InternalGumboParser.g:1276:7: ( (lv_op_3_0= Orelse ) )
            	            // InternalGumboParser.g:1277:8: (lv_op_3_0= Orelse )
            	            {
            	            // InternalGumboParser.g:1277:8: (lv_op_3_0= Orelse )
            	            // InternalGumboParser.g:1278:9: lv_op_3_0= Orelse
            	            {
            	            lv_op_3_0=(Token)match(input,Orelse,FollowSets000.FOLLOW_17); if (state.failed) return current;
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

            	    // InternalGumboParser.g:1293:4: ( (lv_right_4_0= ruleAndExpr ) )
            	    // InternalGumboParser.g:1294:5: (lv_right_4_0= ruleAndExpr )
            	    {
            	    // InternalGumboParser.g:1294:5: (lv_right_4_0= ruleAndExpr )
            	    // InternalGumboParser.g:1295:6: lv_right_4_0= ruleAndExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrExprAccess().getRightAndExprParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_26);
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
            	    break loop17;
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
    // InternalGumboParser.g:1317:1: entryRuleAndExpr returns [EObject current=null] : iv_ruleAndExpr= ruleAndExpr EOF ;
    public final EObject entryRuleAndExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpr = null;


        try {
            // InternalGumboParser.g:1317:48: (iv_ruleAndExpr= ruleAndExpr EOF )
            // InternalGumboParser.g:1318:2: iv_ruleAndExpr= ruleAndExpr EOF
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
    // InternalGumboParser.g:1324:1: ruleAndExpr returns [EObject current=null] : (this_RelationalExpr_0= ruleRelationalExpr ( ( ( ( () ( ( ( And ) ) | ( ( Andthen ) ) ) ) )=> ( () ( ( (lv_op_2_0= And ) ) | ( (lv_op_3_0= Andthen ) ) ) ) ) ( (lv_right_4_0= ruleRelationalExpr ) ) )* ) ;
    public final EObject ruleAndExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        Token lv_op_3_0=null;
        EObject this_RelationalExpr_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1330:2: ( (this_RelationalExpr_0= ruleRelationalExpr ( ( ( ( () ( ( ( And ) ) | ( ( Andthen ) ) ) ) )=> ( () ( ( (lv_op_2_0= And ) ) | ( (lv_op_3_0= Andthen ) ) ) ) ) ( (lv_right_4_0= ruleRelationalExpr ) ) )* ) )
            // InternalGumboParser.g:1331:2: (this_RelationalExpr_0= ruleRelationalExpr ( ( ( ( () ( ( ( And ) ) | ( ( Andthen ) ) ) ) )=> ( () ( ( (lv_op_2_0= And ) ) | ( (lv_op_3_0= Andthen ) ) ) ) ) ( (lv_right_4_0= ruleRelationalExpr ) ) )* )
            {
            // InternalGumboParser.g:1331:2: (this_RelationalExpr_0= ruleRelationalExpr ( ( ( ( () ( ( ( And ) ) | ( ( Andthen ) ) ) ) )=> ( () ( ( (lv_op_2_0= And ) ) | ( (lv_op_3_0= Andthen ) ) ) ) ) ( (lv_right_4_0= ruleRelationalExpr ) ) )* )
            // InternalGumboParser.g:1332:3: this_RelationalExpr_0= ruleRelationalExpr ( ( ( ( () ( ( ( And ) ) | ( ( Andthen ) ) ) ) )=> ( () ( ( (lv_op_2_0= And ) ) | ( (lv_op_3_0= Andthen ) ) ) ) ) ( (lv_right_4_0= ruleRelationalExpr ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndExprAccess().getRelationalExprParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_27);
            this_RelationalExpr_0=ruleRelationalExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_RelationalExpr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGumboParser.g:1340:3: ( ( ( ( () ( ( ( And ) ) | ( ( Andthen ) ) ) ) )=> ( () ( ( (lv_op_2_0= And ) ) | ( (lv_op_3_0= Andthen ) ) ) ) ) ( (lv_right_4_0= ruleRelationalExpr ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==And) && (synpred4_InternalGumboParser())) {
                    alt19=1;
                }
                else if ( (LA19_0==Andthen) && (synpred4_InternalGumboParser())) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalGumboParser.g:1341:4: ( ( ( () ( ( ( And ) ) | ( ( Andthen ) ) ) ) )=> ( () ( ( (lv_op_2_0= And ) ) | ( (lv_op_3_0= Andthen ) ) ) ) ) ( (lv_right_4_0= ruleRelationalExpr ) )
            	    {
            	    // InternalGumboParser.g:1341:4: ( ( ( () ( ( ( And ) ) | ( ( Andthen ) ) ) ) )=> ( () ( ( (lv_op_2_0= And ) ) | ( (lv_op_3_0= Andthen ) ) ) ) )
            	    // InternalGumboParser.g:1342:5: ( ( () ( ( ( And ) ) | ( ( Andthen ) ) ) ) )=> ( () ( ( (lv_op_2_0= And ) ) | ( (lv_op_3_0= Andthen ) ) ) )
            	    {
            	    // InternalGumboParser.g:1360:5: ( () ( ( (lv_op_2_0= And ) ) | ( (lv_op_3_0= Andthen ) ) ) )
            	    // InternalGumboParser.g:1361:6: () ( ( (lv_op_2_0= And ) ) | ( (lv_op_3_0= Andthen ) ) )
            	    {
            	    // InternalGumboParser.g:1361:6: ()
            	    // InternalGumboParser.g:1362:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getAndExprAccess().getBinaryExprLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalGumboParser.g:1368:6: ( ( (lv_op_2_0= And ) ) | ( (lv_op_3_0= Andthen ) ) )
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==And) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==Andthen) ) {
            	        alt18=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalGumboParser.g:1369:7: ( (lv_op_2_0= And ) )
            	            {
            	            // InternalGumboParser.g:1369:7: ( (lv_op_2_0= And ) )
            	            // InternalGumboParser.g:1370:8: (lv_op_2_0= And )
            	            {
            	            // InternalGumboParser.g:1370:8: (lv_op_2_0= And )
            	            // InternalGumboParser.g:1371:9: lv_op_2_0= And
            	            {
            	            lv_op_2_0=(Token)match(input,And,FollowSets000.FOLLOW_17); if (state.failed) return current;
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
            	            // InternalGumboParser.g:1384:7: ( (lv_op_3_0= Andthen ) )
            	            {
            	            // InternalGumboParser.g:1384:7: ( (lv_op_3_0= Andthen ) )
            	            // InternalGumboParser.g:1385:8: (lv_op_3_0= Andthen )
            	            {
            	            // InternalGumboParser.g:1385:8: (lv_op_3_0= Andthen )
            	            // InternalGumboParser.g:1386:9: lv_op_3_0= Andthen
            	            {
            	            lv_op_3_0=(Token)match(input,Andthen,FollowSets000.FOLLOW_17); if (state.failed) return current;
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

            	    // InternalGumboParser.g:1401:4: ( (lv_right_4_0= ruleRelationalExpr ) )
            	    // InternalGumboParser.g:1402:5: (lv_right_4_0= ruleRelationalExpr )
            	    {
            	    // InternalGumboParser.g:1402:5: (lv_right_4_0= ruleRelationalExpr )
            	    // InternalGumboParser.g:1403:6: lv_right_4_0= ruleRelationalExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndExprAccess().getRightRelationalExprParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_27);
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
            	    break loop19;
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
    // InternalGumboParser.g:1425:1: entryRuleRelationalOp returns [String current=null] : iv_ruleRelationalOp= ruleRelationalOp EOF ;
    public final String entryRuleRelationalOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelationalOp = null;


        try {
            // InternalGumboParser.g:1425:52: (iv_ruleRelationalOp= ruleRelationalOp EOF )
            // InternalGumboParser.g:1426:2: iv_ruleRelationalOp= ruleRelationalOp EOF
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
    // InternalGumboParser.g:1432:1: ruleRelationalOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= LessThanSign | kw= LessThanSignEqualsSign | kw= GreaterThanSign | kw= GreaterThanSignEqualsSign | kw= EqualsSign | kw= LessThanSignGreaterThanSign ) ;
    public final AntlrDatatypeRuleToken ruleRelationalOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumboParser.g:1438:2: ( (kw= LessThanSign | kw= LessThanSignEqualsSign | kw= GreaterThanSign | kw= GreaterThanSignEqualsSign | kw= EqualsSign | kw= LessThanSignGreaterThanSign ) )
            // InternalGumboParser.g:1439:2: (kw= LessThanSign | kw= LessThanSignEqualsSign | kw= GreaterThanSign | kw= GreaterThanSignEqualsSign | kw= EqualsSign | kw= LessThanSignGreaterThanSign )
            {
            // InternalGumboParser.g:1439:2: (kw= LessThanSign | kw= LessThanSignEqualsSign | kw= GreaterThanSign | kw= GreaterThanSignEqualsSign | kw= EqualsSign | kw= LessThanSignGreaterThanSign )
            int alt20=6;
            switch ( input.LA(1) ) {
            case LessThanSign:
                {
                alt20=1;
                }
                break;
            case LessThanSignEqualsSign:
                {
                alt20=2;
                }
                break;
            case GreaterThanSign:
                {
                alt20=3;
                }
                break;
            case GreaterThanSignEqualsSign:
                {
                alt20=4;
                }
                break;
            case EqualsSign:
                {
                alt20=5;
                }
                break;
            case LessThanSignGreaterThanSign:
                {
                alt20=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalGumboParser.g:1440:3: kw= LessThanSign
                    {
                    kw=(Token)match(input,LessThanSign,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelationalOpAccess().getLessThanSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:1446:3: kw= LessThanSignEqualsSign
                    {
                    kw=(Token)match(input,LessThanSignEqualsSign,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelationalOpAccess().getLessThanSignEqualsSignKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGumboParser.g:1452:3: kw= GreaterThanSign
                    {
                    kw=(Token)match(input,GreaterThanSign,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelationalOpAccess().getGreaterThanSignKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGumboParser.g:1458:3: kw= GreaterThanSignEqualsSign
                    {
                    kw=(Token)match(input,GreaterThanSignEqualsSign,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelationalOpAccess().getGreaterThanSignEqualsSignKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGumboParser.g:1464:3: kw= EqualsSign
                    {
                    kw=(Token)match(input,EqualsSign,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelationalOpAccess().getEqualsSignKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalGumboParser.g:1470:3: kw= LessThanSignGreaterThanSign
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
    // InternalGumboParser.g:1479:1: entryRuleRelationalExpr returns [EObject current=null] : iv_ruleRelationalExpr= ruleRelationalExpr EOF ;
    public final EObject entryRuleRelationalExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpr = null;


        try {
            // InternalGumboParser.g:1479:55: (iv_ruleRelationalExpr= ruleRelationalExpr EOF )
            // InternalGumboParser.g:1480:2: iv_ruleRelationalExpr= ruleRelationalExpr EOF
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
    // InternalGumboParser.g:1486:1: ruleRelationalExpr returns [EObject current=null] : (this_AddSubExpr_0= ruleAddSubExpr ( ( ( ( () ( ( ruleRelationalOp ) ) ) )=> ( () ( (lv_op_2_0= ruleRelationalOp ) ) ) ) ( (lv_right_3_0= ruleAddSubExpr ) ) )? ) ;
    public final EObject ruleRelationalExpr() throws RecognitionException {
        EObject current = null;

        EObject this_AddSubExpr_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1492:2: ( (this_AddSubExpr_0= ruleAddSubExpr ( ( ( ( () ( ( ruleRelationalOp ) ) ) )=> ( () ( (lv_op_2_0= ruleRelationalOp ) ) ) ) ( (lv_right_3_0= ruleAddSubExpr ) ) )? ) )
            // InternalGumboParser.g:1493:2: (this_AddSubExpr_0= ruleAddSubExpr ( ( ( ( () ( ( ruleRelationalOp ) ) ) )=> ( () ( (lv_op_2_0= ruleRelationalOp ) ) ) ) ( (lv_right_3_0= ruleAddSubExpr ) ) )? )
            {
            // InternalGumboParser.g:1493:2: (this_AddSubExpr_0= ruleAddSubExpr ( ( ( ( () ( ( ruleRelationalOp ) ) ) )=> ( () ( (lv_op_2_0= ruleRelationalOp ) ) ) ) ( (lv_right_3_0= ruleAddSubExpr ) ) )? )
            // InternalGumboParser.g:1494:3: this_AddSubExpr_0= ruleAddSubExpr ( ( ( ( () ( ( ruleRelationalOp ) ) ) )=> ( () ( (lv_op_2_0= ruleRelationalOp ) ) ) ) ( (lv_right_3_0= ruleAddSubExpr ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRelationalExprAccess().getAddSubExprParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_28);
            this_AddSubExpr_0=ruleAddSubExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AddSubExpr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGumboParser.g:1502:3: ( ( ( ( () ( ( ruleRelationalOp ) ) ) )=> ( () ( (lv_op_2_0= ruleRelationalOp ) ) ) ) ( (lv_right_3_0= ruleAddSubExpr ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==LessThanSign) && (synpred5_InternalGumboParser())) {
                alt21=1;
            }
            else if ( (LA21_0==LessThanSignEqualsSign) && (synpred5_InternalGumboParser())) {
                alt21=1;
            }
            else if ( (LA21_0==GreaterThanSign) && (synpred5_InternalGumboParser())) {
                alt21=1;
            }
            else if ( (LA21_0==GreaterThanSignEqualsSign) && (synpred5_InternalGumboParser())) {
                alt21=1;
            }
            else if ( (LA21_0==EqualsSign) && (synpred5_InternalGumboParser())) {
                alt21=1;
            }
            else if ( (LA21_0==LessThanSignGreaterThanSign) && (synpred5_InternalGumboParser())) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalGumboParser.g:1503:4: ( ( ( () ( ( ruleRelationalOp ) ) ) )=> ( () ( (lv_op_2_0= ruleRelationalOp ) ) ) ) ( (lv_right_3_0= ruleAddSubExpr ) )
                    {
                    // InternalGumboParser.g:1503:4: ( ( ( () ( ( ruleRelationalOp ) ) ) )=> ( () ( (lv_op_2_0= ruleRelationalOp ) ) ) )
                    // InternalGumboParser.g:1504:5: ( ( () ( ( ruleRelationalOp ) ) ) )=> ( () ( (lv_op_2_0= ruleRelationalOp ) ) )
                    {
                    // InternalGumboParser.g:1514:5: ( () ( (lv_op_2_0= ruleRelationalOp ) ) )
                    // InternalGumboParser.g:1515:6: () ( (lv_op_2_0= ruleRelationalOp ) )
                    {
                    // InternalGumboParser.g:1515:6: ()
                    // InternalGumboParser.g:1516:7: 
                    {
                    if ( state.backtracking==0 ) {

                      							current = forceCreateModelElementAndSet(
                      								grammarAccess.getRelationalExprAccess().getBinaryExprLeftAction_1_0_0_0(),
                      								current);
                      						
                    }

                    }

                    // InternalGumboParser.g:1522:6: ( (lv_op_2_0= ruleRelationalOp ) )
                    // InternalGumboParser.g:1523:7: (lv_op_2_0= ruleRelationalOp )
                    {
                    // InternalGumboParser.g:1523:7: (lv_op_2_0= ruleRelationalOp )
                    // InternalGumboParser.g:1524:8: lv_op_2_0= ruleRelationalOp
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getRelationalExprAccess().getOpRelationalOpParserRuleCall_1_0_0_1_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_17);
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

                    // InternalGumboParser.g:1543:4: ( (lv_right_3_0= ruleAddSubExpr ) )
                    // InternalGumboParser.g:1544:5: (lv_right_3_0= ruleAddSubExpr )
                    {
                    // InternalGumboParser.g:1544:5: (lv_right_3_0= ruleAddSubExpr )
                    // InternalGumboParser.g:1545:6: lv_right_3_0= ruleAddSubExpr
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
    // InternalGumboParser.g:1567:1: entryRuleAddSubExpr returns [EObject current=null] : iv_ruleAddSubExpr= ruleAddSubExpr EOF ;
    public final EObject entryRuleAddSubExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddSubExpr = null;


        try {
            // InternalGumboParser.g:1567:51: (iv_ruleAddSubExpr= ruleAddSubExpr EOF )
            // InternalGumboParser.g:1568:2: iv_ruleAddSubExpr= ruleAddSubExpr EOF
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
    // InternalGumboParser.g:1574:1: ruleAddSubExpr returns [EObject current=null] : (this_MultDivModExpr_0= ruleMultDivModExpr ( ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ) ) ( (lv_right_3_0= ruleMultDivModExpr ) ) )* ) ;
    public final EObject ruleAddSubExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_MultDivModExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1580:2: ( (this_MultDivModExpr_0= ruleMultDivModExpr ( ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ) ) ( (lv_right_3_0= ruleMultDivModExpr ) ) )* ) )
            // InternalGumboParser.g:1581:2: (this_MultDivModExpr_0= ruleMultDivModExpr ( ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ) ) ( (lv_right_3_0= ruleMultDivModExpr ) ) )* )
            {
            // InternalGumboParser.g:1581:2: (this_MultDivModExpr_0= ruleMultDivModExpr ( ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ) ) ( (lv_right_3_0= ruleMultDivModExpr ) ) )* )
            // InternalGumboParser.g:1582:3: this_MultDivModExpr_0= ruleMultDivModExpr ( ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ) ) ( (lv_right_3_0= ruleMultDivModExpr ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAddSubExprAccess().getMultDivModExprParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_29);
            this_MultDivModExpr_0=ruleMultDivModExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MultDivModExpr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGumboParser.g:1590:3: ( ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ) ) ( (lv_right_3_0= ruleMultDivModExpr ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==PlusSign) && (synpred6_InternalGumboParser())) {
                    alt23=1;
                }
                else if ( (LA23_0==HyphenMinus) && (synpred6_InternalGumboParser())) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalGumboParser.g:1591:4: ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ) ) ( (lv_right_3_0= ruleMultDivModExpr ) )
            	    {
            	    // InternalGumboParser.g:1591:4: ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ) )
            	    // InternalGumboParser.g:1592:5: ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) )
            	    {
            	    // InternalGumboParser.g:1606:5: ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) )
            	    // InternalGumboParser.g:1607:6: () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) )
            	    {
            	    // InternalGumboParser.g:1607:6: ()
            	    // InternalGumboParser.g:1608:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getAddSubExprAccess().getBinaryExprLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalGumboParser.g:1614:6: ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) )
            	    // InternalGumboParser.g:1615:7: ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) )
            	    {
            	    // InternalGumboParser.g:1615:7: ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) )
            	    // InternalGumboParser.g:1616:8: (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus )
            	    {
            	    // InternalGumboParser.g:1616:8: (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus )
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==PlusSign) ) {
            	        alt22=1;
            	    }
            	    else if ( (LA22_0==HyphenMinus) ) {
            	        alt22=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // InternalGumboParser.g:1617:9: lv_op_2_1= PlusSign
            	            {
            	            lv_op_2_1=(Token)match(input,PlusSign,FollowSets000.FOLLOW_17); if (state.failed) return current;
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
            	            // InternalGumboParser.g:1628:9: lv_op_2_2= HyphenMinus
            	            {
            	            lv_op_2_2=(Token)match(input,HyphenMinus,FollowSets000.FOLLOW_17); if (state.failed) return current;
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

            	    // InternalGumboParser.g:1643:4: ( (lv_right_3_0= ruleMultDivModExpr ) )
            	    // InternalGumboParser.g:1644:5: (lv_right_3_0= ruleMultDivModExpr )
            	    {
            	    // InternalGumboParser.g:1644:5: (lv_right_3_0= ruleMultDivModExpr )
            	    // InternalGumboParser.g:1645:6: lv_right_3_0= ruleMultDivModExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAddSubExprAccess().getRightMultDivModExprParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_29);
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
            	    break loop23;
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
    // InternalGumboParser.g:1667:1: entryRuleMultDivModExpr returns [EObject current=null] : iv_ruleMultDivModExpr= ruleMultDivModExpr EOF ;
    public final EObject entryRuleMultDivModExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultDivModExpr = null;


        try {
            // InternalGumboParser.g:1667:55: (iv_ruleMultDivModExpr= ruleMultDivModExpr EOF )
            // InternalGumboParser.g:1668:2: iv_ruleMultDivModExpr= ruleMultDivModExpr EOF
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
    // InternalGumboParser.g:1674:1: ruleMultDivModExpr returns [EObject current=null] : (this_ExpExpr_0= ruleExpExpr ( ( ( ( () ( ( ( Asterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleExpExpr ) ) )* ) ;
    public final EObject ruleMultDivModExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        EObject this_ExpExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1680:2: ( (this_ExpExpr_0= ruleExpExpr ( ( ( ( () ( ( ( Asterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleExpExpr ) ) )* ) )
            // InternalGumboParser.g:1681:2: (this_ExpExpr_0= ruleExpExpr ( ( ( ( () ( ( ( Asterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleExpExpr ) ) )* )
            {
            // InternalGumboParser.g:1681:2: (this_ExpExpr_0= ruleExpExpr ( ( ( ( () ( ( ( Asterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleExpExpr ) ) )* )
            // InternalGumboParser.g:1682:3: this_ExpExpr_0= ruleExpExpr ( ( ( ( () ( ( ( Asterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleExpExpr ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMultDivModExprAccess().getExpExprParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_30);
            this_ExpExpr_0=ruleExpExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ExpExpr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGumboParser.g:1690:3: ( ( ( ( () ( ( ( Asterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleExpExpr ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==Asterisk) && (synpred7_InternalGumboParser())) {
                    alt25=1;
                }
                else if ( (LA25_0==Solidus) && (synpred7_InternalGumboParser())) {
                    alt25=1;
                }
                else if ( (LA25_0==PercentSign) && (synpred7_InternalGumboParser())) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalGumboParser.g:1691:4: ( ( ( () ( ( ( Asterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleExpExpr ) )
            	    {
            	    // InternalGumboParser.g:1691:4: ( ( ( () ( ( ( Asterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) ) ) )
            	    // InternalGumboParser.g:1692:5: ( ( () ( ( ( Asterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) ) )
            	    {
            	    // InternalGumboParser.g:1708:5: ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) ) )
            	    // InternalGumboParser.g:1709:6: () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) )
            	    {
            	    // InternalGumboParser.g:1709:6: ()
            	    // InternalGumboParser.g:1710:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getMultDivModExprAccess().getBinaryExprLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalGumboParser.g:1716:6: ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) )
            	    // InternalGumboParser.g:1717:7: ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) )
            	    {
            	    // InternalGumboParser.g:1717:7: ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) )
            	    // InternalGumboParser.g:1718:8: (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign )
            	    {
            	    // InternalGumboParser.g:1718:8: (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign )
            	    int alt24=3;
            	    switch ( input.LA(1) ) {
            	    case Asterisk:
            	        {
            	        alt24=1;
            	        }
            	        break;
            	    case Solidus:
            	        {
            	        alt24=2;
            	        }
            	        break;
            	    case PercentSign:
            	        {
            	        alt24=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt24) {
            	        case 1 :
            	            // InternalGumboParser.g:1719:9: lv_op_2_1= Asterisk
            	            {
            	            lv_op_2_1=(Token)match(input,Asterisk,FollowSets000.FOLLOW_17); if (state.failed) return current;
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
            	            // InternalGumboParser.g:1730:9: lv_op_2_2= Solidus
            	            {
            	            lv_op_2_2=(Token)match(input,Solidus,FollowSets000.FOLLOW_17); if (state.failed) return current;
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
            	            // InternalGumboParser.g:1741:9: lv_op_2_3= PercentSign
            	            {
            	            lv_op_2_3=(Token)match(input,PercentSign,FollowSets000.FOLLOW_17); if (state.failed) return current;
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

            	    // InternalGumboParser.g:1756:4: ( (lv_right_3_0= ruleExpExpr ) )
            	    // InternalGumboParser.g:1757:5: (lv_right_3_0= ruleExpExpr )
            	    {
            	    // InternalGumboParser.g:1757:5: (lv_right_3_0= ruleExpExpr )
            	    // InternalGumboParser.g:1758:6: lv_right_3_0= ruleExpExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMultDivModExprAccess().getRightExpExprParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_30);
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
    // $ANTLR end "ruleMultDivModExpr"


    // $ANTLR start "entryRuleExpExpr"
    // InternalGumboParser.g:1780:1: entryRuleExpExpr returns [EObject current=null] : iv_ruleExpExpr= ruleExpExpr EOF ;
    public final EObject entryRuleExpExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpExpr = null;


        try {
            // InternalGumboParser.g:1780:48: (iv_ruleExpExpr= ruleExpExpr EOF )
            // InternalGumboParser.g:1781:2: iv_ruleExpExpr= ruleExpExpr EOF
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
    // InternalGumboParser.g:1787:1: ruleExpExpr returns [EObject current=null] : (this_PrefixExpr_0= rulePrefixExpr ( ( ( ( () ( ( CircumflexAccent ) ) ) )=> ( () ( (lv_op_2_0= CircumflexAccent ) ) ) ) ( (lv_right_3_0= rulePrefixExpr ) ) )* ) ;
    public final EObject ruleExpExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_PrefixExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1793:2: ( (this_PrefixExpr_0= rulePrefixExpr ( ( ( ( () ( ( CircumflexAccent ) ) ) )=> ( () ( (lv_op_2_0= CircumflexAccent ) ) ) ) ( (lv_right_3_0= rulePrefixExpr ) ) )* ) )
            // InternalGumboParser.g:1794:2: (this_PrefixExpr_0= rulePrefixExpr ( ( ( ( () ( ( CircumflexAccent ) ) ) )=> ( () ( (lv_op_2_0= CircumflexAccent ) ) ) ) ( (lv_right_3_0= rulePrefixExpr ) ) )* )
            {
            // InternalGumboParser.g:1794:2: (this_PrefixExpr_0= rulePrefixExpr ( ( ( ( () ( ( CircumflexAccent ) ) ) )=> ( () ( (lv_op_2_0= CircumflexAccent ) ) ) ) ( (lv_right_3_0= rulePrefixExpr ) ) )* )
            // InternalGumboParser.g:1795:3: this_PrefixExpr_0= rulePrefixExpr ( ( ( ( () ( ( CircumflexAccent ) ) ) )=> ( () ( (lv_op_2_0= CircumflexAccent ) ) ) ) ( (lv_right_3_0= rulePrefixExpr ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpExprAccess().getPrefixExprParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_31);
            this_PrefixExpr_0=rulePrefixExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PrefixExpr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGumboParser.g:1803:3: ( ( ( ( () ( ( CircumflexAccent ) ) ) )=> ( () ( (lv_op_2_0= CircumflexAccent ) ) ) ) ( (lv_right_3_0= rulePrefixExpr ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==CircumflexAccent) && (synpred8_InternalGumboParser())) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalGumboParser.g:1804:4: ( ( ( () ( ( CircumflexAccent ) ) ) )=> ( () ( (lv_op_2_0= CircumflexAccent ) ) ) ) ( (lv_right_3_0= rulePrefixExpr ) )
            	    {
            	    // InternalGumboParser.g:1804:4: ( ( ( () ( ( CircumflexAccent ) ) ) )=> ( () ( (lv_op_2_0= CircumflexAccent ) ) ) )
            	    // InternalGumboParser.g:1805:5: ( ( () ( ( CircumflexAccent ) ) ) )=> ( () ( (lv_op_2_0= CircumflexAccent ) ) )
            	    {
            	    // InternalGumboParser.g:1815:5: ( () ( (lv_op_2_0= CircumflexAccent ) ) )
            	    // InternalGumboParser.g:1816:6: () ( (lv_op_2_0= CircumflexAccent ) )
            	    {
            	    // InternalGumboParser.g:1816:6: ()
            	    // InternalGumboParser.g:1817:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getExpExprAccess().getBinaryExprLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalGumboParser.g:1823:6: ( (lv_op_2_0= CircumflexAccent ) )
            	    // InternalGumboParser.g:1824:7: (lv_op_2_0= CircumflexAccent )
            	    {
            	    // InternalGumboParser.g:1824:7: (lv_op_2_0= CircumflexAccent )
            	    // InternalGumboParser.g:1825:8: lv_op_2_0= CircumflexAccent
            	    {
            	    lv_op_2_0=(Token)match(input,CircumflexAccent,FollowSets000.FOLLOW_17); if (state.failed) return current;
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

            	    // InternalGumboParser.g:1839:4: ( (lv_right_3_0= rulePrefixExpr ) )
            	    // InternalGumboParser.g:1840:5: (lv_right_3_0= rulePrefixExpr )
            	    {
            	    // InternalGumboParser.g:1840:5: (lv_right_3_0= rulePrefixExpr )
            	    // InternalGumboParser.g:1841:6: lv_right_3_0= rulePrefixExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExpExprAccess().getRightPrefixExprParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_31);
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
            	    break loop26;
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
    // InternalGumboParser.g:1863:1: entryRulePrefixExpr returns [EObject current=null] : iv_rulePrefixExpr= rulePrefixExpr EOF ;
    public final EObject entryRulePrefixExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixExpr = null;


        try {
            // InternalGumboParser.g:1863:51: (iv_rulePrefixExpr= rulePrefixExpr EOF )
            // InternalGumboParser.g:1864:2: iv_rulePrefixExpr= rulePrefixExpr EOF
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
    // InternalGumboParser.g:1870:1: rulePrefixExpr returns [EObject current=null] : ( ( () ( ( (lv_op_1_1= HyphenMinus | lv_op_1_2= Not ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) ) ) | this_AtomicExpr_3= ruleAtomicExpr ) ;
    public final EObject rulePrefixExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_1=null;
        Token lv_op_1_2=null;
        EObject lv_expr_2_0 = null;

        EObject this_AtomicExpr_3 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1876:2: ( ( ( () ( ( (lv_op_1_1= HyphenMinus | lv_op_1_2= Not ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) ) ) | this_AtomicExpr_3= ruleAtomicExpr ) )
            // InternalGumboParser.g:1877:2: ( ( () ( ( (lv_op_1_1= HyphenMinus | lv_op_1_2= Not ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) ) ) | this_AtomicExpr_3= ruleAtomicExpr )
            {
            // InternalGumboParser.g:1877:2: ( ( () ( ( (lv_op_1_1= HyphenMinus | lv_op_1_2= Not ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) ) ) | this_AtomicExpr_3= ruleAtomicExpr )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Not||LA28_0==HyphenMinus) ) {
                alt28=1;
            }
            else if ( ((LA28_0>=False && LA28_0<=Floor)||(LA28_0>=Enum && LA28_0<=Real)||LA28_0==True||LA28_0==LeftParenthesis||LA28_0==RULE_REAL_LIT||LA28_0==RULE_INTEGER_LIT||LA28_0==RULE_ID) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalGumboParser.g:1878:3: ( () ( ( (lv_op_1_1= HyphenMinus | lv_op_1_2= Not ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) ) )
                    {
                    // InternalGumboParser.g:1878:3: ( () ( ( (lv_op_1_1= HyphenMinus | lv_op_1_2= Not ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) ) )
                    // InternalGumboParser.g:1879:4: () ( ( (lv_op_1_1= HyphenMinus | lv_op_1_2= Not ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) )
                    {
                    // InternalGumboParser.g:1879:4: ()
                    // InternalGumboParser.g:1880:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrefixExprAccess().getUnaryExprAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:1886:4: ( ( (lv_op_1_1= HyphenMinus | lv_op_1_2= Not ) ) )
                    // InternalGumboParser.g:1887:5: ( (lv_op_1_1= HyphenMinus | lv_op_1_2= Not ) )
                    {
                    // InternalGumboParser.g:1887:5: ( (lv_op_1_1= HyphenMinus | lv_op_1_2= Not ) )
                    // InternalGumboParser.g:1888:6: (lv_op_1_1= HyphenMinus | lv_op_1_2= Not )
                    {
                    // InternalGumboParser.g:1888:6: (lv_op_1_1= HyphenMinus | lv_op_1_2= Not )
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==HyphenMinus) ) {
                        alt27=1;
                    }
                    else if ( (LA27_0==Not) ) {
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
                            // InternalGumboParser.g:1889:7: lv_op_1_1= HyphenMinus
                            {
                            lv_op_1_1=(Token)match(input,HyphenMinus,FollowSets000.FOLLOW_17); if (state.failed) return current;
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
                            // InternalGumboParser.g:1900:7: lv_op_1_2= Not
                            {
                            lv_op_1_2=(Token)match(input,Not,FollowSets000.FOLLOW_17); if (state.failed) return current;
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

                    // InternalGumboParser.g:1913:4: ( (lv_expr_2_0= rulePrefixExpr ) )
                    // InternalGumboParser.g:1914:5: (lv_expr_2_0= rulePrefixExpr )
                    {
                    // InternalGumboParser.g:1914:5: (lv_expr_2_0= rulePrefixExpr )
                    // InternalGumboParser.g:1915:6: lv_expr_2_0= rulePrefixExpr
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
                    // InternalGumboParser.g:1934:3: this_AtomicExpr_3= ruleAtomicExpr
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
    // InternalGumboParser.g:1946:1: entryRuleAtomicExpr returns [EObject current=null] : iv_ruleAtomicExpr= ruleAtomicExpr EOF ;
    public final EObject entryRuleAtomicExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpr = null;


        try {
            // InternalGumboParser.g:1946:51: (iv_ruleAtomicExpr= ruleAtomicExpr EOF )
            // InternalGumboParser.g:1947:2: iv_ruleAtomicExpr= ruleAtomicExpr EOF
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
    // InternalGumboParser.g:1953:1: ruleAtomicExpr returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= FullStop ( (lv_ref_3_0= ruleOtherDataRef ) ) )? ( (lv_cs_4_0= ruleCallSuffix ) )? ) | ( ( ( ( () Enum LeftParenthesis ) )=> ( () otherlv_6= Enum otherlv_7= LeftParenthesis ) ) ( (lv_enumType_8_0= ruleDataElement ) ) otherlv_9= Comma ( (otherlv_10= RULE_ID ) ) otherlv_11= RightParenthesis ) | ( ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_13_0= ruleDataElement ) ) otherlv_14= LeftCurlyBracket ( (otherlv_15= RULE_ID ) ) otherlv_16= EqualsSign ) ) ( (lv_argExpr_17_0= ruleExpr ) ) (otherlv_18= Semicolon ( (otherlv_19= RULE_ID ) ) otherlv_20= EqualsSign ( (lv_argExpr_21_0= ruleExpr ) ) )* otherlv_22= RightCurlyBracket ) | ( () ( (lv_value_24_0= RULE_INTEGER_LIT ) ) ) | ( () ( (lv_val_26_0= RULE_REAL_LIT ) ) ) | ( () ( (lv_val_28_0= ruleBooleanLiteral ) ) ) | ( () otherlv_30= Floor otherlv_31= LeftParenthesis ( (lv_expr_32_0= ruleExpr ) ) otherlv_33= RightParenthesis ) | ( () otherlv_35= Real otherlv_36= LeftParenthesis ( (lv_expr_37_0= ruleExpr ) ) otherlv_38= RightParenthesis ) | (otherlv_39= LeftParenthesis this_Expr_40= ruleExpr otherlv_41= RightParenthesis ) ) ;
    public final EObject ruleAtomicExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token lv_value_24_0=null;
        Token lv_val_26_0=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        EObject lv_ref_3_0 = null;

        EObject lv_cs_4_0 = null;

        EObject lv_enumType_8_0 = null;

        EObject lv_recordType_13_0 = null;

        EObject lv_argExpr_17_0 = null;

        EObject lv_argExpr_21_0 = null;

        EObject lv_val_28_0 = null;

        EObject lv_expr_32_0 = null;

        EObject lv_expr_37_0 = null;

        EObject this_Expr_40 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1959:2: ( ( ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= FullStop ( (lv_ref_3_0= ruleOtherDataRef ) ) )? ( (lv_cs_4_0= ruleCallSuffix ) )? ) | ( ( ( ( () Enum LeftParenthesis ) )=> ( () otherlv_6= Enum otherlv_7= LeftParenthesis ) ) ( (lv_enumType_8_0= ruleDataElement ) ) otherlv_9= Comma ( (otherlv_10= RULE_ID ) ) otherlv_11= RightParenthesis ) | ( ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_13_0= ruleDataElement ) ) otherlv_14= LeftCurlyBracket ( (otherlv_15= RULE_ID ) ) otherlv_16= EqualsSign ) ) ( (lv_argExpr_17_0= ruleExpr ) ) (otherlv_18= Semicolon ( (otherlv_19= RULE_ID ) ) otherlv_20= EqualsSign ( (lv_argExpr_21_0= ruleExpr ) ) )* otherlv_22= RightCurlyBracket ) | ( () ( (lv_value_24_0= RULE_INTEGER_LIT ) ) ) | ( () ( (lv_val_26_0= RULE_REAL_LIT ) ) ) | ( () ( (lv_val_28_0= ruleBooleanLiteral ) ) ) | ( () otherlv_30= Floor otherlv_31= LeftParenthesis ( (lv_expr_32_0= ruleExpr ) ) otherlv_33= RightParenthesis ) | ( () otherlv_35= Real otherlv_36= LeftParenthesis ( (lv_expr_37_0= ruleExpr ) ) otherlv_38= RightParenthesis ) | (otherlv_39= LeftParenthesis this_Expr_40= ruleExpr otherlv_41= RightParenthesis ) ) )
            // InternalGumboParser.g:1960:2: ( ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= FullStop ( (lv_ref_3_0= ruleOtherDataRef ) ) )? ( (lv_cs_4_0= ruleCallSuffix ) )? ) | ( ( ( ( () Enum LeftParenthesis ) )=> ( () otherlv_6= Enum otherlv_7= LeftParenthesis ) ) ( (lv_enumType_8_0= ruleDataElement ) ) otherlv_9= Comma ( (otherlv_10= RULE_ID ) ) otherlv_11= RightParenthesis ) | ( ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_13_0= ruleDataElement ) ) otherlv_14= LeftCurlyBracket ( (otherlv_15= RULE_ID ) ) otherlv_16= EqualsSign ) ) ( (lv_argExpr_17_0= ruleExpr ) ) (otherlv_18= Semicolon ( (otherlv_19= RULE_ID ) ) otherlv_20= EqualsSign ( (lv_argExpr_21_0= ruleExpr ) ) )* otherlv_22= RightCurlyBracket ) | ( () ( (lv_value_24_0= RULE_INTEGER_LIT ) ) ) | ( () ( (lv_val_26_0= RULE_REAL_LIT ) ) ) | ( () ( (lv_val_28_0= ruleBooleanLiteral ) ) ) | ( () otherlv_30= Floor otherlv_31= LeftParenthesis ( (lv_expr_32_0= ruleExpr ) ) otherlv_33= RightParenthesis ) | ( () otherlv_35= Real otherlv_36= LeftParenthesis ( (lv_expr_37_0= ruleExpr ) ) otherlv_38= RightParenthesis ) | (otherlv_39= LeftParenthesis this_Expr_40= ruleExpr otherlv_41= RightParenthesis ) )
            {
            // InternalGumboParser.g:1960:2: ( ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= FullStop ( (lv_ref_3_0= ruleOtherDataRef ) ) )? ( (lv_cs_4_0= ruleCallSuffix ) )? ) | ( ( ( ( () Enum LeftParenthesis ) )=> ( () otherlv_6= Enum otherlv_7= LeftParenthesis ) ) ( (lv_enumType_8_0= ruleDataElement ) ) otherlv_9= Comma ( (otherlv_10= RULE_ID ) ) otherlv_11= RightParenthesis ) | ( ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_13_0= ruleDataElement ) ) otherlv_14= LeftCurlyBracket ( (otherlv_15= RULE_ID ) ) otherlv_16= EqualsSign ) ) ( (lv_argExpr_17_0= ruleExpr ) ) (otherlv_18= Semicolon ( (otherlv_19= RULE_ID ) ) otherlv_20= EqualsSign ( (lv_argExpr_21_0= ruleExpr ) ) )* otherlv_22= RightCurlyBracket ) | ( () ( (lv_value_24_0= RULE_INTEGER_LIT ) ) ) | ( () ( (lv_val_26_0= RULE_REAL_LIT ) ) ) | ( () ( (lv_val_28_0= ruleBooleanLiteral ) ) ) | ( () otherlv_30= Floor otherlv_31= LeftParenthesis ( (lv_expr_32_0= ruleExpr ) ) otherlv_33= RightParenthesis ) | ( () otherlv_35= Real otherlv_36= LeftParenthesis ( (lv_expr_37_0= ruleExpr ) ) otherlv_38= RightParenthesis ) | (otherlv_39= LeftParenthesis this_Expr_40= ruleExpr otherlv_41= RightParenthesis ) )
            int alt32=9;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // InternalGumboParser.g:1961:3: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= FullStop ( (lv_ref_3_0= ruleOtherDataRef ) ) )? ( (lv_cs_4_0= ruleCallSuffix ) )? )
                    {
                    // InternalGumboParser.g:1961:3: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= FullStop ( (lv_ref_3_0= ruleOtherDataRef ) ) )? ( (lv_cs_4_0= ruleCallSuffix ) )? )
                    // InternalGumboParser.g:1962:4: () ( (otherlv_1= RULE_ID ) ) (otherlv_2= FullStop ( (lv_ref_3_0= ruleOtherDataRef ) ) )? ( (lv_cs_4_0= ruleCallSuffix ) )?
                    {
                    // InternalGumboParser.g:1962:4: ()
                    // InternalGumboParser.g:1963:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicExprAccess().getDataRefExprAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:1969:4: ( (otherlv_1= RULE_ID ) )
                    // InternalGumboParser.g:1970:5: (otherlv_1= RULE_ID )
                    {
                    // InternalGumboParser.g:1970:5: (otherlv_1= RULE_ID )
                    // InternalGumboParser.g:1971:6: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicExprRule());
                      						}
                      					
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_1, grammarAccess.getAtomicExprAccess().getPortOrSubcomponentOrStateVarEObjectCrossReference_0_1_0());
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:1982:4: (otherlv_2= FullStop ( (lv_ref_3_0= ruleOtherDataRef ) ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==FullStop) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalGumboParser.g:1983:5: otherlv_2= FullStop ( (lv_ref_3_0= ruleOtherDataRef ) )
                            {
                            otherlv_2=(Token)match(input,FullStop,FollowSets000.FOLLOW_10); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getAtomicExprAccess().getFullStopKeyword_0_2_0());
                              				
                            }
                            // InternalGumboParser.g:1987:5: ( (lv_ref_3_0= ruleOtherDataRef ) )
                            // InternalGumboParser.g:1988:6: (lv_ref_3_0= ruleOtherDataRef )
                            {
                            // InternalGumboParser.g:1988:6: (lv_ref_3_0= ruleOtherDataRef )
                            // InternalGumboParser.g:1989:7: lv_ref_3_0= ruleOtherDataRef
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getAtomicExprAccess().getRefOtherDataRefParserRuleCall_0_2_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_33);
                            lv_ref_3_0=ruleOtherDataRef();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                              							}
                              							set(
                              								current,
                              								"ref",
                              								lv_ref_3_0,
                              								"org.sireum.aadl.gumbo.Gumbo.OtherDataRef");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalGumboParser.g:2007:4: ( (lv_cs_4_0= ruleCallSuffix ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==LeftParenthesis||LA30_0==LeftSquareBracket) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalGumboParser.g:2008:5: (lv_cs_4_0= ruleCallSuffix )
                            {
                            // InternalGumboParser.g:2008:5: (lv_cs_4_0= ruleCallSuffix )
                            // InternalGumboParser.g:2009:6: lv_cs_4_0= ruleCallSuffix
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getAtomicExprAccess().getCsCallSuffixParserRuleCall_0_3_0());
                              					
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_cs_4_0=ruleCallSuffix();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                              						}
                              						set(
                              							current,
                              							"cs",
                              							lv_cs_4_0,
                              							"org.sireum.aadl.gumbo.Gumbo.CallSuffix");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:2028:3: ( ( ( ( () Enum LeftParenthesis ) )=> ( () otherlv_6= Enum otherlv_7= LeftParenthesis ) ) ( (lv_enumType_8_0= ruleDataElement ) ) otherlv_9= Comma ( (otherlv_10= RULE_ID ) ) otherlv_11= RightParenthesis )
                    {
                    // InternalGumboParser.g:2028:3: ( ( ( ( () Enum LeftParenthesis ) )=> ( () otherlv_6= Enum otherlv_7= LeftParenthesis ) ) ( (lv_enumType_8_0= ruleDataElement ) ) otherlv_9= Comma ( (otherlv_10= RULE_ID ) ) otherlv_11= RightParenthesis )
                    // InternalGumboParser.g:2029:4: ( ( ( () Enum LeftParenthesis ) )=> ( () otherlv_6= Enum otherlv_7= LeftParenthesis ) ) ( (lv_enumType_8_0= ruleDataElement ) ) otherlv_9= Comma ( (otherlv_10= RULE_ID ) ) otherlv_11= RightParenthesis
                    {
                    // InternalGumboParser.g:2029:4: ( ( ( () Enum LeftParenthesis ) )=> ( () otherlv_6= Enum otherlv_7= LeftParenthesis ) )
                    // InternalGumboParser.g:2030:5: ( ( () Enum LeftParenthesis ) )=> ( () otherlv_6= Enum otherlv_7= LeftParenthesis )
                    {
                    // InternalGumboParser.g:2037:5: ( () otherlv_6= Enum otherlv_7= LeftParenthesis )
                    // InternalGumboParser.g:2038:6: () otherlv_6= Enum otherlv_7= LeftParenthesis
                    {
                    // InternalGumboParser.g:2038:6: ()
                    // InternalGumboParser.g:2039:7: 
                    {
                    if ( state.backtracking==0 ) {

                      							current = forceCreateModelElement(
                      								grammarAccess.getAtomicExprAccess().getEnumLitExprAction_1_0_0_0(),
                      								current);
                      						
                    }

                    }

                    otherlv_6=(Token)match(input,Enum,FollowSets000.FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_6, grammarAccess.getAtomicExprAccess().getEnumKeyword_1_0_0_1());
                      					
                    }
                    otherlv_7=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_7, grammarAccess.getAtomicExprAccess().getLeftParenthesisKeyword_1_0_0_2());
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:2055:4: ( (lv_enumType_8_0= ruleDataElement ) )
                    // InternalGumboParser.g:2056:5: (lv_enumType_8_0= ruleDataElement )
                    {
                    // InternalGumboParser.g:2056:5: (lv_enumType_8_0= ruleDataElement )
                    // InternalGumboParser.g:2057:6: lv_enumType_8_0= ruleDataElement
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtomicExprAccess().getEnumTypeDataElementParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_35);
                    lv_enumType_8_0=ruleDataElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                      						}
                      						set(
                      							current,
                      							"enumType",
                      							lv_enumType_8_0,
                      							"org.sireum.aadl.gumbo.Gumbo.DataElement");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,Comma,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getAtomicExprAccess().getCommaKeyword_1_2());
                      			
                    }
                    // InternalGumboParser.g:2078:4: ( (otherlv_10= RULE_ID ) )
                    // InternalGumboParser.g:2079:5: (otherlv_10= RULE_ID )
                    {
                    // InternalGumboParser.g:2079:5: (otherlv_10= RULE_ID )
                    // InternalGumboParser.g:2080:6: otherlv_10= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicExprRule());
                      						}
                      					
                    }
                    otherlv_10=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_10, grammarAccess.getAtomicExprAccess().getValueStringLiteralCrossReference_1_3_0());
                      					
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getAtomicExprAccess().getRightParenthesisKeyword_1_4());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGumboParser.g:2097:3: ( ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_13_0= ruleDataElement ) ) otherlv_14= LeftCurlyBracket ( (otherlv_15= RULE_ID ) ) otherlv_16= EqualsSign ) ) ( (lv_argExpr_17_0= ruleExpr ) ) (otherlv_18= Semicolon ( (otherlv_19= RULE_ID ) ) otherlv_20= EqualsSign ( (lv_argExpr_21_0= ruleExpr ) ) )* otherlv_22= RightCurlyBracket )
                    {
                    // InternalGumboParser.g:2097:3: ( ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_13_0= ruleDataElement ) ) otherlv_14= LeftCurlyBracket ( (otherlv_15= RULE_ID ) ) otherlv_16= EqualsSign ) ) ( (lv_argExpr_17_0= ruleExpr ) ) (otherlv_18= Semicolon ( (otherlv_19= RULE_ID ) ) otherlv_20= EqualsSign ( (lv_argExpr_21_0= ruleExpr ) ) )* otherlv_22= RightCurlyBracket )
                    // InternalGumboParser.g:2098:4: ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_13_0= ruleDataElement ) ) otherlv_14= LeftCurlyBracket ( (otherlv_15= RULE_ID ) ) otherlv_16= EqualsSign ) ) ( (lv_argExpr_17_0= ruleExpr ) ) (otherlv_18= Semicolon ( (otherlv_19= RULE_ID ) ) otherlv_20= EqualsSign ( (lv_argExpr_21_0= ruleExpr ) ) )* otherlv_22= RightCurlyBracket
                    {
                    // InternalGumboParser.g:2098:4: ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_13_0= ruleDataElement ) ) otherlv_14= LeftCurlyBracket ( (otherlv_15= RULE_ID ) ) otherlv_16= EqualsSign ) )
                    // InternalGumboParser.g:2099:5: ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_13_0= ruleDataElement ) ) otherlv_14= LeftCurlyBracket ( (otherlv_15= RULE_ID ) ) otherlv_16= EqualsSign )
                    {
                    // InternalGumboParser.g:2116:5: ( () ( (lv_recordType_13_0= ruleDataElement ) ) otherlv_14= LeftCurlyBracket ( (otherlv_15= RULE_ID ) ) otherlv_16= EqualsSign )
                    // InternalGumboParser.g:2117:6: () ( (lv_recordType_13_0= ruleDataElement ) ) otherlv_14= LeftCurlyBracket ( (otherlv_15= RULE_ID ) ) otherlv_16= EqualsSign
                    {
                    // InternalGumboParser.g:2117:6: ()
                    // InternalGumboParser.g:2118:7: 
                    {
                    if ( state.backtracking==0 ) {

                      							current = forceCreateModelElement(
                      								grammarAccess.getAtomicExprAccess().getRecordLitExprAction_2_0_0_0(),
                      								current);
                      						
                    }

                    }

                    // InternalGumboParser.g:2124:6: ( (lv_recordType_13_0= ruleDataElement ) )
                    // InternalGumboParser.g:2125:7: (lv_recordType_13_0= ruleDataElement )
                    {
                    // InternalGumboParser.g:2125:7: (lv_recordType_13_0= ruleDataElement )
                    // InternalGumboParser.g:2126:8: lv_recordType_13_0= ruleDataElement
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getAtomicExprAccess().getRecordTypeDataElementParserRuleCall_2_0_0_1_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_37);
                    lv_recordType_13_0=ruleDataElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                      								}
                      								set(
                      									current,
                      									"recordType",
                      									lv_recordType_13_0,
                      									"org.sireum.aadl.gumbo.Gumbo.DataElement");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }

                    otherlv_14=(Token)match(input,LeftCurlyBracket,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_14, grammarAccess.getAtomicExprAccess().getLeftCurlyBracketKeyword_2_0_0_2());
                      					
                    }
                    // InternalGumboParser.g:2147:6: ( (otherlv_15= RULE_ID ) )
                    // InternalGumboParser.g:2148:7: (otherlv_15= RULE_ID )
                    {
                    // InternalGumboParser.g:2148:7: (otherlv_15= RULE_ID )
                    // InternalGumboParser.g:2149:8: otherlv_15= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElement(grammarAccess.getAtomicExprRule());
                      								}
                      							
                    }
                    otherlv_15=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								newLeafNode(otherlv_15, grammarAccess.getAtomicExprAccess().getArgsNamedElementCrossReference_2_0_0_3_0());
                      							
                    }

                    }


                    }

                    otherlv_16=(Token)match(input,EqualsSign,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_16, grammarAccess.getAtomicExprAccess().getEqualsSignKeyword_2_0_0_4());
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:2166:4: ( (lv_argExpr_17_0= ruleExpr ) )
                    // InternalGumboParser.g:2167:5: (lv_argExpr_17_0= ruleExpr )
                    {
                    // InternalGumboParser.g:2167:5: (lv_argExpr_17_0= ruleExpr )
                    // InternalGumboParser.g:2168:6: lv_argExpr_17_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtomicExprAccess().getArgExprExprParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_39);
                    lv_argExpr_17_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                      						}
                      						add(
                      							current,
                      							"argExpr",
                      							lv_argExpr_17_0,
                      							"org.sireum.aadl.gumbo.Gumbo.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:2185:4: (otherlv_18= Semicolon ( (otherlv_19= RULE_ID ) ) otherlv_20= EqualsSign ( (lv_argExpr_21_0= ruleExpr ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==Semicolon) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalGumboParser.g:2186:5: otherlv_18= Semicolon ( (otherlv_19= RULE_ID ) ) otherlv_20= EqualsSign ( (lv_argExpr_21_0= ruleExpr ) )
                    	    {
                    	    otherlv_18=(Token)match(input,Semicolon,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_18, grammarAccess.getAtomicExprAccess().getSemicolonKeyword_2_2_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:2190:5: ( (otherlv_19= RULE_ID ) )
                    	    // InternalGumboParser.g:2191:6: (otherlv_19= RULE_ID )
                    	    {
                    	    // InternalGumboParser.g:2191:6: (otherlv_19= RULE_ID )
                    	    // InternalGumboParser.g:2192:7: otherlv_19= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getAtomicExprRule());
                    	      							}
                    	      						
                    	    }
                    	    otherlv_19=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_38); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_19, grammarAccess.getAtomicExprAccess().getArgsNamedElementCrossReference_2_2_1_0());
                    	      						
                    	    }

                    	    }


                    	    }

                    	    otherlv_20=(Token)match(input,EqualsSign,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_20, grammarAccess.getAtomicExprAccess().getEqualsSignKeyword_2_2_2());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:2207:5: ( (lv_argExpr_21_0= ruleExpr ) )
                    	    // InternalGumboParser.g:2208:6: (lv_argExpr_21_0= ruleExpr )
                    	    {
                    	    // InternalGumboParser.g:2208:6: (lv_argExpr_21_0= ruleExpr )
                    	    // InternalGumboParser.g:2209:7: lv_argExpr_21_0= ruleExpr
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getAtomicExprAccess().getArgExprExprParserRuleCall_2_2_3_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_39);
                    	    lv_argExpr_21_0=ruleExpr();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"argExpr",
                    	      								lv_argExpr_21_0,
                    	      								"org.sireum.aadl.gumbo.Gumbo.Expr");
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

                    otherlv_22=(Token)match(input,RightCurlyBracket,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_22, grammarAccess.getAtomicExprAccess().getRightCurlyBracketKeyword_2_3());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalGumboParser.g:2233:3: ( () ( (lv_value_24_0= RULE_INTEGER_LIT ) ) )
                    {
                    // InternalGumboParser.g:2233:3: ( () ( (lv_value_24_0= RULE_INTEGER_LIT ) ) )
                    // InternalGumboParser.g:2234:4: () ( (lv_value_24_0= RULE_INTEGER_LIT ) )
                    {
                    // InternalGumboParser.g:2234:4: ()
                    // InternalGumboParser.g:2235:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicExprAccess().getIntLitAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:2241:4: ( (lv_value_24_0= RULE_INTEGER_LIT ) )
                    // InternalGumboParser.g:2242:5: (lv_value_24_0= RULE_INTEGER_LIT )
                    {
                    // InternalGumboParser.g:2242:5: (lv_value_24_0= RULE_INTEGER_LIT )
                    // InternalGumboParser.g:2243:6: lv_value_24_0= RULE_INTEGER_LIT
                    {
                    lv_value_24_0=(Token)match(input,RULE_INTEGER_LIT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_24_0, grammarAccess.getAtomicExprAccess().getValueINTEGER_LITTerminalRuleCall_3_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicExprRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_24_0,
                      							"org.osate.xtext.aadl2.properties.Properties.INTEGER_LIT");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalGumboParser.g:2261:3: ( () ( (lv_val_26_0= RULE_REAL_LIT ) ) )
                    {
                    // InternalGumboParser.g:2261:3: ( () ( (lv_val_26_0= RULE_REAL_LIT ) ) )
                    // InternalGumboParser.g:2262:4: () ( (lv_val_26_0= RULE_REAL_LIT ) )
                    {
                    // InternalGumboParser.g:2262:4: ()
                    // InternalGumboParser.g:2263:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicExprAccess().getRealLitExprAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:2269:4: ( (lv_val_26_0= RULE_REAL_LIT ) )
                    // InternalGumboParser.g:2270:5: (lv_val_26_0= RULE_REAL_LIT )
                    {
                    // InternalGumboParser.g:2270:5: (lv_val_26_0= RULE_REAL_LIT )
                    // InternalGumboParser.g:2271:6: lv_val_26_0= RULE_REAL_LIT
                    {
                    lv_val_26_0=(Token)match(input,RULE_REAL_LIT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_val_26_0, grammarAccess.getAtomicExprAccess().getValREAL_LITTerminalRuleCall_4_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicExprRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"val",
                      							lv_val_26_0,
                      							"org.osate.xtext.aadl2.properties.Properties.REAL_LIT");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalGumboParser.g:2289:3: ( () ( (lv_val_28_0= ruleBooleanLiteral ) ) )
                    {
                    // InternalGumboParser.g:2289:3: ( () ( (lv_val_28_0= ruleBooleanLiteral ) ) )
                    // InternalGumboParser.g:2290:4: () ( (lv_val_28_0= ruleBooleanLiteral ) )
                    {
                    // InternalGumboParser.g:2290:4: ()
                    // InternalGumboParser.g:2291:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicExprAccess().getBoolLitExprAction_5_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:2297:4: ( (lv_val_28_0= ruleBooleanLiteral ) )
                    // InternalGumboParser.g:2298:5: (lv_val_28_0= ruleBooleanLiteral )
                    {
                    // InternalGumboParser.g:2298:5: (lv_val_28_0= ruleBooleanLiteral )
                    // InternalGumboParser.g:2299:6: lv_val_28_0= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtomicExprAccess().getValBooleanLiteralParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_val_28_0=ruleBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                      						}
                      						set(
                      							current,
                      							"val",
                      							lv_val_28_0,
                      							"org.osate.xtext.aadl2.properties.Properties.BooleanLiteral");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalGumboParser.g:2318:3: ( () otherlv_30= Floor otherlv_31= LeftParenthesis ( (lv_expr_32_0= ruleExpr ) ) otherlv_33= RightParenthesis )
                    {
                    // InternalGumboParser.g:2318:3: ( () otherlv_30= Floor otherlv_31= LeftParenthesis ( (lv_expr_32_0= ruleExpr ) ) otherlv_33= RightParenthesis )
                    // InternalGumboParser.g:2319:4: () otherlv_30= Floor otherlv_31= LeftParenthesis ( (lv_expr_32_0= ruleExpr ) ) otherlv_33= RightParenthesis
                    {
                    // InternalGumboParser.g:2319:4: ()
                    // InternalGumboParser.g:2320:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicExprAccess().getFloorCastAction_6_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_30=(Token)match(input,Floor,FollowSets000.FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_30, grammarAccess.getAtomicExprAccess().getFloorKeyword_6_1());
                      			
                    }
                    otherlv_31=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_31, grammarAccess.getAtomicExprAccess().getLeftParenthesisKeyword_6_2());
                      			
                    }
                    // InternalGumboParser.g:2334:4: ( (lv_expr_32_0= ruleExpr ) )
                    // InternalGumboParser.g:2335:5: (lv_expr_32_0= ruleExpr )
                    {
                    // InternalGumboParser.g:2335:5: (lv_expr_32_0= ruleExpr )
                    // InternalGumboParser.g:2336:6: lv_expr_32_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtomicExprAccess().getExprExprParserRuleCall_6_3_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_36);
                    lv_expr_32_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                      						}
                      						set(
                      							current,
                      							"expr",
                      							lv_expr_32_0,
                      							"org.sireum.aadl.gumbo.Gumbo.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_33=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_33, grammarAccess.getAtomicExprAccess().getRightParenthesisKeyword_6_4());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalGumboParser.g:2359:3: ( () otherlv_35= Real otherlv_36= LeftParenthesis ( (lv_expr_37_0= ruleExpr ) ) otherlv_38= RightParenthesis )
                    {
                    // InternalGumboParser.g:2359:3: ( () otherlv_35= Real otherlv_36= LeftParenthesis ( (lv_expr_37_0= ruleExpr ) ) otherlv_38= RightParenthesis )
                    // InternalGumboParser.g:2360:4: () otherlv_35= Real otherlv_36= LeftParenthesis ( (lv_expr_37_0= ruleExpr ) ) otherlv_38= RightParenthesis
                    {
                    // InternalGumboParser.g:2360:4: ()
                    // InternalGumboParser.g:2361:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicExprAccess().getRealCastAction_7_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_35=(Token)match(input,Real,FollowSets000.FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_35, grammarAccess.getAtomicExprAccess().getRealKeyword_7_1());
                      			
                    }
                    otherlv_36=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_36, grammarAccess.getAtomicExprAccess().getLeftParenthesisKeyword_7_2());
                      			
                    }
                    // InternalGumboParser.g:2375:4: ( (lv_expr_37_0= ruleExpr ) )
                    // InternalGumboParser.g:2376:5: (lv_expr_37_0= ruleExpr )
                    {
                    // InternalGumboParser.g:2376:5: (lv_expr_37_0= ruleExpr )
                    // InternalGumboParser.g:2377:6: lv_expr_37_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtomicExprAccess().getExprExprParserRuleCall_7_3_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_36);
                    lv_expr_37_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                      						}
                      						set(
                      							current,
                      							"expr",
                      							lv_expr_37_0,
                      							"org.sireum.aadl.gumbo.Gumbo.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_38=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_38, grammarAccess.getAtomicExprAccess().getRightParenthesisKeyword_7_4());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalGumboParser.g:2400:3: (otherlv_39= LeftParenthesis this_Expr_40= ruleExpr otherlv_41= RightParenthesis )
                    {
                    // InternalGumboParser.g:2400:3: (otherlv_39= LeftParenthesis this_Expr_40= ruleExpr otherlv_41= RightParenthesis )
                    // InternalGumboParser.g:2401:4: otherlv_39= LeftParenthesis this_Expr_40= ruleExpr otherlv_41= RightParenthesis
                    {
                    otherlv_39=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_39, grammarAccess.getAtomicExprAccess().getLeftParenthesisKeyword_8_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAtomicExprAccess().getExprParserRuleCall_8_1());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_36);
                    this_Expr_40=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expr_40;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_41=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_41, grammarAccess.getAtomicExprAccess().getRightParenthesisKeyword_8_2());
                      			
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


    // $ANTLR start "entryRuleOtherDataRef"
    // InternalGumboParser.g:2422:1: entryRuleOtherDataRef returns [EObject current=null] : iv_ruleOtherDataRef= ruleOtherDataRef EOF ;
    public final EObject entryRuleOtherDataRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOtherDataRef = null;


        try {
            // InternalGumboParser.g:2422:53: (iv_ruleOtherDataRef= ruleOtherDataRef EOF )
            // InternalGumboParser.g:2423:2: iv_ruleOtherDataRef= ruleOtherDataRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOtherDataRefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOtherDataRef=ruleOtherDataRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOtherDataRef; 
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
    // $ANTLR end "entryRuleOtherDataRef"


    // $ANTLR start "ruleOtherDataRef"
    // InternalGumboParser.g:2429:1: ruleOtherDataRef returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= FullStop ( (lv_path_2_0= ruleOtherDataRef ) ) )? ) ;
    public final EObject ruleOtherDataRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_path_2_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2435:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= FullStop ( (lv_path_2_0= ruleOtherDataRef ) ) )? ) )
            // InternalGumboParser.g:2436:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= FullStop ( (lv_path_2_0= ruleOtherDataRef ) ) )? )
            {
            // InternalGumboParser.g:2436:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= FullStop ( (lv_path_2_0= ruleOtherDataRef ) ) )? )
            // InternalGumboParser.g:2437:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= FullStop ( (lv_path_2_0= ruleOtherDataRef ) ) )?
            {
            // InternalGumboParser.g:2437:3: ( (otherlv_0= RULE_ID ) )
            // InternalGumboParser.g:2438:4: (otherlv_0= RULE_ID )
            {
            // InternalGumboParser.g:2438:4: (otherlv_0= RULE_ID )
            // InternalGumboParser.g:2439:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getOtherDataRefRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getOtherDataRefAccess().getNamedElementNamedElementCrossReference_0_0());
              				
            }

            }


            }

            // InternalGumboParser.g:2450:3: (otherlv_1= FullStop ( (lv_path_2_0= ruleOtherDataRef ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==FullStop) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalGumboParser.g:2451:4: otherlv_1= FullStop ( (lv_path_2_0= ruleOtherDataRef ) )
                    {
                    otherlv_1=(Token)match(input,FullStop,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getOtherDataRefAccess().getFullStopKeyword_1_0());
                      			
                    }
                    // InternalGumboParser.g:2455:4: ( (lv_path_2_0= ruleOtherDataRef ) )
                    // InternalGumboParser.g:2456:5: (lv_path_2_0= ruleOtherDataRef )
                    {
                    // InternalGumboParser.g:2456:5: (lv_path_2_0= ruleOtherDataRef )
                    // InternalGumboParser.g:2457:6: lv_path_2_0= ruleOtherDataRef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOtherDataRefAccess().getPathOtherDataRefParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_path_2_0=ruleOtherDataRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOtherDataRefRule());
                      						}
                      						set(
                      							current,
                      							"path",
                      							lv_path_2_0,
                      							"org.sireum.aadl.gumbo.Gumbo.OtherDataRef");
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
    // $ANTLR end "ruleOtherDataRef"


    // $ANTLR start "entryRuleDataElement"
    // InternalGumboParser.g:2479:1: entryRuleDataElement returns [EObject current=null] : iv_ruleDataElement= ruleDataElement EOF ;
    public final EObject entryRuleDataElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataElement = null;


        try {
            // InternalGumboParser.g:2479:52: (iv_ruleDataElement= ruleDataElement EOF )
            // InternalGumboParser.g:2480:2: iv_ruleDataElement= ruleDataElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDataElement=ruleDataElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataElement; 
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
    // $ANTLR end "entryRuleDataElement"


    // $ANTLR start "ruleDataElement"
    // InternalGumboParser.g:2486:1: ruleDataElement returns [EObject current=null] : ( ( ruleQCREF ) ) ;
    public final EObject ruleDataElement() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalGumboParser.g:2492:2: ( ( ( ruleQCREF ) ) )
            // InternalGumboParser.g:2493:2: ( ( ruleQCREF ) )
            {
            // InternalGumboParser.g:2493:2: ( ( ruleQCREF ) )
            // InternalGumboParser.g:2494:3: ( ruleQCREF )
            {
            // InternalGumboParser.g:2494:3: ( ruleQCREF )
            // InternalGumboParser.g:2495:4: ruleQCREF
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getDataElementRule());
              				}
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getDataElementAccess().getDataElementDataSubcomponentTypeCrossReference_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleQCREF();

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
    // $ANTLR end "ruleDataElement"


    // $ANTLR start "entryRuleSlangExpr"
    // InternalGumboParser.g:2512:1: entryRuleSlangExpr returns [EObject current=null] : iv_ruleSlangExpr= ruleSlangExpr EOF ;
    public final EObject entryRuleSlangExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangExpr = null;


        try {
            // InternalGumboParser.g:2512:50: (iv_ruleSlangExpr= ruleSlangExpr EOF )
            // InternalGumboParser.g:2513:2: iv_ruleSlangExpr= ruleSlangExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlangExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlangExpr=ruleSlangExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlangExpr; 
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
    // $ANTLR end "entryRuleSlangExpr"


    // $ANTLR start "ruleSlangExpr"
    // InternalGumboParser.g:2519:1: ruleSlangExpr returns [EObject current=null] : ( ( ( (lv_terms_0_0= ruleSlangAccess ) ) ( (this_OP_1= RULE_OP ( (lv_terms_2_0= ruleSlangAccess ) ) )* | (otherlv_3= QuestionMark ( (lv_then_4_0= ruleSlangExpr ) ) otherlv_5= Colon ( (lv_els_6_0= ruleSlangExpr ) ) ) ) ) | ( (otherlv_7= All | otherlv_8= Some | otherlv_9= ForAll | otherlv_10= ThereExists ) ( (lv_var_11_0= ruleSlangQuantVar ) ) (otherlv_12= Comma ( (lv_var_13_0= ruleSlangQuantVar ) ) )* otherlv_14= EqualsSignGreaterThanSign ( (lv_body_15_0= ruleSlangExpr ) ) ) | (this_OP_16= RULE_OP this_SlangAccess_17= ruleSlangAccess ) ) ;
    public final EObject ruleSlangExpr() throws RecognitionException {
        EObject current = null;

        Token this_OP_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token this_OP_16=null;
        EObject lv_terms_0_0 = null;

        EObject lv_terms_2_0 = null;

        EObject lv_then_4_0 = null;

        EObject lv_els_6_0 = null;

        EObject lv_var_11_0 = null;

        EObject lv_var_13_0 = null;

        EObject lv_body_15_0 = null;

        EObject this_SlangAccess_17 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2525:2: ( ( ( ( (lv_terms_0_0= ruleSlangAccess ) ) ( (this_OP_1= RULE_OP ( (lv_terms_2_0= ruleSlangAccess ) ) )* | (otherlv_3= QuestionMark ( (lv_then_4_0= ruleSlangExpr ) ) otherlv_5= Colon ( (lv_els_6_0= ruleSlangExpr ) ) ) ) ) | ( (otherlv_7= All | otherlv_8= Some | otherlv_9= ForAll | otherlv_10= ThereExists ) ( (lv_var_11_0= ruleSlangQuantVar ) ) (otherlv_12= Comma ( (lv_var_13_0= ruleSlangQuantVar ) ) )* otherlv_14= EqualsSignGreaterThanSign ( (lv_body_15_0= ruleSlangExpr ) ) ) | (this_OP_16= RULE_OP this_SlangAccess_17= ruleSlangAccess ) ) )
            // InternalGumboParser.g:2526:2: ( ( ( (lv_terms_0_0= ruleSlangAccess ) ) ( (this_OP_1= RULE_OP ( (lv_terms_2_0= ruleSlangAccess ) ) )* | (otherlv_3= QuestionMark ( (lv_then_4_0= ruleSlangExpr ) ) otherlv_5= Colon ( (lv_els_6_0= ruleSlangExpr ) ) ) ) ) | ( (otherlv_7= All | otherlv_8= Some | otherlv_9= ForAll | otherlv_10= ThereExists ) ( (lv_var_11_0= ruleSlangQuantVar ) ) (otherlv_12= Comma ( (lv_var_13_0= ruleSlangQuantVar ) ) )* otherlv_14= EqualsSignGreaterThanSign ( (lv_body_15_0= ruleSlangExpr ) ) ) | (this_OP_16= RULE_OP this_SlangAccess_17= ruleSlangAccess ) )
            {
            // InternalGumboParser.g:2526:2: ( ( ( (lv_terms_0_0= ruleSlangAccess ) ) ( (this_OP_1= RULE_OP ( (lv_terms_2_0= ruleSlangAccess ) ) )* | (otherlv_3= QuestionMark ( (lv_then_4_0= ruleSlangExpr ) ) otherlv_5= Colon ( (lv_els_6_0= ruleSlangExpr ) ) ) ) ) | ( (otherlv_7= All | otherlv_8= Some | otherlv_9= ForAll | otherlv_10= ThereExists ) ( (lv_var_11_0= ruleSlangQuantVar ) ) (otherlv_12= Comma ( (lv_var_13_0= ruleSlangQuantVar ) ) )* otherlv_14= EqualsSignGreaterThanSign ( (lv_body_15_0= ruleSlangExpr ) ) ) | (this_OP_16= RULE_OP this_SlangAccess_17= ruleSlangAccess ) )
            int alt38=3;
            switch ( input.LA(1) ) {
            case LeftParenthesis:
            case RULE_ID:
                {
                alt38=1;
                }
                break;
            case Some:
            case All:
            case ForAll:
            case ThereExists:
                {
                alt38=2;
                }
                break;
            case RULE_OP:
                {
                alt38=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalGumboParser.g:2527:3: ( ( (lv_terms_0_0= ruleSlangAccess ) ) ( (this_OP_1= RULE_OP ( (lv_terms_2_0= ruleSlangAccess ) ) )* | (otherlv_3= QuestionMark ( (lv_then_4_0= ruleSlangExpr ) ) otherlv_5= Colon ( (lv_els_6_0= ruleSlangExpr ) ) ) ) )
                    {
                    // InternalGumboParser.g:2527:3: ( ( (lv_terms_0_0= ruleSlangAccess ) ) ( (this_OP_1= RULE_OP ( (lv_terms_2_0= ruleSlangAccess ) ) )* | (otherlv_3= QuestionMark ( (lv_then_4_0= ruleSlangExpr ) ) otherlv_5= Colon ( (lv_els_6_0= ruleSlangExpr ) ) ) ) )
                    // InternalGumboParser.g:2528:4: ( (lv_terms_0_0= ruleSlangAccess ) ) ( (this_OP_1= RULE_OP ( (lv_terms_2_0= ruleSlangAccess ) ) )* | (otherlv_3= QuestionMark ( (lv_then_4_0= ruleSlangExpr ) ) otherlv_5= Colon ( (lv_els_6_0= ruleSlangExpr ) ) ) )
                    {
                    // InternalGumboParser.g:2528:4: ( (lv_terms_0_0= ruleSlangAccess ) )
                    // InternalGumboParser.g:2529:5: (lv_terms_0_0= ruleSlangAccess )
                    {
                    // InternalGumboParser.g:2529:5: (lv_terms_0_0= ruleSlangAccess )
                    // InternalGumboParser.g:2530:6: lv_terms_0_0= ruleSlangAccess
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangExprAccess().getTermsSlangAccessParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_41);
                    lv_terms_0_0=ruleSlangAccess();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlangExprRule());
                      						}
                      						add(
                      							current,
                      							"terms",
                      							lv_terms_0_0,
                      							"org.sireum.aadl.gumbo.Gumbo.SlangAccess");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:2547:4: ( (this_OP_1= RULE_OP ( (lv_terms_2_0= ruleSlangAccess ) ) )* | (otherlv_3= QuestionMark ( (lv_then_4_0= ruleSlangExpr ) ) otherlv_5= Colon ( (lv_els_6_0= ruleSlangExpr ) ) ) )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==EOF||LA35_0==FullStopFullStopLessThanSign||LA35_0==FullStopFullStop||LA35_0==EqualsSignGreaterThanSign||LA35_0==RightParenthesis||LA35_0==Comma||LA35_0==Colon||LA35_0==RULE_OP) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==QuestionMark) ) {
                        alt35=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalGumboParser.g:2548:5: (this_OP_1= RULE_OP ( (lv_terms_2_0= ruleSlangAccess ) ) )*
                            {
                            // InternalGumboParser.g:2548:5: (this_OP_1= RULE_OP ( (lv_terms_2_0= ruleSlangAccess ) ) )*
                            loop34:
                            do {
                                int alt34=2;
                                int LA34_0 = input.LA(1);

                                if ( (LA34_0==RULE_OP) ) {
                                    alt34=1;
                                }


                                switch (alt34) {
                            	case 1 :
                            	    // InternalGumboParser.g:2549:6: this_OP_1= RULE_OP ( (lv_terms_2_0= ruleSlangAccess ) )
                            	    {
                            	    this_OP_1=(Token)match(input,RULE_OP,FollowSets000.FOLLOW_42); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(this_OP_1, grammarAccess.getSlangExprAccess().getOPTerminalRuleCall_0_1_0_0());
                            	      					
                            	    }
                            	    // InternalGumboParser.g:2553:6: ( (lv_terms_2_0= ruleSlangAccess ) )
                            	    // InternalGumboParser.g:2554:7: (lv_terms_2_0= ruleSlangAccess )
                            	    {
                            	    // InternalGumboParser.g:2554:7: (lv_terms_2_0= ruleSlangAccess )
                            	    // InternalGumboParser.g:2555:8: lv_terms_2_0= ruleSlangAccess
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getSlangExprAccess().getTermsSlangAccessParserRuleCall_0_1_0_1_0());
                            	      							
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_43);
                            	    lv_terms_2_0=ruleSlangAccess();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getSlangExprRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"terms",
                            	      									lv_terms_2_0,
                            	      									"org.sireum.aadl.gumbo.Gumbo.SlangAccess");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop34;
                                }
                            } while (true);


                            }
                            break;
                        case 2 :
                            // InternalGumboParser.g:2574:5: (otherlv_3= QuestionMark ( (lv_then_4_0= ruleSlangExpr ) ) otherlv_5= Colon ( (lv_els_6_0= ruleSlangExpr ) ) )
                            {
                            // InternalGumboParser.g:2574:5: (otherlv_3= QuestionMark ( (lv_then_4_0= ruleSlangExpr ) ) otherlv_5= Colon ( (lv_els_6_0= ruleSlangExpr ) ) )
                            // InternalGumboParser.g:2575:6: otherlv_3= QuestionMark ( (lv_then_4_0= ruleSlangExpr ) ) otherlv_5= Colon ( (lv_els_6_0= ruleSlangExpr ) )
                            {
                            otherlv_3=(Token)match(input,QuestionMark,FollowSets000.FOLLOW_44); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_3, grammarAccess.getSlangExprAccess().getQuestionMarkKeyword_0_1_1_0());
                              					
                            }
                            // InternalGumboParser.g:2579:6: ( (lv_then_4_0= ruleSlangExpr ) )
                            // InternalGumboParser.g:2580:7: (lv_then_4_0= ruleSlangExpr )
                            {
                            // InternalGumboParser.g:2580:7: (lv_then_4_0= ruleSlangExpr )
                            // InternalGumboParser.g:2581:8: lv_then_4_0= ruleSlangExpr
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getSlangExprAccess().getThenSlangExprParserRuleCall_0_1_1_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_12);
                            lv_then_4_0=ruleSlangExpr();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getSlangExprRule());
                              								}
                              								set(
                              									current,
                              									"then",
                              									lv_then_4_0,
                              									"org.sireum.aadl.gumbo.Gumbo.SlangExpr");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            otherlv_5=(Token)match(input,Colon,FollowSets000.FOLLOW_44); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_5, grammarAccess.getSlangExprAccess().getColonKeyword_0_1_1_2());
                              					
                            }
                            // InternalGumboParser.g:2602:6: ( (lv_els_6_0= ruleSlangExpr ) )
                            // InternalGumboParser.g:2603:7: (lv_els_6_0= ruleSlangExpr )
                            {
                            // InternalGumboParser.g:2603:7: (lv_els_6_0= ruleSlangExpr )
                            // InternalGumboParser.g:2604:8: lv_els_6_0= ruleSlangExpr
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getSlangExprAccess().getElsSlangExprParserRuleCall_0_1_1_3_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_els_6_0=ruleSlangExpr();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getSlangExprRule());
                              								}
                              								set(
                              									current,
                              									"els",
                              									lv_els_6_0,
                              									"org.sireum.aadl.gumbo.Gumbo.SlangExpr");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:2625:3: ( (otherlv_7= All | otherlv_8= Some | otherlv_9= ForAll | otherlv_10= ThereExists ) ( (lv_var_11_0= ruleSlangQuantVar ) ) (otherlv_12= Comma ( (lv_var_13_0= ruleSlangQuantVar ) ) )* otherlv_14= EqualsSignGreaterThanSign ( (lv_body_15_0= ruleSlangExpr ) ) )
                    {
                    // InternalGumboParser.g:2625:3: ( (otherlv_7= All | otherlv_8= Some | otherlv_9= ForAll | otherlv_10= ThereExists ) ( (lv_var_11_0= ruleSlangQuantVar ) ) (otherlv_12= Comma ( (lv_var_13_0= ruleSlangQuantVar ) ) )* otherlv_14= EqualsSignGreaterThanSign ( (lv_body_15_0= ruleSlangExpr ) ) )
                    // InternalGumboParser.g:2626:4: (otherlv_7= All | otherlv_8= Some | otherlv_9= ForAll | otherlv_10= ThereExists ) ( (lv_var_11_0= ruleSlangQuantVar ) ) (otherlv_12= Comma ( (lv_var_13_0= ruleSlangQuantVar ) ) )* otherlv_14= EqualsSignGreaterThanSign ( (lv_body_15_0= ruleSlangExpr ) )
                    {
                    // InternalGumboParser.g:2626:4: (otherlv_7= All | otherlv_8= Some | otherlv_9= ForAll | otherlv_10= ThereExists )
                    int alt36=4;
                    switch ( input.LA(1) ) {
                    case All:
                        {
                        alt36=1;
                        }
                        break;
                    case Some:
                        {
                        alt36=2;
                        }
                        break;
                    case ForAll:
                        {
                        alt36=3;
                        }
                        break;
                    case ThereExists:
                        {
                        alt36=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 0, input);

                        throw nvae;
                    }

                    switch (alt36) {
                        case 1 :
                            // InternalGumboParser.g:2627:5: otherlv_7= All
                            {
                            otherlv_7=(Token)match(input,All,FollowSets000.FOLLOW_10); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_7, grammarAccess.getSlangExprAccess().getAllKeyword_1_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalGumboParser.g:2632:5: otherlv_8= Some
                            {
                            otherlv_8=(Token)match(input,Some,FollowSets000.FOLLOW_10); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_8, grammarAccess.getSlangExprAccess().getSomeKeyword_1_0_1());
                              				
                            }

                            }
                            break;
                        case 3 :
                            // InternalGumboParser.g:2637:5: otherlv_9= ForAll
                            {
                            otherlv_9=(Token)match(input,ForAll,FollowSets000.FOLLOW_10); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_9, grammarAccess.getSlangExprAccess().getForAllKeyword_1_0_2());
                              				
                            }

                            }
                            break;
                        case 4 :
                            // InternalGumboParser.g:2642:5: otherlv_10= ThereExists
                            {
                            otherlv_10=(Token)match(input,ThereExists,FollowSets000.FOLLOW_10); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_10, grammarAccess.getSlangExprAccess().getThereExistsKeyword_1_0_3());
                              				
                            }

                            }
                            break;

                    }

                    // InternalGumboParser.g:2647:4: ( (lv_var_11_0= ruleSlangQuantVar ) )
                    // InternalGumboParser.g:2648:5: (lv_var_11_0= ruleSlangQuantVar )
                    {
                    // InternalGumboParser.g:2648:5: (lv_var_11_0= ruleSlangQuantVar )
                    // InternalGumboParser.g:2649:6: lv_var_11_0= ruleSlangQuantVar
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangExprAccess().getVarSlangQuantVarParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_45);
                    lv_var_11_0=ruleSlangQuantVar();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlangExprRule());
                      						}
                      						add(
                      							current,
                      							"var",
                      							lv_var_11_0,
                      							"org.sireum.aadl.gumbo.Gumbo.SlangQuantVar");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:2666:4: (otherlv_12= Comma ( (lv_var_13_0= ruleSlangQuantVar ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==Comma) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalGumboParser.g:2667:5: otherlv_12= Comma ( (lv_var_13_0= ruleSlangQuantVar ) )
                    	    {
                    	    otherlv_12=(Token)match(input,Comma,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_12, grammarAccess.getSlangExprAccess().getCommaKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:2671:5: ( (lv_var_13_0= ruleSlangQuantVar ) )
                    	    // InternalGumboParser.g:2672:6: (lv_var_13_0= ruleSlangQuantVar )
                    	    {
                    	    // InternalGumboParser.g:2672:6: (lv_var_13_0= ruleSlangQuantVar )
                    	    // InternalGumboParser.g:2673:7: lv_var_13_0= ruleSlangQuantVar
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSlangExprAccess().getVarSlangQuantVarParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_45);
                    	    lv_var_13_0=ruleSlangQuantVar();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSlangExprRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"var",
                    	      								lv_var_13_0,
                    	      								"org.sireum.aadl.gumbo.Gumbo.SlangQuantVar");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_44); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getSlangExprAccess().getEqualsSignGreaterThanSignKeyword_1_3());
                      			
                    }
                    // InternalGumboParser.g:2695:4: ( (lv_body_15_0= ruleSlangExpr ) )
                    // InternalGumboParser.g:2696:5: (lv_body_15_0= ruleSlangExpr )
                    {
                    // InternalGumboParser.g:2696:5: (lv_body_15_0= ruleSlangExpr )
                    // InternalGumboParser.g:2697:6: lv_body_15_0= ruleSlangExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangExprAccess().getBodySlangExprParserRuleCall_1_4_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_body_15_0=ruleSlangExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlangExprRule());
                      						}
                      						set(
                      							current,
                      							"body",
                      							lv_body_15_0,
                      							"org.sireum.aadl.gumbo.Gumbo.SlangExpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGumboParser.g:2716:3: (this_OP_16= RULE_OP this_SlangAccess_17= ruleSlangAccess )
                    {
                    // InternalGumboParser.g:2716:3: (this_OP_16= RULE_OP this_SlangAccess_17= ruleSlangAccess )
                    // InternalGumboParser.g:2717:4: this_OP_16= RULE_OP this_SlangAccess_17= ruleSlangAccess
                    {
                    this_OP_16=(Token)match(input,RULE_OP,FollowSets000.FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_OP_16, grammarAccess.getSlangExprAccess().getOPTerminalRuleCall_2_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSlangExprAccess().getSlangAccessParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_SlangAccess_17=ruleSlangAccess();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_SlangAccess_17;
                      				afterParserOrEnumRuleCall();
                      			
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
    // $ANTLR end "ruleSlangExpr"


    // $ANTLR start "entryRuleSlangQuantVar"
    // InternalGumboParser.g:2734:1: entryRuleSlangQuantVar returns [EObject current=null] : iv_ruleSlangQuantVar= ruleSlangQuantVar EOF ;
    public final EObject entryRuleSlangQuantVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangQuantVar = null;


        try {
            // InternalGumboParser.g:2734:54: (iv_ruleSlangQuantVar= ruleSlangQuantVar EOF )
            // InternalGumboParser.g:2735:2: iv_ruleSlangQuantVar= ruleSlangQuantVar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlangQuantVarRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlangQuantVar=ruleSlangQuantVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlangQuantVar; 
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
    // $ANTLR end "entryRuleSlangQuantVar"


    // $ANTLR start "ruleSlangQuantVar"
    // InternalGumboParser.g:2741:1: ruleSlangQuantVar returns [EObject current=null] : (this_ID_0= RULE_ID otherlv_1= Colon ( (lv_val_2_0= ruleSlangExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upperBound_5_0= ruleSlangExpr ) ) )? ) ;
    public final EObject ruleSlangQuantVar() throws RecognitionException {
        EObject current = null;

        Token this_ID_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_val_2_0 = null;

        EObject lv_upperBound_5_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2747:2: ( (this_ID_0= RULE_ID otherlv_1= Colon ( (lv_val_2_0= ruleSlangExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upperBound_5_0= ruleSlangExpr ) ) )? ) )
            // InternalGumboParser.g:2748:2: (this_ID_0= RULE_ID otherlv_1= Colon ( (lv_val_2_0= ruleSlangExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upperBound_5_0= ruleSlangExpr ) ) )? )
            {
            // InternalGumboParser.g:2748:2: (this_ID_0= RULE_ID otherlv_1= Colon ( (lv_val_2_0= ruleSlangExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upperBound_5_0= ruleSlangExpr ) ) )? )
            // InternalGumboParser.g:2749:3: this_ID_0= RULE_ID otherlv_1= Colon ( (lv_val_2_0= ruleSlangExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upperBound_5_0= ruleSlangExpr ) ) )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getSlangQuantVarAccess().getIDTerminalRuleCall_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FollowSets000.FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSlangQuantVarAccess().getColonKeyword_1());
              		
            }
            // InternalGumboParser.g:2757:3: ( (lv_val_2_0= ruleSlangExpr ) )
            // InternalGumboParser.g:2758:4: (lv_val_2_0= ruleSlangExpr )
            {
            // InternalGumboParser.g:2758:4: (lv_val_2_0= ruleSlangExpr )
            // InternalGumboParser.g:2759:5: lv_val_2_0= ruleSlangExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangQuantVarAccess().getValSlangExprParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_46);
            lv_val_2_0=ruleSlangExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSlangQuantVarRule());
              					}
              					set(
              						current,
              						"val",
              						lv_val_2_0,
              						"org.sireum.aadl.gumbo.Gumbo.SlangExpr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumboParser.g:2776:3: ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upperBound_5_0= ruleSlangExpr ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==FullStopFullStopLessThanSign||LA40_0==FullStopFullStop) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalGumboParser.g:2777:4: (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upperBound_5_0= ruleSlangExpr ) )
                    {
                    // InternalGumboParser.g:2777:4: (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==FullStopFullStop) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==FullStopFullStopLessThanSign) ) {
                        alt39=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 0, input);

                        throw nvae;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalGumboParser.g:2778:5: otherlv_3= FullStopFullStop
                            {
                            otherlv_3=(Token)match(input,FullStopFullStop,FollowSets000.FOLLOW_44); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_3, grammarAccess.getSlangQuantVarAccess().getFullStopFullStopKeyword_3_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalGumboParser.g:2783:5: otherlv_4= FullStopFullStopLessThanSign
                            {
                            otherlv_4=(Token)match(input,FullStopFullStopLessThanSign,FollowSets000.FOLLOW_44); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getSlangQuantVarAccess().getFullStopFullStopLessThanSignKeyword_3_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalGumboParser.g:2788:4: ( (lv_upperBound_5_0= ruleSlangExpr ) )
                    // InternalGumboParser.g:2789:5: (lv_upperBound_5_0= ruleSlangExpr )
                    {
                    // InternalGumboParser.g:2789:5: (lv_upperBound_5_0= ruleSlangExpr )
                    // InternalGumboParser.g:2790:6: lv_upperBound_5_0= ruleSlangExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangQuantVarAccess().getUpperBoundSlangExprParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_upperBound_5_0=ruleSlangExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlangQuantVarRule());
                      						}
                      						set(
                      							current,
                      							"upperBound",
                      							lv_upperBound_5_0,
                      							"org.sireum.aadl.gumbo.Gumbo.SlangExpr");
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
    // $ANTLR end "ruleSlangQuantVar"


    // $ANTLR start "entryRuleSlangAccess"
    // InternalGumboParser.g:2812:1: entryRuleSlangAccess returns [EObject current=null] : iv_ruleSlangAccess= ruleSlangAccess EOF ;
    public final EObject entryRuleSlangAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangAccess = null;


        try {
            // InternalGumboParser.g:2812:52: (iv_ruleSlangAccess= ruleSlangAccess EOF )
            // InternalGumboParser.g:2813:2: iv_ruleSlangAccess= ruleSlangAccess EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlangAccessRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlangAccess=ruleSlangAccess();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlangAccess; 
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
    // $ANTLR end "entryRuleSlangAccess"


    // $ANTLR start "ruleSlangAccess"
    // InternalGumboParser.g:2819:1: ruleSlangAccess returns [EObject current=null] : ( ( (lv_t_0_0= ruleSlangTerm ) ) ( (lv_suf_1_0= ruleAccessSuffix ) )* ) ;
    public final EObject ruleSlangAccess() throws RecognitionException {
        EObject current = null;

        EObject lv_t_0_0 = null;

        EObject lv_suf_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2825:2: ( ( ( (lv_t_0_0= ruleSlangTerm ) ) ( (lv_suf_1_0= ruleAccessSuffix ) )* ) )
            // InternalGumboParser.g:2826:2: ( ( (lv_t_0_0= ruleSlangTerm ) ) ( (lv_suf_1_0= ruleAccessSuffix ) )* )
            {
            // InternalGumboParser.g:2826:2: ( ( (lv_t_0_0= ruleSlangTerm ) ) ( (lv_suf_1_0= ruleAccessSuffix ) )* )
            // InternalGumboParser.g:2827:3: ( (lv_t_0_0= ruleSlangTerm ) ) ( (lv_suf_1_0= ruleAccessSuffix ) )*
            {
            // InternalGumboParser.g:2827:3: ( (lv_t_0_0= ruleSlangTerm ) )
            // InternalGumboParser.g:2828:4: (lv_t_0_0= ruleSlangTerm )
            {
            // InternalGumboParser.g:2828:4: (lv_t_0_0= ruleSlangTerm )
            // InternalGumboParser.g:2829:5: lv_t_0_0= ruleSlangTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangAccessAccess().getTSlangTermParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_40);
            lv_t_0_0=ruleSlangTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSlangAccessRule());
              					}
              					set(
              						current,
              						"t",
              						lv_t_0_0,
              						"org.sireum.aadl.gumbo.Gumbo.SlangTerm");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumboParser.g:2846:3: ( (lv_suf_1_0= ruleAccessSuffix ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==FullStop) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalGumboParser.g:2847:4: (lv_suf_1_0= ruleAccessSuffix )
            	    {
            	    // InternalGumboParser.g:2847:4: (lv_suf_1_0= ruleAccessSuffix )
            	    // InternalGumboParser.g:2848:5: lv_suf_1_0= ruleAccessSuffix
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSlangAccessAccess().getSufAccessSuffixParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_40);
            	    lv_suf_1_0=ruleAccessSuffix();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSlangAccessRule());
            	      					}
            	      					set(
            	      						current,
            	      						"suf",
            	      						lv_suf_1_0,
            	      						"org.sireum.aadl.gumbo.Gumbo.AccessSuffix");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // $ANTLR end "ruleSlangAccess"


    // $ANTLR start "entryRuleAccessSuffix"
    // InternalGumboParser.g:2869:1: entryRuleAccessSuffix returns [EObject current=null] : iv_ruleAccessSuffix= ruleAccessSuffix EOF ;
    public final EObject entryRuleAccessSuffix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessSuffix = null;


        try {
            // InternalGumboParser.g:2869:53: (iv_ruleAccessSuffix= ruleAccessSuffix EOF )
            // InternalGumboParser.g:2870:2: iv_ruleAccessSuffix= ruleAccessSuffix EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAccessSuffixRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAccessSuffix=ruleAccessSuffix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAccessSuffix; 
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
    // $ANTLR end "entryRuleAccessSuffix"


    // $ANTLR start "ruleAccessSuffix"
    // InternalGumboParser.g:2876:1: ruleAccessSuffix returns [EObject current=null] : (otherlv_0= FullStop this_ID_1= RULE_ID (this_CallSuffix_2= ruleCallSuffix )? ) ;
    public final EObject ruleAccessSuffix() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_ID_1=null;
        EObject this_CallSuffix_2 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2882:2: ( (otherlv_0= FullStop this_ID_1= RULE_ID (this_CallSuffix_2= ruleCallSuffix )? ) )
            // InternalGumboParser.g:2883:2: (otherlv_0= FullStop this_ID_1= RULE_ID (this_CallSuffix_2= ruleCallSuffix )? )
            {
            // InternalGumboParser.g:2883:2: (otherlv_0= FullStop this_ID_1= RULE_ID (this_CallSuffix_2= ruleCallSuffix )? )
            // InternalGumboParser.g:2884:3: otherlv_0= FullStop this_ID_1= RULE_ID (this_CallSuffix_2= ruleCallSuffix )?
            {
            otherlv_0=(Token)match(input,FullStop,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAccessSuffixAccess().getFullStopKeyword_0());
              		
            }
            this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_1, grammarAccess.getAccessSuffixAccess().getIDTerminalRuleCall_1());
              		
            }
            // InternalGumboParser.g:2892:3: (this_CallSuffix_2= ruleCallSuffix )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==LeftParenthesis||LA42_0==LeftSquareBracket) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalGumboParser.g:2893:4: this_CallSuffix_2= ruleCallSuffix
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAccessSuffixAccess().getCallSuffixParserRuleCall_2());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CallSuffix_2=ruleCallSuffix();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_CallSuffix_2;
                      				afterParserOrEnumRuleCall();
                      			
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
    // $ANTLR end "ruleAccessSuffix"


    // $ANTLR start "entryRuleSlangTerm"
    // InternalGumboParser.g:2906:1: entryRuleSlangTerm returns [EObject current=null] : iv_ruleSlangTerm= ruleSlangTerm EOF ;
    public final EObject entryRuleSlangTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangTerm = null;


        try {
            // InternalGumboParser.g:2906:50: (iv_ruleSlangTerm= ruleSlangTerm EOF )
            // InternalGumboParser.g:2907:2: iv_ruleSlangTerm= ruleSlangTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlangTermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlangTerm=ruleSlangTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlangTerm; 
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
    // $ANTLR end "entryRuleSlangTerm"


    // $ANTLR start "ruleSlangTerm"
    // InternalGumboParser.g:2913:1: ruleSlangTerm returns [EObject current=null] : (this_ID_0= RULE_ID | (otherlv_1= LeftParenthesis ( (lv_tuple_2_0= ruleSlangExpr ) ) (otherlv_3= Comma ( (lv_tuple_4_0= ruleSlangExpr ) ) )* otherlv_5= RightParenthesis ) ) ;
    public final EObject ruleSlangTerm() throws RecognitionException {
        EObject current = null;

        Token this_ID_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_tuple_2_0 = null;

        EObject lv_tuple_4_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2919:2: ( (this_ID_0= RULE_ID | (otherlv_1= LeftParenthesis ( (lv_tuple_2_0= ruleSlangExpr ) ) (otherlv_3= Comma ( (lv_tuple_4_0= ruleSlangExpr ) ) )* otherlv_5= RightParenthesis ) ) )
            // InternalGumboParser.g:2920:2: (this_ID_0= RULE_ID | (otherlv_1= LeftParenthesis ( (lv_tuple_2_0= ruleSlangExpr ) ) (otherlv_3= Comma ( (lv_tuple_4_0= ruleSlangExpr ) ) )* otherlv_5= RightParenthesis ) )
            {
            // InternalGumboParser.g:2920:2: (this_ID_0= RULE_ID | (otherlv_1= LeftParenthesis ( (lv_tuple_2_0= ruleSlangExpr ) ) (otherlv_3= Comma ( (lv_tuple_4_0= ruleSlangExpr ) ) )* otherlv_5= RightParenthesis ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                alt44=1;
            }
            else if ( (LA44_0==LeftParenthesis) ) {
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
                    // InternalGumboParser.g:2921:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_0, grammarAccess.getSlangTermAccess().getIDTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:2926:3: (otherlv_1= LeftParenthesis ( (lv_tuple_2_0= ruleSlangExpr ) ) (otherlv_3= Comma ( (lv_tuple_4_0= ruleSlangExpr ) ) )* otherlv_5= RightParenthesis )
                    {
                    // InternalGumboParser.g:2926:3: (otherlv_1= LeftParenthesis ( (lv_tuple_2_0= ruleSlangExpr ) ) (otherlv_3= Comma ( (lv_tuple_4_0= ruleSlangExpr ) ) )* otherlv_5= RightParenthesis )
                    // InternalGumboParser.g:2927:4: otherlv_1= LeftParenthesis ( (lv_tuple_2_0= ruleSlangExpr ) ) (otherlv_3= Comma ( (lv_tuple_4_0= ruleSlangExpr ) ) )* otherlv_5= RightParenthesis
                    {
                    otherlv_1=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_44); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getSlangTermAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalGumboParser.g:2931:4: ( (lv_tuple_2_0= ruleSlangExpr ) )
                    // InternalGumboParser.g:2932:5: (lv_tuple_2_0= ruleSlangExpr )
                    {
                    // InternalGumboParser.g:2932:5: (lv_tuple_2_0= ruleSlangExpr )
                    // InternalGumboParser.g:2933:6: lv_tuple_2_0= ruleSlangExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangTermAccess().getTupleSlangExprParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_47);
                    lv_tuple_2_0=ruleSlangExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlangTermRule());
                      						}
                      						add(
                      							current,
                      							"tuple",
                      							lv_tuple_2_0,
                      							"org.sireum.aadl.gumbo.Gumbo.SlangExpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:2950:4: (otherlv_3= Comma ( (lv_tuple_4_0= ruleSlangExpr ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==Comma) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalGumboParser.g:2951:5: otherlv_3= Comma ( (lv_tuple_4_0= ruleSlangExpr ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FollowSets000.FOLLOW_44); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getSlangTermAccess().getCommaKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:2955:5: ( (lv_tuple_4_0= ruleSlangExpr ) )
                    	    // InternalGumboParser.g:2956:6: (lv_tuple_4_0= ruleSlangExpr )
                    	    {
                    	    // InternalGumboParser.g:2956:6: (lv_tuple_4_0= ruleSlangExpr )
                    	    // InternalGumboParser.g:2957:7: lv_tuple_4_0= ruleSlangExpr
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSlangTermAccess().getTupleSlangExprParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_47);
                    	    lv_tuple_4_0=ruleSlangExpr();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSlangTermRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"tuple",
                    	      								lv_tuple_4_0,
                    	      								"org.sireum.aadl.gumbo.Gumbo.SlangExpr");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getSlangTermAccess().getRightParenthesisKeyword_1_3());
                      			
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
    // $ANTLR end "ruleSlangTerm"


    // $ANTLR start "entryRuleCallSuffix"
    // InternalGumboParser.g:2984:1: entryRuleCallSuffix returns [EObject current=null] : iv_ruleCallSuffix= ruleCallSuffix EOF ;
    public final EObject entryRuleCallSuffix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallSuffix = null;


        try {
            // InternalGumboParser.g:2984:51: (iv_ruleCallSuffix= ruleCallSuffix EOF )
            // InternalGumboParser.g:2985:2: iv_ruleCallSuffix= ruleCallSuffix EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCallSuffixRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCallSuffix=ruleCallSuffix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCallSuffix; 
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
    // $ANTLR end "entryRuleCallSuffix"


    // $ANTLR start "ruleCallSuffix"
    // InternalGumboParser.g:2991:1: ruleCallSuffix returns [EObject current=null] : ( ( ruleTypeArgs ( (lv_args_1_0= ruleCallArgs ) )? ) | ( (lv_args_2_0= ruleCallArgs ) ) ) ;
    public final EObject ruleCallSuffix() throws RecognitionException {
        EObject current = null;

        EObject lv_args_1_0 = null;

        EObject lv_args_2_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2997:2: ( ( ( ruleTypeArgs ( (lv_args_1_0= ruleCallArgs ) )? ) | ( (lv_args_2_0= ruleCallArgs ) ) ) )
            // InternalGumboParser.g:2998:2: ( ( ruleTypeArgs ( (lv_args_1_0= ruleCallArgs ) )? ) | ( (lv_args_2_0= ruleCallArgs ) ) )
            {
            // InternalGumboParser.g:2998:2: ( ( ruleTypeArgs ( (lv_args_1_0= ruleCallArgs ) )? ) | ( (lv_args_2_0= ruleCallArgs ) ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==LeftSquareBracket) ) {
                alt46=1;
            }
            else if ( (LA46_0==LeftParenthesis) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalGumboParser.g:2999:3: ( ruleTypeArgs ( (lv_args_1_0= ruleCallArgs ) )? )
                    {
                    // InternalGumboParser.g:2999:3: ( ruleTypeArgs ( (lv_args_1_0= ruleCallArgs ) )? )
                    // InternalGumboParser.g:3000:4: ruleTypeArgs ( (lv_args_1_0= ruleCallArgs ) )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getCallSuffixAccess().getTypeArgsParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_33);
                    ruleTypeArgs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalGumboParser.g:3007:4: ( (lv_args_1_0= ruleCallArgs ) )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==LeftParenthesis) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalGumboParser.g:3008:5: (lv_args_1_0= ruleCallArgs )
                            {
                            // InternalGumboParser.g:3008:5: (lv_args_1_0= ruleCallArgs )
                            // InternalGumboParser.g:3009:6: lv_args_1_0= ruleCallArgs
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getCallSuffixAccess().getArgsCallArgsParserRuleCall_0_1_0());
                              					
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_args_1_0=ruleCallArgs();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getCallSuffixRule());
                              						}
                              						set(
                              							current,
                              							"args",
                              							lv_args_1_0,
                              							"org.sireum.aadl.gumbo.Gumbo.CallArgs");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:3028:3: ( (lv_args_2_0= ruleCallArgs ) )
                    {
                    // InternalGumboParser.g:3028:3: ( (lv_args_2_0= ruleCallArgs ) )
                    // InternalGumboParser.g:3029:4: (lv_args_2_0= ruleCallArgs )
                    {
                    // InternalGumboParser.g:3029:4: (lv_args_2_0= ruleCallArgs )
                    // InternalGumboParser.g:3030:5: lv_args_2_0= ruleCallArgs
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCallSuffixAccess().getArgsCallArgsParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_args_2_0=ruleCallArgs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCallSuffixRule());
                      					}
                      					set(
                      						current,
                      						"args",
                      						lv_args_2_0,
                      						"org.sireum.aadl.gumbo.Gumbo.CallArgs");
                      					afterParserOrEnumRuleCall();
                      				
                    }

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
    // $ANTLR end "ruleCallSuffix"


    // $ANTLR start "entryRuleCallArgs"
    // InternalGumboParser.g:3051:1: entryRuleCallArgs returns [EObject current=null] : iv_ruleCallArgs= ruleCallArgs EOF ;
    public final EObject entryRuleCallArgs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallArgs = null;


        try {
            // InternalGumboParser.g:3051:49: (iv_ruleCallArgs= ruleCallArgs EOF )
            // InternalGumboParser.g:3052:2: iv_ruleCallArgs= ruleCallArgs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCallArgsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCallArgs=ruleCallArgs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCallArgs; 
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
    // $ANTLR end "entryRuleCallArgs"


    // $ANTLR start "ruleCallArgs"
    // InternalGumboParser.g:3058:1: ruleCallArgs returns [EObject current=null] : (otherlv_0= LeftParenthesis ( ( (lv_f_1_0= ruleIdExp ) ) (otherlv_2= Comma ( (lv_f_3_0= ruleIdExp ) ) )* )? otherlv_4= RightParenthesis ) ;
    public final EObject ruleCallArgs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_f_1_0 = null;

        EObject lv_f_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:3064:2: ( (otherlv_0= LeftParenthesis ( ( (lv_f_1_0= ruleIdExp ) ) (otherlv_2= Comma ( (lv_f_3_0= ruleIdExp ) ) )* )? otherlv_4= RightParenthesis ) )
            // InternalGumboParser.g:3065:2: (otherlv_0= LeftParenthesis ( ( (lv_f_1_0= ruleIdExp ) ) (otherlv_2= Comma ( (lv_f_3_0= ruleIdExp ) ) )* )? otherlv_4= RightParenthesis )
            {
            // InternalGumboParser.g:3065:2: (otherlv_0= LeftParenthesis ( ( (lv_f_1_0= ruleIdExp ) ) (otherlv_2= Comma ( (lv_f_3_0= ruleIdExp ) ) )* )? otherlv_4= RightParenthesis )
            // InternalGumboParser.g:3066:3: otherlv_0= LeftParenthesis ( ( (lv_f_1_0= ruleIdExp ) ) (otherlv_2= Comma ( (lv_f_3_0= ruleIdExp ) ) )* )? otherlv_4= RightParenthesis
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCallArgsAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalGumboParser.g:3070:3: ( ( (lv_f_1_0= ruleIdExp ) ) (otherlv_2= Comma ( (lv_f_3_0= ruleIdExp ) ) )* )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=False && LA48_0<=Floor)||(LA48_0>=Enum && LA48_0<=Real)||LA48_0==True||LA48_0==Not||LA48_0==LeftParenthesis||LA48_0==HyphenMinus||LA48_0==RULE_REAL_LIT||LA48_0==RULE_INTEGER_LIT||LA48_0==RULE_ID) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalGumboParser.g:3071:4: ( (lv_f_1_0= ruleIdExp ) ) (otherlv_2= Comma ( (lv_f_3_0= ruleIdExp ) ) )*
                    {
                    // InternalGumboParser.g:3071:4: ( (lv_f_1_0= ruleIdExp ) )
                    // InternalGumboParser.g:3072:5: (lv_f_1_0= ruleIdExp )
                    {
                    // InternalGumboParser.g:3072:5: (lv_f_1_0= ruleIdExp )
                    // InternalGumboParser.g:3073:6: lv_f_1_0= ruleIdExp
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCallArgsAccess().getFIdExpParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_47);
                    lv_f_1_0=ruleIdExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCallArgsRule());
                      						}
                      						add(
                      							current,
                      							"f",
                      							lv_f_1_0,
                      							"org.sireum.aadl.gumbo.Gumbo.IdExp");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:3090:4: (otherlv_2= Comma ( (lv_f_3_0= ruleIdExp ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==Comma) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalGumboParser.g:3091:5: otherlv_2= Comma ( (lv_f_3_0= ruleIdExp ) )
                    	    {
                    	    otherlv_2=(Token)match(input,Comma,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getCallArgsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:3095:5: ( (lv_f_3_0= ruleIdExp ) )
                    	    // InternalGumboParser.g:3096:6: (lv_f_3_0= ruleIdExp )
                    	    {
                    	    // InternalGumboParser.g:3096:6: (lv_f_3_0= ruleIdExp )
                    	    // InternalGumboParser.g:3097:7: lv_f_3_0= ruleIdExp
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getCallArgsAccess().getFIdExpParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_47);
                    	    lv_f_3_0=ruleIdExp();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getCallArgsRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"f",
                    	      								lv_f_3_0,
                    	      								"org.sireum.aadl.gumbo.Gumbo.IdExp");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getCallArgsAccess().getRightParenthesisKeyword_2());
              		
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
    // $ANTLR end "ruleCallArgs"


    // $ANTLR start "entryRuleIdExp"
    // InternalGumboParser.g:3124:1: entryRuleIdExp returns [EObject current=null] : iv_ruleIdExp= ruleIdExp EOF ;
    public final EObject entryRuleIdExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdExp = null;


        try {
            // InternalGumboParser.g:3124:46: (iv_ruleIdExp= ruleIdExp EOF )
            // InternalGumboParser.g:3125:2: iv_ruleIdExp= ruleIdExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdExpRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIdExp=ruleIdExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdExp; 
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
    // $ANTLR end "entryRuleIdExp"


    // $ANTLR start "ruleIdExp"
    // InternalGumboParser.g:3131:1: ruleIdExp returns [EObject current=null] : ( ( (lv_l_0_0= ruleExpr ) ) (otherlv_1= ColonEqualsSign ( (lv_r_2_0= ruleExpr ) ) )? ) ;
    public final EObject ruleIdExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_l_0_0 = null;

        EObject lv_r_2_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:3137:2: ( ( ( (lv_l_0_0= ruleExpr ) ) (otherlv_1= ColonEqualsSign ( (lv_r_2_0= ruleExpr ) ) )? ) )
            // InternalGumboParser.g:3138:2: ( ( (lv_l_0_0= ruleExpr ) ) (otherlv_1= ColonEqualsSign ( (lv_r_2_0= ruleExpr ) ) )? )
            {
            // InternalGumboParser.g:3138:2: ( ( (lv_l_0_0= ruleExpr ) ) (otherlv_1= ColonEqualsSign ( (lv_r_2_0= ruleExpr ) ) )? )
            // InternalGumboParser.g:3139:3: ( (lv_l_0_0= ruleExpr ) ) (otherlv_1= ColonEqualsSign ( (lv_r_2_0= ruleExpr ) ) )?
            {
            // InternalGumboParser.g:3139:3: ( (lv_l_0_0= ruleExpr ) )
            // InternalGumboParser.g:3140:4: (lv_l_0_0= ruleExpr )
            {
            // InternalGumboParser.g:3140:4: (lv_l_0_0= ruleExpr )
            // InternalGumboParser.g:3141:5: lv_l_0_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIdExpAccess().getLExprParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_49);
            lv_l_0_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIdExpRule());
              					}
              					set(
              						current,
              						"l",
              						lv_l_0_0,
              						"org.sireum.aadl.gumbo.Gumbo.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumboParser.g:3158:3: (otherlv_1= ColonEqualsSign ( (lv_r_2_0= ruleExpr ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==ColonEqualsSign) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalGumboParser.g:3159:4: otherlv_1= ColonEqualsSign ( (lv_r_2_0= ruleExpr ) )
                    {
                    otherlv_1=(Token)match(input,ColonEqualsSign,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getIdExpAccess().getColonEqualsSignKeyword_1_0());
                      			
                    }
                    // InternalGumboParser.g:3163:4: ( (lv_r_2_0= ruleExpr ) )
                    // InternalGumboParser.g:3164:5: (lv_r_2_0= ruleExpr )
                    {
                    // InternalGumboParser.g:3164:5: (lv_r_2_0= ruleExpr )
                    // InternalGumboParser.g:3165:6: lv_r_2_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIdExpAccess().getRExprParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_r_2_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIdExpRule());
                      						}
                      						set(
                      							current,
                      							"r",
                      							lv_r_2_0,
                      							"org.sireum.aadl.gumbo.Gumbo.Expr");
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
    // $ANTLR end "ruleIdExp"


    // $ANTLR start "entryRuleType"
    // InternalGumboParser.g:3187:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalGumboParser.g:3187:44: (iv_ruleType= ruleType EOF )
            // InternalGumboParser.g:3188:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType.getText(); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalGumboParser.g:3194:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_BaseType_0= ruleBaseType (kw= EqualsSignGreaterThanSign this_BaseType_2= ruleBaseType )* ) | (kw= Mut this_BaseType_4= ruleBaseType (kw= EqualsSignGreaterThanSign this_BaseType_6= ruleBaseType )+ ) ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_BaseType_0 = null;

        AntlrDatatypeRuleToken this_BaseType_2 = null;

        AntlrDatatypeRuleToken this_BaseType_4 = null;

        AntlrDatatypeRuleToken this_BaseType_6 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:3200:2: ( ( (this_BaseType_0= ruleBaseType (kw= EqualsSignGreaterThanSign this_BaseType_2= ruleBaseType )* ) | (kw= Mut this_BaseType_4= ruleBaseType (kw= EqualsSignGreaterThanSign this_BaseType_6= ruleBaseType )+ ) ) )
            // InternalGumboParser.g:3201:2: ( (this_BaseType_0= ruleBaseType (kw= EqualsSignGreaterThanSign this_BaseType_2= ruleBaseType )* ) | (kw= Mut this_BaseType_4= ruleBaseType (kw= EqualsSignGreaterThanSign this_BaseType_6= ruleBaseType )+ ) )
            {
            // InternalGumboParser.g:3201:2: ( (this_BaseType_0= ruleBaseType (kw= EqualsSignGreaterThanSign this_BaseType_2= ruleBaseType )* ) | (kw= Mut this_BaseType_4= ruleBaseType (kw= EqualsSignGreaterThanSign this_BaseType_6= ruleBaseType )+ ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==LeftParenthesis||LA52_0==RULE_ID) ) {
                alt52=1;
            }
            else if ( (LA52_0==Mut) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalGumboParser.g:3202:3: (this_BaseType_0= ruleBaseType (kw= EqualsSignGreaterThanSign this_BaseType_2= ruleBaseType )* )
                    {
                    // InternalGumboParser.g:3202:3: (this_BaseType_0= ruleBaseType (kw= EqualsSignGreaterThanSign this_BaseType_2= ruleBaseType )* )
                    // InternalGumboParser.g:3203:4: this_BaseType_0= ruleBaseType (kw= EqualsSignGreaterThanSign this_BaseType_2= ruleBaseType )*
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTypeAccess().getBaseTypeParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_50);
                    this_BaseType_0=ruleBaseType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_BaseType_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalGumboParser.g:3213:4: (kw= EqualsSignGreaterThanSign this_BaseType_2= ruleBaseType )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==EqualsSignGreaterThanSign) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // InternalGumboParser.g:3214:5: kw= EqualsSignGreaterThanSign this_BaseType_2= ruleBaseType
                    	    {
                    	    kw=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_42); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(kw);
                    	      					newLeafNode(kw, grammarAccess.getTypeAccess().getEqualsSignGreaterThanSignKeyword_0_1_0());
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getTypeAccess().getBaseTypeParserRuleCall_0_1_1());
                    	      				
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_50);
                    	    this_BaseType_2=ruleBaseType();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_BaseType_2);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					afterParserOrEnumRuleCall();
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:3232:3: (kw= Mut this_BaseType_4= ruleBaseType (kw= EqualsSignGreaterThanSign this_BaseType_6= ruleBaseType )+ )
                    {
                    // InternalGumboParser.g:3232:3: (kw= Mut this_BaseType_4= ruleBaseType (kw= EqualsSignGreaterThanSign this_BaseType_6= ruleBaseType )+ )
                    // InternalGumboParser.g:3233:4: kw= Mut this_BaseType_4= ruleBaseType (kw= EqualsSignGreaterThanSign this_BaseType_6= ruleBaseType )+
                    {
                    kw=(Token)match(input,Mut,FollowSets000.FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getTypeAccess().getMutKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTypeAccess().getBaseTypeParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_51);
                    this_BaseType_4=ruleBaseType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_BaseType_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalGumboParser.g:3248:4: (kw= EqualsSignGreaterThanSign this_BaseType_6= ruleBaseType )+
                    int cnt51=0;
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==EqualsSignGreaterThanSign) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalGumboParser.g:3249:5: kw= EqualsSignGreaterThanSign this_BaseType_6= ruleBaseType
                    	    {
                    	    kw=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_42); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(kw);
                    	      					newLeafNode(kw, grammarAccess.getTypeAccess().getEqualsSignGreaterThanSignKeyword_1_2_0());
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getTypeAccess().getBaseTypeParserRuleCall_1_2_1());
                    	      				
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_50);
                    	    this_BaseType_6=ruleBaseType();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_BaseType_6);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					afterParserOrEnumRuleCall();
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt51 >= 1 ) break loop51;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(51, input);
                                throw eee;
                        }
                        cnt51++;
                    } while (true);


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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleBaseType"
    // InternalGumboParser.g:3270:1: entryRuleBaseType returns [String current=null] : iv_ruleBaseType= ruleBaseType EOF ;
    public final String entryRuleBaseType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBaseType = null;


        try {
            // InternalGumboParser.g:3270:48: (iv_ruleBaseType= ruleBaseType EOF )
            // InternalGumboParser.g:3271:2: iv_ruleBaseType= ruleBaseType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBaseTypeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBaseType=ruleBaseType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBaseType.getText(); 
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
    // $ANTLR end "entryRuleBaseType"


    // $ANTLR start "ruleBaseType"
    // InternalGumboParser.g:3277:1: ruleBaseType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_QCREF_0= ruleQCREF (this_TypeArgs_1= ruleTypeArgs )? ) | (kw= LeftParenthesis (this_Type_3= ruleType (kw= Comma this_Type_5= ruleType )* )? kw= RightParenthesis ) ) ;
    public final AntlrDatatypeRuleToken ruleBaseType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QCREF_0 = null;

        AntlrDatatypeRuleToken this_TypeArgs_1 = null;

        AntlrDatatypeRuleToken this_Type_3 = null;

        AntlrDatatypeRuleToken this_Type_5 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:3283:2: ( ( (this_QCREF_0= ruleQCREF (this_TypeArgs_1= ruleTypeArgs )? ) | (kw= LeftParenthesis (this_Type_3= ruleType (kw= Comma this_Type_5= ruleType )* )? kw= RightParenthesis ) ) )
            // InternalGumboParser.g:3284:2: ( (this_QCREF_0= ruleQCREF (this_TypeArgs_1= ruleTypeArgs )? ) | (kw= LeftParenthesis (this_Type_3= ruleType (kw= Comma this_Type_5= ruleType )* )? kw= RightParenthesis ) )
            {
            // InternalGumboParser.g:3284:2: ( (this_QCREF_0= ruleQCREF (this_TypeArgs_1= ruleTypeArgs )? ) | (kw= LeftParenthesis (this_Type_3= ruleType (kw= Comma this_Type_5= ruleType )* )? kw= RightParenthesis ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                alt56=1;
            }
            else if ( (LA56_0==LeftParenthesis) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalGumboParser.g:3285:3: (this_QCREF_0= ruleQCREF (this_TypeArgs_1= ruleTypeArgs )? )
                    {
                    // InternalGumboParser.g:3285:3: (this_QCREF_0= ruleQCREF (this_TypeArgs_1= ruleTypeArgs )? )
                    // InternalGumboParser.g:3286:4: this_QCREF_0= ruleQCREF (this_TypeArgs_1= ruleTypeArgs )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getBaseTypeAccess().getQCREFParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_52);
                    this_QCREF_0=ruleQCREF();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_QCREF_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalGumboParser.g:3296:4: (this_TypeArgs_1= ruleTypeArgs )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==LeftSquareBracket) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // InternalGumboParser.g:3297:5: this_TypeArgs_1= ruleTypeArgs
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getBaseTypeAccess().getTypeArgsParserRuleCall_0_1());
                              				
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            this_TypeArgs_1=ruleTypeArgs();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_TypeArgs_1);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:3310:3: (kw= LeftParenthesis (this_Type_3= ruleType (kw= Comma this_Type_5= ruleType )* )? kw= RightParenthesis )
                    {
                    // InternalGumboParser.g:3310:3: (kw= LeftParenthesis (this_Type_3= ruleType (kw= Comma this_Type_5= ruleType )* )? kw= RightParenthesis )
                    // InternalGumboParser.g:3311:4: kw= LeftParenthesis (this_Type_3= ruleType (kw= Comma this_Type_5= ruleType )* )? kw= RightParenthesis
                    {
                    kw=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getBaseTypeAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalGumboParser.g:3316:4: (this_Type_3= ruleType (kw= Comma this_Type_5= ruleType )* )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==Mut||LA55_0==LeftParenthesis||LA55_0==RULE_ID) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // InternalGumboParser.g:3317:5: this_Type_3= ruleType (kw= Comma this_Type_5= ruleType )*
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getBaseTypeAccess().getTypeParserRuleCall_1_1_0());
                              				
                            }
                            pushFollow(FollowSets000.FOLLOW_47);
                            this_Type_3=ruleType();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_Type_3);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					afterParserOrEnumRuleCall();
                              				
                            }
                            // InternalGumboParser.g:3327:5: (kw= Comma this_Type_5= ruleType )*
                            loop54:
                            do {
                                int alt54=2;
                                int LA54_0 = input.LA(1);

                                if ( (LA54_0==Comma) ) {
                                    alt54=1;
                                }


                                switch (alt54) {
                            	case 1 :
                            	    // InternalGumboParser.g:3328:6: kw= Comma this_Type_5= ruleType
                            	    {
                            	    kw=(Token)match(input,Comma,FollowSets000.FOLLOW_54); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						current.merge(kw);
                            	      						newLeafNode(kw, grammarAccess.getBaseTypeAccess().getCommaKeyword_1_1_1_0());
                            	      					
                            	    }
                            	    if ( state.backtracking==0 ) {

                            	      						newCompositeNode(grammarAccess.getBaseTypeAccess().getTypeParserRuleCall_1_1_1_1());
                            	      					
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_47);
                            	    this_Type_5=ruleType();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						current.merge(this_Type_5);
                            	      					
                            	    }
                            	    if ( state.backtracking==0 ) {

                            	      						afterParserOrEnumRuleCall();
                            	      					
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop54;
                                }
                            } while (true);


                            }
                            break;

                    }

                    kw=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getBaseTypeAccess().getRightParenthesisKeyword_1_2());
                      			
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
    // $ANTLR end "ruleBaseType"


    // $ANTLR start "entryRuleTypeArgs"
    // InternalGumboParser.g:3355:1: entryRuleTypeArgs returns [String current=null] : iv_ruleTypeArgs= ruleTypeArgs EOF ;
    public final String entryRuleTypeArgs() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeArgs = null;


        try {
            // InternalGumboParser.g:3355:48: (iv_ruleTypeArgs= ruleTypeArgs EOF )
            // InternalGumboParser.g:3356:2: iv_ruleTypeArgs= ruleTypeArgs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeArgsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypeArgs=ruleTypeArgs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeArgs.getText(); 
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
    // $ANTLR end "entryRuleTypeArgs"


    // $ANTLR start "ruleTypeArgs"
    // InternalGumboParser.g:3362:1: ruleTypeArgs returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= LeftSquareBracket this_Type_1= ruleType (kw= Comma this_Type_3= ruleType )* kw= RightSquareBracket ) ;
    public final AntlrDatatypeRuleToken ruleTypeArgs() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Type_1 = null;

        AntlrDatatypeRuleToken this_Type_3 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:3368:2: ( (kw= LeftSquareBracket this_Type_1= ruleType (kw= Comma this_Type_3= ruleType )* kw= RightSquareBracket ) )
            // InternalGumboParser.g:3369:2: (kw= LeftSquareBracket this_Type_1= ruleType (kw= Comma this_Type_3= ruleType )* kw= RightSquareBracket )
            {
            // InternalGumboParser.g:3369:2: (kw= LeftSquareBracket this_Type_1= ruleType (kw= Comma this_Type_3= ruleType )* kw= RightSquareBracket )
            // InternalGumboParser.g:3370:3: kw= LeftSquareBracket this_Type_1= ruleType (kw= Comma this_Type_3= ruleType )* kw= RightSquareBracket
            {
            kw=(Token)match(input,LeftSquareBracket,FollowSets000.FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getTypeArgsAccess().getLeftSquareBracketKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTypeArgsAccess().getTypeParserRuleCall_1());
              		
            }
            pushFollow(FollowSets000.FOLLOW_55);
            this_Type_1=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Type_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGumboParser.g:3385:3: (kw= Comma this_Type_3= ruleType )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==Comma) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalGumboParser.g:3386:4: kw= Comma this_Type_3= ruleType
            	    {
            	    kw=(Token)match(input,Comma,FollowSets000.FOLLOW_54); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getTypeArgsAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getTypeArgsAccess().getTypeParserRuleCall_2_1());
            	      			
            	    }
            	    pushFollow(FollowSets000.FOLLOW_55);
            	    this_Type_3=ruleType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_Type_3);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            kw=(Token)match(input,RightSquareBracket,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getTypeArgsAccess().getRightSquareBracketKeyword_3());
              		
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
    // $ANTLR end "ruleTypeArgs"


    // $ANTLR start "entryRuleFunctions"
    // InternalGumboParser.g:3411:1: entryRuleFunctions returns [EObject current=null] : iv_ruleFunctions= ruleFunctions EOF ;
    public final EObject entryRuleFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctions = null;


        try {
            // InternalGumboParser.g:3411:50: (iv_ruleFunctions= ruleFunctions EOF )
            // InternalGumboParser.g:3412:2: iv_ruleFunctions= ruleFunctions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFunctions=ruleFunctions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctions; 
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
    // $ANTLR end "entryRuleFunctions"


    // $ANTLR start "ruleFunctions"
    // InternalGumboParser.g:3418:1: ruleFunctions returns [EObject current=null] : (otherlv_0= Functions ( (lv_specs_1_0= ruleFuncSpec ) )+ ) ;
    public final EObject ruleFunctions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_specs_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:3424:2: ( (otherlv_0= Functions ( (lv_specs_1_0= ruleFuncSpec ) )+ ) )
            // InternalGumboParser.g:3425:2: (otherlv_0= Functions ( (lv_specs_1_0= ruleFuncSpec ) )+ )
            {
            // InternalGumboParser.g:3425:2: (otherlv_0= Functions ( (lv_specs_1_0= ruleFuncSpec ) )+ )
            // InternalGumboParser.g:3426:3: otherlv_0= Functions ( (lv_specs_1_0= ruleFuncSpec ) )+
            {
            otherlv_0=(Token)match(input,Functions,FollowSets000.FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunctionsAccess().getFunctionsKeyword_0());
              		
            }
            // InternalGumboParser.g:3430:3: ( (lv_specs_1_0= ruleFuncSpec ) )+
            int cnt58=0;
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==Memoize||LA58_0==Strict||LA58_0==Spec||LA58_0==Mut||LA58_0==LeftParenthesis||LA58_0==RULE_OP||LA58_0==RULE_ID) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalGumboParser.g:3431:4: (lv_specs_1_0= ruleFuncSpec )
            	    {
            	    // InternalGumboParser.g:3431:4: (lv_specs_1_0= ruleFuncSpec )
            	    // InternalGumboParser.g:3432:5: lv_specs_1_0= ruleFuncSpec
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getFunctionsAccess().getSpecsFuncSpecParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_57);
            	    lv_specs_1_0=ruleFuncSpec();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getFunctionsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"specs",
            	      						lv_specs_1_0,
            	      						"org.sireum.aadl.gumbo.Gumbo.FuncSpec");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt58 >= 1 ) break loop58;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(58, input);
                        throw eee;
                }
                cnt58++;
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
    // $ANTLR end "ruleFunctions"


    // $ANTLR start "entryRuleFuncSpec"
    // InternalGumboParser.g:3453:1: entryRuleFuncSpec returns [EObject current=null] : iv_ruleFuncSpec= ruleFuncSpec EOF ;
    public final EObject entryRuleFuncSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncSpec = null;


        try {
            // InternalGumboParser.g:3453:49: (iv_ruleFuncSpec= ruleFuncSpec EOF )
            // InternalGumboParser.g:3454:2: iv_ruleFuncSpec= ruleFuncSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFuncSpecRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFuncSpec=ruleFuncSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFuncSpec; 
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
    // $ANTLR end "entryRuleFuncSpec"


    // $ANTLR start "ruleFuncSpec"
    // InternalGumboParser.g:3460:1: ruleFuncSpec returns [EObject current=null] : (this_DefDef_0= ruleDefDef otherlv_1= Semicolon ) ;
    public final EObject ruleFuncSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_DefDef_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:3466:2: ( (this_DefDef_0= ruleDefDef otherlv_1= Semicolon ) )
            // InternalGumboParser.g:3467:2: (this_DefDef_0= ruleDefDef otherlv_1= Semicolon )
            {
            // InternalGumboParser.g:3467:2: (this_DefDef_0= ruleDefDef otherlv_1= Semicolon )
            // InternalGumboParser.g:3468:3: this_DefDef_0= ruleDefDef otherlv_1= Semicolon
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFuncSpecAccess().getDefDefParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_13);
            this_DefDef_0=ruleDefDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DefDef_0;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_1=(Token)match(input,Semicolon,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFuncSpecAccess().getSemicolonKeyword_1());
              		
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
    // $ANTLR end "ruleFuncSpec"


    // $ANTLR start "entryRuleParam"
    // InternalGumboParser.g:3484:1: entryRuleParam returns [String current=null] : iv_ruleParam= ruleParam EOF ;
    public final String entryRuleParam() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParam = null;


        try {
            // InternalGumboParser.g:3484:45: (iv_ruleParam= ruleParam EOF )
            // InternalGumboParser.g:3485:2: iv_ruleParam= ruleParam EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParamRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParam=ruleParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParam.getText(); 
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
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // InternalGumboParser.g:3491:1: ruleParam returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= Var )? this_ID_1= RULE_ID kw= Colon (kw= EqualsSignGreaterThanSign )? this_Type_4= ruleType (kw= Asterisk )? ) ;
    public final AntlrDatatypeRuleToken ruleParam() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        AntlrDatatypeRuleToken this_Type_4 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:3497:2: ( ( (kw= Var )? this_ID_1= RULE_ID kw= Colon (kw= EqualsSignGreaterThanSign )? this_Type_4= ruleType (kw= Asterisk )? ) )
            // InternalGumboParser.g:3498:2: ( (kw= Var )? this_ID_1= RULE_ID kw= Colon (kw= EqualsSignGreaterThanSign )? this_Type_4= ruleType (kw= Asterisk )? )
            {
            // InternalGumboParser.g:3498:2: ( (kw= Var )? this_ID_1= RULE_ID kw= Colon (kw= EqualsSignGreaterThanSign )? this_Type_4= ruleType (kw= Asterisk )? )
            // InternalGumboParser.g:3499:3: (kw= Var )? this_ID_1= RULE_ID kw= Colon (kw= EqualsSignGreaterThanSign )? this_Type_4= ruleType (kw= Asterisk )?
            {
            // InternalGumboParser.g:3499:3: (kw= Var )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==Var) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalGumboParser.g:3500:4: kw= Var
                    {
                    kw=(Token)match(input,Var,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getParamAccess().getVarKeyword_0());
                      			
                    }

                    }
                    break;

            }

            this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_1, grammarAccess.getParamAccess().getIDTerminalRuleCall_1());
              		
            }
            kw=(Token)match(input,Colon,FollowSets000.FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getParamAccess().getColonKeyword_2());
              		
            }
            // InternalGumboParser.g:3518:3: (kw= EqualsSignGreaterThanSign )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==EqualsSignGreaterThanSign) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalGumboParser.g:3519:4: kw= EqualsSignGreaterThanSign
                    {
                    kw=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_54); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getParamAccess().getEqualsSignGreaterThanSignKeyword_3());
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getParamAccess().getTypeParserRuleCall_4());
              		
            }
            pushFollow(FollowSets000.FOLLOW_59);
            this_Type_4=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Type_4);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGumboParser.g:3535:3: (kw= Asterisk )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==Asterisk) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalGumboParser.g:3536:4: kw= Asterisk
                    {
                    kw=(Token)match(input,Asterisk,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getParamAccess().getAsteriskKeyword_5());
                      			
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
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleDefDef"
    // InternalGumboParser.g:3546:1: entryRuleDefDef returns [EObject current=null] : iv_ruleDefDef= ruleDefDef EOF ;
    public final EObject entryRuleDefDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefDef = null;


        try {
            // InternalGumboParser.g:3546:47: (iv_ruleDefDef= ruleDefDef EOF )
            // InternalGumboParser.g:3547:2: iv_ruleDefDef= ruleDefDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefDefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDefDef=ruleDefDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefDef; 
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
    // $ANTLR end "entryRuleDefDef"


    // $ANTLR start "ruleDefDef"
    // InternalGumboParser.g:3553:1: ruleDefDef returns [EObject current=null] : ( ( ruleDefMods )? ( ruleDefExt )? ( (lv_name_2_0= ruleDefID ) ) ( ruleTypeParams )? ( (lv_args_4_0= ruleDefParams ) )? otherlv_5= Colon ruleType ( (lv_contract_7_0= ruleDefContract ) )? otherlv_8= ColonEqualsSign ( (lv_body_9_0= ruleExpr ) ) ) ;
    public final EObject ruleDefDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_args_4_0 = null;

        EObject lv_contract_7_0 = null;

        EObject lv_body_9_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:3559:2: ( ( ( ruleDefMods )? ( ruleDefExt )? ( (lv_name_2_0= ruleDefID ) ) ( ruleTypeParams )? ( (lv_args_4_0= ruleDefParams ) )? otherlv_5= Colon ruleType ( (lv_contract_7_0= ruleDefContract ) )? otherlv_8= ColonEqualsSign ( (lv_body_9_0= ruleExpr ) ) ) )
            // InternalGumboParser.g:3560:2: ( ( ruleDefMods )? ( ruleDefExt )? ( (lv_name_2_0= ruleDefID ) ) ( ruleTypeParams )? ( (lv_args_4_0= ruleDefParams ) )? otherlv_5= Colon ruleType ( (lv_contract_7_0= ruleDefContract ) )? otherlv_8= ColonEqualsSign ( (lv_body_9_0= ruleExpr ) ) )
            {
            // InternalGumboParser.g:3560:2: ( ( ruleDefMods )? ( ruleDefExt )? ( (lv_name_2_0= ruleDefID ) ) ( ruleTypeParams )? ( (lv_args_4_0= ruleDefParams ) )? otherlv_5= Colon ruleType ( (lv_contract_7_0= ruleDefContract ) )? otherlv_8= ColonEqualsSign ( (lv_body_9_0= ruleExpr ) ) )
            // InternalGumboParser.g:3561:3: ( ruleDefMods )? ( ruleDefExt )? ( (lv_name_2_0= ruleDefID ) ) ( ruleTypeParams )? ( (lv_args_4_0= ruleDefParams ) )? otherlv_5= Colon ruleType ( (lv_contract_7_0= ruleDefContract ) )? otherlv_8= ColonEqualsSign ( (lv_body_9_0= ruleExpr ) )
            {
            // InternalGumboParser.g:3561:3: ( ruleDefMods )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==Memoize||LA62_0==Strict||LA62_0==Spec||LA62_0==Mut) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalGumboParser.g:3562:4: ruleDefMods
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDefDefAccess().getDefModsParserRuleCall_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_56);
                    ruleDefMods();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalGumboParser.g:3570:3: ( ruleDefExt )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==LeftParenthesis) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalGumboParser.g:3571:4: ruleDefExt
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDefDefAccess().getDefExtParserRuleCall_1());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_56);
                    ruleDefExt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalGumboParser.g:3579:3: ( (lv_name_2_0= ruleDefID ) )
            // InternalGumboParser.g:3580:4: (lv_name_2_0= ruleDefID )
            {
            // InternalGumboParser.g:3580:4: (lv_name_2_0= ruleDefID )
            // InternalGumboParser.g:3581:5: lv_name_2_0= ruleDefID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefDefAccess().getNameDefIDParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_60);
            lv_name_2_0=ruleDefID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefDefRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.sireum.aadl.gumbo.Gumbo.DefID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumboParser.g:3598:3: ( ruleTypeParams )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==LeftSquareBracket) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalGumboParser.g:3599:4: ruleTypeParams
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDefDefAccess().getTypeParamsParserRuleCall_3());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_61);
                    ruleTypeParams();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalGumboParser.g:3607:3: ( (lv_args_4_0= ruleDefParams ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==LeftParenthesis) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalGumboParser.g:3608:4: (lv_args_4_0= ruleDefParams )
                    {
                    // InternalGumboParser.g:3608:4: (lv_args_4_0= ruleDefParams )
                    // InternalGumboParser.g:3609:5: lv_args_4_0= ruleDefParams
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDefDefAccess().getArgsDefParamsParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_12);
                    lv_args_4_0=ruleDefParams();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDefDefRule());
                      					}
                      					set(
                      						current,
                      						"args",
                      						lv_args_4_0,
                      						"org.sireum.aadl.gumbo.Gumbo.DefParams");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,Colon,FollowSets000.FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDefDefAccess().getColonKeyword_5());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDefDefAccess().getTypeParserRuleCall_6());
              		
            }
            pushFollow(FollowSets000.FOLLOW_62);
            ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGumboParser.g:3637:3: ( (lv_contract_7_0= ruleDefContract ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==Spec) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalGumboParser.g:3638:4: (lv_contract_7_0= ruleDefContract )
                    {
                    // InternalGumboParser.g:3638:4: (lv_contract_7_0= ruleDefContract )
                    // InternalGumboParser.g:3639:5: lv_contract_7_0= ruleDefContract
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDefDefAccess().getContractDefContractParserRuleCall_7_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_63);
                    lv_contract_7_0=ruleDefContract();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDefDefRule());
                      					}
                      					set(
                      						current,
                      						"contract",
                      						lv_contract_7_0,
                      						"org.sireum.aadl.gumbo.Gumbo.DefContract");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,ColonEqualsSign,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getDefDefAccess().getColonEqualsSignKeyword_8());
              		
            }
            // InternalGumboParser.g:3660:3: ( (lv_body_9_0= ruleExpr ) )
            // InternalGumboParser.g:3661:4: (lv_body_9_0= ruleExpr )
            {
            // InternalGumboParser.g:3661:4: (lv_body_9_0= ruleExpr )
            // InternalGumboParser.g:3662:5: lv_body_9_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefDefAccess().getBodyExprParserRuleCall_9_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_body_9_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefDefRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_9_0,
              						"org.sireum.aadl.gumbo.Gumbo.Expr");
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
    // $ANTLR end "ruleDefDef"


    // $ANTLR start "entryRuleDefMods"
    // InternalGumboParser.g:3683:1: entryRuleDefMods returns [String current=null] : iv_ruleDefMods= ruleDefMods EOF ;
    public final String entryRuleDefMods() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDefMods = null;


        try {
            // InternalGumboParser.g:3683:47: (iv_ruleDefMods= ruleDefMods EOF )
            // InternalGumboParser.g:3684:2: iv_ruleDefMods= ruleDefMods EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefModsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDefMods=ruleDefMods();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefMods.getText(); 
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
    // $ANTLR end "entryRuleDefMods"


    // $ANTLR start "ruleDefMods"
    // InternalGumboParser.g:3690:1: ruleDefMods returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Strict | kw= Memoize | kw= Mut | kw= Spec ) ;
    public final AntlrDatatypeRuleToken ruleDefMods() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumboParser.g:3696:2: ( (kw= Strict | kw= Memoize | kw= Mut | kw= Spec ) )
            // InternalGumboParser.g:3697:2: (kw= Strict | kw= Memoize | kw= Mut | kw= Spec )
            {
            // InternalGumboParser.g:3697:2: (kw= Strict | kw= Memoize | kw= Mut | kw= Spec )
            int alt67=4;
            switch ( input.LA(1) ) {
            case Strict:
                {
                alt67=1;
                }
                break;
            case Memoize:
                {
                alt67=2;
                }
                break;
            case Mut:
                {
                alt67=3;
                }
                break;
            case Spec:
                {
                alt67=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // InternalGumboParser.g:3698:3: kw= Strict
                    {
                    kw=(Token)match(input,Strict,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDefModsAccess().getStrictKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:3704:3: kw= Memoize
                    {
                    kw=(Token)match(input,Memoize,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDefModsAccess().getMemoizeKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGumboParser.g:3710:3: kw= Mut
                    {
                    kw=(Token)match(input,Mut,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDefModsAccess().getMutKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGumboParser.g:3716:3: kw= Spec
                    {
                    kw=(Token)match(input,Spec,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDefModsAccess().getSpecKeyword_3());
                      		
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
    // $ANTLR end "ruleDefMods"


    // $ANTLR start "entryRuleDefExt"
    // InternalGumboParser.g:3725:1: entryRuleDefExt returns [String current=null] : iv_ruleDefExt= ruleDefExt EOF ;
    public final String entryRuleDefExt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDefExt = null;


        try {
            // InternalGumboParser.g:3725:46: (iv_ruleDefExt= ruleDefExt EOF )
            // InternalGumboParser.g:3726:2: iv_ruleDefExt= ruleDefExt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefExtRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDefExt=ruleDefExt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefExt.getText(); 
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
    // $ANTLR end "entryRuleDefExt"


    // $ANTLR start "ruleDefExt"
    // InternalGumboParser.g:3732:1: ruleDefExt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= LeftParenthesis this_ID_1= RULE_ID kw= Colon this_Type_3= ruleType kw= RightParenthesis ) ;
    public final AntlrDatatypeRuleToken ruleDefExt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        AntlrDatatypeRuleToken this_Type_3 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:3738:2: ( (kw= LeftParenthesis this_ID_1= RULE_ID kw= Colon this_Type_3= ruleType kw= RightParenthesis ) )
            // InternalGumboParser.g:3739:2: (kw= LeftParenthesis this_ID_1= RULE_ID kw= Colon this_Type_3= ruleType kw= RightParenthesis )
            {
            // InternalGumboParser.g:3739:2: (kw= LeftParenthesis this_ID_1= RULE_ID kw= Colon this_Type_3= ruleType kw= RightParenthesis )
            // InternalGumboParser.g:3740:3: kw= LeftParenthesis this_ID_1= RULE_ID kw= Colon this_Type_3= ruleType kw= RightParenthesis
            {
            kw=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getDefExtAccess().getLeftParenthesisKeyword_0());
              		
            }
            this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_1, grammarAccess.getDefExtAccess().getIDTerminalRuleCall_1());
              		
            }
            kw=(Token)match(input,Colon,FollowSets000.FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getDefExtAccess().getColonKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDefExtAccess().getTypeParserRuleCall_3());
              		
            }
            pushFollow(FollowSets000.FOLLOW_36);
            this_Type_3=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Type_3);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getDefExtAccess().getRightParenthesisKeyword_4());
              		
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
    // $ANTLR end "ruleDefExt"


    // $ANTLR start "entryRuleDefID"
    // InternalGumboParser.g:3776:1: entryRuleDefID returns [String current=null] : iv_ruleDefID= ruleDefID EOF ;
    public final String entryRuleDefID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDefID = null;


        try {
            // InternalGumboParser.g:3776:45: (iv_ruleDefID= ruleDefID EOF )
            // InternalGumboParser.g:3777:2: iv_ruleDefID= ruleDefID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDefID=ruleDefID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefID.getText(); 
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
    // $ANTLR end "entryRuleDefID"


    // $ANTLR start "ruleDefID"
    // InternalGumboParser.g:3783:1: ruleDefID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_OP_1= RULE_OP ) ;
    public final AntlrDatatypeRuleToken ruleDefID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_OP_1=null;


        	enterRule();

        try {
            // InternalGumboParser.g:3789:2: ( (this_ID_0= RULE_ID | this_OP_1= RULE_OP ) )
            // InternalGumboParser.g:3790:2: (this_ID_0= RULE_ID | this_OP_1= RULE_OP )
            {
            // InternalGumboParser.g:3790:2: (this_ID_0= RULE_ID | this_OP_1= RULE_OP )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_ID) ) {
                alt68=1;
            }
            else if ( (LA68_0==RULE_OP) ) {
                alt68=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // InternalGumboParser.g:3791:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ID_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_0, grammarAccess.getDefIDAccess().getIDTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:3799:3: this_OP_1= RULE_OP
                    {
                    this_OP_1=(Token)match(input,RULE_OP,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_OP_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_OP_1, grammarAccess.getDefIDAccess().getOPTerminalRuleCall_1());
                      		
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
    // $ANTLR end "ruleDefID"


    // $ANTLR start "entryRuleDefParams"
    // InternalGumboParser.g:3810:1: entryRuleDefParams returns [EObject current=null] : iv_ruleDefParams= ruleDefParams EOF ;
    public final EObject entryRuleDefParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefParams = null;


        try {
            // InternalGumboParser.g:3810:50: (iv_ruleDefParams= ruleDefParams EOF )
            // InternalGumboParser.g:3811:2: iv_ruleDefParams= ruleDefParams EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefParamsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDefParams=ruleDefParams();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefParams; 
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
    // $ANTLR end "entryRuleDefParams"


    // $ANTLR start "ruleDefParams"
    // InternalGumboParser.g:3817:1: ruleDefParams returns [EObject current=null] : (otherlv_0= LeftParenthesis ( (lv_params_1_0= ruleDefParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleDefParam ) ) )? otherlv_4= RightParenthesis ) ;
    public final EObject ruleDefParams() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_params_1_0 = null;

        EObject lv_params_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:3823:2: ( (otherlv_0= LeftParenthesis ( (lv_params_1_0= ruleDefParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleDefParam ) ) )? otherlv_4= RightParenthesis ) )
            // InternalGumboParser.g:3824:2: (otherlv_0= LeftParenthesis ( (lv_params_1_0= ruleDefParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleDefParam ) ) )? otherlv_4= RightParenthesis )
            {
            // InternalGumboParser.g:3824:2: (otherlv_0= LeftParenthesis ( (lv_params_1_0= ruleDefParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleDefParam ) ) )? otherlv_4= RightParenthesis )
            // InternalGumboParser.g:3825:3: otherlv_0= LeftParenthesis ( (lv_params_1_0= ruleDefParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleDefParam ) ) )? otherlv_4= RightParenthesis
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDefParamsAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalGumboParser.g:3829:3: ( (lv_params_1_0= ruleDefParam ) )
            // InternalGumboParser.g:3830:4: (lv_params_1_0= ruleDefParam )
            {
            // InternalGumboParser.g:3830:4: (lv_params_1_0= ruleDefParam )
            // InternalGumboParser.g:3831:5: lv_params_1_0= ruleDefParam
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefParamsAccess().getParamsDefParamParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_47);
            lv_params_1_0=ruleDefParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefParamsRule());
              					}
              					add(
              						current,
              						"params",
              						lv_params_1_0,
              						"org.sireum.aadl.gumbo.Gumbo.DefParam");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumboParser.g:3848:3: (otherlv_2= Comma ( (lv_params_3_0= ruleDefParam ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==Comma) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalGumboParser.g:3849:4: otherlv_2= Comma ( (lv_params_3_0= ruleDefParam ) )
                    {
                    otherlv_2=(Token)match(input,Comma,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDefParamsAccess().getCommaKeyword_2_0());
                      			
                    }
                    // InternalGumboParser.g:3853:4: ( (lv_params_3_0= ruleDefParam ) )
                    // InternalGumboParser.g:3854:5: (lv_params_3_0= ruleDefParam )
                    {
                    // InternalGumboParser.g:3854:5: (lv_params_3_0= ruleDefParam )
                    // InternalGumboParser.g:3855:6: lv_params_3_0= ruleDefParam
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDefParamsAccess().getParamsDefParamParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_36);
                    lv_params_3_0=ruleDefParam();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDefParamsRule());
                      						}
                      						add(
                      							current,
                      							"params",
                      							lv_params_3_0,
                      							"org.sireum.aadl.gumbo.Gumbo.DefParam");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDefParamsAccess().getRightParenthesisKeyword_3());
              		
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
    // $ANTLR end "ruleDefParams"


    // $ANTLR start "entryRuleDefParam"
    // InternalGumboParser.g:3881:1: entryRuleDefParam returns [EObject current=null] : iv_ruleDefParam= ruleDefParam EOF ;
    public final EObject entryRuleDefParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefParam = null;


        try {
            // InternalGumboParser.g:3881:49: (iv_ruleDefParam= ruleDefParam EOF )
            // InternalGumboParser.g:3882:2: iv_ruleDefParam= ruleDefParam EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefParamRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDefParam=ruleDefParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefParam; 
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
    // $ANTLR end "entryRuleDefParam"


    // $ANTLR start "ruleDefParam"
    // InternalGumboParser.g:3888:1: ruleDefParam returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon (otherlv_2= EqualsSignGreaterThanSign )? ( ( ruleQCREF ) ) (otherlv_4= Asterisk )? ) ;
    public final EObject ruleDefParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalGumboParser.g:3894:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon (otherlv_2= EqualsSignGreaterThanSign )? ( ( ruleQCREF ) ) (otherlv_4= Asterisk )? ) )
            // InternalGumboParser.g:3895:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon (otherlv_2= EqualsSignGreaterThanSign )? ( ( ruleQCREF ) ) (otherlv_4= Asterisk )? )
            {
            // InternalGumboParser.g:3895:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon (otherlv_2= EqualsSignGreaterThanSign )? ( ( ruleQCREF ) ) (otherlv_4= Asterisk )? )
            // InternalGumboParser.g:3896:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon (otherlv_2= EqualsSignGreaterThanSign )? ( ( ruleQCREF ) ) (otherlv_4= Asterisk )?
            {
            // InternalGumboParser.g:3896:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGumboParser.g:3897:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGumboParser.g:3897:4: (lv_name_0_0= RULE_ID )
            // InternalGumboParser.g:3898:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getDefParamAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDefParamRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.osate.xtext.aadl2.properties.Properties.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FollowSets000.FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDefParamAccess().getColonKeyword_1());
              		
            }
            // InternalGumboParser.g:3918:3: (otherlv_2= EqualsSignGreaterThanSign )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==EqualsSignGreaterThanSign) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalGumboParser.g:3919:4: otherlv_2= EqualsSignGreaterThanSign
                    {
                    otherlv_2=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDefParamAccess().getEqualsSignGreaterThanSignKeyword_2());
                      			
                    }

                    }
                    break;

            }

            // InternalGumboParser.g:3924:3: ( ( ruleQCREF ) )
            // InternalGumboParser.g:3925:4: ( ruleQCREF )
            {
            // InternalGumboParser.g:3925:4: ( ruleQCREF )
            // InternalGumboParser.g:3926:5: ruleQCREF
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDefParamRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefParamAccess().getTypeNameDataSubcomponentTypeCrossReference_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_59);
            ruleQCREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumboParser.g:3940:3: (otherlv_4= Asterisk )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==Asterisk) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalGumboParser.g:3941:4: otherlv_4= Asterisk
                    {
                    otherlv_4=(Token)match(input,Asterisk,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getDefParamAccess().getAsteriskKeyword_4());
                      			
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
    // $ANTLR end "ruleDefParam"


    // $ANTLR start "entryRuleDefContract"
    // InternalGumboParser.g:3950:1: entryRuleDefContract returns [EObject current=null] : iv_ruleDefContract= ruleDefContract EOF ;
    public final EObject entryRuleDefContract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefContract = null;


        try {
            // InternalGumboParser.g:3950:52: (iv_ruleDefContract= ruleDefContract EOF )
            // InternalGumboParser.g:3951:2: iv_ruleDefContract= ruleDefContract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefContractRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDefContract=ruleDefContract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefContract; 
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
    // $ANTLR end "entryRuleDefContract"


    // $ANTLR start "ruleDefContract"
    // InternalGumboParser.g:3957:1: ruleDefContract returns [EObject current=null] : ( () otherlv_1= Spec ( ( ( (lv_rea_2_0= ruleReads ) )? ( (lv_req_3_0= ruleRequires ) )? ( (lv_mod_4_0= ruleModifies ) )? ( (lv_ens_5_0= ruleEnsures ) )? ) | ( ( (lv_dcc_6_0= ruleDefContractCase ) )+ ( (lv_rea_7_0= ruleReads ) )? ( (lv_mod_8_0= ruleModifies ) )? ) ) ) ;
    public final EObject ruleDefContract() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_rea_2_0 = null;

        EObject lv_req_3_0 = null;

        EObject lv_mod_4_0 = null;

        EObject lv_ens_5_0 = null;

        EObject lv_dcc_6_0 = null;

        EObject lv_rea_7_0 = null;

        EObject lv_mod_8_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:3963:2: ( ( () otherlv_1= Spec ( ( ( (lv_rea_2_0= ruleReads ) )? ( (lv_req_3_0= ruleRequires ) )? ( (lv_mod_4_0= ruleModifies ) )? ( (lv_ens_5_0= ruleEnsures ) )? ) | ( ( (lv_dcc_6_0= ruleDefContractCase ) )+ ( (lv_rea_7_0= ruleReads ) )? ( (lv_mod_8_0= ruleModifies ) )? ) ) ) )
            // InternalGumboParser.g:3964:2: ( () otherlv_1= Spec ( ( ( (lv_rea_2_0= ruleReads ) )? ( (lv_req_3_0= ruleRequires ) )? ( (lv_mod_4_0= ruleModifies ) )? ( (lv_ens_5_0= ruleEnsures ) )? ) | ( ( (lv_dcc_6_0= ruleDefContractCase ) )+ ( (lv_rea_7_0= ruleReads ) )? ( (lv_mod_8_0= ruleModifies ) )? ) ) )
            {
            // InternalGumboParser.g:3964:2: ( () otherlv_1= Spec ( ( ( (lv_rea_2_0= ruleReads ) )? ( (lv_req_3_0= ruleRequires ) )? ( (lv_mod_4_0= ruleModifies ) )? ( (lv_ens_5_0= ruleEnsures ) )? ) | ( ( (lv_dcc_6_0= ruleDefContractCase ) )+ ( (lv_rea_7_0= ruleReads ) )? ( (lv_mod_8_0= ruleModifies ) )? ) ) )
            // InternalGumboParser.g:3965:3: () otherlv_1= Spec ( ( ( (lv_rea_2_0= ruleReads ) )? ( (lv_req_3_0= ruleRequires ) )? ( (lv_mod_4_0= ruleModifies ) )? ( (lv_ens_5_0= ruleEnsures ) )? ) | ( ( (lv_dcc_6_0= ruleDefContractCase ) )+ ( (lv_rea_7_0= ruleReads ) )? ( (lv_mod_8_0= ruleModifies ) )? ) )
            {
            // InternalGumboParser.g:3965:3: ()
            // InternalGumboParser.g:3966:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDefContractAccess().getDefContractAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Spec,FollowSets000.FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDefContractAccess().getSpecKeyword_1());
              		
            }
            // InternalGumboParser.g:3976:3: ( ( ( (lv_rea_2_0= ruleReads ) )? ( (lv_req_3_0= ruleRequires ) )? ( (lv_mod_4_0= ruleModifies ) )? ( (lv_ens_5_0= ruleEnsures ) )? ) | ( ( (lv_dcc_6_0= ruleDefContractCase ) )+ ( (lv_rea_7_0= ruleReads ) )? ( (lv_mod_8_0= ruleModifies ) )? ) )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==EOF||(LA79_0>=Modifies && LA79_0<=Requires)||LA79_0==Ensures||LA79_0==Reads||LA79_0==ColonEqualsSign) ) {
                alt79=1;
            }
            else if ( (LA79_0==Case) ) {
                alt79=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // InternalGumboParser.g:3977:4: ( ( (lv_rea_2_0= ruleReads ) )? ( (lv_req_3_0= ruleRequires ) )? ( (lv_mod_4_0= ruleModifies ) )? ( (lv_ens_5_0= ruleEnsures ) )? )
                    {
                    // InternalGumboParser.g:3977:4: ( ( (lv_rea_2_0= ruleReads ) )? ( (lv_req_3_0= ruleRequires ) )? ( (lv_mod_4_0= ruleModifies ) )? ( (lv_ens_5_0= ruleEnsures ) )? )
                    // InternalGumboParser.g:3978:5: ( (lv_rea_2_0= ruleReads ) )? ( (lv_req_3_0= ruleRequires ) )? ( (lv_mod_4_0= ruleModifies ) )? ( (lv_ens_5_0= ruleEnsures ) )?
                    {
                    // InternalGumboParser.g:3978:5: ( (lv_rea_2_0= ruleReads ) )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==Reads) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // InternalGumboParser.g:3979:6: (lv_rea_2_0= ruleReads )
                            {
                            // InternalGumboParser.g:3979:6: (lv_rea_2_0= ruleReads )
                            // InternalGumboParser.g:3980:7: lv_rea_2_0= ruleReads
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getDefContractAccess().getReaReadsParserRuleCall_2_0_0_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_66);
                            lv_rea_2_0=ruleReads();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getDefContractRule());
                              							}
                              							set(
                              								current,
                              								"rea",
                              								lv_rea_2_0,
                              								"org.sireum.aadl.gumbo.Gumbo.Reads");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }
                            break;

                    }

                    // InternalGumboParser.g:3997:5: ( (lv_req_3_0= ruleRequires ) )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==Requires) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // InternalGumboParser.g:3998:6: (lv_req_3_0= ruleRequires )
                            {
                            // InternalGumboParser.g:3998:6: (lv_req_3_0= ruleRequires )
                            // InternalGumboParser.g:3999:7: lv_req_3_0= ruleRequires
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getDefContractAccess().getReqRequiresParserRuleCall_2_0_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_67);
                            lv_req_3_0=ruleRequires();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getDefContractRule());
                              							}
                              							set(
                              								current,
                              								"req",
                              								lv_req_3_0,
                              								"org.sireum.aadl.gumbo.Gumbo.Requires");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }
                            break;

                    }

                    // InternalGumboParser.g:4016:5: ( (lv_mod_4_0= ruleModifies ) )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==Modifies) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // InternalGumboParser.g:4017:6: (lv_mod_4_0= ruleModifies )
                            {
                            // InternalGumboParser.g:4017:6: (lv_mod_4_0= ruleModifies )
                            // InternalGumboParser.g:4018:7: lv_mod_4_0= ruleModifies
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getDefContractAccess().getModModifiesParserRuleCall_2_0_2_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_68);
                            lv_mod_4_0=ruleModifies();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getDefContractRule());
                              							}
                              							set(
                              								current,
                              								"mod",
                              								lv_mod_4_0,
                              								"org.sireum.aadl.gumbo.Gumbo.Modifies");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }
                            break;

                    }

                    // InternalGumboParser.g:4035:5: ( (lv_ens_5_0= ruleEnsures ) )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==Ensures) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // InternalGumboParser.g:4036:6: (lv_ens_5_0= ruleEnsures )
                            {
                            // InternalGumboParser.g:4036:6: (lv_ens_5_0= ruleEnsures )
                            // InternalGumboParser.g:4037:7: lv_ens_5_0= ruleEnsures
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getDefContractAccess().getEnsEnsuresParserRuleCall_2_0_3_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_ens_5_0=ruleEnsures();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getDefContractRule());
                              							}
                              							set(
                              								current,
                              								"ens",
                              								lv_ens_5_0,
                              								"org.sireum.aadl.gumbo.Gumbo.Ensures");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:4056:4: ( ( (lv_dcc_6_0= ruleDefContractCase ) )+ ( (lv_rea_7_0= ruleReads ) )? ( (lv_mod_8_0= ruleModifies ) )? )
                    {
                    // InternalGumboParser.g:4056:4: ( ( (lv_dcc_6_0= ruleDefContractCase ) )+ ( (lv_rea_7_0= ruleReads ) )? ( (lv_mod_8_0= ruleModifies ) )? )
                    // InternalGumboParser.g:4057:5: ( (lv_dcc_6_0= ruleDefContractCase ) )+ ( (lv_rea_7_0= ruleReads ) )? ( (lv_mod_8_0= ruleModifies ) )?
                    {
                    // InternalGumboParser.g:4057:5: ( (lv_dcc_6_0= ruleDefContractCase ) )+
                    int cnt76=0;
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==Case) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // InternalGumboParser.g:4058:6: (lv_dcc_6_0= ruleDefContractCase )
                    	    {
                    	    // InternalGumboParser.g:4058:6: (lv_dcc_6_0= ruleDefContractCase )
                    	    // InternalGumboParser.g:4059:7: lv_dcc_6_0= ruleDefContractCase
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDefContractAccess().getDccDefContractCaseParserRuleCall_2_1_0_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_65);
                    	    lv_dcc_6_0=ruleDefContractCase();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getDefContractRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"dcc",
                    	      								lv_dcc_6_0,
                    	      								"org.sireum.aadl.gumbo.Gumbo.DefContractCase");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt76 >= 1 ) break loop76;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(76, input);
                                throw eee;
                        }
                        cnt76++;
                    } while (true);

                    // InternalGumboParser.g:4076:5: ( (lv_rea_7_0= ruleReads ) )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==Reads) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // InternalGumboParser.g:4077:6: (lv_rea_7_0= ruleReads )
                            {
                            // InternalGumboParser.g:4077:6: (lv_rea_7_0= ruleReads )
                            // InternalGumboParser.g:4078:7: lv_rea_7_0= ruleReads
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getDefContractAccess().getReaReadsParserRuleCall_2_1_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_69);
                            lv_rea_7_0=ruleReads();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getDefContractRule());
                              							}
                              							set(
                              								current,
                              								"rea",
                              								lv_rea_7_0,
                              								"org.sireum.aadl.gumbo.Gumbo.Reads");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }
                            break;

                    }

                    // InternalGumboParser.g:4095:5: ( (lv_mod_8_0= ruleModifies ) )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==Modifies) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // InternalGumboParser.g:4096:6: (lv_mod_8_0= ruleModifies )
                            {
                            // InternalGumboParser.g:4096:6: (lv_mod_8_0= ruleModifies )
                            // InternalGumboParser.g:4097:7: lv_mod_8_0= ruleModifies
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getDefContractAccess().getModModifiesParserRuleCall_2_1_2_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_mod_8_0=ruleModifies();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getDefContractRule());
                              							}
                              							set(
                              								current,
                              								"mod",
                              								lv_mod_8_0,
                              								"org.sireum.aadl.gumbo.Gumbo.Modifies");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }
                            break;

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
    // $ANTLR end "ruleDefContract"


    // $ANTLR start "entryRuleDefContractCase"
    // InternalGumboParser.g:4120:1: entryRuleDefContractCase returns [EObject current=null] : iv_ruleDefContractCase= ruleDefContractCase EOF ;
    public final EObject entryRuleDefContractCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefContractCase = null;


        try {
            // InternalGumboParser.g:4120:56: (iv_ruleDefContractCase= ruleDefContractCase EOF )
            // InternalGumboParser.g:4121:2: iv_ruleDefContractCase= ruleDefContractCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefContractCaseRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDefContractCase=ruleDefContractCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefContractCase; 
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
    // $ANTLR end "entryRuleDefContractCase"


    // $ANTLR start "ruleDefContractCase"
    // InternalGumboParser.g:4127:1: ruleDefContractCase returns [EObject current=null] : ( () otherlv_1= Case this_STRING_2= RULE_STRING ( (lv_r_3_0= ruleRequires ) )? ( (lv_e_4_0= ruleEnsures ) )? ) ;
    public final EObject ruleDefContractCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_STRING_2=null;
        EObject lv_r_3_0 = null;

        EObject lv_e_4_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:4133:2: ( ( () otherlv_1= Case this_STRING_2= RULE_STRING ( (lv_r_3_0= ruleRequires ) )? ( (lv_e_4_0= ruleEnsures ) )? ) )
            // InternalGumboParser.g:4134:2: ( () otherlv_1= Case this_STRING_2= RULE_STRING ( (lv_r_3_0= ruleRequires ) )? ( (lv_e_4_0= ruleEnsures ) )? )
            {
            // InternalGumboParser.g:4134:2: ( () otherlv_1= Case this_STRING_2= RULE_STRING ( (lv_r_3_0= ruleRequires ) )? ( (lv_e_4_0= ruleEnsures ) )? )
            // InternalGumboParser.g:4135:3: () otherlv_1= Case this_STRING_2= RULE_STRING ( (lv_r_3_0= ruleRequires ) )? ( (lv_e_4_0= ruleEnsures ) )?
            {
            // InternalGumboParser.g:4135:3: ()
            // InternalGumboParser.g:4136:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDefContractCaseAccess().getDefContractCaseAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Case,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDefContractCaseAccess().getCaseKeyword_1());
              		
            }
            this_STRING_2=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_70); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_STRING_2, grammarAccess.getDefContractCaseAccess().getSTRINGTerminalRuleCall_2());
              		
            }
            // InternalGumboParser.g:4150:3: ( (lv_r_3_0= ruleRequires ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==Requires) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalGumboParser.g:4151:4: (lv_r_3_0= ruleRequires )
                    {
                    // InternalGumboParser.g:4151:4: (lv_r_3_0= ruleRequires )
                    // InternalGumboParser.g:4152:5: lv_r_3_0= ruleRequires
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDefContractCaseAccess().getRRequiresParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_68);
                    lv_r_3_0=ruleRequires();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDefContractCaseRule());
                      					}
                      					set(
                      						current,
                      						"r",
                      						lv_r_3_0,
                      						"org.sireum.aadl.gumbo.Gumbo.Requires");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalGumboParser.g:4169:3: ( (lv_e_4_0= ruleEnsures ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==Ensures) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalGumboParser.g:4170:4: (lv_e_4_0= ruleEnsures )
                    {
                    // InternalGumboParser.g:4170:4: (lv_e_4_0= ruleEnsures )
                    // InternalGumboParser.g:4171:5: lv_e_4_0= ruleEnsures
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDefContractCaseAccess().getEEnsuresParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_e_4_0=ruleEnsures();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDefContractCaseRule());
                      					}
                      					set(
                      						current,
                      						"e",
                      						lv_e_4_0,
                      						"org.sireum.aadl.gumbo.Gumbo.Ensures");
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
    // $ANTLR end "ruleDefContractCase"


    // $ANTLR start "entryRuleTypeParams"
    // InternalGumboParser.g:4192:1: entryRuleTypeParams returns [String current=null] : iv_ruleTypeParams= ruleTypeParams EOF ;
    public final String entryRuleTypeParams() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeParams = null;


        try {
            // InternalGumboParser.g:4192:50: (iv_ruleTypeParams= ruleTypeParams EOF )
            // InternalGumboParser.g:4193:2: iv_ruleTypeParams= ruleTypeParams EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeParamsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypeParams=ruleTypeParams();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeParams.getText(); 
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
    // $ANTLR end "entryRuleTypeParams"


    // $ANTLR start "ruleTypeParams"
    // InternalGumboParser.g:4199:1: ruleTypeParams returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= LeftSquareBracket this_TypeParam_1= ruleTypeParam (kw= Comma this_TypeParam_3= ruleTypeParam )* kw= RightSquareBracket ) ;
    public final AntlrDatatypeRuleToken ruleTypeParams() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TypeParam_1 = null;

        AntlrDatatypeRuleToken this_TypeParam_3 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:4205:2: ( (kw= LeftSquareBracket this_TypeParam_1= ruleTypeParam (kw= Comma this_TypeParam_3= ruleTypeParam )* kw= RightSquareBracket ) )
            // InternalGumboParser.g:4206:2: (kw= LeftSquareBracket this_TypeParam_1= ruleTypeParam (kw= Comma this_TypeParam_3= ruleTypeParam )* kw= RightSquareBracket )
            {
            // InternalGumboParser.g:4206:2: (kw= LeftSquareBracket this_TypeParam_1= ruleTypeParam (kw= Comma this_TypeParam_3= ruleTypeParam )* kw= RightSquareBracket )
            // InternalGumboParser.g:4207:3: kw= LeftSquareBracket this_TypeParam_1= ruleTypeParam (kw= Comma this_TypeParam_3= ruleTypeParam )* kw= RightSquareBracket
            {
            kw=(Token)match(input,LeftSquareBracket,FollowSets000.FOLLOW_71); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getTypeParamsAccess().getLeftSquareBracketKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTypeParamsAccess().getTypeParamParserRuleCall_1());
              		
            }
            pushFollow(FollowSets000.FOLLOW_55);
            this_TypeParam_1=ruleTypeParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_TypeParam_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGumboParser.g:4222:3: (kw= Comma this_TypeParam_3= ruleTypeParam )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==Comma) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // InternalGumboParser.g:4223:4: kw= Comma this_TypeParam_3= ruleTypeParam
            	    {
            	    kw=(Token)match(input,Comma,FollowSets000.FOLLOW_71); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getTypeParamsAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getTypeParamsAccess().getTypeParamParserRuleCall_2_1());
            	      			
            	    }
            	    pushFollow(FollowSets000.FOLLOW_55);
            	    this_TypeParam_3=ruleTypeParam();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_TypeParam_3);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);

            kw=(Token)match(input,RightSquareBracket,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getTypeParamsAccess().getRightSquareBracketKeyword_3());
              		
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
    // $ANTLR end "ruleTypeParams"


    // $ANTLR start "entryRuleTypeParam"
    // InternalGumboParser.g:4248:1: entryRuleTypeParam returns [String current=null] : iv_ruleTypeParam= ruleTypeParam EOF ;
    public final String entryRuleTypeParam() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeParam = null;


        try {
            // InternalGumboParser.g:4248:49: (iv_ruleTypeParam= ruleTypeParam EOF )
            // InternalGumboParser.g:4249:2: iv_ruleTypeParam= ruleTypeParam EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeParamRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypeParam=ruleTypeParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeParam.getText(); 
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
    // $ANTLR end "entryRuleTypeParam"


    // $ANTLR start "ruleTypeParam"
    // InternalGumboParser.g:4255:1: ruleTypeParam returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= Mut )? this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleTypeParam() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalGumboParser.g:4261:2: ( ( (kw= Mut )? this_ID_1= RULE_ID ) )
            // InternalGumboParser.g:4262:2: ( (kw= Mut )? this_ID_1= RULE_ID )
            {
            // InternalGumboParser.g:4262:2: ( (kw= Mut )? this_ID_1= RULE_ID )
            // InternalGumboParser.g:4263:3: (kw= Mut )? this_ID_1= RULE_ID
            {
            // InternalGumboParser.g:4263:3: (kw= Mut )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==Mut) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalGumboParser.g:4264:4: kw= Mut
                    {
                    kw=(Token)match(input,Mut,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getTypeParamAccess().getMutKeyword_0());
                      			
                    }

                    }
                    break;

            }

            this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_1, grammarAccess.getTypeParamAccess().getIDTerminalRuleCall_1());
              		
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
    // $ANTLR end "ruleTypeParam"


    // $ANTLR start "entryRuleReads"
    // InternalGumboParser.g:4281:1: entryRuleReads returns [EObject current=null] : iv_ruleReads= ruleReads EOF ;
    public final EObject entryRuleReads() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReads = null;


        try {
            // InternalGumboParser.g:4281:46: (iv_ruleReads= ruleReads EOF )
            // InternalGumboParser.g:4282:2: iv_ruleReads= ruleReads EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReadsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleReads=ruleReads();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReads; 
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
    // $ANTLR end "entryRuleReads"


    // $ANTLR start "ruleReads"
    // InternalGumboParser.g:4288:1: ruleReads returns [EObject current=null] : (otherlv_0= Reads ( (lv_e_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_e_3_0= ruleExpr ) ) )* ) ;
    public final EObject ruleReads() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_e_1_0 = null;

        EObject lv_e_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:4294:2: ( (otherlv_0= Reads ( (lv_e_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_e_3_0= ruleExpr ) ) )* ) )
            // InternalGumboParser.g:4295:2: (otherlv_0= Reads ( (lv_e_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_e_3_0= ruleExpr ) ) )* )
            {
            // InternalGumboParser.g:4295:2: (otherlv_0= Reads ( (lv_e_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_e_3_0= ruleExpr ) ) )* )
            // InternalGumboParser.g:4296:3: otherlv_0= Reads ( (lv_e_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_e_3_0= ruleExpr ) ) )*
            {
            otherlv_0=(Token)match(input,Reads,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReadsAccess().getReadsKeyword_0());
              		
            }
            // InternalGumboParser.g:4300:3: ( (lv_e_1_0= ruleExpr ) )
            // InternalGumboParser.g:4301:4: (lv_e_1_0= ruleExpr )
            {
            // InternalGumboParser.g:4301:4: (lv_e_1_0= ruleExpr )
            // InternalGumboParser.g:4302:5: lv_e_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReadsAccess().getEExprParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_72);
            lv_e_1_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReadsRule());
              					}
              					add(
              						current,
              						"e",
              						lv_e_1_0,
              						"org.sireum.aadl.gumbo.Gumbo.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumboParser.g:4319:3: (otherlv_2= Comma ( (lv_e_3_0= ruleExpr ) ) )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==Comma) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // InternalGumboParser.g:4320:4: otherlv_2= Comma ( (lv_e_3_0= ruleExpr ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FollowSets000.FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getReadsAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalGumboParser.g:4324:4: ( (lv_e_3_0= ruleExpr ) )
            	    // InternalGumboParser.g:4325:5: (lv_e_3_0= ruleExpr )
            	    {
            	    // InternalGumboParser.g:4325:5: (lv_e_3_0= ruleExpr )
            	    // InternalGumboParser.g:4326:6: lv_e_3_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getReadsAccess().getEExprParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_72);
            	    lv_e_3_0=ruleExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getReadsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"e",
            	      							lv_e_3_0,
            	      							"org.sireum.aadl.gumbo.Gumbo.Expr");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop84;
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
    // $ANTLR end "ruleReads"


    // $ANTLR start "entryRuleRequires"
    // InternalGumboParser.g:4348:1: entryRuleRequires returns [EObject current=null] : iv_ruleRequires= ruleRequires EOF ;
    public final EObject entryRuleRequires() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequires = null;


        try {
            // InternalGumboParser.g:4348:49: (iv_ruleRequires= ruleRequires EOF )
            // InternalGumboParser.g:4349:2: iv_ruleRequires= ruleRequires EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRequiresRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRequires=ruleRequires();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRequires; 
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
    // $ANTLR end "entryRuleRequires"


    // $ANTLR start "ruleRequires"
    // InternalGumboParser.g:4355:1: ruleRequires returns [EObject current=null] : (otherlv_0= Requires ( (lv_e_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_e_3_0= ruleExpr ) ) )* ) ;
    public final EObject ruleRequires() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_e_1_0 = null;

        EObject lv_e_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:4361:2: ( (otherlv_0= Requires ( (lv_e_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_e_3_0= ruleExpr ) ) )* ) )
            // InternalGumboParser.g:4362:2: (otherlv_0= Requires ( (lv_e_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_e_3_0= ruleExpr ) ) )* )
            {
            // InternalGumboParser.g:4362:2: (otherlv_0= Requires ( (lv_e_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_e_3_0= ruleExpr ) ) )* )
            // InternalGumboParser.g:4363:3: otherlv_0= Requires ( (lv_e_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_e_3_0= ruleExpr ) ) )*
            {
            otherlv_0=(Token)match(input,Requires,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRequiresAccess().getRequiresKeyword_0());
              		
            }
            // InternalGumboParser.g:4367:3: ( (lv_e_1_0= ruleExpr ) )
            // InternalGumboParser.g:4368:4: (lv_e_1_0= ruleExpr )
            {
            // InternalGumboParser.g:4368:4: (lv_e_1_0= ruleExpr )
            // InternalGumboParser.g:4369:5: lv_e_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRequiresAccess().getEExprParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_72);
            lv_e_1_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRequiresRule());
              					}
              					add(
              						current,
              						"e",
              						lv_e_1_0,
              						"org.sireum.aadl.gumbo.Gumbo.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumboParser.g:4386:3: (otherlv_2= Comma ( (lv_e_3_0= ruleExpr ) ) )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==Comma) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // InternalGumboParser.g:4387:4: otherlv_2= Comma ( (lv_e_3_0= ruleExpr ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FollowSets000.FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getRequiresAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalGumboParser.g:4391:4: ( (lv_e_3_0= ruleExpr ) )
            	    // InternalGumboParser.g:4392:5: (lv_e_3_0= ruleExpr )
            	    {
            	    // InternalGumboParser.g:4392:5: (lv_e_3_0= ruleExpr )
            	    // InternalGumboParser.g:4393:6: lv_e_3_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getRequiresAccess().getEExprParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_72);
            	    lv_e_3_0=ruleExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getRequiresRule());
            	      						}
            	      						add(
            	      							current,
            	      							"e",
            	      							lv_e_3_0,
            	      							"org.sireum.aadl.gumbo.Gumbo.Expr");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop85;
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
    // $ANTLR end "ruleRequires"


    // $ANTLR start "entryRuleModifies"
    // InternalGumboParser.g:4415:1: entryRuleModifies returns [EObject current=null] : iv_ruleModifies= ruleModifies EOF ;
    public final EObject entryRuleModifies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifies = null;


        try {
            // InternalGumboParser.g:4415:49: (iv_ruleModifies= ruleModifies EOF )
            // InternalGumboParser.g:4416:2: iv_ruleModifies= ruleModifies EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModifiesRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleModifies=ruleModifies();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModifies; 
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
    // $ANTLR end "entryRuleModifies"


    // $ANTLR start "ruleModifies"
    // InternalGumboParser.g:4422:1: ruleModifies returns [EObject current=null] : (otherlv_0= Modifies ( (lv_e_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_e_3_0= ruleExpr ) ) )* ) ;
    public final EObject ruleModifies() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_e_1_0 = null;

        EObject lv_e_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:4428:2: ( (otherlv_0= Modifies ( (lv_e_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_e_3_0= ruleExpr ) ) )* ) )
            // InternalGumboParser.g:4429:2: (otherlv_0= Modifies ( (lv_e_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_e_3_0= ruleExpr ) ) )* )
            {
            // InternalGumboParser.g:4429:2: (otherlv_0= Modifies ( (lv_e_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_e_3_0= ruleExpr ) ) )* )
            // InternalGumboParser.g:4430:3: otherlv_0= Modifies ( (lv_e_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_e_3_0= ruleExpr ) ) )*
            {
            otherlv_0=(Token)match(input,Modifies,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getModifiesAccess().getModifiesKeyword_0());
              		
            }
            // InternalGumboParser.g:4434:3: ( (lv_e_1_0= ruleExpr ) )
            // InternalGumboParser.g:4435:4: (lv_e_1_0= ruleExpr )
            {
            // InternalGumboParser.g:4435:4: (lv_e_1_0= ruleExpr )
            // InternalGumboParser.g:4436:5: lv_e_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getModifiesAccess().getEExprParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_72);
            lv_e_1_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getModifiesRule());
              					}
              					add(
              						current,
              						"e",
              						lv_e_1_0,
              						"org.sireum.aadl.gumbo.Gumbo.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumboParser.g:4453:3: (otherlv_2= Comma ( (lv_e_3_0= ruleExpr ) ) )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==Comma) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // InternalGumboParser.g:4454:4: otherlv_2= Comma ( (lv_e_3_0= ruleExpr ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FollowSets000.FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getModifiesAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalGumboParser.g:4458:4: ( (lv_e_3_0= ruleExpr ) )
            	    // InternalGumboParser.g:4459:5: (lv_e_3_0= ruleExpr )
            	    {
            	    // InternalGumboParser.g:4459:5: (lv_e_3_0= ruleExpr )
            	    // InternalGumboParser.g:4460:6: lv_e_3_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getModifiesAccess().getEExprParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_72);
            	    lv_e_3_0=ruleExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getModifiesRule());
            	      						}
            	      						add(
            	      							current,
            	      							"e",
            	      							lv_e_3_0,
            	      							"org.sireum.aadl.gumbo.Gumbo.Expr");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop86;
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
    // $ANTLR end "ruleModifies"


    // $ANTLR start "entryRuleEnsures"
    // InternalGumboParser.g:4482:1: entryRuleEnsures returns [EObject current=null] : iv_ruleEnsures= ruleEnsures EOF ;
    public final EObject entryRuleEnsures() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnsures = null;


        try {
            // InternalGumboParser.g:4482:48: (iv_ruleEnsures= ruleEnsures EOF )
            // InternalGumboParser.g:4483:2: iv_ruleEnsures= ruleEnsures EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnsuresRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEnsures=ruleEnsures();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnsures; 
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
    // $ANTLR end "entryRuleEnsures"


    // $ANTLR start "ruleEnsures"
    // InternalGumboParser.g:4489:1: ruleEnsures returns [EObject current=null] : (otherlv_0= Ensures ( (lv_e_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_e_3_0= ruleExpr ) ) )* ) ;
    public final EObject ruleEnsures() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_e_1_0 = null;

        EObject lv_e_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:4495:2: ( (otherlv_0= Ensures ( (lv_e_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_e_3_0= ruleExpr ) ) )* ) )
            // InternalGumboParser.g:4496:2: (otherlv_0= Ensures ( (lv_e_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_e_3_0= ruleExpr ) ) )* )
            {
            // InternalGumboParser.g:4496:2: (otherlv_0= Ensures ( (lv_e_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_e_3_0= ruleExpr ) ) )* )
            // InternalGumboParser.g:4497:3: otherlv_0= Ensures ( (lv_e_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_e_3_0= ruleExpr ) ) )*
            {
            otherlv_0=(Token)match(input,Ensures,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEnsuresAccess().getEnsuresKeyword_0());
              		
            }
            // InternalGumboParser.g:4501:3: ( (lv_e_1_0= ruleExpr ) )
            // InternalGumboParser.g:4502:4: (lv_e_1_0= ruleExpr )
            {
            // InternalGumboParser.g:4502:4: (lv_e_1_0= ruleExpr )
            // InternalGumboParser.g:4503:5: lv_e_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEnsuresAccess().getEExprParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_72);
            lv_e_1_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEnsuresRule());
              					}
              					add(
              						current,
              						"e",
              						lv_e_1_0,
              						"org.sireum.aadl.gumbo.Gumbo.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumboParser.g:4520:3: (otherlv_2= Comma ( (lv_e_3_0= ruleExpr ) ) )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==Comma) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // InternalGumboParser.g:4521:4: otherlv_2= Comma ( (lv_e_3_0= ruleExpr ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FollowSets000.FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getEnsuresAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalGumboParser.g:4525:4: ( (lv_e_3_0= ruleExpr ) )
            	    // InternalGumboParser.g:4526:5: (lv_e_3_0= ruleExpr )
            	    {
            	    // InternalGumboParser.g:4526:5: (lv_e_3_0= ruleExpr )
            	    // InternalGumboParser.g:4527:6: lv_e_3_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEnsuresAccess().getEExprParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_72);
            	    lv_e_3_0=ruleExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getEnsuresRule());
            	      						}
            	      						add(
            	      							current,
            	      							"e",
            	      							lv_e_3_0,
            	      							"org.sireum.aadl.gumbo.Gumbo.Expr");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop87;
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
    // $ANTLR end "ruleEnsures"


    // $ANTLR start "entryRuleContainedPropertyAssociation"
    // InternalGumboParser.g:4549:1: entryRuleContainedPropertyAssociation returns [EObject current=null] : iv_ruleContainedPropertyAssociation= ruleContainedPropertyAssociation EOF ;
    public final EObject entryRuleContainedPropertyAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainedPropertyAssociation = null;


        try {
            // InternalGumboParser.g:4549:69: (iv_ruleContainedPropertyAssociation= ruleContainedPropertyAssociation EOF )
            // InternalGumboParser.g:4550:2: iv_ruleContainedPropertyAssociation= ruleContainedPropertyAssociation EOF
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
    // InternalGumboParser.g:4556:1: ruleContainedPropertyAssociation returns [EObject current=null] : ( ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon ) ;
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
            // InternalGumboParser.g:4562:2: ( ( ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon ) )
            // InternalGumboParser.g:4563:2: ( ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon )
            {
            // InternalGumboParser.g:4563:2: ( ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon )
            // InternalGumboParser.g:4564:3: ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon
            {
            // InternalGumboParser.g:4564:3: ( ( ruleQPREF ) )
            // InternalGumboParser.g:4565:4: ( ruleQPREF )
            {
            // InternalGumboParser.g:4565:4: ( ruleQPREF )
            // InternalGumboParser.g:4566:5: ruleQPREF
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getContainedPropertyAssociationRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getPropertyPropertyCrossReference_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_73);
            ruleQPREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumboParser.g:4580:3: (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==EqualsSignGreaterThanSign) ) {
                alt88=1;
            }
            else if ( (LA88_0==PlusSignEqualsSignGreaterThanSign) ) {
                alt88=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // InternalGumboParser.g:4581:4: otherlv_1= EqualsSignGreaterThanSign
                    {
                    otherlv_1=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_74); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getContainedPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:4586:4: ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) )
                    {
                    // InternalGumboParser.g:4586:4: ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) )
                    // InternalGumboParser.g:4587:5: (lv_append_2_0= PlusSignEqualsSignGreaterThanSign )
                    {
                    // InternalGumboParser.g:4587:5: (lv_append_2_0= PlusSignEqualsSignGreaterThanSign )
                    // InternalGumboParser.g:4588:6: lv_append_2_0= PlusSignEqualsSignGreaterThanSign
                    {
                    lv_append_2_0=(Token)match(input,PlusSignEqualsSignGreaterThanSign,FollowSets000.FOLLOW_74); if (state.failed) return current;
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

            // InternalGumboParser.g:4601:3: ( (lv_constant_3_0= Constant ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==Constant) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalGumboParser.g:4602:4: (lv_constant_3_0= Constant )
                    {
                    // InternalGumboParser.g:4602:4: (lv_constant_3_0= Constant )
                    // InternalGumboParser.g:4603:5: lv_constant_3_0= Constant
                    {
                    lv_constant_3_0=(Token)match(input,Constant,FollowSets000.FOLLOW_74); if (state.failed) return current;
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

            // InternalGumboParser.g:4615:3: ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* )
            // InternalGumboParser.g:4616:4: ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )*
            {
            // InternalGumboParser.g:4616:4: ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) )
            // InternalGumboParser.g:4617:5: (lv_ownedValue_4_0= ruleOptionalModalPropertyValue )
            {
            // InternalGumboParser.g:4617:5: (lv_ownedValue_4_0= ruleOptionalModalPropertyValue )
            // InternalGumboParser.g:4618:6: lv_ownedValue_4_0= ruleOptionalModalPropertyValue
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueOptionalModalPropertyValueParserRuleCall_3_0_0());
              					
            }
            pushFollow(FollowSets000.FOLLOW_75);
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

            // InternalGumboParser.g:4635:4: (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==Comma) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // InternalGumboParser.g:4636:5: otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) )
            	    {
            	    otherlv_5=(Token)match(input,Comma,FollowSets000.FOLLOW_74); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_5, grammarAccess.getContainedPropertyAssociationAccess().getCommaKeyword_3_1_0());
            	      				
            	    }
            	    // InternalGumboParser.g:4640:5: ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) )
            	    // InternalGumboParser.g:4641:6: (lv_ownedValue_6_0= ruleOptionalModalPropertyValue )
            	    {
            	    // InternalGumboParser.g:4641:6: (lv_ownedValue_6_0= ruleOptionalModalPropertyValue )
            	    // InternalGumboParser.g:4642:7: lv_ownedValue_6_0= ruleOptionalModalPropertyValue
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueOptionalModalPropertyValueParserRuleCall_3_1_1_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_75);
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
            	    break loop90;
                }
            } while (true);


            }

            // InternalGumboParser.g:4661:3: ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==Applies) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalGumboParser.g:4662:4: ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )*
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToKeywordsParserRuleCall_4_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_10);
                    ruleAppliesToKeywords();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalGumboParser.g:4669:4: ( (lv_appliesTo_8_0= ruleContainmentPath ) )
                    // InternalGumboParser.g:4670:5: (lv_appliesTo_8_0= ruleContainmentPath )
                    {
                    // InternalGumboParser.g:4670:5: (lv_appliesTo_8_0= ruleContainmentPath )
                    // InternalGumboParser.g:4671:6: lv_appliesTo_8_0= ruleContainmentPath
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToContainmentPathParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_76);
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

                    // InternalGumboParser.g:4688:4: (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )*
                    loop91:
                    do {
                        int alt91=2;
                        int LA91_0 = input.LA(1);

                        if ( (LA91_0==Comma) ) {
                            alt91=1;
                        }


                        switch (alt91) {
                    	case 1 :
                    	    // InternalGumboParser.g:4689:5: otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) )
                    	    {
                    	    otherlv_9=(Token)match(input,Comma,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_9, grammarAccess.getContainedPropertyAssociationAccess().getCommaKeyword_4_2_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:4693:5: ( (lv_appliesTo_10_0= ruleContainmentPath ) )
                    	    // InternalGumboParser.g:4694:6: (lv_appliesTo_10_0= ruleContainmentPath )
                    	    {
                    	    // InternalGumboParser.g:4694:6: (lv_appliesTo_10_0= ruleContainmentPath )
                    	    // InternalGumboParser.g:4695:7: lv_appliesTo_10_0= ruleContainmentPath
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToContainmentPathParserRuleCall_4_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_76);
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
                    	    break loop91;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalGumboParser.g:4714:3: ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==In) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalGumboParser.g:4715:4: ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getInBindingKeywordsParserRuleCall_5_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_34);
                    ruleInBindingKeywords();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_12=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getContainedPropertyAssociationAccess().getLeftParenthesisKeyword_5_1());
                      			
                    }
                    // InternalGumboParser.g:4726:4: ( ( ruleQCREF ) )
                    // InternalGumboParser.g:4727:5: ( ruleQCREF )
                    {
                    // InternalGumboParser.g:4727:5: ( ruleQCREF )
                    // InternalGumboParser.g:4728:6: ruleQCREF
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getContainedPropertyAssociationRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getInBindingClassifierCrossReference_5_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_36);
                    ruleQCREF();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_14=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_13); if (state.failed) return current;
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
    // InternalGumboParser.g:4755:1: entryRuleContainmentPath returns [EObject current=null] : iv_ruleContainmentPath= ruleContainmentPath EOF ;
    public final EObject entryRuleContainmentPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainmentPath = null;


        try {
            // InternalGumboParser.g:4755:56: (iv_ruleContainmentPath= ruleContainmentPath EOF )
            // InternalGumboParser.g:4756:2: iv_ruleContainmentPath= ruleContainmentPath EOF
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
    // InternalGumboParser.g:4762:1: ruleContainmentPath returns [EObject current=null] : ( (lv_path_0_0= ruleContainmentPathElement ) ) ;
    public final EObject ruleContainmentPath() throws RecognitionException {
        EObject current = null;

        EObject lv_path_0_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:4768:2: ( ( (lv_path_0_0= ruleContainmentPathElement ) ) )
            // InternalGumboParser.g:4769:2: ( (lv_path_0_0= ruleContainmentPathElement ) )
            {
            // InternalGumboParser.g:4769:2: ( (lv_path_0_0= ruleContainmentPathElement ) )
            // InternalGumboParser.g:4770:3: (lv_path_0_0= ruleContainmentPathElement )
            {
            // InternalGumboParser.g:4770:3: (lv_path_0_0= ruleContainmentPathElement )
            // InternalGumboParser.g:4771:4: lv_path_0_0= ruleContainmentPathElement
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
    // InternalGumboParser.g:4791:1: entryRuleOptionalModalPropertyValue returns [EObject current=null] : iv_ruleOptionalModalPropertyValue= ruleOptionalModalPropertyValue EOF ;
    public final EObject entryRuleOptionalModalPropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionalModalPropertyValue = null;


        try {
            // InternalGumboParser.g:4791:67: (iv_ruleOptionalModalPropertyValue= ruleOptionalModalPropertyValue EOF )
            // InternalGumboParser.g:4792:2: iv_ruleOptionalModalPropertyValue= ruleOptionalModalPropertyValue EOF
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
    // InternalGumboParser.g:4798:1: ruleOptionalModalPropertyValue returns [EObject current=null] : ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )? ) ;
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
            // InternalGumboParser.g:4804:2: ( ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )? ) )
            // InternalGumboParser.g:4805:2: ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )? )
            {
            // InternalGumboParser.g:4805:2: ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )? )
            // InternalGumboParser.g:4806:3: ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )?
            {
            // InternalGumboParser.g:4806:3: ( (lv_ownedValue_0_0= rulePropertyExpression ) )
            // InternalGumboParser.g:4807:4: (lv_ownedValue_0_0= rulePropertyExpression )
            {
            // InternalGumboParser.g:4807:4: (lv_ownedValue_0_0= rulePropertyExpression )
            // InternalGumboParser.g:4808:5: lv_ownedValue_0_0= rulePropertyExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOptionalModalPropertyValueAccess().getOwnedValuePropertyExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_77);
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

            // InternalGumboParser.g:4825:3: ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==In) ) {
                int LA95_1 = input.LA(2);

                if ( (LA95_1==Modes) ) {
                    alt95=1;
                }
            }
            switch (alt95) {
                case 1 :
                    // InternalGumboParser.g:4826:4: ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getOptionalModalPropertyValueAccess().getInModesKeywordsParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_34);
                    ruleInModesKeywords();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_2=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getOptionalModalPropertyValueAccess().getLeftParenthesisKeyword_1_1());
                      			
                    }
                    // InternalGumboParser.g:4837:4: ( (otherlv_3= RULE_ID ) )
                    // InternalGumboParser.g:4838:5: (otherlv_3= RULE_ID )
                    {
                    // InternalGumboParser.g:4838:5: (otherlv_3= RULE_ID )
                    // InternalGumboParser.g:4839:6: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getOptionalModalPropertyValueRule());
                      						}
                      					
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_47); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getOptionalModalPropertyValueAccess().getInModeModeCrossReference_1_2_0());
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:4850:4: (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )*
                    loop94:
                    do {
                        int alt94=2;
                        int LA94_0 = input.LA(1);

                        if ( (LA94_0==Comma) ) {
                            alt94=1;
                        }


                        switch (alt94) {
                    	case 1 :
                    	    // InternalGumboParser.g:4851:5: otherlv_4= Comma ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getOptionalModalPropertyValueAccess().getCommaKeyword_1_3_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:4855:5: ( (otherlv_5= RULE_ID ) )
                    	    // InternalGumboParser.g:4856:6: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalGumboParser.g:4856:6: (otherlv_5= RULE_ID )
                    	    // InternalGumboParser.g:4857:7: otherlv_5= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getOptionalModalPropertyValueRule());
                    	      							}
                    	      						
                    	    }
                    	    otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_47); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_5, grammarAccess.getOptionalModalPropertyValueAccess().getInModeModeCrossReference_1_3_1_0());
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop94;
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
    // InternalGumboParser.g:4878:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalGumboParser.g:4878:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalGumboParser.g:4879:2: iv_rulePropertyValue= rulePropertyValue EOF
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
    // InternalGumboParser.g:4885:1: rulePropertyValue returns [EObject current=null] : ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedValue_0_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:4891:2: ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) )
            // InternalGumboParser.g:4892:2: ( (lv_ownedValue_0_0= rulePropertyExpression ) )
            {
            // InternalGumboParser.g:4892:2: ( (lv_ownedValue_0_0= rulePropertyExpression ) )
            // InternalGumboParser.g:4893:3: (lv_ownedValue_0_0= rulePropertyExpression )
            {
            // InternalGumboParser.g:4893:3: (lv_ownedValue_0_0= rulePropertyExpression )
            // InternalGumboParser.g:4894:4: lv_ownedValue_0_0= rulePropertyExpression
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
    // InternalGumboParser.g:4914:1: entryRulePropertyExpression returns [EObject current=null] : iv_rulePropertyExpression= rulePropertyExpression EOF ;
    public final EObject entryRulePropertyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyExpression = null;


        try {
            // InternalGumboParser.g:4914:59: (iv_rulePropertyExpression= rulePropertyExpression EOF )
            // InternalGumboParser.g:4915:2: iv_rulePropertyExpression= rulePropertyExpression EOF
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
    // InternalGumboParser.g:4921:1: rulePropertyExpression returns [EObject current=null] : (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm ) ;
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
            // InternalGumboParser.g:4927:2: ( (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm ) )
            // InternalGumboParser.g:4928:2: (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm )
            {
            // InternalGumboParser.g:4928:2: (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm )
            int alt96=11;
            alt96 = dfa96.predict(input);
            switch (alt96) {
                case 1 :
                    // InternalGumboParser.g:4929:3: this_RecordTerm_0= ruleRecordTerm
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
                    // InternalGumboParser.g:4938:3: this_ReferenceTerm_1= ruleReferenceTerm
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
                    // InternalGumboParser.g:4947:3: this_ComponentClassifierTerm_2= ruleComponentClassifierTerm
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
                    // InternalGumboParser.g:4956:3: this_ComputedTerm_3= ruleComputedTerm
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
                    // InternalGumboParser.g:4965:3: this_StringTerm_4= ruleStringTerm
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
                    // InternalGumboParser.g:4974:3: this_NumericRangeTerm_5= ruleNumericRangeTerm
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
                    // InternalGumboParser.g:4983:3: this_RealTerm_6= ruleRealTerm
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
                    // InternalGumboParser.g:4992:3: this_IntegerTerm_7= ruleIntegerTerm
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
                    // InternalGumboParser.g:5001:3: this_ListTerm_8= ruleListTerm
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
                    // InternalGumboParser.g:5010:3: this_BooleanLiteral_9= ruleBooleanLiteral
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
                    // InternalGumboParser.g:5019:3: this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm
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
    // InternalGumboParser.g:5031:1: entryRuleLiteralorReferenceTerm returns [EObject current=null] : iv_ruleLiteralorReferenceTerm= ruleLiteralorReferenceTerm EOF ;
    public final EObject entryRuleLiteralorReferenceTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralorReferenceTerm = null;


        try {
            // InternalGumboParser.g:5031:63: (iv_ruleLiteralorReferenceTerm= ruleLiteralorReferenceTerm EOF )
            // InternalGumboParser.g:5032:2: iv_ruleLiteralorReferenceTerm= ruleLiteralorReferenceTerm EOF
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
    // InternalGumboParser.g:5038:1: ruleLiteralorReferenceTerm returns [EObject current=null] : ( ( ruleQPREF ) ) ;
    public final EObject ruleLiteralorReferenceTerm() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalGumboParser.g:5044:2: ( ( ( ruleQPREF ) ) )
            // InternalGumboParser.g:5045:2: ( ( ruleQPREF ) )
            {
            // InternalGumboParser.g:5045:2: ( ( ruleQPREF ) )
            // InternalGumboParser.g:5046:3: ( ruleQPREF )
            {
            // InternalGumboParser.g:5046:3: ( ruleQPREF )
            // InternalGumboParser.g:5047:4: ruleQPREF
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
    // InternalGumboParser.g:5064:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalGumboParser.g:5064:55: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalGumboParser.g:5065:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
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
    // InternalGumboParser.g:5071:1: ruleBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalGumboParser.g:5077:2: ( ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) ) )
            // InternalGumboParser.g:5078:2: ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) )
            {
            // InternalGumboParser.g:5078:2: ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) )
            // InternalGumboParser.g:5079:3: () ( ( (lv_value_1_0= True ) ) | otherlv_2= False )
            {
            // InternalGumboParser.g:5079:3: ()
            // InternalGumboParser.g:5080:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalGumboParser.g:5086:3: ( ( (lv_value_1_0= True ) ) | otherlv_2= False )
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==True) ) {
                alt97=1;
            }
            else if ( (LA97_0==False) ) {
                alt97=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }
            switch (alt97) {
                case 1 :
                    // InternalGumboParser.g:5087:4: ( (lv_value_1_0= True ) )
                    {
                    // InternalGumboParser.g:5087:4: ( (lv_value_1_0= True ) )
                    // InternalGumboParser.g:5088:5: (lv_value_1_0= True )
                    {
                    // InternalGumboParser.g:5088:5: (lv_value_1_0= True )
                    // InternalGumboParser.g:5089:6: lv_value_1_0= True
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
                    // InternalGumboParser.g:5102:4: otherlv_2= False
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
    // InternalGumboParser.g:5111:1: entryRuleConstantValue returns [EObject current=null] : iv_ruleConstantValue= ruleConstantValue EOF ;
    public final EObject entryRuleConstantValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantValue = null;


        try {
            // InternalGumboParser.g:5111:54: (iv_ruleConstantValue= ruleConstantValue EOF )
            // InternalGumboParser.g:5112:2: iv_ruleConstantValue= ruleConstantValue EOF
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
    // InternalGumboParser.g:5118:1: ruleConstantValue returns [EObject current=null] : ( ( ruleQPREF ) ) ;
    public final EObject ruleConstantValue() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalGumboParser.g:5124:2: ( ( ( ruleQPREF ) ) )
            // InternalGumboParser.g:5125:2: ( ( ruleQPREF ) )
            {
            // InternalGumboParser.g:5125:2: ( ( ruleQPREF ) )
            // InternalGumboParser.g:5126:3: ( ruleQPREF )
            {
            // InternalGumboParser.g:5126:3: ( ruleQPREF )
            // InternalGumboParser.g:5127:4: ruleQPREF
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
    // InternalGumboParser.g:5144:1: entryRuleReferenceTerm returns [EObject current=null] : iv_ruleReferenceTerm= ruleReferenceTerm EOF ;
    public final EObject entryRuleReferenceTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceTerm = null;


        try {
            // InternalGumboParser.g:5144:54: (iv_ruleReferenceTerm= ruleReferenceTerm EOF )
            // InternalGumboParser.g:5145:2: iv_ruleReferenceTerm= ruleReferenceTerm EOF
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
    // InternalGumboParser.g:5151:1: ruleReferenceTerm returns [EObject current=null] : (otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleReferenceTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_path_2_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:5157:2: ( (otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis ) )
            // InternalGumboParser.g:5158:2: (otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis )
            {
            // InternalGumboParser.g:5158:2: (otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis )
            // InternalGumboParser.g:5159:3: otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis
            {
            otherlv_0=(Token)match(input,Reference,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReferenceTermAccess().getReferenceKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReferenceTermAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGumboParser.g:5167:3: ( (lv_path_2_0= ruleContainmentPathElement ) )
            // InternalGumboParser.g:5168:4: (lv_path_2_0= ruleContainmentPathElement )
            {
            // InternalGumboParser.g:5168:4: (lv_path_2_0= ruleContainmentPathElement )
            // InternalGumboParser.g:5169:5: lv_path_2_0= ruleContainmentPathElement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReferenceTermAccess().getPathContainmentPathElementParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_36);
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
    // InternalGumboParser.g:5194:1: entryRuleRecordTerm returns [EObject current=null] : iv_ruleRecordTerm= ruleRecordTerm EOF ;
    public final EObject entryRuleRecordTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordTerm = null;


        try {
            // InternalGumboParser.g:5194:51: (iv_ruleRecordTerm= ruleRecordTerm EOF )
            // InternalGumboParser.g:5195:2: iv_ruleRecordTerm= ruleRecordTerm EOF
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
    // InternalGumboParser.g:5201:1: ruleRecordTerm returns [EObject current=null] : (otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket ) ;
    public final EObject ruleRecordTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ownedFieldValue_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:5207:2: ( (otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket ) )
            // InternalGumboParser.g:5208:2: (otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket )
            {
            // InternalGumboParser.g:5208:2: (otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket )
            // InternalGumboParser.g:5209:3: otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket
            {
            otherlv_0=(Token)match(input,LeftSquareBracket,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRecordTermAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalGumboParser.g:5213:3: ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+
            int cnt98=0;
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==RULE_ID) ) {
                    alt98=1;
                }


                switch (alt98) {
            	case 1 :
            	    // InternalGumboParser.g:5214:4: (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation )
            	    {
            	    // InternalGumboParser.g:5214:4: (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation )
            	    // InternalGumboParser.g:5215:5: lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRecordTermAccess().getOwnedFieldValueFieldPropertyAssociationParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_78);
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
            	    if ( cnt98 >= 1 ) break loop98;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(98, input);
                        throw eee;
                }
                cnt98++;
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
    // InternalGumboParser.g:5240:1: entryRuleComputedTerm returns [EObject current=null] : iv_ruleComputedTerm= ruleComputedTerm EOF ;
    public final EObject entryRuleComputedTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComputedTerm = null;


        try {
            // InternalGumboParser.g:5240:53: (iv_ruleComputedTerm= ruleComputedTerm EOF )
            // InternalGumboParser.g:5241:2: iv_ruleComputedTerm= ruleComputedTerm EOF
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
    // InternalGumboParser.g:5247:1: ruleComputedTerm returns [EObject current=null] : (otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleComputedTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_function_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalGumboParser.g:5253:2: ( (otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis ) )
            // InternalGumboParser.g:5254:2: (otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis )
            {
            // InternalGumboParser.g:5254:2: (otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis )
            // InternalGumboParser.g:5255:3: otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis
            {
            otherlv_0=(Token)match(input,Compute,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getComputedTermAccess().getComputeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getComputedTermAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGumboParser.g:5263:3: ( (lv_function_2_0= RULE_ID ) )
            // InternalGumboParser.g:5264:4: (lv_function_2_0= RULE_ID )
            {
            // InternalGumboParser.g:5264:4: (lv_function_2_0= RULE_ID )
            // InternalGumboParser.g:5265:5: lv_function_2_0= RULE_ID
            {
            lv_function_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_36); if (state.failed) return current;
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
    // InternalGumboParser.g:5289:1: entryRuleComponentClassifierTerm returns [EObject current=null] : iv_ruleComponentClassifierTerm= ruleComponentClassifierTerm EOF ;
    public final EObject entryRuleComponentClassifierTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentClassifierTerm = null;


        try {
            // InternalGumboParser.g:5289:64: (iv_ruleComponentClassifierTerm= ruleComponentClassifierTerm EOF )
            // InternalGumboParser.g:5290:2: iv_ruleComponentClassifierTerm= ruleComponentClassifierTerm EOF
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
    // InternalGumboParser.g:5296:1: ruleComponentClassifierTerm returns [EObject current=null] : (otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleComponentClassifierTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalGumboParser.g:5302:2: ( (otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis ) )
            // InternalGumboParser.g:5303:2: (otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis )
            {
            // InternalGumboParser.g:5303:2: (otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis )
            // InternalGumboParser.g:5304:3: otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis
            {
            otherlv_0=(Token)match(input,Classifier,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getComponentClassifierTermAccess().getClassifierKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getComponentClassifierTermAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGumboParser.g:5312:3: ( ( ruleQCREF ) )
            // InternalGumboParser.g:5313:4: ( ruleQCREF )
            {
            // InternalGumboParser.g:5313:4: ( ruleQCREF )
            // InternalGumboParser.g:5314:5: ruleQCREF
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getComponentClassifierTermRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComponentClassifierTermAccess().getClassifierComponentClassifierCrossReference_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_36);
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
    // InternalGumboParser.g:5336:1: entryRuleListTerm returns [EObject current=null] : iv_ruleListTerm= ruleListTerm EOF ;
    public final EObject entryRuleListTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListTerm = null;


        try {
            // InternalGumboParser.g:5336:49: (iv_ruleListTerm= ruleListTerm EOF )
            // InternalGumboParser.g:5337:2: iv_ruleListTerm= ruleListTerm EOF
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
    // InternalGumboParser.g:5343:1: ruleListTerm returns [EObject current=null] : ( () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis ) ;
    public final EObject ruleListTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedListElement_2_0 = null;

        EObject lv_ownedListElement_4_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:5349:2: ( ( () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis ) )
            // InternalGumboParser.g:5350:2: ( () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis )
            {
            // InternalGumboParser.g:5350:2: ( () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis )
            // InternalGumboParser.g:5351:3: () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis
            {
            // InternalGumboParser.g:5351:3: ()
            // InternalGumboParser.g:5352:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getListTermAccess().getListValueAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_79); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getListTermAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGumboParser.g:5362:3: ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==Classifier||LA100_0==Reference||LA100_0==Compute||LA100_0==False||LA100_0==True||LA100_0==LeftParenthesis||LA100_0==PlusSign||LA100_0==HyphenMinus||LA100_0==LeftSquareBracket||LA100_0==RULE_REAL_LIT||LA100_0==RULE_INTEGER_LIT||(LA100_0>=RULE_STRING && LA100_0<=RULE_ID)) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalGumboParser.g:5363:4: ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )*
                    {
                    // InternalGumboParser.g:5363:4: ( (lv_ownedListElement_2_0= rulePropertyExpression ) )
                    // InternalGumboParser.g:5364:5: (lv_ownedListElement_2_0= rulePropertyExpression )
                    {
                    // InternalGumboParser.g:5364:5: (lv_ownedListElement_2_0= rulePropertyExpression )
                    // InternalGumboParser.g:5365:6: lv_ownedListElement_2_0= rulePropertyExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getListTermAccess().getOwnedListElementPropertyExpressionParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_47);
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

                    // InternalGumboParser.g:5382:4: (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )*
                    loop99:
                    do {
                        int alt99=2;
                        int LA99_0 = input.LA(1);

                        if ( (LA99_0==Comma) ) {
                            alt99=1;
                        }


                        switch (alt99) {
                    	case 1 :
                    	    // InternalGumboParser.g:5383:5: otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FollowSets000.FOLLOW_74); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getListTermAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:5387:5: ( (lv_ownedListElement_4_0= rulePropertyExpression ) )
                    	    // InternalGumboParser.g:5388:6: (lv_ownedListElement_4_0= rulePropertyExpression )
                    	    {
                    	    // InternalGumboParser.g:5388:6: (lv_ownedListElement_4_0= rulePropertyExpression )
                    	    // InternalGumboParser.g:5389:7: lv_ownedListElement_4_0= rulePropertyExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getListTermAccess().getOwnedListElementPropertyExpressionParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_47);
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
                    	    break loop99;
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
    // InternalGumboParser.g:5416:1: entryRuleFieldPropertyAssociation returns [EObject current=null] : iv_ruleFieldPropertyAssociation= ruleFieldPropertyAssociation EOF ;
    public final EObject entryRuleFieldPropertyAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldPropertyAssociation = null;


        try {
            // InternalGumboParser.g:5416:65: (iv_ruleFieldPropertyAssociation= ruleFieldPropertyAssociation EOF )
            // InternalGumboParser.g:5417:2: iv_ruleFieldPropertyAssociation= ruleFieldPropertyAssociation EOF
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
    // InternalGumboParser.g:5423:1: ruleFieldPropertyAssociation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon ) ;
    public final EObject ruleFieldPropertyAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedValue_2_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:5429:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon ) )
            // InternalGumboParser.g:5430:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon )
            {
            // InternalGumboParser.g:5430:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon )
            // InternalGumboParser.g:5431:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon
            {
            // InternalGumboParser.g:5431:3: ( (otherlv_0= RULE_ID ) )
            // InternalGumboParser.g:5432:4: (otherlv_0= RULE_ID )
            {
            // InternalGumboParser.g:5432:4: (otherlv_0= RULE_ID )
            // InternalGumboParser.g:5433:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFieldPropertyAssociationRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getFieldPropertyAssociationAccess().getPropertyBasicPropertyCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_74); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFieldPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_1());
              		
            }
            // InternalGumboParser.g:5448:3: ( (lv_ownedValue_2_0= rulePropertyExpression ) )
            // InternalGumboParser.g:5449:4: (lv_ownedValue_2_0= rulePropertyExpression )
            {
            // InternalGumboParser.g:5449:4: (lv_ownedValue_2_0= rulePropertyExpression )
            // InternalGumboParser.g:5450:5: lv_ownedValue_2_0= rulePropertyExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFieldPropertyAssociationAccess().getOwnedValuePropertyExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_13);
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
    // InternalGumboParser.g:5475:1: entryRuleContainmentPathElement returns [EObject current=null] : iv_ruleContainmentPathElement= ruleContainmentPathElement EOF ;
    public final EObject entryRuleContainmentPathElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainmentPathElement = null;


        try {
            // InternalGumboParser.g:5475:63: (iv_ruleContainmentPathElement= ruleContainmentPathElement EOF )
            // InternalGumboParser.g:5476:2: iv_ruleContainmentPathElement= ruleContainmentPathElement EOF
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
    // InternalGumboParser.g:5482:1: ruleContainmentPathElement returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )? ) ;
    public final EObject ruleContainmentPathElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_arrayRange_1_0 = null;

        EObject lv_path_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:5488:2: ( ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )? ) )
            // InternalGumboParser.g:5489:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )? )
            {
            // InternalGumboParser.g:5489:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )? )
            // InternalGumboParser.g:5490:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )?
            {
            // InternalGumboParser.g:5490:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* )
            // InternalGumboParser.g:5491:4: ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )*
            {
            // InternalGumboParser.g:5491:4: ( (otherlv_0= RULE_ID ) )
            // InternalGumboParser.g:5492:5: (otherlv_0= RULE_ID )
            {
            // InternalGumboParser.g:5492:5: (otherlv_0= RULE_ID )
            // InternalGumboParser.g:5493:6: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElement(grammarAccess.getContainmentPathElementRule());
              						}
              					
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_80); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						newLeafNode(otherlv_0, grammarAccess.getContainmentPathElementAccess().getNamedElementNamedElementCrossReference_0_0_0());
              					
            }

            }


            }

            // InternalGumboParser.g:5504:4: ( (lv_arrayRange_1_0= ruleArrayRange ) )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==LeftSquareBracket) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // InternalGumboParser.g:5505:5: (lv_arrayRange_1_0= ruleArrayRange )
            	    {
            	    // InternalGumboParser.g:5505:5: (lv_arrayRange_1_0= ruleArrayRange )
            	    // InternalGumboParser.g:5506:6: lv_arrayRange_1_0= ruleArrayRange
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getContainmentPathElementAccess().getArrayRangeArrayRangeParserRuleCall_0_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_80);
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
            	    break loop101;
                }
            } while (true);


            }

            // InternalGumboParser.g:5524:3: (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==FullStop) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalGumboParser.g:5525:4: otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) )
                    {
                    otherlv_2=(Token)match(input,FullStop,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getContainmentPathElementAccess().getFullStopKeyword_1_0());
                      			
                    }
                    // InternalGumboParser.g:5529:4: ( (lv_path_3_0= ruleContainmentPathElement ) )
                    // InternalGumboParser.g:5530:5: (lv_path_3_0= ruleContainmentPathElement )
                    {
                    // InternalGumboParser.g:5530:5: (lv_path_3_0= ruleContainmentPathElement )
                    // InternalGumboParser.g:5531:6: lv_path_3_0= ruleContainmentPathElement
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
    // InternalGumboParser.g:5553:1: entryRulePlusMinus returns [String current=null] : iv_rulePlusMinus= rulePlusMinus EOF ;
    public final String entryRulePlusMinus() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePlusMinus = null;


        try {
            // InternalGumboParser.g:5553:49: (iv_rulePlusMinus= rulePlusMinus EOF )
            // InternalGumboParser.g:5554:2: iv_rulePlusMinus= rulePlusMinus EOF
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
    // InternalGumboParser.g:5560:1: rulePlusMinus returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= PlusSign | kw= HyphenMinus ) ;
    public final AntlrDatatypeRuleToken rulePlusMinus() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumboParser.g:5566:2: ( (kw= PlusSign | kw= HyphenMinus ) )
            // InternalGumboParser.g:5567:2: (kw= PlusSign | kw= HyphenMinus )
            {
            // InternalGumboParser.g:5567:2: (kw= PlusSign | kw= HyphenMinus )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==PlusSign) ) {
                alt103=1;
            }
            else if ( (LA103_0==HyphenMinus) ) {
                alt103=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }
            switch (alt103) {
                case 1 :
                    // InternalGumboParser.g:5568:3: kw= PlusSign
                    {
                    kw=(Token)match(input,PlusSign,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPlusMinusAccess().getPlusSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:5574:3: kw= HyphenMinus
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
    // InternalGumboParser.g:5583:1: entryRuleStringTerm returns [EObject current=null] : iv_ruleStringTerm= ruleStringTerm EOF ;
    public final EObject entryRuleStringTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringTerm = null;


        try {
            // InternalGumboParser.g:5583:51: (iv_ruleStringTerm= ruleStringTerm EOF )
            // InternalGumboParser.g:5584:2: iv_ruleStringTerm= ruleStringTerm EOF
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
    // InternalGumboParser.g:5590:1: ruleStringTerm returns [EObject current=null] : ( (lv_value_0_0= ruleNoQuoteString ) ) ;
    public final EObject ruleStringTerm() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:5596:2: ( ( (lv_value_0_0= ruleNoQuoteString ) ) )
            // InternalGumboParser.g:5597:2: ( (lv_value_0_0= ruleNoQuoteString ) )
            {
            // InternalGumboParser.g:5597:2: ( (lv_value_0_0= ruleNoQuoteString ) )
            // InternalGumboParser.g:5598:3: (lv_value_0_0= ruleNoQuoteString )
            {
            // InternalGumboParser.g:5598:3: (lv_value_0_0= ruleNoQuoteString )
            // InternalGumboParser.g:5599:4: lv_value_0_0= ruleNoQuoteString
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
    // InternalGumboParser.g:5619:1: entryRuleNoQuoteString returns [String current=null] : iv_ruleNoQuoteString= ruleNoQuoteString EOF ;
    public final String entryRuleNoQuoteString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNoQuoteString = null;


        try {
            // InternalGumboParser.g:5619:53: (iv_ruleNoQuoteString= ruleNoQuoteString EOF )
            // InternalGumboParser.g:5620:2: iv_ruleNoQuoteString= ruleNoQuoteString EOF
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
    // InternalGumboParser.g:5626:1: ruleNoQuoteString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleNoQuoteString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalGumboParser.g:5632:2: (this_STRING_0= RULE_STRING )
            // InternalGumboParser.g:5633:2: this_STRING_0= RULE_STRING
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
    // InternalGumboParser.g:5643:1: entryRuleArrayRange returns [EObject current=null] : iv_ruleArrayRange= ruleArrayRange EOF ;
    public final EObject entryRuleArrayRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayRange = null;


        try {
            // InternalGumboParser.g:5643:51: (iv_ruleArrayRange= ruleArrayRange EOF )
            // InternalGumboParser.g:5644:2: iv_ruleArrayRange= ruleArrayRange EOF
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
    // InternalGumboParser.g:5650:1: ruleArrayRange returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleArrayRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_lowerBound_2_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_4_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:5656:2: ( ( () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket ) )
            // InternalGumboParser.g:5657:2: ( () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket )
            {
            // InternalGumboParser.g:5657:2: ( () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket )
            // InternalGumboParser.g:5658:3: () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket
            {
            // InternalGumboParser.g:5658:3: ()
            // InternalGumboParser.g:5659:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getArrayRangeAccess().getArrayRangeAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FollowSets000.FOLLOW_81); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getArrayRangeAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalGumboParser.g:5669:3: ( (lv_lowerBound_2_0= ruleINTVALUE ) )
            // InternalGumboParser.g:5670:4: (lv_lowerBound_2_0= ruleINTVALUE )
            {
            // InternalGumboParser.g:5670:4: (lv_lowerBound_2_0= ruleINTVALUE )
            // InternalGumboParser.g:5671:5: lv_lowerBound_2_0= ruleINTVALUE
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArrayRangeAccess().getLowerBoundINTVALUEParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_82);
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

            // InternalGumboParser.g:5688:3: (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==FullStopFullStop) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalGumboParser.g:5689:4: otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) )
                    {
                    otherlv_3=(Token)match(input,FullStopFullStop,FollowSets000.FOLLOW_81); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getArrayRangeAccess().getFullStopFullStopKeyword_3_0());
                      			
                    }
                    // InternalGumboParser.g:5693:4: ( (lv_upperBound_4_0= ruleINTVALUE ) )
                    // InternalGumboParser.g:5694:5: (lv_upperBound_4_0= ruleINTVALUE )
                    {
                    // InternalGumboParser.g:5694:5: (lv_upperBound_4_0= ruleINTVALUE )
                    // InternalGumboParser.g:5695:6: lv_upperBound_4_0= ruleINTVALUE
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getArrayRangeAccess().getUpperBoundINTVALUEParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_83);
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
    // InternalGumboParser.g:5721:1: entryRuleSignedConstant returns [EObject current=null] : iv_ruleSignedConstant= ruleSignedConstant EOF ;
    public final EObject entryRuleSignedConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignedConstant = null;


        try {
            // InternalGumboParser.g:5721:55: (iv_ruleSignedConstant= ruleSignedConstant EOF )
            // InternalGumboParser.g:5722:2: iv_ruleSignedConstant= ruleSignedConstant EOF
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
    // InternalGumboParser.g:5728:1: ruleSignedConstant returns [EObject current=null] : ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) ) ;
    public final EObject ruleSignedConstant() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_ownedPropertyExpression_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:5734:2: ( ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) ) )
            // InternalGumboParser.g:5735:2: ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) )
            {
            // InternalGumboParser.g:5735:2: ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) )
            // InternalGumboParser.g:5736:3: ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) )
            {
            // InternalGumboParser.g:5736:3: ( (lv_op_0_0= rulePlusMinus ) )
            // InternalGumboParser.g:5737:4: (lv_op_0_0= rulePlusMinus )
            {
            // InternalGumboParser.g:5737:4: (lv_op_0_0= rulePlusMinus )
            // InternalGumboParser.g:5738:5: lv_op_0_0= rulePlusMinus
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSignedConstantAccess().getOpPlusMinusParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_84);
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

            // InternalGumboParser.g:5755:3: ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) )
            // InternalGumboParser.g:5756:4: (lv_ownedPropertyExpression_1_0= ruleConstantValue )
            {
            // InternalGumboParser.g:5756:4: (lv_ownedPropertyExpression_1_0= ruleConstantValue )
            // InternalGumboParser.g:5757:5: lv_ownedPropertyExpression_1_0= ruleConstantValue
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
    // InternalGumboParser.g:5778:1: entryRuleIntegerTerm returns [EObject current=null] : iv_ruleIntegerTerm= ruleIntegerTerm EOF ;
    public final EObject entryRuleIntegerTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerTerm = null;


        try {
            // InternalGumboParser.g:5778:52: (iv_ruleIntegerTerm= ruleIntegerTerm EOF )
            // InternalGumboParser.g:5779:2: iv_ruleIntegerTerm= ruleIntegerTerm EOF
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
    // InternalGumboParser.g:5785:1: ruleIntegerTerm returns [EObject current=null] : ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? ) ;
    public final EObject ruleIntegerTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:5791:2: ( ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? ) )
            // InternalGumboParser.g:5792:2: ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? )
            {
            // InternalGumboParser.g:5792:2: ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? )
            // InternalGumboParser.g:5793:3: ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )?
            {
            // InternalGumboParser.g:5793:3: ( (lv_value_0_0= ruleSignedInt ) )
            // InternalGumboParser.g:5794:4: (lv_value_0_0= ruleSignedInt )
            {
            // InternalGumboParser.g:5794:4: (lv_value_0_0= ruleSignedInt )
            // InternalGumboParser.g:5795:5: lv_value_0_0= ruleSignedInt
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIntegerTermAccess().getValueSignedIntParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_11);
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

            // InternalGumboParser.g:5812:3: ( (otherlv_1= RULE_ID ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==RULE_ID) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalGumboParser.g:5813:4: (otherlv_1= RULE_ID )
                    {
                    // InternalGumboParser.g:5813:4: (otherlv_1= RULE_ID )
                    // InternalGumboParser.g:5814:5: otherlv_1= RULE_ID
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
    // InternalGumboParser.g:5829:1: entryRuleSignedInt returns [String current=null] : iv_ruleSignedInt= ruleSignedInt EOF ;
    public final String entryRuleSignedInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedInt = null;


        try {
            // InternalGumboParser.g:5829:49: (iv_ruleSignedInt= ruleSignedInt EOF )
            // InternalGumboParser.g:5830:2: iv_ruleSignedInt= ruleSignedInt EOF
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
    // InternalGumboParser.g:5836:1: ruleSignedInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT ) ;
    public final AntlrDatatypeRuleToken ruleSignedInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INTEGER_LIT_2=null;


        	enterRule();

        try {
            // InternalGumboParser.g:5842:2: ( ( (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT ) )
            // InternalGumboParser.g:5843:2: ( (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT )
            {
            // InternalGumboParser.g:5843:2: ( (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT )
            // InternalGumboParser.g:5844:3: (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT
            {
            // InternalGumboParser.g:5844:3: (kw= PlusSign | kw= HyphenMinus )?
            int alt106=3;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==PlusSign) ) {
                alt106=1;
            }
            else if ( (LA106_0==HyphenMinus) ) {
                alt106=2;
            }
            switch (alt106) {
                case 1 :
                    // InternalGumboParser.g:5845:4: kw= PlusSign
                    {
                    kw=(Token)match(input,PlusSign,FollowSets000.FOLLOW_81); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSignedIntAccess().getPlusSignKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:5851:4: kw= HyphenMinus
                    {
                    kw=(Token)match(input,HyphenMinus,FollowSets000.FOLLOW_81); if (state.failed) return current;
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
    // InternalGumboParser.g:5868:1: entryRuleRealTerm returns [EObject current=null] : iv_ruleRealTerm= ruleRealTerm EOF ;
    public final EObject entryRuleRealTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealTerm = null;


        try {
            // InternalGumboParser.g:5868:49: (iv_ruleRealTerm= ruleRealTerm EOF )
            // InternalGumboParser.g:5869:2: iv_ruleRealTerm= ruleRealTerm EOF
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
    // InternalGumboParser.g:5875:1: ruleRealTerm returns [EObject current=null] : ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? ) ;
    public final EObject ruleRealTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:5881:2: ( ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? ) )
            // InternalGumboParser.g:5882:2: ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? )
            {
            // InternalGumboParser.g:5882:2: ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? )
            // InternalGumboParser.g:5883:3: ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )?
            {
            // InternalGumboParser.g:5883:3: ( (lv_value_0_0= ruleSignedReal ) )
            // InternalGumboParser.g:5884:4: (lv_value_0_0= ruleSignedReal )
            {
            // InternalGumboParser.g:5884:4: (lv_value_0_0= ruleSignedReal )
            // InternalGumboParser.g:5885:5: lv_value_0_0= ruleSignedReal
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRealTermAccess().getValueSignedRealParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_11);
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

            // InternalGumboParser.g:5902:3: ( (otherlv_1= RULE_ID ) )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==RULE_ID) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // InternalGumboParser.g:5903:4: (otherlv_1= RULE_ID )
                    {
                    // InternalGumboParser.g:5903:4: (otherlv_1= RULE_ID )
                    // InternalGumboParser.g:5904:5: otherlv_1= RULE_ID
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
    // InternalGumboParser.g:5919:1: entryRuleSignedReal returns [String current=null] : iv_ruleSignedReal= ruleSignedReal EOF ;
    public final String entryRuleSignedReal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedReal = null;


        try {
            // InternalGumboParser.g:5919:50: (iv_ruleSignedReal= ruleSignedReal EOF )
            // InternalGumboParser.g:5920:2: iv_ruleSignedReal= ruleSignedReal EOF
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
    // InternalGumboParser.g:5926:1: ruleSignedReal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT ) ;
    public final AntlrDatatypeRuleToken ruleSignedReal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_REAL_LIT_2=null;


        	enterRule();

        try {
            // InternalGumboParser.g:5932:2: ( ( (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT ) )
            // InternalGumboParser.g:5933:2: ( (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT )
            {
            // InternalGumboParser.g:5933:2: ( (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT )
            // InternalGumboParser.g:5934:3: (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT
            {
            // InternalGumboParser.g:5934:3: (kw= PlusSign | kw= HyphenMinus )?
            int alt108=3;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==PlusSign) ) {
                alt108=1;
            }
            else if ( (LA108_0==HyphenMinus) ) {
                alt108=2;
            }
            switch (alt108) {
                case 1 :
                    // InternalGumboParser.g:5935:4: kw= PlusSign
                    {
                    kw=(Token)match(input,PlusSign,FollowSets000.FOLLOW_85); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSignedRealAccess().getPlusSignKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:5941:4: kw= HyphenMinus
                    {
                    kw=(Token)match(input,HyphenMinus,FollowSets000.FOLLOW_85); if (state.failed) return current;
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
    // InternalGumboParser.g:5958:1: entryRuleNumericRangeTerm returns [EObject current=null] : iv_ruleNumericRangeTerm= ruleNumericRangeTerm EOF ;
    public final EObject entryRuleNumericRangeTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericRangeTerm = null;


        try {
            // InternalGumboParser.g:5958:57: (iv_ruleNumericRangeTerm= ruleNumericRangeTerm EOF )
            // InternalGumboParser.g:5959:2: iv_ruleNumericRangeTerm= ruleNumericRangeTerm EOF
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
    // InternalGumboParser.g:5965:1: ruleNumericRangeTerm returns [EObject current=null] : ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )? ) ;
    public final EObject ruleNumericRangeTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_minimum_0_0 = null;

        EObject lv_maximum_2_0 = null;

        EObject lv_delta_4_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:5971:2: ( ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )? ) )
            // InternalGumboParser.g:5972:2: ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )? )
            {
            // InternalGumboParser.g:5972:2: ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )? )
            // InternalGumboParser.g:5973:3: ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )?
            {
            // InternalGumboParser.g:5973:3: ( (lv_minimum_0_0= ruleNumAlt ) )
            // InternalGumboParser.g:5974:4: (lv_minimum_0_0= ruleNumAlt )
            {
            // InternalGumboParser.g:5974:4: (lv_minimum_0_0= ruleNumAlt )
            // InternalGumboParser.g:5975:5: lv_minimum_0_0= ruleNumAlt
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNumericRangeTermAccess().getMinimumNumAltParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_86);
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

            otherlv_1=(Token)match(input,FullStopFullStop,FollowSets000.FOLLOW_84); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNumericRangeTermAccess().getFullStopFullStopKeyword_1());
              		
            }
            // InternalGumboParser.g:5996:3: ( (lv_maximum_2_0= ruleNumAlt ) )
            // InternalGumboParser.g:5997:4: (lv_maximum_2_0= ruleNumAlt )
            {
            // InternalGumboParser.g:5997:4: (lv_maximum_2_0= ruleNumAlt )
            // InternalGumboParser.g:5998:5: lv_maximum_2_0= ruleNumAlt
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNumericRangeTermAccess().getMaximumNumAltParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_87);
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

            // InternalGumboParser.g:6015:3: (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==Delta) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // InternalGumboParser.g:6016:4: otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) )
                    {
                    otherlv_3=(Token)match(input,Delta,FollowSets000.FOLLOW_84); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getNumericRangeTermAccess().getDeltaKeyword_3_0());
                      			
                    }
                    // InternalGumboParser.g:6020:4: ( (lv_delta_4_0= ruleNumAlt ) )
                    // InternalGumboParser.g:6021:5: (lv_delta_4_0= ruleNumAlt )
                    {
                    // InternalGumboParser.g:6021:5: (lv_delta_4_0= ruleNumAlt )
                    // InternalGumboParser.g:6022:6: lv_delta_4_0= ruleNumAlt
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
    // InternalGumboParser.g:6044:1: entryRuleNumAlt returns [EObject current=null] : iv_ruleNumAlt= ruleNumAlt EOF ;
    public final EObject entryRuleNumAlt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumAlt = null;


        try {
            // InternalGumboParser.g:6044:47: (iv_ruleNumAlt= ruleNumAlt EOF )
            // InternalGumboParser.g:6045:2: iv_ruleNumAlt= ruleNumAlt EOF
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
    // InternalGumboParser.g:6051:1: ruleNumAlt returns [EObject current=null] : (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue ) ;
    public final EObject ruleNumAlt() throws RecognitionException {
        EObject current = null;

        EObject this_RealTerm_0 = null;

        EObject this_IntegerTerm_1 = null;

        EObject this_SignedConstant_2 = null;

        EObject this_ConstantValue_3 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:6057:2: ( (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue ) )
            // InternalGumboParser.g:6058:2: (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue )
            {
            // InternalGumboParser.g:6058:2: (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue )
            int alt110=4;
            switch ( input.LA(1) ) {
            case PlusSign:
                {
                switch ( input.LA(2) ) {
                case RULE_ID:
                    {
                    alt110=3;
                    }
                    break;
                case RULE_REAL_LIT:
                    {
                    alt110=1;
                    }
                    break;
                case RULE_INTEGER_LIT:
                    {
                    alt110=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 110, 1, input);

                    throw nvae;
                }

                }
                break;
            case HyphenMinus:
                {
                switch ( input.LA(2) ) {
                case RULE_REAL_LIT:
                    {
                    alt110=1;
                    }
                    break;
                case RULE_INTEGER_LIT:
                    {
                    alt110=2;
                    }
                    break;
                case RULE_ID:
                    {
                    alt110=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 110, 2, input);

                    throw nvae;
                }

                }
                break;
            case RULE_REAL_LIT:
                {
                alt110=1;
                }
                break;
            case RULE_INTEGER_LIT:
                {
                alt110=2;
                }
                break;
            case RULE_ID:
                {
                alt110=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;
            }

            switch (alt110) {
                case 1 :
                    // InternalGumboParser.g:6059:3: this_RealTerm_0= ruleRealTerm
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
                    // InternalGumboParser.g:6068:3: this_IntegerTerm_1= ruleIntegerTerm
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
                    // InternalGumboParser.g:6077:3: this_SignedConstant_2= ruleSignedConstant
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
                    // InternalGumboParser.g:6086:3: this_ConstantValue_3= ruleConstantValue
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
    // InternalGumboParser.g:6098:1: entryRuleAppliesToKeywords returns [String current=null] : iv_ruleAppliesToKeywords= ruleAppliesToKeywords EOF ;
    public final String entryRuleAppliesToKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAppliesToKeywords = null;


        try {
            // InternalGumboParser.g:6098:57: (iv_ruleAppliesToKeywords= ruleAppliesToKeywords EOF )
            // InternalGumboParser.g:6099:2: iv_ruleAppliesToKeywords= ruleAppliesToKeywords EOF
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
    // InternalGumboParser.g:6105:1: ruleAppliesToKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Applies kw= To ) ;
    public final AntlrDatatypeRuleToken ruleAppliesToKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumboParser.g:6111:2: ( (kw= Applies kw= To ) )
            // InternalGumboParser.g:6112:2: (kw= Applies kw= To )
            {
            // InternalGumboParser.g:6112:2: (kw= Applies kw= To )
            // InternalGumboParser.g:6113:3: kw= Applies kw= To
            {
            kw=(Token)match(input,Applies,FollowSets000.FOLLOW_88); if (state.failed) return current;
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
    // InternalGumboParser.g:6127:1: entryRuleInBindingKeywords returns [String current=null] : iv_ruleInBindingKeywords= ruleInBindingKeywords EOF ;
    public final String entryRuleInBindingKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInBindingKeywords = null;


        try {
            // InternalGumboParser.g:6127:57: (iv_ruleInBindingKeywords= ruleInBindingKeywords EOF )
            // InternalGumboParser.g:6128:2: iv_ruleInBindingKeywords= ruleInBindingKeywords EOF
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
    // InternalGumboParser.g:6134:1: ruleInBindingKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= In kw= Binding ) ;
    public final AntlrDatatypeRuleToken ruleInBindingKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumboParser.g:6140:2: ( (kw= In kw= Binding ) )
            // InternalGumboParser.g:6141:2: (kw= In kw= Binding )
            {
            // InternalGumboParser.g:6141:2: (kw= In kw= Binding )
            // InternalGumboParser.g:6142:3: kw= In kw= Binding
            {
            kw=(Token)match(input,In,FollowSets000.FOLLOW_89); if (state.failed) return current;
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
    // InternalGumboParser.g:6156:1: entryRuleInModesKeywords returns [String current=null] : iv_ruleInModesKeywords= ruleInModesKeywords EOF ;
    public final String entryRuleInModesKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInModesKeywords = null;


        try {
            // InternalGumboParser.g:6156:55: (iv_ruleInModesKeywords= ruleInModesKeywords EOF )
            // InternalGumboParser.g:6157:2: iv_ruleInModesKeywords= ruleInModesKeywords EOF
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
    // InternalGumboParser.g:6163:1: ruleInModesKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= In kw= Modes ) ;
    public final AntlrDatatypeRuleToken ruleInModesKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumboParser.g:6169:2: ( (kw= In kw= Modes ) )
            // InternalGumboParser.g:6170:2: (kw= In kw= Modes )
            {
            // InternalGumboParser.g:6170:2: (kw= In kw= Modes )
            // InternalGumboParser.g:6171:3: kw= In kw= Modes
            {
            kw=(Token)match(input,In,FollowSets000.FOLLOW_90); if (state.failed) return current;
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
    // InternalGumboParser.g:6185:1: entryRuleINTVALUE returns [String current=null] : iv_ruleINTVALUE= ruleINTVALUE EOF ;
    public final String entryRuleINTVALUE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTVALUE = null;


        try {
            // InternalGumboParser.g:6185:48: (iv_ruleINTVALUE= ruleINTVALUE EOF )
            // InternalGumboParser.g:6186:2: iv_ruleINTVALUE= ruleINTVALUE EOF
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
    // InternalGumboParser.g:6192:1: ruleINTVALUE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INTEGER_LIT_0= RULE_INTEGER_LIT ;
    public final AntlrDatatypeRuleToken ruleINTVALUE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INTEGER_LIT_0=null;


        	enterRule();

        try {
            // InternalGumboParser.g:6198:2: (this_INTEGER_LIT_0= RULE_INTEGER_LIT )
            // InternalGumboParser.g:6199:2: this_INTEGER_LIT_0= RULE_INTEGER_LIT
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
    // InternalGumboParser.g:6209:1: entryRuleQPREF returns [String current=null] : iv_ruleQPREF= ruleQPREF EOF ;
    public final String entryRuleQPREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQPREF = null;


        try {
            // InternalGumboParser.g:6209:45: (iv_ruleQPREF= ruleQPREF EOF )
            // InternalGumboParser.g:6210:2: iv_ruleQPREF= ruleQPREF EOF
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
    // InternalGumboParser.g:6216:1: ruleQPREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleQPREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalGumboParser.g:6222:2: ( (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )? ) )
            // InternalGumboParser.g:6223:2: (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )? )
            {
            // InternalGumboParser.g:6223:2: (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )? )
            // InternalGumboParser.g:6224:3: this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_91); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQPREFAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalGumboParser.g:6231:3: (kw= ColonColon this_ID_2= RULE_ID )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==ColonColon) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // InternalGumboParser.g:6232:4: kw= ColonColon this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,ColonColon,FollowSets000.FOLLOW_10); if (state.failed) return current;
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
    // InternalGumboParser.g:6249:1: entryRuleQCREF returns [String current=null] : iv_ruleQCREF= ruleQCREF EOF ;
    public final String entryRuleQCREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQCREF = null;


        try {
            // InternalGumboParser.g:6249:45: (iv_ruleQCREF= ruleQCREF EOF )
            // InternalGumboParser.g:6250:2: iv_ruleQCREF= ruleQCREF EOF
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
    // InternalGumboParser.g:6256:1: ruleQCREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleQCREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;


        	enterRule();

        try {
            // InternalGumboParser.g:6262:2: ( ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? ) )
            // InternalGumboParser.g:6263:2: ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? )
            {
            // InternalGumboParser.g:6263:2: ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? )
            // InternalGumboParser.g:6264:3: (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )?
            {
            // InternalGumboParser.g:6264:3: (this_ID_0= RULE_ID kw= ColonColon )*
            loop112:
            do {
                int alt112=2;
                int LA112_0 = input.LA(1);

                if ( (LA112_0==RULE_ID) ) {
                    int LA112_1 = input.LA(2);

                    if ( (LA112_1==ColonColon) ) {
                        alt112=1;
                    }


                }


                switch (alt112) {
            	case 1 :
            	    // InternalGumboParser.g:6265:4: this_ID_0= RULE_ID kw= ColonColon
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_92); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_0);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_0, grammarAccess.getQCREFAccess().getIDTerminalRuleCall_0_0());
            	      			
            	    }
            	    kw=(Token)match(input,ColonColon,FollowSets000.FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQCREFAccess().getColonColonKeyword_0_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop112;
                }
            } while (true);

            this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_2, grammarAccess.getQCREFAccess().getIDTerminalRuleCall_1());
              		
            }
            // InternalGumboParser.g:6285:3: (kw= FullStop this_ID_4= RULE_ID )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==FullStop) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // InternalGumboParser.g:6286:4: kw= FullStop this_ID_4= RULE_ID
                    {
                    kw=(Token)match(input,FullStop,FollowSets000.FOLLOW_10); if (state.failed) return current;
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
    // InternalGumboParser.g:6303:1: entryRuleSTAR returns [String current=null] : iv_ruleSTAR= ruleSTAR EOF ;
    public final String entryRuleSTAR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSTAR = null;


        try {
            // InternalGumboParser.g:6303:44: (iv_ruleSTAR= ruleSTAR EOF )
            // InternalGumboParser.g:6304:2: iv_ruleSTAR= ruleSTAR EOF
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
    // InternalGumboParser.g:6310:1: ruleSTAR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= Asterisk ;
    public final AntlrDatatypeRuleToken ruleSTAR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumboParser.g:6316:2: (kw= Asterisk )
            // InternalGumboParser.g:6317:2: kw= Asterisk
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
        // InternalGumboParser.g:1071:5: ( ( () ( EqualsSignGreaterThanSign | Implies ) ) )
        // InternalGumboParser.g:1071:6: ( () ( EqualsSignGreaterThanSign | Implies ) )
        {
        // InternalGumboParser.g:1071:6: ( () ( EqualsSignGreaterThanSign | Implies ) )
        // InternalGumboParser.g:1072:6: () ( EqualsSignGreaterThanSign | Implies )
        {
        // InternalGumboParser.g:1072:6: ()
        // InternalGumboParser.g:1073:6: 
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
        // InternalGumboParser.g:1151:5: ( ( () ( ( LessThanSignEqualsSignGreaterThanSign ) ) ) )
        // InternalGumboParser.g:1151:6: ( () ( ( LessThanSignEqualsSignGreaterThanSign ) ) )
        {
        // InternalGumboParser.g:1151:6: ( () ( ( LessThanSignEqualsSignGreaterThanSign ) ) )
        // InternalGumboParser.g:1152:6: () ( ( LessThanSignEqualsSignGreaterThanSign ) )
        {
        // InternalGumboParser.g:1152:6: ()
        // InternalGumboParser.g:1153:6: 
        {
        }

        // InternalGumboParser.g:1154:6: ( ( LessThanSignEqualsSignGreaterThanSign ) )
        // InternalGumboParser.g:1155:7: ( LessThanSignEqualsSignGreaterThanSign )
        {
        // InternalGumboParser.g:1155:7: ( LessThanSignEqualsSignGreaterThanSign )
        // InternalGumboParser.g:1156:8: LessThanSignEqualsSignGreaterThanSign
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
        // InternalGumboParser.g:1234:5: ( ( () ( ( ( Or ) ) | ( ( Orelse ) ) ) ) )
        // InternalGumboParser.g:1234:6: ( () ( ( ( Or ) ) | ( ( Orelse ) ) ) )
        {
        // InternalGumboParser.g:1234:6: ( () ( ( ( Or ) ) | ( ( Orelse ) ) ) )
        // InternalGumboParser.g:1235:6: () ( ( ( Or ) ) | ( ( Orelse ) ) )
        {
        // InternalGumboParser.g:1235:6: ()
        // InternalGumboParser.g:1236:6: 
        {
        }

        // InternalGumboParser.g:1237:6: ( ( ( Or ) ) | ( ( Orelse ) ) )
        int alt114=2;
        int LA114_0 = input.LA(1);

        if ( (LA114_0==Or) ) {
            alt114=1;
        }
        else if ( (LA114_0==Orelse) ) {
            alt114=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 114, 0, input);

            throw nvae;
        }
        switch (alt114) {
            case 1 :
                // InternalGumboParser.g:1238:7: ( ( Or ) )
                {
                // InternalGumboParser.g:1238:7: ( ( Or ) )
                // InternalGumboParser.g:1239:8: ( Or )
                {
                // InternalGumboParser.g:1239:8: ( Or )
                // InternalGumboParser.g:1240:9: Or
                {
                match(input,Or,FollowSets000.FOLLOW_2); if (state.failed) return ;

                }


                }


                }
                break;
            case 2 :
                // InternalGumboParser.g:1244:7: ( ( Orelse ) )
                {
                // InternalGumboParser.g:1244:7: ( ( Orelse ) )
                // InternalGumboParser.g:1245:8: ( Orelse )
                {
                // InternalGumboParser.g:1245:8: ( Orelse )
                // InternalGumboParser.g:1246:9: Orelse
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
        // InternalGumboParser.g:1342:5: ( ( () ( ( ( And ) ) | ( ( Andthen ) ) ) ) )
        // InternalGumboParser.g:1342:6: ( () ( ( ( And ) ) | ( ( Andthen ) ) ) )
        {
        // InternalGumboParser.g:1342:6: ( () ( ( ( And ) ) | ( ( Andthen ) ) ) )
        // InternalGumboParser.g:1343:6: () ( ( ( And ) ) | ( ( Andthen ) ) )
        {
        // InternalGumboParser.g:1343:6: ()
        // InternalGumboParser.g:1344:6: 
        {
        }

        // InternalGumboParser.g:1345:6: ( ( ( And ) ) | ( ( Andthen ) ) )
        int alt115=2;
        int LA115_0 = input.LA(1);

        if ( (LA115_0==And) ) {
            alt115=1;
        }
        else if ( (LA115_0==Andthen) ) {
            alt115=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 115, 0, input);

            throw nvae;
        }
        switch (alt115) {
            case 1 :
                // InternalGumboParser.g:1346:7: ( ( And ) )
                {
                // InternalGumboParser.g:1346:7: ( ( And ) )
                // InternalGumboParser.g:1347:8: ( And )
                {
                // InternalGumboParser.g:1347:8: ( And )
                // InternalGumboParser.g:1348:9: And
                {
                match(input,And,FollowSets000.FOLLOW_2); if (state.failed) return ;

                }


                }


                }
                break;
            case 2 :
                // InternalGumboParser.g:1352:7: ( ( Andthen ) )
                {
                // InternalGumboParser.g:1352:7: ( ( Andthen ) )
                // InternalGumboParser.g:1353:8: ( Andthen )
                {
                // InternalGumboParser.g:1353:8: ( Andthen )
                // InternalGumboParser.g:1354:9: Andthen
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
        // InternalGumboParser.g:1504:5: ( ( () ( ( ruleRelationalOp ) ) ) )
        // InternalGumboParser.g:1504:6: ( () ( ( ruleRelationalOp ) ) )
        {
        // InternalGumboParser.g:1504:6: ( () ( ( ruleRelationalOp ) ) )
        // InternalGumboParser.g:1505:6: () ( ( ruleRelationalOp ) )
        {
        // InternalGumboParser.g:1505:6: ()
        // InternalGumboParser.g:1506:6: 
        {
        }

        // InternalGumboParser.g:1507:6: ( ( ruleRelationalOp ) )
        // InternalGumboParser.g:1508:7: ( ruleRelationalOp )
        {
        // InternalGumboParser.g:1508:7: ( ruleRelationalOp )
        // InternalGumboParser.g:1509:8: ruleRelationalOp
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
        // InternalGumboParser.g:1592:5: ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )
        // InternalGumboParser.g:1592:6: ( () ( ( ( PlusSign | HyphenMinus ) ) ) )
        {
        // InternalGumboParser.g:1592:6: ( () ( ( ( PlusSign | HyphenMinus ) ) ) )
        // InternalGumboParser.g:1593:6: () ( ( ( PlusSign | HyphenMinus ) ) )
        {
        // InternalGumboParser.g:1593:6: ()
        // InternalGumboParser.g:1594:6: 
        {
        }

        // InternalGumboParser.g:1595:6: ( ( ( PlusSign | HyphenMinus ) ) )
        // InternalGumboParser.g:1596:7: ( ( PlusSign | HyphenMinus ) )
        {
        // InternalGumboParser.g:1596:7: ( ( PlusSign | HyphenMinus ) )
        // InternalGumboParser.g:1597:8: ( PlusSign | HyphenMinus )
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
        // InternalGumboParser.g:1692:5: ( ( () ( ( ( Asterisk | Solidus | PercentSign ) ) ) ) )
        // InternalGumboParser.g:1692:6: ( () ( ( ( Asterisk | Solidus | PercentSign ) ) ) )
        {
        // InternalGumboParser.g:1692:6: ( () ( ( ( Asterisk | Solidus | PercentSign ) ) ) )
        // InternalGumboParser.g:1693:6: () ( ( ( Asterisk | Solidus | PercentSign ) ) )
        {
        // InternalGumboParser.g:1693:6: ()
        // InternalGumboParser.g:1694:6: 
        {
        }

        // InternalGumboParser.g:1695:6: ( ( ( Asterisk | Solidus | PercentSign ) ) )
        // InternalGumboParser.g:1696:7: ( ( Asterisk | Solidus | PercentSign ) )
        {
        // InternalGumboParser.g:1696:7: ( ( Asterisk | Solidus | PercentSign ) )
        // InternalGumboParser.g:1697:8: ( Asterisk | Solidus | PercentSign )
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
        // InternalGumboParser.g:1805:5: ( ( () ( ( CircumflexAccent ) ) ) )
        // InternalGumboParser.g:1805:6: ( () ( ( CircumflexAccent ) ) )
        {
        // InternalGumboParser.g:1805:6: ( () ( ( CircumflexAccent ) ) )
        // InternalGumboParser.g:1806:6: () ( ( CircumflexAccent ) )
        {
        // InternalGumboParser.g:1806:6: ()
        // InternalGumboParser.g:1807:6: 
        {
        }

        // InternalGumboParser.g:1808:6: ( ( CircumflexAccent ) )
        // InternalGumboParser.g:1809:7: ( CircumflexAccent )
        {
        // InternalGumboParser.g:1809:7: ( CircumflexAccent )
        // InternalGumboParser.g:1810:8: CircumflexAccent
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
        // InternalGumboParser.g:2030:5: ( ( () Enum LeftParenthesis ) )
        // InternalGumboParser.g:2030:6: ( () Enum LeftParenthesis )
        {
        // InternalGumboParser.g:2030:6: ( () Enum LeftParenthesis )
        // InternalGumboParser.g:2031:6: () Enum LeftParenthesis
        {
        // InternalGumboParser.g:2031:6: ()
        // InternalGumboParser.g:2032:6: 
        {
        }

        match(input,Enum,FollowSets000.FOLLOW_34); if (state.failed) return ;
        match(input,LeftParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalGumboParser

    // $ANTLR start synpred10_InternalGumboParser
    public final void synpred10_InternalGumboParser_fragment() throws RecognitionException {   
        // InternalGumboParser.g:2099:5: ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )
        // InternalGumboParser.g:2099:6: ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign )
        {
        // InternalGumboParser.g:2099:6: ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign )
        // InternalGumboParser.g:2100:6: () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign
        {
        // InternalGumboParser.g:2100:6: ()
        // InternalGumboParser.g:2101:6: 
        {
        }

        // InternalGumboParser.g:2102:6: ( ( ruleDataElement ) )
        // InternalGumboParser.g:2103:7: ( ruleDataElement )
        {
        // InternalGumboParser.g:2103:7: ( ruleDataElement )
        // InternalGumboParser.g:2104:8: ruleDataElement
        {
        pushFollow(FollowSets000.FOLLOW_37);
        ruleDataElement();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,LeftCurlyBracket,FollowSets000.FOLLOW_10); if (state.failed) return ;
        // InternalGumboParser.g:2108:6: ( ( RULE_ID ) )
        // InternalGumboParser.g:2109:7: ( RULE_ID )
        {
        // InternalGumboParser.g:2109:7: ( RULE_ID )
        // InternalGumboParser.g:2110:8: RULE_ID
        {
        match(input,RULE_ID,FollowSets000.FOLLOW_38); if (state.failed) return ;

        }


        }

        match(input,EqualsSign,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalGumboParser

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
    public final boolean synpred10_InternalGumboParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalGumboParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA32 dfa32 = new DFA32(this);
    protected DFA96 dfa96 = new DFA96(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\uffff\1\12\13\uffff\1\12";
    static final String dfa_3s = "\1\34\1\14\7\uffff\1\136\3\uffff\1\14";
    static final String dfa_4s = "\1\136\1\116\7\uffff\1\136\3\uffff\1\116";
    static final String dfa_5s = "\2\uffff\1\2\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\1\2\3\1\uffff";
    static final String dfa_6s = "\1\1\1\0\13\uffff\1\2}>";
    static final String[] dfa_7s = {
            "\1\5\1\6\6\uffff\1\2\1\7\1\uffff\1\5\24\uffff\1\10\34\uffff\1\4\1\uffff\1\3\2\uffff\1\1",
            "\3\12\3\uffff\2\12\3\uffff\1\12\10\uffff\1\12\2\uffff\1\12\6\uffff\2\12\6\uffff\1\14\5\12\1\uffff\1\12\1\uffff\7\12\1\11\1\12\1\uffff\4\12\1\uffff\1\12\1\uffff\1\12\1\13\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\15",
            "",
            "",
            "",
            "\3\12\3\uffff\2\12\3\uffff\1\12\10\uffff\1\12\2\uffff\1\12\6\uffff\2\12\7\uffff\5\12\1\uffff\1\12\1\uffff\11\12\1\uffff\4\12\1\uffff\1\12\1\uffff\1\12\1\13\1\12"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1960:2: ( ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= FullStop ( (lv_ref_3_0= ruleOtherDataRef ) ) )? ( (lv_cs_4_0= ruleCallSuffix ) )? ) | ( ( ( ( () Enum LeftParenthesis ) )=> ( () otherlv_6= Enum otherlv_7= LeftParenthesis ) ) ( (lv_enumType_8_0= ruleDataElement ) ) otherlv_9= Comma ( (otherlv_10= RULE_ID ) ) otherlv_11= RightParenthesis ) | ( ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_13_0= ruleDataElement ) ) otherlv_14= LeftCurlyBracket ( (otherlv_15= RULE_ID ) ) otherlv_16= EqualsSign ) ) ( (lv_argExpr_17_0= ruleExpr ) ) (otherlv_18= Semicolon ( (otherlv_19= RULE_ID ) ) otherlv_20= EqualsSign ( (lv_argExpr_21_0= ruleExpr ) ) )* otherlv_22= RightCurlyBracket ) | ( () ( (lv_value_24_0= RULE_INTEGER_LIT ) ) ) | ( () ( (lv_val_26_0= RULE_REAL_LIT ) ) ) | ( () ( (lv_val_28_0= ruleBooleanLiteral ) ) ) | ( () otherlv_30= Floor otherlv_31= LeftParenthesis ( (lv_expr_32_0= ruleExpr ) ) otherlv_33= RightParenthesis ) | ( () otherlv_35= Real otherlv_36= LeftParenthesis ( (lv_expr_37_0= ruleExpr ) ) otherlv_38= RightParenthesis ) | (otherlv_39= LeftParenthesis this_Expr_40= ruleExpr otherlv_41= RightParenthesis ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_1 = input.LA(1);

                         
                        int index32_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_1==FullStop) ) {s = 9;}

                        else if ( (LA32_1==EOF||(LA32_1>=Modifies && LA32_1<=Andthen)||(LA32_1>=Ensures && LA32_1<=Implies)||LA32_1==Orelse||LA32_1==Reads||LA32_1==Case||(LA32_1>=LessThanSignEqualsSignGreaterThanSign && LA32_1<=And)||(LA32_1>=ColonEqualsSign && LA32_1<=GreaterThanSignEqualsSign)||LA32_1==Or||(LA32_1>=PercentSign && LA32_1<=HyphenMinus)||LA32_1==Solidus||(LA32_1>=Semicolon && LA32_1<=GreaterThanSign)||LA32_1==LeftSquareBracket||LA32_1==CircumflexAccent||LA32_1==RightCurlyBracket) ) {s = 10;}

                        else if ( (LA32_1==LeftCurlyBracket) && (synpred10_InternalGumboParser())) {s = 11;}

                        else if ( (LA32_1==ColonColon) && (synpred10_InternalGumboParser())) {s = 12;}

                         
                        input.seek(index32_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA32_0 = input.LA(1);

                         
                        int index32_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_0==RULE_ID) ) {s = 1;}

                        else if ( (LA32_0==Enum) && (synpred9_InternalGumboParser())) {s = 2;}

                        else if ( (LA32_0==RULE_INTEGER_LIT) ) {s = 3;}

                        else if ( (LA32_0==RULE_REAL_LIT) ) {s = 4;}

                        else if ( (LA32_0==False||LA32_0==True) ) {s = 5;}

                        else if ( (LA32_0==Floor) ) {s = 6;}

                        else if ( (LA32_0==Real) ) {s = 7;}

                        else if ( (LA32_0==LeftParenthesis) ) {s = 8;}

                         
                        input.seek(index32_0);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA32_13 = input.LA(1);

                         
                        int index32_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_13==LeftCurlyBracket) && (synpred10_InternalGumboParser())) {s = 11;}

                        else if ( (LA32_13==EOF||(LA32_13>=Modifies && LA32_13<=Andthen)||(LA32_13>=Ensures && LA32_13<=Implies)||LA32_13==Orelse||LA32_13==Reads||LA32_13==Case||(LA32_13>=LessThanSignEqualsSignGreaterThanSign && LA32_13<=And)||(LA32_13>=ColonEqualsSign && LA32_13<=GreaterThanSignEqualsSign)||LA32_13==Or||(LA32_13>=PercentSign && LA32_13<=Solidus)||(LA32_13>=Semicolon && LA32_13<=GreaterThanSign)||LA32_13==LeftSquareBracket||LA32_13==CircumflexAccent||LA32_13==RightCurlyBracket) ) {s = 10;}

                         
                        input.seek(index32_13);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\25\uffff";
    static final String dfa_9s = "\10\uffff\1\17\1\21\1\23\3\uffff\1\17\1\uffff\1\21\3\uffff\1\23";
    static final String dfa_10s = "\1\5\5\uffff\2\131\3\17\3\uffff\1\17\1\uffff\1\17\1\uffff\1\136\1\uffff\1\17";
    static final String dfa_11s = "\1\136\5\uffff\4\136\1\105\3\uffff\1\105\1\uffff\1\105\1\uffff\1\136\1\uffff\1\105";
    static final String dfa_12s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\5\uffff\1\11\1\12\1\6\1\uffff\1\7\1\uffff\1\10\1\uffff\1\13\1\uffff";
    static final String dfa_13s = "\25\uffff}>";
    static final String[] dfa_14s = {
            "\1\3\4\uffff\1\2\6\uffff\1\4\12\uffff\1\14\12\uffff\1\14\24\uffff\1\13\2\uffff\1\6\1\uffff\1\7\10\uffff\1\1\16\uffff\1\10\1\uffff\1\11\1\uffff\1\5\1\12",
            "",
            "",
            "",
            "",
            "",
            "\1\10\1\uffff\1\11\2\uffff\1\15",
            "\1\10\1\uffff\1\11\2\uffff\1\15",
            "\1\17\41\uffff\1\15\6\uffff\1\17\4\uffff\1\17\2\uffff\1\17\4\uffff\1\17\30\uffff\1\16",
            "\1\21\41\uffff\1\15\6\uffff\1\21\4\uffff\1\21\2\uffff\1\21\4\uffff\1\21\30\uffff\1\20",
            "\1\23\41\uffff\1\15\1\22\5\uffff\1\23\4\uffff\1\23\2\uffff\1\23\4\uffff\1\23",
            "",
            "",
            "",
            "\1\17\41\uffff\1\15\6\uffff\1\17\4\uffff\1\17\2\uffff\1\17\4\uffff\1\17",
            "",
            "\1\21\41\uffff\1\15\6\uffff\1\21\4\uffff\1\21\2\uffff\1\21\4\uffff\1\21",
            "",
            "\1\24",
            "",
            "\1\23\41\uffff\1\15\6\uffff\1\23\4\uffff\1\23\2\uffff\1\23\4\uffff\1\23"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA96 extends DFA {

        public DFA96(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 96;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "4928:2: (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000201D2L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000200D2L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020052L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020042L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000200000000002L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x100080B030000000L,0x000000004A000002L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400200L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400202L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0040000000080002L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0200000000800002L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000080000004002L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00B0000000000002L,0x00000000000001C0L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000002L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x4800000000000002L,0x0000000000000008L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000404L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000400L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004020L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080200L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x1000000000000000L,0x0000000040000000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x1000000404000000L,0x0000000040098000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0002020000000002L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x300080B030000000L,0x000000004A000002L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0008000000000002L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0040000000000002L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x3000400000000000L,0x0000000040000000L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x1000400000000000L,0x0000000040000000L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000801L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x1000404002200000L,0x0000000040080000L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x1000404002200002L,0x0000000040080000L});
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x1040400000000000L,0x0000000040000000L});
        public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x4000000000000002L});
        public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000410L});
        public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0008004000000000L});
        public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0040000000000000L,0x0000000040000000L});
        public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000900043002L});
        public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000043002L});
        public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000041002L});
        public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000042002L});
        public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000400000000000L,0x0000000040000000L});
        public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
        public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0040010000000000L});
        public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x9000008010020C20L,0x000000006A000402L});
        public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0100000000008000L,0x0000000000000021L});
        public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000021L});
        public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0100000000000002L});
        public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000800L});
        public static final BitSet FOLLOW_79 = new BitSet(new long[]{0xB000008010020C20L,0x000000006A000402L});
        public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000404L});
        public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
        public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000800L});
        public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
        public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x8000000000000000L,0x000000004A000002L});
        public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
        public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0004000000000000L});
    }


}