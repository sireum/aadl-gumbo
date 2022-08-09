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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Strictpure", "Integration", "Classifier", "Initialize", "Invariants", "Extension", "Functions", "Guarantee", "Invariant", "Reference", "MustSend", "Constant", "Modifies", "Requires", "MaySend", "Applies", "Binding", "Compute", "Ensures", "NoSend", "Assert", "Assume", "Handle", "Return", "Some", "Cases", "Delta", "False", "Match", "Modes", "Reads", "State", "While", "Yield", "All", "Case", "Else", "Halt", "Spec", "True", "PlusSignEqualsSignGreaterThanSign", "FullStopFullStopLessThanSign", "Def", "For", "Inv", "Mut", "Val", "Var", "FullStopFullStop", "ColonColon", "ColonEqualsSign", "LessThanSignColon", "EqualsSignGreaterThanSign", "By", "Do", "If", "In_1", "To", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "FullStop", "Colon", "Semicolon", "EqualsSign", "QuestionMark", "F", "T", "LeftSquareBracket", "RightSquareBracket", "KW__", "LeftCurlyBracket", "RightCurlyBracket", "ForAll", "ThereExists", "RULE_ESC_SEQ", "RULE_SLANG_STRING", "RULE_MSTRING", "RULE_IDF", "RULE_MSPI", "RULE_MSP", "RULE_SLI", "RULE_MSPB", "RULE_MSPM", "RULE_MSPE", "RULE_OPSYM", "RULE_DEFOP", "RULE_IMPLIES", "RULE_SIMPLIES", "RULE_OP", "RULE_EXTENDED_DIGIT", "RULE_HEX", "RULE_BIN", "RULE_INTEGER_LIT", "RULE_INT_IDF", "RULE_REAL_LIT", "RULE_REAL_IDF", "RULE_LETTER", "RULE_DIGIT", "RULE_UNICODE_ESC", "RULE_SL_COMMENT", "RULE_EXPONENT", "RULE_INT_EXPONENT", "RULE_BASED_INTEGER", "RULE_STRING", "RULE_ID", "RULE_WS"
    };
    public static final int Val=50;
    public static final int RULE_HEX=98;
    public static final int EqualsSignGreaterThanSign=56;
    public static final int Var=51;
    public static final int False=31;
    public static final int Initialize=7;
    public static final int Invariants=8;
    public static final int Assert=24;
    public static final int PlusSignEqualsSignGreaterThanSign=44;
    public static final int LeftParenthesis=62;
    public static final int RULE_MSTRING=84;
    public static final int RULE_SLANG_STRING=83;
    public static final int RULE_OP=96;
    public static final int RULE_BIN=99;
    public static final int RULE_ESC_SEQ=82;
    public static final int RULE_ID=112;
    public static final int RULE_DIGIT=105;
    public static final int Handle=26;
    public static final int ColonColon=53;
    public static final int Some=28;
    public static final int RULE_REAL_IDF=103;
    public static final int PlusSign=65;
    public static final int LeftSquareBracket=75;
    public static final int If=59;
    public static final int Halt=41;
    public static final int F=73;
    public static final int ThereExists=81;
    public static final int RULE_REAL_LIT=102;
    public static final int Classifier=6;
    public static final int Case=39;
    public static final int Comma=66;
    public static final int HyphenMinus=67;
    public static final int NoSend=23;
    public static final int T=74;
    public static final int RULE_MSPE=91;
    public static final int Guarantee=11;
    public static final int RightCurlyBracket=79;
    public static final int RULE_MSPB=89;
    public static final int Modes=33;
    public static final int FullStop=68;
    public static final int RULE_SIMPLIES=95;
    public static final int Reference=13;
    public static final int RULE_IMPLIES=94;
    public static final int RULE_UNICODE_ESC=106;
    public static final int Functions=10;
    public static final int Strictpure=4;
    public static final int KW__=77;
    public static final int Semicolon=70;
    public static final int RULE_LETTER=104;
    public static final int RULE_EXPONENT=108;
    public static final int Delta=30;
    public static final int QuestionMark=72;
    public static final int RULE_SLI=88;
    public static final int By=57;
    public static final int Else=40;
    public static final int RULE_EXTENDED_DIGIT=97;
    public static final int Yield=37;
    public static final int All=38;
    public static final int True=43;
    public static final int RULE_INT_EXPONENT=109;
    public static final int In_1=60;
    public static final int FullStopFullStop=52;
    public static final int LessThanSignColon=55;
    public static final int Ensures=22;
    public static final int To=61;
    public static final int Applies=19;
    public static final int RULE_MSP=87;
    public static final int RULE_BASED_INTEGER=110;
    public static final int RightSquareBracket=76;
    public static final int Binding=20;
    public static final int RULE_MSPM=90;
    public static final int RULE_DEFOP=93;
    public static final int RULE_MSPI=86;
    public static final int Requires=17;
    public static final int For=47;
    public static final int RightParenthesis=63;
    public static final int Do=58;
    public static final int ColonEqualsSign=54;
    public static final int Mut=49;
    public static final int State=35;
    public static final int Assume=25;
    public static final int RULE_INTEGER_LIT=100;
    public static final int Invariant=12;
    public static final int Constant=15;
    public static final int RULE_STRING=111;
    public static final int Match=32;
    public static final int Reads=34;
    public static final int RULE_SL_COMMENT=107;
    public static final int Inv=48;
    public static final int EqualsSign=71;
    public static final int Modifies=16;
    public static final int Colon=69;
    public static final int EOF=-1;
    public static final int Asterisk=64;
    public static final int Integration=5;
    public static final int RULE_OPSYM=92;
    public static final int Return=27;
    public static final int Def=46;
    public static final int RULE_WS=113;
    public static final int LeftCurlyBracket=78;
    public static final int RULE_INT_IDF=101;
    public static final int MustSend=14;
    public static final int While=36;
    public static final int Extension=9;
    public static final int FullStopFullStopLessThanSign=45;
    public static final int RULE_IDF=85;
    public static final int Compute=21;
    public static final int MaySend=18;
    public static final int Spec=42;
    public static final int ForAll=80;
    public static final int Cases=29;

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




    // $ANTLR start "entryRuleAnnexLibrary"
    // InternalGumboParser.g:73:1: entryRuleAnnexLibrary returns [EObject current=null] : iv_ruleAnnexLibrary= ruleAnnexLibrary EOF ;
    public final EObject entryRuleAnnexLibrary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnexLibrary = null;


        try {
            // InternalGumboParser.g:73:53: (iv_ruleAnnexLibrary= ruleAnnexLibrary EOF )
            // InternalGumboParser.g:74:2: iv_ruleAnnexLibrary= ruleAnnexLibrary EOF
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
    // InternalGumboParser.g:80:1: ruleAnnexLibrary returns [EObject current=null] : this_GumboLibrary_0= ruleGumboLibrary ;
    public final EObject ruleAnnexLibrary() throws RecognitionException {
        EObject current = null;

        EObject this_GumboLibrary_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:86:2: (this_GumboLibrary_0= ruleGumboLibrary )
            // InternalGumboParser.g:87:2: this_GumboLibrary_0= ruleGumboLibrary
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
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
    // InternalGumboParser.g:101:1: entryRuleGumboLibrary returns [EObject current=null] : iv_ruleGumboLibrary= ruleGumboLibrary EOF ;
    public final EObject entryRuleGumboLibrary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGumboLibrary = null;


        try {
            // InternalGumboParser.g:101:53: (iv_ruleGumboLibrary= ruleGumboLibrary EOF )
            // InternalGumboParser.g:102:2: iv_ruleGumboLibrary= ruleGumboLibrary EOF
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
    // InternalGumboParser.g:108:1: ruleGumboLibrary returns [EObject current=null] : ( () ( (lv_functions_1_0= ruleFunctions ) )? ) ;
    public final EObject ruleGumboLibrary() throws RecognitionException {
        EObject current = null;

        EObject lv_functions_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:114:2: ( ( () ( (lv_functions_1_0= ruleFunctions ) )? ) )
            // InternalGumboParser.g:115:2: ( () ( (lv_functions_1_0= ruleFunctions ) )? )
            {
            // InternalGumboParser.g:115:2: ( () ( (lv_functions_1_0= ruleFunctions ) )? )
            // InternalGumboParser.g:116:3: () ( (lv_functions_1_0= ruleFunctions ) )?
            {
            // InternalGumboParser.g:116:3: ()
            // InternalGumboParser.g:117:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getGumboLibraryAccess().getGumboLibraryAction_0(),
              					current);
              			
            }

            }

            // InternalGumboParser.g:126:3: ( (lv_functions_1_0= ruleFunctions ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==Functions) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalGumboParser.g:127:4: (lv_functions_1_0= ruleFunctions )
                    {
                    // InternalGumboParser.g:127:4: (lv_functions_1_0= ruleFunctions )
                    // InternalGumboParser.g:128:5: lv_functions_1_0= ruleFunctions
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getGumboLibraryAccess().getFunctionsFunctionsParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_functions_1_0=ruleFunctions();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getGumboLibraryRule());
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
    // InternalGumboParser.g:149:1: entryRuleGumboSubclause returns [EObject current=null] : iv_ruleGumboSubclause= ruleGumboSubclause EOF ;
    public final EObject entryRuleGumboSubclause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGumboSubclause = null;


        try {
            // InternalGumboParser.g:149:55: (iv_ruleGumboSubclause= ruleGumboSubclause EOF )
            // InternalGumboParser.g:150:2: iv_ruleGumboSubclause= ruleGumboSubclause EOF
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
    // InternalGumboParser.g:156:1: ruleGumboSubclause returns [EObject current=null] : ( () ( (lv_specs_1_0= ruleSpecSection ) ) ) ;
    public final EObject ruleGumboSubclause() throws RecognitionException {
        EObject current = null;

        EObject lv_specs_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:162:2: ( ( () ( (lv_specs_1_0= ruleSpecSection ) ) ) )
            // InternalGumboParser.g:163:2: ( () ( (lv_specs_1_0= ruleSpecSection ) ) )
            {
            // InternalGumboParser.g:163:2: ( () ( (lv_specs_1_0= ruleSpecSection ) ) )
            // InternalGumboParser.g:164:3: () ( (lv_specs_1_0= ruleSpecSection ) )
            {
            // InternalGumboParser.g:164:3: ()
            // InternalGumboParser.g:165:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getGumboSubclauseAccess().getGumboSubclauseAction_0(),
              					current);
              			
            }

            }

            // InternalGumboParser.g:174:3: ( (lv_specs_1_0= ruleSpecSection ) )
            // InternalGumboParser.g:175:4: (lv_specs_1_0= ruleSpecSection )
            {
            // InternalGumboParser.g:175:4: (lv_specs_1_0= ruleSpecSection )
            // InternalGumboParser.g:176:5: lv_specs_1_0= ruleSpecSection
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
    // InternalGumboParser.g:197:1: entryRuleSpecSection returns [EObject current=null] : iv_ruleSpecSection= ruleSpecSection EOF ;
    public final EObject entryRuleSpecSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecSection = null;


        try {
            // InternalGumboParser.g:197:52: (iv_ruleSpecSection= ruleSpecSection EOF )
            // InternalGumboParser.g:198:2: iv_ruleSpecSection= ruleSpecSection EOF
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
    // InternalGumboParser.g:204:1: ruleSpecSection returns [EObject current=null] : ( () ( (lv_state_1_0= ruleState ) )? ( (lv_functions_2_0= ruleFunctions ) )? ( (lv_invariants_3_0= ruleInvariants ) )? ( (lv_integration_4_0= ruleIntegration ) )? ( (lv_initialize_5_0= ruleInitialize ) )? ( (lv_compute_6_0= ruleCompute ) )? ) ;
    public final EObject ruleSpecSection() throws RecognitionException {
        EObject current = null;

        EObject lv_state_1_0 = null;

        EObject lv_functions_2_0 = null;

        EObject lv_invariants_3_0 = null;

        EObject lv_integration_4_0 = null;

        EObject lv_initialize_5_0 = null;

        EObject lv_compute_6_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:210:2: ( ( () ( (lv_state_1_0= ruleState ) )? ( (lv_functions_2_0= ruleFunctions ) )? ( (lv_invariants_3_0= ruleInvariants ) )? ( (lv_integration_4_0= ruleIntegration ) )? ( (lv_initialize_5_0= ruleInitialize ) )? ( (lv_compute_6_0= ruleCompute ) )? ) )
            // InternalGumboParser.g:211:2: ( () ( (lv_state_1_0= ruleState ) )? ( (lv_functions_2_0= ruleFunctions ) )? ( (lv_invariants_3_0= ruleInvariants ) )? ( (lv_integration_4_0= ruleIntegration ) )? ( (lv_initialize_5_0= ruleInitialize ) )? ( (lv_compute_6_0= ruleCompute ) )? )
            {
            // InternalGumboParser.g:211:2: ( () ( (lv_state_1_0= ruleState ) )? ( (lv_functions_2_0= ruleFunctions ) )? ( (lv_invariants_3_0= ruleInvariants ) )? ( (lv_integration_4_0= ruleIntegration ) )? ( (lv_initialize_5_0= ruleInitialize ) )? ( (lv_compute_6_0= ruleCompute ) )? )
            // InternalGumboParser.g:212:3: () ( (lv_state_1_0= ruleState ) )? ( (lv_functions_2_0= ruleFunctions ) )? ( (lv_invariants_3_0= ruleInvariants ) )? ( (lv_integration_4_0= ruleIntegration ) )? ( (lv_initialize_5_0= ruleInitialize ) )? ( (lv_compute_6_0= ruleCompute ) )?
            {
            // InternalGumboParser.g:212:3: ()
            // InternalGumboParser.g:213:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSpecSectionAccess().getSpecSectionAction_0(),
              					current);
              			
            }

            }

            // InternalGumboParser.g:222:3: ( (lv_state_1_0= ruleState ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==State) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGumboParser.g:223:4: (lv_state_1_0= ruleState )
                    {
                    // InternalGumboParser.g:223:4: (lv_state_1_0= ruleState )
                    // InternalGumboParser.g:224:5: lv_state_1_0= ruleState
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSpecSectionAccess().getStateStateParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_3);
                    lv_state_1_0=ruleState();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSpecSectionRule());
                      					}
                      					set(
                      						current,
                      						"state",
                      						lv_state_1_0,
                      						"org.sireum.aadl.gumbo.Gumbo.State");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalGumboParser.g:241:3: ( (lv_functions_2_0= ruleFunctions ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Functions) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalGumboParser.g:242:4: (lv_functions_2_0= ruleFunctions )
                    {
                    // InternalGumboParser.g:242:4: (lv_functions_2_0= ruleFunctions )
                    // InternalGumboParser.g:243:5: lv_functions_2_0= ruleFunctions
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSpecSectionAccess().getFunctionsFunctionsParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_functions_2_0=ruleFunctions();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSpecSectionRule());
                      					}
                      					set(
                      						current,
                      						"functions",
                      						lv_functions_2_0,
                      						"org.sireum.aadl.gumbo.Gumbo.Functions");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalGumboParser.g:260:3: ( (lv_invariants_3_0= ruleInvariants ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Invariants) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalGumboParser.g:261:4: (lv_invariants_3_0= ruleInvariants )
                    {
                    // InternalGumboParser.g:261:4: (lv_invariants_3_0= ruleInvariants )
                    // InternalGumboParser.g:262:5: lv_invariants_3_0= ruleInvariants
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSpecSectionAccess().getInvariantsInvariantsParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_5);
                    lv_invariants_3_0=ruleInvariants();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSpecSectionRule());
                      					}
                      					set(
                      						current,
                      						"invariants",
                      						lv_invariants_3_0,
                      						"org.sireum.aadl.gumbo.Gumbo.Invariants");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalGumboParser.g:279:3: ( (lv_integration_4_0= ruleIntegration ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Integration) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGumboParser.g:280:4: (lv_integration_4_0= ruleIntegration )
                    {
                    // InternalGumboParser.g:280:4: (lv_integration_4_0= ruleIntegration )
                    // InternalGumboParser.g:281:5: lv_integration_4_0= ruleIntegration
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSpecSectionAccess().getIntegrationIntegrationParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_integration_4_0=ruleIntegration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSpecSectionRule());
                      					}
                      					set(
                      						current,
                      						"integration",
                      						lv_integration_4_0,
                      						"org.sireum.aadl.gumbo.Gumbo.Integration");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalGumboParser.g:298:3: ( (lv_initialize_5_0= ruleInitialize ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Initialize) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGumboParser.g:299:4: (lv_initialize_5_0= ruleInitialize )
                    {
                    // InternalGumboParser.g:299:4: (lv_initialize_5_0= ruleInitialize )
                    // InternalGumboParser.g:300:5: lv_initialize_5_0= ruleInitialize
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSpecSectionAccess().getInitializeInitializeParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_initialize_5_0=ruleInitialize();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSpecSectionRule());
                      					}
                      					set(
                      						current,
                      						"initialize",
                      						lv_initialize_5_0,
                      						"org.sireum.aadl.gumbo.Gumbo.Initialize");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalGumboParser.g:317:3: ( (lv_compute_6_0= ruleCompute ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Compute) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGumboParser.g:318:4: (lv_compute_6_0= ruleCompute )
                    {
                    // InternalGumboParser.g:318:4: (lv_compute_6_0= ruleCompute )
                    // InternalGumboParser.g:319:5: lv_compute_6_0= ruleCompute
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSpecSectionAccess().getComputeComputeParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_compute_6_0=ruleCompute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSpecSectionRule());
                      					}
                      					set(
                      						current,
                      						"compute",
                      						lv_compute_6_0,
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
    // InternalGumboParser.g:340:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalGumboParser.g:340:46: (iv_ruleState= ruleState EOF )
            // InternalGumboParser.g:341:2: iv_ruleState= ruleState EOF
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
    // InternalGumboParser.g:347:1: ruleState returns [EObject current=null] : (otherlv_0= State ( (lv_decls_1_0= ruleStateVarDecl ) )+ ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_decls_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:353:2: ( (otherlv_0= State ( (lv_decls_1_0= ruleStateVarDecl ) )+ ) )
            // InternalGumboParser.g:354:2: (otherlv_0= State ( (lv_decls_1_0= ruleStateVarDecl ) )+ )
            {
            // InternalGumboParser.g:354:2: (otherlv_0= State ( (lv_decls_1_0= ruleStateVarDecl ) )+ )
            // InternalGumboParser.g:355:3: otherlv_0= State ( (lv_decls_1_0= ruleStateVarDecl ) )+
            {
            otherlv_0=(Token)match(input,State,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
              		
            }
            // InternalGumboParser.g:359:3: ( (lv_decls_1_0= ruleStateVarDecl ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGumboParser.g:360:4: (lv_decls_1_0= ruleStateVarDecl )
            	    {
            	    // InternalGumboParser.g:360:4: (lv_decls_1_0= ruleStateVarDecl )
            	    // InternalGumboParser.g:361:5: lv_decls_1_0= ruleStateVarDecl
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getStateAccess().getDeclsStateVarDeclParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_9);
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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleStateVarDecl"
    // InternalGumboParser.g:382:1: entryRuleStateVarDecl returns [EObject current=null] : iv_ruleStateVarDecl= ruleStateVarDecl EOF ;
    public final EObject entryRuleStateVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateVarDecl = null;


        try {
            // InternalGumboParser.g:382:53: (iv_ruleStateVarDecl= ruleStateVarDecl EOF )
            // InternalGumboParser.g:383:2: iv_ruleStateVarDecl= ruleStateVarDecl EOF
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
    // InternalGumboParser.g:389:1: ruleStateVarDecl returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ) ( ( ruleQCREF ) ) otherlv_3= Semicolon ) ;
    public final EObject ruleStateVarDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalGumboParser.g:395:2: ( ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ) ( ( ruleQCREF ) ) otherlv_3= Semicolon ) )
            // InternalGumboParser.g:396:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ) ( ( ruleQCREF ) ) otherlv_3= Semicolon )
            {
            // InternalGumboParser.g:396:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ) ( ( ruleQCREF ) ) otherlv_3= Semicolon )
            // InternalGumboParser.g:397:3: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ) ( ( ruleQCREF ) ) otherlv_3= Semicolon
            {
            // InternalGumboParser.g:397:3: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon )
            // InternalGumboParser.g:398:4: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon
            {
            // InternalGumboParser.g:398:4: ( (lv_name_0_0= RULE_ID ) )
            // InternalGumboParser.g:399:5: (lv_name_0_0= RULE_ID )
            {
            // InternalGumboParser.g:399:5: (lv_name_0_0= RULE_ID )
            // InternalGumboParser.g:400:6: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,Colon,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getStateVarDeclAccess().getColonKeyword_0_1());
              			
            }

            }

            // InternalGumboParser.g:421:3: ( ( ruleQCREF ) )
            // InternalGumboParser.g:422:4: ( ruleQCREF )
            {
            // InternalGumboParser.g:422:4: ( ruleQCREF )
            // InternalGumboParser.g:423:5: ruleQCREF
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getStateVarDeclRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStateVarDeclAccess().getTypeNameDataSubcomponentTypeCrossReference_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_11);
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
    // InternalGumboParser.g:448:1: entryRuleInvariants returns [EObject current=null] : iv_ruleInvariants= ruleInvariants EOF ;
    public final EObject entryRuleInvariants() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariants = null;


        try {
            // InternalGumboParser.g:448:51: (iv_ruleInvariants= ruleInvariants EOF )
            // InternalGumboParser.g:449:2: iv_ruleInvariants= ruleInvariants EOF
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
    // InternalGumboParser.g:455:1: ruleInvariants returns [EObject current=null] : (otherlv_0= Invariants ( (lv_specs_1_0= ruleInvSpec ) )+ ) ;
    public final EObject ruleInvariants() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_specs_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:461:2: ( (otherlv_0= Invariants ( (lv_specs_1_0= ruleInvSpec ) )+ ) )
            // InternalGumboParser.g:462:2: (otherlv_0= Invariants ( (lv_specs_1_0= ruleInvSpec ) )+ )
            {
            // InternalGumboParser.g:462:2: (otherlv_0= Invariants ( (lv_specs_1_0= ruleInvSpec ) )+ )
            // InternalGumboParser.g:463:3: otherlv_0= Invariants ( (lv_specs_1_0= ruleInvSpec ) )+
            {
            otherlv_0=(Token)match(input,Invariants,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInvariantsAccess().getInvariantsKeyword_0());
              		
            }
            // InternalGumboParser.g:467:3: ( (lv_specs_1_0= ruleInvSpec ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Inv) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGumboParser.g:468:4: (lv_specs_1_0= ruleInvSpec )
            	    {
            	    // InternalGumboParser.g:468:4: (lv_specs_1_0= ruleInvSpec )
            	    // InternalGumboParser.g:469:5: lv_specs_1_0= ruleInvSpec
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getInvariantsAccess().getSpecsInvSpecParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_13);
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
    // $ANTLR end "ruleInvariants"


    // $ANTLR start "entryRuleInvSpec"
    // InternalGumboParser.g:490:1: entryRuleInvSpec returns [EObject current=null] : iv_ruleInvSpec= ruleInvSpec EOF ;
    public final EObject entryRuleInvSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvSpec = null;


        try {
            // InternalGumboParser.g:490:48: (iv_ruleInvSpec= ruleInvSpec EOF )
            // InternalGumboParser.g:491:2: iv_ruleInvSpec= ruleInvSpec EOF
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
    // InternalGumboParser.g:497:1: ruleInvSpec returns [EObject current=null] : (otherlv_0= Inv ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= Semicolon ) ;
    public final EObject ruleInvSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token lv_descriptor_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_expr_4_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:503:2: ( (otherlv_0= Inv ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= Semicolon ) )
            // InternalGumboParser.g:504:2: (otherlv_0= Inv ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= Semicolon )
            {
            // InternalGumboParser.g:504:2: (otherlv_0= Inv ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= Semicolon )
            // InternalGumboParser.g:505:3: otherlv_0= Inv ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= Semicolon
            {
            otherlv_0=(Token)match(input,Inv,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInvSpecAccess().getInvKeyword_0());
              		
            }
            // InternalGumboParser.g:509:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalGumboParser.g:510:4: (lv_id_1_0= RULE_ID )
            {
            // InternalGumboParser.g:510:4: (lv_id_1_0= RULE_ID )
            // InternalGumboParser.g:511:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_id_1_0, grammarAccess.getInvSpecAccess().getIdIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getInvSpecRule());
              					}
              					setWithLastConsumed(
              						current,
              						"id",
              						lv_id_1_0,
              						"org.osate.xtext.aadl2.properties.Properties.ID");
              				
            }

            }


            }

            // InternalGumboParser.g:527:3: ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_SLANG_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGumboParser.g:528:4: (lv_descriptor_2_0= RULE_SLANG_STRING )
                    {
                    // InternalGumboParser.g:528:4: (lv_descriptor_2_0= RULE_SLANG_STRING )
                    // InternalGumboParser.g:529:5: lv_descriptor_2_0= RULE_SLANG_STRING
                    {
                    lv_descriptor_2_0=(Token)match(input,RULE_SLANG_STRING,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_descriptor_2_0, grammarAccess.getInvSpecAccess().getDescriptorSLANG_STRINGTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getInvSpecRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"descriptor",
                      						lv_descriptor_2_0,
                      						"org.sireum.aadl.gumbo.Gumbo.SLANG_STRING");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,Colon,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getInvSpecAccess().getColonKeyword_3());
              		
            }
            // InternalGumboParser.g:549:3: ( (lv_expr_4_0= ruleExpr ) )
            // InternalGumboParser.g:550:4: (lv_expr_4_0= ruleExpr )
            {
            // InternalGumboParser.g:550:4: (lv_expr_4_0= ruleExpr )
            // InternalGumboParser.g:551:5: lv_expr_4_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInvSpecAccess().getExprExprParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_11);
            lv_expr_4_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getInvSpecRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_4_0,
              						"org.sireum.aadl.gumbo.Gumbo.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,Semicolon,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getInvSpecAccess().getSemicolonKeyword_5());
              		
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
    // InternalGumboParser.g:576:1: entryRuleIntegration returns [EObject current=null] : iv_ruleIntegration= ruleIntegration EOF ;
    public final EObject entryRuleIntegration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegration = null;


        try {
            // InternalGumboParser.g:576:52: (iv_ruleIntegration= ruleIntegration EOF )
            // InternalGumboParser.g:577:2: iv_ruleIntegration= ruleIntegration EOF
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
    // InternalGumboParser.g:583:1: ruleIntegration returns [EObject current=null] : (otherlv_0= Integration ( (lv_specs_1_0= ruleSpecStatement ) )+ ) ;
    public final EObject ruleIntegration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_specs_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:589:2: ( (otherlv_0= Integration ( (lv_specs_1_0= ruleSpecStatement ) )+ ) )
            // InternalGumboParser.g:590:2: (otherlv_0= Integration ( (lv_specs_1_0= ruleSpecStatement ) )+ )
            {
            // InternalGumboParser.g:590:2: (otherlv_0= Integration ( (lv_specs_1_0= ruleSpecStatement ) )+ )
            // InternalGumboParser.g:591:3: otherlv_0= Integration ( (lv_specs_1_0= ruleSpecStatement ) )+
            {
            otherlv_0=(Token)match(input,Integration,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIntegrationAccess().getIntegrationKeyword_0());
              		
            }
            // InternalGumboParser.g:595:3: ( (lv_specs_1_0= ruleSpecStatement ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==Guarantee||LA11_0==Assume) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGumboParser.g:596:4: (lv_specs_1_0= ruleSpecStatement )
            	    {
            	    // InternalGumboParser.g:596:4: (lv_specs_1_0= ruleSpecStatement )
            	    // InternalGumboParser.g:597:5: lv_specs_1_0= ruleSpecStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getIntegrationAccess().getSpecsSpecStatementParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_17);
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
    // $ANTLR end "ruleIntegration"


    // $ANTLR start "entryRuleInitialize"
    // InternalGumboParser.g:618:1: entryRuleInitialize returns [EObject current=null] : iv_ruleInitialize= ruleInitialize EOF ;
    public final EObject entryRuleInitialize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialize = null;


        try {
            // InternalGumboParser.g:618:51: (iv_ruleInitialize= ruleInitialize EOF )
            // InternalGumboParser.g:619:2: iv_ruleInitialize= ruleInitialize EOF
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
    // InternalGumboParser.g:625:1: ruleInitialize returns [EObject current=null] : (otherlv_0= Initialize ( ( (lv_modifies_1_0= ruleSlangModifies ) ) otherlv_2= Semicolon )? ( (lv_specs_3_0= ruleInitializeSpecStatement ) )+ ) ;
    public final EObject ruleInitialize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_modifies_1_0 = null;

        EObject lv_specs_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:631:2: ( (otherlv_0= Initialize ( ( (lv_modifies_1_0= ruleSlangModifies ) ) otherlv_2= Semicolon )? ( (lv_specs_3_0= ruleInitializeSpecStatement ) )+ ) )
            // InternalGumboParser.g:632:2: (otherlv_0= Initialize ( ( (lv_modifies_1_0= ruleSlangModifies ) ) otherlv_2= Semicolon )? ( (lv_specs_3_0= ruleInitializeSpecStatement ) )+ )
            {
            // InternalGumboParser.g:632:2: (otherlv_0= Initialize ( ( (lv_modifies_1_0= ruleSlangModifies ) ) otherlv_2= Semicolon )? ( (lv_specs_3_0= ruleInitializeSpecStatement ) )+ )
            // InternalGumboParser.g:633:3: otherlv_0= Initialize ( ( (lv_modifies_1_0= ruleSlangModifies ) ) otherlv_2= Semicolon )? ( (lv_specs_3_0= ruleInitializeSpecStatement ) )+
            {
            otherlv_0=(Token)match(input,Initialize,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInitializeAccess().getInitializeKeyword_0());
              		
            }
            // InternalGumboParser.g:637:3: ( ( (lv_modifies_1_0= ruleSlangModifies ) ) otherlv_2= Semicolon )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Modifies) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGumboParser.g:638:4: ( (lv_modifies_1_0= ruleSlangModifies ) ) otherlv_2= Semicolon
                    {
                    // InternalGumboParser.g:638:4: ( (lv_modifies_1_0= ruleSlangModifies ) )
                    // InternalGumboParser.g:639:5: (lv_modifies_1_0= ruleSlangModifies )
                    {
                    // InternalGumboParser.g:639:5: (lv_modifies_1_0= ruleSlangModifies )
                    // InternalGumboParser.g:640:6: lv_modifies_1_0= ruleSlangModifies
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInitializeAccess().getModifiesSlangModifiesParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_modifies_1_0=ruleSlangModifies();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getInitializeRule());
                      						}
                      						set(
                      							current,
                      							"modifies",
                      							lv_modifies_1_0,
                      							"org.sireum.aadl.gumbo.Gumbo.SlangModifies");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,Semicolon,FollowSets000.FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getInitializeAccess().getSemicolonKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalGumboParser.g:662:3: ( (lv_specs_3_0= ruleInitializeSpecStatement ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==Guarantee) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGumboParser.g:663:4: (lv_specs_3_0= ruleInitializeSpecStatement )
            	    {
            	    // InternalGumboParser.g:663:4: (lv_specs_3_0= ruleInitializeSpecStatement )
            	    // InternalGumboParser.g:664:5: lv_specs_3_0= ruleInitializeSpecStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getInitializeAccess().getSpecsInitializeSpecStatementParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_19);
            	    lv_specs_3_0=ruleInitializeSpecStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getInitializeRule());
            	      					}
            	      					add(
            	      						current,
            	      						"specs",
            	      						lv_specs_3_0,
            	      						"org.sireum.aadl.gumbo.Gumbo.InitializeSpecStatement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
    // InternalGumboParser.g:685:1: entryRuleInitializeSpecStatement returns [EObject current=null] : iv_ruleInitializeSpecStatement= ruleInitializeSpecStatement EOF ;
    public final EObject entryRuleInitializeSpecStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitializeSpecStatement = null;


        try {
            // InternalGumboParser.g:685:64: (iv_ruleInitializeSpecStatement= ruleInitializeSpecStatement EOF )
            // InternalGumboParser.g:686:2: iv_ruleInitializeSpecStatement= ruleInitializeSpecStatement EOF
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
    // InternalGumboParser.g:692:1: ruleInitializeSpecStatement returns [EObject current=null] : ( (lv_guaranteeStatement_0_0= ruleGuaranteeStatement ) ) ;
    public final EObject ruleInitializeSpecStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_guaranteeStatement_0_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:698:2: ( ( (lv_guaranteeStatement_0_0= ruleGuaranteeStatement ) ) )
            // InternalGumboParser.g:699:2: ( (lv_guaranteeStatement_0_0= ruleGuaranteeStatement ) )
            {
            // InternalGumboParser.g:699:2: ( (lv_guaranteeStatement_0_0= ruleGuaranteeStatement ) )
            // InternalGumboParser.g:700:3: (lv_guaranteeStatement_0_0= ruleGuaranteeStatement )
            {
            // InternalGumboParser.g:700:3: (lv_guaranteeStatement_0_0= ruleGuaranteeStatement )
            // InternalGumboParser.g:701:4: lv_guaranteeStatement_0_0= ruleGuaranteeStatement
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getInitializeSpecStatementAccess().getGuaranteeStatementGuaranteeStatementParserRuleCall_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_guaranteeStatement_0_0=ruleGuaranteeStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getInitializeSpecStatementRule());
              				}
              				set(
              					current,
              					"guaranteeStatement",
              					lv_guaranteeStatement_0_0,
              					"org.sireum.aadl.gumbo.Gumbo.GuaranteeStatement");
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
    // $ANTLR end "ruleInitializeSpecStatement"


    // $ANTLR start "entryRuleCompute"
    // InternalGumboParser.g:721:1: entryRuleCompute returns [EObject current=null] : iv_ruleCompute= ruleCompute EOF ;
    public final EObject entryRuleCompute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompute = null;


        try {
            // InternalGumboParser.g:721:48: (iv_ruleCompute= ruleCompute EOF )
            // InternalGumboParser.g:722:2: iv_ruleCompute= ruleCompute EOF
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
    // InternalGumboParser.g:728:1: ruleCompute returns [EObject current=null] : ( () otherlv_1= Compute ( ( (lv_modifies_2_0= ruleSlangModifies ) ) otherlv_3= Semicolon )? ( (lv_specs_4_0= ruleSpecStatement ) )* (otherlv_5= Cases ( (lv_cases_6_0= ruleCaseStatementClause ) )+ )* ( (lv_handlers_7_0= ruleHandlerClause ) )* ) ;
    public final EObject ruleCompute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_modifies_2_0 = null;

        EObject lv_specs_4_0 = null;

        EObject lv_cases_6_0 = null;

        EObject lv_handlers_7_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:734:2: ( ( () otherlv_1= Compute ( ( (lv_modifies_2_0= ruleSlangModifies ) ) otherlv_3= Semicolon )? ( (lv_specs_4_0= ruleSpecStatement ) )* (otherlv_5= Cases ( (lv_cases_6_0= ruleCaseStatementClause ) )+ )* ( (lv_handlers_7_0= ruleHandlerClause ) )* ) )
            // InternalGumboParser.g:735:2: ( () otherlv_1= Compute ( ( (lv_modifies_2_0= ruleSlangModifies ) ) otherlv_3= Semicolon )? ( (lv_specs_4_0= ruleSpecStatement ) )* (otherlv_5= Cases ( (lv_cases_6_0= ruleCaseStatementClause ) )+ )* ( (lv_handlers_7_0= ruleHandlerClause ) )* )
            {
            // InternalGumboParser.g:735:2: ( () otherlv_1= Compute ( ( (lv_modifies_2_0= ruleSlangModifies ) ) otherlv_3= Semicolon )? ( (lv_specs_4_0= ruleSpecStatement ) )* (otherlv_5= Cases ( (lv_cases_6_0= ruleCaseStatementClause ) )+ )* ( (lv_handlers_7_0= ruleHandlerClause ) )* )
            // InternalGumboParser.g:736:3: () otherlv_1= Compute ( ( (lv_modifies_2_0= ruleSlangModifies ) ) otherlv_3= Semicolon )? ( (lv_specs_4_0= ruleSpecStatement ) )* (otherlv_5= Cases ( (lv_cases_6_0= ruleCaseStatementClause ) )+ )* ( (lv_handlers_7_0= ruleHandlerClause ) )*
            {
            // InternalGumboParser.g:736:3: ()
            // InternalGumboParser.g:737:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getComputeAccess().getComputeAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Compute,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getComputeAccess().getComputeKeyword_1());
              		
            }
            // InternalGumboParser.g:750:3: ( ( (lv_modifies_2_0= ruleSlangModifies ) ) otherlv_3= Semicolon )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Modifies) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGumboParser.g:751:4: ( (lv_modifies_2_0= ruleSlangModifies ) ) otherlv_3= Semicolon
                    {
                    // InternalGumboParser.g:751:4: ( (lv_modifies_2_0= ruleSlangModifies ) )
                    // InternalGumboParser.g:752:5: (lv_modifies_2_0= ruleSlangModifies )
                    {
                    // InternalGumboParser.g:752:5: (lv_modifies_2_0= ruleSlangModifies )
                    // InternalGumboParser.g:753:6: lv_modifies_2_0= ruleSlangModifies
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getComputeAccess().getModifiesSlangModifiesParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_modifies_2_0=ruleSlangModifies();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getComputeRule());
                      						}
                      						set(
                      							current,
                      							"modifies",
                      							lv_modifies_2_0,
                      							"org.sireum.aadl.gumbo.Gumbo.SlangModifies");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,Semicolon,FollowSets000.FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getComputeAccess().getSemicolonKeyword_2_1());
                      			
                    }

                    }
                    break;

            }

            // InternalGumboParser.g:775:3: ( (lv_specs_4_0= ruleSpecStatement ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==Guarantee||LA15_0==Assume) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGumboParser.g:776:4: (lv_specs_4_0= ruleSpecStatement )
            	    {
            	    // InternalGumboParser.g:776:4: (lv_specs_4_0= ruleSpecStatement )
            	    // InternalGumboParser.g:777:5: lv_specs_4_0= ruleSpecStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getComputeAccess().getSpecsSpecStatementParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    lv_specs_4_0=ruleSpecStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getComputeRule());
            	      					}
            	      					add(
            	      						current,
            	      						"specs",
            	      						lv_specs_4_0,
            	      						"org.sireum.aadl.gumbo.Gumbo.SpecStatement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // InternalGumboParser.g:794:3: (otherlv_5= Cases ( (lv_cases_6_0= ruleCaseStatementClause ) )+ )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==Cases) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGumboParser.g:795:4: otherlv_5= Cases ( (lv_cases_6_0= ruleCaseStatementClause ) )+
            	    {
            	    otherlv_5=(Token)match(input,Cases,FollowSets000.FOLLOW_22); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getComputeAccess().getCasesKeyword_4_0());
            	      			
            	    }
            	    // InternalGumboParser.g:799:4: ( (lv_cases_6_0= ruleCaseStatementClause ) )+
            	    int cnt16=0;
            	    loop16:
            	    do {
            	        int alt16=2;
            	        int LA16_0 = input.LA(1);

            	        if ( (LA16_0==Case) ) {
            	            alt16=1;
            	        }


            	        switch (alt16) {
            	    	case 1 :
            	    	    // InternalGumboParser.g:800:5: (lv_cases_6_0= ruleCaseStatementClause )
            	    	    {
            	    	    // InternalGumboParser.g:800:5: (lv_cases_6_0= ruleCaseStatementClause )
            	    	    // InternalGumboParser.g:801:6: lv_cases_6_0= ruleCaseStatementClause
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      						newCompositeNode(grammarAccess.getComputeAccess().getCasesCaseStatementClauseParserRuleCall_4_1_0());
            	    	      					
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_23);
            	    	    lv_cases_6_0=ruleCaseStatementClause();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      						if (current==null) {
            	    	      							current = createModelElementForParent(grammarAccess.getComputeRule());
            	    	      						}
            	    	      						add(
            	    	      							current,
            	    	      							"cases",
            	    	      							lv_cases_6_0,
            	    	      							"org.sireum.aadl.gumbo.Gumbo.CaseStatementClause");
            	    	      						afterParserOrEnumRuleCall();
            	    	      					
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt16 >= 1 ) break loop16;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(16, input);
            	                throw eee;
            	        }
            	        cnt16++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // InternalGumboParser.g:819:3: ( (lv_handlers_7_0= ruleHandlerClause ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==Handle) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalGumboParser.g:820:4: (lv_handlers_7_0= ruleHandlerClause )
            	    {
            	    // InternalGumboParser.g:820:4: (lv_handlers_7_0= ruleHandlerClause )
            	    // InternalGumboParser.g:821:5: lv_handlers_7_0= ruleHandlerClause
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getComputeAccess().getHandlersHandlerClauseParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_24);
            	    lv_handlers_7_0=ruleHandlerClause();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getComputeRule());
            	      					}
            	      					add(
            	      						current,
            	      						"handlers",
            	      						lv_handlers_7_0,
            	      						"org.sireum.aadl.gumbo.Gumbo.HandlerClause");
            	      					afterParserOrEnumRuleCall();
            	      				
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
    // $ANTLR end "ruleCompute"


    // $ANTLR start "entryRuleHandlerClause"
    // InternalGumboParser.g:842:1: entryRuleHandlerClause returns [EObject current=null] : iv_ruleHandlerClause= ruleHandlerClause EOF ;
    public final EObject entryRuleHandlerClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHandlerClause = null;


        try {
            // InternalGumboParser.g:842:54: (iv_ruleHandlerClause= ruleHandlerClause EOF )
            // InternalGumboParser.g:843:2: iv_ruleHandlerClause= ruleHandlerClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHandlerClauseRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleHandlerClause=ruleHandlerClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHandlerClause; 
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
    // $ANTLR end "entryRuleHandlerClause"


    // $ANTLR start "ruleHandlerClause"
    // InternalGumboParser.g:849:1: ruleHandlerClause returns [EObject current=null] : (otherlv_0= Handle ( (otherlv_1= RULE_ID ) ) otherlv_2= Colon ( ( (lv_modifies_3_0= ruleSlangModifies ) ) otherlv_4= Semicolon )? ( (lv_guarantees_5_0= ruleGuaranteeStatement ) )+ ) ;
    public final EObject ruleHandlerClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_modifies_3_0 = null;

        EObject lv_guarantees_5_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:855:2: ( (otherlv_0= Handle ( (otherlv_1= RULE_ID ) ) otherlv_2= Colon ( ( (lv_modifies_3_0= ruleSlangModifies ) ) otherlv_4= Semicolon )? ( (lv_guarantees_5_0= ruleGuaranteeStatement ) )+ ) )
            // InternalGumboParser.g:856:2: (otherlv_0= Handle ( (otherlv_1= RULE_ID ) ) otherlv_2= Colon ( ( (lv_modifies_3_0= ruleSlangModifies ) ) otherlv_4= Semicolon )? ( (lv_guarantees_5_0= ruleGuaranteeStatement ) )+ )
            {
            // InternalGumboParser.g:856:2: (otherlv_0= Handle ( (otherlv_1= RULE_ID ) ) otherlv_2= Colon ( ( (lv_modifies_3_0= ruleSlangModifies ) ) otherlv_4= Semicolon )? ( (lv_guarantees_5_0= ruleGuaranteeStatement ) )+ )
            // InternalGumboParser.g:857:3: otherlv_0= Handle ( (otherlv_1= RULE_ID ) ) otherlv_2= Colon ( ( (lv_modifies_3_0= ruleSlangModifies ) ) otherlv_4= Semicolon )? ( (lv_guarantees_5_0= ruleGuaranteeStatement ) )+
            {
            otherlv_0=(Token)match(input,Handle,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getHandlerClauseAccess().getHandleKeyword_0());
              		
            }
            // InternalGumboParser.g:861:3: ( (otherlv_1= RULE_ID ) )
            // InternalGumboParser.g:862:4: (otherlv_1= RULE_ID )
            {
            // InternalGumboParser.g:862:4: (otherlv_1= RULE_ID )
            // InternalGumboParser.g:863:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getHandlerClauseRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getHandlerClauseAccess().getIdPortCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,Colon,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getHandlerClauseAccess().getColonKeyword_2());
              		
            }
            // InternalGumboParser.g:881:3: ( ( (lv_modifies_3_0= ruleSlangModifies ) ) otherlv_4= Semicolon )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Modifies) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalGumboParser.g:882:4: ( (lv_modifies_3_0= ruleSlangModifies ) ) otherlv_4= Semicolon
                    {
                    // InternalGumboParser.g:882:4: ( (lv_modifies_3_0= ruleSlangModifies ) )
                    // InternalGumboParser.g:883:5: (lv_modifies_3_0= ruleSlangModifies )
                    {
                    // InternalGumboParser.g:883:5: (lv_modifies_3_0= ruleSlangModifies )
                    // InternalGumboParser.g:884:6: lv_modifies_3_0= ruleSlangModifies
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getHandlerClauseAccess().getModifiesSlangModifiesParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_modifies_3_0=ruleSlangModifies();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getHandlerClauseRule());
                      						}
                      						set(
                      							current,
                      							"modifies",
                      							lv_modifies_3_0,
                      							"org.sireum.aadl.gumbo.Gumbo.SlangModifies");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,Semicolon,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getHandlerClauseAccess().getSemicolonKeyword_3_1());
                      			
                    }

                    }
                    break;

            }

            // InternalGumboParser.g:906:3: ( (lv_guarantees_5_0= ruleGuaranteeStatement ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==Guarantee) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalGumboParser.g:907:4: (lv_guarantees_5_0= ruleGuaranteeStatement )
            	    {
            	    // InternalGumboParser.g:907:4: (lv_guarantees_5_0= ruleGuaranteeStatement )
            	    // InternalGumboParser.g:908:5: lv_guarantees_5_0= ruleGuaranteeStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getHandlerClauseAccess().getGuaranteesGuaranteeStatementParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_17);
            	    lv_guarantees_5_0=ruleGuaranteeStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getHandlerClauseRule());
            	      					}
            	      					add(
            	      						current,
            	      						"guarantees",
            	      						lv_guarantees_5_0,
            	      						"org.sireum.aadl.gumbo.Gumbo.GuaranteeStatement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
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
    // $ANTLR end "ruleHandlerClause"


    // $ANTLR start "entryRuleCaseStatementClause"
    // InternalGumboParser.g:929:1: entryRuleCaseStatementClause returns [EObject current=null] : iv_ruleCaseStatementClause= ruleCaseStatementClause EOF ;
    public final EObject entryRuleCaseStatementClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseStatementClause = null;


        try {
            // InternalGumboParser.g:929:60: (iv_ruleCaseStatementClause= ruleCaseStatementClause EOF )
            // InternalGumboParser.g:930:2: iv_ruleCaseStatementClause= ruleCaseStatementClause EOF
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
    // InternalGumboParser.g:936:1: ruleCaseStatementClause returns [EObject current=null] : (otherlv_0= Case ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_assumeStatement_4_0= ruleAnonAssumeStatement ) ) ( (lv_guaranteeStatement_5_0= ruleAnonGuaranteeStatement ) ) ) ;
    public final EObject ruleCaseStatementClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token lv_descriptor_2_0=null;
        Token otherlv_3=null;
        EObject lv_assumeStatement_4_0 = null;

        EObject lv_guaranteeStatement_5_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:942:2: ( (otherlv_0= Case ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_assumeStatement_4_0= ruleAnonAssumeStatement ) ) ( (lv_guaranteeStatement_5_0= ruleAnonGuaranteeStatement ) ) ) )
            // InternalGumboParser.g:943:2: (otherlv_0= Case ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_assumeStatement_4_0= ruleAnonAssumeStatement ) ) ( (lv_guaranteeStatement_5_0= ruleAnonGuaranteeStatement ) ) )
            {
            // InternalGumboParser.g:943:2: (otherlv_0= Case ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_assumeStatement_4_0= ruleAnonAssumeStatement ) ) ( (lv_guaranteeStatement_5_0= ruleAnonGuaranteeStatement ) ) )
            // InternalGumboParser.g:944:3: otherlv_0= Case ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_assumeStatement_4_0= ruleAnonAssumeStatement ) ) ( (lv_guaranteeStatement_5_0= ruleAnonGuaranteeStatement ) )
            {
            otherlv_0=(Token)match(input,Case,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCaseStatementClauseAccess().getCaseKeyword_0());
              		
            }
            // InternalGumboParser.g:948:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalGumboParser.g:949:4: (lv_id_1_0= RULE_ID )
            {
            // InternalGumboParser.g:949:4: (lv_id_1_0= RULE_ID )
            // InternalGumboParser.g:950:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_id_1_0, grammarAccess.getCaseStatementClauseAccess().getIdIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCaseStatementClauseRule());
              					}
              					setWithLastConsumed(
              						current,
              						"id",
              						lv_id_1_0,
              						"org.osate.xtext.aadl2.properties.Properties.ID");
              				
            }

            }


            }

            // InternalGumboParser.g:966:3: ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_SLANG_STRING) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalGumboParser.g:967:4: (lv_descriptor_2_0= RULE_SLANG_STRING )
                    {
                    // InternalGumboParser.g:967:4: (lv_descriptor_2_0= RULE_SLANG_STRING )
                    // InternalGumboParser.g:968:5: lv_descriptor_2_0= RULE_SLANG_STRING
                    {
                    lv_descriptor_2_0=(Token)match(input,RULE_SLANG_STRING,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_descriptor_2_0, grammarAccess.getCaseStatementClauseAccess().getDescriptorSLANG_STRINGTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getCaseStatementClauseRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"descriptor",
                      						lv_descriptor_2_0,
                      						"org.sireum.aadl.gumbo.Gumbo.SLANG_STRING");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,Colon,FollowSets000.FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getCaseStatementClauseAccess().getColonKeyword_3());
              		
            }
            // InternalGumboParser.g:988:3: ( (lv_assumeStatement_4_0= ruleAnonAssumeStatement ) )
            // InternalGumboParser.g:989:4: (lv_assumeStatement_4_0= ruleAnonAssumeStatement )
            {
            // InternalGumboParser.g:989:4: (lv_assumeStatement_4_0= ruleAnonAssumeStatement )
            // InternalGumboParser.g:990:5: lv_assumeStatement_4_0= ruleAnonAssumeStatement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCaseStatementClauseAccess().getAssumeStatementAnonAssumeStatementParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_26);
            lv_assumeStatement_4_0=ruleAnonAssumeStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCaseStatementClauseRule());
              					}
              					set(
              						current,
              						"assumeStatement",
              						lv_assumeStatement_4_0,
              						"org.sireum.aadl.gumbo.Gumbo.AnonAssumeStatement");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumboParser.g:1007:3: ( (lv_guaranteeStatement_5_0= ruleAnonGuaranteeStatement ) )
            // InternalGumboParser.g:1008:4: (lv_guaranteeStatement_5_0= ruleAnonGuaranteeStatement )
            {
            // InternalGumboParser.g:1008:4: (lv_guaranteeStatement_5_0= ruleAnonGuaranteeStatement )
            // InternalGumboParser.g:1009:5: lv_guaranteeStatement_5_0= ruleAnonGuaranteeStatement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCaseStatementClauseAccess().getGuaranteeStatementAnonGuaranteeStatementParserRuleCall_5_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_guaranteeStatement_5_0=ruleAnonGuaranteeStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCaseStatementClauseRule());
              					}
              					set(
              						current,
              						"guaranteeStatement",
              						lv_guaranteeStatement_5_0,
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
    // InternalGumboParser.g:1030:1: entryRuleSpecStatement returns [EObject current=null] : iv_ruleSpecStatement= ruleSpecStatement EOF ;
    public final EObject entryRuleSpecStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecStatement = null;


        try {
            // InternalGumboParser.g:1030:54: (iv_ruleSpecStatement= ruleSpecStatement EOF )
            // InternalGumboParser.g:1031:2: iv_ruleSpecStatement= ruleSpecStatement EOF
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
    // InternalGumboParser.g:1037:1: ruleSpecStatement returns [EObject current=null] : (this_AssumeStatement_0= ruleAssumeStatement | this_GuaranteeStatement_1= ruleGuaranteeStatement ) ;
    public final EObject ruleSpecStatement() throws RecognitionException {
        EObject current = null;

        EObject this_AssumeStatement_0 = null;

        EObject this_GuaranteeStatement_1 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1043:2: ( (this_AssumeStatement_0= ruleAssumeStatement | this_GuaranteeStatement_1= ruleGuaranteeStatement ) )
            // InternalGumboParser.g:1044:2: (this_AssumeStatement_0= ruleAssumeStatement | this_GuaranteeStatement_1= ruleGuaranteeStatement )
            {
            // InternalGumboParser.g:1044:2: (this_AssumeStatement_0= ruleAssumeStatement | this_GuaranteeStatement_1= ruleGuaranteeStatement )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Assume) ) {
                alt22=1;
            }
            else if ( (LA22_0==Guarantee) ) {
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
                    // InternalGumboParser.g:1045:3: this_AssumeStatement_0= ruleAssumeStatement
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
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
                    // InternalGumboParser.g:1057:3: this_GuaranteeStatement_1= ruleGuaranteeStatement
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
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
    // InternalGumboParser.g:1072:1: entryRuleAssumeStatement returns [EObject current=null] : iv_ruleAssumeStatement= ruleAssumeStatement EOF ;
    public final EObject entryRuleAssumeStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssumeStatement = null;


        try {
            // InternalGumboParser.g:1072:56: (iv_ruleAssumeStatement= ruleAssumeStatement EOF )
            // InternalGumboParser.g:1073:2: iv_ruleAssumeStatement= ruleAssumeStatement EOF
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
    // InternalGumboParser.g:1079:1: ruleAssumeStatement returns [EObject current=null] : (otherlv_0= Assume ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= Semicolon ) ;
    public final EObject ruleAssumeStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token lv_descriptor_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_expr_4_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1085:2: ( (otherlv_0= Assume ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= Semicolon ) )
            // InternalGumboParser.g:1086:2: (otherlv_0= Assume ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= Semicolon )
            {
            // InternalGumboParser.g:1086:2: (otherlv_0= Assume ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= Semicolon )
            // InternalGumboParser.g:1087:3: otherlv_0= Assume ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= Semicolon
            {
            otherlv_0=(Token)match(input,Assume,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAssumeStatementAccess().getAssumeKeyword_0());
              		
            }
            // InternalGumboParser.g:1091:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalGumboParser.g:1092:4: (lv_id_1_0= RULE_ID )
            {
            // InternalGumboParser.g:1092:4: (lv_id_1_0= RULE_ID )
            // InternalGumboParser.g:1093:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_id_1_0, grammarAccess.getAssumeStatementAccess().getIdIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAssumeStatementRule());
              					}
              					setWithLastConsumed(
              						current,
              						"id",
              						lv_id_1_0,
              						"org.osate.xtext.aadl2.properties.Properties.ID");
              				
            }

            }


            }

            // InternalGumboParser.g:1109:3: ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_SLANG_STRING) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalGumboParser.g:1110:4: (lv_descriptor_2_0= RULE_SLANG_STRING )
                    {
                    // InternalGumboParser.g:1110:4: (lv_descriptor_2_0= RULE_SLANG_STRING )
                    // InternalGumboParser.g:1111:5: lv_descriptor_2_0= RULE_SLANG_STRING
                    {
                    lv_descriptor_2_0=(Token)match(input,RULE_SLANG_STRING,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_descriptor_2_0, grammarAccess.getAssumeStatementAccess().getDescriptorSLANG_STRINGTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getAssumeStatementRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"descriptor",
                      						lv_descriptor_2_0,
                      						"org.sireum.aadl.gumbo.Gumbo.SLANG_STRING");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,Colon,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getAssumeStatementAccess().getColonKeyword_3());
              		
            }
            // InternalGumboParser.g:1131:3: ( (lv_expr_4_0= ruleExpr ) )
            // InternalGumboParser.g:1132:4: (lv_expr_4_0= ruleExpr )
            {
            // InternalGumboParser.g:1132:4: (lv_expr_4_0= ruleExpr )
            // InternalGumboParser.g:1133:5: lv_expr_4_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssumeStatementAccess().getExprExprParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_11);
            lv_expr_4_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAssumeStatementRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_4_0,
              						"org.sireum.aadl.gumbo.Gumbo.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,Semicolon,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getAssumeStatementAccess().getSemicolonKeyword_5());
              		
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
    // InternalGumboParser.g:1158:1: entryRuleAnonAssumeStatement returns [EObject current=null] : iv_ruleAnonAssumeStatement= ruleAnonAssumeStatement EOF ;
    public final EObject entryRuleAnonAssumeStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnonAssumeStatement = null;


        try {
            // InternalGumboParser.g:1158:60: (iv_ruleAnonAssumeStatement= ruleAnonAssumeStatement EOF )
            // InternalGumboParser.g:1159:2: iv_ruleAnonAssumeStatement= ruleAnonAssumeStatement EOF
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
    // InternalGumboParser.g:1165:1: ruleAnonAssumeStatement returns [EObject current=null] : (otherlv_0= Assume ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon ) ;
    public final EObject ruleAnonAssumeStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1171:2: ( (otherlv_0= Assume ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon ) )
            // InternalGumboParser.g:1172:2: (otherlv_0= Assume ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon )
            {
            // InternalGumboParser.g:1172:2: (otherlv_0= Assume ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon )
            // InternalGumboParser.g:1173:3: otherlv_0= Assume ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon
            {
            otherlv_0=(Token)match(input,Assume,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAnonAssumeStatementAccess().getAssumeKeyword_0());
              		
            }
            // InternalGumboParser.g:1177:3: ( (lv_expr_1_0= ruleExpr ) )
            // InternalGumboParser.g:1178:4: (lv_expr_1_0= ruleExpr )
            {
            // InternalGumboParser.g:1178:4: (lv_expr_1_0= ruleExpr )
            // InternalGumboParser.g:1179:5: lv_expr_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAnonAssumeStatementAccess().getExprExprParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_11);
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
    // InternalGumboParser.g:1204:1: entryRuleGuaranteeStatement returns [EObject current=null] : iv_ruleGuaranteeStatement= ruleGuaranteeStatement EOF ;
    public final EObject entryRuleGuaranteeStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuaranteeStatement = null;


        try {
            // InternalGumboParser.g:1204:59: (iv_ruleGuaranteeStatement= ruleGuaranteeStatement EOF )
            // InternalGumboParser.g:1205:2: iv_ruleGuaranteeStatement= ruleGuaranteeStatement EOF
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
    // InternalGumboParser.g:1211:1: ruleGuaranteeStatement returns [EObject current=null] : (otherlv_0= Guarantee ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= Semicolon ) ;
    public final EObject ruleGuaranteeStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token lv_descriptor_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_expr_4_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1217:2: ( (otherlv_0= Guarantee ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= Semicolon ) )
            // InternalGumboParser.g:1218:2: (otherlv_0= Guarantee ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= Semicolon )
            {
            // InternalGumboParser.g:1218:2: (otherlv_0= Guarantee ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= Semicolon )
            // InternalGumboParser.g:1219:3: otherlv_0= Guarantee ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= Semicolon
            {
            otherlv_0=(Token)match(input,Guarantee,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGuaranteeStatementAccess().getGuaranteeKeyword_0());
              		
            }
            // InternalGumboParser.g:1223:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalGumboParser.g:1224:4: (lv_id_1_0= RULE_ID )
            {
            // InternalGumboParser.g:1224:4: (lv_id_1_0= RULE_ID )
            // InternalGumboParser.g:1225:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_id_1_0, grammarAccess.getGuaranteeStatementAccess().getIdIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGuaranteeStatementRule());
              					}
              					setWithLastConsumed(
              						current,
              						"id",
              						lv_id_1_0,
              						"org.osate.xtext.aadl2.properties.Properties.ID");
              				
            }

            }


            }

            // InternalGumboParser.g:1241:3: ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_SLANG_STRING) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalGumboParser.g:1242:4: (lv_descriptor_2_0= RULE_SLANG_STRING )
                    {
                    // InternalGumboParser.g:1242:4: (lv_descriptor_2_0= RULE_SLANG_STRING )
                    // InternalGumboParser.g:1243:5: lv_descriptor_2_0= RULE_SLANG_STRING
                    {
                    lv_descriptor_2_0=(Token)match(input,RULE_SLANG_STRING,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_descriptor_2_0, grammarAccess.getGuaranteeStatementAccess().getDescriptorSLANG_STRINGTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getGuaranteeStatementRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"descriptor",
                      						lv_descriptor_2_0,
                      						"org.sireum.aadl.gumbo.Gumbo.SLANG_STRING");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,Colon,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGuaranteeStatementAccess().getColonKeyword_3());
              		
            }
            // InternalGumboParser.g:1263:3: ( (lv_expr_4_0= ruleExpr ) )
            // InternalGumboParser.g:1264:4: (lv_expr_4_0= ruleExpr )
            {
            // InternalGumboParser.g:1264:4: (lv_expr_4_0= ruleExpr )
            // InternalGumboParser.g:1265:5: lv_expr_4_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGuaranteeStatementAccess().getExprExprParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_11);
            lv_expr_4_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGuaranteeStatementRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_4_0,
              						"org.sireum.aadl.gumbo.Gumbo.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,Semicolon,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGuaranteeStatementAccess().getSemicolonKeyword_5());
              		
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
    // InternalGumboParser.g:1290:1: entryRuleAnonGuaranteeStatement returns [EObject current=null] : iv_ruleAnonGuaranteeStatement= ruleAnonGuaranteeStatement EOF ;
    public final EObject entryRuleAnonGuaranteeStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnonGuaranteeStatement = null;


        try {
            // InternalGumboParser.g:1290:63: (iv_ruleAnonGuaranteeStatement= ruleAnonGuaranteeStatement EOF )
            // InternalGumboParser.g:1291:2: iv_ruleAnonGuaranteeStatement= ruleAnonGuaranteeStatement EOF
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
    // InternalGumboParser.g:1297:1: ruleAnonGuaranteeStatement returns [EObject current=null] : (otherlv_0= Guarantee ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon ) ;
    public final EObject ruleAnonGuaranteeStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1303:2: ( (otherlv_0= Guarantee ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon ) )
            // InternalGumboParser.g:1304:2: (otherlv_0= Guarantee ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon )
            {
            // InternalGumboParser.g:1304:2: (otherlv_0= Guarantee ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon )
            // InternalGumboParser.g:1305:3: otherlv_0= Guarantee ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon
            {
            otherlv_0=(Token)match(input,Guarantee,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAnonGuaranteeStatementAccess().getGuaranteeKeyword_0());
              		
            }
            // InternalGumboParser.g:1309:3: ( (lv_expr_1_0= ruleExpr ) )
            // InternalGumboParser.g:1310:4: (lv_expr_1_0= ruleExpr )
            {
            // InternalGumboParser.g:1310:4: (lv_expr_1_0= ruleExpr )
            // InternalGumboParser.g:1311:5: lv_expr_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAnonGuaranteeStatementAccess().getExprExprParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_11);
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


    // $ANTLR start "entryRuleOtherDataRef"
    // InternalGumboParser.g:1336:1: entryRuleOtherDataRef returns [EObject current=null] : iv_ruleOtherDataRef= ruleOtherDataRef EOF ;
    public final EObject entryRuleOtherDataRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOtherDataRef = null;


        try {
            // InternalGumboParser.g:1336:53: (iv_ruleOtherDataRef= ruleOtherDataRef EOF )
            // InternalGumboParser.g:1337:2: iv_ruleOtherDataRef= ruleOtherDataRef EOF
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
    // InternalGumboParser.g:1343:1: ruleOtherDataRef returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleOtherDataRef ) ) )? ) ;
    public final EObject ruleOtherDataRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_arrayRange_1_0 = null;

        EObject lv_path_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1349:2: ( ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleOtherDataRef ) ) )? ) )
            // InternalGumboParser.g:1350:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleOtherDataRef ) ) )? )
            {
            // InternalGumboParser.g:1350:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleOtherDataRef ) ) )? )
            // InternalGumboParser.g:1351:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleOtherDataRef ) ) )?
            {
            // InternalGumboParser.g:1351:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* )
            // InternalGumboParser.g:1352:4: ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )*
            {
            // InternalGumboParser.g:1352:4: ( (otherlv_0= RULE_ID ) )
            // InternalGumboParser.g:1353:5: (otherlv_0= RULE_ID )
            {
            // InternalGumboParser.g:1353:5: (otherlv_0= RULE_ID )
            // InternalGumboParser.g:1354:6: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              						/* */
              					
            }
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElement(grammarAccess.getOtherDataRefRule());
              						}
              					
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						newLeafNode(otherlv_0, grammarAccess.getOtherDataRefAccess().getNamedElementNamedElementCrossReference_0_0_0());
              					
            }

            }


            }

            // InternalGumboParser.g:1368:4: ( (lv_arrayRange_1_0= ruleArrayRange ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==LeftSquareBracket) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalGumboParser.g:1369:5: (lv_arrayRange_1_0= ruleArrayRange )
            	    {
            	    // InternalGumboParser.g:1369:5: (lv_arrayRange_1_0= ruleArrayRange )
            	    // InternalGumboParser.g:1370:6: lv_arrayRange_1_0= ruleArrayRange
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOtherDataRefAccess().getArrayRangeArrayRangeParserRuleCall_0_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_27);
            	    lv_arrayRange_1_0=ruleArrayRange();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getOtherDataRefRule());
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
            	    break loop25;
                }
            } while (true);


            }

            // InternalGumboParser.g:1388:3: (otherlv_2= FullStop ( (lv_path_3_0= ruleOtherDataRef ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==FullStop) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==RULE_ID) ) {
                    int LA26_3 = input.LA(3);

                    if ( (synpred26_InternalGumboParser()) ) {
                        alt26=1;
                    }
                }
            }
            switch (alt26) {
                case 1 :
                    // InternalGumboParser.g:1389:4: otherlv_2= FullStop ( (lv_path_3_0= ruleOtherDataRef ) )
                    {
                    otherlv_2=(Token)match(input,FullStop,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getOtherDataRefAccess().getFullStopKeyword_1_0());
                      			
                    }
                    // InternalGumboParser.g:1393:4: ( (lv_path_3_0= ruleOtherDataRef ) )
                    // InternalGumboParser.g:1394:5: (lv_path_3_0= ruleOtherDataRef )
                    {
                    // InternalGumboParser.g:1394:5: (lv_path_3_0= ruleOtherDataRef )
                    // InternalGumboParser.g:1395:6: lv_path_3_0= ruleOtherDataRef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOtherDataRefAccess().getPathOtherDataRefParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_path_3_0=ruleOtherDataRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOtherDataRefRule());
                      						}
                      						set(
                      							current,
                      							"path",
                      							lv_path_3_0,
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
    // InternalGumboParser.g:1417:1: entryRuleDataElement returns [EObject current=null] : iv_ruleDataElement= ruleDataElement EOF ;
    public final EObject entryRuleDataElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataElement = null;


        try {
            // InternalGumboParser.g:1417:52: (iv_ruleDataElement= ruleDataElement EOF )
            // InternalGumboParser.g:1418:2: iv_ruleDataElement= ruleDataElement EOF
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
    // InternalGumboParser.g:1424:1: ruleDataElement returns [EObject current=null] : ( ( ruleQCREF ) ) ;
    public final EObject ruleDataElement() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalGumboParser.g:1430:2: ( ( ( ruleQCREF ) ) )
            // InternalGumboParser.g:1431:2: ( ( ruleQCREF ) )
            {
            // InternalGumboParser.g:1431:2: ( ( ruleQCREF ) )
            // InternalGumboParser.g:1432:3: ( ruleQCREF )
            {
            // InternalGumboParser.g:1432:3: ( ruleQCREF )
            // InternalGumboParser.g:1433:4: ruleQCREF
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
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


    // $ANTLR start "entryRuleFunctions"
    // InternalGumboParser.g:1453:1: entryRuleFunctions returns [EObject current=null] : iv_ruleFunctions= ruleFunctions EOF ;
    public final EObject entryRuleFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctions = null;


        try {
            // InternalGumboParser.g:1453:50: (iv_ruleFunctions= ruleFunctions EOF )
            // InternalGumboParser.g:1454:2: iv_ruleFunctions= ruleFunctions EOF
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
    // InternalGumboParser.g:1460:1: ruleFunctions returns [EObject current=null] : (otherlv_0= Functions ( (lv_specs_1_0= ruleFuncSpec ) )+ ) ;
    public final EObject ruleFunctions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_specs_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1466:2: ( (otherlv_0= Functions ( (lv_specs_1_0= ruleFuncSpec ) )+ ) )
            // InternalGumboParser.g:1467:2: (otherlv_0= Functions ( (lv_specs_1_0= ruleFuncSpec ) )+ )
            {
            // InternalGumboParser.g:1467:2: (otherlv_0= Functions ( (lv_specs_1_0= ruleFuncSpec ) )+ )
            // InternalGumboParser.g:1468:3: otherlv_0= Functions ( (lv_specs_1_0= ruleFuncSpec ) )+
            {
            otherlv_0=(Token)match(input,Functions,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunctionsAccess().getFunctionsKeyword_0());
              		
            }
            // InternalGumboParser.g:1472:3: ( (lv_specs_1_0= ruleFuncSpec ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==Strictpure||LA27_0==Def) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalGumboParser.g:1473:4: (lv_specs_1_0= ruleFuncSpec )
            	    {
            	    // InternalGumboParser.g:1473:4: (lv_specs_1_0= ruleFuncSpec )
            	    // InternalGumboParser.g:1474:5: lv_specs_1_0= ruleFuncSpec
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getFunctionsAccess().getSpecsFuncSpecParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_29);
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
            	    if ( cnt27 >= 1 ) break loop27;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
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
    // InternalGumboParser.g:1495:1: entryRuleFuncSpec returns [EObject current=null] : iv_ruleFuncSpec= ruleFuncSpec EOF ;
    public final EObject entryRuleFuncSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncSpec = null;


        try {
            // InternalGumboParser.g:1495:49: (iv_ruleFuncSpec= ruleFuncSpec EOF )
            // InternalGumboParser.g:1496:2: iv_ruleFuncSpec= ruleFuncSpec EOF
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
    // InternalGumboParser.g:1502:1: ruleFuncSpec returns [EObject current=null] : (this_SlangDefDef_0= ruleSlangDefDef otherlv_1= Semicolon ) ;
    public final EObject ruleFuncSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_SlangDefDef_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1508:2: ( (this_SlangDefDef_0= ruleSlangDefDef otherlv_1= Semicolon ) )
            // InternalGumboParser.g:1509:2: (this_SlangDefDef_0= ruleSlangDefDef otherlv_1= Semicolon )
            {
            // InternalGumboParser.g:1509:2: (this_SlangDefDef_0= ruleSlangDefDef otherlv_1= Semicolon )
            // InternalGumboParser.g:1510:3: this_SlangDefDef_0= ruleSlangDefDef otherlv_1= Semicolon
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFuncSpecAccess().getSlangDefDefParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_11);
            this_SlangDefDef_0=ruleSlangDefDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SlangDefDef_0;
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


    // $ANTLR start "entryRuleSlangDefDecl"
    // InternalGumboParser.g:1529:1: entryRuleSlangDefDecl returns [EObject current=null] : iv_ruleSlangDefDecl= ruleSlangDefDecl EOF ;
    public final EObject entryRuleSlangDefDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangDefDecl = null;


        try {
            // InternalGumboParser.g:1529:53: (iv_ruleSlangDefDecl= ruleSlangDefDecl EOF )
            // InternalGumboParser.g:1530:2: iv_ruleSlangDefDecl= ruleSlangDefDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlangDefDeclRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlangDefDecl=ruleSlangDefDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlangDefDecl; 
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
    // $ANTLR end "entryRuleSlangDefDecl"


    // $ANTLR start "ruleSlangDefDecl"
    // InternalGumboParser.g:1536:1: ruleSlangDefDecl returns [EObject current=null] : (otherlv_0= Def ( ruleSlangDefMods )? ( (lv_sde_2_0= ruleSlangDefExt ) )? ( (lv_name_3_0= ruleSlangDefID ) ) ( (lv_typeParams_4_0= ruleSlangTypeParams ) )? ( (lv_params_5_0= ruleSlangDefParams ) )? otherlv_6= Colon ( (lv_type_7_0= ruleSlangType ) ) ( (lv_c_8_0= ruleSlangDefContract ) )? ) ;
    public final EObject ruleSlangDefDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_6=null;
        EObject lv_sde_2_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_typeParams_4_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_type_7_0 = null;

        EObject lv_c_8_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1542:2: ( (otherlv_0= Def ( ruleSlangDefMods )? ( (lv_sde_2_0= ruleSlangDefExt ) )? ( (lv_name_3_0= ruleSlangDefID ) ) ( (lv_typeParams_4_0= ruleSlangTypeParams ) )? ( (lv_params_5_0= ruleSlangDefParams ) )? otherlv_6= Colon ( (lv_type_7_0= ruleSlangType ) ) ( (lv_c_8_0= ruleSlangDefContract ) )? ) )
            // InternalGumboParser.g:1543:2: (otherlv_0= Def ( ruleSlangDefMods )? ( (lv_sde_2_0= ruleSlangDefExt ) )? ( (lv_name_3_0= ruleSlangDefID ) ) ( (lv_typeParams_4_0= ruleSlangTypeParams ) )? ( (lv_params_5_0= ruleSlangDefParams ) )? otherlv_6= Colon ( (lv_type_7_0= ruleSlangType ) ) ( (lv_c_8_0= ruleSlangDefContract ) )? )
            {
            // InternalGumboParser.g:1543:2: (otherlv_0= Def ( ruleSlangDefMods )? ( (lv_sde_2_0= ruleSlangDefExt ) )? ( (lv_name_3_0= ruleSlangDefID ) ) ( (lv_typeParams_4_0= ruleSlangTypeParams ) )? ( (lv_params_5_0= ruleSlangDefParams ) )? otherlv_6= Colon ( (lv_type_7_0= ruleSlangType ) ) ( (lv_c_8_0= ruleSlangDefContract ) )? )
            // InternalGumboParser.g:1544:3: otherlv_0= Def ( ruleSlangDefMods )? ( (lv_sde_2_0= ruleSlangDefExt ) )? ( (lv_name_3_0= ruleSlangDefID ) ) ( (lv_typeParams_4_0= ruleSlangTypeParams ) )? ( (lv_params_5_0= ruleSlangDefParams ) )? otherlv_6= Colon ( (lv_type_7_0= ruleSlangType ) ) ( (lv_c_8_0= ruleSlangDefContract ) )?
            {
            otherlv_0=(Token)match(input,Def,FollowSets000.FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangDefDeclAccess().getDefKeyword_0());
              		
            }
            // InternalGumboParser.g:1548:3: ( ruleSlangDefMods )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Strictpure) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalGumboParser.g:1549:4: ruleSlangDefMods
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSlangDefDeclAccess().getSlangDefModsParserRuleCall_1());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_30);
                    ruleSlangDefMods();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalGumboParser.g:1560:3: ( (lv_sde_2_0= ruleSlangDefExt ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==LeftParenthesis) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalGumboParser.g:1561:4: (lv_sde_2_0= ruleSlangDefExt )
                    {
                    // InternalGumboParser.g:1561:4: (lv_sde_2_0= ruleSlangDefExt )
                    // InternalGumboParser.g:1562:5: lv_sde_2_0= ruleSlangDefExt
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangDefDeclAccess().getSdeSlangDefExtParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_30);
                    lv_sde_2_0=ruleSlangDefExt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSlangDefDeclRule());
                      					}
                      					set(
                      						current,
                      						"sde",
                      						lv_sde_2_0,
                      						"org.sireum.aadl.gumbo.Gumbo.SlangDefExt");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalGumboParser.g:1579:3: ( (lv_name_3_0= ruleSlangDefID ) )
            // InternalGumboParser.g:1580:4: (lv_name_3_0= ruleSlangDefID )
            {
            // InternalGumboParser.g:1580:4: (lv_name_3_0= ruleSlangDefID )
            // InternalGumboParser.g:1581:5: lv_name_3_0= ruleSlangDefID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangDefDeclAccess().getNameSlangDefIDParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_31);
            lv_name_3_0=ruleSlangDefID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSlangDefDeclRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_3_0,
              						"org.sireum.aadl.gumbo.Gumbo.SlangDefID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumboParser.g:1598:3: ( (lv_typeParams_4_0= ruleSlangTypeParams ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==LeftSquareBracket) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalGumboParser.g:1599:4: (lv_typeParams_4_0= ruleSlangTypeParams )
                    {
                    // InternalGumboParser.g:1599:4: (lv_typeParams_4_0= ruleSlangTypeParams )
                    // InternalGumboParser.g:1600:5: lv_typeParams_4_0= ruleSlangTypeParams
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangDefDeclAccess().getTypeParamsSlangTypeParamsParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_32);
                    lv_typeParams_4_0=ruleSlangTypeParams();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSlangDefDeclRule());
                      					}
                      					set(
                      						current,
                      						"typeParams",
                      						lv_typeParams_4_0,
                      						"org.sireum.aadl.gumbo.Gumbo.SlangTypeParams");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalGumboParser.g:1617:3: ( (lv_params_5_0= ruleSlangDefParams ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==LeftParenthesis) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalGumboParser.g:1618:4: (lv_params_5_0= ruleSlangDefParams )
                    {
                    // InternalGumboParser.g:1618:4: (lv_params_5_0= ruleSlangDefParams )
                    // InternalGumboParser.g:1619:5: lv_params_5_0= ruleSlangDefParams
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangDefDeclAccess().getParamsSlangDefParamsParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_10);
                    lv_params_5_0=ruleSlangDefParams();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSlangDefDeclRule());
                      					}
                      					set(
                      						current,
                      						"params",
                      						lv_params_5_0,
                      						"org.sireum.aadl.gumbo.Gumbo.SlangDefParams");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,Colon,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getSlangDefDeclAccess().getColonKeyword_6());
              		
            }
            // InternalGumboParser.g:1640:3: ( (lv_type_7_0= ruleSlangType ) )
            // InternalGumboParser.g:1641:4: (lv_type_7_0= ruleSlangType )
            {
            // InternalGumboParser.g:1641:4: (lv_type_7_0= ruleSlangType )
            // InternalGumboParser.g:1642:5: lv_type_7_0= ruleSlangType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangDefDeclAccess().getTypeSlangTypeParserRuleCall_7_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_33);
            lv_type_7_0=ruleSlangType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSlangDefDeclRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_7_0,
              						"org.sireum.aadl.gumbo.Gumbo.SlangType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumboParser.g:1659:3: ( (lv_c_8_0= ruleSlangDefContract ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==Spec) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalGumboParser.g:1660:4: (lv_c_8_0= ruleSlangDefContract )
                    {
                    // InternalGumboParser.g:1660:4: (lv_c_8_0= ruleSlangDefContract )
                    // InternalGumboParser.g:1661:5: lv_c_8_0= ruleSlangDefContract
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangDefDeclAccess().getCSlangDefContractParserRuleCall_8_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_c_8_0=ruleSlangDefContract();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSlangDefDeclRule());
                      					}
                      					set(
                      						current,
                      						"c",
                      						lv_c_8_0,
                      						"org.sireum.aadl.gumbo.Gumbo.SlangDefContract");
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
    // $ANTLR end "ruleSlangDefDecl"


    // $ANTLR start "entryRuleSlangDefDef"
    // InternalGumboParser.g:1682:1: entryRuleSlangDefDef returns [EObject current=null] : iv_ruleSlangDefDef= ruleSlangDefDef EOF ;
    public final EObject entryRuleSlangDefDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangDefDef = null;


        try {
            // InternalGumboParser.g:1682:52: (iv_ruleSlangDefDef= ruleSlangDefDef EOF )
            // InternalGumboParser.g:1683:2: iv_ruleSlangDefDef= ruleSlangDefDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlangDefDefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlangDefDef=ruleSlangDefDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlangDefDef; 
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
    // $ANTLR end "entryRuleSlangDefDef"


    // $ANTLR start "ruleSlangDefDef"
    // InternalGumboParser.g:1689:1: ruleSlangDefDef returns [EObject current=null] : ( ( (lv_defMods_0_0= ruleSlangDefMods ) )? otherlv_1= Def ( (lv_sde_2_0= ruleSlangDefExt ) )? ( (lv_name_3_0= ruleSlangDefID ) ) ( (lv_typeParams_4_0= ruleSlangTypeParams ) )? ( (lv_params_5_0= ruleSlangDefParams ) ) otherlv_6= Colon ( (lv_type_7_0= ruleSlangType ) ) ( (lv_methodContract_8_0= ruleSlangDefContract ) )? otherlv_9= ColonEqualsSign ( (lv_body_10_0= ruleExpr ) ) ) ;
    public final EObject ruleSlangDefDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_defMods_0_0 = null;

        EObject lv_sde_2_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_typeParams_4_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_type_7_0 = null;

        EObject lv_methodContract_8_0 = null;

        EObject lv_body_10_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1695:2: ( ( ( (lv_defMods_0_0= ruleSlangDefMods ) )? otherlv_1= Def ( (lv_sde_2_0= ruleSlangDefExt ) )? ( (lv_name_3_0= ruleSlangDefID ) ) ( (lv_typeParams_4_0= ruleSlangTypeParams ) )? ( (lv_params_5_0= ruleSlangDefParams ) ) otherlv_6= Colon ( (lv_type_7_0= ruleSlangType ) ) ( (lv_methodContract_8_0= ruleSlangDefContract ) )? otherlv_9= ColonEqualsSign ( (lv_body_10_0= ruleExpr ) ) ) )
            // InternalGumboParser.g:1696:2: ( ( (lv_defMods_0_0= ruleSlangDefMods ) )? otherlv_1= Def ( (lv_sde_2_0= ruleSlangDefExt ) )? ( (lv_name_3_0= ruleSlangDefID ) ) ( (lv_typeParams_4_0= ruleSlangTypeParams ) )? ( (lv_params_5_0= ruleSlangDefParams ) ) otherlv_6= Colon ( (lv_type_7_0= ruleSlangType ) ) ( (lv_methodContract_8_0= ruleSlangDefContract ) )? otherlv_9= ColonEqualsSign ( (lv_body_10_0= ruleExpr ) ) )
            {
            // InternalGumboParser.g:1696:2: ( ( (lv_defMods_0_0= ruleSlangDefMods ) )? otherlv_1= Def ( (lv_sde_2_0= ruleSlangDefExt ) )? ( (lv_name_3_0= ruleSlangDefID ) ) ( (lv_typeParams_4_0= ruleSlangTypeParams ) )? ( (lv_params_5_0= ruleSlangDefParams ) ) otherlv_6= Colon ( (lv_type_7_0= ruleSlangType ) ) ( (lv_methodContract_8_0= ruleSlangDefContract ) )? otherlv_9= ColonEqualsSign ( (lv_body_10_0= ruleExpr ) ) )
            // InternalGumboParser.g:1697:3: ( (lv_defMods_0_0= ruleSlangDefMods ) )? otherlv_1= Def ( (lv_sde_2_0= ruleSlangDefExt ) )? ( (lv_name_3_0= ruleSlangDefID ) ) ( (lv_typeParams_4_0= ruleSlangTypeParams ) )? ( (lv_params_5_0= ruleSlangDefParams ) ) otherlv_6= Colon ( (lv_type_7_0= ruleSlangType ) ) ( (lv_methodContract_8_0= ruleSlangDefContract ) )? otherlv_9= ColonEqualsSign ( (lv_body_10_0= ruleExpr ) )
            {
            // InternalGumboParser.g:1697:3: ( (lv_defMods_0_0= ruleSlangDefMods ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==Strictpure) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalGumboParser.g:1698:4: (lv_defMods_0_0= ruleSlangDefMods )
                    {
                    // InternalGumboParser.g:1698:4: (lv_defMods_0_0= ruleSlangDefMods )
                    // InternalGumboParser.g:1699:5: lv_defMods_0_0= ruleSlangDefMods
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangDefDefAccess().getDefModsSlangDefModsParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_34);
                    lv_defMods_0_0=ruleSlangDefMods();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSlangDefDefRule());
                      					}
                      					set(
                      						current,
                      						"defMods",
                      						lv_defMods_0_0,
                      						"org.sireum.aadl.gumbo.Gumbo.SlangDefMods");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,Def,FollowSets000.FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSlangDefDefAccess().getDefKeyword_1());
              		
            }
            // InternalGumboParser.g:1720:3: ( (lv_sde_2_0= ruleSlangDefExt ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==LeftParenthesis) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalGumboParser.g:1721:4: (lv_sde_2_0= ruleSlangDefExt )
                    {
                    // InternalGumboParser.g:1721:4: (lv_sde_2_0= ruleSlangDefExt )
                    // InternalGumboParser.g:1722:5: lv_sde_2_0= ruleSlangDefExt
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangDefDefAccess().getSdeSlangDefExtParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_30);
                    lv_sde_2_0=ruleSlangDefExt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSlangDefDefRule());
                      					}
                      					set(
                      						current,
                      						"sde",
                      						lv_sde_2_0,
                      						"org.sireum.aadl.gumbo.Gumbo.SlangDefExt");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalGumboParser.g:1739:3: ( (lv_name_3_0= ruleSlangDefID ) )
            // InternalGumboParser.g:1740:4: (lv_name_3_0= ruleSlangDefID )
            {
            // InternalGumboParser.g:1740:4: (lv_name_3_0= ruleSlangDefID )
            // InternalGumboParser.g:1741:5: lv_name_3_0= ruleSlangDefID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangDefDefAccess().getNameSlangDefIDParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_35);
            lv_name_3_0=ruleSlangDefID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSlangDefDefRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_3_0,
              						"org.sireum.aadl.gumbo.Gumbo.SlangDefID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumboParser.g:1758:3: ( (lv_typeParams_4_0= ruleSlangTypeParams ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==LeftSquareBracket) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalGumboParser.g:1759:4: (lv_typeParams_4_0= ruleSlangTypeParams )
                    {
                    // InternalGumboParser.g:1759:4: (lv_typeParams_4_0= ruleSlangTypeParams )
                    // InternalGumboParser.g:1760:5: lv_typeParams_4_0= ruleSlangTypeParams
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangDefDefAccess().getTypeParamsSlangTypeParamsParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_36);
                    lv_typeParams_4_0=ruleSlangTypeParams();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSlangDefDefRule());
                      					}
                      					set(
                      						current,
                      						"typeParams",
                      						lv_typeParams_4_0,
                      						"org.sireum.aadl.gumbo.Gumbo.SlangTypeParams");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalGumboParser.g:1777:3: ( (lv_params_5_0= ruleSlangDefParams ) )
            // InternalGumboParser.g:1778:4: (lv_params_5_0= ruleSlangDefParams )
            {
            // InternalGumboParser.g:1778:4: (lv_params_5_0= ruleSlangDefParams )
            // InternalGumboParser.g:1779:5: lv_params_5_0= ruleSlangDefParams
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangDefDefAccess().getParamsSlangDefParamsParserRuleCall_5_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_10);
            lv_params_5_0=ruleSlangDefParams();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSlangDefDefRule());
              					}
              					set(
              						current,
              						"params",
              						lv_params_5_0,
              						"org.sireum.aadl.gumbo.Gumbo.SlangDefParams");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,Colon,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getSlangDefDefAccess().getColonKeyword_6());
              		
            }
            // InternalGumboParser.g:1800:3: ( (lv_type_7_0= ruleSlangType ) )
            // InternalGumboParser.g:1801:4: (lv_type_7_0= ruleSlangType )
            {
            // InternalGumboParser.g:1801:4: (lv_type_7_0= ruleSlangType )
            // InternalGumboParser.g:1802:5: lv_type_7_0= ruleSlangType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangDefDefAccess().getTypeSlangTypeParserRuleCall_7_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_37);
            lv_type_7_0=ruleSlangType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSlangDefDefRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_7_0,
              						"org.sireum.aadl.gumbo.Gumbo.SlangType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumboParser.g:1819:3: ( (lv_methodContract_8_0= ruleSlangDefContract ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==Spec) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalGumboParser.g:1820:4: (lv_methodContract_8_0= ruleSlangDefContract )
                    {
                    // InternalGumboParser.g:1820:4: (lv_methodContract_8_0= ruleSlangDefContract )
                    // InternalGumboParser.g:1821:5: lv_methodContract_8_0= ruleSlangDefContract
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangDefDefAccess().getMethodContractSlangDefContractParserRuleCall_8_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_38);
                    lv_methodContract_8_0=ruleSlangDefContract();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSlangDefDefRule());
                      					}
                      					set(
                      						current,
                      						"methodContract",
                      						lv_methodContract_8_0,
                      						"org.sireum.aadl.gumbo.Gumbo.SlangDefContract");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,ColonEqualsSign,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getSlangDefDefAccess().getColonEqualsSignKeyword_9());
              		
            }
            // InternalGumboParser.g:1842:3: ( (lv_body_10_0= ruleExpr ) )
            // InternalGumboParser.g:1843:4: (lv_body_10_0= ruleExpr )
            {
            // InternalGumboParser.g:1843:4: (lv_body_10_0= ruleExpr )
            // InternalGumboParser.g:1844:5: lv_body_10_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangDefDefAccess().getBodyExprParserRuleCall_10_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_body_10_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSlangDefDefRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_10_0,
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
    // $ANTLR end "ruleSlangDefDef"


    // $ANTLR start "entryRuleSlangDefMods"
    // InternalGumboParser.g:1865:1: entryRuleSlangDefMods returns [String current=null] : iv_ruleSlangDefMods= ruleSlangDefMods EOF ;
    public final String entryRuleSlangDefMods() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSlangDefMods = null;


        try {
            // InternalGumboParser.g:1865:52: (iv_ruleSlangDefMods= ruleSlangDefMods EOF )
            // InternalGumboParser.g:1866:2: iv_ruleSlangDefMods= ruleSlangDefMods EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlangDefModsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlangDefMods=ruleSlangDefMods();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlangDefMods.getText(); 
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
    // $ANTLR end "entryRuleSlangDefMods"


    // $ANTLR start "ruleSlangDefMods"
    // InternalGumboParser.g:1872:1: ruleSlangDefMods returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= Strictpure ;
    public final AntlrDatatypeRuleToken ruleSlangDefMods() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumboParser.g:1878:2: (kw= Strictpure )
            // InternalGumboParser.g:1879:2: kw= Strictpure
            {
            kw=(Token)match(input,Strictpure,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getSlangDefModsAccess().getStrictpureKeyword());
              	
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
    // $ANTLR end "ruleSlangDefMods"


    // $ANTLR start "entryRuleSlangDefExt"
    // InternalGumboParser.g:1887:1: entryRuleSlangDefExt returns [EObject current=null] : iv_ruleSlangDefExt= ruleSlangDefExt EOF ;
    public final EObject entryRuleSlangDefExt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangDefExt = null;


        try {
            // InternalGumboParser.g:1887:52: (iv_ruleSlangDefExt= ruleSlangDefExt EOF )
            // InternalGumboParser.g:1888:2: iv_ruleSlangDefExt= ruleSlangDefExt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlangDefExtRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlangDefExt=ruleSlangDefExt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlangDefExt; 
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
    // $ANTLR end "entryRuleSlangDefExt"


    // $ANTLR start "ruleSlangDefExt"
    // InternalGumboParser.g:1894:1: ruleSlangDefExt returns [EObject current=null] : (otherlv_0= LeftParenthesis ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) otherlv_4= RightParenthesis ) ;
    public final EObject ruleSlangDefExt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_typeName_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1900:2: ( (otherlv_0= LeftParenthesis ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) otherlv_4= RightParenthesis ) )
            // InternalGumboParser.g:1901:2: (otherlv_0= LeftParenthesis ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) otherlv_4= RightParenthesis )
            {
            // InternalGumboParser.g:1901:2: (otherlv_0= LeftParenthesis ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) otherlv_4= RightParenthesis )
            // InternalGumboParser.g:1902:3: otherlv_0= LeftParenthesis ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) otherlv_4= RightParenthesis
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangDefExtAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalGumboParser.g:1906:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGumboParser.g:1907:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGumboParser.g:1907:4: (lv_name_1_0= RULE_ID )
            // InternalGumboParser.g:1908:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getSlangDefExtAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSlangDefExtRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.osate.xtext.aadl2.properties.Properties.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,Colon,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSlangDefExtAccess().getColonKeyword_2());
              		
            }
            // InternalGumboParser.g:1928:3: ( (lv_typeName_3_0= ruleSlangType ) )
            // InternalGumboParser.g:1929:4: (lv_typeName_3_0= ruleSlangType )
            {
            // InternalGumboParser.g:1929:4: (lv_typeName_3_0= ruleSlangType )
            // InternalGumboParser.g:1930:5: lv_typeName_3_0= ruleSlangType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangDefExtAccess().getTypeNameSlangTypeParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_39);
            lv_typeName_3_0=ruleSlangType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSlangDefExtRule());
              					}
              					set(
              						current,
              						"typeName",
              						lv_typeName_3_0,
              						"org.sireum.aadl.gumbo.Gumbo.SlangType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getSlangDefExtAccess().getRightParenthesisKeyword_4());
              		
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
    // $ANTLR end "ruleSlangDefExt"


    // $ANTLR start "entryRuleSlangDefID"
    // InternalGumboParser.g:1955:1: entryRuleSlangDefID returns [String current=null] : iv_ruleSlangDefID= ruleSlangDefID EOF ;
    public final String entryRuleSlangDefID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSlangDefID = null;


        try {
            // InternalGumboParser.g:1955:50: (iv_ruleSlangDefID= ruleSlangDefID EOF )
            // InternalGumboParser.g:1956:2: iv_ruleSlangDefID= ruleSlangDefID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlangDefIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlangDefID=ruleSlangDefID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlangDefID.getText(); 
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
    // $ANTLR end "entryRuleSlangDefID"


    // $ANTLR start "ruleSlangDefID"
    // InternalGumboParser.g:1962:1: ruleSlangDefID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_Operator_1= ruleOperator ) ;
    public final AntlrDatatypeRuleToken ruleSlangDefID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        AntlrDatatypeRuleToken this_Operator_1 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1968:2: ( (this_ID_0= RULE_ID | this_Operator_1= ruleOperator ) )
            // InternalGumboParser.g:1969:2: (this_ID_0= RULE_ID | this_Operator_1= ruleOperator )
            {
            // InternalGumboParser.g:1969:2: (this_ID_0= RULE_ID | this_Operator_1= ruleOperator )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                alt37=1;
            }
            else if ( ((LA37_0>=Asterisk && LA37_0<=PlusSign)||LA37_0==HyphenMinus||(LA37_0>=RULE_IMPLIES && LA37_0<=RULE_OP)) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalGumboParser.g:1970:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ID_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_0, grammarAccess.getSlangDefIDAccess().getIDTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:1978:3: this_Operator_1= ruleOperator
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSlangDefIDAccess().getOperatorParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Operator_1=ruleOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Operator_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

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
    // $ANTLR end "ruleSlangDefID"


    // $ANTLR start "entryRuleSlangDefParams"
    // InternalGumboParser.g:1992:1: entryRuleSlangDefParams returns [EObject current=null] : iv_ruleSlangDefParams= ruleSlangDefParams EOF ;
    public final EObject entryRuleSlangDefParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangDefParams = null;


        try {
            // InternalGumboParser.g:1992:55: (iv_ruleSlangDefParams= ruleSlangDefParams EOF )
            // InternalGumboParser.g:1993:2: iv_ruleSlangDefParams= ruleSlangDefParams EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlangDefParamsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlangDefParams=ruleSlangDefParams();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlangDefParams; 
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
    // $ANTLR end "entryRuleSlangDefParams"


    // $ANTLR start "ruleSlangDefParams"
    // InternalGumboParser.g:1999:1: ruleSlangDefParams returns [EObject current=null] : (otherlv_0= LeftParenthesis ( ( (lv_params_1_0= ruleSlangDefParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangDefParam ) ) )* )? otherlv_4= RightParenthesis ) ;
    public final EObject ruleSlangDefParams() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_params_1_0 = null;

        EObject lv_params_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2005:2: ( (otherlv_0= LeftParenthesis ( ( (lv_params_1_0= ruleSlangDefParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangDefParam ) ) )* )? otherlv_4= RightParenthesis ) )
            // InternalGumboParser.g:2006:2: (otherlv_0= LeftParenthesis ( ( (lv_params_1_0= ruleSlangDefParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangDefParam ) ) )* )? otherlv_4= RightParenthesis )
            {
            // InternalGumboParser.g:2006:2: (otherlv_0= LeftParenthesis ( ( (lv_params_1_0= ruleSlangDefParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangDefParam ) ) )* )? otherlv_4= RightParenthesis )
            // InternalGumboParser.g:2007:3: otherlv_0= LeftParenthesis ( ( (lv_params_1_0= ruleSlangDefParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangDefParam ) ) )* )? otherlv_4= RightParenthesis
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangDefParamsAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalGumboParser.g:2011:3: ( ( (lv_params_1_0= ruleSlangDefParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangDefParam ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalGumboParser.g:2012:4: ( (lv_params_1_0= ruleSlangDefParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangDefParam ) ) )*
                    {
                    // InternalGumboParser.g:2012:4: ( (lv_params_1_0= ruleSlangDefParam ) )
                    // InternalGumboParser.g:2013:5: (lv_params_1_0= ruleSlangDefParam )
                    {
                    // InternalGumboParser.g:2013:5: (lv_params_1_0= ruleSlangDefParam )
                    // InternalGumboParser.g:2014:6: lv_params_1_0= ruleSlangDefParam
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangDefParamsAccess().getParamsSlangDefParamParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_41);
                    lv_params_1_0=ruleSlangDefParam();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlangDefParamsRule());
                      						}
                      						add(
                      							current,
                      							"params",
                      							lv_params_1_0,
                      							"org.sireum.aadl.gumbo.Gumbo.SlangDefParam");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:2031:4: (otherlv_2= Comma ( (lv_params_3_0= ruleSlangDefParam ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==Comma) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalGumboParser.g:2032:5: otherlv_2= Comma ( (lv_params_3_0= ruleSlangDefParam ) )
                    	    {
                    	    otherlv_2=(Token)match(input,Comma,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getSlangDefParamsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:2036:5: ( (lv_params_3_0= ruleSlangDefParam ) )
                    	    // InternalGumboParser.g:2037:6: (lv_params_3_0= ruleSlangDefParam )
                    	    {
                    	    // InternalGumboParser.g:2037:6: (lv_params_3_0= ruleSlangDefParam )
                    	    // InternalGumboParser.g:2038:7: lv_params_3_0= ruleSlangDefParam
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSlangDefParamsAccess().getParamsSlangDefParamParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_41);
                    	    lv_params_3_0=ruleSlangDefParam();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSlangDefParamsRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"params",
                    	      								lv_params_3_0,
                    	      								"org.sireum.aadl.gumbo.Gumbo.SlangDefParam");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getSlangDefParamsAccess().getRightParenthesisKeyword_2());
              		
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
    // $ANTLR end "ruleSlangDefParams"


    // $ANTLR start "entryRuleSlangDefParam"
    // InternalGumboParser.g:2065:1: entryRuleSlangDefParam returns [EObject current=null] : iv_ruleSlangDefParam= ruleSlangDefParam EOF ;
    public final EObject entryRuleSlangDefParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangDefParam = null;


        try {
            // InternalGumboParser.g:2065:54: (iv_ruleSlangDefParam= ruleSlangDefParam EOF )
            // InternalGumboParser.g:2066:2: iv_ruleSlangDefParam= ruleSlangDefParam EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlangDefParamRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlangDefParam=ruleSlangDefParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlangDefParam; 
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
    // $ANTLR end "entryRuleSlangDefParam"


    // $ANTLR start "ruleSlangDefParam"
    // InternalGumboParser.g:2072:1: ruleSlangDefParam returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_isMethodDef_2_0= EqualsSignGreaterThanSign ) )? ( (lv_typeName_3_0= ruleSlangType ) ) ( (lv_isVarArg_4_0= Asterisk ) )? ) ;
    public final EObject ruleSlangDefParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_isMethodDef_2_0=null;
        Token lv_isVarArg_4_0=null;
        EObject lv_typeName_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2078:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_isMethodDef_2_0= EqualsSignGreaterThanSign ) )? ( (lv_typeName_3_0= ruleSlangType ) ) ( (lv_isVarArg_4_0= Asterisk ) )? ) )
            // InternalGumboParser.g:2079:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_isMethodDef_2_0= EqualsSignGreaterThanSign ) )? ( (lv_typeName_3_0= ruleSlangType ) ) ( (lv_isVarArg_4_0= Asterisk ) )? )
            {
            // InternalGumboParser.g:2079:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_isMethodDef_2_0= EqualsSignGreaterThanSign ) )? ( (lv_typeName_3_0= ruleSlangType ) ) ( (lv_isVarArg_4_0= Asterisk ) )? )
            // InternalGumboParser.g:2080:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_isMethodDef_2_0= EqualsSignGreaterThanSign ) )? ( (lv_typeName_3_0= ruleSlangType ) ) ( (lv_isVarArg_4_0= Asterisk ) )?
            {
            // InternalGumboParser.g:2080:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGumboParser.g:2081:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGumboParser.g:2081:4: (lv_name_0_0= RULE_ID )
            // InternalGumboParser.g:2082:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getSlangDefParamAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSlangDefParamRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.osate.xtext.aadl2.properties.Properties.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FollowSets000.FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSlangDefParamAccess().getColonKeyword_1());
              		
            }
            // InternalGumboParser.g:2102:3: ( (lv_isMethodDef_2_0= EqualsSignGreaterThanSign ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==EqualsSignGreaterThanSign) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalGumboParser.g:2103:4: (lv_isMethodDef_2_0= EqualsSignGreaterThanSign )
                    {
                    // InternalGumboParser.g:2103:4: (lv_isMethodDef_2_0= EqualsSignGreaterThanSign )
                    // InternalGumboParser.g:2104:5: lv_isMethodDef_2_0= EqualsSignGreaterThanSign
                    {
                    lv_isMethodDef_2_0=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isMethodDef_2_0, grammarAccess.getSlangDefParamAccess().getIsMethodDefEqualsSignGreaterThanSignKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSlangDefParamRule());
                      					}
                      					setWithLastConsumed(current, "isMethodDef", lv_isMethodDef_2_0 != null, "=>");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalGumboParser.g:2116:3: ( (lv_typeName_3_0= ruleSlangType ) )
            // InternalGumboParser.g:2117:4: (lv_typeName_3_0= ruleSlangType )
            {
            // InternalGumboParser.g:2117:4: (lv_typeName_3_0= ruleSlangType )
            // InternalGumboParser.g:2118:5: lv_typeName_3_0= ruleSlangType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangDefParamAccess().getTypeNameSlangTypeParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_43);
            lv_typeName_3_0=ruleSlangType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSlangDefParamRule());
              					}
              					set(
              						current,
              						"typeName",
              						lv_typeName_3_0,
              						"org.sireum.aadl.gumbo.Gumbo.SlangType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumboParser.g:2135:3: ( (lv_isVarArg_4_0= Asterisk ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==Asterisk) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalGumboParser.g:2136:4: (lv_isVarArg_4_0= Asterisk )
                    {
                    // InternalGumboParser.g:2136:4: (lv_isVarArg_4_0= Asterisk )
                    // InternalGumboParser.g:2137:5: lv_isVarArg_4_0= Asterisk
                    {
                    lv_isVarArg_4_0=(Token)match(input,Asterisk,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isVarArg_4_0, grammarAccess.getSlangDefParamAccess().getIsVarArgAsteriskKeyword_4_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSlangDefParamRule());
                      					}
                      					setWithLastConsumed(current, "isVarArg", lv_isVarArg_4_0 != null, "*");
                      				
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
    // $ANTLR end "ruleSlangDefParam"


    // $ANTLR start "entryRuleSlangTypeParams"
    // InternalGumboParser.g:2153:1: entryRuleSlangTypeParams returns [EObject current=null] : iv_ruleSlangTypeParams= ruleSlangTypeParams EOF ;
    public final EObject entryRuleSlangTypeParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangTypeParams = null;


        try {
            // InternalGumboParser.g:2153:56: (iv_ruleSlangTypeParams= ruleSlangTypeParams EOF )
            // InternalGumboParser.g:2154:2: iv_ruleSlangTypeParams= ruleSlangTypeParams EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlangTypeParamsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlangTypeParams=ruleSlangTypeParams();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlangTypeParams; 
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
    // $ANTLR end "entryRuleSlangTypeParams"


    // $ANTLR start "ruleSlangTypeParams"
    // InternalGumboParser.g:2160:1: ruleSlangTypeParams returns [EObject current=null] : (otherlv_0= LeftSquareBracket ( (lv_typeParam_1_0= ruleSlangTypeParam ) ) (otherlv_2= Comma ( (lv_typeParam_3_0= ruleSlangTypeParam ) ) )* otherlv_4= RightSquareBracket ) ;
    public final EObject ruleSlangTypeParams() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_typeParam_1_0 = null;

        EObject lv_typeParam_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2166:2: ( (otherlv_0= LeftSquareBracket ( (lv_typeParam_1_0= ruleSlangTypeParam ) ) (otherlv_2= Comma ( (lv_typeParam_3_0= ruleSlangTypeParam ) ) )* otherlv_4= RightSquareBracket ) )
            // InternalGumboParser.g:2167:2: (otherlv_0= LeftSquareBracket ( (lv_typeParam_1_0= ruleSlangTypeParam ) ) (otherlv_2= Comma ( (lv_typeParam_3_0= ruleSlangTypeParam ) ) )* otherlv_4= RightSquareBracket )
            {
            // InternalGumboParser.g:2167:2: (otherlv_0= LeftSquareBracket ( (lv_typeParam_1_0= ruleSlangTypeParam ) ) (otherlv_2= Comma ( (lv_typeParam_3_0= ruleSlangTypeParam ) ) )* otherlv_4= RightSquareBracket )
            // InternalGumboParser.g:2168:3: otherlv_0= LeftSquareBracket ( (lv_typeParam_1_0= ruleSlangTypeParam ) ) (otherlv_2= Comma ( (lv_typeParam_3_0= ruleSlangTypeParam ) ) )* otherlv_4= RightSquareBracket
            {
            otherlv_0=(Token)match(input,LeftSquareBracket,FollowSets000.FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangTypeParamsAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalGumboParser.g:2172:3: ( (lv_typeParam_1_0= ruleSlangTypeParam ) )
            // InternalGumboParser.g:2173:4: (lv_typeParam_1_0= ruleSlangTypeParam )
            {
            // InternalGumboParser.g:2173:4: (lv_typeParam_1_0= ruleSlangTypeParam )
            // InternalGumboParser.g:2174:5: lv_typeParam_1_0= ruleSlangTypeParam
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangTypeParamsAccess().getTypeParamSlangTypeParamParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_45);
            lv_typeParam_1_0=ruleSlangTypeParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSlangTypeParamsRule());
              					}
              					add(
              						current,
              						"typeParam",
              						lv_typeParam_1_0,
              						"org.sireum.aadl.gumbo.Gumbo.SlangTypeParam");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumboParser.g:2191:3: (otherlv_2= Comma ( (lv_typeParam_3_0= ruleSlangTypeParam ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==Comma) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalGumboParser.g:2192:4: otherlv_2= Comma ( (lv_typeParam_3_0= ruleSlangTypeParam ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FollowSets000.FOLLOW_44); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSlangTypeParamsAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalGumboParser.g:2196:4: ( (lv_typeParam_3_0= ruleSlangTypeParam ) )
            	    // InternalGumboParser.g:2197:5: (lv_typeParam_3_0= ruleSlangTypeParam )
            	    {
            	    // InternalGumboParser.g:2197:5: (lv_typeParam_3_0= ruleSlangTypeParam )
            	    // InternalGumboParser.g:2198:6: lv_typeParam_3_0= ruleSlangTypeParam
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSlangTypeParamsAccess().getTypeParamSlangTypeParamParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_45);
            	    lv_typeParam_3_0=ruleSlangTypeParam();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSlangTypeParamsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"typeParam",
            	      							lv_typeParam_3_0,
            	      							"org.sireum.aadl.gumbo.Gumbo.SlangTypeParam");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            otherlv_4=(Token)match(input,RightSquareBracket,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getSlangTypeParamsAccess().getRightSquareBracketKeyword_3());
              		
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
    // $ANTLR end "ruleSlangTypeParams"


    // $ANTLR start "entryRuleSlangTypeParam"
    // InternalGumboParser.g:2224:1: entryRuleSlangTypeParam returns [EObject current=null] : iv_ruleSlangTypeParam= ruleSlangTypeParam EOF ;
    public final EObject entryRuleSlangTypeParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangTypeParam = null;


        try {
            // InternalGumboParser.g:2224:55: (iv_ruleSlangTypeParam= ruleSlangTypeParam EOF )
            // InternalGumboParser.g:2225:2: iv_ruleSlangTypeParam= ruleSlangTypeParam EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlangTypeParamRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlangTypeParam=ruleSlangTypeParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlangTypeParam; 
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
    // $ANTLR end "entryRuleSlangTypeParam"


    // $ANTLR start "ruleSlangTypeParam"
    // InternalGumboParser.g:2231:1: ruleSlangTypeParam returns [EObject current=null] : ( ( (lv_isMut_0_0= Mut ) )? ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSlangTypeParam() throws RecognitionException {
        EObject current = null;

        Token lv_isMut_0_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGumboParser.g:2237:2: ( ( ( (lv_isMut_0_0= Mut ) )? ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGumboParser.g:2238:2: ( ( (lv_isMut_0_0= Mut ) )? ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGumboParser.g:2238:2: ( ( (lv_isMut_0_0= Mut ) )? ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGumboParser.g:2239:3: ( (lv_isMut_0_0= Mut ) )? ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalGumboParser.g:2239:3: ( (lv_isMut_0_0= Mut ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==Mut) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalGumboParser.g:2240:4: (lv_isMut_0_0= Mut )
                    {
                    // InternalGumboParser.g:2240:4: (lv_isMut_0_0= Mut )
                    // InternalGumboParser.g:2241:5: lv_isMut_0_0= Mut
                    {
                    lv_isMut_0_0=(Token)match(input,Mut,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isMut_0_0, grammarAccess.getSlangTypeParamAccess().getIsMutMutKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSlangTypeParamRule());
                      					}
                      					setWithLastConsumed(current, "isMut", lv_isMut_0_0 != null, "mut");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalGumboParser.g:2253:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGumboParser.g:2254:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGumboParser.g:2254:4: (lv_name_1_0= RULE_ID )
            // InternalGumboParser.g:2255:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getSlangTypeParamAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSlangTypeParamRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.osate.xtext.aadl2.properties.Properties.ID");
              				
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
    // $ANTLR end "ruleSlangTypeParam"


    // $ANTLR start "entryRuleSlangDefContract"
    // InternalGumboParser.g:2275:1: entryRuleSlangDefContract returns [EObject current=null] : iv_ruleSlangDefContract= ruleSlangDefContract EOF ;
    public final EObject entryRuleSlangDefContract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangDefContract = null;


        try {
            // InternalGumboParser.g:2275:57: (iv_ruleSlangDefContract= ruleSlangDefContract EOF )
            // InternalGumboParser.g:2276:2: iv_ruleSlangDefContract= ruleSlangDefContract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlangDefContractRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlangDefContract=ruleSlangDefContract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlangDefContract; 
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
    // $ANTLR end "entryRuleSlangDefContract"


    // $ANTLR start "ruleSlangDefContract"
    // InternalGumboParser.g:2282:1: ruleSlangDefContract returns [EObject current=null] : ( () otherlv_1= Spec ( ( ( (lv_rea_2_0= ruleSlangReads ) )? ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_mod_4_0= ruleSlangModifies ) )? ( (lv_ens_5_0= ruleSlangEnsures ) )? ) | ( ( (lv_contracts_6_0= ruleSlangDefContractCase ) )+ ( (lv_rea_7_0= ruleSlangReads ) )? ( (lv_mod_8_0= ruleSlangModifies ) )? ) ) ) ;
    public final EObject ruleSlangDefContract() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_rea_2_0 = null;

        EObject lv_req_3_0 = null;

        EObject lv_mod_4_0 = null;

        EObject lv_ens_5_0 = null;

        EObject lv_contracts_6_0 = null;

        EObject lv_rea_7_0 = null;

        EObject lv_mod_8_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2288:2: ( ( () otherlv_1= Spec ( ( ( (lv_rea_2_0= ruleSlangReads ) )? ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_mod_4_0= ruleSlangModifies ) )? ( (lv_ens_5_0= ruleSlangEnsures ) )? ) | ( ( (lv_contracts_6_0= ruleSlangDefContractCase ) )+ ( (lv_rea_7_0= ruleSlangReads ) )? ( (lv_mod_8_0= ruleSlangModifies ) )? ) ) ) )
            // InternalGumboParser.g:2289:2: ( () otherlv_1= Spec ( ( ( (lv_rea_2_0= ruleSlangReads ) )? ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_mod_4_0= ruleSlangModifies ) )? ( (lv_ens_5_0= ruleSlangEnsures ) )? ) | ( ( (lv_contracts_6_0= ruleSlangDefContractCase ) )+ ( (lv_rea_7_0= ruleSlangReads ) )? ( (lv_mod_8_0= ruleSlangModifies ) )? ) ) )
            {
            // InternalGumboParser.g:2289:2: ( () otherlv_1= Spec ( ( ( (lv_rea_2_0= ruleSlangReads ) )? ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_mod_4_0= ruleSlangModifies ) )? ( (lv_ens_5_0= ruleSlangEnsures ) )? ) | ( ( (lv_contracts_6_0= ruleSlangDefContractCase ) )+ ( (lv_rea_7_0= ruleSlangReads ) )? ( (lv_mod_8_0= ruleSlangModifies ) )? ) ) )
            // InternalGumboParser.g:2290:3: () otherlv_1= Spec ( ( ( (lv_rea_2_0= ruleSlangReads ) )? ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_mod_4_0= ruleSlangModifies ) )? ( (lv_ens_5_0= ruleSlangEnsures ) )? ) | ( ( (lv_contracts_6_0= ruleSlangDefContractCase ) )+ ( (lv_rea_7_0= ruleSlangReads ) )? ( (lv_mod_8_0= ruleSlangModifies ) )? ) )
            {
            // InternalGumboParser.g:2290:3: ()
            // InternalGumboParser.g:2291:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSlangDefContractAccess().getSlangDefContractAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Spec,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSlangDefContractAccess().getSpecKeyword_1());
              		
            }
            // InternalGumboParser.g:2304:3: ( ( ( (lv_rea_2_0= ruleSlangReads ) )? ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_mod_4_0= ruleSlangModifies ) )? ( (lv_ens_5_0= ruleSlangEnsures ) )? ) | ( ( (lv_contracts_6_0= ruleSlangDefContractCase ) )+ ( (lv_rea_7_0= ruleSlangReads ) )? ( (lv_mod_8_0= ruleSlangModifies ) )? ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==EOF||(LA51_0>=Modifies && LA51_0<=Requires)||LA51_0==Ensures||LA51_0==Reads||LA51_0==ColonEqualsSign) ) {
                alt51=1;
            }
            else if ( (LA51_0==Case) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalGumboParser.g:2305:4: ( ( (lv_rea_2_0= ruleSlangReads ) )? ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_mod_4_0= ruleSlangModifies ) )? ( (lv_ens_5_0= ruleSlangEnsures ) )? )
                    {
                    // InternalGumboParser.g:2305:4: ( ( (lv_rea_2_0= ruleSlangReads ) )? ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_mod_4_0= ruleSlangModifies ) )? ( (lv_ens_5_0= ruleSlangEnsures ) )? )
                    // InternalGumboParser.g:2306:5: ( (lv_rea_2_0= ruleSlangReads ) )? ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_mod_4_0= ruleSlangModifies ) )? ( (lv_ens_5_0= ruleSlangEnsures ) )?
                    {
                    // InternalGumboParser.g:2306:5: ( (lv_rea_2_0= ruleSlangReads ) )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==Reads) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalGumboParser.g:2307:6: (lv_rea_2_0= ruleSlangReads )
                            {
                            // InternalGumboParser.g:2307:6: (lv_rea_2_0= ruleSlangReads )
                            // InternalGumboParser.g:2308:7: lv_rea_2_0= ruleSlangReads
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSlangDefContractAccess().getReaSlangReadsParserRuleCall_2_0_0_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_47);
                            lv_rea_2_0=ruleSlangReads();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getSlangDefContractRule());
                              							}
                              							set(
                              								current,
                              								"rea",
                              								lv_rea_2_0,
                              								"org.sireum.aadl.gumbo.Gumbo.SlangReads");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }
                            break;

                    }

                    // InternalGumboParser.g:2325:5: ( (lv_req_3_0= ruleSlangRequires ) )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==Requires) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalGumboParser.g:2326:6: (lv_req_3_0= ruleSlangRequires )
                            {
                            // InternalGumboParser.g:2326:6: (lv_req_3_0= ruleSlangRequires )
                            // InternalGumboParser.g:2327:7: lv_req_3_0= ruleSlangRequires
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSlangDefContractAccess().getReqSlangRequiresParserRuleCall_2_0_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_48);
                            lv_req_3_0=ruleSlangRequires();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getSlangDefContractRule());
                              							}
                              							set(
                              								current,
                              								"req",
                              								lv_req_3_0,
                              								"org.sireum.aadl.gumbo.Gumbo.SlangRequires");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }
                            break;

                    }

                    // InternalGumboParser.g:2344:5: ( (lv_mod_4_0= ruleSlangModifies ) )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==Modifies) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalGumboParser.g:2345:6: (lv_mod_4_0= ruleSlangModifies )
                            {
                            // InternalGumboParser.g:2345:6: (lv_mod_4_0= ruleSlangModifies )
                            // InternalGumboParser.g:2346:7: lv_mod_4_0= ruleSlangModifies
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSlangDefContractAccess().getModSlangModifiesParserRuleCall_2_0_2_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_49);
                            lv_mod_4_0=ruleSlangModifies();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getSlangDefContractRule());
                              							}
                              							set(
                              								current,
                              								"mod",
                              								lv_mod_4_0,
                              								"org.sireum.aadl.gumbo.Gumbo.SlangModifies");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }
                            break;

                    }

                    // InternalGumboParser.g:2363:5: ( (lv_ens_5_0= ruleSlangEnsures ) )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==Ensures) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // InternalGumboParser.g:2364:6: (lv_ens_5_0= ruleSlangEnsures )
                            {
                            // InternalGumboParser.g:2364:6: (lv_ens_5_0= ruleSlangEnsures )
                            // InternalGumboParser.g:2365:7: lv_ens_5_0= ruleSlangEnsures
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSlangDefContractAccess().getEnsSlangEnsuresParserRuleCall_2_0_3_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_ens_5_0=ruleSlangEnsures();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getSlangDefContractRule());
                              							}
                              							set(
                              								current,
                              								"ens",
                              								lv_ens_5_0,
                              								"org.sireum.aadl.gumbo.Gumbo.SlangEnsures");
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
                    // InternalGumboParser.g:2384:4: ( ( (lv_contracts_6_0= ruleSlangDefContractCase ) )+ ( (lv_rea_7_0= ruleSlangReads ) )? ( (lv_mod_8_0= ruleSlangModifies ) )? )
                    {
                    // InternalGumboParser.g:2384:4: ( ( (lv_contracts_6_0= ruleSlangDefContractCase ) )+ ( (lv_rea_7_0= ruleSlangReads ) )? ( (lv_mod_8_0= ruleSlangModifies ) )? )
                    // InternalGumboParser.g:2385:5: ( (lv_contracts_6_0= ruleSlangDefContractCase ) )+ ( (lv_rea_7_0= ruleSlangReads ) )? ( (lv_mod_8_0= ruleSlangModifies ) )?
                    {
                    // InternalGumboParser.g:2385:5: ( (lv_contracts_6_0= ruleSlangDefContractCase ) )+
                    int cnt48=0;
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==Case) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalGumboParser.g:2386:6: (lv_contracts_6_0= ruleSlangDefContractCase )
                    	    {
                    	    // InternalGumboParser.g:2386:6: (lv_contracts_6_0= ruleSlangDefContractCase )
                    	    // InternalGumboParser.g:2387:7: lv_contracts_6_0= ruleSlangDefContractCase
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSlangDefContractAccess().getContractsSlangDefContractCaseParserRuleCall_2_1_0_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_46);
                    	    lv_contracts_6_0=ruleSlangDefContractCase();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSlangDefContractRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"contracts",
                    	      								lv_contracts_6_0,
                    	      								"org.sireum.aadl.gumbo.Gumbo.SlangDefContractCase");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt48 >= 1 ) break loop48;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(48, input);
                                throw eee;
                        }
                        cnt48++;
                    } while (true);

                    // InternalGumboParser.g:2404:5: ( (lv_rea_7_0= ruleSlangReads ) )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==Reads) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalGumboParser.g:2405:6: (lv_rea_7_0= ruleSlangReads )
                            {
                            // InternalGumboParser.g:2405:6: (lv_rea_7_0= ruleSlangReads )
                            // InternalGumboParser.g:2406:7: lv_rea_7_0= ruleSlangReads
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSlangDefContractAccess().getReaSlangReadsParserRuleCall_2_1_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_50);
                            lv_rea_7_0=ruleSlangReads();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getSlangDefContractRule());
                              							}
                              							set(
                              								current,
                              								"rea",
                              								lv_rea_7_0,
                              								"org.sireum.aadl.gumbo.Gumbo.SlangReads");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }
                            break;

                    }

                    // InternalGumboParser.g:2423:5: ( (lv_mod_8_0= ruleSlangModifies ) )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==Modifies) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // InternalGumboParser.g:2424:6: (lv_mod_8_0= ruleSlangModifies )
                            {
                            // InternalGumboParser.g:2424:6: (lv_mod_8_0= ruleSlangModifies )
                            // InternalGumboParser.g:2425:7: lv_mod_8_0= ruleSlangModifies
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSlangDefContractAccess().getModSlangModifiesParserRuleCall_2_1_2_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_mod_8_0=ruleSlangModifies();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getSlangDefContractRule());
                              							}
                              							set(
                              								current,
                              								"mod",
                              								lv_mod_8_0,
                              								"org.sireum.aadl.gumbo.Gumbo.SlangModifies");
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
    // $ANTLR end "ruleSlangDefContract"


    // $ANTLR start "entryRuleSlangDefContractCase"
    // InternalGumboParser.g:2448:1: entryRuleSlangDefContractCase returns [EObject current=null] : iv_ruleSlangDefContractCase= ruleSlangDefContractCase EOF ;
    public final EObject entryRuleSlangDefContractCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangDefContractCase = null;


        try {
            // InternalGumboParser.g:2448:61: (iv_ruleSlangDefContractCase= ruleSlangDefContractCase EOF )
            // InternalGumboParser.g:2449:2: iv_ruleSlangDefContractCase= ruleSlangDefContractCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlangDefContractCaseRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlangDefContractCase=ruleSlangDefContractCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlangDefContractCase; 
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
    // $ANTLR end "entryRuleSlangDefContractCase"


    // $ANTLR start "ruleSlangDefContractCase"
    // InternalGumboParser.g:2455:1: ruleSlangDefContractCase returns [EObject current=null] : ( () otherlv_1= Case this_SLANG_STRING_2= RULE_SLANG_STRING ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_ens_4_0= ruleSlangEnsures ) )? ) ;
    public final EObject ruleSlangDefContractCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_SLANG_STRING_2=null;
        EObject lv_req_3_0 = null;

        EObject lv_ens_4_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2461:2: ( ( () otherlv_1= Case this_SLANG_STRING_2= RULE_SLANG_STRING ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_ens_4_0= ruleSlangEnsures ) )? ) )
            // InternalGumboParser.g:2462:2: ( () otherlv_1= Case this_SLANG_STRING_2= RULE_SLANG_STRING ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_ens_4_0= ruleSlangEnsures ) )? )
            {
            // InternalGumboParser.g:2462:2: ( () otherlv_1= Case this_SLANG_STRING_2= RULE_SLANG_STRING ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_ens_4_0= ruleSlangEnsures ) )? )
            // InternalGumboParser.g:2463:3: () otherlv_1= Case this_SLANG_STRING_2= RULE_SLANG_STRING ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_ens_4_0= ruleSlangEnsures ) )?
            {
            // InternalGumboParser.g:2463:3: ()
            // InternalGumboParser.g:2464:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSlangDefContractCaseAccess().getSlangDefContractCaseAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Case,FollowSets000.FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSlangDefContractCaseAccess().getCaseKeyword_1());
              		
            }
            this_SLANG_STRING_2=(Token)match(input,RULE_SLANG_STRING,FollowSets000.FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_SLANG_STRING_2, grammarAccess.getSlangDefContractCaseAccess().getSLANG_STRINGTerminalRuleCall_2());
              		
            }
            // InternalGumboParser.g:2481:3: ( (lv_req_3_0= ruleSlangRequires ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==Requires) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalGumboParser.g:2482:4: (lv_req_3_0= ruleSlangRequires )
                    {
                    // InternalGumboParser.g:2482:4: (lv_req_3_0= ruleSlangRequires )
                    // InternalGumboParser.g:2483:5: lv_req_3_0= ruleSlangRequires
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangDefContractCaseAccess().getReqSlangRequiresParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_49);
                    lv_req_3_0=ruleSlangRequires();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSlangDefContractCaseRule());
                      					}
                      					set(
                      						current,
                      						"req",
                      						lv_req_3_0,
                      						"org.sireum.aadl.gumbo.Gumbo.SlangRequires");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalGumboParser.g:2500:3: ( (lv_ens_4_0= ruleSlangEnsures ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==Ensures) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalGumboParser.g:2501:4: (lv_ens_4_0= ruleSlangEnsures )
                    {
                    // InternalGumboParser.g:2501:4: (lv_ens_4_0= ruleSlangEnsures )
                    // InternalGumboParser.g:2502:5: lv_ens_4_0= ruleSlangEnsures
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangDefContractCaseAccess().getEnsSlangEnsuresParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_ens_4_0=ruleSlangEnsures();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSlangDefContractCaseRule());
                      					}
                      					set(
                      						current,
                      						"ens",
                      						lv_ens_4_0,
                      						"org.sireum.aadl.gumbo.Gumbo.SlangEnsures");
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
    // $ANTLR end "ruleSlangDefContractCase"


    // $ANTLR start "entryRuleSlangSupr"
    // InternalGumboParser.g:2523:1: entryRuleSlangSupr returns [EObject current=null] : iv_ruleSlangSupr= ruleSlangSupr EOF ;
    public final EObject entryRuleSlangSupr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangSupr = null;


        try {
            // InternalGumboParser.g:2523:50: (iv_ruleSlangSupr= ruleSlangSupr EOF )
            // InternalGumboParser.g:2524:2: iv_ruleSlangSupr= ruleSlangSupr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlangSuprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlangSupr=ruleSlangSupr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlangSupr; 
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
    // $ANTLR end "entryRuleSlangSupr"


    // $ANTLR start "ruleSlangSupr"
    // InternalGumboParser.g:2530:1: ruleSlangSupr returns [EObject current=null] : ( ( (lv_name_0_0= ruleSlangName ) ) ( (lv_args_1_0= ruleSlangTypeArgs ) )? ) ;
    public final EObject ruleSlangSupr() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_args_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2536:2: ( ( ( (lv_name_0_0= ruleSlangName ) ) ( (lv_args_1_0= ruleSlangTypeArgs ) )? ) )
            // InternalGumboParser.g:2537:2: ( ( (lv_name_0_0= ruleSlangName ) ) ( (lv_args_1_0= ruleSlangTypeArgs ) )? )
            {
            // InternalGumboParser.g:2537:2: ( ( (lv_name_0_0= ruleSlangName ) ) ( (lv_args_1_0= ruleSlangTypeArgs ) )? )
            // InternalGumboParser.g:2538:3: ( (lv_name_0_0= ruleSlangName ) ) ( (lv_args_1_0= ruleSlangTypeArgs ) )?
            {
            // InternalGumboParser.g:2538:3: ( (lv_name_0_0= ruleSlangName ) )
            // InternalGumboParser.g:2539:4: (lv_name_0_0= ruleSlangName )
            {
            // InternalGumboParser.g:2539:4: (lv_name_0_0= ruleSlangName )
            // InternalGumboParser.g:2540:5: lv_name_0_0= ruleSlangName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangSuprAccess().getNameSlangNameParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_53);
            lv_name_0_0=ruleSlangName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSlangSuprRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.sireum.aadl.gumbo.Gumbo.SlangName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumboParser.g:2557:3: ( (lv_args_1_0= ruleSlangTypeArgs ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==LeftSquareBracket) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalGumboParser.g:2558:4: (lv_args_1_0= ruleSlangTypeArgs )
                    {
                    // InternalGumboParser.g:2558:4: (lv_args_1_0= ruleSlangTypeArgs )
                    // InternalGumboParser.g:2559:5: lv_args_1_0= ruleSlangTypeArgs
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangSuprAccess().getArgsSlangTypeArgsParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_args_1_0=ruleSlangTypeArgs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSlangSuprRule());
                      					}
                      					set(
                      						current,
                      						"args",
                      						lv_args_1_0,
                      						"org.sireum.aadl.gumbo.Gumbo.SlangTypeArgs");
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
    // $ANTLR end "ruleSlangSupr"


    // $ANTLR start "entryRuleSlangName"
    // InternalGumboParser.g:2580:1: entryRuleSlangName returns [String current=null] : iv_ruleSlangName= ruleSlangName EOF ;
    public final String entryRuleSlangName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSlangName = null;


        try {
            // InternalGumboParser.g:2580:49: (iv_ruleSlangName= ruleSlangName EOF )
            // InternalGumboParser.g:2581:2: iv_ruleSlangName= ruleSlangName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlangNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlangName=ruleSlangName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlangName.getText(); 
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
    // $ANTLR end "entryRuleSlangName"


    // $ANTLR start "ruleSlangName"
    // InternalGumboParser.g:2587:1: ruleSlangName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleSlangName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalGumboParser.g:2593:2: ( (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) )
            // InternalGumboParser.g:2594:2: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
            {
            // InternalGumboParser.g:2594:2: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
            // InternalGumboParser.g:2595:3: this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getSlangNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalGumboParser.g:2602:3: (kw= FullStop this_ID_2= RULE_ID )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==FullStop) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalGumboParser.g:2603:4: kw= FullStop this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,FullStop,FollowSets000.FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getSlangNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_54); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getSlangNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop55;
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
    // $ANTLR end "ruleSlangName"


    // $ANTLR start "entryRuleSlangInvariant"
    // InternalGumboParser.g:2620:1: entryRuleSlangInvariant returns [EObject current=null] : iv_ruleSlangInvariant= ruleSlangInvariant EOF ;
    public final EObject entryRuleSlangInvariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangInvariant = null;


        try {
            // InternalGumboParser.g:2620:55: (iv_ruleSlangInvariant= ruleSlangInvariant EOF )
            // InternalGumboParser.g:2621:2: iv_ruleSlangInvariant= ruleSlangInvariant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlangInvariantRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlangInvariant=ruleSlangInvariant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlangInvariant; 
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
    // $ANTLR end "entryRuleSlangInvariant"


    // $ANTLR start "ruleSlangInvariant"
    // InternalGumboParser.g:2627:1: ruleSlangInvariant returns [EObject current=null] : (otherlv_0= Invariant ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* ) ;
    public final EObject ruleSlangInvariant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exprs_1_0 = null;

        EObject lv_exprs_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2633:2: ( (otherlv_0= Invariant ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* ) )
            // InternalGumboParser.g:2634:2: (otherlv_0= Invariant ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* )
            {
            // InternalGumboParser.g:2634:2: (otherlv_0= Invariant ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* )
            // InternalGumboParser.g:2635:3: otherlv_0= Invariant ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )*
            {
            otherlv_0=(Token)match(input,Invariant,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangInvariantAccess().getInvariantKeyword_0());
              		
            }
            // InternalGumboParser.g:2639:3: ( (lv_exprs_1_0= ruleExpr ) )
            // InternalGumboParser.g:2640:4: (lv_exprs_1_0= ruleExpr )
            {
            // InternalGumboParser.g:2640:4: (lv_exprs_1_0= ruleExpr )
            // InternalGumboParser.g:2641:5: lv_exprs_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangInvariantAccess().getExprsExprParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_55);
            lv_exprs_1_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSlangInvariantRule());
              					}
              					add(
              						current,
              						"exprs",
              						lv_exprs_1_0,
              						"org.sireum.aadl.gumbo.Gumbo.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumboParser.g:2658:3: (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==Comma) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalGumboParser.g:2659:4: otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FollowSets000.FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSlangInvariantAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalGumboParser.g:2663:4: ( (lv_exprs_3_0= ruleExpr ) )
            	    // InternalGumboParser.g:2664:5: (lv_exprs_3_0= ruleExpr )
            	    {
            	    // InternalGumboParser.g:2664:5: (lv_exprs_3_0= ruleExpr )
            	    // InternalGumboParser.g:2665:6: lv_exprs_3_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSlangInvariantAccess().getExprsExprParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_55);
            	    lv_exprs_3_0=ruleExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSlangInvariantRule());
            	      						}
            	      						add(
            	      							current,
            	      							"exprs",
            	      							lv_exprs_3_0,
            	      							"org.sireum.aadl.gumbo.Gumbo.Expr");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
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
    // $ANTLR end "ruleSlangInvariant"


    // $ANTLR start "entryRuleSlangReads"
    // InternalGumboParser.g:2687:1: entryRuleSlangReads returns [EObject current=null] : iv_ruleSlangReads= ruleSlangReads EOF ;
    public final EObject entryRuleSlangReads() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangReads = null;


        try {
            // InternalGumboParser.g:2687:51: (iv_ruleSlangReads= ruleSlangReads EOF )
            // InternalGumboParser.g:2688:2: iv_ruleSlangReads= ruleSlangReads EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlangReadsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlangReads=ruleSlangReads();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlangReads; 
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
    // $ANTLR end "entryRuleSlangReads"


    // $ANTLR start "ruleSlangReads"
    // InternalGumboParser.g:2694:1: ruleSlangReads returns [EObject current=null] : (otherlv_0= Reads ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* ) ;
    public final EObject ruleSlangReads() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exprs_1_0 = null;

        EObject lv_exprs_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2700:2: ( (otherlv_0= Reads ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* ) )
            // InternalGumboParser.g:2701:2: (otherlv_0= Reads ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* )
            {
            // InternalGumboParser.g:2701:2: (otherlv_0= Reads ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* )
            // InternalGumboParser.g:2702:3: otherlv_0= Reads ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )*
            {
            otherlv_0=(Token)match(input,Reads,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangReadsAccess().getReadsKeyword_0());
              		
            }
            // InternalGumboParser.g:2706:3: ( (lv_exprs_1_0= ruleExpr ) )
            // InternalGumboParser.g:2707:4: (lv_exprs_1_0= ruleExpr )
            {
            // InternalGumboParser.g:2707:4: (lv_exprs_1_0= ruleExpr )
            // InternalGumboParser.g:2708:5: lv_exprs_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangReadsAccess().getExprsExprParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_55);
            lv_exprs_1_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSlangReadsRule());
              					}
              					add(
              						current,
              						"exprs",
              						lv_exprs_1_0,
              						"org.sireum.aadl.gumbo.Gumbo.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumboParser.g:2725:3: (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==Comma) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalGumboParser.g:2726:4: otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FollowSets000.FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSlangReadsAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalGumboParser.g:2730:4: ( (lv_exprs_3_0= ruleExpr ) )
            	    // InternalGumboParser.g:2731:5: (lv_exprs_3_0= ruleExpr )
            	    {
            	    // InternalGumboParser.g:2731:5: (lv_exprs_3_0= ruleExpr )
            	    // InternalGumboParser.g:2732:6: lv_exprs_3_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSlangReadsAccess().getExprsExprParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_55);
            	    lv_exprs_3_0=ruleExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSlangReadsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"exprs",
            	      							lv_exprs_3_0,
            	      							"org.sireum.aadl.gumbo.Gumbo.Expr");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
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
    // $ANTLR end "ruleSlangReads"


    // $ANTLR start "entryRuleSlangRequires"
    // InternalGumboParser.g:2754:1: entryRuleSlangRequires returns [EObject current=null] : iv_ruleSlangRequires= ruleSlangRequires EOF ;
    public final EObject entryRuleSlangRequires() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangRequires = null;


        try {
            // InternalGumboParser.g:2754:54: (iv_ruleSlangRequires= ruleSlangRequires EOF )
            // InternalGumboParser.g:2755:2: iv_ruleSlangRequires= ruleSlangRequires EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlangRequiresRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlangRequires=ruleSlangRequires();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlangRequires; 
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
    // $ANTLR end "entryRuleSlangRequires"


    // $ANTLR start "ruleSlangRequires"
    // InternalGumboParser.g:2761:1: ruleSlangRequires returns [EObject current=null] : (otherlv_0= Requires ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* ) ;
    public final EObject ruleSlangRequires() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exprs_1_0 = null;

        EObject lv_exprs_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2767:2: ( (otherlv_0= Requires ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* ) )
            // InternalGumboParser.g:2768:2: (otherlv_0= Requires ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* )
            {
            // InternalGumboParser.g:2768:2: (otherlv_0= Requires ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* )
            // InternalGumboParser.g:2769:3: otherlv_0= Requires ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )*
            {
            otherlv_0=(Token)match(input,Requires,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangRequiresAccess().getRequiresKeyword_0());
              		
            }
            // InternalGumboParser.g:2773:3: ( (lv_exprs_1_0= ruleExpr ) )
            // InternalGumboParser.g:2774:4: (lv_exprs_1_0= ruleExpr )
            {
            // InternalGumboParser.g:2774:4: (lv_exprs_1_0= ruleExpr )
            // InternalGumboParser.g:2775:5: lv_exprs_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangRequiresAccess().getExprsExprParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_55);
            lv_exprs_1_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSlangRequiresRule());
              					}
              					add(
              						current,
              						"exprs",
              						lv_exprs_1_0,
              						"org.sireum.aadl.gumbo.Gumbo.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumboParser.g:2792:3: (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==Comma) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalGumboParser.g:2793:4: otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FollowSets000.FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSlangRequiresAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalGumboParser.g:2797:4: ( (lv_exprs_3_0= ruleExpr ) )
            	    // InternalGumboParser.g:2798:5: (lv_exprs_3_0= ruleExpr )
            	    {
            	    // InternalGumboParser.g:2798:5: (lv_exprs_3_0= ruleExpr )
            	    // InternalGumboParser.g:2799:6: lv_exprs_3_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSlangRequiresAccess().getExprsExprParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_55);
            	    lv_exprs_3_0=ruleExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSlangRequiresRule());
            	      						}
            	      						add(
            	      							current,
            	      							"exprs",
            	      							lv_exprs_3_0,
            	      							"org.sireum.aadl.gumbo.Gumbo.Expr");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
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
    // $ANTLR end "ruleSlangRequires"


    // $ANTLR start "entryRuleSlangModifies"
    // InternalGumboParser.g:2821:1: entryRuleSlangModifies returns [EObject current=null] : iv_ruleSlangModifies= ruleSlangModifies EOF ;
    public final EObject entryRuleSlangModifies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangModifies = null;


        try {
            // InternalGumboParser.g:2821:54: (iv_ruleSlangModifies= ruleSlangModifies EOF )
            // InternalGumboParser.g:2822:2: iv_ruleSlangModifies= ruleSlangModifies EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlangModifiesRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlangModifies=ruleSlangModifies();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlangModifies; 
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
    // $ANTLR end "entryRuleSlangModifies"


    // $ANTLR start "ruleSlangModifies"
    // InternalGumboParser.g:2828:1: ruleSlangModifies returns [EObject current=null] : (otherlv_0= Modifies ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* ) ;
    public final EObject ruleSlangModifies() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exprs_1_0 = null;

        EObject lv_exprs_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2834:2: ( (otherlv_0= Modifies ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* ) )
            // InternalGumboParser.g:2835:2: (otherlv_0= Modifies ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* )
            {
            // InternalGumboParser.g:2835:2: (otherlv_0= Modifies ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* )
            // InternalGumboParser.g:2836:3: otherlv_0= Modifies ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )*
            {
            otherlv_0=(Token)match(input,Modifies,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangModifiesAccess().getModifiesKeyword_0());
              		
            }
            // InternalGumboParser.g:2840:3: ( (lv_exprs_1_0= ruleExpr ) )
            // InternalGumboParser.g:2841:4: (lv_exprs_1_0= ruleExpr )
            {
            // InternalGumboParser.g:2841:4: (lv_exprs_1_0= ruleExpr )
            // InternalGumboParser.g:2842:5: lv_exprs_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangModifiesAccess().getExprsExprParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_55);
            lv_exprs_1_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSlangModifiesRule());
              					}
              					add(
              						current,
              						"exprs",
              						lv_exprs_1_0,
              						"org.sireum.aadl.gumbo.Gumbo.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumboParser.g:2859:3: (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==Comma) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalGumboParser.g:2860:4: otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FollowSets000.FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSlangModifiesAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalGumboParser.g:2864:4: ( (lv_exprs_3_0= ruleExpr ) )
            	    // InternalGumboParser.g:2865:5: (lv_exprs_3_0= ruleExpr )
            	    {
            	    // InternalGumboParser.g:2865:5: (lv_exprs_3_0= ruleExpr )
            	    // InternalGumboParser.g:2866:6: lv_exprs_3_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSlangModifiesAccess().getExprsExprParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_55);
            	    lv_exprs_3_0=ruleExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSlangModifiesRule());
            	      						}
            	      						add(
            	      							current,
            	      							"exprs",
            	      							lv_exprs_3_0,
            	      							"org.sireum.aadl.gumbo.Gumbo.Expr");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop59;
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
    // $ANTLR end "ruleSlangModifies"


    // $ANTLR start "entryRuleSlangEnsures"
    // InternalGumboParser.g:2888:1: entryRuleSlangEnsures returns [EObject current=null] : iv_ruleSlangEnsures= ruleSlangEnsures EOF ;
    public final EObject entryRuleSlangEnsures() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangEnsures = null;


        try {
            // InternalGumboParser.g:2888:53: (iv_ruleSlangEnsures= ruleSlangEnsures EOF )
            // InternalGumboParser.g:2889:2: iv_ruleSlangEnsures= ruleSlangEnsures EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlangEnsuresRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlangEnsures=ruleSlangEnsures();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlangEnsures; 
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
    // $ANTLR end "entryRuleSlangEnsures"


    // $ANTLR start "ruleSlangEnsures"
    // InternalGumboParser.g:2895:1: ruleSlangEnsures returns [EObject current=null] : (otherlv_0= Ensures ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* ) ;
    public final EObject ruleSlangEnsures() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exprs_1_0 = null;

        EObject lv_exprs_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2901:2: ( (otherlv_0= Ensures ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* ) )
            // InternalGumboParser.g:2902:2: (otherlv_0= Ensures ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* )
            {
            // InternalGumboParser.g:2902:2: (otherlv_0= Ensures ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* )
            // InternalGumboParser.g:2903:3: otherlv_0= Ensures ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )*
            {
            otherlv_0=(Token)match(input,Ensures,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangEnsuresAccess().getEnsuresKeyword_0());
              		
            }
            // InternalGumboParser.g:2907:3: ( (lv_exprs_1_0= ruleExpr ) )
            // InternalGumboParser.g:2908:4: (lv_exprs_1_0= ruleExpr )
            {
            // InternalGumboParser.g:2908:4: (lv_exprs_1_0= ruleExpr )
            // InternalGumboParser.g:2909:5: lv_exprs_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangEnsuresAccess().getExprsExprParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_55);
            lv_exprs_1_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSlangEnsuresRule());
              					}
              					add(
              						current,
              						"exprs",
              						lv_exprs_1_0,
              						"org.sireum.aadl.gumbo.Gumbo.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumboParser.g:2926:3: (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==Comma) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalGumboParser.g:2927:4: otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FollowSets000.FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSlangEnsuresAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalGumboParser.g:2931:4: ( (lv_exprs_3_0= ruleExpr ) )
            	    // InternalGumboParser.g:2932:5: (lv_exprs_3_0= ruleExpr )
            	    {
            	    // InternalGumboParser.g:2932:5: (lv_exprs_3_0= ruleExpr )
            	    // InternalGumboParser.g:2933:6: lv_exprs_3_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSlangEnsuresAccess().getExprsExprParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_55);
            	    lv_exprs_3_0=ruleExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSlangEnsuresRule());
            	      						}
            	      						add(
            	      							current,
            	      							"exprs",
            	      							lv_exprs_3_0,
            	      							"org.sireum.aadl.gumbo.Gumbo.Expr");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
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
    // $ANTLR end "ruleSlangEnsures"


    // $ANTLR start "entryRuleSlangStmt"
    // InternalGumboParser.g:2955:1: entryRuleSlangStmt returns [EObject current=null] : iv_ruleSlangStmt= ruleSlangStmt EOF ;
    public final EObject entryRuleSlangStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangStmt = null;


        try {
            // InternalGumboParser.g:2955:50: (iv_ruleSlangStmt= ruleSlangStmt EOF )
            // InternalGumboParser.g:2956:2: iv_ruleSlangStmt= ruleSlangStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlangStmtRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlangStmt=ruleSlangStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlangStmt; 
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
    // $ANTLR end "entryRuleSlangStmt"


    // $ANTLR start "ruleSlangStmt"
    // InternalGumboParser.g:2962:1: ruleSlangStmt returns [EObject current=null] : ( ( () ( (lv_d_1_0= ruleSlangVarDef ) ) ) | ( () otherlv_3= If ( (lv_cond_4_0= ruleExpr ) ) ( (lv_b_5_0= ruleSlangBlock ) ) ( (lv_e_6_0= ruleSlangElse ) )? ) | ( () otherlv_8= While ( (lv_cond_9_0= ruleExpr ) ) ( (lv_l_10_0= ruleSlangLoopContract ) ) ( (lv_b_11_0= ruleSlangBlock ) ) ) | ( () otherlv_13= Match ( (lv_testExpr_14_0= ruleExpr ) ) otherlv_15= LeftCurlyBracket ( (lv_c_16_0= ruleSlangCase ) )* otherlv_17= RightCurlyBracket ) | ( () otherlv_19= Spec ( (lv_b_20_0= ruleSlangBlock ) ) ) | ( () otherlv_22= Assume ( (lv_e_23_0= ruleExpr ) ) (this_SLANG_STRING_24= RULE_SLANG_STRING )? ) | ( () otherlv_26= Assert ( (lv_e_27_0= ruleExpr ) ) (this_SLANG_STRING_28= RULE_SLANG_STRING )? ) | ( () otherlv_30= Halt (this_SLANG_STRING_31= RULE_SLANG_STRING )? ) | ( () otherlv_33= Do ( (lv_e_34_0= ruleExpr ) ) ) | ( () ( (otherlv_36= RULE_ID ) ) (otherlv_37= Colon | ( ( (lv_l_38_0= ruleSlangLHSSuffix ) )* ( (otherlv_39= ColonEqualsSign | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleExpr ) ) )? ) ) ) ) ;
    public final EObject ruleSlangStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_8=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_22=null;
        Token this_SLANG_STRING_24=null;
        Token otherlv_26=null;
        Token this_SLANG_STRING_28=null;
        Token otherlv_30=null;
        Token this_SLANG_STRING_31=null;
        Token otherlv_33=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token this_DEFOP_40=null;
        EObject lv_d_1_0 = null;

        EObject lv_cond_4_0 = null;

        EObject lv_b_5_0 = null;

        EObject lv_e_6_0 = null;

        EObject lv_cond_9_0 = null;

        EObject lv_l_10_0 = null;

        EObject lv_b_11_0 = null;

        EObject lv_testExpr_14_0 = null;

        EObject lv_c_16_0 = null;

        EObject lv_b_20_0 = null;

        EObject lv_e_23_0 = null;

        EObject lv_e_27_0 = null;

        EObject lv_e_34_0 = null;

        EObject lv_l_38_0 = null;

        EObject lv_e_41_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2968:2: ( ( ( () ( (lv_d_1_0= ruleSlangVarDef ) ) ) | ( () otherlv_3= If ( (lv_cond_4_0= ruleExpr ) ) ( (lv_b_5_0= ruleSlangBlock ) ) ( (lv_e_6_0= ruleSlangElse ) )? ) | ( () otherlv_8= While ( (lv_cond_9_0= ruleExpr ) ) ( (lv_l_10_0= ruleSlangLoopContract ) ) ( (lv_b_11_0= ruleSlangBlock ) ) ) | ( () otherlv_13= Match ( (lv_testExpr_14_0= ruleExpr ) ) otherlv_15= LeftCurlyBracket ( (lv_c_16_0= ruleSlangCase ) )* otherlv_17= RightCurlyBracket ) | ( () otherlv_19= Spec ( (lv_b_20_0= ruleSlangBlock ) ) ) | ( () otherlv_22= Assume ( (lv_e_23_0= ruleExpr ) ) (this_SLANG_STRING_24= RULE_SLANG_STRING )? ) | ( () otherlv_26= Assert ( (lv_e_27_0= ruleExpr ) ) (this_SLANG_STRING_28= RULE_SLANG_STRING )? ) | ( () otherlv_30= Halt (this_SLANG_STRING_31= RULE_SLANG_STRING )? ) | ( () otherlv_33= Do ( (lv_e_34_0= ruleExpr ) ) ) | ( () ( (otherlv_36= RULE_ID ) ) (otherlv_37= Colon | ( ( (lv_l_38_0= ruleSlangLHSSuffix ) )* ( (otherlv_39= ColonEqualsSign | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleExpr ) ) )? ) ) ) ) )
            // InternalGumboParser.g:2969:2: ( ( () ( (lv_d_1_0= ruleSlangVarDef ) ) ) | ( () otherlv_3= If ( (lv_cond_4_0= ruleExpr ) ) ( (lv_b_5_0= ruleSlangBlock ) ) ( (lv_e_6_0= ruleSlangElse ) )? ) | ( () otherlv_8= While ( (lv_cond_9_0= ruleExpr ) ) ( (lv_l_10_0= ruleSlangLoopContract ) ) ( (lv_b_11_0= ruleSlangBlock ) ) ) | ( () otherlv_13= Match ( (lv_testExpr_14_0= ruleExpr ) ) otherlv_15= LeftCurlyBracket ( (lv_c_16_0= ruleSlangCase ) )* otherlv_17= RightCurlyBracket ) | ( () otherlv_19= Spec ( (lv_b_20_0= ruleSlangBlock ) ) ) | ( () otherlv_22= Assume ( (lv_e_23_0= ruleExpr ) ) (this_SLANG_STRING_24= RULE_SLANG_STRING )? ) | ( () otherlv_26= Assert ( (lv_e_27_0= ruleExpr ) ) (this_SLANG_STRING_28= RULE_SLANG_STRING )? ) | ( () otherlv_30= Halt (this_SLANG_STRING_31= RULE_SLANG_STRING )? ) | ( () otherlv_33= Do ( (lv_e_34_0= ruleExpr ) ) ) | ( () ( (otherlv_36= RULE_ID ) ) (otherlv_37= Colon | ( ( (lv_l_38_0= ruleSlangLHSSuffix ) )* ( (otherlv_39= ColonEqualsSign | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleExpr ) ) )? ) ) ) )
            {
            // InternalGumboParser.g:2969:2: ( ( () ( (lv_d_1_0= ruleSlangVarDef ) ) ) | ( () otherlv_3= If ( (lv_cond_4_0= ruleExpr ) ) ( (lv_b_5_0= ruleSlangBlock ) ) ( (lv_e_6_0= ruleSlangElse ) )? ) | ( () otherlv_8= While ( (lv_cond_9_0= ruleExpr ) ) ( (lv_l_10_0= ruleSlangLoopContract ) ) ( (lv_b_11_0= ruleSlangBlock ) ) ) | ( () otherlv_13= Match ( (lv_testExpr_14_0= ruleExpr ) ) otherlv_15= LeftCurlyBracket ( (lv_c_16_0= ruleSlangCase ) )* otherlv_17= RightCurlyBracket ) | ( () otherlv_19= Spec ( (lv_b_20_0= ruleSlangBlock ) ) ) | ( () otherlv_22= Assume ( (lv_e_23_0= ruleExpr ) ) (this_SLANG_STRING_24= RULE_SLANG_STRING )? ) | ( () otherlv_26= Assert ( (lv_e_27_0= ruleExpr ) ) (this_SLANG_STRING_28= RULE_SLANG_STRING )? ) | ( () otherlv_30= Halt (this_SLANG_STRING_31= RULE_SLANG_STRING )? ) | ( () otherlv_33= Do ( (lv_e_34_0= ruleExpr ) ) ) | ( () ( (otherlv_36= RULE_ID ) ) (otherlv_37= Colon | ( ( (lv_l_38_0= ruleSlangLHSSuffix ) )* ( (otherlv_39= ColonEqualsSign | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleExpr ) ) )? ) ) ) )
            int alt70=10;
            switch ( input.LA(1) ) {
            case Val:
            case Var:
                {
                alt70=1;
                }
                break;
            case If:
                {
                alt70=2;
                }
                break;
            case While:
                {
                alt70=3;
                }
                break;
            case Match:
                {
                alt70=4;
                }
                break;
            case Spec:
                {
                alt70=5;
                }
                break;
            case Assume:
                {
                alt70=6;
                }
                break;
            case Assert:
                {
                alt70=7;
                }
                break;
            case Halt:
                {
                alt70=8;
                }
                break;
            case Do:
                {
                alt70=9;
                }
                break;
            case RULE_ID:
                {
                alt70=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // InternalGumboParser.g:2970:3: ( () ( (lv_d_1_0= ruleSlangVarDef ) ) )
                    {
                    // InternalGumboParser.g:2970:3: ( () ( (lv_d_1_0= ruleSlangVarDef ) ) )
                    // InternalGumboParser.g:2971:4: () ( (lv_d_1_0= ruleSlangVarDef ) )
                    {
                    // InternalGumboParser.g:2971:4: ()
                    // InternalGumboParser.g:2972:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangStmtAccess().getSlangVarDefAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:2981:4: ( (lv_d_1_0= ruleSlangVarDef ) )
                    // InternalGumboParser.g:2982:5: (lv_d_1_0= ruleSlangVarDef )
                    {
                    // InternalGumboParser.g:2982:5: (lv_d_1_0= ruleSlangVarDef )
                    // InternalGumboParser.g:2983:6: lv_d_1_0= ruleSlangVarDef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangStmtAccess().getDSlangVarDefParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_d_1_0=ruleSlangVarDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlangStmtRule());
                      						}
                      						set(
                      							current,
                      							"d",
                      							lv_d_1_0,
                      							"org.sireum.aadl.gumbo.Gumbo.SlangVarDef");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:3002:3: ( () otherlv_3= If ( (lv_cond_4_0= ruleExpr ) ) ( (lv_b_5_0= ruleSlangBlock ) ) ( (lv_e_6_0= ruleSlangElse ) )? )
                    {
                    // InternalGumboParser.g:3002:3: ( () otherlv_3= If ( (lv_cond_4_0= ruleExpr ) ) ( (lv_b_5_0= ruleSlangBlock ) ) ( (lv_e_6_0= ruleSlangElse ) )? )
                    // InternalGumboParser.g:3003:4: () otherlv_3= If ( (lv_cond_4_0= ruleExpr ) ) ( (lv_b_5_0= ruleSlangBlock ) ) ( (lv_e_6_0= ruleSlangElse ) )?
                    {
                    // InternalGumboParser.g:3003:4: ()
                    // InternalGumboParser.g:3004:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangStmtAccess().getSlangIfStmtAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_3=(Token)match(input,If,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getSlangStmtAccess().getIfKeyword_1_1());
                      			
                    }
                    // InternalGumboParser.g:3017:4: ( (lv_cond_4_0= ruleExpr ) )
                    // InternalGumboParser.g:3018:5: (lv_cond_4_0= ruleExpr )
                    {
                    // InternalGumboParser.g:3018:5: (lv_cond_4_0= ruleExpr )
                    // InternalGumboParser.g:3019:6: lv_cond_4_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangStmtAccess().getCondExprParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_56);
                    lv_cond_4_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlangStmtRule());
                      						}
                      						set(
                      							current,
                      							"cond",
                      							lv_cond_4_0,
                      							"org.sireum.aadl.gumbo.Gumbo.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:3036:4: ( (lv_b_5_0= ruleSlangBlock ) )
                    // InternalGumboParser.g:3037:5: (lv_b_5_0= ruleSlangBlock )
                    {
                    // InternalGumboParser.g:3037:5: (lv_b_5_0= ruleSlangBlock )
                    // InternalGumboParser.g:3038:6: lv_b_5_0= ruleSlangBlock
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangStmtAccess().getBSlangBlockParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_57);
                    lv_b_5_0=ruleSlangBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlangStmtRule());
                      						}
                      						set(
                      							current,
                      							"b",
                      							lv_b_5_0,
                      							"org.sireum.aadl.gumbo.Gumbo.SlangBlock");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:3055:4: ( (lv_e_6_0= ruleSlangElse ) )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==Else) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // InternalGumboParser.g:3056:5: (lv_e_6_0= ruleSlangElse )
                            {
                            // InternalGumboParser.g:3056:5: (lv_e_6_0= ruleSlangElse )
                            // InternalGumboParser.g:3057:6: lv_e_6_0= ruleSlangElse
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getSlangStmtAccess().getESlangElseParserRuleCall_1_4_0());
                              					
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_e_6_0=ruleSlangElse();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getSlangStmtRule());
                              						}
                              						set(
                              							current,
                              							"e",
                              							lv_e_6_0,
                              							"org.sireum.aadl.gumbo.Gumbo.SlangElse");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGumboParser.g:3076:3: ( () otherlv_8= While ( (lv_cond_9_0= ruleExpr ) ) ( (lv_l_10_0= ruleSlangLoopContract ) ) ( (lv_b_11_0= ruleSlangBlock ) ) )
                    {
                    // InternalGumboParser.g:3076:3: ( () otherlv_8= While ( (lv_cond_9_0= ruleExpr ) ) ( (lv_l_10_0= ruleSlangLoopContract ) ) ( (lv_b_11_0= ruleSlangBlock ) ) )
                    // InternalGumboParser.g:3077:4: () otherlv_8= While ( (lv_cond_9_0= ruleExpr ) ) ( (lv_l_10_0= ruleSlangLoopContract ) ) ( (lv_b_11_0= ruleSlangBlock ) )
                    {
                    // InternalGumboParser.g:3077:4: ()
                    // InternalGumboParser.g:3078:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangStmtAccess().getSlangWhileStmtAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_8=(Token)match(input,While,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getSlangStmtAccess().getWhileKeyword_2_1());
                      			
                    }
                    // InternalGumboParser.g:3091:4: ( (lv_cond_9_0= ruleExpr ) )
                    // InternalGumboParser.g:3092:5: (lv_cond_9_0= ruleExpr )
                    {
                    // InternalGumboParser.g:3092:5: (lv_cond_9_0= ruleExpr )
                    // InternalGumboParser.g:3093:6: lv_cond_9_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangStmtAccess().getCondExprParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_58);
                    lv_cond_9_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlangStmtRule());
                      						}
                      						set(
                      							current,
                      							"cond",
                      							lv_cond_9_0,
                      							"org.sireum.aadl.gumbo.Gumbo.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:3110:4: ( (lv_l_10_0= ruleSlangLoopContract ) )
                    // InternalGumboParser.g:3111:5: (lv_l_10_0= ruleSlangLoopContract )
                    {
                    // InternalGumboParser.g:3111:5: (lv_l_10_0= ruleSlangLoopContract )
                    // InternalGumboParser.g:3112:6: lv_l_10_0= ruleSlangLoopContract
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangStmtAccess().getLSlangLoopContractParserRuleCall_2_3_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_56);
                    lv_l_10_0=ruleSlangLoopContract();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlangStmtRule());
                      						}
                      						set(
                      							current,
                      							"l",
                      							lv_l_10_0,
                      							"org.sireum.aadl.gumbo.Gumbo.SlangLoopContract");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:3129:4: ( (lv_b_11_0= ruleSlangBlock ) )
                    // InternalGumboParser.g:3130:5: (lv_b_11_0= ruleSlangBlock )
                    {
                    // InternalGumboParser.g:3130:5: (lv_b_11_0= ruleSlangBlock )
                    // InternalGumboParser.g:3131:6: lv_b_11_0= ruleSlangBlock
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangStmtAccess().getBSlangBlockParserRuleCall_2_4_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_b_11_0=ruleSlangBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlangStmtRule());
                      						}
                      						set(
                      							current,
                      							"b",
                      							lv_b_11_0,
                      							"org.sireum.aadl.gumbo.Gumbo.SlangBlock");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalGumboParser.g:3150:3: ( () otherlv_13= Match ( (lv_testExpr_14_0= ruleExpr ) ) otherlv_15= LeftCurlyBracket ( (lv_c_16_0= ruleSlangCase ) )* otherlv_17= RightCurlyBracket )
                    {
                    // InternalGumboParser.g:3150:3: ( () otherlv_13= Match ( (lv_testExpr_14_0= ruleExpr ) ) otherlv_15= LeftCurlyBracket ( (lv_c_16_0= ruleSlangCase ) )* otherlv_17= RightCurlyBracket )
                    // InternalGumboParser.g:3151:4: () otherlv_13= Match ( (lv_testExpr_14_0= ruleExpr ) ) otherlv_15= LeftCurlyBracket ( (lv_c_16_0= ruleSlangCase ) )* otherlv_17= RightCurlyBracket
                    {
                    // InternalGumboParser.g:3151:4: ()
                    // InternalGumboParser.g:3152:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangStmtAccess().getSlangMatchStmtAction_3_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_13=(Token)match(input,Match,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getSlangStmtAccess().getMatchKeyword_3_1());
                      			
                    }
                    // InternalGumboParser.g:3165:4: ( (lv_testExpr_14_0= ruleExpr ) )
                    // InternalGumboParser.g:3166:5: (lv_testExpr_14_0= ruleExpr )
                    {
                    // InternalGumboParser.g:3166:5: (lv_testExpr_14_0= ruleExpr )
                    // InternalGumboParser.g:3167:6: lv_testExpr_14_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangStmtAccess().getTestExprExprParserRuleCall_3_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_56);
                    lv_testExpr_14_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlangStmtRule());
                      						}
                      						set(
                      							current,
                      							"testExpr",
                      							lv_testExpr_14_0,
                      							"org.sireum.aadl.gumbo.Gumbo.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_15=(Token)match(input,LeftCurlyBracket,FollowSets000.FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getSlangStmtAccess().getLeftCurlyBracketKeyword_3_3());
                      			
                    }
                    // InternalGumboParser.g:3188:4: ( (lv_c_16_0= ruleSlangCase ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==Case) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // InternalGumboParser.g:3189:5: (lv_c_16_0= ruleSlangCase )
                    	    {
                    	    // InternalGumboParser.g:3189:5: (lv_c_16_0= ruleSlangCase )
                    	    // InternalGumboParser.g:3190:6: lv_c_16_0= ruleSlangCase
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getSlangStmtAccess().getCSlangCaseParserRuleCall_3_4_0());
                    	      					
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_59);
                    	    lv_c_16_0=ruleSlangCase();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getSlangStmtRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"c",
                    	      							lv_c_16_0,
                    	      							"org.sireum.aadl.gumbo.Gumbo.SlangCase");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,RightCurlyBracket,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getSlangStmtAccess().getRightCurlyBracketKeyword_3_5());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalGumboParser.g:3213:3: ( () otherlv_19= Spec ( (lv_b_20_0= ruleSlangBlock ) ) )
                    {
                    // InternalGumboParser.g:3213:3: ( () otherlv_19= Spec ( (lv_b_20_0= ruleSlangBlock ) ) )
                    // InternalGumboParser.g:3214:4: () otherlv_19= Spec ( (lv_b_20_0= ruleSlangBlock ) )
                    {
                    // InternalGumboParser.g:3214:4: ()
                    // InternalGumboParser.g:3215:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangStmtAccess().getSlangSpecStmtAction_4_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_19=(Token)match(input,Spec,FollowSets000.FOLLOW_56); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getSlangStmtAccess().getSpecKeyword_4_1());
                      			
                    }
                    // InternalGumboParser.g:3228:4: ( (lv_b_20_0= ruleSlangBlock ) )
                    // InternalGumboParser.g:3229:5: (lv_b_20_0= ruleSlangBlock )
                    {
                    // InternalGumboParser.g:3229:5: (lv_b_20_0= ruleSlangBlock )
                    // InternalGumboParser.g:3230:6: lv_b_20_0= ruleSlangBlock
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangStmtAccess().getBSlangBlockParserRuleCall_4_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_b_20_0=ruleSlangBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlangStmtRule());
                      						}
                      						set(
                      							current,
                      							"b",
                      							lv_b_20_0,
                      							"org.sireum.aadl.gumbo.Gumbo.SlangBlock");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalGumboParser.g:3249:3: ( () otherlv_22= Assume ( (lv_e_23_0= ruleExpr ) ) (this_SLANG_STRING_24= RULE_SLANG_STRING )? )
                    {
                    // InternalGumboParser.g:3249:3: ( () otherlv_22= Assume ( (lv_e_23_0= ruleExpr ) ) (this_SLANG_STRING_24= RULE_SLANG_STRING )? )
                    // InternalGumboParser.g:3250:4: () otherlv_22= Assume ( (lv_e_23_0= ruleExpr ) ) (this_SLANG_STRING_24= RULE_SLANG_STRING )?
                    {
                    // InternalGumboParser.g:3250:4: ()
                    // InternalGumboParser.g:3251:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangStmtAccess().getSlangAssumeStmtAction_5_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_22=(Token)match(input,Assume,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_22, grammarAccess.getSlangStmtAccess().getAssumeKeyword_5_1());
                      			
                    }
                    // InternalGumboParser.g:3264:4: ( (lv_e_23_0= ruleExpr ) )
                    // InternalGumboParser.g:3265:5: (lv_e_23_0= ruleExpr )
                    {
                    // InternalGumboParser.g:3265:5: (lv_e_23_0= ruleExpr )
                    // InternalGumboParser.g:3266:6: lv_e_23_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangStmtAccess().getEExprParserRuleCall_5_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_60);
                    lv_e_23_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlangStmtRule());
                      						}
                      						set(
                      							current,
                      							"e",
                      							lv_e_23_0,
                      							"org.sireum.aadl.gumbo.Gumbo.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:3283:4: (this_SLANG_STRING_24= RULE_SLANG_STRING )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==RULE_SLANG_STRING) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // InternalGumboParser.g:3284:5: this_SLANG_STRING_24= RULE_SLANG_STRING
                            {
                            this_SLANG_STRING_24=(Token)match(input,RULE_SLANG_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_SLANG_STRING_24, grammarAccess.getSlangStmtAccess().getSLANG_STRINGTerminalRuleCall_5_3());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalGumboParser.g:3291:3: ( () otherlv_26= Assert ( (lv_e_27_0= ruleExpr ) ) (this_SLANG_STRING_28= RULE_SLANG_STRING )? )
                    {
                    // InternalGumboParser.g:3291:3: ( () otherlv_26= Assert ( (lv_e_27_0= ruleExpr ) ) (this_SLANG_STRING_28= RULE_SLANG_STRING )? )
                    // InternalGumboParser.g:3292:4: () otherlv_26= Assert ( (lv_e_27_0= ruleExpr ) ) (this_SLANG_STRING_28= RULE_SLANG_STRING )?
                    {
                    // InternalGumboParser.g:3292:4: ()
                    // InternalGumboParser.g:3293:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangStmtAccess().getSlangAssertStmtAction_6_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_26=(Token)match(input,Assert,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_26, grammarAccess.getSlangStmtAccess().getAssertKeyword_6_1());
                      			
                    }
                    // InternalGumboParser.g:3306:4: ( (lv_e_27_0= ruleExpr ) )
                    // InternalGumboParser.g:3307:5: (lv_e_27_0= ruleExpr )
                    {
                    // InternalGumboParser.g:3307:5: (lv_e_27_0= ruleExpr )
                    // InternalGumboParser.g:3308:6: lv_e_27_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangStmtAccess().getEExprParserRuleCall_6_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_60);
                    lv_e_27_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlangStmtRule());
                      						}
                      						set(
                      							current,
                      							"e",
                      							lv_e_27_0,
                      							"org.sireum.aadl.gumbo.Gumbo.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:3325:4: (this_SLANG_STRING_28= RULE_SLANG_STRING )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==RULE_SLANG_STRING) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // InternalGumboParser.g:3326:5: this_SLANG_STRING_28= RULE_SLANG_STRING
                            {
                            this_SLANG_STRING_28=(Token)match(input,RULE_SLANG_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_SLANG_STRING_28, grammarAccess.getSlangStmtAccess().getSLANG_STRINGTerminalRuleCall_6_3());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalGumboParser.g:3333:3: ( () otherlv_30= Halt (this_SLANG_STRING_31= RULE_SLANG_STRING )? )
                    {
                    // InternalGumboParser.g:3333:3: ( () otherlv_30= Halt (this_SLANG_STRING_31= RULE_SLANG_STRING )? )
                    // InternalGumboParser.g:3334:4: () otherlv_30= Halt (this_SLANG_STRING_31= RULE_SLANG_STRING )?
                    {
                    // InternalGumboParser.g:3334:4: ()
                    // InternalGumboParser.g:3335:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangStmtAccess().getSlangHaltStmtAction_7_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_30=(Token)match(input,Halt,FollowSets000.FOLLOW_60); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_30, grammarAccess.getSlangStmtAccess().getHaltKeyword_7_1());
                      			
                    }
                    // InternalGumboParser.g:3348:4: (this_SLANG_STRING_31= RULE_SLANG_STRING )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==RULE_SLANG_STRING) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // InternalGumboParser.g:3349:5: this_SLANG_STRING_31= RULE_SLANG_STRING
                            {
                            this_SLANG_STRING_31=(Token)match(input,RULE_SLANG_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_SLANG_STRING_31, grammarAccess.getSlangStmtAccess().getSLANG_STRINGTerminalRuleCall_7_2());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalGumboParser.g:3356:3: ( () otherlv_33= Do ( (lv_e_34_0= ruleExpr ) ) )
                    {
                    // InternalGumboParser.g:3356:3: ( () otherlv_33= Do ( (lv_e_34_0= ruleExpr ) ) )
                    // InternalGumboParser.g:3357:4: () otherlv_33= Do ( (lv_e_34_0= ruleExpr ) )
                    {
                    // InternalGumboParser.g:3357:4: ()
                    // InternalGumboParser.g:3358:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangStmtAccess().getSlangDoStmtAction_8_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_33=(Token)match(input,Do,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_33, grammarAccess.getSlangStmtAccess().getDoKeyword_8_1());
                      			
                    }
                    // InternalGumboParser.g:3371:4: ( (lv_e_34_0= ruleExpr ) )
                    // InternalGumboParser.g:3372:5: (lv_e_34_0= ruleExpr )
                    {
                    // InternalGumboParser.g:3372:5: (lv_e_34_0= ruleExpr )
                    // InternalGumboParser.g:3373:6: lv_e_34_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangStmtAccess().getEExprParserRuleCall_8_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_e_34_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlangStmtRule());
                      						}
                      						set(
                      							current,
                      							"e",
                      							lv_e_34_0,
                      							"org.sireum.aadl.gumbo.Gumbo.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // InternalGumboParser.g:3392:3: ( () ( (otherlv_36= RULE_ID ) ) (otherlv_37= Colon | ( ( (lv_l_38_0= ruleSlangLHSSuffix ) )* ( (otherlv_39= ColonEqualsSign | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleExpr ) ) )? ) ) )
                    {
                    // InternalGumboParser.g:3392:3: ( () ( (otherlv_36= RULE_ID ) ) (otherlv_37= Colon | ( ( (lv_l_38_0= ruleSlangLHSSuffix ) )* ( (otherlv_39= ColonEqualsSign | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleExpr ) ) )? ) ) )
                    // InternalGumboParser.g:3393:4: () ( (otherlv_36= RULE_ID ) ) (otherlv_37= Colon | ( ( (lv_l_38_0= ruleSlangLHSSuffix ) )* ( (otherlv_39= ColonEqualsSign | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleExpr ) ) )? ) )
                    {
                    // InternalGumboParser.g:3393:4: ()
                    // InternalGumboParser.g:3394:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangStmtAccess().getSlangIdStmtAction_9_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:3403:4: ( (otherlv_36= RULE_ID ) )
                    // InternalGumboParser.g:3404:5: (otherlv_36= RULE_ID )
                    {
                    // InternalGumboParser.g:3404:5: (otherlv_36= RULE_ID )
                    // InternalGumboParser.g:3405:6: otherlv_36= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSlangStmtRule());
                      						}
                      					
                    }
                    otherlv_36=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_61); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_36, grammarAccess.getSlangStmtAccess().getPortOrSubcomponentOrStateVarEObjectCrossReference_9_1_0());
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:3419:4: (otherlv_37= Colon | ( ( (lv_l_38_0= ruleSlangLHSSuffix ) )* ( (otherlv_39= ColonEqualsSign | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleExpr ) ) )? ) )
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==Colon) ) {
                        alt69=1;
                    }
                    else if ( (LA69_0==EOF||(LA69_0>=Assert && LA69_0<=Assume)||LA69_0==Return||LA69_0==Match||LA69_0==While||LA69_0==Case||(LA69_0>=Halt && LA69_0<=Spec)||(LA69_0>=Val && LA69_0<=Var)||LA69_0==ColonEqualsSign||(LA69_0>=Do && LA69_0<=If)||LA69_0==LeftParenthesis||LA69_0==FullStop||LA69_0==RightCurlyBracket||LA69_0==RULE_DEFOP||LA69_0==RULE_ID) ) {
                        alt69=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 69, 0, input);

                        throw nvae;
                    }
                    switch (alt69) {
                        case 1 :
                            // InternalGumboParser.g:3420:5: otherlv_37= Colon
                            {
                            otherlv_37=(Token)match(input,Colon,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_37, grammarAccess.getSlangStmtAccess().getColonKeyword_9_2_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalGumboParser.g:3425:5: ( ( (lv_l_38_0= ruleSlangLHSSuffix ) )* ( (otherlv_39= ColonEqualsSign | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleExpr ) ) )? )
                            {
                            // InternalGumboParser.g:3425:5: ( ( (lv_l_38_0= ruleSlangLHSSuffix ) )* ( (otherlv_39= ColonEqualsSign | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleExpr ) ) )? )
                            // InternalGumboParser.g:3426:6: ( (lv_l_38_0= ruleSlangLHSSuffix ) )* ( (otherlv_39= ColonEqualsSign | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleExpr ) ) )?
                            {
                            // InternalGumboParser.g:3426:6: ( (lv_l_38_0= ruleSlangLHSSuffix ) )*
                            loop66:
                            do {
                                int alt66=2;
                                int LA66_0 = input.LA(1);

                                if ( (LA66_0==LeftParenthesis||LA66_0==FullStop) ) {
                                    alt66=1;
                                }


                                switch (alt66) {
                            	case 1 :
                            	    // InternalGumboParser.g:3427:7: (lv_l_38_0= ruleSlangLHSSuffix )
                            	    {
                            	    // InternalGumboParser.g:3427:7: (lv_l_38_0= ruleSlangLHSSuffix )
                            	    // InternalGumboParser.g:3428:8: lv_l_38_0= ruleSlangLHSSuffix
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getSlangStmtAccess().getLSlangLHSSuffixParserRuleCall_9_2_1_0_0());
                            	      							
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_62);
                            	    lv_l_38_0=ruleSlangLHSSuffix();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getSlangStmtRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"l",
                            	      									lv_l_38_0,
                            	      									"org.sireum.aadl.gumbo.Gumbo.SlangLHSSuffix");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop66;
                                }
                            } while (true);

                            // InternalGumboParser.g:3445:6: ( (otherlv_39= ColonEqualsSign | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleExpr ) ) )?
                            int alt68=2;
                            int LA68_0 = input.LA(1);

                            if ( (LA68_0==ColonEqualsSign||LA68_0==RULE_DEFOP) ) {
                                alt68=1;
                            }
                            switch (alt68) {
                                case 1 :
                                    // InternalGumboParser.g:3446:7: (otherlv_39= ColonEqualsSign | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleExpr ) )
                                    {
                                    // InternalGumboParser.g:3446:7: (otherlv_39= ColonEqualsSign | this_DEFOP_40= RULE_DEFOP )
                                    int alt67=2;
                                    int LA67_0 = input.LA(1);

                                    if ( (LA67_0==ColonEqualsSign) ) {
                                        alt67=1;
                                    }
                                    else if ( (LA67_0==RULE_DEFOP) ) {
                                        alt67=2;
                                    }
                                    else {
                                        if (state.backtracking>0) {state.failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 67, 0, input);

                                        throw nvae;
                                    }
                                    switch (alt67) {
                                        case 1 :
                                            // InternalGumboParser.g:3447:8: otherlv_39= ColonEqualsSign
                                            {
                                            otherlv_39=(Token)match(input,ColonEqualsSign,FollowSets000.FOLLOW_15); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                              								newLeafNode(otherlv_39, grammarAccess.getSlangStmtAccess().getColonEqualsSignKeyword_9_2_1_1_0_0());
                                              							
                                            }

                                            }
                                            break;
                                        case 2 :
                                            // InternalGumboParser.g:3452:8: this_DEFOP_40= RULE_DEFOP
                                            {
                                            this_DEFOP_40=(Token)match(input,RULE_DEFOP,FollowSets000.FOLLOW_15); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                              								newLeafNode(this_DEFOP_40, grammarAccess.getSlangStmtAccess().getDEFOPTerminalRuleCall_9_2_1_1_0_1());
                                              							
                                            }

                                            }
                                            break;

                                    }

                                    // InternalGumboParser.g:3457:7: ( (lv_e_41_0= ruleExpr ) )
                                    // InternalGumboParser.g:3458:8: (lv_e_41_0= ruleExpr )
                                    {
                                    // InternalGumboParser.g:3458:8: (lv_e_41_0= ruleExpr )
                                    // InternalGumboParser.g:3459:9: lv_e_41_0= ruleExpr
                                    {
                                    if ( state.backtracking==0 ) {

                                      									newCompositeNode(grammarAccess.getSlangStmtAccess().getEExprParserRuleCall_9_2_1_1_1_0());
                                      								
                                    }
                                    pushFollow(FollowSets000.FOLLOW_2);
                                    lv_e_41_0=ruleExpr();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElementForParent(grammarAccess.getSlangStmtRule());
                                      									}
                                      									set(
                                      										current,
                                      										"e",
                                      										lv_e_41_0,
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
                            break;

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
    // $ANTLR end "ruleSlangStmt"


    // $ANTLR start "entryRuleSlangElse"
    // InternalGumboParser.g:3484:1: entryRuleSlangElse returns [EObject current=null] : iv_ruleSlangElse= ruleSlangElse EOF ;
    public final EObject entryRuleSlangElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangElse = null;


        try {
            // InternalGumboParser.g:3484:50: (iv_ruleSlangElse= ruleSlangElse EOF )
            // InternalGumboParser.g:3485:2: iv_ruleSlangElse= ruleSlangElse EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlangElseRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlangElse=ruleSlangElse();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlangElse; 
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
    // $ANTLR end "entryRuleSlangElse"


    // $ANTLR start "ruleSlangElse"
    // InternalGumboParser.g:3491:1: ruleSlangElse returns [EObject current=null] : (otherlv_0= Else ( (otherlv_1= If ( (lv_cond_2_0= ruleExpr ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )? ) | this_SlangBlock_5= ruleSlangBlock ) ) ;
    public final EObject ruleSlangElse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_cond_2_0 = null;

        EObject lv_b_3_0 = null;

        EObject lv_e_4_0 = null;

        EObject this_SlangBlock_5 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:3497:2: ( (otherlv_0= Else ( (otherlv_1= If ( (lv_cond_2_0= ruleExpr ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )? ) | this_SlangBlock_5= ruleSlangBlock ) ) )
            // InternalGumboParser.g:3498:2: (otherlv_0= Else ( (otherlv_1= If ( (lv_cond_2_0= ruleExpr ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )? ) | this_SlangBlock_5= ruleSlangBlock ) )
            {
            // InternalGumboParser.g:3498:2: (otherlv_0= Else ( (otherlv_1= If ( (lv_cond_2_0= ruleExpr ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )? ) | this_SlangBlock_5= ruleSlangBlock ) )
            // InternalGumboParser.g:3499:3: otherlv_0= Else ( (otherlv_1= If ( (lv_cond_2_0= ruleExpr ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )? ) | this_SlangBlock_5= ruleSlangBlock )
            {
            otherlv_0=(Token)match(input,Else,FollowSets000.FOLLOW_63); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangElseAccess().getElseKeyword_0());
              		
            }
            // InternalGumboParser.g:3503:3: ( (otherlv_1= If ( (lv_cond_2_0= ruleExpr ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )? ) | this_SlangBlock_5= ruleSlangBlock )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==If) ) {
                alt72=1;
            }
            else if ( (LA72_0==LeftCurlyBracket) ) {
                alt72=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // InternalGumboParser.g:3504:4: (otherlv_1= If ( (lv_cond_2_0= ruleExpr ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )? )
                    {
                    // InternalGumboParser.g:3504:4: (otherlv_1= If ( (lv_cond_2_0= ruleExpr ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )? )
                    // InternalGumboParser.g:3505:5: otherlv_1= If ( (lv_cond_2_0= ruleExpr ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )?
                    {
                    otherlv_1=(Token)match(input,If,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getSlangElseAccess().getIfKeyword_1_0_0());
                      				
                    }
                    // InternalGumboParser.g:3509:5: ( (lv_cond_2_0= ruleExpr ) )
                    // InternalGumboParser.g:3510:6: (lv_cond_2_0= ruleExpr )
                    {
                    // InternalGumboParser.g:3510:6: (lv_cond_2_0= ruleExpr )
                    // InternalGumboParser.g:3511:7: lv_cond_2_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSlangElseAccess().getCondExprParserRuleCall_1_0_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_56);
                    lv_cond_2_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSlangElseRule());
                      							}
                      							set(
                      								current,
                      								"cond",
                      								lv_cond_2_0,
                      								"org.sireum.aadl.gumbo.Gumbo.Expr");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalGumboParser.g:3528:5: ( (lv_b_3_0= ruleSlangBlock ) )
                    // InternalGumboParser.g:3529:6: (lv_b_3_0= ruleSlangBlock )
                    {
                    // InternalGumboParser.g:3529:6: (lv_b_3_0= ruleSlangBlock )
                    // InternalGumboParser.g:3530:7: lv_b_3_0= ruleSlangBlock
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSlangElseAccess().getBSlangBlockParserRuleCall_1_0_2_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_57);
                    lv_b_3_0=ruleSlangBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSlangElseRule());
                      							}
                      							set(
                      								current,
                      								"b",
                      								lv_b_3_0,
                      								"org.sireum.aadl.gumbo.Gumbo.SlangBlock");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalGumboParser.g:3547:5: ( (lv_e_4_0= ruleSlangElse ) )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==Else) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // InternalGumboParser.g:3548:6: (lv_e_4_0= ruleSlangElse )
                            {
                            // InternalGumboParser.g:3548:6: (lv_e_4_0= ruleSlangElse )
                            // InternalGumboParser.g:3549:7: lv_e_4_0= ruleSlangElse
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSlangElseAccess().getESlangElseParserRuleCall_1_0_3_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_e_4_0=ruleSlangElse();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getSlangElseRule());
                              							}
                              							set(
                              								current,
                              								"e",
                              								lv_e_4_0,
                              								"org.sireum.aadl.gumbo.Gumbo.SlangElse");
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
                    // InternalGumboParser.g:3568:4: this_SlangBlock_5= ruleSlangBlock
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSlangElseAccess().getSlangBlockParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_SlangBlock_5=ruleSlangBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_SlangBlock_5;
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
    // $ANTLR end "ruleSlangElse"


    // $ANTLR start "entryRuleSlangLoopContract"
    // InternalGumboParser.g:3584:1: entryRuleSlangLoopContract returns [EObject current=null] : iv_ruleSlangLoopContract= ruleSlangLoopContract EOF ;
    public final EObject entryRuleSlangLoopContract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangLoopContract = null;


        try {
            // InternalGumboParser.g:3584:58: (iv_ruleSlangLoopContract= ruleSlangLoopContract EOF )
            // InternalGumboParser.g:3585:2: iv_ruleSlangLoopContract= ruleSlangLoopContract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlangLoopContractRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlangLoopContract=ruleSlangLoopContract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlangLoopContract; 
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
    // $ANTLR end "entryRuleSlangLoopContract"


    // $ANTLR start "ruleSlangLoopContract"
    // InternalGumboParser.g:3591:1: ruleSlangLoopContract returns [EObject current=null] : ( () ( (lv_inv_1_0= ruleSlangInvariant ) )? ( (lv_mod_2_0= ruleSlangModifies ) )? ) ;
    public final EObject ruleSlangLoopContract() throws RecognitionException {
        EObject current = null;

        EObject lv_inv_1_0 = null;

        EObject lv_mod_2_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:3597:2: ( ( () ( (lv_inv_1_0= ruleSlangInvariant ) )? ( (lv_mod_2_0= ruleSlangModifies ) )? ) )
            // InternalGumboParser.g:3598:2: ( () ( (lv_inv_1_0= ruleSlangInvariant ) )? ( (lv_mod_2_0= ruleSlangModifies ) )? )
            {
            // InternalGumboParser.g:3598:2: ( () ( (lv_inv_1_0= ruleSlangInvariant ) )? ( (lv_mod_2_0= ruleSlangModifies ) )? )
            // InternalGumboParser.g:3599:3: () ( (lv_inv_1_0= ruleSlangInvariant ) )? ( (lv_mod_2_0= ruleSlangModifies ) )?
            {
            // InternalGumboParser.g:3599:3: ()
            // InternalGumboParser.g:3600:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSlangLoopContractAccess().getSlangLoopContractAction_0(),
              					current);
              			
            }

            }

            // InternalGumboParser.g:3609:3: ( (lv_inv_1_0= ruleSlangInvariant ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==Invariant) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalGumboParser.g:3610:4: (lv_inv_1_0= ruleSlangInvariant )
                    {
                    // InternalGumboParser.g:3610:4: (lv_inv_1_0= ruleSlangInvariant )
                    // InternalGumboParser.g:3611:5: lv_inv_1_0= ruleSlangInvariant
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangLoopContractAccess().getInvSlangInvariantParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_50);
                    lv_inv_1_0=ruleSlangInvariant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSlangLoopContractRule());
                      					}
                      					set(
                      						current,
                      						"inv",
                      						lv_inv_1_0,
                      						"org.sireum.aadl.gumbo.Gumbo.SlangInvariant");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalGumboParser.g:3628:3: ( (lv_mod_2_0= ruleSlangModifies ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==Modifies) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalGumboParser.g:3629:4: (lv_mod_2_0= ruleSlangModifies )
                    {
                    // InternalGumboParser.g:3629:4: (lv_mod_2_0= ruleSlangModifies )
                    // InternalGumboParser.g:3630:5: lv_mod_2_0= ruleSlangModifies
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangLoopContractAccess().getModSlangModifiesParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_mod_2_0=ruleSlangModifies();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSlangLoopContractRule());
                      					}
                      					set(
                      						current,
                      						"mod",
                      						lv_mod_2_0,
                      						"org.sireum.aadl.gumbo.Gumbo.SlangModifies");
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
    // $ANTLR end "ruleSlangLoopContract"


    // $ANTLR start "entryRuleSlangLHSSuffix"
    // InternalGumboParser.g:3651:1: entryRuleSlangLHSSuffix returns [EObject current=null] : iv_ruleSlangLHSSuffix= ruleSlangLHSSuffix EOF ;
    public final EObject entryRuleSlangLHSSuffix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangLHSSuffix = null;


        try {
            // InternalGumboParser.g:3651:55: (iv_ruleSlangLHSSuffix= ruleSlangLHSSuffix EOF )
            // InternalGumboParser.g:3652:2: iv_ruleSlangLHSSuffix= ruleSlangLHSSuffix EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlangLHSSuffixRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlangLHSSuffix=ruleSlangLHSSuffix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlangLHSSuffix; 
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
    // $ANTLR end "entryRuleSlangLHSSuffix"


    // $ANTLR start "ruleSlangLHSSuffix"
    // InternalGumboParser.g:3658:1: ruleSlangLHSSuffix returns [EObject current=null] : ( ( () otherlv_1= FullStop this_ID_2= RULE_ID ) | ( () otherlv_4= LeftParenthesis ( ( (lv_exprs_5_0= ruleExpr ) ) (otherlv_6= Comma ( (lv_exprs_7_0= ruleExpr ) ) )* )? otherlv_8= RightParenthesis ) ) ;
    public final EObject ruleSlangLHSSuffix() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_ID_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_exprs_5_0 = null;

        EObject lv_exprs_7_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:3664:2: ( ( ( () otherlv_1= FullStop this_ID_2= RULE_ID ) | ( () otherlv_4= LeftParenthesis ( ( (lv_exprs_5_0= ruleExpr ) ) (otherlv_6= Comma ( (lv_exprs_7_0= ruleExpr ) ) )* )? otherlv_8= RightParenthesis ) ) )
            // InternalGumboParser.g:3665:2: ( ( () otherlv_1= FullStop this_ID_2= RULE_ID ) | ( () otherlv_4= LeftParenthesis ( ( (lv_exprs_5_0= ruleExpr ) ) (otherlv_6= Comma ( (lv_exprs_7_0= ruleExpr ) ) )* )? otherlv_8= RightParenthesis ) )
            {
            // InternalGumboParser.g:3665:2: ( ( () otherlv_1= FullStop this_ID_2= RULE_ID ) | ( () otherlv_4= LeftParenthesis ( ( (lv_exprs_5_0= ruleExpr ) ) (otherlv_6= Comma ( (lv_exprs_7_0= ruleExpr ) ) )* )? otherlv_8= RightParenthesis ) )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==FullStop) ) {
                alt77=1;
            }
            else if ( (LA77_0==LeftParenthesis) ) {
                alt77=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // InternalGumboParser.g:3666:3: ( () otherlv_1= FullStop this_ID_2= RULE_ID )
                    {
                    // InternalGumboParser.g:3666:3: ( () otherlv_1= FullStop this_ID_2= RULE_ID )
                    // InternalGumboParser.g:3667:4: () otherlv_1= FullStop this_ID_2= RULE_ID
                    {
                    // InternalGumboParser.g:3667:4: ()
                    // InternalGumboParser.g:3668:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangLHSSuffixAccess().getSlangFieldLookupAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,FullStop,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getSlangLHSSuffixAccess().getFullStopKeyword_0_1());
                      			
                    }
                    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_2, grammarAccess.getSlangLHSSuffixAccess().getIDTerminalRuleCall_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:3687:3: ( () otherlv_4= LeftParenthesis ( ( (lv_exprs_5_0= ruleExpr ) ) (otherlv_6= Comma ( (lv_exprs_7_0= ruleExpr ) ) )* )? otherlv_8= RightParenthesis )
                    {
                    // InternalGumboParser.g:3687:3: ( () otherlv_4= LeftParenthesis ( ( (lv_exprs_5_0= ruleExpr ) ) (otherlv_6= Comma ( (lv_exprs_7_0= ruleExpr ) ) )* )? otherlv_8= RightParenthesis )
                    // InternalGumboParser.g:3688:4: () otherlv_4= LeftParenthesis ( ( (lv_exprs_5_0= ruleExpr ) ) (otherlv_6= Comma ( (lv_exprs_7_0= ruleExpr ) ) )* )? otherlv_8= RightParenthesis
                    {
                    // InternalGumboParser.g:3688:4: ()
                    // InternalGumboParser.g:3689:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangLHSSuffixAccess().getSlangMethodCallAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_4=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_64); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getSlangLHSSuffixAccess().getLeftParenthesisKeyword_1_1());
                      			
                    }
                    // InternalGumboParser.g:3702:4: ( ( (lv_exprs_5_0= ruleExpr ) ) (otherlv_6= Comma ( (lv_exprs_7_0= ruleExpr ) ) )* )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==MustSend||LA76_0==MaySend||LA76_0==NoSend||LA76_0==Some||LA76_0==All||LA76_0==For||LA76_0==In_1||LA76_0==LeftParenthesis||(LA76_0>=Asterisk && LA76_0<=PlusSign)||LA76_0==HyphenMinus||(LA76_0>=F && LA76_0<=T)||LA76_0==LeftCurlyBracket||(LA76_0>=ForAll && LA76_0<=ThereExists)||(LA76_0>=RULE_SLANG_STRING && LA76_0<=RULE_MSTRING)||(LA76_0>=RULE_MSP && LA76_0<=RULE_MSPB)||(LA76_0>=RULE_IMPLIES && LA76_0<=RULE_OP)||(LA76_0>=RULE_HEX && LA76_0<=RULE_REAL_IDF)||LA76_0==RULE_ID) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // InternalGumboParser.g:3703:5: ( (lv_exprs_5_0= ruleExpr ) ) (otherlv_6= Comma ( (lv_exprs_7_0= ruleExpr ) ) )*
                            {
                            // InternalGumboParser.g:3703:5: ( (lv_exprs_5_0= ruleExpr ) )
                            // InternalGumboParser.g:3704:6: (lv_exprs_5_0= ruleExpr )
                            {
                            // InternalGumboParser.g:3704:6: (lv_exprs_5_0= ruleExpr )
                            // InternalGumboParser.g:3705:7: lv_exprs_5_0= ruleExpr
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSlangLHSSuffixAccess().getExprsExprParserRuleCall_1_2_0_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_41);
                            lv_exprs_5_0=ruleExpr();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getSlangLHSSuffixRule());
                              							}
                              							add(
                              								current,
                              								"exprs",
                              								lv_exprs_5_0,
                              								"org.sireum.aadl.gumbo.Gumbo.Expr");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalGumboParser.g:3722:5: (otherlv_6= Comma ( (lv_exprs_7_0= ruleExpr ) ) )*
                            loop75:
                            do {
                                int alt75=2;
                                int LA75_0 = input.LA(1);

                                if ( (LA75_0==Comma) ) {
                                    alt75=1;
                                }


                                switch (alt75) {
                            	case 1 :
                            	    // InternalGumboParser.g:3723:6: otherlv_6= Comma ( (lv_exprs_7_0= ruleExpr ) )
                            	    {
                            	    otherlv_6=(Token)match(input,Comma,FollowSets000.FOLLOW_15); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_6, grammarAccess.getSlangLHSSuffixAccess().getCommaKeyword_1_2_1_0());
                            	      					
                            	    }
                            	    // InternalGumboParser.g:3727:6: ( (lv_exprs_7_0= ruleExpr ) )
                            	    // InternalGumboParser.g:3728:7: (lv_exprs_7_0= ruleExpr )
                            	    {
                            	    // InternalGumboParser.g:3728:7: (lv_exprs_7_0= ruleExpr )
                            	    // InternalGumboParser.g:3729:8: lv_exprs_7_0= ruleExpr
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getSlangLHSSuffixAccess().getExprsExprParserRuleCall_1_2_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_41);
                            	    lv_exprs_7_0=ruleExpr();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getSlangLHSSuffixRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"exprs",
                            	      									lv_exprs_7_0,
                            	      									"org.sireum.aadl.gumbo.Gumbo.Expr");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop75;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getSlangLHSSuffixAccess().getRightParenthesisKeyword_1_3());
                      			
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
    // $ANTLR end "ruleSlangLHSSuffix"


    // $ANTLR start "entryRuleSlangCase"
    // InternalGumboParser.g:3757:1: entryRuleSlangCase returns [EObject current=null] : iv_ruleSlangCase= ruleSlangCase EOF ;
    public final EObject entryRuleSlangCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangCase = null;


        try {
            // InternalGumboParser.g:3757:50: (iv_ruleSlangCase= ruleSlangCase EOF )
            // InternalGumboParser.g:3758:2: iv_ruleSlangCase= ruleSlangCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlangCaseRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlangCase=ruleSlangCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlangCase; 
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
    // $ANTLR end "entryRuleSlangCase"


    // $ANTLR start "ruleSlangCase"
    // InternalGumboParser.g:3764:1: ruleSlangCase returns [EObject current=null] : (otherlv_0= Case ( (lv_pattern_1_0= ruleSlangPattern ) ) (otherlv_2= If ( (lv_e_3_0= ruleExpr ) ) )? otherlv_4= EqualsSignGreaterThanSign ( (lv_s_5_0= ruleSlangStmt ) )* ) ;
    public final EObject ruleSlangCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_pattern_1_0 = null;

        EObject lv_e_3_0 = null;

        EObject lv_s_5_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:3770:2: ( (otherlv_0= Case ( (lv_pattern_1_0= ruleSlangPattern ) ) (otherlv_2= If ( (lv_e_3_0= ruleExpr ) ) )? otherlv_4= EqualsSignGreaterThanSign ( (lv_s_5_0= ruleSlangStmt ) )* ) )
            // InternalGumboParser.g:3771:2: (otherlv_0= Case ( (lv_pattern_1_0= ruleSlangPattern ) ) (otherlv_2= If ( (lv_e_3_0= ruleExpr ) ) )? otherlv_4= EqualsSignGreaterThanSign ( (lv_s_5_0= ruleSlangStmt ) )* )
            {
            // InternalGumboParser.g:3771:2: (otherlv_0= Case ( (lv_pattern_1_0= ruleSlangPattern ) ) (otherlv_2= If ( (lv_e_3_0= ruleExpr ) ) )? otherlv_4= EqualsSignGreaterThanSign ( (lv_s_5_0= ruleSlangStmt ) )* )
            // InternalGumboParser.g:3772:3: otherlv_0= Case ( (lv_pattern_1_0= ruleSlangPattern ) ) (otherlv_2= If ( (lv_e_3_0= ruleExpr ) ) )? otherlv_4= EqualsSignGreaterThanSign ( (lv_s_5_0= ruleSlangStmt ) )*
            {
            otherlv_0=(Token)match(input,Case,FollowSets000.FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangCaseAccess().getCaseKeyword_0());
              		
            }
            // InternalGumboParser.g:3776:3: ( (lv_pattern_1_0= ruleSlangPattern ) )
            // InternalGumboParser.g:3777:4: (lv_pattern_1_0= ruleSlangPattern )
            {
            // InternalGumboParser.g:3777:4: (lv_pattern_1_0= ruleSlangPattern )
            // InternalGumboParser.g:3778:5: lv_pattern_1_0= ruleSlangPattern
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangCaseAccess().getPatternSlangPatternParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_66);
            lv_pattern_1_0=ruleSlangPattern();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSlangCaseRule());
              					}
              					set(
              						current,
              						"pattern",
              						lv_pattern_1_0,
              						"org.sireum.aadl.gumbo.Gumbo.SlangPattern");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumboParser.g:3795:3: (otherlv_2= If ( (lv_e_3_0= ruleExpr ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==If) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalGumboParser.g:3796:4: otherlv_2= If ( (lv_e_3_0= ruleExpr ) )
                    {
                    otherlv_2=(Token)match(input,If,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSlangCaseAccess().getIfKeyword_2_0());
                      			
                    }
                    // InternalGumboParser.g:3800:4: ( (lv_e_3_0= ruleExpr ) )
                    // InternalGumboParser.g:3801:5: (lv_e_3_0= ruleExpr )
                    {
                    // InternalGumboParser.g:3801:5: (lv_e_3_0= ruleExpr )
                    // InternalGumboParser.g:3802:6: lv_e_3_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangCaseAccess().getEExprParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_67);
                    lv_e_3_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlangCaseRule());
                      						}
                      						set(
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

            }

            otherlv_4=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_68); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getSlangCaseAccess().getEqualsSignGreaterThanSignKeyword_3());
              		
            }
            // InternalGumboParser.g:3824:3: ( (lv_s_5_0= ruleSlangStmt ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( ((LA79_0>=Assert && LA79_0<=Assume)||LA79_0==Match||LA79_0==While||(LA79_0>=Halt && LA79_0<=Spec)||(LA79_0>=Val && LA79_0<=Var)||(LA79_0>=Do && LA79_0<=If)||LA79_0==RULE_ID) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalGumboParser.g:3825:4: (lv_s_5_0= ruleSlangStmt )
            	    {
            	    // InternalGumboParser.g:3825:4: (lv_s_5_0= ruleSlangStmt )
            	    // InternalGumboParser.g:3826:5: lv_s_5_0= ruleSlangStmt
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSlangCaseAccess().getSSlangStmtParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_68);
            	    lv_s_5_0=ruleSlangStmt();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSlangCaseRule());
            	      					}
            	      					add(
            	      						current,
            	      						"s",
            	      						lv_s_5_0,
            	      						"org.sireum.aadl.gumbo.Gumbo.SlangStmt");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop79;
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
    // $ANTLR end "ruleSlangCase"


    // $ANTLR start "entryRuleSlangPattern"
    // InternalGumboParser.g:3847:1: entryRuleSlangPattern returns [EObject current=null] : iv_ruleSlangPattern= ruleSlangPattern EOF ;
    public final EObject entryRuleSlangPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangPattern = null;


        try {
            // InternalGumboParser.g:3847:53: (iv_ruleSlangPattern= ruleSlangPattern EOF )
            // InternalGumboParser.g:3848:2: iv_ruleSlangPattern= ruleSlangPattern EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlangPatternRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlangPattern=ruleSlangPattern();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlangPattern; 
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
    // $ANTLR end "entryRuleSlangPattern"


    // $ANTLR start "ruleSlangPattern"
    // InternalGumboParser.g:3854:1: ruleSlangPattern returns [EObject current=null] : ( ( () this_ID_1= RULE_ID (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis )? ) | (otherlv_7= LeftParenthesis ( (lv_patterns_8_0= ruleSlangTPattern ) ) (otherlv_9= Comma ( (lv_patterns_10_0= ruleSlangTPattern ) ) )* otherlv_11= RightParenthesis ) ) ;
    public final EObject ruleSlangPattern() throws RecognitionException {
        EObject current = null;

        Token this_ID_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_patterns_3_0 = null;

        EObject lv_patterns_5_0 = null;

        EObject lv_patterns_8_0 = null;

        EObject lv_patterns_10_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:3860:2: ( ( ( () this_ID_1= RULE_ID (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis )? ) | (otherlv_7= LeftParenthesis ( (lv_patterns_8_0= ruleSlangTPattern ) ) (otherlv_9= Comma ( (lv_patterns_10_0= ruleSlangTPattern ) ) )* otherlv_11= RightParenthesis ) ) )
            // InternalGumboParser.g:3861:2: ( ( () this_ID_1= RULE_ID (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis )? ) | (otherlv_7= LeftParenthesis ( (lv_patterns_8_0= ruleSlangTPattern ) ) (otherlv_9= Comma ( (lv_patterns_10_0= ruleSlangTPattern ) ) )* otherlv_11= RightParenthesis ) )
            {
            // InternalGumboParser.g:3861:2: ( ( () this_ID_1= RULE_ID (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis )? ) | (otherlv_7= LeftParenthesis ( (lv_patterns_8_0= ruleSlangTPattern ) ) (otherlv_9= Comma ( (lv_patterns_10_0= ruleSlangTPattern ) ) )* otherlv_11= RightParenthesis ) )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==RULE_ID) ) {
                alt83=1;
            }
            else if ( (LA83_0==LeftParenthesis) ) {
                alt83=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // InternalGumboParser.g:3862:3: ( () this_ID_1= RULE_ID (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis )? )
                    {
                    // InternalGumboParser.g:3862:3: ( () this_ID_1= RULE_ID (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis )? )
                    // InternalGumboParser.g:3863:4: () this_ID_1= RULE_ID (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis )?
                    {
                    // InternalGumboParser.g:3863:4: ()
                    // InternalGumboParser.g:3864:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangPatternAccess().getSlangPatternAction_0_0(),
                      						current);
                      				
                    }

                    }

                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_69); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_1, grammarAccess.getSlangPatternAccess().getIDTerminalRuleCall_0_1());
                      			
                    }
                    // InternalGumboParser.g:3877:4: (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==LeftParenthesis) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // InternalGumboParser.g:3878:5: otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis
                            {
                            otherlv_2=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_70); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getSlangPatternAccess().getLeftParenthesisKeyword_0_2_0());
                              				
                            }
                            // InternalGumboParser.g:3882:5: ( (lv_patterns_3_0= ruleSlangTPattern ) )
                            // InternalGumboParser.g:3883:6: (lv_patterns_3_0= ruleSlangTPattern )
                            {
                            // InternalGumboParser.g:3883:6: (lv_patterns_3_0= ruleSlangTPattern )
                            // InternalGumboParser.g:3884:7: lv_patterns_3_0= ruleSlangTPattern
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSlangPatternAccess().getPatternsSlangTPatternParserRuleCall_0_2_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_41);
                            lv_patterns_3_0=ruleSlangTPattern();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getSlangPatternRule());
                              							}
                              							add(
                              								current,
                              								"patterns",
                              								lv_patterns_3_0,
                              								"org.sireum.aadl.gumbo.Gumbo.SlangTPattern");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalGumboParser.g:3901:5: (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )*
                            loop80:
                            do {
                                int alt80=2;
                                int LA80_0 = input.LA(1);

                                if ( (LA80_0==Comma) ) {
                                    alt80=1;
                                }


                                switch (alt80) {
                            	case 1 :
                            	    // InternalGumboParser.g:3902:6: otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) )
                            	    {
                            	    otherlv_4=(Token)match(input,Comma,FollowSets000.FOLLOW_70); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_4, grammarAccess.getSlangPatternAccess().getCommaKeyword_0_2_2_0());
                            	      					
                            	    }
                            	    // InternalGumboParser.g:3906:6: ( (lv_patterns_5_0= ruleSlangTPattern ) )
                            	    // InternalGumboParser.g:3907:7: (lv_patterns_5_0= ruleSlangTPattern )
                            	    {
                            	    // InternalGumboParser.g:3907:7: (lv_patterns_5_0= ruleSlangTPattern )
                            	    // InternalGumboParser.g:3908:8: lv_patterns_5_0= ruleSlangTPattern
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getSlangPatternAccess().getPatternsSlangTPatternParserRuleCall_0_2_2_1_0());
                            	      							
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_41);
                            	    lv_patterns_5_0=ruleSlangTPattern();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getSlangPatternRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"patterns",
                            	      									lv_patterns_5_0,
                            	      									"org.sireum.aadl.gumbo.Gumbo.SlangTPattern");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop80;
                                }
                            } while (true);

                            otherlv_6=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_6, grammarAccess.getSlangPatternAccess().getRightParenthesisKeyword_0_2_3());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:3933:3: (otherlv_7= LeftParenthesis ( (lv_patterns_8_0= ruleSlangTPattern ) ) (otherlv_9= Comma ( (lv_patterns_10_0= ruleSlangTPattern ) ) )* otherlv_11= RightParenthesis )
                    {
                    // InternalGumboParser.g:3933:3: (otherlv_7= LeftParenthesis ( (lv_patterns_8_0= ruleSlangTPattern ) ) (otherlv_9= Comma ( (lv_patterns_10_0= ruleSlangTPattern ) ) )* otherlv_11= RightParenthesis )
                    // InternalGumboParser.g:3934:4: otherlv_7= LeftParenthesis ( (lv_patterns_8_0= ruleSlangTPattern ) ) (otherlv_9= Comma ( (lv_patterns_10_0= ruleSlangTPattern ) ) )* otherlv_11= RightParenthesis
                    {
                    otherlv_7=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_70); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getSlangPatternAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalGumboParser.g:3938:4: ( (lv_patterns_8_0= ruleSlangTPattern ) )
                    // InternalGumboParser.g:3939:5: (lv_patterns_8_0= ruleSlangTPattern )
                    {
                    // InternalGumboParser.g:3939:5: (lv_patterns_8_0= ruleSlangTPattern )
                    // InternalGumboParser.g:3940:6: lv_patterns_8_0= ruleSlangTPattern
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangPatternAccess().getPatternsSlangTPatternParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_41);
                    lv_patterns_8_0=ruleSlangTPattern();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlangPatternRule());
                      						}
                      						add(
                      							current,
                      							"patterns",
                      							lv_patterns_8_0,
                      							"org.sireum.aadl.gumbo.Gumbo.SlangTPattern");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:3957:4: (otherlv_9= Comma ( (lv_patterns_10_0= ruleSlangTPattern ) ) )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==Comma) ) {
                            alt82=1;
                        }


                        switch (alt82) {
                    	case 1 :
                    	    // InternalGumboParser.g:3958:5: otherlv_9= Comma ( (lv_patterns_10_0= ruleSlangTPattern ) )
                    	    {
                    	    otherlv_9=(Token)match(input,Comma,FollowSets000.FOLLOW_70); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_9, grammarAccess.getSlangPatternAccess().getCommaKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:3962:5: ( (lv_patterns_10_0= ruleSlangTPattern ) )
                    	    // InternalGumboParser.g:3963:6: (lv_patterns_10_0= ruleSlangTPattern )
                    	    {
                    	    // InternalGumboParser.g:3963:6: (lv_patterns_10_0= ruleSlangTPattern )
                    	    // InternalGumboParser.g:3964:7: lv_patterns_10_0= ruleSlangTPattern
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSlangPatternAccess().getPatternsSlangTPatternParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_41);
                    	    lv_patterns_10_0=ruleSlangTPattern();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSlangPatternRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"patterns",
                    	      								lv_patterns_10_0,
                    	      								"org.sireum.aadl.gumbo.Gumbo.SlangTPattern");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop82;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getSlangPatternAccess().getRightParenthesisKeyword_1_3());
                      			
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
    // $ANTLR end "ruleSlangPattern"


    // $ANTLR start "entryRuleSlangTPattern"
    // InternalGumboParser.g:3991:1: entryRuleSlangTPattern returns [EObject current=null] : iv_ruleSlangTPattern= ruleSlangTPattern EOF ;
    public final EObject entryRuleSlangTPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangTPattern = null;


        try {
            // InternalGumboParser.g:3991:54: (iv_ruleSlangTPattern= ruleSlangTPattern EOF )
            // InternalGumboParser.g:3992:2: iv_ruleSlangTPattern= ruleSlangTPattern EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlangTPatternRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlangTPattern=ruleSlangTPattern();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlangTPattern; 
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
    // $ANTLR end "entryRuleSlangTPattern"


    // $ANTLR start "ruleSlangTPattern"
    // InternalGumboParser.g:3998:1: ruleSlangTPattern returns [EObject current=null] : ( ( () this_ID_1= RULE_ID ( (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis ) | (otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) ) ) )? ) | (otherlv_9= LeftParenthesis ( (lv_patterns_10_0= ruleSlangTPattern ) ) (otherlv_11= Comma ( (lv_patterns_12_0= ruleSlangTPattern ) ) )* otherlv_13= RightParenthesis ) | ( () otherlv_15= KW__ (otherlv_16= Colon ( (lv_type_17_0= ruleSlangType ) ) )? ) ) ;
    public final EObject ruleSlangTPattern() throws RecognitionException {
        EObject current = null;

        Token this_ID_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_patterns_3_0 = null;

        EObject lv_patterns_5_0 = null;

        EObject lv_type_8_0 = null;

        EObject lv_patterns_10_0 = null;

        EObject lv_patterns_12_0 = null;

        EObject lv_type_17_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:4004:2: ( ( ( () this_ID_1= RULE_ID ( (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis ) | (otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) ) ) )? ) | (otherlv_9= LeftParenthesis ( (lv_patterns_10_0= ruleSlangTPattern ) ) (otherlv_11= Comma ( (lv_patterns_12_0= ruleSlangTPattern ) ) )* otherlv_13= RightParenthesis ) | ( () otherlv_15= KW__ (otherlv_16= Colon ( (lv_type_17_0= ruleSlangType ) ) )? ) ) )
            // InternalGumboParser.g:4005:2: ( ( () this_ID_1= RULE_ID ( (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis ) | (otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) ) ) )? ) | (otherlv_9= LeftParenthesis ( (lv_patterns_10_0= ruleSlangTPattern ) ) (otherlv_11= Comma ( (lv_patterns_12_0= ruleSlangTPattern ) ) )* otherlv_13= RightParenthesis ) | ( () otherlv_15= KW__ (otherlv_16= Colon ( (lv_type_17_0= ruleSlangType ) ) )? ) )
            {
            // InternalGumboParser.g:4005:2: ( ( () this_ID_1= RULE_ID ( (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis ) | (otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) ) ) )? ) | (otherlv_9= LeftParenthesis ( (lv_patterns_10_0= ruleSlangTPattern ) ) (otherlv_11= Comma ( (lv_patterns_12_0= ruleSlangTPattern ) ) )* otherlv_13= RightParenthesis ) | ( () otherlv_15= KW__ (otherlv_16= Colon ( (lv_type_17_0= ruleSlangType ) ) )? ) )
            int alt88=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt88=1;
                }
                break;
            case LeftParenthesis:
                {
                alt88=2;
                }
                break;
            case KW__:
                {
                alt88=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }

            switch (alt88) {
                case 1 :
                    // InternalGumboParser.g:4006:3: ( () this_ID_1= RULE_ID ( (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis ) | (otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) ) ) )? )
                    {
                    // InternalGumboParser.g:4006:3: ( () this_ID_1= RULE_ID ( (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis ) | (otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) ) ) )? )
                    // InternalGumboParser.g:4007:4: () this_ID_1= RULE_ID ( (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis ) | (otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) ) ) )?
                    {
                    // InternalGumboParser.g:4007:4: ()
                    // InternalGumboParser.g:4008:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangTPatternAccess().getSlangTPatternAction_0_0(),
                      						current);
                      				
                    }

                    }

                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_71); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_1, grammarAccess.getSlangTPatternAccess().getIDTerminalRuleCall_0_1());
                      			
                    }
                    // InternalGumboParser.g:4021:4: ( (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis ) | (otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) ) ) )?
                    int alt85=3;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==LeftParenthesis) ) {
                        alt85=1;
                    }
                    else if ( (LA85_0==Colon) ) {
                        alt85=2;
                    }
                    switch (alt85) {
                        case 1 :
                            // InternalGumboParser.g:4022:5: (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis )
                            {
                            // InternalGumboParser.g:4022:5: (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis )
                            // InternalGumboParser.g:4023:6: otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis
                            {
                            otherlv_2=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_70); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_2, grammarAccess.getSlangTPatternAccess().getLeftParenthesisKeyword_0_2_0_0());
                              					
                            }
                            // InternalGumboParser.g:4027:6: ( (lv_patterns_3_0= ruleSlangTPattern ) )
                            // InternalGumboParser.g:4028:7: (lv_patterns_3_0= ruleSlangTPattern )
                            {
                            // InternalGumboParser.g:4028:7: (lv_patterns_3_0= ruleSlangTPattern )
                            // InternalGumboParser.g:4029:8: lv_patterns_3_0= ruleSlangTPattern
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getSlangTPatternAccess().getPatternsSlangTPatternParserRuleCall_0_2_0_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_41);
                            lv_patterns_3_0=ruleSlangTPattern();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getSlangTPatternRule());
                              								}
                              								add(
                              									current,
                              									"patterns",
                              									lv_patterns_3_0,
                              									"org.sireum.aadl.gumbo.Gumbo.SlangTPattern");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalGumboParser.g:4046:6: (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )*
                            loop84:
                            do {
                                int alt84=2;
                                int LA84_0 = input.LA(1);

                                if ( (LA84_0==Comma) ) {
                                    alt84=1;
                                }


                                switch (alt84) {
                            	case 1 :
                            	    // InternalGumboParser.g:4047:7: otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) )
                            	    {
                            	    otherlv_4=(Token)match(input,Comma,FollowSets000.FOLLOW_70); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_4, grammarAccess.getSlangTPatternAccess().getCommaKeyword_0_2_0_2_0());
                            	      						
                            	    }
                            	    // InternalGumboParser.g:4051:7: ( (lv_patterns_5_0= ruleSlangTPattern ) )
                            	    // InternalGumboParser.g:4052:8: (lv_patterns_5_0= ruleSlangTPattern )
                            	    {
                            	    // InternalGumboParser.g:4052:8: (lv_patterns_5_0= ruleSlangTPattern )
                            	    // InternalGumboParser.g:4053:9: lv_patterns_5_0= ruleSlangTPattern
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getSlangTPatternAccess().getPatternsSlangTPatternParserRuleCall_0_2_0_2_1_0());
                            	      								
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_41);
                            	    lv_patterns_5_0=ruleSlangTPattern();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									if (current==null) {
                            	      										current = createModelElementForParent(grammarAccess.getSlangTPatternRule());
                            	      									}
                            	      									add(
                            	      										current,
                            	      										"patterns",
                            	      										lv_patterns_5_0,
                            	      										"org.sireum.aadl.gumbo.Gumbo.SlangTPattern");
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

                            otherlv_6=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_6, grammarAccess.getSlangTPatternAccess().getRightParenthesisKeyword_0_2_0_3());
                              					
                            }

                            }


                            }
                            break;
                        case 2 :
                            // InternalGumboParser.g:4077:5: (otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) ) )
                            {
                            // InternalGumboParser.g:4077:5: (otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) ) )
                            // InternalGumboParser.g:4078:6: otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) )
                            {
                            otherlv_7=(Token)match(input,Colon,FollowSets000.FOLLOW_8); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_7, grammarAccess.getSlangTPatternAccess().getColonKeyword_0_2_1_0());
                              					
                            }
                            // InternalGumboParser.g:4082:6: ( (lv_type_8_0= ruleSlangType ) )
                            // InternalGumboParser.g:4083:7: (lv_type_8_0= ruleSlangType )
                            {
                            // InternalGumboParser.g:4083:7: (lv_type_8_0= ruleSlangType )
                            // InternalGumboParser.g:4084:8: lv_type_8_0= ruleSlangType
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getSlangTPatternAccess().getTypeSlangTypeParserRuleCall_0_2_1_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_type_8_0=ruleSlangType();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getSlangTPatternRule());
                              								}
                              								set(
                              									current,
                              									"type",
                              									lv_type_8_0,
                              									"org.sireum.aadl.gumbo.Gumbo.SlangType");
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
                    // InternalGumboParser.g:4105:3: (otherlv_9= LeftParenthesis ( (lv_patterns_10_0= ruleSlangTPattern ) ) (otherlv_11= Comma ( (lv_patterns_12_0= ruleSlangTPattern ) ) )* otherlv_13= RightParenthesis )
                    {
                    // InternalGumboParser.g:4105:3: (otherlv_9= LeftParenthesis ( (lv_patterns_10_0= ruleSlangTPattern ) ) (otherlv_11= Comma ( (lv_patterns_12_0= ruleSlangTPattern ) ) )* otherlv_13= RightParenthesis )
                    // InternalGumboParser.g:4106:4: otherlv_9= LeftParenthesis ( (lv_patterns_10_0= ruleSlangTPattern ) ) (otherlv_11= Comma ( (lv_patterns_12_0= ruleSlangTPattern ) ) )* otherlv_13= RightParenthesis
                    {
                    otherlv_9=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_70); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getSlangTPatternAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalGumboParser.g:4110:4: ( (lv_patterns_10_0= ruleSlangTPattern ) )
                    // InternalGumboParser.g:4111:5: (lv_patterns_10_0= ruleSlangTPattern )
                    {
                    // InternalGumboParser.g:4111:5: (lv_patterns_10_0= ruleSlangTPattern )
                    // InternalGumboParser.g:4112:6: lv_patterns_10_0= ruleSlangTPattern
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangTPatternAccess().getPatternsSlangTPatternParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_41);
                    lv_patterns_10_0=ruleSlangTPattern();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlangTPatternRule());
                      						}
                      						add(
                      							current,
                      							"patterns",
                      							lv_patterns_10_0,
                      							"org.sireum.aadl.gumbo.Gumbo.SlangTPattern");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:4129:4: (otherlv_11= Comma ( (lv_patterns_12_0= ruleSlangTPattern ) ) )*
                    loop86:
                    do {
                        int alt86=2;
                        int LA86_0 = input.LA(1);

                        if ( (LA86_0==Comma) ) {
                            alt86=1;
                        }


                        switch (alt86) {
                    	case 1 :
                    	    // InternalGumboParser.g:4130:5: otherlv_11= Comma ( (lv_patterns_12_0= ruleSlangTPattern ) )
                    	    {
                    	    otherlv_11=(Token)match(input,Comma,FollowSets000.FOLLOW_70); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_11, grammarAccess.getSlangTPatternAccess().getCommaKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:4134:5: ( (lv_patterns_12_0= ruleSlangTPattern ) )
                    	    // InternalGumboParser.g:4135:6: (lv_patterns_12_0= ruleSlangTPattern )
                    	    {
                    	    // InternalGumboParser.g:4135:6: (lv_patterns_12_0= ruleSlangTPattern )
                    	    // InternalGumboParser.g:4136:7: lv_patterns_12_0= ruleSlangTPattern
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSlangTPatternAccess().getPatternsSlangTPatternParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_41);
                    	    lv_patterns_12_0=ruleSlangTPattern();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSlangTPatternRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"patterns",
                    	      								lv_patterns_12_0,
                    	      								"org.sireum.aadl.gumbo.Gumbo.SlangTPattern");
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

                    otherlv_13=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getSlangTPatternAccess().getRightParenthesisKeyword_1_3());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGumboParser.g:4160:3: ( () otherlv_15= KW__ (otherlv_16= Colon ( (lv_type_17_0= ruleSlangType ) ) )? )
                    {
                    // InternalGumboParser.g:4160:3: ( () otherlv_15= KW__ (otherlv_16= Colon ( (lv_type_17_0= ruleSlangType ) ) )? )
                    // InternalGumboParser.g:4161:4: () otherlv_15= KW__ (otherlv_16= Colon ( (lv_type_17_0= ruleSlangType ) ) )?
                    {
                    // InternalGumboParser.g:4161:4: ()
                    // InternalGumboParser.g:4162:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangTPatternAccess().getSlangTPatternAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_15=(Token)match(input,KW__,FollowSets000.FOLLOW_72); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getSlangTPatternAccess().get_Keyword_2_1());
                      			
                    }
                    // InternalGumboParser.g:4175:4: (otherlv_16= Colon ( (lv_type_17_0= ruleSlangType ) ) )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==Colon) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // InternalGumboParser.g:4176:5: otherlv_16= Colon ( (lv_type_17_0= ruleSlangType ) )
                            {
                            otherlv_16=(Token)match(input,Colon,FollowSets000.FOLLOW_8); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_16, grammarAccess.getSlangTPatternAccess().getColonKeyword_2_2_0());
                              				
                            }
                            // InternalGumboParser.g:4180:5: ( (lv_type_17_0= ruleSlangType ) )
                            // InternalGumboParser.g:4181:6: (lv_type_17_0= ruleSlangType )
                            {
                            // InternalGumboParser.g:4181:6: (lv_type_17_0= ruleSlangType )
                            // InternalGumboParser.g:4182:7: lv_type_17_0= ruleSlangType
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSlangTPatternAccess().getTypeSlangTypeParserRuleCall_2_2_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_type_17_0=ruleSlangType();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getSlangTPatternRule());
                              							}
                              							set(
                              								current,
                              								"type",
                              								lv_type_17_0,
                              								"org.sireum.aadl.gumbo.Gumbo.SlangType");
                              							afterParserOrEnumRuleCall();
                              						
                            }

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
    // $ANTLR end "ruleSlangTPattern"


    // $ANTLR start "entryRuleSlangVarDef"
    // InternalGumboParser.g:4205:1: entryRuleSlangVarDef returns [EObject current=null] : iv_ruleSlangVarDef= ruleSlangVarDef EOF ;
    public final EObject entryRuleSlangVarDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangVarDef = null;


        try {
            // InternalGumboParser.g:4205:52: (iv_ruleSlangVarDef= ruleSlangVarDef EOF )
            // InternalGumboParser.g:4206:2: iv_ruleSlangVarDef= ruleSlangVarDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlangVarDefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlangVarDef=ruleSlangVarDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlangVarDef; 
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
    // $ANTLR end "entryRuleSlangVarDef"


    // $ANTLR start "ruleSlangVarDef"
    // InternalGumboParser.g:4212:1: ruleSlangVarDef returns [EObject current=null] : ( ruleSlangVarMod this_SlangPattern_1= ruleSlangPattern (otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) )? otherlv_4= ColonEqualsSign ( (lv_init_5_0= ruleExpr ) ) ) ;
    public final EObject ruleSlangVarDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_SlangPattern_1 = null;

        EObject lv_typeName_3_0 = null;

        EObject lv_init_5_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:4218:2: ( ( ruleSlangVarMod this_SlangPattern_1= ruleSlangPattern (otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) )? otherlv_4= ColonEqualsSign ( (lv_init_5_0= ruleExpr ) ) ) )
            // InternalGumboParser.g:4219:2: ( ruleSlangVarMod this_SlangPattern_1= ruleSlangPattern (otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) )? otherlv_4= ColonEqualsSign ( (lv_init_5_0= ruleExpr ) ) )
            {
            // InternalGumboParser.g:4219:2: ( ruleSlangVarMod this_SlangPattern_1= ruleSlangPattern (otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) )? otherlv_4= ColonEqualsSign ( (lv_init_5_0= ruleExpr ) ) )
            // InternalGumboParser.g:4220:3: ruleSlangVarMod this_SlangPattern_1= ruleSlangPattern (otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) )? otherlv_4= ColonEqualsSign ( (lv_init_5_0= ruleExpr ) )
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSlangVarDefAccess().getSlangVarModParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_65);
            ruleSlangVarMod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSlangVarDefAccess().getSlangPatternParserRuleCall_1());
              		
            }
            pushFollow(FollowSets000.FOLLOW_73);
            this_SlangPattern_1=ruleSlangPattern();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SlangPattern_1;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGumboParser.g:4241:3: (otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==Colon) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalGumboParser.g:4242:4: otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) )
                    {
                    otherlv_2=(Token)match(input,Colon,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSlangVarDefAccess().getColonKeyword_2_0());
                      			
                    }
                    // InternalGumboParser.g:4246:4: ( (lv_typeName_3_0= ruleSlangType ) )
                    // InternalGumboParser.g:4247:5: (lv_typeName_3_0= ruleSlangType )
                    {
                    // InternalGumboParser.g:4247:5: (lv_typeName_3_0= ruleSlangType )
                    // InternalGumboParser.g:4248:6: lv_typeName_3_0= ruleSlangType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangVarDefAccess().getTypeNameSlangTypeParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_38);
                    lv_typeName_3_0=ruleSlangType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlangVarDefRule());
                      						}
                      						set(
                      							current,
                      							"typeName",
                      							lv_typeName_3_0,
                      							"org.sireum.aadl.gumbo.Gumbo.SlangType");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,ColonEqualsSign,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getSlangVarDefAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalGumboParser.g:4270:3: ( (lv_init_5_0= ruleExpr ) )
            // InternalGumboParser.g:4271:4: (lv_init_5_0= ruleExpr )
            {
            // InternalGumboParser.g:4271:4: (lv_init_5_0= ruleExpr )
            // InternalGumboParser.g:4272:5: lv_init_5_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangVarDefAccess().getInitExprParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_init_5_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSlangVarDefRule());
              					}
              					set(
              						current,
              						"init",
              						lv_init_5_0,
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
    // $ANTLR end "ruleSlangVarDef"


    // $ANTLR start "entryRuleSlangVarMod"
    // InternalGumboParser.g:4293:1: entryRuleSlangVarMod returns [String current=null] : iv_ruleSlangVarMod= ruleSlangVarMod EOF ;
    public final String entryRuleSlangVarMod() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSlangVarMod = null;


        try {
            // InternalGumboParser.g:4293:51: (iv_ruleSlangVarMod= ruleSlangVarMod EOF )
            // InternalGumboParser.g:4294:2: iv_ruleSlangVarMod= ruleSlangVarMod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlangVarModRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlangVarMod=ruleSlangVarMod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlangVarMod.getText(); 
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
    // $ANTLR end "entryRuleSlangVarMod"


    // $ANTLR start "ruleSlangVarMod"
    // InternalGumboParser.g:4300:1: ruleSlangVarMod returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Val | kw= Var ) ;
    public final AntlrDatatypeRuleToken ruleSlangVarMod() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumboParser.g:4306:2: ( (kw= Val | kw= Var ) )
            // InternalGumboParser.g:4307:2: (kw= Val | kw= Var )
            {
            // InternalGumboParser.g:4307:2: (kw= Val | kw= Var )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==Val) ) {
                alt90=1;
            }
            else if ( (LA90_0==Var) ) {
                alt90=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // InternalGumboParser.g:4308:3: kw= Val
                    {
                    kw=(Token)match(input,Val,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getSlangVarModAccess().getValKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:4314:3: kw= Var
                    {
                    kw=(Token)match(input,Var,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getSlangVarModAccess().getVarKeyword_1());
                      		
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
    // $ANTLR end "ruleSlangVarMod"


    // $ANTLR start "entryRuleExpr"
    // InternalGumboParser.g:4323:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // InternalGumboParser.g:4323:45: (iv_ruleExpr= ruleExpr EOF )
            // InternalGumboParser.g:4324:2: iv_ruleExpr= ruleExpr EOF
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
    // InternalGumboParser.g:4330:1: ruleExpr returns [EObject current=null] : ( ( () ( (lv_terms_1_0= ruleSlangAccess ) ) ( ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )* | (otherlv_4= QuestionMark ( (lv_thenExpr_5_0= ruleExpr ) ) otherlv_6= Colon ( (lv_elseExpr_7_0= ruleExpr ) ) ) ) ) | ( () (otherlv_9= All | otherlv_10= Some | otherlv_11= ForAll | otherlv_12= ThereExists ) ( (lv_qVar_13_0= ruleSlangQuantVar ) ) (otherlv_14= Comma ( (lv_qVar_15_0= ruleSlangQuantVar ) ) )* otherlv_16= EqualsSignGreaterThanSign ( (lv_quantifiedExpr_17_0= ruleExpr ) ) ) | ( () ( (lv_op_19_0= ruleOperator ) ) ( (lv_accessExp_20_0= ruleSlangAccess ) ) ) ) ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject lv_terms_1_0 = null;

        AntlrDatatypeRuleToken lv_ops_2_0 = null;

        EObject lv_terms_3_0 = null;

        EObject lv_thenExpr_5_0 = null;

        EObject lv_elseExpr_7_0 = null;

        EObject lv_qVar_13_0 = null;

        EObject lv_qVar_15_0 = null;

        EObject lv_quantifiedExpr_17_0 = null;

        AntlrDatatypeRuleToken lv_op_19_0 = null;

        EObject lv_accessExp_20_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:4336:2: ( ( ( () ( (lv_terms_1_0= ruleSlangAccess ) ) ( ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )* | (otherlv_4= QuestionMark ( (lv_thenExpr_5_0= ruleExpr ) ) otherlv_6= Colon ( (lv_elseExpr_7_0= ruleExpr ) ) ) ) ) | ( () (otherlv_9= All | otherlv_10= Some | otherlv_11= ForAll | otherlv_12= ThereExists ) ( (lv_qVar_13_0= ruleSlangQuantVar ) ) (otherlv_14= Comma ( (lv_qVar_15_0= ruleSlangQuantVar ) ) )* otherlv_16= EqualsSignGreaterThanSign ( (lv_quantifiedExpr_17_0= ruleExpr ) ) ) | ( () ( (lv_op_19_0= ruleOperator ) ) ( (lv_accessExp_20_0= ruleSlangAccess ) ) ) ) )
            // InternalGumboParser.g:4337:2: ( ( () ( (lv_terms_1_0= ruleSlangAccess ) ) ( ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )* | (otherlv_4= QuestionMark ( (lv_thenExpr_5_0= ruleExpr ) ) otherlv_6= Colon ( (lv_elseExpr_7_0= ruleExpr ) ) ) ) ) | ( () (otherlv_9= All | otherlv_10= Some | otherlv_11= ForAll | otherlv_12= ThereExists ) ( (lv_qVar_13_0= ruleSlangQuantVar ) ) (otherlv_14= Comma ( (lv_qVar_15_0= ruleSlangQuantVar ) ) )* otherlv_16= EqualsSignGreaterThanSign ( (lv_quantifiedExpr_17_0= ruleExpr ) ) ) | ( () ( (lv_op_19_0= ruleOperator ) ) ( (lv_accessExp_20_0= ruleSlangAccess ) ) ) )
            {
            // InternalGumboParser.g:4337:2: ( ( () ( (lv_terms_1_0= ruleSlangAccess ) ) ( ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )* | (otherlv_4= QuestionMark ( (lv_thenExpr_5_0= ruleExpr ) ) otherlv_6= Colon ( (lv_elseExpr_7_0= ruleExpr ) ) ) ) ) | ( () (otherlv_9= All | otherlv_10= Some | otherlv_11= ForAll | otherlv_12= ThereExists ) ( (lv_qVar_13_0= ruleSlangQuantVar ) ) (otherlv_14= Comma ( (lv_qVar_15_0= ruleSlangQuantVar ) ) )* otherlv_16= EqualsSignGreaterThanSign ( (lv_quantifiedExpr_17_0= ruleExpr ) ) ) | ( () ( (lv_op_19_0= ruleOperator ) ) ( (lv_accessExp_20_0= ruleSlangAccess ) ) ) )
            int alt95=3;
            switch ( input.LA(1) ) {
            case MustSend:
            case MaySend:
            case NoSend:
            case For:
            case In_1:
            case LeftParenthesis:
            case F:
            case T:
            case LeftCurlyBracket:
            case RULE_SLANG_STRING:
            case RULE_MSTRING:
            case RULE_MSP:
            case RULE_SLI:
            case RULE_MSPB:
            case RULE_HEX:
            case RULE_BIN:
            case RULE_INTEGER_LIT:
            case RULE_INT_IDF:
            case RULE_REAL_LIT:
            case RULE_REAL_IDF:
            case RULE_ID:
                {
                alt95=1;
                }
                break;
            case Some:
            case All:
            case ForAll:
            case ThereExists:
                {
                alt95=2;
                }
                break;
            case Asterisk:
            case PlusSign:
            case HyphenMinus:
            case RULE_IMPLIES:
            case RULE_SIMPLIES:
            case RULE_OP:
                {
                alt95=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // InternalGumboParser.g:4338:3: ( () ( (lv_terms_1_0= ruleSlangAccess ) ) ( ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )* | (otherlv_4= QuestionMark ( (lv_thenExpr_5_0= ruleExpr ) ) otherlv_6= Colon ( (lv_elseExpr_7_0= ruleExpr ) ) ) ) )
                    {
                    // InternalGumboParser.g:4338:3: ( () ( (lv_terms_1_0= ruleSlangAccess ) ) ( ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )* | (otherlv_4= QuestionMark ( (lv_thenExpr_5_0= ruleExpr ) ) otherlv_6= Colon ( (lv_elseExpr_7_0= ruleExpr ) ) ) ) )
                    // InternalGumboParser.g:4339:4: () ( (lv_terms_1_0= ruleSlangAccess ) ) ( ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )* | (otherlv_4= QuestionMark ( (lv_thenExpr_5_0= ruleExpr ) ) otherlv_6= Colon ( (lv_elseExpr_7_0= ruleExpr ) ) ) )
                    {
                    // InternalGumboParser.g:4339:4: ()
                    // InternalGumboParser.g:4340:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getExprAccess().getBasicExpAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:4349:4: ( (lv_terms_1_0= ruleSlangAccess ) )
                    // InternalGumboParser.g:4350:5: (lv_terms_1_0= ruleSlangAccess )
                    {
                    // InternalGumboParser.g:4350:5: (lv_terms_1_0= ruleSlangAccess )
                    // InternalGumboParser.g:4351:6: lv_terms_1_0= ruleSlangAccess
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprAccess().getTermsSlangAccessParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_74);
                    lv_terms_1_0=ruleSlangAccess();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprRule());
                      						}
                      						add(
                      							current,
                      							"terms",
                      							lv_terms_1_0,
                      							"org.sireum.aadl.gumbo.Gumbo.SlangAccess");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:4368:4: ( ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )* | (otherlv_4= QuestionMark ( (lv_thenExpr_5_0= ruleExpr ) ) otherlv_6= Colon ( (lv_elseExpr_7_0= ruleExpr ) ) ) )
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==EOF||LA92_0==Invariant||(LA92_0>=Modifies && LA92_0<=Requires)||LA92_0==Ensures||(LA92_0>=Assert && LA92_0<=Assume)||LA92_0==Return||LA92_0==Match||LA92_0==Reads||(LA92_0>=While && LA92_0<=Yield)||LA92_0==Case||(LA92_0>=Halt && LA92_0<=Spec)||LA92_0==FullStopFullStopLessThanSign||(LA92_0>=Val && LA92_0<=FullStopFullStop)||LA92_0==ColonEqualsSign||(LA92_0>=EqualsSignGreaterThanSign && LA92_0<=If)||(LA92_0>=RightParenthesis && LA92_0<=HyphenMinus)||(LA92_0>=Colon && LA92_0<=Semicolon)||(LA92_0>=LeftCurlyBracket && LA92_0<=RightCurlyBracket)||LA92_0==RULE_SLANG_STRING||(LA92_0>=RULE_IMPLIES && LA92_0<=RULE_OP)||LA92_0==RULE_ID) ) {
                        alt92=1;
                    }
                    else if ( (LA92_0==QuestionMark) ) {
                        alt92=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 92, 0, input);

                        throw nvae;
                    }
                    switch (alt92) {
                        case 1 :
                            // InternalGumboParser.g:4369:5: ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )*
                            {
                            // InternalGumboParser.g:4369:5: ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )*
                            loop91:
                            do {
                                int alt91=2;
                                int LA91_0 = input.LA(1);

                                if ( ((LA91_0>=Asterisk && LA91_0<=PlusSign)||LA91_0==HyphenMinus||(LA91_0>=RULE_IMPLIES && LA91_0<=RULE_OP)) ) {
                                    alt91=1;
                                }


                                switch (alt91) {
                            	case 1 :
                            	    // InternalGumboParser.g:4370:6: ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) )
                            	    {
                            	    // InternalGumboParser.g:4370:6: ( (lv_ops_2_0= ruleOperator ) )
                            	    // InternalGumboParser.g:4371:7: (lv_ops_2_0= ruleOperator )
                            	    {
                            	    // InternalGumboParser.g:4371:7: (lv_ops_2_0= ruleOperator )
                            	    // InternalGumboParser.g:4372:8: lv_ops_2_0= ruleOperator
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getExprAccess().getOpsOperatorParserRuleCall_0_2_0_0_0());
                            	      							
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_75);
                            	    lv_ops_2_0=ruleOperator();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getExprRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"ops",
                            	      									lv_ops_2_0,
                            	      									"org.sireum.aadl.gumbo.Gumbo.Operator");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }

                            	    // InternalGumboParser.g:4389:6: ( (lv_terms_3_0= ruleSlangAccess ) )
                            	    // InternalGumboParser.g:4390:7: (lv_terms_3_0= ruleSlangAccess )
                            	    {
                            	    // InternalGumboParser.g:4390:7: (lv_terms_3_0= ruleSlangAccess )
                            	    // InternalGumboParser.g:4391:8: lv_terms_3_0= ruleSlangAccess
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getExprAccess().getTermsSlangAccessParserRuleCall_0_2_0_1_0());
                            	      							
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_76);
                            	    lv_terms_3_0=ruleSlangAccess();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getExprRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"terms",
                            	      									lv_terms_3_0,
                            	      									"org.sireum.aadl.gumbo.Gumbo.SlangAccess");
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
                        case 2 :
                            // InternalGumboParser.g:4410:5: (otherlv_4= QuestionMark ( (lv_thenExpr_5_0= ruleExpr ) ) otherlv_6= Colon ( (lv_elseExpr_7_0= ruleExpr ) ) )
                            {
                            // InternalGumboParser.g:4410:5: (otherlv_4= QuestionMark ( (lv_thenExpr_5_0= ruleExpr ) ) otherlv_6= Colon ( (lv_elseExpr_7_0= ruleExpr ) ) )
                            // InternalGumboParser.g:4411:6: otherlv_4= QuestionMark ( (lv_thenExpr_5_0= ruleExpr ) ) otherlv_6= Colon ( (lv_elseExpr_7_0= ruleExpr ) )
                            {
                            otherlv_4=(Token)match(input,QuestionMark,FollowSets000.FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_4, grammarAccess.getExprAccess().getQuestionMarkKeyword_0_2_1_0());
                              					
                            }
                            // InternalGumboParser.g:4415:6: ( (lv_thenExpr_5_0= ruleExpr ) )
                            // InternalGumboParser.g:4416:7: (lv_thenExpr_5_0= ruleExpr )
                            {
                            // InternalGumboParser.g:4416:7: (lv_thenExpr_5_0= ruleExpr )
                            // InternalGumboParser.g:4417:8: lv_thenExpr_5_0= ruleExpr
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getExprAccess().getThenExprExprParserRuleCall_0_2_1_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_10);
                            lv_thenExpr_5_0=ruleExpr();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getExprRule());
                              								}
                              								set(
                              									current,
                              									"thenExpr",
                              									lv_thenExpr_5_0,
                              									"org.sireum.aadl.gumbo.Gumbo.Expr");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            otherlv_6=(Token)match(input,Colon,FollowSets000.FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_6, grammarAccess.getExprAccess().getColonKeyword_0_2_1_2());
                              					
                            }
                            // InternalGumboParser.g:4438:6: ( (lv_elseExpr_7_0= ruleExpr ) )
                            // InternalGumboParser.g:4439:7: (lv_elseExpr_7_0= ruleExpr )
                            {
                            // InternalGumboParser.g:4439:7: (lv_elseExpr_7_0= ruleExpr )
                            // InternalGumboParser.g:4440:8: lv_elseExpr_7_0= ruleExpr
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getExprAccess().getElseExprExprParserRuleCall_0_2_1_3_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_elseExpr_7_0=ruleExpr();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getExprRule());
                              								}
                              								set(
                              									current,
                              									"elseExpr",
                              									lv_elseExpr_7_0,
                              									"org.sireum.aadl.gumbo.Gumbo.Expr");
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
                    // InternalGumboParser.g:4461:3: ( () (otherlv_9= All | otherlv_10= Some | otherlv_11= ForAll | otherlv_12= ThereExists ) ( (lv_qVar_13_0= ruleSlangQuantVar ) ) (otherlv_14= Comma ( (lv_qVar_15_0= ruleSlangQuantVar ) ) )* otherlv_16= EqualsSignGreaterThanSign ( (lv_quantifiedExpr_17_0= ruleExpr ) ) )
                    {
                    // InternalGumboParser.g:4461:3: ( () (otherlv_9= All | otherlv_10= Some | otherlv_11= ForAll | otherlv_12= ThereExists ) ( (lv_qVar_13_0= ruleSlangQuantVar ) ) (otherlv_14= Comma ( (lv_qVar_15_0= ruleSlangQuantVar ) ) )* otherlv_16= EqualsSignGreaterThanSign ( (lv_quantifiedExpr_17_0= ruleExpr ) ) )
                    // InternalGumboParser.g:4462:4: () (otherlv_9= All | otherlv_10= Some | otherlv_11= ForAll | otherlv_12= ThereExists ) ( (lv_qVar_13_0= ruleSlangQuantVar ) ) (otherlv_14= Comma ( (lv_qVar_15_0= ruleSlangQuantVar ) ) )* otherlv_16= EqualsSignGreaterThanSign ( (lv_quantifiedExpr_17_0= ruleExpr ) )
                    {
                    // InternalGumboParser.g:4462:4: ()
                    // InternalGumboParser.g:4463:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getExprAccess().getQuantifiedExpAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:4472:4: (otherlv_9= All | otherlv_10= Some | otherlv_11= ForAll | otherlv_12= ThereExists )
                    int alt93=4;
                    switch ( input.LA(1) ) {
                    case All:
                        {
                        alt93=1;
                        }
                        break;
                    case Some:
                        {
                        alt93=2;
                        }
                        break;
                    case ForAll:
                        {
                        alt93=3;
                        }
                        break;
                    case ThereExists:
                        {
                        alt93=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 93, 0, input);

                        throw nvae;
                    }

                    switch (alt93) {
                        case 1 :
                            // InternalGumboParser.g:4473:5: otherlv_9= All
                            {
                            otherlv_9=(Token)match(input,All,FollowSets000.FOLLOW_8); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_9, grammarAccess.getExprAccess().getAllKeyword_1_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalGumboParser.g:4478:5: otherlv_10= Some
                            {
                            otherlv_10=(Token)match(input,Some,FollowSets000.FOLLOW_8); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_10, grammarAccess.getExprAccess().getSomeKeyword_1_1_1());
                              				
                            }

                            }
                            break;
                        case 3 :
                            // InternalGumboParser.g:4483:5: otherlv_11= ForAll
                            {
                            otherlv_11=(Token)match(input,ForAll,FollowSets000.FOLLOW_8); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_11, grammarAccess.getExprAccess().getForAllKeyword_1_1_2());
                              				
                            }

                            }
                            break;
                        case 4 :
                            // InternalGumboParser.g:4488:5: otherlv_12= ThereExists
                            {
                            otherlv_12=(Token)match(input,ThereExists,FollowSets000.FOLLOW_8); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_12, grammarAccess.getExprAccess().getThereExistsKeyword_1_1_3());
                              				
                            }

                            }
                            break;

                    }

                    // InternalGumboParser.g:4493:4: ( (lv_qVar_13_0= ruleSlangQuantVar ) )
                    // InternalGumboParser.g:4494:5: (lv_qVar_13_0= ruleSlangQuantVar )
                    {
                    // InternalGumboParser.g:4494:5: (lv_qVar_13_0= ruleSlangQuantVar )
                    // InternalGumboParser.g:4495:6: lv_qVar_13_0= ruleSlangQuantVar
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprAccess().getQVarSlangQuantVarParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_77);
                    lv_qVar_13_0=ruleSlangQuantVar();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprRule());
                      						}
                      						add(
                      							current,
                      							"qVar",
                      							lv_qVar_13_0,
                      							"org.sireum.aadl.gumbo.Gumbo.SlangQuantVar");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:4512:4: (otherlv_14= Comma ( (lv_qVar_15_0= ruleSlangQuantVar ) ) )*
                    loop94:
                    do {
                        int alt94=2;
                        int LA94_0 = input.LA(1);

                        if ( (LA94_0==Comma) ) {
                            alt94=1;
                        }


                        switch (alt94) {
                    	case 1 :
                    	    // InternalGumboParser.g:4513:5: otherlv_14= Comma ( (lv_qVar_15_0= ruleSlangQuantVar ) )
                    	    {
                    	    otherlv_14=(Token)match(input,Comma,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_14, grammarAccess.getExprAccess().getCommaKeyword_1_3_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:4517:5: ( (lv_qVar_15_0= ruleSlangQuantVar ) )
                    	    // InternalGumboParser.g:4518:6: (lv_qVar_15_0= ruleSlangQuantVar )
                    	    {
                    	    // InternalGumboParser.g:4518:6: (lv_qVar_15_0= ruleSlangQuantVar )
                    	    // InternalGumboParser.g:4519:7: lv_qVar_15_0= ruleSlangQuantVar
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getExprAccess().getQVarSlangQuantVarParserRuleCall_1_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_77);
                    	    lv_qVar_15_0=ruleSlangQuantVar();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getExprRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"qVar",
                    	      								lv_qVar_15_0,
                    	      								"org.sireum.aadl.gumbo.Gumbo.SlangQuantVar");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop94;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getExprAccess().getEqualsSignGreaterThanSignKeyword_1_4());
                      			
                    }
                    // InternalGumboParser.g:4541:4: ( (lv_quantifiedExpr_17_0= ruleExpr ) )
                    // InternalGumboParser.g:4542:5: (lv_quantifiedExpr_17_0= ruleExpr )
                    {
                    // InternalGumboParser.g:4542:5: (lv_quantifiedExpr_17_0= ruleExpr )
                    // InternalGumboParser.g:4543:6: lv_quantifiedExpr_17_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprAccess().getQuantifiedExprExprParserRuleCall_1_5_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_quantifiedExpr_17_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprRule());
                      						}
                      						set(
                      							current,
                      							"quantifiedExpr",
                      							lv_quantifiedExpr_17_0,
                      							"org.sireum.aadl.gumbo.Gumbo.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGumboParser.g:4562:3: ( () ( (lv_op_19_0= ruleOperator ) ) ( (lv_accessExp_20_0= ruleSlangAccess ) ) )
                    {
                    // InternalGumboParser.g:4562:3: ( () ( (lv_op_19_0= ruleOperator ) ) ( (lv_accessExp_20_0= ruleSlangAccess ) ) )
                    // InternalGumboParser.g:4563:4: () ( (lv_op_19_0= ruleOperator ) ) ( (lv_accessExp_20_0= ruleSlangAccess ) )
                    {
                    // InternalGumboParser.g:4563:4: ()
                    // InternalGumboParser.g:4564:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getExprAccess().getUnaryExpAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:4573:4: ( (lv_op_19_0= ruleOperator ) )
                    // InternalGumboParser.g:4574:5: (lv_op_19_0= ruleOperator )
                    {
                    // InternalGumboParser.g:4574:5: (lv_op_19_0= ruleOperator )
                    // InternalGumboParser.g:4575:6: lv_op_19_0= ruleOperator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprAccess().getOpOperatorParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_75);
                    lv_op_19_0=ruleOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprRule());
                      						}
                      						set(
                      							current,
                      							"op",
                      							lv_op_19_0,
                      							"org.sireum.aadl.gumbo.Gumbo.Operator");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:4592:4: ( (lv_accessExp_20_0= ruleSlangAccess ) )
                    // InternalGumboParser.g:4593:5: (lv_accessExp_20_0= ruleSlangAccess )
                    {
                    // InternalGumboParser.g:4593:5: (lv_accessExp_20_0= ruleSlangAccess )
                    // InternalGumboParser.g:4594:6: lv_accessExp_20_0= ruleSlangAccess
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprAccess().getAccessExpSlangAccessParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_accessExp_20_0=ruleSlangAccess();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprRule());
                      						}
                      						set(
                      							current,
                      							"accessExp",
                      							lv_accessExp_20_0,
                      							"org.sireum.aadl.gumbo.Gumbo.SlangAccess");
                      						afterParserOrEnumRuleCall();
                      					
                    }

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
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleSlangQuantVar"
    // InternalGumboParser.g:4616:1: entryRuleSlangQuantVar returns [EObject current=null] : iv_ruleSlangQuantVar= ruleSlangQuantVar EOF ;
    public final EObject entryRuleSlangQuantVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangQuantVar = null;


        try {
            // InternalGumboParser.g:4616:54: (iv_ruleSlangQuantVar= ruleSlangQuantVar EOF )
            // InternalGumboParser.g:4617:2: iv_ruleSlangQuantVar= ruleSlangQuantVar EOF
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
    // InternalGumboParser.g:4623:1: ruleSlangQuantVar returns [EObject current=null] : (this_ID_0= RULE_ID otherlv_1= Colon ( (lv_e_2_0= ruleExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upperBound_5_0= ruleExpr ) ) )? ) ;
    public final EObject ruleSlangQuantVar() throws RecognitionException {
        EObject current = null;

        Token this_ID_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_e_2_0 = null;

        EObject lv_upperBound_5_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:4629:2: ( (this_ID_0= RULE_ID otherlv_1= Colon ( (lv_e_2_0= ruleExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upperBound_5_0= ruleExpr ) ) )? ) )
            // InternalGumboParser.g:4630:2: (this_ID_0= RULE_ID otherlv_1= Colon ( (lv_e_2_0= ruleExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upperBound_5_0= ruleExpr ) ) )? )
            {
            // InternalGumboParser.g:4630:2: (this_ID_0= RULE_ID otherlv_1= Colon ( (lv_e_2_0= ruleExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upperBound_5_0= ruleExpr ) ) )? )
            // InternalGumboParser.g:4631:3: this_ID_0= RULE_ID otherlv_1= Colon ( (lv_e_2_0= ruleExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upperBound_5_0= ruleExpr ) ) )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getSlangQuantVarAccess().getIDTerminalRuleCall_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSlangQuantVarAccess().getColonKeyword_1());
              		
            }
            // InternalGumboParser.g:4639:3: ( (lv_e_2_0= ruleExpr ) )
            // InternalGumboParser.g:4640:4: (lv_e_2_0= ruleExpr )
            {
            // InternalGumboParser.g:4640:4: (lv_e_2_0= ruleExpr )
            // InternalGumboParser.g:4641:5: lv_e_2_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangQuantVarAccess().getEExprParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_78);
            lv_e_2_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSlangQuantVarRule());
              					}
              					set(
              						current,
              						"e",
              						lv_e_2_0,
              						"org.sireum.aadl.gumbo.Gumbo.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumboParser.g:4658:3: ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upperBound_5_0= ruleExpr ) ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==FullStopFullStopLessThanSign||LA97_0==FullStopFullStop) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalGumboParser.g:4659:4: (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upperBound_5_0= ruleExpr ) )
                    {
                    // InternalGumboParser.g:4659:4: (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign )
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==FullStopFullStop) ) {
                        alt96=1;
                    }
                    else if ( (LA96_0==FullStopFullStopLessThanSign) ) {
                        alt96=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 96, 0, input);

                        throw nvae;
                    }
                    switch (alt96) {
                        case 1 :
                            // InternalGumboParser.g:4660:5: otherlv_3= FullStopFullStop
                            {
                            otherlv_3=(Token)match(input,FullStopFullStop,FollowSets000.FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_3, grammarAccess.getSlangQuantVarAccess().getFullStopFullStopKeyword_3_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalGumboParser.g:4665:5: otherlv_4= FullStopFullStopLessThanSign
                            {
                            otherlv_4=(Token)match(input,FullStopFullStopLessThanSign,FollowSets000.FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getSlangQuantVarAccess().getFullStopFullStopLessThanSignKeyword_3_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalGumboParser.g:4670:4: ( (lv_upperBound_5_0= ruleExpr ) )
                    // InternalGumboParser.g:4671:5: (lv_upperBound_5_0= ruleExpr )
                    {
                    // InternalGumboParser.g:4671:5: (lv_upperBound_5_0= ruleExpr )
                    // InternalGumboParser.g:4672:6: lv_upperBound_5_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangQuantVarAccess().getUpperBoundExprParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_upperBound_5_0=ruleExpr();

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
    // $ANTLR end "ruleSlangQuantVar"


    // $ANTLR start "entryRuleSlangBlock"
    // InternalGumboParser.g:4694:1: entryRuleSlangBlock returns [EObject current=null] : iv_ruleSlangBlock= ruleSlangBlock EOF ;
    public final EObject entryRuleSlangBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangBlock = null;


        try {
            // InternalGumboParser.g:4694:51: (iv_ruleSlangBlock= ruleSlangBlock EOF )
            // InternalGumboParser.g:4695:2: iv_ruleSlangBlock= ruleSlangBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlangBlockRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlangBlock=ruleSlangBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlangBlock; 
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
    // $ANTLR end "entryRuleSlangBlock"


    // $ANTLR start "ruleSlangBlock"
    // InternalGumboParser.g:4701:1: ruleSlangBlock returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( (lv_stmts_2_0= ruleSlangStmt ) )* ( (lv_r_3_0= ruleSlangRet ) )? otherlv_4= RightCurlyBracket ) ;
    public final EObject ruleSlangBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_stmts_2_0 = null;

        EObject lv_r_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:4707:2: ( ( () otherlv_1= LeftCurlyBracket ( (lv_stmts_2_0= ruleSlangStmt ) )* ( (lv_r_3_0= ruleSlangRet ) )? otherlv_4= RightCurlyBracket ) )
            // InternalGumboParser.g:4708:2: ( () otherlv_1= LeftCurlyBracket ( (lv_stmts_2_0= ruleSlangStmt ) )* ( (lv_r_3_0= ruleSlangRet ) )? otherlv_4= RightCurlyBracket )
            {
            // InternalGumboParser.g:4708:2: ( () otherlv_1= LeftCurlyBracket ( (lv_stmts_2_0= ruleSlangStmt ) )* ( (lv_r_3_0= ruleSlangRet ) )? otherlv_4= RightCurlyBracket )
            // InternalGumboParser.g:4709:3: () otherlv_1= LeftCurlyBracket ( (lv_stmts_2_0= ruleSlangStmt ) )* ( (lv_r_3_0= ruleSlangRet ) )? otherlv_4= RightCurlyBracket
            {
            // InternalGumboParser.g:4709:3: ()
            // InternalGumboParser.g:4710:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSlangBlockAccess().getSlangBlockAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FollowSets000.FOLLOW_79); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSlangBlockAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalGumboParser.g:4723:3: ( (lv_stmts_2_0= ruleSlangStmt ) )*
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( ((LA98_0>=Assert && LA98_0<=Assume)||LA98_0==Match||LA98_0==While||(LA98_0>=Halt && LA98_0<=Spec)||(LA98_0>=Val && LA98_0<=Var)||(LA98_0>=Do && LA98_0<=If)||LA98_0==RULE_ID) ) {
                    alt98=1;
                }


                switch (alt98) {
            	case 1 :
            	    // InternalGumboParser.g:4724:4: (lv_stmts_2_0= ruleSlangStmt )
            	    {
            	    // InternalGumboParser.g:4724:4: (lv_stmts_2_0= ruleSlangStmt )
            	    // InternalGumboParser.g:4725:5: lv_stmts_2_0= ruleSlangStmt
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSlangBlockAccess().getStmtsSlangStmtParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_79);
            	    lv_stmts_2_0=ruleSlangStmt();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSlangBlockRule());
            	      					}
            	      					add(
            	      						current,
            	      						"stmts",
            	      						lv_stmts_2_0,
            	      						"org.sireum.aadl.gumbo.Gumbo.SlangStmt");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop98;
                }
            } while (true);

            // InternalGumboParser.g:4742:3: ( (lv_r_3_0= ruleSlangRet ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==Return) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalGumboParser.g:4743:4: (lv_r_3_0= ruleSlangRet )
                    {
                    // InternalGumboParser.g:4743:4: (lv_r_3_0= ruleSlangRet )
                    // InternalGumboParser.g:4744:5: lv_r_3_0= ruleSlangRet
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangBlockAccess().getRSlangRetParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_80);
                    lv_r_3_0=ruleSlangRet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSlangBlockRule());
                      					}
                      					set(
                      						current,
                      						"r",
                      						lv_r_3_0,
                      						"org.sireum.aadl.gumbo.Gumbo.SlangRet");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,RightCurlyBracket,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getSlangBlockAccess().getRightCurlyBracketKeyword_4());
              		
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
    // $ANTLR end "ruleSlangBlock"


    // $ANTLR start "entryRuleSlangAccess"
    // InternalGumboParser.g:4769:1: entryRuleSlangAccess returns [EObject current=null] : iv_ruleSlangAccess= ruleSlangAccess EOF ;
    public final EObject entryRuleSlangAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangAccess = null;


        try {
            // InternalGumboParser.g:4769:52: (iv_ruleSlangAccess= ruleSlangAccess EOF )
            // InternalGumboParser.g:4770:2: iv_ruleSlangAccess= ruleSlangAccess EOF
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
    // InternalGumboParser.g:4776:1: ruleSlangAccess returns [EObject current=null] : ( () ( (lv_t_1_0= ruleSlangTerm ) ) ( (lv_suffixes_2_0= ruleSlangAccessSuffix ) )* ) ;
    public final EObject ruleSlangAccess() throws RecognitionException {
        EObject current = null;

        EObject lv_t_1_0 = null;

        EObject lv_suffixes_2_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:4782:2: ( ( () ( (lv_t_1_0= ruleSlangTerm ) ) ( (lv_suffixes_2_0= ruleSlangAccessSuffix ) )* ) )
            // InternalGumboParser.g:4783:2: ( () ( (lv_t_1_0= ruleSlangTerm ) ) ( (lv_suffixes_2_0= ruleSlangAccessSuffix ) )* )
            {
            // InternalGumboParser.g:4783:2: ( () ( (lv_t_1_0= ruleSlangTerm ) ) ( (lv_suffixes_2_0= ruleSlangAccessSuffix ) )* )
            // InternalGumboParser.g:4784:3: () ( (lv_t_1_0= ruleSlangTerm ) ) ( (lv_suffixes_2_0= ruleSlangAccessSuffix ) )*
            {
            // InternalGumboParser.g:4784:3: ()
            // InternalGumboParser.g:4785:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSlangAccessAccess().getSlangAccessAction_0(),
              					current);
              			
            }

            }

            // InternalGumboParser.g:4794:3: ( (lv_t_1_0= ruleSlangTerm ) )
            // InternalGumboParser.g:4795:4: (lv_t_1_0= ruleSlangTerm )
            {
            // InternalGumboParser.g:4795:4: (lv_t_1_0= ruleSlangTerm )
            // InternalGumboParser.g:4796:5: lv_t_1_0= ruleSlangTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangAccessAccess().getTSlangTermParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_54);
            lv_t_1_0=ruleSlangTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSlangAccessRule());
              					}
              					set(
              						current,
              						"t",
              						lv_t_1_0,
              						"org.sireum.aadl.gumbo.Gumbo.SlangTerm");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumboParser.g:4813:3: ( (lv_suffixes_2_0= ruleSlangAccessSuffix ) )*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==FullStop) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // InternalGumboParser.g:4814:4: (lv_suffixes_2_0= ruleSlangAccessSuffix )
            	    {
            	    // InternalGumboParser.g:4814:4: (lv_suffixes_2_0= ruleSlangAccessSuffix )
            	    // InternalGumboParser.g:4815:5: lv_suffixes_2_0= ruleSlangAccessSuffix
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSlangAccessAccess().getSuffixesSlangAccessSuffixParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_54);
            	    lv_suffixes_2_0=ruleSlangAccessSuffix();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSlangAccessRule());
            	      					}
            	      					add(
            	      						current,
            	      						"suffixes",
            	      						lv_suffixes_2_0,
            	      						"org.sireum.aadl.gumbo.Gumbo.SlangAccessSuffix");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop100;
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


    // $ANTLR start "entryRuleSlangAccessSuffix"
    // InternalGumboParser.g:4836:1: entryRuleSlangAccessSuffix returns [EObject current=null] : iv_ruleSlangAccessSuffix= ruleSlangAccessSuffix EOF ;
    public final EObject entryRuleSlangAccessSuffix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangAccessSuffix = null;


        try {
            // InternalGumboParser.g:4836:58: (iv_ruleSlangAccessSuffix= ruleSlangAccessSuffix EOF )
            // InternalGumboParser.g:4837:2: iv_ruleSlangAccessSuffix= ruleSlangAccessSuffix EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlangAccessSuffixRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlangAccessSuffix=ruleSlangAccessSuffix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlangAccessSuffix; 
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
    // $ANTLR end "entryRuleSlangAccessSuffix"


    // $ANTLR start "ruleSlangAccessSuffix"
    // InternalGumboParser.g:4843:1: ruleSlangAccessSuffix returns [EObject current=null] : ( () otherlv_1= FullStop ( (lv_id_2_0= RULE_ID ) ) ( (lv_cs_3_0= ruleSlangCallSuffix ) )? ) ;
    public final EObject ruleSlangAccessSuffix() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_id_2_0=null;
        EObject lv_cs_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:4849:2: ( ( () otherlv_1= FullStop ( (lv_id_2_0= RULE_ID ) ) ( (lv_cs_3_0= ruleSlangCallSuffix ) )? ) )
            // InternalGumboParser.g:4850:2: ( () otherlv_1= FullStop ( (lv_id_2_0= RULE_ID ) ) ( (lv_cs_3_0= ruleSlangCallSuffix ) )? )
            {
            // InternalGumboParser.g:4850:2: ( () otherlv_1= FullStop ( (lv_id_2_0= RULE_ID ) ) ( (lv_cs_3_0= ruleSlangCallSuffix ) )? )
            // InternalGumboParser.g:4851:3: () otherlv_1= FullStop ( (lv_id_2_0= RULE_ID ) ) ( (lv_cs_3_0= ruleSlangCallSuffix ) )?
            {
            // InternalGumboParser.g:4851:3: ()
            // InternalGumboParser.g:4852:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSlangAccessSuffixAccess().getSlangAccessSuffixAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,FullStop,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSlangAccessSuffixAccess().getFullStopKeyword_1());
              		
            }
            // InternalGumboParser.g:4865:3: ( (lv_id_2_0= RULE_ID ) )
            // InternalGumboParser.g:4866:4: (lv_id_2_0= RULE_ID )
            {
            // InternalGumboParser.g:4866:4: (lv_id_2_0= RULE_ID )
            // InternalGumboParser.g:4867:5: lv_id_2_0= RULE_ID
            {
            lv_id_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_81); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_id_2_0, grammarAccess.getSlangAccessSuffixAccess().getIdIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSlangAccessSuffixRule());
              					}
              					setWithLastConsumed(
              						current,
              						"id",
              						lv_id_2_0,
              						"org.osate.xtext.aadl2.properties.Properties.ID");
              				
            }

            }


            }

            // InternalGumboParser.g:4883:3: ( (lv_cs_3_0= ruleSlangCallSuffix ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==LeftParenthesis||LA101_0==LeftSquareBracket) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalGumboParser.g:4884:4: (lv_cs_3_0= ruleSlangCallSuffix )
                    {
                    // InternalGumboParser.g:4884:4: (lv_cs_3_0= ruleSlangCallSuffix )
                    // InternalGumboParser.g:4885:5: lv_cs_3_0= ruleSlangCallSuffix
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangAccessSuffixAccess().getCsSlangCallSuffixParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_cs_3_0=ruleSlangCallSuffix();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSlangAccessSuffixRule());
                      					}
                      					set(
                      						current,
                      						"cs",
                      						lv_cs_3_0,
                      						"org.sireum.aadl.gumbo.Gumbo.SlangCallSuffix");
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
    // $ANTLR end "ruleSlangAccessSuffix"


    // $ANTLR start "entryRuleSlangTerm"
    // InternalGumboParser.g:4906:1: entryRuleSlangTerm returns [EObject current=null] : iv_ruleSlangTerm= ruleSlangTerm EOF ;
    public final EObject entryRuleSlangTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangTerm = null;


        try {
            // InternalGumboParser.g:4906:50: (iv_ruleSlangTerm= ruleSlangTerm EOF )
            // InternalGumboParser.g:4907:2: iv_ruleSlangTerm= ruleSlangTerm EOF
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
    // InternalGumboParser.g:4913:1: ruleSlangTerm returns [EObject current=null] : ( ( () ( (lv_lit_1_0= ruleSlangLit ) ) ) | ( () ( (lv_i_3_0= ruleSlangInterp ) ) ) | ( ( ( ( () In_1 LeftParenthesis ) )=> ( () otherlv_5= In_1 otherlv_6= LeftParenthesis ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= RightParenthesis ) | ( ( ( ( () MaySend LeftParenthesis ) )=> ( () otherlv_10= MaySend otherlv_11= LeftParenthesis ) ) ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (lv_value_14_0= ruleExpr ) ) )? otherlv_15= RightParenthesis ) | ( ( ( ( () MustSend LeftParenthesis ) )=> ( () otherlv_17= MustSend otherlv_18= LeftParenthesis ) ) ( (otherlv_19= RULE_ID ) ) (otherlv_20= Comma ( (lv_value_21_0= ruleExpr ) ) )? otherlv_22= RightParenthesis ) | ( ( ( ( () NoSend LeftParenthesis ) )=> ( () otherlv_24= NoSend otherlv_25= LeftParenthesis ) ) ( (otherlv_26= RULE_ID ) ) otherlv_27= RightParenthesis ) | ( ( ( () ( ( ruleQCREF ) ) ( ( ruleSlangCallSuffix ) ) ) )=> ( () ( ( ruleQCREF ) ) ( (lv_callSuffix_30_0= ruleSlangCallSuffix ) ) ) ) | ( ( ( ( () ( ( ruleQCLREF ) ) FullStop ) )=> ( () ( ( ruleQCLREF ) ) otherlv_33= FullStop ) ) ( (otherlv_34= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_36_0= ruleDataElement ) ) otherlv_37= LeftCurlyBracket ( (otherlv_38= RULE_ID ) ) otherlv_39= EqualsSign ) ) ( (lv_argExpr_40_0= ruleExpr ) ) (otherlv_41= Semicolon ( (otherlv_42= RULE_ID ) ) otherlv_43= EqualsSign ( (lv_argExpr_44_0= ruleExpr ) ) )* otherlv_45= RightCurlyBracket ) | ( () ( (otherlv_47= RULE_ID ) ) (otherlv_48= FullStop ( (lv_ref_49_0= ruleOtherDataRef ) ) )? ) | ( () otherlv_51= LeftParenthesis ( (lv_e_52_0= ruleExpr ) ) (otherlv_53= Comma ( (lv_e_54_0= ruleExpr ) ) )* otherlv_55= RightParenthesis ) | ( () otherlv_57= For ( (lv_r_58_0= ruleSlangForRange ) ) (otherlv_59= Comma ( (lv_r_60_0= ruleSlangForRange ) ) )* otherlv_61= Yield ( ( (lv_b_62_0= ruleSlangBlock ) ) | (otherlv_63= LeftParenthesis ( (lv_e_64_0= ruleExpr ) ) otherlv_65= RightParenthesis ) ) ) | ( () otherlv_67= LeftCurlyBracket ( ( ( ( (lv_p_68_0= ruleSlangParams ) ) otherlv_69= EqualsSignGreaterThanSign )? ( (lv_e_70_0= ruleExpr ) ) otherlv_71= RightCurlyBracket ) | ( ( (lv_stmt_72_0= ruleSlangStmt ) )* ( (lv_r_73_0= ruleSlangRet ) )? otherlv_74= RightCurlyBracket ) ) ) ) ;
    public final EObject ruleSlangTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_47=null;
        Token otherlv_48=null;
        Token otherlv_51=null;
        Token otherlv_53=null;
        Token otherlv_55=null;
        Token otherlv_57=null;
        Token otherlv_59=null;
        Token otherlv_61=null;
        Token otherlv_63=null;
        Token otherlv_65=null;
        Token otherlv_67=null;
        Token otherlv_69=null;
        Token otherlv_71=null;
        Token otherlv_74=null;
        EObject lv_lit_1_0 = null;

        EObject lv_i_3_0 = null;

        EObject lv_value_14_0 = null;

        EObject lv_value_21_0 = null;

        EObject lv_callSuffix_30_0 = null;

        EObject lv_recordType_36_0 = null;

        EObject lv_argExpr_40_0 = null;

        EObject lv_argExpr_44_0 = null;

        EObject lv_ref_49_0 = null;

        EObject lv_e_52_0 = null;

        EObject lv_e_54_0 = null;

        EObject lv_r_58_0 = null;

        EObject lv_r_60_0 = null;

        EObject lv_b_62_0 = null;

        EObject lv_e_64_0 = null;

        EObject lv_p_68_0 = null;

        EObject lv_e_70_0 = null;

        EObject lv_stmt_72_0 = null;

        EObject lv_r_73_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:4919:2: ( ( ( () ( (lv_lit_1_0= ruleSlangLit ) ) ) | ( () ( (lv_i_3_0= ruleSlangInterp ) ) ) | ( ( ( ( () In_1 LeftParenthesis ) )=> ( () otherlv_5= In_1 otherlv_6= LeftParenthesis ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= RightParenthesis ) | ( ( ( ( () MaySend LeftParenthesis ) )=> ( () otherlv_10= MaySend otherlv_11= LeftParenthesis ) ) ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (lv_value_14_0= ruleExpr ) ) )? otherlv_15= RightParenthesis ) | ( ( ( ( () MustSend LeftParenthesis ) )=> ( () otherlv_17= MustSend otherlv_18= LeftParenthesis ) ) ( (otherlv_19= RULE_ID ) ) (otherlv_20= Comma ( (lv_value_21_0= ruleExpr ) ) )? otherlv_22= RightParenthesis ) | ( ( ( ( () NoSend LeftParenthesis ) )=> ( () otherlv_24= NoSend otherlv_25= LeftParenthesis ) ) ( (otherlv_26= RULE_ID ) ) otherlv_27= RightParenthesis ) | ( ( ( () ( ( ruleQCREF ) ) ( ( ruleSlangCallSuffix ) ) ) )=> ( () ( ( ruleQCREF ) ) ( (lv_callSuffix_30_0= ruleSlangCallSuffix ) ) ) ) | ( ( ( ( () ( ( ruleQCLREF ) ) FullStop ) )=> ( () ( ( ruleQCLREF ) ) otherlv_33= FullStop ) ) ( (otherlv_34= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_36_0= ruleDataElement ) ) otherlv_37= LeftCurlyBracket ( (otherlv_38= RULE_ID ) ) otherlv_39= EqualsSign ) ) ( (lv_argExpr_40_0= ruleExpr ) ) (otherlv_41= Semicolon ( (otherlv_42= RULE_ID ) ) otherlv_43= EqualsSign ( (lv_argExpr_44_0= ruleExpr ) ) )* otherlv_45= RightCurlyBracket ) | ( () ( (otherlv_47= RULE_ID ) ) (otherlv_48= FullStop ( (lv_ref_49_0= ruleOtherDataRef ) ) )? ) | ( () otherlv_51= LeftParenthesis ( (lv_e_52_0= ruleExpr ) ) (otherlv_53= Comma ( (lv_e_54_0= ruleExpr ) ) )* otherlv_55= RightParenthesis ) | ( () otherlv_57= For ( (lv_r_58_0= ruleSlangForRange ) ) (otherlv_59= Comma ( (lv_r_60_0= ruleSlangForRange ) ) )* otherlv_61= Yield ( ( (lv_b_62_0= ruleSlangBlock ) ) | (otherlv_63= LeftParenthesis ( (lv_e_64_0= ruleExpr ) ) otherlv_65= RightParenthesis ) ) ) | ( () otherlv_67= LeftCurlyBracket ( ( ( ( (lv_p_68_0= ruleSlangParams ) ) otherlv_69= EqualsSignGreaterThanSign )? ( (lv_e_70_0= ruleExpr ) ) otherlv_71= RightCurlyBracket ) | ( ( (lv_stmt_72_0= ruleSlangStmt ) )* ( (lv_r_73_0= ruleSlangRet ) )? otherlv_74= RightCurlyBracket ) ) ) ) )
            // InternalGumboParser.g:4920:2: ( ( () ( (lv_lit_1_0= ruleSlangLit ) ) ) | ( () ( (lv_i_3_0= ruleSlangInterp ) ) ) | ( ( ( ( () In_1 LeftParenthesis ) )=> ( () otherlv_5= In_1 otherlv_6= LeftParenthesis ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= RightParenthesis ) | ( ( ( ( () MaySend LeftParenthesis ) )=> ( () otherlv_10= MaySend otherlv_11= LeftParenthesis ) ) ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (lv_value_14_0= ruleExpr ) ) )? otherlv_15= RightParenthesis ) | ( ( ( ( () MustSend LeftParenthesis ) )=> ( () otherlv_17= MustSend otherlv_18= LeftParenthesis ) ) ( (otherlv_19= RULE_ID ) ) (otherlv_20= Comma ( (lv_value_21_0= ruleExpr ) ) )? otherlv_22= RightParenthesis ) | ( ( ( ( () NoSend LeftParenthesis ) )=> ( () otherlv_24= NoSend otherlv_25= LeftParenthesis ) ) ( (otherlv_26= RULE_ID ) ) otherlv_27= RightParenthesis ) | ( ( ( () ( ( ruleQCREF ) ) ( ( ruleSlangCallSuffix ) ) ) )=> ( () ( ( ruleQCREF ) ) ( (lv_callSuffix_30_0= ruleSlangCallSuffix ) ) ) ) | ( ( ( ( () ( ( ruleQCLREF ) ) FullStop ) )=> ( () ( ( ruleQCLREF ) ) otherlv_33= FullStop ) ) ( (otherlv_34= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_36_0= ruleDataElement ) ) otherlv_37= LeftCurlyBracket ( (otherlv_38= RULE_ID ) ) otherlv_39= EqualsSign ) ) ( (lv_argExpr_40_0= ruleExpr ) ) (otherlv_41= Semicolon ( (otherlv_42= RULE_ID ) ) otherlv_43= EqualsSign ( (lv_argExpr_44_0= ruleExpr ) ) )* otherlv_45= RightCurlyBracket ) | ( () ( (otherlv_47= RULE_ID ) ) (otherlv_48= FullStop ( (lv_ref_49_0= ruleOtherDataRef ) ) )? ) | ( () otherlv_51= LeftParenthesis ( (lv_e_52_0= ruleExpr ) ) (otherlv_53= Comma ( (lv_e_54_0= ruleExpr ) ) )* otherlv_55= RightParenthesis ) | ( () otherlv_57= For ( (lv_r_58_0= ruleSlangForRange ) ) (otherlv_59= Comma ( (lv_r_60_0= ruleSlangForRange ) ) )* otherlv_61= Yield ( ( (lv_b_62_0= ruleSlangBlock ) ) | (otherlv_63= LeftParenthesis ( (lv_e_64_0= ruleExpr ) ) otherlv_65= RightParenthesis ) ) ) | ( () otherlv_67= LeftCurlyBracket ( ( ( ( (lv_p_68_0= ruleSlangParams ) ) otherlv_69= EqualsSignGreaterThanSign )? ( (lv_e_70_0= ruleExpr ) ) otherlv_71= RightCurlyBracket ) | ( ( (lv_stmt_72_0= ruleSlangStmt ) )* ( (lv_r_73_0= ruleSlangRet ) )? otherlv_74= RightCurlyBracket ) ) ) )
            {
            // InternalGumboParser.g:4920:2: ( ( () ( (lv_lit_1_0= ruleSlangLit ) ) ) | ( () ( (lv_i_3_0= ruleSlangInterp ) ) ) | ( ( ( ( () In_1 LeftParenthesis ) )=> ( () otherlv_5= In_1 otherlv_6= LeftParenthesis ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= RightParenthesis ) | ( ( ( ( () MaySend LeftParenthesis ) )=> ( () otherlv_10= MaySend otherlv_11= LeftParenthesis ) ) ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (lv_value_14_0= ruleExpr ) ) )? otherlv_15= RightParenthesis ) | ( ( ( ( () MustSend LeftParenthesis ) )=> ( () otherlv_17= MustSend otherlv_18= LeftParenthesis ) ) ( (otherlv_19= RULE_ID ) ) (otherlv_20= Comma ( (lv_value_21_0= ruleExpr ) ) )? otherlv_22= RightParenthesis ) | ( ( ( ( () NoSend LeftParenthesis ) )=> ( () otherlv_24= NoSend otherlv_25= LeftParenthesis ) ) ( (otherlv_26= RULE_ID ) ) otherlv_27= RightParenthesis ) | ( ( ( () ( ( ruleQCREF ) ) ( ( ruleSlangCallSuffix ) ) ) )=> ( () ( ( ruleQCREF ) ) ( (lv_callSuffix_30_0= ruleSlangCallSuffix ) ) ) ) | ( ( ( ( () ( ( ruleQCLREF ) ) FullStop ) )=> ( () ( ( ruleQCLREF ) ) otherlv_33= FullStop ) ) ( (otherlv_34= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_36_0= ruleDataElement ) ) otherlv_37= LeftCurlyBracket ( (otherlv_38= RULE_ID ) ) otherlv_39= EqualsSign ) ) ( (lv_argExpr_40_0= ruleExpr ) ) (otherlv_41= Semicolon ( (otherlv_42= RULE_ID ) ) otherlv_43= EqualsSign ( (lv_argExpr_44_0= ruleExpr ) ) )* otherlv_45= RightCurlyBracket ) | ( () ( (otherlv_47= RULE_ID ) ) (otherlv_48= FullStop ( (lv_ref_49_0= ruleOtherDataRef ) ) )? ) | ( () otherlv_51= LeftParenthesis ( (lv_e_52_0= ruleExpr ) ) (otherlv_53= Comma ( (lv_e_54_0= ruleExpr ) ) )* otherlv_55= RightParenthesis ) | ( () otherlv_57= For ( (lv_r_58_0= ruleSlangForRange ) ) (otherlv_59= Comma ( (lv_r_60_0= ruleSlangForRange ) ) )* otherlv_61= Yield ( ( (lv_b_62_0= ruleSlangBlock ) ) | (otherlv_63= LeftParenthesis ( (lv_e_64_0= ruleExpr ) ) otherlv_65= RightParenthesis ) ) ) | ( () otherlv_67= LeftCurlyBracket ( ( ( ( (lv_p_68_0= ruleSlangParams ) ) otherlv_69= EqualsSignGreaterThanSign )? ( (lv_e_70_0= ruleExpr ) ) otherlv_71= RightCurlyBracket ) | ( ( (lv_stmt_72_0= ruleSlangStmt ) )* ( (lv_r_73_0= ruleSlangRet ) )? otherlv_74= RightCurlyBracket ) ) ) )
            int alt113=13;
            alt113 = dfa113.predict(input);
            switch (alt113) {
                case 1 :
                    // InternalGumboParser.g:4921:3: ( () ( (lv_lit_1_0= ruleSlangLit ) ) )
                    {
                    // InternalGumboParser.g:4921:3: ( () ( (lv_lit_1_0= ruleSlangLit ) ) )
                    // InternalGumboParser.g:4922:4: () ( (lv_lit_1_0= ruleSlangLit ) )
                    {
                    // InternalGumboParser.g:4922:4: ()
                    // InternalGumboParser.g:4923:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangTermAccess().getSlangLitTermAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:4932:4: ( (lv_lit_1_0= ruleSlangLit ) )
                    // InternalGumboParser.g:4933:5: (lv_lit_1_0= ruleSlangLit )
                    {
                    // InternalGumboParser.g:4933:5: (lv_lit_1_0= ruleSlangLit )
                    // InternalGumboParser.g:4934:6: lv_lit_1_0= ruleSlangLit
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangTermAccess().getLitSlangLitParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_lit_1_0=ruleSlangLit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlangTermRule());
                      						}
                      						set(
                      							current,
                      							"lit",
                      							lv_lit_1_0,
                      							"org.sireum.aadl.gumbo.Gumbo.SlangLit");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:4953:3: ( () ( (lv_i_3_0= ruleSlangInterp ) ) )
                    {
                    // InternalGumboParser.g:4953:3: ( () ( (lv_i_3_0= ruleSlangInterp ) ) )
                    // InternalGumboParser.g:4954:4: () ( (lv_i_3_0= ruleSlangInterp ) )
                    {
                    // InternalGumboParser.g:4954:4: ()
                    // InternalGumboParser.g:4955:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangTermAccess().getSlangInterpTermAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:4964:4: ( (lv_i_3_0= ruleSlangInterp ) )
                    // InternalGumboParser.g:4965:5: (lv_i_3_0= ruleSlangInterp )
                    {
                    // InternalGumboParser.g:4965:5: (lv_i_3_0= ruleSlangInterp )
                    // InternalGumboParser.g:4966:6: lv_i_3_0= ruleSlangInterp
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangTermAccess().getISlangInterpParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_i_3_0=ruleSlangInterp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlangTermRule());
                      						}
                      						set(
                      							current,
                      							"i",
                      							lv_i_3_0,
                      							"org.sireum.aadl.gumbo.Gumbo.SlangInterp");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGumboParser.g:4985:3: ( ( ( ( () In_1 LeftParenthesis ) )=> ( () otherlv_5= In_1 otherlv_6= LeftParenthesis ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= RightParenthesis )
                    {
                    // InternalGumboParser.g:4985:3: ( ( ( ( () In_1 LeftParenthesis ) )=> ( () otherlv_5= In_1 otherlv_6= LeftParenthesis ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= RightParenthesis )
                    // InternalGumboParser.g:4986:4: ( ( ( () In_1 LeftParenthesis ) )=> ( () otherlv_5= In_1 otherlv_6= LeftParenthesis ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= RightParenthesis
                    {
                    // InternalGumboParser.g:4986:4: ( ( ( () In_1 LeftParenthesis ) )=> ( () otherlv_5= In_1 otherlv_6= LeftParenthesis ) )
                    // InternalGumboParser.g:4987:5: ( ( () In_1 LeftParenthesis ) )=> ( () otherlv_5= In_1 otherlv_6= LeftParenthesis )
                    {
                    // InternalGumboParser.g:4994:5: ( () otherlv_5= In_1 otherlv_6= LeftParenthesis )
                    // InternalGumboParser.g:4995:6: () otherlv_5= In_1 otherlv_6= LeftParenthesis
                    {
                    // InternalGumboParser.g:4995:6: ()
                    // InternalGumboParser.g:4996:7: 
                    {
                    if ( state.backtracking==0 ) {

                      							/* */
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							current = forceCreateModelElement(
                      								grammarAccess.getSlangTermAccess().getInStateExprAction_2_0_0_0(),
                      								current);
                      						
                    }

                    }

                    otherlv_5=(Token)match(input,In_1,FollowSets000.FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_5, grammarAccess.getSlangTermAccess().getInKeyword_2_0_0_1());
                      					
                    }
                    otherlv_6=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_6, grammarAccess.getSlangTermAccess().getLeftParenthesisKeyword_2_0_0_2());
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:5015:4: ( (otherlv_7= RULE_ID ) )
                    // InternalGumboParser.g:5016:5: (otherlv_7= RULE_ID )
                    {
                    // InternalGumboParser.g:5016:5: (otherlv_7= RULE_ID )
                    // InternalGumboParser.g:5017:6: otherlv_7= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSlangTermRule());
                      						}
                      					
                    }
                    otherlv_7=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_7, grammarAccess.getSlangTermAccess().getStateVarStateVarDeclCrossReference_2_1_0());
                      					
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getSlangTermAccess().getRightParenthesisKeyword_2_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalGumboParser.g:5037:3: ( ( ( ( () MaySend LeftParenthesis ) )=> ( () otherlv_10= MaySend otherlv_11= LeftParenthesis ) ) ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (lv_value_14_0= ruleExpr ) ) )? otherlv_15= RightParenthesis )
                    {
                    // InternalGumboParser.g:5037:3: ( ( ( ( () MaySend LeftParenthesis ) )=> ( () otherlv_10= MaySend otherlv_11= LeftParenthesis ) ) ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (lv_value_14_0= ruleExpr ) ) )? otherlv_15= RightParenthesis )
                    // InternalGumboParser.g:5038:4: ( ( ( () MaySend LeftParenthesis ) )=> ( () otherlv_10= MaySend otherlv_11= LeftParenthesis ) ) ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (lv_value_14_0= ruleExpr ) ) )? otherlv_15= RightParenthesis
                    {
                    // InternalGumboParser.g:5038:4: ( ( ( () MaySend LeftParenthesis ) )=> ( () otherlv_10= MaySend otherlv_11= LeftParenthesis ) )
                    // InternalGumboParser.g:5039:5: ( ( () MaySend LeftParenthesis ) )=> ( () otherlv_10= MaySend otherlv_11= LeftParenthesis )
                    {
                    // InternalGumboParser.g:5046:5: ( () otherlv_10= MaySend otherlv_11= LeftParenthesis )
                    // InternalGumboParser.g:5047:6: () otherlv_10= MaySend otherlv_11= LeftParenthesis
                    {
                    // InternalGumboParser.g:5047:6: ()
                    // InternalGumboParser.g:5048:7: 
                    {
                    if ( state.backtracking==0 ) {

                      							/* */
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							current = forceCreateModelElement(
                      								grammarAccess.getSlangTermAccess().getMaySendExprAction_3_0_0_0(),
                      								current);
                      						
                    }

                    }

                    otherlv_10=(Token)match(input,MaySend,FollowSets000.FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_10, grammarAccess.getSlangTermAccess().getMaySendKeyword_3_0_0_1());
                      					
                    }
                    otherlv_11=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_11, grammarAccess.getSlangTermAccess().getLeftParenthesisKeyword_3_0_0_2());
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:5067:4: ( (otherlv_12= RULE_ID ) )
                    // InternalGumboParser.g:5068:5: (otherlv_12= RULE_ID )
                    {
                    // InternalGumboParser.g:5068:5: (otherlv_12= RULE_ID )
                    // InternalGumboParser.g:5069:6: otherlv_12= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSlangTermRule());
                      						}
                      					
                    }
                    otherlv_12=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_12, grammarAccess.getSlangTermAccess().getEventPortPortCrossReference_3_1_0());
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:5083:4: (otherlv_13= Comma ( (lv_value_14_0= ruleExpr ) ) )?
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==Comma) ) {
                        alt102=1;
                    }
                    switch (alt102) {
                        case 1 :
                            // InternalGumboParser.g:5084:5: otherlv_13= Comma ( (lv_value_14_0= ruleExpr ) )
                            {
                            otherlv_13=(Token)match(input,Comma,FollowSets000.FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_13, grammarAccess.getSlangTermAccess().getCommaKeyword_3_2_0());
                              				
                            }
                            // InternalGumboParser.g:5088:5: ( (lv_value_14_0= ruleExpr ) )
                            // InternalGumboParser.g:5089:6: (lv_value_14_0= ruleExpr )
                            {
                            // InternalGumboParser.g:5089:6: (lv_value_14_0= ruleExpr )
                            // InternalGumboParser.g:5090:7: lv_value_14_0= ruleExpr
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSlangTermAccess().getValueExprParserRuleCall_3_2_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_39);
                            lv_value_14_0=ruleExpr();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getSlangTermRule());
                              							}
                              							set(
                              								current,
                              								"value",
                              								lv_value_14_0,
                              								"org.sireum.aadl.gumbo.Gumbo.Expr");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getSlangTermAccess().getRightParenthesisKeyword_3_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalGumboParser.g:5114:3: ( ( ( ( () MustSend LeftParenthesis ) )=> ( () otherlv_17= MustSend otherlv_18= LeftParenthesis ) ) ( (otherlv_19= RULE_ID ) ) (otherlv_20= Comma ( (lv_value_21_0= ruleExpr ) ) )? otherlv_22= RightParenthesis )
                    {
                    // InternalGumboParser.g:5114:3: ( ( ( ( () MustSend LeftParenthesis ) )=> ( () otherlv_17= MustSend otherlv_18= LeftParenthesis ) ) ( (otherlv_19= RULE_ID ) ) (otherlv_20= Comma ( (lv_value_21_0= ruleExpr ) ) )? otherlv_22= RightParenthesis )
                    // InternalGumboParser.g:5115:4: ( ( ( () MustSend LeftParenthesis ) )=> ( () otherlv_17= MustSend otherlv_18= LeftParenthesis ) ) ( (otherlv_19= RULE_ID ) ) (otherlv_20= Comma ( (lv_value_21_0= ruleExpr ) ) )? otherlv_22= RightParenthesis
                    {
                    // InternalGumboParser.g:5115:4: ( ( ( () MustSend LeftParenthesis ) )=> ( () otherlv_17= MustSend otherlv_18= LeftParenthesis ) )
                    // InternalGumboParser.g:5116:5: ( ( () MustSend LeftParenthesis ) )=> ( () otherlv_17= MustSend otherlv_18= LeftParenthesis )
                    {
                    // InternalGumboParser.g:5123:5: ( () otherlv_17= MustSend otherlv_18= LeftParenthesis )
                    // InternalGumboParser.g:5124:6: () otherlv_17= MustSend otherlv_18= LeftParenthesis
                    {
                    // InternalGumboParser.g:5124:6: ()
                    // InternalGumboParser.g:5125:7: 
                    {
                    if ( state.backtracking==0 ) {

                      							/* */
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							current = forceCreateModelElement(
                      								grammarAccess.getSlangTermAccess().getMustSendExprAction_4_0_0_0(),
                      								current);
                      						
                    }

                    }

                    otherlv_17=(Token)match(input,MustSend,FollowSets000.FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_17, grammarAccess.getSlangTermAccess().getMustSendKeyword_4_0_0_1());
                      					
                    }
                    otherlv_18=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_18, grammarAccess.getSlangTermAccess().getLeftParenthesisKeyword_4_0_0_2());
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:5144:4: ( (otherlv_19= RULE_ID ) )
                    // InternalGumboParser.g:5145:5: (otherlv_19= RULE_ID )
                    {
                    // InternalGumboParser.g:5145:5: (otherlv_19= RULE_ID )
                    // InternalGumboParser.g:5146:6: otherlv_19= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSlangTermRule());
                      						}
                      					
                    }
                    otherlv_19=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_19, grammarAccess.getSlangTermAccess().getEventPortPortCrossReference_4_1_0());
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:5160:4: (otherlv_20= Comma ( (lv_value_21_0= ruleExpr ) ) )?
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==Comma) ) {
                        alt103=1;
                    }
                    switch (alt103) {
                        case 1 :
                            // InternalGumboParser.g:5161:5: otherlv_20= Comma ( (lv_value_21_0= ruleExpr ) )
                            {
                            otherlv_20=(Token)match(input,Comma,FollowSets000.FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_20, grammarAccess.getSlangTermAccess().getCommaKeyword_4_2_0());
                              				
                            }
                            // InternalGumboParser.g:5165:5: ( (lv_value_21_0= ruleExpr ) )
                            // InternalGumboParser.g:5166:6: (lv_value_21_0= ruleExpr )
                            {
                            // InternalGumboParser.g:5166:6: (lv_value_21_0= ruleExpr )
                            // InternalGumboParser.g:5167:7: lv_value_21_0= ruleExpr
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSlangTermAccess().getValueExprParserRuleCall_4_2_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_39);
                            lv_value_21_0=ruleExpr();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getSlangTermRule());
                              							}
                              							set(
                              								current,
                              								"value",
                              								lv_value_21_0,
                              								"org.sireum.aadl.gumbo.Gumbo.Expr");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_22=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_22, grammarAccess.getSlangTermAccess().getRightParenthesisKeyword_4_3());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalGumboParser.g:5191:3: ( ( ( ( () NoSend LeftParenthesis ) )=> ( () otherlv_24= NoSend otherlv_25= LeftParenthesis ) ) ( (otherlv_26= RULE_ID ) ) otherlv_27= RightParenthesis )
                    {
                    // InternalGumboParser.g:5191:3: ( ( ( ( () NoSend LeftParenthesis ) )=> ( () otherlv_24= NoSend otherlv_25= LeftParenthesis ) ) ( (otherlv_26= RULE_ID ) ) otherlv_27= RightParenthesis )
                    // InternalGumboParser.g:5192:4: ( ( ( () NoSend LeftParenthesis ) )=> ( () otherlv_24= NoSend otherlv_25= LeftParenthesis ) ) ( (otherlv_26= RULE_ID ) ) otherlv_27= RightParenthesis
                    {
                    // InternalGumboParser.g:5192:4: ( ( ( () NoSend LeftParenthesis ) )=> ( () otherlv_24= NoSend otherlv_25= LeftParenthesis ) )
                    // InternalGumboParser.g:5193:5: ( ( () NoSend LeftParenthesis ) )=> ( () otherlv_24= NoSend otherlv_25= LeftParenthesis )
                    {
                    // InternalGumboParser.g:5200:5: ( () otherlv_24= NoSend otherlv_25= LeftParenthesis )
                    // InternalGumboParser.g:5201:6: () otherlv_24= NoSend otherlv_25= LeftParenthesis
                    {
                    // InternalGumboParser.g:5201:6: ()
                    // InternalGumboParser.g:5202:7: 
                    {
                    if ( state.backtracking==0 ) {

                      							/* */
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							current = forceCreateModelElement(
                      								grammarAccess.getSlangTermAccess().getNoSendExprAction_5_0_0_0(),
                      								current);
                      						
                    }

                    }

                    otherlv_24=(Token)match(input,NoSend,FollowSets000.FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_24, grammarAccess.getSlangTermAccess().getNoSendKeyword_5_0_0_1());
                      					
                    }
                    otherlv_25=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_25, grammarAccess.getSlangTermAccess().getLeftParenthesisKeyword_5_0_0_2());
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:5221:4: ( (otherlv_26= RULE_ID ) )
                    // InternalGumboParser.g:5222:5: (otherlv_26= RULE_ID )
                    {
                    // InternalGumboParser.g:5222:5: (otherlv_26= RULE_ID )
                    // InternalGumboParser.g:5223:6: otherlv_26= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSlangTermRule());
                      						}
                      					
                    }
                    otherlv_26=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_26, grammarAccess.getSlangTermAccess().getEventPortPortCrossReference_5_1_0());
                      					
                    }

                    }


                    }

                    otherlv_27=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_27, grammarAccess.getSlangTermAccess().getRightParenthesisKeyword_5_2());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalGumboParser.g:5243:3: ( ( ( () ( ( ruleQCREF ) ) ( ( ruleSlangCallSuffix ) ) ) )=> ( () ( ( ruleQCREF ) ) ( (lv_callSuffix_30_0= ruleSlangCallSuffix ) ) ) )
                    {
                    // InternalGumboParser.g:5243:3: ( ( ( () ( ( ruleQCREF ) ) ( ( ruleSlangCallSuffix ) ) ) )=> ( () ( ( ruleQCREF ) ) ( (lv_callSuffix_30_0= ruleSlangCallSuffix ) ) ) )
                    // InternalGumboParser.g:5244:4: ( ( () ( ( ruleQCREF ) ) ( ( ruleSlangCallSuffix ) ) ) )=> ( () ( ( ruleQCREF ) ) ( (lv_callSuffix_30_0= ruleSlangCallSuffix ) ) )
                    {
                    // InternalGumboParser.g:5259:4: ( () ( ( ruleQCREF ) ) ( (lv_callSuffix_30_0= ruleSlangCallSuffix ) ) )
                    // InternalGumboParser.g:5260:5: () ( ( ruleQCREF ) ) ( (lv_callSuffix_30_0= ruleSlangCallSuffix ) )
                    {
                    // InternalGumboParser.g:5260:5: ()
                    // InternalGumboParser.g:5261:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElement(
                      							grammarAccess.getSlangTermAccess().getCallExprAction_6_0_0(),
                      							current);
                      					
                    }

                    }

                    // InternalGumboParser.g:5270:5: ( ( ruleQCREF ) )
                    // InternalGumboParser.g:5271:6: ( ruleQCREF )
                    {
                    // InternalGumboParser.g:5271:6: ( ruleQCREF )
                    // InternalGumboParser.g:5272:7: ruleQCREF
                    {
                    if ( state.backtracking==0 ) {

                      							/* */
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getSlangTermRule());
                      							}
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSlangTermAccess().getIdEObjectCrossReference_6_0_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_35);
                    ruleQCREF();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalGumboParser.g:5289:5: ( (lv_callSuffix_30_0= ruleSlangCallSuffix ) )
                    // InternalGumboParser.g:5290:6: (lv_callSuffix_30_0= ruleSlangCallSuffix )
                    {
                    // InternalGumboParser.g:5290:6: (lv_callSuffix_30_0= ruleSlangCallSuffix )
                    // InternalGumboParser.g:5291:7: lv_callSuffix_30_0= ruleSlangCallSuffix
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSlangTermAccess().getCallSuffixSlangCallSuffixParserRuleCall_6_0_2_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_callSuffix_30_0=ruleSlangCallSuffix();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSlangTermRule());
                      							}
                      							set(
                      								current,
                      								"callSuffix",
                      								lv_callSuffix_30_0,
                      								"org.sireum.aadl.gumbo.Gumbo.SlangCallSuffix");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalGumboParser.g:5311:3: ( ( ( ( () ( ( ruleQCLREF ) ) FullStop ) )=> ( () ( ( ruleQCLREF ) ) otherlv_33= FullStop ) ) ( (otherlv_34= RULE_ID ) ) )
                    {
                    // InternalGumboParser.g:5311:3: ( ( ( ( () ( ( ruleQCLREF ) ) FullStop ) )=> ( () ( ( ruleQCLREF ) ) otherlv_33= FullStop ) ) ( (otherlv_34= RULE_ID ) ) )
                    // InternalGumboParser.g:5312:4: ( ( ( () ( ( ruleQCLREF ) ) FullStop ) )=> ( () ( ( ruleQCLREF ) ) otherlv_33= FullStop ) ) ( (otherlv_34= RULE_ID ) )
                    {
                    // InternalGumboParser.g:5312:4: ( ( ( () ( ( ruleQCLREF ) ) FullStop ) )=> ( () ( ( ruleQCLREF ) ) otherlv_33= FullStop ) )
                    // InternalGumboParser.g:5313:5: ( ( () ( ( ruleQCLREF ) ) FullStop ) )=> ( () ( ( ruleQCLREF ) ) otherlv_33= FullStop )
                    {
                    // InternalGumboParser.g:5324:5: ( () ( ( ruleQCLREF ) ) otherlv_33= FullStop )
                    // InternalGumboParser.g:5325:6: () ( ( ruleQCLREF ) ) otherlv_33= FullStop
                    {
                    // InternalGumboParser.g:5325:6: ()
                    // InternalGumboParser.g:5326:7: 
                    {
                    if ( state.backtracking==0 ) {

                      							/* */
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							current = forceCreateModelElement(
                      								grammarAccess.getSlangTermAccess().getEnumLitExprAction_7_0_0_0(),
                      								current);
                      						
                    }

                    }

                    // InternalGumboParser.g:5335:6: ( ( ruleQCLREF ) )
                    // InternalGumboParser.g:5336:7: ( ruleQCLREF )
                    {
                    // InternalGumboParser.g:5336:7: ( ruleQCLREF )
                    // InternalGumboParser.g:5337:8: ruleQCLREF
                    {
                    if ( state.backtracking==0 ) {

                      								/* */
                      							
                    }
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElement(grammarAccess.getSlangTermRule());
                      								}
                      							
                    }
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getSlangTermAccess().getEnumTypeDataClassifierCrossReference_7_0_0_1_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_82);
                    ruleQCLREF();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }

                    otherlv_33=(Token)match(input,FullStop,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_33, grammarAccess.getSlangTermAccess().getFullStopKeyword_7_0_0_2());
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:5360:4: ( (otherlv_34= RULE_ID ) )
                    // InternalGumboParser.g:5361:5: (otherlv_34= RULE_ID )
                    {
                    // InternalGumboParser.g:5361:5: (otherlv_34= RULE_ID )
                    // InternalGumboParser.g:5362:6: otherlv_34= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSlangTermRule());
                      						}
                      					
                    }
                    otherlv_34=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_34, grammarAccess.getSlangTermAccess().getValueStringLiteralCrossReference_7_1_0());
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalGumboParser.g:5378:3: ( ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_36_0= ruleDataElement ) ) otherlv_37= LeftCurlyBracket ( (otherlv_38= RULE_ID ) ) otherlv_39= EqualsSign ) ) ( (lv_argExpr_40_0= ruleExpr ) ) (otherlv_41= Semicolon ( (otherlv_42= RULE_ID ) ) otherlv_43= EqualsSign ( (lv_argExpr_44_0= ruleExpr ) ) )* otherlv_45= RightCurlyBracket )
                    {
                    // InternalGumboParser.g:5378:3: ( ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_36_0= ruleDataElement ) ) otherlv_37= LeftCurlyBracket ( (otherlv_38= RULE_ID ) ) otherlv_39= EqualsSign ) ) ( (lv_argExpr_40_0= ruleExpr ) ) (otherlv_41= Semicolon ( (otherlv_42= RULE_ID ) ) otherlv_43= EqualsSign ( (lv_argExpr_44_0= ruleExpr ) ) )* otherlv_45= RightCurlyBracket )
                    // InternalGumboParser.g:5379:4: ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_36_0= ruleDataElement ) ) otherlv_37= LeftCurlyBracket ( (otherlv_38= RULE_ID ) ) otherlv_39= EqualsSign ) ) ( (lv_argExpr_40_0= ruleExpr ) ) (otherlv_41= Semicolon ( (otherlv_42= RULE_ID ) ) otherlv_43= EqualsSign ( (lv_argExpr_44_0= ruleExpr ) ) )* otherlv_45= RightCurlyBracket
                    {
                    // InternalGumboParser.g:5379:4: ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_36_0= ruleDataElement ) ) otherlv_37= LeftCurlyBracket ( (otherlv_38= RULE_ID ) ) otherlv_39= EqualsSign ) )
                    // InternalGumboParser.g:5380:5: ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_36_0= ruleDataElement ) ) otherlv_37= LeftCurlyBracket ( (otherlv_38= RULE_ID ) ) otherlv_39= EqualsSign )
                    {
                    // InternalGumboParser.g:5397:5: ( () ( (lv_recordType_36_0= ruleDataElement ) ) otherlv_37= LeftCurlyBracket ( (otherlv_38= RULE_ID ) ) otherlv_39= EqualsSign )
                    // InternalGumboParser.g:5398:6: () ( (lv_recordType_36_0= ruleDataElement ) ) otherlv_37= LeftCurlyBracket ( (otherlv_38= RULE_ID ) ) otherlv_39= EqualsSign
                    {
                    // InternalGumboParser.g:5398:6: ()
                    // InternalGumboParser.g:5399:7: 
                    {
                    if ( state.backtracking==0 ) {

                      							/* */
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							current = forceCreateModelElement(
                      								grammarAccess.getSlangTermAccess().getRecordLitExprAction_8_0_0_0(),
                      								current);
                      						
                    }

                    }

                    // InternalGumboParser.g:5408:6: ( (lv_recordType_36_0= ruleDataElement ) )
                    // InternalGumboParser.g:5409:7: (lv_recordType_36_0= ruleDataElement )
                    {
                    // InternalGumboParser.g:5409:7: (lv_recordType_36_0= ruleDataElement )
                    // InternalGumboParser.g:5410:8: lv_recordType_36_0= ruleDataElement
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getSlangTermAccess().getRecordTypeDataElementParserRuleCall_8_0_0_1_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_56);
                    lv_recordType_36_0=ruleDataElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getSlangTermRule());
                      								}
                      								set(
                      									current,
                      									"recordType",
                      									lv_recordType_36_0,
                      									"org.sireum.aadl.gumbo.Gumbo.DataElement");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }

                    otherlv_37=(Token)match(input,LeftCurlyBracket,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_37, grammarAccess.getSlangTermAccess().getLeftCurlyBracketKeyword_8_0_0_2());
                      					
                    }
                    // InternalGumboParser.g:5431:6: ( (otherlv_38= RULE_ID ) )
                    // InternalGumboParser.g:5432:7: (otherlv_38= RULE_ID )
                    {
                    // InternalGumboParser.g:5432:7: (otherlv_38= RULE_ID )
                    // InternalGumboParser.g:5433:8: otherlv_38= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      								/* */
                      							
                    }
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElement(grammarAccess.getSlangTermRule());
                      								}
                      							
                    }
                    otherlv_38=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_83); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								newLeafNode(otherlv_38, grammarAccess.getSlangTermAccess().getArgsNamedElementCrossReference_8_0_0_3_0());
                      							
                    }

                    }


                    }

                    otherlv_39=(Token)match(input,EqualsSign,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_39, grammarAccess.getSlangTermAccess().getEqualsSignKeyword_8_0_0_4());
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:5453:4: ( (lv_argExpr_40_0= ruleExpr ) )
                    // InternalGumboParser.g:5454:5: (lv_argExpr_40_0= ruleExpr )
                    {
                    // InternalGumboParser.g:5454:5: (lv_argExpr_40_0= ruleExpr )
                    // InternalGumboParser.g:5455:6: lv_argExpr_40_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangTermAccess().getArgExprExprParserRuleCall_8_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_84);
                    lv_argExpr_40_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlangTermRule());
                      						}
                      						add(
                      							current,
                      							"argExpr",
                      							lv_argExpr_40_0,
                      							"org.sireum.aadl.gumbo.Gumbo.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:5472:4: (otherlv_41= Semicolon ( (otherlv_42= RULE_ID ) ) otherlv_43= EqualsSign ( (lv_argExpr_44_0= ruleExpr ) ) )*
                    loop104:
                    do {
                        int alt104=2;
                        int LA104_0 = input.LA(1);

                        if ( (LA104_0==Semicolon) ) {
                            alt104=1;
                        }


                        switch (alt104) {
                    	case 1 :
                    	    // InternalGumboParser.g:5473:5: otherlv_41= Semicolon ( (otherlv_42= RULE_ID ) ) otherlv_43= EqualsSign ( (lv_argExpr_44_0= ruleExpr ) )
                    	    {
                    	    otherlv_41=(Token)match(input,Semicolon,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_41, grammarAccess.getSlangTermAccess().getSemicolonKeyword_8_2_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:5477:5: ( (otherlv_42= RULE_ID ) )
                    	    // InternalGumboParser.g:5478:6: (otherlv_42= RULE_ID )
                    	    {
                    	    // InternalGumboParser.g:5478:6: (otherlv_42= RULE_ID )
                    	    // InternalGumboParser.g:5479:7: otherlv_42= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							/* */
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getSlangTermRule());
                    	      							}
                    	      						
                    	    }
                    	    otherlv_42=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_83); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_42, grammarAccess.getSlangTermAccess().getArgsNamedElementCrossReference_8_2_1_0());
                    	      						
                    	    }

                    	    }


                    	    }

                    	    otherlv_43=(Token)match(input,EqualsSign,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_43, grammarAccess.getSlangTermAccess().getEqualsSignKeyword_8_2_2());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:5497:5: ( (lv_argExpr_44_0= ruleExpr ) )
                    	    // InternalGumboParser.g:5498:6: (lv_argExpr_44_0= ruleExpr )
                    	    {
                    	    // InternalGumboParser.g:5498:6: (lv_argExpr_44_0= ruleExpr )
                    	    // InternalGumboParser.g:5499:7: lv_argExpr_44_0= ruleExpr
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSlangTermAccess().getArgExprExprParserRuleCall_8_2_3_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_84);
                    	    lv_argExpr_44_0=ruleExpr();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSlangTermRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"argExpr",
                    	      								lv_argExpr_44_0,
                    	      								"org.sireum.aadl.gumbo.Gumbo.Expr");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop104;
                        }
                    } while (true);

                    otherlv_45=(Token)match(input,RightCurlyBracket,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_45, grammarAccess.getSlangTermAccess().getRightCurlyBracketKeyword_8_3());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalGumboParser.g:5523:3: ( () ( (otherlv_47= RULE_ID ) ) (otherlv_48= FullStop ( (lv_ref_49_0= ruleOtherDataRef ) ) )? )
                    {
                    // InternalGumboParser.g:5523:3: ( () ( (otherlv_47= RULE_ID ) ) (otherlv_48= FullStop ( (lv_ref_49_0= ruleOtherDataRef ) ) )? )
                    // InternalGumboParser.g:5524:4: () ( (otherlv_47= RULE_ID ) ) (otherlv_48= FullStop ( (lv_ref_49_0= ruleOtherDataRef ) ) )?
                    {
                    // InternalGumboParser.g:5524:4: ()
                    // InternalGumboParser.g:5525:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangTermAccess().getDataRefExprAction_9_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:5534:4: ( (otherlv_47= RULE_ID ) )
                    // InternalGumboParser.g:5535:5: (otherlv_47= RULE_ID )
                    {
                    // InternalGumboParser.g:5535:5: (otherlv_47= RULE_ID )
                    // InternalGumboParser.g:5536:6: otherlv_47= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSlangTermRule());
                      						}
                      					
                    }
                    otherlv_47=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_54); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_47, grammarAccess.getSlangTermAccess().getPortOrSubcomponentOrStateVarEObjectCrossReference_9_1_0());
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:5550:4: (otherlv_48= FullStop ( (lv_ref_49_0= ruleOtherDataRef ) ) )?
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==FullStop) ) {
                        int LA105_1 = input.LA(2);

                        if ( (LA105_1==RULE_ID) ) {
                            int LA105_3 = input.LA(3);

                            if ( (synpred134_InternalGumboParser()) ) {
                                alt105=1;
                            }
                        }
                    }
                    switch (alt105) {
                        case 1 :
                            // InternalGumboParser.g:5551:5: otherlv_48= FullStop ( (lv_ref_49_0= ruleOtherDataRef ) )
                            {
                            otherlv_48=(Token)match(input,FullStop,FollowSets000.FOLLOW_8); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_48, grammarAccess.getSlangTermAccess().getFullStopKeyword_9_2_0());
                              				
                            }
                            // InternalGumboParser.g:5555:5: ( (lv_ref_49_0= ruleOtherDataRef ) )
                            // InternalGumboParser.g:5556:6: (lv_ref_49_0= ruleOtherDataRef )
                            {
                            // InternalGumboParser.g:5556:6: (lv_ref_49_0= ruleOtherDataRef )
                            // InternalGumboParser.g:5557:7: lv_ref_49_0= ruleOtherDataRef
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSlangTermAccess().getRefOtherDataRefParserRuleCall_9_2_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_ref_49_0=ruleOtherDataRef();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getSlangTermRule());
                              							}
                              							set(
                              								current,
                              								"ref",
                              								lv_ref_49_0,
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
                    break;
                case 11 :
                    // InternalGumboParser.g:5577:3: ( () otherlv_51= LeftParenthesis ( (lv_e_52_0= ruleExpr ) ) (otherlv_53= Comma ( (lv_e_54_0= ruleExpr ) ) )* otherlv_55= RightParenthesis )
                    {
                    // InternalGumboParser.g:5577:3: ( () otherlv_51= LeftParenthesis ( (lv_e_52_0= ruleExpr ) ) (otherlv_53= Comma ( (lv_e_54_0= ruleExpr ) ) )* otherlv_55= RightParenthesis )
                    // InternalGumboParser.g:5578:4: () otherlv_51= LeftParenthesis ( (lv_e_52_0= ruleExpr ) ) (otherlv_53= Comma ( (lv_e_54_0= ruleExpr ) ) )* otherlv_55= RightParenthesis
                    {
                    // InternalGumboParser.g:5578:4: ()
                    // InternalGumboParser.g:5579:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangTermAccess().getSlangTupleTermAction_10_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_51=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_51, grammarAccess.getSlangTermAccess().getLeftParenthesisKeyword_10_1());
                      			
                    }
                    // InternalGumboParser.g:5592:4: ( (lv_e_52_0= ruleExpr ) )
                    // InternalGumboParser.g:5593:5: (lv_e_52_0= ruleExpr )
                    {
                    // InternalGumboParser.g:5593:5: (lv_e_52_0= ruleExpr )
                    // InternalGumboParser.g:5594:6: lv_e_52_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangTermAccess().getEExprParserRuleCall_10_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_41);
                    lv_e_52_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlangTermRule());
                      						}
                      						add(
                      							current,
                      							"e",
                      							lv_e_52_0,
                      							"org.sireum.aadl.gumbo.Gumbo.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:5611:4: (otherlv_53= Comma ( (lv_e_54_0= ruleExpr ) ) )*
                    loop106:
                    do {
                        int alt106=2;
                        int LA106_0 = input.LA(1);

                        if ( (LA106_0==Comma) ) {
                            alt106=1;
                        }


                        switch (alt106) {
                    	case 1 :
                    	    // InternalGumboParser.g:5612:5: otherlv_53= Comma ( (lv_e_54_0= ruleExpr ) )
                    	    {
                    	    otherlv_53=(Token)match(input,Comma,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_53, grammarAccess.getSlangTermAccess().getCommaKeyword_10_3_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:5616:5: ( (lv_e_54_0= ruleExpr ) )
                    	    // InternalGumboParser.g:5617:6: (lv_e_54_0= ruleExpr )
                    	    {
                    	    // InternalGumboParser.g:5617:6: (lv_e_54_0= ruleExpr )
                    	    // InternalGumboParser.g:5618:7: lv_e_54_0= ruleExpr
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSlangTermAccess().getEExprParserRuleCall_10_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_41);
                    	    lv_e_54_0=ruleExpr();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSlangTermRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"e",
                    	      								lv_e_54_0,
                    	      								"org.sireum.aadl.gumbo.Gumbo.Expr");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop106;
                        }
                    } while (true);

                    otherlv_55=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_55, grammarAccess.getSlangTermAccess().getRightParenthesisKeyword_10_4());
                      			
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalGumboParser.g:5642:3: ( () otherlv_57= For ( (lv_r_58_0= ruleSlangForRange ) ) (otherlv_59= Comma ( (lv_r_60_0= ruleSlangForRange ) ) )* otherlv_61= Yield ( ( (lv_b_62_0= ruleSlangBlock ) ) | (otherlv_63= LeftParenthesis ( (lv_e_64_0= ruleExpr ) ) otherlv_65= RightParenthesis ) ) )
                    {
                    // InternalGumboParser.g:5642:3: ( () otherlv_57= For ( (lv_r_58_0= ruleSlangForRange ) ) (otherlv_59= Comma ( (lv_r_60_0= ruleSlangForRange ) ) )* otherlv_61= Yield ( ( (lv_b_62_0= ruleSlangBlock ) ) | (otherlv_63= LeftParenthesis ( (lv_e_64_0= ruleExpr ) ) otherlv_65= RightParenthesis ) ) )
                    // InternalGumboParser.g:5643:4: () otherlv_57= For ( (lv_r_58_0= ruleSlangForRange ) ) (otherlv_59= Comma ( (lv_r_60_0= ruleSlangForRange ) ) )* otherlv_61= Yield ( ( (lv_b_62_0= ruleSlangBlock ) ) | (otherlv_63= LeftParenthesis ( (lv_e_64_0= ruleExpr ) ) otherlv_65= RightParenthesis ) )
                    {
                    // InternalGumboParser.g:5643:4: ()
                    // InternalGumboParser.g:5644:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangTermAccess().getSlangForTermAction_11_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_57=(Token)match(input,For,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_57, grammarAccess.getSlangTermAccess().getForKeyword_11_1());
                      			
                    }
                    // InternalGumboParser.g:5657:4: ( (lv_r_58_0= ruleSlangForRange ) )
                    // InternalGumboParser.g:5658:5: (lv_r_58_0= ruleSlangForRange )
                    {
                    // InternalGumboParser.g:5658:5: (lv_r_58_0= ruleSlangForRange )
                    // InternalGumboParser.g:5659:6: lv_r_58_0= ruleSlangForRange
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangTermAccess().getRSlangForRangeParserRuleCall_11_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_85);
                    lv_r_58_0=ruleSlangForRange();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlangTermRule());
                      						}
                      						add(
                      							current,
                      							"r",
                      							lv_r_58_0,
                      							"org.sireum.aadl.gumbo.Gumbo.SlangForRange");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:5676:4: (otherlv_59= Comma ( (lv_r_60_0= ruleSlangForRange ) ) )*
                    loop107:
                    do {
                        int alt107=2;
                        int LA107_0 = input.LA(1);

                        if ( (LA107_0==Comma) ) {
                            alt107=1;
                        }


                        switch (alt107) {
                    	case 1 :
                    	    // InternalGumboParser.g:5677:5: otherlv_59= Comma ( (lv_r_60_0= ruleSlangForRange ) )
                    	    {
                    	    otherlv_59=(Token)match(input,Comma,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_59, grammarAccess.getSlangTermAccess().getCommaKeyword_11_3_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:5681:5: ( (lv_r_60_0= ruleSlangForRange ) )
                    	    // InternalGumboParser.g:5682:6: (lv_r_60_0= ruleSlangForRange )
                    	    {
                    	    // InternalGumboParser.g:5682:6: (lv_r_60_0= ruleSlangForRange )
                    	    // InternalGumboParser.g:5683:7: lv_r_60_0= ruleSlangForRange
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSlangTermAccess().getRSlangForRangeParserRuleCall_11_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_85);
                    	    lv_r_60_0=ruleSlangForRange();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSlangTermRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"r",
                    	      								lv_r_60_0,
                    	      								"org.sireum.aadl.gumbo.Gumbo.SlangForRange");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop107;
                        }
                    } while (true);

                    otherlv_61=(Token)match(input,Yield,FollowSets000.FOLLOW_86); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_61, grammarAccess.getSlangTermAccess().getYieldKeyword_11_4());
                      			
                    }
                    // InternalGumboParser.g:5705:4: ( ( (lv_b_62_0= ruleSlangBlock ) ) | (otherlv_63= LeftParenthesis ( (lv_e_64_0= ruleExpr ) ) otherlv_65= RightParenthesis ) )
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==LeftCurlyBracket) ) {
                        alt108=1;
                    }
                    else if ( (LA108_0==LeftParenthesis) ) {
                        alt108=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 108, 0, input);

                        throw nvae;
                    }
                    switch (alt108) {
                        case 1 :
                            // InternalGumboParser.g:5706:5: ( (lv_b_62_0= ruleSlangBlock ) )
                            {
                            // InternalGumboParser.g:5706:5: ( (lv_b_62_0= ruleSlangBlock ) )
                            // InternalGumboParser.g:5707:6: (lv_b_62_0= ruleSlangBlock )
                            {
                            // InternalGumboParser.g:5707:6: (lv_b_62_0= ruleSlangBlock )
                            // InternalGumboParser.g:5708:7: lv_b_62_0= ruleSlangBlock
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSlangTermAccess().getBSlangBlockParserRuleCall_11_5_0_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_b_62_0=ruleSlangBlock();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getSlangTermRule());
                              							}
                              							set(
                              								current,
                              								"b",
                              								lv_b_62_0,
                              								"org.sireum.aadl.gumbo.Gumbo.SlangBlock");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalGumboParser.g:5726:5: (otherlv_63= LeftParenthesis ( (lv_e_64_0= ruleExpr ) ) otherlv_65= RightParenthesis )
                            {
                            // InternalGumboParser.g:5726:5: (otherlv_63= LeftParenthesis ( (lv_e_64_0= ruleExpr ) ) otherlv_65= RightParenthesis )
                            // InternalGumboParser.g:5727:6: otherlv_63= LeftParenthesis ( (lv_e_64_0= ruleExpr ) ) otherlv_65= RightParenthesis
                            {
                            otherlv_63=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_63, grammarAccess.getSlangTermAccess().getLeftParenthesisKeyword_11_5_1_0());
                              					
                            }
                            // InternalGumboParser.g:5731:6: ( (lv_e_64_0= ruleExpr ) )
                            // InternalGumboParser.g:5732:7: (lv_e_64_0= ruleExpr )
                            {
                            // InternalGumboParser.g:5732:7: (lv_e_64_0= ruleExpr )
                            // InternalGumboParser.g:5733:8: lv_e_64_0= ruleExpr
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getSlangTermAccess().getEExprParserRuleCall_11_5_1_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_39);
                            lv_e_64_0=ruleExpr();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getSlangTermRule());
                              								}
                              								set(
                              									current,
                              									"e",
                              									lv_e_64_0,
                              									"org.sireum.aadl.gumbo.Gumbo.Expr");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            otherlv_65=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_65, grammarAccess.getSlangTermAccess().getRightParenthesisKeyword_11_5_1_2());
                              					
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 13 :
                    // InternalGumboParser.g:5758:3: ( () otherlv_67= LeftCurlyBracket ( ( ( ( (lv_p_68_0= ruleSlangParams ) ) otherlv_69= EqualsSignGreaterThanSign )? ( (lv_e_70_0= ruleExpr ) ) otherlv_71= RightCurlyBracket ) | ( ( (lv_stmt_72_0= ruleSlangStmt ) )* ( (lv_r_73_0= ruleSlangRet ) )? otherlv_74= RightCurlyBracket ) ) )
                    {
                    // InternalGumboParser.g:5758:3: ( () otherlv_67= LeftCurlyBracket ( ( ( ( (lv_p_68_0= ruleSlangParams ) ) otherlv_69= EqualsSignGreaterThanSign )? ( (lv_e_70_0= ruleExpr ) ) otherlv_71= RightCurlyBracket ) | ( ( (lv_stmt_72_0= ruleSlangStmt ) )* ( (lv_r_73_0= ruleSlangRet ) )? otherlv_74= RightCurlyBracket ) ) )
                    // InternalGumboParser.g:5759:4: () otherlv_67= LeftCurlyBracket ( ( ( ( (lv_p_68_0= ruleSlangParams ) ) otherlv_69= EqualsSignGreaterThanSign )? ( (lv_e_70_0= ruleExpr ) ) otherlv_71= RightCurlyBracket ) | ( ( (lv_stmt_72_0= ruleSlangStmt ) )* ( (lv_r_73_0= ruleSlangRet ) )? otherlv_74= RightCurlyBracket ) )
                    {
                    // InternalGumboParser.g:5759:4: ()
                    // InternalGumboParser.g:5760:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangTermAccess().getSlangBlockTermAction_12_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_67=(Token)match(input,LeftCurlyBracket,FollowSets000.FOLLOW_87); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_67, grammarAccess.getSlangTermAccess().getLeftCurlyBracketKeyword_12_1());
                      			
                    }
                    // InternalGumboParser.g:5773:4: ( ( ( ( (lv_p_68_0= ruleSlangParams ) ) otherlv_69= EqualsSignGreaterThanSign )? ( (lv_e_70_0= ruleExpr ) ) otherlv_71= RightCurlyBracket ) | ( ( (lv_stmt_72_0= ruleSlangStmt ) )* ( (lv_r_73_0= ruleSlangRet ) )? otherlv_74= RightCurlyBracket ) )
                    int alt112=2;
                    alt112 = dfa112.predict(input);
                    switch (alt112) {
                        case 1 :
                            // InternalGumboParser.g:5774:5: ( ( ( (lv_p_68_0= ruleSlangParams ) ) otherlv_69= EqualsSignGreaterThanSign )? ( (lv_e_70_0= ruleExpr ) ) otherlv_71= RightCurlyBracket )
                            {
                            // InternalGumboParser.g:5774:5: ( ( ( (lv_p_68_0= ruleSlangParams ) ) otherlv_69= EqualsSignGreaterThanSign )? ( (lv_e_70_0= ruleExpr ) ) otherlv_71= RightCurlyBracket )
                            // InternalGumboParser.g:5775:6: ( ( (lv_p_68_0= ruleSlangParams ) ) otherlv_69= EqualsSignGreaterThanSign )? ( (lv_e_70_0= ruleExpr ) ) otherlv_71= RightCurlyBracket
                            {
                            // InternalGumboParser.g:5775:6: ( ( (lv_p_68_0= ruleSlangParams ) ) otherlv_69= EqualsSignGreaterThanSign )?
                            int alt109=2;
                            int LA109_0 = input.LA(1);

                            if ( (LA109_0==LeftParenthesis) ) {
                                int LA109_1 = input.LA(2);

                                if ( (LA109_1==RULE_ID) ) {
                                    int LA109_3 = input.LA(3);

                                    if ( (LA109_3==Colon) ) {
                                        alt109=1;
                                    }
                                }
                                else if ( (LA109_1==Var) ) {
                                    alt109=1;
                                }
                            }
                            switch (alt109) {
                                case 1 :
                                    // InternalGumboParser.g:5776:7: ( (lv_p_68_0= ruleSlangParams ) ) otherlv_69= EqualsSignGreaterThanSign
                                    {
                                    // InternalGumboParser.g:5776:7: ( (lv_p_68_0= ruleSlangParams ) )
                                    // InternalGumboParser.g:5777:8: (lv_p_68_0= ruleSlangParams )
                                    {
                                    // InternalGumboParser.g:5777:8: (lv_p_68_0= ruleSlangParams )
                                    // InternalGumboParser.g:5778:9: lv_p_68_0= ruleSlangParams
                                    {
                                    if ( state.backtracking==0 ) {

                                      									newCompositeNode(grammarAccess.getSlangTermAccess().getPSlangParamsParserRuleCall_12_2_0_0_0_0());
                                      								
                                    }
                                    pushFollow(FollowSets000.FOLLOW_67);
                                    lv_p_68_0=ruleSlangParams();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElementForParent(grammarAccess.getSlangTermRule());
                                      									}
                                      									set(
                                      										current,
                                      										"p",
                                      										lv_p_68_0,
                                      										"org.sireum.aadl.gumbo.Gumbo.SlangParams");
                                      									afterParserOrEnumRuleCall();
                                      								
                                    }

                                    }


                                    }

                                    otherlv_69=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_15); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(otherlv_69, grammarAccess.getSlangTermAccess().getEqualsSignGreaterThanSignKeyword_12_2_0_0_1());
                                      						
                                    }

                                    }
                                    break;

                            }

                            // InternalGumboParser.g:5800:6: ( (lv_e_70_0= ruleExpr ) )
                            // InternalGumboParser.g:5801:7: (lv_e_70_0= ruleExpr )
                            {
                            // InternalGumboParser.g:5801:7: (lv_e_70_0= ruleExpr )
                            // InternalGumboParser.g:5802:8: lv_e_70_0= ruleExpr
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getSlangTermAccess().getEExprParserRuleCall_12_2_0_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_80);
                            lv_e_70_0=ruleExpr();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getSlangTermRule());
                              								}
                              								set(
                              									current,
                              									"e",
                              									lv_e_70_0,
                              									"org.sireum.aadl.gumbo.Gumbo.Expr");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            otherlv_71=(Token)match(input,RightCurlyBracket,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_71, grammarAccess.getSlangTermAccess().getRightCurlyBracketKeyword_12_2_0_2());
                              					
                            }

                            }


                            }
                            break;
                        case 2 :
                            // InternalGumboParser.g:5825:5: ( ( (lv_stmt_72_0= ruleSlangStmt ) )* ( (lv_r_73_0= ruleSlangRet ) )? otherlv_74= RightCurlyBracket )
                            {
                            // InternalGumboParser.g:5825:5: ( ( (lv_stmt_72_0= ruleSlangStmt ) )* ( (lv_r_73_0= ruleSlangRet ) )? otherlv_74= RightCurlyBracket )
                            // InternalGumboParser.g:5826:6: ( (lv_stmt_72_0= ruleSlangStmt ) )* ( (lv_r_73_0= ruleSlangRet ) )? otherlv_74= RightCurlyBracket
                            {
                            // InternalGumboParser.g:5826:6: ( (lv_stmt_72_0= ruleSlangStmt ) )*
                            loop110:
                            do {
                                int alt110=2;
                                int LA110_0 = input.LA(1);

                                if ( ((LA110_0>=Assert && LA110_0<=Assume)||LA110_0==Match||LA110_0==While||(LA110_0>=Halt && LA110_0<=Spec)||(LA110_0>=Val && LA110_0<=Var)||(LA110_0>=Do && LA110_0<=If)||LA110_0==RULE_ID) ) {
                                    alt110=1;
                                }


                                switch (alt110) {
                            	case 1 :
                            	    // InternalGumboParser.g:5827:7: (lv_stmt_72_0= ruleSlangStmt )
                            	    {
                            	    // InternalGumboParser.g:5827:7: (lv_stmt_72_0= ruleSlangStmt )
                            	    // InternalGumboParser.g:5828:8: lv_stmt_72_0= ruleSlangStmt
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getSlangTermAccess().getStmtSlangStmtParserRuleCall_12_2_1_0_0());
                            	      							
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_79);
                            	    lv_stmt_72_0=ruleSlangStmt();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getSlangTermRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"stmt",
                            	      									lv_stmt_72_0,
                            	      									"org.sireum.aadl.gumbo.Gumbo.SlangStmt");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop110;
                                }
                            } while (true);

                            // InternalGumboParser.g:5845:6: ( (lv_r_73_0= ruleSlangRet ) )?
                            int alt111=2;
                            int LA111_0 = input.LA(1);

                            if ( (LA111_0==Return) ) {
                                alt111=1;
                            }
                            switch (alt111) {
                                case 1 :
                                    // InternalGumboParser.g:5846:7: (lv_r_73_0= ruleSlangRet )
                                    {
                                    // InternalGumboParser.g:5846:7: (lv_r_73_0= ruleSlangRet )
                                    // InternalGumboParser.g:5847:8: lv_r_73_0= ruleSlangRet
                                    {
                                    if ( state.backtracking==0 ) {

                                      								newCompositeNode(grammarAccess.getSlangTermAccess().getRSlangRetParserRuleCall_12_2_1_1_0());
                                      							
                                    }
                                    pushFollow(FollowSets000.FOLLOW_80);
                                    lv_r_73_0=ruleSlangRet();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								if (current==null) {
                                      									current = createModelElementForParent(grammarAccess.getSlangTermRule());
                                      								}
                                      								set(
                                      									current,
                                      									"r",
                                      									lv_r_73_0,
                                      									"org.sireum.aadl.gumbo.Gumbo.SlangRet");
                                      								afterParserOrEnumRuleCall();
                                      							
                                    }

                                    }


                                    }
                                    break;

                            }

                            otherlv_74=(Token)match(input,RightCurlyBracket,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_74, grammarAccess.getSlangTermAccess().getRightCurlyBracketKeyword_12_2_1_2());
                              					
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


    // $ANTLR start "entryRuleSlangParams"
    // InternalGumboParser.g:5875:1: entryRuleSlangParams returns [EObject current=null] : iv_ruleSlangParams= ruleSlangParams EOF ;
    public final EObject entryRuleSlangParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangParams = null;


        try {
            // InternalGumboParser.g:5875:52: (iv_ruleSlangParams= ruleSlangParams EOF )
            // InternalGumboParser.g:5876:2: iv_ruleSlangParams= ruleSlangParams EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlangParamsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlangParams=ruleSlangParams();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlangParams; 
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
    // $ANTLR end "entryRuleSlangParams"


    // $ANTLR start "ruleSlangParams"
    // InternalGumboParser.g:5882:1: ruleSlangParams returns [EObject current=null] : (otherlv_0= LeftParenthesis ( (lv_params_1_0= ruleSlangParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangParam ) ) )? otherlv_4= RightParenthesis ) ;
    public final EObject ruleSlangParams() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_params_1_0 = null;

        EObject lv_params_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:5888:2: ( (otherlv_0= LeftParenthesis ( (lv_params_1_0= ruleSlangParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangParam ) ) )? otherlv_4= RightParenthesis ) )
            // InternalGumboParser.g:5889:2: (otherlv_0= LeftParenthesis ( (lv_params_1_0= ruleSlangParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangParam ) ) )? otherlv_4= RightParenthesis )
            {
            // InternalGumboParser.g:5889:2: (otherlv_0= LeftParenthesis ( (lv_params_1_0= ruleSlangParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangParam ) ) )? otherlv_4= RightParenthesis )
            // InternalGumboParser.g:5890:3: otherlv_0= LeftParenthesis ( (lv_params_1_0= ruleSlangParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangParam ) ) )? otherlv_4= RightParenthesis
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_88); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangParamsAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalGumboParser.g:5894:3: ( (lv_params_1_0= ruleSlangParam ) )
            // InternalGumboParser.g:5895:4: (lv_params_1_0= ruleSlangParam )
            {
            // InternalGumboParser.g:5895:4: (lv_params_1_0= ruleSlangParam )
            // InternalGumboParser.g:5896:5: lv_params_1_0= ruleSlangParam
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangParamsAccess().getParamsSlangParamParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_41);
            lv_params_1_0=ruleSlangParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSlangParamsRule());
              					}
              					add(
              						current,
              						"params",
              						lv_params_1_0,
              						"org.sireum.aadl.gumbo.Gumbo.SlangParam");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumboParser.g:5913:3: (otherlv_2= Comma ( (lv_params_3_0= ruleSlangParam ) ) )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==Comma) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalGumboParser.g:5914:4: otherlv_2= Comma ( (lv_params_3_0= ruleSlangParam ) )
                    {
                    otherlv_2=(Token)match(input,Comma,FollowSets000.FOLLOW_88); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSlangParamsAccess().getCommaKeyword_2_0());
                      			
                    }
                    // InternalGumboParser.g:5918:4: ( (lv_params_3_0= ruleSlangParam ) )
                    // InternalGumboParser.g:5919:5: (lv_params_3_0= ruleSlangParam )
                    {
                    // InternalGumboParser.g:5919:5: (lv_params_3_0= ruleSlangParam )
                    // InternalGumboParser.g:5920:6: lv_params_3_0= ruleSlangParam
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangParamsAccess().getParamsSlangParamParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_39);
                    lv_params_3_0=ruleSlangParam();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlangParamsRule());
                      						}
                      						add(
                      							current,
                      							"params",
                      							lv_params_3_0,
                      							"org.sireum.aadl.gumbo.Gumbo.SlangParam");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getSlangParamsAccess().getRightParenthesisKeyword_3());
              		
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
    // $ANTLR end "ruleSlangParams"


    // $ANTLR start "entryRuleSlangParam"
    // InternalGumboParser.g:5946:1: entryRuleSlangParam returns [EObject current=null] : iv_ruleSlangParam= ruleSlangParam EOF ;
    public final EObject entryRuleSlangParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangParam = null;


        try {
            // InternalGumboParser.g:5946:51: (iv_ruleSlangParam= ruleSlangParam EOF )
            // InternalGumboParser.g:5947:2: iv_ruleSlangParam= ruleSlangParam EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlangParamRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlangParam=ruleSlangParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlangParam; 
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
    // $ANTLR end "entryRuleSlangParam"


    // $ANTLR start "ruleSlangParam"
    // InternalGumboParser.g:5953:1: ruleSlangParam returns [EObject current=null] : ( (otherlv_0= Var )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon (otherlv_3= EqualsSignGreaterThanSign )? ( (lv_typeName_4_0= ruleSlangType ) ) (otherlv_5= Asterisk )? ) ;
    public final EObject ruleSlangParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_typeName_4_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:5959:2: ( ( (otherlv_0= Var )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon (otherlv_3= EqualsSignGreaterThanSign )? ( (lv_typeName_4_0= ruleSlangType ) ) (otherlv_5= Asterisk )? ) )
            // InternalGumboParser.g:5960:2: ( (otherlv_0= Var )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon (otherlv_3= EqualsSignGreaterThanSign )? ( (lv_typeName_4_0= ruleSlangType ) ) (otherlv_5= Asterisk )? )
            {
            // InternalGumboParser.g:5960:2: ( (otherlv_0= Var )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon (otherlv_3= EqualsSignGreaterThanSign )? ( (lv_typeName_4_0= ruleSlangType ) ) (otherlv_5= Asterisk )? )
            // InternalGumboParser.g:5961:3: (otherlv_0= Var )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon (otherlv_3= EqualsSignGreaterThanSign )? ( (lv_typeName_4_0= ruleSlangType ) ) (otherlv_5= Asterisk )?
            {
            // InternalGumboParser.g:5961:3: (otherlv_0= Var )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==Var) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // InternalGumboParser.g:5962:4: otherlv_0= Var
                    {
                    otherlv_0=(Token)match(input,Var,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getSlangParamAccess().getVarKeyword_0());
                      			
                    }

                    }
                    break;

            }

            // InternalGumboParser.g:5967:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGumboParser.g:5968:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGumboParser.g:5968:4: (lv_name_1_0= RULE_ID )
            // InternalGumboParser.g:5969:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getSlangParamAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSlangParamRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.osate.xtext.aadl2.properties.Properties.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,Colon,FollowSets000.FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSlangParamAccess().getColonKeyword_2());
              		
            }
            // InternalGumboParser.g:5989:3: (otherlv_3= EqualsSignGreaterThanSign )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==EqualsSignGreaterThanSign) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // InternalGumboParser.g:5990:4: otherlv_3= EqualsSignGreaterThanSign
                    {
                    otherlv_3=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getSlangParamAccess().getEqualsSignGreaterThanSignKeyword_3());
                      			
                    }

                    }
                    break;

            }

            // InternalGumboParser.g:5995:3: ( (lv_typeName_4_0= ruleSlangType ) )
            // InternalGumboParser.g:5996:4: (lv_typeName_4_0= ruleSlangType )
            {
            // InternalGumboParser.g:5996:4: (lv_typeName_4_0= ruleSlangType )
            // InternalGumboParser.g:5997:5: lv_typeName_4_0= ruleSlangType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangParamAccess().getTypeNameSlangTypeParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_43);
            lv_typeName_4_0=ruleSlangType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSlangParamRule());
              					}
              					set(
              						current,
              						"typeName",
              						lv_typeName_4_0,
              						"org.sireum.aadl.gumbo.Gumbo.SlangType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumboParser.g:6014:3: (otherlv_5= Asterisk )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==Asterisk) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // InternalGumboParser.g:6015:4: otherlv_5= Asterisk
                    {
                    otherlv_5=(Token)match(input,Asterisk,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getSlangParamAccess().getAsteriskKeyword_5());
                      			
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
    // $ANTLR end "ruleSlangParam"


    // $ANTLR start "entryRuleSlangForRange"
    // InternalGumboParser.g:6024:1: entryRuleSlangForRange returns [EObject current=null] : iv_ruleSlangForRange= ruleSlangForRange EOF ;
    public final EObject entryRuleSlangForRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangForRange = null;


        try {
            // InternalGumboParser.g:6024:54: (iv_ruleSlangForRange= ruleSlangForRange EOF )
            // InternalGumboParser.g:6025:2: iv_ruleSlangForRange= ruleSlangForRange EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlangForRangeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlangForRange=ruleSlangForRange();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlangForRange; 
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
    // $ANTLR end "entryRuleSlangForRange"


    // $ANTLR start "ruleSlangForRange"
    // InternalGumboParser.g:6031:1: ruleSlangForRange returns [EObject current=null] : (this_ID_0= RULE_ID otherlv_1= Colon ( (lv_e_2_0= ruleExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upper_5_0= ruleExpr ) ) (otherlv_6= By ( (lv_step_7_0= ruleExpr ) ) )? )? ) ;
    public final EObject ruleSlangForRange() throws RecognitionException {
        EObject current = null;

        Token this_ID_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_e_2_0 = null;

        EObject lv_upper_5_0 = null;

        EObject lv_step_7_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:6037:2: ( (this_ID_0= RULE_ID otherlv_1= Colon ( (lv_e_2_0= ruleExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upper_5_0= ruleExpr ) ) (otherlv_6= By ( (lv_step_7_0= ruleExpr ) ) )? )? ) )
            // InternalGumboParser.g:6038:2: (this_ID_0= RULE_ID otherlv_1= Colon ( (lv_e_2_0= ruleExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upper_5_0= ruleExpr ) ) (otherlv_6= By ( (lv_step_7_0= ruleExpr ) ) )? )? )
            {
            // InternalGumboParser.g:6038:2: (this_ID_0= RULE_ID otherlv_1= Colon ( (lv_e_2_0= ruleExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upper_5_0= ruleExpr ) ) (otherlv_6= By ( (lv_step_7_0= ruleExpr ) ) )? )? )
            // InternalGumboParser.g:6039:3: this_ID_0= RULE_ID otherlv_1= Colon ( (lv_e_2_0= ruleExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upper_5_0= ruleExpr ) ) (otherlv_6= By ( (lv_step_7_0= ruleExpr ) ) )? )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getSlangForRangeAccess().getIDTerminalRuleCall_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSlangForRangeAccess().getColonKeyword_1());
              		
            }
            // InternalGumboParser.g:6047:3: ( (lv_e_2_0= ruleExpr ) )
            // InternalGumboParser.g:6048:4: (lv_e_2_0= ruleExpr )
            {
            // InternalGumboParser.g:6048:4: (lv_e_2_0= ruleExpr )
            // InternalGumboParser.g:6049:5: lv_e_2_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangForRangeAccess().getEExprParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_78);
            lv_e_2_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSlangForRangeRule());
              					}
              					set(
              						current,
              						"e",
              						lv_e_2_0,
              						"org.sireum.aadl.gumbo.Gumbo.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumboParser.g:6066:3: ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upper_5_0= ruleExpr ) ) (otherlv_6= By ( (lv_step_7_0= ruleExpr ) ) )? )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==FullStopFullStopLessThanSign||LA120_0==FullStopFullStop) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // InternalGumboParser.g:6067:4: (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upper_5_0= ruleExpr ) ) (otherlv_6= By ( (lv_step_7_0= ruleExpr ) ) )?
                    {
                    // InternalGumboParser.g:6067:4: (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign )
                    int alt118=2;
                    int LA118_0 = input.LA(1);

                    if ( (LA118_0==FullStopFullStop) ) {
                        alt118=1;
                    }
                    else if ( (LA118_0==FullStopFullStopLessThanSign) ) {
                        alt118=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 118, 0, input);

                        throw nvae;
                    }
                    switch (alt118) {
                        case 1 :
                            // InternalGumboParser.g:6068:5: otherlv_3= FullStopFullStop
                            {
                            otherlv_3=(Token)match(input,FullStopFullStop,FollowSets000.FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_3, grammarAccess.getSlangForRangeAccess().getFullStopFullStopKeyword_3_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalGumboParser.g:6073:5: otherlv_4= FullStopFullStopLessThanSign
                            {
                            otherlv_4=(Token)match(input,FullStopFullStopLessThanSign,FollowSets000.FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getSlangForRangeAccess().getFullStopFullStopLessThanSignKeyword_3_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalGumboParser.g:6078:4: ( (lv_upper_5_0= ruleExpr ) )
                    // InternalGumboParser.g:6079:5: (lv_upper_5_0= ruleExpr )
                    {
                    // InternalGumboParser.g:6079:5: (lv_upper_5_0= ruleExpr )
                    // InternalGumboParser.g:6080:6: lv_upper_5_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangForRangeAccess().getUpperExprParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_89);
                    lv_upper_5_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlangForRangeRule());
                      						}
                      						set(
                      							current,
                      							"upper",
                      							lv_upper_5_0,
                      							"org.sireum.aadl.gumbo.Gumbo.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:6097:4: (otherlv_6= By ( (lv_step_7_0= ruleExpr ) ) )?
                    int alt119=2;
                    int LA119_0 = input.LA(1);

                    if ( (LA119_0==By) ) {
                        alt119=1;
                    }
                    switch (alt119) {
                        case 1 :
                            // InternalGumboParser.g:6098:5: otherlv_6= By ( (lv_step_7_0= ruleExpr ) )
                            {
                            otherlv_6=(Token)match(input,By,FollowSets000.FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_6, grammarAccess.getSlangForRangeAccess().getByKeyword_3_2_0());
                              				
                            }
                            // InternalGumboParser.g:6102:5: ( (lv_step_7_0= ruleExpr ) )
                            // InternalGumboParser.g:6103:6: (lv_step_7_0= ruleExpr )
                            {
                            // InternalGumboParser.g:6103:6: (lv_step_7_0= ruleExpr )
                            // InternalGumboParser.g:6104:7: lv_step_7_0= ruleExpr
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSlangForRangeAccess().getStepExprParserRuleCall_3_2_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_step_7_0=ruleExpr();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getSlangForRangeRule());
                              							}
                              							set(
                              								current,
                              								"step",
                              								lv_step_7_0,
                              								"org.sireum.aadl.gumbo.Gumbo.Expr");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

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
    // $ANTLR end "ruleSlangForRange"


    // $ANTLR start "entryRuleSlangRet"
    // InternalGumboParser.g:6127:1: entryRuleSlangRet returns [EObject current=null] : iv_ruleSlangRet= ruleSlangRet EOF ;
    public final EObject entryRuleSlangRet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangRet = null;


        try {
            // InternalGumboParser.g:6127:49: (iv_ruleSlangRet= ruleSlangRet EOF )
            // InternalGumboParser.g:6128:2: iv_ruleSlangRet= ruleSlangRet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlangRetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlangRet=ruleSlangRet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlangRet; 
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
    // $ANTLR end "entryRuleSlangRet"


    // $ANTLR start "ruleSlangRet"
    // InternalGumboParser.g:6134:1: ruleSlangRet returns [EObject current=null] : ( () otherlv_1= Return ( (lv_e_2_0= ruleExpr ) )? ) ;
    public final EObject ruleSlangRet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_e_2_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:6140:2: ( ( () otherlv_1= Return ( (lv_e_2_0= ruleExpr ) )? ) )
            // InternalGumboParser.g:6141:2: ( () otherlv_1= Return ( (lv_e_2_0= ruleExpr ) )? )
            {
            // InternalGumboParser.g:6141:2: ( () otherlv_1= Return ( (lv_e_2_0= ruleExpr ) )? )
            // InternalGumboParser.g:6142:3: () otherlv_1= Return ( (lv_e_2_0= ruleExpr ) )?
            {
            // InternalGumboParser.g:6142:3: ()
            // InternalGumboParser.g:6143:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSlangRetAccess().getSlangRetAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Return,FollowSets000.FOLLOW_76); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSlangRetAccess().getReturnKeyword_1());
              		
            }
            // InternalGumboParser.g:6156:3: ( (lv_e_2_0= ruleExpr ) )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==MustSend||LA121_0==MaySend||LA121_0==NoSend||LA121_0==Some||LA121_0==All||LA121_0==For||LA121_0==In_1||LA121_0==LeftParenthesis||(LA121_0>=Asterisk && LA121_0<=PlusSign)||LA121_0==HyphenMinus||(LA121_0>=F && LA121_0<=T)||LA121_0==LeftCurlyBracket||(LA121_0>=ForAll && LA121_0<=ThereExists)||(LA121_0>=RULE_SLANG_STRING && LA121_0<=RULE_MSTRING)||(LA121_0>=RULE_MSP && LA121_0<=RULE_MSPB)||(LA121_0>=RULE_IMPLIES && LA121_0<=RULE_OP)||(LA121_0>=RULE_HEX && LA121_0<=RULE_REAL_IDF)||LA121_0==RULE_ID) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // InternalGumboParser.g:6157:4: (lv_e_2_0= ruleExpr )
                    {
                    // InternalGumboParser.g:6157:4: (lv_e_2_0= ruleExpr )
                    // InternalGumboParser.g:6158:5: lv_e_2_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangRetAccess().getEExprParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_e_2_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSlangRetRule());
                      					}
                      					set(
                      						current,
                      						"e",
                      						lv_e_2_0,
                      						"org.sireum.aadl.gumbo.Gumbo.Expr");
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
    // $ANTLR end "ruleSlangRet"


    // $ANTLR start "entryRuleSlangCallSuffix"
    // InternalGumboParser.g:6179:1: entryRuleSlangCallSuffix returns [EObject current=null] : iv_ruleSlangCallSuffix= ruleSlangCallSuffix EOF ;
    public final EObject entryRuleSlangCallSuffix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangCallSuffix = null;


        try {
            // InternalGumboParser.g:6179:56: (iv_ruleSlangCallSuffix= ruleSlangCallSuffix EOF )
            // InternalGumboParser.g:6180:2: iv_ruleSlangCallSuffix= ruleSlangCallSuffix EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlangCallSuffixRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlangCallSuffix=ruleSlangCallSuffix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlangCallSuffix; 
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
    // $ANTLR end "entryRuleSlangCallSuffix"


    // $ANTLR start "ruleSlangCallSuffix"
    // InternalGumboParser.g:6186:1: ruleSlangCallSuffix returns [EObject current=null] : ( ( () ( (lv_ta_1_0= ruleSlangTypeArgs ) ) ( (lv_ca_2_0= ruleSlangCallArgs ) ) ) | ( (lv_ca_3_0= ruleSlangCallArgs ) ) ) ;
    public final EObject ruleSlangCallSuffix() throws RecognitionException {
        EObject current = null;

        EObject lv_ta_1_0 = null;

        EObject lv_ca_2_0 = null;

        EObject lv_ca_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:6192:2: ( ( ( () ( (lv_ta_1_0= ruleSlangTypeArgs ) ) ( (lv_ca_2_0= ruleSlangCallArgs ) ) ) | ( (lv_ca_3_0= ruleSlangCallArgs ) ) ) )
            // InternalGumboParser.g:6193:2: ( ( () ( (lv_ta_1_0= ruleSlangTypeArgs ) ) ( (lv_ca_2_0= ruleSlangCallArgs ) ) ) | ( (lv_ca_3_0= ruleSlangCallArgs ) ) )
            {
            // InternalGumboParser.g:6193:2: ( ( () ( (lv_ta_1_0= ruleSlangTypeArgs ) ) ( (lv_ca_2_0= ruleSlangCallArgs ) ) ) | ( (lv_ca_3_0= ruleSlangCallArgs ) ) )
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==LeftSquareBracket) ) {
                alt122=1;
            }
            else if ( (LA122_0==LeftParenthesis) ) {
                alt122=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 122, 0, input);

                throw nvae;
            }
            switch (alt122) {
                case 1 :
                    // InternalGumboParser.g:6194:3: ( () ( (lv_ta_1_0= ruleSlangTypeArgs ) ) ( (lv_ca_2_0= ruleSlangCallArgs ) ) )
                    {
                    // InternalGumboParser.g:6194:3: ( () ( (lv_ta_1_0= ruleSlangTypeArgs ) ) ( (lv_ca_2_0= ruleSlangCallArgs ) ) )
                    // InternalGumboParser.g:6195:4: () ( (lv_ta_1_0= ruleSlangTypeArgs ) ) ( (lv_ca_2_0= ruleSlangCallArgs ) )
                    {
                    // InternalGumboParser.g:6195:4: ()
                    // InternalGumboParser.g:6196:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangCallSuffixAccess().getSlangCallSuffixAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:6205:4: ( (lv_ta_1_0= ruleSlangTypeArgs ) )
                    // InternalGumboParser.g:6206:5: (lv_ta_1_0= ruleSlangTypeArgs )
                    {
                    // InternalGumboParser.g:6206:5: (lv_ta_1_0= ruleSlangTypeArgs )
                    // InternalGumboParser.g:6207:6: lv_ta_1_0= ruleSlangTypeArgs
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangCallSuffixAccess().getTaSlangTypeArgsParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_35);
                    lv_ta_1_0=ruleSlangTypeArgs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlangCallSuffixRule());
                      						}
                      						set(
                      							current,
                      							"ta",
                      							lv_ta_1_0,
                      							"org.sireum.aadl.gumbo.Gumbo.SlangTypeArgs");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:6224:4: ( (lv_ca_2_0= ruleSlangCallArgs ) )
                    // InternalGumboParser.g:6225:5: (lv_ca_2_0= ruleSlangCallArgs )
                    {
                    // InternalGumboParser.g:6225:5: (lv_ca_2_0= ruleSlangCallArgs )
                    // InternalGumboParser.g:6226:6: lv_ca_2_0= ruleSlangCallArgs
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangCallSuffixAccess().getCaSlangCallArgsParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_ca_2_0=ruleSlangCallArgs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlangCallSuffixRule());
                      						}
                      						set(
                      							current,
                      							"ca",
                      							lv_ca_2_0,
                      							"org.sireum.aadl.gumbo.Gumbo.SlangCallArgs");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:6245:3: ( (lv_ca_3_0= ruleSlangCallArgs ) )
                    {
                    // InternalGumboParser.g:6245:3: ( (lv_ca_3_0= ruleSlangCallArgs ) )
                    // InternalGumboParser.g:6246:4: (lv_ca_3_0= ruleSlangCallArgs )
                    {
                    // InternalGumboParser.g:6246:4: (lv_ca_3_0= ruleSlangCallArgs )
                    // InternalGumboParser.g:6247:5: lv_ca_3_0= ruleSlangCallArgs
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangCallSuffixAccess().getCaSlangCallArgsParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_ca_3_0=ruleSlangCallArgs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSlangCallSuffixRule());
                      					}
                      					set(
                      						current,
                      						"ca",
                      						lv_ca_3_0,
                      						"org.sireum.aadl.gumbo.Gumbo.SlangCallArgs");
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
    // $ANTLR end "ruleSlangCallSuffix"


    // $ANTLR start "entryRuleSlangCallArgs"
    // InternalGumboParser.g:6268:1: entryRuleSlangCallArgs returns [EObject current=null] : iv_ruleSlangCallArgs= ruleSlangCallArgs EOF ;
    public final EObject entryRuleSlangCallArgs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangCallArgs = null;


        try {
            // InternalGumboParser.g:6268:54: (iv_ruleSlangCallArgs= ruleSlangCallArgs EOF )
            // InternalGumboParser.g:6269:2: iv_ruleSlangCallArgs= ruleSlangCallArgs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlangCallArgsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlangCallArgs=ruleSlangCallArgs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlangCallArgs; 
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
    // $ANTLR end "entryRuleSlangCallArgs"


    // $ANTLR start "ruleSlangCallArgs"
    // InternalGumboParser.g:6275:1: ruleSlangCallArgs returns [EObject current=null] : ( () otherlv_1= LeftParenthesis ( ( (lv_arg_2_0= ruleSlangIDExp ) ) (otherlv_3= Comma ( (lv_arg_4_0= ruleSlangIDExp ) ) )* )? otherlv_5= RightParenthesis ) ;
    public final EObject ruleSlangCallArgs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arg_2_0 = null;

        EObject lv_arg_4_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:6281:2: ( ( () otherlv_1= LeftParenthesis ( ( (lv_arg_2_0= ruleSlangIDExp ) ) (otherlv_3= Comma ( (lv_arg_4_0= ruleSlangIDExp ) ) )* )? otherlv_5= RightParenthesis ) )
            // InternalGumboParser.g:6282:2: ( () otherlv_1= LeftParenthesis ( ( (lv_arg_2_0= ruleSlangIDExp ) ) (otherlv_3= Comma ( (lv_arg_4_0= ruleSlangIDExp ) ) )* )? otherlv_5= RightParenthesis )
            {
            // InternalGumboParser.g:6282:2: ( () otherlv_1= LeftParenthesis ( ( (lv_arg_2_0= ruleSlangIDExp ) ) (otherlv_3= Comma ( (lv_arg_4_0= ruleSlangIDExp ) ) )* )? otherlv_5= RightParenthesis )
            // InternalGumboParser.g:6283:3: () otherlv_1= LeftParenthesis ( ( (lv_arg_2_0= ruleSlangIDExp ) ) (otherlv_3= Comma ( (lv_arg_4_0= ruleSlangIDExp ) ) )* )? otherlv_5= RightParenthesis
            {
            // InternalGumboParser.g:6283:3: ()
            // InternalGumboParser.g:6284:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSlangCallArgsAccess().getSlangCallArgsAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSlangCallArgsAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGumboParser.g:6297:3: ( ( (lv_arg_2_0= ruleSlangIDExp ) ) (otherlv_3= Comma ( (lv_arg_4_0= ruleSlangIDExp ) ) )* )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==MustSend||LA124_0==MaySend||LA124_0==NoSend||LA124_0==Some||LA124_0==All||LA124_0==For||LA124_0==In_1||LA124_0==LeftParenthesis||(LA124_0>=Asterisk && LA124_0<=PlusSign)||LA124_0==HyphenMinus||(LA124_0>=F && LA124_0<=T)||LA124_0==LeftCurlyBracket||(LA124_0>=ForAll && LA124_0<=ThereExists)||(LA124_0>=RULE_SLANG_STRING && LA124_0<=RULE_MSTRING)||(LA124_0>=RULE_MSP && LA124_0<=RULE_MSPB)||(LA124_0>=RULE_IMPLIES && LA124_0<=RULE_OP)||(LA124_0>=RULE_HEX && LA124_0<=RULE_REAL_IDF)||LA124_0==RULE_ID) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // InternalGumboParser.g:6298:4: ( (lv_arg_2_0= ruleSlangIDExp ) ) (otherlv_3= Comma ( (lv_arg_4_0= ruleSlangIDExp ) ) )*
                    {
                    // InternalGumboParser.g:6298:4: ( (lv_arg_2_0= ruleSlangIDExp ) )
                    // InternalGumboParser.g:6299:5: (lv_arg_2_0= ruleSlangIDExp )
                    {
                    // InternalGumboParser.g:6299:5: (lv_arg_2_0= ruleSlangIDExp )
                    // InternalGumboParser.g:6300:6: lv_arg_2_0= ruleSlangIDExp
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangCallArgsAccess().getArgSlangIDExpParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_41);
                    lv_arg_2_0=ruleSlangIDExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlangCallArgsRule());
                      						}
                      						add(
                      							current,
                      							"arg",
                      							lv_arg_2_0,
                      							"org.sireum.aadl.gumbo.Gumbo.SlangIDExp");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:6317:4: (otherlv_3= Comma ( (lv_arg_4_0= ruleSlangIDExp ) ) )*
                    loop123:
                    do {
                        int alt123=2;
                        int LA123_0 = input.LA(1);

                        if ( (LA123_0==Comma) ) {
                            alt123=1;
                        }


                        switch (alt123) {
                    	case 1 :
                    	    // InternalGumboParser.g:6318:5: otherlv_3= Comma ( (lv_arg_4_0= ruleSlangIDExp ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getSlangCallArgsAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:6322:5: ( (lv_arg_4_0= ruleSlangIDExp ) )
                    	    // InternalGumboParser.g:6323:6: (lv_arg_4_0= ruleSlangIDExp )
                    	    {
                    	    // InternalGumboParser.g:6323:6: (lv_arg_4_0= ruleSlangIDExp )
                    	    // InternalGumboParser.g:6324:7: lv_arg_4_0= ruleSlangIDExp
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSlangCallArgsAccess().getArgSlangIDExpParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_41);
                    	    lv_arg_4_0=ruleSlangIDExp();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSlangCallArgsRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"arg",
                    	      								lv_arg_4_0,
                    	      								"org.sireum.aadl.gumbo.Gumbo.SlangIDExp");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop123;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getSlangCallArgsAccess().getRightParenthesisKeyword_3());
              		
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
    // $ANTLR end "ruleSlangCallArgs"


    // $ANTLR start "entryRuleSlangIDExp"
    // InternalGumboParser.g:6351:1: entryRuleSlangIDExp returns [EObject current=null] : iv_ruleSlangIDExp= ruleSlangIDExp EOF ;
    public final EObject entryRuleSlangIDExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangIDExp = null;


        try {
            // InternalGumboParser.g:6351:51: (iv_ruleSlangIDExp= ruleSlangIDExp EOF )
            // InternalGumboParser.g:6352:2: iv_ruleSlangIDExp= ruleSlangIDExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlangIDExpRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlangIDExp=ruleSlangIDExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlangIDExp; 
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
    // $ANTLR end "entryRuleSlangIDExp"


    // $ANTLR start "ruleSlangIDExp"
    // InternalGumboParser.g:6358:1: ruleSlangIDExp returns [EObject current=null] : ( ( (lv_e_0_0= ruleExpr ) ) (otherlv_1= ColonEqualsSign ( (lv_e_2_0= ruleExpr ) ) )? ) ;
    public final EObject ruleSlangIDExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_e_0_0 = null;

        EObject lv_e_2_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:6364:2: ( ( ( (lv_e_0_0= ruleExpr ) ) (otherlv_1= ColonEqualsSign ( (lv_e_2_0= ruleExpr ) ) )? ) )
            // InternalGumboParser.g:6365:2: ( ( (lv_e_0_0= ruleExpr ) ) (otherlv_1= ColonEqualsSign ( (lv_e_2_0= ruleExpr ) ) )? )
            {
            // InternalGumboParser.g:6365:2: ( ( (lv_e_0_0= ruleExpr ) ) (otherlv_1= ColonEqualsSign ( (lv_e_2_0= ruleExpr ) ) )? )
            // InternalGumboParser.g:6366:3: ( (lv_e_0_0= ruleExpr ) ) (otherlv_1= ColonEqualsSign ( (lv_e_2_0= ruleExpr ) ) )?
            {
            // InternalGumboParser.g:6366:3: ( (lv_e_0_0= ruleExpr ) )
            // InternalGumboParser.g:6367:4: (lv_e_0_0= ruleExpr )
            {
            // InternalGumboParser.g:6367:4: (lv_e_0_0= ruleExpr )
            // InternalGumboParser.g:6368:5: lv_e_0_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangIDExpAccess().getEExprParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_90);
            lv_e_0_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSlangIDExpRule());
              					}
              					add(
              						current,
              						"e",
              						lv_e_0_0,
              						"org.sireum.aadl.gumbo.Gumbo.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumboParser.g:6385:3: (otherlv_1= ColonEqualsSign ( (lv_e_2_0= ruleExpr ) ) )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==ColonEqualsSign) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // InternalGumboParser.g:6386:4: otherlv_1= ColonEqualsSign ( (lv_e_2_0= ruleExpr ) )
                    {
                    otherlv_1=(Token)match(input,ColonEqualsSign,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getSlangIDExpAccess().getColonEqualsSignKeyword_1_0());
                      			
                    }
                    // InternalGumboParser.g:6390:4: ( (lv_e_2_0= ruleExpr ) )
                    // InternalGumboParser.g:6391:5: (lv_e_2_0= ruleExpr )
                    {
                    // InternalGumboParser.g:6391:5: (lv_e_2_0= ruleExpr )
                    // InternalGumboParser.g:6392:6: lv_e_2_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangIDExpAccess().getEExprParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_e_2_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlangIDExpRule());
                      						}
                      						add(
                      							current,
                      							"e",
                      							lv_e_2_0,
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
    // $ANTLR end "ruleSlangIDExp"


    // $ANTLR start "entryRuleSlangType"
    // InternalGumboParser.g:6414:1: entryRuleSlangType returns [EObject current=null] : iv_ruleSlangType= ruleSlangType EOF ;
    public final EObject entryRuleSlangType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangType = null;


        try {
            // InternalGumboParser.g:6414:50: (iv_ruleSlangType= ruleSlangType EOF )
            // InternalGumboParser.g:6415:2: iv_ruleSlangType= ruleSlangType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlangTypeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlangType=ruleSlangType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlangType; 
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
    // $ANTLR end "entryRuleSlangType"


    // $ANTLR start "ruleSlangType"
    // InternalGumboParser.g:6421:1: ruleSlangType returns [EObject current=null] : this_SlangBaseType_0= ruleSlangBaseType ;
    public final EObject ruleSlangType() throws RecognitionException {
        EObject current = null;

        EObject this_SlangBaseType_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:6427:2: (this_SlangBaseType_0= ruleSlangBaseType )
            // InternalGumboParser.g:6428:2: this_SlangBaseType_0= ruleSlangBaseType
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getSlangTypeAccess().getSlangBaseTypeParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_SlangBaseType_0=ruleSlangBaseType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_SlangBaseType_0;
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
    // $ANTLR end "ruleSlangType"


    // $ANTLR start "entryRuleSlangBaseType"
    // InternalGumboParser.g:6442:1: entryRuleSlangBaseType returns [EObject current=null] : iv_ruleSlangBaseType= ruleSlangBaseType EOF ;
    public final EObject entryRuleSlangBaseType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangBaseType = null;


        try {
            // InternalGumboParser.g:6442:54: (iv_ruleSlangBaseType= ruleSlangBaseType EOF )
            // InternalGumboParser.g:6443:2: iv_ruleSlangBaseType= ruleSlangBaseType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlangBaseTypeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlangBaseType=ruleSlangBaseType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlangBaseType; 
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
    // $ANTLR end "entryRuleSlangBaseType"


    // $ANTLR start "ruleSlangBaseType"
    // InternalGumboParser.g:6449:1: ruleSlangBaseType returns [EObject current=null] : ( ( ruleQCREF ) ) ;
    public final EObject ruleSlangBaseType() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalGumboParser.g:6455:2: ( ( ( ruleQCREF ) ) )
            // InternalGumboParser.g:6456:2: ( ( ruleQCREF ) )
            {
            // InternalGumboParser.g:6456:2: ( ( ruleQCREF ) )
            // InternalGumboParser.g:6457:3: ( ruleQCREF )
            {
            // InternalGumboParser.g:6457:3: ( ruleQCREF )
            // InternalGumboParser.g:6458:4: ruleQCREF
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getSlangBaseTypeRule());
              				}
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getSlangBaseTypeAccess().getTypeNameDataSubcomponentTypeCrossReference_0());
              			
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
    // $ANTLR end "ruleSlangBaseType"


    // $ANTLR start "entryRuleSlangTypeArgs"
    // InternalGumboParser.g:6478:1: entryRuleSlangTypeArgs returns [EObject current=null] : iv_ruleSlangTypeArgs= ruleSlangTypeArgs EOF ;
    public final EObject entryRuleSlangTypeArgs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangTypeArgs = null;


        try {
            // InternalGumboParser.g:6478:54: (iv_ruleSlangTypeArgs= ruleSlangTypeArgs EOF )
            // InternalGumboParser.g:6479:2: iv_ruleSlangTypeArgs= ruleSlangTypeArgs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlangTypeArgsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlangTypeArgs=ruleSlangTypeArgs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlangTypeArgs; 
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
    // $ANTLR end "entryRuleSlangTypeArgs"


    // $ANTLR start "ruleSlangTypeArgs"
    // InternalGumboParser.g:6485:1: ruleSlangTypeArgs returns [EObject current=null] : (otherlv_0= LeftSquareBracket ( (lv_types_1_0= ruleSlangType ) ) (otherlv_2= Comma ( (lv_types_3_0= ruleSlangType ) ) )* otherlv_4= RightSquareBracket ) ;
    public final EObject ruleSlangTypeArgs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_types_1_0 = null;

        EObject lv_types_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:6491:2: ( (otherlv_0= LeftSquareBracket ( (lv_types_1_0= ruleSlangType ) ) (otherlv_2= Comma ( (lv_types_3_0= ruleSlangType ) ) )* otherlv_4= RightSquareBracket ) )
            // InternalGumboParser.g:6492:2: (otherlv_0= LeftSquareBracket ( (lv_types_1_0= ruleSlangType ) ) (otherlv_2= Comma ( (lv_types_3_0= ruleSlangType ) ) )* otherlv_4= RightSquareBracket )
            {
            // InternalGumboParser.g:6492:2: (otherlv_0= LeftSquareBracket ( (lv_types_1_0= ruleSlangType ) ) (otherlv_2= Comma ( (lv_types_3_0= ruleSlangType ) ) )* otherlv_4= RightSquareBracket )
            // InternalGumboParser.g:6493:3: otherlv_0= LeftSquareBracket ( (lv_types_1_0= ruleSlangType ) ) (otherlv_2= Comma ( (lv_types_3_0= ruleSlangType ) ) )* otherlv_4= RightSquareBracket
            {
            otherlv_0=(Token)match(input,LeftSquareBracket,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangTypeArgsAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalGumboParser.g:6497:3: ( (lv_types_1_0= ruleSlangType ) )
            // InternalGumboParser.g:6498:4: (lv_types_1_0= ruleSlangType )
            {
            // InternalGumboParser.g:6498:4: (lv_types_1_0= ruleSlangType )
            // InternalGumboParser.g:6499:5: lv_types_1_0= ruleSlangType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangTypeArgsAccess().getTypesSlangTypeParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_45);
            lv_types_1_0=ruleSlangType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSlangTypeArgsRule());
              					}
              					add(
              						current,
              						"types",
              						lv_types_1_0,
              						"org.sireum.aadl.gumbo.Gumbo.SlangType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumboParser.g:6516:3: (otherlv_2= Comma ( (lv_types_3_0= ruleSlangType ) ) )*
            loop126:
            do {
                int alt126=2;
                int LA126_0 = input.LA(1);

                if ( (LA126_0==Comma) ) {
                    alt126=1;
                }


                switch (alt126) {
            	case 1 :
            	    // InternalGumboParser.g:6517:4: otherlv_2= Comma ( (lv_types_3_0= ruleSlangType ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FollowSets000.FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSlangTypeArgsAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalGumboParser.g:6521:4: ( (lv_types_3_0= ruleSlangType ) )
            	    // InternalGumboParser.g:6522:5: (lv_types_3_0= ruleSlangType )
            	    {
            	    // InternalGumboParser.g:6522:5: (lv_types_3_0= ruleSlangType )
            	    // InternalGumboParser.g:6523:6: lv_types_3_0= ruleSlangType
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSlangTypeArgsAccess().getTypesSlangTypeParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_45);
            	    lv_types_3_0=ruleSlangType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSlangTypeArgsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"types",
            	      							lv_types_3_0,
            	      							"org.sireum.aadl.gumbo.Gumbo.SlangType");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop126;
                }
            } while (true);

            otherlv_4=(Token)match(input,RightSquareBracket,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getSlangTypeArgsAccess().getRightSquareBracketKeyword_3());
              		
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
    // $ANTLR end "ruleSlangTypeArgs"


    // $ANTLR start "entryRuleSlangLit"
    // InternalGumboParser.g:6549:1: entryRuleSlangLit returns [EObject current=null] : iv_ruleSlangLit= ruleSlangLit EOF ;
    public final EObject entryRuleSlangLit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangLit = null;


        try {
            // InternalGumboParser.g:6549:49: (iv_ruleSlangLit= ruleSlangLit EOF )
            // InternalGumboParser.g:6550:2: iv_ruleSlangLit= ruleSlangLit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlangLitRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlangLit=ruleSlangLit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlangLit; 
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
    // $ANTLR end "entryRuleSlangLit"


    // $ANTLR start "ruleSlangLit"
    // InternalGumboParser.g:6556:1: ruleSlangLit returns [EObject current=null] : ( ( () ( ( (lv_value_1_1= T | lv_value_1_2= F ) ) ) ) | ( () ( (lv_value_3_0= RULE_INTEGER_LIT ) ) ) | ( () ( (lv_value_5_0= RULE_INT_IDF ) ) ) | ( () ( (lv_value_7_0= RULE_HEX ) ) ) | ( () ( (lv_value_9_0= RULE_BIN ) ) ) | ( () ( (lv_value_11_0= RULE_REAL_LIT ) ) ) | ( () ( (lv_value_13_0= RULE_SLANG_STRING ) ) ) | ( () ( (lv_value_15_0= RULE_REAL_IDF ) ) ) | ( () ( (lv_value_17_0= RULE_MSTRING ) ) ) ) ;
    public final EObject ruleSlangLit() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_1=null;
        Token lv_value_1_2=null;
        Token lv_value_3_0=null;
        Token lv_value_5_0=null;
        Token lv_value_7_0=null;
        Token lv_value_9_0=null;
        Token lv_value_11_0=null;
        Token lv_value_13_0=null;
        Token lv_value_15_0=null;
        Token lv_value_17_0=null;


        	enterRule();

        try {
            // InternalGumboParser.g:6562:2: ( ( ( () ( ( (lv_value_1_1= T | lv_value_1_2= F ) ) ) ) | ( () ( (lv_value_3_0= RULE_INTEGER_LIT ) ) ) | ( () ( (lv_value_5_0= RULE_INT_IDF ) ) ) | ( () ( (lv_value_7_0= RULE_HEX ) ) ) | ( () ( (lv_value_9_0= RULE_BIN ) ) ) | ( () ( (lv_value_11_0= RULE_REAL_LIT ) ) ) | ( () ( (lv_value_13_0= RULE_SLANG_STRING ) ) ) | ( () ( (lv_value_15_0= RULE_REAL_IDF ) ) ) | ( () ( (lv_value_17_0= RULE_MSTRING ) ) ) ) )
            // InternalGumboParser.g:6563:2: ( ( () ( ( (lv_value_1_1= T | lv_value_1_2= F ) ) ) ) | ( () ( (lv_value_3_0= RULE_INTEGER_LIT ) ) ) | ( () ( (lv_value_5_0= RULE_INT_IDF ) ) ) | ( () ( (lv_value_7_0= RULE_HEX ) ) ) | ( () ( (lv_value_9_0= RULE_BIN ) ) ) | ( () ( (lv_value_11_0= RULE_REAL_LIT ) ) ) | ( () ( (lv_value_13_0= RULE_SLANG_STRING ) ) ) | ( () ( (lv_value_15_0= RULE_REAL_IDF ) ) ) | ( () ( (lv_value_17_0= RULE_MSTRING ) ) ) )
            {
            // InternalGumboParser.g:6563:2: ( ( () ( ( (lv_value_1_1= T | lv_value_1_2= F ) ) ) ) | ( () ( (lv_value_3_0= RULE_INTEGER_LIT ) ) ) | ( () ( (lv_value_5_0= RULE_INT_IDF ) ) ) | ( () ( (lv_value_7_0= RULE_HEX ) ) ) | ( () ( (lv_value_9_0= RULE_BIN ) ) ) | ( () ( (lv_value_11_0= RULE_REAL_LIT ) ) ) | ( () ( (lv_value_13_0= RULE_SLANG_STRING ) ) ) | ( () ( (lv_value_15_0= RULE_REAL_IDF ) ) ) | ( () ( (lv_value_17_0= RULE_MSTRING ) ) ) )
            int alt128=9;
            switch ( input.LA(1) ) {
            case F:
            case T:
                {
                alt128=1;
                }
                break;
            case RULE_INTEGER_LIT:
                {
                alt128=2;
                }
                break;
            case RULE_INT_IDF:
                {
                alt128=3;
                }
                break;
            case RULE_HEX:
                {
                alt128=4;
                }
                break;
            case RULE_BIN:
                {
                alt128=5;
                }
                break;
            case RULE_REAL_LIT:
                {
                alt128=6;
                }
                break;
            case RULE_SLANG_STRING:
                {
                alt128=7;
                }
                break;
            case RULE_REAL_IDF:
                {
                alt128=8;
                }
                break;
            case RULE_MSTRING:
                {
                alt128=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 128, 0, input);

                throw nvae;
            }

            switch (alt128) {
                case 1 :
                    // InternalGumboParser.g:6564:3: ( () ( ( (lv_value_1_1= T | lv_value_1_2= F ) ) ) )
                    {
                    // InternalGumboParser.g:6564:3: ( () ( ( (lv_value_1_1= T | lv_value_1_2= F ) ) ) )
                    // InternalGumboParser.g:6565:4: () ( ( (lv_value_1_1= T | lv_value_1_2= F ) ) )
                    {
                    // InternalGumboParser.g:6565:4: ()
                    // InternalGumboParser.g:6566:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangLitAccess().getBooleanLitAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:6575:4: ( ( (lv_value_1_1= T | lv_value_1_2= F ) ) )
                    // InternalGumboParser.g:6576:5: ( (lv_value_1_1= T | lv_value_1_2= F ) )
                    {
                    // InternalGumboParser.g:6576:5: ( (lv_value_1_1= T | lv_value_1_2= F ) )
                    // InternalGumboParser.g:6577:6: (lv_value_1_1= T | lv_value_1_2= F )
                    {
                    // InternalGumboParser.g:6577:6: (lv_value_1_1= T | lv_value_1_2= F )
                    int alt127=2;
                    int LA127_0 = input.LA(1);

                    if ( (LA127_0==T) ) {
                        alt127=1;
                    }
                    else if ( (LA127_0==F) ) {
                        alt127=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 127, 0, input);

                        throw nvae;
                    }
                    switch (alt127) {
                        case 1 :
                            // InternalGumboParser.g:6578:7: lv_value_1_1= T
                            {
                            lv_value_1_1=(Token)match(input,T,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_value_1_1, grammarAccess.getSlangLitAccess().getValueTKeyword_0_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getSlangLitRule());
                              							}
                              							setWithLastConsumed(current, "value", lv_value_1_1, null);
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalGumboParser.g:6589:7: lv_value_1_2= F
                            {
                            lv_value_1_2=(Token)match(input,F,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_value_1_2, grammarAccess.getSlangLitAccess().getValueFKeyword_0_1_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getSlangLitRule());
                              							}
                              							setWithLastConsumed(current, "value", lv_value_1_2, null);
                              						
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:6604:3: ( () ( (lv_value_3_0= RULE_INTEGER_LIT ) ) )
                    {
                    // InternalGumboParser.g:6604:3: ( () ( (lv_value_3_0= RULE_INTEGER_LIT ) ) )
                    // InternalGumboParser.g:6605:4: () ( (lv_value_3_0= RULE_INTEGER_LIT ) )
                    {
                    // InternalGumboParser.g:6605:4: ()
                    // InternalGumboParser.g:6606:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangLitAccess().getIntegerLitAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:6615:4: ( (lv_value_3_0= RULE_INTEGER_LIT ) )
                    // InternalGumboParser.g:6616:5: (lv_value_3_0= RULE_INTEGER_LIT )
                    {
                    // InternalGumboParser.g:6616:5: (lv_value_3_0= RULE_INTEGER_LIT )
                    // InternalGumboParser.g:6617:6: lv_value_3_0= RULE_INTEGER_LIT
                    {
                    lv_value_3_0=(Token)match(input,RULE_INTEGER_LIT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_3_0, grammarAccess.getSlangLitAccess().getValueINTEGER_LITTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSlangLitRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_3_0,
                      							"org.osate.xtext.aadl2.properties.Properties.INTEGER_LIT");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGumboParser.g:6635:3: ( () ( (lv_value_5_0= RULE_INT_IDF ) ) )
                    {
                    // InternalGumboParser.g:6635:3: ( () ( (lv_value_5_0= RULE_INT_IDF ) ) )
                    // InternalGumboParser.g:6636:4: () ( (lv_value_5_0= RULE_INT_IDF ) )
                    {
                    // InternalGumboParser.g:6636:4: ()
                    // InternalGumboParser.g:6637:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangLitAccess().getIntIdfLitAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:6646:4: ( (lv_value_5_0= RULE_INT_IDF ) )
                    // InternalGumboParser.g:6647:5: (lv_value_5_0= RULE_INT_IDF )
                    {
                    // InternalGumboParser.g:6647:5: (lv_value_5_0= RULE_INT_IDF )
                    // InternalGumboParser.g:6648:6: lv_value_5_0= RULE_INT_IDF
                    {
                    lv_value_5_0=(Token)match(input,RULE_INT_IDF,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_5_0, grammarAccess.getSlangLitAccess().getValueINT_IDFTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSlangLitRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_5_0,
                      							"org.sireum.aadl.gumbo.Gumbo.INT_IDF");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalGumboParser.g:6666:3: ( () ( (lv_value_7_0= RULE_HEX ) ) )
                    {
                    // InternalGumboParser.g:6666:3: ( () ( (lv_value_7_0= RULE_HEX ) ) )
                    // InternalGumboParser.g:6667:4: () ( (lv_value_7_0= RULE_HEX ) )
                    {
                    // InternalGumboParser.g:6667:4: ()
                    // InternalGumboParser.g:6668:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangLitAccess().getHexLitAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:6677:4: ( (lv_value_7_0= RULE_HEX ) )
                    // InternalGumboParser.g:6678:5: (lv_value_7_0= RULE_HEX )
                    {
                    // InternalGumboParser.g:6678:5: (lv_value_7_0= RULE_HEX )
                    // InternalGumboParser.g:6679:6: lv_value_7_0= RULE_HEX
                    {
                    lv_value_7_0=(Token)match(input,RULE_HEX,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_7_0, grammarAccess.getSlangLitAccess().getValueHEXTerminalRuleCall_3_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSlangLitRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_7_0,
                      							"org.sireum.aadl.gumbo.Gumbo.HEX");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalGumboParser.g:6697:3: ( () ( (lv_value_9_0= RULE_BIN ) ) )
                    {
                    // InternalGumboParser.g:6697:3: ( () ( (lv_value_9_0= RULE_BIN ) ) )
                    // InternalGumboParser.g:6698:4: () ( (lv_value_9_0= RULE_BIN ) )
                    {
                    // InternalGumboParser.g:6698:4: ()
                    // InternalGumboParser.g:6699:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangLitAccess().getBinLitAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:6708:4: ( (lv_value_9_0= RULE_BIN ) )
                    // InternalGumboParser.g:6709:5: (lv_value_9_0= RULE_BIN )
                    {
                    // InternalGumboParser.g:6709:5: (lv_value_9_0= RULE_BIN )
                    // InternalGumboParser.g:6710:6: lv_value_9_0= RULE_BIN
                    {
                    lv_value_9_0=(Token)match(input,RULE_BIN,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_9_0, grammarAccess.getSlangLitAccess().getValueBINTerminalRuleCall_4_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSlangLitRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_9_0,
                      							"org.sireum.aadl.gumbo.Gumbo.BIN");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalGumboParser.g:6728:3: ( () ( (lv_value_11_0= RULE_REAL_LIT ) ) )
                    {
                    // InternalGumboParser.g:6728:3: ( () ( (lv_value_11_0= RULE_REAL_LIT ) ) )
                    // InternalGumboParser.g:6729:4: () ( (lv_value_11_0= RULE_REAL_LIT ) )
                    {
                    // InternalGumboParser.g:6729:4: ()
                    // InternalGumboParser.g:6730:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangLitAccess().getRealLitAction_5_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:6739:4: ( (lv_value_11_0= RULE_REAL_LIT ) )
                    // InternalGumboParser.g:6740:5: (lv_value_11_0= RULE_REAL_LIT )
                    {
                    // InternalGumboParser.g:6740:5: (lv_value_11_0= RULE_REAL_LIT )
                    // InternalGumboParser.g:6741:6: lv_value_11_0= RULE_REAL_LIT
                    {
                    lv_value_11_0=(Token)match(input,RULE_REAL_LIT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_11_0, grammarAccess.getSlangLitAccess().getValueREAL_LITTerminalRuleCall_5_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSlangLitRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_11_0,
                      							"org.osate.xtext.aadl2.properties.Properties.REAL_LIT");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalGumboParser.g:6759:3: ( () ( (lv_value_13_0= RULE_SLANG_STRING ) ) )
                    {
                    // InternalGumboParser.g:6759:3: ( () ( (lv_value_13_0= RULE_SLANG_STRING ) ) )
                    // InternalGumboParser.g:6760:4: () ( (lv_value_13_0= RULE_SLANG_STRING ) )
                    {
                    // InternalGumboParser.g:6760:4: ()
                    // InternalGumboParser.g:6761:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangLitAccess().getSlangStringLitAction_6_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:6770:4: ( (lv_value_13_0= RULE_SLANG_STRING ) )
                    // InternalGumboParser.g:6771:5: (lv_value_13_0= RULE_SLANG_STRING )
                    {
                    // InternalGumboParser.g:6771:5: (lv_value_13_0= RULE_SLANG_STRING )
                    // InternalGumboParser.g:6772:6: lv_value_13_0= RULE_SLANG_STRING
                    {
                    lv_value_13_0=(Token)match(input,RULE_SLANG_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_13_0, grammarAccess.getSlangLitAccess().getValueSLANG_STRINGTerminalRuleCall_6_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSlangLitRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_13_0,
                      							"org.sireum.aadl.gumbo.Gumbo.SLANG_STRING");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalGumboParser.g:6790:3: ( () ( (lv_value_15_0= RULE_REAL_IDF ) ) )
                    {
                    // InternalGumboParser.g:6790:3: ( () ( (lv_value_15_0= RULE_REAL_IDF ) ) )
                    // InternalGumboParser.g:6791:4: () ( (lv_value_15_0= RULE_REAL_IDF ) )
                    {
                    // InternalGumboParser.g:6791:4: ()
                    // InternalGumboParser.g:6792:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangLitAccess().getRealIdfLitAction_7_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:6801:4: ( (lv_value_15_0= RULE_REAL_IDF ) )
                    // InternalGumboParser.g:6802:5: (lv_value_15_0= RULE_REAL_IDF )
                    {
                    // InternalGumboParser.g:6802:5: (lv_value_15_0= RULE_REAL_IDF )
                    // InternalGumboParser.g:6803:6: lv_value_15_0= RULE_REAL_IDF
                    {
                    lv_value_15_0=(Token)match(input,RULE_REAL_IDF,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_15_0, grammarAccess.getSlangLitAccess().getValueREAL_IDFTerminalRuleCall_7_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSlangLitRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_15_0,
                      							"org.sireum.aadl.gumbo.Gumbo.REAL_IDF");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalGumboParser.g:6821:3: ( () ( (lv_value_17_0= RULE_MSTRING ) ) )
                    {
                    // InternalGumboParser.g:6821:3: ( () ( (lv_value_17_0= RULE_MSTRING ) ) )
                    // InternalGumboParser.g:6822:4: () ( (lv_value_17_0= RULE_MSTRING ) )
                    {
                    // InternalGumboParser.g:6822:4: ()
                    // InternalGumboParser.g:6823:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangLitAccess().getMStringLitAction_8_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:6832:4: ( (lv_value_17_0= RULE_MSTRING ) )
                    // InternalGumboParser.g:6833:5: (lv_value_17_0= RULE_MSTRING )
                    {
                    // InternalGumboParser.g:6833:5: (lv_value_17_0= RULE_MSTRING )
                    // InternalGumboParser.g:6834:6: lv_value_17_0= RULE_MSTRING
                    {
                    lv_value_17_0=(Token)match(input,RULE_MSTRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_17_0, grammarAccess.getSlangLitAccess().getValueMSTRINGTerminalRuleCall_8_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSlangLitRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_17_0,
                      							"org.sireum.aadl.gumbo.Gumbo.MSTRING");
                      					
                    }

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
    // $ANTLR end "ruleSlangLit"


    // $ANTLR start "entryRuleSlangInterp"
    // InternalGumboParser.g:6855:1: entryRuleSlangInterp returns [EObject current=null] : iv_ruleSlangInterp= ruleSlangInterp EOF ;
    public final EObject entryRuleSlangInterp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangInterp = null;


        try {
            // InternalGumboParser.g:6855:52: (iv_ruleSlangInterp= ruleSlangInterp EOF )
            // InternalGumboParser.g:6856:2: iv_ruleSlangInterp= ruleSlangInterp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlangInterpRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlangInterp=ruleSlangInterp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlangInterp; 
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
    // $ANTLR end "entryRuleSlangInterp"


    // $ANTLR start "ruleSlangInterp"
    // InternalGumboParser.g:6862:1: ruleSlangInterp returns [EObject current=null] : ( ( () ( (lv_msp_1_0= RULE_MSP ) ) ) | ( () ( (lv_sli_3_0= RULE_SLI ) ) ) | ( () ( (lv_mspb_5_0= RULE_MSPB ) ) ( (lv_minterp_6_0= ruleSlangMInterp ) ) ) ) ;
    public final EObject ruleSlangInterp() throws RecognitionException {
        EObject current = null;

        Token lv_msp_1_0=null;
        Token lv_sli_3_0=null;
        Token lv_mspb_5_0=null;
        EObject lv_minterp_6_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:6868:2: ( ( ( () ( (lv_msp_1_0= RULE_MSP ) ) ) | ( () ( (lv_sli_3_0= RULE_SLI ) ) ) | ( () ( (lv_mspb_5_0= RULE_MSPB ) ) ( (lv_minterp_6_0= ruleSlangMInterp ) ) ) ) )
            // InternalGumboParser.g:6869:2: ( ( () ( (lv_msp_1_0= RULE_MSP ) ) ) | ( () ( (lv_sli_3_0= RULE_SLI ) ) ) | ( () ( (lv_mspb_5_0= RULE_MSPB ) ) ( (lv_minterp_6_0= ruleSlangMInterp ) ) ) )
            {
            // InternalGumboParser.g:6869:2: ( ( () ( (lv_msp_1_0= RULE_MSP ) ) ) | ( () ( (lv_sli_3_0= RULE_SLI ) ) ) | ( () ( (lv_mspb_5_0= RULE_MSPB ) ) ( (lv_minterp_6_0= ruleSlangMInterp ) ) ) )
            int alt129=3;
            switch ( input.LA(1) ) {
            case RULE_MSP:
                {
                alt129=1;
                }
                break;
            case RULE_SLI:
                {
                alt129=2;
                }
                break;
            case RULE_MSPB:
                {
                alt129=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 129, 0, input);

                throw nvae;
            }

            switch (alt129) {
                case 1 :
                    // InternalGumboParser.g:6870:3: ( () ( (lv_msp_1_0= RULE_MSP ) ) )
                    {
                    // InternalGumboParser.g:6870:3: ( () ( (lv_msp_1_0= RULE_MSP ) ) )
                    // InternalGumboParser.g:6871:4: () ( (lv_msp_1_0= RULE_MSP ) )
                    {
                    // InternalGumboParser.g:6871:4: ()
                    // InternalGumboParser.g:6872:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangInterpAccess().getSlangMspInterpAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:6881:4: ( (lv_msp_1_0= RULE_MSP ) )
                    // InternalGumboParser.g:6882:5: (lv_msp_1_0= RULE_MSP )
                    {
                    // InternalGumboParser.g:6882:5: (lv_msp_1_0= RULE_MSP )
                    // InternalGumboParser.g:6883:6: lv_msp_1_0= RULE_MSP
                    {
                    lv_msp_1_0=(Token)match(input,RULE_MSP,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_msp_1_0, grammarAccess.getSlangInterpAccess().getMspMSPTerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSlangInterpRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"msp",
                      							lv_msp_1_0,
                      							"org.sireum.aadl.gumbo.Gumbo.MSP");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:6901:3: ( () ( (lv_sli_3_0= RULE_SLI ) ) )
                    {
                    // InternalGumboParser.g:6901:3: ( () ( (lv_sli_3_0= RULE_SLI ) ) )
                    // InternalGumboParser.g:6902:4: () ( (lv_sli_3_0= RULE_SLI ) )
                    {
                    // InternalGumboParser.g:6902:4: ()
                    // InternalGumboParser.g:6903:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangInterpAccess().getSlangLiteralInterpAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:6912:4: ( (lv_sli_3_0= RULE_SLI ) )
                    // InternalGumboParser.g:6913:5: (lv_sli_3_0= RULE_SLI )
                    {
                    // InternalGumboParser.g:6913:5: (lv_sli_3_0= RULE_SLI )
                    // InternalGumboParser.g:6914:6: lv_sli_3_0= RULE_SLI
                    {
                    lv_sli_3_0=(Token)match(input,RULE_SLI,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_sli_3_0, grammarAccess.getSlangInterpAccess().getSliSLITerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSlangInterpRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"sli",
                      							lv_sli_3_0,
                      							"org.sireum.aadl.gumbo.Gumbo.SLI");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGumboParser.g:6932:3: ( () ( (lv_mspb_5_0= RULE_MSPB ) ) ( (lv_minterp_6_0= ruleSlangMInterp ) ) )
                    {
                    // InternalGumboParser.g:6932:3: ( () ( (lv_mspb_5_0= RULE_MSPB ) ) ( (lv_minterp_6_0= ruleSlangMInterp ) ) )
                    // InternalGumboParser.g:6933:4: () ( (lv_mspb_5_0= RULE_MSPB ) ) ( (lv_minterp_6_0= ruleSlangMInterp ) )
                    {
                    // InternalGumboParser.g:6933:4: ()
                    // InternalGumboParser.g:6934:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangInterpAccess().getSlangMspbInterpAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:6943:4: ( (lv_mspb_5_0= RULE_MSPB ) )
                    // InternalGumboParser.g:6944:5: (lv_mspb_5_0= RULE_MSPB )
                    {
                    // InternalGumboParser.g:6944:5: (lv_mspb_5_0= RULE_MSPB )
                    // InternalGumboParser.g:6945:6: lv_mspb_5_0= RULE_MSPB
                    {
                    lv_mspb_5_0=(Token)match(input,RULE_MSPB,FollowSets000.FOLLOW_56); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_mspb_5_0, grammarAccess.getSlangInterpAccess().getMspbMSPBTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSlangInterpRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"mspb",
                      							lv_mspb_5_0,
                      							"org.sireum.aadl.gumbo.Gumbo.MSPB");
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:6961:4: ( (lv_minterp_6_0= ruleSlangMInterp ) )
                    // InternalGumboParser.g:6962:5: (lv_minterp_6_0= ruleSlangMInterp )
                    {
                    // InternalGumboParser.g:6962:5: (lv_minterp_6_0= ruleSlangMInterp )
                    // InternalGumboParser.g:6963:6: lv_minterp_6_0= ruleSlangMInterp
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangInterpAccess().getMinterpSlangMInterpParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_minterp_6_0=ruleSlangMInterp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlangInterpRule());
                      						}
                      						set(
                      							current,
                      							"minterp",
                      							lv_minterp_6_0,
                      							"org.sireum.aadl.gumbo.Gumbo.SlangMInterp");
                      						afterParserOrEnumRuleCall();
                      					
                    }

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
    // $ANTLR end "ruleSlangInterp"


    // $ANTLR start "entryRuleSlangMInterp"
    // InternalGumboParser.g:6985:1: entryRuleSlangMInterp returns [EObject current=null] : iv_ruleSlangMInterp= ruleSlangMInterp EOF ;
    public final EObject entryRuleSlangMInterp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangMInterp = null;


        try {
            // InternalGumboParser.g:6985:53: (iv_ruleSlangMInterp= ruleSlangMInterp EOF )
            // InternalGumboParser.g:6986:2: iv_ruleSlangMInterp= ruleSlangMInterp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlangMInterpRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlangMInterp=ruleSlangMInterp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlangMInterp; 
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
    // $ANTLR end "entryRuleSlangMInterp"


    // $ANTLR start "ruleSlangMInterp"
    // InternalGumboParser.g:6992:1: ruleSlangMInterp returns [EObject current=null] : (otherlv_0= LeftCurlyBracket ( (lv_e_1_0= ruleExpr ) ) otherlv_2= RightCurlyBracket ( (this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) ) ) | this_MSPE_5= RULE_MSPE ) ) ;
    public final EObject ruleSlangMInterp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_MSPM_3=null;
        Token this_MSPE_5=null;
        EObject lv_e_1_0 = null;

        EObject lv_m_4_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:6998:2: ( (otherlv_0= LeftCurlyBracket ( (lv_e_1_0= ruleExpr ) ) otherlv_2= RightCurlyBracket ( (this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) ) ) | this_MSPE_5= RULE_MSPE ) ) )
            // InternalGumboParser.g:6999:2: (otherlv_0= LeftCurlyBracket ( (lv_e_1_0= ruleExpr ) ) otherlv_2= RightCurlyBracket ( (this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) ) ) | this_MSPE_5= RULE_MSPE ) )
            {
            // InternalGumboParser.g:6999:2: (otherlv_0= LeftCurlyBracket ( (lv_e_1_0= ruleExpr ) ) otherlv_2= RightCurlyBracket ( (this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) ) ) | this_MSPE_5= RULE_MSPE ) )
            // InternalGumboParser.g:7000:3: otherlv_0= LeftCurlyBracket ( (lv_e_1_0= ruleExpr ) ) otherlv_2= RightCurlyBracket ( (this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) ) ) | this_MSPE_5= RULE_MSPE )
            {
            otherlv_0=(Token)match(input,LeftCurlyBracket,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangMInterpAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalGumboParser.g:7004:3: ( (lv_e_1_0= ruleExpr ) )
            // InternalGumboParser.g:7005:4: (lv_e_1_0= ruleExpr )
            {
            // InternalGumboParser.g:7005:4: (lv_e_1_0= ruleExpr )
            // InternalGumboParser.g:7006:5: lv_e_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangMInterpAccess().getEExprParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_80);
            lv_e_1_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSlangMInterpRule());
              					}
              					set(
              						current,
              						"e",
              						lv_e_1_0,
              						"org.sireum.aadl.gumbo.Gumbo.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,RightCurlyBracket,FollowSets000.FOLLOW_91); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSlangMInterpAccess().getRightCurlyBracketKeyword_2());
              		
            }
            // InternalGumboParser.g:7027:3: ( (this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) ) ) | this_MSPE_5= RULE_MSPE )
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==RULE_MSPM) ) {
                alt130=1;
            }
            else if ( (LA130_0==RULE_MSPE) ) {
                alt130=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 130, 0, input);

                throw nvae;
            }
            switch (alt130) {
                case 1 :
                    // InternalGumboParser.g:7028:4: (this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) ) )
                    {
                    // InternalGumboParser.g:7028:4: (this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) ) )
                    // InternalGumboParser.g:7029:5: this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) )
                    {
                    this_MSPM_3=(Token)match(input,RULE_MSPM,FollowSets000.FOLLOW_56); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_MSPM_3, grammarAccess.getSlangMInterpAccess().getMSPMTerminalRuleCall_3_0_0());
                      				
                    }
                    // InternalGumboParser.g:7033:5: ( (lv_m_4_0= ruleSlangMInterp ) )
                    // InternalGumboParser.g:7034:6: (lv_m_4_0= ruleSlangMInterp )
                    {
                    // InternalGumboParser.g:7034:6: (lv_m_4_0= ruleSlangMInterp )
                    // InternalGumboParser.g:7035:7: lv_m_4_0= ruleSlangMInterp
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSlangMInterpAccess().getMSlangMInterpParserRuleCall_3_0_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_m_4_0=ruleSlangMInterp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSlangMInterpRule());
                      							}
                      							set(
                      								current,
                      								"m",
                      								lv_m_4_0,
                      								"org.sireum.aadl.gumbo.Gumbo.SlangMInterp");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:7054:4: this_MSPE_5= RULE_MSPE
                    {
                    this_MSPE_5=(Token)match(input,RULE_MSPE,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_MSPE_5, grammarAccess.getSlangMInterpAccess().getMSPETerminalRuleCall_3_1());
                      			
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
    // $ANTLR end "ruleSlangMInterp"


    // $ANTLR start "entryRuleOperator"
    // InternalGumboParser.g:7063:1: entryRuleOperator returns [String current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final String entryRuleOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperator = null;


        try {
            // InternalGumboParser.g:7063:48: (iv_ruleOperator= ruleOperator EOF )
            // InternalGumboParser.g:7064:2: iv_ruleOperator= ruleOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperatorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOperator=ruleOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperator.getText(); 
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
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // InternalGumboParser.g:7070:1: ruleOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_OP_0= RULE_OP | this_PlusMinus_1= rulePlusMinus | this_STAR_2= ruleSTAR | this_IMPLIES_3= RULE_IMPLIES | this_SIMPLIES_4= RULE_SIMPLIES ) ;
    public final AntlrDatatypeRuleToken ruleOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_OP_0=null;
        Token this_IMPLIES_3=null;
        Token this_SIMPLIES_4=null;
        AntlrDatatypeRuleToken this_PlusMinus_1 = null;

        AntlrDatatypeRuleToken this_STAR_2 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:7076:2: ( (this_OP_0= RULE_OP | this_PlusMinus_1= rulePlusMinus | this_STAR_2= ruleSTAR | this_IMPLIES_3= RULE_IMPLIES | this_SIMPLIES_4= RULE_SIMPLIES ) )
            // InternalGumboParser.g:7077:2: (this_OP_0= RULE_OP | this_PlusMinus_1= rulePlusMinus | this_STAR_2= ruleSTAR | this_IMPLIES_3= RULE_IMPLIES | this_SIMPLIES_4= RULE_SIMPLIES )
            {
            // InternalGumboParser.g:7077:2: (this_OP_0= RULE_OP | this_PlusMinus_1= rulePlusMinus | this_STAR_2= ruleSTAR | this_IMPLIES_3= RULE_IMPLIES | this_SIMPLIES_4= RULE_SIMPLIES )
            int alt131=5;
            switch ( input.LA(1) ) {
            case RULE_OP:
                {
                alt131=1;
                }
                break;
            case PlusSign:
            case HyphenMinus:
                {
                alt131=2;
                }
                break;
            case Asterisk:
                {
                alt131=3;
                }
                break;
            case RULE_IMPLIES:
                {
                alt131=4;
                }
                break;
            case RULE_SIMPLIES:
                {
                alt131=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 131, 0, input);

                throw nvae;
            }

            switch (alt131) {
                case 1 :
                    // InternalGumboParser.g:7078:3: this_OP_0= RULE_OP
                    {
                    this_OP_0=(Token)match(input,RULE_OP,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_OP_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_OP_0, grammarAccess.getOperatorAccess().getOPTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:7086:3: this_PlusMinus_1= rulePlusMinus
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOperatorAccess().getPlusMinusParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_PlusMinus_1=rulePlusMinus();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_PlusMinus_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGumboParser.g:7097:3: this_STAR_2= ruleSTAR
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOperatorAccess().getSTARParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_STAR_2=ruleSTAR();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_STAR_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGumboParser.g:7108:3: this_IMPLIES_3= RULE_IMPLIES
                    {
                    this_IMPLIES_3=(Token)match(input,RULE_IMPLIES,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_IMPLIES_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_IMPLIES_3, grammarAccess.getOperatorAccess().getIMPLIESTerminalRuleCall_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGumboParser.g:7116:3: this_SIMPLIES_4= RULE_SIMPLIES
                    {
                    this_SIMPLIES_4=(Token)match(input,RULE_SIMPLIES,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_SIMPLIES_4);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_SIMPLIES_4, grammarAccess.getOperatorAccess().getSIMPLIESTerminalRuleCall_4());
                      		
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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleContainedPropertyAssociation"
    // InternalGumboParser.g:7127:1: entryRuleContainedPropertyAssociation returns [EObject current=null] : iv_ruleContainedPropertyAssociation= ruleContainedPropertyAssociation EOF ;
    public final EObject entryRuleContainedPropertyAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainedPropertyAssociation = null;


        try {
            // InternalGumboParser.g:7127:69: (iv_ruleContainedPropertyAssociation= ruleContainedPropertyAssociation EOF )
            // InternalGumboParser.g:7128:2: iv_ruleContainedPropertyAssociation= ruleContainedPropertyAssociation EOF
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
    // InternalGumboParser.g:7134:1: ruleContainedPropertyAssociation returns [EObject current=null] : ( ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon ) ;
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
            // InternalGumboParser.g:7140:2: ( ( ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon ) )
            // InternalGumboParser.g:7141:2: ( ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon )
            {
            // InternalGumboParser.g:7141:2: ( ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon )
            // InternalGumboParser.g:7142:3: ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon
            {
            // InternalGumboParser.g:7142:3: ( ( ruleQPREF ) )
            // InternalGumboParser.g:7143:4: ( ruleQPREF )
            {
            // InternalGumboParser.g:7143:4: ( ruleQPREF )
            // InternalGumboParser.g:7144:5: ruleQPREF
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getContainedPropertyAssociationRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getPropertyPropertyCrossReference_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_92);
            ruleQPREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumboParser.g:7161:3: (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) )
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==EqualsSignGreaterThanSign) ) {
                alt132=1;
            }
            else if ( (LA132_0==PlusSignEqualsSignGreaterThanSign) ) {
                alt132=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 132, 0, input);

                throw nvae;
            }
            switch (alt132) {
                case 1 :
                    // InternalGumboParser.g:7162:4: otherlv_1= EqualsSignGreaterThanSign
                    {
                    otherlv_1=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_93); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getContainedPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:7167:4: ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) )
                    {
                    // InternalGumboParser.g:7167:4: ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) )
                    // InternalGumboParser.g:7168:5: (lv_append_2_0= PlusSignEqualsSignGreaterThanSign )
                    {
                    // InternalGumboParser.g:7168:5: (lv_append_2_0= PlusSignEqualsSignGreaterThanSign )
                    // InternalGumboParser.g:7169:6: lv_append_2_0= PlusSignEqualsSignGreaterThanSign
                    {
                    lv_append_2_0=(Token)match(input,PlusSignEqualsSignGreaterThanSign,FollowSets000.FOLLOW_93); if (state.failed) return current;
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

            // InternalGumboParser.g:7182:3: ( (lv_constant_3_0= Constant ) )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==Constant) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // InternalGumboParser.g:7183:4: (lv_constant_3_0= Constant )
                    {
                    // InternalGumboParser.g:7183:4: (lv_constant_3_0= Constant )
                    // InternalGumboParser.g:7184:5: lv_constant_3_0= Constant
                    {
                    lv_constant_3_0=(Token)match(input,Constant,FollowSets000.FOLLOW_93); if (state.failed) return current;
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

            // InternalGumboParser.g:7196:3: ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* )
            // InternalGumboParser.g:7197:4: ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )*
            {
            // InternalGumboParser.g:7197:4: ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) )
            // InternalGumboParser.g:7198:5: (lv_ownedValue_4_0= ruleOptionalModalPropertyValue )
            {
            // InternalGumboParser.g:7198:5: (lv_ownedValue_4_0= ruleOptionalModalPropertyValue )
            // InternalGumboParser.g:7199:6: lv_ownedValue_4_0= ruleOptionalModalPropertyValue
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueOptionalModalPropertyValueParserRuleCall_3_0_0());
              					
            }
            pushFollow(FollowSets000.FOLLOW_94);
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

            // InternalGumboParser.g:7216:4: (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )*
            loop134:
            do {
                int alt134=2;
                int LA134_0 = input.LA(1);

                if ( (LA134_0==Comma) ) {
                    alt134=1;
                }


                switch (alt134) {
            	case 1 :
            	    // InternalGumboParser.g:7217:5: otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) )
            	    {
            	    otherlv_5=(Token)match(input,Comma,FollowSets000.FOLLOW_93); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_5, grammarAccess.getContainedPropertyAssociationAccess().getCommaKeyword_3_1_0());
            	      				
            	    }
            	    // InternalGumboParser.g:7221:5: ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) )
            	    // InternalGumboParser.g:7222:6: (lv_ownedValue_6_0= ruleOptionalModalPropertyValue )
            	    {
            	    // InternalGumboParser.g:7222:6: (lv_ownedValue_6_0= ruleOptionalModalPropertyValue )
            	    // InternalGumboParser.g:7223:7: lv_ownedValue_6_0= ruleOptionalModalPropertyValue
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueOptionalModalPropertyValueParserRuleCall_3_1_1_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_94);
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
            	    break loop134;
                }
            } while (true);


            }

            // InternalGumboParser.g:7242:3: ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==Applies) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // InternalGumboParser.g:7243:4: ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )*
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToKeywordsParserRuleCall_4_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_8);
                    ruleAppliesToKeywords();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalGumboParser.g:7253:4: ( (lv_appliesTo_8_0= ruleContainmentPath ) )
                    // InternalGumboParser.g:7254:5: (lv_appliesTo_8_0= ruleContainmentPath )
                    {
                    // InternalGumboParser.g:7254:5: (lv_appliesTo_8_0= ruleContainmentPath )
                    // InternalGumboParser.g:7255:6: lv_appliesTo_8_0= ruleContainmentPath
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToContainmentPathParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_95);
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

                    // InternalGumboParser.g:7272:4: (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )*
                    loop135:
                    do {
                        int alt135=2;
                        int LA135_0 = input.LA(1);

                        if ( (LA135_0==Comma) ) {
                            alt135=1;
                        }


                        switch (alt135) {
                    	case 1 :
                    	    // InternalGumboParser.g:7273:5: otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) )
                    	    {
                    	    otherlv_9=(Token)match(input,Comma,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_9, grammarAccess.getContainedPropertyAssociationAccess().getCommaKeyword_4_2_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:7277:5: ( (lv_appliesTo_10_0= ruleContainmentPath ) )
                    	    // InternalGumboParser.g:7278:6: (lv_appliesTo_10_0= ruleContainmentPath )
                    	    {
                    	    // InternalGumboParser.g:7278:6: (lv_appliesTo_10_0= ruleContainmentPath )
                    	    // InternalGumboParser.g:7279:7: lv_appliesTo_10_0= ruleContainmentPath
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToContainmentPathParserRuleCall_4_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_95);
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
                    	    break loop135;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalGumboParser.g:7298:3: ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==In_1) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // InternalGumboParser.g:7299:4: ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getInBindingKeywordsParserRuleCall_5_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_36);
                    ruleInBindingKeywords();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_12=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getContainedPropertyAssociationAccess().getLeftParenthesisKeyword_5_1());
                      			
                    }
                    // InternalGumboParser.g:7313:4: ( ( ruleQCREF ) )
                    // InternalGumboParser.g:7314:5: ( ruleQCREF )
                    {
                    // InternalGumboParser.g:7314:5: ( ruleQCREF )
                    // InternalGumboParser.g:7315:6: ruleQCREF
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getContainedPropertyAssociationRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getInBindingClassifierCrossReference_5_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_39);
                    ruleQCREF();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_14=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_11); if (state.failed) return current;
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
    // InternalGumboParser.g:7345:1: entryRuleContainmentPath returns [EObject current=null] : iv_ruleContainmentPath= ruleContainmentPath EOF ;
    public final EObject entryRuleContainmentPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainmentPath = null;


        try {
            // InternalGumboParser.g:7345:56: (iv_ruleContainmentPath= ruleContainmentPath EOF )
            // InternalGumboParser.g:7346:2: iv_ruleContainmentPath= ruleContainmentPath EOF
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
    // InternalGumboParser.g:7352:1: ruleContainmentPath returns [EObject current=null] : ( (lv_path_0_0= ruleContainmentPathElement ) ) ;
    public final EObject ruleContainmentPath() throws RecognitionException {
        EObject current = null;

        EObject lv_path_0_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:7358:2: ( ( (lv_path_0_0= ruleContainmentPathElement ) ) )
            // InternalGumboParser.g:7359:2: ( (lv_path_0_0= ruleContainmentPathElement ) )
            {
            // InternalGumboParser.g:7359:2: ( (lv_path_0_0= ruleContainmentPathElement ) )
            // InternalGumboParser.g:7360:3: (lv_path_0_0= ruleContainmentPathElement )
            {
            // InternalGumboParser.g:7360:3: (lv_path_0_0= ruleContainmentPathElement )
            // InternalGumboParser.g:7361:4: lv_path_0_0= ruleContainmentPathElement
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
    // InternalGumboParser.g:7381:1: entryRuleOptionalModalPropertyValue returns [EObject current=null] : iv_ruleOptionalModalPropertyValue= ruleOptionalModalPropertyValue EOF ;
    public final EObject entryRuleOptionalModalPropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionalModalPropertyValue = null;


        try {
            // InternalGumboParser.g:7381:67: (iv_ruleOptionalModalPropertyValue= ruleOptionalModalPropertyValue EOF )
            // InternalGumboParser.g:7382:2: iv_ruleOptionalModalPropertyValue= ruleOptionalModalPropertyValue EOF
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
    // InternalGumboParser.g:7388:1: ruleOptionalModalPropertyValue returns [EObject current=null] : ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )? ) ;
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
            // InternalGumboParser.g:7394:2: ( ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )? ) )
            // InternalGumboParser.g:7395:2: ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )? )
            {
            // InternalGumboParser.g:7395:2: ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )? )
            // InternalGumboParser.g:7396:3: ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )?
            {
            // InternalGumboParser.g:7396:3: ( (lv_ownedValue_0_0= rulePropertyExpression ) )
            // InternalGumboParser.g:7397:4: (lv_ownedValue_0_0= rulePropertyExpression )
            {
            // InternalGumboParser.g:7397:4: (lv_ownedValue_0_0= rulePropertyExpression )
            // InternalGumboParser.g:7398:5: lv_ownedValue_0_0= rulePropertyExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOptionalModalPropertyValueAccess().getOwnedValuePropertyExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_96);
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

            // InternalGumboParser.g:7415:3: ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==In_1) ) {
                int LA139_1 = input.LA(2);

                if ( (LA139_1==Modes) ) {
                    alt139=1;
                }
            }
            switch (alt139) {
                case 1 :
                    // InternalGumboParser.g:7416:4: ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getOptionalModalPropertyValueAccess().getInModesKeywordsParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_36);
                    ruleInModesKeywords();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_2=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getOptionalModalPropertyValueAccess().getLeftParenthesisKeyword_1_1());
                      			
                    }
                    // InternalGumboParser.g:7430:4: ( (otherlv_3= RULE_ID ) )
                    // InternalGumboParser.g:7431:5: (otherlv_3= RULE_ID )
                    {
                    // InternalGumboParser.g:7431:5: (otherlv_3= RULE_ID )
                    // InternalGumboParser.g:7432:6: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getOptionalModalPropertyValueRule());
                      						}
                      					
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getOptionalModalPropertyValueAccess().getInModeModeCrossReference_1_2_0());
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:7446:4: (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )*
                    loop138:
                    do {
                        int alt138=2;
                        int LA138_0 = input.LA(1);

                        if ( (LA138_0==Comma) ) {
                            alt138=1;
                        }


                        switch (alt138) {
                    	case 1 :
                    	    // InternalGumboParser.g:7447:5: otherlv_4= Comma ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getOptionalModalPropertyValueAccess().getCommaKeyword_1_3_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:7451:5: ( (otherlv_5= RULE_ID ) )
                    	    // InternalGumboParser.g:7452:6: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalGumboParser.g:7452:6: (otherlv_5= RULE_ID )
                    	    // InternalGumboParser.g:7453:7: otherlv_5= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							/* */
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getOptionalModalPropertyValueRule());
                    	      							}
                    	      						
                    	    }
                    	    otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_41); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_5, grammarAccess.getOptionalModalPropertyValueAccess().getInModeModeCrossReference_1_3_1_0());
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop138;
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
    // InternalGumboParser.g:7477:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalGumboParser.g:7477:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalGumboParser.g:7478:2: iv_rulePropertyValue= rulePropertyValue EOF
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
    // InternalGumboParser.g:7484:1: rulePropertyValue returns [EObject current=null] : ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedValue_0_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:7490:2: ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) )
            // InternalGumboParser.g:7491:2: ( (lv_ownedValue_0_0= rulePropertyExpression ) )
            {
            // InternalGumboParser.g:7491:2: ( (lv_ownedValue_0_0= rulePropertyExpression ) )
            // InternalGumboParser.g:7492:3: (lv_ownedValue_0_0= rulePropertyExpression )
            {
            // InternalGumboParser.g:7492:3: (lv_ownedValue_0_0= rulePropertyExpression )
            // InternalGumboParser.g:7493:4: lv_ownedValue_0_0= rulePropertyExpression
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
    // InternalGumboParser.g:7513:1: entryRulePropertyExpression returns [EObject current=null] : iv_rulePropertyExpression= rulePropertyExpression EOF ;
    public final EObject entryRulePropertyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyExpression = null;


        try {
            // InternalGumboParser.g:7513:59: (iv_rulePropertyExpression= rulePropertyExpression EOF )
            // InternalGumboParser.g:7514:2: iv_rulePropertyExpression= rulePropertyExpression EOF
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
    // InternalGumboParser.g:7520:1: rulePropertyExpression returns [EObject current=null] : (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm ) ;
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
            // InternalGumboParser.g:7526:2: ( (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm ) )
            // InternalGumboParser.g:7527:2: (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm )
            {
            // InternalGumboParser.g:7527:2: (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm )
            int alt140=11;
            alt140 = dfa140.predict(input);
            switch (alt140) {
                case 1 :
                    // InternalGumboParser.g:7528:3: this_RecordTerm_0= ruleRecordTerm
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
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
                    // InternalGumboParser.g:7540:3: this_ReferenceTerm_1= ruleReferenceTerm
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
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
                    // InternalGumboParser.g:7552:3: this_ComponentClassifierTerm_2= ruleComponentClassifierTerm
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
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
                    // InternalGumboParser.g:7564:3: this_ComputedTerm_3= ruleComputedTerm
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
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
                    // InternalGumboParser.g:7576:3: this_StringTerm_4= ruleStringTerm
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
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
                    // InternalGumboParser.g:7588:3: this_NumericRangeTerm_5= ruleNumericRangeTerm
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
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
                    // InternalGumboParser.g:7600:3: this_RealTerm_6= ruleRealTerm
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
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
                    // InternalGumboParser.g:7612:3: this_IntegerTerm_7= ruleIntegerTerm
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
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
                    // InternalGumboParser.g:7624:3: this_ListTerm_8= ruleListTerm
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
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
                    // InternalGumboParser.g:7636:3: this_BooleanLiteral_9= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
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
                    // InternalGumboParser.g:7648:3: this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
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
    // InternalGumboParser.g:7663:1: entryRuleLiteralorReferenceTerm returns [EObject current=null] : iv_ruleLiteralorReferenceTerm= ruleLiteralorReferenceTerm EOF ;
    public final EObject entryRuleLiteralorReferenceTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralorReferenceTerm = null;


        try {
            // InternalGumboParser.g:7663:63: (iv_ruleLiteralorReferenceTerm= ruleLiteralorReferenceTerm EOF )
            // InternalGumboParser.g:7664:2: iv_ruleLiteralorReferenceTerm= ruleLiteralorReferenceTerm EOF
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
    // InternalGumboParser.g:7670:1: ruleLiteralorReferenceTerm returns [EObject current=null] : ( ( ruleQPREF ) ) ;
    public final EObject ruleLiteralorReferenceTerm() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalGumboParser.g:7676:2: ( ( ( ruleQPREF ) ) )
            // InternalGumboParser.g:7677:2: ( ( ruleQPREF ) )
            {
            // InternalGumboParser.g:7677:2: ( ( ruleQPREF ) )
            // InternalGumboParser.g:7678:3: ( ruleQPREF )
            {
            // InternalGumboParser.g:7678:3: ( ruleQPREF )
            // InternalGumboParser.g:7679:4: ruleQPREF
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
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
    // InternalGumboParser.g:7699:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalGumboParser.g:7699:55: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalGumboParser.g:7700:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
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
    // InternalGumboParser.g:7706:1: ruleBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalGumboParser.g:7712:2: ( ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) ) )
            // InternalGumboParser.g:7713:2: ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) )
            {
            // InternalGumboParser.g:7713:2: ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) )
            // InternalGumboParser.g:7714:3: () ( ( (lv_value_1_0= True ) ) | otherlv_2= False )
            {
            // InternalGumboParser.g:7714:3: ()
            // InternalGumboParser.g:7715:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalGumboParser.g:7724:3: ( ( (lv_value_1_0= True ) ) | otherlv_2= False )
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==True) ) {
                alt141=1;
            }
            else if ( (LA141_0==False) ) {
                alt141=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 141, 0, input);

                throw nvae;
            }
            switch (alt141) {
                case 1 :
                    // InternalGumboParser.g:7725:4: ( (lv_value_1_0= True ) )
                    {
                    // InternalGumboParser.g:7725:4: ( (lv_value_1_0= True ) )
                    // InternalGumboParser.g:7726:5: (lv_value_1_0= True )
                    {
                    // InternalGumboParser.g:7726:5: (lv_value_1_0= True )
                    // InternalGumboParser.g:7727:6: lv_value_1_0= True
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
                    // InternalGumboParser.g:7740:4: otherlv_2= False
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
    // InternalGumboParser.g:7749:1: entryRuleConstantValue returns [EObject current=null] : iv_ruleConstantValue= ruleConstantValue EOF ;
    public final EObject entryRuleConstantValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantValue = null;


        try {
            // InternalGumboParser.g:7749:54: (iv_ruleConstantValue= ruleConstantValue EOF )
            // InternalGumboParser.g:7750:2: iv_ruleConstantValue= ruleConstantValue EOF
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
    // InternalGumboParser.g:7756:1: ruleConstantValue returns [EObject current=null] : ( ( ruleQPREF ) ) ;
    public final EObject ruleConstantValue() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalGumboParser.g:7762:2: ( ( ( ruleQPREF ) ) )
            // InternalGumboParser.g:7763:2: ( ( ruleQPREF ) )
            {
            // InternalGumboParser.g:7763:2: ( ( ruleQPREF ) )
            // InternalGumboParser.g:7764:3: ( ruleQPREF )
            {
            // InternalGumboParser.g:7764:3: ( ruleQPREF )
            // InternalGumboParser.g:7765:4: ruleQPREF
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
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
    // InternalGumboParser.g:7785:1: entryRuleReferenceTerm returns [EObject current=null] : iv_ruleReferenceTerm= ruleReferenceTerm EOF ;
    public final EObject entryRuleReferenceTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceTerm = null;


        try {
            // InternalGumboParser.g:7785:54: (iv_ruleReferenceTerm= ruleReferenceTerm EOF )
            // InternalGumboParser.g:7786:2: iv_ruleReferenceTerm= ruleReferenceTerm EOF
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
    // InternalGumboParser.g:7792:1: ruleReferenceTerm returns [EObject current=null] : (otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleReferenceTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_path_2_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:7798:2: ( (otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis ) )
            // InternalGumboParser.g:7799:2: (otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis )
            {
            // InternalGumboParser.g:7799:2: (otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis )
            // InternalGumboParser.g:7800:3: otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis
            {
            otherlv_0=(Token)match(input,Reference,FollowSets000.FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReferenceTermAccess().getReferenceKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReferenceTermAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGumboParser.g:7808:3: ( (lv_path_2_0= ruleContainmentPathElement ) )
            // InternalGumboParser.g:7809:4: (lv_path_2_0= ruleContainmentPathElement )
            {
            // InternalGumboParser.g:7809:4: (lv_path_2_0= ruleContainmentPathElement )
            // InternalGumboParser.g:7810:5: lv_path_2_0= ruleContainmentPathElement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReferenceTermAccess().getPathContainmentPathElementParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_39);
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
    // InternalGumboParser.g:7835:1: entryRuleRecordTerm returns [EObject current=null] : iv_ruleRecordTerm= ruleRecordTerm EOF ;
    public final EObject entryRuleRecordTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordTerm = null;


        try {
            // InternalGumboParser.g:7835:51: (iv_ruleRecordTerm= ruleRecordTerm EOF )
            // InternalGumboParser.g:7836:2: iv_ruleRecordTerm= ruleRecordTerm EOF
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
    // InternalGumboParser.g:7842:1: ruleRecordTerm returns [EObject current=null] : (otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket ) ;
    public final EObject ruleRecordTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ownedFieldValue_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:7848:2: ( (otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket ) )
            // InternalGumboParser.g:7849:2: (otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket )
            {
            // InternalGumboParser.g:7849:2: (otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket )
            // InternalGumboParser.g:7850:3: otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket
            {
            otherlv_0=(Token)match(input,LeftSquareBracket,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRecordTermAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalGumboParser.g:7854:3: ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+
            int cnt142=0;
            loop142:
            do {
                int alt142=2;
                int LA142_0 = input.LA(1);

                if ( (LA142_0==RULE_ID) ) {
                    alt142=1;
                }


                switch (alt142) {
            	case 1 :
            	    // InternalGumboParser.g:7855:4: (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation )
            	    {
            	    // InternalGumboParser.g:7855:4: (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation )
            	    // InternalGumboParser.g:7856:5: lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRecordTermAccess().getOwnedFieldValueFieldPropertyAssociationParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_97);
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
            	    if ( cnt142 >= 1 ) break loop142;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(142, input);
                        throw eee;
                }
                cnt142++;
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
    // InternalGumboParser.g:7881:1: entryRuleComputedTerm returns [EObject current=null] : iv_ruleComputedTerm= ruleComputedTerm EOF ;
    public final EObject entryRuleComputedTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComputedTerm = null;


        try {
            // InternalGumboParser.g:7881:53: (iv_ruleComputedTerm= ruleComputedTerm EOF )
            // InternalGumboParser.g:7882:2: iv_ruleComputedTerm= ruleComputedTerm EOF
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
    // InternalGumboParser.g:7888:1: ruleComputedTerm returns [EObject current=null] : (otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleComputedTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_function_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalGumboParser.g:7894:2: ( (otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis ) )
            // InternalGumboParser.g:7895:2: (otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis )
            {
            // InternalGumboParser.g:7895:2: (otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis )
            // InternalGumboParser.g:7896:3: otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis
            {
            otherlv_0=(Token)match(input,Compute,FollowSets000.FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getComputedTermAccess().getComputeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getComputedTermAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGumboParser.g:7904:3: ( (lv_function_2_0= RULE_ID ) )
            // InternalGumboParser.g:7905:4: (lv_function_2_0= RULE_ID )
            {
            // InternalGumboParser.g:7905:4: (lv_function_2_0= RULE_ID )
            // InternalGumboParser.g:7906:5: lv_function_2_0= RULE_ID
            {
            lv_function_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_39); if (state.failed) return current;
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
    // InternalGumboParser.g:7930:1: entryRuleComponentClassifierTerm returns [EObject current=null] : iv_ruleComponentClassifierTerm= ruleComponentClassifierTerm EOF ;
    public final EObject entryRuleComponentClassifierTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentClassifierTerm = null;


        try {
            // InternalGumboParser.g:7930:64: (iv_ruleComponentClassifierTerm= ruleComponentClassifierTerm EOF )
            // InternalGumboParser.g:7931:2: iv_ruleComponentClassifierTerm= ruleComponentClassifierTerm EOF
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
    // InternalGumboParser.g:7937:1: ruleComponentClassifierTerm returns [EObject current=null] : (otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleComponentClassifierTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalGumboParser.g:7943:2: ( (otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis ) )
            // InternalGumboParser.g:7944:2: (otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis )
            {
            // InternalGumboParser.g:7944:2: (otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis )
            // InternalGumboParser.g:7945:3: otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis
            {
            otherlv_0=(Token)match(input,Classifier,FollowSets000.FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getComponentClassifierTermAccess().getClassifierKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getComponentClassifierTermAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGumboParser.g:7953:3: ( ( ruleQCREF ) )
            // InternalGumboParser.g:7954:4: ( ruleQCREF )
            {
            // InternalGumboParser.g:7954:4: ( ruleQCREF )
            // InternalGumboParser.g:7955:5: ruleQCREF
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getComponentClassifierTermRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComponentClassifierTermAccess().getClassifierComponentClassifierCrossReference_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_39);
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
    // InternalGumboParser.g:7980:1: entryRuleListTerm returns [EObject current=null] : iv_ruleListTerm= ruleListTerm EOF ;
    public final EObject entryRuleListTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListTerm = null;


        try {
            // InternalGumboParser.g:7980:49: (iv_ruleListTerm= ruleListTerm EOF )
            // InternalGumboParser.g:7981:2: iv_ruleListTerm= ruleListTerm EOF
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
    // InternalGumboParser.g:7987:1: ruleListTerm returns [EObject current=null] : ( () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis ) ;
    public final EObject ruleListTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedListElement_2_0 = null;

        EObject lv_ownedListElement_4_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:7993:2: ( ( () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis ) )
            // InternalGumboParser.g:7994:2: ( () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis )
            {
            // InternalGumboParser.g:7994:2: ( () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis )
            // InternalGumboParser.g:7995:3: () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis
            {
            // InternalGumboParser.g:7995:3: ()
            // InternalGumboParser.g:7996:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getListTermAccess().getListValueAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_98); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getListTermAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGumboParser.g:8009:3: ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==Classifier||LA144_0==Reference||LA144_0==Compute||LA144_0==False||LA144_0==True||LA144_0==LeftParenthesis||LA144_0==PlusSign||LA144_0==HyphenMinus||LA144_0==LeftSquareBracket||LA144_0==RULE_INTEGER_LIT||LA144_0==RULE_REAL_LIT||(LA144_0>=RULE_STRING && LA144_0<=RULE_ID)) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // InternalGumboParser.g:8010:4: ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )*
                    {
                    // InternalGumboParser.g:8010:4: ( (lv_ownedListElement_2_0= rulePropertyExpression ) )
                    // InternalGumboParser.g:8011:5: (lv_ownedListElement_2_0= rulePropertyExpression )
                    {
                    // InternalGumboParser.g:8011:5: (lv_ownedListElement_2_0= rulePropertyExpression )
                    // InternalGumboParser.g:8012:6: lv_ownedListElement_2_0= rulePropertyExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getListTermAccess().getOwnedListElementPropertyExpressionParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_41);
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

                    // InternalGumboParser.g:8029:4: (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )*
                    loop143:
                    do {
                        int alt143=2;
                        int LA143_0 = input.LA(1);

                        if ( (LA143_0==Comma) ) {
                            alt143=1;
                        }


                        switch (alt143) {
                    	case 1 :
                    	    // InternalGumboParser.g:8030:5: otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FollowSets000.FOLLOW_93); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getListTermAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:8034:5: ( (lv_ownedListElement_4_0= rulePropertyExpression ) )
                    	    // InternalGumboParser.g:8035:6: (lv_ownedListElement_4_0= rulePropertyExpression )
                    	    {
                    	    // InternalGumboParser.g:8035:6: (lv_ownedListElement_4_0= rulePropertyExpression )
                    	    // InternalGumboParser.g:8036:7: lv_ownedListElement_4_0= rulePropertyExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getListTermAccess().getOwnedListElementPropertyExpressionParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_41);
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
                    	    break loop143;
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
    // InternalGumboParser.g:8063:1: entryRuleFieldPropertyAssociation returns [EObject current=null] : iv_ruleFieldPropertyAssociation= ruleFieldPropertyAssociation EOF ;
    public final EObject entryRuleFieldPropertyAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldPropertyAssociation = null;


        try {
            // InternalGumboParser.g:8063:65: (iv_ruleFieldPropertyAssociation= ruleFieldPropertyAssociation EOF )
            // InternalGumboParser.g:8064:2: iv_ruleFieldPropertyAssociation= ruleFieldPropertyAssociation EOF
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
    // InternalGumboParser.g:8070:1: ruleFieldPropertyAssociation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon ) ;
    public final EObject ruleFieldPropertyAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedValue_2_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:8076:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon ) )
            // InternalGumboParser.g:8077:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon )
            {
            // InternalGumboParser.g:8077:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon )
            // InternalGumboParser.g:8078:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon
            {
            // InternalGumboParser.g:8078:3: ( (otherlv_0= RULE_ID ) )
            // InternalGumboParser.g:8079:4: (otherlv_0= RULE_ID )
            {
            // InternalGumboParser.g:8079:4: (otherlv_0= RULE_ID )
            // InternalGumboParser.g:8080:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFieldPropertyAssociationRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_67); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getFieldPropertyAssociationAccess().getPropertyBasicPropertyCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_93); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFieldPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_1());
              		
            }
            // InternalGumboParser.g:8098:3: ( (lv_ownedValue_2_0= rulePropertyExpression ) )
            // InternalGumboParser.g:8099:4: (lv_ownedValue_2_0= rulePropertyExpression )
            {
            // InternalGumboParser.g:8099:4: (lv_ownedValue_2_0= rulePropertyExpression )
            // InternalGumboParser.g:8100:5: lv_ownedValue_2_0= rulePropertyExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFieldPropertyAssociationAccess().getOwnedValuePropertyExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_11);
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
    // InternalGumboParser.g:8125:1: entryRuleContainmentPathElement returns [EObject current=null] : iv_ruleContainmentPathElement= ruleContainmentPathElement EOF ;
    public final EObject entryRuleContainmentPathElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainmentPathElement = null;


        try {
            // InternalGumboParser.g:8125:63: (iv_ruleContainmentPathElement= ruleContainmentPathElement EOF )
            // InternalGumboParser.g:8126:2: iv_ruleContainmentPathElement= ruleContainmentPathElement EOF
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
    // InternalGumboParser.g:8132:1: ruleContainmentPathElement returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )? ) ;
    public final EObject ruleContainmentPathElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_arrayRange_1_0 = null;

        EObject lv_path_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:8138:2: ( ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )? ) )
            // InternalGumboParser.g:8139:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )? )
            {
            // InternalGumboParser.g:8139:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )? )
            // InternalGumboParser.g:8140:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )?
            {
            // InternalGumboParser.g:8140:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* )
            // InternalGumboParser.g:8141:4: ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )*
            {
            // InternalGumboParser.g:8141:4: ( (otherlv_0= RULE_ID ) )
            // InternalGumboParser.g:8142:5: (otherlv_0= RULE_ID )
            {
            // InternalGumboParser.g:8142:5: (otherlv_0= RULE_ID )
            // InternalGumboParser.g:8143:6: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              						/* */
              					
            }
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElement(grammarAccess.getContainmentPathElementRule());
              						}
              					
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						newLeafNode(otherlv_0, grammarAccess.getContainmentPathElementAccess().getNamedElementNamedElementCrossReference_0_0_0());
              					
            }

            }


            }

            // InternalGumboParser.g:8157:4: ( (lv_arrayRange_1_0= ruleArrayRange ) )*
            loop145:
            do {
                int alt145=2;
                int LA145_0 = input.LA(1);

                if ( (LA145_0==LeftSquareBracket) ) {
                    alt145=1;
                }


                switch (alt145) {
            	case 1 :
            	    // InternalGumboParser.g:8158:5: (lv_arrayRange_1_0= ruleArrayRange )
            	    {
            	    // InternalGumboParser.g:8158:5: (lv_arrayRange_1_0= ruleArrayRange )
            	    // InternalGumboParser.g:8159:6: lv_arrayRange_1_0= ruleArrayRange
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getContainmentPathElementAccess().getArrayRangeArrayRangeParserRuleCall_0_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_27);
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
            	    break loop145;
                }
            } while (true);


            }

            // InternalGumboParser.g:8177:3: (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==FullStop) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // InternalGumboParser.g:8178:4: otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) )
                    {
                    otherlv_2=(Token)match(input,FullStop,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getContainmentPathElementAccess().getFullStopKeyword_1_0());
                      			
                    }
                    // InternalGumboParser.g:8182:4: ( (lv_path_3_0= ruleContainmentPathElement ) )
                    // InternalGumboParser.g:8183:5: (lv_path_3_0= ruleContainmentPathElement )
                    {
                    // InternalGumboParser.g:8183:5: (lv_path_3_0= ruleContainmentPathElement )
                    // InternalGumboParser.g:8184:6: lv_path_3_0= ruleContainmentPathElement
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
    // InternalGumboParser.g:8206:1: entryRulePlusMinus returns [String current=null] : iv_rulePlusMinus= rulePlusMinus EOF ;
    public final String entryRulePlusMinus() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePlusMinus = null;


        try {
            // InternalGumboParser.g:8206:49: (iv_rulePlusMinus= rulePlusMinus EOF )
            // InternalGumboParser.g:8207:2: iv_rulePlusMinus= rulePlusMinus EOF
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
    // InternalGumboParser.g:8213:1: rulePlusMinus returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= PlusSign | kw= HyphenMinus ) ;
    public final AntlrDatatypeRuleToken rulePlusMinus() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumboParser.g:8219:2: ( (kw= PlusSign | kw= HyphenMinus ) )
            // InternalGumboParser.g:8220:2: (kw= PlusSign | kw= HyphenMinus )
            {
            // InternalGumboParser.g:8220:2: (kw= PlusSign | kw= HyphenMinus )
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==PlusSign) ) {
                alt147=1;
            }
            else if ( (LA147_0==HyphenMinus) ) {
                alt147=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 147, 0, input);

                throw nvae;
            }
            switch (alt147) {
                case 1 :
                    // InternalGumboParser.g:8221:3: kw= PlusSign
                    {
                    kw=(Token)match(input,PlusSign,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPlusMinusAccess().getPlusSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:8227:3: kw= HyphenMinus
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
    // InternalGumboParser.g:8236:1: entryRuleStringTerm returns [EObject current=null] : iv_ruleStringTerm= ruleStringTerm EOF ;
    public final EObject entryRuleStringTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringTerm = null;


        try {
            // InternalGumboParser.g:8236:51: (iv_ruleStringTerm= ruleStringTerm EOF )
            // InternalGumboParser.g:8237:2: iv_ruleStringTerm= ruleStringTerm EOF
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
    // InternalGumboParser.g:8243:1: ruleStringTerm returns [EObject current=null] : ( (lv_value_0_0= ruleNoQuoteString ) ) ;
    public final EObject ruleStringTerm() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:8249:2: ( ( (lv_value_0_0= ruleNoQuoteString ) ) )
            // InternalGumboParser.g:8250:2: ( (lv_value_0_0= ruleNoQuoteString ) )
            {
            // InternalGumboParser.g:8250:2: ( (lv_value_0_0= ruleNoQuoteString ) )
            // InternalGumboParser.g:8251:3: (lv_value_0_0= ruleNoQuoteString )
            {
            // InternalGumboParser.g:8251:3: (lv_value_0_0= ruleNoQuoteString )
            // InternalGumboParser.g:8252:4: lv_value_0_0= ruleNoQuoteString
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
    // InternalGumboParser.g:8272:1: entryRuleNoQuoteString returns [String current=null] : iv_ruleNoQuoteString= ruleNoQuoteString EOF ;
    public final String entryRuleNoQuoteString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNoQuoteString = null;


        try {
            // InternalGumboParser.g:8272:53: (iv_ruleNoQuoteString= ruleNoQuoteString EOF )
            // InternalGumboParser.g:8273:2: iv_ruleNoQuoteString= ruleNoQuoteString EOF
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
    // InternalGumboParser.g:8279:1: ruleNoQuoteString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleNoQuoteString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalGumboParser.g:8285:2: (this_STRING_0= RULE_STRING )
            // InternalGumboParser.g:8286:2: this_STRING_0= RULE_STRING
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
    // InternalGumboParser.g:8296:1: entryRuleArrayRange returns [EObject current=null] : iv_ruleArrayRange= ruleArrayRange EOF ;
    public final EObject entryRuleArrayRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayRange = null;


        try {
            // InternalGumboParser.g:8296:51: (iv_ruleArrayRange= ruleArrayRange EOF )
            // InternalGumboParser.g:8297:2: iv_ruleArrayRange= ruleArrayRange EOF
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
    // InternalGumboParser.g:8303:1: ruleArrayRange returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleArrayRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_lowerBound_2_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_4_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:8309:2: ( ( () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket ) )
            // InternalGumboParser.g:8310:2: ( () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket )
            {
            // InternalGumboParser.g:8310:2: ( () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket )
            // InternalGumboParser.g:8311:3: () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket
            {
            // InternalGumboParser.g:8311:3: ()
            // InternalGumboParser.g:8312:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getArrayRangeAccess().getArrayRangeAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FollowSets000.FOLLOW_99); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getArrayRangeAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalGumboParser.g:8325:3: ( (lv_lowerBound_2_0= ruleINTVALUE ) )
            // InternalGumboParser.g:8326:4: (lv_lowerBound_2_0= ruleINTVALUE )
            {
            // InternalGumboParser.g:8326:4: (lv_lowerBound_2_0= ruleINTVALUE )
            // InternalGumboParser.g:8327:5: lv_lowerBound_2_0= ruleINTVALUE
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArrayRangeAccess().getLowerBoundINTVALUEParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_100);
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

            // InternalGumboParser.g:8344:3: (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==FullStopFullStop) ) {
                alt148=1;
            }
            switch (alt148) {
                case 1 :
                    // InternalGumboParser.g:8345:4: otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) )
                    {
                    otherlv_3=(Token)match(input,FullStopFullStop,FollowSets000.FOLLOW_99); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getArrayRangeAccess().getFullStopFullStopKeyword_3_0());
                      			
                    }
                    // InternalGumboParser.g:8349:4: ( (lv_upperBound_4_0= ruleINTVALUE ) )
                    // InternalGumboParser.g:8350:5: (lv_upperBound_4_0= ruleINTVALUE )
                    {
                    // InternalGumboParser.g:8350:5: (lv_upperBound_4_0= ruleINTVALUE )
                    // InternalGumboParser.g:8351:6: lv_upperBound_4_0= ruleINTVALUE
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getArrayRangeAccess().getUpperBoundINTVALUEParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_101);
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
    // InternalGumboParser.g:8377:1: entryRuleSignedConstant returns [EObject current=null] : iv_ruleSignedConstant= ruleSignedConstant EOF ;
    public final EObject entryRuleSignedConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignedConstant = null;


        try {
            // InternalGumboParser.g:8377:55: (iv_ruleSignedConstant= ruleSignedConstant EOF )
            // InternalGumboParser.g:8378:2: iv_ruleSignedConstant= ruleSignedConstant EOF
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
    // InternalGumboParser.g:8384:1: ruleSignedConstant returns [EObject current=null] : ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) ) ;
    public final EObject ruleSignedConstant() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_ownedPropertyExpression_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:8390:2: ( ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) ) )
            // InternalGumboParser.g:8391:2: ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) )
            {
            // InternalGumboParser.g:8391:2: ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) )
            // InternalGumboParser.g:8392:3: ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) )
            {
            // InternalGumboParser.g:8392:3: ( (lv_op_0_0= rulePlusMinus ) )
            // InternalGumboParser.g:8393:4: (lv_op_0_0= rulePlusMinus )
            {
            // InternalGumboParser.g:8393:4: (lv_op_0_0= rulePlusMinus )
            // InternalGumboParser.g:8394:5: lv_op_0_0= rulePlusMinus
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSignedConstantAccess().getOpPlusMinusParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_102);
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

            // InternalGumboParser.g:8411:3: ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) )
            // InternalGumboParser.g:8412:4: (lv_ownedPropertyExpression_1_0= ruleConstantValue )
            {
            // InternalGumboParser.g:8412:4: (lv_ownedPropertyExpression_1_0= ruleConstantValue )
            // InternalGumboParser.g:8413:5: lv_ownedPropertyExpression_1_0= ruleConstantValue
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
    // InternalGumboParser.g:8434:1: entryRuleIntegerTerm returns [EObject current=null] : iv_ruleIntegerTerm= ruleIntegerTerm EOF ;
    public final EObject entryRuleIntegerTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerTerm = null;


        try {
            // InternalGumboParser.g:8434:52: (iv_ruleIntegerTerm= ruleIntegerTerm EOF )
            // InternalGumboParser.g:8435:2: iv_ruleIntegerTerm= ruleIntegerTerm EOF
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
    // InternalGumboParser.g:8441:1: ruleIntegerTerm returns [EObject current=null] : ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? ) ;
    public final EObject ruleIntegerTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:8447:2: ( ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? ) )
            // InternalGumboParser.g:8448:2: ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? )
            {
            // InternalGumboParser.g:8448:2: ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? )
            // InternalGumboParser.g:8449:3: ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )?
            {
            // InternalGumboParser.g:8449:3: ( (lv_value_0_0= ruleSignedInt ) )
            // InternalGumboParser.g:8450:4: (lv_value_0_0= ruleSignedInt )
            {
            // InternalGumboParser.g:8450:4: (lv_value_0_0= ruleSignedInt )
            // InternalGumboParser.g:8451:5: lv_value_0_0= ruleSignedInt
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIntegerTermAccess().getValueSignedIntParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_9);
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

            // InternalGumboParser.g:8468:3: ( (otherlv_1= RULE_ID ) )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==RULE_ID) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // InternalGumboParser.g:8469:4: (otherlv_1= RULE_ID )
                    {
                    // InternalGumboParser.g:8469:4: (otherlv_1= RULE_ID )
                    // InternalGumboParser.g:8470:5: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
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
    // InternalGumboParser.g:8488:1: entryRuleSignedInt returns [String current=null] : iv_ruleSignedInt= ruleSignedInt EOF ;
    public final String entryRuleSignedInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedInt = null;


        try {
            // InternalGumboParser.g:8488:49: (iv_ruleSignedInt= ruleSignedInt EOF )
            // InternalGumboParser.g:8489:2: iv_ruleSignedInt= ruleSignedInt EOF
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
    // InternalGumboParser.g:8495:1: ruleSignedInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT ) ;
    public final AntlrDatatypeRuleToken ruleSignedInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INTEGER_LIT_2=null;


        	enterRule();

        try {
            // InternalGumboParser.g:8501:2: ( ( (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT ) )
            // InternalGumboParser.g:8502:2: ( (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT )
            {
            // InternalGumboParser.g:8502:2: ( (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT )
            // InternalGumboParser.g:8503:3: (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT
            {
            // InternalGumboParser.g:8503:3: (kw= PlusSign | kw= HyphenMinus )?
            int alt150=3;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==PlusSign) ) {
                alt150=1;
            }
            else if ( (LA150_0==HyphenMinus) ) {
                alt150=2;
            }
            switch (alt150) {
                case 1 :
                    // InternalGumboParser.g:8504:4: kw= PlusSign
                    {
                    kw=(Token)match(input,PlusSign,FollowSets000.FOLLOW_99); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSignedIntAccess().getPlusSignKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:8510:4: kw= HyphenMinus
                    {
                    kw=(Token)match(input,HyphenMinus,FollowSets000.FOLLOW_99); if (state.failed) return current;
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
    // InternalGumboParser.g:8527:1: entryRuleRealTerm returns [EObject current=null] : iv_ruleRealTerm= ruleRealTerm EOF ;
    public final EObject entryRuleRealTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealTerm = null;


        try {
            // InternalGumboParser.g:8527:49: (iv_ruleRealTerm= ruleRealTerm EOF )
            // InternalGumboParser.g:8528:2: iv_ruleRealTerm= ruleRealTerm EOF
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
    // InternalGumboParser.g:8534:1: ruleRealTerm returns [EObject current=null] : ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? ) ;
    public final EObject ruleRealTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:8540:2: ( ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? ) )
            // InternalGumboParser.g:8541:2: ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? )
            {
            // InternalGumboParser.g:8541:2: ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? )
            // InternalGumboParser.g:8542:3: ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )?
            {
            // InternalGumboParser.g:8542:3: ( (lv_value_0_0= ruleSignedReal ) )
            // InternalGumboParser.g:8543:4: (lv_value_0_0= ruleSignedReal )
            {
            // InternalGumboParser.g:8543:4: (lv_value_0_0= ruleSignedReal )
            // InternalGumboParser.g:8544:5: lv_value_0_0= ruleSignedReal
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRealTermAccess().getValueSignedRealParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_9);
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

            // InternalGumboParser.g:8561:3: ( (otherlv_1= RULE_ID ) )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==RULE_ID) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // InternalGumboParser.g:8562:4: (otherlv_1= RULE_ID )
                    {
                    // InternalGumboParser.g:8562:4: (otherlv_1= RULE_ID )
                    // InternalGumboParser.g:8563:5: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
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
    // InternalGumboParser.g:8581:1: entryRuleSignedReal returns [String current=null] : iv_ruleSignedReal= ruleSignedReal EOF ;
    public final String entryRuleSignedReal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedReal = null;


        try {
            // InternalGumboParser.g:8581:50: (iv_ruleSignedReal= ruleSignedReal EOF )
            // InternalGumboParser.g:8582:2: iv_ruleSignedReal= ruleSignedReal EOF
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
    // InternalGumboParser.g:8588:1: ruleSignedReal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT ) ;
    public final AntlrDatatypeRuleToken ruleSignedReal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_REAL_LIT_2=null;


        	enterRule();

        try {
            // InternalGumboParser.g:8594:2: ( ( (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT ) )
            // InternalGumboParser.g:8595:2: ( (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT )
            {
            // InternalGumboParser.g:8595:2: ( (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT )
            // InternalGumboParser.g:8596:3: (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT
            {
            // InternalGumboParser.g:8596:3: (kw= PlusSign | kw= HyphenMinus )?
            int alt152=3;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==PlusSign) ) {
                alt152=1;
            }
            else if ( (LA152_0==HyphenMinus) ) {
                alt152=2;
            }
            switch (alt152) {
                case 1 :
                    // InternalGumboParser.g:8597:4: kw= PlusSign
                    {
                    kw=(Token)match(input,PlusSign,FollowSets000.FOLLOW_103); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSignedRealAccess().getPlusSignKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:8603:4: kw= HyphenMinus
                    {
                    kw=(Token)match(input,HyphenMinus,FollowSets000.FOLLOW_103); if (state.failed) return current;
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
    // InternalGumboParser.g:8620:1: entryRuleNumericRangeTerm returns [EObject current=null] : iv_ruleNumericRangeTerm= ruleNumericRangeTerm EOF ;
    public final EObject entryRuleNumericRangeTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericRangeTerm = null;


        try {
            // InternalGumboParser.g:8620:57: (iv_ruleNumericRangeTerm= ruleNumericRangeTerm EOF )
            // InternalGumboParser.g:8621:2: iv_ruleNumericRangeTerm= ruleNumericRangeTerm EOF
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
    // InternalGumboParser.g:8627:1: ruleNumericRangeTerm returns [EObject current=null] : ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )? ) ;
    public final EObject ruleNumericRangeTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_minimum_0_0 = null;

        EObject lv_maximum_2_0 = null;

        EObject lv_delta_4_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:8633:2: ( ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )? ) )
            // InternalGumboParser.g:8634:2: ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )? )
            {
            // InternalGumboParser.g:8634:2: ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )? )
            // InternalGumboParser.g:8635:3: ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )?
            {
            // InternalGumboParser.g:8635:3: ( (lv_minimum_0_0= ruleNumAlt ) )
            // InternalGumboParser.g:8636:4: (lv_minimum_0_0= ruleNumAlt )
            {
            // InternalGumboParser.g:8636:4: (lv_minimum_0_0= ruleNumAlt )
            // InternalGumboParser.g:8637:5: lv_minimum_0_0= ruleNumAlt
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNumericRangeTermAccess().getMinimumNumAltParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_104);
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

            otherlv_1=(Token)match(input,FullStopFullStop,FollowSets000.FOLLOW_102); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNumericRangeTermAccess().getFullStopFullStopKeyword_1());
              		
            }
            // InternalGumboParser.g:8658:3: ( (lv_maximum_2_0= ruleNumAlt ) )
            // InternalGumboParser.g:8659:4: (lv_maximum_2_0= ruleNumAlt )
            {
            // InternalGumboParser.g:8659:4: (lv_maximum_2_0= ruleNumAlt )
            // InternalGumboParser.g:8660:5: lv_maximum_2_0= ruleNumAlt
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNumericRangeTermAccess().getMaximumNumAltParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_105);
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

            // InternalGumboParser.g:8677:3: (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==Delta) ) {
                alt153=1;
            }
            switch (alt153) {
                case 1 :
                    // InternalGumboParser.g:8678:4: otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) )
                    {
                    otherlv_3=(Token)match(input,Delta,FollowSets000.FOLLOW_102); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getNumericRangeTermAccess().getDeltaKeyword_3_0());
                      			
                    }
                    // InternalGumboParser.g:8682:4: ( (lv_delta_4_0= ruleNumAlt ) )
                    // InternalGumboParser.g:8683:5: (lv_delta_4_0= ruleNumAlt )
                    {
                    // InternalGumboParser.g:8683:5: (lv_delta_4_0= ruleNumAlt )
                    // InternalGumboParser.g:8684:6: lv_delta_4_0= ruleNumAlt
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
    // InternalGumboParser.g:8706:1: entryRuleNumAlt returns [EObject current=null] : iv_ruleNumAlt= ruleNumAlt EOF ;
    public final EObject entryRuleNumAlt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumAlt = null;


        try {
            // InternalGumboParser.g:8706:47: (iv_ruleNumAlt= ruleNumAlt EOF )
            // InternalGumboParser.g:8707:2: iv_ruleNumAlt= ruleNumAlt EOF
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
    // InternalGumboParser.g:8713:1: ruleNumAlt returns [EObject current=null] : (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue ) ;
    public final EObject ruleNumAlt() throws RecognitionException {
        EObject current = null;

        EObject this_RealTerm_0 = null;

        EObject this_IntegerTerm_1 = null;

        EObject this_SignedConstant_2 = null;

        EObject this_ConstantValue_3 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:8719:2: ( (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue ) )
            // InternalGumboParser.g:8720:2: (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue )
            {
            // InternalGumboParser.g:8720:2: (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue )
            int alt154=4;
            switch ( input.LA(1) ) {
            case PlusSign:
                {
                switch ( input.LA(2) ) {
                case RULE_INTEGER_LIT:
                    {
                    alt154=2;
                    }
                    break;
                case RULE_ID:
                    {
                    alt154=3;
                    }
                    break;
                case RULE_REAL_LIT:
                    {
                    alt154=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 154, 1, input);

                    throw nvae;
                }

                }
                break;
            case HyphenMinus:
                {
                switch ( input.LA(2) ) {
                case RULE_REAL_LIT:
                    {
                    alt154=1;
                    }
                    break;
                case RULE_ID:
                    {
                    alt154=3;
                    }
                    break;
                case RULE_INTEGER_LIT:
                    {
                    alt154=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 154, 2, input);

                    throw nvae;
                }

                }
                break;
            case RULE_REAL_LIT:
                {
                alt154=1;
                }
                break;
            case RULE_INTEGER_LIT:
                {
                alt154=2;
                }
                break;
            case RULE_ID:
                {
                alt154=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 154, 0, input);

                throw nvae;
            }

            switch (alt154) {
                case 1 :
                    // InternalGumboParser.g:8721:3: this_RealTerm_0= ruleRealTerm
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
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
                    // InternalGumboParser.g:8733:3: this_IntegerTerm_1= ruleIntegerTerm
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
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
                    // InternalGumboParser.g:8745:3: this_SignedConstant_2= ruleSignedConstant
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
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
                    // InternalGumboParser.g:8757:3: this_ConstantValue_3= ruleConstantValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
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
    // InternalGumboParser.g:8772:1: entryRuleAppliesToKeywords returns [String current=null] : iv_ruleAppliesToKeywords= ruleAppliesToKeywords EOF ;
    public final String entryRuleAppliesToKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAppliesToKeywords = null;


        try {
            // InternalGumboParser.g:8772:57: (iv_ruleAppliesToKeywords= ruleAppliesToKeywords EOF )
            // InternalGumboParser.g:8773:2: iv_ruleAppliesToKeywords= ruleAppliesToKeywords EOF
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
    // InternalGumboParser.g:8779:1: ruleAppliesToKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Applies kw= To ) ;
    public final AntlrDatatypeRuleToken ruleAppliesToKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumboParser.g:8785:2: ( (kw= Applies kw= To ) )
            // InternalGumboParser.g:8786:2: (kw= Applies kw= To )
            {
            // InternalGumboParser.g:8786:2: (kw= Applies kw= To )
            // InternalGumboParser.g:8787:3: kw= Applies kw= To
            {
            kw=(Token)match(input,Applies,FollowSets000.FOLLOW_106); if (state.failed) return current;
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
    // InternalGumboParser.g:8801:1: entryRuleInBindingKeywords returns [String current=null] : iv_ruleInBindingKeywords= ruleInBindingKeywords EOF ;
    public final String entryRuleInBindingKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInBindingKeywords = null;


        try {
            // InternalGumboParser.g:8801:57: (iv_ruleInBindingKeywords= ruleInBindingKeywords EOF )
            // InternalGumboParser.g:8802:2: iv_ruleInBindingKeywords= ruleInBindingKeywords EOF
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
    // InternalGumboParser.g:8808:1: ruleInBindingKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= In_1 kw= Binding ) ;
    public final AntlrDatatypeRuleToken ruleInBindingKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumboParser.g:8814:2: ( (kw= In_1 kw= Binding ) )
            // InternalGumboParser.g:8815:2: (kw= In_1 kw= Binding )
            {
            // InternalGumboParser.g:8815:2: (kw= In_1 kw= Binding )
            // InternalGumboParser.g:8816:3: kw= In_1 kw= Binding
            {
            kw=(Token)match(input,In_1,FollowSets000.FOLLOW_107); if (state.failed) return current;
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
    // InternalGumboParser.g:8830:1: entryRuleInModesKeywords returns [String current=null] : iv_ruleInModesKeywords= ruleInModesKeywords EOF ;
    public final String entryRuleInModesKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInModesKeywords = null;


        try {
            // InternalGumboParser.g:8830:55: (iv_ruleInModesKeywords= ruleInModesKeywords EOF )
            // InternalGumboParser.g:8831:2: iv_ruleInModesKeywords= ruleInModesKeywords EOF
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
    // InternalGumboParser.g:8837:1: ruleInModesKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= In_1 kw= Modes ) ;
    public final AntlrDatatypeRuleToken ruleInModesKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumboParser.g:8843:2: ( (kw= In_1 kw= Modes ) )
            // InternalGumboParser.g:8844:2: (kw= In_1 kw= Modes )
            {
            // InternalGumboParser.g:8844:2: (kw= In_1 kw= Modes )
            // InternalGumboParser.g:8845:3: kw= In_1 kw= Modes
            {
            kw=(Token)match(input,In_1,FollowSets000.FOLLOW_108); if (state.failed) return current;
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
    // InternalGumboParser.g:8859:1: entryRuleINTVALUE returns [String current=null] : iv_ruleINTVALUE= ruleINTVALUE EOF ;
    public final String entryRuleINTVALUE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTVALUE = null;


        try {
            // InternalGumboParser.g:8859:48: (iv_ruleINTVALUE= ruleINTVALUE EOF )
            // InternalGumboParser.g:8860:2: iv_ruleINTVALUE= ruleINTVALUE EOF
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
    // InternalGumboParser.g:8866:1: ruleINTVALUE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INTEGER_LIT_0= RULE_INTEGER_LIT ;
    public final AntlrDatatypeRuleToken ruleINTVALUE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INTEGER_LIT_0=null;


        	enterRule();

        try {
            // InternalGumboParser.g:8872:2: (this_INTEGER_LIT_0= RULE_INTEGER_LIT )
            // InternalGumboParser.g:8873:2: this_INTEGER_LIT_0= RULE_INTEGER_LIT
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


    // $ANTLR start "entryRuleQCLREF"
    // InternalGumboParser.g:8883:1: entryRuleQCLREF returns [String current=null] : iv_ruleQCLREF= ruleQCLREF EOF ;
    public final String entryRuleQCLREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQCLREF = null;


        try {
            // InternalGumboParser.g:8883:46: (iv_ruleQCLREF= ruleQCLREF EOF )
            // InternalGumboParser.g:8884:2: iv_ruleQCLREF= ruleQCLREF EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQCLREFRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleQCLREF=ruleQCLREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQCLREF.getText(); 
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
    // $ANTLR end "entryRuleQCLREF"


    // $ANTLR start "ruleQCLREF"
    // InternalGumboParser.g:8890:1: ruleQCLREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= ColonColon this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleQCLREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalGumboParser.g:8896:2: ( (this_ID_0= RULE_ID kw= ColonColon this_ID_2= RULE_ID ) )
            // InternalGumboParser.g:8897:2: (this_ID_0= RULE_ID kw= ColonColon this_ID_2= RULE_ID )
            {
            // InternalGumboParser.g:8897:2: (this_ID_0= RULE_ID kw= ColonColon this_ID_2= RULE_ID )
            // InternalGumboParser.g:8898:3: this_ID_0= RULE_ID kw= ColonColon this_ID_2= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_109); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQCLREFAccess().getIDTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,ColonColon,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getQCLREFAccess().getColonColonKeyword_1());
              		
            }
            this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_2, grammarAccess.getQCLREFAccess().getIDTerminalRuleCall_2());
              		
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
    // $ANTLR end "ruleQCLREF"


    // $ANTLR start "entryRuleQPREF"
    // InternalGumboParser.g:8921:1: entryRuleQPREF returns [String current=null] : iv_ruleQPREF= ruleQPREF EOF ;
    public final String entryRuleQPREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQPREF = null;


        try {
            // InternalGumboParser.g:8921:45: (iv_ruleQPREF= ruleQPREF EOF )
            // InternalGumboParser.g:8922:2: iv_ruleQPREF= ruleQPREF EOF
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
    // InternalGumboParser.g:8928:1: ruleQPREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleQPREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalGumboParser.g:8934:2: ( (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )? ) )
            // InternalGumboParser.g:8935:2: (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )? )
            {
            // InternalGumboParser.g:8935:2: (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )? )
            // InternalGumboParser.g:8936:3: this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_110); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQPREFAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalGumboParser.g:8943:3: (kw= ColonColon this_ID_2= RULE_ID )?
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==ColonColon) ) {
                alt155=1;
            }
            switch (alt155) {
                case 1 :
                    // InternalGumboParser.g:8944:4: kw= ColonColon this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,ColonColon,FollowSets000.FOLLOW_8); if (state.failed) return current;
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
    // InternalGumboParser.g:8961:1: entryRuleQCREF returns [String current=null] : iv_ruleQCREF= ruleQCREF EOF ;
    public final String entryRuleQCREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQCREF = null;


        try {
            // InternalGumboParser.g:8961:45: (iv_ruleQCREF= ruleQCREF EOF )
            // InternalGumboParser.g:8962:2: iv_ruleQCREF= ruleQCREF EOF
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
    // InternalGumboParser.g:8968:1: ruleQCREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleQCREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;


        	enterRule();

        try {
            // InternalGumboParser.g:8974:2: ( ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? ) )
            // InternalGumboParser.g:8975:2: ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? )
            {
            // InternalGumboParser.g:8975:2: ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? )
            // InternalGumboParser.g:8976:3: (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )?
            {
            // InternalGumboParser.g:8976:3: (this_ID_0= RULE_ID kw= ColonColon )*
            loop156:
            do {
                int alt156=2;
                int LA156_0 = input.LA(1);

                if ( (LA156_0==RULE_ID) ) {
                    int LA156_1 = input.LA(2);

                    if ( (LA156_1==ColonColon) ) {
                        alt156=1;
                    }


                }


                switch (alt156) {
            	case 1 :
            	    // InternalGumboParser.g:8977:4: this_ID_0= RULE_ID kw= ColonColon
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_109); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_0);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_0, grammarAccess.getQCREFAccess().getIDTerminalRuleCall_0_0());
            	      			
            	    }
            	    kw=(Token)match(input,ColonColon,FollowSets000.FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQCREFAccess().getColonColonKeyword_0_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop156;
                }
            } while (true);

            this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_2, grammarAccess.getQCREFAccess().getIDTerminalRuleCall_1());
              		
            }
            // InternalGumboParser.g:8997:3: (kw= FullStop this_ID_4= RULE_ID )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==FullStop) ) {
                alt157=1;
            }
            switch (alt157) {
                case 1 :
                    // InternalGumboParser.g:8998:4: kw= FullStop this_ID_4= RULE_ID
                    {
                    kw=(Token)match(input,FullStop,FollowSets000.FOLLOW_8); if (state.failed) return current;
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
    // InternalGumboParser.g:9015:1: entryRuleSTAR returns [String current=null] : iv_ruleSTAR= ruleSTAR EOF ;
    public final String entryRuleSTAR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSTAR = null;


        try {
            // InternalGumboParser.g:9015:44: (iv_ruleSTAR= ruleSTAR EOF )
            // InternalGumboParser.g:9016:2: iv_ruleSTAR= ruleSTAR EOF
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
    // InternalGumboParser.g:9022:1: ruleSTAR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= Asterisk ;
    public final AntlrDatatypeRuleToken ruleSTAR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumboParser.g:9028:2: (kw= Asterisk )
            // InternalGumboParser.g:9029:2: kw= Asterisk
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

    // $ANTLR start synpred26_InternalGumboParser
    public final void synpred26_InternalGumboParser_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        EObject lv_path_3_0 = null;


        // InternalGumboParser.g:1389:4: (otherlv_2= FullStop ( (lv_path_3_0= ruleOtherDataRef ) ) )
        // InternalGumboParser.g:1389:4: otherlv_2= FullStop ( (lv_path_3_0= ruleOtherDataRef ) )
        {
        otherlv_2=(Token)match(input,FullStop,FollowSets000.FOLLOW_8); if (state.failed) return ;
        // InternalGumboParser.g:1393:4: ( (lv_path_3_0= ruleOtherDataRef ) )
        // InternalGumboParser.g:1394:5: (lv_path_3_0= ruleOtherDataRef )
        {
        // InternalGumboParser.g:1394:5: (lv_path_3_0= ruleOtherDataRef )
        // InternalGumboParser.g:1395:6: lv_path_3_0= ruleOtherDataRef
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getOtherDataRefAccess().getPathOtherDataRefParserRuleCall_1_1_0());
          					
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_path_3_0=ruleOtherDataRef();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred26_InternalGumboParser

    // $ANTLR start synpred128_InternalGumboParser
    public final void synpred128_InternalGumboParser_fragment() throws RecognitionException {   
        EObject lv_callSuffix_30_0 = null;


        // InternalGumboParser.g:5243:3: ( ( ( ( () ( ( ruleQCREF ) ) ( ( ruleSlangCallSuffix ) ) ) )=> ( () ( ( ruleQCREF ) ) ( (lv_callSuffix_30_0= ruleSlangCallSuffix ) ) ) ) )
        // InternalGumboParser.g:5243:3: ( ( ( () ( ( ruleQCREF ) ) ( ( ruleSlangCallSuffix ) ) ) )=> ( () ( ( ruleQCREF ) ) ( (lv_callSuffix_30_0= ruleSlangCallSuffix ) ) ) )
        {
        // InternalGumboParser.g:5243:3: ( ( ( () ( ( ruleQCREF ) ) ( ( ruleSlangCallSuffix ) ) ) )=> ( () ( ( ruleQCREF ) ) ( (lv_callSuffix_30_0= ruleSlangCallSuffix ) ) ) )
        // InternalGumboParser.g:5244:4: ( ( () ( ( ruleQCREF ) ) ( ( ruleSlangCallSuffix ) ) ) )=> ( () ( ( ruleQCREF ) ) ( (lv_callSuffix_30_0= ruleSlangCallSuffix ) ) )
        {
        // InternalGumboParser.g:5259:4: ( () ( ( ruleQCREF ) ) ( (lv_callSuffix_30_0= ruleSlangCallSuffix ) ) )
        // InternalGumboParser.g:5260:5: () ( ( ruleQCREF ) ) ( (lv_callSuffix_30_0= ruleSlangCallSuffix ) )
        {
        // InternalGumboParser.g:5260:5: ()
        // InternalGumboParser.g:5261:6: 
        {
        if ( state.backtracking==0 ) {

          						/* */
          					
        }

        }

        // InternalGumboParser.g:5270:5: ( ( ruleQCREF ) )
        // InternalGumboParser.g:5271:6: ( ruleQCREF )
        {
        // InternalGumboParser.g:5271:6: ( ruleQCREF )
        // InternalGumboParser.g:5272:7: ruleQCREF
        {
        if ( state.backtracking==0 ) {

          							/* */
          						
        }
        pushFollow(FollowSets000.FOLLOW_35);
        ruleQCREF();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalGumboParser.g:5289:5: ( (lv_callSuffix_30_0= ruleSlangCallSuffix ) )
        // InternalGumboParser.g:5290:6: (lv_callSuffix_30_0= ruleSlangCallSuffix )
        {
        // InternalGumboParser.g:5290:6: (lv_callSuffix_30_0= ruleSlangCallSuffix )
        // InternalGumboParser.g:5291:7: lv_callSuffix_30_0= ruleSlangCallSuffix
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getSlangTermAccess().getCallSuffixSlangCallSuffixParserRuleCall_6_0_2_0());
          						
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_callSuffix_30_0=ruleSlangCallSuffix();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred128_InternalGumboParser

    // $ANTLR start synpred130_InternalGumboParser
    public final void synpred130_InternalGumboParser_fragment() throws RecognitionException {   
        Token otherlv_33=null;
        Token otherlv_34=null;

        // InternalGumboParser.g:5311:3: ( ( ( ( ( () ( ( ruleQCLREF ) ) FullStop ) )=> ( () ( ( ruleQCLREF ) ) otherlv_33= FullStop ) ) ( (otherlv_34= RULE_ID ) ) ) )
        // InternalGumboParser.g:5311:3: ( ( ( ( () ( ( ruleQCLREF ) ) FullStop ) )=> ( () ( ( ruleQCLREF ) ) otherlv_33= FullStop ) ) ( (otherlv_34= RULE_ID ) ) )
        {
        // InternalGumboParser.g:5311:3: ( ( ( ( () ( ( ruleQCLREF ) ) FullStop ) )=> ( () ( ( ruleQCLREF ) ) otherlv_33= FullStop ) ) ( (otherlv_34= RULE_ID ) ) )
        // InternalGumboParser.g:5312:4: ( ( ( () ( ( ruleQCLREF ) ) FullStop ) )=> ( () ( ( ruleQCLREF ) ) otherlv_33= FullStop ) ) ( (otherlv_34= RULE_ID ) )
        {
        // InternalGumboParser.g:5312:4: ( ( ( () ( ( ruleQCLREF ) ) FullStop ) )=> ( () ( ( ruleQCLREF ) ) otherlv_33= FullStop ) )
        // InternalGumboParser.g:5313:5: ( ( () ( ( ruleQCLREF ) ) FullStop ) )=> ( () ( ( ruleQCLREF ) ) otherlv_33= FullStop )
        {
        // InternalGumboParser.g:5324:5: ( () ( ( ruleQCLREF ) ) otherlv_33= FullStop )
        // InternalGumboParser.g:5325:6: () ( ( ruleQCLREF ) ) otherlv_33= FullStop
        {
        // InternalGumboParser.g:5325:6: ()
        // InternalGumboParser.g:5326:7: 
        {
        if ( state.backtracking==0 ) {

          							/* */
          						
        }

        }

        // InternalGumboParser.g:5335:6: ( ( ruleQCLREF ) )
        // InternalGumboParser.g:5336:7: ( ruleQCLREF )
        {
        // InternalGumboParser.g:5336:7: ( ruleQCLREF )
        // InternalGumboParser.g:5337:8: ruleQCLREF
        {
        if ( state.backtracking==0 ) {

          								/* */
          							
        }
        pushFollow(FollowSets000.FOLLOW_82);
        ruleQCLREF();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_33=(Token)match(input,FullStop,FollowSets000.FOLLOW_8); if (state.failed) return ;

        }


        }

        // InternalGumboParser.g:5360:4: ( (otherlv_34= RULE_ID ) )
        // InternalGumboParser.g:5361:5: (otherlv_34= RULE_ID )
        {
        // InternalGumboParser.g:5361:5: (otherlv_34= RULE_ID )
        // InternalGumboParser.g:5362:6: otherlv_34= RULE_ID
        {
        if ( state.backtracking==0 ) {

          						/* */
          					
        }
        otherlv_34=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred130_InternalGumboParser

    // $ANTLR start synpred133_InternalGumboParser
    public final void synpred133_InternalGumboParser_fragment() throws RecognitionException {   
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        EObject lv_recordType_36_0 = null;

        EObject lv_argExpr_40_0 = null;

        EObject lv_argExpr_44_0 = null;


        // InternalGumboParser.g:5378:3: ( ( ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_36_0= ruleDataElement ) ) otherlv_37= LeftCurlyBracket ( (otherlv_38= RULE_ID ) ) otherlv_39= EqualsSign ) ) ( (lv_argExpr_40_0= ruleExpr ) ) (otherlv_41= Semicolon ( (otherlv_42= RULE_ID ) ) otherlv_43= EqualsSign ( (lv_argExpr_44_0= ruleExpr ) ) )* otherlv_45= RightCurlyBracket ) )
        // InternalGumboParser.g:5378:3: ( ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_36_0= ruleDataElement ) ) otherlv_37= LeftCurlyBracket ( (otherlv_38= RULE_ID ) ) otherlv_39= EqualsSign ) ) ( (lv_argExpr_40_0= ruleExpr ) ) (otherlv_41= Semicolon ( (otherlv_42= RULE_ID ) ) otherlv_43= EqualsSign ( (lv_argExpr_44_0= ruleExpr ) ) )* otherlv_45= RightCurlyBracket )
        {
        // InternalGumboParser.g:5378:3: ( ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_36_0= ruleDataElement ) ) otherlv_37= LeftCurlyBracket ( (otherlv_38= RULE_ID ) ) otherlv_39= EqualsSign ) ) ( (lv_argExpr_40_0= ruleExpr ) ) (otherlv_41= Semicolon ( (otherlv_42= RULE_ID ) ) otherlv_43= EqualsSign ( (lv_argExpr_44_0= ruleExpr ) ) )* otherlv_45= RightCurlyBracket )
        // InternalGumboParser.g:5379:4: ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_36_0= ruleDataElement ) ) otherlv_37= LeftCurlyBracket ( (otherlv_38= RULE_ID ) ) otherlv_39= EqualsSign ) ) ( (lv_argExpr_40_0= ruleExpr ) ) (otherlv_41= Semicolon ( (otherlv_42= RULE_ID ) ) otherlv_43= EqualsSign ( (lv_argExpr_44_0= ruleExpr ) ) )* otherlv_45= RightCurlyBracket
        {
        // InternalGumboParser.g:5379:4: ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_36_0= ruleDataElement ) ) otherlv_37= LeftCurlyBracket ( (otherlv_38= RULE_ID ) ) otherlv_39= EqualsSign ) )
        // InternalGumboParser.g:5380:5: ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_36_0= ruleDataElement ) ) otherlv_37= LeftCurlyBracket ( (otherlv_38= RULE_ID ) ) otherlv_39= EqualsSign )
        {
        // InternalGumboParser.g:5397:5: ( () ( (lv_recordType_36_0= ruleDataElement ) ) otherlv_37= LeftCurlyBracket ( (otherlv_38= RULE_ID ) ) otherlv_39= EqualsSign )
        // InternalGumboParser.g:5398:6: () ( (lv_recordType_36_0= ruleDataElement ) ) otherlv_37= LeftCurlyBracket ( (otherlv_38= RULE_ID ) ) otherlv_39= EqualsSign
        {
        // InternalGumboParser.g:5398:6: ()
        // InternalGumboParser.g:5399:7: 
        {
        if ( state.backtracking==0 ) {

          							/* */
          						
        }

        }

        // InternalGumboParser.g:5408:6: ( (lv_recordType_36_0= ruleDataElement ) )
        // InternalGumboParser.g:5409:7: (lv_recordType_36_0= ruleDataElement )
        {
        // InternalGumboParser.g:5409:7: (lv_recordType_36_0= ruleDataElement )
        // InternalGumboParser.g:5410:8: lv_recordType_36_0= ruleDataElement
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getSlangTermAccess().getRecordTypeDataElementParserRuleCall_8_0_0_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_56);
        lv_recordType_36_0=ruleDataElement();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_37=(Token)match(input,LeftCurlyBracket,FollowSets000.FOLLOW_8); if (state.failed) return ;
        // InternalGumboParser.g:5431:6: ( (otherlv_38= RULE_ID ) )
        // InternalGumboParser.g:5432:7: (otherlv_38= RULE_ID )
        {
        // InternalGumboParser.g:5432:7: (otherlv_38= RULE_ID )
        // InternalGumboParser.g:5433:8: otherlv_38= RULE_ID
        {
        if ( state.backtracking==0 ) {

          								/* */
          							
        }
        otherlv_38=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_83); if (state.failed) return ;

        }


        }

        otherlv_39=(Token)match(input,EqualsSign,FollowSets000.FOLLOW_15); if (state.failed) return ;

        }


        }

        // InternalGumboParser.g:5453:4: ( (lv_argExpr_40_0= ruleExpr ) )
        // InternalGumboParser.g:5454:5: (lv_argExpr_40_0= ruleExpr )
        {
        // InternalGumboParser.g:5454:5: (lv_argExpr_40_0= ruleExpr )
        // InternalGumboParser.g:5455:6: lv_argExpr_40_0= ruleExpr
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getSlangTermAccess().getArgExprExprParserRuleCall_8_1_0());
          					
        }
        pushFollow(FollowSets000.FOLLOW_84);
        lv_argExpr_40_0=ruleExpr();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalGumboParser.g:5472:4: (otherlv_41= Semicolon ( (otherlv_42= RULE_ID ) ) otherlv_43= EqualsSign ( (lv_argExpr_44_0= ruleExpr ) ) )*
        loop187:
        do {
            int alt187=2;
            int LA187_0 = input.LA(1);

            if ( (LA187_0==Semicolon) ) {
                alt187=1;
            }


            switch (alt187) {
        	case 1 :
        	    // InternalGumboParser.g:5473:5: otherlv_41= Semicolon ( (otherlv_42= RULE_ID ) ) otherlv_43= EqualsSign ( (lv_argExpr_44_0= ruleExpr ) )
        	    {
        	    otherlv_41=(Token)match(input,Semicolon,FollowSets000.FOLLOW_8); if (state.failed) return ;
        	    // InternalGumboParser.g:5477:5: ( (otherlv_42= RULE_ID ) )
        	    // InternalGumboParser.g:5478:6: (otherlv_42= RULE_ID )
        	    {
        	    // InternalGumboParser.g:5478:6: (otherlv_42= RULE_ID )
        	    // InternalGumboParser.g:5479:7: otherlv_42= RULE_ID
        	    {
        	    if ( state.backtracking==0 ) {

        	      							/* */
        	      						
        	    }
        	    otherlv_42=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_83); if (state.failed) return ;

        	    }


        	    }

        	    otherlv_43=(Token)match(input,EqualsSign,FollowSets000.FOLLOW_15); if (state.failed) return ;
        	    // InternalGumboParser.g:5497:5: ( (lv_argExpr_44_0= ruleExpr ) )
        	    // InternalGumboParser.g:5498:6: (lv_argExpr_44_0= ruleExpr )
        	    {
        	    // InternalGumboParser.g:5498:6: (lv_argExpr_44_0= ruleExpr )
        	    // InternalGumboParser.g:5499:7: lv_argExpr_44_0= ruleExpr
        	    {
        	    if ( state.backtracking==0 ) {

        	      							newCompositeNode(grammarAccess.getSlangTermAccess().getArgExprExprParserRuleCall_8_2_3_0());
        	      						
        	    }
        	    pushFollow(FollowSets000.FOLLOW_84);
        	    lv_argExpr_44_0=ruleExpr();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop187;
            }
        } while (true);

        otherlv_45=(Token)match(input,RightCurlyBracket,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred133_InternalGumboParser

    // $ANTLR start synpred134_InternalGumboParser
    public final void synpred134_InternalGumboParser_fragment() throws RecognitionException {   
        Token otherlv_48=null;
        EObject lv_ref_49_0 = null;


        // InternalGumboParser.g:5551:5: (otherlv_48= FullStop ( (lv_ref_49_0= ruleOtherDataRef ) ) )
        // InternalGumboParser.g:5551:5: otherlv_48= FullStop ( (lv_ref_49_0= ruleOtherDataRef ) )
        {
        otherlv_48=(Token)match(input,FullStop,FollowSets000.FOLLOW_8); if (state.failed) return ;
        // InternalGumboParser.g:5555:5: ( (lv_ref_49_0= ruleOtherDataRef ) )
        // InternalGumboParser.g:5556:6: (lv_ref_49_0= ruleOtherDataRef )
        {
        // InternalGumboParser.g:5556:6: (lv_ref_49_0= ruleOtherDataRef )
        // InternalGumboParser.g:5557:7: lv_ref_49_0= ruleOtherDataRef
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getSlangTermAccess().getRefOtherDataRefParserRuleCall_9_2_1_0());
          						
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_ref_49_0=ruleOtherDataRef();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred134_InternalGumboParser

    // $ANTLR start synpred135_InternalGumboParser
    public final void synpred135_InternalGumboParser_fragment() throws RecognitionException {   
        Token otherlv_47=null;
        Token otherlv_48=null;
        EObject lv_ref_49_0 = null;


        // InternalGumboParser.g:5523:3: ( ( () ( (otherlv_47= RULE_ID ) ) (otherlv_48= FullStop ( (lv_ref_49_0= ruleOtherDataRef ) ) )? ) )
        // InternalGumboParser.g:5523:3: ( () ( (otherlv_47= RULE_ID ) ) (otherlv_48= FullStop ( (lv_ref_49_0= ruleOtherDataRef ) ) )? )
        {
        // InternalGumboParser.g:5523:3: ( () ( (otherlv_47= RULE_ID ) ) (otherlv_48= FullStop ( (lv_ref_49_0= ruleOtherDataRef ) ) )? )
        // InternalGumboParser.g:5524:4: () ( (otherlv_47= RULE_ID ) ) (otherlv_48= FullStop ( (lv_ref_49_0= ruleOtherDataRef ) ) )?
        {
        // InternalGumboParser.g:5524:4: ()
        // InternalGumboParser.g:5525:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalGumboParser.g:5534:4: ( (otherlv_47= RULE_ID ) )
        // InternalGumboParser.g:5535:5: (otherlv_47= RULE_ID )
        {
        // InternalGumboParser.g:5535:5: (otherlv_47= RULE_ID )
        // InternalGumboParser.g:5536:6: otherlv_47= RULE_ID
        {
        if ( state.backtracking==0 ) {

          						/* */
          					
        }
        otherlv_47=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_54); if (state.failed) return ;

        }


        }

        // InternalGumboParser.g:5550:4: (otherlv_48= FullStop ( (lv_ref_49_0= ruleOtherDataRef ) ) )?
        int alt188=2;
        int LA188_0 = input.LA(1);

        if ( (LA188_0==FullStop) ) {
            alt188=1;
        }
        switch (alt188) {
            case 1 :
                // InternalGumboParser.g:5551:5: otherlv_48= FullStop ( (lv_ref_49_0= ruleOtherDataRef ) )
                {
                otherlv_48=(Token)match(input,FullStop,FollowSets000.FOLLOW_8); if (state.failed) return ;
                // InternalGumboParser.g:5555:5: ( (lv_ref_49_0= ruleOtherDataRef ) )
                // InternalGumboParser.g:5556:6: (lv_ref_49_0= ruleOtherDataRef )
                {
                // InternalGumboParser.g:5556:6: (lv_ref_49_0= ruleOtherDataRef )
                // InternalGumboParser.g:5557:7: lv_ref_49_0= ruleOtherDataRef
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getSlangTermAccess().getRefOtherDataRefParserRuleCall_9_2_1_0());
                  						
                }
                pushFollow(FollowSets000.FOLLOW_2);
                lv_ref_49_0=ruleOtherDataRef();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred135_InternalGumboParser

    // $ANTLR start synpred142_InternalGumboParser
    public final void synpred142_InternalGumboParser_fragment() throws RecognitionException {   
        Token otherlv_69=null;
        Token otherlv_71=null;
        EObject lv_p_68_0 = null;

        EObject lv_e_70_0 = null;


        // InternalGumboParser.g:5774:5: ( ( ( ( (lv_p_68_0= ruleSlangParams ) ) otherlv_69= EqualsSignGreaterThanSign )? ( (lv_e_70_0= ruleExpr ) ) otherlv_71= RightCurlyBracket ) )
        // InternalGumboParser.g:5774:5: ( ( ( (lv_p_68_0= ruleSlangParams ) ) otherlv_69= EqualsSignGreaterThanSign )? ( (lv_e_70_0= ruleExpr ) ) otherlv_71= RightCurlyBracket )
        {
        // InternalGumboParser.g:5774:5: ( ( ( (lv_p_68_0= ruleSlangParams ) ) otherlv_69= EqualsSignGreaterThanSign )? ( (lv_e_70_0= ruleExpr ) ) otherlv_71= RightCurlyBracket )
        // InternalGumboParser.g:5775:6: ( ( (lv_p_68_0= ruleSlangParams ) ) otherlv_69= EqualsSignGreaterThanSign )? ( (lv_e_70_0= ruleExpr ) ) otherlv_71= RightCurlyBracket
        {
        // InternalGumboParser.g:5775:6: ( ( (lv_p_68_0= ruleSlangParams ) ) otherlv_69= EqualsSignGreaterThanSign )?
        int alt192=2;
        int LA192_0 = input.LA(1);

        if ( (LA192_0==LeftParenthesis) ) {
            int LA192_1 = input.LA(2);

            if ( (LA192_1==RULE_ID) ) {
                int LA192_3 = input.LA(3);

                if ( (LA192_3==Colon) ) {
                    alt192=1;
                }
            }
            else if ( (LA192_1==Var) ) {
                alt192=1;
            }
        }
        switch (alt192) {
            case 1 :
                // InternalGumboParser.g:5776:7: ( (lv_p_68_0= ruleSlangParams ) ) otherlv_69= EqualsSignGreaterThanSign
                {
                // InternalGumboParser.g:5776:7: ( (lv_p_68_0= ruleSlangParams ) )
                // InternalGumboParser.g:5777:8: (lv_p_68_0= ruleSlangParams )
                {
                // InternalGumboParser.g:5777:8: (lv_p_68_0= ruleSlangParams )
                // InternalGumboParser.g:5778:9: lv_p_68_0= ruleSlangParams
                {
                if ( state.backtracking==0 ) {

                  									newCompositeNode(grammarAccess.getSlangTermAccess().getPSlangParamsParserRuleCall_12_2_0_0_0_0());
                  								
                }
                pushFollow(FollowSets000.FOLLOW_67);
                lv_p_68_0=ruleSlangParams();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                otherlv_69=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_15); if (state.failed) return ;

                }
                break;

        }

        // InternalGumboParser.g:5800:6: ( (lv_e_70_0= ruleExpr ) )
        // InternalGumboParser.g:5801:7: (lv_e_70_0= ruleExpr )
        {
        // InternalGumboParser.g:5801:7: (lv_e_70_0= ruleExpr )
        // InternalGumboParser.g:5802:8: lv_e_70_0= ruleExpr
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getSlangTermAccess().getEExprParserRuleCall_12_2_0_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_80);
        lv_e_70_0=ruleExpr();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_71=(Token)match(input,RightCurlyBracket,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred142_InternalGumboParser

    // Delegated rules

    public final boolean synpred134_InternalGumboParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred134_InternalGumboParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred133_InternalGumboParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred133_InternalGumboParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred142_InternalGumboParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred142_InternalGumboParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred128_InternalGumboParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred128_InternalGumboParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalGumboParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalGumboParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred130_InternalGumboParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred130_InternalGumboParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred135_InternalGumboParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred135_InternalGumboParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA113 dfa113 = new DFA113(this);
    protected DFA112 dfa112 = new DFA112(this);
    protected DFA140 dfa140 = new DFA140(this);
    static final String dfa_1s = "\32\uffff";
    static final String dfa_2s = "\1\16\21\uffff\1\0\7\uffff";
    static final String dfa_3s = "\1\160\21\uffff\1\0\7\uffff";
    static final String dfa_4s = "\1\uffff\1\1\11\uffff\1\2\2\uffff\1\3\1\4\1\5\1\6\1\uffff\1\13\1\14\1\15\1\7\1\10\1\11\1\12";
    static final String dfa_5s = "\22\uffff\1\0\7\uffff}>";
    static final String[] dfa_6s = {
            "\1\20\3\uffff\1\17\4\uffff\1\21\27\uffff\1\24\14\uffff\1\16\1\uffff\1\23\12\uffff\2\1\3\uffff\1\25\4\uffff\2\1\2\uffff\3\13\10\uffff\6\1\10\uffff\1\22",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
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

    class DFA113 extends DFA {

        public DFA113(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 113;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "4920:2: ( ( () ( (lv_lit_1_0= ruleSlangLit ) ) ) | ( () ( (lv_i_3_0= ruleSlangInterp ) ) ) | ( ( ( ( () In_1 LeftParenthesis ) )=> ( () otherlv_5= In_1 otherlv_6= LeftParenthesis ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= RightParenthesis ) | ( ( ( ( () MaySend LeftParenthesis ) )=> ( () otherlv_10= MaySend otherlv_11= LeftParenthesis ) ) ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (lv_value_14_0= ruleExpr ) ) )? otherlv_15= RightParenthesis ) | ( ( ( ( () MustSend LeftParenthesis ) )=> ( () otherlv_17= MustSend otherlv_18= LeftParenthesis ) ) ( (otherlv_19= RULE_ID ) ) (otherlv_20= Comma ( (lv_value_21_0= ruleExpr ) ) )? otherlv_22= RightParenthesis ) | ( ( ( ( () NoSend LeftParenthesis ) )=> ( () otherlv_24= NoSend otherlv_25= LeftParenthesis ) ) ( (otherlv_26= RULE_ID ) ) otherlv_27= RightParenthesis ) | ( ( ( () ( ( ruleQCREF ) ) ( ( ruleSlangCallSuffix ) ) ) )=> ( () ( ( ruleQCREF ) ) ( (lv_callSuffix_30_0= ruleSlangCallSuffix ) ) ) ) | ( ( ( ( () ( ( ruleQCLREF ) ) FullStop ) )=> ( () ( ( ruleQCLREF ) ) otherlv_33= FullStop ) ) ( (otherlv_34= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_36_0= ruleDataElement ) ) otherlv_37= LeftCurlyBracket ( (otherlv_38= RULE_ID ) ) otherlv_39= EqualsSign ) ) ( (lv_argExpr_40_0= ruleExpr ) ) (otherlv_41= Semicolon ( (otherlv_42= RULE_ID ) ) otherlv_43= EqualsSign ( (lv_argExpr_44_0= ruleExpr ) ) )* otherlv_45= RightCurlyBracket ) | ( () ( (otherlv_47= RULE_ID ) ) (otherlv_48= FullStop ( (lv_ref_49_0= ruleOtherDataRef ) ) )? ) | ( () otherlv_51= LeftParenthesis ( (lv_e_52_0= ruleExpr ) ) (otherlv_53= Comma ( (lv_e_54_0= ruleExpr ) ) )* otherlv_55= RightParenthesis ) | ( () otherlv_57= For ( (lv_r_58_0= ruleSlangForRange ) ) (otherlv_59= Comma ( (lv_r_60_0= ruleSlangForRange ) ) )* otherlv_61= Yield ( ( (lv_b_62_0= ruleSlangBlock ) ) | (otherlv_63= LeftParenthesis ( (lv_e_64_0= ruleExpr ) ) otherlv_65= RightParenthesis ) ) ) | ( () otherlv_67= LeftCurlyBracket ( ( ( ( (lv_p_68_0= ruleSlangParams ) ) otherlv_69= EqualsSignGreaterThanSign )? ( (lv_e_70_0= ruleExpr ) ) otherlv_71= RightCurlyBracket ) | ( ( (lv_stmt_72_0= ruleSlangStmt ) )* ( (lv_r_73_0= ruleSlangRet ) )? otherlv_74= RightCurlyBracket ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA113_18 = input.LA(1);

                         
                        int index113_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred128_InternalGumboParser()) ) {s = 22;}

                        else if ( (synpred130_InternalGumboParser()) ) {s = 23;}

                        else if ( (synpred133_InternalGumboParser()) ) {s = 24;}

                        else if ( (synpred135_InternalGumboParser()) ) {s = 25;}

                         
                        input.seek(index113_18);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 113, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\54\uffff";
    static final String dfa_8s = "\1\16\22\uffff\1\0\30\uffff";
    static final String dfa_9s = "\1\160\22\uffff\1\0\30\uffff";
    static final String dfa_10s = "\1\uffff\1\1\36\uffff\1\2\13\uffff";
    static final String dfa_11s = "\23\uffff\1\0\30\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\3\uffff\1\1\4\uffff\1\1\2\40\1\uffff\1\40\1\1\3\uffff\1\40\3\uffff\1\40\1\uffff\1\1\2\uffff\2\40\4\uffff\1\1\2\uffff\2\40\6\uffff\2\40\1\1\1\uffff\1\1\1\uffff\2\1\1\uffff\1\1\5\uffff\2\1\3\uffff\1\1\1\40\2\1\1\uffff\2\1\2\uffff\3\1\4\uffff\3\1\1\uffff\6\1\10\uffff\1\23",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA112 extends DFA {

        public DFA112(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 112;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "5773:4: ( ( ( ( (lv_p_68_0= ruleSlangParams ) ) otherlv_69= EqualsSignGreaterThanSign )? ( (lv_e_70_0= ruleExpr ) ) otherlv_71= RightCurlyBracket ) | ( ( (lv_stmt_72_0= ruleSlangStmt ) )* ( (lv_r_73_0= ruleSlangRet ) )? otherlv_74= RightCurlyBracket ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA112_19 = input.LA(1);

                         
                        int index112_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred142_InternalGumboParser()) ) {s = 1;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index112_19);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 112, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_13s = "\25\uffff";
    static final String dfa_14s = "\10\uffff\1\17\1\21\1\23\3\uffff\1\17\1\uffff\1\21\3\uffff\1\23";
    static final String dfa_15s = "\1\6\5\uffff\2\144\3\23\3\uffff\1\23\1\uffff\1\23\1\uffff\1\160\1\uffff\1\23";
    static final String dfa_16s = "\1\160\5\uffff\4\160\1\106\3\uffff\1\106\1\uffff\1\106\1\uffff\1\160\1\uffff\1\106";
    static final String dfa_17s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\5\uffff\1\11\1\12\1\6\1\uffff\1\7\1\uffff\1\10\1\uffff\1\13\1\uffff";
    static final String dfa_18s = "\25\uffff}>";
    static final String[] dfa_19s = {
            "\1\3\6\uffff\1\2\7\uffff\1\4\11\uffff\1\14\13\uffff\1\14\22\uffff\1\13\2\uffff\1\6\1\uffff\1\7\7\uffff\1\1\30\uffff\1\11\1\uffff\1\10\10\uffff\1\5\1\12",
            "",
            "",
            "",
            "",
            "",
            "\1\11\1\uffff\1\10\11\uffff\1\15",
            "\1\11\1\uffff\1\10\11\uffff\1\15",
            "\1\17\40\uffff\1\15\7\uffff\1\17\2\uffff\1\17\2\uffff\1\17\3\uffff\1\17\51\uffff\1\16",
            "\1\21\40\uffff\1\15\7\uffff\1\21\2\uffff\1\21\2\uffff\1\21\3\uffff\1\21\51\uffff\1\20",
            "\1\23\40\uffff\1\15\1\22\6\uffff\1\23\2\uffff\1\23\2\uffff\1\23\3\uffff\1\23",
            "",
            "",
            "",
            "\1\17\40\uffff\1\15\7\uffff\1\17\2\uffff\1\17\2\uffff\1\17\3\uffff\1\17",
            "",
            "\1\21\40\uffff\1\15\7\uffff\1\21\2\uffff\1\21\2\uffff\1\21\3\uffff\1\21",
            "",
            "\1\24",
            "",
            "\1\23\40\uffff\1\15\7\uffff\1\23\2\uffff\1\23\2\uffff\1\23\3\uffff\1\23"
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA140 extends DFA {

        public DFA140(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 140;
            this.eot = dfa_13;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "7527:2: (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000002005A2L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000002001A2L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000002000A2L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200082L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0001000000000002L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080020L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x5000804010844000L,0x000100FDC39B460BL});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000800L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000802L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002010800L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002010802L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000026010802L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000026000802L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008024000002L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000810L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000400000000010L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000400000000012L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x5000804010844010L,0x000100FDC39B460BL});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000820L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000800L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x4000000000000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0040040000000000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x8000000000000000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x8000000000000000L,0x0001000000000000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0100000000000000L,0x0001000000000000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0002000000000000L,0x0001000000000000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001004L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000008400430002L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000430002L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000410002L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000420002L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000010000000002L});
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000011000L,0x0000000000004000L});
        public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000008000000000L,0x0000000000008000L});
        public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
        public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x4040000000000002L,0x0000000020000030L});
        public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x4040000000000002L,0x0000000020000010L});
        public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0800000000000000L,0x0000000000004000L});
        public static final BitSet FOLLOW_64 = new BitSet(new long[]{0xD000804010844000L,0x000100FDC39B460BL});
        public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x4000000000000000L,0x0001000000000000L});
        public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0900000000000000L});
        public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0C0C061103000002L,0x0001000000000000L});
        public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x4000000000000002L});
        public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x4000000000000000L,0x0001000000002000L});
        public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x4000000000000002L,0x0000000000000020L});
        public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
        public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x5000804010844002L,0x000100FDC39B470BL});
        public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x5000800000844000L,0x000100FC03984600L});
        public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x5000804010844002L,0x000100FDC39B460BL});
        public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0010200000000002L});
        public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0C0C06110B000000L,0x0001000000008000L});
        public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
        public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x4000000000000002L,0x0000000000000800L});
        public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
        public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008040L});
        public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x4000000000000000L,0x0000000000004000L});
        public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x5C0C86511B844000L,0x000100FDC39BC60BL});
        public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0008000000000000L,0x0001000000000000L});
        public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0200000000000002L});
        public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0040000000000002L});
        public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000000L,0x000000000C000000L});
        public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0100100000000000L});
        public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x400008008020A040L,0x000180500000080AL});
        public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x1000000000080000L,0x0000000000000044L});
        public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000044L});
        public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x1000000000000002L});
        public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000000L,0x0001000000001000L});
        public static final BitSet FOLLOW_98 = new BitSet(new long[]{0xC00008008020A040L,0x000180500000080AL});
        public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
        public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0010000000000000L,0x0000000000001000L});
        public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
        public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000000000L,0x000100500000000AL});
        public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
        public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0020000000000002L});
    }


}