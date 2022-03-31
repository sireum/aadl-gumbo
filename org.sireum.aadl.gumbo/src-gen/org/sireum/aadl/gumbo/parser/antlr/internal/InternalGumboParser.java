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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Integration", "Classifier", "Initialize", "Invariants", "Extension", "Functions", "Guarantee", "Invariant", "Reference", "Constant", "Modifies", "Requires", "Applies", "Binding", "Compute", "Ensures", "Library", "Memoize", "Assert", "Assume", "Return", "Strict", "Some", "Delta", "False", "Gumbo", "Match", "Modes", "Reads", "State", "While", "Yield", "All", "Case", "Else", "Enum", "Halt", "Spec", "True", "PlusSignEqualsSignGreaterThanSign", "FullStopFullStopLessThanSign", "Def", "For", "Inv", "Mut", "Val", "Var", "FullStopFullStop", "ColonColon", "ColonEqualsSign", "LessThanSignColon", "EqualsSignGreaterThanSign", "By", "Do", "If", "In", "To", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "FullStop", "Colon", "Semicolon", "EqualsSign", "QuestionMark", "F", "T", "LeftSquareBracket", "RightSquareBracket", "KW__", "LeftCurlyBracket", "RightCurlyBracket", "ForAll", "ThereExists", "RULE_ESC_SEQ", "RULE_SLANG_STRING", "RULE_MSTRING", "RULE_IDF", "RULE_MSPI", "RULE_MSP", "RULE_DIGIT", "RULE_SLI", "RULE_MSPB", "RULE_MSPM", "RULE_MSPE", "RULE_OPSYM", "RULE_DEFOP", "RULE_OP", "RULE_EXTENDED_DIGIT", "RULE_HEX", "RULE_BIN", "RULE_INTEGER_LIT", "RULE_INT_IDF", "RULE_REAL_LIT", "RULE_REAL_IDF", "RULE_LETTER", "RULE_UNICODE_ESC", "RULE_SL_COMMENT", "RULE_EXPONENT", "RULE_INT_EXPONENT", "RULE_BASED_INTEGER", "RULE_STRING", "RULE_ID", "RULE_WS"
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
    public static final int In=59;
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
    // InternalGumboParser.g:579:1: ruleInitialize returns [EObject current=null] : (otherlv_0= Initialize ( (lv_specs_1_0= ruleInitializeSpecStatement ) )+ ) ;
    public final EObject ruleInitialize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_specs_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:585:2: ( (otherlv_0= Initialize ( (lv_specs_1_0= ruleInitializeSpecStatement ) )+ ) )
            // InternalGumboParser.g:586:2: (otherlv_0= Initialize ( (lv_specs_1_0= ruleInitializeSpecStatement ) )+ )
            {
            // InternalGumboParser.g:586:2: (otherlv_0= Initialize ( (lv_specs_1_0= ruleInitializeSpecStatement ) )+ )
            // InternalGumboParser.g:587:3: otherlv_0= Initialize ( (lv_specs_1_0= ruleInitializeSpecStatement ) )+
            {
            otherlv_0=(Token)match(input,Initialize,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInitializeAccess().getInitializeKeyword_0());
              		
            }
            // InternalGumboParser.g:591:3: ( (lv_specs_1_0= ruleInitializeSpecStatement ) )+
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
            	    // InternalGumboParser.g:592:4: (lv_specs_1_0= ruleInitializeSpecStatement )
            	    {
            	    // InternalGumboParser.g:592:4: (lv_specs_1_0= ruleInitializeSpecStatement )
            	    // InternalGumboParser.g:593:5: lv_specs_1_0= ruleInitializeSpecStatement
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
    // InternalGumboParser.g:614:1: entryRuleInitializeSpecStatement returns [EObject current=null] : iv_ruleInitializeSpecStatement= ruleInitializeSpecStatement EOF ;
    public final EObject entryRuleInitializeSpecStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitializeSpecStatement = null;


        try {
            // InternalGumboParser.g:614:64: (iv_ruleInitializeSpecStatement= ruleInitializeSpecStatement EOF )
            // InternalGumboParser.g:615:2: iv_ruleInitializeSpecStatement= ruleInitializeSpecStatement EOF
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
    // InternalGumboParser.g:621:1: ruleInitializeSpecStatement returns [EObject current=null] : ( (lv_guaranteeStatement_0_0= ruleGuaranteeStatement ) ) ;
    public final EObject ruleInitializeSpecStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_guaranteeStatement_0_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:627:2: ( ( (lv_guaranteeStatement_0_0= ruleGuaranteeStatement ) ) )
            // InternalGumboParser.g:628:2: ( (lv_guaranteeStatement_0_0= ruleGuaranteeStatement ) )
            {
            // InternalGumboParser.g:628:2: ( (lv_guaranteeStatement_0_0= ruleGuaranteeStatement ) )
            // InternalGumboParser.g:629:3: (lv_guaranteeStatement_0_0= ruleGuaranteeStatement )
            {
            // InternalGumboParser.g:629:3: (lv_guaranteeStatement_0_0= ruleGuaranteeStatement )
            // InternalGumboParser.g:630:4: lv_guaranteeStatement_0_0= ruleGuaranteeStatement
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
    // InternalGumboParser.g:650:1: entryRuleCompute returns [EObject current=null] : iv_ruleCompute= ruleCompute EOF ;
    public final EObject entryRuleCompute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompute = null;


        try {
            // InternalGumboParser.g:650:48: (iv_ruleCompute= ruleCompute EOF )
            // InternalGumboParser.g:651:2: iv_ruleCompute= ruleCompute EOF
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
    // InternalGumboParser.g:657:1: ruleCompute returns [EObject current=null] : (otherlv_0= Compute ( (lv_cases_1_0= ruleCaseStatementClause ) )+ ) ;
    public final EObject ruleCompute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_cases_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:663:2: ( (otherlv_0= Compute ( (lv_cases_1_0= ruleCaseStatementClause ) )+ ) )
            // InternalGumboParser.g:664:2: (otherlv_0= Compute ( (lv_cases_1_0= ruleCaseStatementClause ) )+ )
            {
            // InternalGumboParser.g:664:2: (otherlv_0= Compute ( (lv_cases_1_0= ruleCaseStatementClause ) )+ )
            // InternalGumboParser.g:665:3: otherlv_0= Compute ( (lv_cases_1_0= ruleCaseStatementClause ) )+
            {
            otherlv_0=(Token)match(input,Compute,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getComputeAccess().getComputeKeyword_0());
              		
            }
            // InternalGumboParser.g:669:3: ( (lv_cases_1_0= ruleCaseStatementClause ) )+
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
            	    // InternalGumboParser.g:670:4: (lv_cases_1_0= ruleCaseStatementClause )
            	    {
            	    // InternalGumboParser.g:670:4: (lv_cases_1_0= ruleCaseStatementClause )
            	    // InternalGumboParser.g:671:5: lv_cases_1_0= ruleCaseStatementClause
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
    // InternalGumboParser.g:692:1: entryRuleCaseStatementClause returns [EObject current=null] : iv_ruleCaseStatementClause= ruleCaseStatementClause EOF ;
    public final EObject entryRuleCaseStatementClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseStatementClause = null;


        try {
            // InternalGumboParser.g:692:60: (iv_ruleCaseStatementClause= ruleCaseStatementClause EOF )
            // InternalGumboParser.g:693:2: iv_ruleCaseStatementClause= ruleCaseStatementClause EOF
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
    // InternalGumboParser.g:699:1: ruleCaseStatementClause returns [EObject current=null] : (otherlv_0= Case ( (lv_displayName_1_0= RULE_SLANG_STRING ) ) otherlv_2= Colon ( (lv_assumeStatement_3_0= ruleAnonAssumeStatement ) ) ( (lv_guaranteeStatement_4_0= ruleAnonGuaranteeStatement ) ) ) ;
    public final EObject ruleCaseStatementClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_displayName_1_0=null;
        Token otherlv_2=null;
        EObject lv_assumeStatement_3_0 = null;

        EObject lv_guaranteeStatement_4_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:705:2: ( (otherlv_0= Case ( (lv_displayName_1_0= RULE_SLANG_STRING ) ) otherlv_2= Colon ( (lv_assumeStatement_3_0= ruleAnonAssumeStatement ) ) ( (lv_guaranteeStatement_4_0= ruleAnonGuaranteeStatement ) ) ) )
            // InternalGumboParser.g:706:2: (otherlv_0= Case ( (lv_displayName_1_0= RULE_SLANG_STRING ) ) otherlv_2= Colon ( (lv_assumeStatement_3_0= ruleAnonAssumeStatement ) ) ( (lv_guaranteeStatement_4_0= ruleAnonGuaranteeStatement ) ) )
            {
            // InternalGumboParser.g:706:2: (otherlv_0= Case ( (lv_displayName_1_0= RULE_SLANG_STRING ) ) otherlv_2= Colon ( (lv_assumeStatement_3_0= ruleAnonAssumeStatement ) ) ( (lv_guaranteeStatement_4_0= ruleAnonGuaranteeStatement ) ) )
            // InternalGumboParser.g:707:3: otherlv_0= Case ( (lv_displayName_1_0= RULE_SLANG_STRING ) ) otherlv_2= Colon ( (lv_assumeStatement_3_0= ruleAnonAssumeStatement ) ) ( (lv_guaranteeStatement_4_0= ruleAnonGuaranteeStatement ) )
            {
            otherlv_0=(Token)match(input,Case,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCaseStatementClauseAccess().getCaseKeyword_0());
              		
            }
            // InternalGumboParser.g:711:3: ( (lv_displayName_1_0= RULE_SLANG_STRING ) )
            // InternalGumboParser.g:712:4: (lv_displayName_1_0= RULE_SLANG_STRING )
            {
            // InternalGumboParser.g:712:4: (lv_displayName_1_0= RULE_SLANG_STRING )
            // InternalGumboParser.g:713:5: lv_displayName_1_0= RULE_SLANG_STRING
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

            otherlv_2=(Token)match(input,Colon,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getCaseStatementClauseAccess().getColonKeyword_2());
              		
            }
            // InternalGumboParser.g:733:3: ( (lv_assumeStatement_3_0= ruleAnonAssumeStatement ) )
            // InternalGumboParser.g:734:4: (lv_assumeStatement_3_0= ruleAnonAssumeStatement )
            {
            // InternalGumboParser.g:734:4: (lv_assumeStatement_3_0= ruleAnonAssumeStatement )
            // InternalGumboParser.g:735:5: lv_assumeStatement_3_0= ruleAnonAssumeStatement
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

            // InternalGumboParser.g:752:3: ( (lv_guaranteeStatement_4_0= ruleAnonGuaranteeStatement ) )
            // InternalGumboParser.g:753:4: (lv_guaranteeStatement_4_0= ruleAnonGuaranteeStatement )
            {
            // InternalGumboParser.g:753:4: (lv_guaranteeStatement_4_0= ruleAnonGuaranteeStatement )
            // InternalGumboParser.g:754:5: lv_guaranteeStatement_4_0= ruleAnonGuaranteeStatement
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
    // InternalGumboParser.g:775:1: entryRuleSpecStatement returns [EObject current=null] : iv_ruleSpecStatement= ruleSpecStatement EOF ;
    public final EObject entryRuleSpecStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecStatement = null;


        try {
            // InternalGumboParser.g:775:54: (iv_ruleSpecStatement= ruleSpecStatement EOF )
            // InternalGumboParser.g:776:2: iv_ruleSpecStatement= ruleSpecStatement EOF
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
    // InternalGumboParser.g:782:1: ruleSpecStatement returns [EObject current=null] : (this_AssumeStatement_0= ruleAssumeStatement | this_GuaranteeStatement_1= ruleGuaranteeStatement ) ;
    public final EObject ruleSpecStatement() throws RecognitionException {
        EObject current = null;

        EObject this_AssumeStatement_0 = null;

        EObject this_GuaranteeStatement_1 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:788:2: ( (this_AssumeStatement_0= ruleAssumeStatement | this_GuaranteeStatement_1= ruleGuaranteeStatement ) )
            // InternalGumboParser.g:789:2: (this_AssumeStatement_0= ruleAssumeStatement | this_GuaranteeStatement_1= ruleGuaranteeStatement )
            {
            // InternalGumboParser.g:789:2: (this_AssumeStatement_0= ruleAssumeStatement | this_GuaranteeStatement_1= ruleGuaranteeStatement )
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
                    // InternalGumboParser.g:790:3: this_AssumeStatement_0= ruleAssumeStatement
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
                    // InternalGumboParser.g:799:3: this_GuaranteeStatement_1= ruleGuaranteeStatement
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
    // InternalGumboParser.g:811:1: entryRuleAssumeStatement returns [EObject current=null] : iv_ruleAssumeStatement= ruleAssumeStatement EOF ;
    public final EObject entryRuleAssumeStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssumeStatement = null;


        try {
            // InternalGumboParser.g:811:56: (iv_ruleAssumeStatement= ruleAssumeStatement EOF )
            // InternalGumboParser.g:812:2: iv_ruleAssumeStatement= ruleAssumeStatement EOF
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
    // InternalGumboParser.g:818:1: ruleAssumeStatement returns [EObject current=null] : (otherlv_0= Assume ( (lv_displayName_1_0= RULE_SLANG_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon ) ;
    public final EObject ruleAssumeStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_displayName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expr_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:824:2: ( (otherlv_0= Assume ( (lv_displayName_1_0= RULE_SLANG_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon ) )
            // InternalGumboParser.g:825:2: (otherlv_0= Assume ( (lv_displayName_1_0= RULE_SLANG_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon )
            {
            // InternalGumboParser.g:825:2: (otherlv_0= Assume ( (lv_displayName_1_0= RULE_SLANG_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon )
            // InternalGumboParser.g:826:3: otherlv_0= Assume ( (lv_displayName_1_0= RULE_SLANG_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon
            {
            otherlv_0=(Token)match(input,Assume,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAssumeStatementAccess().getAssumeKeyword_0());
              		
            }
            // InternalGumboParser.g:830:3: ( (lv_displayName_1_0= RULE_SLANG_STRING ) )
            // InternalGumboParser.g:831:4: (lv_displayName_1_0= RULE_SLANG_STRING )
            {
            // InternalGumboParser.g:831:4: (lv_displayName_1_0= RULE_SLANG_STRING )
            // InternalGumboParser.g:832:5: lv_displayName_1_0= RULE_SLANG_STRING
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
            // InternalGumboParser.g:852:3: ( (lv_expr_3_0= ruleExpr ) )
            // InternalGumboParser.g:853:4: (lv_expr_3_0= ruleExpr )
            {
            // InternalGumboParser.g:853:4: (lv_expr_3_0= ruleExpr )
            // InternalGumboParser.g:854:5: lv_expr_3_0= ruleExpr
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
    // InternalGumboParser.g:879:1: entryRuleAnonAssumeStatement returns [EObject current=null] : iv_ruleAnonAssumeStatement= ruleAnonAssumeStatement EOF ;
    public final EObject entryRuleAnonAssumeStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnonAssumeStatement = null;


        try {
            // InternalGumboParser.g:879:60: (iv_ruleAnonAssumeStatement= ruleAnonAssumeStatement EOF )
            // InternalGumboParser.g:880:2: iv_ruleAnonAssumeStatement= ruleAnonAssumeStatement EOF
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
    // InternalGumboParser.g:886:1: ruleAnonAssumeStatement returns [EObject current=null] : (otherlv_0= Assume ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon ) ;
    public final EObject ruleAnonAssumeStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:892:2: ( (otherlv_0= Assume ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon ) )
            // InternalGumboParser.g:893:2: (otherlv_0= Assume ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon )
            {
            // InternalGumboParser.g:893:2: (otherlv_0= Assume ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon )
            // InternalGumboParser.g:894:3: otherlv_0= Assume ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon
            {
            otherlv_0=(Token)match(input,Assume,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAnonAssumeStatementAccess().getAssumeKeyword_0());
              		
            }
            // InternalGumboParser.g:898:3: ( (lv_expr_1_0= ruleExpr ) )
            // InternalGumboParser.g:899:4: (lv_expr_1_0= ruleExpr )
            {
            // InternalGumboParser.g:899:4: (lv_expr_1_0= ruleExpr )
            // InternalGumboParser.g:900:5: lv_expr_1_0= ruleExpr
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
    // InternalGumboParser.g:925:1: entryRuleGuaranteeStatement returns [EObject current=null] : iv_ruleGuaranteeStatement= ruleGuaranteeStatement EOF ;
    public final EObject entryRuleGuaranteeStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuaranteeStatement = null;


        try {
            // InternalGumboParser.g:925:59: (iv_ruleGuaranteeStatement= ruleGuaranteeStatement EOF )
            // InternalGumboParser.g:926:2: iv_ruleGuaranteeStatement= ruleGuaranteeStatement EOF
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
    // InternalGumboParser.g:932:1: ruleGuaranteeStatement returns [EObject current=null] : (otherlv_0= Guarantee ( (lv_displayName_1_0= RULE_SLANG_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon ) ;
    public final EObject ruleGuaranteeStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_displayName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expr_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:938:2: ( (otherlv_0= Guarantee ( (lv_displayName_1_0= RULE_SLANG_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon ) )
            // InternalGumboParser.g:939:2: (otherlv_0= Guarantee ( (lv_displayName_1_0= RULE_SLANG_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon )
            {
            // InternalGumboParser.g:939:2: (otherlv_0= Guarantee ( (lv_displayName_1_0= RULE_SLANG_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon )
            // InternalGumboParser.g:940:3: otherlv_0= Guarantee ( (lv_displayName_1_0= RULE_SLANG_STRING ) ) otherlv_2= Colon ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= Semicolon
            {
            otherlv_0=(Token)match(input,Guarantee,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGuaranteeStatementAccess().getGuaranteeKeyword_0());
              		
            }
            // InternalGumboParser.g:944:3: ( (lv_displayName_1_0= RULE_SLANG_STRING ) )
            // InternalGumboParser.g:945:4: (lv_displayName_1_0= RULE_SLANG_STRING )
            {
            // InternalGumboParser.g:945:4: (lv_displayName_1_0= RULE_SLANG_STRING )
            // InternalGumboParser.g:946:5: lv_displayName_1_0= RULE_SLANG_STRING
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
            // InternalGumboParser.g:966:3: ( (lv_expr_3_0= ruleExpr ) )
            // InternalGumboParser.g:967:4: (lv_expr_3_0= ruleExpr )
            {
            // InternalGumboParser.g:967:4: (lv_expr_3_0= ruleExpr )
            // InternalGumboParser.g:968:5: lv_expr_3_0= ruleExpr
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
    // InternalGumboParser.g:993:1: entryRuleAnonGuaranteeStatement returns [EObject current=null] : iv_ruleAnonGuaranteeStatement= ruleAnonGuaranteeStatement EOF ;
    public final EObject entryRuleAnonGuaranteeStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnonGuaranteeStatement = null;


        try {
            // InternalGumboParser.g:993:63: (iv_ruleAnonGuaranteeStatement= ruleAnonGuaranteeStatement EOF )
            // InternalGumboParser.g:994:2: iv_ruleAnonGuaranteeStatement= ruleAnonGuaranteeStatement EOF
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
    // InternalGumboParser.g:1000:1: ruleAnonGuaranteeStatement returns [EObject current=null] : (otherlv_0= Guarantee ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon ) ;
    public final EObject ruleAnonGuaranteeStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1006:2: ( (otherlv_0= Guarantee ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon ) )
            // InternalGumboParser.g:1007:2: (otherlv_0= Guarantee ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon )
            {
            // InternalGumboParser.g:1007:2: (otherlv_0= Guarantee ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon )
            // InternalGumboParser.g:1008:3: otherlv_0= Guarantee ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= Semicolon
            {
            otherlv_0=(Token)match(input,Guarantee,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAnonGuaranteeStatementAccess().getGuaranteeKeyword_0());
              		
            }
            // InternalGumboParser.g:1012:3: ( (lv_expr_1_0= ruleExpr ) )
            // InternalGumboParser.g:1013:4: (lv_expr_1_0= ruleExpr )
            {
            // InternalGumboParser.g:1013:4: (lv_expr_1_0= ruleExpr )
            // InternalGumboParser.g:1014:5: lv_expr_1_0= ruleExpr
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
    // InternalGumboParser.g:1039:1: entryRuleOtherDataRef returns [EObject current=null] : iv_ruleOtherDataRef= ruleOtherDataRef EOF ;
    public final EObject entryRuleOtherDataRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOtherDataRef = null;


        try {
            // InternalGumboParser.g:1039:53: (iv_ruleOtherDataRef= ruleOtherDataRef EOF )
            // InternalGumboParser.g:1040:2: iv_ruleOtherDataRef= ruleOtherDataRef EOF
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
    // InternalGumboParser.g:1046:1: ruleOtherDataRef returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleOtherDataRef ) ) )? ) ;
    public final EObject ruleOtherDataRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_arrayRange_1_0 = null;

        EObject lv_path_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1052:2: ( ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleOtherDataRef ) ) )? ) )
            // InternalGumboParser.g:1053:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleOtherDataRef ) ) )? )
            {
            // InternalGumboParser.g:1053:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleOtherDataRef ) ) )? )
            // InternalGumboParser.g:1054:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleOtherDataRef ) ) )?
            {
            // InternalGumboParser.g:1054:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* )
            // InternalGumboParser.g:1055:4: ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )*
            {
            // InternalGumboParser.g:1055:4: ( (otherlv_0= RULE_ID ) )
            // InternalGumboParser.g:1056:5: (otherlv_0= RULE_ID )
            {
            // InternalGumboParser.g:1056:5: (otherlv_0= RULE_ID )
            // InternalGumboParser.g:1057:6: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElement(grammarAccess.getOtherDataRefRule());
              						}
              					
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						newLeafNode(otherlv_0, grammarAccess.getOtherDataRefAccess().getNamedElementNamedElementCrossReference_0_0_0());
              					
            }

            }


            }

            // InternalGumboParser.g:1068:4: ( (lv_arrayRange_1_0= ruleArrayRange ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==LeftSquareBracket) ) {
                    int LA13_2 = input.LA(2);

                    if ( (LA13_2==RULE_INTEGER_LIT) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // InternalGumboParser.g:1069:5: (lv_arrayRange_1_0= ruleArrayRange )
            	    {
            	    // InternalGumboParser.g:1069:5: (lv_arrayRange_1_0= ruleArrayRange )
            	    // InternalGumboParser.g:1070:6: lv_arrayRange_1_0= ruleArrayRange
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOtherDataRefAccess().getArrayRangeArrayRangeParserRuleCall_0_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_24);
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
            	    break loop13;
                }
            } while (true);


            }

            // InternalGumboParser.g:1088:3: (otherlv_2= FullStop ( (lv_path_3_0= ruleOtherDataRef ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==FullStop) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGumboParser.g:1089:4: otherlv_2= FullStop ( (lv_path_3_0= ruleOtherDataRef ) )
                    {
                    otherlv_2=(Token)match(input,FullStop,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getOtherDataRefAccess().getFullStopKeyword_1_0());
                      			
                    }
                    // InternalGumboParser.g:1093:4: ( (lv_path_3_0= ruleOtherDataRef ) )
                    // InternalGumboParser.g:1094:5: (lv_path_3_0= ruleOtherDataRef )
                    {
                    // InternalGumboParser.g:1094:5: (lv_path_3_0= ruleOtherDataRef )
                    // InternalGumboParser.g:1095:6: lv_path_3_0= ruleOtherDataRef
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
    // InternalGumboParser.g:1117:1: entryRuleDataElement returns [EObject current=null] : iv_ruleDataElement= ruleDataElement EOF ;
    public final EObject entryRuleDataElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataElement = null;


        try {
            // InternalGumboParser.g:1117:52: (iv_ruleDataElement= ruleDataElement EOF )
            // InternalGumboParser.g:1118:2: iv_ruleDataElement= ruleDataElement EOF
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
    // InternalGumboParser.g:1124:1: ruleDataElement returns [EObject current=null] : ( ( ruleQCREF ) ) ;
    public final EObject ruleDataElement() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalGumboParser.g:1130:2: ( ( ( ruleQCREF ) ) )
            // InternalGumboParser.g:1131:2: ( ( ruleQCREF ) )
            {
            // InternalGumboParser.g:1131:2: ( ( ruleQCREF ) )
            // InternalGumboParser.g:1132:3: ( ruleQCREF )
            {
            // InternalGumboParser.g:1132:3: ( ruleQCREF )
            // InternalGumboParser.g:1133:4: ruleQCREF
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
    // InternalGumboParser.g:1150:1: entryRuleFunctions returns [EObject current=null] : iv_ruleFunctions= ruleFunctions EOF ;
    public final EObject entryRuleFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctions = null;


        try {
            // InternalGumboParser.g:1150:50: (iv_ruleFunctions= ruleFunctions EOF )
            // InternalGumboParser.g:1151:2: iv_ruleFunctions= ruleFunctions EOF
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
    // InternalGumboParser.g:1157:1: ruleFunctions returns [EObject current=null] : (otherlv_0= Functions ( (lv_specs_1_0= ruleFuncSpec ) )+ ) ;
    public final EObject ruleFunctions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_specs_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1163:2: ( (otherlv_0= Functions ( (lv_specs_1_0= ruleFuncSpec ) )+ ) )
            // InternalGumboParser.g:1164:2: (otherlv_0= Functions ( (lv_specs_1_0= ruleFuncSpec ) )+ )
            {
            // InternalGumboParser.g:1164:2: (otherlv_0= Functions ( (lv_specs_1_0= ruleFuncSpec ) )+ )
            // InternalGumboParser.g:1165:3: otherlv_0= Functions ( (lv_specs_1_0= ruleFuncSpec ) )+
            {
            otherlv_0=(Token)match(input,Functions,FollowSets000.FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunctionsAccess().getFunctionsKeyword_0());
              		
            }
            // InternalGumboParser.g:1169:3: ( (lv_specs_1_0= ruleFuncSpec ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==Def) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGumboParser.g:1170:4: (lv_specs_1_0= ruleFuncSpec )
            	    {
            	    // InternalGumboParser.g:1170:4: (lv_specs_1_0= ruleFuncSpec )
            	    // InternalGumboParser.g:1171:5: lv_specs_1_0= ruleFuncSpec
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getFunctionsAccess().getSpecsFuncSpecParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_26);
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
            	    if ( cnt15 >= 1 ) break loop15;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
    // InternalGumboParser.g:1192:1: entryRuleFuncSpec returns [EObject current=null] : iv_ruleFuncSpec= ruleFuncSpec EOF ;
    public final EObject entryRuleFuncSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncSpec = null;


        try {
            // InternalGumboParser.g:1192:49: (iv_ruleFuncSpec= ruleFuncSpec EOF )
            // InternalGumboParser.g:1193:2: iv_ruleFuncSpec= ruleFuncSpec EOF
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
    // InternalGumboParser.g:1199:1: ruleFuncSpec returns [EObject current=null] : (this_SlangDefDef_0= ruleSlangDefDef otherlv_1= Semicolon ) ;
    public final EObject ruleFuncSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_SlangDefDef_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1205:2: ( (this_SlangDefDef_0= ruleSlangDefDef otherlv_1= Semicolon ) )
            // InternalGumboParser.g:1206:2: (this_SlangDefDef_0= ruleSlangDefDef otherlv_1= Semicolon )
            {
            // InternalGumboParser.g:1206:2: (this_SlangDefDef_0= ruleSlangDefDef otherlv_1= Semicolon )
            // InternalGumboParser.g:1207:3: this_SlangDefDef_0= ruleSlangDefDef otherlv_1= Semicolon
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
    // InternalGumboParser.g:1223:1: entryRuleSlangDefDecl returns [EObject current=null] : iv_ruleSlangDefDecl= ruleSlangDefDecl EOF ;
    public final EObject entryRuleSlangDefDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangDefDecl = null;


        try {
            // InternalGumboParser.g:1223:53: (iv_ruleSlangDefDecl= ruleSlangDefDecl EOF )
            // InternalGumboParser.g:1224:2: iv_ruleSlangDefDecl= ruleSlangDefDecl EOF
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
    // InternalGumboParser.g:1230:1: ruleSlangDefDecl returns [EObject current=null] : (otherlv_0= Def ( ruleSlangDefMods )? ( (lv_sde_2_0= ruleSlangDefExt ) )? ( (lv_name_3_0= ruleSlangDefID ) ) ( (lv_typeParams_4_0= ruleSlangTypeParams ) )? ( (lv_params_5_0= ruleSlangDefParams ) )? otherlv_6= Colon ( (lv_type_7_0= ruleSlangType ) ) ( (lv_c_8_0= ruleSlangDefContract ) )? ) ;
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
            // InternalGumboParser.g:1236:2: ( (otherlv_0= Def ( ruleSlangDefMods )? ( (lv_sde_2_0= ruleSlangDefExt ) )? ( (lv_name_3_0= ruleSlangDefID ) ) ( (lv_typeParams_4_0= ruleSlangTypeParams ) )? ( (lv_params_5_0= ruleSlangDefParams ) )? otherlv_6= Colon ( (lv_type_7_0= ruleSlangType ) ) ( (lv_c_8_0= ruleSlangDefContract ) )? ) )
            // InternalGumboParser.g:1237:2: (otherlv_0= Def ( ruleSlangDefMods )? ( (lv_sde_2_0= ruleSlangDefExt ) )? ( (lv_name_3_0= ruleSlangDefID ) ) ( (lv_typeParams_4_0= ruleSlangTypeParams ) )? ( (lv_params_5_0= ruleSlangDefParams ) )? otherlv_6= Colon ( (lv_type_7_0= ruleSlangType ) ) ( (lv_c_8_0= ruleSlangDefContract ) )? )
            {
            // InternalGumboParser.g:1237:2: (otherlv_0= Def ( ruleSlangDefMods )? ( (lv_sde_2_0= ruleSlangDefExt ) )? ( (lv_name_3_0= ruleSlangDefID ) ) ( (lv_typeParams_4_0= ruleSlangTypeParams ) )? ( (lv_params_5_0= ruleSlangDefParams ) )? otherlv_6= Colon ( (lv_type_7_0= ruleSlangType ) ) ( (lv_c_8_0= ruleSlangDefContract ) )? )
            // InternalGumboParser.g:1238:3: otherlv_0= Def ( ruleSlangDefMods )? ( (lv_sde_2_0= ruleSlangDefExt ) )? ( (lv_name_3_0= ruleSlangDefID ) ) ( (lv_typeParams_4_0= ruleSlangTypeParams ) )? ( (lv_params_5_0= ruleSlangDefParams ) )? otherlv_6= Colon ( (lv_type_7_0= ruleSlangType ) ) ( (lv_c_8_0= ruleSlangDefContract ) )?
            {
            otherlv_0=(Token)match(input,Def,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangDefDeclAccess().getDefKeyword_0());
              		
            }
            // InternalGumboParser.g:1242:3: ( ruleSlangDefMods )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==Memoize||LA16_0==Strict||LA16_0==Spec||LA16_0==Mut) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGumboParser.g:1243:4: ruleSlangDefMods
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSlangDefDeclAccess().getSlangDefModsParserRuleCall_1());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
                    ruleSlangDefMods();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalGumboParser.g:1251:3: ( (lv_sde_2_0= ruleSlangDefExt ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==LeftParenthesis) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalGumboParser.g:1252:4: (lv_sde_2_0= ruleSlangDefExt )
                    {
                    // InternalGumboParser.g:1252:4: (lv_sde_2_0= ruleSlangDefExt )
                    // InternalGumboParser.g:1253:5: lv_sde_2_0= ruleSlangDefExt
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangDefDeclAccess().getSdeSlangDefExtParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
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

            // InternalGumboParser.g:1270:3: ( (lv_name_3_0= ruleSlangDefID ) )
            // InternalGumboParser.g:1271:4: (lv_name_3_0= ruleSlangDefID )
            {
            // InternalGumboParser.g:1271:4: (lv_name_3_0= ruleSlangDefID )
            // InternalGumboParser.g:1272:5: lv_name_3_0= ruleSlangDefID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangDefDeclAccess().getNameSlangDefIDParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_28);
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

            // InternalGumboParser.g:1289:3: ( (lv_typeParams_4_0= ruleSlangTypeParams ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==LeftSquareBracket) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalGumboParser.g:1290:4: (lv_typeParams_4_0= ruleSlangTypeParams )
                    {
                    // InternalGumboParser.g:1290:4: (lv_typeParams_4_0= ruleSlangTypeParams )
                    // InternalGumboParser.g:1291:5: lv_typeParams_4_0= ruleSlangTypeParams
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangDefDeclAccess().getTypeParamsSlangTypeParamsParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_29);
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

            // InternalGumboParser.g:1308:3: ( (lv_params_5_0= ruleSlangDefParams ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==LeftParenthesis) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalGumboParser.g:1309:4: (lv_params_5_0= ruleSlangDefParams )
                    {
                    // InternalGumboParser.g:1309:4: (lv_params_5_0= ruleSlangDefParams )
                    // InternalGumboParser.g:1310:5: lv_params_5_0= ruleSlangDefParams
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
            // InternalGumboParser.g:1331:3: ( (lv_type_7_0= ruleSlangType ) )
            // InternalGumboParser.g:1332:4: (lv_type_7_0= ruleSlangType )
            {
            // InternalGumboParser.g:1332:4: (lv_type_7_0= ruleSlangType )
            // InternalGumboParser.g:1333:5: lv_type_7_0= ruleSlangType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangDefDeclAccess().getTypeSlangTypeParserRuleCall_7_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_30);
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

            // InternalGumboParser.g:1350:3: ( (lv_c_8_0= ruleSlangDefContract ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Spec) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalGumboParser.g:1351:4: (lv_c_8_0= ruleSlangDefContract )
                    {
                    // InternalGumboParser.g:1351:4: (lv_c_8_0= ruleSlangDefContract )
                    // InternalGumboParser.g:1352:5: lv_c_8_0= ruleSlangDefContract
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
    // InternalGumboParser.g:1373:1: entryRuleSlangDefDef returns [EObject current=null] : iv_ruleSlangDefDef= ruleSlangDefDef EOF ;
    public final EObject entryRuleSlangDefDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangDefDef = null;


        try {
            // InternalGumboParser.g:1373:52: (iv_ruleSlangDefDef= ruleSlangDefDef EOF )
            // InternalGumboParser.g:1374:2: iv_ruleSlangDefDef= ruleSlangDefDef EOF
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
    // InternalGumboParser.g:1380:1: ruleSlangDefDef returns [EObject current=null] : (otherlv_0= Def ( ruleSlangDefMods )? ( (lv_sde_2_0= ruleSlangDefExt ) )? ( (lv_name_3_0= ruleSlangDefID ) ) ( (lv_typeParams_4_0= ruleSlangTypeParams ) )? ( (lv_params_5_0= ruleSlangDefParams ) )? otherlv_6= Colon ( (lv_type_7_0= ruleSlangType ) ) ( (lv_c_8_0= ruleSlangDefContract ) )? otherlv_9= ColonEqualsSign ( (lv_e_10_0= ruleExpr ) ) ) ;
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
            // InternalGumboParser.g:1386:2: ( (otherlv_0= Def ( ruleSlangDefMods )? ( (lv_sde_2_0= ruleSlangDefExt ) )? ( (lv_name_3_0= ruleSlangDefID ) ) ( (lv_typeParams_4_0= ruleSlangTypeParams ) )? ( (lv_params_5_0= ruleSlangDefParams ) )? otherlv_6= Colon ( (lv_type_7_0= ruleSlangType ) ) ( (lv_c_8_0= ruleSlangDefContract ) )? otherlv_9= ColonEqualsSign ( (lv_e_10_0= ruleExpr ) ) ) )
            // InternalGumboParser.g:1387:2: (otherlv_0= Def ( ruleSlangDefMods )? ( (lv_sde_2_0= ruleSlangDefExt ) )? ( (lv_name_3_0= ruleSlangDefID ) ) ( (lv_typeParams_4_0= ruleSlangTypeParams ) )? ( (lv_params_5_0= ruleSlangDefParams ) )? otherlv_6= Colon ( (lv_type_7_0= ruleSlangType ) ) ( (lv_c_8_0= ruleSlangDefContract ) )? otherlv_9= ColonEqualsSign ( (lv_e_10_0= ruleExpr ) ) )
            {
            // InternalGumboParser.g:1387:2: (otherlv_0= Def ( ruleSlangDefMods )? ( (lv_sde_2_0= ruleSlangDefExt ) )? ( (lv_name_3_0= ruleSlangDefID ) ) ( (lv_typeParams_4_0= ruleSlangTypeParams ) )? ( (lv_params_5_0= ruleSlangDefParams ) )? otherlv_6= Colon ( (lv_type_7_0= ruleSlangType ) ) ( (lv_c_8_0= ruleSlangDefContract ) )? otherlv_9= ColonEqualsSign ( (lv_e_10_0= ruleExpr ) ) )
            // InternalGumboParser.g:1388:3: otherlv_0= Def ( ruleSlangDefMods )? ( (lv_sde_2_0= ruleSlangDefExt ) )? ( (lv_name_3_0= ruleSlangDefID ) ) ( (lv_typeParams_4_0= ruleSlangTypeParams ) )? ( (lv_params_5_0= ruleSlangDefParams ) )? otherlv_6= Colon ( (lv_type_7_0= ruleSlangType ) ) ( (lv_c_8_0= ruleSlangDefContract ) )? otherlv_9= ColonEqualsSign ( (lv_e_10_0= ruleExpr ) )
            {
            otherlv_0=(Token)match(input,Def,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangDefDefAccess().getDefKeyword_0());
              		
            }
            // InternalGumboParser.g:1392:3: ( ruleSlangDefMods )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==Memoize||LA21_0==Strict||LA21_0==Spec||LA21_0==Mut) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalGumboParser.g:1393:4: ruleSlangDefMods
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSlangDefDefAccess().getSlangDefModsParserRuleCall_1());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
                    ruleSlangDefMods();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalGumboParser.g:1401:3: ( (lv_sde_2_0= ruleSlangDefExt ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==LeftParenthesis) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalGumboParser.g:1402:4: (lv_sde_2_0= ruleSlangDefExt )
                    {
                    // InternalGumboParser.g:1402:4: (lv_sde_2_0= ruleSlangDefExt )
                    // InternalGumboParser.g:1403:5: lv_sde_2_0= ruleSlangDefExt
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangDefDefAccess().getSdeSlangDefExtParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
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

            // InternalGumboParser.g:1420:3: ( (lv_name_3_0= ruleSlangDefID ) )
            // InternalGumboParser.g:1421:4: (lv_name_3_0= ruleSlangDefID )
            {
            // InternalGumboParser.g:1421:4: (lv_name_3_0= ruleSlangDefID )
            // InternalGumboParser.g:1422:5: lv_name_3_0= ruleSlangDefID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangDefDefAccess().getNameSlangDefIDParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_28);
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

            // InternalGumboParser.g:1439:3: ( (lv_typeParams_4_0= ruleSlangTypeParams ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==LeftSquareBracket) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalGumboParser.g:1440:4: (lv_typeParams_4_0= ruleSlangTypeParams )
                    {
                    // InternalGumboParser.g:1440:4: (lv_typeParams_4_0= ruleSlangTypeParams )
                    // InternalGumboParser.g:1441:5: lv_typeParams_4_0= ruleSlangTypeParams
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangDefDefAccess().getTypeParamsSlangTypeParamsParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_29);
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

            // InternalGumboParser.g:1458:3: ( (lv_params_5_0= ruleSlangDefParams ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==LeftParenthesis) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalGumboParser.g:1459:4: (lv_params_5_0= ruleSlangDefParams )
                    {
                    // InternalGumboParser.g:1459:4: (lv_params_5_0= ruleSlangDefParams )
                    // InternalGumboParser.g:1460:5: lv_params_5_0= ruleSlangDefParams
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
            // InternalGumboParser.g:1481:3: ( (lv_type_7_0= ruleSlangType ) )
            // InternalGumboParser.g:1482:4: (lv_type_7_0= ruleSlangType )
            {
            // InternalGumboParser.g:1482:4: (lv_type_7_0= ruleSlangType )
            // InternalGumboParser.g:1483:5: lv_type_7_0= ruleSlangType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangDefDefAccess().getTypeSlangTypeParserRuleCall_7_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_31);
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

            // InternalGumboParser.g:1500:3: ( (lv_c_8_0= ruleSlangDefContract ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Spec) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalGumboParser.g:1501:4: (lv_c_8_0= ruleSlangDefContract )
                    {
                    // InternalGumboParser.g:1501:4: (lv_c_8_0= ruleSlangDefContract )
                    // InternalGumboParser.g:1502:5: lv_c_8_0= ruleSlangDefContract
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangDefDefAccess().getCSlangDefContractParserRuleCall_8_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_32);
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
            // InternalGumboParser.g:1523:3: ( (lv_e_10_0= ruleExpr ) )
            // InternalGumboParser.g:1524:4: (lv_e_10_0= ruleExpr )
            {
            // InternalGumboParser.g:1524:4: (lv_e_10_0= ruleExpr )
            // InternalGumboParser.g:1525:5: lv_e_10_0= ruleExpr
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
    // InternalGumboParser.g:1546:1: entryRuleSlangDefMods returns [String current=null] : iv_ruleSlangDefMods= ruleSlangDefMods EOF ;
    public final String entryRuleSlangDefMods() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSlangDefMods = null;


        try {
            // InternalGumboParser.g:1546:52: (iv_ruleSlangDefMods= ruleSlangDefMods EOF )
            // InternalGumboParser.g:1547:2: iv_ruleSlangDefMods= ruleSlangDefMods EOF
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
    // InternalGumboParser.g:1553:1: ruleSlangDefMods returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Strict | kw= Memoize | kw= Mut | kw= Spec ) ;
    public final AntlrDatatypeRuleToken ruleSlangDefMods() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumboParser.g:1559:2: ( (kw= Strict | kw= Memoize | kw= Mut | kw= Spec ) )
            // InternalGumboParser.g:1560:2: (kw= Strict | kw= Memoize | kw= Mut | kw= Spec )
            {
            // InternalGumboParser.g:1560:2: (kw= Strict | kw= Memoize | kw= Mut | kw= Spec )
            int alt26=4;
            switch ( input.LA(1) ) {
            case Strict:
                {
                alt26=1;
                }
                break;
            case Memoize:
                {
                alt26=2;
                }
                break;
            case Mut:
                {
                alt26=3;
                }
                break;
            case Spec:
                {
                alt26=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalGumboParser.g:1561:3: kw= Strict
                    {
                    kw=(Token)match(input,Strict,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getSlangDefModsAccess().getStrictKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:1567:3: kw= Memoize
                    {
                    kw=(Token)match(input,Memoize,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getSlangDefModsAccess().getMemoizeKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGumboParser.g:1573:3: kw= Mut
                    {
                    kw=(Token)match(input,Mut,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getSlangDefModsAccess().getMutKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGumboParser.g:1579:3: kw= Spec
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
    // InternalGumboParser.g:1588:1: entryRuleSlangDefExt returns [EObject current=null] : iv_ruleSlangDefExt= ruleSlangDefExt EOF ;
    public final EObject entryRuleSlangDefExt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangDefExt = null;


        try {
            // InternalGumboParser.g:1588:52: (iv_ruleSlangDefExt= ruleSlangDefExt EOF )
            // InternalGumboParser.g:1589:2: iv_ruleSlangDefExt= ruleSlangDefExt EOF
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
    // InternalGumboParser.g:1595:1: ruleSlangDefExt returns [EObject current=null] : (otherlv_0= LeftParenthesis ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) otherlv_4= RightParenthesis ) ;
    public final EObject ruleSlangDefExt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_typeName_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1601:2: ( (otherlv_0= LeftParenthesis ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) otherlv_4= RightParenthesis ) )
            // InternalGumboParser.g:1602:2: (otherlv_0= LeftParenthesis ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) otherlv_4= RightParenthesis )
            {
            // InternalGumboParser.g:1602:2: (otherlv_0= LeftParenthesis ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) otherlv_4= RightParenthesis )
            // InternalGumboParser.g:1603:3: otherlv_0= LeftParenthesis ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) otherlv_4= RightParenthesis
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangDefExtAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalGumboParser.g:1607:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGumboParser.g:1608:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGumboParser.g:1608:4: (lv_name_1_0= RULE_ID )
            // InternalGumboParser.g:1609:5: lv_name_1_0= RULE_ID
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
            // InternalGumboParser.g:1629:3: ( (lv_typeName_3_0= ruleSlangType ) )
            // InternalGumboParser.g:1630:4: (lv_typeName_3_0= ruleSlangType )
            {
            // InternalGumboParser.g:1630:4: (lv_typeName_3_0= ruleSlangType )
            // InternalGumboParser.g:1631:5: lv_typeName_3_0= ruleSlangType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangDefExtAccess().getTypeNameSlangTypeParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_33);
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
    // InternalGumboParser.g:1656:1: entryRuleSlangDefID returns [String current=null] : iv_ruleSlangDefID= ruleSlangDefID EOF ;
    public final String entryRuleSlangDefID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSlangDefID = null;


        try {
            // InternalGumboParser.g:1656:50: (iv_ruleSlangDefID= ruleSlangDefID EOF )
            // InternalGumboParser.g:1657:2: iv_ruleSlangDefID= ruleSlangDefID EOF
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
    // InternalGumboParser.g:1663:1: ruleSlangDefID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_Operator_1= ruleOperator ) ;
    public final AntlrDatatypeRuleToken ruleSlangDefID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        AntlrDatatypeRuleToken this_Operator_1 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1669:2: ( (this_ID_0= RULE_ID | this_Operator_1= ruleOperator ) )
            // InternalGumboParser.g:1670:2: (this_ID_0= RULE_ID | this_Operator_1= ruleOperator )
            {
            // InternalGumboParser.g:1670:2: (this_ID_0= RULE_ID | this_Operator_1= ruleOperator )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            else if ( ((LA27_0>=Asterisk && LA27_0<=PlusSign)||LA27_0==HyphenMinus||LA27_0==RULE_OP) ) {
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
                    // InternalGumboParser.g:1671:3: this_ID_0= RULE_ID
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
                    // InternalGumboParser.g:1679:3: this_Operator_1= ruleOperator
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
    // InternalGumboParser.g:1693:1: entryRuleSlangDefParams returns [EObject current=null] : iv_ruleSlangDefParams= ruleSlangDefParams EOF ;
    public final EObject entryRuleSlangDefParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangDefParams = null;


        try {
            // InternalGumboParser.g:1693:55: (iv_ruleSlangDefParams= ruleSlangDefParams EOF )
            // InternalGumboParser.g:1694:2: iv_ruleSlangDefParams= ruleSlangDefParams EOF
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
    // InternalGumboParser.g:1700:1: ruleSlangDefParams returns [EObject current=null] : (otherlv_0= LeftParenthesis ( (lv_params_1_0= ruleSlangDefParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangDefParam ) ) )? otherlv_4= RightParenthesis ) ;
    public final EObject ruleSlangDefParams() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_params_1_0 = null;

        EObject lv_params_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1706:2: ( (otherlv_0= LeftParenthesis ( (lv_params_1_0= ruleSlangDefParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangDefParam ) ) )? otherlv_4= RightParenthesis ) )
            // InternalGumboParser.g:1707:2: (otherlv_0= LeftParenthesis ( (lv_params_1_0= ruleSlangDefParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangDefParam ) ) )? otherlv_4= RightParenthesis )
            {
            // InternalGumboParser.g:1707:2: (otherlv_0= LeftParenthesis ( (lv_params_1_0= ruleSlangDefParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangDefParam ) ) )? otherlv_4= RightParenthesis )
            // InternalGumboParser.g:1708:3: otherlv_0= LeftParenthesis ( (lv_params_1_0= ruleSlangDefParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangDefParam ) ) )? otherlv_4= RightParenthesis
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangDefParamsAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalGumboParser.g:1712:3: ( (lv_params_1_0= ruleSlangDefParam ) )
            // InternalGumboParser.g:1713:4: (lv_params_1_0= ruleSlangDefParam )
            {
            // InternalGumboParser.g:1713:4: (lv_params_1_0= ruleSlangDefParam )
            // InternalGumboParser.g:1714:5: lv_params_1_0= ruleSlangDefParam
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangDefParamsAccess().getParamsSlangDefParamParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_34);
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

            // InternalGumboParser.g:1731:3: (otherlv_2= Comma ( (lv_params_3_0= ruleSlangDefParam ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Comma) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalGumboParser.g:1732:4: otherlv_2= Comma ( (lv_params_3_0= ruleSlangDefParam ) )
                    {
                    otherlv_2=(Token)match(input,Comma,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSlangDefParamsAccess().getCommaKeyword_2_0());
                      			
                    }
                    // InternalGumboParser.g:1736:4: ( (lv_params_3_0= ruleSlangDefParam ) )
                    // InternalGumboParser.g:1737:5: (lv_params_3_0= ruleSlangDefParam )
                    {
                    // InternalGumboParser.g:1737:5: (lv_params_3_0= ruleSlangDefParam )
                    // InternalGumboParser.g:1738:6: lv_params_3_0= ruleSlangDefParam
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangDefParamsAccess().getParamsSlangDefParamParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_33);
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
    // InternalGumboParser.g:1764:1: entryRuleSlangDefParam returns [EObject current=null] : iv_ruleSlangDefParam= ruleSlangDefParam EOF ;
    public final EObject entryRuleSlangDefParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangDefParam = null;


        try {
            // InternalGumboParser.g:1764:54: (iv_ruleSlangDefParam= ruleSlangDefParam EOF )
            // InternalGumboParser.g:1765:2: iv_ruleSlangDefParam= ruleSlangDefParam EOF
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
    // InternalGumboParser.g:1771:1: ruleSlangDefParam returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon (otherlv_2= EqualsSignGreaterThanSign )? ( (lv_typeName_3_0= ruleSlangType ) ) (otherlv_4= Asterisk )? ) ;
    public final EObject ruleSlangDefParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_typeName_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1777:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon (otherlv_2= EqualsSignGreaterThanSign )? ( (lv_typeName_3_0= ruleSlangType ) ) (otherlv_4= Asterisk )? ) )
            // InternalGumboParser.g:1778:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon (otherlv_2= EqualsSignGreaterThanSign )? ( (lv_typeName_3_0= ruleSlangType ) ) (otherlv_4= Asterisk )? )
            {
            // InternalGumboParser.g:1778:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon (otherlv_2= EqualsSignGreaterThanSign )? ( (lv_typeName_3_0= ruleSlangType ) ) (otherlv_4= Asterisk )? )
            // InternalGumboParser.g:1779:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon (otherlv_2= EqualsSignGreaterThanSign )? ( (lv_typeName_3_0= ruleSlangType ) ) (otherlv_4= Asterisk )?
            {
            // InternalGumboParser.g:1779:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGumboParser.g:1780:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGumboParser.g:1780:4: (lv_name_0_0= RULE_ID )
            // InternalGumboParser.g:1781:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,Colon,FollowSets000.FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSlangDefParamAccess().getColonKeyword_1());
              		
            }
            // InternalGumboParser.g:1801:3: (otherlv_2= EqualsSignGreaterThanSign )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==EqualsSignGreaterThanSign) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalGumboParser.g:1802:4: otherlv_2= EqualsSignGreaterThanSign
                    {
                    otherlv_2=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSlangDefParamAccess().getEqualsSignGreaterThanSignKeyword_2());
                      			
                    }

                    }
                    break;

            }

            // InternalGumboParser.g:1807:3: ( (lv_typeName_3_0= ruleSlangType ) )
            // InternalGumboParser.g:1808:4: (lv_typeName_3_0= ruleSlangType )
            {
            // InternalGumboParser.g:1808:4: (lv_typeName_3_0= ruleSlangType )
            // InternalGumboParser.g:1809:5: lv_typeName_3_0= ruleSlangType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangDefParamAccess().getTypeNameSlangTypeParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_36);
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

            // InternalGumboParser.g:1826:3: (otherlv_4= Asterisk )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==Asterisk) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalGumboParser.g:1827:4: otherlv_4= Asterisk
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
    // InternalGumboParser.g:1836:1: entryRuleSlangTypeParams returns [String current=null] : iv_ruleSlangTypeParams= ruleSlangTypeParams EOF ;
    public final String entryRuleSlangTypeParams() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSlangTypeParams = null;


        try {
            // InternalGumboParser.g:1836:55: (iv_ruleSlangTypeParams= ruleSlangTypeParams EOF )
            // InternalGumboParser.g:1837:2: iv_ruleSlangTypeParams= ruleSlangTypeParams EOF
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
    // InternalGumboParser.g:1843:1: ruleSlangTypeParams returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= LeftSquareBracket this_SlangTypeParam_1= ruleSlangTypeParam (kw= Comma this_SlangTypeParam_3= ruleSlangTypeParam )* kw= RightSquareBracket ) ;
    public final AntlrDatatypeRuleToken ruleSlangTypeParams() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_SlangTypeParam_1 = null;

        AntlrDatatypeRuleToken this_SlangTypeParam_3 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:1849:2: ( (kw= LeftSquareBracket this_SlangTypeParam_1= ruleSlangTypeParam (kw= Comma this_SlangTypeParam_3= ruleSlangTypeParam )* kw= RightSquareBracket ) )
            // InternalGumboParser.g:1850:2: (kw= LeftSquareBracket this_SlangTypeParam_1= ruleSlangTypeParam (kw= Comma this_SlangTypeParam_3= ruleSlangTypeParam )* kw= RightSquareBracket )
            {
            // InternalGumboParser.g:1850:2: (kw= LeftSquareBracket this_SlangTypeParam_1= ruleSlangTypeParam (kw= Comma this_SlangTypeParam_3= ruleSlangTypeParam )* kw= RightSquareBracket )
            // InternalGumboParser.g:1851:3: kw= LeftSquareBracket this_SlangTypeParam_1= ruleSlangTypeParam (kw= Comma this_SlangTypeParam_3= ruleSlangTypeParam )* kw= RightSquareBracket
            {
            kw=(Token)match(input,LeftSquareBracket,FollowSets000.FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSlangTypeParamsAccess().getLeftSquareBracketKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSlangTypeParamsAccess().getSlangTypeParamParserRuleCall_1());
              		
            }
            pushFollow(FollowSets000.FOLLOW_38);
            this_SlangTypeParam_1=ruleSlangTypeParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_SlangTypeParam_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGumboParser.g:1866:3: (kw= Comma this_SlangTypeParam_3= ruleSlangTypeParam )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==Comma) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalGumboParser.g:1867:4: kw= Comma this_SlangTypeParam_3= ruleSlangTypeParam
            	    {
            	    kw=(Token)match(input,Comma,FollowSets000.FOLLOW_37); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getSlangTypeParamsAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getSlangTypeParamsAccess().getSlangTypeParamParserRuleCall_2_1());
            	      			
            	    }
            	    pushFollow(FollowSets000.FOLLOW_38);
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
            	    break loop31;
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
    // InternalGumboParser.g:1892:1: entryRuleSlangTypeParam returns [String current=null] : iv_ruleSlangTypeParam= ruleSlangTypeParam EOF ;
    public final String entryRuleSlangTypeParam() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSlangTypeParam = null;


        try {
            // InternalGumboParser.g:1892:54: (iv_ruleSlangTypeParam= ruleSlangTypeParam EOF )
            // InternalGumboParser.g:1893:2: iv_ruleSlangTypeParam= ruleSlangTypeParam EOF
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
    // InternalGumboParser.g:1899:1: ruleSlangTypeParam returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= Mut )? this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleSlangTypeParam() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalGumboParser.g:1905:2: ( ( (kw= Mut )? this_ID_1= RULE_ID ) )
            // InternalGumboParser.g:1906:2: ( (kw= Mut )? this_ID_1= RULE_ID )
            {
            // InternalGumboParser.g:1906:2: ( (kw= Mut )? this_ID_1= RULE_ID )
            // InternalGumboParser.g:1907:3: (kw= Mut )? this_ID_1= RULE_ID
            {
            // InternalGumboParser.g:1907:3: (kw= Mut )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==Mut) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalGumboParser.g:1908:4: kw= Mut
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
    // InternalGumboParser.g:1925:1: entryRuleSlangDefContract returns [EObject current=null] : iv_ruleSlangDefContract= ruleSlangDefContract EOF ;
    public final EObject entryRuleSlangDefContract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangDefContract = null;


        try {
            // InternalGumboParser.g:1925:57: (iv_ruleSlangDefContract= ruleSlangDefContract EOF )
            // InternalGumboParser.g:1926:2: iv_ruleSlangDefContract= ruleSlangDefContract EOF
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
    // InternalGumboParser.g:1932:1: ruleSlangDefContract returns [EObject current=null] : ( () otherlv_1= Spec ( ( ( (lv_rea_2_0= ruleSlangReads ) )? ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_mod_4_0= ruleSlangModifies ) )? ( (lv_ens_5_0= ruleSlangEnsures ) )? ) | ( ( (lv_contracts_6_0= ruleSlangDefContractCase ) )+ ( (lv_rea_7_0= ruleSlangReads ) )? ( (lv_mod_8_0= ruleSlangModifies ) )? ) ) ) ;
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
            // InternalGumboParser.g:1938:2: ( ( () otherlv_1= Spec ( ( ( (lv_rea_2_0= ruleSlangReads ) )? ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_mod_4_0= ruleSlangModifies ) )? ( (lv_ens_5_0= ruleSlangEnsures ) )? ) | ( ( (lv_contracts_6_0= ruleSlangDefContractCase ) )+ ( (lv_rea_7_0= ruleSlangReads ) )? ( (lv_mod_8_0= ruleSlangModifies ) )? ) ) ) )
            // InternalGumboParser.g:1939:2: ( () otherlv_1= Spec ( ( ( (lv_rea_2_0= ruleSlangReads ) )? ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_mod_4_0= ruleSlangModifies ) )? ( (lv_ens_5_0= ruleSlangEnsures ) )? ) | ( ( (lv_contracts_6_0= ruleSlangDefContractCase ) )+ ( (lv_rea_7_0= ruleSlangReads ) )? ( (lv_mod_8_0= ruleSlangModifies ) )? ) ) )
            {
            // InternalGumboParser.g:1939:2: ( () otherlv_1= Spec ( ( ( (lv_rea_2_0= ruleSlangReads ) )? ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_mod_4_0= ruleSlangModifies ) )? ( (lv_ens_5_0= ruleSlangEnsures ) )? ) | ( ( (lv_contracts_6_0= ruleSlangDefContractCase ) )+ ( (lv_rea_7_0= ruleSlangReads ) )? ( (lv_mod_8_0= ruleSlangModifies ) )? ) ) )
            // InternalGumboParser.g:1940:3: () otherlv_1= Spec ( ( ( (lv_rea_2_0= ruleSlangReads ) )? ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_mod_4_0= ruleSlangModifies ) )? ( (lv_ens_5_0= ruleSlangEnsures ) )? ) | ( ( (lv_contracts_6_0= ruleSlangDefContractCase ) )+ ( (lv_rea_7_0= ruleSlangReads ) )? ( (lv_mod_8_0= ruleSlangModifies ) )? ) )
            {
            // InternalGumboParser.g:1940:3: ()
            // InternalGumboParser.g:1941:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSlangDefContractAccess().getSlangDefContractAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Spec,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSlangDefContractAccess().getSpecKeyword_1());
              		
            }
            // InternalGumboParser.g:1951:3: ( ( ( (lv_rea_2_0= ruleSlangReads ) )? ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_mod_4_0= ruleSlangModifies ) )? ( (lv_ens_5_0= ruleSlangEnsures ) )? ) | ( ( (lv_contracts_6_0= ruleSlangDefContractCase ) )+ ( (lv_rea_7_0= ruleSlangReads ) )? ( (lv_mod_8_0= ruleSlangModifies ) )? ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==EOF||(LA40_0>=Modifies && LA40_0<=Requires)||LA40_0==Ensures||LA40_0==Reads||LA40_0==ColonEqualsSign) ) {
                alt40=1;
            }
            else if ( (LA40_0==Case) ) {
                alt40=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalGumboParser.g:1952:4: ( ( (lv_rea_2_0= ruleSlangReads ) )? ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_mod_4_0= ruleSlangModifies ) )? ( (lv_ens_5_0= ruleSlangEnsures ) )? )
                    {
                    // InternalGumboParser.g:1952:4: ( ( (lv_rea_2_0= ruleSlangReads ) )? ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_mod_4_0= ruleSlangModifies ) )? ( (lv_ens_5_0= ruleSlangEnsures ) )? )
                    // InternalGumboParser.g:1953:5: ( (lv_rea_2_0= ruleSlangReads ) )? ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_mod_4_0= ruleSlangModifies ) )? ( (lv_ens_5_0= ruleSlangEnsures ) )?
                    {
                    // InternalGumboParser.g:1953:5: ( (lv_rea_2_0= ruleSlangReads ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==Reads) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalGumboParser.g:1954:6: (lv_rea_2_0= ruleSlangReads )
                            {
                            // InternalGumboParser.g:1954:6: (lv_rea_2_0= ruleSlangReads )
                            // InternalGumboParser.g:1955:7: lv_rea_2_0= ruleSlangReads
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSlangDefContractAccess().getReaSlangReadsParserRuleCall_2_0_0_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_40);
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

                    // InternalGumboParser.g:1972:5: ( (lv_req_3_0= ruleSlangRequires ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==Requires) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalGumboParser.g:1973:6: (lv_req_3_0= ruleSlangRequires )
                            {
                            // InternalGumboParser.g:1973:6: (lv_req_3_0= ruleSlangRequires )
                            // InternalGumboParser.g:1974:7: lv_req_3_0= ruleSlangRequires
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSlangDefContractAccess().getReqSlangRequiresParserRuleCall_2_0_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_41);
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

                    // InternalGumboParser.g:1991:5: ( (lv_mod_4_0= ruleSlangModifies ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==Modifies) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalGumboParser.g:1992:6: (lv_mod_4_0= ruleSlangModifies )
                            {
                            // InternalGumboParser.g:1992:6: (lv_mod_4_0= ruleSlangModifies )
                            // InternalGumboParser.g:1993:7: lv_mod_4_0= ruleSlangModifies
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSlangDefContractAccess().getModSlangModifiesParserRuleCall_2_0_2_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_42);
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

                    // InternalGumboParser.g:2010:5: ( (lv_ens_5_0= ruleSlangEnsures ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==Ensures) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalGumboParser.g:2011:6: (lv_ens_5_0= ruleSlangEnsures )
                            {
                            // InternalGumboParser.g:2011:6: (lv_ens_5_0= ruleSlangEnsures )
                            // InternalGumboParser.g:2012:7: lv_ens_5_0= ruleSlangEnsures
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
                    // InternalGumboParser.g:2031:4: ( ( (lv_contracts_6_0= ruleSlangDefContractCase ) )+ ( (lv_rea_7_0= ruleSlangReads ) )? ( (lv_mod_8_0= ruleSlangModifies ) )? )
                    {
                    // InternalGumboParser.g:2031:4: ( ( (lv_contracts_6_0= ruleSlangDefContractCase ) )+ ( (lv_rea_7_0= ruleSlangReads ) )? ( (lv_mod_8_0= ruleSlangModifies ) )? )
                    // InternalGumboParser.g:2032:5: ( (lv_contracts_6_0= ruleSlangDefContractCase ) )+ ( (lv_rea_7_0= ruleSlangReads ) )? ( (lv_mod_8_0= ruleSlangModifies ) )?
                    {
                    // InternalGumboParser.g:2032:5: ( (lv_contracts_6_0= ruleSlangDefContractCase ) )+
                    int cnt37=0;
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==Case) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalGumboParser.g:2033:6: (lv_contracts_6_0= ruleSlangDefContractCase )
                    	    {
                    	    // InternalGumboParser.g:2033:6: (lv_contracts_6_0= ruleSlangDefContractCase )
                    	    // InternalGumboParser.g:2034:7: lv_contracts_6_0= ruleSlangDefContractCase
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSlangDefContractAccess().getContractsSlangDefContractCaseParserRuleCall_2_1_0_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_39);
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
                    	    if ( cnt37 >= 1 ) break loop37;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(37, input);
                                throw eee;
                        }
                        cnt37++;
                    } while (true);

                    // InternalGumboParser.g:2051:5: ( (lv_rea_7_0= ruleSlangReads ) )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==Reads) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalGumboParser.g:2052:6: (lv_rea_7_0= ruleSlangReads )
                            {
                            // InternalGumboParser.g:2052:6: (lv_rea_7_0= ruleSlangReads )
                            // InternalGumboParser.g:2053:7: lv_rea_7_0= ruleSlangReads
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSlangDefContractAccess().getReaSlangReadsParserRuleCall_2_1_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_43);
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

                    // InternalGumboParser.g:2070:5: ( (lv_mod_8_0= ruleSlangModifies ) )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==Modifies) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalGumboParser.g:2071:6: (lv_mod_8_0= ruleSlangModifies )
                            {
                            // InternalGumboParser.g:2071:6: (lv_mod_8_0= ruleSlangModifies )
                            // InternalGumboParser.g:2072:7: lv_mod_8_0= ruleSlangModifies
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
    // InternalGumboParser.g:2095:1: entryRuleSlangDefContractCase returns [EObject current=null] : iv_ruleSlangDefContractCase= ruleSlangDefContractCase EOF ;
    public final EObject entryRuleSlangDefContractCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangDefContractCase = null;


        try {
            // InternalGumboParser.g:2095:61: (iv_ruleSlangDefContractCase= ruleSlangDefContractCase EOF )
            // InternalGumboParser.g:2096:2: iv_ruleSlangDefContractCase= ruleSlangDefContractCase EOF
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
    // InternalGumboParser.g:2102:1: ruleSlangDefContractCase returns [EObject current=null] : ( () otherlv_1= Case this_SLANG_STRING_2= RULE_SLANG_STRING ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_ens_4_0= ruleSlangEnsures ) )? ) ;
    public final EObject ruleSlangDefContractCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_SLANG_STRING_2=null;
        EObject lv_req_3_0 = null;

        EObject lv_ens_4_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2108:2: ( ( () otherlv_1= Case this_SLANG_STRING_2= RULE_SLANG_STRING ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_ens_4_0= ruleSlangEnsures ) )? ) )
            // InternalGumboParser.g:2109:2: ( () otherlv_1= Case this_SLANG_STRING_2= RULE_SLANG_STRING ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_ens_4_0= ruleSlangEnsures ) )? )
            {
            // InternalGumboParser.g:2109:2: ( () otherlv_1= Case this_SLANG_STRING_2= RULE_SLANG_STRING ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_ens_4_0= ruleSlangEnsures ) )? )
            // InternalGumboParser.g:2110:3: () otherlv_1= Case this_SLANG_STRING_2= RULE_SLANG_STRING ( (lv_req_3_0= ruleSlangRequires ) )? ( (lv_ens_4_0= ruleSlangEnsures ) )?
            {
            // InternalGumboParser.g:2110:3: ()
            // InternalGumboParser.g:2111:4: 
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
            this_SLANG_STRING_2=(Token)match(input,RULE_SLANG_STRING,FollowSets000.FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_SLANG_STRING_2, grammarAccess.getSlangDefContractCaseAccess().getSLANG_STRINGTerminalRuleCall_2());
              		
            }
            // InternalGumboParser.g:2125:3: ( (lv_req_3_0= ruleSlangRequires ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==Requires) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalGumboParser.g:2126:4: (lv_req_3_0= ruleSlangRequires )
                    {
                    // InternalGumboParser.g:2126:4: (lv_req_3_0= ruleSlangRequires )
                    // InternalGumboParser.g:2127:5: lv_req_3_0= ruleSlangRequires
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangDefContractCaseAccess().getReqSlangRequiresParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_42);
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

            // InternalGumboParser.g:2144:3: ( (lv_ens_4_0= ruleSlangEnsures ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==Ensures) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalGumboParser.g:2145:4: (lv_ens_4_0= ruleSlangEnsures )
                    {
                    // InternalGumboParser.g:2145:4: (lv_ens_4_0= ruleSlangEnsures )
                    // InternalGumboParser.g:2146:5: lv_ens_4_0= ruleSlangEnsures
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
    // InternalGumboParser.g:2167:1: entryRuleSlangSupr returns [EObject current=null] : iv_ruleSlangSupr= ruleSlangSupr EOF ;
    public final EObject entryRuleSlangSupr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangSupr = null;


        try {
            // InternalGumboParser.g:2167:50: (iv_ruleSlangSupr= ruleSlangSupr EOF )
            // InternalGumboParser.g:2168:2: iv_ruleSlangSupr= ruleSlangSupr EOF
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
    // InternalGumboParser.g:2174:1: ruleSlangSupr returns [EObject current=null] : ( ( (lv_name_0_0= ruleSlangName ) ) ( (lv_args_1_0= ruleSlangTypeArgs ) )? ) ;
    public final EObject ruleSlangSupr() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_args_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2180:2: ( ( ( (lv_name_0_0= ruleSlangName ) ) ( (lv_args_1_0= ruleSlangTypeArgs ) )? ) )
            // InternalGumboParser.g:2181:2: ( ( (lv_name_0_0= ruleSlangName ) ) ( (lv_args_1_0= ruleSlangTypeArgs ) )? )
            {
            // InternalGumboParser.g:2181:2: ( ( (lv_name_0_0= ruleSlangName ) ) ( (lv_args_1_0= ruleSlangTypeArgs ) )? )
            // InternalGumboParser.g:2182:3: ( (lv_name_0_0= ruleSlangName ) ) ( (lv_args_1_0= ruleSlangTypeArgs ) )?
            {
            // InternalGumboParser.g:2182:3: ( (lv_name_0_0= ruleSlangName ) )
            // InternalGumboParser.g:2183:4: (lv_name_0_0= ruleSlangName )
            {
            // InternalGumboParser.g:2183:4: (lv_name_0_0= ruleSlangName )
            // InternalGumboParser.g:2184:5: lv_name_0_0= ruleSlangName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangSuprAccess().getNameSlangNameParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_45);
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

            // InternalGumboParser.g:2201:3: ( (lv_args_1_0= ruleSlangTypeArgs ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==LeftSquareBracket) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalGumboParser.g:2202:4: (lv_args_1_0= ruleSlangTypeArgs )
                    {
                    // InternalGumboParser.g:2202:4: (lv_args_1_0= ruleSlangTypeArgs )
                    // InternalGumboParser.g:2203:5: lv_args_1_0= ruleSlangTypeArgs
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
    // InternalGumboParser.g:2224:1: entryRuleSlangName returns [String current=null] : iv_ruleSlangName= ruleSlangName EOF ;
    public final String entryRuleSlangName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSlangName = null;


        try {
            // InternalGumboParser.g:2224:49: (iv_ruleSlangName= ruleSlangName EOF )
            // InternalGumboParser.g:2225:2: iv_ruleSlangName= ruleSlangName EOF
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
    // InternalGumboParser.g:2231:1: ruleSlangName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleSlangName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalGumboParser.g:2237:2: ( (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) )
            // InternalGumboParser.g:2238:2: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
            {
            // InternalGumboParser.g:2238:2: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
            // InternalGumboParser.g:2239:3: this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getSlangNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalGumboParser.g:2246:3: (kw= FullStop this_ID_2= RULE_ID )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==FullStop) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalGumboParser.g:2247:4: kw= FullStop this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,FullStop,FollowSets000.FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getSlangNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_46); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getSlangNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop44;
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
    // InternalGumboParser.g:2264:1: entryRuleSlangInvariant returns [EObject current=null] : iv_ruleSlangInvariant= ruleSlangInvariant EOF ;
    public final EObject entryRuleSlangInvariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangInvariant = null;


        try {
            // InternalGumboParser.g:2264:55: (iv_ruleSlangInvariant= ruleSlangInvariant EOF )
            // InternalGumboParser.g:2265:2: iv_ruleSlangInvariant= ruleSlangInvariant EOF
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
    // InternalGumboParser.g:2271:1: ruleSlangInvariant returns [EObject current=null] : (otherlv_0= Invariant ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* ) ;
    public final EObject ruleSlangInvariant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exprs_1_0 = null;

        EObject lv_exprs_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2277:2: ( (otherlv_0= Invariant ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* ) )
            // InternalGumboParser.g:2278:2: (otherlv_0= Invariant ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* )
            {
            // InternalGumboParser.g:2278:2: (otherlv_0= Invariant ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* )
            // InternalGumboParser.g:2279:3: otherlv_0= Invariant ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )*
            {
            otherlv_0=(Token)match(input,Invariant,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangInvariantAccess().getInvariantKeyword_0());
              		
            }
            // InternalGumboParser.g:2283:3: ( (lv_exprs_1_0= ruleExpr ) )
            // InternalGumboParser.g:2284:4: (lv_exprs_1_0= ruleExpr )
            {
            // InternalGumboParser.g:2284:4: (lv_exprs_1_0= ruleExpr )
            // InternalGumboParser.g:2285:5: lv_exprs_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangInvariantAccess().getExprsExprParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_47);
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

            // InternalGumboParser.g:2302:3: (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==Comma) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalGumboParser.g:2303:4: otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FollowSets000.FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSlangInvariantAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalGumboParser.g:2307:4: ( (lv_exprs_3_0= ruleExpr ) )
            	    // InternalGumboParser.g:2308:5: (lv_exprs_3_0= ruleExpr )
            	    {
            	    // InternalGumboParser.g:2308:5: (lv_exprs_3_0= ruleExpr )
            	    // InternalGumboParser.g:2309:6: lv_exprs_3_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSlangInvariantAccess().getExprsExprParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_47);
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
            	    break loop45;
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
    // InternalGumboParser.g:2331:1: entryRuleSlangReads returns [EObject current=null] : iv_ruleSlangReads= ruleSlangReads EOF ;
    public final EObject entryRuleSlangReads() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangReads = null;


        try {
            // InternalGumboParser.g:2331:51: (iv_ruleSlangReads= ruleSlangReads EOF )
            // InternalGumboParser.g:2332:2: iv_ruleSlangReads= ruleSlangReads EOF
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
    // InternalGumboParser.g:2338:1: ruleSlangReads returns [EObject current=null] : (otherlv_0= Reads ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* ) ;
    public final EObject ruleSlangReads() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exprs_1_0 = null;

        EObject lv_exprs_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2344:2: ( (otherlv_0= Reads ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* ) )
            // InternalGumboParser.g:2345:2: (otherlv_0= Reads ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* )
            {
            // InternalGumboParser.g:2345:2: (otherlv_0= Reads ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* )
            // InternalGumboParser.g:2346:3: otherlv_0= Reads ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )*
            {
            otherlv_0=(Token)match(input,Reads,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangReadsAccess().getReadsKeyword_0());
              		
            }
            // InternalGumboParser.g:2350:3: ( (lv_exprs_1_0= ruleExpr ) )
            // InternalGumboParser.g:2351:4: (lv_exprs_1_0= ruleExpr )
            {
            // InternalGumboParser.g:2351:4: (lv_exprs_1_0= ruleExpr )
            // InternalGumboParser.g:2352:5: lv_exprs_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangReadsAccess().getExprsExprParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_47);
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

            // InternalGumboParser.g:2369:3: (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==Comma) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalGumboParser.g:2370:4: otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FollowSets000.FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSlangReadsAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalGumboParser.g:2374:4: ( (lv_exprs_3_0= ruleExpr ) )
            	    // InternalGumboParser.g:2375:5: (lv_exprs_3_0= ruleExpr )
            	    {
            	    // InternalGumboParser.g:2375:5: (lv_exprs_3_0= ruleExpr )
            	    // InternalGumboParser.g:2376:6: lv_exprs_3_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSlangReadsAccess().getExprsExprParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_47);
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
    // $ANTLR end "ruleSlangReads"


    // $ANTLR start "entryRuleSlangRequires"
    // InternalGumboParser.g:2398:1: entryRuleSlangRequires returns [EObject current=null] : iv_ruleSlangRequires= ruleSlangRequires EOF ;
    public final EObject entryRuleSlangRequires() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangRequires = null;


        try {
            // InternalGumboParser.g:2398:54: (iv_ruleSlangRequires= ruleSlangRequires EOF )
            // InternalGumboParser.g:2399:2: iv_ruleSlangRequires= ruleSlangRequires EOF
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
    // InternalGumboParser.g:2405:1: ruleSlangRequires returns [EObject current=null] : (otherlv_0= Requires ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* ) ;
    public final EObject ruleSlangRequires() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exprs_1_0 = null;

        EObject lv_exprs_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2411:2: ( (otherlv_0= Requires ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* ) )
            // InternalGumboParser.g:2412:2: (otherlv_0= Requires ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* )
            {
            // InternalGumboParser.g:2412:2: (otherlv_0= Requires ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* )
            // InternalGumboParser.g:2413:3: otherlv_0= Requires ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )*
            {
            otherlv_0=(Token)match(input,Requires,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangRequiresAccess().getRequiresKeyword_0());
              		
            }
            // InternalGumboParser.g:2417:3: ( (lv_exprs_1_0= ruleExpr ) )
            // InternalGumboParser.g:2418:4: (lv_exprs_1_0= ruleExpr )
            {
            // InternalGumboParser.g:2418:4: (lv_exprs_1_0= ruleExpr )
            // InternalGumboParser.g:2419:5: lv_exprs_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangRequiresAccess().getExprsExprParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_47);
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

            // InternalGumboParser.g:2436:3: (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==Comma) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalGumboParser.g:2437:4: otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FollowSets000.FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSlangRequiresAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalGumboParser.g:2441:4: ( (lv_exprs_3_0= ruleExpr ) )
            	    // InternalGumboParser.g:2442:5: (lv_exprs_3_0= ruleExpr )
            	    {
            	    // InternalGumboParser.g:2442:5: (lv_exprs_3_0= ruleExpr )
            	    // InternalGumboParser.g:2443:6: lv_exprs_3_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSlangRequiresAccess().getExprsExprParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_47);
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
    // $ANTLR end "ruleSlangRequires"


    // $ANTLR start "entryRuleSlangModifies"
    // InternalGumboParser.g:2465:1: entryRuleSlangModifies returns [EObject current=null] : iv_ruleSlangModifies= ruleSlangModifies EOF ;
    public final EObject entryRuleSlangModifies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangModifies = null;


        try {
            // InternalGumboParser.g:2465:54: (iv_ruleSlangModifies= ruleSlangModifies EOF )
            // InternalGumboParser.g:2466:2: iv_ruleSlangModifies= ruleSlangModifies EOF
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
    // InternalGumboParser.g:2472:1: ruleSlangModifies returns [EObject current=null] : (otherlv_0= Modifies ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* ) ;
    public final EObject ruleSlangModifies() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exprs_1_0 = null;

        EObject lv_exprs_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2478:2: ( (otherlv_0= Modifies ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* ) )
            // InternalGumboParser.g:2479:2: (otherlv_0= Modifies ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* )
            {
            // InternalGumboParser.g:2479:2: (otherlv_0= Modifies ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* )
            // InternalGumboParser.g:2480:3: otherlv_0= Modifies ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )*
            {
            otherlv_0=(Token)match(input,Modifies,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangModifiesAccess().getModifiesKeyword_0());
              		
            }
            // InternalGumboParser.g:2484:3: ( (lv_exprs_1_0= ruleExpr ) )
            // InternalGumboParser.g:2485:4: (lv_exprs_1_0= ruleExpr )
            {
            // InternalGumboParser.g:2485:4: (lv_exprs_1_0= ruleExpr )
            // InternalGumboParser.g:2486:5: lv_exprs_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangModifiesAccess().getExprsExprParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_47);
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

            // InternalGumboParser.g:2503:3: (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==Comma) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalGumboParser.g:2504:4: otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FollowSets000.FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSlangModifiesAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalGumboParser.g:2508:4: ( (lv_exprs_3_0= ruleExpr ) )
            	    // InternalGumboParser.g:2509:5: (lv_exprs_3_0= ruleExpr )
            	    {
            	    // InternalGumboParser.g:2509:5: (lv_exprs_3_0= ruleExpr )
            	    // InternalGumboParser.g:2510:6: lv_exprs_3_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSlangModifiesAccess().getExprsExprParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_47);
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
    // $ANTLR end "ruleSlangModifies"


    // $ANTLR start "entryRuleSlangEnsures"
    // InternalGumboParser.g:2532:1: entryRuleSlangEnsures returns [EObject current=null] : iv_ruleSlangEnsures= ruleSlangEnsures EOF ;
    public final EObject entryRuleSlangEnsures() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangEnsures = null;


        try {
            // InternalGumboParser.g:2532:53: (iv_ruleSlangEnsures= ruleSlangEnsures EOF )
            // InternalGumboParser.g:2533:2: iv_ruleSlangEnsures= ruleSlangEnsures EOF
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
    // InternalGumboParser.g:2539:1: ruleSlangEnsures returns [EObject current=null] : (otherlv_0= Ensures ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* ) ;
    public final EObject ruleSlangEnsures() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exprs_1_0 = null;

        EObject lv_exprs_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:2545:2: ( (otherlv_0= Ensures ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* ) )
            // InternalGumboParser.g:2546:2: (otherlv_0= Ensures ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* )
            {
            // InternalGumboParser.g:2546:2: (otherlv_0= Ensures ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )* )
            // InternalGumboParser.g:2547:3: otherlv_0= Ensures ( (lv_exprs_1_0= ruleExpr ) ) (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )*
            {
            otherlv_0=(Token)match(input,Ensures,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangEnsuresAccess().getEnsuresKeyword_0());
              		
            }
            // InternalGumboParser.g:2551:3: ( (lv_exprs_1_0= ruleExpr ) )
            // InternalGumboParser.g:2552:4: (lv_exprs_1_0= ruleExpr )
            {
            // InternalGumboParser.g:2552:4: (lv_exprs_1_0= ruleExpr )
            // InternalGumboParser.g:2553:5: lv_exprs_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangEnsuresAccess().getExprsExprParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_47);
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

            // InternalGumboParser.g:2570:3: (otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==Comma) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalGumboParser.g:2571:4: otherlv_2= Comma ( (lv_exprs_3_0= ruleExpr ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FollowSets000.FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSlangEnsuresAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalGumboParser.g:2575:4: ( (lv_exprs_3_0= ruleExpr ) )
            	    // InternalGumboParser.g:2576:5: (lv_exprs_3_0= ruleExpr )
            	    {
            	    // InternalGumboParser.g:2576:5: (lv_exprs_3_0= ruleExpr )
            	    // InternalGumboParser.g:2577:6: lv_exprs_3_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSlangEnsuresAccess().getExprsExprParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_47);
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
    // $ANTLR end "ruleSlangEnsures"


    // $ANTLR start "entryRuleSlangStmt"
    // InternalGumboParser.g:2599:1: entryRuleSlangStmt returns [EObject current=null] : iv_ruleSlangStmt= ruleSlangStmt EOF ;
    public final EObject entryRuleSlangStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangStmt = null;


        try {
            // InternalGumboParser.g:2599:50: (iv_ruleSlangStmt= ruleSlangStmt EOF )
            // InternalGumboParser.g:2600:2: iv_ruleSlangStmt= ruleSlangStmt EOF
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
    // InternalGumboParser.g:2606:1: ruleSlangStmt returns [EObject current=null] : ( ( () ( (lv_d_1_0= ruleSlangVarDef ) ) ) | ( () otherlv_3= If ( (lv_cond_4_0= ruleExpr ) ) ( (lv_b_5_0= ruleSlangBlock ) ) ( (lv_e_6_0= ruleSlangElse ) )? ) | ( () otherlv_8= While ( (lv_cond_9_0= ruleExpr ) ) ( (lv_l_10_0= ruleSlangLoopContract ) ) ( (lv_b_11_0= ruleSlangBlock ) ) ) | ( () otherlv_13= Match ( (lv_testExpr_14_0= ruleExpr ) ) otherlv_15= LeftCurlyBracket ( (lv_c_16_0= ruleSlangCase ) )* otherlv_17= RightCurlyBracket ) | ( () otherlv_19= Spec ( (lv_b_20_0= ruleSlangBlock ) ) ) | ( () otherlv_22= Assume ( (lv_e_23_0= ruleExpr ) ) (this_SLANG_STRING_24= RULE_SLANG_STRING )? ) | ( () otherlv_26= Assert ( (lv_e_27_0= ruleExpr ) ) (this_SLANG_STRING_28= RULE_SLANG_STRING )? ) | ( () otherlv_30= Halt (this_SLANG_STRING_31= RULE_SLANG_STRING )? ) | ( () otherlv_33= Do ( (lv_e_34_0= ruleExpr ) ) ) | ( () ( (otherlv_36= RULE_ID ) ) (otherlv_37= Colon | ( (otherlv_38= ColonEqualsSign | this_DEFOP_39= RULE_DEFOP ) ( (lv_e_40_0= ruleExpr ) ) )? ) ) ) ;
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
            // InternalGumboParser.g:2612:2: ( ( ( () ( (lv_d_1_0= ruleSlangVarDef ) ) ) | ( () otherlv_3= If ( (lv_cond_4_0= ruleExpr ) ) ( (lv_b_5_0= ruleSlangBlock ) ) ( (lv_e_6_0= ruleSlangElse ) )? ) | ( () otherlv_8= While ( (lv_cond_9_0= ruleExpr ) ) ( (lv_l_10_0= ruleSlangLoopContract ) ) ( (lv_b_11_0= ruleSlangBlock ) ) ) | ( () otherlv_13= Match ( (lv_testExpr_14_0= ruleExpr ) ) otherlv_15= LeftCurlyBracket ( (lv_c_16_0= ruleSlangCase ) )* otherlv_17= RightCurlyBracket ) | ( () otherlv_19= Spec ( (lv_b_20_0= ruleSlangBlock ) ) ) | ( () otherlv_22= Assume ( (lv_e_23_0= ruleExpr ) ) (this_SLANG_STRING_24= RULE_SLANG_STRING )? ) | ( () otherlv_26= Assert ( (lv_e_27_0= ruleExpr ) ) (this_SLANG_STRING_28= RULE_SLANG_STRING )? ) | ( () otherlv_30= Halt (this_SLANG_STRING_31= RULE_SLANG_STRING )? ) | ( () otherlv_33= Do ( (lv_e_34_0= ruleExpr ) ) ) | ( () ( (otherlv_36= RULE_ID ) ) (otherlv_37= Colon | ( (otherlv_38= ColonEqualsSign | this_DEFOP_39= RULE_DEFOP ) ( (lv_e_40_0= ruleExpr ) ) )? ) ) ) )
            // InternalGumboParser.g:2613:2: ( ( () ( (lv_d_1_0= ruleSlangVarDef ) ) ) | ( () otherlv_3= If ( (lv_cond_4_0= ruleExpr ) ) ( (lv_b_5_0= ruleSlangBlock ) ) ( (lv_e_6_0= ruleSlangElse ) )? ) | ( () otherlv_8= While ( (lv_cond_9_0= ruleExpr ) ) ( (lv_l_10_0= ruleSlangLoopContract ) ) ( (lv_b_11_0= ruleSlangBlock ) ) ) | ( () otherlv_13= Match ( (lv_testExpr_14_0= ruleExpr ) ) otherlv_15= LeftCurlyBracket ( (lv_c_16_0= ruleSlangCase ) )* otherlv_17= RightCurlyBracket ) | ( () otherlv_19= Spec ( (lv_b_20_0= ruleSlangBlock ) ) ) | ( () otherlv_22= Assume ( (lv_e_23_0= ruleExpr ) ) (this_SLANG_STRING_24= RULE_SLANG_STRING )? ) | ( () otherlv_26= Assert ( (lv_e_27_0= ruleExpr ) ) (this_SLANG_STRING_28= RULE_SLANG_STRING )? ) | ( () otherlv_30= Halt (this_SLANG_STRING_31= RULE_SLANG_STRING )? ) | ( () otherlv_33= Do ( (lv_e_34_0= ruleExpr ) ) ) | ( () ( (otherlv_36= RULE_ID ) ) (otherlv_37= Colon | ( (otherlv_38= ColonEqualsSign | this_DEFOP_39= RULE_DEFOP ) ( (lv_e_40_0= ruleExpr ) ) )? ) ) )
            {
            // InternalGumboParser.g:2613:2: ( ( () ( (lv_d_1_0= ruleSlangVarDef ) ) ) | ( () otherlv_3= If ( (lv_cond_4_0= ruleExpr ) ) ( (lv_b_5_0= ruleSlangBlock ) ) ( (lv_e_6_0= ruleSlangElse ) )? ) | ( () otherlv_8= While ( (lv_cond_9_0= ruleExpr ) ) ( (lv_l_10_0= ruleSlangLoopContract ) ) ( (lv_b_11_0= ruleSlangBlock ) ) ) | ( () otherlv_13= Match ( (lv_testExpr_14_0= ruleExpr ) ) otherlv_15= LeftCurlyBracket ( (lv_c_16_0= ruleSlangCase ) )* otherlv_17= RightCurlyBracket ) | ( () otherlv_19= Spec ( (lv_b_20_0= ruleSlangBlock ) ) ) | ( () otherlv_22= Assume ( (lv_e_23_0= ruleExpr ) ) (this_SLANG_STRING_24= RULE_SLANG_STRING )? ) | ( () otherlv_26= Assert ( (lv_e_27_0= ruleExpr ) ) (this_SLANG_STRING_28= RULE_SLANG_STRING )? ) | ( () otherlv_30= Halt (this_SLANG_STRING_31= RULE_SLANG_STRING )? ) | ( () otherlv_33= Do ( (lv_e_34_0= ruleExpr ) ) ) | ( () ( (otherlv_36= RULE_ID ) ) (otherlv_37= Colon | ( (otherlv_38= ColonEqualsSign | this_DEFOP_39= RULE_DEFOP ) ( (lv_e_40_0= ruleExpr ) ) )? ) ) )
            int alt58=10;
            switch ( input.LA(1) ) {
            case Val:
            case Var:
                {
                alt58=1;
                }
                break;
            case If:
                {
                alt58=2;
                }
                break;
            case While:
                {
                alt58=3;
                }
                break;
            case Match:
                {
                alt58=4;
                }
                break;
            case Spec:
                {
                alt58=5;
                }
                break;
            case Assume:
                {
                alt58=6;
                }
                break;
            case Assert:
                {
                alt58=7;
                }
                break;
            case Halt:
                {
                alt58=8;
                }
                break;
            case Do:
                {
                alt58=9;
                }
                break;
            case RULE_ID:
                {
                alt58=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // InternalGumboParser.g:2614:3: ( () ( (lv_d_1_0= ruleSlangVarDef ) ) )
                    {
                    // InternalGumboParser.g:2614:3: ( () ( (lv_d_1_0= ruleSlangVarDef ) ) )
                    // InternalGumboParser.g:2615:4: () ( (lv_d_1_0= ruleSlangVarDef ) )
                    {
                    // InternalGumboParser.g:2615:4: ()
                    // InternalGumboParser.g:2616:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangStmtAccess().getSlangVarDefAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:2622:4: ( (lv_d_1_0= ruleSlangVarDef ) )
                    // InternalGumboParser.g:2623:5: (lv_d_1_0= ruleSlangVarDef )
                    {
                    // InternalGumboParser.g:2623:5: (lv_d_1_0= ruleSlangVarDef )
                    // InternalGumboParser.g:2624:6: lv_d_1_0= ruleSlangVarDef
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
                    // InternalGumboParser.g:2643:3: ( () otherlv_3= If ( (lv_cond_4_0= ruleExpr ) ) ( (lv_b_5_0= ruleSlangBlock ) ) ( (lv_e_6_0= ruleSlangElse ) )? )
                    {
                    // InternalGumboParser.g:2643:3: ( () otherlv_3= If ( (lv_cond_4_0= ruleExpr ) ) ( (lv_b_5_0= ruleSlangBlock ) ) ( (lv_e_6_0= ruleSlangElse ) )? )
                    // InternalGumboParser.g:2644:4: () otherlv_3= If ( (lv_cond_4_0= ruleExpr ) ) ( (lv_b_5_0= ruleSlangBlock ) ) ( (lv_e_6_0= ruleSlangElse ) )?
                    {
                    // InternalGumboParser.g:2644:4: ()
                    // InternalGumboParser.g:2645:5: 
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
                    // InternalGumboParser.g:2655:4: ( (lv_cond_4_0= ruleExpr ) )
                    // InternalGumboParser.g:2656:5: (lv_cond_4_0= ruleExpr )
                    {
                    // InternalGumboParser.g:2656:5: (lv_cond_4_0= ruleExpr )
                    // InternalGumboParser.g:2657:6: lv_cond_4_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangStmtAccess().getCondExprParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_48);
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

                    // InternalGumboParser.g:2674:4: ( (lv_b_5_0= ruleSlangBlock ) )
                    // InternalGumboParser.g:2675:5: (lv_b_5_0= ruleSlangBlock )
                    {
                    // InternalGumboParser.g:2675:5: (lv_b_5_0= ruleSlangBlock )
                    // InternalGumboParser.g:2676:6: lv_b_5_0= ruleSlangBlock
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangStmtAccess().getBSlangBlockParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_49);
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

                    // InternalGumboParser.g:2693:4: ( (lv_e_6_0= ruleSlangElse ) )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==Else) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // InternalGumboParser.g:2694:5: (lv_e_6_0= ruleSlangElse )
                            {
                            // InternalGumboParser.g:2694:5: (lv_e_6_0= ruleSlangElse )
                            // InternalGumboParser.g:2695:6: lv_e_6_0= ruleSlangElse
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
                    // InternalGumboParser.g:2714:3: ( () otherlv_8= While ( (lv_cond_9_0= ruleExpr ) ) ( (lv_l_10_0= ruleSlangLoopContract ) ) ( (lv_b_11_0= ruleSlangBlock ) ) )
                    {
                    // InternalGumboParser.g:2714:3: ( () otherlv_8= While ( (lv_cond_9_0= ruleExpr ) ) ( (lv_l_10_0= ruleSlangLoopContract ) ) ( (lv_b_11_0= ruleSlangBlock ) ) )
                    // InternalGumboParser.g:2715:4: () otherlv_8= While ( (lv_cond_9_0= ruleExpr ) ) ( (lv_l_10_0= ruleSlangLoopContract ) ) ( (lv_b_11_0= ruleSlangBlock ) )
                    {
                    // InternalGumboParser.g:2715:4: ()
                    // InternalGumboParser.g:2716:5: 
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
                    // InternalGumboParser.g:2726:4: ( (lv_cond_9_0= ruleExpr ) )
                    // InternalGumboParser.g:2727:5: (lv_cond_9_0= ruleExpr )
                    {
                    // InternalGumboParser.g:2727:5: (lv_cond_9_0= ruleExpr )
                    // InternalGumboParser.g:2728:6: lv_cond_9_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangStmtAccess().getCondExprParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_50);
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

                    // InternalGumboParser.g:2745:4: ( (lv_l_10_0= ruleSlangLoopContract ) )
                    // InternalGumboParser.g:2746:5: (lv_l_10_0= ruleSlangLoopContract )
                    {
                    // InternalGumboParser.g:2746:5: (lv_l_10_0= ruleSlangLoopContract )
                    // InternalGumboParser.g:2747:6: lv_l_10_0= ruleSlangLoopContract
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangStmtAccess().getLSlangLoopContractParserRuleCall_2_3_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_48);
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

                    // InternalGumboParser.g:2764:4: ( (lv_b_11_0= ruleSlangBlock ) )
                    // InternalGumboParser.g:2765:5: (lv_b_11_0= ruleSlangBlock )
                    {
                    // InternalGumboParser.g:2765:5: (lv_b_11_0= ruleSlangBlock )
                    // InternalGumboParser.g:2766:6: lv_b_11_0= ruleSlangBlock
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
                    // InternalGumboParser.g:2785:3: ( () otherlv_13= Match ( (lv_testExpr_14_0= ruleExpr ) ) otherlv_15= LeftCurlyBracket ( (lv_c_16_0= ruleSlangCase ) )* otherlv_17= RightCurlyBracket )
                    {
                    // InternalGumboParser.g:2785:3: ( () otherlv_13= Match ( (lv_testExpr_14_0= ruleExpr ) ) otherlv_15= LeftCurlyBracket ( (lv_c_16_0= ruleSlangCase ) )* otherlv_17= RightCurlyBracket )
                    // InternalGumboParser.g:2786:4: () otherlv_13= Match ( (lv_testExpr_14_0= ruleExpr ) ) otherlv_15= LeftCurlyBracket ( (lv_c_16_0= ruleSlangCase ) )* otherlv_17= RightCurlyBracket
                    {
                    // InternalGumboParser.g:2786:4: ()
                    // InternalGumboParser.g:2787:5: 
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
                    // InternalGumboParser.g:2797:4: ( (lv_testExpr_14_0= ruleExpr ) )
                    // InternalGumboParser.g:2798:5: (lv_testExpr_14_0= ruleExpr )
                    {
                    // InternalGumboParser.g:2798:5: (lv_testExpr_14_0= ruleExpr )
                    // InternalGumboParser.g:2799:6: lv_testExpr_14_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangStmtAccess().getTestExprExprParserRuleCall_3_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_48);
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

                    otherlv_15=(Token)match(input,LeftCurlyBracket,FollowSets000.FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getSlangStmtAccess().getLeftCurlyBracketKeyword_3_3());
                      			
                    }
                    // InternalGumboParser.g:2820:4: ( (lv_c_16_0= ruleSlangCase ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==Case) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalGumboParser.g:2821:5: (lv_c_16_0= ruleSlangCase )
                    	    {
                    	    // InternalGumboParser.g:2821:5: (lv_c_16_0= ruleSlangCase )
                    	    // InternalGumboParser.g:2822:6: lv_c_16_0= ruleSlangCase
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getSlangStmtAccess().getCSlangCaseParserRuleCall_3_4_0());
                    	      					
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_51);
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
                    	    break loop51;
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
                    // InternalGumboParser.g:2845:3: ( () otherlv_19= Spec ( (lv_b_20_0= ruleSlangBlock ) ) )
                    {
                    // InternalGumboParser.g:2845:3: ( () otherlv_19= Spec ( (lv_b_20_0= ruleSlangBlock ) ) )
                    // InternalGumboParser.g:2846:4: () otherlv_19= Spec ( (lv_b_20_0= ruleSlangBlock ) )
                    {
                    // InternalGumboParser.g:2846:4: ()
                    // InternalGumboParser.g:2847:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangStmtAccess().getSlangSpecStmtAction_4_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_19=(Token)match(input,Spec,FollowSets000.FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getSlangStmtAccess().getSpecKeyword_4_1());
                      			
                    }
                    // InternalGumboParser.g:2857:4: ( (lv_b_20_0= ruleSlangBlock ) )
                    // InternalGumboParser.g:2858:5: (lv_b_20_0= ruleSlangBlock )
                    {
                    // InternalGumboParser.g:2858:5: (lv_b_20_0= ruleSlangBlock )
                    // InternalGumboParser.g:2859:6: lv_b_20_0= ruleSlangBlock
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
                    // InternalGumboParser.g:2878:3: ( () otherlv_22= Assume ( (lv_e_23_0= ruleExpr ) ) (this_SLANG_STRING_24= RULE_SLANG_STRING )? )
                    {
                    // InternalGumboParser.g:2878:3: ( () otherlv_22= Assume ( (lv_e_23_0= ruleExpr ) ) (this_SLANG_STRING_24= RULE_SLANG_STRING )? )
                    // InternalGumboParser.g:2879:4: () otherlv_22= Assume ( (lv_e_23_0= ruleExpr ) ) (this_SLANG_STRING_24= RULE_SLANG_STRING )?
                    {
                    // InternalGumboParser.g:2879:4: ()
                    // InternalGumboParser.g:2880:5: 
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
                    // InternalGumboParser.g:2890:4: ( (lv_e_23_0= ruleExpr ) )
                    // InternalGumboParser.g:2891:5: (lv_e_23_0= ruleExpr )
                    {
                    // InternalGumboParser.g:2891:5: (lv_e_23_0= ruleExpr )
                    // InternalGumboParser.g:2892:6: lv_e_23_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangStmtAccess().getEExprParserRuleCall_5_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_52);
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

                    // InternalGumboParser.g:2909:4: (this_SLANG_STRING_24= RULE_SLANG_STRING )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==RULE_SLANG_STRING) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // InternalGumboParser.g:2910:5: this_SLANG_STRING_24= RULE_SLANG_STRING
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
                    // InternalGumboParser.g:2917:3: ( () otherlv_26= Assert ( (lv_e_27_0= ruleExpr ) ) (this_SLANG_STRING_28= RULE_SLANG_STRING )? )
                    {
                    // InternalGumboParser.g:2917:3: ( () otherlv_26= Assert ( (lv_e_27_0= ruleExpr ) ) (this_SLANG_STRING_28= RULE_SLANG_STRING )? )
                    // InternalGumboParser.g:2918:4: () otherlv_26= Assert ( (lv_e_27_0= ruleExpr ) ) (this_SLANG_STRING_28= RULE_SLANG_STRING )?
                    {
                    // InternalGumboParser.g:2918:4: ()
                    // InternalGumboParser.g:2919:5: 
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
                    // InternalGumboParser.g:2929:4: ( (lv_e_27_0= ruleExpr ) )
                    // InternalGumboParser.g:2930:5: (lv_e_27_0= ruleExpr )
                    {
                    // InternalGumboParser.g:2930:5: (lv_e_27_0= ruleExpr )
                    // InternalGumboParser.g:2931:6: lv_e_27_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangStmtAccess().getEExprParserRuleCall_6_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_52);
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

                    // InternalGumboParser.g:2948:4: (this_SLANG_STRING_28= RULE_SLANG_STRING )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==RULE_SLANG_STRING) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // InternalGumboParser.g:2949:5: this_SLANG_STRING_28= RULE_SLANG_STRING
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
                    // InternalGumboParser.g:2956:3: ( () otherlv_30= Halt (this_SLANG_STRING_31= RULE_SLANG_STRING )? )
                    {
                    // InternalGumboParser.g:2956:3: ( () otherlv_30= Halt (this_SLANG_STRING_31= RULE_SLANG_STRING )? )
                    // InternalGumboParser.g:2957:4: () otherlv_30= Halt (this_SLANG_STRING_31= RULE_SLANG_STRING )?
                    {
                    // InternalGumboParser.g:2957:4: ()
                    // InternalGumboParser.g:2958:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangStmtAccess().getSlangHaltStmtAction_7_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_30=(Token)match(input,Halt,FollowSets000.FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_30, grammarAccess.getSlangStmtAccess().getHaltKeyword_7_1());
                      			
                    }
                    // InternalGumboParser.g:2968:4: (this_SLANG_STRING_31= RULE_SLANG_STRING )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==RULE_SLANG_STRING) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // InternalGumboParser.g:2969:5: this_SLANG_STRING_31= RULE_SLANG_STRING
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
                    // InternalGumboParser.g:2976:3: ( () otherlv_33= Do ( (lv_e_34_0= ruleExpr ) ) )
                    {
                    // InternalGumboParser.g:2976:3: ( () otherlv_33= Do ( (lv_e_34_0= ruleExpr ) ) )
                    // InternalGumboParser.g:2977:4: () otherlv_33= Do ( (lv_e_34_0= ruleExpr ) )
                    {
                    // InternalGumboParser.g:2977:4: ()
                    // InternalGumboParser.g:2978:5: 
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
                    // InternalGumboParser.g:2988:4: ( (lv_e_34_0= ruleExpr ) )
                    // InternalGumboParser.g:2989:5: (lv_e_34_0= ruleExpr )
                    {
                    // InternalGumboParser.g:2989:5: (lv_e_34_0= ruleExpr )
                    // InternalGumboParser.g:2990:6: lv_e_34_0= ruleExpr
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
                    // InternalGumboParser.g:3009:3: ( () ( (otherlv_36= RULE_ID ) ) (otherlv_37= Colon | ( (otherlv_38= ColonEqualsSign | this_DEFOP_39= RULE_DEFOP ) ( (lv_e_40_0= ruleExpr ) ) )? ) )
                    {
                    // InternalGumboParser.g:3009:3: ( () ( (otherlv_36= RULE_ID ) ) (otherlv_37= Colon | ( (otherlv_38= ColonEqualsSign | this_DEFOP_39= RULE_DEFOP ) ( (lv_e_40_0= ruleExpr ) ) )? ) )
                    // InternalGumboParser.g:3010:4: () ( (otherlv_36= RULE_ID ) ) (otherlv_37= Colon | ( (otherlv_38= ColonEqualsSign | this_DEFOP_39= RULE_DEFOP ) ( (lv_e_40_0= ruleExpr ) ) )? )
                    {
                    // InternalGumboParser.g:3010:4: ()
                    // InternalGumboParser.g:3011:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangStmtAccess().getSlangIdStmtAction_9_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:3017:4: ( (otherlv_36= RULE_ID ) )
                    // InternalGumboParser.g:3018:5: (otherlv_36= RULE_ID )
                    {
                    // InternalGumboParser.g:3018:5: (otherlv_36= RULE_ID )
                    // InternalGumboParser.g:3019:6: otherlv_36= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSlangStmtRule());
                      						}
                      					
                    }
                    otherlv_36=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_36, grammarAccess.getSlangStmtAccess().getPortOrSubcomponentOrStateVarEObjectCrossReference_9_1_0());
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:3030:4: (otherlv_37= Colon | ( (otherlv_38= ColonEqualsSign | this_DEFOP_39= RULE_DEFOP ) ( (lv_e_40_0= ruleExpr ) ) )? )
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==Colon) ) {
                        alt57=1;
                    }
                    else if ( (LA57_0==EOF||(LA57_0>=Assert && LA57_0<=Return)||LA57_0==Match||LA57_0==While||LA57_0==Case||(LA57_0>=Halt && LA57_0<=Spec)||(LA57_0>=Val && LA57_0<=Var)||LA57_0==ColonEqualsSign||(LA57_0>=Do && LA57_0<=If)||LA57_0==RightCurlyBracket||LA57_0==RULE_DEFOP||LA57_0==RULE_ID) ) {
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
                            // InternalGumboParser.g:3031:5: otherlv_37= Colon
                            {
                            otherlv_37=(Token)match(input,Colon,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_37, grammarAccess.getSlangStmtAccess().getColonKeyword_9_2_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalGumboParser.g:3036:5: ( (otherlv_38= ColonEqualsSign | this_DEFOP_39= RULE_DEFOP ) ( (lv_e_40_0= ruleExpr ) ) )?
                            {
                            // InternalGumboParser.g:3036:5: ( (otherlv_38= ColonEqualsSign | this_DEFOP_39= RULE_DEFOP ) ( (lv_e_40_0= ruleExpr ) ) )?
                            int alt56=2;
                            int LA56_0 = input.LA(1);

                            if ( (LA56_0==ColonEqualsSign||LA56_0==RULE_DEFOP) ) {
                                alt56=1;
                            }
                            switch (alt56) {
                                case 1 :
                                    // InternalGumboParser.g:3037:6: (otherlv_38= ColonEqualsSign | this_DEFOP_39= RULE_DEFOP ) ( (lv_e_40_0= ruleExpr ) )
                                    {
                                    // InternalGumboParser.g:3037:6: (otherlv_38= ColonEqualsSign | this_DEFOP_39= RULE_DEFOP )
                                    int alt55=2;
                                    int LA55_0 = input.LA(1);

                                    if ( (LA55_0==ColonEqualsSign) ) {
                                        alt55=1;
                                    }
                                    else if ( (LA55_0==RULE_DEFOP) ) {
                                        alt55=2;
                                    }
                                    else {
                                        if (state.backtracking>0) {state.failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 55, 0, input);

                                        throw nvae;
                                    }
                                    switch (alt55) {
                                        case 1 :
                                            // InternalGumboParser.g:3038:7: otherlv_38= ColonEqualsSign
                                            {
                                            otherlv_38=(Token)match(input,ColonEqualsSign,FollowSets000.FOLLOW_17); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                              							newLeafNode(otherlv_38, grammarAccess.getSlangStmtAccess().getColonEqualsSignKeyword_9_2_1_0_0());
                                              						
                                            }

                                            }
                                            break;
                                        case 2 :
                                            // InternalGumboParser.g:3043:7: this_DEFOP_39= RULE_DEFOP
                                            {
                                            this_DEFOP_39=(Token)match(input,RULE_DEFOP,FollowSets000.FOLLOW_17); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                              							newLeafNode(this_DEFOP_39, grammarAccess.getSlangStmtAccess().getDEFOPTerminalRuleCall_9_2_1_0_1());
                                              						
                                            }

                                            }
                                            break;

                                    }

                                    // InternalGumboParser.g:3048:6: ( (lv_e_40_0= ruleExpr ) )
                                    // InternalGumboParser.g:3049:7: (lv_e_40_0= ruleExpr )
                                    {
                                    // InternalGumboParser.g:3049:7: (lv_e_40_0= ruleExpr )
                                    // InternalGumboParser.g:3050:8: lv_e_40_0= ruleExpr
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
    // InternalGumboParser.g:3074:1: entryRuleSlangElse returns [EObject current=null] : iv_ruleSlangElse= ruleSlangElse EOF ;
    public final EObject entryRuleSlangElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangElse = null;


        try {
            // InternalGumboParser.g:3074:50: (iv_ruleSlangElse= ruleSlangElse EOF )
            // InternalGumboParser.g:3075:2: iv_ruleSlangElse= ruleSlangElse EOF
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
    // InternalGumboParser.g:3081:1: ruleSlangElse returns [EObject current=null] : (otherlv_0= Else ( (otherlv_1= If ( (lv_cond_2_0= ruleExpr ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )? ) | this_SlangBlock_5= ruleSlangBlock ) ) ;
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
            // InternalGumboParser.g:3087:2: ( (otherlv_0= Else ( (otherlv_1= If ( (lv_cond_2_0= ruleExpr ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )? ) | this_SlangBlock_5= ruleSlangBlock ) ) )
            // InternalGumboParser.g:3088:2: (otherlv_0= Else ( (otherlv_1= If ( (lv_cond_2_0= ruleExpr ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )? ) | this_SlangBlock_5= ruleSlangBlock ) )
            {
            // InternalGumboParser.g:3088:2: (otherlv_0= Else ( (otherlv_1= If ( (lv_cond_2_0= ruleExpr ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )? ) | this_SlangBlock_5= ruleSlangBlock ) )
            // InternalGumboParser.g:3089:3: otherlv_0= Else ( (otherlv_1= If ( (lv_cond_2_0= ruleExpr ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )? ) | this_SlangBlock_5= ruleSlangBlock )
            {
            otherlv_0=(Token)match(input,Else,FollowSets000.FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangElseAccess().getElseKeyword_0());
              		
            }
            // InternalGumboParser.g:3093:3: ( (otherlv_1= If ( (lv_cond_2_0= ruleExpr ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )? ) | this_SlangBlock_5= ruleSlangBlock )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==If) ) {
                alt60=1;
            }
            else if ( (LA60_0==LeftCurlyBracket) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // InternalGumboParser.g:3094:4: (otherlv_1= If ( (lv_cond_2_0= ruleExpr ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )? )
                    {
                    // InternalGumboParser.g:3094:4: (otherlv_1= If ( (lv_cond_2_0= ruleExpr ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )? )
                    // InternalGumboParser.g:3095:5: otherlv_1= If ( (lv_cond_2_0= ruleExpr ) ) ( (lv_b_3_0= ruleSlangBlock ) ) ( (lv_e_4_0= ruleSlangElse ) )?
                    {
                    otherlv_1=(Token)match(input,If,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getSlangElseAccess().getIfKeyword_1_0_0());
                      				
                    }
                    // InternalGumboParser.g:3099:5: ( (lv_cond_2_0= ruleExpr ) )
                    // InternalGumboParser.g:3100:6: (lv_cond_2_0= ruleExpr )
                    {
                    // InternalGumboParser.g:3100:6: (lv_cond_2_0= ruleExpr )
                    // InternalGumboParser.g:3101:7: lv_cond_2_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSlangElseAccess().getCondExprParserRuleCall_1_0_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_48);
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

                    // InternalGumboParser.g:3118:5: ( (lv_b_3_0= ruleSlangBlock ) )
                    // InternalGumboParser.g:3119:6: (lv_b_3_0= ruleSlangBlock )
                    {
                    // InternalGumboParser.g:3119:6: (lv_b_3_0= ruleSlangBlock )
                    // InternalGumboParser.g:3120:7: lv_b_3_0= ruleSlangBlock
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSlangElseAccess().getBSlangBlockParserRuleCall_1_0_2_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_49);
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

                    // InternalGumboParser.g:3137:5: ( (lv_e_4_0= ruleSlangElse ) )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==Else) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // InternalGumboParser.g:3138:6: (lv_e_4_0= ruleSlangElse )
                            {
                            // InternalGumboParser.g:3138:6: (lv_e_4_0= ruleSlangElse )
                            // InternalGumboParser.g:3139:7: lv_e_4_0= ruleSlangElse
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
                    // InternalGumboParser.g:3158:4: this_SlangBlock_5= ruleSlangBlock
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
    // InternalGumboParser.g:3171:1: entryRuleSlangLoopContract returns [EObject current=null] : iv_ruleSlangLoopContract= ruleSlangLoopContract EOF ;
    public final EObject entryRuleSlangLoopContract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangLoopContract = null;


        try {
            // InternalGumboParser.g:3171:58: (iv_ruleSlangLoopContract= ruleSlangLoopContract EOF )
            // InternalGumboParser.g:3172:2: iv_ruleSlangLoopContract= ruleSlangLoopContract EOF
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
    // InternalGumboParser.g:3178:1: ruleSlangLoopContract returns [EObject current=null] : ( () ( (lv_inv_1_0= ruleSlangInvariant ) )? ( (lv_mod_2_0= ruleSlangModifies ) )? ) ;
    public final EObject ruleSlangLoopContract() throws RecognitionException {
        EObject current = null;

        EObject lv_inv_1_0 = null;

        EObject lv_mod_2_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:3184:2: ( ( () ( (lv_inv_1_0= ruleSlangInvariant ) )? ( (lv_mod_2_0= ruleSlangModifies ) )? ) )
            // InternalGumboParser.g:3185:2: ( () ( (lv_inv_1_0= ruleSlangInvariant ) )? ( (lv_mod_2_0= ruleSlangModifies ) )? )
            {
            // InternalGumboParser.g:3185:2: ( () ( (lv_inv_1_0= ruleSlangInvariant ) )? ( (lv_mod_2_0= ruleSlangModifies ) )? )
            // InternalGumboParser.g:3186:3: () ( (lv_inv_1_0= ruleSlangInvariant ) )? ( (lv_mod_2_0= ruleSlangModifies ) )?
            {
            // InternalGumboParser.g:3186:3: ()
            // InternalGumboParser.g:3187:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSlangLoopContractAccess().getSlangLoopContractAction_0(),
              					current);
              			
            }

            }

            // InternalGumboParser.g:3193:3: ( (lv_inv_1_0= ruleSlangInvariant ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==Invariant) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalGumboParser.g:3194:4: (lv_inv_1_0= ruleSlangInvariant )
                    {
                    // InternalGumboParser.g:3194:4: (lv_inv_1_0= ruleSlangInvariant )
                    // InternalGumboParser.g:3195:5: lv_inv_1_0= ruleSlangInvariant
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangLoopContractAccess().getInvSlangInvariantParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_43);
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

            // InternalGumboParser.g:3212:3: ( (lv_mod_2_0= ruleSlangModifies ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==Modifies) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalGumboParser.g:3213:4: (lv_mod_2_0= ruleSlangModifies )
                    {
                    // InternalGumboParser.g:3213:4: (lv_mod_2_0= ruleSlangModifies )
                    // InternalGumboParser.g:3214:5: lv_mod_2_0= ruleSlangModifies
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
    // InternalGumboParser.g:3235:1: entryRuleSlangCase returns [EObject current=null] : iv_ruleSlangCase= ruleSlangCase EOF ;
    public final EObject entryRuleSlangCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangCase = null;


        try {
            // InternalGumboParser.g:3235:50: (iv_ruleSlangCase= ruleSlangCase EOF )
            // InternalGumboParser.g:3236:2: iv_ruleSlangCase= ruleSlangCase EOF
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
    // InternalGumboParser.g:3242:1: ruleSlangCase returns [EObject current=null] : (otherlv_0= Case ( (lv_pattern_1_0= ruleSlangPattern ) ) (otherlv_2= If ( (lv_e_3_0= ruleExpr ) ) )? otherlv_4= EqualsSignGreaterThanSign ( (lv_s_5_0= ruleSlangStmt ) )* ) ;
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
            // InternalGumboParser.g:3248:2: ( (otherlv_0= Case ( (lv_pattern_1_0= ruleSlangPattern ) ) (otherlv_2= If ( (lv_e_3_0= ruleExpr ) ) )? otherlv_4= EqualsSignGreaterThanSign ( (lv_s_5_0= ruleSlangStmt ) )* ) )
            // InternalGumboParser.g:3249:2: (otherlv_0= Case ( (lv_pattern_1_0= ruleSlangPattern ) ) (otherlv_2= If ( (lv_e_3_0= ruleExpr ) ) )? otherlv_4= EqualsSignGreaterThanSign ( (lv_s_5_0= ruleSlangStmt ) )* )
            {
            // InternalGumboParser.g:3249:2: (otherlv_0= Case ( (lv_pattern_1_0= ruleSlangPattern ) ) (otherlv_2= If ( (lv_e_3_0= ruleExpr ) ) )? otherlv_4= EqualsSignGreaterThanSign ( (lv_s_5_0= ruleSlangStmt ) )* )
            // InternalGumboParser.g:3250:3: otherlv_0= Case ( (lv_pattern_1_0= ruleSlangPattern ) ) (otherlv_2= If ( (lv_e_3_0= ruleExpr ) ) )? otherlv_4= EqualsSignGreaterThanSign ( (lv_s_5_0= ruleSlangStmt ) )*
            {
            otherlv_0=(Token)match(input,Case,FollowSets000.FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangCaseAccess().getCaseKeyword_0());
              		
            }
            // InternalGumboParser.g:3254:3: ( (lv_pattern_1_0= ruleSlangPattern ) )
            // InternalGumboParser.g:3255:4: (lv_pattern_1_0= ruleSlangPattern )
            {
            // InternalGumboParser.g:3255:4: (lv_pattern_1_0= ruleSlangPattern )
            // InternalGumboParser.g:3256:5: lv_pattern_1_0= ruleSlangPattern
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangCaseAccess().getPatternSlangPatternParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_56);
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

            // InternalGumboParser.g:3273:3: (otherlv_2= If ( (lv_e_3_0= ruleExpr ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==If) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalGumboParser.g:3274:4: otherlv_2= If ( (lv_e_3_0= ruleExpr ) )
                    {
                    otherlv_2=(Token)match(input,If,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSlangCaseAccess().getIfKeyword_2_0());
                      			
                    }
                    // InternalGumboParser.g:3278:4: ( (lv_e_3_0= ruleExpr ) )
                    // InternalGumboParser.g:3279:5: (lv_e_3_0= ruleExpr )
                    {
                    // InternalGumboParser.g:3279:5: (lv_e_3_0= ruleExpr )
                    // InternalGumboParser.g:3280:6: lv_e_3_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangCaseAccess().getEExprParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_57);
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

            otherlv_4=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getSlangCaseAccess().getEqualsSignGreaterThanSignKeyword_3());
              		
            }
            // InternalGumboParser.g:3302:3: ( (lv_s_5_0= ruleSlangStmt ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( ((LA64_0>=Assert && LA64_0<=Assume)||LA64_0==Match||LA64_0==While||(LA64_0>=Halt && LA64_0<=Spec)||(LA64_0>=Val && LA64_0<=Var)||(LA64_0>=Do && LA64_0<=If)||LA64_0==RULE_ID) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalGumboParser.g:3303:4: (lv_s_5_0= ruleSlangStmt )
            	    {
            	    // InternalGumboParser.g:3303:4: (lv_s_5_0= ruleSlangStmt )
            	    // InternalGumboParser.g:3304:5: lv_s_5_0= ruleSlangStmt
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSlangCaseAccess().getSSlangStmtParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_58);
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
            	    break loop64;
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
    // InternalGumboParser.g:3325:1: entryRuleSlangPattern returns [EObject current=null] : iv_ruleSlangPattern= ruleSlangPattern EOF ;
    public final EObject entryRuleSlangPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangPattern = null;


        try {
            // InternalGumboParser.g:3325:53: (iv_ruleSlangPattern= ruleSlangPattern EOF )
            // InternalGumboParser.g:3326:2: iv_ruleSlangPattern= ruleSlangPattern EOF
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
    // InternalGumboParser.g:3332:1: ruleSlangPattern returns [EObject current=null] : ( ( () this_ID_1= RULE_ID (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis )? ) | (otherlv_7= LeftParenthesis ( (lv_patterns_8_0= ruleSlangTPattern ) ) (otherlv_9= Comma ( (lv_patterns_10_0= ruleSlangTPattern ) ) )* otherlv_11= RightParenthesis ) ) ;
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
            // InternalGumboParser.g:3338:2: ( ( ( () this_ID_1= RULE_ID (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis )? ) | (otherlv_7= LeftParenthesis ( (lv_patterns_8_0= ruleSlangTPattern ) ) (otherlv_9= Comma ( (lv_patterns_10_0= ruleSlangTPattern ) ) )* otherlv_11= RightParenthesis ) ) )
            // InternalGumboParser.g:3339:2: ( ( () this_ID_1= RULE_ID (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis )? ) | (otherlv_7= LeftParenthesis ( (lv_patterns_8_0= ruleSlangTPattern ) ) (otherlv_9= Comma ( (lv_patterns_10_0= ruleSlangTPattern ) ) )* otherlv_11= RightParenthesis ) )
            {
            // InternalGumboParser.g:3339:2: ( ( () this_ID_1= RULE_ID (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis )? ) | (otherlv_7= LeftParenthesis ( (lv_patterns_8_0= ruleSlangTPattern ) ) (otherlv_9= Comma ( (lv_patterns_10_0= ruleSlangTPattern ) ) )* otherlv_11= RightParenthesis ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_ID) ) {
                alt68=1;
            }
            else if ( (LA68_0==LeftParenthesis) ) {
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
                    // InternalGumboParser.g:3340:3: ( () this_ID_1= RULE_ID (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis )? )
                    {
                    // InternalGumboParser.g:3340:3: ( () this_ID_1= RULE_ID (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis )? )
                    // InternalGumboParser.g:3341:4: () this_ID_1= RULE_ID (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis )?
                    {
                    // InternalGumboParser.g:3341:4: ()
                    // InternalGumboParser.g:3342:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangPatternAccess().getSlangPatternAction_0_0(),
                      						current);
                      				
                    }

                    }

                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_1, grammarAccess.getSlangPatternAccess().getIDTerminalRuleCall_0_1());
                      			
                    }
                    // InternalGumboParser.g:3352:4: (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==LeftParenthesis) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // InternalGumboParser.g:3353:5: otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis
                            {
                            otherlv_2=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_60); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getSlangPatternAccess().getLeftParenthesisKeyword_0_2_0());
                              				
                            }
                            // InternalGumboParser.g:3357:5: ( (lv_patterns_3_0= ruleSlangTPattern ) )
                            // InternalGumboParser.g:3358:6: (lv_patterns_3_0= ruleSlangTPattern )
                            {
                            // InternalGumboParser.g:3358:6: (lv_patterns_3_0= ruleSlangTPattern )
                            // InternalGumboParser.g:3359:7: lv_patterns_3_0= ruleSlangTPattern
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSlangPatternAccess().getPatternsSlangTPatternParserRuleCall_0_2_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_34);
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

                            // InternalGumboParser.g:3376:5: (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )*
                            loop65:
                            do {
                                int alt65=2;
                                int LA65_0 = input.LA(1);

                                if ( (LA65_0==Comma) ) {
                                    alt65=1;
                                }


                                switch (alt65) {
                            	case 1 :
                            	    // InternalGumboParser.g:3377:6: otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) )
                            	    {
                            	    otherlv_4=(Token)match(input,Comma,FollowSets000.FOLLOW_60); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_4, grammarAccess.getSlangPatternAccess().getCommaKeyword_0_2_2_0());
                            	      					
                            	    }
                            	    // InternalGumboParser.g:3381:6: ( (lv_patterns_5_0= ruleSlangTPattern ) )
                            	    // InternalGumboParser.g:3382:7: (lv_patterns_5_0= ruleSlangTPattern )
                            	    {
                            	    // InternalGumboParser.g:3382:7: (lv_patterns_5_0= ruleSlangTPattern )
                            	    // InternalGumboParser.g:3383:8: lv_patterns_5_0= ruleSlangTPattern
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getSlangPatternAccess().getPatternsSlangTPatternParserRuleCall_0_2_2_1_0());
                            	      							
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_34);
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
                            	    break loop65;
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
                    // InternalGumboParser.g:3408:3: (otherlv_7= LeftParenthesis ( (lv_patterns_8_0= ruleSlangTPattern ) ) (otherlv_9= Comma ( (lv_patterns_10_0= ruleSlangTPattern ) ) )* otherlv_11= RightParenthesis )
                    {
                    // InternalGumboParser.g:3408:3: (otherlv_7= LeftParenthesis ( (lv_patterns_8_0= ruleSlangTPattern ) ) (otherlv_9= Comma ( (lv_patterns_10_0= ruleSlangTPattern ) ) )* otherlv_11= RightParenthesis )
                    // InternalGumboParser.g:3409:4: otherlv_7= LeftParenthesis ( (lv_patterns_8_0= ruleSlangTPattern ) ) (otherlv_9= Comma ( (lv_patterns_10_0= ruleSlangTPattern ) ) )* otherlv_11= RightParenthesis
                    {
                    otherlv_7=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_60); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getSlangPatternAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalGumboParser.g:3413:4: ( (lv_patterns_8_0= ruleSlangTPattern ) )
                    // InternalGumboParser.g:3414:5: (lv_patterns_8_0= ruleSlangTPattern )
                    {
                    // InternalGumboParser.g:3414:5: (lv_patterns_8_0= ruleSlangTPattern )
                    // InternalGumboParser.g:3415:6: lv_patterns_8_0= ruleSlangTPattern
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangPatternAccess().getPatternsSlangTPatternParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_34);
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

                    // InternalGumboParser.g:3432:4: (otherlv_9= Comma ( (lv_patterns_10_0= ruleSlangTPattern ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==Comma) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // InternalGumboParser.g:3433:5: otherlv_9= Comma ( (lv_patterns_10_0= ruleSlangTPattern ) )
                    	    {
                    	    otherlv_9=(Token)match(input,Comma,FollowSets000.FOLLOW_60); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_9, grammarAccess.getSlangPatternAccess().getCommaKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:3437:5: ( (lv_patterns_10_0= ruleSlangTPattern ) )
                    	    // InternalGumboParser.g:3438:6: (lv_patterns_10_0= ruleSlangTPattern )
                    	    {
                    	    // InternalGumboParser.g:3438:6: (lv_patterns_10_0= ruleSlangTPattern )
                    	    // InternalGumboParser.g:3439:7: lv_patterns_10_0= ruleSlangTPattern
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSlangPatternAccess().getPatternsSlangTPatternParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_34);
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
                    	    break loop67;
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
    // InternalGumboParser.g:3466:1: entryRuleSlangTPattern returns [EObject current=null] : iv_ruleSlangTPattern= ruleSlangTPattern EOF ;
    public final EObject entryRuleSlangTPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangTPattern = null;


        try {
            // InternalGumboParser.g:3466:54: (iv_ruleSlangTPattern= ruleSlangTPattern EOF )
            // InternalGumboParser.g:3467:2: iv_ruleSlangTPattern= ruleSlangTPattern EOF
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
    // InternalGumboParser.g:3473:1: ruleSlangTPattern returns [EObject current=null] : ( ( () this_ID_1= RULE_ID ( (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis ) | (otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) ) ) )? ) | (otherlv_9= LeftParenthesis ( (lv_patterns_10_0= ruleSlangTPattern ) ) (otherlv_11= Comma ( (lv_patterns_12_0= ruleSlangTPattern ) ) )* otherlv_13= RightParenthesis ) | ( () otherlv_15= KW__ (otherlv_16= Colon ( (lv_type_17_0= ruleSlangType ) ) )? ) ) ;
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
            // InternalGumboParser.g:3479:2: ( ( ( () this_ID_1= RULE_ID ( (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis ) | (otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) ) ) )? ) | (otherlv_9= LeftParenthesis ( (lv_patterns_10_0= ruleSlangTPattern ) ) (otherlv_11= Comma ( (lv_patterns_12_0= ruleSlangTPattern ) ) )* otherlv_13= RightParenthesis ) | ( () otherlv_15= KW__ (otherlv_16= Colon ( (lv_type_17_0= ruleSlangType ) ) )? ) ) )
            // InternalGumboParser.g:3480:2: ( ( () this_ID_1= RULE_ID ( (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis ) | (otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) ) ) )? ) | (otherlv_9= LeftParenthesis ( (lv_patterns_10_0= ruleSlangTPattern ) ) (otherlv_11= Comma ( (lv_patterns_12_0= ruleSlangTPattern ) ) )* otherlv_13= RightParenthesis ) | ( () otherlv_15= KW__ (otherlv_16= Colon ( (lv_type_17_0= ruleSlangType ) ) )? ) )
            {
            // InternalGumboParser.g:3480:2: ( ( () this_ID_1= RULE_ID ( (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis ) | (otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) ) ) )? ) | (otherlv_9= LeftParenthesis ( (lv_patterns_10_0= ruleSlangTPattern ) ) (otherlv_11= Comma ( (lv_patterns_12_0= ruleSlangTPattern ) ) )* otherlv_13= RightParenthesis ) | ( () otherlv_15= KW__ (otherlv_16= Colon ( (lv_type_17_0= ruleSlangType ) ) )? ) )
            int alt73=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt73=1;
                }
                break;
            case LeftParenthesis:
                {
                alt73=2;
                }
                break;
            case KW__:
                {
                alt73=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // InternalGumboParser.g:3481:3: ( () this_ID_1= RULE_ID ( (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis ) | (otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) ) ) )? )
                    {
                    // InternalGumboParser.g:3481:3: ( () this_ID_1= RULE_ID ( (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis ) | (otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) ) ) )? )
                    // InternalGumboParser.g:3482:4: () this_ID_1= RULE_ID ( (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis ) | (otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) ) ) )?
                    {
                    // InternalGumboParser.g:3482:4: ()
                    // InternalGumboParser.g:3483:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangTPatternAccess().getSlangTPatternAction_0_0(),
                      						current);
                      				
                    }

                    }

                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_61); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_1, grammarAccess.getSlangTPatternAccess().getIDTerminalRuleCall_0_1());
                      			
                    }
                    // InternalGumboParser.g:3493:4: ( (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis ) | (otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) ) ) )?
                    int alt70=3;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==LeftParenthesis) ) {
                        alt70=1;
                    }
                    else if ( (LA70_0==Colon) ) {
                        alt70=2;
                    }
                    switch (alt70) {
                        case 1 :
                            // InternalGumboParser.g:3494:5: (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis )
                            {
                            // InternalGumboParser.g:3494:5: (otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis )
                            // InternalGumboParser.g:3495:6: otherlv_2= LeftParenthesis ( (lv_patterns_3_0= ruleSlangTPattern ) ) (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )* otherlv_6= RightParenthesis
                            {
                            otherlv_2=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_60); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_2, grammarAccess.getSlangTPatternAccess().getLeftParenthesisKeyword_0_2_0_0());
                              					
                            }
                            // InternalGumboParser.g:3499:6: ( (lv_patterns_3_0= ruleSlangTPattern ) )
                            // InternalGumboParser.g:3500:7: (lv_patterns_3_0= ruleSlangTPattern )
                            {
                            // InternalGumboParser.g:3500:7: (lv_patterns_3_0= ruleSlangTPattern )
                            // InternalGumboParser.g:3501:8: lv_patterns_3_0= ruleSlangTPattern
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getSlangTPatternAccess().getPatternsSlangTPatternParserRuleCall_0_2_0_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_34);
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

                            // InternalGumboParser.g:3518:6: (otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) ) )*
                            loop69:
                            do {
                                int alt69=2;
                                int LA69_0 = input.LA(1);

                                if ( (LA69_0==Comma) ) {
                                    alt69=1;
                                }


                                switch (alt69) {
                            	case 1 :
                            	    // InternalGumboParser.g:3519:7: otherlv_4= Comma ( (lv_patterns_5_0= ruleSlangTPattern ) )
                            	    {
                            	    otherlv_4=(Token)match(input,Comma,FollowSets000.FOLLOW_60); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_4, grammarAccess.getSlangTPatternAccess().getCommaKeyword_0_2_0_2_0());
                            	      						
                            	    }
                            	    // InternalGumboParser.g:3523:7: ( (lv_patterns_5_0= ruleSlangTPattern ) )
                            	    // InternalGumboParser.g:3524:8: (lv_patterns_5_0= ruleSlangTPattern )
                            	    {
                            	    // InternalGumboParser.g:3524:8: (lv_patterns_5_0= ruleSlangTPattern )
                            	    // InternalGumboParser.g:3525:9: lv_patterns_5_0= ruleSlangTPattern
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getSlangTPatternAccess().getPatternsSlangTPatternParserRuleCall_0_2_0_2_1_0());
                            	      								
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_34);
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
                            	    break loop69;
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
                            // InternalGumboParser.g:3549:5: (otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) ) )
                            {
                            // InternalGumboParser.g:3549:5: (otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) ) )
                            // InternalGumboParser.g:3550:6: otherlv_7= Colon ( (lv_type_8_0= ruleSlangType ) )
                            {
                            otherlv_7=(Token)match(input,Colon,FollowSets000.FOLLOW_10); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_7, grammarAccess.getSlangTPatternAccess().getColonKeyword_0_2_1_0());
                              					
                            }
                            // InternalGumboParser.g:3554:6: ( (lv_type_8_0= ruleSlangType ) )
                            // InternalGumboParser.g:3555:7: (lv_type_8_0= ruleSlangType )
                            {
                            // InternalGumboParser.g:3555:7: (lv_type_8_0= ruleSlangType )
                            // InternalGumboParser.g:3556:8: lv_type_8_0= ruleSlangType
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
                    // InternalGumboParser.g:3577:3: (otherlv_9= LeftParenthesis ( (lv_patterns_10_0= ruleSlangTPattern ) ) (otherlv_11= Comma ( (lv_patterns_12_0= ruleSlangTPattern ) ) )* otherlv_13= RightParenthesis )
                    {
                    // InternalGumboParser.g:3577:3: (otherlv_9= LeftParenthesis ( (lv_patterns_10_0= ruleSlangTPattern ) ) (otherlv_11= Comma ( (lv_patterns_12_0= ruleSlangTPattern ) ) )* otherlv_13= RightParenthesis )
                    // InternalGumboParser.g:3578:4: otherlv_9= LeftParenthesis ( (lv_patterns_10_0= ruleSlangTPattern ) ) (otherlv_11= Comma ( (lv_patterns_12_0= ruleSlangTPattern ) ) )* otherlv_13= RightParenthesis
                    {
                    otherlv_9=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_60); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getSlangTPatternAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalGumboParser.g:3582:4: ( (lv_patterns_10_0= ruleSlangTPattern ) )
                    // InternalGumboParser.g:3583:5: (lv_patterns_10_0= ruleSlangTPattern )
                    {
                    // InternalGumboParser.g:3583:5: (lv_patterns_10_0= ruleSlangTPattern )
                    // InternalGumboParser.g:3584:6: lv_patterns_10_0= ruleSlangTPattern
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangTPatternAccess().getPatternsSlangTPatternParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_34);
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

                    // InternalGumboParser.g:3601:4: (otherlv_11= Comma ( (lv_patterns_12_0= ruleSlangTPattern ) ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==Comma) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // InternalGumboParser.g:3602:5: otherlv_11= Comma ( (lv_patterns_12_0= ruleSlangTPattern ) )
                    	    {
                    	    otherlv_11=(Token)match(input,Comma,FollowSets000.FOLLOW_60); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_11, grammarAccess.getSlangTPatternAccess().getCommaKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:3606:5: ( (lv_patterns_12_0= ruleSlangTPattern ) )
                    	    // InternalGumboParser.g:3607:6: (lv_patterns_12_0= ruleSlangTPattern )
                    	    {
                    	    // InternalGumboParser.g:3607:6: (lv_patterns_12_0= ruleSlangTPattern )
                    	    // InternalGumboParser.g:3608:7: lv_patterns_12_0= ruleSlangTPattern
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSlangTPatternAccess().getPatternsSlangTPatternParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_34);
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
                    	    break loop71;
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
                    // InternalGumboParser.g:3632:3: ( () otherlv_15= KW__ (otherlv_16= Colon ( (lv_type_17_0= ruleSlangType ) ) )? )
                    {
                    // InternalGumboParser.g:3632:3: ( () otherlv_15= KW__ (otherlv_16= Colon ( (lv_type_17_0= ruleSlangType ) ) )? )
                    // InternalGumboParser.g:3633:4: () otherlv_15= KW__ (otherlv_16= Colon ( (lv_type_17_0= ruleSlangType ) ) )?
                    {
                    // InternalGumboParser.g:3633:4: ()
                    // InternalGumboParser.g:3634:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangTPatternAccess().getSlangTPatternAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_15=(Token)match(input,KW__,FollowSets000.FOLLOW_62); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getSlangTPatternAccess().get_Keyword_2_1());
                      			
                    }
                    // InternalGumboParser.g:3644:4: (otherlv_16= Colon ( (lv_type_17_0= ruleSlangType ) ) )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==Colon) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // InternalGumboParser.g:3645:5: otherlv_16= Colon ( (lv_type_17_0= ruleSlangType ) )
                            {
                            otherlv_16=(Token)match(input,Colon,FollowSets000.FOLLOW_10); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_16, grammarAccess.getSlangTPatternAccess().getColonKeyword_2_2_0());
                              				
                            }
                            // InternalGumboParser.g:3649:5: ( (lv_type_17_0= ruleSlangType ) )
                            // InternalGumboParser.g:3650:6: (lv_type_17_0= ruleSlangType )
                            {
                            // InternalGumboParser.g:3650:6: (lv_type_17_0= ruleSlangType )
                            // InternalGumboParser.g:3651:7: lv_type_17_0= ruleSlangType
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
    // InternalGumboParser.g:3674:1: entryRuleSlangVarDef returns [EObject current=null] : iv_ruleSlangVarDef= ruleSlangVarDef EOF ;
    public final EObject entryRuleSlangVarDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangVarDef = null;


        try {
            // InternalGumboParser.g:3674:52: (iv_ruleSlangVarDef= ruleSlangVarDef EOF )
            // InternalGumboParser.g:3675:2: iv_ruleSlangVarDef= ruleSlangVarDef EOF
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
    // InternalGumboParser.g:3681:1: ruleSlangVarDef returns [EObject current=null] : ( ruleSlangVarMod this_SlangPattern_1= ruleSlangPattern (otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) )? otherlv_4= ColonEqualsSign ( (lv_init_5_0= ruleExpr ) ) ) ;
    public final EObject ruleSlangVarDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_SlangPattern_1 = null;

        EObject lv_typeName_3_0 = null;

        EObject lv_init_5_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:3687:2: ( ( ruleSlangVarMod this_SlangPattern_1= ruleSlangPattern (otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) )? otherlv_4= ColonEqualsSign ( (lv_init_5_0= ruleExpr ) ) ) )
            // InternalGumboParser.g:3688:2: ( ruleSlangVarMod this_SlangPattern_1= ruleSlangPattern (otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) )? otherlv_4= ColonEqualsSign ( (lv_init_5_0= ruleExpr ) ) )
            {
            // InternalGumboParser.g:3688:2: ( ruleSlangVarMod this_SlangPattern_1= ruleSlangPattern (otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) )? otherlv_4= ColonEqualsSign ( (lv_init_5_0= ruleExpr ) ) )
            // InternalGumboParser.g:3689:3: ruleSlangVarMod this_SlangPattern_1= ruleSlangPattern (otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) )? otherlv_4= ColonEqualsSign ( (lv_init_5_0= ruleExpr ) )
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSlangVarDefAccess().getSlangVarModParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_55);
            ruleSlangVarMod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSlangVarDefAccess().getSlangPatternParserRuleCall_1());
              		
            }
            pushFollow(FollowSets000.FOLLOW_63);
            this_SlangPattern_1=ruleSlangPattern();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SlangPattern_1;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGumboParser.g:3704:3: (otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==Colon) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalGumboParser.g:3705:4: otherlv_2= Colon ( (lv_typeName_3_0= ruleSlangType ) )
                    {
                    otherlv_2=(Token)match(input,Colon,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSlangVarDefAccess().getColonKeyword_2_0());
                      			
                    }
                    // InternalGumboParser.g:3709:4: ( (lv_typeName_3_0= ruleSlangType ) )
                    // InternalGumboParser.g:3710:5: (lv_typeName_3_0= ruleSlangType )
                    {
                    // InternalGumboParser.g:3710:5: (lv_typeName_3_0= ruleSlangType )
                    // InternalGumboParser.g:3711:6: lv_typeName_3_0= ruleSlangType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangVarDefAccess().getTypeNameSlangTypeParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_32);
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
            // InternalGumboParser.g:3733:3: ( (lv_init_5_0= ruleExpr ) )
            // InternalGumboParser.g:3734:4: (lv_init_5_0= ruleExpr )
            {
            // InternalGumboParser.g:3734:4: (lv_init_5_0= ruleExpr )
            // InternalGumboParser.g:3735:5: lv_init_5_0= ruleExpr
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
    // InternalGumboParser.g:3756:1: entryRuleSlangVarMod returns [String current=null] : iv_ruleSlangVarMod= ruleSlangVarMod EOF ;
    public final String entryRuleSlangVarMod() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSlangVarMod = null;


        try {
            // InternalGumboParser.g:3756:51: (iv_ruleSlangVarMod= ruleSlangVarMod EOF )
            // InternalGumboParser.g:3757:2: iv_ruleSlangVarMod= ruleSlangVarMod EOF
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
    // InternalGumboParser.g:3763:1: ruleSlangVarMod returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Val | kw= Var ) ;
    public final AntlrDatatypeRuleToken ruleSlangVarMod() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumboParser.g:3769:2: ( (kw= Val | kw= Var ) )
            // InternalGumboParser.g:3770:2: (kw= Val | kw= Var )
            {
            // InternalGumboParser.g:3770:2: (kw= Val | kw= Var )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==Val) ) {
                alt75=1;
            }
            else if ( (LA75_0==Var) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // InternalGumboParser.g:3771:3: kw= Val
                    {
                    kw=(Token)match(input,Val,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getSlangVarModAccess().getValKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:3777:3: kw= Var
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
    // InternalGumboParser.g:3786:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // InternalGumboParser.g:3786:45: (iv_ruleExpr= ruleExpr EOF )
            // InternalGumboParser.g:3787:2: iv_ruleExpr= ruleExpr EOF
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
    // InternalGumboParser.g:3793:1: ruleExpr returns [EObject current=null] : ( ( () ( (lv_terms_1_0= ruleSlangAccess ) ) ( ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )* | (otherlv_4= QuestionMark ( (lv_thenExpr_5_0= ruleExpr ) ) otherlv_6= Colon ( (lv_elseExpr_7_0= ruleExpr ) ) ) ) ) | ( () (otherlv_9= All | otherlv_10= Some | otherlv_11= ForAll | otherlv_12= ThereExists ) ( (lv_qVar_13_0= ruleSlangQuantVar ) ) (otherlv_14= Comma ( (lv_qVar_15_0= ruleSlangQuantVar ) ) )* otherlv_16= EqualsSignGreaterThanSign ( (lv_quantifiedExpr_17_0= ruleExpr ) ) ) | ( () ( (lv_op_19_0= ruleOperator ) ) ( (lv_accessExp_20_0= ruleSlangAccess ) ) ) ) ;
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
            // InternalGumboParser.g:3799:2: ( ( ( () ( (lv_terms_1_0= ruleSlangAccess ) ) ( ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )* | (otherlv_4= QuestionMark ( (lv_thenExpr_5_0= ruleExpr ) ) otherlv_6= Colon ( (lv_elseExpr_7_0= ruleExpr ) ) ) ) ) | ( () (otherlv_9= All | otherlv_10= Some | otherlv_11= ForAll | otherlv_12= ThereExists ) ( (lv_qVar_13_0= ruleSlangQuantVar ) ) (otherlv_14= Comma ( (lv_qVar_15_0= ruleSlangQuantVar ) ) )* otherlv_16= EqualsSignGreaterThanSign ( (lv_quantifiedExpr_17_0= ruleExpr ) ) ) | ( () ( (lv_op_19_0= ruleOperator ) ) ( (lv_accessExp_20_0= ruleSlangAccess ) ) ) ) )
            // InternalGumboParser.g:3800:2: ( ( () ( (lv_terms_1_0= ruleSlangAccess ) ) ( ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )* | (otherlv_4= QuestionMark ( (lv_thenExpr_5_0= ruleExpr ) ) otherlv_6= Colon ( (lv_elseExpr_7_0= ruleExpr ) ) ) ) ) | ( () (otherlv_9= All | otherlv_10= Some | otherlv_11= ForAll | otherlv_12= ThereExists ) ( (lv_qVar_13_0= ruleSlangQuantVar ) ) (otherlv_14= Comma ( (lv_qVar_15_0= ruleSlangQuantVar ) ) )* otherlv_16= EqualsSignGreaterThanSign ( (lv_quantifiedExpr_17_0= ruleExpr ) ) ) | ( () ( (lv_op_19_0= ruleOperator ) ) ( (lv_accessExp_20_0= ruleSlangAccess ) ) ) )
            {
            // InternalGumboParser.g:3800:2: ( ( () ( (lv_terms_1_0= ruleSlangAccess ) ) ( ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )* | (otherlv_4= QuestionMark ( (lv_thenExpr_5_0= ruleExpr ) ) otherlv_6= Colon ( (lv_elseExpr_7_0= ruleExpr ) ) ) ) ) | ( () (otherlv_9= All | otherlv_10= Some | otherlv_11= ForAll | otherlv_12= ThereExists ) ( (lv_qVar_13_0= ruleSlangQuantVar ) ) (otherlv_14= Comma ( (lv_qVar_15_0= ruleSlangQuantVar ) ) )* otherlv_16= EqualsSignGreaterThanSign ( (lv_quantifiedExpr_17_0= ruleExpr ) ) ) | ( () ( (lv_op_19_0= ruleOperator ) ) ( (lv_accessExp_20_0= ruleSlangAccess ) ) ) )
            int alt80=3;
            switch ( input.LA(1) ) {
            case Enum:
            case For:
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
                alt80=1;
                }
                break;
            case Some:
            case All:
            case ForAll:
            case ThereExists:
                {
                alt80=2;
                }
                break;
            case Asterisk:
            case PlusSign:
            case HyphenMinus:
            case RULE_OP:
                {
                alt80=3;
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
                    // InternalGumboParser.g:3801:3: ( () ( (lv_terms_1_0= ruleSlangAccess ) ) ( ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )* | (otherlv_4= QuestionMark ( (lv_thenExpr_5_0= ruleExpr ) ) otherlv_6= Colon ( (lv_elseExpr_7_0= ruleExpr ) ) ) ) )
                    {
                    // InternalGumboParser.g:3801:3: ( () ( (lv_terms_1_0= ruleSlangAccess ) ) ( ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )* | (otherlv_4= QuestionMark ( (lv_thenExpr_5_0= ruleExpr ) ) otherlv_6= Colon ( (lv_elseExpr_7_0= ruleExpr ) ) ) ) )
                    // InternalGumboParser.g:3802:4: () ( (lv_terms_1_0= ruleSlangAccess ) ) ( ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )* | (otherlv_4= QuestionMark ( (lv_thenExpr_5_0= ruleExpr ) ) otherlv_6= Colon ( (lv_elseExpr_7_0= ruleExpr ) ) ) )
                    {
                    // InternalGumboParser.g:3802:4: ()
                    // InternalGumboParser.g:3803:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getExprAccess().getBasicExpAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:3809:4: ( (lv_terms_1_0= ruleSlangAccess ) )
                    // InternalGumboParser.g:3810:5: (lv_terms_1_0= ruleSlangAccess )
                    {
                    // InternalGumboParser.g:3810:5: (lv_terms_1_0= ruleSlangAccess )
                    // InternalGumboParser.g:3811:6: lv_terms_1_0= ruleSlangAccess
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprAccess().getTermsSlangAccessParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_64);
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

                    // InternalGumboParser.g:3828:4: ( ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )* | (otherlv_4= QuestionMark ( (lv_thenExpr_5_0= ruleExpr ) ) otherlv_6= Colon ( (lv_elseExpr_7_0= ruleExpr ) ) ) )
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==EOF||LA77_0==Invariant||(LA77_0>=Modifies && LA77_0<=Requires)||LA77_0==Ensures||(LA77_0>=Assert && LA77_0<=Return)||LA77_0==Match||LA77_0==Reads||(LA77_0>=While && LA77_0<=Yield)||LA77_0==Case||(LA77_0>=Halt && LA77_0<=Spec)||LA77_0==FullStopFullStopLessThanSign||(LA77_0>=Val && LA77_0<=FullStopFullStop)||LA77_0==ColonEqualsSign||(LA77_0>=EqualsSignGreaterThanSign && LA77_0<=If)||(LA77_0>=RightParenthesis && LA77_0<=HyphenMinus)||(LA77_0>=Colon && LA77_0<=Semicolon)||(LA77_0>=LeftCurlyBracket && LA77_0<=RightCurlyBracket)||LA77_0==RULE_SLANG_STRING||LA77_0==RULE_OP||LA77_0==RULE_ID) ) {
                        alt77=1;
                    }
                    else if ( (LA77_0==QuestionMark) ) {
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
                            // InternalGumboParser.g:3829:5: ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )*
                            {
                            // InternalGumboParser.g:3829:5: ( ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) ) )*
                            loop76:
                            do {
                                int alt76=2;
                                int LA76_0 = input.LA(1);

                                if ( ((LA76_0>=Asterisk && LA76_0<=PlusSign)||LA76_0==HyphenMinus||LA76_0==RULE_OP) ) {
                                    alt76=1;
                                }


                                switch (alt76) {
                            	case 1 :
                            	    // InternalGumboParser.g:3830:6: ( (lv_ops_2_0= ruleOperator ) ) ( (lv_terms_3_0= ruleSlangAccess ) )
                            	    {
                            	    // InternalGumboParser.g:3830:6: ( (lv_ops_2_0= ruleOperator ) )
                            	    // InternalGumboParser.g:3831:7: (lv_ops_2_0= ruleOperator )
                            	    {
                            	    // InternalGumboParser.g:3831:7: (lv_ops_2_0= ruleOperator )
                            	    // InternalGumboParser.g:3832:8: lv_ops_2_0= ruleOperator
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getExprAccess().getOpsOperatorParserRuleCall_0_2_0_0_0());
                            	      							
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_65);
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

                            	    // InternalGumboParser.g:3849:6: ( (lv_terms_3_0= ruleSlangAccess ) )
                            	    // InternalGumboParser.g:3850:7: (lv_terms_3_0= ruleSlangAccess )
                            	    {
                            	    // InternalGumboParser.g:3850:7: (lv_terms_3_0= ruleSlangAccess )
                            	    // InternalGumboParser.g:3851:8: lv_terms_3_0= ruleSlangAccess
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getExprAccess().getTermsSlangAccessParserRuleCall_0_2_0_1_0());
                            	      							
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_66);
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
                            	    break loop76;
                                }
                            } while (true);


                            }
                            break;
                        case 2 :
                            // InternalGumboParser.g:3870:5: (otherlv_4= QuestionMark ( (lv_thenExpr_5_0= ruleExpr ) ) otherlv_6= Colon ( (lv_elseExpr_7_0= ruleExpr ) ) )
                            {
                            // InternalGumboParser.g:3870:5: (otherlv_4= QuestionMark ( (lv_thenExpr_5_0= ruleExpr ) ) otherlv_6= Colon ( (lv_elseExpr_7_0= ruleExpr ) ) )
                            // InternalGumboParser.g:3871:6: otherlv_4= QuestionMark ( (lv_thenExpr_5_0= ruleExpr ) ) otherlv_6= Colon ( (lv_elseExpr_7_0= ruleExpr ) )
                            {
                            otherlv_4=(Token)match(input,QuestionMark,FollowSets000.FOLLOW_17); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_4, grammarAccess.getExprAccess().getQuestionMarkKeyword_0_2_1_0());
                              					
                            }
                            // InternalGumboParser.g:3875:6: ( (lv_thenExpr_5_0= ruleExpr ) )
                            // InternalGumboParser.g:3876:7: (lv_thenExpr_5_0= ruleExpr )
                            {
                            // InternalGumboParser.g:3876:7: (lv_thenExpr_5_0= ruleExpr )
                            // InternalGumboParser.g:3877:8: lv_thenExpr_5_0= ruleExpr
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
                            // InternalGumboParser.g:3898:6: ( (lv_elseExpr_7_0= ruleExpr ) )
                            // InternalGumboParser.g:3899:7: (lv_elseExpr_7_0= ruleExpr )
                            {
                            // InternalGumboParser.g:3899:7: (lv_elseExpr_7_0= ruleExpr )
                            // InternalGumboParser.g:3900:8: lv_elseExpr_7_0= ruleExpr
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
                    // InternalGumboParser.g:3921:3: ( () (otherlv_9= All | otherlv_10= Some | otherlv_11= ForAll | otherlv_12= ThereExists ) ( (lv_qVar_13_0= ruleSlangQuantVar ) ) (otherlv_14= Comma ( (lv_qVar_15_0= ruleSlangQuantVar ) ) )* otherlv_16= EqualsSignGreaterThanSign ( (lv_quantifiedExpr_17_0= ruleExpr ) ) )
                    {
                    // InternalGumboParser.g:3921:3: ( () (otherlv_9= All | otherlv_10= Some | otherlv_11= ForAll | otherlv_12= ThereExists ) ( (lv_qVar_13_0= ruleSlangQuantVar ) ) (otherlv_14= Comma ( (lv_qVar_15_0= ruleSlangQuantVar ) ) )* otherlv_16= EqualsSignGreaterThanSign ( (lv_quantifiedExpr_17_0= ruleExpr ) ) )
                    // InternalGumboParser.g:3922:4: () (otherlv_9= All | otherlv_10= Some | otherlv_11= ForAll | otherlv_12= ThereExists ) ( (lv_qVar_13_0= ruleSlangQuantVar ) ) (otherlv_14= Comma ( (lv_qVar_15_0= ruleSlangQuantVar ) ) )* otherlv_16= EqualsSignGreaterThanSign ( (lv_quantifiedExpr_17_0= ruleExpr ) )
                    {
                    // InternalGumboParser.g:3922:4: ()
                    // InternalGumboParser.g:3923:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getExprAccess().getQuantifiedExpAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:3929:4: (otherlv_9= All | otherlv_10= Some | otherlv_11= ForAll | otherlv_12= ThereExists )
                    int alt78=4;
                    switch ( input.LA(1) ) {
                    case All:
                        {
                        alt78=1;
                        }
                        break;
                    case Some:
                        {
                        alt78=2;
                        }
                        break;
                    case ForAll:
                        {
                        alt78=3;
                        }
                        break;
                    case ThereExists:
                        {
                        alt78=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 78, 0, input);

                        throw nvae;
                    }

                    switch (alt78) {
                        case 1 :
                            // InternalGumboParser.g:3930:5: otherlv_9= All
                            {
                            otherlv_9=(Token)match(input,All,FollowSets000.FOLLOW_10); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_9, grammarAccess.getExprAccess().getAllKeyword_1_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalGumboParser.g:3935:5: otherlv_10= Some
                            {
                            otherlv_10=(Token)match(input,Some,FollowSets000.FOLLOW_10); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_10, grammarAccess.getExprAccess().getSomeKeyword_1_1_1());
                              				
                            }

                            }
                            break;
                        case 3 :
                            // InternalGumboParser.g:3940:5: otherlv_11= ForAll
                            {
                            otherlv_11=(Token)match(input,ForAll,FollowSets000.FOLLOW_10); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_11, grammarAccess.getExprAccess().getForAllKeyword_1_1_2());
                              				
                            }

                            }
                            break;
                        case 4 :
                            // InternalGumboParser.g:3945:5: otherlv_12= ThereExists
                            {
                            otherlv_12=(Token)match(input,ThereExists,FollowSets000.FOLLOW_10); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_12, grammarAccess.getExprAccess().getThereExistsKeyword_1_1_3());
                              				
                            }

                            }
                            break;

                    }

                    // InternalGumboParser.g:3950:4: ( (lv_qVar_13_0= ruleSlangQuantVar ) )
                    // InternalGumboParser.g:3951:5: (lv_qVar_13_0= ruleSlangQuantVar )
                    {
                    // InternalGumboParser.g:3951:5: (lv_qVar_13_0= ruleSlangQuantVar )
                    // InternalGumboParser.g:3952:6: lv_qVar_13_0= ruleSlangQuantVar
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprAccess().getQVarSlangQuantVarParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_67);
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

                    // InternalGumboParser.g:3969:4: (otherlv_14= Comma ( (lv_qVar_15_0= ruleSlangQuantVar ) ) )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==Comma) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // InternalGumboParser.g:3970:5: otherlv_14= Comma ( (lv_qVar_15_0= ruleSlangQuantVar ) )
                    	    {
                    	    otherlv_14=(Token)match(input,Comma,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_14, grammarAccess.getExprAccess().getCommaKeyword_1_3_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:3974:5: ( (lv_qVar_15_0= ruleSlangQuantVar ) )
                    	    // InternalGumboParser.g:3975:6: (lv_qVar_15_0= ruleSlangQuantVar )
                    	    {
                    	    // InternalGumboParser.g:3975:6: (lv_qVar_15_0= ruleSlangQuantVar )
                    	    // InternalGumboParser.g:3976:7: lv_qVar_15_0= ruleSlangQuantVar
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getExprAccess().getQVarSlangQuantVarParserRuleCall_1_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_67);
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
                    	    break loop79;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getExprAccess().getEqualsSignGreaterThanSignKeyword_1_4());
                      			
                    }
                    // InternalGumboParser.g:3998:4: ( (lv_quantifiedExpr_17_0= ruleExpr ) )
                    // InternalGumboParser.g:3999:5: (lv_quantifiedExpr_17_0= ruleExpr )
                    {
                    // InternalGumboParser.g:3999:5: (lv_quantifiedExpr_17_0= ruleExpr )
                    // InternalGumboParser.g:4000:6: lv_quantifiedExpr_17_0= ruleExpr
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
                    // InternalGumboParser.g:4019:3: ( () ( (lv_op_19_0= ruleOperator ) ) ( (lv_accessExp_20_0= ruleSlangAccess ) ) )
                    {
                    // InternalGumboParser.g:4019:3: ( () ( (lv_op_19_0= ruleOperator ) ) ( (lv_accessExp_20_0= ruleSlangAccess ) ) )
                    // InternalGumboParser.g:4020:4: () ( (lv_op_19_0= ruleOperator ) ) ( (lv_accessExp_20_0= ruleSlangAccess ) )
                    {
                    // InternalGumboParser.g:4020:4: ()
                    // InternalGumboParser.g:4021:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getExprAccess().getUnaryExpAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:4027:4: ( (lv_op_19_0= ruleOperator ) )
                    // InternalGumboParser.g:4028:5: (lv_op_19_0= ruleOperator )
                    {
                    // InternalGumboParser.g:4028:5: (lv_op_19_0= ruleOperator )
                    // InternalGumboParser.g:4029:6: lv_op_19_0= ruleOperator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprAccess().getOpOperatorParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_65);
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

                    // InternalGumboParser.g:4046:4: ( (lv_accessExp_20_0= ruleSlangAccess ) )
                    // InternalGumboParser.g:4047:5: (lv_accessExp_20_0= ruleSlangAccess )
                    {
                    // InternalGumboParser.g:4047:5: (lv_accessExp_20_0= ruleSlangAccess )
                    // InternalGumboParser.g:4048:6: lv_accessExp_20_0= ruleSlangAccess
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
    // InternalGumboParser.g:4070:1: entryRuleSlangQuantVar returns [EObject current=null] : iv_ruleSlangQuantVar= ruleSlangQuantVar EOF ;
    public final EObject entryRuleSlangQuantVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangQuantVar = null;


        try {
            // InternalGumboParser.g:4070:54: (iv_ruleSlangQuantVar= ruleSlangQuantVar EOF )
            // InternalGumboParser.g:4071:2: iv_ruleSlangQuantVar= ruleSlangQuantVar EOF
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
    // InternalGumboParser.g:4077:1: ruleSlangQuantVar returns [EObject current=null] : (this_ID_0= RULE_ID otherlv_1= Colon ( (lv_e_2_0= ruleExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upperBound_5_0= ruleExpr ) ) )? ) ;
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
            // InternalGumboParser.g:4083:2: ( (this_ID_0= RULE_ID otherlv_1= Colon ( (lv_e_2_0= ruleExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upperBound_5_0= ruleExpr ) ) )? ) )
            // InternalGumboParser.g:4084:2: (this_ID_0= RULE_ID otherlv_1= Colon ( (lv_e_2_0= ruleExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upperBound_5_0= ruleExpr ) ) )? )
            {
            // InternalGumboParser.g:4084:2: (this_ID_0= RULE_ID otherlv_1= Colon ( (lv_e_2_0= ruleExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upperBound_5_0= ruleExpr ) ) )? )
            // InternalGumboParser.g:4085:3: this_ID_0= RULE_ID otherlv_1= Colon ( (lv_e_2_0= ruleExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upperBound_5_0= ruleExpr ) ) )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getSlangQuantVarAccess().getIDTerminalRuleCall_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSlangQuantVarAccess().getColonKeyword_1());
              		
            }
            // InternalGumboParser.g:4093:3: ( (lv_e_2_0= ruleExpr ) )
            // InternalGumboParser.g:4094:4: (lv_e_2_0= ruleExpr )
            {
            // InternalGumboParser.g:4094:4: (lv_e_2_0= ruleExpr )
            // InternalGumboParser.g:4095:5: lv_e_2_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangQuantVarAccess().getEExprParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_68);
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

            // InternalGumboParser.g:4112:3: ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upperBound_5_0= ruleExpr ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==FullStopFullStopLessThanSign||LA82_0==FullStopFullStop) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalGumboParser.g:4113:4: (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upperBound_5_0= ruleExpr ) )
                    {
                    // InternalGumboParser.g:4113:4: (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign )
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==FullStopFullStop) ) {
                        alt81=1;
                    }
                    else if ( (LA81_0==FullStopFullStopLessThanSign) ) {
                        alt81=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 81, 0, input);

                        throw nvae;
                    }
                    switch (alt81) {
                        case 1 :
                            // InternalGumboParser.g:4114:5: otherlv_3= FullStopFullStop
                            {
                            otherlv_3=(Token)match(input,FullStopFullStop,FollowSets000.FOLLOW_17); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_3, grammarAccess.getSlangQuantVarAccess().getFullStopFullStopKeyword_3_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalGumboParser.g:4119:5: otherlv_4= FullStopFullStopLessThanSign
                            {
                            otherlv_4=(Token)match(input,FullStopFullStopLessThanSign,FollowSets000.FOLLOW_17); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getSlangQuantVarAccess().getFullStopFullStopLessThanSignKeyword_3_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalGumboParser.g:4124:4: ( (lv_upperBound_5_0= ruleExpr ) )
                    // InternalGumboParser.g:4125:5: (lv_upperBound_5_0= ruleExpr )
                    {
                    // InternalGumboParser.g:4125:5: (lv_upperBound_5_0= ruleExpr )
                    // InternalGumboParser.g:4126:6: lv_upperBound_5_0= ruleExpr
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
    // InternalGumboParser.g:4148:1: entryRuleSlangBlock returns [EObject current=null] : iv_ruleSlangBlock= ruleSlangBlock EOF ;
    public final EObject entryRuleSlangBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangBlock = null;


        try {
            // InternalGumboParser.g:4148:51: (iv_ruleSlangBlock= ruleSlangBlock EOF )
            // InternalGumboParser.g:4149:2: iv_ruleSlangBlock= ruleSlangBlock EOF
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
    // InternalGumboParser.g:4155:1: ruleSlangBlock returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( (lv_stmts_2_0= ruleSlangStmt ) )* ( (lv_r_3_0= ruleSlangRet ) )? otherlv_4= RightCurlyBracket ) ;
    public final EObject ruleSlangBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_stmts_2_0 = null;

        EObject lv_r_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:4161:2: ( ( () otherlv_1= LeftCurlyBracket ( (lv_stmts_2_0= ruleSlangStmt ) )* ( (lv_r_3_0= ruleSlangRet ) )? otherlv_4= RightCurlyBracket ) )
            // InternalGumboParser.g:4162:2: ( () otherlv_1= LeftCurlyBracket ( (lv_stmts_2_0= ruleSlangStmt ) )* ( (lv_r_3_0= ruleSlangRet ) )? otherlv_4= RightCurlyBracket )
            {
            // InternalGumboParser.g:4162:2: ( () otherlv_1= LeftCurlyBracket ( (lv_stmts_2_0= ruleSlangStmt ) )* ( (lv_r_3_0= ruleSlangRet ) )? otherlv_4= RightCurlyBracket )
            // InternalGumboParser.g:4163:3: () otherlv_1= LeftCurlyBracket ( (lv_stmts_2_0= ruleSlangStmt ) )* ( (lv_r_3_0= ruleSlangRet ) )? otherlv_4= RightCurlyBracket
            {
            // InternalGumboParser.g:4163:3: ()
            // InternalGumboParser.g:4164:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSlangBlockAccess().getSlangBlockAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FollowSets000.FOLLOW_69); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSlangBlockAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalGumboParser.g:4174:3: ( (lv_stmts_2_0= ruleSlangStmt ) )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( ((LA83_0>=Assert && LA83_0<=Assume)||LA83_0==Match||LA83_0==While||(LA83_0>=Halt && LA83_0<=Spec)||(LA83_0>=Val && LA83_0<=Var)||(LA83_0>=Do && LA83_0<=If)||LA83_0==RULE_ID) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // InternalGumboParser.g:4175:4: (lv_stmts_2_0= ruleSlangStmt )
            	    {
            	    // InternalGumboParser.g:4175:4: (lv_stmts_2_0= ruleSlangStmt )
            	    // InternalGumboParser.g:4176:5: lv_stmts_2_0= ruleSlangStmt
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSlangBlockAccess().getStmtsSlangStmtParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_69);
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
            	    break loop83;
                }
            } while (true);

            // InternalGumboParser.g:4193:3: ( (lv_r_3_0= ruleSlangRet ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==Return) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalGumboParser.g:4194:4: (lv_r_3_0= ruleSlangRet )
                    {
                    // InternalGumboParser.g:4194:4: (lv_r_3_0= ruleSlangRet )
                    // InternalGumboParser.g:4195:5: lv_r_3_0= ruleSlangRet
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSlangBlockAccess().getRSlangRetParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_70);
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
    // InternalGumboParser.g:4220:1: entryRuleSlangAccess returns [EObject current=null] : iv_ruleSlangAccess= ruleSlangAccess EOF ;
    public final EObject entryRuleSlangAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangAccess = null;


        try {
            // InternalGumboParser.g:4220:52: (iv_ruleSlangAccess= ruleSlangAccess EOF )
            // InternalGumboParser.g:4221:2: iv_ruleSlangAccess= ruleSlangAccess EOF
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
    // InternalGumboParser.g:4227:1: ruleSlangAccess returns [EObject current=null] : ( () ( (lv_t_1_0= ruleSlangTerm ) ) ) ;
    public final EObject ruleSlangAccess() throws RecognitionException {
        EObject current = null;

        EObject lv_t_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:4233:2: ( ( () ( (lv_t_1_0= ruleSlangTerm ) ) ) )
            // InternalGumboParser.g:4234:2: ( () ( (lv_t_1_0= ruleSlangTerm ) ) )
            {
            // InternalGumboParser.g:4234:2: ( () ( (lv_t_1_0= ruleSlangTerm ) ) )
            // InternalGumboParser.g:4235:3: () ( (lv_t_1_0= ruleSlangTerm ) )
            {
            // InternalGumboParser.g:4235:3: ()
            // InternalGumboParser.g:4236:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSlangAccessAccess().getSlangAccessAction_0(),
              					current);
              			
            }

            }

            // InternalGumboParser.g:4242:3: ( (lv_t_1_0= ruleSlangTerm ) )
            // InternalGumboParser.g:4243:4: (lv_t_1_0= ruleSlangTerm )
            {
            // InternalGumboParser.g:4243:4: (lv_t_1_0= ruleSlangTerm )
            // InternalGumboParser.g:4244:5: lv_t_1_0= ruleSlangTerm
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
    // InternalGumboParser.g:4265:1: entryRuleSlangTerm returns [EObject current=null] : iv_ruleSlangTerm= ruleSlangTerm EOF ;
    public final EObject entryRuleSlangTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangTerm = null;


        try {
            // InternalGumboParser.g:4265:50: (iv_ruleSlangTerm= ruleSlangTerm EOF )
            // InternalGumboParser.g:4266:2: iv_ruleSlangTerm= ruleSlangTerm EOF
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
    // InternalGumboParser.g:4272:1: ruleSlangTerm returns [EObject current=null] : ( ( () ( (lv_lit_1_0= ruleSlangLit ) ) ) | ( () ( (lv_i_3_0= ruleSlangInterp ) ) ) | ( ( ( ( () Enum LeftParenthesis ) )=> ( () otherlv_5= Enum otherlv_6= LeftParenthesis ) ) ( (lv_enumType_7_0= ruleDataElement ) ) otherlv_8= Comma ( (otherlv_9= RULE_ID ) ) otherlv_10= RightParenthesis ) | ( ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_12_0= ruleDataElement ) ) otherlv_13= LeftCurlyBracket ( (otherlv_14= RULE_ID ) ) otherlv_15= EqualsSign ) ) ( (lv_argExpr_16_0= ruleExpr ) ) (otherlv_17= Semicolon ( (otherlv_18= RULE_ID ) ) otherlv_19= EqualsSign ( (lv_argExpr_20_0= ruleExpr ) ) )* otherlv_21= RightCurlyBracket ) | ( () ( (otherlv_23= RULE_ID ) ) (otherlv_24= FullStop ( (lv_ref_25_0= ruleOtherDataRef ) ) )? ( (lv_cs_26_0= ruleSlangCallSuffix ) )? ) | ( () otherlv_28= LeftParenthesis ( (lv_e_29_0= ruleExpr ) ) (otherlv_30= Comma ( (lv_e_31_0= ruleExpr ) ) )* otherlv_32= RightParenthesis ) | ( () otherlv_34= For ( (lv_r_35_0= ruleSlangForRange ) ) (otherlv_36= Comma ( (lv_r_37_0= ruleSlangForRange ) ) )* otherlv_38= Yield ( ( (lv_b_39_0= ruleSlangBlock ) ) | (otherlv_40= LeftParenthesis ( (lv_e_41_0= ruleExpr ) ) otherlv_42= RightParenthesis ) ) ) | ( () otherlv_44= LeftCurlyBracket ( ( ( ( (lv_p_45_0= ruleSlangParams ) ) otherlv_46= EqualsSignGreaterThanSign )? ( (lv_e_47_0= ruleExpr ) ) otherlv_48= RightCurlyBracket ) | ( ( (lv_stmt_49_0= ruleSlangStmt ) )* ( (lv_r_50_0= ruleSlangRet ) )? otherlv_51= RightCurlyBracket ) ) ) ) ;
    public final EObject ruleSlangTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        Token otherlv_42=null;
        Token otherlv_44=null;
        Token otherlv_46=null;
        Token otherlv_48=null;
        Token otherlv_51=null;
        EObject lv_lit_1_0 = null;

        EObject lv_i_3_0 = null;

        EObject lv_enumType_7_0 = null;

        EObject lv_recordType_12_0 = null;

        EObject lv_argExpr_16_0 = null;

        EObject lv_argExpr_20_0 = null;

        EObject lv_ref_25_0 = null;

        EObject lv_cs_26_0 = null;

        EObject lv_e_29_0 = null;

        EObject lv_e_31_0 = null;

        EObject lv_r_35_0 = null;

        EObject lv_r_37_0 = null;

        EObject lv_b_39_0 = null;

        EObject lv_e_41_0 = null;

        EObject lv_p_45_0 = null;

        EObject lv_e_47_0 = null;

        EObject lv_stmt_49_0 = null;

        EObject lv_r_50_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:4278:2: ( ( ( () ( (lv_lit_1_0= ruleSlangLit ) ) ) | ( () ( (lv_i_3_0= ruleSlangInterp ) ) ) | ( ( ( ( () Enum LeftParenthesis ) )=> ( () otherlv_5= Enum otherlv_6= LeftParenthesis ) ) ( (lv_enumType_7_0= ruleDataElement ) ) otherlv_8= Comma ( (otherlv_9= RULE_ID ) ) otherlv_10= RightParenthesis ) | ( ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_12_0= ruleDataElement ) ) otherlv_13= LeftCurlyBracket ( (otherlv_14= RULE_ID ) ) otherlv_15= EqualsSign ) ) ( (lv_argExpr_16_0= ruleExpr ) ) (otherlv_17= Semicolon ( (otherlv_18= RULE_ID ) ) otherlv_19= EqualsSign ( (lv_argExpr_20_0= ruleExpr ) ) )* otherlv_21= RightCurlyBracket ) | ( () ( (otherlv_23= RULE_ID ) ) (otherlv_24= FullStop ( (lv_ref_25_0= ruleOtherDataRef ) ) )? ( (lv_cs_26_0= ruleSlangCallSuffix ) )? ) | ( () otherlv_28= LeftParenthesis ( (lv_e_29_0= ruleExpr ) ) (otherlv_30= Comma ( (lv_e_31_0= ruleExpr ) ) )* otherlv_32= RightParenthesis ) | ( () otherlv_34= For ( (lv_r_35_0= ruleSlangForRange ) ) (otherlv_36= Comma ( (lv_r_37_0= ruleSlangForRange ) ) )* otherlv_38= Yield ( ( (lv_b_39_0= ruleSlangBlock ) ) | (otherlv_40= LeftParenthesis ( (lv_e_41_0= ruleExpr ) ) otherlv_42= RightParenthesis ) ) ) | ( () otherlv_44= LeftCurlyBracket ( ( ( ( (lv_p_45_0= ruleSlangParams ) ) otherlv_46= EqualsSignGreaterThanSign )? ( (lv_e_47_0= ruleExpr ) ) otherlv_48= RightCurlyBracket ) | ( ( (lv_stmt_49_0= ruleSlangStmt ) )* ( (lv_r_50_0= ruleSlangRet ) )? otherlv_51= RightCurlyBracket ) ) ) ) )
            // InternalGumboParser.g:4279:2: ( ( () ( (lv_lit_1_0= ruleSlangLit ) ) ) | ( () ( (lv_i_3_0= ruleSlangInterp ) ) ) | ( ( ( ( () Enum LeftParenthesis ) )=> ( () otherlv_5= Enum otherlv_6= LeftParenthesis ) ) ( (lv_enumType_7_0= ruleDataElement ) ) otherlv_8= Comma ( (otherlv_9= RULE_ID ) ) otherlv_10= RightParenthesis ) | ( ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_12_0= ruleDataElement ) ) otherlv_13= LeftCurlyBracket ( (otherlv_14= RULE_ID ) ) otherlv_15= EqualsSign ) ) ( (lv_argExpr_16_0= ruleExpr ) ) (otherlv_17= Semicolon ( (otherlv_18= RULE_ID ) ) otherlv_19= EqualsSign ( (lv_argExpr_20_0= ruleExpr ) ) )* otherlv_21= RightCurlyBracket ) | ( () ( (otherlv_23= RULE_ID ) ) (otherlv_24= FullStop ( (lv_ref_25_0= ruleOtherDataRef ) ) )? ( (lv_cs_26_0= ruleSlangCallSuffix ) )? ) | ( () otherlv_28= LeftParenthesis ( (lv_e_29_0= ruleExpr ) ) (otherlv_30= Comma ( (lv_e_31_0= ruleExpr ) ) )* otherlv_32= RightParenthesis ) | ( () otherlv_34= For ( (lv_r_35_0= ruleSlangForRange ) ) (otherlv_36= Comma ( (lv_r_37_0= ruleSlangForRange ) ) )* otherlv_38= Yield ( ( (lv_b_39_0= ruleSlangBlock ) ) | (otherlv_40= LeftParenthesis ( (lv_e_41_0= ruleExpr ) ) otherlv_42= RightParenthesis ) ) ) | ( () otherlv_44= LeftCurlyBracket ( ( ( ( (lv_p_45_0= ruleSlangParams ) ) otherlv_46= EqualsSignGreaterThanSign )? ( (lv_e_47_0= ruleExpr ) ) otherlv_48= RightCurlyBracket ) | ( ( (lv_stmt_49_0= ruleSlangStmt ) )* ( (lv_r_50_0= ruleSlangRet ) )? otherlv_51= RightCurlyBracket ) ) ) )
            {
            // InternalGumboParser.g:4279:2: ( ( () ( (lv_lit_1_0= ruleSlangLit ) ) ) | ( () ( (lv_i_3_0= ruleSlangInterp ) ) ) | ( ( ( ( () Enum LeftParenthesis ) )=> ( () otherlv_5= Enum otherlv_6= LeftParenthesis ) ) ( (lv_enumType_7_0= ruleDataElement ) ) otherlv_8= Comma ( (otherlv_9= RULE_ID ) ) otherlv_10= RightParenthesis ) | ( ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_12_0= ruleDataElement ) ) otherlv_13= LeftCurlyBracket ( (otherlv_14= RULE_ID ) ) otherlv_15= EqualsSign ) ) ( (lv_argExpr_16_0= ruleExpr ) ) (otherlv_17= Semicolon ( (otherlv_18= RULE_ID ) ) otherlv_19= EqualsSign ( (lv_argExpr_20_0= ruleExpr ) ) )* otherlv_21= RightCurlyBracket ) | ( () ( (otherlv_23= RULE_ID ) ) (otherlv_24= FullStop ( (lv_ref_25_0= ruleOtherDataRef ) ) )? ( (lv_cs_26_0= ruleSlangCallSuffix ) )? ) | ( () otherlv_28= LeftParenthesis ( (lv_e_29_0= ruleExpr ) ) (otherlv_30= Comma ( (lv_e_31_0= ruleExpr ) ) )* otherlv_32= RightParenthesis ) | ( () otherlv_34= For ( (lv_r_35_0= ruleSlangForRange ) ) (otherlv_36= Comma ( (lv_r_37_0= ruleSlangForRange ) ) )* otherlv_38= Yield ( ( (lv_b_39_0= ruleSlangBlock ) ) | (otherlv_40= LeftParenthesis ( (lv_e_41_0= ruleExpr ) ) otherlv_42= RightParenthesis ) ) ) | ( () otherlv_44= LeftCurlyBracket ( ( ( ( (lv_p_45_0= ruleSlangParams ) ) otherlv_46= EqualsSignGreaterThanSign )? ( (lv_e_47_0= ruleExpr ) ) otherlv_48= RightCurlyBracket ) | ( ( (lv_stmt_49_0= ruleSlangStmt ) )* ( (lv_r_50_0= ruleSlangRet ) )? otherlv_51= RightCurlyBracket ) ) ) )
            int alt95=8;
            alt95 = dfa95.predict(input);
            switch (alt95) {
                case 1 :
                    // InternalGumboParser.g:4280:3: ( () ( (lv_lit_1_0= ruleSlangLit ) ) )
                    {
                    // InternalGumboParser.g:4280:3: ( () ( (lv_lit_1_0= ruleSlangLit ) ) )
                    // InternalGumboParser.g:4281:4: () ( (lv_lit_1_0= ruleSlangLit ) )
                    {
                    // InternalGumboParser.g:4281:4: ()
                    // InternalGumboParser.g:4282:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangTermAccess().getSlangLitTermAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:4288:4: ( (lv_lit_1_0= ruleSlangLit ) )
                    // InternalGumboParser.g:4289:5: (lv_lit_1_0= ruleSlangLit )
                    {
                    // InternalGumboParser.g:4289:5: (lv_lit_1_0= ruleSlangLit )
                    // InternalGumboParser.g:4290:6: lv_lit_1_0= ruleSlangLit
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
                    // InternalGumboParser.g:4309:3: ( () ( (lv_i_3_0= ruleSlangInterp ) ) )
                    {
                    // InternalGumboParser.g:4309:3: ( () ( (lv_i_3_0= ruleSlangInterp ) ) )
                    // InternalGumboParser.g:4310:4: () ( (lv_i_3_0= ruleSlangInterp ) )
                    {
                    // InternalGumboParser.g:4310:4: ()
                    // InternalGumboParser.g:4311:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangTermAccess().getSlangInterpTermAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:4317:4: ( (lv_i_3_0= ruleSlangInterp ) )
                    // InternalGumboParser.g:4318:5: (lv_i_3_0= ruleSlangInterp )
                    {
                    // InternalGumboParser.g:4318:5: (lv_i_3_0= ruleSlangInterp )
                    // InternalGumboParser.g:4319:6: lv_i_3_0= ruleSlangInterp
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
                    // InternalGumboParser.g:4338:3: ( ( ( ( () Enum LeftParenthesis ) )=> ( () otherlv_5= Enum otherlv_6= LeftParenthesis ) ) ( (lv_enumType_7_0= ruleDataElement ) ) otherlv_8= Comma ( (otherlv_9= RULE_ID ) ) otherlv_10= RightParenthesis )
                    {
                    // InternalGumboParser.g:4338:3: ( ( ( ( () Enum LeftParenthesis ) )=> ( () otherlv_5= Enum otherlv_6= LeftParenthesis ) ) ( (lv_enumType_7_0= ruleDataElement ) ) otherlv_8= Comma ( (otherlv_9= RULE_ID ) ) otherlv_10= RightParenthesis )
                    // InternalGumboParser.g:4339:4: ( ( ( () Enum LeftParenthesis ) )=> ( () otherlv_5= Enum otherlv_6= LeftParenthesis ) ) ( (lv_enumType_7_0= ruleDataElement ) ) otherlv_8= Comma ( (otherlv_9= RULE_ID ) ) otherlv_10= RightParenthesis
                    {
                    // InternalGumboParser.g:4339:4: ( ( ( () Enum LeftParenthesis ) )=> ( () otherlv_5= Enum otherlv_6= LeftParenthesis ) )
                    // InternalGumboParser.g:4340:5: ( ( () Enum LeftParenthesis ) )=> ( () otherlv_5= Enum otherlv_6= LeftParenthesis )
                    {
                    // InternalGumboParser.g:4347:5: ( () otherlv_5= Enum otherlv_6= LeftParenthesis )
                    // InternalGumboParser.g:4348:6: () otherlv_5= Enum otherlv_6= LeftParenthesis
                    {
                    // InternalGumboParser.g:4348:6: ()
                    // InternalGumboParser.g:4349:7: 
                    {
                    if ( state.backtracking==0 ) {

                      							current = forceCreateModelElement(
                      								grammarAccess.getSlangTermAccess().getEnumLitExprAction_2_0_0_0(),
                      								current);
                      						
                    }

                    }

                    otherlv_5=(Token)match(input,Enum,FollowSets000.FOLLOW_71); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_5, grammarAccess.getSlangTermAccess().getEnumKeyword_2_0_0_1());
                      					
                    }
                    otherlv_6=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_6, grammarAccess.getSlangTermAccess().getLeftParenthesisKeyword_2_0_0_2());
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:4365:4: ( (lv_enumType_7_0= ruleDataElement ) )
                    // InternalGumboParser.g:4366:5: (lv_enumType_7_0= ruleDataElement )
                    {
                    // InternalGumboParser.g:4366:5: (lv_enumType_7_0= ruleDataElement )
                    // InternalGumboParser.g:4367:6: lv_enumType_7_0= ruleDataElement
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangTermAccess().getEnumTypeDataElementParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_72);
                    lv_enumType_7_0=ruleDataElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlangTermRule());
                      						}
                      						set(
                      							current,
                      							"enumType",
                      							lv_enumType_7_0,
                      							"org.sireum.aadl.gumbo.Gumbo.DataElement");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,Comma,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getSlangTermAccess().getCommaKeyword_2_2());
                      			
                    }
                    // InternalGumboParser.g:4388:4: ( (otherlv_9= RULE_ID ) )
                    // InternalGumboParser.g:4389:5: (otherlv_9= RULE_ID )
                    {
                    // InternalGumboParser.g:4389:5: (otherlv_9= RULE_ID )
                    // InternalGumboParser.g:4390:6: otherlv_9= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSlangTermRule());
                      						}
                      					
                    }
                    otherlv_9=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_9, grammarAccess.getSlangTermAccess().getValueStringLiteralCrossReference_2_3_0());
                      					
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getSlangTermAccess().getRightParenthesisKeyword_2_4());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalGumboParser.g:4407:3: ( ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_12_0= ruleDataElement ) ) otherlv_13= LeftCurlyBracket ( (otherlv_14= RULE_ID ) ) otherlv_15= EqualsSign ) ) ( (lv_argExpr_16_0= ruleExpr ) ) (otherlv_17= Semicolon ( (otherlv_18= RULE_ID ) ) otherlv_19= EqualsSign ( (lv_argExpr_20_0= ruleExpr ) ) )* otherlv_21= RightCurlyBracket )
                    {
                    // InternalGumboParser.g:4407:3: ( ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_12_0= ruleDataElement ) ) otherlv_13= LeftCurlyBracket ( (otherlv_14= RULE_ID ) ) otherlv_15= EqualsSign ) ) ( (lv_argExpr_16_0= ruleExpr ) ) (otherlv_17= Semicolon ( (otherlv_18= RULE_ID ) ) otherlv_19= EqualsSign ( (lv_argExpr_20_0= ruleExpr ) ) )* otherlv_21= RightCurlyBracket )
                    // InternalGumboParser.g:4408:4: ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_12_0= ruleDataElement ) ) otherlv_13= LeftCurlyBracket ( (otherlv_14= RULE_ID ) ) otherlv_15= EqualsSign ) ) ( (lv_argExpr_16_0= ruleExpr ) ) (otherlv_17= Semicolon ( (otherlv_18= RULE_ID ) ) otherlv_19= EqualsSign ( (lv_argExpr_20_0= ruleExpr ) ) )* otherlv_21= RightCurlyBracket
                    {
                    // InternalGumboParser.g:4408:4: ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_12_0= ruleDataElement ) ) otherlv_13= LeftCurlyBracket ( (otherlv_14= RULE_ID ) ) otherlv_15= EqualsSign ) )
                    // InternalGumboParser.g:4409:5: ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_12_0= ruleDataElement ) ) otherlv_13= LeftCurlyBracket ( (otherlv_14= RULE_ID ) ) otherlv_15= EqualsSign )
                    {
                    // InternalGumboParser.g:4426:5: ( () ( (lv_recordType_12_0= ruleDataElement ) ) otherlv_13= LeftCurlyBracket ( (otherlv_14= RULE_ID ) ) otherlv_15= EqualsSign )
                    // InternalGumboParser.g:4427:6: () ( (lv_recordType_12_0= ruleDataElement ) ) otherlv_13= LeftCurlyBracket ( (otherlv_14= RULE_ID ) ) otherlv_15= EqualsSign
                    {
                    // InternalGumboParser.g:4427:6: ()
                    // InternalGumboParser.g:4428:7: 
                    {
                    if ( state.backtracking==0 ) {

                      							current = forceCreateModelElement(
                      								grammarAccess.getSlangTermAccess().getRecordLitExprAction_3_0_0_0(),
                      								current);
                      						
                    }

                    }

                    // InternalGumboParser.g:4434:6: ( (lv_recordType_12_0= ruleDataElement ) )
                    // InternalGumboParser.g:4435:7: (lv_recordType_12_0= ruleDataElement )
                    {
                    // InternalGumboParser.g:4435:7: (lv_recordType_12_0= ruleDataElement )
                    // InternalGumboParser.g:4436:8: lv_recordType_12_0= ruleDataElement
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getSlangTermAccess().getRecordTypeDataElementParserRuleCall_3_0_0_1_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_48);
                    lv_recordType_12_0=ruleDataElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getSlangTermRule());
                      								}
                      								set(
                      									current,
                      									"recordType",
                      									lv_recordType_12_0,
                      									"org.sireum.aadl.gumbo.Gumbo.DataElement");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,LeftCurlyBracket,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_13, grammarAccess.getSlangTermAccess().getLeftCurlyBracketKeyword_3_0_0_2());
                      					
                    }
                    // InternalGumboParser.g:4457:6: ( (otherlv_14= RULE_ID ) )
                    // InternalGumboParser.g:4458:7: (otherlv_14= RULE_ID )
                    {
                    // InternalGumboParser.g:4458:7: (otherlv_14= RULE_ID )
                    // InternalGumboParser.g:4459:8: otherlv_14= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElement(grammarAccess.getSlangTermRule());
                      								}
                      							
                    }
                    otherlv_14=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_73); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								newLeafNode(otherlv_14, grammarAccess.getSlangTermAccess().getArgsNamedElementCrossReference_3_0_0_3_0());
                      							
                    }

                    }


                    }

                    otherlv_15=(Token)match(input,EqualsSign,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_15, grammarAccess.getSlangTermAccess().getEqualsSignKeyword_3_0_0_4());
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:4476:4: ( (lv_argExpr_16_0= ruleExpr ) )
                    // InternalGumboParser.g:4477:5: (lv_argExpr_16_0= ruleExpr )
                    {
                    // InternalGumboParser.g:4477:5: (lv_argExpr_16_0= ruleExpr )
                    // InternalGumboParser.g:4478:6: lv_argExpr_16_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangTermAccess().getArgExprExprParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_74);
                    lv_argExpr_16_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlangTermRule());
                      						}
                      						add(
                      							current,
                      							"argExpr",
                      							lv_argExpr_16_0,
                      							"org.sireum.aadl.gumbo.Gumbo.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:4495:4: (otherlv_17= Semicolon ( (otherlv_18= RULE_ID ) ) otherlv_19= EqualsSign ( (lv_argExpr_20_0= ruleExpr ) ) )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==Semicolon) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // InternalGumboParser.g:4496:5: otherlv_17= Semicolon ( (otherlv_18= RULE_ID ) ) otherlv_19= EqualsSign ( (lv_argExpr_20_0= ruleExpr ) )
                    	    {
                    	    otherlv_17=(Token)match(input,Semicolon,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_17, grammarAccess.getSlangTermAccess().getSemicolonKeyword_3_2_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:4500:5: ( (otherlv_18= RULE_ID ) )
                    	    // InternalGumboParser.g:4501:6: (otherlv_18= RULE_ID )
                    	    {
                    	    // InternalGumboParser.g:4501:6: (otherlv_18= RULE_ID )
                    	    // InternalGumboParser.g:4502:7: otherlv_18= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getSlangTermRule());
                    	      							}
                    	      						
                    	    }
                    	    otherlv_18=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_73); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_18, grammarAccess.getSlangTermAccess().getArgsNamedElementCrossReference_3_2_1_0());
                    	      						
                    	    }

                    	    }


                    	    }

                    	    otherlv_19=(Token)match(input,EqualsSign,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_19, grammarAccess.getSlangTermAccess().getEqualsSignKeyword_3_2_2());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:4517:5: ( (lv_argExpr_20_0= ruleExpr ) )
                    	    // InternalGumboParser.g:4518:6: (lv_argExpr_20_0= ruleExpr )
                    	    {
                    	    // InternalGumboParser.g:4518:6: (lv_argExpr_20_0= ruleExpr )
                    	    // InternalGumboParser.g:4519:7: lv_argExpr_20_0= ruleExpr
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSlangTermAccess().getArgExprExprParserRuleCall_3_2_3_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_74);
                    	    lv_argExpr_20_0=ruleExpr();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSlangTermRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"argExpr",
                    	      								lv_argExpr_20_0,
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

                    otherlv_21=(Token)match(input,RightCurlyBracket,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_21, grammarAccess.getSlangTermAccess().getRightCurlyBracketKeyword_3_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalGumboParser.g:4543:3: ( () ( (otherlv_23= RULE_ID ) ) (otherlv_24= FullStop ( (lv_ref_25_0= ruleOtherDataRef ) ) )? ( (lv_cs_26_0= ruleSlangCallSuffix ) )? )
                    {
                    // InternalGumboParser.g:4543:3: ( () ( (otherlv_23= RULE_ID ) ) (otherlv_24= FullStop ( (lv_ref_25_0= ruleOtherDataRef ) ) )? ( (lv_cs_26_0= ruleSlangCallSuffix ) )? )
                    // InternalGumboParser.g:4544:4: () ( (otherlv_23= RULE_ID ) ) (otherlv_24= FullStop ( (lv_ref_25_0= ruleOtherDataRef ) ) )? ( (lv_cs_26_0= ruleSlangCallSuffix ) )?
                    {
                    // InternalGumboParser.g:4544:4: ()
                    // InternalGumboParser.g:4545:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangTermAccess().getDataRefExprAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:4551:4: ( (otherlv_23= RULE_ID ) )
                    // InternalGumboParser.g:4552:5: (otherlv_23= RULE_ID )
                    {
                    // InternalGumboParser.g:4552:5: (otherlv_23= RULE_ID )
                    // InternalGumboParser.g:4553:6: otherlv_23= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSlangTermRule());
                      						}
                      					
                    }
                    otherlv_23=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_75); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_23, grammarAccess.getSlangTermAccess().getPortOrSubcomponentOrStateVarEObjectCrossReference_4_1_0());
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:4564:4: (otherlv_24= FullStop ( (lv_ref_25_0= ruleOtherDataRef ) ) )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==FullStop) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // InternalGumboParser.g:4565:5: otherlv_24= FullStop ( (lv_ref_25_0= ruleOtherDataRef ) )
                            {
                            otherlv_24=(Token)match(input,FullStop,FollowSets000.FOLLOW_10); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_24, grammarAccess.getSlangTermAccess().getFullStopKeyword_4_2_0());
                              				
                            }
                            // InternalGumboParser.g:4569:5: ( (lv_ref_25_0= ruleOtherDataRef ) )
                            // InternalGumboParser.g:4570:6: (lv_ref_25_0= ruleOtherDataRef )
                            {
                            // InternalGumboParser.g:4570:6: (lv_ref_25_0= ruleOtherDataRef )
                            // InternalGumboParser.g:4571:7: lv_ref_25_0= ruleOtherDataRef
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSlangTermAccess().getRefOtherDataRefParserRuleCall_4_2_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_76);
                            lv_ref_25_0=ruleOtherDataRef();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getSlangTermRule());
                              							}
                              							set(
                              								current,
                              								"ref",
                              								lv_ref_25_0,
                              								"org.sireum.aadl.gumbo.Gumbo.OtherDataRef");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalGumboParser.g:4589:4: ( (lv_cs_26_0= ruleSlangCallSuffix ) )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==LeftParenthesis||LA87_0==LeftSquareBracket) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // InternalGumboParser.g:4590:5: (lv_cs_26_0= ruleSlangCallSuffix )
                            {
                            // InternalGumboParser.g:4590:5: (lv_cs_26_0= ruleSlangCallSuffix )
                            // InternalGumboParser.g:4591:6: lv_cs_26_0= ruleSlangCallSuffix
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getSlangTermAccess().getCsSlangCallSuffixParserRuleCall_4_3_0());
                              					
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_cs_26_0=ruleSlangCallSuffix();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getSlangTermRule());
                              						}
                              						set(
                              							current,
                              							"cs",
                              							lv_cs_26_0,
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
                case 6 :
                    // InternalGumboParser.g:4610:3: ( () otherlv_28= LeftParenthesis ( (lv_e_29_0= ruleExpr ) ) (otherlv_30= Comma ( (lv_e_31_0= ruleExpr ) ) )* otherlv_32= RightParenthesis )
                    {
                    // InternalGumboParser.g:4610:3: ( () otherlv_28= LeftParenthesis ( (lv_e_29_0= ruleExpr ) ) (otherlv_30= Comma ( (lv_e_31_0= ruleExpr ) ) )* otherlv_32= RightParenthesis )
                    // InternalGumboParser.g:4611:4: () otherlv_28= LeftParenthesis ( (lv_e_29_0= ruleExpr ) ) (otherlv_30= Comma ( (lv_e_31_0= ruleExpr ) ) )* otherlv_32= RightParenthesis
                    {
                    // InternalGumboParser.g:4611:4: ()
                    // InternalGumboParser.g:4612:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangTermAccess().getSlangTupleTermAction_5_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_28=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_28, grammarAccess.getSlangTermAccess().getLeftParenthesisKeyword_5_1());
                      			
                    }
                    // InternalGumboParser.g:4622:4: ( (lv_e_29_0= ruleExpr ) )
                    // InternalGumboParser.g:4623:5: (lv_e_29_0= ruleExpr )
                    {
                    // InternalGumboParser.g:4623:5: (lv_e_29_0= ruleExpr )
                    // InternalGumboParser.g:4624:6: lv_e_29_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangTermAccess().getEExprParserRuleCall_5_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_34);
                    lv_e_29_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlangTermRule());
                      						}
                      						add(
                      							current,
                      							"e",
                      							lv_e_29_0,
                      							"org.sireum.aadl.gumbo.Gumbo.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:4641:4: (otherlv_30= Comma ( (lv_e_31_0= ruleExpr ) ) )*
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==Comma) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // InternalGumboParser.g:4642:5: otherlv_30= Comma ( (lv_e_31_0= ruleExpr ) )
                    	    {
                    	    otherlv_30=(Token)match(input,Comma,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_30, grammarAccess.getSlangTermAccess().getCommaKeyword_5_3_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:4646:5: ( (lv_e_31_0= ruleExpr ) )
                    	    // InternalGumboParser.g:4647:6: (lv_e_31_0= ruleExpr )
                    	    {
                    	    // InternalGumboParser.g:4647:6: (lv_e_31_0= ruleExpr )
                    	    // InternalGumboParser.g:4648:7: lv_e_31_0= ruleExpr
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSlangTermAccess().getEExprParserRuleCall_5_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_34);
                    	    lv_e_31_0=ruleExpr();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSlangTermRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"e",
                    	      								lv_e_31_0,
                    	      								"org.sireum.aadl.gumbo.Gumbo.Expr");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop88;
                        }
                    } while (true);

                    otherlv_32=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_32, grammarAccess.getSlangTermAccess().getRightParenthesisKeyword_5_4());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalGumboParser.g:4672:3: ( () otherlv_34= For ( (lv_r_35_0= ruleSlangForRange ) ) (otherlv_36= Comma ( (lv_r_37_0= ruleSlangForRange ) ) )* otherlv_38= Yield ( ( (lv_b_39_0= ruleSlangBlock ) ) | (otherlv_40= LeftParenthesis ( (lv_e_41_0= ruleExpr ) ) otherlv_42= RightParenthesis ) ) )
                    {
                    // InternalGumboParser.g:4672:3: ( () otherlv_34= For ( (lv_r_35_0= ruleSlangForRange ) ) (otherlv_36= Comma ( (lv_r_37_0= ruleSlangForRange ) ) )* otherlv_38= Yield ( ( (lv_b_39_0= ruleSlangBlock ) ) | (otherlv_40= LeftParenthesis ( (lv_e_41_0= ruleExpr ) ) otherlv_42= RightParenthesis ) ) )
                    // InternalGumboParser.g:4673:4: () otherlv_34= For ( (lv_r_35_0= ruleSlangForRange ) ) (otherlv_36= Comma ( (lv_r_37_0= ruleSlangForRange ) ) )* otherlv_38= Yield ( ( (lv_b_39_0= ruleSlangBlock ) ) | (otherlv_40= LeftParenthesis ( (lv_e_41_0= ruleExpr ) ) otherlv_42= RightParenthesis ) )
                    {
                    // InternalGumboParser.g:4673:4: ()
                    // InternalGumboParser.g:4674:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangTermAccess().getSlangForTermAction_6_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_34=(Token)match(input,For,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_34, grammarAccess.getSlangTermAccess().getForKeyword_6_1());
                      			
                    }
                    // InternalGumboParser.g:4684:4: ( (lv_r_35_0= ruleSlangForRange ) )
                    // InternalGumboParser.g:4685:5: (lv_r_35_0= ruleSlangForRange )
                    {
                    // InternalGumboParser.g:4685:5: (lv_r_35_0= ruleSlangForRange )
                    // InternalGumboParser.g:4686:6: lv_r_35_0= ruleSlangForRange
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangTermAccess().getRSlangForRangeParserRuleCall_6_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_77);
                    lv_r_35_0=ruleSlangForRange();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSlangTermRule());
                      						}
                      						add(
                      							current,
                      							"r",
                      							lv_r_35_0,
                      							"org.sireum.aadl.gumbo.Gumbo.SlangForRange");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:4703:4: (otherlv_36= Comma ( (lv_r_37_0= ruleSlangForRange ) ) )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==Comma) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // InternalGumboParser.g:4704:5: otherlv_36= Comma ( (lv_r_37_0= ruleSlangForRange ) )
                    	    {
                    	    otherlv_36=(Token)match(input,Comma,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_36, grammarAccess.getSlangTermAccess().getCommaKeyword_6_3_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:4708:5: ( (lv_r_37_0= ruleSlangForRange ) )
                    	    // InternalGumboParser.g:4709:6: (lv_r_37_0= ruleSlangForRange )
                    	    {
                    	    // InternalGumboParser.g:4709:6: (lv_r_37_0= ruleSlangForRange )
                    	    // InternalGumboParser.g:4710:7: lv_r_37_0= ruleSlangForRange
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSlangTermAccess().getRSlangForRangeParserRuleCall_6_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_77);
                    	    lv_r_37_0=ruleSlangForRange();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSlangTermRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"r",
                    	      								lv_r_37_0,
                    	      								"org.sireum.aadl.gumbo.Gumbo.SlangForRange");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop89;
                        }
                    } while (true);

                    otherlv_38=(Token)match(input,Yield,FollowSets000.FOLLOW_78); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_38, grammarAccess.getSlangTermAccess().getYieldKeyword_6_4());
                      			
                    }
                    // InternalGumboParser.g:4732:4: ( ( (lv_b_39_0= ruleSlangBlock ) ) | (otherlv_40= LeftParenthesis ( (lv_e_41_0= ruleExpr ) ) otherlv_42= RightParenthesis ) )
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==LeftCurlyBracket) ) {
                        alt90=1;
                    }
                    else if ( (LA90_0==LeftParenthesis) ) {
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
                            // InternalGumboParser.g:4733:5: ( (lv_b_39_0= ruleSlangBlock ) )
                            {
                            // InternalGumboParser.g:4733:5: ( (lv_b_39_0= ruleSlangBlock ) )
                            // InternalGumboParser.g:4734:6: (lv_b_39_0= ruleSlangBlock )
                            {
                            // InternalGumboParser.g:4734:6: (lv_b_39_0= ruleSlangBlock )
                            // InternalGumboParser.g:4735:7: lv_b_39_0= ruleSlangBlock
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSlangTermAccess().getBSlangBlockParserRuleCall_6_5_0_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_b_39_0=ruleSlangBlock();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getSlangTermRule());
                              							}
                              							set(
                              								current,
                              								"b",
                              								lv_b_39_0,
                              								"org.sireum.aadl.gumbo.Gumbo.SlangBlock");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalGumboParser.g:4753:5: (otherlv_40= LeftParenthesis ( (lv_e_41_0= ruleExpr ) ) otherlv_42= RightParenthesis )
                            {
                            // InternalGumboParser.g:4753:5: (otherlv_40= LeftParenthesis ( (lv_e_41_0= ruleExpr ) ) otherlv_42= RightParenthesis )
                            // InternalGumboParser.g:4754:6: otherlv_40= LeftParenthesis ( (lv_e_41_0= ruleExpr ) ) otherlv_42= RightParenthesis
                            {
                            otherlv_40=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_17); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_40, grammarAccess.getSlangTermAccess().getLeftParenthesisKeyword_6_5_1_0());
                              					
                            }
                            // InternalGumboParser.g:4758:6: ( (lv_e_41_0= ruleExpr ) )
                            // InternalGumboParser.g:4759:7: (lv_e_41_0= ruleExpr )
                            {
                            // InternalGumboParser.g:4759:7: (lv_e_41_0= ruleExpr )
                            // InternalGumboParser.g:4760:8: lv_e_41_0= ruleExpr
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getSlangTermAccess().getEExprParserRuleCall_6_5_1_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_33);
                            lv_e_41_0=ruleExpr();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getSlangTermRule());
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

                            otherlv_42=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_42, grammarAccess.getSlangTermAccess().getRightParenthesisKeyword_6_5_1_2());
                              					
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalGumboParser.g:4785:3: ( () otherlv_44= LeftCurlyBracket ( ( ( ( (lv_p_45_0= ruleSlangParams ) ) otherlv_46= EqualsSignGreaterThanSign )? ( (lv_e_47_0= ruleExpr ) ) otherlv_48= RightCurlyBracket ) | ( ( (lv_stmt_49_0= ruleSlangStmt ) )* ( (lv_r_50_0= ruleSlangRet ) )? otherlv_51= RightCurlyBracket ) ) )
                    {
                    // InternalGumboParser.g:4785:3: ( () otherlv_44= LeftCurlyBracket ( ( ( ( (lv_p_45_0= ruleSlangParams ) ) otherlv_46= EqualsSignGreaterThanSign )? ( (lv_e_47_0= ruleExpr ) ) otherlv_48= RightCurlyBracket ) | ( ( (lv_stmt_49_0= ruleSlangStmt ) )* ( (lv_r_50_0= ruleSlangRet ) )? otherlv_51= RightCurlyBracket ) ) )
                    // InternalGumboParser.g:4786:4: () otherlv_44= LeftCurlyBracket ( ( ( ( (lv_p_45_0= ruleSlangParams ) ) otherlv_46= EqualsSignGreaterThanSign )? ( (lv_e_47_0= ruleExpr ) ) otherlv_48= RightCurlyBracket ) | ( ( (lv_stmt_49_0= ruleSlangStmt ) )* ( (lv_r_50_0= ruleSlangRet ) )? otherlv_51= RightCurlyBracket ) )
                    {
                    // InternalGumboParser.g:4786:4: ()
                    // InternalGumboParser.g:4787:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangTermAccess().getSlangBlockTermAction_7_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_44=(Token)match(input,LeftCurlyBracket,FollowSets000.FOLLOW_79); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_44, grammarAccess.getSlangTermAccess().getLeftCurlyBracketKeyword_7_1());
                      			
                    }
                    // InternalGumboParser.g:4797:4: ( ( ( ( (lv_p_45_0= ruleSlangParams ) ) otherlv_46= EqualsSignGreaterThanSign )? ( (lv_e_47_0= ruleExpr ) ) otherlv_48= RightCurlyBracket ) | ( ( (lv_stmt_49_0= ruleSlangStmt ) )* ( (lv_r_50_0= ruleSlangRet ) )? otherlv_51= RightCurlyBracket ) )
                    int alt94=2;
                    switch ( input.LA(1) ) {
                    case Some:
                    case All:
                    case Enum:
                    case For:
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
                        alt94=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        switch ( input.LA(2) ) {
                        case ColonColon:
                        case FullStop:
                        case LeftCurlyBracket:
                            {
                            alt94=1;
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
                            alt94=2;
                            }
                            break;
                        case LeftParenthesis:
                        case Asterisk:
                        case PlusSign:
                        case HyphenMinus:
                        case QuestionMark:
                        case LeftSquareBracket:
                        case RightCurlyBracket:
                        case RULE_OP:
                            {
                            alt94=1;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 94, 2, input);

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
                        alt94=2;
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
                            // InternalGumboParser.g:4798:5: ( ( ( (lv_p_45_0= ruleSlangParams ) ) otherlv_46= EqualsSignGreaterThanSign )? ( (lv_e_47_0= ruleExpr ) ) otherlv_48= RightCurlyBracket )
                            {
                            // InternalGumboParser.g:4798:5: ( ( ( (lv_p_45_0= ruleSlangParams ) ) otherlv_46= EqualsSignGreaterThanSign )? ( (lv_e_47_0= ruleExpr ) ) otherlv_48= RightCurlyBracket )
                            // InternalGumboParser.g:4799:6: ( ( (lv_p_45_0= ruleSlangParams ) ) otherlv_46= EqualsSignGreaterThanSign )? ( (lv_e_47_0= ruleExpr ) ) otherlv_48= RightCurlyBracket
                            {
                            // InternalGumboParser.g:4799:6: ( ( (lv_p_45_0= ruleSlangParams ) ) otherlv_46= EqualsSignGreaterThanSign )?
                            int alt91=2;
                            int LA91_0 = input.LA(1);

                            if ( (LA91_0==LeftParenthesis) ) {
                                int LA91_1 = input.LA(2);

                                if ( (LA91_1==Var) ) {
                                    alt91=1;
                                }
                                else if ( (LA91_1==RULE_ID) ) {
                                    int LA91_4 = input.LA(3);

                                    if ( (LA91_4==Colon) ) {
                                        alt91=1;
                                    }
                                }
                            }
                            switch (alt91) {
                                case 1 :
                                    // InternalGumboParser.g:4800:7: ( (lv_p_45_0= ruleSlangParams ) ) otherlv_46= EqualsSignGreaterThanSign
                                    {
                                    // InternalGumboParser.g:4800:7: ( (lv_p_45_0= ruleSlangParams ) )
                                    // InternalGumboParser.g:4801:8: (lv_p_45_0= ruleSlangParams )
                                    {
                                    // InternalGumboParser.g:4801:8: (lv_p_45_0= ruleSlangParams )
                                    // InternalGumboParser.g:4802:9: lv_p_45_0= ruleSlangParams
                                    {
                                    if ( state.backtracking==0 ) {

                                      									newCompositeNode(grammarAccess.getSlangTermAccess().getPSlangParamsParserRuleCall_7_2_0_0_0_0());
                                      								
                                    }
                                    pushFollow(FollowSets000.FOLLOW_57);
                                    lv_p_45_0=ruleSlangParams();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElementForParent(grammarAccess.getSlangTermRule());
                                      									}
                                      									set(
                                      										current,
                                      										"p",
                                      										lv_p_45_0,
                                      										"org.sireum.aadl.gumbo.Gumbo.SlangParams");
                                      									afterParserOrEnumRuleCall();
                                      								
                                    }

                                    }


                                    }

                                    otherlv_46=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_17); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(otherlv_46, grammarAccess.getSlangTermAccess().getEqualsSignGreaterThanSignKeyword_7_2_0_0_1());
                                      						
                                    }

                                    }
                                    break;

                            }

                            // InternalGumboParser.g:4824:6: ( (lv_e_47_0= ruleExpr ) )
                            // InternalGumboParser.g:4825:7: (lv_e_47_0= ruleExpr )
                            {
                            // InternalGumboParser.g:4825:7: (lv_e_47_0= ruleExpr )
                            // InternalGumboParser.g:4826:8: lv_e_47_0= ruleExpr
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getSlangTermAccess().getEExprParserRuleCall_7_2_0_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_70);
                            lv_e_47_0=ruleExpr();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getSlangTermRule());
                              								}
                              								set(
                              									current,
                              									"e",
                              									lv_e_47_0,
                              									"org.sireum.aadl.gumbo.Gumbo.Expr");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            otherlv_48=(Token)match(input,RightCurlyBracket,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_48, grammarAccess.getSlangTermAccess().getRightCurlyBracketKeyword_7_2_0_2());
                              					
                            }

                            }


                            }
                            break;
                        case 2 :
                            // InternalGumboParser.g:4849:5: ( ( (lv_stmt_49_0= ruleSlangStmt ) )* ( (lv_r_50_0= ruleSlangRet ) )? otherlv_51= RightCurlyBracket )
                            {
                            // InternalGumboParser.g:4849:5: ( ( (lv_stmt_49_0= ruleSlangStmt ) )* ( (lv_r_50_0= ruleSlangRet ) )? otherlv_51= RightCurlyBracket )
                            // InternalGumboParser.g:4850:6: ( (lv_stmt_49_0= ruleSlangStmt ) )* ( (lv_r_50_0= ruleSlangRet ) )? otherlv_51= RightCurlyBracket
                            {
                            // InternalGumboParser.g:4850:6: ( (lv_stmt_49_0= ruleSlangStmt ) )*
                            loop92:
                            do {
                                int alt92=2;
                                int LA92_0 = input.LA(1);

                                if ( ((LA92_0>=Assert && LA92_0<=Assume)||LA92_0==Match||LA92_0==While||(LA92_0>=Halt && LA92_0<=Spec)||(LA92_0>=Val && LA92_0<=Var)||(LA92_0>=Do && LA92_0<=If)||LA92_0==RULE_ID) ) {
                                    alt92=1;
                                }


                                switch (alt92) {
                            	case 1 :
                            	    // InternalGumboParser.g:4851:7: (lv_stmt_49_0= ruleSlangStmt )
                            	    {
                            	    // InternalGumboParser.g:4851:7: (lv_stmt_49_0= ruleSlangStmt )
                            	    // InternalGumboParser.g:4852:8: lv_stmt_49_0= ruleSlangStmt
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getSlangTermAccess().getStmtSlangStmtParserRuleCall_7_2_1_0_0());
                            	      							
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_69);
                            	    lv_stmt_49_0=ruleSlangStmt();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getSlangTermRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"stmt",
                            	      									lv_stmt_49_0,
                            	      									"org.sireum.aadl.gumbo.Gumbo.SlangStmt");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop92;
                                }
                            } while (true);

                            // InternalGumboParser.g:4869:6: ( (lv_r_50_0= ruleSlangRet ) )?
                            int alt93=2;
                            int LA93_0 = input.LA(1);

                            if ( (LA93_0==Return) ) {
                                alt93=1;
                            }
                            switch (alt93) {
                                case 1 :
                                    // InternalGumboParser.g:4870:7: (lv_r_50_0= ruleSlangRet )
                                    {
                                    // InternalGumboParser.g:4870:7: (lv_r_50_0= ruleSlangRet )
                                    // InternalGumboParser.g:4871:8: lv_r_50_0= ruleSlangRet
                                    {
                                    if ( state.backtracking==0 ) {

                                      								newCompositeNode(grammarAccess.getSlangTermAccess().getRSlangRetParserRuleCall_7_2_1_1_0());
                                      							
                                    }
                                    pushFollow(FollowSets000.FOLLOW_70);
                                    lv_r_50_0=ruleSlangRet();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								if (current==null) {
                                      									current = createModelElementForParent(grammarAccess.getSlangTermRule());
                                      								}
                                      								set(
                                      									current,
                                      									"r",
                                      									lv_r_50_0,
                                      									"org.sireum.aadl.gumbo.Gumbo.SlangRet");
                                      								afterParserOrEnumRuleCall();
                                      							
                                    }

                                    }


                                    }
                                    break;

                            }

                            otherlv_51=(Token)match(input,RightCurlyBracket,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_51, grammarAccess.getSlangTermAccess().getRightCurlyBracketKeyword_7_2_1_2());
                              					
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
    // InternalGumboParser.g:4899:1: entryRuleSlangParams returns [EObject current=null] : iv_ruleSlangParams= ruleSlangParams EOF ;
    public final EObject entryRuleSlangParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangParams = null;


        try {
            // InternalGumboParser.g:4899:52: (iv_ruleSlangParams= ruleSlangParams EOF )
            // InternalGumboParser.g:4900:2: iv_ruleSlangParams= ruleSlangParams EOF
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
    // InternalGumboParser.g:4906:1: ruleSlangParams returns [EObject current=null] : (otherlv_0= LeftParenthesis ( (lv_params_1_0= ruleSlangParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangParam ) ) )? otherlv_4= RightParenthesis ) ;
    public final EObject ruleSlangParams() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_params_1_0 = null;

        EObject lv_params_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:4912:2: ( (otherlv_0= LeftParenthesis ( (lv_params_1_0= ruleSlangParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangParam ) ) )? otherlv_4= RightParenthesis ) )
            // InternalGumboParser.g:4913:2: (otherlv_0= LeftParenthesis ( (lv_params_1_0= ruleSlangParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangParam ) ) )? otherlv_4= RightParenthesis )
            {
            // InternalGumboParser.g:4913:2: (otherlv_0= LeftParenthesis ( (lv_params_1_0= ruleSlangParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangParam ) ) )? otherlv_4= RightParenthesis )
            // InternalGumboParser.g:4914:3: otherlv_0= LeftParenthesis ( (lv_params_1_0= ruleSlangParam ) ) (otherlv_2= Comma ( (lv_params_3_0= ruleSlangParam ) ) )? otherlv_4= RightParenthesis
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_80); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangParamsAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalGumboParser.g:4918:3: ( (lv_params_1_0= ruleSlangParam ) )
            // InternalGumboParser.g:4919:4: (lv_params_1_0= ruleSlangParam )
            {
            // InternalGumboParser.g:4919:4: (lv_params_1_0= ruleSlangParam )
            // InternalGumboParser.g:4920:5: lv_params_1_0= ruleSlangParam
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangParamsAccess().getParamsSlangParamParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_34);
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

            // InternalGumboParser.g:4937:3: (otherlv_2= Comma ( (lv_params_3_0= ruleSlangParam ) ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==Comma) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalGumboParser.g:4938:4: otherlv_2= Comma ( (lv_params_3_0= ruleSlangParam ) )
                    {
                    otherlv_2=(Token)match(input,Comma,FollowSets000.FOLLOW_80); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSlangParamsAccess().getCommaKeyword_2_0());
                      			
                    }
                    // InternalGumboParser.g:4942:4: ( (lv_params_3_0= ruleSlangParam ) )
                    // InternalGumboParser.g:4943:5: (lv_params_3_0= ruleSlangParam )
                    {
                    // InternalGumboParser.g:4943:5: (lv_params_3_0= ruleSlangParam )
                    // InternalGumboParser.g:4944:6: lv_params_3_0= ruleSlangParam
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangParamsAccess().getParamsSlangParamParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_33);
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
    // InternalGumboParser.g:4970:1: entryRuleSlangParam returns [EObject current=null] : iv_ruleSlangParam= ruleSlangParam EOF ;
    public final EObject entryRuleSlangParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangParam = null;


        try {
            // InternalGumboParser.g:4970:51: (iv_ruleSlangParam= ruleSlangParam EOF )
            // InternalGumboParser.g:4971:2: iv_ruleSlangParam= ruleSlangParam EOF
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
    // InternalGumboParser.g:4977:1: ruleSlangParam returns [EObject current=null] : ( (otherlv_0= Var )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon (otherlv_3= EqualsSignGreaterThanSign )? ( (lv_typeName_4_0= ruleSlangType ) ) (otherlv_5= Asterisk )? ) ;
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
            // InternalGumboParser.g:4983:2: ( ( (otherlv_0= Var )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon (otherlv_3= EqualsSignGreaterThanSign )? ( (lv_typeName_4_0= ruleSlangType ) ) (otherlv_5= Asterisk )? ) )
            // InternalGumboParser.g:4984:2: ( (otherlv_0= Var )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon (otherlv_3= EqualsSignGreaterThanSign )? ( (lv_typeName_4_0= ruleSlangType ) ) (otherlv_5= Asterisk )? )
            {
            // InternalGumboParser.g:4984:2: ( (otherlv_0= Var )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon (otherlv_3= EqualsSignGreaterThanSign )? ( (lv_typeName_4_0= ruleSlangType ) ) (otherlv_5= Asterisk )? )
            // InternalGumboParser.g:4985:3: (otherlv_0= Var )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon (otherlv_3= EqualsSignGreaterThanSign )? ( (lv_typeName_4_0= ruleSlangType ) ) (otherlv_5= Asterisk )?
            {
            // InternalGumboParser.g:4985:3: (otherlv_0= Var )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==Var) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalGumboParser.g:4986:4: otherlv_0= Var
                    {
                    otherlv_0=(Token)match(input,Var,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getSlangParamAccess().getVarKeyword_0());
                      			
                    }

                    }
                    break;

            }

            // InternalGumboParser.g:4991:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGumboParser.g:4992:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGumboParser.g:4992:4: (lv_name_1_0= RULE_ID )
            // InternalGumboParser.g:4993:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,Colon,FollowSets000.FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSlangParamAccess().getColonKeyword_2());
              		
            }
            // InternalGumboParser.g:5013:3: (otherlv_3= EqualsSignGreaterThanSign )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==EqualsSignGreaterThanSign) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalGumboParser.g:5014:4: otherlv_3= EqualsSignGreaterThanSign
                    {
                    otherlv_3=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getSlangParamAccess().getEqualsSignGreaterThanSignKeyword_3());
                      			
                    }

                    }
                    break;

            }

            // InternalGumboParser.g:5019:3: ( (lv_typeName_4_0= ruleSlangType ) )
            // InternalGumboParser.g:5020:4: (lv_typeName_4_0= ruleSlangType )
            {
            // InternalGumboParser.g:5020:4: (lv_typeName_4_0= ruleSlangType )
            // InternalGumboParser.g:5021:5: lv_typeName_4_0= ruleSlangType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangParamAccess().getTypeNameSlangTypeParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_36);
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

            // InternalGumboParser.g:5038:3: (otherlv_5= Asterisk )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==Asterisk) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalGumboParser.g:5039:4: otherlv_5= Asterisk
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
    // InternalGumboParser.g:5048:1: entryRuleSlangForRange returns [EObject current=null] : iv_ruleSlangForRange= ruleSlangForRange EOF ;
    public final EObject entryRuleSlangForRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangForRange = null;


        try {
            // InternalGumboParser.g:5048:54: (iv_ruleSlangForRange= ruleSlangForRange EOF )
            // InternalGumboParser.g:5049:2: iv_ruleSlangForRange= ruleSlangForRange EOF
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
    // InternalGumboParser.g:5055:1: ruleSlangForRange returns [EObject current=null] : (this_ID_0= RULE_ID otherlv_1= Colon ( (lv_e_2_0= ruleExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upper_5_0= ruleExpr ) ) (otherlv_6= By ( (lv_step_7_0= ruleExpr ) ) )? )? ) ;
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
            // InternalGumboParser.g:5061:2: ( (this_ID_0= RULE_ID otherlv_1= Colon ( (lv_e_2_0= ruleExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upper_5_0= ruleExpr ) ) (otherlv_6= By ( (lv_step_7_0= ruleExpr ) ) )? )? ) )
            // InternalGumboParser.g:5062:2: (this_ID_0= RULE_ID otherlv_1= Colon ( (lv_e_2_0= ruleExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upper_5_0= ruleExpr ) ) (otherlv_6= By ( (lv_step_7_0= ruleExpr ) ) )? )? )
            {
            // InternalGumboParser.g:5062:2: (this_ID_0= RULE_ID otherlv_1= Colon ( (lv_e_2_0= ruleExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upper_5_0= ruleExpr ) ) (otherlv_6= By ( (lv_step_7_0= ruleExpr ) ) )? )? )
            // InternalGumboParser.g:5063:3: this_ID_0= RULE_ID otherlv_1= Colon ( (lv_e_2_0= ruleExpr ) ) ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upper_5_0= ruleExpr ) ) (otherlv_6= By ( (lv_step_7_0= ruleExpr ) ) )? )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getSlangForRangeAccess().getIDTerminalRuleCall_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSlangForRangeAccess().getColonKeyword_1());
              		
            }
            // InternalGumboParser.g:5071:3: ( (lv_e_2_0= ruleExpr ) )
            // InternalGumboParser.g:5072:4: (lv_e_2_0= ruleExpr )
            {
            // InternalGumboParser.g:5072:4: (lv_e_2_0= ruleExpr )
            // InternalGumboParser.g:5073:5: lv_e_2_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangForRangeAccess().getEExprParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_68);
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

            // InternalGumboParser.g:5090:3: ( (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upper_5_0= ruleExpr ) ) (otherlv_6= By ( (lv_step_7_0= ruleExpr ) ) )? )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==FullStopFullStopLessThanSign||LA102_0==FullStopFullStop) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalGumboParser.g:5091:4: (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign ) ( (lv_upper_5_0= ruleExpr ) ) (otherlv_6= By ( (lv_step_7_0= ruleExpr ) ) )?
                    {
                    // InternalGumboParser.g:5091:4: (otherlv_3= FullStopFullStop | otherlv_4= FullStopFullStopLessThanSign )
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==FullStopFullStop) ) {
                        alt100=1;
                    }
                    else if ( (LA100_0==FullStopFullStopLessThanSign) ) {
                        alt100=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 100, 0, input);

                        throw nvae;
                    }
                    switch (alt100) {
                        case 1 :
                            // InternalGumboParser.g:5092:5: otherlv_3= FullStopFullStop
                            {
                            otherlv_3=(Token)match(input,FullStopFullStop,FollowSets000.FOLLOW_17); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_3, grammarAccess.getSlangForRangeAccess().getFullStopFullStopKeyword_3_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalGumboParser.g:5097:5: otherlv_4= FullStopFullStopLessThanSign
                            {
                            otherlv_4=(Token)match(input,FullStopFullStopLessThanSign,FollowSets000.FOLLOW_17); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getSlangForRangeAccess().getFullStopFullStopLessThanSignKeyword_3_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalGumboParser.g:5102:4: ( (lv_upper_5_0= ruleExpr ) )
                    // InternalGumboParser.g:5103:5: (lv_upper_5_0= ruleExpr )
                    {
                    // InternalGumboParser.g:5103:5: (lv_upper_5_0= ruleExpr )
                    // InternalGumboParser.g:5104:6: lv_upper_5_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangForRangeAccess().getUpperExprParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_81);
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

                    // InternalGumboParser.g:5121:4: (otherlv_6= By ( (lv_step_7_0= ruleExpr ) ) )?
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==By) ) {
                        alt101=1;
                    }
                    switch (alt101) {
                        case 1 :
                            // InternalGumboParser.g:5122:5: otherlv_6= By ( (lv_step_7_0= ruleExpr ) )
                            {
                            otherlv_6=(Token)match(input,By,FollowSets000.FOLLOW_17); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_6, grammarAccess.getSlangForRangeAccess().getByKeyword_3_2_0());
                              				
                            }
                            // InternalGumboParser.g:5126:5: ( (lv_step_7_0= ruleExpr ) )
                            // InternalGumboParser.g:5127:6: (lv_step_7_0= ruleExpr )
                            {
                            // InternalGumboParser.g:5127:6: (lv_step_7_0= ruleExpr )
                            // InternalGumboParser.g:5128:7: lv_step_7_0= ruleExpr
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
    // InternalGumboParser.g:5151:1: entryRuleSlangRet returns [EObject current=null] : iv_ruleSlangRet= ruleSlangRet EOF ;
    public final EObject entryRuleSlangRet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangRet = null;


        try {
            // InternalGumboParser.g:5151:49: (iv_ruleSlangRet= ruleSlangRet EOF )
            // InternalGumboParser.g:5152:2: iv_ruleSlangRet= ruleSlangRet EOF
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
    // InternalGumboParser.g:5158:1: ruleSlangRet returns [EObject current=null] : ( () otherlv_1= Return ( (lv_e_2_0= ruleExpr ) )? ) ;
    public final EObject ruleSlangRet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_e_2_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:5164:2: ( ( () otherlv_1= Return ( (lv_e_2_0= ruleExpr ) )? ) )
            // InternalGumboParser.g:5165:2: ( () otherlv_1= Return ( (lv_e_2_0= ruleExpr ) )? )
            {
            // InternalGumboParser.g:5165:2: ( () otherlv_1= Return ( (lv_e_2_0= ruleExpr ) )? )
            // InternalGumboParser.g:5166:3: () otherlv_1= Return ( (lv_e_2_0= ruleExpr ) )?
            {
            // InternalGumboParser.g:5166:3: ()
            // InternalGumboParser.g:5167:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSlangRetAccess().getSlangRetAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Return,FollowSets000.FOLLOW_66); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSlangRetAccess().getReturnKeyword_1());
              		
            }
            // InternalGumboParser.g:5177:3: ( (lv_e_2_0= ruleExpr ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==Some||LA103_0==All||LA103_0==Enum||LA103_0==For||LA103_0==LeftParenthesis||(LA103_0>=Asterisk && LA103_0<=PlusSign)||LA103_0==HyphenMinus||(LA103_0>=F && LA103_0<=T)||LA103_0==LeftCurlyBracket||(LA103_0>=ForAll && LA103_0<=ThereExists)||(LA103_0>=RULE_SLANG_STRING && LA103_0<=RULE_MSTRING)||LA103_0==RULE_MSP||(LA103_0>=RULE_SLI && LA103_0<=RULE_MSPB)||LA103_0==RULE_OP||(LA103_0>=RULE_HEX && LA103_0<=RULE_REAL_IDF)||LA103_0==RULE_ID) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalGumboParser.g:5178:4: (lv_e_2_0= ruleExpr )
                    {
                    // InternalGumboParser.g:5178:4: (lv_e_2_0= ruleExpr )
                    // InternalGumboParser.g:5179:5: lv_e_2_0= ruleExpr
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
    // InternalGumboParser.g:5200:1: entryRuleSlangCallSuffix returns [EObject current=null] : iv_ruleSlangCallSuffix= ruleSlangCallSuffix EOF ;
    public final EObject entryRuleSlangCallSuffix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangCallSuffix = null;


        try {
            // InternalGumboParser.g:5200:56: (iv_ruleSlangCallSuffix= ruleSlangCallSuffix EOF )
            // InternalGumboParser.g:5201:2: iv_ruleSlangCallSuffix= ruleSlangCallSuffix EOF
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
    // InternalGumboParser.g:5207:1: ruleSlangCallSuffix returns [EObject current=null] : ( ( () ( (lv_ta_1_0= ruleSlangTypeArgs ) ) ( (lv_ca_2_0= ruleSlangCallArgs ) )? ) | ( (lv_ca_3_0= ruleSlangCallArgs ) ) ) ;
    public final EObject ruleSlangCallSuffix() throws RecognitionException {
        EObject current = null;

        EObject lv_ta_1_0 = null;

        EObject lv_ca_2_0 = null;

        EObject lv_ca_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:5213:2: ( ( ( () ( (lv_ta_1_0= ruleSlangTypeArgs ) ) ( (lv_ca_2_0= ruleSlangCallArgs ) )? ) | ( (lv_ca_3_0= ruleSlangCallArgs ) ) ) )
            // InternalGumboParser.g:5214:2: ( ( () ( (lv_ta_1_0= ruleSlangTypeArgs ) ) ( (lv_ca_2_0= ruleSlangCallArgs ) )? ) | ( (lv_ca_3_0= ruleSlangCallArgs ) ) )
            {
            // InternalGumboParser.g:5214:2: ( ( () ( (lv_ta_1_0= ruleSlangTypeArgs ) ) ( (lv_ca_2_0= ruleSlangCallArgs ) )? ) | ( (lv_ca_3_0= ruleSlangCallArgs ) ) )
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==LeftSquareBracket) ) {
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
                    // InternalGumboParser.g:5215:3: ( () ( (lv_ta_1_0= ruleSlangTypeArgs ) ) ( (lv_ca_2_0= ruleSlangCallArgs ) )? )
                    {
                    // InternalGumboParser.g:5215:3: ( () ( (lv_ta_1_0= ruleSlangTypeArgs ) ) ( (lv_ca_2_0= ruleSlangCallArgs ) )? )
                    // InternalGumboParser.g:5216:4: () ( (lv_ta_1_0= ruleSlangTypeArgs ) ) ( (lv_ca_2_0= ruleSlangCallArgs ) )?
                    {
                    // InternalGumboParser.g:5216:4: ()
                    // InternalGumboParser.g:5217:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangCallSuffixAccess().getSlangCallSuffixAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:5223:4: ( (lv_ta_1_0= ruleSlangTypeArgs ) )
                    // InternalGumboParser.g:5224:5: (lv_ta_1_0= ruleSlangTypeArgs )
                    {
                    // InternalGumboParser.g:5224:5: (lv_ta_1_0= ruleSlangTypeArgs )
                    // InternalGumboParser.g:5225:6: lv_ta_1_0= ruleSlangTypeArgs
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangCallSuffixAccess().getTaSlangTypeArgsParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_76);
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

                    // InternalGumboParser.g:5242:4: ( (lv_ca_2_0= ruleSlangCallArgs ) )?
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==LeftParenthesis) ) {
                        alt104=1;
                    }
                    switch (alt104) {
                        case 1 :
                            // InternalGumboParser.g:5243:5: (lv_ca_2_0= ruleSlangCallArgs )
                            {
                            // InternalGumboParser.g:5243:5: (lv_ca_2_0= ruleSlangCallArgs )
                            // InternalGumboParser.g:5244:6: lv_ca_2_0= ruleSlangCallArgs
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
                    // InternalGumboParser.g:5263:3: ( (lv_ca_3_0= ruleSlangCallArgs ) )
                    {
                    // InternalGumboParser.g:5263:3: ( (lv_ca_3_0= ruleSlangCallArgs ) )
                    // InternalGumboParser.g:5264:4: (lv_ca_3_0= ruleSlangCallArgs )
                    {
                    // InternalGumboParser.g:5264:4: (lv_ca_3_0= ruleSlangCallArgs )
                    // InternalGumboParser.g:5265:5: lv_ca_3_0= ruleSlangCallArgs
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
    // InternalGumboParser.g:5286:1: entryRuleSlangCallArgs returns [EObject current=null] : iv_ruleSlangCallArgs= ruleSlangCallArgs EOF ;
    public final EObject entryRuleSlangCallArgs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangCallArgs = null;


        try {
            // InternalGumboParser.g:5286:54: (iv_ruleSlangCallArgs= ruleSlangCallArgs EOF )
            // InternalGumboParser.g:5287:2: iv_ruleSlangCallArgs= ruleSlangCallArgs EOF
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
    // InternalGumboParser.g:5293:1: ruleSlangCallArgs returns [EObject current=null] : ( () otherlv_1= LeftParenthesis ( ( (lv_arg_2_0= ruleSlangIDExp ) ) (otherlv_3= Comma ( (lv_arg_4_0= ruleSlangIDExp ) ) )* )? otherlv_5= RightParenthesis ) ;
    public final EObject ruleSlangCallArgs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arg_2_0 = null;

        EObject lv_arg_4_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:5299:2: ( ( () otherlv_1= LeftParenthesis ( ( (lv_arg_2_0= ruleSlangIDExp ) ) (otherlv_3= Comma ( (lv_arg_4_0= ruleSlangIDExp ) ) )* )? otherlv_5= RightParenthesis ) )
            // InternalGumboParser.g:5300:2: ( () otherlv_1= LeftParenthesis ( ( (lv_arg_2_0= ruleSlangIDExp ) ) (otherlv_3= Comma ( (lv_arg_4_0= ruleSlangIDExp ) ) )* )? otherlv_5= RightParenthesis )
            {
            // InternalGumboParser.g:5300:2: ( () otherlv_1= LeftParenthesis ( ( (lv_arg_2_0= ruleSlangIDExp ) ) (otherlv_3= Comma ( (lv_arg_4_0= ruleSlangIDExp ) ) )* )? otherlv_5= RightParenthesis )
            // InternalGumboParser.g:5301:3: () otherlv_1= LeftParenthesis ( ( (lv_arg_2_0= ruleSlangIDExp ) ) (otherlv_3= Comma ( (lv_arg_4_0= ruleSlangIDExp ) ) )* )? otherlv_5= RightParenthesis
            {
            // InternalGumboParser.g:5301:3: ()
            // InternalGumboParser.g:5302:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSlangCallArgsAccess().getSlangCallArgsAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_82); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSlangCallArgsAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGumboParser.g:5312:3: ( ( (lv_arg_2_0= ruleSlangIDExp ) ) (otherlv_3= Comma ( (lv_arg_4_0= ruleSlangIDExp ) ) )* )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==Some||LA107_0==All||LA107_0==Enum||LA107_0==For||LA107_0==LeftParenthesis||(LA107_0>=Asterisk && LA107_0<=PlusSign)||LA107_0==HyphenMinus||(LA107_0>=F && LA107_0<=T)||LA107_0==LeftCurlyBracket||(LA107_0>=ForAll && LA107_0<=ThereExists)||(LA107_0>=RULE_SLANG_STRING && LA107_0<=RULE_MSTRING)||LA107_0==RULE_MSP||(LA107_0>=RULE_SLI && LA107_0<=RULE_MSPB)||LA107_0==RULE_OP||(LA107_0>=RULE_HEX && LA107_0<=RULE_REAL_IDF)||LA107_0==RULE_ID) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // InternalGumboParser.g:5313:4: ( (lv_arg_2_0= ruleSlangIDExp ) ) (otherlv_3= Comma ( (lv_arg_4_0= ruleSlangIDExp ) ) )*
                    {
                    // InternalGumboParser.g:5313:4: ( (lv_arg_2_0= ruleSlangIDExp ) )
                    // InternalGumboParser.g:5314:5: (lv_arg_2_0= ruleSlangIDExp )
                    {
                    // InternalGumboParser.g:5314:5: (lv_arg_2_0= ruleSlangIDExp )
                    // InternalGumboParser.g:5315:6: lv_arg_2_0= ruleSlangIDExp
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSlangCallArgsAccess().getArgSlangIDExpParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_34);
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

                    // InternalGumboParser.g:5332:4: (otherlv_3= Comma ( (lv_arg_4_0= ruleSlangIDExp ) ) )*
                    loop106:
                    do {
                        int alt106=2;
                        int LA106_0 = input.LA(1);

                        if ( (LA106_0==Comma) ) {
                            alt106=1;
                        }


                        switch (alt106) {
                    	case 1 :
                    	    // InternalGumboParser.g:5333:5: otherlv_3= Comma ( (lv_arg_4_0= ruleSlangIDExp ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getSlangCallArgsAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:5337:5: ( (lv_arg_4_0= ruleSlangIDExp ) )
                    	    // InternalGumboParser.g:5338:6: (lv_arg_4_0= ruleSlangIDExp )
                    	    {
                    	    // InternalGumboParser.g:5338:6: (lv_arg_4_0= ruleSlangIDExp )
                    	    // InternalGumboParser.g:5339:7: lv_arg_4_0= ruleSlangIDExp
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSlangCallArgsAccess().getArgSlangIDExpParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_34);
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
                    	    break loop106;
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
    // InternalGumboParser.g:5366:1: entryRuleSlangIDExp returns [EObject current=null] : iv_ruleSlangIDExp= ruleSlangIDExp EOF ;
    public final EObject entryRuleSlangIDExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangIDExp = null;


        try {
            // InternalGumboParser.g:5366:51: (iv_ruleSlangIDExp= ruleSlangIDExp EOF )
            // InternalGumboParser.g:5367:2: iv_ruleSlangIDExp= ruleSlangIDExp EOF
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
    // InternalGumboParser.g:5373:1: ruleSlangIDExp returns [EObject current=null] : ( ( (lv_e_0_0= ruleExpr ) ) (otherlv_1= ColonEqualsSign ( (lv_e_2_0= ruleExpr ) ) )? ) ;
    public final EObject ruleSlangIDExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_e_0_0 = null;

        EObject lv_e_2_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:5379:2: ( ( ( (lv_e_0_0= ruleExpr ) ) (otherlv_1= ColonEqualsSign ( (lv_e_2_0= ruleExpr ) ) )? ) )
            // InternalGumboParser.g:5380:2: ( ( (lv_e_0_0= ruleExpr ) ) (otherlv_1= ColonEqualsSign ( (lv_e_2_0= ruleExpr ) ) )? )
            {
            // InternalGumboParser.g:5380:2: ( ( (lv_e_0_0= ruleExpr ) ) (otherlv_1= ColonEqualsSign ( (lv_e_2_0= ruleExpr ) ) )? )
            // InternalGumboParser.g:5381:3: ( (lv_e_0_0= ruleExpr ) ) (otherlv_1= ColonEqualsSign ( (lv_e_2_0= ruleExpr ) ) )?
            {
            // InternalGumboParser.g:5381:3: ( (lv_e_0_0= ruleExpr ) )
            // InternalGumboParser.g:5382:4: (lv_e_0_0= ruleExpr )
            {
            // InternalGumboParser.g:5382:4: (lv_e_0_0= ruleExpr )
            // InternalGumboParser.g:5383:5: lv_e_0_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangIDExpAccess().getEExprParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_83);
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

            // InternalGumboParser.g:5400:3: (otherlv_1= ColonEqualsSign ( (lv_e_2_0= ruleExpr ) ) )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==ColonEqualsSign) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalGumboParser.g:5401:4: otherlv_1= ColonEqualsSign ( (lv_e_2_0= ruleExpr ) )
                    {
                    otherlv_1=(Token)match(input,ColonEqualsSign,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getSlangIDExpAccess().getColonEqualsSignKeyword_1_0());
                      			
                    }
                    // InternalGumboParser.g:5405:4: ( (lv_e_2_0= ruleExpr ) )
                    // InternalGumboParser.g:5406:5: (lv_e_2_0= ruleExpr )
                    {
                    // InternalGumboParser.g:5406:5: (lv_e_2_0= ruleExpr )
                    // InternalGumboParser.g:5407:6: lv_e_2_0= ruleExpr
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
    // InternalGumboParser.g:5429:1: entryRuleSlangType returns [EObject current=null] : iv_ruleSlangType= ruleSlangType EOF ;
    public final EObject entryRuleSlangType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangType = null;


        try {
            // InternalGumboParser.g:5429:50: (iv_ruleSlangType= ruleSlangType EOF )
            // InternalGumboParser.g:5430:2: iv_ruleSlangType= ruleSlangType EOF
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
    // InternalGumboParser.g:5436:1: ruleSlangType returns [EObject current=null] : this_SlangBaseType_0= ruleSlangBaseType ;
    public final EObject ruleSlangType() throws RecognitionException {
        EObject current = null;

        EObject this_SlangBaseType_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:5442:2: (this_SlangBaseType_0= ruleSlangBaseType )
            // InternalGumboParser.g:5443:2: this_SlangBaseType_0= ruleSlangBaseType
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
    // InternalGumboParser.g:5454:1: entryRuleSlangBaseType returns [EObject current=null] : iv_ruleSlangBaseType= ruleSlangBaseType EOF ;
    public final EObject entryRuleSlangBaseType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangBaseType = null;


        try {
            // InternalGumboParser.g:5454:54: (iv_ruleSlangBaseType= ruleSlangBaseType EOF )
            // InternalGumboParser.g:5455:2: iv_ruleSlangBaseType= ruleSlangBaseType EOF
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
    // InternalGumboParser.g:5461:1: ruleSlangBaseType returns [EObject current=null] : ( ( ruleQCREF ) ) ;
    public final EObject ruleSlangBaseType() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalGumboParser.g:5467:2: ( ( ( ruleQCREF ) ) )
            // InternalGumboParser.g:5468:2: ( ( ruleQCREF ) )
            {
            // InternalGumboParser.g:5468:2: ( ( ruleQCREF ) )
            // InternalGumboParser.g:5469:3: ( ruleQCREF )
            {
            // InternalGumboParser.g:5469:3: ( ruleQCREF )
            // InternalGumboParser.g:5470:4: ruleQCREF
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
    // InternalGumboParser.g:5487:1: entryRuleSlangTypeArgs returns [EObject current=null] : iv_ruleSlangTypeArgs= ruleSlangTypeArgs EOF ;
    public final EObject entryRuleSlangTypeArgs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangTypeArgs = null;


        try {
            // InternalGumboParser.g:5487:54: (iv_ruleSlangTypeArgs= ruleSlangTypeArgs EOF )
            // InternalGumboParser.g:5488:2: iv_ruleSlangTypeArgs= ruleSlangTypeArgs EOF
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
    // InternalGumboParser.g:5494:1: ruleSlangTypeArgs returns [EObject current=null] : (otherlv_0= LeftSquareBracket ( (lv_types_1_0= ruleSlangType ) ) (otherlv_2= Comma ( (lv_types_3_0= ruleSlangType ) ) )* otherlv_4= RightSquareBracket ) ;
    public final EObject ruleSlangTypeArgs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_types_1_0 = null;

        EObject lv_types_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:5500:2: ( (otherlv_0= LeftSquareBracket ( (lv_types_1_0= ruleSlangType ) ) (otherlv_2= Comma ( (lv_types_3_0= ruleSlangType ) ) )* otherlv_4= RightSquareBracket ) )
            // InternalGumboParser.g:5501:2: (otherlv_0= LeftSquareBracket ( (lv_types_1_0= ruleSlangType ) ) (otherlv_2= Comma ( (lv_types_3_0= ruleSlangType ) ) )* otherlv_4= RightSquareBracket )
            {
            // InternalGumboParser.g:5501:2: (otherlv_0= LeftSquareBracket ( (lv_types_1_0= ruleSlangType ) ) (otherlv_2= Comma ( (lv_types_3_0= ruleSlangType ) ) )* otherlv_4= RightSquareBracket )
            // InternalGumboParser.g:5502:3: otherlv_0= LeftSquareBracket ( (lv_types_1_0= ruleSlangType ) ) (otherlv_2= Comma ( (lv_types_3_0= ruleSlangType ) ) )* otherlv_4= RightSquareBracket
            {
            otherlv_0=(Token)match(input,LeftSquareBracket,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangTypeArgsAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalGumboParser.g:5506:3: ( (lv_types_1_0= ruleSlangType ) )
            // InternalGumboParser.g:5507:4: (lv_types_1_0= ruleSlangType )
            {
            // InternalGumboParser.g:5507:4: (lv_types_1_0= ruleSlangType )
            // InternalGumboParser.g:5508:5: lv_types_1_0= ruleSlangType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangTypeArgsAccess().getTypesSlangTypeParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_38);
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

            // InternalGumboParser.g:5525:3: (otherlv_2= Comma ( (lv_types_3_0= ruleSlangType ) ) )*
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==Comma) ) {
                    alt109=1;
                }


                switch (alt109) {
            	case 1 :
            	    // InternalGumboParser.g:5526:4: otherlv_2= Comma ( (lv_types_3_0= ruleSlangType ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FollowSets000.FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSlangTypeArgsAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalGumboParser.g:5530:4: ( (lv_types_3_0= ruleSlangType ) )
            	    // InternalGumboParser.g:5531:5: (lv_types_3_0= ruleSlangType )
            	    {
            	    // InternalGumboParser.g:5531:5: (lv_types_3_0= ruleSlangType )
            	    // InternalGumboParser.g:5532:6: lv_types_3_0= ruleSlangType
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSlangTypeArgsAccess().getTypesSlangTypeParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_38);
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
            	    break loop109;
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
    // InternalGumboParser.g:5558:1: entryRuleSlangLit returns [EObject current=null] : iv_ruleSlangLit= ruleSlangLit EOF ;
    public final EObject entryRuleSlangLit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangLit = null;


        try {
            // InternalGumboParser.g:5558:49: (iv_ruleSlangLit= ruleSlangLit EOF )
            // InternalGumboParser.g:5559:2: iv_ruleSlangLit= ruleSlangLit EOF
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
    // InternalGumboParser.g:5565:1: ruleSlangLit returns [EObject current=null] : ( ( () ( ( (lv_value_1_1= T | lv_value_1_2= F ) ) ) ) | ( () ( (lv_value_3_0= RULE_INTEGER_LIT ) ) ) | ( () ( (lv_value_5_0= RULE_INT_IDF ) ) ) | ( () ( (lv_value_7_0= RULE_HEX ) ) ) | ( () ( (lv_value_9_0= RULE_BIN ) ) ) | ( () ( (lv_value_11_0= RULE_REAL_LIT ) ) ) | ( () ( (lv_value_13_0= RULE_SLANG_STRING ) ) ) | ( () ( (lv_value_15_0= RULE_REAL_IDF ) ) ) | ( () ( (lv_value_17_0= RULE_MSTRING ) ) ) ) ;
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
            // InternalGumboParser.g:5571:2: ( ( ( () ( ( (lv_value_1_1= T | lv_value_1_2= F ) ) ) ) | ( () ( (lv_value_3_0= RULE_INTEGER_LIT ) ) ) | ( () ( (lv_value_5_0= RULE_INT_IDF ) ) ) | ( () ( (lv_value_7_0= RULE_HEX ) ) ) | ( () ( (lv_value_9_0= RULE_BIN ) ) ) | ( () ( (lv_value_11_0= RULE_REAL_LIT ) ) ) | ( () ( (lv_value_13_0= RULE_SLANG_STRING ) ) ) | ( () ( (lv_value_15_0= RULE_REAL_IDF ) ) ) | ( () ( (lv_value_17_0= RULE_MSTRING ) ) ) ) )
            // InternalGumboParser.g:5572:2: ( ( () ( ( (lv_value_1_1= T | lv_value_1_2= F ) ) ) ) | ( () ( (lv_value_3_0= RULE_INTEGER_LIT ) ) ) | ( () ( (lv_value_5_0= RULE_INT_IDF ) ) ) | ( () ( (lv_value_7_0= RULE_HEX ) ) ) | ( () ( (lv_value_9_0= RULE_BIN ) ) ) | ( () ( (lv_value_11_0= RULE_REAL_LIT ) ) ) | ( () ( (lv_value_13_0= RULE_SLANG_STRING ) ) ) | ( () ( (lv_value_15_0= RULE_REAL_IDF ) ) ) | ( () ( (lv_value_17_0= RULE_MSTRING ) ) ) )
            {
            // InternalGumboParser.g:5572:2: ( ( () ( ( (lv_value_1_1= T | lv_value_1_2= F ) ) ) ) | ( () ( (lv_value_3_0= RULE_INTEGER_LIT ) ) ) | ( () ( (lv_value_5_0= RULE_INT_IDF ) ) ) | ( () ( (lv_value_7_0= RULE_HEX ) ) ) | ( () ( (lv_value_9_0= RULE_BIN ) ) ) | ( () ( (lv_value_11_0= RULE_REAL_LIT ) ) ) | ( () ( (lv_value_13_0= RULE_SLANG_STRING ) ) ) | ( () ( (lv_value_15_0= RULE_REAL_IDF ) ) ) | ( () ( (lv_value_17_0= RULE_MSTRING ) ) ) )
            int alt111=9;
            switch ( input.LA(1) ) {
            case F:
            case T:
                {
                alt111=1;
                }
                break;
            case RULE_INTEGER_LIT:
                {
                alt111=2;
                }
                break;
            case RULE_INT_IDF:
                {
                alt111=3;
                }
                break;
            case RULE_HEX:
                {
                alt111=4;
                }
                break;
            case RULE_BIN:
                {
                alt111=5;
                }
                break;
            case RULE_REAL_LIT:
                {
                alt111=6;
                }
                break;
            case RULE_SLANG_STRING:
                {
                alt111=7;
                }
                break;
            case RULE_REAL_IDF:
                {
                alt111=8;
                }
                break;
            case RULE_MSTRING:
                {
                alt111=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }

            switch (alt111) {
                case 1 :
                    // InternalGumboParser.g:5573:3: ( () ( ( (lv_value_1_1= T | lv_value_1_2= F ) ) ) )
                    {
                    // InternalGumboParser.g:5573:3: ( () ( ( (lv_value_1_1= T | lv_value_1_2= F ) ) ) )
                    // InternalGumboParser.g:5574:4: () ( ( (lv_value_1_1= T | lv_value_1_2= F ) ) )
                    {
                    // InternalGumboParser.g:5574:4: ()
                    // InternalGumboParser.g:5575:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangLitAccess().getBooleanLitAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:5581:4: ( ( (lv_value_1_1= T | lv_value_1_2= F ) ) )
                    // InternalGumboParser.g:5582:5: ( (lv_value_1_1= T | lv_value_1_2= F ) )
                    {
                    // InternalGumboParser.g:5582:5: ( (lv_value_1_1= T | lv_value_1_2= F ) )
                    // InternalGumboParser.g:5583:6: (lv_value_1_1= T | lv_value_1_2= F )
                    {
                    // InternalGumboParser.g:5583:6: (lv_value_1_1= T | lv_value_1_2= F )
                    int alt110=2;
                    int LA110_0 = input.LA(1);

                    if ( (LA110_0==T) ) {
                        alt110=1;
                    }
                    else if ( (LA110_0==F) ) {
                        alt110=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 110, 0, input);

                        throw nvae;
                    }
                    switch (alt110) {
                        case 1 :
                            // InternalGumboParser.g:5584:7: lv_value_1_1= T
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
                            // InternalGumboParser.g:5595:7: lv_value_1_2= F
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
                    // InternalGumboParser.g:5610:3: ( () ( (lv_value_3_0= RULE_INTEGER_LIT ) ) )
                    {
                    // InternalGumboParser.g:5610:3: ( () ( (lv_value_3_0= RULE_INTEGER_LIT ) ) )
                    // InternalGumboParser.g:5611:4: () ( (lv_value_3_0= RULE_INTEGER_LIT ) )
                    {
                    // InternalGumboParser.g:5611:4: ()
                    // InternalGumboParser.g:5612:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangLitAccess().getIntegerLitAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:5618:4: ( (lv_value_3_0= RULE_INTEGER_LIT ) )
                    // InternalGumboParser.g:5619:5: (lv_value_3_0= RULE_INTEGER_LIT )
                    {
                    // InternalGumboParser.g:5619:5: (lv_value_3_0= RULE_INTEGER_LIT )
                    // InternalGumboParser.g:5620:6: lv_value_3_0= RULE_INTEGER_LIT
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
                    // InternalGumboParser.g:5638:3: ( () ( (lv_value_5_0= RULE_INT_IDF ) ) )
                    {
                    // InternalGumboParser.g:5638:3: ( () ( (lv_value_5_0= RULE_INT_IDF ) ) )
                    // InternalGumboParser.g:5639:4: () ( (lv_value_5_0= RULE_INT_IDF ) )
                    {
                    // InternalGumboParser.g:5639:4: ()
                    // InternalGumboParser.g:5640:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangLitAccess().getIntIdfLitAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:5646:4: ( (lv_value_5_0= RULE_INT_IDF ) )
                    // InternalGumboParser.g:5647:5: (lv_value_5_0= RULE_INT_IDF )
                    {
                    // InternalGumboParser.g:5647:5: (lv_value_5_0= RULE_INT_IDF )
                    // InternalGumboParser.g:5648:6: lv_value_5_0= RULE_INT_IDF
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
                    // InternalGumboParser.g:5666:3: ( () ( (lv_value_7_0= RULE_HEX ) ) )
                    {
                    // InternalGumboParser.g:5666:3: ( () ( (lv_value_7_0= RULE_HEX ) ) )
                    // InternalGumboParser.g:5667:4: () ( (lv_value_7_0= RULE_HEX ) )
                    {
                    // InternalGumboParser.g:5667:4: ()
                    // InternalGumboParser.g:5668:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangLitAccess().getHexLitAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:5674:4: ( (lv_value_7_0= RULE_HEX ) )
                    // InternalGumboParser.g:5675:5: (lv_value_7_0= RULE_HEX )
                    {
                    // InternalGumboParser.g:5675:5: (lv_value_7_0= RULE_HEX )
                    // InternalGumboParser.g:5676:6: lv_value_7_0= RULE_HEX
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
                    // InternalGumboParser.g:5694:3: ( () ( (lv_value_9_0= RULE_BIN ) ) )
                    {
                    // InternalGumboParser.g:5694:3: ( () ( (lv_value_9_0= RULE_BIN ) ) )
                    // InternalGumboParser.g:5695:4: () ( (lv_value_9_0= RULE_BIN ) )
                    {
                    // InternalGumboParser.g:5695:4: ()
                    // InternalGumboParser.g:5696:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangLitAccess().getBinLitAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:5702:4: ( (lv_value_9_0= RULE_BIN ) )
                    // InternalGumboParser.g:5703:5: (lv_value_9_0= RULE_BIN )
                    {
                    // InternalGumboParser.g:5703:5: (lv_value_9_0= RULE_BIN )
                    // InternalGumboParser.g:5704:6: lv_value_9_0= RULE_BIN
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
                    // InternalGumboParser.g:5722:3: ( () ( (lv_value_11_0= RULE_REAL_LIT ) ) )
                    {
                    // InternalGumboParser.g:5722:3: ( () ( (lv_value_11_0= RULE_REAL_LIT ) ) )
                    // InternalGumboParser.g:5723:4: () ( (lv_value_11_0= RULE_REAL_LIT ) )
                    {
                    // InternalGumboParser.g:5723:4: ()
                    // InternalGumboParser.g:5724:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangLitAccess().getRealLitAction_5_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:5730:4: ( (lv_value_11_0= RULE_REAL_LIT ) )
                    // InternalGumboParser.g:5731:5: (lv_value_11_0= RULE_REAL_LIT )
                    {
                    // InternalGumboParser.g:5731:5: (lv_value_11_0= RULE_REAL_LIT )
                    // InternalGumboParser.g:5732:6: lv_value_11_0= RULE_REAL_LIT
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
                    // InternalGumboParser.g:5750:3: ( () ( (lv_value_13_0= RULE_SLANG_STRING ) ) )
                    {
                    // InternalGumboParser.g:5750:3: ( () ( (lv_value_13_0= RULE_SLANG_STRING ) ) )
                    // InternalGumboParser.g:5751:4: () ( (lv_value_13_0= RULE_SLANG_STRING ) )
                    {
                    // InternalGumboParser.g:5751:4: ()
                    // InternalGumboParser.g:5752:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangLitAccess().getSlangStringLitAction_6_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:5758:4: ( (lv_value_13_0= RULE_SLANG_STRING ) )
                    // InternalGumboParser.g:5759:5: (lv_value_13_0= RULE_SLANG_STRING )
                    {
                    // InternalGumboParser.g:5759:5: (lv_value_13_0= RULE_SLANG_STRING )
                    // InternalGumboParser.g:5760:6: lv_value_13_0= RULE_SLANG_STRING
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
                    // InternalGumboParser.g:5778:3: ( () ( (lv_value_15_0= RULE_REAL_IDF ) ) )
                    {
                    // InternalGumboParser.g:5778:3: ( () ( (lv_value_15_0= RULE_REAL_IDF ) ) )
                    // InternalGumboParser.g:5779:4: () ( (lv_value_15_0= RULE_REAL_IDF ) )
                    {
                    // InternalGumboParser.g:5779:4: ()
                    // InternalGumboParser.g:5780:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangLitAccess().getRealIdfLitAction_7_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:5786:4: ( (lv_value_15_0= RULE_REAL_IDF ) )
                    // InternalGumboParser.g:5787:5: (lv_value_15_0= RULE_REAL_IDF )
                    {
                    // InternalGumboParser.g:5787:5: (lv_value_15_0= RULE_REAL_IDF )
                    // InternalGumboParser.g:5788:6: lv_value_15_0= RULE_REAL_IDF
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
                    // InternalGumboParser.g:5806:3: ( () ( (lv_value_17_0= RULE_MSTRING ) ) )
                    {
                    // InternalGumboParser.g:5806:3: ( () ( (lv_value_17_0= RULE_MSTRING ) ) )
                    // InternalGumboParser.g:5807:4: () ( (lv_value_17_0= RULE_MSTRING ) )
                    {
                    // InternalGumboParser.g:5807:4: ()
                    // InternalGumboParser.g:5808:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangLitAccess().getMStringLitAction_8_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:5814:4: ( (lv_value_17_0= RULE_MSTRING ) )
                    // InternalGumboParser.g:5815:5: (lv_value_17_0= RULE_MSTRING )
                    {
                    // InternalGumboParser.g:5815:5: (lv_value_17_0= RULE_MSTRING )
                    // InternalGumboParser.g:5816:6: lv_value_17_0= RULE_MSTRING
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
    // InternalGumboParser.g:5837:1: entryRuleSlangInterp returns [EObject current=null] : iv_ruleSlangInterp= ruleSlangInterp EOF ;
    public final EObject entryRuleSlangInterp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangInterp = null;


        try {
            // InternalGumboParser.g:5837:52: (iv_ruleSlangInterp= ruleSlangInterp EOF )
            // InternalGumboParser.g:5838:2: iv_ruleSlangInterp= ruleSlangInterp EOF
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
    // InternalGumboParser.g:5844:1: ruleSlangInterp returns [EObject current=null] : ( ( () ( (lv_msp_1_0= RULE_MSP ) ) ) | ( () ( (lv_sli_3_0= RULE_SLI ) ) ) | ( () ( (lv_mspb_5_0= RULE_MSPB ) ) ( (lv_minterp_6_0= ruleSlangMInterp ) ) ) ) ;
    public final EObject ruleSlangInterp() throws RecognitionException {
        EObject current = null;

        Token lv_msp_1_0=null;
        Token lv_sli_3_0=null;
        Token lv_mspb_5_0=null;
        EObject lv_minterp_6_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:5850:2: ( ( ( () ( (lv_msp_1_0= RULE_MSP ) ) ) | ( () ( (lv_sli_3_0= RULE_SLI ) ) ) | ( () ( (lv_mspb_5_0= RULE_MSPB ) ) ( (lv_minterp_6_0= ruleSlangMInterp ) ) ) ) )
            // InternalGumboParser.g:5851:2: ( ( () ( (lv_msp_1_0= RULE_MSP ) ) ) | ( () ( (lv_sli_3_0= RULE_SLI ) ) ) | ( () ( (lv_mspb_5_0= RULE_MSPB ) ) ( (lv_minterp_6_0= ruleSlangMInterp ) ) ) )
            {
            // InternalGumboParser.g:5851:2: ( ( () ( (lv_msp_1_0= RULE_MSP ) ) ) | ( () ( (lv_sli_3_0= RULE_SLI ) ) ) | ( () ( (lv_mspb_5_0= RULE_MSPB ) ) ( (lv_minterp_6_0= ruleSlangMInterp ) ) ) )
            int alt112=3;
            switch ( input.LA(1) ) {
            case RULE_MSP:
                {
                alt112=1;
                }
                break;
            case RULE_SLI:
                {
                alt112=2;
                }
                break;
            case RULE_MSPB:
                {
                alt112=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;
            }

            switch (alt112) {
                case 1 :
                    // InternalGumboParser.g:5852:3: ( () ( (lv_msp_1_0= RULE_MSP ) ) )
                    {
                    // InternalGumboParser.g:5852:3: ( () ( (lv_msp_1_0= RULE_MSP ) ) )
                    // InternalGumboParser.g:5853:4: () ( (lv_msp_1_0= RULE_MSP ) )
                    {
                    // InternalGumboParser.g:5853:4: ()
                    // InternalGumboParser.g:5854:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangInterpAccess().getSlangMspInterpAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:5860:4: ( (lv_msp_1_0= RULE_MSP ) )
                    // InternalGumboParser.g:5861:5: (lv_msp_1_0= RULE_MSP )
                    {
                    // InternalGumboParser.g:5861:5: (lv_msp_1_0= RULE_MSP )
                    // InternalGumboParser.g:5862:6: lv_msp_1_0= RULE_MSP
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
                    // InternalGumboParser.g:5880:3: ( () ( (lv_sli_3_0= RULE_SLI ) ) )
                    {
                    // InternalGumboParser.g:5880:3: ( () ( (lv_sli_3_0= RULE_SLI ) ) )
                    // InternalGumboParser.g:5881:4: () ( (lv_sli_3_0= RULE_SLI ) )
                    {
                    // InternalGumboParser.g:5881:4: ()
                    // InternalGumboParser.g:5882:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangInterpAccess().getSlangLiteralInterpAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:5888:4: ( (lv_sli_3_0= RULE_SLI ) )
                    // InternalGumboParser.g:5889:5: (lv_sli_3_0= RULE_SLI )
                    {
                    // InternalGumboParser.g:5889:5: (lv_sli_3_0= RULE_SLI )
                    // InternalGumboParser.g:5890:6: lv_sli_3_0= RULE_SLI
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
                    // InternalGumboParser.g:5908:3: ( () ( (lv_mspb_5_0= RULE_MSPB ) ) ( (lv_minterp_6_0= ruleSlangMInterp ) ) )
                    {
                    // InternalGumboParser.g:5908:3: ( () ( (lv_mspb_5_0= RULE_MSPB ) ) ( (lv_minterp_6_0= ruleSlangMInterp ) ) )
                    // InternalGumboParser.g:5909:4: () ( (lv_mspb_5_0= RULE_MSPB ) ) ( (lv_minterp_6_0= ruleSlangMInterp ) )
                    {
                    // InternalGumboParser.g:5909:4: ()
                    // InternalGumboParser.g:5910:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSlangInterpAccess().getSlangMspbInterpAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGumboParser.g:5916:4: ( (lv_mspb_5_0= RULE_MSPB ) )
                    // InternalGumboParser.g:5917:5: (lv_mspb_5_0= RULE_MSPB )
                    {
                    // InternalGumboParser.g:5917:5: (lv_mspb_5_0= RULE_MSPB )
                    // InternalGumboParser.g:5918:6: lv_mspb_5_0= RULE_MSPB
                    {
                    lv_mspb_5_0=(Token)match(input,RULE_MSPB,FollowSets000.FOLLOW_48); if (state.failed) return current;
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

                    // InternalGumboParser.g:5934:4: ( (lv_minterp_6_0= ruleSlangMInterp ) )
                    // InternalGumboParser.g:5935:5: (lv_minterp_6_0= ruleSlangMInterp )
                    {
                    // InternalGumboParser.g:5935:5: (lv_minterp_6_0= ruleSlangMInterp )
                    // InternalGumboParser.g:5936:6: lv_minterp_6_0= ruleSlangMInterp
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
    // InternalGumboParser.g:5958:1: entryRuleSlangMInterp returns [EObject current=null] : iv_ruleSlangMInterp= ruleSlangMInterp EOF ;
    public final EObject entryRuleSlangMInterp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlangMInterp = null;


        try {
            // InternalGumboParser.g:5958:53: (iv_ruleSlangMInterp= ruleSlangMInterp EOF )
            // InternalGumboParser.g:5959:2: iv_ruleSlangMInterp= ruleSlangMInterp EOF
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
    // InternalGumboParser.g:5965:1: ruleSlangMInterp returns [EObject current=null] : (otherlv_0= LeftCurlyBracket ( (lv_e_1_0= ruleExpr ) ) otherlv_2= RightCurlyBracket ( (this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) ) ) | this_MSPE_5= RULE_MSPE ) ) ;
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
            // InternalGumboParser.g:5971:2: ( (otherlv_0= LeftCurlyBracket ( (lv_e_1_0= ruleExpr ) ) otherlv_2= RightCurlyBracket ( (this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) ) ) | this_MSPE_5= RULE_MSPE ) ) )
            // InternalGumboParser.g:5972:2: (otherlv_0= LeftCurlyBracket ( (lv_e_1_0= ruleExpr ) ) otherlv_2= RightCurlyBracket ( (this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) ) ) | this_MSPE_5= RULE_MSPE ) )
            {
            // InternalGumboParser.g:5972:2: (otherlv_0= LeftCurlyBracket ( (lv_e_1_0= ruleExpr ) ) otherlv_2= RightCurlyBracket ( (this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) ) ) | this_MSPE_5= RULE_MSPE ) )
            // InternalGumboParser.g:5973:3: otherlv_0= LeftCurlyBracket ( (lv_e_1_0= ruleExpr ) ) otherlv_2= RightCurlyBracket ( (this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) ) ) | this_MSPE_5= RULE_MSPE )
            {
            otherlv_0=(Token)match(input,LeftCurlyBracket,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSlangMInterpAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalGumboParser.g:5977:3: ( (lv_e_1_0= ruleExpr ) )
            // InternalGumboParser.g:5978:4: (lv_e_1_0= ruleExpr )
            {
            // InternalGumboParser.g:5978:4: (lv_e_1_0= ruleExpr )
            // InternalGumboParser.g:5979:5: lv_e_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlangMInterpAccess().getEExprParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_70);
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

            otherlv_2=(Token)match(input,RightCurlyBracket,FollowSets000.FOLLOW_84); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSlangMInterpAccess().getRightCurlyBracketKeyword_2());
              		
            }
            // InternalGumboParser.g:6000:3: ( (this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) ) ) | this_MSPE_5= RULE_MSPE )
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==RULE_MSPM) ) {
                alt113=1;
            }
            else if ( (LA113_0==RULE_MSPE) ) {
                alt113=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }
            switch (alt113) {
                case 1 :
                    // InternalGumboParser.g:6001:4: (this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) ) )
                    {
                    // InternalGumboParser.g:6001:4: (this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) ) )
                    // InternalGumboParser.g:6002:5: this_MSPM_3= RULE_MSPM ( (lv_m_4_0= ruleSlangMInterp ) )
                    {
                    this_MSPM_3=(Token)match(input,RULE_MSPM,FollowSets000.FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_MSPM_3, grammarAccess.getSlangMInterpAccess().getMSPMTerminalRuleCall_3_0_0());
                      				
                    }
                    // InternalGumboParser.g:6006:5: ( (lv_m_4_0= ruleSlangMInterp ) )
                    // InternalGumboParser.g:6007:6: (lv_m_4_0= ruleSlangMInterp )
                    {
                    // InternalGumboParser.g:6007:6: (lv_m_4_0= ruleSlangMInterp )
                    // InternalGumboParser.g:6008:7: lv_m_4_0= ruleSlangMInterp
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
                    // InternalGumboParser.g:6027:4: this_MSPE_5= RULE_MSPE
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
    // InternalGumboParser.g:6036:1: entryRuleOperator returns [String current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final String entryRuleOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperator = null;


        try {
            // InternalGumboParser.g:6036:48: (iv_ruleOperator= ruleOperator EOF )
            // InternalGumboParser.g:6037:2: iv_ruleOperator= ruleOperator EOF
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
    // InternalGumboParser.g:6043:1: ruleOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_OP_0= RULE_OP | this_PlusMinus_1= rulePlusMinus | this_STAR_2= ruleSTAR ) ;
    public final AntlrDatatypeRuleToken ruleOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_OP_0=null;
        AntlrDatatypeRuleToken this_PlusMinus_1 = null;

        AntlrDatatypeRuleToken this_STAR_2 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:6049:2: ( (this_OP_0= RULE_OP | this_PlusMinus_1= rulePlusMinus | this_STAR_2= ruleSTAR ) )
            // InternalGumboParser.g:6050:2: (this_OP_0= RULE_OP | this_PlusMinus_1= rulePlusMinus | this_STAR_2= ruleSTAR )
            {
            // InternalGumboParser.g:6050:2: (this_OP_0= RULE_OP | this_PlusMinus_1= rulePlusMinus | this_STAR_2= ruleSTAR )
            int alt114=3;
            switch ( input.LA(1) ) {
            case RULE_OP:
                {
                alt114=1;
                }
                break;
            case PlusSign:
            case HyphenMinus:
                {
                alt114=2;
                }
                break;
            case Asterisk:
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
                    // InternalGumboParser.g:6051:3: this_OP_0= RULE_OP
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
                    // InternalGumboParser.g:6059:3: this_PlusMinus_1= rulePlusMinus
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
                    // InternalGumboParser.g:6070:3: this_STAR_2= ruleSTAR
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
    // InternalGumboParser.g:6084:1: entryRuleContainedPropertyAssociation returns [EObject current=null] : iv_ruleContainedPropertyAssociation= ruleContainedPropertyAssociation EOF ;
    public final EObject entryRuleContainedPropertyAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainedPropertyAssociation = null;


        try {
            // InternalGumboParser.g:6084:69: (iv_ruleContainedPropertyAssociation= ruleContainedPropertyAssociation EOF )
            // InternalGumboParser.g:6085:2: iv_ruleContainedPropertyAssociation= ruleContainedPropertyAssociation EOF
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
    // InternalGumboParser.g:6091:1: ruleContainedPropertyAssociation returns [EObject current=null] : ( ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon ) ;
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
            // InternalGumboParser.g:6097:2: ( ( ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon ) )
            // InternalGumboParser.g:6098:2: ( ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon )
            {
            // InternalGumboParser.g:6098:2: ( ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon )
            // InternalGumboParser.g:6099:3: ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon
            {
            // InternalGumboParser.g:6099:3: ( ( ruleQPREF ) )
            // InternalGumboParser.g:6100:4: ( ruleQPREF )
            {
            // InternalGumboParser.g:6100:4: ( ruleQPREF )
            // InternalGumboParser.g:6101:5: ruleQPREF
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getContainedPropertyAssociationRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getPropertyPropertyCrossReference_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_85);
            ruleQPREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGumboParser.g:6115:3: (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) )
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==EqualsSignGreaterThanSign) ) {
                alt115=1;
            }
            else if ( (LA115_0==PlusSignEqualsSignGreaterThanSign) ) {
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
                    // InternalGumboParser.g:6116:4: otherlv_1= EqualsSignGreaterThanSign
                    {
                    otherlv_1=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_86); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getContainedPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:6121:4: ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) )
                    {
                    // InternalGumboParser.g:6121:4: ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) )
                    // InternalGumboParser.g:6122:5: (lv_append_2_0= PlusSignEqualsSignGreaterThanSign )
                    {
                    // InternalGumboParser.g:6122:5: (lv_append_2_0= PlusSignEqualsSignGreaterThanSign )
                    // InternalGumboParser.g:6123:6: lv_append_2_0= PlusSignEqualsSignGreaterThanSign
                    {
                    lv_append_2_0=(Token)match(input,PlusSignEqualsSignGreaterThanSign,FollowSets000.FOLLOW_86); if (state.failed) return current;
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

            // InternalGumboParser.g:6136:3: ( (lv_constant_3_0= Constant ) )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==Constant) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // InternalGumboParser.g:6137:4: (lv_constant_3_0= Constant )
                    {
                    // InternalGumboParser.g:6137:4: (lv_constant_3_0= Constant )
                    // InternalGumboParser.g:6138:5: lv_constant_3_0= Constant
                    {
                    lv_constant_3_0=(Token)match(input,Constant,FollowSets000.FOLLOW_86); if (state.failed) return current;
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

            // InternalGumboParser.g:6150:3: ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* )
            // InternalGumboParser.g:6151:4: ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )*
            {
            // InternalGumboParser.g:6151:4: ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) )
            // InternalGumboParser.g:6152:5: (lv_ownedValue_4_0= ruleOptionalModalPropertyValue )
            {
            // InternalGumboParser.g:6152:5: (lv_ownedValue_4_0= ruleOptionalModalPropertyValue )
            // InternalGumboParser.g:6153:6: lv_ownedValue_4_0= ruleOptionalModalPropertyValue
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueOptionalModalPropertyValueParserRuleCall_3_0_0());
              					
            }
            pushFollow(FollowSets000.FOLLOW_87);
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

            // InternalGumboParser.g:6170:4: (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )*
            loop117:
            do {
                int alt117=2;
                int LA117_0 = input.LA(1);

                if ( (LA117_0==Comma) ) {
                    alt117=1;
                }


                switch (alt117) {
            	case 1 :
            	    // InternalGumboParser.g:6171:5: otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) )
            	    {
            	    otherlv_5=(Token)match(input,Comma,FollowSets000.FOLLOW_86); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_5, grammarAccess.getContainedPropertyAssociationAccess().getCommaKeyword_3_1_0());
            	      				
            	    }
            	    // InternalGumboParser.g:6175:5: ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) )
            	    // InternalGumboParser.g:6176:6: (lv_ownedValue_6_0= ruleOptionalModalPropertyValue )
            	    {
            	    // InternalGumboParser.g:6176:6: (lv_ownedValue_6_0= ruleOptionalModalPropertyValue )
            	    // InternalGumboParser.g:6177:7: lv_ownedValue_6_0= ruleOptionalModalPropertyValue
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueOptionalModalPropertyValueParserRuleCall_3_1_1_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_87);
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
            	    break loop117;
                }
            } while (true);


            }

            // InternalGumboParser.g:6196:3: ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==Applies) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // InternalGumboParser.g:6197:4: ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )*
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
                    // InternalGumboParser.g:6204:4: ( (lv_appliesTo_8_0= ruleContainmentPath ) )
                    // InternalGumboParser.g:6205:5: (lv_appliesTo_8_0= ruleContainmentPath )
                    {
                    // InternalGumboParser.g:6205:5: (lv_appliesTo_8_0= ruleContainmentPath )
                    // InternalGumboParser.g:6206:6: lv_appliesTo_8_0= ruleContainmentPath
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToContainmentPathParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_88);
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

                    // InternalGumboParser.g:6223:4: (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )*
                    loop118:
                    do {
                        int alt118=2;
                        int LA118_0 = input.LA(1);

                        if ( (LA118_0==Comma) ) {
                            alt118=1;
                        }


                        switch (alt118) {
                    	case 1 :
                    	    // InternalGumboParser.g:6224:5: otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) )
                    	    {
                    	    otherlv_9=(Token)match(input,Comma,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_9, grammarAccess.getContainedPropertyAssociationAccess().getCommaKeyword_4_2_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:6228:5: ( (lv_appliesTo_10_0= ruleContainmentPath ) )
                    	    // InternalGumboParser.g:6229:6: (lv_appliesTo_10_0= ruleContainmentPath )
                    	    {
                    	    // InternalGumboParser.g:6229:6: (lv_appliesTo_10_0= ruleContainmentPath )
                    	    // InternalGumboParser.g:6230:7: lv_appliesTo_10_0= ruleContainmentPath
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToContainmentPathParserRuleCall_4_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_88);
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
                    	    break loop118;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalGumboParser.g:6249:3: ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==In) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // InternalGumboParser.g:6250:4: ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getInBindingKeywordsParserRuleCall_5_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_71);
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
                    // InternalGumboParser.g:6261:4: ( ( ruleQCREF ) )
                    // InternalGumboParser.g:6262:5: ( ruleQCREF )
                    {
                    // InternalGumboParser.g:6262:5: ( ruleQCREF )
                    // InternalGumboParser.g:6263:6: ruleQCREF
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
    // InternalGumboParser.g:6290:1: entryRuleContainmentPath returns [EObject current=null] : iv_ruleContainmentPath= ruleContainmentPath EOF ;
    public final EObject entryRuleContainmentPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainmentPath = null;


        try {
            // InternalGumboParser.g:6290:56: (iv_ruleContainmentPath= ruleContainmentPath EOF )
            // InternalGumboParser.g:6291:2: iv_ruleContainmentPath= ruleContainmentPath EOF
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
    // InternalGumboParser.g:6297:1: ruleContainmentPath returns [EObject current=null] : ( (lv_path_0_0= ruleContainmentPathElement ) ) ;
    public final EObject ruleContainmentPath() throws RecognitionException {
        EObject current = null;

        EObject lv_path_0_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:6303:2: ( ( (lv_path_0_0= ruleContainmentPathElement ) ) )
            // InternalGumboParser.g:6304:2: ( (lv_path_0_0= ruleContainmentPathElement ) )
            {
            // InternalGumboParser.g:6304:2: ( (lv_path_0_0= ruleContainmentPathElement ) )
            // InternalGumboParser.g:6305:3: (lv_path_0_0= ruleContainmentPathElement )
            {
            // InternalGumboParser.g:6305:3: (lv_path_0_0= ruleContainmentPathElement )
            // InternalGumboParser.g:6306:4: lv_path_0_0= ruleContainmentPathElement
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
    // InternalGumboParser.g:6326:1: entryRuleOptionalModalPropertyValue returns [EObject current=null] : iv_ruleOptionalModalPropertyValue= ruleOptionalModalPropertyValue EOF ;
    public final EObject entryRuleOptionalModalPropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionalModalPropertyValue = null;


        try {
            // InternalGumboParser.g:6326:67: (iv_ruleOptionalModalPropertyValue= ruleOptionalModalPropertyValue EOF )
            // InternalGumboParser.g:6327:2: iv_ruleOptionalModalPropertyValue= ruleOptionalModalPropertyValue EOF
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
    // InternalGumboParser.g:6333:1: ruleOptionalModalPropertyValue returns [EObject current=null] : ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )? ) ;
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
            // InternalGumboParser.g:6339:2: ( ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )? ) )
            // InternalGumboParser.g:6340:2: ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )? )
            {
            // InternalGumboParser.g:6340:2: ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )? )
            // InternalGumboParser.g:6341:3: ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )?
            {
            // InternalGumboParser.g:6341:3: ( (lv_ownedValue_0_0= rulePropertyExpression ) )
            // InternalGumboParser.g:6342:4: (lv_ownedValue_0_0= rulePropertyExpression )
            {
            // InternalGumboParser.g:6342:4: (lv_ownedValue_0_0= rulePropertyExpression )
            // InternalGumboParser.g:6343:5: lv_ownedValue_0_0= rulePropertyExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOptionalModalPropertyValueAccess().getOwnedValuePropertyExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_89);
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

            // InternalGumboParser.g:6360:3: ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==In) ) {
                int LA122_1 = input.LA(2);

                if ( (LA122_1==Modes) ) {
                    alt122=1;
                }
            }
            switch (alt122) {
                case 1 :
                    // InternalGumboParser.g:6361:4: ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getOptionalModalPropertyValueAccess().getInModesKeywordsParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_71);
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
                    // InternalGumboParser.g:6372:4: ( (otherlv_3= RULE_ID ) )
                    // InternalGumboParser.g:6373:5: (otherlv_3= RULE_ID )
                    {
                    // InternalGumboParser.g:6373:5: (otherlv_3= RULE_ID )
                    // InternalGumboParser.g:6374:6: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getOptionalModalPropertyValueRule());
                      						}
                      					
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getOptionalModalPropertyValueAccess().getInModeModeCrossReference_1_2_0());
                      					
                    }

                    }


                    }

                    // InternalGumboParser.g:6385:4: (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )*
                    loop121:
                    do {
                        int alt121=2;
                        int LA121_0 = input.LA(1);

                        if ( (LA121_0==Comma) ) {
                            alt121=1;
                        }


                        switch (alt121) {
                    	case 1 :
                    	    // InternalGumboParser.g:6386:5: otherlv_4= Comma ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getOptionalModalPropertyValueAccess().getCommaKeyword_1_3_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:6390:5: ( (otherlv_5= RULE_ID ) )
                    	    // InternalGumboParser.g:6391:6: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalGumboParser.g:6391:6: (otherlv_5= RULE_ID )
                    	    // InternalGumboParser.g:6392:7: otherlv_5= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getOptionalModalPropertyValueRule());
                    	      							}
                    	      						
                    	    }
                    	    otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_34); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_5, grammarAccess.getOptionalModalPropertyValueAccess().getInModeModeCrossReference_1_3_1_0());
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop121;
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
    // InternalGumboParser.g:6413:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalGumboParser.g:6413:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalGumboParser.g:6414:2: iv_rulePropertyValue= rulePropertyValue EOF
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
    // InternalGumboParser.g:6420:1: rulePropertyValue returns [EObject current=null] : ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedValue_0_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:6426:2: ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) )
            // InternalGumboParser.g:6427:2: ( (lv_ownedValue_0_0= rulePropertyExpression ) )
            {
            // InternalGumboParser.g:6427:2: ( (lv_ownedValue_0_0= rulePropertyExpression ) )
            // InternalGumboParser.g:6428:3: (lv_ownedValue_0_0= rulePropertyExpression )
            {
            // InternalGumboParser.g:6428:3: (lv_ownedValue_0_0= rulePropertyExpression )
            // InternalGumboParser.g:6429:4: lv_ownedValue_0_0= rulePropertyExpression
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
    // InternalGumboParser.g:6449:1: entryRulePropertyExpression returns [EObject current=null] : iv_rulePropertyExpression= rulePropertyExpression EOF ;
    public final EObject entryRulePropertyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyExpression = null;


        try {
            // InternalGumboParser.g:6449:59: (iv_rulePropertyExpression= rulePropertyExpression EOF )
            // InternalGumboParser.g:6450:2: iv_rulePropertyExpression= rulePropertyExpression EOF
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
    // InternalGumboParser.g:6456:1: rulePropertyExpression returns [EObject current=null] : (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm ) ;
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
            // InternalGumboParser.g:6462:2: ( (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm ) )
            // InternalGumboParser.g:6463:2: (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm )
            {
            // InternalGumboParser.g:6463:2: (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm )
            int alt123=11;
            alt123 = dfa123.predict(input);
            switch (alt123) {
                case 1 :
                    // InternalGumboParser.g:6464:3: this_RecordTerm_0= ruleRecordTerm
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
                    // InternalGumboParser.g:6473:3: this_ReferenceTerm_1= ruleReferenceTerm
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
                    // InternalGumboParser.g:6482:3: this_ComponentClassifierTerm_2= ruleComponentClassifierTerm
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
                    // InternalGumboParser.g:6491:3: this_ComputedTerm_3= ruleComputedTerm
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
                    // InternalGumboParser.g:6500:3: this_StringTerm_4= ruleStringTerm
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
                    // InternalGumboParser.g:6509:3: this_NumericRangeTerm_5= ruleNumericRangeTerm
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
                    // InternalGumboParser.g:6518:3: this_RealTerm_6= ruleRealTerm
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
                    // InternalGumboParser.g:6527:3: this_IntegerTerm_7= ruleIntegerTerm
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
                    // InternalGumboParser.g:6536:3: this_ListTerm_8= ruleListTerm
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
                    // InternalGumboParser.g:6545:3: this_BooleanLiteral_9= ruleBooleanLiteral
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
                    // InternalGumboParser.g:6554:3: this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm
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
    // InternalGumboParser.g:6566:1: entryRuleLiteralorReferenceTerm returns [EObject current=null] : iv_ruleLiteralorReferenceTerm= ruleLiteralorReferenceTerm EOF ;
    public final EObject entryRuleLiteralorReferenceTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralorReferenceTerm = null;


        try {
            // InternalGumboParser.g:6566:63: (iv_ruleLiteralorReferenceTerm= ruleLiteralorReferenceTerm EOF )
            // InternalGumboParser.g:6567:2: iv_ruleLiteralorReferenceTerm= ruleLiteralorReferenceTerm EOF
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
    // InternalGumboParser.g:6573:1: ruleLiteralorReferenceTerm returns [EObject current=null] : ( ( ruleQPREF ) ) ;
    public final EObject ruleLiteralorReferenceTerm() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalGumboParser.g:6579:2: ( ( ( ruleQPREF ) ) )
            // InternalGumboParser.g:6580:2: ( ( ruleQPREF ) )
            {
            // InternalGumboParser.g:6580:2: ( ( ruleQPREF ) )
            // InternalGumboParser.g:6581:3: ( ruleQPREF )
            {
            // InternalGumboParser.g:6581:3: ( ruleQPREF )
            // InternalGumboParser.g:6582:4: ruleQPREF
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
    // InternalGumboParser.g:6599:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalGumboParser.g:6599:55: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalGumboParser.g:6600:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
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
    // InternalGumboParser.g:6606:1: ruleBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalGumboParser.g:6612:2: ( ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) ) )
            // InternalGumboParser.g:6613:2: ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) )
            {
            // InternalGumboParser.g:6613:2: ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) )
            // InternalGumboParser.g:6614:3: () ( ( (lv_value_1_0= True ) ) | otherlv_2= False )
            {
            // InternalGumboParser.g:6614:3: ()
            // InternalGumboParser.g:6615:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalGumboParser.g:6621:3: ( ( (lv_value_1_0= True ) ) | otherlv_2= False )
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==True) ) {
                alt124=1;
            }
            else if ( (LA124_0==False) ) {
                alt124=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 124, 0, input);

                throw nvae;
            }
            switch (alt124) {
                case 1 :
                    // InternalGumboParser.g:6622:4: ( (lv_value_1_0= True ) )
                    {
                    // InternalGumboParser.g:6622:4: ( (lv_value_1_0= True ) )
                    // InternalGumboParser.g:6623:5: (lv_value_1_0= True )
                    {
                    // InternalGumboParser.g:6623:5: (lv_value_1_0= True )
                    // InternalGumboParser.g:6624:6: lv_value_1_0= True
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
                    // InternalGumboParser.g:6637:4: otherlv_2= False
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
    // InternalGumboParser.g:6646:1: entryRuleConstantValue returns [EObject current=null] : iv_ruleConstantValue= ruleConstantValue EOF ;
    public final EObject entryRuleConstantValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantValue = null;


        try {
            // InternalGumboParser.g:6646:54: (iv_ruleConstantValue= ruleConstantValue EOF )
            // InternalGumboParser.g:6647:2: iv_ruleConstantValue= ruleConstantValue EOF
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
    // InternalGumboParser.g:6653:1: ruleConstantValue returns [EObject current=null] : ( ( ruleQPREF ) ) ;
    public final EObject ruleConstantValue() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalGumboParser.g:6659:2: ( ( ( ruleQPREF ) ) )
            // InternalGumboParser.g:6660:2: ( ( ruleQPREF ) )
            {
            // InternalGumboParser.g:6660:2: ( ( ruleQPREF ) )
            // InternalGumboParser.g:6661:3: ( ruleQPREF )
            {
            // InternalGumboParser.g:6661:3: ( ruleQPREF )
            // InternalGumboParser.g:6662:4: ruleQPREF
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
    // InternalGumboParser.g:6679:1: entryRuleReferenceTerm returns [EObject current=null] : iv_ruleReferenceTerm= ruleReferenceTerm EOF ;
    public final EObject entryRuleReferenceTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceTerm = null;


        try {
            // InternalGumboParser.g:6679:54: (iv_ruleReferenceTerm= ruleReferenceTerm EOF )
            // InternalGumboParser.g:6680:2: iv_ruleReferenceTerm= ruleReferenceTerm EOF
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
    // InternalGumboParser.g:6686:1: ruleReferenceTerm returns [EObject current=null] : (otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleReferenceTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_path_2_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:6692:2: ( (otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis ) )
            // InternalGumboParser.g:6693:2: (otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis )
            {
            // InternalGumboParser.g:6693:2: (otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis )
            // InternalGumboParser.g:6694:3: otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis
            {
            otherlv_0=(Token)match(input,Reference,FollowSets000.FOLLOW_71); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReferenceTermAccess().getReferenceKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReferenceTermAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGumboParser.g:6702:3: ( (lv_path_2_0= ruleContainmentPathElement ) )
            // InternalGumboParser.g:6703:4: (lv_path_2_0= ruleContainmentPathElement )
            {
            // InternalGumboParser.g:6703:4: (lv_path_2_0= ruleContainmentPathElement )
            // InternalGumboParser.g:6704:5: lv_path_2_0= ruleContainmentPathElement
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
    // InternalGumboParser.g:6729:1: entryRuleRecordTerm returns [EObject current=null] : iv_ruleRecordTerm= ruleRecordTerm EOF ;
    public final EObject entryRuleRecordTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordTerm = null;


        try {
            // InternalGumboParser.g:6729:51: (iv_ruleRecordTerm= ruleRecordTerm EOF )
            // InternalGumboParser.g:6730:2: iv_ruleRecordTerm= ruleRecordTerm EOF
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
    // InternalGumboParser.g:6736:1: ruleRecordTerm returns [EObject current=null] : (otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket ) ;
    public final EObject ruleRecordTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ownedFieldValue_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:6742:2: ( (otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket ) )
            // InternalGumboParser.g:6743:2: (otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket )
            {
            // InternalGumboParser.g:6743:2: (otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket )
            // InternalGumboParser.g:6744:3: otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket
            {
            otherlv_0=(Token)match(input,LeftSquareBracket,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRecordTermAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalGumboParser.g:6748:3: ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+
            int cnt125=0;
            loop125:
            do {
                int alt125=2;
                int LA125_0 = input.LA(1);

                if ( (LA125_0==RULE_ID) ) {
                    alt125=1;
                }


                switch (alt125) {
            	case 1 :
            	    // InternalGumboParser.g:6749:4: (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation )
            	    {
            	    // InternalGumboParser.g:6749:4: (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation )
            	    // InternalGumboParser.g:6750:5: lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRecordTermAccess().getOwnedFieldValueFieldPropertyAssociationParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_90);
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
            	    if ( cnt125 >= 1 ) break loop125;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(125, input);
                        throw eee;
                }
                cnt125++;
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
    // InternalGumboParser.g:6775:1: entryRuleComputedTerm returns [EObject current=null] : iv_ruleComputedTerm= ruleComputedTerm EOF ;
    public final EObject entryRuleComputedTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComputedTerm = null;


        try {
            // InternalGumboParser.g:6775:53: (iv_ruleComputedTerm= ruleComputedTerm EOF )
            // InternalGumboParser.g:6776:2: iv_ruleComputedTerm= ruleComputedTerm EOF
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
    // InternalGumboParser.g:6782:1: ruleComputedTerm returns [EObject current=null] : (otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleComputedTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_function_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalGumboParser.g:6788:2: ( (otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis ) )
            // InternalGumboParser.g:6789:2: (otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis )
            {
            // InternalGumboParser.g:6789:2: (otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis )
            // InternalGumboParser.g:6790:3: otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis
            {
            otherlv_0=(Token)match(input,Compute,FollowSets000.FOLLOW_71); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getComputedTermAccess().getComputeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getComputedTermAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGumboParser.g:6798:3: ( (lv_function_2_0= RULE_ID ) )
            // InternalGumboParser.g:6799:4: (lv_function_2_0= RULE_ID )
            {
            // InternalGumboParser.g:6799:4: (lv_function_2_0= RULE_ID )
            // InternalGumboParser.g:6800:5: lv_function_2_0= RULE_ID
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
    // InternalGumboParser.g:6824:1: entryRuleComponentClassifierTerm returns [EObject current=null] : iv_ruleComponentClassifierTerm= ruleComponentClassifierTerm EOF ;
    public final EObject entryRuleComponentClassifierTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentClassifierTerm = null;


        try {
            // InternalGumboParser.g:6824:64: (iv_ruleComponentClassifierTerm= ruleComponentClassifierTerm EOF )
            // InternalGumboParser.g:6825:2: iv_ruleComponentClassifierTerm= ruleComponentClassifierTerm EOF
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
    // InternalGumboParser.g:6831:1: ruleComponentClassifierTerm returns [EObject current=null] : (otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleComponentClassifierTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalGumboParser.g:6837:2: ( (otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis ) )
            // InternalGumboParser.g:6838:2: (otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis )
            {
            // InternalGumboParser.g:6838:2: (otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis )
            // InternalGumboParser.g:6839:3: otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis
            {
            otherlv_0=(Token)match(input,Classifier,FollowSets000.FOLLOW_71); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getComponentClassifierTermAccess().getClassifierKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getComponentClassifierTermAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGumboParser.g:6847:3: ( ( ruleQCREF ) )
            // InternalGumboParser.g:6848:4: ( ruleQCREF )
            {
            // InternalGumboParser.g:6848:4: ( ruleQCREF )
            // InternalGumboParser.g:6849:5: ruleQCREF
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
    // InternalGumboParser.g:6871:1: entryRuleListTerm returns [EObject current=null] : iv_ruleListTerm= ruleListTerm EOF ;
    public final EObject entryRuleListTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListTerm = null;


        try {
            // InternalGumboParser.g:6871:49: (iv_ruleListTerm= ruleListTerm EOF )
            // InternalGumboParser.g:6872:2: iv_ruleListTerm= ruleListTerm EOF
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
    // InternalGumboParser.g:6878:1: ruleListTerm returns [EObject current=null] : ( () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis ) ;
    public final EObject ruleListTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedListElement_2_0 = null;

        EObject lv_ownedListElement_4_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:6884:2: ( ( () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis ) )
            // InternalGumboParser.g:6885:2: ( () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis )
            {
            // InternalGumboParser.g:6885:2: ( () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis )
            // InternalGumboParser.g:6886:3: () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis
            {
            // InternalGumboParser.g:6886:3: ()
            // InternalGumboParser.g:6887:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getListTermAccess().getListValueAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_91); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getListTermAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGumboParser.g:6897:3: ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==Classifier||LA127_0==Reference||LA127_0==Compute||LA127_0==False||LA127_0==True||LA127_0==LeftParenthesis||LA127_0==PlusSign||LA127_0==HyphenMinus||LA127_0==LeftSquareBracket||LA127_0==RULE_INTEGER_LIT||LA127_0==RULE_REAL_LIT||(LA127_0>=RULE_STRING && LA127_0<=RULE_ID)) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // InternalGumboParser.g:6898:4: ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )*
                    {
                    // InternalGumboParser.g:6898:4: ( (lv_ownedListElement_2_0= rulePropertyExpression ) )
                    // InternalGumboParser.g:6899:5: (lv_ownedListElement_2_0= rulePropertyExpression )
                    {
                    // InternalGumboParser.g:6899:5: (lv_ownedListElement_2_0= rulePropertyExpression )
                    // InternalGumboParser.g:6900:6: lv_ownedListElement_2_0= rulePropertyExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getListTermAccess().getOwnedListElementPropertyExpressionParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_34);
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

                    // InternalGumboParser.g:6917:4: (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )*
                    loop126:
                    do {
                        int alt126=2;
                        int LA126_0 = input.LA(1);

                        if ( (LA126_0==Comma) ) {
                            alt126=1;
                        }


                        switch (alt126) {
                    	case 1 :
                    	    // InternalGumboParser.g:6918:5: otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FollowSets000.FOLLOW_86); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getListTermAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalGumboParser.g:6922:5: ( (lv_ownedListElement_4_0= rulePropertyExpression ) )
                    	    // InternalGumboParser.g:6923:6: (lv_ownedListElement_4_0= rulePropertyExpression )
                    	    {
                    	    // InternalGumboParser.g:6923:6: (lv_ownedListElement_4_0= rulePropertyExpression )
                    	    // InternalGumboParser.g:6924:7: lv_ownedListElement_4_0= rulePropertyExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getListTermAccess().getOwnedListElementPropertyExpressionParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_34);
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
                    	    break loop126;
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
    // InternalGumboParser.g:6951:1: entryRuleFieldPropertyAssociation returns [EObject current=null] : iv_ruleFieldPropertyAssociation= ruleFieldPropertyAssociation EOF ;
    public final EObject entryRuleFieldPropertyAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldPropertyAssociation = null;


        try {
            // InternalGumboParser.g:6951:65: (iv_ruleFieldPropertyAssociation= ruleFieldPropertyAssociation EOF )
            // InternalGumboParser.g:6952:2: iv_ruleFieldPropertyAssociation= ruleFieldPropertyAssociation EOF
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
    // InternalGumboParser.g:6958:1: ruleFieldPropertyAssociation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon ) ;
    public final EObject ruleFieldPropertyAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedValue_2_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:6964:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon ) )
            // InternalGumboParser.g:6965:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon )
            {
            // InternalGumboParser.g:6965:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon )
            // InternalGumboParser.g:6966:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon
            {
            // InternalGumboParser.g:6966:3: ( (otherlv_0= RULE_ID ) )
            // InternalGumboParser.g:6967:4: (otherlv_0= RULE_ID )
            {
            // InternalGumboParser.g:6967:4: (otherlv_0= RULE_ID )
            // InternalGumboParser.g:6968:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFieldPropertyAssociationRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getFieldPropertyAssociationAccess().getPropertyBasicPropertyCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_86); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFieldPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_1());
              		
            }
            // InternalGumboParser.g:6983:3: ( (lv_ownedValue_2_0= rulePropertyExpression ) )
            // InternalGumboParser.g:6984:4: (lv_ownedValue_2_0= rulePropertyExpression )
            {
            // InternalGumboParser.g:6984:4: (lv_ownedValue_2_0= rulePropertyExpression )
            // InternalGumboParser.g:6985:5: lv_ownedValue_2_0= rulePropertyExpression
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
    // InternalGumboParser.g:7010:1: entryRuleContainmentPathElement returns [EObject current=null] : iv_ruleContainmentPathElement= ruleContainmentPathElement EOF ;
    public final EObject entryRuleContainmentPathElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainmentPathElement = null;


        try {
            // InternalGumboParser.g:7010:63: (iv_ruleContainmentPathElement= ruleContainmentPathElement EOF )
            // InternalGumboParser.g:7011:2: iv_ruleContainmentPathElement= ruleContainmentPathElement EOF
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
    // InternalGumboParser.g:7017:1: ruleContainmentPathElement returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )? ) ;
    public final EObject ruleContainmentPathElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_arrayRange_1_0 = null;

        EObject lv_path_3_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:7023:2: ( ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )? ) )
            // InternalGumboParser.g:7024:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )? )
            {
            // InternalGumboParser.g:7024:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )? )
            // InternalGumboParser.g:7025:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )?
            {
            // InternalGumboParser.g:7025:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* )
            // InternalGumboParser.g:7026:4: ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )*
            {
            // InternalGumboParser.g:7026:4: ( (otherlv_0= RULE_ID ) )
            // InternalGumboParser.g:7027:5: (otherlv_0= RULE_ID )
            {
            // InternalGumboParser.g:7027:5: (otherlv_0= RULE_ID )
            // InternalGumboParser.g:7028:6: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElement(grammarAccess.getContainmentPathElementRule());
              						}
              					
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						newLeafNode(otherlv_0, grammarAccess.getContainmentPathElementAccess().getNamedElementNamedElementCrossReference_0_0_0());
              					
            }

            }


            }

            // InternalGumboParser.g:7039:4: ( (lv_arrayRange_1_0= ruleArrayRange ) )*
            loop128:
            do {
                int alt128=2;
                int LA128_0 = input.LA(1);

                if ( (LA128_0==LeftSquareBracket) ) {
                    alt128=1;
                }


                switch (alt128) {
            	case 1 :
            	    // InternalGumboParser.g:7040:5: (lv_arrayRange_1_0= ruleArrayRange )
            	    {
            	    // InternalGumboParser.g:7040:5: (lv_arrayRange_1_0= ruleArrayRange )
            	    // InternalGumboParser.g:7041:6: lv_arrayRange_1_0= ruleArrayRange
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getContainmentPathElementAccess().getArrayRangeArrayRangeParserRuleCall_0_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_24);
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
            	    break loop128;
                }
            } while (true);


            }

            // InternalGumboParser.g:7059:3: (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==FullStop) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // InternalGumboParser.g:7060:4: otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) )
                    {
                    otherlv_2=(Token)match(input,FullStop,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getContainmentPathElementAccess().getFullStopKeyword_1_0());
                      			
                    }
                    // InternalGumboParser.g:7064:4: ( (lv_path_3_0= ruleContainmentPathElement ) )
                    // InternalGumboParser.g:7065:5: (lv_path_3_0= ruleContainmentPathElement )
                    {
                    // InternalGumboParser.g:7065:5: (lv_path_3_0= ruleContainmentPathElement )
                    // InternalGumboParser.g:7066:6: lv_path_3_0= ruleContainmentPathElement
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
    // InternalGumboParser.g:7088:1: entryRulePlusMinus returns [String current=null] : iv_rulePlusMinus= rulePlusMinus EOF ;
    public final String entryRulePlusMinus() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePlusMinus = null;


        try {
            // InternalGumboParser.g:7088:49: (iv_rulePlusMinus= rulePlusMinus EOF )
            // InternalGumboParser.g:7089:2: iv_rulePlusMinus= rulePlusMinus EOF
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
    // InternalGumboParser.g:7095:1: rulePlusMinus returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= PlusSign | kw= HyphenMinus ) ;
    public final AntlrDatatypeRuleToken rulePlusMinus() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumboParser.g:7101:2: ( (kw= PlusSign | kw= HyphenMinus ) )
            // InternalGumboParser.g:7102:2: (kw= PlusSign | kw= HyphenMinus )
            {
            // InternalGumboParser.g:7102:2: (kw= PlusSign | kw= HyphenMinus )
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==PlusSign) ) {
                alt130=1;
            }
            else if ( (LA130_0==HyphenMinus) ) {
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
                    // InternalGumboParser.g:7103:3: kw= PlusSign
                    {
                    kw=(Token)match(input,PlusSign,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPlusMinusAccess().getPlusSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:7109:3: kw= HyphenMinus
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
    // InternalGumboParser.g:7118:1: entryRuleStringTerm returns [EObject current=null] : iv_ruleStringTerm= ruleStringTerm EOF ;
    public final EObject entryRuleStringTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringTerm = null;


        try {
            // InternalGumboParser.g:7118:51: (iv_ruleStringTerm= ruleStringTerm EOF )
            // InternalGumboParser.g:7119:2: iv_ruleStringTerm= ruleStringTerm EOF
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
    // InternalGumboParser.g:7125:1: ruleStringTerm returns [EObject current=null] : ( (lv_value_0_0= ruleNoQuoteString ) ) ;
    public final EObject ruleStringTerm() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:7131:2: ( ( (lv_value_0_0= ruleNoQuoteString ) ) )
            // InternalGumboParser.g:7132:2: ( (lv_value_0_0= ruleNoQuoteString ) )
            {
            // InternalGumboParser.g:7132:2: ( (lv_value_0_0= ruleNoQuoteString ) )
            // InternalGumboParser.g:7133:3: (lv_value_0_0= ruleNoQuoteString )
            {
            // InternalGumboParser.g:7133:3: (lv_value_0_0= ruleNoQuoteString )
            // InternalGumboParser.g:7134:4: lv_value_0_0= ruleNoQuoteString
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
    // InternalGumboParser.g:7154:1: entryRuleNoQuoteString returns [String current=null] : iv_ruleNoQuoteString= ruleNoQuoteString EOF ;
    public final String entryRuleNoQuoteString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNoQuoteString = null;


        try {
            // InternalGumboParser.g:7154:53: (iv_ruleNoQuoteString= ruleNoQuoteString EOF )
            // InternalGumboParser.g:7155:2: iv_ruleNoQuoteString= ruleNoQuoteString EOF
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
    // InternalGumboParser.g:7161:1: ruleNoQuoteString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleNoQuoteString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalGumboParser.g:7167:2: (this_STRING_0= RULE_STRING )
            // InternalGumboParser.g:7168:2: this_STRING_0= RULE_STRING
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
    // InternalGumboParser.g:7178:1: entryRuleArrayRange returns [EObject current=null] : iv_ruleArrayRange= ruleArrayRange EOF ;
    public final EObject entryRuleArrayRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayRange = null;


        try {
            // InternalGumboParser.g:7178:51: (iv_ruleArrayRange= ruleArrayRange EOF )
            // InternalGumboParser.g:7179:2: iv_ruleArrayRange= ruleArrayRange EOF
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
    // InternalGumboParser.g:7185:1: ruleArrayRange returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleArrayRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_lowerBound_2_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_4_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:7191:2: ( ( () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket ) )
            // InternalGumboParser.g:7192:2: ( () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket )
            {
            // InternalGumboParser.g:7192:2: ( () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket )
            // InternalGumboParser.g:7193:3: () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket
            {
            // InternalGumboParser.g:7193:3: ()
            // InternalGumboParser.g:7194:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getArrayRangeAccess().getArrayRangeAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FollowSets000.FOLLOW_92); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getArrayRangeAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalGumboParser.g:7204:3: ( (lv_lowerBound_2_0= ruleINTVALUE ) )
            // InternalGumboParser.g:7205:4: (lv_lowerBound_2_0= ruleINTVALUE )
            {
            // InternalGumboParser.g:7205:4: (lv_lowerBound_2_0= ruleINTVALUE )
            // InternalGumboParser.g:7206:5: lv_lowerBound_2_0= ruleINTVALUE
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArrayRangeAccess().getLowerBoundINTVALUEParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_93);
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

            // InternalGumboParser.g:7223:3: (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==FullStopFullStop) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // InternalGumboParser.g:7224:4: otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) )
                    {
                    otherlv_3=(Token)match(input,FullStopFullStop,FollowSets000.FOLLOW_92); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getArrayRangeAccess().getFullStopFullStopKeyword_3_0());
                      			
                    }
                    // InternalGumboParser.g:7228:4: ( (lv_upperBound_4_0= ruleINTVALUE ) )
                    // InternalGumboParser.g:7229:5: (lv_upperBound_4_0= ruleINTVALUE )
                    {
                    // InternalGumboParser.g:7229:5: (lv_upperBound_4_0= ruleINTVALUE )
                    // InternalGumboParser.g:7230:6: lv_upperBound_4_0= ruleINTVALUE
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getArrayRangeAccess().getUpperBoundINTVALUEParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_94);
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
    // InternalGumboParser.g:7256:1: entryRuleSignedConstant returns [EObject current=null] : iv_ruleSignedConstant= ruleSignedConstant EOF ;
    public final EObject entryRuleSignedConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignedConstant = null;


        try {
            // InternalGumboParser.g:7256:55: (iv_ruleSignedConstant= ruleSignedConstant EOF )
            // InternalGumboParser.g:7257:2: iv_ruleSignedConstant= ruleSignedConstant EOF
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
    // InternalGumboParser.g:7263:1: ruleSignedConstant returns [EObject current=null] : ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) ) ;
    public final EObject ruleSignedConstant() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_ownedPropertyExpression_1_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:7269:2: ( ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) ) )
            // InternalGumboParser.g:7270:2: ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) )
            {
            // InternalGumboParser.g:7270:2: ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) )
            // InternalGumboParser.g:7271:3: ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) )
            {
            // InternalGumboParser.g:7271:3: ( (lv_op_0_0= rulePlusMinus ) )
            // InternalGumboParser.g:7272:4: (lv_op_0_0= rulePlusMinus )
            {
            // InternalGumboParser.g:7272:4: (lv_op_0_0= rulePlusMinus )
            // InternalGumboParser.g:7273:5: lv_op_0_0= rulePlusMinus
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSignedConstantAccess().getOpPlusMinusParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_95);
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

            // InternalGumboParser.g:7290:3: ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) )
            // InternalGumboParser.g:7291:4: (lv_ownedPropertyExpression_1_0= ruleConstantValue )
            {
            // InternalGumboParser.g:7291:4: (lv_ownedPropertyExpression_1_0= ruleConstantValue )
            // InternalGumboParser.g:7292:5: lv_ownedPropertyExpression_1_0= ruleConstantValue
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
    // InternalGumboParser.g:7313:1: entryRuleIntegerTerm returns [EObject current=null] : iv_ruleIntegerTerm= ruleIntegerTerm EOF ;
    public final EObject entryRuleIntegerTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerTerm = null;


        try {
            // InternalGumboParser.g:7313:52: (iv_ruleIntegerTerm= ruleIntegerTerm EOF )
            // InternalGumboParser.g:7314:2: iv_ruleIntegerTerm= ruleIntegerTerm EOF
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
    // InternalGumboParser.g:7320:1: ruleIntegerTerm returns [EObject current=null] : ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? ) ;
    public final EObject ruleIntegerTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:7326:2: ( ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? ) )
            // InternalGumboParser.g:7327:2: ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? )
            {
            // InternalGumboParser.g:7327:2: ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? )
            // InternalGumboParser.g:7328:3: ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )?
            {
            // InternalGumboParser.g:7328:3: ( (lv_value_0_0= ruleSignedInt ) )
            // InternalGumboParser.g:7329:4: (lv_value_0_0= ruleSignedInt )
            {
            // InternalGumboParser.g:7329:4: (lv_value_0_0= ruleSignedInt )
            // InternalGumboParser.g:7330:5: lv_value_0_0= ruleSignedInt
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

            // InternalGumboParser.g:7347:3: ( (otherlv_1= RULE_ID ) )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==RULE_ID) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // InternalGumboParser.g:7348:4: (otherlv_1= RULE_ID )
                    {
                    // InternalGumboParser.g:7348:4: (otherlv_1= RULE_ID )
                    // InternalGumboParser.g:7349:5: otherlv_1= RULE_ID
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
    // InternalGumboParser.g:7364:1: entryRuleSignedInt returns [String current=null] : iv_ruleSignedInt= ruleSignedInt EOF ;
    public final String entryRuleSignedInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedInt = null;


        try {
            // InternalGumboParser.g:7364:49: (iv_ruleSignedInt= ruleSignedInt EOF )
            // InternalGumboParser.g:7365:2: iv_ruleSignedInt= ruleSignedInt EOF
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
    // InternalGumboParser.g:7371:1: ruleSignedInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT ) ;
    public final AntlrDatatypeRuleToken ruleSignedInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INTEGER_LIT_2=null;


        	enterRule();

        try {
            // InternalGumboParser.g:7377:2: ( ( (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT ) )
            // InternalGumboParser.g:7378:2: ( (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT )
            {
            // InternalGumboParser.g:7378:2: ( (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT )
            // InternalGumboParser.g:7379:3: (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT
            {
            // InternalGumboParser.g:7379:3: (kw= PlusSign | kw= HyphenMinus )?
            int alt133=3;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==PlusSign) ) {
                alt133=1;
            }
            else if ( (LA133_0==HyphenMinus) ) {
                alt133=2;
            }
            switch (alt133) {
                case 1 :
                    // InternalGumboParser.g:7380:4: kw= PlusSign
                    {
                    kw=(Token)match(input,PlusSign,FollowSets000.FOLLOW_92); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSignedIntAccess().getPlusSignKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:7386:4: kw= HyphenMinus
                    {
                    kw=(Token)match(input,HyphenMinus,FollowSets000.FOLLOW_92); if (state.failed) return current;
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
    // InternalGumboParser.g:7403:1: entryRuleRealTerm returns [EObject current=null] : iv_ruleRealTerm= ruleRealTerm EOF ;
    public final EObject entryRuleRealTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealTerm = null;


        try {
            // InternalGumboParser.g:7403:49: (iv_ruleRealTerm= ruleRealTerm EOF )
            // InternalGumboParser.g:7404:2: iv_ruleRealTerm= ruleRealTerm EOF
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
    // InternalGumboParser.g:7410:1: ruleRealTerm returns [EObject current=null] : ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? ) ;
    public final EObject ruleRealTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:7416:2: ( ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? ) )
            // InternalGumboParser.g:7417:2: ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? )
            {
            // InternalGumboParser.g:7417:2: ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? )
            // InternalGumboParser.g:7418:3: ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )?
            {
            // InternalGumboParser.g:7418:3: ( (lv_value_0_0= ruleSignedReal ) )
            // InternalGumboParser.g:7419:4: (lv_value_0_0= ruleSignedReal )
            {
            // InternalGumboParser.g:7419:4: (lv_value_0_0= ruleSignedReal )
            // InternalGumboParser.g:7420:5: lv_value_0_0= ruleSignedReal
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

            // InternalGumboParser.g:7437:3: ( (otherlv_1= RULE_ID ) )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==RULE_ID) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // InternalGumboParser.g:7438:4: (otherlv_1= RULE_ID )
                    {
                    // InternalGumboParser.g:7438:4: (otherlv_1= RULE_ID )
                    // InternalGumboParser.g:7439:5: otherlv_1= RULE_ID
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
    // InternalGumboParser.g:7454:1: entryRuleSignedReal returns [String current=null] : iv_ruleSignedReal= ruleSignedReal EOF ;
    public final String entryRuleSignedReal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedReal = null;


        try {
            // InternalGumboParser.g:7454:50: (iv_ruleSignedReal= ruleSignedReal EOF )
            // InternalGumboParser.g:7455:2: iv_ruleSignedReal= ruleSignedReal EOF
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
    // InternalGumboParser.g:7461:1: ruleSignedReal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT ) ;
    public final AntlrDatatypeRuleToken ruleSignedReal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_REAL_LIT_2=null;


        	enterRule();

        try {
            // InternalGumboParser.g:7467:2: ( ( (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT ) )
            // InternalGumboParser.g:7468:2: ( (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT )
            {
            // InternalGumboParser.g:7468:2: ( (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT )
            // InternalGumboParser.g:7469:3: (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT
            {
            // InternalGumboParser.g:7469:3: (kw= PlusSign | kw= HyphenMinus )?
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
                    // InternalGumboParser.g:7470:4: kw= PlusSign
                    {
                    kw=(Token)match(input,PlusSign,FollowSets000.FOLLOW_96); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSignedRealAccess().getPlusSignKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGumboParser.g:7476:4: kw= HyphenMinus
                    {
                    kw=(Token)match(input,HyphenMinus,FollowSets000.FOLLOW_96); if (state.failed) return current;
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
    // InternalGumboParser.g:7493:1: entryRuleNumericRangeTerm returns [EObject current=null] : iv_ruleNumericRangeTerm= ruleNumericRangeTerm EOF ;
    public final EObject entryRuleNumericRangeTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericRangeTerm = null;


        try {
            // InternalGumboParser.g:7493:57: (iv_ruleNumericRangeTerm= ruleNumericRangeTerm EOF )
            // InternalGumboParser.g:7494:2: iv_ruleNumericRangeTerm= ruleNumericRangeTerm EOF
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
    // InternalGumboParser.g:7500:1: ruleNumericRangeTerm returns [EObject current=null] : ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )? ) ;
    public final EObject ruleNumericRangeTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_minimum_0_0 = null;

        EObject lv_maximum_2_0 = null;

        EObject lv_delta_4_0 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:7506:2: ( ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )? ) )
            // InternalGumboParser.g:7507:2: ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )? )
            {
            // InternalGumboParser.g:7507:2: ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )? )
            // InternalGumboParser.g:7508:3: ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )?
            {
            // InternalGumboParser.g:7508:3: ( (lv_minimum_0_0= ruleNumAlt ) )
            // InternalGumboParser.g:7509:4: (lv_minimum_0_0= ruleNumAlt )
            {
            // InternalGumboParser.g:7509:4: (lv_minimum_0_0= ruleNumAlt )
            // InternalGumboParser.g:7510:5: lv_minimum_0_0= ruleNumAlt
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNumericRangeTermAccess().getMinimumNumAltParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_97);
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

            otherlv_1=(Token)match(input,FullStopFullStop,FollowSets000.FOLLOW_95); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNumericRangeTermAccess().getFullStopFullStopKeyword_1());
              		
            }
            // InternalGumboParser.g:7531:3: ( (lv_maximum_2_0= ruleNumAlt ) )
            // InternalGumboParser.g:7532:4: (lv_maximum_2_0= ruleNumAlt )
            {
            // InternalGumboParser.g:7532:4: (lv_maximum_2_0= ruleNumAlt )
            // InternalGumboParser.g:7533:5: lv_maximum_2_0= ruleNumAlt
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNumericRangeTermAccess().getMaximumNumAltParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_98);
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

            // InternalGumboParser.g:7550:3: (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==Delta) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // InternalGumboParser.g:7551:4: otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) )
                    {
                    otherlv_3=(Token)match(input,Delta,FollowSets000.FOLLOW_95); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getNumericRangeTermAccess().getDeltaKeyword_3_0());
                      			
                    }
                    // InternalGumboParser.g:7555:4: ( (lv_delta_4_0= ruleNumAlt ) )
                    // InternalGumboParser.g:7556:5: (lv_delta_4_0= ruleNumAlt )
                    {
                    // InternalGumboParser.g:7556:5: (lv_delta_4_0= ruleNumAlt )
                    // InternalGumboParser.g:7557:6: lv_delta_4_0= ruleNumAlt
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
    // InternalGumboParser.g:7579:1: entryRuleNumAlt returns [EObject current=null] : iv_ruleNumAlt= ruleNumAlt EOF ;
    public final EObject entryRuleNumAlt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumAlt = null;


        try {
            // InternalGumboParser.g:7579:47: (iv_ruleNumAlt= ruleNumAlt EOF )
            // InternalGumboParser.g:7580:2: iv_ruleNumAlt= ruleNumAlt EOF
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
    // InternalGumboParser.g:7586:1: ruleNumAlt returns [EObject current=null] : (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue ) ;
    public final EObject ruleNumAlt() throws RecognitionException {
        EObject current = null;

        EObject this_RealTerm_0 = null;

        EObject this_IntegerTerm_1 = null;

        EObject this_SignedConstant_2 = null;

        EObject this_ConstantValue_3 = null;



        	enterRule();

        try {
            // InternalGumboParser.g:7592:2: ( (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue ) )
            // InternalGumboParser.g:7593:2: (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue )
            {
            // InternalGumboParser.g:7593:2: (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue )
            int alt137=4;
            switch ( input.LA(1) ) {
            case PlusSign:
                {
                switch ( input.LA(2) ) {
                case RULE_REAL_LIT:
                    {
                    alt137=1;
                    }
                    break;
                case RULE_INTEGER_LIT:
                    {
                    alt137=2;
                    }
                    break;
                case RULE_ID:
                    {
                    alt137=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 137, 1, input);

                    throw nvae;
                }

                }
                break;
            case HyphenMinus:
                {
                switch ( input.LA(2) ) {
                case RULE_ID:
                    {
                    alt137=3;
                    }
                    break;
                case RULE_REAL_LIT:
                    {
                    alt137=1;
                    }
                    break;
                case RULE_INTEGER_LIT:
                    {
                    alt137=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 137, 2, input);

                    throw nvae;
                }

                }
                break;
            case RULE_REAL_LIT:
                {
                alt137=1;
                }
                break;
            case RULE_INTEGER_LIT:
                {
                alt137=2;
                }
                break;
            case RULE_ID:
                {
                alt137=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 137, 0, input);

                throw nvae;
            }

            switch (alt137) {
                case 1 :
                    // InternalGumboParser.g:7594:3: this_RealTerm_0= ruleRealTerm
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
                    // InternalGumboParser.g:7603:3: this_IntegerTerm_1= ruleIntegerTerm
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
                    // InternalGumboParser.g:7612:3: this_SignedConstant_2= ruleSignedConstant
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
                    // InternalGumboParser.g:7621:3: this_ConstantValue_3= ruleConstantValue
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
    // InternalGumboParser.g:7633:1: entryRuleAppliesToKeywords returns [String current=null] : iv_ruleAppliesToKeywords= ruleAppliesToKeywords EOF ;
    public final String entryRuleAppliesToKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAppliesToKeywords = null;


        try {
            // InternalGumboParser.g:7633:57: (iv_ruleAppliesToKeywords= ruleAppliesToKeywords EOF )
            // InternalGumboParser.g:7634:2: iv_ruleAppliesToKeywords= ruleAppliesToKeywords EOF
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
    // InternalGumboParser.g:7640:1: ruleAppliesToKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Applies kw= To ) ;
    public final AntlrDatatypeRuleToken ruleAppliesToKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumboParser.g:7646:2: ( (kw= Applies kw= To ) )
            // InternalGumboParser.g:7647:2: (kw= Applies kw= To )
            {
            // InternalGumboParser.g:7647:2: (kw= Applies kw= To )
            // InternalGumboParser.g:7648:3: kw= Applies kw= To
            {
            kw=(Token)match(input,Applies,FollowSets000.FOLLOW_99); if (state.failed) return current;
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
    // InternalGumboParser.g:7662:1: entryRuleInBindingKeywords returns [String current=null] : iv_ruleInBindingKeywords= ruleInBindingKeywords EOF ;
    public final String entryRuleInBindingKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInBindingKeywords = null;


        try {
            // InternalGumboParser.g:7662:57: (iv_ruleInBindingKeywords= ruleInBindingKeywords EOF )
            // InternalGumboParser.g:7663:2: iv_ruleInBindingKeywords= ruleInBindingKeywords EOF
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
    // InternalGumboParser.g:7669:1: ruleInBindingKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= In kw= Binding ) ;
    public final AntlrDatatypeRuleToken ruleInBindingKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumboParser.g:7675:2: ( (kw= In kw= Binding ) )
            // InternalGumboParser.g:7676:2: (kw= In kw= Binding )
            {
            // InternalGumboParser.g:7676:2: (kw= In kw= Binding )
            // InternalGumboParser.g:7677:3: kw= In kw= Binding
            {
            kw=(Token)match(input,In,FollowSets000.FOLLOW_100); if (state.failed) return current;
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
    // InternalGumboParser.g:7691:1: entryRuleInModesKeywords returns [String current=null] : iv_ruleInModesKeywords= ruleInModesKeywords EOF ;
    public final String entryRuleInModesKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInModesKeywords = null;


        try {
            // InternalGumboParser.g:7691:55: (iv_ruleInModesKeywords= ruleInModesKeywords EOF )
            // InternalGumboParser.g:7692:2: iv_ruleInModesKeywords= ruleInModesKeywords EOF
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
    // InternalGumboParser.g:7698:1: ruleInModesKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= In kw= Modes ) ;
    public final AntlrDatatypeRuleToken ruleInModesKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumboParser.g:7704:2: ( (kw= In kw= Modes ) )
            // InternalGumboParser.g:7705:2: (kw= In kw= Modes )
            {
            // InternalGumboParser.g:7705:2: (kw= In kw= Modes )
            // InternalGumboParser.g:7706:3: kw= In kw= Modes
            {
            kw=(Token)match(input,In,FollowSets000.FOLLOW_101); if (state.failed) return current;
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
    // InternalGumboParser.g:7720:1: entryRuleINTVALUE returns [String current=null] : iv_ruleINTVALUE= ruleINTVALUE EOF ;
    public final String entryRuleINTVALUE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTVALUE = null;


        try {
            // InternalGumboParser.g:7720:48: (iv_ruleINTVALUE= ruleINTVALUE EOF )
            // InternalGumboParser.g:7721:2: iv_ruleINTVALUE= ruleINTVALUE EOF
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
    // InternalGumboParser.g:7727:1: ruleINTVALUE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INTEGER_LIT_0= RULE_INTEGER_LIT ;
    public final AntlrDatatypeRuleToken ruleINTVALUE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INTEGER_LIT_0=null;


        	enterRule();

        try {
            // InternalGumboParser.g:7733:2: (this_INTEGER_LIT_0= RULE_INTEGER_LIT )
            // InternalGumboParser.g:7734:2: this_INTEGER_LIT_0= RULE_INTEGER_LIT
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
    // InternalGumboParser.g:7744:1: entryRuleQPREF returns [String current=null] : iv_ruleQPREF= ruleQPREF EOF ;
    public final String entryRuleQPREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQPREF = null;


        try {
            // InternalGumboParser.g:7744:45: (iv_ruleQPREF= ruleQPREF EOF )
            // InternalGumboParser.g:7745:2: iv_ruleQPREF= ruleQPREF EOF
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
    // InternalGumboParser.g:7751:1: ruleQPREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleQPREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalGumboParser.g:7757:2: ( (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )? ) )
            // InternalGumboParser.g:7758:2: (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )? )
            {
            // InternalGumboParser.g:7758:2: (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )? )
            // InternalGumboParser.g:7759:3: this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_102); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQPREFAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalGumboParser.g:7766:3: (kw= ColonColon this_ID_2= RULE_ID )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==ColonColon) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // InternalGumboParser.g:7767:4: kw= ColonColon this_ID_2= RULE_ID
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
    // InternalGumboParser.g:7784:1: entryRuleQCREF returns [String current=null] : iv_ruleQCREF= ruleQCREF EOF ;
    public final String entryRuleQCREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQCREF = null;


        try {
            // InternalGumboParser.g:7784:45: (iv_ruleQCREF= ruleQCREF EOF )
            // InternalGumboParser.g:7785:2: iv_ruleQCREF= ruleQCREF EOF
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
    // InternalGumboParser.g:7791:1: ruleQCREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleQCREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;


        	enterRule();

        try {
            // InternalGumboParser.g:7797:2: ( ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? ) )
            // InternalGumboParser.g:7798:2: ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? )
            {
            // InternalGumboParser.g:7798:2: ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? )
            // InternalGumboParser.g:7799:3: (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )?
            {
            // InternalGumboParser.g:7799:3: (this_ID_0= RULE_ID kw= ColonColon )*
            loop139:
            do {
                int alt139=2;
                int LA139_0 = input.LA(1);

                if ( (LA139_0==RULE_ID) ) {
                    int LA139_1 = input.LA(2);

                    if ( (LA139_1==ColonColon) ) {
                        alt139=1;
                    }


                }


                switch (alt139) {
            	case 1 :
            	    // InternalGumboParser.g:7800:4: this_ID_0= RULE_ID kw= ColonColon
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_103); if (state.failed) return current;
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
            	    break loop139;
                }
            } while (true);

            this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_2, grammarAccess.getQCREFAccess().getIDTerminalRuleCall_1());
              		
            }
            // InternalGumboParser.g:7820:3: (kw= FullStop this_ID_4= RULE_ID )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==FullStop) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // InternalGumboParser.g:7821:4: kw= FullStop this_ID_4= RULE_ID
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
    // InternalGumboParser.g:7838:1: entryRuleSTAR returns [String current=null] : iv_ruleSTAR= ruleSTAR EOF ;
    public final String entryRuleSTAR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSTAR = null;


        try {
            // InternalGumboParser.g:7838:44: (iv_ruleSTAR= ruleSTAR EOF )
            // InternalGumboParser.g:7839:2: iv_ruleSTAR= ruleSTAR EOF
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
    // InternalGumboParser.g:7845:1: ruleSTAR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= Asterisk ;
    public final AntlrDatatypeRuleToken ruleSTAR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGumboParser.g:7851:2: (kw= Asterisk )
            // InternalGumboParser.g:7852:2: kw= Asterisk
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
        // InternalGumboParser.g:4340:5: ( ( () Enum LeftParenthesis ) )
        // InternalGumboParser.g:4340:6: ( () Enum LeftParenthesis )
        {
        // InternalGumboParser.g:4340:6: ( () Enum LeftParenthesis )
        // InternalGumboParser.g:4341:6: () Enum LeftParenthesis
        {
        // InternalGumboParser.g:4341:6: ()
        // InternalGumboParser.g:4342:6: 
        {
        }

        match(input,Enum,FollowSets000.FOLLOW_71); if (state.failed) return ;
        match(input,LeftParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalGumboParser

    // $ANTLR start synpred2_InternalGumboParser
    public final void synpred2_InternalGumboParser_fragment() throws RecognitionException {   
        // InternalGumboParser.g:4409:5: ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )
        // InternalGumboParser.g:4409:6: ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign )
        {
        // InternalGumboParser.g:4409:6: ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign )
        // InternalGumboParser.g:4410:6: () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign
        {
        // InternalGumboParser.g:4410:6: ()
        // InternalGumboParser.g:4411:6: 
        {
        }

        // InternalGumboParser.g:4412:6: ( ( ruleDataElement ) )
        // InternalGumboParser.g:4413:7: ( ruleDataElement )
        {
        // InternalGumboParser.g:4413:7: ( ruleDataElement )
        // InternalGumboParser.g:4414:8: ruleDataElement
        {
        pushFollow(FollowSets000.FOLLOW_48);
        ruleDataElement();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,LeftCurlyBracket,FollowSets000.FOLLOW_10); if (state.failed) return ;
        // InternalGumboParser.g:4418:6: ( ( RULE_ID ) )
        // InternalGumboParser.g:4419:7: ( RULE_ID )
        {
        // InternalGumboParser.g:4419:7: ( RULE_ID )
        // InternalGumboParser.g:4420:8: RULE_ID
        {
        match(input,RULE_ID,FollowSets000.FOLLOW_73); if (state.failed) return ;

        }


        }

        match(input,EqualsSign,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalGumboParser

    // Delegated rules

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


    protected DFA95 dfa95 = new DFA95(this);
    protected DFA123 dfa123 = new DFA123(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\4\uffff\1\11\7\uffff\1\11\2\uffff";
    static final String dfa_3s = "\1\47\3\uffff\1\13\3\uffff\1\155\1\uffff\1\26\1\uffff\1\13\1\26\1\uffff";
    static final String dfa_4s = "\1\155\3\uffff\1\155\3\uffff\1\155\1\uffff\1\155\1\uffff\2\155\1\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\7\1\10\1\uffff\1\5\1\uffff\1\4\2\uffff\1\4";
    static final String dfa_6s = "\1\0\3\uffff\1\1\10\uffff\1\2\1\uffff}>";
    static final String[] dfa_7s = {
            "\1\3\6\uffff\1\6\16\uffff\1\5\12\uffff\2\1\3\uffff\1\7\4\uffff\2\1\2\uffff\1\2\1\uffff\2\2\6\uffff\6\1\7\uffff\1\4",
            "",
            "",
            "",
            "\1\11\2\uffff\2\11\3\uffff\1\11\2\uffff\3\11\5\uffff\1\11\1\uffff\1\11\1\uffff\2\11\1\uffff\1\11\2\uffff\2\11\2\uffff\1\11\4\uffff\3\11\1\13\1\11\1\uffff\4\11\2\uffff\6\11\1\10\2\11\1\uffff\1\11\2\uffff\1\11\2\uffff\1\12\1\11\3\uffff\1\11\13\uffff\1\11\16\uffff\1\11",
            "",
            "",
            "",
            "\1\14",
            "",
            "\3\11\5\uffff\1\11\3\uffff\1\11\2\uffff\1\11\2\uffff\2\11\7\uffff\2\11\6\uffff\2\11\23\uffff\1\11\36\uffff\1\15",
            "",
            "\1\11\2\uffff\2\11\3\uffff\1\11\2\uffff\3\11\5\uffff\1\11\1\uffff\1\11\1\uffff\2\11\1\uffff\1\11\2\uffff\2\11\2\uffff\1\11\4\uffff\3\11\1\uffff\1\11\1\uffff\4\11\2\uffff\11\11\1\uffff\1\11\2\uffff\1\11\2\uffff\1\12\1\11\3\uffff\1\11\13\uffff\1\11\16\uffff\1\11",
            "\3\11\5\uffff\1\11\3\uffff\1\11\5\uffff\2\11\7\uffff\2\11\2\uffff\1\11\3\uffff\2\11\11\uffff\1\11\1\uffff\1\16\7\uffff\1\11\16\uffff\1\11\17\uffff\1\11",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA95 extends DFA {

        public DFA95(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 95;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "4279:2: ( ( () ( (lv_lit_1_0= ruleSlangLit ) ) ) | ( () ( (lv_i_3_0= ruleSlangInterp ) ) ) | ( ( ( ( () Enum LeftParenthesis ) )=> ( () otherlv_5= Enum otherlv_6= LeftParenthesis ) ) ( (lv_enumType_7_0= ruleDataElement ) ) otherlv_8= Comma ( (otherlv_9= RULE_ID ) ) otherlv_10= RightParenthesis ) | ( ( ( ( () ( ( ruleDataElement ) ) LeftCurlyBracket ( ( RULE_ID ) ) EqualsSign ) )=> ( () ( (lv_recordType_12_0= ruleDataElement ) ) otherlv_13= LeftCurlyBracket ( (otherlv_14= RULE_ID ) ) otherlv_15= EqualsSign ) ) ( (lv_argExpr_16_0= ruleExpr ) ) (otherlv_17= Semicolon ( (otherlv_18= RULE_ID ) ) otherlv_19= EqualsSign ( (lv_argExpr_20_0= ruleExpr ) ) )* otherlv_21= RightCurlyBracket ) | ( () ( (otherlv_23= RULE_ID ) ) (otherlv_24= FullStop ( (lv_ref_25_0= ruleOtherDataRef ) ) )? ( (lv_cs_26_0= ruleSlangCallSuffix ) )? ) | ( () otherlv_28= LeftParenthesis ( (lv_e_29_0= ruleExpr ) ) (otherlv_30= Comma ( (lv_e_31_0= ruleExpr ) ) )* otherlv_32= RightParenthesis ) | ( () otherlv_34= For ( (lv_r_35_0= ruleSlangForRange ) ) (otherlv_36= Comma ( (lv_r_37_0= ruleSlangForRange ) ) )* otherlv_38= Yield ( ( (lv_b_39_0= ruleSlangBlock ) ) | (otherlv_40= LeftParenthesis ( (lv_e_41_0= ruleExpr ) ) otherlv_42= RightParenthesis ) ) ) | ( () otherlv_44= LeftCurlyBracket ( ( ( ( (lv_p_45_0= ruleSlangParams ) ) otherlv_46= EqualsSignGreaterThanSign )? ( (lv_e_47_0= ruleExpr ) ) otherlv_48= RightCurlyBracket ) | ( ( (lv_stmt_49_0= ruleSlangStmt ) )* ( (lv_r_50_0= ruleSlangRet ) )? otherlv_51= RightCurlyBracket ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA95_0 = input.LA(1);

                         
                        int index95_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA95_0>=F && LA95_0<=T)||(LA95_0>=RULE_SLANG_STRING && LA95_0<=RULE_MSTRING)||(LA95_0>=RULE_HEX && LA95_0<=RULE_REAL_IDF)) ) {s = 1;}

                        else if ( (LA95_0==RULE_MSP||(LA95_0>=RULE_SLI && LA95_0<=RULE_MSPB)) ) {s = 2;}

                        else if ( (LA95_0==Enum) && (synpred1_InternalGumboParser())) {s = 3;}

                        else if ( (LA95_0==RULE_ID) ) {s = 4;}

                        else if ( (LA95_0==LeftParenthesis) ) {s = 5;}

                        else if ( (LA95_0==For) ) {s = 6;}

                        else if ( (LA95_0==LeftCurlyBracket) ) {s = 7;}

                         
                        input.seek(index95_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA95_4 = input.LA(1);

                         
                        int index95_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA95_4==FullStop) ) {s = 8;}

                        else if ( (LA95_4==EOF||LA95_4==Invariant||(LA95_4>=Modifies && LA95_4<=Requires)||LA95_4==Ensures||(LA95_4>=Assert && LA95_4<=Return)||LA95_4==Match||LA95_4==Reads||(LA95_4>=While && LA95_4<=Yield)||LA95_4==Case||(LA95_4>=Halt && LA95_4<=Spec)||LA95_4==FullStopFullStopLessThanSign||(LA95_4>=Val && LA95_4<=FullStopFullStop)||LA95_4==ColonEqualsSign||(LA95_4>=EqualsSignGreaterThanSign && LA95_4<=If)||(LA95_4>=LeftParenthesis && LA95_4<=HyphenMinus)||(LA95_4>=Colon && LA95_4<=Semicolon)||LA95_4==QuestionMark||LA95_4==LeftSquareBracket||LA95_4==RightCurlyBracket||LA95_4==RULE_SLANG_STRING||LA95_4==RULE_OP||LA95_4==RULE_ID) ) {s = 9;}

                        else if ( (LA95_4==LeftCurlyBracket) ) {s = 10;}

                        else if ( (LA95_4==ColonColon) && (synpred2_InternalGumboParser())) {s = 11;}

                         
                        input.seek(index95_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA95_13 = input.LA(1);

                         
                        int index95_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA95_13>=Assert && LA95_13<=Return)||LA95_13==Match||LA95_13==While||(LA95_13>=Halt && LA95_13<=Spec)||(LA95_13>=Val && LA95_13<=Var)||LA95_13==ColonEqualsSign||(LA95_13>=Do && LA95_13<=If)||LA95_13==Colon||LA95_13==RightCurlyBracket||LA95_13==RULE_DEFOP||LA95_13==RULE_ID) ) {s = 9;}

                        else if ( (LA95_13==EqualsSign) && (synpred2_InternalGumboParser())) {s = 14;}

                         
                        input.seek(index95_13);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 95, _s, input);
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

    class DFA123 extends DFA {

        public DFA123(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 123;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "6463:2: (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm )";
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
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0xA000409004000000L,0x0000203F434DA305L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800400L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800402L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000400L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000408L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000200000000002L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0xA001429006200000L,0x0000203F434DA305L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000410L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000000002L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0020020000000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x4000000000000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0080000000000000L,0x0000200000000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x8000000000000002L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0001000000000000L,0x0000200000000000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000802L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000000210008C002L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x000000000008C002L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000084002L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000088002L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000004800L,0x0000000000002000L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000002000000000L,0x0000000000004000L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0020000000000002L,0x0000000020000010L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0400000000000000L,0x0000000000002000L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x2000000000000000L,0x0000200000000000L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0480000000000000L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0606030440C00002L,0x0000200000000000L});
        public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x2000000000000002L});
        public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x2000000000000000L,0x0000200000001000L});
        public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x2000000000000002L,0x0000000000000010L});
        public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
        public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0020000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_64 = new BitSet(new long[]{0xA000409004000002L,0x0000203F434DA385L});
        public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x2000408000000000L,0x0000203F034C2300L});
        public static final BitSet FOLLOW_66 = new BitSet(new long[]{0xA000409004000002L,0x0000203F434DA305L});
        public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0080000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0008100000000002L});
        public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0606030441C00000L,0x0000200000004000L});
        public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
        public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
        public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004020L});
        public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x2000000000000002L,0x0000000000000408L});
        public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x2000000000000002L,0x0000000000000400L});
        public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x2000000000000000L,0x0000000000002000L});
        public static final BitSet FOLLOW_79 = new BitSet(new long[]{0xA606439445C00000L,0x0000203F434DE305L});
        public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0004000000000000L,0x0000200000000000L});
        public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0100000000000002L});
        public static final BitSet FOLLOW_82 = new BitSet(new long[]{0xE000409004000000L,0x0000203F434DA305L});
        public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0020000000000002L});
        public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x000000000C000000L});
        public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0080080000000000L});
        public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x2000040010043020L,0x0000301400000405L});
        public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0800000000010000L,0x0000000000000022L});
        public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000022L});
        public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0800000000000002L});
        public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000800L});
        public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x6000040010043020L,0x0000301400000405L});
        public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
        public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000800L});
        public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
        public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000000L,0x0000201400000005L});
        public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
        public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0010000000000002L});
        public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0010000000000000L});
    }


}