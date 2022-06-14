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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Integration", "Classifier", "Initialize", "Invariants", "Extension", "Functions", "Guarantee", "Invariant", "Reference", "MustSend", "Constant", "Modifies", "Requires", "MaySend", "Applies", "Binding", "Compute", "Ensures", "Library", "Memoize", "Assert", "Assume", "Handle", "Return", "Strict", "Some", "Cases", "Delta", "False", "Gumbo", "Match", "Modes", "Reads", "State", "While", "Yield", "All", "Case", "Else", "Halt", "Spec", "True", "PlusSignEqualsSignGreaterThanSign", "HyphenMinusGreaterThanSignColon", "FullStopFullStopLessThanSign", "Def", "For", "Inv", "Mut", "Val", "Var", "FullStopFullStop", "ColonColon", "ColonEqualsSign", "LessThanSignColon", "EqualsSignGreaterThanSign", "By", "Do", "If", "In_1", "To", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "FullStop", "Colon", "Semicolon", "EqualsSign", "QuestionMark", "F", "T", "LeftSquareBracket", "RightSquareBracket", "KW__", "LeftCurlyBracket", "RightCurlyBracket", "ForAll", "ThereExists", "RULE_ESC_SEQ", "RULE_SLANG_STRING", "RULE_MSTRING", "RULE_IDF", "RULE_MSPI", "RULE_MSP", "RULE_DIGIT", "RULE_SLI", "RULE_MSPB", "RULE_MSPM", "RULE_MSPE", "RULE_OPSYM", "RULE_DEFOP", "RULE_OP", "RULE_EXTENDED_DIGIT", "RULE_HEX", "RULE_BIN", "RULE_INTEGER_LIT", "RULE_INT_IDF", "RULE_REAL_LIT", "RULE_REAL_IDF", "RULE_LETTER", "RULE_UNICODE_ESC", "RULE_SL_COMMENT", "RULE_EXPONENT", "RULE_INT_EXPONENT", "RULE_BASED_INTEGER", "RULE_STRING", "RULE_ID", "RULE_WS"
    };
    public static final int Val=53;
    public static final int RULE_HEX=100;
    public static final int EqualsSignGreaterThanSign=59;
    public static final int Var=54;
    public static final int False=32;
    public static final int Initialize=6;
    public static final int Invariants=7;
    public static final int Assert=24;
    public static final int PlusSignEqualsSignGreaterThanSign=46;
    public static final int LeftParenthesis=65;
    public static final int RULE_MSTRING=87;
    public static final int RULE_SLANG_STRING=86;
    public static final int RULE_OP=98;
    public static final int RULE_BIN=101;
    public static final int RULE_ESC_SEQ=85;
    public static final int RULE_ID=113;
    public static final int RULE_DIGIT=91;
    public static final int Handle=26;
    public static final int ColonColon=56;
    public static final int Some=29;
    public static final int RULE_REAL_IDF=105;
    public static final int PlusSign=68;
    public static final int LeftSquareBracket=78;
    public static final int If=62;
    public static final int Halt=43;
    public static final int F=76;
    public static final int ThereExists=84;
    public static final int RULE_REAL_LIT=104;
    public static final int Classifier=5;
    public static final int Case=41;
    public static final int Comma=69;
    public static final int HyphenMinus=70;
    public static final int T=77;
    public static final int RULE_MSPE=95;
    public static final int Guarantee=10;
    public static final int RightCurlyBracket=82;
    public static final int RULE_MSPB=93;
    public static final int Modes=35;
    public static final int FullStop=71;
    public static final int HyphenMinusGreaterThanSignColon=47;
    public static final int Reference=12;
    public static final int RULE_UNICODE_ESC=107;
    public static final int Functions=9;
    public static final int KW__=80;
    public static final int Semicolon=73;
    public static final int RULE_LETTER=106;
    public static final int RULE_EXPONENT=109;
    public static final int Delta=31;
    public static final int QuestionMark=75;
    public static final int RULE_SLI=92;
    public static final int Memoize=23;
    public static final int By=60;
    public static final int Else=42;
    public static final int RULE_EXTENDED_DIGIT=99;
    public static final int Yield=39;
    public static final int All=40;
    public static final int True=45;
    public static final int RULE_INT_EXPONENT=110;
    public static final int In_1=63;
    public static final int FullStopFullStop=55;
    public static final int LessThanSignColon=58;
    public static final int Ensures=21;
    public static final int To=64;
    public static final int Applies=18;
    public static final int RULE_MSP=90;
    public static final int RULE_BASED_INTEGER=111;
    public static final int RightSquareBracket=79;
    public static final int Binding=19;
    public static final int RULE_MSPM=94;
    public static final int RULE_DEFOP=97;
    public static final int RULE_MSPI=89;
    public static final int Requires=16;
    public static final int For=50;
    public static final int RightParenthesis=66;
    public static final int Do=61;
    public static final int ColonEqualsSign=57;
    public static final int Mut=52;
    public static final int Gumbo=33;
    public static final int State=37;
    public static final int Assume=25;
    public static final int Library=22;
    public static final int RULE_INTEGER_LIT=102;
    public static final int Invariant=11;
    public static final int Constant=14;
    public static final int RULE_STRING=112;
    public static final int Match=34;
    public static final int Reads=36;
    public static final int RULE_SL_COMMENT=108;
    public static final int Inv=51;
    public static final int EqualsSign=74;
    public static final int Modifies=15;
    public static final int Strict=28;
    public static final int Colon=72;
    public static final int EOF=-1;
    public static final int Asterisk=67;
    public static final int Integration=4;
    public static final int RULE_OPSYM=96;
    public static final int Return=27;
    public static final int Def=49;
    public static final int RULE_WS=114;
    public static final int LeftCurlyBracket=81;
    public static final int RULE_INT_IDF=103;
    public static final int MustSend=13;
    public static final int While=38;
    public static final int Extension=8;
    public static final int FullStopFullStopLessThanSign=48;
    public static final int RULE_IDF=88;
    public static final int Compute=20;
    public static final int MaySend=17;
    public static final int Spec=44;
    public static final int ForAll=83;
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
    // InternalGumboParser.g:108:1: ruleGumboLibrary returns [EObject current=null] : ( () otherlv_1= Library otherlv_2= For otherlv_3= Gumbo ) ;
    public final EObject ruleGumboLibrary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalGumboParser.g:114:2: ( ( () otherlv_1= Library otherlv_2= For otherlv_3= Gumbo ) )
            // InternalGumboParser.g:115:2: ( () otherlv_1= Library otherlv_2= For otherlv_3= Gumbo )
            {
            // InternalGumboParser.g:115:2: ( () otherlv_1= Library otherlv_2= For otherlv_3= Gumbo )
            // InternalGumboParser.g:116:3: () otherlv_1= Library otherlv_2= For otherlv_3= Gumbo
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
    // InternalGumboParser.g:142:1: entryRuleGumboSubclause returns [EObject current=null] : iv_ruleGumboSubclause= ruleGumboSubclause EOF ;
    public final EObject entryRuleGumboSubclause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGumboSubclause = null;


        try {
            // InternalGumboParser.g:142:55: (iv_ruleGumboSubclause= ruleGumboSubclause EOF )
            // InternalGumboParser.g:143:2: iv_ruleGumboSubclause= ruleGumboSubclause EOF
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
    // InternalGumboParser.g:149:1: ruleGumboSubclause returns [EObject current=null] : ( () ( (lv_specs_1_0= ruleSpecSection ) ) ) ;
    public final EObject ruleGumboSubclause() throws RecognitionException {
        EObject current = null;

        EObject lv_specs_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:155:2: ( ( () ( (lv_specs_1_0= ruleSpecSection ) ) ) )
            // InternalGumboParser.g:156:2: ( () ( (lv_specs_1_0= ruleSpecSection ) ) )
            {
            // InternalGumboParser.g:156:2: ( () ( (lv_specs_1_0= ruleSpecSection ) ) )
            // InternalGumboParser.g:157:3: () ( (lv_specs_1_0= ruleSpecSection ) )
            {
            // InternalGumboParser.g:157:3: ()
            // InternalGumboParser.g:158:4: 
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

            // InternalGumboParser.g:167:3: ( (lv_specs_1_0= ruleSpecSection ) )
            // InternalGumboParser.g:168:4: (lv_specs_1_0= ruleSpecSection )
            {
            // InternalGumboParser.g:168:4: (lv_specs_1_0= ruleSpecSection )
            // InternalGumboParser.g:169:5: lv_specs_1_0= ruleSpecSection
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
    // InternalGumboParser.g:190:1: entryRuleSpecSection returns [EObject current=null] : iv_ruleSpecSection= ruleSpecSection EOF ;
    public final EObject entryRuleSpecSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecSection = null;


        try {
            // InternalGumboParser.g:190:52: (iv_ruleSpecSection= ruleSpecSection EOF )
            // InternalGumboParser.g:191:2: iv_ruleSpecSection= ruleSpecSection EOF
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
    // InternalGumboParser.g:197:1: ruleSpecSection returns [EObject current=null] : ( () ( (lv_state_1_0= ruleState ) )? ( (lv_functions_2_0= ruleFunctions ) )? ( (lv_invariants_3_0= ruleInvariants ) )? ( (lv_integration_4_0= ruleIntegration ) )? ( (lv_initialize_5_0= ruleInitialize ) )? ( (lv_compute_6_0= ruleCompute ) )? ) ;
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
            // InternalGumboParser.g:203:2: ( ( () ( (lv_state_1_0= ruleState ) )? ( (lv_functions_2_0= ruleFunctions ) )? ( (lv_invariants_3_0= ruleInvariants ) )? ( (lv_integration_4_0= ruleIntegration ) )? ( (lv_initialize_5_0= ruleInitialize ) )? ( (lv_compute_6_0= ruleCompute ) )? ) )
            // InternalGumboParser.g:204:2: ( () ( (lv_state_1_0= ruleState ) )? ( (lv_functions_2_0= ruleFunctions ) )? ( (lv_invariants_3_0= ruleInvariants ) )? ( (lv_integration_4_0= ruleIntegration ) )? ( (lv_initialize_5_0= ruleInitialize ) )? ( (lv_compute_6_0= ruleCompute ) )? )
            {
            // InternalGumboParser.g:204:2: ( () ( (lv_state_1_0= ruleState ) )? ( (lv_functions_2_0= ruleFunctions ) )? ( (lv_invariants_3_0= ruleInvariants ) )? ( (lv_integration_4_0= ruleIntegration ) )? ( (lv_initialize_5_0= ruleInitialize ) )? ( (lv_compute_6_0= ruleCompute ) )? )
            // InternalGumboParser.g:205:3: () ( (lv_state_1_0= ruleState ) )? ( (lv_functions_2_0= ruleFunctions ) )? ( (lv_invariants_3_0= ruleInvariants ) )? ( (lv_integration_4_0= ruleIntegration ) )? ( (lv_initialize_5_0= ruleInitialize ) )? ( (lv_compute_6_0= ruleCompute ) )?
            {
            // InternalGumboParser.g:205:3: ()
            // InternalGumboParser.g:206:4: 
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

            // InternalGumboParser.g:215:3: ( (lv_state_1_0= ruleState ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==State) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalGumboParser.g:216:4: (lv_state_1_0= ruleState )
                    {
                    // InternalGumboParser.g:216:4: (lv_state_1_0= ruleState )
                    // InternalGumboParser.g:217:5: lv_state_1_0= ruleState
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSpecSectionAccess().getStateStateParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_5);
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

            // InternalGumboParser.g:234:3: ( (lv_functions_2_0= ruleFunctions ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==Functions) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGumboParser.g:235:4: (lv_functions_2_0= ruleFunctions )
                    {
                    // InternalGumboParser.g:235:4: (lv_functions_2_0= ruleFunctions )
                    // InternalGumboParser.g:236:5: lv_functions_2_0= ruleFunctions
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSpecSectionAccess().getFunctionsFunctionsParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
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

            // InternalGumboParser.g:253:3: ( (lv_invariants_3_0= ruleInvariants ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Invariants) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalGumboParser.g:254:4: (lv_invariants_3_0= ruleInvariants )
                    {
                    // InternalGumboParser.g:254:4: (lv_invariants_3_0= ruleInvariants )
                    // InternalGumboParser.g:255:5: lv_invariants_3_0= ruleInvariants
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSpecSectionAccess().getInvariantsInvariantsParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_7);
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

            // InternalGumboParser.g:272:3: ( (lv_integration_4_0= ruleIntegration ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Integration) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalGumboParser.g:273:4: (lv_integration_4_0= ruleIntegration )
                    {
                    // InternalGumboParser.g:273:4: (lv_integration_4_0= ruleIntegration )
                    // InternalGumboParser.g:274:5: lv_integration_4_0= ruleIntegration
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSpecSectionAccess().getIntegrationIntegrationParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_8);
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

            // InternalGumboParser.g:291:3: ( (lv_initialize_5_0= ruleInitialize ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Initialize) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGumboParser.g:292:4: (lv_initialize_5_0= ruleInitialize )
                    {
                    // InternalGumboParser.g:292:4: (lv_initialize_5_0= ruleInitialize )
                    // InternalGumboParser.g:293:5: lv_initialize_5_0= ruleInitialize
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSpecSectionAccess().getInitializeInitializeParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_9);
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

            // InternalGumboParser.g:310:3: ( (lv_compute_6_0= ruleCompute ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Compute) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGumboParser.g:311:4: (lv_compute_6_0= ruleCompute )
                    {
                    // InternalGumboParser.g:311:4: (lv_compute_6_0= ruleCompute )
                    // InternalGumboParser.g:312:5: lv_compute_6_0= ruleCompute
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
    // InternalGumboParser.g:333:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalGumboParser.g:333:46: (iv_ruleState= ruleState EOF )
            // InternalGumboParser.g:334:2: iv_ruleState= ruleState EOF
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
    // InternalGumboParser.g:340:1: ruleState returns [EObject current=null] : (otherlv_0= State ( (lv_decls_1_0= ruleStateVarDecl ) )+ ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_decls_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:346:2: ( (otherlv_0= State ( (lv_decls_1_0= ruleStateVarDecl ) )+ ) )
            // InternalGumboParser.g:347:2: (otherlv_0= State ( (lv_decls_1_0= ruleStateVarDecl ) )+ )
            {
            // InternalGumboParser.g:347:2: (otherlv_0= State ( (lv_decls_1_0= ruleStateVarDecl ) )+ )
            // InternalGumboParser.g:348:3: otherlv_0= State ( (lv_decls_1_0= ruleStateVarDecl ) )+
            {
            otherlv_0=(Token)match(input,State,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
              		
            }
            // InternalGumboParser.g:352:3: ( (lv_decls_1_0= ruleStateVarDecl ) )+
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
            	    // InternalGumboParser.g:353:4: (lv_decls_1_0= ruleStateVarDecl )
            	    {
            	    // InternalGumboParser.g:353:4: (lv_decls_1_0= ruleStateVarDecl )
            	    // InternalGumboParser.g:354:5: lv_decls_1_0= ruleStateVarDecl
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
    // InternalGumboParser.g:375:1: entryRuleStateVarDecl returns [EObject current=null] : iv_ruleStateVarDecl= ruleStateVarDecl EOF ;
    public final EObject entryRuleStateVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateVarDecl = null;


        try {
            // InternalGumboParser.g:375:53: (iv_ruleStateVarDecl= ruleStateVarDecl EOF )
            // InternalGumboParser.g:376:2: iv_ruleStateVarDecl= ruleStateVarDecl EOF
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
    // InternalGumboParser.g:382:1: ruleStateVarDecl returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ) ( ( ruleQCREF ) ) otherlv_3= Semicolon ) ;
    public final EObject ruleStateVarDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalGumboParser.g:388:2: ( ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ) ( ( ruleQCREF ) ) otherlv_3= Semicolon ) )
            // InternalGumboParser.g:389:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ) ( ( ruleQCREF ) ) otherlv_3= Semicolon )
            {
            // InternalGumboParser.g:389:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ) ( ( ruleQCREF ) ) otherlv_3= Semicolon )
            // InternalGumboParser.g:390:3: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ) ( ( ruleQCREF ) ) otherlv_3= Semicolon
            {
            // InternalGumboParser.g:390:3: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon )
            // InternalGumboParser.g:391:4: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon
            {
            // InternalGumboParser.g:391:4: ( (lv_name_0_0= RULE_ID ) )
            // InternalGumboParser.g:392:5: (lv_name_0_0= RULE_ID )
            {
            // InternalGumboParser.g:392:5: (lv_name_0_0= RULE_ID )
            // InternalGumboParser.g:393:6: lv_name_0_0= RULE_ID
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

            // InternalGumboParser.g:414:3: ( ( ruleQCREF ) )
            // InternalGumboParser.g:415:4: ( ruleQCREF )
            {
            // InternalGumboParser.g:415:4: ( ruleQCREF )
            // InternalGumboParser.g:416:5: ruleQCREF
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
    // InternalGumboParser.g:441:1: entryRuleInvariants returns [EObject current=null] : iv_ruleInvariants= ruleInvariants EOF ;
    public final EObject entryRuleInvariants() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariants = null;


        try {
            // InternalGumboParser.g:441:51: (iv_ruleInvariants= ruleInvariants EOF )
            // InternalGumboParser.g:442:2: iv_ruleInvariants= ruleInvariants EOF
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
    // InternalGumboParser.g:448:1: ruleInvariants returns [EObject current=null] : (otherlv_0= Invariants ( (lv_specs_1_0= ruleInvSpec ) )+ ) ;
    public final EObject ruleInvariants() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_specs_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:454:2: ( (otherlv_0= Invariants ( (lv_specs_1_0= ruleInvSpec ) )+ ) )
            // InternalGumboParser.g:455:2: (otherlv_0= Invariants ( (lv_specs_1_0= ruleInvSpec ) )+ )
            {
            // InternalGumboParser.g:455:2: (otherlv_0= Invariants ( (lv_specs_1_0= ruleInvSpec ) )+ )
            // InternalGumboParser.g:456:3: otherlv_0= Invariants ( (lv_specs_1_0= ruleInvSpec ) )+
            {
            otherlv_0=(Token)match(input,Invariants,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInvariantsAccess().getInvariantsKeyword_0());
              		
            }
            // InternalGumboParser.g:460:3: ( (lv_specs_1_0= ruleInvSpec ) )+
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
            	    // InternalGumboParser.g:461:4: (lv_specs_1_0= ruleInvSpec )
            	    {
            	    // InternalGumboParser.g:461:4: (lv_specs_1_0= ruleInvSpec )
            	    // InternalGumboParser.g:462:5: lv_specs_1_0= ruleInvSpec
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
    // InternalGumboParser.g:483:1: entryRuleInvSpec returns [EObject current=null] : iv_ruleInvSpec= ruleInvSpec EOF ;
    public final EObject entryRuleInvSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvSpec = null;


        try {
            // InternalGumboParser.g:483:48: (iv_ruleInvSpec= ruleInvSpec EOF )
            // InternalGumboParser.g:484:2: iv_ruleInvSpec= ruleInvSpec EOF
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
    // InternalGumboParser.g:490:1: ruleInvSpec returns [EObject current=null] : (otherlv_0= Inv ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= Semicolon ) ;
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
            // InternalGumboParser.g:496:2: ( (otherlv_0= Inv ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= Semicolon ) )
            // InternalGumboParser.g:497:2: (otherlv_0= Inv ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= Semicolon )
            {
            // InternalGumboParser.g:497:2: (otherlv_0= Inv ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= Semicolon )
            // InternalGumboParser.g:498:3: otherlv_0= Inv ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= Semicolon
            {
            otherlv_0=(Token)match(input,Inv,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInvSpecAccess().getInvKeyword_0());
              		
            }
            // InternalGumboParser.g:502:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalGumboParser.g:503:4: (lv_id_1_0= RULE_ID )
            {
            // InternalGumboParser.g:503:4: (lv_id_1_0= RULE_ID )
            // InternalGumboParser.g:504:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_16); if (state.failed) return current;
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

            // InternalGumboParser.g:520:3: ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_SLANG_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGumboParser.g:521:4: (lv_descriptor_2_0= RULE_SLANG_STRING )
                    {
                    // InternalGumboParser.g:521:4: (lv_descriptor_2_0= RULE_SLANG_STRING )
                    // InternalGumboParser.g:522:5: lv_descriptor_2_0= RULE_SLANG_STRING
                    {
                    lv_descriptor_2_0=(Token)match(input,RULE_SLANG_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,Colon,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getInvSpecAccess().getColonKeyword_3());
              		
            }
            // InternalGumboParser.g:542:3: ( (lv_expr_4_0= ruleExpr ) )
            // InternalGumboParser.g:543:4: (lv_expr_4_0= ruleExpr )
            {
            // InternalGumboParser.g:543:4: (lv_expr_4_0= ruleExpr )
            // InternalGumboParser.g:544:5: lv_expr_4_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInvSpecAccess().getExprExprParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_13);
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
    // InternalGumboParser.g:569:1: entryRuleIntegration returns [EObject current=null] : iv_ruleIntegration= ruleIntegration EOF ;
    public final EObject entryRuleIntegration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegration = null;


        try {
            // InternalGumboParser.g:569:52: (iv_ruleIntegration= ruleIntegration EOF )
            // InternalGumboParser.g:570:2: iv_ruleIntegration= ruleIntegration EOF
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
    // InternalGumboParser.g:576:1: ruleIntegration returns [EObject current=null] : (otherlv_0= Integration ( (lv_specs_1_0= ruleSpecStatement ) )+ ) ;
    public final EObject ruleIntegration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_specs_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:582:2: ( (otherlv_0= Integration ( (lv_specs_1_0= ruleSpecStatement ) )+ ) )
            // InternalGumboParser.g:583:2: (otherlv_0= Integration ( (lv_specs_1_0= ruleSpecStatement ) )+ )
            {
            // InternalGumboParser.g:583:2: (otherlv_0= Integration ( (lv_specs_1_0= ruleSpecStatement ) )+ )
            // InternalGumboParser.g:584:3: otherlv_0= Integration ( (lv_specs_1_0= ruleSpecStatement ) )+
            {
            otherlv_0=(Token)match(input,Integration,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIntegrationAccess().getIntegrationKeyword_0());
              		
            }
            // InternalGumboParser.g:588:3: ( (lv_specs_1_0= ruleSpecStatement ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Guarantee||LA10_0==Assume) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGumboParser.g:589:4: (lv_specs_1_0= ruleSpecStatement )
            	    {
            	    // InternalGumboParser.g:589:4: (lv_specs_1_0= ruleSpecStatement )
            	    // InternalGumboParser.g:590:5: lv_specs_1_0= ruleSpecStatement
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
    // $ANTLR end "ruleIntegration"


    // $ANTLR start "entryRuleInitialize"
    // InternalGumboParser.g:611:1: entryRuleInitialize returns [EObject current=null] : iv_ruleInitialize= ruleInitialize EOF ;
    public final EObject entryRuleInitialize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialize = null;


        try {
            // InternalGumboParser.g:611:51: (iv_ruleInitialize= ruleInitialize EOF )
            // InternalGumboParser.g:612:2: iv_ruleInitialize= ruleInitialize EOF
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
    // InternalGumboParser.g:618:1: ruleInitialize returns [EObject current=null] : (otherlv_0= Initialize ( ( (lv_modifies_1_0= ruleSlangModifies ) ) otherlv_2= Semicolon )? ( (lv_specs_3_0= ruleInitializeSpecStatement ) )+ ) ;
    public final EObject ruleInitialize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_modifies_1_0 = null;

        EObject lv_specs_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:624:2: ( (otherlv_0= Initialize ( ( (lv_modifies_1_0= ruleSlangModifies ) ) otherlv_2= Semicolon )? ( (lv_specs_3_0= ruleInitializeSpecStatement ) )+ ) )
            // InternalGumboParser.g:625:2: (otherlv_0= Initialize ( ( (lv_modifies_1_0= ruleSlangModifies ) ) otherlv_2= Semicolon )? ( (lv_specs_3_0= ruleInitializeSpecStatement ) )+ )
            {
            // InternalGumboParser.g:625:2: (otherlv_0= Initialize ( ( (lv_modifies_1_0= ruleSlangModifies ) ) otherlv_2= Semicolon )? ( (lv_specs_3_0= ruleInitializeSpecStatement ) )+ )
            // InternalGumboParser.g:626:3: otherlv_0= Initialize ( ( (lv_modifies_1_0= ruleSlangModifies ) ) otherlv_2= Semicolon )? ( (lv_specs_3_0= ruleInitializeSpecStatement ) )+
            {
            otherlv_0=(Token)match(input,Initialize,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInitializeAccess().getInitializeKeyword_0());
              		
            }
            // InternalGumboParser.g:630:3: ( ( (lv_modifies_1_0= ruleSlangModifies ) ) otherlv_2= Semicolon )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Modifies) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGumboParser.g:631:4: ( (lv_modifies_1_0= ruleSlangModifies ) ) otherlv_2= Semicolon
                    {
                    // InternalGumboParser.g:631:4: ( (lv_modifies_1_0= ruleSlangModifies ) )
                    // InternalGumboParser.g:632:5: (lv_modifies_1_0= ruleSlangModifies )
                    {
                    // InternalGumboParser.g:632:5: (lv_modifies_1_0= ruleSlangModifies )
                    // InternalGumboParser.g:633:6: lv_modifies_1_0= ruleSlangModifies
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInitializeAccess().getModifiesSlangModifiesParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_13);
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

                    otherlv_2=(Token)match(input,Semicolon,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getInitializeAccess().getSemicolonKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalGumboParser.g:655:3: ( (lv_specs_3_0= ruleInitializeSpecStatement ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==Guarantee) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGumboParser.g:656:4: (lv_specs_3_0= ruleInitializeSpecStatement )
            	    {
            	    // InternalGumboParser.g:656:4: (lv_specs_3_0= ruleInitializeSpecStatement )
            	    // InternalGumboParser.g:657:5: lv_specs_3_0= ruleInitializeSpecStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getInitializeAccess().getSpecsInitializeSpecStatementParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_21);
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
            	    if ( cnt12 >= 1 ) break loop12;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
    // InternalGumboParser.g:678:1: entryRuleInitializeSpecStatement returns [EObject current=null] : iv_ruleInitializeSpecStatement= ruleInitializeSpecStatement EOF ;
    public final EObject entryRuleInitializeSpecStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitializeSpecStatement = null;


        try {
            // InternalGumboParser.g:678:64: (iv_ruleInitializeSpecStatement= ruleInitializeSpecStatement EOF )
            // InternalGumboParser.g:679:2: iv_ruleInitializeSpecStatement= ruleInitializeSpecStatement EOF
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
    // InternalGumboParser.g:685:1: ruleInitializeSpecStatement returns [EObject current=null] : ( (lv_guaranteeStatement_0_0= ruleGuaranteeStatement ) ) ;
    public final EObject ruleInitializeSpecStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_guaranteeStatement_0_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:691:2: ( ( (lv_guaranteeStatement_0_0= ruleGuaranteeStatement ) ) )
            // InternalGumboParser.g:692:2: ( (lv_guaranteeStatement_0_0= ruleGuaranteeStatement ) )
            {
            // InternalGumboParser.g:692:2: ( (lv_guaranteeStatement_0_0= ruleGuaranteeStatement ) )
            // InternalGumboParser.g:693:3: (lv_guaranteeStatement_0_0= ruleGuaranteeStatement )
            {
            // InternalGumboParser.g:693:3: (lv_guaranteeStatement_0_0= ruleGuaranteeStatement )
            // InternalGumboParser.g:694:4: lv_guaranteeStatement_0_0= ruleGuaranteeStatement
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
    // InternalGumboParser.g:714:1: entryRuleCompute returns [EObject current=null] : iv_ruleCompute= ruleCompute EOF ;
    public final EObject entryRuleCompute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompute = null;


        try {
            // InternalGumboParser.g:714:48: (iv_ruleCompute= ruleCompute EOF )
            // InternalGumboParser.g:715:2: iv_ruleCompute= ruleCompute EOF
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
    // InternalGumboParser.g:721:1: ruleCompute returns [EObject current=null] : (otherlv_0= Compute ( ( (lv_modifies_1_0= ruleSlangModifies ) ) otherlv_2= Semicolon )? ( (otherlv_3= Cases ( (lv_cases_4_0= ruleCaseStatementClause ) )+ ) | ( (lv_implications_5_0= ruleImplicationStatement ) )+ ) ( (lv_handlers_6_0= ruleHandlerClause ) )* ) ;
    public final EObject ruleCompute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_modifies_1_0 = null;

        EObject lv_cases_4_0 = null;

        EObject lv_implications_5_0 = null;

        EObject lv_handlers_6_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:727:2: ( (otherlv_0= Compute ( ( (lv_modifies_1_0= ruleSlangModifies ) ) otherlv_2= Semicolon )? ( (otherlv_3= Cases ( (lv_cases_4_0= ruleCaseStatementClause ) )+ ) | ( (lv_implications_5_0= ruleImplicationStatement ) )+ ) ( (lv_handlers_6_0= ruleHandlerClause ) )* ) )
            // InternalGumboParser.g:728:2: (otherlv_0= Compute ( ( (lv_modifies_1_0= ruleSlangModifies ) ) otherlv_2= Semicolon )? ( (otherlv_3= Cases ( (lv_cases_4_0= ruleCaseStatementClause ) )+ ) | ( (lv_implications_5_0= ruleImplicationStatement ) )+ ) ( (lv_handlers_6_0= ruleHandlerClause ) )* )
            {
            // InternalGumboParser.g:728:2: (otherlv_0= Compute ( ( (lv_modifies_1_0= ruleSlangModifies ) ) otherlv_2= Semicolon )? ( (otherlv_3= Cases ( (lv_cases_4_0= ruleCaseStatementClause ) )+ ) | ( (lv_implications_5_0= ruleImplicationStatement ) )+ ) ( (lv_handlers_6_0= ruleHandlerClause ) )* )
            // InternalGumboParser.g:729:3: otherlv_0= Compute ( ( (lv_modifies_1_0= ruleSlangModifies ) ) otherlv_2= Semicolon )? ( (otherlv_3= Cases ( (lv_cases_4_0= ruleCaseStatementClause ) )+ ) | ( (lv_implications_5_0= ruleImplicationStatement ) )+ ) ( (lv_handlers_6_0= ruleHandlerClause ) )*
            {
            otherlv_0=(Token)match(input,Compute,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getComputeAccess().getComputeKeyword_0());
              		
            }
            // InternalGumboParser.g:733:3: ( ( (lv_modifies_1_0= ruleSlangModifies ) ) otherlv_2= Semicolon )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Modifies) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGumboParser.g:734:4: ( (lv_modifies_1_0= ruleSlangModifies ) ) otherlv_2= Semicolon
                    {
                    // InternalGumboParser.g:734:4: ( (lv_modifies_1_0= ruleSlangModifies ) )
                    // InternalGumboParser.g:735:5: (lv_modifies_1_0= ruleSlangModifies )
                    {
                    // InternalGumboParser.g:735:5: (lv_modifies_1_0= ruleSlangModifies )
                    // InternalGumboParser.g:736:6: lv_modifies_1_0= ruleSlangModifies
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getComputeAccess().getModifiesSlangModifiesParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_13);
                    lv_modifies_1_0=ruleSlangModifies();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getComputeRule());
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

                    otherlv_2=(Token)match(input,Semicolon,FollowSets000.FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getComputeAccess().getSemicolonKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalGumboParser.g:758:3: ( (otherlv_3= Cases ( (lv_cases_4_0= ruleCaseStatementClause ) )+ ) | ( (lv_implications_5_0= ruleImplicationStatement ) )+ )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==Cases) ) {
                alt16=1;
            }
            else if ( (LA16_0==Guarantee) ) {
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
                    // InternalGumboParser.g:759:4: (otherlv_3= Cases ( (lv_cases_4_0= ruleCaseStatementClause ) )+ )
                    {
                    // InternalGumboParser.g:759:4: (otherlv_3= Cases ( (lv_cases_4_0= ruleCaseStatementClause ) )+ )
                    // InternalGumboParser.g:760:5: otherlv_3= Cases ( (lv_cases_4_0= ruleCaseStatementClause ) )+
                    {
                    otherlv_3=(Token)match(input,Cases,FollowSets000.FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getComputeAccess().getCasesKeyword_2_0_0());
                      				
                    }
                    // InternalGumboParser.g:764:5: ( (lv_cases_4_0= ruleCaseStatementClause ) )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==Case) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalGumboParser.g:765:6: (lv_cases_4_0= ruleCaseStatementClause )
                    	    {
                    	    // InternalGumboParser.g:765:6: (lv_cases_4_0= ruleCaseStatementClause )
                    	    // InternalGumboParser.g:766:7: lv_cases_4_0= ruleCaseStatementClause
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getComputeAccess().getCasesCaseStatementClauseParserRuleCall_2_0_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_24);
                    	    lv_cases_4_0=ruleCaseStatementClause();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getComputeRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"cases",
                    	      								lv_cases_4_0,
                    	      								"org.sireum.aadl.gumbo.Gumbo.CaseStatementClause");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:785:4: ( (lv_implications_5_0= ruleImplicationStatement ) )+
                    {
                    // InternalGumboParser.g:785:4: ( (lv_implications_5_0= ruleImplicationStatement ) )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==Guarantee) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalGumboParser.g:786:5: (lv_implications_5_0= ruleImplicationStatement )
                    	    {
                    	    // InternalGumboParser.g:786:5: (lv_implications_5_0= ruleImplicationStatement )
                    	    // InternalGumboParser.g:787:6: lv_implications_5_0= ruleImplicationStatement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getComputeAccess().getImplicationsImplicationStatementParserRuleCall_2_1_0());
                    	      					
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_25);
                    	    lv_implications_5_0=ruleImplicationStatement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getComputeRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"implications",
                    	      							lv_implications_5_0,
                    	      							"org.sireum.aadl.gumbo.Gumbo.ImplicationStatement");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);


                    }
                    break;

            }

            // InternalGumboParser.g:805:3: ( (lv_handlers_6_0= ruleHandlerClause ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==Handle) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGumboParser.g:806:4: (lv_handlers_6_0= ruleHandlerClause )
            	    {
            	    // InternalGumboParser.g:806:4: (lv_handlers_6_0= ruleHandlerClause )
            	    // InternalGumboParser.g:807:5: lv_handlers_6_0= ruleHandlerClause
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getComputeAccess().getHandlersHandlerClauseParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_26);
            	    lv_handlers_6_0=ruleHandlerClause();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getComputeRule());
            	      					}
            	      					add(
            	      						current,
            	      						"handlers",
            	      						lv_handlers_6_0,
            	      						"org.sireum.aadl.gumbo.Gumbo.HandlerClause");
            	      					afterParserOrEnumRuleCall();
            	      				
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
    // $ANTLR end "ruleCompute"


    // $ANTLR start "entryRuleHandlerClause"
    // InternalGumboParser.g:828:1: entryRuleHandlerClause returns [EObject current=null] : iv_ruleHandlerClause= ruleHandlerClause EOF ;
    public final EObject entryRuleHandlerClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHandlerClause = null;


        try {
            // InternalGumboParser.g:828:54: (iv_ruleHandlerClause= ruleHandlerClause EOF )
            // InternalGumboParser.g:829:2: iv_ruleHandlerClause= ruleHandlerClause EOF
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
    // InternalGumboParser.g:835:1: ruleHandlerClause returns [EObject current=null] : (otherlv_0= Handle ( (otherlv_1= RULE_ID ) ) otherlv_2= Colon ( ( (lv_modifies_3_0= ruleSlangModifies ) ) otherlv_4= Semicolon )? ( (lv_guarantees_5_0= ruleGuaranteeStatement ) )+ ) ;
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
            // InternalGumboParser.g:841:2: ( (otherlv_0= Handle ( (otherlv_1= RULE_ID ) ) otherlv_2= Colon ( ( (lv_modifies_3_0= ruleSlangModifies ) ) otherlv_4= Semicolon )? ( (lv_guarantees_5_0= ruleGuaranteeStatement ) )+ ) )
            // InternalGumboParser.g:842:2: (otherlv_0= Handle ( (otherlv_1= RULE_ID ) ) otherlv_2= Colon ( ( (lv_modifies_3_0= ruleSlangModifies ) ) otherlv_4= Semicolon )? ( (lv_guarantees_5_0= ruleGuaranteeStatement ) )+ )
            {
            // InternalGumboParser.g:842:2: (otherlv_0= Handle ( (otherlv_1= RULE_ID ) ) otherlv_2= Colon ( ( (lv_modifies_3_0= ruleSlangModifies ) ) otherlv_4= Semicolon )? ( (lv_guarantees_5_0= ruleGuaranteeStatement ) )+ )
            // InternalGumboParser.g:843:3: otherlv_0= Handle ( (otherlv_1= RULE_ID ) ) otherlv_2= Colon ( ( (lv_modifies_3_0= ruleSlangModifies ) ) otherlv_4= Semicolon )? ( (lv_guarantees_5_0= ruleGuaranteeStatement ) )+
            {
            otherlv_0=(Token)match(input,Handle,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getHandlerClauseAccess().getHandleKeyword_0());
              		
            }
            // InternalGumboParser.g:847:3: ( (otherlv_1= RULE_ID ) )
            // InternalGumboParser.g:848:4: (otherlv_1= RULE_ID )
            {
            // InternalGumboParser.g:848:4: (otherlv_1= RULE_ID )
            // InternalGumboParser.g:849:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getHandlerClauseRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getHandlerClauseAccess().getIdPortCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,Colon,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getHandlerClauseAccess().getColonKeyword_2());
              		
            }
            // InternalGumboParser.g:867:3: ( ( (lv_modifies_3_0= ruleSlangModifies ) ) otherlv_4= Semicolon )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Modifies) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalGumboParser.g:868:4: ( (lv_modifies_3_0= ruleSlangModifies ) ) otherlv_4= Semicolon
                    {
                    // InternalGumboParser.g:868:4: ( (lv_modifies_3_0= ruleSlangModifies ) )
                    // InternalGumboParser.g:869:5: (lv_modifies_3_0= ruleSlangModifies )
                    {
                    // InternalGumboParser.g:869:5: (lv_modifies_3_0= ruleSlangModifies )
                    // InternalGumboParser.g:870:6: lv_modifies_3_0= ruleSlangModifies
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getHandlerClauseAccess().getModifiesSlangModifiesParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_13);
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

                    otherlv_4=(Token)match(input,Semicolon,FollowSets000.FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getHandlerClauseAccess().getSemicolonKeyword_3_1());
                      			
                    }

                    }
                    break;

            }

            // InternalGumboParser.g:892:3: ( (lv_guarantees_5_0= ruleGuaranteeStatement ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==Guarantee) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalGumboParser.g:893:4: (lv_guarantees_5_0= ruleGuaranteeStatement )
            	    {
            	    // InternalGumboParser.g:893:4: (lv_guarantees_5_0= ruleGuaranteeStatement )
            	    // InternalGumboParser.g:894:5: lv_guarantees_5_0= ruleGuaranteeStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getHandlerClauseAccess().getGuaranteesGuaranteeStatementParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_19);
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
            	    if ( cnt19 >= 1 ) break loop19;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
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
    // InternalGumboParser.g:915:1: entryRuleCaseStatementClause returns [EObject current=null] : iv_ruleCaseStatementClause= ruleCaseStatementClause EOF ;
    public final EObject entryRuleCaseStatementClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseStatementClause = null;


        try {
            // InternalGumboParser.g:915:60: (iv_ruleCaseStatementClause= ruleCaseStatementClause EOF )
            // InternalGumboParser.g:916:2: iv_ruleCaseStatementClause= ruleCaseStatementClause EOF
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
    // InternalGumboParser.g:922:1: ruleCaseStatementClause returns [EObject current=null] : (otherlv_0= Case ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_assumeStatement_4_0= ruleAnonAssumeStatement ) ) ( (lv_guaranteeStatement_5_0= ruleAnonGuaranteeStatement ) ) ) ;
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
            // InternalGumboParser.g:928:2: ( (otherlv_0= Case ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_assumeStatement_4_0= ruleAnonAssumeStatement ) ) ( (lv_guaranteeStatement_5_0= ruleAnonGuaranteeStatement ) ) ) )
            // InternalGumboParser.g:929:2: (otherlv_0= Case ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_assumeStatement_4_0= ruleAnonAssumeStatement ) ) ( (lv_guaranteeStatement_5_0= ruleAnonGuaranteeStatement ) ) )
            {
            // InternalGumboParser.g:929:2: (otherlv_0= Case ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_assumeStatement_4_0= ruleAnonAssumeStatement ) ) ( (lv_guaranteeStatement_5_0= ruleAnonGuaranteeStatement ) ) )
            // InternalGumboParser.g:930:3: otherlv_0= Case ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_assumeStatement_4_0= ruleAnonAssumeStatement ) ) ( (lv_guaranteeStatement_5_0= ruleAnonGuaranteeStatement ) )
            {
            otherlv_0=(Token)match(input,Case,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCaseStatementClauseAccess().getCaseKeyword_0());
              		
            }
            // InternalGumboParser.g:934:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalGumboParser.g:935:4: (lv_id_1_0= RULE_ID )
            {
            // InternalGumboParser.g:935:4: (lv_id_1_0= RULE_ID )
            // InternalGumboParser.g:936:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_16); if (state.failed) return current;
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

            // InternalGumboParser.g:952:3: ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_SLANG_STRING) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalGumboParser.g:953:4: (lv_descriptor_2_0= RULE_SLANG_STRING )
                    {
                    // InternalGumboParser.g:953:4: (lv_descriptor_2_0= RULE_SLANG_STRING )
                    // InternalGumboParser.g:954:5: lv_descriptor_2_0= RULE_SLANG_STRING
                    {
                    lv_descriptor_2_0=(Token)match(input,RULE_SLANG_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,Colon,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getCaseStatementClauseAccess().getColonKeyword_3());
              		
            }
            // InternalGumboParser.g:974:3: ( (lv_assumeStatement_4_0= ruleAnonAssumeStatement ) )
            // InternalGumboParser.g:975:4: (lv_assumeStatement_4_0= ruleAnonAssumeStatement )
            {
            // InternalGumboParser.g:975:4: (lv_assumeStatement_4_0= ruleAnonAssumeStatement )
            // InternalGumboParser.g:976:5: lv_assumeStatement_4_0= ruleAnonAssumeStatement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCaseStatementClauseAccess().getAssumeStatementAnonAssumeStatementParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_28);
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

            // InternalGumboParser.g:993:3: ( (lv_guaranteeStatement_5_0= ruleAnonGuaranteeStatement ) )
            // InternalGumboParser.g:994:4: (lv_guaranteeStatement_5_0= ruleAnonGuaranteeStatement )
            {
            // InternalGumboParser.g:994:4: (lv_guaranteeStatement_5_0= ruleAnonGuaranteeStatement )
            // InternalGumboParser.g:995:5: lv_guaranteeStatement_5_0= ruleAnonGuaranteeStatement
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
    // InternalGumboParser.g:1016:1: entryRuleSpecStatement returns [EObject current=null] : iv_ruleSpecStatement= ruleSpecStatement EOF ;
    public final EObject entryRuleSpecStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecStatement = null;


        try {
            // InternalGumboParser.g:1016:54: (iv_ruleSpecStatement= ruleSpecStatement EOF )
            // InternalGumboParser.g:1017:2: iv_ruleSpecStatement= ruleSpecStatement EOF
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
    // InternalGumboParser.g:1023:1: ruleSpecStatement returns [EObject current=null] : (this_AssumeStatement_0= ruleAssumeStatement | this_GuaranteeStatement_1= ruleGuaranteeStatement ) ;
    public final EObject ruleSpecStatement() throws RecognitionException {
        EObject current = null;

        EObject this_AssumeStatement_0 = null;

        EObject this_GuaranteeStatement_1 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1029:2: ( (this_AssumeStatement_0= ruleAssumeStatement | this_GuaranteeStatement_1= ruleGuaranteeStatement ) )
            // InternalGumboParser.g:1030:2: (this_AssumeStatement_0= ruleAssumeStatement | this_GuaranteeStatement_1= ruleGuaranteeStatement )
            {
            // InternalGumboParser.g:1030:2: (this_AssumeStatement_0= ruleAssumeStatement | this_GuaranteeStatement_1= ruleGuaranteeStatement )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==Assume) ) {
                alt21=1;
            }
            else if ( (LA21_0==Guarantee) ) {
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
                    // InternalGumboParser.g:1031:3: this_AssumeStatement_0= ruleAssumeStatement
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
                    // InternalGumboParser.g:1043:3: this_GuaranteeStatement_1= ruleGuaranteeStatement
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
    // InternalGumboParser.g:1058:1: entryRuleAssumeStatement returns [EObject current=null] : iv_ruleAssumeStatement= ruleAssumeStatement EOF ;
    public final EObject entryRuleAssumeStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssumeStatement = null;


        try {
            // InternalGumboParser.g:1058:56: (iv_ruleAssumeStatement= ruleAssumeStatement EOF )
            // InternalGumboParser.g:1059:2: iv_ruleAssumeStatement= ruleAssumeStatement EOF
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
    // InternalGumboParser.g:1065:1: ruleAssumeStatement returns [EObject current=null] : (otherlv_0= Assume ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= Semicolon ) ;
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
            // InternalGumboParser.g:1071:2: ( (otherlv_0= Assume ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= Semicolon ) )
            // InternalGumboParser.g:1072:2: (otherlv_0= Assume ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= Semicolon )
            {
            // InternalGumboParser.g:1072:2: (otherlv_0= Assume ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= Semicolon )
            // InternalGumboParser.g:1073:3: otherlv_0= Assume ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= Semicolon
            {
            otherlv_0=(Token)match(input,Assume,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAssumeStatementAccess().getAssumeKeyword_0());
              		
            }
            // InternalGumboParser.g:1077:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalGumboParser.g:1078:4: (lv_id_1_0= RULE_ID )
            {
            // InternalGumboParser.g:1078:4: (lv_id_1_0= RULE_ID )
            // InternalGumboParser.g:1079:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_16); if (state.failed) return current;
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

            // InternalGumboParser.g:1095:3: ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_SLANG_STRING) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalGumboParser.g:1096:4: (lv_descriptor_2_0= RULE_SLANG_STRING )
                    {
                    // InternalGumboParser.g:1096:4: (lv_descriptor_2_0= RULE_SLANG_STRING )
                    // InternalGumboParser.g:1097:5: lv_descriptor_2_0= RULE_SLANG_STRING
                    {
                    lv_descriptor_2_0=(Token)match(input,RULE_SLANG_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,Colon,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getAssumeStatementAccess().getColonKeyword_3());
              		
            }
            // InternalGumboParser.g:1117:3: ( (lv_expr_4_0= ruleExpr ) )
            // InternalGumboParser.g:1118:4: (lv_expr_4_0= ruleExpr )
            {
            // InternalGumboParser.g:1118:4: (lv_expr_4_0= ruleExpr )
            // InternalGumboParser.g:1119:5: lv_expr_4_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssumeStatementAccess().getExprExprParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_13);
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
    // InternalGumboParser.g:1144:1: entryRuleAnonAssumeStatement returns [EObject current=null] : iv_ruleAnonAssumeStatement= ruleAnonAssumeStatement EOF ;
    public final EObject entryRuleAnonAssumeStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnonAssumeStatement = null;


        try {
            // InternalGumboParser.g:1144:60: (iv_ruleAnonAssumeStatement= ruleAnonAssumeStatement EOF )
            // InternalGumboParser.g:1145:2: iv_ruleAnonAssumeStatement= ruleAnonAssumeStatement EOF
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
    // InternalGumboParser.g:1151:1: ruleAnonAssumeStatement returns [EObject current=null] : (otherlv_0= Assume ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon ) ;
    public final EObject ruleAnonAssumeStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1157:2: ( (otherlv_0= Assume ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon ) )
            // InternalGumboParser.g:1158:2: (otherlv_0= Assume ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon )
            {
            // InternalGumboParser.g:1158:2: (otherlv_0= Assume ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon )
            // InternalGumboParser.g:1159:3: otherlv_0= Assume ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon
            {
            otherlv_0=(Token)match(input,Assume,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAnonAssumeStatementAccess().getAssumeKeyword_0());
              		
            }
            // InternalGumboParser.g:1163:3: ( (lv_expr_1_0= ruleExpr ) )
            // InternalGumboParser.g:1164:4: (lv_expr_1_0= ruleExpr )
            {
            // InternalGumboParser.g:1164:4: (lv_expr_1_0= ruleExpr )
            // InternalGumboParser.g:1165:5: lv_expr_1_0= ruleExpr
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
    // InternalGumboParser.g:1190:1: entryRuleGuaranteeStatement returns [EObject current=null] : iv_ruleGuaranteeStatement= ruleGuaranteeStatement EOF ;
    public final EObject entryRuleGuaranteeStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuaranteeStatement = null;


        try {
            // InternalGumboParser.g:1190:59: (iv_ruleGuaranteeStatement= ruleGuaranteeStatement EOF )
            // InternalGumboParser.g:1191:2: iv_ruleGuaranteeStatement= ruleGuaranteeStatement EOF
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
    // InternalGumboParser.g:1197:1: ruleGuaranteeStatement returns [EObject current=null] : (otherlv_0= Guarantee ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= Semicolon ) ;
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
            // InternalGumboParser.g:1203:2: ( (otherlv_0= Guarantee ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= Semicolon ) )
            // InternalGumboParser.g:1204:2: (otherlv_0= Guarantee ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= Semicolon )
            {
            // InternalGumboParser.g:1204:2: (otherlv_0= Guarantee ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= Semicolon )
            // InternalGumboParser.g:1205:3: otherlv_0= Guarantee ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= Semicolon
            {
            otherlv_0=(Token)match(input,Guarantee,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGuaranteeStatementAccess().getGuaranteeKeyword_0());
              		
            }
            // InternalGumboParser.g:1209:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalGumboParser.g:1210:4: (lv_id_1_0= RULE_ID )
            {
            // InternalGumboParser.g:1210:4: (lv_id_1_0= RULE_ID )
            // InternalGumboParser.g:1211:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_16); if (state.failed) return current;
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

            // InternalGumboParser.g:1227:3: ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_SLANG_STRING) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalGumboParser.g:1228:4: (lv_descriptor_2_0= RULE_SLANG_STRING )
                    {
                    // InternalGumboParser.g:1228:4: (lv_descriptor_2_0= RULE_SLANG_STRING )
                    // InternalGumboParser.g:1229:5: lv_descriptor_2_0= RULE_SLANG_STRING
                    {
                    lv_descriptor_2_0=(Token)match(input,RULE_SLANG_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,Colon,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGuaranteeStatementAccess().getColonKeyword_3());
              		
            }
            // InternalGumboParser.g:1249:3: ( (lv_expr_4_0= ruleExpr ) )
            // InternalGumboParser.g:1250:4: (lv_expr_4_0= ruleExpr )
            {
            // InternalGumboParser.g:1250:4: (lv_expr_4_0= ruleExpr )
            // InternalGumboParser.g:1251:5: lv_expr_4_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGuaranteeStatementAccess().getExprExprParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_13);
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


    // $ANTLR start "entryRuleImplicationStatement"
    // InternalGumboParser.g:1276:1: entryRuleImplicationStatement returns [EObject current=null] : iv_ruleImplicationStatement= ruleImplicationStatement EOF ;
    public final EObject entryRuleImplicationStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplicationStatement = null;


        try {
            // InternalGumboParser.g:1276:61: (iv_ruleImplicationStatement= ruleImplicationStatement EOF )
            // InternalGumboParser.g:1277:2: iv_ruleImplicationStatement= ruleImplicationStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImplicationStatementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleImplicationStatement=ruleImplicationStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImplicationStatement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImplicationStatement"


    // $ANTLR start "ruleImplicationStatement"
    // InternalGumboParser.g:1283:1: ruleImplicationStatement returns [EObject current=null] : (otherlv_0= Guarantee ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_antecedent_4_0= ruleExpr ) ) otherlv_5= HyphenMinusGreaterThanSignColon ( (lv_consequent_6_0= ruleExpr ) ) otherlv_7= Semicolon ) ;
    public final EObject ruleImplicationStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token lv_descriptor_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_antecedent_4_0 = null;

        EObject lv_consequent_6_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1289:2: ( (otherlv_0= Guarantee ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_antecedent_4_0= ruleExpr ) ) otherlv_5= HyphenMinusGreaterThanSignColon ( (lv_consequent_6_0= ruleExpr ) ) otherlv_7= Semicolon ) )
            // InternalGumboParser.g:1290:2: (otherlv_0= Guarantee ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_antecedent_4_0= ruleExpr ) ) otherlv_5= HyphenMinusGreaterThanSignColon ( (lv_consequent_6_0= ruleExpr ) ) otherlv_7= Semicolon )
            {
            // InternalGumboParser.g:1290:2: (otherlv_0= Guarantee ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_antecedent_4_0= ruleExpr ) ) otherlv_5= HyphenMinusGreaterThanSignColon ( (lv_consequent_6_0= ruleExpr ) ) otherlv_7= Semicolon )
            // InternalGumboParser.g:1291:3: otherlv_0= Guarantee ( (lv_id_1_0= RULE_ID ) ) ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )? otherlv_3= Colon ( (lv_antecedent_4_0= ruleExpr ) ) otherlv_5= HyphenMinusGreaterThanSignColon ( (lv_consequent_6_0= ruleExpr ) ) otherlv_7= Semicolon
            {
            otherlv_0=(Token)match(input,Guarantee,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getImplicationStatementAccess().getGuaranteeKeyword_0());
              		
            }
            // InternalGumboParser.g:1295:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalGumboParser.g:1296:4: (lv_id_1_0= RULE_ID )
            {
            // InternalGumboParser.g:1296:4: (lv_id_1_0= RULE_ID )
            // InternalGumboParser.g:1297:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_id_1_0, grammarAccess.getImplicationStatementAccess().getIdIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getImplicationStatementRule());
              					}
              					setWithLastConsumed(
              						current,
              						"id",
              						lv_id_1_0,
              						"org.osate.xtext.aadl2.properties.Properties.ID");
              				
            }

            }


            }

            // InternalGumboParser.g:1313:3: ( (lv_descriptor_2_0= RULE_SLANG_STRING ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_SLANG_STRING) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalGumboParser.g:1314:4: (lv_descriptor_2_0= RULE_SLANG_STRING )
                    {
                    // InternalGumboParser.g:1314:4: (lv_descriptor_2_0= RULE_SLANG_STRING )
                    // InternalGumboParser.g:1315:5: lv_descriptor_2_0= RULE_SLANG_STRING
                    {
                    lv_descriptor_2_0=(Token)match(input,RULE_SLANG_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_descriptor_2_0, grammarAccess.getImplicationStatementAccess().getDescriptorSLANG_STRINGTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getImplicationStatementRule());
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

            otherlv_3=(Token)match(input,Colon,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getImplicationStatementAccess().getColonKeyword_3());
              		
            }
            // InternalGumboParser.g:1335:3: ( (lv_antecedent_4_0= ruleExpr ) )
            // InternalGumboParser.g:1336:4: (lv_antecedent_4_0= ruleExpr )
            {
            // InternalGumboParser.g:1336:4: (lv_antecedent_4_0= ruleExpr )
            // InternalGumboParser.g:1337:5: lv_antecedent_4_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getImplicationStatementAccess().getAntecedentExprParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_29);
            lv_antecedent_4_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getImplicationStatementRule());
              					}
              					set(
              						current,
              						"antecedent",
              						lv_antecedent_4_0,
              						"org.sireum.aadl.gumbo.Gumbo.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,HyphenMinusGreaterThanSignColon,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getImplicationStatementAccess().getHyphenMinusGreaterThanSignColonKeyword_5());
              		
            }
            // InternalGumboParser.g:1358:3: ( (lv_consequent_6_0= ruleExpr ) )
            // InternalGumboParser.g:1359:4: (lv_consequent_6_0= ruleExpr )
            {
            // InternalGumboParser.g:1359:4: (lv_consequent_6_0= ruleExpr )
            // InternalGumboParser.g:1360:5: lv_consequent_6_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getImplicationStatementAccess().getConsequentExprParserRuleCall_6_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_13);
            lv_consequent_6_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getImplicationStatementRule());
              					}
              					set(
              						current,
              						"consequent",
              						lv_consequent_6_0,
              						"org.sireum.aadl.gumbo.Gumbo.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_7=(Token)match(input,Semicolon,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getImplicationStatementAccess().getSemicolonKeyword_7());
              		
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
    // $ANTLR end "ruleImplicationStatement"


    // $ANTLR start "entryRuleAnonGuaranteeStatement"
    // InternalGumboParser.g:1385:1: entryRuleAnonGuaranteeStatement returns [EObject current=null] : iv_ruleAnonGuaranteeStatement= ruleAnonGuaranteeStatement EOF ;
    public final EObject entryRuleAnonGuaranteeStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnonGuaranteeStatement = null;


        try {
            // InternalGumboParser.g:1385:63: (iv_ruleAnonGuaranteeStatement= ruleAnonGuaranteeStatement EOF )
            // InternalGumboParser.g:1386:2: iv_ruleAnonGuaranteeStatement= ruleAnonGuaranteeStatement EOF
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
    // InternalGumboParser.g:1392:1: ruleAnonGuaranteeStatement returns [EObject current=null] : (otherlv_0= Guarantee ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon ) ;
    public final EObject ruleAnonGuaranteeStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1398:2: ( (otherlv_0= Guarantee ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon ) )
            // InternalGumboParser.g:1399:2: (otherlv_0= Guarantee ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon )
            {
            // InternalGumboParser.g:1399:2: (otherlv_0= Guarantee ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon )
            // InternalGumboParser.g:1400:3: otherlv_0= Guarantee ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon
            {
            otherlv_0=(Token)match(input,Guarantee,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAnonGuaranteeStatementAccess().getGuaranteeKeyword_0());
              		
            }
            // InternalGumboParser.g:1404:3: ( (lv_expr_1_0= ruleExpr ) )
            // InternalGumboParser.g:1405:4: (lv_expr_1_0= ruleExpr )
            {
            // InternalGumboParser.g:1405:4: (lv_expr_1_0= ruleExpr )
            // InternalGumboParser.g:1406:5: lv_expr_1_0= ruleExpr
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


    // $ANTLR start "entryRuleOtherDataRef"
    // InternalGumboParser.g:1431:1: entryRuleOtherDataRef returns [EObject current=null] : iv_ruleOtherDataRef= ruleOtherDataRef EOF ;
    public final EObject entryRuleOtherDataRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOtherDataRef = null;


        try {
            // InternalGumboParser.g:1431:53: (iv_ruleOtherDataRef= ruleOtherDataRef EOF )
            // InternalGumboParser.g:1432:2: iv_ruleOtherDataRef= ruleOtherDataRef EOF
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
    // InternalGumboParser.g:1438:1: ruleOtherDataRef returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleOtherDataRef ) ) )? ) ;
    public final EObject ruleOtherDataRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_arrayRange_1_0 = null;

        EObject lv_path_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1444:2: ( ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleOtherDataRef ) ) )? ) )
            // InternalGumboParser.g:1445:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleOtherDataRef ) ) )? )
            {
            // InternalGumboParser.g:1445:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleOtherDataRef ) ) )? )
            // InternalGumboParser.g:1446:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleOtherDataRef ) ) )?
            {
            // InternalGumboParser.g:1446:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* )
            // InternalGumboParser.g:1447:4: ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )*
            {
            // InternalGumboParser.g:1447:4: ( (otherlv_0= RULE_ID ) )
            // InternalGumboParser.g:1448:5: (otherlv_0= RULE_ID )
            {
            // InternalGumboParser.g:1448:5: (otherlv_0= RULE_ID )
            // InternalGumboParser.g:1449:6: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              						/* */
              					
            }
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElement(grammarAccess.getOtherDataRefRule());
              						}
              					
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						newLeafNode(otherlv_0, grammarAccess.getOtherDataRefAccess().getNamedElementNamedElementCrossReference_0_0_0());
              					
            }

            }


            }

            // InternalGumboParser.g:1463:4: ( (lv_arrayRange_1_0= ruleArrayRange ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==LeftSquareBracket) ) {
                    int LA25_2 = input.LA(2);

                    if ( (LA25_2==RULE_INTEGER_LIT) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // InternalGumboParser.g:1464:5: (lv_arrayRange_1_0= ruleArrayRange )
            	    {
            	    // InternalGumboParser.g:1464:5: (lv_arrayRange_1_0= ruleArrayRange )
            	    // InternalGumboParser.g:1465:6: lv_arrayRange_1_0= ruleArrayRange
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOtherDataRefAccess().getArrayRangeArrayRangeParserRuleCall_0_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_30);
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

            // InternalGumboParser.g:1483:3: (otherlv_2= FullStop ( (lv_path_3_0= ruleOtherDataRef ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==FullStop) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalGumboParser.g:1484:4: otherlv_2= FullStop ( (lv_path_3_0= ruleOtherDataRef ) )
                    {
                    otherlv_2=(Token)match(input,FullStop,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getOtherDataRefAccess().getFullStopKeyword_1_0());
                      			
                    }
                    // InternalGumboParser.g:1488:4: ( (lv_path_3_0= ruleOtherDataRef ) )
                    // InternalGumboParser.g:1489:5: (lv_path_3_0= ruleOtherDataRef )
                    {
                    // InternalGumboParser.g:1489:5: (lv_path_3_0= ruleOtherDataRef )
                    // InternalGumboParser.g:1490:6: lv_path_3_0= ruleOtherDataRef
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
    // InternalGumboParser.g:1512:1: entryRuleDataElement returns [EObject current=null] : iv_ruleDataElement= ruleDataElement EOF ;
    public final EObject entryRuleDataElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataElement = null;


        try {
            // InternalGumboParser.g:1512:52: (iv_ruleDataElement= ruleDataElement EOF )
            // InternalGumboParser.g:1513:2: iv_ruleDataElement= ruleDataElement EOF
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
    // InternalGumboParser.g:1519:1: ruleDataElement returns [EObject current=null] : ( ( ruleQCREF ) ) ;
    public final EObject ruleDataElement() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalGumboParser.g:1525:2: ( ( ( ruleQCREF ) ) )
            // InternalGumboParser.g:1526:2: ( ( ruleQCREF ) )
            {
            // InternalGumboParser.g:1526:2: ( ( ruleQCREF ) )
            // InternalGumboParser.g:1527:3: ( ruleQCREF )
            {
            // InternalGumboParser.g:1527:3: ( ruleQCREF )
            // InternalGumboParser.g:1528:4: ruleQCREF
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
    // InternalGumboParser.g:1548:1: entryRuleFunctions returns [EObject current=null] : iv_ruleFunctions= ruleFunctions EOF ;
    public final EObject entryRuleFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctions = null;


        try {
            // InternalGumboParser.g:1548:50: (iv_ruleFunctions= ruleFunctions EOF )
            // InternalGumboParser.g:1549:2: iv_ruleFunctions= ruleFunctions EOF
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
    // InternalGumboParser.g:1555:1: ruleFunctions returns [EObject current=null] : (otherlv_0= Functions ( (lv_specs_1_0= ruleFuncSpec ) )+ ) ;
    public final EObject ruleFunctions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_specs_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1561:2: ( (otherlv_0= Functions ( (lv_specs_1_0= ruleFuncSpec ) )+ ) )
            // InternalGumboParser.g:1562:2: (otherlv_0= Functions ( (lv_specs_1_0= ruleFuncSpec ) )+ )
            {
            // InternalGumboParser.g:1562:2: (otherlv_0= Functions ( (lv_specs_1_0= ruleFuncSpec ) )+ )
            // InternalGumboParser.g:1563:3: otherlv_0= Functions ( (lv_specs_1_0= ruleFuncSpec ) )+
            {
            otherlv_0=(Token)match(input,Functions,FollowSets000.FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunctionsAccess().getFunctionsKeyword_0());
              		
            }
            // InternalGumboParser.g:1567:3: ( (lv_specs_1_0= ruleFuncSpec ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==Def) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalGumboParser.g:1568:4: (lv_specs_1_0= ruleFuncSpec )
            	    {
            	    // InternalGumboParser.g:1568:4: (lv_specs_1_0= ruleFuncSpec )
            	    // InternalGumboParser.g:1569:5: lv_specs_1_0= ruleFuncSpec
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getFunctionsAccess().getSpecsFuncSpecParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_32);
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
    // InternalGumboParser.g:1590:1: entryRuleFuncSpec returns [EObject current=null] : iv_ruleFuncSpec= ruleFuncSpec EOF ;
    public final EObject entryRuleFuncSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncSpec = null;


        try {
            // InternalGumboParser.g:1590:49: (iv_ruleFuncSpec= ruleFuncSpec EOF )
            // InternalGumboParser.g:1591:2: iv_ruleFuncSpec= ruleFuncSpec EOF
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
    // InternalGumboParser.g:1597:1: ruleFuncSpec returns [EObject current=null] : (this_SlangDefDef_0= ruleSlangDefDef otherlv_1= Semicolon ) ;
    public final EObject ruleFuncSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_SlangDefDef_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1603:2: ( (this_SlangDefDef_0= ruleSlangDefDef otherlv_1= Semicolon ) )
            // InternalGumboParser.g:1604:2: (this_SlangDefDef_0= ruleSlangDefDef otherlv_1= Semicolon )
            {
            // InternalGumboParser.g:1604:2: (this_SlangDefDef_0= ruleSlangDefDef otherlv_1= Semicolon )
            // InternalGumboParser.g:1605:3: this_SlangDefDef_0= ruleSlangDefDef otherlv_1= Semicolon
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFuncSpecAccess().getSlangDefDefParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_13);
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
    // InternalGumboParser.g:1624:1: entryRuleSlangDefDecl returns [EObject current=null] : iv_ruleSlangDefDecl= ruleSlangDefDecl EOF ;
    public final EObject entryRuleSlangDefDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangDefDecl = null;


        try {
            // InternalGumboParser.g:1624:53: (iv_ruleSlangDefDecl= ruleSlangDefDecl EOF )
            // InternalGumboParser.g:1625:2: iv_ruleSlangDefDecl= ruleSlangDefDecl EOF
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
    // InternalGumboParser.g:1631:1: ruleSlangDefDecl returns [EObject current=null] : (otherlv_0= Def ( ruleSlangDefMods )? ( (lv_sde_2_0= ruleSlangDefExt ) )? ( (lv_name_3_0= ruleSlangDefID ) ) ( (lv_typeParams_4_0= ruleSlangTypeParams ) )? ( (lv_params_5_0= ruleSlangDefParams ) )? otherlv_6= Colon ( (lv_type_7_0= ruleSlangType ) ) ( (lv_c_8_0= ruleSlangDefContract ) )? ) ;
    public final EObject ruleSlangDefDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_6=null;
        EObject lv_sde_2_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_typeParams_4_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_type_7_0 = null;

        EObject lv_c_8_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1637:2: ( (otherlv_0= Def ( ruleSlangDefMods )? ( (lv_sde_2_0= ruleSlangDefExt ) )? ( (lv_name_3_0= ruleSlangDefID ) ) ( (lv_typeParams_4_0= ruleSlangTypeParams ) )? ( (lv_params_5_0= ruleSlangDefParams ) )? otherlv_6= Colon ( (lv_type_7_0= ruleSlangType ) ) ( (lv_c_8_0= ruleSlangDefContract ) )? ) )
            // InternalGumboParser.g:1638:2: (otherlv_0= Def ( ruleSlangDefMods )? ( (lv_sde_2_0= ruleSlangDefExt ) )? ( (lv_name_3_0= ruleSlangDefID ) ) ( (lv_typeParams_4_0= ruleSlangTypeParams ) )? ( (lv_params_5_0= ruleSlangDefParams ) )? otherlv_6= Colon ( (lv_type_7_0= ruleSlangType ) ) ( (lv_c_8_0= ruleSlangDefContract ) )? )
            {
            // InternalGumboParser.g:1638:2: (otherlv_0= Def ( ruleSlangDefMods )? ( (lv_sde_2_0= ruleSlangDefExt ) )? ( (lv_name_3_0= ruleSlangDefID ) ) ( (lv_typeParams_4_0= ruleSlangTypeParams ) )? ( (lv_params_5_0= ruleSlangDefParams ) )? otherlv_6= Colon ( (lv_type_7_0= ruleSlangType ) ) ( (lv_c_8_0= ruleSlangDefContract ) )? )
            // InternalGumboParser.g:1639:3: otherlv_0= Def ( ruleSlangDefMods )? ( (lv_sde_2_0= ruleSlangDefExt ) )? ( (lv_name_3_0= ruleSlangDefID ) ) ( (lv_typeParams_4_0= ruleSlangTypeParams ) )? ( (lv_params_5_0= ruleSlangDefParams ) )? otherlv_6= Colon ( (lv_type_7_0= ruleSlangType ) ) ( (lv_c_8_0= ruleSlangDefContract ) )?
            {
            otherlv_0=(Token)match(input,Def,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangDefDeclAccess().getDefKeyword_0());
              		
            }
            // InternalGumboParser.g:1643:3: ( ruleSlangDefMods )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Memoize||LA28_0==Strict||LA28_0==Spec||LA28_0==Mut) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalGumboParser.g:1644:4: ruleSlangDefMods
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSlangDefDeclAccess().getSlangDefModsParserRuleCall_1());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_33);
                    ruleSlangDefMods();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalGumboParser.g:1655:3: ( (lv_sde_2_0= ruleSlangDefExt ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==LeftParenthesis) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalGumboParser.g:1656:4: (lv_sde_2_0= ruleSlangDefExt )
                    {
                    // InternalGumboParser.g:1656:4: (lv_sde_2_0= ruleSlangDefExt )
                    // InternalGumboParser.g:1657:5: lv_sde_2_0= ruleSlangDefExt
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangDefDeclAccess().getSdeSlangDefExtParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_33);
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

            // InternalGumboParser.g:1674:3: ( (lv_name_3_0= ruleSlangDefID ) )
            // InternalGumboParser.g:1675:4: (lv_name_3_0= ruleSlangDefID )
            {
            // InternalGumboParser.g:1675:4: (lv_name_3_0= ruleSlangDefID )
            // InternalGumboParser.g:1676:5: lv_name_3_0= ruleSlangDefID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangDefDeclAccess().getNameSlangDefIDParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_34);
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

            // InternalGumboParser.g:1693:3: ( (lv_typeParams_4_0= ruleSlangTypeParams ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==LeftSquareBracket) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalGumboParser.g:1694:4: (lv_typeParams_4_0= ruleSlangTypeParams )
                    {
                    // InternalGumboParser.g:1694:4: (lv_typeParams_4_0= ruleSlangTypeParams )
                    // InternalGumboParser.g:1695:5: lv_typeParams_4_0= ruleSlangTypeParams
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangDefDeclAccess().getTypeParamsSlangTypeParamsParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_35);
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

            // InternalGumboParser.g:1712:3: ( (lv_params_5_0= ruleSlangDefParams ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==LeftParenthesis) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalGumboParser.g:1713:4: (lv_params_5_0= ruleSlangDefParams )
                    {
                    // InternalGumboParser.g:1713:4: (lv_params_5_0= ruleSlangDefParams )
                    // InternalGumboParser.g:1714:5: lv_params_5_0= ruleSlangDefParams
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangDefDeclAccess().getParamsSlangDefParamsParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_12);
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

            otherlv_6=(Token)match(input,Colon,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getSlangDefDeclAccess().getColonKeyword_6());
              		
            }
            // InternalGumboParser.g:1735:3: ( (lv_type_7_0= ruleSlangType ) )
            // InternalGumboParser.g:1736:4: (lv_type_7_0= ruleSlangType )
            {
            // InternalGumboParser.g:1736:4: (lv_type_7_0= ruleSlangType )
            // InternalGumboParser.g:1737:5: lv_type_7_0= ruleSlangType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangDefDeclAccess().getTypeSlangTypeParserRuleCall_7_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_36);
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

            // InternalGumboParser.g:1754:3: ( (lv_c_8_0= ruleSlangDefContract ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==Spec) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalGumboParser.g:1755:4: (lv_c_8_0= ruleSlangDefContract )
                    {
                    // InternalGumboParser.g:1755:4: (lv_c_8_0= ruleSlangDefContract )
                    // InternalGumboParser.g:1756:5: lv_c_8_0= ruleSlangDefContract
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
    // InternalGumboParser.g:1777:1: entryRuleSlangDefDef returns [EObject current=null] : iv_ruleSlangDefDef= ruleSlangDefDef EOF ;
    public final EObject entryRuleSlangDefDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangDefDef = null;


        try {
            // InternalGumboParser.g:1777:52: (iv_ruleSlangDefDef= ruleSlangDefDef EOF )
            // InternalGumboParser.g:1778:2: iv_ruleSlangDefDef= ruleSlangDefDef EOF
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
    // InternalGumboParser.g:1784:1: ruleSlangDefDef returns [EObject current=null] : (otherlv_0= Def ( ruleSlangDefMods )? ( (lv_sde_2_0= ruleSlangDefExt ) )? ( (lv_name_3_0= ruleSlangDefID ) ) ( (lv_typeParams_4_0= ruleSlangTypeParams ) )? ( (lv_params_5_0= ruleSlangDefParams ) )? otherlv_6= Colon ( (lv_type_7_0= ruleSlangType ) ) ( (lv_c_8_0= ruleSlangDefContract ) )? otherlv_9= ColonEqualsSign ( (lv_e_10_0= ruleExpr ) ) ) ;
    public final EObject ruleSlangDefDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_sde_2_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_typeParams_4_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_type_7_0 = null;

        EObject lv_c_8_0 = null;

        EObject lv_e_10_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1790:2: ( (otherlv_0= Def ( ruleSlangDefMods )? ( (lv_sde_2_0= ruleSlangDefExt ) )? ( (lv_name_3_0= ruleSlangDefID ) ) ( (lv_typeParams_4_0= ruleSlangTypeParams ) )? ( (lv_params_5_0= ruleSlangDefParams ) )? otherlv_6= Colon ( (lv_type_7_0= ruleSlangType ) ) ( (lv_c_8_0= ruleSlangDefContract ) )? otherlv_9= ColonEqualsSign ( (lv_e_10_0= ruleExpr ) ) ) )
            // InternalGumboParser.g:1791:2: (otherlv_0= Def ( ruleSlangDefMods )? ( (lv_sde_2_0= ruleSlangDefExt ) )? ( (lv_name_3_0= ruleSlangDefID ) ) ( (lv_typeParams_4_0= ruleSlangTypeParams ) )? ( (lv_params_5_0= ruleSlangDefParams ) )? otherlv_6= Colon ( (lv_type_7_0= ruleSlangType ) ) ( (lv_c_8_0= ruleSlangDefContract ) )? otherlv_9= ColonEqualsSign ( (lv_e_10_0= ruleExpr ) ) )
            {
            // InternalGumboParser.g:1791:2: (otherlv_0= Def ( ruleSlangDefMods )? ( (lv_sde_2_0= ruleSlangDefExt ) )? ( (lv_name_3_0= ruleSlangDefID ) ) ( (lv_typeParams_4_0= ruleSlangTypeParams ) )? ( (lv_params_5_0= ruleSlangDefParams ) )? otherlv_6= Colon ( (lv_type_7_0= ruleSlangType ) ) ( (lv_c_8_0= ruleSlangDefContract ) )? otherlv_9= ColonEqualsSign ( (lv_e_10_0= ruleExpr ) ) )
            // InternalGumboParser.g:1792:3: otherlv_0= Def ( ruleSlangDefMods )? ( (lv_sde_2_0= ruleSlangDefExt ) )? ( (lv_name_3_0= ruleSlangDefID ) ) ( (lv_typeParams_4_0= ruleSlangTypeParams ) )? ( (lv_params_5_0= ruleSlangDefParams ) )? otherlv_6= Colon ( (lv_type_7_0= ruleSlangType ) ) ( (lv_c_8_0= ruleSlangDefContract ) )? otherlv_9= ColonEqualsSign ( (lv_e_10_0= ruleExpr ) )
            {
            otherlv_0=(Token)match(input,Def,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangDefDefAccess().getDefKeyword_0());
              		
            }
            // InternalGumboParser.g:1796:3: ( ruleSlangDefMods )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==Memoize||LA33_0==Strict||LA33_0==Spec||LA33_0==Mut) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalGumboParser.g:1797:4: ruleSlangDefMods
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSlangDefDefAccess().getSlangDefModsParserRuleCall_1());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_33);
                    ruleSlangDefMods();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalGumboParser.g:1808:3: ( (lv_sde_2_0= ruleSlangDefExt ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==LeftParenthesis) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalGumboParser.g:1809:4: (lv_sde_2_0= ruleSlangDefExt )
                    {
                    // InternalGumboParser.g:1809:4: (lv_sde_2_0= ruleSlangDefExt )
                    // InternalGumboParser.g:1810:5: lv_sde_2_0= ruleSlangDefExt
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangDefDefAccess().getSdeSlangDefExtParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_33);
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

            // InternalGumboParser.g:1827:3: ( (lv_name_3_0= ruleSlangDefID ) )
            // InternalGumboParser.g:1828:4: (lv_name_3_0= ruleSlangDefID )
            {
            // InternalGumboParser.g:1828:4: (lv_name_3_0= ruleSlangDefID )
            // InternalGumboParser.g:1829:5: lv_name_3_0= ruleSlangDefID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangDefDefAccess().getNameSlangDefIDParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_34);
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

            // InternalGumboParser.g:1846:3: ( (lv_typeParams_4_0= ruleSlangTypeParams ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==LeftSquareBracket) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalGumboParser.g:1847:4: (lv_typeParams_4_0= ruleSlangTypeParams )
                    {
                    // InternalGumboParser.g:1847:4: (lv_typeParams_4_0= ruleSlangTypeParams )
                    // InternalGumboParser.g:1848:5: lv_typeParams_4_0= ruleSlangTypeParams
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangDefDefAccess().getTypeParamsSlangTypeParamsParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_35);
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

            // InternalGumboParser.g:1865:3: ( (lv_params_5_0= ruleSlangDefParams ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==LeftParenthesis) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalGumboParser.g:1866:4: (lv_params_5_0= ruleSlangDefParams )
                    {
                    // InternalGumboParser.g:1866:4: (lv_params_5_0= ruleSlangDefParams )
                    // InternalGumboParser.g:1867:5: lv_params_5_0= ruleSlangDefParams
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangDefDefAccess().getParamsSlangDefParamsParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_12);
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
                    break;

            }

            otherlv_6=(Token)match(input,Colon,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getSlangDefDefAccess().getColonKeyword_6());
              		
            }
            // InternalGumboParser.g:1888:3: ( (lv_type_7_0= ruleSlangType ) )
            // InternalGumboParser.g:1889:4: (lv_type_7_0= ruleSlangType )
            {
            // InternalGumboParser.g:1889:4: (lv_type_7_0= ruleSlangType )
            // InternalGumboParser.g:1890:5: lv_type_7_0= ruleSlangType
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

            // InternalGumboParser.g:1907:3: ( (lv_c_8_0= ruleSlangDefContract ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==Spec) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalGumboParser.g:1908:4: (lv_c_8_0= ruleSlangDefContract )
                    {
                    // InternalGumboParser.g:1908:4: (lv_c_8_0= ruleSlangDefContract )
                    // InternalGumboParser.g:1909:5: lv_c_8_0= ruleSlangDefContract
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangDefDefAccess().getCSlangDefContractParserRuleCall_8_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_38);
                    lv_c_8_0=ruleSlangDefContract();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSlangDefDefRule());
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

            otherlv_9=(Token)match(input,ColonEqualsSign,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getSlangDefDefAccess().getColonEqualsSignKeyword_9());
              		
            }
            // InternalGumboParser.g:1930:3: ( (lv_e_10_0= ruleExpr ) )
            // InternalGumboParser.g:1931:4: (lv_e_10_0= ruleExpr )
            {
            // InternalGumboParser.g:1931:4: (lv_e_10_0= ruleExpr )
            // InternalGumboParser.g:1932:5: lv_e_10_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangDefDefAccess().getEExprParserRuleCall_10_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_e_10_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSlangDefDefRule());
              					}
              					set(
              						current,
              						"e",
              						lv_e_10_0,
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
    // InternalGumboParser.g:1953:1: entryRuleSlangDefMods returns [String current=null] : iv_ruleSlangDefMods= ruleSlangDefMods EOF ;
    public final String entryRuleSlangDefMods() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSlangDefMods = null;


        try {
            // InternalGumboParser.g:1953:52: (iv_ruleSlangDefMods= ruleSlangDefMods EOF )
            // InternalGumboParser.g:1954:2: iv_ruleSlangDefMods= ruleSlangDefMods EOF
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
    // InternalGumboParser.g:1960:1: ruleSlangDefMods returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Strict | kw= Memoize | kw= Mut | kw= Spec ) ;
    public final AntlrDatatypeRuleToken ruleSlangDefMods() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumboParser.g:1966:2: ( (kw= Strict | kw= Memoize | kw= Mut | kw= Spec ) )
            // InternalGumboParser.g:1967:2: (kw= Strict | kw= Memoize | kw= Mut | kw= Spec )
            {
            // InternalGumboParser.g:1967:2: (kw= Strict | kw= Memoize | kw= Mut | kw= Spec )
            int alt38=4;
            switch ( input.LA(1) ) {
            case Strict:
                {
                alt38=1;
                }
                break;
            case Memoize:
                {
                alt38=2;
                }
                break;
            case Mut:
                {
                alt38=3;
                }
                break;
            case Spec:
                {
                alt38=4;
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
                    // InternalGumboParser.g:1968:3: kw= Strict
                    {
                    kw=(Token)match(input,Strict,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getSlangDefModsAccess().getStrictKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:1974:3: kw= Memoize
                    {
                    kw=(Token)match(input,Memoize,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getSlangDefModsAccess().getMemoizeKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGumboParser.g:1980:3: kw= Mut
                    {
                    kw=(Token)match(input,Mut,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getSlangDefModsAccess().getMutKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGumboParser.g:1986:3: kw= Spec
                    {
                    kw=(Token)match(input,Spec,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getSlangDefModsAccess().getSpecKeyword_3());
                      		
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
    // InternalGumboParser.g:1995:1: entryRuleSlangDefExt returns [EObject current=null] : iv_ruleSlangDefExt= ruleSlangDefExt EOF ;
    public final EObject entryRuleSlangDefExt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangDefExt = null;


        try {
            // InternalGumboParser.g:1995:52: (iv_ruleSlangDefExt= ruleSlangDefExt EOF )
            // InternalGumboParser.g:1996:2: iv_ruleSlangDefExt= ruleSlangDefExt EOF
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
    // InternalGumboParser.g:2002:1: ruleSlangDefExt returns [EObject current=null] : (otherlv_0= LeftParenthesis ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) otherlv_4= RightParenthesis ) ;
    public final EObject ruleSlangDefExt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_typeName_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2008:2: ( (otherlv_0= LeftParenthesis ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) otherlv_4= RightParenthesis ) )
            // InternalGumboParser.g:2009:2: (otherlv_0= LeftParenthesis ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) otherlv_4= RightParenthesis )
            {
            // InternalGumboParser.g:2009:2: (otherlv_0= LeftParenthesis ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) otherlv_4= RightParenthesis )
            // InternalGumboParser.g:2010:3: otherlv_0= LeftParenthesis ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) otherlv_4= RightParenthesis
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangDefExtAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalGumboParser.g:2014:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGumboParser.g:2015:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGumboParser.g:2015:4: (lv_name_1_0= RULE_ID )
            // InternalGumboParser.g:2016:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_12); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,Colon,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSlangDefExtAccess().getColonKeyword_2());
              		
            }
            // InternalGumboParser.g:2036:3: ( (lv_typeName_3_0= ruleSlangType ) )
            // InternalGumboParser.g:2037:4: (lv_typeName_3_0= ruleSlangType )
            {
            // InternalGumboParser.g:2037:4: (lv_typeName_3_0= ruleSlangType )
            // InternalGumboParser.g:2038:5: lv_typeName_3_0= ruleSlangType
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
    // InternalGumboParser.g:2063:1: entryRuleSlangDefID returns [String current=null] : iv_ruleSlangDefID= ruleSlangDefID EOF ;
    public final String entryRuleSlangDefID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSlangDefID = null;


        try {
            // InternalGumboParser.g:2063:50: (iv_ruleSlangDefID= ruleSlangDefID EOF )
            // InternalGumboParser.g:2064:2: iv_ruleSlangDefID= ruleSlangDefID EOF
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
    // InternalGumboParser.g:2070:1: ruleSlangDefID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_Operator_1= ruleOperator ) ;
    public final AntlrDatatypeRuleToken ruleSlangDefID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        AntlrDatatypeRuleToken this_Operator_1 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2076:2: ( (this_ID_0= RULE_ID | this_Operator_1= ruleOperator ) )
            // InternalGumboParser.g:2077:2: (this_ID_0= RULE_ID | this_Operator_1= ruleOperator )
            {
            // InternalGumboParser.g:2077:2: (this_ID_0= RULE_ID | this_Operator_1= ruleOperator )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID) ) {
                alt39=1;
            }
            else if ( ((LA39_0>=Asterisk && LA39_0<=PlusSign)||LA39_0==HyphenMinus||LA39_0==RULE_OP) ) {
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
                    // InternalGumboParser.g:2078:3: this_ID_0= RULE_ID
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
                    // InternalGumboParser.g:2086:3: this_Operator_1= ruleOperator
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
    // InternalGumboParser.g:2100:1: entryRuleSlangDefParams returns [EObject current=null] : iv_ruleSlangDefParams= ruleSlangDefParams EOF ;
    public final EObject entryRuleSlangDefParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangDefParams = null;


        try {
            // InternalGumboParser.g:2100:55: (iv_ruleSlangDefParams= ruleSlangDefParams EOF )
            // InternalGumboParser.g:2101:2: iv_ruleSlangDefParams= ruleSlangDefParams EOF
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
    // InternalGumboParser.g:2107:1: ruleSlangDefParams returns [EObject current=null] : (otherlv_0= LeftParenthesis ( (lv_params_1_0= ruleSlangDefParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangDefParam ) ) )? otherlv_4= RightParenthesis ) ;
    public final EObject ruleSlangDefParams() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_params_1_0 = null;

        EObject lv_params_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2113:2: ( (otherlv_0= LeftParenthesis ( (lv_params_1_0= ruleSlangDefParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangDefParam ) ) )? otherlv_4= RightParenthesis ) )
            // InternalGumboParser.g:2114:2: (otherlv_0= LeftParenthesis ( (lv_params_1_0= ruleSlangDefParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangDefParam ) ) )? otherlv_4= RightParenthesis )
            {
            // InternalGumboParser.g:2114:2: (otherlv_0= LeftParenthesis ( (lv_params_1_0= ruleSlangDefParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangDefParam ) ) )? otherlv_4= RightParenthesis )
            // InternalGumboParser.g:2115:3: otherlv_0= LeftParenthesis ( (lv_params_1_0= ruleSlangDefParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangDefParam ) ) )? otherlv_4= RightParenthesis
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangDefParamsAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalGumboParser.g:2119:3: ( (lv_params_1_0= ruleSlangDefParam ) )
            // InternalGumboParser.g:2120:4: (lv_params_1_0= ruleSlangDefParam )
            {
            // InternalGumboParser.g:2120:4: (lv_params_1_0= ruleSlangDefParam )
            // InternalGumboParser.g:2121:5: lv_params_1_0= ruleSlangDefParam
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangDefParamsAccess().getParamsSlangDefParamParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_40);
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

            // InternalGumboParser.g:2138:3: (otherlv_2= Comma ( (lv_params_3_0= ruleSlangDefParam ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==Comma) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalGumboParser.g:2139:4: otherlv_2= Comma ( (lv_params_3_0= ruleSlangDefParam ) )
                    {
                    otherlv_2=(Token)match(input,Comma,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSlangDefParamsAccess().getCommaKeyword_2_0());
                      			
                    }
                    // InternalGumboParser.g:2143:4: ( (lv_params_3_0= ruleSlangDefParam ) )
                    // InternalGumboParser.g:2144:5: (lv_params_3_0= ruleSlangDefParam )
                    {
                    // InternalGumboParser.g:2144:5: (lv_params_3_0= ruleSlangDefParam )
                    // InternalGumboParser.g:2145:6: lv_params_3_0= ruleSlangDefParam
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangDefParamsAccess().getParamsSlangDefParamParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_39);
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

            }

            otherlv_4=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getSlangDefParamsAccess().getRightParenthesisKeyword_3());
              		
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
    // InternalGumboParser.g:2171:1: entryRuleSlangDefParam returns [EObject current=null] : iv_ruleSlangDefParam= ruleSlangDefParam EOF ;
    public final EObject entryRuleSlangDefParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangDefParam = null;


        try {
            // InternalGumboParser.g:2171:54: (iv_ruleSlangDefParam= ruleSlangDefParam EOF )
            // InternalGumboParser.g:2172:2: iv_ruleSlangDefParam= ruleSlangDefParam EOF
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
    // InternalGumboParser.g:2178:1: ruleSlangDefParam returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon (otherlv_2= EqualsSignGreaterThanSign )? ( (lv_typeName_3_0= ruleSlangType ) ) (otherlv_4= Asterisk )? ) ;
    public final EObject ruleSlangDefParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_typeName_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2184:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon (otherlv_2= EqualsSignGreaterThanSign )? ( (lv_typeName_3_0= ruleSlangType ) ) (otherlv_4= Asterisk )? ) )
            // InternalGumboParser.g:2185:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon (otherlv_2= EqualsSignGreaterThanSign )? ( (lv_typeName_3_0= ruleSlangType ) ) (otherlv_4= Asterisk )? )
            {
            // InternalGumboParser.g:2185:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon (otherlv_2= EqualsSignGreaterThanSign )? ( (lv_typeName_3_0= ruleSlangType ) ) (otherlv_4= Asterisk )? )
            // InternalGumboParser.g:2186:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon (otherlv_2= EqualsSignGreaterThanSign )? ( (lv_typeName_3_0= ruleSlangType ) ) (otherlv_4= Asterisk )?
            {
            // InternalGumboParser.g:2186:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGumboParser.g:2187:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGumboParser.g:2187:4: (lv_name_0_0= RULE_ID )
            // InternalGumboParser.g:2188:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_12); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,Colon,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSlangDefParamAccess().getColonKeyword_1());
              		
            }
            // InternalGumboParser.g:2208:3: (otherlv_2= EqualsSignGreaterThanSign )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==EqualsSignGreaterThanSign) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalGumboParser.g:2209:4: otherlv_2= EqualsSignGreaterThanSign
                    {
                    otherlv_2=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSlangDefParamAccess().getEqualsSignGreaterThanSignKeyword_2());
                      			
                    }

                    }
                    break;

            }

            // InternalGumboParser.g:2214:3: ( (lv_typeName_3_0= ruleSlangType ) )
            // InternalGumboParser.g:2215:4: (lv_typeName_3_0= ruleSlangType )
            {
            // InternalGumboParser.g:2215:4: (lv_typeName_3_0= ruleSlangType )
            // InternalGumboParser.g:2216:5: lv_typeName_3_0= ruleSlangType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangDefParamAccess().getTypeNameSlangTypeParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_42);
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

            // InternalGumboParser.g:2233:3: (otherlv_4= Asterisk )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==Asterisk) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalGumboParser.g:2234:4: otherlv_4= Asterisk
                    {
                    otherlv_4=(Token)match(input,Asterisk,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getSlangDefParamAccess().getAsteriskKeyword_4());
                      			
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
    // InternalGumboParser.g:2243:1: entryRuleSlangTypeParams returns [String current=null] : iv_ruleSlangTypeParams= ruleSlangTypeParams EOF ;
    public final String entryRuleSlangTypeParams() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSlangTypeParams = null;


        try {
            // InternalGumboParser.g:2243:55: (iv_ruleSlangTypeParams= ruleSlangTypeParams EOF )
            // InternalGumboParser.g:2244:2: iv_ruleSlangTypeParams= ruleSlangTypeParams EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlangTypeParamsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlangTypeParams=ruleSlangTypeParams();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlangTypeParams.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalGumboParser.g:2250:1: ruleSlangTypeParams returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= LeftSquareBracket this_SlangTypeParam_1= ruleSlangTypeParam (kw= Comma this_SlangTypeParam_3= ruleSlangTypeParam )* kw= RightSquareBracket ) ;
    public final AntlrDatatypeRuleToken ruleSlangTypeParams() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_SlangTypeParam_1 = null;

        AntlrDatatypeRuleToken this_SlangTypeParam_3 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2256:2: ( (kw= LeftSquareBracket this_SlangTypeParam_1= ruleSlangTypeParam (kw= Comma this_SlangTypeParam_3= ruleSlangTypeParam )* kw= RightSquareBracket ) )
            // InternalGumboParser.g:2257:2: (kw= LeftSquareBracket this_SlangTypeParam_1= ruleSlangTypeParam (kw= Comma this_SlangTypeParam_3= ruleSlangTypeParam )* kw= RightSquareBracket )
            {
            // InternalGumboParser.g:2257:2: (kw= LeftSquareBracket this_SlangTypeParam_1= ruleSlangTypeParam (kw= Comma this_SlangTypeParam_3= ruleSlangTypeParam )* kw= RightSquareBracket )
            // InternalGumboParser.g:2258:3: kw= LeftSquareBracket this_SlangTypeParam_1= ruleSlangTypeParam (kw= Comma this_SlangTypeParam_3= ruleSlangTypeParam )* kw= RightSquareBracket
            {
            kw=(Token)match(input,LeftSquareBracket,FollowSets000.FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSlangTypeParamsAccess().getLeftSquareBracketKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSlangTypeParamsAccess().getSlangTypeParamParserRuleCall_1());
              		
            }
            pushFollow(FollowSets000.FOLLOW_44);
            this_SlangTypeParam_1=ruleSlangTypeParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_SlangTypeParam_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGumboParser.g:2273:3: (kw= Comma this_SlangTypeParam_3= ruleSlangTypeParam )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==Comma) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalGumboParser.g:2274:4: kw= Comma this_SlangTypeParam_3= ruleSlangTypeParam
            	    {
            	    kw=(Token)match(input,Comma,FollowSets000.FOLLOW_43); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getSlangTypeParamsAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getSlangTypeParamsAccess().getSlangTypeParamParserRuleCall_2_1());
            	      			
            	    }
            	    pushFollow(FollowSets000.FOLLOW_44);
            	    this_SlangTypeParam_3=ruleSlangTypeParam();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_SlangTypeParam_3);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            kw=(Token)match(input,RightSquareBracket,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSlangTypeParamsAccess().getRightSquareBracketKeyword_3());
              		
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
    // InternalGumboParser.g:2299:1: entryRuleSlangTypeParam returns [String current=null] : iv_ruleSlangTypeParam= ruleSlangTypeParam EOF ;
    public final String entryRuleSlangTypeParam() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSlangTypeParam = null;


        try {
            // InternalGumboParser.g:2299:54: (iv_ruleSlangTypeParam= ruleSlangTypeParam EOF )
            // InternalGumboParser.g:2300:2: iv_ruleSlangTypeParam= ruleSlangTypeParam EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlangTypeParamRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSlangTypeParam=ruleSlangTypeParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlangTypeParam.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalGumboParser.g:2306:1: ruleSlangTypeParam returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= Mut )? this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleSlangTypeParam() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalGumboParser.g:2312:2: ( ( (kw= Mut )? this_ID_1= RULE_ID ) )
            // InternalGumboParser.g:2313:2: ( (kw= Mut )? this_ID_1= RULE_ID )
            {
            // InternalGumboParser.g:2313:2: ( (kw= Mut )? this_ID_1= RULE_ID )
            // InternalGumboParser.g:2314:3: (kw= Mut )? this_ID_1= RULE_ID
            {
            // InternalGumboParser.g:2314:3: (kw= Mut )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==Mut) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalGumboParser.g:2315:4: kw= Mut
                    {
                    kw=(Token)match(input,Mut,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSlangTypeParamAccess().getMutKeyword_0());
                      			
                    }

                    }
                    break;

            }

            this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_1, grammarAccess.getSlangTypeParamAccess().getIDTerminalRuleCall_1());
              		
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
    // InternalGumboParser.g:2332:1: entryRuleSlangDefContract returns [EObject current=null] : iv_ruleSlangDefContract= ruleSlangDefContract EOF ;
    public final EObject entryRuleSlangDefContract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangDefContract = null;


        try {
            // InternalGumboParser.g:2332:57: (iv_ruleSlangDefContract= ruleSlangDefContract EOF )
            // InternalGumboParser.g:2333:2: iv_ruleSlangDefContract= ruleSlangDefContract EOF
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
    // InternalGumboParser.g:2339:1: ruleSlangDefContract returns [EObject current=null] : ( () otherlv_1= Spec ( ( ( (lv_rea_2_0= ruleSlangReads ) )? ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_mod_4_0= ruleSlangModifies ) )? ( (lv_ens_5_0= ruleSlangEnsures ) )? ) | ( ( (lv_contracts_6_0= ruleSlangDefContractCase ) )+ ( (lv_rea_7_0= ruleSlangReads ) )? ( (lv_mod_8_0= ruleSlangModifies ) )? ) ) ) ;
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
            // InternalGumboParser.g:2345:2: ( ( () otherlv_1= Spec ( ( ( (lv_rea_2_0= ruleSlangReads ) )? ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_mod_4_0= ruleSlangModifies ) )? ( (lv_ens_5_0= ruleSlangEnsures ) )? ) | ( ( (lv_contracts_6_0= ruleSlangDefContractCase ) )+ ( (lv_rea_7_0= ruleSlangReads ) )? ( (lv_mod_8_0= ruleSlangModifies ) )? ) ) ) )
            // InternalGumboParser.g:2346:2: ( () otherlv_1= Spec ( ( ( (lv_rea_2_0= ruleSlangReads ) )? ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_mod_4_0= ruleSlangModifies ) )? ( (lv_ens_5_0= ruleSlangEnsures ) )? ) | ( ( (lv_contracts_6_0= ruleSlangDefContractCase ) )+ ( (lv_rea_7_0= ruleSlangReads ) )? ( (lv_mod_8_0= ruleSlangModifies ) )? ) ) )
            {
            // InternalGumboParser.g:2346:2: ( () otherlv_1= Spec ( ( ( (lv_rea_2_0= ruleSlangReads ) )? ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_mod_4_0= ruleSlangModifies ) )? ( (lv_ens_5_0= ruleSlangEnsures ) )? ) | ( ( (lv_contracts_6_0= ruleSlangDefContractCase ) )+ ( (lv_rea_7_0= ruleSlangReads ) )? ( (lv_mod_8_0= ruleSlangModifies ) )? ) ) )
            // InternalGumboParser.g:2347:3: () otherlv_1= Spec ( ( ( (lv_rea_2_0= ruleSlangReads ) )? ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_mod_4_0= ruleSlangModifies ) )? ( (lv_ens_5_0= ruleSlangEnsures ) )? ) | ( ( (lv_contracts_6_0= ruleSlangDefContractCase ) )+ ( (lv_rea_7_0= ruleSlangReads ) )? ( (lv_mod_8_0= ruleSlangModifies ) )? ) )
            {
            // InternalGumboParser.g:2347:3: ()
            // InternalGumboParser.g:2348:4: 
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

            otherlv_1=(Token)match(input,Spec,FollowSets000.FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSlangDefContractAccess().getSpecKeyword_1());
              		
            }
            // InternalGumboParser.g:2361:3: ( ( ( (lv_rea_2_0= ruleSlangReads ) )? ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_mod_4_0= ruleSlangModifies ) )? ( (lv_ens_5_0= ruleSlangEnsures ) )? ) | ( ( (lv_contracts_6_0= ruleSlangDefContractCase ) )+ ( (lv_rea_7_0= ruleSlangReads ) )? ( (lv_mod_8_0= ruleSlangModifies ) )? ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==EOF||(LA52_0>=Modifies && LA52_0<=Requires)||LA52_0==Ensures||LA52_0==Reads||LA52_0==ColonEqualsSign) ) {
                alt52=1;
            }
            else if ( (LA52_0==Case) ) {
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
                    // InternalGumboParser.g:2362:4: ( ( (lv_rea_2_0= ruleSlangReads ) )? ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_mod_4_0= ruleSlangModifies ) )? ( (lv_ens_5_0= ruleSlangEnsures ) )? )
                    {
                    // InternalGumboParser.g:2362:4: ( ( (lv_rea_2_0= ruleSlangReads ) )? ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_mod_4_0= ruleSlangModifies ) )? ( (lv_ens_5_0= ruleSlangEnsures ) )? )
                    // InternalGumboParser.g:2363:5: ( (lv_rea_2_0= ruleSlangReads ) )? ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_mod_4_0= ruleSlangModifies ) )? ( (lv_ens_5_0= ruleSlangEnsures ) )?
                    {
                    // InternalGumboParser.g:2363:5: ( (lv_rea_2_0= ruleSlangReads ) )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==Reads) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalGumboParser.g:2364:6: (lv_rea_2_0= ruleSlangReads )
                            {
                            // InternalGumboParser.g:2364:6: (lv_rea_2_0= ruleSlangReads )
                            // InternalGumboParser.g:2365:7: lv_rea_2_0= ruleSlangReads
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSlangDefContractAccess().getReaSlangReadsParserRuleCall_2_0_0_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_46);
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

                    // InternalGumboParser.g:2382:5: ( (lv_req_3_0= ruleSlangRequires ) )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==Requires) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalGumboParser.g:2383:6: (lv_req_3_0= ruleSlangRequires )
                            {
                            // InternalGumboParser.g:2383:6: (lv_req_3_0= ruleSlangRequires )
                            // InternalGumboParser.g:2384:7: lv_req_3_0= ruleSlangRequires
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSlangDefContractAccess().getReqSlangRequiresParserRuleCall_2_0_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_47);
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

                    // InternalGumboParser.g:2401:5: ( (lv_mod_4_0= ruleSlangModifies ) )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==Modifies) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // InternalGumboParser.g:2402:6: (lv_mod_4_0= ruleSlangModifies )
                            {
                            // InternalGumboParser.g:2402:6: (lv_mod_4_0= ruleSlangModifies )
                            // InternalGumboParser.g:2403:7: lv_mod_4_0= ruleSlangModifies
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSlangDefContractAccess().getModSlangModifiesParserRuleCall_2_0_2_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_48);
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

                    // InternalGumboParser.g:2420:5: ( (lv_ens_5_0= ruleSlangEnsures ) )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==Ensures) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalGumboParser.g:2421:6: (lv_ens_5_0= ruleSlangEnsures )
                            {
                            // InternalGumboParser.g:2421:6: (lv_ens_5_0= ruleSlangEnsures )
                            // InternalGumboParser.g:2422:7: lv_ens_5_0= ruleSlangEnsures
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
                    // InternalGumboParser.g:2441:4: ( ( (lv_contracts_6_0= ruleSlangDefContractCase ) )+ ( (lv_rea_7_0= ruleSlangReads ) )? ( (lv_mod_8_0= ruleSlangModifies ) )? )
                    {
                    // InternalGumboParser.g:2441:4: ( ( (lv_contracts_6_0= ruleSlangDefContractCase ) )+ ( (lv_rea_7_0= ruleSlangReads ) )? ( (lv_mod_8_0= ruleSlangModifies ) )? )
                    // InternalGumboParser.g:2442:5: ( (lv_contracts_6_0= ruleSlangDefContractCase ) )+ ( (lv_rea_7_0= ruleSlangReads ) )? ( (lv_mod_8_0= ruleSlangModifies ) )?
                    {
                    // InternalGumboParser.g:2442:5: ( (lv_contracts_6_0= ruleSlangDefContractCase ) )+
                    int cnt49=0;
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==Case) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalGumboParser.g:2443:6: (lv_contracts_6_0= ruleSlangDefContractCase )
                    	    {
                    	    // InternalGumboParser.g:2443:6: (lv_contracts_6_0= ruleSlangDefContractCase )
                    	    // InternalGumboParser.g:2444:7: lv_contracts_6_0= ruleSlangDefContractCase
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSlangDefContractAccess().getContractsSlangDefContractCaseParserRuleCall_2_1_0_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_45);
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
                    	    if ( cnt49 >= 1 ) break loop49;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(49, input);
                                throw eee;
                        }
                        cnt49++;
                    } while (true);

                    // InternalGumboParser.g:2461:5: ( (lv_rea_7_0= ruleSlangReads ) )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==Reads) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // InternalGumboParser.g:2462:6: (lv_rea_7_0= ruleSlangReads )
                            {
                            // InternalGumboParser.g:2462:6: (lv_rea_7_0= ruleSlangReads )
                            // InternalGumboParser.g:2463:7: lv_rea_7_0= ruleSlangReads
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSlangDefContractAccess().getReaSlangReadsParserRuleCall_2_1_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_49);
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

                    // InternalGumboParser.g:2480:5: ( (lv_mod_8_0= ruleSlangModifies ) )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==Modifies) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // InternalGumboParser.g:2481:6: (lv_mod_8_0= ruleSlangModifies )
                            {
                            // InternalGumboParser.g:2481:6: (lv_mod_8_0= ruleSlangModifies )
                            // InternalGumboParser.g:2482:7: lv_mod_8_0= ruleSlangModifies
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
    // InternalGumboParser.g:2505:1: entryRuleSlangDefContractCase returns [EObject current=null] : iv_ruleSlangDefContractCase= ruleSlangDefContractCase EOF ;
    public final EObject entryRuleSlangDefContractCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangDefContractCase = null;


        try {
            // InternalGumboParser.g:2505:61: (iv_ruleSlangDefContractCase= ruleSlangDefContractCase EOF )
            // InternalGumboParser.g:2506:2: iv_ruleSlangDefContractCase= ruleSlangDefContractCase EOF
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
    // InternalGumboParser.g:2512:1: ruleSlangDefContractCase returns [EObject current=null] : ( () otherlv_1= Case this_SLANG_STRING_2= RULE_SLANG_STRING ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_ens_4_0= ruleSlangEnsures ) )? ) ;
    public final EObject ruleSlangDefContractCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_SLANG_STRING_2=null;
        EObject lv_req_3_0 = null;

        EObject lv_ens_4_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2518:2: ( ( () otherlv_1= Case this_SLANG_STRING_2= RULE_SLANG_STRING ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_ens_4_0= ruleSlangEnsures ) )? ) )
            // InternalGumboParser.g:2519:2: ( () otherlv_1= Case this_SLANG_STRING_2= RULE_SLANG_STRING ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_ens_4_0= ruleSlangEnsures ) )? )
            {
            // InternalGumboParser.g:2519:2: ( () otherlv_1= Case this_SLANG_STRING_2= RULE_SLANG_STRING ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_ens_4_0= ruleSlangEnsures ) )? )
            // InternalGumboParser.g:2520:3: () otherlv_1= Case this_SLANG_STRING_2= RULE_SLANG_STRING ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_ens_4_0= ruleSlangEnsures ) )?
            {
            // InternalGumboParser.g:2520:3: ()
            // InternalGumboParser.g:2521:4: 
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

            otherlv_1=(Token)match(input,Case,FollowSets000.FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSlangDefContractCaseAccess().getCaseKeyword_1());
              		
            }
            this_SLANG_STRING_2=(Token)match(input,RULE_SLANG_STRING,FollowSets000.FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_SLANG_STRING_2, grammarAccess.getSlangDefContractCaseAccess().getSLANG_STRINGTerminalRuleCall_2());
              		
            }
            // InternalGumboParser.g:2538:3: ( (lv_req_3_0= ruleSlangRequires ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==Requires) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalGumboParser.g:2539:4: (lv_req_3_0= ruleSlangRequires )
                    {
                    // InternalGumboParser.g:2539:4: (lv_req_3_0= ruleSlangRequires )
                    // InternalGumboParser.g:2540:5: lv_req_3_0= ruleSlangRequires
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangDefContractCaseAccess().getReqSlangRequiresParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_48);
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

            // InternalGumboParser.g:2557:3: ( (lv_ens_4_0= ruleSlangEnsures ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==Ensures) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalGumboParser.g:2558:4: (lv_ens_4_0= ruleSlangEnsures )
                    {
                    // InternalGumboParser.g:2558:4: (lv_ens_4_0= ruleSlangEnsures )
                    // InternalGumboParser.g:2559:5: lv_ens_4_0= ruleSlangEnsures
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
    // InternalGumboParser.g:2580:1: entryRuleSlangSupr returns [EObject current=null] : iv_ruleSlangSupr= ruleSlangSupr EOF ;
    public final EObject entryRuleSlangSupr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangSupr = null;


        try {
            // InternalGumboParser.g:2580:50: (iv_ruleSlangSupr= ruleSlangSupr EOF )
            // InternalGumboParser.g:2581:2: iv_ruleSlangSupr= ruleSlangSupr EOF
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
    // InternalGumboParser.g:2587:1: ruleSlangSupr returns [EObject current=null] : ( ( (lv_name_0_0= ruleSlangName ) ) ( (lv_args_1_0= ruleSlangTypeArgs ) )? ) ;
    public final EObject ruleSlangSupr() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_args_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2593:2: ( ( ( (lv_name_0_0= ruleSlangName ) ) ( (lv_args_1_0= ruleSlangTypeArgs ) )? ) )
            // InternalGumboParser.g:2594:2: ( ( (lv_name_0_0= ruleSlangName ) ) ( (lv_args_1_0= ruleSlangTypeArgs ) )? )
            {
            // InternalGumboParser.g:2594:2: ( ( (lv_name_0_0= ruleSlangName ) ) ( (lv_args_1_0= ruleSlangTypeArgs ) )? )
            // InternalGumboParser.g:2595:3: ( (lv_name_0_0= ruleSlangName ) ) ( (lv_args_1_0= ruleSlangTypeArgs ) )?
            {
            // InternalGumboParser.g:2595:3: ( (lv_name_0_0= ruleSlangName ) )
            // InternalGumboParser.g:2596:4: (lv_name_0_0= ruleSlangName )
            {
            // InternalGumboParser.g:2596:4: (lv_name_0_0= ruleSlangName )
            // InternalGumboParser.g:2597:5: lv_name_0_0= ruleSlangName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangSuprAccess().getNameSlangNameParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_52);
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

            // InternalGumboParser.g:2614:3: ( (lv_args_1_0= ruleSlangTypeArgs ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==LeftSquareBracket) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalGumboParser.g:2615:4: (lv_args_1_0= ruleSlangTypeArgs )
                    {
                    // InternalGumboParser.g:2615:4: (lv_args_1_0= ruleSlangTypeArgs )
                    // InternalGumboParser.g:2616:5: lv_args_1_0= ruleSlangTypeArgs
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
    // InternalGumboParser.g:2637:1: entryRuleSlangName returns [String current=null] : iv_ruleSlangName= ruleSlangName EOF ;
    public final String entryRuleSlangName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSlangName = null;


        try {
            // InternalGumboParser.g:2637:49: (iv_ruleSlangName= ruleSlangName EOF )
            // InternalGumboParser.g:2638:2: iv_ruleSlangName= ruleSlangName EOF
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
    // InternalGumboParser.g:2644:1: ruleSlangName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleSlangName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalGumboParser.g:2650:2: ( (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) )
            // InternalGumboParser.g:2651:2: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
            {
            // InternalGumboParser.g:2651:2: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
            // InternalGumboParser.g:2652:3: this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getSlangNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalGumboParser.g:2659:3: (kw= FullStop this_ID_2= RULE_ID )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==FullStop) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalGumboParser.g:2660:4: kw= FullStop this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,FullStop,FollowSets000.FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getSlangNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_53); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getSlangNameAccess().getIDTerminalRuleCall_1_1());
            	      			
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
    // $ANTLR end "ruleSlangName"


    // $ANTLR start "entryRuleSlangInvariant"
    // InternalGumboParser.g:2677:1: entryRuleSlangInvariant returns [EObject current=null] : iv_ruleSlangInvariant= ruleSlangInvariant EOF ;
    public final EObject entryRuleSlangInvariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangInvariant = null;


        try {
            // InternalGumboParser.g:2677:55: (iv_ruleSlangInvariant= ruleSlangInvariant EOF )
            // InternalGumboParser.g:2678:2: iv_ruleSlangInvariant= ruleSlangInvariant EOF
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
    // InternalGumboParser.g:2684:1: ruleSlangInvariant returns [EObject current=null] : (otherlv_0= Invariant ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* ) ;
    public final EObject ruleSlangInvariant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exprs_1_0 = null;

        EObject lv_exprs_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2690:2: ( (otherlv_0= Invariant ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* ) )
            // InternalGumboParser.g:2691:2: (otherlv_0= Invariant ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* )
            {
            // InternalGumboParser.g:2691:2: (otherlv_0= Invariant ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* )
            // InternalGumboParser.g:2692:3: otherlv_0= Invariant ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )*
            {
            otherlv_0=(Token)match(input,Invariant,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangInvariantAccess().getInvariantKeyword_0());
              		
            }
            // InternalGumboParser.g:2696:3: ( (lv_exprs_1_0= ruleExpr ) )
            // InternalGumboParser.g:2697:4: (lv_exprs_1_0= ruleExpr )
            {
            // InternalGumboParser.g:2697:4: (lv_exprs_1_0= ruleExpr )
            // InternalGumboParser.g:2698:5: lv_exprs_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangInvariantAccess().getExprsExprParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_54);
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

            // InternalGumboParser.g:2715:3: (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==Comma) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalGumboParser.g:2716:4: otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FollowSets000.FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSlangInvariantAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalGumboParser.g:2720:4: ( (lv_exprs_3_0= ruleExpr ) )
            	    // InternalGumboParser.g:2721:5: (lv_exprs_3_0= ruleExpr )
            	    {
            	    // InternalGumboParser.g:2721:5: (lv_exprs_3_0= ruleExpr )
            	    // InternalGumboParser.g:2722:6: lv_exprs_3_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSlangInvariantAccess().getExprsExprParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_54);
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
    // $ANTLR end "ruleSlangInvariant"


    // $ANTLR start "entryRuleSlangReads"
    // InternalGumboParser.g:2744:1: entryRuleSlangReads returns [EObject current=null] : iv_ruleSlangReads= ruleSlangReads EOF ;
    public final EObject entryRuleSlangReads() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangReads = null;


        try {
            // InternalGumboParser.g:2744:51: (iv_ruleSlangReads= ruleSlangReads EOF )
            // InternalGumboParser.g:2745:2: iv_ruleSlangReads= ruleSlangReads EOF
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
    // InternalGumboParser.g:2751:1: ruleSlangReads returns [EObject current=null] : (otherlv_0= Reads ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* ) ;
    public final EObject ruleSlangReads() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exprs_1_0 = null;

        EObject lv_exprs_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2757:2: ( (otherlv_0= Reads ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* ) )
            // InternalGumboParser.g:2758:2: (otherlv_0= Reads ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* )
            {
            // InternalGumboParser.g:2758:2: (otherlv_0= Reads ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* )
            // InternalGumboParser.g:2759:3: otherlv_0= Reads ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )*
            {
            otherlv_0=(Token)match(input,Reads,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangReadsAccess().getReadsKeyword_0());
              		
            }
            // InternalGumboParser.g:2763:3: ( (lv_exprs_1_0= ruleExpr ) )
            // InternalGumboParser.g:2764:4: (lv_exprs_1_0= ruleExpr )
            {
            // InternalGumboParser.g:2764:4: (lv_exprs_1_0= ruleExpr )
            // InternalGumboParser.g:2765:5: lv_exprs_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangReadsAccess().getExprsExprParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_54);
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

            // InternalGumboParser.g:2782:3: (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==Comma) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalGumboParser.g:2783:4: otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FollowSets000.FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSlangReadsAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalGumboParser.g:2787:4: ( (lv_exprs_3_0= ruleExpr ) )
            	    // InternalGumboParser.g:2788:5: (lv_exprs_3_0= ruleExpr )
            	    {
            	    // InternalGumboParser.g:2788:5: (lv_exprs_3_0= ruleExpr )
            	    // InternalGumboParser.g:2789:6: lv_exprs_3_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSlangReadsAccess().getExprsExprParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_54);
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


    // $ANTLR start "entryRuleSlangRequires"
    // InternalGumboParser.g:2811:1: entryRuleSlangRequires returns [EObject current=null] : iv_ruleSlangRequires= ruleSlangRequires EOF ;
    public final EObject entryRuleSlangRequires() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangRequires = null;


        try {
            // InternalGumboParser.g:2811:54: (iv_ruleSlangRequires= ruleSlangRequires EOF )
            // InternalGumboParser.g:2812:2: iv_ruleSlangRequires= ruleSlangRequires EOF
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
    // InternalGumboParser.g:2818:1: ruleSlangRequires returns [EObject current=null] : (otherlv_0= Requires ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* ) ;
    public final EObject ruleSlangRequires() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exprs_1_0 = null;

        EObject lv_exprs_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2824:2: ( (otherlv_0= Requires ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* ) )
            // InternalGumboParser.g:2825:2: (otherlv_0= Requires ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* )
            {
            // InternalGumboParser.g:2825:2: (otherlv_0= Requires ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* )
            // InternalGumboParser.g:2826:3: otherlv_0= Requires ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )*
            {
            otherlv_0=(Token)match(input,Requires,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangRequiresAccess().getRequiresKeyword_0());
              		
            }
            // InternalGumboParser.g:2830:3: ( (lv_exprs_1_0= ruleExpr ) )
            // InternalGumboParser.g:2831:4: (lv_exprs_1_0= ruleExpr )
            {
            // InternalGumboParser.g:2831:4: (lv_exprs_1_0= ruleExpr )
            // InternalGumboParser.g:2832:5: lv_exprs_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangRequiresAccess().getExprsExprParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_54);
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

            // InternalGumboParser.g:2849:3: (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==Comma) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalGumboParser.g:2850:4: otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FollowSets000.FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSlangRequiresAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalGumboParser.g:2854:4: ( (lv_exprs_3_0= ruleExpr ) )
            	    // InternalGumboParser.g:2855:5: (lv_exprs_3_0= ruleExpr )
            	    {
            	    // InternalGumboParser.g:2855:5: (lv_exprs_3_0= ruleExpr )
            	    // InternalGumboParser.g:2856:6: lv_exprs_3_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSlangRequiresAccess().getExprsExprParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_54);
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
    // $ANTLR end "ruleSlangRequires"


    // $ANTLR start "entryRuleSlangModifies"
    // InternalGumboParser.g:2878:1: entryRuleSlangModifies returns [EObject current=null] : iv_ruleSlangModifies= ruleSlangModifies EOF ;
    public final EObject entryRuleSlangModifies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangModifies = null;


        try {
            // InternalGumboParser.g:2878:54: (iv_ruleSlangModifies= ruleSlangModifies EOF )
            // InternalGumboParser.g:2879:2: iv_ruleSlangModifies= ruleSlangModifies EOF
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
    // InternalGumboParser.g:2885:1: ruleSlangModifies returns [EObject current=null] : (otherlv_0= Modifies ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* ) ;
    public final EObject ruleSlangModifies() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exprs_1_0 = null;

        EObject lv_exprs_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2891:2: ( (otherlv_0= Modifies ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* ) )
            // InternalGumboParser.g:2892:2: (otherlv_0= Modifies ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* )
            {
            // InternalGumboParser.g:2892:2: (otherlv_0= Modifies ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* )
            // InternalGumboParser.g:2893:3: otherlv_0= Modifies ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )*
            {
            otherlv_0=(Token)match(input,Modifies,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangModifiesAccess().getModifiesKeyword_0());
              		
            }
            // InternalGumboParser.g:2897:3: ( (lv_exprs_1_0= ruleExpr ) )
            // InternalGumboParser.g:2898:4: (lv_exprs_1_0= ruleExpr )
            {
            // InternalGumboParser.g:2898:4: (lv_exprs_1_0= ruleExpr )
            // InternalGumboParser.g:2899:5: lv_exprs_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangModifiesAccess().getExprsExprParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_54);
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

            // InternalGumboParser.g:2916:3: (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==Comma) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalGumboParser.g:2917:4: otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FollowSets000.FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSlangModifiesAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalGumboParser.g:2921:4: ( (lv_exprs_3_0= ruleExpr ) )
            	    // InternalGumboParser.g:2922:5: (lv_exprs_3_0= ruleExpr )
            	    {
            	    // InternalGumboParser.g:2922:5: (lv_exprs_3_0= ruleExpr )
            	    // InternalGumboParser.g:2923:6: lv_exprs_3_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSlangModifiesAccess().getExprsExprParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_54);
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
    // $ANTLR end "ruleSlangModifies"


    // $ANTLR start "entryRuleSlangEnsures"
    // InternalGumboParser.g:2945:1: entryRuleSlangEnsures returns [EObject current=null] : iv_ruleSlangEnsures= ruleSlangEnsures EOF ;
    public final EObject entryRuleSlangEnsures() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangEnsures = null;


        try {
            // InternalGumboParser.g:2945:53: (iv_ruleSlangEnsures= ruleSlangEnsures EOF )
            // InternalGumboParser.g:2946:2: iv_ruleSlangEnsures= ruleSlangEnsures EOF
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
    // InternalGumboParser.g:2952:1: ruleSlangEnsures returns [EObject current=null] : (otherlv_0= Ensures ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* ) ;
    public final EObject ruleSlangEnsures() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exprs_1_0 = null;

        EObject lv_exprs_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2958:2: ( (otherlv_0= Ensures ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* ) )
            // InternalGumboParser.g:2959:2: (otherlv_0= Ensures ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* )
            {
            // InternalGumboParser.g:2959:2: (otherlv_0= Ensures ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* )
            // InternalGumboParser.g:2960:3: otherlv_0= Ensures ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )*
            {
            otherlv_0=(Token)match(input,Ensures,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangEnsuresAccess().getEnsuresKeyword_0());
              		
            }
            // InternalGumboParser.g:2964:3: ( (lv_exprs_1_0= ruleExpr ) )
            // InternalGumboParser.g:2965:4: (lv_exprs_1_0= ruleExpr )
            {
            // InternalGumboParser.g:2965:4: (lv_exprs_1_0= ruleExpr )
            // InternalGumboParser.g:2966:5: lv_exprs_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangEnsuresAccess().getExprsExprParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_54);
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

            // InternalGumboParser.g:2983:3: (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==Comma) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalGumboParser.g:2984:4: otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FollowSets000.FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSlangEnsuresAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalGumboParser.g:2988:4: ( (lv_exprs_3_0= ruleExpr ) )
            	    // InternalGumboParser.g:2989:5: (lv_exprs_3_0= ruleExpr )
            	    {
            	    // InternalGumboParser.g:2989:5: (lv_exprs_3_0= ruleExpr )
            	    // InternalGumboParser.g:2990:6: lv_exprs_3_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSlangEnsuresAccess().getExprsExprParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_54);
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
            	    break loop61;
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
    // InternalGumboParser.g:3012:1: entryRuleSlangStmt returns [EObject current=null] : iv_ruleSlangStmt= ruleSlangStmt EOF ;
    public final EObject entryRuleSlangStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangStmt = null;


        try {
            // InternalGumboParser.g:3012:50: (iv_ruleSlangStmt= ruleSlangStmt EOF )
            // InternalGumboParser.g:3013:2: iv_ruleSlangStmt= ruleSlangStmt EOF
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
    // InternalGumboParser.g:3019:1: ruleSlangStmt returns [EObject current=null] : ( ( () ( (lv_d_1_0= ruleSlangVarDef ) ) ) | ( () otherlv_3= If ( (lv_cond_4_0= ruleExpr ) ) ( (lv_b_5_0= ruleSlangBlock ) ) ( (lv_e_6_0= ruleSlangElse ) )? ) | ( () otherlv_8= While ( (lv_cond_9_0= ruleExpr ) ) ( (lv_l_10_0= ruleSlangLoopContract ) ) ( (lv_b_11_0= ruleSlangBlock ) ) ) | ( () otherlv_13= Match ( (lv_testExpr_14_0= ruleExpr ) ) otherlv_15= LeftCurlyBracket ( (lv_c_16_0= ruleSlangCase ) )* otherlv_17= RightCurlyBracket ) | ( () otherlv_19= Spec ( (lv_b_20_0= ruleSlangBlock ) ) ) | ( () otherlv_22= Assume ( (lv_e_23_0= ruleExpr ) ) (this_SLANG_STRING_24= RULE_SLANG_STRING )? ) | ( () otherlv_26= Assert ( (lv_e_27_0= ruleExpr ) ) (this_SLANG_STRING_28= RULE_SLANG_STRING )? ) | ( () otherlv_30= Halt (this_SLANG_STRING_31= RULE_SLANG_STRING )? ) | ( () otherlv_33= Do ( (lv_e_34_0= ruleExpr ) ) ) | ( () ( (otherlv_36= RULE_ID ) ) (otherlv_37= Colon | ( ( (lv_l_38_0= ruleSlangLHSSuffix ) )* ( (otherlv_39= ColonEqualsSign | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleExpr ) ) )? ) ) ) ) ;
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
            // InternalGumboParser.g:3025:2: ( ( ( () ( (lv_d_1_0= ruleSlangVarDef ) ) ) | ( () otherlv_3= If ( (lv_cond_4_0= ruleExpr ) ) ( (lv_b_5_0= ruleSlangBlock ) ) ( (lv_e_6_0= ruleSlangElse ) )? ) | ( () otherlv_8= While ( (lv_cond_9_0= ruleExpr ) ) ( (lv_l_10_0= ruleSlangLoopContract ) ) ( (lv_b_11_0= ruleSlangBlock ) ) ) | ( () otherlv_13= Match ( (lv_testExpr_14_0= ruleExpr ) ) otherlv_15= LeftCurlyBracket ( (lv_c_16_0= ruleSlangCase ) )* otherlv_17= RightCurlyBracket ) | ( () otherlv_19= Spec ( (lv_b_20_0= ruleSlangBlock ) ) ) | ( () otherlv_22= Assume ( (lv_e_23_0= ruleExpr ) ) (this_SLANG_STRING_24= RULE_SLANG_STRING )? ) | ( () otherlv_26= Assert ( (lv_e_27_0= ruleExpr ) ) (this_SLANG_STRING_28= RULE_SLANG_STRING )? ) | ( () otherlv_30= Halt (this_SLANG_STRING_31= RULE_SLANG_STRING )? ) | ( () otherlv_33= Do ( (lv_e_34_0= ruleExpr ) ) ) | ( () ( (otherlv_36= RULE_ID ) ) (otherlv_37= Colon | ( ( (lv_l_38_0= ruleSlangLHSSuffix ) )* ( (otherlv_39= ColonEqualsSign | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleExpr ) ) )? ) ) ) ) )
            // InternalGumboParser.g:3026:2: ( ( () ( (lv_d_1_0= ruleSlangVarDef ) ) ) | ( () otherlv_3= If ( (lv_cond_4_0= ruleExpr ) ) ( (lv_b_5_0= ruleSlangBlock ) ) ( (lv_e_6_0= ruleSlangElse ) )? ) | ( () otherlv_8= While ( (lv_cond_9_0= ruleExpr ) ) ( (lv_l_10_0= ruleSlangLoopContract ) ) ( (lv_b_11_0= ruleSlangBlock ) ) ) | ( () otherlv_13= Match ( (lv_testExpr_14_0= ruleExpr ) ) otherlv_15= LeftCurlyBracket ( (lv_c_16_0= ruleSlangCase ) )* otherlv_17= RightCurlyBracket ) | ( () otherlv_19= Spec ( (lv_b_20_0= ruleSlangBlock ) ) ) | ( () otherlv_22= Assume ( (lv_e_23_0= ruleExpr ) ) (this_SLANG_STRING_24= RULE_SLANG_STRING )? ) | ( () otherlv_26= Assert ( (lv_e_27_0= ruleExpr ) ) (this_SLANG_STRING_28= RULE_SLANG_STRING )? ) | ( () otherlv_30= Halt (this_SLANG_STRING_31= RULE_SLANG_STRING )? ) | ( () otherlv_33= Do ( (lv_e_34_0= ruleExpr ) ) ) | ( () ( (otherlv_36= RULE_ID ) ) (otherlv_37= Colon | ( ( (lv_l_38_0= ruleSlangLHSSuffix ) )* ( (otherlv_39= ColonEqualsSign | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleExpr ) ) )? ) ) ) )
            {
            // InternalGumboParser.g:3026:2: ( ( () ( (lv_d_1_0= ruleSlangVarDef ) ) ) | ( () otherlv_3= If ( (lv_cond_4_0= ruleExpr ) ) ( (lv_b_5_0= ruleSlangBlock ) ) ( (lv_e_6_0= ruleSlangElse ) )? ) | ( () otherlv_8= While ( (lv_cond_9_0= ruleExpr ) ) ( (lv_l_10_0= ruleSlangLoopContract ) ) ( (lv_b_11_0= ruleSlangBlock ) ) ) | ( () otherlv_13= Match ( (lv_testExpr_14_0= ruleExpr ) ) otherlv_15= LeftCurlyBracket ( (lv_c_16_0= ruleSlangCase ) )* otherlv_17= RightCurlyBracket ) | ( () otherlv_19= Spec ( (lv_b_20_0= ruleSlangBlock ) ) ) | ( () otherlv_22= Assume ( (lv_e_23_0= ruleExpr ) ) (this_SLANG_STRING_24= RULE_SLANG_STRING )? ) | ( () otherlv_26= Assert ( (lv_e_27_0= ruleExpr ) ) (this_SLANG_STRING_28= RULE_SLANG_STRING )? ) | ( () otherlv_30= Halt (this_SLANG_STRING_31= RULE_SLANG_STRING )? ) | ( () otherlv_33= Do ( (lv_e_34_0= ruleExpr ) ) ) | ( () ( (otherlv_36= RULE_ID ) ) (otherlv_37= Colon | ( ( (lv_l_38_0= ruleSlangLHSSuffix ) )* ( (otherlv_39= ColonEqualsSign | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleExpr ) ) )? ) ) ) )
            int alt71=10;
            switch ( input.LA(1) ) {
            case Val:
            case Var:
                {
                alt71=1;
                }
                break;
            case If:
                {
                alt71=2;
                }
                break;
            case While:
                {
                alt71=3;
                }
                break;
            case Match:
                {
                alt71=4;
                }
                break;
            case Spec:
                {
                alt71=5;
                }
                break;
            case Assume:
                {
                alt71=6;
                }
                break;
            case Assert:
                {
                alt71=7;
                }
                break;
            case Halt:
                {
                alt71=8;
                }
                break;
            case Do:
                {
                alt71=9;
                }
                break;
            case RULE_ID:
                {
                alt71=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // InternalGumboParser.g:3027:3: ( () ( (lv_d_1_0= ruleSlangVarDef ) ) )
                    {
                    // InternalGumboParser.g:3027:3: ( () ( (lv_d_1_0= ruleSlangVarDef ) ) )
                    // InternalGumboParser.g:3028:4: () ( (lv_d_1_0= ruleSlangVarDef ) )
                    {
                    // InternalGumboParser.g:3028:4: ()
                    // InternalGumboParser.g:3029:5: 
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

                    // InternalGumboParser.g:3038:4: ( (lv_d_1_0= ruleSlangVarDef ) )
                    // InternalGumboParser.g:3039:5: (lv_d_1_0= ruleSlangVarDef )
                    {
                    // InternalGumboParser.g:3039:5: (lv_d_1_0= ruleSlangVarDef )
                    // InternalGumboParser.g:3040:6: lv_d_1_0= ruleSlangVarDef
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
                    // InternalGumboParser.g:3059:3: ( () otherlv_3= If ( (lv_cond_4_0= ruleExpr ) ) ( (lv_b_5_0= ruleSlangBlock ) ) ( (lv_e_6_0= ruleSlangElse ) )? )
                    {
                    // InternalGumboParser.g:3059:3: ( () otherlv_3= If ( (lv_cond_4_0= ruleExpr ) ) ( (lv_b_5_0= ruleSlangBlock ) ) ( (lv_e_6_0= ruleSlangElse ) )? )
                    // InternalGumboParser.g:3060:4: () otherlv_3= If ( (lv_cond_4_0= ruleExpr ) ) ( (lv_b_5_0= ruleSlangBlock ) ) ( (lv_e_6_0= ruleSlangElse ) )?
                    {
                    // InternalGumboParser.g:3060:4: ()
                    // InternalGumboParser.g:3061:5: 
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

                    otherlv_3=(Token)match(input,If,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getSlangStmtAccess().getIfKeyword_1_1());
                      			
                    }
                    // InternalGumboParser.g:3074:4: ( (lv_cond_4_0= ruleExpr ) )
                    // InternalGumboParser.g:3075:5: (lv_cond_4_0= ruleExpr )
                    {
                    // InternalGumboParser.g:3075:5: (lv_cond_4_0= ruleExpr )
                    // InternalGumboParser.g:3076:6: lv_cond_4_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangStmtAccess().getCondExprParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_55);
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

                    // InternalGumboParser.g:3093:4: ( (lv_b_5_0= ruleSlangBlock ) )
                    // InternalGumboParser.g:3094:5: (lv_b_5_0= ruleSlangBlock )
                    {
                    // InternalGumboParser.g:3094:5: (lv_b_5_0= ruleSlangBlock )
                    // InternalGumboParser.g:3095:6: lv_b_5_0= ruleSlangBlock
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangStmtAccess().getBSlangBlockParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_56);
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

                    // InternalGumboParser.g:3112:4: ( (lv_e_6_0= ruleSlangElse ) )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==Else) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // InternalGumboParser.g:3113:5: (lv_e_6_0= ruleSlangElse )
                            {
                            // InternalGumboParser.g:3113:5: (lv_e_6_0= ruleSlangElse )
                            // InternalGumboParser.g:3114:6: lv_e_6_0= ruleSlangElse
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
                    // InternalGumboParser.g:3133:3: ( () otherlv_8= While ( (lv_cond_9_0= ruleExpr ) ) ( (lv_l_10_0= ruleSlangLoopContract ) ) ( (lv_b_11_0= ruleSlangBlock ) ) )
                    {
                    // InternalGumboParser.g:3133:3: ( () otherlv_8= While ( (lv_cond_9_0= ruleExpr ) ) ( (lv_l_10_0= ruleSlangLoopContract ) ) ( (lv_b_11_0= ruleSlangBlock ) ) )
                    // InternalGumboParser.g:3134:4: () otherlv_8= While ( (lv_cond_9_0= ruleExpr ) ) ( (lv_l_10_0= ruleSlangLoopContract ) ) ( (lv_b_11_0= ruleSlangBlock ) )
                    {
                    // InternalGumboParser.g:3134:4: ()
                    // InternalGumboParser.g:3135:5: 
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

                    otherlv_8=(Token)match(input,While,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getSlangStmtAccess().getWhileKeyword_2_1());
                      			
                    }
                    // InternalGumboParser.g:3148:4: ( (lv_cond_9_0= ruleExpr ) )
                    // InternalGumboParser.g:3149:5: (lv_cond_9_0= ruleExpr )
                    {
                    // InternalGumboParser.g:3149:5: (lv_cond_9_0= ruleExpr )
                    // InternalGumboParser.g:3150:6: lv_cond_9_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangStmtAccess().getCondExprParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_57);
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

                    // InternalGumboParser.g:3167:4: ( (lv_l_10_0= ruleSlangLoopContract ) )
                    // InternalGumboParser.g:3168:5: (lv_l_10_0= ruleSlangLoopContract )
                    {
                    // InternalGumboParser.g:3168:5: (lv_l_10_0= ruleSlangLoopContract )
                    // InternalGumboParser.g:3169:6: lv_l_10_0= ruleSlangLoopContract
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangStmtAccess().getLSlangLoopContractParserRuleCall_2_3_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_55);
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

                    // InternalGumboParser.g:3186:4: ( (lv_b_11_0= ruleSlangBlock ) )
                    // InternalGumboParser.g:3187:5: (lv_b_11_0= ruleSlangBlock )
                    {
                    // InternalGumboParser.g:3187:5: (lv_b_11_0= ruleSlangBlock )
                    // InternalGumboParser.g:3188:6: lv_b_11_0= ruleSlangBlock
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
                    // InternalGumboParser.g:3207:3: ( () otherlv_13= Match ( (lv_testExpr_14_0= ruleExpr ) ) otherlv_15= LeftCurlyBracket ( (lv_c_16_0= ruleSlangCase ) )* otherlv_17= RightCurlyBracket )
                    {
                    // InternalGumboParser.g:3207:3: ( () otherlv_13= Match ( (lv_testExpr_14_0= ruleExpr ) ) otherlv_15= LeftCurlyBracket ( (lv_c_16_0= ruleSlangCase ) )* otherlv_17= RightCurlyBracket )
                    // InternalGumboParser.g:3208:4: () otherlv_13= Match ( (lv_testExpr_14_0= ruleExpr ) ) otherlv_15= LeftCurlyBracket ( (lv_c_16_0= ruleSlangCase ) )* otherlv_17= RightCurlyBracket
                    {
                    // InternalGumboParser.g:3208:4: ()
                    // InternalGumboParser.g:3209:5: 
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

                    otherlv_13=(Token)match(input,Match,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getSlangStmtAccess().getMatchKeyword_3_1());
                      			
                    }
                    // InternalGumboParser.g:3222:4: ( (lv_testExpr_14_0= ruleExpr ) )
                    // InternalGumboParser.g:3223:5: (lv_testExpr_14_0= ruleExpr )
                    {
                    // InternalGumboParser.g:3223:5: (lv_testExpr_14_0= ruleExpr )
                    // InternalGumboParser.g:3224:6: lv_testExpr_14_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangStmtAccess().getTestExprExprParserRuleCall_3_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_55);
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

                    otherlv_15=(Token)match(input,LeftCurlyBracket,FollowSets000.FOLLOW_58); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getSlangStmtAccess().getLeftCurlyBracketKeyword_3_3());
                      			
                    }
                    // InternalGumboParser.g:3245:4: ( (lv_c_16_0= ruleSlangCase ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==Case) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // InternalGumboParser.g:3246:5: (lv_c_16_0= ruleSlangCase )
                    	    {
                    	    // InternalGumboParser.g:3246:5: (lv_c_16_0= ruleSlangCase )
                    	    // InternalGumboParser.g:3247:6: lv_c_16_0= ruleSlangCase
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getSlangStmtAccess().getCSlangCaseParserRuleCall_3_4_0());
                    	      					
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_58);
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
                    	    break loop63;
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
                    // InternalGumboParser.g:3270:3: ( () otherlv_19= Spec ( (lv_b_20_0= ruleSlangBlock ) ) )
                    {
                    // InternalGumboParser.g:3270:3: ( () otherlv_19= Spec ( (lv_b_20_0= ruleSlangBlock ) ) )
                    // InternalGumboParser.g:3271:4: () otherlv_19= Spec ( (lv_b_20_0= ruleSlangBlock ) )
                    {
                    // InternalGumboParser.g:3271:4: ()
                    // InternalGumboParser.g:3272:5: 
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

                    otherlv_19=(Token)match(input,Spec,FollowSets000.FOLLOW_55); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getSlangStmtAccess().getSpecKeyword_4_1());
                      			
                    }
                    // InternalGumboParser.g:3285:4: ( (lv_b_20_0= ruleSlangBlock ) )
                    // InternalGumboParser.g:3286:5: (lv_b_20_0= ruleSlangBlock )
                    {
                    // InternalGumboParser.g:3286:5: (lv_b_20_0= ruleSlangBlock )
                    // InternalGumboParser.g:3287:6: lv_b_20_0= ruleSlangBlock
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
                    // InternalGumboParser.g:3306:3: ( () otherlv_22= Assume ( (lv_e_23_0= ruleExpr ) ) (this_SLANG_STRING_24= RULE_SLANG_STRING )? )
                    {
                    // InternalGumboParser.g:3306:3: ( () otherlv_22= Assume ( (lv_e_23_0= ruleExpr ) ) (this_SLANG_STRING_24= RULE_SLANG_STRING )? )
                    // InternalGumboParser.g:3307:4: () otherlv_22= Assume ( (lv_e_23_0= ruleExpr ) ) (this_SLANG_STRING_24= RULE_SLANG_STRING )?
                    {
                    // InternalGumboParser.g:3307:4: ()
                    // InternalGumboParser.g:3308:5: 
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

                    otherlv_22=(Token)match(input,Assume,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_22, grammarAccess.getSlangStmtAccess().getAssumeKeyword_5_1());
                      			
                    }
                    // InternalGumboParser.g:3321:4: ( (lv_e_23_0= ruleExpr ) )
                    // InternalGumboParser.g:3322:5: (lv_e_23_0= ruleExpr )
                    {
                    // InternalGumboParser.g:3322:5: (lv_e_23_0= ruleExpr )
                    // InternalGumboParser.g:3323:6: lv_e_23_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangStmtAccess().getEExprParserRuleCall_5_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_59);
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

                    // InternalGumboParser.g:3340:4: (this_SLANG_STRING_24= RULE_SLANG_STRING )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==RULE_SLANG_STRING) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // InternalGumboParser.g:3341:5: this_SLANG_STRING_24= RULE_SLANG_STRING
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
                    // InternalGumboParser.g:3348:3: ( () otherlv_26= Assert ( (lv_e_27_0= ruleExpr ) ) (this_SLANG_STRING_28= RULE_SLANG_STRING )? )
                    {
                    // InternalGumboParser.g:3348:3: ( () otherlv_26= Assert ( (lv_e_27_0= ruleExpr ) ) (this_SLANG_STRING_28= RULE_SLANG_STRING )? )
                    // InternalGumboParser.g:3349:4: () otherlv_26= Assert ( (lv_e_27_0= ruleExpr ) ) (this_SLANG_STRING_28= RULE_SLANG_STRING )?
                    {
                    // InternalGumboParser.g:3349:4: ()
                    // InternalGumboParser.g:3350:5: 
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

                    otherlv_26=(Token)match(input,Assert,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_26, grammarAccess.getSlangStmtAccess().getAssertKeyword_6_1());
                      			
                    }
                    // InternalGumboParser.g:3363:4: ( (lv_e_27_0= ruleExpr ) )
                    // InternalGumboParser.g:3364:5: (lv_e_27_0= ruleExpr )
                    {
                    // InternalGumboParser.g:3364:5: (lv_e_27_0= ruleExpr )
                    // InternalGumboParser.g:3365:6: lv_e_27_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangStmtAccess().getEExprParserRuleCall_6_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_59);
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

                    // InternalGumboParser.g:3382:4: (this_SLANG_STRING_28= RULE_SLANG_STRING )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==RULE_SLANG_STRING) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // InternalGumboParser.g:3383:5: this_SLANG_STRING_28= RULE_SLANG_STRING
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
                    // InternalGumboParser.g:3390:3: ( () otherlv_30= Halt (this_SLANG_STRING_31= RULE_SLANG_STRING )? )
                    {
                    // InternalGumboParser.g:3390:3: ( () otherlv_30= Halt (this_SLANG_STRING_31= RULE_SLANG_STRING )? )
                    // InternalGumboParser.g:3391:4: () otherlv_30= Halt (this_SLANG_STRING_31= RULE_SLANG_STRING )?
                    {
                    // InternalGumboParser.g:3391:4: ()
                    // InternalGumboParser.g:3392:5: 
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

                    otherlv_30=(Token)match(input,Halt,FollowSets000.FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_30, grammarAccess.getSlangStmtAccess().getHaltKeyword_7_1());
                      			
                    }
                    // InternalGumboParser.g:3405:4: (this_SLANG_STRING_31= RULE_SLANG_STRING )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==RULE_SLANG_STRING) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // InternalGumboParser.g:3406:5: this_SLANG_STRING_31= RULE_SLANG_STRING
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
                    // InternalGumboParser.g:3413:3: ( () otherlv_33= Do ( (lv_e_34_0= ruleExpr ) ) )
                    {
                    // InternalGumboParser.g:3413:3: ( () otherlv_33= Do ( (lv_e_34_0= ruleExpr ) ) )
                    // InternalGumboParser.g:3414:4: () otherlv_33= Do ( (lv_e_34_0= ruleExpr ) )
                    {
                    // InternalGumboParser.g:3414:4: ()
                    // InternalGumboParser.g:3415:5: 
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

                    otherlv_33=(Token)match(input,Do,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_33, grammarAccess.getSlangStmtAccess().getDoKeyword_8_1());
                      			
                    }
                    // InternalGumboParser.g:3428:4: ( (lv_e_34_0= ruleExpr ) )
                    // InternalGumboParser.g:3429:5: (lv_e_34_0= ruleExpr )
                    {
                    // InternalGumboParser.g:3429:5: (lv_e_34_0= ruleExpr )
                    // InternalGumboParser.g:3430:6: lv_e_34_0= ruleExpr
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
                    // InternalGumboParser.g:3449:3: ( () ( (otherlv_36= RULE_ID ) ) (otherlv_37= Colon | ( ( (lv_l_38_0= ruleSlangLHSSuffix ) )* ( (otherlv_39= ColonEqualsSign | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleExpr ) ) )? ) ) )
                    {
                    // InternalGumboParser.g:3449:3: ( () ( (otherlv_36= RULE_ID ) ) (otherlv_37= Colon | ( ( (lv_l_38_0= ruleSlangLHSSuffix ) )* ( (otherlv_39= ColonEqualsSign | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleExpr ) ) )? ) ) )
                    // InternalGumboParser.g:3450:4: () ( (otherlv_36= RULE_ID ) ) (otherlv_37= Colon | ( ( (lv_l_38_0= ruleSlangLHSSuffix ) )* ( (otherlv_39= ColonEqualsSign | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleExpr ) ) )? ) )
                    {
                    // InternalGumboParser.g:3450:4: ()
                    // InternalGumboParser.g:3451:5: 
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

                    // InternalGumboParser.g:3460:4: ( (otherlv_36= RULE_ID ) )
                    // InternalGumboParser.g:3461:5: (otherlv_36= RULE_ID )
                    {
                    // InternalGumboParser.g:3461:5: (otherlv_36= RULE_ID )
                    // InternalGumboParser.g:3462:6: otherlv_36= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSlangStmtRule());
                      						}
                      					
                    }
                    otherlv_36=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_60); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_36, grammarAccess.getSlangStmtAccess().getPortOrSubcomponentOrStateVarEObjectCrossReference_9_1_0());
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:3476:4: (otherlv_37= Colon | ( ( (lv_l_38_0= ruleSlangLHSSuffix ) )* ( (otherlv_39= ColonEqualsSign | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleExpr ) ) )? ) )
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==Colon) ) {
                        alt70=1;
                    }
                    else if ( (LA70_0==EOF||(LA70_0>=Assert && LA70_0<=Assume)||LA70_0==Return||LA70_0==Match||LA70_0==While||LA70_0==Case||(LA70_0>=Halt && LA70_0<=Spec)||(LA70_0>=Val && LA70_0<=Var)||LA70_0==ColonEqualsSign||(LA70_0>=Do && LA70_0<=If)||LA70_0==LeftParenthesis||LA70_0==FullStop||LA70_0==RightCurlyBracket||LA70_0==RULE_DEFOP||LA70_0==RULE_ID) ) {
                        alt70=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 70, 0, input);

                        throw nvae;
                    }
                    switch (alt70) {
                        case 1 :
                            // InternalGumboParser.g:3477:5: otherlv_37= Colon
                            {
                            otherlv_37=(Token)match(input,Colon,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_37, grammarAccess.getSlangStmtAccess().getColonKeyword_9_2_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalGumboParser.g:3482:5: ( ( (lv_l_38_0= ruleSlangLHSSuffix ) )* ( (otherlv_39= ColonEqualsSign | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleExpr ) ) )? )
                            {
                            // InternalGumboParser.g:3482:5: ( ( (lv_l_38_0= ruleSlangLHSSuffix ) )* ( (otherlv_39= ColonEqualsSign | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleExpr ) ) )? )
                            // InternalGumboParser.g:3483:6: ( (lv_l_38_0= ruleSlangLHSSuffix ) )* ( (otherlv_39= ColonEqualsSign | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleExpr ) ) )?
                            {
                            // InternalGumboParser.g:3483:6: ( (lv_l_38_0= ruleSlangLHSSuffix ) )*
                            loop67:
                            do {
                                int alt67=2;
                                int LA67_0 = input.LA(1);

                                if ( (LA67_0==LeftParenthesis||LA67_0==FullStop) ) {
                                    alt67=1;
                                }


                                switch (alt67) {
                            	case 1 :
                            	    // InternalGumboParser.g:3484:7: (lv_l_38_0= ruleSlangLHSSuffix )
                            	    {
                            	    // InternalGumboParser.g:3484:7: (lv_l_38_0= ruleSlangLHSSuffix )
                            	    // InternalGumboParser.g:3485:8: lv_l_38_0= ruleSlangLHSSuffix
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getSlangStmtAccess().getLSlangLHSSuffixParserRuleCall_9_2_1_0_0());
                            	      							
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_61);
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
                            	    break loop67;
                                }
                            } while (true);

                            // InternalGumboParser.g:3502:6: ( (otherlv_39= ColonEqualsSign | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleExpr ) ) )?
                            int alt69=2;
                            int LA69_0 = input.LA(1);

                            if ( (LA69_0==ColonEqualsSign||LA69_0==RULE_DEFOP) ) {
                                alt69=1;
                            }
                            switch (alt69) {
                                case 1 :
                                    // InternalGumboParser.g:3503:7: (otherlv_39= ColonEqualsSign | this_DEFOP_40= RULE_DEFOP ) ( (lv_e_41_0= ruleExpr ) )
                                    {
                                    // InternalGumboParser.g:3503:7: (otherlv_39= ColonEqualsSign | this_DEFOP_40= RULE_DEFOP )
                                    int alt68=2;
                                    int LA68_0 = input.LA(1);

                                    if ( (LA68_0==ColonEqualsSign) ) {
                                        alt68=1;
                                    }
                                    else if ( (LA68_0==RULE_DEFOP) ) {
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
                                            // InternalGumboParser.g:3504:8: otherlv_39= ColonEqualsSign
                                            {
                                            otherlv_39=(Token)match(input,ColonEqualsSign,FollowSets000.FOLLOW_17); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                              								newLeafNode(otherlv_39, grammarAccess.getSlangStmtAccess().getColonEqualsSignKeyword_9_2_1_1_0_0());
                                              							
                                            }

                                            }
                                            break;
                                        case 2 :
                                            // InternalGumboParser.g:3509:8: this_DEFOP_40= RULE_DEFOP
                                            {
                                            this_DEFOP_40=(Token)match(input,RULE_DEFOP,FollowSets000.FOLLOW_17); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                              								newLeafNode(this_DEFOP_40, grammarAccess.getSlangStmtAccess().getDEFOPTerminalRuleCall_9_2_1_1_0_1());
                                              							
                                            }

                                            }
                                            break;

                                    }

                                    // InternalGumboParser.g:3514:7: ( (lv_e_41_0= ruleExpr ) )
                                    // InternalGumboParser.g:3515:8: (lv_e_41_0= ruleExpr )
                                    {
                                    // InternalGumboParser.g:3515:8: (lv_e_41_0= ruleExpr )
                                    // InternalGumboParser.g:3516:9: lv_e_41_0= ruleExpr
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
    // InternalGumboParser.g:3541:1: entryRuleSlangElse returns [EObject current=null] : iv_ruleSlangElse= ruleSlangElse EOF ;
    public final EObject entryRuleSlangElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangElse = null;


        try {
            // InternalGumboParser.g:3541:50: (iv_ruleSlangElse= ruleSlangElse EOF )
            // InternalGumboParser.g:3542:2: iv_ruleSlangElse= ruleSlangElse EOF
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
    // InternalGumboParser.g:3548:1: ruleSlangElse returns [EObject current=null] : (otherlv_0= Else ( (otherlv_1= If ( (lv_cond_2_0= ruleExpr ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )? ) | this_SlangBlock_5= ruleSlangBlock ) ) ;
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
            // InternalGumboParser.g:3554:2: ( (otherlv_0= Else ( (otherlv_1= If ( (lv_cond_2_0= ruleExpr ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )? ) | this_SlangBlock_5= ruleSlangBlock ) ) )
            // InternalGumboParser.g:3555:2: (otherlv_0= Else ( (otherlv_1= If ( (lv_cond_2_0= ruleExpr ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )? ) | this_SlangBlock_5= ruleSlangBlock ) )
            {
            // InternalGumboParser.g:3555:2: (otherlv_0= Else ( (otherlv_1= If ( (lv_cond_2_0= ruleExpr ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )? ) | this_SlangBlock_5= ruleSlangBlock ) )
            // InternalGumboParser.g:3556:3: otherlv_0= Else ( (otherlv_1= If ( (lv_cond_2_0= ruleExpr ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )? ) | this_SlangBlock_5= ruleSlangBlock )
            {
            otherlv_0=(Token)match(input,Else,FollowSets000.FOLLOW_62); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangElseAccess().getElseKeyword_0());
              		
            }
            // InternalGumboParser.g:3560:3: ( (otherlv_1= If ( (lv_cond_2_0= ruleExpr ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )? ) | this_SlangBlock_5= ruleSlangBlock )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==If) ) {
                alt73=1;
            }
            else if ( (LA73_0==LeftCurlyBracket) ) {
                alt73=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // InternalGumboParser.g:3561:4: (otherlv_1= If ( (lv_cond_2_0= ruleExpr ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )? )
                    {
                    // InternalGumboParser.g:3561:4: (otherlv_1= If ( (lv_cond_2_0= ruleExpr ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )? )
                    // InternalGumboParser.g:3562:5: otherlv_1= If ( (lv_cond_2_0= ruleExpr ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )?
                    {
                    otherlv_1=(Token)match(input,If,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getSlangElseAccess().getIfKeyword_1_0_0());
                      				
                    }
                    // InternalGumboParser.g:3566:5: ( (lv_cond_2_0= ruleExpr ) )
                    // InternalGumboParser.g:3567:6: (lv_cond_2_0= ruleExpr )
                    {
                    // InternalGumboParser.g:3567:6: (lv_cond_2_0= ruleExpr )
                    // InternalGumboParser.g:3568:7: lv_cond_2_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSlangElseAccess().getCondExprParserRuleCall_1_0_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_55);
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

                    // InternalGumboParser.g:3585:5: ( (lv_b_3_0= ruleSlangBlock ) )
                    // InternalGumboParser.g:3586:6: (lv_b_3_0= ruleSlangBlock )
                    {
                    // InternalGumboParser.g:3586:6: (lv_b_3_0= ruleSlangBlock )
                    // InternalGumboParser.g:3587:7: lv_b_3_0= ruleSlangBlock
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSlangElseAccess().getBSlangBlockParserRuleCall_1_0_2_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_56);
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

                    // InternalGumboParser.g:3604:5: ( (lv_e_4_0= ruleSlangElse ) )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==Else) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // InternalGumboParser.g:3605:6: (lv_e_4_0= ruleSlangElse )
                            {
                            // InternalGumboParser.g:3605:6: (lv_e_4_0= ruleSlangElse )
                            // InternalGumboParser.g:3606:7: lv_e_4_0= ruleSlangElse
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
                    // InternalGumboParser.g:3625:4: this_SlangBlock_5= ruleSlangBlock
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
    // InternalGumboParser.g:3641:1: entryRuleSlangLoopContract returns [EObject current=null] : iv_ruleSlangLoopContract= ruleSlangLoopContract EOF ;
    public final EObject entryRuleSlangLoopContract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangLoopContract = null;


        try {
            // InternalGumboParser.g:3641:58: (iv_ruleSlangLoopContract= ruleSlangLoopContract EOF )
            // InternalGumboParser.g:3642:2: iv_ruleSlangLoopContract= ruleSlangLoopContract EOF
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
    // InternalGumboParser.g:3648:1: ruleSlangLoopContract returns [EObject current=null] : ( () ( (lv_inv_1_0= ruleSlangInvariant ) )? ( (lv_mod_2_0= ruleSlangModifies ) )? ) ;
    public final EObject ruleSlangLoopContract() throws RecognitionException {
        EObject current = null;

        EObject lv_inv_1_0 = null;

        EObject lv_mod_2_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:3654:2: ( ( () ( (lv_inv_1_0= ruleSlangInvariant ) )? ( (lv_mod_2_0= ruleSlangModifies ) )? ) )
            // InternalGumboParser.g:3655:2: ( () ( (lv_inv_1_0= ruleSlangInvariant ) )? ( (lv_mod_2_0= ruleSlangModifies ) )? )
            {
            // InternalGumboParser.g:3655:2: ( () ( (lv_inv_1_0= ruleSlangInvariant ) )? ( (lv_mod_2_0= ruleSlangModifies ) )? )
            // InternalGumboParser.g:3656:3: () ( (lv_inv_1_0= ruleSlangInvariant ) )? ( (lv_mod_2_0= ruleSlangModifies ) )?
            {
            // InternalGumboParser.g:3656:3: ()
            // InternalGumboParser.g:3657:4: 
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

            // InternalGumboParser.g:3666:3: ( (lv_inv_1_0= ruleSlangInvariant ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==Invariant) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalGumboParser.g:3667:4: (lv_inv_1_0= ruleSlangInvariant )
                    {
                    // InternalGumboParser.g:3667:4: (lv_inv_1_0= ruleSlangInvariant )
                    // InternalGumboParser.g:3668:5: lv_inv_1_0= ruleSlangInvariant
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangLoopContractAccess().getInvSlangInvariantParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_49);
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

            // InternalGumboParser.g:3685:3: ( (lv_mod_2_0= ruleSlangModifies ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==Modifies) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalGumboParser.g:3686:4: (lv_mod_2_0= ruleSlangModifies )
                    {
                    // InternalGumboParser.g:3686:4: (lv_mod_2_0= ruleSlangModifies )
                    // InternalGumboParser.g:3687:5: lv_mod_2_0= ruleSlangModifies
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
    // InternalGumboParser.g:3708:1: entryRuleSlangLHSSuffix returns [EObject current=null] : iv_ruleSlangLHSSuffix= ruleSlangLHSSuffix EOF ;
    public final EObject entryRuleSlangLHSSuffix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangLHSSuffix = null;


        try {
            // InternalGumboParser.g:3708:55: (iv_ruleSlangLHSSuffix= ruleSlangLHSSuffix EOF )
            // InternalGumboParser.g:3709:2: iv_ruleSlangLHSSuffix= ruleSlangLHSSuffix EOF
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
    // InternalGumboParser.g:3715:1: ruleSlangLHSSuffix returns [EObject current=null] : ( ( () otherlv_1= FullStop this_ID_2= RULE_ID ) | ( () otherlv_4= LeftParenthesis ( ( (lv_exprs_5_0= ruleExpr ) ) (otherlv_6= Comma ( (lv_exprs_7_0= ruleExpr ) ) )* )? otherlv_8= RightParenthesis ) ) ;
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
            // InternalGumboParser.g:3721:2: ( ( ( () otherlv_1= FullStop this_ID_2= RULE_ID ) | ( () otherlv_4= LeftParenthesis ( ( (lv_exprs_5_0= ruleExpr ) ) (otherlv_6= Comma ( (lv_exprs_7_0= ruleExpr ) ) )* )? otherlv_8= RightParenthesis ) ) )
            // InternalGumboParser.g:3722:2: ( ( () otherlv_1= FullStop this_ID_2= RULE_ID ) | ( () otherlv_4= LeftParenthesis ( ( (lv_exprs_5_0= ruleExpr ) ) (otherlv_6= Comma ( (lv_exprs_7_0= ruleExpr ) ) )* )? otherlv_8= RightParenthesis ) )
            {
            // InternalGumboParser.g:3722:2: ( ( () otherlv_1= FullStop this_ID_2= RULE_ID ) | ( () otherlv_4= LeftParenthesis ( ( (lv_exprs_5_0= ruleExpr ) ) (otherlv_6= Comma ( (lv_exprs_7_0= ruleExpr ) ) )* )? otherlv_8= RightParenthesis ) )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==FullStop) ) {
                alt78=1;
            }
            else if ( (LA78_0==LeftParenthesis) ) {
                alt78=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // InternalGumboParser.g:3723:3: ( () otherlv_1= FullStop this_ID_2= RULE_ID )
                    {
                    // InternalGumboParser.g:3723:3: ( () otherlv_1= FullStop this_ID_2= RULE_ID )
                    // InternalGumboParser.g:3724:4: () otherlv_1= FullStop this_ID_2= RULE_ID
                    {
                    // InternalGumboParser.g:3724:4: ()
                    // InternalGumboParser.g:3725:5: 
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

                    otherlv_1=(Token)match(input,FullStop,FollowSets000.FOLLOW_10); if (state.failed) return current;
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
                    // InternalGumboParser.g:3744:3: ( () otherlv_4= LeftParenthesis ( ( (lv_exprs_5_0= ruleExpr ) ) (otherlv_6= Comma ( (lv_exprs_7_0= ruleExpr ) ) )* )? otherlv_8= RightParenthesis )
                    {
                    // InternalGumboParser.g:3744:3: ( () otherlv_4= LeftParenthesis ( ( (lv_exprs_5_0= ruleExpr ) ) (otherlv_6= Comma ( (lv_exprs_7_0= ruleExpr ) ) )* )? otherlv_8= RightParenthesis )
                    // InternalGumboParser.g:3745:4: () otherlv_4= LeftParenthesis ( ( (lv_exprs_5_0= ruleExpr ) ) (otherlv_6= Comma ( (lv_exprs_7_0= ruleExpr ) ) )* )? otherlv_8= RightParenthesis
                    {
                    // InternalGumboParser.g:3745:4: ()
                    // InternalGumboParser.g:3746:5: 
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

                    otherlv_4=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_63); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getSlangLHSSuffixAccess().getLeftParenthesisKeyword_1_1());
                      			
                    }
                    // InternalGumboParser.g:3759:4: ( ( (lv_exprs_5_0= ruleExpr ) ) (otherlv_6= Comma ( (lv_exprs_7_0= ruleExpr ) ) )* )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==MustSend||LA77_0==MaySend||LA77_0==Some||LA77_0==All||LA77_0==For||LA77_0==In_1||LA77_0==LeftParenthesis||(LA77_0>=Asterisk && LA77_0<=PlusSign)||LA77_0==HyphenMinus||(LA77_0>=F && LA77_0<=T)||LA77_0==LeftCurlyBracket||(LA77_0>=ForAll && LA77_0<=ThereExists)||(LA77_0>=RULE_SLANG_STRING && LA77_0<=RULE_MSTRING)||LA77_0==RULE_MSP||(LA77_0>=RULE_SLI && LA77_0<=RULE_MSPB)||LA77_0==RULE_OP||(LA77_0>=RULE_HEX && LA77_0<=RULE_REAL_IDF)||LA77_0==RULE_ID) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // InternalGumboParser.g:3760:5: ( (lv_exprs_5_0= ruleExpr ) ) (otherlv_6= Comma ( (lv_exprs_7_0= ruleExpr ) ) )*
                            {
                            // InternalGumboParser.g:3760:5: ( (lv_exprs_5_0= ruleExpr ) )
                            // InternalGumboParser.g:3761:6: (lv_exprs_5_0= ruleExpr )
                            {
                            // InternalGumboParser.g:3761:6: (lv_exprs_5_0= ruleExpr )
                            // InternalGumboParser.g:3762:7: lv_exprs_5_0= ruleExpr
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSlangLHSSuffixAccess().getExprsExprParserRuleCall_1_2_0_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_40);
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

                            // InternalGumboParser.g:3779:5: (otherlv_6= Comma ( (lv_exprs_7_0= ruleExpr ) ) )*
                            loop76:
                            do {
                                int alt76=2;
                                int LA76_0 = input.LA(1);

                                if ( (LA76_0==Comma) ) {
                                    alt76=1;
                                }


                                switch (alt76) {
                            	case 1 :
                            	    // InternalGumboParser.g:3780:6: otherlv_6= Comma ( (lv_exprs_7_0= ruleExpr ) )
                            	    {
                            	    otherlv_6=(Token)match(input,Comma,FollowSets000.FOLLOW_17); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_6, grammarAccess.getSlangLHSSuffixAccess().getCommaKeyword_1_2_1_0());
                            	      					
                            	    }
                            	    // InternalGumboParser.g:3784:6: ( (lv_exprs_7_0= ruleExpr ) )
                            	    // InternalGumboParser.g:3785:7: (lv_exprs_7_0= ruleExpr )
                            	    {
                            	    // InternalGumboParser.g:3785:7: (lv_exprs_7_0= ruleExpr )
                            	    // InternalGumboParser.g:3786:8: lv_exprs_7_0= ruleExpr
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getSlangLHSSuffixAccess().getExprsExprParserRuleCall_1_2_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_40);
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
                            	    break loop76;
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
    // InternalGumboParser.g:3814:1: entryRuleSlangCase returns [EObject current=null] : iv_ruleSlangCase= ruleSlangCase EOF ;
    public final EObject entryRuleSlangCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangCase = null;


        try {
            // InternalGumboParser.g:3814:50: (iv_ruleSlangCase= ruleSlangCase EOF )
            // InternalGumboParser.g:3815:2: iv_ruleSlangCase= ruleSlangCase EOF
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
    // InternalGumboParser.g:3821:1: ruleSlangCase returns [EObject current=null] : (otherlv_0= Case ( (lv_pattern_1_0= ruleSlangPattern ) ) (otherlv_2= If ( (lv_e_3_0= ruleExpr ) ) )? otherlv_4= EqualsSignGreaterThanSign ( (lv_s_5_0= ruleSlangStmt ) )* ) ;
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
            // InternalGumboParser.g:3827:2: ( (otherlv_0= Case ( (lv_pattern_1_0= ruleSlangPattern ) ) (otherlv_2= If ( (lv_e_3_0= ruleExpr ) ) )? otherlv_4= EqualsSignGreaterThanSign ( (lv_s_5_0= ruleSlangStmt ) )* ) )
            // InternalGumboParser.g:3828:2: (otherlv_0= Case ( (lv_pattern_1_0= ruleSlangPattern ) ) (otherlv_2= If ( (lv_e_3_0= ruleExpr ) ) )? otherlv_4= EqualsSignGreaterThanSign ( (lv_s_5_0= ruleSlangStmt ) )* )
            {
            // InternalGumboParser.g:3828:2: (otherlv_0= Case ( (lv_pattern_1_0= ruleSlangPattern ) ) (otherlv_2= If ( (lv_e_3_0= ruleExpr ) ) )? otherlv_4= EqualsSignGreaterThanSign ( (lv_s_5_0= ruleSlangStmt ) )* )
            // InternalGumboParser.g:3829:3: otherlv_0= Case ( (lv_pattern_1_0= ruleSlangPattern ) ) (otherlv_2= If ( (lv_e_3_0= ruleExpr ) ) )? otherlv_4= EqualsSignGreaterThanSign ( (lv_s_5_0= ruleSlangStmt ) )*
            {
            otherlv_0=(Token)match(input,Case,FollowSets000.FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangCaseAccess().getCaseKeyword_0());
              		
            }
            // InternalGumboParser.g:3833:3: ( (lv_pattern_1_0= ruleSlangPattern ) )
            // InternalGumboParser.g:3834:4: (lv_pattern_1_0= ruleSlangPattern )
            {
            // InternalGumboParser.g:3834:4: (lv_pattern_1_0= ruleSlangPattern )
            // InternalGumboParser.g:3835:5: lv_pattern_1_0= ruleSlangPattern
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangCaseAccess().getPatternSlangPatternParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_65);
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

            // InternalGumboParser.g:3852:3: (otherlv_2= If ( (lv_e_3_0= ruleExpr ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==If) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalGumboParser.g:3853:4: otherlv_2= If ( (lv_e_3_0= ruleExpr ) )
                    {
                    otherlv_2=(Token)match(input,If,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSlangCaseAccess().getIfKeyword_2_0());
                      			
                    }
                    // InternalGumboParser.g:3857:4: ( (lv_e_3_0= ruleExpr ) )
                    // InternalGumboParser.g:3858:5: (lv_e_3_0= ruleExpr )
                    {
                    // InternalGumboParser.g:3858:5: (lv_e_3_0= ruleExpr )
                    // InternalGumboParser.g:3859:6: lv_e_3_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangCaseAccess().getEExprParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_66);
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

            otherlv_4=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_67); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getSlangCaseAccess().getEqualsSignGreaterThanSignKeyword_3());
              		
            }
            // InternalGumboParser.g:3881:3: ( (lv_s_5_0= ruleSlangStmt ) )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( ((LA80_0>=Assert && LA80_0<=Assume)||LA80_0==Match||LA80_0==While||(LA80_0>=Halt && LA80_0<=Spec)||(LA80_0>=Val && LA80_0<=Var)||(LA80_0>=Do && LA80_0<=If)||LA80_0==RULE_ID) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // InternalGumboParser.g:3882:4: (lv_s_5_0= ruleSlangStmt )
            	    {
            	    // InternalGumboParser.g:3882:4: (lv_s_5_0= ruleSlangStmt )
            	    // InternalGumboParser.g:3883:5: lv_s_5_0= ruleSlangStmt
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSlangCaseAccess().getSSlangStmtParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_67);
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
            	    break loop80;
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
    // InternalGumboParser.g:3904:1: entryRuleSlangPattern returns [EObject current=null] : iv_ruleSlangPattern= ruleSlangPattern EOF ;
    public final EObject entryRuleSlangPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangPattern = null;


        try {
            // InternalGumboParser.g:3904:53: (iv_ruleSlangPattern= ruleSlangPattern EOF )
            // InternalGumboParser.g:3905:2: iv_ruleSlangPattern= ruleSlangPattern EOF
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
    // InternalGumboParser.g:3911:1: ruleSlangPattern returns [EObject current=null] : ( ( () this_ID_1= RULE_ID (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis )? ) | (otherlv_7= LeftParenthesis ( (lv_patterns_8_0= ruleSlangTPattern ) ) (otherlv_9= Comma ( (lv_patterns_10_0= ruleSlangTPattern ) ) )* otherlv_11= RightParenthesis ) ) ;
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
            // InternalGumboParser.g:3917:2: ( ( ( () this_ID_1= RULE_ID (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis )? ) | (otherlv_7= LeftParenthesis ( (lv_patterns_8_0= ruleSlangTPattern ) ) (otherlv_9= Comma ( (lv_patterns_10_0= ruleSlangTPattern ) ) )* otherlv_11= RightParenthesis ) ) )
            // InternalGumboParser.g:3918:2: ( ( () this_ID_1= RULE_ID (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis )? ) | (otherlv_7= LeftParenthesis ( (lv_patterns_8_0= ruleSlangTPattern ) ) (otherlv_9= Comma ( (lv_patterns_10_0= ruleSlangTPattern ) ) )* otherlv_11= RightParenthesis ) )
            {
            // InternalGumboParser.g:3918:2: ( ( () this_ID_1= RULE_ID (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis )? ) | (otherlv_7= LeftParenthesis ( (lv_patterns_8_0= ruleSlangTPattern ) ) (otherlv_9= Comma ( (lv_patterns_10_0= ruleSlangTPattern ) ) )* otherlv_11= RightParenthesis ) )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RULE_ID) ) {
                alt84=1;
            }
            else if ( (LA84_0==LeftParenthesis) ) {
                alt84=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // InternalGumboParser.g:3919:3: ( () this_ID_1= RULE_ID (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis )? )
                    {
                    // InternalGumboParser.g:3919:3: ( () this_ID_1= RULE_ID (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis )? )
                    // InternalGumboParser.g:3920:4: () this_ID_1= RULE_ID (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis )?
                    {
                    // InternalGumboParser.g:3920:4: ()
                    // InternalGumboParser.g:3921:5: 
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

                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_68); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_1, grammarAccess.getSlangPatternAccess().getIDTerminalRuleCall_0_1());
                      			
                    }
                    // InternalGumboParser.g:3934:4: (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==LeftParenthesis) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // InternalGumboParser.g:3935:5: otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis
                            {
                            otherlv_2=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_69); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getSlangPatternAccess().getLeftParenthesisKeyword_0_2_0());
                              				
                            }
                            // InternalGumboParser.g:3939:5: ( (lv_patterns_3_0= ruleSlangTPattern ) )
                            // InternalGumboParser.g:3940:6: (lv_patterns_3_0= ruleSlangTPattern )
                            {
                            // InternalGumboParser.g:3940:6: (lv_patterns_3_0= ruleSlangTPattern )
                            // InternalGumboParser.g:3941:7: lv_patterns_3_0= ruleSlangTPattern
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSlangPatternAccess().getPatternsSlangTPatternParserRuleCall_0_2_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_40);
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

                            // InternalGumboParser.g:3958:5: (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )*
                            loop81:
                            do {
                                int alt81=2;
                                int LA81_0 = input.LA(1);

                                if ( (LA81_0==Comma) ) {
                                    alt81=1;
                                }


                                switch (alt81) {
                            	case 1 :
                            	    // InternalGumboParser.g:3959:6: otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) )
                            	    {
                            	    otherlv_4=(Token)match(input,Comma,FollowSets000.FOLLOW_69); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_4, grammarAccess.getSlangPatternAccess().getCommaKeyword_0_2_2_0());
                            	      					
                            	    }
                            	    // InternalGumboParser.g:3963:6: ( (lv_patterns_5_0= ruleSlangTPattern ) )
                            	    // InternalGumboParser.g:3964:7: (lv_patterns_5_0= ruleSlangTPattern )
                            	    {
                            	    // InternalGumboParser.g:3964:7: (lv_patterns_5_0= ruleSlangTPattern )
                            	    // InternalGumboParser.g:3965:8: lv_patterns_5_0= ruleSlangTPattern
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getSlangPatternAccess().getPatternsSlangTPatternParserRuleCall_0_2_2_1_0());
                            	      							
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_40);
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
                            	    break loop81;
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
                    // InternalGumboParser.g:3990:3: (otherlv_7= LeftParenthesis ( (lv_patterns_8_0= ruleSlangTPattern ) ) (otherlv_9= Comma ( (lv_patterns_10_0= ruleSlangTPattern ) ) )* otherlv_11= RightParenthesis )
                    {
                    // InternalGumboParser.g:3990:3: (otherlv_7= LeftParenthesis ( (lv_patterns_8_0= ruleSlangTPattern ) ) (otherlv_9= Comma ( (lv_patterns_10_0= ruleSlangTPattern ) ) )* otherlv_11= RightParenthesis )
                    // InternalGumboParser.g:3991:4: otherlv_7= LeftParenthesis ( (lv_patterns_8_0= ruleSlangTPattern ) ) (otherlv_9= Comma ( (lv_patterns_10_0= ruleSlangTPattern ) ) )* otherlv_11= RightParenthesis
                    {
                    otherlv_7=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_69); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getSlangPatternAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalGumboParser.g:3995:4: ( (lv_patterns_8_0= ruleSlangTPattern ) )
                    // InternalGumboParser.g:3996:5: (lv_patterns_8_0= ruleSlangTPattern )
                    {
                    // InternalGumboParser.g:3996:5: (lv_patterns_8_0= ruleSlangTPattern )
                    // InternalGumboParser.g:3997:6: lv_patterns_8_0= ruleSlangTPattern
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangPatternAccess().getPatternsSlangTPatternParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_40);
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

                    // InternalGumboParser.g:4014:4: (otherlv_9= Comma ( (lv_patterns_10_0= ruleSlangTPattern ) ) )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==Comma) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // InternalGumboParser.g:4015:5: otherlv_9= Comma ( (lv_patterns_10_0= ruleSlangTPattern ) )
                    	    {
                    	    otherlv_9=(Token)match(input,Comma,FollowSets000.FOLLOW_69); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_9, grammarAccess.getSlangPatternAccess().getCommaKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:4019:5: ( (lv_patterns_10_0= ruleSlangTPattern ) )
                    	    // InternalGumboParser.g:4020:6: (lv_patterns_10_0= ruleSlangTPattern )
                    	    {
                    	    // InternalGumboParser.g:4020:6: (lv_patterns_10_0= ruleSlangTPattern )
                    	    // InternalGumboParser.g:4021:7: lv_patterns_10_0= ruleSlangTPattern
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSlangPatternAccess().getPatternsSlangTPatternParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_40);
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
                    	    break loop83;
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
    // InternalGumboParser.g:4048:1: entryRuleSlangTPattern returns [EObject current=null] : iv_ruleSlangTPattern= ruleSlangTPattern EOF ;
    public final EObject entryRuleSlangTPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangTPattern = null;


        try {
            // InternalGumboParser.g:4048:54: (iv_ruleSlangTPattern= ruleSlangTPattern EOF )
            // InternalGumboParser.g:4049:2: iv_ruleSlangTPattern= ruleSlangTPattern EOF
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
    // InternalGumboParser.g:4055:1: ruleSlangTPattern returns [EObject current=null] : ( ( () this_ID_1= RULE_ID ( (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis ) | (otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) ) ) )? ) | (otherlv_9= LeftParenthesis ( (lv_patterns_10_0= ruleSlangTPattern ) ) (otherlv_11= Comma ( (lv_patterns_12_0= ruleSlangTPattern ) ) )* otherlv_13= RightParenthesis ) | ( () otherlv_15= KW__ (otherlv_16= Colon ( (lv_type_17_0= ruleSlangType ) ) )? ) ) ;
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
            // InternalGumboParser.g:4061:2: ( ( ( () this_ID_1= RULE_ID ( (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis ) | (otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) ) ) )? ) | (otherlv_9= LeftParenthesis ( (lv_patterns_10_0= ruleSlangTPattern ) ) (otherlv_11= Comma ( (lv_patterns_12_0= ruleSlangTPattern ) ) )* otherlv_13= RightParenthesis ) | ( () otherlv_15= KW__ (otherlv_16= Colon ( (lv_type_17_0= ruleSlangType ) ) )? ) ) )
            // InternalGumboParser.g:4062:2: ( ( () this_ID_1= RULE_ID ( (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis ) | (otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) ) ) )? ) | (otherlv_9= LeftParenthesis ( (lv_patterns_10_0= ruleSlangTPattern ) ) (otherlv_11= Comma ( (lv_patterns_12_0= ruleSlangTPattern ) ) )* otherlv_13= RightParenthesis ) | ( () otherlv_15= KW__ (otherlv_16= Colon ( (lv_type_17_0= ruleSlangType ) ) )? ) )
            {
            // InternalGumboParser.g:4062:2: ( ( () this_ID_1= RULE_ID ( (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis ) | (otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) ) ) )? ) | (otherlv_9= LeftParenthesis ( (lv_patterns_10_0= ruleSlangTPattern ) ) (otherlv_11= Comma ( (lv_patterns_12_0= ruleSlangTPattern ) ) )* otherlv_13= RightParenthesis ) | ( () otherlv_15= KW__ (otherlv_16= Colon ( (lv_type_17_0= ruleSlangType ) ) )? ) )
            int alt89=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt89=1;
                }
                break;
            case LeftParenthesis:
                {
                alt89=2;
                }
                break;
            case KW__:
                {
                alt89=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // InternalGumboParser.g:4063:3: ( () this_ID_1= RULE_ID ( (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis ) | (otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) ) ) )? )
                    {
                    // InternalGumboParser.g:4063:3: ( () this_ID_1= RULE_ID ( (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis ) | (otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) ) ) )? )
                    // InternalGumboParser.g:4064:4: () this_ID_1= RULE_ID ( (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis ) | (otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) ) ) )?
                    {
                    // InternalGumboParser.g:4064:4: ()
                    // InternalGumboParser.g:4065:5: 
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

                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_70); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_1, grammarAccess.getSlangTPatternAccess().getIDTerminalRuleCall_0_1());
                      			
                    }
                    // InternalGumboParser.g:4078:4: ( (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis ) | (otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) ) ) )?
                    int alt86=3;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==LeftParenthesis) ) {
                        alt86=1;
                    }
                    else if ( (LA86_0==Colon) ) {
                        alt86=2;
                    }
                    switch (alt86) {
                        case 1 :
                            // InternalGumboParser.g:4079:5: (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis )
                            {
                            // InternalGumboParser.g:4079:5: (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis )
                            // InternalGumboParser.g:4080:6: otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis
                            {
                            otherlv_2=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_69); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_2, grammarAccess.getSlangTPatternAccess().getLeftParenthesisKeyword_0_2_0_0());
                              					
                            }
                            // InternalGumboParser.g:4084:6: ( (lv_patterns_3_0= ruleSlangTPattern ) )
                            // InternalGumboParser.g:4085:7: (lv_patterns_3_0= ruleSlangTPattern )
                            {
                            // InternalGumboParser.g:4085:7: (lv_patterns_3_0= ruleSlangTPattern )
                            // InternalGumboParser.g:4086:8: lv_patterns_3_0= ruleSlangTPattern
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getSlangTPatternAccess().getPatternsSlangTPatternParserRuleCall_0_2_0_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_40);
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

                            // InternalGumboParser.g:4103:6: (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )*
                            loop85:
                            do {
                                int alt85=2;
                                int LA85_0 = input.LA(1);

                                if ( (LA85_0==Comma) ) {
                                    alt85=1;
                                }


                                switch (alt85) {
                            	case 1 :
                            	    // InternalGumboParser.g:4104:7: otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) )
                            	    {
                            	    otherlv_4=(Token)match(input,Comma,FollowSets000.FOLLOW_69); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_4, grammarAccess.getSlangTPatternAccess().getCommaKeyword_0_2_0_2_0());
                            	      						
                            	    }
                            	    // InternalGumboParser.g:4108:7: ( (lv_patterns_5_0= ruleSlangTPattern ) )
                            	    // InternalGumboParser.g:4109:8: (lv_patterns_5_0= ruleSlangTPattern )
                            	    {
                            	    // InternalGumboParser.g:4109:8: (lv_patterns_5_0= ruleSlangTPattern )
                            	    // InternalGumboParser.g:4110:9: lv_patterns_5_0= ruleSlangTPattern
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getSlangTPatternAccess().getPatternsSlangTPatternParserRuleCall_0_2_0_2_1_0());
                            	      								
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_40);
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
                            	    break loop85;
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
                            // InternalGumboParser.g:4134:5: (otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) ) )
                            {
                            // InternalGumboParser.g:4134:5: (otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) ) )
                            // InternalGumboParser.g:4135:6: otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) )
                            {
                            otherlv_7=(Token)match(input,Colon,FollowSets000.FOLLOW_10); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_7, grammarAccess.getSlangTPatternAccess().getColonKeyword_0_2_1_0());
                              					
                            }
                            // InternalGumboParser.g:4139:6: ( (lv_type_8_0= ruleSlangType ) )
                            // InternalGumboParser.g:4140:7: (lv_type_8_0= ruleSlangType )
                            {
                            // InternalGumboParser.g:4140:7: (lv_type_8_0= ruleSlangType )
                            // InternalGumboParser.g:4141:8: lv_type_8_0= ruleSlangType
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
                    // InternalGumboParser.g:4162:3: (otherlv_9= LeftParenthesis ( (lv_patterns_10_0= ruleSlangTPattern ) ) (otherlv_11= Comma ( (lv_patterns_12_0= ruleSlangTPattern ) ) )* otherlv_13= RightParenthesis )
                    {
                    // InternalGumboParser.g:4162:3: (otherlv_9= LeftParenthesis ( (lv_patterns_10_0= ruleSlangTPattern ) ) (otherlv_11= Comma ( (lv_patterns_12_0= ruleSlangTPattern ) ) )* otherlv_13= RightParenthesis )
                    // InternalGumboParser.g:4163:4: otherlv_9= LeftParenthesis ( (lv_patterns_10_0= ruleSlangTPattern ) ) (otherlv_11= Comma ( (lv_patterns_12_0= ruleSlangTPattern ) ) )* otherlv_13= RightParenthesis
                    {
                    otherlv_9=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_69); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getSlangTPatternAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalGumboParser.g:4167:4: ( (lv_patterns_10_0= ruleSlangTPattern ) )
                    // InternalGumboParser.g:4168:5: (lv_patterns_10_0= ruleSlangTPattern )
                    {
                    // InternalGumboParser.g:4168:5: (lv_patterns_10_0= ruleSlangTPattern )
                    // InternalGumboParser.g:4169:6: lv_patterns_10_0= ruleSlangTPattern
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangTPatternAccess().getPatternsSlangTPatternParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_40);
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

                    // InternalGumboParser.g:4186:4: (otherlv_11= Comma ( (lv_patterns_12_0= ruleSlangTPattern ) ) )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==Comma) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // InternalGumboParser.g:4187:5: otherlv_11= Comma ( (lv_patterns_12_0= ruleSlangTPattern ) )
                    	    {
                    	    otherlv_11=(Token)match(input,Comma,FollowSets000.FOLLOW_69); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_11, grammarAccess.getSlangTPatternAccess().getCommaKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:4191:5: ( (lv_patterns_12_0= ruleSlangTPattern ) )
                    	    // InternalGumboParser.g:4192:6: (lv_patterns_12_0= ruleSlangTPattern )
                    	    {
                    	    // InternalGumboParser.g:4192:6: (lv_patterns_12_0= ruleSlangTPattern )
                    	    // InternalGumboParser.g:4193:7: lv_patterns_12_0= ruleSlangTPattern
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSlangTPatternAccess().getPatternsSlangTPatternParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_40);
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
                    	    break loop87;
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
                    // InternalGumboParser.g:4217:3: ( () otherlv_15= KW__ (otherlv_16= Colon ( (lv_type_17_0= ruleSlangType ) ) )? )
                    {
                    // InternalGumboParser.g:4217:3: ( () otherlv_15= KW__ (otherlv_16= Colon ( (lv_type_17_0= ruleSlangType ) ) )? )
                    // InternalGumboParser.g:4218:4: () otherlv_15= KW__ (otherlv_16= Colon ( (lv_type_17_0= ruleSlangType ) ) )?
                    {
                    // InternalGumboParser.g:4218:4: ()
                    // InternalGumboParser.g:4219:5: 
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

                    otherlv_15=(Token)match(input,KW__,FollowSets000.FOLLOW_71); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getSlangTPatternAccess().get_Keyword_2_1());
                      			
                    }
                    // InternalGumboParser.g:4232:4: (otherlv_16= Colon ( (lv_type_17_0= ruleSlangType ) ) )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==Colon) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // InternalGumboParser.g:4233:5: otherlv_16= Colon ( (lv_type_17_0= ruleSlangType ) )
                            {
                            otherlv_16=(Token)match(input,Colon,FollowSets000.FOLLOW_10); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_16, grammarAccess.getSlangTPatternAccess().getColonKeyword_2_2_0());
                              				
                            }
                            // InternalGumboParser.g:4237:5: ( (lv_type_17_0= ruleSlangType ) )
                            // InternalGumboParser.g:4238:6: (lv_type_17_0= ruleSlangType )
                            {
                            // InternalGumboParser.g:4238:6: (lv_type_17_0= ruleSlangType )
                            // InternalGumboParser.g:4239:7: lv_type_17_0= ruleSlangType
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
    // InternalGumboParser.g:4262:1: entryRuleSlangVarDef returns [EObject current=null] : iv_ruleSlangVarDef= ruleSlangVarDef EOF ;
    public final EObject entryRuleSlangVarDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangVarDef = null;


        try {
            // InternalGumboParser.g:4262:52: (iv_ruleSlangVarDef= ruleSlangVarDef EOF )
            // InternalGumboParser.g:4263:2: iv_ruleSlangVarDef= ruleSlangVarDef EOF
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
    // InternalGumboParser.g:4269:1: ruleSlangVarDef returns [EObject current=null] : ( ruleSlangVarMod this_SlangPattern_1= ruleSlangPattern (otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) )? otherlv_4= ColonEqualsSign ( (lv_init_5_0= ruleExpr ) ) ) ;
    public final EObject ruleSlangVarDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_SlangPattern_1 = null;

        EObject lv_typeName_3_0 = null;

        EObject lv_init_5_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:4275:2: ( ( ruleSlangVarMod this_SlangPattern_1= ruleSlangPattern (otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) )? otherlv_4= ColonEqualsSign ( (lv_init_5_0= ruleExpr ) ) ) )
            // InternalGumboParser.g:4276:2: ( ruleSlangVarMod this_SlangPattern_1= ruleSlangPattern (otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) )? otherlv_4= ColonEqualsSign ( (lv_init_5_0= ruleExpr ) ) )
            {
            // InternalGumboParser.g:4276:2: ( ruleSlangVarMod this_SlangPattern_1= ruleSlangPattern (otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) )? otherlv_4= ColonEqualsSign ( (lv_init_5_0= ruleExpr ) ) )
            // InternalGumboParser.g:4277:3: ruleSlangVarMod this_SlangPattern_1= ruleSlangPattern (otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) )? otherlv_4= ColonEqualsSign ( (lv_init_5_0= ruleExpr ) )
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSlangVarDefAccess().getSlangVarModParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_64);
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
            pushFollow(FollowSets000.FOLLOW_72);
            this_SlangPattern_1=ruleSlangPattern();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SlangPattern_1;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGumboParser.g:4298:3: (otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==Colon) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalGumboParser.g:4299:4: otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) )
                    {
                    otherlv_2=(Token)match(input,Colon,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSlangVarDefAccess().getColonKeyword_2_0());
                      			
                    }
                    // InternalGumboParser.g:4303:4: ( (lv_typeName_3_0= ruleSlangType ) )
                    // InternalGumboParser.g:4304:5: (lv_typeName_3_0= ruleSlangType )
                    {
                    // InternalGumboParser.g:4304:5: (lv_typeName_3_0= ruleSlangType )
                    // InternalGumboParser.g:4305:6: lv_typeName_3_0= ruleSlangType
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

            otherlv_4=(Token)match(input,ColonEqualsSign,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getSlangVarDefAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalGumboParser.g:4327:3: ( (lv_init_5_0= ruleExpr ) )
            // InternalGumboParser.g:4328:4: (lv_init_5_0= ruleExpr )
            {
            // InternalGumboParser.g:4328:4: (lv_init_5_0= ruleExpr )
            // InternalGumboParser.g:4329:5: lv_init_5_0= ruleExpr
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
    // InternalGumboParser.g:4350:1: entryRuleSlangVarMod returns [String current=null] : iv_ruleSlangVarMod= ruleSlangVarMod EOF ;
    public final String entryRuleSlangVarMod() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSlangVarMod = null;


        try {
            // InternalGumboParser.g:4350:51: (iv_ruleSlangVarMod= ruleSlangVarMod EOF )
            // InternalGumboParser.g:4351:2: iv_ruleSlangVarMod= ruleSlangVarMod EOF
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
    // InternalGumboParser.g:4357:1: ruleSlangVarMod returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Val | kw= Var ) ;
    public final AntlrDatatypeRuleToken ruleSlangVarMod() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumboParser.g:4363:2: ( (kw= Val | kw= Var ) )
            // InternalGumboParser.g:4364:2: (kw= Val | kw= Var )
            {
            // InternalGumboParser.g:4364:2: (kw= Val | kw= Var )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==Val) ) {
                alt91=1;
            }
            else if ( (LA91_0==Var) ) {
                alt91=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // InternalGumboParser.g:4365:3: kw= Val
                    {
                    kw=(Token)match(input,Val,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getSlangVarModAccess().getValKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:4371:3: kw= Var
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
    // InternalGumboParser.g:4380:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // InternalGumboParser.g:4380:45: (iv_ruleExpr= ruleExpr EOF )
            // InternalGumboParser.g:4381:2: iv_ruleExpr= ruleExpr EOF
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
    // InternalGumboParser.g:4387:1: ruleExpr returns [EObject current=null] : ( ( () ( (lv_terms_1_0= ruleSlangAccess ) ) ( ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )* | (otherlv_4= QuestionMark ( (lv_thenExpr_5_0= ruleExpr ) ) otherlv_6= Colon ( (lv_elseExpr_7_0= ruleExpr ) ) ) ) ) | ( () (otherlv_9= All | otherlv_10= Some | otherlv_11= ForAll | otherlv_12= ThereExists ) ( (lv_qVar_13_0= ruleSlangQuantVar ) ) (otherlv_14= Comma ( (lv_qVar_15_0= ruleSlangQuantVar ) ) )* otherlv_16= EqualsSignGreaterThanSign ( (lv_quantifiedExpr_17_0= ruleExpr ) ) ) | ( () ( (lv_op_19_0= ruleOperator ) ) ( (lv_accessExp_20_0= ruleSlangAccess ) ) ) ) ;
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
            // InternalGumboParser.g:4393:2: ( ( ( () ( (lv_terms_1_0= ruleSlangAccess ) ) ( ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )* | (otherlv_4= QuestionMark ( (lv_thenExpr_5_0= ruleExpr ) ) otherlv_6= Colon ( (lv_elseExpr_7_0= ruleExpr ) ) ) ) ) | ( () (otherlv_9= All | otherlv_10= Some | otherlv_11= ForAll | otherlv_12= ThereExists ) ( (lv_qVar_13_0= ruleSlangQuantVar ) ) (otherlv_14= Comma ( (lv_qVar_15_0= ruleSlangQuantVar ) ) )* otherlv_16= EqualsSignGreaterThanSign ( (lv_quantifiedExpr_17_0= ruleExpr ) ) ) | ( () ( (lv_op_19_0= ruleOperator ) ) ( (lv_accessExp_20_0= ruleSlangAccess ) ) ) ) )
            // InternalGumboParser.g:4394:2: ( ( () ( (lv_terms_1_0= ruleSlangAccess ) ) ( ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )* | (otherlv_4= QuestionMark ( (lv_thenExpr_5_0= ruleExpr ) ) otherlv_6= Colon ( (lv_elseExpr_7_0= ruleExpr ) ) ) ) ) | ( () (otherlv_9= All | otherlv_10= Some | otherlv_11= ForAll | otherlv_12= ThereExists ) ( (lv_qVar_13_0= ruleSlangQuantVar ) ) (otherlv_14= Comma ( (lv_qVar_15_0= ruleSlangQuantVar ) ) )* otherlv_16= EqualsSignGreaterThanSign ( (lv_quantifiedExpr_17_0= ruleExpr ) ) ) | ( () ( (lv_op_19_0= ruleOperator ) ) ( (lv_accessExp_20_0= ruleSlangAccess ) ) ) )
            {
            // InternalGumboParser.g:4394:2: ( ( () ( (lv_terms_1_0= ruleSlangAccess ) ) ( ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )* | (otherlv_4= QuestionMark ( (lv_thenExpr_5_0= ruleExpr ) ) otherlv_6= Colon ( (lv_elseExpr_7_0= ruleExpr ) ) ) ) ) | ( () (otherlv_9= All | otherlv_10= Some | otherlv_11= ForAll | otherlv_12= ThereExists ) ( (lv_qVar_13_0= ruleSlangQuantVar ) ) (otherlv_14= Comma ( (lv_qVar_15_0= ruleSlangQuantVar ) ) )* otherlv_16= EqualsSignGreaterThanSign ( (lv_quantifiedExpr_17_0= ruleExpr ) ) ) | ( () ( (lv_op_19_0= ruleOperator ) ) ( (lv_accessExp_20_0= ruleSlangAccess ) ) ) )
            int alt96=3;
            switch ( input.LA(1) ) {
            case MustSend:
            case MaySend:
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
                alt96=1;
                }
                break;
            case Some:
            case All:
            case ForAll:
            case ThereExists:
                {
                alt96=2;
                }
                break;
            case Asterisk:
            case PlusSign:
            case HyphenMinus:
            case RULE_OP:
                {
                alt96=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // InternalGumboParser.g:4395:3: ( () ( (lv_terms_1_0= ruleSlangAccess ) ) ( ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )* | (otherlv_4= QuestionMark ( (lv_thenExpr_5_0= ruleExpr ) ) otherlv_6= Colon ( (lv_elseExpr_7_0= ruleExpr ) ) ) ) )
                    {
                    // InternalGumboParser.g:4395:3: ( () ( (lv_terms_1_0= ruleSlangAccess ) ) ( ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )* | (otherlv_4= QuestionMark ( (lv_thenExpr_5_0= ruleExpr ) ) otherlv_6= Colon ( (lv_elseExpr_7_0= ruleExpr ) ) ) ) )
                    // InternalGumboParser.g:4396:4: () ( (lv_terms_1_0= ruleSlangAccess ) ) ( ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )* | (otherlv_4= QuestionMark ( (lv_thenExpr_5_0= ruleExpr ) ) otherlv_6= Colon ( (lv_elseExpr_7_0= ruleExpr ) ) ) )
                    {
                    // InternalGumboParser.g:4396:4: ()
                    // InternalGumboParser.g:4397:5: 
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

                    // InternalGumboParser.g:4406:4: ( (lv_terms_1_0= ruleSlangAccess ) )
                    // InternalGumboParser.g:4407:5: (lv_terms_1_0= ruleSlangAccess )
                    {
                    // InternalGumboParser.g:4407:5: (lv_terms_1_0= ruleSlangAccess )
                    // InternalGumboParser.g:4408:6: lv_terms_1_0= ruleSlangAccess
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprAccess().getTermsSlangAccessParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_73);
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

                    // InternalGumboParser.g:4425:4: ( ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )* | (otherlv_4= QuestionMark ( (lv_thenExpr_5_0= ruleExpr ) ) otherlv_6= Colon ( (lv_elseExpr_7_0= ruleExpr ) ) ) )
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==EOF||LA93_0==Invariant||(LA93_0>=Modifies && LA93_0<=Requires)||LA93_0==Ensures||(LA93_0>=Assert && LA93_0<=Assume)||LA93_0==Return||LA93_0==Match||LA93_0==Reads||(LA93_0>=While && LA93_0<=Yield)||LA93_0==Case||(LA93_0>=Halt && LA93_0<=Spec)||(LA93_0>=HyphenMinusGreaterThanSignColon && LA93_0<=FullStopFullStopLessThanSign)||(LA93_0>=Val && LA93_0<=FullStopFullStop)||LA93_0==ColonEqualsSign||(LA93_0>=EqualsSignGreaterThanSign && LA93_0<=If)||(LA93_0>=RightParenthesis && LA93_0<=HyphenMinus)||(LA93_0>=Colon && LA93_0<=Semicolon)||(LA93_0>=LeftCurlyBracket && LA93_0<=RightCurlyBracket)||LA93_0==RULE_SLANG_STRING||LA93_0==RULE_OP||LA93_0==RULE_ID) ) {
                        alt93=1;
                    }
                    else if ( (LA93_0==QuestionMark) ) {
                        alt93=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 93, 0, input);

                        throw nvae;
                    }
                    switch (alt93) {
                        case 1 :
                            // InternalGumboParser.g:4426:5: ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )*
                            {
                            // InternalGumboParser.g:4426:5: ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )*
                            loop92:
                            do {
                                int alt92=2;
                                int LA92_0 = input.LA(1);

                                if ( ((LA92_0>=Asterisk && LA92_0<=PlusSign)||LA92_0==HyphenMinus||LA92_0==RULE_OP) ) {
                                    alt92=1;
                                }


                                switch (alt92) {
                            	case 1 :
                            	    // InternalGumboParser.g:4427:6: ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) )
                            	    {
                            	    // InternalGumboParser.g:4427:6: ( (lv_ops_2_0= ruleOperator ) )
                            	    // InternalGumboParser.g:4428:7: (lv_ops_2_0= ruleOperator )
                            	    {
                            	    // InternalGumboParser.g:4428:7: (lv_ops_2_0= ruleOperator )
                            	    // InternalGumboParser.g:4429:8: lv_ops_2_0= ruleOperator
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getExprAccess().getOpsOperatorParserRuleCall_0_2_0_0_0());
                            	      							
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_74);
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

                            	    // InternalGumboParser.g:4446:6: ( (lv_terms_3_0= ruleSlangAccess ) )
                            	    // InternalGumboParser.g:4447:7: (lv_terms_3_0= ruleSlangAccess )
                            	    {
                            	    // InternalGumboParser.g:4447:7: (lv_terms_3_0= ruleSlangAccess )
                            	    // InternalGumboParser.g:4448:8: lv_terms_3_0= ruleSlangAccess
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getExprAccess().getTermsSlangAccessParserRuleCall_0_2_0_1_0());
                            	      							
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
                            	    break loop92;
                                }
                            } while (true);


                            }
                            break;
                        case 2 :
                            // InternalGumboParser.g:4467:5: (otherlv_4= QuestionMark ( (lv_thenExpr_5_0= ruleExpr ) ) otherlv_6= Colon ( (lv_elseExpr_7_0= ruleExpr ) ) )
                            {
                            // InternalGumboParser.g:4467:5: (otherlv_4= QuestionMark ( (lv_thenExpr_5_0= ruleExpr ) ) otherlv_6= Colon ( (lv_elseExpr_7_0= ruleExpr ) ) )
                            // InternalGumboParser.g:4468:6: otherlv_4= QuestionMark ( (lv_thenExpr_5_0= ruleExpr ) ) otherlv_6= Colon ( (lv_elseExpr_7_0= ruleExpr ) )
                            {
                            otherlv_4=(Token)match(input,QuestionMark,FollowSets000.FOLLOW_17); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_4, grammarAccess.getExprAccess().getQuestionMarkKeyword_0_2_1_0());
                              					
                            }
                            // InternalGumboParser.g:4472:6: ( (lv_thenExpr_5_0= ruleExpr ) )
                            // InternalGumboParser.g:4473:7: (lv_thenExpr_5_0= ruleExpr )
                            {
                            // InternalGumboParser.g:4473:7: (lv_thenExpr_5_0= ruleExpr )
                            // InternalGumboParser.g:4474:8: lv_thenExpr_5_0= ruleExpr
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getExprAccess().getThenExprExprParserRuleCall_0_2_1_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_12);
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

                            otherlv_6=(Token)match(input,Colon,FollowSets000.FOLLOW_17); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_6, grammarAccess.getExprAccess().getColonKeyword_0_2_1_2());
                              					
                            }
                            // InternalGumboParser.g:4495:6: ( (lv_elseExpr_7_0= ruleExpr ) )
                            // InternalGumboParser.g:4496:7: (lv_elseExpr_7_0= ruleExpr )
                            {
                            // InternalGumboParser.g:4496:7: (lv_elseExpr_7_0= ruleExpr )
                            // InternalGumboParser.g:4497:8: lv_elseExpr_7_0= ruleExpr
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
                    // InternalGumboParser.g:4518:3: ( () (otherlv_9= All | otherlv_10= Some | otherlv_11= ForAll | otherlv_12= ThereExists ) ( (lv_qVar_13_0= ruleSlangQuantVar ) ) (otherlv_14= Comma ( (lv_qVar_15_0= ruleSlangQuantVar ) ) )* otherlv_16= EqualsSignGreaterThanSign ( (lv_quantifiedExpr_17_0= ruleExpr ) ) )
                    {
                    // InternalGumboParser.g:4518:3: ( () (otherlv_9= All | otherlv_10= Some | otherlv_11= ForAll | otherlv_12= ThereExists ) ( (lv_qVar_13_0= ruleSlangQuantVar ) ) (otherlv_14= Comma ( (lv_qVar_15_0= ruleSlangQuantVar ) ) )* otherlv_16= EqualsSignGreaterThanSign ( (lv_quantifiedExpr_17_0= ruleExpr ) ) )
                    // InternalGumboParser.g:4519:4: () (otherlv_9= All | otherlv_10= Some | otherlv_11= ForAll | otherlv_12= ThereExists ) ( (lv_qVar_13_0= ruleSlangQuantVar ) ) (otherlv_14= Comma ( (lv_qVar_15_0= ruleSlangQuantVar ) ) )* otherlv_16= EqualsSignGreaterThanSign ( (lv_quantifiedExpr_17_0= ruleExpr ) )
                    {
                    // InternalGumboParser.g:4519:4: ()
                    // InternalGumboParser.g:4520:5: 
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

                    // InternalGumboParser.g:4529:4: (otherlv_9= All | otherlv_10= Some | otherlv_11= ForAll | otherlv_12= ThereExists )
                    int alt94=4;
                    switch ( input.LA(1) ) {
                    case All:
                        {
                        alt94=1;
                        }
                        break;
                    case Some:
                        {
                        alt94=2;
                        }
                        break;
                    case ForAll:
                        {
                        alt94=3;
                        }
                        break;
                    case ThereExists:
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
                            // InternalGumboParser.g:4530:5: otherlv_9= All
                            {
                            otherlv_9=(Token)match(input,All,FollowSets000.FOLLOW_10); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_9, grammarAccess.getExprAccess().getAllKeyword_1_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalGumboParser.g:4535:5: otherlv_10= Some
                            {
                            otherlv_10=(Token)match(input,Some,FollowSets000.FOLLOW_10); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_10, grammarAccess.getExprAccess().getSomeKeyword_1_1_1());
                              				
                            }

                            }
                            break;
                        case 3 :
                            // InternalGumboParser.g:4540:5: otherlv_11= ForAll
                            {
                            otherlv_11=(Token)match(input,ForAll,FollowSets000.FOLLOW_10); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_11, grammarAccess.getExprAccess().getForAllKeyword_1_1_2());
                              				
                            }

                            }
                            break;
                        case 4 :
                            // InternalGumboParser.g:4545:5: otherlv_12= ThereExists
                            {
                            otherlv_12=(Token)match(input,ThereExists,FollowSets000.FOLLOW_10); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_12, grammarAccess.getExprAccess().getThereExistsKeyword_1_1_3());
                              				
                            }

                            }
                            break;

                    }

                    // InternalGumboParser.g:4550:4: ( (lv_qVar_13_0= ruleSlangQuantVar ) )
                    // InternalGumboParser.g:4551:5: (lv_qVar_13_0= ruleSlangQuantVar )
                    {
                    // InternalGumboParser.g:4551:5: (lv_qVar_13_0= ruleSlangQuantVar )
                    // InternalGumboParser.g:4552:6: lv_qVar_13_0= ruleSlangQuantVar
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprAccess().getQVarSlangQuantVarParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_76);
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

                    // InternalGumboParser.g:4569:4: (otherlv_14= Comma ( (lv_qVar_15_0= ruleSlangQuantVar ) ) )*
                    loop95:
                    do {
                        int alt95=2;
                        int LA95_0 = input.LA(1);

                        if ( (LA95_0==Comma) ) {
                            alt95=1;
                        }


                        switch (alt95) {
                    	case 1 :
                    	    // InternalGumboParser.g:4570:5: otherlv_14= Comma ( (lv_qVar_15_0= ruleSlangQuantVar ) )
                    	    {
                    	    otherlv_14=(Token)match(input,Comma,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_14, grammarAccess.getExprAccess().getCommaKeyword_1_3_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:4574:5: ( (lv_qVar_15_0= ruleSlangQuantVar ) )
                    	    // InternalGumboParser.g:4575:6: (lv_qVar_15_0= ruleSlangQuantVar )
                    	    {
                    	    // InternalGumboParser.g:4575:6: (lv_qVar_15_0= ruleSlangQuantVar )
                    	    // InternalGumboParser.g:4576:7: lv_qVar_15_0= ruleSlangQuantVar
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getExprAccess().getQVarSlangQuantVarParserRuleCall_1_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_76);
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
                    	    break loop95;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getExprAccess().getEqualsSignGreaterThanSignKeyword_1_4());
                      			
                    }
                    // InternalGumboParser.g:4598:4: ( (lv_quantifiedExpr_17_0= ruleExpr ) )
                    // InternalGumboParser.g:4599:5: (lv_quantifiedExpr_17_0= ruleExpr )
                    {
                    // InternalGumboParser.g:4599:5: (lv_quantifiedExpr_17_0= ruleExpr )
                    // InternalGumboParser.g:4600:6: lv_quantifiedExpr_17_0= ruleExpr
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
                    // InternalGumboParser.g:4619:3: ( () ( (lv_op_19_0= ruleOperator ) ) ( (lv_accessExp_20_0= ruleSlangAccess ) ) )
                    {
                    // InternalGumboParser.g:4619:3: ( () ( (lv_op_19_0= ruleOperator ) ) ( (lv_accessExp_20_0= ruleSlangAccess ) ) )
                    // InternalGumboParser.g:4620:4: () ( (lv_op_19_0= ruleOperator ) ) ( (lv_accessExp_20_0= ruleSlangAccess ) )
                    {
                    // InternalGumboParser.g:4620:4: ()
                    // InternalGumboParser.g:4621:5: 
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

                    // InternalGumboParser.g:4630:4: ( (lv_op_19_0= ruleOperator ) )
                    // InternalGumboParser.g:4631:5: (lv_op_19_0= ruleOperator )
                    {
                    // InternalGumboParser.g:4631:5: (lv_op_19_0= ruleOperator )
                    // InternalGumboParser.g:4632:6: lv_op_19_0= ruleOperator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprAccess().getOpOperatorParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_74);
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

                    // InternalGumboParser.g:4649:4: ( (lv_accessExp_20_0= ruleSlangAccess ) )
                    // InternalGumboParser.g:4650:5: (lv_accessExp_20_0= ruleSlangAccess )
                    {
                    // InternalGumboParser.g:4650:5: (lv_accessExp_20_0= ruleSlangAccess )
                    // InternalGumboParser.g:4651:6: lv_accessExp_20_0= ruleSlangAccess
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
    // InternalGumboParser.g:4673:1: entryRuleSlangQuantVar returns [EObject current=null] : iv_ruleSlangQuantVar= ruleSlangQuantVar EOF ;
    public final EObject entryRuleSlangQuantVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangQuantVar = null;


        try {
            // InternalGumboParser.g:4673:54: (iv_ruleSlangQuantVar= ruleSlangQuantVar EOF )
            // InternalGumboParser.g:4674:2: iv_ruleSlangQuantVar= ruleSlangQuantVar EOF
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
    // InternalGumboParser.g:4680:1: ruleSlangQuantVar returns [EObject current=null] : (this_ID_0= RULE_ID otherlv_1= Colon ( (lv_e_2_0= ruleExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upperBound_5_0= ruleExpr ) ) )? ) ;
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
            // InternalGumboParser.g:4686:2: ( (this_ID_0= RULE_ID otherlv_1= Colon ( (lv_e_2_0= ruleExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upperBound_5_0= ruleExpr ) ) )? ) )
            // InternalGumboParser.g:4687:2: (this_ID_0= RULE_ID otherlv_1= Colon ( (lv_e_2_0= ruleExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upperBound_5_0= ruleExpr ) ) )? )
            {
            // InternalGumboParser.g:4687:2: (this_ID_0= RULE_ID otherlv_1= Colon ( (lv_e_2_0= ruleExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upperBound_5_0= ruleExpr ) ) )? )
            // InternalGumboParser.g:4688:3: this_ID_0= RULE_ID otherlv_1= Colon ( (lv_e_2_0= ruleExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upperBound_5_0= ruleExpr ) ) )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getSlangQuantVarAccess().getIDTerminalRuleCall_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSlangQuantVarAccess().getColonKeyword_1());
              		
            }
            // InternalGumboParser.g:4696:3: ( (lv_e_2_0= ruleExpr ) )
            // InternalGumboParser.g:4697:4: (lv_e_2_0= ruleExpr )
            {
            // InternalGumboParser.g:4697:4: (lv_e_2_0= ruleExpr )
            // InternalGumboParser.g:4698:5: lv_e_2_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangQuantVarAccess().getEExprParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_77);
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

            // InternalGumboParser.g:4715:3: ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upperBound_5_0= ruleExpr ) ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==FullStopFullStopLessThanSign||LA98_0==FullStopFullStop) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalGumboParser.g:4716:4: (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upperBound_5_0= ruleExpr ) )
                    {
                    // InternalGumboParser.g:4716:4: (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign )
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==FullStopFullStop) ) {
                        alt97=1;
                    }
                    else if ( (LA97_0==FullStopFullStopLessThanSign) ) {
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
                            // InternalGumboParser.g:4717:5: otherlv_3= FullStopFullStop
                            {
                            otherlv_3=(Token)match(input,FullStopFullStop,FollowSets000.FOLLOW_17); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_3, grammarAccess.getSlangQuantVarAccess().getFullStopFullStopKeyword_3_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalGumboParser.g:4722:5: otherlv_4= FullStopFullStopLessThanSign
                            {
                            otherlv_4=(Token)match(input,FullStopFullStopLessThanSign,FollowSets000.FOLLOW_17); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getSlangQuantVarAccess().getFullStopFullStopLessThanSignKeyword_3_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalGumboParser.g:4727:4: ( (lv_upperBound_5_0= ruleExpr ) )
                    // InternalGumboParser.g:4728:5: (lv_upperBound_5_0= ruleExpr )
                    {
                    // InternalGumboParser.g:4728:5: (lv_upperBound_5_0= ruleExpr )
                    // InternalGumboParser.g:4729:6: lv_upperBound_5_0= ruleExpr
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
    // InternalGumboParser.g:4751:1: entryRuleSlangBlock returns [EObject current=null] : iv_ruleSlangBlock= ruleSlangBlock EOF ;
    public final EObject entryRuleSlangBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangBlock = null;


        try {
            // InternalGumboParser.g:4751:51: (iv_ruleSlangBlock= ruleSlangBlock EOF )
            // InternalGumboParser.g:4752:2: iv_ruleSlangBlock= ruleSlangBlock EOF
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
    // InternalGumboParser.g:4758:1: ruleSlangBlock returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( (lv_stmts_2_0= ruleSlangStmt ) )* ( (lv_r_3_0= ruleSlangRet ) )? otherlv_4= RightCurlyBracket ) ;
    public final EObject ruleSlangBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_stmts_2_0 = null;

        EObject lv_r_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:4764:2: ( ( () otherlv_1= LeftCurlyBracket ( (lv_stmts_2_0= ruleSlangStmt ) )* ( (lv_r_3_0= ruleSlangRet ) )? otherlv_4= RightCurlyBracket ) )
            // InternalGumboParser.g:4765:2: ( () otherlv_1= LeftCurlyBracket ( (lv_stmts_2_0= ruleSlangStmt ) )* ( (lv_r_3_0= ruleSlangRet ) )? otherlv_4= RightCurlyBracket )
            {
            // InternalGumboParser.g:4765:2: ( () otherlv_1= LeftCurlyBracket ( (lv_stmts_2_0= ruleSlangStmt ) )* ( (lv_r_3_0= ruleSlangRet ) )? otherlv_4= RightCurlyBracket )
            // InternalGumboParser.g:4766:3: () otherlv_1= LeftCurlyBracket ( (lv_stmts_2_0= ruleSlangStmt ) )* ( (lv_r_3_0= ruleSlangRet ) )? otherlv_4= RightCurlyBracket
            {
            // InternalGumboParser.g:4766:3: ()
            // InternalGumboParser.g:4767:4: 
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

            otherlv_1=(Token)match(input,LeftCurlyBracket,FollowSets000.FOLLOW_78); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSlangBlockAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalGumboParser.g:4780:3: ( (lv_stmts_2_0= ruleSlangStmt ) )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( ((LA99_0>=Assert && LA99_0<=Assume)||LA99_0==Match||LA99_0==While||(LA99_0>=Halt && LA99_0<=Spec)||(LA99_0>=Val && LA99_0<=Var)||(LA99_0>=Do && LA99_0<=If)||LA99_0==RULE_ID) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // InternalGumboParser.g:4781:4: (lv_stmts_2_0= ruleSlangStmt )
            	    {
            	    // InternalGumboParser.g:4781:4: (lv_stmts_2_0= ruleSlangStmt )
            	    // InternalGumboParser.g:4782:5: lv_stmts_2_0= ruleSlangStmt
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSlangBlockAccess().getStmtsSlangStmtParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_78);
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
            	    break loop99;
                }
            } while (true);

            // InternalGumboParser.g:4799:3: ( (lv_r_3_0= ruleSlangRet ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==Return) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalGumboParser.g:4800:4: (lv_r_3_0= ruleSlangRet )
                    {
                    // InternalGumboParser.g:4800:4: (lv_r_3_0= ruleSlangRet )
                    // InternalGumboParser.g:4801:5: lv_r_3_0= ruleSlangRet
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangBlockAccess().getRSlangRetParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_79);
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
    // InternalGumboParser.g:4826:1: entryRuleSlangAccess returns [EObject current=null] : iv_ruleSlangAccess= ruleSlangAccess EOF ;
    public final EObject entryRuleSlangAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangAccess = null;


        try {
            // InternalGumboParser.g:4826:52: (iv_ruleSlangAccess= ruleSlangAccess EOF )
            // InternalGumboParser.g:4827:2: iv_ruleSlangAccess= ruleSlangAccess EOF
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
    // InternalGumboParser.g:4833:1: ruleSlangAccess returns [EObject current=null] : ( () ( (lv_t_1_0= ruleSlangTerm ) ) ) ;
    public final EObject ruleSlangAccess() throws RecognitionException {
        EObject current = null;

        EObject lv_t_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:4839:2: ( ( () ( (lv_t_1_0= ruleSlangTerm ) ) ) )
            // InternalGumboParser.g:4840:2: ( () ( (lv_t_1_0= ruleSlangTerm ) ) )
            {
            // InternalGumboParser.g:4840:2: ( () ( (lv_t_1_0= ruleSlangTerm ) ) )
            // InternalGumboParser.g:4841:3: () ( (lv_t_1_0= ruleSlangTerm ) )
            {
            // InternalGumboParser.g:4841:3: ()
            // InternalGumboParser.g:4842:4: 
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

            // InternalGumboParser.g:4851:3: ( (lv_t_1_0= ruleSlangTerm ) )
            // InternalGumboParser.g:4852:4: (lv_t_1_0= ruleSlangTerm )
            {
            // InternalGumboParser.g:4852:4: (lv_t_1_0= ruleSlangTerm )
            // InternalGumboParser.g:4853:5: lv_t_1_0= ruleSlangTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangAccessAccess().getTSlangTermParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
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


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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


    // $ANTLR start "entryRuleSlangTerm"
    // InternalGumboParser.g:4874:1: entryRuleSlangTerm returns [EObject current=null] : iv_ruleSlangTerm= ruleSlangTerm EOF ;
    public final EObject entryRuleSlangTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangTerm = null;


        try {
            // InternalGumboParser.g:4874:50: (iv_ruleSlangTerm= ruleSlangTerm EOF )
            // InternalGumboParser.g:4875:2: iv_ruleSlangTerm= ruleSlangTerm EOF
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
    // InternalGumboParser.g:4881:1: ruleSlangTerm returns [EObject current=null] : ( ( () ( (lv_lit_1_0= ruleSlangLit ) ) ) | ( () ( (lv_i_3_0= ruleSlangInterp ) ) ) | ( ( ( ( () In_1 LeftParenthesis ) )=> ( () otherlv_5= In_1 otherlv_6= LeftParenthesis ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= RightParenthesis ) | ( ( ( ( () MaySend LeftParenthesis ) )=> ( () otherlv_10= MaySend otherlv_11= LeftParenthesis ) ) ( (otherlv_12= RULE_ID ) ) otherlv_13= Comma ( (lv_value_14_0= ruleExpr ) ) otherlv_15= RightParenthesis ) | ( ( ( ( () MustSend LeftParenthesis ) )=> ( () otherlv_17= MustSend otherlv_18= LeftParenthesis ) ) ( (otherlv_19= RULE_ID ) ) otherlv_20= Comma ( (lv_value_21_0= ruleExpr ) ) otherlv_22= RightParenthesis ) | ( ( ( ( () ( ( ruleQCLREF ) ) FullStop ) )=> ( () ( ( ruleQCLREF ) ) otherlv_25= FullStop ) ) ( (otherlv_26= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_28_0= ruleDataElement ) ) otherlv_29= LeftCurlyBracket ( (otherlv_30= RULE_ID ) ) otherlv_31= EqualsSign ) ) ( (lv_argExpr_32_0= ruleExpr ) ) (otherlv_33= Semicolon ( (otherlv_34= RULE_ID ) ) otherlv_35= EqualsSign ( (lv_argExpr_36_0= ruleExpr ) ) )* otherlv_37= RightCurlyBracket ) | ( () ( (otherlv_39= RULE_ID ) ) (otherlv_40= FullStop ( (lv_ref_41_0= ruleOtherDataRef ) ) )? ( (lv_cs_42_0= ruleSlangCallSuffix ) )? ) | ( () otherlv_44= LeftParenthesis ( (lv_e_45_0= ruleExpr ) ) (otherlv_46= Comma ( (lv_e_47_0= ruleExpr ) ) )* otherlv_48= RightParenthesis ) | ( () otherlv_50= For ( (lv_r_51_0= ruleSlangForRange ) ) (otherlv_52= Comma ( (lv_r_53_0= ruleSlangForRange ) ) )* otherlv_54= Yield ( ( (lv_b_55_0= ruleSlangBlock ) ) | (otherlv_56= LeftParenthesis ( (lv_e_57_0= ruleExpr ) ) otherlv_58= RightParenthesis ) ) ) | ( () otherlv_60= LeftCurlyBracket ( ( ( ( (lv_p_61_0= ruleSlangParams ) ) otherlv_62= EqualsSignGreaterThanSign )? ( (lv_e_63_0= ruleExpr ) ) otherlv_64= RightCurlyBracket ) | ( ( (lv_stmt_65_0= ruleSlangStmt ) )* ( (lv_r_66_0= ruleSlangRet ) )? otherlv_67= RightCurlyBracket ) ) ) ) ;
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
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_44=null;
        Token otherlv_46=null;
        Token otherlv_48=null;
        Token otherlv_50=null;
        Token otherlv_52=null;
        Token otherlv_54=null;
        Token otherlv_56=null;
        Token otherlv_58=null;
        Token otherlv_60=null;
        Token otherlv_62=null;
        Token otherlv_64=null;
        Token otherlv_67=null;
        EObject lv_lit_1_0 = null;

        EObject lv_i_3_0 = null;

        EObject lv_value_14_0 = null;

        EObject lv_value_21_0 = null;

        EObject lv_recordType_28_0 = null;

        EObject lv_argExpr_32_0 = null;

        EObject lv_argExpr_36_0 = null;

        EObject lv_ref_41_0 = null;

        EObject lv_cs_42_0 = null;

        EObject lv_e_45_0 = null;

        EObject lv_e_47_0 = null;

        EObject lv_r_51_0 = null;

        EObject lv_r_53_0 = null;

        EObject lv_b_55_0 = null;

        EObject lv_e_57_0 = null;

        EObject lv_p_61_0 = null;

        EObject lv_e_63_0 = null;

        EObject lv_stmt_65_0 = null;

        EObject lv_r_66_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:4887:2: ( ( ( () ( (lv_lit_1_0= ruleSlangLit ) ) ) | ( () ( (lv_i_3_0= ruleSlangInterp ) ) ) | ( ( ( ( () In_1 LeftParenthesis ) )=> ( () otherlv_5= In_1 otherlv_6= LeftParenthesis ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= RightParenthesis ) | ( ( ( ( () MaySend LeftParenthesis ) )=> ( () otherlv_10= MaySend otherlv_11= LeftParenthesis ) ) ( (otherlv_12= RULE_ID ) ) otherlv_13= Comma ( (lv_value_14_0= ruleExpr ) ) otherlv_15= RightParenthesis ) | ( ( ( ( () MustSend LeftParenthesis ) )=> ( () otherlv_17= MustSend otherlv_18= LeftParenthesis ) ) ( (otherlv_19= RULE_ID ) ) otherlv_20= Comma ( (lv_value_21_0= ruleExpr ) ) otherlv_22= RightParenthesis ) | ( ( ( ( () ( ( ruleQCLREF ) ) FullStop ) )=> ( () ( ( ruleQCLREF ) ) otherlv_25= FullStop ) ) ( (otherlv_26= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_28_0= ruleDataElement ) ) otherlv_29= LeftCurlyBracket ( (otherlv_30= RULE_ID ) ) otherlv_31= EqualsSign ) ) ( (lv_argExpr_32_0= ruleExpr ) ) (otherlv_33= Semicolon ( (otherlv_34= RULE_ID ) ) otherlv_35= EqualsSign ( (lv_argExpr_36_0= ruleExpr ) ) )* otherlv_37= RightCurlyBracket ) | ( () ( (otherlv_39= RULE_ID ) ) (otherlv_40= FullStop ( (lv_ref_41_0= ruleOtherDataRef ) ) )? ( (lv_cs_42_0= ruleSlangCallSuffix ) )? ) | ( () otherlv_44= LeftParenthesis ( (lv_e_45_0= ruleExpr ) ) (otherlv_46= Comma ( (lv_e_47_0= ruleExpr ) ) )* otherlv_48= RightParenthesis ) | ( () otherlv_50= For ( (lv_r_51_0= ruleSlangForRange ) ) (otherlv_52= Comma ( (lv_r_53_0= ruleSlangForRange ) ) )* otherlv_54= Yield ( ( (lv_b_55_0= ruleSlangBlock ) ) | (otherlv_56= LeftParenthesis ( (lv_e_57_0= ruleExpr ) ) otherlv_58= RightParenthesis ) ) ) | ( () otherlv_60= LeftCurlyBracket ( ( ( ( (lv_p_61_0= ruleSlangParams ) ) otherlv_62= EqualsSignGreaterThanSign )? ( (lv_e_63_0= ruleExpr ) ) otherlv_64= RightCurlyBracket ) | ( ( (lv_stmt_65_0= ruleSlangStmt ) )* ( (lv_r_66_0= ruleSlangRet ) )? otherlv_67= RightCurlyBracket ) ) ) ) )
            // InternalGumboParser.g:4888:2: ( ( () ( (lv_lit_1_0= ruleSlangLit ) ) ) | ( () ( (lv_i_3_0= ruleSlangInterp ) ) ) | ( ( ( ( () In_1 LeftParenthesis ) )=> ( () otherlv_5= In_1 otherlv_6= LeftParenthesis ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= RightParenthesis ) | ( ( ( ( () MaySend LeftParenthesis ) )=> ( () otherlv_10= MaySend otherlv_11= LeftParenthesis ) ) ( (otherlv_12= RULE_ID ) ) otherlv_13= Comma ( (lv_value_14_0= ruleExpr ) ) otherlv_15= RightParenthesis ) | ( ( ( ( () MustSend LeftParenthesis ) )=> ( () otherlv_17= MustSend otherlv_18= LeftParenthesis ) ) ( (otherlv_19= RULE_ID ) ) otherlv_20= Comma ( (lv_value_21_0= ruleExpr ) ) otherlv_22= RightParenthesis ) | ( ( ( ( () ( ( ruleQCLREF ) ) FullStop ) )=> ( () ( ( ruleQCLREF ) ) otherlv_25= FullStop ) ) ( (otherlv_26= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_28_0= ruleDataElement ) ) otherlv_29= LeftCurlyBracket ( (otherlv_30= RULE_ID ) ) otherlv_31= EqualsSign ) ) ( (lv_argExpr_32_0= ruleExpr ) ) (otherlv_33= Semicolon ( (otherlv_34= RULE_ID ) ) otherlv_35= EqualsSign ( (lv_argExpr_36_0= ruleExpr ) ) )* otherlv_37= RightCurlyBracket ) | ( () ( (otherlv_39= RULE_ID ) ) (otherlv_40= FullStop ( (lv_ref_41_0= ruleOtherDataRef ) ) )? ( (lv_cs_42_0= ruleSlangCallSuffix ) )? ) | ( () otherlv_44= LeftParenthesis ( (lv_e_45_0= ruleExpr ) ) (otherlv_46= Comma ( (lv_e_47_0= ruleExpr ) ) )* otherlv_48= RightParenthesis ) | ( () otherlv_50= For ( (lv_r_51_0= ruleSlangForRange ) ) (otherlv_52= Comma ( (lv_r_53_0= ruleSlangForRange ) ) )* otherlv_54= Yield ( ( (lv_b_55_0= ruleSlangBlock ) ) | (otherlv_56= LeftParenthesis ( (lv_e_57_0= ruleExpr ) ) otherlv_58= RightParenthesis ) ) ) | ( () otherlv_60= LeftCurlyBracket ( ( ( ( (lv_p_61_0= ruleSlangParams ) ) otherlv_62= EqualsSignGreaterThanSign )? ( (lv_e_63_0= ruleExpr ) ) otherlv_64= RightCurlyBracket ) | ( ( (lv_stmt_65_0= ruleSlangStmt ) )* ( (lv_r_66_0= ruleSlangRet ) )? otherlv_67= RightCurlyBracket ) ) ) )
            {
            // InternalGumboParser.g:4888:2: ( ( () ( (lv_lit_1_0= ruleSlangLit ) ) ) | ( () ( (lv_i_3_0= ruleSlangInterp ) ) ) | ( ( ( ( () In_1 LeftParenthesis ) )=> ( () otherlv_5= In_1 otherlv_6= LeftParenthesis ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= RightParenthesis ) | ( ( ( ( () MaySend LeftParenthesis ) )=> ( () otherlv_10= MaySend otherlv_11= LeftParenthesis ) ) ( (otherlv_12= RULE_ID ) ) otherlv_13= Comma ( (lv_value_14_0= ruleExpr ) ) otherlv_15= RightParenthesis ) | ( ( ( ( () MustSend LeftParenthesis ) )=> ( () otherlv_17= MustSend otherlv_18= LeftParenthesis ) ) ( (otherlv_19= RULE_ID ) ) otherlv_20= Comma ( (lv_value_21_0= ruleExpr ) ) otherlv_22= RightParenthesis ) | ( ( ( ( () ( ( ruleQCLREF ) ) FullStop ) )=> ( () ( ( ruleQCLREF ) ) otherlv_25= FullStop ) ) ( (otherlv_26= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_28_0= ruleDataElement ) ) otherlv_29= LeftCurlyBracket ( (otherlv_30= RULE_ID ) ) otherlv_31= EqualsSign ) ) ( (lv_argExpr_32_0= ruleExpr ) ) (otherlv_33= Semicolon ( (otherlv_34= RULE_ID ) ) otherlv_35= EqualsSign ( (lv_argExpr_36_0= ruleExpr ) ) )* otherlv_37= RightCurlyBracket ) | ( () ( (otherlv_39= RULE_ID ) ) (otherlv_40= FullStop ( (lv_ref_41_0= ruleOtherDataRef ) ) )? ( (lv_cs_42_0= ruleSlangCallSuffix ) )? ) | ( () otherlv_44= LeftParenthesis ( (lv_e_45_0= ruleExpr ) ) (otherlv_46= Comma ( (lv_e_47_0= ruleExpr ) ) )* otherlv_48= RightParenthesis ) | ( () otherlv_50= For ( (lv_r_51_0= ruleSlangForRange ) ) (otherlv_52= Comma ( (lv_r_53_0= ruleSlangForRange ) ) )* otherlv_54= Yield ( ( (lv_b_55_0= ruleSlangBlock ) ) | (otherlv_56= LeftParenthesis ( (lv_e_57_0= ruleExpr ) ) otherlv_58= RightParenthesis ) ) ) | ( () otherlv_60= LeftCurlyBracket ( ( ( ( (lv_p_61_0= ruleSlangParams ) ) otherlv_62= EqualsSignGreaterThanSign )? ( (lv_e_63_0= ruleExpr ) ) otherlv_64= RightCurlyBracket ) | ( ( (lv_stmt_65_0= ruleSlangStmt ) )* ( (lv_r_66_0= ruleSlangRet ) )? otherlv_67= RightCurlyBracket ) ) ) )
            int alt111=11;
            alt111 = dfa111.predict(input);
            switch (alt111) {
                case 1 :
                    // InternalGumboParser.g:4889:3: ( () ( (lv_lit_1_0= ruleSlangLit ) ) )
                    {
                    // InternalGumboParser.g:4889:3: ( () ( (lv_lit_1_0= ruleSlangLit ) ) )
                    // InternalGumboParser.g:4890:4: () ( (lv_lit_1_0= ruleSlangLit ) )
                    {
                    // InternalGumboParser.g:4890:4: ()
                    // InternalGumboParser.g:4891:5: 
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

                    // InternalGumboParser.g:4900:4: ( (lv_lit_1_0= ruleSlangLit ) )
                    // InternalGumboParser.g:4901:5: (lv_lit_1_0= ruleSlangLit )
                    {
                    // InternalGumboParser.g:4901:5: (lv_lit_1_0= ruleSlangLit )
                    // InternalGumboParser.g:4902:6: lv_lit_1_0= ruleSlangLit
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
                    // InternalGumboParser.g:4921:3: ( () ( (lv_i_3_0= ruleSlangInterp ) ) )
                    {
                    // InternalGumboParser.g:4921:3: ( () ( (lv_i_3_0= ruleSlangInterp ) ) )
                    // InternalGumboParser.g:4922:4: () ( (lv_i_3_0= ruleSlangInterp ) )
                    {
                    // InternalGumboParser.g:4922:4: ()
                    // InternalGumboParser.g:4923:5: 
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

                    // InternalGumboParser.g:4932:4: ( (lv_i_3_0= ruleSlangInterp ) )
                    // InternalGumboParser.g:4933:5: (lv_i_3_0= ruleSlangInterp )
                    {
                    // InternalGumboParser.g:4933:5: (lv_i_3_0= ruleSlangInterp )
                    // InternalGumboParser.g:4934:6: lv_i_3_0= ruleSlangInterp
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
                    // InternalGumboParser.g:4953:3: ( ( ( ( () In_1 LeftParenthesis ) )=> ( () otherlv_5= In_1 otherlv_6= LeftParenthesis ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= RightParenthesis )
                    {
                    // InternalGumboParser.g:4953:3: ( ( ( ( () In_1 LeftParenthesis ) )=> ( () otherlv_5= In_1 otherlv_6= LeftParenthesis ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= RightParenthesis )
                    // InternalGumboParser.g:4954:4: ( ( ( () In_1 LeftParenthesis ) )=> ( () otherlv_5= In_1 otherlv_6= LeftParenthesis ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= RightParenthesis
                    {
                    // InternalGumboParser.g:4954:4: ( ( ( () In_1 LeftParenthesis ) )=> ( () otherlv_5= In_1 otherlv_6= LeftParenthesis ) )
                    // InternalGumboParser.g:4955:5: ( ( () In_1 LeftParenthesis ) )=> ( () otherlv_5= In_1 otherlv_6= LeftParenthesis )
                    {
                    // InternalGumboParser.g:4962:5: ( () otherlv_5= In_1 otherlv_6= LeftParenthesis )
                    // InternalGumboParser.g:4963:6: () otherlv_5= In_1 otherlv_6= LeftParenthesis
                    {
                    // InternalGumboParser.g:4963:6: ()
                    // InternalGumboParser.g:4964:7: 
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

                    otherlv_5=(Token)match(input,In_1,FollowSets000.FOLLOW_80); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_5, grammarAccess.getSlangTermAccess().getInKeyword_2_0_0_1());
                      					
                    }
                    otherlv_6=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_6, grammarAccess.getSlangTermAccess().getLeftParenthesisKeyword_2_0_0_2());
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:4983:4: ( (otherlv_7= RULE_ID ) )
                    // InternalGumboParser.g:4984:5: (otherlv_7= RULE_ID )
                    {
                    // InternalGumboParser.g:4984:5: (otherlv_7= RULE_ID )
                    // InternalGumboParser.g:4985:6: otherlv_7= RULE_ID
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
                    // InternalGumboParser.g:5005:3: ( ( ( ( () MaySend LeftParenthesis ) )=> ( () otherlv_10= MaySend otherlv_11= LeftParenthesis ) ) ( (otherlv_12= RULE_ID ) ) otherlv_13= Comma ( (lv_value_14_0= ruleExpr ) ) otherlv_15= RightParenthesis )
                    {
                    // InternalGumboParser.g:5005:3: ( ( ( ( () MaySend LeftParenthesis ) )=> ( () otherlv_10= MaySend otherlv_11= LeftParenthesis ) ) ( (otherlv_12= RULE_ID ) ) otherlv_13= Comma ( (lv_value_14_0= ruleExpr ) ) otherlv_15= RightParenthesis )
                    // InternalGumboParser.g:5006:4: ( ( ( () MaySend LeftParenthesis ) )=> ( () otherlv_10= MaySend otherlv_11= LeftParenthesis ) ) ( (otherlv_12= RULE_ID ) ) otherlv_13= Comma ( (lv_value_14_0= ruleExpr ) ) otherlv_15= RightParenthesis
                    {
                    // InternalGumboParser.g:5006:4: ( ( ( () MaySend LeftParenthesis ) )=> ( () otherlv_10= MaySend otherlv_11= LeftParenthesis ) )
                    // InternalGumboParser.g:5007:5: ( ( () MaySend LeftParenthesis ) )=> ( () otherlv_10= MaySend otherlv_11= LeftParenthesis )
                    {
                    // InternalGumboParser.g:5014:5: ( () otherlv_10= MaySend otherlv_11= LeftParenthesis )
                    // InternalGumboParser.g:5015:6: () otherlv_10= MaySend otherlv_11= LeftParenthesis
                    {
                    // InternalGumboParser.g:5015:6: ()
                    // InternalGumboParser.g:5016:7: 
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

                    otherlv_10=(Token)match(input,MaySend,FollowSets000.FOLLOW_80); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_10, grammarAccess.getSlangTermAccess().getMaySendKeyword_3_0_0_1());
                      					
                    }
                    otherlv_11=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_11, grammarAccess.getSlangTermAccess().getLeftParenthesisKeyword_3_0_0_2());
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:5035:4: ( (otherlv_12= RULE_ID ) )
                    // InternalGumboParser.g:5036:5: (otherlv_12= RULE_ID )
                    {
                    // InternalGumboParser.g:5036:5: (otherlv_12= RULE_ID )
                    // InternalGumboParser.g:5037:6: otherlv_12= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSlangTermRule());
                      						}
                      					
                    }
                    otherlv_12=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_81); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_12, grammarAccess.getSlangTermAccess().getEventPortPortCrossReference_3_1_0());
                      					
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,Comma,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getSlangTermAccess().getCommaKeyword_3_2());
                      			
                    }
                    // InternalGumboParser.g:5055:4: ( (lv_value_14_0= ruleExpr ) )
                    // InternalGumboParser.g:5056:5: (lv_value_14_0= ruleExpr )
                    {
                    // InternalGumboParser.g:5056:5: (lv_value_14_0= ruleExpr )
                    // InternalGumboParser.g:5057:6: lv_value_14_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangTermAccess().getValueExprParserRuleCall_3_3_0());
                      					
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

                    otherlv_15=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getSlangTermAccess().getRightParenthesisKeyword_3_4());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalGumboParser.g:5080:3: ( ( ( ( () MustSend LeftParenthesis ) )=> ( () otherlv_17= MustSend otherlv_18= LeftParenthesis ) ) ( (otherlv_19= RULE_ID ) ) otherlv_20= Comma ( (lv_value_21_0= ruleExpr ) ) otherlv_22= RightParenthesis )
                    {
                    // InternalGumboParser.g:5080:3: ( ( ( ( () MustSend LeftParenthesis ) )=> ( () otherlv_17= MustSend otherlv_18= LeftParenthesis ) ) ( (otherlv_19= RULE_ID ) ) otherlv_20= Comma ( (lv_value_21_0= ruleExpr ) ) otherlv_22= RightParenthesis )
                    // InternalGumboParser.g:5081:4: ( ( ( () MustSend LeftParenthesis ) )=> ( () otherlv_17= MustSend otherlv_18= LeftParenthesis ) ) ( (otherlv_19= RULE_ID ) ) otherlv_20= Comma ( (lv_value_21_0= ruleExpr ) ) otherlv_22= RightParenthesis
                    {
                    // InternalGumboParser.g:5081:4: ( ( ( () MustSend LeftParenthesis ) )=> ( () otherlv_17= MustSend otherlv_18= LeftParenthesis ) )
                    // InternalGumboParser.g:5082:5: ( ( () MustSend LeftParenthesis ) )=> ( () otherlv_17= MustSend otherlv_18= LeftParenthesis )
                    {
                    // InternalGumboParser.g:5089:5: ( () otherlv_17= MustSend otherlv_18= LeftParenthesis )
                    // InternalGumboParser.g:5090:6: () otherlv_17= MustSend otherlv_18= LeftParenthesis
                    {
                    // InternalGumboParser.g:5090:6: ()
                    // InternalGumboParser.g:5091:7: 
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

                    otherlv_17=(Token)match(input,MustSend,FollowSets000.FOLLOW_80); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_17, grammarAccess.getSlangTermAccess().getMustSendKeyword_4_0_0_1());
                      					
                    }
                    otherlv_18=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_18, grammarAccess.getSlangTermAccess().getLeftParenthesisKeyword_4_0_0_2());
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:5110:4: ( (otherlv_19= RULE_ID ) )
                    // InternalGumboParser.g:5111:5: (otherlv_19= RULE_ID )
                    {
                    // InternalGumboParser.g:5111:5: (otherlv_19= RULE_ID )
                    // InternalGumboParser.g:5112:6: otherlv_19= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSlangTermRule());
                      						}
                      					
                    }
                    otherlv_19=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_81); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_19, grammarAccess.getSlangTermAccess().getEventPortPortCrossReference_4_1_0());
                      					
                    }

                    }


                    }

                    otherlv_20=(Token)match(input,Comma,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_20, grammarAccess.getSlangTermAccess().getCommaKeyword_4_2());
                      			
                    }
                    // InternalGumboParser.g:5130:4: ( (lv_value_21_0= ruleExpr ) )
                    // InternalGumboParser.g:5131:5: (lv_value_21_0= ruleExpr )
                    {
                    // InternalGumboParser.g:5131:5: (lv_value_21_0= ruleExpr )
                    // InternalGumboParser.g:5132:6: lv_value_21_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangTermAccess().getValueExprParserRuleCall_4_3_0());
                      					
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

                    otherlv_22=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_22, grammarAccess.getSlangTermAccess().getRightParenthesisKeyword_4_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalGumboParser.g:5155:3: ( ( ( ( () ( ( ruleQCLREF ) ) FullStop ) )=> ( () ( ( ruleQCLREF ) ) otherlv_25= FullStop ) ) ( (otherlv_26= RULE_ID ) ) )
                    {
                    // InternalGumboParser.g:5155:3: ( ( ( ( () ( ( ruleQCLREF ) ) FullStop ) )=> ( () ( ( ruleQCLREF ) ) otherlv_25= FullStop ) ) ( (otherlv_26= RULE_ID ) ) )
                    // InternalGumboParser.g:5156:4: ( ( ( () ( ( ruleQCLREF ) ) FullStop ) )=> ( () ( ( ruleQCLREF ) ) otherlv_25= FullStop ) ) ( (otherlv_26= RULE_ID ) )
                    {
                    // InternalGumboParser.g:5156:4: ( ( ( () ( ( ruleQCLREF ) ) FullStop ) )=> ( () ( ( ruleQCLREF ) ) otherlv_25= FullStop ) )
                    // InternalGumboParser.g:5157:5: ( ( () ( ( ruleQCLREF ) ) FullStop ) )=> ( () ( ( ruleQCLREF ) ) otherlv_25= FullStop )
                    {
                    // InternalGumboParser.g:5168:5: ( () ( ( ruleQCLREF ) ) otherlv_25= FullStop )
                    // InternalGumboParser.g:5169:6: () ( ( ruleQCLREF ) ) otherlv_25= FullStop
                    {
                    // InternalGumboParser.g:5169:6: ()
                    // InternalGumboParser.g:5170:7: 
                    {
                    if ( state.backtracking==0 ) {

                      							/* */
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							current = forceCreateModelElement(
                      								grammarAccess.getSlangTermAccess().getEnumLitExprAction_5_0_0_0(),
                      								current);
                      						
                    }

                    }

                    // InternalGumboParser.g:5179:6: ( ( ruleQCLREF ) )
                    // InternalGumboParser.g:5180:7: ( ruleQCLREF )
                    {
                    // InternalGumboParser.g:5180:7: ( ruleQCLREF )
                    // InternalGumboParser.g:5181:8: ruleQCLREF
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

                      								newCompositeNode(grammarAccess.getSlangTermAccess().getEnumTypeDataClassifierCrossReference_5_0_0_1_0());
                      							
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

                    otherlv_25=(Token)match(input,FullStop,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_25, grammarAccess.getSlangTermAccess().getFullStopKeyword_5_0_0_2());
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:5204:4: ( (otherlv_26= RULE_ID ) )
                    // InternalGumboParser.g:5205:5: (otherlv_26= RULE_ID )
                    {
                    // InternalGumboParser.g:5205:5: (otherlv_26= RULE_ID )
                    // InternalGumboParser.g:5206:6: otherlv_26= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSlangTermRule());
                      						}
                      					
                    }
                    otherlv_26=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_26, grammarAccess.getSlangTermAccess().getValueStringLiteralCrossReference_5_1_0());
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalGumboParser.g:5222:3: ( ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_28_0= ruleDataElement ) ) otherlv_29= LeftCurlyBracket ( (otherlv_30= RULE_ID ) ) otherlv_31= EqualsSign ) ) ( (lv_argExpr_32_0= ruleExpr ) ) (otherlv_33= Semicolon ( (otherlv_34= RULE_ID ) ) otherlv_35= EqualsSign ( (lv_argExpr_36_0= ruleExpr ) ) )* otherlv_37= RightCurlyBracket )
                    {
                    // InternalGumboParser.g:5222:3: ( ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_28_0= ruleDataElement ) ) otherlv_29= LeftCurlyBracket ( (otherlv_30= RULE_ID ) ) otherlv_31= EqualsSign ) ) ( (lv_argExpr_32_0= ruleExpr ) ) (otherlv_33= Semicolon ( (otherlv_34= RULE_ID ) ) otherlv_35= EqualsSign ( (lv_argExpr_36_0= ruleExpr ) ) )* otherlv_37= RightCurlyBracket )
                    // InternalGumboParser.g:5223:4: ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_28_0= ruleDataElement ) ) otherlv_29= LeftCurlyBracket ( (otherlv_30= RULE_ID ) ) otherlv_31= EqualsSign ) ) ( (lv_argExpr_32_0= ruleExpr ) ) (otherlv_33= Semicolon ( (otherlv_34= RULE_ID ) ) otherlv_35= EqualsSign ( (lv_argExpr_36_0= ruleExpr ) ) )* otherlv_37= RightCurlyBracket
                    {
                    // InternalGumboParser.g:5223:4: ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_28_0= ruleDataElement ) ) otherlv_29= LeftCurlyBracket ( (otherlv_30= RULE_ID ) ) otherlv_31= EqualsSign ) )
                    // InternalGumboParser.g:5224:5: ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_28_0= ruleDataElement ) ) otherlv_29= LeftCurlyBracket ( (otherlv_30= RULE_ID ) ) otherlv_31= EqualsSign )
                    {
                    // InternalGumboParser.g:5241:5: ( () ( (lv_recordType_28_0= ruleDataElement ) ) otherlv_29= LeftCurlyBracket ( (otherlv_30= RULE_ID ) ) otherlv_31= EqualsSign )
                    // InternalGumboParser.g:5242:6: () ( (lv_recordType_28_0= ruleDataElement ) ) otherlv_29= LeftCurlyBracket ( (otherlv_30= RULE_ID ) ) otherlv_31= EqualsSign
                    {
                    // InternalGumboParser.g:5242:6: ()
                    // InternalGumboParser.g:5243:7: 
                    {
                    if ( state.backtracking==0 ) {

                      							/* */
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							current = forceCreateModelElement(
                      								grammarAccess.getSlangTermAccess().getRecordLitExprAction_6_0_0_0(),
                      								current);
                      						
                    }

                    }

                    // InternalGumboParser.g:5252:6: ( (lv_recordType_28_0= ruleDataElement ) )
                    // InternalGumboParser.g:5253:7: (lv_recordType_28_0= ruleDataElement )
                    {
                    // InternalGumboParser.g:5253:7: (lv_recordType_28_0= ruleDataElement )
                    // InternalGumboParser.g:5254:8: lv_recordType_28_0= ruleDataElement
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getSlangTermAccess().getRecordTypeDataElementParserRuleCall_6_0_0_1_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_55);
                    lv_recordType_28_0=ruleDataElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getSlangTermRule());
                      								}
                      								set(
                      									current,
                      									"recordType",
                      									lv_recordType_28_0,
                      									"org.sireum.aadl.gumbo.Gumbo.DataElement");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }

                    otherlv_29=(Token)match(input,LeftCurlyBracket,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_29, grammarAccess.getSlangTermAccess().getLeftCurlyBracketKeyword_6_0_0_2());
                      					
                    }
                    // InternalGumboParser.g:5275:6: ( (otherlv_30= RULE_ID ) )
                    // InternalGumboParser.g:5276:7: (otherlv_30= RULE_ID )
                    {
                    // InternalGumboParser.g:5276:7: (otherlv_30= RULE_ID )
                    // InternalGumboParser.g:5277:8: otherlv_30= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      								/* */
                      							
                    }
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElement(grammarAccess.getSlangTermRule());
                      								}
                      							
                    }
                    otherlv_30=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_83); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								newLeafNode(otherlv_30, grammarAccess.getSlangTermAccess().getArgsNamedElementCrossReference_6_0_0_3_0());
                      							
                    }

                    }


                    }

                    otherlv_31=(Token)match(input,EqualsSign,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_31, grammarAccess.getSlangTermAccess().getEqualsSignKeyword_6_0_0_4());
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:5297:4: ( (lv_argExpr_32_0= ruleExpr ) )
                    // InternalGumboParser.g:5298:5: (lv_argExpr_32_0= ruleExpr )
                    {
                    // InternalGumboParser.g:5298:5: (lv_argExpr_32_0= ruleExpr )
                    // InternalGumboParser.g:5299:6: lv_argExpr_32_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangTermAccess().getArgExprExprParserRuleCall_6_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_84);
                    lv_argExpr_32_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlangTermRule());
                      						}
                      						add(
                      							current,
                      							"argExpr",
                      							lv_argExpr_32_0,
                      							"org.sireum.aadl.gumbo.Gumbo.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:5316:4: (otherlv_33= Semicolon ( (otherlv_34= RULE_ID ) ) otherlv_35= EqualsSign ( (lv_argExpr_36_0= ruleExpr ) ) )*
                    loop101:
                    do {
                        int alt101=2;
                        int LA101_0 = input.LA(1);

                        if ( (LA101_0==Semicolon) ) {
                            alt101=1;
                        }


                        switch (alt101) {
                    	case 1 :
                    	    // InternalGumboParser.g:5317:5: otherlv_33= Semicolon ( (otherlv_34= RULE_ID ) ) otherlv_35= EqualsSign ( (lv_argExpr_36_0= ruleExpr ) )
                    	    {
                    	    otherlv_33=(Token)match(input,Semicolon,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_33, grammarAccess.getSlangTermAccess().getSemicolonKeyword_6_2_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:5321:5: ( (otherlv_34= RULE_ID ) )
                    	    // InternalGumboParser.g:5322:6: (otherlv_34= RULE_ID )
                    	    {
                    	    // InternalGumboParser.g:5322:6: (otherlv_34= RULE_ID )
                    	    // InternalGumboParser.g:5323:7: otherlv_34= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							/* */
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getSlangTermRule());
                    	      							}
                    	      						
                    	    }
                    	    otherlv_34=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_83); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_34, grammarAccess.getSlangTermAccess().getArgsNamedElementCrossReference_6_2_1_0());
                    	      						
                    	    }

                    	    }


                    	    }

                    	    otherlv_35=(Token)match(input,EqualsSign,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_35, grammarAccess.getSlangTermAccess().getEqualsSignKeyword_6_2_2());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:5341:5: ( (lv_argExpr_36_0= ruleExpr ) )
                    	    // InternalGumboParser.g:5342:6: (lv_argExpr_36_0= ruleExpr )
                    	    {
                    	    // InternalGumboParser.g:5342:6: (lv_argExpr_36_0= ruleExpr )
                    	    // InternalGumboParser.g:5343:7: lv_argExpr_36_0= ruleExpr
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSlangTermAccess().getArgExprExprParserRuleCall_6_2_3_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_84);
                    	    lv_argExpr_36_0=ruleExpr();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSlangTermRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"argExpr",
                    	      								lv_argExpr_36_0,
                    	      								"org.sireum.aadl.gumbo.Gumbo.Expr");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop101;
                        }
                    } while (true);

                    otherlv_37=(Token)match(input,RightCurlyBracket,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_37, grammarAccess.getSlangTermAccess().getRightCurlyBracketKeyword_6_3());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalGumboParser.g:5367:3: ( () ( (otherlv_39= RULE_ID ) ) (otherlv_40= FullStop ( (lv_ref_41_0= ruleOtherDataRef ) ) )? ( (lv_cs_42_0= ruleSlangCallSuffix ) )? )
                    {
                    // InternalGumboParser.g:5367:3: ( () ( (otherlv_39= RULE_ID ) ) (otherlv_40= FullStop ( (lv_ref_41_0= ruleOtherDataRef ) ) )? ( (lv_cs_42_0= ruleSlangCallSuffix ) )? )
                    // InternalGumboParser.g:5368:4: () ( (otherlv_39= RULE_ID ) ) (otherlv_40= FullStop ( (lv_ref_41_0= ruleOtherDataRef ) ) )? ( (lv_cs_42_0= ruleSlangCallSuffix ) )?
                    {
                    // InternalGumboParser.g:5368:4: ()
                    // InternalGumboParser.g:5369:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangTermAccess().getDataRefExprAction_7_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:5378:4: ( (otherlv_39= RULE_ID ) )
                    // InternalGumboParser.g:5379:5: (otherlv_39= RULE_ID )
                    {
                    // InternalGumboParser.g:5379:5: (otherlv_39= RULE_ID )
                    // InternalGumboParser.g:5380:6: otherlv_39= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSlangTermRule());
                      						}
                      					
                    }
                    otherlv_39=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_85); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_39, grammarAccess.getSlangTermAccess().getPortOrSubcomponentOrStateVarEObjectCrossReference_7_1_0());
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:5394:4: (otherlv_40= FullStop ( (lv_ref_41_0= ruleOtherDataRef ) ) )?
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==FullStop) ) {
                        alt102=1;
                    }
                    switch (alt102) {
                        case 1 :
                            // InternalGumboParser.g:5395:5: otherlv_40= FullStop ( (lv_ref_41_0= ruleOtherDataRef ) )
                            {
                            otherlv_40=(Token)match(input,FullStop,FollowSets000.FOLLOW_10); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_40, grammarAccess.getSlangTermAccess().getFullStopKeyword_7_2_0());
                              				
                            }
                            // InternalGumboParser.g:5399:5: ( (lv_ref_41_0= ruleOtherDataRef ) )
                            // InternalGumboParser.g:5400:6: (lv_ref_41_0= ruleOtherDataRef )
                            {
                            // InternalGumboParser.g:5400:6: (lv_ref_41_0= ruleOtherDataRef )
                            // InternalGumboParser.g:5401:7: lv_ref_41_0= ruleOtherDataRef
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSlangTermAccess().getRefOtherDataRefParserRuleCall_7_2_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_86);
                            lv_ref_41_0=ruleOtherDataRef();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getSlangTermRule());
                              							}
                              							set(
                              								current,
                              								"ref",
                              								lv_ref_41_0,
                              								"org.sireum.aadl.gumbo.Gumbo.OtherDataRef");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalGumboParser.g:5419:4: ( (lv_cs_42_0= ruleSlangCallSuffix ) )?
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==LeftParenthesis||LA103_0==LeftSquareBracket) ) {
                        alt103=1;
                    }
                    switch (alt103) {
                        case 1 :
                            // InternalGumboParser.g:5420:5: (lv_cs_42_0= ruleSlangCallSuffix )
                            {
                            // InternalGumboParser.g:5420:5: (lv_cs_42_0= ruleSlangCallSuffix )
                            // InternalGumboParser.g:5421:6: lv_cs_42_0= ruleSlangCallSuffix
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getSlangTermAccess().getCsSlangCallSuffixParserRuleCall_7_3_0());
                              					
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_cs_42_0=ruleSlangCallSuffix();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getSlangTermRule());
                              						}
                              						set(
                              							current,
                              							"cs",
                              							lv_cs_42_0,
                              							"org.sireum.aadl.gumbo.Gumbo.SlangCallSuffix");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalGumboParser.g:5440:3: ( () otherlv_44= LeftParenthesis ( (lv_e_45_0= ruleExpr ) ) (otherlv_46= Comma ( (lv_e_47_0= ruleExpr ) ) )* otherlv_48= RightParenthesis )
                    {
                    // InternalGumboParser.g:5440:3: ( () otherlv_44= LeftParenthesis ( (lv_e_45_0= ruleExpr ) ) (otherlv_46= Comma ( (lv_e_47_0= ruleExpr ) ) )* otherlv_48= RightParenthesis )
                    // InternalGumboParser.g:5441:4: () otherlv_44= LeftParenthesis ( (lv_e_45_0= ruleExpr ) ) (otherlv_46= Comma ( (lv_e_47_0= ruleExpr ) ) )* otherlv_48= RightParenthesis
                    {
                    // InternalGumboParser.g:5441:4: ()
                    // InternalGumboParser.g:5442:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangTermAccess().getSlangTupleTermAction_8_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_44=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_44, grammarAccess.getSlangTermAccess().getLeftParenthesisKeyword_8_1());
                      			
                    }
                    // InternalGumboParser.g:5455:4: ( (lv_e_45_0= ruleExpr ) )
                    // InternalGumboParser.g:5456:5: (lv_e_45_0= ruleExpr )
                    {
                    // InternalGumboParser.g:5456:5: (lv_e_45_0= ruleExpr )
                    // InternalGumboParser.g:5457:6: lv_e_45_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangTermAccess().getEExprParserRuleCall_8_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_40);
                    lv_e_45_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlangTermRule());
                      						}
                      						add(
                      							current,
                      							"e",
                      							lv_e_45_0,
                      							"org.sireum.aadl.gumbo.Gumbo.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:5474:4: (otherlv_46= Comma ( (lv_e_47_0= ruleExpr ) ) )*
                    loop104:
                    do {
                        int alt104=2;
                        int LA104_0 = input.LA(1);

                        if ( (LA104_0==Comma) ) {
                            alt104=1;
                        }


                        switch (alt104) {
                    	case 1 :
                    	    // InternalGumboParser.g:5475:5: otherlv_46= Comma ( (lv_e_47_0= ruleExpr ) )
                    	    {
                    	    otherlv_46=(Token)match(input,Comma,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_46, grammarAccess.getSlangTermAccess().getCommaKeyword_8_3_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:5479:5: ( (lv_e_47_0= ruleExpr ) )
                    	    // InternalGumboParser.g:5480:6: (lv_e_47_0= ruleExpr )
                    	    {
                    	    // InternalGumboParser.g:5480:6: (lv_e_47_0= ruleExpr )
                    	    // InternalGumboParser.g:5481:7: lv_e_47_0= ruleExpr
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSlangTermAccess().getEExprParserRuleCall_8_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_40);
                    	    lv_e_47_0=ruleExpr();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSlangTermRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"e",
                    	      								lv_e_47_0,
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

                    otherlv_48=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_48, grammarAccess.getSlangTermAccess().getRightParenthesisKeyword_8_4());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalGumboParser.g:5505:3: ( () otherlv_50= For ( (lv_r_51_0= ruleSlangForRange ) ) (otherlv_52= Comma ( (lv_r_53_0= ruleSlangForRange ) ) )* otherlv_54= Yield ( ( (lv_b_55_0= ruleSlangBlock ) ) | (otherlv_56= LeftParenthesis ( (lv_e_57_0= ruleExpr ) ) otherlv_58= RightParenthesis ) ) )
                    {
                    // InternalGumboParser.g:5505:3: ( () otherlv_50= For ( (lv_r_51_0= ruleSlangForRange ) ) (otherlv_52= Comma ( (lv_r_53_0= ruleSlangForRange ) ) )* otherlv_54= Yield ( ( (lv_b_55_0= ruleSlangBlock ) ) | (otherlv_56= LeftParenthesis ( (lv_e_57_0= ruleExpr ) ) otherlv_58= RightParenthesis ) ) )
                    // InternalGumboParser.g:5506:4: () otherlv_50= For ( (lv_r_51_0= ruleSlangForRange ) ) (otherlv_52= Comma ( (lv_r_53_0= ruleSlangForRange ) ) )* otherlv_54= Yield ( ( (lv_b_55_0= ruleSlangBlock ) ) | (otherlv_56= LeftParenthesis ( (lv_e_57_0= ruleExpr ) ) otherlv_58= RightParenthesis ) )
                    {
                    // InternalGumboParser.g:5506:4: ()
                    // InternalGumboParser.g:5507:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangTermAccess().getSlangForTermAction_9_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_50=(Token)match(input,For,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_50, grammarAccess.getSlangTermAccess().getForKeyword_9_1());
                      			
                    }
                    // InternalGumboParser.g:5520:4: ( (lv_r_51_0= ruleSlangForRange ) )
                    // InternalGumboParser.g:5521:5: (lv_r_51_0= ruleSlangForRange )
                    {
                    // InternalGumboParser.g:5521:5: (lv_r_51_0= ruleSlangForRange )
                    // InternalGumboParser.g:5522:6: lv_r_51_0= ruleSlangForRange
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangTermAccess().getRSlangForRangeParserRuleCall_9_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_87);
                    lv_r_51_0=ruleSlangForRange();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlangTermRule());
                      						}
                      						add(
                      							current,
                      							"r",
                      							lv_r_51_0,
                      							"org.sireum.aadl.gumbo.Gumbo.SlangForRange");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:5539:4: (otherlv_52= Comma ( (lv_r_53_0= ruleSlangForRange ) ) )*
                    loop105:
                    do {
                        int alt105=2;
                        int LA105_0 = input.LA(1);

                        if ( (LA105_0==Comma) ) {
                            alt105=1;
                        }


                        switch (alt105) {
                    	case 1 :
                    	    // InternalGumboParser.g:5540:5: otherlv_52= Comma ( (lv_r_53_0= ruleSlangForRange ) )
                    	    {
                    	    otherlv_52=(Token)match(input,Comma,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_52, grammarAccess.getSlangTermAccess().getCommaKeyword_9_3_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:5544:5: ( (lv_r_53_0= ruleSlangForRange ) )
                    	    // InternalGumboParser.g:5545:6: (lv_r_53_0= ruleSlangForRange )
                    	    {
                    	    // InternalGumboParser.g:5545:6: (lv_r_53_0= ruleSlangForRange )
                    	    // InternalGumboParser.g:5546:7: lv_r_53_0= ruleSlangForRange
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSlangTermAccess().getRSlangForRangeParserRuleCall_9_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_87);
                    	    lv_r_53_0=ruleSlangForRange();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSlangTermRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"r",
                    	      								lv_r_53_0,
                    	      								"org.sireum.aadl.gumbo.Gumbo.SlangForRange");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop105;
                        }
                    } while (true);

                    otherlv_54=(Token)match(input,Yield,FollowSets000.FOLLOW_88); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_54, grammarAccess.getSlangTermAccess().getYieldKeyword_9_4());
                      			
                    }
                    // InternalGumboParser.g:5568:4: ( ( (lv_b_55_0= ruleSlangBlock ) ) | (otherlv_56= LeftParenthesis ( (lv_e_57_0= ruleExpr ) ) otherlv_58= RightParenthesis ) )
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==LeftCurlyBracket) ) {
                        alt106=1;
                    }
                    else if ( (LA106_0==LeftParenthesis) ) {
                        alt106=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 106, 0, input);

                        throw nvae;
                    }
                    switch (alt106) {
                        case 1 :
                            // InternalGumboParser.g:5569:5: ( (lv_b_55_0= ruleSlangBlock ) )
                            {
                            // InternalGumboParser.g:5569:5: ( (lv_b_55_0= ruleSlangBlock ) )
                            // InternalGumboParser.g:5570:6: (lv_b_55_0= ruleSlangBlock )
                            {
                            // InternalGumboParser.g:5570:6: (lv_b_55_0= ruleSlangBlock )
                            // InternalGumboParser.g:5571:7: lv_b_55_0= ruleSlangBlock
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSlangTermAccess().getBSlangBlockParserRuleCall_9_5_0_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_b_55_0=ruleSlangBlock();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getSlangTermRule());
                              							}
                              							set(
                              								current,
                              								"b",
                              								lv_b_55_0,
                              								"org.sireum.aadl.gumbo.Gumbo.SlangBlock");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalGumboParser.g:5589:5: (otherlv_56= LeftParenthesis ( (lv_e_57_0= ruleExpr ) ) otherlv_58= RightParenthesis )
                            {
                            // InternalGumboParser.g:5589:5: (otherlv_56= LeftParenthesis ( (lv_e_57_0= ruleExpr ) ) otherlv_58= RightParenthesis )
                            // InternalGumboParser.g:5590:6: otherlv_56= LeftParenthesis ( (lv_e_57_0= ruleExpr ) ) otherlv_58= RightParenthesis
                            {
                            otherlv_56=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_17); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_56, grammarAccess.getSlangTermAccess().getLeftParenthesisKeyword_9_5_1_0());
                              					
                            }
                            // InternalGumboParser.g:5594:6: ( (lv_e_57_0= ruleExpr ) )
                            // InternalGumboParser.g:5595:7: (lv_e_57_0= ruleExpr )
                            {
                            // InternalGumboParser.g:5595:7: (lv_e_57_0= ruleExpr )
                            // InternalGumboParser.g:5596:8: lv_e_57_0= ruleExpr
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getSlangTermAccess().getEExprParserRuleCall_9_5_1_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_39);
                            lv_e_57_0=ruleExpr();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getSlangTermRule());
                              								}
                              								set(
                              									current,
                              									"e",
                              									lv_e_57_0,
                              									"org.sireum.aadl.gumbo.Gumbo.Expr");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            otherlv_58=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_58, grammarAccess.getSlangTermAccess().getRightParenthesisKeyword_9_5_1_2());
                              					
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 11 :
                    // InternalGumboParser.g:5621:3: ( () otherlv_60= LeftCurlyBracket ( ( ( ( (lv_p_61_0= ruleSlangParams ) ) otherlv_62= EqualsSignGreaterThanSign )? ( (lv_e_63_0= ruleExpr ) ) otherlv_64= RightCurlyBracket ) | ( ( (lv_stmt_65_0= ruleSlangStmt ) )* ( (lv_r_66_0= ruleSlangRet ) )? otherlv_67= RightCurlyBracket ) ) )
                    {
                    // InternalGumboParser.g:5621:3: ( () otherlv_60= LeftCurlyBracket ( ( ( ( (lv_p_61_0= ruleSlangParams ) ) otherlv_62= EqualsSignGreaterThanSign )? ( (lv_e_63_0= ruleExpr ) ) otherlv_64= RightCurlyBracket ) | ( ( (lv_stmt_65_0= ruleSlangStmt ) )* ( (lv_r_66_0= ruleSlangRet ) )? otherlv_67= RightCurlyBracket ) ) )
                    // InternalGumboParser.g:5622:4: () otherlv_60= LeftCurlyBracket ( ( ( ( (lv_p_61_0= ruleSlangParams ) ) otherlv_62= EqualsSignGreaterThanSign )? ( (lv_e_63_0= ruleExpr ) ) otherlv_64= RightCurlyBracket ) | ( ( (lv_stmt_65_0= ruleSlangStmt ) )* ( (lv_r_66_0= ruleSlangRet ) )? otherlv_67= RightCurlyBracket ) )
                    {
                    // InternalGumboParser.g:5622:4: ()
                    // InternalGumboParser.g:5623:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangTermAccess().getSlangBlockTermAction_10_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_60=(Token)match(input,LeftCurlyBracket,FollowSets000.FOLLOW_89); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_60, grammarAccess.getSlangTermAccess().getLeftCurlyBracketKeyword_10_1());
                      			
                    }
                    // InternalGumboParser.g:5636:4: ( ( ( ( (lv_p_61_0= ruleSlangParams ) ) otherlv_62= EqualsSignGreaterThanSign )? ( (lv_e_63_0= ruleExpr ) ) otherlv_64= RightCurlyBracket ) | ( ( (lv_stmt_65_0= ruleSlangStmt ) )* ( (lv_r_66_0= ruleSlangRet ) )? otherlv_67= RightCurlyBracket ) )
                    int alt110=2;
                    alt110 = dfa110.predict(input);
                    switch (alt110) {
                        case 1 :
                            // InternalGumboParser.g:5637:5: ( ( ( (lv_p_61_0= ruleSlangParams ) ) otherlv_62= EqualsSignGreaterThanSign )? ( (lv_e_63_0= ruleExpr ) ) otherlv_64= RightCurlyBracket )
                            {
                            // InternalGumboParser.g:5637:5: ( ( ( (lv_p_61_0= ruleSlangParams ) ) otherlv_62= EqualsSignGreaterThanSign )? ( (lv_e_63_0= ruleExpr ) ) otherlv_64= RightCurlyBracket )
                            // InternalGumboParser.g:5638:6: ( ( (lv_p_61_0= ruleSlangParams ) ) otherlv_62= EqualsSignGreaterThanSign )? ( (lv_e_63_0= ruleExpr ) ) otherlv_64= RightCurlyBracket
                            {
                            // InternalGumboParser.g:5638:6: ( ( (lv_p_61_0= ruleSlangParams ) ) otherlv_62= EqualsSignGreaterThanSign )?
                            int alt107=2;
                            int LA107_0 = input.LA(1);

                            if ( (LA107_0==LeftParenthesis) ) {
                                int LA107_1 = input.LA(2);

                                if ( (LA107_1==Var) ) {
                                    alt107=1;
                                }
                                else if ( (LA107_1==RULE_ID) ) {
                                    int LA107_4 = input.LA(3);

                                    if ( (LA107_4==Colon) ) {
                                        alt107=1;
                                    }
                                }
                            }
                            switch (alt107) {
                                case 1 :
                                    // InternalGumboParser.g:5639:7: ( (lv_p_61_0= ruleSlangParams ) ) otherlv_62= EqualsSignGreaterThanSign
                                    {
                                    // InternalGumboParser.g:5639:7: ( (lv_p_61_0= ruleSlangParams ) )
                                    // InternalGumboParser.g:5640:8: (lv_p_61_0= ruleSlangParams )
                                    {
                                    // InternalGumboParser.g:5640:8: (lv_p_61_0= ruleSlangParams )
                                    // InternalGumboParser.g:5641:9: lv_p_61_0= ruleSlangParams
                                    {
                                    if ( state.backtracking==0 ) {

                                      									newCompositeNode(grammarAccess.getSlangTermAccess().getPSlangParamsParserRuleCall_10_2_0_0_0_0());
                                      								
                                    }
                                    pushFollow(FollowSets000.FOLLOW_66);
                                    lv_p_61_0=ruleSlangParams();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElementForParent(grammarAccess.getSlangTermRule());
                                      									}
                                      									set(
                                      										current,
                                      										"p",
                                      										lv_p_61_0,
                                      										"org.sireum.aadl.gumbo.Gumbo.SlangParams");
                                      									afterParserOrEnumRuleCall();
                                      								
                                    }

                                    }


                                    }

                                    otherlv_62=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_17); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(otherlv_62, grammarAccess.getSlangTermAccess().getEqualsSignGreaterThanSignKeyword_10_2_0_0_1());
                                      						
                                    }

                                    }
                                    break;

                            }

                            // InternalGumboParser.g:5663:6: ( (lv_e_63_0= ruleExpr ) )
                            // InternalGumboParser.g:5664:7: (lv_e_63_0= ruleExpr )
                            {
                            // InternalGumboParser.g:5664:7: (lv_e_63_0= ruleExpr )
                            // InternalGumboParser.g:5665:8: lv_e_63_0= ruleExpr
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getSlangTermAccess().getEExprParserRuleCall_10_2_0_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_79);
                            lv_e_63_0=ruleExpr();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getSlangTermRule());
                              								}
                              								set(
                              									current,
                              									"e",
                              									lv_e_63_0,
                              									"org.sireum.aadl.gumbo.Gumbo.Expr");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            otherlv_64=(Token)match(input,RightCurlyBracket,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_64, grammarAccess.getSlangTermAccess().getRightCurlyBracketKeyword_10_2_0_2());
                              					
                            }

                            }


                            }
                            break;
                        case 2 :
                            // InternalGumboParser.g:5688:5: ( ( (lv_stmt_65_0= ruleSlangStmt ) )* ( (lv_r_66_0= ruleSlangRet ) )? otherlv_67= RightCurlyBracket )
                            {
                            // InternalGumboParser.g:5688:5: ( ( (lv_stmt_65_0= ruleSlangStmt ) )* ( (lv_r_66_0= ruleSlangRet ) )? otherlv_67= RightCurlyBracket )
                            // InternalGumboParser.g:5689:6: ( (lv_stmt_65_0= ruleSlangStmt ) )* ( (lv_r_66_0= ruleSlangRet ) )? otherlv_67= RightCurlyBracket
                            {
                            // InternalGumboParser.g:5689:6: ( (lv_stmt_65_0= ruleSlangStmt ) )*
                            loop108:
                            do {
                                int alt108=2;
                                int LA108_0 = input.LA(1);

                                if ( ((LA108_0>=Assert && LA108_0<=Assume)||LA108_0==Match||LA108_0==While||(LA108_0>=Halt && LA108_0<=Spec)||(LA108_0>=Val && LA108_0<=Var)||(LA108_0>=Do && LA108_0<=If)||LA108_0==RULE_ID) ) {
                                    alt108=1;
                                }


                                switch (alt108) {
                            	case 1 :
                            	    // InternalGumboParser.g:5690:7: (lv_stmt_65_0= ruleSlangStmt )
                            	    {
                            	    // InternalGumboParser.g:5690:7: (lv_stmt_65_0= ruleSlangStmt )
                            	    // InternalGumboParser.g:5691:8: lv_stmt_65_0= ruleSlangStmt
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getSlangTermAccess().getStmtSlangStmtParserRuleCall_10_2_1_0_0());
                            	      							
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_78);
                            	    lv_stmt_65_0=ruleSlangStmt();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getSlangTermRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"stmt",
                            	      									lv_stmt_65_0,
                            	      									"org.sireum.aadl.gumbo.Gumbo.SlangStmt");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop108;
                                }
                            } while (true);

                            // InternalGumboParser.g:5708:6: ( (lv_r_66_0= ruleSlangRet ) )?
                            int alt109=2;
                            int LA109_0 = input.LA(1);

                            if ( (LA109_0==Return) ) {
                                alt109=1;
                            }
                            switch (alt109) {
                                case 1 :
                                    // InternalGumboParser.g:5709:7: (lv_r_66_0= ruleSlangRet )
                                    {
                                    // InternalGumboParser.g:5709:7: (lv_r_66_0= ruleSlangRet )
                                    // InternalGumboParser.g:5710:8: lv_r_66_0= ruleSlangRet
                                    {
                                    if ( state.backtracking==0 ) {

                                      								newCompositeNode(grammarAccess.getSlangTermAccess().getRSlangRetParserRuleCall_10_2_1_1_0());
                                      							
                                    }
                                    pushFollow(FollowSets000.FOLLOW_79);
                                    lv_r_66_0=ruleSlangRet();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								if (current==null) {
                                      									current = createModelElementForParent(grammarAccess.getSlangTermRule());
                                      								}
                                      								set(
                                      									current,
                                      									"r",
                                      									lv_r_66_0,
                                      									"org.sireum.aadl.gumbo.Gumbo.SlangRet");
                                      								afterParserOrEnumRuleCall();
                                      							
                                    }

                                    }


                                    }
                                    break;

                            }

                            otherlv_67=(Token)match(input,RightCurlyBracket,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_67, grammarAccess.getSlangTermAccess().getRightCurlyBracketKeyword_10_2_1_2());
                              					
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
    // InternalGumboParser.g:5738:1: entryRuleSlangParams returns [EObject current=null] : iv_ruleSlangParams= ruleSlangParams EOF ;
    public final EObject entryRuleSlangParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangParams = null;


        try {
            // InternalGumboParser.g:5738:52: (iv_ruleSlangParams= ruleSlangParams EOF )
            // InternalGumboParser.g:5739:2: iv_ruleSlangParams= ruleSlangParams EOF
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
    // InternalGumboParser.g:5745:1: ruleSlangParams returns [EObject current=null] : (otherlv_0= LeftParenthesis ( (lv_params_1_0= ruleSlangParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangParam ) ) )? otherlv_4= RightParenthesis ) ;
    public final EObject ruleSlangParams() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_params_1_0 = null;

        EObject lv_params_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:5751:2: ( (otherlv_0= LeftParenthesis ( (lv_params_1_0= ruleSlangParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangParam ) ) )? otherlv_4= RightParenthesis ) )
            // InternalGumboParser.g:5752:2: (otherlv_0= LeftParenthesis ( (lv_params_1_0= ruleSlangParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangParam ) ) )? otherlv_4= RightParenthesis )
            {
            // InternalGumboParser.g:5752:2: (otherlv_0= LeftParenthesis ( (lv_params_1_0= ruleSlangParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangParam ) ) )? otherlv_4= RightParenthesis )
            // InternalGumboParser.g:5753:3: otherlv_0= LeftParenthesis ( (lv_params_1_0= ruleSlangParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangParam ) ) )? otherlv_4= RightParenthesis
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_90); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangParamsAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalGumboParser.g:5757:3: ( (lv_params_1_0= ruleSlangParam ) )
            // InternalGumboParser.g:5758:4: (lv_params_1_0= ruleSlangParam )
            {
            // InternalGumboParser.g:5758:4: (lv_params_1_0= ruleSlangParam )
            // InternalGumboParser.g:5759:5: lv_params_1_0= ruleSlangParam
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangParamsAccess().getParamsSlangParamParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_40);
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

            // InternalGumboParser.g:5776:3: (otherlv_2= Comma ( (lv_params_3_0= ruleSlangParam ) ) )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==Comma) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // InternalGumboParser.g:5777:4: otherlv_2= Comma ( (lv_params_3_0= ruleSlangParam ) )
                    {
                    otherlv_2=(Token)match(input,Comma,FollowSets000.FOLLOW_90); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSlangParamsAccess().getCommaKeyword_2_0());
                      			
                    }
                    // InternalGumboParser.g:5781:4: ( (lv_params_3_0= ruleSlangParam ) )
                    // InternalGumboParser.g:5782:5: (lv_params_3_0= ruleSlangParam )
                    {
                    // InternalGumboParser.g:5782:5: (lv_params_3_0= ruleSlangParam )
                    // InternalGumboParser.g:5783:6: lv_params_3_0= ruleSlangParam
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
    // InternalGumboParser.g:5809:1: entryRuleSlangParam returns [EObject current=null] : iv_ruleSlangParam= ruleSlangParam EOF ;
    public final EObject entryRuleSlangParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangParam = null;


        try {
            // InternalGumboParser.g:5809:51: (iv_ruleSlangParam= ruleSlangParam EOF )
            // InternalGumboParser.g:5810:2: iv_ruleSlangParam= ruleSlangParam EOF
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
    // InternalGumboParser.g:5816:1: ruleSlangParam returns [EObject current=null] : ( (otherlv_0= Var )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon (otherlv_3= EqualsSignGreaterThanSign )? ( (lv_typeName_4_0= ruleSlangType ) ) (otherlv_5= Asterisk )? ) ;
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
            // InternalGumboParser.g:5822:2: ( ( (otherlv_0= Var )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon (otherlv_3= EqualsSignGreaterThanSign )? ( (lv_typeName_4_0= ruleSlangType ) ) (otherlv_5= Asterisk )? ) )
            // InternalGumboParser.g:5823:2: ( (otherlv_0= Var )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon (otherlv_3= EqualsSignGreaterThanSign )? ( (lv_typeName_4_0= ruleSlangType ) ) (otherlv_5= Asterisk )? )
            {
            // InternalGumboParser.g:5823:2: ( (otherlv_0= Var )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon (otherlv_3= EqualsSignGreaterThanSign )? ( (lv_typeName_4_0= ruleSlangType ) ) (otherlv_5= Asterisk )? )
            // InternalGumboParser.g:5824:3: (otherlv_0= Var )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon (otherlv_3= EqualsSignGreaterThanSign )? ( (lv_typeName_4_0= ruleSlangType ) ) (otherlv_5= Asterisk )?
            {
            // InternalGumboParser.g:5824:3: (otherlv_0= Var )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==Var) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // InternalGumboParser.g:5825:4: otherlv_0= Var
                    {
                    otherlv_0=(Token)match(input,Var,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getSlangParamAccess().getVarKeyword_0());
                      			
                    }

                    }
                    break;

            }

            // InternalGumboParser.g:5830:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGumboParser.g:5831:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGumboParser.g:5831:4: (lv_name_1_0= RULE_ID )
            // InternalGumboParser.g:5832:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_12); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,Colon,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSlangParamAccess().getColonKeyword_2());
              		
            }
            // InternalGumboParser.g:5852:3: (otherlv_3= EqualsSignGreaterThanSign )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==EqualsSignGreaterThanSign) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalGumboParser.g:5853:4: otherlv_3= EqualsSignGreaterThanSign
                    {
                    otherlv_3=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getSlangParamAccess().getEqualsSignGreaterThanSignKeyword_3());
                      			
                    }

                    }
                    break;

            }

            // InternalGumboParser.g:5858:3: ( (lv_typeName_4_0= ruleSlangType ) )
            // InternalGumboParser.g:5859:4: (lv_typeName_4_0= ruleSlangType )
            {
            // InternalGumboParser.g:5859:4: (lv_typeName_4_0= ruleSlangType )
            // InternalGumboParser.g:5860:5: lv_typeName_4_0= ruleSlangType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangParamAccess().getTypeNameSlangTypeParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_42);
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

            // InternalGumboParser.g:5877:3: (otherlv_5= Asterisk )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==Asterisk) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // InternalGumboParser.g:5878:4: otherlv_5= Asterisk
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
    // InternalGumboParser.g:5887:1: entryRuleSlangForRange returns [EObject current=null] : iv_ruleSlangForRange= ruleSlangForRange EOF ;
    public final EObject entryRuleSlangForRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangForRange = null;


        try {
            // InternalGumboParser.g:5887:54: (iv_ruleSlangForRange= ruleSlangForRange EOF )
            // InternalGumboParser.g:5888:2: iv_ruleSlangForRange= ruleSlangForRange EOF
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
    // InternalGumboParser.g:5894:1: ruleSlangForRange returns [EObject current=null] : (this_ID_0= RULE_ID otherlv_1= Colon ( (lv_e_2_0= ruleExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upper_5_0= ruleExpr ) ) (otherlv_6= By ( (lv_step_7_0= ruleExpr ) ) )? )? ) ;
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
            // InternalGumboParser.g:5900:2: ( (this_ID_0= RULE_ID otherlv_1= Colon ( (lv_e_2_0= ruleExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upper_5_0= ruleExpr ) ) (otherlv_6= By ( (lv_step_7_0= ruleExpr ) ) )? )? ) )
            // InternalGumboParser.g:5901:2: (this_ID_0= RULE_ID otherlv_1= Colon ( (lv_e_2_0= ruleExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upper_5_0= ruleExpr ) ) (otherlv_6= By ( (lv_step_7_0= ruleExpr ) ) )? )? )
            {
            // InternalGumboParser.g:5901:2: (this_ID_0= RULE_ID otherlv_1= Colon ( (lv_e_2_0= ruleExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upper_5_0= ruleExpr ) ) (otherlv_6= By ( (lv_step_7_0= ruleExpr ) ) )? )? )
            // InternalGumboParser.g:5902:3: this_ID_0= RULE_ID otherlv_1= Colon ( (lv_e_2_0= ruleExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upper_5_0= ruleExpr ) ) (otherlv_6= By ( (lv_step_7_0= ruleExpr ) ) )? )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getSlangForRangeAccess().getIDTerminalRuleCall_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSlangForRangeAccess().getColonKeyword_1());
              		
            }
            // InternalGumboParser.g:5910:3: ( (lv_e_2_0= ruleExpr ) )
            // InternalGumboParser.g:5911:4: (lv_e_2_0= ruleExpr )
            {
            // InternalGumboParser.g:5911:4: (lv_e_2_0= ruleExpr )
            // InternalGumboParser.g:5912:5: lv_e_2_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangForRangeAccess().getEExprParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_77);
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

            // InternalGumboParser.g:5929:3: ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upper_5_0= ruleExpr ) ) (otherlv_6= By ( (lv_step_7_0= ruleExpr ) ) )? )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==FullStopFullStopLessThanSign||LA118_0==FullStopFullStop) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // InternalGumboParser.g:5930:4: (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upper_5_0= ruleExpr ) ) (otherlv_6= By ( (lv_step_7_0= ruleExpr ) ) )?
                    {
                    // InternalGumboParser.g:5930:4: (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign )
                    int alt116=2;
                    int LA116_0 = input.LA(1);

                    if ( (LA116_0==FullStopFullStop) ) {
                        alt116=1;
                    }
                    else if ( (LA116_0==FullStopFullStopLessThanSign) ) {
                        alt116=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 116, 0, input);

                        throw nvae;
                    }
                    switch (alt116) {
                        case 1 :
                            // InternalGumboParser.g:5931:5: otherlv_3= FullStopFullStop
                            {
                            otherlv_3=(Token)match(input,FullStopFullStop,FollowSets000.FOLLOW_17); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_3, grammarAccess.getSlangForRangeAccess().getFullStopFullStopKeyword_3_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalGumboParser.g:5936:5: otherlv_4= FullStopFullStopLessThanSign
                            {
                            otherlv_4=(Token)match(input,FullStopFullStopLessThanSign,FollowSets000.FOLLOW_17); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getSlangForRangeAccess().getFullStopFullStopLessThanSignKeyword_3_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalGumboParser.g:5941:4: ( (lv_upper_5_0= ruleExpr ) )
                    // InternalGumboParser.g:5942:5: (lv_upper_5_0= ruleExpr )
                    {
                    // InternalGumboParser.g:5942:5: (lv_upper_5_0= ruleExpr )
                    // InternalGumboParser.g:5943:6: lv_upper_5_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangForRangeAccess().getUpperExprParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_91);
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

                    // InternalGumboParser.g:5960:4: (otherlv_6= By ( (lv_step_7_0= ruleExpr ) ) )?
                    int alt117=2;
                    int LA117_0 = input.LA(1);

                    if ( (LA117_0==By) ) {
                        alt117=1;
                    }
                    switch (alt117) {
                        case 1 :
                            // InternalGumboParser.g:5961:5: otherlv_6= By ( (lv_step_7_0= ruleExpr ) )
                            {
                            otherlv_6=(Token)match(input,By,FollowSets000.FOLLOW_17); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_6, grammarAccess.getSlangForRangeAccess().getByKeyword_3_2_0());
                              				
                            }
                            // InternalGumboParser.g:5965:5: ( (lv_step_7_0= ruleExpr ) )
                            // InternalGumboParser.g:5966:6: (lv_step_7_0= ruleExpr )
                            {
                            // InternalGumboParser.g:5966:6: (lv_step_7_0= ruleExpr )
                            // InternalGumboParser.g:5967:7: lv_step_7_0= ruleExpr
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
    // InternalGumboParser.g:5990:1: entryRuleSlangRet returns [EObject current=null] : iv_ruleSlangRet= ruleSlangRet EOF ;
    public final EObject entryRuleSlangRet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangRet = null;


        try {
            // InternalGumboParser.g:5990:49: (iv_ruleSlangRet= ruleSlangRet EOF )
            // InternalGumboParser.g:5991:2: iv_ruleSlangRet= ruleSlangRet EOF
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
    // InternalGumboParser.g:5997:1: ruleSlangRet returns [EObject current=null] : ( () otherlv_1= Return ( (lv_e_2_0= ruleExpr ) )? ) ;
    public final EObject ruleSlangRet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_e_2_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:6003:2: ( ( () otherlv_1= Return ( (lv_e_2_0= ruleExpr ) )? ) )
            // InternalGumboParser.g:6004:2: ( () otherlv_1= Return ( (lv_e_2_0= ruleExpr ) )? )
            {
            // InternalGumboParser.g:6004:2: ( () otherlv_1= Return ( (lv_e_2_0= ruleExpr ) )? )
            // InternalGumboParser.g:6005:3: () otherlv_1= Return ( (lv_e_2_0= ruleExpr ) )?
            {
            // InternalGumboParser.g:6005:3: ()
            // InternalGumboParser.g:6006:4: 
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
            // InternalGumboParser.g:6019:3: ( (lv_e_2_0= ruleExpr ) )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==MustSend||LA119_0==MaySend||LA119_0==Some||LA119_0==All||LA119_0==For||LA119_0==In_1||LA119_0==LeftParenthesis||(LA119_0>=Asterisk && LA119_0<=PlusSign)||LA119_0==HyphenMinus||(LA119_0>=F && LA119_0<=T)||LA119_0==LeftCurlyBracket||(LA119_0>=ForAll && LA119_0<=ThereExists)||(LA119_0>=RULE_SLANG_STRING && LA119_0<=RULE_MSTRING)||LA119_0==RULE_MSP||(LA119_0>=RULE_SLI && LA119_0<=RULE_MSPB)||LA119_0==RULE_OP||(LA119_0>=RULE_HEX && LA119_0<=RULE_REAL_IDF)||LA119_0==RULE_ID) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // InternalGumboParser.g:6020:4: (lv_e_2_0= ruleExpr )
                    {
                    // InternalGumboParser.g:6020:4: (lv_e_2_0= ruleExpr )
                    // InternalGumboParser.g:6021:5: lv_e_2_0= ruleExpr
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
    // InternalGumboParser.g:6042:1: entryRuleSlangCallSuffix returns [EObject current=null] : iv_ruleSlangCallSuffix= ruleSlangCallSuffix EOF ;
    public final EObject entryRuleSlangCallSuffix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangCallSuffix = null;


        try {
            // InternalGumboParser.g:6042:56: (iv_ruleSlangCallSuffix= ruleSlangCallSuffix EOF )
            // InternalGumboParser.g:6043:2: iv_ruleSlangCallSuffix= ruleSlangCallSuffix EOF
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
    // InternalGumboParser.g:6049:1: ruleSlangCallSuffix returns [EObject current=null] : ( ( () ( (lv_ta_1_0= ruleSlangTypeArgs ) ) ( (lv_ca_2_0= ruleSlangCallArgs ) )? ) | ( (lv_ca_3_0= ruleSlangCallArgs ) ) ) ;
    public final EObject ruleSlangCallSuffix() throws RecognitionException {
        EObject current = null;

        EObject lv_ta_1_0 = null;

        EObject lv_ca_2_0 = null;

        EObject lv_ca_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:6055:2: ( ( ( () ( (lv_ta_1_0= ruleSlangTypeArgs ) ) ( (lv_ca_2_0= ruleSlangCallArgs ) )? ) | ( (lv_ca_3_0= ruleSlangCallArgs ) ) ) )
            // InternalGumboParser.g:6056:2: ( ( () ( (lv_ta_1_0= ruleSlangTypeArgs ) ) ( (lv_ca_2_0= ruleSlangCallArgs ) )? ) | ( (lv_ca_3_0= ruleSlangCallArgs ) ) )
            {
            // InternalGumboParser.g:6056:2: ( ( () ( (lv_ta_1_0= ruleSlangTypeArgs ) ) ( (lv_ca_2_0= ruleSlangCallArgs ) )? ) | ( (lv_ca_3_0= ruleSlangCallArgs ) ) )
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==LeftSquareBracket) ) {
                alt121=1;
            }
            else if ( (LA121_0==LeftParenthesis) ) {
                alt121=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 121, 0, input);

                throw nvae;
            }
            switch (alt121) {
                case 1 :
                    // InternalGumboParser.g:6057:3: ( () ( (lv_ta_1_0= ruleSlangTypeArgs ) ) ( (lv_ca_2_0= ruleSlangCallArgs ) )? )
                    {
                    // InternalGumboParser.g:6057:3: ( () ( (lv_ta_1_0= ruleSlangTypeArgs ) ) ( (lv_ca_2_0= ruleSlangCallArgs ) )? )
                    // InternalGumboParser.g:6058:4: () ( (lv_ta_1_0= ruleSlangTypeArgs ) ) ( (lv_ca_2_0= ruleSlangCallArgs ) )?
                    {
                    // InternalGumboParser.g:6058:4: ()
                    // InternalGumboParser.g:6059:5: 
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

                    // InternalGumboParser.g:6068:4: ( (lv_ta_1_0= ruleSlangTypeArgs ) )
                    // InternalGumboParser.g:6069:5: (lv_ta_1_0= ruleSlangTypeArgs )
                    {
                    // InternalGumboParser.g:6069:5: (lv_ta_1_0= ruleSlangTypeArgs )
                    // InternalGumboParser.g:6070:6: lv_ta_1_0= ruleSlangTypeArgs
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangCallSuffixAccess().getTaSlangTypeArgsParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_86);
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

                    // InternalGumboParser.g:6087:4: ( (lv_ca_2_0= ruleSlangCallArgs ) )?
                    int alt120=2;
                    int LA120_0 = input.LA(1);

                    if ( (LA120_0==LeftParenthesis) ) {
                        alt120=1;
                    }
                    switch (alt120) {
                        case 1 :
                            // InternalGumboParser.g:6088:5: (lv_ca_2_0= ruleSlangCallArgs )
                            {
                            // InternalGumboParser.g:6088:5: (lv_ca_2_0= ruleSlangCallArgs )
                            // InternalGumboParser.g:6089:6: lv_ca_2_0= ruleSlangCallArgs
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
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:6108:3: ( (lv_ca_3_0= ruleSlangCallArgs ) )
                    {
                    // InternalGumboParser.g:6108:3: ( (lv_ca_3_0= ruleSlangCallArgs ) )
                    // InternalGumboParser.g:6109:4: (lv_ca_3_0= ruleSlangCallArgs )
                    {
                    // InternalGumboParser.g:6109:4: (lv_ca_3_0= ruleSlangCallArgs )
                    // InternalGumboParser.g:6110:5: lv_ca_3_0= ruleSlangCallArgs
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
    // InternalGumboParser.g:6131:1: entryRuleSlangCallArgs returns [EObject current=null] : iv_ruleSlangCallArgs= ruleSlangCallArgs EOF ;
    public final EObject entryRuleSlangCallArgs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangCallArgs = null;


        try {
            // InternalGumboParser.g:6131:54: (iv_ruleSlangCallArgs= ruleSlangCallArgs EOF )
            // InternalGumboParser.g:6132:2: iv_ruleSlangCallArgs= ruleSlangCallArgs EOF
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
    // InternalGumboParser.g:6138:1: ruleSlangCallArgs returns [EObject current=null] : ( () otherlv_1= LeftParenthesis ( ( (lv_arg_2_0= ruleSlangIDExp ) ) (otherlv_3= Comma ( (lv_arg_4_0= ruleSlangIDExp ) ) )* )? otherlv_5= RightParenthesis ) ;
    public final EObject ruleSlangCallArgs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arg_2_0 = null;

        EObject lv_arg_4_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:6144:2: ( ( () otherlv_1= LeftParenthesis ( ( (lv_arg_2_0= ruleSlangIDExp ) ) (otherlv_3= Comma ( (lv_arg_4_0= ruleSlangIDExp ) ) )* )? otherlv_5= RightParenthesis ) )
            // InternalGumboParser.g:6145:2: ( () otherlv_1= LeftParenthesis ( ( (lv_arg_2_0= ruleSlangIDExp ) ) (otherlv_3= Comma ( (lv_arg_4_0= ruleSlangIDExp ) ) )* )? otherlv_5= RightParenthesis )
            {
            // InternalGumboParser.g:6145:2: ( () otherlv_1= LeftParenthesis ( ( (lv_arg_2_0= ruleSlangIDExp ) ) (otherlv_3= Comma ( (lv_arg_4_0= ruleSlangIDExp ) ) )* )? otherlv_5= RightParenthesis )
            // InternalGumboParser.g:6146:3: () otherlv_1= LeftParenthesis ( ( (lv_arg_2_0= ruleSlangIDExp ) ) (otherlv_3= Comma ( (lv_arg_4_0= ruleSlangIDExp ) ) )* )? otherlv_5= RightParenthesis
            {
            // InternalGumboParser.g:6146:3: ()
            // InternalGumboParser.g:6147:4: 
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

            otherlv_1=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_63); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSlangCallArgsAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGumboParser.g:6160:3: ( ( (lv_arg_2_0= ruleSlangIDExp ) ) (otherlv_3= Comma ( (lv_arg_4_0= ruleSlangIDExp ) ) )* )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==MustSend||LA123_0==MaySend||LA123_0==Some||LA123_0==All||LA123_0==For||LA123_0==In_1||LA123_0==LeftParenthesis||(LA123_0>=Asterisk && LA123_0<=PlusSign)||LA123_0==HyphenMinus||(LA123_0>=F && LA123_0<=T)||LA123_0==LeftCurlyBracket||(LA123_0>=ForAll && LA123_0<=ThereExists)||(LA123_0>=RULE_SLANG_STRING && LA123_0<=RULE_MSTRING)||LA123_0==RULE_MSP||(LA123_0>=RULE_SLI && LA123_0<=RULE_MSPB)||LA123_0==RULE_OP||(LA123_0>=RULE_HEX && LA123_0<=RULE_REAL_IDF)||LA123_0==RULE_ID) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // InternalGumboParser.g:6161:4: ( (lv_arg_2_0= ruleSlangIDExp ) ) (otherlv_3= Comma ( (lv_arg_4_0= ruleSlangIDExp ) ) )*
                    {
                    // InternalGumboParser.g:6161:4: ( (lv_arg_2_0= ruleSlangIDExp ) )
                    // InternalGumboParser.g:6162:5: (lv_arg_2_0= ruleSlangIDExp )
                    {
                    // InternalGumboParser.g:6162:5: (lv_arg_2_0= ruleSlangIDExp )
                    // InternalGumboParser.g:6163:6: lv_arg_2_0= ruleSlangIDExp
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangCallArgsAccess().getArgSlangIDExpParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_40);
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

                    // InternalGumboParser.g:6180:4: (otherlv_3= Comma ( (lv_arg_4_0= ruleSlangIDExp ) ) )*
                    loop122:
                    do {
                        int alt122=2;
                        int LA122_0 = input.LA(1);

                        if ( (LA122_0==Comma) ) {
                            alt122=1;
                        }


                        switch (alt122) {
                    	case 1 :
                    	    // InternalGumboParser.g:6181:5: otherlv_3= Comma ( (lv_arg_4_0= ruleSlangIDExp ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getSlangCallArgsAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:6185:5: ( (lv_arg_4_0= ruleSlangIDExp ) )
                    	    // InternalGumboParser.g:6186:6: (lv_arg_4_0= ruleSlangIDExp )
                    	    {
                    	    // InternalGumboParser.g:6186:6: (lv_arg_4_0= ruleSlangIDExp )
                    	    // InternalGumboParser.g:6187:7: lv_arg_4_0= ruleSlangIDExp
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSlangCallArgsAccess().getArgSlangIDExpParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_40);
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
                    	    break loop122;
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
    // InternalGumboParser.g:6214:1: entryRuleSlangIDExp returns [EObject current=null] : iv_ruleSlangIDExp= ruleSlangIDExp EOF ;
    public final EObject entryRuleSlangIDExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangIDExp = null;


        try {
            // InternalGumboParser.g:6214:51: (iv_ruleSlangIDExp= ruleSlangIDExp EOF )
            // InternalGumboParser.g:6215:2: iv_ruleSlangIDExp= ruleSlangIDExp EOF
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
    // InternalGumboParser.g:6221:1: ruleSlangIDExp returns [EObject current=null] : ( ( (lv_e_0_0= ruleExpr ) ) (otherlv_1= ColonEqualsSign ( (lv_e_2_0= ruleExpr ) ) )? ) ;
    public final EObject ruleSlangIDExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_e_0_0 = null;

        EObject lv_e_2_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:6227:2: ( ( ( (lv_e_0_0= ruleExpr ) ) (otherlv_1= ColonEqualsSign ( (lv_e_2_0= ruleExpr ) ) )? ) )
            // InternalGumboParser.g:6228:2: ( ( (lv_e_0_0= ruleExpr ) ) (otherlv_1= ColonEqualsSign ( (lv_e_2_0= ruleExpr ) ) )? )
            {
            // InternalGumboParser.g:6228:2: ( ( (lv_e_0_0= ruleExpr ) ) (otherlv_1= ColonEqualsSign ( (lv_e_2_0= ruleExpr ) ) )? )
            // InternalGumboParser.g:6229:3: ( (lv_e_0_0= ruleExpr ) ) (otherlv_1= ColonEqualsSign ( (lv_e_2_0= ruleExpr ) ) )?
            {
            // InternalGumboParser.g:6229:3: ( (lv_e_0_0= ruleExpr ) )
            // InternalGumboParser.g:6230:4: (lv_e_0_0= ruleExpr )
            {
            // InternalGumboParser.g:6230:4: (lv_e_0_0= ruleExpr )
            // InternalGumboParser.g:6231:5: lv_e_0_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangIDExpAccess().getEExprParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_92);
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

            // InternalGumboParser.g:6248:3: (otherlv_1= ColonEqualsSign ( (lv_e_2_0= ruleExpr ) ) )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==ColonEqualsSign) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // InternalGumboParser.g:6249:4: otherlv_1= ColonEqualsSign ( (lv_e_2_0= ruleExpr ) )
                    {
                    otherlv_1=(Token)match(input,ColonEqualsSign,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getSlangIDExpAccess().getColonEqualsSignKeyword_1_0());
                      			
                    }
                    // InternalGumboParser.g:6253:4: ( (lv_e_2_0= ruleExpr ) )
                    // InternalGumboParser.g:6254:5: (lv_e_2_0= ruleExpr )
                    {
                    // InternalGumboParser.g:6254:5: (lv_e_2_0= ruleExpr )
                    // InternalGumboParser.g:6255:6: lv_e_2_0= ruleExpr
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
    // InternalGumboParser.g:6277:1: entryRuleSlangType returns [EObject current=null] : iv_ruleSlangType= ruleSlangType EOF ;
    public final EObject entryRuleSlangType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangType = null;


        try {
            // InternalGumboParser.g:6277:50: (iv_ruleSlangType= ruleSlangType EOF )
            // InternalGumboParser.g:6278:2: iv_ruleSlangType= ruleSlangType EOF
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
    // InternalGumboParser.g:6284:1: ruleSlangType returns [EObject current=null] : this_SlangBaseType_0= ruleSlangBaseType ;
    public final EObject ruleSlangType() throws RecognitionException {
        EObject current = null;

        EObject this_SlangBaseType_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:6290:2: (this_SlangBaseType_0= ruleSlangBaseType )
            // InternalGumboParser.g:6291:2: this_SlangBaseType_0= ruleSlangBaseType
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
    // InternalGumboParser.g:6305:1: entryRuleSlangBaseType returns [EObject current=null] : iv_ruleSlangBaseType= ruleSlangBaseType EOF ;
    public final EObject entryRuleSlangBaseType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangBaseType = null;


        try {
            // InternalGumboParser.g:6305:54: (iv_ruleSlangBaseType= ruleSlangBaseType EOF )
            // InternalGumboParser.g:6306:2: iv_ruleSlangBaseType= ruleSlangBaseType EOF
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
    // InternalGumboParser.g:6312:1: ruleSlangBaseType returns [EObject current=null] : ( ( ruleQCREF ) ) ;
    public final EObject ruleSlangBaseType() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalGumboParser.g:6318:2: ( ( ( ruleQCREF ) ) )
            // InternalGumboParser.g:6319:2: ( ( ruleQCREF ) )
            {
            // InternalGumboParser.g:6319:2: ( ( ruleQCREF ) )
            // InternalGumboParser.g:6320:3: ( ruleQCREF )
            {
            // InternalGumboParser.g:6320:3: ( ruleQCREF )
            // InternalGumboParser.g:6321:4: ruleQCREF
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
    // InternalGumboParser.g:6341:1: entryRuleSlangTypeArgs returns [EObject current=null] : iv_ruleSlangTypeArgs= ruleSlangTypeArgs EOF ;
    public final EObject entryRuleSlangTypeArgs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangTypeArgs = null;


        try {
            // InternalGumboParser.g:6341:54: (iv_ruleSlangTypeArgs= ruleSlangTypeArgs EOF )
            // InternalGumboParser.g:6342:2: iv_ruleSlangTypeArgs= ruleSlangTypeArgs EOF
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
    // InternalGumboParser.g:6348:1: ruleSlangTypeArgs returns [EObject current=null] : (otherlv_0= LeftSquareBracket ( (lv_types_1_0= ruleSlangType ) ) (otherlv_2= Comma ( (lv_types_3_0= ruleSlangType ) ) )* otherlv_4= RightSquareBracket ) ;
    public final EObject ruleSlangTypeArgs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_types_1_0 = null;

        EObject lv_types_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:6354:2: ( (otherlv_0= LeftSquareBracket ( (lv_types_1_0= ruleSlangType ) ) (otherlv_2= Comma ( (lv_types_3_0= ruleSlangType ) ) )* otherlv_4= RightSquareBracket ) )
            // InternalGumboParser.g:6355:2: (otherlv_0= LeftSquareBracket ( (lv_types_1_0= ruleSlangType ) ) (otherlv_2= Comma ( (lv_types_3_0= ruleSlangType ) ) )* otherlv_4= RightSquareBracket )
            {
            // InternalGumboParser.g:6355:2: (otherlv_0= LeftSquareBracket ( (lv_types_1_0= ruleSlangType ) ) (otherlv_2= Comma ( (lv_types_3_0= ruleSlangType ) ) )* otherlv_4= RightSquareBracket )
            // InternalGumboParser.g:6356:3: otherlv_0= LeftSquareBracket ( (lv_types_1_0= ruleSlangType ) ) (otherlv_2= Comma ( (lv_types_3_0= ruleSlangType ) ) )* otherlv_4= RightSquareBracket
            {
            otherlv_0=(Token)match(input,LeftSquareBracket,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangTypeArgsAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalGumboParser.g:6360:3: ( (lv_types_1_0= ruleSlangType ) )
            // InternalGumboParser.g:6361:4: (lv_types_1_0= ruleSlangType )
            {
            // InternalGumboParser.g:6361:4: (lv_types_1_0= ruleSlangType )
            // InternalGumboParser.g:6362:5: lv_types_1_0= ruleSlangType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangTypeArgsAccess().getTypesSlangTypeParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_44);
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

            // InternalGumboParser.g:6379:3: (otherlv_2= Comma ( (lv_types_3_0= ruleSlangType ) ) )*
            loop125:
            do {
                int alt125=2;
                int LA125_0 = input.LA(1);

                if ( (LA125_0==Comma) ) {
                    alt125=1;
                }


                switch (alt125) {
            	case 1 :
            	    // InternalGumboParser.g:6380:4: otherlv_2= Comma ( (lv_types_3_0= ruleSlangType ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FollowSets000.FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSlangTypeArgsAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalGumboParser.g:6384:4: ( (lv_types_3_0= ruleSlangType ) )
            	    // InternalGumboParser.g:6385:5: (lv_types_3_0= ruleSlangType )
            	    {
            	    // InternalGumboParser.g:6385:5: (lv_types_3_0= ruleSlangType )
            	    // InternalGumboParser.g:6386:6: lv_types_3_0= ruleSlangType
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSlangTypeArgsAccess().getTypesSlangTypeParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_44);
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
            	    break loop125;
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
    // InternalGumboParser.g:6412:1: entryRuleSlangLit returns [EObject current=null] : iv_ruleSlangLit= ruleSlangLit EOF ;
    public final EObject entryRuleSlangLit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangLit = null;


        try {
            // InternalGumboParser.g:6412:49: (iv_ruleSlangLit= ruleSlangLit EOF )
            // InternalGumboParser.g:6413:2: iv_ruleSlangLit= ruleSlangLit EOF
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
    // InternalGumboParser.g:6419:1: ruleSlangLit returns [EObject current=null] : ( ( () ( ( (lv_value_1_1= T | lv_value_1_2= F ) ) ) ) | ( () ( (lv_value_3_0= RULE_INTEGER_LIT ) ) ) | ( () ( (lv_value_5_0= RULE_INT_IDF ) ) ) | ( () ( (lv_value_7_0= RULE_HEX ) ) ) | ( () ( (lv_value_9_0= RULE_BIN ) ) ) | ( () ( (lv_value_11_0= RULE_REAL_LIT ) ) ) | ( () ( (lv_value_13_0= RULE_SLANG_STRING ) ) ) | ( () ( (lv_value_15_0= RULE_REAL_IDF ) ) ) | ( () ( (lv_value_17_0= RULE_MSTRING ) ) ) ) ;
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
            // InternalGumboParser.g:6425:2: ( ( ( () ( ( (lv_value_1_1= T | lv_value_1_2= F ) ) ) ) | ( () ( (lv_value_3_0= RULE_INTEGER_LIT ) ) ) | ( () ( (lv_value_5_0= RULE_INT_IDF ) ) ) | ( () ( (lv_value_7_0= RULE_HEX ) ) ) | ( () ( (lv_value_9_0= RULE_BIN ) ) ) | ( () ( (lv_value_11_0= RULE_REAL_LIT ) ) ) | ( () ( (lv_value_13_0= RULE_SLANG_STRING ) ) ) | ( () ( (lv_value_15_0= RULE_REAL_IDF ) ) ) | ( () ( (lv_value_17_0= RULE_MSTRING ) ) ) ) )
            // InternalGumboParser.g:6426:2: ( ( () ( ( (lv_value_1_1= T | lv_value_1_2= F ) ) ) ) | ( () ( (lv_value_3_0= RULE_INTEGER_LIT ) ) ) | ( () ( (lv_value_5_0= RULE_INT_IDF ) ) ) | ( () ( (lv_value_7_0= RULE_HEX ) ) ) | ( () ( (lv_value_9_0= RULE_BIN ) ) ) | ( () ( (lv_value_11_0= RULE_REAL_LIT ) ) ) | ( () ( (lv_value_13_0= RULE_SLANG_STRING ) ) ) | ( () ( (lv_value_15_0= RULE_REAL_IDF ) ) ) | ( () ( (lv_value_17_0= RULE_MSTRING ) ) ) )
            {
            // InternalGumboParser.g:6426:2: ( ( () ( ( (lv_value_1_1= T | lv_value_1_2= F ) ) ) ) | ( () ( (lv_value_3_0= RULE_INTEGER_LIT ) ) ) | ( () ( (lv_value_5_0= RULE_INT_IDF ) ) ) | ( () ( (lv_value_7_0= RULE_HEX ) ) ) | ( () ( (lv_value_9_0= RULE_BIN ) ) ) | ( () ( (lv_value_11_0= RULE_REAL_LIT ) ) ) | ( () ( (lv_value_13_0= RULE_SLANG_STRING ) ) ) | ( () ( (lv_value_15_0= RULE_REAL_IDF ) ) ) | ( () ( (lv_value_17_0= RULE_MSTRING ) ) ) )
            int alt127=9;
            switch ( input.LA(1) ) {
            case F:
            case T:
                {
                alt127=1;
                }
                break;
            case RULE_INTEGER_LIT:
                {
                alt127=2;
                }
                break;
            case RULE_INT_IDF:
                {
                alt127=3;
                }
                break;
            case RULE_HEX:
                {
                alt127=4;
                }
                break;
            case RULE_BIN:
                {
                alt127=5;
                }
                break;
            case RULE_REAL_LIT:
                {
                alt127=6;
                }
                break;
            case RULE_SLANG_STRING:
                {
                alt127=7;
                }
                break;
            case RULE_REAL_IDF:
                {
                alt127=8;
                }
                break;
            case RULE_MSTRING:
                {
                alt127=9;
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
                    // InternalGumboParser.g:6427:3: ( () ( ( (lv_value_1_1= T | lv_value_1_2= F ) ) ) )
                    {
                    // InternalGumboParser.g:6427:3: ( () ( ( (lv_value_1_1= T | lv_value_1_2= F ) ) ) )
                    // InternalGumboParser.g:6428:4: () ( ( (lv_value_1_1= T | lv_value_1_2= F ) ) )
                    {
                    // InternalGumboParser.g:6428:4: ()
                    // InternalGumboParser.g:6429:5: 
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

                    // InternalGumboParser.g:6438:4: ( ( (lv_value_1_1= T | lv_value_1_2= F ) ) )
                    // InternalGumboParser.g:6439:5: ( (lv_value_1_1= T | lv_value_1_2= F ) )
                    {
                    // InternalGumboParser.g:6439:5: ( (lv_value_1_1= T | lv_value_1_2= F ) )
                    // InternalGumboParser.g:6440:6: (lv_value_1_1= T | lv_value_1_2= F )
                    {
                    // InternalGumboParser.g:6440:6: (lv_value_1_1= T | lv_value_1_2= F )
                    int alt126=2;
                    int LA126_0 = input.LA(1);

                    if ( (LA126_0==T) ) {
                        alt126=1;
                    }
                    else if ( (LA126_0==F) ) {
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
                            // InternalGumboParser.g:6441:7: lv_value_1_1= T
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
                            // InternalGumboParser.g:6452:7: lv_value_1_2= F
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
                    // InternalGumboParser.g:6467:3: ( () ( (lv_value_3_0= RULE_INTEGER_LIT ) ) )
                    {
                    // InternalGumboParser.g:6467:3: ( () ( (lv_value_3_0= RULE_INTEGER_LIT ) ) )
                    // InternalGumboParser.g:6468:4: () ( (lv_value_3_0= RULE_INTEGER_LIT ) )
                    {
                    // InternalGumboParser.g:6468:4: ()
                    // InternalGumboParser.g:6469:5: 
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

                    // InternalGumboParser.g:6478:4: ( (lv_value_3_0= RULE_INTEGER_LIT ) )
                    // InternalGumboParser.g:6479:5: (lv_value_3_0= RULE_INTEGER_LIT )
                    {
                    // InternalGumboParser.g:6479:5: (lv_value_3_0= RULE_INTEGER_LIT )
                    // InternalGumboParser.g:6480:6: lv_value_3_0= RULE_INTEGER_LIT
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
                    // InternalGumboParser.g:6498:3: ( () ( (lv_value_5_0= RULE_INT_IDF ) ) )
                    {
                    // InternalGumboParser.g:6498:3: ( () ( (lv_value_5_0= RULE_INT_IDF ) ) )
                    // InternalGumboParser.g:6499:4: () ( (lv_value_5_0= RULE_INT_IDF ) )
                    {
                    // InternalGumboParser.g:6499:4: ()
                    // InternalGumboParser.g:6500:5: 
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

                    // InternalGumboParser.g:6509:4: ( (lv_value_5_0= RULE_INT_IDF ) )
                    // InternalGumboParser.g:6510:5: (lv_value_5_0= RULE_INT_IDF )
                    {
                    // InternalGumboParser.g:6510:5: (lv_value_5_0= RULE_INT_IDF )
                    // InternalGumboParser.g:6511:6: lv_value_5_0= RULE_INT_IDF
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
                    // InternalGumboParser.g:6529:3: ( () ( (lv_value_7_0= RULE_HEX ) ) )
                    {
                    // InternalGumboParser.g:6529:3: ( () ( (lv_value_7_0= RULE_HEX ) ) )
                    // InternalGumboParser.g:6530:4: () ( (lv_value_7_0= RULE_HEX ) )
                    {
                    // InternalGumboParser.g:6530:4: ()
                    // InternalGumboParser.g:6531:5: 
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

                    // InternalGumboParser.g:6540:4: ( (lv_value_7_0= RULE_HEX ) )
                    // InternalGumboParser.g:6541:5: (lv_value_7_0= RULE_HEX )
                    {
                    // InternalGumboParser.g:6541:5: (lv_value_7_0= RULE_HEX )
                    // InternalGumboParser.g:6542:6: lv_value_7_0= RULE_HEX
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
                    // InternalGumboParser.g:6560:3: ( () ( (lv_value_9_0= RULE_BIN ) ) )
                    {
                    // InternalGumboParser.g:6560:3: ( () ( (lv_value_9_0= RULE_BIN ) ) )
                    // InternalGumboParser.g:6561:4: () ( (lv_value_9_0= RULE_BIN ) )
                    {
                    // InternalGumboParser.g:6561:4: ()
                    // InternalGumboParser.g:6562:5: 
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

                    // InternalGumboParser.g:6571:4: ( (lv_value_9_0= RULE_BIN ) )
                    // InternalGumboParser.g:6572:5: (lv_value_9_0= RULE_BIN )
                    {
                    // InternalGumboParser.g:6572:5: (lv_value_9_0= RULE_BIN )
                    // InternalGumboParser.g:6573:6: lv_value_9_0= RULE_BIN
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
                    // InternalGumboParser.g:6591:3: ( () ( (lv_value_11_0= RULE_REAL_LIT ) ) )
                    {
                    // InternalGumboParser.g:6591:3: ( () ( (lv_value_11_0= RULE_REAL_LIT ) ) )
                    // InternalGumboParser.g:6592:4: () ( (lv_value_11_0= RULE_REAL_LIT ) )
                    {
                    // InternalGumboParser.g:6592:4: ()
                    // InternalGumboParser.g:6593:5: 
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

                    // InternalGumboParser.g:6602:4: ( (lv_value_11_0= RULE_REAL_LIT ) )
                    // InternalGumboParser.g:6603:5: (lv_value_11_0= RULE_REAL_LIT )
                    {
                    // InternalGumboParser.g:6603:5: (lv_value_11_0= RULE_REAL_LIT )
                    // InternalGumboParser.g:6604:6: lv_value_11_0= RULE_REAL_LIT
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
                    // InternalGumboParser.g:6622:3: ( () ( (lv_value_13_0= RULE_SLANG_STRING ) ) )
                    {
                    // InternalGumboParser.g:6622:3: ( () ( (lv_value_13_0= RULE_SLANG_STRING ) ) )
                    // InternalGumboParser.g:6623:4: () ( (lv_value_13_0= RULE_SLANG_STRING ) )
                    {
                    // InternalGumboParser.g:6623:4: ()
                    // InternalGumboParser.g:6624:5: 
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

                    // InternalGumboParser.g:6633:4: ( (lv_value_13_0= RULE_SLANG_STRING ) )
                    // InternalGumboParser.g:6634:5: (lv_value_13_0= RULE_SLANG_STRING )
                    {
                    // InternalGumboParser.g:6634:5: (lv_value_13_0= RULE_SLANG_STRING )
                    // InternalGumboParser.g:6635:6: lv_value_13_0= RULE_SLANG_STRING
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
                    // InternalGumboParser.g:6653:3: ( () ( (lv_value_15_0= RULE_REAL_IDF ) ) )
                    {
                    // InternalGumboParser.g:6653:3: ( () ( (lv_value_15_0= RULE_REAL_IDF ) ) )
                    // InternalGumboParser.g:6654:4: () ( (lv_value_15_0= RULE_REAL_IDF ) )
                    {
                    // InternalGumboParser.g:6654:4: ()
                    // InternalGumboParser.g:6655:5: 
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

                    // InternalGumboParser.g:6664:4: ( (lv_value_15_0= RULE_REAL_IDF ) )
                    // InternalGumboParser.g:6665:5: (lv_value_15_0= RULE_REAL_IDF )
                    {
                    // InternalGumboParser.g:6665:5: (lv_value_15_0= RULE_REAL_IDF )
                    // InternalGumboParser.g:6666:6: lv_value_15_0= RULE_REAL_IDF
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
                    // InternalGumboParser.g:6684:3: ( () ( (lv_value_17_0= RULE_MSTRING ) ) )
                    {
                    // InternalGumboParser.g:6684:3: ( () ( (lv_value_17_0= RULE_MSTRING ) ) )
                    // InternalGumboParser.g:6685:4: () ( (lv_value_17_0= RULE_MSTRING ) )
                    {
                    // InternalGumboParser.g:6685:4: ()
                    // InternalGumboParser.g:6686:5: 
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

                    // InternalGumboParser.g:6695:4: ( (lv_value_17_0= RULE_MSTRING ) )
                    // InternalGumboParser.g:6696:5: (lv_value_17_0= RULE_MSTRING )
                    {
                    // InternalGumboParser.g:6696:5: (lv_value_17_0= RULE_MSTRING )
                    // InternalGumboParser.g:6697:6: lv_value_17_0= RULE_MSTRING
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
    // InternalGumboParser.g:6718:1: entryRuleSlangInterp returns [EObject current=null] : iv_ruleSlangInterp= ruleSlangInterp EOF ;
    public final EObject entryRuleSlangInterp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangInterp = null;


        try {
            // InternalGumboParser.g:6718:52: (iv_ruleSlangInterp= ruleSlangInterp EOF )
            // InternalGumboParser.g:6719:2: iv_ruleSlangInterp= ruleSlangInterp EOF
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
    // InternalGumboParser.g:6725:1: ruleSlangInterp returns [EObject current=null] : ( ( () ( (lv_msp_1_0= RULE_MSP ) ) ) | ( () ( (lv_sli_3_0= RULE_SLI ) ) ) | ( () ( (lv_mspb_5_0= RULE_MSPB ) ) ( (lv_minterp_6_0= ruleSlangMInterp ) ) ) ) ;
    public final EObject ruleSlangInterp() throws RecognitionException {
        EObject current = null;

        Token lv_msp_1_0=null;
        Token lv_sli_3_0=null;
        Token lv_mspb_5_0=null;
        EObject lv_minterp_6_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:6731:2: ( ( ( () ( (lv_msp_1_0= RULE_MSP ) ) ) | ( () ( (lv_sli_3_0= RULE_SLI ) ) ) | ( () ( (lv_mspb_5_0= RULE_MSPB ) ) ( (lv_minterp_6_0= ruleSlangMInterp ) ) ) ) )
            // InternalGumboParser.g:6732:2: ( ( () ( (lv_msp_1_0= RULE_MSP ) ) ) | ( () ( (lv_sli_3_0= RULE_SLI ) ) ) | ( () ( (lv_mspb_5_0= RULE_MSPB ) ) ( (lv_minterp_6_0= ruleSlangMInterp ) ) ) )
            {
            // InternalGumboParser.g:6732:2: ( ( () ( (lv_msp_1_0= RULE_MSP ) ) ) | ( () ( (lv_sli_3_0= RULE_SLI ) ) ) | ( () ( (lv_mspb_5_0= RULE_MSPB ) ) ( (lv_minterp_6_0= ruleSlangMInterp ) ) ) )
            int alt128=3;
            switch ( input.LA(1) ) {
            case RULE_MSP:
                {
                alt128=1;
                }
                break;
            case RULE_SLI:
                {
                alt128=2;
                }
                break;
            case RULE_MSPB:
                {
                alt128=3;
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
                    // InternalGumboParser.g:6733:3: ( () ( (lv_msp_1_0= RULE_MSP ) ) )
                    {
                    // InternalGumboParser.g:6733:3: ( () ( (lv_msp_1_0= RULE_MSP ) ) )
                    // InternalGumboParser.g:6734:4: () ( (lv_msp_1_0= RULE_MSP ) )
                    {
                    // InternalGumboParser.g:6734:4: ()
                    // InternalGumboParser.g:6735:5: 
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

                    // InternalGumboParser.g:6744:4: ( (lv_msp_1_0= RULE_MSP ) )
                    // InternalGumboParser.g:6745:5: (lv_msp_1_0= RULE_MSP )
                    {
                    // InternalGumboParser.g:6745:5: (lv_msp_1_0= RULE_MSP )
                    // InternalGumboParser.g:6746:6: lv_msp_1_0= RULE_MSP
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
                    // InternalGumboParser.g:6764:3: ( () ( (lv_sli_3_0= RULE_SLI ) ) )
                    {
                    // InternalGumboParser.g:6764:3: ( () ( (lv_sli_3_0= RULE_SLI ) ) )
                    // InternalGumboParser.g:6765:4: () ( (lv_sli_3_0= RULE_SLI ) )
                    {
                    // InternalGumboParser.g:6765:4: ()
                    // InternalGumboParser.g:6766:5: 
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

                    // InternalGumboParser.g:6775:4: ( (lv_sli_3_0= RULE_SLI ) )
                    // InternalGumboParser.g:6776:5: (lv_sli_3_0= RULE_SLI )
                    {
                    // InternalGumboParser.g:6776:5: (lv_sli_3_0= RULE_SLI )
                    // InternalGumboParser.g:6777:6: lv_sli_3_0= RULE_SLI
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
                    // InternalGumboParser.g:6795:3: ( () ( (lv_mspb_5_0= RULE_MSPB ) ) ( (lv_minterp_6_0= ruleSlangMInterp ) ) )
                    {
                    // InternalGumboParser.g:6795:3: ( () ( (lv_mspb_5_0= RULE_MSPB ) ) ( (lv_minterp_6_0= ruleSlangMInterp ) ) )
                    // InternalGumboParser.g:6796:4: () ( (lv_mspb_5_0= RULE_MSPB ) ) ( (lv_minterp_6_0= ruleSlangMInterp ) )
                    {
                    // InternalGumboParser.g:6796:4: ()
                    // InternalGumboParser.g:6797:5: 
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

                    // InternalGumboParser.g:6806:4: ( (lv_mspb_5_0= RULE_MSPB ) )
                    // InternalGumboParser.g:6807:5: (lv_mspb_5_0= RULE_MSPB )
                    {
                    // InternalGumboParser.g:6807:5: (lv_mspb_5_0= RULE_MSPB )
                    // InternalGumboParser.g:6808:6: lv_mspb_5_0= RULE_MSPB
                    {
                    lv_mspb_5_0=(Token)match(input,RULE_MSPB,FollowSets000.FOLLOW_55); if (state.failed) return current;
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

                    // InternalGumboParser.g:6824:4: ( (lv_minterp_6_0= ruleSlangMInterp ) )
                    // InternalGumboParser.g:6825:5: (lv_minterp_6_0= ruleSlangMInterp )
                    {
                    // InternalGumboParser.g:6825:5: (lv_minterp_6_0= ruleSlangMInterp )
                    // InternalGumboParser.g:6826:6: lv_minterp_6_0= ruleSlangMInterp
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
    // InternalGumboParser.g:6848:1: entryRuleSlangMInterp returns [EObject current=null] : iv_ruleSlangMInterp= ruleSlangMInterp EOF ;
    public final EObject entryRuleSlangMInterp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangMInterp = null;


        try {
            // InternalGumboParser.g:6848:53: (iv_ruleSlangMInterp= ruleSlangMInterp EOF )
            // InternalGumboParser.g:6849:2: iv_ruleSlangMInterp= ruleSlangMInterp EOF
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
    // InternalGumboParser.g:6855:1: ruleSlangMInterp returns [EObject current=null] : (otherlv_0= LeftCurlyBracket ( (lv_e_1_0= ruleExpr ) ) otherlv_2= RightCurlyBracket ( (this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) ) ) | this_MSPE_5= RULE_MSPE ) ) ;
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
            // InternalGumboParser.g:6861:2: ( (otherlv_0= LeftCurlyBracket ( (lv_e_1_0= ruleExpr ) ) otherlv_2= RightCurlyBracket ( (this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) ) ) | this_MSPE_5= RULE_MSPE ) ) )
            // InternalGumboParser.g:6862:2: (otherlv_0= LeftCurlyBracket ( (lv_e_1_0= ruleExpr ) ) otherlv_2= RightCurlyBracket ( (this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) ) ) | this_MSPE_5= RULE_MSPE ) )
            {
            // InternalGumboParser.g:6862:2: (otherlv_0= LeftCurlyBracket ( (lv_e_1_0= ruleExpr ) ) otherlv_2= RightCurlyBracket ( (this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) ) ) | this_MSPE_5= RULE_MSPE ) )
            // InternalGumboParser.g:6863:3: otherlv_0= LeftCurlyBracket ( (lv_e_1_0= ruleExpr ) ) otherlv_2= RightCurlyBracket ( (this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) ) ) | this_MSPE_5= RULE_MSPE )
            {
            otherlv_0=(Token)match(input,LeftCurlyBracket,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangMInterpAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalGumboParser.g:6867:3: ( (lv_e_1_0= ruleExpr ) )
            // InternalGumboParser.g:6868:4: (lv_e_1_0= ruleExpr )
            {
            // InternalGumboParser.g:6868:4: (lv_e_1_0= ruleExpr )
            // InternalGumboParser.g:6869:5: lv_e_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangMInterpAccess().getEExprParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_79);
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

            otherlv_2=(Token)match(input,RightCurlyBracket,FollowSets000.FOLLOW_93); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSlangMInterpAccess().getRightCurlyBracketKeyword_2());
              		
            }
            // InternalGumboParser.g:6890:3: ( (this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) ) ) | this_MSPE_5= RULE_MSPE )
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==RULE_MSPM) ) {
                alt129=1;
            }
            else if ( (LA129_0==RULE_MSPE) ) {
                alt129=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 129, 0, input);

                throw nvae;
            }
            switch (alt129) {
                case 1 :
                    // InternalGumboParser.g:6891:4: (this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) ) )
                    {
                    // InternalGumboParser.g:6891:4: (this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) ) )
                    // InternalGumboParser.g:6892:5: this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) )
                    {
                    this_MSPM_3=(Token)match(input,RULE_MSPM,FollowSets000.FOLLOW_55); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_MSPM_3, grammarAccess.getSlangMInterpAccess().getMSPMTerminalRuleCall_3_0_0());
                      				
                    }
                    // InternalGumboParser.g:6896:5: ( (lv_m_4_0= ruleSlangMInterp ) )
                    // InternalGumboParser.g:6897:6: (lv_m_4_0= ruleSlangMInterp )
                    {
                    // InternalGumboParser.g:6897:6: (lv_m_4_0= ruleSlangMInterp )
                    // InternalGumboParser.g:6898:7: lv_m_4_0= ruleSlangMInterp
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
                    // InternalGumboParser.g:6917:4: this_MSPE_5= RULE_MSPE
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
    // InternalGumboParser.g:6926:1: entryRuleOperator returns [String current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final String entryRuleOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperator = null;


        try {
            // InternalGumboParser.g:6926:48: (iv_ruleOperator= ruleOperator EOF )
            // InternalGumboParser.g:6927:2: iv_ruleOperator= ruleOperator EOF
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
    // InternalGumboParser.g:6933:1: ruleOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_OP_0= RULE_OP | this_PlusMinus_1= rulePlusMinus | this_STAR_2= ruleSTAR ) ;
    public final AntlrDatatypeRuleToken ruleOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_OP_0=null;
        AntlrDatatypeRuleToken this_PlusMinus_1 = null;

        AntlrDatatypeRuleToken this_STAR_2 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:6939:2: ( (this_OP_0= RULE_OP | this_PlusMinus_1= rulePlusMinus | this_STAR_2= ruleSTAR ) )
            // InternalGumboParser.g:6940:2: (this_OP_0= RULE_OP | this_PlusMinus_1= rulePlusMinus | this_STAR_2= ruleSTAR )
            {
            // InternalGumboParser.g:6940:2: (this_OP_0= RULE_OP | this_PlusMinus_1= rulePlusMinus | this_STAR_2= ruleSTAR )
            int alt130=3;
            switch ( input.LA(1) ) {
            case RULE_OP:
                {
                alt130=1;
                }
                break;
            case PlusSign:
            case HyphenMinus:
                {
                alt130=2;
                }
                break;
            case Asterisk:
                {
                alt130=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 130, 0, input);

                throw nvae;
            }

            switch (alt130) {
                case 1 :
                    // InternalGumboParser.g:6941:3: this_OP_0= RULE_OP
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
                    // InternalGumboParser.g:6949:3: this_PlusMinus_1= rulePlusMinus
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
                    // InternalGumboParser.g:6960:3: this_STAR_2= ruleSTAR
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

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalGumboParser.g:6974:1: entryRuleContainedPropertyAssociation returns [EObject current=null] : iv_ruleContainedPropertyAssociation= ruleContainedPropertyAssociation EOF ;
    public final EObject entryRuleContainedPropertyAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainedPropertyAssociation = null;


        try {
            // InternalGumboParser.g:6974:69: (iv_ruleContainedPropertyAssociation= ruleContainedPropertyAssociation EOF )
            // InternalGumboParser.g:6975:2: iv_ruleContainedPropertyAssociation= ruleContainedPropertyAssociation EOF
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
    // InternalGumboParser.g:6981:1: ruleContainedPropertyAssociation returns [EObject current=null] : ( ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon ) ;
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
            // InternalGumboParser.g:6987:2: ( ( ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon ) )
            // InternalGumboParser.g:6988:2: ( ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon )
            {
            // InternalGumboParser.g:6988:2: ( ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon )
            // InternalGumboParser.g:6989:3: ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon
            {
            // InternalGumboParser.g:6989:3: ( ( ruleQPREF ) )
            // InternalGumboParser.g:6990:4: ( ruleQPREF )
            {
            // InternalGumboParser.g:6990:4: ( ruleQPREF )
            // InternalGumboParser.g:6991:5: ruleQPREF
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
            pushFollow(FollowSets000.FOLLOW_94);
            ruleQPREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumboParser.g:7008:3: (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) )
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==EqualsSignGreaterThanSign) ) {
                alt131=1;
            }
            else if ( (LA131_0==PlusSignEqualsSignGreaterThanSign) ) {
                alt131=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 131, 0, input);

                throw nvae;
            }
            switch (alt131) {
                case 1 :
                    // InternalGumboParser.g:7009:4: otherlv_1= EqualsSignGreaterThanSign
                    {
                    otherlv_1=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_95); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getContainedPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:7014:4: ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) )
                    {
                    // InternalGumboParser.g:7014:4: ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) )
                    // InternalGumboParser.g:7015:5: (lv_append_2_0= PlusSignEqualsSignGreaterThanSign )
                    {
                    // InternalGumboParser.g:7015:5: (lv_append_2_0= PlusSignEqualsSignGreaterThanSign )
                    // InternalGumboParser.g:7016:6: lv_append_2_0= PlusSignEqualsSignGreaterThanSign
                    {
                    lv_append_2_0=(Token)match(input,PlusSignEqualsSignGreaterThanSign,FollowSets000.FOLLOW_95); if (state.failed) return current;
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

            // InternalGumboParser.g:7029:3: ( (lv_constant_3_0= Constant ) )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==Constant) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // InternalGumboParser.g:7030:4: (lv_constant_3_0= Constant )
                    {
                    // InternalGumboParser.g:7030:4: (lv_constant_3_0= Constant )
                    // InternalGumboParser.g:7031:5: lv_constant_3_0= Constant
                    {
                    lv_constant_3_0=(Token)match(input,Constant,FollowSets000.FOLLOW_95); if (state.failed) return current;
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

            // InternalGumboParser.g:7043:3: ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* )
            // InternalGumboParser.g:7044:4: ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )*
            {
            // InternalGumboParser.g:7044:4: ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) )
            // InternalGumboParser.g:7045:5: (lv_ownedValue_4_0= ruleOptionalModalPropertyValue )
            {
            // InternalGumboParser.g:7045:5: (lv_ownedValue_4_0= ruleOptionalModalPropertyValue )
            // InternalGumboParser.g:7046:6: lv_ownedValue_4_0= ruleOptionalModalPropertyValue
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueOptionalModalPropertyValueParserRuleCall_3_0_0());
              					
            }
            pushFollow(FollowSets000.FOLLOW_96);
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

            // InternalGumboParser.g:7063:4: (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )*
            loop133:
            do {
                int alt133=2;
                int LA133_0 = input.LA(1);

                if ( (LA133_0==Comma) ) {
                    alt133=1;
                }


                switch (alt133) {
            	case 1 :
            	    // InternalGumboParser.g:7064:5: otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) )
            	    {
            	    otherlv_5=(Token)match(input,Comma,FollowSets000.FOLLOW_95); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_5, grammarAccess.getContainedPropertyAssociationAccess().getCommaKeyword_3_1_0());
            	      				
            	    }
            	    // InternalGumboParser.g:7068:5: ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) )
            	    // InternalGumboParser.g:7069:6: (lv_ownedValue_6_0= ruleOptionalModalPropertyValue )
            	    {
            	    // InternalGumboParser.g:7069:6: (lv_ownedValue_6_0= ruleOptionalModalPropertyValue )
            	    // InternalGumboParser.g:7070:7: lv_ownedValue_6_0= ruleOptionalModalPropertyValue
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueOptionalModalPropertyValueParserRuleCall_3_1_1_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_96);
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
            	    break loop133;
                }
            } while (true);


            }

            // InternalGumboParser.g:7089:3: ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==Applies) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // InternalGumboParser.g:7090:4: ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )*
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
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
                    // InternalGumboParser.g:7100:4: ( (lv_appliesTo_8_0= ruleContainmentPath ) )
                    // InternalGumboParser.g:7101:5: (lv_appliesTo_8_0= ruleContainmentPath )
                    {
                    // InternalGumboParser.g:7101:5: (lv_appliesTo_8_0= ruleContainmentPath )
                    // InternalGumboParser.g:7102:6: lv_appliesTo_8_0= ruleContainmentPath
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToContainmentPathParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_97);
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

                    // InternalGumboParser.g:7119:4: (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )*
                    loop134:
                    do {
                        int alt134=2;
                        int LA134_0 = input.LA(1);

                        if ( (LA134_0==Comma) ) {
                            alt134=1;
                        }


                        switch (alt134) {
                    	case 1 :
                    	    // InternalGumboParser.g:7120:5: otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) )
                    	    {
                    	    otherlv_9=(Token)match(input,Comma,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_9, grammarAccess.getContainedPropertyAssociationAccess().getCommaKeyword_4_2_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:7124:5: ( (lv_appliesTo_10_0= ruleContainmentPath ) )
                    	    // InternalGumboParser.g:7125:6: (lv_appliesTo_10_0= ruleContainmentPath )
                    	    {
                    	    // InternalGumboParser.g:7125:6: (lv_appliesTo_10_0= ruleContainmentPath )
                    	    // InternalGumboParser.g:7126:7: lv_appliesTo_10_0= ruleContainmentPath
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToContainmentPathParserRuleCall_4_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_97);
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
                    	    break loop134;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalGumboParser.g:7145:3: ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==In_1) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // InternalGumboParser.g:7146:4: ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getInBindingKeywordsParserRuleCall_5_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_80);
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
                    // InternalGumboParser.g:7160:4: ( ( ruleQCREF ) )
                    // InternalGumboParser.g:7161:5: ( ruleQCREF )
                    {
                    // InternalGumboParser.g:7161:5: ( ruleQCREF )
                    // InternalGumboParser.g:7162:6: ruleQCREF
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
    // InternalGumboParser.g:7192:1: entryRuleContainmentPath returns [EObject current=null] : iv_ruleContainmentPath= ruleContainmentPath EOF ;
    public final EObject entryRuleContainmentPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainmentPath = null;


        try {
            // InternalGumboParser.g:7192:56: (iv_ruleContainmentPath= ruleContainmentPath EOF )
            // InternalGumboParser.g:7193:2: iv_ruleContainmentPath= ruleContainmentPath EOF
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
    // InternalGumboParser.g:7199:1: ruleContainmentPath returns [EObject current=null] : ( (lv_path_0_0= ruleContainmentPathElement ) ) ;
    public final EObject ruleContainmentPath() throws RecognitionException {
        EObject current = null;

        EObject lv_path_0_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:7205:2: ( ( (lv_path_0_0= ruleContainmentPathElement ) ) )
            // InternalGumboParser.g:7206:2: ( (lv_path_0_0= ruleContainmentPathElement ) )
            {
            // InternalGumboParser.g:7206:2: ( (lv_path_0_0= ruleContainmentPathElement ) )
            // InternalGumboParser.g:7207:3: (lv_path_0_0= ruleContainmentPathElement )
            {
            // InternalGumboParser.g:7207:3: (lv_path_0_0= ruleContainmentPathElement )
            // InternalGumboParser.g:7208:4: lv_path_0_0= ruleContainmentPathElement
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
    // InternalGumboParser.g:7228:1: entryRuleOptionalModalPropertyValue returns [EObject current=null] : iv_ruleOptionalModalPropertyValue= ruleOptionalModalPropertyValue EOF ;
    public final EObject entryRuleOptionalModalPropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionalModalPropertyValue = null;


        try {
            // InternalGumboParser.g:7228:67: (iv_ruleOptionalModalPropertyValue= ruleOptionalModalPropertyValue EOF )
            // InternalGumboParser.g:7229:2: iv_ruleOptionalModalPropertyValue= ruleOptionalModalPropertyValue EOF
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
    // InternalGumboParser.g:7235:1: ruleOptionalModalPropertyValue returns [EObject current=null] : ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )? ) ;
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
            // InternalGumboParser.g:7241:2: ( ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )? ) )
            // InternalGumboParser.g:7242:2: ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )? )
            {
            // InternalGumboParser.g:7242:2: ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )? )
            // InternalGumboParser.g:7243:3: ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )?
            {
            // InternalGumboParser.g:7243:3: ( (lv_ownedValue_0_0= rulePropertyExpression ) )
            // InternalGumboParser.g:7244:4: (lv_ownedValue_0_0= rulePropertyExpression )
            {
            // InternalGumboParser.g:7244:4: (lv_ownedValue_0_0= rulePropertyExpression )
            // InternalGumboParser.g:7245:5: lv_ownedValue_0_0= rulePropertyExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOptionalModalPropertyValueAccess().getOwnedValuePropertyExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_98);
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

            // InternalGumboParser.g:7262:3: ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==In_1) ) {
                int LA138_1 = input.LA(2);

                if ( (LA138_1==Modes) ) {
                    alt138=1;
                }
            }
            switch (alt138) {
                case 1 :
                    // InternalGumboParser.g:7263:4: ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getOptionalModalPropertyValueAccess().getInModesKeywordsParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_80);
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
                    // InternalGumboParser.g:7277:4: ( (otherlv_3= RULE_ID ) )
                    // InternalGumboParser.g:7278:5: (otherlv_3= RULE_ID )
                    {
                    // InternalGumboParser.g:7278:5: (otherlv_3= RULE_ID )
                    // InternalGumboParser.g:7279:6: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getOptionalModalPropertyValueRule());
                      						}
                      					
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getOptionalModalPropertyValueAccess().getInModeModeCrossReference_1_2_0());
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:7293:4: (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )*
                    loop137:
                    do {
                        int alt137=2;
                        int LA137_0 = input.LA(1);

                        if ( (LA137_0==Comma) ) {
                            alt137=1;
                        }


                        switch (alt137) {
                    	case 1 :
                    	    // InternalGumboParser.g:7294:5: otherlv_4= Comma ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getOptionalModalPropertyValueAccess().getCommaKeyword_1_3_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:7298:5: ( (otherlv_5= RULE_ID ) )
                    	    // InternalGumboParser.g:7299:6: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalGumboParser.g:7299:6: (otherlv_5= RULE_ID )
                    	    // InternalGumboParser.g:7300:7: otherlv_5= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							/* */
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getOptionalModalPropertyValueRule());
                    	      							}
                    	      						
                    	    }
                    	    otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_40); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_5, grammarAccess.getOptionalModalPropertyValueAccess().getInModeModeCrossReference_1_3_1_0());
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop137;
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
    // InternalGumboParser.g:7324:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalGumboParser.g:7324:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalGumboParser.g:7325:2: iv_rulePropertyValue= rulePropertyValue EOF
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
    // InternalGumboParser.g:7331:1: rulePropertyValue returns [EObject current=null] : ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedValue_0_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:7337:2: ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) )
            // InternalGumboParser.g:7338:2: ( (lv_ownedValue_0_0= rulePropertyExpression ) )
            {
            // InternalGumboParser.g:7338:2: ( (lv_ownedValue_0_0= rulePropertyExpression ) )
            // InternalGumboParser.g:7339:3: (lv_ownedValue_0_0= rulePropertyExpression )
            {
            // InternalGumboParser.g:7339:3: (lv_ownedValue_0_0= rulePropertyExpression )
            // InternalGumboParser.g:7340:4: lv_ownedValue_0_0= rulePropertyExpression
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
    // InternalGumboParser.g:7360:1: entryRulePropertyExpression returns [EObject current=null] : iv_rulePropertyExpression= rulePropertyExpression EOF ;
    public final EObject entryRulePropertyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyExpression = null;


        try {
            // InternalGumboParser.g:7360:59: (iv_rulePropertyExpression= rulePropertyExpression EOF )
            // InternalGumboParser.g:7361:2: iv_rulePropertyExpression= rulePropertyExpression EOF
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
    // InternalGumboParser.g:7367:1: rulePropertyExpression returns [EObject current=null] : (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm ) ;
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
            // InternalGumboParser.g:7373:2: ( (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm ) )
            // InternalGumboParser.g:7374:2: (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm )
            {
            // InternalGumboParser.g:7374:2: (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm )
            int alt139=11;
            alt139 = dfa139.predict(input);
            switch (alt139) {
                case 1 :
                    // InternalGumboParser.g:7375:3: this_RecordTerm_0= ruleRecordTerm
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
                    // InternalGumboParser.g:7387:3: this_ReferenceTerm_1= ruleReferenceTerm
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
                    // InternalGumboParser.g:7399:3: this_ComponentClassifierTerm_2= ruleComponentClassifierTerm
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
                    // InternalGumboParser.g:7411:3: this_ComputedTerm_3= ruleComputedTerm
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
                    // InternalGumboParser.g:7423:3: this_StringTerm_4= ruleStringTerm
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
                    // InternalGumboParser.g:7435:3: this_NumericRangeTerm_5= ruleNumericRangeTerm
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
                    // InternalGumboParser.g:7447:3: this_RealTerm_6= ruleRealTerm
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
                    // InternalGumboParser.g:7459:3: this_IntegerTerm_7= ruleIntegerTerm
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
                    // InternalGumboParser.g:7471:3: this_ListTerm_8= ruleListTerm
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
                    // InternalGumboParser.g:7483:3: this_BooleanLiteral_9= ruleBooleanLiteral
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
                    // InternalGumboParser.g:7495:3: this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm
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
    // InternalGumboParser.g:7510:1: entryRuleLiteralorReferenceTerm returns [EObject current=null] : iv_ruleLiteralorReferenceTerm= ruleLiteralorReferenceTerm EOF ;
    public final EObject entryRuleLiteralorReferenceTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralorReferenceTerm = null;


        try {
            // InternalGumboParser.g:7510:63: (iv_ruleLiteralorReferenceTerm= ruleLiteralorReferenceTerm EOF )
            // InternalGumboParser.g:7511:2: iv_ruleLiteralorReferenceTerm= ruleLiteralorReferenceTerm EOF
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
    // InternalGumboParser.g:7517:1: ruleLiteralorReferenceTerm returns [EObject current=null] : ( ( ruleQPREF ) ) ;
    public final EObject ruleLiteralorReferenceTerm() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalGumboParser.g:7523:2: ( ( ( ruleQPREF ) ) )
            // InternalGumboParser.g:7524:2: ( ( ruleQPREF ) )
            {
            // InternalGumboParser.g:7524:2: ( ( ruleQPREF ) )
            // InternalGumboParser.g:7525:3: ( ruleQPREF )
            {
            // InternalGumboParser.g:7525:3: ( ruleQPREF )
            // InternalGumboParser.g:7526:4: ruleQPREF
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
    // InternalGumboParser.g:7546:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalGumboParser.g:7546:55: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalGumboParser.g:7547:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
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
    // InternalGumboParser.g:7553:1: ruleBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalGumboParser.g:7559:2: ( ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) ) )
            // InternalGumboParser.g:7560:2: ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) )
            {
            // InternalGumboParser.g:7560:2: ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) )
            // InternalGumboParser.g:7561:3: () ( ( (lv_value_1_0= True ) ) | otherlv_2= False )
            {
            // InternalGumboParser.g:7561:3: ()
            // InternalGumboParser.g:7562:4: 
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

            // InternalGumboParser.g:7571:3: ( ( (lv_value_1_0= True ) ) | otherlv_2= False )
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==True) ) {
                alt140=1;
            }
            else if ( (LA140_0==False) ) {
                alt140=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 140, 0, input);

                throw nvae;
            }
            switch (alt140) {
                case 1 :
                    // InternalGumboParser.g:7572:4: ( (lv_value_1_0= True ) )
                    {
                    // InternalGumboParser.g:7572:4: ( (lv_value_1_0= True ) )
                    // InternalGumboParser.g:7573:5: (lv_value_1_0= True )
                    {
                    // InternalGumboParser.g:7573:5: (lv_value_1_0= True )
                    // InternalGumboParser.g:7574:6: lv_value_1_0= True
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
                    // InternalGumboParser.g:7587:4: otherlv_2= False
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
    // InternalGumboParser.g:7596:1: entryRuleConstantValue returns [EObject current=null] : iv_ruleConstantValue= ruleConstantValue EOF ;
    public final EObject entryRuleConstantValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantValue = null;


        try {
            // InternalGumboParser.g:7596:54: (iv_ruleConstantValue= ruleConstantValue EOF )
            // InternalGumboParser.g:7597:2: iv_ruleConstantValue= ruleConstantValue EOF
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
    // InternalGumboParser.g:7603:1: ruleConstantValue returns [EObject current=null] : ( ( ruleQPREF ) ) ;
    public final EObject ruleConstantValue() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalGumboParser.g:7609:2: ( ( ( ruleQPREF ) ) )
            // InternalGumboParser.g:7610:2: ( ( ruleQPREF ) )
            {
            // InternalGumboParser.g:7610:2: ( ( ruleQPREF ) )
            // InternalGumboParser.g:7611:3: ( ruleQPREF )
            {
            // InternalGumboParser.g:7611:3: ( ruleQPREF )
            // InternalGumboParser.g:7612:4: ruleQPREF
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
    // InternalGumboParser.g:7632:1: entryRuleReferenceTerm returns [EObject current=null] : iv_ruleReferenceTerm= ruleReferenceTerm EOF ;
    public final EObject entryRuleReferenceTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceTerm = null;


        try {
            // InternalGumboParser.g:7632:54: (iv_ruleReferenceTerm= ruleReferenceTerm EOF )
            // InternalGumboParser.g:7633:2: iv_ruleReferenceTerm= ruleReferenceTerm EOF
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
    // InternalGumboParser.g:7639:1: ruleReferenceTerm returns [EObject current=null] : (otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleReferenceTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_path_2_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:7645:2: ( (otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis ) )
            // InternalGumboParser.g:7646:2: (otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis )
            {
            // InternalGumboParser.g:7646:2: (otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis )
            // InternalGumboParser.g:7647:3: otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis
            {
            otherlv_0=(Token)match(input,Reference,FollowSets000.FOLLOW_80); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReferenceTermAccess().getReferenceKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReferenceTermAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGumboParser.g:7655:3: ( (lv_path_2_0= ruleContainmentPathElement ) )
            // InternalGumboParser.g:7656:4: (lv_path_2_0= ruleContainmentPathElement )
            {
            // InternalGumboParser.g:7656:4: (lv_path_2_0= ruleContainmentPathElement )
            // InternalGumboParser.g:7657:5: lv_path_2_0= ruleContainmentPathElement
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
    // InternalGumboParser.g:7682:1: entryRuleRecordTerm returns [EObject current=null] : iv_ruleRecordTerm= ruleRecordTerm EOF ;
    public final EObject entryRuleRecordTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordTerm = null;


        try {
            // InternalGumboParser.g:7682:51: (iv_ruleRecordTerm= ruleRecordTerm EOF )
            // InternalGumboParser.g:7683:2: iv_ruleRecordTerm= ruleRecordTerm EOF
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
    // InternalGumboParser.g:7689:1: ruleRecordTerm returns [EObject current=null] : (otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket ) ;
    public final EObject ruleRecordTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ownedFieldValue_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:7695:2: ( (otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket ) )
            // InternalGumboParser.g:7696:2: (otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket )
            {
            // InternalGumboParser.g:7696:2: (otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket )
            // InternalGumboParser.g:7697:3: otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket
            {
            otherlv_0=(Token)match(input,LeftSquareBracket,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRecordTermAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalGumboParser.g:7701:3: ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+
            int cnt141=0;
            loop141:
            do {
                int alt141=2;
                int LA141_0 = input.LA(1);

                if ( (LA141_0==RULE_ID) ) {
                    alt141=1;
                }


                switch (alt141) {
            	case 1 :
            	    // InternalGumboParser.g:7702:4: (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation )
            	    {
            	    // InternalGumboParser.g:7702:4: (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation )
            	    // InternalGumboParser.g:7703:5: lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRecordTermAccess().getOwnedFieldValueFieldPropertyAssociationParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_99);
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
            	    if ( cnt141 >= 1 ) break loop141;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(141, input);
                        throw eee;
                }
                cnt141++;
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
    // InternalGumboParser.g:7728:1: entryRuleComputedTerm returns [EObject current=null] : iv_ruleComputedTerm= ruleComputedTerm EOF ;
    public final EObject entryRuleComputedTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComputedTerm = null;


        try {
            // InternalGumboParser.g:7728:53: (iv_ruleComputedTerm= ruleComputedTerm EOF )
            // InternalGumboParser.g:7729:2: iv_ruleComputedTerm= ruleComputedTerm EOF
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
    // InternalGumboParser.g:7735:1: ruleComputedTerm returns [EObject current=null] : (otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleComputedTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_function_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalGumboParser.g:7741:2: ( (otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis ) )
            // InternalGumboParser.g:7742:2: (otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis )
            {
            // InternalGumboParser.g:7742:2: (otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis )
            // InternalGumboParser.g:7743:3: otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis
            {
            otherlv_0=(Token)match(input,Compute,FollowSets000.FOLLOW_80); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getComputedTermAccess().getComputeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getComputedTermAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGumboParser.g:7751:3: ( (lv_function_2_0= RULE_ID ) )
            // InternalGumboParser.g:7752:4: (lv_function_2_0= RULE_ID )
            {
            // InternalGumboParser.g:7752:4: (lv_function_2_0= RULE_ID )
            // InternalGumboParser.g:7753:5: lv_function_2_0= RULE_ID
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
    // InternalGumboParser.g:7777:1: entryRuleComponentClassifierTerm returns [EObject current=null] : iv_ruleComponentClassifierTerm= ruleComponentClassifierTerm EOF ;
    public final EObject entryRuleComponentClassifierTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentClassifierTerm = null;


        try {
            // InternalGumboParser.g:7777:64: (iv_ruleComponentClassifierTerm= ruleComponentClassifierTerm EOF )
            // InternalGumboParser.g:7778:2: iv_ruleComponentClassifierTerm= ruleComponentClassifierTerm EOF
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
    // InternalGumboParser.g:7784:1: ruleComponentClassifierTerm returns [EObject current=null] : (otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleComponentClassifierTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalGumboParser.g:7790:2: ( (otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis ) )
            // InternalGumboParser.g:7791:2: (otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis )
            {
            // InternalGumboParser.g:7791:2: (otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis )
            // InternalGumboParser.g:7792:3: otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis
            {
            otherlv_0=(Token)match(input,Classifier,FollowSets000.FOLLOW_80); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getComponentClassifierTermAccess().getClassifierKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getComponentClassifierTermAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGumboParser.g:7800:3: ( ( ruleQCREF ) )
            // InternalGumboParser.g:7801:4: ( ruleQCREF )
            {
            // InternalGumboParser.g:7801:4: ( ruleQCREF )
            // InternalGumboParser.g:7802:5: ruleQCREF
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
    // InternalGumboParser.g:7827:1: entryRuleListTerm returns [EObject current=null] : iv_ruleListTerm= ruleListTerm EOF ;
    public final EObject entryRuleListTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListTerm = null;


        try {
            // InternalGumboParser.g:7827:49: (iv_ruleListTerm= ruleListTerm EOF )
            // InternalGumboParser.g:7828:2: iv_ruleListTerm= ruleListTerm EOF
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
    // InternalGumboParser.g:7834:1: ruleListTerm returns [EObject current=null] : ( () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis ) ;
    public final EObject ruleListTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedListElement_2_0 = null;

        EObject lv_ownedListElement_4_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:7840:2: ( ( () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis ) )
            // InternalGumboParser.g:7841:2: ( () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis )
            {
            // InternalGumboParser.g:7841:2: ( () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis )
            // InternalGumboParser.g:7842:3: () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis
            {
            // InternalGumboParser.g:7842:3: ()
            // InternalGumboParser.g:7843:4: 
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

            otherlv_1=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_100); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getListTermAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGumboParser.g:7856:3: ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==Classifier||LA143_0==Reference||LA143_0==Compute||LA143_0==False||LA143_0==True||LA143_0==LeftParenthesis||LA143_0==PlusSign||LA143_0==HyphenMinus||LA143_0==LeftSquareBracket||LA143_0==RULE_INTEGER_LIT||LA143_0==RULE_REAL_LIT||(LA143_0>=RULE_STRING && LA143_0<=RULE_ID)) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // InternalGumboParser.g:7857:4: ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )*
                    {
                    // InternalGumboParser.g:7857:4: ( (lv_ownedListElement_2_0= rulePropertyExpression ) )
                    // InternalGumboParser.g:7858:5: (lv_ownedListElement_2_0= rulePropertyExpression )
                    {
                    // InternalGumboParser.g:7858:5: (lv_ownedListElement_2_0= rulePropertyExpression )
                    // InternalGumboParser.g:7859:6: lv_ownedListElement_2_0= rulePropertyExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getListTermAccess().getOwnedListElementPropertyExpressionParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_40);
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

                    // InternalGumboParser.g:7876:4: (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )*
                    loop142:
                    do {
                        int alt142=2;
                        int LA142_0 = input.LA(1);

                        if ( (LA142_0==Comma) ) {
                            alt142=1;
                        }


                        switch (alt142) {
                    	case 1 :
                    	    // InternalGumboParser.g:7877:5: otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FollowSets000.FOLLOW_95); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getListTermAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:7881:5: ( (lv_ownedListElement_4_0= rulePropertyExpression ) )
                    	    // InternalGumboParser.g:7882:6: (lv_ownedListElement_4_0= rulePropertyExpression )
                    	    {
                    	    // InternalGumboParser.g:7882:6: (lv_ownedListElement_4_0= rulePropertyExpression )
                    	    // InternalGumboParser.g:7883:7: lv_ownedListElement_4_0= rulePropertyExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getListTermAccess().getOwnedListElementPropertyExpressionParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_40);
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
                    	    break loop142;
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
    // InternalGumboParser.g:7910:1: entryRuleFieldPropertyAssociation returns [EObject current=null] : iv_ruleFieldPropertyAssociation= ruleFieldPropertyAssociation EOF ;
    public final EObject entryRuleFieldPropertyAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldPropertyAssociation = null;


        try {
            // InternalGumboParser.g:7910:65: (iv_ruleFieldPropertyAssociation= ruleFieldPropertyAssociation EOF )
            // InternalGumboParser.g:7911:2: iv_ruleFieldPropertyAssociation= ruleFieldPropertyAssociation EOF
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
    // InternalGumboParser.g:7917:1: ruleFieldPropertyAssociation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon ) ;
    public final EObject ruleFieldPropertyAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedValue_2_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:7923:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon ) )
            // InternalGumboParser.g:7924:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon )
            {
            // InternalGumboParser.g:7924:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon )
            // InternalGumboParser.g:7925:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon
            {
            // InternalGumboParser.g:7925:3: ( (otherlv_0= RULE_ID ) )
            // InternalGumboParser.g:7926:4: (otherlv_0= RULE_ID )
            {
            // InternalGumboParser.g:7926:4: (otherlv_0= RULE_ID )
            // InternalGumboParser.g:7927:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFieldPropertyAssociationRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_66); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getFieldPropertyAssociationAccess().getPropertyBasicPropertyCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_95); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFieldPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_1());
              		
            }
            // InternalGumboParser.g:7945:3: ( (lv_ownedValue_2_0= rulePropertyExpression ) )
            // InternalGumboParser.g:7946:4: (lv_ownedValue_2_0= rulePropertyExpression )
            {
            // InternalGumboParser.g:7946:4: (lv_ownedValue_2_0= rulePropertyExpression )
            // InternalGumboParser.g:7947:5: lv_ownedValue_2_0= rulePropertyExpression
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
    // InternalGumboParser.g:7972:1: entryRuleContainmentPathElement returns [EObject current=null] : iv_ruleContainmentPathElement= ruleContainmentPathElement EOF ;
    public final EObject entryRuleContainmentPathElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainmentPathElement = null;


        try {
            // InternalGumboParser.g:7972:63: (iv_ruleContainmentPathElement= ruleContainmentPathElement EOF )
            // InternalGumboParser.g:7973:2: iv_ruleContainmentPathElement= ruleContainmentPathElement EOF
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
    // InternalGumboParser.g:7979:1: ruleContainmentPathElement returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )? ) ;
    public final EObject ruleContainmentPathElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_arrayRange_1_0 = null;

        EObject lv_path_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:7985:2: ( ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )? ) )
            // InternalGumboParser.g:7986:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )? )
            {
            // InternalGumboParser.g:7986:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )? )
            // InternalGumboParser.g:7987:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )?
            {
            // InternalGumboParser.g:7987:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* )
            // InternalGumboParser.g:7988:4: ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )*
            {
            // InternalGumboParser.g:7988:4: ( (otherlv_0= RULE_ID ) )
            // InternalGumboParser.g:7989:5: (otherlv_0= RULE_ID )
            {
            // InternalGumboParser.g:7989:5: (otherlv_0= RULE_ID )
            // InternalGumboParser.g:7990:6: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              						/* */
              					
            }
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElement(grammarAccess.getContainmentPathElementRule());
              						}
              					
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						newLeafNode(otherlv_0, grammarAccess.getContainmentPathElementAccess().getNamedElementNamedElementCrossReference_0_0_0());
              					
            }

            }


            }

            // InternalGumboParser.g:8004:4: ( (lv_arrayRange_1_0= ruleArrayRange ) )*
            loop144:
            do {
                int alt144=2;
                int LA144_0 = input.LA(1);

                if ( (LA144_0==LeftSquareBracket) ) {
                    alt144=1;
                }


                switch (alt144) {
            	case 1 :
            	    // InternalGumboParser.g:8005:5: (lv_arrayRange_1_0= ruleArrayRange )
            	    {
            	    // InternalGumboParser.g:8005:5: (lv_arrayRange_1_0= ruleArrayRange )
            	    // InternalGumboParser.g:8006:6: lv_arrayRange_1_0= ruleArrayRange
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getContainmentPathElementAccess().getArrayRangeArrayRangeParserRuleCall_0_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_30);
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
            	    break loop144;
                }
            } while (true);


            }

            // InternalGumboParser.g:8024:3: (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==FullStop) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // InternalGumboParser.g:8025:4: otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) )
                    {
                    otherlv_2=(Token)match(input,FullStop,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getContainmentPathElementAccess().getFullStopKeyword_1_0());
                      			
                    }
                    // InternalGumboParser.g:8029:4: ( (lv_path_3_0= ruleContainmentPathElement ) )
                    // InternalGumboParser.g:8030:5: (lv_path_3_0= ruleContainmentPathElement )
                    {
                    // InternalGumboParser.g:8030:5: (lv_path_3_0= ruleContainmentPathElement )
                    // InternalGumboParser.g:8031:6: lv_path_3_0= ruleContainmentPathElement
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
    // InternalGumboParser.g:8053:1: entryRulePlusMinus returns [String current=null] : iv_rulePlusMinus= rulePlusMinus EOF ;
    public final String entryRulePlusMinus() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePlusMinus = null;


        try {
            // InternalGumboParser.g:8053:49: (iv_rulePlusMinus= rulePlusMinus EOF )
            // InternalGumboParser.g:8054:2: iv_rulePlusMinus= rulePlusMinus EOF
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
    // InternalGumboParser.g:8060:1: rulePlusMinus returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= PlusSign | kw= HyphenMinus ) ;
    public final AntlrDatatypeRuleToken rulePlusMinus() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumboParser.g:8066:2: ( (kw= PlusSign | kw= HyphenMinus ) )
            // InternalGumboParser.g:8067:2: (kw= PlusSign | kw= HyphenMinus )
            {
            // InternalGumboParser.g:8067:2: (kw= PlusSign | kw= HyphenMinus )
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==PlusSign) ) {
                alt146=1;
            }
            else if ( (LA146_0==HyphenMinus) ) {
                alt146=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 146, 0, input);

                throw nvae;
            }
            switch (alt146) {
                case 1 :
                    // InternalGumboParser.g:8068:3: kw= PlusSign
                    {
                    kw=(Token)match(input,PlusSign,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPlusMinusAccess().getPlusSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:8074:3: kw= HyphenMinus
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
    // InternalGumboParser.g:8083:1: entryRuleStringTerm returns [EObject current=null] : iv_ruleStringTerm= ruleStringTerm EOF ;
    public final EObject entryRuleStringTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringTerm = null;


        try {
            // InternalGumboParser.g:8083:51: (iv_ruleStringTerm= ruleStringTerm EOF )
            // InternalGumboParser.g:8084:2: iv_ruleStringTerm= ruleStringTerm EOF
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
    // InternalGumboParser.g:8090:1: ruleStringTerm returns [EObject current=null] : ( (lv_value_0_0= ruleNoQuoteString ) ) ;
    public final EObject ruleStringTerm() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:8096:2: ( ( (lv_value_0_0= ruleNoQuoteString ) ) )
            // InternalGumboParser.g:8097:2: ( (lv_value_0_0= ruleNoQuoteString ) )
            {
            // InternalGumboParser.g:8097:2: ( (lv_value_0_0= ruleNoQuoteString ) )
            // InternalGumboParser.g:8098:3: (lv_value_0_0= ruleNoQuoteString )
            {
            // InternalGumboParser.g:8098:3: (lv_value_0_0= ruleNoQuoteString )
            // InternalGumboParser.g:8099:4: lv_value_0_0= ruleNoQuoteString
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
    // InternalGumboParser.g:8119:1: entryRuleNoQuoteString returns [String current=null] : iv_ruleNoQuoteString= ruleNoQuoteString EOF ;
    public final String entryRuleNoQuoteString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNoQuoteString = null;


        try {
            // InternalGumboParser.g:8119:53: (iv_ruleNoQuoteString= ruleNoQuoteString EOF )
            // InternalGumboParser.g:8120:2: iv_ruleNoQuoteString= ruleNoQuoteString EOF
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
    // InternalGumboParser.g:8126:1: ruleNoQuoteString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleNoQuoteString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalGumboParser.g:8132:2: (this_STRING_0= RULE_STRING )
            // InternalGumboParser.g:8133:2: this_STRING_0= RULE_STRING
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
    // InternalGumboParser.g:8143:1: entryRuleArrayRange returns [EObject current=null] : iv_ruleArrayRange= ruleArrayRange EOF ;
    public final EObject entryRuleArrayRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayRange = null;


        try {
            // InternalGumboParser.g:8143:51: (iv_ruleArrayRange= ruleArrayRange EOF )
            // InternalGumboParser.g:8144:2: iv_ruleArrayRange= ruleArrayRange EOF
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
    // InternalGumboParser.g:8150:1: ruleArrayRange returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleArrayRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_lowerBound_2_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_4_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:8156:2: ( ( () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket ) )
            // InternalGumboParser.g:8157:2: ( () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket )
            {
            // InternalGumboParser.g:8157:2: ( () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket )
            // InternalGumboParser.g:8158:3: () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket
            {
            // InternalGumboParser.g:8158:3: ()
            // InternalGumboParser.g:8159:4: 
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

            otherlv_1=(Token)match(input,LeftSquareBracket,FollowSets000.FOLLOW_101); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getArrayRangeAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalGumboParser.g:8172:3: ( (lv_lowerBound_2_0= ruleINTVALUE ) )
            // InternalGumboParser.g:8173:4: (lv_lowerBound_2_0= ruleINTVALUE )
            {
            // InternalGumboParser.g:8173:4: (lv_lowerBound_2_0= ruleINTVALUE )
            // InternalGumboParser.g:8174:5: lv_lowerBound_2_0= ruleINTVALUE
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArrayRangeAccess().getLowerBoundINTVALUEParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_102);
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

            // InternalGumboParser.g:8191:3: (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==FullStopFullStop) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // InternalGumboParser.g:8192:4: otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) )
                    {
                    otherlv_3=(Token)match(input,FullStopFullStop,FollowSets000.FOLLOW_101); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getArrayRangeAccess().getFullStopFullStopKeyword_3_0());
                      			
                    }
                    // InternalGumboParser.g:8196:4: ( (lv_upperBound_4_0= ruleINTVALUE ) )
                    // InternalGumboParser.g:8197:5: (lv_upperBound_4_0= ruleINTVALUE )
                    {
                    // InternalGumboParser.g:8197:5: (lv_upperBound_4_0= ruleINTVALUE )
                    // InternalGumboParser.g:8198:6: lv_upperBound_4_0= ruleINTVALUE
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getArrayRangeAccess().getUpperBoundINTVALUEParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_103);
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
    // InternalGumboParser.g:8224:1: entryRuleSignedConstant returns [EObject current=null] : iv_ruleSignedConstant= ruleSignedConstant EOF ;
    public final EObject entryRuleSignedConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignedConstant = null;


        try {
            // InternalGumboParser.g:8224:55: (iv_ruleSignedConstant= ruleSignedConstant EOF )
            // InternalGumboParser.g:8225:2: iv_ruleSignedConstant= ruleSignedConstant EOF
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
    // InternalGumboParser.g:8231:1: ruleSignedConstant returns [EObject current=null] : ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) ) ;
    public final EObject ruleSignedConstant() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_ownedPropertyExpression_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:8237:2: ( ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) ) )
            // InternalGumboParser.g:8238:2: ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) )
            {
            // InternalGumboParser.g:8238:2: ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) )
            // InternalGumboParser.g:8239:3: ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) )
            {
            // InternalGumboParser.g:8239:3: ( (lv_op_0_0= rulePlusMinus ) )
            // InternalGumboParser.g:8240:4: (lv_op_0_0= rulePlusMinus )
            {
            // InternalGumboParser.g:8240:4: (lv_op_0_0= rulePlusMinus )
            // InternalGumboParser.g:8241:5: lv_op_0_0= rulePlusMinus
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSignedConstantAccess().getOpPlusMinusParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_104);
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

            // InternalGumboParser.g:8258:3: ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) )
            // InternalGumboParser.g:8259:4: (lv_ownedPropertyExpression_1_0= ruleConstantValue )
            {
            // InternalGumboParser.g:8259:4: (lv_ownedPropertyExpression_1_0= ruleConstantValue )
            // InternalGumboParser.g:8260:5: lv_ownedPropertyExpression_1_0= ruleConstantValue
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
    // InternalGumboParser.g:8281:1: entryRuleIntegerTerm returns [EObject current=null] : iv_ruleIntegerTerm= ruleIntegerTerm EOF ;
    public final EObject entryRuleIntegerTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerTerm = null;


        try {
            // InternalGumboParser.g:8281:52: (iv_ruleIntegerTerm= ruleIntegerTerm EOF )
            // InternalGumboParser.g:8282:2: iv_ruleIntegerTerm= ruleIntegerTerm EOF
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
    // InternalGumboParser.g:8288:1: ruleIntegerTerm returns [EObject current=null] : ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? ) ;
    public final EObject ruleIntegerTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:8294:2: ( ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? ) )
            // InternalGumboParser.g:8295:2: ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? )
            {
            // InternalGumboParser.g:8295:2: ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? )
            // InternalGumboParser.g:8296:3: ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )?
            {
            // InternalGumboParser.g:8296:3: ( (lv_value_0_0= ruleSignedInt ) )
            // InternalGumboParser.g:8297:4: (lv_value_0_0= ruleSignedInt )
            {
            // InternalGumboParser.g:8297:4: (lv_value_0_0= ruleSignedInt )
            // InternalGumboParser.g:8298:5: lv_value_0_0= ruleSignedInt
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

            // InternalGumboParser.g:8315:3: ( (otherlv_1= RULE_ID ) )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==RULE_ID) ) {
                alt148=1;
            }
            switch (alt148) {
                case 1 :
                    // InternalGumboParser.g:8316:4: (otherlv_1= RULE_ID )
                    {
                    // InternalGumboParser.g:8316:4: (otherlv_1= RULE_ID )
                    // InternalGumboParser.g:8317:5: otherlv_1= RULE_ID
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
    // InternalGumboParser.g:8335:1: entryRuleSignedInt returns [String current=null] : iv_ruleSignedInt= ruleSignedInt EOF ;
    public final String entryRuleSignedInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedInt = null;


        try {
            // InternalGumboParser.g:8335:49: (iv_ruleSignedInt= ruleSignedInt EOF )
            // InternalGumboParser.g:8336:2: iv_ruleSignedInt= ruleSignedInt EOF
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
    // InternalGumboParser.g:8342:1: ruleSignedInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT ) ;
    public final AntlrDatatypeRuleToken ruleSignedInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INTEGER_LIT_2=null;


        	enterRule();

        try {
            // InternalGumboParser.g:8348:2: ( ( (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT ) )
            // InternalGumboParser.g:8349:2: ( (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT )
            {
            // InternalGumboParser.g:8349:2: ( (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT )
            // InternalGumboParser.g:8350:3: (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT
            {
            // InternalGumboParser.g:8350:3: (kw= PlusSign | kw= HyphenMinus )?
            int alt149=3;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==PlusSign) ) {
                alt149=1;
            }
            else if ( (LA149_0==HyphenMinus) ) {
                alt149=2;
            }
            switch (alt149) {
                case 1 :
                    // InternalGumboParser.g:8351:4: kw= PlusSign
                    {
                    kw=(Token)match(input,PlusSign,FollowSets000.FOLLOW_101); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSignedIntAccess().getPlusSignKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:8357:4: kw= HyphenMinus
                    {
                    kw=(Token)match(input,HyphenMinus,FollowSets000.FOLLOW_101); if (state.failed) return current;
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
    // InternalGumboParser.g:8374:1: entryRuleRealTerm returns [EObject current=null] : iv_ruleRealTerm= ruleRealTerm EOF ;
    public final EObject entryRuleRealTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealTerm = null;


        try {
            // InternalGumboParser.g:8374:49: (iv_ruleRealTerm= ruleRealTerm EOF )
            // InternalGumboParser.g:8375:2: iv_ruleRealTerm= ruleRealTerm EOF
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
    // InternalGumboParser.g:8381:1: ruleRealTerm returns [EObject current=null] : ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? ) ;
    public final EObject ruleRealTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:8387:2: ( ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? ) )
            // InternalGumboParser.g:8388:2: ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? )
            {
            // InternalGumboParser.g:8388:2: ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? )
            // InternalGumboParser.g:8389:3: ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )?
            {
            // InternalGumboParser.g:8389:3: ( (lv_value_0_0= ruleSignedReal ) )
            // InternalGumboParser.g:8390:4: (lv_value_0_0= ruleSignedReal )
            {
            // InternalGumboParser.g:8390:4: (lv_value_0_0= ruleSignedReal )
            // InternalGumboParser.g:8391:5: lv_value_0_0= ruleSignedReal
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

            // InternalGumboParser.g:8408:3: ( (otherlv_1= RULE_ID ) )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==RULE_ID) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // InternalGumboParser.g:8409:4: (otherlv_1= RULE_ID )
                    {
                    // InternalGumboParser.g:8409:4: (otherlv_1= RULE_ID )
                    // InternalGumboParser.g:8410:5: otherlv_1= RULE_ID
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
    // InternalGumboParser.g:8428:1: entryRuleSignedReal returns [String current=null] : iv_ruleSignedReal= ruleSignedReal EOF ;
    public final String entryRuleSignedReal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedReal = null;


        try {
            // InternalGumboParser.g:8428:50: (iv_ruleSignedReal= ruleSignedReal EOF )
            // InternalGumboParser.g:8429:2: iv_ruleSignedReal= ruleSignedReal EOF
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
    // InternalGumboParser.g:8435:1: ruleSignedReal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT ) ;
    public final AntlrDatatypeRuleToken ruleSignedReal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_REAL_LIT_2=null;


        	enterRule();

        try {
            // InternalGumboParser.g:8441:2: ( ( (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT ) )
            // InternalGumboParser.g:8442:2: ( (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT )
            {
            // InternalGumboParser.g:8442:2: ( (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT )
            // InternalGumboParser.g:8443:3: (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT
            {
            // InternalGumboParser.g:8443:3: (kw= PlusSign | kw= HyphenMinus )?
            int alt151=3;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==PlusSign) ) {
                alt151=1;
            }
            else if ( (LA151_0==HyphenMinus) ) {
                alt151=2;
            }
            switch (alt151) {
                case 1 :
                    // InternalGumboParser.g:8444:4: kw= PlusSign
                    {
                    kw=(Token)match(input,PlusSign,FollowSets000.FOLLOW_105); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSignedRealAccess().getPlusSignKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:8450:4: kw= HyphenMinus
                    {
                    kw=(Token)match(input,HyphenMinus,FollowSets000.FOLLOW_105); if (state.failed) return current;
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
    // InternalGumboParser.g:8467:1: entryRuleNumericRangeTerm returns [EObject current=null] : iv_ruleNumericRangeTerm= ruleNumericRangeTerm EOF ;
    public final EObject entryRuleNumericRangeTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericRangeTerm = null;


        try {
            // InternalGumboParser.g:8467:57: (iv_ruleNumericRangeTerm= ruleNumericRangeTerm EOF )
            // InternalGumboParser.g:8468:2: iv_ruleNumericRangeTerm= ruleNumericRangeTerm EOF
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
    // InternalGumboParser.g:8474:1: ruleNumericRangeTerm returns [EObject current=null] : ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )? ) ;
    public final EObject ruleNumericRangeTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_minimum_0_0 = null;

        EObject lv_maximum_2_0 = null;

        EObject lv_delta_4_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:8480:2: ( ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )? ) )
            // InternalGumboParser.g:8481:2: ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )? )
            {
            // InternalGumboParser.g:8481:2: ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )? )
            // InternalGumboParser.g:8482:3: ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )?
            {
            // InternalGumboParser.g:8482:3: ( (lv_minimum_0_0= ruleNumAlt ) )
            // InternalGumboParser.g:8483:4: (lv_minimum_0_0= ruleNumAlt )
            {
            // InternalGumboParser.g:8483:4: (lv_minimum_0_0= ruleNumAlt )
            // InternalGumboParser.g:8484:5: lv_minimum_0_0= ruleNumAlt
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNumericRangeTermAccess().getMinimumNumAltParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_106);
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

            otherlv_1=(Token)match(input,FullStopFullStop,FollowSets000.FOLLOW_104); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNumericRangeTermAccess().getFullStopFullStopKeyword_1());
              		
            }
            // InternalGumboParser.g:8505:3: ( (lv_maximum_2_0= ruleNumAlt ) )
            // InternalGumboParser.g:8506:4: (lv_maximum_2_0= ruleNumAlt )
            {
            // InternalGumboParser.g:8506:4: (lv_maximum_2_0= ruleNumAlt )
            // InternalGumboParser.g:8507:5: lv_maximum_2_0= ruleNumAlt
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNumericRangeTermAccess().getMaximumNumAltParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_107);
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

            // InternalGumboParser.g:8524:3: (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==Delta) ) {
                alt152=1;
            }
            switch (alt152) {
                case 1 :
                    // InternalGumboParser.g:8525:4: otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) )
                    {
                    otherlv_3=(Token)match(input,Delta,FollowSets000.FOLLOW_104); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getNumericRangeTermAccess().getDeltaKeyword_3_0());
                      			
                    }
                    // InternalGumboParser.g:8529:4: ( (lv_delta_4_0= ruleNumAlt ) )
                    // InternalGumboParser.g:8530:5: (lv_delta_4_0= ruleNumAlt )
                    {
                    // InternalGumboParser.g:8530:5: (lv_delta_4_0= ruleNumAlt )
                    // InternalGumboParser.g:8531:6: lv_delta_4_0= ruleNumAlt
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
    // InternalGumboParser.g:8553:1: entryRuleNumAlt returns [EObject current=null] : iv_ruleNumAlt= ruleNumAlt EOF ;
    public final EObject entryRuleNumAlt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumAlt = null;


        try {
            // InternalGumboParser.g:8553:47: (iv_ruleNumAlt= ruleNumAlt EOF )
            // InternalGumboParser.g:8554:2: iv_ruleNumAlt= ruleNumAlt EOF
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
    // InternalGumboParser.g:8560:1: ruleNumAlt returns [EObject current=null] : (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue ) ;
    public final EObject ruleNumAlt() throws RecognitionException {
        EObject current = null;

        EObject this_RealTerm_0 = null;

        EObject this_IntegerTerm_1 = null;

        EObject this_SignedConstant_2 = null;

        EObject this_ConstantValue_3 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:8566:2: ( (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue ) )
            // InternalGumboParser.g:8567:2: (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue )
            {
            // InternalGumboParser.g:8567:2: (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue )
            int alt153=4;
            switch ( input.LA(1) ) {
            case PlusSign:
                {
                switch ( input.LA(2) ) {
                case RULE_REAL_LIT:
                    {
                    alt153=1;
                    }
                    break;
                case RULE_INTEGER_LIT:
                    {
                    alt153=2;
                    }
                    break;
                case RULE_ID:
                    {
                    alt153=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 153, 1, input);

                    throw nvae;
                }

                }
                break;
            case HyphenMinus:
                {
                switch ( input.LA(2) ) {
                case RULE_INTEGER_LIT:
                    {
                    alt153=2;
                    }
                    break;
                case RULE_REAL_LIT:
                    {
                    alt153=1;
                    }
                    break;
                case RULE_ID:
                    {
                    alt153=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 153, 2, input);

                    throw nvae;
                }

                }
                break;
            case RULE_REAL_LIT:
                {
                alt153=1;
                }
                break;
            case RULE_INTEGER_LIT:
                {
                alt153=2;
                }
                break;
            case RULE_ID:
                {
                alt153=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 153, 0, input);

                throw nvae;
            }

            switch (alt153) {
                case 1 :
                    // InternalGumboParser.g:8568:3: this_RealTerm_0= ruleRealTerm
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
                    // InternalGumboParser.g:8580:3: this_IntegerTerm_1= ruleIntegerTerm
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
                    // InternalGumboParser.g:8592:3: this_SignedConstant_2= ruleSignedConstant
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
                    // InternalGumboParser.g:8604:3: this_ConstantValue_3= ruleConstantValue
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
    // InternalGumboParser.g:8619:1: entryRuleAppliesToKeywords returns [String current=null] : iv_ruleAppliesToKeywords= ruleAppliesToKeywords EOF ;
    public final String entryRuleAppliesToKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAppliesToKeywords = null;


        try {
            // InternalGumboParser.g:8619:57: (iv_ruleAppliesToKeywords= ruleAppliesToKeywords EOF )
            // InternalGumboParser.g:8620:2: iv_ruleAppliesToKeywords= ruleAppliesToKeywords EOF
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
    // InternalGumboParser.g:8626:1: ruleAppliesToKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Applies kw= To ) ;
    public final AntlrDatatypeRuleToken ruleAppliesToKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumboParser.g:8632:2: ( (kw= Applies kw= To ) )
            // InternalGumboParser.g:8633:2: (kw= Applies kw= To )
            {
            // InternalGumboParser.g:8633:2: (kw= Applies kw= To )
            // InternalGumboParser.g:8634:3: kw= Applies kw= To
            {
            kw=(Token)match(input,Applies,FollowSets000.FOLLOW_108); if (state.failed) return current;
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
    // InternalGumboParser.g:8648:1: entryRuleInBindingKeywords returns [String current=null] : iv_ruleInBindingKeywords= ruleInBindingKeywords EOF ;
    public final String entryRuleInBindingKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInBindingKeywords = null;


        try {
            // InternalGumboParser.g:8648:57: (iv_ruleInBindingKeywords= ruleInBindingKeywords EOF )
            // InternalGumboParser.g:8649:2: iv_ruleInBindingKeywords= ruleInBindingKeywords EOF
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
    // InternalGumboParser.g:8655:1: ruleInBindingKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= In_1 kw= Binding ) ;
    public final AntlrDatatypeRuleToken ruleInBindingKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumboParser.g:8661:2: ( (kw= In_1 kw= Binding ) )
            // InternalGumboParser.g:8662:2: (kw= In_1 kw= Binding )
            {
            // InternalGumboParser.g:8662:2: (kw= In_1 kw= Binding )
            // InternalGumboParser.g:8663:3: kw= In_1 kw= Binding
            {
            kw=(Token)match(input,In_1,FollowSets000.FOLLOW_109); if (state.failed) return current;
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
    // InternalGumboParser.g:8677:1: entryRuleInModesKeywords returns [String current=null] : iv_ruleInModesKeywords= ruleInModesKeywords EOF ;
    public final String entryRuleInModesKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInModesKeywords = null;


        try {
            // InternalGumboParser.g:8677:55: (iv_ruleInModesKeywords= ruleInModesKeywords EOF )
            // InternalGumboParser.g:8678:2: iv_ruleInModesKeywords= ruleInModesKeywords EOF
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
    // InternalGumboParser.g:8684:1: ruleInModesKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= In_1 kw= Modes ) ;
    public final AntlrDatatypeRuleToken ruleInModesKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumboParser.g:8690:2: ( (kw= In_1 kw= Modes ) )
            // InternalGumboParser.g:8691:2: (kw= In_1 kw= Modes )
            {
            // InternalGumboParser.g:8691:2: (kw= In_1 kw= Modes )
            // InternalGumboParser.g:8692:3: kw= In_1 kw= Modes
            {
            kw=(Token)match(input,In_1,FollowSets000.FOLLOW_110); if (state.failed) return current;
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
    // InternalGumboParser.g:8706:1: entryRuleINTVALUE returns [String current=null] : iv_ruleINTVALUE= ruleINTVALUE EOF ;
    public final String entryRuleINTVALUE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTVALUE = null;


        try {
            // InternalGumboParser.g:8706:48: (iv_ruleINTVALUE= ruleINTVALUE EOF )
            // InternalGumboParser.g:8707:2: iv_ruleINTVALUE= ruleINTVALUE EOF
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
    // InternalGumboParser.g:8713:1: ruleINTVALUE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INTEGER_LIT_0= RULE_INTEGER_LIT ;
    public final AntlrDatatypeRuleToken ruleINTVALUE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INTEGER_LIT_0=null;


        	enterRule();

        try {
            // InternalGumboParser.g:8719:2: (this_INTEGER_LIT_0= RULE_INTEGER_LIT )
            // InternalGumboParser.g:8720:2: this_INTEGER_LIT_0= RULE_INTEGER_LIT
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
    // InternalGumboParser.g:8730:1: entryRuleQCLREF returns [String current=null] : iv_ruleQCLREF= ruleQCLREF EOF ;
    public final String entryRuleQCLREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQCLREF = null;


        try {
            // InternalGumboParser.g:8730:46: (iv_ruleQCLREF= ruleQCLREF EOF )
            // InternalGumboParser.g:8731:2: iv_ruleQCLREF= ruleQCLREF EOF
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
    // InternalGumboParser.g:8737:1: ruleQCLREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= ColonColon this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleQCLREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalGumboParser.g:8743:2: ( (this_ID_0= RULE_ID kw= ColonColon this_ID_2= RULE_ID ) )
            // InternalGumboParser.g:8744:2: (this_ID_0= RULE_ID kw= ColonColon this_ID_2= RULE_ID )
            {
            // InternalGumboParser.g:8744:2: (this_ID_0= RULE_ID kw= ColonColon this_ID_2= RULE_ID )
            // InternalGumboParser.g:8745:3: this_ID_0= RULE_ID kw= ColonColon this_ID_2= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_111); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQCLREFAccess().getIDTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,ColonColon,FollowSets000.FOLLOW_10); if (state.failed) return current;
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
    // InternalGumboParser.g:8768:1: entryRuleQPREF returns [String current=null] : iv_ruleQPREF= ruleQPREF EOF ;
    public final String entryRuleQPREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQPREF = null;


        try {
            // InternalGumboParser.g:8768:45: (iv_ruleQPREF= ruleQPREF EOF )
            // InternalGumboParser.g:8769:2: iv_ruleQPREF= ruleQPREF EOF
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
    // InternalGumboParser.g:8775:1: ruleQPREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleQPREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalGumboParser.g:8781:2: ( (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )? ) )
            // InternalGumboParser.g:8782:2: (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )? )
            {
            // InternalGumboParser.g:8782:2: (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )? )
            // InternalGumboParser.g:8783:3: this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_112); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQPREFAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalGumboParser.g:8790:3: (kw= ColonColon this_ID_2= RULE_ID )?
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==ColonColon) ) {
                alt154=1;
            }
            switch (alt154) {
                case 1 :
                    // InternalGumboParser.g:8791:4: kw= ColonColon this_ID_2= RULE_ID
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
    // InternalGumboParser.g:8808:1: entryRuleQCREF returns [String current=null] : iv_ruleQCREF= ruleQCREF EOF ;
    public final String entryRuleQCREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQCREF = null;


        try {
            // InternalGumboParser.g:8808:45: (iv_ruleQCREF= ruleQCREF EOF )
            // InternalGumboParser.g:8809:2: iv_ruleQCREF= ruleQCREF EOF
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
    // InternalGumboParser.g:8815:1: ruleQCREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleQCREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;


        	enterRule();

        try {
            // InternalGumboParser.g:8821:2: ( ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? ) )
            // InternalGumboParser.g:8822:2: ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? )
            {
            // InternalGumboParser.g:8822:2: ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? )
            // InternalGumboParser.g:8823:3: (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )?
            {
            // InternalGumboParser.g:8823:3: (this_ID_0= RULE_ID kw= ColonColon )*
            loop155:
            do {
                int alt155=2;
                int LA155_0 = input.LA(1);

                if ( (LA155_0==RULE_ID) ) {
                    int LA155_1 = input.LA(2);

                    if ( (LA155_1==ColonColon) ) {
                        alt155=1;
                    }


                }


                switch (alt155) {
            	case 1 :
            	    // InternalGumboParser.g:8824:4: this_ID_0= RULE_ID kw= ColonColon
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_111); if (state.failed) return current;
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
            	    break loop155;
                }
            } while (true);

            this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_2, grammarAccess.getQCREFAccess().getIDTerminalRuleCall_1());
              		
            }
            // InternalGumboParser.g:8844:3: (kw= FullStop this_ID_4= RULE_ID )?
            int alt156=2;
            int LA156_0 = input.LA(1);

            if ( (LA156_0==FullStop) ) {
                alt156=1;
            }
            switch (alt156) {
                case 1 :
                    // InternalGumboParser.g:8845:4: kw= FullStop this_ID_4= RULE_ID
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
    // InternalGumboParser.g:8862:1: entryRuleSTAR returns [String current=null] : iv_ruleSTAR= ruleSTAR EOF ;
    public final String entryRuleSTAR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSTAR = null;


        try {
            // InternalGumboParser.g:8862:44: (iv_ruleSTAR= ruleSTAR EOF )
            // InternalGumboParser.g:8863:2: iv_ruleSTAR= ruleSTAR EOF
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
    // InternalGumboParser.g:8869:1: ruleSTAR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= Asterisk ;
    public final AntlrDatatypeRuleToken ruleSTAR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumboParser.g:8875:2: (kw= Asterisk )
            // InternalGumboParser.g:8876:2: kw= Asterisk
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

    // $ANTLR start synpred138_InternalGumboParser
    public final void synpred138_InternalGumboParser_fragment() throws RecognitionException {   
        Token otherlv_62=null;
        Token otherlv_64=null;
        EObject lv_p_61_0 = null;

        EObject lv_e_63_0 = null;


        // InternalGumboParser.g:5637:5: ( ( ( ( (lv_p_61_0= ruleSlangParams ) ) otherlv_62= EqualsSignGreaterThanSign )? ( (lv_e_63_0= ruleExpr ) ) otherlv_64= RightCurlyBracket ) )
        // InternalGumboParser.g:5637:5: ( ( ( (lv_p_61_0= ruleSlangParams ) ) otherlv_62= EqualsSignGreaterThanSign )? ( (lv_e_63_0= ruleExpr ) ) otherlv_64= RightCurlyBracket )
        {
        // InternalGumboParser.g:5637:5: ( ( ( (lv_p_61_0= ruleSlangParams ) ) otherlv_62= EqualsSignGreaterThanSign )? ( (lv_e_63_0= ruleExpr ) ) otherlv_64= RightCurlyBracket )
        // InternalGumboParser.g:5638:6: ( ( (lv_p_61_0= ruleSlangParams ) ) otherlv_62= EqualsSignGreaterThanSign )? ( (lv_e_63_0= ruleExpr ) ) otherlv_64= RightCurlyBracket
        {
        // InternalGumboParser.g:5638:6: ( ( (lv_p_61_0= ruleSlangParams ) ) otherlv_62= EqualsSignGreaterThanSign )?
        int alt189=2;
        int LA189_0 = input.LA(1);

        if ( (LA189_0==LeftParenthesis) ) {
            int LA189_1 = input.LA(2);

            if ( (LA189_1==RULE_ID) ) {
                int LA189_3 = input.LA(3);

                if ( (LA189_3==Colon) ) {
                    alt189=1;
                }
            }
            else if ( (LA189_1==Var) ) {
                alt189=1;
            }
        }
        switch (alt189) {
            case 1 :
                // InternalGumboParser.g:5639:7: ( (lv_p_61_0= ruleSlangParams ) ) otherlv_62= EqualsSignGreaterThanSign
                {
                // InternalGumboParser.g:5639:7: ( (lv_p_61_0= ruleSlangParams ) )
                // InternalGumboParser.g:5640:8: (lv_p_61_0= ruleSlangParams )
                {
                // InternalGumboParser.g:5640:8: (lv_p_61_0= ruleSlangParams )
                // InternalGumboParser.g:5641:9: lv_p_61_0= ruleSlangParams
                {
                if ( state.backtracking==0 ) {

                  									newCompositeNode(grammarAccess.getSlangTermAccess().getPSlangParamsParserRuleCall_10_2_0_0_0_0());
                  								
                }
                pushFollow(FollowSets000.FOLLOW_66);
                lv_p_61_0=ruleSlangParams();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                otherlv_62=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_17); if (state.failed) return ;

                }
                break;

        }

        // InternalGumboParser.g:5663:6: ( (lv_e_63_0= ruleExpr ) )
        // InternalGumboParser.g:5664:7: (lv_e_63_0= ruleExpr )
        {
        // InternalGumboParser.g:5664:7: (lv_e_63_0= ruleExpr )
        // InternalGumboParser.g:5665:8: lv_e_63_0= ruleExpr
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getSlangTermAccess().getEExprParserRuleCall_10_2_0_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_79);
        lv_e_63_0=ruleExpr();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_64=(Token)match(input,RightCurlyBracket,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred138_InternalGumboParser

    // Delegated rules

    public final boolean synpred138_InternalGumboParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred138_InternalGumboParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA111 dfa111 = new DFA111(this);
    protected DFA110 dfa110 = new DFA110(this);
    protected DFA139 dfa139 = new DFA139(this);
    static final String dfa_1s = "\27\uffff";
    static final String dfa_2s = "\6\uffff\1\13\7\uffff\1\13\4\uffff\1\25\3\uffff";
    static final String dfa_3s = "\1\15\5\uffff\1\13\3\uffff\1\161\1\uffff\1\30\1\161\1\13\1\30\1\70\1\uffff\1\161\1\13\1\30\1\uffff\1\30";
    static final String dfa_4s = "\1\161\5\uffff\1\161\3\uffff\1\161\1\uffff\4\161\1\121\1\uffff\3\161\1\uffff\1\161";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\11\1\12\1\13\1\uffff\1\10\5\uffff\1\7\3\uffff\1\6\1\uffff";
    static final String dfa_6s = "\27\uffff}>";
    static final String[] dfa_7s = {
            "\1\5\3\uffff\1\4\40\uffff\1\10\14\uffff\1\3\1\uffff\1\7\12\uffff\2\1\3\uffff\1\11\4\uffff\2\1\2\uffff\1\2\1\uffff\2\2\6\uffff\6\1\7\uffff\1\6",
            "",
            "",
            "",
            "",
            "",
            "\1\13\3\uffff\2\13\4\uffff\1\13\2\uffff\2\13\1\uffff\1\13\6\uffff\1\13\1\uffff\1\13\1\uffff\2\13\1\uffff\1\13\1\uffff\2\13\2\uffff\2\13\4\uffff\3\13\1\15\1\13\1\uffff\4\13\2\uffff\6\13\1\12\2\13\1\uffff\1\13\2\uffff\1\13\2\uffff\1\14\1\13\3\uffff\1\13\13\uffff\1\13\16\uffff\1\13",
            "",
            "",
            "",
            "\1\16",
            "",
            "\2\13\1\uffff\1\13\6\uffff\1\13\3\uffff\1\13\2\uffff\1\13\1\uffff\2\13\10\uffff\2\13\6\uffff\2\13\23\uffff\1\13\36\uffff\1\17",
            "\1\20",
            "\1\13\3\uffff\2\13\4\uffff\1\13\2\uffff\2\13\1\uffff\1\13\6\uffff\1\13\1\uffff\1\13\1\uffff\2\13\1\uffff\1\13\1\uffff\2\13\2\uffff\2\13\4\uffff\3\13\1\uffff\1\13\1\uffff\4\13\2\uffff\11\13\1\uffff\1\13\2\uffff\1\13\2\uffff\1\14\1\13\3\uffff\1\13\13\uffff\1\13\16\uffff\1\13",
            "\2\13\1\uffff\1\13\6\uffff\1\13\3\uffff\1\13\4\uffff\2\13\10\uffff\2\13\2\uffff\1\13\3\uffff\2\13\2\uffff\1\13\5\uffff\2\13\1\uffff\1\21\7\uffff\1\13\16\uffff\1\13\17\uffff\1\13",
            "\1\21\16\uffff\1\22\11\uffff\1\21",
            "",
            "\1\23",
            "\1\25\3\uffff\2\25\4\uffff\1\25\2\uffff\2\25\1\uffff\1\25\6\uffff\1\25\1\uffff\1\25\1\uffff\2\25\1\uffff\1\25\1\uffff\2\25\2\uffff\2\25\4\uffff\3\25\1\uffff\1\25\1\uffff\4\25\3\uffff\5\25\1\uffff\2\25\1\uffff\1\25\5\uffff\1\24\1\25\3\uffff\1\25\13\uffff\1\25\16\uffff\1\25",
            "\2\25\1\uffff\1\25\6\uffff\1\25\3\uffff\1\25\2\uffff\1\25\1\uffff\2\25\10\uffff\2\25\6\uffff\2\25\23\uffff\1\25\36\uffff\1\26",
            "",
            "\2\25\1\uffff\1\25\6\uffff\1\25\3\uffff\1\25\4\uffff\2\25\10\uffff\2\25\2\uffff\1\25\3\uffff\2\25\2\uffff\1\25\5\uffff\2\25\1\uffff\1\21\7\uffff\1\25\16\uffff\1\25\17\uffff\1\25"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA111 extends DFA {

        public DFA111(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 111;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "4888:2: ( ( () ( (lv_lit_1_0= ruleSlangLit ) ) ) | ( () ( (lv_i_3_0= ruleSlangInterp ) ) ) | ( ( ( ( () In_1 LeftParenthesis ) )=> ( () otherlv_5= In_1 otherlv_6= LeftParenthesis ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= RightParenthesis ) | ( ( ( ( () MaySend LeftParenthesis ) )=> ( () otherlv_10= MaySend otherlv_11= LeftParenthesis ) ) ( (otherlv_12= RULE_ID ) ) otherlv_13= Comma ( (lv_value_14_0= ruleExpr ) ) otherlv_15= RightParenthesis ) | ( ( ( ( () MustSend LeftParenthesis ) )=> ( () otherlv_17= MustSend otherlv_18= LeftParenthesis ) ) ( (otherlv_19= RULE_ID ) ) otherlv_20= Comma ( (lv_value_21_0= ruleExpr ) ) otherlv_22= RightParenthesis ) | ( ( ( ( () ( ( ruleQCLREF ) ) FullStop ) )=> ( () ( ( ruleQCLREF ) ) otherlv_25= FullStop ) ) ( (otherlv_26= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_28_0= ruleDataElement ) ) otherlv_29= LeftCurlyBracket ( (otherlv_30= RULE_ID ) ) otherlv_31= EqualsSign ) ) ( (lv_argExpr_32_0= ruleExpr ) ) (otherlv_33= Semicolon ( (otherlv_34= RULE_ID ) ) otherlv_35= EqualsSign ( (lv_argExpr_36_0= ruleExpr ) ) )* otherlv_37= RightCurlyBracket ) | ( () ( (otherlv_39= RULE_ID ) ) (otherlv_40= FullStop ( (lv_ref_41_0= ruleOtherDataRef ) ) )? ( (lv_cs_42_0= ruleSlangCallSuffix ) )? ) | ( () otherlv_44= LeftParenthesis ( (lv_e_45_0= ruleExpr ) ) (otherlv_46= Comma ( (lv_e_47_0= ruleExpr ) ) )* otherlv_48= RightParenthesis ) | ( () otherlv_50= For ( (lv_r_51_0= ruleSlangForRange ) ) (otherlv_52= Comma ( (lv_r_53_0= ruleSlangForRange ) ) )* otherlv_54= Yield ( ( (lv_b_55_0= ruleSlangBlock ) ) | (otherlv_56= LeftParenthesis ( (lv_e_57_0= ruleExpr ) ) otherlv_58= RightParenthesis ) ) ) | ( () otherlv_60= LeftCurlyBracket ( ( ( ( (lv_p_61_0= ruleSlangParams ) ) otherlv_62= EqualsSignGreaterThanSign )? ( (lv_e_63_0= ruleExpr ) ) otherlv_64= RightCurlyBracket ) | ( ( (lv_stmt_65_0= ruleSlangStmt ) )* ( (lv_r_66_0= ruleSlangRet ) )? otherlv_67= RightCurlyBracket ) ) ) )";
        }
    }
    static final String dfa_8s = "\51\uffff";
    static final String dfa_9s = "\1\15\21\uffff\1\0\26\uffff";
    static final String dfa_10s = "\1\161\21\uffff\1\0\26\uffff";
    static final String dfa_11s = "\1\uffff\1\1\33\uffff\1\2\13\uffff";
    static final String dfa_12s = "\22\uffff\1\0\26\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\3\uffff\1\1\6\uffff\2\35\1\uffff\1\35\1\uffff\1\1\4\uffff\1\35\3\uffff\1\35\1\uffff\1\1\2\uffff\2\35\5\uffff\1\1\2\uffff\2\35\6\uffff\2\35\1\1\1\uffff\1\1\1\uffff\2\1\1\uffff\1\1\5\uffff\2\1\3\uffff\1\1\1\35\2\1\1\uffff\2\1\2\uffff\1\1\1\uffff\2\1\4\uffff\1\1\1\uffff\6\1\7\uffff\1\22",
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
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA110 extends DFA {

        public DFA110(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 110;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "5636:4: ( ( ( ( (lv_p_61_0= ruleSlangParams ) ) otherlv_62= EqualsSignGreaterThanSign )? ( (lv_e_63_0= ruleExpr ) ) otherlv_64= RightCurlyBracket ) | ( ( (lv_stmt_65_0= ruleSlangStmt ) )* ( (lv_r_66_0= ruleSlangRet ) )? otherlv_67= RightCurlyBracket ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA110_18 = input.LA(1);

                         
                        int index110_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalGumboParser()) ) {s = 1;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index110_18);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 110, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\25\uffff";
    static final String dfa_15s = "\10\uffff\1\17\1\21\1\23\3\uffff\1\17\1\uffff\1\21\3\uffff\1\23";
    static final String dfa_16s = "\1\5\5\uffff\2\146\3\22\3\uffff\1\22\1\uffff\1\22\1\uffff\1\161\1\uffff\1\22";
    static final String dfa_17s = "\1\161\5\uffff\4\161\1\111\3\uffff\1\111\1\uffff\1\111\1\uffff\1\161\1\uffff\1\111";
    static final String dfa_18s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\5\uffff\1\11\1\12\1\6\1\uffff\1\7\1\uffff\1\10\1\uffff\1\13\1\uffff";
    static final String dfa_19s = "\25\uffff}>";
    static final String[] dfa_20s = {
            "\1\3\6\uffff\1\2\7\uffff\1\4\13\uffff\1\14\14\uffff\1\14\23\uffff\1\13\2\uffff\1\6\1\uffff\1\7\7\uffff\1\1\27\uffff\1\11\1\uffff\1\10\7\uffff\1\5\1\12",
            "",
            "",
            "",
            "",
            "",
            "\1\11\1\uffff\1\10\10\uffff\1\15",
            "\1\11\1\uffff\1\10\10\uffff\1\15",
            "\1\17\44\uffff\1\15\7\uffff\1\17\2\uffff\1\17\2\uffff\1\17\3\uffff\1\17\47\uffff\1\16",
            "\1\21\44\uffff\1\15\7\uffff\1\21\2\uffff\1\21\2\uffff\1\21\3\uffff\1\21\47\uffff\1\20",
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

    class DFA139 extends DFA {

        public DFA139(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 139;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "7374:2: (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000001002D2L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000001000D2L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100052L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100042L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0008000000000002L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400100L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x8004010020022000L,0x000203F434DA305AL});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000400L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000402L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002008400L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002008402L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040008400L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000020004000002L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000044008402L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000400L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004080L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0002000000000002L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x8014110030822000L,0x000203F434DA305AL});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004102L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000102L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0200100000000000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000024L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0800000000000000L,0x0002000000000000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0010000000000000L,0x0002000000000000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008020L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000021000218002L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000218002L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000208002L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000210002L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000008800L,0x0000000000020000L});
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000020000000000L,0x0000000000040000L});
        public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
        public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0200000000000002L,0x0000000200000182L});
        public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0200000000000002L,0x0000000200000082L});
        public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x4000000000000000L,0x0000000000020000L});
        public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x8004010020022000L,0x000203F434DA305EL});
        public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000002L});
        public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x4800000000000000L});
        public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x6060184403000002L,0x0002000000000000L});
        public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
        public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0002000000010002L});
        public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000102L});
        public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
        public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000100L});
        public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x8004010020022002L,0x000203F434DA385AL});
        public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x8004000000022000L,0x000203F034C23002L});
        public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x8004010020022002L,0x000203F434DA305AL});
        public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0081000000000002L});
        public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x606018440B000000L,0x0002000000040000L});
        public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
        public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
        public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
        public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040200L});
        public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004082L});
        public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004002L});
        public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020002L});
        public static final BitSet FOLLOW_89 = new BitSet(new long[]{0xE06419442B022000L,0x000203F434DE305AL});
        public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0040000000000000L,0x0002000000000000L});
        public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x1000000000000002L});
        public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0200000000000002L});
        public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000000L,0x00000000C0000000L});
        public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0800400000000000L});
        public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000200100105020L,0x0003014000004052L});
        public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x8000000000040000L,0x0000000000000220L});
        public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000220L});
        public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x8000000000000002L});
        public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000000000L,0x0002000000008000L});
        public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000200100105020L,0x0003014000004056L});
        public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
        public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0080000000000000L,0x0000000000008000L});
        public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
        public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000000000L,0x0002014000000050L});
        public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
        public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x0100000000000002L});
    }


}