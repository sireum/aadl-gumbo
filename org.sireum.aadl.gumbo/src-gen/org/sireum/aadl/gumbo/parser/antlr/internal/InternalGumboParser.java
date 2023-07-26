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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Strictpure", "Integration", "Classifier", "Initialize", "Invariants", "Extension", "Functions", "Guarantee", "Invariant", "Reference", "HasEvent", "MustSend", "Constant", "Infoflow", "Modifies", "MaySend", "Applies", "Binding", "Compute", "NoSend", "Assert", "Assume", "Handle", "Return", "Pure", "Some", "Cases", "Delta", "False", "Match", "Modes", "Reads", "State", "While", "Yield", "From", "All", "Case", "Else", "Halt", "Spec", "True", "PlusSignEqualsSignGreaterThanSign", "FullStopFullStopLessThanSign", "F32", "F64", "Def", "For", "Inv", "Mut", "Res", "Val", "Var", "FullStopFullStop", "ColonColon", "ColonEqualsSign", "LessThanSignColon", "EqualsSignGreaterThanSign", "By", "Do", "If", "In_1", "To_1", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "FullStop", "Colon", "Semicolon", "EqualsSign", "F", "T", "LeftSquareBracket", "RightSquareBracket", "KW__", "LeftCurlyBracket", "RightCurlyBracket", "ForAll", "ThereExists", "RULE_ESC_SEQ", "RULE_SLANG_STRING", "RULE_MSTRING", "RULE_IDF", "RULE_MSPI", "RULE_MSP", "RULE_SLI", "RULE_MSPB", "RULE_MSPM", "RULE_MSPE", "RULE_OPSYM", "RULE_DEFOP", "RULE_IMPLIES", "RULE_SIMPLIES", "RULE_OP", "RULE_EXTENDED_DIGIT", "RULE_HEX", "RULE_BIN", "RULE_INTEGER_LIT", "RULE_INT_IDF", "RULE_REAL_LIT", "RULE_F32_LIT", "RULE_F64_LIT", "RULE_LETTER", "RULE_DIGIT", "RULE_UNICODE_ESC", "RULE_SL_COMMENT", "RULE_EXPONENT", "RULE_INT_EXPONENT", "RULE_BASED_INTEGER", "RULE_STRING", "RULE_ID", "RULE_WS"
    };
    public static final int Val=55;
    public static final int RULE_HEX=102;
    public static final int EqualsSignGreaterThanSign=61;
    public static final int Var=56;
    public static final int False=32;
    public static final int Initialize=7;
    public static final int Invariants=8;
    public static final int Assert=24;
    public static final int PlusSignEqualsSignGreaterThanSign=46;
    public static final int LeftParenthesis=67;
    public static final int RULE_MSTRING=88;
    public static final int RULE_SLANG_STRING=87;
    public static final int RULE_OP=100;
    public static final int RULE_BIN=103;
    public static final int RULE_ESC_SEQ=86;
    public static final int F32=48;
    public static final int RULE_ID=117;
    public static final int RULE_DIGIT=110;
    public static final int Handle=26;
    public static final int ColonColon=58;
    public static final int RULE_F64_LIT=108;
    public static final int Some=29;
    public static final int PlusSign=70;
    public static final int LeftSquareBracket=79;
    public static final int If=64;
    public static final int Pure=28;
    public static final int Halt=43;
    public static final int F=77;
    public static final int ThereExists=85;
    public static final int RULE_REAL_LIT=106;
    public static final int Classifier=6;
    public static final int Case=41;
    public static final int Comma=71;
    public static final int HyphenMinus=72;
    public static final int NoSend=23;
    public static final int T=78;
    public static final int RULE_MSPE=95;
    public static final int Guarantee=11;
    public static final int RightCurlyBracket=83;
    public static final int RULE_MSPB=93;
    public static final int Modes=34;
    public static final int FullStop=73;
    public static final int RULE_SIMPLIES=99;
    public static final int Reference=13;
    public static final int RULE_IMPLIES=98;
    public static final int RULE_UNICODE_ESC=111;
    public static final int Functions=10;
    public static final int Strictpure=4;
    public static final int KW__=81;
    public static final int Semicolon=75;
    public static final int RULE_LETTER=109;
    public static final int RULE_EXPONENT=113;
    public static final int Delta=31;
    public static final int RULE_SLI=92;
    public static final int By=62;
    public static final int Else=42;
    public static final int RULE_EXTENDED_DIGIT=101;
    public static final int Yield=38;
    public static final int All=40;
    public static final int Infoflow=17;
    public static final int Res=54;
    public static final int F64=49;
    public static final int True=45;
    public static final int RULE_INT_EXPONENT=114;
    public static final int HasEvent=14;
    public static final int In_1=65;
    public static final int FullStopFullStop=57;
    public static final int RULE_F32_LIT=107;
    public static final int LessThanSignColon=60;
    public static final int Applies=20;
    public static final int RULE_MSP=91;
    public static final int RULE_BASED_INTEGER=115;
    public static final int RightSquareBracket=80;
    public static final int Binding=21;
    public static final int RULE_MSPM=94;
    public static final int RULE_DEFOP=97;
    public static final int RULE_MSPI=90;
    public static final int For=51;
    public static final int RightParenthesis=68;
    public static final int To_1=66;
    public static final int Do=63;
    public static final int ColonEqualsSign=59;
    public static final int Mut=53;
    public static final int State=36;
    public static final int Assume=25;
    public static final int RULE_INTEGER_LIT=104;
    public static final int Invariant=12;
    public static final int Constant=16;
    public static final int RULE_STRING=116;
    public static final int Match=33;
    public static final int Reads=35;
    public static final int RULE_SL_COMMENT=112;
    public static final int Inv=52;
    public static final int EqualsSign=76;
    public static final int Modifies=18;
    public static final int Colon=74;
    public static final int EOF=-1;
    public static final int Asterisk=69;
    public static final int Integration=5;
    public static final int RULE_OPSYM=96;
    public static final int Return=27;
    public static final int Def=50;
    public static final int RULE_WS=118;
    public static final int LeftCurlyBracket=82;
    public static final int RULE_INT_IDF=105;
    public static final int MustSend=15;
    public static final int While=37;
    public static final int From=39;
    public static final int Extension=9;
    public static final int FullStopFullStopLessThanSign=47;
    public static final int RULE_IDF=89;
    public static final int Compute=22;
    public static final int MaySend=19;
    public static final int Spec=44;
    public static final int ForAll=84;
    public static final int Cases=30;

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
    // InternalGumboParser.g:625:1: ruleInitialize returns [EObject current=null] : ( () otherlv_1= Initialize ( ( (lv_modifies_2_0= ruleSlangModifies ) ) otherlv_3= Semicolon )? ( (lv_specs_4_0= ruleInitializeSpecStatement ) )* ( (lv_flows_5_0= ruleInfoFlowClause ) )* ) ;
    public final EObject ruleInitialize() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_modifies_2_0 = null;

        EObject lv_specs_4_0 = null;

        EObject lv_flows_5_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:631:2: ( ( () otherlv_1= Initialize ( ( (lv_modifies_2_0= ruleSlangModifies ) ) otherlv_3= Semicolon )? ( (lv_specs_4_0= ruleInitializeSpecStatement ) )* ( (lv_flows_5_0= ruleInfoFlowClause ) )* ) )
            // InternalGumboParser.g:632:2: ( () otherlv_1= Initialize ( ( (lv_modifies_2_0= ruleSlangModifies ) ) otherlv_3= Semicolon )? ( (lv_specs_4_0= ruleInitializeSpecStatement ) )* ( (lv_flows_5_0= ruleInfoFlowClause ) )* )
            {
            // InternalGumboParser.g:632:2: ( () otherlv_1= Initialize ( ( (lv_modifies_2_0= ruleSlangModifies ) ) otherlv_3= Semicolon )? ( (lv_specs_4_0= ruleInitializeSpecStatement ) )* ( (lv_flows_5_0= ruleInfoFlowClause ) )* )
            // InternalGumboParser.g:633:3: () otherlv_1= Initialize ( ( (lv_modifies_2_0= ruleSlangModifies ) ) otherlv_3= Semicolon )? ( (lv_specs_4_0= ruleInitializeSpecStatement ) )* ( (lv_flows_5_0= ruleInfoFlowClause ) )*
            {
            // InternalGumboParser.g:633:3: ()
            // InternalGumboParser.g:634:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getInitializeAccess().getInitializeAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Initialize,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInitializeAccess().getInitializeKeyword_1());
              		
            }
            // InternalGumboParser.g:647:3: ( ( (lv_modifies_2_0= ruleSlangModifies ) ) otherlv_3= Semicolon )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Modifies) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGumboParser.g:648:4: ( (lv_modifies_2_0= ruleSlangModifies ) ) otherlv_3= Semicolon
                    {
                    // InternalGumboParser.g:648:4: ( (lv_modifies_2_0= ruleSlangModifies ) )
                    // InternalGumboParser.g:649:5: (lv_modifies_2_0= ruleSlangModifies )
                    {
                    // InternalGumboParser.g:649:5: (lv_modifies_2_0= ruleSlangModifies )
                    // InternalGumboParser.g:650:6: lv_modifies_2_0= ruleSlangModifies
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInitializeAccess().getModifiesSlangModifiesParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_modifies_2_0=ruleSlangModifies();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getInitializeRule());
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

                    otherlv_3=(Token)match(input,Semicolon,FollowSets000.FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getInitializeAccess().getSemicolonKeyword_2_1());
                      			
                    }

                    }
                    break;

            }

            // InternalGumboParser.g:672:3: ( (lv_specs_4_0= ruleInitializeSpecStatement ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==Guarantee) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGumboParser.g:673:4: (lv_specs_4_0= ruleInitializeSpecStatement )
            	    {
            	    // InternalGumboParser.g:673:4: (lv_specs_4_0= ruleInitializeSpecStatement )
            	    // InternalGumboParser.g:674:5: lv_specs_4_0= ruleInitializeSpecStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getInitializeAccess().getSpecsInitializeSpecStatementParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_19);
            	    lv_specs_4_0=ruleInitializeSpecStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getInitializeRule());
            	      					}
            	      					add(
            	      						current,
            	      						"specs",
            	      						lv_specs_4_0,
            	      						"org.sireum.aadl.gumbo.Gumbo.InitializeSpecStatement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // InternalGumboParser.g:691:3: ( (lv_flows_5_0= ruleInfoFlowClause ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==Infoflow) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGumboParser.g:692:4: (lv_flows_5_0= ruleInfoFlowClause )
            	    {
            	    // InternalGumboParser.g:692:4: (lv_flows_5_0= ruleInfoFlowClause )
            	    // InternalGumboParser.g:693:5: lv_flows_5_0= ruleInfoFlowClause
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getInitializeAccess().getFlowsInfoFlowClauseParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_20);
            	    lv_flows_5_0=ruleInfoFlowClause();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getInitializeRule());
            	      					}
            	      					add(
            	      						current,
            	      						"flows",
            	      						lv_flows_5_0,
            	      						"org.sireum.aadl.gumbo.Gumbo.InfoFlowClause");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // $ANTLR end "ruleInitialize"


    // $ANTLR start "entryRuleInitializeSpecStatement"
    // InternalGumboParser.g:714:1: entryRuleInitializeSpecStatement returns [EObject current=null] : iv_ruleInitializeSpecStatement= ruleInitializeSpecStatement EOF ;
    public final EObject entryRuleInitializeSpecStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitializeSpecStatement = null;


        try {
            // InternalGumboParser.g:714:64: (iv_ruleInitializeSpecStatement= ruleInitializeSpecStatement EOF )
            // InternalGumboParser.g:715:2: iv_ruleInitializeSpecStatement= ruleInitializeSpecStatement EOF
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
    // InternalGumboParser.g:721:1: ruleInitializeSpecStatement returns [EObject current=null] : ( (lv_guaranteeStatement_0_0= ruleGuaranteeStatement ) ) ;
    public final EObject ruleInitializeSpecStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_guaranteeStatement_0_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:727:2: ( ( (lv_guaranteeStatement_0_0= ruleGuaranteeStatement ) ) )
            // InternalGumboParser.g:728:2: ( (lv_guaranteeStatement_0_0= ruleGuaranteeStatement ) )
            {
            // InternalGumboParser.g:728:2: ( (lv_guaranteeStatement_0_0= ruleGuaranteeStatement ) )
            // InternalGumboParser.g:729:3: (lv_guaranteeStatement_0_0= ruleGuaranteeStatement )
            {
            // InternalGumboParser.g:729:3: (lv_guaranteeStatement_0_0= ruleGuaranteeStatement )
            // InternalGumboParser.g:730:4: lv_guaranteeStatement_0_0= ruleGuaranteeStatement
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
    // InternalGumboParser.g:750:1: entryRuleCompute returns [EObject current=null] : iv_ruleCompute= ruleCompute EOF ;
    public final EObject entryRuleCompute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompute = null;


        try {
            // InternalGumboParser.g:750:48: (iv_ruleCompute= ruleCompute EOF )
            // InternalGumboParser.g:751:2: iv_ruleCompute= ruleCompute EOF
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
    // InternalGumboParser.g:757:1: ruleCompute returns [EObject current=null] : ( () otherlv_1= Compute ( ( (lv_modifies_2_0= ruleSlangModifies ) ) otherlv_3= Semicolon )? ( (lv_specs_4_0= ruleSpecStatement ) )* (otherlv_5= Cases ( (lv_cases_6_0= ruleCaseStatementClause ) )+ )* ( (lv_handlers_7_0= ruleHandlerClause ) )* ( (lv_flows_8_0= ruleInfoFlowClause ) )* ) ;
    public final EObject ruleCompute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_modifies_2_0 = null;

        EObject lv_specs_4_0 = null;

        EObject lv_cases_6_0 = null;

        EObject lv_handlers_7_0 = null;

        EObject lv_flows_8_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:763:2: ( ( () otherlv_1= Compute ( ( (lv_modifies_2_0= ruleSlangModifies ) ) otherlv_3= Semicolon )? ( (lv_specs_4_0= ruleSpecStatement ) )* (otherlv_5= Cases ( (lv_cases_6_0= ruleCaseStatementClause ) )+ )* ( (lv_handlers_7_0= ruleHandlerClause ) )* ( (lv_flows_8_0= ruleInfoFlowClause ) )* ) )
            // InternalGumboParser.g:764:2: ( () otherlv_1= Compute ( ( (lv_modifies_2_0= ruleSlangModifies ) ) otherlv_3= Semicolon )? ( (lv_specs_4_0= ruleSpecStatement ) )* (otherlv_5= Cases ( (lv_cases_6_0= ruleCaseStatementClause ) )+ )* ( (lv_handlers_7_0= ruleHandlerClause ) )* ( (lv_flows_8_0= ruleInfoFlowClause ) )* )
            {
            // InternalGumboParser.g:764:2: ( () otherlv_1= Compute ( ( (lv_modifies_2_0= ruleSlangModifies ) ) otherlv_3= Semicolon )? ( (lv_specs_4_0= ruleSpecStatement ) )* (otherlv_5= Cases ( (lv_cases_6_0= ruleCaseStatementClause ) )+ )* ( (lv_handlers_7_0= ruleHandlerClause ) )* ( (lv_flows_8_0= ruleInfoFlowClause ) )* )
            // InternalGumboParser.g:765:3: () otherlv_1= Compute ( ( (lv_modifies_2_0= ruleSlangModifies ) ) otherlv_3= Semicolon )? ( (lv_specs_4_0= ruleSpecStatement ) )* (otherlv_5= Cases ( (lv_cases_6_0= ruleCaseStatementClause ) )+ )* ( (lv_handlers_7_0= ruleHandlerClause ) )* ( (lv_flows_8_0= ruleInfoFlowClause ) )*
            {
            // InternalGumboParser.g:765:3: ()
            // InternalGumboParser.g:766:4: 
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

            otherlv_1=(Token)match(input,Compute,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getComputeAccess().getComputeKeyword_1());
              		
            }
            // InternalGumboParser.g:779:3: ( ( (lv_modifies_2_0= ruleSlangModifies ) ) otherlv_3= Semicolon )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Modifies) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGumboParser.g:780:4: ( (lv_modifies_2_0= ruleSlangModifies ) ) otherlv_3= Semicolon
                    {
                    // InternalGumboParser.g:780:4: ( (lv_modifies_2_0= ruleSlangModifies ) )
                    // InternalGumboParser.g:781:5: (lv_modifies_2_0= ruleSlangModifies )
                    {
                    // InternalGumboParser.g:781:5: (lv_modifies_2_0= ruleSlangModifies )
                    // InternalGumboParser.g:782:6: lv_modifies_2_0= ruleSlangModifies
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

                    otherlv_3=(Token)match(input,Semicolon,FollowSets000.FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getComputeAccess().getSemicolonKeyword_2_1());
                      			
                    }

                    }
                    break;

            }

            // InternalGumboParser.g:804:3: ( (lv_specs_4_0= ruleSpecStatement ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==Guarantee||LA16_0==Assume) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGumboParser.g:805:4: (lv_specs_4_0= ruleSpecStatement )
            	    {
            	    // InternalGumboParser.g:805:4: (lv_specs_4_0= ruleSpecStatement )
            	    // InternalGumboParser.g:806:5: lv_specs_4_0= ruleSpecStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getComputeAccess().getSpecsSpecStatementParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_22);
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
            	    break loop16;
                }
            } while (true);

            // InternalGumboParser.g:823:3: (otherlv_5= Cases ( (lv_cases_6_0= ruleCaseStatementClause ) )+ )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==Cases) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalGumboParser.g:824:4: otherlv_5= Cases ( (lv_cases_6_0= ruleCaseStatementClause ) )+
            	    {
            	    otherlv_5=(Token)match(input,Cases,FollowSets000.FOLLOW_23); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getComputeAccess().getCasesKeyword_4_0());
            	      			
            	    }
            	    // InternalGumboParser.g:828:4: ( (lv_cases_6_0= ruleCaseStatementClause ) )+
            	    int cnt17=0;
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( (LA17_0==Case) ) {
            	            alt17=1;
            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // InternalGumboParser.g:829:5: (lv_cases_6_0= ruleCaseStatementClause )
            	    	    {
            	    	    // InternalGumboParser.g:829:5: (lv_cases_6_0= ruleCaseStatementClause )
            	    	    // InternalGumboParser.g:830:6: lv_cases_6_0= ruleCaseStatementClause
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      						newCompositeNode(grammarAccess.getComputeAccess().getCasesCaseStatementClauseParserRuleCall_4_1_0());
            	    	      					
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_24);
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
            	    	    if ( cnt17 >= 1 ) break loop17;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(17, input);
            	                throw eee;
            	        }
            	        cnt17++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // InternalGumboParser.g:848:3: ( (lv_handlers_7_0= ruleHandlerClause ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==Handle) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalGumboParser.g:849:4: (lv_handlers_7_0= ruleHandlerClause )
            	    {
            	    // InternalGumboParser.g:849:4: (lv_handlers_7_0= ruleHandlerClause )
            	    // InternalGumboParser.g:850:5: lv_handlers_7_0= ruleHandlerClause
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getComputeAccess().getHandlersHandlerClauseParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_25);
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
            	    break loop19;
                }
            } while (true);

            // InternalGumboParser.g:867:3: ( (lv_flows_8_0= ruleInfoFlowClause ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==Infoflow) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalGumboParser.g:868:4: (lv_flows_8_0= ruleInfoFlowClause )
            	    {
            	    // InternalGumboParser.g:868:4: (lv_flows_8_0= ruleInfoFlowClause )
            	    // InternalGumboParser.g:869:5: lv_flows_8_0= ruleInfoFlowClause
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getComputeAccess().getFlowsInfoFlowClauseParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_20);
            	    lv_flows_8_0=ruleInfoFlowClause();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getComputeRule());
            	      					}
            	      					add(
            	      						current,
            	      						"flows",
            	      						lv_flows_8_0,
            	      						"org.sireum.aadl.gumbo.Gumbo.InfoFlowClause");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
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


    // $ANTLR start "entryRuleInfoFlowClause"
    // InternalGumboParser.g:890:1: entryRuleInfoFlowClause returns [EObject current=null] : iv_ruleInfoFlowClause= ruleInfoFlowClause EOF ;
    public final EObject entryRuleInfoFlowClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfoFlowClause = null;


        try {
            // InternalGumboParser.g:890:55: (iv_ruleInfoFlowClause= ruleInfoFlowClause EOF )
            // InternalGumboParser.g:891:2: iv_ruleInfoFlowClause= ruleInfoFlowClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInfoFlowClauseRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInfoFlowClause=ruleInfoFlowClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInfoFlowClause; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInfoFlowClause"


    // $ANTLR start "ruleInfoFlowClause"
    // InternalGumboParser.g:897:1: ruleInfoFlowClause returns [EObject current=null] : (otherlv_0= Infoflow ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon otherlv_4= From otherlv_5= LeftParenthesis ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= Comma ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= RightParenthesis otherlv_10= Comma otherlv_11= To_1 otherlv_12= LeftParenthesis ( ( (otherlv_13= RULE_ID ) ) (otherlv_14= Comma ( (otherlv_15= RULE_ID ) ) )* )? otherlv_16= RightParenthesis otherlv_17= Semicolon ) ;
    public final EObject ruleInfoFlowClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token lv_descriptor_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;


        	enterRule();

        try {
            // InternalGumboParser.g:903:2: ( (otherlv_0= Infoflow ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon otherlv_4= From otherlv_5= LeftParenthesis ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= Comma ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= RightParenthesis otherlv_10= Comma otherlv_11= To_1 otherlv_12= LeftParenthesis ( ( (otherlv_13= RULE_ID ) ) (otherlv_14= Comma ( (otherlv_15= RULE_ID ) ) )* )? otherlv_16= RightParenthesis otherlv_17= Semicolon ) )
            // InternalGumboParser.g:904:2: (otherlv_0= Infoflow ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon otherlv_4= From otherlv_5= LeftParenthesis ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= Comma ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= RightParenthesis otherlv_10= Comma otherlv_11= To_1 otherlv_12= LeftParenthesis ( ( (otherlv_13= RULE_ID ) ) (otherlv_14= Comma ( (otherlv_15= RULE_ID ) ) )* )? otherlv_16= RightParenthesis otherlv_17= Semicolon )
            {
            // InternalGumboParser.g:904:2: (otherlv_0= Infoflow ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon otherlv_4= From otherlv_5= LeftParenthesis ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= Comma ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= RightParenthesis otherlv_10= Comma otherlv_11= To_1 otherlv_12= LeftParenthesis ( ( (otherlv_13= RULE_ID ) ) (otherlv_14= Comma ( (otherlv_15= RULE_ID ) ) )* )? otherlv_16= RightParenthesis otherlv_17= Semicolon )
            // InternalGumboParser.g:905:3: otherlv_0= Infoflow ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon otherlv_4= From otherlv_5= LeftParenthesis ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= Comma ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= RightParenthesis otherlv_10= Comma otherlv_11= To_1 otherlv_12= LeftParenthesis ( ( (otherlv_13= RULE_ID ) ) (otherlv_14= Comma ( (otherlv_15= RULE_ID ) ) )* )? otherlv_16= RightParenthesis otherlv_17= Semicolon
            {
            otherlv_0=(Token)match(input,Infoflow,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInfoFlowClauseAccess().getInfoflowKeyword_0());
              		
            }
            // InternalGumboParser.g:909:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalGumboParser.g:910:4: (lv_id_1_0= RULE_ID )
            {
            // InternalGumboParser.g:910:4: (lv_id_1_0= RULE_ID )
            // InternalGumboParser.g:911:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_id_1_0, grammarAccess.getInfoFlowClauseAccess().getIdIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getInfoFlowClauseRule());
              					}
              					setWithLastConsumed(
              						current,
              						"id",
              						lv_id_1_0,
              						"org.osate.xtext.aadl2.properties.Properties.ID");
              				
            }

            }


            }

            // InternalGumboParser.g:927:3: ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_SLANG_STRING) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalGumboParser.g:928:4: (lv_descriptor_2_0= RULE_SLANG_STRING )
                    {
                    // InternalGumboParser.g:928:4: (lv_descriptor_2_0= RULE_SLANG_STRING )
                    // InternalGumboParser.g:929:5: lv_descriptor_2_0= RULE_SLANG_STRING
                    {
                    lv_descriptor_2_0=(Token)match(input,RULE_SLANG_STRING,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_descriptor_2_0, grammarAccess.getInfoFlowClauseAccess().getDescriptorSLANG_STRINGTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getInfoFlowClauseRule());
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

            otherlv_3=(Token)match(input,Colon,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getInfoFlowClauseAccess().getColonKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,From,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getInfoFlowClauseAccess().getFromKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getInfoFlowClauseAccess().getLeftParenthesisKeyword_5());
              		
            }
            // InternalGumboParser.g:957:3: ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= Comma ( (otherlv_8= RULE_ID ) ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalGumboParser.g:958:4: ( (otherlv_6= RULE_ID ) ) (otherlv_7= Comma ( (otherlv_8= RULE_ID ) ) )*
                    {
                    // InternalGumboParser.g:958:4: ( (otherlv_6= RULE_ID ) )
                    // InternalGumboParser.g:959:5: (otherlv_6= RULE_ID )
                    {
                    // InternalGumboParser.g:959:5: (otherlv_6= RULE_ID )
                    // InternalGumboParser.g:960:6: otherlv_6= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getInfoFlowClauseRule());
                      						}
                      					
                    }
                    otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_6, grammarAccess.getInfoFlowClauseAccess().getFromPortOrStateVarEObjectCrossReference_6_0_0());
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:974:4: (otherlv_7= Comma ( (otherlv_8= RULE_ID ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==Comma) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalGumboParser.g:975:5: otherlv_7= Comma ( (otherlv_8= RULE_ID ) )
                    	    {
                    	    otherlv_7=(Token)match(input,Comma,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_7, grammarAccess.getInfoFlowClauseAccess().getCommaKeyword_6_1_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:979:5: ( (otherlv_8= RULE_ID ) )
                    	    // InternalGumboParser.g:980:6: (otherlv_8= RULE_ID )
                    	    {
                    	    // InternalGumboParser.g:980:6: (otherlv_8= RULE_ID )
                    	    // InternalGumboParser.g:981:7: otherlv_8= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							/* */
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getInfoFlowClauseRule());
                    	      							}
                    	      						
                    	    }
                    	    otherlv_8=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_8, grammarAccess.getInfoFlowClauseAccess().getFromPortOrStateVarEObjectCrossReference_6_1_1_0());
                    	      						
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
                    break;

            }

            otherlv_9=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getInfoFlowClauseAccess().getRightParenthesisKeyword_7());
              		
            }
            otherlv_10=(Token)match(input,Comma,FollowSets000.FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getInfoFlowClauseAccess().getCommaKeyword_8());
              		
            }
            otherlv_11=(Token)match(input,To_1,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getInfoFlowClauseAccess().getToKeyword_9());
              		
            }
            otherlv_12=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getInfoFlowClauseAccess().getLeftParenthesisKeyword_10());
              		
            }
            // InternalGumboParser.g:1013:3: ( ( (otherlv_13= RULE_ID ) ) (otherlv_14= Comma ( (otherlv_15= RULE_ID ) ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalGumboParser.g:1014:4: ( (otherlv_13= RULE_ID ) ) (otherlv_14= Comma ( (otherlv_15= RULE_ID ) ) )*
                    {
                    // InternalGumboParser.g:1014:4: ( (otherlv_13= RULE_ID ) )
                    // InternalGumboParser.g:1015:5: (otherlv_13= RULE_ID )
                    {
                    // InternalGumboParser.g:1015:5: (otherlv_13= RULE_ID )
                    // InternalGumboParser.g:1016:6: otherlv_13= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getInfoFlowClauseRule());
                      						}
                      					
                    }
                    otherlv_13=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_13, grammarAccess.getInfoFlowClauseAccess().getToPortOrStateVarEObjectCrossReference_11_0_0());
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:1030:4: (otherlv_14= Comma ( (otherlv_15= RULE_ID ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==Comma) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalGumboParser.g:1031:5: otherlv_14= Comma ( (otherlv_15= RULE_ID ) )
                    	    {
                    	    otherlv_14=(Token)match(input,Comma,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_14, grammarAccess.getInfoFlowClauseAccess().getCommaKeyword_11_1_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:1035:5: ( (otherlv_15= RULE_ID ) )
                    	    // InternalGumboParser.g:1036:6: (otherlv_15= RULE_ID )
                    	    {
                    	    // InternalGumboParser.g:1036:6: (otherlv_15= RULE_ID )
                    	    // InternalGumboParser.g:1037:7: otherlv_15= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							/* */
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getInfoFlowClauseRule());
                    	      							}
                    	      						
                    	    }
                    	    otherlv_15=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_15, grammarAccess.getInfoFlowClauseAccess().getToPortOrStateVarEObjectCrossReference_11_1_1_0());
                    	      						
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
                    break;

            }

            otherlv_16=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_16, grammarAccess.getInfoFlowClauseAccess().getRightParenthesisKeyword_12());
              		
            }
            otherlv_17=(Token)match(input,Semicolon,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getInfoFlowClauseAccess().getSemicolonKeyword_13());
              		
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
    // $ANTLR end "ruleInfoFlowClause"


    // $ANTLR start "entryRuleHandlerClause"
    // InternalGumboParser.g:1065:1: entryRuleHandlerClause returns [EObject current=null] : iv_ruleHandlerClause= ruleHandlerClause EOF ;
    public final EObject entryRuleHandlerClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHandlerClause = null;


        try {
            // InternalGumboParser.g:1065:54: (iv_ruleHandlerClause= ruleHandlerClause EOF )
            // InternalGumboParser.g:1066:2: iv_ruleHandlerClause= ruleHandlerClause EOF
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
    // InternalGumboParser.g:1072:1: ruleHandlerClause returns [EObject current=null] : (otherlv_0= Handle ( (otherlv_1= RULE_ID ) ) otherlv_2= Colon ( ( (lv_modifies_3_0= ruleSlangModifies ) ) otherlv_4= Semicolon )? ( (lv_guarantees_5_0= ruleGuaranteeStatement ) )+ ) ;
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
            // InternalGumboParser.g:1078:2: ( (otherlv_0= Handle ( (otherlv_1= RULE_ID ) ) otherlv_2= Colon ( ( (lv_modifies_3_0= ruleSlangModifies ) ) otherlv_4= Semicolon )? ( (lv_guarantees_5_0= ruleGuaranteeStatement ) )+ ) )
            // InternalGumboParser.g:1079:2: (otherlv_0= Handle ( (otherlv_1= RULE_ID ) ) otherlv_2= Colon ( ( (lv_modifies_3_0= ruleSlangModifies ) ) otherlv_4= Semicolon )? ( (lv_guarantees_5_0= ruleGuaranteeStatement ) )+ )
            {
            // InternalGumboParser.g:1079:2: (otherlv_0= Handle ( (otherlv_1= RULE_ID ) ) otherlv_2= Colon ( ( (lv_modifies_3_0= ruleSlangModifies ) ) otherlv_4= Semicolon )? ( (lv_guarantees_5_0= ruleGuaranteeStatement ) )+ )
            // InternalGumboParser.g:1080:3: otherlv_0= Handle ( (otherlv_1= RULE_ID ) ) otherlv_2= Colon ( ( (lv_modifies_3_0= ruleSlangModifies ) ) otherlv_4= Semicolon )? ( (lv_guarantees_5_0= ruleGuaranteeStatement ) )+
            {
            otherlv_0=(Token)match(input,Handle,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getHandlerClauseAccess().getHandleKeyword_0());
              		
            }
            // InternalGumboParser.g:1084:3: ( (otherlv_1= RULE_ID ) )
            // InternalGumboParser.g:1085:4: (otherlv_1= RULE_ID )
            {
            // InternalGumboParser.g:1085:4: (otherlv_1= RULE_ID )
            // InternalGumboParser.g:1086:5: otherlv_1= RULE_ID
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

            otherlv_2=(Token)match(input,Colon,FollowSets000.FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getHandlerClauseAccess().getColonKeyword_2());
              		
            }
            // InternalGumboParser.g:1104:3: ( ( (lv_modifies_3_0= ruleSlangModifies ) ) otherlv_4= Semicolon )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==Modifies) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalGumboParser.g:1105:4: ( (lv_modifies_3_0= ruleSlangModifies ) ) otherlv_4= Semicolon
                    {
                    // InternalGumboParser.g:1105:4: ( (lv_modifies_3_0= ruleSlangModifies ) )
                    // InternalGumboParser.g:1106:5: (lv_modifies_3_0= ruleSlangModifies )
                    {
                    // InternalGumboParser.g:1106:5: (lv_modifies_3_0= ruleSlangModifies )
                    // InternalGumboParser.g:1107:6: lv_modifies_3_0= ruleSlangModifies
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

            // InternalGumboParser.g:1129:3: ( (lv_guarantees_5_0= ruleGuaranteeStatement ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==Guarantee) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalGumboParser.g:1130:4: (lv_guarantees_5_0= ruleGuaranteeStatement )
            	    {
            	    // InternalGumboParser.g:1130:4: (lv_guarantees_5_0= ruleGuaranteeStatement )
            	    // InternalGumboParser.g:1131:5: lv_guarantees_5_0= ruleGuaranteeStatement
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
    // $ANTLR end "ruleHandlerClause"


    // $ANTLR start "entryRuleCaseStatementClause"
    // InternalGumboParser.g:1152:1: entryRuleCaseStatementClause returns [EObject current=null] : iv_ruleCaseStatementClause= ruleCaseStatementClause EOF ;
    public final EObject entryRuleCaseStatementClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseStatementClause = null;


        try {
            // InternalGumboParser.g:1152:60: (iv_ruleCaseStatementClause= ruleCaseStatementClause EOF )
            // InternalGumboParser.g:1153:2: iv_ruleCaseStatementClause= ruleCaseStatementClause EOF
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
    // InternalGumboParser.g:1159:1: ruleCaseStatementClause returns [EObject current=null] : (otherlv_0= Case ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_assumeStatement_4_0= ruleAnonAssumeStatement ) ) ( (lv_guaranteeStatement_5_0= ruleAnonGuaranteeStatement ) ) ) ;
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
            // InternalGumboParser.g:1165:2: ( (otherlv_0= Case ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_assumeStatement_4_0= ruleAnonAssumeStatement ) ) ( (lv_guaranteeStatement_5_0= ruleAnonGuaranteeStatement ) ) ) )
            // InternalGumboParser.g:1166:2: (otherlv_0= Case ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_assumeStatement_4_0= ruleAnonAssumeStatement ) ) ( (lv_guaranteeStatement_5_0= ruleAnonGuaranteeStatement ) ) )
            {
            // InternalGumboParser.g:1166:2: (otherlv_0= Case ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_assumeStatement_4_0= ruleAnonAssumeStatement ) ) ( (lv_guaranteeStatement_5_0= ruleAnonGuaranteeStatement ) ) )
            // InternalGumboParser.g:1167:3: otherlv_0= Case ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_assumeStatement_4_0= ruleAnonAssumeStatement ) ) ( (lv_guaranteeStatement_5_0= ruleAnonGuaranteeStatement ) )
            {
            otherlv_0=(Token)match(input,Case,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCaseStatementClauseAccess().getCaseKeyword_0());
              		
            }
            // InternalGumboParser.g:1171:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalGumboParser.g:1172:4: (lv_id_1_0= RULE_ID )
            {
            // InternalGumboParser.g:1172:4: (lv_id_1_0= RULE_ID )
            // InternalGumboParser.g:1173:5: lv_id_1_0= RULE_ID
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

            // InternalGumboParser.g:1189:3: ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_SLANG_STRING) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalGumboParser.g:1190:4: (lv_descriptor_2_0= RULE_SLANG_STRING )
                    {
                    // InternalGumboParser.g:1190:4: (lv_descriptor_2_0= RULE_SLANG_STRING )
                    // InternalGumboParser.g:1191:5: lv_descriptor_2_0= RULE_SLANG_STRING
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

            otherlv_3=(Token)match(input,Colon,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getCaseStatementClauseAccess().getColonKeyword_3());
              		
            }
            // InternalGumboParser.g:1211:3: ( (lv_assumeStatement_4_0= ruleAnonAssumeStatement ) )
            // InternalGumboParser.g:1212:4: (lv_assumeStatement_4_0= ruleAnonAssumeStatement )
            {
            // InternalGumboParser.g:1212:4: (lv_assumeStatement_4_0= ruleAnonAssumeStatement )
            // InternalGumboParser.g:1213:5: lv_assumeStatement_4_0= ruleAnonAssumeStatement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCaseStatementClauseAccess().getAssumeStatementAnonAssumeStatementParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_34);
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

            // InternalGumboParser.g:1230:3: ( (lv_guaranteeStatement_5_0= ruleAnonGuaranteeStatement ) )
            // InternalGumboParser.g:1231:4: (lv_guaranteeStatement_5_0= ruleAnonGuaranteeStatement )
            {
            // InternalGumboParser.g:1231:4: (lv_guaranteeStatement_5_0= ruleAnonGuaranteeStatement )
            // InternalGumboParser.g:1232:5: lv_guaranteeStatement_5_0= ruleAnonGuaranteeStatement
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
    // InternalGumboParser.g:1253:1: entryRuleSpecStatement returns [EObject current=null] : iv_ruleSpecStatement= ruleSpecStatement EOF ;
    public final EObject entryRuleSpecStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecStatement = null;


        try {
            // InternalGumboParser.g:1253:54: (iv_ruleSpecStatement= ruleSpecStatement EOF )
            // InternalGumboParser.g:1254:2: iv_ruleSpecStatement= ruleSpecStatement EOF
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
    // InternalGumboParser.g:1260:1: ruleSpecStatement returns [EObject current=null] : (this_AssumeStatement_0= ruleAssumeStatement | this_GuaranteeStatement_1= ruleGuaranteeStatement ) ;
    public final EObject ruleSpecStatement() throws RecognitionException {
        EObject current = null;

        EObject this_AssumeStatement_0 = null;

        EObject this_GuaranteeStatement_1 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1266:2: ( (this_AssumeStatement_0= ruleAssumeStatement | this_GuaranteeStatement_1= ruleGuaranteeStatement ) )
            // InternalGumboParser.g:1267:2: (this_AssumeStatement_0= ruleAssumeStatement | this_GuaranteeStatement_1= ruleGuaranteeStatement )
            {
            // InternalGumboParser.g:1267:2: (this_AssumeStatement_0= ruleAssumeStatement | this_GuaranteeStatement_1= ruleGuaranteeStatement )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Assume) ) {
                alt29=1;
            }
            else if ( (LA29_0==Guarantee) ) {
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
                    // InternalGumboParser.g:1268:3: this_AssumeStatement_0= ruleAssumeStatement
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
                    // InternalGumboParser.g:1280:3: this_GuaranteeStatement_1= ruleGuaranteeStatement
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
    // InternalGumboParser.g:1295:1: entryRuleAssumeStatement returns [EObject current=null] : iv_ruleAssumeStatement= ruleAssumeStatement EOF ;
    public final EObject entryRuleAssumeStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssumeStatement = null;


        try {
            // InternalGumboParser.g:1295:56: (iv_ruleAssumeStatement= ruleAssumeStatement EOF )
            // InternalGumboParser.g:1296:2: iv_ruleAssumeStatement= ruleAssumeStatement EOF
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
    // InternalGumboParser.g:1302:1: ruleAssumeStatement returns [EObject current=null] : (otherlv_0= Assume ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= Semicolon ) ;
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
            // InternalGumboParser.g:1308:2: ( (otherlv_0= Assume ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= Semicolon ) )
            // InternalGumboParser.g:1309:2: (otherlv_0= Assume ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= Semicolon )
            {
            // InternalGumboParser.g:1309:2: (otherlv_0= Assume ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= Semicolon )
            // InternalGumboParser.g:1310:3: otherlv_0= Assume ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= Semicolon
            {
            otherlv_0=(Token)match(input,Assume,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAssumeStatementAccess().getAssumeKeyword_0());
              		
            }
            // InternalGumboParser.g:1314:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalGumboParser.g:1315:4: (lv_id_1_0= RULE_ID )
            {
            // InternalGumboParser.g:1315:4: (lv_id_1_0= RULE_ID )
            // InternalGumboParser.g:1316:5: lv_id_1_0= RULE_ID
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

            // InternalGumboParser.g:1332:3: ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_SLANG_STRING) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalGumboParser.g:1333:4: (lv_descriptor_2_0= RULE_SLANG_STRING )
                    {
                    // InternalGumboParser.g:1333:4: (lv_descriptor_2_0= RULE_SLANG_STRING )
                    // InternalGumboParser.g:1334:5: lv_descriptor_2_0= RULE_SLANG_STRING
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
            // InternalGumboParser.g:1354:3: ( (lv_expr_4_0= ruleExpr ) )
            // InternalGumboParser.g:1355:4: (lv_expr_4_0= ruleExpr )
            {
            // InternalGumboParser.g:1355:4: (lv_expr_4_0= ruleExpr )
            // InternalGumboParser.g:1356:5: lv_expr_4_0= ruleExpr
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
    // InternalGumboParser.g:1381:1: entryRuleAnonAssumeStatement returns [EObject current=null] : iv_ruleAnonAssumeStatement= ruleAnonAssumeStatement EOF ;
    public final EObject entryRuleAnonAssumeStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnonAssumeStatement = null;


        try {
            // InternalGumboParser.g:1381:60: (iv_ruleAnonAssumeStatement= ruleAnonAssumeStatement EOF )
            // InternalGumboParser.g:1382:2: iv_ruleAnonAssumeStatement= ruleAnonAssumeStatement EOF
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
    // InternalGumboParser.g:1388:1: ruleAnonAssumeStatement returns [EObject current=null] : (otherlv_0= Assume ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon ) ;
    public final EObject ruleAnonAssumeStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1394:2: ( (otherlv_0= Assume ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon ) )
            // InternalGumboParser.g:1395:2: (otherlv_0= Assume ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon )
            {
            // InternalGumboParser.g:1395:2: (otherlv_0= Assume ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon )
            // InternalGumboParser.g:1396:3: otherlv_0= Assume ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon
            {
            otherlv_0=(Token)match(input,Assume,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAnonAssumeStatementAccess().getAssumeKeyword_0());
              		
            }
            // InternalGumboParser.g:1400:3: ( (lv_expr_1_0= ruleExpr ) )
            // InternalGumboParser.g:1401:4: (lv_expr_1_0= ruleExpr )
            {
            // InternalGumboParser.g:1401:4: (lv_expr_1_0= ruleExpr )
            // InternalGumboParser.g:1402:5: lv_expr_1_0= ruleExpr
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
    // InternalGumboParser.g:1427:1: entryRuleGuaranteeStatement returns [EObject current=null] : iv_ruleGuaranteeStatement= ruleGuaranteeStatement EOF ;
    public final EObject entryRuleGuaranteeStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuaranteeStatement = null;


        try {
            // InternalGumboParser.g:1427:59: (iv_ruleGuaranteeStatement= ruleGuaranteeStatement EOF )
            // InternalGumboParser.g:1428:2: iv_ruleGuaranteeStatement= ruleGuaranteeStatement EOF
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
    // InternalGumboParser.g:1434:1: ruleGuaranteeStatement returns [EObject current=null] : (otherlv_0= Guarantee ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= Semicolon ) ;
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
            // InternalGumboParser.g:1440:2: ( (otherlv_0= Guarantee ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= Semicolon ) )
            // InternalGumboParser.g:1441:2: (otherlv_0= Guarantee ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= Semicolon )
            {
            // InternalGumboParser.g:1441:2: (otherlv_0= Guarantee ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= Semicolon )
            // InternalGumboParser.g:1442:3: otherlv_0= Guarantee ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= Semicolon
            {
            otherlv_0=(Token)match(input,Guarantee,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGuaranteeStatementAccess().getGuaranteeKeyword_0());
              		
            }
            // InternalGumboParser.g:1446:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalGumboParser.g:1447:4: (lv_id_1_0= RULE_ID )
            {
            // InternalGumboParser.g:1447:4: (lv_id_1_0= RULE_ID )
            // InternalGumboParser.g:1448:5: lv_id_1_0= RULE_ID
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

            // InternalGumboParser.g:1464:3: ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_SLANG_STRING) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalGumboParser.g:1465:4: (lv_descriptor_2_0= RULE_SLANG_STRING )
                    {
                    // InternalGumboParser.g:1465:4: (lv_descriptor_2_0= RULE_SLANG_STRING )
                    // InternalGumboParser.g:1466:5: lv_descriptor_2_0= RULE_SLANG_STRING
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
            // InternalGumboParser.g:1486:3: ( (lv_expr_4_0= ruleExpr ) )
            // InternalGumboParser.g:1487:4: (lv_expr_4_0= ruleExpr )
            {
            // InternalGumboParser.g:1487:4: (lv_expr_4_0= ruleExpr )
            // InternalGumboParser.g:1488:5: lv_expr_4_0= ruleExpr
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
    // InternalGumboParser.g:1513:1: entryRuleAnonGuaranteeStatement returns [EObject current=null] : iv_ruleAnonGuaranteeStatement= ruleAnonGuaranteeStatement EOF ;
    public final EObject entryRuleAnonGuaranteeStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnonGuaranteeStatement = null;


        try {
            // InternalGumboParser.g:1513:63: (iv_ruleAnonGuaranteeStatement= ruleAnonGuaranteeStatement EOF )
            // InternalGumboParser.g:1514:2: iv_ruleAnonGuaranteeStatement= ruleAnonGuaranteeStatement EOF
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
    // InternalGumboParser.g:1520:1: ruleAnonGuaranteeStatement returns [EObject current=null] : (otherlv_0= Guarantee ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon ) ;
    public final EObject ruleAnonGuaranteeStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1526:2: ( (otherlv_0= Guarantee ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon ) )
            // InternalGumboParser.g:1527:2: (otherlv_0= Guarantee ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon )
            {
            // InternalGumboParser.g:1527:2: (otherlv_0= Guarantee ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon )
            // InternalGumboParser.g:1528:3: otherlv_0= Guarantee ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon
            {
            otherlv_0=(Token)match(input,Guarantee,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAnonGuaranteeStatementAccess().getGuaranteeKeyword_0());
              		
            }
            // InternalGumboParser.g:1532:3: ( (lv_expr_1_0= ruleExpr ) )
            // InternalGumboParser.g:1533:4: (lv_expr_1_0= ruleExpr )
            {
            // InternalGumboParser.g:1533:4: (lv_expr_1_0= ruleExpr )
            // InternalGumboParser.g:1534:5: lv_expr_1_0= ruleExpr
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
    // InternalGumboParser.g:1559:1: entryRuleOtherDataRef returns [EObject current=null] : iv_ruleOtherDataRef= ruleOtherDataRef EOF ;
    public final EObject entryRuleOtherDataRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOtherDataRef = null;


        try {
            // InternalGumboParser.g:1559:53: (iv_ruleOtherDataRef= ruleOtherDataRef EOF )
            // InternalGumboParser.g:1560:2: iv_ruleOtherDataRef= ruleOtherDataRef EOF
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
    // InternalGumboParser.g:1566:1: ruleOtherDataRef returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleOtherDataRef ) ) )? ) ;
    public final EObject ruleOtherDataRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_arrayRange_1_0 = null;

        EObject lv_path_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1572:2: ( ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleOtherDataRef ) ) )? ) )
            // InternalGumboParser.g:1573:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleOtherDataRef ) ) )? )
            {
            // InternalGumboParser.g:1573:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleOtherDataRef ) ) )? )
            // InternalGumboParser.g:1574:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleOtherDataRef ) ) )?
            {
            // InternalGumboParser.g:1574:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* )
            // InternalGumboParser.g:1575:4: ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )*
            {
            // InternalGumboParser.g:1575:4: ( (otherlv_0= RULE_ID ) )
            // InternalGumboParser.g:1576:5: (otherlv_0= RULE_ID )
            {
            // InternalGumboParser.g:1576:5: (otherlv_0= RULE_ID )
            // InternalGumboParser.g:1577:6: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              						/* */
              					
            }
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElement(grammarAccess.getOtherDataRefRule());
              						}
              					
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						newLeafNode(otherlv_0, grammarAccess.getOtherDataRefAccess().getNamedElementNamedElementCrossReference_0_0_0());
              					
            }

            }


            }

            // InternalGumboParser.g:1591:4: ( (lv_arrayRange_1_0= ruleArrayRange ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==LeftSquareBracket) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalGumboParser.g:1592:5: (lv_arrayRange_1_0= ruleArrayRange )
            	    {
            	    // InternalGumboParser.g:1592:5: (lv_arrayRange_1_0= ruleArrayRange )
            	    // InternalGumboParser.g:1593:6: lv_arrayRange_1_0= ruleArrayRange
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOtherDataRefAccess().getArrayRangeArrayRangeParserRuleCall_0_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_35);
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
            	    break loop32;
                }
            } while (true);


            }

            // InternalGumboParser.g:1611:3: (otherlv_2= FullStop ( (lv_path_3_0= ruleOtherDataRef ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==FullStop) ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==RULE_ID) ) {
                    int LA33_3 = input.LA(3);

                    if ( (synpred33_InternalGumboParser()) ) {
                        alt33=1;
                    }
                }
            }
            switch (alt33) {
                case 1 :
                    // InternalGumboParser.g:1612:4: otherlv_2= FullStop ( (lv_path_3_0= ruleOtherDataRef ) )
                    {
                    otherlv_2=(Token)match(input,FullStop,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getOtherDataRefAccess().getFullStopKeyword_1_0());
                      			
                    }
                    // InternalGumboParser.g:1616:4: ( (lv_path_3_0= ruleOtherDataRef ) )
                    // InternalGumboParser.g:1617:5: (lv_path_3_0= ruleOtherDataRef )
                    {
                    // InternalGumboParser.g:1617:5: (lv_path_3_0= ruleOtherDataRef )
                    // InternalGumboParser.g:1618:6: lv_path_3_0= ruleOtherDataRef
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
    // InternalGumboParser.g:1640:1: entryRuleDataElement returns [EObject current=null] : iv_ruleDataElement= ruleDataElement EOF ;
    public final EObject entryRuleDataElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataElement = null;


        try {
            // InternalGumboParser.g:1640:52: (iv_ruleDataElement= ruleDataElement EOF )
            // InternalGumboParser.g:1641:2: iv_ruleDataElement= ruleDataElement EOF
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
    // InternalGumboParser.g:1647:1: ruleDataElement returns [EObject current=null] : ( ( ruleQCREF ) ) ;
    public final EObject ruleDataElement() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalGumboParser.g:1653:2: ( ( ( ruleQCREF ) ) )
            // InternalGumboParser.g:1654:2: ( ( ruleQCREF ) )
            {
            // InternalGumboParser.g:1654:2: ( ( ruleQCREF ) )
            // InternalGumboParser.g:1655:3: ( ruleQCREF )
            {
            // InternalGumboParser.g:1655:3: ( ruleQCREF )
            // InternalGumboParser.g:1656:4: ruleQCREF
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
    // InternalGumboParser.g:1676:1: entryRuleFunctions returns [EObject current=null] : iv_ruleFunctions= ruleFunctions EOF ;
    public final EObject entryRuleFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctions = null;


        try {
            // InternalGumboParser.g:1676:50: (iv_ruleFunctions= ruleFunctions EOF )
            // InternalGumboParser.g:1677:2: iv_ruleFunctions= ruleFunctions EOF
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
    // InternalGumboParser.g:1683:1: ruleFunctions returns [EObject current=null] : (otherlv_0= Functions ( (lv_specs_1_0= ruleFuncSpec ) )+ ) ;
    public final EObject ruleFunctions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_specs_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1689:2: ( (otherlv_0= Functions ( (lv_specs_1_0= ruleFuncSpec ) )+ ) )
            // InternalGumboParser.g:1690:2: (otherlv_0= Functions ( (lv_specs_1_0= ruleFuncSpec ) )+ )
            {
            // InternalGumboParser.g:1690:2: (otherlv_0= Functions ( (lv_specs_1_0= ruleFuncSpec ) )+ )
            // InternalGumboParser.g:1691:3: otherlv_0= Functions ( (lv_specs_1_0= ruleFuncSpec ) )+
            {
            otherlv_0=(Token)match(input,Functions,FollowSets000.FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunctionsAccess().getFunctionsKeyword_0());
              		
            }
            // InternalGumboParser.g:1695:3: ( (lv_specs_1_0= ruleFuncSpec ) )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==Def) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalGumboParser.g:1696:4: (lv_specs_1_0= ruleFuncSpec )
            	    {
            	    // InternalGumboParser.g:1696:4: (lv_specs_1_0= ruleFuncSpec )
            	    // InternalGumboParser.g:1697:5: lv_specs_1_0= ruleFuncSpec
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getFunctionsAccess().getSpecsFuncSpecParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_37);
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
            	    if ( cnt34 >= 1 ) break loop34;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
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
    // InternalGumboParser.g:1718:1: entryRuleFuncSpec returns [EObject current=null] : iv_ruleFuncSpec= ruleFuncSpec EOF ;
    public final EObject entryRuleFuncSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncSpec = null;


        try {
            // InternalGumboParser.g:1718:49: (iv_ruleFuncSpec= ruleFuncSpec EOF )
            // InternalGumboParser.g:1719:2: iv_ruleFuncSpec= ruleFuncSpec EOF
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
    // InternalGumboParser.g:1725:1: ruleFuncSpec returns [EObject current=null] : (this_SlangDefDef_0= ruleSlangDefDef otherlv_1= Semicolon ) ;
    public final EObject ruleFuncSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_SlangDefDef_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1731:2: ( (this_SlangDefDef_0= ruleSlangDefDef otherlv_1= Semicolon ) )
            // InternalGumboParser.g:1732:2: (this_SlangDefDef_0= ruleSlangDefDef otherlv_1= Semicolon )
            {
            // InternalGumboParser.g:1732:2: (this_SlangDefDef_0= ruleSlangDefDef otherlv_1= Semicolon )
            // InternalGumboParser.g:1733:3: this_SlangDefDef_0= ruleSlangDefDef otherlv_1= Semicolon
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
    // InternalGumboParser.g:1752:1: entryRuleSlangDefDecl returns [EObject current=null] : iv_ruleSlangDefDecl= ruleSlangDefDecl EOF ;
    public final EObject entryRuleSlangDefDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangDefDecl = null;


        try {
            // InternalGumboParser.g:1752:53: (iv_ruleSlangDefDecl= ruleSlangDefDecl EOF )
            // InternalGumboParser.g:1753:2: iv_ruleSlangDefDecl= ruleSlangDefDecl EOF
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
    // InternalGumboParser.g:1759:1: ruleSlangDefDecl returns [EObject current=null] : (otherlv_0= Def ( ruleSlangDefMods )? ( (lv_sde_2_0= ruleSlangDefExt ) )? ( (lv_name_3_0= ruleSlangDefID ) ) ( (lv_typeParams_4_0= ruleSlangTypeParams ) )? ( (lv_params_5_0= ruleSlangDefParams ) )? otherlv_6= Colon ( (lv_type_7_0= ruleSlangType ) ) ( (lv_c_8_0= ruleSlangDefContract ) )? ) ;
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
            // InternalGumboParser.g:1765:2: ( (otherlv_0= Def ( ruleSlangDefMods )? ( (lv_sde_2_0= ruleSlangDefExt ) )? ( (lv_name_3_0= ruleSlangDefID ) ) ( (lv_typeParams_4_0= ruleSlangTypeParams ) )? ( (lv_params_5_0= ruleSlangDefParams ) )? otherlv_6= Colon ( (lv_type_7_0= ruleSlangType ) ) ( (lv_c_8_0= ruleSlangDefContract ) )? ) )
            // InternalGumboParser.g:1766:2: (otherlv_0= Def ( ruleSlangDefMods )? ( (lv_sde_2_0= ruleSlangDefExt ) )? ( (lv_name_3_0= ruleSlangDefID ) ) ( (lv_typeParams_4_0= ruleSlangTypeParams ) )? ( (lv_params_5_0= ruleSlangDefParams ) )? otherlv_6= Colon ( (lv_type_7_0= ruleSlangType ) ) ( (lv_c_8_0= ruleSlangDefContract ) )? )
            {
            // InternalGumboParser.g:1766:2: (otherlv_0= Def ( ruleSlangDefMods )? ( (lv_sde_2_0= ruleSlangDefExt ) )? ( (lv_name_3_0= ruleSlangDefID ) ) ( (lv_typeParams_4_0= ruleSlangTypeParams ) )? ( (lv_params_5_0= ruleSlangDefParams ) )? otherlv_6= Colon ( (lv_type_7_0= ruleSlangType ) ) ( (lv_c_8_0= ruleSlangDefContract ) )? )
            // InternalGumboParser.g:1767:3: otherlv_0= Def ( ruleSlangDefMods )? ( (lv_sde_2_0= ruleSlangDefExt ) )? ( (lv_name_3_0= ruleSlangDefID ) ) ( (lv_typeParams_4_0= ruleSlangTypeParams ) )? ( (lv_params_5_0= ruleSlangDefParams ) )? otherlv_6= Colon ( (lv_type_7_0= ruleSlangType ) ) ( (lv_c_8_0= ruleSlangDefContract ) )?
            {
            otherlv_0=(Token)match(input,Def,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangDefDeclAccess().getDefKeyword_0());
              		
            }
            // InternalGumboParser.g:1771:3: ( ruleSlangDefMods )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==Strictpure||LA35_0==Pure) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalGumboParser.g:1772:4: ruleSlangDefMods
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSlangDefDeclAccess().getSlangDefModsParserRuleCall_1());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_38);
                    ruleSlangDefMods();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalGumboParser.g:1783:3: ( (lv_sde_2_0= ruleSlangDefExt ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==LeftParenthesis) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalGumboParser.g:1784:4: (lv_sde_2_0= ruleSlangDefExt )
                    {
                    // InternalGumboParser.g:1784:4: (lv_sde_2_0= ruleSlangDefExt )
                    // InternalGumboParser.g:1785:5: lv_sde_2_0= ruleSlangDefExt
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangDefDeclAccess().getSdeSlangDefExtParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_38);
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

            // InternalGumboParser.g:1802:3: ( (lv_name_3_0= ruleSlangDefID ) )
            // InternalGumboParser.g:1803:4: (lv_name_3_0= ruleSlangDefID )
            {
            // InternalGumboParser.g:1803:4: (lv_name_3_0= ruleSlangDefID )
            // InternalGumboParser.g:1804:5: lv_name_3_0= ruleSlangDefID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangDefDeclAccess().getNameSlangDefIDParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_39);
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

            // InternalGumboParser.g:1821:3: ( (lv_typeParams_4_0= ruleSlangTypeParams ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==LeftSquareBracket) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalGumboParser.g:1822:4: (lv_typeParams_4_0= ruleSlangTypeParams )
                    {
                    // InternalGumboParser.g:1822:4: (lv_typeParams_4_0= ruleSlangTypeParams )
                    // InternalGumboParser.g:1823:5: lv_typeParams_4_0= ruleSlangTypeParams
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangDefDeclAccess().getTypeParamsSlangTypeParamsParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_40);
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

            // InternalGumboParser.g:1840:3: ( (lv_params_5_0= ruleSlangDefParams ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==LeftParenthesis) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalGumboParser.g:1841:4: (lv_params_5_0= ruleSlangDefParams )
                    {
                    // InternalGumboParser.g:1841:4: (lv_params_5_0= ruleSlangDefParams )
                    // InternalGumboParser.g:1842:5: lv_params_5_0= ruleSlangDefParams
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
            // InternalGumboParser.g:1863:3: ( (lv_type_7_0= ruleSlangType ) )
            // InternalGumboParser.g:1864:4: (lv_type_7_0= ruleSlangType )
            {
            // InternalGumboParser.g:1864:4: (lv_type_7_0= ruleSlangType )
            // InternalGumboParser.g:1865:5: lv_type_7_0= ruleSlangType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangDefDeclAccess().getTypeSlangTypeParserRuleCall_7_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_41);
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

            // InternalGumboParser.g:1882:3: ( (lv_c_8_0= ruleSlangDefContract ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==Guarantee||LA39_0==Modifies||LA39_0==Assume||LA39_0==Reads) ) {
                alt39=1;
            }
            else if ( (LA39_0==EOF) ) {
                int LA39_2 = input.LA(2);

                if ( (synpred39_InternalGumboParser()) ) {
                    alt39=1;
                }
            }
            switch (alt39) {
                case 1 :
                    // InternalGumboParser.g:1883:4: (lv_c_8_0= ruleSlangDefContract )
                    {
                    // InternalGumboParser.g:1883:4: (lv_c_8_0= ruleSlangDefContract )
                    // InternalGumboParser.g:1884:5: lv_c_8_0= ruleSlangDefContract
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
    // InternalGumboParser.g:1905:1: entryRuleSlangDefDef returns [EObject current=null] : iv_ruleSlangDefDef= ruleSlangDefDef EOF ;
    public final EObject entryRuleSlangDefDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangDefDef = null;


        try {
            // InternalGumboParser.g:1905:52: (iv_ruleSlangDefDef= ruleSlangDefDef EOF )
            // InternalGumboParser.g:1906:2: iv_ruleSlangDefDef= ruleSlangDefDef EOF
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
    // InternalGumboParser.g:1912:1: ruleSlangDefDef returns [EObject current=null] : (otherlv_0= Def ( (lv_sde_1_0= ruleSlangDefExt ) )? ( (lv_name_2_0= ruleSlangDefID ) ) ( (lv_typeParams_3_0= ruleSlangTypeParams ) )? ( (lv_params_4_0= ruleSlangDefParams ) ) otherlv_5= Colon ( (lv_type_6_0= ruleSlangType ) ) otherlv_7= ColonEqualsSign ( (lv_methodContract_8_0= ruleSlangDefContract ) ) ( (lv_body_9_0= ruleExpr ) ) ) ;
    public final EObject ruleSlangDefDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_sde_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_typeParams_3_0 = null;

        EObject lv_params_4_0 = null;

        EObject lv_type_6_0 = null;

        EObject lv_methodContract_8_0 = null;

        EObject lv_body_9_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1918:2: ( (otherlv_0= Def ( (lv_sde_1_0= ruleSlangDefExt ) )? ( (lv_name_2_0= ruleSlangDefID ) ) ( (lv_typeParams_3_0= ruleSlangTypeParams ) )? ( (lv_params_4_0= ruleSlangDefParams ) ) otherlv_5= Colon ( (lv_type_6_0= ruleSlangType ) ) otherlv_7= ColonEqualsSign ( (lv_methodContract_8_0= ruleSlangDefContract ) ) ( (lv_body_9_0= ruleExpr ) ) ) )
            // InternalGumboParser.g:1919:2: (otherlv_0= Def ( (lv_sde_1_0= ruleSlangDefExt ) )? ( (lv_name_2_0= ruleSlangDefID ) ) ( (lv_typeParams_3_0= ruleSlangTypeParams ) )? ( (lv_params_4_0= ruleSlangDefParams ) ) otherlv_5= Colon ( (lv_type_6_0= ruleSlangType ) ) otherlv_7= ColonEqualsSign ( (lv_methodContract_8_0= ruleSlangDefContract ) ) ( (lv_body_9_0= ruleExpr ) ) )
            {
            // InternalGumboParser.g:1919:2: (otherlv_0= Def ( (lv_sde_1_0= ruleSlangDefExt ) )? ( (lv_name_2_0= ruleSlangDefID ) ) ( (lv_typeParams_3_0= ruleSlangTypeParams ) )? ( (lv_params_4_0= ruleSlangDefParams ) ) otherlv_5= Colon ( (lv_type_6_0= ruleSlangType ) ) otherlv_7= ColonEqualsSign ( (lv_methodContract_8_0= ruleSlangDefContract ) ) ( (lv_body_9_0= ruleExpr ) ) )
            // InternalGumboParser.g:1920:3: otherlv_0= Def ( (lv_sde_1_0= ruleSlangDefExt ) )? ( (lv_name_2_0= ruleSlangDefID ) ) ( (lv_typeParams_3_0= ruleSlangTypeParams ) )? ( (lv_params_4_0= ruleSlangDefParams ) ) otherlv_5= Colon ( (lv_type_6_0= ruleSlangType ) ) otherlv_7= ColonEqualsSign ( (lv_methodContract_8_0= ruleSlangDefContract ) ) ( (lv_body_9_0= ruleExpr ) )
            {
            otherlv_0=(Token)match(input,Def,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangDefDefAccess().getDefKeyword_0());
              		
            }
            // InternalGumboParser.g:1924:3: ( (lv_sde_1_0= ruleSlangDefExt ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==LeftParenthesis) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalGumboParser.g:1925:4: (lv_sde_1_0= ruleSlangDefExt )
                    {
                    // InternalGumboParser.g:1925:4: (lv_sde_1_0= ruleSlangDefExt )
                    // InternalGumboParser.g:1926:5: lv_sde_1_0= ruleSlangDefExt
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangDefDefAccess().getSdeSlangDefExtParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_38);
                    lv_sde_1_0=ruleSlangDefExt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSlangDefDefRule());
                      					}
                      					set(
                      						current,
                      						"sde",
                      						lv_sde_1_0,
                      						"org.sireum.aadl.gumbo.Gumbo.SlangDefExt");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalGumboParser.g:1943:3: ( (lv_name_2_0= ruleSlangDefID ) )
            // InternalGumboParser.g:1944:4: (lv_name_2_0= ruleSlangDefID )
            {
            // InternalGumboParser.g:1944:4: (lv_name_2_0= ruleSlangDefID )
            // InternalGumboParser.g:1945:5: lv_name_2_0= ruleSlangDefID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangDefDefAccess().getNameSlangDefIDParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_42);
            lv_name_2_0=ruleSlangDefID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSlangDefDefRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.sireum.aadl.gumbo.Gumbo.SlangDefID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumboParser.g:1962:3: ( (lv_typeParams_3_0= ruleSlangTypeParams ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==LeftSquareBracket) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalGumboParser.g:1963:4: (lv_typeParams_3_0= ruleSlangTypeParams )
                    {
                    // InternalGumboParser.g:1963:4: (lv_typeParams_3_0= ruleSlangTypeParams )
                    // InternalGumboParser.g:1964:5: lv_typeParams_3_0= ruleSlangTypeParams
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangDefDefAccess().getTypeParamsSlangTypeParamsParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
                    lv_typeParams_3_0=ruleSlangTypeParams();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSlangDefDefRule());
                      					}
                      					set(
                      						current,
                      						"typeParams",
                      						lv_typeParams_3_0,
                      						"org.sireum.aadl.gumbo.Gumbo.SlangTypeParams");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalGumboParser.g:1981:3: ( (lv_params_4_0= ruleSlangDefParams ) )
            // InternalGumboParser.g:1982:4: (lv_params_4_0= ruleSlangDefParams )
            {
            // InternalGumboParser.g:1982:4: (lv_params_4_0= ruleSlangDefParams )
            // InternalGumboParser.g:1983:5: lv_params_4_0= ruleSlangDefParams
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangDefDefAccess().getParamsSlangDefParamsParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_10);
            lv_params_4_0=ruleSlangDefParams();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSlangDefDefRule());
              					}
              					set(
              						current,
              						"params",
              						lv_params_4_0,
              						"org.sireum.aadl.gumbo.Gumbo.SlangDefParams");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,Colon,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getSlangDefDefAccess().getColonKeyword_5());
              		
            }
            // InternalGumboParser.g:2004:3: ( (lv_type_6_0= ruleSlangType ) )
            // InternalGumboParser.g:2005:4: (lv_type_6_0= ruleSlangType )
            {
            // InternalGumboParser.g:2005:4: (lv_type_6_0= ruleSlangType )
            // InternalGumboParser.g:2006:5: lv_type_6_0= ruleSlangType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangDefDefAccess().getTypeSlangTypeParserRuleCall_6_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_43);
            lv_type_6_0=ruleSlangType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSlangDefDefRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_6_0,
              						"org.sireum.aadl.gumbo.Gumbo.SlangType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_7=(Token)match(input,ColonEqualsSign,FollowSets000.FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getSlangDefDefAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalGumboParser.g:2027:3: ( (lv_methodContract_8_0= ruleSlangDefContract ) )
            // InternalGumboParser.g:2028:4: (lv_methodContract_8_0= ruleSlangDefContract )
            {
            // InternalGumboParser.g:2028:4: (lv_methodContract_8_0= ruleSlangDefContract )
            // InternalGumboParser.g:2029:5: lv_methodContract_8_0= ruleSlangDefContract
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangDefDefAccess().getMethodContractSlangDefContractParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_15);
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

            // InternalGumboParser.g:2046:3: ( (lv_body_9_0= ruleExpr ) )
            // InternalGumboParser.g:2047:4: (lv_body_9_0= ruleExpr )
            {
            // InternalGumboParser.g:2047:4: (lv_body_9_0= ruleExpr )
            // InternalGumboParser.g:2048:5: lv_body_9_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangDefDefAccess().getBodyExprParserRuleCall_9_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_body_9_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSlangDefDefRule());
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
    // $ANTLR end "ruleSlangDefDef"


    // $ANTLR start "entryRuleSlangDefMods"
    // InternalGumboParser.g:2069:1: entryRuleSlangDefMods returns [String current=null] : iv_ruleSlangDefMods= ruleSlangDefMods EOF ;
    public final String entryRuleSlangDefMods() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSlangDefMods = null;


        try {
            // InternalGumboParser.g:2069:52: (iv_ruleSlangDefMods= ruleSlangDefMods EOF )
            // InternalGumboParser.g:2070:2: iv_ruleSlangDefMods= ruleSlangDefMods EOF
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
    // InternalGumboParser.g:2076:1: ruleSlangDefMods returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Strictpure | kw= Pure ) ;
    public final AntlrDatatypeRuleToken ruleSlangDefMods() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumboParser.g:2082:2: ( (kw= Strictpure | kw= Pure ) )
            // InternalGumboParser.g:2083:2: (kw= Strictpure | kw= Pure )
            {
            // InternalGumboParser.g:2083:2: (kw= Strictpure | kw= Pure )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==Strictpure) ) {
                alt42=1;
            }
            else if ( (LA42_0==Pure) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalGumboParser.g:2084:3: kw= Strictpure
                    {
                    kw=(Token)match(input,Strictpure,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getSlangDefModsAccess().getStrictpureKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:2090:3: kw= Pure
                    {
                    kw=(Token)match(input,Pure,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getSlangDefModsAccess().getPureKeyword_1());
                      		
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
    // $ANTLR end "ruleSlangDefMods"


    // $ANTLR start "entryRuleSlangDefExt"
    // InternalGumboParser.g:2099:1: entryRuleSlangDefExt returns [EObject current=null] : iv_ruleSlangDefExt= ruleSlangDefExt EOF ;
    public final EObject entryRuleSlangDefExt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangDefExt = null;


        try {
            // InternalGumboParser.g:2099:52: (iv_ruleSlangDefExt= ruleSlangDefExt EOF )
            // InternalGumboParser.g:2100:2: iv_ruleSlangDefExt= ruleSlangDefExt EOF
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
    // InternalGumboParser.g:2106:1: ruleSlangDefExt returns [EObject current=null] : (otherlv_0= LeftParenthesis ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) otherlv_4= RightParenthesis ) ;
    public final EObject ruleSlangDefExt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_typeName_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2112:2: ( (otherlv_0= LeftParenthesis ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) otherlv_4= RightParenthesis ) )
            // InternalGumboParser.g:2113:2: (otherlv_0= LeftParenthesis ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) otherlv_4= RightParenthesis )
            {
            // InternalGumboParser.g:2113:2: (otherlv_0= LeftParenthesis ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) otherlv_4= RightParenthesis )
            // InternalGumboParser.g:2114:3: otherlv_0= LeftParenthesis ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) otherlv_4= RightParenthesis
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangDefExtAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalGumboParser.g:2118:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGumboParser.g:2119:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGumboParser.g:2119:4: (lv_name_1_0= RULE_ID )
            // InternalGumboParser.g:2120:5: lv_name_1_0= RULE_ID
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
            // InternalGumboParser.g:2140:3: ( (lv_typeName_3_0= ruleSlangType ) )
            // InternalGumboParser.g:2141:4: (lv_typeName_3_0= ruleSlangType )
            {
            // InternalGumboParser.g:2141:4: (lv_typeName_3_0= ruleSlangType )
            // InternalGumboParser.g:2142:5: lv_typeName_3_0= ruleSlangType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangDefExtAccess().getTypeNameSlangTypeParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_45);
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
    // InternalGumboParser.g:2167:1: entryRuleSlangDefID returns [String current=null] : iv_ruleSlangDefID= ruleSlangDefID EOF ;
    public final String entryRuleSlangDefID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSlangDefID = null;


        try {
            // InternalGumboParser.g:2167:50: (iv_ruleSlangDefID= ruleSlangDefID EOF )
            // InternalGumboParser.g:2168:2: iv_ruleSlangDefID= ruleSlangDefID EOF
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
    // InternalGumboParser.g:2174:1: ruleSlangDefID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_Operator_1= ruleOperator ) ;
    public final AntlrDatatypeRuleToken ruleSlangDefID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        AntlrDatatypeRuleToken this_Operator_1 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2180:2: ( (this_ID_0= RULE_ID | this_Operator_1= ruleOperator ) )
            // InternalGumboParser.g:2181:2: (this_ID_0= RULE_ID | this_Operator_1= ruleOperator )
            {
            // InternalGumboParser.g:2181:2: (this_ID_0= RULE_ID | this_Operator_1= ruleOperator )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                alt43=1;
            }
            else if ( ((LA43_0>=Asterisk && LA43_0<=PlusSign)||LA43_0==HyphenMinus||(LA43_0>=RULE_IMPLIES && LA43_0<=RULE_OP)) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalGumboParser.g:2182:3: this_ID_0= RULE_ID
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
                    // InternalGumboParser.g:2190:3: this_Operator_1= ruleOperator
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
    // InternalGumboParser.g:2204:1: entryRuleSlangDefParams returns [EObject current=null] : iv_ruleSlangDefParams= ruleSlangDefParams EOF ;
    public final EObject entryRuleSlangDefParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangDefParams = null;


        try {
            // InternalGumboParser.g:2204:55: (iv_ruleSlangDefParams= ruleSlangDefParams EOF )
            // InternalGumboParser.g:2205:2: iv_ruleSlangDefParams= ruleSlangDefParams EOF
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
    // InternalGumboParser.g:2211:1: ruleSlangDefParams returns [EObject current=null] : (otherlv_0= LeftParenthesis ( ( (lv_params_1_0= ruleSlangDefParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangDefParam ) ) )* )? otherlv_4= RightParenthesis ) ;
    public final EObject ruleSlangDefParams() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_params_1_0 = null;

        EObject lv_params_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2217:2: ( (otherlv_0= LeftParenthesis ( ( (lv_params_1_0= ruleSlangDefParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangDefParam ) ) )* )? otherlv_4= RightParenthesis ) )
            // InternalGumboParser.g:2218:2: (otherlv_0= LeftParenthesis ( ( (lv_params_1_0= ruleSlangDefParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangDefParam ) ) )* )? otherlv_4= RightParenthesis )
            {
            // InternalGumboParser.g:2218:2: (otherlv_0= LeftParenthesis ( ( (lv_params_1_0= ruleSlangDefParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangDefParam ) ) )* )? otherlv_4= RightParenthesis )
            // InternalGumboParser.g:2219:3: otherlv_0= LeftParenthesis ( ( (lv_params_1_0= ruleSlangDefParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangDefParam ) ) )* )? otherlv_4= RightParenthesis
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangDefParamsAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalGumboParser.g:2223:3: ( ( (lv_params_1_0= ruleSlangDefParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangDefParam ) ) )* )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalGumboParser.g:2224:4: ( (lv_params_1_0= ruleSlangDefParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangDefParam ) ) )*
                    {
                    // InternalGumboParser.g:2224:4: ( (lv_params_1_0= ruleSlangDefParam ) )
                    // InternalGumboParser.g:2225:5: (lv_params_1_0= ruleSlangDefParam )
                    {
                    // InternalGumboParser.g:2225:5: (lv_params_1_0= ruleSlangDefParam )
                    // InternalGumboParser.g:2226:6: lv_params_1_0= ruleSlangDefParam
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangDefParamsAccess().getParamsSlangDefParamParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_29);
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

                    // InternalGumboParser.g:2243:4: (otherlv_2= Comma ( (lv_params_3_0= ruleSlangDefParam ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==Comma) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalGumboParser.g:2244:5: otherlv_2= Comma ( (lv_params_3_0= ruleSlangDefParam ) )
                    	    {
                    	    otherlv_2=(Token)match(input,Comma,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getSlangDefParamsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:2248:5: ( (lv_params_3_0= ruleSlangDefParam ) )
                    	    // InternalGumboParser.g:2249:6: (lv_params_3_0= ruleSlangDefParam )
                    	    {
                    	    // InternalGumboParser.g:2249:6: (lv_params_3_0= ruleSlangDefParam )
                    	    // InternalGumboParser.g:2250:7: lv_params_3_0= ruleSlangDefParam
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSlangDefParamsAccess().getParamsSlangDefParamParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_29);
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
                    	    break loop44;
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
    // InternalGumboParser.g:2277:1: entryRuleSlangDefParam returns [EObject current=null] : iv_ruleSlangDefParam= ruleSlangDefParam EOF ;
    public final EObject entryRuleSlangDefParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangDefParam = null;


        try {
            // InternalGumboParser.g:2277:54: (iv_ruleSlangDefParam= ruleSlangDefParam EOF )
            // InternalGumboParser.g:2278:2: iv_ruleSlangDefParam= ruleSlangDefParam EOF
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
    // InternalGumboParser.g:2284:1: ruleSlangDefParam returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_isMethodDef_2_0= EqualsSignGreaterThanSign ) )? ( (lv_typeName_3_0= ruleSlangType ) ) ( (lv_isVarArg_4_0= Asterisk ) )? ) ;
    public final EObject ruleSlangDefParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_isMethodDef_2_0=null;
        Token lv_isVarArg_4_0=null;
        EObject lv_typeName_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2290:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_isMethodDef_2_0= EqualsSignGreaterThanSign ) )? ( (lv_typeName_3_0= ruleSlangType ) ) ( (lv_isVarArg_4_0= Asterisk ) )? ) )
            // InternalGumboParser.g:2291:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_isMethodDef_2_0= EqualsSignGreaterThanSign ) )? ( (lv_typeName_3_0= ruleSlangType ) ) ( (lv_isVarArg_4_0= Asterisk ) )? )
            {
            // InternalGumboParser.g:2291:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_isMethodDef_2_0= EqualsSignGreaterThanSign ) )? ( (lv_typeName_3_0= ruleSlangType ) ) ( (lv_isVarArg_4_0= Asterisk ) )? )
            // InternalGumboParser.g:2292:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_isMethodDef_2_0= EqualsSignGreaterThanSign ) )? ( (lv_typeName_3_0= ruleSlangType ) ) ( (lv_isVarArg_4_0= Asterisk ) )?
            {
            // InternalGumboParser.g:2292:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGumboParser.g:2293:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGumboParser.g:2293:4: (lv_name_0_0= RULE_ID )
            // InternalGumboParser.g:2294:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,Colon,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSlangDefParamAccess().getColonKeyword_1());
              		
            }
            // InternalGumboParser.g:2314:3: ( (lv_isMethodDef_2_0= EqualsSignGreaterThanSign ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==EqualsSignGreaterThanSign) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalGumboParser.g:2315:4: (lv_isMethodDef_2_0= EqualsSignGreaterThanSign )
                    {
                    // InternalGumboParser.g:2315:4: (lv_isMethodDef_2_0= EqualsSignGreaterThanSign )
                    // InternalGumboParser.g:2316:5: lv_isMethodDef_2_0= EqualsSignGreaterThanSign
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

            // InternalGumboParser.g:2328:3: ( (lv_typeName_3_0= ruleSlangType ) )
            // InternalGumboParser.g:2329:4: (lv_typeName_3_0= ruleSlangType )
            {
            // InternalGumboParser.g:2329:4: (lv_typeName_3_0= ruleSlangType )
            // InternalGumboParser.g:2330:5: lv_typeName_3_0= ruleSlangType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangDefParamAccess().getTypeNameSlangTypeParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_47);
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

            // InternalGumboParser.g:2347:3: ( (lv_isVarArg_4_0= Asterisk ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==Asterisk) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalGumboParser.g:2348:4: (lv_isVarArg_4_0= Asterisk )
                    {
                    // InternalGumboParser.g:2348:4: (lv_isVarArg_4_0= Asterisk )
                    // InternalGumboParser.g:2349:5: lv_isVarArg_4_0= Asterisk
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
    // InternalGumboParser.g:2365:1: entryRuleSlangTypeParams returns [EObject current=null] : iv_ruleSlangTypeParams= ruleSlangTypeParams EOF ;
    public final EObject entryRuleSlangTypeParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangTypeParams = null;


        try {
            // InternalGumboParser.g:2365:56: (iv_ruleSlangTypeParams= ruleSlangTypeParams EOF )
            // InternalGumboParser.g:2366:2: iv_ruleSlangTypeParams= ruleSlangTypeParams EOF
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
    // InternalGumboParser.g:2372:1: ruleSlangTypeParams returns [EObject current=null] : (otherlv_0= LeftSquareBracket ( (lv_typeParam_1_0= ruleSlangTypeParam ) ) (otherlv_2= Comma ( (lv_typeParam_3_0= ruleSlangTypeParam ) ) )* otherlv_4= RightSquareBracket ) ;
    public final EObject ruleSlangTypeParams() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_typeParam_1_0 = null;

        EObject lv_typeParam_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2378:2: ( (otherlv_0= LeftSquareBracket ( (lv_typeParam_1_0= ruleSlangTypeParam ) ) (otherlv_2= Comma ( (lv_typeParam_3_0= ruleSlangTypeParam ) ) )* otherlv_4= RightSquareBracket ) )
            // InternalGumboParser.g:2379:2: (otherlv_0= LeftSquareBracket ( (lv_typeParam_1_0= ruleSlangTypeParam ) ) (otherlv_2= Comma ( (lv_typeParam_3_0= ruleSlangTypeParam ) ) )* otherlv_4= RightSquareBracket )
            {
            // InternalGumboParser.g:2379:2: (otherlv_0= LeftSquareBracket ( (lv_typeParam_1_0= ruleSlangTypeParam ) ) (otherlv_2= Comma ( (lv_typeParam_3_0= ruleSlangTypeParam ) ) )* otherlv_4= RightSquareBracket )
            // InternalGumboParser.g:2380:3: otherlv_0= LeftSquareBracket ( (lv_typeParam_1_0= ruleSlangTypeParam ) ) (otherlv_2= Comma ( (lv_typeParam_3_0= ruleSlangTypeParam ) ) )* otherlv_4= RightSquareBracket
            {
            otherlv_0=(Token)match(input,LeftSquareBracket,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangTypeParamsAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalGumboParser.g:2384:3: ( (lv_typeParam_1_0= ruleSlangTypeParam ) )
            // InternalGumboParser.g:2385:4: (lv_typeParam_1_0= ruleSlangTypeParam )
            {
            // InternalGumboParser.g:2385:4: (lv_typeParam_1_0= ruleSlangTypeParam )
            // InternalGumboParser.g:2386:5: lv_typeParam_1_0= ruleSlangTypeParam
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangTypeParamsAccess().getTypeParamSlangTypeParamParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_49);
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

            // InternalGumboParser.g:2403:3: (otherlv_2= Comma ( (lv_typeParam_3_0= ruleSlangTypeParam ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==Comma) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalGumboParser.g:2404:4: otherlv_2= Comma ( (lv_typeParam_3_0= ruleSlangTypeParam ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FollowSets000.FOLLOW_48); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSlangTypeParamsAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalGumboParser.g:2408:4: ( (lv_typeParam_3_0= ruleSlangTypeParam ) )
            	    // InternalGumboParser.g:2409:5: (lv_typeParam_3_0= ruleSlangTypeParam )
            	    {
            	    // InternalGumboParser.g:2409:5: (lv_typeParam_3_0= ruleSlangTypeParam )
            	    // InternalGumboParser.g:2410:6: lv_typeParam_3_0= ruleSlangTypeParam
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSlangTypeParamsAccess().getTypeParamSlangTypeParamParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_49);
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
            	    break loop48;
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
    // InternalGumboParser.g:2436:1: entryRuleSlangTypeParam returns [EObject current=null] : iv_ruleSlangTypeParam= ruleSlangTypeParam EOF ;
    public final EObject entryRuleSlangTypeParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangTypeParam = null;


        try {
            // InternalGumboParser.g:2436:55: (iv_ruleSlangTypeParam= ruleSlangTypeParam EOF )
            // InternalGumboParser.g:2437:2: iv_ruleSlangTypeParam= ruleSlangTypeParam EOF
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
    // InternalGumboParser.g:2443:1: ruleSlangTypeParam returns [EObject current=null] : ( ( (lv_isMut_0_0= Mut ) )? ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSlangTypeParam() throws RecognitionException {
        EObject current = null;

        Token lv_isMut_0_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGumboParser.g:2449:2: ( ( ( (lv_isMut_0_0= Mut ) )? ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGumboParser.g:2450:2: ( ( (lv_isMut_0_0= Mut ) )? ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGumboParser.g:2450:2: ( ( (lv_isMut_0_0= Mut ) )? ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGumboParser.g:2451:3: ( (lv_isMut_0_0= Mut ) )? ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalGumboParser.g:2451:3: ( (lv_isMut_0_0= Mut ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==Mut) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalGumboParser.g:2452:4: (lv_isMut_0_0= Mut )
                    {
                    // InternalGumboParser.g:2452:4: (lv_isMut_0_0= Mut )
                    // InternalGumboParser.g:2453:5: lv_isMut_0_0= Mut
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

            // InternalGumboParser.g:2465:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGumboParser.g:2466:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGumboParser.g:2466:4: (lv_name_1_0= RULE_ID )
            // InternalGumboParser.g:2467:5: lv_name_1_0= RULE_ID
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
    // InternalGumboParser.g:2487:1: entryRuleSlangDefContract returns [EObject current=null] : iv_ruleSlangDefContract= ruleSlangDefContract EOF ;
    public final EObject entryRuleSlangDefContract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangDefContract = null;


        try {
            // InternalGumboParser.g:2487:57: (iv_ruleSlangDefContract= ruleSlangDefContract EOF )
            // InternalGumboParser.g:2488:2: iv_ruleSlangDefContract= ruleSlangDefContract EOF
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
    // InternalGumboParser.g:2494:1: ruleSlangDefContract returns [EObject current=null] : ( () ( ( ( (lv_reads_1_0= ruleSlangReads ) ) otherlv_2= Semicolon )? ( ( (lv_requires_3_0= ruleSlangRequires ) ) otherlv_4= Semicolon )? ( ( (lv_modifies_5_0= ruleSlangModifies ) ) otherlv_6= Semicolon )? ( ( (lv_ensures_7_0= ruleSlangEnsures ) ) otherlv_8= Semicolon )? ) ) ;
    public final EObject ruleSlangDefContract() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_reads_1_0 = null;

        EObject lv_requires_3_0 = null;

        EObject lv_modifies_5_0 = null;

        EObject lv_ensures_7_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2500:2: ( ( () ( ( ( (lv_reads_1_0= ruleSlangReads ) ) otherlv_2= Semicolon )? ( ( (lv_requires_3_0= ruleSlangRequires ) ) otherlv_4= Semicolon )? ( ( (lv_modifies_5_0= ruleSlangModifies ) ) otherlv_6= Semicolon )? ( ( (lv_ensures_7_0= ruleSlangEnsures ) ) otherlv_8= Semicolon )? ) ) )
            // InternalGumboParser.g:2501:2: ( () ( ( ( (lv_reads_1_0= ruleSlangReads ) ) otherlv_2= Semicolon )? ( ( (lv_requires_3_0= ruleSlangRequires ) ) otherlv_4= Semicolon )? ( ( (lv_modifies_5_0= ruleSlangModifies ) ) otherlv_6= Semicolon )? ( ( (lv_ensures_7_0= ruleSlangEnsures ) ) otherlv_8= Semicolon )? ) )
            {
            // InternalGumboParser.g:2501:2: ( () ( ( ( (lv_reads_1_0= ruleSlangReads ) ) otherlv_2= Semicolon )? ( ( (lv_requires_3_0= ruleSlangRequires ) ) otherlv_4= Semicolon )? ( ( (lv_modifies_5_0= ruleSlangModifies ) ) otherlv_6= Semicolon )? ( ( (lv_ensures_7_0= ruleSlangEnsures ) ) otherlv_8= Semicolon )? ) )
            // InternalGumboParser.g:2502:3: () ( ( ( (lv_reads_1_0= ruleSlangReads ) ) otherlv_2= Semicolon )? ( ( (lv_requires_3_0= ruleSlangRequires ) ) otherlv_4= Semicolon )? ( ( (lv_modifies_5_0= ruleSlangModifies ) ) otherlv_6= Semicolon )? ( ( (lv_ensures_7_0= ruleSlangEnsures ) ) otherlv_8= Semicolon )? )
            {
            // InternalGumboParser.g:2502:3: ()
            // InternalGumboParser.g:2503:4: 
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

            // InternalGumboParser.g:2512:3: ( ( ( (lv_reads_1_0= ruleSlangReads ) ) otherlv_2= Semicolon )? ( ( (lv_requires_3_0= ruleSlangRequires ) ) otherlv_4= Semicolon )? ( ( (lv_modifies_5_0= ruleSlangModifies ) ) otherlv_6= Semicolon )? ( ( (lv_ensures_7_0= ruleSlangEnsures ) ) otherlv_8= Semicolon )? )
            // InternalGumboParser.g:2513:4: ( ( (lv_reads_1_0= ruleSlangReads ) ) otherlv_2= Semicolon )? ( ( (lv_requires_3_0= ruleSlangRequires ) ) otherlv_4= Semicolon )? ( ( (lv_modifies_5_0= ruleSlangModifies ) ) otherlv_6= Semicolon )? ( ( (lv_ensures_7_0= ruleSlangEnsures ) ) otherlv_8= Semicolon )?
            {
            // InternalGumboParser.g:2513:4: ( ( (lv_reads_1_0= ruleSlangReads ) ) otherlv_2= Semicolon )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==Reads) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalGumboParser.g:2514:5: ( (lv_reads_1_0= ruleSlangReads ) ) otherlv_2= Semicolon
                    {
                    // InternalGumboParser.g:2514:5: ( (lv_reads_1_0= ruleSlangReads ) )
                    // InternalGumboParser.g:2515:6: (lv_reads_1_0= ruleSlangReads )
                    {
                    // InternalGumboParser.g:2515:6: (lv_reads_1_0= ruleSlangReads )
                    // InternalGumboParser.g:2516:7: lv_reads_1_0= ruleSlangReads
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSlangDefContractAccess().getReadsSlangReadsParserRuleCall_1_0_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_reads_1_0=ruleSlangReads();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSlangDefContractRule());
                      							}
                      							set(
                      								current,
                      								"reads",
                      								lv_reads_1_0,
                      								"org.sireum.aadl.gumbo.Gumbo.SlangReads");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,Semicolon,FollowSets000.FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getSlangDefContractAccess().getSemicolonKeyword_1_0_1());
                      				
                    }

                    }
                    break;

            }

            // InternalGumboParser.g:2538:4: ( ( (lv_requires_3_0= ruleSlangRequires ) ) otherlv_4= Semicolon )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==Assume) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalGumboParser.g:2539:5: ( (lv_requires_3_0= ruleSlangRequires ) ) otherlv_4= Semicolon
                    {
                    // InternalGumboParser.g:2539:5: ( (lv_requires_3_0= ruleSlangRequires ) )
                    // InternalGumboParser.g:2540:6: (lv_requires_3_0= ruleSlangRequires )
                    {
                    // InternalGumboParser.g:2540:6: (lv_requires_3_0= ruleSlangRequires )
                    // InternalGumboParser.g:2541:7: lv_requires_3_0= ruleSlangRequires
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSlangDefContractAccess().getRequiresSlangRequiresParserRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_requires_3_0=ruleSlangRequires();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSlangDefContractRule());
                      							}
                      							set(
                      								current,
                      								"requires",
                      								lv_requires_3_0,
                      								"org.sireum.aadl.gumbo.Gumbo.SlangRequires");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,Semicolon,FollowSets000.FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getSlangDefContractAccess().getSemicolonKeyword_1_1_1());
                      				
                    }

                    }
                    break;

            }

            // InternalGumboParser.g:2563:4: ( ( (lv_modifies_5_0= ruleSlangModifies ) ) otherlv_6= Semicolon )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==Modifies) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalGumboParser.g:2564:5: ( (lv_modifies_5_0= ruleSlangModifies ) ) otherlv_6= Semicolon
                    {
                    // InternalGumboParser.g:2564:5: ( (lv_modifies_5_0= ruleSlangModifies ) )
                    // InternalGumboParser.g:2565:6: (lv_modifies_5_0= ruleSlangModifies )
                    {
                    // InternalGumboParser.g:2565:6: (lv_modifies_5_0= ruleSlangModifies )
                    // InternalGumboParser.g:2566:7: lv_modifies_5_0= ruleSlangModifies
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSlangDefContractAccess().getModifiesSlangModifiesParserRuleCall_1_2_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_modifies_5_0=ruleSlangModifies();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSlangDefContractRule());
                      							}
                      							set(
                      								current,
                      								"modifies",
                      								lv_modifies_5_0,
                      								"org.sireum.aadl.gumbo.Gumbo.SlangModifies");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,Semicolon,FollowSets000.FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getSlangDefContractAccess().getSemicolonKeyword_1_2_1());
                      				
                    }

                    }
                    break;

            }

            // InternalGumboParser.g:2588:4: ( ( (lv_ensures_7_0= ruleSlangEnsures ) ) otherlv_8= Semicolon )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==Guarantee) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalGumboParser.g:2589:5: ( (lv_ensures_7_0= ruleSlangEnsures ) ) otherlv_8= Semicolon
                    {
                    // InternalGumboParser.g:2589:5: ( (lv_ensures_7_0= ruleSlangEnsures ) )
                    // InternalGumboParser.g:2590:6: (lv_ensures_7_0= ruleSlangEnsures )
                    {
                    // InternalGumboParser.g:2590:6: (lv_ensures_7_0= ruleSlangEnsures )
                    // InternalGumboParser.g:2591:7: lv_ensures_7_0= ruleSlangEnsures
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSlangDefContractAccess().getEnsuresSlangEnsuresParserRuleCall_1_3_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_ensures_7_0=ruleSlangEnsures();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSlangDefContractRule());
                      							}
                      							set(
                      								current,
                      								"ensures",
                      								lv_ensures_7_0,
                      								"org.sireum.aadl.gumbo.Gumbo.SlangEnsures");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,Semicolon,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_8, grammarAccess.getSlangDefContractAccess().getSemicolonKeyword_1_3_1());
                      				
                    }

                    }
                    break;

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
    // $ANTLR end "ruleSlangDefContract"


    // $ANTLR start "entryRuleSlangSupr"
    // InternalGumboParser.g:2618:1: entryRuleSlangSupr returns [EObject current=null] : iv_ruleSlangSupr= ruleSlangSupr EOF ;
    public final EObject entryRuleSlangSupr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangSupr = null;


        try {
            // InternalGumboParser.g:2618:50: (iv_ruleSlangSupr= ruleSlangSupr EOF )
            // InternalGumboParser.g:2619:2: iv_ruleSlangSupr= ruleSlangSupr EOF
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
    // InternalGumboParser.g:2625:1: ruleSlangSupr returns [EObject current=null] : ( ( (lv_name_0_0= ruleSlangName ) ) ( (lv_args_1_0= ruleSlangTypeArgs ) )? ) ;
    public final EObject ruleSlangSupr() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_args_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2631:2: ( ( ( (lv_name_0_0= ruleSlangName ) ) ( (lv_args_1_0= ruleSlangTypeArgs ) )? ) )
            // InternalGumboParser.g:2632:2: ( ( (lv_name_0_0= ruleSlangName ) ) ( (lv_args_1_0= ruleSlangTypeArgs ) )? )
            {
            // InternalGumboParser.g:2632:2: ( ( (lv_name_0_0= ruleSlangName ) ) ( (lv_args_1_0= ruleSlangTypeArgs ) )? )
            // InternalGumboParser.g:2633:3: ( (lv_name_0_0= ruleSlangName ) ) ( (lv_args_1_0= ruleSlangTypeArgs ) )?
            {
            // InternalGumboParser.g:2633:3: ( (lv_name_0_0= ruleSlangName ) )
            // InternalGumboParser.g:2634:4: (lv_name_0_0= ruleSlangName )
            {
            // InternalGumboParser.g:2634:4: (lv_name_0_0= ruleSlangName )
            // InternalGumboParser.g:2635:5: lv_name_0_0= ruleSlangName
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

            // InternalGumboParser.g:2652:3: ( (lv_args_1_0= ruleSlangTypeArgs ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==LeftSquareBracket) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalGumboParser.g:2653:4: (lv_args_1_0= ruleSlangTypeArgs )
                    {
                    // InternalGumboParser.g:2653:4: (lv_args_1_0= ruleSlangTypeArgs )
                    // InternalGumboParser.g:2654:5: lv_args_1_0= ruleSlangTypeArgs
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
    // InternalGumboParser.g:2675:1: entryRuleSlangName returns [String current=null] : iv_ruleSlangName= ruleSlangName EOF ;
    public final String entryRuleSlangName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSlangName = null;


        try {
            // InternalGumboParser.g:2675:49: (iv_ruleSlangName= ruleSlangName EOF )
            // InternalGumboParser.g:2676:2: iv_ruleSlangName= ruleSlangName EOF
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
    // InternalGumboParser.g:2682:1: ruleSlangName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleSlangName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalGumboParser.g:2688:2: ( (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) )
            // InternalGumboParser.g:2689:2: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
            {
            // InternalGumboParser.g:2689:2: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
            // InternalGumboParser.g:2690:3: this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getSlangNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalGumboParser.g:2697:3: (kw= FullStop this_ID_2= RULE_ID )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==FullStop) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalGumboParser.g:2698:4: kw= FullStop this_ID_2= RULE_ID
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
    // InternalGumboParser.g:2715:1: entryRuleSlangInvariant returns [EObject current=null] : iv_ruleSlangInvariant= ruleSlangInvariant EOF ;
    public final EObject entryRuleSlangInvariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangInvariant = null;


        try {
            // InternalGumboParser.g:2715:55: (iv_ruleSlangInvariant= ruleSlangInvariant EOF )
            // InternalGumboParser.g:2716:2: iv_ruleSlangInvariant= ruleSlangInvariant EOF
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
    // InternalGumboParser.g:2722:1: ruleSlangInvariant returns [EObject current=null] : (otherlv_0= Invariant ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* ) ;
    public final EObject ruleSlangInvariant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exprs_1_0 = null;

        EObject lv_exprs_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2728:2: ( (otherlv_0= Invariant ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* ) )
            // InternalGumboParser.g:2729:2: (otherlv_0= Invariant ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* )
            {
            // InternalGumboParser.g:2729:2: (otherlv_0= Invariant ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* )
            // InternalGumboParser.g:2730:3: otherlv_0= Invariant ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )*
            {
            otherlv_0=(Token)match(input,Invariant,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangInvariantAccess().getInvariantKeyword_0());
              		
            }
            // InternalGumboParser.g:2734:3: ( (lv_exprs_1_0= ruleExpr ) )
            // InternalGumboParser.g:2735:4: (lv_exprs_1_0= ruleExpr )
            {
            // InternalGumboParser.g:2735:4: (lv_exprs_1_0= ruleExpr )
            // InternalGumboParser.g:2736:5: lv_exprs_1_0= ruleExpr
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

            // InternalGumboParser.g:2753:3: (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==Comma) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalGumboParser.g:2754:4: otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FollowSets000.FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSlangInvariantAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalGumboParser.g:2758:4: ( (lv_exprs_3_0= ruleExpr ) )
            	    // InternalGumboParser.g:2759:5: (lv_exprs_3_0= ruleExpr )
            	    {
            	    // InternalGumboParser.g:2759:5: (lv_exprs_3_0= ruleExpr )
            	    // InternalGumboParser.g:2760:6: lv_exprs_3_0= ruleExpr
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


    // $ANTLR start "entryRuleSlangRequires"
    // InternalGumboParser.g:2782:1: entryRuleSlangRequires returns [EObject current=null] : iv_ruleSlangRequires= ruleSlangRequires EOF ;
    public final EObject entryRuleSlangRequires() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangRequires = null;


        try {
            // InternalGumboParser.g:2782:54: (iv_ruleSlangRequires= ruleSlangRequires EOF )
            // InternalGumboParser.g:2783:2: iv_ruleSlangRequires= ruleSlangRequires EOF
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
    // InternalGumboParser.g:2789:1: ruleSlangRequires returns [EObject current=null] : (otherlv_0= Assume ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* ) ;
    public final EObject ruleSlangRequires() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exprs_1_0 = null;

        EObject lv_exprs_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2795:2: ( (otherlv_0= Assume ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* ) )
            // InternalGumboParser.g:2796:2: (otherlv_0= Assume ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* )
            {
            // InternalGumboParser.g:2796:2: (otherlv_0= Assume ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* )
            // InternalGumboParser.g:2797:3: otherlv_0= Assume ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )*
            {
            otherlv_0=(Token)match(input,Assume,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangRequiresAccess().getAssumeKeyword_0());
              		
            }
            // InternalGumboParser.g:2801:3: ( (lv_exprs_1_0= ruleExpr ) )
            // InternalGumboParser.g:2802:4: (lv_exprs_1_0= ruleExpr )
            {
            // InternalGumboParser.g:2802:4: (lv_exprs_1_0= ruleExpr )
            // InternalGumboParser.g:2803:5: lv_exprs_1_0= ruleExpr
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

            // InternalGumboParser.g:2820:3: (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==Comma) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalGumboParser.g:2821:4: otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FollowSets000.FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSlangRequiresAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalGumboParser.g:2825:4: ( (lv_exprs_3_0= ruleExpr ) )
            	    // InternalGumboParser.g:2826:5: (lv_exprs_3_0= ruleExpr )
            	    {
            	    // InternalGumboParser.g:2826:5: (lv_exprs_3_0= ruleExpr )
            	    // InternalGumboParser.g:2827:6: lv_exprs_3_0= ruleExpr
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
    // $ANTLR end "ruleSlangRequires"


    // $ANTLR start "entryRuleSlangReads"
    // InternalGumboParser.g:2849:1: entryRuleSlangReads returns [EObject current=null] : iv_ruleSlangReads= ruleSlangReads EOF ;
    public final EObject entryRuleSlangReads() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangReads = null;


        try {
            // InternalGumboParser.g:2849:51: (iv_ruleSlangReads= ruleSlangReads EOF )
            // InternalGumboParser.g:2850:2: iv_ruleSlangReads= ruleSlangReads EOF
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
    // InternalGumboParser.g:2856:1: ruleSlangReads returns [EObject current=null] : (otherlv_0= Reads ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* ) ;
    public final EObject ruleSlangReads() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exprs_1_0 = null;

        EObject lv_exprs_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2862:2: ( (otherlv_0= Reads ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* ) )
            // InternalGumboParser.g:2863:2: (otherlv_0= Reads ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* )
            {
            // InternalGumboParser.g:2863:2: (otherlv_0= Reads ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* )
            // InternalGumboParser.g:2864:3: otherlv_0= Reads ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )*
            {
            otherlv_0=(Token)match(input,Reads,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangReadsAccess().getReadsKeyword_0());
              		
            }
            // InternalGumboParser.g:2868:3: ( (lv_exprs_1_0= ruleExpr ) )
            // InternalGumboParser.g:2869:4: (lv_exprs_1_0= ruleExpr )
            {
            // InternalGumboParser.g:2869:4: (lv_exprs_1_0= ruleExpr )
            // InternalGumboParser.g:2870:5: lv_exprs_1_0= ruleExpr
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

            // InternalGumboParser.g:2887:3: (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==Comma) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalGumboParser.g:2888:4: otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FollowSets000.FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSlangReadsAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalGumboParser.g:2892:4: ( (lv_exprs_3_0= ruleExpr ) )
            	    // InternalGumboParser.g:2893:5: (lv_exprs_3_0= ruleExpr )
            	    {
            	    // InternalGumboParser.g:2893:5: (lv_exprs_3_0= ruleExpr )
            	    // InternalGumboParser.g:2894:6: lv_exprs_3_0= ruleExpr
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
    // $ANTLR end "ruleSlangReads"


    // $ANTLR start "entryRuleSlangModifies"
    // InternalGumboParser.g:2916:1: entryRuleSlangModifies returns [EObject current=null] : iv_ruleSlangModifies= ruleSlangModifies EOF ;
    public final EObject entryRuleSlangModifies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangModifies = null;


        try {
            // InternalGumboParser.g:2916:54: (iv_ruleSlangModifies= ruleSlangModifies EOF )
            // InternalGumboParser.g:2917:2: iv_ruleSlangModifies= ruleSlangModifies EOF
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
    // InternalGumboParser.g:2923:1: ruleSlangModifies returns [EObject current=null] : (otherlv_0= Modifies ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* ) ;
    public final EObject ruleSlangModifies() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exprs_1_0 = null;

        EObject lv_exprs_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2929:2: ( (otherlv_0= Modifies ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* ) )
            // InternalGumboParser.g:2930:2: (otherlv_0= Modifies ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* )
            {
            // InternalGumboParser.g:2930:2: (otherlv_0= Modifies ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* )
            // InternalGumboParser.g:2931:3: otherlv_0= Modifies ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )*
            {
            otherlv_0=(Token)match(input,Modifies,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangModifiesAccess().getModifiesKeyword_0());
              		
            }
            // InternalGumboParser.g:2935:3: ( (lv_exprs_1_0= ruleExpr ) )
            // InternalGumboParser.g:2936:4: (lv_exprs_1_0= ruleExpr )
            {
            // InternalGumboParser.g:2936:4: (lv_exprs_1_0= ruleExpr )
            // InternalGumboParser.g:2937:5: lv_exprs_1_0= ruleExpr
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

            // InternalGumboParser.g:2954:3: (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==Comma) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalGumboParser.g:2955:4: otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FollowSets000.FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSlangModifiesAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalGumboParser.g:2959:4: ( (lv_exprs_3_0= ruleExpr ) )
            	    // InternalGumboParser.g:2960:5: (lv_exprs_3_0= ruleExpr )
            	    {
            	    // InternalGumboParser.g:2960:5: (lv_exprs_3_0= ruleExpr )
            	    // InternalGumboParser.g:2961:6: lv_exprs_3_0= ruleExpr
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
    // InternalGumboParser.g:2983:1: entryRuleSlangEnsures returns [EObject current=null] : iv_ruleSlangEnsures= ruleSlangEnsures EOF ;
    public final EObject entryRuleSlangEnsures() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangEnsures = null;


        try {
            // InternalGumboParser.g:2983:53: (iv_ruleSlangEnsures= ruleSlangEnsures EOF )
            // InternalGumboParser.g:2984:2: iv_ruleSlangEnsures= ruleSlangEnsures EOF
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
    // InternalGumboParser.g:2990:1: ruleSlangEnsures returns [EObject current=null] : (otherlv_0= Guarantee ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* ) ;
    public final EObject ruleSlangEnsures() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exprs_1_0 = null;

        EObject lv_exprs_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2996:2: ( (otherlv_0= Guarantee ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* ) )
            // InternalGumboParser.g:2997:2: (otherlv_0= Guarantee ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* )
            {
            // InternalGumboParser.g:2997:2: (otherlv_0= Guarantee ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* )
            // InternalGumboParser.g:2998:3: otherlv_0= Guarantee ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )*
            {
            otherlv_0=(Token)match(input,Guarantee,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangEnsuresAccess().getGuaranteeKeyword_0());
              		
            }
            // InternalGumboParser.g:3002:3: ( (lv_exprs_1_0= ruleExpr ) )
            // InternalGumboParser.g:3003:4: (lv_exprs_1_0= ruleExpr )
            {
            // InternalGumboParser.g:3003:4: (lv_exprs_1_0= ruleExpr )
            // InternalGumboParser.g:3004:5: lv_exprs_1_0= ruleExpr
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

            // InternalGumboParser.g:3021:3: (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==Comma) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalGumboParser.g:3022:4: otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FollowSets000.FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSlangEnsuresAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalGumboParser.g:3026:4: ( (lv_exprs_3_0= ruleExpr ) )
            	    // InternalGumboParser.g:3027:5: (lv_exprs_3_0= ruleExpr )
            	    {
            	    // InternalGumboParser.g:3027:5: (lv_exprs_3_0= ruleExpr )
            	    // InternalGumboParser.g:3028:6: lv_exprs_3_0= ruleExpr
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
    // InternalGumboParser.g:3050:1: entryRuleSlangStmt returns [EObject current=null] : iv_ruleSlangStmt= ruleSlangStmt EOF ;
    public final EObject entryRuleSlangStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangStmt = null;


        try {
            // InternalGumboParser.g:3050:50: (iv_ruleSlangStmt= ruleSlangStmt EOF )
            // InternalGumboParser.g:3051:2: iv_ruleSlangStmt= ruleSlangStmt EOF
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
    // InternalGumboParser.g:3057:1: ruleSlangStmt returns [EObject current=null] : ( ( () ( (lv_d_1_0= ruleSlangVarDef ) ) ) | ( () otherlv_3= If ( (lv_cond_4_0= ruleExpr ) ) ( (lv_b_5_0= ruleSlangBlock ) ) ( (lv_e_6_0= ruleSlangElse ) )? ) | ( () otherlv_8= While ( (lv_cond_9_0= ruleExpr ) ) ( (lv_l_10_0= ruleSlangLoopContract ) ) ( (lv_b_11_0= ruleSlangBlock ) ) ) | ( () otherlv_13= Match ( (lv_testExpr_14_0= ruleExpr ) ) otherlv_15= LeftCurlyBracket ( (lv_c_16_0= ruleSlangCase ) )* otherlv_17= RightCurlyBracket ) | ( () otherlv_19= Spec ( (lv_b_20_0= ruleSlangBlock ) ) ) | ( () otherlv_22= Assume ( (lv_e_23_0= ruleExpr ) ) (this_SLANG_STRING_24= RULE_SLANG_STRING )? ) | ( () otherlv_26= Assert ( (lv_e_27_0= ruleExpr ) ) (this_SLANG_STRING_28= RULE_SLANG_STRING )? ) | ( () otherlv_30= Halt (this_SLANG_STRING_31= RULE_SLANG_STRING )? ) | ( () otherlv_33= Do ( (lv_e_34_0= ruleExpr ) ) ) | ( () ( (otherlv_36= RULE_ID ) ) (otherlv_37= Colon | ( ( (lv_l_38_0= ruleSlangLHSSuffix ) )* ( (otherlv_39= ColonEqualsSign | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleExpr ) ) )? ) ) ) ) ;
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
            // InternalGumboParser.g:3063:2: ( ( ( () ( (lv_d_1_0= ruleSlangVarDef ) ) ) | ( () otherlv_3= If ( (lv_cond_4_0= ruleExpr ) ) ( (lv_b_5_0= ruleSlangBlock ) ) ( (lv_e_6_0= ruleSlangElse ) )? ) | ( () otherlv_8= While ( (lv_cond_9_0= ruleExpr ) ) ( (lv_l_10_0= ruleSlangLoopContract ) ) ( (lv_b_11_0= ruleSlangBlock ) ) ) | ( () otherlv_13= Match ( (lv_testExpr_14_0= ruleExpr ) ) otherlv_15= LeftCurlyBracket ( (lv_c_16_0= ruleSlangCase ) )* otherlv_17= RightCurlyBracket ) | ( () otherlv_19= Spec ( (lv_b_20_0= ruleSlangBlock ) ) ) | ( () otherlv_22= Assume ( (lv_e_23_0= ruleExpr ) ) (this_SLANG_STRING_24= RULE_SLANG_STRING )? ) | ( () otherlv_26= Assert ( (lv_e_27_0= ruleExpr ) ) (this_SLANG_STRING_28= RULE_SLANG_STRING )? ) | ( () otherlv_30= Halt (this_SLANG_STRING_31= RULE_SLANG_STRING )? ) | ( () otherlv_33= Do ( (lv_e_34_0= ruleExpr ) ) ) | ( () ( (otherlv_36= RULE_ID ) ) (otherlv_37= Colon | ( ( (lv_l_38_0= ruleSlangLHSSuffix ) )* ( (otherlv_39= ColonEqualsSign | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleExpr ) ) )? ) ) ) ) )
            // InternalGumboParser.g:3064:2: ( ( () ( (lv_d_1_0= ruleSlangVarDef ) ) ) | ( () otherlv_3= If ( (lv_cond_4_0= ruleExpr ) ) ( (lv_b_5_0= ruleSlangBlock ) ) ( (lv_e_6_0= ruleSlangElse ) )? ) | ( () otherlv_8= While ( (lv_cond_9_0= ruleExpr ) ) ( (lv_l_10_0= ruleSlangLoopContract ) ) ( (lv_b_11_0= ruleSlangBlock ) ) ) | ( () otherlv_13= Match ( (lv_testExpr_14_0= ruleExpr ) ) otherlv_15= LeftCurlyBracket ( (lv_c_16_0= ruleSlangCase ) )* otherlv_17= RightCurlyBracket ) | ( () otherlv_19= Spec ( (lv_b_20_0= ruleSlangBlock ) ) ) | ( () otherlv_22= Assume ( (lv_e_23_0= ruleExpr ) ) (this_SLANG_STRING_24= RULE_SLANG_STRING )? ) | ( () otherlv_26= Assert ( (lv_e_27_0= ruleExpr ) ) (this_SLANG_STRING_28= RULE_SLANG_STRING )? ) | ( () otherlv_30= Halt (this_SLANG_STRING_31= RULE_SLANG_STRING )? ) | ( () otherlv_33= Do ( (lv_e_34_0= ruleExpr ) ) ) | ( () ( (otherlv_36= RULE_ID ) ) (otherlv_37= Colon | ( ( (lv_l_38_0= ruleSlangLHSSuffix ) )* ( (otherlv_39= ColonEqualsSign | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleExpr ) ) )? ) ) ) )
            {
            // InternalGumboParser.g:3064:2: ( ( () ( (lv_d_1_0= ruleSlangVarDef ) ) ) | ( () otherlv_3= If ( (lv_cond_4_0= ruleExpr ) ) ( (lv_b_5_0= ruleSlangBlock ) ) ( (lv_e_6_0= ruleSlangElse ) )? ) | ( () otherlv_8= While ( (lv_cond_9_0= ruleExpr ) ) ( (lv_l_10_0= ruleSlangLoopContract ) ) ( (lv_b_11_0= ruleSlangBlock ) ) ) | ( () otherlv_13= Match ( (lv_testExpr_14_0= ruleExpr ) ) otherlv_15= LeftCurlyBracket ( (lv_c_16_0= ruleSlangCase ) )* otherlv_17= RightCurlyBracket ) | ( () otherlv_19= Spec ( (lv_b_20_0= ruleSlangBlock ) ) ) | ( () otherlv_22= Assume ( (lv_e_23_0= ruleExpr ) ) (this_SLANG_STRING_24= RULE_SLANG_STRING )? ) | ( () otherlv_26= Assert ( (lv_e_27_0= ruleExpr ) ) (this_SLANG_STRING_28= RULE_SLANG_STRING )? ) | ( () otherlv_30= Halt (this_SLANG_STRING_31= RULE_SLANG_STRING )? ) | ( () otherlv_33= Do ( (lv_e_34_0= ruleExpr ) ) ) | ( () ( (otherlv_36= RULE_ID ) ) (otherlv_37= Colon | ( ( (lv_l_38_0= ruleSlangLHSSuffix ) )* ( (otherlv_39= ColonEqualsSign | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleExpr ) ) )? ) ) ) )
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
                    // InternalGumboParser.g:3065:3: ( () ( (lv_d_1_0= ruleSlangVarDef ) ) )
                    {
                    // InternalGumboParser.g:3065:3: ( () ( (lv_d_1_0= ruleSlangVarDef ) ) )
                    // InternalGumboParser.g:3066:4: () ( (lv_d_1_0= ruleSlangVarDef ) )
                    {
                    // InternalGumboParser.g:3066:4: ()
                    // InternalGumboParser.g:3067:5: 
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

                    // InternalGumboParser.g:3076:4: ( (lv_d_1_0= ruleSlangVarDef ) )
                    // InternalGumboParser.g:3077:5: (lv_d_1_0= ruleSlangVarDef )
                    {
                    // InternalGumboParser.g:3077:5: (lv_d_1_0= ruleSlangVarDef )
                    // InternalGumboParser.g:3078:6: lv_d_1_0= ruleSlangVarDef
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
                    // InternalGumboParser.g:3097:3: ( () otherlv_3= If ( (lv_cond_4_0= ruleExpr ) ) ( (lv_b_5_0= ruleSlangBlock ) ) ( (lv_e_6_0= ruleSlangElse ) )? )
                    {
                    // InternalGumboParser.g:3097:3: ( () otherlv_3= If ( (lv_cond_4_0= ruleExpr ) ) ( (lv_b_5_0= ruleSlangBlock ) ) ( (lv_e_6_0= ruleSlangElse ) )? )
                    // InternalGumboParser.g:3098:4: () otherlv_3= If ( (lv_cond_4_0= ruleExpr ) ) ( (lv_b_5_0= ruleSlangBlock ) ) ( (lv_e_6_0= ruleSlangElse ) )?
                    {
                    // InternalGumboParser.g:3098:4: ()
                    // InternalGumboParser.g:3099:5: 
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
                    // InternalGumboParser.g:3112:4: ( (lv_cond_4_0= ruleExpr ) )
                    // InternalGumboParser.g:3113:5: (lv_cond_4_0= ruleExpr )
                    {
                    // InternalGumboParser.g:3113:5: (lv_cond_4_0= ruleExpr )
                    // InternalGumboParser.g:3114:6: lv_cond_4_0= ruleExpr
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

                    // InternalGumboParser.g:3131:4: ( (lv_b_5_0= ruleSlangBlock ) )
                    // InternalGumboParser.g:3132:5: (lv_b_5_0= ruleSlangBlock )
                    {
                    // InternalGumboParser.g:3132:5: (lv_b_5_0= ruleSlangBlock )
                    // InternalGumboParser.g:3133:6: lv_b_5_0= ruleSlangBlock
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

                    // InternalGumboParser.g:3150:4: ( (lv_e_6_0= ruleSlangElse ) )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==Else) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // InternalGumboParser.g:3151:5: (lv_e_6_0= ruleSlangElse )
                            {
                            // InternalGumboParser.g:3151:5: (lv_e_6_0= ruleSlangElse )
                            // InternalGumboParser.g:3152:6: lv_e_6_0= ruleSlangElse
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
                    // InternalGumboParser.g:3171:3: ( () otherlv_8= While ( (lv_cond_9_0= ruleExpr ) ) ( (lv_l_10_0= ruleSlangLoopContract ) ) ( (lv_b_11_0= ruleSlangBlock ) ) )
                    {
                    // InternalGumboParser.g:3171:3: ( () otherlv_8= While ( (lv_cond_9_0= ruleExpr ) ) ( (lv_l_10_0= ruleSlangLoopContract ) ) ( (lv_b_11_0= ruleSlangBlock ) ) )
                    // InternalGumboParser.g:3172:4: () otherlv_8= While ( (lv_cond_9_0= ruleExpr ) ) ( (lv_l_10_0= ruleSlangLoopContract ) ) ( (lv_b_11_0= ruleSlangBlock ) )
                    {
                    // InternalGumboParser.g:3172:4: ()
                    // InternalGumboParser.g:3173:5: 
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
                    // InternalGumboParser.g:3186:4: ( (lv_cond_9_0= ruleExpr ) )
                    // InternalGumboParser.g:3187:5: (lv_cond_9_0= ruleExpr )
                    {
                    // InternalGumboParser.g:3187:5: (lv_cond_9_0= ruleExpr )
                    // InternalGumboParser.g:3188:6: lv_cond_9_0= ruleExpr
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

                    // InternalGumboParser.g:3205:4: ( (lv_l_10_0= ruleSlangLoopContract ) )
                    // InternalGumboParser.g:3206:5: (lv_l_10_0= ruleSlangLoopContract )
                    {
                    // InternalGumboParser.g:3206:5: (lv_l_10_0= ruleSlangLoopContract )
                    // InternalGumboParser.g:3207:6: lv_l_10_0= ruleSlangLoopContract
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

                    // InternalGumboParser.g:3224:4: ( (lv_b_11_0= ruleSlangBlock ) )
                    // InternalGumboParser.g:3225:5: (lv_b_11_0= ruleSlangBlock )
                    {
                    // InternalGumboParser.g:3225:5: (lv_b_11_0= ruleSlangBlock )
                    // InternalGumboParser.g:3226:6: lv_b_11_0= ruleSlangBlock
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
                    // InternalGumboParser.g:3245:3: ( () otherlv_13= Match ( (lv_testExpr_14_0= ruleExpr ) ) otherlv_15= LeftCurlyBracket ( (lv_c_16_0= ruleSlangCase ) )* otherlv_17= RightCurlyBracket )
                    {
                    // InternalGumboParser.g:3245:3: ( () otherlv_13= Match ( (lv_testExpr_14_0= ruleExpr ) ) otherlv_15= LeftCurlyBracket ( (lv_c_16_0= ruleSlangCase ) )* otherlv_17= RightCurlyBracket )
                    // InternalGumboParser.g:3246:4: () otherlv_13= Match ( (lv_testExpr_14_0= ruleExpr ) ) otherlv_15= LeftCurlyBracket ( (lv_c_16_0= ruleSlangCase ) )* otherlv_17= RightCurlyBracket
                    {
                    // InternalGumboParser.g:3246:4: ()
                    // InternalGumboParser.g:3247:5: 
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
                    // InternalGumboParser.g:3260:4: ( (lv_testExpr_14_0= ruleExpr ) )
                    // InternalGumboParser.g:3261:5: (lv_testExpr_14_0= ruleExpr )
                    {
                    // InternalGumboParser.g:3261:5: (lv_testExpr_14_0= ruleExpr )
                    // InternalGumboParser.g:3262:6: lv_testExpr_14_0= ruleExpr
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
                    // InternalGumboParser.g:3283:4: ( (lv_c_16_0= ruleSlangCase ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==Case) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // InternalGumboParser.g:3284:5: (lv_c_16_0= ruleSlangCase )
                    	    {
                    	    // InternalGumboParser.g:3284:5: (lv_c_16_0= ruleSlangCase )
                    	    // InternalGumboParser.g:3285:6: lv_c_16_0= ruleSlangCase
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
                    // InternalGumboParser.g:3308:3: ( () otherlv_19= Spec ( (lv_b_20_0= ruleSlangBlock ) ) )
                    {
                    // InternalGumboParser.g:3308:3: ( () otherlv_19= Spec ( (lv_b_20_0= ruleSlangBlock ) ) )
                    // InternalGumboParser.g:3309:4: () otherlv_19= Spec ( (lv_b_20_0= ruleSlangBlock ) )
                    {
                    // InternalGumboParser.g:3309:4: ()
                    // InternalGumboParser.g:3310:5: 
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
                    // InternalGumboParser.g:3323:4: ( (lv_b_20_0= ruleSlangBlock ) )
                    // InternalGumboParser.g:3324:5: (lv_b_20_0= ruleSlangBlock )
                    {
                    // InternalGumboParser.g:3324:5: (lv_b_20_0= ruleSlangBlock )
                    // InternalGumboParser.g:3325:6: lv_b_20_0= ruleSlangBlock
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
                    // InternalGumboParser.g:3344:3: ( () otherlv_22= Assume ( (lv_e_23_0= ruleExpr ) ) (this_SLANG_STRING_24= RULE_SLANG_STRING )? )
                    {
                    // InternalGumboParser.g:3344:3: ( () otherlv_22= Assume ( (lv_e_23_0= ruleExpr ) ) (this_SLANG_STRING_24= RULE_SLANG_STRING )? )
                    // InternalGumboParser.g:3345:4: () otherlv_22= Assume ( (lv_e_23_0= ruleExpr ) ) (this_SLANG_STRING_24= RULE_SLANG_STRING )?
                    {
                    // InternalGumboParser.g:3345:4: ()
                    // InternalGumboParser.g:3346:5: 
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
                    // InternalGumboParser.g:3359:4: ( (lv_e_23_0= ruleExpr ) )
                    // InternalGumboParser.g:3360:5: (lv_e_23_0= ruleExpr )
                    {
                    // InternalGumboParser.g:3360:5: (lv_e_23_0= ruleExpr )
                    // InternalGumboParser.g:3361:6: lv_e_23_0= ruleExpr
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

                    // InternalGumboParser.g:3378:4: (this_SLANG_STRING_24= RULE_SLANG_STRING )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==RULE_SLANG_STRING) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // InternalGumboParser.g:3379:5: this_SLANG_STRING_24= RULE_SLANG_STRING
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
                    // InternalGumboParser.g:3386:3: ( () otherlv_26= Assert ( (lv_e_27_0= ruleExpr ) ) (this_SLANG_STRING_28= RULE_SLANG_STRING )? )
                    {
                    // InternalGumboParser.g:3386:3: ( () otherlv_26= Assert ( (lv_e_27_0= ruleExpr ) ) (this_SLANG_STRING_28= RULE_SLANG_STRING )? )
                    // InternalGumboParser.g:3387:4: () otherlv_26= Assert ( (lv_e_27_0= ruleExpr ) ) (this_SLANG_STRING_28= RULE_SLANG_STRING )?
                    {
                    // InternalGumboParser.g:3387:4: ()
                    // InternalGumboParser.g:3388:5: 
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
                    // InternalGumboParser.g:3401:4: ( (lv_e_27_0= ruleExpr ) )
                    // InternalGumboParser.g:3402:5: (lv_e_27_0= ruleExpr )
                    {
                    // InternalGumboParser.g:3402:5: (lv_e_27_0= ruleExpr )
                    // InternalGumboParser.g:3403:6: lv_e_27_0= ruleExpr
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

                    // InternalGumboParser.g:3420:4: (this_SLANG_STRING_28= RULE_SLANG_STRING )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==RULE_SLANG_STRING) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // InternalGumboParser.g:3421:5: this_SLANG_STRING_28= RULE_SLANG_STRING
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
                    // InternalGumboParser.g:3428:3: ( () otherlv_30= Halt (this_SLANG_STRING_31= RULE_SLANG_STRING )? )
                    {
                    // InternalGumboParser.g:3428:3: ( () otherlv_30= Halt (this_SLANG_STRING_31= RULE_SLANG_STRING )? )
                    // InternalGumboParser.g:3429:4: () otherlv_30= Halt (this_SLANG_STRING_31= RULE_SLANG_STRING )?
                    {
                    // InternalGumboParser.g:3429:4: ()
                    // InternalGumboParser.g:3430:5: 
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
                    // InternalGumboParser.g:3443:4: (this_SLANG_STRING_31= RULE_SLANG_STRING )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==RULE_SLANG_STRING) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // InternalGumboParser.g:3444:5: this_SLANG_STRING_31= RULE_SLANG_STRING
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
                    // InternalGumboParser.g:3451:3: ( () otherlv_33= Do ( (lv_e_34_0= ruleExpr ) ) )
                    {
                    // InternalGumboParser.g:3451:3: ( () otherlv_33= Do ( (lv_e_34_0= ruleExpr ) ) )
                    // InternalGumboParser.g:3452:4: () otherlv_33= Do ( (lv_e_34_0= ruleExpr ) )
                    {
                    // InternalGumboParser.g:3452:4: ()
                    // InternalGumboParser.g:3453:5: 
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
                    // InternalGumboParser.g:3466:4: ( (lv_e_34_0= ruleExpr ) )
                    // InternalGumboParser.g:3467:5: (lv_e_34_0= ruleExpr )
                    {
                    // InternalGumboParser.g:3467:5: (lv_e_34_0= ruleExpr )
                    // InternalGumboParser.g:3468:6: lv_e_34_0= ruleExpr
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
                    // InternalGumboParser.g:3487:3: ( () ( (otherlv_36= RULE_ID ) ) (otherlv_37= Colon | ( ( (lv_l_38_0= ruleSlangLHSSuffix ) )* ( (otherlv_39= ColonEqualsSign | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleExpr ) ) )? ) ) )
                    {
                    // InternalGumboParser.g:3487:3: ( () ( (otherlv_36= RULE_ID ) ) (otherlv_37= Colon | ( ( (lv_l_38_0= ruleSlangLHSSuffix ) )* ( (otherlv_39= ColonEqualsSign | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleExpr ) ) )? ) ) )
                    // InternalGumboParser.g:3488:4: () ( (otherlv_36= RULE_ID ) ) (otherlv_37= Colon | ( ( (lv_l_38_0= ruleSlangLHSSuffix ) )* ( (otherlv_39= ColonEqualsSign | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleExpr ) ) )? ) )
                    {
                    // InternalGumboParser.g:3488:4: ()
                    // InternalGumboParser.g:3489:5: 
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

                    // InternalGumboParser.g:3498:4: ( (otherlv_36= RULE_ID ) )
                    // InternalGumboParser.g:3499:5: (otherlv_36= RULE_ID )
                    {
                    // InternalGumboParser.g:3499:5: (otherlv_36= RULE_ID )
                    // InternalGumboParser.g:3500:6: otherlv_36= RULE_ID
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

                    // InternalGumboParser.g:3514:4: (otherlv_37= Colon | ( ( (lv_l_38_0= ruleSlangLHSSuffix ) )* ( (otherlv_39= ColonEqualsSign | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleExpr ) ) )? ) )
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
                            // InternalGumboParser.g:3515:5: otherlv_37= Colon
                            {
                            otherlv_37=(Token)match(input,Colon,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_37, grammarAccess.getSlangStmtAccess().getColonKeyword_9_2_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalGumboParser.g:3520:5: ( ( (lv_l_38_0= ruleSlangLHSSuffix ) )* ( (otherlv_39= ColonEqualsSign | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleExpr ) ) )? )
                            {
                            // InternalGumboParser.g:3520:5: ( ( (lv_l_38_0= ruleSlangLHSSuffix ) )* ( (otherlv_39= ColonEqualsSign | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleExpr ) ) )? )
                            // InternalGumboParser.g:3521:6: ( (lv_l_38_0= ruleSlangLHSSuffix ) )* ( (otherlv_39= ColonEqualsSign | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleExpr ) ) )?
                            {
                            // InternalGumboParser.g:3521:6: ( (lv_l_38_0= ruleSlangLHSSuffix ) )*
                            loop66:
                            do {
                                int alt66=2;
                                int LA66_0 = input.LA(1);

                                if ( (LA66_0==LeftParenthesis||LA66_0==FullStop) ) {
                                    alt66=1;
                                }


                                switch (alt66) {
                            	case 1 :
                            	    // InternalGumboParser.g:3522:7: (lv_l_38_0= ruleSlangLHSSuffix )
                            	    {
                            	    // InternalGumboParser.g:3522:7: (lv_l_38_0= ruleSlangLHSSuffix )
                            	    // InternalGumboParser.g:3523:8: lv_l_38_0= ruleSlangLHSSuffix
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

                            // InternalGumboParser.g:3540:6: ( (otherlv_39= ColonEqualsSign | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleExpr ) ) )?
                            int alt68=2;
                            int LA68_0 = input.LA(1);

                            if ( (LA68_0==ColonEqualsSign||LA68_0==RULE_DEFOP) ) {
                                alt68=1;
                            }
                            switch (alt68) {
                                case 1 :
                                    // InternalGumboParser.g:3541:7: (otherlv_39= ColonEqualsSign | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleExpr ) )
                                    {
                                    // InternalGumboParser.g:3541:7: (otherlv_39= ColonEqualsSign | this_DEFOP_40= RULE_DEFOP )
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
                                            // InternalGumboParser.g:3542:8: otherlv_39= ColonEqualsSign
                                            {
                                            otherlv_39=(Token)match(input,ColonEqualsSign,FollowSets000.FOLLOW_15); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                              								newLeafNode(otherlv_39, grammarAccess.getSlangStmtAccess().getColonEqualsSignKeyword_9_2_1_1_0_0());
                                              							
                                            }

                                            }
                                            break;
                                        case 2 :
                                            // InternalGumboParser.g:3547:8: this_DEFOP_40= RULE_DEFOP
                                            {
                                            this_DEFOP_40=(Token)match(input,RULE_DEFOP,FollowSets000.FOLLOW_15); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                              								newLeafNode(this_DEFOP_40, grammarAccess.getSlangStmtAccess().getDEFOPTerminalRuleCall_9_2_1_1_0_1());
                                              							
                                            }

                                            }
                                            break;

                                    }

                                    // InternalGumboParser.g:3552:7: ( (lv_e_41_0= ruleExpr ) )
                                    // InternalGumboParser.g:3553:8: (lv_e_41_0= ruleExpr )
                                    {
                                    // InternalGumboParser.g:3553:8: (lv_e_41_0= ruleExpr )
                                    // InternalGumboParser.g:3554:9: lv_e_41_0= ruleExpr
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
    // InternalGumboParser.g:3579:1: entryRuleSlangElse returns [EObject current=null] : iv_ruleSlangElse= ruleSlangElse EOF ;
    public final EObject entryRuleSlangElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangElse = null;


        try {
            // InternalGumboParser.g:3579:50: (iv_ruleSlangElse= ruleSlangElse EOF )
            // InternalGumboParser.g:3580:2: iv_ruleSlangElse= ruleSlangElse EOF
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
    // InternalGumboParser.g:3586:1: ruleSlangElse returns [EObject current=null] : (otherlv_0= Else ( (otherlv_1= If ( (lv_cond_2_0= ruleExpr ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )? ) | this_SlangBlock_5= ruleSlangBlock ) ) ;
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
            // InternalGumboParser.g:3592:2: ( (otherlv_0= Else ( (otherlv_1= If ( (lv_cond_2_0= ruleExpr ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )? ) | this_SlangBlock_5= ruleSlangBlock ) ) )
            // InternalGumboParser.g:3593:2: (otherlv_0= Else ( (otherlv_1= If ( (lv_cond_2_0= ruleExpr ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )? ) | this_SlangBlock_5= ruleSlangBlock ) )
            {
            // InternalGumboParser.g:3593:2: (otherlv_0= Else ( (otherlv_1= If ( (lv_cond_2_0= ruleExpr ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )? ) | this_SlangBlock_5= ruleSlangBlock ) )
            // InternalGumboParser.g:3594:3: otherlv_0= Else ( (otherlv_1= If ( (lv_cond_2_0= ruleExpr ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )? ) | this_SlangBlock_5= ruleSlangBlock )
            {
            otherlv_0=(Token)match(input,Else,FollowSets000.FOLLOW_63); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangElseAccess().getElseKeyword_0());
              		
            }
            // InternalGumboParser.g:3598:3: ( (otherlv_1= If ( (lv_cond_2_0= ruleExpr ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )? ) | this_SlangBlock_5= ruleSlangBlock )
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
                    // InternalGumboParser.g:3599:4: (otherlv_1= If ( (lv_cond_2_0= ruleExpr ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )? )
                    {
                    // InternalGumboParser.g:3599:4: (otherlv_1= If ( (lv_cond_2_0= ruleExpr ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )? )
                    // InternalGumboParser.g:3600:5: otherlv_1= If ( (lv_cond_2_0= ruleExpr ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )?
                    {
                    otherlv_1=(Token)match(input,If,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getSlangElseAccess().getIfKeyword_1_0_0());
                      				
                    }
                    // InternalGumboParser.g:3604:5: ( (lv_cond_2_0= ruleExpr ) )
                    // InternalGumboParser.g:3605:6: (lv_cond_2_0= ruleExpr )
                    {
                    // InternalGumboParser.g:3605:6: (lv_cond_2_0= ruleExpr )
                    // InternalGumboParser.g:3606:7: lv_cond_2_0= ruleExpr
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

                    // InternalGumboParser.g:3623:5: ( (lv_b_3_0= ruleSlangBlock ) )
                    // InternalGumboParser.g:3624:6: (lv_b_3_0= ruleSlangBlock )
                    {
                    // InternalGumboParser.g:3624:6: (lv_b_3_0= ruleSlangBlock )
                    // InternalGumboParser.g:3625:7: lv_b_3_0= ruleSlangBlock
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

                    // InternalGumboParser.g:3642:5: ( (lv_e_4_0= ruleSlangElse ) )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==Else) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // InternalGumboParser.g:3643:6: (lv_e_4_0= ruleSlangElse )
                            {
                            // InternalGumboParser.g:3643:6: (lv_e_4_0= ruleSlangElse )
                            // InternalGumboParser.g:3644:7: lv_e_4_0= ruleSlangElse
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
                    // InternalGumboParser.g:3663:4: this_SlangBlock_5= ruleSlangBlock
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
    // InternalGumboParser.g:3679:1: entryRuleSlangLoopContract returns [EObject current=null] : iv_ruleSlangLoopContract= ruleSlangLoopContract EOF ;
    public final EObject entryRuleSlangLoopContract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangLoopContract = null;


        try {
            // InternalGumboParser.g:3679:58: (iv_ruleSlangLoopContract= ruleSlangLoopContract EOF )
            // InternalGumboParser.g:3680:2: iv_ruleSlangLoopContract= ruleSlangLoopContract EOF
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
    // InternalGumboParser.g:3686:1: ruleSlangLoopContract returns [EObject current=null] : ( () ( (lv_inv_1_0= ruleSlangInvariant ) )? ( (lv_mod_2_0= ruleSlangModifies ) )? ) ;
    public final EObject ruleSlangLoopContract() throws RecognitionException {
        EObject current = null;

        EObject lv_inv_1_0 = null;

        EObject lv_mod_2_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:3692:2: ( ( () ( (lv_inv_1_0= ruleSlangInvariant ) )? ( (lv_mod_2_0= ruleSlangModifies ) )? ) )
            // InternalGumboParser.g:3693:2: ( () ( (lv_inv_1_0= ruleSlangInvariant ) )? ( (lv_mod_2_0= ruleSlangModifies ) )? )
            {
            // InternalGumboParser.g:3693:2: ( () ( (lv_inv_1_0= ruleSlangInvariant ) )? ( (lv_mod_2_0= ruleSlangModifies ) )? )
            // InternalGumboParser.g:3694:3: () ( (lv_inv_1_0= ruleSlangInvariant ) )? ( (lv_mod_2_0= ruleSlangModifies ) )?
            {
            // InternalGumboParser.g:3694:3: ()
            // InternalGumboParser.g:3695:4: 
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

            // InternalGumboParser.g:3704:3: ( (lv_inv_1_0= ruleSlangInvariant ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==Invariant) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalGumboParser.g:3705:4: (lv_inv_1_0= ruleSlangInvariant )
                    {
                    // InternalGumboParser.g:3705:4: (lv_inv_1_0= ruleSlangInvariant )
                    // InternalGumboParser.g:3706:5: lv_inv_1_0= ruleSlangInvariant
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangLoopContractAccess().getInvSlangInvariantParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_64);
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

            // InternalGumboParser.g:3723:3: ( (lv_mod_2_0= ruleSlangModifies ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==Modifies) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalGumboParser.g:3724:4: (lv_mod_2_0= ruleSlangModifies )
                    {
                    // InternalGumboParser.g:3724:4: (lv_mod_2_0= ruleSlangModifies )
                    // InternalGumboParser.g:3725:5: lv_mod_2_0= ruleSlangModifies
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
    // InternalGumboParser.g:3746:1: entryRuleSlangLHSSuffix returns [EObject current=null] : iv_ruleSlangLHSSuffix= ruleSlangLHSSuffix EOF ;
    public final EObject entryRuleSlangLHSSuffix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangLHSSuffix = null;


        try {
            // InternalGumboParser.g:3746:55: (iv_ruleSlangLHSSuffix= ruleSlangLHSSuffix EOF )
            // InternalGumboParser.g:3747:2: iv_ruleSlangLHSSuffix= ruleSlangLHSSuffix EOF
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
    // InternalGumboParser.g:3753:1: ruleSlangLHSSuffix returns [EObject current=null] : ( ( () otherlv_1= FullStop this_ID_2= RULE_ID ) | ( () otherlv_4= LeftParenthesis ( ( (lv_exprs_5_0= ruleExpr ) ) (otherlv_6= Comma ( (lv_exprs_7_0= ruleExpr ) ) )* )? otherlv_8= RightParenthesis ) ) ;
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
            // InternalGumboParser.g:3759:2: ( ( ( () otherlv_1= FullStop this_ID_2= RULE_ID ) | ( () otherlv_4= LeftParenthesis ( ( (lv_exprs_5_0= ruleExpr ) ) (otherlv_6= Comma ( (lv_exprs_7_0= ruleExpr ) ) )* )? otherlv_8= RightParenthesis ) ) )
            // InternalGumboParser.g:3760:2: ( ( () otherlv_1= FullStop this_ID_2= RULE_ID ) | ( () otherlv_4= LeftParenthesis ( ( (lv_exprs_5_0= ruleExpr ) ) (otherlv_6= Comma ( (lv_exprs_7_0= ruleExpr ) ) )* )? otherlv_8= RightParenthesis ) )
            {
            // InternalGumboParser.g:3760:2: ( ( () otherlv_1= FullStop this_ID_2= RULE_ID ) | ( () otherlv_4= LeftParenthesis ( ( (lv_exprs_5_0= ruleExpr ) ) (otherlv_6= Comma ( (lv_exprs_7_0= ruleExpr ) ) )* )? otherlv_8= RightParenthesis ) )
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
                    // InternalGumboParser.g:3761:3: ( () otherlv_1= FullStop this_ID_2= RULE_ID )
                    {
                    // InternalGumboParser.g:3761:3: ( () otherlv_1= FullStop this_ID_2= RULE_ID )
                    // InternalGumboParser.g:3762:4: () otherlv_1= FullStop this_ID_2= RULE_ID
                    {
                    // InternalGumboParser.g:3762:4: ()
                    // InternalGumboParser.g:3763:5: 
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
                    // InternalGumboParser.g:3782:3: ( () otherlv_4= LeftParenthesis ( ( (lv_exprs_5_0= ruleExpr ) ) (otherlv_6= Comma ( (lv_exprs_7_0= ruleExpr ) ) )* )? otherlv_8= RightParenthesis )
                    {
                    // InternalGumboParser.g:3782:3: ( () otherlv_4= LeftParenthesis ( ( (lv_exprs_5_0= ruleExpr ) ) (otherlv_6= Comma ( (lv_exprs_7_0= ruleExpr ) ) )* )? otherlv_8= RightParenthesis )
                    // InternalGumboParser.g:3783:4: () otherlv_4= LeftParenthesis ( ( (lv_exprs_5_0= ruleExpr ) ) (otherlv_6= Comma ( (lv_exprs_7_0= ruleExpr ) ) )* )? otherlv_8= RightParenthesis
                    {
                    // InternalGumboParser.g:3783:4: ()
                    // InternalGumboParser.g:3784:5: 
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

                    otherlv_4=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_65); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getSlangLHSSuffixAccess().getLeftParenthesisKeyword_1_1());
                      			
                    }
                    // InternalGumboParser.g:3797:4: ( ( (lv_exprs_5_0= ruleExpr ) ) (otherlv_6= Comma ( (lv_exprs_7_0= ruleExpr ) ) )* )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( ((LA76_0>=HasEvent && LA76_0<=MustSend)||LA76_0==MaySend||LA76_0==NoSend||LA76_0==Some||LA76_0==False||LA76_0==All||LA76_0==True||(LA76_0>=F32 && LA76_0<=F64)||LA76_0==For||LA76_0==Res||(LA76_0>=If && LA76_0<=In_1)||LA76_0==LeftParenthesis||(LA76_0>=Asterisk && LA76_0<=PlusSign)||LA76_0==HyphenMinus||(LA76_0>=F && LA76_0<=T)||LA76_0==LeftCurlyBracket||(LA76_0>=ForAll && LA76_0<=ThereExists)||(LA76_0>=RULE_SLANG_STRING && LA76_0<=RULE_MSTRING)||(LA76_0>=RULE_MSP && LA76_0<=RULE_MSPB)||(LA76_0>=RULE_IMPLIES && LA76_0<=RULE_OP)||(LA76_0>=RULE_HEX && LA76_0<=RULE_INTEGER_LIT)||(LA76_0>=RULE_REAL_LIT && LA76_0<=RULE_F64_LIT)||LA76_0==RULE_ID) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // InternalGumboParser.g:3798:5: ( (lv_exprs_5_0= ruleExpr ) ) (otherlv_6= Comma ( (lv_exprs_7_0= ruleExpr ) ) )*
                            {
                            // InternalGumboParser.g:3798:5: ( (lv_exprs_5_0= ruleExpr ) )
                            // InternalGumboParser.g:3799:6: (lv_exprs_5_0= ruleExpr )
                            {
                            // InternalGumboParser.g:3799:6: (lv_exprs_5_0= ruleExpr )
                            // InternalGumboParser.g:3800:7: lv_exprs_5_0= ruleExpr
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSlangLHSSuffixAccess().getExprsExprParserRuleCall_1_2_0_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_29);
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

                            // InternalGumboParser.g:3817:5: (otherlv_6= Comma ( (lv_exprs_7_0= ruleExpr ) ) )*
                            loop75:
                            do {
                                int alt75=2;
                                int LA75_0 = input.LA(1);

                                if ( (LA75_0==Comma) ) {
                                    alt75=1;
                                }


                                switch (alt75) {
                            	case 1 :
                            	    // InternalGumboParser.g:3818:6: otherlv_6= Comma ( (lv_exprs_7_0= ruleExpr ) )
                            	    {
                            	    otherlv_6=(Token)match(input,Comma,FollowSets000.FOLLOW_15); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_6, grammarAccess.getSlangLHSSuffixAccess().getCommaKeyword_1_2_1_0());
                            	      					
                            	    }
                            	    // InternalGumboParser.g:3822:6: ( (lv_exprs_7_0= ruleExpr ) )
                            	    // InternalGumboParser.g:3823:7: (lv_exprs_7_0= ruleExpr )
                            	    {
                            	    // InternalGumboParser.g:3823:7: (lv_exprs_7_0= ruleExpr )
                            	    // InternalGumboParser.g:3824:8: lv_exprs_7_0= ruleExpr
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getSlangLHSSuffixAccess().getExprsExprParserRuleCall_1_2_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_29);
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
    // InternalGumboParser.g:3852:1: entryRuleSlangCase returns [EObject current=null] : iv_ruleSlangCase= ruleSlangCase EOF ;
    public final EObject entryRuleSlangCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangCase = null;


        try {
            // InternalGumboParser.g:3852:50: (iv_ruleSlangCase= ruleSlangCase EOF )
            // InternalGumboParser.g:3853:2: iv_ruleSlangCase= ruleSlangCase EOF
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
    // InternalGumboParser.g:3859:1: ruleSlangCase returns [EObject current=null] : (otherlv_0= Case ( (lv_pattern_1_0= ruleSlangPattern ) ) (otherlv_2= If ( (lv_e_3_0= ruleExpr ) ) )? otherlv_4= EqualsSignGreaterThanSign ( (lv_s_5_0= ruleSlangStmt ) )* ) ;
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
            // InternalGumboParser.g:3865:2: ( (otherlv_0= Case ( (lv_pattern_1_0= ruleSlangPattern ) ) (otherlv_2= If ( (lv_e_3_0= ruleExpr ) ) )? otherlv_4= EqualsSignGreaterThanSign ( (lv_s_5_0= ruleSlangStmt ) )* ) )
            // InternalGumboParser.g:3866:2: (otherlv_0= Case ( (lv_pattern_1_0= ruleSlangPattern ) ) (otherlv_2= If ( (lv_e_3_0= ruleExpr ) ) )? otherlv_4= EqualsSignGreaterThanSign ( (lv_s_5_0= ruleSlangStmt ) )* )
            {
            // InternalGumboParser.g:3866:2: (otherlv_0= Case ( (lv_pattern_1_0= ruleSlangPattern ) ) (otherlv_2= If ( (lv_e_3_0= ruleExpr ) ) )? otherlv_4= EqualsSignGreaterThanSign ( (lv_s_5_0= ruleSlangStmt ) )* )
            // InternalGumboParser.g:3867:3: otherlv_0= Case ( (lv_pattern_1_0= ruleSlangPattern ) ) (otherlv_2= If ( (lv_e_3_0= ruleExpr ) ) )? otherlv_4= EqualsSignGreaterThanSign ( (lv_s_5_0= ruleSlangStmt ) )*
            {
            otherlv_0=(Token)match(input,Case,FollowSets000.FOLLOW_66); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangCaseAccess().getCaseKeyword_0());
              		
            }
            // InternalGumboParser.g:3871:3: ( (lv_pattern_1_0= ruleSlangPattern ) )
            // InternalGumboParser.g:3872:4: (lv_pattern_1_0= ruleSlangPattern )
            {
            // InternalGumboParser.g:3872:4: (lv_pattern_1_0= ruleSlangPattern )
            // InternalGumboParser.g:3873:5: lv_pattern_1_0= ruleSlangPattern
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangCaseAccess().getPatternSlangPatternParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_67);
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

            // InternalGumboParser.g:3890:3: (otherlv_2= If ( (lv_e_3_0= ruleExpr ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==If) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalGumboParser.g:3891:4: otherlv_2= If ( (lv_e_3_0= ruleExpr ) )
                    {
                    otherlv_2=(Token)match(input,If,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSlangCaseAccess().getIfKeyword_2_0());
                      			
                    }
                    // InternalGumboParser.g:3895:4: ( (lv_e_3_0= ruleExpr ) )
                    // InternalGumboParser.g:3896:5: (lv_e_3_0= ruleExpr )
                    {
                    // InternalGumboParser.g:3896:5: (lv_e_3_0= ruleExpr )
                    // InternalGumboParser.g:3897:6: lv_e_3_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangCaseAccess().getEExprParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_68);
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

            otherlv_4=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_69); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getSlangCaseAccess().getEqualsSignGreaterThanSignKeyword_3());
              		
            }
            // InternalGumboParser.g:3919:3: ( (lv_s_5_0= ruleSlangStmt ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( ((LA79_0>=Assert && LA79_0<=Assume)||LA79_0==Match||LA79_0==While||(LA79_0>=Halt && LA79_0<=Spec)||(LA79_0>=Val && LA79_0<=Var)||(LA79_0>=Do && LA79_0<=If)||LA79_0==RULE_ID) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalGumboParser.g:3920:4: (lv_s_5_0= ruleSlangStmt )
            	    {
            	    // InternalGumboParser.g:3920:4: (lv_s_5_0= ruleSlangStmt )
            	    // InternalGumboParser.g:3921:5: lv_s_5_0= ruleSlangStmt
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSlangCaseAccess().getSSlangStmtParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_69);
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
    // InternalGumboParser.g:3942:1: entryRuleSlangPattern returns [EObject current=null] : iv_ruleSlangPattern= ruleSlangPattern EOF ;
    public final EObject entryRuleSlangPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangPattern = null;


        try {
            // InternalGumboParser.g:3942:53: (iv_ruleSlangPattern= ruleSlangPattern EOF )
            // InternalGumboParser.g:3943:2: iv_ruleSlangPattern= ruleSlangPattern EOF
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
    // InternalGumboParser.g:3949:1: ruleSlangPattern returns [EObject current=null] : ( ( () this_ID_1= RULE_ID (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis )? ) | (otherlv_7= LeftParenthesis ( (lv_patterns_8_0= ruleSlangTPattern ) ) (otherlv_9= Comma ( (lv_patterns_10_0= ruleSlangTPattern ) ) )* otherlv_11= RightParenthesis ) ) ;
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
            // InternalGumboParser.g:3955:2: ( ( ( () this_ID_1= RULE_ID (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis )? ) | (otherlv_7= LeftParenthesis ( (lv_patterns_8_0= ruleSlangTPattern ) ) (otherlv_9= Comma ( (lv_patterns_10_0= ruleSlangTPattern ) ) )* otherlv_11= RightParenthesis ) ) )
            // InternalGumboParser.g:3956:2: ( ( () this_ID_1= RULE_ID (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis )? ) | (otherlv_7= LeftParenthesis ( (lv_patterns_8_0= ruleSlangTPattern ) ) (otherlv_9= Comma ( (lv_patterns_10_0= ruleSlangTPattern ) ) )* otherlv_11= RightParenthesis ) )
            {
            // InternalGumboParser.g:3956:2: ( ( () this_ID_1= RULE_ID (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis )? ) | (otherlv_7= LeftParenthesis ( (lv_patterns_8_0= ruleSlangTPattern ) ) (otherlv_9= Comma ( (lv_patterns_10_0= ruleSlangTPattern ) ) )* otherlv_11= RightParenthesis ) )
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
                    // InternalGumboParser.g:3957:3: ( () this_ID_1= RULE_ID (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis )? )
                    {
                    // InternalGumboParser.g:3957:3: ( () this_ID_1= RULE_ID (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis )? )
                    // InternalGumboParser.g:3958:4: () this_ID_1= RULE_ID (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis )?
                    {
                    // InternalGumboParser.g:3958:4: ()
                    // InternalGumboParser.g:3959:5: 
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

                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_70); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_1, grammarAccess.getSlangPatternAccess().getIDTerminalRuleCall_0_1());
                      			
                    }
                    // InternalGumboParser.g:3972:4: (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==LeftParenthesis) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // InternalGumboParser.g:3973:5: otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis
                            {
                            otherlv_2=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_71); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getSlangPatternAccess().getLeftParenthesisKeyword_0_2_0());
                              				
                            }
                            // InternalGumboParser.g:3977:5: ( (lv_patterns_3_0= ruleSlangTPattern ) )
                            // InternalGumboParser.g:3978:6: (lv_patterns_3_0= ruleSlangTPattern )
                            {
                            // InternalGumboParser.g:3978:6: (lv_patterns_3_0= ruleSlangTPattern )
                            // InternalGumboParser.g:3979:7: lv_patterns_3_0= ruleSlangTPattern
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSlangPatternAccess().getPatternsSlangTPatternParserRuleCall_0_2_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_29);
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

                            // InternalGumboParser.g:3996:5: (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )*
                            loop80:
                            do {
                                int alt80=2;
                                int LA80_0 = input.LA(1);

                                if ( (LA80_0==Comma) ) {
                                    alt80=1;
                                }


                                switch (alt80) {
                            	case 1 :
                            	    // InternalGumboParser.g:3997:6: otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) )
                            	    {
                            	    otherlv_4=(Token)match(input,Comma,FollowSets000.FOLLOW_71); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_4, grammarAccess.getSlangPatternAccess().getCommaKeyword_0_2_2_0());
                            	      					
                            	    }
                            	    // InternalGumboParser.g:4001:6: ( (lv_patterns_5_0= ruleSlangTPattern ) )
                            	    // InternalGumboParser.g:4002:7: (lv_patterns_5_0= ruleSlangTPattern )
                            	    {
                            	    // InternalGumboParser.g:4002:7: (lv_patterns_5_0= ruleSlangTPattern )
                            	    // InternalGumboParser.g:4003:8: lv_patterns_5_0= ruleSlangTPattern
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getSlangPatternAccess().getPatternsSlangTPatternParserRuleCall_0_2_2_1_0());
                            	      							
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_29);
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
                    // InternalGumboParser.g:4028:3: (otherlv_7= LeftParenthesis ( (lv_patterns_8_0= ruleSlangTPattern ) ) (otherlv_9= Comma ( (lv_patterns_10_0= ruleSlangTPattern ) ) )* otherlv_11= RightParenthesis )
                    {
                    // InternalGumboParser.g:4028:3: (otherlv_7= LeftParenthesis ( (lv_patterns_8_0= ruleSlangTPattern ) ) (otherlv_9= Comma ( (lv_patterns_10_0= ruleSlangTPattern ) ) )* otherlv_11= RightParenthesis )
                    // InternalGumboParser.g:4029:4: otherlv_7= LeftParenthesis ( (lv_patterns_8_0= ruleSlangTPattern ) ) (otherlv_9= Comma ( (lv_patterns_10_0= ruleSlangTPattern ) ) )* otherlv_11= RightParenthesis
                    {
                    otherlv_7=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_71); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getSlangPatternAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalGumboParser.g:4033:4: ( (lv_patterns_8_0= ruleSlangTPattern ) )
                    // InternalGumboParser.g:4034:5: (lv_patterns_8_0= ruleSlangTPattern )
                    {
                    // InternalGumboParser.g:4034:5: (lv_patterns_8_0= ruleSlangTPattern )
                    // InternalGumboParser.g:4035:6: lv_patterns_8_0= ruleSlangTPattern
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangPatternAccess().getPatternsSlangTPatternParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_29);
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

                    // InternalGumboParser.g:4052:4: (otherlv_9= Comma ( (lv_patterns_10_0= ruleSlangTPattern ) ) )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==Comma) ) {
                            alt82=1;
                        }


                        switch (alt82) {
                    	case 1 :
                    	    // InternalGumboParser.g:4053:5: otherlv_9= Comma ( (lv_patterns_10_0= ruleSlangTPattern ) )
                    	    {
                    	    otherlv_9=(Token)match(input,Comma,FollowSets000.FOLLOW_71); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_9, grammarAccess.getSlangPatternAccess().getCommaKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:4057:5: ( (lv_patterns_10_0= ruleSlangTPattern ) )
                    	    // InternalGumboParser.g:4058:6: (lv_patterns_10_0= ruleSlangTPattern )
                    	    {
                    	    // InternalGumboParser.g:4058:6: (lv_patterns_10_0= ruleSlangTPattern )
                    	    // InternalGumboParser.g:4059:7: lv_patterns_10_0= ruleSlangTPattern
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSlangPatternAccess().getPatternsSlangTPatternParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_29);
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
    // InternalGumboParser.g:4086:1: entryRuleSlangTPattern returns [EObject current=null] : iv_ruleSlangTPattern= ruleSlangTPattern EOF ;
    public final EObject entryRuleSlangTPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangTPattern = null;


        try {
            // InternalGumboParser.g:4086:54: (iv_ruleSlangTPattern= ruleSlangTPattern EOF )
            // InternalGumboParser.g:4087:2: iv_ruleSlangTPattern= ruleSlangTPattern EOF
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
    // InternalGumboParser.g:4093:1: ruleSlangTPattern returns [EObject current=null] : ( ( () this_ID_1= RULE_ID ( (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis ) | (otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) ) ) )? ) | (otherlv_9= LeftParenthesis ( (lv_patterns_10_0= ruleSlangTPattern ) ) (otherlv_11= Comma ( (lv_patterns_12_0= ruleSlangTPattern ) ) )* otherlv_13= RightParenthesis ) | ( () otherlv_15= KW__ (otherlv_16= Colon ( (lv_type_17_0= ruleSlangType ) ) )? ) ) ;
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
            // InternalGumboParser.g:4099:2: ( ( ( () this_ID_1= RULE_ID ( (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis ) | (otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) ) ) )? ) | (otherlv_9= LeftParenthesis ( (lv_patterns_10_0= ruleSlangTPattern ) ) (otherlv_11= Comma ( (lv_patterns_12_0= ruleSlangTPattern ) ) )* otherlv_13= RightParenthesis ) | ( () otherlv_15= KW__ (otherlv_16= Colon ( (lv_type_17_0= ruleSlangType ) ) )? ) ) )
            // InternalGumboParser.g:4100:2: ( ( () this_ID_1= RULE_ID ( (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis ) | (otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) ) ) )? ) | (otherlv_9= LeftParenthesis ( (lv_patterns_10_0= ruleSlangTPattern ) ) (otherlv_11= Comma ( (lv_patterns_12_0= ruleSlangTPattern ) ) )* otherlv_13= RightParenthesis ) | ( () otherlv_15= KW__ (otherlv_16= Colon ( (lv_type_17_0= ruleSlangType ) ) )? ) )
            {
            // InternalGumboParser.g:4100:2: ( ( () this_ID_1= RULE_ID ( (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis ) | (otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) ) ) )? ) | (otherlv_9= LeftParenthesis ( (lv_patterns_10_0= ruleSlangTPattern ) ) (otherlv_11= Comma ( (lv_patterns_12_0= ruleSlangTPattern ) ) )* otherlv_13= RightParenthesis ) | ( () otherlv_15= KW__ (otherlv_16= Colon ( (lv_type_17_0= ruleSlangType ) ) )? ) )
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
                    // InternalGumboParser.g:4101:3: ( () this_ID_1= RULE_ID ( (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis ) | (otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) ) ) )? )
                    {
                    // InternalGumboParser.g:4101:3: ( () this_ID_1= RULE_ID ( (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis ) | (otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) ) ) )? )
                    // InternalGumboParser.g:4102:4: () this_ID_1= RULE_ID ( (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis ) | (otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) ) ) )?
                    {
                    // InternalGumboParser.g:4102:4: ()
                    // InternalGumboParser.g:4103:5: 
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

                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_72); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_1, grammarAccess.getSlangTPatternAccess().getIDTerminalRuleCall_0_1());
                      			
                    }
                    // InternalGumboParser.g:4116:4: ( (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis ) | (otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) ) ) )?
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
                            // InternalGumboParser.g:4117:5: (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis )
                            {
                            // InternalGumboParser.g:4117:5: (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis )
                            // InternalGumboParser.g:4118:6: otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis
                            {
                            otherlv_2=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_71); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_2, grammarAccess.getSlangTPatternAccess().getLeftParenthesisKeyword_0_2_0_0());
                              					
                            }
                            // InternalGumboParser.g:4122:6: ( (lv_patterns_3_0= ruleSlangTPattern ) )
                            // InternalGumboParser.g:4123:7: (lv_patterns_3_0= ruleSlangTPattern )
                            {
                            // InternalGumboParser.g:4123:7: (lv_patterns_3_0= ruleSlangTPattern )
                            // InternalGumboParser.g:4124:8: lv_patterns_3_0= ruleSlangTPattern
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getSlangTPatternAccess().getPatternsSlangTPatternParserRuleCall_0_2_0_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_29);
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

                            // InternalGumboParser.g:4141:6: (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )*
                            loop84:
                            do {
                                int alt84=2;
                                int LA84_0 = input.LA(1);

                                if ( (LA84_0==Comma) ) {
                                    alt84=1;
                                }


                                switch (alt84) {
                            	case 1 :
                            	    // InternalGumboParser.g:4142:7: otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) )
                            	    {
                            	    otherlv_4=(Token)match(input,Comma,FollowSets000.FOLLOW_71); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_4, grammarAccess.getSlangTPatternAccess().getCommaKeyword_0_2_0_2_0());
                            	      						
                            	    }
                            	    // InternalGumboParser.g:4146:7: ( (lv_patterns_5_0= ruleSlangTPattern ) )
                            	    // InternalGumboParser.g:4147:8: (lv_patterns_5_0= ruleSlangTPattern )
                            	    {
                            	    // InternalGumboParser.g:4147:8: (lv_patterns_5_0= ruleSlangTPattern )
                            	    // InternalGumboParser.g:4148:9: lv_patterns_5_0= ruleSlangTPattern
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getSlangTPatternAccess().getPatternsSlangTPatternParserRuleCall_0_2_0_2_1_0());
                            	      								
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_29);
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
                            // InternalGumboParser.g:4172:5: (otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) ) )
                            {
                            // InternalGumboParser.g:4172:5: (otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) ) )
                            // InternalGumboParser.g:4173:6: otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) )
                            {
                            otherlv_7=(Token)match(input,Colon,FollowSets000.FOLLOW_8); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_7, grammarAccess.getSlangTPatternAccess().getColonKeyword_0_2_1_0());
                              					
                            }
                            // InternalGumboParser.g:4177:6: ( (lv_type_8_0= ruleSlangType ) )
                            // InternalGumboParser.g:4178:7: (lv_type_8_0= ruleSlangType )
                            {
                            // InternalGumboParser.g:4178:7: (lv_type_8_0= ruleSlangType )
                            // InternalGumboParser.g:4179:8: lv_type_8_0= ruleSlangType
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
                    // InternalGumboParser.g:4200:3: (otherlv_9= LeftParenthesis ( (lv_patterns_10_0= ruleSlangTPattern ) ) (otherlv_11= Comma ( (lv_patterns_12_0= ruleSlangTPattern ) ) )* otherlv_13= RightParenthesis )
                    {
                    // InternalGumboParser.g:4200:3: (otherlv_9= LeftParenthesis ( (lv_patterns_10_0= ruleSlangTPattern ) ) (otherlv_11= Comma ( (lv_patterns_12_0= ruleSlangTPattern ) ) )* otherlv_13= RightParenthesis )
                    // InternalGumboParser.g:4201:4: otherlv_9= LeftParenthesis ( (lv_patterns_10_0= ruleSlangTPattern ) ) (otherlv_11= Comma ( (lv_patterns_12_0= ruleSlangTPattern ) ) )* otherlv_13= RightParenthesis
                    {
                    otherlv_9=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_71); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getSlangTPatternAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalGumboParser.g:4205:4: ( (lv_patterns_10_0= ruleSlangTPattern ) )
                    // InternalGumboParser.g:4206:5: (lv_patterns_10_0= ruleSlangTPattern )
                    {
                    // InternalGumboParser.g:4206:5: (lv_patterns_10_0= ruleSlangTPattern )
                    // InternalGumboParser.g:4207:6: lv_patterns_10_0= ruleSlangTPattern
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangTPatternAccess().getPatternsSlangTPatternParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_29);
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

                    // InternalGumboParser.g:4224:4: (otherlv_11= Comma ( (lv_patterns_12_0= ruleSlangTPattern ) ) )*
                    loop86:
                    do {
                        int alt86=2;
                        int LA86_0 = input.LA(1);

                        if ( (LA86_0==Comma) ) {
                            alt86=1;
                        }


                        switch (alt86) {
                    	case 1 :
                    	    // InternalGumboParser.g:4225:5: otherlv_11= Comma ( (lv_patterns_12_0= ruleSlangTPattern ) )
                    	    {
                    	    otherlv_11=(Token)match(input,Comma,FollowSets000.FOLLOW_71); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_11, grammarAccess.getSlangTPatternAccess().getCommaKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:4229:5: ( (lv_patterns_12_0= ruleSlangTPattern ) )
                    	    // InternalGumboParser.g:4230:6: (lv_patterns_12_0= ruleSlangTPattern )
                    	    {
                    	    // InternalGumboParser.g:4230:6: (lv_patterns_12_0= ruleSlangTPattern )
                    	    // InternalGumboParser.g:4231:7: lv_patterns_12_0= ruleSlangTPattern
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSlangTPatternAccess().getPatternsSlangTPatternParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_29);
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
                    // InternalGumboParser.g:4255:3: ( () otherlv_15= KW__ (otherlv_16= Colon ( (lv_type_17_0= ruleSlangType ) ) )? )
                    {
                    // InternalGumboParser.g:4255:3: ( () otherlv_15= KW__ (otherlv_16= Colon ( (lv_type_17_0= ruleSlangType ) ) )? )
                    // InternalGumboParser.g:4256:4: () otherlv_15= KW__ (otherlv_16= Colon ( (lv_type_17_0= ruleSlangType ) ) )?
                    {
                    // InternalGumboParser.g:4256:4: ()
                    // InternalGumboParser.g:4257:5: 
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

                    otherlv_15=(Token)match(input,KW__,FollowSets000.FOLLOW_73); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getSlangTPatternAccess().get_Keyword_2_1());
                      			
                    }
                    // InternalGumboParser.g:4270:4: (otherlv_16= Colon ( (lv_type_17_0= ruleSlangType ) ) )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==Colon) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // InternalGumboParser.g:4271:5: otherlv_16= Colon ( (lv_type_17_0= ruleSlangType ) )
                            {
                            otherlv_16=(Token)match(input,Colon,FollowSets000.FOLLOW_8); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_16, grammarAccess.getSlangTPatternAccess().getColonKeyword_2_2_0());
                              				
                            }
                            // InternalGumboParser.g:4275:5: ( (lv_type_17_0= ruleSlangType ) )
                            // InternalGumboParser.g:4276:6: (lv_type_17_0= ruleSlangType )
                            {
                            // InternalGumboParser.g:4276:6: (lv_type_17_0= ruleSlangType )
                            // InternalGumboParser.g:4277:7: lv_type_17_0= ruleSlangType
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
    // InternalGumboParser.g:4300:1: entryRuleSlangVarDef returns [EObject current=null] : iv_ruleSlangVarDef= ruleSlangVarDef EOF ;
    public final EObject entryRuleSlangVarDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangVarDef = null;


        try {
            // InternalGumboParser.g:4300:52: (iv_ruleSlangVarDef= ruleSlangVarDef EOF )
            // InternalGumboParser.g:4301:2: iv_ruleSlangVarDef= ruleSlangVarDef EOF
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
    // InternalGumboParser.g:4307:1: ruleSlangVarDef returns [EObject current=null] : ( ruleSlangVarMod this_SlangPattern_1= ruleSlangPattern (otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) )? otherlv_4= ColonEqualsSign ( (lv_init_5_0= ruleExpr ) ) ) ;
    public final EObject ruleSlangVarDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_SlangPattern_1 = null;

        EObject lv_typeName_3_0 = null;

        EObject lv_init_5_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:4313:2: ( ( ruleSlangVarMod this_SlangPattern_1= ruleSlangPattern (otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) )? otherlv_4= ColonEqualsSign ( (lv_init_5_0= ruleExpr ) ) ) )
            // InternalGumboParser.g:4314:2: ( ruleSlangVarMod this_SlangPattern_1= ruleSlangPattern (otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) )? otherlv_4= ColonEqualsSign ( (lv_init_5_0= ruleExpr ) ) )
            {
            // InternalGumboParser.g:4314:2: ( ruleSlangVarMod this_SlangPattern_1= ruleSlangPattern (otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) )? otherlv_4= ColonEqualsSign ( (lv_init_5_0= ruleExpr ) ) )
            // InternalGumboParser.g:4315:3: ruleSlangVarMod this_SlangPattern_1= ruleSlangPattern (otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) )? otherlv_4= ColonEqualsSign ( (lv_init_5_0= ruleExpr ) )
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSlangVarDefAccess().getSlangVarModParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_66);
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
            pushFollow(FollowSets000.FOLLOW_74);
            this_SlangPattern_1=ruleSlangPattern();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SlangPattern_1;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGumboParser.g:4336:3: (otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==Colon) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalGumboParser.g:4337:4: otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) )
                    {
                    otherlv_2=(Token)match(input,Colon,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSlangVarDefAccess().getColonKeyword_2_0());
                      			
                    }
                    // InternalGumboParser.g:4341:4: ( (lv_typeName_3_0= ruleSlangType ) )
                    // InternalGumboParser.g:4342:5: (lv_typeName_3_0= ruleSlangType )
                    {
                    // InternalGumboParser.g:4342:5: (lv_typeName_3_0= ruleSlangType )
                    // InternalGumboParser.g:4343:6: lv_typeName_3_0= ruleSlangType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangVarDefAccess().getTypeNameSlangTypeParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_43);
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
            // InternalGumboParser.g:4365:3: ( (lv_init_5_0= ruleExpr ) )
            // InternalGumboParser.g:4366:4: (lv_init_5_0= ruleExpr )
            {
            // InternalGumboParser.g:4366:4: (lv_init_5_0= ruleExpr )
            // InternalGumboParser.g:4367:5: lv_init_5_0= ruleExpr
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
    // InternalGumboParser.g:4388:1: entryRuleSlangVarMod returns [String current=null] : iv_ruleSlangVarMod= ruleSlangVarMod EOF ;
    public final String entryRuleSlangVarMod() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSlangVarMod = null;


        try {
            // InternalGumboParser.g:4388:51: (iv_ruleSlangVarMod= ruleSlangVarMod EOF )
            // InternalGumboParser.g:4389:2: iv_ruleSlangVarMod= ruleSlangVarMod EOF
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
    // InternalGumboParser.g:4395:1: ruleSlangVarMod returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Val | kw= Var ) ;
    public final AntlrDatatypeRuleToken ruleSlangVarMod() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumboParser.g:4401:2: ( (kw= Val | kw= Var ) )
            // InternalGumboParser.g:4402:2: (kw= Val | kw= Var )
            {
            // InternalGumboParser.g:4402:2: (kw= Val | kw= Var )
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
                    // InternalGumboParser.g:4403:3: kw= Val
                    {
                    kw=(Token)match(input,Val,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getSlangVarModAccess().getValKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:4409:3: kw= Var
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
    // InternalGumboParser.g:4418:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // InternalGumboParser.g:4418:45: (iv_ruleExpr= ruleExpr EOF )
            // InternalGumboParser.g:4419:2: iv_ruleExpr= ruleExpr EOF
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
    // InternalGumboParser.g:4425:1: ruleExpr returns [EObject current=null] : ( ( () ( (lv_terms_1_0= ruleSlangAccess ) ) ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )* ) | ( () otherlv_5= If otherlv_6= LeftParenthesis ( (lv_ifCond_7_0= ruleExpr ) ) otherlv_8= RightParenthesis ( (lv_thenExpr_9_0= ruleExpr ) ) otherlv_10= Else ( (lv_elseExpr_11_0= ruleExpr ) ) ) | ( () (otherlv_13= All | otherlv_14= Some | otherlv_15= ForAll | otherlv_16= ThereExists ) ( (lv_qVar_17_0= ruleSlangQuantVar ) ) (otherlv_18= Comma ( (lv_qVar_19_0= ruleSlangQuantVar ) ) )* otherlv_20= EqualsSignGreaterThanSign ( (lv_quantifiedExpr_21_0= ruleExpr ) ) ) | ( () ( (lv_op_23_0= ruleOperator ) ) ( (lv_accessExp_24_0= ruleSlangAccess ) ) ) ) ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        EObject lv_terms_1_0 = null;

        AntlrDatatypeRuleToken lv_ops_2_0 = null;

        EObject lv_terms_3_0 = null;

        EObject lv_ifCond_7_0 = null;

        EObject lv_thenExpr_9_0 = null;

        EObject lv_elseExpr_11_0 = null;

        EObject lv_qVar_17_0 = null;

        EObject lv_qVar_19_0 = null;

        EObject lv_quantifiedExpr_21_0 = null;

        AntlrDatatypeRuleToken lv_op_23_0 = null;

        EObject lv_accessExp_24_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:4431:2: ( ( ( () ( (lv_terms_1_0= ruleSlangAccess ) ) ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )* ) | ( () otherlv_5= If otherlv_6= LeftParenthesis ( (lv_ifCond_7_0= ruleExpr ) ) otherlv_8= RightParenthesis ( (lv_thenExpr_9_0= ruleExpr ) ) otherlv_10= Else ( (lv_elseExpr_11_0= ruleExpr ) ) ) | ( () (otherlv_13= All | otherlv_14= Some | otherlv_15= ForAll | otherlv_16= ThereExists ) ( (lv_qVar_17_0= ruleSlangQuantVar ) ) (otherlv_18= Comma ( (lv_qVar_19_0= ruleSlangQuantVar ) ) )* otherlv_20= EqualsSignGreaterThanSign ( (lv_quantifiedExpr_21_0= ruleExpr ) ) ) | ( () ( (lv_op_23_0= ruleOperator ) ) ( (lv_accessExp_24_0= ruleSlangAccess ) ) ) ) )
            // InternalGumboParser.g:4432:2: ( ( () ( (lv_terms_1_0= ruleSlangAccess ) ) ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )* ) | ( () otherlv_5= If otherlv_6= LeftParenthesis ( (lv_ifCond_7_0= ruleExpr ) ) otherlv_8= RightParenthesis ( (lv_thenExpr_9_0= ruleExpr ) ) otherlv_10= Else ( (lv_elseExpr_11_0= ruleExpr ) ) ) | ( () (otherlv_13= All | otherlv_14= Some | otherlv_15= ForAll | otherlv_16= ThereExists ) ( (lv_qVar_17_0= ruleSlangQuantVar ) ) (otherlv_18= Comma ( (lv_qVar_19_0= ruleSlangQuantVar ) ) )* otherlv_20= EqualsSignGreaterThanSign ( (lv_quantifiedExpr_21_0= ruleExpr ) ) ) | ( () ( (lv_op_23_0= ruleOperator ) ) ( (lv_accessExp_24_0= ruleSlangAccess ) ) ) )
            {
            // InternalGumboParser.g:4432:2: ( ( () ( (lv_terms_1_0= ruleSlangAccess ) ) ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )* ) | ( () otherlv_5= If otherlv_6= LeftParenthesis ( (lv_ifCond_7_0= ruleExpr ) ) otherlv_8= RightParenthesis ( (lv_thenExpr_9_0= ruleExpr ) ) otherlv_10= Else ( (lv_elseExpr_11_0= ruleExpr ) ) ) | ( () (otherlv_13= All | otherlv_14= Some | otherlv_15= ForAll | otherlv_16= ThereExists ) ( (lv_qVar_17_0= ruleSlangQuantVar ) ) (otherlv_18= Comma ( (lv_qVar_19_0= ruleSlangQuantVar ) ) )* otherlv_20= EqualsSignGreaterThanSign ( (lv_quantifiedExpr_21_0= ruleExpr ) ) ) | ( () ( (lv_op_23_0= ruleOperator ) ) ( (lv_accessExp_24_0= ruleSlangAccess ) ) ) )
            int alt94=4;
            switch ( input.LA(1) ) {
            case HasEvent:
            case MustSend:
            case MaySend:
            case NoSend:
            case False:
            case True:
            case F32:
            case F64:
            case For:
            case Res:
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
            case RULE_REAL_LIT:
            case RULE_F32_LIT:
            case RULE_F64_LIT:
            case RULE_ID:
                {
                alt94=1;
                }
                break;
            case If:
                {
                alt94=2;
                }
                break;
            case Some:
            case All:
            case ForAll:
            case ThereExists:
                {
                alt94=3;
                }
                break;
            case Asterisk:
            case PlusSign:
            case HyphenMinus:
            case RULE_IMPLIES:
            case RULE_SIMPLIES:
            case RULE_OP:
                {
                alt94=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }

            switch (alt94) {
                case 1 :
                    // InternalGumboParser.g:4433:3: ( () ( (lv_terms_1_0= ruleSlangAccess ) ) ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )* )
                    {
                    // InternalGumboParser.g:4433:3: ( () ( (lv_terms_1_0= ruleSlangAccess ) ) ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )* )
                    // InternalGumboParser.g:4434:4: () ( (lv_terms_1_0= ruleSlangAccess ) ) ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )*
                    {
                    // InternalGumboParser.g:4434:4: ()
                    // InternalGumboParser.g:4435:5: 
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

                    // InternalGumboParser.g:4444:4: ( (lv_terms_1_0= ruleSlangAccess ) )
                    // InternalGumboParser.g:4445:5: (lv_terms_1_0= ruleSlangAccess )
                    {
                    // InternalGumboParser.g:4445:5: (lv_terms_1_0= ruleSlangAccess )
                    // InternalGumboParser.g:4446:6: lv_terms_1_0= ruleSlangAccess
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprAccess().getTermsSlangAccessParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_75);
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

                    // InternalGumboParser.g:4463:4: ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )*
                    loop91:
                    do {
                        int alt91=2;
                        int LA91_0 = input.LA(1);

                        if ( ((LA91_0>=Asterisk && LA91_0<=PlusSign)||LA91_0==HyphenMinus||(LA91_0>=RULE_IMPLIES && LA91_0<=RULE_OP)) ) {
                            alt91=1;
                        }


                        switch (alt91) {
                    	case 1 :
                    	    // InternalGumboParser.g:4464:5: ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) )
                    	    {
                    	    // InternalGumboParser.g:4464:5: ( (lv_ops_2_0= ruleOperator ) )
                    	    // InternalGumboParser.g:4465:6: (lv_ops_2_0= ruleOperator )
                    	    {
                    	    // InternalGumboParser.g:4465:6: (lv_ops_2_0= ruleOperator )
                    	    // InternalGumboParser.g:4466:7: lv_ops_2_0= ruleOperator
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getExprAccess().getOpsOperatorParserRuleCall_0_2_0_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_76);
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

                    	    // InternalGumboParser.g:4483:5: ( (lv_terms_3_0= ruleSlangAccess ) )
                    	    // InternalGumboParser.g:4484:6: (lv_terms_3_0= ruleSlangAccess )
                    	    {
                    	    // InternalGumboParser.g:4484:6: (lv_terms_3_0= ruleSlangAccess )
                    	    // InternalGumboParser.g:4485:7: lv_terms_3_0= ruleSlangAccess
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getExprAccess().getTermsSlangAccessParserRuleCall_0_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_75);
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


                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:4505:3: ( () otherlv_5= If otherlv_6= LeftParenthesis ( (lv_ifCond_7_0= ruleExpr ) ) otherlv_8= RightParenthesis ( (lv_thenExpr_9_0= ruleExpr ) ) otherlv_10= Else ( (lv_elseExpr_11_0= ruleExpr ) ) )
                    {
                    // InternalGumboParser.g:4505:3: ( () otherlv_5= If otherlv_6= LeftParenthesis ( (lv_ifCond_7_0= ruleExpr ) ) otherlv_8= RightParenthesis ( (lv_thenExpr_9_0= ruleExpr ) ) otherlv_10= Else ( (lv_elseExpr_11_0= ruleExpr ) ) )
                    // InternalGumboParser.g:4506:4: () otherlv_5= If otherlv_6= LeftParenthesis ( (lv_ifCond_7_0= ruleExpr ) ) otherlv_8= RightParenthesis ( (lv_thenExpr_9_0= ruleExpr ) ) otherlv_10= Else ( (lv_elseExpr_11_0= ruleExpr ) )
                    {
                    // InternalGumboParser.g:4506:4: ()
                    // InternalGumboParser.g:4507:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getExprAccess().getIfElseExpAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_5=(Token)match(input,If,FollowSets000.FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getExprAccess().getIfKeyword_1_1());
                      			
                    }
                    otherlv_6=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getExprAccess().getLeftParenthesisKeyword_1_2());
                      			
                    }
                    // InternalGumboParser.g:4524:4: ( (lv_ifCond_7_0= ruleExpr ) )
                    // InternalGumboParser.g:4525:5: (lv_ifCond_7_0= ruleExpr )
                    {
                    // InternalGumboParser.g:4525:5: (lv_ifCond_7_0= ruleExpr )
                    // InternalGumboParser.g:4526:6: lv_ifCond_7_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprAccess().getIfCondExprParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_45);
                    lv_ifCond_7_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprRule());
                      						}
                      						set(
                      							current,
                      							"ifCond",
                      							lv_ifCond_7_0,
                      							"org.sireum.aadl.gumbo.Gumbo.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getExprAccess().getRightParenthesisKeyword_1_4());
                      			
                    }
                    // InternalGumboParser.g:4547:4: ( (lv_thenExpr_9_0= ruleExpr ) )
                    // InternalGumboParser.g:4548:5: (lv_thenExpr_9_0= ruleExpr )
                    {
                    // InternalGumboParser.g:4548:5: (lv_thenExpr_9_0= ruleExpr )
                    // InternalGumboParser.g:4549:6: lv_thenExpr_9_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprAccess().getThenExprExprParserRuleCall_1_5_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_77);
                    lv_thenExpr_9_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprRule());
                      						}
                      						set(
                      							current,
                      							"thenExpr",
                      							lv_thenExpr_9_0,
                      							"org.sireum.aadl.gumbo.Gumbo.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,Else,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getExprAccess().getElseKeyword_1_6());
                      			
                    }
                    // InternalGumboParser.g:4570:4: ( (lv_elseExpr_11_0= ruleExpr ) )
                    // InternalGumboParser.g:4571:5: (lv_elseExpr_11_0= ruleExpr )
                    {
                    // InternalGumboParser.g:4571:5: (lv_elseExpr_11_0= ruleExpr )
                    // InternalGumboParser.g:4572:6: lv_elseExpr_11_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprAccess().getElseExprExprParserRuleCall_1_7_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_elseExpr_11_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprRule());
                      						}
                      						set(
                      							current,
                      							"elseExpr",
                      							lv_elseExpr_11_0,
                      							"org.sireum.aadl.gumbo.Gumbo.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGumboParser.g:4591:3: ( () (otherlv_13= All | otherlv_14= Some | otherlv_15= ForAll | otherlv_16= ThereExists ) ( (lv_qVar_17_0= ruleSlangQuantVar ) ) (otherlv_18= Comma ( (lv_qVar_19_0= ruleSlangQuantVar ) ) )* otherlv_20= EqualsSignGreaterThanSign ( (lv_quantifiedExpr_21_0= ruleExpr ) ) )
                    {
                    // InternalGumboParser.g:4591:3: ( () (otherlv_13= All | otherlv_14= Some | otherlv_15= ForAll | otherlv_16= ThereExists ) ( (lv_qVar_17_0= ruleSlangQuantVar ) ) (otherlv_18= Comma ( (lv_qVar_19_0= ruleSlangQuantVar ) ) )* otherlv_20= EqualsSignGreaterThanSign ( (lv_quantifiedExpr_21_0= ruleExpr ) ) )
                    // InternalGumboParser.g:4592:4: () (otherlv_13= All | otherlv_14= Some | otherlv_15= ForAll | otherlv_16= ThereExists ) ( (lv_qVar_17_0= ruleSlangQuantVar ) ) (otherlv_18= Comma ( (lv_qVar_19_0= ruleSlangQuantVar ) ) )* otherlv_20= EqualsSignGreaterThanSign ( (lv_quantifiedExpr_21_0= ruleExpr ) )
                    {
                    // InternalGumboParser.g:4592:4: ()
                    // InternalGumboParser.g:4593:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getExprAccess().getQuantifiedExpAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:4602:4: (otherlv_13= All | otherlv_14= Some | otherlv_15= ForAll | otherlv_16= ThereExists )
                    int alt92=4;
                    switch ( input.LA(1) ) {
                    case All:
                        {
                        alt92=1;
                        }
                        break;
                    case Some:
                        {
                        alt92=2;
                        }
                        break;
                    case ForAll:
                        {
                        alt92=3;
                        }
                        break;
                    case ThereExists:
                        {
                        alt92=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 92, 0, input);

                        throw nvae;
                    }

                    switch (alt92) {
                        case 1 :
                            // InternalGumboParser.g:4603:5: otherlv_13= All
                            {
                            otherlv_13=(Token)match(input,All,FollowSets000.FOLLOW_8); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_13, grammarAccess.getExprAccess().getAllKeyword_2_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalGumboParser.g:4608:5: otherlv_14= Some
                            {
                            otherlv_14=(Token)match(input,Some,FollowSets000.FOLLOW_8); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_14, grammarAccess.getExprAccess().getSomeKeyword_2_1_1());
                              				
                            }

                            }
                            break;
                        case 3 :
                            // InternalGumboParser.g:4613:5: otherlv_15= ForAll
                            {
                            otherlv_15=(Token)match(input,ForAll,FollowSets000.FOLLOW_8); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_15, grammarAccess.getExprAccess().getForAllKeyword_2_1_2());
                              				
                            }

                            }
                            break;
                        case 4 :
                            // InternalGumboParser.g:4618:5: otherlv_16= ThereExists
                            {
                            otherlv_16=(Token)match(input,ThereExists,FollowSets000.FOLLOW_8); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_16, grammarAccess.getExprAccess().getThereExistsKeyword_2_1_3());
                              				
                            }

                            }
                            break;

                    }

                    // InternalGumboParser.g:4623:4: ( (lv_qVar_17_0= ruleSlangQuantVar ) )
                    // InternalGumboParser.g:4624:5: (lv_qVar_17_0= ruleSlangQuantVar )
                    {
                    // InternalGumboParser.g:4624:5: (lv_qVar_17_0= ruleSlangQuantVar )
                    // InternalGumboParser.g:4625:6: lv_qVar_17_0= ruleSlangQuantVar
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprAccess().getQVarSlangQuantVarParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_78);
                    lv_qVar_17_0=ruleSlangQuantVar();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprRule());
                      						}
                      						add(
                      							current,
                      							"qVar",
                      							lv_qVar_17_0,
                      							"org.sireum.aadl.gumbo.Gumbo.SlangQuantVar");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:4642:4: (otherlv_18= Comma ( (lv_qVar_19_0= ruleSlangQuantVar ) ) )*
                    loop93:
                    do {
                        int alt93=2;
                        int LA93_0 = input.LA(1);

                        if ( (LA93_0==Comma) ) {
                            alt93=1;
                        }


                        switch (alt93) {
                    	case 1 :
                    	    // InternalGumboParser.g:4643:5: otherlv_18= Comma ( (lv_qVar_19_0= ruleSlangQuantVar ) )
                    	    {
                    	    otherlv_18=(Token)match(input,Comma,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_18, grammarAccess.getExprAccess().getCommaKeyword_2_3_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:4647:5: ( (lv_qVar_19_0= ruleSlangQuantVar ) )
                    	    // InternalGumboParser.g:4648:6: (lv_qVar_19_0= ruleSlangQuantVar )
                    	    {
                    	    // InternalGumboParser.g:4648:6: (lv_qVar_19_0= ruleSlangQuantVar )
                    	    // InternalGumboParser.g:4649:7: lv_qVar_19_0= ruleSlangQuantVar
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getExprAccess().getQVarSlangQuantVarParserRuleCall_2_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_78);
                    	    lv_qVar_19_0=ruleSlangQuantVar();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getExprRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"qVar",
                    	      								lv_qVar_19_0,
                    	      								"org.sireum.aadl.gumbo.Gumbo.SlangQuantVar");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop93;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_20, grammarAccess.getExprAccess().getEqualsSignGreaterThanSignKeyword_2_4());
                      			
                    }
                    // InternalGumboParser.g:4671:4: ( (lv_quantifiedExpr_21_0= ruleExpr ) )
                    // InternalGumboParser.g:4672:5: (lv_quantifiedExpr_21_0= ruleExpr )
                    {
                    // InternalGumboParser.g:4672:5: (lv_quantifiedExpr_21_0= ruleExpr )
                    // InternalGumboParser.g:4673:6: lv_quantifiedExpr_21_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprAccess().getQuantifiedExprExprParserRuleCall_2_5_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_quantifiedExpr_21_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprRule());
                      						}
                      						set(
                      							current,
                      							"quantifiedExpr",
                      							lv_quantifiedExpr_21_0,
                      							"org.sireum.aadl.gumbo.Gumbo.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalGumboParser.g:4692:3: ( () ( (lv_op_23_0= ruleOperator ) ) ( (lv_accessExp_24_0= ruleSlangAccess ) ) )
                    {
                    // InternalGumboParser.g:4692:3: ( () ( (lv_op_23_0= ruleOperator ) ) ( (lv_accessExp_24_0= ruleSlangAccess ) ) )
                    // InternalGumboParser.g:4693:4: () ( (lv_op_23_0= ruleOperator ) ) ( (lv_accessExp_24_0= ruleSlangAccess ) )
                    {
                    // InternalGumboParser.g:4693:4: ()
                    // InternalGumboParser.g:4694:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getExprAccess().getUnaryExpAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:4703:4: ( (lv_op_23_0= ruleOperator ) )
                    // InternalGumboParser.g:4704:5: (lv_op_23_0= ruleOperator )
                    {
                    // InternalGumboParser.g:4704:5: (lv_op_23_0= ruleOperator )
                    // InternalGumboParser.g:4705:6: lv_op_23_0= ruleOperator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprAccess().getOpOperatorParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_76);
                    lv_op_23_0=ruleOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprRule());
                      						}
                      						set(
                      							current,
                      							"op",
                      							lv_op_23_0,
                      							"org.sireum.aadl.gumbo.Gumbo.Operator");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:4722:4: ( (lv_accessExp_24_0= ruleSlangAccess ) )
                    // InternalGumboParser.g:4723:5: (lv_accessExp_24_0= ruleSlangAccess )
                    {
                    // InternalGumboParser.g:4723:5: (lv_accessExp_24_0= ruleSlangAccess )
                    // InternalGumboParser.g:4724:6: lv_accessExp_24_0= ruleSlangAccess
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprAccess().getAccessExpSlangAccessParserRuleCall_3_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_accessExp_24_0=ruleSlangAccess();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprRule());
                      						}
                      						set(
                      							current,
                      							"accessExp",
                      							lv_accessExp_24_0,
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
    // InternalGumboParser.g:4746:1: entryRuleSlangQuantVar returns [EObject current=null] : iv_ruleSlangQuantVar= ruleSlangQuantVar EOF ;
    public final EObject entryRuleSlangQuantVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangQuantVar = null;


        try {
            // InternalGumboParser.g:4746:54: (iv_ruleSlangQuantVar= ruleSlangQuantVar EOF )
            // InternalGumboParser.g:4747:2: iv_ruleSlangQuantVar= ruleSlangQuantVar EOF
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
    // InternalGumboParser.g:4753:1: ruleSlangQuantVar returns [EObject current=null] : (this_ID_0= RULE_ID otherlv_1= Colon ( (lv_e_2_0= ruleExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upperBound_5_0= ruleExpr ) ) )? ) ;
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
            // InternalGumboParser.g:4759:2: ( (this_ID_0= RULE_ID otherlv_1= Colon ( (lv_e_2_0= ruleExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upperBound_5_0= ruleExpr ) ) )? ) )
            // InternalGumboParser.g:4760:2: (this_ID_0= RULE_ID otherlv_1= Colon ( (lv_e_2_0= ruleExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upperBound_5_0= ruleExpr ) ) )? )
            {
            // InternalGumboParser.g:4760:2: (this_ID_0= RULE_ID otherlv_1= Colon ( (lv_e_2_0= ruleExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upperBound_5_0= ruleExpr ) ) )? )
            // InternalGumboParser.g:4761:3: this_ID_0= RULE_ID otherlv_1= Colon ( (lv_e_2_0= ruleExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upperBound_5_0= ruleExpr ) ) )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getSlangQuantVarAccess().getIDTerminalRuleCall_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSlangQuantVarAccess().getColonKeyword_1());
              		
            }
            // InternalGumboParser.g:4769:3: ( (lv_e_2_0= ruleExpr ) )
            // InternalGumboParser.g:4770:4: (lv_e_2_0= ruleExpr )
            {
            // InternalGumboParser.g:4770:4: (lv_e_2_0= ruleExpr )
            // InternalGumboParser.g:4771:5: lv_e_2_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangQuantVarAccess().getEExprParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_79);
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

            // InternalGumboParser.g:4788:3: ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upperBound_5_0= ruleExpr ) ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==FullStopFullStopLessThanSign||LA96_0==FullStopFullStop) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalGumboParser.g:4789:4: (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upperBound_5_0= ruleExpr ) )
                    {
                    // InternalGumboParser.g:4789:4: (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign )
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==FullStopFullStop) ) {
                        alt95=1;
                    }
                    else if ( (LA95_0==FullStopFullStopLessThanSign) ) {
                        alt95=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 95, 0, input);

                        throw nvae;
                    }
                    switch (alt95) {
                        case 1 :
                            // InternalGumboParser.g:4790:5: otherlv_3= FullStopFullStop
                            {
                            otherlv_3=(Token)match(input,FullStopFullStop,FollowSets000.FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_3, grammarAccess.getSlangQuantVarAccess().getFullStopFullStopKeyword_3_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalGumboParser.g:4795:5: otherlv_4= FullStopFullStopLessThanSign
                            {
                            otherlv_4=(Token)match(input,FullStopFullStopLessThanSign,FollowSets000.FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getSlangQuantVarAccess().getFullStopFullStopLessThanSignKeyword_3_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalGumboParser.g:4800:4: ( (lv_upperBound_5_0= ruleExpr ) )
                    // InternalGumboParser.g:4801:5: (lv_upperBound_5_0= ruleExpr )
                    {
                    // InternalGumboParser.g:4801:5: (lv_upperBound_5_0= ruleExpr )
                    // InternalGumboParser.g:4802:6: lv_upperBound_5_0= ruleExpr
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
    // InternalGumboParser.g:4824:1: entryRuleSlangBlock returns [EObject current=null] : iv_ruleSlangBlock= ruleSlangBlock EOF ;
    public final EObject entryRuleSlangBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangBlock = null;


        try {
            // InternalGumboParser.g:4824:51: (iv_ruleSlangBlock= ruleSlangBlock EOF )
            // InternalGumboParser.g:4825:2: iv_ruleSlangBlock= ruleSlangBlock EOF
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
    // InternalGumboParser.g:4831:1: ruleSlangBlock returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( (lv_stmts_2_0= ruleSlangStmt ) )* ( (lv_r_3_0= ruleSlangRet ) )? otherlv_4= RightCurlyBracket ) ;
    public final EObject ruleSlangBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_stmts_2_0 = null;

        EObject lv_r_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:4837:2: ( ( () otherlv_1= LeftCurlyBracket ( (lv_stmts_2_0= ruleSlangStmt ) )* ( (lv_r_3_0= ruleSlangRet ) )? otherlv_4= RightCurlyBracket ) )
            // InternalGumboParser.g:4838:2: ( () otherlv_1= LeftCurlyBracket ( (lv_stmts_2_0= ruleSlangStmt ) )* ( (lv_r_3_0= ruleSlangRet ) )? otherlv_4= RightCurlyBracket )
            {
            // InternalGumboParser.g:4838:2: ( () otherlv_1= LeftCurlyBracket ( (lv_stmts_2_0= ruleSlangStmt ) )* ( (lv_r_3_0= ruleSlangRet ) )? otherlv_4= RightCurlyBracket )
            // InternalGumboParser.g:4839:3: () otherlv_1= LeftCurlyBracket ( (lv_stmts_2_0= ruleSlangStmt ) )* ( (lv_r_3_0= ruleSlangRet ) )? otherlv_4= RightCurlyBracket
            {
            // InternalGumboParser.g:4839:3: ()
            // InternalGumboParser.g:4840:4: 
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

            otherlv_1=(Token)match(input,LeftCurlyBracket,FollowSets000.FOLLOW_80); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSlangBlockAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalGumboParser.g:4853:3: ( (lv_stmts_2_0= ruleSlangStmt ) )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( ((LA97_0>=Assert && LA97_0<=Assume)||LA97_0==Match||LA97_0==While||(LA97_0>=Halt && LA97_0<=Spec)||(LA97_0>=Val && LA97_0<=Var)||(LA97_0>=Do && LA97_0<=If)||LA97_0==RULE_ID) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // InternalGumboParser.g:4854:4: (lv_stmts_2_0= ruleSlangStmt )
            	    {
            	    // InternalGumboParser.g:4854:4: (lv_stmts_2_0= ruleSlangStmt )
            	    // InternalGumboParser.g:4855:5: lv_stmts_2_0= ruleSlangStmt
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSlangBlockAccess().getStmtsSlangStmtParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_80);
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
            	    break loop97;
                }
            } while (true);

            // InternalGumboParser.g:4872:3: ( (lv_r_3_0= ruleSlangRet ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==Return) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalGumboParser.g:4873:4: (lv_r_3_0= ruleSlangRet )
                    {
                    // InternalGumboParser.g:4873:4: (lv_r_3_0= ruleSlangRet )
                    // InternalGumboParser.g:4874:5: lv_r_3_0= ruleSlangRet
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangBlockAccess().getRSlangRetParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_81);
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
    // InternalGumboParser.g:4899:1: entryRuleSlangAccess returns [EObject current=null] : iv_ruleSlangAccess= ruleSlangAccess EOF ;
    public final EObject entryRuleSlangAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangAccess = null;


        try {
            // InternalGumboParser.g:4899:52: (iv_ruleSlangAccess= ruleSlangAccess EOF )
            // InternalGumboParser.g:4900:2: iv_ruleSlangAccess= ruleSlangAccess EOF
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
    // InternalGumboParser.g:4906:1: ruleSlangAccess returns [EObject current=null] : ( () ( (lv_t_1_0= ruleSlangTerm ) ) ( (lv_suffixes_2_0= ruleSlangAccessSuffix ) )* ) ;
    public final EObject ruleSlangAccess() throws RecognitionException {
        EObject current = null;

        EObject lv_t_1_0 = null;

        EObject lv_suffixes_2_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:4912:2: ( ( () ( (lv_t_1_0= ruleSlangTerm ) ) ( (lv_suffixes_2_0= ruleSlangAccessSuffix ) )* ) )
            // InternalGumboParser.g:4913:2: ( () ( (lv_t_1_0= ruleSlangTerm ) ) ( (lv_suffixes_2_0= ruleSlangAccessSuffix ) )* )
            {
            // InternalGumboParser.g:4913:2: ( () ( (lv_t_1_0= ruleSlangTerm ) ) ( (lv_suffixes_2_0= ruleSlangAccessSuffix ) )* )
            // InternalGumboParser.g:4914:3: () ( (lv_t_1_0= ruleSlangTerm ) ) ( (lv_suffixes_2_0= ruleSlangAccessSuffix ) )*
            {
            // InternalGumboParser.g:4914:3: ()
            // InternalGumboParser.g:4915:4: 
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

            // InternalGumboParser.g:4924:3: ( (lv_t_1_0= ruleSlangTerm ) )
            // InternalGumboParser.g:4925:4: (lv_t_1_0= ruleSlangTerm )
            {
            // InternalGumboParser.g:4925:4: (lv_t_1_0= ruleSlangTerm )
            // InternalGumboParser.g:4926:5: lv_t_1_0= ruleSlangTerm
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

            // InternalGumboParser.g:4943:3: ( (lv_suffixes_2_0= ruleSlangAccessSuffix ) )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==FullStop) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // InternalGumboParser.g:4944:4: (lv_suffixes_2_0= ruleSlangAccessSuffix )
            	    {
            	    // InternalGumboParser.g:4944:4: (lv_suffixes_2_0= ruleSlangAccessSuffix )
            	    // InternalGumboParser.g:4945:5: lv_suffixes_2_0= ruleSlangAccessSuffix
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
            	    break loop99;
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
    // InternalGumboParser.g:4966:1: entryRuleSlangAccessSuffix returns [EObject current=null] : iv_ruleSlangAccessSuffix= ruleSlangAccessSuffix EOF ;
    public final EObject entryRuleSlangAccessSuffix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangAccessSuffix = null;


        try {
            // InternalGumboParser.g:4966:58: (iv_ruleSlangAccessSuffix= ruleSlangAccessSuffix EOF )
            // InternalGumboParser.g:4967:2: iv_ruleSlangAccessSuffix= ruleSlangAccessSuffix EOF
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
    // InternalGumboParser.g:4973:1: ruleSlangAccessSuffix returns [EObject current=null] : ( () otherlv_1= FullStop ( (lv_id_2_0= RULE_ID ) ) ) ;
    public final EObject ruleSlangAccessSuffix() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_id_2_0=null;


        	enterRule();

        try {
            // InternalGumboParser.g:4979:2: ( ( () otherlv_1= FullStop ( (lv_id_2_0= RULE_ID ) ) ) )
            // InternalGumboParser.g:4980:2: ( () otherlv_1= FullStop ( (lv_id_2_0= RULE_ID ) ) )
            {
            // InternalGumboParser.g:4980:2: ( () otherlv_1= FullStop ( (lv_id_2_0= RULE_ID ) ) )
            // InternalGumboParser.g:4981:3: () otherlv_1= FullStop ( (lv_id_2_0= RULE_ID ) )
            {
            // InternalGumboParser.g:4981:3: ()
            // InternalGumboParser.g:4982:4: 
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
            // InternalGumboParser.g:4995:3: ( (lv_id_2_0= RULE_ID ) )
            // InternalGumboParser.g:4996:4: (lv_id_2_0= RULE_ID )
            {
            // InternalGumboParser.g:4996:4: (lv_id_2_0= RULE_ID )
            // InternalGumboParser.g:4997:5: lv_id_2_0= RULE_ID
            {
            lv_id_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
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


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalGumboParser.g:5017:1: entryRuleSlangTerm returns [EObject current=null] : iv_ruleSlangTerm= ruleSlangTerm EOF ;
    public final EObject entryRuleSlangTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangTerm = null;


        try {
            // InternalGumboParser.g:5017:50: (iv_ruleSlangTerm= ruleSlangTerm EOF )
            // InternalGumboParser.g:5018:2: iv_ruleSlangTerm= ruleSlangTerm EOF
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
    // InternalGumboParser.g:5024:1: ruleSlangTerm returns [EObject current=null] : ( ( () ( (lv_lit_1_0= ruleSlangLit ) ) ) | ( () ( (lv_i_3_0= ruleSlangInterp ) ) ) | ( ( ( ( () In_1 LeftParenthesis ) )=> ( () otherlv_5= In_1 otherlv_6= LeftParenthesis ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= RightParenthesis ) | ( ( ( ( () MaySend LeftParenthesis ) )=> ( () otherlv_10= MaySend otherlv_11= LeftParenthesis ) ) ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (lv_value_14_0= ruleExpr ) ) )? otherlv_15= RightParenthesis ) | ( ( ( ( () MustSend LeftParenthesis ) )=> ( () otherlv_17= MustSend otherlv_18= LeftParenthesis ) ) ( (otherlv_19= RULE_ID ) ) (otherlv_20= Comma ( (lv_value_21_0= ruleExpr ) ) )? otherlv_22= RightParenthesis ) | ( ( ( ( () NoSend LeftParenthesis ) )=> ( () otherlv_24= NoSend otherlv_25= LeftParenthesis ) ) ( (otherlv_26= RULE_ID ) ) otherlv_27= RightParenthesis ) | ( ( ( ( () HasEvent LeftParenthesis ) )=> ( () otherlv_29= HasEvent otherlv_30= LeftParenthesis ) ) ( (otherlv_31= RULE_ID ) ) otherlv_32= RightParenthesis ) | ( ( ( () ( ( ruleQCREF ) ) ( ( ruleSlangCallSuffix ) ) ) )=> ( () ( ( ruleQCREF ) ) ( (lv_callSuffix_35_0= ruleSlangCallSuffix ) ) ) ) | ( ( ( ( () ( ( ruleQCLREF ) ) FullStop ) )=> ( () ( ( ruleQCLREF ) ) otherlv_38= FullStop ) ) ( (otherlv_39= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_41_0= ruleDataElement ) ) otherlv_42= LeftCurlyBracket ( (otherlv_43= RULE_ID ) ) otherlv_44= EqualsSign ) ) ( (lv_argExpr_45_0= ruleExpr ) ) (otherlv_46= Semicolon ( (otherlv_47= RULE_ID ) ) otherlv_48= EqualsSign ( (lv_argExpr_49_0= ruleExpr ) ) )* otherlv_50= RightCurlyBracket ) | ( () ( (otherlv_52= RULE_ID ) ) (otherlv_53= FullStop ( (lv_ref_54_0= ruleOtherDataRef ) ) )? ) | ( () otherlv_56= LeftParenthesis ( (lv_exp_57_0= ruleExpr ) ) otherlv_58= RightParenthesis ) | ( () otherlv_60= For ( (lv_r_61_0= ruleSlangForRange ) ) (otherlv_62= Comma ( (lv_r_63_0= ruleSlangForRange ) ) )* otherlv_64= Yield ( ( (lv_b_65_0= ruleSlangBlock ) ) | (otherlv_66= LeftParenthesis ( (lv_e_67_0= ruleExpr ) ) otherlv_68= RightParenthesis ) ) ) | ( () otherlv_70= LeftCurlyBracket ( ( ( ( (lv_p_71_0= ruleSlangParams ) ) otherlv_72= EqualsSignGreaterThanSign )? ( (lv_e_73_0= ruleExpr ) ) otherlv_74= RightCurlyBracket ) | ( ( (lv_stmt_75_0= ruleSlangStmt ) )* ( (lv_r_76_0= ruleSlangRet ) )? otherlv_77= RightCurlyBracket ) ) ) ) ;
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
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_44=null;
        Token otherlv_46=null;
        Token otherlv_47=null;
        Token otherlv_48=null;
        Token otherlv_50=null;
        Token otherlv_52=null;
        Token otherlv_53=null;
        Token otherlv_56=null;
        Token otherlv_58=null;
        Token otherlv_60=null;
        Token otherlv_62=null;
        Token otherlv_64=null;
        Token otherlv_66=null;
        Token otherlv_68=null;
        Token otherlv_70=null;
        Token otherlv_72=null;
        Token otherlv_74=null;
        Token otherlv_77=null;
        EObject lv_lit_1_0 = null;

        EObject lv_i_3_0 = null;

        EObject lv_value_14_0 = null;

        EObject lv_value_21_0 = null;

        EObject lv_callSuffix_35_0 = null;

        EObject lv_recordType_41_0 = null;

        EObject lv_argExpr_45_0 = null;

        EObject lv_argExpr_49_0 = null;

        EObject lv_ref_54_0 = null;

        EObject lv_exp_57_0 = null;

        EObject lv_r_61_0 = null;

        EObject lv_r_63_0 = null;

        EObject lv_b_65_0 = null;

        EObject lv_e_67_0 = null;

        EObject lv_p_71_0 = null;

        EObject lv_e_73_0 = null;

        EObject lv_stmt_75_0 = null;

        EObject lv_r_76_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:5030:2: ( ( ( () ( (lv_lit_1_0= ruleSlangLit ) ) ) | ( () ( (lv_i_3_0= ruleSlangInterp ) ) ) | ( ( ( ( () In_1 LeftParenthesis ) )=> ( () otherlv_5= In_1 otherlv_6= LeftParenthesis ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= RightParenthesis ) | ( ( ( ( () MaySend LeftParenthesis ) )=> ( () otherlv_10= MaySend otherlv_11= LeftParenthesis ) ) ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (lv_value_14_0= ruleExpr ) ) )? otherlv_15= RightParenthesis ) | ( ( ( ( () MustSend LeftParenthesis ) )=> ( () otherlv_17= MustSend otherlv_18= LeftParenthesis ) ) ( (otherlv_19= RULE_ID ) ) (otherlv_20= Comma ( (lv_value_21_0= ruleExpr ) ) )? otherlv_22= RightParenthesis ) | ( ( ( ( () NoSend LeftParenthesis ) )=> ( () otherlv_24= NoSend otherlv_25= LeftParenthesis ) ) ( (otherlv_26= RULE_ID ) ) otherlv_27= RightParenthesis ) | ( ( ( ( () HasEvent LeftParenthesis ) )=> ( () otherlv_29= HasEvent otherlv_30= LeftParenthesis ) ) ( (otherlv_31= RULE_ID ) ) otherlv_32= RightParenthesis ) | ( ( ( () ( ( ruleQCREF ) ) ( ( ruleSlangCallSuffix ) ) ) )=> ( () ( ( ruleQCREF ) ) ( (lv_callSuffix_35_0= ruleSlangCallSuffix ) ) ) ) | ( ( ( ( () ( ( ruleQCLREF ) ) FullStop ) )=> ( () ( ( ruleQCLREF ) ) otherlv_38= FullStop ) ) ( (otherlv_39= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_41_0= ruleDataElement ) ) otherlv_42= LeftCurlyBracket ( (otherlv_43= RULE_ID ) ) otherlv_44= EqualsSign ) ) ( (lv_argExpr_45_0= ruleExpr ) ) (otherlv_46= Semicolon ( (otherlv_47= RULE_ID ) ) otherlv_48= EqualsSign ( (lv_argExpr_49_0= ruleExpr ) ) )* otherlv_50= RightCurlyBracket ) | ( () ( (otherlv_52= RULE_ID ) ) (otherlv_53= FullStop ( (lv_ref_54_0= ruleOtherDataRef ) ) )? ) | ( () otherlv_56= LeftParenthesis ( (lv_exp_57_0= ruleExpr ) ) otherlv_58= RightParenthesis ) | ( () otherlv_60= For ( (lv_r_61_0= ruleSlangForRange ) ) (otherlv_62= Comma ( (lv_r_63_0= ruleSlangForRange ) ) )* otherlv_64= Yield ( ( (lv_b_65_0= ruleSlangBlock ) ) | (otherlv_66= LeftParenthesis ( (lv_e_67_0= ruleExpr ) ) otherlv_68= RightParenthesis ) ) ) | ( () otherlv_70= LeftCurlyBracket ( ( ( ( (lv_p_71_0= ruleSlangParams ) ) otherlv_72= EqualsSignGreaterThanSign )? ( (lv_e_73_0= ruleExpr ) ) otherlv_74= RightCurlyBracket ) | ( ( (lv_stmt_75_0= ruleSlangStmt ) )* ( (lv_r_76_0= ruleSlangRet ) )? otherlv_77= RightCurlyBracket ) ) ) ) )
            // InternalGumboParser.g:5031:2: ( ( () ( (lv_lit_1_0= ruleSlangLit ) ) ) | ( () ( (lv_i_3_0= ruleSlangInterp ) ) ) | ( ( ( ( () In_1 LeftParenthesis ) )=> ( () otherlv_5= In_1 otherlv_6= LeftParenthesis ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= RightParenthesis ) | ( ( ( ( () MaySend LeftParenthesis ) )=> ( () otherlv_10= MaySend otherlv_11= LeftParenthesis ) ) ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (lv_value_14_0= ruleExpr ) ) )? otherlv_15= RightParenthesis ) | ( ( ( ( () MustSend LeftParenthesis ) )=> ( () otherlv_17= MustSend otherlv_18= LeftParenthesis ) ) ( (otherlv_19= RULE_ID ) ) (otherlv_20= Comma ( (lv_value_21_0= ruleExpr ) ) )? otherlv_22= RightParenthesis ) | ( ( ( ( () NoSend LeftParenthesis ) )=> ( () otherlv_24= NoSend otherlv_25= LeftParenthesis ) ) ( (otherlv_26= RULE_ID ) ) otherlv_27= RightParenthesis ) | ( ( ( ( () HasEvent LeftParenthesis ) )=> ( () otherlv_29= HasEvent otherlv_30= LeftParenthesis ) ) ( (otherlv_31= RULE_ID ) ) otherlv_32= RightParenthesis ) | ( ( ( () ( ( ruleQCREF ) ) ( ( ruleSlangCallSuffix ) ) ) )=> ( () ( ( ruleQCREF ) ) ( (lv_callSuffix_35_0= ruleSlangCallSuffix ) ) ) ) | ( ( ( ( () ( ( ruleQCLREF ) ) FullStop ) )=> ( () ( ( ruleQCLREF ) ) otherlv_38= FullStop ) ) ( (otherlv_39= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_41_0= ruleDataElement ) ) otherlv_42= LeftCurlyBracket ( (otherlv_43= RULE_ID ) ) otherlv_44= EqualsSign ) ) ( (lv_argExpr_45_0= ruleExpr ) ) (otherlv_46= Semicolon ( (otherlv_47= RULE_ID ) ) otherlv_48= EqualsSign ( (lv_argExpr_49_0= ruleExpr ) ) )* otherlv_50= RightCurlyBracket ) | ( () ( (otherlv_52= RULE_ID ) ) (otherlv_53= FullStop ( (lv_ref_54_0= ruleOtherDataRef ) ) )? ) | ( () otherlv_56= LeftParenthesis ( (lv_exp_57_0= ruleExpr ) ) otherlv_58= RightParenthesis ) | ( () otherlv_60= For ( (lv_r_61_0= ruleSlangForRange ) ) (otherlv_62= Comma ( (lv_r_63_0= ruleSlangForRange ) ) )* otherlv_64= Yield ( ( (lv_b_65_0= ruleSlangBlock ) ) | (otherlv_66= LeftParenthesis ( (lv_e_67_0= ruleExpr ) ) otherlv_68= RightParenthesis ) ) ) | ( () otherlv_70= LeftCurlyBracket ( ( ( ( (lv_p_71_0= ruleSlangParams ) ) otherlv_72= EqualsSignGreaterThanSign )? ( (lv_e_73_0= ruleExpr ) ) otherlv_74= RightCurlyBracket ) | ( ( (lv_stmt_75_0= ruleSlangStmt ) )* ( (lv_r_76_0= ruleSlangRet ) )? otherlv_77= RightCurlyBracket ) ) ) )
            {
            // InternalGumboParser.g:5031:2: ( ( () ( (lv_lit_1_0= ruleSlangLit ) ) ) | ( () ( (lv_i_3_0= ruleSlangInterp ) ) ) | ( ( ( ( () In_1 LeftParenthesis ) )=> ( () otherlv_5= In_1 otherlv_6= LeftParenthesis ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= RightParenthesis ) | ( ( ( ( () MaySend LeftParenthesis ) )=> ( () otherlv_10= MaySend otherlv_11= LeftParenthesis ) ) ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (lv_value_14_0= ruleExpr ) ) )? otherlv_15= RightParenthesis ) | ( ( ( ( () MustSend LeftParenthesis ) )=> ( () otherlv_17= MustSend otherlv_18= LeftParenthesis ) ) ( (otherlv_19= RULE_ID ) ) (otherlv_20= Comma ( (lv_value_21_0= ruleExpr ) ) )? otherlv_22= RightParenthesis ) | ( ( ( ( () NoSend LeftParenthesis ) )=> ( () otherlv_24= NoSend otherlv_25= LeftParenthesis ) ) ( (otherlv_26= RULE_ID ) ) otherlv_27= RightParenthesis ) | ( ( ( ( () HasEvent LeftParenthesis ) )=> ( () otherlv_29= HasEvent otherlv_30= LeftParenthesis ) ) ( (otherlv_31= RULE_ID ) ) otherlv_32= RightParenthesis ) | ( ( ( () ( ( ruleQCREF ) ) ( ( ruleSlangCallSuffix ) ) ) )=> ( () ( ( ruleQCREF ) ) ( (lv_callSuffix_35_0= ruleSlangCallSuffix ) ) ) ) | ( ( ( ( () ( ( ruleQCLREF ) ) FullStop ) )=> ( () ( ( ruleQCLREF ) ) otherlv_38= FullStop ) ) ( (otherlv_39= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_41_0= ruleDataElement ) ) otherlv_42= LeftCurlyBracket ( (otherlv_43= RULE_ID ) ) otherlv_44= EqualsSign ) ) ( (lv_argExpr_45_0= ruleExpr ) ) (otherlv_46= Semicolon ( (otherlv_47= RULE_ID ) ) otherlv_48= EqualsSign ( (lv_argExpr_49_0= ruleExpr ) ) )* otherlv_50= RightCurlyBracket ) | ( () ( (otherlv_52= RULE_ID ) ) (otherlv_53= FullStop ( (lv_ref_54_0= ruleOtherDataRef ) ) )? ) | ( () otherlv_56= LeftParenthesis ( (lv_exp_57_0= ruleExpr ) ) otherlv_58= RightParenthesis ) | ( () otherlv_60= For ( (lv_r_61_0= ruleSlangForRange ) ) (otherlv_62= Comma ( (lv_r_63_0= ruleSlangForRange ) ) )* otherlv_64= Yield ( ( (lv_b_65_0= ruleSlangBlock ) ) | (otherlv_66= LeftParenthesis ( (lv_e_67_0= ruleExpr ) ) otherlv_68= RightParenthesis ) ) ) | ( () otherlv_70= LeftCurlyBracket ( ( ( ( (lv_p_71_0= ruleSlangParams ) ) otherlv_72= EqualsSignGreaterThanSign )? ( (lv_e_73_0= ruleExpr ) ) otherlv_74= RightCurlyBracket ) | ( ( (lv_stmt_75_0= ruleSlangStmt ) )* ( (lv_r_76_0= ruleSlangRet ) )? otherlv_77= RightCurlyBracket ) ) ) )
            int alt110=14;
            alt110 = dfa110.predict(input);
            switch (alt110) {
                case 1 :
                    // InternalGumboParser.g:5032:3: ( () ( (lv_lit_1_0= ruleSlangLit ) ) )
                    {
                    // InternalGumboParser.g:5032:3: ( () ( (lv_lit_1_0= ruleSlangLit ) ) )
                    // InternalGumboParser.g:5033:4: () ( (lv_lit_1_0= ruleSlangLit ) )
                    {
                    // InternalGumboParser.g:5033:4: ()
                    // InternalGumboParser.g:5034:5: 
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

                    // InternalGumboParser.g:5043:4: ( (lv_lit_1_0= ruleSlangLit ) )
                    // InternalGumboParser.g:5044:5: (lv_lit_1_0= ruleSlangLit )
                    {
                    // InternalGumboParser.g:5044:5: (lv_lit_1_0= ruleSlangLit )
                    // InternalGumboParser.g:5045:6: lv_lit_1_0= ruleSlangLit
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
                    // InternalGumboParser.g:5064:3: ( () ( (lv_i_3_0= ruleSlangInterp ) ) )
                    {
                    // InternalGumboParser.g:5064:3: ( () ( (lv_i_3_0= ruleSlangInterp ) ) )
                    // InternalGumboParser.g:5065:4: () ( (lv_i_3_0= ruleSlangInterp ) )
                    {
                    // InternalGumboParser.g:5065:4: ()
                    // InternalGumboParser.g:5066:5: 
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

                    // InternalGumboParser.g:5075:4: ( (lv_i_3_0= ruleSlangInterp ) )
                    // InternalGumboParser.g:5076:5: (lv_i_3_0= ruleSlangInterp )
                    {
                    // InternalGumboParser.g:5076:5: (lv_i_3_0= ruleSlangInterp )
                    // InternalGumboParser.g:5077:6: lv_i_3_0= ruleSlangInterp
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
                    // InternalGumboParser.g:5096:3: ( ( ( ( () In_1 LeftParenthesis ) )=> ( () otherlv_5= In_1 otherlv_6= LeftParenthesis ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= RightParenthesis )
                    {
                    // InternalGumboParser.g:5096:3: ( ( ( ( () In_1 LeftParenthesis ) )=> ( () otherlv_5= In_1 otherlv_6= LeftParenthesis ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= RightParenthesis )
                    // InternalGumboParser.g:5097:4: ( ( ( () In_1 LeftParenthesis ) )=> ( () otherlv_5= In_1 otherlv_6= LeftParenthesis ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= RightParenthesis
                    {
                    // InternalGumboParser.g:5097:4: ( ( ( () In_1 LeftParenthesis ) )=> ( () otherlv_5= In_1 otherlv_6= LeftParenthesis ) )
                    // InternalGumboParser.g:5098:5: ( ( () In_1 LeftParenthesis ) )=> ( () otherlv_5= In_1 otherlv_6= LeftParenthesis )
                    {
                    // InternalGumboParser.g:5105:5: ( () otherlv_5= In_1 otherlv_6= LeftParenthesis )
                    // InternalGumboParser.g:5106:6: () otherlv_5= In_1 otherlv_6= LeftParenthesis
                    {
                    // InternalGumboParser.g:5106:6: ()
                    // InternalGumboParser.g:5107:7: 
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

                    otherlv_5=(Token)match(input,In_1,FollowSets000.FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_5, grammarAccess.getSlangTermAccess().getInKeyword_2_0_0_1());
                      					
                    }
                    otherlv_6=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_6, grammarAccess.getSlangTermAccess().getLeftParenthesisKeyword_2_0_0_2());
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:5126:4: ( (otherlv_7= RULE_ID ) )
                    // InternalGumboParser.g:5127:5: (otherlv_7= RULE_ID )
                    {
                    // InternalGumboParser.g:5127:5: (otherlv_7= RULE_ID )
                    // InternalGumboParser.g:5128:6: otherlv_7= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSlangTermRule());
                      						}
                      					
                    }
                    otherlv_7=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_45); if (state.failed) return current;
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
                    // InternalGumboParser.g:5148:3: ( ( ( ( () MaySend LeftParenthesis ) )=> ( () otherlv_10= MaySend otherlv_11= LeftParenthesis ) ) ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (lv_value_14_0= ruleExpr ) ) )? otherlv_15= RightParenthesis )
                    {
                    // InternalGumboParser.g:5148:3: ( ( ( ( () MaySend LeftParenthesis ) )=> ( () otherlv_10= MaySend otherlv_11= LeftParenthesis ) ) ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (lv_value_14_0= ruleExpr ) ) )? otherlv_15= RightParenthesis )
                    // InternalGumboParser.g:5149:4: ( ( ( () MaySend LeftParenthesis ) )=> ( () otherlv_10= MaySend otherlv_11= LeftParenthesis ) ) ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (lv_value_14_0= ruleExpr ) ) )? otherlv_15= RightParenthesis
                    {
                    // InternalGumboParser.g:5149:4: ( ( ( () MaySend LeftParenthesis ) )=> ( () otherlv_10= MaySend otherlv_11= LeftParenthesis ) )
                    // InternalGumboParser.g:5150:5: ( ( () MaySend LeftParenthesis ) )=> ( () otherlv_10= MaySend otherlv_11= LeftParenthesis )
                    {
                    // InternalGumboParser.g:5157:5: ( () otherlv_10= MaySend otherlv_11= LeftParenthesis )
                    // InternalGumboParser.g:5158:6: () otherlv_10= MaySend otherlv_11= LeftParenthesis
                    {
                    // InternalGumboParser.g:5158:6: ()
                    // InternalGumboParser.g:5159:7: 
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

                    otherlv_10=(Token)match(input,MaySend,FollowSets000.FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_10, grammarAccess.getSlangTermAccess().getMaySendKeyword_3_0_0_1());
                      					
                    }
                    otherlv_11=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_11, grammarAccess.getSlangTermAccess().getLeftParenthesisKeyword_3_0_0_2());
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:5178:4: ( (otherlv_12= RULE_ID ) )
                    // InternalGumboParser.g:5179:5: (otherlv_12= RULE_ID )
                    {
                    // InternalGumboParser.g:5179:5: (otherlv_12= RULE_ID )
                    // InternalGumboParser.g:5180:6: otherlv_12= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSlangTermRule());
                      						}
                      					
                    }
                    otherlv_12=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_12, grammarAccess.getSlangTermAccess().getEventPortPortCrossReference_3_1_0());
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:5194:4: (otherlv_13= Comma ( (lv_value_14_0= ruleExpr ) ) )?
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==Comma) ) {
                        alt100=1;
                    }
                    switch (alt100) {
                        case 1 :
                            // InternalGumboParser.g:5195:5: otherlv_13= Comma ( (lv_value_14_0= ruleExpr ) )
                            {
                            otherlv_13=(Token)match(input,Comma,FollowSets000.FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_13, grammarAccess.getSlangTermAccess().getCommaKeyword_3_2_0());
                              				
                            }
                            // InternalGumboParser.g:5199:5: ( (lv_value_14_0= ruleExpr ) )
                            // InternalGumboParser.g:5200:6: (lv_value_14_0= ruleExpr )
                            {
                            // InternalGumboParser.g:5200:6: (lv_value_14_0= ruleExpr )
                            // InternalGumboParser.g:5201:7: lv_value_14_0= ruleExpr
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSlangTermAccess().getValueExprParserRuleCall_3_2_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_45);
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
                    // InternalGumboParser.g:5225:3: ( ( ( ( () MustSend LeftParenthesis ) )=> ( () otherlv_17= MustSend otherlv_18= LeftParenthesis ) ) ( (otherlv_19= RULE_ID ) ) (otherlv_20= Comma ( (lv_value_21_0= ruleExpr ) ) )? otherlv_22= RightParenthesis )
                    {
                    // InternalGumboParser.g:5225:3: ( ( ( ( () MustSend LeftParenthesis ) )=> ( () otherlv_17= MustSend otherlv_18= LeftParenthesis ) ) ( (otherlv_19= RULE_ID ) ) (otherlv_20= Comma ( (lv_value_21_0= ruleExpr ) ) )? otherlv_22= RightParenthesis )
                    // InternalGumboParser.g:5226:4: ( ( ( () MustSend LeftParenthesis ) )=> ( () otherlv_17= MustSend otherlv_18= LeftParenthesis ) ) ( (otherlv_19= RULE_ID ) ) (otherlv_20= Comma ( (lv_value_21_0= ruleExpr ) ) )? otherlv_22= RightParenthesis
                    {
                    // InternalGumboParser.g:5226:4: ( ( ( () MustSend LeftParenthesis ) )=> ( () otherlv_17= MustSend otherlv_18= LeftParenthesis ) )
                    // InternalGumboParser.g:5227:5: ( ( () MustSend LeftParenthesis ) )=> ( () otherlv_17= MustSend otherlv_18= LeftParenthesis )
                    {
                    // InternalGumboParser.g:5234:5: ( () otherlv_17= MustSend otherlv_18= LeftParenthesis )
                    // InternalGumboParser.g:5235:6: () otherlv_17= MustSend otherlv_18= LeftParenthesis
                    {
                    // InternalGumboParser.g:5235:6: ()
                    // InternalGumboParser.g:5236:7: 
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

                    otherlv_17=(Token)match(input,MustSend,FollowSets000.FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_17, grammarAccess.getSlangTermAccess().getMustSendKeyword_4_0_0_1());
                      					
                    }
                    otherlv_18=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_18, grammarAccess.getSlangTermAccess().getLeftParenthesisKeyword_4_0_0_2());
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:5255:4: ( (otherlv_19= RULE_ID ) )
                    // InternalGumboParser.g:5256:5: (otherlv_19= RULE_ID )
                    {
                    // InternalGumboParser.g:5256:5: (otherlv_19= RULE_ID )
                    // InternalGumboParser.g:5257:6: otherlv_19= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSlangTermRule());
                      						}
                      					
                    }
                    otherlv_19=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_19, grammarAccess.getSlangTermAccess().getEventPortPortCrossReference_4_1_0());
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:5271:4: (otherlv_20= Comma ( (lv_value_21_0= ruleExpr ) ) )?
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==Comma) ) {
                        alt101=1;
                    }
                    switch (alt101) {
                        case 1 :
                            // InternalGumboParser.g:5272:5: otherlv_20= Comma ( (lv_value_21_0= ruleExpr ) )
                            {
                            otherlv_20=(Token)match(input,Comma,FollowSets000.FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_20, grammarAccess.getSlangTermAccess().getCommaKeyword_4_2_0());
                              				
                            }
                            // InternalGumboParser.g:5276:5: ( (lv_value_21_0= ruleExpr ) )
                            // InternalGumboParser.g:5277:6: (lv_value_21_0= ruleExpr )
                            {
                            // InternalGumboParser.g:5277:6: (lv_value_21_0= ruleExpr )
                            // InternalGumboParser.g:5278:7: lv_value_21_0= ruleExpr
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSlangTermAccess().getValueExprParserRuleCall_4_2_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_45);
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
                    // InternalGumboParser.g:5302:3: ( ( ( ( () NoSend LeftParenthesis ) )=> ( () otherlv_24= NoSend otherlv_25= LeftParenthesis ) ) ( (otherlv_26= RULE_ID ) ) otherlv_27= RightParenthesis )
                    {
                    // InternalGumboParser.g:5302:3: ( ( ( ( () NoSend LeftParenthesis ) )=> ( () otherlv_24= NoSend otherlv_25= LeftParenthesis ) ) ( (otherlv_26= RULE_ID ) ) otherlv_27= RightParenthesis )
                    // InternalGumboParser.g:5303:4: ( ( ( () NoSend LeftParenthesis ) )=> ( () otherlv_24= NoSend otherlv_25= LeftParenthesis ) ) ( (otherlv_26= RULE_ID ) ) otherlv_27= RightParenthesis
                    {
                    // InternalGumboParser.g:5303:4: ( ( ( () NoSend LeftParenthesis ) )=> ( () otherlv_24= NoSend otherlv_25= LeftParenthesis ) )
                    // InternalGumboParser.g:5304:5: ( ( () NoSend LeftParenthesis ) )=> ( () otherlv_24= NoSend otherlv_25= LeftParenthesis )
                    {
                    // InternalGumboParser.g:5311:5: ( () otherlv_24= NoSend otherlv_25= LeftParenthesis )
                    // InternalGumboParser.g:5312:6: () otherlv_24= NoSend otherlv_25= LeftParenthesis
                    {
                    // InternalGumboParser.g:5312:6: ()
                    // InternalGumboParser.g:5313:7: 
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

                    otherlv_24=(Token)match(input,NoSend,FollowSets000.FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_24, grammarAccess.getSlangTermAccess().getNoSendKeyword_5_0_0_1());
                      					
                    }
                    otherlv_25=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_25, grammarAccess.getSlangTermAccess().getLeftParenthesisKeyword_5_0_0_2());
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:5332:4: ( (otherlv_26= RULE_ID ) )
                    // InternalGumboParser.g:5333:5: (otherlv_26= RULE_ID )
                    {
                    // InternalGumboParser.g:5333:5: (otherlv_26= RULE_ID )
                    // InternalGumboParser.g:5334:6: otherlv_26= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSlangTermRule());
                      						}
                      					
                    }
                    otherlv_26=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_45); if (state.failed) return current;
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
                    // InternalGumboParser.g:5354:3: ( ( ( ( () HasEvent LeftParenthesis ) )=> ( () otherlv_29= HasEvent otherlv_30= LeftParenthesis ) ) ( (otherlv_31= RULE_ID ) ) otherlv_32= RightParenthesis )
                    {
                    // InternalGumboParser.g:5354:3: ( ( ( ( () HasEvent LeftParenthesis ) )=> ( () otherlv_29= HasEvent otherlv_30= LeftParenthesis ) ) ( (otherlv_31= RULE_ID ) ) otherlv_32= RightParenthesis )
                    // InternalGumboParser.g:5355:4: ( ( ( () HasEvent LeftParenthesis ) )=> ( () otherlv_29= HasEvent otherlv_30= LeftParenthesis ) ) ( (otherlv_31= RULE_ID ) ) otherlv_32= RightParenthesis
                    {
                    // InternalGumboParser.g:5355:4: ( ( ( () HasEvent LeftParenthesis ) )=> ( () otherlv_29= HasEvent otherlv_30= LeftParenthesis ) )
                    // InternalGumboParser.g:5356:5: ( ( () HasEvent LeftParenthesis ) )=> ( () otherlv_29= HasEvent otherlv_30= LeftParenthesis )
                    {
                    // InternalGumboParser.g:5363:5: ( () otherlv_29= HasEvent otherlv_30= LeftParenthesis )
                    // InternalGumboParser.g:5364:6: () otherlv_29= HasEvent otherlv_30= LeftParenthesis
                    {
                    // InternalGumboParser.g:5364:6: ()
                    // InternalGumboParser.g:5365:7: 
                    {
                    if ( state.backtracking==0 ) {

                      							/* */
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							current = forceCreateModelElement(
                      								grammarAccess.getSlangTermAccess().getHasEventExprAction_6_0_0_0(),
                      								current);
                      						
                    }

                    }

                    otherlv_29=(Token)match(input,HasEvent,FollowSets000.FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_29, grammarAccess.getSlangTermAccess().getHasEventKeyword_6_0_0_1());
                      					
                    }
                    otherlv_30=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_30, grammarAccess.getSlangTermAccess().getLeftParenthesisKeyword_6_0_0_2());
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:5384:4: ( (otherlv_31= RULE_ID ) )
                    // InternalGumboParser.g:5385:5: (otherlv_31= RULE_ID )
                    {
                    // InternalGumboParser.g:5385:5: (otherlv_31= RULE_ID )
                    // InternalGumboParser.g:5386:6: otherlv_31= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSlangTermRule());
                      						}
                      					
                    }
                    otherlv_31=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_31, grammarAccess.getSlangTermAccess().getEventPortPortCrossReference_6_1_0());
                      					
                    }

                    }


                    }

                    otherlv_32=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_32, grammarAccess.getSlangTermAccess().getRightParenthesisKeyword_6_2());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalGumboParser.g:5406:3: ( ( ( () ( ( ruleQCREF ) ) ( ( ruleSlangCallSuffix ) ) ) )=> ( () ( ( ruleQCREF ) ) ( (lv_callSuffix_35_0= ruleSlangCallSuffix ) ) ) )
                    {
                    // InternalGumboParser.g:5406:3: ( ( ( () ( ( ruleQCREF ) ) ( ( ruleSlangCallSuffix ) ) ) )=> ( () ( ( ruleQCREF ) ) ( (lv_callSuffix_35_0= ruleSlangCallSuffix ) ) ) )
                    // InternalGumboParser.g:5407:4: ( ( () ( ( ruleQCREF ) ) ( ( ruleSlangCallSuffix ) ) ) )=> ( () ( ( ruleQCREF ) ) ( (lv_callSuffix_35_0= ruleSlangCallSuffix ) ) )
                    {
                    // InternalGumboParser.g:5422:4: ( () ( ( ruleQCREF ) ) ( (lv_callSuffix_35_0= ruleSlangCallSuffix ) ) )
                    // InternalGumboParser.g:5423:5: () ( ( ruleQCREF ) ) ( (lv_callSuffix_35_0= ruleSlangCallSuffix ) )
                    {
                    // InternalGumboParser.g:5423:5: ()
                    // InternalGumboParser.g:5424:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElement(
                      							grammarAccess.getSlangTermAccess().getCallExprAction_7_0_0(),
                      							current);
                      					
                    }

                    }

                    // InternalGumboParser.g:5433:5: ( ( ruleQCREF ) )
                    // InternalGumboParser.g:5434:6: ( ruleQCREF )
                    {
                    // InternalGumboParser.g:5434:6: ( ruleQCREF )
                    // InternalGumboParser.g:5435:7: ruleQCREF
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

                      							newCompositeNode(grammarAccess.getSlangTermAccess().getIdEObjectCrossReference_7_0_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
                    ruleQCREF();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalGumboParser.g:5452:5: ( (lv_callSuffix_35_0= ruleSlangCallSuffix ) )
                    // InternalGumboParser.g:5453:6: (lv_callSuffix_35_0= ruleSlangCallSuffix )
                    {
                    // InternalGumboParser.g:5453:6: (lv_callSuffix_35_0= ruleSlangCallSuffix )
                    // InternalGumboParser.g:5454:7: lv_callSuffix_35_0= ruleSlangCallSuffix
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSlangTermAccess().getCallSuffixSlangCallSuffixParserRuleCall_7_0_2_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_callSuffix_35_0=ruleSlangCallSuffix();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSlangTermRule());
                      							}
                      							set(
                      								current,
                      								"callSuffix",
                      								lv_callSuffix_35_0,
                      								"org.sireum.aadl.gumbo.Gumbo.SlangCallSuffix");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalGumboParser.g:5474:3: ( ( ( ( () ( ( ruleQCLREF ) ) FullStop ) )=> ( () ( ( ruleQCLREF ) ) otherlv_38= FullStop ) ) ( (otherlv_39= RULE_ID ) ) )
                    {
                    // InternalGumboParser.g:5474:3: ( ( ( ( () ( ( ruleQCLREF ) ) FullStop ) )=> ( () ( ( ruleQCLREF ) ) otherlv_38= FullStop ) ) ( (otherlv_39= RULE_ID ) ) )
                    // InternalGumboParser.g:5475:4: ( ( ( () ( ( ruleQCLREF ) ) FullStop ) )=> ( () ( ( ruleQCLREF ) ) otherlv_38= FullStop ) ) ( (otherlv_39= RULE_ID ) )
                    {
                    // InternalGumboParser.g:5475:4: ( ( ( () ( ( ruleQCLREF ) ) FullStop ) )=> ( () ( ( ruleQCLREF ) ) otherlv_38= FullStop ) )
                    // InternalGumboParser.g:5476:5: ( ( () ( ( ruleQCLREF ) ) FullStop ) )=> ( () ( ( ruleQCLREF ) ) otherlv_38= FullStop )
                    {
                    // InternalGumboParser.g:5487:5: ( () ( ( ruleQCLREF ) ) otherlv_38= FullStop )
                    // InternalGumboParser.g:5488:6: () ( ( ruleQCLREF ) ) otherlv_38= FullStop
                    {
                    // InternalGumboParser.g:5488:6: ()
                    // InternalGumboParser.g:5489:7: 
                    {
                    if ( state.backtracking==0 ) {

                      							/* */
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							current = forceCreateModelElement(
                      								grammarAccess.getSlangTermAccess().getEnumLitExprAction_8_0_0_0(),
                      								current);
                      						
                    }

                    }

                    // InternalGumboParser.g:5498:6: ( ( ruleQCLREF ) )
                    // InternalGumboParser.g:5499:7: ( ruleQCLREF )
                    {
                    // InternalGumboParser.g:5499:7: ( ruleQCLREF )
                    // InternalGumboParser.g:5500:8: ruleQCLREF
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

                      								newCompositeNode(grammarAccess.getSlangTermAccess().getEnumTypeDataClassifierCrossReference_8_0_0_1_0());
                      							
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

                    otherlv_38=(Token)match(input,FullStop,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_38, grammarAccess.getSlangTermAccess().getFullStopKeyword_8_0_0_2());
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:5523:4: ( (otherlv_39= RULE_ID ) )
                    // InternalGumboParser.g:5524:5: (otherlv_39= RULE_ID )
                    {
                    // InternalGumboParser.g:5524:5: (otherlv_39= RULE_ID )
                    // InternalGumboParser.g:5525:6: otherlv_39= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSlangTermRule());
                      						}
                      					
                    }
                    otherlv_39=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_39, grammarAccess.getSlangTermAccess().getValueStringLiteralCrossReference_8_1_0());
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // InternalGumboParser.g:5541:3: ( ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_41_0= ruleDataElement ) ) otherlv_42= LeftCurlyBracket ( (otherlv_43= RULE_ID ) ) otherlv_44= EqualsSign ) ) ( (lv_argExpr_45_0= ruleExpr ) ) (otherlv_46= Semicolon ( (otherlv_47= RULE_ID ) ) otherlv_48= EqualsSign ( (lv_argExpr_49_0= ruleExpr ) ) )* otherlv_50= RightCurlyBracket )
                    {
                    // InternalGumboParser.g:5541:3: ( ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_41_0= ruleDataElement ) ) otherlv_42= LeftCurlyBracket ( (otherlv_43= RULE_ID ) ) otherlv_44= EqualsSign ) ) ( (lv_argExpr_45_0= ruleExpr ) ) (otherlv_46= Semicolon ( (otherlv_47= RULE_ID ) ) otherlv_48= EqualsSign ( (lv_argExpr_49_0= ruleExpr ) ) )* otherlv_50= RightCurlyBracket )
                    // InternalGumboParser.g:5542:4: ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_41_0= ruleDataElement ) ) otherlv_42= LeftCurlyBracket ( (otherlv_43= RULE_ID ) ) otherlv_44= EqualsSign ) ) ( (lv_argExpr_45_0= ruleExpr ) ) (otherlv_46= Semicolon ( (otherlv_47= RULE_ID ) ) otherlv_48= EqualsSign ( (lv_argExpr_49_0= ruleExpr ) ) )* otherlv_50= RightCurlyBracket
                    {
                    // InternalGumboParser.g:5542:4: ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_41_0= ruleDataElement ) ) otherlv_42= LeftCurlyBracket ( (otherlv_43= RULE_ID ) ) otherlv_44= EqualsSign ) )
                    // InternalGumboParser.g:5543:5: ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_41_0= ruleDataElement ) ) otherlv_42= LeftCurlyBracket ( (otherlv_43= RULE_ID ) ) otherlv_44= EqualsSign )
                    {
                    // InternalGumboParser.g:5560:5: ( () ( (lv_recordType_41_0= ruleDataElement ) ) otherlv_42= LeftCurlyBracket ( (otherlv_43= RULE_ID ) ) otherlv_44= EqualsSign )
                    // InternalGumboParser.g:5561:6: () ( (lv_recordType_41_0= ruleDataElement ) ) otherlv_42= LeftCurlyBracket ( (otherlv_43= RULE_ID ) ) otherlv_44= EqualsSign
                    {
                    // InternalGumboParser.g:5561:6: ()
                    // InternalGumboParser.g:5562:7: 
                    {
                    if ( state.backtracking==0 ) {

                      							/* */
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							current = forceCreateModelElement(
                      								grammarAccess.getSlangTermAccess().getRecordLitExprAction_9_0_0_0(),
                      								current);
                      						
                    }

                    }

                    // InternalGumboParser.g:5571:6: ( (lv_recordType_41_0= ruleDataElement ) )
                    // InternalGumboParser.g:5572:7: (lv_recordType_41_0= ruleDataElement )
                    {
                    // InternalGumboParser.g:5572:7: (lv_recordType_41_0= ruleDataElement )
                    // InternalGumboParser.g:5573:8: lv_recordType_41_0= ruleDataElement
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getSlangTermAccess().getRecordTypeDataElementParserRuleCall_9_0_0_1_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_56);
                    lv_recordType_41_0=ruleDataElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getSlangTermRule());
                      								}
                      								set(
                      									current,
                      									"recordType",
                      									lv_recordType_41_0,
                      									"org.sireum.aadl.gumbo.Gumbo.DataElement");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }

                    otherlv_42=(Token)match(input,LeftCurlyBracket,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_42, grammarAccess.getSlangTermAccess().getLeftCurlyBracketKeyword_9_0_0_2());
                      					
                    }
                    // InternalGumboParser.g:5594:6: ( (otherlv_43= RULE_ID ) )
                    // InternalGumboParser.g:5595:7: (otherlv_43= RULE_ID )
                    {
                    // InternalGumboParser.g:5595:7: (otherlv_43= RULE_ID )
                    // InternalGumboParser.g:5596:8: otherlv_43= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      								/* */
                      							
                    }
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElement(grammarAccess.getSlangTermRule());
                      								}
                      							
                    }
                    otherlv_43=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_83); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								newLeafNode(otherlv_43, grammarAccess.getSlangTermAccess().getArgsNamedElementCrossReference_9_0_0_3_0());
                      							
                    }

                    }


                    }

                    otherlv_44=(Token)match(input,EqualsSign,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_44, grammarAccess.getSlangTermAccess().getEqualsSignKeyword_9_0_0_4());
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:5616:4: ( (lv_argExpr_45_0= ruleExpr ) )
                    // InternalGumboParser.g:5617:5: (lv_argExpr_45_0= ruleExpr )
                    {
                    // InternalGumboParser.g:5617:5: (lv_argExpr_45_0= ruleExpr )
                    // InternalGumboParser.g:5618:6: lv_argExpr_45_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangTermAccess().getArgExprExprParserRuleCall_9_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_84);
                    lv_argExpr_45_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlangTermRule());
                      						}
                      						add(
                      							current,
                      							"argExpr",
                      							lv_argExpr_45_0,
                      							"org.sireum.aadl.gumbo.Gumbo.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:5635:4: (otherlv_46= Semicolon ( (otherlv_47= RULE_ID ) ) otherlv_48= EqualsSign ( (lv_argExpr_49_0= ruleExpr ) ) )*
                    loop102:
                    do {
                        int alt102=2;
                        int LA102_0 = input.LA(1);

                        if ( (LA102_0==Semicolon) ) {
                            alt102=1;
                        }


                        switch (alt102) {
                    	case 1 :
                    	    // InternalGumboParser.g:5636:5: otherlv_46= Semicolon ( (otherlv_47= RULE_ID ) ) otherlv_48= EqualsSign ( (lv_argExpr_49_0= ruleExpr ) )
                    	    {
                    	    otherlv_46=(Token)match(input,Semicolon,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_46, grammarAccess.getSlangTermAccess().getSemicolonKeyword_9_2_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:5640:5: ( (otherlv_47= RULE_ID ) )
                    	    // InternalGumboParser.g:5641:6: (otherlv_47= RULE_ID )
                    	    {
                    	    // InternalGumboParser.g:5641:6: (otherlv_47= RULE_ID )
                    	    // InternalGumboParser.g:5642:7: otherlv_47= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							/* */
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getSlangTermRule());
                    	      							}
                    	      						
                    	    }
                    	    otherlv_47=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_83); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_47, grammarAccess.getSlangTermAccess().getArgsNamedElementCrossReference_9_2_1_0());
                    	      						
                    	    }

                    	    }


                    	    }

                    	    otherlv_48=(Token)match(input,EqualsSign,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_48, grammarAccess.getSlangTermAccess().getEqualsSignKeyword_9_2_2());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:5660:5: ( (lv_argExpr_49_0= ruleExpr ) )
                    	    // InternalGumboParser.g:5661:6: (lv_argExpr_49_0= ruleExpr )
                    	    {
                    	    // InternalGumboParser.g:5661:6: (lv_argExpr_49_0= ruleExpr )
                    	    // InternalGumboParser.g:5662:7: lv_argExpr_49_0= ruleExpr
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSlangTermAccess().getArgExprExprParserRuleCall_9_2_3_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_84);
                    	    lv_argExpr_49_0=ruleExpr();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSlangTermRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"argExpr",
                    	      								lv_argExpr_49_0,
                    	      								"org.sireum.aadl.gumbo.Gumbo.Expr");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop102;
                        }
                    } while (true);

                    otherlv_50=(Token)match(input,RightCurlyBracket,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_50, grammarAccess.getSlangTermAccess().getRightCurlyBracketKeyword_9_3());
                      			
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalGumboParser.g:5686:3: ( () ( (otherlv_52= RULE_ID ) ) (otherlv_53= FullStop ( (lv_ref_54_0= ruleOtherDataRef ) ) )? )
                    {
                    // InternalGumboParser.g:5686:3: ( () ( (otherlv_52= RULE_ID ) ) (otherlv_53= FullStop ( (lv_ref_54_0= ruleOtherDataRef ) ) )? )
                    // InternalGumboParser.g:5687:4: () ( (otherlv_52= RULE_ID ) ) (otherlv_53= FullStop ( (lv_ref_54_0= ruleOtherDataRef ) ) )?
                    {
                    // InternalGumboParser.g:5687:4: ()
                    // InternalGumboParser.g:5688:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangTermAccess().getDataRefExprAction_10_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:5697:4: ( (otherlv_52= RULE_ID ) )
                    // InternalGumboParser.g:5698:5: (otherlv_52= RULE_ID )
                    {
                    // InternalGumboParser.g:5698:5: (otherlv_52= RULE_ID )
                    // InternalGumboParser.g:5699:6: otherlv_52= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSlangTermRule());
                      						}
                      					
                    }
                    otherlv_52=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_54); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_52, grammarAccess.getSlangTermAccess().getPortOrSubcomponentOrStateVarEObjectCrossReference_10_1_0());
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:5713:4: (otherlv_53= FullStop ( (lv_ref_54_0= ruleOtherDataRef ) ) )?
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==FullStop) ) {
                        int LA103_1 = input.LA(2);

                        if ( (LA103_1==RULE_ID) ) {
                            int LA103_3 = input.LA(3);

                            if ( (synpred135_InternalGumboParser()) ) {
                                alt103=1;
                            }
                        }
                    }
                    switch (alt103) {
                        case 1 :
                            // InternalGumboParser.g:5714:5: otherlv_53= FullStop ( (lv_ref_54_0= ruleOtherDataRef ) )
                            {
                            otherlv_53=(Token)match(input,FullStop,FollowSets000.FOLLOW_8); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_53, grammarAccess.getSlangTermAccess().getFullStopKeyword_10_2_0());
                              				
                            }
                            // InternalGumboParser.g:5718:5: ( (lv_ref_54_0= ruleOtherDataRef ) )
                            // InternalGumboParser.g:5719:6: (lv_ref_54_0= ruleOtherDataRef )
                            {
                            // InternalGumboParser.g:5719:6: (lv_ref_54_0= ruleOtherDataRef )
                            // InternalGumboParser.g:5720:7: lv_ref_54_0= ruleOtherDataRef
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSlangTermAccess().getRefOtherDataRefParserRuleCall_10_2_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_ref_54_0=ruleOtherDataRef();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getSlangTermRule());
                              							}
                              							set(
                              								current,
                              								"ref",
                              								lv_ref_54_0,
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
                case 12 :
                    // InternalGumboParser.g:5740:3: ( () otherlv_56= LeftParenthesis ( (lv_exp_57_0= ruleExpr ) ) otherlv_58= RightParenthesis )
                    {
                    // InternalGumboParser.g:5740:3: ( () otherlv_56= LeftParenthesis ( (lv_exp_57_0= ruleExpr ) ) otherlv_58= RightParenthesis )
                    // InternalGumboParser.g:5741:4: () otherlv_56= LeftParenthesis ( (lv_exp_57_0= ruleExpr ) ) otherlv_58= RightParenthesis
                    {
                    // InternalGumboParser.g:5741:4: ()
                    // InternalGumboParser.g:5742:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangTermAccess().getParenExprAction_11_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_56=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_56, grammarAccess.getSlangTermAccess().getLeftParenthesisKeyword_11_1());
                      			
                    }
                    // InternalGumboParser.g:5755:4: ( (lv_exp_57_0= ruleExpr ) )
                    // InternalGumboParser.g:5756:5: (lv_exp_57_0= ruleExpr )
                    {
                    // InternalGumboParser.g:5756:5: (lv_exp_57_0= ruleExpr )
                    // InternalGumboParser.g:5757:6: lv_exp_57_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangTermAccess().getExpExprParserRuleCall_11_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_45);
                    lv_exp_57_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlangTermRule());
                      						}
                      						set(
                      							current,
                      							"exp",
                      							lv_exp_57_0,
                      							"org.sireum.aadl.gumbo.Gumbo.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_58=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_58, grammarAccess.getSlangTermAccess().getRightParenthesisKeyword_11_3());
                      			
                    }

                    }


                    }
                    break;
                case 13 :
                    // InternalGumboParser.g:5780:3: ( () otherlv_60= For ( (lv_r_61_0= ruleSlangForRange ) ) (otherlv_62= Comma ( (lv_r_63_0= ruleSlangForRange ) ) )* otherlv_64= Yield ( ( (lv_b_65_0= ruleSlangBlock ) ) | (otherlv_66= LeftParenthesis ( (lv_e_67_0= ruleExpr ) ) otherlv_68= RightParenthesis ) ) )
                    {
                    // InternalGumboParser.g:5780:3: ( () otherlv_60= For ( (lv_r_61_0= ruleSlangForRange ) ) (otherlv_62= Comma ( (lv_r_63_0= ruleSlangForRange ) ) )* otherlv_64= Yield ( ( (lv_b_65_0= ruleSlangBlock ) ) | (otherlv_66= LeftParenthesis ( (lv_e_67_0= ruleExpr ) ) otherlv_68= RightParenthesis ) ) )
                    // InternalGumboParser.g:5781:4: () otherlv_60= For ( (lv_r_61_0= ruleSlangForRange ) ) (otherlv_62= Comma ( (lv_r_63_0= ruleSlangForRange ) ) )* otherlv_64= Yield ( ( (lv_b_65_0= ruleSlangBlock ) ) | (otherlv_66= LeftParenthesis ( (lv_e_67_0= ruleExpr ) ) otherlv_68= RightParenthesis ) )
                    {
                    // InternalGumboParser.g:5781:4: ()
                    // InternalGumboParser.g:5782:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangTermAccess().getSlangForTermAction_12_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_60=(Token)match(input,For,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_60, grammarAccess.getSlangTermAccess().getForKeyword_12_1());
                      			
                    }
                    // InternalGumboParser.g:5795:4: ( (lv_r_61_0= ruleSlangForRange ) )
                    // InternalGumboParser.g:5796:5: (lv_r_61_0= ruleSlangForRange )
                    {
                    // InternalGumboParser.g:5796:5: (lv_r_61_0= ruleSlangForRange )
                    // InternalGumboParser.g:5797:6: lv_r_61_0= ruleSlangForRange
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangTermAccess().getRSlangForRangeParserRuleCall_12_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_85);
                    lv_r_61_0=ruleSlangForRange();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlangTermRule());
                      						}
                      						add(
                      							current,
                      							"r",
                      							lv_r_61_0,
                      							"org.sireum.aadl.gumbo.Gumbo.SlangForRange");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:5814:4: (otherlv_62= Comma ( (lv_r_63_0= ruleSlangForRange ) ) )*
                    loop104:
                    do {
                        int alt104=2;
                        int LA104_0 = input.LA(1);

                        if ( (LA104_0==Comma) ) {
                            alt104=1;
                        }


                        switch (alt104) {
                    	case 1 :
                    	    // InternalGumboParser.g:5815:5: otherlv_62= Comma ( (lv_r_63_0= ruleSlangForRange ) )
                    	    {
                    	    otherlv_62=(Token)match(input,Comma,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_62, grammarAccess.getSlangTermAccess().getCommaKeyword_12_3_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:5819:5: ( (lv_r_63_0= ruleSlangForRange ) )
                    	    // InternalGumboParser.g:5820:6: (lv_r_63_0= ruleSlangForRange )
                    	    {
                    	    // InternalGumboParser.g:5820:6: (lv_r_63_0= ruleSlangForRange )
                    	    // InternalGumboParser.g:5821:7: lv_r_63_0= ruleSlangForRange
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSlangTermAccess().getRSlangForRangeParserRuleCall_12_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_85);
                    	    lv_r_63_0=ruleSlangForRange();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSlangTermRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"r",
                    	      								lv_r_63_0,
                    	      								"org.sireum.aadl.gumbo.Gumbo.SlangForRange");
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

                    otherlv_64=(Token)match(input,Yield,FollowSets000.FOLLOW_86); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_64, grammarAccess.getSlangTermAccess().getYieldKeyword_12_4());
                      			
                    }
                    // InternalGumboParser.g:5843:4: ( ( (lv_b_65_0= ruleSlangBlock ) ) | (otherlv_66= LeftParenthesis ( (lv_e_67_0= ruleExpr ) ) otherlv_68= RightParenthesis ) )
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==LeftCurlyBracket) ) {
                        alt105=1;
                    }
                    else if ( (LA105_0==LeftParenthesis) ) {
                        alt105=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 105, 0, input);

                        throw nvae;
                    }
                    switch (alt105) {
                        case 1 :
                            // InternalGumboParser.g:5844:5: ( (lv_b_65_0= ruleSlangBlock ) )
                            {
                            // InternalGumboParser.g:5844:5: ( (lv_b_65_0= ruleSlangBlock ) )
                            // InternalGumboParser.g:5845:6: (lv_b_65_0= ruleSlangBlock )
                            {
                            // InternalGumboParser.g:5845:6: (lv_b_65_0= ruleSlangBlock )
                            // InternalGumboParser.g:5846:7: lv_b_65_0= ruleSlangBlock
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSlangTermAccess().getBSlangBlockParserRuleCall_12_5_0_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_b_65_0=ruleSlangBlock();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getSlangTermRule());
                              							}
                              							set(
                              								current,
                              								"b",
                              								lv_b_65_0,
                              								"org.sireum.aadl.gumbo.Gumbo.SlangBlock");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalGumboParser.g:5864:5: (otherlv_66= LeftParenthesis ( (lv_e_67_0= ruleExpr ) ) otherlv_68= RightParenthesis )
                            {
                            // InternalGumboParser.g:5864:5: (otherlv_66= LeftParenthesis ( (lv_e_67_0= ruleExpr ) ) otherlv_68= RightParenthesis )
                            // InternalGumboParser.g:5865:6: otherlv_66= LeftParenthesis ( (lv_e_67_0= ruleExpr ) ) otherlv_68= RightParenthesis
                            {
                            otherlv_66=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_66, grammarAccess.getSlangTermAccess().getLeftParenthesisKeyword_12_5_1_0());
                              					
                            }
                            // InternalGumboParser.g:5869:6: ( (lv_e_67_0= ruleExpr ) )
                            // InternalGumboParser.g:5870:7: (lv_e_67_0= ruleExpr )
                            {
                            // InternalGumboParser.g:5870:7: (lv_e_67_0= ruleExpr )
                            // InternalGumboParser.g:5871:8: lv_e_67_0= ruleExpr
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getSlangTermAccess().getEExprParserRuleCall_12_5_1_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_45);
                            lv_e_67_0=ruleExpr();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getSlangTermRule());
                              								}
                              								set(
                              									current,
                              									"e",
                              									lv_e_67_0,
                              									"org.sireum.aadl.gumbo.Gumbo.Expr");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            otherlv_68=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_68, grammarAccess.getSlangTermAccess().getRightParenthesisKeyword_12_5_1_2());
                              					
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 14 :
                    // InternalGumboParser.g:5896:3: ( () otherlv_70= LeftCurlyBracket ( ( ( ( (lv_p_71_0= ruleSlangParams ) ) otherlv_72= EqualsSignGreaterThanSign )? ( (lv_e_73_0= ruleExpr ) ) otherlv_74= RightCurlyBracket ) | ( ( (lv_stmt_75_0= ruleSlangStmt ) )* ( (lv_r_76_0= ruleSlangRet ) )? otherlv_77= RightCurlyBracket ) ) )
                    {
                    // InternalGumboParser.g:5896:3: ( () otherlv_70= LeftCurlyBracket ( ( ( ( (lv_p_71_0= ruleSlangParams ) ) otherlv_72= EqualsSignGreaterThanSign )? ( (lv_e_73_0= ruleExpr ) ) otherlv_74= RightCurlyBracket ) | ( ( (lv_stmt_75_0= ruleSlangStmt ) )* ( (lv_r_76_0= ruleSlangRet ) )? otherlv_77= RightCurlyBracket ) ) )
                    // InternalGumboParser.g:5897:4: () otherlv_70= LeftCurlyBracket ( ( ( ( (lv_p_71_0= ruleSlangParams ) ) otherlv_72= EqualsSignGreaterThanSign )? ( (lv_e_73_0= ruleExpr ) ) otherlv_74= RightCurlyBracket ) | ( ( (lv_stmt_75_0= ruleSlangStmt ) )* ( (lv_r_76_0= ruleSlangRet ) )? otherlv_77= RightCurlyBracket ) )
                    {
                    // InternalGumboParser.g:5897:4: ()
                    // InternalGumboParser.g:5898:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangTermAccess().getSlangBlockTermAction_13_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_70=(Token)match(input,LeftCurlyBracket,FollowSets000.FOLLOW_87); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_70, grammarAccess.getSlangTermAccess().getLeftCurlyBracketKeyword_13_1());
                      			
                    }
                    // InternalGumboParser.g:5911:4: ( ( ( ( (lv_p_71_0= ruleSlangParams ) ) otherlv_72= EqualsSignGreaterThanSign )? ( (lv_e_73_0= ruleExpr ) ) otherlv_74= RightCurlyBracket ) | ( ( (lv_stmt_75_0= ruleSlangStmt ) )* ( (lv_r_76_0= ruleSlangRet ) )? otherlv_77= RightCurlyBracket ) )
                    int alt109=2;
                    alt109 = dfa109.predict(input);
                    switch (alt109) {
                        case 1 :
                            // InternalGumboParser.g:5912:5: ( ( ( (lv_p_71_0= ruleSlangParams ) ) otherlv_72= EqualsSignGreaterThanSign )? ( (lv_e_73_0= ruleExpr ) ) otherlv_74= RightCurlyBracket )
                            {
                            // InternalGumboParser.g:5912:5: ( ( ( (lv_p_71_0= ruleSlangParams ) ) otherlv_72= EqualsSignGreaterThanSign )? ( (lv_e_73_0= ruleExpr ) ) otherlv_74= RightCurlyBracket )
                            // InternalGumboParser.g:5913:6: ( ( (lv_p_71_0= ruleSlangParams ) ) otherlv_72= EqualsSignGreaterThanSign )? ( (lv_e_73_0= ruleExpr ) ) otherlv_74= RightCurlyBracket
                            {
                            // InternalGumboParser.g:5913:6: ( ( (lv_p_71_0= ruleSlangParams ) ) otherlv_72= EqualsSignGreaterThanSign )?
                            int alt106=2;
                            int LA106_0 = input.LA(1);

                            if ( (LA106_0==LeftParenthesis) ) {
                                int LA106_1 = input.LA(2);

                                if ( (LA106_1==Var) ) {
                                    alt106=1;
                                }
                                else if ( (LA106_1==RULE_ID) ) {
                                    int LA106_4 = input.LA(3);

                                    if ( (LA106_4==Colon) ) {
                                        alt106=1;
                                    }
                                }
                            }
                            switch (alt106) {
                                case 1 :
                                    // InternalGumboParser.g:5914:7: ( (lv_p_71_0= ruleSlangParams ) ) otherlv_72= EqualsSignGreaterThanSign
                                    {
                                    // InternalGumboParser.g:5914:7: ( (lv_p_71_0= ruleSlangParams ) )
                                    // InternalGumboParser.g:5915:8: (lv_p_71_0= ruleSlangParams )
                                    {
                                    // InternalGumboParser.g:5915:8: (lv_p_71_0= ruleSlangParams )
                                    // InternalGumboParser.g:5916:9: lv_p_71_0= ruleSlangParams
                                    {
                                    if ( state.backtracking==0 ) {

                                      									newCompositeNode(grammarAccess.getSlangTermAccess().getPSlangParamsParserRuleCall_13_2_0_0_0_0());
                                      								
                                    }
                                    pushFollow(FollowSets000.FOLLOW_68);
                                    lv_p_71_0=ruleSlangParams();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElementForParent(grammarAccess.getSlangTermRule());
                                      									}
                                      									set(
                                      										current,
                                      										"p",
                                      										lv_p_71_0,
                                      										"org.sireum.aadl.gumbo.Gumbo.SlangParams");
                                      									afterParserOrEnumRuleCall();
                                      								
                                    }

                                    }


                                    }

                                    otherlv_72=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_15); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(otherlv_72, grammarAccess.getSlangTermAccess().getEqualsSignGreaterThanSignKeyword_13_2_0_0_1());
                                      						
                                    }

                                    }
                                    break;

                            }

                            // InternalGumboParser.g:5938:6: ( (lv_e_73_0= ruleExpr ) )
                            // InternalGumboParser.g:5939:7: (lv_e_73_0= ruleExpr )
                            {
                            // InternalGumboParser.g:5939:7: (lv_e_73_0= ruleExpr )
                            // InternalGumboParser.g:5940:8: lv_e_73_0= ruleExpr
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getSlangTermAccess().getEExprParserRuleCall_13_2_0_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_81);
                            lv_e_73_0=ruleExpr();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getSlangTermRule());
                              								}
                              								set(
                              									current,
                              									"e",
                              									lv_e_73_0,
                              									"org.sireum.aadl.gumbo.Gumbo.Expr");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            otherlv_74=(Token)match(input,RightCurlyBracket,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_74, grammarAccess.getSlangTermAccess().getRightCurlyBracketKeyword_13_2_0_2());
                              					
                            }

                            }


                            }
                            break;
                        case 2 :
                            // InternalGumboParser.g:5963:5: ( ( (lv_stmt_75_0= ruleSlangStmt ) )* ( (lv_r_76_0= ruleSlangRet ) )? otherlv_77= RightCurlyBracket )
                            {
                            // InternalGumboParser.g:5963:5: ( ( (lv_stmt_75_0= ruleSlangStmt ) )* ( (lv_r_76_0= ruleSlangRet ) )? otherlv_77= RightCurlyBracket )
                            // InternalGumboParser.g:5964:6: ( (lv_stmt_75_0= ruleSlangStmt ) )* ( (lv_r_76_0= ruleSlangRet ) )? otherlv_77= RightCurlyBracket
                            {
                            // InternalGumboParser.g:5964:6: ( (lv_stmt_75_0= ruleSlangStmt ) )*
                            loop107:
                            do {
                                int alt107=2;
                                int LA107_0 = input.LA(1);

                                if ( ((LA107_0>=Assert && LA107_0<=Assume)||LA107_0==Match||LA107_0==While||(LA107_0>=Halt && LA107_0<=Spec)||(LA107_0>=Val && LA107_0<=Var)||(LA107_0>=Do && LA107_0<=If)||LA107_0==RULE_ID) ) {
                                    alt107=1;
                                }


                                switch (alt107) {
                            	case 1 :
                            	    // InternalGumboParser.g:5965:7: (lv_stmt_75_0= ruleSlangStmt )
                            	    {
                            	    // InternalGumboParser.g:5965:7: (lv_stmt_75_0= ruleSlangStmt )
                            	    // InternalGumboParser.g:5966:8: lv_stmt_75_0= ruleSlangStmt
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getSlangTermAccess().getStmtSlangStmtParserRuleCall_13_2_1_0_0());
                            	      							
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_80);
                            	    lv_stmt_75_0=ruleSlangStmt();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getSlangTermRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"stmt",
                            	      									lv_stmt_75_0,
                            	      									"org.sireum.aadl.gumbo.Gumbo.SlangStmt");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop107;
                                }
                            } while (true);

                            // InternalGumboParser.g:5983:6: ( (lv_r_76_0= ruleSlangRet ) )?
                            int alt108=2;
                            int LA108_0 = input.LA(1);

                            if ( (LA108_0==Return) ) {
                                alt108=1;
                            }
                            switch (alt108) {
                                case 1 :
                                    // InternalGumboParser.g:5984:7: (lv_r_76_0= ruleSlangRet )
                                    {
                                    // InternalGumboParser.g:5984:7: (lv_r_76_0= ruleSlangRet )
                                    // InternalGumboParser.g:5985:8: lv_r_76_0= ruleSlangRet
                                    {
                                    if ( state.backtracking==0 ) {

                                      								newCompositeNode(grammarAccess.getSlangTermAccess().getRSlangRetParserRuleCall_13_2_1_1_0());
                                      							
                                    }
                                    pushFollow(FollowSets000.FOLLOW_81);
                                    lv_r_76_0=ruleSlangRet();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								if (current==null) {
                                      									current = createModelElementForParent(grammarAccess.getSlangTermRule());
                                      								}
                                      								set(
                                      									current,
                                      									"r",
                                      									lv_r_76_0,
                                      									"org.sireum.aadl.gumbo.Gumbo.SlangRet");
                                      								afterParserOrEnumRuleCall();
                                      							
                                    }

                                    }


                                    }
                                    break;

                            }

                            otherlv_77=(Token)match(input,RightCurlyBracket,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_77, grammarAccess.getSlangTermAccess().getRightCurlyBracketKeyword_13_2_1_2());
                              					
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
    // InternalGumboParser.g:6013:1: entryRuleSlangParams returns [EObject current=null] : iv_ruleSlangParams= ruleSlangParams EOF ;
    public final EObject entryRuleSlangParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangParams = null;


        try {
            // InternalGumboParser.g:6013:52: (iv_ruleSlangParams= ruleSlangParams EOF )
            // InternalGumboParser.g:6014:2: iv_ruleSlangParams= ruleSlangParams EOF
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
    // InternalGumboParser.g:6020:1: ruleSlangParams returns [EObject current=null] : (otherlv_0= LeftParenthesis ( (lv_params_1_0= ruleSlangParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangParam ) ) )? otherlv_4= RightParenthesis ) ;
    public final EObject ruleSlangParams() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_params_1_0 = null;

        EObject lv_params_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:6026:2: ( (otherlv_0= LeftParenthesis ( (lv_params_1_0= ruleSlangParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangParam ) ) )? otherlv_4= RightParenthesis ) )
            // InternalGumboParser.g:6027:2: (otherlv_0= LeftParenthesis ( (lv_params_1_0= ruleSlangParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangParam ) ) )? otherlv_4= RightParenthesis )
            {
            // InternalGumboParser.g:6027:2: (otherlv_0= LeftParenthesis ( (lv_params_1_0= ruleSlangParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangParam ) ) )? otherlv_4= RightParenthesis )
            // InternalGumboParser.g:6028:3: otherlv_0= LeftParenthesis ( (lv_params_1_0= ruleSlangParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangParam ) ) )? otherlv_4= RightParenthesis
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_88); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangParamsAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalGumboParser.g:6032:3: ( (lv_params_1_0= ruleSlangParam ) )
            // InternalGumboParser.g:6033:4: (lv_params_1_0= ruleSlangParam )
            {
            // InternalGumboParser.g:6033:4: (lv_params_1_0= ruleSlangParam )
            // InternalGumboParser.g:6034:5: lv_params_1_0= ruleSlangParam
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangParamsAccess().getParamsSlangParamParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_29);
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

            // InternalGumboParser.g:6051:3: (otherlv_2= Comma ( (lv_params_3_0= ruleSlangParam ) ) )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==Comma) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // InternalGumboParser.g:6052:4: otherlv_2= Comma ( (lv_params_3_0= ruleSlangParam ) )
                    {
                    otherlv_2=(Token)match(input,Comma,FollowSets000.FOLLOW_88); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSlangParamsAccess().getCommaKeyword_2_0());
                      			
                    }
                    // InternalGumboParser.g:6056:4: ( (lv_params_3_0= ruleSlangParam ) )
                    // InternalGumboParser.g:6057:5: (lv_params_3_0= ruleSlangParam )
                    {
                    // InternalGumboParser.g:6057:5: (lv_params_3_0= ruleSlangParam )
                    // InternalGumboParser.g:6058:6: lv_params_3_0= ruleSlangParam
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangParamsAccess().getParamsSlangParamParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_45);
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
    // InternalGumboParser.g:6084:1: entryRuleSlangParam returns [EObject current=null] : iv_ruleSlangParam= ruleSlangParam EOF ;
    public final EObject entryRuleSlangParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangParam = null;


        try {
            // InternalGumboParser.g:6084:51: (iv_ruleSlangParam= ruleSlangParam EOF )
            // InternalGumboParser.g:6085:2: iv_ruleSlangParam= ruleSlangParam EOF
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
    // InternalGumboParser.g:6091:1: ruleSlangParam returns [EObject current=null] : ( (otherlv_0= Var )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon (otherlv_3= EqualsSignGreaterThanSign )? ( (lv_typeName_4_0= ruleSlangType ) ) (otherlv_5= Asterisk )? ) ;
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
            // InternalGumboParser.g:6097:2: ( ( (otherlv_0= Var )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon (otherlv_3= EqualsSignGreaterThanSign )? ( (lv_typeName_4_0= ruleSlangType ) ) (otherlv_5= Asterisk )? ) )
            // InternalGumboParser.g:6098:2: ( (otherlv_0= Var )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon (otherlv_3= EqualsSignGreaterThanSign )? ( (lv_typeName_4_0= ruleSlangType ) ) (otherlv_5= Asterisk )? )
            {
            // InternalGumboParser.g:6098:2: ( (otherlv_0= Var )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon (otherlv_3= EqualsSignGreaterThanSign )? ( (lv_typeName_4_0= ruleSlangType ) ) (otherlv_5= Asterisk )? )
            // InternalGumboParser.g:6099:3: (otherlv_0= Var )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon (otherlv_3= EqualsSignGreaterThanSign )? ( (lv_typeName_4_0= ruleSlangType ) ) (otherlv_5= Asterisk )?
            {
            // InternalGumboParser.g:6099:3: (otherlv_0= Var )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==Var) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // InternalGumboParser.g:6100:4: otherlv_0= Var
                    {
                    otherlv_0=(Token)match(input,Var,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getSlangParamAccess().getVarKeyword_0());
                      			
                    }

                    }
                    break;

            }

            // InternalGumboParser.g:6105:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGumboParser.g:6106:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGumboParser.g:6106:4: (lv_name_1_0= RULE_ID )
            // InternalGumboParser.g:6107:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,Colon,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSlangParamAccess().getColonKeyword_2());
              		
            }
            // InternalGumboParser.g:6127:3: (otherlv_3= EqualsSignGreaterThanSign )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==EqualsSignGreaterThanSign) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // InternalGumboParser.g:6128:4: otherlv_3= EqualsSignGreaterThanSign
                    {
                    otherlv_3=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getSlangParamAccess().getEqualsSignGreaterThanSignKeyword_3());
                      			
                    }

                    }
                    break;

            }

            // InternalGumboParser.g:6133:3: ( (lv_typeName_4_0= ruleSlangType ) )
            // InternalGumboParser.g:6134:4: (lv_typeName_4_0= ruleSlangType )
            {
            // InternalGumboParser.g:6134:4: (lv_typeName_4_0= ruleSlangType )
            // InternalGumboParser.g:6135:5: lv_typeName_4_0= ruleSlangType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangParamAccess().getTypeNameSlangTypeParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_47);
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

            // InternalGumboParser.g:6152:3: (otherlv_5= Asterisk )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==Asterisk) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalGumboParser.g:6153:4: otherlv_5= Asterisk
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
    // InternalGumboParser.g:6162:1: entryRuleSlangForRange returns [EObject current=null] : iv_ruleSlangForRange= ruleSlangForRange EOF ;
    public final EObject entryRuleSlangForRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangForRange = null;


        try {
            // InternalGumboParser.g:6162:54: (iv_ruleSlangForRange= ruleSlangForRange EOF )
            // InternalGumboParser.g:6163:2: iv_ruleSlangForRange= ruleSlangForRange EOF
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
    // InternalGumboParser.g:6169:1: ruleSlangForRange returns [EObject current=null] : (this_ID_0= RULE_ID otherlv_1= Colon ( (lv_e_2_0= ruleExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upper_5_0= ruleExpr ) ) (otherlv_6= By ( (lv_step_7_0= ruleExpr ) ) )? )? ) ;
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
            // InternalGumboParser.g:6175:2: ( (this_ID_0= RULE_ID otherlv_1= Colon ( (lv_e_2_0= ruleExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upper_5_0= ruleExpr ) ) (otherlv_6= By ( (lv_step_7_0= ruleExpr ) ) )? )? ) )
            // InternalGumboParser.g:6176:2: (this_ID_0= RULE_ID otherlv_1= Colon ( (lv_e_2_0= ruleExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upper_5_0= ruleExpr ) ) (otherlv_6= By ( (lv_step_7_0= ruleExpr ) ) )? )? )
            {
            // InternalGumboParser.g:6176:2: (this_ID_0= RULE_ID otherlv_1= Colon ( (lv_e_2_0= ruleExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upper_5_0= ruleExpr ) ) (otherlv_6= By ( (lv_step_7_0= ruleExpr ) ) )? )? )
            // InternalGumboParser.g:6177:3: this_ID_0= RULE_ID otherlv_1= Colon ( (lv_e_2_0= ruleExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upper_5_0= ruleExpr ) ) (otherlv_6= By ( (lv_step_7_0= ruleExpr ) ) )? )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getSlangForRangeAccess().getIDTerminalRuleCall_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSlangForRangeAccess().getColonKeyword_1());
              		
            }
            // InternalGumboParser.g:6185:3: ( (lv_e_2_0= ruleExpr ) )
            // InternalGumboParser.g:6186:4: (lv_e_2_0= ruleExpr )
            {
            // InternalGumboParser.g:6186:4: (lv_e_2_0= ruleExpr )
            // InternalGumboParser.g:6187:5: lv_e_2_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangForRangeAccess().getEExprParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_79);
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

            // InternalGumboParser.g:6204:3: ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upper_5_0= ruleExpr ) ) (otherlv_6= By ( (lv_step_7_0= ruleExpr ) ) )? )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==FullStopFullStopLessThanSign||LA117_0==FullStopFullStop) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // InternalGumboParser.g:6205:4: (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upper_5_0= ruleExpr ) ) (otherlv_6= By ( (lv_step_7_0= ruleExpr ) ) )?
                    {
                    // InternalGumboParser.g:6205:4: (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign )
                    int alt115=2;
                    int LA115_0 = input.LA(1);

                    if ( (LA115_0==FullStopFullStop) ) {
                        alt115=1;
                    }
                    else if ( (LA115_0==FullStopFullStopLessThanSign) ) {
                        alt115=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 115, 0, input);

                        throw nvae;
                    }
                    switch (alt115) {
                        case 1 :
                            // InternalGumboParser.g:6206:5: otherlv_3= FullStopFullStop
                            {
                            otherlv_3=(Token)match(input,FullStopFullStop,FollowSets000.FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_3, grammarAccess.getSlangForRangeAccess().getFullStopFullStopKeyword_3_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalGumboParser.g:6211:5: otherlv_4= FullStopFullStopLessThanSign
                            {
                            otherlv_4=(Token)match(input,FullStopFullStopLessThanSign,FollowSets000.FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getSlangForRangeAccess().getFullStopFullStopLessThanSignKeyword_3_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalGumboParser.g:6216:4: ( (lv_upper_5_0= ruleExpr ) )
                    // InternalGumboParser.g:6217:5: (lv_upper_5_0= ruleExpr )
                    {
                    // InternalGumboParser.g:6217:5: (lv_upper_5_0= ruleExpr )
                    // InternalGumboParser.g:6218:6: lv_upper_5_0= ruleExpr
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

                    // InternalGumboParser.g:6235:4: (otherlv_6= By ( (lv_step_7_0= ruleExpr ) ) )?
                    int alt116=2;
                    int LA116_0 = input.LA(1);

                    if ( (LA116_0==By) ) {
                        alt116=1;
                    }
                    switch (alt116) {
                        case 1 :
                            // InternalGumboParser.g:6236:5: otherlv_6= By ( (lv_step_7_0= ruleExpr ) )
                            {
                            otherlv_6=(Token)match(input,By,FollowSets000.FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_6, grammarAccess.getSlangForRangeAccess().getByKeyword_3_2_0());
                              				
                            }
                            // InternalGumboParser.g:6240:5: ( (lv_step_7_0= ruleExpr ) )
                            // InternalGumboParser.g:6241:6: (lv_step_7_0= ruleExpr )
                            {
                            // InternalGumboParser.g:6241:6: (lv_step_7_0= ruleExpr )
                            // InternalGumboParser.g:6242:7: lv_step_7_0= ruleExpr
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
    // InternalGumboParser.g:6265:1: entryRuleSlangRet returns [EObject current=null] : iv_ruleSlangRet= ruleSlangRet EOF ;
    public final EObject entryRuleSlangRet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangRet = null;


        try {
            // InternalGumboParser.g:6265:49: (iv_ruleSlangRet= ruleSlangRet EOF )
            // InternalGumboParser.g:6266:2: iv_ruleSlangRet= ruleSlangRet EOF
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
    // InternalGumboParser.g:6272:1: ruleSlangRet returns [EObject current=null] : ( () otherlv_1= Return ( (lv_e_2_0= ruleExpr ) )? ) ;
    public final EObject ruleSlangRet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_e_2_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:6278:2: ( ( () otherlv_1= Return ( (lv_e_2_0= ruleExpr ) )? ) )
            // InternalGumboParser.g:6279:2: ( () otherlv_1= Return ( (lv_e_2_0= ruleExpr ) )? )
            {
            // InternalGumboParser.g:6279:2: ( () otherlv_1= Return ( (lv_e_2_0= ruleExpr ) )? )
            // InternalGumboParser.g:6280:3: () otherlv_1= Return ( (lv_e_2_0= ruleExpr ) )?
            {
            // InternalGumboParser.g:6280:3: ()
            // InternalGumboParser.g:6281:4: 
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

            otherlv_1=(Token)match(input,Return,FollowSets000.FOLLOW_75); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSlangRetAccess().getReturnKeyword_1());
              		
            }
            // InternalGumboParser.g:6294:3: ( (lv_e_2_0= ruleExpr ) )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( ((LA118_0>=HasEvent && LA118_0<=MustSend)||LA118_0==MaySend||LA118_0==NoSend||LA118_0==Some||LA118_0==False||LA118_0==All||LA118_0==True||(LA118_0>=F32 && LA118_0<=F64)||LA118_0==For||LA118_0==Res||(LA118_0>=If && LA118_0<=In_1)||LA118_0==LeftParenthesis||(LA118_0>=Asterisk && LA118_0<=PlusSign)||LA118_0==HyphenMinus||(LA118_0>=F && LA118_0<=T)||LA118_0==LeftCurlyBracket||(LA118_0>=ForAll && LA118_0<=ThereExists)||(LA118_0>=RULE_SLANG_STRING && LA118_0<=RULE_MSTRING)||(LA118_0>=RULE_MSP && LA118_0<=RULE_MSPB)||(LA118_0>=RULE_IMPLIES && LA118_0<=RULE_OP)||(LA118_0>=RULE_HEX && LA118_0<=RULE_INTEGER_LIT)||(LA118_0>=RULE_REAL_LIT && LA118_0<=RULE_F64_LIT)||LA118_0==RULE_ID) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // InternalGumboParser.g:6295:4: (lv_e_2_0= ruleExpr )
                    {
                    // InternalGumboParser.g:6295:4: (lv_e_2_0= ruleExpr )
                    // InternalGumboParser.g:6296:5: lv_e_2_0= ruleExpr
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
    // InternalGumboParser.g:6317:1: entryRuleSlangCallSuffix returns [EObject current=null] : iv_ruleSlangCallSuffix= ruleSlangCallSuffix EOF ;
    public final EObject entryRuleSlangCallSuffix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangCallSuffix = null;


        try {
            // InternalGumboParser.g:6317:56: (iv_ruleSlangCallSuffix= ruleSlangCallSuffix EOF )
            // InternalGumboParser.g:6318:2: iv_ruleSlangCallSuffix= ruleSlangCallSuffix EOF
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
    // InternalGumboParser.g:6324:1: ruleSlangCallSuffix returns [EObject current=null] : ( () ( (lv_ca_1_0= ruleSlangCallArgs ) ) ) ;
    public final EObject ruleSlangCallSuffix() throws RecognitionException {
        EObject current = null;

        EObject lv_ca_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:6330:2: ( ( () ( (lv_ca_1_0= ruleSlangCallArgs ) ) ) )
            // InternalGumboParser.g:6331:2: ( () ( (lv_ca_1_0= ruleSlangCallArgs ) ) )
            {
            // InternalGumboParser.g:6331:2: ( () ( (lv_ca_1_0= ruleSlangCallArgs ) ) )
            // InternalGumboParser.g:6332:3: () ( (lv_ca_1_0= ruleSlangCallArgs ) )
            {
            // InternalGumboParser.g:6332:3: ()
            // InternalGumboParser.g:6333:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSlangCallSuffixAccess().getSlangCallSuffixAction_0(),
              					current);
              			
            }

            }

            // InternalGumboParser.g:6342:3: ( (lv_ca_1_0= ruleSlangCallArgs ) )
            // InternalGumboParser.g:6343:4: (lv_ca_1_0= ruleSlangCallArgs )
            {
            // InternalGumboParser.g:6343:4: (lv_ca_1_0= ruleSlangCallArgs )
            // InternalGumboParser.g:6344:5: lv_ca_1_0= ruleSlangCallArgs
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangCallSuffixAccess().getCaSlangCallArgsParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_ca_1_0=ruleSlangCallArgs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSlangCallSuffixRule());
              					}
              					set(
              						current,
              						"ca",
              						lv_ca_1_0,
              						"org.sireum.aadl.gumbo.Gumbo.SlangCallArgs");
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
    // $ANTLR end "ruleSlangCallSuffix"


    // $ANTLR start "entryRuleSlangCallArgs"
    // InternalGumboParser.g:6365:1: entryRuleSlangCallArgs returns [EObject current=null] : iv_ruleSlangCallArgs= ruleSlangCallArgs EOF ;
    public final EObject entryRuleSlangCallArgs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangCallArgs = null;


        try {
            // InternalGumboParser.g:6365:54: (iv_ruleSlangCallArgs= ruleSlangCallArgs EOF )
            // InternalGumboParser.g:6366:2: iv_ruleSlangCallArgs= ruleSlangCallArgs EOF
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
    // InternalGumboParser.g:6372:1: ruleSlangCallArgs returns [EObject current=null] : ( () otherlv_1= LeftParenthesis ( ( (lv_arg_2_0= ruleExpr ) ) (otherlv_3= Comma ( (lv_arg_4_0= ruleExpr ) ) )* )? otherlv_5= RightParenthesis ) ;
    public final EObject ruleSlangCallArgs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arg_2_0 = null;

        EObject lv_arg_4_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:6378:2: ( ( () otherlv_1= LeftParenthesis ( ( (lv_arg_2_0= ruleExpr ) ) (otherlv_3= Comma ( (lv_arg_4_0= ruleExpr ) ) )* )? otherlv_5= RightParenthesis ) )
            // InternalGumboParser.g:6379:2: ( () otherlv_1= LeftParenthesis ( ( (lv_arg_2_0= ruleExpr ) ) (otherlv_3= Comma ( (lv_arg_4_0= ruleExpr ) ) )* )? otherlv_5= RightParenthesis )
            {
            // InternalGumboParser.g:6379:2: ( () otherlv_1= LeftParenthesis ( ( (lv_arg_2_0= ruleExpr ) ) (otherlv_3= Comma ( (lv_arg_4_0= ruleExpr ) ) )* )? otherlv_5= RightParenthesis )
            // InternalGumboParser.g:6380:3: () otherlv_1= LeftParenthesis ( ( (lv_arg_2_0= ruleExpr ) ) (otherlv_3= Comma ( (lv_arg_4_0= ruleExpr ) ) )* )? otherlv_5= RightParenthesis
            {
            // InternalGumboParser.g:6380:3: ()
            // InternalGumboParser.g:6381:4: 
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

            otherlv_1=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSlangCallArgsAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGumboParser.g:6394:3: ( ( (lv_arg_2_0= ruleExpr ) ) (otherlv_3= Comma ( (lv_arg_4_0= ruleExpr ) ) )* )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( ((LA120_0>=HasEvent && LA120_0<=MustSend)||LA120_0==MaySend||LA120_0==NoSend||LA120_0==Some||LA120_0==False||LA120_0==All||LA120_0==True||(LA120_0>=F32 && LA120_0<=F64)||LA120_0==For||LA120_0==Res||(LA120_0>=If && LA120_0<=In_1)||LA120_0==LeftParenthesis||(LA120_0>=Asterisk && LA120_0<=PlusSign)||LA120_0==HyphenMinus||(LA120_0>=F && LA120_0<=T)||LA120_0==LeftCurlyBracket||(LA120_0>=ForAll && LA120_0<=ThereExists)||(LA120_0>=RULE_SLANG_STRING && LA120_0<=RULE_MSTRING)||(LA120_0>=RULE_MSP && LA120_0<=RULE_MSPB)||(LA120_0>=RULE_IMPLIES && LA120_0<=RULE_OP)||(LA120_0>=RULE_HEX && LA120_0<=RULE_INTEGER_LIT)||(LA120_0>=RULE_REAL_LIT && LA120_0<=RULE_F64_LIT)||LA120_0==RULE_ID) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // InternalGumboParser.g:6395:4: ( (lv_arg_2_0= ruleExpr ) ) (otherlv_3= Comma ( (lv_arg_4_0= ruleExpr ) ) )*
                    {
                    // InternalGumboParser.g:6395:4: ( (lv_arg_2_0= ruleExpr ) )
                    // InternalGumboParser.g:6396:5: (lv_arg_2_0= ruleExpr )
                    {
                    // InternalGumboParser.g:6396:5: (lv_arg_2_0= ruleExpr )
                    // InternalGumboParser.g:6397:6: lv_arg_2_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangCallArgsAccess().getArgExprParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_29);
                    lv_arg_2_0=ruleExpr();

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
                      							"org.sireum.aadl.gumbo.Gumbo.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:6414:4: (otherlv_3= Comma ( (lv_arg_4_0= ruleExpr ) ) )*
                    loop119:
                    do {
                        int alt119=2;
                        int LA119_0 = input.LA(1);

                        if ( (LA119_0==Comma) ) {
                            alt119=1;
                        }


                        switch (alt119) {
                    	case 1 :
                    	    // InternalGumboParser.g:6415:5: otherlv_3= Comma ( (lv_arg_4_0= ruleExpr ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getSlangCallArgsAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:6419:5: ( (lv_arg_4_0= ruleExpr ) )
                    	    // InternalGumboParser.g:6420:6: (lv_arg_4_0= ruleExpr )
                    	    {
                    	    // InternalGumboParser.g:6420:6: (lv_arg_4_0= ruleExpr )
                    	    // InternalGumboParser.g:6421:7: lv_arg_4_0= ruleExpr
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSlangCallArgsAccess().getArgExprParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_29);
                    	    lv_arg_4_0=ruleExpr();

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
                    	      								"org.sireum.aadl.gumbo.Gumbo.Expr");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop119;
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


    // $ANTLR start "entryRuleSlangType"
    // InternalGumboParser.g:6448:1: entryRuleSlangType returns [EObject current=null] : iv_ruleSlangType= ruleSlangType EOF ;
    public final EObject entryRuleSlangType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangType = null;


        try {
            // InternalGumboParser.g:6448:50: (iv_ruleSlangType= ruleSlangType EOF )
            // InternalGumboParser.g:6449:2: iv_ruleSlangType= ruleSlangType EOF
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
    // InternalGumboParser.g:6455:1: ruleSlangType returns [EObject current=null] : this_SlangBaseType_0= ruleSlangBaseType ;
    public final EObject ruleSlangType() throws RecognitionException {
        EObject current = null;

        EObject this_SlangBaseType_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:6461:2: (this_SlangBaseType_0= ruleSlangBaseType )
            // InternalGumboParser.g:6462:2: this_SlangBaseType_0= ruleSlangBaseType
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
    // InternalGumboParser.g:6476:1: entryRuleSlangBaseType returns [EObject current=null] : iv_ruleSlangBaseType= ruleSlangBaseType EOF ;
    public final EObject entryRuleSlangBaseType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangBaseType = null;


        try {
            // InternalGumboParser.g:6476:54: (iv_ruleSlangBaseType= ruleSlangBaseType EOF )
            // InternalGumboParser.g:6477:2: iv_ruleSlangBaseType= ruleSlangBaseType EOF
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
    // InternalGumboParser.g:6483:1: ruleSlangBaseType returns [EObject current=null] : ( ( ruleQCREF ) ) ;
    public final EObject ruleSlangBaseType() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalGumboParser.g:6489:2: ( ( ( ruleQCREF ) ) )
            // InternalGumboParser.g:6490:2: ( ( ruleQCREF ) )
            {
            // InternalGumboParser.g:6490:2: ( ( ruleQCREF ) )
            // InternalGumboParser.g:6491:3: ( ruleQCREF )
            {
            // InternalGumboParser.g:6491:3: ( ruleQCREF )
            // InternalGumboParser.g:6492:4: ruleQCREF
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
    // InternalGumboParser.g:6512:1: entryRuleSlangTypeArgs returns [EObject current=null] : iv_ruleSlangTypeArgs= ruleSlangTypeArgs EOF ;
    public final EObject entryRuleSlangTypeArgs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangTypeArgs = null;


        try {
            // InternalGumboParser.g:6512:54: (iv_ruleSlangTypeArgs= ruleSlangTypeArgs EOF )
            // InternalGumboParser.g:6513:2: iv_ruleSlangTypeArgs= ruleSlangTypeArgs EOF
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
    // InternalGumboParser.g:6519:1: ruleSlangTypeArgs returns [EObject current=null] : (otherlv_0= LeftSquareBracket ( (lv_types_1_0= ruleSlangType ) ) (otherlv_2= Comma ( (lv_types_3_0= ruleSlangType ) ) )* otherlv_4= RightSquareBracket ) ;
    public final EObject ruleSlangTypeArgs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_types_1_0 = null;

        EObject lv_types_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:6525:2: ( (otherlv_0= LeftSquareBracket ( (lv_types_1_0= ruleSlangType ) ) (otherlv_2= Comma ( (lv_types_3_0= ruleSlangType ) ) )* otherlv_4= RightSquareBracket ) )
            // InternalGumboParser.g:6526:2: (otherlv_0= LeftSquareBracket ( (lv_types_1_0= ruleSlangType ) ) (otherlv_2= Comma ( (lv_types_3_0= ruleSlangType ) ) )* otherlv_4= RightSquareBracket )
            {
            // InternalGumboParser.g:6526:2: (otherlv_0= LeftSquareBracket ( (lv_types_1_0= ruleSlangType ) ) (otherlv_2= Comma ( (lv_types_3_0= ruleSlangType ) ) )* otherlv_4= RightSquareBracket )
            // InternalGumboParser.g:6527:3: otherlv_0= LeftSquareBracket ( (lv_types_1_0= ruleSlangType ) ) (otherlv_2= Comma ( (lv_types_3_0= ruleSlangType ) ) )* otherlv_4= RightSquareBracket
            {
            otherlv_0=(Token)match(input,LeftSquareBracket,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangTypeArgsAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalGumboParser.g:6531:3: ( (lv_types_1_0= ruleSlangType ) )
            // InternalGumboParser.g:6532:4: (lv_types_1_0= ruleSlangType )
            {
            // InternalGumboParser.g:6532:4: (lv_types_1_0= ruleSlangType )
            // InternalGumboParser.g:6533:5: lv_types_1_0= ruleSlangType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangTypeArgsAccess().getTypesSlangTypeParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_49);
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

            // InternalGumboParser.g:6550:3: (otherlv_2= Comma ( (lv_types_3_0= ruleSlangType ) ) )*
            loop121:
            do {
                int alt121=2;
                int LA121_0 = input.LA(1);

                if ( (LA121_0==Comma) ) {
                    alt121=1;
                }


                switch (alt121) {
            	case 1 :
            	    // InternalGumboParser.g:6551:4: otherlv_2= Comma ( (lv_types_3_0= ruleSlangType ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FollowSets000.FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSlangTypeArgsAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalGumboParser.g:6555:4: ( (lv_types_3_0= ruleSlangType ) )
            	    // InternalGumboParser.g:6556:5: (lv_types_3_0= ruleSlangType )
            	    {
            	    // InternalGumboParser.g:6556:5: (lv_types_3_0= ruleSlangType )
            	    // InternalGumboParser.g:6557:6: lv_types_3_0= ruleSlangType
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSlangTypeArgsAccess().getTypesSlangTypeParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_49);
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
            	    break loop121;
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
    // InternalGumboParser.g:6583:1: entryRuleSlangLit returns [EObject current=null] : iv_ruleSlangLit= ruleSlangLit EOF ;
    public final EObject entryRuleSlangLit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangLit = null;


        try {
            // InternalGumboParser.g:6583:49: (iv_ruleSlangLit= ruleSlangLit EOF )
            // InternalGumboParser.g:6584:2: iv_ruleSlangLit= ruleSlangLit EOF
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
    // InternalGumboParser.g:6590:1: ruleSlangLit returns [EObject current=null] : ( ( () ( ( (lv_value_1_1= T | lv_value_1_2= F | lv_value_1_3= True | lv_value_1_4= False ) ) ) ) | ( () otherlv_3= Res ) | ( () ( (lv_value_5_0= RULE_INTEGER_LIT ) ) ) | ( () ( (lv_value_7_0= RULE_HEX ) ) ) | ( () ( (lv_value_9_0= RULE_BIN ) ) ) | ( () ( (lv_value_11_0= RULE_F32_LIT ) ) ) | ( () ( ( (lv_value_13_1= RULE_F64_LIT | lv_value_13_2= RULE_REAL_LIT ) ) ) ) | ( () ( (lv_value_15_0= F32 ) ) ) | ( () ( (lv_value_17_0= F64 ) ) ) | ( () ( (lv_value_19_0= RULE_SLANG_STRING ) ) ) | ( () ( (lv_value_21_0= RULE_MSTRING ) ) ) ) ;
    public final EObject ruleSlangLit() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_1=null;
        Token lv_value_1_2=null;
        Token lv_value_1_3=null;
        Token lv_value_1_4=null;
        Token otherlv_3=null;
        Token lv_value_5_0=null;
        Token lv_value_7_0=null;
        Token lv_value_9_0=null;
        Token lv_value_11_0=null;
        Token lv_value_13_1=null;
        Token lv_value_13_2=null;
        Token lv_value_15_0=null;
        Token lv_value_17_0=null;
        Token lv_value_19_0=null;
        Token lv_value_21_0=null;


        	enterRule();

        try {
            // InternalGumboParser.g:6596:2: ( ( ( () ( ( (lv_value_1_1= T | lv_value_1_2= F | lv_value_1_3= True | lv_value_1_4= False ) ) ) ) | ( () otherlv_3= Res ) | ( () ( (lv_value_5_0= RULE_INTEGER_LIT ) ) ) | ( () ( (lv_value_7_0= RULE_HEX ) ) ) | ( () ( (lv_value_9_0= RULE_BIN ) ) ) | ( () ( (lv_value_11_0= RULE_F32_LIT ) ) ) | ( () ( ( (lv_value_13_1= RULE_F64_LIT | lv_value_13_2= RULE_REAL_LIT ) ) ) ) | ( () ( (lv_value_15_0= F32 ) ) ) | ( () ( (lv_value_17_0= F64 ) ) ) | ( () ( (lv_value_19_0= RULE_SLANG_STRING ) ) ) | ( () ( (lv_value_21_0= RULE_MSTRING ) ) ) ) )
            // InternalGumboParser.g:6597:2: ( ( () ( ( (lv_value_1_1= T | lv_value_1_2= F | lv_value_1_3= True | lv_value_1_4= False ) ) ) ) | ( () otherlv_3= Res ) | ( () ( (lv_value_5_0= RULE_INTEGER_LIT ) ) ) | ( () ( (lv_value_7_0= RULE_HEX ) ) ) | ( () ( (lv_value_9_0= RULE_BIN ) ) ) | ( () ( (lv_value_11_0= RULE_F32_LIT ) ) ) | ( () ( ( (lv_value_13_1= RULE_F64_LIT | lv_value_13_2= RULE_REAL_LIT ) ) ) ) | ( () ( (lv_value_15_0= F32 ) ) ) | ( () ( (lv_value_17_0= F64 ) ) ) | ( () ( (lv_value_19_0= RULE_SLANG_STRING ) ) ) | ( () ( (lv_value_21_0= RULE_MSTRING ) ) ) )
            {
            // InternalGumboParser.g:6597:2: ( ( () ( ( (lv_value_1_1= T | lv_value_1_2= F | lv_value_1_3= True | lv_value_1_4= False ) ) ) ) | ( () otherlv_3= Res ) | ( () ( (lv_value_5_0= RULE_INTEGER_LIT ) ) ) | ( () ( (lv_value_7_0= RULE_HEX ) ) ) | ( () ( (lv_value_9_0= RULE_BIN ) ) ) | ( () ( (lv_value_11_0= RULE_F32_LIT ) ) ) | ( () ( ( (lv_value_13_1= RULE_F64_LIT | lv_value_13_2= RULE_REAL_LIT ) ) ) ) | ( () ( (lv_value_15_0= F32 ) ) ) | ( () ( (lv_value_17_0= F64 ) ) ) | ( () ( (lv_value_19_0= RULE_SLANG_STRING ) ) ) | ( () ( (lv_value_21_0= RULE_MSTRING ) ) ) )
            int alt124=11;
            switch ( input.LA(1) ) {
            case False:
            case True:
            case F:
            case T:
                {
                alt124=1;
                }
                break;
            case Res:
                {
                alt124=2;
                }
                break;
            case RULE_INTEGER_LIT:
                {
                alt124=3;
                }
                break;
            case RULE_HEX:
                {
                alt124=4;
                }
                break;
            case RULE_BIN:
                {
                alt124=5;
                }
                break;
            case RULE_F32_LIT:
                {
                alt124=6;
                }
                break;
            case RULE_REAL_LIT:
            case RULE_F64_LIT:
                {
                alt124=7;
                }
                break;
            case F32:
                {
                alt124=8;
                }
                break;
            case F64:
                {
                alt124=9;
                }
                break;
            case RULE_SLANG_STRING:
                {
                alt124=10;
                }
                break;
            case RULE_MSTRING:
                {
                alt124=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 124, 0, input);

                throw nvae;
            }

            switch (alt124) {
                case 1 :
                    // InternalGumboParser.g:6598:3: ( () ( ( (lv_value_1_1= T | lv_value_1_2= F | lv_value_1_3= True | lv_value_1_4= False ) ) ) )
                    {
                    // InternalGumboParser.g:6598:3: ( () ( ( (lv_value_1_1= T | lv_value_1_2= F | lv_value_1_3= True | lv_value_1_4= False ) ) ) )
                    // InternalGumboParser.g:6599:4: () ( ( (lv_value_1_1= T | lv_value_1_2= F | lv_value_1_3= True | lv_value_1_4= False ) ) )
                    {
                    // InternalGumboParser.g:6599:4: ()
                    // InternalGumboParser.g:6600:5: 
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

                    // InternalGumboParser.g:6609:4: ( ( (lv_value_1_1= T | lv_value_1_2= F | lv_value_1_3= True | lv_value_1_4= False ) ) )
                    // InternalGumboParser.g:6610:5: ( (lv_value_1_1= T | lv_value_1_2= F | lv_value_1_3= True | lv_value_1_4= False ) )
                    {
                    // InternalGumboParser.g:6610:5: ( (lv_value_1_1= T | lv_value_1_2= F | lv_value_1_3= True | lv_value_1_4= False ) )
                    // InternalGumboParser.g:6611:6: (lv_value_1_1= T | lv_value_1_2= F | lv_value_1_3= True | lv_value_1_4= False )
                    {
                    // InternalGumboParser.g:6611:6: (lv_value_1_1= T | lv_value_1_2= F | lv_value_1_3= True | lv_value_1_4= False )
                    int alt122=4;
                    switch ( input.LA(1) ) {
                    case T:
                        {
                        alt122=1;
                        }
                        break;
                    case F:
                        {
                        alt122=2;
                        }
                        break;
                    case True:
                        {
                        alt122=3;
                        }
                        break;
                    case False:
                        {
                        alt122=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 122, 0, input);

                        throw nvae;
                    }

                    switch (alt122) {
                        case 1 :
                            // InternalGumboParser.g:6612:7: lv_value_1_1= T
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
                            // InternalGumboParser.g:6623:7: lv_value_1_2= F
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
                        case 3 :
                            // InternalGumboParser.g:6634:7: lv_value_1_3= True
                            {
                            lv_value_1_3=(Token)match(input,True,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_value_1_3, grammarAccess.getSlangLitAccess().getValueTrueKeyword_0_1_0_2());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getSlangLitRule());
                              							}
                              							setWithLastConsumed(current, "value", lv_value_1_3, null);
                              						
                            }

                            }
                            break;
                        case 4 :
                            // InternalGumboParser.g:6645:7: lv_value_1_4= False
                            {
                            lv_value_1_4=(Token)match(input,False,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_value_1_4, grammarAccess.getSlangLitAccess().getValueFalseKeyword_0_1_0_3());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getSlangLitRule());
                              							}
                              							setWithLastConsumed(current, "value", lv_value_1_4, null);
                              						
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
                    // InternalGumboParser.g:6660:3: ( () otherlv_3= Res )
                    {
                    // InternalGumboParser.g:6660:3: ( () otherlv_3= Res )
                    // InternalGumboParser.g:6661:4: () otherlv_3= Res
                    {
                    // InternalGumboParser.g:6661:4: ()
                    // InternalGumboParser.g:6662:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangLitAccess().getResultLitAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_3=(Token)match(input,Res,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getSlangLitAccess().getResKeyword_1_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGumboParser.g:6677:3: ( () ( (lv_value_5_0= RULE_INTEGER_LIT ) ) )
                    {
                    // InternalGumboParser.g:6677:3: ( () ( (lv_value_5_0= RULE_INTEGER_LIT ) ) )
                    // InternalGumboParser.g:6678:4: () ( (lv_value_5_0= RULE_INTEGER_LIT ) )
                    {
                    // InternalGumboParser.g:6678:4: ()
                    // InternalGumboParser.g:6679:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangLitAccess().getIntegerLitAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:6688:4: ( (lv_value_5_0= RULE_INTEGER_LIT ) )
                    // InternalGumboParser.g:6689:5: (lv_value_5_0= RULE_INTEGER_LIT )
                    {
                    // InternalGumboParser.g:6689:5: (lv_value_5_0= RULE_INTEGER_LIT )
                    // InternalGumboParser.g:6690:6: lv_value_5_0= RULE_INTEGER_LIT
                    {
                    lv_value_5_0=(Token)match(input,RULE_INTEGER_LIT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_5_0, grammarAccess.getSlangLitAccess().getValueINTEGER_LITTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSlangLitRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_5_0,
                      							"org.osate.xtext.aadl2.properties.Properties.INTEGER_LIT");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalGumboParser.g:6708:3: ( () ( (lv_value_7_0= RULE_HEX ) ) )
                    {
                    // InternalGumboParser.g:6708:3: ( () ( (lv_value_7_0= RULE_HEX ) ) )
                    // InternalGumboParser.g:6709:4: () ( (lv_value_7_0= RULE_HEX ) )
                    {
                    // InternalGumboParser.g:6709:4: ()
                    // InternalGumboParser.g:6710:5: 
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

                    // InternalGumboParser.g:6719:4: ( (lv_value_7_0= RULE_HEX ) )
                    // InternalGumboParser.g:6720:5: (lv_value_7_0= RULE_HEX )
                    {
                    // InternalGumboParser.g:6720:5: (lv_value_7_0= RULE_HEX )
                    // InternalGumboParser.g:6721:6: lv_value_7_0= RULE_HEX
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
                    // InternalGumboParser.g:6739:3: ( () ( (lv_value_9_0= RULE_BIN ) ) )
                    {
                    // InternalGumboParser.g:6739:3: ( () ( (lv_value_9_0= RULE_BIN ) ) )
                    // InternalGumboParser.g:6740:4: () ( (lv_value_9_0= RULE_BIN ) )
                    {
                    // InternalGumboParser.g:6740:4: ()
                    // InternalGumboParser.g:6741:5: 
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

                    // InternalGumboParser.g:6750:4: ( (lv_value_9_0= RULE_BIN ) )
                    // InternalGumboParser.g:6751:5: (lv_value_9_0= RULE_BIN )
                    {
                    // InternalGumboParser.g:6751:5: (lv_value_9_0= RULE_BIN )
                    // InternalGumboParser.g:6752:6: lv_value_9_0= RULE_BIN
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
                    // InternalGumboParser.g:6770:3: ( () ( (lv_value_11_0= RULE_F32_LIT ) ) )
                    {
                    // InternalGumboParser.g:6770:3: ( () ( (lv_value_11_0= RULE_F32_LIT ) ) )
                    // InternalGumboParser.g:6771:4: () ( (lv_value_11_0= RULE_F32_LIT ) )
                    {
                    // InternalGumboParser.g:6771:4: ()
                    // InternalGumboParser.g:6772:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangLitAccess().getF32LitAction_5_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:6781:4: ( (lv_value_11_0= RULE_F32_LIT ) )
                    // InternalGumboParser.g:6782:5: (lv_value_11_0= RULE_F32_LIT )
                    {
                    // InternalGumboParser.g:6782:5: (lv_value_11_0= RULE_F32_LIT )
                    // InternalGumboParser.g:6783:6: lv_value_11_0= RULE_F32_LIT
                    {
                    lv_value_11_0=(Token)match(input,RULE_F32_LIT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_11_0, grammarAccess.getSlangLitAccess().getValueF32_LITTerminalRuleCall_5_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSlangLitRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_11_0,
                      							"org.sireum.aadl.gumbo.Gumbo.F32_LIT");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalGumboParser.g:6801:3: ( () ( ( (lv_value_13_1= RULE_F64_LIT | lv_value_13_2= RULE_REAL_LIT ) ) ) )
                    {
                    // InternalGumboParser.g:6801:3: ( () ( ( (lv_value_13_1= RULE_F64_LIT | lv_value_13_2= RULE_REAL_LIT ) ) ) )
                    // InternalGumboParser.g:6802:4: () ( ( (lv_value_13_1= RULE_F64_LIT | lv_value_13_2= RULE_REAL_LIT ) ) )
                    {
                    // InternalGumboParser.g:6802:4: ()
                    // InternalGumboParser.g:6803:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangLitAccess().getF64LitAction_6_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:6812:4: ( ( (lv_value_13_1= RULE_F64_LIT | lv_value_13_2= RULE_REAL_LIT ) ) )
                    // InternalGumboParser.g:6813:5: ( (lv_value_13_1= RULE_F64_LIT | lv_value_13_2= RULE_REAL_LIT ) )
                    {
                    // InternalGumboParser.g:6813:5: ( (lv_value_13_1= RULE_F64_LIT | lv_value_13_2= RULE_REAL_LIT ) )
                    // InternalGumboParser.g:6814:6: (lv_value_13_1= RULE_F64_LIT | lv_value_13_2= RULE_REAL_LIT )
                    {
                    // InternalGumboParser.g:6814:6: (lv_value_13_1= RULE_F64_LIT | lv_value_13_2= RULE_REAL_LIT )
                    int alt123=2;
                    int LA123_0 = input.LA(1);

                    if ( (LA123_0==RULE_F64_LIT) ) {
                        alt123=1;
                    }
                    else if ( (LA123_0==RULE_REAL_LIT) ) {
                        alt123=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 123, 0, input);

                        throw nvae;
                    }
                    switch (alt123) {
                        case 1 :
                            // InternalGumboParser.g:6815:7: lv_value_13_1= RULE_F64_LIT
                            {
                            lv_value_13_1=(Token)match(input,RULE_F64_LIT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_value_13_1, grammarAccess.getSlangLitAccess().getValueF64_LITTerminalRuleCall_6_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getSlangLitRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"value",
                              								lv_value_13_1,
                              								"org.sireum.aadl.gumbo.Gumbo.F64_LIT");
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalGumboParser.g:6830:7: lv_value_13_2= RULE_REAL_LIT
                            {
                            lv_value_13_2=(Token)match(input,RULE_REAL_LIT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_value_13_2, grammarAccess.getSlangLitAccess().getValueREAL_LITTerminalRuleCall_6_1_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getSlangLitRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"value",
                              								lv_value_13_2,
                              								"org.osate.xtext.aadl2.properties.Properties.REAL_LIT");
                              						
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalGumboParser.g:6849:3: ( () ( (lv_value_15_0= F32 ) ) )
                    {
                    // InternalGumboParser.g:6849:3: ( () ( (lv_value_15_0= F32 ) ) )
                    // InternalGumboParser.g:6850:4: () ( (lv_value_15_0= F32 ) )
                    {
                    // InternalGumboParser.g:6850:4: ()
                    // InternalGumboParser.g:6851:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangLitAccess().getF32ObjAction_7_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:6860:4: ( (lv_value_15_0= F32 ) )
                    // InternalGumboParser.g:6861:5: (lv_value_15_0= F32 )
                    {
                    // InternalGumboParser.g:6861:5: (lv_value_15_0= F32 )
                    // InternalGumboParser.g:6862:6: lv_value_15_0= F32
                    {
                    lv_value_15_0=(Token)match(input,F32,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_15_0, grammarAccess.getSlangLitAccess().getValueF32Keyword_7_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSlangLitRule());
                      						}
                      						setWithLastConsumed(current, "value", lv_value_15_0, "F32");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalGumboParser.g:6876:3: ( () ( (lv_value_17_0= F64 ) ) )
                    {
                    // InternalGumboParser.g:6876:3: ( () ( (lv_value_17_0= F64 ) ) )
                    // InternalGumboParser.g:6877:4: () ( (lv_value_17_0= F64 ) )
                    {
                    // InternalGumboParser.g:6877:4: ()
                    // InternalGumboParser.g:6878:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangLitAccess().getF64ObjAction_8_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:6887:4: ( (lv_value_17_0= F64 ) )
                    // InternalGumboParser.g:6888:5: (lv_value_17_0= F64 )
                    {
                    // InternalGumboParser.g:6888:5: (lv_value_17_0= F64 )
                    // InternalGumboParser.g:6889:6: lv_value_17_0= F64
                    {
                    lv_value_17_0=(Token)match(input,F64,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_17_0, grammarAccess.getSlangLitAccess().getValueF64Keyword_8_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSlangLitRule());
                      						}
                      						setWithLastConsumed(current, "value", lv_value_17_0, "F64");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // InternalGumboParser.g:6903:3: ( () ( (lv_value_19_0= RULE_SLANG_STRING ) ) )
                    {
                    // InternalGumboParser.g:6903:3: ( () ( (lv_value_19_0= RULE_SLANG_STRING ) ) )
                    // InternalGumboParser.g:6904:4: () ( (lv_value_19_0= RULE_SLANG_STRING ) )
                    {
                    // InternalGumboParser.g:6904:4: ()
                    // InternalGumboParser.g:6905:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangLitAccess().getSlangStringLitAction_9_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:6914:4: ( (lv_value_19_0= RULE_SLANG_STRING ) )
                    // InternalGumboParser.g:6915:5: (lv_value_19_0= RULE_SLANG_STRING )
                    {
                    // InternalGumboParser.g:6915:5: (lv_value_19_0= RULE_SLANG_STRING )
                    // InternalGumboParser.g:6916:6: lv_value_19_0= RULE_SLANG_STRING
                    {
                    lv_value_19_0=(Token)match(input,RULE_SLANG_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_19_0, grammarAccess.getSlangLitAccess().getValueSLANG_STRINGTerminalRuleCall_9_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSlangLitRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_19_0,
                      							"org.sireum.aadl.gumbo.Gumbo.SLANG_STRING");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 11 :
                    // InternalGumboParser.g:6934:3: ( () ( (lv_value_21_0= RULE_MSTRING ) ) )
                    {
                    // InternalGumboParser.g:6934:3: ( () ( (lv_value_21_0= RULE_MSTRING ) ) )
                    // InternalGumboParser.g:6935:4: () ( (lv_value_21_0= RULE_MSTRING ) )
                    {
                    // InternalGumboParser.g:6935:4: ()
                    // InternalGumboParser.g:6936:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangLitAccess().getMStringLitAction_10_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:6945:4: ( (lv_value_21_0= RULE_MSTRING ) )
                    // InternalGumboParser.g:6946:5: (lv_value_21_0= RULE_MSTRING )
                    {
                    // InternalGumboParser.g:6946:5: (lv_value_21_0= RULE_MSTRING )
                    // InternalGumboParser.g:6947:6: lv_value_21_0= RULE_MSTRING
                    {
                    lv_value_21_0=(Token)match(input,RULE_MSTRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_21_0, grammarAccess.getSlangLitAccess().getValueMSTRINGTerminalRuleCall_10_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSlangLitRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_21_0,
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
    // InternalGumboParser.g:6968:1: entryRuleSlangInterp returns [EObject current=null] : iv_ruleSlangInterp= ruleSlangInterp EOF ;
    public final EObject entryRuleSlangInterp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangInterp = null;


        try {
            // InternalGumboParser.g:6968:52: (iv_ruleSlangInterp= ruleSlangInterp EOF )
            // InternalGumboParser.g:6969:2: iv_ruleSlangInterp= ruleSlangInterp EOF
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
    // InternalGumboParser.g:6975:1: ruleSlangInterp returns [EObject current=null] : ( ( () ( (lv_msp_1_0= RULE_MSP ) ) ) | ( () ( (lv_sli_3_0= RULE_SLI ) ) ) | ( () ( (lv_mspb_5_0= RULE_MSPB ) ) ( (lv_minterp_6_0= ruleSlangMInterp ) ) ) ) ;
    public final EObject ruleSlangInterp() throws RecognitionException {
        EObject current = null;

        Token lv_msp_1_0=null;
        Token lv_sli_3_0=null;
        Token lv_mspb_5_0=null;
        EObject lv_minterp_6_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:6981:2: ( ( ( () ( (lv_msp_1_0= RULE_MSP ) ) ) | ( () ( (lv_sli_3_0= RULE_SLI ) ) ) | ( () ( (lv_mspb_5_0= RULE_MSPB ) ) ( (lv_minterp_6_0= ruleSlangMInterp ) ) ) ) )
            // InternalGumboParser.g:6982:2: ( ( () ( (lv_msp_1_0= RULE_MSP ) ) ) | ( () ( (lv_sli_3_0= RULE_SLI ) ) ) | ( () ( (lv_mspb_5_0= RULE_MSPB ) ) ( (lv_minterp_6_0= ruleSlangMInterp ) ) ) )
            {
            // InternalGumboParser.g:6982:2: ( ( () ( (lv_msp_1_0= RULE_MSP ) ) ) | ( () ( (lv_sli_3_0= RULE_SLI ) ) ) | ( () ( (lv_mspb_5_0= RULE_MSPB ) ) ( (lv_minterp_6_0= ruleSlangMInterp ) ) ) )
            int alt125=3;
            switch ( input.LA(1) ) {
            case RULE_MSP:
                {
                alt125=1;
                }
                break;
            case RULE_SLI:
                {
                alt125=2;
                }
                break;
            case RULE_MSPB:
                {
                alt125=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 125, 0, input);

                throw nvae;
            }

            switch (alt125) {
                case 1 :
                    // InternalGumboParser.g:6983:3: ( () ( (lv_msp_1_0= RULE_MSP ) ) )
                    {
                    // InternalGumboParser.g:6983:3: ( () ( (lv_msp_1_0= RULE_MSP ) ) )
                    // InternalGumboParser.g:6984:4: () ( (lv_msp_1_0= RULE_MSP ) )
                    {
                    // InternalGumboParser.g:6984:4: ()
                    // InternalGumboParser.g:6985:5: 
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

                    // InternalGumboParser.g:6994:4: ( (lv_msp_1_0= RULE_MSP ) )
                    // InternalGumboParser.g:6995:5: (lv_msp_1_0= RULE_MSP )
                    {
                    // InternalGumboParser.g:6995:5: (lv_msp_1_0= RULE_MSP )
                    // InternalGumboParser.g:6996:6: lv_msp_1_0= RULE_MSP
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
                    // InternalGumboParser.g:7014:3: ( () ( (lv_sli_3_0= RULE_SLI ) ) )
                    {
                    // InternalGumboParser.g:7014:3: ( () ( (lv_sli_3_0= RULE_SLI ) ) )
                    // InternalGumboParser.g:7015:4: () ( (lv_sli_3_0= RULE_SLI ) )
                    {
                    // InternalGumboParser.g:7015:4: ()
                    // InternalGumboParser.g:7016:5: 
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

                    // InternalGumboParser.g:7025:4: ( (lv_sli_3_0= RULE_SLI ) )
                    // InternalGumboParser.g:7026:5: (lv_sli_3_0= RULE_SLI )
                    {
                    // InternalGumboParser.g:7026:5: (lv_sli_3_0= RULE_SLI )
                    // InternalGumboParser.g:7027:6: lv_sli_3_0= RULE_SLI
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
                    // InternalGumboParser.g:7045:3: ( () ( (lv_mspb_5_0= RULE_MSPB ) ) ( (lv_minterp_6_0= ruleSlangMInterp ) ) )
                    {
                    // InternalGumboParser.g:7045:3: ( () ( (lv_mspb_5_0= RULE_MSPB ) ) ( (lv_minterp_6_0= ruleSlangMInterp ) ) )
                    // InternalGumboParser.g:7046:4: () ( (lv_mspb_5_0= RULE_MSPB ) ) ( (lv_minterp_6_0= ruleSlangMInterp ) )
                    {
                    // InternalGumboParser.g:7046:4: ()
                    // InternalGumboParser.g:7047:5: 
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

                    // InternalGumboParser.g:7056:4: ( (lv_mspb_5_0= RULE_MSPB ) )
                    // InternalGumboParser.g:7057:5: (lv_mspb_5_0= RULE_MSPB )
                    {
                    // InternalGumboParser.g:7057:5: (lv_mspb_5_0= RULE_MSPB )
                    // InternalGumboParser.g:7058:6: lv_mspb_5_0= RULE_MSPB
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

                    // InternalGumboParser.g:7074:4: ( (lv_minterp_6_0= ruleSlangMInterp ) )
                    // InternalGumboParser.g:7075:5: (lv_minterp_6_0= ruleSlangMInterp )
                    {
                    // InternalGumboParser.g:7075:5: (lv_minterp_6_0= ruleSlangMInterp )
                    // InternalGumboParser.g:7076:6: lv_minterp_6_0= ruleSlangMInterp
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
    // InternalGumboParser.g:7098:1: entryRuleSlangMInterp returns [EObject current=null] : iv_ruleSlangMInterp= ruleSlangMInterp EOF ;
    public final EObject entryRuleSlangMInterp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangMInterp = null;


        try {
            // InternalGumboParser.g:7098:53: (iv_ruleSlangMInterp= ruleSlangMInterp EOF )
            // InternalGumboParser.g:7099:2: iv_ruleSlangMInterp= ruleSlangMInterp EOF
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
    // InternalGumboParser.g:7105:1: ruleSlangMInterp returns [EObject current=null] : (otherlv_0= LeftCurlyBracket ( (lv_e_1_0= ruleExpr ) ) otherlv_2= RightCurlyBracket ( (this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) ) ) | this_MSPE_5= RULE_MSPE ) ) ;
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
            // InternalGumboParser.g:7111:2: ( (otherlv_0= LeftCurlyBracket ( (lv_e_1_0= ruleExpr ) ) otherlv_2= RightCurlyBracket ( (this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) ) ) | this_MSPE_5= RULE_MSPE ) ) )
            // InternalGumboParser.g:7112:2: (otherlv_0= LeftCurlyBracket ( (lv_e_1_0= ruleExpr ) ) otherlv_2= RightCurlyBracket ( (this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) ) ) | this_MSPE_5= RULE_MSPE ) )
            {
            // InternalGumboParser.g:7112:2: (otherlv_0= LeftCurlyBracket ( (lv_e_1_0= ruleExpr ) ) otherlv_2= RightCurlyBracket ( (this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) ) ) | this_MSPE_5= RULE_MSPE ) )
            // InternalGumboParser.g:7113:3: otherlv_0= LeftCurlyBracket ( (lv_e_1_0= ruleExpr ) ) otherlv_2= RightCurlyBracket ( (this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) ) ) | this_MSPE_5= RULE_MSPE )
            {
            otherlv_0=(Token)match(input,LeftCurlyBracket,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangMInterpAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalGumboParser.g:7117:3: ( (lv_e_1_0= ruleExpr ) )
            // InternalGumboParser.g:7118:4: (lv_e_1_0= ruleExpr )
            {
            // InternalGumboParser.g:7118:4: (lv_e_1_0= ruleExpr )
            // InternalGumboParser.g:7119:5: lv_e_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangMInterpAccess().getEExprParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_81);
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

            otherlv_2=(Token)match(input,RightCurlyBracket,FollowSets000.FOLLOW_90); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSlangMInterpAccess().getRightCurlyBracketKeyword_2());
              		
            }
            // InternalGumboParser.g:7140:3: ( (this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) ) ) | this_MSPE_5= RULE_MSPE )
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==RULE_MSPM) ) {
                alt126=1;
            }
            else if ( (LA126_0==RULE_MSPE) ) {
                alt126=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 126, 0, input);

                throw nvae;
            }
            switch (alt126) {
                case 1 :
                    // InternalGumboParser.g:7141:4: (this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) ) )
                    {
                    // InternalGumboParser.g:7141:4: (this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) ) )
                    // InternalGumboParser.g:7142:5: this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) )
                    {
                    this_MSPM_3=(Token)match(input,RULE_MSPM,FollowSets000.FOLLOW_56); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_MSPM_3, grammarAccess.getSlangMInterpAccess().getMSPMTerminalRuleCall_3_0_0());
                      				
                    }
                    // InternalGumboParser.g:7146:5: ( (lv_m_4_0= ruleSlangMInterp ) )
                    // InternalGumboParser.g:7147:6: (lv_m_4_0= ruleSlangMInterp )
                    {
                    // InternalGumboParser.g:7147:6: (lv_m_4_0= ruleSlangMInterp )
                    // InternalGumboParser.g:7148:7: lv_m_4_0= ruleSlangMInterp
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
                    // InternalGumboParser.g:7167:4: this_MSPE_5= RULE_MSPE
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
    // InternalGumboParser.g:7176:1: entryRuleOperator returns [String current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final String entryRuleOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperator = null;


        try {
            // InternalGumboParser.g:7176:48: (iv_ruleOperator= ruleOperator EOF )
            // InternalGumboParser.g:7177:2: iv_ruleOperator= ruleOperator EOF
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
    // InternalGumboParser.g:7183:1: ruleOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_OP_0= RULE_OP | this_PlusMinus_1= rulePlusMinus | this_STAR_2= ruleSTAR | this_IMPLIES_3= RULE_IMPLIES | this_SIMPLIES_4= RULE_SIMPLIES ) ;
    public final AntlrDatatypeRuleToken ruleOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_OP_0=null;
        Token this_IMPLIES_3=null;
        Token this_SIMPLIES_4=null;
        AntlrDatatypeRuleToken this_PlusMinus_1 = null;

        AntlrDatatypeRuleToken this_STAR_2 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:7189:2: ( (this_OP_0= RULE_OP | this_PlusMinus_1= rulePlusMinus | this_STAR_2= ruleSTAR | this_IMPLIES_3= RULE_IMPLIES | this_SIMPLIES_4= RULE_SIMPLIES ) )
            // InternalGumboParser.g:7190:2: (this_OP_0= RULE_OP | this_PlusMinus_1= rulePlusMinus | this_STAR_2= ruleSTAR | this_IMPLIES_3= RULE_IMPLIES | this_SIMPLIES_4= RULE_SIMPLIES )
            {
            // InternalGumboParser.g:7190:2: (this_OP_0= RULE_OP | this_PlusMinus_1= rulePlusMinus | this_STAR_2= ruleSTAR | this_IMPLIES_3= RULE_IMPLIES | this_SIMPLIES_4= RULE_SIMPLIES )
            int alt127=5;
            switch ( input.LA(1) ) {
            case RULE_OP:
                {
                alt127=1;
                }
                break;
            case PlusSign:
            case HyphenMinus:
                {
                alt127=2;
                }
                break;
            case Asterisk:
                {
                alt127=3;
                }
                break;
            case RULE_IMPLIES:
                {
                alt127=4;
                }
                break;
            case RULE_SIMPLIES:
                {
                alt127=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 127, 0, input);

                throw nvae;
            }

            switch (alt127) {
                case 1 :
                    // InternalGumboParser.g:7191:3: this_OP_0= RULE_OP
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
                    // InternalGumboParser.g:7199:3: this_PlusMinus_1= rulePlusMinus
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
                    // InternalGumboParser.g:7210:3: this_STAR_2= ruleSTAR
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
                    // InternalGumboParser.g:7221:3: this_IMPLIES_3= RULE_IMPLIES
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
                    // InternalGumboParser.g:7229:3: this_SIMPLIES_4= RULE_SIMPLIES
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
    // InternalGumboParser.g:7240:1: entryRuleContainedPropertyAssociation returns [EObject current=null] : iv_ruleContainedPropertyAssociation= ruleContainedPropertyAssociation EOF ;
    public final EObject entryRuleContainedPropertyAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainedPropertyAssociation = null;


        try {
            // InternalGumboParser.g:7240:69: (iv_ruleContainedPropertyAssociation= ruleContainedPropertyAssociation EOF )
            // InternalGumboParser.g:7241:2: iv_ruleContainedPropertyAssociation= ruleContainedPropertyAssociation EOF
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
    // InternalGumboParser.g:7247:1: ruleContainedPropertyAssociation returns [EObject current=null] : ( ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon ) ;
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
            // InternalGumboParser.g:7253:2: ( ( ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon ) )
            // InternalGumboParser.g:7254:2: ( ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon )
            {
            // InternalGumboParser.g:7254:2: ( ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon )
            // InternalGumboParser.g:7255:3: ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon
            {
            // InternalGumboParser.g:7255:3: ( ( ruleQPREF ) )
            // InternalGumboParser.g:7256:4: ( ruleQPREF )
            {
            // InternalGumboParser.g:7256:4: ( ruleQPREF )
            // InternalGumboParser.g:7257:5: ruleQPREF
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
            pushFollow(FollowSets000.FOLLOW_91);
            ruleQPREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumboParser.g:7274:3: (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) )
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==EqualsSignGreaterThanSign) ) {
                alt128=1;
            }
            else if ( (LA128_0==PlusSignEqualsSignGreaterThanSign) ) {
                alt128=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 128, 0, input);

                throw nvae;
            }
            switch (alt128) {
                case 1 :
                    // InternalGumboParser.g:7275:4: otherlv_1= EqualsSignGreaterThanSign
                    {
                    otherlv_1=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_92); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getContainedPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:7280:4: ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) )
                    {
                    // InternalGumboParser.g:7280:4: ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) )
                    // InternalGumboParser.g:7281:5: (lv_append_2_0= PlusSignEqualsSignGreaterThanSign )
                    {
                    // InternalGumboParser.g:7281:5: (lv_append_2_0= PlusSignEqualsSignGreaterThanSign )
                    // InternalGumboParser.g:7282:6: lv_append_2_0= PlusSignEqualsSignGreaterThanSign
                    {
                    lv_append_2_0=(Token)match(input,PlusSignEqualsSignGreaterThanSign,FollowSets000.FOLLOW_92); if (state.failed) return current;
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

            // InternalGumboParser.g:7295:3: ( (lv_constant_3_0= Constant ) )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==Constant) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // InternalGumboParser.g:7296:4: (lv_constant_3_0= Constant )
                    {
                    // InternalGumboParser.g:7296:4: (lv_constant_3_0= Constant )
                    // InternalGumboParser.g:7297:5: lv_constant_3_0= Constant
                    {
                    lv_constant_3_0=(Token)match(input,Constant,FollowSets000.FOLLOW_92); if (state.failed) return current;
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

            // InternalGumboParser.g:7309:3: ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* )
            // InternalGumboParser.g:7310:4: ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )*
            {
            // InternalGumboParser.g:7310:4: ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) )
            // InternalGumboParser.g:7311:5: (lv_ownedValue_4_0= ruleOptionalModalPropertyValue )
            {
            // InternalGumboParser.g:7311:5: (lv_ownedValue_4_0= ruleOptionalModalPropertyValue )
            // InternalGumboParser.g:7312:6: lv_ownedValue_4_0= ruleOptionalModalPropertyValue
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueOptionalModalPropertyValueParserRuleCall_3_0_0());
              					
            }
            pushFollow(FollowSets000.FOLLOW_93);
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

            // InternalGumboParser.g:7329:4: (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )*
            loop130:
            do {
                int alt130=2;
                int LA130_0 = input.LA(1);

                if ( (LA130_0==Comma) ) {
                    alt130=1;
                }


                switch (alt130) {
            	case 1 :
            	    // InternalGumboParser.g:7330:5: otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) )
            	    {
            	    otherlv_5=(Token)match(input,Comma,FollowSets000.FOLLOW_92); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_5, grammarAccess.getContainedPropertyAssociationAccess().getCommaKeyword_3_1_0());
            	      				
            	    }
            	    // InternalGumboParser.g:7334:5: ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) )
            	    // InternalGumboParser.g:7335:6: (lv_ownedValue_6_0= ruleOptionalModalPropertyValue )
            	    {
            	    // InternalGumboParser.g:7335:6: (lv_ownedValue_6_0= ruleOptionalModalPropertyValue )
            	    // InternalGumboParser.g:7336:7: lv_ownedValue_6_0= ruleOptionalModalPropertyValue
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueOptionalModalPropertyValueParserRuleCall_3_1_1_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_93);
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
            	    break loop130;
                }
            } while (true);


            }

            // InternalGumboParser.g:7355:3: ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==Applies) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // InternalGumboParser.g:7356:4: ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )*
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
                    // InternalGumboParser.g:7366:4: ( (lv_appliesTo_8_0= ruleContainmentPath ) )
                    // InternalGumboParser.g:7367:5: (lv_appliesTo_8_0= ruleContainmentPath )
                    {
                    // InternalGumboParser.g:7367:5: (lv_appliesTo_8_0= ruleContainmentPath )
                    // InternalGumboParser.g:7368:6: lv_appliesTo_8_0= ruleContainmentPath
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToContainmentPathParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_94);
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

                    // InternalGumboParser.g:7385:4: (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )*
                    loop131:
                    do {
                        int alt131=2;
                        int LA131_0 = input.LA(1);

                        if ( (LA131_0==Comma) ) {
                            alt131=1;
                        }


                        switch (alt131) {
                    	case 1 :
                    	    // InternalGumboParser.g:7386:5: otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) )
                    	    {
                    	    otherlv_9=(Token)match(input,Comma,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_9, grammarAccess.getContainedPropertyAssociationAccess().getCommaKeyword_4_2_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:7390:5: ( (lv_appliesTo_10_0= ruleContainmentPath ) )
                    	    // InternalGumboParser.g:7391:6: (lv_appliesTo_10_0= ruleContainmentPath )
                    	    {
                    	    // InternalGumboParser.g:7391:6: (lv_appliesTo_10_0= ruleContainmentPath )
                    	    // InternalGumboParser.g:7392:7: lv_appliesTo_10_0= ruleContainmentPath
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToContainmentPathParserRuleCall_4_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_94);
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
                    	    break loop131;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalGumboParser.g:7411:3: ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==In_1) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // InternalGumboParser.g:7412:4: ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getInBindingKeywordsParserRuleCall_5_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
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
                    // InternalGumboParser.g:7426:4: ( ( ruleQCREF ) )
                    // InternalGumboParser.g:7427:5: ( ruleQCREF )
                    {
                    // InternalGumboParser.g:7427:5: ( ruleQCREF )
                    // InternalGumboParser.g:7428:6: ruleQCREF
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
                    pushFollow(FollowSets000.FOLLOW_45);
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
    // InternalGumboParser.g:7458:1: entryRuleContainmentPath returns [EObject current=null] : iv_ruleContainmentPath= ruleContainmentPath EOF ;
    public final EObject entryRuleContainmentPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainmentPath = null;


        try {
            // InternalGumboParser.g:7458:56: (iv_ruleContainmentPath= ruleContainmentPath EOF )
            // InternalGumboParser.g:7459:2: iv_ruleContainmentPath= ruleContainmentPath EOF
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
    // InternalGumboParser.g:7465:1: ruleContainmentPath returns [EObject current=null] : ( (lv_path_0_0= ruleContainmentPathElement ) ) ;
    public final EObject ruleContainmentPath() throws RecognitionException {
        EObject current = null;

        EObject lv_path_0_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:7471:2: ( ( (lv_path_0_0= ruleContainmentPathElement ) ) )
            // InternalGumboParser.g:7472:2: ( (lv_path_0_0= ruleContainmentPathElement ) )
            {
            // InternalGumboParser.g:7472:2: ( (lv_path_0_0= ruleContainmentPathElement ) )
            // InternalGumboParser.g:7473:3: (lv_path_0_0= ruleContainmentPathElement )
            {
            // InternalGumboParser.g:7473:3: (lv_path_0_0= ruleContainmentPathElement )
            // InternalGumboParser.g:7474:4: lv_path_0_0= ruleContainmentPathElement
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
    // InternalGumboParser.g:7494:1: entryRuleOptionalModalPropertyValue returns [EObject current=null] : iv_ruleOptionalModalPropertyValue= ruleOptionalModalPropertyValue EOF ;
    public final EObject entryRuleOptionalModalPropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionalModalPropertyValue = null;


        try {
            // InternalGumboParser.g:7494:67: (iv_ruleOptionalModalPropertyValue= ruleOptionalModalPropertyValue EOF )
            // InternalGumboParser.g:7495:2: iv_ruleOptionalModalPropertyValue= ruleOptionalModalPropertyValue EOF
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
    // InternalGumboParser.g:7501:1: ruleOptionalModalPropertyValue returns [EObject current=null] : ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )? ) ;
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
            // InternalGumboParser.g:7507:2: ( ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )? ) )
            // InternalGumboParser.g:7508:2: ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )? )
            {
            // InternalGumboParser.g:7508:2: ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )? )
            // InternalGumboParser.g:7509:3: ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )?
            {
            // InternalGumboParser.g:7509:3: ( (lv_ownedValue_0_0= rulePropertyExpression ) )
            // InternalGumboParser.g:7510:4: (lv_ownedValue_0_0= rulePropertyExpression )
            {
            // InternalGumboParser.g:7510:4: (lv_ownedValue_0_0= rulePropertyExpression )
            // InternalGumboParser.g:7511:5: lv_ownedValue_0_0= rulePropertyExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOptionalModalPropertyValueAccess().getOwnedValuePropertyExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_95);
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

            // InternalGumboParser.g:7528:3: ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==In_1) ) {
                int LA135_1 = input.LA(2);

                if ( (LA135_1==Modes) ) {
                    alt135=1;
                }
            }
            switch (alt135) {
                case 1 :
                    // InternalGumboParser.g:7529:4: ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getOptionalModalPropertyValueAccess().getInModesKeywordsParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
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
                    // InternalGumboParser.g:7543:4: ( (otherlv_3= RULE_ID ) )
                    // InternalGumboParser.g:7544:5: (otherlv_3= RULE_ID )
                    {
                    // InternalGumboParser.g:7544:5: (otherlv_3= RULE_ID )
                    // InternalGumboParser.g:7545:6: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getOptionalModalPropertyValueRule());
                      						}
                      					
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getOptionalModalPropertyValueAccess().getInModeModeCrossReference_1_2_0());
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:7559:4: (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )*
                    loop134:
                    do {
                        int alt134=2;
                        int LA134_0 = input.LA(1);

                        if ( (LA134_0==Comma) ) {
                            alt134=1;
                        }


                        switch (alt134) {
                    	case 1 :
                    	    // InternalGumboParser.g:7560:5: otherlv_4= Comma ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getOptionalModalPropertyValueAccess().getCommaKeyword_1_3_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:7564:5: ( (otherlv_5= RULE_ID ) )
                    	    // InternalGumboParser.g:7565:6: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalGumboParser.g:7565:6: (otherlv_5= RULE_ID )
                    	    // InternalGumboParser.g:7566:7: otherlv_5= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							/* */
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getOptionalModalPropertyValueRule());
                    	      							}
                    	      						
                    	    }
                    	    otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_5, grammarAccess.getOptionalModalPropertyValueAccess().getInModeModeCrossReference_1_3_1_0());
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop134;
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
    // InternalGumboParser.g:7590:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalGumboParser.g:7590:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalGumboParser.g:7591:2: iv_rulePropertyValue= rulePropertyValue EOF
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
    // InternalGumboParser.g:7597:1: rulePropertyValue returns [EObject current=null] : ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedValue_0_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:7603:2: ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) )
            // InternalGumboParser.g:7604:2: ( (lv_ownedValue_0_0= rulePropertyExpression ) )
            {
            // InternalGumboParser.g:7604:2: ( (lv_ownedValue_0_0= rulePropertyExpression ) )
            // InternalGumboParser.g:7605:3: (lv_ownedValue_0_0= rulePropertyExpression )
            {
            // InternalGumboParser.g:7605:3: (lv_ownedValue_0_0= rulePropertyExpression )
            // InternalGumboParser.g:7606:4: lv_ownedValue_0_0= rulePropertyExpression
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
    // InternalGumboParser.g:7626:1: entryRulePropertyExpression returns [EObject current=null] : iv_rulePropertyExpression= rulePropertyExpression EOF ;
    public final EObject entryRulePropertyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyExpression = null;


        try {
            // InternalGumboParser.g:7626:59: (iv_rulePropertyExpression= rulePropertyExpression EOF )
            // InternalGumboParser.g:7627:2: iv_rulePropertyExpression= rulePropertyExpression EOF
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
    // InternalGumboParser.g:7633:1: rulePropertyExpression returns [EObject current=null] : (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm ) ;
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
            // InternalGumboParser.g:7639:2: ( (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm ) )
            // InternalGumboParser.g:7640:2: (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm )
            {
            // InternalGumboParser.g:7640:2: (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm )
            int alt136=11;
            alt136 = dfa136.predict(input);
            switch (alt136) {
                case 1 :
                    // InternalGumboParser.g:7641:3: this_RecordTerm_0= ruleRecordTerm
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
                    // InternalGumboParser.g:7653:3: this_ReferenceTerm_1= ruleReferenceTerm
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
                    // InternalGumboParser.g:7665:3: this_ComponentClassifierTerm_2= ruleComponentClassifierTerm
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
                    // InternalGumboParser.g:7677:3: this_ComputedTerm_3= ruleComputedTerm
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
                    // InternalGumboParser.g:7689:3: this_StringTerm_4= ruleStringTerm
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
                    // InternalGumboParser.g:7701:3: this_NumericRangeTerm_5= ruleNumericRangeTerm
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
                    // InternalGumboParser.g:7713:3: this_RealTerm_6= ruleRealTerm
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
                    // InternalGumboParser.g:7725:3: this_IntegerTerm_7= ruleIntegerTerm
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
                    // InternalGumboParser.g:7737:3: this_ListTerm_8= ruleListTerm
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
                    // InternalGumboParser.g:7749:3: this_BooleanLiteral_9= ruleBooleanLiteral
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
                    // InternalGumboParser.g:7761:3: this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm
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
    // InternalGumboParser.g:7776:1: entryRuleLiteralorReferenceTerm returns [EObject current=null] : iv_ruleLiteralorReferenceTerm= ruleLiteralorReferenceTerm EOF ;
    public final EObject entryRuleLiteralorReferenceTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralorReferenceTerm = null;


        try {
            // InternalGumboParser.g:7776:63: (iv_ruleLiteralorReferenceTerm= ruleLiteralorReferenceTerm EOF )
            // InternalGumboParser.g:7777:2: iv_ruleLiteralorReferenceTerm= ruleLiteralorReferenceTerm EOF
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
    // InternalGumboParser.g:7783:1: ruleLiteralorReferenceTerm returns [EObject current=null] : ( ( ruleQPREF ) ) ;
    public final EObject ruleLiteralorReferenceTerm() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalGumboParser.g:7789:2: ( ( ( ruleQPREF ) ) )
            // InternalGumboParser.g:7790:2: ( ( ruleQPREF ) )
            {
            // InternalGumboParser.g:7790:2: ( ( ruleQPREF ) )
            // InternalGumboParser.g:7791:3: ( ruleQPREF )
            {
            // InternalGumboParser.g:7791:3: ( ruleQPREF )
            // InternalGumboParser.g:7792:4: ruleQPREF
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
    // InternalGumboParser.g:7812:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalGumboParser.g:7812:55: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalGumboParser.g:7813:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
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
    // InternalGumboParser.g:7819:1: ruleBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalGumboParser.g:7825:2: ( ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) ) )
            // InternalGumboParser.g:7826:2: ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) )
            {
            // InternalGumboParser.g:7826:2: ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) )
            // InternalGumboParser.g:7827:3: () ( ( (lv_value_1_0= True ) ) | otherlv_2= False )
            {
            // InternalGumboParser.g:7827:3: ()
            // InternalGumboParser.g:7828:4: 
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

            // InternalGumboParser.g:7837:3: ( ( (lv_value_1_0= True ) ) | otherlv_2= False )
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==True) ) {
                alt137=1;
            }
            else if ( (LA137_0==False) ) {
                alt137=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 137, 0, input);

                throw nvae;
            }
            switch (alt137) {
                case 1 :
                    // InternalGumboParser.g:7838:4: ( (lv_value_1_0= True ) )
                    {
                    // InternalGumboParser.g:7838:4: ( (lv_value_1_0= True ) )
                    // InternalGumboParser.g:7839:5: (lv_value_1_0= True )
                    {
                    // InternalGumboParser.g:7839:5: (lv_value_1_0= True )
                    // InternalGumboParser.g:7840:6: lv_value_1_0= True
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
                    // InternalGumboParser.g:7853:4: otherlv_2= False
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
    // InternalGumboParser.g:7862:1: entryRuleConstantValue returns [EObject current=null] : iv_ruleConstantValue= ruleConstantValue EOF ;
    public final EObject entryRuleConstantValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantValue = null;


        try {
            // InternalGumboParser.g:7862:54: (iv_ruleConstantValue= ruleConstantValue EOF )
            // InternalGumboParser.g:7863:2: iv_ruleConstantValue= ruleConstantValue EOF
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
    // InternalGumboParser.g:7869:1: ruleConstantValue returns [EObject current=null] : ( ( ruleQPREF ) ) ;
    public final EObject ruleConstantValue() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalGumboParser.g:7875:2: ( ( ( ruleQPREF ) ) )
            // InternalGumboParser.g:7876:2: ( ( ruleQPREF ) )
            {
            // InternalGumboParser.g:7876:2: ( ( ruleQPREF ) )
            // InternalGumboParser.g:7877:3: ( ruleQPREF )
            {
            // InternalGumboParser.g:7877:3: ( ruleQPREF )
            // InternalGumboParser.g:7878:4: ruleQPREF
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
    // InternalGumboParser.g:7898:1: entryRuleReferenceTerm returns [EObject current=null] : iv_ruleReferenceTerm= ruleReferenceTerm EOF ;
    public final EObject entryRuleReferenceTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceTerm = null;


        try {
            // InternalGumboParser.g:7898:54: (iv_ruleReferenceTerm= ruleReferenceTerm EOF )
            // InternalGumboParser.g:7899:2: iv_ruleReferenceTerm= ruleReferenceTerm EOF
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
    // InternalGumboParser.g:7905:1: ruleReferenceTerm returns [EObject current=null] : (otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleReferenceTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_path_2_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:7911:2: ( (otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis ) )
            // InternalGumboParser.g:7912:2: (otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis )
            {
            // InternalGumboParser.g:7912:2: (otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis )
            // InternalGumboParser.g:7913:3: otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis
            {
            otherlv_0=(Token)match(input,Reference,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReferenceTermAccess().getReferenceKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReferenceTermAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGumboParser.g:7921:3: ( (lv_path_2_0= ruleContainmentPathElement ) )
            // InternalGumboParser.g:7922:4: (lv_path_2_0= ruleContainmentPathElement )
            {
            // InternalGumboParser.g:7922:4: (lv_path_2_0= ruleContainmentPathElement )
            // InternalGumboParser.g:7923:5: lv_path_2_0= ruleContainmentPathElement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReferenceTermAccess().getPathContainmentPathElementParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_45);
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
    // InternalGumboParser.g:7948:1: entryRuleRecordTerm returns [EObject current=null] : iv_ruleRecordTerm= ruleRecordTerm EOF ;
    public final EObject entryRuleRecordTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordTerm = null;


        try {
            // InternalGumboParser.g:7948:51: (iv_ruleRecordTerm= ruleRecordTerm EOF )
            // InternalGumboParser.g:7949:2: iv_ruleRecordTerm= ruleRecordTerm EOF
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
    // InternalGumboParser.g:7955:1: ruleRecordTerm returns [EObject current=null] : (otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket ) ;
    public final EObject ruleRecordTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ownedFieldValue_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:7961:2: ( (otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket ) )
            // InternalGumboParser.g:7962:2: (otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket )
            {
            // InternalGumboParser.g:7962:2: (otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket )
            // InternalGumboParser.g:7963:3: otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket
            {
            otherlv_0=(Token)match(input,LeftSquareBracket,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRecordTermAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalGumboParser.g:7967:3: ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+
            int cnt138=0;
            loop138:
            do {
                int alt138=2;
                int LA138_0 = input.LA(1);

                if ( (LA138_0==RULE_ID) ) {
                    alt138=1;
                }


                switch (alt138) {
            	case 1 :
            	    // InternalGumboParser.g:7968:4: (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation )
            	    {
            	    // InternalGumboParser.g:7968:4: (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation )
            	    // InternalGumboParser.g:7969:5: lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRecordTermAccess().getOwnedFieldValueFieldPropertyAssociationParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_96);
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
            	    if ( cnt138 >= 1 ) break loop138;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(138, input);
                        throw eee;
                }
                cnt138++;
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
    // InternalGumboParser.g:7994:1: entryRuleComputedTerm returns [EObject current=null] : iv_ruleComputedTerm= ruleComputedTerm EOF ;
    public final EObject entryRuleComputedTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComputedTerm = null;


        try {
            // InternalGumboParser.g:7994:53: (iv_ruleComputedTerm= ruleComputedTerm EOF )
            // InternalGumboParser.g:7995:2: iv_ruleComputedTerm= ruleComputedTerm EOF
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
    // InternalGumboParser.g:8001:1: ruleComputedTerm returns [EObject current=null] : (otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleComputedTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_function_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalGumboParser.g:8007:2: ( (otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis ) )
            // InternalGumboParser.g:8008:2: (otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis )
            {
            // InternalGumboParser.g:8008:2: (otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis )
            // InternalGumboParser.g:8009:3: otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis
            {
            otherlv_0=(Token)match(input,Compute,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getComputedTermAccess().getComputeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getComputedTermAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGumboParser.g:8017:3: ( (lv_function_2_0= RULE_ID ) )
            // InternalGumboParser.g:8018:4: (lv_function_2_0= RULE_ID )
            {
            // InternalGumboParser.g:8018:4: (lv_function_2_0= RULE_ID )
            // InternalGumboParser.g:8019:5: lv_function_2_0= RULE_ID
            {
            lv_function_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_45); if (state.failed) return current;
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
    // InternalGumboParser.g:8043:1: entryRuleComponentClassifierTerm returns [EObject current=null] : iv_ruleComponentClassifierTerm= ruleComponentClassifierTerm EOF ;
    public final EObject entryRuleComponentClassifierTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentClassifierTerm = null;


        try {
            // InternalGumboParser.g:8043:64: (iv_ruleComponentClassifierTerm= ruleComponentClassifierTerm EOF )
            // InternalGumboParser.g:8044:2: iv_ruleComponentClassifierTerm= ruleComponentClassifierTerm EOF
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
    // InternalGumboParser.g:8050:1: ruleComponentClassifierTerm returns [EObject current=null] : (otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleComponentClassifierTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalGumboParser.g:8056:2: ( (otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis ) )
            // InternalGumboParser.g:8057:2: (otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis )
            {
            // InternalGumboParser.g:8057:2: (otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis )
            // InternalGumboParser.g:8058:3: otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis
            {
            otherlv_0=(Token)match(input,Classifier,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getComponentClassifierTermAccess().getClassifierKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getComponentClassifierTermAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGumboParser.g:8066:3: ( ( ruleQCREF ) )
            // InternalGumboParser.g:8067:4: ( ruleQCREF )
            {
            // InternalGumboParser.g:8067:4: ( ruleQCREF )
            // InternalGumboParser.g:8068:5: ruleQCREF
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
            pushFollow(FollowSets000.FOLLOW_45);
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
    // InternalGumboParser.g:8093:1: entryRuleListTerm returns [EObject current=null] : iv_ruleListTerm= ruleListTerm EOF ;
    public final EObject entryRuleListTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListTerm = null;


        try {
            // InternalGumboParser.g:8093:49: (iv_ruleListTerm= ruleListTerm EOF )
            // InternalGumboParser.g:8094:2: iv_ruleListTerm= ruleListTerm EOF
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
    // InternalGumboParser.g:8100:1: ruleListTerm returns [EObject current=null] : ( () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis ) ;
    public final EObject ruleListTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedListElement_2_0 = null;

        EObject lv_ownedListElement_4_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:8106:2: ( ( () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis ) )
            // InternalGumboParser.g:8107:2: ( () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis )
            {
            // InternalGumboParser.g:8107:2: ( () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis )
            // InternalGumboParser.g:8108:3: () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis
            {
            // InternalGumboParser.g:8108:3: ()
            // InternalGumboParser.g:8109:4: 
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

            otherlv_1=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_97); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getListTermAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGumboParser.g:8122:3: ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==Classifier||LA140_0==Reference||LA140_0==Compute||LA140_0==False||LA140_0==True||LA140_0==LeftParenthesis||LA140_0==PlusSign||LA140_0==HyphenMinus||LA140_0==LeftSquareBracket||LA140_0==RULE_INTEGER_LIT||LA140_0==RULE_REAL_LIT||(LA140_0>=RULE_STRING && LA140_0<=RULE_ID)) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // InternalGumboParser.g:8123:4: ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )*
                    {
                    // InternalGumboParser.g:8123:4: ( (lv_ownedListElement_2_0= rulePropertyExpression ) )
                    // InternalGumboParser.g:8124:5: (lv_ownedListElement_2_0= rulePropertyExpression )
                    {
                    // InternalGumboParser.g:8124:5: (lv_ownedListElement_2_0= rulePropertyExpression )
                    // InternalGumboParser.g:8125:6: lv_ownedListElement_2_0= rulePropertyExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getListTermAccess().getOwnedListElementPropertyExpressionParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_29);
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

                    // InternalGumboParser.g:8142:4: (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )*
                    loop139:
                    do {
                        int alt139=2;
                        int LA139_0 = input.LA(1);

                        if ( (LA139_0==Comma) ) {
                            alt139=1;
                        }


                        switch (alt139) {
                    	case 1 :
                    	    // InternalGumboParser.g:8143:5: otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FollowSets000.FOLLOW_92); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getListTermAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:8147:5: ( (lv_ownedListElement_4_0= rulePropertyExpression ) )
                    	    // InternalGumboParser.g:8148:6: (lv_ownedListElement_4_0= rulePropertyExpression )
                    	    {
                    	    // InternalGumboParser.g:8148:6: (lv_ownedListElement_4_0= rulePropertyExpression )
                    	    // InternalGumboParser.g:8149:7: lv_ownedListElement_4_0= rulePropertyExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getListTermAccess().getOwnedListElementPropertyExpressionParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_29);
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
                    	    break loop139;
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
    // InternalGumboParser.g:8176:1: entryRuleFieldPropertyAssociation returns [EObject current=null] : iv_ruleFieldPropertyAssociation= ruleFieldPropertyAssociation EOF ;
    public final EObject entryRuleFieldPropertyAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldPropertyAssociation = null;


        try {
            // InternalGumboParser.g:8176:65: (iv_ruleFieldPropertyAssociation= ruleFieldPropertyAssociation EOF )
            // InternalGumboParser.g:8177:2: iv_ruleFieldPropertyAssociation= ruleFieldPropertyAssociation EOF
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
    // InternalGumboParser.g:8183:1: ruleFieldPropertyAssociation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon ) ;
    public final EObject ruleFieldPropertyAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedValue_2_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:8189:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon ) )
            // InternalGumboParser.g:8190:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon )
            {
            // InternalGumboParser.g:8190:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon )
            // InternalGumboParser.g:8191:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon
            {
            // InternalGumboParser.g:8191:3: ( (otherlv_0= RULE_ID ) )
            // InternalGumboParser.g:8192:4: (otherlv_0= RULE_ID )
            {
            // InternalGumboParser.g:8192:4: (otherlv_0= RULE_ID )
            // InternalGumboParser.g:8193:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFieldPropertyAssociationRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_68); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getFieldPropertyAssociationAccess().getPropertyBasicPropertyCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_92); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFieldPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_1());
              		
            }
            // InternalGumboParser.g:8211:3: ( (lv_ownedValue_2_0= rulePropertyExpression ) )
            // InternalGumboParser.g:8212:4: (lv_ownedValue_2_0= rulePropertyExpression )
            {
            // InternalGumboParser.g:8212:4: (lv_ownedValue_2_0= rulePropertyExpression )
            // InternalGumboParser.g:8213:5: lv_ownedValue_2_0= rulePropertyExpression
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
    // InternalGumboParser.g:8238:1: entryRuleContainmentPathElement returns [EObject current=null] : iv_ruleContainmentPathElement= ruleContainmentPathElement EOF ;
    public final EObject entryRuleContainmentPathElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainmentPathElement = null;


        try {
            // InternalGumboParser.g:8238:63: (iv_ruleContainmentPathElement= ruleContainmentPathElement EOF )
            // InternalGumboParser.g:8239:2: iv_ruleContainmentPathElement= ruleContainmentPathElement EOF
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
    // InternalGumboParser.g:8245:1: ruleContainmentPathElement returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )? ) ;
    public final EObject ruleContainmentPathElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_arrayRange_1_0 = null;

        EObject lv_path_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:8251:2: ( ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )? ) )
            // InternalGumboParser.g:8252:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )? )
            {
            // InternalGumboParser.g:8252:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )? )
            // InternalGumboParser.g:8253:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )?
            {
            // InternalGumboParser.g:8253:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* )
            // InternalGumboParser.g:8254:4: ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )*
            {
            // InternalGumboParser.g:8254:4: ( (otherlv_0= RULE_ID ) )
            // InternalGumboParser.g:8255:5: (otherlv_0= RULE_ID )
            {
            // InternalGumboParser.g:8255:5: (otherlv_0= RULE_ID )
            // InternalGumboParser.g:8256:6: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              						/* */
              					
            }
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElement(grammarAccess.getContainmentPathElementRule());
              						}
              					
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						newLeafNode(otherlv_0, grammarAccess.getContainmentPathElementAccess().getNamedElementNamedElementCrossReference_0_0_0());
              					
            }

            }


            }

            // InternalGumboParser.g:8270:4: ( (lv_arrayRange_1_0= ruleArrayRange ) )*
            loop141:
            do {
                int alt141=2;
                int LA141_0 = input.LA(1);

                if ( (LA141_0==LeftSquareBracket) ) {
                    alt141=1;
                }


                switch (alt141) {
            	case 1 :
            	    // InternalGumboParser.g:8271:5: (lv_arrayRange_1_0= ruleArrayRange )
            	    {
            	    // InternalGumboParser.g:8271:5: (lv_arrayRange_1_0= ruleArrayRange )
            	    // InternalGumboParser.g:8272:6: lv_arrayRange_1_0= ruleArrayRange
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getContainmentPathElementAccess().getArrayRangeArrayRangeParserRuleCall_0_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_35);
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
            	    break loop141;
                }
            } while (true);


            }

            // InternalGumboParser.g:8290:3: (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==FullStop) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // InternalGumboParser.g:8291:4: otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) )
                    {
                    otherlv_2=(Token)match(input,FullStop,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getContainmentPathElementAccess().getFullStopKeyword_1_0());
                      			
                    }
                    // InternalGumboParser.g:8295:4: ( (lv_path_3_0= ruleContainmentPathElement ) )
                    // InternalGumboParser.g:8296:5: (lv_path_3_0= ruleContainmentPathElement )
                    {
                    // InternalGumboParser.g:8296:5: (lv_path_3_0= ruleContainmentPathElement )
                    // InternalGumboParser.g:8297:6: lv_path_3_0= ruleContainmentPathElement
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
    // InternalGumboParser.g:8319:1: entryRulePlusMinus returns [String current=null] : iv_rulePlusMinus= rulePlusMinus EOF ;
    public final String entryRulePlusMinus() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePlusMinus = null;


        try {
            // InternalGumboParser.g:8319:49: (iv_rulePlusMinus= rulePlusMinus EOF )
            // InternalGumboParser.g:8320:2: iv_rulePlusMinus= rulePlusMinus EOF
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
    // InternalGumboParser.g:8326:1: rulePlusMinus returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= PlusSign | kw= HyphenMinus ) ;
    public final AntlrDatatypeRuleToken rulePlusMinus() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumboParser.g:8332:2: ( (kw= PlusSign | kw= HyphenMinus ) )
            // InternalGumboParser.g:8333:2: (kw= PlusSign | kw= HyphenMinus )
            {
            // InternalGumboParser.g:8333:2: (kw= PlusSign | kw= HyphenMinus )
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==PlusSign) ) {
                alt143=1;
            }
            else if ( (LA143_0==HyphenMinus) ) {
                alt143=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 143, 0, input);

                throw nvae;
            }
            switch (alt143) {
                case 1 :
                    // InternalGumboParser.g:8334:3: kw= PlusSign
                    {
                    kw=(Token)match(input,PlusSign,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPlusMinusAccess().getPlusSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:8340:3: kw= HyphenMinus
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
    // InternalGumboParser.g:8349:1: entryRuleStringTerm returns [EObject current=null] : iv_ruleStringTerm= ruleStringTerm EOF ;
    public final EObject entryRuleStringTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringTerm = null;


        try {
            // InternalGumboParser.g:8349:51: (iv_ruleStringTerm= ruleStringTerm EOF )
            // InternalGumboParser.g:8350:2: iv_ruleStringTerm= ruleStringTerm EOF
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
    // InternalGumboParser.g:8356:1: ruleStringTerm returns [EObject current=null] : ( (lv_value_0_0= ruleNoQuoteString ) ) ;
    public final EObject ruleStringTerm() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:8362:2: ( ( (lv_value_0_0= ruleNoQuoteString ) ) )
            // InternalGumboParser.g:8363:2: ( (lv_value_0_0= ruleNoQuoteString ) )
            {
            // InternalGumboParser.g:8363:2: ( (lv_value_0_0= ruleNoQuoteString ) )
            // InternalGumboParser.g:8364:3: (lv_value_0_0= ruleNoQuoteString )
            {
            // InternalGumboParser.g:8364:3: (lv_value_0_0= ruleNoQuoteString )
            // InternalGumboParser.g:8365:4: lv_value_0_0= ruleNoQuoteString
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
    // InternalGumboParser.g:8385:1: entryRuleNoQuoteString returns [String current=null] : iv_ruleNoQuoteString= ruleNoQuoteString EOF ;
    public final String entryRuleNoQuoteString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNoQuoteString = null;


        try {
            // InternalGumboParser.g:8385:53: (iv_ruleNoQuoteString= ruleNoQuoteString EOF )
            // InternalGumboParser.g:8386:2: iv_ruleNoQuoteString= ruleNoQuoteString EOF
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
    // InternalGumboParser.g:8392:1: ruleNoQuoteString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleNoQuoteString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalGumboParser.g:8398:2: (this_STRING_0= RULE_STRING )
            // InternalGumboParser.g:8399:2: this_STRING_0= RULE_STRING
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
    // InternalGumboParser.g:8409:1: entryRuleArrayRange returns [EObject current=null] : iv_ruleArrayRange= ruleArrayRange EOF ;
    public final EObject entryRuleArrayRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayRange = null;


        try {
            // InternalGumboParser.g:8409:51: (iv_ruleArrayRange= ruleArrayRange EOF )
            // InternalGumboParser.g:8410:2: iv_ruleArrayRange= ruleArrayRange EOF
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
    // InternalGumboParser.g:8416:1: ruleArrayRange returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleArrayRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_lowerBound_2_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_4_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:8422:2: ( ( () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket ) )
            // InternalGumboParser.g:8423:2: ( () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket )
            {
            // InternalGumboParser.g:8423:2: ( () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket )
            // InternalGumboParser.g:8424:3: () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket
            {
            // InternalGumboParser.g:8424:3: ()
            // InternalGumboParser.g:8425:4: 
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

            otherlv_1=(Token)match(input,LeftSquareBracket,FollowSets000.FOLLOW_98); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getArrayRangeAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalGumboParser.g:8438:3: ( (lv_lowerBound_2_0= ruleINTVALUE ) )
            // InternalGumboParser.g:8439:4: (lv_lowerBound_2_0= ruleINTVALUE )
            {
            // InternalGumboParser.g:8439:4: (lv_lowerBound_2_0= ruleINTVALUE )
            // InternalGumboParser.g:8440:5: lv_lowerBound_2_0= ruleINTVALUE
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArrayRangeAccess().getLowerBoundINTVALUEParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_99);
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

            // InternalGumboParser.g:8457:3: (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==FullStopFullStop) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // InternalGumboParser.g:8458:4: otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) )
                    {
                    otherlv_3=(Token)match(input,FullStopFullStop,FollowSets000.FOLLOW_98); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getArrayRangeAccess().getFullStopFullStopKeyword_3_0());
                      			
                    }
                    // InternalGumboParser.g:8462:4: ( (lv_upperBound_4_0= ruleINTVALUE ) )
                    // InternalGumboParser.g:8463:5: (lv_upperBound_4_0= ruleINTVALUE )
                    {
                    // InternalGumboParser.g:8463:5: (lv_upperBound_4_0= ruleINTVALUE )
                    // InternalGumboParser.g:8464:6: lv_upperBound_4_0= ruleINTVALUE
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getArrayRangeAccess().getUpperBoundINTVALUEParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_100);
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
    // InternalGumboParser.g:8490:1: entryRuleSignedConstant returns [EObject current=null] : iv_ruleSignedConstant= ruleSignedConstant EOF ;
    public final EObject entryRuleSignedConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignedConstant = null;


        try {
            // InternalGumboParser.g:8490:55: (iv_ruleSignedConstant= ruleSignedConstant EOF )
            // InternalGumboParser.g:8491:2: iv_ruleSignedConstant= ruleSignedConstant EOF
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
    // InternalGumboParser.g:8497:1: ruleSignedConstant returns [EObject current=null] : ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) ) ;
    public final EObject ruleSignedConstant() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_ownedPropertyExpression_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:8503:2: ( ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) ) )
            // InternalGumboParser.g:8504:2: ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) )
            {
            // InternalGumboParser.g:8504:2: ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) )
            // InternalGumboParser.g:8505:3: ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) )
            {
            // InternalGumboParser.g:8505:3: ( (lv_op_0_0= rulePlusMinus ) )
            // InternalGumboParser.g:8506:4: (lv_op_0_0= rulePlusMinus )
            {
            // InternalGumboParser.g:8506:4: (lv_op_0_0= rulePlusMinus )
            // InternalGumboParser.g:8507:5: lv_op_0_0= rulePlusMinus
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSignedConstantAccess().getOpPlusMinusParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_101);
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

            // InternalGumboParser.g:8524:3: ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) )
            // InternalGumboParser.g:8525:4: (lv_ownedPropertyExpression_1_0= ruleConstantValue )
            {
            // InternalGumboParser.g:8525:4: (lv_ownedPropertyExpression_1_0= ruleConstantValue )
            // InternalGumboParser.g:8526:5: lv_ownedPropertyExpression_1_0= ruleConstantValue
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
    // InternalGumboParser.g:8547:1: entryRuleIntegerTerm returns [EObject current=null] : iv_ruleIntegerTerm= ruleIntegerTerm EOF ;
    public final EObject entryRuleIntegerTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerTerm = null;


        try {
            // InternalGumboParser.g:8547:52: (iv_ruleIntegerTerm= ruleIntegerTerm EOF )
            // InternalGumboParser.g:8548:2: iv_ruleIntegerTerm= ruleIntegerTerm EOF
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
    // InternalGumboParser.g:8554:1: ruleIntegerTerm returns [EObject current=null] : ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? ) ;
    public final EObject ruleIntegerTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:8560:2: ( ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? ) )
            // InternalGumboParser.g:8561:2: ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? )
            {
            // InternalGumboParser.g:8561:2: ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? )
            // InternalGumboParser.g:8562:3: ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )?
            {
            // InternalGumboParser.g:8562:3: ( (lv_value_0_0= ruleSignedInt ) )
            // InternalGumboParser.g:8563:4: (lv_value_0_0= ruleSignedInt )
            {
            // InternalGumboParser.g:8563:4: (lv_value_0_0= ruleSignedInt )
            // InternalGumboParser.g:8564:5: lv_value_0_0= ruleSignedInt
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

            // InternalGumboParser.g:8581:3: ( (otherlv_1= RULE_ID ) )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==RULE_ID) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // InternalGumboParser.g:8582:4: (otherlv_1= RULE_ID )
                    {
                    // InternalGumboParser.g:8582:4: (otherlv_1= RULE_ID )
                    // InternalGumboParser.g:8583:5: otherlv_1= RULE_ID
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
    // InternalGumboParser.g:8601:1: entryRuleSignedInt returns [String current=null] : iv_ruleSignedInt= ruleSignedInt EOF ;
    public final String entryRuleSignedInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedInt = null;


        try {
            // InternalGumboParser.g:8601:49: (iv_ruleSignedInt= ruleSignedInt EOF )
            // InternalGumboParser.g:8602:2: iv_ruleSignedInt= ruleSignedInt EOF
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
    // InternalGumboParser.g:8608:1: ruleSignedInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT ) ;
    public final AntlrDatatypeRuleToken ruleSignedInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INTEGER_LIT_2=null;


        	enterRule();

        try {
            // InternalGumboParser.g:8614:2: ( ( (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT ) )
            // InternalGumboParser.g:8615:2: ( (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT )
            {
            // InternalGumboParser.g:8615:2: ( (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT )
            // InternalGumboParser.g:8616:3: (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT
            {
            // InternalGumboParser.g:8616:3: (kw= PlusSign | kw= HyphenMinus )?
            int alt146=3;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==PlusSign) ) {
                alt146=1;
            }
            else if ( (LA146_0==HyphenMinus) ) {
                alt146=2;
            }
            switch (alt146) {
                case 1 :
                    // InternalGumboParser.g:8617:4: kw= PlusSign
                    {
                    kw=(Token)match(input,PlusSign,FollowSets000.FOLLOW_98); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSignedIntAccess().getPlusSignKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:8623:4: kw= HyphenMinus
                    {
                    kw=(Token)match(input,HyphenMinus,FollowSets000.FOLLOW_98); if (state.failed) return current;
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
    // InternalGumboParser.g:8640:1: entryRuleRealTerm returns [EObject current=null] : iv_ruleRealTerm= ruleRealTerm EOF ;
    public final EObject entryRuleRealTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealTerm = null;


        try {
            // InternalGumboParser.g:8640:49: (iv_ruleRealTerm= ruleRealTerm EOF )
            // InternalGumboParser.g:8641:2: iv_ruleRealTerm= ruleRealTerm EOF
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
    // InternalGumboParser.g:8647:1: ruleRealTerm returns [EObject current=null] : ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? ) ;
    public final EObject ruleRealTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:8653:2: ( ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? ) )
            // InternalGumboParser.g:8654:2: ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? )
            {
            // InternalGumboParser.g:8654:2: ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? )
            // InternalGumboParser.g:8655:3: ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )?
            {
            // InternalGumboParser.g:8655:3: ( (lv_value_0_0= ruleSignedReal ) )
            // InternalGumboParser.g:8656:4: (lv_value_0_0= ruleSignedReal )
            {
            // InternalGumboParser.g:8656:4: (lv_value_0_0= ruleSignedReal )
            // InternalGumboParser.g:8657:5: lv_value_0_0= ruleSignedReal
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

            // InternalGumboParser.g:8674:3: ( (otherlv_1= RULE_ID ) )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==RULE_ID) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // InternalGumboParser.g:8675:4: (otherlv_1= RULE_ID )
                    {
                    // InternalGumboParser.g:8675:4: (otherlv_1= RULE_ID )
                    // InternalGumboParser.g:8676:5: otherlv_1= RULE_ID
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
    // InternalGumboParser.g:8694:1: entryRuleSignedReal returns [String current=null] : iv_ruleSignedReal= ruleSignedReal EOF ;
    public final String entryRuleSignedReal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedReal = null;


        try {
            // InternalGumboParser.g:8694:50: (iv_ruleSignedReal= ruleSignedReal EOF )
            // InternalGumboParser.g:8695:2: iv_ruleSignedReal= ruleSignedReal EOF
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
    // InternalGumboParser.g:8701:1: ruleSignedReal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT ) ;
    public final AntlrDatatypeRuleToken ruleSignedReal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_REAL_LIT_2=null;


        	enterRule();

        try {
            // InternalGumboParser.g:8707:2: ( ( (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT ) )
            // InternalGumboParser.g:8708:2: ( (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT )
            {
            // InternalGumboParser.g:8708:2: ( (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT )
            // InternalGumboParser.g:8709:3: (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT
            {
            // InternalGumboParser.g:8709:3: (kw= PlusSign | kw= HyphenMinus )?
            int alt148=3;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==PlusSign) ) {
                alt148=1;
            }
            else if ( (LA148_0==HyphenMinus) ) {
                alt148=2;
            }
            switch (alt148) {
                case 1 :
                    // InternalGumboParser.g:8710:4: kw= PlusSign
                    {
                    kw=(Token)match(input,PlusSign,FollowSets000.FOLLOW_102); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSignedRealAccess().getPlusSignKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:8716:4: kw= HyphenMinus
                    {
                    kw=(Token)match(input,HyphenMinus,FollowSets000.FOLLOW_102); if (state.failed) return current;
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
    // InternalGumboParser.g:8733:1: entryRuleNumericRangeTerm returns [EObject current=null] : iv_ruleNumericRangeTerm= ruleNumericRangeTerm EOF ;
    public final EObject entryRuleNumericRangeTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericRangeTerm = null;


        try {
            // InternalGumboParser.g:8733:57: (iv_ruleNumericRangeTerm= ruleNumericRangeTerm EOF )
            // InternalGumboParser.g:8734:2: iv_ruleNumericRangeTerm= ruleNumericRangeTerm EOF
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
    // InternalGumboParser.g:8740:1: ruleNumericRangeTerm returns [EObject current=null] : ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )? ) ;
    public final EObject ruleNumericRangeTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_minimum_0_0 = null;

        EObject lv_maximum_2_0 = null;

        EObject lv_delta_4_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:8746:2: ( ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )? ) )
            // InternalGumboParser.g:8747:2: ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )? )
            {
            // InternalGumboParser.g:8747:2: ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )? )
            // InternalGumboParser.g:8748:3: ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )?
            {
            // InternalGumboParser.g:8748:3: ( (lv_minimum_0_0= ruleNumAlt ) )
            // InternalGumboParser.g:8749:4: (lv_minimum_0_0= ruleNumAlt )
            {
            // InternalGumboParser.g:8749:4: (lv_minimum_0_0= ruleNumAlt )
            // InternalGumboParser.g:8750:5: lv_minimum_0_0= ruleNumAlt
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNumericRangeTermAccess().getMinimumNumAltParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_103);
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

            otherlv_1=(Token)match(input,FullStopFullStop,FollowSets000.FOLLOW_101); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNumericRangeTermAccess().getFullStopFullStopKeyword_1());
              		
            }
            // InternalGumboParser.g:8771:3: ( (lv_maximum_2_0= ruleNumAlt ) )
            // InternalGumboParser.g:8772:4: (lv_maximum_2_0= ruleNumAlt )
            {
            // InternalGumboParser.g:8772:4: (lv_maximum_2_0= ruleNumAlt )
            // InternalGumboParser.g:8773:5: lv_maximum_2_0= ruleNumAlt
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNumericRangeTermAccess().getMaximumNumAltParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_104);
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

            // InternalGumboParser.g:8790:3: (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==Delta) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // InternalGumboParser.g:8791:4: otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) )
                    {
                    otherlv_3=(Token)match(input,Delta,FollowSets000.FOLLOW_101); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getNumericRangeTermAccess().getDeltaKeyword_3_0());
                      			
                    }
                    // InternalGumboParser.g:8795:4: ( (lv_delta_4_0= ruleNumAlt ) )
                    // InternalGumboParser.g:8796:5: (lv_delta_4_0= ruleNumAlt )
                    {
                    // InternalGumboParser.g:8796:5: (lv_delta_4_0= ruleNumAlt )
                    // InternalGumboParser.g:8797:6: lv_delta_4_0= ruleNumAlt
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
    // InternalGumboParser.g:8819:1: entryRuleNumAlt returns [EObject current=null] : iv_ruleNumAlt= ruleNumAlt EOF ;
    public final EObject entryRuleNumAlt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumAlt = null;


        try {
            // InternalGumboParser.g:8819:47: (iv_ruleNumAlt= ruleNumAlt EOF )
            // InternalGumboParser.g:8820:2: iv_ruleNumAlt= ruleNumAlt EOF
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
    // InternalGumboParser.g:8826:1: ruleNumAlt returns [EObject current=null] : (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue ) ;
    public final EObject ruleNumAlt() throws RecognitionException {
        EObject current = null;

        EObject this_RealTerm_0 = null;

        EObject this_IntegerTerm_1 = null;

        EObject this_SignedConstant_2 = null;

        EObject this_ConstantValue_3 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:8832:2: ( (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue ) )
            // InternalGumboParser.g:8833:2: (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue )
            {
            // InternalGumboParser.g:8833:2: (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue )
            int alt150=4;
            switch ( input.LA(1) ) {
            case PlusSign:
                {
                switch ( input.LA(2) ) {
                case RULE_REAL_LIT:
                    {
                    alt150=1;
                    }
                    break;
                case RULE_INTEGER_LIT:
                    {
                    alt150=2;
                    }
                    break;
                case RULE_ID:
                    {
                    alt150=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 150, 1, input);

                    throw nvae;
                }

                }
                break;
            case HyphenMinus:
                {
                switch ( input.LA(2) ) {
                case RULE_REAL_LIT:
                    {
                    alt150=1;
                    }
                    break;
                case RULE_ID:
                    {
                    alt150=3;
                    }
                    break;
                case RULE_INTEGER_LIT:
                    {
                    alt150=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 150, 2, input);

                    throw nvae;
                }

                }
                break;
            case RULE_REAL_LIT:
                {
                alt150=1;
                }
                break;
            case RULE_INTEGER_LIT:
                {
                alt150=2;
                }
                break;
            case RULE_ID:
                {
                alt150=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 150, 0, input);

                throw nvae;
            }

            switch (alt150) {
                case 1 :
                    // InternalGumboParser.g:8834:3: this_RealTerm_0= ruleRealTerm
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
                    // InternalGumboParser.g:8846:3: this_IntegerTerm_1= ruleIntegerTerm
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
                    // InternalGumboParser.g:8858:3: this_SignedConstant_2= ruleSignedConstant
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
                    // InternalGumboParser.g:8870:3: this_ConstantValue_3= ruleConstantValue
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
    // InternalGumboParser.g:8885:1: entryRuleAppliesToKeywords returns [String current=null] : iv_ruleAppliesToKeywords= ruleAppliesToKeywords EOF ;
    public final String entryRuleAppliesToKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAppliesToKeywords = null;


        try {
            // InternalGumboParser.g:8885:57: (iv_ruleAppliesToKeywords= ruleAppliesToKeywords EOF )
            // InternalGumboParser.g:8886:2: iv_ruleAppliesToKeywords= ruleAppliesToKeywords EOF
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
    // InternalGumboParser.g:8892:1: ruleAppliesToKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Applies kw= To_1 ) ;
    public final AntlrDatatypeRuleToken ruleAppliesToKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumboParser.g:8898:2: ( (kw= Applies kw= To_1 ) )
            // InternalGumboParser.g:8899:2: (kw= Applies kw= To_1 )
            {
            // InternalGumboParser.g:8899:2: (kw= Applies kw= To_1 )
            // InternalGumboParser.g:8900:3: kw= Applies kw= To_1
            {
            kw=(Token)match(input,Applies,FollowSets000.FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getAppliesToKeywordsAccess().getAppliesKeyword_0());
              		
            }
            kw=(Token)match(input,To_1,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalGumboParser.g:8914:1: entryRuleInBindingKeywords returns [String current=null] : iv_ruleInBindingKeywords= ruleInBindingKeywords EOF ;
    public final String entryRuleInBindingKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInBindingKeywords = null;


        try {
            // InternalGumboParser.g:8914:57: (iv_ruleInBindingKeywords= ruleInBindingKeywords EOF )
            // InternalGumboParser.g:8915:2: iv_ruleInBindingKeywords= ruleInBindingKeywords EOF
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
    // InternalGumboParser.g:8921:1: ruleInBindingKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= In_1 kw= Binding ) ;
    public final AntlrDatatypeRuleToken ruleInBindingKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumboParser.g:8927:2: ( (kw= In_1 kw= Binding ) )
            // InternalGumboParser.g:8928:2: (kw= In_1 kw= Binding )
            {
            // InternalGumboParser.g:8928:2: (kw= In_1 kw= Binding )
            // InternalGumboParser.g:8929:3: kw= In_1 kw= Binding
            {
            kw=(Token)match(input,In_1,FollowSets000.FOLLOW_105); if (state.failed) return current;
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
    // InternalGumboParser.g:8943:1: entryRuleInModesKeywords returns [String current=null] : iv_ruleInModesKeywords= ruleInModesKeywords EOF ;
    public final String entryRuleInModesKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInModesKeywords = null;


        try {
            // InternalGumboParser.g:8943:55: (iv_ruleInModesKeywords= ruleInModesKeywords EOF )
            // InternalGumboParser.g:8944:2: iv_ruleInModesKeywords= ruleInModesKeywords EOF
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
    // InternalGumboParser.g:8950:1: ruleInModesKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= In_1 kw= Modes ) ;
    public final AntlrDatatypeRuleToken ruleInModesKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumboParser.g:8956:2: ( (kw= In_1 kw= Modes ) )
            // InternalGumboParser.g:8957:2: (kw= In_1 kw= Modes )
            {
            // InternalGumboParser.g:8957:2: (kw= In_1 kw= Modes )
            // InternalGumboParser.g:8958:3: kw= In_1 kw= Modes
            {
            kw=(Token)match(input,In_1,FollowSets000.FOLLOW_106); if (state.failed) return current;
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
    // InternalGumboParser.g:8972:1: entryRuleINTVALUE returns [String current=null] : iv_ruleINTVALUE= ruleINTVALUE EOF ;
    public final String entryRuleINTVALUE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTVALUE = null;


        try {
            // InternalGumboParser.g:8972:48: (iv_ruleINTVALUE= ruleINTVALUE EOF )
            // InternalGumboParser.g:8973:2: iv_ruleINTVALUE= ruleINTVALUE EOF
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
    // InternalGumboParser.g:8979:1: ruleINTVALUE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INTEGER_LIT_0= RULE_INTEGER_LIT ;
    public final AntlrDatatypeRuleToken ruleINTVALUE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INTEGER_LIT_0=null;


        	enterRule();

        try {
            // InternalGumboParser.g:8985:2: (this_INTEGER_LIT_0= RULE_INTEGER_LIT )
            // InternalGumboParser.g:8986:2: this_INTEGER_LIT_0= RULE_INTEGER_LIT
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
    // InternalGumboParser.g:8996:1: entryRuleQCLREF returns [String current=null] : iv_ruleQCLREF= ruleQCLREF EOF ;
    public final String entryRuleQCLREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQCLREF = null;


        try {
            // InternalGumboParser.g:8996:46: (iv_ruleQCLREF= ruleQCLREF EOF )
            // InternalGumboParser.g:8997:2: iv_ruleQCLREF= ruleQCLREF EOF
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
    // InternalGumboParser.g:9003:1: ruleQCLREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= ColonColon this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleQCLREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalGumboParser.g:9009:2: ( (this_ID_0= RULE_ID kw= ColonColon this_ID_2= RULE_ID ) )
            // InternalGumboParser.g:9010:2: (this_ID_0= RULE_ID kw= ColonColon this_ID_2= RULE_ID )
            {
            // InternalGumboParser.g:9010:2: (this_ID_0= RULE_ID kw= ColonColon this_ID_2= RULE_ID )
            // InternalGumboParser.g:9011:3: this_ID_0= RULE_ID kw= ColonColon this_ID_2= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_107); if (state.failed) return current;
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
    // InternalGumboParser.g:9034:1: entryRuleQPREF returns [String current=null] : iv_ruleQPREF= ruleQPREF EOF ;
    public final String entryRuleQPREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQPREF = null;


        try {
            // InternalGumboParser.g:9034:45: (iv_ruleQPREF= ruleQPREF EOF )
            // InternalGumboParser.g:9035:2: iv_ruleQPREF= ruleQPREF EOF
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
    // InternalGumboParser.g:9041:1: ruleQPREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleQPREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalGumboParser.g:9047:2: ( (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )? ) )
            // InternalGumboParser.g:9048:2: (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )? )
            {
            // InternalGumboParser.g:9048:2: (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )? )
            // InternalGumboParser.g:9049:3: this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_108); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQPREFAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalGumboParser.g:9056:3: (kw= ColonColon this_ID_2= RULE_ID )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==ColonColon) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // InternalGumboParser.g:9057:4: kw= ColonColon this_ID_2= RULE_ID
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
    // InternalGumboParser.g:9074:1: entryRuleQCREF returns [String current=null] : iv_ruleQCREF= ruleQCREF EOF ;
    public final String entryRuleQCREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQCREF = null;


        try {
            // InternalGumboParser.g:9074:45: (iv_ruleQCREF= ruleQCREF EOF )
            // InternalGumboParser.g:9075:2: iv_ruleQCREF= ruleQCREF EOF
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
    // InternalGumboParser.g:9081:1: ruleQCREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleQCREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;


        	enterRule();

        try {
            // InternalGumboParser.g:9087:2: ( ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? ) )
            // InternalGumboParser.g:9088:2: ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? )
            {
            // InternalGumboParser.g:9088:2: ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? )
            // InternalGumboParser.g:9089:3: (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )?
            {
            // InternalGumboParser.g:9089:3: (this_ID_0= RULE_ID kw= ColonColon )*
            loop152:
            do {
                int alt152=2;
                int LA152_0 = input.LA(1);

                if ( (LA152_0==RULE_ID) ) {
                    int LA152_1 = input.LA(2);

                    if ( (LA152_1==ColonColon) ) {
                        alt152=1;
                    }


                }


                switch (alt152) {
            	case 1 :
            	    // InternalGumboParser.g:9090:4: this_ID_0= RULE_ID kw= ColonColon
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_107); if (state.failed) return current;
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
            	    break loop152;
                }
            } while (true);

            this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_2, grammarAccess.getQCREFAccess().getIDTerminalRuleCall_1());
              		
            }
            // InternalGumboParser.g:9110:3: (kw= FullStop this_ID_4= RULE_ID )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==FullStop) ) {
                alt153=1;
            }
            switch (alt153) {
                case 1 :
                    // InternalGumboParser.g:9111:4: kw= FullStop this_ID_4= RULE_ID
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
    // InternalGumboParser.g:9128:1: entryRuleSTAR returns [String current=null] : iv_ruleSTAR= ruleSTAR EOF ;
    public final String entryRuleSTAR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSTAR = null;


        try {
            // InternalGumboParser.g:9128:44: (iv_ruleSTAR= ruleSTAR EOF )
            // InternalGumboParser.g:9129:2: iv_ruleSTAR= ruleSTAR EOF
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
    // InternalGumboParser.g:9135:1: ruleSTAR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= Asterisk ;
    public final AntlrDatatypeRuleToken ruleSTAR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumboParser.g:9141:2: (kw= Asterisk )
            // InternalGumboParser.g:9142:2: kw= Asterisk
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

    // $ANTLR start synpred33_InternalGumboParser
    public final void synpred33_InternalGumboParser_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        EObject lv_path_3_0 = null;


        // InternalGumboParser.g:1612:4: (otherlv_2= FullStop ( (lv_path_3_0= ruleOtherDataRef ) ) )
        // InternalGumboParser.g:1612:4: otherlv_2= FullStop ( (lv_path_3_0= ruleOtherDataRef ) )
        {
        otherlv_2=(Token)match(input,FullStop,FollowSets000.FOLLOW_8); if (state.failed) return ;
        // InternalGumboParser.g:1616:4: ( (lv_path_3_0= ruleOtherDataRef ) )
        // InternalGumboParser.g:1617:5: (lv_path_3_0= ruleOtherDataRef )
        {
        // InternalGumboParser.g:1617:5: (lv_path_3_0= ruleOtherDataRef )
        // InternalGumboParser.g:1618:6: lv_path_3_0= ruleOtherDataRef
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
    // $ANTLR end synpred33_InternalGumboParser

    // $ANTLR start synpred39_InternalGumboParser
    public final void synpred39_InternalGumboParser_fragment() throws RecognitionException {   
        EObject lv_c_8_0 = null;


        // InternalGumboParser.g:1883:4: ( (lv_c_8_0= ruleSlangDefContract ) )
        // InternalGumboParser.g:1883:4: (lv_c_8_0= ruleSlangDefContract )
        {
        // InternalGumboParser.g:1883:4: (lv_c_8_0= ruleSlangDefContract )
        // InternalGumboParser.g:1884:5: lv_c_8_0= ruleSlangDefContract
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getSlangDefDeclAccess().getCSlangDefContractParserRuleCall_8_0());
          				
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_c_8_0=ruleSlangDefContract();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred39_InternalGumboParser

    // $ANTLR start synpred135_InternalGumboParser
    public final void synpred135_InternalGumboParser_fragment() throws RecognitionException {   
        Token otherlv_53=null;
        EObject lv_ref_54_0 = null;


        // InternalGumboParser.g:5714:5: (otherlv_53= FullStop ( (lv_ref_54_0= ruleOtherDataRef ) ) )
        // InternalGumboParser.g:5714:5: otherlv_53= FullStop ( (lv_ref_54_0= ruleOtherDataRef ) )
        {
        otherlv_53=(Token)match(input,FullStop,FollowSets000.FOLLOW_8); if (state.failed) return ;
        // InternalGumboParser.g:5718:5: ( (lv_ref_54_0= ruleOtherDataRef ) )
        // InternalGumboParser.g:5719:6: (lv_ref_54_0= ruleOtherDataRef )
        {
        // InternalGumboParser.g:5719:6: (lv_ref_54_0= ruleOtherDataRef )
        // InternalGumboParser.g:5720:7: lv_ref_54_0= ruleOtherDataRef
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getSlangTermAccess().getRefOtherDataRefParserRuleCall_10_2_1_0());
          						
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_ref_54_0=ruleOtherDataRef();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred135_InternalGumboParser

    // $ANTLR start synpred142_InternalGumboParser
    public final void synpred142_InternalGumboParser_fragment() throws RecognitionException {   
        Token otherlv_72=null;
        Token otherlv_74=null;
        EObject lv_p_71_0 = null;

        EObject lv_e_73_0 = null;


        // InternalGumboParser.g:5912:5: ( ( ( ( (lv_p_71_0= ruleSlangParams ) ) otherlv_72= EqualsSignGreaterThanSign )? ( (lv_e_73_0= ruleExpr ) ) otherlv_74= RightCurlyBracket ) )
        // InternalGumboParser.g:5912:5: ( ( ( (lv_p_71_0= ruleSlangParams ) ) otherlv_72= EqualsSignGreaterThanSign )? ( (lv_e_73_0= ruleExpr ) ) otherlv_74= RightCurlyBracket )
        {
        // InternalGumboParser.g:5912:5: ( ( ( (lv_p_71_0= ruleSlangParams ) ) otherlv_72= EqualsSignGreaterThanSign )? ( (lv_e_73_0= ruleExpr ) ) otherlv_74= RightCurlyBracket )
        // InternalGumboParser.g:5913:6: ( ( (lv_p_71_0= ruleSlangParams ) ) otherlv_72= EqualsSignGreaterThanSign )? ( (lv_e_73_0= ruleExpr ) ) otherlv_74= RightCurlyBracket
        {
        // InternalGumboParser.g:5913:6: ( ( (lv_p_71_0= ruleSlangParams ) ) otherlv_72= EqualsSignGreaterThanSign )?
        int alt183=2;
        int LA183_0 = input.LA(1);

        if ( (LA183_0==LeftParenthesis) ) {
            int LA183_1 = input.LA(2);

            if ( (LA183_1==Var) ) {
                alt183=1;
            }
            else if ( (LA183_1==RULE_ID) ) {
                int LA183_4 = input.LA(3);

                if ( (LA183_4==Colon) ) {
                    alt183=1;
                }
            }
        }
        switch (alt183) {
            case 1 :
                // InternalGumboParser.g:5914:7: ( (lv_p_71_0= ruleSlangParams ) ) otherlv_72= EqualsSignGreaterThanSign
                {
                // InternalGumboParser.g:5914:7: ( (lv_p_71_0= ruleSlangParams ) )
                // InternalGumboParser.g:5915:8: (lv_p_71_0= ruleSlangParams )
                {
                // InternalGumboParser.g:5915:8: (lv_p_71_0= ruleSlangParams )
                // InternalGumboParser.g:5916:9: lv_p_71_0= ruleSlangParams
                {
                if ( state.backtracking==0 ) {

                  									newCompositeNode(grammarAccess.getSlangTermAccess().getPSlangParamsParserRuleCall_13_2_0_0_0_0());
                  								
                }
                pushFollow(FollowSets000.FOLLOW_68);
                lv_p_71_0=ruleSlangParams();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                otherlv_72=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_15); if (state.failed) return ;

                }
                break;

        }

        // InternalGumboParser.g:5938:6: ( (lv_e_73_0= ruleExpr ) )
        // InternalGumboParser.g:5939:7: (lv_e_73_0= ruleExpr )
        {
        // InternalGumboParser.g:5939:7: (lv_e_73_0= ruleExpr )
        // InternalGumboParser.g:5940:8: lv_e_73_0= ruleExpr
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getSlangTermAccess().getEExprParserRuleCall_13_2_0_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_81);
        lv_e_73_0=ruleExpr();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_74=(Token)match(input,RightCurlyBracket,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred142_InternalGumboParser

    // Delegated rules

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
    public final boolean synpred33_InternalGumboParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalGumboParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_InternalGumboParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalGumboParser_fragment(); // can never throw exception
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


    protected DFA110 dfa110 = new DFA110(this);
    protected DFA109 dfa109 = new DFA109(this);
    protected DFA136 dfa136 = new DFA136(this);
    static final String dfa_1s = "\36\uffff";
    static final String dfa_2s = "\10\uffff\1\17\10\uffff\1\17\5\uffff\1\32\6\uffff";
    static final String dfa_3s = "\1\16\7\uffff\1\14\3\uffff\1\165\1\uffff\1\165\1\uffff\1\30\1\14\1\72\1\30\2\165\1\uffff\1\14\1\72\1\30\1\uffff\1\165\1\30\1\103";
    static final String dfa_4s = "\1\165\7\uffff\1\165\3\uffff\1\165\1\uffff\1\165\1\uffff\2\165\1\122\3\165\1\uffff\1\165\1\122\1\165\1\uffff\2\165\1\122";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\14\1\15\1\16\1\uffff\1\10\1\uffff\1\13\6\uffff\1\12\3\uffff\1\11\3\uffff";
    static final String dfa_6s = "\36\uffff}>";
    static final String[] dfa_7s = {
            "\1\7\1\5\3\uffff\1\4\3\uffff\1\6\10\uffff\1\1\14\uffff\1\1\2\uffff\2\1\1\uffff\1\12\2\uffff\1\1\12\uffff\1\3\1\uffff\1\11\11\uffff\2\1\3\uffff\1\13\4\uffff\2\1\2\uffff\3\2\10\uffff\3\1\1\uffff\3\1\10\uffff\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\17\5\uffff\1\17\5\uffff\2\17\1\uffff\1\17\5\uffff\1\17\3\uffff\2\17\2\uffff\4\17\2\uffff\1\17\7\uffff\3\17\1\16\2\uffff\4\17\2\uffff\1\15\5\17\1\14\1\uffff\1\17\6\uffff\1\20\1\17\3\uffff\1\17\12\uffff\3\17\20\uffff\1\17",
            "",
            "",
            "",
            "\1\21",
            "",
            "\1\22",
            "",
            "\2\17\1\uffff\1\17\5\uffff\1\17\3\uffff\1\17\3\uffff\1\17\1\uffff\2\17\12\uffff\2\17\6\uffff\2\17\22\uffff\1\17\41\uffff\1\23",
            "\1\17\5\uffff\1\17\5\uffff\2\17\1\uffff\1\17\5\uffff\1\17\3\uffff\2\17\2\uffff\4\17\2\uffff\1\17\7\uffff\3\17\3\uffff\4\17\2\uffff\1\15\6\17\1\uffff\1\17\3\uffff\1\17\2\uffff\1\20\1\17\3\uffff\1\17\12\uffff\3\17\20\uffff\1\17",
            "\1\25\10\uffff\1\15\5\uffff\1\24\10\uffff\1\26",
            "\2\17\1\uffff\1\17\5\uffff\1\17\3\uffff\1\17\5\uffff\2\17\12\uffff\2\17\2\uffff\1\17\3\uffff\2\17\2\uffff\1\17\5\uffff\2\17\1\uffff\1\26\6\uffff\1\17\15\uffff\1\17\23\uffff\1\17",
            "\1\27",
            "\1\30",
            "",
            "\1\32\5\uffff\1\32\5\uffff\2\32\1\uffff\1\32\5\uffff\1\32\3\uffff\2\32\2\uffff\4\32\2\uffff\1\32\7\uffff\3\32\3\uffff\4\32\2\uffff\1\15\6\32\1\uffff\1\32\6\uffff\1\31\1\32\3\uffff\1\32\12\uffff\3\32\20\uffff\1\32",
            "\1\25\10\uffff\1\15\5\uffff\1\33\10\uffff\1\26",
            "\2\32\1\uffff\1\32\5\uffff\1\32\3\uffff\1\32\3\uffff\1\32\1\uffff\2\32\12\uffff\2\32\6\uffff\2\32\22\uffff\1\32\41\uffff\1\34",
            "",
            "\1\35",
            "\2\32\1\uffff\1\32\5\uffff\1\32\3\uffff\1\32\5\uffff\2\32\12\uffff\2\32\2\uffff\1\32\3\uffff\2\32\2\uffff\1\32\5\uffff\2\32\1\uffff\1\26\6\uffff\1\32\15\uffff\1\32\23\uffff\1\32",
            "\1\15\16\uffff\1\26"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA110 extends DFA {

        public DFA110(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 110;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "5031:2: ( ( () ( (lv_lit_1_0= ruleSlangLit ) ) ) | ( () ( (lv_i_3_0= ruleSlangInterp ) ) ) | ( ( ( ( () In_1 LeftParenthesis ) )=> ( () otherlv_5= In_1 otherlv_6= LeftParenthesis ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= RightParenthesis ) | ( ( ( ( () MaySend LeftParenthesis ) )=> ( () otherlv_10= MaySend otherlv_11= LeftParenthesis ) ) ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (lv_value_14_0= ruleExpr ) ) )? otherlv_15= RightParenthesis ) | ( ( ( ( () MustSend LeftParenthesis ) )=> ( () otherlv_17= MustSend otherlv_18= LeftParenthesis ) ) ( (otherlv_19= RULE_ID ) ) (otherlv_20= Comma ( (lv_value_21_0= ruleExpr ) ) )? otherlv_22= RightParenthesis ) | ( ( ( ( () NoSend LeftParenthesis ) )=> ( () otherlv_24= NoSend otherlv_25= LeftParenthesis ) ) ( (otherlv_26= RULE_ID ) ) otherlv_27= RightParenthesis ) | ( ( ( ( () HasEvent LeftParenthesis ) )=> ( () otherlv_29= HasEvent otherlv_30= LeftParenthesis ) ) ( (otherlv_31= RULE_ID ) ) otherlv_32= RightParenthesis ) | ( ( ( () ( ( ruleQCREF ) ) ( ( ruleSlangCallSuffix ) ) ) )=> ( () ( ( ruleQCREF ) ) ( (lv_callSuffix_35_0= ruleSlangCallSuffix ) ) ) ) | ( ( ( ( () ( ( ruleQCLREF ) ) FullStop ) )=> ( () ( ( ruleQCLREF ) ) otherlv_38= FullStop ) ) ( (otherlv_39= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_41_0= ruleDataElement ) ) otherlv_42= LeftCurlyBracket ( (otherlv_43= RULE_ID ) ) otherlv_44= EqualsSign ) ) ( (lv_argExpr_45_0= ruleExpr ) ) (otherlv_46= Semicolon ( (otherlv_47= RULE_ID ) ) otherlv_48= EqualsSign ( (lv_argExpr_49_0= ruleExpr ) ) )* otherlv_50= RightCurlyBracket ) | ( () ( (otherlv_52= RULE_ID ) ) (otherlv_53= FullStop ( (lv_ref_54_0= ruleOtherDataRef ) ) )? ) | ( () otherlv_56= LeftParenthesis ( (lv_exp_57_0= ruleExpr ) ) otherlv_58= RightParenthesis ) | ( () otherlv_60= For ( (lv_r_61_0= ruleSlangForRange ) ) (otherlv_62= Comma ( (lv_r_63_0= ruleSlangForRange ) ) )* otherlv_64= Yield ( ( (lv_b_65_0= ruleSlangBlock ) ) | (otherlv_66= LeftParenthesis ( (lv_e_67_0= ruleExpr ) ) otherlv_68= RightParenthesis ) ) ) | ( () otherlv_70= LeftCurlyBracket ( ( ( ( (lv_p_71_0= ruleSlangParams ) ) otherlv_72= EqualsSignGreaterThanSign )? ( (lv_e_73_0= ruleExpr ) ) otherlv_74= RightCurlyBracket ) | ( ( (lv_stmt_75_0= ruleSlangStmt ) )* ( (lv_r_76_0= ruleSlangRet ) )? otherlv_77= RightCurlyBracket ) ) ) )";
        }
    }
    static final String dfa_8s = "\62\uffff";
    static final String dfa_9s = "\1\16\30\uffff\1\0\2\uffff\1\0\25\uffff";
    static final String dfa_10s = "\1\165\30\uffff\1\0\2\uffff\1\0\25\uffff";
    static final String dfa_11s = "\1\uffff\1\1\45\uffff\1\2\12\uffff";
    static final String dfa_12s = "\31\uffff\1\0\2\uffff\1\1\25\uffff}>";
    static final String[] dfa_13s = {
            "\2\1\3\uffff\1\1\3\uffff\1\1\2\47\1\uffff\1\47\1\uffff\1\1\2\uffff\1\1\1\47\3\uffff\1\47\2\uffff\1\1\2\uffff\2\47\1\1\2\uffff\2\1\1\uffff\1\1\2\uffff\1\1\2\47\6\uffff\1\47\1\34\1\1\1\uffff\1\1\1\uffff\2\1\1\uffff\1\1\4\uffff\2\1\3\uffff\1\1\1\47\2\1\1\uffff\2\1\2\uffff\3\1\4\uffff\3\1\1\uffff\3\1\1\uffff\3\1\10\uffff\1\31",
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
            "",
            "\1\uffff",
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
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA109 extends DFA {

        public DFA109(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 109;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "5911:4: ( ( ( ( (lv_p_71_0= ruleSlangParams ) ) otherlv_72= EqualsSignGreaterThanSign )? ( (lv_e_73_0= ruleExpr ) ) otherlv_74= RightCurlyBracket ) | ( ( (lv_stmt_75_0= ruleSlangStmt ) )* ( (lv_r_76_0= ruleSlangRet ) )? otherlv_77= RightCurlyBracket ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA109_25 = input.LA(1);

                         
                        int index109_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred142_InternalGumboParser()) ) {s = 1;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index109_25);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA109_28 = input.LA(1);

                         
                        int index109_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred142_InternalGumboParser()) ) {s = 1;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index109_28);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 109, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\25\uffff";
    static final String dfa_15s = "\10\uffff\1\17\1\21\1\23\3\uffff\1\17\1\uffff\1\21\3\uffff\1\23";
    static final String dfa_16s = "\1\6\5\uffff\2\150\3\24\3\uffff\1\24\1\uffff\1\24\1\uffff\1\165\1\uffff\1\24";
    static final String dfa_17s = "\1\165\5\uffff\4\165\1\113\3\uffff\1\113\1\uffff\1\113\1\uffff\1\165\1\uffff\1\113";
    static final String dfa_18s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\5\uffff\1\11\1\12\1\6\1\uffff\1\7\1\uffff\1\10\1\uffff\1\13\1\uffff";
    static final String dfa_19s = "\25\uffff}>";
    static final String[] dfa_20s = {
            "\1\3\6\uffff\1\2\10\uffff\1\4\11\uffff\1\14\14\uffff\1\14\25\uffff\1\13\2\uffff\1\6\1\uffff\1\7\6\uffff\1\1\30\uffff\1\11\1\uffff\1\10\11\uffff\1\5\1\12",
            "",
            "",
            "",
            "",
            "",
            "\1\11\1\uffff\1\10\12\uffff\1\15",
            "\1\11\1\uffff\1\10\12\uffff\1\15",
            "\1\17\44\uffff\1\15\7\uffff\1\17\2\uffff\1\17\2\uffff\1\17\3\uffff\1\17\51\uffff\1\16",
            "\1\21\44\uffff\1\15\7\uffff\1\21\2\uffff\1\21\2\uffff\1\21\3\uffff\1\21\51\uffff\1\20",
            "\1\23\44\uffff\1\15\1\22\6\uffff\1\23\2\uffff\1\23\2\uffff\1\23\3\uffff\1\23",
            "",
            "",
            "",
            "\1\17\44\uffff\1\15\7\uffff\1\17\2\uffff\1\17\2\uffff\1\17\3\uffff\1\17",
            "",
            "\1\21\44\uffff\1\15\7\uffff\1\21\2\uffff\1\21\2\uffff\1\21\3\uffff\1\21",
            "",
            "\1\24",
            "",
            "\1\23\44\uffff\1\15\7\uffff\1\23\2\uffff\1\23\2\uffff\1\23\3\uffff\1\23"
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA136 extends DFA {

        public DFA136(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 136;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "7640:2: (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000004005A2L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000004001A2L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000004000A2L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000400082L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0010000000000002L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800400L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x004B21012088C000L,0x00201DDC39B4616BL});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000800L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000802L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002060802L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002020802L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000046060802L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000046020802L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000020044020002L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004020002L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000010L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000090L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000002040800L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008200L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x004B21013088C010L,0x00201DDC39B4616BL});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008408L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000408L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000802040800L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008008L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x004B2109228CC800L,0x00201DDC39B4616BL});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x2000000000000000L,0x0020000000000000L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0020000000000000L,0x0020000000000000L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010080L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000002040802L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000040802L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000041000L,0x0000000000040000L});
        public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000020000000000L,0x0000000000080000L});
        public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
        public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0800000000000002L,0x0000000200000608L});
        public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0800000000000002L,0x0000000200000208L});
        public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040001L});
        public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x004B21012088C000L,0x00201DDC39B4617BL});
        public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000008L});
        public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x8180182203000002L,0x0020000000000001L});
        public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
        public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0020000000020008L});
        public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000408L});
        public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
        public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000400L});
        public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x004B21012088C002L,0x00201DDC39B4616BL});
        public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x004B20010088C000L,0x00201DC03984600AL});
        public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000080L});
        public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0200800000000002L});
        public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x818018220B000000L,0x0020000000080001L});
        public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
        public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
        public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
        public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080800L});
        public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000080L});
        public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040008L});
        public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x81CB39232B88C000L,0x00201DDC39BC616BL});
        public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0100000000000000L,0x0020000000000000L});
        public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x4000000000000002L});
        public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000000L,0x00000000C0000000L});
        public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x2000400000000000L});
        public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000200100412040L,0x0030050000008148L});
        public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000882L});
        public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000882L});
        public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
        public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000000L,0x0020000000010000L});
        public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000200100412040L,0x0030050000008158L});
        public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
        public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0200000000000000L,0x0000000000010000L});
        public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
        public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000000000L,0x0020050000000140L});
        public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
        public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0400000000000002L});
    }


}