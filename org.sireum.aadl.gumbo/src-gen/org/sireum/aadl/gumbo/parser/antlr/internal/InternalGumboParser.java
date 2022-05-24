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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Integration", "Classifier", "Initialize", "Invariants", "Extension", "Functions", "Guarantee", "Invariant", "Reference", "Constant", "Modifies", "Requires", "Applies", "Binding", "Compute", "Ensures", "Library", "Memoize", "Assert", "Assume", "Return", "Strict", "Some", "Delta", "False", "Gumbo", "Match", "Modes", "Reads", "State", "While", "Yield", "All", "Case", "Else", "Enum", "Halt", "Spec", "True", "PlusSignEqualsSignGreaterThanSign", "FullStopFullStopLessThanSign", "Def", "For", "Inv", "Mut", "Val", "Var", "FullStopFullStop", "ColonColon", "ColonEqualsSign", "LessThanSignColon", "EqualsSignGreaterThanSign", "By", "Do", "If", "In_1", "To", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "FullStop", "Colon", "Semicolon", "EqualsSign", "QuestionMark", "F", "T", "LeftSquareBracket", "RightSquareBracket", "KW__", "LeftCurlyBracket", "RightCurlyBracket", "ForAll", "ThereExists", "RULE_ESC_SEQ", "RULE_SLANG_STRING", "RULE_MSTRING", "RULE_IDF", "RULE_MSPI", "RULE_MSP", "RULE_DIGIT", "RULE_SLI", "RULE_MSPB", "RULE_MSPM", "RULE_MSPE", "RULE_OPSYM", "RULE_DEFOP", "RULE_OP", "RULE_EXTENDED_DIGIT", "RULE_HEX", "RULE_BIN", "RULE_INTEGER_LIT", "RULE_INT_IDF", "RULE_REAL_LIT", "RULE_REAL_IDF", "RULE_LETTER", "RULE_UNICODE_ESC", "RULE_SL_COMMENT", "RULE_EXPONENT", "RULE_INT_EXPONENT", "RULE_BASED_INTEGER", "RULE_STRING", "RULE_ID", "RULE_WS"
    };
    public static final int Enum=39;
    public static final int Val=49;
    public static final int RULE_HEX=96;
    public static final int EqualsSignGreaterThanSign=55;
    public static final int Var=50;
    public static final int False=28;
    public static final int Initialize=6;
    public static final int Invariants=7;
    public static final int Assert=22;
    public static final int PlusSignEqualsSignGreaterThanSign=43;
    public static final int LeftParenthesis=61;
    public static final int RULE_MSTRING=83;
    public static final int RULE_SLANG_STRING=82;
    public static final int RULE_OP=94;
    public static final int RULE_BIN=97;
    public static final int RULE_ESC_SEQ=81;
    public static final int RULE_ID=109;
    public static final int RULE_DIGIT=87;
    public static final int ColonColon=52;
    public static final int Some=26;
    public static final int RULE_REAL_IDF=101;
    public static final int PlusSign=64;
    public static final int LeftSquareBracket=74;
    public static final int If=58;
    public static final int Halt=40;
    public static final int F=72;
    public static final int ThereExists=80;
    public static final int RULE_REAL_LIT=100;
    public static final int Classifier=5;
    public static final int Case=37;
    public static final int Comma=65;
    public static final int HyphenMinus=66;
    public static final int T=73;
    public static final int RULE_MSPE=91;
    public static final int Guarantee=10;
    public static final int RightCurlyBracket=78;
    public static final int RULE_MSPB=89;
    public static final int Modes=31;
    public static final int FullStop=67;
    public static final int Reference=12;
    public static final int RULE_UNICODE_ESC=103;
    public static final int Functions=9;
    public static final int KW__=76;
    public static final int Semicolon=69;
    public static final int RULE_LETTER=102;
    public static final int RULE_EXPONENT=105;
    public static final int Delta=27;
    public static final int QuestionMark=71;
    public static final int RULE_SLI=88;
    public static final int Memoize=21;
    public static final int By=56;
    public static final int Else=38;
    public static final int RULE_EXTENDED_DIGIT=95;
    public static final int Yield=35;
    public static final int All=36;
    public static final int True=42;
    public static final int RULE_INT_EXPONENT=106;
    public static final int In_1=59;
    public static final int FullStopFullStop=51;
    public static final int LessThanSignColon=54;
    public static final int Ensures=19;
    public static final int To=60;
    public static final int Applies=16;
    public static final int RULE_MSP=86;
    public static final int RULE_BASED_INTEGER=107;
    public static final int RightSquareBracket=75;
    public static final int Binding=17;
    public static final int RULE_MSPM=90;
    public static final int RULE_DEFOP=93;
    public static final int RULE_MSPI=85;
    public static final int Requires=15;
    public static final int For=46;
    public static final int RightParenthesis=62;
    public static final int Do=57;
    public static final int ColonEqualsSign=53;
    public static final int Mut=48;
    public static final int Gumbo=29;
    public static final int State=33;
    public static final int Assume=23;
    public static final int Library=20;
    public static final int RULE_INTEGER_LIT=98;
    public static final int Invariant=11;
    public static final int Constant=13;
    public static final int RULE_STRING=108;
    public static final int Match=30;
    public static final int Reads=32;
    public static final int RULE_SL_COMMENT=104;
    public static final int Inv=47;
    public static final int EqualsSign=70;
    public static final int Modifies=14;
    public static final int Strict=25;
    public static final int Colon=68;
    public static final int EOF=-1;
    public static final int Asterisk=63;
    public static final int Integration=4;
    public static final int RULE_OPSYM=92;
    public static final int Return=24;
    public static final int Def=45;
    public static final int RULE_WS=110;
    public static final int LeftCurlyBracket=77;
    public static final int RULE_INT_IDF=99;
    public static final int While=34;
    public static final int Extension=8;
    public static final int FullStopFullStopLessThanSign=44;
    public static final int RULE_IDF=84;
    public static final int Compute=18;
    public static final int Spec=41;
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
    // InternalGumboParser.g:182:1: ruleSpecSection returns [EObject current=null] : ( () ( (lv_state_1_0= ruleState ) )? ( (lv_functions_2_0= ruleFunctions ) )? ( (lv_invariants_3_0= ruleInvariants ) )? ( (lv_integration_4_0= ruleIntegration ) )? ( (lv_initialize_5_0= ruleInitialize ) )? ( (lv_compute_6_0= ruleCompute ) )? ) ;
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
            // InternalGumboParser.g:188:2: ( ( () ( (lv_state_1_0= ruleState ) )? ( (lv_functions_2_0= ruleFunctions ) )? ( (lv_invariants_3_0= ruleInvariants ) )? ( (lv_integration_4_0= ruleIntegration ) )? ( (lv_initialize_5_0= ruleInitialize ) )? ( (lv_compute_6_0= ruleCompute ) )? ) )
            // InternalGumboParser.g:189:2: ( () ( (lv_state_1_0= ruleState ) )? ( (lv_functions_2_0= ruleFunctions ) )? ( (lv_invariants_3_0= ruleInvariants ) )? ( (lv_integration_4_0= ruleIntegration ) )? ( (lv_initialize_5_0= ruleInitialize ) )? ( (lv_compute_6_0= ruleCompute ) )? )
            {
            // InternalGumboParser.g:189:2: ( () ( (lv_state_1_0= ruleState ) )? ( (lv_functions_2_0= ruleFunctions ) )? ( (lv_invariants_3_0= ruleInvariants ) )? ( (lv_integration_4_0= ruleIntegration ) )? ( (lv_initialize_5_0= ruleInitialize ) )? ( (lv_compute_6_0= ruleCompute ) )? )
            // InternalGumboParser.g:190:3: () ( (lv_state_1_0= ruleState ) )? ( (lv_functions_2_0= ruleFunctions ) )? ( (lv_invariants_3_0= ruleInvariants ) )? ( (lv_integration_4_0= ruleIntegration ) )? ( (lv_initialize_5_0= ruleInitialize ) )? ( (lv_compute_6_0= ruleCompute ) )?
            {
            // InternalGumboParser.g:190:3: ()
            // InternalGumboParser.g:191:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSpecSectionAccess().getSpecSectionAction_0(),
              					current);
              			
            }

            }

            // InternalGumboParser.g:197:3: ( (lv_state_1_0= ruleState ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==State) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalGumboParser.g:198:4: (lv_state_1_0= ruleState )
                    {
                    // InternalGumboParser.g:198:4: (lv_state_1_0= ruleState )
                    // InternalGumboParser.g:199:5: lv_state_1_0= ruleState
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

            // InternalGumboParser.g:216:3: ( (lv_functions_2_0= ruleFunctions ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==Functions) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGumboParser.g:217:4: (lv_functions_2_0= ruleFunctions )
                    {
                    // InternalGumboParser.g:217:4: (lv_functions_2_0= ruleFunctions )
                    // InternalGumboParser.g:218:5: lv_functions_2_0= ruleFunctions
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

            // InternalGumboParser.g:235:3: ( (lv_invariants_3_0= ruleInvariants ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Invariants) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalGumboParser.g:236:4: (lv_invariants_3_0= ruleInvariants )
                    {
                    // InternalGumboParser.g:236:4: (lv_invariants_3_0= ruleInvariants )
                    // InternalGumboParser.g:237:5: lv_invariants_3_0= ruleInvariants
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

            // InternalGumboParser.g:254:3: ( (lv_integration_4_0= ruleIntegration ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Integration) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalGumboParser.g:255:4: (lv_integration_4_0= ruleIntegration )
                    {
                    // InternalGumboParser.g:255:4: (lv_integration_4_0= ruleIntegration )
                    // InternalGumboParser.g:256:5: lv_integration_4_0= ruleIntegration
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

            // InternalGumboParser.g:273:3: ( (lv_initialize_5_0= ruleInitialize ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Initialize) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGumboParser.g:274:4: (lv_initialize_5_0= ruleInitialize )
                    {
                    // InternalGumboParser.g:274:4: (lv_initialize_5_0= ruleInitialize )
                    // InternalGumboParser.g:275:5: lv_initialize_5_0= ruleInitialize
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

            // InternalGumboParser.g:292:3: ( (lv_compute_6_0= ruleCompute ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Compute) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGumboParser.g:293:4: (lv_compute_6_0= ruleCompute )
                    {
                    // InternalGumboParser.g:293:4: (lv_compute_6_0= ruleCompute )
                    // InternalGumboParser.g:294:5: lv_compute_6_0= ruleCompute
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
    // InternalGumboParser.g:315:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalGumboParser.g:315:46: (iv_ruleState= ruleState EOF )
            // InternalGumboParser.g:316:2: iv_ruleState= ruleState EOF
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
    // InternalGumboParser.g:322:1: ruleState returns [EObject current=null] : (otherlv_0= State ( (lv_decls_1_0= ruleStateVarDecl ) )+ ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_decls_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:328:2: ( (otherlv_0= State ( (lv_decls_1_0= ruleStateVarDecl ) )+ ) )
            // InternalGumboParser.g:329:2: (otherlv_0= State ( (lv_decls_1_0= ruleStateVarDecl ) )+ )
            {
            // InternalGumboParser.g:329:2: (otherlv_0= State ( (lv_decls_1_0= ruleStateVarDecl ) )+ )
            // InternalGumboParser.g:330:3: otherlv_0= State ( (lv_decls_1_0= ruleStateVarDecl ) )+
            {
            otherlv_0=(Token)match(input,State,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
              		
            }
            // InternalGumboParser.g:334:3: ( (lv_decls_1_0= ruleStateVarDecl ) )+
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
            	    // InternalGumboParser.g:335:4: (lv_decls_1_0= ruleStateVarDecl )
            	    {
            	    // InternalGumboParser.g:335:4: (lv_decls_1_0= ruleStateVarDecl )
            	    // InternalGumboParser.g:336:5: lv_decls_1_0= ruleStateVarDecl
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
    // InternalGumboParser.g:357:1: entryRuleStateVarDecl returns [EObject current=null] : iv_ruleStateVarDecl= ruleStateVarDecl EOF ;
    public final EObject entryRuleStateVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateVarDecl = null;


        try {
            // InternalGumboParser.g:357:53: (iv_ruleStateVarDecl= ruleStateVarDecl EOF )
            // InternalGumboParser.g:358:2: iv_ruleStateVarDecl= ruleStateVarDecl EOF
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
    // InternalGumboParser.g:364:1: ruleStateVarDecl returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ) ( ( ruleQCREF ) ) otherlv_3= Semicolon ) ;
    public final EObject ruleStateVarDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalGumboParser.g:370:2: ( ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ) ( ( ruleQCREF ) ) otherlv_3= Semicolon ) )
            // InternalGumboParser.g:371:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ) ( ( ruleQCREF ) ) otherlv_3= Semicolon )
            {
            // InternalGumboParser.g:371:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ) ( ( ruleQCREF ) ) otherlv_3= Semicolon )
            // InternalGumboParser.g:372:3: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ) ( ( ruleQCREF ) ) otherlv_3= Semicolon
            {
            // InternalGumboParser.g:372:3: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon )
            // InternalGumboParser.g:373:4: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon
            {
            // InternalGumboParser.g:373:4: ( (lv_name_0_0= RULE_ID ) )
            // InternalGumboParser.g:374:5: (lv_name_0_0= RULE_ID )
            {
            // InternalGumboParser.g:374:5: (lv_name_0_0= RULE_ID )
            // InternalGumboParser.g:375:6: lv_name_0_0= RULE_ID
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

            // InternalGumboParser.g:396:3: ( ( ruleQCREF ) )
            // InternalGumboParser.g:397:4: ( ruleQCREF )
            {
            // InternalGumboParser.g:397:4: ( ruleQCREF )
            // InternalGumboParser.g:398:5: ruleQCREF
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
    // InternalGumboParser.g:420:1: entryRuleInvariants returns [EObject current=null] : iv_ruleInvariants= ruleInvariants EOF ;
    public final EObject entryRuleInvariants() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariants = null;


        try {
            // InternalGumboParser.g:420:51: (iv_ruleInvariants= ruleInvariants EOF )
            // InternalGumboParser.g:421:2: iv_ruleInvariants= ruleInvariants EOF
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
    // InternalGumboParser.g:427:1: ruleInvariants returns [EObject current=null] : (otherlv_0= Invariants ( (lv_specs_1_0= ruleInvSpec ) )+ ) ;
    public final EObject ruleInvariants() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_specs_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:433:2: ( (otherlv_0= Invariants ( (lv_specs_1_0= ruleInvSpec ) )+ ) )
            // InternalGumboParser.g:434:2: (otherlv_0= Invariants ( (lv_specs_1_0= ruleInvSpec ) )+ )
            {
            // InternalGumboParser.g:434:2: (otherlv_0= Invariants ( (lv_specs_1_0= ruleInvSpec ) )+ )
            // InternalGumboParser.g:435:3: otherlv_0= Invariants ( (lv_specs_1_0= ruleInvSpec ) )+
            {
            otherlv_0=(Token)match(input,Invariants,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInvariantsAccess().getInvariantsKeyword_0());
              		
            }
            // InternalGumboParser.g:439:3: ( (lv_specs_1_0= ruleInvSpec ) )+
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
            	    // InternalGumboParser.g:440:4: (lv_specs_1_0= ruleInvSpec )
            	    {
            	    // InternalGumboParser.g:440:4: (lv_specs_1_0= ruleInvSpec )
            	    // InternalGumboParser.g:441:5: lv_specs_1_0= ruleInvSpec
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
    // InternalGumboParser.g:462:1: entryRuleInvSpec returns [EObject current=null] : iv_ruleInvSpec= ruleInvSpec EOF ;
    public final EObject entryRuleInvSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvSpec = null;


        try {
            // InternalGumboParser.g:462:48: (iv_ruleInvSpec= ruleInvSpec EOF )
            // InternalGumboParser.g:463:2: iv_ruleInvSpec= ruleInvSpec EOF
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
    // InternalGumboParser.g:469:1: ruleInvSpec returns [EObject current=null] : (otherlv_0= Inv ( (lv_displayName_1_0= RULE_SLANG_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon ) ;
    public final EObject ruleInvSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_displayName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expr_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:475:2: ( (otherlv_0= Inv ( (lv_displayName_1_0= RULE_SLANG_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon ) )
            // InternalGumboParser.g:476:2: (otherlv_0= Inv ( (lv_displayName_1_0= RULE_SLANG_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon )
            {
            // InternalGumboParser.g:476:2: (otherlv_0= Inv ( (lv_displayName_1_0= RULE_SLANG_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon )
            // InternalGumboParser.g:477:3: otherlv_0= Inv ( (lv_displayName_1_0= RULE_SLANG_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon
            {
            otherlv_0=(Token)match(input,Inv,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInvSpecAccess().getInvKeyword_0());
              		
            }
            // InternalGumboParser.g:481:3: ( (lv_displayName_1_0= RULE_SLANG_STRING ) )
            // InternalGumboParser.g:482:4: (lv_displayName_1_0= RULE_SLANG_STRING )
            {
            // InternalGumboParser.g:482:4: (lv_displayName_1_0= RULE_SLANG_STRING )
            // InternalGumboParser.g:483:5: lv_displayName_1_0= RULE_SLANG_STRING
            {
            lv_displayName_1_0=(Token)match(input,RULE_SLANG_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_displayName_1_0, grammarAccess.getInvSpecAccess().getDisplayNameSLANG_STRINGTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getInvSpecRule());
              					}
              					setWithLastConsumed(
              						current,
              						"displayName",
              						lv_displayName_1_0,
              						"org.sireum.aadl.gumbo.Gumbo.SLANG_STRING");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,Colon,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getInvSpecAccess().getColonKeyword_2());
              		
            }
            // InternalGumboParser.g:503:3: ( (lv_expr_3_0= ruleExpr ) )
            // InternalGumboParser.g:504:4: (lv_expr_3_0= ruleExpr )
            {
            // InternalGumboParser.g:504:4: (lv_expr_3_0= ruleExpr )
            // InternalGumboParser.g:505:5: lv_expr_3_0= ruleExpr
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
    // InternalGumboParser.g:530:1: entryRuleIntegration returns [EObject current=null] : iv_ruleIntegration= ruleIntegration EOF ;
    public final EObject entryRuleIntegration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegration = null;


        try {
            // InternalGumboParser.g:530:52: (iv_ruleIntegration= ruleIntegration EOF )
            // InternalGumboParser.g:531:2: iv_ruleIntegration= ruleIntegration EOF
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
    // InternalGumboParser.g:537:1: ruleIntegration returns [EObject current=null] : (otherlv_0= Integration ( (lv_specs_1_0= ruleSpecStatement ) )+ ) ;
    public final EObject ruleIntegration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_specs_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:543:2: ( (otherlv_0= Integration ( (lv_specs_1_0= ruleSpecStatement ) )+ ) )
            // InternalGumboParser.g:544:2: (otherlv_0= Integration ( (lv_specs_1_0= ruleSpecStatement ) )+ )
            {
            // InternalGumboParser.g:544:2: (otherlv_0= Integration ( (lv_specs_1_0= ruleSpecStatement ) )+ )
            // InternalGumboParser.g:545:3: otherlv_0= Integration ( (lv_specs_1_0= ruleSpecStatement ) )+
            {
            otherlv_0=(Token)match(input,Integration,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIntegrationAccess().getIntegrationKeyword_0());
              		
            }
            // InternalGumboParser.g:549:3: ( (lv_specs_1_0= ruleSpecStatement ) )+
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
            	    // InternalGumboParser.g:550:4: (lv_specs_1_0= ruleSpecStatement )
            	    {
            	    // InternalGumboParser.g:550:4: (lv_specs_1_0= ruleSpecStatement )
            	    // InternalGumboParser.g:551:5: lv_specs_1_0= ruleSpecStatement
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
    // InternalGumboParser.g:572:1: entryRuleInitialize returns [EObject current=null] : iv_ruleInitialize= ruleInitialize EOF ;
    public final EObject entryRuleInitialize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialize = null;


        try {
            // InternalGumboParser.g:572:51: (iv_ruleInitialize= ruleInitialize EOF )
            // InternalGumboParser.g:573:2: iv_ruleInitialize= ruleInitialize EOF
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
    // InternalGumboParser.g:579:1: ruleInitialize returns [EObject current=null] : (otherlv_0= Initialize ( (lv_modifies_1_0= ruleSlangModifies ) )? ( (lv_specs_2_0= ruleInitializeSpecStatement ) )+ ) ;
    public final EObject ruleInitialize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_modifies_1_0 = null;

        EObject lv_specs_2_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:585:2: ( (otherlv_0= Initialize ( (lv_modifies_1_0= ruleSlangModifies ) )? ( (lv_specs_2_0= ruleInitializeSpecStatement ) )+ ) )
            // InternalGumboParser.g:586:2: (otherlv_0= Initialize ( (lv_modifies_1_0= ruleSlangModifies ) )? ( (lv_specs_2_0= ruleInitializeSpecStatement ) )+ )
            {
            // InternalGumboParser.g:586:2: (otherlv_0= Initialize ( (lv_modifies_1_0= ruleSlangModifies ) )? ( (lv_specs_2_0= ruleInitializeSpecStatement ) )+ )
            // InternalGumboParser.g:587:3: otherlv_0= Initialize ( (lv_modifies_1_0= ruleSlangModifies ) )? ( (lv_specs_2_0= ruleInitializeSpecStatement ) )+
            {
            otherlv_0=(Token)match(input,Initialize,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInitializeAccess().getInitializeKeyword_0());
              		
            }
            // InternalGumboParser.g:591:3: ( (lv_modifies_1_0= ruleSlangModifies ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Modifies) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGumboParser.g:592:4: (lv_modifies_1_0= ruleSlangModifies )
                    {
                    // InternalGumboParser.g:592:4: (lv_modifies_1_0= ruleSlangModifies )
                    // InternalGumboParser.g:593:5: lv_modifies_1_0= ruleSlangModifies
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getInitializeAccess().getModifiesSlangModifiesParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_20);
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
                    break;

            }

            // InternalGumboParser.g:610:3: ( (lv_specs_2_0= ruleInitializeSpecStatement ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==Guarantee) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGumboParser.g:611:4: (lv_specs_2_0= ruleInitializeSpecStatement )
            	    {
            	    // InternalGumboParser.g:611:4: (lv_specs_2_0= ruleInitializeSpecStatement )
            	    // InternalGumboParser.g:612:5: lv_specs_2_0= ruleInitializeSpecStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getInitializeAccess().getSpecsInitializeSpecStatementParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    lv_specs_2_0=ruleInitializeSpecStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getInitializeRule());
            	      					}
            	      					add(
            	      						current,
            	      						"specs",
            	      						lv_specs_2_0,
            	      						"org.sireum.aadl.gumbo.Gumbo.InitializeSpecStatement");
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
    // $ANTLR end "ruleInitialize"


    // $ANTLR start "entryRuleInitializeSpecStatement"
    // InternalGumboParser.g:633:1: entryRuleInitializeSpecStatement returns [EObject current=null] : iv_ruleInitializeSpecStatement= ruleInitializeSpecStatement EOF ;
    public final EObject entryRuleInitializeSpecStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitializeSpecStatement = null;


        try {
            // InternalGumboParser.g:633:64: (iv_ruleInitializeSpecStatement= ruleInitializeSpecStatement EOF )
            // InternalGumboParser.g:634:2: iv_ruleInitializeSpecStatement= ruleInitializeSpecStatement EOF
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
    // InternalGumboParser.g:640:1: ruleInitializeSpecStatement returns [EObject current=null] : ( (lv_guaranteeStatement_0_0= ruleGuaranteeStatement ) ) ;
    public final EObject ruleInitializeSpecStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_guaranteeStatement_0_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:646:2: ( ( (lv_guaranteeStatement_0_0= ruleGuaranteeStatement ) ) )
            // InternalGumboParser.g:647:2: ( (lv_guaranteeStatement_0_0= ruleGuaranteeStatement ) )
            {
            // InternalGumboParser.g:647:2: ( (lv_guaranteeStatement_0_0= ruleGuaranteeStatement ) )
            // InternalGumboParser.g:648:3: (lv_guaranteeStatement_0_0= ruleGuaranteeStatement )
            {
            // InternalGumboParser.g:648:3: (lv_guaranteeStatement_0_0= ruleGuaranteeStatement )
            // InternalGumboParser.g:649:4: lv_guaranteeStatement_0_0= ruleGuaranteeStatement
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
    // InternalGumboParser.g:669:1: entryRuleCompute returns [EObject current=null] : iv_ruleCompute= ruleCompute EOF ;
    public final EObject entryRuleCompute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompute = null;


        try {
            // InternalGumboParser.g:669:48: (iv_ruleCompute= ruleCompute EOF )
            // InternalGumboParser.g:670:2: iv_ruleCompute= ruleCompute EOF
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
    // InternalGumboParser.g:676:1: ruleCompute returns [EObject current=null] : (otherlv_0= Compute ( (lv_modifies_1_0= ruleSlangModifies ) )? ( (lv_cases_2_0= ruleCaseStatementClause ) )+ ) ;
    public final EObject ruleCompute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_modifies_1_0 = null;

        EObject lv_cases_2_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:682:2: ( (otherlv_0= Compute ( (lv_modifies_1_0= ruleSlangModifies ) )? ( (lv_cases_2_0= ruleCaseStatementClause ) )+ ) )
            // InternalGumboParser.g:683:2: (otherlv_0= Compute ( (lv_modifies_1_0= ruleSlangModifies ) )? ( (lv_cases_2_0= ruleCaseStatementClause ) )+ )
            {
            // InternalGumboParser.g:683:2: (otherlv_0= Compute ( (lv_modifies_1_0= ruleSlangModifies ) )? ( (lv_cases_2_0= ruleCaseStatementClause ) )+ )
            // InternalGumboParser.g:684:3: otherlv_0= Compute ( (lv_modifies_1_0= ruleSlangModifies ) )? ( (lv_cases_2_0= ruleCaseStatementClause ) )+
            {
            otherlv_0=(Token)match(input,Compute,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getComputeAccess().getComputeKeyword_0());
              		
            }
            // InternalGumboParser.g:688:3: ( (lv_modifies_1_0= ruleSlangModifies ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Modifies) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGumboParser.g:689:4: (lv_modifies_1_0= ruleSlangModifies )
                    {
                    // InternalGumboParser.g:689:4: (lv_modifies_1_0= ruleSlangModifies )
                    // InternalGumboParser.g:690:5: lv_modifies_1_0= ruleSlangModifies
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getComputeAccess().getModifiesSlangModifiesParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_22);
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
                    break;

            }

            // InternalGumboParser.g:707:3: ( (lv_cases_2_0= ruleCaseStatementClause ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==Case) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGumboParser.g:708:4: (lv_cases_2_0= ruleCaseStatementClause )
            	    {
            	    // InternalGumboParser.g:708:4: (lv_cases_2_0= ruleCaseStatementClause )
            	    // InternalGumboParser.g:709:5: lv_cases_2_0= ruleCaseStatementClause
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getComputeAccess().getCasesCaseStatementClauseParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_23);
            	    lv_cases_2_0=ruleCaseStatementClause();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getComputeRule());
            	      					}
            	      					add(
            	      						current,
            	      						"cases",
            	      						lv_cases_2_0,
            	      						"org.sireum.aadl.gumbo.Gumbo.CaseStatementClause");
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
    // $ANTLR end "ruleCompute"


    // $ANTLR start "entryRuleCaseStatementClause"
    // InternalGumboParser.g:730:1: entryRuleCaseStatementClause returns [EObject current=null] : iv_ruleCaseStatementClause= ruleCaseStatementClause EOF ;
    public final EObject entryRuleCaseStatementClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseStatementClause = null;


        try {
            // InternalGumboParser.g:730:60: (iv_ruleCaseStatementClause= ruleCaseStatementClause EOF )
            // InternalGumboParser.g:731:2: iv_ruleCaseStatementClause= ruleCaseStatementClause EOF
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
    // InternalGumboParser.g:737:1: ruleCaseStatementClause returns [EObject current=null] : (otherlv_0= Case ( (lv_displayName_1_0= RULE_SLANG_STRING ) ) otherlv_2= Colon ( (lv_assumeStatement_3_0= ruleAnonAssumeStatement ) ) ( (lv_guaranteeStatement_4_0= ruleAnonGuaranteeStatement ) ) ) ;
    public final EObject ruleCaseStatementClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_displayName_1_0=null;
        Token otherlv_2=null;
        EObject lv_assumeStatement_3_0 = null;

        EObject lv_guaranteeStatement_4_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:743:2: ( (otherlv_0= Case ( (lv_displayName_1_0= RULE_SLANG_STRING ) ) otherlv_2= Colon ( (lv_assumeStatement_3_0= ruleAnonAssumeStatement ) ) ( (lv_guaranteeStatement_4_0= ruleAnonGuaranteeStatement ) ) ) )
            // InternalGumboParser.g:744:2: (otherlv_0= Case ( (lv_displayName_1_0= RULE_SLANG_STRING ) ) otherlv_2= Colon ( (lv_assumeStatement_3_0= ruleAnonAssumeStatement ) ) ( (lv_guaranteeStatement_4_0= ruleAnonGuaranteeStatement ) ) )
            {
            // InternalGumboParser.g:744:2: (otherlv_0= Case ( (lv_displayName_1_0= RULE_SLANG_STRING ) ) otherlv_2= Colon ( (lv_assumeStatement_3_0= ruleAnonAssumeStatement ) ) ( (lv_guaranteeStatement_4_0= ruleAnonGuaranteeStatement ) ) )
            // InternalGumboParser.g:745:3: otherlv_0= Case ( (lv_displayName_1_0= RULE_SLANG_STRING ) ) otherlv_2= Colon ( (lv_assumeStatement_3_0= ruleAnonAssumeStatement ) ) ( (lv_guaranteeStatement_4_0= ruleAnonGuaranteeStatement ) )
            {
            otherlv_0=(Token)match(input,Case,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCaseStatementClauseAccess().getCaseKeyword_0());
              		
            }
            // InternalGumboParser.g:749:3: ( (lv_displayName_1_0= RULE_SLANG_STRING ) )
            // InternalGumboParser.g:750:4: (lv_displayName_1_0= RULE_SLANG_STRING )
            {
            // InternalGumboParser.g:750:4: (lv_displayName_1_0= RULE_SLANG_STRING )
            // InternalGumboParser.g:751:5: lv_displayName_1_0= RULE_SLANG_STRING
            {
            lv_displayName_1_0=(Token)match(input,RULE_SLANG_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_displayName_1_0, grammarAccess.getCaseStatementClauseAccess().getDisplayNameSLANG_STRINGTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCaseStatementClauseRule());
              					}
              					setWithLastConsumed(
              						current,
              						"displayName",
              						lv_displayName_1_0,
              						"org.sireum.aadl.gumbo.Gumbo.SLANG_STRING");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,Colon,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getCaseStatementClauseAccess().getColonKeyword_2());
              		
            }
            // InternalGumboParser.g:771:3: ( (lv_assumeStatement_3_0= ruleAnonAssumeStatement ) )
            // InternalGumboParser.g:772:4: (lv_assumeStatement_3_0= ruleAnonAssumeStatement )
            {
            // InternalGumboParser.g:772:4: (lv_assumeStatement_3_0= ruleAnonAssumeStatement )
            // InternalGumboParser.g:773:5: lv_assumeStatement_3_0= ruleAnonAssumeStatement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCaseStatementClauseAccess().getAssumeStatementAnonAssumeStatementParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_25);
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

            // InternalGumboParser.g:790:3: ( (lv_guaranteeStatement_4_0= ruleAnonGuaranteeStatement ) )
            // InternalGumboParser.g:791:4: (lv_guaranteeStatement_4_0= ruleAnonGuaranteeStatement )
            {
            // InternalGumboParser.g:791:4: (lv_guaranteeStatement_4_0= ruleAnonGuaranteeStatement )
            // InternalGumboParser.g:792:5: lv_guaranteeStatement_4_0= ruleAnonGuaranteeStatement
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
    // InternalGumboParser.g:813:1: entryRuleSpecStatement returns [EObject current=null] : iv_ruleSpecStatement= ruleSpecStatement EOF ;
    public final EObject entryRuleSpecStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecStatement = null;


        try {
            // InternalGumboParser.g:813:54: (iv_ruleSpecStatement= ruleSpecStatement EOF )
            // InternalGumboParser.g:814:2: iv_ruleSpecStatement= ruleSpecStatement EOF
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
    // InternalGumboParser.g:820:1: ruleSpecStatement returns [EObject current=null] : (this_AssumeStatement_0= ruleAssumeStatement | this_GuaranteeStatement_1= ruleGuaranteeStatement ) ;
    public final EObject ruleSpecStatement() throws RecognitionException {
        EObject current = null;

        EObject this_AssumeStatement_0 = null;

        EObject this_GuaranteeStatement_1 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:826:2: ( (this_AssumeStatement_0= ruleAssumeStatement | this_GuaranteeStatement_1= ruleGuaranteeStatement ) )
            // InternalGumboParser.g:827:2: (this_AssumeStatement_0= ruleAssumeStatement | this_GuaranteeStatement_1= ruleGuaranteeStatement )
            {
            // InternalGumboParser.g:827:2: (this_AssumeStatement_0= ruleAssumeStatement | this_GuaranteeStatement_1= ruleGuaranteeStatement )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Assume) ) {
                alt14=1;
            }
            else if ( (LA14_0==Guarantee) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalGumboParser.g:828:3: this_AssumeStatement_0= ruleAssumeStatement
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
                    // InternalGumboParser.g:837:3: this_GuaranteeStatement_1= ruleGuaranteeStatement
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
    // InternalGumboParser.g:849:1: entryRuleAssumeStatement returns [EObject current=null] : iv_ruleAssumeStatement= ruleAssumeStatement EOF ;
    public final EObject entryRuleAssumeStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssumeStatement = null;


        try {
            // InternalGumboParser.g:849:56: (iv_ruleAssumeStatement= ruleAssumeStatement EOF )
            // InternalGumboParser.g:850:2: iv_ruleAssumeStatement= ruleAssumeStatement EOF
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
    // InternalGumboParser.g:856:1: ruleAssumeStatement returns [EObject current=null] : (otherlv_0= Assume ( (lv_displayName_1_0= RULE_SLANG_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon ) ;
    public final EObject ruleAssumeStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_displayName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expr_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:862:2: ( (otherlv_0= Assume ( (lv_displayName_1_0= RULE_SLANG_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon ) )
            // InternalGumboParser.g:863:2: (otherlv_0= Assume ( (lv_displayName_1_0= RULE_SLANG_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon )
            {
            // InternalGumboParser.g:863:2: (otherlv_0= Assume ( (lv_displayName_1_0= RULE_SLANG_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon )
            // InternalGumboParser.g:864:3: otherlv_0= Assume ( (lv_displayName_1_0= RULE_SLANG_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon
            {
            otherlv_0=(Token)match(input,Assume,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAssumeStatementAccess().getAssumeKeyword_0());
              		
            }
            // InternalGumboParser.g:868:3: ( (lv_displayName_1_0= RULE_SLANG_STRING ) )
            // InternalGumboParser.g:869:4: (lv_displayName_1_0= RULE_SLANG_STRING )
            {
            // InternalGumboParser.g:869:4: (lv_displayName_1_0= RULE_SLANG_STRING )
            // InternalGumboParser.g:870:5: lv_displayName_1_0= RULE_SLANG_STRING
            {
            lv_displayName_1_0=(Token)match(input,RULE_SLANG_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_displayName_1_0, grammarAccess.getAssumeStatementAccess().getDisplayNameSLANG_STRINGTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAssumeStatementRule());
              					}
              					setWithLastConsumed(
              						current,
              						"displayName",
              						lv_displayName_1_0,
              						"org.sireum.aadl.gumbo.Gumbo.SLANG_STRING");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,Colon,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAssumeStatementAccess().getColonKeyword_2());
              		
            }
            // InternalGumboParser.g:890:3: ( (lv_expr_3_0= ruleExpr ) )
            // InternalGumboParser.g:891:4: (lv_expr_3_0= ruleExpr )
            {
            // InternalGumboParser.g:891:4: (lv_expr_3_0= ruleExpr )
            // InternalGumboParser.g:892:5: lv_expr_3_0= ruleExpr
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
    // InternalGumboParser.g:917:1: entryRuleAnonAssumeStatement returns [EObject current=null] : iv_ruleAnonAssumeStatement= ruleAnonAssumeStatement EOF ;
    public final EObject entryRuleAnonAssumeStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnonAssumeStatement = null;


        try {
            // InternalGumboParser.g:917:60: (iv_ruleAnonAssumeStatement= ruleAnonAssumeStatement EOF )
            // InternalGumboParser.g:918:2: iv_ruleAnonAssumeStatement= ruleAnonAssumeStatement EOF
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
    // InternalGumboParser.g:924:1: ruleAnonAssumeStatement returns [EObject current=null] : (otherlv_0= Assume ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon ) ;
    public final EObject ruleAnonAssumeStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:930:2: ( (otherlv_0= Assume ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon ) )
            // InternalGumboParser.g:931:2: (otherlv_0= Assume ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon )
            {
            // InternalGumboParser.g:931:2: (otherlv_0= Assume ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon )
            // InternalGumboParser.g:932:3: otherlv_0= Assume ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon
            {
            otherlv_0=(Token)match(input,Assume,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAnonAssumeStatementAccess().getAssumeKeyword_0());
              		
            }
            // InternalGumboParser.g:936:3: ( (lv_expr_1_0= ruleExpr ) )
            // InternalGumboParser.g:937:4: (lv_expr_1_0= ruleExpr )
            {
            // InternalGumboParser.g:937:4: (lv_expr_1_0= ruleExpr )
            // InternalGumboParser.g:938:5: lv_expr_1_0= ruleExpr
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
    // InternalGumboParser.g:963:1: entryRuleGuaranteeStatement returns [EObject current=null] : iv_ruleGuaranteeStatement= ruleGuaranteeStatement EOF ;
    public final EObject entryRuleGuaranteeStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuaranteeStatement = null;


        try {
            // InternalGumboParser.g:963:59: (iv_ruleGuaranteeStatement= ruleGuaranteeStatement EOF )
            // InternalGumboParser.g:964:2: iv_ruleGuaranteeStatement= ruleGuaranteeStatement EOF
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
    // InternalGumboParser.g:970:1: ruleGuaranteeStatement returns [EObject current=null] : (otherlv_0= Guarantee ( (lv_displayName_1_0= RULE_SLANG_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon ) ;
    public final EObject ruleGuaranteeStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_displayName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expr_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:976:2: ( (otherlv_0= Guarantee ( (lv_displayName_1_0= RULE_SLANG_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon ) )
            // InternalGumboParser.g:977:2: (otherlv_0= Guarantee ( (lv_displayName_1_0= RULE_SLANG_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon )
            {
            // InternalGumboParser.g:977:2: (otherlv_0= Guarantee ( (lv_displayName_1_0= RULE_SLANG_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon )
            // InternalGumboParser.g:978:3: otherlv_0= Guarantee ( (lv_displayName_1_0= RULE_SLANG_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon
            {
            otherlv_0=(Token)match(input,Guarantee,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGuaranteeStatementAccess().getGuaranteeKeyword_0());
              		
            }
            // InternalGumboParser.g:982:3: ( (lv_displayName_1_0= RULE_SLANG_STRING ) )
            // InternalGumboParser.g:983:4: (lv_displayName_1_0= RULE_SLANG_STRING )
            {
            // InternalGumboParser.g:983:4: (lv_displayName_1_0= RULE_SLANG_STRING )
            // InternalGumboParser.g:984:5: lv_displayName_1_0= RULE_SLANG_STRING
            {
            lv_displayName_1_0=(Token)match(input,RULE_SLANG_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_displayName_1_0, grammarAccess.getGuaranteeStatementAccess().getDisplayNameSLANG_STRINGTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGuaranteeStatementRule());
              					}
              					setWithLastConsumed(
              						current,
              						"displayName",
              						lv_displayName_1_0,
              						"org.sireum.aadl.gumbo.Gumbo.SLANG_STRING");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,Colon,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGuaranteeStatementAccess().getColonKeyword_2());
              		
            }
            // InternalGumboParser.g:1004:3: ( (lv_expr_3_0= ruleExpr ) )
            // InternalGumboParser.g:1005:4: (lv_expr_3_0= ruleExpr )
            {
            // InternalGumboParser.g:1005:4: (lv_expr_3_0= ruleExpr )
            // InternalGumboParser.g:1006:5: lv_expr_3_0= ruleExpr
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
    // InternalGumboParser.g:1031:1: entryRuleAnonGuaranteeStatement returns [EObject current=null] : iv_ruleAnonGuaranteeStatement= ruleAnonGuaranteeStatement EOF ;
    public final EObject entryRuleAnonGuaranteeStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnonGuaranteeStatement = null;


        try {
            // InternalGumboParser.g:1031:63: (iv_ruleAnonGuaranteeStatement= ruleAnonGuaranteeStatement EOF )
            // InternalGumboParser.g:1032:2: iv_ruleAnonGuaranteeStatement= ruleAnonGuaranteeStatement EOF
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
    // InternalGumboParser.g:1038:1: ruleAnonGuaranteeStatement returns [EObject current=null] : (otherlv_0= Guarantee ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon ) ;
    public final EObject ruleAnonGuaranteeStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1044:2: ( (otherlv_0= Guarantee ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon ) )
            // InternalGumboParser.g:1045:2: (otherlv_0= Guarantee ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon )
            {
            // InternalGumboParser.g:1045:2: (otherlv_0= Guarantee ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon )
            // InternalGumboParser.g:1046:3: otherlv_0= Guarantee ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon
            {
            otherlv_0=(Token)match(input,Guarantee,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAnonGuaranteeStatementAccess().getGuaranteeKeyword_0());
              		
            }
            // InternalGumboParser.g:1050:3: ( (lv_expr_1_0= ruleExpr ) )
            // InternalGumboParser.g:1051:4: (lv_expr_1_0= ruleExpr )
            {
            // InternalGumboParser.g:1051:4: (lv_expr_1_0= ruleExpr )
            // InternalGumboParser.g:1052:5: lv_expr_1_0= ruleExpr
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
    // InternalGumboParser.g:1077:1: entryRuleOtherDataRef returns [EObject current=null] : iv_ruleOtherDataRef= ruleOtherDataRef EOF ;
    public final EObject entryRuleOtherDataRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOtherDataRef = null;


        try {
            // InternalGumboParser.g:1077:53: (iv_ruleOtherDataRef= ruleOtherDataRef EOF )
            // InternalGumboParser.g:1078:2: iv_ruleOtherDataRef= ruleOtherDataRef EOF
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
    // InternalGumboParser.g:1084:1: ruleOtherDataRef returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleOtherDataRef ) ) )? ) ;
    public final EObject ruleOtherDataRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_arrayRange_1_0 = null;

        EObject lv_path_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1090:2: ( ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleOtherDataRef ) ) )? ) )
            // InternalGumboParser.g:1091:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleOtherDataRef ) ) )? )
            {
            // InternalGumboParser.g:1091:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleOtherDataRef ) ) )? )
            // InternalGumboParser.g:1092:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleOtherDataRef ) ) )?
            {
            // InternalGumboParser.g:1092:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* )
            // InternalGumboParser.g:1093:4: ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )*
            {
            // InternalGumboParser.g:1093:4: ( (otherlv_0= RULE_ID ) )
            // InternalGumboParser.g:1094:5: (otherlv_0= RULE_ID )
            {
            // InternalGumboParser.g:1094:5: (otherlv_0= RULE_ID )
            // InternalGumboParser.g:1095:6: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElement(grammarAccess.getOtherDataRefRule());
              						}
              					
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						newLeafNode(otherlv_0, grammarAccess.getOtherDataRefAccess().getNamedElementNamedElementCrossReference_0_0_0());
              					
            }

            }


            }

            // InternalGumboParser.g:1106:4: ( (lv_arrayRange_1_0= ruleArrayRange ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==LeftSquareBracket) ) {
                    int LA15_2 = input.LA(2);

                    if ( (LA15_2==RULE_INTEGER_LIT) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // InternalGumboParser.g:1107:5: (lv_arrayRange_1_0= ruleArrayRange )
            	    {
            	    // InternalGumboParser.g:1107:5: (lv_arrayRange_1_0= ruleArrayRange )
            	    // InternalGumboParser.g:1108:6: lv_arrayRange_1_0= ruleArrayRange
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOtherDataRefAccess().getArrayRangeArrayRangeParserRuleCall_0_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_26);
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
            	    break loop15;
                }
            } while (true);


            }

            // InternalGumboParser.g:1126:3: (otherlv_2= FullStop ( (lv_path_3_0= ruleOtherDataRef ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==FullStop) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGumboParser.g:1127:4: otherlv_2= FullStop ( (lv_path_3_0= ruleOtherDataRef ) )
                    {
                    otherlv_2=(Token)match(input,FullStop,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getOtherDataRefAccess().getFullStopKeyword_1_0());
                      			
                    }
                    // InternalGumboParser.g:1131:4: ( (lv_path_3_0= ruleOtherDataRef ) )
                    // InternalGumboParser.g:1132:5: (lv_path_3_0= ruleOtherDataRef )
                    {
                    // InternalGumboParser.g:1132:5: (lv_path_3_0= ruleOtherDataRef )
                    // InternalGumboParser.g:1133:6: lv_path_3_0= ruleOtherDataRef
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
    // InternalGumboParser.g:1155:1: entryRuleDataElement returns [EObject current=null] : iv_ruleDataElement= ruleDataElement EOF ;
    public final EObject entryRuleDataElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataElement = null;


        try {
            // InternalGumboParser.g:1155:52: (iv_ruleDataElement= ruleDataElement EOF )
            // InternalGumboParser.g:1156:2: iv_ruleDataElement= ruleDataElement EOF
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
    // InternalGumboParser.g:1162:1: ruleDataElement returns [EObject current=null] : ( ( ruleQCREF ) ) ;
    public final EObject ruleDataElement() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalGumboParser.g:1168:2: ( ( ( ruleQCREF ) ) )
            // InternalGumboParser.g:1169:2: ( ( ruleQCREF ) )
            {
            // InternalGumboParser.g:1169:2: ( ( ruleQCREF ) )
            // InternalGumboParser.g:1170:3: ( ruleQCREF )
            {
            // InternalGumboParser.g:1170:3: ( ruleQCREF )
            // InternalGumboParser.g:1171:4: ruleQCREF
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


    // $ANTLR start "entryRuleFunctions"
    // InternalGumboParser.g:1188:1: entryRuleFunctions returns [EObject current=null] : iv_ruleFunctions= ruleFunctions EOF ;
    public final EObject entryRuleFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctions = null;


        try {
            // InternalGumboParser.g:1188:50: (iv_ruleFunctions= ruleFunctions EOF )
            // InternalGumboParser.g:1189:2: iv_ruleFunctions= ruleFunctions EOF
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
    // InternalGumboParser.g:1195:1: ruleFunctions returns [EObject current=null] : (otherlv_0= Functions ( (lv_specs_1_0= ruleFuncSpec ) )+ ) ;
    public final EObject ruleFunctions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_specs_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1201:2: ( (otherlv_0= Functions ( (lv_specs_1_0= ruleFuncSpec ) )+ ) )
            // InternalGumboParser.g:1202:2: (otherlv_0= Functions ( (lv_specs_1_0= ruleFuncSpec ) )+ )
            {
            // InternalGumboParser.g:1202:2: (otherlv_0= Functions ( (lv_specs_1_0= ruleFuncSpec ) )+ )
            // InternalGumboParser.g:1203:3: otherlv_0= Functions ( (lv_specs_1_0= ruleFuncSpec ) )+
            {
            otherlv_0=(Token)match(input,Functions,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunctionsAccess().getFunctionsKeyword_0());
              		
            }
            // InternalGumboParser.g:1207:3: ( (lv_specs_1_0= ruleFuncSpec ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==Def) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGumboParser.g:1208:4: (lv_specs_1_0= ruleFuncSpec )
            	    {
            	    // InternalGumboParser.g:1208:4: (lv_specs_1_0= ruleFuncSpec )
            	    // InternalGumboParser.g:1209:5: lv_specs_1_0= ruleFuncSpec
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getFunctionsAccess().getSpecsFuncSpecParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_28);
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
            	    if ( cnt17 >= 1 ) break loop17;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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
    // InternalGumboParser.g:1230:1: entryRuleFuncSpec returns [EObject current=null] : iv_ruleFuncSpec= ruleFuncSpec EOF ;
    public final EObject entryRuleFuncSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncSpec = null;


        try {
            // InternalGumboParser.g:1230:49: (iv_ruleFuncSpec= ruleFuncSpec EOF )
            // InternalGumboParser.g:1231:2: iv_ruleFuncSpec= ruleFuncSpec EOF
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
    // InternalGumboParser.g:1237:1: ruleFuncSpec returns [EObject current=null] : (this_SlangDefDef_0= ruleSlangDefDef otherlv_1= Semicolon ) ;
    public final EObject ruleFuncSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_SlangDefDef_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1243:2: ( (this_SlangDefDef_0= ruleSlangDefDef otherlv_1= Semicolon ) )
            // InternalGumboParser.g:1244:2: (this_SlangDefDef_0= ruleSlangDefDef otherlv_1= Semicolon )
            {
            // InternalGumboParser.g:1244:2: (this_SlangDefDef_0= ruleSlangDefDef otherlv_1= Semicolon )
            // InternalGumboParser.g:1245:3: this_SlangDefDef_0= ruleSlangDefDef otherlv_1= Semicolon
            {
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
    // InternalGumboParser.g:1261:1: entryRuleSlangDefDecl returns [EObject current=null] : iv_ruleSlangDefDecl= ruleSlangDefDecl EOF ;
    public final EObject entryRuleSlangDefDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangDefDecl = null;


        try {
            // InternalGumboParser.g:1261:53: (iv_ruleSlangDefDecl= ruleSlangDefDecl EOF )
            // InternalGumboParser.g:1262:2: iv_ruleSlangDefDecl= ruleSlangDefDecl EOF
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
    // InternalGumboParser.g:1268:1: ruleSlangDefDecl returns [EObject current=null] : (otherlv_0= Def ( ruleSlangDefMods )? ( (lv_sde_2_0= ruleSlangDefExt ) )? ( (lv_name_3_0= ruleSlangDefID ) ) ( (lv_typeParams_4_0= ruleSlangTypeParams ) )? ( (lv_params_5_0= ruleSlangDefParams ) )? otherlv_6= Colon ( (lv_type_7_0= ruleSlangType ) ) ( (lv_c_8_0= ruleSlangDefContract ) )? ) ;
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
            // InternalGumboParser.g:1274:2: ( (otherlv_0= Def ( ruleSlangDefMods )? ( (lv_sde_2_0= ruleSlangDefExt ) )? ( (lv_name_3_0= ruleSlangDefID ) ) ( (lv_typeParams_4_0= ruleSlangTypeParams ) )? ( (lv_params_5_0= ruleSlangDefParams ) )? otherlv_6= Colon ( (lv_type_7_0= ruleSlangType ) ) ( (lv_c_8_0= ruleSlangDefContract ) )? ) )
            // InternalGumboParser.g:1275:2: (otherlv_0= Def ( ruleSlangDefMods )? ( (lv_sde_2_0= ruleSlangDefExt ) )? ( (lv_name_3_0= ruleSlangDefID ) ) ( (lv_typeParams_4_0= ruleSlangTypeParams ) )? ( (lv_params_5_0= ruleSlangDefParams ) )? otherlv_6= Colon ( (lv_type_7_0= ruleSlangType ) ) ( (lv_c_8_0= ruleSlangDefContract ) )? )
            {
            // InternalGumboParser.g:1275:2: (otherlv_0= Def ( ruleSlangDefMods )? ( (lv_sde_2_0= ruleSlangDefExt ) )? ( (lv_name_3_0= ruleSlangDefID ) ) ( (lv_typeParams_4_0= ruleSlangTypeParams ) )? ( (lv_params_5_0= ruleSlangDefParams ) )? otherlv_6= Colon ( (lv_type_7_0= ruleSlangType ) ) ( (lv_c_8_0= ruleSlangDefContract ) )? )
            // InternalGumboParser.g:1276:3: otherlv_0= Def ( ruleSlangDefMods )? ( (lv_sde_2_0= ruleSlangDefExt ) )? ( (lv_name_3_0= ruleSlangDefID ) ) ( (lv_typeParams_4_0= ruleSlangTypeParams ) )? ( (lv_params_5_0= ruleSlangDefParams ) )? otherlv_6= Colon ( (lv_type_7_0= ruleSlangType ) ) ( (lv_c_8_0= ruleSlangDefContract ) )?
            {
            otherlv_0=(Token)match(input,Def,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangDefDeclAccess().getDefKeyword_0());
              		
            }
            // InternalGumboParser.g:1280:3: ( ruleSlangDefMods )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Memoize||LA18_0==Strict||LA18_0==Spec||LA18_0==Mut) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalGumboParser.g:1281:4: ruleSlangDefMods
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSlangDefDeclAccess().getSlangDefModsParserRuleCall_1());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_29);
                    ruleSlangDefMods();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalGumboParser.g:1289:3: ( (lv_sde_2_0= ruleSlangDefExt ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==LeftParenthesis) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalGumboParser.g:1290:4: (lv_sde_2_0= ruleSlangDefExt )
                    {
                    // InternalGumboParser.g:1290:4: (lv_sde_2_0= ruleSlangDefExt )
                    // InternalGumboParser.g:1291:5: lv_sde_2_0= ruleSlangDefExt
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangDefDeclAccess().getSdeSlangDefExtParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_29);
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

            // InternalGumboParser.g:1308:3: ( (lv_name_3_0= ruleSlangDefID ) )
            // InternalGumboParser.g:1309:4: (lv_name_3_0= ruleSlangDefID )
            {
            // InternalGumboParser.g:1309:4: (lv_name_3_0= ruleSlangDefID )
            // InternalGumboParser.g:1310:5: lv_name_3_0= ruleSlangDefID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangDefDeclAccess().getNameSlangDefIDParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_30);
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

            // InternalGumboParser.g:1327:3: ( (lv_typeParams_4_0= ruleSlangTypeParams ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==LeftSquareBracket) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalGumboParser.g:1328:4: (lv_typeParams_4_0= ruleSlangTypeParams )
                    {
                    // InternalGumboParser.g:1328:4: (lv_typeParams_4_0= ruleSlangTypeParams )
                    // InternalGumboParser.g:1329:5: lv_typeParams_4_0= ruleSlangTypeParams
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangDefDeclAccess().getTypeParamsSlangTypeParamsParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_31);
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

            // InternalGumboParser.g:1346:3: ( (lv_params_5_0= ruleSlangDefParams ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==LeftParenthesis) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalGumboParser.g:1347:4: (lv_params_5_0= ruleSlangDefParams )
                    {
                    // InternalGumboParser.g:1347:4: (lv_params_5_0= ruleSlangDefParams )
                    // InternalGumboParser.g:1348:5: lv_params_5_0= ruleSlangDefParams
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
            // InternalGumboParser.g:1369:3: ( (lv_type_7_0= ruleSlangType ) )
            // InternalGumboParser.g:1370:4: (lv_type_7_0= ruleSlangType )
            {
            // InternalGumboParser.g:1370:4: (lv_type_7_0= ruleSlangType )
            // InternalGumboParser.g:1371:5: lv_type_7_0= ruleSlangType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangDefDeclAccess().getTypeSlangTypeParserRuleCall_7_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_32);
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

            // InternalGumboParser.g:1388:3: ( (lv_c_8_0= ruleSlangDefContract ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Spec) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalGumboParser.g:1389:4: (lv_c_8_0= ruleSlangDefContract )
                    {
                    // InternalGumboParser.g:1389:4: (lv_c_8_0= ruleSlangDefContract )
                    // InternalGumboParser.g:1390:5: lv_c_8_0= ruleSlangDefContract
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
    // InternalGumboParser.g:1411:1: entryRuleSlangDefDef returns [EObject current=null] : iv_ruleSlangDefDef= ruleSlangDefDef EOF ;
    public final EObject entryRuleSlangDefDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangDefDef = null;


        try {
            // InternalGumboParser.g:1411:52: (iv_ruleSlangDefDef= ruleSlangDefDef EOF )
            // InternalGumboParser.g:1412:2: iv_ruleSlangDefDef= ruleSlangDefDef EOF
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
    // InternalGumboParser.g:1418:1: ruleSlangDefDef returns [EObject current=null] : (otherlv_0= Def ( ruleSlangDefMods )? ( (lv_sde_2_0= ruleSlangDefExt ) )? ( (lv_name_3_0= ruleSlangDefID ) ) ( (lv_typeParams_4_0= ruleSlangTypeParams ) )? ( (lv_params_5_0= ruleSlangDefParams ) )? otherlv_6= Colon ( (lv_type_7_0= ruleSlangType ) ) ( (lv_c_8_0= ruleSlangDefContract ) )? otherlv_9= ColonEqualsSign ( (lv_e_10_0= ruleExpr ) ) ) ;
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
            // InternalGumboParser.g:1424:2: ( (otherlv_0= Def ( ruleSlangDefMods )? ( (lv_sde_2_0= ruleSlangDefExt ) )? ( (lv_name_3_0= ruleSlangDefID ) ) ( (lv_typeParams_4_0= ruleSlangTypeParams ) )? ( (lv_params_5_0= ruleSlangDefParams ) )? otherlv_6= Colon ( (lv_type_7_0= ruleSlangType ) ) ( (lv_c_8_0= ruleSlangDefContract ) )? otherlv_9= ColonEqualsSign ( (lv_e_10_0= ruleExpr ) ) ) )
            // InternalGumboParser.g:1425:2: (otherlv_0= Def ( ruleSlangDefMods )? ( (lv_sde_2_0= ruleSlangDefExt ) )? ( (lv_name_3_0= ruleSlangDefID ) ) ( (lv_typeParams_4_0= ruleSlangTypeParams ) )? ( (lv_params_5_0= ruleSlangDefParams ) )? otherlv_6= Colon ( (lv_type_7_0= ruleSlangType ) ) ( (lv_c_8_0= ruleSlangDefContract ) )? otherlv_9= ColonEqualsSign ( (lv_e_10_0= ruleExpr ) ) )
            {
            // InternalGumboParser.g:1425:2: (otherlv_0= Def ( ruleSlangDefMods )? ( (lv_sde_2_0= ruleSlangDefExt ) )? ( (lv_name_3_0= ruleSlangDefID ) ) ( (lv_typeParams_4_0= ruleSlangTypeParams ) )? ( (lv_params_5_0= ruleSlangDefParams ) )? otherlv_6= Colon ( (lv_type_7_0= ruleSlangType ) ) ( (lv_c_8_0= ruleSlangDefContract ) )? otherlv_9= ColonEqualsSign ( (lv_e_10_0= ruleExpr ) ) )
            // InternalGumboParser.g:1426:3: otherlv_0= Def ( ruleSlangDefMods )? ( (lv_sde_2_0= ruleSlangDefExt ) )? ( (lv_name_3_0= ruleSlangDefID ) ) ( (lv_typeParams_4_0= ruleSlangTypeParams ) )? ( (lv_params_5_0= ruleSlangDefParams ) )? otherlv_6= Colon ( (lv_type_7_0= ruleSlangType ) ) ( (lv_c_8_0= ruleSlangDefContract ) )? otherlv_9= ColonEqualsSign ( (lv_e_10_0= ruleExpr ) )
            {
            otherlv_0=(Token)match(input,Def,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangDefDefAccess().getDefKeyword_0());
              		
            }
            // InternalGumboParser.g:1430:3: ( ruleSlangDefMods )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Memoize||LA23_0==Strict||LA23_0==Spec||LA23_0==Mut) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalGumboParser.g:1431:4: ruleSlangDefMods
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSlangDefDefAccess().getSlangDefModsParserRuleCall_1());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_29);
                    ruleSlangDefMods();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalGumboParser.g:1439:3: ( (lv_sde_2_0= ruleSlangDefExt ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==LeftParenthesis) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalGumboParser.g:1440:4: (lv_sde_2_0= ruleSlangDefExt )
                    {
                    // InternalGumboParser.g:1440:4: (lv_sde_2_0= ruleSlangDefExt )
                    // InternalGumboParser.g:1441:5: lv_sde_2_0= ruleSlangDefExt
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangDefDefAccess().getSdeSlangDefExtParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_29);
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

            // InternalGumboParser.g:1458:3: ( (lv_name_3_0= ruleSlangDefID ) )
            // InternalGumboParser.g:1459:4: (lv_name_3_0= ruleSlangDefID )
            {
            // InternalGumboParser.g:1459:4: (lv_name_3_0= ruleSlangDefID )
            // InternalGumboParser.g:1460:5: lv_name_3_0= ruleSlangDefID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangDefDefAccess().getNameSlangDefIDParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_30);
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

            // InternalGumboParser.g:1477:3: ( (lv_typeParams_4_0= ruleSlangTypeParams ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==LeftSquareBracket) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalGumboParser.g:1478:4: (lv_typeParams_4_0= ruleSlangTypeParams )
                    {
                    // InternalGumboParser.g:1478:4: (lv_typeParams_4_0= ruleSlangTypeParams )
                    // InternalGumboParser.g:1479:5: lv_typeParams_4_0= ruleSlangTypeParams
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangDefDefAccess().getTypeParamsSlangTypeParamsParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_31);
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

            // InternalGumboParser.g:1496:3: ( (lv_params_5_0= ruleSlangDefParams ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==LeftParenthesis) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalGumboParser.g:1497:4: (lv_params_5_0= ruleSlangDefParams )
                    {
                    // InternalGumboParser.g:1497:4: (lv_params_5_0= ruleSlangDefParams )
                    // InternalGumboParser.g:1498:5: lv_params_5_0= ruleSlangDefParams
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
            // InternalGumboParser.g:1519:3: ( (lv_type_7_0= ruleSlangType ) )
            // InternalGumboParser.g:1520:4: (lv_type_7_0= ruleSlangType )
            {
            // InternalGumboParser.g:1520:4: (lv_type_7_0= ruleSlangType )
            // InternalGumboParser.g:1521:5: lv_type_7_0= ruleSlangType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangDefDefAccess().getTypeSlangTypeParserRuleCall_7_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_33);
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

            // InternalGumboParser.g:1538:3: ( (lv_c_8_0= ruleSlangDefContract ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Spec) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalGumboParser.g:1539:4: (lv_c_8_0= ruleSlangDefContract )
                    {
                    // InternalGumboParser.g:1539:4: (lv_c_8_0= ruleSlangDefContract )
                    // InternalGumboParser.g:1540:5: lv_c_8_0= ruleSlangDefContract
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangDefDefAccess().getCSlangDefContractParserRuleCall_8_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_34);
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
            // InternalGumboParser.g:1561:3: ( (lv_e_10_0= ruleExpr ) )
            // InternalGumboParser.g:1562:4: (lv_e_10_0= ruleExpr )
            {
            // InternalGumboParser.g:1562:4: (lv_e_10_0= ruleExpr )
            // InternalGumboParser.g:1563:5: lv_e_10_0= ruleExpr
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
    // InternalGumboParser.g:1584:1: entryRuleSlangDefMods returns [String current=null] : iv_ruleSlangDefMods= ruleSlangDefMods EOF ;
    public final String entryRuleSlangDefMods() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSlangDefMods = null;


        try {
            // InternalGumboParser.g:1584:52: (iv_ruleSlangDefMods= ruleSlangDefMods EOF )
            // InternalGumboParser.g:1585:2: iv_ruleSlangDefMods= ruleSlangDefMods EOF
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
    // InternalGumboParser.g:1591:1: ruleSlangDefMods returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Strict | kw= Memoize | kw= Mut | kw= Spec ) ;
    public final AntlrDatatypeRuleToken ruleSlangDefMods() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumboParser.g:1597:2: ( (kw= Strict | kw= Memoize | kw= Mut | kw= Spec ) )
            // InternalGumboParser.g:1598:2: (kw= Strict | kw= Memoize | kw= Mut | kw= Spec )
            {
            // InternalGumboParser.g:1598:2: (kw= Strict | kw= Memoize | kw= Mut | kw= Spec )
            int alt28=4;
            switch ( input.LA(1) ) {
            case Strict:
                {
                alt28=1;
                }
                break;
            case Memoize:
                {
                alt28=2;
                }
                break;
            case Mut:
                {
                alt28=3;
                }
                break;
            case Spec:
                {
                alt28=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalGumboParser.g:1599:3: kw= Strict
                    {
                    kw=(Token)match(input,Strict,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getSlangDefModsAccess().getStrictKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:1605:3: kw= Memoize
                    {
                    kw=(Token)match(input,Memoize,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getSlangDefModsAccess().getMemoizeKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGumboParser.g:1611:3: kw= Mut
                    {
                    kw=(Token)match(input,Mut,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getSlangDefModsAccess().getMutKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGumboParser.g:1617:3: kw= Spec
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
    // InternalGumboParser.g:1626:1: entryRuleSlangDefExt returns [EObject current=null] : iv_ruleSlangDefExt= ruleSlangDefExt EOF ;
    public final EObject entryRuleSlangDefExt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangDefExt = null;


        try {
            // InternalGumboParser.g:1626:52: (iv_ruleSlangDefExt= ruleSlangDefExt EOF )
            // InternalGumboParser.g:1627:2: iv_ruleSlangDefExt= ruleSlangDefExt EOF
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
    // InternalGumboParser.g:1633:1: ruleSlangDefExt returns [EObject current=null] : (otherlv_0= LeftParenthesis ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) otherlv_4= RightParenthesis ) ;
    public final EObject ruleSlangDefExt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_typeName_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1639:2: ( (otherlv_0= LeftParenthesis ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) otherlv_4= RightParenthesis ) )
            // InternalGumboParser.g:1640:2: (otherlv_0= LeftParenthesis ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) otherlv_4= RightParenthesis )
            {
            // InternalGumboParser.g:1640:2: (otherlv_0= LeftParenthesis ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) otherlv_4= RightParenthesis )
            // InternalGumboParser.g:1641:3: otherlv_0= LeftParenthesis ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) otherlv_4= RightParenthesis
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangDefExtAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalGumboParser.g:1645:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGumboParser.g:1646:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGumboParser.g:1646:4: (lv_name_1_0= RULE_ID )
            // InternalGumboParser.g:1647:5: lv_name_1_0= RULE_ID
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
            // InternalGumboParser.g:1667:3: ( (lv_typeName_3_0= ruleSlangType ) )
            // InternalGumboParser.g:1668:4: (lv_typeName_3_0= ruleSlangType )
            {
            // InternalGumboParser.g:1668:4: (lv_typeName_3_0= ruleSlangType )
            // InternalGumboParser.g:1669:5: lv_typeName_3_0= ruleSlangType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangDefExtAccess().getTypeNameSlangTypeParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_35);
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
    // InternalGumboParser.g:1694:1: entryRuleSlangDefID returns [String current=null] : iv_ruleSlangDefID= ruleSlangDefID EOF ;
    public final String entryRuleSlangDefID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSlangDefID = null;


        try {
            // InternalGumboParser.g:1694:50: (iv_ruleSlangDefID= ruleSlangDefID EOF )
            // InternalGumboParser.g:1695:2: iv_ruleSlangDefID= ruleSlangDefID EOF
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
    // InternalGumboParser.g:1701:1: ruleSlangDefID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_Operator_1= ruleOperator ) ;
    public final AntlrDatatypeRuleToken ruleSlangDefID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        AntlrDatatypeRuleToken this_Operator_1 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1707:2: ( (this_ID_0= RULE_ID | this_Operator_1= ruleOperator ) )
            // InternalGumboParser.g:1708:2: (this_ID_0= RULE_ID | this_Operator_1= ruleOperator )
            {
            // InternalGumboParser.g:1708:2: (this_ID_0= RULE_ID | this_Operator_1= ruleOperator )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) ) {
                alt29=1;
            }
            else if ( ((LA29_0>=Asterisk && LA29_0<=PlusSign)||LA29_0==HyphenMinus||LA29_0==RULE_OP) ) {
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
                    // InternalGumboParser.g:1709:3: this_ID_0= RULE_ID
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
                    // InternalGumboParser.g:1717:3: this_Operator_1= ruleOperator
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
    // InternalGumboParser.g:1731:1: entryRuleSlangDefParams returns [EObject current=null] : iv_ruleSlangDefParams= ruleSlangDefParams EOF ;
    public final EObject entryRuleSlangDefParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangDefParams = null;


        try {
            // InternalGumboParser.g:1731:55: (iv_ruleSlangDefParams= ruleSlangDefParams EOF )
            // InternalGumboParser.g:1732:2: iv_ruleSlangDefParams= ruleSlangDefParams EOF
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
    // InternalGumboParser.g:1738:1: ruleSlangDefParams returns [EObject current=null] : (otherlv_0= LeftParenthesis ( (lv_params_1_0= ruleSlangDefParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangDefParam ) ) )? otherlv_4= RightParenthesis ) ;
    public final EObject ruleSlangDefParams() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_params_1_0 = null;

        EObject lv_params_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1744:2: ( (otherlv_0= LeftParenthesis ( (lv_params_1_0= ruleSlangDefParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangDefParam ) ) )? otherlv_4= RightParenthesis ) )
            // InternalGumboParser.g:1745:2: (otherlv_0= LeftParenthesis ( (lv_params_1_0= ruleSlangDefParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangDefParam ) ) )? otherlv_4= RightParenthesis )
            {
            // InternalGumboParser.g:1745:2: (otherlv_0= LeftParenthesis ( (lv_params_1_0= ruleSlangDefParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangDefParam ) ) )? otherlv_4= RightParenthesis )
            // InternalGumboParser.g:1746:3: otherlv_0= LeftParenthesis ( (lv_params_1_0= ruleSlangDefParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangDefParam ) ) )? otherlv_4= RightParenthesis
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangDefParamsAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalGumboParser.g:1750:3: ( (lv_params_1_0= ruleSlangDefParam ) )
            // InternalGumboParser.g:1751:4: (lv_params_1_0= ruleSlangDefParam )
            {
            // InternalGumboParser.g:1751:4: (lv_params_1_0= ruleSlangDefParam )
            // InternalGumboParser.g:1752:5: lv_params_1_0= ruleSlangDefParam
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangDefParamsAccess().getParamsSlangDefParamParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_36);
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

            // InternalGumboParser.g:1769:3: (otherlv_2= Comma ( (lv_params_3_0= ruleSlangDefParam ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==Comma) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalGumboParser.g:1770:4: otherlv_2= Comma ( (lv_params_3_0= ruleSlangDefParam ) )
                    {
                    otherlv_2=(Token)match(input,Comma,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSlangDefParamsAccess().getCommaKeyword_2_0());
                      			
                    }
                    // InternalGumboParser.g:1774:4: ( (lv_params_3_0= ruleSlangDefParam ) )
                    // InternalGumboParser.g:1775:5: (lv_params_3_0= ruleSlangDefParam )
                    {
                    // InternalGumboParser.g:1775:5: (lv_params_3_0= ruleSlangDefParam )
                    // InternalGumboParser.g:1776:6: lv_params_3_0= ruleSlangDefParam
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangDefParamsAccess().getParamsSlangDefParamParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_35);
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
    // InternalGumboParser.g:1802:1: entryRuleSlangDefParam returns [EObject current=null] : iv_ruleSlangDefParam= ruleSlangDefParam EOF ;
    public final EObject entryRuleSlangDefParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangDefParam = null;


        try {
            // InternalGumboParser.g:1802:54: (iv_ruleSlangDefParam= ruleSlangDefParam EOF )
            // InternalGumboParser.g:1803:2: iv_ruleSlangDefParam= ruleSlangDefParam EOF
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
    // InternalGumboParser.g:1809:1: ruleSlangDefParam returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon (otherlv_2= EqualsSignGreaterThanSign )? ( (lv_typeName_3_0= ruleSlangType ) ) (otherlv_4= Asterisk )? ) ;
    public final EObject ruleSlangDefParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_typeName_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1815:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon (otherlv_2= EqualsSignGreaterThanSign )? ( (lv_typeName_3_0= ruleSlangType ) ) (otherlv_4= Asterisk )? ) )
            // InternalGumboParser.g:1816:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon (otherlv_2= EqualsSignGreaterThanSign )? ( (lv_typeName_3_0= ruleSlangType ) ) (otherlv_4= Asterisk )? )
            {
            // InternalGumboParser.g:1816:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon (otherlv_2= EqualsSignGreaterThanSign )? ( (lv_typeName_3_0= ruleSlangType ) ) (otherlv_4= Asterisk )? )
            // InternalGumboParser.g:1817:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon (otherlv_2= EqualsSignGreaterThanSign )? ( (lv_typeName_3_0= ruleSlangType ) ) (otherlv_4= Asterisk )?
            {
            // InternalGumboParser.g:1817:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGumboParser.g:1818:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGumboParser.g:1818:4: (lv_name_0_0= RULE_ID )
            // InternalGumboParser.g:1819:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,Colon,FollowSets000.FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSlangDefParamAccess().getColonKeyword_1());
              		
            }
            // InternalGumboParser.g:1839:3: (otherlv_2= EqualsSignGreaterThanSign )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==EqualsSignGreaterThanSign) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalGumboParser.g:1840:4: otherlv_2= EqualsSignGreaterThanSign
                    {
                    otherlv_2=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSlangDefParamAccess().getEqualsSignGreaterThanSignKeyword_2());
                      			
                    }

                    }
                    break;

            }

            // InternalGumboParser.g:1845:3: ( (lv_typeName_3_0= ruleSlangType ) )
            // InternalGumboParser.g:1846:4: (lv_typeName_3_0= ruleSlangType )
            {
            // InternalGumboParser.g:1846:4: (lv_typeName_3_0= ruleSlangType )
            // InternalGumboParser.g:1847:5: lv_typeName_3_0= ruleSlangType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangDefParamAccess().getTypeNameSlangTypeParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_38);
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

            // InternalGumboParser.g:1864:3: (otherlv_4= Asterisk )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==Asterisk) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalGumboParser.g:1865:4: otherlv_4= Asterisk
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
    // InternalGumboParser.g:1874:1: entryRuleSlangTypeParams returns [String current=null] : iv_ruleSlangTypeParams= ruleSlangTypeParams EOF ;
    public final String entryRuleSlangTypeParams() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSlangTypeParams = null;


        try {
            // InternalGumboParser.g:1874:55: (iv_ruleSlangTypeParams= ruleSlangTypeParams EOF )
            // InternalGumboParser.g:1875:2: iv_ruleSlangTypeParams= ruleSlangTypeParams EOF
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
    // InternalGumboParser.g:1881:1: ruleSlangTypeParams returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= LeftSquareBracket this_SlangTypeParam_1= ruleSlangTypeParam (kw= Comma this_SlangTypeParam_3= ruleSlangTypeParam )* kw= RightSquareBracket ) ;
    public final AntlrDatatypeRuleToken ruleSlangTypeParams() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_SlangTypeParam_1 = null;

        AntlrDatatypeRuleToken this_SlangTypeParam_3 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1887:2: ( (kw= LeftSquareBracket this_SlangTypeParam_1= ruleSlangTypeParam (kw= Comma this_SlangTypeParam_3= ruleSlangTypeParam )* kw= RightSquareBracket ) )
            // InternalGumboParser.g:1888:2: (kw= LeftSquareBracket this_SlangTypeParam_1= ruleSlangTypeParam (kw= Comma this_SlangTypeParam_3= ruleSlangTypeParam )* kw= RightSquareBracket )
            {
            // InternalGumboParser.g:1888:2: (kw= LeftSquareBracket this_SlangTypeParam_1= ruleSlangTypeParam (kw= Comma this_SlangTypeParam_3= ruleSlangTypeParam )* kw= RightSquareBracket )
            // InternalGumboParser.g:1889:3: kw= LeftSquareBracket this_SlangTypeParam_1= ruleSlangTypeParam (kw= Comma this_SlangTypeParam_3= ruleSlangTypeParam )* kw= RightSquareBracket
            {
            kw=(Token)match(input,LeftSquareBracket,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSlangTypeParamsAccess().getLeftSquareBracketKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSlangTypeParamsAccess().getSlangTypeParamParserRuleCall_1());
              		
            }
            pushFollow(FollowSets000.FOLLOW_40);
            this_SlangTypeParam_1=ruleSlangTypeParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_SlangTypeParam_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGumboParser.g:1904:3: (kw= Comma this_SlangTypeParam_3= ruleSlangTypeParam )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==Comma) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalGumboParser.g:1905:4: kw= Comma this_SlangTypeParam_3= ruleSlangTypeParam
            	    {
            	    kw=(Token)match(input,Comma,FollowSets000.FOLLOW_39); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getSlangTypeParamsAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getSlangTypeParamsAccess().getSlangTypeParamParserRuleCall_2_1());
            	      			
            	    }
            	    pushFollow(FollowSets000.FOLLOW_40);
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
            	    break loop33;
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
    // InternalGumboParser.g:1930:1: entryRuleSlangTypeParam returns [String current=null] : iv_ruleSlangTypeParam= ruleSlangTypeParam EOF ;
    public final String entryRuleSlangTypeParam() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSlangTypeParam = null;


        try {
            // InternalGumboParser.g:1930:54: (iv_ruleSlangTypeParam= ruleSlangTypeParam EOF )
            // InternalGumboParser.g:1931:2: iv_ruleSlangTypeParam= ruleSlangTypeParam EOF
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
    // InternalGumboParser.g:1937:1: ruleSlangTypeParam returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= Mut )? this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleSlangTypeParam() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalGumboParser.g:1943:2: ( ( (kw= Mut )? this_ID_1= RULE_ID ) )
            // InternalGumboParser.g:1944:2: ( (kw= Mut )? this_ID_1= RULE_ID )
            {
            // InternalGumboParser.g:1944:2: ( (kw= Mut )? this_ID_1= RULE_ID )
            // InternalGumboParser.g:1945:3: (kw= Mut )? this_ID_1= RULE_ID
            {
            // InternalGumboParser.g:1945:3: (kw= Mut )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==Mut) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalGumboParser.g:1946:4: kw= Mut
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
    // InternalGumboParser.g:1963:1: entryRuleSlangDefContract returns [EObject current=null] : iv_ruleSlangDefContract= ruleSlangDefContract EOF ;
    public final EObject entryRuleSlangDefContract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangDefContract = null;


        try {
            // InternalGumboParser.g:1963:57: (iv_ruleSlangDefContract= ruleSlangDefContract EOF )
            // InternalGumboParser.g:1964:2: iv_ruleSlangDefContract= ruleSlangDefContract EOF
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
    // InternalGumboParser.g:1970:1: ruleSlangDefContract returns [EObject current=null] : ( () otherlv_1= Spec ( ( ( (lv_rea_2_0= ruleSlangReads ) )? ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_mod_4_0= ruleSlangModifies ) )? ( (lv_ens_5_0= ruleSlangEnsures ) )? ) | ( ( (lv_contracts_6_0= ruleSlangDefContractCase ) )+ ( (lv_rea_7_0= ruleSlangReads ) )? ( (lv_mod_8_0= ruleSlangModifies ) )? ) ) ) ;
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
            // InternalGumboParser.g:1976:2: ( ( () otherlv_1= Spec ( ( ( (lv_rea_2_0= ruleSlangReads ) )? ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_mod_4_0= ruleSlangModifies ) )? ( (lv_ens_5_0= ruleSlangEnsures ) )? ) | ( ( (lv_contracts_6_0= ruleSlangDefContractCase ) )+ ( (lv_rea_7_0= ruleSlangReads ) )? ( (lv_mod_8_0= ruleSlangModifies ) )? ) ) ) )
            // InternalGumboParser.g:1977:2: ( () otherlv_1= Spec ( ( ( (lv_rea_2_0= ruleSlangReads ) )? ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_mod_4_0= ruleSlangModifies ) )? ( (lv_ens_5_0= ruleSlangEnsures ) )? ) | ( ( (lv_contracts_6_0= ruleSlangDefContractCase ) )+ ( (lv_rea_7_0= ruleSlangReads ) )? ( (lv_mod_8_0= ruleSlangModifies ) )? ) ) )
            {
            // InternalGumboParser.g:1977:2: ( () otherlv_1= Spec ( ( ( (lv_rea_2_0= ruleSlangReads ) )? ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_mod_4_0= ruleSlangModifies ) )? ( (lv_ens_5_0= ruleSlangEnsures ) )? ) | ( ( (lv_contracts_6_0= ruleSlangDefContractCase ) )+ ( (lv_rea_7_0= ruleSlangReads ) )? ( (lv_mod_8_0= ruleSlangModifies ) )? ) ) )
            // InternalGumboParser.g:1978:3: () otherlv_1= Spec ( ( ( (lv_rea_2_0= ruleSlangReads ) )? ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_mod_4_0= ruleSlangModifies ) )? ( (lv_ens_5_0= ruleSlangEnsures ) )? ) | ( ( (lv_contracts_6_0= ruleSlangDefContractCase ) )+ ( (lv_rea_7_0= ruleSlangReads ) )? ( (lv_mod_8_0= ruleSlangModifies ) )? ) )
            {
            // InternalGumboParser.g:1978:3: ()
            // InternalGumboParser.g:1979:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSlangDefContractAccess().getSlangDefContractAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Spec,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSlangDefContractAccess().getSpecKeyword_1());
              		
            }
            // InternalGumboParser.g:1989:3: ( ( ( (lv_rea_2_0= ruleSlangReads ) )? ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_mod_4_0= ruleSlangModifies ) )? ( (lv_ens_5_0= ruleSlangEnsures ) )? ) | ( ( (lv_contracts_6_0= ruleSlangDefContractCase ) )+ ( (lv_rea_7_0= ruleSlangReads ) )? ( (lv_mod_8_0= ruleSlangModifies ) )? ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==EOF||(LA42_0>=Modifies && LA42_0<=Requires)||LA42_0==Ensures||LA42_0==Reads||LA42_0==ColonEqualsSign) ) {
                alt42=1;
            }
            else if ( (LA42_0==Case) ) {
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
                    // InternalGumboParser.g:1990:4: ( ( (lv_rea_2_0= ruleSlangReads ) )? ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_mod_4_0= ruleSlangModifies ) )? ( (lv_ens_5_0= ruleSlangEnsures ) )? )
                    {
                    // InternalGumboParser.g:1990:4: ( ( (lv_rea_2_0= ruleSlangReads ) )? ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_mod_4_0= ruleSlangModifies ) )? ( (lv_ens_5_0= ruleSlangEnsures ) )? )
                    // InternalGumboParser.g:1991:5: ( (lv_rea_2_0= ruleSlangReads ) )? ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_mod_4_0= ruleSlangModifies ) )? ( (lv_ens_5_0= ruleSlangEnsures ) )?
                    {
                    // InternalGumboParser.g:1991:5: ( (lv_rea_2_0= ruleSlangReads ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==Reads) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalGumboParser.g:1992:6: (lv_rea_2_0= ruleSlangReads )
                            {
                            // InternalGumboParser.g:1992:6: (lv_rea_2_0= ruleSlangReads )
                            // InternalGumboParser.g:1993:7: lv_rea_2_0= ruleSlangReads
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSlangDefContractAccess().getReaSlangReadsParserRuleCall_2_0_0_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_42);
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

                    // InternalGumboParser.g:2010:5: ( (lv_req_3_0= ruleSlangRequires ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==Requires) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalGumboParser.g:2011:6: (lv_req_3_0= ruleSlangRequires )
                            {
                            // InternalGumboParser.g:2011:6: (lv_req_3_0= ruleSlangRequires )
                            // InternalGumboParser.g:2012:7: lv_req_3_0= ruleSlangRequires
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSlangDefContractAccess().getReqSlangRequiresParserRuleCall_2_0_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_43);
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

                    // InternalGumboParser.g:2029:5: ( (lv_mod_4_0= ruleSlangModifies ) )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==Modifies) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalGumboParser.g:2030:6: (lv_mod_4_0= ruleSlangModifies )
                            {
                            // InternalGumboParser.g:2030:6: (lv_mod_4_0= ruleSlangModifies )
                            // InternalGumboParser.g:2031:7: lv_mod_4_0= ruleSlangModifies
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSlangDefContractAccess().getModSlangModifiesParserRuleCall_2_0_2_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_44);
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

                    // InternalGumboParser.g:2048:5: ( (lv_ens_5_0= ruleSlangEnsures ) )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==Ensures) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalGumboParser.g:2049:6: (lv_ens_5_0= ruleSlangEnsures )
                            {
                            // InternalGumboParser.g:2049:6: (lv_ens_5_0= ruleSlangEnsures )
                            // InternalGumboParser.g:2050:7: lv_ens_5_0= ruleSlangEnsures
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
                    // InternalGumboParser.g:2069:4: ( ( (lv_contracts_6_0= ruleSlangDefContractCase ) )+ ( (lv_rea_7_0= ruleSlangReads ) )? ( (lv_mod_8_0= ruleSlangModifies ) )? )
                    {
                    // InternalGumboParser.g:2069:4: ( ( (lv_contracts_6_0= ruleSlangDefContractCase ) )+ ( (lv_rea_7_0= ruleSlangReads ) )? ( (lv_mod_8_0= ruleSlangModifies ) )? )
                    // InternalGumboParser.g:2070:5: ( (lv_contracts_6_0= ruleSlangDefContractCase ) )+ ( (lv_rea_7_0= ruleSlangReads ) )? ( (lv_mod_8_0= ruleSlangModifies ) )?
                    {
                    // InternalGumboParser.g:2070:5: ( (lv_contracts_6_0= ruleSlangDefContractCase ) )+
                    int cnt39=0;
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==Case) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalGumboParser.g:2071:6: (lv_contracts_6_0= ruleSlangDefContractCase )
                    	    {
                    	    // InternalGumboParser.g:2071:6: (lv_contracts_6_0= ruleSlangDefContractCase )
                    	    // InternalGumboParser.g:2072:7: lv_contracts_6_0= ruleSlangDefContractCase
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSlangDefContractAccess().getContractsSlangDefContractCaseParserRuleCall_2_1_0_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_41);
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
                    	    if ( cnt39 >= 1 ) break loop39;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(39, input);
                                throw eee;
                        }
                        cnt39++;
                    } while (true);

                    // InternalGumboParser.g:2089:5: ( (lv_rea_7_0= ruleSlangReads ) )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==Reads) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalGumboParser.g:2090:6: (lv_rea_7_0= ruleSlangReads )
                            {
                            // InternalGumboParser.g:2090:6: (lv_rea_7_0= ruleSlangReads )
                            // InternalGumboParser.g:2091:7: lv_rea_7_0= ruleSlangReads
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSlangDefContractAccess().getReaSlangReadsParserRuleCall_2_1_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_45);
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

                    // InternalGumboParser.g:2108:5: ( (lv_mod_8_0= ruleSlangModifies ) )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==Modifies) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalGumboParser.g:2109:6: (lv_mod_8_0= ruleSlangModifies )
                            {
                            // InternalGumboParser.g:2109:6: (lv_mod_8_0= ruleSlangModifies )
                            // InternalGumboParser.g:2110:7: lv_mod_8_0= ruleSlangModifies
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
    // InternalGumboParser.g:2133:1: entryRuleSlangDefContractCase returns [EObject current=null] : iv_ruleSlangDefContractCase= ruleSlangDefContractCase EOF ;
    public final EObject entryRuleSlangDefContractCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangDefContractCase = null;


        try {
            // InternalGumboParser.g:2133:61: (iv_ruleSlangDefContractCase= ruleSlangDefContractCase EOF )
            // InternalGumboParser.g:2134:2: iv_ruleSlangDefContractCase= ruleSlangDefContractCase EOF
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
    // InternalGumboParser.g:2140:1: ruleSlangDefContractCase returns [EObject current=null] : ( () otherlv_1= Case this_SLANG_STRING_2= RULE_SLANG_STRING ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_ens_4_0= ruleSlangEnsures ) )? ) ;
    public final EObject ruleSlangDefContractCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_SLANG_STRING_2=null;
        EObject lv_req_3_0 = null;

        EObject lv_ens_4_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2146:2: ( ( () otherlv_1= Case this_SLANG_STRING_2= RULE_SLANG_STRING ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_ens_4_0= ruleSlangEnsures ) )? ) )
            // InternalGumboParser.g:2147:2: ( () otherlv_1= Case this_SLANG_STRING_2= RULE_SLANG_STRING ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_ens_4_0= ruleSlangEnsures ) )? )
            {
            // InternalGumboParser.g:2147:2: ( () otherlv_1= Case this_SLANG_STRING_2= RULE_SLANG_STRING ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_ens_4_0= ruleSlangEnsures ) )? )
            // InternalGumboParser.g:2148:3: () otherlv_1= Case this_SLANG_STRING_2= RULE_SLANG_STRING ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_ens_4_0= ruleSlangEnsures ) )?
            {
            // InternalGumboParser.g:2148:3: ()
            // InternalGumboParser.g:2149:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSlangDefContractCaseAccess().getSlangDefContractCaseAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Case,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSlangDefContractCaseAccess().getCaseKeyword_1());
              		
            }
            this_SLANG_STRING_2=(Token)match(input,RULE_SLANG_STRING,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_SLANG_STRING_2, grammarAccess.getSlangDefContractCaseAccess().getSLANG_STRINGTerminalRuleCall_2());
              		
            }
            // InternalGumboParser.g:2163:3: ( (lv_req_3_0= ruleSlangRequires ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==Requires) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalGumboParser.g:2164:4: (lv_req_3_0= ruleSlangRequires )
                    {
                    // InternalGumboParser.g:2164:4: (lv_req_3_0= ruleSlangRequires )
                    // InternalGumboParser.g:2165:5: lv_req_3_0= ruleSlangRequires
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangDefContractCaseAccess().getReqSlangRequiresParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_44);
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

            // InternalGumboParser.g:2182:3: ( (lv_ens_4_0= ruleSlangEnsures ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==Ensures) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalGumboParser.g:2183:4: (lv_ens_4_0= ruleSlangEnsures )
                    {
                    // InternalGumboParser.g:2183:4: (lv_ens_4_0= ruleSlangEnsures )
                    // InternalGumboParser.g:2184:5: lv_ens_4_0= ruleSlangEnsures
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
    // InternalGumboParser.g:2205:1: entryRuleSlangSupr returns [EObject current=null] : iv_ruleSlangSupr= ruleSlangSupr EOF ;
    public final EObject entryRuleSlangSupr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangSupr = null;


        try {
            // InternalGumboParser.g:2205:50: (iv_ruleSlangSupr= ruleSlangSupr EOF )
            // InternalGumboParser.g:2206:2: iv_ruleSlangSupr= ruleSlangSupr EOF
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
    // InternalGumboParser.g:2212:1: ruleSlangSupr returns [EObject current=null] : ( ( (lv_name_0_0= ruleSlangName ) ) ( (lv_args_1_0= ruleSlangTypeArgs ) )? ) ;
    public final EObject ruleSlangSupr() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_args_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2218:2: ( ( ( (lv_name_0_0= ruleSlangName ) ) ( (lv_args_1_0= ruleSlangTypeArgs ) )? ) )
            // InternalGumboParser.g:2219:2: ( ( (lv_name_0_0= ruleSlangName ) ) ( (lv_args_1_0= ruleSlangTypeArgs ) )? )
            {
            // InternalGumboParser.g:2219:2: ( ( (lv_name_0_0= ruleSlangName ) ) ( (lv_args_1_0= ruleSlangTypeArgs ) )? )
            // InternalGumboParser.g:2220:3: ( (lv_name_0_0= ruleSlangName ) ) ( (lv_args_1_0= ruleSlangTypeArgs ) )?
            {
            // InternalGumboParser.g:2220:3: ( (lv_name_0_0= ruleSlangName ) )
            // InternalGumboParser.g:2221:4: (lv_name_0_0= ruleSlangName )
            {
            // InternalGumboParser.g:2221:4: (lv_name_0_0= ruleSlangName )
            // InternalGumboParser.g:2222:5: lv_name_0_0= ruleSlangName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangSuprAccess().getNameSlangNameParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_47);
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

            // InternalGumboParser.g:2239:3: ( (lv_args_1_0= ruleSlangTypeArgs ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==LeftSquareBracket) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalGumboParser.g:2240:4: (lv_args_1_0= ruleSlangTypeArgs )
                    {
                    // InternalGumboParser.g:2240:4: (lv_args_1_0= ruleSlangTypeArgs )
                    // InternalGumboParser.g:2241:5: lv_args_1_0= ruleSlangTypeArgs
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
    // InternalGumboParser.g:2262:1: entryRuleSlangName returns [String current=null] : iv_ruleSlangName= ruleSlangName EOF ;
    public final String entryRuleSlangName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSlangName = null;


        try {
            // InternalGumboParser.g:2262:49: (iv_ruleSlangName= ruleSlangName EOF )
            // InternalGumboParser.g:2263:2: iv_ruleSlangName= ruleSlangName EOF
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
    // InternalGumboParser.g:2269:1: ruleSlangName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleSlangName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalGumboParser.g:2275:2: ( (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) )
            // InternalGumboParser.g:2276:2: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
            {
            // InternalGumboParser.g:2276:2: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
            // InternalGumboParser.g:2277:3: this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getSlangNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalGumboParser.g:2284:3: (kw= FullStop this_ID_2= RULE_ID )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==FullStop) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalGumboParser.g:2285:4: kw= FullStop this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,FullStop,FollowSets000.FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getSlangNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_48); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getSlangNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop46;
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
    // InternalGumboParser.g:2302:1: entryRuleSlangInvariant returns [EObject current=null] : iv_ruleSlangInvariant= ruleSlangInvariant EOF ;
    public final EObject entryRuleSlangInvariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangInvariant = null;


        try {
            // InternalGumboParser.g:2302:55: (iv_ruleSlangInvariant= ruleSlangInvariant EOF )
            // InternalGumboParser.g:2303:2: iv_ruleSlangInvariant= ruleSlangInvariant EOF
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
    // InternalGumboParser.g:2309:1: ruleSlangInvariant returns [EObject current=null] : (otherlv_0= Invariant ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* ) ;
    public final EObject ruleSlangInvariant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exprs_1_0 = null;

        EObject lv_exprs_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2315:2: ( (otherlv_0= Invariant ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* ) )
            // InternalGumboParser.g:2316:2: (otherlv_0= Invariant ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* )
            {
            // InternalGumboParser.g:2316:2: (otherlv_0= Invariant ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* )
            // InternalGumboParser.g:2317:3: otherlv_0= Invariant ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )*
            {
            otherlv_0=(Token)match(input,Invariant,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangInvariantAccess().getInvariantKeyword_0());
              		
            }
            // InternalGumboParser.g:2321:3: ( (lv_exprs_1_0= ruleExpr ) )
            // InternalGumboParser.g:2322:4: (lv_exprs_1_0= ruleExpr )
            {
            // InternalGumboParser.g:2322:4: (lv_exprs_1_0= ruleExpr )
            // InternalGumboParser.g:2323:5: lv_exprs_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangInvariantAccess().getExprsExprParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_49);
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

            // InternalGumboParser.g:2340:3: (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==Comma) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalGumboParser.g:2341:4: otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FollowSets000.FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSlangInvariantAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalGumboParser.g:2345:4: ( (lv_exprs_3_0= ruleExpr ) )
            	    // InternalGumboParser.g:2346:5: (lv_exprs_3_0= ruleExpr )
            	    {
            	    // InternalGumboParser.g:2346:5: (lv_exprs_3_0= ruleExpr )
            	    // InternalGumboParser.g:2347:6: lv_exprs_3_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSlangInvariantAccess().getExprsExprParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_49);
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
            	    break loop47;
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
    // InternalGumboParser.g:2369:1: entryRuleSlangReads returns [EObject current=null] : iv_ruleSlangReads= ruleSlangReads EOF ;
    public final EObject entryRuleSlangReads() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangReads = null;


        try {
            // InternalGumboParser.g:2369:51: (iv_ruleSlangReads= ruleSlangReads EOF )
            // InternalGumboParser.g:2370:2: iv_ruleSlangReads= ruleSlangReads EOF
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
    // InternalGumboParser.g:2376:1: ruleSlangReads returns [EObject current=null] : (otherlv_0= Reads ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* ) ;
    public final EObject ruleSlangReads() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exprs_1_0 = null;

        EObject lv_exprs_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2382:2: ( (otherlv_0= Reads ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* ) )
            // InternalGumboParser.g:2383:2: (otherlv_0= Reads ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* )
            {
            // InternalGumboParser.g:2383:2: (otherlv_0= Reads ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* )
            // InternalGumboParser.g:2384:3: otherlv_0= Reads ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )*
            {
            otherlv_0=(Token)match(input,Reads,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangReadsAccess().getReadsKeyword_0());
              		
            }
            // InternalGumboParser.g:2388:3: ( (lv_exprs_1_0= ruleExpr ) )
            // InternalGumboParser.g:2389:4: (lv_exprs_1_0= ruleExpr )
            {
            // InternalGumboParser.g:2389:4: (lv_exprs_1_0= ruleExpr )
            // InternalGumboParser.g:2390:5: lv_exprs_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangReadsAccess().getExprsExprParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_49);
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

            // InternalGumboParser.g:2407:3: (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==Comma) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalGumboParser.g:2408:4: otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FollowSets000.FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSlangReadsAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalGumboParser.g:2412:4: ( (lv_exprs_3_0= ruleExpr ) )
            	    // InternalGumboParser.g:2413:5: (lv_exprs_3_0= ruleExpr )
            	    {
            	    // InternalGumboParser.g:2413:5: (lv_exprs_3_0= ruleExpr )
            	    // InternalGumboParser.g:2414:6: lv_exprs_3_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSlangReadsAccess().getExprsExprParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_49);
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
            	    break loop48;
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
    // InternalGumboParser.g:2436:1: entryRuleSlangRequires returns [EObject current=null] : iv_ruleSlangRequires= ruleSlangRequires EOF ;
    public final EObject entryRuleSlangRequires() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangRequires = null;


        try {
            // InternalGumboParser.g:2436:54: (iv_ruleSlangRequires= ruleSlangRequires EOF )
            // InternalGumboParser.g:2437:2: iv_ruleSlangRequires= ruleSlangRequires EOF
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
    // InternalGumboParser.g:2443:1: ruleSlangRequires returns [EObject current=null] : (otherlv_0= Requires ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* ) ;
    public final EObject ruleSlangRequires() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exprs_1_0 = null;

        EObject lv_exprs_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2449:2: ( (otherlv_0= Requires ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* ) )
            // InternalGumboParser.g:2450:2: (otherlv_0= Requires ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* )
            {
            // InternalGumboParser.g:2450:2: (otherlv_0= Requires ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* )
            // InternalGumboParser.g:2451:3: otherlv_0= Requires ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )*
            {
            otherlv_0=(Token)match(input,Requires,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangRequiresAccess().getRequiresKeyword_0());
              		
            }
            // InternalGumboParser.g:2455:3: ( (lv_exprs_1_0= ruleExpr ) )
            // InternalGumboParser.g:2456:4: (lv_exprs_1_0= ruleExpr )
            {
            // InternalGumboParser.g:2456:4: (lv_exprs_1_0= ruleExpr )
            // InternalGumboParser.g:2457:5: lv_exprs_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangRequiresAccess().getExprsExprParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_49);
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

            // InternalGumboParser.g:2474:3: (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==Comma) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalGumboParser.g:2475:4: otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FollowSets000.FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSlangRequiresAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalGumboParser.g:2479:4: ( (lv_exprs_3_0= ruleExpr ) )
            	    // InternalGumboParser.g:2480:5: (lv_exprs_3_0= ruleExpr )
            	    {
            	    // InternalGumboParser.g:2480:5: (lv_exprs_3_0= ruleExpr )
            	    // InternalGumboParser.g:2481:6: lv_exprs_3_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSlangRequiresAccess().getExprsExprParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_49);
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
            	    break loop49;
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
    // InternalGumboParser.g:2503:1: entryRuleSlangModifies returns [EObject current=null] : iv_ruleSlangModifies= ruleSlangModifies EOF ;
    public final EObject entryRuleSlangModifies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangModifies = null;


        try {
            // InternalGumboParser.g:2503:54: (iv_ruleSlangModifies= ruleSlangModifies EOF )
            // InternalGumboParser.g:2504:2: iv_ruleSlangModifies= ruleSlangModifies EOF
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
    // InternalGumboParser.g:2510:1: ruleSlangModifies returns [EObject current=null] : (otherlv_0= Modifies ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* ) ;
    public final EObject ruleSlangModifies() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exprs_1_0 = null;

        EObject lv_exprs_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2516:2: ( (otherlv_0= Modifies ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* ) )
            // InternalGumboParser.g:2517:2: (otherlv_0= Modifies ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* )
            {
            // InternalGumboParser.g:2517:2: (otherlv_0= Modifies ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* )
            // InternalGumboParser.g:2518:3: otherlv_0= Modifies ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )*
            {
            otherlv_0=(Token)match(input,Modifies,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangModifiesAccess().getModifiesKeyword_0());
              		
            }
            // InternalGumboParser.g:2522:3: ( (lv_exprs_1_0= ruleExpr ) )
            // InternalGumboParser.g:2523:4: (lv_exprs_1_0= ruleExpr )
            {
            // InternalGumboParser.g:2523:4: (lv_exprs_1_0= ruleExpr )
            // InternalGumboParser.g:2524:5: lv_exprs_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangModifiesAccess().getExprsExprParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_49);
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

            // InternalGumboParser.g:2541:3: (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==Comma) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalGumboParser.g:2542:4: otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FollowSets000.FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSlangModifiesAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalGumboParser.g:2546:4: ( (lv_exprs_3_0= ruleExpr ) )
            	    // InternalGumboParser.g:2547:5: (lv_exprs_3_0= ruleExpr )
            	    {
            	    // InternalGumboParser.g:2547:5: (lv_exprs_3_0= ruleExpr )
            	    // InternalGumboParser.g:2548:6: lv_exprs_3_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSlangModifiesAccess().getExprsExprParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_49);
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
            	    break loop50;
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
    // InternalGumboParser.g:2570:1: entryRuleSlangEnsures returns [EObject current=null] : iv_ruleSlangEnsures= ruleSlangEnsures EOF ;
    public final EObject entryRuleSlangEnsures() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangEnsures = null;


        try {
            // InternalGumboParser.g:2570:53: (iv_ruleSlangEnsures= ruleSlangEnsures EOF )
            // InternalGumboParser.g:2571:2: iv_ruleSlangEnsures= ruleSlangEnsures EOF
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
    // InternalGumboParser.g:2577:1: ruleSlangEnsures returns [EObject current=null] : (otherlv_0= Ensures ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* ) ;
    public final EObject ruleSlangEnsures() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exprs_1_0 = null;

        EObject lv_exprs_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2583:2: ( (otherlv_0= Ensures ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* ) )
            // InternalGumboParser.g:2584:2: (otherlv_0= Ensures ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* )
            {
            // InternalGumboParser.g:2584:2: (otherlv_0= Ensures ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* )
            // InternalGumboParser.g:2585:3: otherlv_0= Ensures ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )*
            {
            otherlv_0=(Token)match(input,Ensures,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangEnsuresAccess().getEnsuresKeyword_0());
              		
            }
            // InternalGumboParser.g:2589:3: ( (lv_exprs_1_0= ruleExpr ) )
            // InternalGumboParser.g:2590:4: (lv_exprs_1_0= ruleExpr )
            {
            // InternalGumboParser.g:2590:4: (lv_exprs_1_0= ruleExpr )
            // InternalGumboParser.g:2591:5: lv_exprs_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangEnsuresAccess().getExprsExprParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_49);
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

            // InternalGumboParser.g:2608:3: (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==Comma) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalGumboParser.g:2609:4: otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FollowSets000.FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSlangEnsuresAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalGumboParser.g:2613:4: ( (lv_exprs_3_0= ruleExpr ) )
            	    // InternalGumboParser.g:2614:5: (lv_exprs_3_0= ruleExpr )
            	    {
            	    // InternalGumboParser.g:2614:5: (lv_exprs_3_0= ruleExpr )
            	    // InternalGumboParser.g:2615:6: lv_exprs_3_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSlangEnsuresAccess().getExprsExprParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_49);
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
            	    break loop51;
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
    // InternalGumboParser.g:2637:1: entryRuleSlangStmt returns [EObject current=null] : iv_ruleSlangStmt= ruleSlangStmt EOF ;
    public final EObject entryRuleSlangStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangStmt = null;


        try {
            // InternalGumboParser.g:2637:50: (iv_ruleSlangStmt= ruleSlangStmt EOF )
            // InternalGumboParser.g:2638:2: iv_ruleSlangStmt= ruleSlangStmt EOF
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
    // InternalGumboParser.g:2644:1: ruleSlangStmt returns [EObject current=null] : ( ( () ( (lv_d_1_0= ruleSlangVarDef ) ) ) | ( () otherlv_3= If ( (lv_cond_4_0= ruleExpr ) ) ( (lv_b_5_0= ruleSlangBlock ) ) ( (lv_e_6_0= ruleSlangElse ) )? ) | ( () otherlv_8= While ( (lv_cond_9_0= ruleExpr ) ) ( (lv_l_10_0= ruleSlangLoopContract ) ) ( (lv_b_11_0= ruleSlangBlock ) ) ) | ( () otherlv_13= Match ( (lv_testExpr_14_0= ruleExpr ) ) otherlv_15= LeftCurlyBracket ( (lv_c_16_0= ruleSlangCase ) )* otherlv_17= RightCurlyBracket ) | ( () otherlv_19= Spec ( (lv_b_20_0= ruleSlangBlock ) ) ) | ( () otherlv_22= Assume ( (lv_e_23_0= ruleExpr ) ) (this_SLANG_STRING_24= RULE_SLANG_STRING )? ) | ( () otherlv_26= Assert ( (lv_e_27_0= ruleExpr ) ) (this_SLANG_STRING_28= RULE_SLANG_STRING )? ) | ( () otherlv_30= Halt (this_SLANG_STRING_31= RULE_SLANG_STRING )? ) | ( () otherlv_33= Do ( (lv_e_34_0= ruleExpr ) ) ) | ( () ( (otherlv_36= RULE_ID ) ) (otherlv_37= Colon | ( (otherlv_38= ColonEqualsSign | this_DEFOP_39= RULE_DEFOP ) ( (lv_e_40_0= ruleExpr ) ) )? ) ) ) ;
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
        Token otherlv_38=null;
        Token this_DEFOP_39=null;
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

        EObject lv_e_40_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2650:2: ( ( ( () ( (lv_d_1_0= ruleSlangVarDef ) ) ) | ( () otherlv_3= If ( (lv_cond_4_0= ruleExpr ) ) ( (lv_b_5_0= ruleSlangBlock ) ) ( (lv_e_6_0= ruleSlangElse ) )? ) | ( () otherlv_8= While ( (lv_cond_9_0= ruleExpr ) ) ( (lv_l_10_0= ruleSlangLoopContract ) ) ( (lv_b_11_0= ruleSlangBlock ) ) ) | ( () otherlv_13= Match ( (lv_testExpr_14_0= ruleExpr ) ) otherlv_15= LeftCurlyBracket ( (lv_c_16_0= ruleSlangCase ) )* otherlv_17= RightCurlyBracket ) | ( () otherlv_19= Spec ( (lv_b_20_0= ruleSlangBlock ) ) ) | ( () otherlv_22= Assume ( (lv_e_23_0= ruleExpr ) ) (this_SLANG_STRING_24= RULE_SLANG_STRING )? ) | ( () otherlv_26= Assert ( (lv_e_27_0= ruleExpr ) ) (this_SLANG_STRING_28= RULE_SLANG_STRING )? ) | ( () otherlv_30= Halt (this_SLANG_STRING_31= RULE_SLANG_STRING )? ) | ( () otherlv_33= Do ( (lv_e_34_0= ruleExpr ) ) ) | ( () ( (otherlv_36= RULE_ID ) ) (otherlv_37= Colon | ( (otherlv_38= ColonEqualsSign | this_DEFOP_39= RULE_DEFOP ) ( (lv_e_40_0= ruleExpr ) ) )? ) ) ) )
            // InternalGumboParser.g:2651:2: ( ( () ( (lv_d_1_0= ruleSlangVarDef ) ) ) | ( () otherlv_3= If ( (lv_cond_4_0= ruleExpr ) ) ( (lv_b_5_0= ruleSlangBlock ) ) ( (lv_e_6_0= ruleSlangElse ) )? ) | ( () otherlv_8= While ( (lv_cond_9_0= ruleExpr ) ) ( (lv_l_10_0= ruleSlangLoopContract ) ) ( (lv_b_11_0= ruleSlangBlock ) ) ) | ( () otherlv_13= Match ( (lv_testExpr_14_0= ruleExpr ) ) otherlv_15= LeftCurlyBracket ( (lv_c_16_0= ruleSlangCase ) )* otherlv_17= RightCurlyBracket ) | ( () otherlv_19= Spec ( (lv_b_20_0= ruleSlangBlock ) ) ) | ( () otherlv_22= Assume ( (lv_e_23_0= ruleExpr ) ) (this_SLANG_STRING_24= RULE_SLANG_STRING )? ) | ( () otherlv_26= Assert ( (lv_e_27_0= ruleExpr ) ) (this_SLANG_STRING_28= RULE_SLANG_STRING )? ) | ( () otherlv_30= Halt (this_SLANG_STRING_31= RULE_SLANG_STRING )? ) | ( () otherlv_33= Do ( (lv_e_34_0= ruleExpr ) ) ) | ( () ( (otherlv_36= RULE_ID ) ) (otherlv_37= Colon | ( (otherlv_38= ColonEqualsSign | this_DEFOP_39= RULE_DEFOP ) ( (lv_e_40_0= ruleExpr ) ) )? ) ) )
            {
            // InternalGumboParser.g:2651:2: ( ( () ( (lv_d_1_0= ruleSlangVarDef ) ) ) | ( () otherlv_3= If ( (lv_cond_4_0= ruleExpr ) ) ( (lv_b_5_0= ruleSlangBlock ) ) ( (lv_e_6_0= ruleSlangElse ) )? ) | ( () otherlv_8= While ( (lv_cond_9_0= ruleExpr ) ) ( (lv_l_10_0= ruleSlangLoopContract ) ) ( (lv_b_11_0= ruleSlangBlock ) ) ) | ( () otherlv_13= Match ( (lv_testExpr_14_0= ruleExpr ) ) otherlv_15= LeftCurlyBracket ( (lv_c_16_0= ruleSlangCase ) )* otherlv_17= RightCurlyBracket ) | ( () otherlv_19= Spec ( (lv_b_20_0= ruleSlangBlock ) ) ) | ( () otherlv_22= Assume ( (lv_e_23_0= ruleExpr ) ) (this_SLANG_STRING_24= RULE_SLANG_STRING )? ) | ( () otherlv_26= Assert ( (lv_e_27_0= ruleExpr ) ) (this_SLANG_STRING_28= RULE_SLANG_STRING )? ) | ( () otherlv_30= Halt (this_SLANG_STRING_31= RULE_SLANG_STRING )? ) | ( () otherlv_33= Do ( (lv_e_34_0= ruleExpr ) ) ) | ( () ( (otherlv_36= RULE_ID ) ) (otherlv_37= Colon | ( (otherlv_38= ColonEqualsSign | this_DEFOP_39= RULE_DEFOP ) ( (lv_e_40_0= ruleExpr ) ) )? ) ) )
            int alt60=10;
            switch ( input.LA(1) ) {
            case Val:
            case Var:
                {
                alt60=1;
                }
                break;
            case If:
                {
                alt60=2;
                }
                break;
            case While:
                {
                alt60=3;
                }
                break;
            case Match:
                {
                alt60=4;
                }
                break;
            case Spec:
                {
                alt60=5;
                }
                break;
            case Assume:
                {
                alt60=6;
                }
                break;
            case Assert:
                {
                alt60=7;
                }
                break;
            case Halt:
                {
                alt60=8;
                }
                break;
            case Do:
                {
                alt60=9;
                }
                break;
            case RULE_ID:
                {
                alt60=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // InternalGumboParser.g:2652:3: ( () ( (lv_d_1_0= ruleSlangVarDef ) ) )
                    {
                    // InternalGumboParser.g:2652:3: ( () ( (lv_d_1_0= ruleSlangVarDef ) ) )
                    // InternalGumboParser.g:2653:4: () ( (lv_d_1_0= ruleSlangVarDef ) )
                    {
                    // InternalGumboParser.g:2653:4: ()
                    // InternalGumboParser.g:2654:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangStmtAccess().getSlangVarDefAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:2660:4: ( (lv_d_1_0= ruleSlangVarDef ) )
                    // InternalGumboParser.g:2661:5: (lv_d_1_0= ruleSlangVarDef )
                    {
                    // InternalGumboParser.g:2661:5: (lv_d_1_0= ruleSlangVarDef )
                    // InternalGumboParser.g:2662:6: lv_d_1_0= ruleSlangVarDef
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
                    // InternalGumboParser.g:2681:3: ( () otherlv_3= If ( (lv_cond_4_0= ruleExpr ) ) ( (lv_b_5_0= ruleSlangBlock ) ) ( (lv_e_6_0= ruleSlangElse ) )? )
                    {
                    // InternalGumboParser.g:2681:3: ( () otherlv_3= If ( (lv_cond_4_0= ruleExpr ) ) ( (lv_b_5_0= ruleSlangBlock ) ) ( (lv_e_6_0= ruleSlangElse ) )? )
                    // InternalGumboParser.g:2682:4: () otherlv_3= If ( (lv_cond_4_0= ruleExpr ) ) ( (lv_b_5_0= ruleSlangBlock ) ) ( (lv_e_6_0= ruleSlangElse ) )?
                    {
                    // InternalGumboParser.g:2682:4: ()
                    // InternalGumboParser.g:2683:5: 
                    {
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
                    // InternalGumboParser.g:2693:4: ( (lv_cond_4_0= ruleExpr ) )
                    // InternalGumboParser.g:2694:5: (lv_cond_4_0= ruleExpr )
                    {
                    // InternalGumboParser.g:2694:5: (lv_cond_4_0= ruleExpr )
                    // InternalGumboParser.g:2695:6: lv_cond_4_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangStmtAccess().getCondExprParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_50);
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

                    // InternalGumboParser.g:2712:4: ( (lv_b_5_0= ruleSlangBlock ) )
                    // InternalGumboParser.g:2713:5: (lv_b_5_0= ruleSlangBlock )
                    {
                    // InternalGumboParser.g:2713:5: (lv_b_5_0= ruleSlangBlock )
                    // InternalGumboParser.g:2714:6: lv_b_5_0= ruleSlangBlock
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangStmtAccess().getBSlangBlockParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_51);
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

                    // InternalGumboParser.g:2731:4: ( (lv_e_6_0= ruleSlangElse ) )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==Else) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // InternalGumboParser.g:2732:5: (lv_e_6_0= ruleSlangElse )
                            {
                            // InternalGumboParser.g:2732:5: (lv_e_6_0= ruleSlangElse )
                            // InternalGumboParser.g:2733:6: lv_e_6_0= ruleSlangElse
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
                    // InternalGumboParser.g:2752:3: ( () otherlv_8= While ( (lv_cond_9_0= ruleExpr ) ) ( (lv_l_10_0= ruleSlangLoopContract ) ) ( (lv_b_11_0= ruleSlangBlock ) ) )
                    {
                    // InternalGumboParser.g:2752:3: ( () otherlv_8= While ( (lv_cond_9_0= ruleExpr ) ) ( (lv_l_10_0= ruleSlangLoopContract ) ) ( (lv_b_11_0= ruleSlangBlock ) ) )
                    // InternalGumboParser.g:2753:4: () otherlv_8= While ( (lv_cond_9_0= ruleExpr ) ) ( (lv_l_10_0= ruleSlangLoopContract ) ) ( (lv_b_11_0= ruleSlangBlock ) )
                    {
                    // InternalGumboParser.g:2753:4: ()
                    // InternalGumboParser.g:2754:5: 
                    {
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
                    // InternalGumboParser.g:2764:4: ( (lv_cond_9_0= ruleExpr ) )
                    // InternalGumboParser.g:2765:5: (lv_cond_9_0= ruleExpr )
                    {
                    // InternalGumboParser.g:2765:5: (lv_cond_9_0= ruleExpr )
                    // InternalGumboParser.g:2766:6: lv_cond_9_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangStmtAccess().getCondExprParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_52);
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

                    // InternalGumboParser.g:2783:4: ( (lv_l_10_0= ruleSlangLoopContract ) )
                    // InternalGumboParser.g:2784:5: (lv_l_10_0= ruleSlangLoopContract )
                    {
                    // InternalGumboParser.g:2784:5: (lv_l_10_0= ruleSlangLoopContract )
                    // InternalGumboParser.g:2785:6: lv_l_10_0= ruleSlangLoopContract
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangStmtAccess().getLSlangLoopContractParserRuleCall_2_3_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_50);
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

                    // InternalGumboParser.g:2802:4: ( (lv_b_11_0= ruleSlangBlock ) )
                    // InternalGumboParser.g:2803:5: (lv_b_11_0= ruleSlangBlock )
                    {
                    // InternalGumboParser.g:2803:5: (lv_b_11_0= ruleSlangBlock )
                    // InternalGumboParser.g:2804:6: lv_b_11_0= ruleSlangBlock
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
                    // InternalGumboParser.g:2823:3: ( () otherlv_13= Match ( (lv_testExpr_14_0= ruleExpr ) ) otherlv_15= LeftCurlyBracket ( (lv_c_16_0= ruleSlangCase ) )* otherlv_17= RightCurlyBracket )
                    {
                    // InternalGumboParser.g:2823:3: ( () otherlv_13= Match ( (lv_testExpr_14_0= ruleExpr ) ) otherlv_15= LeftCurlyBracket ( (lv_c_16_0= ruleSlangCase ) )* otherlv_17= RightCurlyBracket )
                    // InternalGumboParser.g:2824:4: () otherlv_13= Match ( (lv_testExpr_14_0= ruleExpr ) ) otherlv_15= LeftCurlyBracket ( (lv_c_16_0= ruleSlangCase ) )* otherlv_17= RightCurlyBracket
                    {
                    // InternalGumboParser.g:2824:4: ()
                    // InternalGumboParser.g:2825:5: 
                    {
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
                    // InternalGumboParser.g:2835:4: ( (lv_testExpr_14_0= ruleExpr ) )
                    // InternalGumboParser.g:2836:5: (lv_testExpr_14_0= ruleExpr )
                    {
                    // InternalGumboParser.g:2836:5: (lv_testExpr_14_0= ruleExpr )
                    // InternalGumboParser.g:2837:6: lv_testExpr_14_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangStmtAccess().getTestExprExprParserRuleCall_3_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_50);
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

                    otherlv_15=(Token)match(input,LeftCurlyBracket,FollowSets000.FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getSlangStmtAccess().getLeftCurlyBracketKeyword_3_3());
                      			
                    }
                    // InternalGumboParser.g:2858:4: ( (lv_c_16_0= ruleSlangCase ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==Case) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // InternalGumboParser.g:2859:5: (lv_c_16_0= ruleSlangCase )
                    	    {
                    	    // InternalGumboParser.g:2859:5: (lv_c_16_0= ruleSlangCase )
                    	    // InternalGumboParser.g:2860:6: lv_c_16_0= ruleSlangCase
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getSlangStmtAccess().getCSlangCaseParserRuleCall_3_4_0());
                    	      					
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_53);
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
                    	    break loop53;
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
                    // InternalGumboParser.g:2883:3: ( () otherlv_19= Spec ( (lv_b_20_0= ruleSlangBlock ) ) )
                    {
                    // InternalGumboParser.g:2883:3: ( () otherlv_19= Spec ( (lv_b_20_0= ruleSlangBlock ) ) )
                    // InternalGumboParser.g:2884:4: () otherlv_19= Spec ( (lv_b_20_0= ruleSlangBlock ) )
                    {
                    // InternalGumboParser.g:2884:4: ()
                    // InternalGumboParser.g:2885:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangStmtAccess().getSlangSpecStmtAction_4_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_19=(Token)match(input,Spec,FollowSets000.FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getSlangStmtAccess().getSpecKeyword_4_1());
                      			
                    }
                    // InternalGumboParser.g:2895:4: ( (lv_b_20_0= ruleSlangBlock ) )
                    // InternalGumboParser.g:2896:5: (lv_b_20_0= ruleSlangBlock )
                    {
                    // InternalGumboParser.g:2896:5: (lv_b_20_0= ruleSlangBlock )
                    // InternalGumboParser.g:2897:6: lv_b_20_0= ruleSlangBlock
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
                    // InternalGumboParser.g:2916:3: ( () otherlv_22= Assume ( (lv_e_23_0= ruleExpr ) ) (this_SLANG_STRING_24= RULE_SLANG_STRING )? )
                    {
                    // InternalGumboParser.g:2916:3: ( () otherlv_22= Assume ( (lv_e_23_0= ruleExpr ) ) (this_SLANG_STRING_24= RULE_SLANG_STRING )? )
                    // InternalGumboParser.g:2917:4: () otherlv_22= Assume ( (lv_e_23_0= ruleExpr ) ) (this_SLANG_STRING_24= RULE_SLANG_STRING )?
                    {
                    // InternalGumboParser.g:2917:4: ()
                    // InternalGumboParser.g:2918:5: 
                    {
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
                    // InternalGumboParser.g:2928:4: ( (lv_e_23_0= ruleExpr ) )
                    // InternalGumboParser.g:2929:5: (lv_e_23_0= ruleExpr )
                    {
                    // InternalGumboParser.g:2929:5: (lv_e_23_0= ruleExpr )
                    // InternalGumboParser.g:2930:6: lv_e_23_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangStmtAccess().getEExprParserRuleCall_5_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_54);
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

                    // InternalGumboParser.g:2947:4: (this_SLANG_STRING_24= RULE_SLANG_STRING )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==RULE_SLANG_STRING) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // InternalGumboParser.g:2948:5: this_SLANG_STRING_24= RULE_SLANG_STRING
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
                    // InternalGumboParser.g:2955:3: ( () otherlv_26= Assert ( (lv_e_27_0= ruleExpr ) ) (this_SLANG_STRING_28= RULE_SLANG_STRING )? )
                    {
                    // InternalGumboParser.g:2955:3: ( () otherlv_26= Assert ( (lv_e_27_0= ruleExpr ) ) (this_SLANG_STRING_28= RULE_SLANG_STRING )? )
                    // InternalGumboParser.g:2956:4: () otherlv_26= Assert ( (lv_e_27_0= ruleExpr ) ) (this_SLANG_STRING_28= RULE_SLANG_STRING )?
                    {
                    // InternalGumboParser.g:2956:4: ()
                    // InternalGumboParser.g:2957:5: 
                    {
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
                    // InternalGumboParser.g:2967:4: ( (lv_e_27_0= ruleExpr ) )
                    // InternalGumboParser.g:2968:5: (lv_e_27_0= ruleExpr )
                    {
                    // InternalGumboParser.g:2968:5: (lv_e_27_0= ruleExpr )
                    // InternalGumboParser.g:2969:6: lv_e_27_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangStmtAccess().getEExprParserRuleCall_6_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_54);
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

                    // InternalGumboParser.g:2986:4: (this_SLANG_STRING_28= RULE_SLANG_STRING )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==RULE_SLANG_STRING) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // InternalGumboParser.g:2987:5: this_SLANG_STRING_28= RULE_SLANG_STRING
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
                    // InternalGumboParser.g:2994:3: ( () otherlv_30= Halt (this_SLANG_STRING_31= RULE_SLANG_STRING )? )
                    {
                    // InternalGumboParser.g:2994:3: ( () otherlv_30= Halt (this_SLANG_STRING_31= RULE_SLANG_STRING )? )
                    // InternalGumboParser.g:2995:4: () otherlv_30= Halt (this_SLANG_STRING_31= RULE_SLANG_STRING )?
                    {
                    // InternalGumboParser.g:2995:4: ()
                    // InternalGumboParser.g:2996:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangStmtAccess().getSlangHaltStmtAction_7_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_30=(Token)match(input,Halt,FollowSets000.FOLLOW_54); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_30, grammarAccess.getSlangStmtAccess().getHaltKeyword_7_1());
                      			
                    }
                    // InternalGumboParser.g:3006:4: (this_SLANG_STRING_31= RULE_SLANG_STRING )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==RULE_SLANG_STRING) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // InternalGumboParser.g:3007:5: this_SLANG_STRING_31= RULE_SLANG_STRING
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
                    // InternalGumboParser.g:3014:3: ( () otherlv_33= Do ( (lv_e_34_0= ruleExpr ) ) )
                    {
                    // InternalGumboParser.g:3014:3: ( () otherlv_33= Do ( (lv_e_34_0= ruleExpr ) ) )
                    // InternalGumboParser.g:3015:4: () otherlv_33= Do ( (lv_e_34_0= ruleExpr ) )
                    {
                    // InternalGumboParser.g:3015:4: ()
                    // InternalGumboParser.g:3016:5: 
                    {
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
                    // InternalGumboParser.g:3026:4: ( (lv_e_34_0= ruleExpr ) )
                    // InternalGumboParser.g:3027:5: (lv_e_34_0= ruleExpr )
                    {
                    // InternalGumboParser.g:3027:5: (lv_e_34_0= ruleExpr )
                    // InternalGumboParser.g:3028:6: lv_e_34_0= ruleExpr
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
                    // InternalGumboParser.g:3047:3: ( () ( (otherlv_36= RULE_ID ) ) (otherlv_37= Colon | ( (otherlv_38= ColonEqualsSign | this_DEFOP_39= RULE_DEFOP ) ( (lv_e_40_0= ruleExpr ) ) )? ) )
                    {
                    // InternalGumboParser.g:3047:3: ( () ( (otherlv_36= RULE_ID ) ) (otherlv_37= Colon | ( (otherlv_38= ColonEqualsSign | this_DEFOP_39= RULE_DEFOP ) ( (lv_e_40_0= ruleExpr ) ) )? ) )
                    // InternalGumboParser.g:3048:4: () ( (otherlv_36= RULE_ID ) ) (otherlv_37= Colon | ( (otherlv_38= ColonEqualsSign | this_DEFOP_39= RULE_DEFOP ) ( (lv_e_40_0= ruleExpr ) ) )? )
                    {
                    // InternalGumboParser.g:3048:4: ()
                    // InternalGumboParser.g:3049:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangStmtAccess().getSlangIdStmtAction_9_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:3055:4: ( (otherlv_36= RULE_ID ) )
                    // InternalGumboParser.g:3056:5: (otherlv_36= RULE_ID )
                    {
                    // InternalGumboParser.g:3056:5: (otherlv_36= RULE_ID )
                    // InternalGumboParser.g:3057:6: otherlv_36= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSlangStmtRule());
                      						}
                      					
                    }
                    otherlv_36=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_55); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_36, grammarAccess.getSlangStmtAccess().getPortOrSubcomponentOrStateVarEObjectCrossReference_9_1_0());
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:3068:4: (otherlv_37= Colon | ( (otherlv_38= ColonEqualsSign | this_DEFOP_39= RULE_DEFOP ) ( (lv_e_40_0= ruleExpr ) ) )? )
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==Colon) ) {
                        alt59=1;
                    }
                    else if ( (LA59_0==EOF||(LA59_0>=Assert && LA59_0<=Return)||LA59_0==Match||LA59_0==While||LA59_0==Case||(LA59_0>=Halt && LA59_0<=Spec)||(LA59_0>=Val && LA59_0<=Var)||LA59_0==ColonEqualsSign||(LA59_0>=Do && LA59_0<=If)||LA59_0==RightCurlyBracket||LA59_0==RULE_DEFOP||LA59_0==RULE_ID) ) {
                        alt59=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 59, 0, input);

                        throw nvae;
                    }
                    switch (alt59) {
                        case 1 :
                            // InternalGumboParser.g:3069:5: otherlv_37= Colon
                            {
                            otherlv_37=(Token)match(input,Colon,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_37, grammarAccess.getSlangStmtAccess().getColonKeyword_9_2_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalGumboParser.g:3074:5: ( (otherlv_38= ColonEqualsSign | this_DEFOP_39= RULE_DEFOP ) ( (lv_e_40_0= ruleExpr ) ) )?
                            {
                            // InternalGumboParser.g:3074:5: ( (otherlv_38= ColonEqualsSign | this_DEFOP_39= RULE_DEFOP ) ( (lv_e_40_0= ruleExpr ) ) )?
                            int alt58=2;
                            int LA58_0 = input.LA(1);

                            if ( (LA58_0==ColonEqualsSign||LA58_0==RULE_DEFOP) ) {
                                alt58=1;
                            }
                            switch (alt58) {
                                case 1 :
                                    // InternalGumboParser.g:3075:6: (otherlv_38= ColonEqualsSign | this_DEFOP_39= RULE_DEFOP ) ( (lv_e_40_0= ruleExpr ) )
                                    {
                                    // InternalGumboParser.g:3075:6: (otherlv_38= ColonEqualsSign | this_DEFOP_39= RULE_DEFOP )
                                    int alt57=2;
                                    int LA57_0 = input.LA(1);

                                    if ( (LA57_0==ColonEqualsSign) ) {
                                        alt57=1;
                                    }
                                    else if ( (LA57_0==RULE_DEFOP) ) {
                                        alt57=2;
                                    }
                                    else {
                                        if (state.backtracking>0) {state.failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 57, 0, input);

                                        throw nvae;
                                    }
                                    switch (alt57) {
                                        case 1 :
                                            // InternalGumboParser.g:3076:7: otherlv_38= ColonEqualsSign
                                            {
                                            otherlv_38=(Token)match(input,ColonEqualsSign,FollowSets000.FOLLOW_17); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                              							newLeafNode(otherlv_38, grammarAccess.getSlangStmtAccess().getColonEqualsSignKeyword_9_2_1_0_0());
                                              						
                                            }

                                            }
                                            break;
                                        case 2 :
                                            // InternalGumboParser.g:3081:7: this_DEFOP_39= RULE_DEFOP
                                            {
                                            this_DEFOP_39=(Token)match(input,RULE_DEFOP,FollowSets000.FOLLOW_17); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                              							newLeafNode(this_DEFOP_39, grammarAccess.getSlangStmtAccess().getDEFOPTerminalRuleCall_9_2_1_0_1());
                                              						
                                            }

                                            }
                                            break;

                                    }

                                    // InternalGumboParser.g:3086:6: ( (lv_e_40_0= ruleExpr ) )
                                    // InternalGumboParser.g:3087:7: (lv_e_40_0= ruleExpr )
                                    {
                                    // InternalGumboParser.g:3087:7: (lv_e_40_0= ruleExpr )
                                    // InternalGumboParser.g:3088:8: lv_e_40_0= ruleExpr
                                    {
                                    if ( state.backtracking==0 ) {

                                      								newCompositeNode(grammarAccess.getSlangStmtAccess().getEExprParserRuleCall_9_2_1_1_0());
                                      							
                                    }
                                    pushFollow(FollowSets000.FOLLOW_2);
                                    lv_e_40_0=ruleExpr();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								if (current==null) {
                                      									current = createModelElementForParent(grammarAccess.getSlangStmtRule());
                                      								}
                                      								set(
                                      									current,
                                      									"e",
                                      									lv_e_40_0,
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
    // InternalGumboParser.g:3112:1: entryRuleSlangElse returns [EObject current=null] : iv_ruleSlangElse= ruleSlangElse EOF ;
    public final EObject entryRuleSlangElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangElse = null;


        try {
            // InternalGumboParser.g:3112:50: (iv_ruleSlangElse= ruleSlangElse EOF )
            // InternalGumboParser.g:3113:2: iv_ruleSlangElse= ruleSlangElse EOF
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
    // InternalGumboParser.g:3119:1: ruleSlangElse returns [EObject current=null] : (otherlv_0= Else ( (otherlv_1= If ( (lv_cond_2_0= ruleExpr ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )? ) | this_SlangBlock_5= ruleSlangBlock ) ) ;
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
            // InternalGumboParser.g:3125:2: ( (otherlv_0= Else ( (otherlv_1= If ( (lv_cond_2_0= ruleExpr ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )? ) | this_SlangBlock_5= ruleSlangBlock ) ) )
            // InternalGumboParser.g:3126:2: (otherlv_0= Else ( (otherlv_1= If ( (lv_cond_2_0= ruleExpr ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )? ) | this_SlangBlock_5= ruleSlangBlock ) )
            {
            // InternalGumboParser.g:3126:2: (otherlv_0= Else ( (otherlv_1= If ( (lv_cond_2_0= ruleExpr ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )? ) | this_SlangBlock_5= ruleSlangBlock ) )
            // InternalGumboParser.g:3127:3: otherlv_0= Else ( (otherlv_1= If ( (lv_cond_2_0= ruleExpr ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )? ) | this_SlangBlock_5= ruleSlangBlock )
            {
            otherlv_0=(Token)match(input,Else,FollowSets000.FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangElseAccess().getElseKeyword_0());
              		
            }
            // InternalGumboParser.g:3131:3: ( (otherlv_1= If ( (lv_cond_2_0= ruleExpr ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )? ) | this_SlangBlock_5= ruleSlangBlock )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==If) ) {
                alt62=1;
            }
            else if ( (LA62_0==LeftCurlyBracket) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // InternalGumboParser.g:3132:4: (otherlv_1= If ( (lv_cond_2_0= ruleExpr ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )? )
                    {
                    // InternalGumboParser.g:3132:4: (otherlv_1= If ( (lv_cond_2_0= ruleExpr ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )? )
                    // InternalGumboParser.g:3133:5: otherlv_1= If ( (lv_cond_2_0= ruleExpr ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )?
                    {
                    otherlv_1=(Token)match(input,If,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getSlangElseAccess().getIfKeyword_1_0_0());
                      				
                    }
                    // InternalGumboParser.g:3137:5: ( (lv_cond_2_0= ruleExpr ) )
                    // InternalGumboParser.g:3138:6: (lv_cond_2_0= ruleExpr )
                    {
                    // InternalGumboParser.g:3138:6: (lv_cond_2_0= ruleExpr )
                    // InternalGumboParser.g:3139:7: lv_cond_2_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSlangElseAccess().getCondExprParserRuleCall_1_0_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_50);
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

                    // InternalGumboParser.g:3156:5: ( (lv_b_3_0= ruleSlangBlock ) )
                    // InternalGumboParser.g:3157:6: (lv_b_3_0= ruleSlangBlock )
                    {
                    // InternalGumboParser.g:3157:6: (lv_b_3_0= ruleSlangBlock )
                    // InternalGumboParser.g:3158:7: lv_b_3_0= ruleSlangBlock
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSlangElseAccess().getBSlangBlockParserRuleCall_1_0_2_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_51);
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

                    // InternalGumboParser.g:3175:5: ( (lv_e_4_0= ruleSlangElse ) )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==Else) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // InternalGumboParser.g:3176:6: (lv_e_4_0= ruleSlangElse )
                            {
                            // InternalGumboParser.g:3176:6: (lv_e_4_0= ruleSlangElse )
                            // InternalGumboParser.g:3177:7: lv_e_4_0= ruleSlangElse
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
                    // InternalGumboParser.g:3196:4: this_SlangBlock_5= ruleSlangBlock
                    {
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
    // InternalGumboParser.g:3209:1: entryRuleSlangLoopContract returns [EObject current=null] : iv_ruleSlangLoopContract= ruleSlangLoopContract EOF ;
    public final EObject entryRuleSlangLoopContract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangLoopContract = null;


        try {
            // InternalGumboParser.g:3209:58: (iv_ruleSlangLoopContract= ruleSlangLoopContract EOF )
            // InternalGumboParser.g:3210:2: iv_ruleSlangLoopContract= ruleSlangLoopContract EOF
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
    // InternalGumboParser.g:3216:1: ruleSlangLoopContract returns [EObject current=null] : ( () ( (lv_inv_1_0= ruleSlangInvariant ) )? ( (lv_mod_2_0= ruleSlangModifies ) )? ) ;
    public final EObject ruleSlangLoopContract() throws RecognitionException {
        EObject current = null;

        EObject lv_inv_1_0 = null;

        EObject lv_mod_2_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:3222:2: ( ( () ( (lv_inv_1_0= ruleSlangInvariant ) )? ( (lv_mod_2_0= ruleSlangModifies ) )? ) )
            // InternalGumboParser.g:3223:2: ( () ( (lv_inv_1_0= ruleSlangInvariant ) )? ( (lv_mod_2_0= ruleSlangModifies ) )? )
            {
            // InternalGumboParser.g:3223:2: ( () ( (lv_inv_1_0= ruleSlangInvariant ) )? ( (lv_mod_2_0= ruleSlangModifies ) )? )
            // InternalGumboParser.g:3224:3: () ( (lv_inv_1_0= ruleSlangInvariant ) )? ( (lv_mod_2_0= ruleSlangModifies ) )?
            {
            // InternalGumboParser.g:3224:3: ()
            // InternalGumboParser.g:3225:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSlangLoopContractAccess().getSlangLoopContractAction_0(),
              					current);
              			
            }

            }

            // InternalGumboParser.g:3231:3: ( (lv_inv_1_0= ruleSlangInvariant ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==Invariant) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalGumboParser.g:3232:4: (lv_inv_1_0= ruleSlangInvariant )
                    {
                    // InternalGumboParser.g:3232:4: (lv_inv_1_0= ruleSlangInvariant )
                    // InternalGumboParser.g:3233:5: lv_inv_1_0= ruleSlangInvariant
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangLoopContractAccess().getInvSlangInvariantParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_45);
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

            // InternalGumboParser.g:3250:3: ( (lv_mod_2_0= ruleSlangModifies ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==Modifies) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalGumboParser.g:3251:4: (lv_mod_2_0= ruleSlangModifies )
                    {
                    // InternalGumboParser.g:3251:4: (lv_mod_2_0= ruleSlangModifies )
                    // InternalGumboParser.g:3252:5: lv_mod_2_0= ruleSlangModifies
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


    // $ANTLR start "entryRuleSlangCase"
    // InternalGumboParser.g:3273:1: entryRuleSlangCase returns [EObject current=null] : iv_ruleSlangCase= ruleSlangCase EOF ;
    public final EObject entryRuleSlangCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangCase = null;


        try {
            // InternalGumboParser.g:3273:50: (iv_ruleSlangCase= ruleSlangCase EOF )
            // InternalGumboParser.g:3274:2: iv_ruleSlangCase= ruleSlangCase EOF
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
    // InternalGumboParser.g:3280:1: ruleSlangCase returns [EObject current=null] : (otherlv_0= Case ( (lv_pattern_1_0= ruleSlangPattern ) ) (otherlv_2= If ( (lv_e_3_0= ruleExpr ) ) )? otherlv_4= EqualsSignGreaterThanSign ( (lv_s_5_0= ruleSlangStmt ) )* ) ;
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
            // InternalGumboParser.g:3286:2: ( (otherlv_0= Case ( (lv_pattern_1_0= ruleSlangPattern ) ) (otherlv_2= If ( (lv_e_3_0= ruleExpr ) ) )? otherlv_4= EqualsSignGreaterThanSign ( (lv_s_5_0= ruleSlangStmt ) )* ) )
            // InternalGumboParser.g:3287:2: (otherlv_0= Case ( (lv_pattern_1_0= ruleSlangPattern ) ) (otherlv_2= If ( (lv_e_3_0= ruleExpr ) ) )? otherlv_4= EqualsSignGreaterThanSign ( (lv_s_5_0= ruleSlangStmt ) )* )
            {
            // InternalGumboParser.g:3287:2: (otherlv_0= Case ( (lv_pattern_1_0= ruleSlangPattern ) ) (otherlv_2= If ( (lv_e_3_0= ruleExpr ) ) )? otherlv_4= EqualsSignGreaterThanSign ( (lv_s_5_0= ruleSlangStmt ) )* )
            // InternalGumboParser.g:3288:3: otherlv_0= Case ( (lv_pattern_1_0= ruleSlangPattern ) ) (otherlv_2= If ( (lv_e_3_0= ruleExpr ) ) )? otherlv_4= EqualsSignGreaterThanSign ( (lv_s_5_0= ruleSlangStmt ) )*
            {
            otherlv_0=(Token)match(input,Case,FollowSets000.FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangCaseAccess().getCaseKeyword_0());
              		
            }
            // InternalGumboParser.g:3292:3: ( (lv_pattern_1_0= ruleSlangPattern ) )
            // InternalGumboParser.g:3293:4: (lv_pattern_1_0= ruleSlangPattern )
            {
            // InternalGumboParser.g:3293:4: (lv_pattern_1_0= ruleSlangPattern )
            // InternalGumboParser.g:3294:5: lv_pattern_1_0= ruleSlangPattern
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangCaseAccess().getPatternSlangPatternParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_58);
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

            // InternalGumboParser.g:3311:3: (otherlv_2= If ( (lv_e_3_0= ruleExpr ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==If) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalGumboParser.g:3312:4: otherlv_2= If ( (lv_e_3_0= ruleExpr ) )
                    {
                    otherlv_2=(Token)match(input,If,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSlangCaseAccess().getIfKeyword_2_0());
                      			
                    }
                    // InternalGumboParser.g:3316:4: ( (lv_e_3_0= ruleExpr ) )
                    // InternalGumboParser.g:3317:5: (lv_e_3_0= ruleExpr )
                    {
                    // InternalGumboParser.g:3317:5: (lv_e_3_0= ruleExpr )
                    // InternalGumboParser.g:3318:6: lv_e_3_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangCaseAccess().getEExprParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_59);
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

            otherlv_4=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getSlangCaseAccess().getEqualsSignGreaterThanSignKeyword_3());
              		
            }
            // InternalGumboParser.g:3340:3: ( (lv_s_5_0= ruleSlangStmt ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( ((LA66_0>=Assert && LA66_0<=Assume)||LA66_0==Match||LA66_0==While||(LA66_0>=Halt && LA66_0<=Spec)||(LA66_0>=Val && LA66_0<=Var)||(LA66_0>=Do && LA66_0<=If)||LA66_0==RULE_ID) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalGumboParser.g:3341:4: (lv_s_5_0= ruleSlangStmt )
            	    {
            	    // InternalGumboParser.g:3341:4: (lv_s_5_0= ruleSlangStmt )
            	    // InternalGumboParser.g:3342:5: lv_s_5_0= ruleSlangStmt
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSlangCaseAccess().getSSlangStmtParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_60);
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
            	    break loop66;
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
    // InternalGumboParser.g:3363:1: entryRuleSlangPattern returns [EObject current=null] : iv_ruleSlangPattern= ruleSlangPattern EOF ;
    public final EObject entryRuleSlangPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangPattern = null;


        try {
            // InternalGumboParser.g:3363:53: (iv_ruleSlangPattern= ruleSlangPattern EOF )
            // InternalGumboParser.g:3364:2: iv_ruleSlangPattern= ruleSlangPattern EOF
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
    // InternalGumboParser.g:3370:1: ruleSlangPattern returns [EObject current=null] : ( ( () this_ID_1= RULE_ID (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis )? ) | (otherlv_7= LeftParenthesis ( (lv_patterns_8_0= ruleSlangTPattern ) ) (otherlv_9= Comma ( (lv_patterns_10_0= ruleSlangTPattern ) ) )* otherlv_11= RightParenthesis ) ) ;
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
            // InternalGumboParser.g:3376:2: ( ( ( () this_ID_1= RULE_ID (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis )? ) | (otherlv_7= LeftParenthesis ( (lv_patterns_8_0= ruleSlangTPattern ) ) (otherlv_9= Comma ( (lv_patterns_10_0= ruleSlangTPattern ) ) )* otherlv_11= RightParenthesis ) ) )
            // InternalGumboParser.g:3377:2: ( ( () this_ID_1= RULE_ID (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis )? ) | (otherlv_7= LeftParenthesis ( (lv_patterns_8_0= ruleSlangTPattern ) ) (otherlv_9= Comma ( (lv_patterns_10_0= ruleSlangTPattern ) ) )* otherlv_11= RightParenthesis ) )
            {
            // InternalGumboParser.g:3377:2: ( ( () this_ID_1= RULE_ID (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis )? ) | (otherlv_7= LeftParenthesis ( (lv_patterns_8_0= ruleSlangTPattern ) ) (otherlv_9= Comma ( (lv_patterns_10_0= ruleSlangTPattern ) ) )* otherlv_11= RightParenthesis ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_ID) ) {
                alt70=1;
            }
            else if ( (LA70_0==LeftParenthesis) ) {
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
                    // InternalGumboParser.g:3378:3: ( () this_ID_1= RULE_ID (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis )? )
                    {
                    // InternalGumboParser.g:3378:3: ( () this_ID_1= RULE_ID (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis )? )
                    // InternalGumboParser.g:3379:4: () this_ID_1= RULE_ID (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis )?
                    {
                    // InternalGumboParser.g:3379:4: ()
                    // InternalGumboParser.g:3380:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangPatternAccess().getSlangPatternAction_0_0(),
                      						current);
                      				
                    }

                    }

                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_61); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_1, grammarAccess.getSlangPatternAccess().getIDTerminalRuleCall_0_1());
                      			
                    }
                    // InternalGumboParser.g:3390:4: (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==LeftParenthesis) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // InternalGumboParser.g:3391:5: otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis
                            {
                            otherlv_2=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_62); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getSlangPatternAccess().getLeftParenthesisKeyword_0_2_0());
                              				
                            }
                            // InternalGumboParser.g:3395:5: ( (lv_patterns_3_0= ruleSlangTPattern ) )
                            // InternalGumboParser.g:3396:6: (lv_patterns_3_0= ruleSlangTPattern )
                            {
                            // InternalGumboParser.g:3396:6: (lv_patterns_3_0= ruleSlangTPattern )
                            // InternalGumboParser.g:3397:7: lv_patterns_3_0= ruleSlangTPattern
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSlangPatternAccess().getPatternsSlangTPatternParserRuleCall_0_2_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_36);
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

                            // InternalGumboParser.g:3414:5: (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )*
                            loop67:
                            do {
                                int alt67=2;
                                int LA67_0 = input.LA(1);

                                if ( (LA67_0==Comma) ) {
                                    alt67=1;
                                }


                                switch (alt67) {
                            	case 1 :
                            	    // InternalGumboParser.g:3415:6: otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) )
                            	    {
                            	    otherlv_4=(Token)match(input,Comma,FollowSets000.FOLLOW_62); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_4, grammarAccess.getSlangPatternAccess().getCommaKeyword_0_2_2_0());
                            	      					
                            	    }
                            	    // InternalGumboParser.g:3419:6: ( (lv_patterns_5_0= ruleSlangTPattern ) )
                            	    // InternalGumboParser.g:3420:7: (lv_patterns_5_0= ruleSlangTPattern )
                            	    {
                            	    // InternalGumboParser.g:3420:7: (lv_patterns_5_0= ruleSlangTPattern )
                            	    // InternalGumboParser.g:3421:8: lv_patterns_5_0= ruleSlangTPattern
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getSlangPatternAccess().getPatternsSlangTPatternParserRuleCall_0_2_2_1_0());
                            	      							
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_36);
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
                            	    break loop67;
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
                    // InternalGumboParser.g:3446:3: (otherlv_7= LeftParenthesis ( (lv_patterns_8_0= ruleSlangTPattern ) ) (otherlv_9= Comma ( (lv_patterns_10_0= ruleSlangTPattern ) ) )* otherlv_11= RightParenthesis )
                    {
                    // InternalGumboParser.g:3446:3: (otherlv_7= LeftParenthesis ( (lv_patterns_8_0= ruleSlangTPattern ) ) (otherlv_9= Comma ( (lv_patterns_10_0= ruleSlangTPattern ) ) )* otherlv_11= RightParenthesis )
                    // InternalGumboParser.g:3447:4: otherlv_7= LeftParenthesis ( (lv_patterns_8_0= ruleSlangTPattern ) ) (otherlv_9= Comma ( (lv_patterns_10_0= ruleSlangTPattern ) ) )* otherlv_11= RightParenthesis
                    {
                    otherlv_7=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_62); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getSlangPatternAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalGumboParser.g:3451:4: ( (lv_patterns_8_0= ruleSlangTPattern ) )
                    // InternalGumboParser.g:3452:5: (lv_patterns_8_0= ruleSlangTPattern )
                    {
                    // InternalGumboParser.g:3452:5: (lv_patterns_8_0= ruleSlangTPattern )
                    // InternalGumboParser.g:3453:6: lv_patterns_8_0= ruleSlangTPattern
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangPatternAccess().getPatternsSlangTPatternParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_36);
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

                    // InternalGumboParser.g:3470:4: (otherlv_9= Comma ( (lv_patterns_10_0= ruleSlangTPattern ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==Comma) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // InternalGumboParser.g:3471:5: otherlv_9= Comma ( (lv_patterns_10_0= ruleSlangTPattern ) )
                    	    {
                    	    otherlv_9=(Token)match(input,Comma,FollowSets000.FOLLOW_62); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_9, grammarAccess.getSlangPatternAccess().getCommaKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:3475:5: ( (lv_patterns_10_0= ruleSlangTPattern ) )
                    	    // InternalGumboParser.g:3476:6: (lv_patterns_10_0= ruleSlangTPattern )
                    	    {
                    	    // InternalGumboParser.g:3476:6: (lv_patterns_10_0= ruleSlangTPattern )
                    	    // InternalGumboParser.g:3477:7: lv_patterns_10_0= ruleSlangTPattern
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSlangPatternAccess().getPatternsSlangTPatternParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_36);
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
                    	    break loop69;
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
    // InternalGumboParser.g:3504:1: entryRuleSlangTPattern returns [EObject current=null] : iv_ruleSlangTPattern= ruleSlangTPattern EOF ;
    public final EObject entryRuleSlangTPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangTPattern = null;


        try {
            // InternalGumboParser.g:3504:54: (iv_ruleSlangTPattern= ruleSlangTPattern EOF )
            // InternalGumboParser.g:3505:2: iv_ruleSlangTPattern= ruleSlangTPattern EOF
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
    // InternalGumboParser.g:3511:1: ruleSlangTPattern returns [EObject current=null] : ( ( () this_ID_1= RULE_ID ( (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis ) | (otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) ) ) )? ) | (otherlv_9= LeftParenthesis ( (lv_patterns_10_0= ruleSlangTPattern ) ) (otherlv_11= Comma ( (lv_patterns_12_0= ruleSlangTPattern ) ) )* otherlv_13= RightParenthesis ) | ( () otherlv_15= KW__ (otherlv_16= Colon ( (lv_type_17_0= ruleSlangType ) ) )? ) ) ;
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
            // InternalGumboParser.g:3517:2: ( ( ( () this_ID_1= RULE_ID ( (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis ) | (otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) ) ) )? ) | (otherlv_9= LeftParenthesis ( (lv_patterns_10_0= ruleSlangTPattern ) ) (otherlv_11= Comma ( (lv_patterns_12_0= ruleSlangTPattern ) ) )* otherlv_13= RightParenthesis ) | ( () otherlv_15= KW__ (otherlv_16= Colon ( (lv_type_17_0= ruleSlangType ) ) )? ) ) )
            // InternalGumboParser.g:3518:2: ( ( () this_ID_1= RULE_ID ( (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis ) | (otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) ) ) )? ) | (otherlv_9= LeftParenthesis ( (lv_patterns_10_0= ruleSlangTPattern ) ) (otherlv_11= Comma ( (lv_patterns_12_0= ruleSlangTPattern ) ) )* otherlv_13= RightParenthesis ) | ( () otherlv_15= KW__ (otherlv_16= Colon ( (lv_type_17_0= ruleSlangType ) ) )? ) )
            {
            // InternalGumboParser.g:3518:2: ( ( () this_ID_1= RULE_ID ( (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis ) | (otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) ) ) )? ) | (otherlv_9= LeftParenthesis ( (lv_patterns_10_0= ruleSlangTPattern ) ) (otherlv_11= Comma ( (lv_patterns_12_0= ruleSlangTPattern ) ) )* otherlv_13= RightParenthesis ) | ( () otherlv_15= KW__ (otherlv_16= Colon ( (lv_type_17_0= ruleSlangType ) ) )? ) )
            int alt75=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt75=1;
                }
                break;
            case LeftParenthesis:
                {
                alt75=2;
                }
                break;
            case KW__:
                {
                alt75=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // InternalGumboParser.g:3519:3: ( () this_ID_1= RULE_ID ( (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis ) | (otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) ) ) )? )
                    {
                    // InternalGumboParser.g:3519:3: ( () this_ID_1= RULE_ID ( (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis ) | (otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) ) ) )? )
                    // InternalGumboParser.g:3520:4: () this_ID_1= RULE_ID ( (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis ) | (otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) ) ) )?
                    {
                    // InternalGumboParser.g:3520:4: ()
                    // InternalGumboParser.g:3521:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangTPatternAccess().getSlangTPatternAction_0_0(),
                      						current);
                      				
                    }

                    }

                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_63); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_1, grammarAccess.getSlangTPatternAccess().getIDTerminalRuleCall_0_1());
                      			
                    }
                    // InternalGumboParser.g:3531:4: ( (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis ) | (otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) ) ) )?
                    int alt72=3;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==LeftParenthesis) ) {
                        alt72=1;
                    }
                    else if ( (LA72_0==Colon) ) {
                        alt72=2;
                    }
                    switch (alt72) {
                        case 1 :
                            // InternalGumboParser.g:3532:5: (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis )
                            {
                            // InternalGumboParser.g:3532:5: (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis )
                            // InternalGumboParser.g:3533:6: otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis
                            {
                            otherlv_2=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_62); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_2, grammarAccess.getSlangTPatternAccess().getLeftParenthesisKeyword_0_2_0_0());
                              					
                            }
                            // InternalGumboParser.g:3537:6: ( (lv_patterns_3_0= ruleSlangTPattern ) )
                            // InternalGumboParser.g:3538:7: (lv_patterns_3_0= ruleSlangTPattern )
                            {
                            // InternalGumboParser.g:3538:7: (lv_patterns_3_0= ruleSlangTPattern )
                            // InternalGumboParser.g:3539:8: lv_patterns_3_0= ruleSlangTPattern
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getSlangTPatternAccess().getPatternsSlangTPatternParserRuleCall_0_2_0_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_36);
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

                            // InternalGumboParser.g:3556:6: (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )*
                            loop71:
                            do {
                                int alt71=2;
                                int LA71_0 = input.LA(1);

                                if ( (LA71_0==Comma) ) {
                                    alt71=1;
                                }


                                switch (alt71) {
                            	case 1 :
                            	    // InternalGumboParser.g:3557:7: otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) )
                            	    {
                            	    otherlv_4=(Token)match(input,Comma,FollowSets000.FOLLOW_62); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_4, grammarAccess.getSlangTPatternAccess().getCommaKeyword_0_2_0_2_0());
                            	      						
                            	    }
                            	    // InternalGumboParser.g:3561:7: ( (lv_patterns_5_0= ruleSlangTPattern ) )
                            	    // InternalGumboParser.g:3562:8: (lv_patterns_5_0= ruleSlangTPattern )
                            	    {
                            	    // InternalGumboParser.g:3562:8: (lv_patterns_5_0= ruleSlangTPattern )
                            	    // InternalGumboParser.g:3563:9: lv_patterns_5_0= ruleSlangTPattern
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getSlangTPatternAccess().getPatternsSlangTPatternParserRuleCall_0_2_0_2_1_0());
                            	      								
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_36);
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
                            	    break loop71;
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
                            // InternalGumboParser.g:3587:5: (otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) ) )
                            {
                            // InternalGumboParser.g:3587:5: (otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) ) )
                            // InternalGumboParser.g:3588:6: otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) )
                            {
                            otherlv_7=(Token)match(input,Colon,FollowSets000.FOLLOW_10); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_7, grammarAccess.getSlangTPatternAccess().getColonKeyword_0_2_1_0());
                              					
                            }
                            // InternalGumboParser.g:3592:6: ( (lv_type_8_0= ruleSlangType ) )
                            // InternalGumboParser.g:3593:7: (lv_type_8_0= ruleSlangType )
                            {
                            // InternalGumboParser.g:3593:7: (lv_type_8_0= ruleSlangType )
                            // InternalGumboParser.g:3594:8: lv_type_8_0= ruleSlangType
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
                    // InternalGumboParser.g:3615:3: (otherlv_9= LeftParenthesis ( (lv_patterns_10_0= ruleSlangTPattern ) ) (otherlv_11= Comma ( (lv_patterns_12_0= ruleSlangTPattern ) ) )* otherlv_13= RightParenthesis )
                    {
                    // InternalGumboParser.g:3615:3: (otherlv_9= LeftParenthesis ( (lv_patterns_10_0= ruleSlangTPattern ) ) (otherlv_11= Comma ( (lv_patterns_12_0= ruleSlangTPattern ) ) )* otherlv_13= RightParenthesis )
                    // InternalGumboParser.g:3616:4: otherlv_9= LeftParenthesis ( (lv_patterns_10_0= ruleSlangTPattern ) ) (otherlv_11= Comma ( (lv_patterns_12_0= ruleSlangTPattern ) ) )* otherlv_13= RightParenthesis
                    {
                    otherlv_9=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_62); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getSlangTPatternAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalGumboParser.g:3620:4: ( (lv_patterns_10_0= ruleSlangTPattern ) )
                    // InternalGumboParser.g:3621:5: (lv_patterns_10_0= ruleSlangTPattern )
                    {
                    // InternalGumboParser.g:3621:5: (lv_patterns_10_0= ruleSlangTPattern )
                    // InternalGumboParser.g:3622:6: lv_patterns_10_0= ruleSlangTPattern
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangTPatternAccess().getPatternsSlangTPatternParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_36);
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

                    // InternalGumboParser.g:3639:4: (otherlv_11= Comma ( (lv_patterns_12_0= ruleSlangTPattern ) ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==Comma) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // InternalGumboParser.g:3640:5: otherlv_11= Comma ( (lv_patterns_12_0= ruleSlangTPattern ) )
                    	    {
                    	    otherlv_11=(Token)match(input,Comma,FollowSets000.FOLLOW_62); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_11, grammarAccess.getSlangTPatternAccess().getCommaKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:3644:5: ( (lv_patterns_12_0= ruleSlangTPattern ) )
                    	    // InternalGumboParser.g:3645:6: (lv_patterns_12_0= ruleSlangTPattern )
                    	    {
                    	    // InternalGumboParser.g:3645:6: (lv_patterns_12_0= ruleSlangTPattern )
                    	    // InternalGumboParser.g:3646:7: lv_patterns_12_0= ruleSlangTPattern
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSlangTPatternAccess().getPatternsSlangTPatternParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_36);
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
                    	    break loop73;
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
                    // InternalGumboParser.g:3670:3: ( () otherlv_15= KW__ (otherlv_16= Colon ( (lv_type_17_0= ruleSlangType ) ) )? )
                    {
                    // InternalGumboParser.g:3670:3: ( () otherlv_15= KW__ (otherlv_16= Colon ( (lv_type_17_0= ruleSlangType ) ) )? )
                    // InternalGumboParser.g:3671:4: () otherlv_15= KW__ (otherlv_16= Colon ( (lv_type_17_0= ruleSlangType ) ) )?
                    {
                    // InternalGumboParser.g:3671:4: ()
                    // InternalGumboParser.g:3672:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangTPatternAccess().getSlangTPatternAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_15=(Token)match(input,KW__,FollowSets000.FOLLOW_64); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getSlangTPatternAccess().get_Keyword_2_1());
                      			
                    }
                    // InternalGumboParser.g:3682:4: (otherlv_16= Colon ( (lv_type_17_0= ruleSlangType ) ) )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==Colon) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // InternalGumboParser.g:3683:5: otherlv_16= Colon ( (lv_type_17_0= ruleSlangType ) )
                            {
                            otherlv_16=(Token)match(input,Colon,FollowSets000.FOLLOW_10); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_16, grammarAccess.getSlangTPatternAccess().getColonKeyword_2_2_0());
                              				
                            }
                            // InternalGumboParser.g:3687:5: ( (lv_type_17_0= ruleSlangType ) )
                            // InternalGumboParser.g:3688:6: (lv_type_17_0= ruleSlangType )
                            {
                            // InternalGumboParser.g:3688:6: (lv_type_17_0= ruleSlangType )
                            // InternalGumboParser.g:3689:7: lv_type_17_0= ruleSlangType
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
    // InternalGumboParser.g:3712:1: entryRuleSlangVarDef returns [EObject current=null] : iv_ruleSlangVarDef= ruleSlangVarDef EOF ;
    public final EObject entryRuleSlangVarDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangVarDef = null;


        try {
            // InternalGumboParser.g:3712:52: (iv_ruleSlangVarDef= ruleSlangVarDef EOF )
            // InternalGumboParser.g:3713:2: iv_ruleSlangVarDef= ruleSlangVarDef EOF
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
    // InternalGumboParser.g:3719:1: ruleSlangVarDef returns [EObject current=null] : ( ruleSlangVarMod this_SlangPattern_1= ruleSlangPattern (otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) )? otherlv_4= ColonEqualsSign ( (lv_init_5_0= ruleExpr ) ) ) ;
    public final EObject ruleSlangVarDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_SlangPattern_1 = null;

        EObject lv_typeName_3_0 = null;

        EObject lv_init_5_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:3725:2: ( ( ruleSlangVarMod this_SlangPattern_1= ruleSlangPattern (otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) )? otherlv_4= ColonEqualsSign ( (lv_init_5_0= ruleExpr ) ) ) )
            // InternalGumboParser.g:3726:2: ( ruleSlangVarMod this_SlangPattern_1= ruleSlangPattern (otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) )? otherlv_4= ColonEqualsSign ( (lv_init_5_0= ruleExpr ) ) )
            {
            // InternalGumboParser.g:3726:2: ( ruleSlangVarMod this_SlangPattern_1= ruleSlangPattern (otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) )? otherlv_4= ColonEqualsSign ( (lv_init_5_0= ruleExpr ) ) )
            // InternalGumboParser.g:3727:3: ruleSlangVarMod this_SlangPattern_1= ruleSlangPattern (otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) )? otherlv_4= ColonEqualsSign ( (lv_init_5_0= ruleExpr ) )
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSlangVarDefAccess().getSlangVarModParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_57);
            ruleSlangVarMod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSlangVarDefAccess().getSlangPatternParserRuleCall_1());
              		
            }
            pushFollow(FollowSets000.FOLLOW_65);
            this_SlangPattern_1=ruleSlangPattern();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SlangPattern_1;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGumboParser.g:3742:3: (otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==Colon) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalGumboParser.g:3743:4: otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) )
                    {
                    otherlv_2=(Token)match(input,Colon,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSlangVarDefAccess().getColonKeyword_2_0());
                      			
                    }
                    // InternalGumboParser.g:3747:4: ( (lv_typeName_3_0= ruleSlangType ) )
                    // InternalGumboParser.g:3748:5: (lv_typeName_3_0= ruleSlangType )
                    {
                    // InternalGumboParser.g:3748:5: (lv_typeName_3_0= ruleSlangType )
                    // InternalGumboParser.g:3749:6: lv_typeName_3_0= ruleSlangType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangVarDefAccess().getTypeNameSlangTypeParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_34);
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
            // InternalGumboParser.g:3771:3: ( (lv_init_5_0= ruleExpr ) )
            // InternalGumboParser.g:3772:4: (lv_init_5_0= ruleExpr )
            {
            // InternalGumboParser.g:3772:4: (lv_init_5_0= ruleExpr )
            // InternalGumboParser.g:3773:5: lv_init_5_0= ruleExpr
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
    // InternalGumboParser.g:3794:1: entryRuleSlangVarMod returns [String current=null] : iv_ruleSlangVarMod= ruleSlangVarMod EOF ;
    public final String entryRuleSlangVarMod() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSlangVarMod = null;


        try {
            // InternalGumboParser.g:3794:51: (iv_ruleSlangVarMod= ruleSlangVarMod EOF )
            // InternalGumboParser.g:3795:2: iv_ruleSlangVarMod= ruleSlangVarMod EOF
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
    // InternalGumboParser.g:3801:1: ruleSlangVarMod returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Val | kw= Var ) ;
    public final AntlrDatatypeRuleToken ruleSlangVarMod() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumboParser.g:3807:2: ( (kw= Val | kw= Var ) )
            // InternalGumboParser.g:3808:2: (kw= Val | kw= Var )
            {
            // InternalGumboParser.g:3808:2: (kw= Val | kw= Var )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==Val) ) {
                alt77=1;
            }
            else if ( (LA77_0==Var) ) {
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
                    // InternalGumboParser.g:3809:3: kw= Val
                    {
                    kw=(Token)match(input,Val,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getSlangVarModAccess().getValKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:3815:3: kw= Var
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
    // InternalGumboParser.g:3824:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // InternalGumboParser.g:3824:45: (iv_ruleExpr= ruleExpr EOF )
            // InternalGumboParser.g:3825:2: iv_ruleExpr= ruleExpr EOF
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
    // InternalGumboParser.g:3831:1: ruleExpr returns [EObject current=null] : ( ( () ( (lv_terms_1_0= ruleSlangAccess ) ) ( ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )* | (otherlv_4= QuestionMark ( (lv_thenExpr_5_0= ruleExpr ) ) otherlv_6= Colon ( (lv_elseExpr_7_0= ruleExpr ) ) ) ) ) | ( () (otherlv_9= All | otherlv_10= Some | otherlv_11= ForAll | otherlv_12= ThereExists ) ( (lv_qVar_13_0= ruleSlangQuantVar ) ) (otherlv_14= Comma ( (lv_qVar_15_0= ruleSlangQuantVar ) ) )* otherlv_16= EqualsSignGreaterThanSign ( (lv_quantifiedExpr_17_0= ruleExpr ) ) ) | ( () ( (lv_op_19_0= ruleOperator ) ) ( (lv_accessExp_20_0= ruleSlangAccess ) ) ) ) ;
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
            // InternalGumboParser.g:3837:2: ( ( ( () ( (lv_terms_1_0= ruleSlangAccess ) ) ( ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )* | (otherlv_4= QuestionMark ( (lv_thenExpr_5_0= ruleExpr ) ) otherlv_6= Colon ( (lv_elseExpr_7_0= ruleExpr ) ) ) ) ) | ( () (otherlv_9= All | otherlv_10= Some | otherlv_11= ForAll | otherlv_12= ThereExists ) ( (lv_qVar_13_0= ruleSlangQuantVar ) ) (otherlv_14= Comma ( (lv_qVar_15_0= ruleSlangQuantVar ) ) )* otherlv_16= EqualsSignGreaterThanSign ( (lv_quantifiedExpr_17_0= ruleExpr ) ) ) | ( () ( (lv_op_19_0= ruleOperator ) ) ( (lv_accessExp_20_0= ruleSlangAccess ) ) ) ) )
            // InternalGumboParser.g:3838:2: ( ( () ( (lv_terms_1_0= ruleSlangAccess ) ) ( ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )* | (otherlv_4= QuestionMark ( (lv_thenExpr_5_0= ruleExpr ) ) otherlv_6= Colon ( (lv_elseExpr_7_0= ruleExpr ) ) ) ) ) | ( () (otherlv_9= All | otherlv_10= Some | otherlv_11= ForAll | otherlv_12= ThereExists ) ( (lv_qVar_13_0= ruleSlangQuantVar ) ) (otherlv_14= Comma ( (lv_qVar_15_0= ruleSlangQuantVar ) ) )* otherlv_16= EqualsSignGreaterThanSign ( (lv_quantifiedExpr_17_0= ruleExpr ) ) ) | ( () ( (lv_op_19_0= ruleOperator ) ) ( (lv_accessExp_20_0= ruleSlangAccess ) ) ) )
            {
            // InternalGumboParser.g:3838:2: ( ( () ( (lv_terms_1_0= ruleSlangAccess ) ) ( ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )* | (otherlv_4= QuestionMark ( (lv_thenExpr_5_0= ruleExpr ) ) otherlv_6= Colon ( (lv_elseExpr_7_0= ruleExpr ) ) ) ) ) | ( () (otherlv_9= All | otherlv_10= Some | otherlv_11= ForAll | otherlv_12= ThereExists ) ( (lv_qVar_13_0= ruleSlangQuantVar ) ) (otherlv_14= Comma ( (lv_qVar_15_0= ruleSlangQuantVar ) ) )* otherlv_16= EqualsSignGreaterThanSign ( (lv_quantifiedExpr_17_0= ruleExpr ) ) ) | ( () ( (lv_op_19_0= ruleOperator ) ) ( (lv_accessExp_20_0= ruleSlangAccess ) ) ) )
            int alt82=3;
            switch ( input.LA(1) ) {
            case Enum:
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
                alt82=1;
                }
                break;
            case Some:
            case All:
            case ForAll:
            case ThereExists:
                {
                alt82=2;
                }
                break;
            case Asterisk:
            case PlusSign:
            case HyphenMinus:
            case RULE_OP:
                {
                alt82=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // InternalGumboParser.g:3839:3: ( () ( (lv_terms_1_0= ruleSlangAccess ) ) ( ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )* | (otherlv_4= QuestionMark ( (lv_thenExpr_5_0= ruleExpr ) ) otherlv_6= Colon ( (lv_elseExpr_7_0= ruleExpr ) ) ) ) )
                    {
                    // InternalGumboParser.g:3839:3: ( () ( (lv_terms_1_0= ruleSlangAccess ) ) ( ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )* | (otherlv_4= QuestionMark ( (lv_thenExpr_5_0= ruleExpr ) ) otherlv_6= Colon ( (lv_elseExpr_7_0= ruleExpr ) ) ) ) )
                    // InternalGumboParser.g:3840:4: () ( (lv_terms_1_0= ruleSlangAccess ) ) ( ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )* | (otherlv_4= QuestionMark ( (lv_thenExpr_5_0= ruleExpr ) ) otherlv_6= Colon ( (lv_elseExpr_7_0= ruleExpr ) ) ) )
                    {
                    // InternalGumboParser.g:3840:4: ()
                    // InternalGumboParser.g:3841:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getExprAccess().getBasicExpAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:3847:4: ( (lv_terms_1_0= ruleSlangAccess ) )
                    // InternalGumboParser.g:3848:5: (lv_terms_1_0= ruleSlangAccess )
                    {
                    // InternalGumboParser.g:3848:5: (lv_terms_1_0= ruleSlangAccess )
                    // InternalGumboParser.g:3849:6: lv_terms_1_0= ruleSlangAccess
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprAccess().getTermsSlangAccessParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_66);
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

                    // InternalGumboParser.g:3866:4: ( ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )* | (otherlv_4= QuestionMark ( (lv_thenExpr_5_0= ruleExpr ) ) otherlv_6= Colon ( (lv_elseExpr_7_0= ruleExpr ) ) ) )
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==EOF||(LA79_0>=Guarantee && LA79_0<=Invariant)||(LA79_0>=Modifies && LA79_0<=Requires)||LA79_0==Ensures||(LA79_0>=Assert && LA79_0<=Return)||LA79_0==Match||LA79_0==Reads||(LA79_0>=While && LA79_0<=Yield)||LA79_0==Case||(LA79_0>=Halt && LA79_0<=Spec)||LA79_0==FullStopFullStopLessThanSign||(LA79_0>=Val && LA79_0<=FullStopFullStop)||LA79_0==ColonEqualsSign||(LA79_0>=EqualsSignGreaterThanSign && LA79_0<=If)||(LA79_0>=RightParenthesis && LA79_0<=HyphenMinus)||(LA79_0>=Colon && LA79_0<=Semicolon)||(LA79_0>=LeftCurlyBracket && LA79_0<=RightCurlyBracket)||LA79_0==RULE_SLANG_STRING||LA79_0==RULE_OP||LA79_0==RULE_ID) ) {
                        alt79=1;
                    }
                    else if ( (LA79_0==QuestionMark) ) {
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
                            // InternalGumboParser.g:3867:5: ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )*
                            {
                            // InternalGumboParser.g:3867:5: ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )*
                            loop78:
                            do {
                                int alt78=2;
                                int LA78_0 = input.LA(1);

                                if ( ((LA78_0>=Asterisk && LA78_0<=PlusSign)||LA78_0==HyphenMinus||LA78_0==RULE_OP) ) {
                                    alt78=1;
                                }


                                switch (alt78) {
                            	case 1 :
                            	    // InternalGumboParser.g:3868:6: ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) )
                            	    {
                            	    // InternalGumboParser.g:3868:6: ( (lv_ops_2_0= ruleOperator ) )
                            	    // InternalGumboParser.g:3869:7: (lv_ops_2_0= ruleOperator )
                            	    {
                            	    // InternalGumboParser.g:3869:7: (lv_ops_2_0= ruleOperator )
                            	    // InternalGumboParser.g:3870:8: lv_ops_2_0= ruleOperator
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getExprAccess().getOpsOperatorParserRuleCall_0_2_0_0_0());
                            	      							
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_67);
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

                            	    // InternalGumboParser.g:3887:6: ( (lv_terms_3_0= ruleSlangAccess ) )
                            	    // InternalGumboParser.g:3888:7: (lv_terms_3_0= ruleSlangAccess )
                            	    {
                            	    // InternalGumboParser.g:3888:7: (lv_terms_3_0= ruleSlangAccess )
                            	    // InternalGumboParser.g:3889:8: lv_terms_3_0= ruleSlangAccess
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getExprAccess().getTermsSlangAccessParserRuleCall_0_2_0_1_0());
                            	      							
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_68);
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
                            	    break loop78;
                                }
                            } while (true);


                            }
                            break;
                        case 2 :
                            // InternalGumboParser.g:3908:5: (otherlv_4= QuestionMark ( (lv_thenExpr_5_0= ruleExpr ) ) otherlv_6= Colon ( (lv_elseExpr_7_0= ruleExpr ) ) )
                            {
                            // InternalGumboParser.g:3908:5: (otherlv_4= QuestionMark ( (lv_thenExpr_5_0= ruleExpr ) ) otherlv_6= Colon ( (lv_elseExpr_7_0= ruleExpr ) ) )
                            // InternalGumboParser.g:3909:6: otherlv_4= QuestionMark ( (lv_thenExpr_5_0= ruleExpr ) ) otherlv_6= Colon ( (lv_elseExpr_7_0= ruleExpr ) )
                            {
                            otherlv_4=(Token)match(input,QuestionMark,FollowSets000.FOLLOW_17); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_4, grammarAccess.getExprAccess().getQuestionMarkKeyword_0_2_1_0());
                              					
                            }
                            // InternalGumboParser.g:3913:6: ( (lv_thenExpr_5_0= ruleExpr ) )
                            // InternalGumboParser.g:3914:7: (lv_thenExpr_5_0= ruleExpr )
                            {
                            // InternalGumboParser.g:3914:7: (lv_thenExpr_5_0= ruleExpr )
                            // InternalGumboParser.g:3915:8: lv_thenExpr_5_0= ruleExpr
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
                            // InternalGumboParser.g:3936:6: ( (lv_elseExpr_7_0= ruleExpr ) )
                            // InternalGumboParser.g:3937:7: (lv_elseExpr_7_0= ruleExpr )
                            {
                            // InternalGumboParser.g:3937:7: (lv_elseExpr_7_0= ruleExpr )
                            // InternalGumboParser.g:3938:8: lv_elseExpr_7_0= ruleExpr
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
                    // InternalGumboParser.g:3959:3: ( () (otherlv_9= All | otherlv_10= Some | otherlv_11= ForAll | otherlv_12= ThereExists ) ( (lv_qVar_13_0= ruleSlangQuantVar ) ) (otherlv_14= Comma ( (lv_qVar_15_0= ruleSlangQuantVar ) ) )* otherlv_16= EqualsSignGreaterThanSign ( (lv_quantifiedExpr_17_0= ruleExpr ) ) )
                    {
                    // InternalGumboParser.g:3959:3: ( () (otherlv_9= All | otherlv_10= Some | otherlv_11= ForAll | otherlv_12= ThereExists ) ( (lv_qVar_13_0= ruleSlangQuantVar ) ) (otherlv_14= Comma ( (lv_qVar_15_0= ruleSlangQuantVar ) ) )* otherlv_16= EqualsSignGreaterThanSign ( (lv_quantifiedExpr_17_0= ruleExpr ) ) )
                    // InternalGumboParser.g:3960:4: () (otherlv_9= All | otherlv_10= Some | otherlv_11= ForAll | otherlv_12= ThereExists ) ( (lv_qVar_13_0= ruleSlangQuantVar ) ) (otherlv_14= Comma ( (lv_qVar_15_0= ruleSlangQuantVar ) ) )* otherlv_16= EqualsSignGreaterThanSign ( (lv_quantifiedExpr_17_0= ruleExpr ) )
                    {
                    // InternalGumboParser.g:3960:4: ()
                    // InternalGumboParser.g:3961:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getExprAccess().getQuantifiedExpAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:3967:4: (otherlv_9= All | otherlv_10= Some | otherlv_11= ForAll | otherlv_12= ThereExists )
                    int alt80=4;
                    switch ( input.LA(1) ) {
                    case All:
                        {
                        alt80=1;
                        }
                        break;
                    case Some:
                        {
                        alt80=2;
                        }
                        break;
                    case ForAll:
                        {
                        alt80=3;
                        }
                        break;
                    case ThereExists:
                        {
                        alt80=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 80, 0, input);

                        throw nvae;
                    }

                    switch (alt80) {
                        case 1 :
                            // InternalGumboParser.g:3968:5: otherlv_9= All
                            {
                            otherlv_9=(Token)match(input,All,FollowSets000.FOLLOW_10); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_9, grammarAccess.getExprAccess().getAllKeyword_1_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalGumboParser.g:3973:5: otherlv_10= Some
                            {
                            otherlv_10=(Token)match(input,Some,FollowSets000.FOLLOW_10); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_10, grammarAccess.getExprAccess().getSomeKeyword_1_1_1());
                              				
                            }

                            }
                            break;
                        case 3 :
                            // InternalGumboParser.g:3978:5: otherlv_11= ForAll
                            {
                            otherlv_11=(Token)match(input,ForAll,FollowSets000.FOLLOW_10); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_11, grammarAccess.getExprAccess().getForAllKeyword_1_1_2());
                              				
                            }

                            }
                            break;
                        case 4 :
                            // InternalGumboParser.g:3983:5: otherlv_12= ThereExists
                            {
                            otherlv_12=(Token)match(input,ThereExists,FollowSets000.FOLLOW_10); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_12, grammarAccess.getExprAccess().getThereExistsKeyword_1_1_3());
                              				
                            }

                            }
                            break;

                    }

                    // InternalGumboParser.g:3988:4: ( (lv_qVar_13_0= ruleSlangQuantVar ) )
                    // InternalGumboParser.g:3989:5: (lv_qVar_13_0= ruleSlangQuantVar )
                    {
                    // InternalGumboParser.g:3989:5: (lv_qVar_13_0= ruleSlangQuantVar )
                    // InternalGumboParser.g:3990:6: lv_qVar_13_0= ruleSlangQuantVar
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprAccess().getQVarSlangQuantVarParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_69);
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

                    // InternalGumboParser.g:4007:4: (otherlv_14= Comma ( (lv_qVar_15_0= ruleSlangQuantVar ) ) )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==Comma) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // InternalGumboParser.g:4008:5: otherlv_14= Comma ( (lv_qVar_15_0= ruleSlangQuantVar ) )
                    	    {
                    	    otherlv_14=(Token)match(input,Comma,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_14, grammarAccess.getExprAccess().getCommaKeyword_1_3_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:4012:5: ( (lv_qVar_15_0= ruleSlangQuantVar ) )
                    	    // InternalGumboParser.g:4013:6: (lv_qVar_15_0= ruleSlangQuantVar )
                    	    {
                    	    // InternalGumboParser.g:4013:6: (lv_qVar_15_0= ruleSlangQuantVar )
                    	    // InternalGumboParser.g:4014:7: lv_qVar_15_0= ruleSlangQuantVar
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getExprAccess().getQVarSlangQuantVarParserRuleCall_1_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_69);
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
                    	    break loop81;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getExprAccess().getEqualsSignGreaterThanSignKeyword_1_4());
                      			
                    }
                    // InternalGumboParser.g:4036:4: ( (lv_quantifiedExpr_17_0= ruleExpr ) )
                    // InternalGumboParser.g:4037:5: (lv_quantifiedExpr_17_0= ruleExpr )
                    {
                    // InternalGumboParser.g:4037:5: (lv_quantifiedExpr_17_0= ruleExpr )
                    // InternalGumboParser.g:4038:6: lv_quantifiedExpr_17_0= ruleExpr
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
                    // InternalGumboParser.g:4057:3: ( () ( (lv_op_19_0= ruleOperator ) ) ( (lv_accessExp_20_0= ruleSlangAccess ) ) )
                    {
                    // InternalGumboParser.g:4057:3: ( () ( (lv_op_19_0= ruleOperator ) ) ( (lv_accessExp_20_0= ruleSlangAccess ) ) )
                    // InternalGumboParser.g:4058:4: () ( (lv_op_19_0= ruleOperator ) ) ( (lv_accessExp_20_0= ruleSlangAccess ) )
                    {
                    // InternalGumboParser.g:4058:4: ()
                    // InternalGumboParser.g:4059:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getExprAccess().getUnaryExpAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:4065:4: ( (lv_op_19_0= ruleOperator ) )
                    // InternalGumboParser.g:4066:5: (lv_op_19_0= ruleOperator )
                    {
                    // InternalGumboParser.g:4066:5: (lv_op_19_0= ruleOperator )
                    // InternalGumboParser.g:4067:6: lv_op_19_0= ruleOperator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprAccess().getOpOperatorParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_67);
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

                    // InternalGumboParser.g:4084:4: ( (lv_accessExp_20_0= ruleSlangAccess ) )
                    // InternalGumboParser.g:4085:5: (lv_accessExp_20_0= ruleSlangAccess )
                    {
                    // InternalGumboParser.g:4085:5: (lv_accessExp_20_0= ruleSlangAccess )
                    // InternalGumboParser.g:4086:6: lv_accessExp_20_0= ruleSlangAccess
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
    // InternalGumboParser.g:4108:1: entryRuleSlangQuantVar returns [EObject current=null] : iv_ruleSlangQuantVar= ruleSlangQuantVar EOF ;
    public final EObject entryRuleSlangQuantVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangQuantVar = null;


        try {
            // InternalGumboParser.g:4108:54: (iv_ruleSlangQuantVar= ruleSlangQuantVar EOF )
            // InternalGumboParser.g:4109:2: iv_ruleSlangQuantVar= ruleSlangQuantVar EOF
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
    // InternalGumboParser.g:4115:1: ruleSlangQuantVar returns [EObject current=null] : (this_ID_0= RULE_ID otherlv_1= Colon ( (lv_e_2_0= ruleExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upperBound_5_0= ruleExpr ) ) )? ) ;
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
            // InternalGumboParser.g:4121:2: ( (this_ID_0= RULE_ID otherlv_1= Colon ( (lv_e_2_0= ruleExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upperBound_5_0= ruleExpr ) ) )? ) )
            // InternalGumboParser.g:4122:2: (this_ID_0= RULE_ID otherlv_1= Colon ( (lv_e_2_0= ruleExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upperBound_5_0= ruleExpr ) ) )? )
            {
            // InternalGumboParser.g:4122:2: (this_ID_0= RULE_ID otherlv_1= Colon ( (lv_e_2_0= ruleExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upperBound_5_0= ruleExpr ) ) )? )
            // InternalGumboParser.g:4123:3: this_ID_0= RULE_ID otherlv_1= Colon ( (lv_e_2_0= ruleExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upperBound_5_0= ruleExpr ) ) )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getSlangQuantVarAccess().getIDTerminalRuleCall_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSlangQuantVarAccess().getColonKeyword_1());
              		
            }
            // InternalGumboParser.g:4131:3: ( (lv_e_2_0= ruleExpr ) )
            // InternalGumboParser.g:4132:4: (lv_e_2_0= ruleExpr )
            {
            // InternalGumboParser.g:4132:4: (lv_e_2_0= ruleExpr )
            // InternalGumboParser.g:4133:5: lv_e_2_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangQuantVarAccess().getEExprParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_70);
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

            // InternalGumboParser.g:4150:3: ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upperBound_5_0= ruleExpr ) ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==FullStopFullStopLessThanSign||LA84_0==FullStopFullStop) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalGumboParser.g:4151:4: (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upperBound_5_0= ruleExpr ) )
                    {
                    // InternalGumboParser.g:4151:4: (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign )
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==FullStopFullStop) ) {
                        alt83=1;
                    }
                    else if ( (LA83_0==FullStopFullStopLessThanSign) ) {
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
                            // InternalGumboParser.g:4152:5: otherlv_3= FullStopFullStop
                            {
                            otherlv_3=(Token)match(input,FullStopFullStop,FollowSets000.FOLLOW_17); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_3, grammarAccess.getSlangQuantVarAccess().getFullStopFullStopKeyword_3_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalGumboParser.g:4157:5: otherlv_4= FullStopFullStopLessThanSign
                            {
                            otherlv_4=(Token)match(input,FullStopFullStopLessThanSign,FollowSets000.FOLLOW_17); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getSlangQuantVarAccess().getFullStopFullStopLessThanSignKeyword_3_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalGumboParser.g:4162:4: ( (lv_upperBound_5_0= ruleExpr ) )
                    // InternalGumboParser.g:4163:5: (lv_upperBound_5_0= ruleExpr )
                    {
                    // InternalGumboParser.g:4163:5: (lv_upperBound_5_0= ruleExpr )
                    // InternalGumboParser.g:4164:6: lv_upperBound_5_0= ruleExpr
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
    // InternalGumboParser.g:4186:1: entryRuleSlangBlock returns [EObject current=null] : iv_ruleSlangBlock= ruleSlangBlock EOF ;
    public final EObject entryRuleSlangBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangBlock = null;


        try {
            // InternalGumboParser.g:4186:51: (iv_ruleSlangBlock= ruleSlangBlock EOF )
            // InternalGumboParser.g:4187:2: iv_ruleSlangBlock= ruleSlangBlock EOF
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
    // InternalGumboParser.g:4193:1: ruleSlangBlock returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( (lv_stmts_2_0= ruleSlangStmt ) )* ( (lv_r_3_0= ruleSlangRet ) )? otherlv_4= RightCurlyBracket ) ;
    public final EObject ruleSlangBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_stmts_2_0 = null;

        EObject lv_r_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:4199:2: ( ( () otherlv_1= LeftCurlyBracket ( (lv_stmts_2_0= ruleSlangStmt ) )* ( (lv_r_3_0= ruleSlangRet ) )? otherlv_4= RightCurlyBracket ) )
            // InternalGumboParser.g:4200:2: ( () otherlv_1= LeftCurlyBracket ( (lv_stmts_2_0= ruleSlangStmt ) )* ( (lv_r_3_0= ruleSlangRet ) )? otherlv_4= RightCurlyBracket )
            {
            // InternalGumboParser.g:4200:2: ( () otherlv_1= LeftCurlyBracket ( (lv_stmts_2_0= ruleSlangStmt ) )* ( (lv_r_3_0= ruleSlangRet ) )? otherlv_4= RightCurlyBracket )
            // InternalGumboParser.g:4201:3: () otherlv_1= LeftCurlyBracket ( (lv_stmts_2_0= ruleSlangStmt ) )* ( (lv_r_3_0= ruleSlangRet ) )? otherlv_4= RightCurlyBracket
            {
            // InternalGumboParser.g:4201:3: ()
            // InternalGumboParser.g:4202:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSlangBlockAccess().getSlangBlockAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FollowSets000.FOLLOW_71); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSlangBlockAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalGumboParser.g:4212:3: ( (lv_stmts_2_0= ruleSlangStmt ) )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( ((LA85_0>=Assert && LA85_0<=Assume)||LA85_0==Match||LA85_0==While||(LA85_0>=Halt && LA85_0<=Spec)||(LA85_0>=Val && LA85_0<=Var)||(LA85_0>=Do && LA85_0<=If)||LA85_0==RULE_ID) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // InternalGumboParser.g:4213:4: (lv_stmts_2_0= ruleSlangStmt )
            	    {
            	    // InternalGumboParser.g:4213:4: (lv_stmts_2_0= ruleSlangStmt )
            	    // InternalGumboParser.g:4214:5: lv_stmts_2_0= ruleSlangStmt
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSlangBlockAccess().getStmtsSlangStmtParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_71);
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
            	    break loop85;
                }
            } while (true);

            // InternalGumboParser.g:4231:3: ( (lv_r_3_0= ruleSlangRet ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==Return) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalGumboParser.g:4232:4: (lv_r_3_0= ruleSlangRet )
                    {
                    // InternalGumboParser.g:4232:4: (lv_r_3_0= ruleSlangRet )
                    // InternalGumboParser.g:4233:5: lv_r_3_0= ruleSlangRet
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangBlockAccess().getRSlangRetParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_72);
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
    // InternalGumboParser.g:4258:1: entryRuleSlangAccess returns [EObject current=null] : iv_ruleSlangAccess= ruleSlangAccess EOF ;
    public final EObject entryRuleSlangAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangAccess = null;


        try {
            // InternalGumboParser.g:4258:52: (iv_ruleSlangAccess= ruleSlangAccess EOF )
            // InternalGumboParser.g:4259:2: iv_ruleSlangAccess= ruleSlangAccess EOF
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
    // InternalGumboParser.g:4265:1: ruleSlangAccess returns [EObject current=null] : ( () ( (lv_t_1_0= ruleSlangTerm ) ) ) ;
    public final EObject ruleSlangAccess() throws RecognitionException {
        EObject current = null;

        EObject lv_t_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:4271:2: ( ( () ( (lv_t_1_0= ruleSlangTerm ) ) ) )
            // InternalGumboParser.g:4272:2: ( () ( (lv_t_1_0= ruleSlangTerm ) ) )
            {
            // InternalGumboParser.g:4272:2: ( () ( (lv_t_1_0= ruleSlangTerm ) ) )
            // InternalGumboParser.g:4273:3: () ( (lv_t_1_0= ruleSlangTerm ) )
            {
            // InternalGumboParser.g:4273:3: ()
            // InternalGumboParser.g:4274:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSlangAccessAccess().getSlangAccessAction_0(),
              					current);
              			
            }

            }

            // InternalGumboParser.g:4280:3: ( (lv_t_1_0= ruleSlangTerm ) )
            // InternalGumboParser.g:4281:4: (lv_t_1_0= ruleSlangTerm )
            {
            // InternalGumboParser.g:4281:4: (lv_t_1_0= ruleSlangTerm )
            // InternalGumboParser.g:4282:5: lv_t_1_0= ruleSlangTerm
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
    // InternalGumboParser.g:4303:1: entryRuleSlangTerm returns [EObject current=null] : iv_ruleSlangTerm= ruleSlangTerm EOF ;
    public final EObject entryRuleSlangTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangTerm = null;


        try {
            // InternalGumboParser.g:4303:50: (iv_ruleSlangTerm= ruleSlangTerm EOF )
            // InternalGumboParser.g:4304:2: iv_ruleSlangTerm= ruleSlangTerm EOF
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
    // InternalGumboParser.g:4310:1: ruleSlangTerm returns [EObject current=null] : ( ( () ( (lv_lit_1_0= ruleSlangLit ) ) ) | ( () ( (lv_i_3_0= ruleSlangInterp ) ) ) | ( ( ( ( () In_1 LeftParenthesis ) )=> ( () otherlv_5= In_1 otherlv_6= LeftParenthesis ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= RightParenthesis ) | ( ( ( ( () Enum LeftParenthesis ) )=> ( () otherlv_10= Enum otherlv_11= LeftParenthesis ) ) ( (lv_enumType_12_0= ruleDataElement ) ) otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) otherlv_15= RightParenthesis ) | ( ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_17_0= ruleDataElement ) ) otherlv_18= LeftCurlyBracket ( (otherlv_19= RULE_ID ) ) otherlv_20= EqualsSign ) ) ( (lv_argExpr_21_0= ruleExpr ) ) (otherlv_22= Semicolon ( (otherlv_23= RULE_ID ) ) otherlv_24= EqualsSign ( (lv_argExpr_25_0= ruleExpr ) ) )* otherlv_26= RightCurlyBracket ) | ( () ( (otherlv_28= RULE_ID ) ) (otherlv_29= FullStop ( (lv_ref_30_0= ruleOtherDataRef ) ) )? ( (lv_cs_31_0= ruleSlangCallSuffix ) )? ) | ( () otherlv_33= LeftParenthesis ( (lv_e_34_0= ruleExpr ) ) (otherlv_35= Comma ( (lv_e_36_0= ruleExpr ) ) )* otherlv_37= RightParenthesis ) | ( () otherlv_39= For ( (lv_r_40_0= ruleSlangForRange ) ) (otherlv_41= Comma ( (lv_r_42_0= ruleSlangForRange ) ) )* otherlv_43= Yield ( ( (lv_b_44_0= ruleSlangBlock ) ) | (otherlv_45= LeftParenthesis ( (lv_e_46_0= ruleExpr ) ) otherlv_47= RightParenthesis ) ) ) | ( () otherlv_49= LeftCurlyBracket ( ( ( ( (lv_p_50_0= ruleSlangParams ) ) otherlv_51= EqualsSignGreaterThanSign )? ( (lv_e_52_0= ruleExpr ) ) otherlv_53= RightCurlyBracket ) | ( ( (lv_stmt_54_0= ruleSlangStmt ) )* ( (lv_r_55_0= ruleSlangRet ) )? otherlv_56= RightCurlyBracket ) ) ) ) ;
    public final EObject ruleSlangTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_47=null;
        Token otherlv_49=null;
        Token otherlv_51=null;
        Token otherlv_53=null;
        Token otherlv_56=null;
        EObject lv_lit_1_0 = null;

        EObject lv_i_3_0 = null;

        EObject lv_enumType_12_0 = null;

        EObject lv_recordType_17_0 = null;

        EObject lv_argExpr_21_0 = null;

        EObject lv_argExpr_25_0 = null;

        EObject lv_ref_30_0 = null;

        EObject lv_cs_31_0 = null;

        EObject lv_e_34_0 = null;

        EObject lv_e_36_0 = null;

        EObject lv_r_40_0 = null;

        EObject lv_r_42_0 = null;

        EObject lv_b_44_0 = null;

        EObject lv_e_46_0 = null;

        EObject lv_p_50_0 = null;

        EObject lv_e_52_0 = null;

        EObject lv_stmt_54_0 = null;

        EObject lv_r_55_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:4316:2: ( ( ( () ( (lv_lit_1_0= ruleSlangLit ) ) ) | ( () ( (lv_i_3_0= ruleSlangInterp ) ) ) | ( ( ( ( () In_1 LeftParenthesis ) )=> ( () otherlv_5= In_1 otherlv_6= LeftParenthesis ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= RightParenthesis ) | ( ( ( ( () Enum LeftParenthesis ) )=> ( () otherlv_10= Enum otherlv_11= LeftParenthesis ) ) ( (lv_enumType_12_0= ruleDataElement ) ) otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) otherlv_15= RightParenthesis ) | ( ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_17_0= ruleDataElement ) ) otherlv_18= LeftCurlyBracket ( (otherlv_19= RULE_ID ) ) otherlv_20= EqualsSign ) ) ( (lv_argExpr_21_0= ruleExpr ) ) (otherlv_22= Semicolon ( (otherlv_23= RULE_ID ) ) otherlv_24= EqualsSign ( (lv_argExpr_25_0= ruleExpr ) ) )* otherlv_26= RightCurlyBracket ) | ( () ( (otherlv_28= RULE_ID ) ) (otherlv_29= FullStop ( (lv_ref_30_0= ruleOtherDataRef ) ) )? ( (lv_cs_31_0= ruleSlangCallSuffix ) )? ) | ( () otherlv_33= LeftParenthesis ( (lv_e_34_0= ruleExpr ) ) (otherlv_35= Comma ( (lv_e_36_0= ruleExpr ) ) )* otherlv_37= RightParenthesis ) | ( () otherlv_39= For ( (lv_r_40_0= ruleSlangForRange ) ) (otherlv_41= Comma ( (lv_r_42_0= ruleSlangForRange ) ) )* otherlv_43= Yield ( ( (lv_b_44_0= ruleSlangBlock ) ) | (otherlv_45= LeftParenthesis ( (lv_e_46_0= ruleExpr ) ) otherlv_47= RightParenthesis ) ) ) | ( () otherlv_49= LeftCurlyBracket ( ( ( ( (lv_p_50_0= ruleSlangParams ) ) otherlv_51= EqualsSignGreaterThanSign )? ( (lv_e_52_0= ruleExpr ) ) otherlv_53= RightCurlyBracket ) | ( ( (lv_stmt_54_0= ruleSlangStmt ) )* ( (lv_r_55_0= ruleSlangRet ) )? otherlv_56= RightCurlyBracket ) ) ) ) )
            // InternalGumboParser.g:4317:2: ( ( () ( (lv_lit_1_0= ruleSlangLit ) ) ) | ( () ( (lv_i_3_0= ruleSlangInterp ) ) ) | ( ( ( ( () In_1 LeftParenthesis ) )=> ( () otherlv_5= In_1 otherlv_6= LeftParenthesis ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= RightParenthesis ) | ( ( ( ( () Enum LeftParenthesis ) )=> ( () otherlv_10= Enum otherlv_11= LeftParenthesis ) ) ( (lv_enumType_12_0= ruleDataElement ) ) otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) otherlv_15= RightParenthesis ) | ( ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_17_0= ruleDataElement ) ) otherlv_18= LeftCurlyBracket ( (otherlv_19= RULE_ID ) ) otherlv_20= EqualsSign ) ) ( (lv_argExpr_21_0= ruleExpr ) ) (otherlv_22= Semicolon ( (otherlv_23= RULE_ID ) ) otherlv_24= EqualsSign ( (lv_argExpr_25_0= ruleExpr ) ) )* otherlv_26= RightCurlyBracket ) | ( () ( (otherlv_28= RULE_ID ) ) (otherlv_29= FullStop ( (lv_ref_30_0= ruleOtherDataRef ) ) )? ( (lv_cs_31_0= ruleSlangCallSuffix ) )? ) | ( () otherlv_33= LeftParenthesis ( (lv_e_34_0= ruleExpr ) ) (otherlv_35= Comma ( (lv_e_36_0= ruleExpr ) ) )* otherlv_37= RightParenthesis ) | ( () otherlv_39= For ( (lv_r_40_0= ruleSlangForRange ) ) (otherlv_41= Comma ( (lv_r_42_0= ruleSlangForRange ) ) )* otherlv_43= Yield ( ( (lv_b_44_0= ruleSlangBlock ) ) | (otherlv_45= LeftParenthesis ( (lv_e_46_0= ruleExpr ) ) otherlv_47= RightParenthesis ) ) ) | ( () otherlv_49= LeftCurlyBracket ( ( ( ( (lv_p_50_0= ruleSlangParams ) ) otherlv_51= EqualsSignGreaterThanSign )? ( (lv_e_52_0= ruleExpr ) ) otherlv_53= RightCurlyBracket ) | ( ( (lv_stmt_54_0= ruleSlangStmt ) )* ( (lv_r_55_0= ruleSlangRet ) )? otherlv_56= RightCurlyBracket ) ) ) )
            {
            // InternalGumboParser.g:4317:2: ( ( () ( (lv_lit_1_0= ruleSlangLit ) ) ) | ( () ( (lv_i_3_0= ruleSlangInterp ) ) ) | ( ( ( ( () In_1 LeftParenthesis ) )=> ( () otherlv_5= In_1 otherlv_6= LeftParenthesis ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= RightParenthesis ) | ( ( ( ( () Enum LeftParenthesis ) )=> ( () otherlv_10= Enum otherlv_11= LeftParenthesis ) ) ( (lv_enumType_12_0= ruleDataElement ) ) otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) otherlv_15= RightParenthesis ) | ( ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_17_0= ruleDataElement ) ) otherlv_18= LeftCurlyBracket ( (otherlv_19= RULE_ID ) ) otherlv_20= EqualsSign ) ) ( (lv_argExpr_21_0= ruleExpr ) ) (otherlv_22= Semicolon ( (otherlv_23= RULE_ID ) ) otherlv_24= EqualsSign ( (lv_argExpr_25_0= ruleExpr ) ) )* otherlv_26= RightCurlyBracket ) | ( () ( (otherlv_28= RULE_ID ) ) (otherlv_29= FullStop ( (lv_ref_30_0= ruleOtherDataRef ) ) )? ( (lv_cs_31_0= ruleSlangCallSuffix ) )? ) | ( () otherlv_33= LeftParenthesis ( (lv_e_34_0= ruleExpr ) ) (otherlv_35= Comma ( (lv_e_36_0= ruleExpr ) ) )* otherlv_37= RightParenthesis ) | ( () otherlv_39= For ( (lv_r_40_0= ruleSlangForRange ) ) (otherlv_41= Comma ( (lv_r_42_0= ruleSlangForRange ) ) )* otherlv_43= Yield ( ( (lv_b_44_0= ruleSlangBlock ) ) | (otherlv_45= LeftParenthesis ( (lv_e_46_0= ruleExpr ) ) otherlv_47= RightParenthesis ) ) ) | ( () otherlv_49= LeftCurlyBracket ( ( ( ( (lv_p_50_0= ruleSlangParams ) ) otherlv_51= EqualsSignGreaterThanSign )? ( (lv_e_52_0= ruleExpr ) ) otherlv_53= RightCurlyBracket ) | ( ( (lv_stmt_54_0= ruleSlangStmt ) )* ( (lv_r_55_0= ruleSlangRet ) )? otherlv_56= RightCurlyBracket ) ) ) )
            int alt97=9;
            alt97 = dfa97.predict(input);
            switch (alt97) {
                case 1 :
                    // InternalGumboParser.g:4318:3: ( () ( (lv_lit_1_0= ruleSlangLit ) ) )
                    {
                    // InternalGumboParser.g:4318:3: ( () ( (lv_lit_1_0= ruleSlangLit ) ) )
                    // InternalGumboParser.g:4319:4: () ( (lv_lit_1_0= ruleSlangLit ) )
                    {
                    // InternalGumboParser.g:4319:4: ()
                    // InternalGumboParser.g:4320:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangTermAccess().getSlangLitTermAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:4326:4: ( (lv_lit_1_0= ruleSlangLit ) )
                    // InternalGumboParser.g:4327:5: (lv_lit_1_0= ruleSlangLit )
                    {
                    // InternalGumboParser.g:4327:5: (lv_lit_1_0= ruleSlangLit )
                    // InternalGumboParser.g:4328:6: lv_lit_1_0= ruleSlangLit
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
                    // InternalGumboParser.g:4347:3: ( () ( (lv_i_3_0= ruleSlangInterp ) ) )
                    {
                    // InternalGumboParser.g:4347:3: ( () ( (lv_i_3_0= ruleSlangInterp ) ) )
                    // InternalGumboParser.g:4348:4: () ( (lv_i_3_0= ruleSlangInterp ) )
                    {
                    // InternalGumboParser.g:4348:4: ()
                    // InternalGumboParser.g:4349:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangTermAccess().getSlangInterpTermAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:4355:4: ( (lv_i_3_0= ruleSlangInterp ) )
                    // InternalGumboParser.g:4356:5: (lv_i_3_0= ruleSlangInterp )
                    {
                    // InternalGumboParser.g:4356:5: (lv_i_3_0= ruleSlangInterp )
                    // InternalGumboParser.g:4357:6: lv_i_3_0= ruleSlangInterp
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
                    // InternalGumboParser.g:4376:3: ( ( ( ( () In_1 LeftParenthesis ) )=> ( () otherlv_5= In_1 otherlv_6= LeftParenthesis ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= RightParenthesis )
                    {
                    // InternalGumboParser.g:4376:3: ( ( ( ( () In_1 LeftParenthesis ) )=> ( () otherlv_5= In_1 otherlv_6= LeftParenthesis ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= RightParenthesis )
                    // InternalGumboParser.g:4377:4: ( ( ( () In_1 LeftParenthesis ) )=> ( () otherlv_5= In_1 otherlv_6= LeftParenthesis ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= RightParenthesis
                    {
                    // InternalGumboParser.g:4377:4: ( ( ( () In_1 LeftParenthesis ) )=> ( () otherlv_5= In_1 otherlv_6= LeftParenthesis ) )
                    // InternalGumboParser.g:4378:5: ( ( () In_1 LeftParenthesis ) )=> ( () otherlv_5= In_1 otherlv_6= LeftParenthesis )
                    {
                    // InternalGumboParser.g:4385:5: ( () otherlv_5= In_1 otherlv_6= LeftParenthesis )
                    // InternalGumboParser.g:4386:6: () otherlv_5= In_1 otherlv_6= LeftParenthesis
                    {
                    // InternalGumboParser.g:4386:6: ()
                    // InternalGumboParser.g:4387:7: 
                    {
                    if ( state.backtracking==0 ) {

                      							current = forceCreateModelElement(
                      								grammarAccess.getSlangTermAccess().getStateRefExprAction_2_0_0_0(),
                      								current);
                      						
                    }

                    }

                    otherlv_5=(Token)match(input,In_1,FollowSets000.FOLLOW_73); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_5, grammarAccess.getSlangTermAccess().getInKeyword_2_0_0_1());
                      					
                    }
                    otherlv_6=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_6, grammarAccess.getSlangTermAccess().getLeftParenthesisKeyword_2_0_0_2());
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:4403:4: ( (otherlv_7= RULE_ID ) )
                    // InternalGumboParser.g:4404:5: (otherlv_7= RULE_ID )
                    {
                    // InternalGumboParser.g:4404:5: (otherlv_7= RULE_ID )
                    // InternalGumboParser.g:4405:6: otherlv_7= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSlangTermRule());
                      						}
                      					
                    }
                    otherlv_7=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_35); if (state.failed) return current;
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
                    // InternalGumboParser.g:4422:3: ( ( ( ( () Enum LeftParenthesis ) )=> ( () otherlv_10= Enum otherlv_11= LeftParenthesis ) ) ( (lv_enumType_12_0= ruleDataElement ) ) otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) otherlv_15= RightParenthesis )
                    {
                    // InternalGumboParser.g:4422:3: ( ( ( ( () Enum LeftParenthesis ) )=> ( () otherlv_10= Enum otherlv_11= LeftParenthesis ) ) ( (lv_enumType_12_0= ruleDataElement ) ) otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) otherlv_15= RightParenthesis )
                    // InternalGumboParser.g:4423:4: ( ( ( () Enum LeftParenthesis ) )=> ( () otherlv_10= Enum otherlv_11= LeftParenthesis ) ) ( (lv_enumType_12_0= ruleDataElement ) ) otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) otherlv_15= RightParenthesis
                    {
                    // InternalGumboParser.g:4423:4: ( ( ( () Enum LeftParenthesis ) )=> ( () otherlv_10= Enum otherlv_11= LeftParenthesis ) )
                    // InternalGumboParser.g:4424:5: ( ( () Enum LeftParenthesis ) )=> ( () otherlv_10= Enum otherlv_11= LeftParenthesis )
                    {
                    // InternalGumboParser.g:4431:5: ( () otherlv_10= Enum otherlv_11= LeftParenthesis )
                    // InternalGumboParser.g:4432:6: () otherlv_10= Enum otherlv_11= LeftParenthesis
                    {
                    // InternalGumboParser.g:4432:6: ()
                    // InternalGumboParser.g:4433:7: 
                    {
                    if ( state.backtracking==0 ) {

                      							current = forceCreateModelElement(
                      								grammarAccess.getSlangTermAccess().getEnumLitExprAction_3_0_0_0(),
                      								current);
                      						
                    }

                    }

                    otherlv_10=(Token)match(input,Enum,FollowSets000.FOLLOW_73); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_10, grammarAccess.getSlangTermAccess().getEnumKeyword_3_0_0_1());
                      					
                    }
                    otherlv_11=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_11, grammarAccess.getSlangTermAccess().getLeftParenthesisKeyword_3_0_0_2());
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:4449:4: ( (lv_enumType_12_0= ruleDataElement ) )
                    // InternalGumboParser.g:4450:5: (lv_enumType_12_0= ruleDataElement )
                    {
                    // InternalGumboParser.g:4450:5: (lv_enumType_12_0= ruleDataElement )
                    // InternalGumboParser.g:4451:6: lv_enumType_12_0= ruleDataElement
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangTermAccess().getEnumTypeDataElementParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_74);
                    lv_enumType_12_0=ruleDataElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlangTermRule());
                      						}
                      						set(
                      							current,
                      							"enumType",
                      							lv_enumType_12_0,
                      							"org.sireum.aadl.gumbo.Gumbo.DataElement");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,Comma,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getSlangTermAccess().getCommaKeyword_3_2());
                      			
                    }
                    // InternalGumboParser.g:4472:4: ( (otherlv_14= RULE_ID ) )
                    // InternalGumboParser.g:4473:5: (otherlv_14= RULE_ID )
                    {
                    // InternalGumboParser.g:4473:5: (otherlv_14= RULE_ID )
                    // InternalGumboParser.g:4474:6: otherlv_14= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSlangTermRule());
                      						}
                      					
                    }
                    otherlv_14=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_14, grammarAccess.getSlangTermAccess().getValueStringLiteralCrossReference_3_3_0());
                      					
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
                    // InternalGumboParser.g:4491:3: ( ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_17_0= ruleDataElement ) ) otherlv_18= LeftCurlyBracket ( (otherlv_19= RULE_ID ) ) otherlv_20= EqualsSign ) ) ( (lv_argExpr_21_0= ruleExpr ) ) (otherlv_22= Semicolon ( (otherlv_23= RULE_ID ) ) otherlv_24= EqualsSign ( (lv_argExpr_25_0= ruleExpr ) ) )* otherlv_26= RightCurlyBracket )
                    {
                    // InternalGumboParser.g:4491:3: ( ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_17_0= ruleDataElement ) ) otherlv_18= LeftCurlyBracket ( (otherlv_19= RULE_ID ) ) otherlv_20= EqualsSign ) ) ( (lv_argExpr_21_0= ruleExpr ) ) (otherlv_22= Semicolon ( (otherlv_23= RULE_ID ) ) otherlv_24= EqualsSign ( (lv_argExpr_25_0= ruleExpr ) ) )* otherlv_26= RightCurlyBracket )
                    // InternalGumboParser.g:4492:4: ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_17_0= ruleDataElement ) ) otherlv_18= LeftCurlyBracket ( (otherlv_19= RULE_ID ) ) otherlv_20= EqualsSign ) ) ( (lv_argExpr_21_0= ruleExpr ) ) (otherlv_22= Semicolon ( (otherlv_23= RULE_ID ) ) otherlv_24= EqualsSign ( (lv_argExpr_25_0= ruleExpr ) ) )* otherlv_26= RightCurlyBracket
                    {
                    // InternalGumboParser.g:4492:4: ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_17_0= ruleDataElement ) ) otherlv_18= LeftCurlyBracket ( (otherlv_19= RULE_ID ) ) otherlv_20= EqualsSign ) )
                    // InternalGumboParser.g:4493:5: ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_17_0= ruleDataElement ) ) otherlv_18= LeftCurlyBracket ( (otherlv_19= RULE_ID ) ) otherlv_20= EqualsSign )
                    {
                    // InternalGumboParser.g:4510:5: ( () ( (lv_recordType_17_0= ruleDataElement ) ) otherlv_18= LeftCurlyBracket ( (otherlv_19= RULE_ID ) ) otherlv_20= EqualsSign )
                    // InternalGumboParser.g:4511:6: () ( (lv_recordType_17_0= ruleDataElement ) ) otherlv_18= LeftCurlyBracket ( (otherlv_19= RULE_ID ) ) otherlv_20= EqualsSign
                    {
                    // InternalGumboParser.g:4511:6: ()
                    // InternalGumboParser.g:4512:7: 
                    {
                    if ( state.backtracking==0 ) {

                      							current = forceCreateModelElement(
                      								grammarAccess.getSlangTermAccess().getRecordLitExprAction_4_0_0_0(),
                      								current);
                      						
                    }

                    }

                    // InternalGumboParser.g:4518:6: ( (lv_recordType_17_0= ruleDataElement ) )
                    // InternalGumboParser.g:4519:7: (lv_recordType_17_0= ruleDataElement )
                    {
                    // InternalGumboParser.g:4519:7: (lv_recordType_17_0= ruleDataElement )
                    // InternalGumboParser.g:4520:8: lv_recordType_17_0= ruleDataElement
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getSlangTermAccess().getRecordTypeDataElementParserRuleCall_4_0_0_1_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_50);
                    lv_recordType_17_0=ruleDataElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getSlangTermRule());
                      								}
                      								set(
                      									current,
                      									"recordType",
                      									lv_recordType_17_0,
                      									"org.sireum.aadl.gumbo.Gumbo.DataElement");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }

                    otherlv_18=(Token)match(input,LeftCurlyBracket,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_18, grammarAccess.getSlangTermAccess().getLeftCurlyBracketKeyword_4_0_0_2());
                      					
                    }
                    // InternalGumboParser.g:4541:6: ( (otherlv_19= RULE_ID ) )
                    // InternalGumboParser.g:4542:7: (otherlv_19= RULE_ID )
                    {
                    // InternalGumboParser.g:4542:7: (otherlv_19= RULE_ID )
                    // InternalGumboParser.g:4543:8: otherlv_19= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElement(grammarAccess.getSlangTermRule());
                      								}
                      							
                    }
                    otherlv_19=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_75); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								newLeafNode(otherlv_19, grammarAccess.getSlangTermAccess().getArgsNamedElementCrossReference_4_0_0_3_0());
                      							
                    }

                    }


                    }

                    otherlv_20=(Token)match(input,EqualsSign,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_20, grammarAccess.getSlangTermAccess().getEqualsSignKeyword_4_0_0_4());
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:4560:4: ( (lv_argExpr_21_0= ruleExpr ) )
                    // InternalGumboParser.g:4561:5: (lv_argExpr_21_0= ruleExpr )
                    {
                    // InternalGumboParser.g:4561:5: (lv_argExpr_21_0= ruleExpr )
                    // InternalGumboParser.g:4562:6: lv_argExpr_21_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangTermAccess().getArgExprExprParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_76);
                    lv_argExpr_21_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlangTermRule());
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

                    // InternalGumboParser.g:4579:4: (otherlv_22= Semicolon ( (otherlv_23= RULE_ID ) ) otherlv_24= EqualsSign ( (lv_argExpr_25_0= ruleExpr ) ) )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==Semicolon) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // InternalGumboParser.g:4580:5: otherlv_22= Semicolon ( (otherlv_23= RULE_ID ) ) otherlv_24= EqualsSign ( (lv_argExpr_25_0= ruleExpr ) )
                    	    {
                    	    otherlv_22=(Token)match(input,Semicolon,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_22, grammarAccess.getSlangTermAccess().getSemicolonKeyword_4_2_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:4584:5: ( (otherlv_23= RULE_ID ) )
                    	    // InternalGumboParser.g:4585:6: (otherlv_23= RULE_ID )
                    	    {
                    	    // InternalGumboParser.g:4585:6: (otherlv_23= RULE_ID )
                    	    // InternalGumboParser.g:4586:7: otherlv_23= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getSlangTermRule());
                    	      							}
                    	      						
                    	    }
                    	    otherlv_23=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_75); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_23, grammarAccess.getSlangTermAccess().getArgsNamedElementCrossReference_4_2_1_0());
                    	      						
                    	    }

                    	    }


                    	    }

                    	    otherlv_24=(Token)match(input,EqualsSign,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_24, grammarAccess.getSlangTermAccess().getEqualsSignKeyword_4_2_2());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:4601:5: ( (lv_argExpr_25_0= ruleExpr ) )
                    	    // InternalGumboParser.g:4602:6: (lv_argExpr_25_0= ruleExpr )
                    	    {
                    	    // InternalGumboParser.g:4602:6: (lv_argExpr_25_0= ruleExpr )
                    	    // InternalGumboParser.g:4603:7: lv_argExpr_25_0= ruleExpr
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSlangTermAccess().getArgExprExprParserRuleCall_4_2_3_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_76);
                    	    lv_argExpr_25_0=ruleExpr();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSlangTermRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"argExpr",
                    	      								lv_argExpr_25_0,
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

                    otherlv_26=(Token)match(input,RightCurlyBracket,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_26, grammarAccess.getSlangTermAccess().getRightCurlyBracketKeyword_4_3());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalGumboParser.g:4627:3: ( () ( (otherlv_28= RULE_ID ) ) (otherlv_29= FullStop ( (lv_ref_30_0= ruleOtherDataRef ) ) )? ( (lv_cs_31_0= ruleSlangCallSuffix ) )? )
                    {
                    // InternalGumboParser.g:4627:3: ( () ( (otherlv_28= RULE_ID ) ) (otherlv_29= FullStop ( (lv_ref_30_0= ruleOtherDataRef ) ) )? ( (lv_cs_31_0= ruleSlangCallSuffix ) )? )
                    // InternalGumboParser.g:4628:4: () ( (otherlv_28= RULE_ID ) ) (otherlv_29= FullStop ( (lv_ref_30_0= ruleOtherDataRef ) ) )? ( (lv_cs_31_0= ruleSlangCallSuffix ) )?
                    {
                    // InternalGumboParser.g:4628:4: ()
                    // InternalGumboParser.g:4629:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangTermAccess().getDataRefExprAction_5_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:4635:4: ( (otherlv_28= RULE_ID ) )
                    // InternalGumboParser.g:4636:5: (otherlv_28= RULE_ID )
                    {
                    // InternalGumboParser.g:4636:5: (otherlv_28= RULE_ID )
                    // InternalGumboParser.g:4637:6: otherlv_28= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSlangTermRule());
                      						}
                      					
                    }
                    otherlv_28=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_77); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_28, grammarAccess.getSlangTermAccess().getPortOrSubcomponentOrStateVarEObjectCrossReference_5_1_0());
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:4648:4: (otherlv_29= FullStop ( (lv_ref_30_0= ruleOtherDataRef ) ) )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==FullStop) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // InternalGumboParser.g:4649:5: otherlv_29= FullStop ( (lv_ref_30_0= ruleOtherDataRef ) )
                            {
                            otherlv_29=(Token)match(input,FullStop,FollowSets000.FOLLOW_10); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_29, grammarAccess.getSlangTermAccess().getFullStopKeyword_5_2_0());
                              				
                            }
                            // InternalGumboParser.g:4653:5: ( (lv_ref_30_0= ruleOtherDataRef ) )
                            // InternalGumboParser.g:4654:6: (lv_ref_30_0= ruleOtherDataRef )
                            {
                            // InternalGumboParser.g:4654:6: (lv_ref_30_0= ruleOtherDataRef )
                            // InternalGumboParser.g:4655:7: lv_ref_30_0= ruleOtherDataRef
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSlangTermAccess().getRefOtherDataRefParserRuleCall_5_2_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_78);
                            lv_ref_30_0=ruleOtherDataRef();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getSlangTermRule());
                              							}
                              							set(
                              								current,
                              								"ref",
                              								lv_ref_30_0,
                              								"org.sireum.aadl.gumbo.Gumbo.OtherDataRef");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalGumboParser.g:4673:4: ( (lv_cs_31_0= ruleSlangCallSuffix ) )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==LeftParenthesis||LA89_0==LeftSquareBracket) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // InternalGumboParser.g:4674:5: (lv_cs_31_0= ruleSlangCallSuffix )
                            {
                            // InternalGumboParser.g:4674:5: (lv_cs_31_0= ruleSlangCallSuffix )
                            // InternalGumboParser.g:4675:6: lv_cs_31_0= ruleSlangCallSuffix
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getSlangTermAccess().getCsSlangCallSuffixParserRuleCall_5_3_0());
                              					
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_cs_31_0=ruleSlangCallSuffix();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getSlangTermRule());
                              						}
                              						set(
                              							current,
                              							"cs",
                              							lv_cs_31_0,
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
                case 7 :
                    // InternalGumboParser.g:4694:3: ( () otherlv_33= LeftParenthesis ( (lv_e_34_0= ruleExpr ) ) (otherlv_35= Comma ( (lv_e_36_0= ruleExpr ) ) )* otherlv_37= RightParenthesis )
                    {
                    // InternalGumboParser.g:4694:3: ( () otherlv_33= LeftParenthesis ( (lv_e_34_0= ruleExpr ) ) (otherlv_35= Comma ( (lv_e_36_0= ruleExpr ) ) )* otherlv_37= RightParenthesis )
                    // InternalGumboParser.g:4695:4: () otherlv_33= LeftParenthesis ( (lv_e_34_0= ruleExpr ) ) (otherlv_35= Comma ( (lv_e_36_0= ruleExpr ) ) )* otherlv_37= RightParenthesis
                    {
                    // InternalGumboParser.g:4695:4: ()
                    // InternalGumboParser.g:4696:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangTermAccess().getSlangTupleTermAction_6_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_33=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_33, grammarAccess.getSlangTermAccess().getLeftParenthesisKeyword_6_1());
                      			
                    }
                    // InternalGumboParser.g:4706:4: ( (lv_e_34_0= ruleExpr ) )
                    // InternalGumboParser.g:4707:5: (lv_e_34_0= ruleExpr )
                    {
                    // InternalGumboParser.g:4707:5: (lv_e_34_0= ruleExpr )
                    // InternalGumboParser.g:4708:6: lv_e_34_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangTermAccess().getEExprParserRuleCall_6_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_36);
                    lv_e_34_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlangTermRule());
                      						}
                      						add(
                      							current,
                      							"e",
                      							lv_e_34_0,
                      							"org.sireum.aadl.gumbo.Gumbo.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:4725:4: (otherlv_35= Comma ( (lv_e_36_0= ruleExpr ) ) )*
                    loop90:
                    do {
                        int alt90=2;
                        int LA90_0 = input.LA(1);

                        if ( (LA90_0==Comma) ) {
                            alt90=1;
                        }


                        switch (alt90) {
                    	case 1 :
                    	    // InternalGumboParser.g:4726:5: otherlv_35= Comma ( (lv_e_36_0= ruleExpr ) )
                    	    {
                    	    otherlv_35=(Token)match(input,Comma,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_35, grammarAccess.getSlangTermAccess().getCommaKeyword_6_3_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:4730:5: ( (lv_e_36_0= ruleExpr ) )
                    	    // InternalGumboParser.g:4731:6: (lv_e_36_0= ruleExpr )
                    	    {
                    	    // InternalGumboParser.g:4731:6: (lv_e_36_0= ruleExpr )
                    	    // InternalGumboParser.g:4732:7: lv_e_36_0= ruleExpr
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSlangTermAccess().getEExprParserRuleCall_6_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_36);
                    	    lv_e_36_0=ruleExpr();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSlangTermRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"e",
                    	      								lv_e_36_0,
                    	      								"org.sireum.aadl.gumbo.Gumbo.Expr");
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

                    otherlv_37=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_37, grammarAccess.getSlangTermAccess().getRightParenthesisKeyword_6_4());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalGumboParser.g:4756:3: ( () otherlv_39= For ( (lv_r_40_0= ruleSlangForRange ) ) (otherlv_41= Comma ( (lv_r_42_0= ruleSlangForRange ) ) )* otherlv_43= Yield ( ( (lv_b_44_0= ruleSlangBlock ) ) | (otherlv_45= LeftParenthesis ( (lv_e_46_0= ruleExpr ) ) otherlv_47= RightParenthesis ) ) )
                    {
                    // InternalGumboParser.g:4756:3: ( () otherlv_39= For ( (lv_r_40_0= ruleSlangForRange ) ) (otherlv_41= Comma ( (lv_r_42_0= ruleSlangForRange ) ) )* otherlv_43= Yield ( ( (lv_b_44_0= ruleSlangBlock ) ) | (otherlv_45= LeftParenthesis ( (lv_e_46_0= ruleExpr ) ) otherlv_47= RightParenthesis ) ) )
                    // InternalGumboParser.g:4757:4: () otherlv_39= For ( (lv_r_40_0= ruleSlangForRange ) ) (otherlv_41= Comma ( (lv_r_42_0= ruleSlangForRange ) ) )* otherlv_43= Yield ( ( (lv_b_44_0= ruleSlangBlock ) ) | (otherlv_45= LeftParenthesis ( (lv_e_46_0= ruleExpr ) ) otherlv_47= RightParenthesis ) )
                    {
                    // InternalGumboParser.g:4757:4: ()
                    // InternalGumboParser.g:4758:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangTermAccess().getSlangForTermAction_7_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_39=(Token)match(input,For,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_39, grammarAccess.getSlangTermAccess().getForKeyword_7_1());
                      			
                    }
                    // InternalGumboParser.g:4768:4: ( (lv_r_40_0= ruleSlangForRange ) )
                    // InternalGumboParser.g:4769:5: (lv_r_40_0= ruleSlangForRange )
                    {
                    // InternalGumboParser.g:4769:5: (lv_r_40_0= ruleSlangForRange )
                    // InternalGumboParser.g:4770:6: lv_r_40_0= ruleSlangForRange
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangTermAccess().getRSlangForRangeParserRuleCall_7_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_79);
                    lv_r_40_0=ruleSlangForRange();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlangTermRule());
                      						}
                      						add(
                      							current,
                      							"r",
                      							lv_r_40_0,
                      							"org.sireum.aadl.gumbo.Gumbo.SlangForRange");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:4787:4: (otherlv_41= Comma ( (lv_r_42_0= ruleSlangForRange ) ) )*
                    loop91:
                    do {
                        int alt91=2;
                        int LA91_0 = input.LA(1);

                        if ( (LA91_0==Comma) ) {
                            alt91=1;
                        }


                        switch (alt91) {
                    	case 1 :
                    	    // InternalGumboParser.g:4788:5: otherlv_41= Comma ( (lv_r_42_0= ruleSlangForRange ) )
                    	    {
                    	    otherlv_41=(Token)match(input,Comma,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_41, grammarAccess.getSlangTermAccess().getCommaKeyword_7_3_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:4792:5: ( (lv_r_42_0= ruleSlangForRange ) )
                    	    // InternalGumboParser.g:4793:6: (lv_r_42_0= ruleSlangForRange )
                    	    {
                    	    // InternalGumboParser.g:4793:6: (lv_r_42_0= ruleSlangForRange )
                    	    // InternalGumboParser.g:4794:7: lv_r_42_0= ruleSlangForRange
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSlangTermAccess().getRSlangForRangeParserRuleCall_7_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_79);
                    	    lv_r_42_0=ruleSlangForRange();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSlangTermRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"r",
                    	      								lv_r_42_0,
                    	      								"org.sireum.aadl.gumbo.Gumbo.SlangForRange");
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

                    otherlv_43=(Token)match(input,Yield,FollowSets000.FOLLOW_80); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_43, grammarAccess.getSlangTermAccess().getYieldKeyword_7_4());
                      			
                    }
                    // InternalGumboParser.g:4816:4: ( ( (lv_b_44_0= ruleSlangBlock ) ) | (otherlv_45= LeftParenthesis ( (lv_e_46_0= ruleExpr ) ) otherlv_47= RightParenthesis ) )
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==LeftCurlyBracket) ) {
                        alt92=1;
                    }
                    else if ( (LA92_0==LeftParenthesis) ) {
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
                            // InternalGumboParser.g:4817:5: ( (lv_b_44_0= ruleSlangBlock ) )
                            {
                            // InternalGumboParser.g:4817:5: ( (lv_b_44_0= ruleSlangBlock ) )
                            // InternalGumboParser.g:4818:6: (lv_b_44_0= ruleSlangBlock )
                            {
                            // InternalGumboParser.g:4818:6: (lv_b_44_0= ruleSlangBlock )
                            // InternalGumboParser.g:4819:7: lv_b_44_0= ruleSlangBlock
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSlangTermAccess().getBSlangBlockParserRuleCall_7_5_0_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_b_44_0=ruleSlangBlock();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getSlangTermRule());
                              							}
                              							set(
                              								current,
                              								"b",
                              								lv_b_44_0,
                              								"org.sireum.aadl.gumbo.Gumbo.SlangBlock");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalGumboParser.g:4837:5: (otherlv_45= LeftParenthesis ( (lv_e_46_0= ruleExpr ) ) otherlv_47= RightParenthesis )
                            {
                            // InternalGumboParser.g:4837:5: (otherlv_45= LeftParenthesis ( (lv_e_46_0= ruleExpr ) ) otherlv_47= RightParenthesis )
                            // InternalGumboParser.g:4838:6: otherlv_45= LeftParenthesis ( (lv_e_46_0= ruleExpr ) ) otherlv_47= RightParenthesis
                            {
                            otherlv_45=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_17); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_45, grammarAccess.getSlangTermAccess().getLeftParenthesisKeyword_7_5_1_0());
                              					
                            }
                            // InternalGumboParser.g:4842:6: ( (lv_e_46_0= ruleExpr ) )
                            // InternalGumboParser.g:4843:7: (lv_e_46_0= ruleExpr )
                            {
                            // InternalGumboParser.g:4843:7: (lv_e_46_0= ruleExpr )
                            // InternalGumboParser.g:4844:8: lv_e_46_0= ruleExpr
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getSlangTermAccess().getEExprParserRuleCall_7_5_1_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_35);
                            lv_e_46_0=ruleExpr();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getSlangTermRule());
                              								}
                              								set(
                              									current,
                              									"e",
                              									lv_e_46_0,
                              									"org.sireum.aadl.gumbo.Gumbo.Expr");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            otherlv_47=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_47, grammarAccess.getSlangTermAccess().getRightParenthesisKeyword_7_5_1_2());
                              					
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalGumboParser.g:4869:3: ( () otherlv_49= LeftCurlyBracket ( ( ( ( (lv_p_50_0= ruleSlangParams ) ) otherlv_51= EqualsSignGreaterThanSign )? ( (lv_e_52_0= ruleExpr ) ) otherlv_53= RightCurlyBracket ) | ( ( (lv_stmt_54_0= ruleSlangStmt ) )* ( (lv_r_55_0= ruleSlangRet ) )? otherlv_56= RightCurlyBracket ) ) )
                    {
                    // InternalGumboParser.g:4869:3: ( () otherlv_49= LeftCurlyBracket ( ( ( ( (lv_p_50_0= ruleSlangParams ) ) otherlv_51= EqualsSignGreaterThanSign )? ( (lv_e_52_0= ruleExpr ) ) otherlv_53= RightCurlyBracket ) | ( ( (lv_stmt_54_0= ruleSlangStmt ) )* ( (lv_r_55_0= ruleSlangRet ) )? otherlv_56= RightCurlyBracket ) ) )
                    // InternalGumboParser.g:4870:4: () otherlv_49= LeftCurlyBracket ( ( ( ( (lv_p_50_0= ruleSlangParams ) ) otherlv_51= EqualsSignGreaterThanSign )? ( (lv_e_52_0= ruleExpr ) ) otherlv_53= RightCurlyBracket ) | ( ( (lv_stmt_54_0= ruleSlangStmt ) )* ( (lv_r_55_0= ruleSlangRet ) )? otherlv_56= RightCurlyBracket ) )
                    {
                    // InternalGumboParser.g:4870:4: ()
                    // InternalGumboParser.g:4871:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangTermAccess().getSlangBlockTermAction_8_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_49=(Token)match(input,LeftCurlyBracket,FollowSets000.FOLLOW_81); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_49, grammarAccess.getSlangTermAccess().getLeftCurlyBracketKeyword_8_1());
                      			
                    }
                    // InternalGumboParser.g:4881:4: ( ( ( ( (lv_p_50_0= ruleSlangParams ) ) otherlv_51= EqualsSignGreaterThanSign )? ( (lv_e_52_0= ruleExpr ) ) otherlv_53= RightCurlyBracket ) | ( ( (lv_stmt_54_0= ruleSlangStmt ) )* ( (lv_r_55_0= ruleSlangRet ) )? otherlv_56= RightCurlyBracket ) )
                    int alt96=2;
                    switch ( input.LA(1) ) {
                    case Some:
                    case All:
                    case Enum:
                    case For:
                    case In_1:
                    case LeftParenthesis:
                    case Asterisk:
                    case PlusSign:
                    case HyphenMinus:
                    case F:
                    case T:
                    case LeftCurlyBracket:
                    case ForAll:
                    case ThereExists:
                    case RULE_SLANG_STRING:
                    case RULE_MSTRING:
                    case RULE_MSP:
                    case RULE_SLI:
                    case RULE_MSPB:
                    case RULE_OP:
                    case RULE_HEX:
                    case RULE_BIN:
                    case RULE_INTEGER_LIT:
                    case RULE_INT_IDF:
                    case RULE_REAL_LIT:
                    case RULE_REAL_IDF:
                        {
                        alt96=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        switch ( input.LA(2) ) {
                        case LeftParenthesis:
                        case Asterisk:
                        case PlusSign:
                        case HyphenMinus:
                        case FullStop:
                        case LeftSquareBracket:
                        case LeftCurlyBracket:
                        case RULE_OP:
                            {
                            alt96=1;
                            }
                            break;
                        case ColonColon:
                        case QuestionMark:
                        case RightCurlyBracket:
                            {
                            alt96=1;
                            }
                            break;
                        case Assert:
                        case Assume:
                        case Return:
                        case Match:
                        case While:
                        case Halt:
                        case Spec:
                        case Val:
                        case Var:
                        case ColonEqualsSign:
                        case Do:
                        case If:
                        case Colon:
                        case RULE_DEFOP:
                        case RULE_ID:
                            {
                            alt96=2;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 96, 2, input);

                            throw nvae;
                        }

                        }
                        break;
                    case Assert:
                    case Assume:
                    case Return:
                    case Match:
                    case While:
                    case Halt:
                    case Spec:
                    case Val:
                    case Var:
                    case Do:
                    case If:
                    case RightCurlyBracket:
                        {
                        alt96=2;
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
                            // InternalGumboParser.g:4882:5: ( ( ( (lv_p_50_0= ruleSlangParams ) ) otherlv_51= EqualsSignGreaterThanSign )? ( (lv_e_52_0= ruleExpr ) ) otherlv_53= RightCurlyBracket )
                            {
                            // InternalGumboParser.g:4882:5: ( ( ( (lv_p_50_0= ruleSlangParams ) ) otherlv_51= EqualsSignGreaterThanSign )? ( (lv_e_52_0= ruleExpr ) ) otherlv_53= RightCurlyBracket )
                            // InternalGumboParser.g:4883:6: ( ( (lv_p_50_0= ruleSlangParams ) ) otherlv_51= EqualsSignGreaterThanSign )? ( (lv_e_52_0= ruleExpr ) ) otherlv_53= RightCurlyBracket
                            {
                            // InternalGumboParser.g:4883:6: ( ( (lv_p_50_0= ruleSlangParams ) ) otherlv_51= EqualsSignGreaterThanSign )?
                            int alt93=2;
                            int LA93_0 = input.LA(1);

                            if ( (LA93_0==LeftParenthesis) ) {
                                int LA93_1 = input.LA(2);

                                if ( (LA93_1==Var) ) {
                                    alt93=1;
                                }
                                else if ( (LA93_1==RULE_ID) ) {
                                    int LA93_4 = input.LA(3);

                                    if ( (LA93_4==Colon) ) {
                                        alt93=1;
                                    }
                                }
                            }
                            switch (alt93) {
                                case 1 :
                                    // InternalGumboParser.g:4884:7: ( (lv_p_50_0= ruleSlangParams ) ) otherlv_51= EqualsSignGreaterThanSign
                                    {
                                    // InternalGumboParser.g:4884:7: ( (lv_p_50_0= ruleSlangParams ) )
                                    // InternalGumboParser.g:4885:8: (lv_p_50_0= ruleSlangParams )
                                    {
                                    // InternalGumboParser.g:4885:8: (lv_p_50_0= ruleSlangParams )
                                    // InternalGumboParser.g:4886:9: lv_p_50_0= ruleSlangParams
                                    {
                                    if ( state.backtracking==0 ) {

                                      									newCompositeNode(grammarAccess.getSlangTermAccess().getPSlangParamsParserRuleCall_8_2_0_0_0_0());
                                      								
                                    }
                                    pushFollow(FollowSets000.FOLLOW_59);
                                    lv_p_50_0=ruleSlangParams();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElementForParent(grammarAccess.getSlangTermRule());
                                      									}
                                      									set(
                                      										current,
                                      										"p",
                                      										lv_p_50_0,
                                      										"org.sireum.aadl.gumbo.Gumbo.SlangParams");
                                      									afterParserOrEnumRuleCall();
                                      								
                                    }

                                    }


                                    }

                                    otherlv_51=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_17); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(otherlv_51, grammarAccess.getSlangTermAccess().getEqualsSignGreaterThanSignKeyword_8_2_0_0_1());
                                      						
                                    }

                                    }
                                    break;

                            }

                            // InternalGumboParser.g:4908:6: ( (lv_e_52_0= ruleExpr ) )
                            // InternalGumboParser.g:4909:7: (lv_e_52_0= ruleExpr )
                            {
                            // InternalGumboParser.g:4909:7: (lv_e_52_0= ruleExpr )
                            // InternalGumboParser.g:4910:8: lv_e_52_0= ruleExpr
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getSlangTermAccess().getEExprParserRuleCall_8_2_0_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_72);
                            lv_e_52_0=ruleExpr();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getSlangTermRule());
                              								}
                              								set(
                              									current,
                              									"e",
                              									lv_e_52_0,
                              									"org.sireum.aadl.gumbo.Gumbo.Expr");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            otherlv_53=(Token)match(input,RightCurlyBracket,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_53, grammarAccess.getSlangTermAccess().getRightCurlyBracketKeyword_8_2_0_2());
                              					
                            }

                            }


                            }
                            break;
                        case 2 :
                            // InternalGumboParser.g:4933:5: ( ( (lv_stmt_54_0= ruleSlangStmt ) )* ( (lv_r_55_0= ruleSlangRet ) )? otherlv_56= RightCurlyBracket )
                            {
                            // InternalGumboParser.g:4933:5: ( ( (lv_stmt_54_0= ruleSlangStmt ) )* ( (lv_r_55_0= ruleSlangRet ) )? otherlv_56= RightCurlyBracket )
                            // InternalGumboParser.g:4934:6: ( (lv_stmt_54_0= ruleSlangStmt ) )* ( (lv_r_55_0= ruleSlangRet ) )? otherlv_56= RightCurlyBracket
                            {
                            // InternalGumboParser.g:4934:6: ( (lv_stmt_54_0= ruleSlangStmt ) )*
                            loop94:
                            do {
                                int alt94=2;
                                int LA94_0 = input.LA(1);

                                if ( ((LA94_0>=Assert && LA94_0<=Assume)||LA94_0==Match||LA94_0==While||(LA94_0>=Halt && LA94_0<=Spec)||(LA94_0>=Val && LA94_0<=Var)||(LA94_0>=Do && LA94_0<=If)||LA94_0==RULE_ID) ) {
                                    alt94=1;
                                }


                                switch (alt94) {
                            	case 1 :
                            	    // InternalGumboParser.g:4935:7: (lv_stmt_54_0= ruleSlangStmt )
                            	    {
                            	    // InternalGumboParser.g:4935:7: (lv_stmt_54_0= ruleSlangStmt )
                            	    // InternalGumboParser.g:4936:8: lv_stmt_54_0= ruleSlangStmt
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getSlangTermAccess().getStmtSlangStmtParserRuleCall_8_2_1_0_0());
                            	      							
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_71);
                            	    lv_stmt_54_0=ruleSlangStmt();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getSlangTermRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"stmt",
                            	      									lv_stmt_54_0,
                            	      									"org.sireum.aadl.gumbo.Gumbo.SlangStmt");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop94;
                                }
                            } while (true);

                            // InternalGumboParser.g:4953:6: ( (lv_r_55_0= ruleSlangRet ) )?
                            int alt95=2;
                            int LA95_0 = input.LA(1);

                            if ( (LA95_0==Return) ) {
                                alt95=1;
                            }
                            switch (alt95) {
                                case 1 :
                                    // InternalGumboParser.g:4954:7: (lv_r_55_0= ruleSlangRet )
                                    {
                                    // InternalGumboParser.g:4954:7: (lv_r_55_0= ruleSlangRet )
                                    // InternalGumboParser.g:4955:8: lv_r_55_0= ruleSlangRet
                                    {
                                    if ( state.backtracking==0 ) {

                                      								newCompositeNode(grammarAccess.getSlangTermAccess().getRSlangRetParserRuleCall_8_2_1_1_0());
                                      							
                                    }
                                    pushFollow(FollowSets000.FOLLOW_72);
                                    lv_r_55_0=ruleSlangRet();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								if (current==null) {
                                      									current = createModelElementForParent(grammarAccess.getSlangTermRule());
                                      								}
                                      								set(
                                      									current,
                                      									"r",
                                      									lv_r_55_0,
                                      									"org.sireum.aadl.gumbo.Gumbo.SlangRet");
                                      								afterParserOrEnumRuleCall();
                                      							
                                    }

                                    }


                                    }
                                    break;

                            }

                            otherlv_56=(Token)match(input,RightCurlyBracket,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_56, grammarAccess.getSlangTermAccess().getRightCurlyBracketKeyword_8_2_1_2());
                              					
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
    // InternalGumboParser.g:4983:1: entryRuleSlangParams returns [EObject current=null] : iv_ruleSlangParams= ruleSlangParams EOF ;
    public final EObject entryRuleSlangParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangParams = null;


        try {
            // InternalGumboParser.g:4983:52: (iv_ruleSlangParams= ruleSlangParams EOF )
            // InternalGumboParser.g:4984:2: iv_ruleSlangParams= ruleSlangParams EOF
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
    // InternalGumboParser.g:4990:1: ruleSlangParams returns [EObject current=null] : (otherlv_0= LeftParenthesis ( (lv_params_1_0= ruleSlangParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangParam ) ) )? otherlv_4= RightParenthesis ) ;
    public final EObject ruleSlangParams() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_params_1_0 = null;

        EObject lv_params_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:4996:2: ( (otherlv_0= LeftParenthesis ( (lv_params_1_0= ruleSlangParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangParam ) ) )? otherlv_4= RightParenthesis ) )
            // InternalGumboParser.g:4997:2: (otherlv_0= LeftParenthesis ( (lv_params_1_0= ruleSlangParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangParam ) ) )? otherlv_4= RightParenthesis )
            {
            // InternalGumboParser.g:4997:2: (otherlv_0= LeftParenthesis ( (lv_params_1_0= ruleSlangParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangParam ) ) )? otherlv_4= RightParenthesis )
            // InternalGumboParser.g:4998:3: otherlv_0= LeftParenthesis ( (lv_params_1_0= ruleSlangParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangParam ) ) )? otherlv_4= RightParenthesis
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_82); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangParamsAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalGumboParser.g:5002:3: ( (lv_params_1_0= ruleSlangParam ) )
            // InternalGumboParser.g:5003:4: (lv_params_1_0= ruleSlangParam )
            {
            // InternalGumboParser.g:5003:4: (lv_params_1_0= ruleSlangParam )
            // InternalGumboParser.g:5004:5: lv_params_1_0= ruleSlangParam
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangParamsAccess().getParamsSlangParamParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_36);
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

            // InternalGumboParser.g:5021:3: (otherlv_2= Comma ( (lv_params_3_0= ruleSlangParam ) ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==Comma) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalGumboParser.g:5022:4: otherlv_2= Comma ( (lv_params_3_0= ruleSlangParam ) )
                    {
                    otherlv_2=(Token)match(input,Comma,FollowSets000.FOLLOW_82); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSlangParamsAccess().getCommaKeyword_2_0());
                      			
                    }
                    // InternalGumboParser.g:5026:4: ( (lv_params_3_0= ruleSlangParam ) )
                    // InternalGumboParser.g:5027:5: (lv_params_3_0= ruleSlangParam )
                    {
                    // InternalGumboParser.g:5027:5: (lv_params_3_0= ruleSlangParam )
                    // InternalGumboParser.g:5028:6: lv_params_3_0= ruleSlangParam
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangParamsAccess().getParamsSlangParamParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_35);
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
    // InternalGumboParser.g:5054:1: entryRuleSlangParam returns [EObject current=null] : iv_ruleSlangParam= ruleSlangParam EOF ;
    public final EObject entryRuleSlangParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangParam = null;


        try {
            // InternalGumboParser.g:5054:51: (iv_ruleSlangParam= ruleSlangParam EOF )
            // InternalGumboParser.g:5055:2: iv_ruleSlangParam= ruleSlangParam EOF
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
    // InternalGumboParser.g:5061:1: ruleSlangParam returns [EObject current=null] : ( (otherlv_0= Var )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon (otherlv_3= EqualsSignGreaterThanSign )? ( (lv_typeName_4_0= ruleSlangType ) ) (otherlv_5= Asterisk )? ) ;
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
            // InternalGumboParser.g:5067:2: ( ( (otherlv_0= Var )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon (otherlv_3= EqualsSignGreaterThanSign )? ( (lv_typeName_4_0= ruleSlangType ) ) (otherlv_5= Asterisk )? ) )
            // InternalGumboParser.g:5068:2: ( (otherlv_0= Var )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon (otherlv_3= EqualsSignGreaterThanSign )? ( (lv_typeName_4_0= ruleSlangType ) ) (otherlv_5= Asterisk )? )
            {
            // InternalGumboParser.g:5068:2: ( (otherlv_0= Var )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon (otherlv_3= EqualsSignGreaterThanSign )? ( (lv_typeName_4_0= ruleSlangType ) ) (otherlv_5= Asterisk )? )
            // InternalGumboParser.g:5069:3: (otherlv_0= Var )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon (otherlv_3= EqualsSignGreaterThanSign )? ( (lv_typeName_4_0= ruleSlangType ) ) (otherlv_5= Asterisk )?
            {
            // InternalGumboParser.g:5069:3: (otherlv_0= Var )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==Var) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalGumboParser.g:5070:4: otherlv_0= Var
                    {
                    otherlv_0=(Token)match(input,Var,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getSlangParamAccess().getVarKeyword_0());
                      			
                    }

                    }
                    break;

            }

            // InternalGumboParser.g:5075:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGumboParser.g:5076:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGumboParser.g:5076:4: (lv_name_1_0= RULE_ID )
            // InternalGumboParser.g:5077:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,Colon,FollowSets000.FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSlangParamAccess().getColonKeyword_2());
              		
            }
            // InternalGumboParser.g:5097:3: (otherlv_3= EqualsSignGreaterThanSign )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==EqualsSignGreaterThanSign) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalGumboParser.g:5098:4: otherlv_3= EqualsSignGreaterThanSign
                    {
                    otherlv_3=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getSlangParamAccess().getEqualsSignGreaterThanSignKeyword_3());
                      			
                    }

                    }
                    break;

            }

            // InternalGumboParser.g:5103:3: ( (lv_typeName_4_0= ruleSlangType ) )
            // InternalGumboParser.g:5104:4: (lv_typeName_4_0= ruleSlangType )
            {
            // InternalGumboParser.g:5104:4: (lv_typeName_4_0= ruleSlangType )
            // InternalGumboParser.g:5105:5: lv_typeName_4_0= ruleSlangType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangParamAccess().getTypeNameSlangTypeParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_38);
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

            // InternalGumboParser.g:5122:3: (otherlv_5= Asterisk )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==Asterisk) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalGumboParser.g:5123:4: otherlv_5= Asterisk
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
    // InternalGumboParser.g:5132:1: entryRuleSlangForRange returns [EObject current=null] : iv_ruleSlangForRange= ruleSlangForRange EOF ;
    public final EObject entryRuleSlangForRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangForRange = null;


        try {
            // InternalGumboParser.g:5132:54: (iv_ruleSlangForRange= ruleSlangForRange EOF )
            // InternalGumboParser.g:5133:2: iv_ruleSlangForRange= ruleSlangForRange EOF
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
    // InternalGumboParser.g:5139:1: ruleSlangForRange returns [EObject current=null] : (this_ID_0= RULE_ID otherlv_1= Colon ( (lv_e_2_0= ruleExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upper_5_0= ruleExpr ) ) (otherlv_6= By ( (lv_step_7_0= ruleExpr ) ) )? )? ) ;
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
            // InternalGumboParser.g:5145:2: ( (this_ID_0= RULE_ID otherlv_1= Colon ( (lv_e_2_0= ruleExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upper_5_0= ruleExpr ) ) (otherlv_6= By ( (lv_step_7_0= ruleExpr ) ) )? )? ) )
            // InternalGumboParser.g:5146:2: (this_ID_0= RULE_ID otherlv_1= Colon ( (lv_e_2_0= ruleExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upper_5_0= ruleExpr ) ) (otherlv_6= By ( (lv_step_7_0= ruleExpr ) ) )? )? )
            {
            // InternalGumboParser.g:5146:2: (this_ID_0= RULE_ID otherlv_1= Colon ( (lv_e_2_0= ruleExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upper_5_0= ruleExpr ) ) (otherlv_6= By ( (lv_step_7_0= ruleExpr ) ) )? )? )
            // InternalGumboParser.g:5147:3: this_ID_0= RULE_ID otherlv_1= Colon ( (lv_e_2_0= ruleExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upper_5_0= ruleExpr ) ) (otherlv_6= By ( (lv_step_7_0= ruleExpr ) ) )? )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getSlangForRangeAccess().getIDTerminalRuleCall_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSlangForRangeAccess().getColonKeyword_1());
              		
            }
            // InternalGumboParser.g:5155:3: ( (lv_e_2_0= ruleExpr ) )
            // InternalGumboParser.g:5156:4: (lv_e_2_0= ruleExpr )
            {
            // InternalGumboParser.g:5156:4: (lv_e_2_0= ruleExpr )
            // InternalGumboParser.g:5157:5: lv_e_2_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangForRangeAccess().getEExprParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_70);
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

            // InternalGumboParser.g:5174:3: ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upper_5_0= ruleExpr ) ) (otherlv_6= By ( (lv_step_7_0= ruleExpr ) ) )? )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==FullStopFullStopLessThanSign||LA104_0==FullStopFullStop) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalGumboParser.g:5175:4: (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upper_5_0= ruleExpr ) ) (otherlv_6= By ( (lv_step_7_0= ruleExpr ) ) )?
                    {
                    // InternalGumboParser.g:5175:4: (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign )
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==FullStopFullStop) ) {
                        alt102=1;
                    }
                    else if ( (LA102_0==FullStopFullStopLessThanSign) ) {
                        alt102=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 102, 0, input);

                        throw nvae;
                    }
                    switch (alt102) {
                        case 1 :
                            // InternalGumboParser.g:5176:5: otherlv_3= FullStopFullStop
                            {
                            otherlv_3=(Token)match(input,FullStopFullStop,FollowSets000.FOLLOW_17); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_3, grammarAccess.getSlangForRangeAccess().getFullStopFullStopKeyword_3_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalGumboParser.g:5181:5: otherlv_4= FullStopFullStopLessThanSign
                            {
                            otherlv_4=(Token)match(input,FullStopFullStopLessThanSign,FollowSets000.FOLLOW_17); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getSlangForRangeAccess().getFullStopFullStopLessThanSignKeyword_3_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalGumboParser.g:5186:4: ( (lv_upper_5_0= ruleExpr ) )
                    // InternalGumboParser.g:5187:5: (lv_upper_5_0= ruleExpr )
                    {
                    // InternalGumboParser.g:5187:5: (lv_upper_5_0= ruleExpr )
                    // InternalGumboParser.g:5188:6: lv_upper_5_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangForRangeAccess().getUpperExprParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_83);
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

                    // InternalGumboParser.g:5205:4: (otherlv_6= By ( (lv_step_7_0= ruleExpr ) ) )?
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==By) ) {
                        alt103=1;
                    }
                    switch (alt103) {
                        case 1 :
                            // InternalGumboParser.g:5206:5: otherlv_6= By ( (lv_step_7_0= ruleExpr ) )
                            {
                            otherlv_6=(Token)match(input,By,FollowSets000.FOLLOW_17); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_6, grammarAccess.getSlangForRangeAccess().getByKeyword_3_2_0());
                              				
                            }
                            // InternalGumboParser.g:5210:5: ( (lv_step_7_0= ruleExpr ) )
                            // InternalGumboParser.g:5211:6: (lv_step_7_0= ruleExpr )
                            {
                            // InternalGumboParser.g:5211:6: (lv_step_7_0= ruleExpr )
                            // InternalGumboParser.g:5212:7: lv_step_7_0= ruleExpr
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
    // InternalGumboParser.g:5235:1: entryRuleSlangRet returns [EObject current=null] : iv_ruleSlangRet= ruleSlangRet EOF ;
    public final EObject entryRuleSlangRet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangRet = null;


        try {
            // InternalGumboParser.g:5235:49: (iv_ruleSlangRet= ruleSlangRet EOF )
            // InternalGumboParser.g:5236:2: iv_ruleSlangRet= ruleSlangRet EOF
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
    // InternalGumboParser.g:5242:1: ruleSlangRet returns [EObject current=null] : ( () otherlv_1= Return ( (lv_e_2_0= ruleExpr ) )? ) ;
    public final EObject ruleSlangRet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_e_2_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:5248:2: ( ( () otherlv_1= Return ( (lv_e_2_0= ruleExpr ) )? ) )
            // InternalGumboParser.g:5249:2: ( () otherlv_1= Return ( (lv_e_2_0= ruleExpr ) )? )
            {
            // InternalGumboParser.g:5249:2: ( () otherlv_1= Return ( (lv_e_2_0= ruleExpr ) )? )
            // InternalGumboParser.g:5250:3: () otherlv_1= Return ( (lv_e_2_0= ruleExpr ) )?
            {
            // InternalGumboParser.g:5250:3: ()
            // InternalGumboParser.g:5251:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSlangRetAccess().getSlangRetAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Return,FollowSets000.FOLLOW_68); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSlangRetAccess().getReturnKeyword_1());
              		
            }
            // InternalGumboParser.g:5261:3: ( (lv_e_2_0= ruleExpr ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==Some||LA105_0==All||LA105_0==Enum||LA105_0==For||LA105_0==In_1||LA105_0==LeftParenthesis||(LA105_0>=Asterisk && LA105_0<=PlusSign)||LA105_0==HyphenMinus||(LA105_0>=F && LA105_0<=T)||LA105_0==LeftCurlyBracket||(LA105_0>=ForAll && LA105_0<=ThereExists)||(LA105_0>=RULE_SLANG_STRING && LA105_0<=RULE_MSTRING)||LA105_0==RULE_MSP||(LA105_0>=RULE_SLI && LA105_0<=RULE_MSPB)||LA105_0==RULE_OP||(LA105_0>=RULE_HEX && LA105_0<=RULE_REAL_IDF)||LA105_0==RULE_ID) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalGumboParser.g:5262:4: (lv_e_2_0= ruleExpr )
                    {
                    // InternalGumboParser.g:5262:4: (lv_e_2_0= ruleExpr )
                    // InternalGumboParser.g:5263:5: lv_e_2_0= ruleExpr
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
    // InternalGumboParser.g:5284:1: entryRuleSlangCallSuffix returns [EObject current=null] : iv_ruleSlangCallSuffix= ruleSlangCallSuffix EOF ;
    public final EObject entryRuleSlangCallSuffix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangCallSuffix = null;


        try {
            // InternalGumboParser.g:5284:56: (iv_ruleSlangCallSuffix= ruleSlangCallSuffix EOF )
            // InternalGumboParser.g:5285:2: iv_ruleSlangCallSuffix= ruleSlangCallSuffix EOF
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
    // InternalGumboParser.g:5291:1: ruleSlangCallSuffix returns [EObject current=null] : ( ( () ( (lv_ta_1_0= ruleSlangTypeArgs ) ) ( (lv_ca_2_0= ruleSlangCallArgs ) )? ) | ( (lv_ca_3_0= ruleSlangCallArgs ) ) ) ;
    public final EObject ruleSlangCallSuffix() throws RecognitionException {
        EObject current = null;

        EObject lv_ta_1_0 = null;

        EObject lv_ca_2_0 = null;

        EObject lv_ca_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:5297:2: ( ( ( () ( (lv_ta_1_0= ruleSlangTypeArgs ) ) ( (lv_ca_2_0= ruleSlangCallArgs ) )? ) | ( (lv_ca_3_0= ruleSlangCallArgs ) ) ) )
            // InternalGumboParser.g:5298:2: ( ( () ( (lv_ta_1_0= ruleSlangTypeArgs ) ) ( (lv_ca_2_0= ruleSlangCallArgs ) )? ) | ( (lv_ca_3_0= ruleSlangCallArgs ) ) )
            {
            // InternalGumboParser.g:5298:2: ( ( () ( (lv_ta_1_0= ruleSlangTypeArgs ) ) ( (lv_ca_2_0= ruleSlangCallArgs ) )? ) | ( (lv_ca_3_0= ruleSlangCallArgs ) ) )
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==LeftSquareBracket) ) {
                alt107=1;
            }
            else if ( (LA107_0==LeftParenthesis) ) {
                alt107=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }
            switch (alt107) {
                case 1 :
                    // InternalGumboParser.g:5299:3: ( () ( (lv_ta_1_0= ruleSlangTypeArgs ) ) ( (lv_ca_2_0= ruleSlangCallArgs ) )? )
                    {
                    // InternalGumboParser.g:5299:3: ( () ( (lv_ta_1_0= ruleSlangTypeArgs ) ) ( (lv_ca_2_0= ruleSlangCallArgs ) )? )
                    // InternalGumboParser.g:5300:4: () ( (lv_ta_1_0= ruleSlangTypeArgs ) ) ( (lv_ca_2_0= ruleSlangCallArgs ) )?
                    {
                    // InternalGumboParser.g:5300:4: ()
                    // InternalGumboParser.g:5301:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangCallSuffixAccess().getSlangCallSuffixAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:5307:4: ( (lv_ta_1_0= ruleSlangTypeArgs ) )
                    // InternalGumboParser.g:5308:5: (lv_ta_1_0= ruleSlangTypeArgs )
                    {
                    // InternalGumboParser.g:5308:5: (lv_ta_1_0= ruleSlangTypeArgs )
                    // InternalGumboParser.g:5309:6: lv_ta_1_0= ruleSlangTypeArgs
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangCallSuffixAccess().getTaSlangTypeArgsParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_78);
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

                    // InternalGumboParser.g:5326:4: ( (lv_ca_2_0= ruleSlangCallArgs ) )?
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==LeftParenthesis) ) {
                        alt106=1;
                    }
                    switch (alt106) {
                        case 1 :
                            // InternalGumboParser.g:5327:5: (lv_ca_2_0= ruleSlangCallArgs )
                            {
                            // InternalGumboParser.g:5327:5: (lv_ca_2_0= ruleSlangCallArgs )
                            // InternalGumboParser.g:5328:6: lv_ca_2_0= ruleSlangCallArgs
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
                    // InternalGumboParser.g:5347:3: ( (lv_ca_3_0= ruleSlangCallArgs ) )
                    {
                    // InternalGumboParser.g:5347:3: ( (lv_ca_3_0= ruleSlangCallArgs ) )
                    // InternalGumboParser.g:5348:4: (lv_ca_3_0= ruleSlangCallArgs )
                    {
                    // InternalGumboParser.g:5348:4: (lv_ca_3_0= ruleSlangCallArgs )
                    // InternalGumboParser.g:5349:5: lv_ca_3_0= ruleSlangCallArgs
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
    // InternalGumboParser.g:5370:1: entryRuleSlangCallArgs returns [EObject current=null] : iv_ruleSlangCallArgs= ruleSlangCallArgs EOF ;
    public final EObject entryRuleSlangCallArgs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangCallArgs = null;


        try {
            // InternalGumboParser.g:5370:54: (iv_ruleSlangCallArgs= ruleSlangCallArgs EOF )
            // InternalGumboParser.g:5371:2: iv_ruleSlangCallArgs= ruleSlangCallArgs EOF
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
    // InternalGumboParser.g:5377:1: ruleSlangCallArgs returns [EObject current=null] : ( () otherlv_1= LeftParenthesis ( ( (lv_arg_2_0= ruleSlangIDExp ) ) (otherlv_3= Comma ( (lv_arg_4_0= ruleSlangIDExp ) ) )* )? otherlv_5= RightParenthesis ) ;
    public final EObject ruleSlangCallArgs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arg_2_0 = null;

        EObject lv_arg_4_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:5383:2: ( ( () otherlv_1= LeftParenthesis ( ( (lv_arg_2_0= ruleSlangIDExp ) ) (otherlv_3= Comma ( (lv_arg_4_0= ruleSlangIDExp ) ) )* )? otherlv_5= RightParenthesis ) )
            // InternalGumboParser.g:5384:2: ( () otherlv_1= LeftParenthesis ( ( (lv_arg_2_0= ruleSlangIDExp ) ) (otherlv_3= Comma ( (lv_arg_4_0= ruleSlangIDExp ) ) )* )? otherlv_5= RightParenthesis )
            {
            // InternalGumboParser.g:5384:2: ( () otherlv_1= LeftParenthesis ( ( (lv_arg_2_0= ruleSlangIDExp ) ) (otherlv_3= Comma ( (lv_arg_4_0= ruleSlangIDExp ) ) )* )? otherlv_5= RightParenthesis )
            // InternalGumboParser.g:5385:3: () otherlv_1= LeftParenthesis ( ( (lv_arg_2_0= ruleSlangIDExp ) ) (otherlv_3= Comma ( (lv_arg_4_0= ruleSlangIDExp ) ) )* )? otherlv_5= RightParenthesis
            {
            // InternalGumboParser.g:5385:3: ()
            // InternalGumboParser.g:5386:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSlangCallArgsAccess().getSlangCallArgsAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_84); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSlangCallArgsAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGumboParser.g:5396:3: ( ( (lv_arg_2_0= ruleSlangIDExp ) ) (otherlv_3= Comma ( (lv_arg_4_0= ruleSlangIDExp ) ) )* )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==Some||LA109_0==All||LA109_0==Enum||LA109_0==For||LA109_0==In_1||LA109_0==LeftParenthesis||(LA109_0>=Asterisk && LA109_0<=PlusSign)||LA109_0==HyphenMinus||(LA109_0>=F && LA109_0<=T)||LA109_0==LeftCurlyBracket||(LA109_0>=ForAll && LA109_0<=ThereExists)||(LA109_0>=RULE_SLANG_STRING && LA109_0<=RULE_MSTRING)||LA109_0==RULE_MSP||(LA109_0>=RULE_SLI && LA109_0<=RULE_MSPB)||LA109_0==RULE_OP||(LA109_0>=RULE_HEX && LA109_0<=RULE_REAL_IDF)||LA109_0==RULE_ID) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // InternalGumboParser.g:5397:4: ( (lv_arg_2_0= ruleSlangIDExp ) ) (otherlv_3= Comma ( (lv_arg_4_0= ruleSlangIDExp ) ) )*
                    {
                    // InternalGumboParser.g:5397:4: ( (lv_arg_2_0= ruleSlangIDExp ) )
                    // InternalGumboParser.g:5398:5: (lv_arg_2_0= ruleSlangIDExp )
                    {
                    // InternalGumboParser.g:5398:5: (lv_arg_2_0= ruleSlangIDExp )
                    // InternalGumboParser.g:5399:6: lv_arg_2_0= ruleSlangIDExp
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangCallArgsAccess().getArgSlangIDExpParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_36);
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

                    // InternalGumboParser.g:5416:4: (otherlv_3= Comma ( (lv_arg_4_0= ruleSlangIDExp ) ) )*
                    loop108:
                    do {
                        int alt108=2;
                        int LA108_0 = input.LA(1);

                        if ( (LA108_0==Comma) ) {
                            alt108=1;
                        }


                        switch (alt108) {
                    	case 1 :
                    	    // InternalGumboParser.g:5417:5: otherlv_3= Comma ( (lv_arg_4_0= ruleSlangIDExp ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getSlangCallArgsAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:5421:5: ( (lv_arg_4_0= ruleSlangIDExp ) )
                    	    // InternalGumboParser.g:5422:6: (lv_arg_4_0= ruleSlangIDExp )
                    	    {
                    	    // InternalGumboParser.g:5422:6: (lv_arg_4_0= ruleSlangIDExp )
                    	    // InternalGumboParser.g:5423:7: lv_arg_4_0= ruleSlangIDExp
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSlangCallArgsAccess().getArgSlangIDExpParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_36);
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
                    	    break loop108;
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
    // InternalGumboParser.g:5450:1: entryRuleSlangIDExp returns [EObject current=null] : iv_ruleSlangIDExp= ruleSlangIDExp EOF ;
    public final EObject entryRuleSlangIDExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangIDExp = null;


        try {
            // InternalGumboParser.g:5450:51: (iv_ruleSlangIDExp= ruleSlangIDExp EOF )
            // InternalGumboParser.g:5451:2: iv_ruleSlangIDExp= ruleSlangIDExp EOF
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
    // InternalGumboParser.g:5457:1: ruleSlangIDExp returns [EObject current=null] : ( ( (lv_e_0_0= ruleExpr ) ) (otherlv_1= ColonEqualsSign ( (lv_e_2_0= ruleExpr ) ) )? ) ;
    public final EObject ruleSlangIDExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_e_0_0 = null;

        EObject lv_e_2_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:5463:2: ( ( ( (lv_e_0_0= ruleExpr ) ) (otherlv_1= ColonEqualsSign ( (lv_e_2_0= ruleExpr ) ) )? ) )
            // InternalGumboParser.g:5464:2: ( ( (lv_e_0_0= ruleExpr ) ) (otherlv_1= ColonEqualsSign ( (lv_e_2_0= ruleExpr ) ) )? )
            {
            // InternalGumboParser.g:5464:2: ( ( (lv_e_0_0= ruleExpr ) ) (otherlv_1= ColonEqualsSign ( (lv_e_2_0= ruleExpr ) ) )? )
            // InternalGumboParser.g:5465:3: ( (lv_e_0_0= ruleExpr ) ) (otherlv_1= ColonEqualsSign ( (lv_e_2_0= ruleExpr ) ) )?
            {
            // InternalGumboParser.g:5465:3: ( (lv_e_0_0= ruleExpr ) )
            // InternalGumboParser.g:5466:4: (lv_e_0_0= ruleExpr )
            {
            // InternalGumboParser.g:5466:4: (lv_e_0_0= ruleExpr )
            // InternalGumboParser.g:5467:5: lv_e_0_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangIDExpAccess().getEExprParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_85);
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

            // InternalGumboParser.g:5484:3: (otherlv_1= ColonEqualsSign ( (lv_e_2_0= ruleExpr ) ) )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==ColonEqualsSign) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalGumboParser.g:5485:4: otherlv_1= ColonEqualsSign ( (lv_e_2_0= ruleExpr ) )
                    {
                    otherlv_1=(Token)match(input,ColonEqualsSign,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getSlangIDExpAccess().getColonEqualsSignKeyword_1_0());
                      			
                    }
                    // InternalGumboParser.g:5489:4: ( (lv_e_2_0= ruleExpr ) )
                    // InternalGumboParser.g:5490:5: (lv_e_2_0= ruleExpr )
                    {
                    // InternalGumboParser.g:5490:5: (lv_e_2_0= ruleExpr )
                    // InternalGumboParser.g:5491:6: lv_e_2_0= ruleExpr
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
    // InternalGumboParser.g:5513:1: entryRuleSlangType returns [EObject current=null] : iv_ruleSlangType= ruleSlangType EOF ;
    public final EObject entryRuleSlangType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangType = null;


        try {
            // InternalGumboParser.g:5513:50: (iv_ruleSlangType= ruleSlangType EOF )
            // InternalGumboParser.g:5514:2: iv_ruleSlangType= ruleSlangType EOF
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
    // InternalGumboParser.g:5520:1: ruleSlangType returns [EObject current=null] : this_SlangBaseType_0= ruleSlangBaseType ;
    public final EObject ruleSlangType() throws RecognitionException {
        EObject current = null;

        EObject this_SlangBaseType_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:5526:2: (this_SlangBaseType_0= ruleSlangBaseType )
            // InternalGumboParser.g:5527:2: this_SlangBaseType_0= ruleSlangBaseType
            {
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
    // InternalGumboParser.g:5538:1: entryRuleSlangBaseType returns [EObject current=null] : iv_ruleSlangBaseType= ruleSlangBaseType EOF ;
    public final EObject entryRuleSlangBaseType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangBaseType = null;


        try {
            // InternalGumboParser.g:5538:54: (iv_ruleSlangBaseType= ruleSlangBaseType EOF )
            // InternalGumboParser.g:5539:2: iv_ruleSlangBaseType= ruleSlangBaseType EOF
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
    // InternalGumboParser.g:5545:1: ruleSlangBaseType returns [EObject current=null] : ( ( ruleQCREF ) ) ;
    public final EObject ruleSlangBaseType() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalGumboParser.g:5551:2: ( ( ( ruleQCREF ) ) )
            // InternalGumboParser.g:5552:2: ( ( ruleQCREF ) )
            {
            // InternalGumboParser.g:5552:2: ( ( ruleQCREF ) )
            // InternalGumboParser.g:5553:3: ( ruleQCREF )
            {
            // InternalGumboParser.g:5553:3: ( ruleQCREF )
            // InternalGumboParser.g:5554:4: ruleQCREF
            {
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
    // InternalGumboParser.g:5571:1: entryRuleSlangTypeArgs returns [EObject current=null] : iv_ruleSlangTypeArgs= ruleSlangTypeArgs EOF ;
    public final EObject entryRuleSlangTypeArgs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangTypeArgs = null;


        try {
            // InternalGumboParser.g:5571:54: (iv_ruleSlangTypeArgs= ruleSlangTypeArgs EOF )
            // InternalGumboParser.g:5572:2: iv_ruleSlangTypeArgs= ruleSlangTypeArgs EOF
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
    // InternalGumboParser.g:5578:1: ruleSlangTypeArgs returns [EObject current=null] : (otherlv_0= LeftSquareBracket ( (lv_types_1_0= ruleSlangType ) ) (otherlv_2= Comma ( (lv_types_3_0= ruleSlangType ) ) )* otherlv_4= RightSquareBracket ) ;
    public final EObject ruleSlangTypeArgs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_types_1_0 = null;

        EObject lv_types_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:5584:2: ( (otherlv_0= LeftSquareBracket ( (lv_types_1_0= ruleSlangType ) ) (otherlv_2= Comma ( (lv_types_3_0= ruleSlangType ) ) )* otherlv_4= RightSquareBracket ) )
            // InternalGumboParser.g:5585:2: (otherlv_0= LeftSquareBracket ( (lv_types_1_0= ruleSlangType ) ) (otherlv_2= Comma ( (lv_types_3_0= ruleSlangType ) ) )* otherlv_4= RightSquareBracket )
            {
            // InternalGumboParser.g:5585:2: (otherlv_0= LeftSquareBracket ( (lv_types_1_0= ruleSlangType ) ) (otherlv_2= Comma ( (lv_types_3_0= ruleSlangType ) ) )* otherlv_4= RightSquareBracket )
            // InternalGumboParser.g:5586:3: otherlv_0= LeftSquareBracket ( (lv_types_1_0= ruleSlangType ) ) (otherlv_2= Comma ( (lv_types_3_0= ruleSlangType ) ) )* otherlv_4= RightSquareBracket
            {
            otherlv_0=(Token)match(input,LeftSquareBracket,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangTypeArgsAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalGumboParser.g:5590:3: ( (lv_types_1_0= ruleSlangType ) )
            // InternalGumboParser.g:5591:4: (lv_types_1_0= ruleSlangType )
            {
            // InternalGumboParser.g:5591:4: (lv_types_1_0= ruleSlangType )
            // InternalGumboParser.g:5592:5: lv_types_1_0= ruleSlangType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangTypeArgsAccess().getTypesSlangTypeParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_40);
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

            // InternalGumboParser.g:5609:3: (otherlv_2= Comma ( (lv_types_3_0= ruleSlangType ) ) )*
            loop111:
            do {
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( (LA111_0==Comma) ) {
                    alt111=1;
                }


                switch (alt111) {
            	case 1 :
            	    // InternalGumboParser.g:5610:4: otherlv_2= Comma ( (lv_types_3_0= ruleSlangType ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FollowSets000.FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSlangTypeArgsAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalGumboParser.g:5614:4: ( (lv_types_3_0= ruleSlangType ) )
            	    // InternalGumboParser.g:5615:5: (lv_types_3_0= ruleSlangType )
            	    {
            	    // InternalGumboParser.g:5615:5: (lv_types_3_0= ruleSlangType )
            	    // InternalGumboParser.g:5616:6: lv_types_3_0= ruleSlangType
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSlangTypeArgsAccess().getTypesSlangTypeParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_40);
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
            	    break loop111;
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
    // InternalGumboParser.g:5642:1: entryRuleSlangLit returns [EObject current=null] : iv_ruleSlangLit= ruleSlangLit EOF ;
    public final EObject entryRuleSlangLit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangLit = null;


        try {
            // InternalGumboParser.g:5642:49: (iv_ruleSlangLit= ruleSlangLit EOF )
            // InternalGumboParser.g:5643:2: iv_ruleSlangLit= ruleSlangLit EOF
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
    // InternalGumboParser.g:5649:1: ruleSlangLit returns [EObject current=null] : ( ( () ( ( (lv_value_1_1= T | lv_value_1_2= F ) ) ) ) | ( () ( (lv_value_3_0= RULE_INTEGER_LIT ) ) ) | ( () ( (lv_value_5_0= RULE_INT_IDF ) ) ) | ( () ( (lv_value_7_0= RULE_HEX ) ) ) | ( () ( (lv_value_9_0= RULE_BIN ) ) ) | ( () ( (lv_value_11_0= RULE_REAL_LIT ) ) ) | ( () ( (lv_value_13_0= RULE_SLANG_STRING ) ) ) | ( () ( (lv_value_15_0= RULE_REAL_IDF ) ) ) | ( () ( (lv_value_17_0= RULE_MSTRING ) ) ) ) ;
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
            // InternalGumboParser.g:5655:2: ( ( ( () ( ( (lv_value_1_1= T | lv_value_1_2= F ) ) ) ) | ( () ( (lv_value_3_0= RULE_INTEGER_LIT ) ) ) | ( () ( (lv_value_5_0= RULE_INT_IDF ) ) ) | ( () ( (lv_value_7_0= RULE_HEX ) ) ) | ( () ( (lv_value_9_0= RULE_BIN ) ) ) | ( () ( (lv_value_11_0= RULE_REAL_LIT ) ) ) | ( () ( (lv_value_13_0= RULE_SLANG_STRING ) ) ) | ( () ( (lv_value_15_0= RULE_REAL_IDF ) ) ) | ( () ( (lv_value_17_0= RULE_MSTRING ) ) ) ) )
            // InternalGumboParser.g:5656:2: ( ( () ( ( (lv_value_1_1= T | lv_value_1_2= F ) ) ) ) | ( () ( (lv_value_3_0= RULE_INTEGER_LIT ) ) ) | ( () ( (lv_value_5_0= RULE_INT_IDF ) ) ) | ( () ( (lv_value_7_0= RULE_HEX ) ) ) | ( () ( (lv_value_9_0= RULE_BIN ) ) ) | ( () ( (lv_value_11_0= RULE_REAL_LIT ) ) ) | ( () ( (lv_value_13_0= RULE_SLANG_STRING ) ) ) | ( () ( (lv_value_15_0= RULE_REAL_IDF ) ) ) | ( () ( (lv_value_17_0= RULE_MSTRING ) ) ) )
            {
            // InternalGumboParser.g:5656:2: ( ( () ( ( (lv_value_1_1= T | lv_value_1_2= F ) ) ) ) | ( () ( (lv_value_3_0= RULE_INTEGER_LIT ) ) ) | ( () ( (lv_value_5_0= RULE_INT_IDF ) ) ) | ( () ( (lv_value_7_0= RULE_HEX ) ) ) | ( () ( (lv_value_9_0= RULE_BIN ) ) ) | ( () ( (lv_value_11_0= RULE_REAL_LIT ) ) ) | ( () ( (lv_value_13_0= RULE_SLANG_STRING ) ) ) | ( () ( (lv_value_15_0= RULE_REAL_IDF ) ) ) | ( () ( (lv_value_17_0= RULE_MSTRING ) ) ) )
            int alt113=9;
            switch ( input.LA(1) ) {
            case F:
            case T:
                {
                alt113=1;
                }
                break;
            case RULE_INTEGER_LIT:
                {
                alt113=2;
                }
                break;
            case RULE_INT_IDF:
                {
                alt113=3;
                }
                break;
            case RULE_HEX:
                {
                alt113=4;
                }
                break;
            case RULE_BIN:
                {
                alt113=5;
                }
                break;
            case RULE_REAL_LIT:
                {
                alt113=6;
                }
                break;
            case RULE_SLANG_STRING:
                {
                alt113=7;
                }
                break;
            case RULE_REAL_IDF:
                {
                alt113=8;
                }
                break;
            case RULE_MSTRING:
                {
                alt113=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }

            switch (alt113) {
                case 1 :
                    // InternalGumboParser.g:5657:3: ( () ( ( (lv_value_1_1= T | lv_value_1_2= F ) ) ) )
                    {
                    // InternalGumboParser.g:5657:3: ( () ( ( (lv_value_1_1= T | lv_value_1_2= F ) ) ) )
                    // InternalGumboParser.g:5658:4: () ( ( (lv_value_1_1= T | lv_value_1_2= F ) ) )
                    {
                    // InternalGumboParser.g:5658:4: ()
                    // InternalGumboParser.g:5659:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangLitAccess().getBooleanLitAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:5665:4: ( ( (lv_value_1_1= T | lv_value_1_2= F ) ) )
                    // InternalGumboParser.g:5666:5: ( (lv_value_1_1= T | lv_value_1_2= F ) )
                    {
                    // InternalGumboParser.g:5666:5: ( (lv_value_1_1= T | lv_value_1_2= F ) )
                    // InternalGumboParser.g:5667:6: (lv_value_1_1= T | lv_value_1_2= F )
                    {
                    // InternalGumboParser.g:5667:6: (lv_value_1_1= T | lv_value_1_2= F )
                    int alt112=2;
                    int LA112_0 = input.LA(1);

                    if ( (LA112_0==T) ) {
                        alt112=1;
                    }
                    else if ( (LA112_0==F) ) {
                        alt112=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 112, 0, input);

                        throw nvae;
                    }
                    switch (alt112) {
                        case 1 :
                            // InternalGumboParser.g:5668:7: lv_value_1_1= T
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
                            // InternalGumboParser.g:5679:7: lv_value_1_2= F
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
                    // InternalGumboParser.g:5694:3: ( () ( (lv_value_3_0= RULE_INTEGER_LIT ) ) )
                    {
                    // InternalGumboParser.g:5694:3: ( () ( (lv_value_3_0= RULE_INTEGER_LIT ) ) )
                    // InternalGumboParser.g:5695:4: () ( (lv_value_3_0= RULE_INTEGER_LIT ) )
                    {
                    // InternalGumboParser.g:5695:4: ()
                    // InternalGumboParser.g:5696:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangLitAccess().getIntegerLitAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:5702:4: ( (lv_value_3_0= RULE_INTEGER_LIT ) )
                    // InternalGumboParser.g:5703:5: (lv_value_3_0= RULE_INTEGER_LIT )
                    {
                    // InternalGumboParser.g:5703:5: (lv_value_3_0= RULE_INTEGER_LIT )
                    // InternalGumboParser.g:5704:6: lv_value_3_0= RULE_INTEGER_LIT
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
                    // InternalGumboParser.g:5722:3: ( () ( (lv_value_5_0= RULE_INT_IDF ) ) )
                    {
                    // InternalGumboParser.g:5722:3: ( () ( (lv_value_5_0= RULE_INT_IDF ) ) )
                    // InternalGumboParser.g:5723:4: () ( (lv_value_5_0= RULE_INT_IDF ) )
                    {
                    // InternalGumboParser.g:5723:4: ()
                    // InternalGumboParser.g:5724:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangLitAccess().getIntIdfLitAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:5730:4: ( (lv_value_5_0= RULE_INT_IDF ) )
                    // InternalGumboParser.g:5731:5: (lv_value_5_0= RULE_INT_IDF )
                    {
                    // InternalGumboParser.g:5731:5: (lv_value_5_0= RULE_INT_IDF )
                    // InternalGumboParser.g:5732:6: lv_value_5_0= RULE_INT_IDF
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
                    // InternalGumboParser.g:5750:3: ( () ( (lv_value_7_0= RULE_HEX ) ) )
                    {
                    // InternalGumboParser.g:5750:3: ( () ( (lv_value_7_0= RULE_HEX ) ) )
                    // InternalGumboParser.g:5751:4: () ( (lv_value_7_0= RULE_HEX ) )
                    {
                    // InternalGumboParser.g:5751:4: ()
                    // InternalGumboParser.g:5752:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangLitAccess().getHexLitAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:5758:4: ( (lv_value_7_0= RULE_HEX ) )
                    // InternalGumboParser.g:5759:5: (lv_value_7_0= RULE_HEX )
                    {
                    // InternalGumboParser.g:5759:5: (lv_value_7_0= RULE_HEX )
                    // InternalGumboParser.g:5760:6: lv_value_7_0= RULE_HEX
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
                    // InternalGumboParser.g:5778:3: ( () ( (lv_value_9_0= RULE_BIN ) ) )
                    {
                    // InternalGumboParser.g:5778:3: ( () ( (lv_value_9_0= RULE_BIN ) ) )
                    // InternalGumboParser.g:5779:4: () ( (lv_value_9_0= RULE_BIN ) )
                    {
                    // InternalGumboParser.g:5779:4: ()
                    // InternalGumboParser.g:5780:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangLitAccess().getBinLitAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:5786:4: ( (lv_value_9_0= RULE_BIN ) )
                    // InternalGumboParser.g:5787:5: (lv_value_9_0= RULE_BIN )
                    {
                    // InternalGumboParser.g:5787:5: (lv_value_9_0= RULE_BIN )
                    // InternalGumboParser.g:5788:6: lv_value_9_0= RULE_BIN
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
                    // InternalGumboParser.g:5806:3: ( () ( (lv_value_11_0= RULE_REAL_LIT ) ) )
                    {
                    // InternalGumboParser.g:5806:3: ( () ( (lv_value_11_0= RULE_REAL_LIT ) ) )
                    // InternalGumboParser.g:5807:4: () ( (lv_value_11_0= RULE_REAL_LIT ) )
                    {
                    // InternalGumboParser.g:5807:4: ()
                    // InternalGumboParser.g:5808:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangLitAccess().getRealLitAction_5_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:5814:4: ( (lv_value_11_0= RULE_REAL_LIT ) )
                    // InternalGumboParser.g:5815:5: (lv_value_11_0= RULE_REAL_LIT )
                    {
                    // InternalGumboParser.g:5815:5: (lv_value_11_0= RULE_REAL_LIT )
                    // InternalGumboParser.g:5816:6: lv_value_11_0= RULE_REAL_LIT
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
                    // InternalGumboParser.g:5834:3: ( () ( (lv_value_13_0= RULE_SLANG_STRING ) ) )
                    {
                    // InternalGumboParser.g:5834:3: ( () ( (lv_value_13_0= RULE_SLANG_STRING ) ) )
                    // InternalGumboParser.g:5835:4: () ( (lv_value_13_0= RULE_SLANG_STRING ) )
                    {
                    // InternalGumboParser.g:5835:4: ()
                    // InternalGumboParser.g:5836:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangLitAccess().getSlangStringLitAction_6_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:5842:4: ( (lv_value_13_0= RULE_SLANG_STRING ) )
                    // InternalGumboParser.g:5843:5: (lv_value_13_0= RULE_SLANG_STRING )
                    {
                    // InternalGumboParser.g:5843:5: (lv_value_13_0= RULE_SLANG_STRING )
                    // InternalGumboParser.g:5844:6: lv_value_13_0= RULE_SLANG_STRING
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
                    // InternalGumboParser.g:5862:3: ( () ( (lv_value_15_0= RULE_REAL_IDF ) ) )
                    {
                    // InternalGumboParser.g:5862:3: ( () ( (lv_value_15_0= RULE_REAL_IDF ) ) )
                    // InternalGumboParser.g:5863:4: () ( (lv_value_15_0= RULE_REAL_IDF ) )
                    {
                    // InternalGumboParser.g:5863:4: ()
                    // InternalGumboParser.g:5864:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangLitAccess().getRealIdfLitAction_7_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:5870:4: ( (lv_value_15_0= RULE_REAL_IDF ) )
                    // InternalGumboParser.g:5871:5: (lv_value_15_0= RULE_REAL_IDF )
                    {
                    // InternalGumboParser.g:5871:5: (lv_value_15_0= RULE_REAL_IDF )
                    // InternalGumboParser.g:5872:6: lv_value_15_0= RULE_REAL_IDF
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
                    // InternalGumboParser.g:5890:3: ( () ( (lv_value_17_0= RULE_MSTRING ) ) )
                    {
                    // InternalGumboParser.g:5890:3: ( () ( (lv_value_17_0= RULE_MSTRING ) ) )
                    // InternalGumboParser.g:5891:4: () ( (lv_value_17_0= RULE_MSTRING ) )
                    {
                    // InternalGumboParser.g:5891:4: ()
                    // InternalGumboParser.g:5892:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangLitAccess().getMStringLitAction_8_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:5898:4: ( (lv_value_17_0= RULE_MSTRING ) )
                    // InternalGumboParser.g:5899:5: (lv_value_17_0= RULE_MSTRING )
                    {
                    // InternalGumboParser.g:5899:5: (lv_value_17_0= RULE_MSTRING )
                    // InternalGumboParser.g:5900:6: lv_value_17_0= RULE_MSTRING
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
    // InternalGumboParser.g:5921:1: entryRuleSlangInterp returns [EObject current=null] : iv_ruleSlangInterp= ruleSlangInterp EOF ;
    public final EObject entryRuleSlangInterp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangInterp = null;


        try {
            // InternalGumboParser.g:5921:52: (iv_ruleSlangInterp= ruleSlangInterp EOF )
            // InternalGumboParser.g:5922:2: iv_ruleSlangInterp= ruleSlangInterp EOF
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
    // InternalGumboParser.g:5928:1: ruleSlangInterp returns [EObject current=null] : ( ( () ( (lv_msp_1_0= RULE_MSP ) ) ) | ( () ( (lv_sli_3_0= RULE_SLI ) ) ) | ( () ( (lv_mspb_5_0= RULE_MSPB ) ) ( (lv_minterp_6_0= ruleSlangMInterp ) ) ) ) ;
    public final EObject ruleSlangInterp() throws RecognitionException {
        EObject current = null;

        Token lv_msp_1_0=null;
        Token lv_sli_3_0=null;
        Token lv_mspb_5_0=null;
        EObject lv_minterp_6_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:5934:2: ( ( ( () ( (lv_msp_1_0= RULE_MSP ) ) ) | ( () ( (lv_sli_3_0= RULE_SLI ) ) ) | ( () ( (lv_mspb_5_0= RULE_MSPB ) ) ( (lv_minterp_6_0= ruleSlangMInterp ) ) ) ) )
            // InternalGumboParser.g:5935:2: ( ( () ( (lv_msp_1_0= RULE_MSP ) ) ) | ( () ( (lv_sli_3_0= RULE_SLI ) ) ) | ( () ( (lv_mspb_5_0= RULE_MSPB ) ) ( (lv_minterp_6_0= ruleSlangMInterp ) ) ) )
            {
            // InternalGumboParser.g:5935:2: ( ( () ( (lv_msp_1_0= RULE_MSP ) ) ) | ( () ( (lv_sli_3_0= RULE_SLI ) ) ) | ( () ( (lv_mspb_5_0= RULE_MSPB ) ) ( (lv_minterp_6_0= ruleSlangMInterp ) ) ) )
            int alt114=3;
            switch ( input.LA(1) ) {
            case RULE_MSP:
                {
                alt114=1;
                }
                break;
            case RULE_SLI:
                {
                alt114=2;
                }
                break;
            case RULE_MSPB:
                {
                alt114=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;
            }

            switch (alt114) {
                case 1 :
                    // InternalGumboParser.g:5936:3: ( () ( (lv_msp_1_0= RULE_MSP ) ) )
                    {
                    // InternalGumboParser.g:5936:3: ( () ( (lv_msp_1_0= RULE_MSP ) ) )
                    // InternalGumboParser.g:5937:4: () ( (lv_msp_1_0= RULE_MSP ) )
                    {
                    // InternalGumboParser.g:5937:4: ()
                    // InternalGumboParser.g:5938:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangInterpAccess().getSlangMspInterpAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:5944:4: ( (lv_msp_1_0= RULE_MSP ) )
                    // InternalGumboParser.g:5945:5: (lv_msp_1_0= RULE_MSP )
                    {
                    // InternalGumboParser.g:5945:5: (lv_msp_1_0= RULE_MSP )
                    // InternalGumboParser.g:5946:6: lv_msp_1_0= RULE_MSP
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
                    // InternalGumboParser.g:5964:3: ( () ( (lv_sli_3_0= RULE_SLI ) ) )
                    {
                    // InternalGumboParser.g:5964:3: ( () ( (lv_sli_3_0= RULE_SLI ) ) )
                    // InternalGumboParser.g:5965:4: () ( (lv_sli_3_0= RULE_SLI ) )
                    {
                    // InternalGumboParser.g:5965:4: ()
                    // InternalGumboParser.g:5966:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangInterpAccess().getSlangLiteralInterpAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:5972:4: ( (lv_sli_3_0= RULE_SLI ) )
                    // InternalGumboParser.g:5973:5: (lv_sli_3_0= RULE_SLI )
                    {
                    // InternalGumboParser.g:5973:5: (lv_sli_3_0= RULE_SLI )
                    // InternalGumboParser.g:5974:6: lv_sli_3_0= RULE_SLI
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
                    // InternalGumboParser.g:5992:3: ( () ( (lv_mspb_5_0= RULE_MSPB ) ) ( (lv_minterp_6_0= ruleSlangMInterp ) ) )
                    {
                    // InternalGumboParser.g:5992:3: ( () ( (lv_mspb_5_0= RULE_MSPB ) ) ( (lv_minterp_6_0= ruleSlangMInterp ) ) )
                    // InternalGumboParser.g:5993:4: () ( (lv_mspb_5_0= RULE_MSPB ) ) ( (lv_minterp_6_0= ruleSlangMInterp ) )
                    {
                    // InternalGumboParser.g:5993:4: ()
                    // InternalGumboParser.g:5994:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangInterpAccess().getSlangMspbInterpAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:6000:4: ( (lv_mspb_5_0= RULE_MSPB ) )
                    // InternalGumboParser.g:6001:5: (lv_mspb_5_0= RULE_MSPB )
                    {
                    // InternalGumboParser.g:6001:5: (lv_mspb_5_0= RULE_MSPB )
                    // InternalGumboParser.g:6002:6: lv_mspb_5_0= RULE_MSPB
                    {
                    lv_mspb_5_0=(Token)match(input,RULE_MSPB,FollowSets000.FOLLOW_50); if (state.failed) return current;
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

                    // InternalGumboParser.g:6018:4: ( (lv_minterp_6_0= ruleSlangMInterp ) )
                    // InternalGumboParser.g:6019:5: (lv_minterp_6_0= ruleSlangMInterp )
                    {
                    // InternalGumboParser.g:6019:5: (lv_minterp_6_0= ruleSlangMInterp )
                    // InternalGumboParser.g:6020:6: lv_minterp_6_0= ruleSlangMInterp
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
    // InternalGumboParser.g:6042:1: entryRuleSlangMInterp returns [EObject current=null] : iv_ruleSlangMInterp= ruleSlangMInterp EOF ;
    public final EObject entryRuleSlangMInterp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangMInterp = null;


        try {
            // InternalGumboParser.g:6042:53: (iv_ruleSlangMInterp= ruleSlangMInterp EOF )
            // InternalGumboParser.g:6043:2: iv_ruleSlangMInterp= ruleSlangMInterp EOF
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
    // InternalGumboParser.g:6049:1: ruleSlangMInterp returns [EObject current=null] : (otherlv_0= LeftCurlyBracket ( (lv_e_1_0= ruleExpr ) ) otherlv_2= RightCurlyBracket ( (this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) ) ) | this_MSPE_5= RULE_MSPE ) ) ;
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
            // InternalGumboParser.g:6055:2: ( (otherlv_0= LeftCurlyBracket ( (lv_e_1_0= ruleExpr ) ) otherlv_2= RightCurlyBracket ( (this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) ) ) | this_MSPE_5= RULE_MSPE ) ) )
            // InternalGumboParser.g:6056:2: (otherlv_0= LeftCurlyBracket ( (lv_e_1_0= ruleExpr ) ) otherlv_2= RightCurlyBracket ( (this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) ) ) | this_MSPE_5= RULE_MSPE ) )
            {
            // InternalGumboParser.g:6056:2: (otherlv_0= LeftCurlyBracket ( (lv_e_1_0= ruleExpr ) ) otherlv_2= RightCurlyBracket ( (this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) ) ) | this_MSPE_5= RULE_MSPE ) )
            // InternalGumboParser.g:6057:3: otherlv_0= LeftCurlyBracket ( (lv_e_1_0= ruleExpr ) ) otherlv_2= RightCurlyBracket ( (this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) ) ) | this_MSPE_5= RULE_MSPE )
            {
            otherlv_0=(Token)match(input,LeftCurlyBracket,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangMInterpAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalGumboParser.g:6061:3: ( (lv_e_1_0= ruleExpr ) )
            // InternalGumboParser.g:6062:4: (lv_e_1_0= ruleExpr )
            {
            // InternalGumboParser.g:6062:4: (lv_e_1_0= ruleExpr )
            // InternalGumboParser.g:6063:5: lv_e_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangMInterpAccess().getEExprParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_72);
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

            otherlv_2=(Token)match(input,RightCurlyBracket,FollowSets000.FOLLOW_86); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSlangMInterpAccess().getRightCurlyBracketKeyword_2());
              		
            }
            // InternalGumboParser.g:6084:3: ( (this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) ) ) | this_MSPE_5= RULE_MSPE )
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==RULE_MSPM) ) {
                alt115=1;
            }
            else if ( (LA115_0==RULE_MSPE) ) {
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
                    // InternalGumboParser.g:6085:4: (this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) ) )
                    {
                    // InternalGumboParser.g:6085:4: (this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) ) )
                    // InternalGumboParser.g:6086:5: this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) )
                    {
                    this_MSPM_3=(Token)match(input,RULE_MSPM,FollowSets000.FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_MSPM_3, grammarAccess.getSlangMInterpAccess().getMSPMTerminalRuleCall_3_0_0());
                      				
                    }
                    // InternalGumboParser.g:6090:5: ( (lv_m_4_0= ruleSlangMInterp ) )
                    // InternalGumboParser.g:6091:6: (lv_m_4_0= ruleSlangMInterp )
                    {
                    // InternalGumboParser.g:6091:6: (lv_m_4_0= ruleSlangMInterp )
                    // InternalGumboParser.g:6092:7: lv_m_4_0= ruleSlangMInterp
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
                    // InternalGumboParser.g:6111:4: this_MSPE_5= RULE_MSPE
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
    // InternalGumboParser.g:6120:1: entryRuleOperator returns [String current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final String entryRuleOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperator = null;


        try {
            // InternalGumboParser.g:6120:48: (iv_ruleOperator= ruleOperator EOF )
            // InternalGumboParser.g:6121:2: iv_ruleOperator= ruleOperator EOF
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
    // InternalGumboParser.g:6127:1: ruleOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_OP_0= RULE_OP | this_PlusMinus_1= rulePlusMinus | this_STAR_2= ruleSTAR ) ;
    public final AntlrDatatypeRuleToken ruleOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_OP_0=null;
        AntlrDatatypeRuleToken this_PlusMinus_1 = null;

        AntlrDatatypeRuleToken this_STAR_2 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:6133:2: ( (this_OP_0= RULE_OP | this_PlusMinus_1= rulePlusMinus | this_STAR_2= ruleSTAR ) )
            // InternalGumboParser.g:6134:2: (this_OP_0= RULE_OP | this_PlusMinus_1= rulePlusMinus | this_STAR_2= ruleSTAR )
            {
            // InternalGumboParser.g:6134:2: (this_OP_0= RULE_OP | this_PlusMinus_1= rulePlusMinus | this_STAR_2= ruleSTAR )
            int alt116=3;
            switch ( input.LA(1) ) {
            case RULE_OP:
                {
                alt116=1;
                }
                break;
            case PlusSign:
            case HyphenMinus:
                {
                alt116=2;
                }
                break;
            case Asterisk:
                {
                alt116=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                throw nvae;
            }

            switch (alt116) {
                case 1 :
                    // InternalGumboParser.g:6135:3: this_OP_0= RULE_OP
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
                    // InternalGumboParser.g:6143:3: this_PlusMinus_1= rulePlusMinus
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
                    // InternalGumboParser.g:6154:3: this_STAR_2= ruleSTAR
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
    // InternalGumboParser.g:6168:1: entryRuleContainedPropertyAssociation returns [EObject current=null] : iv_ruleContainedPropertyAssociation= ruleContainedPropertyAssociation EOF ;
    public final EObject entryRuleContainedPropertyAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainedPropertyAssociation = null;


        try {
            // InternalGumboParser.g:6168:69: (iv_ruleContainedPropertyAssociation= ruleContainedPropertyAssociation EOF )
            // InternalGumboParser.g:6169:2: iv_ruleContainedPropertyAssociation= ruleContainedPropertyAssociation EOF
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
    // InternalGumboParser.g:6175:1: ruleContainedPropertyAssociation returns [EObject current=null] : ( ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon ) ;
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
            // InternalGumboParser.g:6181:2: ( ( ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon ) )
            // InternalGumboParser.g:6182:2: ( ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon )
            {
            // InternalGumboParser.g:6182:2: ( ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon )
            // InternalGumboParser.g:6183:3: ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon
            {
            // InternalGumboParser.g:6183:3: ( ( ruleQPREF ) )
            // InternalGumboParser.g:6184:4: ( ruleQPREF )
            {
            // InternalGumboParser.g:6184:4: ( ruleQPREF )
            // InternalGumboParser.g:6185:5: ruleQPREF
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getContainedPropertyAssociationRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getPropertyPropertyCrossReference_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_87);
            ruleQPREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumboParser.g:6199:3: (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) )
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==EqualsSignGreaterThanSign) ) {
                alt117=1;
            }
            else if ( (LA117_0==PlusSignEqualsSignGreaterThanSign) ) {
                alt117=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;
            }
            switch (alt117) {
                case 1 :
                    // InternalGumboParser.g:6200:4: otherlv_1= EqualsSignGreaterThanSign
                    {
                    otherlv_1=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_88); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getContainedPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:6205:4: ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) )
                    {
                    // InternalGumboParser.g:6205:4: ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) )
                    // InternalGumboParser.g:6206:5: (lv_append_2_0= PlusSignEqualsSignGreaterThanSign )
                    {
                    // InternalGumboParser.g:6206:5: (lv_append_2_0= PlusSignEqualsSignGreaterThanSign )
                    // InternalGumboParser.g:6207:6: lv_append_2_0= PlusSignEqualsSignGreaterThanSign
                    {
                    lv_append_2_0=(Token)match(input,PlusSignEqualsSignGreaterThanSign,FollowSets000.FOLLOW_88); if (state.failed) return current;
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

            // InternalGumboParser.g:6220:3: ( (lv_constant_3_0= Constant ) )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==Constant) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // InternalGumboParser.g:6221:4: (lv_constant_3_0= Constant )
                    {
                    // InternalGumboParser.g:6221:4: (lv_constant_3_0= Constant )
                    // InternalGumboParser.g:6222:5: lv_constant_3_0= Constant
                    {
                    lv_constant_3_0=(Token)match(input,Constant,FollowSets000.FOLLOW_88); if (state.failed) return current;
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

            // InternalGumboParser.g:6234:3: ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* )
            // InternalGumboParser.g:6235:4: ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )*
            {
            // InternalGumboParser.g:6235:4: ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) )
            // InternalGumboParser.g:6236:5: (lv_ownedValue_4_0= ruleOptionalModalPropertyValue )
            {
            // InternalGumboParser.g:6236:5: (lv_ownedValue_4_0= ruleOptionalModalPropertyValue )
            // InternalGumboParser.g:6237:6: lv_ownedValue_4_0= ruleOptionalModalPropertyValue
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueOptionalModalPropertyValueParserRuleCall_3_0_0());
              					
            }
            pushFollow(FollowSets000.FOLLOW_89);
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

            // InternalGumboParser.g:6254:4: (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )*
            loop119:
            do {
                int alt119=2;
                int LA119_0 = input.LA(1);

                if ( (LA119_0==Comma) ) {
                    alt119=1;
                }


                switch (alt119) {
            	case 1 :
            	    // InternalGumboParser.g:6255:5: otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) )
            	    {
            	    otherlv_5=(Token)match(input,Comma,FollowSets000.FOLLOW_88); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_5, grammarAccess.getContainedPropertyAssociationAccess().getCommaKeyword_3_1_0());
            	      				
            	    }
            	    // InternalGumboParser.g:6259:5: ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) )
            	    // InternalGumboParser.g:6260:6: (lv_ownedValue_6_0= ruleOptionalModalPropertyValue )
            	    {
            	    // InternalGumboParser.g:6260:6: (lv_ownedValue_6_0= ruleOptionalModalPropertyValue )
            	    // InternalGumboParser.g:6261:7: lv_ownedValue_6_0= ruleOptionalModalPropertyValue
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueOptionalModalPropertyValueParserRuleCall_3_1_1_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_89);
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
            	    break loop119;
                }
            } while (true);


            }

            // InternalGumboParser.g:6280:3: ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==Applies) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // InternalGumboParser.g:6281:4: ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )*
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
                    // InternalGumboParser.g:6288:4: ( (lv_appliesTo_8_0= ruleContainmentPath ) )
                    // InternalGumboParser.g:6289:5: (lv_appliesTo_8_0= ruleContainmentPath )
                    {
                    // InternalGumboParser.g:6289:5: (lv_appliesTo_8_0= ruleContainmentPath )
                    // InternalGumboParser.g:6290:6: lv_appliesTo_8_0= ruleContainmentPath
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToContainmentPathParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_90);
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

                    // InternalGumboParser.g:6307:4: (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )*
                    loop120:
                    do {
                        int alt120=2;
                        int LA120_0 = input.LA(1);

                        if ( (LA120_0==Comma) ) {
                            alt120=1;
                        }


                        switch (alt120) {
                    	case 1 :
                    	    // InternalGumboParser.g:6308:5: otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) )
                    	    {
                    	    otherlv_9=(Token)match(input,Comma,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_9, grammarAccess.getContainedPropertyAssociationAccess().getCommaKeyword_4_2_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:6312:5: ( (lv_appliesTo_10_0= ruleContainmentPath ) )
                    	    // InternalGumboParser.g:6313:6: (lv_appliesTo_10_0= ruleContainmentPath )
                    	    {
                    	    // InternalGumboParser.g:6313:6: (lv_appliesTo_10_0= ruleContainmentPath )
                    	    // InternalGumboParser.g:6314:7: lv_appliesTo_10_0= ruleContainmentPath
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToContainmentPathParserRuleCall_4_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_90);
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
                    	    break loop120;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalGumboParser.g:6333:3: ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==In_1) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // InternalGumboParser.g:6334:4: ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getInBindingKeywordsParserRuleCall_5_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_73);
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
                    // InternalGumboParser.g:6345:4: ( ( ruleQCREF ) )
                    // InternalGumboParser.g:6346:5: ( ruleQCREF )
                    {
                    // InternalGumboParser.g:6346:5: ( ruleQCREF )
                    // InternalGumboParser.g:6347:6: ruleQCREF
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getContainedPropertyAssociationRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getInBindingClassifierCrossReference_5_2_0());
                      					
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
    // InternalGumboParser.g:6374:1: entryRuleContainmentPath returns [EObject current=null] : iv_ruleContainmentPath= ruleContainmentPath EOF ;
    public final EObject entryRuleContainmentPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainmentPath = null;


        try {
            // InternalGumboParser.g:6374:56: (iv_ruleContainmentPath= ruleContainmentPath EOF )
            // InternalGumboParser.g:6375:2: iv_ruleContainmentPath= ruleContainmentPath EOF
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
    // InternalGumboParser.g:6381:1: ruleContainmentPath returns [EObject current=null] : ( (lv_path_0_0= ruleContainmentPathElement ) ) ;
    public final EObject ruleContainmentPath() throws RecognitionException {
        EObject current = null;

        EObject lv_path_0_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:6387:2: ( ( (lv_path_0_0= ruleContainmentPathElement ) ) )
            // InternalGumboParser.g:6388:2: ( (lv_path_0_0= ruleContainmentPathElement ) )
            {
            // InternalGumboParser.g:6388:2: ( (lv_path_0_0= ruleContainmentPathElement ) )
            // InternalGumboParser.g:6389:3: (lv_path_0_0= ruleContainmentPathElement )
            {
            // InternalGumboParser.g:6389:3: (lv_path_0_0= ruleContainmentPathElement )
            // InternalGumboParser.g:6390:4: lv_path_0_0= ruleContainmentPathElement
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
    // InternalGumboParser.g:6410:1: entryRuleOptionalModalPropertyValue returns [EObject current=null] : iv_ruleOptionalModalPropertyValue= ruleOptionalModalPropertyValue EOF ;
    public final EObject entryRuleOptionalModalPropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionalModalPropertyValue = null;


        try {
            // InternalGumboParser.g:6410:67: (iv_ruleOptionalModalPropertyValue= ruleOptionalModalPropertyValue EOF )
            // InternalGumboParser.g:6411:2: iv_ruleOptionalModalPropertyValue= ruleOptionalModalPropertyValue EOF
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
    // InternalGumboParser.g:6417:1: ruleOptionalModalPropertyValue returns [EObject current=null] : ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )? ) ;
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
            // InternalGumboParser.g:6423:2: ( ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )? ) )
            // InternalGumboParser.g:6424:2: ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )? )
            {
            // InternalGumboParser.g:6424:2: ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )? )
            // InternalGumboParser.g:6425:3: ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )?
            {
            // InternalGumboParser.g:6425:3: ( (lv_ownedValue_0_0= rulePropertyExpression ) )
            // InternalGumboParser.g:6426:4: (lv_ownedValue_0_0= rulePropertyExpression )
            {
            // InternalGumboParser.g:6426:4: (lv_ownedValue_0_0= rulePropertyExpression )
            // InternalGumboParser.g:6427:5: lv_ownedValue_0_0= rulePropertyExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOptionalModalPropertyValueAccess().getOwnedValuePropertyExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_91);
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

            // InternalGumboParser.g:6444:3: ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==In_1) ) {
                int LA124_1 = input.LA(2);

                if ( (LA124_1==Modes) ) {
                    alt124=1;
                }
            }
            switch (alt124) {
                case 1 :
                    // InternalGumboParser.g:6445:4: ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getOptionalModalPropertyValueAccess().getInModesKeywordsParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_73);
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
                    // InternalGumboParser.g:6456:4: ( (otherlv_3= RULE_ID ) )
                    // InternalGumboParser.g:6457:5: (otherlv_3= RULE_ID )
                    {
                    // InternalGumboParser.g:6457:5: (otherlv_3= RULE_ID )
                    // InternalGumboParser.g:6458:6: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getOptionalModalPropertyValueRule());
                      						}
                      					
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getOptionalModalPropertyValueAccess().getInModeModeCrossReference_1_2_0());
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:6469:4: (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )*
                    loop123:
                    do {
                        int alt123=2;
                        int LA123_0 = input.LA(1);

                        if ( (LA123_0==Comma) ) {
                            alt123=1;
                        }


                        switch (alt123) {
                    	case 1 :
                    	    // InternalGumboParser.g:6470:5: otherlv_4= Comma ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getOptionalModalPropertyValueAccess().getCommaKeyword_1_3_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:6474:5: ( (otherlv_5= RULE_ID ) )
                    	    // InternalGumboParser.g:6475:6: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalGumboParser.g:6475:6: (otherlv_5= RULE_ID )
                    	    // InternalGumboParser.g:6476:7: otherlv_5= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getOptionalModalPropertyValueRule());
                    	      							}
                    	      						
                    	    }
                    	    otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_36); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_5, grammarAccess.getOptionalModalPropertyValueAccess().getInModeModeCrossReference_1_3_1_0());
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop123;
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
    // InternalGumboParser.g:6497:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalGumboParser.g:6497:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalGumboParser.g:6498:2: iv_rulePropertyValue= rulePropertyValue EOF
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
    // InternalGumboParser.g:6504:1: rulePropertyValue returns [EObject current=null] : ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedValue_0_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:6510:2: ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) )
            // InternalGumboParser.g:6511:2: ( (lv_ownedValue_0_0= rulePropertyExpression ) )
            {
            // InternalGumboParser.g:6511:2: ( (lv_ownedValue_0_0= rulePropertyExpression ) )
            // InternalGumboParser.g:6512:3: (lv_ownedValue_0_0= rulePropertyExpression )
            {
            // InternalGumboParser.g:6512:3: (lv_ownedValue_0_0= rulePropertyExpression )
            // InternalGumboParser.g:6513:4: lv_ownedValue_0_0= rulePropertyExpression
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
    // InternalGumboParser.g:6533:1: entryRulePropertyExpression returns [EObject current=null] : iv_rulePropertyExpression= rulePropertyExpression EOF ;
    public final EObject entryRulePropertyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyExpression = null;


        try {
            // InternalGumboParser.g:6533:59: (iv_rulePropertyExpression= rulePropertyExpression EOF )
            // InternalGumboParser.g:6534:2: iv_rulePropertyExpression= rulePropertyExpression EOF
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
    // InternalGumboParser.g:6540:1: rulePropertyExpression returns [EObject current=null] : (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm ) ;
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
            // InternalGumboParser.g:6546:2: ( (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm ) )
            // InternalGumboParser.g:6547:2: (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm )
            {
            // InternalGumboParser.g:6547:2: (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm )
            int alt125=11;
            alt125 = dfa125.predict(input);
            switch (alt125) {
                case 1 :
                    // InternalGumboParser.g:6548:3: this_RecordTerm_0= ruleRecordTerm
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
                    // InternalGumboParser.g:6557:3: this_ReferenceTerm_1= ruleReferenceTerm
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
                    // InternalGumboParser.g:6566:3: this_ComponentClassifierTerm_2= ruleComponentClassifierTerm
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
                    // InternalGumboParser.g:6575:3: this_ComputedTerm_3= ruleComputedTerm
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
                    // InternalGumboParser.g:6584:3: this_StringTerm_4= ruleStringTerm
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
                    // InternalGumboParser.g:6593:3: this_NumericRangeTerm_5= ruleNumericRangeTerm
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
                    // InternalGumboParser.g:6602:3: this_RealTerm_6= ruleRealTerm
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
                    // InternalGumboParser.g:6611:3: this_IntegerTerm_7= ruleIntegerTerm
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
                    // InternalGumboParser.g:6620:3: this_ListTerm_8= ruleListTerm
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
                    // InternalGumboParser.g:6629:3: this_BooleanLiteral_9= ruleBooleanLiteral
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
                    // InternalGumboParser.g:6638:3: this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm
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
    // InternalGumboParser.g:6650:1: entryRuleLiteralorReferenceTerm returns [EObject current=null] : iv_ruleLiteralorReferenceTerm= ruleLiteralorReferenceTerm EOF ;
    public final EObject entryRuleLiteralorReferenceTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralorReferenceTerm = null;


        try {
            // InternalGumboParser.g:6650:63: (iv_ruleLiteralorReferenceTerm= ruleLiteralorReferenceTerm EOF )
            // InternalGumboParser.g:6651:2: iv_ruleLiteralorReferenceTerm= ruleLiteralorReferenceTerm EOF
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
    // InternalGumboParser.g:6657:1: ruleLiteralorReferenceTerm returns [EObject current=null] : ( ( ruleQPREF ) ) ;
    public final EObject ruleLiteralorReferenceTerm() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalGumboParser.g:6663:2: ( ( ( ruleQPREF ) ) )
            // InternalGumboParser.g:6664:2: ( ( ruleQPREF ) )
            {
            // InternalGumboParser.g:6664:2: ( ( ruleQPREF ) )
            // InternalGumboParser.g:6665:3: ( ruleQPREF )
            {
            // InternalGumboParser.g:6665:3: ( ruleQPREF )
            // InternalGumboParser.g:6666:4: ruleQPREF
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
    // InternalGumboParser.g:6683:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalGumboParser.g:6683:55: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalGumboParser.g:6684:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
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
    // InternalGumboParser.g:6690:1: ruleBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalGumboParser.g:6696:2: ( ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) ) )
            // InternalGumboParser.g:6697:2: ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) )
            {
            // InternalGumboParser.g:6697:2: ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) )
            // InternalGumboParser.g:6698:3: () ( ( (lv_value_1_0= True ) ) | otherlv_2= False )
            {
            // InternalGumboParser.g:6698:3: ()
            // InternalGumboParser.g:6699:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalGumboParser.g:6705:3: ( ( (lv_value_1_0= True ) ) | otherlv_2= False )
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==True) ) {
                alt126=1;
            }
            else if ( (LA126_0==False) ) {
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
                    // InternalGumboParser.g:6706:4: ( (lv_value_1_0= True ) )
                    {
                    // InternalGumboParser.g:6706:4: ( (lv_value_1_0= True ) )
                    // InternalGumboParser.g:6707:5: (lv_value_1_0= True )
                    {
                    // InternalGumboParser.g:6707:5: (lv_value_1_0= True )
                    // InternalGumboParser.g:6708:6: lv_value_1_0= True
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
                    // InternalGumboParser.g:6721:4: otherlv_2= False
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
    // InternalGumboParser.g:6730:1: entryRuleConstantValue returns [EObject current=null] : iv_ruleConstantValue= ruleConstantValue EOF ;
    public final EObject entryRuleConstantValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantValue = null;


        try {
            // InternalGumboParser.g:6730:54: (iv_ruleConstantValue= ruleConstantValue EOF )
            // InternalGumboParser.g:6731:2: iv_ruleConstantValue= ruleConstantValue EOF
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
    // InternalGumboParser.g:6737:1: ruleConstantValue returns [EObject current=null] : ( ( ruleQPREF ) ) ;
    public final EObject ruleConstantValue() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalGumboParser.g:6743:2: ( ( ( ruleQPREF ) ) )
            // InternalGumboParser.g:6744:2: ( ( ruleQPREF ) )
            {
            // InternalGumboParser.g:6744:2: ( ( ruleQPREF ) )
            // InternalGumboParser.g:6745:3: ( ruleQPREF )
            {
            // InternalGumboParser.g:6745:3: ( ruleQPREF )
            // InternalGumboParser.g:6746:4: ruleQPREF
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
    // InternalGumboParser.g:6763:1: entryRuleReferenceTerm returns [EObject current=null] : iv_ruleReferenceTerm= ruleReferenceTerm EOF ;
    public final EObject entryRuleReferenceTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceTerm = null;


        try {
            // InternalGumboParser.g:6763:54: (iv_ruleReferenceTerm= ruleReferenceTerm EOF )
            // InternalGumboParser.g:6764:2: iv_ruleReferenceTerm= ruleReferenceTerm EOF
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
    // InternalGumboParser.g:6770:1: ruleReferenceTerm returns [EObject current=null] : (otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleReferenceTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_path_2_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:6776:2: ( (otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis ) )
            // InternalGumboParser.g:6777:2: (otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis )
            {
            // InternalGumboParser.g:6777:2: (otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis )
            // InternalGumboParser.g:6778:3: otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis
            {
            otherlv_0=(Token)match(input,Reference,FollowSets000.FOLLOW_73); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReferenceTermAccess().getReferenceKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReferenceTermAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGumboParser.g:6786:3: ( (lv_path_2_0= ruleContainmentPathElement ) )
            // InternalGumboParser.g:6787:4: (lv_path_2_0= ruleContainmentPathElement )
            {
            // InternalGumboParser.g:6787:4: (lv_path_2_0= ruleContainmentPathElement )
            // InternalGumboParser.g:6788:5: lv_path_2_0= ruleContainmentPathElement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReferenceTermAccess().getPathContainmentPathElementParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_35);
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
    // InternalGumboParser.g:6813:1: entryRuleRecordTerm returns [EObject current=null] : iv_ruleRecordTerm= ruleRecordTerm EOF ;
    public final EObject entryRuleRecordTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordTerm = null;


        try {
            // InternalGumboParser.g:6813:51: (iv_ruleRecordTerm= ruleRecordTerm EOF )
            // InternalGumboParser.g:6814:2: iv_ruleRecordTerm= ruleRecordTerm EOF
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
    // InternalGumboParser.g:6820:1: ruleRecordTerm returns [EObject current=null] : (otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket ) ;
    public final EObject ruleRecordTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ownedFieldValue_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:6826:2: ( (otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket ) )
            // InternalGumboParser.g:6827:2: (otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket )
            {
            // InternalGumboParser.g:6827:2: (otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket )
            // InternalGumboParser.g:6828:3: otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket
            {
            otherlv_0=(Token)match(input,LeftSquareBracket,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRecordTermAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalGumboParser.g:6832:3: ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+
            int cnt127=0;
            loop127:
            do {
                int alt127=2;
                int LA127_0 = input.LA(1);

                if ( (LA127_0==RULE_ID) ) {
                    alt127=1;
                }


                switch (alt127) {
            	case 1 :
            	    // InternalGumboParser.g:6833:4: (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation )
            	    {
            	    // InternalGumboParser.g:6833:4: (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation )
            	    // InternalGumboParser.g:6834:5: lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRecordTermAccess().getOwnedFieldValueFieldPropertyAssociationParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_92);
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
            	    if ( cnt127 >= 1 ) break loop127;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(127, input);
                        throw eee;
                }
                cnt127++;
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
    // InternalGumboParser.g:6859:1: entryRuleComputedTerm returns [EObject current=null] : iv_ruleComputedTerm= ruleComputedTerm EOF ;
    public final EObject entryRuleComputedTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComputedTerm = null;


        try {
            // InternalGumboParser.g:6859:53: (iv_ruleComputedTerm= ruleComputedTerm EOF )
            // InternalGumboParser.g:6860:2: iv_ruleComputedTerm= ruleComputedTerm EOF
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
    // InternalGumboParser.g:6866:1: ruleComputedTerm returns [EObject current=null] : (otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleComputedTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_function_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalGumboParser.g:6872:2: ( (otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis ) )
            // InternalGumboParser.g:6873:2: (otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis )
            {
            // InternalGumboParser.g:6873:2: (otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis )
            // InternalGumboParser.g:6874:3: otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis
            {
            otherlv_0=(Token)match(input,Compute,FollowSets000.FOLLOW_73); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getComputedTermAccess().getComputeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getComputedTermAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGumboParser.g:6882:3: ( (lv_function_2_0= RULE_ID ) )
            // InternalGumboParser.g:6883:4: (lv_function_2_0= RULE_ID )
            {
            // InternalGumboParser.g:6883:4: (lv_function_2_0= RULE_ID )
            // InternalGumboParser.g:6884:5: lv_function_2_0= RULE_ID
            {
            lv_function_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_35); if (state.failed) return current;
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
    // InternalGumboParser.g:6908:1: entryRuleComponentClassifierTerm returns [EObject current=null] : iv_ruleComponentClassifierTerm= ruleComponentClassifierTerm EOF ;
    public final EObject entryRuleComponentClassifierTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentClassifierTerm = null;


        try {
            // InternalGumboParser.g:6908:64: (iv_ruleComponentClassifierTerm= ruleComponentClassifierTerm EOF )
            // InternalGumboParser.g:6909:2: iv_ruleComponentClassifierTerm= ruleComponentClassifierTerm EOF
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
    // InternalGumboParser.g:6915:1: ruleComponentClassifierTerm returns [EObject current=null] : (otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleComponentClassifierTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalGumboParser.g:6921:2: ( (otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis ) )
            // InternalGumboParser.g:6922:2: (otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis )
            {
            // InternalGumboParser.g:6922:2: (otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis )
            // InternalGumboParser.g:6923:3: otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis
            {
            otherlv_0=(Token)match(input,Classifier,FollowSets000.FOLLOW_73); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getComponentClassifierTermAccess().getClassifierKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getComponentClassifierTermAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGumboParser.g:6931:3: ( ( ruleQCREF ) )
            // InternalGumboParser.g:6932:4: ( ruleQCREF )
            {
            // InternalGumboParser.g:6932:4: ( ruleQCREF )
            // InternalGumboParser.g:6933:5: ruleQCREF
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getComponentClassifierTermRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComponentClassifierTermAccess().getClassifierComponentClassifierCrossReference_2_0());
              				
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
    // InternalGumboParser.g:6955:1: entryRuleListTerm returns [EObject current=null] : iv_ruleListTerm= ruleListTerm EOF ;
    public final EObject entryRuleListTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListTerm = null;


        try {
            // InternalGumboParser.g:6955:49: (iv_ruleListTerm= ruleListTerm EOF )
            // InternalGumboParser.g:6956:2: iv_ruleListTerm= ruleListTerm EOF
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
    // InternalGumboParser.g:6962:1: ruleListTerm returns [EObject current=null] : ( () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis ) ;
    public final EObject ruleListTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedListElement_2_0 = null;

        EObject lv_ownedListElement_4_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:6968:2: ( ( () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis ) )
            // InternalGumboParser.g:6969:2: ( () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis )
            {
            // InternalGumboParser.g:6969:2: ( () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis )
            // InternalGumboParser.g:6970:3: () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis
            {
            // InternalGumboParser.g:6970:3: ()
            // InternalGumboParser.g:6971:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getListTermAccess().getListValueAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_93); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getListTermAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGumboParser.g:6981:3: ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==Classifier||LA129_0==Reference||LA129_0==Compute||LA129_0==False||LA129_0==True||LA129_0==LeftParenthesis||LA129_0==PlusSign||LA129_0==HyphenMinus||LA129_0==LeftSquareBracket||LA129_0==RULE_INTEGER_LIT||LA129_0==RULE_REAL_LIT||(LA129_0>=RULE_STRING && LA129_0<=RULE_ID)) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // InternalGumboParser.g:6982:4: ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )*
                    {
                    // InternalGumboParser.g:6982:4: ( (lv_ownedListElement_2_0= rulePropertyExpression ) )
                    // InternalGumboParser.g:6983:5: (lv_ownedListElement_2_0= rulePropertyExpression )
                    {
                    // InternalGumboParser.g:6983:5: (lv_ownedListElement_2_0= rulePropertyExpression )
                    // InternalGumboParser.g:6984:6: lv_ownedListElement_2_0= rulePropertyExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getListTermAccess().getOwnedListElementPropertyExpressionParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_36);
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

                    // InternalGumboParser.g:7001:4: (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )*
                    loop128:
                    do {
                        int alt128=2;
                        int LA128_0 = input.LA(1);

                        if ( (LA128_0==Comma) ) {
                            alt128=1;
                        }


                        switch (alt128) {
                    	case 1 :
                    	    // InternalGumboParser.g:7002:5: otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FollowSets000.FOLLOW_88); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getListTermAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:7006:5: ( (lv_ownedListElement_4_0= rulePropertyExpression ) )
                    	    // InternalGumboParser.g:7007:6: (lv_ownedListElement_4_0= rulePropertyExpression )
                    	    {
                    	    // InternalGumboParser.g:7007:6: (lv_ownedListElement_4_0= rulePropertyExpression )
                    	    // InternalGumboParser.g:7008:7: lv_ownedListElement_4_0= rulePropertyExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getListTermAccess().getOwnedListElementPropertyExpressionParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_36);
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
                    	    break loop128;
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
    // InternalGumboParser.g:7035:1: entryRuleFieldPropertyAssociation returns [EObject current=null] : iv_ruleFieldPropertyAssociation= ruleFieldPropertyAssociation EOF ;
    public final EObject entryRuleFieldPropertyAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldPropertyAssociation = null;


        try {
            // InternalGumboParser.g:7035:65: (iv_ruleFieldPropertyAssociation= ruleFieldPropertyAssociation EOF )
            // InternalGumboParser.g:7036:2: iv_ruleFieldPropertyAssociation= ruleFieldPropertyAssociation EOF
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
    // InternalGumboParser.g:7042:1: ruleFieldPropertyAssociation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon ) ;
    public final EObject ruleFieldPropertyAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedValue_2_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:7048:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon ) )
            // InternalGumboParser.g:7049:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon )
            {
            // InternalGumboParser.g:7049:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon )
            // InternalGumboParser.g:7050:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon
            {
            // InternalGumboParser.g:7050:3: ( (otherlv_0= RULE_ID ) )
            // InternalGumboParser.g:7051:4: (otherlv_0= RULE_ID )
            {
            // InternalGumboParser.g:7051:4: (otherlv_0= RULE_ID )
            // InternalGumboParser.g:7052:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFieldPropertyAssociationRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getFieldPropertyAssociationAccess().getPropertyBasicPropertyCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_88); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFieldPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_1());
              		
            }
            // InternalGumboParser.g:7067:3: ( (lv_ownedValue_2_0= rulePropertyExpression ) )
            // InternalGumboParser.g:7068:4: (lv_ownedValue_2_0= rulePropertyExpression )
            {
            // InternalGumboParser.g:7068:4: (lv_ownedValue_2_0= rulePropertyExpression )
            // InternalGumboParser.g:7069:5: lv_ownedValue_2_0= rulePropertyExpression
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
    // InternalGumboParser.g:7094:1: entryRuleContainmentPathElement returns [EObject current=null] : iv_ruleContainmentPathElement= ruleContainmentPathElement EOF ;
    public final EObject entryRuleContainmentPathElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainmentPathElement = null;


        try {
            // InternalGumboParser.g:7094:63: (iv_ruleContainmentPathElement= ruleContainmentPathElement EOF )
            // InternalGumboParser.g:7095:2: iv_ruleContainmentPathElement= ruleContainmentPathElement EOF
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
    // InternalGumboParser.g:7101:1: ruleContainmentPathElement returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )? ) ;
    public final EObject ruleContainmentPathElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_arrayRange_1_0 = null;

        EObject lv_path_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:7107:2: ( ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )? ) )
            // InternalGumboParser.g:7108:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )? )
            {
            // InternalGumboParser.g:7108:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )? )
            // InternalGumboParser.g:7109:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )?
            {
            // InternalGumboParser.g:7109:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* )
            // InternalGumboParser.g:7110:4: ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )*
            {
            // InternalGumboParser.g:7110:4: ( (otherlv_0= RULE_ID ) )
            // InternalGumboParser.g:7111:5: (otherlv_0= RULE_ID )
            {
            // InternalGumboParser.g:7111:5: (otherlv_0= RULE_ID )
            // InternalGumboParser.g:7112:6: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElement(grammarAccess.getContainmentPathElementRule());
              						}
              					
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						newLeafNode(otherlv_0, grammarAccess.getContainmentPathElementAccess().getNamedElementNamedElementCrossReference_0_0_0());
              					
            }

            }


            }

            // InternalGumboParser.g:7123:4: ( (lv_arrayRange_1_0= ruleArrayRange ) )*
            loop130:
            do {
                int alt130=2;
                int LA130_0 = input.LA(1);

                if ( (LA130_0==LeftSquareBracket) ) {
                    alt130=1;
                }


                switch (alt130) {
            	case 1 :
            	    // InternalGumboParser.g:7124:5: (lv_arrayRange_1_0= ruleArrayRange )
            	    {
            	    // InternalGumboParser.g:7124:5: (lv_arrayRange_1_0= ruleArrayRange )
            	    // InternalGumboParser.g:7125:6: lv_arrayRange_1_0= ruleArrayRange
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getContainmentPathElementAccess().getArrayRangeArrayRangeParserRuleCall_0_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_26);
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
            	    break loop130;
                }
            } while (true);


            }

            // InternalGumboParser.g:7143:3: (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==FullStop) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // InternalGumboParser.g:7144:4: otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) )
                    {
                    otherlv_2=(Token)match(input,FullStop,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getContainmentPathElementAccess().getFullStopKeyword_1_0());
                      			
                    }
                    // InternalGumboParser.g:7148:4: ( (lv_path_3_0= ruleContainmentPathElement ) )
                    // InternalGumboParser.g:7149:5: (lv_path_3_0= ruleContainmentPathElement )
                    {
                    // InternalGumboParser.g:7149:5: (lv_path_3_0= ruleContainmentPathElement )
                    // InternalGumboParser.g:7150:6: lv_path_3_0= ruleContainmentPathElement
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
    // InternalGumboParser.g:7172:1: entryRulePlusMinus returns [String current=null] : iv_rulePlusMinus= rulePlusMinus EOF ;
    public final String entryRulePlusMinus() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePlusMinus = null;


        try {
            // InternalGumboParser.g:7172:49: (iv_rulePlusMinus= rulePlusMinus EOF )
            // InternalGumboParser.g:7173:2: iv_rulePlusMinus= rulePlusMinus EOF
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
    // InternalGumboParser.g:7179:1: rulePlusMinus returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= PlusSign | kw= HyphenMinus ) ;
    public final AntlrDatatypeRuleToken rulePlusMinus() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumboParser.g:7185:2: ( (kw= PlusSign | kw= HyphenMinus ) )
            // InternalGumboParser.g:7186:2: (kw= PlusSign | kw= HyphenMinus )
            {
            // InternalGumboParser.g:7186:2: (kw= PlusSign | kw= HyphenMinus )
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==PlusSign) ) {
                alt132=1;
            }
            else if ( (LA132_0==HyphenMinus) ) {
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
                    // InternalGumboParser.g:7187:3: kw= PlusSign
                    {
                    kw=(Token)match(input,PlusSign,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPlusMinusAccess().getPlusSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:7193:3: kw= HyphenMinus
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
    // InternalGumboParser.g:7202:1: entryRuleStringTerm returns [EObject current=null] : iv_ruleStringTerm= ruleStringTerm EOF ;
    public final EObject entryRuleStringTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringTerm = null;


        try {
            // InternalGumboParser.g:7202:51: (iv_ruleStringTerm= ruleStringTerm EOF )
            // InternalGumboParser.g:7203:2: iv_ruleStringTerm= ruleStringTerm EOF
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
    // InternalGumboParser.g:7209:1: ruleStringTerm returns [EObject current=null] : ( (lv_value_0_0= ruleNoQuoteString ) ) ;
    public final EObject ruleStringTerm() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:7215:2: ( ( (lv_value_0_0= ruleNoQuoteString ) ) )
            // InternalGumboParser.g:7216:2: ( (lv_value_0_0= ruleNoQuoteString ) )
            {
            // InternalGumboParser.g:7216:2: ( (lv_value_0_0= ruleNoQuoteString ) )
            // InternalGumboParser.g:7217:3: (lv_value_0_0= ruleNoQuoteString )
            {
            // InternalGumboParser.g:7217:3: (lv_value_0_0= ruleNoQuoteString )
            // InternalGumboParser.g:7218:4: lv_value_0_0= ruleNoQuoteString
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
    // InternalGumboParser.g:7238:1: entryRuleNoQuoteString returns [String current=null] : iv_ruleNoQuoteString= ruleNoQuoteString EOF ;
    public final String entryRuleNoQuoteString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNoQuoteString = null;


        try {
            // InternalGumboParser.g:7238:53: (iv_ruleNoQuoteString= ruleNoQuoteString EOF )
            // InternalGumboParser.g:7239:2: iv_ruleNoQuoteString= ruleNoQuoteString EOF
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
    // InternalGumboParser.g:7245:1: ruleNoQuoteString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleNoQuoteString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalGumboParser.g:7251:2: (this_STRING_0= RULE_STRING )
            // InternalGumboParser.g:7252:2: this_STRING_0= RULE_STRING
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
    // InternalGumboParser.g:7262:1: entryRuleArrayRange returns [EObject current=null] : iv_ruleArrayRange= ruleArrayRange EOF ;
    public final EObject entryRuleArrayRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayRange = null;


        try {
            // InternalGumboParser.g:7262:51: (iv_ruleArrayRange= ruleArrayRange EOF )
            // InternalGumboParser.g:7263:2: iv_ruleArrayRange= ruleArrayRange EOF
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
    // InternalGumboParser.g:7269:1: ruleArrayRange returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleArrayRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_lowerBound_2_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_4_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:7275:2: ( ( () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket ) )
            // InternalGumboParser.g:7276:2: ( () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket )
            {
            // InternalGumboParser.g:7276:2: ( () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket )
            // InternalGumboParser.g:7277:3: () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket
            {
            // InternalGumboParser.g:7277:3: ()
            // InternalGumboParser.g:7278:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getArrayRangeAccess().getArrayRangeAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FollowSets000.FOLLOW_94); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getArrayRangeAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalGumboParser.g:7288:3: ( (lv_lowerBound_2_0= ruleINTVALUE ) )
            // InternalGumboParser.g:7289:4: (lv_lowerBound_2_0= ruleINTVALUE )
            {
            // InternalGumboParser.g:7289:4: (lv_lowerBound_2_0= ruleINTVALUE )
            // InternalGumboParser.g:7290:5: lv_lowerBound_2_0= ruleINTVALUE
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArrayRangeAccess().getLowerBoundINTVALUEParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_95);
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

            // InternalGumboParser.g:7307:3: (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==FullStopFullStop) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // InternalGumboParser.g:7308:4: otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) )
                    {
                    otherlv_3=(Token)match(input,FullStopFullStop,FollowSets000.FOLLOW_94); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getArrayRangeAccess().getFullStopFullStopKeyword_3_0());
                      			
                    }
                    // InternalGumboParser.g:7312:4: ( (lv_upperBound_4_0= ruleINTVALUE ) )
                    // InternalGumboParser.g:7313:5: (lv_upperBound_4_0= ruleINTVALUE )
                    {
                    // InternalGumboParser.g:7313:5: (lv_upperBound_4_0= ruleINTVALUE )
                    // InternalGumboParser.g:7314:6: lv_upperBound_4_0= ruleINTVALUE
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getArrayRangeAccess().getUpperBoundINTVALUEParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_96);
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
    // InternalGumboParser.g:7340:1: entryRuleSignedConstant returns [EObject current=null] : iv_ruleSignedConstant= ruleSignedConstant EOF ;
    public final EObject entryRuleSignedConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignedConstant = null;


        try {
            // InternalGumboParser.g:7340:55: (iv_ruleSignedConstant= ruleSignedConstant EOF )
            // InternalGumboParser.g:7341:2: iv_ruleSignedConstant= ruleSignedConstant EOF
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
    // InternalGumboParser.g:7347:1: ruleSignedConstant returns [EObject current=null] : ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) ) ;
    public final EObject ruleSignedConstant() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_ownedPropertyExpression_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:7353:2: ( ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) ) )
            // InternalGumboParser.g:7354:2: ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) )
            {
            // InternalGumboParser.g:7354:2: ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) )
            // InternalGumboParser.g:7355:3: ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) )
            {
            // InternalGumboParser.g:7355:3: ( (lv_op_0_0= rulePlusMinus ) )
            // InternalGumboParser.g:7356:4: (lv_op_0_0= rulePlusMinus )
            {
            // InternalGumboParser.g:7356:4: (lv_op_0_0= rulePlusMinus )
            // InternalGumboParser.g:7357:5: lv_op_0_0= rulePlusMinus
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSignedConstantAccess().getOpPlusMinusParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_97);
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

            // InternalGumboParser.g:7374:3: ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) )
            // InternalGumboParser.g:7375:4: (lv_ownedPropertyExpression_1_0= ruleConstantValue )
            {
            // InternalGumboParser.g:7375:4: (lv_ownedPropertyExpression_1_0= ruleConstantValue )
            // InternalGumboParser.g:7376:5: lv_ownedPropertyExpression_1_0= ruleConstantValue
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
    // InternalGumboParser.g:7397:1: entryRuleIntegerTerm returns [EObject current=null] : iv_ruleIntegerTerm= ruleIntegerTerm EOF ;
    public final EObject entryRuleIntegerTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerTerm = null;


        try {
            // InternalGumboParser.g:7397:52: (iv_ruleIntegerTerm= ruleIntegerTerm EOF )
            // InternalGumboParser.g:7398:2: iv_ruleIntegerTerm= ruleIntegerTerm EOF
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
    // InternalGumboParser.g:7404:1: ruleIntegerTerm returns [EObject current=null] : ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? ) ;
    public final EObject ruleIntegerTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:7410:2: ( ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? ) )
            // InternalGumboParser.g:7411:2: ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? )
            {
            // InternalGumboParser.g:7411:2: ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? )
            // InternalGumboParser.g:7412:3: ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )?
            {
            // InternalGumboParser.g:7412:3: ( (lv_value_0_0= ruleSignedInt ) )
            // InternalGumboParser.g:7413:4: (lv_value_0_0= ruleSignedInt )
            {
            // InternalGumboParser.g:7413:4: (lv_value_0_0= ruleSignedInt )
            // InternalGumboParser.g:7414:5: lv_value_0_0= ruleSignedInt
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

            // InternalGumboParser.g:7431:3: ( (otherlv_1= RULE_ID ) )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==RULE_ID) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // InternalGumboParser.g:7432:4: (otherlv_1= RULE_ID )
                    {
                    // InternalGumboParser.g:7432:4: (otherlv_1= RULE_ID )
                    // InternalGumboParser.g:7433:5: otherlv_1= RULE_ID
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
    // InternalGumboParser.g:7448:1: entryRuleSignedInt returns [String current=null] : iv_ruleSignedInt= ruleSignedInt EOF ;
    public final String entryRuleSignedInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedInt = null;


        try {
            // InternalGumboParser.g:7448:49: (iv_ruleSignedInt= ruleSignedInt EOF )
            // InternalGumboParser.g:7449:2: iv_ruleSignedInt= ruleSignedInt EOF
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
    // InternalGumboParser.g:7455:1: ruleSignedInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT ) ;
    public final AntlrDatatypeRuleToken ruleSignedInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INTEGER_LIT_2=null;


        	enterRule();

        try {
            // InternalGumboParser.g:7461:2: ( ( (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT ) )
            // InternalGumboParser.g:7462:2: ( (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT )
            {
            // InternalGumboParser.g:7462:2: ( (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT )
            // InternalGumboParser.g:7463:3: (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT
            {
            // InternalGumboParser.g:7463:3: (kw= PlusSign | kw= HyphenMinus )?
            int alt135=3;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==PlusSign) ) {
                alt135=1;
            }
            else if ( (LA135_0==HyphenMinus) ) {
                alt135=2;
            }
            switch (alt135) {
                case 1 :
                    // InternalGumboParser.g:7464:4: kw= PlusSign
                    {
                    kw=(Token)match(input,PlusSign,FollowSets000.FOLLOW_94); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSignedIntAccess().getPlusSignKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:7470:4: kw= HyphenMinus
                    {
                    kw=(Token)match(input,HyphenMinus,FollowSets000.FOLLOW_94); if (state.failed) return current;
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
    // InternalGumboParser.g:7487:1: entryRuleRealTerm returns [EObject current=null] : iv_ruleRealTerm= ruleRealTerm EOF ;
    public final EObject entryRuleRealTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealTerm = null;


        try {
            // InternalGumboParser.g:7487:49: (iv_ruleRealTerm= ruleRealTerm EOF )
            // InternalGumboParser.g:7488:2: iv_ruleRealTerm= ruleRealTerm EOF
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
    // InternalGumboParser.g:7494:1: ruleRealTerm returns [EObject current=null] : ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? ) ;
    public final EObject ruleRealTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:7500:2: ( ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? ) )
            // InternalGumboParser.g:7501:2: ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? )
            {
            // InternalGumboParser.g:7501:2: ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? )
            // InternalGumboParser.g:7502:3: ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )?
            {
            // InternalGumboParser.g:7502:3: ( (lv_value_0_0= ruleSignedReal ) )
            // InternalGumboParser.g:7503:4: (lv_value_0_0= ruleSignedReal )
            {
            // InternalGumboParser.g:7503:4: (lv_value_0_0= ruleSignedReal )
            // InternalGumboParser.g:7504:5: lv_value_0_0= ruleSignedReal
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

            // InternalGumboParser.g:7521:3: ( (otherlv_1= RULE_ID ) )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==RULE_ID) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // InternalGumboParser.g:7522:4: (otherlv_1= RULE_ID )
                    {
                    // InternalGumboParser.g:7522:4: (otherlv_1= RULE_ID )
                    // InternalGumboParser.g:7523:5: otherlv_1= RULE_ID
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
    // InternalGumboParser.g:7538:1: entryRuleSignedReal returns [String current=null] : iv_ruleSignedReal= ruleSignedReal EOF ;
    public final String entryRuleSignedReal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedReal = null;


        try {
            // InternalGumboParser.g:7538:50: (iv_ruleSignedReal= ruleSignedReal EOF )
            // InternalGumboParser.g:7539:2: iv_ruleSignedReal= ruleSignedReal EOF
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
    // InternalGumboParser.g:7545:1: ruleSignedReal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT ) ;
    public final AntlrDatatypeRuleToken ruleSignedReal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_REAL_LIT_2=null;


        	enterRule();

        try {
            // InternalGumboParser.g:7551:2: ( ( (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT ) )
            // InternalGumboParser.g:7552:2: ( (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT )
            {
            // InternalGumboParser.g:7552:2: ( (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT )
            // InternalGumboParser.g:7553:3: (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT
            {
            // InternalGumboParser.g:7553:3: (kw= PlusSign | kw= HyphenMinus )?
            int alt137=3;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==PlusSign) ) {
                alt137=1;
            }
            else if ( (LA137_0==HyphenMinus) ) {
                alt137=2;
            }
            switch (alt137) {
                case 1 :
                    // InternalGumboParser.g:7554:4: kw= PlusSign
                    {
                    kw=(Token)match(input,PlusSign,FollowSets000.FOLLOW_98); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSignedRealAccess().getPlusSignKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:7560:4: kw= HyphenMinus
                    {
                    kw=(Token)match(input,HyphenMinus,FollowSets000.FOLLOW_98); if (state.failed) return current;
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
    // InternalGumboParser.g:7577:1: entryRuleNumericRangeTerm returns [EObject current=null] : iv_ruleNumericRangeTerm= ruleNumericRangeTerm EOF ;
    public final EObject entryRuleNumericRangeTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericRangeTerm = null;


        try {
            // InternalGumboParser.g:7577:57: (iv_ruleNumericRangeTerm= ruleNumericRangeTerm EOF )
            // InternalGumboParser.g:7578:2: iv_ruleNumericRangeTerm= ruleNumericRangeTerm EOF
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
    // InternalGumboParser.g:7584:1: ruleNumericRangeTerm returns [EObject current=null] : ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )? ) ;
    public final EObject ruleNumericRangeTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_minimum_0_0 = null;

        EObject lv_maximum_2_0 = null;

        EObject lv_delta_4_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:7590:2: ( ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )? ) )
            // InternalGumboParser.g:7591:2: ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )? )
            {
            // InternalGumboParser.g:7591:2: ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )? )
            // InternalGumboParser.g:7592:3: ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )?
            {
            // InternalGumboParser.g:7592:3: ( (lv_minimum_0_0= ruleNumAlt ) )
            // InternalGumboParser.g:7593:4: (lv_minimum_0_0= ruleNumAlt )
            {
            // InternalGumboParser.g:7593:4: (lv_minimum_0_0= ruleNumAlt )
            // InternalGumboParser.g:7594:5: lv_minimum_0_0= ruleNumAlt
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNumericRangeTermAccess().getMinimumNumAltParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_99);
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

            otherlv_1=(Token)match(input,FullStopFullStop,FollowSets000.FOLLOW_97); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNumericRangeTermAccess().getFullStopFullStopKeyword_1());
              		
            }
            // InternalGumboParser.g:7615:3: ( (lv_maximum_2_0= ruleNumAlt ) )
            // InternalGumboParser.g:7616:4: (lv_maximum_2_0= ruleNumAlt )
            {
            // InternalGumboParser.g:7616:4: (lv_maximum_2_0= ruleNumAlt )
            // InternalGumboParser.g:7617:5: lv_maximum_2_0= ruleNumAlt
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNumericRangeTermAccess().getMaximumNumAltParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_100);
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

            // InternalGumboParser.g:7634:3: (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==Delta) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // InternalGumboParser.g:7635:4: otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) )
                    {
                    otherlv_3=(Token)match(input,Delta,FollowSets000.FOLLOW_97); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getNumericRangeTermAccess().getDeltaKeyword_3_0());
                      			
                    }
                    // InternalGumboParser.g:7639:4: ( (lv_delta_4_0= ruleNumAlt ) )
                    // InternalGumboParser.g:7640:5: (lv_delta_4_0= ruleNumAlt )
                    {
                    // InternalGumboParser.g:7640:5: (lv_delta_4_0= ruleNumAlt )
                    // InternalGumboParser.g:7641:6: lv_delta_4_0= ruleNumAlt
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
    // InternalGumboParser.g:7663:1: entryRuleNumAlt returns [EObject current=null] : iv_ruleNumAlt= ruleNumAlt EOF ;
    public final EObject entryRuleNumAlt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumAlt = null;


        try {
            // InternalGumboParser.g:7663:47: (iv_ruleNumAlt= ruleNumAlt EOF )
            // InternalGumboParser.g:7664:2: iv_ruleNumAlt= ruleNumAlt EOF
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
    // InternalGumboParser.g:7670:1: ruleNumAlt returns [EObject current=null] : (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue ) ;
    public final EObject ruleNumAlt() throws RecognitionException {
        EObject current = null;

        EObject this_RealTerm_0 = null;

        EObject this_IntegerTerm_1 = null;

        EObject this_SignedConstant_2 = null;

        EObject this_ConstantValue_3 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:7676:2: ( (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue ) )
            // InternalGumboParser.g:7677:2: (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue )
            {
            // InternalGumboParser.g:7677:2: (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue )
            int alt139=4;
            switch ( input.LA(1) ) {
            case PlusSign:
                {
                switch ( input.LA(2) ) {
                case RULE_REAL_LIT:
                    {
                    alt139=1;
                    }
                    break;
                case RULE_INTEGER_LIT:
                    {
                    alt139=2;
                    }
                    break;
                case RULE_ID:
                    {
                    alt139=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 139, 1, input);

                    throw nvae;
                }

                }
                break;
            case HyphenMinus:
                {
                switch ( input.LA(2) ) {
                case RULE_ID:
                    {
                    alt139=3;
                    }
                    break;
                case RULE_REAL_LIT:
                    {
                    alt139=1;
                    }
                    break;
                case RULE_INTEGER_LIT:
                    {
                    alt139=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 139, 2, input);

                    throw nvae;
                }

                }
                break;
            case RULE_REAL_LIT:
                {
                alt139=1;
                }
                break;
            case RULE_INTEGER_LIT:
                {
                alt139=2;
                }
                break;
            case RULE_ID:
                {
                alt139=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 139, 0, input);

                throw nvae;
            }

            switch (alt139) {
                case 1 :
                    // InternalGumboParser.g:7678:3: this_RealTerm_0= ruleRealTerm
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
                    // InternalGumboParser.g:7687:3: this_IntegerTerm_1= ruleIntegerTerm
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
                    // InternalGumboParser.g:7696:3: this_SignedConstant_2= ruleSignedConstant
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
                    // InternalGumboParser.g:7705:3: this_ConstantValue_3= ruleConstantValue
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
    // InternalGumboParser.g:7717:1: entryRuleAppliesToKeywords returns [String current=null] : iv_ruleAppliesToKeywords= ruleAppliesToKeywords EOF ;
    public final String entryRuleAppliesToKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAppliesToKeywords = null;


        try {
            // InternalGumboParser.g:7717:57: (iv_ruleAppliesToKeywords= ruleAppliesToKeywords EOF )
            // InternalGumboParser.g:7718:2: iv_ruleAppliesToKeywords= ruleAppliesToKeywords EOF
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
    // InternalGumboParser.g:7724:1: ruleAppliesToKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Applies kw= To ) ;
    public final AntlrDatatypeRuleToken ruleAppliesToKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumboParser.g:7730:2: ( (kw= Applies kw= To ) )
            // InternalGumboParser.g:7731:2: (kw= Applies kw= To )
            {
            // InternalGumboParser.g:7731:2: (kw= Applies kw= To )
            // InternalGumboParser.g:7732:3: kw= Applies kw= To
            {
            kw=(Token)match(input,Applies,FollowSets000.FOLLOW_101); if (state.failed) return current;
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
    // InternalGumboParser.g:7746:1: entryRuleInBindingKeywords returns [String current=null] : iv_ruleInBindingKeywords= ruleInBindingKeywords EOF ;
    public final String entryRuleInBindingKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInBindingKeywords = null;


        try {
            // InternalGumboParser.g:7746:57: (iv_ruleInBindingKeywords= ruleInBindingKeywords EOF )
            // InternalGumboParser.g:7747:2: iv_ruleInBindingKeywords= ruleInBindingKeywords EOF
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
    // InternalGumboParser.g:7753:1: ruleInBindingKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= In_1 kw= Binding ) ;
    public final AntlrDatatypeRuleToken ruleInBindingKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumboParser.g:7759:2: ( (kw= In_1 kw= Binding ) )
            // InternalGumboParser.g:7760:2: (kw= In_1 kw= Binding )
            {
            // InternalGumboParser.g:7760:2: (kw= In_1 kw= Binding )
            // InternalGumboParser.g:7761:3: kw= In_1 kw= Binding
            {
            kw=(Token)match(input,In_1,FollowSets000.FOLLOW_102); if (state.failed) return current;
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
    // InternalGumboParser.g:7775:1: entryRuleInModesKeywords returns [String current=null] : iv_ruleInModesKeywords= ruleInModesKeywords EOF ;
    public final String entryRuleInModesKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInModesKeywords = null;


        try {
            // InternalGumboParser.g:7775:55: (iv_ruleInModesKeywords= ruleInModesKeywords EOF )
            // InternalGumboParser.g:7776:2: iv_ruleInModesKeywords= ruleInModesKeywords EOF
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
    // InternalGumboParser.g:7782:1: ruleInModesKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= In_1 kw= Modes ) ;
    public final AntlrDatatypeRuleToken ruleInModesKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumboParser.g:7788:2: ( (kw= In_1 kw= Modes ) )
            // InternalGumboParser.g:7789:2: (kw= In_1 kw= Modes )
            {
            // InternalGumboParser.g:7789:2: (kw= In_1 kw= Modes )
            // InternalGumboParser.g:7790:3: kw= In_1 kw= Modes
            {
            kw=(Token)match(input,In_1,FollowSets000.FOLLOW_103); if (state.failed) return current;
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
    // InternalGumboParser.g:7804:1: entryRuleINTVALUE returns [String current=null] : iv_ruleINTVALUE= ruleINTVALUE EOF ;
    public final String entryRuleINTVALUE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTVALUE = null;


        try {
            // InternalGumboParser.g:7804:48: (iv_ruleINTVALUE= ruleINTVALUE EOF )
            // InternalGumboParser.g:7805:2: iv_ruleINTVALUE= ruleINTVALUE EOF
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
    // InternalGumboParser.g:7811:1: ruleINTVALUE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INTEGER_LIT_0= RULE_INTEGER_LIT ;
    public final AntlrDatatypeRuleToken ruleINTVALUE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INTEGER_LIT_0=null;


        	enterRule();

        try {
            // InternalGumboParser.g:7817:2: (this_INTEGER_LIT_0= RULE_INTEGER_LIT )
            // InternalGumboParser.g:7818:2: this_INTEGER_LIT_0= RULE_INTEGER_LIT
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
    // InternalGumboParser.g:7828:1: entryRuleQPREF returns [String current=null] : iv_ruleQPREF= ruleQPREF EOF ;
    public final String entryRuleQPREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQPREF = null;


        try {
            // InternalGumboParser.g:7828:45: (iv_ruleQPREF= ruleQPREF EOF )
            // InternalGumboParser.g:7829:2: iv_ruleQPREF= ruleQPREF EOF
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
    // InternalGumboParser.g:7835:1: ruleQPREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleQPREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalGumboParser.g:7841:2: ( (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )? ) )
            // InternalGumboParser.g:7842:2: (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )? )
            {
            // InternalGumboParser.g:7842:2: (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )? )
            // InternalGumboParser.g:7843:3: this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_104); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQPREFAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalGumboParser.g:7850:3: (kw= ColonColon this_ID_2= RULE_ID )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==ColonColon) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // InternalGumboParser.g:7851:4: kw= ColonColon this_ID_2= RULE_ID
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
    // InternalGumboParser.g:7868:1: entryRuleQCREF returns [String current=null] : iv_ruleQCREF= ruleQCREF EOF ;
    public final String entryRuleQCREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQCREF = null;


        try {
            // InternalGumboParser.g:7868:45: (iv_ruleQCREF= ruleQCREF EOF )
            // InternalGumboParser.g:7869:2: iv_ruleQCREF= ruleQCREF EOF
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
    // InternalGumboParser.g:7875:1: ruleQCREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleQCREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;


        	enterRule();

        try {
            // InternalGumboParser.g:7881:2: ( ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? ) )
            // InternalGumboParser.g:7882:2: ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? )
            {
            // InternalGumboParser.g:7882:2: ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? )
            // InternalGumboParser.g:7883:3: (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )?
            {
            // InternalGumboParser.g:7883:3: (this_ID_0= RULE_ID kw= ColonColon )*
            loop141:
            do {
                int alt141=2;
                int LA141_0 = input.LA(1);

                if ( (LA141_0==RULE_ID) ) {
                    int LA141_1 = input.LA(2);

                    if ( (LA141_1==ColonColon) ) {
                        alt141=1;
                    }


                }


                switch (alt141) {
            	case 1 :
            	    // InternalGumboParser.g:7884:4: this_ID_0= RULE_ID kw= ColonColon
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_105); if (state.failed) return current;
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
            	    break loop141;
                }
            } while (true);

            this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_2, grammarAccess.getQCREFAccess().getIDTerminalRuleCall_1());
              		
            }
            // InternalGumboParser.g:7904:3: (kw= FullStop this_ID_4= RULE_ID )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==FullStop) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // InternalGumboParser.g:7905:4: kw= FullStop this_ID_4= RULE_ID
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
    // InternalGumboParser.g:7922:1: entryRuleSTAR returns [String current=null] : iv_ruleSTAR= ruleSTAR EOF ;
    public final String entryRuleSTAR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSTAR = null;


        try {
            // InternalGumboParser.g:7922:44: (iv_ruleSTAR= ruleSTAR EOF )
            // InternalGumboParser.g:7923:2: iv_ruleSTAR= ruleSTAR EOF
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
    // InternalGumboParser.g:7929:1: ruleSTAR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= Asterisk ;
    public final AntlrDatatypeRuleToken ruleSTAR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumboParser.g:7935:2: (kw= Asterisk )
            // InternalGumboParser.g:7936:2: kw= Asterisk
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
        // InternalGumboParser.g:4378:5: ( ( () In_1 LeftParenthesis ) )
        // InternalGumboParser.g:4378:6: ( () In_1 LeftParenthesis )
        {
        // InternalGumboParser.g:4378:6: ( () In_1 LeftParenthesis )
        // InternalGumboParser.g:4379:6: () In_1 LeftParenthesis
        {
        // InternalGumboParser.g:4379:6: ()
        // InternalGumboParser.g:4380:6: 
        {
        }

        match(input,In_1,FollowSets000.FOLLOW_73); if (state.failed) return ;
        match(input,LeftParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalGumboParser

    // $ANTLR start synpred2_InternalGumboParser
    public final void synpred2_InternalGumboParser_fragment() throws RecognitionException {   
        // InternalGumboParser.g:4424:5: ( ( () Enum LeftParenthesis ) )
        // InternalGumboParser.g:4424:6: ( () Enum LeftParenthesis )
        {
        // InternalGumboParser.g:4424:6: ( () Enum LeftParenthesis )
        // InternalGumboParser.g:4425:6: () Enum LeftParenthesis
        {
        // InternalGumboParser.g:4425:6: ()
        // InternalGumboParser.g:4426:6: 
        {
        }

        match(input,Enum,FollowSets000.FOLLOW_73); if (state.failed) return ;
        match(input,LeftParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalGumboParser

    // $ANTLR start synpred3_InternalGumboParser
    public final void synpred3_InternalGumboParser_fragment() throws RecognitionException {   
        // InternalGumboParser.g:4493:5: ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )
        // InternalGumboParser.g:4493:6: ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign )
        {
        // InternalGumboParser.g:4493:6: ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign )
        // InternalGumboParser.g:4494:6: () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign
        {
        // InternalGumboParser.g:4494:6: ()
        // InternalGumboParser.g:4495:6: 
        {
        }

        // InternalGumboParser.g:4496:6: ( ( ruleDataElement ) )
        // InternalGumboParser.g:4497:7: ( ruleDataElement )
        {
        // InternalGumboParser.g:4497:7: ( ruleDataElement )
        // InternalGumboParser.g:4498:8: ruleDataElement
        {
        pushFollow(FollowSets000.FOLLOW_50);
        ruleDataElement();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,LeftCurlyBracket,FollowSets000.FOLLOW_10); if (state.failed) return ;
        // InternalGumboParser.g:4502:6: ( ( RULE_ID ) )
        // InternalGumboParser.g:4503:7: ( RULE_ID )
        {
        // InternalGumboParser.g:4503:7: ( RULE_ID )
        // InternalGumboParser.g:4504:8: RULE_ID
        {
        match(input,RULE_ID,FollowSets000.FOLLOW_75); if (state.failed) return ;

        }


        }

        match(input,EqualsSign,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalGumboParser

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


    protected DFA97 dfa97 = new DFA97(this);
    protected DFA125 dfa125 = new DFA125(this);
    static final String dfa_1s = "\20\uffff";
    static final String dfa_2s = "\5\uffff\1\14\7\uffff\1\14\2\uffff";
    static final String dfa_3s = "\1\47\4\uffff\1\12\3\uffff\1\155\1\26\2\uffff\1\12\1\26\1\uffff";
    static final String dfa_4s = "\1\155\4\uffff\1\155\3\uffff\2\155\2\uffff\2\155\1\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\7\1\10\1\11\2\uffff\1\5\1\6\2\uffff\1\5";
    static final String dfa_6s = "\1\2\4\uffff\1\1\10\uffff\1\0\1\uffff}>";
    static final String[] dfa_7s = {
            "\1\4\6\uffff\1\7\14\uffff\1\3\1\uffff\1\6\12\uffff\2\1\3\uffff\1\10\4\uffff\2\1\2\uffff\1\2\1\uffff\2\2\6\uffff\6\1\7\uffff\1\5",
            "",
            "",
            "",
            "",
            "\2\14\2\uffff\2\14\3\uffff\1\14\2\uffff\3\14\5\uffff\1\14\1\uffff\1\14\1\uffff\2\14\1\uffff\1\14\2\uffff\2\14\2\uffff\1\14\4\uffff\3\14\1\13\1\14\1\uffff\4\14\2\uffff\6\14\1\11\2\14\1\uffff\1\14\2\uffff\1\14\2\uffff\1\12\1\14\3\uffff\1\14\13\uffff\1\14\16\uffff\1\14",
            "",
            "",
            "",
            "\1\15",
            "\3\14\5\uffff\1\14\3\uffff\1\14\2\uffff\1\14\2\uffff\2\14\7\uffff\2\14\6\uffff\2\14\23\uffff\1\14\36\uffff\1\16",
            "",
            "",
            "\2\14\2\uffff\2\14\3\uffff\1\14\2\uffff\3\14\5\uffff\1\14\1\uffff\1\14\1\uffff\2\14\1\uffff\1\14\2\uffff\2\14\2\uffff\1\14\4\uffff\3\14\1\uffff\1\14\1\uffff\4\14\2\uffff\11\14\1\uffff\1\14\2\uffff\1\14\2\uffff\1\12\1\14\3\uffff\1\14\13\uffff\1\14\16\uffff\1\14",
            "\3\14\5\uffff\1\14\3\uffff\1\14\5\uffff\2\14\7\uffff\2\14\2\uffff\1\14\3\uffff\2\14\11\uffff\1\14\1\uffff\1\17\7\uffff\1\14\16\uffff\1\14\17\uffff\1\14",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA97 extends DFA {

        public DFA97(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 97;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "4317:2: ( ( () ( (lv_lit_1_0= ruleSlangLit ) ) ) | ( () ( (lv_i_3_0= ruleSlangInterp ) ) ) | ( ( ( ( () In_1 LeftParenthesis ) )=> ( () otherlv_5= In_1 otherlv_6= LeftParenthesis ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= RightParenthesis ) | ( ( ( ( () Enum LeftParenthesis ) )=> ( () otherlv_10= Enum otherlv_11= LeftParenthesis ) ) ( (lv_enumType_12_0= ruleDataElement ) ) otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) otherlv_15= RightParenthesis ) | ( ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_17_0= ruleDataElement ) ) otherlv_18= LeftCurlyBracket ( (otherlv_19= RULE_ID ) ) otherlv_20= EqualsSign ) ) ( (lv_argExpr_21_0= ruleExpr ) ) (otherlv_22= Semicolon ( (otherlv_23= RULE_ID ) ) otherlv_24= EqualsSign ( (lv_argExpr_25_0= ruleExpr ) ) )* otherlv_26= RightCurlyBracket ) | ( () ( (otherlv_28= RULE_ID ) ) (otherlv_29= FullStop ( (lv_ref_30_0= ruleOtherDataRef ) ) )? ( (lv_cs_31_0= ruleSlangCallSuffix ) )? ) | ( () otherlv_33= LeftParenthesis ( (lv_e_34_0= ruleExpr ) ) (otherlv_35= Comma ( (lv_e_36_0= ruleExpr ) ) )* otherlv_37= RightParenthesis ) | ( () otherlv_39= For ( (lv_r_40_0= ruleSlangForRange ) ) (otherlv_41= Comma ( (lv_r_42_0= ruleSlangForRange ) ) )* otherlv_43= Yield ( ( (lv_b_44_0= ruleSlangBlock ) ) | (otherlv_45= LeftParenthesis ( (lv_e_46_0= ruleExpr ) ) otherlv_47= RightParenthesis ) ) ) | ( () otherlv_49= LeftCurlyBracket ( ( ( ( (lv_p_50_0= ruleSlangParams ) ) otherlv_51= EqualsSignGreaterThanSign )? ( (lv_e_52_0= ruleExpr ) ) otherlv_53= RightCurlyBracket ) | ( ( (lv_stmt_54_0= ruleSlangStmt ) )* ( (lv_r_55_0= ruleSlangRet ) )? otherlv_56= RightCurlyBracket ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA97_14 = input.LA(1);

                         
                        int index97_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA97_14>=Assert && LA97_14<=Return)||LA97_14==Match||LA97_14==While||(LA97_14>=Halt && LA97_14<=Spec)||(LA97_14>=Val && LA97_14<=Var)||LA97_14==ColonEqualsSign||(LA97_14>=Do && LA97_14<=If)||LA97_14==Colon||LA97_14==RightCurlyBracket||LA97_14==RULE_DEFOP||LA97_14==RULE_ID) ) {s = 12;}

                        else if ( (LA97_14==EqualsSign) && (synpred3_InternalGumboParser())) {s = 15;}

                         
                        input.seek(index97_14);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA97_5 = input.LA(1);

                         
                        int index97_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA97_5==FullStop) ) {s = 9;}

                        else if ( (LA97_5==LeftCurlyBracket) ) {s = 10;}

                        else if ( (LA97_5==ColonColon) && (synpred3_InternalGumboParser())) {s = 11;}

                        else if ( (LA97_5==EOF||(LA97_5>=Guarantee && LA97_5<=Invariant)||(LA97_5>=Modifies && LA97_5<=Requires)||LA97_5==Ensures||(LA97_5>=Assert && LA97_5<=Return)||LA97_5==Match||LA97_5==Reads||(LA97_5>=While && LA97_5<=Yield)||LA97_5==Case||(LA97_5>=Halt && LA97_5<=Spec)||LA97_5==FullStopFullStopLessThanSign||(LA97_5>=Val && LA97_5<=FullStopFullStop)||LA97_5==ColonEqualsSign||(LA97_5>=EqualsSignGreaterThanSign && LA97_5<=If)||(LA97_5>=LeftParenthesis && LA97_5<=HyphenMinus)||(LA97_5>=Colon && LA97_5<=Semicolon)||LA97_5==QuestionMark||LA97_5==LeftSquareBracket||LA97_5==RightCurlyBracket||LA97_5==RULE_SLANG_STRING||LA97_5==RULE_OP||LA97_5==RULE_ID) ) {s = 12;}

                         
                        input.seek(index97_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA97_0 = input.LA(1);

                         
                        int index97_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA97_0>=F && LA97_0<=T)||(LA97_0>=RULE_SLANG_STRING && LA97_0<=RULE_MSTRING)||(LA97_0>=RULE_HEX && LA97_0<=RULE_REAL_IDF)) ) {s = 1;}

                        else if ( (LA97_0==RULE_MSP||(LA97_0>=RULE_SLI && LA97_0<=RULE_MSPB)) ) {s = 2;}

                        else if ( (LA97_0==In_1) && (synpred1_InternalGumboParser())) {s = 3;}

                        else if ( (LA97_0==Enum) && (synpred2_InternalGumboParser())) {s = 4;}

                        else if ( (LA97_0==RULE_ID) ) {s = 5;}

                        else if ( (LA97_0==LeftParenthesis) ) {s = 6;}

                        else if ( (LA97_0==For) ) {s = 7;}

                        else if ( (LA97_0==LeftCurlyBracket) ) {s = 8;}

                         
                        input.seek(index97_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 97, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\25\uffff";
    static final String dfa_9s = "\10\uffff\1\17\1\21\1\23\3\uffff\1\17\1\uffff\1\21\3\uffff\1\23";
    static final String dfa_10s = "\1\5\5\uffff\2\142\3\20\3\uffff\1\20\1\uffff\1\20\1\uffff\1\155\1\uffff\1\20";
    static final String dfa_11s = "\1\155\5\uffff\4\155\1\105\3\uffff\1\105\1\uffff\1\105\1\uffff\1\155\1\uffff\1\105";
    static final String dfa_12s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\5\uffff\1\11\1\12\1\6\1\uffff\1\7\1\uffff\1\10\1\uffff\1\13\1\uffff";
    static final String dfa_13s = "\25\uffff}>";
    static final String[] dfa_14s = {
            "\1\3\6\uffff\1\2\5\uffff\1\4\11\uffff\1\14\15\uffff\1\14\22\uffff\1\13\2\uffff\1\6\1\uffff\1\7\7\uffff\1\1\27\uffff\1\11\1\uffff\1\10\7\uffff\1\5\1\12",
            "",
            "",
            "",
            "",
            "",
            "\1\11\1\uffff\1\10\10\uffff\1\15",
            "\1\11\1\uffff\1\10\10\uffff\1\15",
            "\1\17\42\uffff\1\15\7\uffff\1\17\2\uffff\1\17\2\uffff\1\17\3\uffff\1\17\47\uffff\1\16",
            "\1\21\42\uffff\1\15\7\uffff\1\21\2\uffff\1\21\2\uffff\1\21\3\uffff\1\21\47\uffff\1\20",
            "\1\23\42\uffff\1\15\1\22\6\uffff\1\23\2\uffff\1\23\2\uffff\1\23\3\uffff\1\23",
            "",
            "",
            "",
            "\1\17\42\uffff\1\15\7\uffff\1\17\2\uffff\1\17\2\uffff\1\17\3\uffff\1\17",
            "",
            "\1\21\42\uffff\1\15\7\uffff\1\21\2\uffff\1\21\2\uffff\1\21\3\uffff\1\21",
            "",
            "\1\24",
            "",
            "\1\23\42\uffff\1\15\7\uffff\1\23\2\uffff\1\23\2\uffff\1\23\3\uffff\1\23"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA125 extends DFA {

        public DFA125(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 125;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "6547:2: (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000402D2L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000400D2L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040052L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040042L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000800000000002L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0xA800409004000000L,0x0000203F434DA305L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800400L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800402L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000804400L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000804402L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002000004000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000004002L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000400L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000408L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000200000000002L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0xA801429006200000L,0x0000203F434DA305L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000410L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000000002L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0020020000000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x4000000000000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0080000000000000L,0x0000200000000000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x8000000000000002L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0001000000000000L,0x0000200000000000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000802L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x000000210008C002L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x000000000008C002L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000084002L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000088002L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000004800L,0x0000000000002000L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000002000000000L,0x0000000000004000L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0020000000000002L,0x0000000020000010L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0400000000000000L,0x0000000000002000L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x2000000000000000L,0x0000200000000000L});
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0480000000000000L});
        public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0606030440C00002L,0x0000200000000000L});
        public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x2000000000000002L});
        public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x2000000000000000L,0x0000200000001000L});
        public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x2000000000000002L,0x0000000000000010L});
        public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
        public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0020000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_66 = new BitSet(new long[]{0xA800409004000002L,0x0000203F434DA385L});
        public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x2800408000000000L,0x0000203F034C2300L});
        public static final BitSet FOLLOW_68 = new BitSet(new long[]{0xA800409004000002L,0x0000203F434DA305L});
        public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0080000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0008100000000002L});
        public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0606030441C00000L,0x0000200000004000L});
        public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
        public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
        public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004020L});
        public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x2000000000000002L,0x0000000000000408L});
        public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x2000000000000002L,0x0000000000000400L});
        public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x2000000000000000L,0x0000000000002000L});
        public static final BitSet FOLLOW_81 = new BitSet(new long[]{0xAE06439445C00000L,0x0000203F434DE305L});
        public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0004000000000000L,0x0000200000000000L});
        public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0100000000000002L});
        public static final BitSet FOLLOW_84 = new BitSet(new long[]{0xE800409004000000L,0x0000203F434DA305L});
        public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0020000000000002L});
        public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x000000000C000000L});
        public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0080080000000000L});
        public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x2000040010043020L,0x0000301400000405L});
        public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0800000000010000L,0x0000000000000022L});
        public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000022L});
        public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0800000000000002L});
        public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000800L});
        public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x6000040010043020L,0x0000301400000405L});
        public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
        public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000800L});
        public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
        public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000000L,0x0000201400000005L});
        public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
        public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0010000000000002L});
        public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0010000000000000L});
    }


}